package b.b.d.b.a;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.ThreadLocal<android.util.TypedValue> f1138a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.util.WeakHashMap<android.content.Context, android.util.SparseArray<b.b.d.b.a.a.C0048a>> f1139b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.lang.Object f1140c = null;

    /* JADX INFO: renamed from: b.b.d.b.a.a$a, reason: collision with other inner class name */
    private static class C0048a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final android.content.res.ColorStateList f1141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final android.content.res.Configuration f1142b;

        C0048a(android.content.res.ColorStateList r1, android.content.res.Configuration r2) {
                r0 = this;
                r0.<init>()
                r0.f1141a = r1
                r0.f1142b = r2
                return
        }
    }

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            b.b.d.b.a.a.f1138a = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r1 = 0
            r0.<init>(r1)
            b.b.d.b.a.a.f1139b = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            b.b.d.b.a.a.f1140c = r0
            return
    }

    private static android.content.res.ColorStateList a(android.content.Context r4, int r5) {
            java.lang.Object r0 = b.b.d.b.a.a.f1140c
            monitor-enter(r0)
            java.util.WeakHashMap<android.content.Context, android.util.SparseArray<b.b.d.b.a.a$a>> r1 = b.b.d.b.a.a.f1139b     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L35
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto L32
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L35
            if (r2 <= 0) goto L32
            java.lang.Object r2 = r1.get(r5)     // Catch: java.lang.Throwable -> L35
            b.b.d.b.a.a$a r2 = (b.b.d.b.a.a.C0048a) r2     // Catch: java.lang.Throwable -> L35
            if (r2 == 0) goto L32
            android.content.res.Configuration r3 = r2.f1142b     // Catch: java.lang.Throwable -> L35
            android.content.res.Resources r4 = r4.getResources()     // Catch: java.lang.Throwable -> L35
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch: java.lang.Throwable -> L35
            boolean r4 = r3.equals(r4)     // Catch: java.lang.Throwable -> L35
            if (r4 == 0) goto L2f
            android.content.res.ColorStateList r4 = r2.f1141a     // Catch: java.lang.Throwable -> L35
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            return r4
        L2f:
            r1.remove(r5)     // Catch: java.lang.Throwable -> L35
        L32:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            r4 = 0
            return r4
        L35:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            throw r4
    }

    private static android.util.TypedValue a() {
            java.lang.ThreadLocal<android.util.TypedValue> r0 = b.b.d.b.a.a.f1138a
            java.lang.Object r0 = r0.get()
            android.util.TypedValue r0 = (android.util.TypedValue) r0
            if (r0 != 0) goto L14
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            java.lang.ThreadLocal<android.util.TypedValue> r1 = b.b.d.b.a.a.f1138a
            r1.set(r0)
        L14:
            return r0
    }

    private static void a(android.content.Context r3, int r4, android.content.res.ColorStateList r5) {
            java.lang.Object r0 = b.b.d.b.a.a.f1140c
            monitor-enter(r0)
            java.util.WeakHashMap<android.content.Context, android.util.SparseArray<b.b.d.b.a.a$a>> r1 = b.b.d.b.a.a.f1139b     // Catch: java.lang.Throwable -> L29
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Throwable -> L29
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto L17
            android.util.SparseArray r1 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L29
            r1.<init>()     // Catch: java.lang.Throwable -> L29
            java.util.WeakHashMap<android.content.Context, android.util.SparseArray<b.b.d.b.a.a$a>> r2 = b.b.d.b.a.a.f1139b     // Catch: java.lang.Throwable -> L29
            r2.put(r3, r1)     // Catch: java.lang.Throwable -> L29
        L17:
            b.b.d.b.a.a$a r2 = new b.b.d.b.a.a$a     // Catch: java.lang.Throwable -> L29
            android.content.res.Resources r3 = r3.getResources()     // Catch: java.lang.Throwable -> L29
            android.content.res.Configuration r3 = r3.getConfiguration()     // Catch: java.lang.Throwable -> L29
            r2.<init>(r5, r3)     // Catch: java.lang.Throwable -> L29
            r1.append(r4, r2)     // Catch: java.lang.Throwable -> L29
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            return
        L29:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            throw r3
    }

    public static android.content.res.ColorStateList b(android.content.Context r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            android.content.res.ColorStateList r2 = r2.getColorStateList(r3)
            return r2
        Lb:
            android.content.res.ColorStateList r0 = a(r2, r3)
            if (r0 == 0) goto L12
            return r0
        L12:
            android.content.res.ColorStateList r0 = d(r2, r3)
            if (r0 == 0) goto L1c
            a(r2, r3, r0)
            return r0
        L1c:
            android.content.res.ColorStateList r2 = b.b.c.a.a.a(r2, r3)
            return r2
    }

    public static android.graphics.drawable.Drawable c(android.content.Context r1, int r2) {
            android.support.v7.widget.j r0 = android.support.v7.widget.j.a()
            android.graphics.drawable.Drawable r1 = r0.a(r1, r2)
            return r1
    }

    private static android.content.res.ColorStateList d(android.content.Context r2, int r3) {
            boolean r0 = e(r2, r3)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            android.content.res.Resources r0 = r2.getResources()
            android.content.res.XmlResourceParser r3 = r0.getXml(r3)
            android.content.res.Resources$Theme r2 = r2.getTheme()     // Catch: java.lang.Exception -> L19
            android.content.res.ColorStateList r2 = b.b.c.a.d.a.a(r0, r3, r2)     // Catch: java.lang.Exception -> L19
            return r2
        L19:
            r2 = move-exception
            java.lang.String r3 = "AppCompatResources"
            java.lang.String r0 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.e(r3, r0, r2)
            return r1
    }

    private static boolean e(android.content.Context r2, int r3) {
            android.content.res.Resources r2 = r2.getResources()
            android.util.TypedValue r0 = a()
            r1 = 1
            r2.getValue(r3, r0, r1)
            int r2 = r0.type
            r3 = 28
            if (r2 < r3) goto L17
            r3 = 31
            if (r2 > r3) goto L17
            goto L18
        L17:
            r1 = 0
        L18:
            return r1
    }
}
