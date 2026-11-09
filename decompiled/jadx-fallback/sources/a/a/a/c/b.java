package a.a.a.c;

/* JADX INFO: loaded from: classes.dex */
public class b {
    public static a.a.a.c.b g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public android.os.Handler f104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public android.app.AlarmManager f105c;
    public a.a.a.c.b.C0004b d;
    public android.app.PendingIntent e;
    public long f;

    public class a extends android.os.Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.a.a.c.b f106a;

        public a(a.a.a.c.b r1) {
                r0 = this;
                r0.f106a = r1
                r0.<init>()
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r2) {
                r1 = this;
                int r2 = r2.what
                r0 = 1
                if (r2 == r0) goto Lf
                r0 = 2
                if (r2 == r0) goto L9
                goto L14
            L9:
                a.a.a.c.b r1 = r1.f106a     // Catch: java.lang.Exception -> L14
                a.a.a.c.b.b(r1)     // Catch: java.lang.Exception -> L14
                goto L14
            Lf:
                a.a.a.c.b r1 = r1.f106a     // Catch: java.lang.Exception -> L14
                a.a.a.c.b.a(r1)     // Catch: java.lang.Exception -> L14
            L14:
                return
        }
    }

    /* JADX INFO: renamed from: a.a.a.c.b$b, reason: collision with other inner class name */
    public class C0004b extends android.content.BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.a.a.c.b f107a;

        public C0004b(a.a.a.c.b r1) {
                r0 = this;
                r0.f107a = r1
                r0.<init>()
                return
        }

        public /* synthetic */ C0004b(a.a.a.c.b r1, a.a.a.c.b.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r1, android.content.Intent r2) {
                r0 = this;
                a.a.a.c.b r1 = r0.f107a
                boolean r1 = a.a.a.c.b.c(r1)
                if (r1 != 0) goto L9
                return
            L9:
                java.lang.String r1 = r2.getAction()
                java.lang.String r2 = "com.baidu.location.autonotifyloc_9.5.2.1"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L2d
                a.a.a.c.b r1 = r0.f107a
                android.os.Handler r1 = a.a.a.c.b.d(r1)
                if (r1 == 0) goto L2d
                a.a.a.c.b r1 = r0.f107a
                r2 = 0
                a.a.a.c.b.a(r1, r2)
                a.a.a.c.b r0 = r0.f107a
                android.os.Handler r0 = a.a.a.c.b.d(r0)
                r1 = 1
                r0.sendEmptyMessage(r1)
            L2d:
                return
        }
    }

    static {
            return
    }

    public b() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f103a = r0
            r0 = 0
            r2.f104b = r0
            r2.f105c = r0
            r2.d = r0
            r2.e = r0
            r0 = 0
            r2.f = r0
            return
    }

    public static /* synthetic */ android.app.PendingIntent a(a.a.a.c.b r0, android.app.PendingIntent r1) {
            r0.e = r1
            return r1
    }

    public static /* synthetic */ void a(a.a.a.c.b r0) {
            r0.d()
            return
    }

    public static /* synthetic */ void b(a.a.a.c.b r0) {
            r0.a()
            return
    }

    public static /* synthetic */ boolean c(a.a.a.c.b r0) {
            boolean r0 = r0.f103a
            return r0
    }

    public static /* synthetic */ android.os.Handler d(a.a.a.c.b r0) {
            android.os.Handler r0 = r0.f104b
            return r0
    }

    public static synchronized a.a.a.c.b g() {
            java.lang.Class<a.a.a.c.b> r0 = a.a.a.c.b.class
            monitor-enter(r0)
            a.a.a.c.b r1 = a.a.a.c.b.g     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto Le
            a.a.a.c.b r1 = new a.a.a.c.b     // Catch: java.lang.Throwable -> L12
            r1.<init>()     // Catch: java.lang.Throwable -> L12
            a.a.a.c.b.g = r1     // Catch: java.lang.Throwable -> L12
        Le:
            a.a.a.c.b r1 = a.a.a.c.b.g     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)
            return r1
        L12:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final void a() {
            r3 = this;
            boolean r0 = r3.f103a
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            android.app.PendingIntent r1 = r3.e     // Catch: java.lang.Exception -> L1a
            if (r1 == 0) goto L11
            android.app.AlarmManager r2 = r3.f105c     // Catch: java.lang.Exception -> L1a
            r2.cancel(r1)     // Catch: java.lang.Exception -> L1a
            r3.e = r0     // Catch: java.lang.Exception -> L1a
        L11:
            android.content.Context r1 = com.baidu.location.f.c()     // Catch: java.lang.Exception -> L1a
            a.a.a.c.b$b r2 = r3.d     // Catch: java.lang.Exception -> L1a
            r1.unregisterReceiver(r2)     // Catch: java.lang.Exception -> L1a
        L1a:
            r3.f105c = r0
            r3.d = r0
            r3.f104b = r0
            r0 = 0
            r3.f103a = r0
            return
    }

    public void b() {
            r1 = this;
            boolean r0 = r1.f103a
            if (r0 != 0) goto L5
            return
        L5:
            android.os.Handler r1 = r1.f104b
            if (r1 == 0) goto Ld
            r0 = 1
            r1.sendEmptyMessage(r0)
        Ld:
            return
    }

    public void c() {
            r1 = this;
            boolean r0 = r1.f103a
            if (r0 != 0) goto L5
            return
        L5:
            android.os.Handler r1 = r1.f104b
            if (r1 == 0) goto Ld
            r0 = 1
            r1.sendEmptyMessage(r0)
        Ld:
            return
    }

    public final void d() {
            r6 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r6.f
            long r0 = r0 - r2
            r2 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto Le
            return
        Le:
            android.app.PendingIntent r0 = r6.e
            if (r0 == 0) goto L1a
            android.app.AlarmManager r1 = r6.f105c
            r1.cancel(r0)
            r0 = 0
            r6.e = r0
        L1a:
            android.app.PendingIntent r0 = r6.e
            if (r0 != 0) goto L41
            android.content.Context r0 = com.baidu.location.f.c()
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "com.baidu.location.autonotifyloc_9.5.2.1"
            r1.<init>(r2)
            r2 = 201326592(0xc000000, float:9.8607613E-32)
            r3 = 0
            android.app.PendingIntent r0 = android.app.PendingIntent.getBroadcast(r0, r3, r1, r2)
            r6.e = r0
            android.app.AlarmManager r0 = r6.f105c
            long r1 = java.lang.System.currentTimeMillis()
            int r4 = a.a.a.i.i.T
            long r4 = (long) r4
            long r1 = r1 + r4
            android.app.PendingIntent r4 = r6.e
            r0.set(r3, r1, r4)
        L41:
            android.os.Message r0 = new android.os.Message
            r0.<init>()
            r1 = 22
            r0.what = r1
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r6.f
            long r1 = r1 - r3
            int r3 = a.a.a.i.i.U
            long r3 = (long) r3
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L59
            return
        L59:
            long r1 = java.lang.System.currentTimeMillis()
            r6.f = r1
            a.a.a.g.d r6 = a.a.a.g.d.n()
            boolean r6 = r6.j()
            if (r6 != 0) goto L70
            a.a.a.b.o r6 = a.a.a.b.o.q()
            r6.f(r0)
        L70:
            return
    }

    public void e() {
            r6 = this;
            boolean r0 = r6.f103a
            if (r0 == 0) goto L5
            return
        L5:
            int r0 = a.a.a.i.i.T
            r1 = 10000(0x2710, float:1.4013E-41)
            if (r0 < r1) goto L68
            android.os.Handler r0 = r6.f104b
            if (r0 != 0) goto L16
            a.a.a.c.b$a r0 = new a.a.a.c.b$a
            r0.<init>(r6)
            r6.f104b = r0
        L16:
            android.content.Context r0 = com.baidu.location.f.c()
            java.lang.String r1 = "alarm"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.AlarmManager r0 = (android.app.AlarmManager) r0
            r6.f105c = r0
            a.a.a.c.b$b r0 = new a.a.a.c.b$b
            r1 = 0
            r0.<init>(r6, r1)
            r6.d = r0
            android.content.Context r0 = com.baidu.location.f.c()
            a.a.a.c.b$b r2 = r6.d
            android.content.IntentFilter r3 = new android.content.IntentFilter
            java.lang.String r4 = "com.baidu.location.autonotifyloc_9.5.2.1"
            r3.<init>(r4)
            java.lang.String r5 = "android.permission.ACCESS_FINE_LOCATION"
            r0.registerReceiver(r2, r3, r5, r1)
            android.content.Context r0 = com.baidu.location.f.c()
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r4)
            r2 = 201326592(0xc000000, float:9.8607613E-32)
            r3 = 0
            android.app.PendingIntent r0 = android.app.PendingIntent.getBroadcast(r0, r3, r1, r2)
            r6.e = r0
            android.app.AlarmManager r0 = r6.f105c
            long r1 = java.lang.System.currentTimeMillis()
            int r4 = a.a.a.i.i.T
            long r4 = (long) r4
            long r1 = r1 + r4
            android.app.PendingIntent r4 = r6.e
            r0.set(r3, r1, r4)
            r0 = 1
            r6.f103a = r0
            long r0 = java.lang.System.currentTimeMillis()
            r6.f = r0
        L68:
            return
    }

    public void f() {
            r1 = this;
            boolean r0 = r1.f103a
            if (r0 != 0) goto L5
            return
        L5:
            android.os.Handler r1 = r1.f104b
            if (r1 == 0) goto Ld
            r0 = 2
            r1.sendEmptyMessage(r0)
        Ld:
            return
    }
}
