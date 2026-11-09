package a.a.a.g;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.a.a.g.c.C0014c f257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public android.location.Location f258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public android.location.Location f259c;
    public long d;
    public long e;
    public java.util.Timer f;
    public java.util.TimerTask g;

    public class a extends java.util.TimerTask {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.a.a.g.c f260b;

        public a(a.a.a.g.c r1) {
                r0 = this;
                r0.f260b = r1
                r0.<init>()
                return
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
                r0 = this;
                a.a.a.g.c r0 = r0.f260b
                r0.c()
                return
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static a.a.a.g.c f261a;

        static {
                a.a.a.g.c r0 = new a.a.a.g.c
                r0.<init>()
                a.a.a.g.c.b.f261a = r0
                return
        }

        public static /* synthetic */ a.a.a.g.c a() {
                a.a.a.g.c r0 = a.a.a.g.c.b.f261a
                return r0
        }
    }

    /* JADX INFO: renamed from: a.a.a.g.c$c, reason: collision with other inner class name */
    public class C0014c implements a.a.a.b.p.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.a.a.g.c f262a;

        public C0014c(a.a.a.g.c r1) {
                r0 = this;
                r0.f262a = r1
                r0.<init>()
                return
        }

        public /* synthetic */ C0014c(a.a.a.g.c r1, a.a.a.g.c.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // a.a.a.b.p.d
        public void a(android.location.Location r3) {
                r2 = this;
                if (r3 != 0) goto L3
                return
            L3:
                a.a.a.g.c r2 = r2.f262a
                r2.f258b = r3
                long r0 = java.lang.System.currentTimeMillis()
                r2.e = r0
                return
        }
    }

    public c() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f257a = r0
            r3.f258b = r0
            r3.f259c = r0
            r1 = 0
            r3.d = r1
            r3.e = r1
            r3.f = r0
            r3.g = r0
            return
    }

    public static a.a.a.g.c e() {
            a.a.a.g.c r0 = a.a.a.g.c.b.a()
            return r0
    }

    public android.location.Location a() {
            r8 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r8.e
            long r0 = r0 - r2
            r2 = 30000(0x7530, double:1.4822E-319)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L10
            android.location.Location r0 = r8.f258b
            goto L11
        L10:
            r0 = 0
        L11:
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r8.d
            long r4 = r4 - r6
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 >= 0) goto L1e
            android.location.Location r0 = r8.f259c
        L1e:
            return r0
    }

    public java.lang.String a(android.location.Location r9) {
            r8 = this;
            if (r9 == 0) goto L6c
            boolean r8 = r9.hasAccuracy()
            if (r8 == 0) goto Ld
            float r8 = r9.getAccuracy()
            goto Lf
        Ld:
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
        Lf:
            int r8 = (int) r8
            java.util.Locale r0 = java.util.Locale.CHINA
            r1 = 7
            java.lang.Object[] r1 = new java.lang.Object[r1]
            double r2 = r9.getLongitude()
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            double r4 = r9.getLatitude()
            java.lang.Double r2 = java.lang.Double.valueOf(r4)
            r4 = 1
            r1[r4] = r2
            float r2 = r9.getSpeed()
            double r4 = (double) r2
            r6 = 4615288898129284301(0x400ccccccccccccd, double:3.6)
            double r4 = r4 * r6
            float r2 = (float) r4
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r4 = 2
            r1[r4] = r2
            float r2 = r9.getBearing()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r4 = 3
            r1[r4] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r3 = 4
            r1[r3] = r2
            long r2 = r9.getTime()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            java.lang.Long r9 = java.lang.Long.valueOf(r2)
            r2 = 5
            r1[r2] = r9
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9 = 6
            r1[r9] = r8
            java.lang.String r8 = "&ll=%.5f|%.5f&s=%.1f&d=%.1f&ll_n=%d&ll_t=%d&ll_r=%d"
            java.lang.String r8 = java.lang.String.format(r0, r8, r1)
            goto L6d
        L6c:
            r8 = 0
        L6d:
            return r8
    }

    public boolean a(android.location.Location r12, android.location.Location r13) {
            r11 = this;
            r11 = 0
            if (r13 != 0) goto L4
            return r11
        L4:
            r0 = 1
            if (r12 != 0) goto L8
            return r0
        L8:
            r1 = 2
            float[] r1 = new float[r1]     // Catch: java.lang.Exception -> L28
            double r2 = r12.getLatitude()     // Catch: java.lang.Exception -> L28
            double r4 = r12.getLongitude()     // Catch: java.lang.Exception -> L28
            double r6 = r13.getLatitude()     // Catch: java.lang.Exception -> L28
            double r8 = r13.getLongitude()     // Catch: java.lang.Exception -> L28
            r10 = r1
            android.location.Location.distanceBetween(r2, r4, r6, r8, r10)     // Catch: java.lang.Exception -> L28
            r12 = r1[r11]     // Catch: java.lang.Exception -> L28
            r13 = 1120403456(0x42c80000, float:100.0)
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 >= 0) goto L28
            return r11
        L28:
            return r0
    }

    public void b() {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 >= r1) goto L7
            return
        L7:
            int r0 = a.a.a.i.i.x0
            if (r0 != 0) goto Lc
            return
        Lc:
            boolean r0 = a.a.a.i.i.k()
            if (r0 == 0) goto L49
            r4.d()
            java.util.Timer r0 = r4.f
            if (r0 != 0) goto L33
            java.util.TimerTask r0 = r4.g
            if (r0 != 0) goto L33
            java.util.Timer r0 = new java.util.Timer
            r0.<init>()
            r4.f = r0
            a.a.a.g.c$a r0 = new a.a.a.g.c$a
            r0.<init>(r4)
            r4.g = r0
            java.util.Timer r1 = r4.f
            r2 = 60000(0xea60, double:2.9644E-319)
            r1.schedule(r0, r2)
        L33:
            a.a.a.g.c$c r0 = r4.f257a
            if (r0 != 0) goto L4c
            a.a.a.g.c$c r0 = new a.a.a.g.c$c
            r1 = 0
            r0.<init>(r4, r1)
            r4.f257a = r0
            a.a.a.b.p r0 = a.a.a.b.p.c()
            a.a.a.g.c$c r4 = r4.f257a
            r0.a(r4)
            goto L4c
        L49:
            r4.c()
        L4c:
            return
    }

    public void b(android.location.Location r3) {
            r2 = this;
            r2.f259c = r3
            long r0 = java.lang.System.currentTimeMillis()
            r2.d = r0
            return
    }

    public synchronized void c() {
            r2 = this;
            monitor-enter(r2)
            a.a.a.g.c$c r0 = r2.f257a     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L11
            a.a.a.b.p r0 = a.a.a.b.p.c()     // Catch: java.lang.Throwable -> L16
            a.a.a.g.c$c r1 = r2.f257a     // Catch: java.lang.Throwable -> L16
            r0.b(r1)     // Catch: java.lang.Throwable -> L16
            r0 = 0
            r2.f257a = r0     // Catch: java.lang.Throwable -> L16
        L11:
            r2.d()     // Catch: java.lang.Throwable -> L16
            monitor-exit(r2)
            return
        L16:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public final synchronized void d() {
            r2 = this;
            monitor-enter(r2)
            java.util.TimerTask r0 = r2.g     // Catch: java.lang.Throwable -> L1b
            r1 = 0
            if (r0 == 0) goto Lb
            r0.cancel()     // Catch: java.lang.Throwable -> L1b
            r2.g = r1     // Catch: java.lang.Throwable -> L1b
        Lb:
            java.util.Timer r0 = r2.f     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L19
            r0.cancel()     // Catch: java.lang.Throwable -> L1b
            java.util.Timer r0 = r2.f     // Catch: java.lang.Throwable -> L1b
            r0.purge()     // Catch: java.lang.Throwable -> L1b
            r2.f = r1     // Catch: java.lang.Throwable -> L1b
        L19:
            monitor-exit(r2)
            return
        L1b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }
}
