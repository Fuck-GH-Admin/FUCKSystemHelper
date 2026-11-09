package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
abstract class a extends android.view.ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final android.support.v7.widget.a.C0032a f829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final android.content.Context f830c;
    protected android.support.v7.widget.ActionMenuView d;
    protected android.support.v7.widget.c e;
    protected int f;
    protected b.b.c.g.u g;
    private boolean h;
    private boolean i;

    /* JADX INFO: renamed from: android.support.v7.widget.a$a, reason: collision with other inner class name */
    protected class C0032a implements b.b.c.g.v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f831a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f832b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.support.v7.widget.a f833c;

        protected C0032a(android.support.v7.widget.a r1) {
                r0 = this;
                r0.f833c = r1
                r0.<init>()
                r1 = 0
                r0.f831a = r1
                return
        }

        public android.support.v7.widget.a.C0032a a(b.b.c.g.u r2, int r3) {
                r1 = this;
                android.support.v7.widget.a r0 = r1.f833c
                r0.g = r2
                r1.f832b = r3
                return r1
        }

        @Override // b.b.c.g.v
        public void a(android.view.View r2) {
                r1 = this;
                boolean r2 = r1.f831a
                if (r2 == 0) goto L5
                return
            L5:
                android.support.v7.widget.a r2 = r1.f833c
                r0 = 0
                r2.g = r0
                int r1 = r1.f832b
                android.support.v7.widget.a.b(r2, r1)
                return
        }

        @Override // b.b.c.g.v
        public void b(android.view.View r2) {
                r1 = this;
                android.support.v7.widget.a r2 = r1.f833c
                r0 = 0
                android.support.v7.widget.a.a(r2, r0)
                r1.f831a = r0
                return
        }

        @Override // b.b.c.g.v
        public void c(android.view.View r1) {
                r0 = this;
                r1 = 1
                r0.f831a = r1
                return
        }
    }

    a(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    a(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    a(android.content.Context r3, android.util.AttributeSet r4, int r5) {
            r2 = this;
            r2.<init>(r3, r4, r5)
            android.support.v7.widget.a$a r4 = new android.support.v7.widget.a$a
            r4.<init>(r2)
            r2.f829b = r4
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            android.content.res.Resources$Theme r5 = r3.getTheme()
            int r0 = b.b.d.a.a.actionBarPopupTheme
            r1 = 1
            boolean r5 = r5.resolveAttribute(r0, r4, r1)
            if (r5 == 0) goto L2a
            int r5 = r4.resourceId
            if (r5 == 0) goto L2a
            android.view.ContextThemeWrapper r5 = new android.view.ContextThemeWrapper
            int r4 = r4.resourceId
            r5.<init>(r3, r4)
            r2.f830c = r5
            goto L2c
        L2a:
            r2.f830c = r3
        L2c:
            return
    }

    protected static int a(int r0, int r1, boolean r2) {
            if (r2 == 0) goto L4
            int r0 = r0 - r1
            goto L5
        L4:
            int r0 = r0 + r1
        L5:
            return r0
    }

    static /* synthetic */ void a(android.support.v7.widget.a r0, int r1) {
            super.setVisibility(r1)
            return
    }

    static /* synthetic */ void b(android.support.v7.widget.a r0, int r1) {
            super.setVisibility(r1)
            return
    }

    protected int a(android.view.View r1, int r2, int r3, int r4) {
            r0 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r1.measure(r0, r3)
            int r0 = r1.getMeasuredWidth()
            int r2 = r2 - r0
            int r2 = r2 - r4
            r0 = 0
            int r0 = java.lang.Math.max(r0, r2)
            return r0
    }

    protected int a(android.view.View r2, int r3, int r4, int r5, boolean r6) {
            r1 = this;
            int r1 = r2.getMeasuredWidth()
            int r0 = r2.getMeasuredHeight()
            int r5 = r5 - r0
            int r5 = r5 / 2
            int r4 = r4 + r5
            if (r6 == 0) goto L15
            int r5 = r3 - r1
            int r0 = r0 + r4
            r2.layout(r5, r4, r3, r0)
            goto L1b
        L15:
            int r5 = r3 + r1
            int r0 = r0 + r4
            r2.layout(r3, r4, r5, r0)
        L1b:
            if (r6 == 0) goto L1e
            int r1 = -r1
        L1e:
            return r1
    }

    public b.b.c.g.u a(int r3, long r4) {
            r2 = this;
            b.b.c.g.u r0 = r2.g
            if (r0 == 0) goto L7
            r0.a()
        L7:
            r0 = 0
            if (r3 != 0) goto L28
            int r1 = r2.getVisibility()
            if (r1 == 0) goto L13
            r2.setAlpha(r0)
        L13:
            b.b.c.g.u r0 = b.b.c.g.q.a(r2)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.a(r1)
            r0.a(r4)
            android.support.v7.widget.a$a r2 = r2.f829b
            r2.a(r0, r3)
            r0.a(r2)
            return r0
        L28:
            b.b.c.g.u r1 = b.b.c.g.q.a(r2)
            r1.a(r0)
            r1.a(r4)
            android.support.v7.widget.a$a r2 = r2.f829b
            r2.a(r1, r3)
            r1.a(r2)
            return r1
    }

    public int getAnimatedVisibility() {
            r1 = this;
            b.b.c.g.u r0 = r1.g
            if (r0 == 0) goto L9
            android.support.v7.widget.a$a r1 = r1.f829b
            int r1 = r1.f832b
            return r1
        L9:
            int r1 = r1.getVisibility()
            return r1
    }

    public int getContentHeight() {
            r0 = this;
            int r0 = r0.f
            return r0
    }

    @Override // android.view.View
    protected void onConfigurationChanged(android.content.res.Configuration r6) {
            r5 = this;
            super.onConfigurationChanged(r6)
            android.content.Context r0 = r5.getContext()
            int[] r1 = b.b.d.a.j.ActionBar
            int r2 = b.b.d.a.a.actionBarStyle
            r3 = 0
            r4 = 0
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r4, r1, r2, r3)
            int r1 = b.b.d.a.j.ActionBar_height
            int r1 = r0.getLayoutDimension(r1, r3)
            r5.setContentHeight(r1)
            r0.recycle()
            android.support.v7.widget.c r5 = r5.e
            if (r5 == 0) goto L24
            r5.a(r6)
        L24:
            return
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent r6) {
            r5 = this;
            int r0 = r6.getActionMasked()
            r1 = 0
            r2 = 9
            if (r0 != r2) goto Lb
            r5.i = r1
        Lb:
            boolean r3 = r5.i
            r4 = 1
            if (r3 != 0) goto L1a
            boolean r6 = super.onHoverEvent(r6)
            if (r0 != r2) goto L1a
            if (r6 != 0) goto L1a
            r5.i = r4
        L1a:
            r6 = 10
            if (r0 == r6) goto L21
            r6 = 3
            if (r0 != r6) goto L23
        L21:
            r5.i = r1
        L23:
            return r4
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r5) {
            r4 = this;
            int r0 = r5.getActionMasked()
            r1 = 0
            if (r0 != 0) goto L9
            r4.h = r1
        L9:
            boolean r2 = r4.h
            r3 = 1
            if (r2 != 0) goto L18
            boolean r5 = super.onTouchEvent(r5)
            if (r0 != 0) goto L18
            if (r5 != 0) goto L18
            r4.h = r3
        L18:
            if (r0 == r3) goto L1d
            r5 = 3
            if (r0 != r5) goto L1f
        L1d:
            r4.h = r1
        L1f:
            return r3
    }

    public abstract void setContentHeight(int r1);

    @Override // android.view.View
    public void setVisibility(int r2) {
            r1 = this;
            int r0 = r1.getVisibility()
            if (r2 == r0) goto L10
            b.b.c.g.u r0 = r1.g
            if (r0 == 0) goto Ld
            r0.a()
        Ld:
            super.setVisibility(r2)
        L10:
            return
    }
}
