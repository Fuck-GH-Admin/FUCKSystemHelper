package android.support.v7.app;

/* JADX INFO: loaded from: classes.dex */
class f extends android.support.v7.app.e implements android.support.v7.view.menu.h.a, android.view.LayoutInflater.Factory2 {
    private static final boolean T = false;
    private static final int[] U = null;
    private static boolean V;
    boolean A;
    boolean B;
    boolean C;
    boolean D;
    private boolean E;
    private android.support.v7.app.f.m[] F;
    private android.support.v7.app.f.m G;
    private boolean H;
    boolean I;
    private int J;
    private boolean K;
    private android.support.v7.app.f.k L;
    boolean M;
    int N;
    private final java.lang.Runnable O;
    private boolean P;
    private android.graphics.Rect Q;
    private android.graphics.Rect R;
    private android.support.v7.app.AppCompatViewInflater S;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final android.content.Context f693c;
    final android.view.Window d;
    final android.view.Window.Callback e;
    final android.view.Window.Callback f;
    final android.support.v7.app.d g;
    android.support.v7.app.a h;
    android.view.MenuInflater i;
    private java.lang.CharSequence j;
    private android.support.v7.widget.a0 k;
    private android.support.v7.app.f.h l;
    private android.support.v7.app.f.n m;
    b.b.d.d.b n;
    android.support.v7.widget.ActionBarContextView o;
    android.widget.PopupWindow p;
    java.lang.Runnable q;
    b.b.c.g.u r;
    private boolean s;
    private boolean t;
    private android.view.ViewGroup u;
    private android.widget.TextView v;
    private android.view.View w;
    private boolean x;
    private boolean y;
    boolean z;

    static class a implements java.lang.Thread.UncaughtExceptionHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.Thread.UncaughtExceptionHandler f694a;

        a(java.lang.Thread.UncaughtExceptionHandler r1) {
                r0 = this;
                r0.f694a = r1
                r0.<init>()
                return
        }

        private boolean a(java.lang.Throwable r2) {
                r1 = this;
                boolean r1 = r2 instanceof android.content.res.Resources.NotFoundException
                r0 = 0
                if (r1 == 0) goto L1c
                java.lang.String r1 = r2.getMessage()
                if (r1 == 0) goto L1c
                java.lang.String r2 = "drawable"
                boolean r2 = r1.contains(r2)
                if (r2 != 0) goto L1b
                java.lang.String r2 = "Drawable"
                boolean r1 = r1.contains(r2)
                if (r1 == 0) goto L1c
            L1b:
                r0 = 1
            L1c:
                return r0
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(java.lang.Thread r4, java.lang.Throwable r5) {
                r3 = this;
                boolean r0 = r3.a(r5)
                if (r0 == 0) goto L34
                android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = r5.getMessage()
                r1.append(r2)
                java.lang.String r2 = ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info."
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                java.lang.Throwable r1 = r5.getCause()
                r0.initCause(r1)
                java.lang.StackTraceElement[] r5 = r5.getStackTrace()
                r0.setStackTrace(r5)
                java.lang.Thread$UncaughtExceptionHandler r3 = r3.f694a
                r3.uncaughtException(r4, r0)
                goto L39
            L34:
                java.lang.Thread$UncaughtExceptionHandler r3 = r3.f694a
                r3.uncaughtException(r4, r5)
            L39:
                return
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.support.v7.app.f f695b;

        b(android.support.v7.app.f r1) {
                r0 = this;
                r0.f695b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                android.support.v7.app.f r0 = r3.f695b
                int r1 = r0.N
                r1 = r1 & 1
                r2 = 0
                if (r1 == 0) goto Lc
                r0.e(r2)
            Lc:
                android.support.v7.app.f r0 = r3.f695b
                int r1 = r0.N
                r1 = r1 & 4096(0x1000, float:5.74E-42)
                if (r1 == 0) goto L19
                r1 = 108(0x6c, float:1.51E-43)
                r0.e(r1)
            L19:
                android.support.v7.app.f r3 = r3.f695b
                r3.M = r2
                r3.N = r2
                return
        }
    }

    class c implements b.b.c.g.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.support.v7.app.f f696a;

        c(android.support.v7.app.f r1) {
                r0 = this;
                r0.f696a = r1
                r0.<init>()
                return
        }

        @Override // b.b.c.g.o
        public b.b.c.g.y a(android.view.View r4, b.b.c.g.y r5) {
                r3 = this;
                int r0 = r5.d()
                android.support.v7.app.f r3 = r3.f696a
                int r3 = r3.i(r0)
                if (r0 == r3) goto L1c
                int r0 = r5.b()
                int r1 = r5.c()
                int r2 = r5.a()
                b.b.c.g.y r5 = r5.a(r0, r3, r1, r2)
            L1c:
                b.b.c.g.y r3 = b.b.c.g.q.a(r4, r5)
                return r3
        }
    }

    class d implements android.support.v7.widget.e0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.support.v7.app.f f697a;

        d(android.support.v7.app.f r1) {
                r0 = this;
                r0.f697a = r1
                r0.<init>()
                return
        }

