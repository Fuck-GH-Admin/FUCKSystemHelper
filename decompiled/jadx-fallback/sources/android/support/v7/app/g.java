package android.support.v7.app;

/* JADX INFO: loaded from: classes.dex */
public class g extends android.app.Dialog implements android.support.v7.app.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.support.v7.app.e f715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b.b.c.g.e.a f716c;

    class a implements b.b.c.g.e.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.support.v7.app.g f717b;

        a(android.support.v7.app.g r1) {
                r0 = this;
                r0.f717b = r1
                r0.<init>()
                return
        }

        @Override // b.b.c.g.e.a
        public boolean a(android.view.KeyEvent r1) {
                r0 = this;
                android.support.v7.app.g r0 = r0.f717b
                boolean r0 = r0.a(r1)
                return r0
        }
    }

    public g(android.content.Context r1, int r2) {
            r0 = this;
            int r2 = a(r1, r2)
            r0.<init>(r1, r2)
            android.support.v7.app.g$a r1 = new android.support.v7.app.g$a
            r1.<init>(r0)
            r0.f716c = r1
            android.support.v7.app.e r1 = r0.a()
            r2 = 0
            r1.a(r2)
            android.support.v7.app.e r0 = r0.a()
            r0.a()
            return
    }

    private static int a(android.content.Context r2, int r3) {
            if (r3 != 0) goto L13
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources$Theme r2 = r2.getTheme()
            int r0 = b.b.d.a.a.dialogTheme
            r1 = 1
            r2.resolveAttribute(r0, r3, r1)
            int r3 = r3.resourceId
        L13:
            return r3
    }

    public android.support.v7.app.e a() {
            r1 = this;
            android.support.v7.app.e r0 = r1.f715b
            if (r0 != 0) goto La
            android.support.v7.app.e r0 = android.support.v7.app.e.a(r1, r1)
            r1.f715b = r0
        La:
            android.support.v7.app.e r1 = r1.f715b
            return r1
    }

    @Override // android.support.v7.app.d
    public b.b.d.d.b a(b.b.d.d.b.a r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.support.v7.app.d
    public void a(b.b.d.d.b r1) {
            r0 = this;
            return
    }

    public boolean a(int r1) {
            r0 = this;
            android.support.v7.app.e r0 = r0.a()
            boolean r0 = r0.b(r1)
            return r0
    }

    boolean a(android.view.KeyEvent r1) {
            r0 = this;
            boolean r0 = super.dispatchKeyEvent(r1)
            return r0
    }

    @Override // android.app.Dialog
    public void addContentView(android.view.View r1, android.view.ViewGroup.LayoutParams r2) {
            r0 = this;
            android.support.v7.app.e r0 = r0.a()
            r0.a(r1, r2)
            return
    }

    @Override // android.support.v7.app.d
    public void b(b.b.d.d.b r1) {
            r0 = this;
            return
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r3) {
            r2 = this;
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            b.b.c.g.e$a r1 = r2.f716c
            boolean r2 = b.b.c.g.e.a(r1, r0, r2, r3)
            return r2
    }

    @Override // android.app.Dialog
    public <T extends android.view.View> T findViewById(int r1) {
            r0 = this;
            android.support.v7.app.e r0 = r0.a()
            android.view.View r0 = r0.a(r1)
            return r0
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
            r0 = this;
            android.support.v7.app.e r0 = r0.a()
            r0.e()
            return
    }

    @Override // android.app.Dialog
    protected void onCreate(android.os.Bundle r2) {
            r1 = this;
            android.support.v7.app.e r0 = r1.a()
            r0.d()
            super.onCreate(r2)
            android.support.v7.app.e r1 = r1.a()
            r1.a(r2)
            return
    }

    @Override // android.app.Dialog
    protected void onStop() {
            r0 = this;
            super.onStop()
            android.support.v7.app.e r0 = r0.a()
            r0.i()
            return
    }

    @Override // android.app.Dialog
    public void setContentView(int r1) {
            r0 = this;
            android.support.v7.app.e r0 = r0.a()
            r0.c(r1)
            return
    }

    @Override // android.app.Dialog
    public void setContentView(android.view.View r1) {
            r0 = this;
            android.support.v7.app.e r0 = r0.a()
            r0.a(r1)
            return
    }

    @Override // android.app.Dialog
    public void setContentView(android.view.View r1, android.view.ViewGroup.LayoutParams r2) {
            r0 = this;
            android.support.v7.app.e r0 = r0.a()
            r0.b(r1, r2)
            return
    }

    @Override // android.app.Dialog
    public void setTitle(int r2) {
            r1 = this;
            super.setTitle(r2)
            android.support.v7.app.e r0 = r1.a()
            android.content.Context r1 = r1.getContext()
            java.lang.String r1 = r1.getString(r2)
            r0.a(r1)
            return
    }

    @Override // android.app.Dialog
    public void setTitle(java.lang.CharSequence r1) {
            r0 = this;
            super.setTitle(r1)
            android.support.v7.app.e r0 = r0.a()
            r0.a(r1)
            return
    }
}
