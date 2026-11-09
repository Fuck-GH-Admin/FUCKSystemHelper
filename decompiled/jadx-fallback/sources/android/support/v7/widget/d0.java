package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
class d0 extends android.widget.ListView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.graphics.Rect f841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f842c;
    private int d;
    private int e;
    private int f;
    private int g;
    private java.lang.reflect.Field h;
    private android.support.v7.widget.d0.a i;
    private boolean j;
    private boolean k;
    private boolean l;
    private b.b.c.g.u m;
    private android.support.v4.widget.h n;
    android.support.v7.widget.d0.b o;

    private static class a extends b.b.d.c.a.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f843c;

        a(android.graphics.drawable.Drawable r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = 1
                r0.f843c = r1
                return
        }

        void a(boolean r1) {
                r0 = this;
                r0.f843c = r1
                return
        }

        @Override // b.b.d.c.a.c, android.graphics.drawable.Drawable
        public void draw(android.graphics.Canvas r2) {
                r1 = this;
                boolean r0 = r1.f843c
                if (r0 == 0) goto L7
                super.draw(r2)
            L7:
                return
        }

        @Override // b.b.d.c.a.c, android.graphics.drawable.Drawable
        public void setHotspot(float r2, float r3) {
                r1 = this;
                boolean r0 = r1.f843c
                if (r0 == 0) goto L7
                super.setHotspot(r2, r3)
            L7:
                return
        }

        @Override // b.b.d.c.a.c, android.graphics.drawable.Drawable
        public void setHotspotBounds(int r2, int r3, int r4, int r5) {
                r1 = this;
                boolean r0 = r1.f843c
                if (r0 == 0) goto L7
                super.setHotspotBounds(r2, r3, r4, r5)
            L7:
                return
        }

        @Override // b.b.d.c.a.c, android.graphics.drawable.Drawable
        public boolean setState(int[] r2) {
                r1 = this;
                boolean r0 = r1.f843c
                if (r0 == 0) goto L9
                boolean r1 = super.setState(r2)
                return r1
            L9:
                r1 = 0
                return r1
        }

        @Override // b.b.d.c.a.c, android.graphics.drawable.Drawable
        public boolean setVisible(boolean r2, boolean r3) {
                r1 = this;
                boolean r0 = r1.f843c
                if (r0 == 0) goto L9
                boolean r1 = super.setVisible(r2, r3)
                return r1
            L9:
                r1 = 0
                return r1
        }
    }

    private class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.support.v7.widget.d0 f844b;

        b(android.support.v7.widget.d0 r1) {
                r0 = this;
                r0.f844b = r1
                r0.<init>()
                return
        }

        public void a() {
                r2 = this;
                android.support.v7.widget.d0 r0 = r2.f844b
                r1 = 0
                r0.o = r1
                r0.removeCallbacks(r2)
                return
        }

        public void b() {
                r1 = this;
                android.support.v7.widget.d0 r0 = r1.f844b
                r0.post(r1)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                android.support.v7.widget.d0 r1 = r1.f844b
                r0 = 0
                r1.o = r0
                r1.drawableStateChanged()
                return
        }
    }

    d0(android.content.Context r3, boolean r4) {
            r2 = this;
            int r0 = b.b.d.a.a.dropDownListViewStyle
            r1 = 0
            r2.<init>(r3, r1, r0)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r2.f841b = r3
            r3 = 0
            r2.f842c = r3
            r2.d = r3
            r2.e = r3
            r2.f = r3
            r2.k = r4
            r2.setCacheColorHint(r3)
            java.lang.Class<android.widget.AbsListView> r3 = android.widget.AbsListView.class
            java.lang.String r4 = "mIsChildViewEnabled"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch: java.lang.NoSuchFieldException -> L2a
            r2.h = r3     // Catch: java.lang.NoSuchFieldException -> L2a
            r2 = 1
            r3.setAccessible(r2)     // Catch: java.lang.NoSuchFieldException -> L2a
            goto L2e
        L2a:
            r2 = move-exception
            r2.printStackTrace()
        L2e:
            return
    }

    private void a() {
            r3 = this;
            r0 = 0
            r3.l = r0
            r3.setPressed(r0)
            r3.drawableStateChanged()
            int r1 = r3.g
            int r2 = r3.getFirstVisiblePosition()
            int r1 = r1 - r2
            android.view.View r1 = r3.getChildAt(r1)
            if (r1 == 0) goto L19
            r1.setPressed(r0)
        L19:
            b.b.c.g.u r0 = r3.m
            if (r0 == 0) goto L23
            r0.a()
            r0 = 0
            r3.m = r0
        L23:
            return
    }

    private void a(int r6, android.view.View r7) {
            r5 = this;
            android.graphics.Rect r0 = r5.f841b
            int r1 = r7.getLeft()
            int r2 = r7.getTop()
            int r3 = r7.getRight()
            int r4 = r7.getBottom()
            r0.set(r1, r2, r3, r4)
            int r1 = r0.left
            int r2 = r5.f842c
            int r1 = r1 - r2
            r0.left = r1
            int r1 = r0.top
            int r2 = r5.d
            int r1 = r1 - r2
            r0.top = r1
            int r1 = r0.right
            int r2 = r5.e
            int r1 = r1 + r2
            r0.right = r1
            int r1 = r0.bottom
            int r2 = r5.f
            int r1 = r1 + r2
            r0.bottom = r1
            java.lang.reflect.Field r0 = r5.h     // Catch: java.lang.IllegalAccessException -> L52
            boolean r0 = r0.getBoolean(r5)     // Catch: java.lang.IllegalAccessException -> L52
            boolean r7 = r7.isEnabled()     // Catch: java.lang.IllegalAccessException -> L52
            if (r7 == r0) goto L56
            java.lang.reflect.Field r7 = r5.h     // Catch: java.lang.IllegalAccessException -> L52
            if (r0 != 0) goto L43
            r0 = 1
            goto L44
        L43:
            r0 = 0
        L44:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.IllegalAccessException -> L52
            r7.set(r5, r0)     // Catch: java.lang.IllegalAccessException -> L52
            r7 = -1
            if (r6 == r7) goto L56
            r5.refreshDrawableState()     // Catch: java.lang.IllegalAccessException -> L52
            goto L56
        L52:
            r5 = move-exception
            r5.printStackTrace()
        L56:
            return
    }

    private void a(int r1, android.view.View r2, float r3, float r4) {
            r0 = this;
            r0.b(r1, r2)
            android.graphics.drawable.Drawable r0 = r0.getSelector()
            if (r0 == 0) goto Lf
            r2 = -1
            if (r1 == r2) goto Lf
            android.support.v4.graphics.drawable.a.a(r0, r3, r4)
        Lf:
            return
    }

    private void a(android.graphics.Canvas r2) {
            r1 = this;
            android.graphics.Rect r0 = r1.f841b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L16
            android.graphics.drawable.Drawable r0 = r1.getSelector()
            if (r0 == 0) goto L16
            android.graphics.Rect r1 = r1.f841b
            r0.setBounds(r1)
            r0.draw(r2)
        L16:
            return
    }

    private void a(android.view.View r3, int r4) {
            r2 = this;
            long r0 = r2.getItemIdAtPosition(r4)
            r2.performItemClick(r3, r4, r0)
            return
    }

    private void a(android.view.View r7, int r8, float r9, float r10) {
            r6 = this;
            r0 = 1
            r6.l = r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto Lc
            r6.drawableHotspotChanged(r9, r10)
        Lc:
            boolean r1 = r6.isPressed()
            if (r1 != 0) goto L15
            r6.setPressed(r0)
        L15:
            r6.layoutChildren()
            int r1 = r6.g
            r3 = -1
            r4 = 0
            if (r1 == r3) goto L34
            int r3 = r6.getFirstVisiblePosition()
            int r1 = r1 - r3
            android.view.View r1 = r6.getChildAt(r1)
            if (r1 == 0) goto L34
            if (r1 == r7) goto L34
            boolean r3 = r1.isPressed()
            if (r3 == 0) goto L34
            r1.setPressed(r4)
        L34:
            r6.g = r8
            int r1 = r7.getLeft()
            float r1 = (float) r1
            float r1 = r9 - r1
            int r3 = r7.getTop()
            float r3 = (float) r3
            float r3 = r10 - r3
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r2) goto L4b
            r7.drawableHotspotChanged(r1, r3)
        L4b:
            boolean r1 = r7.isPressed()
            if (r1 != 0) goto L54
            r7.setPressed(r0)
        L54:
            r6.a(r8, r7, r9, r10)
            r6.setSelectorEnabled(r4)
            r6.refreshDrawableState()
            return
    }

    private void b(int r5, android.view.View r6) {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.getSelector()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Ld
            r3 = -1
            if (r5 == r3) goto Ld
            r3 = r1
            goto Le
        Ld:
            r3 = r2
        Le:
            if (r3 == 0) goto L13
            r0.setVisible(r2, r2)
        L13:
            r4.a(r5, r6)
            if (r3 == 0) goto L30
            android.graphics.Rect r5 = r4.f841b
            float r6 = r5.exactCenterX()
            float r5 = r5.exactCenterY()
            int r4 = r4.getVisibility()
            if (r4 != 0) goto L29
            goto L2a
        L29:
            r1 = r2
        L2a:
            r0.setVisible(r1, r2)
            android.support.v4.graphics.drawable.a.a(r0, r6, r5)
        L30:
            return
    }

    private boolean b() {
            r0 = this;
            boolean r0 = r0.l
            return r0
    }

    private void c() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.getSelector()
            if (r0 == 0) goto L19
            boolean r1 = r2.b()
            if (r1 == 0) goto L19
            boolean r1 = r2.isPressed()
            if (r1 == 0) goto L19
            int[] r2 = r2.getDrawableState()
            r0.setState(r2)
        L19:
            return
    }

    private void setSelectorEnabled(boolean r1) {
            r0 = this;
            android.support.v7.widget.d0$a r0 = r0.i
            if (r0 == 0) goto L7
            r0.a(r1)
        L7:
            return
    }

    public int a(int r11, int r12, int r13, int r14, int r15) {
            r10 = this;
            int r12 = r10.getListPaddingTop()
            int r13 = r10.getListPaddingBottom()
            r10.getListPaddingLeft()
            r10.getListPaddingRight()
            int r0 = r10.getDividerHeight()
            android.graphics.drawable.Drawable r1 = r10.getDivider()
            android.widget.ListAdapter r2 = r10.getAdapter()
            int r12 = r12 + r13
            if (r2 != 0) goto L1e
            return r12
        L1e:
            r13 = 0
            if (r0 <= 0) goto L24
            if (r1 == 0) goto L24
            goto L25
        L24:
            r0 = r13
        L25:
            int r1 = r2.getCount()
            r3 = 0
            r4 = r13
            r5 = r4
            r7 = r5
            r6 = r3
        L2e:
            if (r4 >= r1) goto L7a
            int r8 = r2.getItemViewType(r4)
            if (r8 == r5) goto L38
            r6 = r3
            r5 = r8
        L38:
            android.view.View r6 = r2.getView(r4, r6, r10)
            android.view.ViewGroup$LayoutParams r8 = r6.getLayoutParams()
            if (r8 != 0) goto L49
            android.view.ViewGroup$LayoutParams r8 = r10.generateDefaultLayoutParams()
            r6.setLayoutParams(r8)
        L49:
            int r8 = r8.height
            if (r8 <= 0) goto L54
            r9 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r9)
            goto L58
        L54:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r13)
        L58:
            r6.measure(r11, r8)
            r6.forceLayout()
            if (r4 <= 0) goto L61
            int r12 = r12 + r0
        L61:
            int r8 = r6.getMeasuredHeight()
            int r12 = r12 + r8
            if (r12 < r14) goto L72
            if (r15 < 0) goto L71
            if (r4 <= r15) goto L71
            if (r7 <= 0) goto L71
            if (r12 == r14) goto L71
            r14 = r7
        L71:
            return r14
        L72:
            if (r15 < 0) goto L77
            if (r4 < r15) goto L77
            r7 = r12
        L77:
            int r4 = r4 + 1
            goto L2e
        L7a:
            return r12
    }

    public boolean a(android.view.MotionEvent r8, int r9) {
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r9 = r1
            r3 = r2
            goto L46
        L11:
            r9 = r1
            r3 = r9
            goto L46
        L14:
            r3 = r2
            goto L17
        L16:
            r3 = r1
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = r2
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.a(r3, r5, r4, r9)
            if (r0 != r2) goto Le
            r7.a(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.a()
        L4d:
            if (r3 == 0) goto L65
            android.support.v4.widget.h r9 = r7.n
            if (r9 != 0) goto L5a
            android.support.v4.widget.h r9 = new android.support.v4.widget.h
            r9.<init>(r7)
            r7.n = r9
        L5a:
            android.support.v4.widget.h r9 = r7.n
            r9.a(r2)
            android.support.v4.widget.h r9 = r7.n
            r9.onTouch(r7, r8)
            goto L6c
        L65:
            android.support.v4.widget.h r7 = r7.n
            if (r7 == 0) goto L6c
            r7.a(r1)
        L6c:
            return r3
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas r1) {
            r0 = this;
            r0.a(r1)
            super.dispatchDraw(r1)
            return
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
            r1 = this;
            android.support.v7.widget.d0$b r0 = r1.o
            if (r0 == 0) goto L5
            return
        L5:
            super.drawableStateChanged()
            r0 = 1
            r1.setSelectorEnabled(r0)
            r1.c()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
            r1 = this;
            boolean r0 = r1.k
            if (r0 != 0) goto Ld
            boolean r1 = super.hasFocus()
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

    @Override // android.view.View
    public boolean hasWindowFocus() {
            r1 = this;
            boolean r0 = r1.k
            if (r0 != 0) goto Ld
            boolean r1 = super.hasWindowFocus()
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

    @Override // android.view.View
    public boolean isFocused() {
            r1 = this;
            boolean r0 = r1.k
            if (r0 != 0) goto Ld
            boolean r1 = super.isFocused()
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

    @Override // android.view.View
    public boolean isInTouchMode() {
            r1 = this;
            boolean r0 = r1.k
            if (r0 == 0) goto L8
            boolean r0 = r1.j
            if (r0 != 0) goto Le
        L8:
            boolean r1 = super.isInTouchMode()
            if (r1 == 0) goto L10
        Le:
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            r0 = 0
            r1.o = r0
            super.onDetachedFromWindow()
            return
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent r5) {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto Lb
            boolean r4 = super.onHoverEvent(r5)
            return r4
        Lb:
            int r0 = r5.getActionMasked()
            r1 = 10
            if (r0 != r1) goto L21
            android.support.v7.widget.d0$b r1 = r4.o
            if (r1 != 0) goto L21
            android.support.v7.widget.d0$b r1 = new android.support.v7.widget.d0$b
            r1.<init>(r4)
            r4.o = r1
            r1.b()
        L21:
            boolean r1 = super.onHoverEvent(r5)
            r2 = 9
            r3 = -1
            if (r0 == r2) goto L32
            r2 = 7
            if (r0 != r2) goto L2e
            goto L32
        L2e:
            r4.setSelection(r3)
            goto L67
        L32:
            float r0 = r5.getX()
            int r0 = (int) r0
            float r5 = r5.getY()
            int r5 = (int) r5
            int r5 = r4.pointToPosition(r0, r5)
            if (r5 == r3) goto L67
            int r0 = r4.getSelectedItemPosition()
            if (r5 == r0) goto L67
            int r0 = r4.getFirstVisiblePosition()
            int r0 = r5 - r0
            android.view.View r0 = r4.getChildAt(r0)
            boolean r2 = r0.isEnabled()
            if (r2 == 0) goto L64
            int r0 = r0.getTop()
            int r2 = r4.getTop()
            int r0 = r0 - r2
            r4.setSelectionFromTop(r5, r0)
        L64:
            r4.c()
        L67:
            return r1
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r3) {
            r2 = this;
            int r0 = r3.getAction()
            if (r0 == 0) goto L7
            goto L17
        L7:
            float r0 = r3.getX()
            int r0 = (int) r0
            float r1 = r3.getY()
            int r1 = (int) r1
            int r0 = r2.pointToPosition(r0, r1)
            r2.g = r0
        L17:
            android.support.v7.widget.d0$b r0 = r2.o
            if (r0 == 0) goto L1e
            r0.a()
        L1e:
            boolean r2 = super.onTouchEvent(r3)
            return r2
    }

    void setListSelectionHidden(boolean r1) {
            r0 = this;
            r0.j = r1
            return
    }

    @Override // android.widget.AbsListView
    public void setSelector(android.graphics.drawable.Drawable r2) {
            r1 = this;
            if (r2 == 0) goto L8
            android.support.v7.widget.d0$a r0 = new android.support.v7.widget.d0$a
            r0.<init>(r2)
            goto L9
        L8:
            r0 = 0
        L9:
            r1.i = r0
            super.setSelector(r0)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            if (r2 == 0) goto L18
            r2.getPadding(r0)
        L18:
            int r2 = r0.left
            r1.f842c = r2
            int r2 = r0.top
            r1.d = r2
            int r2 = r0.right
            r1.e = r2
            int r2 = r0.bottom
            r1.f = r2
            return
    }
}
