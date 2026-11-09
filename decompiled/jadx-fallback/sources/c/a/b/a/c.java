package c.a.b.a;

/* JADX INFO: loaded from: classes.dex */
class c {
    public static void a(byte[] r2, byte[] r3, int r4) {
            if (r4 < 0) goto L5d
            if (r2 == 0) goto L55
            int r0 = r2.length
            if (r0 == 0) goto L55
            if (r3 == 0) goto L4d
            int r0 = r3.length
            if (r0 == 0) goto L4d
            int r0 = r2.length
            int r1 = r3.length
            if (r0 < r1) goto L35
            int r0 = r3.length
            int r0 = r0 + r4
            int r1 = r2.length
            if (r1 < r0) goto L1b
            int r0 = r3.length
            r1 = 0
            java.lang.System.arraycopy(r3, r1, r2, r4, r0)
            return
        L1b:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "start should be less than:"
            r0.append(r1)
            int r2 = r2.length
            int r3 = r3.length
            int r2 = r2 - r3
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r4.<init>(r2)
            throw r4
        L35:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "dst array length should be longer than:"
            r4.append(r0)
            int r3 = r3.length
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
        L4d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "src array should not be null or empty"
            r2.<init>(r3)
            throw r2
        L55:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "dst array should not be null or empty"
            r2.<init>(r3)
            throw r2
        L5d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "start should be more than zero!"
            r2.<init>(r3)
            throw r2
    }

    public static byte[] a(byte[] r1, int r2) {
            if (r1 == 0) goto L14
            int r0 = r1.length
            if (r0 == 0) goto L14
            if (r2 < 0) goto Lc
            byte[] r1 = java.util.Arrays.copyOf(r1, r2)
            return r1
        Lc:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "length should be more than zero!"
            r1.<init>(r2)
            throw r1
        L14:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "original array should not be null or empty"
            r1.<init>(r2)
            throw r1
    }
}
