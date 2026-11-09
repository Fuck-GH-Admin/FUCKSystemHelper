package c.a.c.a;

/* JADX INFO: loaded from: classes.dex */
class q implements c.a.c.a.i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ java.lang.String f1311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ c.a.c.a.b f1312b;

    q(c.a.c.a.b r1, java.lang.String r2) {
            r0 = this;
            r0.f1312b = r1
            r0.f1311a = r2
            r0.<init>()
            return
    }

    @Override // c.a.c.a.i.a
    public /* bridge */ /* synthetic */ void a(java.lang.Object r1) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            r0.a(r1)
            return
    }

    public void a(java.lang.String r2) {
            r1 = this;
            c.a.c.a.b r0 = r1.f1312b
            java.lang.String r1 = r1.f1311a
            c.a.c.a.b.a(r0, r2, r1)
            return
    }
}
