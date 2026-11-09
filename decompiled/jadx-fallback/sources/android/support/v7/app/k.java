package android.support.v7.app;

/* JADX INFO: loaded from: classes.dex */
public class k extends android.support.v7.app.a implements android.support.v7.widget.ActionBarOverlayLayout.d {
    private static final android.view.animation.Interpolator B = null;
    private static final android.view.animation.Interpolator C = null;
    final b.b.c.g.x A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    android.content.Context f730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.content.Context f731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    android.support.v7.widget.ActionBarOverlayLayout f732c;
    android.support.v7.widget.ActionBarContainer d;
    android.support.v7.widget.b0 e;
    android.support.v7.widget.ActionBarContextView f;
    android.view.View g;
    android.support.v7.widget.m0 h;
    private boolean i;
    android.support.v7.app.k.d j;
    b.b.d.d.b k;
    b.b.d.d.b.a l;
    private boolean m;
    private java.util.ArrayList<android.support.v7.app.a.b> n;
    private boolean o;
    private int p;
    boolean q;
    boolean r;
    boolean s;
    private boolean t;
    private boolean u;
    b.b.d.d.h v;
    private boolean w;
    boolean x;
    final b.b.c.g.v y;
    final b.b.c.g.v z;

    class a extends b.b.c.g.w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.support.v7.app.k f733a;

        a(android.support.v7.app.k r1) {
                r0 = this;
                r0.f733a = r1
                r0.<init>()
                return
        }

