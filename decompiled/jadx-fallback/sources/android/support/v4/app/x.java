package android.support.v4.app;

/* JADX INFO: loaded from: classes.dex */
public class x extends android.app.Activity implements android.arch.lifecycle.e, b.b.c.g.e.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.arch.lifecycle.f f621b;

    public x() {
            r1 = this;
            r1.<init>()
            b.b.c.f.k r0 = new b.b.c.f.k
            r0.<init>()
            android.arch.lifecycle.f r0 = new android.arch.lifecycle.f
            r0.<init>(r1)
            r1.f621b = r0
            return
    }

    public android.arch.lifecycle.c a() {
            r0 = this;
            android.arch.lifecycle.f r0 = r0.f621b
            return r0
    }

    @Override // b.b.c.g.e.a
    public boolean a(android.view.KeyEvent r1) {
            r0 = this;
            boolean r0 = super.dispatchKeyEvent(r1)
            return r0
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r3) {
            r2 = this;
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L12
            boolean r1 = b.b.c.g.e.a(r0, r3)
            if (r1 == 0) goto L12
            r2 = 1
            return r2
        L12:
            boolean r2 = b.b.c.g.e.a(r2, r0, r2, r3)
            return r2
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r2) {
            r1 = this;
            android.view.Window r0 = r1.getWindow()
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L12
            boolean r0 = b.b.c.g.e.a(r0, r2)
            if (r0 == 0) goto L12
            r1 = 1
            return r1
        L12:
            boolean r1 = super.dispatchKeyShortcutEvent(r2)
            return r1
    }

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle r1) {
            r0 = this;
            super.onCreate(r1)
            android.arch.lifecycle.m.a(r0)
            return
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(android.os.Bundle r3) {
            r2 = this;
            android.arch.lifecycle.f r0 = r2.f621b
            android.arch.lifecycle.c$b r1 = android.arch.lifecycle.c.b.d
            r0.a(r1)
            super.onSaveInstanceState(r3)
            return
    }
}
