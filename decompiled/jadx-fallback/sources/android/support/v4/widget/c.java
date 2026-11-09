package android.support.v4.widget;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static java.lang.reflect.Field f645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f646b;

    public static android.graphics.drawable.Drawable a(android.widget.CompoundButton r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            android.graphics.drawable.Drawable r4 = r4.getButtonDrawable()
            return r4
        Lb:
            boolean r0 = android.support.v4.widget.c.f646b
            java.lang.String r1 = "CompoundButtonCompat"
            if (r0 != 0) goto L28
            r0 = 1
            java.lang.Class<android.widget.CompoundButton> r2 = android.widget.CompoundButton.class
            java.lang.String r3 = "mButtonDrawable"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.NoSuchFieldException -> L20
            android.support.v4.widget.c.f645a = r2     // Catch: java.lang.NoSuchFieldException -> L20
            r2.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L20
            goto L26
        L20:
            r2 = move-exception
            java.lang.String r3 = "Failed to retrieve mButtonDrawable field"
            android.util.Log.i(r1, r3, r2)
        L26:
            android.support.v4.widget.c.f646b = r0
        L28:
            java.lang.reflect.Field r0 = android.support.v4.widget.c.f645a
            r2 = 0
            if (r0 == 0) goto L3c
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.IllegalAccessException -> L34
            android.graphics.drawable.Drawable r4 = (android.graphics.drawable.Drawable) r4     // Catch: java.lang.IllegalAccessException -> L34
            return r4
        L34:
            r4 = move-exception
            java.lang.String r0 = "Failed to get button drawable via reflection"
            android.util.Log.i(r1, r0, r4)
            android.support.v4.widget.c.f645a = r2
        L3c:
            return r2
    }

    public static void a(android.widget.CompoundButton r2, android.content.res.ColorStateList r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto La
            r2.setButtonTintList(r3)
            goto L13
        La:
            boolean r0 = r2 instanceof android.support.v4.widget.m
            if (r0 == 0) goto L13
            android.support.v4.widget.m r2 = (android.support.v4.widget.m) r2
            r2.setSupportButtonTintList(r3)
        L13:
            return
    }

    public static void a(android.widget.CompoundButton r2, android.graphics.PorterDuff.Mode r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto La
            r2.setButtonTintMode(r3)
            goto L13
        La:
            boolean r0 = r2 instanceof android.support.v4.widget.m
            if (r0 == 0) goto L13
            android.support.v4.widget.m r2 = (android.support.v4.widget.m) r2
            r2.setSupportButtonTintMode(r3)
        L13:
            return
    }
}
