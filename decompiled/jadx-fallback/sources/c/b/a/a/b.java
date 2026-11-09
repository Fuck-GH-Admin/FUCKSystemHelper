package c.b.a.a;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f1319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1321c;
    private final java.io.OutputStream d;

    public static class a extends java.io.IOException {
        a() {
                r1 = this;
                java.lang.String r0 = "CodedOutputStream was writing to a flat byte array and ran out of space."
                r1.<init>(r0)
                return
        }
    }

    private b(byte[] r2, int r3, int r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.d = r0
            r1.f1319a = r2
            r1.f1321c = r3
            int r3 = r3 + r4
            r1.f1320b = r3
            return
    }

    public static int b(int r0, long r1) {
            int r0 = f(r0)
            int r1 = d(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int b(int r0, c.b.a.a.a r1) {
            int r0 = f(r0)
            int r1 = b(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int b(int r0, c.b.a.a.c r1) {
            int r0 = f(r0)
            int r1 = b(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int b(c.b.a.a.a r1) {
            int r0 = r1.a()
            int r0 = e(r0)
            int r1 = r1.a()
            int r0 = r0 + r1
            return r0
    }

    public static int b(c.b.a.a.c r1) {
            int r1 = r1.b()
            int r0 = e(r1)
            int r0 = r0 + r1
            return r0
    }

    public static c.b.a.a.b b(byte[] r1, int r2, int r3) {
            c.b.a.a.b r0 = new c.b.a.a.b
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static int c(int r0, int r1) {
            int r0 = f(r0)
            int r1 = d(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int c(long r4) {
            r0 = -128(0xffffffffffffff80, double:NaN)
            long r0 = r0 & r4
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto Lb
            r4 = 1
            return r4
        Lb:
            r0 = -16384(0xffffffffffffc000, double:NaN)
            long r0 = r0 & r4
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L14
            r4 = 2
            return r4
        L14:
            r0 = -2097152(0xffffffffffe00000, double:NaN)
            long r0 = r0 & r4
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L1e
            r4 = 3
            return r4
        L1e:
            r0 = -268435456(0xfffffffff0000000, double:NaN)
            long r0 = r0 & r4
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L28
            r4 = 4
            return r4
        L28:
            r0 = -34359738368(0xfffffff800000000, double:NaN)
            long r0 = r0 & r4
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L34
            r4 = 5
            return r4
        L34:
            r0 = -4398046511104(0xfffffc0000000000, double:NaN)
            long r0 = r0 & r4
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L40
            r4 = 6
            return r4
        L40:
            r0 = -562949953421312(0xfffe000000000000, double:NaN)
            long r0 = r0 & r4
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L49
            r4 = 7
            return r4
        L49:
            r0 = -72057594037927936(0xff00000000000000, double:-5.486124068793689E303)
            long r0 = r0 & r4
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L53
            r4 = 8
            return r4
        L53:
            r0 = -9223372036854775808
            long r4 = r4 & r0
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L5d
            r4 = 9
            return r4
        L5d:
            r4 = 10
            return r4
    }

    private void c() {
            r4 = this;
            java.io.OutputStream r0 = r4.d
            if (r0 == 0) goto Lf
            byte[] r1 = r4.f1319a
            int r2 = r4.f1321c
            r3 = 0
            r0.write(r1, r3, r2)
            r4.f1321c = r3
            return
        Lf:
            c.b.a.a.b$a r4 = new c.b.a.a.b$a
            r4.<init>()
            throw r4
    }

    public static int d(int r0) {
            if (r0 < 0) goto L7
            int r0 = e(r0)
            return r0
        L7:
            r0 = 10
            return r0
    }

    public static int d(long r0) {
            int r0 = c(r0)
            return r0
    }

    public static int e(int r1) {
            r0 = r1 & (-128(0xffffffffffffff80, float:NaN))
            if (r0 != 0) goto L6
            r1 = 1
            return r1
        L6:
            r0 = r1 & (-16384(0xffffffffffffc000, float:NaN))
            if (r0 != 0) goto Lc
            r1 = 2
            return r1
        Lc:
            r0 = -2097152(0xffffffffffe00000, float:NaN)
            r0 = r0 & r1
            if (r0 != 0) goto L13
            r1 = 3
            return r1
        L13:
            r0 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
            r1 = r1 & r0
            if (r1 != 0) goto L1a
            r1 = 4
            return r1
        L1a:
            r1 = 5
            return r1
    }

    public static int f(int r1) {
            r0 = 0
            int r1 = c.b.a.a.d.a(r1, r0)
            int r1 = e(r1)
            return r1
    }

    public void a() {
            r1 = this;
            int r1 = r1.b()
            if (r1 != 0) goto L7
            return
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Did not write as much data as expected."
            r1.<init>(r0)
            throw r1
    }

    public void a(byte r4) {
            r3 = this;
            int r0 = r3.f1321c
            int r1 = r3.f1320b
            if (r0 != r1) goto L9
            r3.c()
        L9:
            byte[] r0 = r3.f1319a
            int r1 = r3.f1321c
            int r2 = r1 + 1
            r3.f1321c = r2
            r0[r1] = r4
            return
    }

    public void a(int r3) {
            r2 = this;
            if (r3 < 0) goto L6
            r2.c(r3)
            goto La
        L6:
            long r0 = (long) r3
            r2.a(r0)
        La:
            return
    }

    public void a(int r2, int r3) {
            r1 = this;
            r0 = 0
            r1.b(r2, r0)
            r1.a(r3)
            return
    }

    public void a(int r2, long r3) {
            r1 = this;
            r0 = 0
            r1.b(r2, r0)
            r1.b(r3)
            return
    }

    public void a(int r2, c.b.a.a.a r3) {
            r1 = this;
            r0 = 2
            r1.b(r2, r0)
            r1.a(r3)
            return
    }

    public void a(int r2, c.b.a.a.c r3) {
            r1 = this;
            r0 = 2
            r1.b(r2, r0)
            r1.a(r3)
            return
    }

    public void a(long r5) {
            r4 = this;
        L0:
            r0 = -128(0xffffffffffffff80, double:NaN)
            long r0 = r0 & r5
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto Le
            int r5 = (int) r5
            r4.b(r5)
            return
        Le:
            int r0 = (int) r5
            r0 = r0 & 127(0x7f, float:1.78E-43)
            r0 = r0 | 128(0x80, float:1.8E-43)
            r4.b(r0)
            r0 = 7
            long r5 = r5 >>> r0
            goto L0
    }

    public void a(c.b.a.a.a r2) {
            r1 = this;
            byte[] r2 = r2.b()
            int r0 = r2.length
            r1.c(r0)
            r1.a(r2)
            return
    }

    public void a(c.b.a.a.c r2) {
            r1 = this;
            int r0 = r2.a()
            r1.c(r0)
            r2.a(r1)
            return
    }

    public void a(byte[] r3) {
            r2 = this;
            int r0 = r3.length
            r1 = 0
            r2.a(r3, r1, r0)
            return
    }

    public void a(byte[] r4, int r5, int r6) {
            r3 = this;
            int r0 = r3.f1320b
            int r1 = r3.f1321c
            int r2 = r0 - r1
            if (r2 < r6) goto L13
            byte[] r0 = r3.f1319a
            java.lang.System.arraycopy(r4, r5, r0, r1, r6)
            int r4 = r3.f1321c
            int r4 = r4 + r6
            r3.f1321c = r4
            goto L34
        L13:
            int r0 = r0 - r1
            byte[] r2 = r3.f1319a
            java.lang.System.arraycopy(r4, r5, r2, r1, r0)
            int r5 = r5 + r0
            int r6 = r6 - r0
            int r0 = r3.f1320b
            r3.f1321c = r0
            r3.c()
            int r0 = r3.f1320b
            if (r6 > r0) goto L2f
            byte[] r0 = r3.f1319a
            r1 = 0
            java.lang.System.arraycopy(r4, r5, r0, r1, r6)
            r3.f1321c = r6
            goto L34
        L2f:
            java.io.OutputStream r3 = r3.d
            r3.write(r4, r5, r6)
        L34:
            return
    }

    public int b() {
            r1 = this;
            java.io.OutputStream r0 = r1.d
            if (r0 != 0) goto La
            int r0 = r1.f1320b
            int r1 = r1.f1321c
            int r0 = r0 - r1
            return r0
        La:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array."
            r1.<init>(r0)
            throw r1
    }

    public void b(int r1) {
            r0 = this;
            byte r1 = (byte) r1
            r0.a(r1)
            return
    }

    public void b(int r1, int r2) {
            r0 = this;
            int r1 = c.b.a.a.d.a(r1, r2)
            r0.c(r1)
            return
    }

    public void b(long r1) {
            r0 = this;
            r0.a(r1)
            return
    }

    public void c(int r2) {
            r1 = this;
        L0:
            r0 = r2 & (-128(0xffffffffffffff80, float:NaN))
            if (r0 != 0) goto L8
            r1.b(r2)
            return
        L8:
            r0 = r2 & 127(0x7f, float:1.78E-43)
            r0 = r0 | 128(0x80, float:1.8E-43)
            r1.b(r0)
            int r2 = r2 >>> 7
            goto L0
    }
}
