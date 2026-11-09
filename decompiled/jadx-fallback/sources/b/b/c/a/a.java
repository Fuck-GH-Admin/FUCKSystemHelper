package b.b.c.a;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.Object f1006a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static android.util.TypedValue f1007b;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            b.b.c.a.a.f1006a = r0
            return
    }

    public static int a(android.content.Context r2, java.lang.String r3) {
            if (r3 == 0) goto Lf
            int r0 = android.os.Process.myPid()
            int r1 = android.os.Process.myUid()
            int r2 = r2.checkPermission(r3, r0, r1)
            return r2
        Lf:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "permission is null"
            r2.<init>(r3)
            throw r2
    }

    public static android.content.res.ColorStateList a(android.content.Context r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            android.content.res.ColorStateList r2 = r2.getColorStateList(r3)
            return r2
        Lb:
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.ColorStateList r2 = r2.getColorStateList(r3)
            return r2
    }

    public static boolean a(android.content.Context r2, android.content.Intent[] r3, android.os.Bundle r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto La
            r2.startActivities(r3, r4)
            goto Ld
        La:
            r2.startActivities(r3)
        Ld:
            r2 = 1
            return r2
    }

    public static android.graphics.drawable.Drawable b(android.content.Context r4, int r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto Lb
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r5)
            return r4
        Lb:
            r1 = 16
            if (r0 < r1) goto L18
        Lf:
            android.content.res.Resources r4 = r4.getResources()
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r5)
            return r4
        L18:
            java.lang.Object r0 = b.b.c.a.a.f1006a
            monitor-enter(r0)
            android.util.TypedValue r1 = b.b.c.a.a.f1007b     // Catch: java.lang.Throwable -> L36
            if (r1 != 0) goto L26
            android.util.TypedValue r1 = new android.util.TypedValue     // Catch: java.lang.Throwable -> L36
            r1.<init>()     // Catch: java.lang.Throwable -> L36
            b.b.c.a.a.f1007b = r1     // Catch: java.lang.Throwable -> L36
        L26:
            android.content.res.Resources r1 = r4.getResources()     // Catch: java.lang.Throwable -> L36
            android.util.TypedValue r2 = b.b.c.a.a.f1007b     // Catch: java.lang.Throwable -> L36
            r3 = 1
            r1.getValue(r5, r2, r3)     // Catch: java.lang.Throwable -> L36
            android.util.TypedValue r5 = b.b.c.a.a.f1007b     // Catch: java.lang.Throwable -> L36
            int r5 = r5.resourceId     // Catch: java.lang.Throwable -> L36
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            goto Lf
        L36:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            throw r4
    }
}
