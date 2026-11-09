package b.b.c.g.a0;

/* JADX INFO: loaded from: classes.dex */
abstract class d implements android.view.animation.Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f1104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f1105b;

    protected d(float[] r2) {
            r1 = this;
            r1.<init>()
            r1.f1104a = r2
            int r2 = r2.length
            int r2 = r2 + (-1)
            float r2 = (float) r2
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 / r2
            r1.f1105b = r0
            return
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float r4) {
            r3 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 < 0) goto L7
            return r0
        L7:
            r0 = 0
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 > 0) goto Ld
            return r0
        Ld:
            float[] r0 = r3.f1104a
            int r1 = r0.length
            int r1 = r1 + (-1)
            float r1 = (float) r1
            float r1 = r1 * r4
            int r1 = (int) r1
            int r0 = r0.length
            int r0 = r0 + (-2)
            int r0 = java.lang.Math.min(r1, r0)
            float r1 = (float) r0
            float r2 = r3.f1105b
            float r1 = r1 * r2
            float r4 = r4 - r1
            float r4 = r4 / r2
            float[] r3 = r3.f1104a
            r1 = r3[r0]
            int r2 = r0 + 1
            r2 = r3[r2]
            r3 = r3[r0]
            float r2 = r2 - r3
            float r4 = r4 * r2
            float r1 = r1 + r4
            return r1
    }
}