        @Override // android.support.v7.widget.e0.a
        public void a(android.graphics.Rect r2) {
                r1 = this;
                android.support.v7.app.f r1 = r1.f697a
                int r0 = r2.top
                int r1 = r1.i(r0)
                r2.top = r1
                return
        }
    }

    class e implements android.support.v7.widget.ContentFrameLayout.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.support.v7.app.f f698a;

        e(android.support.v7.app.f r1) {
                r0 = this;
                r0.f698a = r1
                r0.<init>()
                return
        }

        @Override // android.support.v7.widget.ContentFrameLayout.a
        public void a() {
                r0 = this;
                return
        }

        @Override // android.support.v7.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
                r0 = this;
                android.support.v7.app.f r0 = r0.f698a
                r0.k()
                return
        }
    }

    /* JADX INFO: renamed from: android.support.v7.app.f$f, reason: collision with other inner class name */
    class RunnableC0031f implements java.lang.Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.support.v7.app.f f699b;

        /* JADX INFO: renamed from: android.support.v7.app.f$f$a */
        class a extends b.b.c.g.w {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.support.v7.app.f.RunnableC0031f f700a;

            a(android.support.v7.app.f.RunnableC0031f r1) {
                    r0 = this;
                    r0.f700a = r1
                    r0.<init>()
                    return
            }

            @Override // b.b.c.g.v
            public void a(android.view.View r2) {
                    r1 = this;
                    android.support.v7.app.f$f r2 = r1.f700a
                    android.support.v7.app.f r2 = r2.f699b
                    android.support.v7.widget.ActionBarContextView r2 = r2.o
                    r0 = 1065353216(0x3f800000, float:1.0)
                    r2.setAlpha(r0)
                    android.support.v7.app.f$f r2 = r1.f700a
                    android.support.v7.app.f r2 = r2.f699b
                    b.b.c.g.u r2 = r2.r
                    r0 = 0
                    r2.a(r0)
                    android.support.v7.app.f$f r1 = r1.f700a
                    android.support.v7.app.f r1 = r1.f699b
                    r1.r = r0
                    return
            }

            @Override // b.b.c.g.w, b.b.c.g.v
            public void b(android.view.View r1) {
                    r0 = this;
                    android.support.v7.app.f$f r0 = r0.f700a
                    android.support.v7.app.f r0 = r0.f699b
                    android.support.v7.widget.ActionBarContextView r0 = r0.o
                    r1 = 0
                    r0.setVisibility(r1)
                    return
            }
        }

        RunnableC0031f(android.support.v7.app.f r1) {
                r0 = this;
                r0.f699b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                android.support.v7.app.f r0 = r4.f699b
                android.widget.PopupWindow r1 = r0.p
                android.support.v7.widget.ActionBarContextView r0 = r0.o
                r2 = 0
                r3 = 55
                r1.showAtLocation(r0, r3, r2, r2)
                android.support.v7.app.f r0 = r4.f699b
                r0.l()
                android.support.v7.app.f r0 = r4.f699b
                boolean r0 = r0.s()
                r1 = 1065353216(0x3f800000, float:1.0)
                if (r0 == 0) goto L3d
                android.support.v7.app.f r0 = r4.f699b
                android.support.v7.widget.ActionBarContextView r0 = r0.o
                r2 = 0
                r0.setAlpha(r2)
                android.support.v7.app.f r0 = r4.f699b
                android.support.v7.widget.ActionBarContextView r2 = r0.o
                b.b.c.g.u r2 = b.b.c.g.q.a(r2)
                r2.a(r1)
                r0.r = r2
                android.support.v7.app.f r0 = r4.f699b
                b.b.c.g.u r0 = r0.r
                android.support.v7.app.f$f$a r1 = new android.support.v7.app.f$f$a
                r1.<init>(r4)
                r0.a(r1)
                goto L4b
            L3d:
                android.support.v7.app.f r0 = r4.f699b
                android.support.v7.widget.ActionBarContextView r0 = r0.o
                r0.setAlpha(r1)
                android.support.v7.app.f r4 = r4.f699b
                android.support.v7.widget.ActionBarContextView r4 = r4.o
                r4.setVisibility(r2)
            L4b:
                return
        }
    }

    class g extends b.b.c.g.w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.support.v7.app.f f701a;

        g(android.support.v7.app.f r1) {
                r0 = this;
                r0.f701a = r1
                r0.<init>()
                return
        }

        @Override // b.b.c.g.v
        public void a(android.view.View r2) {
                r1 = this;
                android.support.v7.app.f r2 = r1.f701a
                android.support.v7.widget.ActionBarContextView r2 = r2.o
                r0 = 1065353216(0x3f800000, float:1.0)
                r2.setAlpha(r0)
                android.support.v7.app.f r2 = r1.f701a
                b.b.c.g.u r2 = r2.r
                r0 = 0
                r2.a(r0)
                android.support.v7.app.f r1 = r1.f701a
                r1.r = r0
                return
        }

        @Override // b.b.c.g.w, b.b.c.g.v
        public void b(android.view.View r2) {
                r1 = this;
                android.support.v7.app.f r2 = r1.f701a
                android.support.v7.widget.ActionBarContextView r2 = r2.o
                r0 = 0
                r2.setVisibility(r0)
                android.support.v7.app.f r2 = r1.f701a
                android.support.v7.widget.ActionBarContextView r2 = r2.o
                r0 = 32
                r2.sendAccessibilityEvent(r0)
                android.support.v7.app.f r2 = r1.f701a
                android.support.v7.widget.ActionBarContextView r2 = r2.o
                android.view.ViewParent r2 = r2.getParent()
                boolean r2 = r2 instanceof android.view.View
                if (r2 == 0) goto L2a
                android.support.v7.app.f r1 = r1.f701a
                android.support.v7.widget.ActionBarContextView r1 = r1.o
                android.view.ViewParent r1 = r1.getParent()
                android.view.View r1 = (android.view.View) r1
                b.b.c.g.q.m(r1)
            L2a:
                return
        }
    }

    private final class h implements android.support.v7.view.menu.o.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.support.v7.app.f f702b;

        h(android.support.v7.app.f r1) {
                r0 = this;
                r0.f702b = r1
                r0.<init>()
                return
        }

        @Override // android.support.v7.view.menu.o.a
        public void a(android.support.v7.view.menu.h r1, boolean r2) {
                r0 = this;
                android.support.v7.app.f r0 = r0.f702b
                r0.b(r1)
                return
        }

        @Override // android.support.v7.view.menu.o.a
        public boolean a(android.support.v7.view.menu.h r2) {
                r1 = this;
                android.support.v7.app.f r1 = r1.f702b
                android.view.Window$Callback r1 = r1.o()
                if (r1 == 0) goto Ld
                r0 = 108(0x6c, float:1.51E-43)
                r1.onMenuOpened(r0, r2)
            Ld:
                r1 = 1
                return r1
        }
    }

    class i implements b.b.d.d.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b.b.d.d.b.a f703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.support.v7.app.f f704b;

        class a extends b.b.c.g.w {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.support.v7.app.f.i f705a;

            a(android.support.v7.app.f.i r1) {
                    r0 = this;
                    r0.f705a = r1
                    r0.<init>()
                    return
            }

            @Override // b.b.c.g.v
            public void a(android.view.View r2) {
                    r1 = this;
                    android.support.v7.app.f$i r2 = r1.f705a
                    android.support.v7.app.f r2 = r2.f704b
                    android.support.v7.widget.ActionBarContextView r2 = r2.o
                    r0 = 8
                    r2.setVisibility(r0)
                    android.support.v7.app.f$i r2 = r1.f705a
                    android.support.v7.app.f r2 = r2.f704b
                    android.widget.PopupWindow r0 = r2.p
                    if (r0 == 0) goto L17
                    r0.dismiss()
                    goto L30
                L17:
                    android.support.v7.widget.ActionBarContextView r2 = r2.o
                    android.view.ViewParent r2 = r2.getParent()
                    boolean r2 = r2 instanceof android.view.View
                    if (r2 == 0) goto L30
                    android.support.v7.app.f$i r2 = r1.f705a
                    android.support.v7.app.f r2 = r2.f704b
                    android.support.v7.widget.ActionBarContextView r2 = r2.o
                    android.view.ViewParent r2 = r2.getParent()
                    android.view.View r2 = (android.view.View) r2
                    b.b.c.g.q.m(r2)
                L30:
                    android.support.v7.app.f$i r2 = r1.f705a
                    android.support.v7.app.f r2 = r2.f704b
                    android.support.v7.widget.ActionBarContextView r2 = r2.o
                    r2.removeAllViews()
                    android.support.v7.app.f$i r2 = r1.f705a
                    android.support.v7.app.f r2 = r2.f704b
                    b.b.c.g.u r2 = r2.r
                    r0 = 0
                    r2.a(r0)
                    android.support.v7.app.f$i r1 = r1.f705a
                    android.support.v7.app.f r1 = r1.f704b
                    r1.r = r0
                    return
            }
        }

        public i(android.support.v7.app.f r1, b.b.d.d.b.a r2) {
                r0 = this;
                r0.f704b = r1
                r0.<init>()
                r0.f703a = r2
                return
        }

        @Override // b.b.d.d.b.a
        public void a(b.b.d.d.b r3) {
                r2 = this;
                b.b.d.d.b$a r0 = r2.f703a
                r0.a(r3)
                android.support.v7.app.f r3 = r2.f704b
                android.widget.PopupWindow r0 = r3.p
                if (r0 == 0) goto L18
                android.view.Window r3 = r3.d
                android.view.View r3 = r3.getDecorView()
                android.support.v7.app.f r0 = r2.f704b
                java.lang.Runnable r0 = r0.q
                r3.removeCallbacks(r0)
            L18:
                android.support.v7.app.f r3 = r2.f704b
                android.support.v7.widget.ActionBarContextView r0 = r3.o
                if (r0 == 0) goto L3b
                r3.l()
                android.support.v7.app.f r3 = r2.f704b
                android.support.v7.widget.ActionBarContextView r0 = r3.o
                b.b.c.g.u r0 = b.b.c.g.q.a(r0)
                r1 = 0
                r0.a(r1)
                r3.r = r0
                android.support.v7.app.f r3 = r2.f704b
                b.b.c.g.u r3 = r3.r
                android.support.v7.app.f$i$a r0 = new android.support.v7.app.f$i$a
                r0.<init>(r2)
                r3.a(r0)
            L3b:
                android.support.v7.app.f r3 = r2.f704b
                android.support.v7.app.d r0 = r3.g
                if (r0 == 0) goto L46
                b.b.d.d.b r3 = r3.n
                r0.b(r3)
            L46:
                android.support.v7.app.f r2 = r2.f704b
                r3 = 0
                r2.n = r3
                return
        }

        @Override // b.b.d.d.b.a
        public boolean a(b.b.d.d.b r1, android.view.Menu r2) {
                r0 = this;
                b.b.d.d.b$a r0 = r0.f703a
                boolean r0 = r0.a(r1, r2)
                return r0
        }

        @Override // b.b.d.d.b.a
        public boolean a(b.b.d.d.b r1, android.view.MenuItem r2) {
                r0 = this;
                b.b.d.d.b$a r0 = r0.f703a
                boolean r0 = r0.a(r1, r2)
                return r0
        }

        @Override // b.b.d.d.b.a
        public boolean b(b.b.d.d.b r1, android.view.Menu r2) {
                r0 = this;
                b.b.d.d.b$a r0 = r0.f703a
                boolean r0 = r0.b(r1, r2)
                return r0
        }
    }

    class j extends b.b.d.d.i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.support.v7.app.f f706c;

        j(android.support.v7.app.f r1, android.view.Window.Callback r2) {
                r0 = this;
                r0.f706c = r1
                r0.<init>(r2)
                return
        }

        final android.view.ActionMode a(android.view.ActionMode.Callback r3) {
                r2 = this;
                b.b.d.d.f$a r0 = new b.b.d.d.f$a
                android.support.v7.app.f r1 = r2.f706c
                android.content.Context r1 = r1.f693c
                r0.<init>(r1, r3)
                android.support.v7.app.f r2 = r2.f706c
                b.b.d.d.b r2 = r2.a(r0)
                if (r2 == 0) goto L16
                android.view.ActionMode r2 = r0.b(r2)
                return r2
            L16:
                r2 = 0
                return r2
        }

        @Override // b.b.d.d.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(android.view.KeyEvent r2) {
                r1 = this;
                android.support.v7.app.f r0 = r1.f706c
                boolean r0 = r0.a(r2)
                if (r0 != 0) goto L11
                boolean r1 = super.dispatchKeyEvent(r2)
                if (r1 == 0) goto Lf
                goto L11
            Lf:
                r1 = 0
                goto L12
            L11:
                r1 = 1
            L12:
                return r1
        }

        @Override // b.b.d.d.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r2) {
                r1 = this;
                boolean r0 = super.dispatchKeyShortcutEvent(r2)
                if (r0 != 0) goto L15
                android.support.v7.app.f r1 = r1.f706c
                int r0 = r2.getKeyCode()
                boolean r1 = r1.b(r0, r2)
                if (r1 == 0) goto L13
                goto L15
            L13:
                r1 = 0
                goto L16
            L15:
                r1 = 1
            L16:
                return r1
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
                r0 = this;
                return
        }

        @Override // b.b.d.d.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int r2, android.view.Menu r3) {
                r1 = this;
                if (r2 != 0) goto L8
                boolean r0 = r3 instanceof android.support.v7.view.menu.h
                if (r0 != 0) goto L8
                r1 = 0
                return r1
            L8:
                boolean r1 = super.onCreatePanelMenu(r2, r3)
                return r1
        }

        @Override // b.b.d.d.i, android.view.Window.Callback
        public boolean onMenuOpened(int r1, android.view.Menu r2) {
                r0 = this;
                super.onMenuOpened(r1, r2)
                android.support.v7.app.f r0 = r0.f706c
                r0.g(r1)
                r0 = 1
                return r0
        }

        @Override // b.b.d.d.i, android.view.Window.Callback
        public void onPanelClosed(int r1, android.view.Menu r2) {
                r0 = this;
                super.onPanelClosed(r1, r2)
                android.support.v7.app.f r0 = r0.f706c
                r0.h(r1)
                return
        }

        @Override // b.b.d.d.i, android.view.Window.Callback
        public boolean onPreparePanel(int r4, android.view.View r5, android.view.Menu r6) {
                r3 = this;
                boolean r0 = r6 instanceof android.support.v7.view.menu.h
                if (r0 == 0) goto L8
                r0 = r6
                android.support.v7.view.menu.h r0 = (android.support.v7.view.menu.h) r0
                goto L9
            L8:
                r0 = 0
            L9:
                r1 = 0
                if (r4 != 0) goto Lf
                if (r0 != 0) goto Lf
                return r1
            Lf:
                if (r0 == 0) goto L15
                r2 = 1
                r0.c(r2)
            L15:
                boolean r3 = super.onPreparePanel(r4, r5, r6)
                if (r0 == 0) goto L1e
                r0.c(r1)
            L1e:
                return r3
        }

        @Override // b.b.d.d.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(java.util.List<android.view.KeyboardShortcutGroup> r4, android.view.Menu r5, int r6) {
                r3 = this;
                android.support.v7.app.f r0 = r3.f706c
                r1 = 0
                r2 = 1
                android.support.v7.app.f$m r0 = r0.a(r1, r2)
                if (r0 == 0) goto L12
                android.support.v7.view.menu.h r0 = r0.j
                if (r0 == 0) goto L12
                super.onProvideKeyboardShortcuts(r4, r0, r6)
                goto L15
            L12:
                super.onProvideKeyboardShortcuts(r4, r5, r6)
            L15:
                return
        }

        @Override // b.b.d.d.i, android.view.Window.Callback
        public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r3) {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 23
                if (r0 < r1) goto L8
                r2 = 0
                return r2
            L8:
                android.support.v7.app.f r0 = r2.f706c
                boolean r0 = r0.p()
                if (r0 == 0) goto L15
                android.view.ActionMode r2 = r2.a(r3)
                return r2
            L15:
                android.view.ActionMode r2 = super.onWindowStartingActionMode(r3)
                return r2
        }

        @Override // b.b.d.d.i, android.view.Window.Callback
        public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r2, int r3) {
                r1 = this;
                android.support.v7.app.f r0 = r1.f706c
                boolean r0 = r0.p()
                if (r0 == 0) goto L10
                if (r3 == 0) goto Lb
                goto L10
            Lb:
                android.view.ActionMode r1 = r1.a(r2)
                return r1
            L10:
                android.view.ActionMode r1 = super.onWindowStartingActionMode(r2, r3)
                return r1
        }
    }

    final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private android.support.v7.app.j f707a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f708b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private android.content.BroadcastReceiver f709c;
        private android.content.IntentFilter d;
        final /* synthetic */ android.support.v7.app.f e;

        class a extends android.content.BroadcastReceiver {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.support.v7.app.f.k f710a;

            a(android.support.v7.app.f.k r1) {
                    r0 = this;
                    r0.f710a = r1
                    r0.<init>()
                    return
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context r1, android.content.Intent r2) {
                    r0 = this;
                    android.support.v7.app.f$k r0 = r0.f710a
                    r0.b()
                    return
            }
        }

        k(android.support.v7.app.f r1, android.support.v7.app.j r2) {
                r0 = this;
                r0.e = r1
                r0.<init>()
                r0.f707a = r2
                boolean r1 = r2.a()
                r0.f708b = r1
                return
        }

        void a() {
                r2 = this;
                android.content.BroadcastReceiver r0 = r2.f709c
                if (r0 == 0) goto Le
                android.support.v7.app.f r1 = r2.e
                android.content.Context r1 = r1.f693c
                r1.unregisterReceiver(r0)
                r0 = 0
                r2.f709c = r0
            Le:
                return
        }

        void b() {
                r2 = this;
                android.support.v7.app.j r0 = r2.f707a
                boolean r0 = r0.a()
                boolean r1 = r2.f708b
                if (r0 == r1) goto L11
                r2.f708b = r0
                android.support.v7.app.f r2 = r2.e
                r2.a()
            L11:
                return
        }

        int c() {
                r1 = this;
                android.support.v7.app.j r0 = r1.f707a
                boolean r0 = r0.a()
                r1.f708b = r0
                if (r0 == 0) goto Lc
                r1 = 2
                goto Ld
            Lc:
                r1 = 1
            Ld:
                return r1
        }

        void d() {
                r2 = this;
                r2.a()
                android.content.BroadcastReceiver r0 = r2.f709c
                if (r0 != 0) goto Le
                android.support.v7.app.f$k$a r0 = new android.support.v7.app.f$k$a
                r0.<init>(r2)
                r2.f709c = r0
            Le:
                android.content.IntentFilter r0 = r2.d
                if (r0 != 0) goto L2c
                android.content.IntentFilter r0 = new android.content.IntentFilter
                r0.<init>()
                r2.d = r0
                java.lang.String r1 = "android.intent.action.TIME_SET"
                r0.addAction(r1)
                android.content.IntentFilter r0 = r2.d
                java.lang.String r1 = "android.intent.action.TIMEZONE_CHANGED"
                r0.addAction(r1)
                android.content.IntentFilter r0 = r2.d
                java.lang.String r1 = "android.intent.action.TIME_TICK"
                r0.addAction(r1)
            L2c:
                android.support.v7.app.f r0 = r2.e
                android.content.Context r0 = r0.f693c
                android.content.BroadcastReceiver r1 = r2.f709c
                android.content.IntentFilter r2 = r2.d
                r0.registerReceiver(r1, r2)
                return
        }
    }

    private class l extends android.support.v7.widget.ContentFrameLayout {
        final /* synthetic */ android.support.v7.app.f j;

        public l(android.support.v7.app.f r1, android.content.Context r2) {
                r0 = this;
                r0.j = r1
                r0.<init>(r2)
                return
        }

        private boolean a(int r2, int r3) {
                r1 = this;
                r0 = -5
                if (r2 < r0) goto L18
                if (r3 < r0) goto L18
                int r0 = r1.getWidth()
                int r0 = r0 + 5
                if (r2 > r0) goto L18
                int r1 = r1.getHeight()
                int r1 = r1 + 5
                if (r3 <= r1) goto L16
                goto L18
            L16:
                r1 = 0
                goto L19
            L18:
                r1 = 1
            L19:
                return r1
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(android.view.KeyEvent r2) {
                r1 = this;
                android.support.v7.app.f r0 = r1.j
                boolean r0 = r0.a(r2)
                if (r0 != 0) goto L11
                boolean r1 = super.dispatchKeyEvent(r2)
                if (r1 == 0) goto Lf
                goto L11
            Lf:
                r1 = 0
                goto L12
            L11:
                r1 = 1
            L12:
                return r1
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(android.view.MotionEvent r3) {
                r2 = this;
                int r0 = r3.getAction()
                if (r0 != 0) goto L1e
                float r0 = r3.getX()
                int r0 = (int) r0
                float r1 = r3.getY()
                int r1 = (int) r1
                boolean r0 = r2.a(r0, r1)
                if (r0 == 0) goto L1e
                android.support.v7.app.f r2 = r2.j
                r3 = 0
                r2.d(r3)
                r2 = 1
                return r2
            L1e:
                boolean r2 = super.onInterceptTouchEvent(r3)
                return r2
        }

        @Override // android.view.View
        public void setBackgroundResource(int r2) {
                r1 = this;
                android.content.Context r0 = r1.getContext()
                android.graphics.drawable.Drawable r2 = b.b.d.b.a.a.c(r0, r2)
                r1.setBackgroundDrawable(r2)
                return
        }
    }

    protected static final class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f712b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f713c;
        int d;
        int e;
        int f;
        android.view.ViewGroup g;
        android.view.View h;
        android.view.View i;
        android.support.v7.view.menu.h j;
        android.support.v7.view.menu.f k;
        android.content.Context l;
        boolean m;
        boolean n;
        boolean o;
        public boolean p;
        boolean q;
        boolean r;
        android.os.Bundle s;

        m(int r1) {
                r0 = this;
                r0.<init>()
                r0.f711a = r1
                r1 = 0
                r0.q = r1
                return
        }

        android.support.v7.view.menu.p a(android.support.v7.view.menu.o.a r4) {
                r3 = this;
                android.support.v7.view.menu.h r0 = r3.j
                if (r0 != 0) goto L6
                r3 = 0
                return r3
            L6:
                android.support.v7.view.menu.f r0 = r3.k
                if (r0 != 0) goto L1f
                android.support.v7.view.menu.f r0 = new android.support.v7.view.menu.f
                android.content.Context r1 = r3.l
                int r2 = b.b.d.a.g.abc_list_menu_item_layout
                r0.<init>(r1, r2)
                r3.k = r0
                r0.a(r4)
                android.support.v7.view.menu.h r4 = r3.j
                android.support.v7.view.menu.f r0 = r3.k
                r4.a(r0)
            L1f:
                android.support.v7.view.menu.f r4 = r3.k
                android.view.ViewGroup r3 = r3.g
                android.support.v7.view.menu.p r3 = r4.a(r3)
                return r3
        }

        void a(android.content.Context r5) {
                r4 = this;
                android.util.TypedValue r0 = new android.util.TypedValue
                r0.<init>()
                android.content.res.Resources r1 = r5.getResources()
                android.content.res.Resources$Theme r1 = r1.newTheme()
                android.content.res.Resources$Theme r2 = r5.getTheme()
                r1.setTo(r2)
                int r2 = b.b.d.a.a.actionBarPopupTheme
                r3 = 1
                r1.resolveAttribute(r2, r0, r3)
                int r2 = r0.resourceId
                if (r2 == 0) goto L21
                r1.applyStyle(r2, r3)
            L21:
                int r2 = b.b.d.a.a.panelMenuListTheme
                r1.resolveAttribute(r2, r0, r3)
                int r0 = r0.resourceId
                if (r0 == 0) goto L2b
                goto L2d
            L2b:
                int r0 = b.b.d.a.i.Theme_AppCompat_CompactMenu
            L2d:
                r1.applyStyle(r0, r3)
                b.b.d.d.d r0 = new b.b.d.d.d
                r2 = 0
                r0.<init>(r5, r2)
                android.content.res.Resources$Theme r5 = r0.getTheme()
                r5.setTo(r1)
                r4.l = r0
                int[] r5 = b.b.d.a.j.AppCompatTheme
                android.content.res.TypedArray r5 = r0.obtainStyledAttributes(r5)
                int r0 = b.b.d.a.j.AppCompatTheme_panelBackground
                int r0 = r5.getResourceId(r0, r2)
                r4.f712b = r0
                int r0 = b.b.d.a.j.AppCompatTheme_android_windowAnimationStyle
                int r0 = r5.getResourceId(r0, r2)
                r4.f = r0
                r5.recycle()
                return
        }

        void a(android.support.v7.view.menu.h r3) {
                r2 = this;
                android.support.v7.view.menu.h r0 = r2.j
                if (r3 != r0) goto L5
                return
            L5:
                if (r0 == 0) goto Lc
                android.support.v7.view.menu.f r1 = r2.k
                r0.b(r1)
            Lc:
                r2.j = r3
                if (r3 == 0) goto L17
                android.support.v7.view.menu.f r2 = r2.k
                if (r2 == 0) goto L17
                r3.a(r2)
            L17:
                return
        }

        public boolean a() {
                r3 = this;
                android.view.View r0 = r3.h
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                android.view.View r0 = r3.i
                r2 = 1
                if (r0 == 0) goto Lc
                return r2
            Lc:
                android.support.v7.view.menu.f r3 = r3.k
                android.widget.ListAdapter r3 = r3.a()
                int r3 = r3.getCount()
                if (r3 <= 0) goto L19
                r1 = r2
            L19:
                return r1
        }
    }

    private final class n implements android.support.v7.view.menu.o.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.support.v7.app.f f714b;

        n(android.support.v7.app.f r1) {
                r0 = this;
                r0.f714b = r1
                r0.<init>()
                return
        }

        @Override // android.support.v7.view.menu.o.a
        public void a(android.support.v7.view.menu.h r5, boolean r6) {
                r4 = this;
                android.support.v7.view.menu.h r0 = r5.m()
                r1 = 1
                if (r0 == r5) goto L9
                r2 = r1
                goto La
            L9:
                r2 = 0
            La:
                android.support.v7.app.f r3 = r4.f714b
                if (r2 == 0) goto Lf
                r5 = r0
            Lf:
                android.support.v7.app.f$m r5 = r3.a(r5)
                if (r5 == 0) goto L29
                if (r2 == 0) goto L24
                android.support.v7.app.f r6 = r4.f714b
                int r2 = r5.f711a
                r6.a(r2, r5, r0)
                android.support.v7.app.f r4 = r4.f714b
                r4.a(r5, r1)
                goto L29
            L24:
                android.support.v7.app.f r4 = r4.f714b
                r4.a(r5, r6)
            L29:
                return
        }

        @Override // android.support.v7.view.menu.o.a
        public boolean a(android.support.v7.view.menu.h r3) {
                r2 = this;
                if (r3 != 0) goto L19
                android.support.v7.app.f r0 = r2.f714b
                boolean r1 = r0.z
                if (r1 == 0) goto L19
                android.view.Window$Callback r0 = r0.o()
                if (r0 == 0) goto L19
                android.support.v7.app.f r2 = r2.f714b
                boolean r2 = r2.I
                if (r2 != 0) goto L19
                r2 = 108(0x6c, float:1.51E-43)
                r0.onMenuOpened(r2, r3)
            L19:
                r2 = 1
                return r2
        }
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 1
            r3 = 21
            if (r0 >= r3) goto La
            r0 = r2
            goto Lb
        La:
            r0 = r1
        Lb:
            android.support.v7.app.f.T = r0
            int[] r3 = new int[r2]
            r4 = 16842836(0x1010054, float:2.3693793E-38)
            r3[r1] = r4
            android.support.v7.app.f.U = r3
            if (r0 == 0) goto L2a
            boolean r0 = android.support.v7.app.f.V
            if (r0 != 0) goto L2a
            java.lang.Thread$UncaughtExceptionHandler r0 = java.lang.Thread.getDefaultUncaughtExceptionHandler()
            android.support.v7.app.f$a r1 = new android.support.v7.app.f$a
            r1.<init>(r0)
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r1)
            android.support.v7.app.f.V = r2
        L2a:
            return
    }

    f(android.content.Context r3, android.view.Window r4, android.support.v7.app.d r5) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.r = r0
            r1 = 1
            r2.s = r1
            r1 = -100
            r2.J = r1
            android.support.v7.app.f$b r1 = new android.support.v7.app.f$b
            r1.<init>(r2)
            r2.O = r1
            r2.f693c = r3
            r2.d = r4
            r2.g = r5
            android.view.Window$Callback r4 = r4.getCallback()
            r2.e = r4
            boolean r5 = r4 instanceof android.support.v7.app.f.j
            if (r5 != 0) goto L46
            android.support.v7.app.f$j r5 = new android.support.v7.app.f$j
            r5.<init>(r2, r4)
            r2.f = r5
            android.view.Window r4 = r2.d
            r4.setCallback(r5)
            int[] r4 = android.support.v7.app.f.U
            android.support.v7.widget.t0 r3 = android.support.v7.widget.t0.a(r3, r0, r4)
            r4 = 0
            android.graphics.drawable.Drawable r4 = r3.c(r4)
            if (r4 == 0) goto L42
            android.view.Window r2 = r2.d
            r2.setBackgroundDrawable(r4)
        L42:
            r3.a()
            return
        L46:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "AppCompat has already installed itself into the Window"
            r2.<init>(r3)
            throw r2
    }

    private void A() {
            r1 = this;
            boolean r1 = r1.t
            if (r1 != 0) goto L5
            return
        L5:
            android.util.AndroidRuntimeException r1 = new android.util.AndroidRuntimeException
            java.lang.String r0 = "Window feature must be requested before adding content"
            r1.<init>(r0)
            throw r1
    }

    private void a(android.support.v7.app.f.m r14, android.view.KeyEvent r15) {
            r13 = this;
            boolean r0 = r14.o
            if (r0 != 0) goto Lf2
            boolean r0 = r13.I
            if (r0 == 0) goto La
            goto Lf2
        La:
            int r0 = r14.f711a
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L27
            android.content.Context r0 = r13.f693c
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenLayout
            r0 = r0 & 15
            r3 = 4
            if (r0 != r3) goto L23
            r0 = r2
            goto L24
        L23:
            r0 = r1
        L24:
            if (r0 == 0) goto L27
            return
        L27:
            android.view.Window$Callback r0 = r13.o()
            if (r0 == 0) goto L3b
            int r3 = r14.f711a
            android.support.v7.view.menu.h r4 = r14.j
            boolean r0 = r0.onMenuOpened(r3, r4)
            if (r0 != 0) goto L3b
            r13.a(r14, r2)
            return
        L3b:
            android.content.Context r0 = r13.f693c
            java.lang.String r3 = "window"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            if (r0 != 0) goto L48
            return
        L48:
            boolean r15 = r13.b(r14, r15)
            if (r15 != 0) goto L4f
            return
        L4f:
            android.view.ViewGroup r15 = r14.g
            r3 = -1
            r4 = -2
            if (r15 == 0) goto L6a
            boolean r15 = r14.q
            if (r15 == 0) goto L5a
            goto L6a
        L5a:
            android.view.View r13 = r14.i
            if (r13 == 0) goto Ld0
            android.view.ViewGroup$LayoutParams r13 = r13.getLayoutParams()
            if (r13 == 0) goto Ld0
            int r13 = r13.width
            if (r13 != r3) goto Ld0
            r6 = r3
            goto Ld1
        L6a:
            android.view.ViewGroup r15 = r14.g
            if (r15 != 0) goto L79
            boolean r15 = r13.b(r14)
            if (r15 == 0) goto L78
            android.view.ViewGroup r15 = r14.g
            if (r15 != 0) goto L88
        L78:
            return
        L79:
            boolean r3 = r14.q
            if (r3 == 0) goto L88
            int r15 = r15.getChildCount()
            if (r15 <= 0) goto L88
            android.view.ViewGroup r15 = r14.g
            r15.removeAllViews()
        L88:
            boolean r13 = r13.a(r14)
            if (r13 == 0) goto Lf2
            boolean r13 = r14.a()
            if (r13 != 0) goto L95
            goto Lf2
        L95:
            android.view.View r13 = r14.h
            android.view.ViewGroup$LayoutParams r13 = r13.getLayoutParams()
            if (r13 != 0) goto La2
            android.view.ViewGroup$LayoutParams r13 = new android.view.ViewGroup$LayoutParams
            r13.<init>(r4, r4)
        La2:
            int r15 = r14.f712b
            android.view.ViewGroup r3 = r14.g
            r3.setBackgroundResource(r15)
            android.view.View r15 = r14.h
            android.view.ViewParent r15 = r15.getParent()
            if (r15 == 0) goto Lbc
            boolean r3 = r15 instanceof android.view.ViewGroup
            if (r3 == 0) goto Lbc
            android.view.ViewGroup r15 = (android.view.ViewGroup) r15
            android.view.View r3 = r14.h
            r15.removeView(r3)
        Lbc:
            android.view.ViewGroup r15 = r14.g
            android.view.View r3 = r14.h
            r15.addView(r3, r13)
            android.view.View r13 = r14.h
            boolean r13 = r13.hasFocus()
            if (r13 != 0) goto Ld0
            android.view.View r13 = r14.h
            r13.requestFocus()
        Ld0:
            r6 = r4
        Ld1:
            r14.n = r1
            android.view.WindowManager$LayoutParams r13 = new android.view.WindowManager$LayoutParams
            r7 = -2
            int r8 = r14.d
            int r9 = r14.e
            r10 = 1002(0x3ea, float:1.404E-42)
            r11 = 8519680(0x820000, float:1.1938615E-38)
            r12 = -3
            r5 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            int r15 = r14.f713c
            r13.gravity = r15
            int r15 = r14.f
            r13.windowAnimations = r15
            android.view.ViewGroup r15 = r14.g
            r0.addView(r15, r13)
            r14.o = r2
        Lf2:
            return
    }

    private void a(android.support.v7.view.menu.h r5, boolean r6) {
            r4 = this;
            android.support.v7.widget.a0 r5 = r4.k
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L82
            boolean r5 = r5.e()
            if (r5 == 0) goto L82
            android.content.Context r5 = r4.f693c
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 == 0) goto L20
            android.support.v7.widget.a0 r5 = r4.k
            boolean r5 = r5.b()
            if (r5 == 0) goto L82
        L20:
            android.view.Window$Callback r5 = r4.o()
            android.support.v7.widget.a0 r2 = r4.k
            boolean r2 = r2.d()
            r3 = 108(0x6c, float:1.51E-43)
            if (r2 == 0) goto L44
            if (r6 != 0) goto L31
            goto L44
        L31:
            android.support.v7.widget.a0 r6 = r4.k
            r6.f()
            boolean r6 = r4.I
            if (r6 != 0) goto L81
            android.support.v7.app.f$m r4 = r4.a(r1, r0)
            android.support.v7.view.menu.h r4 = r4.j
            r5.onPanelClosed(r3, r4)
            goto L81
        L44:
            if (r5 == 0) goto L81
            boolean r6 = r4.I
            if (r6 != 0) goto L81
            boolean r6 = r4.M
            if (r6 == 0) goto L63
            int r6 = r4.N
            r6 = r6 & r0
            if (r6 == 0) goto L63
            android.view.Window r6 = r4.d
            android.view.View r6 = r6.getDecorView()
            java.lang.Runnable r2 = r4.O
            r6.removeCallbacks(r2)
            java.lang.Runnable r6 = r4.O
            r6.run()
        L63:
            android.support.v7.app.f$m r6 = r4.a(r1, r0)
            android.support.v7.view.menu.h r0 = r6.j
            if (r0 == 0) goto L81
            boolean r2 = r6.r
            if (r2 != 0) goto L81
            android.view.View r2 = r6.i
            boolean r0 = r5.onPreparePanel(r1, r2, r0)
            if (r0 == 0) goto L81
            android.support.v7.view.menu.h r6 = r6.j
            r5.onMenuOpened(r3, r6)
            android.support.v7.widget.a0 r4 = r4.k
            r4.a()
        L81:
            return
        L82:
            android.support.v7.app.f$m r5 = r4.a(r1, r0)
            r5.q = r0
            r4.a(r5, r1)
            r6 = 0
            r4.a(r5, r6)
            return
    }

    private boolean a(android.support.v7.app.f.m r4) {
            r3 = this;
            android.view.View r0 = r4.i
            r1 = 1
            if (r0 == 0) goto L8
            r4.h = r0
            return r1
        L8:
            android.support.v7.view.menu.h r0 = r4.j
            r2 = 0
            if (r0 != 0) goto Le
            return r2
        Le:
            android.support.v7.app.f$n r0 = r3.m
            if (r0 != 0) goto L19
            android.support.v7.app.f$n r0 = new android.support.v7.app.f$n
            r0.<init>(r3)
            r3.m = r0
        L19:
            android.support.v7.app.f$n r3 = r3.m
            android.support.v7.view.menu.p r3 = r4.a(r3)
            android.view.View r3 = (android.view.View) r3
            r4.h = r3
            if (r3 == 0) goto L26
            goto L27
        L26:
            r1 = r2
        L27:
            return r1
    }

    private boolean a(android.support.v7.app.f.m r3, int r4, android.view.KeyEvent r5, int r6) {
            r2 = this;
            boolean r0 = r5.isSystem()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r3.m
            if (r0 != 0) goto L12
            boolean r0 = r2.b(r3, r5)
            if (r0 == 0) goto L1a
        L12:
            android.support.v7.view.menu.h r0 = r3.j
            if (r0 == 0) goto L1a
            boolean r1 = r0.performShortcut(r4, r5, r6)
        L1a:
            if (r1 == 0) goto L28
            r4 = 1
            r5 = r6 & 1
            if (r5 != 0) goto L28
            android.support.v7.widget.a0 r5 = r2.k
            if (r5 != 0) goto L28
            r2.a(r3, r4)
        L28:
            return r1
    }

    private boolean a(android.view.ViewParent r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            android.view.Window r2 = r2.d
            android.view.View r2 = r2.getDecorView()
        La:
            if (r3 != 0) goto Le
            r2 = 1
            return r2
        Le:
            if (r3 == r2) goto L23
            boolean r1 = r3 instanceof android.view.View
            if (r1 == 0) goto L23
            r1 = r3
            android.view.View r1 = (android.view.View) r1
            boolean r1 = b.b.c.g.q.j(r1)
            if (r1 == 0) goto L1e
            goto L23
        L1e:
            android.view.ViewParent r3 = r3.getParent()
            goto La
        L23:
            return r0
    }

    private boolean b(android.support.v7.app.f.m r3) {
            r2 = this;
            android.content.Context r0 = r2.m()
            r3.a(r0)
            android.support.v7.app.f$l r0 = new android.support.v7.app.f$l
            android.content.Context r1 = r3.l
            r0.<init>(r2, r1)
            r3.g = r0
            r2 = 81
            r3.f713c = r2
            r2 = 1
            return r2
    }

    private boolean b(android.support.v7.app.f.m r9, android.view.KeyEvent r10) {
            r8 = this;
            boolean r0 = r8.I
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            boolean r0 = r9.m
            r2 = 1
            if (r0 == 0) goto Lc
            return r2
        Lc:
            android.support.v7.app.f$m r0 = r8.G
            if (r0 == 0) goto L15
            if (r0 == r9) goto L15
            r8.a(r0, r1)
        L15:
            android.view.Window$Callback r0 = r8.o()
            if (r0 == 0) goto L23
            int r3 = r9.f711a
            android.view.View r3 = r0.onCreatePanelView(r3)
            r9.i = r3
        L23:
            int r3 = r9.f711a
            if (r3 == 0) goto L2e
            r4 = 108(0x6c, float:1.51E-43)
            if (r3 != r4) goto L2c
            goto L2e
        L2c:
            r3 = r1
            goto L2f
        L2e:
            r3 = r2
        L2f:
            if (r3 == 0) goto L38
            android.support.v7.widget.a0 r4 = r8.k
            if (r4 == 0) goto L38
            r4.c()
        L38:
            android.view.View r4 = r9.i
            if (r4 != 0) goto Ldf
            if (r3 == 0) goto L41
            r8.r()
        L41:
            android.support.v7.view.menu.h r4 = r9.j
            r5 = 0
            if (r4 == 0) goto L4a
            boolean r4 = r9.r
            if (r4 == 0) goto L93
        L4a:
            android.support.v7.view.menu.h r4 = r9.j
            if (r4 != 0) goto L59
            boolean r4 = r8.c(r9)
            if (r4 == 0) goto L58
            android.support.v7.view.menu.h r4 = r9.j
            if (r4 != 0) goto L59
        L58:
            return r1
        L59:
            if (r3 == 0) goto L73
            android.support.v7.widget.a0 r4 = r8.k
            if (r4 == 0) goto L73
            android.support.v7.app.f$h r4 = r8.l
            if (r4 != 0) goto L6a
            android.support.v7.app.f$h r4 = new android.support.v7.app.f$h
            r4.<init>(r8)
            r8.l = r4
        L6a:
            android.support.v7.widget.a0 r4 = r8.k
            android.support.v7.view.menu.h r6 = r9.j
            android.support.v7.app.f$h r7 = r8.l
            r4.a(r6, r7)
        L73:
            android.support.v7.view.menu.h r4 = r9.j
            r4.s()
            int r4 = r9.f711a
            android.support.v7.view.menu.h r6 = r9.j
            boolean r4 = r0.onCreatePanelMenu(r4, r6)
            if (r4 != 0) goto L91
            r9.a(r5)
            if (r3 == 0) goto L90
            android.support.v7.widget.a0 r9 = r8.k
            if (r9 == 0) goto L90
            android.support.v7.app.f$h r8 = r8.l
            r9.a(r5, r8)
        L90:
            return r1
        L91:
            r9.r = r1
        L93:
            android.support.v7.view.menu.h r4 = r9.j
            r4.s()
            android.os.Bundle r4 = r9.s
            if (r4 == 0) goto La3
            android.support.v7.view.menu.h r6 = r9.j
            r6.a(r4)
            r9.s = r5
        La3:
            android.view.View r4 = r9.i
            android.support.v7.view.menu.h r6 = r9.j
            boolean r0 = r0.onPreparePanel(r1, r4, r6)
            if (r0 != 0) goto Lbe
            if (r3 == 0) goto Lb8
            android.support.v7.widget.a0 r10 = r8.k
            if (r10 == 0) goto Lb8
            android.support.v7.app.f$h r8 = r8.l
            r10.a(r5, r8)
        Lb8:
            android.support.v7.view.menu.h r8 = r9.j
            r8.r()
            return r1
        Lbe:
            if (r10 == 0) goto Lc5
            int r10 = r10.getDeviceId()
            goto Lc6
        Lc5:
            r10 = -1
        Lc6:
            android.view.KeyCharacterMap r10 = android.view.KeyCharacterMap.load(r10)
            int r10 = r10.getKeyboardType()
            if (r10 == r2) goto Ld2
            r10 = r2
            goto Ld3
        Ld2:
            r10 = r1
        Ld3:
            r9.p = r10
            android.support.v7.view.menu.h r0 = r9.j
            r0.setQwertyMode(r10)
            android.support.v7.view.menu.h r10 = r9.j
            r10.r()
        Ldf:
            r9.m = r2
            r9.n = r1
            r8.G = r9
            return r2
    }

    private boolean c(android.support.v7.app.f.m r7) {
            r6 = this;
            android.content.Context r0 = r6.f693c
            int r1 = r7.f711a
            r2 = 1
            if (r1 == 0) goto Lb
            r3 = 108(0x6c, float:1.51E-43)
            if (r1 != r3) goto L63
        Lb:
            android.support.v7.widget.a0 r1 = r6.k
            if (r1 == 0) goto L63
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            android.content.res.Resources$Theme r3 = r0.getTheme()
            int r4 = b.b.d.a.a.actionBarTheme
            r3.resolveAttribute(r4, r1, r2)
            r4 = 0
            int r5 = r1.resourceId
            if (r5 == 0) goto L38
            android.content.res.Resources r4 = r0.getResources()
            android.content.res.Resources$Theme r4 = r4.newTheme()
            r4.setTo(r3)
            int r5 = r1.resourceId
            r4.applyStyle(r5, r2)
            int r5 = b.b.d.a.a.actionBarWidgetTheme
            r4.resolveAttribute(r5, r1, r2)
            goto L3d
        L38:
            int r5 = b.b.d.a.a.actionBarWidgetTheme
            r3.resolveAttribute(r5, r1, r2)
        L3d:
            int r5 = r1.resourceId
            if (r5 == 0) goto L53
            if (r4 != 0) goto L4e
            android.content.res.Resources r4 = r0.getResources()
            android.content.res.Resources$Theme r4 = r4.newTheme()
            r4.setTo(r3)
        L4e:
            int r1 = r1.resourceId
            r4.applyStyle(r1, r2)
        L53:
            if (r4 == 0) goto L63
            b.b.d.d.d r1 = new b.b.d.d.d
            r3 = 0
            r1.<init>(r0, r3)
            android.content.res.Resources$Theme r0 = r1.getTheme()
            r0.setTo(r4)
            r0 = r1
        L63:
            android.support.v7.view.menu.h r1 = new android.support.v7.view.menu.h
            r1.<init>(r0)
            r1.a(r6)
            r7.a(r1)
            return r2
    }

    private boolean d(int r2, android.view.KeyEvent r3) {
            r1 = this;
            int r0 = r3.getRepeatCount()
            if (r0 != 0) goto L14
            r0 = 1
            android.support.v7.app.f$m r2 = r1.a(r2, r0)
            boolean r0 = r2.o
            if (r0 != 0) goto L14
            boolean r1 = r1.b(r2, r3)
            return r1
        L14:
            r1 = 0
            return r1
    }

    private boolean e(int r4, android.view.KeyEvent r5) {
            r3 = this;
            b.b.d.d.b r0 = r3.n
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 1
            android.support.v7.app.f$m r2 = r3.a(r4, r0)
            if (r4 != 0) goto L43
            android.support.v7.widget.a0 r4 = r3.k
            if (r4 == 0) goto L43
            boolean r4 = r4.e()
            if (r4 == 0) goto L43
            android.content.Context r4 = r3.f693c
            android.view.ViewConfiguration r4 = android.view.ViewConfiguration.get(r4)
            boolean r4 = r4.hasPermanentMenuKey()
            if (r4 != 0) goto L43
            android.support.v7.widget.a0 r4 = r3.k
            boolean r4 = r4.d()
            if (r4 != 0) goto L3c
            boolean r4 = r3.I
            if (r4 != 0) goto L62
            boolean r4 = r3.b(r2, r5)
            if (r4 == 0) goto L62
            android.support.v7.widget.a0 r4 = r3.k
            boolean r0 = r4.a()
            goto L6a
        L3c:
            android.support.v7.widget.a0 r4 = r3.k
            boolean r0 = r4.f()
            goto L6a
        L43:
            boolean r4 = r2.o
            if (r4 != 0) goto L64
            boolean r4 = r2.n
            if (r4 == 0) goto L4c
            goto L64
        L4c:
            boolean r4 = r2.m
            if (r4 == 0) goto L62
            boolean r4 = r2.r
            if (r4 == 0) goto L5b
            r2.m = r1
            boolean r4 = r3.b(r2, r5)
            goto L5c
        L5b:
            r4 = r0
        L5c:
            if (r4 == 0) goto L62
            r3.a(r2, r5)
            goto L6a
        L62:
            r0 = r1
            goto L6a
        L64:
            boolean r4 = r2.o
            r3.a(r2, r0)
            r0 = r4
        L6a:
            if (r0 == 0) goto L83
            android.content.Context r3 = r3.f693c
            java.lang.String r4 = "audio"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.media.AudioManager r3 = (android.media.AudioManager) r3
            if (r3 == 0) goto L7c
            r3.playSoundEffect(r1)
            goto L83
        L7c:
            java.lang.String r3 = "AppCompatDelegate"
            java.lang.String r4 = "Couldn't get audio manager"
            android.util.Log.w(r3, r4)
        L83:
            return r0
    }

    private void j(int r3) {
            r2 = this;
            int r0 = r2.N
            r1 = 1
            int r3 = r1 << r3
            r3 = r3 | r0
            r2.N = r3
            boolean r3 = r2.M
            if (r3 != 0) goto L19
            android.view.Window r3 = r2.d
            android.view.View r3 = r3.getDecorView()
            java.lang.Runnable r0 = r2.O
            b.b.c.g.q.a(r3, r0)
            r2.M = r1
        L19:
            return
    }

    private int k(int r2) {
            r1 = this;
            java.lang.String r1 = "AppCompatDelegate"
            r0 = 8
            if (r2 != r0) goto Le
            java.lang.String r2 = "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature."
            android.util.Log.i(r1, r2)
            r1 = 108(0x6c, float:1.51E-43)
            return r1
        Le:
            r0 = 9
            if (r2 != r0) goto L1a
            java.lang.String r2 = "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature."
            android.util.Log.i(r1, r2)
            r1 = 109(0x6d, float:1.53E-43)
            return r1
        L1a:
            return r2
    }

    private boolean l(int r5) {
            r4 = this;
            android.content.Context r0 = r4.f693c
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r1 = r0.getConfiguration()
            int r2 = r1.uiMode
            r2 = r2 & 48
            r3 = 2
            if (r5 != r3) goto L14
            r5 = 32
            goto L16
        L14:
            r5 = 16
        L16:
            if (r2 == r5) goto L44
            boolean r2 = r4.z()
            if (r2 == 0) goto L26
            android.content.Context r4 = r4.f693c
            android.app.Activity r4 = (android.app.Activity) r4
            r4.recreate()
            goto L42
        L26:
            android.content.res.Configuration r4 = new android.content.res.Configuration
            r4.<init>(r1)
            android.util.DisplayMetrics r1 = r0.getDisplayMetrics()
            int r2 = r4.uiMode
            r2 = r2 & (-49)
            r5 = r5 | r2
            r4.uiMode = r5
            r0.updateConfiguration(r4, r1)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 26
            if (r4 >= r5) goto L42
            android.support.v7.app.h.a(r0)
        L42:
            r4 = 1
            return r4
        L44:
            r4 = 0
            return r4
    }

    private void t() {
            r5 = this;
            android.view.ViewGroup r0 = r5.u
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            android.support.v7.widget.ContentFrameLayout r0 = (android.support.v7.widget.ContentFrameLayout) r0
            android.view.Window r1 = r5.d
            android.view.View r1 = r1.getDecorView()
            int r2 = r1.getPaddingLeft()
            int r3 = r1.getPaddingTop()
            int r4 = r1.getPaddingRight()
            int r1 = r1.getPaddingBottom()
            r0.a(r2, r3, r4, r1)
            android.content.Context r5 = r5.f693c
            int[] r1 = b.b.d.a.j.AppCompatTheme
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r1)
            int r1 = b.b.d.a.j.AppCompatTheme_windowMinWidthMajor
            android.util.TypedValue r2 = r0.getMinWidthMajor()
            r5.getValue(r1, r2)
            int r1 = b.b.d.a.j.AppCompatTheme_windowMinWidthMinor
            android.util.TypedValue r2 = r0.getMinWidthMinor()
            r5.getValue(r1, r2)
            int r1 = b.b.d.a.j.AppCompatTheme_windowFixedWidthMajor
            boolean r1 = r5.hasValue(r1)
            if (r1 == 0) goto L4f
            int r1 = b.b.d.a.j.AppCompatTheme_windowFixedWidthMajor
            android.util.TypedValue r2 = r0.getFixedWidthMajor()
            r5.getValue(r1, r2)
        L4f:
            int r1 = b.b.d.a.j.AppCompatTheme_windowFixedWidthMinor
            boolean r1 = r5.hasValue(r1)
            if (r1 == 0) goto L60
            int r1 = b.b.d.a.j.AppCompatTheme_windowFixedWidthMinor
            android.util.TypedValue r2 = r0.getFixedWidthMinor()
            r5.getValue(r1, r2)
        L60:
            int r1 = b.b.d.a.j.AppCompatTheme_windowFixedHeightMajor
            boolean r1 = r5.hasValue(r1)
            if (r1 == 0) goto L71
            int r1 = b.b.d.a.j.AppCompatTheme_windowFixedHeightMajor
            android.util.TypedValue r2 = r0.getFixedHeightMajor()
            r5.getValue(r1, r2)
        L71:
            int r1 = b.b.d.a.j.AppCompatTheme_windowFixedHeightMinor
            boolean r1 = r5.hasValue(r1)
            if (r1 == 0) goto L82
            int r1 = b.b.d.a.j.AppCompatTheme_windowFixedHeightMinor
            android.util.TypedValue r2 = r0.getFixedHeightMinor()
            r5.getValue(r1, r2)
        L82:
            r5.recycle()
            r0.requestLayout()
            return
    }

    private android.view.ViewGroup u() {
            r7 = this;
            android.content.Context r0 = r7.f693c
            int[] r1 = b.b.d.a.j.AppCompatTheme
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1)
            int r1 = b.b.d.a.j.AppCompatTheme_windowActionBar
            boolean r1 = r0.hasValue(r1)
            if (r1 == 0) goto L199
            int r1 = b.b.d.a.j.AppCompatTheme_windowNoTitle
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            r3 = 1
            if (r1 == 0) goto L1e
            r7.b(r3)
            goto L2b
        L1e:
            int r1 = b.b.d.a.j.AppCompatTheme_windowActionBar
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 == 0) goto L2b
            r1 = 108(0x6c, float:1.51E-43)
            r7.b(r1)
        L2b:
            int r1 = b.b.d.a.j.AppCompatTheme_windowActionBarOverlay
            boolean r1 = r0.getBoolean(r1, r2)
            r4 = 109(0x6d, float:1.53E-43)
            if (r1 == 0) goto L38
            r7.b(r4)
        L38:
            int r1 = b.b.d.a.j.AppCompatTheme_windowActionModeOverlay
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 == 0) goto L45
            r1 = 10
            r7.b(r1)
        L45:
            int r1 = b.b.d.a.j.AppCompatTheme_android_windowIsFloating
            boolean r1 = r0.getBoolean(r1, r2)
            r7.C = r1
            r0.recycle()
            android.view.Window r0 = r7.d
            r0.getDecorView()
            android.content.Context r0 = r7.f693c
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            boolean r1 = r7.D
            r5 = 0
            if (r1 != 0) goto Ld3
            boolean r1 = r7.C
            if (r1 == 0) goto L72
            int r1 = b.b.d.a.g.abc_dialog_title_material
            android.view.View r0 = r0.inflate(r1, r5)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r7.A = r2
            r7.z = r2
            goto Lfc
        L72:
            boolean r0 = r7.z
            if (r0 == 0) goto Ld1
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r1 = r7.f693c
            android.content.res.Resources$Theme r1 = r1.getTheme()
            int r6 = b.b.d.a.a.actionBarTheme
            r1.resolveAttribute(r6, r0, r3)
            int r1 = r0.resourceId
            if (r1 == 0) goto L94
            b.b.d.d.d r1 = new b.b.d.d.d
            android.content.Context r3 = r7.f693c
            int r0 = r0.resourceId
            r1.<init>(r3, r0)
            goto L96
        L94:
            android.content.Context r1 = r7.f693c
        L96:
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r1)
            int r1 = b.b.d.a.g.abc_screen_toolbar
            android.view.View r0 = r0.inflate(r1, r5)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r1 = b.b.d.a.f.decor_content_parent
            android.view.View r1 = r0.findViewById(r1)
            android.support.v7.widget.a0 r1 = (android.support.v7.widget.a0) r1
            r7.k = r1
            android.view.Window$Callback r3 = r7.o()
            r1.setWindowCallback(r3)
            boolean r1 = r7.A
            if (r1 == 0) goto Lbc
            android.support.v7.widget.a0 r1 = r7.k
            r1.a(r4)
        Lbc:
            boolean r1 = r7.x
            if (r1 == 0) goto Lc6
            android.support.v7.widget.a0 r1 = r7.k
            r3 = 2
            r1.a(r3)
        Lc6:
            boolean r1 = r7.y
            if (r1 == 0) goto Lfc
            android.support.v7.widget.a0 r1 = r7.k
            r3 = 5
            r1.a(r3)
            goto Lfc
        Ld1:
            r0 = r5
            goto Lfc
        Ld3:
            boolean r1 = r7.B
            if (r1 == 0) goto Lda
            int r1 = b.b.d.a.g.abc_screen_simple_overlay_action_mode
            goto Ldc
        Lda:
            int r1 = b.b.d.a.g.abc_screen_simple
        Ldc:
            android.view.View r0 = r0.inflate(r1, r5)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 21
            if (r1 < r3) goto Lf1
            android.support.v7.app.f$c r1 = new android.support.v7.app.f$c
            r1.<init>(r7)
            b.b.c.g.q.a(r0, r1)
            goto Lfc
        Lf1:
            r1 = r0
            android.support.v7.widget.e0 r1 = (android.support.v7.widget.e0) r1
            android.support.v7.app.f$d r3 = new android.support.v7.app.f$d
            r3.<init>(r7)
            r1.setOnFitSystemWindowsListener(r3)
        Lfc:
            if (r0 == 0) goto L153
            android.support.v7.widget.a0 r1 = r7.k
            if (r1 != 0) goto L10c
            int r1 = b.b.d.a.f.title
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r7.v = r1
        L10c:
            android.support.v7.widget.z0.b(r0)
            int r1 = b.b.d.a.f.action_bar_activity_content
            android.view.View r1 = r0.findViewById(r1)
            android.support.v7.widget.ContentFrameLayout r1 = (android.support.v7.widget.ContentFrameLayout) r1
            android.view.Window r3 = r7.d
            r4 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r3 = r3.findViewById(r4)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            if (r3 == 0) goto L145
        L124:
            int r6 = r3.getChildCount()
            if (r6 <= 0) goto L135
            android.view.View r6 = r3.getChildAt(r2)
            r3.removeViewAt(r2)
            r1.addView(r6)
            goto L124
        L135:
            r2 = -1
            r3.setId(r2)
            r1.setId(r4)
            boolean r2 = r3 instanceof android.widget.FrameLayout
            if (r2 == 0) goto L145
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r3.setForeground(r5)
        L145:
            android.view.Window r2 = r7.d
            r2.setContentView(r0)
            android.support.v7.app.f$e r2 = new android.support.v7.app.f$e
            r2.<init>(r7)
            r1.setAttachListener(r2)
            return r0
        L153:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "AppCompat does not support the current theme features: { windowActionBar: "
            r1.append(r2)
            boolean r2 = r7.z
            r1.append(r2)
            java.lang.String r2 = ", windowActionBarOverlay: "
            r1.append(r2)
            boolean r2 = r7.A
            r1.append(r2)
            java.lang.String r2 = ", android:windowIsFloating: "
            r1.append(r2)
            boolean r2 = r7.C
            r1.append(r2)
            java.lang.String r2 = ", windowActionModeOverlay: "
            r1.append(r2)
            boolean r2 = r7.B
            r1.append(r2)
            java.lang.String r2 = ", windowNoTitle: "
            r1.append(r2)
            boolean r7 = r7.D
            r1.append(r7)
            java.lang.String r7 = " }"
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L199:
            r0.recycle()
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "You need to use a Theme.AppCompat theme (or descendant) with this activity."
            r7.<init>(r0)
            throw r7
    }

    private void v() {
            r2 = this;
            android.support.v7.app.f$k r0 = r2.L
            if (r0 != 0) goto L11
            android.support.v7.app.f$k r0 = new android.support.v7.app.f$k
            android.content.Context r1 = r2.f693c
            android.support.v7.app.j r1 = android.support.v7.app.j.a(r1)
            r0.<init>(r2, r1)
            r2.L = r0
        L11:
            return
    }

    private void w() {
            r2 = this;
            boolean r0 = r2.t
            if (r0 != 0) goto L50
            android.view.ViewGroup r0 = r2.u()
            r2.u = r0
            java.lang.CharSequence r0 = r2.n()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L31
            android.support.v7.widget.a0 r1 = r2.k
            if (r1 == 0) goto L1c
            r1.setWindowTitle(r0)
            goto L31
        L1c:
            android.support.v7.app.a r1 = r2.r()
            if (r1 == 0) goto L2a
            android.support.v7.app.a r1 = r2.r()
            r1.a(r0)
            goto L31
        L2a:
            android.widget.TextView r1 = r2.v
            if (r1 == 0) goto L31
            r1.setText(r0)
        L31:
            r2.t()
            android.view.ViewGroup r0 = r2.u
            r2.a(r0)
            r0 = 1
            r2.t = r0
            r0 = 0
            android.support.v7.app.f$m r0 = r2.a(r0, r0)
            boolean r1 = r2.I
            if (r1 != 0) goto L50
            if (r0 == 0) goto L4b
            android.support.v7.view.menu.h r0 = r0.j
            if (r0 != 0) goto L50
        L4b:
            r0 = 108(0x6c, float:1.51E-43)
            r2.j(r0)
        L50:
            return
    }

    private int x() {
            r1 = this;
            int r1 = r1.J
            r0 = -100
            if (r1 == r0) goto L7
            goto Lb
        L7:
            int r1 = android.support.v7.app.e.j()
        Lb:
            return r1
    }

    private void y() {
            r3 = this;
            r3.w()
            boolean r0 = r3.z
            if (r0 == 0) goto L37
            android.support.v7.app.a r0 = r3.h
            if (r0 == 0) goto Lc
            goto L37
        Lc:
            android.view.Window$Callback r0 = r3.e
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L20
            android.support.v7.app.k r0 = new android.support.v7.app.k
            android.view.Window$Callback r1 = r3.e
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.A
            r0.<init>(r1, r2)
        L1d:
            r3.h = r0
            goto L2e
        L20:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L2e
            android.support.v7.app.k r0 = new android.support.v7.app.k
            android.view.Window$Callback r1 = r3.e
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L1d
        L2e:
            android.support.v7.app.a r0 = r3.h
            if (r0 == 0) goto L37
            boolean r3 = r3.P
            r0.c(r3)
        L37:
            return
    }

    private boolean z() {
            r5 = this;
            boolean r0 = r5.K
            r1 = 0
            if (r0 == 0) goto L32
            android.content.Context r0 = r5.f693c
            boolean r2 = r0 instanceof android.app.Activity
            if (r2 == 0) goto L32
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r2 = 1
            android.content.ComponentName r3 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            android.content.Context r4 = r5.f693c     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            android.content.Context r5 = r5.f693c     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            java.lang.Class r5 = r5.getClass()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            r3.<init>(r4, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            android.content.pm.ActivityInfo r5 = r0.getActivityInfo(r3, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            int r5 = r5.configChanges     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            r5 = r5 & 512(0x200, float:7.17E-43)
            if (r5 != 0) goto L28
            r1 = r2
        L28:
            return r1
        L29:
            r5 = move-exception
            java.lang.String r0 = "AppCompatDelegate"
            java.lang.String r1 = "Exception while getting ActivityInfo"
            android.util.Log.d(r0, r1, r5)
            return r2
        L32:
            return r1
    }

    protected android.support.v7.app.f.m a(int r4, boolean r5) {
            r3 = this;
            android.support.v7.app.f$m[] r5 = r3.F
            if (r5 == 0) goto L7
            int r0 = r5.length
            if (r0 > r4) goto L15
        L7:
            int r0 = r4 + 1
            android.support.v7.app.f$m[] r0 = new android.support.v7.app.f.m[r0]
            if (r5 == 0) goto L12
            int r1 = r5.length
            r2 = 0
            java.lang.System.arraycopy(r5, r2, r0, r2, r1)
        L12:
            r3.F = r0
            r5 = r0
        L15:
            r3 = r5[r4]
            if (r3 != 0) goto L20
            android.support.v7.app.f$m r3 = new android.support.v7.app.f$m
            r3.<init>(r4)
            r5[r4] = r3
        L20:
            return r3
    }

    android.support.v7.app.f.m a(android.view.Menu r5) {
            r4 = this;
            android.support.v7.app.f$m[] r4 = r4.F
            r0 = 0
            if (r4 == 0) goto L7
            int r1 = r4.length
            goto L8
        L7:
            r1 = r0
        L8:
            if (r0 >= r1) goto L16
            r2 = r4[r0]
            if (r2 == 0) goto L13
            android.support.v7.view.menu.h r3 = r2.j
            if (r3 != r5) goto L13
            return r2
        L13:
            int r0 = r0 + 1
            goto L8
        L16:
            r4 = 0
            return r4
    }

    @Override // android.support.v7.app.e
    public <T extends android.view.View> T a(int r1) {
            r0 = this;
            r0.w()
            android.view.Window r0 = r0.d
            android.view.View r0 = r0.findViewById(r1)
            return r0
    }

    public android.view.View a(android.view.View r12, java.lang.String r13, android.content.Context r14, android.util.AttributeSet r15) {
            r11 = this;
            android.support.v7.app.AppCompatViewInflater r0 = r11.S
            r1 = 0
            if (r0 != 0) goto L60
            android.content.Context r0 = r11.f693c
            int[] r2 = b.b.d.a.j.AppCompatTheme
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r2)
            int r2 = b.b.d.a.j.AppCompatTheme_viewInflaterClass
            java.lang.String r0 = r0.getString(r2)
            if (r0 == 0) goto L59
            java.lang.Class<android.support.v7.app.AppCompatViewInflater> r2 = android.support.v7.app.AppCompatViewInflater.class
            java.lang.String r2 = r2.getName()
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L22
            goto L59
        L22:
            java.lang.Class r2 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L37
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L37
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch: java.lang.Throwable -> L37
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L37
            java.lang.Object r2 = r2.newInstance(r3)     // Catch: java.lang.Throwable -> L37
            android.support.v7.app.AppCompatViewInflater r2 = (android.support.v7.app.AppCompatViewInflater) r2     // Catch: java.lang.Throwable -> L37
            r11.S = r2     // Catch: java.lang.Throwable -> L37
            goto L60
        L37:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to instantiate custom view inflater "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = ". Falling back to default."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = "AppCompatDelegate"
            android.util.Log.i(r3, r0, r2)
            android.support.v7.app.AppCompatViewInflater r0 = new android.support.v7.app.AppCompatViewInflater
            r0.<init>()
            goto L5e
        L59:
            android.support.v7.app.AppCompatViewInflater r0 = new android.support.v7.app.AppCompatViewInflater
            r0.<init>()
        L5e:
            r11.S = r0
        L60:
            boolean r0 = android.support.v7.app.f.T
            if (r0 == 0) goto L7c
            boolean r0 = r15 instanceof org.xmlpull.v1.XmlPullParser
            r2 = 1
            if (r0 == 0) goto L74
            r0 = r15
            org.xmlpull.v1.XmlPullParser r0 = (org.xmlpull.v1.XmlPullParser) r0
            int r0 = r0.getDepth()
            if (r0 <= r2) goto L7c
            r1 = r2
            goto L7c
        L74:
            r0 = r12
            android.view.ViewParent r0 = (android.view.ViewParent) r0
            boolean r0 = r11.a(r0)
            r1 = r0
        L7c:
            r7 = r1
            android.support.v7.app.AppCompatViewInflater r2 = r11.S
            boolean r8 = android.support.v7.app.f.T
            r9 = 1
            boolean r10 = android.support.v7.widget.y0.b()
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            android.view.View r11 = r2.a(r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
    }

    public b.b.d.d.b a(b.b.d.d.b.a r3) {
            r2 = this;
            if (r3 == 0) goto L30
            b.b.d.d.b r0 = r2.n
            if (r0 == 0) goto L9
            r0.a()
        L9:
            android.support.v7.app.f$i r0 = new android.support.v7.app.f$i
            r0.<init>(r2, r3)
            android.support.v7.app.a r3 = r2.c()
            if (r3 == 0) goto L23
            b.b.d.d.b r3 = r3.a(r0)
            r2.n = r3
            if (r3 == 0) goto L23
            android.support.v7.app.d r1 = r2.g
            if (r1 == 0) goto L23
            r1.a(r3)
        L23:
            b.b.d.d.b r3 = r2.n
            if (r3 != 0) goto L2d
            b.b.d.d.b r3 = r2.b(r0)
            r2.n = r3
        L2d:
            b.b.d.d.b r2 = r2.n
            return r2
        L30:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "ActionMode callback can not be null."
            r2.<init>(r3)
            throw r2
    }

    void a(int r3, android.support.v7.app.f.m r4, android.view.Menu r5) {
            r2 = this;
            if (r5 != 0) goto L11
            if (r4 != 0) goto Ld
            if (r3 < 0) goto Ld
            android.support.v7.app.f$m[] r0 = r2.F
            int r1 = r0.length
            if (r3 >= r1) goto Ld
            r4 = r0[r3]
        Ld:
            if (r4 == 0) goto L11
            android.support.v7.view.menu.h r5 = r4.j
        L11:
            if (r4 == 0) goto L18
            boolean r4 = r4.o
            if (r4 != 0) goto L18
            return
        L18:
            boolean r4 = r2.I
            if (r4 != 0) goto L21
            android.view.Window$Callback r2 = r2.e
            r2.onPanelClosed(r3, r5)
        L21:
            return
    }

    @Override // android.support.v7.app.e
    public void a(android.content.res.Configuration r2) {
            r1 = this;
            boolean r0 = r1.z
            if (r0 == 0) goto L11
            boolean r0 = r1.t
            if (r0 == 0) goto L11
            android.support.v7.app.a r0 = r1.c()
            if (r0 == 0) goto L11
            r0.a(r2)
        L11:
            android.support.v7.widget.j r2 = android.support.v7.widget.j.a()
            android.content.Context r0 = r1.f693c
            r2.a(r0)
            r1.a()
            return
    }

    @Override // android.support.v7.app.e
    public void a(android.os.Bundle r3) {
            r2 = this;
            android.view.Window$Callback r0 = r2.e
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L1c
            r1 = 0
            android.app.Activity r0 = (android.app.Activity) r0     // Catch: java.lang.IllegalArgumentException -> Ld
            java.lang.String r1 = android.support.v4.app.t.b(r0)     // Catch: java.lang.IllegalArgumentException -> Ld
        Ld:
            if (r1 == 0) goto L1c
            android.support.v7.app.a r0 = r2.r()
            r1 = 1
            if (r0 != 0) goto L19
            r2.P = r1
            goto L1c
        L19:
            r0.c(r1)
        L1c:
            if (r3 == 0) goto L2c
            int r0 = r2.J
            r1 = -100
            if (r0 != r1) goto L2c
            java.lang.String r0 = "appcompat:local_night_mode"
            int r3 = r3.getInt(r0, r1)
            r2.J = r3
        L2c:
            return
    }

    void a(android.support.v7.app.f.m r4, boolean r5) {
            r3 = this;
            if (r5 == 0) goto L16
            int r0 = r4.f711a
            if (r0 != 0) goto L16
            android.support.v7.widget.a0 r0 = r3.k
            if (r0 == 0) goto L16
            boolean r0 = r0.d()
            if (r0 == 0) goto L16
            android.support.v7.view.menu.h r4 = r4.j
            r3.b(r4)
            return
        L16:
            android.content.Context r0 = r3.f693c
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            r1 = 0
            if (r0 == 0) goto L35
            boolean r2 = r4.o
            if (r2 == 0) goto L35
            android.view.ViewGroup r2 = r4.g
            if (r2 == 0) goto L35
            r0.removeView(r2)
            if (r5 == 0) goto L35
            int r5 = r4.f711a
            r3.a(r5, r4, r1)
        L35:
            r5 = 0
            r4.m = r5
            r4.n = r5
            r4.o = r5
            r4.h = r1
            r5 = 1
            r4.q = r5
            android.support.v7.app.f$m r5 = r3.G
            if (r5 != r4) goto L47
            r3.G = r1
        L47:
            return
    }

    @Override // android.support.v7.view.menu.h.a
    public void a(android.support.v7.view.menu.h r2) {
            r1 = this;
            r0 = 1
            r1.a(r2, r0)
            return
    }

    @Override // android.support.v7.app.e
    public void a(android.view.View r3) {
            r2 = this;
            r2.w()
            android.view.ViewGroup r0 = r2.u
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeAllViews()
            r0.addView(r3)
            android.view.Window$Callback r2 = r2.e
            r2.onContentChanged()
            return
    }

    @Override // android.support.v7.app.e
    public void a(android.view.View r3, android.view.ViewGroup.LayoutParams r4) {
            r2 = this;
            r2.w()
            android.view.ViewGroup r0 = r2.u
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.addView(r3, r4)
            android.view.Window$Callback r2 = r2.e
            r2.onContentChanged()
            return
    }

    void a(android.view.ViewGroup r1) {
            r0 = this;
            return
    }

    @Override // android.support.v7.app.e
    public final void a(java.lang.CharSequence r2) {
            r1 = this;
            r1.j = r2
            android.support.v7.widget.a0 r0 = r1.k
            if (r0 == 0) goto La
            r0.setWindowTitle(r2)
            goto L1f
        La:
            android.support.v7.app.a r0 = r1.r()
            if (r0 == 0) goto L18
            android.support.v7.app.a r1 = r1.r()
            r1.a(r2)
            goto L1f
        L18:
            android.widget.TextView r1 = r1.v
            if (r1 == 0) goto L1f
            r1.setText(r2)
        L1f:
            return
    }

    @Override // android.support.v7.app.e
    public boolean a() {
            r3 = this;
            int r0 = r3.x()
            int r1 = r3.f(r0)
            r2 = -1
            if (r1 == r2) goto L10
            boolean r1 = r3.l(r1)
            goto L11
        L10:
            r1 = 0
        L11:
            if (r0 != 0) goto L1b
            r3.v()
            android.support.v7.app.f$k r0 = r3.L
            r0.d()
        L1b:
            r0 = 1
            r3.K = r0
            return r1
    }

    boolean a(int r4, android.view.KeyEvent r5) {
            r3 = this;
            r0 = 4
            r1 = 1
            r2 = 0
            if (r4 == r0) goto Le
            r0 = 82
            if (r4 == r0) goto La
            goto L1a
        La:
            r3.d(r2, r5)
            return r1
        Le:
            int r4 = r5.getFlags()
            r4 = r4 & 128(0x80, float:1.8E-43)
            if (r4 == 0) goto L17
            goto L18
        L17:
            r1 = r2
        L18:
            r3.H = r1
        L1a:
            return r2
    }

    @Override // android.support.v7.view.menu.h.a
    public boolean a(android.support.v7.view.menu.h r3, android.view.MenuItem r4) {
            r2 = this;
            android.view.Window$Callback r0 = r2.o()
            if (r0 == 0) goto L1b
            boolean r1 = r2.I
            if (r1 != 0) goto L1b
            android.support.v7.view.menu.h r3 = r3.m()
            android.support.v7.app.f$m r2 = r2.a(r3)
            if (r2 == 0) goto L1b
            int r2 = r2.f711a
            boolean r2 = r0.onMenuItemSelected(r2, r4)
            return r2
        L1b:
            r2 = 0
            return r2
    }

    boolean a(android.view.KeyEvent r4) {
            r3 = this;
            android.view.Window$Callback r0 = r3.e
            boolean r1 = r0 instanceof b.b.c.g.e.a
            r2 = 1
            if (r1 != 0) goto Lb
            boolean r0 = r0 instanceof android.support.v7.app.g
            if (r0 == 0) goto L1a
        Lb:
            android.view.Window r0 = r3.d
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L1a
            boolean r0 = b.b.c.g.e.a(r0, r4)
            if (r0 == 0) goto L1a
            return r2
        L1a:
            int r0 = r4.getKeyCode()
            r1 = 82
            if (r0 != r1) goto L2b
            android.view.Window$Callback r0 = r3.e
            boolean r0 = r0.dispatchKeyEvent(r4)
            if (r0 == 0) goto L2b
            return r2
        L2b:
            int r0 = r4.getKeyCode()
            int r1 = r4.getAction()
            if (r1 != 0) goto L36
            goto L37
        L36:
            r2 = 0
        L37:
            if (r2 == 0) goto L3e
            boolean r3 = r3.a(r0, r4)
            goto L42
        L3e:
            boolean r3 = r3.c(r0, r4)
        L42:
            return r3
    }

    @Override // android.support.v7.app.e
    public android.view.MenuInflater b() {
            r2 = this;
            android.view.MenuInflater r0 = r2.i
            if (r0 != 0) goto L19
            r2.y()
            b.b.d.d.g r0 = new b.b.d.d.g
            android.support.v7.app.a r1 = r2.h
            if (r1 == 0) goto L12
            android.content.Context r1 = r1.h()
            goto L14
        L12:
            android.content.Context r1 = r2.f693c
        L14:
            r0.<init>(r1)
            r2.i = r0
        L19:
            android.view.MenuInflater r2 = r2.i
            return r2
    }

    b.b.d.d.b b(b.b.d.d.b.a r8) {
            r7 = this;
            r7.l()
            b.b.d.d.b r0 = r7.n
            if (r0 == 0) goto La
            r0.a()
        La:
            boolean r0 = r8 instanceof android.support.v7.app.f.i
            if (r0 != 0) goto L14
            android.support.v7.app.f$i r0 = new android.support.v7.app.f$i
            r0.<init>(r7, r8)
            r8 = r0
        L14:
            android.support.v7.app.d r0 = r7.g
            r1 = 0
            if (r0 == 0) goto L22
            boolean r2 = r7.I
            if (r2 != 0) goto L22
            b.b.d.d.b r0 = r0.a(r8)     // Catch: java.lang.AbstractMethodError -> L22
            goto L23
        L22:
            r0 = r1
        L23:
            if (r0 == 0) goto L29
            r7.n = r0
            goto L161
        L29:
            android.support.v7.widget.ActionBarContextView r0 = r7.o
            r2 = 0
            r3 = 1
            if (r0 != 0) goto Ld4
            boolean r0 = r7.C
            if (r0 == 0) goto Lb5
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r4 = r7.f693c
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = b.b.d.a.a.actionBarTheme
            r4.resolveAttribute(r5, r0, r3)
            int r5 = r0.resourceId
            if (r5 == 0) goto L68
            android.content.Context r5 = r7.f693c
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r0.resourceId
            r5.applyStyle(r4, r3)
            b.b.d.d.d r4 = new b.b.d.d.d
            android.content.Context r6 = r7.f693c
            r4.<init>(r6, r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L6a
        L68:
            android.content.Context r4 = r7.f693c
        L6a:
            android.support.v7.widget.ActionBarContextView r5 = new android.support.v7.widget.ActionBarContextView
            r5.<init>(r4)
            r7.o = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            int r6 = b.b.d.a.a.actionModePopupWindowStyle
            r5.<init>(r4, r1, r6)
            r7.p = r5
            r6 = 2
            android.support.v4.widget.j.a(r5, r6)
            android.widget.PopupWindow r5 = r7.p
            android.support.v7.widget.ActionBarContextView r6 = r7.o
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.p
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            int r6 = b.b.d.a.a.actionBarSize
            r5.resolveAttribute(r6, r0, r3)
            int r0 = r0.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4)
            android.support.v7.widget.ActionBarContextView r4 = r7.o
            r4.setContentHeight(r0)
            android.widget.PopupWindow r0 = r7.p
            r4 = -2
            r0.setHeight(r4)
            android.support.v7.app.f$f r0 = new android.support.v7.app.f$f
            r0.<init>(r7)
            r7.q = r0
            goto Ld4
        Lb5:
            android.view.ViewGroup r0 = r7.u
            int r4 = b.b.d.a.f.action_mode_bar_stub
            android.view.View r0 = r0.findViewById(r4)
            android.support.v7.widget.ViewStubCompat r0 = (android.support.v7.widget.ViewStubCompat) r0
            if (r0 == 0) goto Ld4
            android.content.Context r4 = r7.m()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0.setLayoutInflater(r4)
            android.view.View r0 = r0.a()
            android.support.v7.widget.ActionBarContextView r0 = (android.support.v7.widget.ActionBarContextView) r0
            r7.o = r0
        Ld4:
            android.support.v7.widget.ActionBarContextView r0 = r7.o
            if (r0 == 0) goto L161
            r7.l()
            android.support.v7.widget.ActionBarContextView r0 = r7.o
            r0.c()
            b.b.d.d.e r0 = new b.b.d.d.e
            android.support.v7.widget.ActionBarContextView r4 = r7.o
            android.content.Context r4 = r4.getContext()
            android.support.v7.widget.ActionBarContextView r5 = r7.o
            android.widget.PopupWindow r6 = r7.p
            if (r6 != 0) goto Lef
            goto Lf0
        Lef:
            r3 = r2
        Lf0:
            r0.<init>(r4, r5, r8, r3)
            android.view.Menu r3 = r0.c()
            boolean r8 = r8.b(r0, r3)
            if (r8 == 0) goto L15f
            r0.i()
            android.support.v7.widget.ActionBarContextView r8 = r7.o
            r8.a(r0)
            r7.n = r0
            boolean r8 = r7.s()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L129
            android.support.v7.widget.ActionBarContextView r8 = r7.o
            r1 = 0
            r8.setAlpha(r1)
            android.support.v7.widget.ActionBarContextView r8 = r7.o
            b.b.c.g.u r8 = b.b.c.g.q.a(r8)
            r8.a(r0)
            r7.r = r8
            android.support.v7.app.f$g r0 = new android.support.v7.app.f$g
            r0.<init>(r7)
            r8.a(r0)
            goto L14f
        L129:
            android.support.v7.widget.ActionBarContextView r8 = r7.o
            r8.setAlpha(r0)
            android.support.v7.widget.ActionBarContextView r8 = r7.o
            r8.setVisibility(r2)
            android.support.v7.widget.ActionBarContextView r8 = r7.o
            r0 = 32
            r8.sendAccessibilityEvent(r0)
            android.support.v7.widget.ActionBarContextView r8 = r7.o
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L14f
            android.support.v7.widget.ActionBarContextView r8 = r7.o
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            b.b.c.g.q.m(r8)
        L14f:
            android.widget.PopupWindow r8 = r7.p
            if (r8 == 0) goto L161
            android.view.Window r8 = r7.d
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.q
            r8.post(r0)
            goto L161
        L15f:
            r7.n = r1
        L161:
            b.b.d.d.b r8 = r7.n
            if (r8 == 0) goto L16c
            android.support.v7.app.d r0 = r7.g
            if (r0 == 0) goto L16c
            r0.a(r8)
        L16c:
            b.b.d.d.b r7 = r7.n
            return r7
    }

    @Override // android.support.v7.app.e
    public void b(android.os.Bundle r1) {
            r0 = this;
            r0.w()
            return
    }

    void b(android.support.v7.view.menu.h r3) {
            r2 = this;
            boolean r0 = r2.E
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r2.E = r0
            android.support.v7.widget.a0 r0 = r2.k
            r0.g()
            android.view.Window$Callback r0 = r2.o()
            if (r0 == 0) goto L1c
            boolean r1 = r2.I
            if (r1 != 0) goto L1c
            r1 = 108(0x6c, float:1.51E-43)
            r0.onPanelClosed(r1, r3)
        L1c:
            r3 = 0
            r2.E = r3
            return
    }

    @Override // android.support.v7.app.e
    public void b(android.view.View r3, android.view.ViewGroup.LayoutParams r4) {
            r2 = this;
            r2.w()
            android.view.ViewGroup r0 = r2.u
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeAllViews()
            r0.addView(r3, r4)
            android.view.Window$Callback r2 = r2.e
            r2.onContentChanged()
            return
    }

    @Override // android.support.v7.app.e
    public boolean b(int r5) {
            r4 = this;
            int r5 = r4.k(r5)
            boolean r0 = r4.D
            r1 = 0
            r2 = 108(0x6c, float:1.51E-43)
            if (r0 == 0) goto Le
            if (r5 != r2) goto Le
            return r1
        Le:
            boolean r0 = r4.z
            r3 = 1
            if (r0 == 0) goto L17
            if (r5 != r3) goto L17
            r4.z = r1
        L17:
            if (r5 == r3) goto L4e
            r0 = 2
            if (r5 == r0) goto L48
            r0 = 5
            if (r5 == r0) goto L42
            r0 = 10
            if (r5 == r0) goto L3c
            if (r5 == r2) goto L36
            r0 = 109(0x6d, float:1.53E-43)
            if (r5 == r0) goto L30
            android.view.Window r4 = r4.d
            boolean r4 = r4.requestFeature(r5)
            return r4
        L30:
            r4.A()
            r4.A = r3
            return r3
        L36:
            r4.A()
            r4.z = r3
            return r3
        L3c:
            r4.A()
            r4.B = r3
            return r3
        L42:
            r4.A()
            r4.y = r3
            return r3
        L48:
            r4.A()
            r4.x = r3
            return r3
        L4e:
            r4.A()
            r4.D = r3
            return r3
    }

    boolean b(int r4, android.view.KeyEvent r5) {
            r3 = this;
            android.support.v7.app.a r0 = r3.c()
            r1 = 1
            if (r0 == 0) goto Le
            boolean r4 = r0.a(r4, r5)
            if (r4 == 0) goto Le
            return r1
        Le:
            android.support.v7.app.f$m r4 = r3.G
            if (r4 == 0) goto L23
            int r0 = r5.getKeyCode()
            boolean r4 = r3.a(r4, r0, r5, r1)
            if (r4 == 0) goto L23
            android.support.v7.app.f$m r3 = r3.G
            if (r3 == 0) goto L22
            r3.n = r1
        L22:
            return r1
        L23:
            android.support.v7.app.f$m r4 = r3.G
            r0 = 0
            if (r4 != 0) goto L3c
            android.support.v7.app.f$m r4 = r3.a(r0, r1)
            r3.b(r4, r5)
            int r2 = r5.getKeyCode()
            boolean r3 = r3.a(r4, r2, r5, r1)
            r4.m = r0
            if (r3 == 0) goto L3c
            return r1
        L3c:
            return r0
    }

    @Override // android.support.v7.app.e
    public android.support.v7.app.a c() {
            r0 = this;
            r0.y()
            android.support.v7.app.a r0 = r0.h
            return r0
    }

    @Override // android.support.v7.app.e
    public void c(int r3) {
            r2 = this;
            r2.w()
            android.view.ViewGroup r0 = r2.u
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeAllViews()
            android.content.Context r1 = r2.f693c
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r1.inflate(r3, r0)
            android.view.Window$Callback r2 = r2.e
            r2.onContentChanged()
            return
    }

    @Override // android.support.v7.app.e
    public void c(android.os.Bundle r2) {
            r1 = this;
            int r1 = r1.J
            r0 = -100
            if (r1 == r0) goto Lb
            java.lang.String r0 = "appcompat:local_night_mode"
            r2.putInt(r0, r1)
        Lb:
            return
    }

    boolean c(int r4, android.view.KeyEvent r5) {
            r3 = this;
            r0 = 4
            r1 = 1
            r2 = 0
            if (r4 == r0) goto Le
            r0 = 82
            if (r4 == r0) goto La
            goto L29
        La:
            r3.e(r2, r5)
            return r1
        Le:
            boolean r4 = r3.H
            r3.H = r2
            android.support.v7.app.f$m r5 = r3.a(r2, r2)
            if (r5 == 0) goto L22
            boolean r0 = r5.o
            if (r0 == 0) goto L22
            if (r4 != 0) goto L21
            r3.a(r5, r1)
        L21:
            return r1
        L22:
            boolean r3 = r3.q()
            if (r3 == 0) goto L29
            return r1
        L29:
            return r2
    }

    @Override // android.support.v7.app.e
    public void d() {
            r2 = this;
            android.content.Context r0 = r2.f693c
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            android.view.LayoutInflater$Factory r1 = r0.getFactory()
            if (r1 != 0) goto L10
            b.b.c.g.f.b(r0, r2)
            goto L1f
        L10:
            android.view.LayoutInflater$Factory2 r2 = r0.getFactory2()
            boolean r2 = r2 instanceof android.support.v7.app.f
            if (r2 != 0) goto L1f
            java.lang.String r2 = "AppCompatDelegate"
            java.lang.String r0 = "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's"
            android.util.Log.i(r2, r0)
        L1f:
            return
    }

    void d(int r2) {
            r1 = this;
            r0 = 1
            android.support.v7.app.f$m r2 = r1.a(r2, r0)
            r1.a(r2, r0)
            return
    }

    @Override // android.support.v7.app.e
    public void e() {
            r1 = this;
            android.support.v7.app.a r0 = r1.c()
            if (r0 == 0) goto Ld
            boolean r0 = r0.i()
            if (r0 == 0) goto Ld
            return
        Ld:
            r0 = 0
            r1.j(r0)
            return
    }

    void e(int r5) {
            r4 = this;
            r0 = 1
            android.support.v7.app.f$m r1 = r4.a(r5, r0)
            android.support.v7.view.menu.h r2 = r1.j
            if (r2 == 0) goto L25
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            android.support.v7.view.menu.h r3 = r1.j
            r3.b(r2)
            int r3 = r2.size()
            if (r3 <= 0) goto L1b
            r1.s = r2
        L1b:
            android.support.v7.view.menu.h r2 = r1.j
            r2.s()
            android.support.v7.view.menu.h r2 = r1.j
            r2.clear()
        L25:
            r1.r = r0
            r1.q = r0
            r0 = 108(0x6c, float:1.51E-43)
            if (r5 == r0) goto L2f
            if (r5 != 0) goto L40
        L2f:
            android.support.v7.widget.a0 r5 = r4.k
            if (r5 == 0) goto L40
            r5 = 0
            android.support.v7.app.f$m r0 = r4.a(r5, r5)
            if (r0 == 0) goto L40
            r0.m = r5
            r5 = 0
            r4.b(r0, r5)
        L40:
            return
    }

    int f(int r3) {
            r2 = this;
            r0 = -100
            r1 = -1
            if (r3 == r0) goto L29
            if (r3 == 0) goto L8
            return r3
        L8:
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r3 < r0) goto L1f
            android.content.Context r3 = r2.f693c
            java.lang.Class<android.app.UiModeManager> r0 = android.app.UiModeManager.class
            java.lang.Object r3 = r3.getSystemService(r0)
            android.app.UiModeManager r3 = (android.app.UiModeManager) r3
            int r3 = r3.getNightMode()
            if (r3 != 0) goto L1f
            return r1
        L1f:
            r2.v()
            android.support.v7.app.f$k r2 = r2.L
            int r2 = r2.c()
            return r2
        L29:
            return r1
    }

    @Override // android.support.v7.app.e
    public void f() {
            r2 = this;
            boolean r0 = r2.M
            if (r0 == 0) goto Lf
            android.view.Window r0 = r2.d
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r2.O
            r0.removeCallbacks(r1)
        Lf:
            r0 = 1
            r2.I = r0
            android.support.v7.app.a r0 = r2.h
            if (r0 == 0) goto L19
            r0.j()
        L19:
            android.support.v7.app.f$k r2 = r2.L
            if (r2 == 0) goto L20
            r2.a()
        L20:
            return
    }

    @Override // android.support.v7.app.e
    public void g() {
            r1 = this;
            android.support.v7.app.a r1 = r1.c()
            if (r1 == 0) goto La
            r0 = 1
            r1.d(r0)
        La:
            return
    }

    void g(int r2) {
            r1 = this;
            r0 = 108(0x6c, float:1.51E-43)
            if (r2 != r0) goto Le
            android.support.v7.app.a r1 = r1.c()
            if (r1 == 0) goto Le
            r2 = 1
            r1.b(r2)
        Le:
            return
    }

    @Override // android.support.v7.app.e
    public void h() {
            r0 = this;
            r0.a()
            return
    }

    void h(int r3) {
            r2 = this;
            r0 = 0
            r1 = 108(0x6c, float:1.51E-43)
            if (r3 != r1) goto Lf
            android.support.v7.app.a r2 = r2.c()
            if (r2 == 0) goto L1d
            r2.b(r0)
            goto L1d
        Lf:
            if (r3 != 0) goto L1d
            r1 = 1
            android.support.v7.app.f$m r3 = r2.a(r3, r1)
            boolean r1 = r3.o
            if (r1 == 0) goto L1d
            r2.a(r3, r0)
        L1d:
            return
    }

    int i(int r9) {
            r8 = this;
            android.support.v7.widget.ActionBarContextView r0 = r8.o
            r1 = 0
            if (r0 == 0) goto La8
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r0 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto La8
            android.support.v7.widget.ActionBarContextView r0 = r8.o
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            android.support.v7.widget.ActionBarContextView r2 = r8.o
            boolean r2 = r2.isShown()
            r3 = 1
            if (r2 == 0) goto L96
            android.graphics.Rect r2 = r8.Q
            if (r2 != 0) goto L30
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r8.Q = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r8.R = r2
        L30:
            android.graphics.Rect r2 = r8.Q
            android.graphics.Rect r4 = r8.R
            r2.set(r1, r9, r1, r1)
            android.view.ViewGroup r5 = r8.u
            android.support.v7.widget.z0.a(r5, r2, r4)
            int r2 = r4.top
            if (r2 != 0) goto L42
            r2 = r9
            goto L43
        L42:
            r2 = r1
        L43:
            int r4 = r0.topMargin
            if (r4 == r2) goto L84
            r0.topMargin = r9
            android.view.View r2 = r8.w
            if (r2 != 0) goto L73
            android.view.View r2 = new android.view.View
            android.content.Context r4 = r8.f693c
            r2.<init>(r4)
            r8.w = r2
            android.content.Context r4 = r8.f693c
            android.content.res.Resources r4 = r4.getResources()
            int r5 = b.b.d.a.c.abc_input_method_navigation_guard
            int r4 = r4.getColor(r5)
            r2.setBackgroundColor(r4)
            android.view.ViewGroup r2 = r8.u
            android.view.View r4 = r8.w
            android.view.ViewGroup$LayoutParams r5 = new android.view.ViewGroup$LayoutParams
            r6 = -1
            r5.<init>(r6, r9)
            r2.addView(r4, r6, r5)
            goto L82
        L73:
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            int r4 = r2.height
            if (r4 == r9) goto L82
            r2.height = r9
            android.view.View r4 = r8.w
            r4.setLayoutParams(r2)
        L82:
            r2 = r3
            goto L85
        L84:
            r2 = r1
        L85:
            android.view.View r4 = r8.w
            if (r4 == 0) goto L8a
            goto L8b
        L8a:
            r3 = r1
        L8b:
            boolean r4 = r8.B
            if (r4 != 0) goto L92
            if (r3 == 0) goto L92
            r9 = r1
        L92:
            r7 = r3
            r3 = r2
            r2 = r7
            goto La0
        L96:
            int r2 = r0.topMargin
            if (r2 == 0) goto L9e
            r0.topMargin = r1
            r2 = r1
            goto La0
        L9e:
            r2 = r1
            r3 = r2
        La0:
            if (r3 == 0) goto La9
            android.support.v7.widget.ActionBarContextView r3 = r8.o
            r3.setLayoutParams(r0)
            goto La9
        La8:
            r2 = r1
        La9:
            android.view.View r8 = r8.w
            if (r8 == 0) goto Lb5
            if (r2 == 0) goto Lb0
            goto Lb2
        Lb0:
            r1 = 8
        Lb2:
            r8.setVisibility(r1)
        Lb5:
            return r9
    }

    @Override // android.support.v7.app.e
    public void i() {
            r2 = this;
            android.support.v7.app.a r0 = r2.c()
            if (r0 == 0) goto La
            r1 = 0
            r0.d(r1)
        La:
            android.support.v7.app.f$k r2 = r2.L
            if (r2 == 0) goto L11
            r2.a()
        L11:
            return
    }

    void k() {
            r2 = this;
            android.support.v7.widget.a0 r0 = r2.k
            if (r0 == 0) goto L7
            r0.g()
        L7:
            android.widget.PopupWindow r0 = r2.p
            if (r0 == 0) goto L26
            android.view.Window r0 = r2.d
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r2.q
            r0.removeCallbacks(r1)
            android.widget.PopupWindow r0 = r2.p
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L23
            android.widget.PopupWindow r0 = r2.p     // Catch: java.lang.IllegalArgumentException -> L23
            r0.dismiss()     // Catch: java.lang.IllegalArgumentException -> L23
        L23:
            r0 = 0
            r2.p = r0
        L26:
            r2.l()
            r0 = 0
            android.support.v7.app.f$m r2 = r2.a(r0, r0)
            if (r2 == 0) goto L37
            android.support.v7.view.menu.h r2 = r2.j
            if (r2 == 0) goto L37
            r2.close()
        L37:
            return
    }

    void l() {
            r0 = this;
            b.b.c.g.u r0 = r0.r
            if (r0 == 0) goto L7
            r0.a()
        L7:
            return
    }

    final android.content.Context m() {
            r1 = this;
            android.support.v7.app.a r0 = r1.c()
            if (r0 == 0) goto Lb
            android.content.Context r0 = r0.h()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 != 0) goto L10
            android.content.Context r0 = r1.f693c
        L10:
            return r0
    }

    final java.lang.CharSequence n() {
            r2 = this;
            android.view.Window$Callback r0 = r2.e
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto Ld
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.CharSequence r2 = r0.getTitle()
            return r2
        Ld:
            java.lang.CharSequence r2 = r2.j
            return r2
    }

    final android.view.Window.Callback o() {
            r0 = this;
            android.view.Window r0 = r0.d
            android.view.Window$Callback r0 = r0.getCallback()
            return r0
    }

    @Override // android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View r1, java.lang.String r2, android.content.Context r3, android.util.AttributeSet r4) {
            r0 = this;
            android.view.View r0 = r0.a(r1, r2, r3, r4)
            return r0
    }

    @Override // android.view.LayoutInflater.Factory
    public android.view.View onCreateView(java.lang.String r2, android.content.Context r3, android.util.AttributeSet r4) {
            r1 = this;
            r0 = 0
            android.view.View r1 = r1.onCreateView(r0, r2, r3, r4)
            return r1
    }

    public boolean p() {
            r0 = this;
            boolean r0 = r0.s
            return r0
    }

    boolean q() {
            r2 = this;
            b.b.d.d.b r0 = r2.n
            r1 = 1
            if (r0 == 0) goto L9
            r0.a()
            return r1
        L9:
            android.support.v7.app.a r2 = r2.c()
            if (r2 == 0) goto L16
            boolean r2 = r2.f()
            if (r2 == 0) goto L16
            return r1
        L16:
            r2 = 0
            return r2
    }

    final android.support.v7.app.a r() {
            r0 = this;
            android.support.v7.app.a r0 = r0.h
            return r0
    }

    final boolean s() {
            r1 = this;
            boolean r0 = r1.t
            if (r0 == 0) goto L10
            android.view.ViewGroup r1 = r1.u
            if (r1 == 0) goto L10
            boolean r1 = b.b.c.g.q.k(r1)
            if (r1 == 0) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
    }
}
