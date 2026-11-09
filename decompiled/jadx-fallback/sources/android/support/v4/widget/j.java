package android.support.v4.widget;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static java.lang.reflect.Method f652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static java.lang.reflect.Field f654c;
    private static boolean d;

    public static void a(android.widget.PopupWindow r6, int r7) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto La
            r6.setWindowLayoutType(r7)
            return
        La:
            boolean r0 = android.support.v4.widget.j.f653b
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L25
            java.lang.Class<android.widget.PopupWindow> r0 = android.widget.PopupWindow.class
            java.lang.String r3 = "setWindowLayoutType"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L23
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L23
            r4[r1] = r5     // Catch: java.lang.Exception -> L23
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r4)     // Catch: java.lang.Exception -> L23
            android.support.v4.widget.j.f652a = r0     // Catch: java.lang.Exception -> L23
            r0.setAccessible(r2)     // Catch: java.lang.Exception -> L23
        L23:
            android.support.v4.widget.j.f653b = r2
        L25:
            java.lang.reflect.Method r0 = android.support.v4.widget.j.f652a
            if (r0 == 0) goto L34
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L34
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L34
            r2[r1] = r7     // Catch: java.lang.Exception -> L34
            r0.invoke(r6, r2)     // Catch: java.lang.Exception -> L34
        L34:
            return
    }

    public static void a(android.widget.PopupWindow r2, android.view.View r3, int r4, int r5, int r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 < r1) goto La
            r2.showAsDropDown(r3, r4, r5, r6)
            goto L24
        La:
            int r0 = b.b.c.g.q.d(r3)
            int r6 = b.b.c.g.d.a(r6, r0)
            r6 = r6 & 7
            r0 = 5
            if (r6 != r0) goto L21
            int r6 = r2.getWidth()
            int r0 = r3.getWidth()
            int r6 = r6 - r0
            int r4 = r4 - r6
        L21:
            r2.showAsDropDown(r3, r4, r5)
        L24:
            return
    }

    public static void a(android.widget.PopupWindow r4, boolean r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto La
            r4.setOverlapAnchor(r5)
            goto L3d
        La:
            r1 = 21
            if (r0 < r1) goto L3d
            boolean r0 = android.support.v4.widget.j.d
            java.lang.String r1 = "PopupWindowCompatApi21"
            if (r0 != 0) goto L2b
            r0 = 1
            java.lang.Class<android.widget.PopupWindow> r2 = android.widget.PopupWindow.class
            java.lang.String r3 = "mOverlapAnchor"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.NoSuchFieldException -> L23
            android.support.v4.widget.j.f654c = r2     // Catch: java.lang.NoSuchFieldException -> L23
            r2.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L23
            goto L29
        L23:
            r2 = move-exception
            java.lang.String r3 = "Could not fetch mOverlapAnchor field from PopupWindow"
            android.util.Log.i(r1, r3, r2)
        L29:
            android.support.v4.widget.j.d = r0
        L2b:
            java.lang.reflect.Field r0 = android.support.v4.widget.j.f654c
            if (r0 == 0) goto L3d
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.IllegalAccessException -> L37
            r0.set(r4, r5)     // Catch: java.lang.IllegalAccessException -> L37
            goto L3d
        L37:
            r4 = move-exception
            java.lang.String r5 = "Could not set overlap anchor field in PopupWindow"
            android.util.Log.i(r1, r5, r4)
        L3d:
            return
    }
}
