package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
public class w extends android.widget.Spinner implements b.b.c.g.p {
    private static final int[] j = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.support.v7.widget.e f932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.content.Context f933c;
    private android.support.v7.widget.f0 d;
    private android.widget.SpinnerAdapter e;
    private final boolean f;
    android.support.v7.widget.w.c g;
    int h;
    final android.graphics.Rect i;

    class a extends android.support.v7.widget.f0 {
        final /* synthetic */ android.support.v7.widget.w.c k;
        final /* synthetic */ android.support.v7.widget.w l;

        a(android.support.v7.widget.w r1, android.view.View r2, android.support.v7.widget.w.c r3) {
                r0 = this;
                r0.l = r1
                r0.k = r3
                r0.<init>(r2)
                return
        }

        @Override // android.support.v7.widget.f0
        public android.support.v7.view.menu.s a() {
                r0 = this;
                android.support.v7.widget.w$c r0 = r0.k
                return r0
        }

        @Override // android.support.v7.widget.f0
        public boolean b() {
                r1 = this;
                android.support.v7.widget.w r0 = r1.l
                android.support.v7.widget.w$c r0 = r0.g
                boolean r0 = r0.a()
                if (r0 != 0) goto L11
                android.support.v7.widget.w r1 = r1.l
                android.support.v7.widget.w$c r1 = r1.g
                r1.c()
            L11:
                r1 = 1
                return r1
        }
    }

    private static class b implements android.widget.ListAdapter, android.widget.SpinnerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private android.widget.SpinnerAdapter f934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private android.widget.ListAdapter f935c;

        public b(android.widget.SpinnerAdapter r2, android.content.res.Resources.Theme r3) {
                r1 = this;
                r1.<init>()
                r1.f934b = r2
                boolean r0 = r2 instanceof android.widget.ListAdapter
                if (r0 == 0) goto Le
                r0 = r2
                android.widget.ListAdapter r0 = (android.widget.ListAdapter) r0
                r1.f935c = r0
            Le:
                if (r3 == 0) goto L35
                int r1 = android.os.Build.VERSION.SDK_INT
                r0 = 23
                if (r1 < r0) goto L26
                boolean r1 = r2 instanceof android.widget.ThemedSpinnerAdapter
                if (r1 == 0) goto L26
                android.widget.ThemedSpinnerAdapter r2 = (android.widget.ThemedSpinnerAdapter) r2
                android.content.res.Resources$Theme r1 = r2.getDropDownViewTheme()
                if (r1 == r3) goto L35
                r2.setDropDownViewTheme(r3)
                goto L35
            L26:
                boolean r1 = r2 instanceof android.support.v7.widget.p0
                if (r1 == 0) goto L35
                android.support.v7.widget.p0 r2 = (android.support.v7.widget.p0) r2
                android.content.res.Resources$Theme r1 = r2.getDropDownViewTheme()
                if (r1 != 0) goto L35
                r2.setDropDownViewTheme(r3)
            L35:
                return
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
                r0 = this;
                android.widget.ListAdapter r0 = r0.f935c
                if (r0 == 0) goto L9
                boolean r0 = r0.areAllItemsEnabled()
                return r0
            L9:
                r0 = 1
                return r0
        }

        @Override // android.widget.Adapter
        public int getCount() {
                r0 = this;
                android.widget.SpinnerAdapter r0 = r0.f934b
                if (r0 != 0) goto L6
                r0 = 0
                goto La
            L6:
                int r0 = r0.getCount()
            La:
                return r0
        }

        @Override // android.widget.SpinnerAdapter
        public android.view.View getDropDownView(int r1, android.view.View r2, android.view.ViewGroup r3) {
                r0 = this;
                android.widget.SpinnerAdapter r0 = r0.f934b
                if (r0 != 0) goto L6
                r0 = 0
                goto La
            L6:
                android.view.View r0 = r0.getDropDownView(r1, r2, r3)
            La:
                return r0
        }

