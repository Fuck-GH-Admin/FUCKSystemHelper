package b.b.c.g;

/* JADX INFO: loaded from: classes.dex */
public final class r {
    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 != r1) goto L18
            java.lang.Class<android.view.ViewConfiguration> r0 = android.view.ViewConfiguration.class
            java.lang.String r1 = "getScaledScrollFactor"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L11
            r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Exception -> L11
            goto L18
        L11:
            java.lang.String r0 = "ViewConfigCompat"
            java.lang.String r1 = "Could not find method getScaledScrollFactor() on ViewConfiguration"
            android.util.Log.i(r0, r1)
        L18:
            return
    }

    public static int a(android.view.ViewConfiguration r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            int r2 = r2.getScaledHoverSlop()
            return r2
        Lb:
            int r2 = r2.getScaledTouchSlop()
            int r2 = r2 / 2
            return r2
    }

    public static boolean a(android.view.ViewConfiguration r2, android.content.Context r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            boolean r2 = r2.shouldShowMenuShortcutsWhenKeyboardPresent()
            return r2
        Lb:
            android.content.res.Resources r2 = r3.getResources()
            java.lang.String r3 = "config_showMenuShortcutsWhenKeyboardPresent"
            java.lang.String r0 = "bool"
            java.lang.String r1 = "android"
            int r3 = r2.getIdentifier(r3, r0, r1)
            if (r3 == 0) goto L23
            boolean r2 = r2.getBoolean(r3)
            if (r2 == 0) goto L23
            r2 = 1
            goto L24
        L23:
            r2 = 0
        L24:
            return r2
    }
}
