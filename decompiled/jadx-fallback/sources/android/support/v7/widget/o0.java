package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.ThreadLocal<android.util.TypedValue> f900a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int[] f901b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int[] f902c = null;
    static final int[] d = null;
    static final int[] e = null;
    static final int[] f = null;
    private static final int[] g = null;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            android.support.v7.widget.o0.f900a = r0
            r0 = 1
            int[] r1 = new int[r0]
            r2 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            r3 = 0
            r1[r3] = r2
            android.support.v7.widget.o0.f901b = r1
            int[] r1 = new int[r0]
            r2 = 16842908(0x101009c, float:2.3693995E-38)
            r1[r3] = r2
            android.support.v7.widget.o0.f902c = r1
            int[] r1 = new int[r0]
            r2 = 16842919(0x10100a7, float:2.3694026E-38)
            r1[r3] = r2
            android.support.v7.widget.o0.d = r1
            int[] r1 = new int[r0]
            r2 = 16842912(0x10100a0, float:2.3694006E-38)
            r1[r3] = r2
            android.support.v7.widget.o0.e = r1
            int[] r1 = new int[r3]
            android.support.v7.widget.o0.f = r1
            int[] r0 = new int[r0]
            android.support.v7.widget.o0.g = r0
            return
    }

    public static int a(android.content.Context r4, int r5) {
            android.content.res.ColorStateList r0 = c(r4, r5)
            if (r0 == 0) goto L17
            boolean r1 = r0.isStateful()
            if (r1 == 0) goto L17
            int[] r4 = android.support.v7.widget.o0.f901b
            int r5 = r0.getDefaultColor()
            int r4 = r0.getColorForState(r4, r5)
            return r4
        L17:
            android.util.TypedValue r0 = a()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            r2 = 16842803(0x1010033, float:2.36937E-38)
            r3 = 1
            r1.resolveAttribute(r2, r0, r3)
            float r0 = r0.getFloat()
            int r4 = a(r4, r5, r0)
            return r4
    }

    static int a(android.content.Context r0, int r1, float r2) {
            int r0 = b(r0, r1)
            int r1 = android.graphics.Color.alpha(r0)
            float r1 = (float) r1
            float r1 = r1 * r2
            int r1 = java.lang.Math.round(r1)
            int r0 = b.b.c.b.a.c(r0, r1)
            return r0
    }

    private static android.util.TypedValue a() {
            java.lang.ThreadLocal<android.util.TypedValue> r0 = android.support.v7.widget.o0.f900a
            java.lang.Object r0 = r0.get()
            android.util.TypedValue r0 = (android.util.TypedValue) r0
            if (r0 != 0) goto L14
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            java.lang.ThreadLocal<android.util.TypedValue> r1 = android.support.v7.widget.o0.f900a
            r1.set(r0)
        L14:
            return r0
    }

    public static int b(android.content.Context r2, int r3) {
            int[] r0 = android.support.v7.widget.o0.g
            r1 = 0
            r0[r1] = r3
            r3 = 0
            android.support.v7.widget.t0 r2 = android.support.v7.widget.t0.a(r2, r3, r0)
            int r3 = r2.a(r1, r1)     // Catch: java.lang.Throwable -> L12
            r2.a()
            return r3
        L12:
            r3 = move-exception
            r2.a()
            throw r3
    }

    public static android.content.res.ColorStateList c(android.content.Context r2, int r3) {
            int[] r0 = android.support.v7.widget.o0.g
            r1 = 0
            r0[r1] = r3
            r3 = 0
            android.support.v7.widget.t0 r2 = android.support.v7.widget.t0.a(r2, r3, r0)
            android.content.res.ColorStateList r3 = r2.a(r1)     // Catch: java.lang.Throwable -> L12
            r2.a()
            return r3
        L12:
            r3 = move-exception
            r2.a()
            throw r3
    }
}