        @Override // android.widget.Adapter
        public java.lang.Object getItem(int r1) {
                r0 = this;
                android.widget.SpinnerAdapter r0 = r0.f934b
                if (r0 != 0) goto L6
                r0 = 0
                goto La
            L6:
                java.lang.Object r0 = r0.getItem(r1)
            La:
                return r0
        }

        @Override // android.widget.Adapter
        public long getItemId(int r1) {
                r0 = this;
                android.widget.SpinnerAdapter r0 = r0.f934b
                if (r0 != 0) goto L7
                r0 = -1
                goto Lb
            L7:
                long r0 = r0.getItemId(r1)
            Lb:
                return r0
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int r1) {
                r0 = this;
                r0 = 0
                return r0
        }

        @Override // android.widget.Adapter
        public android.view.View getView(int r1, android.view.View r2, android.view.ViewGroup r3) {
                r0 = this;
                android.view.View r0 = r0.getDropDownView(r1, r2, r3)
                return r0
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
                r0 = this;
                r0 = 1
                return r0
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
                r0 = this;
                android.widget.SpinnerAdapter r0 = r0.f934b
                if (r0 == 0) goto Lc
                boolean r0 = r0.hasStableIds()
                if (r0 == 0) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
                r0 = this;
                int r0 = r0.getCount()
                if (r0 != 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int r1) {
                r0 = this;
                android.widget.ListAdapter r0 = r0.f935c
                if (r0 == 0) goto L9
                boolean r0 = r0.isEnabled(r1)
                return r0
            L9:
                r0 = 1
                return r0
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(android.database.DataSetObserver r1) {
                r0 = this;
                android.widget.SpinnerAdapter r0 = r0.f934b
                if (r0 == 0) goto L7
                r0.registerDataSetObserver(r1)
            L7:
                return
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(android.database.DataSetObserver r1) {
                r0 = this;
                android.widget.SpinnerAdapter r0 = r0.f934b
                if (r0 == 0) goto L7
                r0.unregisterDataSetObserver(r1)
            L7:
                return
        }
    }

    private class c extends android.support.v7.widget.h0 {
        private java.lang.CharSequence J;
        android.widget.ListAdapter K;
        private final android.graphics.Rect L;
        final /* synthetic */ android.support.v7.widget.w M;

        class a implements android.widget.AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.support.v7.widget.w.c f936b;

            a(android.support.v7.widget.w.c r1, android.support.v7.widget.w r2) {
                    r0 = this;
                    r0.f936b = r1
                    r0.<init>()
                    return
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(android.widget.AdapterView<?> r3, android.view.View r4, int r5, long r6) {
                    r2 = this;
                    android.support.v7.widget.w$c r3 = r2.f936b
                    android.support.v7.widget.w r3 = r3.M
                    r3.setSelection(r5)
                    android.support.v7.widget.w$c r3 = r2.f936b
                    android.support.v7.widget.w r3 = r3.M
                    android.widget.AdapterView$OnItemClickListener r3 = r3.getOnItemClickListener()
                    if (r3 == 0) goto L1e
                    android.support.v7.widget.w$c r3 = r2.f936b
                    android.support.v7.widget.w r6 = r3.M
                    android.widget.ListAdapter r3 = r3.K
                    long r0 = r3.getItemId(r5)
                    r6.performItemClick(r4, r5, r0)
                L1e:
                    android.support.v7.widget.w$c r2 = r2.f936b
                    r2.dismiss()
                    return
            }
        }

        class b implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.support.v7.widget.w.c f937b;

            b(android.support.v7.widget.w.c r1) {
                    r0 = this;
                    r0.f937b = r1
                    r0.<init>()
                    return
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                    r2 = this;
                    android.support.v7.widget.w$c r0 = r2.f937b
                    android.support.v7.widget.w r1 = r0.M
                    boolean r0 = r0.b(r1)
                    if (r0 != 0) goto L10
                    android.support.v7.widget.w$c r2 = r2.f937b
                    r2.dismiss()
                    goto L1a
                L10:
                    android.support.v7.widget.w$c r0 = r2.f937b
                    r0.l()
                    android.support.v7.widget.w$c r2 = r2.f937b
                    android.support.v7.widget.w.c.a(r2)
                L1a:
                    return
            }
        }

        /* JADX INFO: renamed from: android.support.v7.widget.w$c$c, reason: collision with other inner class name */
        class C0034c implements android.widget.PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.view.ViewTreeObserver.OnGlobalLayoutListener f938b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ android.support.v7.widget.w.c f939c;

            C0034c(android.support.v7.widget.w.c r1, android.view.ViewTreeObserver.OnGlobalLayoutListener r2) {
                    r0 = this;
                    r0.f939c = r1
                    r0.f938b = r2
                    r0.<init>()
                    return
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                    r1 = this;
                    android.support.v7.widget.w$c r0 = r1.f939c
                    android.support.v7.widget.w r0 = r0.M
                    android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
                    if (r0 == 0) goto Lf
                    android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r1.f938b
                    r0.removeGlobalOnLayoutListener(r1)
                Lf:
                    return
            }
        }

        public c(android.support.v7.widget.w r1, android.content.Context r2, android.util.AttributeSet r3, int r4) {
                r0 = this;
                r0.M = r1
                r0.<init>(r2, r3, r4)
                android.graphics.Rect r2 = new android.graphics.Rect
                r2.<init>()
                r0.L = r2
                r0.a(r1)
                r2 = 1
                r0.a(r2)
                r2 = 0
                r0.f(r2)
                android.support.v7.widget.w$c$a r2 = new android.support.v7.widget.w$c$a
                r2.<init>(r0, r1)
                r0.a(r2)
                return
        }

        static /* synthetic */ void a(android.support.v7.widget.w.c r0) {
                super.c()
                return
        }

        @Override // android.support.v7.widget.h0
        public void a(android.widget.ListAdapter r1) {
                r0 = this;
                super.a(r1)
                r0.K = r1
                return
        }

        public void a(java.lang.CharSequence r1) {
                r0 = this;
                r0.J = r1
                return
        }

        boolean b(android.view.View r2) {
                r1 = this;
                boolean r0 = b.b.c.g.q.j(r2)
                if (r0 == 0) goto L10
                android.graphics.Rect r1 = r1.L
                boolean r1 = r2.getGlobalVisibleRect(r1)
                if (r1 == 0) goto L10
                r1 = 1
                goto L11
            L10:
                r1 = 0
            L11:
                return r1
        }

        @Override // android.support.v7.widget.h0, android.support.v7.view.menu.s
        public void c() {
                r3 = this;
                boolean r0 = r3.a()
                r3.l()
                r1 = 2
                r3.e(r1)
                super.c()
                android.widget.ListView r1 = r3.b()
                r2 = 1
                r1.setChoiceMode(r2)
                android.support.v7.widget.w r1 = r3.M
                int r1 = r1.getSelectedItemPosition()
                r3.g(r1)
                if (r0 == 0) goto L22
                return
            L22:
                android.support.v7.widget.w r0 = r3.M
                android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
                if (r0 == 0) goto L3a
                android.support.v7.widget.w$c$b r1 = new android.support.v7.widget.w$c$b
                r1.<init>(r3)
                r0.addOnGlobalLayoutListener(r1)
                android.support.v7.widget.w$c$c r0 = new android.support.v7.widget.w$c$c
                r0.<init>(r3, r1)
                r3.a(r0)
            L3a:
                return
        }

        void l() {
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.f()
                r1 = 0
                if (r0 == 0) goto L26
                android.support.v7.widget.w r1 = r8.M
                android.graphics.Rect r1 = r1.i
                r0.getPadding(r1)
                android.support.v7.widget.w r0 = r8.M
                boolean r0 = android.support.v7.widget.z0.a(r0)
                if (r0 == 0) goto L1d
                android.support.v7.widget.w r0 = r8.M
                android.graphics.Rect r0 = r0.i
                int r0 = r0.right
                goto L24
            L1d:
                android.support.v7.widget.w r0 = r8.M
                android.graphics.Rect r0 = r0.i
                int r0 = r0.left
                int r0 = -r0
            L24:
                r1 = r0
                goto L2e
            L26:
                android.support.v7.widget.w r0 = r8.M
                android.graphics.Rect r0 = r0.i
                r0.right = r1
                r0.left = r1
            L2e:
                android.support.v7.widget.w r0 = r8.M
                int r0 = r0.getPaddingLeft()
                android.support.v7.widget.w r2 = r8.M
                int r2 = r2.getPaddingRight()
                android.support.v7.widget.w r3 = r8.M
                int r3 = r3.getWidth()
                android.support.v7.widget.w r4 = r8.M
                int r5 = r4.h
                r6 = -2
                if (r5 != r6) goto L78
                android.widget.ListAdapter r5 = r8.K
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.f()
                int r4 = r4.a(r5, r6)
                android.support.v7.widget.w r5 = r8.M
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                android.support.v7.widget.w r6 = r8.M
                android.graphics.Rect r6 = r6.i
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L70
                r4 = r5
            L70:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L7e
            L78:
                r4 = -1
                if (r5 != r4) goto L82
                int r4 = r3 - r0
                int r4 = r4 - r2
            L7e:
                r8.b(r4)
                goto L85
            L82:
                r8.b(r5)
            L85:
                android.support.v7.widget.w r4 = r8.M
                boolean r4 = android.support.v7.widget.z0.a(r4)
                if (r4 == 0) goto L95
                int r3 = r3 - r2
                int r0 = r8.i()
                int r3 = r3 - r0
                int r1 = r1 + r3
                goto L96
            L95:
                int r1 = r1 + r0
            L96:
                r8.d(r1)
                return
        }

        public java.lang.CharSequence m() {
                r0 = this;
                java.lang.CharSequence r0 = r0.J
                return r0
        }
    }

