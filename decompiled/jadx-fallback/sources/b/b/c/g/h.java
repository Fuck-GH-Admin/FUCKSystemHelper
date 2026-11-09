package b.b.c.g;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static android.view.MenuItem a(android.view.MenuItem r1, b.b.c.g.c r2) {
            boolean r0 = r1 instanceof b.b.c.c.a.b
            if (r0 == 0) goto Lb
            b.b.c.c.a.b r1 = (b.b.c.c.a.b) r1
            b.b.c.c.a.b r1 = r1.a(r2)
            return r1
        Lb:
            java.lang.String r2 = "MenuItemCompat"
            java.lang.String r0 = "setActionProvider: item does not implement SupportMenuItem; ignoring"
            android.util.Log.w(r2, r0)
            return r1
    }

    public static void a(android.view.MenuItem r2, char r3, int r4) {
            boolean r0 = r2 instanceof b.b.c.c.a.b
            if (r0 == 0) goto La
            b.b.c.c.a.b r2 = (b.b.c.c.a.b) r2
            r2.setAlphabeticShortcut(r3, r4)
            goto L13
        La:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L13
            r2.setAlphabeticShortcut(r3, r4)
        L13:
            return
    }

    public static void a(android.view.MenuItem r2, android.content.res.ColorStateList r3) {
            boolean r0 = r2 instanceof b.b.c.c.a.b
            if (r0 == 0) goto La
            b.b.c.c.a.b r2 = (b.b.c.c.a.b) r2
            r2.setIconTintList(r3)
            goto L13
        La:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L13
            r2.setIconTintList(r3)
        L13:
            return
    }

    public static void a(android.view.MenuItem r2, android.graphics.PorterDuff.Mode r3) {
            boolean r0 = r2 instanceof b.b.c.c.a.b
            if (r0 == 0) goto La
            b.b.c.c.a.b r2 = (b.b.c.c.a.b) r2
            r2.setIconTintMode(r3)
            goto L13
        La:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L13
            r2.setIconTintMode(r3)
        L13:
            return
    }

    public static void a(android.view.MenuItem r2, java.lang.CharSequence r3) {
            boolean r0 = r2 instanceof b.b.c.c.a.b
            if (r0 == 0) goto La
            b.b.c.c.a.b r2 = (b.b.c.c.a.b) r2
            r2.setContentDescription(r3)
            goto L13
        La:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L13
            r2.setContentDescription(r3)
        L13:
            return
    }

    public static void b(android.view.MenuItem r2, char r3, int r4) {
            boolean r0 = r2 instanceof b.b.c.c.a.b
            if (r0 == 0) goto La
            b.b.c.c.a.b r2 = (b.b.c.c.a.b) r2
            r2.setNumericShortcut(r3, r4)
            goto L13
        La:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L13
            r2.setNumericShortcut(r3, r4)
        L13:
            return
    }

    public static void b(android.view.MenuItem r2, java.lang.CharSequence r3) {
            boolean r0 = r2 instanceof b.b.c.c.a.b
            if (r0 == 0) goto La
            b.b.c.c.a.b r2 = (b.b.c.c.a.b) r2
            r2.setTooltipText(r3)
            goto L13
        La:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L13
            r2.setTooltipText(r3)
        L13:
            return
    }
}
