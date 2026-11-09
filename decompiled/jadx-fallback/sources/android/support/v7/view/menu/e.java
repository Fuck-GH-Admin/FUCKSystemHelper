package android.support.v7.view.menu;

/* JADX INFO: loaded from: classes.dex */
final class e extends android.support.v7.view.menu.m implements android.support.v7.view.menu.o, android.view.View.OnKeyListener, android.widget.PopupWindow.OnDismissListener {
    private static final int C = 0;
    private android.widget.PopupWindow.OnDismissListener A;
    boolean B;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.content.Context f748c;
    private final int d;
    private final int e;
    private final int f;
    private final boolean g;
    final android.os.Handler h;
    private final java.util.List<android.support.v7.view.menu.h> i;
    final java.util.List<android.support.v7.view.menu.e.d> j;
    final android.view.ViewTreeObserver.OnGlobalLayoutListener k;
    private final android.view.View.OnAttachStateChangeListener l;
    private final android.support.v7.widget.i0 m;
    private int n;
    private int o;
    private android.view.View p;
    android.view.View q;
    private int r;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private boolean w;
    private boolean x;
    private android.support.v7.view.menu.o.a y;
    android.view.ViewTreeObserver z;

    class a implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.support.v7.view.menu.e f749b;

        a(android.support.v7.view.menu.e r1) {
                r0 = this;
                r0.f749b = r1
                r0.<init>()
                return
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
                r2 = this;
                android.support.v7.view.menu.e r0 = r2.f749b
                boolean r0 = r0.a()
                if (r0 == 0) goto L51
                android.support.v7.view.menu.e r0 = r2.f749b
                java.util.List<android.support.v7.view.menu.e$d> r0 = r0.j
                int r0 = r0.size()
                if (r0 <= 0) goto L51
                android.support.v7.view.menu.e r0 = r2.f749b
                java.util.List<android.support.v7.view.menu.e$d> r0 = r0.j
                r1 = 0
                java.lang.Object r0 = r0.get(r1)
                android.support.v7.view.menu.e$d r0 = (android.support.v7.view.menu.e.d) r0
                android.support.v7.widget.j0 r0 = r0.f754a
                boolean r0 = r0.k()
                if (r0 != 0) goto L51
                android.support.v7.view.menu.e r0 = r2.f749b
                android.view.View r0 = r0.q
                if (r0 == 0) goto L4c
                boolean r0 = r0.isShown()
                if (r0 != 0) goto L32
                goto L4c
            L32:
                android.support.v7.view.menu.e r2 = r2.f749b
                java.util.List<android.support.v7.view.menu.e$d> r2 = r2.j
                java.util.Iterator r2 = r2.iterator()
            L3a:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L51
                java.lang.Object r0 = r2.next()
                android.support.v7.view.menu.e$d r0 = (android.support.v7.view.menu.e.d) r0
                android.support.v7.widget.j0 r0 = r0.f754a
                r0.c()
                goto L3a
            L4c:
                android.support.v7.view.menu.e r2 = r2.f749b
                r2.dismiss()
            L51:
                return
        }
    }

    class b implements android.view.View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.support.v7.view.menu.e f750b;

        b(android.support.v7.view.menu.e r1) {
                r0 = this;
                r0.f750b = r1
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
                android.support.v7.view.menu.e r0 = r2.f750b
                android.view.ViewTreeObserver r0 = r0.z
                if (r0 == 0) goto L1d
                boolean r0 = r0.isAlive()
                if (r0 != 0) goto L14
                android.support.v7.view.menu.e r0 = r2.f750b
                android.view.ViewTreeObserver r1 = r3.getViewTreeObserver()
                r0.z = r1
            L14:
                android.support.v7.view.menu.e r0 = r2.f750b
                android.view.ViewTreeObserver r1 = r0.z
                android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r0.k
                r1.removeGlobalOnLayoutListener(r0)
            L1d:
                r3.removeOnAttachStateChangeListener(r2)
                return
        }
    }

    class c implements android.support.v7.widget.i0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.support.v7.view.menu.e f751b;

        class a implements java.lang.Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.support.v7.view.menu.e.d f752b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ android.view.MenuItem f753c;
            final /* synthetic */ android.support.v7.view.menu.h d;
            final /* synthetic */ android.support.v7.view.menu.e.c e;

            a(android.support.v7.view.menu.e.c r1, android.support.v7.view.menu.e.d r2, android.view.MenuItem r3, android.support.v7.view.menu.h r4) {
                    r0 = this;
                    r0.e = r1
                    r0.f752b = r2
                    r0.f753c = r3
                    r0.d = r4
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r3 = this;
                    android.support.v7.view.menu.e$d r0 = r3.f752b
                    if (r0 == 0) goto L17
                    android.support.v7.view.menu.e$c r1 = r3.e
                    android.support.v7.view.menu.e r1 = r1.f751b
                    r2 = 1
                    r1.B = r2
                    android.support.v7.view.menu.h r0 = r0.f755b
                    r1 = 0
                    r0.a(r1)
                    android.support.v7.view.menu.e$c r0 = r3.e
                    android.support.v7.view.menu.e r0 = r0.f751b
                    r0.B = r1
                L17:
                    android.view.MenuItem r0 = r3.f753c
                    boolean r0 = r0.isEnabled()
                    if (r0 == 0) goto L2f
                    android.view.MenuItem r0 = r3.f753c
                    boolean r0 = r0.hasSubMenu()
                    if (r0 == 0) goto L2f
                    android.support.v7.view.menu.h r0 = r3.d
                    android.view.MenuItem r3 = r3.f753c
                    r1 = 4
                    r0.a(r3, r1)
                L2f:
                    return
            }
        }

        c(android.support.v7.view.menu.e r1) {
                r0 = this;
                r0.f751b = r1
                r0.<init>()
                return
        }

        @Override // android.support.v7.widget.i0
        public void a(android.support.v7.view.menu.h r6, android.view.MenuItem r7) {
                r5 = this;
                android.support.v7.view.menu.e r0 = r5.f751b
                android.os.Handler r0 = r0.h
                r1 = 0
                r0.removeCallbacksAndMessages(r1)
                android.support.v7.view.menu.e r0 = r5.f751b
                java.util.List<android.support.v7.view.menu.e$d> r0 = r0.j
                int r0 = r0.size()
                r2 = 0
            L11:
                r3 = -1
                if (r2 >= r0) goto L26
                android.support.v7.view.menu.e r4 = r5.f751b
                java.util.List<android.support.v7.view.menu.e$d> r4 = r4.j
                java.lang.Object r4 = r4.get(r2)
                android.support.v7.view.menu.e$d r4 = (android.support.v7.view.menu.e.d) r4
                android.support.v7.view.menu.h r4 = r4.f755b
                if (r6 != r4) goto L23
                goto L27
            L23:
                int r2 = r2 + 1
                goto L11
            L26:
                r2 = r3
            L27:
                if (r2 != r3) goto L2a
                return
            L2a:
                int r2 = r2 + 1
                android.support.v7.view.menu.e r0 = r5.f751b
                java.util.List<android.support.v7.view.menu.e$d> r0 = r0.j
                int r0 = r0.size()
                if (r2 >= r0) goto L41
                android.support.v7.view.menu.e r0 = r5.f751b
                java.util.List<android.support.v7.view.menu.e$d> r0 = r0.j
                java.lang.Object r0 = r0.get(r2)
                r1 = r0
                android.support.v7.view.menu.e$d r1 = (android.support.v7.view.menu.e.d) r1
            L41:
                android.support.v7.view.menu.e$c$a r0 = new android.support.v7.view.menu.e$c$a
                r0.<init>(r5, r1, r7, r6)
                long r1 = android.os.SystemClock.uptimeMillis()
                r3 = 200(0xc8, double:9.9E-322)
                long r1 = r1 + r3
                android.support.v7.view.menu.e r5 = r5.f751b
                android.os.Handler r5 = r5.h
                r5.postAtTime(r0, r6, r1)
                return
        }

        @Override // android.support.v7.widget.i0
        public void b(android.support.v7.view.menu.h r1, android.view.MenuItem r2) {
                r0 = this;
                android.support.v7.view.menu.e r0 = r0.f751b
                android.os.Handler r0 = r0.h
                r0.removeCallbacksAndMessages(r1)
                return
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.support.v7.widget.j0 f754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final android.support.v7.view.menu.h f755b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f756c;

        public d(android.support.v7.widget.j0 r1, android.support.v7.view.menu.h r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.f754a = r1
                r0.f755b = r2
                r0.f756c = r3
                return
        }

        public android.widget.ListView a() {
                r0 = this;
                android.support.v7.widget.j0 r0 = r0.f754a
                android.widget.ListView r0 = r0.b()
                return r0
        }
    }

    static {
            int r0 = b.b.d.a.g.abc_cascading_menu_item_layout
            android.support.v7.view.menu.e.C = r0
            return
    }

    public e(android.content.Context r2, android.view.View r3, int r4, int r5, boolean r6) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.i = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.j = r0
            android.support.v7.view.menu.e$a r0 = new android.support.v7.view.menu.e$a
            r0.<init>(r1)
            r1.k = r0
            android.support.v7.view.menu.e$b r0 = new android.support.v7.view.menu.e$b
            r0.<init>(r1)
            r1.l = r0
            android.support.v7.view.menu.e$c r0 = new android.support.v7.view.menu.e$c
            r0.<init>(r1)
            r1.m = r0
            r0 = 0
            r1.n = r0
            r1.o = r0
            r1.f748c = r2
            r1.p = r3
            r1.e = r4
            r1.f = r5
            r1.g = r6
            r1.w = r0
            int r3 = r1.h()
            r1.r = r3
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r3 = r2.getDisplayMetrics()
            int r3 = r3.widthPixels
            int r3 = r3 / 2
            int r4 = b.b.d.a.d.abc_config_prefDialogWidth
            int r2 = r2.getDimensionPixelSize(r4)
            int r2 = java.lang.Math.max(r3, r2)
            r1.d = r2
            android.os.Handler r2 = new android.os.Handler
            r2.<init>()
            r1.h = r2
            return
    }

    private android.view.MenuItem a(android.support.v7.view.menu.h r4, android.support.v7.view.menu.h r5) {
            r3 = this;
            int r3 = r4.size()
            r0 = 0
        L5:
            if (r0 >= r3) goto L1b
            android.view.MenuItem r1 = r4.getItem(r0)
            boolean r2 = r1.hasSubMenu()
            if (r2 == 0) goto L18
            android.view.SubMenu r2 = r1.getSubMenu()
            if (r5 != r2) goto L18
            return r1
        L18:
            int r0 = r0 + 1
            goto L5
        L1b:
            r3 = 0
            return r3
    }

    private android.view.View a(android.support.v7.view.menu.e.d r7, android.support.v7.view.menu.h r8) {
            r6 = this;
            android.support.v7.view.menu.h r0 = r7.f755b
            android.view.MenuItem r6 = r6.a(r0, r8)
            r8 = 0
            if (r6 != 0) goto La
            return r8
        La:
            android.widget.ListView r7 = r7.a()
            android.widget.ListAdapter r0 = r7.getAdapter()
            boolean r1 = r0 instanceof android.widget.HeaderViewListAdapter
            r2 = 0
            if (r1 == 0) goto L24
            android.widget.HeaderViewListAdapter r0 = (android.widget.HeaderViewListAdapter) r0
            int r1 = r0.getHeadersCount()
            android.widget.ListAdapter r0 = r0.getWrappedAdapter()
            android.support.v7.view.menu.g r0 = (android.support.v7.view.menu.g) r0
            goto L27
        L24:
            android.support.v7.view.menu.g r0 = (android.support.v7.view.menu.g) r0
            r1 = r2
        L27:
            int r3 = r0.getCount()
        L2b:
            r4 = -1
            if (r2 >= r3) goto L38
            android.support.v7.view.menu.j r5 = r0.getItem(r2)
            if (r6 != r5) goto L35
            goto L39
        L35:
            int r2 = r2 + 1
            goto L2b
        L38:
            r2 = r4
        L39:
            if (r2 != r4) goto L3c
            return r8
        L3c:
            int r2 = r2 + r1
            int r6 = r7.getFirstVisiblePosition()
            int r2 = r2 - r6
            if (r2 < 0) goto L50
            int r6 = r7.getChildCount()
            if (r2 < r6) goto L4b
            goto L50
        L4b:
            android.view.View r6 = r7.getChildAt(r2)
            return r6
        L50:
            return r8
    }

    private int c(android.support.v7.view.menu.h r4) {
            r3 = this;
            java.util.List<android.support.v7.view.menu.e$d> r0 = r3.j
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L19
            java.util.List<android.support.v7.view.menu.e$d> r2 = r3.j
            java.lang.Object r2 = r2.get(r1)
            android.support.v7.view.menu.e$d r2 = (android.support.v7.view.menu.e.d) r2
            android.support.v7.view.menu.h r2 = r2.f755b
            if (r4 != r2) goto L16
            return r1
        L16:
            int r1 = r1 + 1
            goto L7
        L19:
            r3 = -1
            return r3
    }

    private int d(int r6) {
            r5 = this;
            java.util.List<android.support.v7.view.menu.e$d> r0 = r5.j
            int r1 = r0.size()
            r2 = 1
            int r1 = r1 - r2
            java.lang.Object r0 = r0.get(r1)
            android.support.v7.view.menu.e$d r0 = (android.support.v7.view.menu.e.d) r0
            android.widget.ListView r0 = r0.a()
            r1 = 2
            int[] r1 = new int[r1]
            r0.getLocationOnScreen(r1)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            android.view.View r4 = r5.q
            r4.getWindowVisibleDisplayFrame(r3)
            int r5 = r5.r
            r4 = 0
            if (r5 != r2) goto L35
            r5 = r1[r4]
            int r0 = r0.getWidth()
            int r5 = r5 + r0
            int r5 = r5 + r6
            int r6 = r3.right
            if (r5 <= r6) goto L34
            return r4
        L34:
            return r2
        L35:
            r5 = r1[r4]
            int r5 = r5 - r6
            if (r5 >= 0) goto L3b
            return r2
        L3b:
            return r4
    }

    private void d(android.support.v7.view.menu.h r15) {
            r14 = this;
            android.content.Context r0 = r14.f748c
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            android.support.v7.view.menu.g r1 = new android.support.v7.view.menu.g
            boolean r2 = r14.g
            int r3 = android.support.v7.view.menu.e.C
            r1.<init>(r15, r0, r2, r3)
            boolean r2 = r14.a()
            r3 = 1
            if (r2 != 0) goto L1e
            boolean r2 = r14.w
            if (r2 == 0) goto L1e
            r1.a(r3)
            goto L2b
        L1e:
            boolean r2 = r14.a()
            if (r2 == 0) goto L2b
            boolean r2 = android.support.v7.view.menu.m.b(r15)
            r1.a(r2)
        L2b:
            android.content.Context r2 = r14.f748c
            int r4 = r14.d
            r5 = 0
            int r2 = android.support.v7.view.menu.m.a(r1, r5, r2, r4)
            android.support.v7.widget.j0 r4 = r14.g()
            r4.a(r1)
            r4.b(r2)
            int r1 = r14.o
            r4.c(r1)
            java.util.List<android.support.v7.view.menu.e$d> r1 = r14.j
            int r1 = r1.size()
            if (r1 <= 0) goto L5d
            java.util.List<android.support.v7.view.menu.e$d> r1 = r14.j
            int r6 = r1.size()
            int r6 = r6 - r3
            java.lang.Object r1 = r1.get(r6)
            android.support.v7.view.menu.e$d r1 = (android.support.v7.view.menu.e.d) r1
            android.view.View r6 = r14.a(r1, r15)
            goto L5f
        L5d:
            r1 = r5
            r6 = r1
        L5f:
            r7 = 0
            if (r6 == 0) goto Ld1
            r4.c(r7)
            r4.a(r5)
            int r8 = r14.d(r2)
            if (r8 != r3) goto L70
            r9 = r3
            goto L71
        L70:
            r9 = r7
        L71:
            r14.r = r8
            int r8 = android.os.Build.VERSION.SDK_INT
            r10 = 26
            r11 = 5
            if (r8 < r10) goto L80
            r4.a(r6)
            r8 = r7
            r12 = r8
            goto Lb1
        L80:
            r8 = 2
            int[] r10 = new int[r8]
            android.view.View r12 = r14.p
            r12.getLocationOnScreen(r10)
            int[] r8 = new int[r8]
            r6.getLocationOnScreen(r8)
            int r12 = r14.o
            r12 = r12 & 7
            if (r12 != r11) goto La7
            r12 = r10[r7]
            android.view.View r13 = r14.p
            int r13 = r13.getWidth()
            int r12 = r12 + r13
            r10[r7] = r12
            r12 = r8[r7]
            int r13 = r6.getWidth()
            int r12 = r12 + r13
            r8[r7] = r12
        La7:
            r12 = r8[r7]
            r13 = r10[r7]
            int r12 = r12 - r13
            r8 = r8[r3]
            r10 = r10[r3]
            int r8 = r8 - r10
        Lb1:
            int r10 = r14.o
            r10 = r10 & r11
            if (r10 != r11) goto Lbe
            if (r9 == 0) goto Lb9
            goto Lc4
        Lb9:
            int r2 = r6.getWidth()
            goto Lc6
        Lbe:
            if (r9 == 0) goto Lc6
            int r2 = r6.getWidth()
        Lc4:
            int r12 = r12 + r2
            goto Lc7
        Lc6:
            int r12 = r12 - r2
        Lc7:
            r4.d(r12)
            r4.b(r3)
            r4.h(r8)
            goto Lea
        Ld1:
            boolean r2 = r14.s
            if (r2 == 0) goto Lda
            int r2 = r14.u
            r4.d(r2)
        Lda:
            boolean r2 = r14.t
            if (r2 == 0) goto Le3
            int r2 = r14.v
            r4.h(r2)
        Le3:
            android.graphics.Rect r2 = r14.f()
            r4.a(r2)
        Lea:
            android.support.v7.view.menu.e$d r2 = new android.support.v7.view.menu.e$d
            int r3 = r14.r
            r2.<init>(r4, r15, r3)
            java.util.List<android.support.v7.view.menu.e$d> r3 = r14.j
            r3.add(r2)
            r4.c()
            android.widget.ListView r2 = r4.b()
            r2.setOnKeyListener(r14)
            if (r1 != 0) goto L12d
            boolean r14 = r14.x
            if (r14 == 0) goto L12d
            java.lang.CharSequence r14 = r15.h()
            if (r14 == 0) goto L12d
            int r14 = b.b.d.a.g.abc_popup_menu_header_item_layout
            android.view.View r14 = r0.inflate(r14, r2, r7)
            android.widget.FrameLayout r14 = (android.widget.FrameLayout) r14
            r0 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r0 = r14.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r14.setEnabled(r7)
            java.lang.CharSequence r15 = r15.h()
            r0.setText(r15)
            r2.addHeaderView(r14, r5, r7)
            r4.c()
        L12d:
            return
    }

    private android.support.v7.widget.j0 g() {
            r5 = this;
            android.support.v7.widget.j0 r0 = new android.support.v7.widget.j0
            android.content.Context r1 = r5.f748c
            int r2 = r5.e
            int r3 = r5.f
            r4 = 0
            r0.<init>(r1, r4, r2, r3)
            android.support.v7.widget.i0 r1 = r5.m
            r0.a(r1)
            r0.a(r5)
            r0.a(r5)
            android.view.View r1 = r5.p
            r0.a(r1)
            int r5 = r5.o
            r0.c(r5)
            r5 = 1
            r0.a(r5)
            r5 = 2
            r0.e(r5)
            return r0
    }

    private int h() {
            r1 = this;
            android.view.View r1 = r1.p
            int r1 = b.b.c.g.q.d(r1)
            r0 = 1
            if (r1 != r0) goto La
            r0 = 0
        La:
            return r0
    }

    @Override // android.support.v7.view.menu.m
    public void a(int r2) {
            r1 = this;
            int r0 = r1.n
            if (r0 == r2) goto L12
            r1.n = r2
            android.view.View r0 = r1.p
            int r0 = b.b.c.g.q.d(r0)
            int r2 = b.b.c.g.d.a(r2, r0)
            r1.o = r2
        L12:
            return
    }

    @Override // android.support.v7.view.menu.m
    public void a(android.support.v7.view.menu.h r2) {
            r1 = this;
            android.content.Context r0 = r1.f748c
            r2.a(r1, r0)
            boolean r0 = r1.a()
            if (r0 == 0) goto Lf
            r1.d(r2)
            goto L14
        Lf:
            java.util.List<android.support.v7.view.menu.h> r1 = r1.i
            r1.add(r2)
        L14:
            return
    }

    @Override // android.support.v7.view.menu.o
    public void a(android.support.v7.view.menu.h r6, boolean r7) {
            r5 = this;
            int r0 = r5.c(r6)
            if (r0 >= 0) goto L7
            return
        L7:
            int r1 = r0 + 1
            java.util.List<android.support.v7.view.menu.e$d> r2 = r5.j
            int r2 = r2.size()
            r3 = 0
            if (r1 >= r2) goto L1f
            java.util.List<android.support.v7.view.menu.e$d> r2 = r5.j
            java.lang.Object r1 = r2.get(r1)
            android.support.v7.view.menu.e$d r1 = (android.support.v7.view.menu.e.d) r1
            android.support.v7.view.menu.h r1 = r1.f755b
            r1.a(r3)
        L1f:
            java.util.List<android.support.v7.view.menu.e$d> r1 = r5.j
            java.lang.Object r0 = r1.remove(r0)
            android.support.v7.view.menu.e$d r0 = (android.support.v7.view.menu.e.d) r0
            android.support.v7.view.menu.h r1 = r0.f755b
            r1.b(r5)
            boolean r1 = r5.B
            r2 = 0
            if (r1 == 0) goto L3b
            android.support.v7.widget.j0 r1 = r0.f754a
            r1.b(r2)
            android.support.v7.widget.j0 r1 = r0.f754a
            r1.a(r3)
        L3b:
            android.support.v7.widget.j0 r0 = r0.f754a
            r0.dismiss()
            java.util.List<android.support.v7.view.menu.e$d> r0 = r5.j
            int r0 = r0.size()
            if (r0 <= 0) goto L55
            java.util.List<android.support.v7.view.menu.e$d> r1 = r5.j
            int r4 = r0 + (-1)
            java.lang.Object r1 = r1.get(r4)
            android.support.v7.view.menu.e$d r1 = (android.support.v7.view.menu.e.d) r1
            int r1 = r1.f756c
            goto L59
        L55:
            int r1 = r5.h()
        L59:
            r5.r = r1
            if (r0 != 0) goto L88
            r5.dismiss()
            android.support.v7.view.menu.o$a r7 = r5.y
            if (r7 == 0) goto L68
            r0 = 1
            r7.a(r6, r0)
        L68:
            android.view.ViewTreeObserver r6 = r5.z
            if (r6 == 0) goto L7b
            boolean r6 = r6.isAlive()
            if (r6 == 0) goto L79
            android.view.ViewTreeObserver r6 = r5.z
            android.view.ViewTreeObserver$OnGlobalLayoutListener r7 = r5.k
            r6.removeGlobalOnLayoutListener(r7)
        L79:
            r5.z = r2
        L7b:
            android.view.View r6 = r5.q
            android.view.View$OnAttachStateChangeListener r7 = r5.l
            r6.removeOnAttachStateChangeListener(r7)
            android.widget.PopupWindow$OnDismissListener r5 = r5.A
            r5.onDismiss()
            goto L97
        L88:
            if (r7 == 0) goto L97
            java.util.List<android.support.v7.view.menu.e$d> r5 = r5.j
            java.lang.Object r5 = r5.get(r3)
            android.support.v7.view.menu.e$d r5 = (android.support.v7.view.menu.e.d) r5
            android.support.v7.view.menu.h r5 = r5.f755b
            r5.a(r3)
        L97:
            return
    }

    @Override // android.support.v7.view.menu.o
    public void a(android.support.v7.view.menu.o.a r1) {
            r0 = this;
            r0.y = r1
            return
    }

    @Override // android.support.v7.view.menu.m
    public void a(android.view.View r2) {
            r1 = this;
            android.view.View r0 = r1.p
            if (r0 == r2) goto L12
            r1.p = r2
            int r0 = r1.n
            int r2 = b.b.c.g.q.d(r2)
            int r2 = b.b.c.g.d.a(r0, r2)
            r1.o = r2
        L12:
            return
    }

    @Override // android.support.v7.view.menu.m
    public void a(android.widget.PopupWindow.OnDismissListener r1) {
            r0 = this;
            r0.A = r1
            return
    }

    @Override // android.support.v7.view.menu.o
    public void a(boolean r1) {
            r0 = this;
            java.util.List<android.support.v7.view.menu.e$d> r0 = r0.j
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            android.support.v7.view.menu.e$d r1 = (android.support.v7.view.menu.e.d) r1
            android.widget.ListView r1 = r1.a()
            android.widget.ListAdapter r1 = r1.getAdapter()
            android.support.v7.view.menu.g r1 = android.support.v7.view.menu.m.a(r1)
            r1.notifyDataSetChanged()
            goto L6
        L22:
            return
    }

    @Override // android.support.v7.view.menu.s
    public boolean a() {
            r2 = this;
            java.util.List<android.support.v7.view.menu.e$d> r0 = r2.j
            int r0 = r0.size()
            r1 = 0
            if (r0 <= 0) goto L1a
            java.util.List<android.support.v7.view.menu.e$d> r2 = r2.j
            java.lang.Object r2 = r2.get(r1)
            android.support.v7.view.menu.e$d r2 = (android.support.v7.view.menu.e.d) r2
            android.support.v7.widget.j0 r2 = r2.f754a
            boolean r2 = r2.a()
            if (r2 == 0) goto L1a
            r1 = 1
        L1a:
            return r1
    }

    @Override // android.support.v7.view.menu.o
    public boolean a(android.support.v7.view.menu.u r5) {
            r4 = this;
            java.util.List<android.support.v7.view.menu.e$d> r0 = r4.j
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            android.support.v7.view.menu.e$d r1 = (android.support.v7.view.menu.e.d) r1
            android.support.v7.view.menu.h r3 = r1.f755b
            if (r5 != r3) goto L6
            android.widget.ListView r4 = r1.a()
            r4.requestFocus()
            return r2
        L1f:
            boolean r0 = r5.hasVisibleItems()
            if (r0 == 0) goto L30
            r4.a(r5)
            android.support.v7.view.menu.o$a r4 = r4.y
            if (r4 == 0) goto L2f
            r4.a(r5)
        L2f:
            return r2
        L30:
            r4 = 0
            return r4
    }

    @Override // android.support.v7.view.menu.s
    public android.widget.ListView b() {
            r1 = this;
            java.util.List<android.support.v7.view.menu.e$d> r0 = r1.j
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto La
            r1 = 0
            goto L1c
        La:
            java.util.List<android.support.v7.view.menu.e$d> r1 = r1.j
            int r0 = r1.size()
            int r0 = r0 + (-1)
            java.lang.Object r1 = r1.get(r0)
            android.support.v7.view.menu.e$d r1 = (android.support.v7.view.menu.e.d) r1
            android.widget.ListView r1 = r1.a()
        L1c:
            return r1
    }

    @Override // android.support.v7.view.menu.m
    public void b(int r2) {
            r1 = this;
            r0 = 1
            r1.s = r0
            r1.u = r2
            return
    }

    @Override // android.support.v7.view.menu.m
    public void b(boolean r1) {
            r0 = this;
            r0.w = r1
            return
    }

    @Override // android.support.v7.view.menu.s
    public void c() {
            r2 = this;
            boolean r0 = r2.a()
            if (r0 == 0) goto L7
            return
        L7:
            java.util.List<android.support.v7.view.menu.h> r0 = r2.i
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            android.support.v7.view.menu.h r1 = (android.support.v7.view.menu.h) r1
            r2.d(r1)
            goto Ld
        L1d:
            java.util.List<android.support.v7.view.menu.h> r0 = r2.i
            r0.clear()
            android.view.View r0 = r2.p
            r2.q = r0
            if (r0 == 0) goto L45
            android.view.ViewTreeObserver r0 = r2.z
            if (r0 != 0) goto L2e
            r0 = 1
            goto L2f
        L2e:
            r0 = 0
        L2f:
            android.view.View r1 = r2.q
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            r2.z = r1
            if (r0 == 0) goto L3e
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r2.k
            r1.addOnGlobalLayoutListener(r0)
        L3e:
            android.view.View r0 = r2.q
            android.view.View$OnAttachStateChangeListener r2 = r2.l
            r0.addOnAttachStateChangeListener(r2)
        L45:
            return
    }

    @Override // android.support.v7.view.menu.m
    public void c(int r2) {
            r1 = this;
            r0 = 1
            r1.t = r0
            r1.v = r2
            return
    }

    @Override // android.support.v7.view.menu.m
    public void c(boolean r1) {
            r0 = this;
            r0.x = r1
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
            r3 = this;
            java.util.List<android.support.v7.view.menu.e$d> r0 = r3.j
            int r0 = r0.size()
            if (r0 <= 0) goto L28
            java.util.List<android.support.v7.view.menu.e$d> r3 = r3.j
            android.support.v7.view.menu.e$d[] r1 = new android.support.v7.view.menu.e.d[r0]
            java.lang.Object[] r3 = r3.toArray(r1)
            android.support.v7.view.menu.e$d[] r3 = (android.support.v7.view.menu.e.d[]) r3
            int r0 = r0 + (-1)
        L14:
            if (r0 < 0) goto L28
            r1 = r3[r0]
            android.support.v7.widget.j0 r2 = r1.f754a
            boolean r2 = r2.a()
            if (r2 == 0) goto L25
            android.support.v7.widget.j0 r1 = r1.f754a
            r1.dismiss()
        L25:
            int r0 = r0 + (-1)
            goto L14
        L28:
            return
    }

    @Override // android.support.v7.view.menu.m
    protected boolean e() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
            r5 = this;
            java.util.List<android.support.v7.view.menu.e$d> r0 = r5.j
            int r0 = r0.size()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L1e
            java.util.List<android.support.v7.view.menu.e$d> r3 = r5.j
            java.lang.Object r3 = r3.get(r2)
            android.support.v7.view.menu.e$d r3 = (android.support.v7.view.menu.e.d) r3
            android.support.v7.widget.j0 r4 = r3.f754a
            boolean r4 = r4.a()
            if (r4 != 0) goto L1b
            goto L1f
        L1b:
            int r2 = r2 + 1
            goto L8
        L1e:
            r3 = 0
        L1f:
            if (r3 == 0) goto L26
            android.support.v7.view.menu.h r5 = r3.f755b
            r5.a(r1)
        L26:
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
