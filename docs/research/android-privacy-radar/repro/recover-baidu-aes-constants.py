#!/usr/bin/env python3
"""Recover the fixed AES key/IV string from the archived ARM64 liblocSDK8b.so.

Usage:
  python3 recover-baidu-aes-constants.py extracted/lib/arm64-v8a/liblocSDK8b.so

This verifies the ELF symbol and .rodata location used in the 2026-11-25 report.
It does not connect to any server or read any device/user data.
"""
from pathlib import Path
import struct
import sys

if len(sys.argv) != 2:
    raise SystemExit("usage: recover-baidu-aes-constants.py PATH_TO_liblocSDK8b.so")

data = Path(sys.argv[1]).read_bytes()
if data[:6] != b"\x7fELF\x02\x01":
    raise SystemExit("expected ELF64 little-endian input")

shoff = struct.unpack_from("<Q", data, 40)[0]
shentsize, shnum, shstrndx = struct.unpack_from("<HHH", data, 58)
if shentsize != 64:
    raise SystemExit(f"unexpected ELF64 section-header size: {shentsize}")

sections = []
for index in range(shnum):
    off = shoff + index * shentsize
    fields = struct.unpack_from("<IIQQQQIIQQ", data, off)
    sections.append({
        "name_offset": fields[0],
        "type": fields[1],
        "addr": fields[3],
        "offset": fields[4],
        "size": fields[5],
        "link": fields[6],
        "entsize": fields[9],
    })

shstr = sections[shstrndx]
shstr_data = data[shstr["offset"]:shstr["offset"] + shstr["size"]]

def c_string(buf: bytes, offset: int) -> str:
    end = buf.find(b"\0", offset)
    if end < 0:
        end = len(buf)
    return buf[offset:end].decode("ascii", errors="replace")

for section in sections:
    section["name"] = c_string(shstr_data, section["name_offset"])

dynsym = next((s for s in sections if s["name"] == ".dynsym"), None)
if dynsym is None:
    raise SystemExit("missing .dynsym")
dynstr = sections[dynsym["link"]]
dynstr_data = data[dynstr["offset"]:dynstr["offset"] + dynstr["size"]]
symbol = None
entry_size = dynsym["entsize"] or 24
for off in range(dynsym["offset"], dynsym["offset"] + dynsym["size"], entry_size):
    name_off, info, other, shndx, value, size = struct.unpack_from("<IBBHQQ", data, off)
    if name_off and c_string(dynstr_data, name_off) == "Java_com_baidu_location_Jni_ldkaiv":
        symbol = (value, size)
        break

if symbol != (0x21E00, 0x170):
    raise SystemExit(f"unexpected ldkaiv symbol: {symbol!r}")

rodata = next((s for s in sections if s["name"] == ".rodata"), None)
if rodata is None:
    raise SystemExit("missing .rodata")
constant_va = 0x142B0
if not (rodata["addr"] <= constant_va < rodata["addr"] + rodata["size"]):
    raise SystemExit("constant VA is outside .rodata")
file_offset = rodata["offset"] + (constant_va - rodata["addr"])

encoded = data[file_offset:file_offset + 34]
if len(encoded) != 34:
    raise SystemExit("truncated constant")
decoded = bytes(value ^ ((34 + index) & 0xFF) for index, value in enumerate(encoded))
expected = b"qsHcaEWjX0j1dGmZ|1122334455667788\0"
if decoded != expected:
    raise SystemExit("decoded bytes do not match the archived sample")

key, iv = decoded[:-1].decode("ascii").split("|")
if len(key.encode("ascii")) != 16 or len(iv.encode("ascii")) != 16:
    raise SystemExit("unexpected AES key/IV length")

print(f"JNI symbol: VA=0x{symbol[0]:x}, size=0x{symbol[1]:x}")
print(f".rodata VA=0x{constant_va:x}, file offset=0x{file_offset:x}")
print(f"raw bytes: {encoded.hex()}")
print(f"decoded: {key}|{iv}")
print(f"AES key ASCII hex: {key.encode('ascii').hex()}")
print(f"AES IV ASCII hex:  {iv.encode('ascii').hex()}")
