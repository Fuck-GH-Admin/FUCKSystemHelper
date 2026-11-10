# Java decompilation gaps

This enumerates markers in normal JADX Java output; CLI reported 6 decompilation errors, but error count need not equal marker count.
Smali is the authoritative reference for code that could not be decompiled.

- Normal Java files: 585
- Fallback files: 586
- Method failure/error markers: 15 (12 method stubs plus 3 JADX ERROR comments)
- Restructure-warning markers: 9
- Normal-mode paths with no same-path fallback: 0
- **Host package** `com.mobiletools.systemhelper`: exactly one failed normal-mode method stub found, `SIMStateReceiver.onReceive`; fallback and Smali available. Most other failed methods belong to bundled support or obfuscated third-party libraries.

## Failure locations

- `decompiled/jadx/sources/a/a/a/b/h.java:206` — `throw new UnsupportedOperationException("Method not decompiled: a.a.a.b.h.c.a(boolean):void");`
- `decompiled/jadx/sources/a/a/a/b/l.java:99` — `throw new UnsupportedOperationException("Method not decompiled: a.a.a.b.l.a.a(boolean):void");`
- `decompiled/jadx/sources/a/a/a/b/m.java:161` — `throw new UnsupportedOperationException("Method not decompiled: a.a.a.b.m.c.a(boolean):void");`
- `decompiled/jadx/sources/a/a/a/d/i.java:778` — `throw new UnsupportedOperationException("Method not decompiled: a.a.a.d.i.m.a(boolean):void");`
- `decompiled/jadx/sources/a/a/a/g/d.java:792` — `throw new UnsupportedOperationException("Method not decompiled: a.a.a.g.d.a(android.location.Location, int):void");`
- `decompiled/jadx/sources/a/a/a/g/k.java:75` — `/*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor`
- `decompiled/jadx/sources/a/a/a/g/k.java:135` — `throw new UnsupportedOperationException("Method not decompiled: a.a.a.g.k.d():void");`
- `decompiled/jadx/sources/android/support/constraint/n/b.java:460` — `/*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor`
- `decompiled/jadx/sources/android/support/constraint/n/b.java:474` — `throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.n.b.d():java.lang.String");`
- `decompiled/jadx/sources/android/support/constraint/n/k/e.java:1471` — `/*  JADX ERROR: Type inference failed`
- `decompiled/jadx/sources/android/support/constraint/n/k/e.java:1483` — `throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.n.k.e.a(android.support.constraint.n.d, boolean):void");`
- `decompiled/jadx/sources/android/support/constraint/n/k/m/l.java:411` — `throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.n.k.m.l.a(android.support.constraint.n.k.m.d):void");`
- `decompiled/jadx/sources/android/support/constraint/n/k/m/n.java:68` — `throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.n.k.m.n.a():void");`
- `decompiled/jadx/sources/android/support/v4/graphics/drawable/IconCompat.java:279` — `throw new UnsupportedOperationException("Method not decompiled: android.support.v4.graphics.drawable.IconCompat.toString():java.lang.String");`
- `decompiled/jadx/sources/com/mobiletools/systemhelper/control/SIMStateReceiver.java:115` — `throw new UnsupportedOperationException("Method not decompiled: com.mobiletools.systemhelper.control.SIMStateReceiver.onReceive(android.content.Context, android.content.Intent):void");`

## Control-flow restructuring warning locations (may be repetitive)

- `decompiled/jadx/sources/a/a/a/b/h.java:198`
- `decompiled/jadx/sources/a/a/a/b/l.java:91`
- `decompiled/jadx/sources/a/a/a/b/m.java:153`
- `decompiled/jadx/sources/a/a/a/d/i.java:770`
- `decompiled/jadx/sources/a/a/a/g/d.java:784`
- `decompiled/jadx/sources/android/support/constraint/n/k/m/l.java:403`
- `decompiled/jadx/sources/android/support/constraint/n/k/m/n.java:60`
- `decompiled/jadx/sources/android/support/v4/graphics/drawable/IconCompat.java:180`
- `decompiled/jadx/sources/com/mobiletools/systemhelper/control/SIMStateReceiver.java:44`

## Missing same-path fallback files


## Interpretation

Normal JADX failure does not mean a corresponding class is missing from bytecode: all 1,149 classes have Apktool Smali. The fallback representation is less readable and must be verified against original DEX before semantic conclusions.
