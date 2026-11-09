package c.a.b.a;

/* JADX INFO: loaded from: classes.dex */
class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f1200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f1201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f1202c;
    private int d;
    private int e;

    protected k() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    protected k(int r2) {
            r1 = this;
            r1.<init>()
            r0 = 4
            int[] r0 = new int[r0]
            r1.f1200a = r0
            r0 = 16
            byte[] r0 = new byte[r0]
            r1.f1201b = r0
            r1.f1202c = r2
            r1.b()
            return
    }

    private static int a(byte[] r2, int r3) {
            r0 = 4
            long r2 = b(r2, r3, r0)
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            int r2 = (int) r2
            return r2
    }

    private static long b(byte[] r7, int r8, int r9) {
            r0 = 8
            if (r9 > r0) goto L19
            r0 = 0
            r2 = 0
        L7:
            if (r2 >= r9) goto L18
            int r3 = r8 + r2
            r3 = r7[r3]
            long r3 = (long) r3
            r5 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r5
            int r5 = r2 * 8
            long r3 = r3 << r5
            long r0 = r0 | r3
            int r2 = r2 + 1
            goto L7
        L18:
            return r0
        L19:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "can't read more than eight bytes into a long value"
            r7.<init>(r8)
            throw r7
    }

    private void b() {
            r5 = this;
            int[] r0 = r5.f1200a
            int r5 = r5.f1202c
            r1 = -1640531535(0xffffffff9e3779b1, float:-9.7131045E-21)
            int r2 = r5 + r1
            r3 = -2048144777(0xffffffff85ebca77, float:-2.2173668E-35)
            int r2 = r2 + r3
            r4 = 0
            r0[r4] = r2
            int r3 = r3 + r5
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r5
            int r5 = r5 - r1
            r1 = 3
            r0[r1] = r5
            return
    }

    private void b(byte[] r13, int r14) {
            r12 = this;
            int[] r0 = r12.f1200a
            r1 = 0
            r2 = r0[r1]
            r3 = 1
            r4 = r0[r3]
            r5 = 2
            r6 = r0[r5]
            r7 = 3
            r0 = r0[r7]
            int r8 = a(r13, r14)
            r9 = -2048144777(0xffffffff85ebca77, float:-2.2173668E-35)
            int r8 = r8 * r9
            int r2 = r2 + r8
            r8 = 13
            int r2 = java.lang.Integer.rotateLeft(r2, r8)
            r10 = -1640531535(0xffffffff9e3779b1, float:-9.7131045E-21)
            int r2 = r2 * r10
            int r11 = r14 + 4
            int r11 = a(r13, r11)
            int r11 = r11 * r9
            int r4 = r4 + r11
            int r4 = java.lang.Integer.rotateLeft(r4, r8)
            int r4 = r4 * r10
            int r11 = r14 + 8
            int r11 = a(r13, r11)
            int r11 = r11 * r9
            int r6 = r6 + r11
            int r6 = java.lang.Integer.rotateLeft(r6, r8)
            int r6 = r6 * r10
            int r14 = r14 + 12
            int r13 = a(r13, r14)
            int r13 = r13 * r9
            int r0 = r0 + r13
            int r13 = java.lang.Integer.rotateLeft(r0, r8)
            int r13 = r13 * r10
            int[] r14 = r12.f1200a
            r14[r1] = r2
            r14[r3] = r4
            r14[r5] = r6
            r14[r7] = r13
            r12.e = r1
            return
    }

    protected long a() {
            r6 = this;
            int r0 = r6.d
            r1 = 0
            r2 = 374761393(0x165667b1, float:1.7319502E-25)
            r3 = 2
            r4 = 16
            if (r0 <= r4) goto L36
            int[] r0 = r6.f1200a
            r0 = r0[r1]
            r4 = 1
            int r0 = java.lang.Integer.rotateLeft(r0, r4)
            int[] r5 = r6.f1200a
            r4 = r5[r4]
            r5 = 7
            int r4 = java.lang.Integer.rotateLeft(r4, r5)
            int r0 = r0 + r4
            int[] r4 = r6.f1200a
            r3 = r4[r3]
            r4 = 12
            int r3 = java.lang.Integer.rotateLeft(r3, r4)
            int r0 = r0 + r3
            int[] r3 = r6.f1200a
            r4 = 3
            r3 = r3[r4]
            r4 = 18
            int r3 = java.lang.Integer.rotateLeft(r3, r4)
            int r0 = r0 + r3
            goto L3b
        L36:
            int[] r0 = r6.f1200a
            r0 = r0[r3]
            int r0 = r0 + r2
        L3b:
            int r3 = r6.d
            int r0 = r0 + r3
            int r3 = r6.e
            int r3 = r3 + (-4)
        L42:
            r4 = -1028477379(0xffffffffc2b2ae3d, float:-89.34031)
            if (r1 > r3) goto L5c
            byte[] r5 = r6.f1201b
            int r5 = a(r5, r1)
            int r5 = r5 * r4
            int r0 = r0 + r5
            r4 = 17
            int r0 = java.lang.Integer.rotateLeft(r0, r4)
            r4 = 668265263(0x27d4eb2f, float:5.9096807E-15)
            int r0 = r0 * r4
            int r1 = r1 + 4
            goto L42
        L5c:
            int r3 = r6.e
            if (r1 >= r3) goto L76
            byte[] r3 = r6.f1201b
            int r5 = r1 + 1
            r1 = r3[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 * r2
            int r0 = r0 + r1
            r1 = 11
            int r0 = java.lang.Integer.rotateLeft(r0, r1)
            r1 = -1640531535(0xffffffff9e3779b1, float:-9.7131045E-21)
            int r0 = r0 * r1
            r1 = r5
            goto L5c
        L76:
            int r6 = r0 >>> 15
            r6 = r6 ^ r0
            r0 = -2048144777(0xffffffff85ebca77, float:-2.2173668E-35)
            int r6 = r6 * r0
            int r0 = r6 >>> 13
            r6 = r6 ^ r0
            int r6 = r6 * r4
            int r0 = r6 >>> 16
            r6 = r6 ^ r0
            long r0 = (long) r6
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            return r0
    }

    protected void a(byte[] r5, int r6, int r7) {
            r4 = this;
            if (r7 > 0) goto L3
            return
        L3:
            int r0 = r4.d
            int r0 = r0 + r7
            r4.d = r0
            int r0 = r6 + r7
            int r1 = r4.e
            int r2 = r1 + r7
            r3 = 16
            if (r2 >= r3) goto L1d
            byte[] r0 = r4.f1201b
            java.lang.System.arraycopy(r5, r6, r0, r1, r7)
            int r5 = r4.e
            int r5 = r5 + r7
            r4.e = r5
            return
        L1d:
            r7 = 0
            if (r1 <= 0) goto L2c
            int r3 = r3 - r1
            byte[] r2 = r4.f1201b
            java.lang.System.arraycopy(r5, r6, r2, r1, r3)
            byte[] r1 = r4.f1201b
            r4.b(r1, r7)
            int r6 = r6 + r3
        L2c:
            int r1 = r0 + (-16)
        L2e:
            if (r6 > r1) goto L36
            r4.b(r5, r6)
            int r6 = r6 + 16
            goto L2e
        L36:
            if (r6 >= r0) goto L40
            int r0 = r0 - r6
            r4.e = r0
            byte[] r4 = r4.f1201b
            java.lang.System.arraycopy(r5, r6, r4, r7, r0)
        L40:
            return
    }
}
