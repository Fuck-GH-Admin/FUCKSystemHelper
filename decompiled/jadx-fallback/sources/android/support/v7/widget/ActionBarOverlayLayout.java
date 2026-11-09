package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends android.view.ViewGroup implements android.support.v7.widget.a0, b.b.c.g.m {
    static final int[] C = null;
    private final java.lang.Runnable A;
    private final b.b.c.g.n B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f789c;
    private android.support.v7.widget.ContentFrameLayout d;
    android.support.v7.widget.ActionBarContainer e;
    private android.support.v7.widget.b0 f;
    private android.graphics.drawable.Drawable g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    boolean l;
    private int m;
    private int n;
    private final android.graphics.Rect o;
    private final android.graphics.Rect p;
    private final android.graphics.Rect q;
    private final android.graphics.Rect r;
    private final android.graphics.Rect s;
    private final android.graphics.Rect t;
    private final android.graphics.Rect u;
    private android.support.v7.widget.ActionBarOverlayLayout.d v;
    private android.widget.OverScroller w;
    android.view.ViewPropertyAnimator x;
    final android.animation.AnimatorListenerAdapter y;
    private final java.lang.Runnable z;

    class a extends android.animation.AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.support.v7.widget.ActionBarOverlayLayout f790a;

        a(android.support.v7.widget.ActionBarOverlayLayout r1) {
                r0 = this;
                r0.f790a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator r1) {
                r0 = this;
                android.support.v7.widget.ActionBarOverlayLayout r0 = r0.f790a
                r1 = 0
                r0.x = r1
                r1 = 0
                r0.l = r1
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r1) {
                r0 = this;
                android.support.v7.widget.ActionBarOverlayLayout r0 = r0.f790a
                r1 = 0
                r0.x = r1
                r1 = 0
                r0.l = r1
                return
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.support.v7.widget.ActionBarOverlayLayout f791b;

        b(android.support.v7.widget.ActionBarOverlayLayout r1) {
                r0 = this;
                r0.f791b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                android.support.v7.widget.ActionBarOverlayLayout r0 = r3.f791b
                r0.h()
                android.support.v7.widget.ActionBarOverlayLayout r0 = r3.f791b
                android.support.v7.widget.ActionBarContainer r1 = r0.e
                android.view.ViewPropertyAnimator r1 = r1.animate()
                r2 = 0
                android.view.ViewPropertyAnimator r1 = r1.translationY(r2)
                android.support.v7.widget.ActionBarOverlayLayout r3 = r3.f791b
                android.animation.AnimatorListenerAdapter r3 = r3.y
                android.view.ViewPropertyAnimator r3 = r1.setListener(r3)
                r0.x = r3
                return
        }
    }

    class c implements java.lang.Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.support.v7.widget.ActionBarOverlayLayout f792b;

        c(android.support.v7.widget.ActionBarOverlayLayout r1) {
                r0 = this;
                r0.f792b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                android.support.v7.widget.ActionBarOverlayLayout r0 = r3.f792b
                r0.h()
                android.support.v7.widget.ActionBarOverlayLayout r0 = r3.f792b
                android.support.v7.widget.ActionBarContainer r1 = r0.e
                android.view.ViewPropertyAnimator r1 = r1.animate()
                android.support.v7.widget.ActionBarOverlayLayout r2 = r3.f792b
                android.support.v7.widget.ActionBarContainer r2 = r2.e
                int r2 = r2.getHeight()
                int r2 = -r2
                float r2 = (float) r2
                android.view.ViewPropertyAnimator r1 = r1.translationY(r2)
                android.support.v7.widget.ActionBarOverlayLayout r3 = r3.f792b
                android.animation.AnimatorListenerAdapter r3 = r3.y
                android.view.ViewPropertyAnimator r3 = r1.setListener(r3)
                r0.x = r3
                return
        }
    }

    public interface d {
        void a();

        void a(int r1);

        void a(boolean r1);

        void b();

        void c();

        void d();
    }

    public static class e extends android.view.ViewGroup.MarginLayoutParams {
        public e(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public e(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public e(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    static {
            r0 = 2
            int[] r0 = new int[r0]
            int r1 = b.b.d.a.a.actionBarSize
            r2 = 0
            r0[r2] = r1
            r1 = 1
            r2 = 16842841(0x1010059, float:2.3693807E-38)
            r0[r1] = r2
            android.support.v7.widget.ActionBarOverlayLayout.C = r0
            return
    }

    public ActionBarOverlayLayout(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ActionBarOverlayLayout(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r2 = 0
            r0.f789c = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.o = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.p = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.q = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.r = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.s = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.t = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.u = r2
            android.support.v7.widget.ActionBarOverlayLayout$a r2 = new android.support.v7.widget.ActionBarOverlayLayout$a
            r2.<init>(r0)
            r0.y = r2
            android.support.v7.widget.ActionBarOverlayLayout$b r2 = new android.support.v7.widget.ActionBarOverlayLayout$b
            r2.<init>(r0)
            r0.z = r2
            android.support.v7.widget.ActionBarOverlayLayout$c r2 = new android.support.v7.widget.ActionBarOverlayLayout$c
            r2.<init>(r0)
            r0.A = r2
            r0.a(r1)
            b.b.c.g.n r1 = new b.b.c.g.n
            r1.<init>(r0)
            r0.B = r1
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
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    private void a(android.content.Context r5) {
            r4 = this;
            android.content.Context r0 = r4.getContext()
            android.content.res.Resources$Theme r0 = r0.getTheme()
            int[] r1 = android.support.v7.widget.ActionBarOverlayLayout.C
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1)
            r1 = 0
            int r2 = r0.getDimensionPixelSize(r1, r1)
            r4.f788b = r2
            r2 = 1
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r2)
            r4.g = r3
            if (r3 != 0) goto L20
            r3 = r2
            goto L21
        L20:
            r3 = r1
        L21:
            r4.setWillNotDraw(r3)
            r0.recycle()
            android.content.pm.ApplicationInfo r0 = r5.getApplicationInfo()
            int r0 = r0.targetSdkVersion
            r3 = 19
            if (r0 >= r3) goto L32
            r1 = r2
        L32:
            r4.h = r1
            android.widget.OverScroller r0 = new android.widget.OverScroller
            r0.<init>(r5)
            r4.w = r0
            return
    }

    private boolean a(float r10, float r11) {
            r9 = this;
            android.widget.OverScroller r0 = r9.w
            int r4 = (int) r11
            r1 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = 2147483647(0x7fffffff, float:NaN)
            r0.fling(r1, r2, r3, r4, r5, r6, r7, r8)
            android.widget.OverScroller r10 = r9.w
            int r10 = r10.getFinalY()
            android.support.v7.widget.ActionBarContainer r9 = r9.e
            int r9 = r9.getHeight()
            if (r10 <= r9) goto L20
            r9 = 1
            goto L21
        L20:
            r9 = 0
        L21:
            return r9
    }

    private boolean a(android.view.View r2, android.graphics.Rect r3, boolean r4, boolean r5, boolean r6, boolean r7) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            android.support.v7.widget.ActionBarOverlayLayout$e r1 = (android.support.v7.widget.ActionBarOverlayLayout.e) r1
            r2 = 1
            if (r4 == 0) goto L13
            int r4 = r1.leftMargin
            int r0 = r3.left
            if (r4 == r0) goto L13
            r1.leftMargin = r0
            r4 = r2
            goto L14
        L13:
            r4 = 0
        L14:
            if (r5 == 0) goto L1f
            int r5 = r1.topMargin
            int r0 = r3.top
            if (r5 == r0) goto L1f
            r1.topMargin = r0
            r4 = r2
        L1f:
            if (r7 == 0) goto L2a
            int r5 = r1.rightMargin
            int r7 = r3.right
            if (r5 == r7) goto L2a
            r1.rightMargin = r7
            r4 = r2
        L2a:
            if (r6 == 0) goto L35
            int r5 = r1.bottomMargin
            int r3 = r3.bottom
            if (r5 == r3) goto L35
            r1.bottomMargin = r3
            goto L36
        L35:
            r2 = r4
        L36:
            return r2
    }

    private void k() {
            r0 = this;
            r0.h()
            java.lang.Runnable r0 = r0.A
            r0.run()
            return
    }

    private void l() {
            r3 = this;
            r3.h()
            java.lang.Runnable r0 = r3.A
            r1 = 600(0x258, double:2.964E-321)
            r3.postDelayed(r0, r1)
            return
    }

    private void m() {
            r3 = this;
            r3.h()
            java.lang.Runnable r0 = r3.z
            r1 = 600(0x258, double:2.964E-321)
            r3.postDelayed(r0, r1)
            return
    }

    private void n() {
            r0 = this;
            r0.h()
            java.lang.Runnable r0 = r0.z
            r0.run()
            return
    }

    @Override // android.support.v7.widget.a0
    public void a(int r2) {
            r1 = this;
            r1.j()
            r0 = 2
            if (r2 == r0) goto L19
            r0 = 5
            if (r2 == r0) goto L13
            r0 = 109(0x6d, float:1.53E-43)
            if (r2 == r0) goto Le
            goto L1e
        Le:
            r2 = 1
            r1.setOverlayMode(r2)
            goto L1e
        L13:
            android.support.v7.widget.b0 r1 = r1.f
            r1.l()
            goto L1e
        L19:
            android.support.v7.widget.b0 r1 = r1.f
            r1.i()
        L1e:
            return
    }

    @Override // android.support.v7.widget.a0
    public void a(android.view.Menu r1, android.support.v7.view.menu.o.a r2) {
            r0 = this;
            r0.j()
            android.support.v7.widget.b0 r0 = r0.f
            r0.a(r1, r2)
            return
    }

    @Override // android.support.v7.widget.a0
    public boolean a() {
            r0 = this;
            r0.j()
            android.support.v7.widget.b0 r0 = r0.f
            boolean r0 = r0.a()
            return r0
    }

    @Override // android.support.v7.widget.a0
    public boolean b() {
            r0 = this;
            r0.j()
            android.support.v7.widget.b0 r0 = r0.f
            boolean r0 = r0.b()
            return r0
    }

    @Override // android.support.v7.widget.a0
    public void c() {
            r0 = this;
            r0.j()
            android.support.v7.widget.b0 r0 = r0.f
            r0.c()
            return
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r0 = r1 instanceof android.support.v7.widget.ActionBarOverlayLayout.e
            return r0
    }

    @Override // android.support.v7.widget.a0
    public boolean d() {
            r0 = this;
            r0.j()
            android.support.v7.widget.b0 r0 = r0.f
            boolean r0 = r0.d()
            return r0
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas r6) {
            r5 = this;
            super.draw(r6)
            android.graphics.drawable.Drawable r0 = r5.g
            if (r0 == 0) goto L3d
            boolean r0 = r5.h
            if (r0 != 0) goto L3d
            android.support.v7.widget.ActionBarContainer r0 = r5.e
            int r0 = r0.getVisibility()
            r1 = 0
            if (r0 != 0) goto L27
            android.support.v7.widget.ActionBarContainer r0 = r5.e
            int r0 = r0.getBottom()
            float r0 = (float) r0
            android.support.v7.widget.ActionBarContainer r2 = r5.e
            float r2 = r2.getTranslationY()
            float r0 = r0 + r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r2
            int r0 = (int) r0
            goto L28
        L27:
            r0 = r1
        L28:
            android.graphics.drawable.Drawable r2 = r5.g
            int r3 = r5.getWidth()
            android.graphics.drawable.Drawable r4 = r5.g
            int r4 = r4.getIntrinsicHeight()
            int r4 = r4 + r0
            r2.setBounds(r1, r0, r3, r4)
            android.graphics.drawable.Drawable r5 = r5.g
            r5.draw(r6)
        L3d:
            return
    }

    @Override // android.support.v7.widget.a0
    public boolean e() {
            r0 = this;
            r0.j()
            android.support.v7.widget.b0 r0 = r0.f
            boolean r0 = r0.e()
            return r0
    }

    @Override // android.support.v7.widget.a0
    public boolean f() {
            r0 = this;
            r0.j()
            android.support.v7.widget.b0 r0 = r0.f
            boolean r0 = r0.f()
            return r0
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(android.graphics.Rect r9) {
            r8 = this;
            r8.j()
            int r0 = b.b.c.g.q.g(r8)
            r0 = r0 & 256(0x100, float:3.59E-43)
            android.support.v7.widget.ActionBarContainer r2 = r8.e
            r4 = 1
            r5 = 1
            r6 = 0
            r7 = 1
            r1 = r8
            r3 = r9
            boolean r0 = r1.a(r2, r3, r4, r5, r6, r7)
            android.graphics.Rect r1 = r8.r
            r1.set(r9)
            android.graphics.Rect r9 = r8.r
            android.graphics.Rect r1 = r8.o
            android.support.v7.widget.z0.a(r8, r9, r1)
            android.graphics.Rect r9 = r8.s
            android.graphics.Rect r1 = r8.r
            boolean r9 = r9.equals(r1)
            r1 = 1
            if (r9 != 0) goto L34
            android.graphics.Rect r9 = r8.s
            android.graphics.Rect r0 = r8.r
            r9.set(r0)
            r0 = r1
        L34:
            android.graphics.Rect r9 = r8.p
            android.graphics.Rect r2 = r8.o
            boolean r9 = r9.equals(r2)
            if (r9 != 0) goto L46
            android.graphics.Rect r9 = r8.p
            android.graphics.Rect r0 = r8.o
            r9.set(r0)
            r0 = r1
        L46:
            if (r0 == 0) goto L4b
            r8.requestLayout()
        L4b:
            return r1
    }

    @Override // android.support.v7.widget.a0
    public void g() {
            r0 = this;
            r0.j()
            android.support.v7.widget.b0 r0 = r0.f
            r0.g()
            return
    }

    @Override // android.view.ViewGroup
    protected android.support.v7.widget.ActionBarOverlayLayout.e generateDefaultLayoutParams() {
            r1 = this;
            android.support.v7.widget.ActionBarOverlayLayout$e r1 = new android.support.v7.widget.ActionBarOverlayLayout$e
            r0 = -1
            r1.<init>(r0, r0)
            return r1
    }

    @Override // android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r0 = this;
            android.support.v7.widget.ActionBarOverlayLayout$e r0 = r0.generateDefaultLayoutParams()
            return r0
    }

    @Override // android.view.ViewGroup
    public android.support.v7.widget.ActionBarOverlayLayout.e generateLayoutParams(android.util.AttributeSet r2) {
            r1 = this;
            android.support.v7.widget.ActionBarOverlayLayout$e r0 = new android.support.v7.widget.ActionBarOverlayLayout$e
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1, r2)
            return r0
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            android.support.v7.widget.ActionBarOverlayLayout$e r0 = r0.generateLayoutParams(r1)
            return r0
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            android.support.v7.widget.ActionBarOverlayLayout$e r0 = new android.support.v7.widget.ActionBarOverlayLayout$e
            r0.<init>(r1)
            return r0
    }

    public int getActionBarHideOffset() {
            r0 = this;
            android.support.v7.widget.ActionBarContainer r0 = r0.e
            if (r0 == 0) goto Lb
            float r0 = r0.getTranslationY()
            int r0 = (int) r0
            int r0 = -r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
            r0 = this;
            b.b.c.g.n r0 = r0.B
            int r0 = r0.a()
            return r0
    }

    public java.lang.CharSequence getTitle() {
            r0 = this;
            r0.j()
            android.support.v7.widget.b0 r0 = r0.f
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    void h() {
            r1 = this;
            java.lang.Runnable r0 = r1.z
            r1.removeCallbacks(r0)
            java.lang.Runnable r0 = r1.A
            r1.removeCallbacks(r0)
            android.view.ViewPropertyAnimator r1 = r1.x
            if (r1 == 0) goto L11
            r1.cancel()
        L11:
            return
    }

    public boolean i() {
            r0 = this;
            boolean r0 = r0.i
            return r0
    }

    void j() {
            r1 = this;
            android.support.v7.widget.ContentFrameLayout r0 = r1.d
            if (r0 != 0) goto L24
            int r0 = b.b.d.a.f.action_bar_activity_content
            android.view.View r0 = r1.findViewById(r0)
            android.support.v7.widget.ContentFrameLayout r0 = (android.support.v7.widget.ContentFrameLayout) r0
            r1.d = r0
            int r0 = b.b.d.a.f.action_bar_container
            android.view.View r0 = r1.findViewById(r0)
            android.support.v7.widget.ActionBarContainer r0 = (android.support.v7.widget.ActionBarContainer) r0
            r1.e = r0
            int r0 = b.b.d.a.f.action_bar
            android.view.View r0 = r1.findViewById(r0)
            android.support.v7.widget.b0 r0 = r1.a(r0)
            r1.f = r0
        L24:
            return
    }

    @Override // android.view.View
    protected void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            super.onConfigurationChanged(r1)
            android.content.Context r1 = r0.getContext()
            r0.a(r1)
            b.b.c.g.q.m(r0)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r0 = this;
            super.onDetachedFromWindow()
            r0.h()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
            r4 = this;
            int r5 = r4.getChildCount()
            int r6 = r4.getPaddingLeft()
            r4.getPaddingRight()
            int r7 = r4.getPaddingTop()
            r4.getPaddingBottom()
            r8 = 0
        L13:
            if (r8 >= r5) goto L3d
            android.view.View r9 = r4.getChildAt(r8)
            int r0 = r9.getVisibility()
            r1 = 8
            if (r0 == r1) goto L3a
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            android.support.v7.widget.ActionBarOverlayLayout$e r0 = (android.support.v7.widget.ActionBarOverlayLayout.e) r0
            int r1 = r9.getMeasuredWidth()
            int r2 = r9.getMeasuredHeight()
            int r3 = r0.leftMargin
            int r3 = r3 + r6
            int r0 = r0.topMargin
            int r0 = r0 + r7
            int r1 = r1 + r3
            int r2 = r2 + r0
            r9.layout(r3, r0, r1, r2)
        L3a:
            int r8 = r8 + 1
            goto L13
        L3d:
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r14, int r15) {
            r13 = this;
            r13.j()
            android.support.v7.widget.ActionBarContainer r1 = r13.e
            r3 = 0
            r5 = 0
            r0 = r13
            r2 = r14
            r4 = r15
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            android.support.v7.widget.ActionBarContainer r0 = r13.e
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.support.v7.widget.ActionBarOverlayLayout$e r0 = (android.support.v7.widget.ActionBarOverlayLayout.e) r0
            android.support.v7.widget.ActionBarContainer r1 = r13.e
            int r1 = r1.getMeasuredWidth()
            int r2 = r0.leftMargin
            int r1 = r1 + r2
            int r2 = r0.rightMargin
            int r1 = r1 + r2
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
            android.support.v7.widget.ActionBarContainer r3 = r13.e
            int r3 = r3.getMeasuredHeight()
            int r4 = r0.topMargin
            int r3 = r3 + r4
            int r0 = r0.bottomMargin
            int r3 = r3 + r0
            int r0 = java.lang.Math.max(r2, r3)
            android.support.v7.widget.ActionBarContainer r3 = r13.e
            int r3 = r3.getMeasuredState()
            int r3 = android.view.View.combineMeasuredStates(r2, r3)
            int r4 = b.b.c.g.q.g(r13)
            r4 = r4 & 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L4a
            r4 = 1
            goto L4b
        L4a:
            r4 = r2
        L4b:
            if (r4 == 0) goto L5f
            int r5 = r13.f788b
            boolean r6 = r13.j
            if (r6 == 0) goto L71
            android.support.v7.widget.ActionBarContainer r6 = r13.e
            android.view.View r6 = r6.getTabContainer()
            if (r6 == 0) goto L71
            int r6 = r13.f788b
            int r5 = r5 + r6
            goto L71
        L5f:
            android.support.v7.widget.ActionBarContainer r5 = r13.e
            int r5 = r5.getVisibility()
            r6 = 8
            if (r5 == r6) goto L70
            android.support.v7.widget.ActionBarContainer r5 = r13.e
            int r5 = r5.getMeasuredHeight()
            goto L71
        L70:
            r5 = r2
        L71:
            android.graphics.Rect r6 = r13.q
            android.graphics.Rect r7 = r13.o
            r6.set(r7)
            android.graphics.Rect r6 = r13.t
            android.graphics.Rect r7 = r13.r
            r6.set(r7)
            boolean r6 = r13.i
            if (r6 != 0) goto L88
            if (r4 != 0) goto L88
            android.graphics.Rect r4 = r13.q
            goto L8a
        L88:
            android.graphics.Rect r4 = r13.t
        L8a:
            int r6 = r4.top
            int r6 = r6 + r5
            r4.top = r6
            int r5 = r4.bottom
            int r5 = r5 + r2
            r4.bottom = r5
            android.support.v7.widget.ContentFrameLayout r7 = r13.d
            android.graphics.Rect r8 = r13.q
            r9 = 1
            r10 = 1
            r11 = 1
            r12 = 1
            r6 = r13
            r6.a(r7, r8, r9, r10, r11, r12)
            android.graphics.Rect r2 = r13.u
            android.graphics.Rect r4 = r13.t
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto Lb8
            android.graphics.Rect r2 = r13.u
            android.graphics.Rect r4 = r13.t
            r2.set(r4)
            android.support.v7.widget.ContentFrameLayout r2 = r13.d
            android.graphics.Rect r4 = r13.t
            r2.a(r4)
        Lb8:
            android.support.v7.widget.ContentFrameLayout r6 = r13.d
            r8 = 0
            r10 = 0
            r5 = r13
            r7 = r14
            r9 = r15
            r5.measureChildWithMargins(r6, r7, r8, r9, r10)
            android.support.v7.widget.ContentFrameLayout r2 = r13.d
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.support.v7.widget.ActionBarOverlayLayout$e r2 = (android.support.v7.widget.ActionBarOverlayLayout.e) r2
            android.support.v7.widget.ContentFrameLayout r4 = r13.d
            int r4 = r4.getMeasuredWidth()
            int r5 = r2.leftMargin
            int r4 = r4 + r5
            int r5 = r2.rightMargin
            int r4 = r4 + r5
            int r1 = java.lang.Math.max(r1, r4)
            android.support.v7.widget.ContentFrameLayout r4 = r13.d
            int r4 = r4.getMeasuredHeight()
            int r5 = r2.topMargin
            int r4 = r4 + r5
            int r2 = r2.bottomMargin
            int r4 = r4 + r2
            int r0 = java.lang.Math.max(r0, r4)
            android.support.v7.widget.ContentFrameLayout r2 = r13.d
            int r2 = r2.getMeasuredState()
            int r2 = android.view.View.combineMeasuredStates(r3, r2)
            int r3 = r13.getPaddingLeft()
            int r4 = r13.getPaddingRight()
            int r3 = r3 + r4
            int r1 = r1 + r3
            int r3 = r13.getPaddingTop()
            int r4 = r13.getPaddingBottom()
            int r3 = r3 + r4
            int r0 = r0 + r3
            int r3 = r13.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r0, r3)
            int r3 = r13.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r1, r3)
            int r14 = android.view.View.resolveSizeAndState(r1, r14, r2)
            int r1 = r2 << 16
            int r15 = android.view.View.resolveSizeAndState(r0, r15, r1)
            r13.setMeasuredDimension(r14, r15)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.b.c.g.m
    public boolean onNestedFling(android.view.View r1, float r2, float r3, boolean r4) {
            r0 = this;
            boolean r1 = r0.k
            if (r1 == 0) goto L18
            if (r4 != 0) goto L7
            goto L18
        L7:
            boolean r1 = r0.a(r2, r3)
            if (r1 == 0) goto L11
            r0.k()
            goto L14
        L11:
            r0.n()
        L14:
            r1 = 1
            r0.l = r1
            return r1
        L18:
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.b.c.g.m
    public boolean onNestedPreFling(android.view.View r1, float r2, float r3) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.b.c.g.m
    public void onNestedPreScroll(android.view.View r1, int r2, int r3, int[] r4) {
            r0 = this;
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.b.c.g.m
    public void onNestedScroll(android.view.View r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            int r1 = r0.m
            int r1 = r1 + r3
            r0.m = r1
            r0.setActionBarHideOffset(r1)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.b.c.g.m
    public void onNestedScrollAccepted(android.view.View r2, android.view.View r3, int r4) {
            r1 = this;
            b.b.c.g.n r0 = r1.B
            r0.a(r2, r3, r4)
            int r2 = r1.getActionBarHideOffset()
            r1.m = r2
            r1.h()
            android.support.v7.widget.ActionBarOverlayLayout$d r1 = r1.v
            if (r1 == 0) goto L15
            r1.a()
        L15:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.b.c.g.m
    public boolean onStartNestedScroll(android.view.View r1, android.view.View r2, int r3) {
            r0 = this;
            r1 = r3 & 2
            if (r1 == 0) goto L10
            android.support.v7.widget.ActionBarContainer r1 = r0.e
            int r1 = r1.getVisibility()
            if (r1 == 0) goto Ld
            goto L10
        Ld:
            boolean r0 = r0.k
            return r0
        L10:
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.b.c.g.m
    public void onStopNestedScroll(android.view.View r2) {
            r1 = this;
            boolean r2 = r1.k
            if (r2 == 0) goto L19
            boolean r2 = r1.l
            if (r2 != 0) goto L19
            int r2 = r1.m
            android.support.v7.widget.ActionBarContainer r0 = r1.e
            int r0 = r0.getHeight()
            if (r2 > r0) goto L16
            r1.m()
            goto L19
        L16:
            r1.l()
        L19:
            android.support.v7.widget.ActionBarOverlayLayout$d r1 = r1.v
            if (r1 == 0) goto L20
            r1.d()
        L20:
            return
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int r5) {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L9
            super.onWindowSystemUiVisibilityChanged(r5)
        L9:
            r4.j()
            int r0 = r4.n
            r0 = r0 ^ r5
            r4.n = r5
            r1 = r5 & 4
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L19
            r1 = r3
            goto L1a
        L19:
            r1 = r2
        L1a:
            r5 = r5 & 256(0x100, float:3.59E-43)
            if (r5 == 0) goto L1f
            r2 = r3
        L1f:
            android.support.v7.widget.ActionBarOverlayLayout$d r5 = r4.v
            if (r5 == 0) goto L38
            r3 = r2 ^ 1
            r5.a(r3)
            if (r1 != 0) goto L33
            if (r2 != 0) goto L2d
            goto L33
        L2d:
            android.support.v7.widget.ActionBarOverlayLayout$d r5 = r4.v
            r5.b()
            goto L38
        L33:
            android.support.v7.widget.ActionBarOverlayLayout$d r5 = r4.v
            r5.c()
        L38:
            r5 = r0 & 256(0x100, float:3.59E-43)
            if (r5 == 0) goto L43
            android.support.v7.widget.ActionBarOverlayLayout$d r5 = r4.v
            if (r5 == 0) goto L43
            b.b.c.g.q.m(r4)
        L43:
            return
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int r1) {
            r0 = this;
            super.onWindowVisibilityChanged(r1)
            r0.f789c = r1
            android.support.v7.widget.ActionBarOverlayLayout$d r0 = r0.v
            if (r0 == 0) goto Lc
            r0.a(r1)
        Lc:
            return
    }

    public void setActionBarHideOffset(int r2) {
            r1 = this;
            r1.h()
            android.support.v7.widget.ActionBarContainer r0 = r1.e
            int r0 = r0.getHeight()
            int r2 = java.lang.Math.min(r2, r0)
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            android.support.v7.widget.ActionBarContainer r1 = r1.e
            int r2 = -r2
            float r2 = (float) r2
            r1.setTranslationY(r2)
            return
    }

    public void setActionBarVisibilityCallback(android.support.v7.widget.ActionBarOverlayLayout.d r2) {
            r1 = this;
            r1.v = r2
            android.os.IBinder r2 = r1.getWindowToken()
            if (r2 == 0) goto L19
            android.support.v7.widget.ActionBarOverlayLayout$d r2 = r1.v
            int r0 = r1.f789c
            r2.a(r0)
            int r2 = r1.n
            if (r2 == 0) goto L19
            r1.onWindowSystemUiVisibilityChanged(r2)
            b.b.c.g.q.m(r1)
        L19:
            return
    }

    public void setHasNonEmbeddedTabs(boolean r1) {
            r0 = this;
            r0.j = r1
            return
    }

    public void setHideOnContentScrollEnabled(boolean r2) {
            r1 = this;
            boolean r0 = r1.k
            if (r2 == r0) goto Lf
            r1.k = r2
            if (r2 != 0) goto Lf
            r1.h()
            r2 = 0
            r1.setActionBarHideOffset(r2)
        Lf:
            return
    }

    public void setIcon(int r1) {
            r0 = this;
            r0.j()
            android.support.v7.widget.b0 r0 = r0.f
            r0.setIcon(r1)
            return
    }

    public void setIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.j()
            android.support.v7.widget.b0 r0 = r0.f
            r0.setIcon(r1)
            return
    }

    public void setLogo(int r1) {
            r0 = this;
            r0.j()
            android.support.v7.widget.b0 r0 = r0.f
            r0.b(r1)
            return
    }

    public void setOverlayMode(boolean r2) {
            r1 = this;
            r1.i = r2
            if (r2 == 0) goto L14
            android.content.Context r2 = r1.getContext()
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()
            int r2 = r2.targetSdkVersion
            r0 = 19
            if (r2 >= r0) goto L14
            r2 = 1
            goto L15
        L14:
            r2 = 0
        L15:
            r1.h = r2
            return
    }

    public void setShowingForActionMode(boolean r1) {
            r0 = this;
            return
    }

    public void setUiOptions(int r1) {
            r0 = this;
            return
    }

    @Override // android.support.v7.widget.a0
    public void setWindowCallback(android.view.Window.Callback r1) {
            r0 = this;
            r0.j()
            android.support.v7.widget.b0 r0 = r0.f
            r0.setWindowCallback(r1)
            return
    }

    @Override // android.support.v7.widget.a0
    public void setWindowTitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.j()
            android.support.v7.widget.b0 r0 = r0.f
            r0.setWindowTitle(r1)
            return
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
            r0 = this;
            r0 = 0
            return r0
    }
}
