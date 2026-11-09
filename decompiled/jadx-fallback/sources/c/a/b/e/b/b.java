package c.a.b.e.b;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f1247b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1248a;

    static {
            r0 = 16
            byte[] r0 = new byte[r0]
            r0 = {x000e: FILL_ARRAY_DATA , data: [101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107} // fill-array
            int[] r0 = c(r0)
            c.a.b.e.b.b.f1247b = r0
            return
    }

    public b(int r1) {
            r0 = this;
            r0.<init>()
            r0.f1248a = r1
            return
    }

    private static int a(int r1, int r2) {
            int r0 = r1 << r2
            int r2 = -r2
            int r1 = r1 >>> r2
            r1 = r1 | r0
            return r1
    }

    private void a(byte[] r7, byte[] r8, java.nio.ByteBuffer r9, java.nio.ByteBuffer r10) {
            r6 = this;
            int r0 = r10.remaining()
            int r1 = r0 / 64
            int r1 = r1 + 1
            r2 = 0
        L9:
            if (r2 >= r1) goto L24
            int r3 = r6.f1248a
            int r3 = r3 + r2
            java.nio.ByteBuffer r3 = r6.a(r7, r8, r3)
            int r4 = r1 + (-1)
            r5 = 64
            if (r2 != r4) goto L1e
            int r4 = r0 % 64
            c.a.b.e.b.a.a(r9, r10, r3, r4)
            goto L21
        L1e:
            c.a.b.e.b.a.a(r9, r10, r3, r5)
        L21:
            int r2 = r2 + 1
            goto L9
        L24:
            return
    }

    static void a(int[] r16) {
            r0 = r16
            r1 = 0
            r2 = r1
        L4:
            r3 = 10
            if (r2 >= r3) goto L3b
            r4 = 12
            r5 = 8
            r6 = 4
            a(r0, r1, r6, r5, r4)
            r7 = 13
            r8 = 9
            r9 = 5
            r10 = 1
            a(r0, r10, r9, r8, r7)
            r11 = 14
            r12 = 6
            r13 = 2
            a(r0, r13, r12, r3, r11)
            r14 = 15
            r15 = 11
            r6 = 7
            r8 = 3
            a(r0, r8, r6, r15, r14)
            a(r0, r1, r9, r3, r14)
            a(r0, r10, r12, r15, r4)
            a(r0, r13, r6, r5, r7)
            r3 = 9
            r4 = 4
            a(r0, r8, r4, r3, r11)
            int r2 = r2 + 1
            goto L4
        L3b:
            return
    }

    static void a(int[] r2, int r3, int r4, int r5, int r6) {
            r0 = r2[r3]
            r1 = r2[r4]
            int r0 = r0 + r1
            r2[r3] = r0
            r0 = r2[r6]
            r1 = r2[r3]
            r0 = r0 ^ r1
            r1 = 16
            int r0 = a(r0, r1)
            r2[r6] = r0
            r0 = r2[r5]
            r1 = r2[r6]
            int r0 = r0 + r1
            r2[r5] = r0
            r0 = r2[r4]
            r1 = r2[r5]
            r0 = r0 ^ r1
            r1 = 12
            int r0 = a(r0, r1)
            r2[r4] = r0
            r0 = r2[r3]
            r1 = r2[r4]
            int r0 = r0 + r1
            r2[r3] = r0
            r0 = r2[r6]
            r3 = r2[r3]
            r3 = r3 ^ r0
            r0 = 8
            int r3 = a(r3, r0)
            r2[r6] = r3
            r3 = r2[r5]
            r6 = r2[r6]
            int r3 = r3 + r6
            r2[r5] = r3
            r3 = r2[r4]
            r5 = r2[r5]
            r3 = r3 ^ r5
            r5 = 7
            int r3 = a(r3, r5)
            r2[r4] = r3
            return
    }

    static void a(int[] r3, int[] r4) {
            int[] r0 = c.a.b.e.b.b.f1247b
            int r1 = r0.length
            r2 = 0
            java.lang.System.arraycopy(r0, r2, r3, r2, r1)
            int[] r0 = c.a.b.e.b.b.f1247b
            int r0 = r0.length
            r1 = 8
            java.lang.System.arraycopy(r4, r2, r3, r0, r1)
            return
    }

    static int[] c(byte[] r1) {
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r1 = r1.order(r0)
            java.nio.IntBuffer r1 = r1.asIntBuffer()
            int r0 = r1.remaining()
            int[] r0 = new int[r0]
            r1.get(r0)
            return r0
    }

    int a() {
            r0 = this;
            r0 = 12
            return r0
    }

    java.nio.ByteBuffer a(byte[] r3, byte[] r4, int r5) {
            r2 = this;
            int[] r3 = c(r3)
            int[] r4 = c(r4)
            int[] r2 = r2.a(r3, r4, r5)
            java.lang.Object r3 = r2.clone()
            int[] r3 = (int[]) r3
            a(r3)
            r4 = 0
            r5 = r4
        L17:
            int r0 = r2.length
            if (r5 >= r0) goto L24
            r0 = r2[r5]
            r1 = r3[r5]
            int r0 = r0 + r1
            r2[r5] = r0
            int r5 = r5 + 1
            goto L17
        L24:
            r3 = 64
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r3)
            java.nio.ByteOrder r5 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r3 = r3.order(r5)
            java.nio.IntBuffer r5 = r3.asIntBuffer()
            r0 = 16
            r5.put(r2, r4, r0)
            return r3
    }

    void a(java.nio.ByteBuffer r3, byte[] r4, byte[] r5) {
            r2 = this;
            int r0 = r3.remaining()
            int r1 = r2.a()
            int r0 = r0 - r1
            int r1 = r4.length
            if (r0 < r1) goto L2b
            if (r5 != 0) goto L1c
            int r5 = r2.a()
            byte[] r5 = new byte[r5]
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r0.nextBytes(r5)
        L1c:
            r3.put(r5)
            byte[] r0 = c.a.b.e.c.b.a()
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r4)
            r2.a(r5, r0, r3, r4)
            return
        L2b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "data output is too small"
            r2.<init>(r3)
            throw r2
    }

    byte[] a(java.nio.ByteBuffer r4) {
            r3 = this;
            int r0 = r4.remaining()
            int r1 = r3.a()
            if (r0 < r1) goto L27
            int r0 = r3.a()
            byte[] r0 = new byte[r0]
            r4.get(r0)
            int r1 = r4.remaining()
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            byte[] r2 = c.a.b.e.c.b.b()
            r3.a(r0, r2, r1, r4)
            byte[] r3 = r1.array()
            return r3
        L27:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r4 = "data too short"
            r3.<init>(r4)
            throw r3
    }

    public byte[] a(byte[] r2) {
            r1 = this;
            r0 = 0
            byte[] r1 = r1.a(r2, r0)
            return r1
    }

    public byte[] a(byte[] r4, byte[] r5) {
            r3 = this;
            int r0 = r4.length
            int r1 = r3.a()
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r2 = r2 - r1
            if (r0 > r2) goto L1d
            int r0 = r3.a()
            int r1 = r4.length
            int r0 = r0 + r1
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r3.a(r0, r4, r5)
            byte[] r3 = r0.array()
            return r3
        L1d:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r4 = "data too long"
            r3.<init>(r4)
            throw r3
    }

    int[] a(int[] r3, int[] r4, int r5) {
            r2 = this;
            int r0 = r3.length
            int r2 = r2.a()
            int r2 = r2 / 4
            r1 = 0
            if (r0 != r2) goto L1c
            r2 = 16
            int[] r2 = new int[r2]
            a(r2, r4)
            r4 = 12
            r2[r4] = r5
            int r4 = r3.length
            r5 = 13
            java.lang.System.arraycopy(r3, r1, r2, r5, r4)
            return r2
        L1c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            int r3 = r3.length
            int r3 = r3 * 32
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4[r1] = r3
            java.lang.String r3 = "need 96-bit param, but got a %d-bit param"
            java.lang.String r3 = java.lang.String.format(r3, r4)
            r2.<init>(r3)
            throw r2
    }

    public byte[] b(byte[] r1) {
            r0 = this;
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)
            byte[] r0 = r0.a(r1)
            return r0
    }
}
