package b.b.c.g;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static java.lang.reflect.Field f1113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f1114b;

    private static void a(android.view.LayoutInflater r6, android.view.LayoutInflater.Factory2 r7) {
            boolean r0 = b.b.c.g.f.f1114b
            java.lang.String r1 = "; inflation may have unexpected results."
            java.lang.String r2 = "LayoutInflaterCompatHC"
            if (r0 != 0) goto L37
            r0 = 1
            java.lang.Class<android.view.LayoutInflater> r3 = android.view.LayoutInflater.class
            java.lang.String r4 = "mFactory2"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch: java.lang.NoSuchFieldException -> L17
            b.b.c.g.f.f1113a = r3     // Catch: java.lang.NoSuchFieldException -> L17
            r3.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L17
            goto L35
        L17:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "forceSetFactory2 Could not find field 'mFactory2' on class "
            r4.append(r5)
            java.lang.Class<android.view.LayoutInflater> r5 = android.view.LayoutInflater.class
            java.lang.String r5 = r5.getName()
            r4.append(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            android.util.Log.e(r2, r4, r3)
        L35:
            b.b.c.g.f.f1114b = r0
        L37:
            java.lang.reflect.Field r0 = b.b.c.g.f.f1113a
            if (r0 == 0) goto L57
            r0.set(r6, r7)     // Catch: java.lang.IllegalAccessException -> L3f
            goto L57
        L3f:
            r7 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "forceSetFactory2 could not set the Factory2 on LayoutInflater "
            r0.append(r3)
            r0.append(r6)
            r0.append(r1)
            java.lang.String r6 = r0.toString()
            android.util.Log.e(r2, r6, r7)
        L57:
            return
    }

    public static void b(android.view.LayoutInflater r2, android.view.LayoutInflater.Factory2 r3) {
            r2.setFactory2(r3)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 >= r1) goto L1a
            android.view.LayoutInflater$Factory r0 = r2.getFactory()
            boolean r1 = r0 instanceof android.view.LayoutInflater.Factory2
            if (r1 == 0) goto L17
            android.view.LayoutInflater$Factory2 r0 = (android.view.LayoutInflater.Factory2) r0
            a(r2, r0)
            goto L1a
        L17:
            a(r2, r3)
        L1a:
            return
    }
}
