package c.a.c.a;

/* JADX INFO: loaded from: classes.dex */
class h implements java.lang.Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ java.lang.String f1295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f1296c;
    final /* synthetic */ java.lang.String d;
    final /* synthetic */ java.lang.String e;
    final /* synthetic */ c.a.c.a.g f;

    h(c.a.c.a.g r1, java.lang.String r2, int r3, java.lang.String r4, java.lang.String r5) {
            r0 = this;
            r0.f = r1
            r0.f1295b = r2
            r0.f1296c = r3
            r0.d = r4
            r0.e = r5
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "postWithHttps start Thread id = "
            r0.append(r1)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            long r1 = r1.getId()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            c.a.c.a.d.a(r0)
            c.a.c.a.k r1 = new c.a.c.a.k
            c.a.c.a.g r0 = r7.f
            android.content.Context r0 = c.a.c.a.g.a(r0)
            r1.<init>(r0)
            c.a.c.a.g r0 = r7.f
            java.util.HashMap r2 = c.a.c.a.g.b(r0)
            java.lang.String r3 = r7.f1295b
            int r4 = r7.f1296c
            java.lang.String r5 = r7.d
            java.lang.String r6 = r7.e
            java.lang.String r0 = r1.a(r2, r3, r4, r5, r6)
            c.a.c.a.g r7 = r7.f
            c.a.c.a.g.a(r7, r0)
            return
    }
}
