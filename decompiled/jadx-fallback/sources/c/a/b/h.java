package c.a.b;

/* JADX INFO: loaded from: classes.dex */
class h implements java.util.Comparator {
    h(c.a.b.f r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public int a(c.a.b.d r2, c.a.b.d r3) {
            r1 = this;
            int r1 = r3.f1232b
            int r0 = r2.f1232b
            int r1 = r1 - r0
            if (r1 != 0) goto L1c
            boolean r0 = r2.d
            if (r0 == 0) goto L11
            boolean r0 = r3.d
            if (r0 == 0) goto L11
            r1 = 0
            return r1
        L11:
            boolean r2 = r2.d
            if (r2 == 0) goto L17
            r1 = -1
            return r1
        L17:
            boolean r2 = r3.d
            if (r2 == 0) goto L1c
            r1 = 1
        L1c:
            return r1
    }

    @Override // java.util.Comparator
    public /* synthetic */ int compare(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            c.a.b.d r1 = (c.a.b.d) r1
            c.a.b.d r2 = (c.a.b.d) r2
            int r0 = r0.a(r1, r2)
            return r0
    }
}
