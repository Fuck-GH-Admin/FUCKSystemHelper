package c.a.c.a;

/* JADX INFO: loaded from: classes.dex */
class j implements java.lang.Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ java.lang.String f1300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f1301c;
    final /* synthetic */ java.lang.String d;
    final /* synthetic */ java.lang.String e;
    final /* synthetic */ c.a.c.a.i f;

    j(c.a.c.a.i r1, java.lang.String r2, int r3, java.lang.String r4, java.lang.String r5) {
            r0 = this;
            r0.f = r1
            r0.f1300b = r2
            r0.f1301c = r3
            r0.d = r4
            r0.e = r5
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r6 = this;
            c.a.c.a.i r0 = r6.f
            java.util.List r1 = c.a.c.a.i.a(r0)
            java.lang.String r2 = r6.f1300b
            int r3 = r6.f1301c
            java.lang.String r4 = r6.d
            java.lang.String r5 = r6.e
            c.a.c.a.i.a(r0, r1, r2, r3, r4, r5)
            return
    }
}
