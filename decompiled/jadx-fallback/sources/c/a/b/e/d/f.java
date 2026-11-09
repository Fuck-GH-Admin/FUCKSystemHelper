package c.a.b.e.d;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    private static final java.util.Map h = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.security.SecureRandom f1264c;
    private final int d;
    private java.security.MessageDigest e;
    private java.security.MessageDigest f;
    private byte[] g;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            c.a.b.e.d.f.h = r0
            return
    }

    private f(int r5, int r6, java.security.SecureRandom r7, javax.crypto.spec.OAEPParameterSpec r8) {
            r4 = this;
            r4.<init>()
            r4.f1262a = r5
            r4.f1263b = r6
            r4.f1264c = r7
            r7 = 64
            if (r6 < r7) goto Lfa
            r7 = 1
            if (r5 == r7) goto Lf5
            r7 = 2
            if (r5 == r7) goto Lf5
            r0 = 3
            if (r5 == r0) goto Lf7
            r0 = 4
            if (r5 != r0) goto Lde
            r5 = 0
            java.lang.String r0 = "SHA-1"
            if (r8 == 0) goto L83
            java.lang.String r0 = r8.getDigestAlgorithm()     // Catch: java.security.NoSuchAlgorithmException -> L81
            java.lang.String r5 = r8.getMGFAlgorithm()     // Catch: java.security.NoSuchAlgorithmException -> L81
            java.lang.String r1 = "MGF1"
            boolean r1 = r5.equalsIgnoreCase(r1)     // Catch: java.security.NoSuchAlgorithmException -> L81
            if (r1 == 0) goto L6a
            java.security.spec.AlgorithmParameterSpec r5 = r8.getMGFParameters()     // Catch: java.security.NoSuchAlgorithmException -> L81
            java.security.spec.MGF1ParameterSpec r5 = (java.security.spec.MGF1ParameterSpec) r5     // Catch: java.security.NoSuchAlgorithmException -> L81
            java.lang.String r5 = r5.getDigestAlgorithm()     // Catch: java.security.NoSuchAlgorithmException -> L81
            javax.crypto.spec.PSource r8 = r8.getPSource()     // Catch: java.security.NoSuchAlgorithmException -> L81
            java.lang.String r1 = r8.getAlgorithm()     // Catch: java.security.NoSuchAlgorithmException -> L81
            java.lang.String r2 = "PSpecified"
            boolean r2 = r1.equalsIgnoreCase(r2)     // Catch: java.security.NoSuchAlgorithmException -> L81
            if (r2 == 0) goto L53
            javax.crypto.spec.PSource$PSpecified r8 = (javax.crypto.spec.PSource.PSpecified) r8     // Catch: java.security.NoSuchAlgorithmException -> L81
            byte[] r8 = r8.getValue()     // Catch: java.security.NoSuchAlgorithmException -> L81
            r3 = r0
            r0 = r5
            r5 = r8
            r8 = r3
            goto L84
        L53:
            java.security.InvalidAlgorithmParameterException r4 = new java.security.InvalidAlgorithmParameterException     // Catch: java.security.NoSuchAlgorithmException -> L81
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.security.NoSuchAlgorithmException -> L81
            r5.<init>()     // Catch: java.security.NoSuchAlgorithmException -> L81
            java.lang.String r6 = "Unsupported pSource algo: "
            r5.append(r6)     // Catch: java.security.NoSuchAlgorithmException -> L81
            r5.append(r1)     // Catch: java.security.NoSuchAlgorithmException -> L81
            java.lang.String r5 = r5.toString()     // Catch: java.security.NoSuchAlgorithmException -> L81
            r4.<init>(r5)     // Catch: java.security.NoSuchAlgorithmException -> L81
            throw r4     // Catch: java.security.NoSuchAlgorithmException -> L81
        L6a:
            java.security.InvalidAlgorithmParameterException r4 = new java.security.InvalidAlgorithmParameterException     // Catch: java.security.NoSuchAlgorithmException -> L81
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.security.NoSuchAlgorithmException -> L81
            r6.<init>()     // Catch: java.security.NoSuchAlgorithmException -> L81
            java.lang.String r7 = "Unsupported MGF algo: "
            r6.append(r7)     // Catch: java.security.NoSuchAlgorithmException -> L81
            r6.append(r5)     // Catch: java.security.NoSuchAlgorithmException -> L81
            java.lang.String r5 = r6.toString()     // Catch: java.security.NoSuchAlgorithmException -> L81
            r4.<init>(r5)     // Catch: java.security.NoSuchAlgorithmException -> L81
            throw r4     // Catch: java.security.NoSuchAlgorithmException -> L81
        L81:
            r4 = move-exception
            goto Lc2
        L83:
            r8 = r0
        L84:
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r8)     // Catch: java.security.NoSuchAlgorithmException -> Lc0
            r4.e = r1     // Catch: java.security.NoSuchAlgorithmException -> Lc0
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> Lc0
            r4.f = r1     // Catch: java.security.NoSuchAlgorithmException -> Lc0
            java.security.MessageDigest r1 = r4.e
            byte[] r5 = a(r1, r5)
            r4.g = r5
            int r5 = r5.length
            int r6 = r6 - r7
            int r5 = r5 * r7
            int r6 = r6 - r5
            r4.d = r6
            if (r6 <= 0) goto La1
            goto Lf9
        La1:
            java.security.InvalidKeyException r4 = new java.security.InvalidKeyException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Key is too short for encryption using OAEPPadding with "
            r5.append(r6)
            r5.append(r8)
            java.lang.String r6 = " and MGF1"
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        Lc0:
            r4 = move-exception
            r0 = r8
        Lc2:
            java.security.InvalidKeyException r5 = new java.security.InvalidKeyException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Digest "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r7 = " not available"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6, r4)
            throw r5
        Lde:
            java.security.InvalidKeyException r4 = new java.security.InvalidKeyException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Invalid padding: "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
        Lf5:
            int r6 = r6 + (-11)
        Lf7:
            r4.d = r6
        Lf9:
            return
        Lfa:
            java.security.InvalidKeyException r4 = new java.security.InvalidKeyException
            java.lang.String r5 = "Padded size must be at least 64"
            r4.<init>(r5)
            throw r4
    }

    public static c.a.b.e.d.f a(int r2, int r3, java.security.SecureRandom r4) {
            c.a.b.e.d.f r0 = new c.a.b.e.d.f
            r1 = 0
            r0.<init>(r2, r3, r4, r1)
            return r0
    }

    public static c.a.b.e.d.f a(int r1, int r2, java.security.SecureRandom r3, javax.crypto.spec.OAEPParameterSpec r4) {
            c.a.b.e.d.f r0 = new c.a.b.e.d.f
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    private void a(byte[] r8, int r9, int r10, byte[] r11, int r12, int r13) {
            r7 = this;
            r0 = 4
            byte[] r0 = new byte[r0]
            r1 = 20
            byte[] r2 = new byte[r1]
        L7:
            if (r13 <= 0) goto L4a
            java.security.MessageDigest r3 = r7.f
            r3.update(r8, r9, r10)
            java.security.MessageDigest r3 = r7.f
            r3.update(r0)
            java.security.MessageDigest r3 = r7.f     // Catch: java.security.DigestException -> L3f
            r4 = 0
            r3.digest(r2, r4, r1)     // Catch: java.security.DigestException -> L3f
        L19:
            if (r4 >= r1) goto L2e
            if (r13 <= 0) goto L2e
            int r3 = r12 + 1
            r5 = r11[r12]
            int r6 = r4 + 1
            r4 = r2[r4]
            r4 = r4 ^ r5
            byte r4 = (byte) r4
            r11[r12] = r4
            int r13 = r13 + (-1)
            r12 = r3
            r4 = r6
            goto L19
        L2e:
            if (r13 <= 0) goto L7
            r3 = 3
        L31:
            r4 = r0[r3]
            int r4 = r4 + 1
            byte r4 = (byte) r4
            r0[r3] = r4
            if (r4 != 0) goto L7
            if (r3 <= 0) goto L7
            int r3 = r3 + (-1)
            goto L31
        L3f:
            r7 = move-exception
            javax.crypto.BadPaddingException r8 = new javax.crypto.BadPaddingException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        L4a:
            return
    }

    private static byte[] a(java.security.MessageDigest r1, byte[] r2) {
            if (r2 == 0) goto Lb
            int r0 = r2.length
            if (r0 != 0) goto L6
            goto Lb
        L6:
            byte[] r1 = r1.digest(r2)
            goto L24
        Lb:
            java.lang.String r2 = r1.getAlgorithm()
            java.util.Map r0 = c.a.b.e.d.f.h
            java.lang.Object r0 = r0.get(r2)
            byte[] r0 = (byte[]) r0
            if (r0 != 0) goto L23
            byte[] r1 = r1.digest()
            java.util.Map r0 = c.a.b.e.d.f.h
            r0.put(r2, r1)
            goto L24
        L23:
            r1 = r0
        L24:
            return r1
    }

    private byte[] c(byte[] r7) {
            r6 = this;
            int r0 = r6.f1263b
            byte[] r1 = new byte[r0]
            int r2 = r7.length
            int r0 = r0 - r2
            int r2 = r7.length
            r3 = 0
            java.lang.System.arraycopy(r7, r3, r1, r0, r2)
            int r0 = r6.f1263b
            int r0 = r0 + (-3)
            int r7 = r7.length
            int r0 = r0 - r7
            r1[r3] = r3
            int r7 = r6.f1262a
            byte r2 = (byte) r7
            r3 = 1
            r1[r3] = r2
            r2 = -1
            r4 = 2
            if (r7 != r3) goto L28
        L1d:
            int r6 = r0 + (-1)
            if (r0 <= 0) goto L54
            int r7 = r4 + 1
            r1[r4] = r2
            r0 = r6
            r4 = r7
            goto L1d
        L28:
            java.security.SecureRandom r7 = r6.f1264c
            if (r7 != 0) goto L30
            java.security.SecureRandom r7 = c.a.b.e.d.b.f1256a
            r6.f1264c = r7
        L30:
            r7 = 64
            byte[] r7 = new byte[r7]
        L34:
            int r3 = r0 + (-1)
            if (r0 <= 0) goto L54
        L38:
            if (r2 >= 0) goto L41
            java.security.SecureRandom r0 = r6.f1264c
            r0.nextBytes(r7)
            r2 = 63
        L41:
            int r0 = r2 + (-1)
            r2 = r7[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            if (r2 == 0) goto L52
            int r5 = r4 + 1
            byte r2 = (byte) r2
            r1[r4] = r2
            r2 = r0
            r0 = r3
            r4 = r5
            goto L34
        L52:
            r2 = r0
            goto L38
        L54:
            return r1
    }

    private byte[] d(byte[] r7) {
            r6 = this;
            r0 = 0
            r1 = r7[r0]
            if (r1 != 0) goto L70
            r1 = 2
            r2 = 1
            r3 = r7[r2]
            int r4 = r6.f1262a
            if (r3 != r4) goto L57
        Ld:
            int r3 = r1 + 1
            r1 = r7[r1]
            r4 = 255(0xff, float:3.57E-43)
            r1 = r1 & r4
            if (r1 != 0) goto L2c
            int r1 = r7.length
            int r1 = r1 - r3
            int r6 = r6.d
            if (r1 > r6) goto L24
            byte[] r6 = new byte[r1]
            int r2 = r7.length
            int r2 = r2 - r1
            java.lang.System.arraycopy(r7, r2, r6, r0, r1)
            return r6
        L24:
            javax.crypto.BadPaddingException r6 = new javax.crypto.BadPaddingException
            java.lang.String r7 = "Padding string too short"
            r6.<init>(r7)
            throw r6
        L2c:
            int r5 = r7.length
            if (r3 == r5) goto L4f
            int r5 = r6.f1262a
            if (r5 != r2) goto L4d
            if (r1 != r4) goto L36
            goto L4d
        L36:
            javax.crypto.BadPaddingException r6 = new javax.crypto.BadPaddingException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Padding byte not 0xff: "
            r7.append(r0)
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L4d:
            r1 = r3
            goto Ld
        L4f:
            javax.crypto.BadPaddingException r6 = new javax.crypto.BadPaddingException
            java.lang.String r7 = "Padding string not terminated"
            r6.<init>(r7)
            throw r6
        L57:
            javax.crypto.BadPaddingException r6 = new javax.crypto.BadPaddingException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Blocktype mismatch: "
            r0.append(r1)
            r7 = r7[r2]
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7)
            throw r6
        L70:
            javax.crypto.BadPaddingException r6 = new javax.crypto.BadPaddingException
            java.lang.String r7 = "Data must start with zero"
            r6.<init>(r7)
            throw r6
    }

    private byte[] e(byte[] r12) {
            r11 = this;
            java.security.SecureRandom r0 = r11.f1264c
            if (r0 != 0) goto L8
            java.security.SecureRandom r0 = c.a.b.e.d.b.f1256a
            r11.f1264c = r0
        L8:
            byte[] r0 = r11.g
            int r0 = r0.length
            byte[] r1 = new byte[r0]
            java.security.SecureRandom r2 = r11.f1264c
            r2.nextBytes(r1)
            int r2 = r11.f1263b
            byte[] r8 = new byte[r2]
            r3 = 0
            r4 = 1
            java.lang.System.arraycopy(r1, r3, r8, r4, r0)
            int r9 = r0 + 1
            int r10 = r2 - r9
            int r1 = r11.f1263b
            int r2 = r12.length
            int r1 = r1 - r2
            byte[] r2 = r11.g
            java.lang.System.arraycopy(r2, r3, r8, r9, r0)
            int r2 = r1 + (-1)
            r8[r2] = r4
            int r2 = r12.length
            java.lang.System.arraycopy(r12, r3, r8, r1, r2)
            r3 = 1
            r1 = r11
            r2 = r8
            r4 = r0
            r5 = r8
            r6 = r9
            r7 = r10
            r1.a(r2, r3, r4, r5, r6, r7)
            r6 = 1
            r3 = r9
            r4 = r10
            r7 = r0
            r1.a(r2, r3, r4, r5, r6, r7)
            return r8
    }

    private byte[] f(byte[] r12) {
            r11 = this;
            byte[] r0 = r11.g
            int r0 = r0.length
            r8 = 0
            r1 = r12[r8]
            if (r1 != 0) goto L60
            int r9 = r0 + 1
            int r1 = r12.length
            int r10 = r1 - r9
            r6 = 1
            r1 = r11
            r2 = r12
            r3 = r9
            r4 = r10
            r5 = r12
            r7 = r0
            r1.a(r2, r3, r4, r5, r6, r7)
            r3 = 1
            r4 = r0
            r6 = r9
            r7 = r10
            r1.a(r2, r3, r4, r5, r6, r7)
            r1 = r8
        L1f:
            if (r1 >= r0) goto L36
            byte[] r2 = r11.g
            r2 = r2[r1]
            int r3 = r9 + r1
            r3 = r12[r3]
            if (r2 != r3) goto L2e
            int r1 = r1 + 1
            goto L1f
        L2e:
            javax.crypto.BadPaddingException r11 = new javax.crypto.BadPaddingException
            java.lang.String r12 = "lHash mismatch"
            r11.<init>(r12)
            throw r11
        L36:
            int r9 = r9 + r0
        L37:
            r11 = r12[r9]
            if (r11 != 0) goto L49
            int r9 = r9 + 1
            int r11 = r12.length
            if (r9 >= r11) goto L41
            goto L37
        L41:
            javax.crypto.BadPaddingException r11 = new javax.crypto.BadPaddingException
            java.lang.String r12 = "Padding string not terminated"
            r11.<init>(r12)
            throw r11
        L49:
            int r11 = r9 + 1
            r0 = r12[r9]
            r1 = 1
            if (r0 != r1) goto L58
            int r0 = r12.length
            int r0 = r0 - r11
            byte[] r1 = new byte[r0]
            java.lang.System.arraycopy(r12, r11, r1, r8, r0)
            return r1
        L58:
            javax.crypto.BadPaddingException r11 = new javax.crypto.BadPaddingException
            java.lang.String r12 = "Padding string not terminated by 0x01 byte"
            r11.<init>(r12)
            throw r11
        L60:
            javax.crypto.BadPaddingException r11 = new javax.crypto.BadPaddingException
            java.lang.String r12 = "Data must start with zero"
            r11.<init>(r12)
            throw r11
    }

    public int a() {
            r0 = this;
            int r0 = r0.d
            return r0
    }

    public byte[] a(byte[] r4) {
            r3 = this;
            int r0 = r4.length
            int r1 = r3.d
            r2 = 1
            if (r0 > r1) goto L24
            int r0 = r3.f1262a
            if (r0 == r2) goto L1f
            r1 = 2
            if (r0 == r1) goto L1f
            r1 = 3
            if (r0 == r1) goto L1e
            r1 = 4
            if (r0 != r1) goto L18
            byte[] r3 = r3.e(r4)
            return r3
        L18:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>()
            throw r3
        L1e:
            return r4
        L1f:
            byte[] r3 = r3.c(r4)
            return r3
        L24:
            javax.crypto.BadPaddingException r4 = new javax.crypto.BadPaddingException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Data must be shorter than "
            r0.append(r1)
            int r3 = r3.d
            int r3 = r3 + r2
            r0.append(r3)
            java.lang.String r3 = " bytes"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    public byte[] a(byte[] r1, int r2, int r3) {
            r0 = this;
            byte[] r1 = c.a.b.e.d.b.a(r1, r2, r3)
            byte[] r0 = r0.a(r1)
            return r0
    }

    public byte[] b(byte[] r3) {
            r2 = this;
            int r0 = r3.length
            int r1 = r2.f1263b
            if (r0 != r1) goto L24
            int r0 = r2.f1262a
            r1 = 1
            if (r0 == r1) goto L1f
            r1 = 2
            if (r0 == r1) goto L1f
            r1 = 3
            if (r0 == r1) goto L1e
            r1 = 4
            if (r0 != r1) goto L18
            byte[] r2 = r2.f(r3)
            return r2
        L18:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        L1e:
            return r3
        L1f:
            byte[] r2 = r2.d(r3)
            return r2
        L24:
            javax.crypto.BadPaddingException r3 = new javax.crypto.BadPaddingException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Padded length must be "
            r0.append(r1)
            int r2 = r2.f1263b
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
    }
}
