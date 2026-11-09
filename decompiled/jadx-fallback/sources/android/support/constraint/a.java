package android.support.constraint;

/* JADX INFO: loaded from: classes.dex */
public class a extends android.support.constraint.c {
    private int j;
    private int k;
    private android.support.constraint.n.k.a l;

    public a(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 8
            super.setVisibility(r1)
            return
    }

    private void a(android.support.constraint.n.k.e r6, int r7, boolean r8) {
            r5 = this;
            r5.k = r7
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 1
            r1 = 0
            r2 = 6
            r3 = 5
            r4 = 17
            if (r7 >= r4) goto L16
            int r7 = r5.j
            if (r7 != r3) goto L13
        L10:
            r5.k = r1
            goto L28
        L13:
            if (r7 != r2) goto L28
        L15:
            goto L1c
        L16:
            int r7 = r5.j
            if (r8 == 0) goto L22
            if (r7 != r3) goto L1f
        L1c:
            r5.k = r0
            goto L28
        L1f:
            if (r7 != r2) goto L28
            goto L10
        L22:
            if (r7 != r3) goto L25
            goto L10
        L25:
            if (r7 != r2) goto L28
            goto L15
        L28:
            boolean r7 = r6 instanceof android.support.constraint.n.k.a
            if (r7 == 0) goto L33
            android.support.constraint.n.k.a r6 = (android.support.constraint.n.k.a) r6
            int r5 = r5.k
            r6.x(r5)
        L33:
            return
    }

    @Override // android.support.constraint.c
    public void a(android.support.constraint.n.k.e r2, boolean r3) {
            r1 = this;
            int r0 = r1.j
            r1.a(r2, r0, r3)
            return
    }

    @Override // android.support.constraint.c
    protected void a(android.util.AttributeSet r7) {
            r6 = this;
            super.a(r7)
            android.support.constraint.n.k.a r0 = new android.support.constraint.n.k.a
            r0.<init>()
            r6.l = r0
            if (r7 == 0) goto L50
            android.content.Context r0 = r6.getContext()
            int[] r1 = android.support.constraint.k.ConstraintLayout_Layout
            android.content.res.TypedArray r7 = r0.obtainStyledAttributes(r7, r1)
            int r0 = r7.getIndexCount()
            r1 = 0
            r2 = r1
        L1c:
            if (r2 >= r0) goto L4d
            int r3 = r7.getIndex(r2)
            int r4 = android.support.constraint.k.ConstraintLayout_Layout_barrierDirection
            if (r3 != r4) goto L2e
            int r3 = r7.getInt(r3, r1)
            r6.setType(r3)
            goto L4a
        L2e:
            int r4 = android.support.constraint.k.ConstraintLayout_Layout_barrierAllowsGoneWidgets
            if (r3 != r4) goto L3d
            android.support.constraint.n.k.a r4 = r6.l
            r5 = 1
            boolean r3 = r7.getBoolean(r3, r5)
            r4.e(r3)
            goto L4a
        L3d:
            int r4 = android.support.constraint.k.ConstraintLayout_Layout_barrierMargin
            if (r3 != r4) goto L4a
            int r3 = r7.getDimensionPixelSize(r3, r1)
            android.support.constraint.n.k.a r4 = r6.l
            r4.y(r3)
        L4a:
            int r2 = r2 + 1
            goto L1c
        L4d:
            r7.recycle()
        L50:
            android.support.constraint.n.k.a r7 = r6.l
            r6.e = r7
            r6.b()
            return
    }

    public boolean c() {
            r0 = this;
            android.support.constraint.n.k.a r0 = r0.l
            boolean r0 = r0.S()
            return r0
    }

    public int getMargin() {
            r0 = this;
            android.support.constraint.n.k.a r0 = r0.l
            int r0 = r0.U()
            return r0
    }

    public int getType() {
            r0 = this;
            int r0 = r0.j
            return r0
    }

    public void setAllowsGoneWidget(boolean r1) {
            r0 = this;
            android.support.constraint.n.k.a r0 = r0.l
            r0.e(r1)
            return
    }

    public void setDpMargin(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r2 = (float) r2
            float r2 = r2 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r0
            int r2 = (int) r2
            android.support.constraint.n.k.a r1 = r1.l
            r1.y(r2)
            return
    }

    public void setMargin(int r1) {
            r0 = this;
            android.support.constraint.n.k.a r0 = r0.l
            r0.y(r1)
            return
    }

    public void setType(int r1) {
            r0 = this;
            r0.j = r1
            return
    }
}
