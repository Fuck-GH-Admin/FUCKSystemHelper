package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends android.support.v7.widget.a {
    private java.lang.CharSequence j;
    private java.lang.CharSequence k;
    private android.view.View l;
    private android.view.View m;
    private android.widget.LinearLayout n;
    private android.widget.TextView o;
    private android.widget.TextView p;
    private int q;
    private int r;
    private boolean s;
    private int t;

    class a implements android.view.View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b.b.d.d.b f787b;

        a(android.support.v7.widget.ActionBarContextView r1, b.b.d.d.b r2) {
                r0 = this;
                r0.f787b = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                b.b.d.d.b r0 = r0.f787b
                r0.a()
                return
        }
    }

    public ActionBarContextView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ActionBarContextView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = b.b.d.a.a.actionModeStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public ActionBarContextView(android.content.Context r3, android.util.AttributeSet r4, int r5) {
            r2 = this;
            r2.<init>(r3, r4, r5)
            int[] r0 = b.b.d.a.j.ActionMode
            r1 = 0
            android.support.v7.widget.t0 r3 = android.support.v7.widget.t0.a(r3, r4, r0, r5, r1)
            int r4 = b.b.d.a.j.ActionMode_background
            android.graphics.drawable.Drawable r4 = r3.b(r4)
            b.b.c.g.q.a(r2, r4)
            int r4 = b.b.d.a.j.ActionMode_titleTextStyle
            int r4 = r3.g(r4, r1)
            r2.q = r4
            int r4 = b.b.d.a.j.ActionMode_subtitleTextStyle
            int r4 = r3.g(r4, r1)
            r2.r = r4
            int r4 = b.b.d.a.j.ActionMode_height
            int r4 = r3.f(r4, r1)
            r2.f = r4
            int r4 = b.b.d.a.j.ActionMode_closeItemLayout
            int r5 = b.b.d.a.g.abc_action_mode_close_item_material
            int r4 = r3.g(r4, r5)
            r2.t = r4
            r3.a()
            return
    }

    private void e() {
            r6 = this;
            android.widget.LinearLayout r0 = r6.n
            if (r0 != 0) goto L53
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = b.b.d.a.g.abc_action_bar_title_item
            r0.inflate(r1, r6)
            int r0 = r6.getChildCount()
            int r0 = r0 + (-1)
            android.view.View r0 = r6.getChildAt(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r6.n = r0
            int r1 = b.b.d.a.f.action_bar_title
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.o = r0
            android.widget.LinearLayout r0 = r6.n
            int r1 = b.b.d.a.f.action_bar_subtitle
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.p = r0
            int r0 = r6.q
            if (r0 == 0) goto L44
            android.widget.TextView r0 = r6.o
            android.content.Context r1 = r6.getContext()
            int r2 = r6.q
            r0.setTextAppearance(r1, r2)
        L44:
            int r0 = r6.r
            if (r0 == 0) goto L53
            android.widget.TextView r0 = r6.p
            android.content.Context r1 = r6.getContext()
            int r2 = r6.r
            r0.setTextAppearance(r1, r2)
        L53:
            android.widget.TextView r0 = r6.o
            java.lang.CharSequence r1 = r6.j
            r0.setText(r1)
            android.widget.TextView r0 = r6.p
            java.lang.CharSequence r1 = r6.k
            r0.setText(r1)
            java.lang.CharSequence r0 = r6.j
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            java.lang.CharSequence r1 = r6.k
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r1 = r1 ^ 1
            android.widget.TextView r2 = r6.p
            r3 = 0
            r4 = 8
            if (r1 == 0) goto L7a
            r5 = r3
            goto L7b
        L7a:
            r5 = r4
        L7b:
            r2.setVisibility(r5)
            android.widget.LinearLayout r2 = r6.n
            if (r0 != 0) goto L86
            if (r1 == 0) goto L85
            goto L86
        L85:
            r3 = r4
        L86:
            r2.setVisibility(r3)
            android.widget.LinearLayout r0 = r6.n
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L96
            android.widget.LinearLayout r0 = r6.n
            r6.addView(r0)
        L96:
            return
    }

    public void a() {
            r1 = this;
            android.view.View r0 = r1.l
            if (r0 != 0) goto L7
            r1.c()
        L7:
            return
    }

    public void a(b.b.d.d.b r4) {
            r3 = this;
            android.view.View r0 = r3.l
            if (r0 != 0) goto L19
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.t
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            r3.l = r0
        L15:
            r3.addView(r0)
            goto L22
        L19:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L22
            android.view.View r0 = r3.l
            goto L15
        L22:
            android.view.View r0 = r3.l
            int r1 = b.b.d.a.f.action_mode_close_button
            android.view.View r0 = r0.findViewById(r1)
            android.support.v7.widget.ActionBarContextView$a r1 = new android.support.v7.widget.ActionBarContextView$a
            r1.<init>(r3, r4)
            r0.setOnClickListener(r1)
            android.view.Menu r4 = r4.c()
            android.support.v7.view.menu.h r4 = (android.support.v7.view.menu.h) r4
            android.support.v7.widget.c r0 = r3.e
            if (r0 == 0) goto L3f
            r0.b()
        L3f:
            android.support.v7.widget.c r0 = new android.support.v7.widget.c
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.e = r0
            r1 = 1
            r0.c(r1)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            android.support.v7.widget.c r1 = r3.e
            android.content.Context r2 = r3.f830c
            r4.a(r1, r2)
            android.support.v7.widget.c r4 = r3.e
            android.support.v7.view.menu.p r4 = r4.b(r3)
            android.support.v7.widget.ActionMenuView r4 = (android.support.v7.widget.ActionMenuView) r4
            r3.d = r4
            r1 = 0
            b.b.c.g.q.a(r4, r1)
            android.support.v7.widget.ActionMenuView r4 = r3.d
            r3.addView(r4, r0)
            return
    }

    public boolean b() {
            r0 = this;
            boolean r0 = r0.s
            return r0
    }

    public void c() {
            r1 = this;
            r1.removeAllViews()
            r0 = 0
            r1.m = r0
            r1.d = r0
            return
    }

    public boolean d() {
            r0 = this;
            android.support.v7.widget.c r0 = r0.e
            if (r0 == 0) goto L9
            boolean r0 = r0.i()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r2 = this;
            android.view.ViewGroup$MarginLayoutParams r2 = new android.view.ViewGroup$MarginLayoutParams
            r0 = -1
            r1 = -2
            r2.<init>(r0, r1)
            return r2
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r2) {
            r1 = this;
            android.view.ViewGroup$MarginLayoutParams r0 = new android.view.ViewGroup$MarginLayoutParams
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1, r2)
            return r0
    }

    @Override // android.support.v7.widget.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
            r0 = this;
            int r0 = super.getAnimatedVisibility()
            return r0
    }

    @Override // android.support.v7.widget.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
            r0 = this;
            int r0 = super.getContentHeight()
            return r0
    }

    public java.lang.CharSequence getSubtitle() {
            r0 = this;
            java.lang.CharSequence r0 = r0.k
            return r0
    }

    public java.lang.CharSequence getTitle() {
            r0 = this;
            java.lang.CharSequence r0 = r0.j
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            android.support.v7.widget.c r0 = r1.e
            if (r0 == 0) goto Lf
            r0.e()
            android.support.v7.widget.c r1 = r1.e
            r1.f()
        Lf:
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r3) {
            r2 = this;
            int r0 = r3.getEventType()
            r1 = 32
            if (r0 != r1) goto L25
            r3.setSource(r2)
            java.lang.Class<android.support.v7.widget.ActionBarContextView> r0 = android.support.v7.widget.ActionBarContextView.class
            java.lang.String r0 = r0.getName()
            r3.setClassName(r0)
            android.content.Context r0 = r2.getContext()
            java.lang.String r0 = r0.getPackageName()
            r3.setPackageName(r0)
            java.lang.CharSequence r2 = r2.j
            r3.setContentDescription(r2)
            goto L28
        L25:
            super.onInitializeAccessibilityEvent(r3)
        L28:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
            r9 = this;
            boolean r10 = android.support.v7.widget.z0.a(r9)
            if (r10 == 0) goto Le
            int r0 = r13 - r11
            int r1 = r9.getPaddingRight()
            int r0 = r0 - r1
            goto L12
        Le:
            int r0 = r9.getPaddingLeft()
        L12:
            int r6 = r9.getPaddingTop()
            int r14 = r14 - r12
            int r12 = r9.getPaddingTop()
            int r14 = r14 - r12
            int r12 = r9.getPaddingBottom()
            int r12 = r14 - r12
            android.view.View r14 = r9.l
            r7 = 8
            if (r14 == 0) goto L58
            int r14 = r14.getVisibility()
            if (r14 == r7) goto L58
            android.view.View r14 = r9.l
            android.view.ViewGroup$LayoutParams r14 = r14.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r14 = (android.view.ViewGroup.MarginLayoutParams) r14
            if (r10 == 0) goto L3b
            int r1 = r14.rightMargin
            goto L3d
        L3b:
            int r1 = r14.leftMargin
        L3d:
            if (r10 == 0) goto L42
            int r14 = r14.leftMargin
            goto L44
        L42:
            int r14 = r14.rightMargin
        L44:
            int r8 = android.support.v7.widget.a.a(r0, r1, r10)
            android.view.View r1 = r9.l
            r0 = r9
            r2 = r8
            r3 = r6
            r4 = r12
            r5 = r10
            int r0 = r0.a(r1, r2, r3, r4, r5)
            int r8 = r8 + r0
            int r0 = android.support.v7.widget.a.a(r8, r14, r10)
        L58:
            r14 = r0
            android.widget.LinearLayout r0 = r9.n
            if (r0 == 0) goto L73
            android.view.View r1 = r9.m
            if (r1 != 0) goto L73
            int r0 = r0.getVisibility()
            if (r0 == r7) goto L73
            android.widget.LinearLayout r1 = r9.n
            r0 = r9
            r2 = r14
            r3 = r6
            r4 = r12
            r5 = r10
            int r0 = r0.a(r1, r2, r3, r4, r5)
            int r14 = r14 + r0
        L73:
            r2 = r14
            android.view.View r1 = r9.m
            if (r1 == 0) goto L7f
            r0 = r9
            r3 = r6
            r4 = r12
            r5 = r10
            r0.a(r1, r2, r3, r4, r5)
        L7f:
            if (r10 == 0) goto L87
            int r11 = r9.getPaddingLeft()
            r3 = r11
            goto L8e
        L87:
            int r13 = r13 - r11
            int r11 = r9.getPaddingRight()
            int r13 = r13 - r11
            r3 = r13
        L8e:
            android.support.v7.widget.ActionMenuView r2 = r9.d
            if (r2 == 0) goto L9b
            r10 = r10 ^ 1
            r1 = r9
            r4 = r6
            r5 = r12
            r6 = r10
            r1.a(r2, r3, r4, r5, r6)
        L9b:
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r11, int r12) {
            r10 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r11)
            java.lang.String r1 = " can only be used "
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L108
            int r0 = android.view.View.MeasureSpec.getMode(r12)
            if (r0 == 0) goto Le8
            int r11 = android.view.View.MeasureSpec.getSize(r11)
            int r0 = r10.f
            if (r0 <= 0) goto L19
            goto L1d
        L19:
            int r0 = android.view.View.MeasureSpec.getSize(r12)
        L1d:
            int r12 = r10.getPaddingTop()
            int r1 = r10.getPaddingBottom()
            int r12 = r12 + r1
            int r1 = r10.getPaddingLeft()
            int r1 = r11 - r1
            int r3 = r10.getPaddingRight()
            int r1 = r1 - r3
            int r3 = r0 - r12
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r4)
            android.view.View r6 = r10.l
            r7 = 0
            if (r6 == 0) goto L50
            int r1 = r10.a(r6, r1, r5, r7)
            android.view.View r6 = r10.l
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r8 = r6.leftMargin
            int r6 = r6.rightMargin
            int r8 = r8 + r6
            int r1 = r1 - r8
        L50:
            android.support.v7.widget.ActionMenuView r6 = r10.d
            if (r6 == 0) goto L60
            android.view.ViewParent r6 = r6.getParent()
            if (r6 != r10) goto L60
            android.support.v7.widget.ActionMenuView r6 = r10.d
            int r1 = r10.a(r6, r1, r5, r7)
        L60:
            android.widget.LinearLayout r6 = r10.n
            if (r6 == 0) goto L93
            android.view.View r8 = r10.m
            if (r8 != 0) goto L93
            boolean r8 = r10.s
            if (r8 == 0) goto L8f
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r7)
            android.widget.LinearLayout r8 = r10.n
            r8.measure(r6, r5)
            android.widget.LinearLayout r5 = r10.n
            int r5 = r5.getMeasuredWidth()
            if (r5 > r1) goto L7f
            r6 = 1
            goto L80
        L7f:
            r6 = r7
        L80:
            if (r6 == 0) goto L83
            int r1 = r1 - r5
        L83:
            android.widget.LinearLayout r5 = r10.n
            if (r6 == 0) goto L89
            r6 = r7
            goto L8b
        L89:
            r6 = 8
        L8b:
            r5.setVisibility(r6)
            goto L93
        L8f:
            int r1 = r10.a(r6, r1, r5, r7)
        L93:
            android.view.View r5 = r10.m
            if (r5 == 0) goto Lc6
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            int r6 = r5.width
            r8 = -2
            if (r6 == r8) goto La2
            r6 = r2
            goto La3
        La2:
            r6 = r4
        La3:
            int r9 = r5.width
            if (r9 < 0) goto Lab
            int r1 = java.lang.Math.min(r9, r1)
        Lab:
            int r9 = r5.height
            if (r9 == r8) goto Lb0
            goto Lb1
        Lb0:
            r2 = r4
        Lb1:
            int r4 = r5.height
            if (r4 < 0) goto Lb9
            int r3 = java.lang.Math.min(r4, r3)
        Lb9:
            android.view.View r4 = r10.m
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r6)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            r4.measure(r1, r2)
        Lc6:
            int r1 = r10.f
            if (r1 > 0) goto Le4
            int r0 = r10.getChildCount()
            r1 = r7
        Lcf:
            if (r7 >= r0) goto Le0
            android.view.View r2 = r10.getChildAt(r7)
            int r2 = r2.getMeasuredHeight()
            int r2 = r2 + r12
            if (r2 <= r1) goto Ldd
            r1 = r2
        Ldd:
            int r7 = r7 + 1
            goto Lcf
        Le0:
            r10.setMeasuredDimension(r11, r1)
            goto Le7
        Le4:
            r10.setMeasuredDimension(r11, r0)
        Le7:
            return
        Le8:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.Class<android.support.v7.widget.ActionBarContextView> r12 = android.support.v7.widget.ActionBarContextView.class
            java.lang.String r12 = r12.getSimpleName()
            r11.append(r12)
            r11.append(r1)
            java.lang.String r12 = "with android:layout_height=\"wrap_content\""
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L108:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.Class<android.support.v7.widget.ActionBarContextView> r12 = android.support.v7.widget.ActionBarContextView.class
            java.lang.String r12 = r12.getSimpleName()
            r11.append(r12)
            r11.append(r1)
            java.lang.String r12 = "with android:layout_width=\"match_parent\" (or fill_parent)"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
    }

    @Override // android.support.v7.widget.a
    public void setContentHeight(int r1) {
            r0 = this;
            r0.f = r1
            return
    }

    public void setCustomView(android.view.View r2) {
            r1 = this;
            android.view.View r0 = r1.m
            if (r0 == 0) goto L7
            r1.removeView(r0)
        L7:
            r1.m = r2
            if (r2 == 0) goto L15
            android.widget.LinearLayout r0 = r1.n
            if (r0 == 0) goto L15
            r1.removeView(r0)
            r0 = 0
            r1.n = r0
        L15:
            if (r2 == 0) goto L1a
            r1.addView(r2)
        L1a:
            r1.requestLayout()
            return
    }

    public void setSubtitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.k = r1
            r0.e()
            return
    }

    public void setTitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.j = r1
            r0.e()
            return
    }

    public void setTitleOptional(boolean r2) {
            r1 = this;
            boolean r0 = r1.s
            if (r2 == r0) goto L7
            r1.requestLayout()
        L7:
            r1.s = r2
            return
    }

    @Override // android.support.v7.widget.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int r1) {
            r0 = this;
            super.setVisibility(r1)
            return
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
            r0 = this;
            r0 = 0
            return r0
    }
}
