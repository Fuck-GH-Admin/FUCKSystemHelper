package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
public class u0 implements android.support.v7.widget.b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    android.support.v7.widget.Toolbar f924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.view.View f926c;
    private android.view.View d;
    private android.graphics.drawable.Drawable e;
    private android.graphics.drawable.Drawable f;
    private android.graphics.drawable.Drawable g;
    private boolean h;
    java.lang.CharSequence i;
    private java.lang.CharSequence j;
    private java.lang.CharSequence k;
    android.view.Window.Callback l;
    boolean m;
    private android.support.v7.widget.c n;
    private int o;
    private int p;
    private android.graphics.drawable.Drawable q;

    class a implements android.view.View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final android.support.v7.view.menu.a f927b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.support.v7.widget.u0 f928c;

        a(android.support.v7.widget.u0 r8) {
                r7 = this;
                r7.f928c = r8
                r7.<init>()
                android.support.v7.view.menu.a r8 = new android.support.v7.view.menu.a
                android.support.v7.widget.u0 r0 = r7.f928c
                android.support.v7.widget.Toolbar r0 = r0.f924a
                android.content.Context r1 = r0.getContext()
                android.support.v7.widget.u0 r0 = r7.f928c
                java.lang.CharSequence r6 = r0.i
                r2 = 0
                r3 = 16908332(0x102002c, float:2.3877352E-38)
                r4 = 0
                r5 = 0
                r0 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r7.f927b = r8
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                android.support.v7.widget.u0 r2 = r1.f928c
                android.view.Window$Callback r0 = r2.l
                if (r0 == 0) goto L10
                boolean r2 = r2.m
                if (r2 == 0) goto L10
                r2 = 0
                android.support.v7.view.menu.a r1 = r1.f927b
                r0.onMenuItemSelected(r2, r1)
            L10:
                return
        }
    }

    class b extends b.b.c.g.w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f929a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f930b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.support.v7.widget.u0 f931c;

        b(android.support.v7.widget.u0 r1, int r2) {
                r0 = this;
                r0.f931c = r1
                r0.f930b = r2
                r0.<init>()
                r1 = 0
                r0.f929a = r1
                return
        }

        @Override // b.b.c.g.v
        public void a(android.view.View r1) {
                r0 = this;
                boolean r1 = r0.f929a
                if (r1 != 0) goto Ld
                android.support.v7.widget.u0 r1 = r0.f931c
                android.support.v7.widget.Toolbar r1 = r1.f924a
                int r0 = r0.f930b
                r1.setVisibility(r0)
            Ld:
                return
        }

        @Override // b.b.c.g.w, b.b.c.g.v
        public void b(android.view.View r1) {
                r0 = this;
                android.support.v7.widget.u0 r0 = r0.f931c
                android.support.v7.widget.Toolbar r0 = r0.f924a
                r1 = 0
                r0.setVisibility(r1)
                return
        }

        @Override // b.b.c.g.w, b.b.c.g.v
        public void c(android.view.View r1) {
                r0 = this;
                r1 = 1
                r0.f929a = r1
                return
        }
    }

    public u0(android.support.v7.widget.Toolbar r3, boolean r4) {
            r2 = this;
            int r0 = b.b.d.a.h.abc_action_bar_up_description
            int r1 = b.b.d.a.e.abc_ic_ab_back_material
            r2.<init>(r3, r4, r0, r1)
            return
    }

    public u0(android.support.v7.widget.Toolbar r4, boolean r5, int r6, int r7) {
            r3 = this;
            r3.<init>()
            r7 = 0
            r3.o = r7
            r3.p = r7
            r3.f924a = r4
            java.lang.CharSequence r0 = r4.getTitle()
            r3.i = r0
            java.lang.CharSequence r0 = r4.getSubtitle()
            r3.j = r0
            java.lang.CharSequence r0 = r3.i
            if (r0 == 0) goto L1c
            r0 = 1
            goto L1d
        L1c:
            r0 = r7
        L1d:
            r3.h = r0
            android.graphics.drawable.Drawable r0 = r4.getNavigationIcon()
            r3.g = r0
            android.content.Context r4 = r4.getContext()
            r0 = 0
            int[] r1 = b.b.d.a.j.ActionBar
            int r2 = b.b.d.a.a.actionBarStyle
            android.support.v7.widget.t0 r4 = android.support.v7.widget.t0.a(r4, r0, r1, r2, r7)
            int r0 = b.b.d.a.j.ActionBar_homeAsUpIndicator
            android.graphics.drawable.Drawable r0 = r4.b(r0)
            r3.q = r0
            if (r5 == 0) goto L109
            int r5 = b.b.d.a.j.ActionBar_title
            java.lang.CharSequence r5 = r4.e(r5)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L4b
            r3.c(r5)
        L4b:
            int r5 = b.b.d.a.j.ActionBar_subtitle
            java.lang.CharSequence r5 = r4.e(r5)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L5a
            r3.b(r5)
        L5a:
            int r5 = b.b.d.a.j.ActionBar_logo
            android.graphics.drawable.Drawable r5 = r4.b(r5)
            if (r5 == 0) goto L65
            r3.a(r5)
        L65:
            int r5 = b.b.d.a.j.ActionBar_icon
            android.graphics.drawable.Drawable r5 = r4.b(r5)
            if (r5 == 0) goto L70
            r3.setIcon(r5)
        L70:
            android.graphics.drawable.Drawable r5 = r3.g
            if (r5 != 0) goto L7b
            android.graphics.drawable.Drawable r5 = r3.q
            if (r5 == 0) goto L7b
            r3.b(r5)
        L7b:
            int r5 = b.b.d.a.j.ActionBar_displayOptions
            int r5 = r4.d(r5, r7)
            r3.c(r5)
            int r5 = b.b.d.a.j.ActionBar_customNavigationLayout
            int r5 = r4.g(r5, r7)
            if (r5 == 0) goto La6
            android.support.v7.widget.Toolbar r0 = r3.f924a
            android.content.Context r0 = r0.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            android.support.v7.widget.Toolbar r1 = r3.f924a
            android.view.View r5 = r0.inflate(r5, r1, r7)
            r3.a(r5)
            int r5 = r3.f925b
            r5 = r5 | 16
            r3.c(r5)
        La6:
            int r5 = b.b.d.a.j.ActionBar_height
            int r5 = r4.f(r5, r7)
            if (r5 <= 0) goto Lbb
            android.support.v7.widget.Toolbar r0 = r3.f924a
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r0.height = r5
            android.support.v7.widget.Toolbar r5 = r3.f924a
            r5.setLayoutParams(r0)
        Lbb:
            int r5 = b.b.d.a.j.ActionBar_contentInsetStart
            r0 = -1
            int r5 = r4.b(r5, r0)
            int r1 = b.b.d.a.j.ActionBar_contentInsetEnd
            int r0 = r4.b(r1, r0)
            if (r5 >= 0) goto Lcc
            if (r0 < 0) goto Ld9
        Lcc:
            android.support.v7.widget.Toolbar r1 = r3.f924a
            int r5 = java.lang.Math.max(r5, r7)
            int r0 = java.lang.Math.max(r0, r7)
            r1.a(r5, r0)
        Ld9:
            int r5 = b.b.d.a.j.ActionBar_titleTextStyle
            int r5 = r4.g(r5, r7)
            if (r5 == 0) goto Lea
            android.support.v7.widget.Toolbar r0 = r3.f924a
            android.content.Context r1 = r0.getContext()
            r0.b(r1, r5)
        Lea:
            int r5 = b.b.d.a.j.ActionBar_subtitleTextStyle
            int r5 = r4.g(r5, r7)
            if (r5 == 0) goto Lfb
            android.support.v7.widget.Toolbar r0 = r3.f924a
            android.content.Context r1 = r0.getContext()
            r0.a(r1, r5)
        Lfb:
            int r5 = b.b.d.a.j.ActionBar_popupTheme
            int r5 = r4.g(r5, r7)
            if (r5 == 0) goto L10f
            android.support.v7.widget.Toolbar r7 = r3.f924a
            r7.setPopupTheme(r5)
            goto L10f
        L109:
            int r5 = r3.o()
            r3.f925b = r5
        L10f:
            r4.a()
            r3.d(r6)
            android.support.v7.widget.Toolbar r4 = r3.f924a
            java.lang.CharSequence r4 = r4.getNavigationContentDescription()
            r3.k = r4
            android.support.v7.widget.Toolbar r4 = r3.f924a
            android.support.v7.widget.u0$a r5 = new android.support.v7.widget.u0$a
            r5.<init>(r3)
            r4.setNavigationOnClickListener(r5)
            return
    }

    private void d(java.lang.CharSequence r2) {
            r1 = this;
            r1.i = r2
            int r0 = r1.f925b
            r0 = r0 & 8
            if (r0 == 0) goto Ld
            android.support.v7.widget.Toolbar r1 = r1.f924a
            r1.setTitle(r2)
        Ld:
            return
    }

    private int o() {
            r2 = this;
            android.support.v7.widget.Toolbar r0 = r2.f924a
            android.graphics.drawable.Drawable r0 = r0.getNavigationIcon()
            if (r0 == 0) goto L13
            r0 = 15
            android.support.v7.widget.Toolbar r1 = r2.f924a
            android.graphics.drawable.Drawable r1 = r1.getNavigationIcon()
            r2.q = r1
            goto L15
        L13:
            r0 = 11
        L15:
            return r0
    }

    private void p() {
            r1 = this;
            int r0 = r1.f925b
            r0 = r0 & 4
            if (r0 == 0) goto L1d
            java.lang.CharSequence r0 = r1.k
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L16
            android.support.v7.widget.Toolbar r0 = r1.f924a
            int r1 = r1.p
            r0.setNavigationContentDescription(r1)
            goto L1d
        L16:
            android.support.v7.widget.Toolbar r0 = r1.f924a
            java.lang.CharSequence r1 = r1.k
            r0.setNavigationContentDescription(r1)
        L1d:
            return
    }

    private void q() {
            r2 = this;
            int r0 = r2.f925b
            r0 = r0 & 4
            if (r0 == 0) goto L13
            android.support.v7.widget.Toolbar r0 = r2.f924a
            android.graphics.drawable.Drawable r1 = r2.g
            if (r1 == 0) goto Ld
            goto Lf
        Ld:
            android.graphics.drawable.Drawable r1 = r2.q
        Lf:
            r0.setNavigationIcon(r1)
            goto L19
        L13:
            android.support.v7.widget.Toolbar r2 = r2.f924a
            r0 = 0
            r2.setNavigationIcon(r0)
        L19:
            return
    }

    private void r() {
            r2 = this;
            int r0 = r2.f925b
            r1 = r0 & 2
            if (r1 == 0) goto L12
            r0 = r0 & 1
            if (r0 == 0) goto Lf
            android.graphics.drawable.Drawable r0 = r2.f
            if (r0 == 0) goto Lf
            goto L13
        Lf:
            android.graphics.drawable.Drawable r0 = r2.e
            goto L13
        L12:
            r0 = 0
        L13:
            android.support.v7.widget.Toolbar r2 = r2.f924a
            r2.setLogo(r0)
            return
    }

    @Override // android.support.v7.widget.b0
    public b.b.c.g.u a(int r3, long r4) {
            r2 = this;
            android.support.v7.widget.Toolbar r0 = r2.f924a
            b.b.c.g.u r0 = b.b.c.g.q.a(r0)
            if (r3 != 0) goto Lb
            r1 = 1065353216(0x3f800000, float:1.0)
            goto Lc
        Lb:
            r1 = 0
        Lc:
            r0.a(r1)
            r0.a(r4)
            android.support.v7.widget.u0$b r4 = new android.support.v7.widget.u0$b
            r4.<init>(r2, r3)
            r0.a(r4)
            return r0
    }

    @Override // android.support.v7.widget.b0
    public void a(int r1) {
            r0 = this;
            android.support.v7.widget.Toolbar r0 = r0.f924a
            r0.setVisibility(r1)
            return
    }

    public void a(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.f = r1
            r0.r()
            return
    }

    @Override // android.support.v7.widget.b0
    public void a(android.support.v7.widget.m0 r3) {
            r2 = this;
            android.view.View r0 = r2.f926c
            if (r0 == 0) goto L11
            android.view.ViewParent r0 = r0.getParent()
            android.support.v7.widget.Toolbar r1 = r2.f924a
            if (r0 != r1) goto L11
            android.view.View r0 = r2.f926c
            r1.removeView(r0)
        L11:
            r2.f926c = r3
            if (r3 == 0) goto L36
            int r0 = r2.o
            r1 = 2
            if (r0 != r1) goto L36
            android.support.v7.widget.Toolbar r0 = r2.f924a
            r1 = 0
            r0.addView(r3, r1)
            android.view.View r2 = r2.f926c
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.support.v7.widget.Toolbar$e r2 = (android.support.v7.widget.Toolbar.e) r2
            r0 = -2
            r2.width = r0
            r2.height = r0
            r0 = 8388691(0x800053, float:1.175506E-38)
            r2.f689a = r0
            r2 = 1
            r3.setAllowCollapse(r2)
        L36:
            return
    }

    @Override // android.support.v7.widget.b0
    public void a(android.view.Menu r3, android.support.v7.view.menu.o.a r4) {
            r2 = this;
            android.support.v7.widget.c r0 = r2.n
            if (r0 != 0) goto L16
            android.support.v7.widget.c r0 = new android.support.v7.widget.c
            android.support.v7.widget.Toolbar r1 = r2.f924a
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1)
            r2.n = r0
            int r1 = b.b.d.a.f.action_menu_presenter
            r0.a(r1)
        L16:
            android.support.v7.widget.c r0 = r2.n
            r0.a(r4)
            android.support.v7.widget.Toolbar r4 = r2.f924a
            android.support.v7.view.menu.h r3 = (android.support.v7.view.menu.h) r3
            android.support.v7.widget.c r2 = r2.n
            r4.a(r3, r2)
            return
    }

    public void a(android.view.View r3) {
            r2 = this;
            android.view.View r0 = r2.d
            if (r0 == 0) goto Lf
            int r1 = r2.f925b
            r1 = r1 & 16
            if (r1 == 0) goto Lf
            android.support.v7.widget.Toolbar r1 = r2.f924a
            r1.removeView(r0)
        Lf:
            r2.d = r3
            if (r3 == 0) goto L1e
            int r0 = r2.f925b
            r0 = r0 & 16
            if (r0 == 0) goto L1e
            android.support.v7.widget.Toolbar r2 = r2.f924a
            r2.addView(r3)
        L1e:
            return
    }

    public void a(java.lang.CharSequence r1) {
            r0 = this;
            r0.k = r1
            r0.p()
            return
    }

    @Override // android.support.v7.widget.b0
    public void a(boolean r1) {
            r0 = this;
            return
    }

    @Override // android.support.v7.widget.b0
    public boolean a() {
            r0 = this;
            android.support.v7.widget.Toolbar r0 = r0.f924a
            boolean r0 = r0.k()
            return r0
    }

    @Override // android.support.v7.widget.b0
    public void b(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.m()
            android.graphics.drawable.Drawable r2 = b.b.d.b.a.a.c(r0, r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.a(r2)
            return
    }

    public void b(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.g = r1
            r0.q()
            return
    }

    public void b(java.lang.CharSequence r2) {
            r1 = this;
            r1.j = r2
            int r0 = r1.f925b
            r0 = r0 & 8
            if (r0 == 0) goto Ld
            android.support.v7.widget.Toolbar r1 = r1.f924a
            r1.setSubtitle(r2)
        Ld:
            return
    }

    @Override // android.support.v7.widget.b0
    public void b(boolean r1) {
            r0 = this;
            android.support.v7.widget.Toolbar r0 = r0.f924a
            r0.setCollapsible(r1)
            return
    }

    @Override // android.support.v7.widget.b0
    public boolean b() {
            r0 = this;
            android.support.v7.widget.Toolbar r0 = r0.f924a
            boolean r0 = r0.h()
            return r0
    }

    @Override // android.support.v7.widget.b0
    public void c() {
            r1 = this;
            r0 = 1
            r1.m = r0
            return
    }

    @Override // android.support.v7.widget.b0
    public void c(int r4) {
            r3 = this;
            int r0 = r3.f925b
            r0 = r0 ^ r4
            r3.f925b = r4
            if (r0 == 0) goto L50
            r1 = r0 & 4
            if (r1 == 0) goto L15
            r1 = r4 & 4
            if (r1 == 0) goto L12
            r3.p()
        L12:
            r3.q()
        L15:
            r1 = r0 & 3
            if (r1 == 0) goto L1c
            r3.r()
        L1c:
            r1 = r0 & 8
            if (r1 == 0) goto L3b
            r1 = r4 & 8
            if (r1 == 0) goto L30
            android.support.v7.widget.Toolbar r1 = r3.f924a
            java.lang.CharSequence r2 = r3.i
            r1.setTitle(r2)
            android.support.v7.widget.Toolbar r1 = r3.f924a
            java.lang.CharSequence r2 = r3.j
            goto L38
        L30:
            android.support.v7.widget.Toolbar r1 = r3.f924a
            r2 = 0
            r1.setTitle(r2)
            android.support.v7.widget.Toolbar r1 = r3.f924a
        L38:
            r1.setSubtitle(r2)
        L3b:
            r0 = r0 & 16
            if (r0 == 0) goto L50
            android.view.View r0 = r3.d
            if (r0 == 0) goto L50
            r4 = r4 & 16
            android.support.v7.widget.Toolbar r3 = r3.f924a
            if (r4 == 0) goto L4d
            r3.addView(r0)
            goto L50
        L4d:
            r3.removeView(r0)
        L50:
            return
    }

    public void c(java.lang.CharSequence r2) {
            r1 = this;
            r0 = 1
            r1.h = r0
            r1.d(r2)
            return
    }

    @Override // android.support.v7.widget.b0
    public void collapseActionView() {
            r0 = this;
            android.support.v7.widget.Toolbar r0 = r0.f924a
            r0.c()
            return
    }

    public void d(int r2) {
            r1 = this;
            int r0 = r1.p
            if (r2 != r0) goto L5
            return
        L5:
            r1.p = r2
            android.support.v7.widget.Toolbar r2 = r1.f924a
            java.lang.CharSequence r2 = r2.getNavigationContentDescription()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L18
            int r2 = r1.p
            r1.e(r2)
        L18:
            return
    }

    @Override // android.support.v7.widget.b0
    public boolean d() {
            r0 = this;
            android.support.v7.widget.Toolbar r0 = r0.f924a
            boolean r0 = r0.i()
            return r0
    }

    public void e(int r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            goto Lc
        L4:
            android.content.Context r0 = r1.m()
            java.lang.String r2 = r0.getString(r2)
        Lc:
            r1.a(r2)
            return
    }

    @Override // android.support.v7.widget.b0
    public boolean e() {
            r0 = this;
            android.support.v7.widget.Toolbar r0 = r0.f924a
            boolean r0 = r0.b()
            return r0
    }

    @Override // android.support.v7.widget.b0
    public boolean f() {
            r0 = this;
            android.support.v7.widget.Toolbar r0 = r0.f924a
            boolean r0 = r0.g()
            return r0
    }

    @Override // android.support.v7.widget.b0
    public void g() {
            r0 = this;
            android.support.v7.widget.Toolbar r0 = r0.f924a
            r0.d()
            return
    }

    @Override // android.support.v7.widget.b0
    public java.lang.CharSequence getTitle() {
            r0 = this;
            android.support.v7.widget.Toolbar r0 = r0.f924a
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    @Override // android.support.v7.widget.b0
    public int h() {
            r0 = this;
            int r0 = r0.f925b
            return r0
    }

    @Override // android.support.v7.widget.b0
    public void i() {
            r1 = this;
            java.lang.String r1 = "ToolbarWidgetWrapper"
            java.lang.String r0 = "Progress display unsupported"
            android.util.Log.i(r1, r0)
            return
    }

    @Override // android.support.v7.widget.b0
    public boolean j() {
            r0 = this;
            android.support.v7.widget.Toolbar r0 = r0.f924a
            boolean r0 = r0.f()
            return r0
    }

    @Override // android.support.v7.widget.b0
    public android.view.ViewGroup k() {
            r0 = this;
            android.support.v7.widget.Toolbar r0 = r0.f924a
            return r0
    }

    @Override // android.support.v7.widget.b0
    public void l() {
            r1 = this;
            java.lang.String r1 = "ToolbarWidgetWrapper"
            java.lang.String r0 = "Progress display unsupported"
            android.util.Log.i(r1, r0)
            return
    }

    @Override // android.support.v7.widget.b0
    public android.content.Context m() {
            r0 = this;
            android.support.v7.widget.Toolbar r0 = r0.f924a
            android.content.Context r0 = r0.getContext()
            return r0
    }

    @Override // android.support.v7.widget.b0
    public int n() {
            r0 = this;
            int r0 = r0.o
            return r0
    }

    @Override // android.support.v7.widget.b0
    public void setIcon(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.m()
            android.graphics.drawable.Drawable r2 = b.b.d.b.a.a.c(r0, r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setIcon(r2)
            return
    }

    @Override // android.support.v7.widget.b0
    public void setIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.e = r1
            r0.r()
            return
    }

    @Override // android.support.v7.widget.b0
    public void setWindowCallback(android.view.Window.Callback r1) {
            r0 = this;
            r0.l = r1
            return
    }

    @Override // android.support.v7.widget.b0
    public void setWindowTitle(java.lang.CharSequence r2) {
            r1 = this;
            boolean r0 = r1.h
            if (r0 != 0) goto L7
            r1.d(r2)
        L7:
            return
    }
}
