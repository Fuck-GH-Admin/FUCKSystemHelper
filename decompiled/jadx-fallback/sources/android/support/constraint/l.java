package android.support.constraint;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends android.support.constraint.c {
    private boolean j;
    private boolean k;

    public void a(android.support.constraint.n.k.k r1, int r2, int r3) {
            r0 = this;
            return
    }

    @Override // android.support.constraint.c
    protected void a(android.util.AttributeSet r6) {
            r5 = this;
            super.a(r6)
            if (r6 == 0) goto L2e
            android.content.Context r0 = r5.getContext()
            int[] r1 = android.support.constraint.k.ConstraintLayout_Layout
            android.content.res.TypedArray r6 = r0.obtainStyledAttributes(r6, r1)
            int r0 = r6.getIndexCount()
            r1 = 0
        L14:
            if (r1 >= r0) goto L2b
            int r2 = r6.getIndex(r1)
            int r3 = android.support.constraint.k.ConstraintLayout_Layout_android_visibility
            r4 = 1
            if (r2 != r3) goto L22
            r5.j = r4
            goto L28
        L22:
            int r3 = android.support.constraint.k.ConstraintLayout_Layout_android_elevation
            if (r2 != r3) goto L28
            r5.k = r4
        L28:
            int r1 = r1 + 1
            goto L14
        L2b:
            r6.recycle()
        L2e:
            return
    }

    @Override // android.support.constraint.c, android.view.View
    public void onAttachedToWindow() {
            r8 = this;
            super.onAttachedToWindow()
            boolean r0 = r8.j
            if (r0 != 0) goto Lb
            boolean r0 = r8.k
            if (r0 == 0) goto L55
        Lb:
            android.view.ViewParent r0 = r8.getParent()
            if (r0 == 0) goto L55
            boolean r1 = r0 instanceof android.support.constraint.ConstraintLayout
            if (r1 == 0) goto L55
            android.support.constraint.ConstraintLayout r0 = (android.support.constraint.ConstraintLayout) r0
            int r1 = r8.getVisibility()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 21
            r4 = 0
            if (r2 < r3) goto L27
            float r2 = r8.getElevation()
            goto L28
        L27:
            r2 = r4
        L28:
            r5 = 0
        L29:
            int r6 = r8.f422c
            if (r5 >= r6) goto L55
            int[] r6 = r8.f421b
            r6 = r6[r5]
            android.view.View r6 = r0.a(r6)
            if (r6 == 0) goto L52
            boolean r7 = r8.j
            if (r7 == 0) goto L3e
            r6.setVisibility(r1)
        L3e:
            boolean r7 = r8.k
            if (r7 == 0) goto L52
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 <= 0) goto L52
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 < r3) goto L52
            float r7 = r6.getTranslationZ()
            float r7 = r7 + r2
            r6.setTranslationZ(r7)
        L52:
            int r5 = r5 + 1
            goto L29
        L55:
            return
    }

    @Override // android.view.View
    public void setElevation(float r1) {
            r0 = this;
            super.setElevation(r1)
            r0.a()
            return
    }

    @Override // android.view.View
    public void setVisibility(int r1) {
            r0 = this;
            super.setVisibility(r1)
            r0.a()
            return
    }
}
