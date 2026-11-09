package android.support.v4.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class i<E> extends android.support.v4.app.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.app.Activity f557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.Context f558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.os.Handler f559c;
    final android.support.v4.app.k d;

    i(android.app.Activity r1, android.content.Context r2, android.os.Handler r3, int r4) {
            r0 = this;
            r0.<init>()
            android.support.v4.app.k r4 = new android.support.v4.app.k
            r4.<init>()
            r0.d = r4
            r0.f557a = r1
            java.lang.String r1 = "context == null"
            b.b.c.f.j.a(r2, r1)
            android.content.Context r2 = (android.content.Context) r2
            r0.f558b = r2
            java.lang.String r1 = "handler == null"
            b.b.c.f.j.a(r3, r1)
            android.os.Handler r3 = (android.os.Handler) r3
            r0.f559c = r3
            return
    }

    i(android.support.v4.app.f r3) {
            r2 = this;
            android.os.Handler r0 = r3.f552c
            r1 = 0
            r2.<init>(r3, r3, r0, r1)
            return
    }

    abstract void a(android.support.v4.app.e r1);

    public abstract void a(java.lang.String r1, java.io.FileDescriptor r2, java.io.PrintWriter r3, java.lang.String[] r4);

    android.app.Activity b() {
            r0 = this;
            android.app.Activity r0 = r0.f557a
            return r0
    }

    public abstract boolean b(android.support.v4.app.e r1);

    android.content.Context c() {
            r0 = this;
            android.content.Context r0 = r0.f558b
            return r0
    }

    android.support.v4.app.k d() {
            r0 = this;
            android.support.v4.app.k r0 = r0.d
            return r0
    }

    android.os.Handler e() {
            r0 = this;
            android.os.Handler r0 = r0.f559c
            return r0
    }

    public abstract android.view.LayoutInflater f();

    public abstract int g();

    public abstract boolean h();

    public abstract void i();
}
