package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
public class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static java.lang.reflect.Method f959a;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 18
            if (r0 < r1) goto L30
            java.lang.Class<android.view.View> r0 = android.view.View.class
            java.lang.String r1 = "computeFitSystemWindows"
            r2 = 2
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L29
            r3 = 0
            java.lang.Class<android.graphics.Rect> r4 = android.graphics.Rect.class
            r2[r3] = r4     // Catch: java.lang.NoSuchMethodException -> L29
            java.lang.Class<android.graphics.Rect> r3 = android.graphics.Rect.class
            r4 = 1
            r2[r4] = r3     // Catch: java.lang.NoSuchMethodException -> L29
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L29
            android.support.v7.widget.z0.f959a = r0     // Catch: java.lang.NoSuchMethodException -> L29
            boolean r0 = r0.isAccessible()     // Catch: java.lang.NoSuchMethodException -> L29
            if (r0 != 0) goto L30
            java.lang.reflect.Method r0 = android.support.v7.widget.z0.f959a     // Catch: java.lang.NoSuchMethodException -> L29
            r0.setAccessible(r4)     // Catch: java.lang.NoSuchMethodException -> L29
            goto L30
        L29:
            java.lang.String r0 = "ViewUtils"
            java.lang.String r1 = "Could not find method computeFitSystemWindows. Oh well."
            android.util.Log.d(r0, r1)
        L30:
            return
    }

    public static void a(android.view.View r3, android.graphics.Rect r4, android.graphics.Rect r5) {
            java.lang.reflect.Method r0 = android.support.v7.widget.z0.f959a
            if (r0 == 0) goto L19
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L11
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.Exception -> L11
            r4 = 1
            r1[r4] = r5     // Catch: java.lang.Exception -> L11
            r0.invoke(r3, r1)     // Catch: java.lang.Exception -> L11
            goto L19
        L11:
            r3 = move-exception
            java.lang.String r4 = "ViewUtils"
            java.lang.String r5 = "Could not invoke computeFitSystemWindows"
            android.util.Log.d(r4, r5, r3)
        L19:
            return
    }

    public static boolean a(android.view.View r1) {
            int r1 = b.b.c.g.q.d(r1)
            r0 = 1
            if (r1 != r0) goto L8
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static void b(android.view.View r6) {
            java.lang.String r0 = "Could not invoke makeOptionalFitsSystemWindows"
            java.lang.String r1 = "ViewUtils"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 16
            if (r2 < r3) goto L31
            java.lang.Class r2 = r6.getClass()     // Catch: java.lang.Throwable -> L27 java.lang.NoSuchMethodException -> L2c
            java.lang.String r3 = "makeOptionalFitsSystemWindows"
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L27 java.lang.NoSuchMethodException -> L2c
            java.lang.reflect.Method r2 = r2.getMethod(r3, r5)     // Catch: java.lang.Throwable -> L27 java.lang.NoSuchMethodException -> L2c
            boolean r3 = r2.isAccessible()     // Catch: java.lang.Throwable -> L27 java.lang.NoSuchMethodException -> L2c
            if (r3 != 0) goto L21
            r3 = 1
            r2.setAccessible(r3)     // Catch: java.lang.Throwable -> L27 java.lang.NoSuchMethodException -> L2c
        L21:
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L27 java.lang.NoSuchMethodException -> L2c
            r2.invoke(r6, r3)     // Catch: java.lang.Throwable -> L27 java.lang.NoSuchMethodException -> L2c
            goto L31
        L27:
            r6 = move-exception
            android.util.Log.d(r1, r0, r6)
            goto L31
        L2c:
            java.lang.String r6 = "Could not find method makeOptionalFitsSystemWindows. Oh well..."
            android.util.Log.d(r1, r6)
        L31:
            return
    }
}
