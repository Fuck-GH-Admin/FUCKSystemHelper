package a.a.a.h;

/* JADX INFO: loaded from: classes.dex */
public class a extends android.app.Service implements com.baidu.location.g {
    public static a.a.a.h.a.b g;
    public static long h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public android.os.Messenger f312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public android.os.Looper f313c;
    public boolean d;
    public int e;
    public boolean f;

    /* JADX INFO: renamed from: a.a.a.h.a$a, reason: collision with other inner class name */
    public class RunnableC0019a implements java.lang.Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ java.lang.ref.WeakReference f314b;

        public RunnableC0019a(a.a.a.h.a r1, java.lang.ref.WeakReference r2) {
                r0 = this;
                r0.f314b = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                java.lang.ref.WeakReference r2 = r2.f314b
                java.lang.Object r2 = r2.get()
                a.a.a.h.a r2 = (a.a.a.h.a) r2
                if (r2 == 0) goto L1f
                int r0 = a.a.a.h.a.a(r2)
                r1 = 3
                if (r0 != r1) goto L1f
                java.lang.String r0 = "baidu_location_service"
                java.lang.String r1 = "baidu location service force stopped ..."
                android.util.Log.d(r0, r1)
                r0 = 0
                a.a.a.h.a.a(r2, r0)
                a.a.a.h.a.b(r2)
            L1f:
                return
        }
    }

    public static class b extends android.os.Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.ref.WeakReference<a.a.a.h.a> f315a;

        public b(android.os.Looper r1, a.a.a.h.a r2) {
                r0 = this;
                r0.<init>(r1)
                java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
                r1.<init>(r2)
                r0.f315a = r1
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r5) {
                r4 = this;
                java.lang.ref.WeakReference<a.a.a.h.a> r0 = r4.f315a
                java.lang.Object r0 = r0.get()
                a.a.a.h.a r0 = (a.a.a.h.a) r0
                if (r0 != 0) goto Lb
                return
            Lb:
                boolean r1 = com.baidu.location.f.f
                r2 = 1
                if (r1 != r2) goto La6
                int r1 = r5.what
                r3 = 11
                if (r1 == r3) goto La3
                r3 = 12
                if (r1 == r3) goto L9f
                r3 = 15
                if (r1 == r3) goto L9b
                r3 = 22
                if (r1 == r3) goto L93
                r3 = 28
                if (r1 == r3) goto L8b
                r3 = 41
                if (r1 == r3) goto L83
                r3 = 114(0x72, float:1.6E-43)
                if (r1 == r3) goto L75
                r3 = 401(0x191, float:5.62E-43)
                if (r1 == r3) goto L71
                r3 = 406(0x196, float:5.69E-43)
                if (r1 == r3) goto L69
                r3 = 705(0x2c1, float:9.88E-43)
                if (r1 == r3) goto L57
                switch(r1) {
                    case 110: goto L4f;
                    case 111: goto L47;
                    case 112: goto L3f;
                    default: goto L3d;
                }
            L3d:
                goto La6
            L3f:
                a.a.a.d.i r1 = a.a.a.d.i.m()
                r1.a()
                goto La6
            L47:
                a.a.a.d.i r1 = a.a.a.d.i.m()
                r1.l()
                goto La6
            L4f:
                a.a.a.d.i r1 = a.a.a.d.i.m()
                r1.k()
                goto La6
            L57:
                android.os.Bundle r1 = r5.getData()
                java.lang.String r3 = "foreground"
                boolean r1 = r1.getBoolean(r3)
                a.a.a.b.c r3 = a.a.a.b.c.h()
                r3.a(r1)
                goto La6
            L69:
                a.a.a.b.l r1 = a.a.a.b.l.f()
                r1.b()
                goto La6
            L71:
                r5.getData()     // Catch: java.lang.Exception -> La6
                goto La6
            L75:
                java.lang.Object r1 = r5.obj
                if (r1 == 0) goto La6
                a.a.a.d.i r3 = a.a.a.d.i.m()
                android.os.Bundle r1 = (android.os.Bundle) r1
                r3.a(r1)
                goto La6
            L83:
                a.a.a.b.o r1 = a.a.a.b.o.q()
                r1.m()
                goto La6
            L8b:
                a.a.a.b.o r1 = a.a.a.b.o.q()
                r1.a(r2, r2)
                goto La6
            L93:
                a.a.a.b.o r1 = a.a.a.b.o.q()
                r1.f(r5)
                goto La6
            L9b:
                a.a.a.h.a.c(r0, r5)
                goto La6
            L9f:
                a.a.a.h.a.b(r0, r5)
                goto La6
            La3:
                a.a.a.h.a.a(r0, r5)
            La6:
                int r1 = r5.what
                if (r1 != r2) goto Lad
                a.a.a.h.a.b(r0)
            Lad:
                int r1 = r5.what
                if (r1 != 0) goto Lb4
                a.a.a.h.a.c(r0)
            Lb4:
                super.handleMessage(r5)
                return
        }
    }

    static {
            return
    }

    public a() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f312b = r0
            r2.f313c = r0
            r0 = 1
            r2.d = r0
            r1 = 0
            r2.e = r1
            r2.f = r0
            return
    }

    public static /* synthetic */ int a(a.a.a.h.a r0) {
            int r0 = r0.e
            return r0
    }

    public static /* synthetic */ void a(a.a.a.h.a r0, android.os.Message r1) {
            r0.b(r1)
            return
    }

    public static /* synthetic */ boolean a(a.a.a.h.a r0, boolean r1) {
            r0.f = r1
            return r1
    }

    public static /* synthetic */ void b(a.a.a.h.a r0) {
            r0.c()
            return
    }

    public static /* synthetic */ void b(a.a.a.h.a r0, android.os.Message r1) {
            r0.c(r1)
            return
    }

    public static /* synthetic */ void c(a.a.a.h.a r0) {
            r0.b()
            return
    }

    public static /* synthetic */ void c(a.a.a.h.a r0, android.os.Message r1) {
            r0.a(r1)
            return
    }

    public static long d() {
            long r0 = a.a.a.h.a.h
            return r0
    }

    public static android.os.Handler e() {
            a.a.a.h.a$b r0 = a.a.a.h.a.g
            return r0
    }

    @Override // com.baidu.location.g
    public double a() {
            r2 = this;
            r0 = 4621549464509743104(0x40230ac080000000, double:9.520999908447266)
            return r0
    }

    @Override // com.baidu.location.g
    public void a(android.content.Context r5) {
            r4 = this;
            a.a.a.b.b r0 = a.a.a.b.b.a()
            r0.a(r5)
            android.content.Context r0 = com.baidu.location.f.c()
            c.a.c.a.b r0 = c.a.c.a.b.c(r0)
            r1 = 1
            r0.a(r1)
            java.lang.String r5 = r5.getPackageName()     // Catch: java.lang.Exception -> L19
            a.a.a.i.i.o0 = r5     // Catch: java.lang.Exception -> L19
        L19:
            long r2 = java.lang.System.currentTimeMillis()
            a.a.a.h.a.h = r2
            android.os.HandlerThread r5 = a.a.a.b.v.a()
            if (r5 == 0) goto L2b
            android.os.Looper r5 = r5.getLooper()
            r4.f313c = r5
        L2b:
            android.os.Looper r5 = r4.f313c
            if (r5 != 0) goto L39
            a.a.a.h.a$b r5 = new a.a.a.h.a$b
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r5.<init>(r0, r4)
            goto L40
        L39:
            a.a.a.h.a$b r5 = new a.a.a.h.a$b
            android.os.Looper r0 = r4.f313c
            r5.<init>(r0, r4)
        L40:
            a.a.a.h.a.g = r5
            java.lang.System.currentTimeMillis()
            android.os.Messenger r5 = new android.os.Messenger
            a.a.a.h.a$b r0 = a.a.a.h.a.g
            r5.<init>(r0)
            r4.f312b = r5
            a.a.a.h.a$b r5 = a.a.a.h.a.g
            r0 = 0
            r5.sendEmptyMessage(r0)
            r4.e = r1
            return
    }

    public final void a(android.os.Message r1) {
            r0 = this;
            a.a.a.b.c r0 = a.a.a.b.c.h()
            r0.a(r1)
            return
    }

    public final void b() {
            r2 = this;
            a.a.a.c.d r0 = a.a.a.c.d.j()
            r0.h()
            a.a.a.i.b.e()
            a.a.a.b.f r0 = a.a.a.b.f.c()
            android.content.Context r1 = com.baidu.location.f.c()
            r0.a(r1)
            a.a.a.b.d r0 = a.a.a.b.d.i()
            r1 = 0
            r0.b(r1)
            a.a.a.b.d r0 = a.a.a.b.d.i()
            r0.h()
            a.a.a.b.z r0 = a.a.a.b.z.f()     // Catch: java.lang.Exception -> L2b
            r0.a()     // Catch: java.lang.Exception -> L2b
        L2b:
            a.a.a.b.l r0 = a.a.a.b.l.f()
            r0.d()
            a.a.a.g.d r0 = a.a.a.g.d.n()
            r0.a()
            a.a.a.g.f r0 = a.a.a.g.f.w()
            r0.m()
            a.a.a.g.f r0 = a.a.a.g.f.w()
            android.content.Context r1 = com.baidu.location.f.c()
            r0.a(r1)
            a.a.a.b.o r0 = a.a.a.b.o.q()
            r0.n()
            a.a.a.f.a r0 = a.a.a.f.a.e()
            r0.c()
            a.a.a.c.c r0 = a.a.a.c.c.f()
            r0.d()
            a.a.a.c.e r0 = a.a.a.c.e.b()
            r0.a()
            a.a.a.c.a r0 = a.a.a.c.a.d()
            r0.a()
            r0 = 2
            r2.e = r0
            return
    }

    public final void b(android.os.Message r1) {
            r0 = this;
            a.a.a.b.c r0 = a.a.a.b.c.h()
            r0.d(r1)
            a.a.a.f.d.r()
            a.a.a.c.d r0 = a.a.a.c.d.j()
            r0.c()
            return
    }

    public final void c() {
            r1 = this;
            a.a.a.g.d r0 = a.a.a.g.d.n()
            r0.b()
            boolean r0 = r1.f
            if (r0 == 0) goto L12
            a.a.a.f.d r0 = a.a.a.f.d.r()
            r0.b()
        L12:
            a.a.a.b.z r0 = a.a.a.b.z.f()
            r0.b()
            a.a.a.c.d r0 = a.a.a.c.d.j()
            r0.i()
            a.a.a.c.c r0 = a.a.a.c.c.f()
            r0.e()
            a.a.a.c.b r0 = a.a.a.c.b.g()
            r0.f()
            a.a.a.c.a r0 = a.a.a.c.a.d()
            r0.b()
            a.a.a.b.g r0 = a.a.a.b.g.b()
            r0.a()
            a.a.a.g.f r0 = a.a.a.g.f.w()
            r0.u()
            a.a.a.b.o r0 = a.a.a.b.o.q()
            r0.o()
            a.a.a.d.i r0 = a.a.a.d.i.m()
            r0.l()
            a.a.a.b.l r0 = a.a.a.b.l.f()
            r0.e()
            boolean r0 = r1.f
            if (r0 == 0) goto L5f
            a.a.a.b.y.b()
        L5f:
            a.a.a.b.c r0 = a.a.a.b.c.h()
            r0.c()
            a.a.a.b.w r0 = a.a.a.b.w.d()     // Catch: java.lang.Exception -> L6e
            r0.c()     // Catch: java.lang.Exception -> L6e
            goto L72
        L6e:
            r0 = move-exception
            r0.printStackTrace()
        L72:
            r0 = 4
            r1.e = r0
            boolean r1 = r1.d
            if (r1 != 0) goto L80
            int r1 = android.os.Process.myPid()
            android.os.Process.killProcess(r1)
        L80:
            return
    }

    public final void c(android.os.Message r1) {
            r0 = this;
            a.a.a.b.c r0 = a.a.a.b.c.h()
            r0.e(r1)
            return
    }

    @Override // android.app.Service, com.baidu.location.g
    public android.os.IBinder onBind(android.content.Intent r4) {
            r3 = this;
            android.os.Bundle r4 = r4.getExtras()
            if (r4 == 0) goto L4b
            java.lang.String r0 = "key"
            java.lang.String r0 = r4.getString(r0)
            a.a.a.i.b.i = r0
            java.lang.String r0 = "sign"
            java.lang.String r0 = r4.getString(r0)
            a.a.a.i.b.h = r0
            java.lang.String r0 = "kill_process"
            boolean r0 = r4.getBoolean(r0)
            r3.d = r0
            java.lang.String r0 = "cache_exception"
            boolean r0 = r4.getBoolean(r0)
            java.lang.String r1 = "auth_key"
            java.lang.String r1 = r4.getString(r1)
            java.lang.String r2 = "proxyHost"
            java.lang.String r2 = r4.getString(r2)
            a.a.a.i.i.Q0 = r2
            java.lang.String r2 = "proxyPort"
            int r2 = r4.getInt(r2)
            a.a.a.i.i.R0 = r2
            java.lang.String r2 = "username"
            java.lang.String r2 = r4.getString(r2)
            a.a.a.i.i.S0 = r2
            java.lang.String r2 = "password"
            java.lang.String r4 = r4.getString(r2)
            a.a.a.i.i.T0 = r4
            goto L4d
        L4b:
            r0 = 0
            r1 = 0
        L4d:
            if (r1 == 0) goto L5a
            a.a.a.a.a r4 = a.a.a.a.a.b()
            android.content.Context r2 = com.baidu.location.f.c()
            r4.a(r2, r1)
        L5a:
            java.lang.String r4 = a.a.a.i.i.Q0
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L76
            int r4 = a.a.a.i.i.R0
            r1 = -1
            if (r4 == r1) goto L76
            android.content.Context r4 = com.baidu.location.f.c()
            c.a.c.a.b r4 = c.a.c.a.b.c(r4)
            java.lang.String r1 = a.a.a.i.i.Q0
            int r2 = a.a.a.i.i.R0
            r4.a(r1, r2)
        L76:
            java.lang.String r4 = a.a.a.i.i.S0
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L95
            java.lang.String r4 = a.a.a.i.i.T0
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L95
            android.content.Context r4 = com.baidu.location.f.c()
            c.a.c.a.b r4 = c.a.c.a.b.c(r4)
            java.lang.String r1 = a.a.a.i.i.S0
            java.lang.String r2 = a.a.a.i.i.T0
            r4.a(r1, r2)
        L95:
            a.a.a.a.a r4 = a.a.a.a.a.b()
            android.content.Context r1 = com.baidu.location.f.c()
            r4.a(r1)
            if (r0 != 0) goto La9
            a.a.a.c.e r4 = a.a.a.c.e.b()
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r4)
        La9:
            android.os.Messenger r3 = r3.f312b
            android.os.IBinder r3 = r3.getBinder()
            return r3
    }

    @Override // android.app.Service, com.baidu.location.g
    public void onDestroy() {
            r5 = this;
            a.a.a.h.a$b r0 = a.a.a.h.a.g     // Catch: java.lang.Exception -> L7
            r1 = 1
            r0.sendEmptyMessage(r1)     // Catch: java.lang.Exception -> L7
            goto L1b
        L7:
            java.lang.String r0 = "baidu_location_service"
            java.lang.String r1 = "baidu location service stop exception..."
            android.util.Log.d(r0, r1)
            r0 = 0
            r5.f = r0
            r5.c()
            int r0 = android.os.Process.myPid()
            android.os.Process.killProcess(r0)
        L1b:
            r0 = 3
            r5.e = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r5)
            a.a.a.h.a$a r2 = new a.a.a.h.a$a
            r2.<init>(r5, r1)
            r3 = 1000(0x3e8, double:4.94E-321)
            r0.postDelayed(r2, r3)
            return
    }

    @Override // android.app.Service, com.baidu.location.g
    public int onStartCommand(android.content.Intent r1, int r2, int r3) {
            r0 = this;
            r0 = 2
            return r0
    }

    @Override // android.app.Service, com.baidu.location.g
    public void onTaskRemoved(android.content.Intent r1) {
            r0 = this;
            java.lang.String r0 = "baidu_location_service"
            java.lang.String r1 = "baidu location service remove task..."
            android.util.Log.d(r0, r1)
            return
    }
}
