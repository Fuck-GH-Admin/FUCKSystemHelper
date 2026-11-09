package a.a.a.c;

/* JADX INFO: loaded from: classes.dex */
public class c {
    public static a.a.a.c.c f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.String f109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a.a.a.c.c.b f110c;
    public int d;
    public a.a.a.c.c.a e;

    public interface a {
        void a(boolean r1);
    }

    public class b extends android.content.BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.a.a.c.c f111a;

        public b(a.a.a.c.c r1) {
                r0 = this;
                r0.f111a = r1
                r0.<init>()
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r6, android.content.Intent r7) {
                r5 = this;
                java.lang.String r6 = r7.getAction()
                r0 = 0
                java.lang.String r1 = "android.intent.action.BATTERY_CHANGED"
                boolean r6 = r6.equals(r1)     // Catch: java.lang.Exception -> L8a
                if (r6 == 0) goto L8f
                a.a.a.c.c r6 = r5.f111a     // Catch: java.lang.Exception -> L8a
                r1 = 0
                a.a.a.c.c.a(r6, r1)     // Catch: java.lang.Exception -> L8a
                java.lang.String r6 = "status"
                int r6 = r7.getIntExtra(r6, r1)     // Catch: java.lang.Exception -> L8a
                java.lang.String r2 = "plugged"
                int r1 = r7.getIntExtra(r2, r1)     // Catch: java.lang.Exception -> L8a
                java.lang.String r2 = "level"
                r3 = -1
                int r2 = r7.getIntExtra(r2, r3)     // Catch: java.lang.Exception -> L8a
                java.lang.String r4 = "scale"
                int r7 = r7.getIntExtra(r4, r3)     // Catch: java.lang.Exception -> L8a
                if (r2 <= 0) goto L39
                if (r7 <= 0) goto L39
                a.a.a.c.c r3 = r5.f111a     // Catch: java.lang.Exception -> L8a
                int r2 = r2 * 100
                int r2 = r2 / r7
                a.a.a.c.c.a(r3, r2)     // Catch: java.lang.Exception -> L8a
                goto L3e
            L39:
                a.a.a.c.c r7 = r5.f111a     // Catch: java.lang.Exception -> L8a
                a.a.a.c.c.a(r7, r3)     // Catch: java.lang.Exception -> L8a
            L3e:
                r7 = 2
                if (r6 == r7) goto L55
                r2 = 3
                if (r6 == r2) goto L4d
                r2 = 4
                if (r6 == r2) goto L4d
                a.a.a.c.c r6 = r5.f111a     // Catch: java.lang.Exception -> L8a
                a.a.a.c.c.a(r6, r0)     // Catch: java.lang.Exception -> L8a
                goto L5a
            L4d:
                a.a.a.c.c r6 = r5.f111a     // Catch: java.lang.Exception -> L8a
                java.lang.String r2 = "3"
            L51:
                a.a.a.c.c.a(r6, r2)     // Catch: java.lang.Exception -> L8a
                goto L5a
            L55:
                a.a.a.c.c r6 = r5.f111a     // Catch: java.lang.Exception -> L8a
                java.lang.String r2 = "4"
                goto L51
            L5a:
                r6 = 1
                if (r1 == r6) goto L6a
                if (r1 == r7) goto L60
                goto L72
            L60:
                a.a.a.c.c r7 = r5.f111a     // Catch: java.lang.Exception -> L8a
                java.lang.String r1 = "5"
            L64:
                a.a.a.c.c.a(r7, r1)     // Catch: java.lang.Exception -> L8a
                a.a.a.c.c r7 = r5.f111a     // Catch: java.lang.Exception -> L8a
                goto L6f
            L6a:
                a.a.a.c.c r7 = r5.f111a     // Catch: java.lang.Exception -> L8a
                java.lang.String r1 = "6"
                goto L64
            L6f:
                a.a.a.c.c.a(r7, r6)     // Catch: java.lang.Exception -> L8a
            L72:
                a.a.a.c.c r6 = r5.f111a     // Catch: java.lang.Exception -> L8a
                a.a.a.c.c$a r6 = a.a.a.c.c.b(r6)     // Catch: java.lang.Exception -> L8a
                if (r6 == 0) goto L8f
                a.a.a.c.c r6 = r5.f111a     // Catch: java.lang.Exception -> L8a
                a.a.a.c.c$a r6 = a.a.a.c.c.b(r6)     // Catch: java.lang.Exception -> L8a
                a.a.a.c.c r7 = r5.f111a     // Catch: java.lang.Exception -> L8a
                boolean r7 = a.a.a.c.c.a(r7)     // Catch: java.lang.Exception -> L8a
                r6.a(r7)     // Catch: java.lang.Exception -> L8a
                goto L8f
            L8a:
                a.a.a.c.c r5 = r5.f111a
                a.a.a.c.c.a(r5, r0)
            L8f:
                return
        }
    }

    static {
            return
    }

    public c() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f108a = r0
            r0 = 0
            r1.f109b = r0
            r1.f110c = r0
            r0 = -1
            r1.d = r0
            return
    }

    public static /* synthetic */ int a(a.a.a.c.c r0, int r1) {
            r0.d = r1
            return r1
    }

    public static /* synthetic */ java.lang.String a(a.a.a.c.c r0, java.lang.String r1) {
            r0.f109b = r1
            return r1
    }

    public static /* synthetic */ boolean a(a.a.a.c.c r0) {
            boolean r0 = r0.f108a
            return r0
    }

    public static /* synthetic */ boolean a(a.a.a.c.c r0, boolean r1) {
            r0.f108a = r1
            return r1
    }

    public static /* synthetic */ a.a.a.c.c.a b(a.a.a.c.c r0) {
            a.a.a.c.c$a r0 = r0.e
            return r0
    }

    public static synchronized a.a.a.c.c f() {
            java.lang.Class<a.a.a.c.c> r0 = a.a.a.c.c.class
            monitor-enter(r0)
            a.a.a.c.c r1 = a.a.a.c.c.f     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto Le
            a.a.a.c.c r1 = new a.a.a.c.c     // Catch: java.lang.Throwable -> L12
            r1.<init>()     // Catch: java.lang.Throwable -> L12
            a.a.a.c.c.f = r1     // Catch: java.lang.Throwable -> L12
        Le:
            a.a.a.c.c r1 = a.a.a.c.c.f     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)
            return r1
        L12:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public int a() {
            r0 = this;
            int r0 = r0.d
            return r0
    }

    public java.lang.String b() {
            r0 = this;
            java.lang.String r0 = r0.f109b
            return r0
    }

    public boolean c() {
            r0 = this;
            boolean r0 = r0.f108a
            return r0
    }

    public void d() {
            r3 = this;
            a.a.a.c.c$b r0 = new a.a.a.c.c$b
            r0.<init>(r3)
            r3.f110c = r0
            android.content.Context r0 = com.baidu.location.f.c()     // Catch: java.lang.Exception -> L17
            a.a.a.c.c$b r3 = r3.f110c     // Catch: java.lang.Exception -> L17
            android.content.IntentFilter r1 = new android.content.IntentFilter     // Catch: java.lang.Exception -> L17
            java.lang.String r2 = "android.intent.action.BATTERY_CHANGED"
            r1.<init>(r2)     // Catch: java.lang.Exception -> L17
            r0.registerReceiver(r3, r1)     // Catch: java.lang.Exception -> L17
        L17:
            return
    }

    public void e() {
            r2 = this;
            a.a.a.c.c$b r0 = r2.f110c
            if (r0 == 0) goto Ld
            android.content.Context r0 = com.baidu.location.f.c()     // Catch: java.lang.Exception -> Ld
            a.a.a.c.c$b r1 = r2.f110c     // Catch: java.lang.Exception -> Ld
            r0.unregisterReceiver(r1)     // Catch: java.lang.Exception -> Ld
        Ld:
            r0 = 0
            r2.f110c = r0
            r2.e = r0
            return
    }
}
