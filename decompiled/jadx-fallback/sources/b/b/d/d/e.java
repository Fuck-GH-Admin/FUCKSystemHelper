package b.b.d.d;

/* JADX INFO: loaded from: classes.dex */
public class e extends b.b.d.d.b implements android.support.v7.view.menu.h.a {
    private android.content.Context d;
    private android.support.v7.widget.ActionBarContextView e;
    private b.b.d.d.b.a f;
    private java.lang.ref.WeakReference<android.view.View> g;
    private boolean h;
    private android.support.v7.view.menu.h i;

    public e(android.content.Context r1, android.support.v7.widget.ActionBarContextView r2, b.b.d.d.b.a r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.d = r1
            r0.e = r2
            r0.f = r3
            android.support.v7.view.menu.h r1 = new android.support.v7.view.menu.h
            android.content.Context r2 = r2.getContext()
            r1.<init>(r2)
            r2 = 1
            r1.c(r2)
            r0.i = r1
            r1.a(r0)
            return
    }

    @Override // b.b.d.d.b
    public void a() {
            r2 = this;
            boolean r0 = r2.h
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r2.h = r0
            android.support.v7.widget.ActionBarContextView r0 = r2.e
            r1 = 32
            r0.sendAccessibilityEvent(r1)
            b.b.d.d.b$a r0 = r2.f
            r0.a(r2)
            return
    }

    @Override // b.b.d.d.b
    public void a(int r2) {
            r1 = this;
            android.content.Context r0 = r1.d
            java.lang.String r2 = r0.getString(r2)
            r1.a(r2)
            return
    }

    @Override // android.support.v7.view.menu.h.a
    public void a(android.support.v7.view.menu.h r1) {
            r0 = this;
            r0.i()
            android.support.v7.widget.ActionBarContextView r0 = r0.e
            r0.d()
            return
    }

    @Override // b.b.d.d.b
    public void a(android.view.View r2) {
            r1 = this;
            android.support.v7.widget.ActionBarContextView r0 = r1.e
            r0.setCustomView(r2)
            if (r2 == 0) goto Ld
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            goto Le
        Ld:
            r0 = 0
        Le:
            r1.g = r0
            return
    }

    @Override // b.b.d.d.b
    public void a(java.lang.CharSequence r1) {
            r0 = this;
            android.support.v7.widget.ActionBarContextView r0 = r0.e
            r0.setSubtitle(r1)
            return
    }

    @Override // b.b.d.d.b
    public void a(boolean r1) {
            r0 = this;
            super.a(r1)
            android.support.v7.widget.ActionBarContextView r0 = r0.e
            r0.setTitleOptional(r1)
            return
    }

    @Override // android.support.v7.view.menu.h.a
    public boolean a(android.support.v7.view.menu.h r1, android.view.MenuItem r2) {
            r0 = this;
            b.b.d.d.b$a r1 = r0.f
            boolean r0 = r1.a(r0, r2)
            return r0
    }

    @Override // b.b.d.d.b
    public android.view.View b() {
            r0 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r0.g
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    @Override // b.b.d.d.b
    public void b(int r2) {
            r1 = this;
            android.content.Context r0 = r1.d
            java.lang.String r2 = r0.getString(r2)
            r1.b(r2)
            return
    }

    @Override // b.b.d.d.b
    public void b(java.lang.CharSequence r1) {
            r0 = this;
            android.support.v7.widget.ActionBarContextView r0 = r0.e
            r0.setTitle(r1)
            return
    }

    @Override // b.b.d.d.b
    public android.view.Menu c() {
            r0 = this;
            android.support.v7.view.menu.h r0 = r0.i
            return r0
    }

    @Override // b.b.d.d.b
    public android.view.MenuInflater d() {
            r1 = this;
            b.b.d.d.g r0 = new b.b.d.d.g
            android.support.v7.widget.ActionBarContextView r1 = r1.e
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1)
            return r0
    }

    @Override // b.b.d.d.b
    public java.lang.CharSequence e() {
            r0 = this;
            android.support.v7.widget.ActionBarContextView r0 = r0.e
            java.lang.CharSequence r0 = r0.getSubtitle()
            return r0
    }

    @Override // b.b.d.d.b
    public java.lang.CharSequence g() {
            r0 = this;
            android.support.v7.widget.ActionBarContextView r0 = r0.e
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    @Override // b.b.d.d.b
    public void i() {
            r2 = this;
            b.b.d.d.b$a r0 = r2.f
            android.support.v7.view.menu.h r1 = r2.i
            r0.a(r2, r1)
            return
    }

    @Override // b.b.d.d.b
    public boolean j() {
            r0 = this;
            android.support.v7.widget.ActionBarContextView r0 = r0.e
            boolean r0 = r0.b()
            return r0
    }
}
