#!/usr/bin/env python3
"""Offline v3 APK signing verification (content SHA-256 and RSA signatures).

Reads only original/SystemHelper.apk; no network or device required.
Requires 'cryptography'. Runs independent of apksigner to inspect both
SDK-ranged v3 signers in this sample. This is not a general-purpose apksig verifier.
"""
import hashlib
import json
import struct
from pathlib import Path
from cryptography import x509
from cryptography.hazmat.primitives import hashes
from cryptography.hazmat.primitives.asymmetric import padding
from cryptography.hazmat.primitives.serialization import Encoding, PublicFormat

APK = Path(__file__).resolve().parents[1] / "original/SystemHelper.apk"
OUT = Path(__file__).resolve().parents[1] / "analysis/verification/v3-independent.json"


def u32(b, i):
    return struct.unpack_from("<I", b, i)[0]


def u64(b, i):
    return struct.unpack_from("<Q", b, i)[0]


def lp(b, i):
    n = u32(b, i)
    assert 4 + i + n <= len(b), "Bad length-delimited section"
    return b[i + 4:i + 4 + n], i + 4 + n


def seq(b):
    i = 0
    while i < len(b):
        item, i = lp(b, i)
        yield item
    assert i == len(b)


data = APK.read_bytes()
eocd = data.rfind(b"PK\x05\x06")
assert eocd > 0
cd = u32(data, eocd + 16)
assert data[cd - 16:cd] == b"APK Sig Block 42"
block_start = cd - (u64(data, cd - 24) + 8)
assert u64(data, block_start) == u64(data, cd - 24)
sections = [
    data[:block_start],
    data[cd:eocd],
    data[eocd:eocd + 16] + struct.pack("<I", block_start) + data[eocd + 20:],
]
chunks = []
for section in sections:
    for i in range(0, len(section), 1024 * 1024):
        chunk = section[i:i + 1024 * 1024]
        chunks.append(hashlib.sha256(b"\xa5" + struct.pack("<I", len(chunk)) + chunk).digest())
content_digest = hashlib.sha256(
    b"\x5a" + struct.pack("<I", len(chunks)) + b"".join(chunks)
).digest()
found = []
p = block_start + 8
while p < cd - 24:
    n = u64(data, p)
    entry = data[p + 8:p + 8 + n]
    p += 8 + n
    if u32(entry, 0) != 0xF05368C0:
        continue
    signer_collection, _ = lp(entry, 4)
    for idx, signer in enumerate(seq(signer_collection)):
        signed_data, q = lp(signer, 0)
        min_api, max_api = u32(signer, q), u32(signer, q + 4)
        signatures, q = lp(signer, q + 8)
        pub_der, q = lp(signer, q)
        assert q == len(signer)
        digest_records, q = lp(signed_data, 0)
        certs, q = lp(signed_data, q)
        assert (u32(signed_data, q), u32(signed_data, q + 4)) == (min_api, max_api)
        cert_der = next(seq(certs))
        cert = x509.load_der_x509_certificate(cert_der)
        assert pub_der == cert.public_key().public_bytes(Encoding.DER, PublicFormat.SubjectPublicKeyInfo)
        for record in seq(digest_records):
            alg = u32(record, 0)
            expected, _ = lp(record, 4)
            assert alg == 0x103, f"Unrecognized content digest algorithm: {alg:#x}"
            assert expected == content_digest, "APK content digest mismatch"
        for record in seq(signatures):
            alg = u32(record, 0)
            signature, _ = lp(record, 4)
            assert alg == 0x103, f"Unrecognized signing algorithm: {alg:#x}"
            cert.public_key().verify(signature, signed_data, padding.PKCS1v15(), hashes.SHA256())
        found.append(dict(index=idx, sdk_min=min_api, sdk_max=max_api,
                          certificate_subject=cert.subject.rfc4514_string(),
                          certificate_sha256=hashlib.sha256(cert_der).hexdigest(),
                          signature_algorithm="RSA PKCS1v1.5 SHA256",
                          signed_data_signature_valid=True,
                          apk_content_digest_matches=True))
assert len(found) == 2, f"Expected two v3 signers in this sample; found {len(found)}"
receipt = dict(
    apk_sha256=hashlib.sha256(data).hexdigest(),
    apk_size=len(data),
    apk_content_digest_sha256=content_digest.hex(),
    chunk_count=len(chunks),
    signers=found,
    note="Valid signatures indicate APK integrity under included public keys; independent OEM chain identity and installed device privilege remain unproven."
)
OUT.parent.mkdir(parents=True, exist_ok=True)
OUT.write_text(json.dumps(receipt, ensure_ascii=False, indent=2) + "\n", encoding="utf-8")
print(json.dumps(receipt, ensure_ascii=False, indent=2))
