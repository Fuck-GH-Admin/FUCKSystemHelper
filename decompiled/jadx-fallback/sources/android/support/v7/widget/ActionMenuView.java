package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends android.support.v7.widget.g0 implements android.support.v7.view.menu.h.b, android.support.v7.view.menu.p {
    private int A;
    android.support.v7.widget.ActionMenuView.e B;
    private android.support.v7.view.menu.h q;
    private android.content.Context r;
    private int s;
    private boolean t;
    private android.support.v7.widget.c u;
    private android.support.v7.view.menu.o.a v;
    android.support.v7.view.menu.h.a w;
    private boolean x;
    private int y;
    private int z;

    public interface a {
        boolean a();

        boolean b();
    }

    private static class b implements android.support.v7.view.menu.o.a {
        b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.support.v7.view.menu.o.a
        public void a(android.support.v7.view.menu.h r1, boolean r2) {
                r0 = this;
                return
        }

        @Override // android.support.v7.view.menu.o.a
        public boolean a(android.support.v7.view.menu.h r1) {
                r0 = this;
                r0 = 0
                return r0
        }
    }

    public static class c extends android.support.v7.widget.g0.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @android.view.ViewDebug.ExportedProperty
        public boolean f793c;

        @android.view.ViewDebug.ExportedProperty
        public int d;

        @android.view.ViewDebug.ExportedProperty
        public int e;

        @android.view.ViewDebug.ExportedProperty
        public boolean f;

        @android.view.ViewDebug.ExportedProperty
        public boolean g;
        boolean h;

        public c(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.f793c = r1
                return
        }

        public c(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public c(android.support.v7.widget.ActionMenuView.c r1) {
                r0 = this;
                r0.<init>(r1)
                boolean r1 = r1.f793c
                r0.f793c = r1
                return
        }

        public c(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    private class d implements android.support.v7.view.menu.h.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.support.v7.widget.ActionMenuView f794b;

        d(android.support.v7.widget.ActionMenuView r1) {
                r0 = this;
                r0.f794b = r1
                r0.<init>()
                return
        }

        @Override // android.support.v7.view.menu.h.a
        public void a(android.support.v7.view.menu.h r1) {
                r0 = this;
                android.support.v7.widget.ActionMenuView r0 = r0.f794b
                android.support.v7.view.menu.h$a r0 = r0.w
                if (r0 == 0) goto L9
                r0.a(r1)
            L9:
                return
        }

        @Override // android.support.v7.view.menu.h.a
        public boolean a(android.support.v7.view.menu.h r1, android.view.MenuItem r2) {
                r0 = this;
                android.support.v7.widget.ActionMenuView r0 = r0.f794b
                android.support.v7.widget.ActionMenuView$e r0 = r0.B
                if (r0 == 0) goto Le
                boolean r0 = r0.onMenuItemClick(r2)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }
    }

    public interface e {
        boolean onMenuItemClick(android.view.MenuItem r1);
    }

    public ActionMenuView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ActionMenuView(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            r4 = 0
            r2.setBaselineAligned(r4)
            android.content.res.Resources r0 = r3.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r1 = 1113587712(0x42600000, float:56.0)
            float r1 = r1 * r0
            int r1 = (int) r1
            r2.z = r1
            r1 = 1082130432(0x40800000, float:4.0)
            float r0 = r0 * r1
            int r0 = (int) r0
            r2.A = r0
            r2.r = r3
            r2.s = r4
            return
    }

    static int a(android.view.View r5, int r6, int r7, int r8, int r9) {
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r0 = (android.support.v7.widget.ActionMenuView.c) r0
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            int r1 = r1 - r9
            int r8 = android.view.View.MeasureSpec.getMode(r8)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            boolean r9 = r5 instanceof android.support.v7.view.menu.ActionMenuItemView
            if (r9 == 0) goto L1b
            r9 = r5
            android.support.v7.view.menu.ActionMenuItemView r9 = (android.support.v7.view.menu.ActionMenuItemView) r9
            goto L1c
        L1b:
            r9 = 0
        L1c:
            r1 = 1
            r2 = 0
            if (r9 == 0) goto L28
            boolean r9 = r9.d()
            if (r9 == 0) goto L28
            r9 = r1
            goto L29
        L28:
            r9 = r2
        L29:
            r3 = 2
            if (r7 <= 0) goto L4c
            if (r9 == 0) goto L30
            if (r7 < r3) goto L4c
        L30:
            int r7 = r7 * r6
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r4)
            r5.measure(r7, r8)
            int r7 = r5.getMeasuredWidth()
            int r4 = r7 / r6
            int r7 = r7 % r6
            if (r7 == 0) goto L45
            int r4 = r4 + 1
        L45:
            if (r9 == 0) goto L4a
            if (r4 >= r3) goto L4a
            goto L4d
        L4a:
            r3 = r4
            goto L4d
        L4c:
            r3 = r2
        L4d:
            boolean r7 = r0.f793c
            if (r7 != 0) goto L54
            if (r9 == 0) goto L54
            goto L55
        L54:
            r1 = r2
        L55:
            r0.f = r1
            r0.d = r3
            int r6 = r6 * r3
            r7 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
            r5.measure(r6, r8)
            return r3
    }

    private void c(int r30, int r31) {
            r29 = this;
            r0 = r29
            int r1 = android.view.View.MeasureSpec.getMode(r31)
            int r2 = android.view.View.MeasureSpec.getSize(r30)
            int r3 = android.view.View.MeasureSpec.getSize(r31)
            int r4 = r29.getPaddingLeft()
            int r5 = r29.getPaddingRight()
            int r4 = r4 + r5
            int r5 = r29.getPaddingTop()
            int r6 = r29.getPaddingBottom()
            int r5 = r5 + r6
            r6 = -2
            r7 = r31
            int r6 = android.view.ViewGroup.getChildMeasureSpec(r7, r5, r6)
            int r2 = r2 - r4
            int r4 = r0.z
            int r7 = r2 / r4
            int r8 = r2 % r4
            r9 = 0
            if (r7 != 0) goto L35
            r0.setMeasuredDimension(r2, r9)
            return
        L35:
            int r8 = r8 / r7
            int r4 = r4 + r8
            int r8 = r29.getChildCount()
            r10 = r9
            r12 = r10
            r13 = r12
            r14 = r13
            r15 = r14
            r16 = r15
            r17 = 0
        L44:
            if (r12 >= r8) goto Lc3
            android.view.View r11 = r0.getChildAt(r12)
            int r9 = r11.getVisibility()
            r19 = r3
            r3 = 8
            if (r9 != r3) goto L56
            goto Lbd
        L56:
            boolean r3 = r11 instanceof android.support.v7.view.menu.ActionMenuItemView
            int r14 = r14 + 1
            if (r3 == 0) goto L65
            int r9 = r0.A
            r20 = r14
            r14 = 0
            r11.setPadding(r9, r14, r9, r14)
            goto L68
        L65:
            r20 = r14
            r14 = 0
        L68:
            android.view.ViewGroup$LayoutParams r9 = r11.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r9 = (android.support.v7.widget.ActionMenuView.c) r9
            r9.h = r14
            r9.e = r14
            r9.d = r14
            r9.f = r14
            r9.leftMargin = r14
            r9.rightMargin = r14
            if (r3 == 0) goto L87
            r3 = r11
            android.support.v7.view.menu.ActionMenuItemView r3 = (android.support.v7.view.menu.ActionMenuItemView) r3
            boolean r3 = r3.d()
            if (r3 == 0) goto L87
            r3 = 1
            goto L88
        L87:
            r3 = 0
        L88:
            r9.g = r3
            boolean r3 = r9.f793c
            if (r3 == 0) goto L90
            r3 = 1
            goto L91
        L90:
            r3 = r7
        L91:
            int r3 = a(r11, r4, r3, r6, r5)
            int r15 = java.lang.Math.max(r15, r3)
            boolean r14 = r9.f
            if (r14 == 0) goto L9f
            int r16 = r16 + 1
        L9f:
            boolean r9 = r9.f793c
            if (r9 == 0) goto La4
            r13 = 1
        La4:
            int r7 = r7 - r3
            int r9 = r11.getMeasuredHeight()
            int r10 = java.lang.Math.max(r10, r9)
            r9 = 1
            if (r3 != r9) goto Lba
            int r3 = r9 << r12
            r11 = r10
            long r9 = (long) r3
            long r9 = r17 | r9
            r17 = r9
            r10 = r11
            goto Lbb
        Lba:
            r11 = r10
        Lbb:
            r14 = r20
        Lbd:
            int r12 = r12 + 1
            r3 = r19
            r9 = 0
            goto L44
        Lc3:
            r19 = r3
            r3 = 2
            if (r13 == 0) goto Lcc
            if (r14 != r3) goto Lcc
            r5 = 1
            goto Lcd
        Lcc:
            r5 = 0
        Lcd:
            r9 = 0
        Lce:
            if (r16 <= 0) goto L16f
            if (r7 <= 0) goto L16f
            r20 = 2147483647(0x7fffffff, float:NaN)
            r12 = r20
            r3 = 0
            r11 = 0
            r20 = 0
        Ldb:
            if (r11 >= r8) goto L10e
            android.view.View r24 = r0.getChildAt(r11)
            android.view.ViewGroup$LayoutParams r24 = r24.getLayoutParams()
            r25 = r9
            r9 = r24
            android.support.v7.widget.ActionMenuView$c r9 = (android.support.v7.widget.ActionMenuView.c) r9
            r24 = r10
            boolean r10 = r9.f
            if (r10 != 0) goto Lf2
            goto L107
        Lf2:
            int r9 = r9.d
            r22 = 1
            if (r9 >= r12) goto Lfd
            long r20 = r22 << r11
            r12 = r9
            r3 = 1
            goto L107
        Lfd:
            if (r9 != r12) goto L107
            long r9 = r22 << r11
            long r9 = r20 | r9
            int r3 = r3 + 1
            r20 = r9
        L107:
            int r11 = r11 + 1
            r10 = r24
            r9 = r25
            goto Ldb
        L10e:
            r25 = r9
            r24 = r10
            long r17 = r17 | r20
            if (r3 <= r7) goto L11a
            r11 = r1
            r26 = r2
            goto L176
        L11a:
            int r12 = r12 + 1
            r3 = 0
        L11d:
            if (r3 >= r8) goto L169
            android.view.View r9 = r0.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r10 = (android.support.v7.widget.ActionMenuView.c) r10
            r26 = r2
            r11 = 1
            int r2 = r11 << r3
            r11 = r1
            long r1 = (long) r2
            long r22 = r20 & r1
            r27 = 0
            int r22 = (r22 > r27 ? 1 : (r22 == r27 ? 0 : -1))
            if (r22 != 0) goto L141
            int r9 = r10.d
            if (r9 != r12) goto L13e
            long r17 = r17 | r1
        L13e:
            r27 = r5
            goto L161
        L141:
            if (r5 == 0) goto L155
            boolean r1 = r10.g
            if (r1 == 0) goto L155
            r1 = 1
            if (r7 != r1) goto L155
            int r2 = r0.A
            int r1 = r2 + r4
            r27 = r5
            r5 = 0
            r9.setPadding(r1, r5, r2, r5)
            goto L157
        L155:
            r27 = r5
        L157:
            int r1 = r10.d
            r2 = 1
            int r1 = r1 + r2
            r10.d = r1
            r10.h = r2
            int r7 = r7 + (-1)
        L161:
            int r3 = r3 + 1
            r1 = r11
            r2 = r26
            r5 = r27
            goto L11d
        L169:
            r10 = r24
            r3 = 2
            r9 = 1
            goto Lce
        L16f:
            r11 = r1
            r26 = r2
            r25 = r9
            r24 = r10
        L176:
            r1 = 1
            if (r13 != 0) goto L17d
            if (r14 != r1) goto L17d
            r2 = r1
            goto L17e
        L17d:
            r2 = 0
        L17e:
            if (r7 <= 0) goto L233
            r9 = 0
            int r3 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r3 == 0) goto L233
            int r14 = r14 - r1
            if (r7 < r14) goto L18d
            if (r2 != 0) goto L18d
            if (r15 <= r1) goto L233
        L18d:
            int r1 = java.lang.Long.bitCount(r17)
            float r1 = (float) r1
            if (r2 != 0) goto L1ce
            r2 = 1
            long r2 = r17 & r2
            r9 = 0
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            r3 = 1056964608(0x3f000000, float:0.5)
            r14 = 0
            if (r2 == 0) goto L1b0
            android.view.View r2 = r0.getChildAt(r14)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r2 = (android.support.v7.widget.ActionMenuView.c) r2
            boolean r2 = r2.g
            if (r2 != 0) goto L1b0
            float r1 = r1 - r3
        L1b0:
            int r2 = r8 + (-1)
            r5 = 1
            int r9 = r5 << r2
            long r9 = (long) r9
            long r9 = r17 & r9
            r12 = 0
            int r5 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r5 == 0) goto L1cf
            android.view.View r2 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r2 = (android.support.v7.widget.ActionMenuView.c) r2
            boolean r2 = r2.g
            if (r2 != 0) goto L1cf
            float r1 = r1 - r3
            goto L1cf
        L1ce:
            r14 = 0
        L1cf:
            r2 = 0
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 <= 0) goto L1d9
            int r7 = r7 * r4
            float r2 = (float) r7
            float r2 = r2 / r1
            int r1 = (int) r2
            goto L1da
        L1d9:
            r1 = r14
        L1da:
            r2 = r14
            r9 = r25
        L1dd:
            if (r2 >= r8) goto L236
            r3 = 1
            int r5 = r3 << r2
            long r12 = (long) r5
            long r12 = r17 & r12
            r15 = 0
            int r3 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r3 != 0) goto L1ee
            r3 = 1
            r7 = 2
            goto L230
        L1ee:
            android.view.View r3 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r5 = (android.support.v7.widget.ActionMenuView.c) r5
            boolean r3 = r3 instanceof android.support.v7.view.menu.ActionMenuItemView
            if (r3 == 0) goto L211
            r5.e = r1
            r3 = 1
            r5.h = r3
            if (r2 != 0) goto L20d
            boolean r3 = r5.g
            if (r3 != 0) goto L20d
            int r3 = -r1
            r7 = 2
            int r3 = r3 / r7
            r5.leftMargin = r3
            goto L20e
        L20d:
            r7 = 2
        L20e:
            r3 = 1
            r9 = 1
            goto L230
        L211:
            r7 = 2
            boolean r3 = r5.f793c
            if (r3 == 0) goto L221
            r5.e = r1
            r3 = 1
            r5.h = r3
            int r9 = -r1
            int r9 = r9 / r7
            r5.rightMargin = r9
            r9 = r3
            goto L230
        L221:
            r3 = 1
            if (r2 == 0) goto L228
            int r10 = r1 / 2
            r5.leftMargin = r10
        L228:
            int r10 = r8 + (-1)
            if (r2 == r10) goto L230
            int r10 = r1 / 2
            r5.rightMargin = r10
        L230:
            int r2 = r2 + 1
            goto L1dd
        L233:
            r14 = 0
            r9 = r25
        L236:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r9 == 0) goto L25c
            r9 = r14
        L23b:
            if (r9 >= r8) goto L25c
            android.view.View r2 = r0.getChildAt(r9)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r3 = (android.support.v7.widget.ActionMenuView.c) r3
            boolean r5 = r3.h
            if (r5 != 0) goto L24c
            goto L259
        L24c:
            int r5 = r3.d
            int r5 = r5 * r4
            int r3 = r3.e
            int r5 = r5 + r3
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
            r2.measure(r3, r6)
        L259:
            int r9 = r9 + 1
            goto L23b
        L25c:
            if (r11 == r1) goto L261
            r3 = r24
            goto L263
        L261:
            r3 = r19
        L263:
            r2 = r26
            r0.setMeasuredDimension(r2, r3)
            return
    }

    @Override // android.support.v7.view.menu.p
    public void a(android.support.v7.view.menu.h r1) {
            r0 = this;
            r0.q = r1
            return
    }

    public void a(android.support.v7.view.menu.o.a r1, android.support.v7.view.menu.h.a r2) {
            r0 = this;
            r0.v = r1
            r0.w = r2
            return
    }

    @Override // android.support.v7.view.menu.h.b
    public boolean a(android.support.v7.view.menu.j r2) {
            r1 = this;
            android.support.v7.view.menu.h r1 = r1.q
            r0 = 0
            boolean r1 = r1.a(r2, r0)
            return r1
    }

    public void c() {
            r0 = this;
            android.support.v7.widget.c r0 = r0.u
            if (r0 == 0) goto L7
            r0.b()
        L7:
            return
    }

    @Override // android.support.v7.widget.g0, android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            if (r1 == 0) goto L8
            boolean r0 = r1 instanceof android.support.v7.widget.ActionMenuView.c
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public android.support.v7.widget.ActionMenuView.c d() {
            r1 = this;
            android.support.v7.widget.ActionMenuView$c r1 = r1.generateDefaultLayoutParams()
            r0 = 1
            r1.f793c = r0
            return r1
    }

    protected boolean d(int r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r4 + (-1)
            android.view.View r1 = r3.getChildAt(r1)
            android.view.View r2 = r3.getChildAt(r4)
            int r3 = r3.getChildCount()
            if (r4 >= r3) goto L1f
            boolean r3 = r1 instanceof android.support.v7.widget.ActionMenuView.a
            if (r3 == 0) goto L1f
            android.support.v7.widget.ActionMenuView$a r1 = (android.support.v7.widget.ActionMenuView.a) r1
            boolean r3 = r1.b()
            r0 = r0 | r3
        L1f:
            if (r4 <= 0) goto L2c
            boolean r3 = r2 instanceof android.support.v7.widget.ActionMenuView.a
            if (r3 == 0) goto L2c
            android.support.v7.widget.ActionMenuView$a r2 = (android.support.v7.widget.ActionMenuView.a) r2
            boolean r3 = r2.a()
            r0 = r0 | r3
        L2c:
            return r0
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    public boolean e() {
            r0 = this;
            android.support.v7.widget.c r0 = r0.u
            if (r0 == 0) goto Lc
            boolean r0 = r0.e()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public boolean f() {
            r0 = this;
            android.support.v7.widget.c r0 = r0.u
            if (r0 == 0) goto Lc
            boolean r0 = r0.g()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public boolean g() {
            r0 = this;
            android.support.v7.widget.c r0 = r0.u
            if (r0 == 0) goto Lc
            boolean r0 = r0.h()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @Override // android.support.v7.widget.g0, android.view.ViewGroup
    protected android.support.v7.widget.ActionMenuView.c generateDefaultLayoutParams() {
            r1 = this;
            android.support.v7.widget.ActionMenuView$c r1 = new android.support.v7.widget.ActionMenuView$c
            r0 = -2
            r1.<init>(r0, r0)
            r0 = 16
            r1.f858b = r0
            return r1
    }

    @Override // android.support.v7.widget.g0, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.support.v7.widget.g0.a generateDefaultLayoutParams() {
            r0 = this;
            android.support.v7.widget.ActionMenuView$c r0 = r0.generateDefaultLayoutParams()
            return r0
    }

    @Override // android.support.v7.widget.g0, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r0 = this;
            android.support.v7.widget.ActionMenuView$c r0 = r0.generateDefaultLayoutParams()
            return r0
    }

    @Override // android.support.v7.widget.g0, android.view.ViewGroup
    public android.support.v7.widget.ActionMenuView.c generateLayoutParams(android.util.AttributeSet r2) {
            r1 = this;
            android.support.v7.widget.ActionMenuView$c r0 = new android.support.v7.widget.ActionMenuView$c
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1, r2)
            return r0
    }

    @Override // android.support.v7.widget.g0, android.view.ViewGroup
    protected android.support.v7.widget.ActionMenuView.c generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            if (r1 == 0) goto L1c
            boolean r0 = r1 instanceof android.support.v7.widget.ActionMenuView.c
            if (r0 == 0) goto Le
            android.support.v7.widget.ActionMenuView$c r0 = new android.support.v7.widget.ActionMenuView$c
            android.support.v7.widget.ActionMenuView$c r1 = (android.support.v7.widget.ActionMenuView.c) r1
            r0.<init>(r1)
            goto L13
        Le:
            android.support.v7.widget.ActionMenuView$c r0 = new android.support.v7.widget.ActionMenuView$c
            r0.<init>(r1)
        L13:
            int r1 = r0.f858b
            if (r1 > 0) goto L1b
            r1 = 16
            r0.f858b = r1
        L1b:
            return r0
        L1c:
            android.support.v7.widget.ActionMenuView$c r0 = r0.generateDefaultLayoutParams()
            return r0
    }

    @Override // android.support.v7.widget.g0, android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.support.v7.widget.g0.a generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            android.support.v7.widget.ActionMenuView$c r0 = r0.generateLayoutParams(r1)
            return r0
    }

    @Override // android.support.v7.widget.g0, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.support.v7.widget.g0.a generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            android.support.v7.widget.ActionMenuView$c r0 = r0.generateLayoutParams(r1)
            return r0
    }

    @Override // android.support.v7.widget.g0, android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            android.support.v7.widget.ActionMenuView$c r0 = r0.generateLayoutParams(r1)
            return r0
    }

    @Override // android.support.v7.widget.g0, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            android.support.v7.widget.ActionMenuView$c r0 = r0.generateLayoutParams(r1)
            return r0
    }

    public android.view.Menu getMenu() {
            r3 = this;
            android.support.v7.view.menu.h r0 = r3.q
            if (r0 != 0) goto L3f
            android.content.Context r0 = r3.getContext()
            android.support.v7.view.menu.h r1 = new android.support.v7.view.menu.h
            r1.<init>(r0)
            r3.q = r1
            android.support.v7.widget.ActionMenuView$d r2 = new android.support.v7.widget.ActionMenuView$d
            r2.<init>(r3)
            r1.a(r2)
            android.support.v7.widget.c r1 = new android.support.v7.widget.c
            r1.<init>(r0)
            r3.u = r1
            r0 = 1
            r1.c(r0)
            android.support.v7.widget.c r0 = r3.u
            android.support.v7.view.menu.o$a r1 = r3.v
            if (r1 == 0) goto L29
            goto L2e
        L29:
            android.support.v7.widget.ActionMenuView$b r1 = new android.support.v7.widget.ActionMenuView$b
            r1.<init>()
        L2e:
            r0.a(r1)
            android.support.v7.view.menu.h r0 = r3.q
            android.support.v7.widget.c r1 = r3.u
            android.content.Context r2 = r3.r
            r0.a(r1, r2)
            android.support.v7.widget.c r0 = r3.u
            r0.a(r3)
        L3f:
            android.support.v7.view.menu.h r3 = r3.q
            return r3
    }

    public android.graphics.drawable.Drawable getOverflowIcon() {
            r0 = this;
            r0.getMenu()
            android.support.v7.widget.c r0 = r0.u
            android.graphics.drawable.Drawable r0 = r0.c()
            return r0
    }

    public int getPopupTheme() {
            r0 = this;
            int r0 = r0.s
            return r0
    }

    public int getWindowAnimations() {
            r0 = this;
            r0 = 0
            return r0
    }

    public boolean h() {
            r0 = this;
            boolean r0 = r0.t
            return r0
    }

    public android.support.v7.view.menu.h i() {
            r0 = this;
            android.support.v7.view.menu.h r0 = r0.q
            return r0
    }

    public boolean j() {
            r0 = this;
            android.support.v7.widget.c r0 = r0.u
            if (r0 == 0) goto Lc
            boolean r0 = r0.i()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration r2) {
            r1 = this;
            super.onConfigurationChanged(r2)
            android.support.v7.widget.c r2 = r1.u
            if (r2 == 0) goto L1d
            r0 = 0
            r2.a(r0)
            android.support.v7.widget.c r2 = r1.u
            boolean r2 = r2.h()
            if (r2 == 0) goto L1d
            android.support.v7.widget.c r2 = r1.u
            r2.e()
            android.support.v7.widget.c r1 = r1.u
            r1.i()
        L1d:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r0 = this;
            super.onDetachedFromWindow()
            r0.c()
            return
    }

    @Override // android.support.v7.widget.g0, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
            r17 = this;
            r0 = r17
            boolean r1 = r0.x
            if (r1 != 0) goto La
            super.onLayout(r18, r19, r20, r21, r22)
            return
        La:
            int r1 = r17.getChildCount()
            int r2 = r22 - r20
            int r2 = r2 / 2
            int r3 = r17.getDividerWidth()
            int r4 = r21 - r19
            int r5 = r17.getPaddingRight()
            int r5 = r4 - r5
            int r6 = r17.getPaddingLeft()
            int r5 = r5 - r6
            boolean r6 = android.support.v7.widget.z0.a(r17)
            r8 = 0
            r9 = 0
            r10 = 0
        L2a:
            r11 = 8
            r12 = 1
            if (r8 >= r1) goto L8e
            android.view.View r13 = r0.getChildAt(r8)
            int r14 = r13.getVisibility()
            if (r14 != r11) goto L3a
            goto L8b
        L3a:
            android.view.ViewGroup$LayoutParams r11 = r13.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r11 = (android.support.v7.widget.ActionMenuView.c) r11
            boolean r14 = r11.f793c
            if (r14 == 0) goto L7a
            int r9 = r13.getMeasuredWidth()
            boolean r14 = r0.d(r8)
            if (r14 == 0) goto L4f
            int r9 = r9 + r3
        L4f:
            int r14 = r13.getMeasuredHeight()
            if (r6 == 0) goto L5f
            int r15 = r17.getPaddingLeft()
            int r11 = r11.leftMargin
            int r15 = r15 + r11
            int r11 = r15 + r9
            goto L6f
        L5f:
            int r15 = r17.getWidth()
            int r16 = r17.getPaddingRight()
            int r15 = r15 - r16
            int r11 = r11.rightMargin
            int r11 = r15 - r11
            int r15 = r11 - r9
        L6f:
            int r16 = r14 / 2
            int r7 = r2 - r16
            int r14 = r14 + r7
            r13.layout(r15, r7, r11, r14)
            int r5 = r5 - r9
            r9 = r12
            goto L8b
        L7a:
            int r7 = r13.getMeasuredWidth()
            int r12 = r11.leftMargin
            int r7 = r7 + r12
            int r11 = r11.rightMargin
            int r7 = r7 + r11
            int r5 = r5 - r7
            boolean r7 = r0.d(r8)
            int r10 = r10 + 1
        L8b:
            int r8 = r8 + 1
            goto L2a
        L8e:
            if (r1 != r12) goto Lad
            if (r9 != 0) goto Lad
            r3 = 0
            android.view.View r0 = r0.getChildAt(r3)
            int r1 = r0.getMeasuredWidth()
            int r3 = r0.getMeasuredHeight()
            int r4 = r4 / 2
            int r5 = r1 / 2
            int r4 = r4 - r5
            int r5 = r3 / 2
            int r2 = r2 - r5
            int r1 = r1 + r4
            int r3 = r3 + r2
            r0.layout(r4, r2, r1, r3)
            return
        Lad:
            r3 = r9 ^ 1
            int r10 = r10 - r3
            if (r10 <= 0) goto Lb5
            int r3 = r5 / r10
            goto Lb6
        Lb5:
            r3 = 0
        Lb6:
            r4 = 0
            int r3 = java.lang.Math.max(r4, r3)
            if (r6 == 0) goto Lfb
            int r5 = r17.getWidth()
            int r6 = r17.getPaddingRight()
            int r5 = r5 - r6
            r7 = r4
        Lc7:
            if (r7 >= r1) goto L134
            android.view.View r4 = r0.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r6 = r4.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r6 = (android.support.v7.widget.ActionMenuView.c) r6
            int r8 = r4.getVisibility()
            if (r8 == r11) goto Lf8
            boolean r8 = r6.f793c
            if (r8 == 0) goto Lde
            goto Lf8
        Lde:
            int r8 = r6.rightMargin
            int r5 = r5 - r8
            int r8 = r4.getMeasuredWidth()
            int r9 = r4.getMeasuredHeight()
            int r10 = r9 / 2
            int r10 = r2 - r10
            int r12 = r5 - r8
            int r9 = r9 + r10
            r4.layout(r12, r10, r5, r9)
            int r4 = r6.leftMargin
            int r8 = r8 + r4
            int r8 = r8 + r3
            int r5 = r5 - r8
        Lf8:
            int r7 = r7 + 1
            goto Lc7
        Lfb:
            int r5 = r17.getPaddingLeft()
            r7 = r4
        L100:
            if (r7 >= r1) goto L134
            android.view.View r4 = r0.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r6 = r4.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r6 = (android.support.v7.widget.ActionMenuView.c) r6
            int r8 = r4.getVisibility()
            if (r8 == r11) goto L131
            boolean r8 = r6.f793c
            if (r8 == 0) goto L117
            goto L131
        L117:
            int r8 = r6.leftMargin
            int r5 = r5 + r8
            int r8 = r4.getMeasuredWidth()
            int r9 = r4.getMeasuredHeight()
            int r10 = r9 / 2
            int r10 = r2 - r10
            int r12 = r5 + r8
            int r9 = r9 + r10
            r4.layout(r5, r10, r12, r9)
            int r4 = r6.rightMargin
            int r8 = r8 + r4
            int r8 = r8 + r3
            int r5 = r5 + r8
        L131:
            int r7 = r7 + 1
            goto L100
        L134:
            return
    }

    @Override // android.support.v7.widget.g0, android.view.View
    protected void onMeasure(int r6, int r7) {
            r5 = this;
            boolean r0 = r5.x
            int r1 = android.view.View.MeasureSpec.getMode(r6)
            r2 = 1
            r3 = 0
            r4 = 1073741824(0x40000000, float:2.0)
            if (r1 != r4) goto Le
            r1 = r2
            goto Lf
        Le:
            r1 = r3
        Lf:
            r5.x = r1
            if (r0 == r1) goto L15
            r5.y = r3
        L15:
            int r0 = android.view.View.MeasureSpec.getSize(r6)
            boolean r1 = r5.x
            if (r1 == 0) goto L2a
            android.support.v7.view.menu.h r1 = r5.q
            if (r1 == 0) goto L2a
            int r4 = r5.y
            if (r0 == r4) goto L2a
            r5.y = r0
            r1.b(r2)
        L2a:
            int r0 = r5.getChildCount()
            boolean r1 = r5.x
            if (r1 == 0) goto L38
            if (r0 <= 0) goto L38
            r5.c(r6, r7)
            goto L4f
        L38:
            r1 = r3
        L39:
            if (r1 >= r0) goto L4c
            android.view.View r2 = r5.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r2 = (android.support.v7.widget.ActionMenuView.c) r2
            r2.rightMargin = r3
            r2.leftMargin = r3
            int r1 = r1 + 1
            goto L39
        L4c:
            super.onMeasure(r6, r7)
        L4f:
            return
    }

    public void setExpandedActionViewsExclusive(boolean r1) {
            r0 = this;
            android.support.v7.widget.c r0 = r0.u
            r0.b(r1)
            return
    }

    public void setOnMenuItemClickListener(android.support.v7.widget.ActionMenuView.e r1) {
            r0 = this;
            r0.B = r1
            return
    }

    public void setOverflowIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.getMenu()
            android.support.v7.widget.c r0 = r0.u
            r0.a(r1)
            return
    }

    public void setOverflowReserved(boolean r1) {
            r0 = this;
            r0.t = r1
            return
    }

    public void setPopupTheme(int r3) {
            r2 = this;
            int r0 = r2.s
            if (r0 == r3) goto L1a
            r2.s = r3
            if (r3 != 0) goto Lf
            android.content.Context r3 = r2.getContext()
            r2.r = r3
            goto L1a
        Lf:
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            r2.r = r0
        L1a:
            return
    }

    public void setPresenter(android.support.v7.widget.c r1) {
            r0 = this;
            r0.u = r1
            r1.a(r0)
            return
    }
}
