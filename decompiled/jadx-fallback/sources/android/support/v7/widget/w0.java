package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
class w0 implements android.view.View.OnLongClickListener, android.view.View.OnHoverListener, android.view.View.OnAttachStateChangeListener {
    private static android.support.v7.widget.w0 k;
    private static android.support.v7.widget.w0 l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.view.View f940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.CharSequence f941c;
    private final int d;
    private final java.lang.Runnable e;
    private final java.lang.Runnable f;
    private int g;
    private int h;
    private android.support.v7.widget.x0 i;
    private boolean j;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.support.v7.widget.w0 f942b;

        a(android.support.v7.widget.w0 r1) {
                r0 = this;
                r0.f942b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                android.support.v7.widget.w0 r1 = r1.f942b
                r0 = 0
                r1.a(r0)
                return
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.support.v7.widget.w0 f943b;

        b(android.support.v7.widget.w0 r1) {
                r0 = this;
                r0.f943b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r0 = this;
                android.support.v7.widget.w0 r0 = r0.f943b
                r0.a()
                return
        }
    }

    private w0(android.view.View r2, java.lang.CharSequence r3) {
            r1 = this;
            r1.<init>()
            android.support.v7.widget.w0$a r0 = new android.support.v7.widget.w0$a
            r0.<init>(r1)
            r1.e = r0
            android.support.v7.widget.w0$b r0 = new android.support.v7.widget.w0$b
            r0.<init>(r1)
            r1.f = r0
            r1.f940b = r2
            r1.f941c = r3
            android.content.Context r2 = r2.getContext()
            android.view.ViewConfiguration r2 = android.view.ViewConfiguration.get(r2)
            int r2 = b.b.c.g.r.a(r2)
            r1.d = r2
            r1.c()
            android.view.View r2 = r1.f940b
            r2.setOnLongClickListener(r1)
            android.view.View r2 = r1.f940b
            r2.setOnHoverListener(r1)
            return
    }

    private static void a(android.support.v7.widget.w0 r1) {
            android.support.v7.widget.w0 r0 = android.support.v7.widget.w0.k
            if (r0 == 0) goto L7
            r0.b()
        L7:
            android.support.v7.widget.w0.k = r1
            if (r1 == 0) goto Le
            r1.d()
        Le:
            return
    }

    public static void a(android.view.View r2, java.lang.CharSequence r3) {
            android.support.v7.widget.w0 r0 = android.support.v7.widget.w0.k
            r1 = 0
            if (r0 == 0) goto Lc
            android.view.View r0 = r0.f940b
            if (r0 != r2) goto Lc
            a(r1)
        Lc:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L28
            android.support.v7.widget.w0 r3 = android.support.v7.widget.w0.l
            if (r3 == 0) goto L1d
            android.view.View r0 = r3.f940b
            if (r0 != r2) goto L1d
            r3.a()
        L1d:
            r2.setOnLongClickListener(r1)
            r3 = 0
            r2.setLongClickable(r3)
            r2.setOnHoverListener(r1)
            goto L2d
        L28:
            android.support.v7.widget.w0 r0 = new android.support.v7.widget.w0
            r0.<init>(r2, r3)
        L2d:
            return
    }

    private boolean a(android.view.MotionEvent r4) {
            r3 = this;
            float r0 = r4.getX()
            int r0 = (int) r0
            float r4 = r4.getY()
            int r4 = (int) r4
            int r1 = r3.g
            int r1 = r0 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.d
            if (r1 > r2) goto L24
            int r1 = r3.h
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.d
            if (r1 > r2) goto L24
            r3 = 0
            return r3
        L24:
            r3.g = r0
            r3.h = r4
            r3 = 1
            return r3
    }

    private void b() {
            r1 = this;
            android.view.View r0 = r1.f940b
            java.lang.Runnable r1 = r1.e
            r0.removeCallbacks(r1)
            return
    }

    private void c() {
            r1 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.g = r0
            r1.h = r0
            return
    }

    private void d() {
            r3 = this;
            android.view.View r0 = r3.f940b
            java.lang.Runnable r3 = r3.e
            int r1 = android.view.ViewConfiguration.getLongPressTimeout()
            long r1 = (long) r1
            r0.postDelayed(r3, r1)
            return
    }

