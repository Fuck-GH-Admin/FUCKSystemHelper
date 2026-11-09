package a.a.a.b;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.locks.Lock f17a = null;

    static {
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            a.a.a.b.e.f17a = r0
            return
    }

    public static int a(java.lang.String r3) {
            r0 = -1
            if (r3 == 0) goto L25
            java.lang.String r1 = ""
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lc
            goto L25
        Lc:
            boolean r1 = a()
            if (r1 == 0) goto L25
            java.util.concurrent.locks.Lock r1 = a.a.a.b.e.f17a
            r1.lock()
            r2 = 0
            int r3 = com.baidu.location.indoor.mapversion.IndoorJni.getGpsStatus(r2, r3)     // Catch: java.lang.Throwable -> L20
            r1.unlock()
            return r3
        L20:
            java.util.concurrent.locks.Lock r3 = a.a.a.b.e.f17a
            r3.unlock()
        L25:
            return r0
    }

    public static int a(java.lang.String r2, java.lang.String r3) {
            if (r2 == 0) goto L31
            java.lang.String r0 = ""
            boolean r1 = r0.equals(r2)
            if (r1 == 0) goto Lb
            goto L31
        Lb:
            if (r3 == 0) goto L13
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L15
        L13:
            java.lang.String r3 = "default"
        L15:
            boolean r0 = a()
            if (r0 == 0) goto L2e
            java.util.concurrent.locks.Lock r0 = a.a.a.b.e.f17a
            r0.lock()
            r1 = 0
            int r2 = com.baidu.location.indoor.mapversion.IndoorJni.initGpsChecker(r1, r2, r3)     // Catch: java.lang.Throwable -> L29
            r0.unlock()
            return r2
        L29:
            java.util.concurrent.locks.Lock r2 = a.a.a.b.e.f17a
            r2.unlock()
        L2e:
            r2 = -101(0xffffffffffffff9b, float:NaN)
            return r2
        L31:
            r2 = -100
            return r2
    }

    public static boolean a() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 >= r1) goto L8
            r0 = 0
            return r0
        L8:
            boolean r0 = com.baidu.location.indoor.mapversion.IndoorJni.f1378a
            return r0
    }

    public static int b() {
            boolean r0 = a()
            if (r0 == 0) goto L18
            java.util.concurrent.locks.Lock r0 = a.a.a.b.e.f17a
            r0.lock()
            int r1 = com.baidu.location.indoor.mapversion.IndoorJni.destroyGpsChecker()     // Catch: java.lang.Throwable -> L13
            r0.unlock()
            return r1
        L13:
            java.util.concurrent.locks.Lock r0 = a.a.a.b.e.f17a
            r0.unlock()
        L18:
            r0 = 0
            return r0
    }
}
