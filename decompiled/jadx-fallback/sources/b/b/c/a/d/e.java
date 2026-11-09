package b.b.c.a.d;

/* JADX INFO: loaded from: classes.dex */
final class e {
    static {
            return
    }

    public static int a(int r1) {
            r0 = 4
            if (r1 > r0) goto L6
            r1 = 8
            goto L8
        L6:
            int r1 = r1 * 2
        L8:
            return r1
    }

    public static int[] a(int[] r2, int r3, int r4) {
            int r0 = r3 + 1
            int r1 = r2.length
            if (r0 <= r1) goto L10
            int r0 = a(r3)
            int[] r0 = new int[r0]
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r0, r1, r3)
            r2 = r0
        L10:
            r2[r3] = r4
            return r2
    }

    public static <T> T[] a(T[] r2, int r3, T r4) {
            int r0 = r3 + 1
            int r1 = r2.length
            if (r0 <= r1) goto L1c
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r0 = r0.getComponentType()
            int r1 = a(r3)
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r0, r1, r3)
            r2 = r0
        L1c:
            r2[r3] = r4
            return r2
    }
}
