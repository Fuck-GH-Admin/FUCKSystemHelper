package a.a.a.d;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static java.util.concurrent.locks.Lock f147a;

    static {
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            a.a.a.d.h.f147a = r0
            return
    }

    public static java.lang.String a(int r4) {
            boolean r0 = a()
            java.lang.String r1 = ""
            if (r0 == 0) goto L28
            long r2 = java.lang.System.currentTimeMillis()
            java.util.concurrent.locks.Lock r0 = a.a.a.d.h.f147a
            r0.lock()
            java.lang.String r4 = com.baidu.location.indoor.mapversion.IndoorJni.getFloor(r2, r4)     // Catch: java.lang.Throwable -> L17
            r1 = r4
            goto L1b
        L17:
            r4 = move-exception
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L21
        L1b:
            java.util.concurrent.locks.Lock r4 = a.a.a.d.h.f147a
            r4.unlock()
            goto L28
        L21:
            r4 = move-exception
            java.util.concurrent.locks.Lock r0 = a.a.a.d.h.f147a
            r0.unlock()
            throw r4
        L28:
            return r1
    }

    public static void a(double r1, double r3, float r5, float r6, float r7, double r8, int r10, long r11) {
            boolean r0 = a()
            if (r0 == 0) goto L20
            java.util.concurrent.locks.Lock r0 = a.a.a.d.h.f147a
            r0.lock()
            com.baidu.location.indoor.mapversion.IndoorJni.setGps(r1, r3, r5, r6, r7, r8, r10, r11)     // Catch: java.lang.Throwable -> Lf
            goto L13
        Lf:
            r1 = move-exception
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L19
        L13:
            java.util.concurrent.locks.Lock r1 = a.a.a.d.h.f147a
            r1.unlock()
            goto L20
        L19:
            r1 = move-exception
            java.util.concurrent.locks.Lock r2 = a.a.a.d.h.f147a
            r2.unlock()
            throw r1
        L20:
            return
    }

    public static void a(double r10, double r12, java.lang.String r14, int r15, long r16, int r18) {
            r0 = r14
            boolean r1 = a()
            if (r1 == 0) goto L37
            if (r0 == 0) goto L11
            java.lang.String r1 = ""
            boolean r1 = r1.equals(r14)
            if (r1 == 0) goto L13
        L11:
            java.lang.String r0 = "unknow"
        L13:
            r5 = r0
            java.util.concurrent.locks.Lock r0 = a.a.a.d.h.f147a
            r0.lock()
            r1 = r10
            r3 = r12
            r6 = r15
            r7 = r16
            r9 = r18
            com.baidu.location.indoor.mapversion.IndoorJni.setBleLoc4Scenario(r1, r3, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L24
            goto L29
        L24:
            r0 = move-exception
            r1 = r0
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L2f
        L29:
            java.util.concurrent.locks.Lock r0 = a.a.a.d.h.f147a
            r0.unlock()
            goto L37
        L2f:
            r0 = move-exception
            r1 = r0
            java.util.concurrent.locks.Lock r0 = a.a.a.d.h.f147a
            r0.unlock()
            throw r1
        L37:
            return
    }

    public static void a(float r1, long r2) {
            boolean r0 = a()
            if (r0 == 0) goto L20
            java.util.concurrent.locks.Lock r0 = a.a.a.d.h.f147a
            r0.lock()
            com.baidu.location.indoor.mapversion.IndoorJni.setBarometers(r1, r2)     // Catch: java.lang.Throwable -> Lf
            goto L13
        Lf:
            r1 = move-exception
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L19
        L13:
            java.util.concurrent.locks.Lock r1 = a.a.a.d.h.f147a
            r1.unlock()
            goto L20
        L19:
            r1 = move-exception
            java.util.concurrent.locks.Lock r2 = a.a.a.d.h.f147a
            r2.unlock()
            throw r1
        L20:
            return
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

    public static int b(int r4) {
            boolean r0 = a()
            r1 = -1
            if (r0 == 0) goto L27
            long r2 = java.lang.System.currentTimeMillis()
            java.util.concurrent.locks.Lock r0 = a.a.a.d.h.f147a
            r0.lock()
            int r4 = com.baidu.location.indoor.mapversion.IndoorJni.getInout(r2, r4)     // Catch: java.lang.Throwable -> L16
            r1 = r4
            goto L1a
        L16:
            r4 = move-exception
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L20
        L1a:
            java.util.concurrent.locks.Lock r4 = a.a.a.d.h.f147a
            r4.unlock()
            goto L27
        L20:
            r4 = move-exception
            java.util.concurrent.locks.Lock r0 = a.a.a.d.h.f147a
            r0.unlock()
            throw r4
        L27:
            return r1
    }
}
