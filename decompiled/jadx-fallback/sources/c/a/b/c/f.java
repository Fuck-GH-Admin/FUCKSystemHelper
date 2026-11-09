package c.a.b.c;

/* JADX INFO: loaded from: classes.dex */
class f implements java.util.Comparator {
    f(c.a.b.c.e.c r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public int a(c.a.b.c.e.c.a r1, c.a.b.c.e.c.a r2) {
            r0 = this;
            int r0 = c.a.b.c.e.c.a.a(r1)
            int r1 = c.a.b.c.e.c.a.a(r2)
            int r0 = r0 - r1
            return r0
    }

    @Override // java.util.Comparator
    public /* synthetic */ int compare(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            c.a.b.c.e$c$a r1 = (c.a.b.c.e.c.a) r1
            c.a.b.c.e$c$a r2 = (c.a.b.c.e.c.a) r2
            int r0 = r0.a(r1, r2)
            return r0
    }
}
