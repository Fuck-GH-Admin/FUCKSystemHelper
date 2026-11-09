package android.support.constraint;

/* JADX INFO: loaded from: classes.dex */
public class f extends android.view.ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    android.support.constraint.e f449b;

    public static class a extends android.support.constraint.ConstraintLayout.b {
        public float A0;
        public float o0;
        public boolean p0;
        public float q0;
        public float r0;
        public float s0;
        public float t0;
        public float u0;
        public float v0;
        public float w0;
        public float x0;
        public float y0;
        public float z0;

        public a(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 1065353216(0x3f800000, float:1.0)
                r0.o0 = r1
                r2 = 0
                r0.p0 = r2
                r2 = 0
                r0.q0 = r2
                r0.r0 = r2
                r0.s0 = r2
                r0.t0 = r2
                r0.u0 = r1
                r0.v0 = r1
                r0.w0 = r2
                r0.x0 = r2
                r0.y0 = r2
                r0.z0 = r2
                r0.A0 = r2
                return
        }

        public a(android.content.Context r5, android.util.AttributeSet r6) {
                r4 = this;
                r4.<init>(r5, r6)
                r0 = 1065353216(0x3f800000, float:1.0)
                r4.o0 = r0
                r1 = 0
                r4.p0 = r1
                r2 = 0
                r4.q0 = r2
                r4.r0 = r2
                r4.s0 = r2
                r4.t0 = r2
                r4.u0 = r0
                r4.v0 = r0
                r4.w0 = r2
                r4.x0 = r2
                r4.y0 = r2
                r4.z0 = r2
                r4.A0 = r2
                int[] r0 = android.support.constraint.k.ConstraintSet
                android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r0)
                int r6 = r5.getIndexCount()
            L2b:
                if (r1 >= r6) goto Le1
                int r0 = r5.getIndex(r1)
                int r2 = android.support.constraint.k.ConstraintSet_android_alpha
                if (r0 != r2) goto L3f
                float r2 = r4.o0
                float r0 = r5.getFloat(r0, r2)
                r4.o0 = r0
                goto Ldd
            L3f:
                int r2 = android.support.constraint.k.ConstraintSet_android_elevation
                r3 = 21
                if (r0 != r2) goto L56
                int r2 = android.os.Build.VERSION.SDK_INT
                if (r2 < r3) goto Ldd
                float r2 = r4.q0
                float r0 = r5.getFloat(r0, r2)
                r4.q0 = r0
                r0 = 1
                r4.p0 = r0
                goto Ldd
            L56:
                int r2 = android.support.constraint.k.ConstraintSet_android_rotationX
                if (r0 != r2) goto L64
                float r2 = r4.s0
                float r0 = r5.getFloat(r0, r2)
                r4.s0 = r0
                goto Ldd
            L64:
                int r2 = android.support.constraint.k.ConstraintSet_android_rotationY
                if (r0 != r2) goto L72
                float r2 = r4.t0
                float r0 = r5.getFloat(r0, r2)
                r4.t0 = r0
                goto Ldd
            L72:
                int r2 = android.support.constraint.k.ConstraintSet_android_rotation
                if (r0 != r2) goto L7f
                float r2 = r4.r0
                float r0 = r5.getFloat(r0, r2)
                r4.r0 = r0
                goto Ldd
            L7f:
                int r2 = android.support.constraint.k.ConstraintSet_android_scaleX
                if (r0 != r2) goto L8c
                float r2 = r4.u0
                float r0 = r5.getFloat(r0, r2)
                r4.u0 = r0
                goto Ldd
            L8c:
                int r2 = android.support.constraint.k.ConstraintSet_android_scaleY
                if (r0 != r2) goto L99
                float r2 = r4.v0
                float r0 = r5.getFloat(r0, r2)
                r4.v0 = r0
                goto Ldd
            L99:
                int r2 = android.support.constraint.k.ConstraintSet_android_transformPivotX
                if (r0 != r2) goto La6
                float r2 = r4.w0
                float r0 = r5.getFloat(r0, r2)
                r4.w0 = r0
                goto Ldd
            La6:
                int r2 = android.support.constraint.k.ConstraintSet_android_transformPivotY
                if (r0 != r2) goto Lb3
                float r2 = r4.x0
                float r0 = r5.getFloat(r0, r2)
                r4.x0 = r0
                goto Ldd
            Lb3:
                int r2 = android.support.constraint.k.ConstraintSet_android_translationX
                if (r0 != r2) goto Lc0
                float r2 = r4.y0
                float r0 = r5.getFloat(r0, r2)
                r4.y0 = r0
                goto Ldd
            Lc0:
                int r2 = android.support.constraint.k.ConstraintSet_android_translationY
                if (r0 != r2) goto Lcd
                float r2 = r4.z0
                float r0 = r5.getFloat(r0, r2)
                r4.z0 = r0
                goto Ldd
            Lcd:
                int r2 = android.support.constraint.k.ConstraintSet_android_translationZ
                if (r0 != r2) goto Ldd
                int r2 = android.os.Build.VERSION.SDK_INT
                if (r2 < r3) goto Ldd
                float r2 = r4.A0
                float r0 = r5.getFloat(r0, r2)
                r4.A0 = r0
            Ldd:
                int r1 = r1 + 1
                goto L2b
            Le1:
                r5.recycle()
                return
        }
    }

    @Override // android.view.ViewGroup
    protected android.support.constraint.f.a generateDefaultLayoutParams() {
            r1 = this;
            android.support.constraint.f$a r1 = new android.support.constraint.f$a
            r0 = -2
            r1.<init>(r0, r0)
            return r1
    }

    @Override // android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r0 = this;
            android.support.constraint.f$a r0 = r0.generateDefaultLayoutParams()
            return r0
    }

    @Override // android.view.ViewGroup
    public android.support.constraint.f.a generateLayoutParams(android.util.AttributeSet r2) {
            r1 = this;
            android.support.constraint.f$a r0 = new android.support.constraint.f$a
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1, r2)
            return r0
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            android.support.constraint.f$a r0 = r0.generateLayoutParams(r1)
            return r0
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            android.support.constraint.ConstraintLayout$b r0 = new android.support.constraint.ConstraintLayout$b
            r0.<init>(r1)
            return r0
    }

    public android.support.constraint.e getConstraintSet() {
            r1 = this;
            android.support.constraint.e r0 = r1.f449b
            if (r0 != 0) goto Lb
            android.support.constraint.e r0 = new android.support.constraint.e
            r0.<init>()
            r1.f449b = r0
        Lb:
            android.support.constraint.e r0 = r1.f449b
            r0.a(r1)
            android.support.constraint.e r1 = r1.f449b
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            return
    }
}
