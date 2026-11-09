package b.b.c.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b.b.c.g.c.b f1109a;

    public interface a {
    }

    public interface b {
        void onActionProviderVisibilityChanged(boolean r1);
    }

    public c(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public android.view.View a(android.view.MenuItem r1) {
            r0 = this;
            android.view.View r0 = r0.c()
            return r0
    }

    public void a(android.view.SubMenu r1) {
            r0 = this;
            return
    }

    public void a(b.b.c.g.c.a r1) {
            r0 = this;
            return
    }

    public void a(b.b.c.g.c.b r3) {
            r2 = this;
            b.b.c.g.c$b r0 = r2.f1109a
            if (r0 == 0) goto L29
            if (r3 == 0) goto L29
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this "
            r0.append(r1)
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = " instance while it is still in use somewhere else?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ActionProvider(support)"
            android.util.Log.w(r1, r0)
        L29:
            r2.f1109a = r3
            return
    }

    public boolean a() {
            r0 = this;
            r0 = 0
            return r0
    }

    public boolean b() {
            r0 = this;
            r0 = 1
            return r0
    }

    public abstract android.view.View c();

    public boolean d() {
            r0 = this;
            r0 = 0
            return r0
    }

    public boolean e() {
            r0 = this;
            r0 = 0
            return r0
    }

    public void f() {
            r1 = this;
            r0 = 0
            r1.f1109a = r0
            return
    }
}
