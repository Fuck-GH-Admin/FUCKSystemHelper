package android.support.v7.view.menu;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends android.support.v7.widget.y implements android.support.v7.view.menu.p.a, android.view.View.OnClickListener, android.support.v7.widget.ActionMenuView.a {
    android.support.v7.view.menu.j e;
    private java.lang.CharSequence f;
    private android.graphics.drawable.Drawable g;
    android.support.v7.view.menu.h.b h;
    private android.support.v7.widget.f0 i;
    android.support.v7.view.menu.ActionMenuItemView.b j;
    private boolean k;
    private boolean l;
    private int m;
    private int n;
    private int o;

    private class a extends android.support.v7.widget.f0 {
        final /* synthetic */ android.support.v7.view.menu.ActionMenuItemView k;

        public a(android.support.v7.view.menu.ActionMenuItemView r1) {
                r0 = this;
                r0.k = r1
                r0.<init>(r1)
                return
        }

        @Override // android.support.v7.widget.f0
        public android.support.v7.view.menu.s a() {
                r0 = this;
                android.support.v7.view.menu.ActionMenuItemView r0 = r0.k
                android.support.v7.view.menu.ActionMenuItemView$b r0 = r0.j
                if (r0 == 0) goto Lb
                android.support.v7.view.menu.s r0 = r0.a()
                return r0
            Lb:
                r0 = 0
                return r0
        }

        @Override // android.support.v7.widget.f0
        protected boolean b() {
                r3 = this;
                android.support.v7.view.menu.ActionMenuItemView r0 = r3.k
                android.support.v7.view.menu.h$b r1 = r0.h
                r2 = 0
                if (r1 == 0) goto L1c
                android.support.v7.view.menu.j r0 = r0.e
                boolean r0 = r1.a(r0)
                if (r0 == 0) goto L1c
                android.support.v7.view.menu.s r3 = r3.a()
                if (r3 == 0) goto L1c
                boolean r3 = r3.a()
                if (r3 == 0) goto L1c
                r2 = 1
            L1c:
                return r2
        }
    }

    public static abstract class b {
        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract android.support.v7.view.menu.s a();
    }

    public ActionMenuItemView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ActionMenuItemView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public ActionMenuItemView(android.content.Context r4, android.util.AttributeSet r5, int r6) {
            r3 = this;
            r3.<init>(r4, r5, r6)
            android.content.res.Resources r0 = r4.getResources()
            boolean r1 = r3.e()
            r3.k = r1
            int[] r1 = b.b.d.a.j.ActionMenuItemView
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r6, r2)
            int r5 = b.b.d.a.j.ActionMenuItemView_android_minWidth
            int r5 = r4.getDimensionPixelSize(r5, r2)
            r3.m = r5
            r4.recycle()
            android.util.DisplayMetrics r4 = r0.getDisplayMetrics()
            float r4 = r4.density
            r5 = 1107296256(0x42000000, float:32.0)
            float r4 = r4 * r5
            r5 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r5
            int r4 = (int) r4
            r3.o = r4
            r3.setOnClickListener(r3)
            r4 = -1
            r3.n = r4
            r3.setSaveEnabled(r2)
            return
    }

    private boolean e() {
            r4 = this;
            android.content.Context r4 = r4.getContext()
            android.content.res.Resources r4 = r4.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r0 = r4.screenWidthDp
            int r1 = r4.screenHeightDp
            r2 = 480(0x1e0, float:6.73E-43)
            if (r0 >= r2) goto L22
            r3 = 640(0x280, float:8.97E-43)
            if (r0 < r3) goto L1a
            if (r1 >= r2) goto L22
        L1a:
            int r4 = r4.orientation
            r0 = 2
            if (r4 != r0) goto L20
            goto L22
        L20:
            r4 = 0
            goto L23
        L22:
            r4 = 1
        L23:
            return r4
    }

    private void f() {
            r4 = this;
            java.lang.CharSequence r0 = r4.f
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1
            r0 = r0 ^ r1
            android.graphics.drawable.Drawable r2 = r4.g
            if (r2 == 0) goto L1e
            android.support.v7.view.menu.j r2 = r4.e
            boolean r2 = r2.n()
            if (r2 == 0) goto L1d
            boolean r2 = r4.k
            if (r2 != 0) goto L1e
            boolean r2 = r4.l
            if (r2 == 0) goto L1d
            goto L1e
        L1d:
            r1 = 0
        L1e:
            r0 = r0 & r1
            r1 = 0
            if (r0 == 0) goto L25
            java.lang.CharSequence r2 = r4.f
            goto L26
        L25:
            r2 = r1
        L26:
            r4.setText(r2)
            android.support.v7.view.menu.j r2 = r4.e
            java.lang.CharSequence r2 = r2.getContentDescription()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L3f
            if (r0 == 0) goto L39
            r2 = r1
            goto L3f
        L39:
            android.support.v7.view.menu.j r2 = r4.e
            java.lang.CharSequence r2 = r2.getTitle()
        L3f:
            r4.setContentDescription(r2)
            android.support.v7.view.menu.j r2 = r4.e
            java.lang.CharSequence r2 = r2.getTooltipText()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L5b
            if (r0 == 0) goto L51
            goto L57
        L51:
            android.support.v7.view.menu.j r0 = r4.e
            java.lang.CharSequence r1 = r0.getTitle()
        L57:
            android.support.v7.widget.v0.a(r4, r1)
            goto L5e
        L5b:
            android.support.v7.widget.v0.a(r4, r2)
        L5e:
            return
    }

    @Override // android.support.v7.view.menu.p.a
    public void a(android.support.v7.view.menu.j r1, int r2) {
            r0 = this;
            r0.e = r1
            android.graphics.drawable.Drawable r2 = r1.getIcon()
            r0.setIcon(r2)
            java.lang.CharSequence r2 = r1.a(r0)
            r0.setTitle(r2)
            int r2 = r1.getItemId()
            r0.setId(r2)
            boolean r2 = r1.isVisible()
            if (r2 == 0) goto L1f
            r2 = 0
            goto L21
        L1f:
            r2 = 8
        L21:
            r0.setVisibility(r2)
            boolean r2 = r1.isEnabled()
            r0.setEnabled(r2)
            boolean r1 = r1.hasSubMenu()
            if (r1 == 0) goto L3c
            android.support.v7.widget.f0 r1 = r0.i
            if (r1 != 0) goto L3c
            android.support.v7.view.menu.ActionMenuItemView$a r1 = new android.support.v7.view.menu.ActionMenuItemView$a
            r1.<init>(r0)
            r0.i = r1
        L3c:
            return
    }

    @Override // android.support.v7.widget.ActionMenuView.a
    public boolean a() {
            r1 = this;
            boolean r0 = r1.d()
            if (r0 == 0) goto L10
            android.support.v7.view.menu.j r1 = r1.e
            android.graphics.drawable.Drawable r1 = r1.getIcon()
            if (r1 != 0) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
    }

    @Override // android.support.v7.widget.ActionMenuView.a
    public boolean b() {
            r0 = this;
            boolean r0 = r0.d()
            return r0
    }

    @Override // android.support.v7.view.menu.p.a
    public boolean c() {
            r0 = this;
            r0 = 1
            return r0
    }

    public boolean d() {
            r0 = this;
            java.lang.CharSequence r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            return r0
    }

    @Override // android.support.v7.view.menu.p.a
    public android.support.v7.view.menu.j getItemData() {
            r0 = this;
            android.support.v7.view.menu.j r0 = r0.e
            return r0
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r1) {
            r0 = this;
            android.support.v7.view.menu.h$b r1 = r0.h
            if (r1 == 0) goto L9
            android.support.v7.view.menu.j r0 = r0.e
            r1.a(r0)
        L9:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            super.onConfigurationChanged(r1)
            boolean r1 = r0.e()
            r0.k = r1
            r0.f()
            return
    }

    @Override // android.support.v7.widget.y, android.widget.TextView, android.view.View
    protected void onMeasure(int r6, int r7) {
            r5 = this;
            boolean r0 = r5.d()
            if (r0 == 0) goto L19
            int r1 = r5.n
            if (r1 < 0) goto L19
            int r2 = r5.getPaddingTop()
            int r3 = r5.getPaddingRight()
            int r4 = r5.getPaddingBottom()
            super.setPadding(r1, r2, r3, r4)
        L19:
            super.onMeasure(r6, r7)
            int r1 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r2 = r5.getMeasuredWidth()
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r3) goto L33
            int r3 = r5.m
            int r6 = java.lang.Math.min(r6, r3)
            goto L35
        L33:
            int r6 = r5.m
        L35:
            r3 = 1073741824(0x40000000, float:2.0)
            if (r1 == r3) goto L46
            int r1 = r5.m
            if (r1 <= 0) goto L46
            if (r2 >= r6) goto L46
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r3)
            super.onMeasure(r6, r7)
        L46:
            if (r0 != 0) goto L6c
            android.graphics.drawable.Drawable r6 = r5.g
            if (r6 == 0) goto L6c
            int r6 = r5.getMeasuredWidth()
            android.graphics.drawable.Drawable r7 = r5.g
            android.graphics.Rect r7 = r7.getBounds()
            int r7 = r7.width()
            int r6 = r6 - r7
            int r6 = r6 / 2
            int r7 = r5.getPaddingTop()
            int r0 = r5.getPaddingRight()
            int r1 = r5.getPaddingBottom()
            super.setPadding(r6, r7, r0, r1)
        L6c:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(android.os.Parcelable r1) {
            r0 = this;
            r1 = 0
            super.onRestoreInstanceState(r1)
            return
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            android.support.v7.view.menu.j r0 = r1.e
            boolean r0 = r0.hasSubMenu()
            if (r0 == 0) goto L14
            android.support.v7.widget.f0 r0 = r1.i
            if (r0 == 0) goto L14
            boolean r0 = r0.onTouch(r1, r2)
            if (r0 == 0) goto L14
            r1 = 1
            return r1
        L14:
            boolean r1 = super.onTouchEvent(r2)
            return r1
    }

    public void setCheckable(boolean r1) {
            r0 = this;
            return
    }

    public void setChecked(boolean r1) {
            r0 = this;
            return
    }

    public void setExpandedFormat(boolean r2) {
            r1 = this;
            boolean r0 = r1.l
            if (r0 == r2) goto Ld
            r1.l = r2
            android.support.v7.view.menu.j r1 = r1.e
            if (r1 == 0) goto Ld
            r1.b()
        Ld:
            return
    }

    public void setIcon(android.graphics.drawable.Drawable r5) {
            r4 = this;
            r4.g = r5
            if (r5 == 0) goto L26
            int r0 = r5.getIntrinsicWidth()
            int r1 = r5.getIntrinsicHeight()
            int r2 = r4.o
            if (r0 <= r2) goto L17
            float r3 = (float) r2
            float r0 = (float) r0
            float r3 = r3 / r0
            float r0 = (float) r1
            float r0 = r0 * r3
            int r1 = (int) r0
            r0 = r2
        L17:
            int r2 = r4.o
            if (r1 <= r2) goto L22
            float r3 = (float) r2
            float r1 = (float) r1
            float r3 = r3 / r1
            float r0 = (float) r0
            float r0 = r0 * r3
            int r0 = (int) r0
            r1 = r2
        L22:
            r2 = 0
            r5.setBounds(r2, r2, r0, r1)
        L26:
            r0 = 0
            r4.setCompoundDrawables(r5, r0, r0, r0)
            r4.f()
            return
    }

    public void setItemInvoker(android.support.v7.view.menu.h.b r1) {
            r0 = this;
            r0.h = r1
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.n = r1
            super.setPadding(r1, r2, r3, r4)
            return
    }

    public void setPopupCallback(android.support.v7.view.menu.ActionMenuItemView.b r1) {
            r0 = this;
            r0.j = r1
            return
    }

    public void setTitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.f = r1
            r0.f()
            return
    }
}
