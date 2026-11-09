package a.a.a.f;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static android.content.Context g = null;
    public static volatile a.a.a.f.d h = null;
    public static java.lang.Object i = null;
    public static final java.lang.String j = "http://ofloc.map.baidu.com/offline_loc";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.io.File f229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a.a.a.f.f f230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a.a.a.f.b f231c;
    public final a.a.a.f.g d;
    public final a.a.a.f.c e;
    public java.util.concurrent.ExecutorService f;

    public class a implements java.util.concurrent.Callable<com.baidu.location.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ java.lang.String[] f232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.a.a.f.d f233b;

        public a(a.a.a.f.d r1, java.lang.String[] r2) {
                r0 = this;
                r0.f233b = r1
                r0.f232a = r2
                r0.<init>()
                return
        }

        public com.baidu.location.c a() {
                r11 = this;
                com.baidu.location.c r0 = new com.baidu.location.c
                r0.<init>()
                java.lang.String[] r1 = r11.f232a
                int r1 = r1.length
                if (r1 <= 0) goto L98
                a.a.a.f.d r0 = r11.f233b
                a.a.a.f.c r0 = a.a.a.f.d.a(r0)
                java.lang.String[] r0 = r0.k()
                r1 = 0
                r2 = 0
                r3 = r1
                r4 = r2
            L18:
                int r5 = r0.length
                if (r3 >= r5) goto L31
                android.content.Context r4 = a.a.a.f.d.q()     // Catch: java.lang.Exception -> L2a
                android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: java.lang.Exception -> L2a
                r5 = r0[r3]     // Catch: java.lang.Exception -> L2a
                android.content.pm.ProviderInfo r4 = r4.resolveContentProvider(r5, r1)     // Catch: java.lang.Exception -> L2a
                goto L2b
            L2a:
                r4 = r2
            L2b:
                if (r4 == 0) goto L2e
                goto L31
            L2e:
                int r3 = r3 + 1
                goto L18
            L31:
                if (r4 == 0) goto L62
                android.content.Context r0 = a.a.a.f.d.q()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L5b
                android.content.ContentResolver r5 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L5b
                java.lang.String r0 = r4.authority     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L5b
                android.net.Uri r6 = a.a.a.f.d.b(r0)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L5b
                java.lang.String[] r7 = r11.f232a     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L5b
                r8 = 0
                r9 = 0
                r10 = 0
                android.database.Cursor r11 = r5.query(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L5b
                com.baidu.location.c r2 = a.a.a.f.e.a(r11)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L5c
                if (r11 == 0) goto L88
                goto L5e
            L51:
                r0 = move-exception
                r2 = r11
                goto L55
            L54:
                r0 = move-exception
            L55:
                if (r2 == 0) goto L5a
                r2.close()     // Catch: java.lang.Exception -> L5a
            L5a:
                throw r0
            L5b:
                r11 = r2
            L5c:
                if (r11 == 0) goto L88
            L5e:
                r11.close()     // Catch: java.lang.Exception -> L88
                goto L88
            L62:
                a.a.a.f.e$a r0 = new a.a.a.f.e$a
                java.lang.String[] r1 = r11.f232a
                r0.<init>(r1)
                a.a.a.f.d r11 = r11.f233b     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L84
                a.a.a.f.b r11 = a.a.a.f.d.b(r11)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L84
                android.database.Cursor r11 = r11.a(r0)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L84
                com.baidu.location.c r2 = a.a.a.f.e.a(r11)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L85
                if (r11 == 0) goto L88
                goto L87
            L7a:
                r0 = move-exception
                r2 = r11
                goto L7e
            L7d:
                r0 = move-exception
            L7e:
                if (r2 == 0) goto L83
                r2.close()     // Catch: java.lang.Exception -> L83
            L83:
                throw r0
            L84:
                r11 = r2
            L85:
                if (r11 == 0) goto L88
            L87:
                goto L5e
            L88:
                r0 = r2
                if (r0 == 0) goto L98
                int r11 = r0.r()
                r1 = 67
                if (r11 == r1) goto L98
                r11 = 66
                r0.h(r11)
            L98:
                return r0
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ com.baidu.location.c call() {
                r0 = this;
                com.baidu.location.c r0 = r0.a()
                return r0
        }
    }

    public static final enum b extends java.lang.Enum<a.a.a.f.d.b> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a.a.a.f.d.b f234b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a.a.a.f.d.b f235c = null;
        public static final /* synthetic */ a.a.a.f.d.b[] d = null;

        static {
                a.a.a.f.d$b r0 = new a.a.a.f.d$b
                r1 = 0
                java.lang.String r2 = "NEED_TO_LOG"
                r0.<init>(r2, r1)
                a.a.a.f.d.b.f234b = r0
                a.a.a.f.d$b r2 = new a.a.a.f.d$b
                r3 = 1
                java.lang.String r4 = "NO_NEED_TO_LOG"
                r2.<init>(r4, r3)
                a.a.a.f.d.b.f235c = r2
                r4 = 2
                a.a.a.f.d$b[] r4 = new a.a.a.f.d.b[r4]
                r4[r1] = r0
                r4[r3] = r2
                a.a.a.f.d.b.d = r4
                return
        }

        public b(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static a.a.a.f.d.b valueOf(java.lang.String r1) {
                java.lang.Class<a.a.a.f.d$b> r0 = a.a.a.f.d.b.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                a.a.a.f.d$b r1 = (a.a.a.f.d.b) r1
                return r1
        }

        public static a.a.a.f.d.b[] values() {
                a.a.a.f.d$b[] r0 = a.a.a.f.d.b.d
                java.lang.Object r0 = r0.clone()
                a.a.a.f.d$b[] r0 = (a.a.a.f.d.b[]) r0
                return r0
        }
    }

    public static final enum c extends java.lang.Enum<a.a.a.f.d.c> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a.a.a.f.d.c f236b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a.a.a.f.d.c f237c = null;
        public static final /* synthetic */ a.a.a.f.d.c[] d = null;

        static {
                a.a.a.f.d$c r0 = new a.a.a.f.d$c
                r1 = 0
                java.lang.String r2 = "IS_MIX_MODE"
                r0.<init>(r2, r1)
                a.a.a.f.d.c.f236b = r0
                a.a.a.f.d$c r2 = new a.a.a.f.d$c
                r3 = 1
                java.lang.String r4 = "IS_NOT_MIX_MODE"
                r2.<init>(r4, r3)
                a.a.a.f.d.c.f237c = r2
                r4 = 2
                a.a.a.f.d$c[] r4 = new a.a.a.f.d.c[r4]
                r4[r1] = r0
                r4[r3] = r2
                a.a.a.f.d.c.d = r4
                return
        }

        public c(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static a.a.a.f.d.c valueOf(java.lang.String r1) {
                java.lang.Class<a.a.a.f.d$c> r0 = a.a.a.f.d.c.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                a.a.a.f.d$c r1 = (a.a.a.f.d.c) r1
                return r1
        }

        public static a.a.a.f.d.c[] values() {
                a.a.a.f.d$c[] r0 = a.a.a.f.d.c.d
                java.lang.Object r0 = r0.clone()
                a.a.a.f.d$c[] r0 = (a.a.a.f.d.c[]) r0
                return r0
        }
    }

    /* JADX INFO: renamed from: a.a.a.f.d$d, reason: collision with other inner class name */
    public static final enum EnumC0012d extends java.lang.Enum<a.a.a.f.d.EnumC0012d> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a.a.a.f.d.EnumC0012d f238b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a.a.a.f.d.EnumC0012d f239c = null;
        public static final a.a.a.f.d.EnumC0012d d = null;
        public static final a.a.a.f.d.EnumC0012d e = null;
        public static final a.a.a.f.d.EnumC0012d f = null;
        public static final /* synthetic */ a.a.a.f.d.EnumC0012d[] g = null;

        static {
                a.a.a.f.d$d r0 = new a.a.a.f.d$d
                r1 = 0
                java.lang.String r2 = "NETWORK_UNKNOWN"
                r0.<init>(r2, r1)
                a.a.a.f.d.EnumC0012d.f238b = r0
                a.a.a.f.d$d r2 = new a.a.a.f.d$d
                r3 = 1
                java.lang.String r4 = "NETWORK_WIFI"
                r2.<init>(r4, r3)
                a.a.a.f.d.EnumC0012d.f239c = r2
                a.a.a.f.d$d r4 = new a.a.a.f.d$d
                r5 = 2
                java.lang.String r6 = "NETWORK_2G"
                r4.<init>(r6, r5)
                a.a.a.f.d.EnumC0012d.d = r4
                a.a.a.f.d$d r6 = new a.a.a.f.d$d
                r7 = 3
                java.lang.String r8 = "NETWORK_3G"
                r6.<init>(r8, r7)
                a.a.a.f.d.EnumC0012d.e = r6
                a.a.a.f.d$d r8 = new a.a.a.f.d$d
                r9 = 4
                java.lang.String r10 = "NETWORK_4G"
                r8.<init>(r10, r9)
                a.a.a.f.d.EnumC0012d.f = r8
                r10 = 5
                a.a.a.f.d$d[] r10 = new a.a.a.f.d.EnumC0012d[r10]
                r10[r1] = r0
                r10[r3] = r2
                r10[r5] = r4
                r10[r7] = r6
                r10[r9] = r8
                a.a.a.f.d.EnumC0012d.g = r10
                return
        }

        public EnumC0012d(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static a.a.a.f.d.EnumC0012d valueOf(java.lang.String r1) {
                java.lang.Class<a.a.a.f.d$d> r0 = a.a.a.f.d.EnumC0012d.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                a.a.a.f.d$d r1 = (a.a.a.f.d.EnumC0012d) r1
                return r1
        }

        public static a.a.a.f.d.EnumC0012d[] values() {
                a.a.a.f.d$d[] r0 = a.a.a.f.d.EnumC0012d.g
                java.lang.Object r0 = r0.clone()
                a.a.a.f.d$d[] r0 = (a.a.a.f.d.EnumC0012d[]) r0
                return r0
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            a.a.a.f.d.i = r0
            return
    }

    public d() {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.f = r0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L1d
            android.content.Context r2 = a.a.a.f.d.g     // Catch: java.lang.Exception -> L1d
            java.io.File r2 = r2.getFilesDir()     // Catch: java.lang.Exception -> L1d
            java.lang.String r3 = "ofld"
            r1.<init>(r2, r3)     // Catch: java.lang.Exception -> L1d
            boolean r0 = r1.exists()     // Catch: java.lang.Exception -> L1c
            if (r0 != 0) goto L1c
            r1.mkdir()     // Catch: java.lang.Exception -> L1c
        L1c:
            r0 = r1
        L1d:
            r4.f229a = r0
            a.a.a.f.b r0 = new a.a.a.f.b
            r0.<init>(r4)
            r4.f231c = r0
            a.a.a.f.f r1 = new a.a.a.f.f
            android.database.sqlite.SQLiteDatabase r2 = r0.a()
            r1.<init>(r2)
            r4.f230b = r1
            a.a.a.f.c r1 = new a.a.a.f.c
            android.database.sqlite.SQLiteDatabase r2 = r0.a()
            r1.<init>(r4, r2)
            r4.e = r1
            a.a.a.f.g r2 = new a.a.a.f.g
            android.database.sqlite.SQLiteDatabase r0 = r0.a()
            int r1 = r1.c()
            r2.<init>(r4, r0, r1)
            r4.d = r2
            return
    }

    public static /* synthetic */ a.a.a.f.c a(a.a.a.f.d r0) {
            a.a.a.f.c r0 = r0.e
            return r0
    }

    public static void a(android.content.Context r1) {
            android.content.Context r0 = a.a.a.f.d.g
            if (r0 != 0) goto Lf
            a.a.a.f.d.g = r1
            a.a.a.i.b r1 = a.a.a.i.b.e()
            android.content.Context r0 = a.a.a.f.d.g
            r1.a(r0)
        Lf:
            return
    }

    public static /* synthetic */ a.a.a.f.b b(a.a.a.f.d r0) {
            a.a.a.f.b r0 = r0.f231c
            return r0
    }

    public static /* synthetic */ android.net.Uri b(java.lang.String r0) {
            android.net.Uri r0 = c(r0)
            return r0
    }

    public static final android.net.Uri c(java.lang.String r2) {
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            java.lang.String r2 = "content://%s/"
            java.lang.String r2 = java.lang.String.format(r2, r0)
            android.net.Uri r2 = android.net.Uri.parse(r2)
            return r2
    }

    public static /* synthetic */ android.content.Context q() {
            android.content.Context r0 = a.a.a.f.d.g
            return r0
    }

    public static a.a.a.f.d r() {
            java.lang.Object r0 = a.a.a.f.d.i
            monitor-enter(r0)
            a.a.a.f.d r1 = a.a.a.f.d.h     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto L19
            android.content.Context r1 = a.a.a.f.d.g     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto L12
            android.content.Context r1 = com.baidu.location.f.c()     // Catch: java.lang.Throwable -> L22
            a(r1)     // Catch: java.lang.Throwable -> L22
        L12:
            a.a.a.f.d r1 = new a.a.a.f.d     // Catch: java.lang.Throwable -> L22
            r1.<init>()     // Catch: java.lang.Throwable -> L22
            a.a.a.f.d.h = r1     // Catch: java.lang.Throwable -> L22
        L19:
            a.a.a.f.d r1 = a.a.a.f.d.h     // Catch: java.lang.Throwable -> L22
            r1.a()     // Catch: java.lang.Throwable -> L22
            a.a.a.f.d r1 = a.a.a.f.d.h     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            return r1
        L22:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r1
    }

    public long a(java.lang.String r1) {
            r0 = this;
            a.a.a.f.c r0 = r0.e
            long r0 = r0.a(r1)
            return r0
    }

    public com.baidu.location.c a(a.a.a.g.a r8, a.a.a.g.k r9, com.baidu.location.c r10, a.a.a.f.d.c r11, a.a.a.f.d.b r12) {
            r7 = this;
            a.a.a.f.d$c r0 = a.a.a.f.d.c.f236b
            if (r11 != r0) goto L24
            a.a.a.f.c r11 = r7.e
            int r11 = r11.d()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            a.a.a.i.b r1 = a.a.a.i.b.e()
            java.lang.String r1 = r1.c()
            r0.append(r1)
            java.lang.String r1 = "&mixMode=1"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L2d
        L24:
            r11 = 0
            a.a.a.i.b r0 = a.a.a.i.b.e()
            java.lang.String r0 = r0.c()
        L2d:
            r6 = r11
            r4 = r0
            a.a.a.f.d$b r11 = a.a.a.f.d.b.f234b
            if (r12 != r11) goto L36
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            goto L38
        L36:
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
        L38:
            boolean r5 = r11.booleanValue()
            r1 = r8
            r2 = r9
            r3 = r10
            java.lang.String[] r8 = a.a.a.f.e.a(r1, r2, r3, r4, r5, r6)
            r9 = 0
            int r10 = r8.length
            if (r10 <= 0) goto L50
            com.baidu.location.c r9 = r7.a(r8)
            if (r9 == 0) goto L50
            r9.r()
        L50:
            return r9
    }

    public final com.baidu.location.c a(java.lang.String[] r3) {
            r2 = this;
            com.baidu.location.c r0 = new com.baidu.location.c
            r0.<init>()
            java.util.concurrent.ExecutorService r0 = r2.f
            if (r0 != 0) goto Lf
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor()
            r2.f = r0
        Lf:
            java.util.concurrent.ExecutorService r0 = r2.f
            a.a.a.f.d$a r1 = new a.a.a.f.d$a
            r1.<init>(r2, r3)
            java.util.concurrent.Future r2 = r0.submit(r1)
            java.util.concurrent.FutureTask r2 = (java.util.concurrent.FutureTask) r2
            r0 = 2000(0x7d0, double:9.88E-321)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L27
            java.lang.Object r3 = r2.get(r0, r3)     // Catch: java.lang.Throwable -> L27
            com.baidu.location.c r3 = (com.baidu.location.c) r3     // Catch: java.lang.Throwable -> L27
            goto L2c
        L27:
            r3 = 1
            r2.cancel(r3)
            r3 = 0
        L2c:
            return r3
    }

    public final void a() {
            r0 = this;
            a.a.a.f.c r0 = r0.e
            r0.a()
            return
    }

    public void b() {
            r0 = this;
            return
    }

    public a.a.a.f.c c() {
            r0 = this;
            a.a.a.f.c r0 = r0.e
            return r0
    }

    public android.content.Context d() {
            r0 = this;
            android.content.Context r0 = a.a.a.f.d.g
            return r0
    }

    public a.a.a.f.f e() {
            r0 = this;
            a.a.a.f.f r0 = r0.f230b
            return r0
    }

    public double f() {
            r5 = this;
            android.content.Context r0 = a.a.a.f.d.g
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> Lf
            goto L14
        Lf:
            r0 = move-exception
            r0.printStackTrace()
            r0 = 0
        L14:
            a.a.a.f.d$d r1 = a.a.a.f.d.EnumC0012d.f238b
            if (r0 == 0) goto L72
            boolean r2 = r0.isConnected()
            if (r2 == 0) goto L72
            int r2 = r0.getType()
            r3 = 1
            if (r2 != r3) goto L28
            a.a.a.f.d$d r2 = a.a.a.f.d.EnumC0012d.f239c
            goto L29
        L28:
            r2 = r1
        L29:
            int r4 = r0.getType()
            if (r4 != 0) goto L73
            int r0 = r0.getSubtype()
            if (r0 == r3) goto L6f
            r3 = 2
            if (r0 == r3) goto L6f
            r3 = 4
            if (r0 == r3) goto L6f
            r3 = 7
            if (r0 == r3) goto L6f
            r3 = 11
            if (r0 != r3) goto L43
            goto L6f
        L43:
            r3 = 3
            if (r0 == r3) goto L6c
            r3 = 5
            if (r0 == r3) goto L6c
            r3 = 6
            if (r0 == r3) goto L6c
            r3 = 8
            if (r0 == r3) goto L6c
            r3 = 9
            if (r0 == r3) goto L6c
            r3 = 10
            if (r0 == r3) goto L6c
            r3 = 12
            if (r0 == r3) goto L6c
            r3 = 14
            if (r0 == r3) goto L6c
            r3 = 15
            if (r0 != r3) goto L65
            goto L6c
        L65:
            r3 = 13
            if (r0 != r3) goto L73
            a.a.a.f.d$d r2 = a.a.a.f.d.EnumC0012d.f
            goto L73
        L6c:
            a.a.a.f.d$d r2 = a.a.a.f.d.EnumC0012d.e
            goto L73
        L6f:
            a.a.a.f.d$d r2 = a.a.a.f.d.EnumC0012d.d
            goto L73
        L72:
            r2 = r1
        L73:
            r3 = 0
            if (r2 != r1) goto L7e
            a.a.a.f.c r5 = r5.e
            double r3 = r5.i()
            goto La9
        L7e:
            a.a.a.f.d$d r0 = a.a.a.f.d.EnumC0012d.f239c
            if (r2 != r0) goto L89
            a.a.a.f.c r5 = r5.e
            double r3 = r5.j()
            goto La9
        L89:
            a.a.a.f.d$d r0 = a.a.a.f.d.EnumC0012d.d
            if (r2 != r0) goto L94
            a.a.a.f.c r5 = r5.e
            double r3 = r5.f()
            goto La9
        L94:
            a.a.a.f.d$d r0 = a.a.a.f.d.EnumC0012d.e
            if (r2 != r0) goto L9f
            a.a.a.f.c r5 = r5.e
            double r3 = r5.g()
            goto La9
        L9f:
            a.a.a.f.d$d r0 = a.a.a.f.d.EnumC0012d.f
            if (r2 != r0) goto La9
            a.a.a.f.c r5 = r5.e
            double r3 = r5.h()
        La9:
            return r3
    }

    public a.a.a.f.g g() {
            r0 = this;
            a.a.a.f.g r0 = r0.d
            return r0
    }

    public java.io.File h() {
            r0 = this;
            java.io.File r0 = r0.f229a
            return r0
    }

    public boolean i() {
            r0 = this;
            a.a.a.f.c r0 = r0.e
            boolean r0 = r0.l()
            return r0
    }

    public boolean j() {
            r0 = this;
            a.a.a.f.c r0 = r0.e
            boolean r0 = r0.m()
            return r0
    }

    public boolean k() {
            r0 = this;
            a.a.a.f.c r0 = r0.e
            boolean r0 = r0.o()
            return r0
    }

    public final boolean l() {
            r6 = this;
            android.content.Context r0 = a.a.a.f.d.g
            java.lang.String r0 = r0.getPackageName()
            a.a.a.f.c r6 = r6.e
            java.lang.String[] r6 = r6.k()
            r1 = 0
            r2 = 0
            r4 = r1
            r3 = r2
        L10:
            int r5 = r6.length
            if (r3 >= r5) goto L27
            android.content.Context r4 = a.a.a.f.d.g     // Catch: java.lang.Exception -> L20
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: java.lang.Exception -> L20
            r5 = r6[r3]     // Catch: java.lang.Exception -> L20
            android.content.pm.ProviderInfo r4 = r4.resolveContentProvider(r5, r2)     // Catch: java.lang.Exception -> L20
            goto L21
        L20:
            r4 = r1
        L21:
            if (r4 == 0) goto L24
            goto L27
        L24:
            int r3 = r3 + 1
            goto L10
        L27:
            if (r4 != 0) goto L2a
            goto L33
        L2a:
            java.lang.String r6 = r4.packageName
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L33
            goto L34
        L33:
            r2 = 1
        L34:
            return r2
    }

    public boolean m() {
            r0 = this;
            a.a.a.f.c r0 = r0.e
            boolean r0 = r0.p()
            return r0
    }

    public boolean n() {
            r0 = this;
            a.a.a.f.c r0 = r0.e
            boolean r0 = r0.q()
            return r0
    }

    public void o() {
            r1 = this;
            boolean r0 = r1.l()
            if (r0 == 0) goto L11
            boolean r0 = a.a.a.i.i.l()
            if (r0 != 0) goto L11
            a.a.a.f.b r1 = r1.f231c
            r1.b()
        L11:
            return
    }

    public void p() {
            r1 = this;
            boolean r0 = a.a.a.i.i.l()
            if (r0 != 0) goto Lb
            a.a.a.f.f r1 = r1.f230b
            r1.b()
        Lb:
            return
    }
}
