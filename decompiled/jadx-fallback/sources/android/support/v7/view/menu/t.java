package android.support.v7.view.menu;

/* JADX INFO: loaded from: classes.dex */
final class t extends android.support.v7.view.menu.m implements android.widget.PopupWindow.OnDismissListener, android.widget.AdapterView.OnItemClickListener, android.support.v7.view.menu.o, android.view.View.OnKeyListener {
    private static final int w = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.content.Context f782c;
    private final android.support.v7.view.menu.h d;
    private final android.support.v7.view.menu.g e;
    private final boolean f;
    private final int g;
    private final int h;
    private final int i;
    final android.support.v7.widget.j0 j;
    final android.view.ViewTreeObserver.OnGlobalLayoutListener k;
    private final android.view.View.OnAttachStateChangeListener l;
    private android.widget.PopupWindow.OnDismissListener m;
    private android.view.View n;
    android.view.View o;
    private android.support.v7.view.menu.o.a p;
    android.view.ViewTreeObserver q;
    private boolean r;
    private boolean s;
    private int t;
    private int u;
    private boolean v;

    class a implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.support.v7.view.menu.t f783b;

        a(android.support.v7.view.menu.t r1) {
                r0 = this;
                r0.f783b = r1
                r0.<init>()
                return
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
                r1 = this;
                android.support.v7.view.menu.t r0 = r1.f783b
                boolean r0 = r0.a()
                if (r0 == 0) goto L2c
                android.support.v7.view.menu.t r0 = r1.f783b
                android.support.v7.widget.j0 r0 = r0.j
                boolean r0 = r0.k()
                if (r0 != 0) goto L2c
                android.support.v7.view.menu.t r0 = r1.f783b
                android.view.View r0 = r0.o
                if (r0 == 0) goto L27
                boolean r0 = r0.isShown()
                if (r0 != 0) goto L1f
                goto L27
            L1f:
                android.support.v7.view.menu.t r1 = r1.f783b
                android.support.v7.widget.j0 r1 = r1.j
                r1.c()
                goto L2c
            L27:
                android.support.v7.view.menu.t r1 = r1.f783b
                r1.dismiss()
            L2c:
                return
        }
    }

    class b implements android.view.View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.support.v7.view.menu.t f784b;

        b(android.support.v7.view.menu.t r1) {
                r0 = this;
                r0.f784b = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View r1) {
                r0 = this;
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View r3) {
                r2 = this;
                android.support.v7.view.menu.t r0 = r2.f784b
                android.view.ViewTreeObserver r0 = r0.q
                if (r0 == 0) goto L1d
                boolean r0 = r0.isAlive()
                if (r0 != 0) goto L14
                android.support.v7.view.menu.t r0 = r2.f784b
                android.view.ViewTreeObserver r1 = r3.getViewTreeObserver()
                r0.q = r1
            L14:
                android.support.v7.view.menu.t r0 = r2.f784b
                android.view.ViewTreeObserver r1 = r0.q
                android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r0.k
                r1.removeGlobalOnLayoutListener(r0)
            L1d:
                r3.removeOnAttachStateChangeListener(r2)
                return
        }
    }

    static {
            int r0 = b.b.d.a.g.abc_popup_menu_item_layout
            android.support.v7.view.menu.t.w = r0
            return
    }

    public t(android.content.Context r4, android.support.v7.view.menu.h r5, android.view.View r6, int r7, int r8, boolean r9) {
            r3 = this;
            r3.<init>()
            android.support.v7.view.menu.t$a r0 = new android.support.v7.view.menu.t$a
            r0.<init>(r3)
            r3.k = r0
            android.support.v7.view.menu.t$b r0 = new android.support.v7.view.menu.t$b
            r0.<init>(r3)
            r3.l = r0
            r0 = 0
            r3.u = r0
            r3.f782c = r4
            r3.d = r5
            r3.f = r9
            android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r4)
            android.support.v7.view.menu.g r0 = new android.support.v7.view.menu.g
            boolean r1 = r3.f
            int r2 = android.support.v7.view.menu.t.w
            r0.<init>(r5, r9, r1, r2)
            r3.e = r0
            r3.h = r7
            r3.i = r8
            android.content.res.Resources r7 = r4.getResources()
            android.util.DisplayMetrics r8 = r7.getDisplayMetrics()
            int r8 = r8.widthPixels
            int r8 = r8 / 2
            int r9 = b.b.d.a.d.abc_config_prefDialogWidth
            int r7 = r7.getDimensionPixelSize(r9)
            int r7 = java.lang.Math.max(r8, r7)
            r3.g = r7
            r3.n = r6
            android.support.v7.widget.j0 r6 = new android.support.v7.widget.j0
            android.content.Context r7 = r3.f782c
            int r8 = r3.h
            int r9 = r3.i
            r0 = 0
            r6.<init>(r7, r0, r8, r9)
            r3.j = r6
            r5.a(r3, r4)
            return
    }

    private boolean g() {
            r7 = this;
            boolean r0 = r7.a()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r7.r
            r2 = 0
            if (r0 != 0) goto Lc3
            android.view.View r0 = r7.n
            if (r0 != 0) goto L13
            goto Lc3
        L13:
            r7.o = r0
            android.support.v7.widget.j0 r0 = r7.j
            r0.a(r7)
            android.support.v7.widget.j0 r0 = r7.j
            r0.a(r7)
            android.support.v7.widget.j0 r0 = r7.j
            r0.a(r1)
            android.view.View r0 = r7.o
            android.view.ViewTreeObserver r3 = r7.q
            if (r3 != 0) goto L2c
            r3 = r1
            goto L2d
        L2c:
            r3 = r2
        L2d:
            android.view.ViewTreeObserver r4 = r0.getViewTreeObserver()
            r7.q = r4
            if (r3 == 0) goto L3a
            android.view.ViewTreeObserver$OnGlobalLayoutListener r3 = r7.k
            r4.addOnGlobalLayoutListener(r3)
        L3a:
            android.view.View$OnAttachStateChangeListener r3 = r7.l
            r0.addOnAttachStateChangeListener(r3)
            android.support.v7.widget.j0 r3 = r7.j
            r3.a(r0)
            android.support.v7.widget.j0 r0 = r7.j
            int r3 = r7.u
            r0.c(r3)
            boolean r0 = r7.s
            r3 = 0
            if (r0 != 0) goto L5e
            android.support.v7.view.menu.g r0 = r7.e
            android.content.Context r4 = r7.f782c
            int r5 = r7.g
            int r0 = android.support.v7.view.menu.m.a(r0, r3, r4, r5)
            r7.t = r0
            r7.s = r1
        L5e:
            android.support.v7.widget.j0 r0 = r7.j
            int r4 = r7.t
            r0.b(r4)
            android.support.v7.widget.j0 r0 = r7.j
            r4 = 2
            r0.e(r4)
            android.support.v7.widget.j0 r0 = r7.j
            android.graphics.Rect r4 = r7.f()
            r0.a(r4)
            android.support.v7.widget.j0 r0 = r7.j
            r0.c()
            android.support.v7.widget.j0 r0 = r7.j
            android.widget.ListView r0 = r0.b()
            r0.setOnKeyListener(r7)
            boolean r4 = r7.v
            if (r4 == 0) goto Lb6
            android.support.v7.view.menu.h r4 = r7.d
            java.lang.CharSequence r4 = r4.h()
            if (r4 == 0) goto Lb6
            android.content.Context r4 = r7.f782c
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            int r5 = b.b.d.a.g.abc_popup_menu_header_item_layout
            android.view.View r4 = r4.inflate(r5, r0, r2)
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r5 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto Lb0
            android.support.v7.view.menu.h r6 = r7.d
            java.lang.CharSequence r6 = r6.h()
            r5.setText(r6)
        Lb0:
            r4.setEnabled(r2)
            r0.addHeaderView(r4, r3, r2)
        Lb6:
            android.support.v7.widget.j0 r0 = r7.j
            android.support.v7.view.menu.g r2 = r7.e
            r0.a(r2)
            android.support.v7.widget.j0 r7 = r7.j
            r7.c()
            return r1
        Lc3:
            return r2
    }

    @Override // android.support.v7.view.menu.m
    public void a(int r1) {
            r0 = this;
            r0.u = r1
            return
    }

    @Override // android.support.v7.view.menu.m
    public void a(android.support.v7.view.menu.h r1) {
            r0 = this;
            return
    }

    @Override // android.support.v7.view.menu.o
    public void a(android.support.v7.view.menu.h r2, boolean r3) {
            r1 = this;
            android.support.v7.view.menu.h r0 = r1.d
            if (r2 == r0) goto L5
            return
        L5:
            r1.dismiss()
            android.support.v7.view.menu.o$a r1 = r1.p
            if (r1 == 0) goto Lf
            r1.a(r2, r3)
        Lf:
            return
    }

    @Override // android.support.v7.view.menu.o
    public void a(android.support.v7.view.menu.o.a r1) {
            r0 = this;
            r0.p = r1
            return
    }

    @Override // android.support.v7.view.menu.m
    public void a(android.view.View r1) {
            r0 = this;
            r0.n = r1
            return
    }

    @Override // android.support.v7.view.menu.m
    public void a(android.widget.PopupWindow.OnDismissListener r1) {
            r0 = this;
            r0.m = r1
            return
    }

    @Override // android.support.v7.view.menu.o
    public void a(boolean r1) {
            r0 = this;
            r1 = 0
            r0.s = r1
            android.support.v7.view.menu.g r0 = r0.e
            if (r0 == 0) goto La
            r0.notifyDataSetChanged()
        La:
            return
    }

    @Override // android.support.v7.view.menu.s
    public boolean a() {
            r1 = this;
            boolean r0 = r1.r
            if (r0 != 0) goto Le
            android.support.v7.widget.j0 r1 = r1.j
            boolean r1 = r1.a()
            if (r1 == 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    @Override // android.support.v7.view.menu.o
    public boolean a(android.support.v7.view.menu.u r10) {
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L64
            android.support.v7.view.menu.n r0 = new android.support.v7.view.menu.n
            android.content.Context r3 = r9.f782c
            android.view.View r5 = r9.o
            boolean r6 = r9.f
            int r7 = r9.h
            int r8 = r9.i
            r2 = r0
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            android.support.v7.view.menu.o$a r2 = r9.p
            r0.a(r2)
            boolean r2 = android.support.v7.view.menu.m.b(r10)
            r0.a(r2)
            android.widget.PopupWindow$OnDismissListener r2 = r9.m
            r0.a(r2)
            r2 = 0
            r9.m = r2
            android.support.v7.view.menu.h r2 = r9.d
            r2.a(r1)
            android.support.v7.widget.j0 r2 = r9.j
            int r2 = r2.g()
            android.support.v7.widget.j0 r3 = r9.j
            int r3 = r3.h()
            int r4 = r9.u
            android.view.View r5 = r9.n
            int r5 = b.b.c.g.q.d(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L55
            android.view.View r4 = r9.n
            int r4 = r4.getWidth()
            int r2 = r2 + r4
        L55:
            boolean r0 = r0.a(r2, r3)
            if (r0 == 0) goto L64
            android.support.v7.view.menu.o$a r9 = r9.p
            if (r9 == 0) goto L62
            r9.a(r10)
        L62:
            r9 = 1
            return r9
        L64:
            return r1
    }

    @Override // android.support.v7.view.menu.s
    public android.widget.ListView b() {
            r0 = this;
            android.support.v7.widget.j0 r0 = r0.j
            android.widget.ListView r0 = r0.b()
            return r0
    }

    @Override // android.support.v7.view.menu.m
    public void b(int r1) {
            r0 = this;
            android.support.v7.widget.j0 r0 = r0.j
            r0.d(r1)
            return
    }

    @Override // android.support.v7.view.menu.m
    public void b(boolean r1) {
            r0 = this;
            android.support.v7.view.menu.g r0 = r0.e
            r0.a(r1)
            return
    }

    @Override // android.support.v7.view.menu.s
    public void c() {
            r1 = this;
            boolean r1 = r1.g()
            if (r1 == 0) goto L7
            return
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "StandardMenuPopup cannot be used without an anchor"
            r1.<init>(r0)
            throw r1
    }

    @Override // android.support.v7.view.menu.m
    public void c(int r1) {
            r0 = this;
            android.support.v7.widget.j0 r0 = r0.j
            r0.h(r1)
            return
    }

    @Override // android.support.v7.view.menu.m
    public void c(boolean r1) {
            r0 = this;
            r0.v = r1
            return
    }

    @Override // android.support.v7.view.menu.o
    public boolean d() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.support.v7.view.menu.s
    public void dismiss() {
            r1 = this;
            boolean r0 = r1.a()
            if (r0 == 0) goto Lb
            android.support.v7.widget.j0 r1 = r1.j
            r1.dismiss()
        Lb:
            return
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
            r2 = this;
            r0 = 1
            r2.r = r0
            android.support.v7.view.menu.h r0 = r2.d
            r0.close()
            android.view.ViewTreeObserver r0 = r2.q
            if (r0 == 0) goto L24
            boolean r0 = r0.isAlive()
            if (r0 != 0) goto L1a
            android.view.View r0 = r2.o
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r2.q = r0
        L1a:
            android.view.ViewTreeObserver r0 = r2.q
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r2.k
            r0.removeGlobalOnLayoutListener(r1)
            r0 = 0
            r2.q = r0
        L24:
            android.view.View r0 = r2.o
            android.view.View$OnAttachStateChangeListener r1 = r2.l
            r0.removeOnAttachStateChangeListener(r1)
            android.widget.PopupWindow$OnDismissListener r2 = r2.m
            if (r2 == 0) goto L32
            r2.onDismiss()
        L32:
            return
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View r1, int r2, android.view.KeyEvent r3) {
            r0 = this;
            int r1 = r3.getAction()
            r3 = 1
            if (r1 != r3) goto Lf
            r1 = 82
            if (r2 != r1) goto Lf
            r0.dismiss()
            return r3
        Lf:
            r0 = 0
            return r0
    }
}
