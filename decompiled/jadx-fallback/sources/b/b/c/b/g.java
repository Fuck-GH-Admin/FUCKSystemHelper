package b.b.c.b;

/* JADX INFO: loaded from: classes.dex */
public class g extends b.b.c.b.f {
    public g() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // b.b.c.b.f
    protected android.graphics.Typeface a(java.lang.Object r5) {
            r4 = this;
            java.lang.Class r0 = r4.f1033a     // Catch: java.lang.Throwable -> L2d
            r1 = 1
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)     // Catch: java.lang.Throwable -> L2d
            r2 = 0
            java.lang.reflect.Array.set(r0, r2, r5)     // Catch: java.lang.Throwable -> L2d
            java.lang.reflect.Method r4 = r4.g     // Catch: java.lang.Throwable -> L2d
            r5 = 0
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L2d
            r3[r2] = r0     // Catch: java.lang.Throwable -> L2d
            java.lang.String r0 = "sans-serif"
            r3[r1] = r0     // Catch: java.lang.Throwable -> L2d
            r0 = 2
            r1 = -1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L2d
            r3[r0] = r2     // Catch: java.lang.Throwable -> L2d
            r0 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L2d
            r3[r0] = r1     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r4 = r4.invoke(r5, r3)     // Catch: java.lang.Throwable -> L2d
            android.graphics.Typeface r4 = (android.graphics.Typeface) r4     // Catch: java.lang.Throwable -> L2d
            return r4
        L2d:
            r4 = move-exception
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            r5.<init>(r4)
            throw r5
    }

    @Override // b.b.c.b.f
    protected java.lang.reflect.Method d(java.lang.Class r4) {
            r3 = this;
            r3 = 1
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r3)
            java.lang.Class<android.graphics.Typeface> r0 = android.graphics.Typeface.class
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class r4 = r4.getClass()
            r2 = 0
            r1[r2] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r1[r3] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r2 = 2
            r1[r2] = r4
            r2 = 3
            r1[r2] = r4
            java.lang.String r4 = "createFromFamiliesWithDefault"
            java.lang.reflect.Method r4 = r0.getDeclaredMethod(r4, r1)
            r4.setAccessible(r3)
            return r4
    }
}
