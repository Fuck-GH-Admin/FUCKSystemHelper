package b.b.b.a;

/* JADX INFO: loaded from: classes.dex */
public class f implements android.animation.TypeEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b.b.b.a.f f988a = null;

    static {
            b.b.b.a.f r0 = new b.b.b.a.f
            r0.<init>()
            b.b.b.a.f.f988a = r0
            return
    }

    public f() {
            r0 = this;
            r0.<init>()
            return
    }

    public static b.b.b.a.f a() {
            b.b.b.a.f r0 = b.b.b.a.f.f988a
            return r0
    }

    @Override // android.animation.TypeEvaluator
    public java.lang.Object evaluate(float r11, java.lang.Object r12, java.lang.Object r13) {
            r10 = this;
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r10 = r12.intValue()
            int r12 = r10 >> 24
            r12 = r12 & 255(0xff, float:3.57E-43)
            float r12 = (float) r12
            r0 = 1132396544(0x437f0000, float:255.0)
            float r12 = r12 / r0
            int r1 = r10 >> 16
            r1 = r1 & 255(0xff, float:3.57E-43)
            float r1 = (float) r1
            float r1 = r1 / r0
            int r2 = r10 >> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            float r2 = (float) r2
            float r2 = r2 / r0
            r10 = r10 & 255(0xff, float:3.57E-43)
            float r10 = (float) r10
            float r10 = r10 / r0
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            int r3 = r13 >> 24
            r3 = r3 & 255(0xff, float:3.57E-43)
            float r3 = (float) r3
            float r3 = r3 / r0
            int r4 = r13 >> 16
            r4 = r4 & 255(0xff, float:3.57E-43)
            float r4 = (float) r4
            float r4 = r4 / r0
            int r5 = r13 >> 8
            r5 = r5 & 255(0xff, float:3.57E-43)
            float r5 = (float) r5
            float r5 = r5 / r0
            r13 = r13 & 255(0xff, float:3.57E-43)
            float r13 = (float) r13
            float r13 = r13 / r0
            double r6 = (double) r1
            r8 = 4612136378390124954(0x400199999999999a, double:2.2)
            double r6 = java.lang.Math.pow(r6, r8)
            float r1 = (float) r6
            double r6 = (double) r2
            double r6 = java.lang.Math.pow(r6, r8)
            float r2 = (float) r6
            double r6 = (double) r10
            double r6 = java.lang.Math.pow(r6, r8)
            float r10 = (float) r6
            double r6 = (double) r4
            double r6 = java.lang.Math.pow(r6, r8)
            float r4 = (float) r6
            double r5 = (double) r5
            double r5 = java.lang.Math.pow(r5, r8)
            float r5 = (float) r5
            double r6 = (double) r13
            double r6 = java.lang.Math.pow(r6, r8)
            float r13 = (float) r6
            float r3 = r3 - r12
            float r3 = r3 * r11
            float r12 = r12 + r3
            float r4 = r4 - r1
            float r4 = r4 * r11
            float r1 = r1 + r4
            float r5 = r5 - r2
            float r5 = r5 * r11
            float r2 = r2 + r5
            float r13 = r13 - r10
            float r11 = r11 * r13
            float r10 = r10 + r11
            float r12 = r12 * r0
            double r3 = (double) r1
            r5 = 4601859982876761367(0x3fdd1745d1745d17, double:0.45454545454545453)
            double r3 = java.lang.Math.pow(r3, r5)
            float r11 = (float) r3
            float r11 = r11 * r0
            double r1 = (double) r2
            double r1 = java.lang.Math.pow(r1, r5)
            float r13 = (float) r1
            float r13 = r13 * r0
            double r1 = (double) r10
            double r1 = java.lang.Math.pow(r1, r5)
            float r10 = (float) r1
            float r10 = r10 * r0
            int r12 = java.lang.Math.round(r12)
            int r12 = r12 << 24
            int r11 = java.lang.Math.round(r11)
            int r11 = r11 << 16
            r11 = r11 | r12
            int r12 = java.lang.Math.round(r13)
            int r12 = r12 << 8
            r11 = r11 | r12
            int r10 = java.lang.Math.round(r10)
            r10 = r10 | r11
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            return r10
    }
}
