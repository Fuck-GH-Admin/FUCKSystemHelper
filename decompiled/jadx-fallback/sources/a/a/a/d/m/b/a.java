package a.a.a.d.m.b;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.locks.Lock f187a = null;

    static {
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            a.a.a.d.m.b.a.f187a = r0
            return
    }

    public static boolean a() {
            boolean r0 = com.baidu.location.indoor.mapversion.IndoorJni.f1378a
            if (r0 == 0) goto Lc
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 <= r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public static synchronized boolean a(java.lang.String r19) {
            r0 = r19
            java.lang.Class<a.a.a.d.m.b.a> r14 = a.a.a.d.m.b.a.class
            monitor-enter(r14)
            boolean r1 = a()     // Catch: java.lang.Throwable -> La2
            r2 = 0
            if (r1 != 0) goto Le
            monitor-exit(r14)
            return r2
        Le:
            a.a.a.d.m.c.a r1 = a.a.a.d.m.c.a.d()     // Catch: java.lang.Throwable -> La2
            a.a.a.d.m.c.a$e r15 = r1.g(r0)     // Catch: java.lang.Throwable -> La2
            a.a.a.d.m.c.a r1 = a.a.a.d.m.c.a.d()     // Catch: java.lang.Throwable -> La2
            double[][] r13 = r1.f(r0)     // Catch: java.lang.Throwable -> La2
            if (r15 != 0) goto L22
            monitor-exit(r14)
            return r2
        L22:
            java.lang.String r1 = "gcj02"
            r15.b(r1)     // Catch: java.lang.Throwable -> La2
            short[][] r3 = r15.h     // Catch: java.lang.Throwable -> La2
            a.a.a.d.m.c.a$b r1 = r15.a()     // Catch: java.lang.Throwable -> La2
            double r4 = r1.f193a     // Catch: java.lang.Throwable -> La2
            a.a.a.d.m.c.a$b r1 = r15.a()     // Catch: java.lang.Throwable -> La2
            double r6 = r1.f194b     // Catch: java.lang.Throwable -> La2
            a.a.a.d.m.c.a r1 = a.a.a.d.m.c.a.d()     // Catch: java.lang.Throwable -> La2
            a.a.a.d.m.c.a$e r1 = r1.b()     // Catch: java.lang.Throwable -> La2
            if (r1 != 0) goto L41
            monitor-exit(r14)
            return r2
        L41:
            a.a.a.d.m.c.a$b r2 = r15.a()     // Catch: java.lang.Throwable -> La2
            double r8 = r2.d     // Catch: java.lang.Throwable -> La2
            double r8 = -r8
            double r9 = r1.b(r8)     // Catch: java.lang.Throwable -> La2
            a.a.a.d.m.c.a$b r2 = r15.a()     // Catch: java.lang.Throwable -> La2
            double r11 = r2.f     // Catch: java.lang.Throwable -> La2
            double r11 = -r11
            double r11 = r1.a(r11)     // Catch: java.lang.Throwable -> La2
            java.util.concurrent.locks.Lock r16 = a.a.a.d.m.b.a.f187a     // Catch: java.lang.Throwable -> La2
            r16.lock()     // Catch: java.lang.Throwable -> La2
            a.a.a.d.m.c.a$b r1 = r15.g     // Catch: java.lang.Throwable -> L8a
            r18 = r13
            r17 = r14
            double r13 = r1.g     // Catch: java.lang.Throwable -> L88
            int r8 = (int) r13     // Catch: java.lang.Throwable -> L88
            double r1 = r1.h     // Catch: java.lang.Throwable -> L88
            int r13 = (int) r1     // Catch: java.lang.Throwable -> L88
            java.lang.String r14 = r15.f199c     // Catch: java.lang.Throwable -> L88
            r1 = r19
            r2 = r3
            r3 = r4
            r5 = r6
            r7 = r8
            r8 = r13
            r0 = r18
            r13 = r14
            com.baidu.location.indoor.mapversion.IndoorJni.setPfRdnt(r1, r2, r3, r5, r7, r8, r9, r11, r13)     // Catch: java.lang.Throwable -> L88
            a.a.a.d.m.c.a$b r1 = r15.g     // Catch: java.lang.Throwable -> L88
            double r2 = r1.g     // Catch: java.lang.Throwable -> L88
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L88
            double r3 = r1.h     // Catch: java.lang.Throwable -> L88
            int r1 = (int) r3     // Catch: java.lang.Throwable -> L88
            r3 = r19
            com.baidu.location.indoor.mapversion.IndoorJni.setPfGeoMap(r0, r3, r2, r1)     // Catch: java.lang.Throwable -> L88
            r16.unlock()     // Catch: java.lang.Throwable -> L98
            goto L95
        L88:
            r0 = move-exception
            goto L8d
        L8a:
            r0 = move-exception
            r17 = r14
        L8d:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L9a
            java.util.concurrent.locks.Lock r0 = a.a.a.d.m.b.a.f187a     // Catch: java.lang.Throwable -> L98
            r0.unlock()     // Catch: java.lang.Throwable -> L98
        L95:
            r0 = 1
            monitor-exit(r17)
            return r0
        L98:
            r0 = move-exception
            goto La5
        L9a:
            r0 = move-exception
            r1 = r0
            java.util.concurrent.locks.Lock r0 = a.a.a.d.m.b.a.f187a     // Catch: java.lang.Throwable -> L98
            r0.unlock()     // Catch: java.lang.Throwable -> L98
            throw r1     // Catch: java.lang.Throwable -> L98
        La2:
            r0 = move-exception
            r17 = r14
        La5:
            monitor-exit(r17)
            throw r0
    }

    public static double[] a(double r16, double r18, double r20, double r22, java.lang.String r24, java.lang.String r25, long r26, int r28, java.lang.String r29) {
            r0 = r24
            r1 = 12
            double[] r1 = new double[r1]
            r1 = {x004a: FILL_ARRAY_DATA , data: [-4616189618054758400, -4616189618054758400, -4616189618054758400, -4616189618054758400, -4616189618054758400, -4616189618054758400, -4616189618054758400, -4616189618054758400, -4616189618054758400, -4616189618054758400, -4616189618054758400, -4616189618054758400} // fill-array
            boolean r2 = a()
            if (r2 == 0) goto L49
            if (r0 == 0) goto L19
            java.lang.String r2 = ""
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L1b
        L19:
            java.lang.String r0 = "unknow"
        L1b:
            r10 = r0
            java.util.concurrent.locks.Lock r0 = a.a.a.d.m.b.a.f187a
            r0.lock()
            r2 = r16
            r4 = r18
            r6 = r20
            r8 = r22
            r11 = r25
            r12 = r26
            r14 = r28
            r15 = r29
            double[] r1 = com.baidu.location.indoor.mapversion.IndoorJni.setPfBle(r2, r4, r6, r8, r10, r11, r12, r14, r15)     // Catch: java.lang.Throwable -> L39
        L35:
            r0.unlock()
            goto L49
        L39:
            r0 = move-exception
            r2 = r0
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L41
            java.util.concurrent.locks.Lock r0 = a.a.a.d.m.b.a.f187a
            goto L35
        L41:
            r0 = move-exception
            r1 = r0
            java.util.concurrent.locks.Lock r0 = a.a.a.d.m.b.a.f187a
            r0.unlock()
            throw r1
        L49:
            return r1
    }

    public static synchronized double[] a(java.lang.String r16, double r17, double r19, double r21, java.lang.String r23) {
            java.lang.Class<a.a.a.d.m.b.a> r1 = a.a.a.d.m.b.a.class
            monitor-enter(r1)
            boolean r0 = a()     // Catch: java.lang.Throwable -> L85
            if (r0 != 0) goto Lc
            r0 = 0
            monitor-exit(r1)
            return r0
        Lc:
            a.a.a.d.m.c.a r0 = a.a.a.d.m.c.a.d()     // Catch: java.lang.Throwable -> L85
            a.a.a.d.m.c.a$e r2 = r0.b()     // Catch: java.lang.Throwable -> L85
            r0 = 12
            double[] r3 = new double[r0]     // Catch: java.lang.Throwable -> L85
            r4 = 0
            r5 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r3[r4] = r5     // Catch: java.lang.Throwable -> L85
            r7 = 1
            r3[r7] = r5     // Catch: java.lang.Throwable -> L85
            r8 = 2
            r3[r8] = r5     // Catch: java.lang.Throwable -> L85
            r0 = 3
            r3[r0] = r5     // Catch: java.lang.Throwable -> L85
            r0 = 4
            r3[r0] = r5     // Catch: java.lang.Throwable -> L85
            r0 = 5
            r3[r0] = r5     // Catch: java.lang.Throwable -> L85
            r0 = 6
            r3[r0] = r5     // Catch: java.lang.Throwable -> L85
            r0 = 7
            r3[r0] = r5     // Catch: java.lang.Throwable -> L85
            r0 = 8
            r3[r0] = r5     // Catch: java.lang.Throwable -> L85
            r0 = 9
            r3[r0] = r5     // Catch: java.lang.Throwable -> L85
            r0 = 10
            r3[r0] = r5     // Catch: java.lang.Throwable -> L85
            r0 = 11
            r3[r0] = r5     // Catch: java.lang.Throwable -> L85
            if (r2 == 0) goto L83
            java.util.concurrent.locks.Lock r0 = a.a.a.d.m.b.a.f187a     // Catch: java.lang.Throwable -> L85
            r0.lock()     // Catch: java.lang.Throwable -> L85
            long r14 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5b
            r9 = r19
            r11 = r21
            r13 = r23
            double[] r3 = com.baidu.location.indoor.mapversion.IndoorJni.setPfDr(r9, r11, r13, r14)     // Catch: java.lang.Throwable -> L5b
        L57:
            r0.unlock()     // Catch: java.lang.Throwable -> L85
            goto L62
        L5b:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L7b
            java.util.concurrent.locks.Lock r0 = a.a.a.d.m.b.a.f187a     // Catch: java.lang.Throwable -> L85
            goto L57
        L62:
            r4 = r3[r4]     // Catch: java.lang.Throwable -> L85
            r9 = 0
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 != 0) goto L83
            r4 = r3[r7]     // Catch: java.lang.Throwable -> L85
            double r4 = r2.c(r4)     // Catch: java.lang.Throwable -> L85
            r9 = r3[r8]     // Catch: java.lang.Throwable -> L85
            double r9 = r2.d(r9)     // Catch: java.lang.Throwable -> L85
            r3[r7] = r4     // Catch: java.lang.Throwable -> L85
            r3[r8] = r9     // Catch: java.lang.Throwable -> L85
            goto L83
        L7b:
            r0 = move-exception
            r2 = r0
            java.util.concurrent.locks.Lock r0 = a.a.a.d.m.b.a.f187a     // Catch: java.lang.Throwable -> L85
            r0.unlock()     // Catch: java.lang.Throwable -> L85
            throw r2     // Catch: java.lang.Throwable -> L85
        L83:
            monitor-exit(r1)
            return r3
        L85:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public static synchronized double[] a(boolean r23, com.baidu.location.c r24) {
            java.lang.Class<a.a.a.d.m.b.a> r1 = a.a.a.d.m.b.a.class
            monitor-enter(r1)
            boolean r0 = a()     // Catch: java.lang.Throwable -> Lf9
            if (r0 != 0) goto Lc
            r0 = 0
            monitor-exit(r1)
            return r0
        Lc:
            a.a.a.d.m.c.a r0 = a.a.a.d.m.c.a.d()     // Catch: java.lang.Throwable -> Lf9
            a.a.a.d.m.c.a$e r2 = r0.b()     // Catch: java.lang.Throwable -> Lf9
            r0 = 12
            double[] r3 = new double[r0]     // Catch: java.lang.Throwable -> Lf9
            r4 = 0
            r5 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r3[r4] = r5     // Catch: java.lang.Throwable -> Lf9
            r7 = 1
            r3[r7] = r5     // Catch: java.lang.Throwable -> Lf9
            r8 = 2
            r3[r8] = r5     // Catch: java.lang.Throwable -> Lf9
            r0 = 3
            r3[r0] = r5     // Catch: java.lang.Throwable -> Lf9
            r0 = 4
            r3[r0] = r5     // Catch: java.lang.Throwable -> Lf9
            r0 = 5
            r3[r0] = r5     // Catch: java.lang.Throwable -> Lf9
            r0 = 6
            r3[r0] = r5     // Catch: java.lang.Throwable -> Lf9
            r0 = 7
            r3[r0] = r5     // Catch: java.lang.Throwable -> Lf9
            r0 = 8
            r3[r0] = r5     // Catch: java.lang.Throwable -> Lf9
            r0 = 9
            r3[r0] = r5     // Catch: java.lang.Throwable -> Lf9
            r0 = 10
            r3[r0] = r5     // Catch: java.lang.Throwable -> Lf9
            r0 = 11
            r3[r0] = r5     // Catch: java.lang.Throwable -> Lf9
            if (r2 == 0) goto Lf7
            double r5 = r24.t()     // Catch: java.lang.Throwable -> Lf9
            double r9 = r2.b(r5)     // Catch: java.lang.Throwable -> Lf9
            double r5 = r24.q()     // Catch: java.lang.Throwable -> Lf9
            double r11 = r2.a(r5)     // Catch: java.lang.Throwable -> Lf9
            if (r23 == 0) goto Lbc
            java.lang.String r0 = a.a.a.d.h.a(r8)     // Catch: java.lang.Throwable -> Lf9
            if (r0 != 0) goto L64
            java.lang.String r3 = ""
            boolean r3 = r3.equals(r0)     // Catch: java.lang.Throwable -> Lf9
            if (r3 != 0) goto L6c
        L64:
            java.lang.String r3 = "_"
            java.lang.String[] r0 = r0.split(r3)     // Catch: java.lang.Throwable -> Lf9
            r0 = r0[r4]     // Catch: java.lang.Throwable -> Lf9
        L6c:
            if (r0 == 0) goto L76
            java.lang.String r3 = ""
            boolean r3 = r3.equals(r0)     // Catch: java.lang.Throwable -> Lf9
            if (r3 == 0) goto L78
        L76:
            java.lang.String r0 = "unknow"
        L78:
            r17 = r0
            a.a.a.d.e r0 = a.a.a.d.e.k()     // Catch: java.lang.Throwable -> Lf9
            java.lang.String r0 = r0.c()     // Catch: java.lang.Throwable -> Lf9
            if (r0 == 0) goto L8c
            java.lang.String r3 = ""
            boolean r3 = r3.equals(r0)     // Catch: java.lang.Throwable -> Lf9
            if (r3 == 0) goto L8e
        L8c:
            java.lang.String r0 = "unknow"
        L8e:
            r18 = r0
            r17.toUpperCase()     // Catch: java.lang.Throwable -> Lf9
            int r21 = a.a.a.d.h.b(r8)     // Catch: java.lang.Throwable -> Lf9
            java.lang.String r0 = r24.f()     // Catch: java.lang.Throwable -> Lf9
            if (r0 == 0) goto La5
            java.lang.String r3 = ""
            boolean r3 = r3.equals(r0)     // Catch: java.lang.Throwable -> Lf9
            if (r3 == 0) goto La7
        La5:
            java.lang.String r0 = "unknown"
        La7:
            r22 = r0
            float r0 = r24.z()     // Catch: java.lang.Throwable -> Lf9
            double r13 = (double) r0     // Catch: java.lang.Throwable -> Lf9
            double r15 = r24.a()     // Catch: java.lang.Throwable -> Lf9
            long r19 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lf9
            double[] r0 = a(r9, r11, r13, r15, r17, r18, r19, r21, r22)     // Catch: java.lang.Throwable -> Lf9
            r3 = r0
            goto Ld6
        Lbc:
            java.util.concurrent.locks.Lock r0 = a.a.a.d.m.b.a.f187a     // Catch: java.lang.Throwable -> Lf9
            r0.lock()     // Catch: java.lang.Throwable -> Lf9
            r13 = 4620693217682128896(0x4020000000000000, double:8.0)
            long r15 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lcf
            double[] r3 = com.baidu.location.indoor.mapversion.IndoorJni.setPfWf(r9, r11, r13, r15)     // Catch: java.lang.Throwable -> Lcf
        Lcb:
            r0.unlock()     // Catch: java.lang.Throwable -> Lf9
            goto Ld6
        Lcf:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> Lef
            java.util.concurrent.locks.Lock r0 = a.a.a.d.m.b.a.f187a     // Catch: java.lang.Throwable -> Lf9
            goto Lcb
        Ld6:
            r4 = r3[r4]     // Catch: java.lang.Throwable -> Lf9
            r9 = 0
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 != 0) goto Lf7
            r4 = r3[r7]     // Catch: java.lang.Throwable -> Lf9
            double r4 = r2.c(r4)     // Catch: java.lang.Throwable -> Lf9
            r9 = r3[r8]     // Catch: java.lang.Throwable -> Lf9
            double r9 = r2.d(r9)     // Catch: java.lang.Throwable -> Lf9
            r3[r7] = r4     // Catch: java.lang.Throwable -> Lf9
            r3[r8] = r9     // Catch: java.lang.Throwable -> Lf9
            goto Lf7
        Lef:
            r0 = move-exception
            r2 = r0
            java.util.concurrent.locks.Lock r0 = a.a.a.d.m.b.a.f187a     // Catch: java.lang.Throwable -> Lf9
            r0.unlock()     // Catch: java.lang.Throwable -> Lf9
            throw r2     // Catch: java.lang.Throwable -> Lf9
        Lf7:
            monitor-exit(r1)
            return r3
        Lf9:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public static void b() {
            boolean r0 = a()
            if (r0 != 0) goto L7
            return
        L7:
            java.util.concurrent.locks.Lock r0 = a.a.a.d.m.b.a.f187a
            r0.lock()
            com.baidu.location.indoor.mapversion.IndoorJni.initPf()     // Catch: java.lang.Throwable -> L13
        Lf:
            r0.unlock()
            goto L1a
        L13:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L1b
            java.util.concurrent.locks.Lock r0 = a.a.a.d.m.b.a.f187a
            goto Lf
        L1a:
            return
        L1b:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = a.a.a.d.m.b.a.f187a
            r1.unlock()
            throw r0
    }

    public static void c() {
            boolean r0 = a()
            if (r0 != 0) goto L7
            return
        L7:
            java.util.concurrent.locks.Lock r0 = a.a.a.d.m.b.a.f187a
            r0.lock()
            com.baidu.location.indoor.mapversion.IndoorJni.resetPf()     // Catch: java.lang.Throwable -> L13
        Lf:
            r0.unlock()
            goto L1a
        L13:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L1b
            java.util.concurrent.locks.Lock r0 = a.a.a.d.m.b.a.f187a
            goto Lf
        L1a:
            return
        L1b:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = a.a.a.d.m.b.a.f187a
            r1.unlock()
            throw r0
    }
}
