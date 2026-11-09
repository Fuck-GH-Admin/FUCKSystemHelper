package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
class c extends android.support.v7.view.menu.b implements b.b.c.g.c.a {
    android.support.v7.widget.c.RunnableC0033c A;
    private android.support.v7.widget.c.b B;
    final android.support.v7.widget.c.f C;
    int D;
    android.support.v7.widget.c.d j;
    private android.graphics.drawable.Drawable k;
    private boolean l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private int v;
    private final android.util.SparseBooleanArray w;
    private android.view.View x;
    android.support.v7.widget.c.e y;
    android.support.v7.widget.c.a z;

    private class a extends android.support.v7.view.menu.n {
        final /* synthetic */ android.support.v7.widget.c m;

        public a(android.support.v7.widget.c r7, android.content.Context r8, android.support.v7.view.menu.u r9, android.view.View r10) {
                r6 = this;
                r6.m = r7
                int r5 = b.b.d.a.a.actionOverflowMenuStyle
                r4 = 0
                r0 = r6
                r1 = r8
                r2 = r9
                r3 = r10
                r0.<init>(r1, r2, r3, r4, r5)
                android.view.MenuItem r8 = r9.getItem()
                android.support.v7.view.menu.j r8 = (android.support.v7.view.menu.j) r8
                boolean r8 = r8.h()
                if (r8 != 0) goto L25
                android.support.v7.widget.c$d r8 = r7.j
                if (r8 != 0) goto L22
                android.support.v7.view.menu.p r8 = android.support.v7.widget.c.c(r7)
                android.view.View r8 = (android.view.View) r8
            L22:
                r6.a(r8)
            L25:
                android.support.v7.widget.c$f r7 = r7.C
                r6.a(r7)
                return
        }

        @Override // android.support.v7.view.menu.n
        protected void d() {
                r2 = this;
                android.support.v7.widget.c r0 = r2.m
                r1 = 0
                r0.z = r1
                r1 = 0
                r0.D = r1
                super.d()
                return
        }
    }

    private class b extends android.support.v7.view.menu.ActionMenuItemView.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.support.v7.widget.c f835a;

        b(android.support.v7.widget.c r1) {
                r0 = this;
                r0.f835a = r1
                r0.<init>()
                return
        }

        @Override // android.support.v7.view.menu.ActionMenuItemView.b
        public android.support.v7.view.menu.s a() {
                r0 = this;
                android.support.v7.widget.c r0 = r0.f835a
                android.support.v7.widget.c$a r0 = r0.z
                if (r0 == 0) goto Lb
                android.support.v7.view.menu.m r0 = r0.b()
                goto Lc
            Lb:
                r0 = 0
            Lc:
                return r0
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.c$c, reason: collision with other inner class name */
    private class RunnableC0033c implements java.lang.Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private android.support.v7.widget.c.e f836b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.support.v7.widget.c f837c;

        public RunnableC0033c(android.support.v7.widget.c r1, android.support.v7.widget.c.e r2) {
                r0 = this;
                r0.f837c = r1
                r0.<init>()
                r0.f836b = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                android.support.v7.widget.c r0 = r2.f837c
                android.support.v7.view.menu.h r0 = android.support.v7.widget.c.d(r0)
                if (r0 == 0) goto L11
                android.support.v7.widget.c r0 = r2.f837c
                android.support.v7.view.menu.h r0 = android.support.v7.widget.c.e(r0)
                r0.a()
            L11:
                android.support.v7.widget.c r0 = r2.f837c
                android.support.v7.view.menu.p r0 = android.support.v7.widget.c.f(r0)
                android.view.View r0 = (android.view.View) r0
                if (r0 == 0) goto L2f
                android.os.IBinder r0 = r0.getWindowToken()
                if (r0 == 0) goto L2f
                android.support.v7.widget.c$e r0 = r2.f836b
                boolean r0 = r0.f()
                if (r0 == 0) goto L2f
                android.support.v7.widget.c r0 = r2.f837c
                android.support.v7.widget.c$e r1 = r2.f836b
                r0.y = r1
            L2f:
                android.support.v7.widget.c r2 = r2.f837c
                r0 = 0
                r2.A = r0
                return
        }
    }

    private class d extends android.support.v7.widget.o implements android.support.v7.widget.ActionMenuView.a {
        final /* synthetic */ android.support.v7.widget.c d;

