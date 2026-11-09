package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
public class m0 extends android.widget.HorizontalScrollView implements android.widget.AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    java.lang.Runnable f884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.support.v7.widget.m0.c f885c;
    android.support.v7.widget.g0 d;
    private android.widget.Spinner e;
    private boolean f;
    int g;
    int h;
    private int i;
    private int j;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.view.View f886b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.support.v7.widget.m0 f887c;

        a(android.support.v7.widget.m0 r1, android.view.View r2) {
                r0 = this;
                r0.f887c = r1
                r0.f886b = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                android.view.View r0 = r3.f886b
                int r0 = r0.getLeft()
                android.support.v7.widget.m0 r1 = r3.f887c
                int r1 = r1.getWidth()
                android.view.View r2 = r3.f886b
                int r2 = r2.getWidth()
                int r1 = r1 - r2
                int r1 = r1 / 2
                int r0 = r0 - r1
                android.support.v7.widget.m0 r1 = r3.f887c
                r2 = 0
                r1.smoothScrollTo(r0, r2)
                android.support.v7.widget.m0 r3 = r3.f887c
                r0 = 0
                r3.f884b = r0
                return
        }
    }

    private class b extends android.widget.BaseAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.support.v7.widget.m0 f888b;

        b(android.support.v7.widget.m0 r1) {
                r0 = this;
                r0.f888b = r1
                r0.<init>()
                return
        }

        @Override // android.widget.Adapter
        public int getCount() {
                r0 = this;
                android.support.v7.widget.m0 r0 = r0.f888b
                android.support.v7.widget.g0 r0 = r0.d
                int r0 = r0.getChildCount()
                return r0
        }

        @Override // android.widget.Adapter
        public java.lang.Object getItem(int r1) {
                r0 = this;
                android.support.v7.widget.m0 r0 = r0.f888b
                android.support.v7.widget.g0 r0 = r0.d
                android.view.View r0 = r0.getChildAt(r1)
                android.support.v7.widget.m0$d r0 = (android.support.v7.widget.m0.d) r0
                android.support.v7.app.a$c r0 = r0.a()
                return r0
        }

        @Override // android.widget.Adapter
        public long getItemId(int r1) {
                r0 = this;
                long r0 = (long) r1
                return r0
        }

        @Override // android.widget.Adapter
        public android.view.View getView(int r1, android.view.View r2, android.view.ViewGroup r3) {
                r0 = this;
                if (r2 != 0) goto L10
                android.support.v7.widget.m0 r2 = r0.f888b
                java.lang.Object r0 = r0.getItem(r1)
                android.support.v7.app.a$c r0 = (android.support.v7.app.a.c) r0
                r1 = 1
                android.support.v7.widget.m0$d r2 = r2.a(r0, r1)
                goto L1c
            L10:
                r3 = r2
                android.support.v7.widget.m0$d r3 = (android.support.v7.widget.m0.d) r3
                java.lang.Object r0 = r0.getItem(r1)
                android.support.v7.app.a$c r0 = (android.support.v7.app.a.c) r0
                r3.a(r0)
            L1c:
                return r2
        }
    }

    private class c implements android.view.View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.support.v7.widget.m0 f889b;

        c(android.support.v7.widget.m0 r1) {
                r0 = this;
                r0.f889b = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r6) {
                r5 = this;
                r0 = r6
                android.support.v7.widget.m0$d r0 = (android.support.v7.widget.m0.d) r0
                android.support.v7.app.a$c r0 = r0.a()
                r0.e()
                android.support.v7.widget.m0 r0 = r5.f889b
                android.support.v7.widget.g0 r0 = r0.d
                int r0 = r0.getChildCount()
                r1 = 0
                r2 = r1
            L14:
                if (r2 >= r0) goto L29
                android.support.v7.widget.m0 r3 = r5.f889b
                android.support.v7.widget.g0 r3 = r3.d
                android.view.View r3 = r3.getChildAt(r2)
                if (r3 != r6) goto L22
                r4 = 1
                goto L23
            L22:
                r4 = r1
            L23:
                r3.setSelected(r4)
                int r2 = r2 + 1
                goto L14
            L29:
                return
        }
    }

    private class d extends android.widget.LinearLayout {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f890b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private android.support.v7.app.a.c f891c;
        private android.widget.TextView d;
        private android.widget.ImageView e;
        private android.view.View f;
        final /* synthetic */ android.support.v7.widget.m0 g;

        public d(android.support.v7.widget.m0 r4, android.content.Context r5, android.support.v7.app.a.c r6, boolean r7) {
                r3 = this;
                r3.g = r4
                int r4 = b.b.d.a.a.actionBarTabStyle
                r0 = 0
                r3.<init>(r5, r0, r4)
                r4 = 1
                int[] r4 = new int[r4]
                r1 = 16842964(0x10100d4, float:2.3694152E-38)
                r2 = 0
                r4[r2] = r1
                r3.f890b = r4
                r3.f891c = r6
                int r6 = b.b.d.a.a.actionBarTabStyle
                android.support.v7.widget.t0 r4 = android.support.v7.widget.t0.a(r5, r0, r4, r6, r2)
                boolean r5 = r4.g(r2)
                if (r5 == 0) goto L28
                android.graphics.drawable.Drawable r5 = r4.b(r2)
                r3.setBackgroundDrawable(r5)
            L28:
                r4.a()
                if (r7 == 0) goto L33
                r4 = 8388627(0x800013, float:1.175497E-38)
                r3.setGravity(r4)
            L33:
                r3.b()
                return
        }

        public android.support.v7.app.a.c a() {
                r0 = this;
                android.support.v7.app.a$c r0 = r0.f891c
                return r0
        }

        public void a(android.support.v7.app.a.c r1) {
                r0 = this;
                r0.f891c = r1
                r0.b()
                return
        }

        public void b() {
                r10 = this;
                android.support.v7.app.a$c r0 = r10.f891c
                android.view.View r1 = r0.b()
                r2 = 8
                r3 = 0
                if (r1 == 0) goto L32
                android.view.ViewParent r0 = r1.getParent()
                if (r0 == r10) goto L1b
                if (r0 == 0) goto L18
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                r0.removeView(r1)
            L18:
                r10.addView(r1)
            L1b:
                r10.f = r1
                android.widget.TextView r0 = r10.d
                if (r0 == 0) goto L24
                r0.setVisibility(r2)
            L24:
                android.widget.ImageView r0 = r10.e
                if (r0 == 0) goto Ld3
                r0.setVisibility(r2)
                android.widget.ImageView r10 = r10.e
                r10.setImageDrawable(r3)
                goto Ld3
            L32:
                android.view.View r1 = r10.f
                if (r1 == 0) goto L3b
                r10.removeView(r1)
                r10.f = r3
            L3b:
                android.graphics.drawable.Drawable r1 = r0.c()
                java.lang.CharSequence r4 = r0.d()
                r5 = 16
                r6 = 0
                r7 = -2
                if (r1 == 0) goto L70
                android.widget.ImageView r8 = r10.e
                if (r8 != 0) goto L65
                android.support.v7.widget.o r8 = new android.support.v7.widget.o
                android.content.Context r9 = r10.getContext()
                r8.<init>(r9)
                android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
                r9.<init>(r7, r7)
                r9.gravity = r5
                r8.setLayoutParams(r9)
                r10.addView(r8, r6)
                r10.e = r8
            L65:
                android.widget.ImageView r8 = r10.e
                r8.setImageDrawable(r1)
                android.widget.ImageView r1 = r10.e
                r1.setVisibility(r6)
                goto L7c
            L70:
                android.widget.ImageView r1 = r10.e
                if (r1 == 0) goto L7c
                r1.setVisibility(r2)
                android.widget.ImageView r1 = r10.e
                r1.setImageDrawable(r3)
            L7c:
                boolean r1 = android.text.TextUtils.isEmpty(r4)
                r1 = r1 ^ 1
                if (r1 == 0) goto Lb2
                android.widget.TextView r2 = r10.d
                if (r2 != 0) goto La7
                android.support.v7.widget.y r2 = new android.support.v7.widget.y
                android.content.Context r8 = r10.getContext()
                int r9 = b.b.d.a.a.actionBarTabTextStyle
                r2.<init>(r8, r3, r9)
                android.text.TextUtils$TruncateAt r8 = android.text.TextUtils.TruncateAt.END
                r2.setEllipsize(r8)
                android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
                r8.<init>(r7, r7)
                r8.gravity = r5
                r2.setLayoutParams(r8)
                r10.addView(r2)
                r10.d = r2
            La7:
                android.widget.TextView r2 = r10.d
                r2.setText(r4)
                android.widget.TextView r2 = r10.d
                r2.setVisibility(r6)
                goto Lbe
            Lb2:
                android.widget.TextView r4 = r10.d
                if (r4 == 0) goto Lbe
                r4.setVisibility(r2)
                android.widget.TextView r2 = r10.d
                r2.setText(r3)
            Lbe:
                android.widget.ImageView r2 = r10.e
                if (r2 == 0) goto Lc9
                java.lang.CharSequence r4 = r0.a()
                r2.setContentDescription(r4)
            Lc9:
                if (r1 == 0) goto Lcc
                goto Ld0
            Lcc:
                java.lang.CharSequence r3 = r0.a()
            Ld0:
                android.support.v7.widget.v0.a(r10, r3)
            Ld3:
                return
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r1) {
                r0 = this;
                super.onInitializeAccessibilityEvent(r1)
                java.lang.Class<android.support.v7.app.a$c> r0 = android.support.v7.app.a.c.class
                java.lang.String r0 = r0.getName()
                r1.setClassName(r0)
                return
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r1) {
                r0 = this;
                super.onInitializeAccessibilityNodeInfo(r1)
                java.lang.Class<android.support.v7.app.a$c> r0 = android.support.v7.app.a.c.class
                java.lang.String r0 = r0.getName()
                r1.setClassName(r0)
                return
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int r2, int r3) {
                r1 = this;
                super.onMeasure(r2, r3)
                android.support.v7.widget.m0 r2 = r1.g
                int r2 = r2.g
                if (r2 <= 0) goto L1c
                int r2 = r1.getMeasuredWidth()
                android.support.v7.widget.m0 r0 = r1.g
                int r0 = r0.g
                if (r2 <= r0) goto L1c
                r2 = 1073741824(0x40000000, float:2.0)
                int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
                super.onMeasure(r2, r3)
            L1c:
                return
        }

        @Override // android.view.View
        public void setSelected(boolean r2) {
                r1 = this;
                boolean r0 = r1.isSelected()
                if (r0 == r2) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                super.setSelected(r2)
                if (r0 == 0) goto L14
                if (r2 == 0) goto L14
                r2 = 4
                r1.sendAccessibilityEvent(r2)
            L14:
                return
        }
    }

    static {
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            return
    }

    private android.widget.Spinner a() {
            r4 = this;
            android.support.v7.widget.w r0 = new android.support.v7.widget.w
            android.content.Context r1 = r4.getContext()
            int r2 = b.b.d.a.a.actionDropDownStyle
            r3 = 0
            r0.<init>(r1, r3, r2)
            android.support.v7.widget.g0$a r1 = new android.support.v7.widget.g0$a
            r2 = -2
            r3 = -1
            r1.<init>(r2, r3)
            r0.setLayoutParams(r1)
            r0.setOnItemSelectedListener(r4)
            return r0
    }

    private boolean b() {
            r1 = this;
            android.widget.Spinner r0 = r1.e
            if (r0 == 0) goto Lc
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != r1) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            return r1
    }

    private void c() {
            r4 = this;
            boolean r0 = r4.b()
            if (r0 == 0) goto L7
            return
        L7:
            android.widget.Spinner r0 = r4.e
            if (r0 != 0) goto L11
            android.widget.Spinner r0 = r4.a()
            r4.e = r0
        L11:
            android.support.v7.widget.g0 r0 = r4.d
            r4.removeView(r0)
            android.widget.Spinner r0 = r4.e
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r2 = -2
            r3 = -1
            r1.<init>(r2, r3)
            r4.addView(r0, r1)
            android.widget.Spinner r0 = r4.e
            android.widget.SpinnerAdapter r0 = r0.getAdapter()
            if (r0 != 0) goto L34
            android.widget.Spinner r0 = r4.e
            android.support.v7.widget.m0$b r1 = new android.support.v7.widget.m0$b
            r1.<init>(r4)
            r0.setAdapter(r1)
        L34:
            java.lang.Runnable r0 = r4.f884b
            if (r0 == 0) goto L3e
            r4.removeCallbacks(r0)
            r0 = 0
            r4.f884b = r0
        L3e:
            android.widget.Spinner r0 = r4.e
            int r4 = r4.j
            r0.setSelection(r4)
            return
    }

    private boolean d() {
            r5 = this;
            boolean r0 = r5.b()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            android.widget.Spinner r0 = r5.e
            r5.removeView(r0)
            android.support.v7.widget.g0 r0 = r5.d
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r3 = -2
            r4 = -1
            r2.<init>(r3, r4)
            r5.addView(r0, r2)
            android.widget.Spinner r0 = r5.e
            int r0 = r0.getSelectedItemPosition()
            r5.setTabSelected(r0)
            return r1
    }

    android.support.v7.widget.m0.d a(android.support.v7.app.a.c r3, boolean r4) {
            r2 = this;
            android.support.v7.widget.m0$d r0 = new android.support.v7.widget.m0$d
            android.content.Context r1 = r2.getContext()
            r0.<init>(r2, r1, r3, r4)
            if (r4 == 0) goto L1b
            r3 = 0
            r0.setBackgroundDrawable(r3)
            android.widget.AbsListView$LayoutParams r3 = new android.widget.AbsListView$LayoutParams
            r4 = -1
            int r2 = r2.i
            r3.<init>(r4, r2)
            r0.setLayoutParams(r3)
            goto L2f
        L1b:
            r3 = 1
            r0.setFocusable(r3)
            android.support.v7.widget.m0$c r3 = r2.f885c
            if (r3 != 0) goto L2a
            android.support.v7.widget.m0$c r3 = new android.support.v7.widget.m0$c
            r3.<init>(r2)
            r2.f885c = r3
        L2a:
            android.support.v7.widget.m0$c r2 = r2.f885c
            r0.setOnClickListener(r2)
        L2f:
            return r0
    }

    public void a(int r2) {
            r1 = this;
            android.support.v7.widget.g0 r0 = r1.d
            android.view.View r2 = r0.getChildAt(r2)
            java.lang.Runnable r0 = r1.f884b
            if (r0 == 0) goto Ld
            r1.removeCallbacks(r0)
        Ld:
            android.support.v7.widget.m0$a r0 = new android.support.v7.widget.m0$a
            r0.<init>(r1, r2)
            r1.f884b = r0
            r1.post(r0)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            java.lang.Runnable r0 = r1.f884b
            if (r0 == 0) goto La
            r1.post(r0)
        La:
            return
    }

    @Override // android.view.View
    protected void onConfigurationChanged(android.content.res.Configuration r2) {
            r1 = this;
            super.onConfigurationChanged(r2)
            android.content.Context r2 = r1.getContext()
            b.b.d.d.a r2 = b.b.d.d.a.a(r2)
            int r0 = r2.e()
            r1.setContentHeight(r0)
            int r2 = r2.d()
            r1.h = r2
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            java.lang.Runnable r0 = r1.f884b
            if (r0 == 0) goto La
            r1.removeCallbacks(r0)
        La:
            return
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            android.support.v7.widget.m0$d r2 = (android.support.v7.widget.m0.d) r2
            android.support.v7.app.a$c r0 = r2.a()
            r0.e()
            return
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int r7, int r8) {
            r6 = this;
            int r8 = android.view.View.MeasureSpec.getMode(r7)
            r0 = 1
            r1 = 0
            r2 = 1073741824(0x40000000, float:2.0)
            if (r8 != r2) goto Lc
            r3 = r0
            goto Ld
        Lc:
            r3 = r1
        Ld:
            r6.setFillViewport(r3)
            android.support.v7.widget.g0 r4 = r6.d
            int r4 = r4.getChildCount()
            if (r4 <= r0) goto L3e
            if (r8 == r2) goto L1e
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 != r5) goto L3e
        L1e:
            r8 = 2
            if (r4 <= r8) goto L2e
            int r8 = android.view.View.MeasureSpec.getSize(r7)
            float r8 = (float) r8
            r4 = 1053609165(0x3ecccccd, float:0.4)
            float r8 = r8 * r4
            int r8 = (int) r8
            r6.g = r8
            goto L35
        L2e:
            int r4 = android.view.View.MeasureSpec.getSize(r7)
            int r4 = r4 / r8
            r6.g = r4
        L35:
            int r8 = r6.g
            int r4 = r6.h
            int r8 = java.lang.Math.min(r8, r4)
            goto L3f
        L3e:
            r8 = -1
        L3f:
            r6.g = r8
            int r8 = r6.i
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r2)
            if (r3 != 0) goto L4e
            boolean r2 = r6.f
            if (r2 == 0) goto L4e
            goto L4f
        L4e:
            r0 = r1
        L4f:
            if (r0 == 0) goto L66
            android.support.v7.widget.g0 r0 = r6.d
            r0.measure(r1, r8)
            android.support.v7.widget.g0 r0 = r6.d
            int r0 = r0.getMeasuredWidth()
            int r1 = android.view.View.MeasureSpec.getSize(r7)
            if (r0 <= r1) goto L66
            r6.c()
            goto L69
        L66:
            r6.d()
        L69:
            int r0 = r6.getMeasuredWidth()
            super.onMeasure(r7, r8)
            int r7 = r6.getMeasuredWidth()
            if (r3 == 0) goto L7d
            if (r0 == r7) goto L7d
            int r7 = r6.j
            r6.setTabSelected(r7)
        L7d:
            return
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(android.widget.AdapterView<?> r1) {
            r0 = this;
            return
    }

    public void setAllowCollapse(boolean r1) {
            r0 = this;
            r0.f = r1
            return
    }

    public void setContentHeight(int r1) {
            r0 = this;
            r0.i = r1
            r0.requestLayout()
            return
    }

    public void setTabSelected(int r6) {
            r5 = this;
            r5.j = r6
            android.support.v7.widget.g0 r0 = r5.d
            int r0 = r0.getChildCount()
            r1 = 0
            r2 = r1
        La:
            if (r2 >= r0) goto L22
            android.support.v7.widget.g0 r3 = r5.d
            android.view.View r3 = r3.getChildAt(r2)
            if (r2 != r6) goto L16
            r4 = 1
            goto L17
        L16:
            r4 = r1
        L17:
            r3.setSelected(r4)
            if (r4 == 0) goto L1f
            r5.a(r6)
        L1f:
            int r2 = r2 + 1
            goto La
        L22:
            android.widget.Spinner r5 = r5.e
            if (r5 == 0) goto L2b
            if (r6 < 0) goto L2b
            r5.setSelection(r6)
        L2b:
            return
    }
}
