package c.a.b.c;

/* JADX INFO: loaded from: classes.dex */
class b implements java.util.Comparator {
    b() {
            r0 = this;
            r0.<init>()
            return
    }

    public int a(c.a.b.c.a r5, c.a.b.c.a r6) {
            r4 = this;
            long r0 = r5.b()
            long r2 = r6.b()
            long r0 = r0 - r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L15
            if (r4 <= 0) goto L13
            r4 = -1
            goto L14
        L13:
            r4 = 1
        L14:
            return r4
        L15:
            java.lang.String r4 = r5.a()
            java.lang.String r5 = r6.a()
            int r4 = r4.compareTo(r5)
            return r4
    }

    @Override // java.util.Comparator
    public /* synthetic */ int compare(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            c.a.b.c.a r1 = (c.a.b.c.a) r1
            c.a.b.c.a r2 = (c.a.b.c.a) r2
            int r0 = r0.a(r1, r2)
            return r0
    }
}
