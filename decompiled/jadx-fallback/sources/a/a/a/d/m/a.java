package a.a.a.d.m;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static java.util.concurrent.locks.Lock f186a;

    static {
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            a.a.a.d.m.a.f186a = r0
            return
    }

    public static synchronized java.lang.String a(int r9, float[] r10, long r11) {
            java.lang.Class<a.a.a.d.m.a> r0 = a.a.a.d.m.a.class
            monitor-enter(r0)
            r1 = 0
            java.util.concurrent.locks.Lock r2 = a.a.a.d.m.a.f186a     // Catch: java.lang.Throwable -> L37
            r2.lock()     // Catch: java.lang.Throwable -> L37
            boolean r2 = a()     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L29
            if (r10 == 0) goto L29
            int r2 = r10.length     // Catch: java.lang.Throwable -> L25
            r3 = 3
            if (r2 < r3) goto L29
            r2 = 0
            r4 = r10[r2]     // Catch: java.lang.Throwable -> L25
            r2 = 1
            r5 = r10[r2]     // Catch: java.lang.Throwable -> L25
            r2 = 2
            r6 = r10[r2]     // Catch: java.lang.Throwable -> L25
            r3 = r9
            r7 = r11
            java.lang.String r1 = com.baidu.location.indoor.mapversion.IndoorJni.phs(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L25
            goto L29
        L25:
            r9 = move-exception
            r9.printStackTrace()     // Catch: java.lang.Throwable -> L30
        L29:
            java.util.concurrent.locks.Lock r9 = a.a.a.d.m.a.f186a     // Catch: java.lang.Throwable -> L37
            r9.unlock()     // Catch: java.lang.Throwable -> L37
            monitor-exit(r0)
            return r1
        L30:
            r9 = move-exception
            java.util.concurrent.locks.Lock r10 = a.a.a.d.m.a.f186a     // Catch: java.lang.Throwable -> L37
            r10.unlock()     // Catch: java.lang.Throwable -> L37
            throw r9     // Catch: java.lang.Throwable -> L37
        L37:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
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

    public static float b() {
            java.util.concurrent.locks.Lock r0 = a.a.a.d.m.a.f186a
            r0.lock()
            float r0 = com.baidu.location.indoor.mapversion.IndoorJni.pgo()     // Catch: java.lang.Throwable -> La
            goto L10
        La:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L16
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
        L10:
            java.util.concurrent.locks.Lock r1 = a.a.a.d.m.a.f186a
            r1.unlock()
            return r0
        L16:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = a.a.a.d.m.a.f186a
            r1.unlock()
            throw r0
    }

    public static void c() {
            java.util.concurrent.locks.Lock r0 = a.a.a.d.m.a.f186a
            r0.lock()
            com.baidu.location.indoor.mapversion.IndoorJni.startPdr()     // Catch: java.lang.Throwable -> L9
            goto Ld
        L9:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L13
        Ld:
            java.util.concurrent.locks.Lock r0 = a.a.a.d.m.a.f186a
            r0.unlock()
            return
        L13:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = a.a.a.d.m.a.f186a
            r1.unlock()
            throw r0
    }

    public static void d() {
            java.util.concurrent.locks.Lock r0 = a.a.a.d.m.a.f186a
            r0.lock()
            com.baidu.location.indoor.mapversion.IndoorJni.stopPdr()     // Catch: java.lang.Throwable -> L9
            goto Ld
        L9:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L13
        Ld:
            java.util.concurrent.locks.Lock r0 = a.a.a.d.m.a.f186a
            r0.unlock()
            return
        L13:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = a.a.a.d.m.a.f186a
            r1.unlock()
            throw r0
    }
}
