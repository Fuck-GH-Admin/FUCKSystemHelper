package a.a.a.b;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static android.os.HandlerThread f85a;

    static {
            return
    }

    public static synchronized android.os.HandlerThread a() {
            java.lang.Class<a.a.a.b.v> r0 = a.a.a.b.v.class
            monitor-enter(r0)
            android.os.HandlerThread r1 = a.a.a.b.v.f85a     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto L1d
            android.os.HandlerThread r1 = new android.os.HandlerThread     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = "ServiceStartArguments"
            r3 = 10
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L16
            a.a.a.b.v.f85a = r1     // Catch: java.lang.Throwable -> L16
            r1.start()     // Catch: java.lang.Throwable -> L16
            goto L1d
        L16:
            r1 = move-exception
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L21
            r1 = 0
            a.a.a.b.v.f85a = r1     // Catch: java.lang.Throwable -> L21
        L1d:
            android.os.HandlerThread r1 = a.a.a.b.v.f85a     // Catch: java.lang.Throwable -> L21
            monitor-exit(r0)
            return r1
        L21:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }
}
