package android.support.v7.app;

/* JADX INFO: loaded from: classes.dex */
public class c extends android.support.v4.app.f implements android.support.v7.app.d, android.support.v4.app.y.a {
    private android.support.v7.app.e n;
    private int o;
    private android.content.res.Resources p;

    public c() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.o = r0
            return
    }

    private boolean a(int r2, android.view.KeyEvent r3) {
            r1 = this;
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r2 >= r0) goto L3e
            boolean r2 = r3.isCtrlPressed()
            if (r2 != 0) goto L3e
            int r2 = r3.getMetaState()
            boolean r2 = android.view.KeyEvent.metaStateHasNoModifiers(r2)
            if (r2 != 0) goto L3e
            int r2 = r3.getRepeatCount()
            if (r2 != 0) goto L3e
            int r2 = r3.getKeyCode()
            boolean r2 = android.view.KeyEvent.isModifierKey(r2)
            if (r2 != 0) goto L3e
            android.view.Window r1 = r1.getWindow()
            if (r1 == 0) goto L3e
            android.view.View r2 = r1.getDecorView()
            if (r2 == 0) goto L3e
            android.view.View r1 = r1.getDecorView()
            boolean r1 = r1.dispatchKeyShortcutEvent(r3)
            if (r1 == 0) goto L3e
            r1 = 1
            return r1
        L3e:
            r1 = 0
            return r1
    }

    @Override // android.support.v7.app.d
    public b.b.d.d.b a(b.b.d.d.b.a r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    public void a(android.content.Intent r1) {
            r0 = this;
            android.support.v4.app.t.a(r0, r1)
            return
    }

    public void a(android.support.v4.app.y r1) {
            r0 = this;
            r1.a(r0)
            return
    }

    @Override // android.support.v7.app.d
    public void a(b.b.d.d.b r1) {
            r0 = this;
            return
    }

    @Override // android.app.Activity
    public void addContentView(android.view.View r1, android.view.ViewGroup.LayoutParams r2) {
            r0 = this;
            android.support.v7.app.e r0 = r0.h()
            r0.a(r1, r2)
            return
    }

    public void b(android.support.v4.app.y r1) {
            r0 = this;
            return
    }

    @Override // android.support.v7.app.d
    public void b(b.b.d.d.b r1) {
            r0 = this;
            return
    }

    public boolean b(android.content.Intent r1) {
            r0 = this;
            boolean r0 = android.support.v4.app.t.b(r0, r1)
            return r0
    }

    @Override // android.support.v4.app.y.a
    public android.content.Intent c() {
            r0 = this;
            android.content.Intent r0 = android.support.v4.app.t.a(r0)
            return r0
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
            r3 = this;
            android.support.v7.app.a r0 = r3.i()
            android.view.Window r1 = r3.getWindow()
            r2 = 0
            boolean r1 = r1.hasFeature(r2)
            if (r1 == 0) goto L1a
            if (r0 == 0) goto L17
            boolean r0 = r0.e()
            if (r0 != 0) goto L1a
        L17:
            super.closeOptionsMenu()
        L1a:
            return
    }

    @Override // android.support.v4.app.x, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r4) {
            r3 = this;
            int r0 = r4.getKeyCode()
            android.support.v7.app.a r1 = r3.i()
            r2 = 82
            if (r0 != r2) goto L16
            if (r1 == 0) goto L16
            boolean r0 = r1.a(r4)
            if (r0 == 0) goto L16
            r3 = 1
            return r3
        L16:
            boolean r3 = super.dispatchKeyEvent(r4)
            return r3
    }

    @Override // android.app.Activity
    public <T extends android.view.View> T findViewById(int r1) {
            r0 = this;
            android.support.v7.app.e r0 = r0.h()
            android.view.View r0 = r0.a(r1)
            return r0
    }

    @Override // android.support.v4.app.f
    public void g() {
            r0 = this;
            android.support.v7.app.e r0 = r0.h()
            r0.e()
            return
    }

    @Override // android.app.Activity
    public android.view.MenuInflater getMenuInflater() {
            r0 = this;
            android.support.v7.app.e r0 = r0.h()
            android.view.MenuInflater r0 = r0.b()
            return r0
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
            r2 = this;
            android.content.res.Resources r0 = r2.p
            if (r0 != 0) goto L15
            boolean r0 = android.support.v7.widget.y0.b()
            if (r0 == 0) goto L15
            android.support.v7.widget.y0 r0 = new android.support.v7.widget.y0
            android.content.res.Resources r1 = super.getResources()
            r0.<init>(r2, r1)
            r2.p = r0
        L15:
            android.content.res.Resources r0 = r2.p
            if (r0 != 0) goto L1d
            android.content.res.Resources r0 = super.getResources()
        L1d:
            return r0
    }

    public android.support.v7.app.e h() {
            r1 = this;
            android.support.v7.app.e r0 = r1.n
            if (r0 != 0) goto La
            android.support.v7.app.e r0 = android.support.v7.app.e.a(r1, r1)
            r1.n = r0
        La:
            android.support.v7.app.e r1 = r1.n
            return r1
    }

    public android.support.v7.app.a i() {
            r0 = this;
            android.support.v7.app.e r0 = r0.h()
            android.support.v7.app.a r0 = r0.c()
            return r0
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
            r0 = this;
            android.support.v7.app.e r0 = r0.h()
            r0.e()
            return
    }

    @java.lang.Deprecated
    public void j() {
            r0 = this;
            return
    }

    public boolean k() {
            r2 = this;
            android.content.Intent r0 = r2.c()
            if (r0 == 0) goto L26
            boolean r1 = r2.b(r0)
            if (r1 == 0) goto L21
            android.support.v4.app.y r0 = android.support.v4.app.y.a(r2)
            r2.a(r0)
            r2.b(r0)
            r0.a()
            android.support.v4.app.a.a(r2)     // Catch: java.lang.IllegalStateException -> L1d
            goto L24
        L1d:
            r2.finish()
            goto L24
        L21:
            r2.a(r0)
        L24:
            r2 = 1
            return r2
        L26:
            r2 = 0
            return r2
    }

    @Override // android.support.v4.app.f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration r2) {
            r1 = this;
            super.onConfigurationChanged(r2)
            android.support.v7.app.e r0 = r1.h()
            r0.a(r2)
            android.content.res.Resources r0 = r1.p
            if (r0 == 0) goto L1b
            android.content.res.Resources r0 = super.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            android.content.res.Resources r1 = r1.p
            r1.updateConfiguration(r2, r0)
        L1b:
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
            r0 = this;
            r0.j()
            return
    }

    @Override // android.support.v4.app.f, android.support.v4.app.x, android.app.Activity
    protected void onCreate(android.os.Bundle r4) {
            r3 = this;
            android.support.v7.app.e r0 = r3.h()
            r0.d()
            r0.a(r4)
            boolean r0 = r0.a()
            if (r0 == 0) goto L28
            int r0 = r3.o
            if (r0 == 0) goto L28
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L25
            android.content.res.Resources$Theme r0 = r3.getTheme()
            int r1 = r3.o
            r2 = 0
            r3.onApplyThemeResource(r0, r1, r2)
            goto L28
        L25:
            r3.setTheme(r0)
        L28:
            super.onCreate(r4)
            return
    }

    @Override // android.support.v4.app.f, android.app.Activity
    protected void onDestroy() {
            r0 = this;
            super.onDestroy()
            android.support.v7.app.e r0 = r0.h()
            r0.f()
            return
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int r2, android.view.KeyEvent r3) {
            r1 = this;
            boolean r0 = r1.a(r2, r3)
            if (r0 == 0) goto L8
            r1 = 1
            return r1
        L8:
            boolean r1 = super.onKeyDown(r2, r3)
            return r1
    }

    @Override // android.support.v4.app.f, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int r2, android.view.MenuItem r3) {
            r1 = this;
            boolean r2 = super.onMenuItemSelected(r2, r3)
            if (r2 == 0) goto L8
            r1 = 1
            return r1
        L8:
            android.support.v7.app.a r2 = r1.i()
            int r3 = r3.getItemId()
            r0 = 16908332(0x102002c, float:2.3877352E-38)
            if (r3 != r0) goto L24
            if (r2 == 0) goto L24
            int r2 = r2.g()
            r2 = r2 & 4
            if (r2 == 0) goto L24
            boolean r1 = r1.k()
            return r1
        L24:
            r1 = 0
            return r1
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int r1, android.view.Menu r2) {
            r0 = this;
            boolean r0 = super.onMenuOpened(r1, r2)
            return r0
    }

    @Override // android.support.v4.app.f, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int r1, android.view.Menu r2) {
            r0 = this;
            super.onPanelClosed(r1, r2)
            return
    }

    @Override // android.app.Activity
    protected void onPostCreate(android.os.Bundle r1) {
            r0 = this;
            super.onPostCreate(r1)
            android.support.v7.app.e r0 = r0.h()
            r0.b(r1)
            return
    }

    @Override // android.support.v4.app.f, android.app.Activity
    protected void onPostResume() {
            r0 = this;
            super.onPostResume()
            android.support.v7.app.e r0 = r0.h()
            r0.g()
            return
    }

    @Override // android.support.v4.app.f, android.support.v4.app.x, android.app.Activity
    protected void onSaveInstanceState(android.os.Bundle r1) {
            r0 = this;
            super.onSaveInstanceState(r1)
            android.support.v7.app.e r0 = r0.h()
            r0.c(r1)
            return
    }

    @Override // android.support.v4.app.f, android.app.Activity
    protected void onStart() {
            r0 = this;
            super.onStart()
            android.support.v7.app.e r0 = r0.h()
            r0.h()
            return
    }

    @Override // android.support.v4.app.f, android.app.Activity
    protected void onStop() {
            r0 = this;
            super.onStop()
            android.support.v7.app.e r0 = r0.h()
            r0.i()
            return
    }

    @Override // android.app.Activity
    protected void onTitleChanged(java.lang.CharSequence r1, int r2) {
            r0 = this;
            super.onTitleChanged(r1, r2)
            android.support.v7.app.e r0 = r0.h()
            r0.a(r1)
            return
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
            r3 = this;
            android.support.v7.app.a r0 = r3.i()
            android.view.Window r1 = r3.getWindow()
            r2 = 0
            boolean r1 = r1.hasFeature(r2)
            if (r1 == 0) goto L1a
            if (r0 == 0) goto L17
            boolean r0 = r0.k()
            if (r0 != 0) goto L1a
        L17:
            super.openOptionsMenu()
        L1a:
            return
    }

    @Override // android.app.Activity
    public void setContentView(int r1) {
            r0 = this;
            android.support.v7.app.e r0 = r0.h()
            r0.c(r1)
            return
    }

    @Override // android.app.Activity
    public void setContentView(android.view.View r1) {
            r0 = this;
            android.support.v7.app.e r0 = r0.h()
            r0.a(r1)
            return
    }

    @Override // android.app.Activity
    public void setContentView(android.view.View r1, android.view.ViewGroup.LayoutParams r2) {
            r0 = this;
            android.support.v7.app.e r0 = r0.h()
            r0.b(r1, r2)
            return
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int r1) {
            r0 = this;
            super.setTheme(r1)
            r0.o = r1
            return
    }
}
