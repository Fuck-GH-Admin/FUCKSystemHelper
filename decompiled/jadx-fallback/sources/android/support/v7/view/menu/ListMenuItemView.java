package android.support.v7.view.menu;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends android.widget.LinearLayout implements android.support.v7.view.menu.p.a, android.widget.AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.support.v7.view.menu.j f738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.widget.ImageView f739c;
    private android.widget.RadioButton d;
    private android.widget.TextView e;
    private android.widget.CheckBox f;
    private android.widget.TextView g;
    private android.widget.ImageView h;
    private android.widget.ImageView i;
    private android.widget.LinearLayout j;
    private android.graphics.drawable.Drawable k;
    private int l;
    private android.content.Context m;
    private boolean n;
    private android.graphics.drawable.Drawable o;
    private boolean p;
    private android.view.LayoutInflater q;
    private boolean r;

    public ListMenuItemView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = b.b.d.a.a.listMenuViewStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public ListMenuItemView(android.content.Context r4, android.util.AttributeSet r5, int r6) {
            r3 = this;
            r3.<init>(r4, r5)
            android.content.Context r0 = r3.getContext()
            int[] r1 = b.b.d.a.j.MenuView
            r2 = 0
            android.support.v7.widget.t0 r5 = android.support.v7.widget.t0.a(r0, r5, r1, r6, r2)
            int r6 = b.b.d.a.j.MenuView_android_itemBackground
            android.graphics.drawable.Drawable r6 = r5.b(r6)
            r3.k = r6
            int r6 = b.b.d.a.j.MenuView_android_itemTextAppearance
            r0 = -1
            int r6 = r5.g(r6, r0)
            r3.l = r6
            int r6 = b.b.d.a.j.MenuView_preserveIconSpacing
            boolean r6 = r5.a(r6, r2)
            r3.n = r6
            r3.m = r4
            int r6 = b.b.d.a.j.MenuView_subMenuArrow
            android.graphics.drawable.Drawable r6 = r5.b(r6)
            r3.o = r6
            android.content.res.Resources$Theme r4 = r4.getTheme()
            r6 = 1
            int[] r6 = new int[r6]
            r0 = 16843049(0x1010129, float:2.369439E-38)
            r6[r2] = r0
            int r0 = b.b.d.a.a.dropDownListViewStyle
            r1 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r1, r6, r0, r2)
            boolean r6 = r4.hasValue(r2)
            r3.p = r6
            r5.a()
            r4.recycle()
            return
    }

    private void a() {
            r3 = this;
            android.view.LayoutInflater r0 = r3.getInflater()
            int r1 = b.b.d.a.g.abc_list_menu_item_checkbox
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            android.widget.CheckBox r0 = (android.widget.CheckBox) r0
            r3.f = r0
            r3.a(r0)
            return
    }

    private void a(android.view.View r2) {
            r1 = this;
            r0 = -1
            r1.a(r2, r0)
            return
    }

    private void a(android.view.View r2, int r3) {
            r1 = this;
            android.widget.LinearLayout r0 = r1.j
            if (r0 == 0) goto L8
            r0.addView(r2, r3)
            goto Lb
        L8:
            r1.addView(r2, r3)
        Lb:
            return
    }

    private void b() {
            r3 = this;
            android.view.LayoutInflater r0 = r3.getInflater()
            int r1 = b.b.d.a.g.abc_list_menu_item_icon
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.f739c = r0
            r3.a(r0, r2)
            return
    }

    private void d() {
            r3 = this;
            android.view.LayoutInflater r0 = r3.getInflater()
            int r1 = b.b.d.a.g.abc_list_menu_item_radio
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            r3.d = r0
            r3.a(r0)
            return
    }

    private android.view.LayoutInflater getInflater() {
            r1 = this;
            android.view.LayoutInflater r0 = r1.q
            if (r0 != 0) goto Le
            android.content.Context r0 = r1.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1.q = r0
        Le:
            android.view.LayoutInflater r1 = r1.q
            return r1
    }

    private void setSubMenuArrowVisible(boolean r1) {
            r0 = this;
            android.widget.ImageView r0 = r0.h
            if (r0 == 0) goto Ld
            if (r1 == 0) goto L8
            r1 = 0
            goto La
        L8:
            r1 = 8
        La:
            r0.setVisibility(r1)
        Ld:
            return
    }

    @Override // android.support.v7.view.menu.p.a
    public void a(android.support.v7.view.menu.j r2, int r3) {
            r1 = this;
            r1.f738b = r2
            boolean r3 = r2.isVisible()
            if (r3 == 0) goto La
            r3 = 0
            goto Lc
        La:
            r3 = 8
        Lc:
            r1.setVisibility(r3)
            java.lang.CharSequence r3 = r2.a(r1)
            r1.setTitle(r3)
            boolean r3 = r2.isCheckable()
            r1.setCheckable(r3)
            boolean r3 = r2.m()
            char r0 = r2.d()
            r1.a(r3, r0)
            android.graphics.drawable.Drawable r3 = r2.getIcon()
            r1.setIcon(r3)
            boolean r3 = r2.isEnabled()
            r1.setEnabled(r3)
            boolean r3 = r2.hasSubMenu()
            r1.setSubMenuArrowVisible(r3)
            java.lang.CharSequence r2 = r2.getContentDescription()
            r1.setContentDescription(r2)
            return
    }

    public void a(boolean r2, char r3) {
            r1 = this;
            if (r2 == 0) goto Lc
            android.support.v7.view.menu.j r2 = r1.f738b
            boolean r2 = r2.m()
            if (r2 == 0) goto Lc
            r2 = 0
            goto Le
        Lc:
            r2 = 8
        Le:
            if (r2 != 0) goto L1b
            android.widget.TextView r3 = r1.g
            android.support.v7.view.menu.j r0 = r1.f738b
            java.lang.String r0 = r0.e()
            r3.setText(r0)
        L1b:
            android.widget.TextView r3 = r1.g
            int r3 = r3.getVisibility()
            if (r3 == r2) goto L28
            android.widget.TextView r1 = r1.g
            r1.setVisibility(r2)
        L28:
            return
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(android.graphics.Rect r4) {
            r3 = this;
            android.widget.ImageView r0 = r3.i
            if (r0 == 0) goto L23
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L23
            android.widget.ImageView r0 = r3.i
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r1 = r4.top
            android.widget.ImageView r3 = r3.i
            int r3 = r3.getHeight()
            int r2 = r0.topMargin
            int r3 = r3 + r2
            int r0 = r0.bottomMargin
            int r3 = r3 + r0
            int r1 = r1 + r3
            r4.top = r1
        L23:
            return
    }

    @Override // android.support.v7.view.menu.p.a
    public boolean c() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.support.v7.view.menu.p.a
    public android.support.v7.view.menu.j getItemData() {
            r0 = this;
            android.support.v7.view.menu.j r0 = r0.f738b
            return r0
    }

    @Override // android.view.View
    protected void onFinishInflate() {
            r3 = this;
            super.onFinishInflate()
            android.graphics.drawable.Drawable r0 = r3.k
            b.b.c.g.q.a(r3, r0)
            int r0 = b.b.d.a.f.title
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.e = r0
            int r1 = r3.l
            r2 = -1
            if (r1 == r2) goto L1c
            android.content.Context r2 = r3.m
            r0.setTextAppearance(r2, r1)
        L1c:
            int r0 = b.b.d.a.f.shortcut
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.g = r0
            int r0 = b.b.d.a.f.submenuarrow
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.h = r0
            if (r0 == 0) goto L37
            android.graphics.drawable.Drawable r1 = r3.o
            r0.setImageDrawable(r1)
        L37:
            int r0 = b.b.d.a.f.group_divider
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.i = r0
            int r0 = b.b.d.a.f.content
            android.view.View r0 = r3.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r3.j = r0
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int r4, int r5) {
            r3 = this;
            android.widget.ImageView r0 = r3.f739c
            if (r0 == 0) goto L1e
            boolean r0 = r3.n
            if (r0 == 0) goto L1e
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            android.widget.ImageView r1 = r3.f739c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            int r0 = r0.height
            if (r0 <= 0) goto L1e
            int r2 = r1.width
            if (r2 > 0) goto L1e
            r1.width = r0
        L1e:
            super.onMeasure(r4, r5)
            return
    }

    public void setCheckable(boolean r4) {
            r3 = this;
            if (r4 != 0) goto Lb
            android.widget.RadioButton r0 = r3.d
            if (r0 != 0) goto Lb
            android.widget.CheckBox r0 = r3.f
            if (r0 != 0) goto Lb
            return
        Lb:
            android.support.v7.view.menu.j r0 = r3.f738b
            boolean r0 = r0.i()
            if (r0 == 0) goto L1f
            android.widget.RadioButton r0 = r3.d
            if (r0 != 0) goto L1a
            r3.d()
        L1a:
            android.widget.RadioButton r0 = r3.d
            android.widget.CheckBox r1 = r3.f
            goto L2a
        L1f:
            android.widget.CheckBox r0 = r3.f
            if (r0 != 0) goto L26
            r3.a()
        L26:
            android.widget.CheckBox r0 = r3.f
            android.widget.RadioButton r1 = r3.d
        L2a:
            r2 = 8
            if (r4 == 0) goto L4d
            android.support.v7.view.menu.j r3 = r3.f738b
            boolean r3 = r3.isChecked()
            r0.setChecked(r3)
            int r3 = r0.getVisibility()
            if (r3 == 0) goto L41
            r3 = 0
            r0.setVisibility(r3)
        L41:
            if (r1 == 0) goto L5b
            int r3 = r1.getVisibility()
            if (r3 == r2) goto L5b
            r1.setVisibility(r2)
            goto L5b
        L4d:
            android.widget.CheckBox r4 = r3.f
            if (r4 == 0) goto L54
            r4.setVisibility(r2)
        L54:
            android.widget.RadioButton r3 = r3.d
            if (r3 == 0) goto L5b
            r3.setVisibility(r2)
        L5b:
            return
    }

    public void setChecked(boolean r2) {
            r1 = this;
            android.support.v7.view.menu.j r0 = r1.f738b
            boolean r0 = r0.i()
            if (r0 == 0) goto L12
            android.widget.RadioButton r0 = r1.d
            if (r0 != 0) goto Lf
            r1.d()
        Lf:
            android.widget.RadioButton r1 = r1.d
            goto L1b
        L12:
            android.widget.CheckBox r0 = r1.f
            if (r0 != 0) goto L19
            r1.a()
        L19:
            android.widget.CheckBox r1 = r1.f
        L1b:
            r1.setChecked(r2)
            return
    }

    public void setForceShowIcon(boolean r1) {
            r0 = this;
            r0.r = r1
            r0.n = r1
            return
    }

    public void setGroupDividerEnabled(boolean r2) {
            r1 = this;
            android.widget.ImageView r0 = r1.i
            if (r0 == 0) goto L11
            boolean r1 = r1.p
            if (r1 != 0) goto Lc
            if (r2 == 0) goto Lc
            r1 = 0
            goto Le
        Lc:
            r1 = 8
        Le:
            r0.setVisibility(r1)
        L11:
            return
    }

    public void setIcon(android.graphics.drawable.Drawable r4) {
            r3 = this;
            android.support.v7.view.menu.j r0 = r3.f738b
            boolean r0 = r0.l()
            r1 = 0
            if (r0 != 0) goto L10
            boolean r0 = r3.r
            if (r0 == 0) goto Le
            goto L10
        Le:
            r0 = r1
            goto L11
        L10:
            r0 = 1
        L11:
            if (r0 != 0) goto L18
            boolean r2 = r3.n
            if (r2 != 0) goto L18
            return
        L18:
            android.widget.ImageView r2 = r3.f739c
            if (r2 != 0) goto L23
            if (r4 != 0) goto L23
            boolean r2 = r3.n
            if (r2 != 0) goto L23
            return
        L23:
            android.widget.ImageView r2 = r3.f739c
            if (r2 != 0) goto L2a
            r3.b()
        L2a:
            if (r4 != 0) goto L39
            boolean r2 = r3.n
            if (r2 == 0) goto L31
            goto L39
        L31:
            android.widget.ImageView r3 = r3.f739c
            r4 = 8
            r3.setVisibility(r4)
            goto L4f
        L39:
            android.widget.ImageView r2 = r3.f739c
            if (r0 == 0) goto L3e
            goto L3f
        L3e:
            r4 = 0
        L3f:
            r2.setImageDrawable(r4)
            android.widget.ImageView r4 = r3.f739c
            int r4 = r4.getVisibility()
            if (r4 == 0) goto L4f
            android.widget.ImageView r3 = r3.f739c
            r3.setVisibility(r1)
        L4f:
            return
    }

    public void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            if (r2 == 0) goto L16
            android.widget.TextView r0 = r1.e
            r0.setText(r2)
            android.widget.TextView r2 = r1.e
            int r2 = r2.getVisibility()
            if (r2 == 0) goto L25
            android.widget.TextView r1 = r1.e
            r2 = 0
            r1.setVisibility(r2)
            goto L25
        L16:
            android.widget.TextView r2 = r1.e
            int r2 = r2.getVisibility()
            r0 = 8
            if (r2 == r0) goto L25
            android.widget.TextView r1 = r1.e
            r1.setVisibility(r0)
        L25:
            return
    }
}
