package c.d.a.b;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f1339a = 3072;

    static {
            return
    }

    public static void a(android.content.Context r0, java.lang.String r1) {
            return
    }

    public static void a(java.lang.String r4, java.lang.String r5) {
            boolean r0 = c.d.a.b.d.f1331a
            if (r0 == 0) goto L3e
            if (r4 == 0) goto L3e
            if (r5 == 0) goto L3e
            int r0 = r5.length()
            int r1 = c.d.a.b.h.f1339a
            if (r0 <= r1) goto L3b
            int r0 = r5.length()
            int r1 = c.d.a.b.h.f1339a
            int r0 = r0 / r1
            r1 = 0
        L18:
            if (r1 >= r0) goto L29
            int r2 = c.d.a.b.h.f1339a
            int r3 = r1 * r2
            int r1 = r1 + 1
            int r2 = r2 * r1
            java.lang.String r2 = r5.substring(r3, r2)
            android.util.Log.d(r4, r2)
            goto L18
        L29:
            int r0 = r5.length()
            int r1 = c.d.a.b.h.f1339a
            int r0 = r0 % r1
            if (r0 <= 0) goto L3e
            int r1 = r5.length()
            int r1 = r1 - r0
            java.lang.String r5 = r5.substring(r1)
        L3b:
            android.util.Log.d(r4, r5)
        L3e:
            return
    }

    public static void b(java.lang.String r1, java.lang.String r2) {
            boolean r0 = c.d.a.b.d.f1331a
            if (r0 == 0) goto Lb
            if (r1 == 0) goto Lb
            if (r2 == 0) goto Lb
            android.util.Log.e(r1, r2)
        Lb:
            return
    }
}