        class a extends android.support.v7.widget.f0 {
            final /* synthetic */ android.support.v7.widget.c.d k;

            a(android.support.v7.widget.c.d r1, android.view.View r2, android.support.v7.widget.c r3) {
                    r0 = this;
                    r0.k = r1
                    r0.<init>(r2)
                    return
            }

            @Override // android.support.v7.widget.f0
            public android.support.v7.view.menu.s a() {
                    r0 = this;
                    android.support.v7.widget.c$d r0 = r0.k
                    android.support.v7.widget.c r0 = r0.d
                    android.support.v7.widget.c$e r0 = r0.y
                    if (r0 != 0) goto La
                    r0 = 0
                    return r0
                La:
                    android.support.v7.view.menu.m r0 = r0.b()
                    return r0
            }

            @Override // android.support.v7.widget.f0
            public boolean b() {
                    r0 = this;
                    android.support.v7.widget.c$d r0 = r0.k
                    android.support.v7.widget.c r0 = r0.d
                    r0.i()
                    r0 = 1
                    return r0
            }

            @Override // android.support.v7.widget.f0
            public boolean c() {
                    r1 = this;
                    android.support.v7.widget.c$d r1 = r1.k
                    android.support.v7.widget.c r1 = r1.d
                    android.support.v7.widget.c$c r0 = r1.A
                    if (r0 == 0) goto La
                    r1 = 0
                    return r1
                La:
                    r1.e()
                    r1 = 1
                    return r1
            }
        }

        public d(android.support.v7.widget.c r3, android.content.Context r4) {
                r2 = this;
                r2.d = r3
                int r0 = b.b.d.a.a.actionOverflowButtonStyle
                r1 = 0
                r2.<init>(r4, r1, r0)
                r4 = 1
                r2.setClickable(r4)
                r2.setFocusable(r4)
                r0 = 0
                r2.setVisibility(r0)
                r2.setEnabled(r4)
                java.lang.CharSequence r4 = r2.getContentDescription()
                android.support.v7.widget.v0.a(r2, r4)
                android.support.v7.widget.c$d$a r4 = new android.support.v7.widget.c$d$a
                r4.<init>(r2, r2, r3)
                r2.setOnTouchListener(r4)
                return
        }

        @Override // android.support.v7.widget.ActionMenuView.a
        public boolean a() {
                r0 = this;
                r0 = 0
                return r0
        }

        @Override // android.support.v7.widget.ActionMenuView.a
        public boolean b() {
                r0 = this;
                r0 = 0
                return r0
        }

        @Override // android.view.View
        public boolean performClick() {
                r2 = this;
                boolean r0 = super.performClick()
                r1 = 1
                if (r0 == 0) goto L8
                return r1
            L8:
                r0 = 0
                r2.playSoundEffect(r0)
                android.support.v7.widget.c r2 = r2.d
                r2.i()
                return r1
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int r4, int r5, int r6, int r7) {
                r3 = this;
                boolean r4 = super.setFrame(r4, r5, r6, r7)
                android.graphics.drawable.Drawable r5 = r3.getDrawable()
                android.graphics.drawable.Drawable r6 = r3.getBackground()
                if (r5 == 0) goto L3f
                if (r6 == 0) goto L3f
                int r5 = r3.getWidth()
                int r7 = r3.getHeight()
                int r0 = java.lang.Math.max(r5, r7)
                int r0 = r0 / 2
                int r1 = r3.getPaddingLeft()
                int r2 = r3.getPaddingRight()
                int r1 = r1 - r2
                int r2 = r3.getPaddingTop()
                int r3 = r3.getPaddingBottom()
                int r2 = r2 - r3
                int r5 = r5 + r1
                int r5 = r5 / 2
                int r7 = r7 + r2
                int r7 = r7 / 2
                int r3 = r5 - r0
                int r1 = r7 - r0
                int r5 = r5 + r0
                int r7 = r7 + r0
                android.support.v4.graphics.drawable.a.a(r6, r3, r1, r5, r7)
            L3f:
                return r4
        }
    }

    private class e extends android.support.v7.view.menu.n {
        final /* synthetic */ android.support.v7.widget.c m;

