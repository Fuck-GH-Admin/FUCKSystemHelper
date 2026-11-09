package android.support.v4.graphics.drawable;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static java.lang.reflect.Method f627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static java.lang.reflect.Method f629c;
    private static boolean d;

    public static void a(android.graphics.drawable.Drawable r2, float r3, float r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L9
            r2.setHotspot(r3, r4)
        L9:
            return
    }

    public static void a(android.graphics.drawable.Drawable r2, int r3, int r4, int r5, int r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L9
            r2.setHotspotBounds(r3, r4, r5, r6)
        L9:
            return
    }

    public static void a(android.graphics.drawable.Drawable r2, android.content.res.ColorStateList r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto La
            r2.setTintList(r3)
            goto L13
        La:
            boolean r0 = r2 instanceof android.support.v4.graphics.drawable.b
            if (r0 == 0) goto L13
            android.support.v4.graphics.drawable.b r2 = (android.support.v4.graphics.drawable.b) r2
            r2.setTintList(r3)
        L13:
            return
    }

    public static void a(android.graphics.drawable.Drawable r2, android.content.res.Resources.Theme r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L9
            r2.applyTheme(r3)
        L9:
            return
    }

    public static void a(android.graphics.drawable.Drawable r2, android.content.res.Resources r3, org.xmlpull.v1.XmlPullParser r4, android.util.AttributeSet r5, android.content.res.Resources.Theme r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto La
            r2.inflate(r3, r4, r5, r6)
            goto Ld
        La:
            r2.inflate(r3, r4, r5)
        Ld:
            return
    }

    public static void a(android.graphics.drawable.Drawable r2, android.graphics.PorterDuff.Mode r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto La
            r2.setTintMode(r3)
            goto L13
        La:
            boolean r0 = r2 instanceof android.support.v4.graphics.drawable.b
            if (r0 == 0) goto L13
            android.support.v4.graphics.drawable.b r2 = (android.support.v4.graphics.drawable.b) r2
            r2.setTintMode(r3)
        L13:
            return
    }

    public static void a(android.graphics.drawable.Drawable r2, boolean r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 < r1) goto L9
            r2.setAutoMirrored(r3)
        L9:
            return
    }

    public static boolean a(android.graphics.drawable.Drawable r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto Lb
            boolean r2 = r2.canApplyTheme()
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public static boolean a(android.graphics.drawable.Drawable r7, int r8) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            boolean r7 = r7.setLayoutDirection(r8)
            return r7
        Lb:
            r1 = 17
            r2 = 0
            if (r0 < r1) goto L4c
            boolean r0 = android.support.v4.graphics.drawable.a.f628b
            java.lang.String r1 = "DrawableCompat"
            r3 = 1
            if (r0 != 0) goto L33
            java.lang.Class<android.graphics.drawable.Drawable> r0 = android.graphics.drawable.Drawable.class
            java.lang.String r4 = "setLayoutDirection"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L2b
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L2b
            r5[r2] = r6     // Catch: java.lang.NoSuchMethodException -> L2b
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L2b
            android.support.v4.graphics.drawable.a.f627a = r0     // Catch: java.lang.NoSuchMethodException -> L2b
            r0.setAccessible(r3)     // Catch: java.lang.NoSuchMethodException -> L2b
            goto L31
        L2b:
            r0 = move-exception
            java.lang.String r4 = "Failed to retrieve setLayoutDirection(int) method"
            android.util.Log.i(r1, r4, r0)
        L31:
            android.support.v4.graphics.drawable.a.f628b = r3
        L33:
            java.lang.reflect.Method r0 = android.support.v4.graphics.drawable.a.f627a
            if (r0 == 0) goto L4c
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L43
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Exception -> L43
            r4[r2] = r8     // Catch: java.lang.Exception -> L43
            r0.invoke(r7, r4)     // Catch: java.lang.Exception -> L43
            return r3
        L43:
            r7 = move-exception
            java.lang.String r8 = "Failed to invoke setLayoutDirection(int) via reflection"
            android.util.Log.i(r1, r8, r7)
            r7 = 0
            android.support.v4.graphics.drawable.a.f627a = r7
        L4c:
            return r2
    }

    public static int b(android.graphics.drawable.Drawable r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 < r1) goto Lb
            int r2 = r2.getAlpha()
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public static void b(android.graphics.drawable.Drawable r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto La
            r2.setTint(r3)
            goto L13
        La:
            boolean r0 = r2 instanceof android.support.v4.graphics.drawable.b
            if (r0 == 0) goto L13
            android.support.v4.graphics.drawable.b r2 = (android.support.v4.graphics.drawable.b) r2
            r2.setTint(r3)
        L13:
            return
    }

    public static android.graphics.ColorFilter c(android.graphics.drawable.Drawable r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto Lb
            android.graphics.ColorFilter r2 = r2.getColorFilter()
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public static int d(android.graphics.drawable.Drawable r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            int r6 = r6.getLayoutDirection()
            return r6
        Lb:
            r1 = 17
            r2 = 0
            if (r0 < r1) goto L49
            boolean r0 = android.support.v4.graphics.drawable.a.d
            java.lang.String r1 = "DrawableCompat"
            if (r0 != 0) goto L2f
            r0 = 1
            java.lang.Class<android.graphics.drawable.Drawable> r3 = android.graphics.drawable.Drawable.class
            java.lang.String r4 = "getLayoutDirection"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L27
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L27
            android.support.v4.graphics.drawable.a.f629c = r3     // Catch: java.lang.NoSuchMethodException -> L27
            r3.setAccessible(r0)     // Catch: java.lang.NoSuchMethodException -> L27
            goto L2d
        L27:
            r3 = move-exception
            java.lang.String r4 = "Failed to retrieve getLayoutDirection() method"
            android.util.Log.i(r1, r4, r3)
        L2d:
            android.support.v4.graphics.drawable.a.d = r0
        L2f:
            java.lang.reflect.Method r0 = android.support.v4.graphics.drawable.a.f629c
            if (r0 == 0) goto L49
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L40
            java.lang.Object r6 = r0.invoke(r6, r3)     // Catch: java.lang.Exception -> L40
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.Exception -> L40
            int r6 = r6.intValue()     // Catch: java.lang.Exception -> L40
            return r6
        L40:
            r6 = move-exception
            java.lang.String r0 = "Failed to invoke getLayoutDirection() via reflection"
            android.util.Log.i(r1, r0, r6)
            r6 = 0
            android.support.v4.graphics.drawable.a.f629c = r6
        L49:
            return r2
    }

    public static boolean e(android.graphics.drawable.Drawable r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 < r1) goto Lb
            boolean r2 = r2.isAutoMirrored()
            return r2
        Lb:
            r2 = 0
            return r2
    }

    @java.lang.Deprecated
    public static void f(android.graphics.drawable.Drawable r0) {
            r0.jumpToCurrentState()
            return
    }

    public static android.graphics.drawable.Drawable g(android.graphics.drawable.Drawable r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L7
            return r2
        L7:
            r1 = 21
            if (r0 < r1) goto L16
            boolean r0 = r2 instanceof android.support.v4.graphics.drawable.b
            if (r0 != 0) goto L15
            android.support.v4.graphics.drawable.e r0 = new android.support.v4.graphics.drawable.e
            r0.<init>(r2)
            return r0
        L15:
            return r2
        L16:
            boolean r0 = r2 instanceof android.support.v4.graphics.drawable.b
            if (r0 != 0) goto L20
            android.support.v4.graphics.drawable.d r0 = new android.support.v4.graphics.drawable.d
            r0.<init>(r2)
            return r0
        L20:
            return r2
    }
}
