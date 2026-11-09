package c.a.b.e.a;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f1239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1241c;
    private int d;
    private int e;
    private c.a.b.e.a.i f;
    private c.a.b.e.a.f g;
    private int h;
    private boolean i;

    public e(c.a.b.e.a.b r3, int r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f1239a = r0
            r1 = 0
            r2.f1240b = r1
            r2.f1241c = r1
            r2.d = r1
            r2.e = r1
            r2.f = r0
            r2.g = r0
            r0 = 1
            r2.h = r0
            r2.i = r1
            r2.f1240b = r4
            r2.f1241c = r4
            r2.e = r4
            int r4 = r4 * 2
            byte[] r4 = new byte[r4]
            r2.f1239a = r4
            c.a.b.e.a.d r4 = new c.a.b.e.a.d
            r4.<init>(r3)
            r2.g = r4
            c.a.b.e.a.h r3 = new c.a.b.e.a.h
            int r4 = r2.f1240b
            r3.<init>(r4)
            r2.f = r3
            return
    }

    private int a(byte[] r9, int r10, byte[] r11, int r12, int r13) {
            r8 = this;
            if (r9 == 0) goto L6f
            if (r13 != 0) goto L6
            goto L6f
        L6:
            int r0 = r8.h
            r1 = 2
            if (r0 == r1) goto L55
            r1 = 3
            if (r0 == r1) goto L55
            int r1 = r8.f1241c
            int r1 = r13 % r1
            if (r1 == 0) goto L55
            r1 = 6
            if (r0 == r1) goto L55
            c.a.b.e.a.i r9 = r8.f
            java.lang.String r10 = " bytes"
            if (r9 == 0) goto L39
            javax.crypto.IllegalBlockSizeException r9 = new javax.crypto.IllegalBlockSizeException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Input length (with padding) not multiple of "
            r11.append(r12)
            int r8 = r8.f1241c
            r11.append(r8)
            r11.append(r10)
            java.lang.String r8 = r11.toString()
            r9.<init>(r8)
            throw r9
        L39:
            javax.crypto.IllegalBlockSizeException r9 = new javax.crypto.IllegalBlockSizeException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Input length not multiple of "
            r11.append(r12)
            int r8 = r8.f1241c
            r11.append(r8)
            r11.append(r10)
            java.lang.String r8 = r11.toString()
            r9.<init>(r8)
            throw r9
        L55:
            boolean r0 = r8.i
            if (r0 == 0) goto L64
            c.a.b.e.a.f r1 = r8.g
            r2 = r9
            r3 = r10
            r4 = r13
            r5 = r11
            r6 = r12
            r1.d(r2, r3, r4, r5, r6)
            goto L6e
        L64:
            c.a.b.e.a.f r2 = r8.g
            r3 = r9
            r4 = r10
            r5 = r13
            r6 = r11
            r7 = r12
            r2.c(r3, r4, r5, r6, r7)
        L6e:
            return r13
        L6f:
            r8 = 0
            return r8
    }

    int a(int r4) {
            r3 = this;
            int r0 = r3.d
            int r0 = r0 + r4
            c.a.b.e.a.i r4 = r3.f
            if (r4 != 0) goto L8
            return r0
        L8:
            boolean r1 = r3.i
            if (r1 == 0) goto Ld
            return r0
        Ld:
            int r1 = r3.f1241c
            int r2 = r3.f1240b
            if (r1 == r2) goto L1e
            int r3 = r3.e
            if (r0 >= r3) goto L18
            return r3
        L18:
            int r4 = r0 + r2
            int r0 = r0 - r3
            int r0 = r0 % r2
            int r4 = r4 - r0
            return r4
        L1e:
            int r3 = r4.a(r0)
            int r0 = r0 + r3
            return r0
    }

    int a(byte[] r16, int r17, int r18, byte[] r19, int r20) {
            r15 = this;
            r6 = r15
            r0 = r18
            r7 = r19
            int r1 = r6.d
            int r5 = r1 + r0
            int r1 = r6.f1241c
            int r2 = r6.f1240b
            r8 = 0
            if (r1 == r2) goto L1c
            int r1 = r6.e
            if (r5 >= r1) goto L16
            int r1 = r1 - r5
            goto L26
        L16:
            int r1 = r5 - r1
            int r1 = r1 % r2
            int r1 = r2 - r1
            goto L26
        L1c:
            c.a.b.e.a.i r1 = r6.f
            if (r1 == 0) goto L25
            int r1 = r1.a(r5)
            goto L26
        L25:
            r1 = r8
        L26:
            if (r1 <= 0) goto L53
            int r2 = r6.f1240b
            if (r1 == r2) goto L53
            c.a.b.e.a.i r2 = r6.f
            if (r2 == 0) goto L53
            boolean r2 = r6.i
            if (r2 != 0) goto L35
            goto L53
        L35:
            javax.crypto.IllegalBlockSizeException r0 = new javax.crypto.IllegalBlockSizeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Input length must be multiple of "
            r1.append(r2)
            int r2 = r6.f1240b
            r1.append(r2)
            java.lang.String r2 = " when decrypting with padded cipher"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L53:
            boolean r2 = r6.i
            if (r2 != 0) goto L5f
            c.a.b.e.a.i r2 = r6.f
            if (r2 == 0) goto L5f
            int r2 = r5 + r1
            r9 = r2
            goto L60
        L5f:
            r9 = r5
        L60:
            if (r7 == 0) goto L14c
            int r2 = r7.length
            int r2 = r2 - r20
            boolean r3 = r6.i
            java.lang.String r10 = " bytes needed"
            java.lang.String r11 = " bytes given, "
            java.lang.String r12 = "Output buffer too short: "
            if (r3 == 0) goto L73
            c.a.b.e.a.i r3 = r6.f
            if (r3 != 0) goto L75
        L73:
            if (r2 < r9) goto L12e
        L75:
            boolean r3 = r6.i
            if (r3 == 0) goto L7f
            int r3 = r6.f1240b
            int r3 = r9 - r3
            if (r2 < r3) goto L12e
        L7f:
            int r3 = r6.d
            if (r3 != 0) goto L91
            boolean r3 = r6.i
            if (r3 != 0) goto L8c
            c.a.b.e.a.i r3 = r6.f
            if (r3 == 0) goto L8c
            goto L91
        L8c:
            r1 = r16
            r3 = r17
            goto Lb4
        L91:
            byte[] r3 = new byte[r9]
            int r4 = r6.d
            if (r4 == 0) goto L9c
            byte[] r13 = r6.f1239a
            java.lang.System.arraycopy(r13, r8, r3, r8, r4)
        L9c:
            if (r0 == 0) goto La7
            int r4 = r6.d
            r13 = r16
            r14 = r17
            java.lang.System.arraycopy(r13, r14, r3, r4, r0)
        La7:
            boolean r0 = r6.i
            if (r0 != 0) goto Lb2
            c.a.b.e.a.i r0 = r6.f
            if (r0 == 0) goto Lb2
            r0.a(r3, r5, r1)
        Lb2:
            r1 = r3
            r3 = r8
        Lb4:
            boolean r0 = r6.i
            if (r0 == 0) goto L113
            if (r2 >= r9) goto Lbf
            c.a.b.e.a.f r0 = r6.g
            r0.b()
        Lbf:
            byte[] r9 = new byte[r5]
            r4 = 0
            r0 = r15
            r2 = r3
            r3 = r9
            int r0 = r0.a(r1, r2, r3, r4, r5)
            c.a.b.e.a.i r1 = r6.f
            if (r1 == 0) goto Ldc
            int r0 = r1.b(r9, r8, r0)
            if (r0 < 0) goto Ld4
            goto Ldc
        Ld4:
            javax.crypto.BadPaddingException r0 = new javax.crypto.BadPaddingException
            java.lang.String r1 = "Given final block not properly padded"
            r0.<init>(r1)
            throw r0
        Ldc:
            int r1 = r7.length
            int r1 = r1 - r20
            if (r1 < r0) goto Led
            r1 = r8
        Le2:
            if (r1 >= r0) goto L11e
            int r2 = r20 + r1
            r3 = r9[r1]
            r7[r2] = r3
            int r1 = r1 + 1
            goto Le2
        Led:
            c.a.b.e.a.f r1 = r6.g
            r1.c()
            javax.crypto.ShortBufferException r1 = new javax.crypto.ShortBufferException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r12)
            int r3 = r7.length
            int r3 = r3 - r20
            r2.append(r3)
            r2.append(r11)
            r2.append(r0)
            r2.append(r10)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L113:
            r0 = r15
            r2 = r3
            r3 = r19
            r4 = r20
            r5 = r9
            int r0 = r0.a(r1, r2, r3, r4, r5)
        L11e:
            r6.d = r8
            int r1 = r6.f1240b
            r6.e = r1
            int r1 = r6.h
            if (r1 == 0) goto L12d
            c.a.b.e.a.f r1 = r6.g
            r1.a()
        L12d:
            return r0
        L12e:
            javax.crypto.ShortBufferException r0 = new javax.crypto.ShortBufferException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r12)
            r1.append(r2)
            r1.append(r11)
            r1.append(r9)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L14c:
            javax.crypto.ShortBufferException r0 = new javax.crypto.ShortBufferException
            java.lang.String r1 = "Output buffer is null"
            r0.<init>(r1)
            throw r0
    }

    public void a(int r3, byte[] r4, byte[] r5, java.security.SecureRandom r6) {
            r2 = this;
            r0 = 0
            r1 = 2
            if (r3 == r1) goto La
            r1 = 4
            if (r3 != r1) goto L8
            goto La
        L8:
            r3 = r0
            goto Lb
        La:
            r3 = 1
        Lb:
            r2.i = r3
            int r1 = r2.h
            if (r1 != 0) goto L1c
            if (r5 != 0) goto L14
            goto L34
        L14:
            java.security.InvalidAlgorithmParameterException r2 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r3 = "ECB mode cannot use IV"
            r2.<init>(r3)
            throw r2
        L1c:
            if (r5 != 0) goto L34
            if (r3 != 0) goto L2c
            if (r6 != 0) goto L24
            java.security.SecureRandom r6 = c.a.b.e.a.c.f1237b
        L24:
            int r3 = r2.f1240b
            byte[] r5 = new byte[r3]
            r6.nextBytes(r5)
            goto L34
        L2c:
            java.security.InvalidAlgorithmParameterException r2 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r3 = "Parameters missing"
            r2.<init>(r3)
            throw r2
        L34:
            r2.d = r0
            int r3 = r2.f1240b
            r2.e = r3
            c.a.b.e.a.f r3 = r2.g
            boolean r2 = r2.i
            java.lang.String r6 = ""
            r3.a(r2, r6, r4, r5)
            return
    }

    public byte[] a(byte[] r9, int r10, int r11) {
            r8 = this;
            int r0 = r8.a(r11)     // Catch: javax.crypto.ShortBufferException -> L1c
            byte[] r7 = new byte[r0]     // Catch: javax.crypto.ShortBufferException -> L1c
            r6 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r7
            int r8 = r1.a(r2, r3, r4, r5, r6)     // Catch: javax.crypto.ShortBufferException -> L1c
            if (r8 >= r0) goto L1e
            byte[] r9 = new byte[r8]     // Catch: javax.crypto.ShortBufferException -> L1c
            if (r8 == 0) goto L1a
            r10 = 0
            java.lang.System.arraycopy(r7, r10, r9, r10, r8)     // Catch: javax.crypto.ShortBufferException -> L1a
        L1a:
            r7 = r9
            goto L1e
        L1c:
            r8 = 0
            r7 = r8
        L1e:
            return r7
    }
}