        public e(android.support.v7.widget.c r7, android.content.Context r8, android.support.v7.view.menu.h r9, android.view.View r10, boolean r11) {
                r6 = this;
                r6.m = r7
                int r5 = b.b.d.a.a.actionOverflowMenuStyle
                r0 = r6
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r11
                r0.<init>(r1, r2, r3, r4, r5)
                r8 = 8388613(0x800005, float:1.175495E-38)
                r6.a(r8)
                android.support.v7.widget.c$f r7 = r7.C
                r6.a(r7)
                return
        }

        @Override // android.support.v7.view.menu.n
        protected void d() {
                r2 = this;
                android.support.v7.widget.c r0 = r2.m
                android.support.v7.view.menu.h r0 = android.support.v7.widget.c.a(r0)
                if (r0 == 0) goto L11
                android.support.v7.widget.c r0 = r2.m
                android.support.v7.view.menu.h r0 = android.support.v7.widget.c.b(r0)
                r0.close()
            L11:
                android.support.v7.widget.c r0 = r2.m
                r1 = 0
                r0.y = r1
                super.d()
                return
        }
    }

    private class f implements android.support.v7.view.menu.o.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.support.v7.widget.c f838b;

        f(android.support.v7.widget.c r1) {
                r0 = this;
                r0.f838b = r1
                r0.<init>()
                return
        }

        @Override // android.support.v7.view.menu.o.a
        public void a(android.support.v7.view.menu.h r3, boolean r4) {
                r2 = this;
                boolean r0 = r3 instanceof android.support.v7.view.menu.u
                if (r0 == 0) goto Lc
                android.support.v7.view.menu.h r0 = r3.m()
                r1 = 0
                r0.a(r1)
            Lc:
                android.support.v7.widget.c r2 = r2.f838b
                android.support.v7.view.menu.o$a r2 = r2.a()
                if (r2 == 0) goto L17
                r2.a(r3, r4)
            L17:
                return
        }

