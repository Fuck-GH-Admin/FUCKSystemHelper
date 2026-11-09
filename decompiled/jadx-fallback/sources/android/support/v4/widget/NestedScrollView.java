package android.support.v4.widget;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends android.widget.FrameLayout implements b.b.c.g.l, b.b.c.g.i {
    private static final android.support.v4.widget.NestedScrollView.a B = null;
    private static final int[] C = null;
    private android.support.v4.widget.NestedScrollView.b A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.graphics.Rect f636c;
    private android.widget.OverScroller d;
    private android.widget.EdgeEffect e;
    private android.widget.EdgeEffect f;
    private int g;
    private boolean h;
    private boolean i;
    private android.view.View j;
    private boolean k;
    private android.view.VelocityTracker l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private int r;
    private final int[] s;
    private final int[] t;
    private int u;
    private int v;
    private android.support.v4.widget.NestedScrollView.c w;
    private final b.b.c.g.n x;
    private final b.b.c.g.k y;
    private float z;

    static class a extends b.b.c.g.b {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // b.b.c.g.b
        public void a(android.view.View r2, b.b.c.g.z.a r3) {
                r1 = this;
                super.a(r2, r3)
                android.support.v4.widget.NestedScrollView r2 = (android.support.v4.widget.NestedScrollView) r2
                java.lang.Class<android.widget.ScrollView> r1 = android.widget.ScrollView.class
                java.lang.String r1 = r1.getName()
                r3.a(r1)
                boolean r1 = r2.isEnabled()
                if (r1 == 0) goto L34
                int r1 = r2.getScrollRange()
                if (r1 <= 0) goto L34
                r0 = 1
                r3.a(r0)
                int r0 = r2.getScrollY()
                if (r0 <= 0) goto L29
                r0 = 8192(0x2000, float:1.148E-41)
                r3.a(r0)
            L29:
                int r2 = r2.getScrollY()
                if (r2 >= r1) goto L34
                r1 = 4096(0x1000, float:5.74E-42)
                r3.a(r1)
            L34:
                return
        }

        @Override // b.b.c.g.b
        public boolean a(android.view.View r2, int r3, android.os.Bundle r4) {
                r1 = this;
                boolean r1 = super.a(r2, r3, r4)
                r4 = 1
                if (r1 == 0) goto L8
                return r4
            L8:
                android.support.v4.widget.NestedScrollView r2 = (android.support.v4.widget.NestedScrollView) r2
                boolean r1 = r2.isEnabled()
                r0 = 0
                if (r1 != 0) goto L12
                return r0
            L12:
                r1 = 4096(0x1000, float:5.74E-42)
                if (r3 == r1) goto L3d
                r1 = 8192(0x2000, float:1.148E-41)
                if (r3 == r1) goto L1b
                return r0
            L1b:
                int r1 = r2.getHeight()
                int r3 = r2.getPaddingBottom()
                int r1 = r1 - r3
                int r3 = r2.getPaddingTop()
                int r1 = r1 - r3
                int r3 = r2.getScrollY()
                int r3 = r3 - r1
                int r1 = java.lang.Math.max(r3, r0)
                int r3 = r2.getScrollY()
                if (r1 == r3) goto L3c
                r2.b(r0, r1)
                return r4
            L3c:
                return r0
            L3d:
                int r1 = r2.getHeight()
                int r3 = r2.getPaddingBottom()
                int r1 = r1 - r3
                int r3 = r2.getPaddingTop()
                int r1 = r1 - r3
                int r3 = r2.getScrollY()
                int r3 = r3 + r1
                int r1 = r2.getScrollRange()
                int r1 = java.lang.Math.min(r3, r1)
                int r3 = r2.getScrollY()
                if (r1 == r3) goto L62
                r2.b(r0, r1)
                return r4
            L62:
                return r0
        }

        @Override // b.b.c.g.b
        public void b(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
                r0 = this;
                super.b(r1, r2)
                android.support.v4.widget.NestedScrollView r1 = (android.support.v4.widget.NestedScrollView) r1
                java.lang.Class<android.widget.ScrollView> r0 = android.widget.ScrollView.class
                java.lang.String r0 = r0.getName()
                r2.setClassName(r0)
                int r0 = r1.getScrollRange()
                if (r0 <= 0) goto L16
                r0 = 1
                goto L17
            L16:
                r0 = 0
            L17:
                r2.setScrollable(r0)
                int r0 = r1.getScrollX()
                r2.setScrollX(r0)
                int r0 = r1.getScrollY()
                r2.setScrollY(r0)
                int r0 = r1.getScrollX()
                b.b.c.g.z.c.a(r2, r0)
                int r0 = r1.getScrollRange()
                b.b.c.g.z.c.b(r2, r0)
                return
        }
    }

    public interface b {
        void a(android.support.v4.widget.NestedScrollView r1, int r2, int r3, int r4, int r5);
    }

    static class c extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<android.support.v4.widget.NestedScrollView.c> CREATOR = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f637b;

        static class a implements android.os.Parcelable.Creator<android.support.v4.widget.NestedScrollView.c> {
            a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public android.support.v4.widget.NestedScrollView.c createFromParcel(android.os.Parcel r1) {
                    r0 = this;
                    android.support.v4.widget.NestedScrollView$c r0 = new android.support.v4.widget.NestedScrollView$c
                    r0.<init>(r1)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ android.support.v4.widget.NestedScrollView.c createFromParcel(android.os.Parcel r1) {
                    r0 = this;
                    android.support.v4.widget.NestedScrollView$c r0 = r0.createFromParcel(r1)
                    return r0
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public android.support.v4.widget.NestedScrollView.c[] newArray(int r1) {
                    r0 = this;
                    android.support.v4.widget.NestedScrollView$c[] r0 = new android.support.v4.widget.NestedScrollView.c[r1]
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ android.support.v4.widget.NestedScrollView.c[] newArray(int r1) {
                    r0 = this;
                    android.support.v4.widget.NestedScrollView$c[] r0 = r0.newArray(r1)
                    return r0
            }
        }

        static {
                android.support.v4.widget.NestedScrollView$c$a r0 = new android.support.v4.widget.NestedScrollView$c$a
                r0.<init>()
                android.support.v4.widget.NestedScrollView.c.CREATOR = r0
                return
        }

        c(android.os.Parcel r1) {
                r0 = this;
                r0.<init>(r1)
                int r1 = r1.readInt()
                r0.f637b = r1
                return
        }

        c(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "HorizontalScrollView.SavedState{"
                r0.append(r1)
                int r1 = java.lang.System.identityHashCode(r2)
                java.lang.String r1 = java.lang.Integer.toHexString(r1)
                r0.append(r1)
                java.lang.String r1 = " scrollPosition="
                r0.append(r1)
                int r2 = r2.f637b
                r0.append(r2)
                java.lang.String r2 = "}"
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                return r2
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                int r0 = r0.f637b
                r1.writeInt(r0)
                return
        }
    }

    static {
            android.support.v4.widget.NestedScrollView$a r0 = new android.support.v4.widget.NestedScrollView$a
            r0.<init>()
            android.support.v4.widget.NestedScrollView.B = r0
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16843130(0x101017a, float:2.3694617E-38)
            r0[r1] = r2
            android.support.v4.widget.NestedScrollView.C = r0
            return
    }

    public NestedScrollView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public NestedScrollView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public NestedScrollView(android.content.Context r5, android.util.AttributeSet r6, int r7) {
            r4 = this;
            r4.<init>(r5, r6, r7)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r4.f636c = r0
            r0 = 1
            r4.h = r0
            r1 = 0
            r4.i = r1
            r2 = 0
            r4.j = r2
            r4.k = r1
            r4.n = r0
            r2 = -1
            r4.r = r2
            r2 = 2
            int[] r3 = new int[r2]
            r4.s = r3
            int[] r2 = new int[r2]
            r4.t = r2
            r4.e()
            int[] r2 = android.support.v4.widget.NestedScrollView.C
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r2, r7, r1)
            boolean r6 = r5.getBoolean(r1, r1)
            r4.setFillViewport(r6)
            r5.recycle()
            b.b.c.g.n r5 = new b.b.c.g.n
            r5.<init>(r4)
            r4.x = r5
            b.b.c.g.k r5 = new b.b.c.g.k
            r5.<init>(r4)
            r4.y = r5
            r4.setNestedScrollingEnabled(r0)
            android.support.v4.widget.NestedScrollView$a r5 = android.support.v4.widget.NestedScrollView.B
            b.b.c.g.q.a(r4, r5)
            return
    }

    private static int a(int r1, int r2, int r3) {
            if (r2 >= r3) goto Lc
            if (r1 >= 0) goto L5
            goto Lc
        L5:
            int r0 = r2 + r1
            if (r0 <= r3) goto Lb
            int r3 = r3 - r2
            return r3
        Lb:
            return r1
        Lc:
            r1 = 0
            return r1
    }

    private android.view.View a(boolean r12, int r13, int r14) {
            r11 = this;
            r0 = 2
            java.util.ArrayList r11 = r11.getFocusables(r0)
            int r0 = r11.size()
            r1 = 0
            r2 = 0
            r3 = r1
            r4 = r3
        Ld:
            if (r3 >= r0) goto L53
            java.lang.Object r5 = r11.get(r3)
            android.view.View r5 = (android.view.View) r5
            int r6 = r5.getTop()
            int r7 = r5.getBottom()
            r8 = 1
            if (r13 >= r7) goto L50
            if (r6 >= r14) goto L50
            if (r13 >= r6) goto L28
            if (r7 >= r14) goto L28
            r9 = r8
            goto L29
        L28:
            r9 = r1
        L29:
            if (r2 != 0) goto L2e
            r2 = r5
            r4 = r9
            goto L50
        L2e:
            if (r12 == 0) goto L36
            int r10 = r2.getTop()
            if (r6 < r10) goto L3e
        L36:
            if (r12 != 0) goto L40
            int r6 = r2.getBottom()
            if (r7 <= r6) goto L40
        L3e:
            r6 = r8
            goto L41
        L40:
            r6 = r1
        L41:
            if (r4 == 0) goto L48
            if (r9 == 0) goto L50
            if (r6 == 0) goto L50
            goto L4f
        L48:
            if (r9 == 0) goto L4d
            r2 = r5
            r4 = r8
            goto L50
        L4d:
            if (r6 == 0) goto L50
        L4f:
            r2 = r5
        L50:
            int r3 = r3 + 1
            goto Ld
        L53:
            return r2
    }

    private void a(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getActionIndex()
            int r1 = r4.getPointerId(r0)
            int r2 = r3.r
            if (r1 != r2) goto L25
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            float r1 = r4.getY(r0)
            int r1 = (int) r1
            r3.g = r1
            int r4 = r4.getPointerId(r0)
            r3.r = r4
            android.view.VelocityTracker r3 = r3.l
            if (r3 == 0) goto L25
            r3.clear()
        L25:
            return
    }

    private boolean a() {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
            if (r0 <= 0) goto L2c
            android.view.View r0 = r4.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r0 = r0.getHeight()
            int r3 = r2.topMargin
            int r0 = r0 + r3
            int r2 = r2.bottomMargin
            int r0 = r0 + r2
            int r2 = r4.getHeight()
            int r3 = r4.getPaddingTop()
            int r2 = r2 - r3
            int r4 = r4.getPaddingBottom()
            int r2 = r2 - r4
            if (r0 <= r2) goto L2c
            r1 = 1
        L2c:
            return r1
    }

    private boolean a(android.graphics.Rect r3, boolean r4) {
            r2 = this;
            int r3 = r2.a(r3)
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = r0
        La:
            if (r1 == 0) goto L15
            if (r4 == 0) goto L12
            r2.scrollBy(r0, r3)
            goto L15
        L12:
            r2.a(r0, r3)
        L15:
            return r1
    }

    private boolean a(android.view.View r3) {
            r2 = this;
            int r0 = r2.getHeight()
            r1 = 0
            boolean r2 = r2.a(r3, r1, r0)
            r2 = r2 ^ 1
            return r2
    }

    private boolean a(android.view.View r2, int r3, int r4) {
            r1 = this;
            android.graphics.Rect r0 = r1.f636c
            r2.getDrawingRect(r0)
            android.graphics.Rect r0 = r1.f636c
            r1.offsetDescendantRectToMyCoords(r2, r0)
            android.graphics.Rect r2 = r1.f636c
            int r2 = r2.bottom
            int r2 = r2 + r3
            int r0 = r1.getScrollY()
            if (r2 < r0) goto L23
            android.graphics.Rect r2 = r1.f636c
            int r2 = r2.top
            int r2 = r2 - r3
            int r1 = r1.getScrollY()
            int r1 = r1 + r4
            if (r2 > r1) goto L23
            r1 = 1
            goto L24
        L23:
            r1 = 0
        L24:
            return r1
    }

    private static boolean a(android.view.View r2, android.view.View r3) {
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            android.view.ViewParent r2 = r2.getParent()
            boolean r1 = r2 instanceof android.view.ViewGroup
            if (r1 == 0) goto L15
            android.view.View r2 = (android.view.View) r2
            boolean r2 = a(r2, r3)
            if (r2 == 0) goto L15
            goto L16
        L15:
            r0 = 0
        L16:
            return r0
    }

    private void b() {
            r1 = this;
            r0 = 0
            r1.k = r0
            r1.g()
            r1.f(r0)
            android.widget.EdgeEffect r0 = r1.e
            if (r0 == 0) goto L15
            r0.onRelease()
            android.widget.EdgeEffect r1 = r1.f
            r1.onRelease()
        L15:
            return
    }

    private void b(android.view.View r2) {
            r1 = this;
            android.graphics.Rect r0 = r1.f636c
            r2.getDrawingRect(r0)
            android.graphics.Rect r0 = r1.f636c
            r1.offsetDescendantRectToMyCoords(r2, r0)
            android.graphics.Rect r2 = r1.f636c
            int r2 = r1.a(r2)
            if (r2 == 0) goto L16
            r0 = 0
            r1.scrollBy(r0, r2)
        L16:
            return
    }

    private boolean b(int r7, int r8, int r9) {
            r6 = this;
            int r0 = r6.getHeight()
            int r1 = r6.getScrollY()
            int r0 = r0 + r1
            r2 = 0
            r3 = 1
            r4 = 33
            if (r7 != r4) goto L11
            r4 = r3
            goto L12
        L11:
            r4 = r2
        L12:
            android.view.View r5 = r6.a(r4, r8, r9)
            if (r5 != 0) goto L19
            r5 = r6
        L19:
            if (r8 < r1) goto L1e
            if (r9 > r0) goto L1e
            goto L28
        L1e:
            if (r4 == 0) goto L22
            int r8 = r8 - r1
            goto L24
        L22:
            int r8 = r9 - r0
        L24:
            r6.g(r8)
            r2 = r3
        L28:
            android.view.View r6 = r6.findFocus()
            if (r5 == r6) goto L31
            r5.requestFocus(r7)
        L31:
            return r2
    }

    private void c() {
            r2 = this;
            int r0 = r2.getOverScrollMode()
            r1 = 2
            if (r0 == r1) goto L1e
            android.widget.EdgeEffect r0 = r2.e
            if (r0 != 0) goto L23
            android.content.Context r0 = r2.getContext()
            android.widget.EdgeEffect r1 = new android.widget.EdgeEffect
            r1.<init>(r0)
            r2.e = r1
            android.widget.EdgeEffect r1 = new android.widget.EdgeEffect
            r1.<init>(r0)
            r2.f = r1
            goto L23
        L1e:
            r0 = 0
            r2.e = r0
            r2.f = r0
        L23:
            return
    }

    private void d() {
            r1 = this;
            android.view.VelocityTracker r0 = r1.l
            if (r0 != 0) goto Lb
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r1.l = r0
            goto Le
        Lb:
            r0.clear()
        Le:
            return
    }

    private boolean d(int r4, int r5) {
            r3 = this;
            int r0 = r3.getChildCount()
            r1 = 0
            if (r0 <= 0) goto L2a
            int r0 = r3.getScrollY()
            android.view.View r3 = r3.getChildAt(r1)
            int r2 = r3.getTop()
            int r2 = r2 - r0
            if (r5 < r2) goto L2a
            int r2 = r3.getBottom()
            int r2 = r2 - r0
            if (r5 >= r2) goto L2a
            int r5 = r3.getLeft()
            if (r4 < r5) goto L2a
            int r3 = r3.getRight()
            if (r4 >= r3) goto L2a
            r1 = 1
        L2a:
            return r1
    }

    private void e() {
            r2 = this;
            android.widget.OverScroller r0 = new android.widget.OverScroller
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            r2.d = r0
            r0 = 1
            r2.setFocusable(r0)
            r0 = 262144(0x40000, float:3.67342E-40)
            r2.setDescendantFocusability(r0)
            r0 = 0
            r2.setWillNotDraw(r0)
            android.content.Context r0 = r2.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r1 = r0.getScaledTouchSlop()
            r2.o = r1
            int r1 = r0.getScaledMinimumFlingVelocity()
            r2.p = r1
            int r0 = r0.getScaledMaximumFlingVelocity()
            r2.q = r0
            return
    }

    private void f() {
            r1 = this;
            android.view.VelocityTracker r0 = r1.l
            if (r0 != 0) goto La
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r1.l = r0
        La:
            return
    }

    private void g() {
            r1 = this;
            android.view.VelocityTracker r0 = r1.l
            if (r0 == 0) goto La
            r0.recycle()
            r0 = 0
            r1.l = r0
        La:
            return
    }

    private void g(int r3) {
            r2 = this;
            if (r3 == 0) goto Le
            boolean r0 = r2.n
            r1 = 0
            if (r0 == 0) goto Lb
            r2.a(r1, r3)
            goto Le
        Lb:
            r2.scrollBy(r1, r3)
        Le:
            return
    }

    private float getVerticalScrollFactorCompat() {
            r5 = this;
            float r0 = r5.z
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L35
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r1 = r5.getContext()
            android.content.res.Resources$Theme r2 = r1.getTheme()
            r3 = 16842829(0x101004d, float:2.3693774E-38)
            r4 = 1
            boolean r2 = r2.resolveAttribute(r3, r0, r4)
            if (r2 == 0) goto L2d
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r0 = r0.getDimension(r1)
            r5.z = r0
            goto L35
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Expected theme to define listPreferredItemHeight."
            r5.<init>(r0)
            throw r5
        L35:
            float r5 = r5.z
            return r5
    }

    private void h(int r5) {
            r4 = this;
            int r0 = r4.getScrollY()
            if (r0 > 0) goto L8
            if (r5 <= 0) goto L11
        L8:
            int r1 = r4.getScrollRange()
            if (r0 < r1) goto L13
            if (r5 >= 0) goto L11
            goto L13
        L11:
            r0 = 0
            goto L14
        L13:
            r0 = 1
        L14:
            float r1 = (float) r5
            r2 = 0
            boolean r3 = r4.dispatchNestedPreFling(r2, r1)
            if (r3 != 0) goto L22
            r4.dispatchNestedFling(r2, r1, r0)
            r4.b(r5)
        L22:
            return
    }

    protected int a(android.graphics.Rect r11) {
            r10 = this;
            int r0 = r10.getChildCount()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r10.getHeight()
            int r2 = r10.getScrollY()
            int r3 = r2 + r0
            int r4 = r10.getVerticalFadingEdgeLength()
            int r5 = r11.top
            if (r5 <= 0) goto L1b
            int r2 = r2 + r4
        L1b:
            android.view.View r5 = r10.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r6 = (android.widget.FrameLayout.LayoutParams) r6
            int r7 = r11.bottom
            int r8 = r5.getHeight()
            int r9 = r6.topMargin
            int r8 = r8 + r9
            int r9 = r6.bottomMargin
            int r8 = r8 + r9
            if (r7 >= r8) goto L36
            int r4 = r3 - r4
            goto L37
        L36:
            r4 = r3
        L37:
            int r7 = r11.bottom
            if (r7 <= r4) goto L5a
            int r7 = r11.top
            if (r7 <= r2) goto L5a
            int r10 = r11.height()
            if (r10 <= r0) goto L49
            int r10 = r11.top
            int r10 = r10 - r2
            goto L4c
        L49:
            int r10 = r11.bottom
            int r10 = r10 - r4
        L4c:
            int r10 = r10 + r1
            int r11 = r5.getBottom()
            int r0 = r6.bottomMargin
            int r11 = r11 + r0
            int r11 = r11 - r3
            int r1 = java.lang.Math.min(r10, r11)
            goto L7a
        L5a:
            int r3 = r11.top
            if (r3 >= r2) goto L7a
            int r3 = r11.bottom
            if (r3 >= r4) goto L7a
            int r3 = r11.height()
            if (r3 <= r0) goto L6d
            int r11 = r11.bottom
            int r4 = r4 - r11
            int r1 = r1 - r4
            goto L71
        L6d:
            int r11 = r11.top
            int r2 = r2 - r11
            int r1 = r1 - r2
        L71:
            int r10 = r10.getScrollY()
            int r10 = -r10
            int r1 = java.lang.Math.max(r1, r10)
        L7a:
            return r1
    }

    public final void a(int r5, int r6) {
            r4 = this;
            int r0 = r4.getChildCount()
            if (r0 != 0) goto L7
            return
        L7:
            long r0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            long r2 = r4.f635b
            long r0 = r0 - r2
            r2 = 250(0xfa, double:1.235E-321)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L5d
            r5 = 0
            android.view.View r0 = r4.getChildAt(r5)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r0 = r0.getHeight()
            int r2 = r1.topMargin
            int r0 = r0 + r2
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
            int r1 = r4.getHeight()
            int r2 = r4.getPaddingTop()
            int r1 = r1 - r2
            int r2 = r4.getPaddingBottom()
            int r1 = r1 - r2
            int r2 = r4.getScrollY()
            int r0 = r0 - r1
            int r0 = java.lang.Math.max(r5, r0)
            int r6 = r6 + r2
            int r6 = java.lang.Math.min(r6, r0)
            int r6 = java.lang.Math.max(r5, r6)
            int r6 = r6 - r2
            int r0 = r4.getScrollY()
            r4.v = r0
            android.widget.OverScroller r0 = r4.d
            int r1 = r4.getScrollX()
            r0.startScroll(r1, r2, r5, r6)
            b.b.c.g.q.l(r4)
            goto L6d
        L5d:
            android.widget.OverScroller r0 = r4.d
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L6a
            android.widget.OverScroller r0 = r4.d
            r0.abortAnimation()
        L6a:
            r4.scrollBy(r5, r6)
        L6d:
            long r5 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            r4.f635b = r5
            return
    }

    @Override // b.b.c.g.l
    public void a(android.view.View r2, int r3) {
            r1 = this;
            b.b.c.g.n r0 = r1.x
            r0.a(r2, r3)
            r1.f(r3)
            return
    }

    @Override // b.b.c.g.l
    public void a(android.view.View r8, int r9, int r10, int r11, int r12, int r13) {
            r7 = this;
            int r8 = r7.getScrollY()
            r9 = 0
            r7.scrollBy(r9, r12)
            int r9 = r7.getScrollY()
            int r2 = r9 - r8
            int r4 = r12 - r2
            r1 = 0
            r3 = 0
            r5 = 0
            r0 = r7
            r6 = r13
            r0.a(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // b.b.c.g.l
    public void a(android.view.View r7, int r8, int r9, int[] r10, int r11) {
            r6 = this;
            r4 = 0
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r11
            r0.a(r1, r2, r3, r4, r5)
            return
    }

    @Override // b.b.c.g.l
    public void a(android.view.View r2, android.view.View r3, int r4, int r5) {
            r1 = this;
            b.b.c.g.n r0 = r1.x
            r0.a(r2, r3, r4, r5)
            r2 = 2
            r1.c(r2, r5)
            return
    }

    public boolean a(int r8) {
            r7 = this;
            android.view.View r0 = r7.findFocus()
            if (r0 != r7) goto L7
            r0 = 0
        L7:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r7, r0, r8)
            int r2 = r7.getMaxScrollAmount()
            if (r1 == 0) goto L36
            int r3 = r7.getHeight()
            boolean r3 = r7.a(r1, r2, r3)
            if (r3 == 0) goto L36
            android.graphics.Rect r2 = r7.f636c
            r1.getDrawingRect(r2)
            android.graphics.Rect r2 = r7.f636c
            r7.offsetDescendantRectToMyCoords(r1, r2)
            android.graphics.Rect r2 = r7.f636c
            int r2 = r7.a(r2)
            r7.g(r2)
            r1.requestFocus(r8)
            goto L7e
        L36:
            r1 = 33
            r3 = 0
            r4 = 130(0x82, float:1.82E-43)
            if (r8 != r1) goto L48
            int r1 = r7.getScrollY()
            if (r1 >= r2) goto L48
            int r2 = r7.getScrollY()
            goto L74
        L48:
            if (r8 != r4) goto L74
            int r1 = r7.getChildCount()
            if (r1 <= 0) goto L74
            android.view.View r1 = r7.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r5 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r5 = (android.widget.FrameLayout.LayoutParams) r5
            int r1 = r1.getBottom()
            int r5 = r5.bottomMargin
            int r1 = r1 + r5
            int r5 = r7.getScrollY()
            int r6 = r7.getHeight()
            int r5 = r5 + r6
            int r6 = r7.getPaddingBottom()
            int r5 = r5 - r6
            int r1 = r1 - r5
            int r2 = java.lang.Math.min(r1, r2)
        L74:
            if (r2 != 0) goto L77
            return r3
        L77:
            if (r8 != r4) goto L7a
            goto L7b
        L7a:
            int r2 = -r2
        L7b:
            r7.g(r2)
        L7e:
            if (r0 == 0) goto L9b
            boolean r8 = r0.isFocused()
            if (r8 == 0) goto L9b
            boolean r8 = r7.a(r0)
            if (r8 == 0) goto L9b
            int r8 = r7.getDescendantFocusability()
            r0 = 131072(0x20000, float:1.83671E-40)
            r7.setDescendantFocusability(r0)
            r7.requestFocus()
            r7.setDescendantFocusability(r8)
        L9b:
            r7 = 1
            return r7
    }

    boolean a(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L13
            r2 = r5
            goto L14
        L13:
            r2 = r4
        L14:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L20
            r3 = r5
            goto L21
        L20:
            r3 = r4
        L21:
            if (r1 == 0) goto L2a
            if (r1 != r5) goto L28
            if (r2 == 0) goto L28
            goto L2a
        L28:
            r2 = r4
            goto L2b
        L2a:
            r2 = r5
        L2b:
            if (r1 == 0) goto L34
            if (r1 != r5) goto L32
            if (r3 == 0) goto L32
            goto L34
        L32:
            r1 = r4
            goto L35
        L34:
            r1 = r5
        L35:
            int r3 = r15 + r13
            if (r2 != 0) goto L3b
            r2 = r4
            goto L3d
        L3b:
            r2 = r19
        L3d:
            int r6 = r16 + r14
            if (r1 != 0) goto L43
            r1 = r4
            goto L45
        L43:
            r1 = r20
        L45:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L50
            r3 = r2
            r2 = r5
            goto L56
        L50:
            if (r3 >= r7) goto L55
            r2 = r5
            r3 = r7
            goto L56
        L55:
            r2 = r4
        L56:
            if (r6 <= r1) goto L5b
            r6 = r1
            r1 = r5
            goto L61
        L5b:
            if (r6 >= r8) goto L60
            r1 = r5
            r6 = r8
            goto L61
        L60:
            r1 = r4
        L61:
            if (r1 == 0) goto L80
            boolean r7 = r12.d(r5)
            if (r7 != 0) goto L80
            android.widget.OverScroller r7 = r0.d
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L80:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L87
            if (r1 == 0) goto L88
        L87:
            r4 = r5
        L88:
            return r4
    }

    public boolean a(int r8, int r9, int r10, int r11, int[] r12, int r13) {
            r7 = this;
            b.b.c.g.k r0 = r7.y
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            boolean r7 = r0.a(r1, r2, r3, r4, r5, r6)
            return r7
    }

    public boolean a(int r7, int r8, int[] r9, int[] r10, int r11) {
            r6 = this;
            b.b.c.g.k r0 = r6.y
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            boolean r6 = r0.a(r1, r2, r3, r4, r5)
            return r6
    }

    public boolean a(android.view.KeyEvent r6) {
            r5 = this;
            android.graphics.Rect r0 = r5.f636c
            r0.setEmpty()
            boolean r0 = r5.a()
            r1 = 0
            r2 = 130(0x82, float:1.82E-43)
            if (r0 != 0) goto L36
            boolean r0 = r5.isFocused()
            if (r0 == 0) goto L35
            int r6 = r6.getKeyCode()
            r0 = 4
            if (r6 == r0) goto L35
            android.view.View r6 = r5.findFocus()
            if (r6 != r5) goto L22
            r6 = 0
        L22:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r6 = r0.findNextFocus(r5, r6, r2)
            if (r6 == 0) goto L35
            if (r6 == r5) goto L35
            boolean r5 = r6.requestFocus(r2)
            if (r5 == 0) goto L35
            r1 = 1
        L35:
            return r1
        L36:
            int r0 = r6.getAction()
            if (r0 != 0) goto L79
            int r0 = r6.getKeyCode()
            r3 = 19
            r4 = 33
            if (r0 == r3) goto L6a
            r3 = 20
            if (r0 == r3) goto L5a
            r3 = 62
            if (r0 == r3) goto L4f
            goto L79
        L4f:
            boolean r6 = r6.isShiftPressed()
            if (r6 == 0) goto L56
            r2 = r4
        L56:
            r5.e(r2)
            goto L79
        L5a:
            boolean r6 = r6.isAltPressed()
            if (r6 != 0) goto L65
            boolean r1 = r5.a(r2)
            goto L79
        L65:
            boolean r1 = r5.c(r2)
            goto L79
        L6a:
            boolean r6 = r6.isAltPressed()
            if (r6 != 0) goto L75
            boolean r1 = r5.a(r4)
            goto L79
        L75:
            boolean r1 = r5.c(r4)
        L79:
            return r1
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r2) {
            r1 = this;
            int r0 = r1.getChildCount()
            if (r0 > 0) goto La
            super.addView(r2)
            return
        La:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "ScrollView can host only one direct child"
            r1.<init>(r2)
            throw r1
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r2, int r3) {
            r1 = this;
            int r0 = r1.getChildCount()
            if (r0 > 0) goto La
            super.addView(r2, r3)
            return
        La:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "ScrollView can host only one direct child"
            r1.<init>(r2)
            throw r1
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r2, int r3, android.view.ViewGroup.LayoutParams r4) {
            r1 = this;
            int r0 = r1.getChildCount()
            if (r0 > 0) goto La
            super.addView(r2, r3, r4)
            return
        La:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "ScrollView can host only one direct child"
            r1.<init>(r2)
            throw r1
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            int r0 = r1.getChildCount()
            if (r0 > 0) goto La
            super.addView(r2, r3)
            return
        La:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "ScrollView can host only one direct child"
            r1.<init>(r2)
            throw r1
    }

    public void b(int r14) {
            r13 = this;
            int r0 = r13.getChildCount()
            if (r0 <= 0) goto L2c
            r0 = 2
            r1 = 1
            r13.c(r0, r1)
            android.widget.OverScroller r2 = r13.d
            int r3 = r13.getScrollX()
            int r4 = r13.getScrollY()
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = 2147483647(0x7fffffff, float:NaN)
            r11 = 0
            r12 = 0
            r6 = r14
            r2.fling(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            int r14 = r13.getScrollY()
            r13.v = r14
            b.b.c.g.q.l(r13)
        L2c:
            return
    }

    public final void b(int r2, int r3) {
            r1 = this;
            int r0 = r1.getScrollX()
            int r2 = r2 - r0
            int r0 = r1.getScrollY()
            int r3 = r3 - r0
            r1.a(r2, r3)
            return
    }

    @Override // b.b.c.g.l
    public boolean b(android.view.View r1, android.view.View r2, int r3, int r4) {
            r0 = this;
            r0 = r3 & 2
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean c(int r6) {
            r5 = this;
            r0 = 1
            r1 = 0
            r2 = 130(0x82, float:1.82E-43)
            if (r6 != r2) goto L8
            r2 = r0
            goto L9
        L8:
            r2 = r1
        L9:
            int r3 = r5.getHeight()
            android.graphics.Rect r4 = r5.f636c
            r4.top = r1
            r4.bottom = r3
            if (r2 == 0) goto L3d
            int r1 = r5.getChildCount()
            if (r1 <= 0) goto L3d
            int r1 = r1 - r0
            android.view.View r0 = r5.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            android.graphics.Rect r2 = r5.f636c
            int r0 = r0.getBottom()
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
            int r1 = r5.getPaddingBottom()
            int r0 = r0 + r1
            r2.bottom = r0
            android.graphics.Rect r0 = r5.f636c
            int r1 = r0.bottom
            int r1 = r1 - r3
            r0.top = r1
        L3d:
            android.graphics.Rect r0 = r5.f636c
            int r1 = r0.top
            int r0 = r0.bottom
            boolean r5 = r5.b(r6, r1, r0)
            return r5
    }

    public boolean c(int r1, int r2) {
            r0 = this;
            b.b.c.g.k r0 = r0.y
            boolean r0 = r0.a(r1, r2)
            return r0
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
            r0 = this;
            int r0 = super.computeHorizontalScrollExtent()
            return r0
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
            r0 = this;
            int r0 = super.computeHorizontalScrollOffset()
            return r0
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
            r0 = this;
            int r0 = super.computeHorizontalScrollRange()
            return r0
    }

    @Override // android.view.View
    public void computeScroll() {
            r18 = this;
            r10 = r18
            android.widget.OverScroller r0 = r10.d
            boolean r0 = r0.computeScrollOffset()
            r12 = 1
            if (r0 == 0) goto L93
            android.widget.OverScroller r0 = r10.d
            r0.getCurrX()
            android.widget.OverScroller r0 = r10.d
            int r13 = r0.getCurrY()
            int r0 = r10.v
            int r6 = r13 - r0
            r1 = 0
            int[] r3 = r10.t
            r4 = 0
            r5 = 1
            r0 = r18
            r2 = r6
            boolean r0 = r0.a(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L2d
            int[] r0 = r10.t
            r0 = r0[r12]
            int r6 = r6 - r0
        L2d:
            r14 = r6
            if (r14 == 0) goto L8d
            int r15 = r18.getScrollRange()
            int r9 = r18.getScrollY()
            r1 = 0
            int r3 = r18.getScrollX()
            r5 = 0
            r7 = 0
            r8 = 0
            r16 = 0
            r0 = r18
            r2 = r14
            r4 = r9
            r6 = r15
            r11 = r9
            r9 = r16
            r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            int r0 = r18.getScrollY()
            int r2 = r0 - r11
            int r4 = r14 - r2
            r3 = 0
            r5 = 0
            r6 = 1
            r0 = r18
            boolean r0 = r0.a(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L8d
            int r0 = r18.getOverScrollMode()
            if (r0 == 0) goto L6e
            if (r0 != r12) goto L6b
            if (r15 <= 0) goto L6b
            goto L6e
        L6b:
            r17 = 0
            goto L70
        L6e:
            r17 = r12
        L70:
            if (r17 == 0) goto L8d
            r18.c()
            if (r13 > 0) goto L86
            if (r11 <= 0) goto L86
            android.widget.EdgeEffect r0 = r10.e
        L7b:
            android.widget.OverScroller r1 = r10.d
            float r1 = r1.getCurrVelocity()
            int r1 = (int) r1
            r0.onAbsorb(r1)
            goto L8d
        L86:
            if (r13 < r15) goto L8d
            if (r11 >= r15) goto L8d
            android.widget.EdgeEffect r0 = r10.f
            goto L7b
        L8d:
            r10.v = r13
            b.b.c.g.q.l(r18)
            goto L9f
        L93:
            boolean r0 = r10.d(r12)
            if (r0 == 0) goto L9c
            r10.f(r12)
        L9c:
            r0 = 0
            r10.v = r0
        L9f:
            return
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
            r0 = this;
            int r0 = super.computeVerticalScrollExtent()
            return r0
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
            r1 = this;
            int r1 = super.computeVerticalScrollOffset()
            r0 = 0
            int r1 = java.lang.Math.max(r0, r1)
            return r1
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
            r4 = this;
            int r0 = r4.getChildCount()
            int r1 = r4.getHeight()
            int r2 = r4.getPaddingBottom()
            int r1 = r1 - r2
            int r2 = r4.getPaddingTop()
            int r1 = r1 - r2
            if (r0 != 0) goto L15
            return r1
        L15:
            r0 = 0
            android.view.View r2 = r4.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r2 = r2.getBottom()
            int r3 = r3.bottomMargin
            int r2 = r2 + r3
            int r4 = r4.getScrollY()
            int r1 = r2 - r1
            int r0 = java.lang.Math.max(r0, r1)
            if (r4 >= 0) goto L35
            int r2 = r2 - r4
            goto L39
        L35:
            if (r4 <= r0) goto L39
            int r4 = r4 - r0
            int r2 = r2 + r4
        L39:
            return r2
    }

    public boolean d(int r1) {
            r0 = this;
            b.b.c.g.k r0 = r0.y
            boolean r0 = r0.a(r1)
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent r2) {
            r1 = this;
            boolean r0 = super.dispatchKeyEvent(r2)
            if (r0 != 0) goto Lf
            boolean r1 = r1.a(r2)
            if (r1 == 0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            goto L10
        Lf:
            r1 = 1
        L10:
            return r1
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float r1, float r2, boolean r3) {
            r0 = this;
            b.b.c.g.k r0 = r0.y
            boolean r0 = r0.a(r1, r2, r3)
            return r0
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float r1, float r2) {
            r0 = this;
            b.b.c.g.k r0 = r0.y
            boolean r0 = r0.a(r1, r2)
            return r0
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int r7, int r8, int[] r9, int[] r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            boolean r6 = r0.a(r1, r2, r3, r4, r5)
            return r6
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int r8, int r9, int r10, int r11, int[] r12) {
            r7 = this;
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            boolean r7 = r0.a(r1, r2, r3, r4, r5, r6)
            return r7
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas r11) {
            r10 = this;
            super.draw(r11)
            android.widget.EdgeEffect r0 = r10.e
            if (r0 == 0) goto Le2
            int r0 = r10.getScrollY()
            android.widget.EdgeEffect r1 = r10.e
            boolean r1 = r1.isFinished()
            r2 = 0
            r3 = 21
            if (r1 != 0) goto L73
            int r1 = r11.save()
            int r4 = r10.getWidth()
            int r5 = r10.getHeight()
            int r6 = java.lang.Math.min(r2, r0)
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 < r3) goto L33
            boolean r7 = r10.getClipToPadding()
            if (r7 == 0) goto L31
            goto L33
        L31:
            r7 = r2
            goto L42
        L33:
            int r7 = r10.getPaddingLeft()
            int r8 = r10.getPaddingRight()
            int r7 = r7 + r8
            int r4 = r4 - r7
            int r7 = r10.getPaddingLeft()
            int r7 = r7 + r2
        L42:
            int r8 = android.os.Build.VERSION.SDK_INT
            if (r8 < r3) goto L5b
            boolean r8 = r10.getClipToPadding()
            if (r8 == 0) goto L5b
            int r8 = r10.getPaddingTop()
            int r9 = r10.getPaddingBottom()
            int r8 = r8 + r9
            int r5 = r5 - r8
            int r8 = r10.getPaddingTop()
            int r6 = r6 + r8
        L5b:
            float r7 = (float) r7
            float r6 = (float) r6
            r11.translate(r7, r6)
            android.widget.EdgeEffect r6 = r10.e
            r6.setSize(r4, r5)
            android.widget.EdgeEffect r4 = r10.e
            boolean r4 = r4.draw(r11)
            if (r4 == 0) goto L70
            b.b.c.g.q.l(r10)
        L70:
            r11.restoreToCount(r1)
        L73:
            android.widget.EdgeEffect r1 = r10.f
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto Le2
            int r1 = r11.save()
            int r4 = r10.getWidth()
            int r5 = r10.getHeight()
            int r6 = r10.getScrollRange()
            int r0 = java.lang.Math.max(r6, r0)
            int r0 = r0 + r5
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r3) goto L9a
            boolean r6 = r10.getClipToPadding()
            if (r6 == 0) goto La9
        L9a:
            int r6 = r10.getPaddingLeft()
            int r7 = r10.getPaddingRight()
            int r6 = r6 + r7
            int r4 = r4 - r6
            int r6 = r10.getPaddingLeft()
            int r2 = r2 + r6
        La9:
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r3) goto Lc2
            boolean r3 = r10.getClipToPadding()
            if (r3 == 0) goto Lc2
            int r3 = r10.getPaddingTop()
            int r6 = r10.getPaddingBottom()
            int r3 = r3 + r6
            int r5 = r5 - r3
            int r3 = r10.getPaddingBottom()
            int r0 = r0 - r3
        Lc2:
            int r2 = r2 - r4
            float r2 = (float) r2
            float r0 = (float) r0
            r11.translate(r2, r0)
            r0 = 1127481344(0x43340000, float:180.0)
            float r2 = (float) r4
            r3 = 0
            r11.rotate(r0, r2, r3)
            android.widget.EdgeEffect r0 = r10.f
            r0.setSize(r4, r5)
            android.widget.EdgeEffect r0 = r10.f
            boolean r0 = r0.draw(r11)
            if (r0 == 0) goto Ldf
            b.b.c.g.q.l(r10)
        Ldf:
            r11.restoreToCount(r1)
        Le2:
            return
    }

    public boolean e(int r5) {
            r4 = this;
            r0 = 1
            r1 = 0
            r2 = 130(0x82, float:1.82E-43)
            if (r5 != r2) goto L8
            r2 = r0
            goto L9
        L8:
            r2 = r1
        L9:
            int r3 = r4.getHeight()
            if (r2 == 0) goto L40
            android.graphics.Rect r1 = r4.f636c
            int r2 = r4.getScrollY()
            int r2 = r2 + r3
            r1.top = r2
            int r1 = r4.getChildCount()
            if (r1 <= 0) goto L51
            int r1 = r1 - r0
            android.view.View r0 = r4.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r0 = r0.getBottom()
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
            int r1 = r4.getPaddingBottom()
            int r0 = r0 + r1
            android.graphics.Rect r1 = r4.f636c
            int r2 = r1.top
            int r2 = r2 + r3
            if (r2 <= r0) goto L51
            int r0 = r0 - r3
            r1.top = r0
            goto L51
        L40:
            android.graphics.Rect r0 = r4.f636c
            int r2 = r4.getScrollY()
            int r2 = r2 - r3
            r0.top = r2
            android.graphics.Rect r0 = r4.f636c
            int r2 = r0.top
            if (r2 >= 0) goto L51
            r0.top = r1
        L51:
            android.graphics.Rect r0 = r4.f636c
            int r1 = r0.top
            int r3 = r3 + r1
            r0.bottom = r3
            boolean r4 = r4.b(r5, r1, r3)
            return r4
    }

    public void f(int r1) {
            r0 = this;
            b.b.c.g.k r0 = r0.y
            r0.b(r1)
            return
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
            r5 = this;
            int r0 = r5.getChildCount()
            if (r0 != 0) goto L8
            r5 = 0
            return r5
        L8:
            r0 = 0
            android.view.View r0 = r5.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r2 = r5.getVerticalFadingEdgeLength()
            int r3 = r5.getHeight()
            int r4 = r5.getPaddingBottom()
            int r3 = r3 - r4
            int r0 = r0.getBottom()
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
            int r5 = r5.getScrollY()
            int r0 = r0 - r5
            int r0 = r0 - r3
            if (r0 >= r2) goto L33
            float r5 = (float) r0
            float r0 = (float) r2
            float r5 = r5 / r0
            return r5
        L33:
            r5 = 1065353216(0x3f800000, float:1.0)
            return r5
    }

    public int getMaxScrollAmount() {
            r1 = this;
            int r1 = r1.getHeight()
            float r1 = (float) r1
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r0
            int r1 = (int) r1
            return r1
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
            r0 = this;
            b.b.c.g.n r0 = r0.x
            int r0 = r0.a()
            return r0
    }

    int getScrollRange() {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
            if (r0 <= 0) goto L2e
            android.view.View r0 = r4.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r0 = r0.getHeight()
            int r3 = r2.topMargin
            int r0 = r0 + r3
            int r2 = r2.bottomMargin
            int r0 = r0 + r2
            int r2 = r4.getHeight()
            int r3 = r4.getPaddingTop()
            int r2 = r2 - r3
            int r4 = r4.getPaddingBottom()
            int r2 = r2 - r4
            int r0 = r0 - r2
            int r1 = java.lang.Math.max(r1, r0)
        L2e:
            return r1
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
            r1 = this;
            int r0 = r1.getChildCount()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r0 = r1.getVerticalFadingEdgeLength()
            int r1 = r1.getScrollY()
            if (r1 >= r0) goto L16
            float r1 = (float) r1
            float r0 = (float) r0
            float r1 = r1 / r0
            return r1
        L16:
            r1 = 1065353216(0x3f800000, float:1.0)
            return r1
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
            r1 = this;
            r0 = 0
            boolean r1 = r1.d(r0)
            return r1
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
            r0 = this;
            b.b.c.g.k r0 = r0.y
            boolean r0 = r0.a()
            return r0
    }

    @Override // android.view.ViewGroup
    protected void measureChild(android.view.View r2, int r3, int r4) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            int r0 = r1.getPaddingLeft()
            int r1 = r1.getPaddingRight()
            int r0 = r0 + r1
            int r1 = r4.width
            int r1 = android.widget.FrameLayout.getChildMeasureSpec(r3, r0, r1)
            r3 = 0
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            r2.measure(r1, r3)
            return
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(android.view.View r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            int r5 = r0.getPaddingLeft()
            int r0 = r0.getPaddingRight()
            int r5 = r5 + r0
            int r0 = r4.leftMargin
            int r5 = r5 + r0
            int r0 = r4.rightMargin
            int r5 = r5 + r0
            int r5 = r5 + r3
            int r0 = r4.width
            int r0 = android.widget.FrameLayout.getChildMeasureSpec(r2, r5, r0)
            int r2 = r4.topMargin
            int r3 = r4.bottomMargin
            int r2 = r2 + r3
            r3 = 0
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r3)
            r1.measure(r0, r2)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            r0 = 0
            r1.i = r0
            return
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getSource()
            r0 = r0 & 2
            r1 = 0
            if (r0 == 0) goto L44
            int r0 = r4.getAction()
            r2 = 8
            if (r0 == r2) goto L12
            goto L44
        L12:
            boolean r0 = r3.k
            if (r0 != 0) goto L44
            r0 = 9
            float r4 = r4.getAxisValue(r0)
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 == 0) goto L44
            float r0 = r3.getVerticalScrollFactorCompat()
            float r4 = r4 * r0
            int r4 = (int) r4
            int r0 = r3.getScrollRange()
            int r2 = r3.getScrollY()
            int r4 = r2 - r4
            if (r4 >= 0) goto L35
            r0 = r1
            goto L39
        L35:
            if (r4 <= r0) goto L38
            goto L39
        L38:
            r0 = r4
        L39:
            if (r0 == r2) goto L44
            int r4 = r3.getScrollX()
            super.scrollTo(r4, r0)
            r3 = 1
            return r3
        L44:
            return r1
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
            r11 = this;
            int r0 = r12.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto Ld
            boolean r3 = r11.k
            if (r3 == 0) goto Ld
            return r2
        Ld:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = 0
            if (r0 == 0) goto La2
            r4 = -1
            if (r0 == r2) goto L7d
            if (r0 == r1) goto L24
            r1 = 3
            if (r0 == r1) goto L7d
            r1 = 6
            if (r0 == r1) goto L1f
            goto Ld9
        L1f:
            r11.a(r12)
            goto Ld9
        L24:
            int r0 = r11.r
            if (r0 != r4) goto L2a
            goto Ld9
        L2a:
            int r5 = r12.findPointerIndex(r0)
            if (r5 != r4) goto L4d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r1 = "Invalid pointerId="
            r12.append(r1)
            r12.append(r0)
            java.lang.String r0 = " in onInterceptTouchEvent"
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            java.lang.String r0 = "NestedScrollView"
            android.util.Log.e(r0, r12)
            goto Ld9
        L4d:
            float r0 = r12.getY(r5)
            int r0 = (int) r0
            int r4 = r11.g
            int r4 = r0 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r11.o
            if (r4 <= r5) goto Ld9
            int r4 = r11.getNestedScrollAxes()
            r1 = r1 & r4
            if (r1 != 0) goto Ld9
            r11.k = r2
            r11.g = r0
            r11.f()
            android.view.VelocityTracker r0 = r11.l
            r0.addMovement(r12)
            r11.u = r3
            android.view.ViewParent r12 = r11.getParent()
            if (r12 == 0) goto Ld9
            r12.requestDisallowInterceptTouchEvent(r2)
            goto Ld9
        L7d:
            r11.k = r3
            r11.r = r4
            r11.g()
            android.widget.OverScroller r4 = r11.d
            int r5 = r11.getScrollX()
            int r6 = r11.getScrollY()
            r7 = 0
            r8 = 0
            r9 = 0
            int r10 = r11.getScrollRange()
            boolean r12 = r4.springBack(r5, r6, r7, r8, r9, r10)
            if (r12 == 0) goto L9e
            b.b.c.g.q.l(r11)
        L9e:
            r11.f(r3)
            goto Ld9
        La2:
            float r0 = r12.getY()
            int r0 = (int) r0
            float r4 = r12.getX()
            int r4 = (int) r4
            boolean r4 = r11.d(r4, r0)
            if (r4 != 0) goto Lb8
            r11.k = r3
            r11.g()
            goto Ld9
        Lb8:
            r11.g = r0
            int r0 = r12.getPointerId(r3)
            r11.r = r0
            r11.d()
            android.view.VelocityTracker r0 = r11.l
            r0.addMovement(r12)
            android.widget.OverScroller r12 = r11.d
            r12.computeScrollOffset()
            android.widget.OverScroller r12 = r11.d
            boolean r12 = r12.isFinished()
            r12 = r12 ^ r2
            r11.k = r12
            r11.c(r1, r3)
        Ld9:
            boolean r11 = r11.k
            return r11
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            super.onLayout(r2, r3, r4, r5, r6)
            r2 = 0
            r1.h = r2
            android.view.View r3 = r1.j
            if (r3 == 0) goto L15
            boolean r3 = a(r3, r1)
            if (r3 == 0) goto L15
            android.view.View r3 = r1.j
            r1.b(r3)
        L15:
            r3 = 0
            r1.j = r3
            boolean r5 = r1.i
            if (r5 != 0) goto L63
            android.support.v4.widget.NestedScrollView$c r5 = r1.w
            if (r5 == 0) goto L2d
            int r5 = r1.getScrollX()
            android.support.v4.widget.NestedScrollView$c r0 = r1.w
            int r0 = r0.f637b
            r1.scrollTo(r5, r0)
            r1.w = r3
        L2d:
            int r3 = r1.getChildCount()
            if (r3 <= 0) goto L47
            android.view.View r2 = r1.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r2 = r2.getMeasuredHeight()
            int r5 = r3.topMargin
            int r2 = r2 + r5
            int r3 = r3.bottomMargin
            int r2 = r2 + r3
        L47:
            int r6 = r6 - r4
            int r3 = r1.getPaddingTop()
            int r6 = r6 - r3
            int r3 = r1.getPaddingBottom()
            int r6 = r6 - r3
            int r3 = r1.getScrollY()
            int r2 = a(r3, r6, r2)
            if (r2 == r3) goto L63
            int r3 = r1.getScrollX()
            r1.scrollTo(r3, r2)
        L63:
            int r2 = r1.getScrollX()
            int r3 = r1.getScrollY()
            r1.scrollTo(r2, r3)
            r2 = 1
            r1.i = r2
            return
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int r5, int r6) {
            r4 = this;
            super.onMeasure(r5, r6)
            boolean r0 = r4.m
            if (r0 != 0) goto L8
            return
        L8:
            int r6 = android.view.View.MeasureSpec.getMode(r6)
            if (r6 != 0) goto Lf
            return
        Lf:
            int r6 = r4.getChildCount()
            if (r6 <= 0) goto L58
            r6 = 0
            android.view.View r6 = r4.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            int r1 = r6.getMeasuredHeight()
            int r2 = r4.getMeasuredHeight()
            int r3 = r4.getPaddingTop()
            int r2 = r2 - r3
            int r3 = r4.getPaddingBottom()
            int r2 = r2 - r3
            int r3 = r0.topMargin
            int r2 = r2 - r3
            int r3 = r0.bottomMargin
            int r2 = r2 - r3
            if (r1 >= r2) goto L58
            int r1 = r4.getPaddingLeft()
            int r4 = r4.getPaddingRight()
            int r1 = r1 + r4
            int r4 = r0.leftMargin
            int r1 = r1 + r4
            int r4 = r0.rightMargin
            int r1 = r1 + r4
            int r4 = r0.width
            int r4 = android.widget.FrameLayout.getChildMeasureSpec(r5, r1, r4)
            r5 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r5)
            r6.measure(r4, r5)
        L58:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.b.c.g.m
    public boolean onNestedFling(android.view.View r1, float r2, float r3, boolean r4) {
            r0 = this;
            if (r4 != 0) goto L8
            int r1 = (int) r3
            r0.h(r1)
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.b.c.g.m
    public boolean onNestedPreFling(android.view.View r1, float r2, float r3) {
            r0 = this;
            boolean r0 = r0.dispatchNestedPreFling(r2, r3)
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.b.c.g.m
    public void onNestedPreScroll(android.view.View r7, int r8, int r9, int[] r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.a(r1, r2, r3, r4, r5)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.b.c.g.m
    public void onNestedScroll(android.view.View r8, int r9, int r10, int r11, int r12) {
            r7 = this;
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.a(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.b.c.g.m
    public void onNestedScrollAccepted(android.view.View r2, android.view.View r3, int r4) {
            r1 = this;
            r0 = 0
            r1.a(r2, r3, r4, r0)
            return
    }

    @Override // android.view.View
    protected void onOverScrolled(int r1, int r2, boolean r3, boolean r4) {
            r0 = this;
            super.scrollTo(r1, r2)
            return
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int r3, android.graphics.Rect r4) {
            r2 = this;
            r0 = 2
            if (r3 != r0) goto L6
            r3 = 130(0x82, float:1.82E-43)
            goto Lb
        L6:
            r0 = 1
            if (r3 != r0) goto Lb
            r3 = 33
        Lb:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            if (r4 != 0) goto L17
            r1 = 0
            android.view.View r0 = r0.findNextFocus(r2, r1, r3)
            goto L1b
        L17:
            android.view.View r0 = r0.findNextFocusFromRect(r2, r4, r3)
        L1b:
            r1 = 0
            if (r0 != 0) goto L1f
            return r1
        L1f:
            boolean r2 = r2.a(r0)
            if (r2 == 0) goto L26
            return r1
        L26:
            boolean r2 = r0.requestFocus(r3, r4)
            return r2
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.support.v4.widget.NestedScrollView.c
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            android.support.v4.widget.NestedScrollView$c r2 = (android.support.v4.widget.NestedScrollView.c) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            r1.w = r2
            r1.requestLayout()
            return
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            android.support.v4.widget.NestedScrollView$c r1 = new android.support.v4.widget.NestedScrollView$c
            r1.<init>(r0)
            int r2 = r2.getScrollY()
            r1.f637b = r2
            return r1
    }

    @Override // android.view.View
    protected void onScrollChanged(int r7, int r8, int r9, int r10) {
            r6 = this;
            super.onScrollChanged(r7, r8, r9, r10)
            android.support.v4.widget.NestedScrollView$b r0 = r6.A
            if (r0 == 0) goto Lf
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.a(r1, r2, r3, r4, r5)
        Lf:
            return
    }

    @Override // android.view.View
    protected void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            android.view.View r1 = r0.findFocus()
            if (r1 == 0) goto L26
            if (r0 != r1) goto Lc
            goto L26
        Lc:
            r2 = 0
            boolean r2 = r0.a(r1, r2, r4)
            if (r2 == 0) goto L26
            android.graphics.Rect r2 = r0.f636c
            r1.getDrawingRect(r2)
            android.graphics.Rect r2 = r0.f636c
            r0.offsetDescendantRectToMyCoords(r1, r2)
            android.graphics.Rect r1 = r0.f636c
            int r1 = r0.a(r1)
            r0.g(r1)
        L26:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.b.c.g.m
    public boolean onStartNestedScroll(android.view.View r2, android.view.View r3, int r4) {
            r1 = this;
            r0 = 0
            boolean r1 = r1.b(r2, r3, r4, r0)
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.b.c.g.m
    public void onStopNestedScroll(android.view.View r2) {
            r1 = this;
            r0 = 0
            r1.a(r2, r0)
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r24) {
            r23 = this;
            r10 = r23
            r11 = r24
            r23.f()
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r24)
            int r0 = r24.getActionMasked()
            r13 = 0
            if (r0 != 0) goto L14
            r10.u = r13
        L14:
            int r1 = r10.u
            float r1 = (float) r1
            r14 = 0
            r12.offsetLocation(r14, r1)
            r1 = 2
            r15 = 1
            if (r0 == 0) goto L21a
            r2 = -1
            if (r0 == r15) goto L1e2
            if (r0 == r1) goto L7f
            r1 = 3
            if (r0 == r1) goto L54
            r1 = 5
            if (r0 == r1) goto L41
            r1 = 6
            if (r0 == r1) goto L2f
            goto L252
        L2f:
            r23.a(r24)
            int r0 = r10.r
            int r0 = r11.findPointerIndex(r0)
            float r0 = r11.getY(r0)
            int r0 = (int) r0
            r10.g = r0
            goto L252
        L41:
            int r0 = r24.getActionIndex()
            float r1 = r11.getY(r0)
            int r1 = (int) r1
            r10.g = r1
            int r0 = r11.getPointerId(r0)
            r10.r = r0
            goto L252
        L54:
            boolean r0 = r10.k
            if (r0 == 0) goto L78
            int r0 = r23.getChildCount()
            if (r0 <= 0) goto L78
            android.widget.OverScroller r3 = r10.d
            int r4 = r23.getScrollX()
            int r5 = r23.getScrollY()
            r6 = 0
            r7 = 0
            r8 = 0
            int r9 = r23.getScrollRange()
            boolean r0 = r3.springBack(r4, r5, r6, r7, r8, r9)
            if (r0 == 0) goto L78
        L75:
            b.b.c.g.q.l(r23)
        L78:
            r10.r = r2
            r23.b()
            goto L252
        L7f:
            int r0 = r10.r
            int r9 = r11.findPointerIndex(r0)
            if (r9 != r2) goto La6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid pointerId="
            r0.append(r1)
            int r1 = r10.r
            r0.append(r1)
            java.lang.String r1 = " in onTouchEvent"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "NestedScrollView"
            android.util.Log.e(r1, r0)
            goto L252
        La6:
            float r0 = r11.getY(r9)
            int r6 = (int) r0
            int r0 = r10.g
            int r7 = r0 - r6
            r1 = 0
            int[] r3 = r10.t
            int[] r4 = r10.s
            r5 = 0
            r0 = r23
            r2 = r7
            boolean r0 = r0.a(r1, r2, r3, r4, r5)
            if (r0 == 0) goto Ld4
            int[] r0 = r10.t
            r0 = r0[r15]
            int r7 = r7 - r0
            int[] r0 = r10.s
            r0 = r0[r15]
            float r0 = (float) r0
            r12.offsetLocation(r14, r0)
            int r0 = r10.u
            int[] r1 = r10.s
            r1 = r1[r15]
            int r0 = r0 + r1
            r10.u = r0
        Ld4:
            boolean r0 = r10.k
            if (r0 != 0) goto Lf2
            int r0 = java.lang.Math.abs(r7)
            int r1 = r10.o
            if (r0 <= r1) goto Lf2
            android.view.ViewParent r0 = r23.getParent()
            if (r0 == 0) goto Le9
            r0.requestDisallowInterceptTouchEvent(r15)
        Le9:
            r10.k = r15
            int r0 = r10.o
            if (r7 <= 0) goto Lf1
            int r7 = r7 - r0
            goto Lf2
        Lf1:
            int r7 = r7 + r0
        Lf2:
            r8 = r7
            boolean r0 = r10.k
            if (r0 == 0) goto L252
            int[] r0 = r10.s
            r0 = r0[r15]
            int r6 = r6 - r0
            r10.g = r6
            int r16 = r23.getScrollY()
            int r7 = r23.getScrollRange()
            int r0 = r23.getOverScrollMode()
            if (r0 == 0) goto L114
            if (r0 != r15) goto L111
            if (r7 <= 0) goto L111
            goto L114
        L111:
            r17 = r13
            goto L116
        L114:
            r17 = r15
        L116:
            r1 = 0
            r3 = 0
            int r4 = r23.getScrollY()
            r5 = 0
            r18 = 0
            r19 = 0
            r20 = 1
            r0 = r23
            r2 = r8
            r6 = r7
            r21 = r7
            r7 = r18
            r14 = r8
            r8 = r19
            r22 = r9
            r9 = r20
            boolean r0 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r0 == 0) goto L143
            boolean r0 = r10.d(r13)
            if (r0 != 0) goto L143
            android.view.VelocityTracker r0 = r10.l
            r0.clear()
        L143:
            int r0 = r23.getScrollY()
            int r2 = r0 - r16
            int r4 = r14 - r2
            r1 = 0
            r3 = 0
            int[] r5 = r10.s
            r6 = 0
            r0 = r23
            boolean r0 = r0.a(r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L173
            int r0 = r10.g
            int[] r1 = r10.s
            r2 = r1[r15]
            int r0 = r0 - r2
            r10.g = r0
            r0 = r1[r15]
            float r0 = (float) r0
            r1 = 0
            r12.offsetLocation(r1, r0)
            int r0 = r10.u
            int[] r1 = r10.s
            r1 = r1[r15]
            int r0 = r0 + r1
            r10.u = r0
            goto L252
        L173:
            if (r17 == 0) goto L252
            r23.c()
            int r0 = r16 + r14
            if (r0 >= 0) goto L1a2
            android.widget.EdgeEffect r0 = r10.e
            float r1 = (float) r14
            int r2 = r23.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            r2 = r22
            float r2 = r11.getX(r2)
            int r3 = r23.getWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            android.support.v4.widget.f.a(r0, r1, r2)
            android.widget.EdgeEffect r0 = r10.f
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L1cc
            android.widget.EdgeEffect r0 = r10.f
        L19e:
            r0.onRelease()
            goto L1cc
        L1a2:
            r1 = r21
            r2 = r22
            if (r0 <= r1) goto L1cc
            android.widget.EdgeEffect r0 = r10.f
            float r1 = (float) r14
            int r3 = r23.getHeight()
            float r3 = (float) r3
            float r1 = r1 / r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r11.getX(r2)
            int r4 = r23.getWidth()
            float r4 = (float) r4
            float r2 = r2 / r4
            float r3 = r3 - r2
            android.support.v4.widget.f.a(r0, r1, r3)
            android.widget.EdgeEffect r0 = r10.e
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L1cc
            android.widget.EdgeEffect r0 = r10.e
            goto L19e
        L1cc:
            android.widget.EdgeEffect r0 = r10.e
            if (r0 == 0) goto L252
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L1de
            android.widget.EdgeEffect r0 = r10.f
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L252
        L1de:
            b.b.c.g.q.l(r23)
            goto L252
        L1e2:
            android.view.VelocityTracker r0 = r10.l
            r1 = 1000(0x3e8, float:1.401E-42)
            int r3 = r10.q
            float r3 = (float) r3
            r0.computeCurrentVelocity(r1, r3)
            int r1 = r10.r
            float r0 = r0.getYVelocity(r1)
            int r0 = (int) r0
            int r1 = java.lang.Math.abs(r0)
            int r3 = r10.p
            if (r1 <= r3) goto L201
            int r0 = -r0
            r10.h(r0)
            goto L78
        L201:
            android.widget.OverScroller r3 = r10.d
            int r4 = r23.getScrollX()
            int r5 = r23.getScrollY()
            r6 = 0
            r7 = 0
            r8 = 0
            int r9 = r23.getScrollRange()
            boolean r0 = r3.springBack(r4, r5, r6, r7, r8, r9)
            if (r0 == 0) goto L78
            goto L75
        L21a:
            int r0 = r23.getChildCount()
            if (r0 != 0) goto L221
            return r13
        L221:
            android.widget.OverScroller r0 = r10.d
            boolean r0 = r0.isFinished()
            r0 = r0 ^ r15
            r10.k = r0
            if (r0 == 0) goto L235
            android.view.ViewParent r0 = r23.getParent()
            if (r0 == 0) goto L235
            r0.requestDisallowInterceptTouchEvent(r15)
        L235:
            android.widget.OverScroller r0 = r10.d
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L242
            android.widget.OverScroller r0 = r10.d
            r0.abortAnimation()
        L242:
            float r0 = r24.getY()
            int r0 = (int) r0
            r10.g = r0
            int r0 = r11.getPointerId(r13)
            r10.r = r0
            r10.c(r1, r13)
        L252:
            android.view.VelocityTracker r0 = r10.l
            if (r0 == 0) goto L259
            r0.addMovement(r12)
        L259:
            r12.recycle()
            return r15
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(android.view.View r2, android.view.View r3) {
            r1 = this;
            boolean r0 = r1.h
            if (r0 != 0) goto L8
            r1.b(r3)
            goto La
        L8:
            r1.j = r3
        La:
            super.requestChildFocus(r2, r3)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(android.view.View r3, android.graphics.Rect r4, boolean r5) {
            r2 = this;
            int r0 = r3.getLeft()
            int r1 = r3.getScrollX()
            int r0 = r0 - r1
            int r1 = r3.getTop()
            int r3 = r3.getScrollY()
            int r1 = r1 - r3
            r4.offset(r0, r1)
            boolean r2 = r2.a(r4, r5)
            return r2
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r0.g()
        L5:
            super.requestDisallowInterceptTouchEvent(r1)
            return
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
            r1 = this;
            r0 = 1
            r1.h = r0
            super.requestLayout()
            return
    }

    @Override // android.view.View
    public void scrollTo(int r7, int r8) {
            r6 = this;
            int r0 = r6.getChildCount()
            if (r0 <= 0) goto L58
            r0 = 0
            android.view.View r0 = r6.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r2 = r6.getWidth()
            int r3 = r6.getPaddingLeft()
            int r2 = r2 - r3
            int r3 = r6.getPaddingRight()
            int r2 = r2 - r3
            int r3 = r0.getWidth()
            int r4 = r1.leftMargin
            int r3 = r3 + r4
            int r4 = r1.rightMargin
            int r3 = r3 + r4
            int r4 = r6.getHeight()
            int r5 = r6.getPaddingTop()
            int r4 = r4 - r5
            int r5 = r6.getPaddingBottom()
            int r4 = r4 - r5
            int r0 = r0.getHeight()
            int r5 = r1.topMargin
            int r0 = r0 + r5
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
            int r7 = a(r7, r2, r3)
            int r8 = a(r8, r4, r0)
            int r0 = r6.getScrollX()
            if (r7 != r0) goto L55
            int r0 = r6.getScrollY()
            if (r8 == r0) goto L58
        L55:
            super.scrollTo(r7, r8)
        L58:
            return
    }

    public void setFillViewport(boolean r2) {
            r1 = this;
            boolean r0 = r1.m
            if (r2 == r0) goto L9
            r1.m = r2
            r1.requestLayout()
        L9:
            return
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean r1) {
            r0 = this;
            b.b.c.g.k r0 = r0.y
            r0.a(r1)
            return
    }

    public void setOnScrollChangeListener(android.support.v4.widget.NestedScrollView.b r1) {
            r0 = this;
            r0.A = r1
            return
    }

    public void setSmoothScrollingEnabled(boolean r1) {
            r0 = this;
            r0.n = r1
            return
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // android.view.View
    public boolean startNestedScroll(int r2) {
            r1 = this;
            r0 = 0
            boolean r1 = r1.c(r2, r0)
            return r1
    }

    @Override // android.view.View, b.b.c.g.j
    public void stopNestedScroll() {
            r1 = this;
            r0 = 0
            r1.f(r0)
            return
    }
}
