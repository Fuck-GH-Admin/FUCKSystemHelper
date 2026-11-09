package b.b.c.f;

/* JADX INFO: loaded from: classes.dex */
class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int[] f1075a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final long[] f1076b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final java.lang.Object[] f1077c = null;

    static {
            r0 = 0
            int[] r1 = new int[r0]
            b.b.c.f.c.f1075a = r1
            long[] r1 = new long[r0]
            b.b.c.f.c.f1076b = r1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            b.b.c.f.c.f1077c = r0
            return
    }

    public static int a(int r2) {
            r0 = 4
        L1:
            r1 = 32
            if (r0 >= r1) goto Lf
            r1 = 1
            int r1 = r1 << r0
            int r1 = r1 + (-12)
            if (r2 > r1) goto Lc
            return r1
        Lc:
            int r0 = r0 + 1
            goto L1
        Lf:
            return r2
    }

    static int a(int[] r3, int r4, int r5) {
            int r4 = r4 + (-1)
            r0 = 0
        L3:
            if (r0 > r4) goto L18
            int r1 = r0 + r4
            int r1 = r1 >>> 1
            r2 = r3[r1]
            if (r2 >= r5) goto L11
            int r1 = r1 + 1
            r0 = r1
            goto L3
        L11:
            if (r2 <= r5) goto L17
            int r1 = r1 + (-1)
            r4 = r1
            goto L3
        L17:
            return r1
        L18:
            int r3 = ~r0
            return r3
    }

    static int a(long[] r4, int r5, long r6) {
            int r5 = r5 + (-1)
            r0 = 0
        L3:
            if (r0 > r5) goto L1a
            int r1 = r0 + r5
            int r1 = r1 >>> 1
            r2 = r4[r1]
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 >= 0) goto L13
            int r1 = r1 + 1
            r0 = r1
            goto L3
        L13:
            if (r2 <= 0) goto L19
            int r1 = r1 + (-1)
            r5 = r1
            goto L3
        L19:
            return r1
        L1a:
            int r4 = ~r0
            return r4
    }

    public static boolean a(java.lang.Object r0, java.lang.Object r1) {
            if (r0 == r1) goto Ld
            if (r0 == 0) goto Lb
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    public static int b(int r0) {
            int r0 = r0 * 4
            int r0 = a(r0)
            int r0 = r0 / 4
            return r0
    }

    public static int c(int r0) {
            int r0 = r0 * 8
            int r0 = a(r0)
            int r0 = r0 / 8
            return r0
    }
}
