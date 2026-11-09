package android.support.constraint.n.k.m;

/* JADX INFO: loaded from: classes.dex */
class g extends android.support.constraint.n.k.m.f {
    public int m;

    public g(android.support.constraint.n.k.m.p r1) {
            r0 = this;
            r0.<init>(r1)
            boolean r1 = r1 instanceof android.support.constraint.n.k.m.l
            if (r1 == 0) goto La
            android.support.constraint.n.k.m.f$a r1 = android.support.constraint.n.k.m.f.a.f512c
            goto Lc
        La:
            android.support.constraint.n.k.m.f$a r1 = android.support.constraint.n.k.m.f.a.d
        Lc:
            r0.e = r1
            return
    }

    @Override // android.support.constraint.n.k.m.f
    public void a(int r2) {
            r1 = this;
            boolean r0 = r1.j
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.j = r0
            r1.g = r2
            java.util.List<android.support.constraint.n.k.m.d> r1 = r1.k
            java.util.Iterator r1 = r1.iterator()
        L10:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L20
            java.lang.Object r2 = r1.next()
            android.support.constraint.n.k.m.d r2 = (android.support.constraint.n.k.m.d) r2
            r2.a(r2)
            goto L10
        L20:
            return
    }
}