        @Override // android.support.v7.view.menu.o.a
        public boolean a(android.support.v7.view.menu.h r4) {
                r3 = this;
                r0 = 0
                if (r4 != 0) goto L4
                return r0
            L4:
                android.support.v7.widget.c r1 = r3.f838b
                r2 = r4
                android.support.v7.view.menu.u r2 = (android.support.v7.view.menu.u) r2
                android.view.MenuItem r2 = r2.getItem()
                int r2 = r2.getItemId()
                r1.D = r2
                android.support.v7.widget.c r3 = r3.f838b
                android.support.v7.view.menu.o$a r3 = r3.a()
                if (r3 == 0) goto L1f
                boolean r0 = r3.a(r4)
            L1f:
                return r0
        }
    }

    public c(android.content.Context r3) {
            r2 = this;
            int r0 = b.b.d.a.g.abc_action_menu_layout
            int r1 = b.b.d.a.g.abc_action_menu_item_layout
            r2.<init>(r3, r0, r1)
            android.util.SparseBooleanArray r3 = new android.util.SparseBooleanArray
            r3.<init>()
            r2.w = r3
            android.support.v7.widget.c$f r3 = new android.support.v7.widget.c$f
            r3.<init>(r2)
            r2.C = r3
            return
    }

    static /* synthetic */ android.support.v7.view.menu.h a(android.support.v7.widget.c r0) {
            android.support.v7.view.menu.h r0 = r0.d
            return r0
    }

    private android.view.View a(android.view.MenuItem r6) {
            r5 = this;
            android.support.v7.view.menu.p r5 = r5.i
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r0 = 0
            if (r5 != 0) goto L8
            return r0
        L8:
            int r1 = r5.getChildCount()
            r2 = 0
        Ld:
            if (r2 >= r1) goto L24
            android.view.View r3 = r5.getChildAt(r2)
            boolean r4 = r3 instanceof android.support.v7.view.menu.p.a
            if (r4 == 0) goto L21
            r4 = r3
            android.support.v7.view.menu.p$a r4 = (android.support.v7.view.menu.p.a) r4
            android.support.v7.view.menu.j r4 = r4.getItemData()
            if (r4 != r6) goto L21
            return r3
        L21:
            int r2 = r2 + 1
            goto Ld
        L24:
            return r0
    }

    static /* synthetic */ android.support.v7.view.menu.h b(android.support.v7.widget.c r0) {
            android.support.v7.view.menu.h r0 = r0.d
            return r0
    }

    static /* synthetic */ android.support.v7.view.menu.p c(android.support.v7.widget.c r0) {
            android.support.v7.view.menu.p r0 = r0.i
            return r0
    }

    static /* synthetic */ android.support.v7.view.menu.h d(android.support.v7.widget.c r0) {
            android.support.v7.view.menu.h r0 = r0.d
            return r0
    }

    static /* synthetic */ android.support.v7.view.menu.h e(android.support.v7.widget.c r0) {
            android.support.v7.view.menu.h r0 = r0.d
            return r0
    }

    static /* synthetic */ android.support.v7.view.menu.p f(android.support.v7.widget.c r0) {
            android.support.v7.view.menu.p r0 = r0.i
            return r0
    }

    @Override // android.support.v7.view.menu.b
    public android.view.View a(android.support.v7.view.menu.j r3, android.view.View r4, android.view.ViewGroup r5) {
            r2 = this;
            android.view.View r0 = r3.getActionView()
            if (r0 == 0) goto Lc
            boolean r1 = r3.f()
            if (r1 == 0) goto L10
        Lc:
            android.view.View r0 = super.a(r3, r4, r5)
        L10:
            boolean r2 = r3.isActionViewExpanded()
            if (r2 == 0) goto L19
            r2 = 8
            goto L1a
        L19:
            r2 = 0
        L1a:
            r0.setVisibility(r2)
            android.support.v7.widget.ActionMenuView r5 = (android.support.v7.widget.ActionMenuView) r5
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            boolean r3 = r5.checkLayoutParams(r2)
            if (r3 != 0) goto L30
            android.support.v7.widget.ActionMenuView$c r2 = r5.generateLayoutParams(r2)
            r0.setLayoutParams(r2)
        L30:
            return r0
    }

    @Override // android.support.v7.view.menu.b, android.support.v7.view.menu.o
    public void a(android.content.Context r5, android.support.v7.view.menu.h r6) {
            r4 = this;
            super.a(r5, r6)
            android.content.res.Resources r6 = r5.getResources()
            b.b.d.d.a r5 = b.b.d.d.a.a(r5)
            boolean r0 = r4.n
            if (r0 != 0) goto L15
            boolean r0 = r5.g()
            r4.m = r0
        L15:
            boolean r0 = r4.t
            if (r0 != 0) goto L1f
            int r0 = r5.b()
            r4.o = r0
        L1f:
            boolean r0 = r4.r
            if (r0 != 0) goto L29
            int r5 = r5.c()
            r4.q = r5
        L29:
            int r5 = r4.o
            boolean r0 = r4.m
            r1 = 0
            if (r0 == 0) goto L5c
            android.support.v7.widget.c$d r0 = r4.j
            if (r0 != 0) goto L54
            android.support.v7.widget.c$d r0 = new android.support.v7.widget.c$d
            android.content.Context r2 = r4.f743b
            r0.<init>(r4, r2)
            r4.j = r0
            boolean r2 = r4.l
            r3 = 0
            if (r2 == 0) goto L4b
            android.graphics.drawable.Drawable r2 = r4.k
            r0.setImageDrawable(r2)
            r4.k = r1
            r4.l = r3
        L4b:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            android.support.v7.widget.c$d r2 = r4.j
            r2.measure(r0, r0)
        L54:
            android.support.v7.widget.c$d r0 = r4.j
            int r0 = r0.getMeasuredWidth()
            int r5 = r5 - r0
            goto L5e
        L5c:
            r4.j = r1
        L5e:
            r4.p = r5
            r5 = 1113587712(0x42600000, float:56.0)
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r6 = r6 * r5
            int r5 = (int) r6
            r4.v = r5
            r4.x = r1
            return
    }

    public void a(android.content.res.Configuration r1) {
            r0 = this;
            boolean r1 = r0.r
            if (r1 != 0) goto L10
            android.content.Context r1 = r0.f744c
            b.b.d.d.a r1 = b.b.d.d.a.a(r1)
            int r1 = r1.c()
            r0.q = r1
        L10:
            android.support.v7.view.menu.h r0 = r0.d
            if (r0 == 0) goto L18
            r1 = 1
            r0.b(r1)
        L18:
            return
    }

    public void a(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.support.v7.widget.c$d r0 = r1.j
            if (r0 == 0) goto L8
            r0.setImageDrawable(r2)
            goto Ld
        L8:
            r0 = 1
            r1.l = r0
            r1.k = r2
        Ld:
            return
    }

    @Override // android.support.v7.view.menu.b, android.support.v7.view.menu.o
    public void a(android.support.v7.view.menu.h r1, boolean r2) {
            r0 = this;
            r0.b()
            super.a(r1, r2)
            return
    }

    @Override // android.support.v7.view.menu.b
    public void a(android.support.v7.view.menu.j r2, android.support.v7.view.menu.p.a r3) {
            r1 = this;
            r0 = 0
            r3.a(r2, r0)
            android.support.v7.view.menu.p r2 = r1.i
            android.support.v7.widget.ActionMenuView r2 = (android.support.v7.widget.ActionMenuView) r2
            android.support.v7.view.menu.ActionMenuItemView r3 = (android.support.v7.view.menu.ActionMenuItemView) r3
            r3.setItemInvoker(r2)
            android.support.v7.widget.c$b r2 = r1.B
            if (r2 != 0) goto L18
            android.support.v7.widget.c$b r2 = new android.support.v7.widget.c$b
            r2.<init>(r1)
            r1.B = r2
        L18:
            android.support.v7.widget.c$b r1 = r1.B
            r3.setPopupCallback(r1)
            return
    }

    public void a(android.support.v7.widget.ActionMenuView r1) {
            r0 = this;
            r0.i = r1
            android.support.v7.view.menu.h r0 = r0.d
            r1.a(r0)
            return
    }

    @Override // android.support.v7.view.menu.b, android.support.v7.view.menu.o
    public void a(boolean r5) {
            r4 = this;
            super.a(r5)
            android.support.v7.view.menu.p r5 = r4.i
            android.view.View r5 = (android.view.View) r5
            r5.requestLayout()
            android.support.v7.view.menu.h r5 = r4.d
            r0 = 0
            if (r5 == 0) goto L2c
            java.util.ArrayList r5 = r5.c()
            int r1 = r5.size()
            r2 = r0
        L18:
            if (r2 >= r1) goto L2c
            java.lang.Object r3 = r5.get(r2)
            android.support.v7.view.menu.j r3 = (android.support.v7.view.menu.j) r3
            b.b.c.g.c r3 = r3.a()
            if (r3 == 0) goto L29
            r3.a(r4)
        L29:
            int r2 = r2 + 1
            goto L18
        L2c:
            android.support.v7.view.menu.h r5 = r4.d
            if (r5 == 0) goto L35
            java.util.ArrayList r5 = r5.j()
            goto L36
        L35:
            r5 = 0
        L36:
            boolean r1 = r4.m
            if (r1 == 0) goto L53
            if (r5 == 0) goto L53
            int r1 = r5.size()
            r2 = 1
            if (r1 != r2) goto L50
            java.lang.Object r5 = r5.get(r0)
            android.support.v7.view.menu.j r5 = (android.support.v7.view.menu.j) r5
            boolean r5 = r5.isActionViewExpanded()
            r0 = r5 ^ 1
            goto L53
        L50:
            if (r1 <= 0) goto L53
            r0 = r2
        L53:
            android.support.v7.widget.c$d r5 = r4.j
            if (r0 == 0) goto L83
            if (r5 != 0) goto L62
            android.support.v7.widget.c$d r5 = new android.support.v7.widget.c$d
            android.content.Context r0 = r4.f743b
            r5.<init>(r4, r0)
            r4.j = r5
        L62:
            android.support.v7.widget.c$d r5 = r4.j
            android.view.ViewParent r5 = r5.getParent()
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            android.support.v7.view.menu.p r0 = r4.i
            if (r5 == r0) goto L94
            if (r5 == 0) goto L75
            android.support.v7.widget.c$d r0 = r4.j
            r5.removeView(r0)
        L75:
            android.support.v7.view.menu.p r5 = r4.i
            android.support.v7.widget.ActionMenuView r5 = (android.support.v7.widget.ActionMenuView) r5
            android.support.v7.widget.c$d r0 = r4.j
            android.support.v7.widget.ActionMenuView$c r1 = r5.d()
            r5.addView(r0, r1)
            goto L94
        L83:
            if (r5 == 0) goto L94
            android.view.ViewParent r5 = r5.getParent()
            android.support.v7.view.menu.p r0 = r4.i
            if (r5 != r0) goto L94
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.support.v7.widget.c$d r5 = r4.j
            r0.removeView(r5)
        L94:
            android.support.v7.view.menu.p r5 = r4.i
            android.support.v7.widget.ActionMenuView r5 = (android.support.v7.widget.ActionMenuView) r5
            boolean r4 = r4.m
            r5.setOverflowReserved(r4)
            return
    }

    @Override // android.support.v7.view.menu.b
    public boolean a(int r1, android.support.v7.view.menu.j r2) {
            r0 = this;
            boolean r0 = r2.h()
            return r0
    }

    @Override // android.support.v7.view.menu.b, android.support.v7.view.menu.o
    public boolean a(android.support.v7.view.menu.u r8) {
            r7 = this;
            boolean r0 = r8.hasVisibleItems()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = r8
        L9:
            android.view.Menu r2 = r0.t()
            android.support.v7.view.menu.h r3 = r7.d
            if (r2 == r3) goto L18
            android.view.Menu r0 = r0.t()
            android.support.v7.view.menu.u r0 = (android.support.v7.view.menu.u) r0
            goto L9
        L18:
            android.view.MenuItem r0 = r0.getItem()
            android.view.View r0 = r7.a(r0)
            if (r0 != 0) goto L23
            return r1
        L23:
            android.view.MenuItem r2 = r8.getItem()
            r2.getItemId()
            int r2 = r8.size()
            r3 = r1
        L2f:
            r4 = 1
            if (r3 >= r2) goto L47
            android.view.MenuItem r5 = r8.getItem(r3)
            boolean r6 = r5.isVisible()
            if (r6 == 0) goto L44
            android.graphics.drawable.Drawable r5 = r5.getIcon()
            if (r5 == 0) goto L44
            r1 = r4
            goto L47
        L44:
            int r3 = r3 + 1
            goto L2f
        L47:
            android.support.v7.widget.c$a r2 = new android.support.v7.widget.c$a
            android.content.Context r3 = r7.f744c
            r2.<init>(r7, r3, r8, r0)
            r7.z = r2
            r2.a(r1)
            android.support.v7.widget.c$a r0 = r7.z
            r0.e()
            super.a(r8)
            return r4
    }

    @Override // android.support.v7.view.menu.b
    public boolean a(android.view.ViewGroup r3, int r4) {
            r2 = this;
            android.view.View r0 = r3.getChildAt(r4)
            android.support.v7.widget.c$d r1 = r2.j
            if (r0 != r1) goto La
            r2 = 0
            return r2
        La:
            boolean r2 = super.a(r3, r4)
            return r2
    }

    @Override // android.support.v7.view.menu.b
    public android.support.v7.view.menu.p b(android.view.ViewGroup r2) {
            r1 = this;
            android.support.v7.view.menu.p r0 = r1.i
            android.support.v7.view.menu.p r2 = super.b(r2)
            if (r0 == r2) goto Le
            r0 = r2
            android.support.v7.widget.ActionMenuView r0 = (android.support.v7.widget.ActionMenuView) r0
            r0.setPresenter(r1)
        Le:
            return r2
    }

    public void b(boolean r1) {
            r0 = this;
            r0.u = r1
            return
    }

    public boolean b() {
            r1 = this;
            boolean r0 = r1.e()
            boolean r1 = r1.f()
            r1 = r1 | r0
            return r1
    }

    public android.graphics.drawable.Drawable c() {
            r1 = this;
            android.support.v7.widget.c$d r0 = r1.j
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r1 = r0.getDrawable()
            return r1
        L9:
            boolean r0 = r1.l
            if (r0 == 0) goto L10
            android.graphics.drawable.Drawable r1 = r1.k
            return r1
        L10:
            r1 = 0
            return r1
    }

    public void c(boolean r1) {
            r0 = this;
            r0.m = r1
            r1 = 1
            r0.n = r1
            return
    }

    @Override // android.support.v7.view.menu.o
    public boolean d() {
            r19 = this;
            r0 = r19
            android.support.v7.view.menu.h r1 = r0.d
            r2 = 0
            if (r1 == 0) goto L10
            java.util.ArrayList r1 = r1.n()
            int r3 = r1.size()
            goto L12
        L10:
            r1 = 0
            r3 = r2
        L12:
            int r4 = r0.q
            int r5 = r0.p
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)
            android.support.v7.view.menu.p r7 = r0.i
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r8 = r2
            r9 = r8
            r10 = r9
            r11 = r10
        L22:
            if (r8 >= r3) goto L4b
            java.lang.Object r13 = r1.get(r8)
            android.support.v7.view.menu.j r13 = (android.support.v7.view.menu.j) r13
            boolean r14 = r13.k()
            if (r14 == 0) goto L33
            int r10 = r10 + 1
            goto L3d
        L33:
            boolean r14 = r13.j()
            if (r14 == 0) goto L3c
            int r11 = r11 + 1
            goto L3d
        L3c:
            r9 = 1
        L3d:
            boolean r12 = r0.u
            if (r12 == 0) goto L48
            boolean r12 = r13.isActionViewExpanded()
            if (r12 == 0) goto L48
            r4 = r2
        L48:
            int r8 = r8 + 1
            goto L22
        L4b:
            boolean r8 = r0.m
            if (r8 == 0) goto L56
            if (r9 != 0) goto L54
            int r11 = r11 + r10
            if (r11 <= r4) goto L56
        L54:
            int r4 = r4 + (-1)
        L56:
            int r4 = r4 - r10
            android.util.SparseBooleanArray r8 = r0.w
            r8.clear()
            boolean r9 = r0.s
            if (r9 == 0) goto L69
            int r9 = r0.v
            int r10 = r5 / r9
            int r11 = r5 % r9
            int r11 = r11 / r10
            int r9 = r9 + r11
            goto L6b
        L69:
            r9 = r2
            r10 = r9
        L6b:
            r11 = r2
            r13 = r11
        L6d:
            if (r11 >= r3) goto L152
            java.lang.Object r14 = r1.get(r11)
            android.support.v7.view.menu.j r14 = (android.support.v7.view.menu.j) r14
            boolean r15 = r14.k()
            if (r15 == 0) goto Lae
            android.view.View r15 = r0.x
            android.view.View r15 = r0.a(r14, r15, r7)
            android.view.View r12 = r0.x
            if (r12 != 0) goto L87
            r0.x = r15
        L87:
            boolean r12 = r0.s
            if (r12 == 0) goto L91
            int r12 = android.support.v7.widget.ActionMenuView.a(r15, r9, r10, r6, r2)
            int r10 = r10 - r12
            goto L94
        L91:
            r15.measure(r6, r6)
        L94:
            int r12 = r15.getMeasuredWidth()
            int r5 = r5 - r12
            if (r13 != 0) goto L9c
            r13 = r12
        L9c:
            int r12 = r14.getGroupId()
            r15 = 1
            if (r12 == 0) goto La6
            r8.put(r12, r15)
        La6:
            r14.d(r15)
            r0 = r2
            r17 = r3
            goto L149
        Lae:
            boolean r12 = r14.j()
            if (r12 == 0) goto L143
            int r12 = r14.getGroupId()
            boolean r15 = r8.get(r12)
            if (r4 > 0) goto Lc0
            if (r15 == 0) goto Lca
        Lc0:
            if (r5 <= 0) goto Lca
            boolean r2 = r0.s
            if (r2 == 0) goto Lc8
            if (r10 <= 0) goto Lca
        Lc8:
            r2 = 1
            goto Lcb
        Lca:
            r2 = 0
        Lcb:
            r16 = r2
            if (r2 == 0) goto L109
            android.view.View r2 = r0.x
            android.view.View r2 = r0.a(r14, r2, r7)
            r17 = r3
            android.view.View r3 = r0.x
            if (r3 != 0) goto Ldd
            r0.x = r2
        Ldd:
            boolean r3 = r0.s
            if (r3 == 0) goto Led
            r3 = 0
            int r18 = android.support.v7.widget.ActionMenuView.a(r2, r9, r10, r6, r3)
            int r10 = r10 - r18
            if (r18 != 0) goto Lf0
            r16 = 0
            goto Lf0
        Led:
            r2.measure(r6, r6)
        Lf0:
            int r2 = r2.getMeasuredWidth()
            int r5 = r5 - r2
            if (r13 != 0) goto Lf8
            r13 = r2
        Lf8:
            boolean r2 = r0.s
            if (r2 == 0) goto Lff
            if (r5 < 0) goto L105
            goto L103
        Lff:
            int r2 = r5 + r13
            if (r2 <= 0) goto L105
        L103:
            r2 = 1
            goto L106
        L105:
            r2 = 0
        L106:
            r2 = r16 & r2
            goto L10b
        L109:
            r17 = r3
        L10b:
            if (r2 == 0) goto L114
            if (r12 == 0) goto L114
            r3 = 1
            r8.put(r12, r3)
            goto L13a
        L114:
            if (r15 == 0) goto L13a
            r3 = 0
            r8.put(r12, r3)
            r3 = 0
        L11b:
            if (r3 >= r11) goto L13a
            java.lang.Object r15 = r1.get(r3)
            android.support.v7.view.menu.j r15 = (android.support.v7.view.menu.j) r15
            int r0 = r15.getGroupId()
            if (r0 != r12) goto L135
            boolean r0 = r15.h()
            if (r0 == 0) goto L131
            int r4 = r4 + 1
        L131:
            r0 = 0
            r15.d(r0)
        L135:
            int r3 = r3 + 1
            r0 = r19
            goto L11b
        L13a:
            if (r2 == 0) goto L13e
            int r4 = r4 + (-1)
        L13e:
            r14.d(r2)
            r0 = 0
            goto L149
        L143:
            r0 = r2
            r17 = r3
            r14.d(r0)
        L149:
            int r11 = r11 + 1
            r2 = r0
            r3 = r17
            r0 = r19
            goto L6d
        L152:
            r2 = 1
            return r2
    }

    public boolean e() {
            r3 = this;
            android.support.v7.widget.c$c r0 = r3.A
            r1 = 1
            if (r0 == 0) goto L12
            android.support.v7.view.menu.p r2 = r3.i
            if (r2 == 0) goto L12
            android.view.View r2 = (android.view.View) r2
            r2.removeCallbacks(r0)
            r0 = 0
            r3.A = r0
            return r1
        L12:
            android.support.v7.widget.c$e r3 = r3.y
            if (r3 == 0) goto L1a
            r3.a()
            return r1
        L1a:
            r3 = 0
            return r3
    }

    public boolean f() {
            r0 = this;
            android.support.v7.widget.c$a r0 = r0.z
            if (r0 == 0) goto L9
            r0.a()
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    public boolean g() {
            r1 = this;
            android.support.v7.widget.c$c r0 = r1.A
            if (r0 != 0) goto Ld
            boolean r1 = r1.h()
            if (r1 == 0) goto Lb
            goto Ld
        Lb:
            r1 = 0
            goto Le
        Ld:
            r1 = 1
        Le:
            return r1
    }

    public boolean h() {
            r0 = this;
            android.support.v7.widget.c$e r0 = r0.y
            if (r0 == 0) goto Lc
            boolean r0 = r0.c()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public boolean i() {
            r7 = this;
            boolean r0 = r7.m
            if (r0 == 0) goto L42
            boolean r0 = r7.h()
            if (r0 != 0) goto L42
            android.support.v7.view.menu.h r0 = r7.d
            if (r0 == 0) goto L42
            android.support.v7.view.menu.p r1 = r7.i
            if (r1 == 0) goto L42
            android.support.v7.widget.c$c r1 = r7.A
            if (r1 != 0) goto L42
            java.util.ArrayList r0 = r0.j()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L42
            android.support.v7.widget.c$e r0 = new android.support.v7.widget.c$e
            android.content.Context r3 = r7.f744c
            android.support.v7.view.menu.h r4 = r7.d
            android.support.v7.widget.c$d r5 = r7.j
            r6 = 1
            r1 = r0
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            android.support.v7.widget.c$c r1 = new android.support.v7.widget.c$c
            r1.<init>(r7, r0)
            r7.A = r1
            android.support.v7.view.menu.p r0 = r7.i
            android.view.View r0 = (android.view.View) r0
            r0.post(r1)
            r0 = 0
            super.a(r0)
            r7 = 1
            return r7
        L42:
            r7 = 0
            return r7
    }
}