    void a() {
            r3 = this;
            android.support.v7.widget.w0 r0 = android.support.v7.widget.w0.l
            r1 = 0
            if (r0 != r3) goto L20
            android.support.v7.widget.w0.l = r1
            android.support.v7.widget.x0 r0 = r3.i
            if (r0 == 0) goto L19
            r0.a()
            r3.i = r1
            r3.c()
            android.view.View r0 = r3.f940b
            r0.removeOnAttachStateChangeListener(r3)
            goto L20
        L19:
            java.lang.String r0 = "TooltipCompatHandler"
            java.lang.String r2 = "sActiveHandler.mPopup == null"
            android.util.Log.e(r0, r2)
        L20:
            android.support.v7.widget.w0 r0 = android.support.v7.widget.w0.k
            if (r0 != r3) goto L27
            a(r1)
        L27:
            android.view.View r0 = r3.f940b
            java.lang.Runnable r3 = r3.f
            r0.removeCallbacks(r3)
            return
    }

    void a(boolean r8) {
            r7 = this;
            android.view.View r0 = r7.f940b
            boolean r0 = b.b.c.g.q.j(r0)
            if (r0 != 0) goto L9
            return
        L9:
            r0 = 0
            a(r0)
            android.support.v7.widget.w0 r0 = android.support.v7.widget.w0.l
            if (r0 == 0) goto L14
            r0.a()
        L14:
            android.support.v7.widget.w0.l = r7
            r7.j = r8
            android.support.v7.widget.x0 r1 = new android.support.v7.widget.x0
            android.view.View r8 = r7.f940b
            android.content.Context r8 = r8.getContext()
            r1.<init>(r8)
            r7.i = r1
            android.view.View r2 = r7.f940b
            int r3 = r7.g
            int r4 = r7.h
            boolean r5 = r7.j
            java.lang.CharSequence r6 = r7.f941c
            r1.a(r2, r3, r4, r5, r6)
            android.view.View r8 = r7.f940b
            r8.addOnAttachStateChangeListener(r7)
            boolean r8 = r7.j
            if (r8 == 0) goto L3e
            r0 = 2500(0x9c4, double:1.235E-320)
            goto L53
        L3e:
            android.view.View r8 = r7.f940b
            int r8 = b.b.c.g.q.g(r8)
            r0 = 1
            r8 = r8 & r0
            if (r8 != r0) goto L4b
            r0 = 3000(0xbb8, double:1.482E-320)
            goto L4d
        L4b:
            r0 = 15000(0x3a98, double:7.411E-320)
        L4d:
            int r8 = android.view.ViewConfiguration.getLongPressTimeout()
            long r2 = (long) r8
            long r0 = r0 - r2
        L53:
            android.view.View r8 = r7.f940b
            java.lang.Runnable r2 = r7.f
            r8.removeCallbacks(r2)
            android.view.View r8 = r7.f940b
            java.lang.Runnable r7 = r7.f
            r8.postDelayed(r7, r0)
            return
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(android.view.View r3, android.view.MotionEvent r4) {
            r2 = this;
            android.support.v7.widget.x0 r3 = r2.i
            r0 = 0
            if (r3 == 0) goto La
            boolean r3 = r2.j
            if (r3 == 0) goto La
            return r0
        La:
            android.view.View r3 = r2.f940b
            android.content.Context r3 = r3.getContext()
            java.lang.String r1 = "accessibility"
            java.lang.Object r3 = r3.getSystemService(r1)
            android.view.accessibility.AccessibilityManager r3 = (android.view.accessibility.AccessibilityManager) r3
            boolean r1 = r3.isEnabled()
            if (r1 == 0) goto L25
            boolean r3 = r3.isTouchExplorationEnabled()
            if (r3 == 0) goto L25
            return r0
        L25:
            int r3 = r4.getAction()
            r1 = 7
            if (r3 == r1) goto L38
            r4 = 10
            if (r3 == r4) goto L31
            goto L4d
        L31:
            r2.c()
            r2.a()
            goto L4d
        L38:
            android.view.View r3 = r2.f940b
            boolean r3 = r3.isEnabled()
            if (r3 == 0) goto L4d
            android.support.v7.widget.x0 r3 = r2.i
            if (r3 != 0) goto L4d
            boolean r3 = r2.a(r4)
            if (r3 == 0) goto L4d
            a(r2)
        L4d:
            return r0
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View r2) {
            r1 = this;
            int r0 = r2.getWidth()
            int r0 = r0 / 2
            r1.g = r0
            int r2 = r2.getHeight()
            int r2 = r2 / 2
            r1.h = r2
            r2 = 1
            r1.a(r2)
            return r2
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View r1) {
            r0 = this;
            r0.a()
            return
    }
}
