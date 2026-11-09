package android.support.v7.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f692b = -1;

    static {
            return
    }

    e() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.support.v7.app.e a(android.app.Activity r2, android.support.v7.app.d r3) {
            android.support.v7.app.f r0 = new android.support.v7.app.f
            android.view.Window r1 = r2.getWindow()
            r0.<init>(r2, r1, r3)
            return r0
    }

    public static android.support.v7.app.e a(android.app.Dialog r2, android.support.v7.app.d r3) {
            android.support.v7.app.f r0 = new android.support.v7.app.f
            android.content.Context r1 = r2.getContext()
            android.view.Window r2 = r2.getWindow()
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static int j() {
            int r0 = android.support.v7.app.e.f692b
            return r0
    }

    public abstract <T extends android.view.View> T a(int r1);

    public abstract void a(android.content.res.Configuration r1);

    public abstract void a(android.os.Bundle r1);

    public abstract void a(android.view.View r1);

    public abstract void a(android.view.View r1, android.view.ViewGroup.LayoutParams r2);

    public abstract void a(java.lang.CharSequence r1);

    public abstract boolean a();

    public abstract android.view.MenuInflater b();

    public abstract void b(android.os.Bundle r1);

    public abstract void b(android.view.View r1, android.view.ViewGroup.LayoutParams r2);

    public abstract boolean b(int r1);

    public abstract android.support.v7.app.a c();

    public abstract void c(int r1);

    public abstract void c(android.os.Bundle r1);

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public abstract void i();
}