    static {
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16843505(0x10102f1, float:2.3695668E-38)
            r0[r1] = r2
            android.support.v7.widget.w.j = r0
            return
    }

    public w(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = b.b.d.a.a.spinnerStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public w(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            r0 = -1
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public w(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public w(android.content.Context r8, android.util.AttributeSet r9, int r10, int r11, android.content.res.Resources.Theme r12) {
            r7 = this;
            r7.<init>(r8, r9, r10)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.i = r0
            int[] r0 = b.b.d.a.j.Spinner
            r1 = 0
            android.support.v7.widget.t0 r0 = android.support.v7.widget.t0.a(r8, r9, r0, r10, r1)
            android.support.v7.widget.e r2 = new android.support.v7.widget.e
            r2.<init>(r7)
            r7.f932b = r2
            r2 = 0
            if (r12 == 0) goto L23
            b.b.d.d.d r3 = new b.b.d.d.d
            r3.<init>(r8, r12)
        L20:
            r7.f933c = r3
            goto L3c
        L23:
            int r12 = b.b.d.a.j.Spinner_popupTheme
            int r12 = r0.g(r12, r1)
            if (r12 == 0) goto L31
            b.b.d.d.d r3 = new b.b.d.d.d
            r3.<init>(r8, r12)
            goto L20
        L31:
            int r12 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r12 >= r3) goto L39
            r12 = r8
            goto L3a
        L39:
            r12 = r2
        L3a:
            r7.f933c = r12
        L3c:
            android.content.Context r12 = r7.f933c
            r3 = 1
            if (r12 == 0) goto Laa
            r12 = -1
            if (r11 != r12) goto L72
            int[] r12 = android.support.v7.widget.w.j     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5e
            android.content.res.TypedArray r12 = r8.obtainStyledAttributes(r9, r12, r10, r1)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5e
            boolean r4 = r12.hasValue(r1)     // Catch: java.lang.Exception -> L5a java.lang.Throwable -> L6a
            if (r4 == 0) goto L54
            int r11 = r12.getInt(r1, r1)     // Catch: java.lang.Exception -> L5a java.lang.Throwable -> L6a
        L54:
            if (r12 == 0) goto L72
        L56:
            r12.recycle()
            goto L72
        L5a:
            r4 = move-exception
            goto L60
        L5c:
            r7 = move-exception
            goto L6c
        L5e:
            r4 = move-exception
            r12 = r2
        L60:
            java.lang.String r5 = "AppCompatSpinner"
            java.lang.String r6 = "Could not read android:spinnerMode"
            android.util.Log.i(r5, r6, r4)     // Catch: java.lang.Throwable -> L6a
            if (r12 == 0) goto L72
            goto L56
        L6a:
            r7 = move-exception
            r2 = r12
        L6c:
            if (r2 == 0) goto L71
            r2.recycle()
        L71:
            throw r7
        L72:
            if (r11 != r3) goto Laa
            android.support.v7.widget.w$c r11 = new android.support.v7.widget.w$c
            android.content.Context r12 = r7.f933c
            r11.<init>(r7, r12, r9, r10)
            android.content.Context r12 = r7.f933c
            int[] r4 = b.b.d.a.j.Spinner
            android.support.v7.widget.t0 r12 = android.support.v7.widget.t0.a(r12, r9, r4, r10, r1)
            int r1 = b.b.d.a.j.Spinner_android_dropDownWidth
            r4 = -2
            int r1 = r12.f(r1, r4)
            r7.h = r1
            int r1 = b.b.d.a.j.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r1 = r12.b(r1)
            r11.a(r1)
            int r1 = b.b.d.a.j.Spinner_android_prompt
            java.lang.String r1 = r0.d(r1)
            r11.a(r1)
            r12.a()
            r7.g = r11
            android.support.v7.widget.w$a r12 = new android.support.v7.widget.w$a
            r12.<init>(r7, r7, r11)
            r7.d = r12
        Laa:
            int r11 = b.b.d.a.j.Spinner_android_entries
            java.lang.CharSequence[] r11 = r0.f(r11)
            if (r11 == 0) goto Lc2
            android.widget.ArrayAdapter r12 = new android.widget.ArrayAdapter
            r1 = 17367048(0x1090008, float:2.5162948E-38)
            r12.<init>(r8, r1, r11)
            int r8 = b.b.d.a.g.support_simple_spinner_dropdown_item
            r12.setDropDownViewResource(r8)
            r7.setAdapter(r12)
        Lc2:
            r0.a()
            r7.f = r3
            android.widget.SpinnerAdapter r8 = r7.e
            if (r8 == 0) goto Ld0
            r7.setAdapter(r8)
            r7.e = r2
        Ld0:
            android.support.v7.widget.e r7 = r7.f932b
            r7.a(r9, r10)
            return
    }

    int a(android.widget.SpinnerAdapter r11, android.graphics.drawable.Drawable r12) {
            r10 = this;
            r0 = 0
            if (r11 != 0) goto L4
            return r0
        L4:
            int r1 = r10.getMeasuredWidth()
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r2 = r10.getMeasuredHeight()
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            int r3 = r10.getSelectedItemPosition()
            int r3 = java.lang.Math.max(r0, r3)
            int r4 = r11.getCount()
            int r5 = r3 + 15
            int r4 = java.lang.Math.min(r4, r5)
            int r5 = r4 - r3
            int r5 = 15 - r5
            int r3 = r3 - r5
            int r3 = java.lang.Math.max(r0, r3)
            r5 = 0
            r6 = r3
            r7 = r5
            r3 = r0
        L33:
            if (r6 >= r4) goto L5e
            int r8 = r11.getItemViewType(r6)
            if (r8 == r0) goto L3d
            r7 = r5
            r0 = r8
        L3d:
            android.view.View r7 = r11.getView(r6, r7, r10)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            if (r8 != 0) goto L50
            android.view.ViewGroup$LayoutParams r8 = new android.view.ViewGroup$LayoutParams
            r9 = -2
            r8.<init>(r9, r9)
            r7.setLayoutParams(r8)
        L50:
            r7.measure(r1, r2)
            int r8 = r7.getMeasuredWidth()
            int r3 = java.lang.Math.max(r3, r8)
            int r6 = r6 + 1
            goto L33
        L5e:
            if (r12 == 0) goto L6d
            android.graphics.Rect r11 = r10.i
            r12.getPadding(r11)
            android.graphics.Rect r10 = r10.i
            int r11 = r10.left
            int r10 = r10.right
            int r11 = r11 + r10
            int r3 = r3 + r11
        L6d:
            return r3
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
            r0 = this;
            super.drawableStateChanged()
            android.support.v7.widget.e r0 = r0.f932b
            if (r0 == 0) goto La
            r0.a()
        La:
            return
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
            r2 = this;
            android.support.v7.widget.w$c r0 = r2.g
            if (r0 == 0) goto L9
            int r2 = r0.g()
            return r2
        L9:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L14
            int r2 = super.getDropDownHorizontalOffset()
            return r2
        L14:
            r2 = 0
            return r2
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
            r2 = this;
            android.support.v7.widget.w$c r0 = r2.g
            if (r0 == 0) goto L9
            int r2 = r0.h()
            return r2
        L9:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L14
            int r2 = super.getDropDownVerticalOffset()
            return r2
        L14:
            r2 = 0
            return r2
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
            r2 = this;
            android.support.v7.widget.w$c r0 = r2.g
            if (r0 == 0) goto L7
            int r2 = r2.h
            return r2
        L7:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L12
            int r2 = super.getDropDownWidth()
            return r2
        L12:
            r2 = 0
            return r2
    }

    @Override // android.widget.Spinner
    public android.graphics.drawable.Drawable getPopupBackground() {
            r2 = this;
            android.support.v7.widget.w$c r0 = r2.g
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r2 = r0.f()
            return r2
        L9:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L14
            android.graphics.drawable.Drawable r2 = super.getPopupBackground()
            return r2
        L14:
            r2 = 0
            return r2
    }

    @Override // android.widget.Spinner
    public android.content.Context getPopupContext() {
            r2 = this;
            android.support.v7.widget.w$c r0 = r2.g
            if (r0 == 0) goto L7
            android.content.Context r2 = r2.f933c
            return r2
        L7:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L12
            android.content.Context r2 = super.getPopupContext()
            return r2
        L12:
            r2 = 0
            return r2
    }

    @Override // android.widget.Spinner
    public java.lang.CharSequence getPrompt() {
            r1 = this;
            android.support.v7.widget.w$c r0 = r1.g
            if (r0 == 0) goto L9
            java.lang.CharSequence r1 = r0.m()
            goto Ld
        L9:
            java.lang.CharSequence r1 = super.getPrompt()
        Ld:
            return r1
    }

    @Override // b.b.c.g.p
    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r0 = this;
            android.support.v7.widget.e r0 = r0.f932b
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.b()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // b.b.c.g.p
    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r0 = this;
            android.support.v7.widget.e r0 = r0.f932b
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.c()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            android.support.v7.widget.w$c r0 = r1.g
            if (r0 == 0) goto L12
            boolean r0 = r0.a()
            if (r0 == 0) goto L12
            android.support.v7.widget.w$c r1 = r1.g
            r1.dismiss()
        L12:
            return
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int r3, int r4) {
            r2 = this;
            super.onMeasure(r3, r4)
            android.support.v7.widget.w$c r4 = r2.g
            if (r4 == 0) goto L32
            int r4 = android.view.View.MeasureSpec.getMode(r3)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != r0) goto L32
            int r4 = r2.getMeasuredWidth()
            android.widget.SpinnerAdapter r0 = r2.getAdapter()
            android.graphics.drawable.Drawable r1 = r2.getBackground()
            int r0 = r2.a(r0, r1)
            int r4 = java.lang.Math.max(r4, r0)
            int r3 = android.view.View.MeasureSpec.getSize(r3)
            int r3 = java.lang.Math.min(r4, r3)
            int r4 = r2.getMeasuredHeight()
            r2.setMeasuredDimension(r3, r4)
        L32:
            return
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            android.support.v7.widget.f0 r0 = r1.d
            if (r0 == 0) goto Lc
            boolean r0 = r0.onTouch(r1, r2)
            if (r0 == 0) goto Lc
            r1 = 1
            return r1
        Lc:
            boolean r1 = super.onTouchEvent(r2)
            return r1
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
            r1 = this;
            android.support.v7.widget.w$c r0 = r1.g
            if (r0 == 0) goto L11
            boolean r0 = r0.a()
            if (r0 != 0) goto Lf
            android.support.v7.widget.w$c r1 = r1.g
            r1.c()
        Lf:
            r1 = 1
            return r1
        L11:
            boolean r1 = super.performClick()
            return r1
    }

