package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
public class ButtonBarLayout extends android.widget.LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f797c;
    private int d;

    public ButtonBarLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r0 = -1
            r1.f797c = r0
            r0 = 0
            r1.d = r0
            int[] r0 = b.b.d.a.j.ButtonBarLayout
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
            int r3 = b.b.d.a.j.ButtonBarLayout_allowStacking
            r0 = 1
            boolean r3 = r2.getBoolean(r3, r0)
            r1.f796b = r3
            r2.recycle()
            return
    }

    private int a(int r3) {
            r2 = this;
            int r0 = r2.getChildCount()
        L4:
            if (r3 >= r0) goto L14
            android.view.View r1 = r2.getChildAt(r3)
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L11
            return r3
        L11:
            int r3 = r3 + 1
            goto L4
        L14:
            r2 = -1
            return r2
    }

    private boolean a() {
            r1 = this;
            int r1 = r1.getOrientation()
            r0 = 1
            if (r1 != r0) goto L8
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    private void setStacked(boolean r2) {
            r1 = this;
            r1.setOrientation(r2)
            if (r2 == 0) goto L7
            r0 = 5
            goto L9
        L7:
            r0 = 80
        L9:
            r1.setGravity(r0)
            int r0 = b.b.d.a.f.spacer
            android.view.View r0 = r1.findViewById(r0)
            if (r0 == 0) goto L1d
            if (r2 == 0) goto L19
            r2 = 8
            goto L1a
        L19:
            r2 = 4
        L1a:
            r0.setVisibility(r2)
        L1d:
            int r2 = r1.getChildCount()
            int r2 = r2 + (-2)
        L23:
            if (r2 < 0) goto L2f
            android.view.View r0 = r1.getChildAt(r2)
            r1.bringChildToFront(r0)
            int r2 = r2 + (-1)
            goto L23
        L2f:
            return
    }

    @Override // android.view.View
    public int getMinimumHeight() {
            r1 = this;
            int r0 = r1.d
            int r1 = super.getMinimumHeight()
            int r1 = java.lang.Math.max(r0, r1)
            return r1
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int r6, int r7) {
            r5 = this;
            int r0 = android.view.View.MeasureSpec.getSize(r6)
            boolean r1 = r5.f796b
            r2 = 0
            if (r1 == 0) goto L18
            int r1 = r5.f797c
            if (r0 <= r1) goto L16
            boolean r1 = r5.a()
            if (r1 == 0) goto L16
            r5.setStacked(r2)
        L16:
            r5.f797c = r0
        L18:
            boolean r1 = r5.a()
            r3 = 1
            if (r1 != 0) goto L2f
            int r1 = android.view.View.MeasureSpec.getMode(r6)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r1 != r4) goto L2f
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r1 = r3
            goto L31
        L2f:
            r0 = r6
            r1 = r2
        L31:
            super.onMeasure(r0, r7)
            boolean r0 = r5.f796b
            if (r0 == 0) goto L52
            boolean r0 = r5.a()
            if (r0 != 0) goto L52
            int r0 = r5.getMeasuredWidthAndState()
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r4
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            if (r0 != r4) goto L4b
            r0 = r3
            goto L4c
        L4b:
            r0 = r2
        L4c:
            if (r0 == 0) goto L52
            r5.setStacked(r3)
            r1 = r3
        L52:
            if (r1 == 0) goto L57
            super.onMeasure(r6, r7)
        L57:
            int r6 = r5.a(r2)
            if (r6 < 0) goto La4
            android.view.View r7 = r5.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r1 = r5.getPaddingTop()
            int r7 = r7.getMeasuredHeight()
            int r1 = r1 + r7
            int r7 = r0.topMargin
            int r1 = r1 + r7
            int r7 = r0.bottomMargin
            int r1 = r1 + r7
            int r1 = r1 + r2
            boolean r7 = r5.a()
            if (r7 == 0) goto L9e
            int r6 = r6 + r3
            int r6 = r5.a(r6)
            if (r6 < 0) goto L9c
            android.view.View r6 = r5.getChildAt(r6)
            int r6 = r6.getPaddingTop()
            r7 = 1098907648(0x41800000, float:16.0)
            android.content.res.Resources r0 = r5.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r0 = r0 * r7
            int r7 = (int) r0
            int r6 = r6 + r7
            int r1 = r1 + r6
        L9c:
            r2 = r1
            goto La4
        L9e:
            int r6 = r5.getPaddingBottom()
            int r2 = r1 + r6
        La4:
            int r6 = b.b.c.g.q.e(r5)
            if (r6 == r2) goto Lad
            r5.setMinimumHeight(r2)
        Lad:
            return
    }

    public void setAllowStacking(boolean r2) {
            r1 = this;
            boolean r0 = r1.f796b
            if (r0 == r2) goto L16
            r1.f796b = r2
            if (r2 != 0) goto L13
            int r2 = r1.getOrientation()
            r0 = 1
            if (r2 != r0) goto L13
            r2 = 0
            r1.setStacked(r2)
        L13:
            r1.requestLayout()
        L16:
            return
    }
}
