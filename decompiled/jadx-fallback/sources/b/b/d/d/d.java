package b.b.d.d;

/* JADX INFO: loaded from: classes.dex */
public class d extends android.content.ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.content.res.Resources.Theme f1162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.view.LayoutInflater f1163c;
    private android.content.res.Configuration d;
    private android.content.res.Resources e;

    public d() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public d(android.content.Context r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            r0.f1161a = r2
            return
    }

    public d(android.content.Context r1, android.content.res.Resources.Theme r2) {
            r0 = this;
            r0.<init>(r1)
            r0.f1162b = r2
            return
    }

    private android.content.res.Resources b() {
            r3 = this;
            android.content.res.Resources r0 = r3.e
            if (r0 != 0) goto L1e
            android.content.res.Configuration r0 = r3.d
            if (r0 != 0) goto Lf
            android.content.res.Resources r0 = super.getResources()
        Lc:
            r3.e = r0
            goto L1e
        Lf:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 17
            if (r1 < r2) goto L1e
            android.content.Context r0 = r3.createConfigurationContext(r0)
            android.content.res.Resources r0 = r0.getResources()
            goto Lc
        L1e:
            android.content.res.Resources r3 = r3.e
            return r3
    }

    private void c() {
            r3 = this;
            android.content.res.Resources$Theme r0 = r3.f1162b
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto L22
            android.content.res.Resources r1 = r3.getResources()
            android.content.res.Resources$Theme r1 = r1.newTheme()
            r3.f1162b = r1
            android.content.Context r1 = r3.getBaseContext()
            android.content.res.Resources$Theme r1 = r1.getTheme()
            if (r1 == 0) goto L22
            android.content.res.Resources$Theme r2 = r3.f1162b
            r2.setTo(r1)
        L22:
            android.content.res.Resources$Theme r1 = r3.f1162b
            int r2 = r3.f1161a
            r3.a(r1, r2, r0)
            return
    }

    public int a() {
            r0 = this;
            int r0 = r0.f1161a
            return r0
    }

    protected void a(android.content.res.Resources.Theme r1, int r2, boolean r3) {
            r0 = this;
            r0 = 1
            r1.applyStyle(r2, r0)
            return
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(android.content.Context r1) {
            r0 = this;
            super.attachBaseContext(r1)
            return
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.AssetManager getAssets() {
            r0 = this;
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.AssetManager r0 = r0.getAssets()
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
            r0 = this;
            android.content.res.Resources r0 = r0.b()
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "layout_inflater"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1d
            android.view.LayoutInflater r2 = r1.f1163c
            if (r2 != 0) goto L1a
            android.content.Context r2 = r1.getBaseContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            android.view.LayoutInflater r2 = r2.cloneInContext(r1)
            r1.f1163c = r2
        L1a:
            android.view.LayoutInflater r1 = r1.f1163c
            return r1
        L1d:
            android.content.Context r1 = r1.getBaseContext()
            java.lang.Object r1 = r1.getSystemService(r2)
            return r1
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources.Theme getTheme() {
            r1 = this;
            android.content.res.Resources$Theme r0 = r1.f1162b
            if (r0 == 0) goto L5
            return r0
        L5:
            int r0 = r1.f1161a
            if (r0 != 0) goto Ld
            int r0 = b.b.d.a.i.Theme_AppCompat_Light
            r1.f1161a = r0
        Ld:
            r1.c()
            android.content.res.Resources$Theme r1 = r1.f1162b
            return r1
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int r2) {
            r1 = this;
            int r0 = r1.f1161a
            if (r0 == r2) goto L9
            r1.f1161a = r2
            r1.c()
        L9:
            return
    }
}
