package c.a.b.e.a;

/* JADX INFO: loaded from: classes.dex */
abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final c.a.b.e.a.b f1242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f1243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    byte[] f1244c;

    f(c.a.b.e.a.b r1) {
            r0 = this;
            r0.<init>()
            r0.f1242a = r1
            int r1 = r1.a()
            r0.f1243b = r1
            return
    }

    abstract void a();

    abstract void a(boolean r1, java.lang.String r2, byte[] r3, byte[] r4);

    abstract void a(byte[] r1, int r2, int r3, byte[] r4, int r5);

    abstract void b();

    abstract void b(byte[] r1, int r2, int r3, byte[] r4, int r5);

    abstract void c();

    void c(byte[] r1, int r2, int r3, byte[] r4, int r5) {
            r0 = this;
            r0.a(r1, r2, r3, r4, r5)
            return
    }

    void d(byte[] r1, int r2, int r3, byte[] r4, int r5) {
            r0 = this;
            r0.b(r1, r2, r3, r4, r5)
            return
    }
}
