package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
public class g0 extends android.view.ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f856c;
    private int d;
    private int e;
    private int f;
    private int g;
    private float h;
    private boolean i;
    private int[] j;
    private int[] k;
    private android.graphics.drawable.Drawable l;
    private int m;
    private int n;
    private int o;
    private int p;

    public static class a extends android.view.ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f858b;

        public a(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = -1
                r0.f858b = r1
                r1 = 0
                r0.f857a = r1
                return
        }

        public a(android.content.Context r3, android.util.AttributeSet r4) {
                r2 = this;
                r2.<init>(r3, r4)
                r0 = -1
                r2.f858b = r0
                int[] r1 = b.b.d.a.j.LinearLayoutCompat_Layout
                android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r1)
                int r4 = b.b.d.a.j.LinearLayoutCompat_Layout_android_layout_weight
                r1 = 0
                float r4 = r3.getFloat(r4, r1)
                r2.f857a = r4
                int r4 = b.b.d.a.j.LinearLayoutCompat_Layout_android_layout_gravity
                int r4 = r3.getInt(r4, r0)
                r2.f858b = r4
                r3.recycle()
                return
        }

        public a(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = -1
                r0.f858b = r1
                return
        }
    }

    public g0(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public g0(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public g0(android.content.Context r5, android.util.AttributeSet r6, int r7) {
            r4 = this;
            r4.<init>(r5, r6, r7)
            r0 = 1
            r4.f855b = r0
            r1 = -1
            r4.f856c = r1
            r2 = 0
            r4.d = r2
            r3 = 8388659(0x800033, float:1.1755015E-38)
            r4.f = r3
            int[] r3 = b.b.d.a.j.LinearLayoutCompat
            android.support.v7.widget.t0 r5 = android.support.v7.widget.t0.a(r5, r6, r3, r7, r2)
            int r6 = b.b.d.a.j.LinearLayoutCompat_android_orientation
            int r6 = r5.d(r6, r1)
            if (r6 < 0) goto L22
            r4.setOrientation(r6)
        L22:
            int r6 = b.b.d.a.j.LinearLayoutCompat_android_gravity
            int r6 = r5.d(r6, r1)
            if (r6 < 0) goto L2d
            r4.setGravity(r6)
        L2d:
            int r6 = b.b.d.a.j.LinearLayoutCompat_android_baselineAligned
            boolean r6 = r5.a(r6, r0)
            if (r6 != 0) goto L38
            r4.setBaselineAligned(r6)
        L38:
            int r6 = b.b.d.a.j.LinearLayoutCompat_android_weightSum
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r6 = r5.a(r6, r7)
            r4.h = r6
            int r6 = b.b.d.a.j.LinearLayoutCompat_android_baselineAlignedChildIndex
            int r6 = r5.d(r6, r1)
            r4.f856c = r6
            int r6 = b.b.d.a.j.LinearLayoutCompat_measureWithLargestChild
            boolean r6 = r5.a(r6, r2)
            r4.i = r6
            int r6 = b.b.d.a.j.LinearLayoutCompat_divider
            android.graphics.drawable.Drawable r6 = r5.b(r6)
            r4.setDividerDrawable(r6)
            int r6 = b.b.d.a.j.LinearLayoutCompat_showDividers
            int r6 = r5.d(r6, r2)
            r4.o = r6
            int r6 = b.b.d.a.j.LinearLayoutCompat_dividerPadding
            int r6 = r5.c(r6, r2)
            r4.p = r6
            r5.a()
            return
    }

    private void a(android.view.View r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            int r4 = r4 + r2
            int r5 = r5 + r3
            r1.layout(r2, r3, r4, r5)
            return
    }

    private void c(int r11, int r12) {
            r10 = this;
            int r0 = r10.getMeasuredHeight()
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r1 = 0
        Lb:
            if (r1 >= r11) goto L3a
            android.view.View r3 = r10.a(r1)
            int r2 = r3.getVisibility()
            r4 = 8
            if (r2 == r4) goto L37
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            r8 = r2
            android.support.v7.widget.g0$a r8 = (android.support.v7.widget.g0.a) r8
            int r2 = r8.height
            r4 = -1
            if (r2 != r4) goto L37
            int r9 = r8.width
            int r2 = r3.getMeasuredWidth()
            r8.width = r2
            r5 = 0
            r7 = 0
            r2 = r10
            r4 = r12
            r6 = r0
            r2.measureChildWithMargins(r3, r4, r5, r6, r7)
            r8.width = r9
        L37:
            int r1 = r1 + 1
            goto Lb
        L3a:
            return
    }

    private void d(int r11, int r12) {
            r10 = this;
            int r0 = r10.getMeasuredWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r1 = 0
        Lb:
            if (r1 >= r11) goto L3a
            android.view.View r3 = r10.a(r1)
            int r2 = r3.getVisibility()
            r4 = 8
            if (r2 == r4) goto L37
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            r8 = r2
            android.support.v7.widget.g0$a r8 = (android.support.v7.widget.g0.a) r8
            int r2 = r8.width
            r4 = -1
            if (r2 != r4) goto L37
            int r9 = r8.height
            int r2 = r3.getMeasuredHeight()
            r8.height = r2
            r5 = 0
            r7 = 0
            r2 = r10
            r4 = r0
            r6 = r12
            r2.measureChildWithMargins(r3, r4, r5, r6, r7)
            r8.height = r9
        L37:
            int r1 = r1 + 1
            goto Lb
        L3a:
            return
    }

    int a(android.view.View r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    int a(android.view.View r1, int r2) {
            r0 = this;
            r0 = 0
            return r0
    }

    android.view.View a(int r1) {
            r0 = this;
            android.view.View r0 = r0.getChildAt(r1)
            return r0
    }

    void a(int r39, int r40) {
            r38 = this;
            r7 = r38
            r8 = r39
            r9 = r40
            r10 = 0
            r7.g = r10
            int r11 = r38.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r39)
            int r13 = android.view.View.MeasureSpec.getMode(r40)
            int[] r0 = r7.j
            r14 = 4
            if (r0 == 0) goto L1e
            int[] r0 = r7.k
            if (r0 != 0) goto L26
        L1e:
            int[] r0 = new int[r14]
            r7.j = r0
            int[] r0 = new int[r14]
            r7.k = r0
        L26:
            int[] r15 = r7.j
            int[] r6 = r7.k
            r16 = 3
            r5 = -1
            r15[r16] = r5
            r17 = 2
            r15[r17] = r5
            r18 = 1
            r15[r18] = r5
            r15[r10] = r5
            r6[r16] = r5
            r6[r17] = r5
            r6[r18] = r5
            r6[r10] = r5
            boolean r4 = r7.f855b
            boolean r3 = r7.i
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 != r2) goto L4c
            r19 = r18
            goto L4e
        L4c:
            r19 = r10
        L4e:
            r20 = 0
            r1 = r10
            r14 = r1
            r21 = r14
            r22 = r21
            r23 = r22
            r24 = r23
            r25 = r24
            r27 = r25
            r26 = r18
            r0 = r20
        L62:
            r28 = r6
            r5 = 8
            if (r1 >= r11) goto L1ff
            android.view.View r6 = r7.a(r1)
            if (r6 != 0) goto L82
            int r5 = r7.g
            int r6 = r7.c(r1)
            int r5 = r5 + r6
            r7.g = r5
        L77:
            r32 = r3
            r36 = r4
            r37 = r2
            r2 = r1
            r1 = r37
            goto L1ec
        L82:
            int r10 = r6.getVisibility()
            if (r10 != r5) goto L8e
            int r5 = r7.a(r6, r1)
            int r1 = r1 + r5
            goto L77
        L8e:
            boolean r5 = r7.b(r1)
            if (r5 == 0) goto L9b
            int r5 = r7.g
            int r10 = r7.m
            int r5 = r5 + r10
            r7.g = r5
        L9b:
            android.view.ViewGroup$LayoutParams r5 = r6.getLayoutParams()
            r10 = r5
            android.support.v7.widget.g0$a r10 = (android.support.v7.widget.g0.a) r10
            float r5 = r10.f857a
            float r31 = r0 + r5
            if (r12 != r2) goto Leb
            int r0 = r10.width
            if (r0 != 0) goto Leb
            int r0 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r0 <= 0) goto Leb
            int r0 = r7.g
            if (r19 == 0) goto Lbb
            int r5 = r10.leftMargin
            int r2 = r10.rightMargin
            int r5 = r5 + r2
            int r0 = r0 + r5
            goto Lc5
        Lbb:
            int r2 = r10.leftMargin
            int r2 = r2 + r0
            int r5 = r10.rightMargin
            int r2 = r2 + r5
            int r0 = java.lang.Math.max(r0, r2)
        Lc5:
            r7.g = r0
            if (r4 == 0) goto Ldc
            r0 = 0
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r6.measure(r2, r2)
            r34 = r1
            r32 = r3
            r36 = r4
            r3 = r6
            r30 = -2
            goto L165
        Ldc:
            r34 = r1
            r32 = r3
            r36 = r4
            r3 = r6
            r24 = r18
            r1 = 1073741824(0x40000000, float:2.0)
            r30 = -2
            goto L167
        Leb:
            int r0 = r10.width
            if (r0 != 0) goto Lfa
            float r0 = r10.f857a
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r0 <= 0) goto Lfa
            r5 = -2
            r10.width = r5
            r2 = 0
            goto Lfd
        Lfa:
            r5 = -2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        Lfd:
            int r0 = (r31 > r20 ? 1 : (r31 == r20 ? 0 : -1))
            if (r0 != 0) goto L106
            int r0 = r7.g
            r29 = r0
            goto L108
        L106:
            r29 = 0
        L108:
            r33 = 0
            r0 = r38
            r34 = r1
            r1 = r6
            r35 = r2
            r2 = r34
            r32 = r3
            r3 = r39
            r36 = r4
            r4 = r29
            r29 = r5
            r9 = -1
            r5 = r40
            r30 = r29
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r29 = r6
            r6 = r33
            r0.a(r1, r2, r3, r4, r5, r6)
            r0 = r35
            if (r0 == r9) goto L131
            r10.width = r0
        L131:
            int r0 = r29.getMeasuredWidth()
            if (r19 == 0) goto L148
            int r1 = r7.g
            int r2 = r10.leftMargin
            int r2 = r2 + r0
            int r3 = r10.rightMargin
            int r2 = r2 + r3
            r3 = r29
            int r4 = r7.b(r3)
            int r2 = r2 + r4
            int r1 = r1 + r2
            goto L15d
        L148:
            r3 = r29
            int r1 = r7.g
            int r2 = r1 + r0
            int r4 = r10.leftMargin
            int r2 = r2 + r4
            int r4 = r10.rightMargin
            int r2 = r2 + r4
            int r4 = r7.b(r3)
            int r2 = r2 + r4
            int r1 = java.lang.Math.max(r1, r2)
        L15d:
            r7.g = r1
            if (r32 == 0) goto L165
            int r14 = java.lang.Math.max(r0, r14)
        L165:
            r1 = 1073741824(0x40000000, float:2.0)
        L167:
            if (r13 == r1) goto L173
            int r0 = r10.height
            r2 = -1
            if (r0 != r2) goto L173
            r0 = r18
            r27 = r0
            goto L174
        L173:
            r0 = 0
        L174:
            int r2 = r10.topMargin
            int r4 = r10.bottomMargin
            int r2 = r2 + r4
            int r4 = r3.getMeasuredHeight()
            int r4 = r4 + r2
            int r5 = r3.getMeasuredState()
            r6 = r25
            int r25 = android.view.View.combineMeasuredStates(r6, r5)
            if (r36 == 0) goto L1b1
            int r5 = r3.getBaseline()
            r6 = -1
            if (r5 == r6) goto L1b1
            int r6 = r10.f858b
            if (r6 >= 0) goto L197
            int r6 = r7.f
        L197:
            r6 = r6 & 112(0x70, float:1.57E-43)
            r9 = 4
            int r6 = r6 >> r9
            r6 = r6 & (-2)
            int r6 = r6 >> 1
            r9 = r15[r6]
            int r9 = java.lang.Math.max(r9, r5)
            r15[r6] = r9
            r9 = r28[r6]
            int r5 = r4 - r5
            int r5 = java.lang.Math.max(r9, r5)
            r28[r6] = r5
        L1b1:
            r5 = r21
            int r21 = java.lang.Math.max(r5, r4)
            if (r26 == 0) goto L1c1
            int r5 = r10.height
            r6 = -1
            if (r5 != r6) goto L1c1
            r26 = r18
            goto L1c3
        L1c1:
            r26 = 0
        L1c3:
            float r5 = r10.f857a
            int r5 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r5 <= 0) goto L1d4
            if (r0 == 0) goto L1cc
            goto L1cd
        L1cc:
            r2 = r4
        L1cd:
            r10 = r23
            int r23 = java.lang.Math.max(r10, r2)
            goto L1e2
        L1d4:
            r10 = r23
            if (r0 == 0) goto L1d9
            goto L1da
        L1d9:
            r2 = r4
        L1da:
            r4 = r22
            int r22 = java.lang.Math.max(r4, r2)
            r23 = r10
        L1e2:
            r10 = r34
            int r0 = r7.a(r3, r10)
            int r0 = r0 + r10
            r2 = r0
            r0 = r31
        L1ec:
            int r2 = r2 + 1
            r9 = r40
            r6 = r28
            r3 = r32
            r4 = r36
            r5 = -1
            r10 = 0
            r37 = r2
            r2 = r1
            r1 = r37
            goto L62
        L1ff:
            r1 = r2
            r32 = r3
            r36 = r4
            r2 = r21
            r4 = r22
            r10 = r23
            r6 = r25
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r30 = -2
            int r3 = r7.g
            if (r3 <= 0) goto L221
            boolean r3 = r7.b(r11)
            if (r3 == 0) goto L221
            int r3 = r7.g
            int r1 = r7.m
            int r3 = r3 + r1
            r7.g = r3
        L221:
            r1 = r15[r18]
            r3 = -1
            if (r1 != r3) goto L238
            r1 = 0
            r5 = r15[r1]
            if (r5 != r3) goto L238
            r1 = r15[r17]
            if (r1 != r3) goto L238
            r1 = r15[r16]
            if (r1 == r3) goto L234
            goto L238
        L234:
            r1 = r2
            r23 = r6
            goto L269
        L238:
            r1 = r15[r16]
            r3 = 0
            r5 = r15[r3]
            r9 = r15[r18]
            r3 = r15[r17]
            int r3 = java.lang.Math.max(r9, r3)
            int r3 = java.lang.Math.max(r5, r3)
            int r1 = java.lang.Math.max(r1, r3)
            r3 = r28[r16]
            r5 = 0
            r9 = r28[r5]
            r5 = r28[r18]
            r23 = r6
            r6 = r28[r17]
            int r5 = java.lang.Math.max(r5, r6)
            int r5 = java.lang.Math.max(r9, r5)
            int r3 = java.lang.Math.max(r3, r5)
            int r1 = r1 + r3
            int r1 = java.lang.Math.max(r2, r1)
        L269:
            if (r32 == 0) goto L2ca
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r12 == r2) goto L271
            if (r12 != 0) goto L2ca
        L271:
            r2 = 0
            r7.g = r2
            r2 = 0
        L275:
            if (r2 >= r11) goto L2ca
            android.view.View r3 = r7.a(r2)
            if (r3 != 0) goto L287
            int r3 = r7.g
            int r5 = r7.c(r2)
            int r3 = r3 + r5
            r7.g = r3
            goto L294
        L287:
            int r5 = r3.getVisibility()
            r6 = 8
            if (r5 != r6) goto L297
            int r3 = r7.a(r3, r2)
            int r2 = r2 + r3
        L294:
            r22 = r1
            goto L2c5
        L297:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            android.support.v7.widget.g0$a r5 = (android.support.v7.widget.g0.a) r5
            int r6 = r7.g
            if (r19 == 0) goto L2b0
            int r9 = r5.leftMargin
            int r9 = r9 + r14
            int r5 = r5.rightMargin
            int r9 = r9 + r5
            int r3 = r7.b(r3)
            int r9 = r9 + r3
            int r6 = r6 + r9
            r7.g = r6
            goto L294
        L2b0:
            int r9 = r6 + r14
            r22 = r1
            int r1 = r5.leftMargin
            int r9 = r9 + r1
            int r1 = r5.rightMargin
            int r9 = r9 + r1
            int r1 = r7.b(r3)
            int r9 = r9 + r1
            int r1 = java.lang.Math.max(r6, r9)
            r7.g = r1
        L2c5:
            int r2 = r2 + 1
            r1 = r22
            goto L275
        L2ca:
            r22 = r1
            int r1 = r7.g
            int r2 = r38.getPaddingLeft()
            int r3 = r38.getPaddingRight()
            int r2 = r2 + r3
            int r1 = r1 + r2
            r7.g = r1
            int r2 = r38.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r1, r2)
            r2 = 0
            int r1 = android.view.View.resolveSizeAndState(r1, r8, r2)
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r1
            int r3 = r7.g
            int r2 = r2 - r3
            if (r24 != 0) goto L33b
            if (r2 == 0) goto L2f7
            int r5 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r5 <= 0) goto L2f7
            goto L33b
        L2f7:
            int r0 = java.lang.Math.max(r4, r10)
            if (r32 == 0) goto L333
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 == r2) goto L333
            r10 = 0
        L302:
            if (r10 >= r11) goto L333
            android.view.View r2 = r7.a(r10)
            if (r2 == 0) goto L330
            int r4 = r2.getVisibility()
            r5 = 8
            if (r4 != r5) goto L313
            goto L330
        L313:
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            android.support.v7.widget.g0$a r4 = (android.support.v7.widget.g0.a) r4
            float r4 = r4.f857a
            int r4 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r4 <= 0) goto L330
            r4 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r4)
            int r6 = r2.getMeasuredHeight()
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r4)
            r2.measure(r5, r6)
        L330:
            int r10 = r10 + 1
            goto L302
        L333:
            r2 = r40
            r25 = r11
            r3 = r22
            goto L4cb
        L33b:
            float r5 = r7.h
            int r6 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r6 <= 0) goto L342
            r0 = r5
        L342:
            r5 = -1
            r15[r16] = r5
            r15[r17] = r5
            r15[r18] = r5
            r6 = 0
            r15[r6] = r5
            r28[r16] = r5
            r28[r17] = r5
            r28[r18] = r5
            r28[r6] = r5
            r7.g = r6
            r6 = r4
            r4 = r5
            r9 = r23
            r10 = 0
        L35b:
            if (r10 >= r11) goto L472
            android.view.View r14 = r7.a(r10)
            if (r14 == 0) goto L463
            int r5 = r14.getVisibility()
            r3 = 8
            if (r5 != r3) goto L36d
            goto L463
        L36d:
            android.view.ViewGroup$LayoutParams r5 = r14.getLayoutParams()
            android.support.v7.widget.g0$a r5 = (android.support.v7.widget.g0.a) r5
            float r3 = r5.f857a
            int r23 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r23 <= 0) goto L3cc
            float r8 = (float) r2
            float r8 = r8 * r3
            float r8 = r8 / r0
            int r8 = (int) r8
            float r0 = r0 - r3
            int r2 = r2 - r8
            int r3 = r38.getPaddingTop()
            int r23 = r38.getPaddingBottom()
            int r3 = r3 + r23
            r23 = r0
            int r0 = r5.topMargin
            int r3 = r3 + r0
            int r0 = r5.bottomMargin
            int r3 = r3 + r0
            int r0 = r5.height
            r24 = r2
            r25 = r11
            r11 = -1
            r2 = r40
            int r0 = android.view.ViewGroup.getChildMeasureSpec(r2, r3, r0)
            int r3 = r5.width
            if (r3 != 0) goto L3aa
            r3 = 1073741824(0x40000000, float:2.0)
            if (r12 == r3) goto L3a7
            goto L3ac
        L3a7:
            if (r8 <= 0) goto L3b4
            goto L3b5
        L3aa:
            r3 = 1073741824(0x40000000, float:2.0)
        L3ac:
            int r29 = r14.getMeasuredWidth()
            int r8 = r29 + r8
            if (r8 >= 0) goto L3b5
        L3b4:
            r8 = 0
        L3b5:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r3)
            r14.measure(r8, r0)
            int r0 = r14.getMeasuredState()
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r3
            int r9 = android.view.View.combineMeasuredStates(r9, r0)
            r0 = r23
            r3 = r24
            goto L3d2
        L3cc:
            r3 = r2
            r25 = r11
            r11 = -1
            r2 = r40
        L3d2:
            int r8 = r7.g
            if (r19 == 0) goto L3ef
            int r23 = r14.getMeasuredWidth()
            int r11 = r5.leftMargin
            int r23 = r23 + r11
            int r11 = r5.rightMargin
            int r23 = r23 + r11
            int r11 = r7.b(r14)
            int r23 = r23 + r11
            int r8 = r8 + r23
            r7.g = r8
            r23 = r0
            goto L407
        L3ef:
            int r11 = r14.getMeasuredWidth()
            int r11 = r11 + r8
            r23 = r0
            int r0 = r5.leftMargin
            int r11 = r11 + r0
            int r0 = r5.rightMargin
            int r11 = r11 + r0
            int r0 = r7.b(r14)
            int r11 = r11 + r0
            int r0 = java.lang.Math.max(r8, r11)
            r7.g = r0
        L407:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r13 == r0) goto L413
            int r0 = r5.height
            r8 = -1
            if (r0 != r8) goto L413
            r0 = r18
            goto L414
        L413:
            r0 = 0
        L414:
            int r8 = r5.topMargin
            int r11 = r5.bottomMargin
            int r8 = r8 + r11
            int r11 = r14.getMeasuredHeight()
            int r11 = r11 + r8
            int r4 = java.lang.Math.max(r4, r11)
            if (r0 == 0) goto L425
            goto L426
        L425:
            r8 = r11
        L426:
            int r0 = java.lang.Math.max(r6, r8)
            if (r26 == 0) goto L434
            int r6 = r5.height
            r8 = -1
            if (r6 != r8) goto L435
            r6 = r18
            goto L436
        L434:
            r8 = -1
        L435:
            r6 = 0
        L436:
            if (r36 == 0) goto L45d
            int r14 = r14.getBaseline()
            if (r14 == r8) goto L45d
            int r5 = r5.f858b
            if (r5 >= 0) goto L444
            int r5 = r7.f
        L444:
            r5 = r5 & 112(0x70, float:1.57E-43)
            r8 = 4
            int r5 = r5 >> r8
            r5 = r5 & (-2)
            int r5 = r5 >> 1
            r8 = r15[r5]
            int r8 = java.lang.Math.max(r8, r14)
            r15[r5] = r8
            r8 = r28[r5]
            int r11 = r11 - r14
            int r8 = java.lang.Math.max(r8, r11)
            r28[r5] = r8
        L45d:
            r26 = r6
            r6 = r0
            r0 = r23
            goto L468
        L463:
            r3 = r2
            r25 = r11
            r2 = r40
        L468:
            int r10 = r10 + 1
            r8 = r39
            r2 = r3
            r11 = r25
            r5 = -1
            goto L35b
        L472:
            r2 = r40
            r25 = r11
            int r0 = r7.g
            int r3 = r38.getPaddingLeft()
            int r5 = r38.getPaddingRight()
            int r3 = r3 + r5
            int r0 = r0 + r3
            r7.g = r0
            r0 = r15[r18]
            r3 = -1
            if (r0 != r3) goto L499
            r0 = 0
            r5 = r15[r0]
            if (r5 != r3) goto L499
            r0 = r15[r17]
            if (r0 != r3) goto L499
            r0 = r15[r16]
            if (r0 == r3) goto L497
            goto L499
        L497:
            r0 = r4
            goto L4c7
        L499:
            r0 = r15[r16]
            r3 = 0
            r5 = r15[r3]
            r8 = r15[r18]
            r10 = r15[r17]
            int r8 = java.lang.Math.max(r8, r10)
            int r5 = java.lang.Math.max(r5, r8)
            int r0 = java.lang.Math.max(r0, r5)
            r5 = r28[r16]
            r3 = r28[r3]
            r8 = r28[r18]
            r10 = r28[r17]
            int r8 = java.lang.Math.max(r8, r10)
            int r3 = java.lang.Math.max(r3, r8)
            int r3 = java.lang.Math.max(r5, r3)
            int r0 = r0 + r3
            int r0 = java.lang.Math.max(r4, r0)
        L4c7:
            r3 = r0
            r0 = r6
            r23 = r9
        L4cb:
            if (r26 != 0) goto L4d2
            r4 = 1073741824(0x40000000, float:2.0)
            if (r13 == r4) goto L4d2
            goto L4d3
        L4d2:
            r0 = r3
        L4d3:
            int r3 = r38.getPaddingTop()
            int r4 = r38.getPaddingBottom()
            int r3 = r3 + r4
            int r0 = r0 + r3
            int r3 = r38.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r0, r3)
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3 = r23 & r3
            r1 = r1 | r3
            int r3 = r23 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r2, r3)
            r7.setMeasuredDimension(r1, r0)
            if (r27 == 0) goto L4fc
            r0 = r39
            r1 = r25
            r7.c(r1, r0)
        L4fc:
            return
    }

    void a(int r25, int r26, int r27, int r28) {
            r24 = this;
            r6 = r24
            boolean r0 = android.support.v7.widget.z0.a(r24)
            int r7 = r24.getPaddingTop()
            int r1 = r28 - r26
            int r2 = r24.getPaddingBottom()
            int r8 = r1 - r2
            int r1 = r1 - r7
            int r2 = r24.getPaddingBottom()
            int r9 = r1 - r2
            int r10 = r24.getVirtualChildCount()
            int r1 = r6.f
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r1
            r11 = r1 & 112(0x70, float:1.57E-43)
            boolean r12 = r6.f855b
            int[] r13 = r6.j
            int[] r14 = r6.k
            int r1 = b.b.c.g.q.d(r24)
            int r1 = b.b.c.g.d.a(r2, r1)
            r15 = 2
            r5 = 1
            if (r1 == r5) goto L4b
            r2 = 5
            if (r1 == r2) goto L3f
            int r1 = r24.getPaddingLeft()
            goto L56
        L3f:
            int r1 = r24.getPaddingLeft()
            int r1 = r1 + r27
            int r1 = r1 - r25
            int r2 = r6.g
            int r1 = r1 - r2
            goto L56
        L4b:
            int r1 = r24.getPaddingLeft()
            int r2 = r27 - r25
            int r3 = r6.g
            int r2 = r2 - r3
            int r2 = r2 / r15
            int r1 = r1 + r2
        L56:
            r2 = 0
            if (r0 == 0) goto L60
            int r0 = r10 + (-1)
            r16 = r0
            r17 = -1
            goto L64
        L60:
            r16 = r2
            r17 = r5
        L64:
            r3 = r2
        L65:
            if (r3 >= r10) goto L148
            int r0 = r17 * r3
            int r2 = r16 + r0
            android.view.View r0 = r6.a(r2)
            if (r0 != 0) goto L80
            int r0 = r6.c(r2)
            int r1 = r1 + r0
            r21 = r5
            r22 = r7
            r19 = r10
            r20 = r11
            goto L139
        L80:
            int r5 = r0.getVisibility()
            r15 = 8
            if (r5 == r15) goto L12f
            int r15 = r0.getMeasuredWidth()
            int r5 = r0.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r18 = r0.getLayoutParams()
            r4 = r18
            android.support.v7.widget.g0$a r4 = (android.support.v7.widget.g0.a) r4
            r18 = r3
            if (r12 == 0) goto La8
            int r3 = r4.height
            r19 = r10
            r10 = -1
            if (r3 == r10) goto Laa
            int r10 = r0.getBaseline()
            goto Lab
        La8:
            r19 = r10
        Laa:
            r10 = -1
        Lab:
            int r3 = r4.f858b
            if (r3 >= 0) goto Lb0
            r3 = r11
        Lb0:
            r3 = r3 & 112(0x70, float:1.57E-43)
            r20 = r11
            r11 = 16
            if (r3 == r11) goto Leb
            r11 = 48
            if (r3 == r11) goto Ld9
            r11 = 80
            if (r3 == r11) goto Lc3
            r3 = r7
            r11 = -1
            goto Le8
        Lc3:
            int r3 = r8 - r5
            int r11 = r4.bottomMargin
            int r3 = r3 - r11
            r11 = -1
            if (r10 == r11) goto Le8
            int r21 = r0.getMeasuredHeight()
            int r21 = r21 - r10
            r10 = 2
            r22 = r14[r10]
            int r22 = r22 - r21
            int r3 = r3 - r22
            goto Le8
        Ld9:
            r11 = -1
            int r3 = r4.topMargin
            int r3 = r3 + r7
            if (r10 == r11) goto Le8
            r21 = 1
            r22 = r13[r21]
            int r22 = r22 - r10
            int r3 = r3 + r22
            goto Lf9
        Le8:
            r21 = 1
            goto Lf9
        Leb:
            r11 = -1
            r21 = 1
            int r3 = r9 - r5
            r10 = 2
            int r3 = r3 / r10
            int r3 = r3 + r7
            int r10 = r4.topMargin
            int r3 = r3 + r10
            int r10 = r4.bottomMargin
            int r3 = r3 - r10
        Lf9:
            boolean r10 = r6.b(r2)
            if (r10 == 0) goto L102
            int r10 = r6.m
            int r1 = r1 + r10
        L102:
            int r10 = r4.leftMargin
            int r10 = r10 + r1
            int r1 = r6.a(r0)
            int r22 = r10 + r1
            r1 = r0
            r0 = r24
            r25 = r1
            r11 = r2
            r2 = r22
            r22 = r7
            r23 = -1
            r7 = r4
            r4 = r15
            r0.a(r1, r2, r3, r4, r5)
            int r0 = r7.rightMargin
            int r15 = r15 + r0
            r0 = r25
            int r1 = r6.b(r0)
            int r15 = r15 + r1
            int r10 = r10 + r15
            int r0 = r6.a(r0, r11)
            int r3 = r18 + r0
            r1 = r10
            goto L13b
        L12f:
            r18 = r3
            r22 = r7
            r19 = r10
            r20 = r11
            r21 = 1
        L139:
            r23 = -1
        L13b:
            int r3 = r3 + 1
            r10 = r19
            r11 = r20
            r5 = r21
            r7 = r22
            r15 = 2
            goto L65
        L148:
            return
    }

    void a(android.graphics.Canvas r7) {
            r6 = this;
            int r0 = r6.getVirtualChildCount()
            boolean r1 = android.support.v7.widget.z0.a(r6)
            r2 = 0
        L9:
            if (r2 >= r0) goto L3f
            android.view.View r3 = r6.a(r2)
            if (r3 == 0) goto L3c
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 == r5) goto L3c
            boolean r4 = r6.b(r2)
            if (r4 == 0) goto L3c
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            android.support.v7.widget.g0$a r4 = (android.support.v7.widget.g0.a) r4
            if (r1 == 0) goto L2f
            int r3 = r3.getRight()
            int r4 = r4.rightMargin
            int r3 = r3 + r4
            goto L39
        L2f:
            int r3 = r3.getLeft()
            int r4 = r4.leftMargin
            int r3 = r3 - r4
            int r4 = r6.m
            int r3 = r3 - r4
        L39:
            r6.b(r7, r3)
        L3c:
            int r2 = r2 + 1
            goto L9
        L3f:
            boolean r2 = r6.b(r0)
            if (r2 == 0) goto L7a
            int r0 = r0 + (-1)
            android.view.View r0 = r6.a(r0)
            if (r0 != 0) goto L5d
            if (r1 == 0) goto L54
            int r0 = r6.getPaddingLeft()
            goto L77
        L54:
            int r0 = r6.getWidth()
            int r1 = r6.getPaddingRight()
            goto L6b
        L5d:
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.support.v7.widget.g0$a r2 = (android.support.v7.widget.g0.a) r2
            if (r1 == 0) goto L70
            int r0 = r0.getLeft()
            int r1 = r2.leftMargin
        L6b:
            int r0 = r0 - r1
            int r1 = r6.m
            int r0 = r0 - r1
            goto L77
        L70:
            int r0 = r0.getRight()
            int r1 = r2.rightMargin
            int r0 = r0 + r1
        L77:
            r6.b(r7, r0)
        L7a:
            return
    }

    void a(android.graphics.Canvas r5, int r6) {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.l
            int r1 = r4.getPaddingLeft()
            int r2 = r4.p
            int r1 = r1 + r2
            int r2 = r4.getWidth()
            int r3 = r4.getPaddingRight()
            int r2 = r2 - r3
            int r3 = r4.p
            int r2 = r2 - r3
            int r3 = r4.n
            int r3 = r3 + r6
            r0.setBounds(r1, r6, r2, r3)
            android.graphics.drawable.Drawable r4 = r4.l
            r4.draw(r5)
            return
    }

    void a(android.view.View r7, int r8, int r9, int r10, int r11, int r12) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            return
    }

    int b(android.view.View r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    void b(int r34, int r35) {
            r33 = this;
            r7 = r33
            r8 = r34
            r9 = r35
            r10 = 0
            r7.g = r10
            int r11 = r33.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r34)
            int r13 = android.view.View.MeasureSpec.getMode(r35)
            int r14 = r7.f856c
            boolean r15 = r7.i
            r16 = 0
            r17 = 1
            r1 = r10
            r2 = r1
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
            r18 = r6
            r20 = r18
            r0 = r16
            r19 = r17
        L2b:
            r10 = 8
            r22 = r4
            if (r6 >= r11) goto L19b
            android.view.View r4 = r7.a(r6)
            if (r4 != 0) goto L48
            int r4 = r7.g
            int r10 = r7.c(r6)
            int r4 = r4 + r10
            r7.g = r4
            r26 = r11
            r24 = r13
            r4 = r22
            goto L18f
        L48:
            r24 = r1
            int r1 = r4.getVisibility()
            if (r1 != r10) goto L5f
            int r1 = r7.a(r4, r6)
            int r6 = r6 + r1
            r26 = r11
            r4 = r22
            r1 = r24
            r24 = r13
            goto L18f
        L5f:
            boolean r1 = r7.b(r6)
            if (r1 == 0) goto L6c
            int r1 = r7.g
            int r10 = r7.n
            int r1 = r1 + r10
            r7.g = r1
        L6c:
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            r10 = r1
            android.support.v7.widget.g0$a r10 = (android.support.v7.widget.g0.a) r10
            float r1 = r10.f857a
            float r25 = r0 + r1
            r0 = 1073741824(0x40000000, float:2.0)
            if (r13 != r0) goto La6
            int r0 = r10.height
            if (r0 != 0) goto La6
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 <= 0) goto La6
            int r0 = r7.g
            int r1 = r10.topMargin
            int r1 = r1 + r0
            r26 = r2
            int r2 = r10.bottomMargin
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            r7.g = r0
            r0 = r3
            r3 = r4
            r31 = r5
            r18 = r17
            r8 = r24
            r29 = r26
            r26 = r11
            r24 = r13
            r13 = r22
            r11 = r6
            goto L116
        La6:
            r26 = r2
            int r0 = r10.height
            if (r0 != 0) goto Lb7
            float r0 = r10.f857a
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 <= 0) goto Lb7
            r0 = -2
            r10.height = r0
            r2 = 0
            goto Lb9
        Lb7:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        Lb9:
            r27 = 0
            int r0 = (r25 > r16 ? 1 : (r25 == r16 ? 0 : -1))
            if (r0 != 0) goto Lc4
            int r0 = r7.g
            r23 = r0
            goto Lc6
        Lc4:
            r23 = 0
        Lc6:
            r28 = 1073741824(0x40000000, float:2.0)
            r0 = r33
            r8 = r24
            r1 = r4
            r30 = r2
            r29 = r26
            r2 = r6
            r9 = r3
            r3 = r34
            r26 = r11
            r24 = r13
            r13 = r22
            r11 = r28
            r22 = r4
            r4 = r27
            r31 = r5
            r5 = r35
            r11 = r6
            r6 = r23
            r0.a(r1, r2, r3, r4, r5, r6)
            r0 = r30
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto Lf3
            r10.height = r0
        Lf3:
            int r0 = r22.getMeasuredHeight()
            int r1 = r7.g
            int r2 = r1 + r0
            int r3 = r10.topMargin
            int r2 = r2 + r3
            int r3 = r10.bottomMargin
            int r2 = r2 + r3
            r3 = r22
            int r4 = r7.b(r3)
            int r2 = r2 + r4
            int r1 = java.lang.Math.max(r1, r2)
            r7.g = r1
            if (r15 == 0) goto L115
            int r0 = java.lang.Math.max(r0, r9)
            goto L116
        L115:
            r0 = r9
        L116:
            if (r14 < 0) goto L120
            int r6 = r11 + 1
            if (r14 != r6) goto L120
            int r1 = r7.g
            r7.d = r1
        L120:
            if (r11 >= r14) goto L131
            float r1 = r10.f857a
            int r1 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r1 > 0) goto L129
            goto L131
        L129:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L131:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r12 == r1) goto L13f
            int r1 = r10.width
            r2 = -1
            if (r1 != r2) goto L13f
            r1 = r17
            r20 = r1
            goto L140
        L13f:
            r1 = 0
        L140:
            int r2 = r10.leftMargin
            int r4 = r10.rightMargin
            int r2 = r2 + r4
            int r4 = r3.getMeasuredWidth()
            int r4 = r4 + r2
            r5 = r29
            int r5 = java.lang.Math.max(r5, r4)
            int r6 = r3.getMeasuredState()
            int r6 = android.view.View.combineMeasuredStates(r8, r6)
            if (r19 == 0) goto L162
            int r8 = r10.width
            r9 = -1
            if (r8 != r9) goto L162
            r19 = r17
            goto L164
        L162:
            r19 = 0
        L164:
            float r8 = r10.f857a
            int r8 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r8 <= 0) goto L175
            if (r1 == 0) goto L16d
            goto L16e
        L16d:
            r2 = r4
        L16e:
            int r4 = java.lang.Math.max(r13, r2)
            r1 = r31
            goto L180
        L175:
            if (r1 == 0) goto L178
            goto L179
        L178:
            r2 = r4
        L179:
            r1 = r31
            int r1 = java.lang.Math.max(r1, r2)
            r4 = r13
        L180:
            int r2 = r7.a(r3, r11)
            int r2 = r2 + r11
            r3 = r0
            r0 = r25
            r32 = r5
            r5 = r1
            r1 = r6
            r6 = r2
            r2 = r32
        L18f:
            int r6 = r6 + 1
            r8 = r34
            r9 = r35
            r13 = r24
            r11 = r26
            goto L2b
        L19b:
            r8 = r1
            r9 = r3
            r1 = r5
            r26 = r11
            r24 = r13
            r13 = r22
            r5 = r2
            int r2 = r7.g
            if (r2 <= 0) goto L1b9
            r2 = r26
            boolean r3 = r7.b(r2)
            if (r3 == 0) goto L1bb
            int r3 = r7.g
            int r4 = r7.n
            int r3 = r3 + r4
            r7.g = r3
            goto L1bb
        L1b9:
            r2 = r26
        L1bb:
            r3 = r24
            if (r15 == 0) goto L209
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r4) goto L1c5
            if (r3 != 0) goto L209
        L1c5:
            r4 = 0
            r7.g = r4
            r4 = 0
        L1c9:
            if (r4 >= r2) goto L209
            android.view.View r6 = r7.a(r4)
            if (r6 != 0) goto L1db
            int r6 = r7.g
            int r11 = r7.c(r4)
            int r6 = r6 + r11
        L1d8:
            r7.g = r6
            goto L204
        L1db:
            int r11 = r6.getVisibility()
            if (r11 != r10) goto L1e7
            int r6 = r7.a(r6, r4)
            int r4 = r4 + r6
            goto L204
        L1e7:
            android.view.ViewGroup$LayoutParams r11 = r6.getLayoutParams()
            android.support.v7.widget.g0$a r11 = (android.support.v7.widget.g0.a) r11
            int r14 = r7.g
            int r21 = r14 + r9
            int r10 = r11.topMargin
            int r21 = r21 + r10
            int r10 = r11.bottomMargin
            int r21 = r21 + r10
            int r6 = r7.b(r6)
            int r6 = r21 + r6
            int r6 = java.lang.Math.max(r14, r6)
            goto L1d8
        L204:
            int r4 = r4 + 1
            r10 = 8
            goto L1c9
        L209:
            int r4 = r7.g
            int r6 = r33.getPaddingTop()
            int r10 = r33.getPaddingBottom()
            int r6 = r6 + r10
            int r4 = r4 + r6
            r7.g = r4
            int r6 = r33.getSuggestedMinimumHeight()
            int r4 = java.lang.Math.max(r4, r6)
            r6 = r35
            r10 = r9
            r9 = 0
            int r4 = android.view.View.resolveSizeAndState(r4, r6, r9)
            r9 = 16777215(0xffffff, float:2.3509886E-38)
            r9 = r9 & r4
            int r11 = r7.g
            int r9 = r9 - r11
            if (r18 != 0) goto L278
            if (r9 == 0) goto L237
            int r11 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r11 <= 0) goto L237
            goto L278
        L237:
            int r0 = java.lang.Math.max(r1, r13)
            if (r15 == 0) goto L273
            r1 = 1073741824(0x40000000, float:2.0)
            if (r3 == r1) goto L273
            r1 = 0
        L242:
            if (r1 >= r2) goto L273
            android.view.View r3 = r7.a(r1)
            if (r3 == 0) goto L270
            int r9 = r3.getVisibility()
            r11 = 8
            if (r9 != r11) goto L253
            goto L270
        L253:
            android.view.ViewGroup$LayoutParams r9 = r3.getLayoutParams()
            android.support.v7.widget.g0$a r9 = (android.support.v7.widget.g0.a) r9
            float r9 = r9.f857a
            int r9 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r9 <= 0) goto L270
            int r9 = r3.getMeasuredWidth()
            r11 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r11)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r11)
            r3.measure(r9, r13)
        L270:
            int r1 = r1 + 1
            goto L242
        L273:
            r11 = r34
            r1 = r8
            goto L363
        L278:
            float r10 = r7.h
            int r11 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r11 <= 0) goto L27f
            r0 = r10
        L27f:
            r10 = 0
            r7.g = r10
            r11 = r9
            r9 = r1
            r1 = r8
            r8 = r10
        L286:
            if (r8 >= r2) goto L352
            android.view.View r13 = r7.a(r8)
            int r14 = r13.getVisibility()
            r15 = 8
            if (r14 != r15) goto L29a
            r21 = r11
            r11 = r34
            goto L34b
        L29a:
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            android.support.v7.widget.g0$a r14 = (android.support.v7.widget.g0.a) r14
            float r10 = r14.f857a
            int r18 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r18 <= 0) goto L2f3
            float r15 = (float) r11
            float r15 = r15 * r10
            float r15 = r15 / r0
            int r15 = (int) r15
            float r0 = r0 - r10
            int r11 = r11 - r15
            int r10 = r33.getPaddingLeft()
            int r18 = r33.getPaddingRight()
            int r10 = r10 + r18
            r18 = r0
            int r0 = r14.leftMargin
            int r10 = r10 + r0
            int r0 = r14.rightMargin
            int r10 = r10 + r0
            int r0 = r14.width
            r21 = r11
            r11 = r34
            int r0 = android.view.ViewGroup.getChildMeasureSpec(r11, r10, r0)
            int r10 = r14.height
            if (r10 != 0) goto L2d4
            r10 = 1073741824(0x40000000, float:2.0)
            if (r3 == r10) goto L2d1
            goto L2d6
        L2d1:
            if (r15 <= 0) goto L2de
            goto L2df
        L2d4:
            r10 = 1073741824(0x40000000, float:2.0)
        L2d6:
            int r23 = r13.getMeasuredHeight()
            int r15 = r23 + r15
            if (r15 >= 0) goto L2df
        L2de:
            r15 = 0
        L2df:
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r10)
            r13.measure(r0, r15)
            int r0 = r13.getMeasuredState()
            r0 = r0 & (-256(0xffffffffffffff00, float:NaN))
            int r1 = android.view.View.combineMeasuredStates(r1, r0)
            r0 = r18
            goto L2f8
        L2f3:
            r10 = r11
            r11 = r34
            r21 = r10
        L2f8:
            int r10 = r14.leftMargin
            int r15 = r14.rightMargin
            int r10 = r10 + r15
            int r15 = r13.getMeasuredWidth()
            int r15 = r15 + r10
            int r5 = java.lang.Math.max(r5, r15)
            r18 = r0
            r0 = 1073741824(0x40000000, float:2.0)
            if (r12 == r0) goto L316
            int r0 = r14.width
            r23 = r1
            r1 = -1
            if (r0 != r1) goto L319
            r0 = r17
            goto L31a
        L316:
            r23 = r1
            r1 = -1
        L319:
            r0 = 0
        L31a:
            if (r0 == 0) goto L31d
            goto L31e
        L31d:
            r10 = r15
        L31e:
            int r0 = java.lang.Math.max(r9, r10)
            if (r19 == 0) goto L32b
            int r9 = r14.width
            if (r9 != r1) goto L32b
            r9 = r17
            goto L32c
        L32b:
            r9 = 0
        L32c:
            int r10 = r7.g
            int r15 = r13.getMeasuredHeight()
            int r15 = r15 + r10
            int r1 = r14.topMargin
            int r15 = r15 + r1
            int r1 = r14.bottomMargin
            int r15 = r15 + r1
            int r1 = r7.b(r13)
            int r15 = r15 + r1
            int r1 = java.lang.Math.max(r10, r15)
            r7.g = r1
            r19 = r9
            r1 = r23
            r9 = r0
            r0 = r18
        L34b:
            int r8 = r8 + 1
            r11 = r21
            r10 = 0
            goto L286
        L352:
            r11 = r34
            int r0 = r7.g
            int r3 = r33.getPaddingTop()
            int r8 = r33.getPaddingBottom()
            int r3 = r3 + r8
            int r0 = r0 + r3
            r7.g = r0
            r0 = r9
        L363:
            if (r19 != 0) goto L36a
            r3 = 1073741824(0x40000000, float:2.0)
            if (r12 == r3) goto L36a
            goto L36b
        L36a:
            r0 = r5
        L36b:
            int r3 = r33.getPaddingLeft()
            int r5 = r33.getPaddingRight()
            int r3 = r3 + r5
            int r0 = r0 + r3
            int r3 = r33.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r0, r3)
            int r0 = android.view.View.resolveSizeAndState(r0, r11, r1)
            r7.setMeasuredDimension(r0, r4)
            if (r20 == 0) goto L389
            r7.d(r2, r6)
        L389:
            return
    }

    void b(int r18, int r19, int r20, int r21) {
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r0 = r20 - r18
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r10 = r17.getVirtualChildCount()
            int r0 = r6.f
            r1 = r0 & 112(0x70, float:1.57E-43)
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r0 & r2
            r0 = 16
            if (r1 == r0) goto L3b
            r0 = 80
            if (r1 == r0) goto L2f
            int r0 = r17.getPaddingTop()
            goto L47
        L2f:
            int r0 = r17.getPaddingTop()
            int r0 = r0 + r21
            int r0 = r0 - r19
            int r1 = r6.g
            int r0 = r0 - r1
            goto L47
        L3b:
            int r0 = r17.getPaddingTop()
            int r1 = r21 - r19
            int r2 = r6.g
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L47:
            r1 = 0
            r12 = r1
        L49:
            if (r12 >= r10) goto Lc8
            android.view.View r13 = r6.a(r12)
            r14 = 1
            if (r13 != 0) goto L59
            int r1 = r6.c(r12)
            int r0 = r0 + r1
            goto Lc5
        L59:
            int r1 = r13.getVisibility()
            r2 = 8
            if (r1 == r2) goto Lc5
            int r4 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            r5 = r1
            android.support.v7.widget.g0$a r5 = (android.support.v7.widget.g0.a) r5
            int r1 = r5.f858b
            if (r1 >= 0) goto L75
            r1 = r11
        L75:
            int r2 = b.b.c.g.q.d(r17)
            int r1 = b.b.c.g.d.a(r1, r2)
            r1 = r1 & 7
            if (r1 == r14) goto L8b
            r2 = 5
            if (r1 == r2) goto L88
            int r1 = r5.leftMargin
            int r1 = r1 + r7
            goto L96
        L88:
            int r1 = r8 - r4
            goto L93
        L8b:
            int r1 = r9 - r4
            int r1 = r1 / 2
            int r1 = r1 + r7
            int r2 = r5.leftMargin
            int r1 = r1 + r2
        L93:
            int r2 = r5.rightMargin
            int r1 = r1 - r2
        L96:
            r2 = r1
            boolean r1 = r6.b(r12)
            if (r1 == 0) goto La0
            int r1 = r6.n
            int r0 = r0 + r1
        La0:
            int r1 = r5.topMargin
            int r16 = r0 + r1
            int r0 = r6.a(r13)
            int r3 = r16 + r0
            r0 = r17
            r1 = r13
            r14 = r5
            r5 = r15
            r0.a(r1, r2, r3, r4, r5)
            int r0 = r14.bottomMargin
            int r15 = r15 + r0
            int r0 = r6.b(r13)
            int r15 = r15 + r0
            int r16 = r16 + r15
            int r0 = r6.a(r13, r12)
            int r12 = r12 + r0
            r0 = r16
            r1 = 1
            goto Lc6
        Lc5:
            r1 = r14
        Lc6:
            int r12 = r12 + r1
            goto L49
        Lc8:
            return
    }

    void b(android.graphics.Canvas r6) {
            r5 = this;
            int r0 = r5.getVirtualChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L31
            android.view.View r2 = r5.a(r1)
            if (r2 == 0) goto L2e
            int r3 = r2.getVisibility()
            r4 = 8
            if (r3 == r4) goto L2e
            boolean r3 = r5.b(r1)
            if (r3 == 0) goto L2e
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            android.support.v7.widget.g0$a r3 = (android.support.v7.widget.g0.a) r3
            int r2 = r2.getTop()
            int r3 = r3.topMargin
            int r2 = r2 - r3
            int r3 = r5.n
            int r2 = r2 - r3
            r5.a(r6, r2)
        L2e:
            int r1 = r1 + 1
            goto L5
        L31:
            boolean r1 = r5.b(r0)
            if (r1 == 0) goto L5c
            int r0 = r0 + (-1)
            android.view.View r0 = r5.a(r0)
            if (r0 != 0) goto L4c
            int r0 = r5.getHeight()
            int r1 = r5.getPaddingBottom()
            int r0 = r0 - r1
            int r1 = r5.n
            int r0 = r0 - r1
            goto L59
        L4c:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.support.v7.widget.g0$a r1 = (android.support.v7.widget.g0.a) r1
            int r0 = r0.getBottom()
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
        L59:
            r5.a(r6, r0)
        L5c:
            return
    }

    void b(android.graphics.Canvas r6, int r7) {
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.l
            int r1 = r5.getPaddingTop()
            int r2 = r5.p
            int r1 = r1 + r2
            int r2 = r5.m
            int r2 = r2 + r7
            int r3 = r5.getHeight()
            int r4 = r5.getPaddingBottom()
            int r3 = r3 - r4
            int r4 = r5.p
            int r3 = r3 - r4
            r0.setBounds(r7, r1, r2, r3)
            android.graphics.drawable.Drawable r5 = r5.l
            r5.draw(r6)
            return
    }

    protected boolean b(int r5) {
            r4 = this;
            r0 = 0
            r1 = 1
            if (r5 != 0) goto Lb
            int r4 = r4.o
            r4 = r4 & r1
            if (r4 == 0) goto La
            r0 = r1
        La:
            return r0
        Lb:
            int r2 = r4.getChildCount()
            if (r5 != r2) goto L19
            int r4 = r4.o
            r4 = r4 & 4
            if (r4 == 0) goto L18
            r0 = r1
        L18:
            return r0
        L19:
            int r2 = r4.o
            r2 = r2 & 2
            if (r2 == 0) goto L33
            int r5 = r5 - r1
        L20:
            if (r5 < 0) goto L33
            android.view.View r2 = r4.getChildAt(r5)
            int r2 = r2.getVisibility()
            r3 = 8
            if (r2 == r3) goto L30
            r0 = r1
            goto L33
        L30:
            int r5 = r5 + (-1)
            goto L20
        L33:
            return r0
    }

    int c(int r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r0 = r1 instanceof android.support.v7.widget.g0.a
            return r0
    }

    @Override // android.view.ViewGroup
    protected android.support.v7.widget.g0.a generateDefaultLayoutParams() {
            r2 = this;
            int r2 = r2.e
            r0 = -2
            if (r2 != 0) goto Lb
            android.support.v7.widget.g0$a r2 = new android.support.v7.widget.g0$a
            r2.<init>(r0, r0)
            return r2
        Lb:
            r1 = 1
            if (r2 != r1) goto L15
            android.support.v7.widget.g0$a r2 = new android.support.v7.widget.g0$a
            r1 = -1
            r2.<init>(r1, r0)
            return r2
        L15:
            r2 = 0
            return r2
    }

    @Override // android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r0 = this;
            android.support.v7.widget.g0$a r0 = r0.generateDefaultLayoutParams()
            return r0
    }

    @Override // android.view.ViewGroup
    public android.support.v7.widget.g0.a generateLayoutParams(android.util.AttributeSet r2) {
            r1 = this;
            android.support.v7.widget.g0$a r0 = new android.support.v7.widget.g0$a
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1, r2)
            return r0
    }

    @Override // android.view.ViewGroup
    protected android.support.v7.widget.g0.a generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            android.support.v7.widget.g0$a r0 = new android.support.v7.widget.g0$a
            r0.<init>(r1)
            return r0
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            android.support.v7.widget.g0$a r0 = r0.generateLayoutParams(r1)
            return r0
    }

    @Override // android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            android.support.v7.widget.g0$a r0 = r0.generateLayoutParams(r1)
            return r0
    }

    @Override // android.view.View
    public int getBaseline() {
            r5 = this;
            int r0 = r5.f856c
            if (r0 >= 0) goto L9
            int r5 = super.getBaseline()
            return r5
        L9:
            int r0 = r5.getChildCount()
            int r1 = r5.f856c
            if (r0 <= r1) goto L77
            android.view.View r0 = r5.getChildAt(r1)
            int r1 = r0.getBaseline()
            r2 = -1
            if (r1 != r2) goto L29
            int r5 = r5.f856c
            if (r5 != 0) goto L21
            return r2
        L21:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r0 = "mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline."
            r5.<init>(r0)
            throw r5
        L29:
            int r2 = r5.d
            int r3 = r5.e
            r4 = 1
            if (r3 != r4) goto L6c
            int r3 = r5.f
            r3 = r3 & 112(0x70, float:1.57E-43)
            r4 = 48
            if (r3 == r4) goto L6c
            r4 = 16
            if (r3 == r4) goto L53
            r4 = 80
            if (r3 == r4) goto L41
            goto L6c
        L41:
            int r2 = r5.getBottom()
            int r3 = r5.getTop()
            int r2 = r2 - r3
            int r3 = r5.getPaddingBottom()
            int r2 = r2 - r3
            int r5 = r5.g
            int r2 = r2 - r5
            goto L6c
        L53:
            int r3 = r5.getBottom()
            int r4 = r5.getTop()
            int r3 = r3 - r4
            int r4 = r5.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r5.getPaddingBottom()
            int r3 = r3 - r4
            int r5 = r5.g
            int r3 = r3 - r5
            int r3 = r3 / 2
            int r2 = r2 + r3
        L6c:
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.support.v7.widget.g0$a r5 = (android.support.v7.widget.g0.a) r5
            int r5 = r5.topMargin
            int r2 = r2 + r5
            int r2 = r2 + r1
            return r2
        L77:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r0 = "mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds."
            r5.<init>(r0)
            throw r5
    }

    public int getBaselineAlignedChildIndex() {
            r0 = this;
            int r0 = r0.f856c
            return r0
    }

    public android.graphics.drawable.Drawable getDividerDrawable() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.l
            return r0
    }

    public int getDividerPadding() {
            r0 = this;
            int r0 = r0.p
            return r0
    }

    public int getDividerWidth() {
            r0 = this;
            int r0 = r0.m
            return r0
    }

    public int getGravity() {
            r0 = this;
            int r0 = r0.f
            return r0
    }

    public int getOrientation() {
            r0 = this;
            int r0 = r0.e
            return r0
    }

    public int getShowDividers() {
            r0 = this;
            int r0 = r0.o
            return r0
    }

    int getVirtualChildCount() {
            r0 = this;
            int r0 = r0.getChildCount()
            return r0
    }

    public float getWeightSum() {
            r0 = this;
            float r0 = r0.h
            return r0
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.l
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = r2.e
            r1 = 1
            if (r0 != r1) goto Le
            r2.b(r3)
            goto L11
        Le:
            r2.a(r3)
        L11:
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r1) {
            r0 = this;
            super.onInitializeAccessibilityEvent(r1)
            java.lang.Class<android.support.v7.widget.g0> r0 = android.support.v7.widget.g0.class
            java.lang.String r0 = r0.getName()
            r1.setClassName(r0)
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r1) {
            r0 = this;
            super.onInitializeAccessibilityNodeInfo(r1)
            java.lang.Class<android.support.v7.widget.g0> r0 = android.support.v7.widget.g0.class
            java.lang.String r0 = r0.getName()
            r1.setClassName(r0)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            int r2 = r1.e
            r0 = 1
            if (r2 != r0) goto L9
            r1.b(r3, r4, r5, r6)
            goto Lc
        L9:
            r1.a(r3, r4, r5, r6)
        Lc:
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r3, int r4) {
            r2 = this;
            int r0 = r2.e
            r1 = 1
            if (r0 != r1) goto L9
            r2.b(r3, r4)
            goto Lc
        L9:
            r2.a(r3, r4)
        Lc:
            return
    }

    public void setBaselineAligned(boolean r1) {
            r0 = this;
            r0.f855b = r1
            return
    }

    public void setBaselineAlignedChildIndex(int r3) {
            r2 = this;
            if (r3 < 0) goto Lb
            int r0 = r2.getChildCount()
            if (r3 >= r0) goto Lb
            r2.f856c = r3
            return
        Lb:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "base aligned child index out of range (0, "
            r0.append(r1)
            int r2 = r2.getChildCount()
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
    }

    public void setDividerDrawable(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.l
            if (r3 != r0) goto L5
            return
        L5:
            r2.l = r3
            r0 = 0
            if (r3 == 0) goto L17
            int r1 = r3.getIntrinsicWidth()
            r2.m = r1
            int r1 = r3.getIntrinsicHeight()
            r2.n = r1
            goto L1b
        L17:
            r2.m = r0
            r2.n = r0
        L1b:
            if (r3 != 0) goto L1e
            r0 = 1
        L1e:
            r2.setWillNotDraw(r0)
            r2.requestLayout()
            return
    }

    public void setDividerPadding(int r1) {
            r0 = this;
            r0.p = r1
            return
    }

    public void setGravity(int r2) {
            r1 = this;
            int r0 = r1.f
            if (r0 == r2) goto L19
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r0 = r0 & r2
            if (r0 != 0) goto Le
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r2 = r2 | r0
        Le:
            r0 = r2 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L14
            r2 = r2 | 48
        L14:
            r1.f = r2
            r1.requestLayout()
        L19:
            return
    }

    public void setHorizontalGravity(int r3) {
            r2 = this;
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r3 = r3 & r0
            int r1 = r2.f
            r0 = r0 & r1
            if (r0 == r3) goto L13
            r0 = -8388616(0xffffffffff7ffff8, float:-3.402822E38)
            r0 = r0 & r1
            r3 = r3 | r0
            r2.f = r3
            r2.requestLayout()
        L13:
            return
    }

    public void setMeasureWithLargestChildEnabled(boolean r1) {
            r0 = this;
            r0.i = r1
            return
    }

    public void setOrientation(int r2) {
            r1 = this;
            int r0 = r1.e
            if (r0 == r2) goto L9
            r1.e = r2
            r1.requestLayout()
        L9:
            return
    }

    public void setShowDividers(int r2) {
            r1 = this;
            int r0 = r1.o
            if (r2 == r0) goto L7
            r1.requestLayout()
        L7:
            r1.o = r2
            return
    }

    public void setVerticalGravity(int r3) {
            r2 = this;
            r3 = r3 & 112(0x70, float:1.57E-43)
            int r0 = r2.f
            r1 = r0 & 112(0x70, float:1.57E-43)
            if (r1 == r3) goto L10
            r0 = r0 & (-113(0xffffffffffffff8f, float:NaN))
            r3 = r3 | r0
            r2.f = r3
            r2.requestLayout()
        L10:
            return
    }

    public void setWeightSum(float r2) {
            r1 = this;
            r0 = 0
            float r2 = java.lang.Math.max(r0, r2)
            r1.h = r2
            return
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
            r0 = this;
            r0 = 0
            return r0
    }
}