    @Override // android.widget.AdapterView
    public /* bridge */ /* synthetic */ void setAdapter(android.widget.Adapter r1) {
            r0 = this;
            android.widget.SpinnerAdapter r1 = (android.widget.SpinnerAdapter) r1
            r0.setAdapter(r1)
            return
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner
    public void setAdapter(android.widget.SpinnerAdapter r3) {
            r2 = this;
            boolean r0 = r2.f
            if (r0 != 0) goto L7
            r2.e = r3
            return
        L7:
            super.setAdapter(r3)
            android.support.v7.widget.w$c r0 = r2.g
            if (r0 == 0) goto L24
            android.content.Context r0 = r2.f933c
            if (r0 != 0) goto L16
            android.content.Context r0 = r2.getContext()
        L16:
            android.support.v7.widget.w$c r2 = r2.g
            android.support.v7.widget.w$b r1 = new android.support.v7.widget.w$b
            android.content.res.Resources$Theme r0 = r0.getTheme()
            r1.<init>(r3, r0)
            r2.a(r1)
        L24:
            return
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            android.support.v7.widget.e r0 = r0.f932b
            if (r0 == 0) goto La
            r0.a(r1)
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r1) {
            r0 = this;
            super.setBackgroundResource(r1)
            android.support.v7.widget.e r0 = r0.f932b
            if (r0 == 0) goto La
            r0.a(r1)
        La:
            return
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int r3) {
            r2 = this;
            android.support.v7.widget.w$c r0 = r2.g
            if (r0 == 0) goto L8
            r0.d(r3)
            goto L11
        L8:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L11
            super.setDropDownHorizontalOffset(r3)
        L11:
            return
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int r3) {
            r2 = this;
            android.support.v7.widget.w$c r0 = r2.g
            if (r0 == 0) goto L8
            r0.h(r3)
            goto L11
        L8:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L11
            super.setDropDownVerticalOffset(r3)
        L11:
            return
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int r3) {
            r2 = this;
            android.support.v7.widget.w$c r0 = r2.g
            if (r0 == 0) goto L7
            r2.h = r3
            goto L10
        L7:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L10
            super.setDropDownWidth(r3)
        L10:
            return
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.support.v7.widget.w$c r0 = r2.g
            if (r0 == 0) goto L8
            r0.a(r3)
            goto L11
        L8:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L11
            super.setPopupBackgroundDrawable(r3)
        L11:
            return
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getPopupContext()
            android.graphics.drawable.Drawable r2 = b.b.d.b.a.a.c(r0, r2)
            r1.setPopupBackgroundDrawable(r2)
            return
    }

    @Override // android.widget.Spinner
    public void setPrompt(java.lang.CharSequence r2) {
            r1 = this;
            android.support.v7.widget.w$c r0 = r1.g
            if (r0 == 0) goto L8
            r0.a(r2)
            goto Lb
        L8:
            super.setPrompt(r2)
        Lb:
            return
    }

    @Override // b.b.c.g.p
    public void setSupportBackgroundTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            android.support.v7.widget.e r0 = r0.f932b
            if (r0 == 0) goto L7
            r0.b(r1)
        L7:
            return
    }

    @Override // b.b.c.g.p
    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            android.support.v7.widget.e r0 = r0.f932b
            if (r0 == 0) goto L7
            r0.a(r1)
        L7:
            return
    }
}
