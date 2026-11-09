package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
public class h0 implements android.support.v7.view.menu.s {
    private static java.lang.reflect.Method G;
    private static java.lang.reflect.Method H;
    private static java.lang.reflect.Method I;
    private final android.support.v7.widget.h0.c A;
    final android.os.Handler B;
    private final android.graphics.Rect C;
    private android.graphics.Rect D;
    private boolean E;
    android.widget.PopupWindow F;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.content.Context f861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.widget.ListAdapter f862c;
    android.support.v7.widget.d0 d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private boolean j;
    private boolean k;
    private boolean l;
    private int m;
    private boolean n;
    private boolean o;
    int p;
    private android.view.View q;
    private int r;
    private android.database.DataSetObserver s;
    private android.view.View t;
    private android.graphics.drawable.Drawable u;
    private android.widget.AdapterView.OnItemClickListener v;
    private android.widget.AdapterView.OnItemSelectedListener w;
    final android.support.v7.widget.h0.g x;
    private final android.support.v7.widget.h0.f y;
    private final android.support.v7.widget.h0.e z;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.support.v7.widget.h0 f863b;

        a(android.support.v7.widget.h0 r1) {
                r0 = this;
                r0.f863b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                android.support.v7.widget.h0 r0 = r1.f863b
                android.view.View r0 = r0.e()
                if (r0 == 0) goto L13
                android.os.IBinder r0 = r0.getWindowToken()
                if (r0 == 0) goto L13
                android.support.v7.widget.h0 r1 = r1.f863b
                r1.c()
            L13:
                return
        }
    }

    class b implements android.widget.AdapterView.OnItemSelectedListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.support.v7.widget.h0 f864b;

        b(android.support.v7.widget.h0 r1) {
                r0 = this;
                r0.f864b = r1
                r0.<init>()
                return
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
                r0 = this;
                r1 = -1
                if (r3 == r1) goto Ld
                android.support.v7.widget.h0 r0 = r0.f864b
                android.support.v7.widget.d0 r0 = r0.d
                if (r0 == 0) goto Ld
                r1 = 0
                r0.setListSelectionHidden(r1)
            Ld:
                return
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(android.widget.AdapterView<?> r1) {
                r0 = this;
                return
        }
    }

    private class c implements java.lang.Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.support.v7.widget.h0 f865b;

        c(android.support.v7.widget.h0 r1) {
                r0 = this;
                r0.f865b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r0 = this;
                android.support.v7.widget.h0 r0 = r0.f865b
                r0.d()
                return
        }
    }

    private class d extends android.database.DataSetObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.support.v7.widget.h0 f866a;

        d(android.support.v7.widget.h0 r1) {
                r0 = this;
                r0.f866a = r1
                r0.<init>()
                return
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
                r1 = this;
                android.support.v7.widget.h0 r0 = r1.f866a
                boolean r0 = r0.a()
                if (r0 == 0) goto Ld
                android.support.v7.widget.h0 r1 = r1.f866a
                r1.c()
            Ld:
                return
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
                r0 = this;
                android.support.v7.widget.h0 r0 = r0.f866a
                r0.dismiss()
                return
        }
    }

    private class e implements android.widget.AbsListView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.support.v7.widget.h0 f867a;

        e(android.support.v7.widget.h0 r1) {
                r0 = this;
                r0.f867a = r1
                r0.<init>()
                return
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(android.widget.AbsListView r1, int r2, int r3, int r4) {
                r0 = this;
                return
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(android.widget.AbsListView r1, int r2) {
                r0 = this;
                r1 = 1
                if (r2 != r1) goto L25
                android.support.v7.widget.h0 r1 = r0.f867a
                boolean r1 = r1.j()
                if (r1 != 0) goto L25
                android.support.v7.widget.h0 r1 = r0.f867a
                android.widget.PopupWindow r1 = r1.F
                android.view.View r1 = r1.getContentView()
                if (r1 == 0) goto L25
                android.support.v7.widget.h0 r1 = r0.f867a
                android.os.Handler r2 = r1.B
                android.support.v7.widget.h0$g r1 = r1.x
                r2.removeCallbacks(r1)
                android.support.v7.widget.h0 r0 = r0.f867a
                android.support.v7.widget.h0$g r0 = r0.x
                r0.run()
            L25:
                return
        }
    }

    private class f implements android.view.View.OnTouchListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.support.v7.widget.h0 f868b;

        f(android.support.v7.widget.h0 r1) {
                r0 = this;
                r0.f868b = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(android.view.View r3, android.view.MotionEvent r4) {
                r2 = this;
                int r3 = r4.getAction()
                float r0 = r4.getX()
                int r0 = (int) r0
                float r4 = r4.getY()
                int r4 = (int) r4
                if (r3 != 0) goto L40
                android.support.v7.widget.h0 r1 = r2.f868b
                android.widget.PopupWindow r1 = r1.F
                if (r1 == 0) goto L40
                boolean r1 = r1.isShowing()
                if (r1 == 0) goto L40
                if (r0 < 0) goto L40
                android.support.v7.widget.h0 r1 = r2.f868b
                android.widget.PopupWindow r1 = r1.F
                int r1 = r1.getWidth()
                if (r0 >= r1) goto L40
                if (r4 < 0) goto L40
                android.support.v7.widget.h0 r0 = r2.f868b
                android.widget.PopupWindow r0 = r0.F
                int r0 = r0.getHeight()
                if (r4 >= r0) goto L40
                android.support.v7.widget.h0 r2 = r2.f868b
                android.os.Handler r3 = r2.B
                android.support.v7.widget.h0$g r2 = r2.x
                r0 = 250(0xfa, double:1.235E-321)
                r3.postDelayed(r2, r0)
                goto L4c
            L40:
                r4 = 1
                if (r3 != r4) goto L4c
                android.support.v7.widget.h0 r2 = r2.f868b
                android.os.Handler r3 = r2.B
                android.support.v7.widget.h0$g r2 = r2.x
                r3.removeCallbacks(r2)
            L4c:
                r2 = 0
                return r2
        }
    }

    private class g implements java.lang.Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.support.v7.widget.h0 f869b;

        g(android.support.v7.widget.h0 r1) {
                r0 = this;
                r0.f869b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                android.support.v7.widget.h0 r0 = r3.f869b
                android.support.v7.widget.d0 r0 = r0.d
                if (r0 == 0) goto L37
                boolean r0 = b.b.c.g.q.j(r0)
                if (r0 == 0) goto L37
                android.support.v7.widget.h0 r0 = r3.f869b
                android.support.v7.widget.d0 r0 = r0.d
                int r0 = r0.getCount()
                android.support.v7.widget.h0 r1 = r3.f869b
                android.support.v7.widget.d0 r1 = r1.d
                int r1 = r1.getChildCount()
                if (r0 <= r1) goto L37
                android.support.v7.widget.h0 r0 = r3.f869b
                android.support.v7.widget.d0 r0 = r0.d
                int r0 = r0.getChildCount()
                android.support.v7.widget.h0 r1 = r3.f869b
                int r2 = r1.p
                if (r0 > r2) goto L37
                android.widget.PopupWindow r0 = r1.F
                r1 = 2
                r0.setInputMethodMode(r1)
                android.support.v7.widget.h0 r3 = r3.f869b
                r3.c()
            L37:
                return
        }
    }

    static {
            java.lang.String r0 = "ListPopupWindow"
            r1 = 0
            r2 = 1
            java.lang.Class<android.widget.PopupWindow> r3 = android.widget.PopupWindow.class
            java.lang.String r4 = "setClipToScreenEnabled"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L15
            java.lang.Class r6 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L15
            r5[r1] = r6     // Catch: java.lang.NoSuchMethodException -> L15
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L15
            android.support.v7.widget.h0.G = r3     // Catch: java.lang.NoSuchMethodException -> L15
            goto L1a
        L15:
            java.lang.String r3 = "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well."
            android.util.Log.i(r0, r3)
        L1a:
            java.lang.Class<android.widget.PopupWindow> r3 = android.widget.PopupWindow.class
            java.lang.String r4 = "getMaxAvailableHeight"
            r5 = 3
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch: java.lang.NoSuchMethodException -> L35
            java.lang.Class<android.view.View> r6 = android.view.View.class
            r5[r1] = r6     // Catch: java.lang.NoSuchMethodException -> L35
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L35
            r5[r2] = r6     // Catch: java.lang.NoSuchMethodException -> L35
            r6 = 2
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L35
            r5[r6] = r7     // Catch: java.lang.NoSuchMethodException -> L35
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L35
            android.support.v7.widget.h0.H = r3     // Catch: java.lang.NoSuchMethodException -> L35
            goto L3a
        L35:
            java.lang.String r3 = "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well."
            android.util.Log.i(r0, r3)
        L3a:
            java.lang.Class<android.widget.PopupWindow> r3 = android.widget.PopupWindow.class
            java.lang.String r4 = "setEpicenterBounds"
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L4b
            java.lang.Class<android.graphics.Rect> r5 = android.graphics.Rect.class
            r2[r1] = r5     // Catch: java.lang.NoSuchMethodException -> L4b
            java.lang.reflect.Method r1 = r3.getDeclaredMethod(r4, r2)     // Catch: java.lang.NoSuchMethodException -> L4b
            android.support.v7.widget.h0.I = r1     // Catch: java.lang.NoSuchMethodException -> L4b
            goto L50
        L4b:
            java.lang.String r1 = "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well."
            android.util.Log.i(r0, r1)
        L50:
            return
    }

    public h0(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public h0(android.content.Context r4, android.util.AttributeSet r5, int r6, int r7) {
            r3 = this;
            r3.<init>()
            r0 = -2
            r3.e = r0
            r3.f = r0
            r0 = 1002(0x3ea, float:1.404E-42)
            r3.i = r0
            r0 = 0
            r3.m = r0
            r3.n = r0
            r3.o = r0
            r1 = 2147483647(0x7fffffff, float:NaN)
            r3.p = r1
            r3.r = r0
            android.support.v7.widget.h0$g r1 = new android.support.v7.widget.h0$g
            r1.<init>(r3)
            r3.x = r1
            android.support.v7.widget.h0$f r1 = new android.support.v7.widget.h0$f
            r1.<init>(r3)
            r3.y = r1
            android.support.v7.widget.h0$e r1 = new android.support.v7.widget.h0$e
            r1.<init>(r3)
            r3.z = r1
            android.support.v7.widget.h0$c r1 = new android.support.v7.widget.h0$c
            r1.<init>(r3)
            r3.A = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r3.C = r1
            r3.f861b = r4
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = r4.getMainLooper()
            r1.<init>(r2)
            r3.B = r1
            int[] r1 = b.b.d.a.j.ListPopupWindow
            android.content.res.TypedArray r1 = r4.obtainStyledAttributes(r5, r1, r6, r7)
            int r2 = b.b.d.a.j.ListPopupWindow_android_dropDownHorizontalOffset
            int r2 = r1.getDimensionPixelOffset(r2, r0)
            r3.g = r2
            int r2 = b.b.d.a.j.ListPopupWindow_android_dropDownVerticalOffset
            int r0 = r1.getDimensionPixelOffset(r2, r0)
            r3.h = r0
            r2 = 1
            if (r0 == 0) goto L65
            r3.j = r2
        L65:
            r1.recycle()
            android.support.v7.widget.q r0 = new android.support.v7.widget.q
            r0.<init>(r4, r5, r6, r7)
            r3.F = r0
            r0.setInputMethodMode(r2)
            return
    }

    private int a(android.view.View r6, int r7, boolean r8) {
            r5 = this;
            java.lang.reflect.Method r0 = android.support.v7.widget.h0.H
            if (r0 == 0) goto L2c
            android.widget.PopupWindow r1 = r5.F     // Catch: java.lang.Exception -> L25
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L25
            r3 = 0
            r2[r3] = r6     // Catch: java.lang.Exception -> L25
            r3 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L25
            r2[r3] = r4     // Catch: java.lang.Exception -> L25
            r3 = 2
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Exception -> L25
            r2[r3] = r8     // Catch: java.lang.Exception -> L25
            java.lang.Object r8 = r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L25
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch: java.lang.Exception -> L25
            int r5 = r8.intValue()     // Catch: java.lang.Exception -> L25
            return r5
        L25:
            java.lang.String r8 = "ListPopupWindow"
            java.lang.String r0 = "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version."
            android.util.Log.i(r8, r0)
        L2c:
            android.widget.PopupWindow r5 = r5.F
            int r5 = r5.getMaxAvailableHeight(r6, r7)
            return r5
    }

    private void c(boolean r4) {
            r3 = this;
            java.lang.reflect.Method r0 = android.support.v7.widget.h0.G
            if (r0 == 0) goto L1b
            android.widget.PopupWindow r3 = r3.F     // Catch: java.lang.Exception -> L14
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L14
            r2 = 0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Exception -> L14
            r1[r2] = r4     // Catch: java.lang.Exception -> L14
            r0.invoke(r3, r1)     // Catch: java.lang.Exception -> L14
            goto L1b
        L14:
            java.lang.String r3 = "ListPopupWindow"
            java.lang.String r4 = "Could not call setClipToScreenEnabled() on PopupWindow. Oh well."
            android.util.Log.i(r3, r4)
        L1b:
            return
    }

    private int l() {
            r12 = this;
            android.support.v7.widget.d0 r0 = r12.d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 != 0) goto Lbc
            android.content.Context r0 = r12.f861b
            android.support.v7.widget.h0$a r5 = new android.support.v7.widget.h0$a
            r5.<init>(r12)
            boolean r5 = r12.E
            r5 = r5 ^ r3
            android.support.v7.widget.d0 r5 = r12.a(r0, r5)
            r12.d = r5
            android.graphics.drawable.Drawable r6 = r12.u
            if (r6 == 0) goto L20
            r5.setSelector(r6)
        L20:
            android.support.v7.widget.d0 r5 = r12.d
            android.widget.ListAdapter r6 = r12.f862c
            r5.setAdapter(r6)
            android.support.v7.widget.d0 r5 = r12.d
            android.widget.AdapterView$OnItemClickListener r6 = r12.v
            r5.setOnItemClickListener(r6)
            android.support.v7.widget.d0 r5 = r12.d
            r5.setFocusable(r3)
            android.support.v7.widget.d0 r5 = r12.d
            r5.setFocusableInTouchMode(r3)
            android.support.v7.widget.d0 r5 = r12.d
            android.support.v7.widget.h0$b r6 = new android.support.v7.widget.h0$b
            r6.<init>(r12)
            r5.setOnItemSelectedListener(r6)
            android.support.v7.widget.d0 r5 = r12.d
            android.support.v7.widget.h0$e r6 = r12.z
            r5.setOnScrollListener(r6)
            android.widget.AdapterView$OnItemSelectedListener r5 = r12.w
            if (r5 == 0) goto L52
            android.support.v7.widget.d0 r6 = r12.d
            r6.setOnItemSelectedListener(r5)
        L52:
            android.support.v7.widget.d0 r5 = r12.d
            android.view.View r6 = r12.q
            if (r6 == 0) goto Lb5
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r0)
            r7.setOrientation(r3)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r4, r8)
            int r8 = r12.r
            if (r8 == 0) goto L8d
            if (r8 == r3) goto L86
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "Invalid hint position "
            r0.append(r5)
            int r5 = r12.r
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "ListPopupWindow"
            android.util.Log.e(r5, r0)
            goto L93
        L86:
            r7.addView(r5, r0)
            r7.addView(r6)
            goto L93
        L8d:
            r7.addView(r6)
            r7.addView(r5, r0)
        L93:
            int r0 = r12.f
            if (r0 < 0) goto L99
            r5 = r1
            goto L9b
        L99:
            r0 = r4
            r5 = r0
        L9b:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            r6.measure(r0, r4)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r5 = r6.getMeasuredHeight()
            int r6 = r0.topMargin
            int r5 = r5 + r6
            int r0 = r0.bottomMargin
            int r5 = r5 + r0
            r0 = r5
            r5 = r7
            goto Lb6
        Lb5:
            r0 = r4
        Lb6:
            android.widget.PopupWindow r6 = r12.F
            r6.setContentView(r5)
            goto Lda
        Lbc:
            android.widget.PopupWindow r0 = r12.F
            android.view.View r0 = r0.getContentView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r12.q
            if (r0 == 0) goto Ld9
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            int r0 = r0.getMeasuredHeight()
            int r6 = r5.topMargin
            int r0 = r0 + r6
            int r5 = r5.bottomMargin
            int r0 = r0 + r5
            goto Lda
        Ld9:
            r0 = r4
        Lda:
            android.widget.PopupWindow r5 = r12.F
            android.graphics.drawable.Drawable r5 = r5.getBackground()
            if (r5 == 0) goto Lf6
            android.graphics.Rect r6 = r12.C
            r5.getPadding(r6)
            android.graphics.Rect r5 = r12.C
            int r6 = r5.top
            int r5 = r5.bottom
            int r5 = r5 + r6
            boolean r7 = r12.j
            if (r7 != 0) goto Lfc
            int r6 = -r6
            r12.h = r6
            goto Lfc
        Lf6:
            android.graphics.Rect r5 = r12.C
            r5.setEmpty()
            r5 = r4
        Lfc:
            android.widget.PopupWindow r6 = r12.F
            int r6 = r6.getInputMethodMode()
            r7 = 2
            if (r6 != r7) goto L106
            goto L107
        L106:
            r3 = r4
        L107:
            android.view.View r4 = r12.e()
            int r6 = r12.h
            int r3 = r12.a(r4, r6, r3)
            boolean r4 = r12.n
            if (r4 != 0) goto L15f
            int r4 = r12.e
            if (r4 != r2) goto L11a
            goto L15f
        L11a:
            int r4 = r12.f
            r6 = -2
            if (r4 == r6) goto L128
            r1 = 1073741824(0x40000000, float:2.0)
            if (r4 == r2) goto L128
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r1)
            goto L140
        L128:
            android.content.Context r2 = r12.f861b
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.C
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
        L140:
            r7 = r1
            android.support.v7.widget.d0 r6 = r12.d
            r8 = 0
            r9 = -1
            int r10 = r3 - r0
            r11 = -1
            int r1 = r6.a(r7, r8, r9, r10, r11)
            if (r1 <= 0) goto L15d
            android.support.v7.widget.d0 r2 = r12.d
            int r2 = r2.getPaddingTop()
            android.support.v7.widget.d0 r12 = r12.d
            int r12 = r12.getPaddingBottom()
            int r2 = r2 + r12
            int r5 = r5 + r2
            int r0 = r0 + r5
        L15d:
            int r1 = r1 + r0
            return r1
        L15f:
            int r3 = r3 + r5
            return r3
    }

    private void m() {
            r2 = this;
            android.view.View r0 = r2.q
            if (r0 == 0) goto L13
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L13
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r2 = r2.q
            r0.removeView(r2)
        L13:
            return
    }

    android.support.v7.widget.d0 a(android.content.Context r1, boolean r2) {
            r0 = this;
            android.support.v7.widget.d0 r0 = new android.support.v7.widget.d0
            r0.<init>(r1, r2)
            return r0
    }

    public void a(int r1) {
            r0 = this;
            android.widget.PopupWindow r0 = r0.F
            r0.setAnimationStyle(r1)
            return
    }

    public void a(android.graphics.Rect r1) {
            r0 = this;
            r0.D = r1
            return
    }

    public void a(android.graphics.drawable.Drawable r1) {
            r0 = this;
            android.widget.PopupWindow r0 = r0.F
            r0.setBackgroundDrawable(r1)
            return
    }

    public void a(android.view.View r1) {
            r0 = this;
            r0.t = r1
            return
    }

    public void a(android.widget.AdapterView.OnItemClickListener r1) {
            r0 = this;
            r0.v = r1
            return
    }

    public void a(android.widget.ListAdapter r3) {
            r2 = this;
            android.database.DataSetObserver r0 = r2.s
            if (r0 != 0) goto Lc
            android.support.v7.widget.h0$d r0 = new android.support.v7.widget.h0$d
            r0.<init>(r2)
            r2.s = r0
            goto L13
        Lc:
            android.widget.ListAdapter r1 = r2.f862c
            if (r1 == 0) goto L13
            r1.unregisterDataSetObserver(r0)
        L13:
            r2.f862c = r3
            if (r3 == 0) goto L1c
            android.database.DataSetObserver r0 = r2.s
            r3.registerDataSetObserver(r0)
        L1c:
            android.support.v7.widget.d0 r3 = r2.d
            if (r3 == 0) goto L25
            android.widget.ListAdapter r2 = r2.f862c
            r3.setAdapter(r2)
        L25:
            return
    }

    public void a(android.widget.PopupWindow.OnDismissListener r1) {
            r0 = this;
            android.widget.PopupWindow r0 = r0.F
            r0.setOnDismissListener(r1)
            return
    }

    public void a(boolean r1) {
            r0 = this;
            r0.E = r1
            android.widget.PopupWindow r0 = r0.F
            r0.setFocusable(r1)
            return
    }

    @Override // android.support.v7.view.menu.s
    public boolean a() {
            r0 = this;
            android.widget.PopupWindow r0 = r0.F
            boolean r0 = r0.isShowing()
            return r0
    }

    @Override // android.support.v7.view.menu.s
    public android.widget.ListView b() {
            r0 = this;
            android.support.v7.widget.d0 r0 = r0.d
            return r0
    }

    public void b(int r3) {
            r2 = this;
            android.widget.PopupWindow r0 = r2.F
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 == 0) goto L18
            android.graphics.Rect r1 = r2.C
            r0.getPadding(r1)
            android.graphics.Rect r0 = r2.C
            int r1 = r0.left
            int r0 = r0.right
            int r1 = r1 + r0
            int r1 = r1 + r3
            r2.f = r1
            goto L1b
        L18:
            r2.i(r3)
        L1b:
            return
    }

    public void b(boolean r2) {
            r1 = this;
            r0 = 1
            r1.l = r0
            r1.k = r2
            return
    }

    @Override // android.support.v7.view.menu.s
    public void c() {
            r13 = this;
            int r0 = r13.l()
            boolean r1 = r13.j()
            android.widget.PopupWindow r2 = r13.F
            int r3 = r13.i
            android.support.v4.widget.j.a(r2, r3)
            android.widget.PopupWindow r2 = r13.F
            boolean r2 = r2.isShowing()
            r3 = 1
            r4 = -2
            r5 = 0
            r6 = -1
            if (r2 == 0) goto L90
            android.view.View r2 = r13.e()
            boolean r2 = b.b.c.g.q.j(r2)
            if (r2 != 0) goto L26
            return
        L26:
            int r2 = r13.f
            if (r2 != r6) goto L2c
            r2 = r6
            goto L36
        L2c:
            if (r2 != r4) goto L36
            android.view.View r2 = r13.e()
            int r2 = r2.getWidth()
        L36:
            int r7 = r13.e
            if (r7 != r6) goto L64
            if (r1 == 0) goto L3d
            goto L3e
        L3d:
            r0 = r6
        L3e:
            if (r1 == 0) goto L52
            android.widget.PopupWindow r1 = r13.F
            int r4 = r13.f
            if (r4 != r6) goto L48
            r4 = r6
            goto L49
        L48:
            r4 = r5
        L49:
            r1.setWidth(r4)
            android.widget.PopupWindow r1 = r13.F
            r1.setHeight(r5)
            goto L68
        L52:
            android.widget.PopupWindow r1 = r13.F
            int r4 = r13.f
            if (r4 != r6) goto L5a
            r4 = r6
            goto L5b
        L5a:
            r4 = r5
        L5b:
            r1.setWidth(r4)
            android.widget.PopupWindow r1 = r13.F
            r1.setHeight(r6)
            goto L68
        L64:
            if (r7 != r4) goto L67
            goto L68
        L67:
            r0 = r7
        L68:
            android.widget.PopupWindow r1 = r13.F
            boolean r4 = r13.o
            if (r4 != 0) goto L73
            boolean r4 = r13.n
            if (r4 != 0) goto L73
            goto L74
        L73:
            r3 = r5
        L74:
            r1.setOutsideTouchable(r3)
            android.widget.PopupWindow r7 = r13.F
            android.view.View r8 = r13.e()
            int r9 = r13.g
            int r10 = r13.h
            if (r2 >= 0) goto L85
            r11 = r6
            goto L86
        L85:
            r11 = r2
        L86:
            if (r0 >= 0) goto L8a
            r12 = r6
            goto L8b
        L8a:
            r12 = r0
        L8b:
            r7.update(r8, r9, r10, r11, r12)
            goto L11f
        L90:
            int r1 = r13.f
            if (r1 != r6) goto L96
            r1 = r6
            goto La0
        L96:
            if (r1 != r4) goto La0
            android.view.View r1 = r13.e()
            int r1 = r1.getWidth()
        La0:
            int r2 = r13.e
            if (r2 != r6) goto La6
            r0 = r6
            goto Laa
        La6:
            if (r2 != r4) goto La9
            goto Laa
        La9:
            r0 = r2
        Laa:
            android.widget.PopupWindow r2 = r13.F
            r2.setWidth(r1)
            android.widget.PopupWindow r1 = r13.F
            r1.setHeight(r0)
            r13.c(r3)
            android.widget.PopupWindow r0 = r13.F
            boolean r1 = r13.o
            if (r1 != 0) goto Lc3
            boolean r1 = r13.n
            if (r1 != 0) goto Lc3
            r1 = r3
            goto Lc4
        Lc3:
            r1 = r5
        Lc4:
            r0.setOutsideTouchable(r1)
            android.widget.PopupWindow r0 = r13.F
            android.support.v7.widget.h0$f r1 = r13.y
            r0.setTouchInterceptor(r1)
            boolean r0 = r13.l
            if (r0 == 0) goto Ld9
            android.widget.PopupWindow r0 = r13.F
            boolean r1 = r13.k
            android.support.v4.widget.j.a(r0, r1)
        Ld9:
            java.lang.reflect.Method r0 = android.support.v7.widget.h0.I
            if (r0 == 0) goto Lf1
            android.widget.PopupWindow r1 = r13.F     // Catch: java.lang.Exception -> Le9
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> Le9
            android.graphics.Rect r3 = r13.D     // Catch: java.lang.Exception -> Le9
            r2[r5] = r3     // Catch: java.lang.Exception -> Le9
            r0.invoke(r1, r2)     // Catch: java.lang.Exception -> Le9
            goto Lf1
        Le9:
            r0 = move-exception
            java.lang.String r1 = "ListPopupWindow"
            java.lang.String r2 = "Could not invoke setEpicenterBounds on PopupWindow"
            android.util.Log.e(r1, r2, r0)
        Lf1:
            android.widget.PopupWindow r0 = r13.F
            android.view.View r1 = r13.e()
            int r2 = r13.g
            int r3 = r13.h
            int r4 = r13.m
            android.support.v4.widget.j.a(r0, r1, r2, r3, r4)
            android.support.v7.widget.d0 r0 = r13.d
            r0.setSelection(r6)
            boolean r0 = r13.E
            if (r0 == 0) goto L111
            android.support.v7.widget.d0 r0 = r13.d
            boolean r0 = r0.isInTouchMode()
            if (r0 == 0) goto L114
        L111:
            r13.d()
        L114:
            boolean r0 = r13.E
            if (r0 != 0) goto L11f
            android.os.Handler r0 = r13.B
            android.support.v7.widget.h0$c r13 = r13.A
            r0.post(r13)
        L11f:
            return
    }

    public void c(int r1) {
            r0 = this;
            r0.m = r1
            return
    }

    public void d() {
            r1 = this;
            android.support.v7.widget.d0 r1 = r1.d
            if (r1 == 0) goto Lb
            r0 = 1
            r1.setListSelectionHidden(r0)
            r1.requestLayout()
        Lb:
            return
    }

    public void d(int r1) {
            r0 = this;
            r0.g = r1
            return
    }

    @Override // android.support.v7.view.menu.s
    public void dismiss() {
            r2 = this;
            android.widget.PopupWindow r0 = r2.F
            r0.dismiss()
            r2.m()
            android.widget.PopupWindow r0 = r2.F
            r1 = 0
            r0.setContentView(r1)
            r2.d = r1
            android.os.Handler r0 = r2.B
            android.support.v7.widget.h0$g r2 = r2.x
            r0.removeCallbacks(r2)
            return
    }

    public android.view.View e() {
            r0 = this;
            android.view.View r0 = r0.t
            return r0
    }

    public void e(int r1) {
            r0 = this;
            android.widget.PopupWindow r0 = r0.F
            r0.setInputMethodMode(r1)
            return
    }

    public android.graphics.drawable.Drawable f() {
            r0 = this;
            android.widget.PopupWindow r0 = r0.F
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            return r0
    }

    public void f(int r1) {
            r0 = this;
            r0.r = r1
            return
    }

    public int g() {
            r0 = this;
            int r0 = r0.g
            return r0
    }

    public void g(int r2) {
            r1 = this;
            android.support.v7.widget.d0 r0 = r1.d
            boolean r1 = r1.a()
            if (r1 == 0) goto L1b
            if (r0 == 0) goto L1b
            r1 = 0
            r0.setListSelectionHidden(r1)
            r0.setSelection(r2)
            int r1 = r0.getChoiceMode()
            if (r1 == 0) goto L1b
            r1 = 1
            r0.setItemChecked(r2, r1)
        L1b:
            return
    }

    public int h() {
            r1 = this;
            boolean r0 = r1.j
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L6:
            int r1 = r1.h
            return r1
    }

    public void h(int r1) {
            r0 = this;
            r0.h = r1
            r1 = 1
            r0.j = r1
            return
    }

    public int i() {
            r0 = this;
            int r0 = r0.f
            return r0
    }

    public void i(int r1) {
            r0 = this;
            r0.f = r1
            return
    }

    public boolean j() {
            r1 = this;
            android.widget.PopupWindow r1 = r1.F
            int r1 = r1.getInputMethodMode()
            r0 = 2
            if (r1 != r0) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            return r1
    }

    public boolean k() {
            r0 = this;
            boolean r0 = r0.E
            return r0
    }
}
