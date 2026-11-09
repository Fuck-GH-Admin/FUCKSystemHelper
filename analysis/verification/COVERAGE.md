# Analysis coverage and signature verification

This is an offline static reconstruction of the supplied APK, not a claim of recovered original source code or actual device behavior.

## Original Dalvik structures

```json
{
  "classes": 1149,
  "all_method_refs": 12113,
  "defined_methods": 8767,
  "methods_with_code": 8308,
  "string_count": 10476,
  "field_count": 7543,
  "xref_count": 86395,
  "instructions_units": 344320,
  "disassembly_files": 1004
}
```

## Generated decompilation outputs

- Smali: 1149 files
- JADX Java: 585 files
- JADX fallback: 586 files
- AArch64 asm: 2 files

## Tool status and error transparency

- apktool: exit code 0 (see decompiled/logs/apktool.log)
- jadx: exit code 3 (see decompiled/logs/jadx.log)
- jadx-fallback: exit code 0 (see decompiled/logs/jadx-fallback.log)

## APK signature verification

See [apksigner.txt](apksigner.txt) for the platform signature digest and certificate verification output, if the Android tool was available.
This only verifies cryptographic integrity and declared certificates; it does not prove that a particular Vivo device shipped the sample.

## Missing

No live-device privilege confirmation, observed server responses, runtime hook traces, native symbolic execution, or exhaustive control-flow equivalence proof.
JADX is lossy; raw APK and Apktool smali remain the audit baseline.