        @Override // b.b.c.g.v
        public void a(android.view.View r2) {
                r1 = this;
                android.support.v7.app.k r2 = r1.f733a
                boolean r0 = r2.q
                if (r0 == 0) goto L15
                android.view.View r2 = r2.g
                if (r2 == 0) goto L15
                r0 = 0
                r2.setTranslationY(r0)
                android.support.v7.app.k r2 = r1.f733a
                android.support.v7.widget.ActionBarContainer r2 = r2.d
                r2.setTranslationY(r0)
            L15:
                android.support.v7.app.k r2 = r1.f733a
                android.support.v7.widget.ActionBarContainer r2 = r2.d
                r0 = 8
                r2.setVisibility(r0)
                android.support.v7.app.k r2 = r1.f733a
                android.support.v7.widget.ActionBarContainer r2 = r2.d
                r0 = 0
                r2.setTransitioning(r0)
                android.support.v7.app.k r2 = r1.f733a
                r0 = 0
                r2.v = r0
                r2.l()
                android.support.v7.app.k r1 = r1.f733a
                android.support.v7.widget.ActionBarOverlayLayout r1 = r1.f732c
                if (r1 == 0) goto L37
                b.b.c.g.q.m(r1)
            L37:
                return
        }
    }

    class b extends b.b.c.g.w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.support.v7.app.k f734a;

        b(android.support.v7.app.k r1) {
                r0 = this;
                r0.f734a = r1
                r0.<init>()
                return
        }

        @Override // b.b.c.g.v
        public void a(android.view.View r1) {
                r0 = this;
                android.support.v7.app.k r0 = r0.f734a
                r1 = 0
                r0.v = r1
                android.support.v7.widget.ActionBarContainer r0 = r0.d
                r0.requestLayout()
                return
        }
    }

    class c implements b.b.c.g.x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.support.v7.app.k f735a;

        c(android.support.v7.app.k r1) {
                r0 = this;
                r0.f735a = r1
                r0.<init>()
                return
        }

        @Override // b.b.c.g.x
        public void a(android.view.View r1) {
                r0 = this;
                android.support.v7.app.k r0 = r0.f735a
                android.support.v7.widget.ActionBarContainer r0 = r0.d
                android.view.ViewParent r0 = r0.getParent()
                android.view.View r0 = (android.view.View) r0
                r0.invalidate()
                return
        }
    }

    public class d extends b.b.d.d.b implements android.support.v7.view.menu.h.a {
        private final android.content.Context d;
        private final android.support.v7.view.menu.h e;
        private b.b.d.d.b.a f;
        private java.lang.ref.WeakReference<android.view.View> g;
        final /* synthetic */ android.support.v7.app.k h;

        public d(android.support.v7.app.k r1, android.content.Context r2, b.b.d.d.b.a r3) {
                r0 = this;
                r0.h = r1
                r0.<init>()
                r0.d = r2
                r0.f = r3
                android.support.v7.view.menu.h r1 = new android.support.v7.view.menu.h
                r1.<init>(r2)
                r2 = 1
                r1.c(r2)
                r0.e = r1
                r1.a(r0)
                return
        }

        @Override // b.b.d.d.b
        public void a() {
                r3 = this;
                android.support.v7.app.k r0 = r3.h
                android.support.v7.app.k$d r1 = r0.j
                if (r1 == r3) goto L7
                return
            L7:
                boolean r1 = r0.r
                boolean r0 = r0.s
                r2 = 0
                boolean r0 = android.support.v7.app.k.a(r1, r0, r2)
                if (r0 != 0) goto L1b
                android.support.v7.app.k r0 = r3.h
                r0.k = r3
                b.b.d.d.b$a r1 = r3.f
                r0.l = r1
                goto L20
            L1b:
                b.b.d.d.b$a r0 = r3.f
                r0.a(r3)
            L20:
                r0 = 0
                r3.f = r0
                android.support.v7.app.k r1 = r3.h
                r1.e(r2)
                android.support.v7.app.k r1 = r3.h
                android.support.v7.widget.ActionBarContextView r1 = r1.f
                r1.a()
                android.support.v7.app.k r1 = r3.h
                android.support.v7.widget.b0 r1 = r1.e
                android.view.ViewGroup r1 = r1.k()
                r2 = 32
                r1.sendAccessibilityEvent(r2)
                android.support.v7.app.k r1 = r3.h
                android.support.v7.widget.ActionBarOverlayLayout r2 = r1.f732c
                boolean r1 = r1.x
                r2.setHideOnContentScrollEnabled(r1)
                android.support.v7.app.k r3 = r3.h
                r3.j = r0
                return
        }

        @Override // b.b.d.d.b
        public void a(int r2) {
                r1 = this;
                android.support.v7.app.k r0 = r1.h
                android.content.Context r0 = r0.f730a
                android.content.res.Resources r0 = r0.getResources()
                java.lang.String r2 = r0.getString(r2)
                r1.a(r2)
                return
        }

        @Override // android.support.v7.view.menu.h.a
        public void a(android.support.v7.view.menu.h r1) {
                r0 = this;
                b.b.d.d.b$a r1 = r0.f
                if (r1 != 0) goto L5
                return
            L5:
                r0.i()
                android.support.v7.app.k r0 = r0.h
                android.support.v7.widget.ActionBarContextView r0 = r0.f
                r0.d()
                return
        }

        @Override // b.b.d.d.b
        public void a(android.view.View r2) {
                r1 = this;
                android.support.v7.app.k r0 = r1.h
                android.support.v7.widget.ActionBarContextView r0 = r0.f
                r0.setCustomView(r2)
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.g = r0
                return
        }

        @Override // b.b.d.d.b
        public void a(java.lang.CharSequence r1) {
                r0 = this;
                android.support.v7.app.k r0 = r0.h
                android.support.v7.widget.ActionBarContextView r0 = r0.f
                r0.setSubtitle(r1)
                return
        }

        @Override // b.b.d.d.b
        public void a(boolean r1) {
                r0 = this;
                super.a(r1)
                android.support.v7.app.k r0 = r0.h
                android.support.v7.widget.ActionBarContextView r0 = r0.f
                r0.setTitleOptional(r1)
                return
        }

        @Override // android.support.v7.view.menu.h.a
        public boolean a(android.support.v7.view.menu.h r1, android.view.MenuItem r2) {
                r0 = this;
                b.b.d.d.b$a r1 = r0.f
                if (r1 == 0) goto L9
                boolean r0 = r1.a(r0, r2)
                return r0
            L9:
                r0 = 0
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
                android.support.v7.app.k r0 = r1.h
                android.content.Context r0 = r0.f730a
                android.content.res.Resources r0 = r0.getResources()
                java.lang.String r2 = r0.getString(r2)
                r1.b(r2)
                return
        }

        @Override // b.b.d.d.b
        public void b(java.lang.CharSequence r1) {
                r0 = this;
                android.support.v7.app.k r0 = r0.h
                android.support.v7.widget.ActionBarContextView r0 = r0.f
                r0.setTitle(r1)
                return
        }

        @Override // b.b.d.d.b
        public android.view.Menu c() {
                r0 = this;
                android.support.v7.view.menu.h r0 = r0.e
                return r0
        }

        @Override // b.b.d.d.b
        public android.view.MenuInflater d() {
                r1 = this;
                b.b.d.d.g r0 = new b.b.d.d.g
                android.content.Context r1 = r1.d
                r0.<init>(r1)
                return r0
        }

        @Override // b.b.d.d.b
        public java.lang.CharSequence e() {
                r0 = this;
                android.support.v7.app.k r0 = r0.h
                android.support.v7.widget.ActionBarContextView r0 = r0.f
                java.lang.CharSequence r0 = r0.getSubtitle()
                return r0
        }

        @Override // b.b.d.d.b
        public java.lang.CharSequence g() {
                r0 = this;
                android.support.v7.app.k r0 = r0.h
                android.support.v7.widget.ActionBarContextView r0 = r0.f
                java.lang.CharSequence r0 = r0.getTitle()
                return r0
        }

        @Override // b.b.d.d.b
        public void i() {
                r2 = this;
                android.support.v7.app.k r0 = r2.h
                android.support.v7.app.k$d r0 = r0.j
                if (r0 == r2) goto L7
                return
            L7:
                android.support.v7.view.menu.h r0 = r2.e
                r0.s()
                b.b.d.d.b$a r0 = r2.f     // Catch: java.lang.Throwable -> L19
                android.support.v7.view.menu.h r1 = r2.e     // Catch: java.lang.Throwable -> L19
                r0.a(r2, r1)     // Catch: java.lang.Throwable -> L19
                android.support.v7.view.menu.h r2 = r2.e
                r2.r()
                return
            L19:
                r0 = move-exception
                android.support.v7.view.menu.h r2 = r2.e
                r2.r()
                throw r0
        }

        @Override // b.b.d.d.b
        public boolean j() {
                r0 = this;
                android.support.v7.app.k r0 = r0.h
                android.support.v7.widget.ActionBarContextView r0 = r0.f
                boolean r0 = r0.b()
                return r0
        }

        public boolean k() {
                r2 = this;
                android.support.v7.view.menu.h r0 = r2.e
                r0.s()
                b.b.d.d.b$a r0 = r2.f     // Catch: java.lang.Throwable -> L13
                android.support.v7.view.menu.h r1 = r2.e     // Catch: java.lang.Throwable -> L13
                boolean r0 = r0.b(r2, r1)     // Catch: java.lang.Throwable -> L13
                android.support.v7.view.menu.h r2 = r2.e
                r2.r()
                return r0
            L13:
                r0 = move-exception
                android.support.v7.view.menu.h r2 = r2.e
                r2.r()
                throw r0
        }
    }

    static {
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>()
            android.support.v7.app.k.B = r0
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            android.support.v7.app.k.C = r0
            return
    }

    public k(android.app.Activity r2, boolean r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.n = r0
            r0 = 0
            r1.p = r0
            r0 = 1
            r1.q = r0
            r1.u = r0
            android.support.v7.app.k$a r0 = new android.support.v7.app.k$a
            r0.<init>(r1)
            r1.y = r0
            android.support.v7.app.k$b r0 = new android.support.v7.app.k$b
            r0.<init>(r1)
            r1.z = r0
            android.support.v7.app.k$c r0 = new android.support.v7.app.k$c
            r0.<init>(r1)
            r1.A = r0
            android.view.Window r2 = r2.getWindow()
            android.view.View r2 = r2.getDecorView()
            r1.b(r2)
            if (r3 != 0) goto L42
            r3 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r2 = r2.findViewById(r3)
            r1.g = r2
        L42:
            return
    }

    public k(android.app.Dialog r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.n = r0
            r0 = 0
            r1.p = r0
            r0 = 1
            r1.q = r0
            r1.u = r0
            android.support.v7.app.k$a r0 = new android.support.v7.app.k$a
            r0.<init>(r1)
            r1.y = r0
            android.support.v7.app.k$b r0 = new android.support.v7.app.k$b
            r0.<init>(r1)
            r1.z = r0
            android.support.v7.app.k$c r0 = new android.support.v7.app.k$c
            r0.<init>(r1)
            r1.A = r0
            android.view.Window r2 = r2.getWindow()
            android.view.View r2 = r2.getDecorView()
            r1.b(r2)
            return
    }

    private android.support.v7.widget.b0 a(android.view.View r3) {
            r2 = this;
            boolean r2 = r3 instanceof android.support.v7.widget.b0
            if (r2 == 0) goto L7
            android.support.v7.widget.b0 r3 = (android.support.v7.widget.b0) r3
            return r3
        L7:
            boolean r2 = r3 instanceof android.support.v7.widget.Toolbar
            if (r2 == 0) goto L12
            android.support.v7.widget.Toolbar r3 = (android.support.v7.widget.Toolbar) r3
            android.support.v7.widget.b0 r2 = r3.getWrapper()
            return r2
        L12:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Can't make a decor toolbar out of "
            r0.append(r1)
            if (r3 == 0) goto L29
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getSimpleName()
            goto L2b
        L29:
            java.lang.String r3 = "null"
        L2b:
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    static boolean a(boolean r1, boolean r2, boolean r3) {
            r0 = 1
            if (r3 == 0) goto L4
            return r0
        L4:
            if (r1 != 0) goto La
            if (r2 == 0) goto L9
            goto La
        L9:
            return r0
        La:
            r1 = 0
            return r1
    }

    private void b(android.view.View r6) {
            r5 = this;
            int r0 = b.b.d.a.f.decor_content_parent
            android.view.View r0 = r6.findViewById(r0)
            android.support.v7.widget.ActionBarOverlayLayout r0 = (android.support.v7.widget.ActionBarOverlayLayout) r0
            r5.f732c = r0
            if (r0 == 0) goto Lf
            r0.setActionBarVisibilityCallback(r5)
        Lf:
            int r0 = b.b.d.a.f.action_bar
            android.view.View r0 = r6.findViewById(r0)
            android.support.v7.widget.b0 r0 = r5.a(r0)
            r5.e = r0
            int r0 = b.b.d.a.f.action_context_bar
            android.view.View r0 = r6.findViewById(r0)
            android.support.v7.widget.ActionBarContextView r0 = (android.support.v7.widget.ActionBarContextView) r0
            r5.f = r0
            int r0 = b.b.d.a.f.action_bar_container
            android.view.View r6 = r6.findViewById(r0)
            android.support.v7.widget.ActionBarContainer r6 = (android.support.v7.widget.ActionBarContainer) r6
            r5.d = r6
            android.support.v7.widget.b0 r0 = r5.e
            if (r0 == 0) goto L94
            android.support.v7.widget.ActionBarContextView r1 = r5.f
            if (r1 == 0) goto L94
            if (r6 == 0) goto L94
            android.content.Context r6 = r0.m()
            r5.f730a = r6
            android.support.v7.widget.b0 r6 = r5.e
            int r6 = r6.h()
            r6 = r6 & 4
            r0 = 1
            r1 = 0
            if (r6 == 0) goto L4d
            r6 = r0
            goto L4e
        L4d:
            r6 = r1
        L4e:
            if (r6 == 0) goto L52
            r5.i = r0
        L52:
            android.content.Context r2 = r5.f730a
            b.b.d.d.a r2 = b.b.d.d.a.a(r2)
            boolean r3 = r2.a()
            if (r3 != 0) goto L63
            if (r6 == 0) goto L61
            goto L63
        L61:
            r6 = r1
            goto L64
        L63:
            r6 = r0
        L64:
            r5.j(r6)
            boolean r6 = r2.f()
            r5.k(r6)
            android.content.Context r6 = r5.f730a
            r2 = 0
            int[] r3 = b.b.d.a.j.ActionBar
            int r4 = b.b.d.a.a.actionBarStyle
            android.content.res.TypedArray r6 = r6.obtainStyledAttributes(r2, r3, r4, r1)
            int r2 = b.b.d.a.j.ActionBar_hideOnContentScroll
            boolean r2 = r6.getBoolean(r2, r1)
            if (r2 == 0) goto L84
            r5.i(r0)
        L84:
            int r0 = b.b.d.a.j.ActionBar_elevation
            int r0 = r6.getDimensionPixelSize(r0, r1)
            if (r0 == 0) goto L90
            float r0 = (float) r0
            r5.a(r0)
        L90:
            r6.recycle()
            return
        L94:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.Class<android.support.v7.app.k> r0 = android.support.v7.app.k.class
            java.lang.String r0 = r0.getSimpleName()
            r6.append(r0)
            java.lang.String r0 = " can only be used "
            r6.append(r0)
            java.lang.String r0 = "with a compatible window decor layout"
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    private void k(boolean r5) {
            r4 = this;
            r4.o = r5
            r0 = 0
            if (r5 != 0) goto L12
            android.support.v7.widget.b0 r5 = r4.e
            r5.a(r0)
            android.support.v7.widget.ActionBarContainer r5 = r4.d
            android.support.v7.widget.m0 r0 = r4.h
            r5.setTabContainer(r0)
            goto L1e
        L12:
            android.support.v7.widget.ActionBarContainer r5 = r4.d
            r5.setTabContainer(r0)
            android.support.v7.widget.b0 r5 = r4.e
            android.support.v7.widget.m0 r0 = r4.h
            r5.a(r0)
        L1e:
            int r5 = r4.m()
            r0 = 2
            r1 = 1
            r2 = 0
            if (r5 != r0) goto L29
            r5 = r1
            goto L2a
        L29:
            r5 = r2
        L2a:
            android.support.v7.widget.m0 r0 = r4.h
            if (r0 == 0) goto L40
            if (r5 == 0) goto L3b
            r0.setVisibility(r2)
            android.support.v7.widget.ActionBarOverlayLayout r0 = r4.f732c
            if (r0 == 0) goto L40
            b.b.c.g.q.m(r0)
            goto L40
        L3b:
            r3 = 8
            r0.setVisibility(r3)
        L40:
            android.support.v7.widget.b0 r0 = r4.e
            boolean r3 = r4.o
            if (r3 != 0) goto L4a
            if (r5 == 0) goto L4a
            r3 = r1
            goto L4b
        L4a:
            r3 = r2
        L4b:
            r0.b(r3)
            android.support.v7.widget.ActionBarOverlayLayout r0 = r4.f732c
            boolean r4 = r4.o
            if (r4 != 0) goto L57
            if (r5 == 0) goto L57
            goto L58
        L57:
            r1 = r2
        L58:
            r0.setHasNonEmbeddedTabs(r1)
            return
    }

    private void l(boolean r4) {
            r3 = this;
            boolean r0 = r3.r
            boolean r1 = r3.s
            boolean r2 = r3.t
            boolean r0 = a(r0, r1, r2)
            if (r0 == 0) goto L17
            boolean r0 = r3.u
            if (r0 != 0) goto L21
            r0 = 1
            r3.u = r0
            r3.g(r4)
            goto L21
        L17:
            boolean r0 = r3.u
            if (r0 == 0) goto L21
            r0 = 0
            r3.u = r0
            r3.f(r4)
        L21:
            return
    }

    private void n() {
            r2 = this;
            boolean r0 = r2.t
            if (r0 == 0) goto L11
            r0 = 0
            r2.t = r0
            android.support.v7.widget.ActionBarOverlayLayout r1 = r2.f732c
            if (r1 == 0) goto Le
            r1.setShowingForActionMode(r0)
        Le:
            r2.l(r0)
        L11:
            return
    }

    private boolean o() {
            r0 = this;
            android.support.v7.widget.ActionBarContainer r0 = r0.d
            boolean r0 = b.b.c.g.q.k(r0)
            return r0
    }

    private void p() {
            r2 = this;
            boolean r0 = r2.t
            if (r0 != 0) goto L12
            r0 = 1
            r2.t = r0
            android.support.v7.widget.ActionBarOverlayLayout r1 = r2.f732c
            if (r1 == 0) goto Le
            r1.setShowingForActionMode(r0)
        Le:
            r0 = 0
            r2.l(r0)
        L12:
            return
    }

    @Override // android.support.v7.app.a
    public b.b.d.d.b a(b.b.d.d.b.a r3) {
            r2 = this;
            android.support.v7.app.k$d r0 = r2.j
            if (r0 == 0) goto L7
            r0.a()
        L7:
            android.support.v7.widget.ActionBarOverlayLayout r0 = r2.f732c
            r1 = 0
            r0.setHideOnContentScrollEnabled(r1)
            android.support.v7.widget.ActionBarContextView r0 = r2.f
            r0.c()
            android.support.v7.app.k$d r0 = new android.support.v7.app.k$d
            android.support.v7.widget.ActionBarContextView r1 = r2.f
            android.content.Context r1 = r1.getContext()
            r0.<init>(r2, r1, r3)
            boolean r3 = r0.k()
            if (r3 == 0) goto L39
            r2.j = r0
            r0.i()
            android.support.v7.widget.ActionBarContextView r3 = r2.f
            r3.a(r0)
            r3 = 1
            r2.e(r3)
            android.support.v7.widget.ActionBarContextView r2 = r2.f
            r3 = 32
            r2.sendAccessibilityEvent(r3)
            return r0
        L39:
            r2 = 0
            return r2
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.d
    public void a() {
            r1 = this;
            b.b.d.d.h r0 = r1.v
            if (r0 == 0) goto La
            r0.a()
            r0 = 0
            r1.v = r0
        La:
            return
    }

    public void a(float r1) {
            r0 = this;
            android.support.v7.widget.ActionBarContainer r0 = r0.d
            b.b.c.g.q.a(r0, r1)
            return
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.d
    public void a(int r1) {
            r0 = this;
            r0.p = r1
            return
    }

    public void a(int r3, int r4) {
            r2 = this;
            android.support.v7.widget.b0 r0 = r2.e
            int r0 = r0.h()
            r1 = r4 & 4
            if (r1 == 0) goto Ld
            r1 = 1
            r2.i = r1
        Ld:
            android.support.v7.widget.b0 r2 = r2.e
            r3 = r3 & r4
            int r4 = ~r4
            r4 = r4 & r0
            r3 = r3 | r4
            r2.c(r3)
            return
    }

    @Override // android.support.v7.app.a
    public void a(android.content.res.Configuration r1) {
            r0 = this;
            android.content.Context r1 = r0.f730a
            b.b.d.d.a r1 = b.b.d.d.a.a(r1)
            boolean r1 = r1.f()
            r0.k(r1)
            return
    }

    @Override // android.support.v7.app.a
    public void a(java.lang.CharSequence r1) {
            r0 = this;
            android.support.v7.widget.b0 r0 = r0.e
            r0.setWindowTitle(r1)
            return
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.d
    public void a(boolean r1) {
            r0 = this;
            r0.q = r1
            return
    }

    @Override // android.support.v7.app.a
    public boolean a(int r4, android.view.KeyEvent r5) {
            r3 = this;
            android.support.v7.app.k$d r3 = r3.j
            r0 = 0
            if (r3 != 0) goto L6
            return r0
        L6:
            android.view.Menu r3 = r3.c()
            if (r3 == 0) goto L29
            if (r5 == 0) goto L13
            int r1 = r5.getDeviceId()
            goto L14
        L13:
            r1 = -1
        L14:
            android.view.KeyCharacterMap r1 = android.view.KeyCharacterMap.load(r1)
            int r1 = r1.getKeyboardType()
            r2 = 1
            if (r1 == r2) goto L20
            goto L21
        L20:
            r2 = r0
        L21:
            r3.setQwertyMode(r2)
            boolean r3 = r3.performShortcut(r4, r5, r0)
            return r3
        L29:
            return r0
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.d
    public void b() {
            r1 = this;
            boolean r0 = r1.s
            if (r0 != 0) goto La
            r0 = 1
            r1.s = r0
            r1.l(r0)
        La:
            return
    }

    @Override // android.support.v7.app.a
    public void b(boolean r4) {
            r3 = this;
            boolean r0 = r3.m
            if (r4 != r0) goto L5
            return
        L5:
            r3.m = r4
            java.util.ArrayList<android.support.v7.app.a$b> r0 = r3.n
            int r0 = r0.size()
            r1 = 0
        Le:
            if (r1 >= r0) goto L1e
            java.util.ArrayList<android.support.v7.app.a$b> r2 = r3.n
            java.lang.Object r2 = r2.get(r1)
            android.support.v7.app.a$b r2 = (android.support.v7.app.a.b) r2
            r2.a(r4)
            int r1 = r1 + 1
            goto Le
        L1e:
            return
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.d
    public void c() {
            r1 = this;
            boolean r0 = r1.s
            if (r0 == 0) goto Lb
            r0 = 0
            r1.s = r0
            r0 = 1
            r1.l(r0)
        Lb:
            return
    }

    @Override // android.support.v7.app.a
    public void c(boolean r2) {
            r1 = this;
            boolean r0 = r1.i
            if (r0 != 0) goto L7
            r1.h(r2)
        L7:
            return
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.d
    public void d() {
            r0 = this;
            return
    }

    @Override // android.support.v7.app.a
    public void d(boolean r1) {
            r0 = this;
            r0.w = r1
            if (r1 != 0) goto Lb
            b.b.d.d.h r0 = r0.v
            if (r0 == 0) goto Lb
            r0.a()
        Lb:
            return
    }

    public void e(boolean r10) {
            r9 = this;
            if (r10 == 0) goto L6
            r9.p()
            goto L9
        L6:
            r9.n()
        L9:
            boolean r0 = r9.o()
            r1 = 4
            r2 = 8
            r3 = 0
            if (r0 == 0) goto L41
            r4 = 100
            r6 = 200(0xc8, double:9.9E-322)
            if (r10 == 0) goto L26
            android.support.v7.widget.b0 r10 = r9.e
            b.b.c.g.u r10 = r10.a(r1, r4)
            android.support.v7.widget.ActionBarContextView r9 = r9.f
            b.b.c.g.u r9 = r9.a(r3, r6)
            goto L35
        L26:
            android.support.v7.widget.b0 r10 = r9.e
            b.b.c.g.u r10 = r10.a(r3, r6)
            android.support.v7.widget.ActionBarContextView r9 = r9.f
            b.b.c.g.u r9 = r9.a(r2, r4)
            r8 = r10
            r10 = r9
            r9 = r8
        L35:
            b.b.d.d.h r0 = new b.b.d.d.h
            r0.<init>()
            r0.a(r10, r9)
            r0.c()
            goto L58
        L41:
            if (r10 == 0) goto L4e
            android.support.v7.widget.b0 r10 = r9.e
            r10.a(r1)
            android.support.v7.widget.ActionBarContextView r9 = r9.f
            r9.setVisibility(r3)
            goto L58
        L4e:
            android.support.v7.widget.b0 r10 = r9.e
            r10.a(r3)
            android.support.v7.widget.ActionBarContextView r9 = r9.f
            r9.setVisibility(r2)
        L58:
            return
    }

    public void f(boolean r5) {
            r4 = this;
            b.b.d.d.h r0 = r4.v
            if (r0 == 0) goto L7
            r0.a()
        L7:
            int r0 = r4.p
            if (r0 != 0) goto L74
            boolean r0 = r4.w
            if (r0 != 0) goto L11
            if (r5 == 0) goto L74
        L11:
            android.support.v7.widget.ActionBarContainer r0 = r4.d
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r1)
            android.support.v7.widget.ActionBarContainer r0 = r4.d
            r1 = 1
            r0.setTransitioning(r1)
            b.b.d.d.h r0 = new b.b.d.d.h
            r0.<init>()
            android.support.v7.widget.ActionBarContainer r2 = r4.d
            int r2 = r2.getHeight()
            int r2 = -r2
            float r2 = (float) r2
            if (r5 == 0) goto L3c
            r5 = 2
            int[] r5 = new int[r5]
            r5 = {x007c: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            android.support.v7.widget.ActionBarContainer r3 = r4.d
            r3.getLocationInWindow(r5)
            r5 = r5[r1]
            float r5 = (float) r5
            float r2 = r2 - r5
        L3c:
            android.support.v7.widget.ActionBarContainer r5 = r4.d
            b.b.c.g.u r5 = b.b.c.g.q.a(r5)
            r5.b(r2)
            b.b.c.g.x r1 = r4.A
            r5.a(r1)
            r0.a(r5)
            boolean r5 = r4.q
            if (r5 == 0) goto L5f
            android.view.View r5 = r4.g
            if (r5 == 0) goto L5f
            b.b.c.g.u r5 = b.b.c.g.q.a(r5)
            r5.b(r2)
            r0.a(r5)
        L5f:
            android.view.animation.Interpolator r5 = android.support.v7.app.k.B
            r0.a(r5)
            r1 = 250(0xfa, double:1.235E-321)
            r0.a(r1)
            b.b.c.g.v r5 = r4.y
            r0.a(r5)
            r4.v = r0
            r0.c()
            goto L7a
        L74:
            b.b.c.g.v r4 = r4.y
            r5 = 0
            r4.a(r5)
        L7a:
            return
    }

    @Override // android.support.v7.app.a
    public boolean f() {
            r1 = this;
            android.support.v7.widget.b0 r0 = r1.e
            if (r0 == 0) goto L11
            boolean r0 = r0.j()
            if (r0 == 0) goto L11
            android.support.v7.widget.b0 r1 = r1.e
            r1.collapseActionView()
            r1 = 1
            return r1
        L11:
            r1 = 0
            return r1
    }

    @Override // android.support.v7.app.a
    public int g() {
            r0 = this;
            android.support.v7.widget.b0 r0 = r0.e
            int r0 = r0.h()
            return r0
    }

    public void g(boolean r5) {
            r4 = this;
            b.b.d.d.h r0 = r4.v
            if (r0 == 0) goto L7
            r0.a()
        L7:
            android.support.v7.widget.ActionBarContainer r0 = r4.d
            r1 = 0
            r0.setVisibility(r1)
            int r0 = r4.p
            r1 = 0
            if (r0 != 0) goto L7e
            boolean r0 = r4.w
            if (r0 != 0) goto L18
            if (r5 == 0) goto L7e
        L18:
            android.support.v7.widget.ActionBarContainer r0 = r4.d
            r0.setTranslationY(r1)
            android.support.v7.widget.ActionBarContainer r0 = r4.d
            int r0 = r0.getHeight()
            int r0 = -r0
            float r0 = (float) r0
            if (r5 == 0) goto L37
            r5 = 2
            int[] r5 = new int[r5]
            r5 = {x00a4: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            android.support.v7.widget.ActionBarContainer r2 = r4.d
            r2.getLocationInWindow(r5)
            r2 = 1
            r5 = r5[r2]
            float r5 = (float) r5
            float r0 = r0 - r5
        L37:
            android.support.v7.widget.ActionBarContainer r5 = r4.d
            r5.setTranslationY(r0)
            b.b.d.d.h r5 = new b.b.d.d.h
            r5.<init>()
            android.support.v7.widget.ActionBarContainer r2 = r4.d
            b.b.c.g.u r2 = b.b.c.g.q.a(r2)
            r2.b(r1)
            b.b.c.g.x r3 = r4.A
            r2.a(r3)
            r5.a(r2)
            boolean r2 = r4.q
            if (r2 == 0) goto L69
            android.view.View r2 = r4.g
            if (r2 == 0) goto L69
            r2.setTranslationY(r0)
            android.view.View r0 = r4.g
            b.b.c.g.u r0 = b.b.c.g.q.a(r0)
            r0.b(r1)
            r5.a(r0)
        L69:
            android.view.animation.Interpolator r0 = android.support.v7.app.k.C
            r5.a(r0)
            r0 = 250(0xfa, double:1.235E-321)
            r5.a(r0)
            b.b.c.g.v r0 = r4.z
            r5.a(r0)
            r4.v = r5
            r5.c()
            goto L9b
        L7e:
            android.support.v7.widget.ActionBarContainer r5 = r4.d
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.setAlpha(r0)
            android.support.v7.widget.ActionBarContainer r5 = r4.d
            r5.setTranslationY(r1)
            boolean r5 = r4.q
            if (r5 == 0) goto L95
            android.view.View r5 = r4.g
            if (r5 == 0) goto L95
            r5.setTranslationY(r1)
        L95:
            b.b.c.g.v r5 = r4.z
            r0 = 0
            r5.a(r0)
        L9b:
            android.support.v7.widget.ActionBarOverlayLayout r4 = r4.f732c
            if (r4 == 0) goto La2
            b.b.c.g.q.m(r4)
        La2:
            return
    }

    @Override // android.support.v7.app.a
    public android.content.Context h() {
            r4 = this;
            android.content.Context r0 = r4.f731b
            if (r0 != 0) goto L27
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r1 = r4.f730a
            android.content.res.Resources$Theme r1 = r1.getTheme()
            int r2 = b.b.d.a.a.actionBarWidgetTheme
            r3 = 1
            r1.resolveAttribute(r2, r0, r3)
            int r0 = r0.resourceId
            if (r0 == 0) goto L23
            android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
            android.content.Context r2 = r4.f730a
            r1.<init>(r2, r0)
            r4.f731b = r1
            goto L27
        L23:
            android.content.Context r0 = r4.f730a
            r4.f731b = r0
        L27:
            android.content.Context r4 = r4.f731b
            return r4
    }

    public void h(boolean r2) {
            r1 = this;
            r0 = 4
            if (r2 == 0) goto L5
            r2 = r0
            goto L6
        L5:
            r2 = 0
        L6:
            r1.a(r2, r0)
            return
    }

    public void i(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L13
            android.support.v7.widget.ActionBarOverlayLayout r0 = r1.f732c
            boolean r0 = r0.i()
            if (r0 == 0) goto Lb
            goto L13
        Lb:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll"
            r1.<init>(r2)
            throw r1
        L13:
            r1.x = r2
            android.support.v7.widget.ActionBarOverlayLayout r1 = r1.f732c
            r1.setHideOnContentScrollEnabled(r2)
            return
    }

    public void j(boolean r1) {
            r0 = this;
            android.support.v7.widget.b0 r0 = r0.e
            r0.a(r1)
            return
    }

    void l() {
            r2 = this;
            b.b.d.d.b$a r0 = r2.l
            if (r0 == 0) goto Le
            b.b.d.d.b r1 = r2.k
            r0.a(r1)
            r0 = 0
            r2.k = r0
            r2.l = r0
        Le:
            return
    }

    public int m() {
            r0 = this;
            android.support.v7.widget.b0 r0 = r0.e
            int r0 = r0.n()
            return r0
    }
}
