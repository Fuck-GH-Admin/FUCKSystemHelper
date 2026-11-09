package c.a.b.e.b;

/* JADX INFO: loaded from: classes.dex */
final class a {
    static void a(java.nio.ByteBuffer r3, java.nio.ByteBuffer r4, java.nio.ByteBuffer r5, int r6) {
            if (r6 < 0) goto L28
            int r0 = r4.remaining()
            if (r0 < r6) goto L28
            int r0 = r5.remaining()
            if (r0 < r6) goto L28
            int r0 = r3.remaining()
            if (r0 < r6) goto L28
            r0 = 0
        L15:
            if (r0 >= r6) goto L27
            byte r1 = r4.get()
            byte r2 = r5.get()
            r1 = r1 ^ r2
            byte r1 = (byte) r1
            r3.put(r1)
            int r0 = r0 + 1
            goto L15
        L27:
            return
        L28:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "That combination of buffers, offsets and length to xor result in out-of-bond accesses."
            r3.<init>(r4)
            throw r3
    }
}
