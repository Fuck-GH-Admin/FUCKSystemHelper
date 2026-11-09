package c.a.c.a;

/* JADX INFO: loaded from: classes.dex */
class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f1289a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static java.lang.String f1290b = "BaiduApiAuth";

    static {
            return
    }

    public static java.lang.String a() {
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r1 = 2
            r0 = r0[r1]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r0.getFileName()
            r1.append(r2)
            java.lang.String r2 = "["
            r1.append(r2)
            int r0 = r0.getLineNumber()
            r1.append(r0)
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    public static void a(java.lang.String r3) {
            boolean r0 = c.a.c.a.d.f1289a
            if (r0 == 0) goto L2d
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            int r0 = r0.length
            if (r0 != 0) goto L10
            return
        L10:
            java.lang.String r0 = c.a.c.a.d.f1290b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = a()
            r1.append(r2)
            java.lang.String r2 = ";"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            android.util.Log.d(r0, r3)
        L2d:
            return
    }

    public static void b(java.lang.String r1) {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            int r0 = r0.length
            if (r0 != 0) goto Lc
            return
        Lc:
            java.lang.String r0 = c.a.c.a.d.f1290b
            android.util.Log.i(r0, r1)
            return
    }

    public static void c(java.lang.String r3) {
            boolean r0 = c.a.c.a.d.f1289a
            if (r0 == 0) goto L2d
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            int r0 = r0.length
            if (r0 != 0) goto L10
            return
        L10:
            java.lang.String r0 = c.a.c.a.d.f1290b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = a()
            r1.append(r2)
            java.lang.String r2 = ";"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            android.util.Log.e(r0, r3)
        L2d:
            return
    }
}
