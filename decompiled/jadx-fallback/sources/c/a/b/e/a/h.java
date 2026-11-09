package c.a.b.e.a;

/* JADX INFO: loaded from: classes.dex */
final class h implements c.a.b.e.a.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1246a;

    h(int r1) {
            r0 = this;
            r0.<init>()
            r0.f1246a = r1
            return
    }

    @Override // c.a.b.e.a.i
    public int a(int r1) {
            r0 = this;
            int r0 = r0.f1246a
            int r1 = r1 % r0
            int r0 = r0 - r1
            return r0
    }

    @Override // c.a.b.e.a.i
    public void a(byte[] r3, int r4, int r5) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            int r2 = r4 + r5
            int r0 = r3.length
            if (r2 > r0) goto L16
            r2 = r5 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r0 = 0
        Lc:
            if (r0 >= r5) goto L15
            int r1 = r0 + r4
            r3[r1] = r2
            int r0 = r0 + 1
            goto Lc
        L15:
            return
        L16:
            javax.crypto.ShortBufferException r2 = new javax.crypto.ShortBufferException
            java.lang.String r3 = "Buffer too small to hold padding"
            r2.<init>(r3)
            throw r2
    }

    @Override // c.a.b.e.a.i
    public int b(byte[] r6, int r7, int r8) {
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L28
            if (r8 != 0) goto L6
            goto L28
        L6:
            int r8 = r8 + r7
            int r1 = r8 + (-1)
            r1 = r6[r1]
            r2 = r1 & 255(0xff, float:3.57E-43)
            r3 = -1
            r4 = 1
            if (r2 < r4) goto L27
            int r5 = r5.f1246a
            if (r2 <= r5) goto L16
            goto L27
        L16:
            int r8 = r8 - r2
            if (r8 >= r7) goto L1a
            return r3
        L1a:
            if (r0 >= r2) goto L26
            int r5 = r8 + r0
            r5 = r6[r5]
            if (r5 == r1) goto L23
            return r3
        L23:
            int r0 = r0 + 1
            goto L1a
        L26:
            return r8
        L27:
            return r3
        L28:
            return r0
    }
}
