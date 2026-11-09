package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends android.widget.FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.view.View f786c;
    private android.view.View d;
    private android.view.View e;
    android.graphics.drawable.Drawable f;
    android.graphics.drawable.Drawable g;
    android.graphics.drawable.Drawable h;
    boolean i;
    boolean j;
    private int k;

    public ActionBarContainer(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ActionBarContainer(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            android.support.v7.widget.b r0 = new android.support.v7.widget.b
            r0.<init>(r2)
            b.b.c.g.q.a(r2, r0)
            int[] r0 = b.b.d.a.j.ActionBar
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r0)
            int r4 = b.b.d.a.j.ActionBar_background
            android.graphics.drawable.Drawable r4 = r3.getDrawable(r4)
            r2.f = r4
            int r4 = b.b.d.a.j.ActionBar_backgroundStacked
            android.graphics.drawable.Drawable r4 = r3.getDrawable(r4)
            r2.g = r4
            int r4 = b.b.d.a.j.ActionBar_height
            r0 = -1
            int r4 = r3.getDimensionPixelSize(r4, r0)
            r2.k = r4
            int r4 = r2.getId()
            int r0 = b.b.d.a.f.split_action_bar
            r1 = 1
            if (r4 != r0) goto L3d
            r2.i = r1
            int r4 = b.b.d.a.j.ActionBar_backgroundSplit
            android.graphics.drawable.Drawable r4 = r3.getDrawable(r4)
            r2.h = r4
        L3d:
            r3.recycle()
            boolean r3 = r2.i
            r4 = 0
            if (r3 == 0) goto L4a
            android.graphics.drawable.Drawable r3 = r2.h
            if (r3 != 0) goto L53
            goto L54
        L4a:
            android.graphics.drawable.Drawable r3 = r2.f
            if (r3 != 0) goto L53
            android.graphics.drawable.Drawable r3 = r2.g
            if (r3 != 0) goto L53
            goto L54
        L53:
            r1 = r4
        L54:
            r2.setWillNotDraw(r1)
            return
    }

    private int a(android.view.View r2) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r2 = r2.getMeasuredHeight()
            int r0 = r1.topMargin
            int r2 = r2 + r0
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            return r2
    }

    private boolean b(android.view.View r2) {
            r1 = this;
            if (r2 == 0) goto L13
            int r1 = r2.getVisibility()
            r0 = 8
            if (r1 == r0) goto L13
            int r1 = r2.getMeasuredHeight()
            if (r1 != 0) goto L11
            goto L13
        L11:
            r1 = 0
            goto L14
        L13:
            r1 = 1
        L14:
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
            r2 = this;
            super.drawableStateChanged()
            android.graphics.drawable.Drawable r0 = r2.f
            if (r0 == 0) goto L16
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L16
            android.graphics.drawable.Drawable r0 = r2.f
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        L16:
            android.graphics.drawable.Drawable r0 = r2.g
            if (r0 == 0) goto L29
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L29
            android.graphics.drawable.Drawable r0 = r2.g
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        L29:
            android.graphics.drawable.Drawable r0 = r2.h
            if (r0 == 0) goto L3c
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L3c
            android.graphics.drawable.Drawable r0 = r2.h
            int[] r2 = r2.getDrawableState()
            r0.setState(r2)
        L3c:
            return
    }

    public android.view.View getTabContainer() {
            r0 = this;
            android.view.View r0 = r0.f786c
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
            r1 = this;
            super.jumpDrawablesToCurrentState()
            android.graphics.drawable.Drawable r0 = r1.f
            if (r0 == 0) goto La
            r0.jumpToCurrentState()
        La:
            android.graphics.drawable.Drawable r0 = r1.g
            if (r0 == 0) goto L11
            r0.jumpToCurrentState()
        L11:
            android.graphics.drawable.Drawable r1 = r1.h
            if (r1 == 0) goto L18
            r1.jumpToCurrentState()
        L18:
            return
    }

    @Override // android.view.View
    public void onFinishInflate() {
            r1 = this;
            super.onFinishInflate()
            int r0 = b.b.d.a.f.action_bar
            android.view.View r0 = r1.findViewById(r0)
            r1.d = r0
            int r0 = b.b.d.a.f.action_context_bar
            android.view.View r0 = r1.findViewById(r0)
            r1.e = r0
            return
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent r1) {
            r0 = this;
            super.onHoverEvent(r1)
            r0 = 1
            return r0
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            boolean r0 = r1.f785b
            if (r0 != 0) goto Ld
            boolean r1 = super.onInterceptTouchEvent(r2)
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

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
            r4 = this;
            super.onLayout(r5, r6, r7, r8, r9)
            android.view.View r5 = r4.f786c
            r7 = 8
            r9 = 1
            r0 = 0
            if (r5 == 0) goto L13
            int r1 = r5.getVisibility()
            if (r1 == r7) goto L13
            r1 = r9
            goto L14
        L13:
            r1 = r0
        L14:
            if (r5 == 0) goto L33
            int r2 = r5.getVisibility()
            if (r2 == r7) goto L33
            int r7 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r3 = r5.getMeasuredHeight()
            int r3 = r7 - r3
            int r2 = r2.bottomMargin
            int r3 = r3 - r2
            int r7 = r7 - r2
            r5.layout(r6, r3, r8, r7)
        L33:
            boolean r6 = r4.i
            if (r6 == 0) goto L4a
            android.graphics.drawable.Drawable r5 = r4.h
            if (r5 == 0) goto L48
            int r6 = r4.getMeasuredWidth()
            int r7 = r4.getMeasuredHeight()
            r5.setBounds(r0, r0, r6, r7)
            goto Lb6
        L48:
            r9 = r0
            goto Lb6
        L4a:
            android.graphics.drawable.Drawable r6 = r4.f
            if (r6 == 0) goto L9b
            android.view.View r6 = r4.d
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L74
            android.graphics.drawable.Drawable r6 = r4.f
            android.view.View r7 = r4.d
            int r7 = r7.getLeft()
            android.view.View r8 = r4.d
            int r8 = r8.getTop()
            android.view.View r0 = r4.d
            int r0 = r0.getRight()
            android.view.View r2 = r4.d
        L6c:
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto L9a
        L74:
            android.view.View r6 = r4.e
            if (r6 == 0) goto L95
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L95
            android.graphics.drawable.Drawable r6 = r4.f
            android.view.View r7 = r4.e
            int r7 = r7.getLeft()
            android.view.View r8 = r4.e
            int r8 = r8.getTop()
            android.view.View r0 = r4.e
            int r0 = r0.getRight()
            android.view.View r2 = r4.e
            goto L6c
        L95:
            android.graphics.drawable.Drawable r6 = r4.f
            r6.setBounds(r0, r0, r0, r0)
        L9a:
            r0 = r9
        L9b:
            r4.j = r1
            if (r1 == 0) goto L48
            android.graphics.drawable.Drawable r6 = r4.g
            if (r6 == 0) goto L48
            int r7 = r5.getLeft()
            int r8 = r5.getTop()
            int r0 = r5.getRight()
            int r5 = r5.getBottom()
            r6.setBounds(r7, r8, r0, r5)
        Lb6:
            if (r9 == 0) goto Lbb
            r4.invalidate()
        Lbb:
            return
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int r4, int r5) {
            r3 = this;
            android.view.View r0 = r3.d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L1c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L1c
            int r0 = r3.k
            if (r0 < 0) goto L1c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L1c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.d
            if (r4 != 0) goto L24
            return
        L24:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f786c
            if (r0 == 0) goto L6f
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L6f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L6f
            android.view.View r0 = r3.d
            boolean r0 = r3.b(r0)
            if (r0 != 0) goto L47
            android.view.View r0 = r3.d
        L42:
            int r0 = r3.a(r0)
            goto L53
        L47:
            android.view.View r0 = r3.e
            boolean r0 = r3.b(r0)
            if (r0 != 0) goto L52
            android.view.View r0 = r3.e
            goto L42
        L52:
            r0 = 0
        L53:
            if (r4 != r1) goto L5a
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L5d
        L5a:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L5d:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.f786c
            int r1 = r3.a(r1)
            int r0 = r0 + r1
            int r4 = java.lang.Math.min(r0, r4)
            r3.setMeasuredDimension(r5, r4)
        L6f:
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r1) {
            r0 = this;
            super.onTouchEvent(r1)
            r0 = 1
            return r0
    }

    public void setPrimaryBackground(android.graphics.drawable.Drawable r5) {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.f
            if (r0 == 0) goto Ld
            r1 = 0
            r0.setCallback(r1)
            android.graphics.drawable.Drawable r0 = r4.f
            r4.unscheduleDrawable(r0)
        Ld:
            r4.f = r5
            if (r5 == 0) goto L33
            r5.setCallback(r4)
            android.view.View r5 = r4.d
            if (r5 == 0) goto L33
            android.graphics.drawable.Drawable r0 = r4.f
            int r5 = r5.getLeft()
            android.view.View r1 = r4.d
            int r1 = r1.getTop()
            android.view.View r2 = r4.d
            int r2 = r2.getRight()
            android.view.View r3 = r4.d
            int r3 = r3.getBottom()
            r0.setBounds(r5, r1, r2, r3)
        L33:
            boolean r5 = r4.i
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L3e
            android.graphics.drawable.Drawable r5 = r4.h
            if (r5 != 0) goto L47
            goto L48
        L3e:
            android.graphics.drawable.Drawable r5 = r4.f
            if (r5 != 0) goto L47
            android.graphics.drawable.Drawable r5 = r4.g
            if (r5 != 0) goto L47
            goto L48
        L47:
            r0 = r1
        L48:
            r4.setWillNotDraw(r0)
            r4.invalidate()
            return
    }

    public void setSplitBackground(android.graphics.drawable.Drawable r4) {
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.h
            if (r0 == 0) goto Ld
            r1 = 0
            r0.setCallback(r1)
            android.graphics.drawable.Drawable r0 = r3.h
            r3.unscheduleDrawable(r0)
        Ld:
            r3.h = r4
            r0 = 0
            if (r4 == 0) goto L28
            r4.setCallback(r3)
            boolean r4 = r3.i
            if (r4 == 0) goto L28
            android.graphics.drawable.Drawable r4 = r3.h
            if (r4 == 0) goto L28
            int r1 = r3.getMeasuredWidth()
            int r2 = r3.getMeasuredHeight()
            r4.setBounds(r0, r0, r1, r2)
        L28:
            boolean r4 = r3.i
            r1 = 1
            if (r4 == 0) goto L33
            android.graphics.drawable.Drawable r4 = r3.h
            if (r4 != 0) goto L3c
        L31:
            r0 = r1
            goto L3c
        L33:
            android.graphics.drawable.Drawable r4 = r3.f
            if (r4 != 0) goto L3c
            android.graphics.drawable.Drawable r4 = r3.g
            if (r4 != 0) goto L3c
            goto L31
        L3c:
            r3.setWillNotDraw(r0)
            r3.invalidate()
            return
    }

    public void setStackedBackground(android.graphics.drawable.Drawable r5) {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.g
            if (r0 == 0) goto Ld
            r1 = 0
            r0.setCallback(r1)
            android.graphics.drawable.Drawable r0 = r4.g
            r4.unscheduleDrawable(r0)
        Ld:
            r4.g = r5
            if (r5 == 0) goto L37
            r5.setCallback(r4)
            boolean r5 = r4.j
            if (r5 == 0) goto L37
            android.graphics.drawable.Drawable r5 = r4.g
            if (r5 == 0) goto L37
            android.view.View r0 = r4.f786c
            int r0 = r0.getLeft()
            android.view.View r1 = r4.f786c
            int r1 = r1.getTop()
            android.view.View r2 = r4.f786c
            int r2 = r2.getRight()
            android.view.View r3 = r4.f786c
            int r3 = r3.getBottom()
            r5.setBounds(r0, r1, r2, r3)
        L37:
            boolean r5 = r4.i
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L42
            android.graphics.drawable.Drawable r5 = r4.h
            if (r5 != 0) goto L4b
            goto L4c
        L42:
            android.graphics.drawable.Drawable r5 = r4.f
            if (r5 != 0) goto L4b
            android.graphics.drawable.Drawable r5 = r4.g
            if (r5 != 0) goto L4b
            goto L4c
        L4b:
            r0 = r1
        L4c:
            r4.setWillNotDraw(r0)
            r4.invalidate()
            return
    }

    public void setTabContainer(android.support.v7.widget.m0 r2) {
            r1 = this;
            android.view.View r0 = r1.f786c
            if (r0 == 0) goto L7
            r1.removeView(r0)
        L7:
            r1.f786c = r2
            if (r2 == 0) goto L1c
            r1.addView(r2)
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            r0 = -1
            r1.width = r0
            r0 = -2
            r1.height = r0
            r1 = 0
            r2.setAllowCollapse(r1)
        L1c:
            return
    }

    public void setTransitioning(boolean r1) {
            r0 = this;
            r0.f785b = r1
            if (r1 == 0) goto L7
            r1 = 393216(0x60000, float:5.51013E-40)
            goto L9
        L7:
            r1 = 262144(0x40000, float:3.67342E-40)
        L9:
            r0.setDescendantFocusability(r1)
            return
    }

    @Override // android.view.View
    public void setVisibility(int r3) {
            r2 = this;
            super.setVisibility(r3)
            r0 = 0
            if (r3 != 0) goto L8
            r3 = 1
            goto L9
        L8:
            r3 = r0
        L9:
            android.graphics.drawable.Drawable r1 = r2.f
            if (r1 == 0) goto L10
            r1.setVisible(r3, r0)
        L10:
            android.graphics.drawable.Drawable r1 = r2.g
            if (r1 == 0) goto L17
            r1.setVisible(r3, r0)
        L17:
            android.graphics.drawable.Drawable r2 = r2.h
            if (r2 == 0) goto L1e
            r2.setVisible(r3, r0)
        L1e:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public android.view.ActionMode startActionModeForChild(android.view.View r1, android.view.ActionMode.Callback r2) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public android.view.ActionMode startActionModeForChild(android.view.View r1, android.view.ActionMode.Callback r2, int r3) {
            r0 = this;
            if (r3 == 0) goto L7
            android.view.ActionMode r0 = super.startActionModeForChild(r1, r2, r3)
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // android.view.View
    protected boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f
            if (r2 != r0) goto L8
            boolean r0 = r1.i
            if (r0 == 0) goto L1e
        L8:
            android.graphics.drawable.Drawable r0 = r1.g
            if (r2 != r0) goto L10
            boolean r0 = r1.j
            if (r0 != 0) goto L1e
        L10:
            android.graphics.drawable.Drawable r0 = r1.h
            if (r2 != r0) goto L18
            boolean r0 = r1.i
            if (r0 != 0) goto L1e
        L18:
            boolean r1 = super.verifyDrawable(r2)
            if (r1 == 0) goto L20
        L1e:
            r1 = 1
            goto L21
        L20:
            r1 = 0
        L21:
            return r1
    }
}
