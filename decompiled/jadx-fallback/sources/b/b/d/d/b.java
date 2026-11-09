package b.b.d.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.Object f1159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1160c;

    public interface a {
        void a(b.b.d.d.b r1);

        boolean a(b.b.d.d.b r1, android.view.Menu r2);

        boolean a(b.b.d.d.b r1, android.view.MenuItem r2);

        boolean b(b.b.d.d.b r1, android.view.Menu r2);
    }

    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void a();

    public abstract void a(int r1);

    public abstract void a(android.view.View r1);

    public abstract void a(java.lang.CharSequence r1);

    public void a(java.lang.Object r1) {
            r0 = this;
            r0.f1159b = r1
            return
    }

    public void a(boolean r1) {
            r0 = this;
            r0.f1160c = r1
            return
    }

    public abstract android.view.View b();

    public abstract void b(int r1);

    public abstract void b(java.lang.CharSequence r1);

    public abstract android.view.Menu c();

    public abstract android.view.MenuInflater d();

    public abstract java.lang.CharSequence e();

    public java.lang.Object f() {
            r0 = this;
            java.lang.Object r0 = r0.f1159b
            return r0
    }

    public abstract java.lang.CharSequence g();

    public boolean h() {
            r0 = this;
            boolean r0 = r0.f1160c
            return r0
    }

    public abstract void i();

    public abstract boolean j();
}
