#!/usr/bin/env python3
"""Extract APK Signing Block certificate metadata (not signature verification)."""
from pathlib import Path
import struct,zipfile,hashlib,json
from cryptography import x509
from cryptography.hazmat.primitives.serialization import Encoding
R=Path(__file__).resolve().parents[1];apk=(R/'original/SystemHelper.apk').read_bytes()

def u32(x,p):return struct.unpack_from('<I',x,p)[0]
def u64(x,p):return struct.unpack_from('<Q',x,p)[0]
def lp(d,p):
 if p+4>len(d):raise ValueError('length missing')
 n=u32(d,p);end=p+4+n
 if end>len(d):raise ValueError('length out of bounds')
 return d[p+4:end],end

def sequence(data):
 p=0;xs=[]
 while p<len(data):
  b,p=lp(data,p);xs.append(b)
 return xs

eocd=apk.rfind(b'PK\x05\x06')
assert eocd>=0
central_dir=u32(apk,eocd+16)
footer=apk[central_dir-24:central_dir]
assert footer[-16:]==b'APK Sig Block 42'
size2=u64(footer,0)
block_start=central_dir-(size2+8)
size1=u64(apk,block_start)
assert size1==size2
p=block_start+8; pairs=[];certs=[]
while p<central_dir-24:
 plen=u64(apk,p);pair=apk[p+8:p+8+plen];p+=8+plen
 pairid=u32(pair,0);data=pair[4:]
 v='v2' if pairid==0x7109871a else 'v3' if pairid==0xf05368c0 else f'unknown_0x{pairid:x}'
 pairs.append({'id':hex(pairid),'type':v,'length':len(data)})
 if v not in ('v2','v3'):continue
 try:
  signers=sequence(lp(data,0)[0])
  for si,s in enumerate(signers):
   signed,end=lp(s,0)
   certseq=sequence(lp(signed, len(lp(signed,0)[0])+4)[0]);chain=[]
   for ci,der in enumerate(certseq):
    c=x509.load_der_x509_certificate(der)
    name=f'{v}-signer{si}-cert{ci}.der'
    out=R/'decoded/signing_certificates';out.mkdir(parents=True,exist_ok=True);(out/name).write_bytes(der)
    chain.append({'file':name,'subject':c.subject.rfc4514_string(),'issuer':c.issuer.rfc4514_string(),'sha256':hashlib.sha256(der).hexdigest(),'sha1':hashlib.sha1(der).hexdigest(),'valid_from':c.not_valid_before_utc.isoformat(),'valid_to':c.not_valid_after_utc.isoformat()})
   certs.append({'scheme':v,'signer_index':si,'certificates':chain})
 except Exception as e:pairs[-1]['parse_error']=str(e)
result={'apk_sha256':hashlib.sha256(apk).hexdigest(),'apk_size':len(apk),'signing_block_start':block_start,'scheme_pairs':pairs,'certificates':certs,'note':'Certificates were extracted, NOT independently verified as cryptographically valid against APK contents.'}
(R/'decoded/signing-metadata.json').write_text(json.dumps(result,indent=2,ensure_ascii=False))
print(json.dumps(result,indent=2,ensure_ascii=False))
