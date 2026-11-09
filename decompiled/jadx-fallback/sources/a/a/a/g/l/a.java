package a.a.a.g.l;

/* JADX INFO: loaded from: classes.dex */
public class a implements a.a.a.g.m.a {
    public static java.lang.Class<?> G;
    public static int H;
    public boolean A;
    public boolean B;
    public android.os.Handler C;
    public int D;
    public int E;
    public final java.lang.Object F;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f298c;
    public int d;
    public float e;
    public boolean f;
    public boolean g;
    public android.telephony.TelephonyManager h;
    public android.telephony.TelephonyManager i;
    public android.telephony.TelephonyManager j;
    public android.telephony.SubscriptionManager k;
    public a.a.a.g.a l;
    public a.a.a.g.a m;
    public java.util.List<a.a.a.g.a> n;
    public java.util.concurrent.Executor o;
    public a.a.a.g.l.a.e p;
    public a.a.a.g.l.a.d q;
    public a.a.a.g.l.a.b r;
    public a.a.a.g.l.a.c s;
    public android.content.Context t;
    public boolean u;
    public int v;
    public boolean w;
    public long x;
    public long y;
    public boolean z;

    /* JADX INFO: renamed from: a.a.a.g.l.a$a, reason: collision with other inner class name */
    public class RunnableC0016a implements java.lang.Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.a.a.g.l.a f299b;

        public RunnableC0016a(a.a.a.g.l.a r1) {
                r0 = this;
                r0.f299b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                a.a.a.g.l.a r0 = r3.f299b     // Catch: java.lang.Exception -> L2b
                a.a.a.g.l.a.e(r0)     // Catch: java.lang.Exception -> L2b
                a.a.a.g.l.a r0 = r3.f299b     // Catch: java.lang.Exception -> L2b
                java.lang.Object r0 = a.a.a.g.l.a.f(r0)     // Catch: java.lang.Exception -> L2b
                monitor-enter(r0)     // Catch: java.lang.Exception -> L2b
                a.a.a.g.l.a r3 = r3.f299b     // Catch: java.lang.Throwable -> L28
                java.lang.Object r3 = a.a.a.g.l.a.f(r3)     // Catch: java.lang.Throwable -> L28
                r3.notifyAll()     // Catch: java.lang.Throwable -> L28
                boolean r3 = a.a.a.g.m.a.f310a     // Catch: java.lang.Throwable -> L28
                if (r3 == 0) goto L26
                boolean r3 = a.a.a.g.m.a.f311b     // Catch: java.lang.Throwable -> L28
                if (r3 == 0) goto L26
                a.a.a.g.e r3 = a.a.a.g.g.h()     // Catch: java.lang.Throwable -> L28
                java.lang.String r1 = "update mCellInfo completed"
                r3.a(r1)     // Catch: java.lang.Throwable -> L28
            L26:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
                goto L4c
            L28:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
                throw r3     // Catch: java.lang.Exception -> L2b
            L2b:
                r3 = move-exception
                boolean r0 = a.a.a.g.m.a.f310a
                if (r0 == 0) goto L4c
                boolean r0 = a.a.a.g.m.a.f311b
                if (r0 == 0) goto L4c
                a.a.a.g.e r0 = a.a.a.g.g.h()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "handleCellInfo error = "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.a(r3)
            L4c:
                return
        }
    }

    public class b extends android.telephony.TelephonyManager.CellInfoCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.a.a.g.l.a f300a;

        public b(a.a.a.g.l.a r1) {
                r0 = this;
                r0.f300a = r1
                r0.<init>()
                return
        }

        public /* synthetic */ b(a.a.a.g.l.a r1, a.a.a.g.l.a.RunnableC0016a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.telephony.TelephonyManager.CellInfoCallback
        public void onCellInfo(java.util.List<android.telephony.CellInfo> r4) {
                r3 = this;
                boolean r0 = a.a.a.g.m.a.f310a
                if (r0 == 0) goto L11
                boolean r1 = a.a.a.g.m.a.f311b
                if (r1 == 0) goto L11
                a.a.a.g.e r1 = a.a.a.g.g.h()
                java.lang.String r2 = "onCellInfo"
                r1.a(r2)
            L11:
                if (r4 != 0) goto L14
                return
            L14:
                boolean r1 = a.a.a.g.m.a.f311b
                if (r1 == 0) goto L23
                a.a.a.g.e r2 = a.a.a.g.g.h()
                boolean r4 = r2.a(r4)
                if (r4 != 0) goto L23
                return
            L23:
                if (r0 == 0) goto L30
                if (r1 == 0) goto L30
                a.a.a.g.e r4 = a.a.a.g.g.h()
                java.lang.String r0 = "request sim1 cellInfo"
                r4.a(r0)
            L30:
                a.a.a.g.l.a r4 = r3.f300a
                boolean r4 = a.a.a.g.l.a.c(r4)
                if (r4 == 0) goto L43
                a.a.a.g.l.a r4 = r3.f300a
                boolean r0 = a.a.a.g.l.a.d(r4)
                r0 = r0 ^ 1
                a.a.a.g.l.a.a(r4, r0)
            L43:
                a.a.a.g.l.a r4 = r3.f300a
                boolean r4 = a.a.a.g.l.a.c(r4)
                if (r4 == 0) goto L53
                a.a.a.g.l.a r4 = r3.f300a
                boolean r4 = a.a.a.g.l.a.d(r4)
                if (r4 == 0) goto L58
            L53:
                a.a.a.g.l.a r3 = r3.f300a
                a.a.a.g.l.a.b(r3)
            L58:
                return
        }
    }

    public class c extends android.telephony.TelephonyManager.CellInfoCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.a.a.g.l.a f301a;

        public c(a.a.a.g.l.a r1) {
                r0 = this;
                r0.f301a = r1
                r0.<init>()
                return
        }

        public /* synthetic */ c(a.a.a.g.l.a r1, a.a.a.g.l.a.RunnableC0016a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.telephony.TelephonyManager.CellInfoCallback
        public void onCellInfo(java.util.List<android.telephony.CellInfo> r3) {
                r2 = this;
                if (r3 != 0) goto L3
                return
            L3:
                boolean r0 = a.a.a.g.m.a.f311b
                if (r0 == 0) goto L12
                a.a.a.g.e r1 = a.a.a.g.g.h()
                boolean r3 = r1.a(r3)
                if (r3 != 0) goto L12
                return
            L12:
                boolean r3 = a.a.a.g.m.a.f310a
                if (r3 == 0) goto L21
                if (r0 == 0) goto L21
                a.a.a.g.e r3 = a.a.a.g.g.h()
                java.lang.String r0 = "request sim2 cellInfo"
                r3.a(r0)
            L21:
                a.a.a.g.l.a r3 = r2.f301a
                boolean r3 = a.a.a.g.l.a.c(r3)
                if (r3 == 0) goto L34
                a.a.a.g.l.a r3 = r2.f301a
                boolean r0 = a.a.a.g.l.a.d(r3)
                r0 = r0 ^ 1
                a.a.a.g.l.a.a(r3, r0)
            L34:
                a.a.a.g.l.a r3 = r2.f301a
                boolean r3 = a.a.a.g.l.a.c(r3)
                if (r3 == 0) goto L44
                a.a.a.g.l.a r3 = r2.f301a
                boolean r3 = a.a.a.g.l.a.d(r3)
                if (r3 == 0) goto L49
            L44:
                a.a.a.g.l.a r2 = r2.f301a
                a.a.a.g.l.a.b(r2)
            L49:
                return
        }
    }

    public class d extends android.telephony.TelephonyManager.CellInfoCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.a.a.g.l.a f302a;

        public d(a.a.a.g.l.a r1) {
                r0 = this;
                r0.f302a = r1
                r0.<init>()
                return
        }

        public /* synthetic */ d(a.a.a.g.l.a r1, a.a.a.g.l.a.RunnableC0016a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.telephony.TelephonyManager.CellInfoCallback
        public void onCellInfo(java.util.List<android.telephony.CellInfo> r2) {
                r1 = this;
                if (r2 != 0) goto L3
                return
            L3:
                boolean r0 = a.a.a.g.m.a.f311b
                if (r0 == 0) goto L12
                a.a.a.g.e r0 = a.a.a.g.g.h()
                boolean r2 = r0.a(r2)
                if (r2 != 0) goto L12
                return
            L12:
                a.a.a.g.l.a r1 = r1.f302a
                a.a.a.g.l.a.b(r1)
                return
        }

        @Override // android.telephony.TelephonyManager.CellInfoCallback
        public void onError(int r2, java.lang.Throwable r3) {
                r1 = this;
                if (r3 == 0) goto L5
                r3.printStackTrace()
            L5:
                boolean r1 = a.a.a.g.m.a.f310a
                if (r1 == 0) goto L25
                boolean r1 = a.a.a.g.m.a.f311b
                if (r1 == 0) goto L25
                a.a.a.g.e r1 = a.a.a.g.g.h()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r0 = "cell onError = "
                r3.append(r0)
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                r1.a(r2)
            L25:
                return
        }
    }

    public class e extends android.telephony.PhoneStateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.a.a.g.l.a f303a;

        /* JADX INFO: renamed from: a.a.a.g.l.a$e$a, reason: collision with other inner class name */
        public class RunnableC0017a implements java.lang.Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a.a.a.g.l.a.e f304b;

            public RunnableC0017a(a.a.a.g.l.a.e r1) {
                    r0 = this;
                    r0.f304b = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    boolean r0 = a.a.a.g.m.a.f310a     // Catch: java.lang.Exception -> L19
                    if (r0 == 0) goto L11
                    boolean r0 = a.a.a.g.m.a.f311b     // Catch: java.lang.Exception -> L19
                    if (r0 == 0) goto L11
                    a.a.a.g.e r0 = a.a.a.g.g.h()     // Catch: java.lang.Exception -> L19
                    java.lang.String r1 = "cell received cellinfo change"
                    r0.a(r1)     // Catch: java.lang.Exception -> L19
                L11:
                    a.a.a.g.l.a$e r2 = r2.f304b     // Catch: java.lang.Exception -> L19
                    a.a.a.g.l.a r2 = r2.f303a     // Catch: java.lang.Exception -> L19
                    a.a.a.g.l.a.e(r2)     // Catch: java.lang.Exception -> L19
                    goto L21
                L19:
                    r2 = move-exception
                    boolean r0 = a.a.a.g.m.a.f310a
                    if (r0 == 0) goto L21
                    r2.printStackTrace()
                L21:
                    return
            }
        }

        public e(a.a.a.g.l.a r1) {
                r0 = this;
                r0.f303a = r1
                r0.<init>()
                return
        }

        @Override // android.telephony.PhoneStateListener
        public void onCellInfoChanged(java.util.List<android.telephony.CellInfo> r2) {
                r1 = this;
                if (r2 != 0) goto L3
                return
            L3:
                a.a.a.g.l.a r2 = r1.f303a
                android.os.Handler r2 = a.a.a.g.l.a.g(r2)
                a.a.a.g.l.a$e$a r0 = new a.a.a.g.l.a$e$a
                r0.<init>(r1)
                r2.post(r0)
                return
        }

        @Override // android.telephony.PhoneStateListener
        public void onSignalStrengthsChanged(android.telephony.SignalStrength r3) {
                r2 = this;
                a.a.a.g.l.a r0 = r2.f303a
                a.a.a.g.a r0 = a.a.a.g.l.a.a(r0)
                if (r0 == 0) goto L60
                a.a.a.g.l.a r0 = r2.f303a
                a.a.a.g.a r0 = a.a.a.g.l.a.a(r0)
                char r0 = r0.i
                r1 = 103(0x67, float:1.44E-43)
                if (r0 != r1) goto L21
                a.a.a.g.l.a r0 = r2.f303a
                a.a.a.g.a r0 = a.a.a.g.l.a.a(r0)
                int r3 = r3.getGsmSignalStrength()
            L1e:
                r0.h = r3
                goto L38
            L21:
                a.a.a.g.l.a r0 = r2.f303a
                a.a.a.g.a r0 = a.a.a.g.l.a.a(r0)
                char r0 = r0.i
                r1 = 99
                if (r0 != r1) goto L38
                a.a.a.g.l.a r0 = r2.f303a
                a.a.a.g.a r0 = a.a.a.g.l.a.a(r0)
                int r3 = r3.getCdmaDbm()
                goto L1e
            L38:
                boolean r3 = a.a.a.g.m.a.f310a
                if (r3 == 0) goto L60
                boolean r3 = a.a.a.g.m.a.f311b
                if (r3 == 0) goto L60
                a.a.a.g.e r3 = a.a.a.g.g.h()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "cell strength===== cell singal strength changed : "
                r0.append(r1)
                a.a.a.g.l.a r2 = r2.f303a
                a.a.a.g.a r2 = a.a.a.g.l.a.a(r2)
                int r2 = r2.h
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                r3.a(r2)
            L60:
                return
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static a.a.a.g.l.a f305a;

        static {
                a.a.a.g.l.a r0 = new a.a.a.g.l.a
                r0.<init>()
                a.a.a.g.l.a.f.f305a = r0
                return
        }

        public static /* synthetic */ a.a.a.g.l.a a() {
                a.a.a.g.l.a r0 = a.a.a.g.l.a.f.f305a
                return r0
        }
    }

    static {
            return
    }

    public a() {
            r5 = this;
            r5.<init>()
            r0 = 30
            r5.f298c = r0
            r0 = 100
            r5.d = r0
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            r5.e = r0
            r0 = 1
            r5.f = r0
            r1 = 0
            r5.g = r1
            r2 = 0
            r5.h = r2
            r5.i = r2
            r5.j = r2
            r5.k = r2
            a.a.a.g.a r3 = new a.a.a.g.a
            r3.<init>()
            r5.l = r3
            r5.m = r2
            r5.n = r2
            r5.o = r2
            r5.p = r2
            r5.u = r1
            r5.v = r1
            r5.w = r1
            r3 = 0
            r5.x = r3
            r5.y = r3
            r5.z = r1
            r5.A = r0
            r5.B = r1
            r5.C = r2
            r0 = -1
            r5.D = r0
            r5.E = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r5.F = r0
            return
    }

    public static int a(android.telephony.CellIdentityNr r3) {
            java.lang.String r0 = "getHwTac"
            int r3 = a.a.a.g.m.b.a(r3, r0)     // Catch: java.lang.Throwable -> L27
            boolean r0 = a.a.a.g.m.a.f310a     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L49
            boolean r0 = a.a.a.g.m.a.f311b     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L49
            a.a.a.g.e r0 = a.a.a.g.g.h()     // Catch: java.lang.Throwable -> L27
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27
            r1.<init>()     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = " get hw tac = "
            r1.append(r2)     // Catch: java.lang.Throwable -> L27
            r1.append(r3)     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L27
            r0.a(r1)     // Catch: java.lang.Throwable -> L27
            goto L49
        L27:
            r3 = move-exception
            boolean r0 = a.a.a.g.m.a.f310a
            if (r0 == 0) goto L48
            boolean r0 = a.a.a.g.m.a.f311b
            if (r0 == 0) goto L48
            a.a.a.g.e r0 = a.a.a.g.g.h()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = " get hw tac exception !"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.a(r3)
        L48:
            r3 = -1
        L49:
            return r3
    }

    public static /* synthetic */ a.a.a.g.a a(a.a.a.g.l.a r0) {
            a.a.a.g.a r0 = r0.l
            return r0
    }

    public static /* synthetic */ boolean a(a.a.a.g.l.a r0, boolean r1) {
            r0.A = r1
            return r1
    }

    public static int b(java.lang.String r5) {
            r0 = -1
            if (r5 == 0) goto L5e
            java.lang.String r1 = "mNrTac"
            boolean r1 = r5.contains(r1)
            if (r1 == 0) goto L5e
            java.lang.String r1 = " "
            java.lang.String r2 = ""
            java.lang.String r5 = r5.replace(r1, r2)
            java.lang.String r1 = "mNrTac=(.+?)\\}"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            java.util.regex.Matcher r5 = r1.matcher(r5)
        L1d:
            r1 = r0
        L1e:
            boolean r2 = r5.find()
            if (r2 == 0) goto L5d
            int r2 = r5.groupCount()
            r3 = 1
            if (r2 < r3) goto L1e
            java.lang.String r1 = r5.group(r3)
            boolean r2 = a.a.a.g.m.a.f310a
            if (r2 == 0) goto L4f
            boolean r2 = a.a.a.g.m.a.f311b
            if (r2 == 0) goto L4f
            a.a.a.g.e r2 = a.a.a.g.g.h()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = " pasrse mnrtac = "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            r2.a(r3)
        L4f:
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L54
            goto L1e
        L54:
            r1 = move-exception
            boolean r2 = a.a.a.g.m.a.f310a
            if (r2 == 0) goto L1d
            r1.printStackTrace()
            goto L1d
        L5d:
            r0 = r1
        L5e:
            return r0
    }

    public static /* synthetic */ void b(a.a.a.g.l.a r0) {
            r0.a()
            return
    }

    public static /* synthetic */ boolean c(a.a.a.g.l.a r0) {
            boolean r0 = r0.z
            return r0
    }

    public static int d(int r1) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r0) goto L6
            r1 = -1
        L6:
            return r1
    }

    public static /* synthetic */ boolean d(a.a.a.g.l.a r0) {
            boolean r0 = r0.A
            return r0
    }

    public static /* synthetic */ void e(a.a.a.g.l.a r0) {
            r0.g()
            return
    }

    public static /* synthetic */ java.lang.Object f(a.a.a.g.l.a r0) {
            java.lang.Object r0 = r0.F
            return r0
    }

    public static /* synthetic */ android.os.Handler g(a.a.a.g.l.a r0) {
            android.os.Handler r0 = r0.C
            return r0
    }

    public static a.a.a.g.l.a i() {
            a.a.a.g.l.a r0 = a.a.a.g.l.a.f.a()
            return r0
    }

    public final int a(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L37
            java.lang.String r1 = "cl_s2"
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L37
            java.lang.String r1 = "cl_s2=[0-9]{1,}"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)     // Catch: java.lang.Exception -> L33
            java.util.regex.Matcher r1 = r1.matcher(r2)     // Catch: java.lang.Exception -> L33
            boolean r2 = r1.find()     // Catch: java.lang.Exception -> L33
            if (r2 == 0) goto L37
            java.lang.String r1 = r1.group()     // Catch: java.lang.Exception -> L33
            java.lang.String r2 = "cl_s2="
            int r2 = r1.indexOf(r2)     // Catch: java.lang.Exception -> L33
            int r2 = r2 + 6
            int r0 = r1.length()     // Catch: java.lang.Exception -> L33
            java.lang.String r1 = r1.substring(r2, r0)     // Catch: java.lang.Exception -> L33
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Exception -> L33
            goto L38
        L33:
            r1 = move-exception
            r1.printStackTrace()
        L37:
            r1 = -1
        L38:
            return r1
    }

    public a.a.a.g.a a(int r8) {
            r7 = this;
            android.telephony.TelephonyManager r0 = r7.h
            if (r0 == 0) goto L7e
            r7.g()     // Catch: java.lang.Exception -> L76
            boolean r0 = a.a.a.g.m.a.f310a     // Catch: java.lang.Exception -> L76
            if (r0 == 0) goto L31
            boolean r1 = a.a.a.g.m.a.f311b     // Catch: java.lang.Exception -> L76
            if (r1 == 0) goto L31
            a.a.a.g.e r1 = a.a.a.g.g.h()     // Catch: java.lang.Exception -> L76
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L76
            r2.<init>()     // Catch: java.lang.Exception -> L76
            java.lang.String r3 = " lastDiffTime = "
            r2.append(r3)     // Catch: java.lang.Exception -> L76
            long r3 = r7.y     // Catch: java.lang.Exception -> L76
            r2.append(r3)     // Catch: java.lang.Exception -> L76
            java.lang.String r3 = ", diffTime = "
            r2.append(r3)     // Catch: java.lang.Exception -> L76
            r2.append(r8)     // Catch: java.lang.Exception -> L76
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L76
            r1.a(r2)     // Catch: java.lang.Exception -> L76
        L31:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L76
            r2 = 29
            if (r1 < r2) goto L7e
            boolean r1 = r7.w     // Catch: java.lang.Exception -> L76
            if (r1 == 0) goto L7e
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r8 >= r1) goto L72
            long r1 = (long) r8     // Catch: java.lang.Exception -> L76
            long r3 = r7.y     // Catch: java.lang.Exception -> L76
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 != 0) goto L62
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L76
            long r5 = r7.x     // Catch: java.lang.Exception -> L76
            long r3 = r3 - r5
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 <= 0) goto L72
            if (r0 == 0) goto L6f
            boolean r0 = a.a.a.g.m.a.f311b     // Catch: java.lang.Exception -> L76
            if (r0 == 0) goto L6f
            a.a.a.g.e r0 = a.a.a.g.g.h()     // Catch: java.lang.Exception -> L76
            java.lang.String r1 = " over diff time"
        L5e:
            r0.a(r1)     // Catch: java.lang.Exception -> L76
            goto L6f
        L62:
            if (r0 == 0) goto L6f
            boolean r0 = a.a.a.g.m.a.f311b     // Catch: java.lang.Exception -> L76
            if (r0 == 0) goto L6f
            a.a.a.g.e r0 = a.a.a.g.g.h()     // Catch: java.lang.Exception -> L76
            java.lang.String r1 = "diff time is changed"
            goto L5e
        L6f:
            r7.e()     // Catch: java.lang.Exception -> L76
        L72:
            long r0 = (long) r8     // Catch: java.lang.Exception -> L76
            r7.y = r0     // Catch: java.lang.Exception -> L76
            goto L7e
        L76:
            r8 = move-exception
            boolean r0 = a.a.a.g.m.a.f310a
            if (r0 == 0) goto L7e
            r8.printStackTrace()
        L7e:
            a.a.a.g.a r8 = r7.l
            if (r8 == 0) goto L94
            boolean r8 = r8.d()
            if (r8 == 0) goto L94
            r8 = 0
            r7.m = r8
            a.a.a.g.a r8 = new a.a.a.g.a
            a.a.a.g.a r0 = r7.l
            r8.<init>(r0)
            r7.m = r8
        L94:
            a.a.a.g.a r8 = r7.l
            if (r8 == 0) goto Lb2
            boolean r8 = r8.c()
            if (r8 == 0) goto Lb2
            a.a.a.g.a r8 = r7.m
            if (r8 == 0) goto Lb2
            a.a.a.g.a r0 = r7.l
            char r1 = r0.i
            r2 = 103(0x67, float:1.44E-43)
            if (r1 != r2) goto Lb2
            int r1 = r8.d
            r0.d = r1
            int r8 = r8.f256c
            r0.f256c = r8
        Lb2:
            a.a.a.g.a r7 = r7.l
            return r7
    }

    public a.a.a.g.a a(a.a.a.g.a r3, android.telephony.TelephonyManager r4) {
            r2 = this;
            a.a.a.g.a r3 = r2.b(r3, r4)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 > r1) goto L44
            if (r3 == 0) goto L12
            boolean r0 = r3.e()
            if (r0 != 0) goto L44
        L12:
            android.telephony.CellLocation r4 = r4.getCellLocation()     // Catch: java.lang.Throwable -> L17
            goto L18
        L17:
            r4 = 0
        L18:
            if (r4 == 0) goto L1e
            a.a.a.g.a r3 = r2.a(r4)
        L1e:
            boolean r4 = a.a.a.g.m.a.f310a
            if (r4 == 0) goto L44
            boolean r4 = a.a.a.g.m.a.f311b
            if (r4 == 0) goto L44
            if (r3 == 0) goto L44
            a.a.a.g.e r4 = a.a.a.g.g.h()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "main process: old cell api = "
            r0.append(r1)
            java.lang.String r2 = r2.f(r3)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r4.a(r2)
        L44:
            return r3
    }

    public final a.a.a.g.a a(android.telephony.CellInfo r18, a.a.a.g.a r19, android.telephony.TelephonyManager r20) {
            r17 = this;
            r1 = r18
            r0 = r19
            int r2 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            int r3 = r3.intValue()
            r4 = 0
            r5 = 17
            if (r3 >= r5) goto L14
            return r4
        L14:
            a.a.a.g.a r5 = new a.a.a.g.a
            r5.<init>()
            boolean r6 = r1 instanceof android.telephony.CellInfoGsm
            r7 = 2
            r8 = 1
            r12 = 103(0x67, float:1.44E-43)
            r13 = 28
            if (r6 == 0) goto L76
            r0 = r1
            android.telephony.CellInfoGsm r0 = (android.telephony.CellInfoGsm) r0
            android.telephony.CellIdentityGsm r6 = r0.getCellIdentity()
            boolean r14 = a.a.a.g.m.a.f310a
            if (r14 == 0) goto L3b
            boolean r14 = a.a.a.g.m.a.f311b
            if (r14 == 0) goto L3b
            a.a.a.g.e r14 = a.a.a.g.g.h()
            java.lang.String r15 = "CellInfoGsm"
            r14.a(r15)
        L3b:
            int r14 = r6.getMcc()
            int r14 = d(r14)
            r5.f256c = r14
            int r14 = r6.getMnc()
            int r14 = d(r14)
            r5.d = r14
            int r14 = r6.getLac()
            int r14 = d(r14)
            r5.f254a = r14
            int r6 = r6.getCid()
            int r6 = d(r6)
            long r14 = (long) r6
            r5.f255b = r14
            r5.i = r12
            android.telephony.CellSignalStrengthGsm r0 = r0.getCellSignalStrength()
            int r0 = r0.getAsuLevel()
            r5.h = r0
            r5.k = r7
            if (r2 < r13) goto L1d7
            goto L1d1
        L76:
            boolean r6 = r1 instanceof android.telephony.CellInfoCdma
            if (r6 == 0) goto L17b
            r6 = r1
            android.telephony.CellInfoCdma r6 = (android.telephony.CellInfoCdma) r6
            android.telephony.CellIdentityCdma r14 = r6.getCellIdentity()
            boolean r15 = a.a.a.g.m.a.f310a
            if (r15 == 0) goto Lca
            boolean r16 = a.a.a.g.m.a.f311b
            if (r16 == 0) goto Lca
            a.a.a.g.e r4 = a.a.a.g.g.h()
            java.lang.String r7 = "CellInfoCdma"
            r4.a(r7)
            a.a.a.g.e r4 = a.a.a.g.g.h()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r11 = "lat = "
            r7.append(r11)
            int r11 = r14.getLatitude()
            r7.append(r11)
            java.lang.String r7 = r7.toString()
            r4.a(r7)
            a.a.a.g.e r4 = a.a.a.g.g.h()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r11 = "lon = "
            r7.append(r11)
            int r11 = r14.getLongitude()
            r7.append(r11)
            java.lang.String r7 = r7.toString()
            r4.a(r7)
        Lca:
            int r4 = r14.getLatitude()
            r5.e = r4
            int r4 = r14.getLongitude()
            r5.f = r4
            int r4 = r14.getSystemId()
            int r4 = d(r4)
            r5.d = r4
            int r4 = r14.getNetworkId()
            int r4 = d(r4)
            r5.f254a = r4
            int r4 = r14.getBasestationId()
            int r4 = d(r4)
            long r9 = (long) r4
            r5.f255b = r9
            r4 = 99
            r5.i = r4
            android.telephony.CellSignalStrengthCdma r4 = r6.getCellSignalStrength()
            int r4 = r4.getCdmaDbm()
            r5.h = r4
            r5.k = r8
            if (r2 < r13) goto L10d
            int r2 = r18.getCellConnectionStatus()
            r5.j = r2
        L10d:
            if (r0 == 0) goto L137
            int r0 = r0.f256c
            if (r0 <= 0) goto L137
            r5.f256c = r0
            if (r15 == 0) goto L1d7
            boolean r0 = a.a.a.g.m.a.f311b
            if (r0 == 0) goto L1d7
            a.a.a.g.e r0 = a.a.a.g.g.h()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "cdma set old cellinfo mcc = "
        L126:
            r2.append(r4)
            int r4 = r5.f256c
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r0.a(r2)
            goto L1d7
        L137:
            java.lang.String r0 = r20.getNetworkOperator()     // Catch: java.lang.Exception -> L15a
            if (r0 == 0) goto L162
            int r2 = r0.length()     // Catch: java.lang.Exception -> L15a
            if (r2 <= 0) goto L162
            int r2 = r0.length()     // Catch: java.lang.Exception -> L15a
            r4 = 3
            if (r2 < r4) goto L162
            r2 = 0
            java.lang.String r0 = r0.substring(r2, r4)     // Catch: java.lang.Exception -> L15a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L15a
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> L15a
            if (r0 >= 0) goto L163
            goto L162
        L15a:
            r0 = move-exception
            boolean r2 = a.a.a.g.m.a.f310a
            if (r2 == 0) goto L162
            r0.printStackTrace()
        L162:
            r0 = -1
        L163:
            if (r0 <= 0) goto L1d7
            r5.f256c = r0
            boolean r0 = a.a.a.g.m.a.f310a
            if (r0 == 0) goto L1d7
            boolean r0 = a.a.a.g.m.a.f311b
            if (r0 == 0) goto L1d7
            a.a.a.g.e r0 = a.a.a.g.g.h()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "cdma set old mcc = "
            goto L126
        L17b:
            boolean r0 = r1 instanceof android.telephony.CellInfoLte
            if (r0 == 0) goto L1d9
            r0 = r1
            android.telephony.CellInfoLte r0 = (android.telephony.CellInfoLte) r0
            android.telephony.CellIdentityLte r4 = r0.getCellIdentity()
            boolean r6 = a.a.a.g.m.a.f310a
            if (r6 == 0) goto L197
            boolean r6 = a.a.a.g.m.a.f311b
            if (r6 == 0) goto L197
            a.a.a.g.e r6 = a.a.a.g.g.h()
            java.lang.String r9 = "CellInfoLte"
            r6.a(r9)
        L197:
            int r6 = r4.getMcc()
            int r6 = d(r6)
            r5.f256c = r6
            int r6 = r4.getMnc()
            int r6 = d(r6)
            r5.d = r6
            int r6 = r4.getTac()
            int r6 = d(r6)
            r5.f254a = r6
            int r4 = r4.getCi()
            int r4 = d(r4)
            long r9 = (long) r4
            r5.f255b = r9
            r5.i = r12
            android.telephony.CellSignalStrengthLte r0 = r0.getCellSignalStrength()
            int r0 = r0.getAsuLevel()
            r5.h = r0
            r4 = 3
            r5.k = r4
            if (r2 < r13) goto L1d7
        L1d1:
            int r0 = r18.getCellConnectionStatus()
            r5.j = r0
        L1d7:
            r2 = r8
            goto L1da
        L1d9:
            r2 = 0
        L1da:
            r0 = 18
            if (r3 < r0) goto L47c
            if (r2 != 0) goto L47c
            boolean r0 = r1 instanceof android.telephony.CellInfoWcdma     // Catch: java.lang.Exception -> L474
            r2 = 4
            if (r0 == 0) goto L241
            r0 = r1
            android.telephony.CellInfoWcdma r0 = (android.telephony.CellInfoWcdma) r0     // Catch: java.lang.Exception -> L474
            android.telephony.CellIdentityWcdma r0 = r0.getCellIdentity()     // Catch: java.lang.Exception -> L474
            boolean r4 = a.a.a.g.m.a.f310a     // Catch: java.lang.Exception -> L474
            if (r4 == 0) goto L1fd
            boolean r4 = a.a.a.g.m.a.f311b     // Catch: java.lang.Exception -> L474
            if (r4 == 0) goto L1fd
            a.a.a.g.e r4 = a.a.a.g.g.h()     // Catch: java.lang.Exception -> L474
            java.lang.String r6 = "CellInfoWcdma"
            r4.a(r6)     // Catch: java.lang.Exception -> L474
        L1fd:
            int r4 = r0.getMcc()     // Catch: java.lang.Exception -> L474
            int r4 = d(r4)     // Catch: java.lang.Exception -> L474
            r5.f256c = r4     // Catch: java.lang.Exception -> L474
            int r4 = r0.getMnc()     // Catch: java.lang.Exception -> L474
            int r4 = d(r4)     // Catch: java.lang.Exception -> L474
            r5.d = r4     // Catch: java.lang.Exception -> L474
            int r4 = r0.getLac()     // Catch: java.lang.Exception -> L474
            int r4 = d(r4)     // Catch: java.lang.Exception -> L474
            r5.f254a = r4     // Catch: java.lang.Exception -> L474
            int r0 = r0.getCid()     // Catch: java.lang.Exception -> L474
            int r0 = d(r0)     // Catch: java.lang.Exception -> L474
            long r6 = (long) r0     // Catch: java.lang.Exception -> L474
            r5.f255b = r6     // Catch: java.lang.Exception -> L474
            r5.i = r12     // Catch: java.lang.Exception -> L474
            r0 = r1
            android.telephony.CellInfoWcdma r0 = (android.telephony.CellInfoWcdma) r0     // Catch: java.lang.Exception -> L474
            android.telephony.CellSignalStrengthWcdma r0 = r0.getCellSignalStrength()     // Catch: java.lang.Exception -> L474
            int r0 = r0.getAsuLevel()     // Catch: java.lang.Exception -> L474
            r5.h = r0     // Catch: java.lang.Exception -> L474
            r5.k = r2     // Catch: java.lang.Exception -> L474
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L474
            if (r0 < r13) goto L47c
        L23b:
            int r0 = r18.getCellConnectionStatus()     // Catch: java.lang.Exception -> L474
            goto L2ca
        L241:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L474
            r4 = 29
            if (r0 < r4) goto L47c
            boolean r0 = r1 instanceof android.telephony.CellInfoTdscdma     // Catch: java.lang.Exception -> L474
            r4 = 5
            if (r0 == 0) goto L2ce
            r0 = r1
            android.telephony.CellInfoTdscdma r0 = (android.telephony.CellInfoTdscdma) r0     // Catch: java.lang.Exception -> L474
            android.telephony.CellIdentityTdscdma r2 = r0.getCellIdentity()     // Catch: java.lang.Exception -> L474
            boolean r0 = a.a.a.g.m.a.f310a     // Catch: java.lang.Exception -> L474
            if (r0 == 0) goto L264
            boolean r0 = a.a.a.g.m.a.f311b     // Catch: java.lang.Exception -> L474
            if (r0 == 0) goto L264
            a.a.a.g.e r0 = a.a.a.g.g.h()     // Catch: java.lang.Exception -> L474
            java.lang.String r6 = "CellInfoTdscdma"
            r0.a(r6)     // Catch: java.lang.Exception -> L474
        L264:
            java.lang.String r0 = r2.getMccString()     // Catch: java.lang.Exception -> L474
            if (r0 == 0) goto L281
            java.lang.String r0 = r2.getMccString()     // Catch: java.lang.Throwable -> L279
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L279
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L279
            r5.f256c = r0     // Catch: java.lang.Throwable -> L279
            goto L281
        L279:
            r0 = move-exception
            boolean r6 = a.a.a.g.m.a.f310a     // Catch: java.lang.Exception -> L474
            if (r6 == 0) goto L281
            r0.printStackTrace()     // Catch: java.lang.Exception -> L474
        L281:
            java.lang.String r0 = r2.getMncString()     // Catch: java.lang.Exception -> L474
            if (r0 == 0) goto L29e
            java.lang.String r0 = r2.getMncString()     // Catch: java.lang.Throwable -> L296
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L296
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L296
            r5.d = r0     // Catch: java.lang.Throwable -> L296
            goto L29e
        L296:
            r0 = move-exception
            boolean r6 = a.a.a.g.m.a.f310a     // Catch: java.lang.Exception -> L474
            if (r6 == 0) goto L29e
            r0.printStackTrace()     // Catch: java.lang.Exception -> L474
        L29e:
            int r0 = r2.getLac()     // Catch: java.lang.Exception -> L474
            int r0 = d(r0)     // Catch: java.lang.Exception -> L474
            r5.f254a = r0     // Catch: java.lang.Exception -> L474
            int r0 = r2.getCid()     // Catch: java.lang.Exception -> L474
            int r0 = d(r0)     // Catch: java.lang.Exception -> L474
            long r6 = (long) r0     // Catch: java.lang.Exception -> L474
            r5.f255b = r6     // Catch: java.lang.Exception -> L474
            r5.i = r12     // Catch: java.lang.Exception -> L474
            r0 = r1
            android.telephony.CellInfoTdscdma r0 = (android.telephony.CellInfoTdscdma) r0     // Catch: java.lang.Exception -> L474
            android.telephony.CellSignalStrengthTdscdma r0 = r0.getCellSignalStrength()     // Catch: java.lang.Exception -> L474
            int r0 = r0.getAsuLevel()     // Catch: java.lang.Exception -> L474
            r5.h = r0     // Catch: java.lang.Exception -> L474
            r5.k = r4     // Catch: java.lang.Exception -> L474
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L474
            if (r0 < r13) goto L47c
            goto L23b
        L2ca:
            r5.j = r0     // Catch: java.lang.Exception -> L474
            goto L47c
        L2ce:
            boolean r0 = r1 instanceof android.telephony.CellInfoNr     // Catch: java.lang.Exception -> L474
            if (r0 == 0) goto L47c
            r0 = r1
            android.telephony.CellInfoNr r0 = (android.telephony.CellInfoNr) r0     // Catch: java.lang.Throwable -> L301
            android.telephony.CellIdentity r0 = r0.getCellIdentity()     // Catch: java.lang.Throwable -> L301
            android.telephony.CellIdentityNr r0 = (android.telephony.CellIdentityNr) r0     // Catch: java.lang.Throwable -> L301
            boolean r6 = a.a.a.g.m.a.f310a     // Catch: java.lang.Throwable -> L301
            if (r6 == 0) goto L2ff
            boolean r6 = a.a.a.g.m.a.f311b     // Catch: java.lang.Throwable -> L301
            if (r6 == 0) goto L2ff
            a.a.a.g.e r6 = a.a.a.g.g.h()     // Catch: java.lang.Throwable -> L301
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L301
            r9.<init>()     // Catch: java.lang.Throwable -> L301
            java.lang.String r10 = " get cell nr = "
            r9.append(r10)     // Catch: java.lang.Throwable -> L301
            java.lang.String r10 = r0.toString()     // Catch: java.lang.Throwable -> L301
            r9.append(r10)     // Catch: java.lang.Throwable -> L301
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L301
            r6.a(r9)     // Catch: java.lang.Throwable -> L301
        L2ff:
            r6 = r0
            goto L306
        L301:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Exception -> L474
            r6 = 0
        L306:
            boolean r0 = a.a.a.g.m.a.f310a     // Catch: java.lang.Exception -> L474
            if (r0 == 0) goto L317
            boolean r0 = a.a.a.g.m.a.f311b     // Catch: java.lang.Exception -> L474
            if (r0 == 0) goto L317
            a.a.a.g.e r0 = a.a.a.g.g.h()     // Catch: java.lang.Exception -> L474
            java.lang.String r9 = "CellInfoNr"
            r0.a(r9)     // Catch: java.lang.Exception -> L474
        L317:
            if (r6 == 0) goto L47c
            java.lang.String r0 = r6.getMccString()     // Catch: java.lang.Exception -> L474
            if (r0 == 0) goto L336
            java.lang.String r0 = r6.getMccString()     // Catch: java.lang.Throwable -> L32e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L32e
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L32e
            r5.f256c = r0     // Catch: java.lang.Throwable -> L32e
            goto L336
        L32e:
            r0 = move-exception
            boolean r9 = a.a.a.g.m.a.f310a     // Catch: java.lang.Exception -> L474
            if (r9 == 0) goto L336
            r0.printStackTrace()     // Catch: java.lang.Exception -> L474
        L336:
            java.lang.String r0 = r6.getMncString()     // Catch: java.lang.Exception -> L474
            if (r0 == 0) goto L353
            java.lang.String r0 = r6.getMncString()     // Catch: java.lang.Throwable -> L34b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L34b
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L34b
            r5.d = r0     // Catch: java.lang.Throwable -> L34b
            goto L353
        L34b:
            r0 = move-exception
            boolean r9 = a.a.a.g.m.a.f310a     // Catch: java.lang.Exception -> L474
            if (r9 == 0) goto L353
            r0.printStackTrace()     // Catch: java.lang.Exception -> L474
        L353:
            int r0 = r6.getTac()     // Catch: java.lang.Exception -> L474
            int r0 = d(r0)     // Catch: java.lang.Exception -> L474
            r5.f254a = r0     // Catch: java.lang.Exception -> L474
            r9 = -1
            if (r0 != r9) goto L393
            int r0 = a(r6)     // Catch: java.lang.Throwable -> L38b
            boolean r9 = a.a.a.g.m.a.f310a     // Catch: java.lang.Throwable -> L38b
            if (r9 == 0) goto L384
            boolean r9 = a.a.a.g.m.a.f311b     // Catch: java.lang.Throwable -> L38b
            if (r9 == 0) goto L384
            a.a.a.g.e r9 = a.a.a.g.g.h()     // Catch: java.lang.Throwable -> L38b
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38b
            r10.<init>()     // Catch: java.lang.Throwable -> L38b
            java.lang.String r14 = " get nrtac for huawei = "
            r10.append(r14)     // Catch: java.lang.Throwable -> L38b
            r10.append(r0)     // Catch: java.lang.Throwable -> L38b
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L38b
            r9.a(r10)     // Catch: java.lang.Throwable -> L38b
        L384:
            int r0 = d(r0)     // Catch: java.lang.Throwable -> L38b
            r5.f254a = r0     // Catch: java.lang.Throwable -> L38b
            goto L393
        L38b:
            r0 = move-exception
            boolean r9 = a.a.a.g.m.a.f310a     // Catch: java.lang.Exception -> L474
            if (r9 == 0) goto L393
            r0.printStackTrace()     // Catch: java.lang.Exception -> L474
        L393:
            int r0 = r5.f254a     // Catch: java.lang.Exception -> L474
            r9 = -1
            if (r0 != r9) goto L3cf
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L3c7
            int r0 = b(r0)     // Catch: java.lang.Throwable -> L3c7
            boolean r9 = a.a.a.g.m.a.f310a     // Catch: java.lang.Throwable -> L3c7
            if (r9 == 0) goto L3c0
            boolean r9 = a.a.a.g.m.a.f311b     // Catch: java.lang.Throwable -> L3c7
            if (r9 == 0) goto L3c0
            a.a.a.g.e r9 = a.a.a.g.g.h()     // Catch: java.lang.Throwable -> L3c7
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c7
            r10.<init>()     // Catch: java.lang.Throwable -> L3c7
            java.lang.String r14 = " get nrtac for samsung = "
            r10.append(r14)     // Catch: java.lang.Throwable -> L3c7
            r10.append(r0)     // Catch: java.lang.Throwable -> L3c7
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L3c7
            r9.a(r10)     // Catch: java.lang.Throwable -> L3c7
        L3c0:
            int r0 = d(r0)     // Catch: java.lang.Throwable -> L3c7
            r5.f254a = r0     // Catch: java.lang.Throwable -> L3c7
            goto L3cf
        L3c7:
            r0 = move-exception
            boolean r9 = a.a.a.g.m.a.f310a     // Catch: java.lang.Exception -> L474
            if (r9 == 0) goto L3cf
            r0.printStackTrace()     // Catch: java.lang.Exception -> L474
        L3cf:
            int r0 = r5.f254a     // Catch: java.lang.Exception -> L474
            r9 = -1
            if (r0 != r9) goto L3da
            int r0 = r6.getTac()     // Catch: java.lang.Exception -> L474
            r5.f254a = r0     // Catch: java.lang.Exception -> L474
        L3da:
            long r9 = r6.getNci()     // Catch: java.lang.Exception -> L474
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r0 == 0) goto L3ed
            long r9 = r6.getNci()     // Catch: java.lang.Exception -> L474
            r5.f255b = r9     // Catch: java.lang.Exception -> L474
        L3ed:
            r5.i = r12     // Catch: java.lang.Exception -> L474
            r0 = 6
            r5.k = r0     // Catch: java.lang.Exception -> L474
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L474
            if (r6 < r13) goto L3fc
            int r6 = r18.getCellConnectionStatus()     // Catch: java.lang.Exception -> L474
            r5.j = r6     // Catch: java.lang.Exception -> L474
        L3fc:
            r6 = r1
            android.telephony.CellInfoNr r6 = (android.telephony.CellInfoNr) r6     // Catch: java.lang.Exception -> L474
            android.telephony.CellSignalStrength r6 = r6.getCellSignalStrength()     // Catch: java.lang.Exception -> L474
            android.telephony.CellSignalStrengthNr r6 = (android.telephony.CellSignalStrengthNr) r6     // Catch: java.lang.Exception -> L474
            int r9 = r6.getAsuLevel()     // Catch: java.lang.Exception -> L474
            r5.h = r9     // Catch: java.lang.Exception -> L474
            boolean r9 = r5.e()     // Catch: java.lang.Exception -> L474
            if (r9 == 0) goto L47c
            java.util.Locale r9 = java.util.Locale.US     // Catch: java.lang.Exception -> L474
            java.lang.String r10 = "%d|%d|%d|%d|%d|%d|%d|%d"
            r12 = 8
            java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch: java.lang.Exception -> L474
            int r13 = r6.getCsiRsrp()     // Catch: java.lang.Exception -> L474
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch: java.lang.Exception -> L474
            r7 = 0
            r12[r7] = r13     // Catch: java.lang.Exception -> L474
            int r7 = r6.getCsiRsrq()     // Catch: java.lang.Exception -> L474
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L474
            r12[r8] = r7     // Catch: java.lang.Exception -> L474
            int r7 = r6.getCsiSinr()     // Catch: java.lang.Exception -> L474
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L474
            r8 = 2
            r12[r8] = r7     // Catch: java.lang.Exception -> L474
            int r7 = r6.getDbm()     // Catch: java.lang.Exception -> L474
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L474
            r8 = 3
            r12[r8] = r7     // Catch: java.lang.Exception -> L474
            int r7 = r6.getLevel()     // Catch: java.lang.Exception -> L474
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L474
            r12[r2] = r7     // Catch: java.lang.Exception -> L474
            int r2 = r6.getSsRsrp()     // Catch: java.lang.Exception -> L474
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L474
            r12[r4] = r2     // Catch: java.lang.Exception -> L474
            int r2 = r6.getSsRsrq()     // Catch: java.lang.Exception -> L474
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L474
            r12[r0] = r2     // Catch: java.lang.Exception -> L474
            r0 = 7
            int r2 = r6.getSsSinr()     // Catch: java.lang.Exception -> L474
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L474
            r12[r0] = r2     // Catch: java.lang.Exception -> L474
            java.lang.String r0 = java.lang.String.format(r9, r10, r12)     // Catch: java.lang.Exception -> L474
            r5.o = r0     // Catch: java.lang.Exception -> L474
            goto L47c
        L474:
            r0 = move-exception
            boolean r2 = a.a.a.g.m.a.f310a
            if (r2 == 0) goto L47c
            r0.printStackTrace()
        L47c:
            r0 = 30
            java.lang.String r2 = "new cell delta3 time(ms) = "
            if (r3 < r0) goto L503
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Error -> L58c
            long r6 = r18.getTimestampMillis()     // Catch: java.lang.Error -> L58c
            long r3 = r3 - r6
            boolean r0 = a.a.a.g.m.a.f310a     // Catch: java.lang.Error -> L58c
            if (r0 == 0) goto L4e1
            boolean r6 = a.a.a.g.m.a.f311b     // Catch: java.lang.Error -> L58c
            if (r6 == 0) goto L4e1
            a.a.a.g.e r6 = a.a.a.g.g.h()     // Catch: java.lang.Error -> L58c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Error -> L58c
            r7.<init>()     // Catch: java.lang.Error -> L58c
            java.lang.String r8 = "new cell delta1 time(ms) = "
            r7.append(r8)     // Catch: java.lang.Error -> L58c
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Error -> L58c
            r7.append(r8)     // Catch: java.lang.Error -> L58c
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Error -> L58c
            r6.a(r7)     // Catch: java.lang.Error -> L58c
            a.a.a.g.e r6 = a.a.a.g.g.h()     // Catch: java.lang.Error -> L58c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Error -> L58c
            r7.<init>()     // Catch: java.lang.Error -> L58c
            java.lang.String r8 = "new cell delta2 time(ms) = "
            r7.append(r8)     // Catch: java.lang.Error -> L58c
            long r8 = r18.getTimestampMillis()     // Catch: java.lang.Error -> L58c
            r7.append(r8)     // Catch: java.lang.Error -> L58c
            java.lang.String r1 = r7.toString()     // Catch: java.lang.Error -> L58c
            r6.a(r1)     // Catch: java.lang.Error -> L58c
            a.a.a.g.e r1 = a.a.a.g.g.h()     // Catch: java.lang.Error -> L58c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Error -> L58c
            r6.<init>()     // Catch: java.lang.Error -> L58c
            r6.append(r2)     // Catch: java.lang.Error -> L58c
            r6.append(r3)     // Catch: java.lang.Error -> L58c
            java.lang.String r2 = r6.toString()     // Catch: java.lang.Error -> L58c
            r1.a(r2)     // Catch: java.lang.Error -> L58c
        L4e1:
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Error -> L58c
            long r1 = r1 - r3
            r5.g = r1     // Catch: java.lang.Error -> L58c
            if (r0 == 0) goto L59a
            a.a.a.g.e r0 = a.a.a.g.g.h()     // Catch: java.lang.Error -> L58c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Error -> L58c
            r1.<init>()     // Catch: java.lang.Error -> L58c
            java.lang.String r2 = "new cell time apilevel up 30 (ms) = "
            r1.append(r2)     // Catch: java.lang.Error -> L58c
            long r2 = r5.g     // Catch: java.lang.Error -> L58c
            r1.append(r2)     // Catch: java.lang.Error -> L58c
        L4fd:
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Error -> L58c
            goto L588
        L503:
            long r3 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Error -> L58c
            long r6 = r18.getTimeStamp()     // Catch: java.lang.Error -> L58c
            long r3 = r3 - r6
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r6
            boolean r0 = a.a.a.g.m.a.f310a     // Catch: java.lang.Error -> L58c
            if (r0 == 0) goto L566
            boolean r6 = a.a.a.g.m.a.f311b     // Catch: java.lang.Error -> L58c
            if (r6 == 0) goto L566
            a.a.a.g.e r6 = a.a.a.g.g.h()     // Catch: java.lang.Error -> L58c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Error -> L58c
            r7.<init>()     // Catch: java.lang.Error -> L58c
            java.lang.String r8 = "new cell delta1 time(ns) = "
            r7.append(r8)     // Catch: java.lang.Error -> L58c
            long r8 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Error -> L58c
            r7.append(r8)     // Catch: java.lang.Error -> L58c
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Error -> L58c
            r6.a(r7)     // Catch: java.lang.Error -> L58c
            a.a.a.g.e r6 = a.a.a.g.g.h()     // Catch: java.lang.Error -> L58c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Error -> L58c
            r7.<init>()     // Catch: java.lang.Error -> L58c
            java.lang.String r8 = "new cell delta2 time(ns) = "
            r7.append(r8)     // Catch: java.lang.Error -> L58c
            long r8 = r18.getTimeStamp()     // Catch: java.lang.Error -> L58c
            r7.append(r8)     // Catch: java.lang.Error -> L58c
            java.lang.String r1 = r7.toString()     // Catch: java.lang.Error -> L58c
            r6.a(r1)     // Catch: java.lang.Error -> L58c
            a.a.a.g.e r1 = a.a.a.g.g.h()     // Catch: java.lang.Error -> L58c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Error -> L58c
            r6.<init>()     // Catch: java.lang.Error -> L58c
            r6.append(r2)     // Catch: java.lang.Error -> L58c
            r6.append(r3)     // Catch: java.lang.Error -> L58c
            java.lang.String r2 = r6.toString()     // Catch: java.lang.Error -> L58c
            r1.a(r2)     // Catch: java.lang.Error -> L58c
        L566:
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Error -> L58c
            long r1 = r1 - r3
            r5.g = r1     // Catch: java.lang.Error -> L58c
            if (r0 == 0) goto L59a
            boolean r0 = a.a.a.g.m.a.f311b     // Catch: java.lang.Error -> L58c
            if (r0 == 0) goto L59a
            a.a.a.g.e r0 = a.a.a.g.g.h()     // Catch: java.lang.Error -> L58c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Error -> L58c
            r1.<init>()     // Catch: java.lang.Error -> L58c
            java.lang.String r2 = "new cell time(ms) = "
            r1.append(r2)     // Catch: java.lang.Error -> L58c
            long r2 = r5.g     // Catch: java.lang.Error -> L58c
            r1.append(r2)     // Catch: java.lang.Error -> L58c
            goto L4fd
        L588:
            r0.a(r1)     // Catch: java.lang.Error -> L58c
            goto L59a
        L58c:
            r0 = move-exception
            boolean r1 = a.a.a.g.m.a.f310a
            if (r1 == 0) goto L594
            r0.printStackTrace()
        L594:
            long r0 = java.lang.System.currentTimeMillis()
            r5.g = r0
        L59a:
            boolean r0 = a.a.a.g.m.a.f310a
            if (r0 == 0) goto L624
            boolean r0 = a.a.a.g.m.a.f311b
            if (r0 == 0) goto L624
            a.a.a.g.e r0 = a.a.a.g.g.h()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "mcc = "
            r1.append(r2)
            int r2 = r5.f256c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.a(r1)
            a.a.a.g.e r0 = a.a.a.g.g.h()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "mnc = "
            r1.append(r2)
            int r2 = r5.d
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.a(r1)
            a.a.a.g.e r0 = a.a.a.g.g.h()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "lac = "
            r1.append(r2)
            int r2 = r5.f254a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.a(r1)
            a.a.a.g.e r0 = a.a.a.g.g.h()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "cid = "
            r1.append(r2)
            long r2 = r5.f255b
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.a(r1)
            a.a.a.g.e r0 = a.a.a.g.g.h()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "cs = "
            r1.append(r2)
            int r2 = r5.j
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.a(r1)
        L624:
            return r5
    }

    public final a.a.a.g.a a(android.telephony.CellLocation r2) {
            r1 = this;
            r0 = 0
            a.a.a.g.a r1 = r1.a(r2, r0)
            return r1
    }

    public final a.a.a.g.a a(android.telephony.CellLocation r10, boolean r11) {
            r9 = this;
            r11 = 0
            if (r10 == 0) goto L1a4
            android.telephony.TelephonyManager r0 = r9.h
            if (r0 != 0) goto L9
            goto L1a4
        L9:
            boolean r0 = a.a.a.g.m.a.f310a
            if (r0 == 0) goto L1a
            boolean r0 = a.a.a.g.m.a.f311b
            if (r0 == 0) goto L1a
            a.a.a.g.e r0 = a.a.a.g.g.h()
            java.lang.String r1 = "set cell info.."
            r0.a(r1)
        L1a:
            a.a.a.g.a r0 = new a.a.a.g.a
            r0.<init>()
            r1 = 1
            r0.l = r1
            long r2 = java.lang.System.currentTimeMillis()
            r0.g = r2
            r2 = 3
            android.telephony.TelephonyManager r3 = r9.h     // Catch: java.lang.Exception -> Lae
            java.lang.String r3 = r3.getNetworkOperator()     // Catch: java.lang.Exception -> Lae
            if (r3 == 0) goto L83
            int r4 = r3.length()     // Catch: java.lang.Exception -> Lae
            if (r4 <= 0) goto L83
            r4 = -1
            int r5 = r3.length()     // Catch: java.lang.Exception -> Lae
            r6 = 0
            if (r5 < r2) goto L55
            java.lang.String r4 = r3.substring(r6, r2)     // Catch: java.lang.Exception -> Lae
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> Lae
            int r4 = r4.intValue()     // Catch: java.lang.Exception -> Lae
            if (r4 >= 0) goto L52
            a.a.a.g.a r5 = r9.l     // Catch: java.lang.Exception -> Lae
            int r5 = r5.f256c     // Catch: java.lang.Exception -> Lae
            goto L53
        L52:
            r5 = r4
        L53:
            r0.f256c = r5     // Catch: java.lang.Exception -> Lae
        L55:
            java.lang.String r3 = r3.substring(r2)     // Catch: java.lang.Exception -> Lae
            if (r3 == 0) goto L7b
            char[] r4 = r3.toCharArray()     // Catch: java.lang.Exception -> Lae
            r5 = r6
        L60:
            int r7 = r4.length     // Catch: java.lang.Exception -> Lae
            if (r5 >= r7) goto L6f
            char r7 = r4[r5]     // Catch: java.lang.Exception -> Lae
            boolean r7 = java.lang.Character.isDigit(r7)     // Catch: java.lang.Exception -> Lae
            if (r7 != 0) goto L6c
            goto L6f
        L6c:
            int r5 = r5 + 1
            goto L60
        L6f:
            java.lang.String r3 = r3.substring(r6, r5)     // Catch: java.lang.Exception -> Lae
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> Lae
            int r4 = r3.intValue()     // Catch: java.lang.Exception -> Lae
        L7b:
            if (r4 >= 0) goto L81
            a.a.a.g.a r3 = r9.l     // Catch: java.lang.Exception -> Lae
            int r4 = r3.d     // Catch: java.lang.Exception -> Lae
        L81:
            r0.d = r4     // Catch: java.lang.Exception -> Lae
        L83:
            android.telephony.TelephonyManager r3 = r9.h     // Catch: java.lang.Exception -> Lae
            int r3 = r3.getSimState()     // Catch: java.lang.Exception -> Lae
            r9.v = r3     // Catch: java.lang.Exception -> Lae
            boolean r3 = a.a.a.g.m.a.f310a     // Catch: java.lang.Exception -> Lae
            if (r3 == 0) goto Lb8
            boolean r3 = a.a.a.g.m.a.f311b     // Catch: java.lang.Exception -> Lae
            if (r3 == 0) goto Lb8
            a.a.a.g.e r3 = a.a.a.g.g.h()     // Catch: java.lang.Exception -> Lae
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lae
            r4.<init>()     // Catch: java.lang.Exception -> Lae
            java.lang.String r5 = "sim state:"
            r4.append(r5)     // Catch: java.lang.Exception -> Lae
            int r5 = r9.v     // Catch: java.lang.Exception -> Lae
            r4.append(r5)     // Catch: java.lang.Exception -> Lae
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Lae
            r3.a(r4)     // Catch: java.lang.Exception -> Lae
            goto Lb8
        Lae:
            r3 = move-exception
            boolean r4 = a.a.a.g.m.a.f310a
            if (r4 == 0) goto Lb6
            r3.printStackTrace()
        Lb6:
            a.a.a.g.l.a.H = r1
        Lb8:
            boolean r1 = r10 instanceof android.telephony.gsm.GsmCellLocation
            if (r1 == 0) goto Le2
            android.telephony.gsm.GsmCellLocation r10 = (android.telephony.gsm.GsmCellLocation) r10
            int r11 = r10.getLac()
            r0.f254a = r11
            int r10 = r10.getCid()
            long r10 = (long) r10
            r0.f255b = r10
            r10 = 103(0x67, float:1.44E-43)
            r0.i = r10
            boolean r10 = a.a.a.g.m.a.f310a
            if (r10 == 0) goto L1a0
            boolean r10 = a.a.a.g.m.a.f311b
            if (r10 == 0) goto L1a0
            a.a.a.g.e r10 = a.a.a.g.g.h()
            java.lang.String r11 = "bslocation mNetworkType = 'g'"
            r10.a(r11)
            goto L1a0
        Le2:
            boolean r1 = r10 instanceof android.telephony.cdma.CdmaCellLocation
            if (r1 == 0) goto L1a0
            r1 = 99
            r0.i = r1
            boolean r1 = a.a.a.g.m.a.f310a
            if (r1 == 0) goto Lfb
            boolean r3 = a.a.a.g.m.a.f311b
            if (r3 == 0) goto Lfb
            a.a.a.g.e r3 = a.a.a.g.g.h()
            java.lang.String r4 = "bslocation mNetworkType = 'c'"
            r3.a(r4)
        Lfb:
            java.lang.Class<?> r3 = a.a.a.g.l.a.G
            if (r3 != 0) goto L10b
            java.lang.String r3 = "android.telephony.cdma.CdmaCellLocation"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Exception -> L108
            a.a.a.g.l.a.G = r3     // Catch: java.lang.Exception -> L108
            goto L10b
        L108:
            a.a.a.g.l.a.G = r11
            return r0
        L10b:
            java.lang.Class<?> r11 = a.a.a.g.l.a.G
            if (r11 == 0) goto L1a0
            boolean r11 = r11.isInstance(r10)
            if (r11 == 0) goto L1a0
            r11 = r10
            android.telephony.cdma.CdmaCellLocation r11 = (android.telephony.cdma.CdmaCellLocation) r11     // Catch: java.lang.Exception -> L195
            int r11 = r11.getSystemId()     // Catch: java.lang.Exception -> L195
            if (r11 >= 0) goto L122
            a.a.a.g.a r11 = r9.l     // Catch: java.lang.Exception -> L195
            int r11 = r11.d     // Catch: java.lang.Exception -> L195
        L122:
            r0.d = r11     // Catch: java.lang.Exception -> L195
            r11 = r10
            android.telephony.cdma.CdmaCellLocation r11 = (android.telephony.cdma.CdmaCellLocation) r11     // Catch: java.lang.Exception -> L195
            int r11 = r11.getBaseStationId()     // Catch: java.lang.Exception -> L195
            long r3 = (long) r11     // Catch: java.lang.Exception -> L195
            r0.f255b = r3     // Catch: java.lang.Exception -> L195
            r11 = r10
            android.telephony.cdma.CdmaCellLocation r11 = (android.telephony.cdma.CdmaCellLocation) r11     // Catch: java.lang.Exception -> L195
            int r11 = r11.getNetworkId()     // Catch: java.lang.Exception -> L195
            r0.f254a = r11     // Catch: java.lang.Exception -> L195
            r11 = r10
            android.telephony.cdma.CdmaCellLocation r11 = (android.telephony.cdma.CdmaCellLocation) r11     // Catch: java.lang.Exception -> L195
            int r11 = r11.getBaseStationLatitude()     // Catch: java.lang.Exception -> L195
            r3 = 4669142098048450560(0x40cc200000000000, double:14400.0)
            if (r1 == 0) goto L163
            boolean r5 = a.a.a.g.m.a.f311b     // Catch: java.lang.Exception -> L195
            if (r5 == 0) goto L163
            a.a.a.g.e r5 = a.a.a.g.g.h()     // Catch: java.lang.Exception -> L195
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L195
            r6.<init>()     // Catch: java.lang.Exception -> L195
            java.lang.String r7 = "bslocation lat "
            r6.append(r7)     // Catch: java.lang.Exception -> L195
            double r7 = (double) r11     // Catch: java.lang.Exception -> L195
            double r7 = r7 / r3
            r6.append(r7)     // Catch: java.lang.Exception -> L195
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> L195
            r5.a(r6)     // Catch: java.lang.Exception -> L195
        L163:
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r11 >= r5) goto L16a
            r0.e = r11     // Catch: java.lang.Exception -> L195
        L16a:
            android.telephony.cdma.CdmaCellLocation r10 = (android.telephony.cdma.CdmaCellLocation) r10     // Catch: java.lang.Exception -> L195
            int r10 = r10.getBaseStationLongitude()     // Catch: java.lang.Exception -> L195
            if (r1 == 0) goto L190
            boolean r11 = a.a.a.g.m.a.f311b     // Catch: java.lang.Exception -> L195
            if (r11 == 0) goto L190
            a.a.a.g.e r11 = a.a.a.g.g.h()     // Catch: java.lang.Exception -> L195
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L195
            r1.<init>()     // Catch: java.lang.Exception -> L195
            java.lang.String r6 = "bslocation lon"
            r1.append(r6)     // Catch: java.lang.Exception -> L195
            double r6 = (double) r10     // Catch: java.lang.Exception -> L195
            double r6 = r6 / r3
            r1.append(r6)     // Catch: java.lang.Exception -> L195
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L195
            r11.a(r1)     // Catch: java.lang.Exception -> L195
        L190:
            if (r10 >= r5) goto L1a0
            r0.f = r10     // Catch: java.lang.Exception -> L195
            goto L1a0
        L195:
            r9 = move-exception
            boolean r10 = a.a.a.g.m.a.f310a
            if (r10 == 0) goto L19d
            r9.printStackTrace()
        L19d:
            a.a.a.g.l.a.H = r2
            return r0
        L1a0:
            r9.g(r0)
            return r0
        L1a4:
            return r11
    }

    @android.annotation.SuppressLint({"NewApi"})
    public final java.lang.String a(a.a.a.g.a r10) {
            r9 = this;
            java.lang.String r10 = "|"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r1 = r1.intValue()
            r2 = 0
            r3 = 17
            if (r1 < r3) goto Ldb
            android.telephony.TelephonyManager r1 = r9.h     // Catch: java.lang.Throwable -> Ld3
            java.util.List r1 = r1.getAllCellInfo()     // Catch: java.lang.Throwable -> Ld3
            if (r1 == 0) goto Lc1
            int r3 = r1.size()     // Catch: java.lang.Throwable -> Ld3
            if (r3 <= 0) goto Lc1
            java.lang.String r3 = "&nc="
            r0.append(r3)     // Catch: java.lang.Throwable -> Ld3
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Ld3
        L2d:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> Ld3
            if (r3 == 0) goto Ldb
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> Ld3
            android.telephony.CellInfo r3 = (android.telephony.CellInfo) r3     // Catch: java.lang.Throwable -> Ld3
            boolean r4 = r3.isRegistered()     // Catch: java.lang.Throwable -> Ld3
            if (r4 == 0) goto L40
            goto L2d
        L40:
            a.a.a.g.a r4 = r9.l     // Catch: java.lang.Throwable -> Ld3
            android.telephony.TelephonyManager r5 = r9.h     // Catch: java.lang.Throwable -> Ld3
            a.a.a.g.a r3 = r9.a(r3, r4, r5)     // Catch: java.lang.Throwable -> Ld3
            if (r3 != 0) goto L4b
            goto L2d
        L4b:
            int r4 = r3.f254a     // Catch: java.lang.Throwable -> Ld3
            r5 = -1
            java.lang.String r6 = ";"
            if (r4 == r5) goto L82
            long r4 = r3.f255b     // Catch: java.lang.Throwable -> Ld3
            r7 = -1
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 == 0) goto L82
            int r4 = r3.f256c     // Catch: java.lang.Throwable -> Ld3
            r0.append(r4)     // Catch: java.lang.Throwable -> Ld3
            r0.append(r10)     // Catch: java.lang.Throwable -> Ld3
            int r4 = r3.d     // Catch: java.lang.Throwable -> Ld3
            r0.append(r4)     // Catch: java.lang.Throwable -> Ld3
            r0.append(r10)     // Catch: java.lang.Throwable -> Ld3
            int r4 = r3.f254a     // Catch: java.lang.Throwable -> Ld3
            r0.append(r4)     // Catch: java.lang.Throwable -> Ld3
            r0.append(r10)     // Catch: java.lang.Throwable -> Ld3
            long r4 = r3.f255b     // Catch: java.lang.Throwable -> Ld3
            r0.append(r4)     // Catch: java.lang.Throwable -> Ld3
            r0.append(r10)     // Catch: java.lang.Throwable -> Ld3
            int r4 = r3.h     // Catch: java.lang.Throwable -> Ld3
            r0.append(r4)     // Catch: java.lang.Throwable -> Ld3
            r0.append(r6)     // Catch: java.lang.Throwable -> Ld3
        L82:
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Ld3
            r5 = 28
            if (r4 <= r5) goto L2d
            int r4 = r3.k     // Catch: java.lang.Throwable -> Ld3
            r5 = 6
            if (r4 != r5) goto L2d
            java.lang.String r4 = r3.o     // Catch: java.lang.Throwable -> Ld3
            if (r4 == 0) goto L2d
            boolean r4 = r3.e()     // Catch: java.lang.Throwable -> Ld3
            if (r4 == 0) goto L2d
            if (r2 != 0) goto La7
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld3
            r4.<init>()     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r2 = "&ncnr="
            r4.append(r2)     // Catch: java.lang.Throwable -> La5
            r2 = r4
            goto La7
        La5:
            r9 = move-exception
            goto Lbf
        La7:
            java.lang.String r4 = r9.f(r3)     // Catch: java.lang.Throwable -> Lbd
            r2.append(r4)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r4 = "_"
            r2.append(r4)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r3 = r3.o     // Catch: java.lang.Throwable -> Lbd
            r2.append(r3)     // Catch: java.lang.Throwable -> Lbd
            r2.append(r6)     // Catch: java.lang.Throwable -> Lbd
            goto L2d
        Lbd:
            r9 = move-exception
            r4 = r2
        Lbf:
            r2 = r4
            goto Ld4
        Lc1:
            boolean r9 = a.a.a.g.m.a.f310a     // Catch: java.lang.Throwable -> Ld3
            if (r9 == 0) goto Ldb
            boolean r9 = a.a.a.g.m.a.f311b     // Catch: java.lang.Throwable -> Ld3
            if (r9 == 0) goto Ldb
            a.a.a.g.e r9 = a.a.a.g.g.h()     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r10 = "getAllCellInfo = null"
            r9.a(r10)     // Catch: java.lang.Throwable -> Ld3
            goto Ldb
        Ld3:
            r9 = move-exception
        Ld4:
            boolean r10 = a.a.a.g.m.a.f310a
            if (r10 == 0) goto Ldb
            r9.printStackTrace()
        Ldb:
            if (r2 == 0) goto Lf5
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r0.toString()
            r9.append(r10)
            java.lang.String r10 = r2.toString()
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            return r9
        Lf5:
            java.lang.String r9 = r0.toString()
            return r9
    }

    public final void a() {
            r2 = this;
            android.os.Handler r0 = r2.C
            a.a.a.g.l.a$a r1 = new a.a.a.g.l.a$a
            r1.<init>(r2)
            r0.post(r1)
            return
    }

    public void a(android.content.Context r4) {
            r3 = this;
            boolean r0 = r3.u
            if (r0 == 0) goto L5
            return
        L5:
            r3.t = r4
            java.lang.String r0 = "phone"
            java.lang.Object r4 = r4.getSystemService(r0)
            android.telephony.TelephonyManager r4 = (android.telephony.TelephonyManager) r4
            r3.h = r4
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            r3.n = r4
            android.os.Looper r4 = android.os.Looper.myLooper()
            if (r4 == 0) goto L25
            a.a.a.g.l.a$e r4 = new a.a.a.g.l.a$e
            r4.<init>(r3)
            r3.p = r4
        L25:
            android.os.Handler r4 = r3.C
            if (r4 != 0) goto L34
            android.os.Handler r4 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r4.<init>(r0)
            r3.C = r4
        L34:
            boolean r4 = r3.g
            if (r4 == 0) goto L3b
            r3.c()
        L3b:
            int r4 = android.os.Build.VERSION.SDK_INT
            int r0 = r3.f298c
            if (r4 < r0) goto L77
            java.util.concurrent.Executor r0 = r3.o
            if (r0 != 0) goto L4d
            android.content.Context r0 = r3.t
            java.util.concurrent.Executor r0 = r0.getMainExecutor()
            r3.o = r0
        L4d:
            java.lang.String r0 = "android.telephony.TelephonyManager$CellInfoCallback"
            boolean r0 = a.a.a.g.m.b.a(r0)
            r3.w = r0
            boolean r0 = a.a.a.g.m.a.f310a
            if (r0 == 0) goto L77
            boolean r0 = a.a.a.g.m.a.f311b
            if (r0 == 0) goto L77
            a.a.a.g.e r0 = a.a.a.g.g.h()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "isCellinfoCallbackExist = "
            r1.append(r2)
            boolean r2 = r3.w
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.a(r1)
        L77:
            android.telephony.TelephonyManager r0 = r3.h
            if (r0 == 0) goto La1
            a.a.a.g.l.a$e r1 = r3.p
            if (r1 != 0) goto L80
            goto La1
        L80:
            int r2 = r3.f298c
            if (r4 < r2) goto L88
            boolean r4 = r3.w
            if (r4 != 0) goto L8d
        L88:
            r4 = 1280(0x500, float:1.794E-42)
            r0.listen(r1, r4)     // Catch: java.lang.Exception -> L8d
        L8d:
            boolean r4 = a.a.a.g.m.a.f310a
            if (r4 == 0) goto L9e
            boolean r4 = a.a.a.g.m.a.f311b
            if (r4 == 0) goto L9e
            a.a.a.g.e r4 = a.a.a.g.g.h()
            java.lang.String r0 = "cell manager start..."
            r4.a(r0)
        L9e:
            r4 = 1
            r3.u = r4
        La1:
            return
    }

    public void a(boolean r1) {
            r0 = this;
            r0.f = r1
            return
    }

    public boolean a(a.a.a.g.a r9, a.a.a.g.a r10) {
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L6
            if (r10 != 0) goto L6
            return r0
        L6:
            r1 = 1
            if (r9 == 0) goto Lb6
            if (r10 != 0) goto Ld
            goto Lb6
        Ld:
            int r2 = r9.h
            int r3 = r10.h
            int r2 = r2 - r3
            int r2 = java.lang.Math.abs(r2)
            float r2 = (float) r2
            int r3 = r9.h
            r4 = -1
            if (r3 == 0) goto L1d
            goto L1e
        L1d:
            r3 = r4
        L1e:
            float r3 = (float) r3
            float r2 = r2 / r3
            boolean r3 = a.a.a.g.m.a.f310a
            if (r3 == 0) goto L64
            boolean r5 = a.a.a.g.m.a.f311b
            if (r5 == 0) goto L64
            a.a.a.g.e r5 = a.a.a.g.g.h()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "cl-cache, str, old:"
            r6.append(r7)
            int r7 = r9.h
            r6.append(r7)
            java.lang.String r7 = " new:"
            r6.append(r7)
            int r7 = r10.h
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.a(r6)
            a.a.a.g.e r5 = a.a.a.g.g.h()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "cl-cache, str, diffRate:"
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            r5.a(r6)
        L64:
            java.lang.String r9 = r9.m
            if (r9 == 0) goto L8d
            java.lang.String r5 = r10.m
            if (r5 == 0) goto L8d
            int r9 = r8.a(r9)
            java.lang.String r10 = r10.m
            int r10 = r8.a(r10)
            int r10 = r9 - r10
            int r10 = java.lang.Math.abs(r10)
            if (r9 == 0) goto L7f
            r4 = r9
        L7f:
            int r10 = r10 / r4
            int r9 = java.lang.Math.abs(r10)
            float r9 = (float) r9
            float r10 = r8.e
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 <= 0) goto L8d
            r9 = r1
            goto L8e
        L8d:
            r9 = r0
        L8e:
            if (r3 == 0) goto Lac
            boolean r10 = a.a.a.g.m.a.f311b
            if (r10 == 0) goto Lac
            a.a.a.g.e r10 = a.a.a.g.g.h()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "cl-cache, isStrengthChange2:"
            r3.append(r4)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            r10.a(r3)
        Lac:
            float r8 = r8.e
            int r8 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r8 > 0) goto Lb4
            if (r9 == 0) goto Lb5
        Lb4:
            r0 = r1
        Lb5:
            return r0
        Lb6:
            return r1
    }

    public a.a.a.g.a b(a.a.a.g.a r9, android.telephony.TelephonyManager r10) {
            r8 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = r0.intValue()
            r1 = 0
            r2 = 17
            if (r0 >= r2) goto L10
            return r1
        L10:
            int r0 = r10.getSimState()     // Catch: java.lang.Throwable -> La9
            r8.v = r0     // Catch: java.lang.Throwable -> La9
            java.util.List r0 = r10.getAllCellInfo()     // Catch: java.lang.Throwable -> La9
            if (r0 == 0) goto L97
            int r2 = r0.size()     // Catch: java.lang.Throwable -> La9
            if (r2 <= 0) goto L97
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> La9
            r2 = r1
        L27:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> La9
            if (r3 == 0) goto L95
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> La9
            android.telephony.CellInfo r3 = (android.telephony.CellInfo) r3     // Catch: java.lang.Throwable -> La9
            boolean r4 = r3.isRegistered()     // Catch: java.lang.Throwable -> La9
            if (r4 == 0) goto L27
            r4 = 0
            if (r2 == 0) goto L3d
            r4 = 1
        L3d:
            a.a.a.g.a r3 = r8.a(r3, r9, r10)     // Catch: java.lang.Throwable -> La9
            if (r3 != 0) goto L44
            goto L27
        L44:
            boolean r5 = r3.e()     // Catch: java.lang.Throwable -> La9
            if (r5 != 0) goto L5d
            boolean r3 = a.a.a.g.m.a.f310a     // Catch: java.lang.Throwable -> La9
            if (r3 == 0) goto L5b
            boolean r3 = a.a.a.g.m.a.f311b     // Catch: java.lang.Throwable -> La9
            if (r3 == 0) goto L5b
            a.a.a.g.e r3 = a.a.a.g.g.h()     // Catch: java.lang.Throwable -> La9
            java.lang.String r4 = "res.isValid()"
            r3.a(r4)     // Catch: java.lang.Throwable -> La9
        L5b:
            r3 = r1
            goto L91
        L5d:
            boolean r5 = a.a.a.g.m.a.f310a     // Catch: java.lang.Throwable -> La9
            if (r5 == 0) goto L81
            boolean r5 = a.a.a.g.m.a.f311b     // Catch: java.lang.Throwable -> La9
            if (r5 == 0) goto L81
            a.a.a.g.e r5 = a.a.a.g.g.h()     // Catch: java.lang.Throwable -> La9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La9
            r6.<init>()     // Catch: java.lang.Throwable -> La9
            java.lang.String r7 = " cell res.isValid() = "
            r6.append(r7)     // Catch: java.lang.Throwable -> La9
            java.lang.String r7 = r8.f(r3)     // Catch: java.lang.Throwable -> La9
            r6.append(r7)     // Catch: java.lang.Throwable -> La9
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> La9
            r5.a(r6)     // Catch: java.lang.Throwable -> La9
        L81:
            if (r4 == 0) goto L91
            if (r2 == 0) goto L91
            java.lang.String r4 = r8.e(r3)     // Catch: java.lang.Throwable -> La9
            r2.m = r4     // Catch: java.lang.Throwable -> La9
            java.lang.String r4 = r8.f(r3)     // Catch: java.lang.Throwable -> La9
            r2.n = r4     // Catch: java.lang.Throwable -> La9
        L91:
            if (r2 != 0) goto L27
            r2 = r3
            goto L27
        L95:
            r1 = r2
            goto Lb1
        L97:
            boolean r8 = a.a.a.g.m.a.f310a     // Catch: java.lang.Throwable -> La9
            if (r8 == 0) goto Lb1
            boolean r8 = a.a.a.g.m.a.f311b     // Catch: java.lang.Throwable -> La9
            if (r8 == 0) goto Lb1
            a.a.a.g.e r8 = a.a.a.g.g.h()     // Catch: java.lang.Throwable -> La9
            java.lang.String r9 = "getAllCellInfo=null"
            r8.a(r9)     // Catch: java.lang.Throwable -> La9
            goto Lb1
        La9:
            r8 = move-exception
            boolean r9 = a.a.a.g.m.a.f310a
            if (r9 == 0) goto Lb1
            r8.printStackTrace()
        Lb1:
            return r1
    }

    public java.lang.String b(a.a.a.g.a r13) {
            r12 = this;
            java.lang.String r0 = "|"
            if (r13 != 0) goto L6
            r12 = 0
            return r12
        L6:
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r2 = 128(0x80, float:1.8E-43)
            r1.<init>(r2)
            java.lang.String r2 = "&nw="
            r1.append(r2)
            char r2 = r13.i
            r1.append(r2)
            java.util.Locale r2 = java.util.Locale.CHINA
            r3 = 5
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r13.f256c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 0
            r3[r5] = r4
            int r4 = r13.d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6 = 1
            r3[r6] = r4
            int r4 = r13.f254a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7 = 2
            r3[r7] = r4
            long r8 = r13.f255b
            java.lang.Long r4 = java.lang.Long.valueOf(r8)
            r8 = 3
            r3[r8] = r4
            int r4 = r13.h
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r8 = 4
            r3[r8] = r4
            java.lang.String r4 = "&cl=%d|%d|%d|%d&cl_s=%d"
            java.lang.String r2 = java.lang.String.format(r2, r4, r3)
            r1.append(r2)
            int r2 = r13.e
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r2 >= r3) goto L81
            int r2 = r13.f
            if (r2 >= r3) goto L81
            java.util.Locale r4 = java.util.Locale.CHINA
            java.lang.Object[] r7 = new java.lang.Object[r7]
            double r8 = (double) r2
            r10 = 4669142098048450560(0x40cc200000000000, double:14400.0)
            double r8 = r8 / r10
            java.lang.Double r2 = java.lang.Double.valueOf(r8)
            r7[r5] = r2
            int r2 = r13.e
            double r8 = (double) r2
            double r8 = r8 / r10
            java.lang.Double r2 = java.lang.Double.valueOf(r8)
            r7[r6] = r2
            java.lang.String r2 = "&cdmall=%.6f|%.6f"
            java.lang.String r2 = java.lang.String.format(r4, r2, r7)
            r1.append(r2)
        L81:
            java.lang.String r2 = "&cl_t="
            r1.append(r2)
            long r6 = r13.g
            r1.append(r6)
            java.lang.String r2 = "&cl_api="
            r1.append(r2)
            int r2 = r13.l
            r1.append(r2)
            java.lang.String r2 = "&clp="
            r1.append(r2)
            int r2 = r13.k
            r1.append(r2)
            java.lang.String r2 = r13.o
            if (r2 == 0) goto Lad
            java.lang.String r2 = "&clnrs="
            r1.append(r2)
            java.lang.String r2 = r13.o
            r1.append(r2)
        Lad:
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r2 < r4) goto Lc1
            int r2 = r13.j
            if (r2 == r3) goto Lc1
            java.lang.String r2 = "&cl_cs="
            r1.append(r2)
            int r2 = r13.j
            r1.append(r2)
        Lc1:
            java.util.List<a.a.a.g.a> r2 = r12.n     // Catch: java.lang.Exception -> L12a
            if (r2 == 0) goto L132
            int r2 = r2.size()     // Catch: java.lang.Exception -> L12a
            if (r2 <= 0) goto L132
            java.util.List<a.a.a.g.a> r2 = r12.n     // Catch: java.lang.Exception -> L12a
            int r2 = r2.size()     // Catch: java.lang.Exception -> L12a
            java.lang.String r3 = "&clt="
            r1.append(r3)     // Catch: java.lang.Exception -> L12a
            r3 = r5
        Ld7:
            if (r3 >= r2) goto L132
            java.util.List<a.a.a.g.a> r4 = r12.n     // Catch: java.lang.Exception -> L12a
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Exception -> L12a
            a.a.a.g.a r4 = (a.a.a.g.a) r4     // Catch: java.lang.Exception -> L12a
            if (r4 == 0) goto L127
            int r6 = r4.f256c     // Catch: java.lang.Exception -> L12a
            int r7 = r13.f256c     // Catch: java.lang.Exception -> L12a
            if (r6 == r7) goto Lec
            r1.append(r6)     // Catch: java.lang.Exception -> L12a
        Lec:
            r1.append(r0)     // Catch: java.lang.Exception -> L12a
            int r6 = r4.d     // Catch: java.lang.Exception -> L12a
            int r7 = r13.d     // Catch: java.lang.Exception -> L12a
            if (r6 == r7) goto Lf8
            r1.append(r6)     // Catch: java.lang.Exception -> L12a
        Lf8:
            r1.append(r0)     // Catch: java.lang.Exception -> L12a
            int r6 = r4.f254a     // Catch: java.lang.Exception -> L12a
            int r7 = r13.f254a     // Catch: java.lang.Exception -> L12a
            if (r6 == r7) goto L104
            r1.append(r6)     // Catch: java.lang.Exception -> L12a
        L104:
            r1.append(r0)     // Catch: java.lang.Exception -> L12a
            long r6 = r4.f255b     // Catch: java.lang.Exception -> L12a
            long r8 = r13.f255b     // Catch: java.lang.Exception -> L12a
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 == 0) goto L112
            r1.append(r6)     // Catch: java.lang.Exception -> L12a
        L112:
            r1.append(r0)     // Catch: java.lang.Exception -> L12a
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L12a
            long r8 = r4.g     // Catch: java.lang.Exception -> L12a
            long r6 = r6 - r8
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r8
            r1.append(r6)     // Catch: java.lang.Exception -> L12a
            java.lang.String r4 = ";"
            r1.append(r4)     // Catch: java.lang.Exception -> L12a
        L127:
            int r3 = r3 + 1
            goto Ld7
        L12a:
            r0 = move-exception
            boolean r2 = a.a.a.g.m.a.f310a
            if (r2 == 0) goto L132
            r0.printStackTrace()
        L132:
            int r0 = r12.v
            r2 = 100
            if (r0 <= r2) goto L13a
            r12.v = r5
        L13a:
            int r0 = a.a.a.g.l.a.H
            int r0 = r0 << 8
            int r2 = r12.v
            int r2 = r2 + r0
            boolean r0 = a.a.a.g.m.a.f310a
            if (r0 == 0) goto L16b
            boolean r3 = a.a.a.g.m.a.f311b
            if (r3 == 0) goto L16b
            a.a.a.g.e r3 = a.a.a.g.g.h()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "sim state:"
            r4.append(r5)
            int r12 = r12.v
            r4.append(r12)
            java.lang.String r12 = ","
            r4.append(r12)
            r4.append(r2)
            java.lang.String r12 = r4.toString()
            r3.a(r12)
        L16b:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r3 = "&cs="
            r12.append(r3)
            r12.append(r2)
            java.lang.String r12 = r12.toString()
            r1.append(r12)
            java.lang.String r12 = r13.m
            if (r12 == 0) goto L186
            r1.append(r12)
        L186:
            if (r0 == 0) goto L1a8
            boolean r12 = a.a.a.g.m.a.f311b
            if (r12 == 0) goto L1a8
            a.a.a.g.e r12 = a.a.a.g.g.h()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "cell sb.toString() = "
            r13.append(r0)
            java.lang.String r0 = r1.toString()
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            r12.a(r13)
        L1a8:
            java.lang.String r12 = r1.toString()
            return r12
    }

    public void b(int r1) {
            r0 = this;
            r0.f298c = r1
            return
    }

    public void b(boolean r1) {
            r0 = this;
            r0.g = r1
            return
    }

    public boolean b() {
            r0 = this;
            boolean r0 = r0.B
            return r0
    }

    public java.lang.String c(a.a.a.g.a r4) {
            r3 = this;
            java.lang.String r0 = "&nc="
            java.lang.String r1 = ""
            java.lang.String r3 = r3.a(r4)     // Catch: java.lang.Throwable -> L28
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L28
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L28
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L28
            if (r3 == 0) goto L21
            boolean r2 = r1.equals(r3)     // Catch: java.lang.Throwable -> L28
            if (r2 != 0) goto L21
            boolean r1 = r0.equals(r3)     // Catch: java.lang.Throwable -> L28
            if (r1 != 0) goto L21
            return r3
        L21:
            r1 = 17
            if (r4 < r1) goto L26
            return r3
        L26:
            r1 = r3
            goto L2c
        L28:
            r3 = move-exception
            r3.printStackTrace()
        L2c:
            if (r1 == 0) goto L36
            boolean r3 = r0.equals(r1)
            if (r3 == 0) goto L36
            r3 = 0
            return r3
        L36:
            return r1
    }

    public final void c() {
            r21 = this;
            r0 = r21
            java.lang.String r1 = " "
            android.content.Context r2 = r0.t
            java.lang.String r2 = a.a.a.g.m.b.b(r2)
            if (r2 != 0) goto Ld
            return
        Ld:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = java.io.File.separator
            r3.append(r2)
            java.lang.String r2 = "lcvif2.dat"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.io.File r3 = new java.io.File
            r3.<init>(r2)
            boolean r2 = r3.exists()
            if (r2 == 0) goto L140
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> L135
            java.lang.String r4 = "rw"
            r2.<init>(r3, r4)     // Catch: java.lang.Exception -> L135
            r4 = 0
            r2.seek(r4)     // Catch: java.lang.Exception -> L135
            long r6 = r2.readLong()     // Catch: java.lang.Exception -> L135
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L135
            long r8 = r8 - r6
            r10 = 60000(0xea60, double:2.9644E-319)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 <= 0) goto L71
            boolean r0 = a.a.a.g.m.a.f310a     // Catch: java.lang.Exception -> L135
            if (r0 == 0) goto L6a
            boolean r0 = a.a.a.g.m.a.f311b     // Catch: java.lang.Exception -> L135
            if (r0 == 0) goto L6a
            a.a.a.g.e r0 = a.a.a.g.g.h()     // Catch: java.lang.Exception -> L135
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L135
            r1.<init>()     // Catch: java.lang.Exception -> L135
            java.lang.String r4 = "cellbuffer System.currentTimeMillis() - time > 1 *60 *1000"
            r1.append(r4)     // Catch: java.lang.Exception -> L135
            r1.append(r6)     // Catch: java.lang.Exception -> L135
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L135
            r0.a(r1)     // Catch: java.lang.Exception -> L135
        L6a:
            r2.close()     // Catch: java.lang.Exception -> L135
            r3.delete()     // Catch: java.lang.Exception -> L135
            return
        L71:
            r2.readInt()     // Catch: java.lang.Exception -> L135
            r7 = 0
        L75:
            r8 = 3
            if (r7 >= r8) goto L131
            long r8 = r2.readLong()     // Catch: java.lang.Exception -> L135
            int r14 = r2.readInt()     // Catch: java.lang.Exception -> L135
            int r15 = r2.readInt()     // Catch: java.lang.Exception -> L135
            int r11 = r2.readInt()     // Catch: java.lang.Exception -> L135
            long r12 = r2.readLong()     // Catch: java.lang.Exception -> L135
            int r10 = r2.readInt()     // Catch: java.lang.Exception -> L135
            boolean r19 = a.a.a.g.m.a.f310a     // Catch: java.lang.Exception -> L135
            if (r19 == 0) goto Lce
            boolean r16 = a.a.a.g.m.a.f311b     // Catch: java.lang.Exception -> L135
            if (r16 == 0) goto Lce
            a.a.a.g.e r6 = a.a.a.g.g.h()     // Catch: java.lang.Exception -> L135
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L135
            r4.<init>()     // Catch: java.lang.Exception -> L135
            java.lang.String r5 = "cellbuffer cell info = "
            r4.append(r5)     // Catch: java.lang.Exception -> L135
            r4.append(r8)     // Catch: java.lang.Exception -> L135
            r4.append(r1)     // Catch: java.lang.Exception -> L135
            r4.append(r14)     // Catch: java.lang.Exception -> L135
            r4.append(r1)     // Catch: java.lang.Exception -> L135
            r4.append(r15)     // Catch: java.lang.Exception -> L135
            r4.append(r1)     // Catch: java.lang.Exception -> L135
            r4.append(r11)     // Catch: java.lang.Exception -> L135
            r4.append(r1)     // Catch: java.lang.Exception -> L135
            r4.append(r12)     // Catch: java.lang.Exception -> L135
            r4.append(r1)     // Catch: java.lang.Exception -> L135
            r4.append(r10)     // Catch: java.lang.Exception -> L135
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L135
            r6.a(r4)     // Catch: java.lang.Exception -> L135
        Lce:
            r4 = 1
            if (r10 != r4) goto Ld4
            r5 = 103(0x67, float:1.44E-43)
            goto Ld5
        Ld4:
            r5 = 0
        Ld5:
            r6 = 2
            if (r10 != r6) goto Lda
            r5 = 99
        Lda:
            r17 = r5
            r5 = 0
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 != 0) goto Lf2
            if (r19 == 0) goto L12c
            boolean r4 = a.a.a.g.m.a.f311b     // Catch: java.lang.Exception -> L135
            if (r4 == 0) goto L12c
            a.a.a.g.e r4 = a.a.a.g.g.h()     // Catch: java.lang.Exception -> L135
            java.lang.String r8 = "loc cell time1 == 0"
        Lee:
            r4.a(r8)     // Catch: java.lang.Exception -> L135
            goto L12c
        Lf2:
            a.a.a.g.a r10 = new a.a.a.g.a     // Catch: java.lang.Exception -> L135
            r16 = 0
            r18 = -1
            r20 = r10
            r10.<init>(r11, r12, r14, r15, r16, r17, r18)     // Catch: java.lang.Exception -> L135
            r10.g = r8     // Catch: java.lang.Exception -> L135
            boolean r8 = r10.e()     // Catch: java.lang.Exception -> L135
            if (r8 == 0) goto L10c
            r0.B = r4     // Catch: java.lang.Exception -> L135
            java.util.List<a.a.a.g.a> r4 = r0.n     // Catch: java.lang.Exception -> L135
            r4.add(r10)     // Catch: java.lang.Exception -> L135
        L10c:
            if (r19 == 0) goto L12c
            boolean r4 = a.a.a.g.m.a.f311b     // Catch: java.lang.Exception -> L135
            if (r4 == 0) goto L12c
            a.a.a.g.e r4 = a.a.a.g.g.h()     // Catch: java.lang.Exception -> L135
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L135
            r8.<init>()     // Catch: java.lang.Exception -> L135
            java.lang.String r9 = "loc cell "
            r8.append(r9)     // Catch: java.lang.Exception -> L135
            java.lang.String r9 = r0.b(r10)     // Catch: java.lang.Exception -> L135
            r8.append(r9)     // Catch: java.lang.Exception -> L135
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> L135
            goto Lee
        L12c:
            int r7 = r7 + 1
            r4 = r5
            goto L75
        L131:
            r2.close()     // Catch: java.lang.Exception -> L135
            goto L140
        L135:
            r0 = move-exception
            boolean r1 = a.a.a.g.m.a.f310a
            if (r1 == 0) goto L13d
            r0.printStackTrace()
        L13d:
            r3.delete()
        L140:
            return
    }

    public void c(int r1) {
            r0 = this;
            r0.d = r1
            return
    }

    public java.util.HashSet<java.lang.String> d(a.a.a.g.a r11) {
            r10 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 17
            if (r1 < r2) goto L88
            android.telephony.TelephonyManager r1 = r10.h     // Catch: java.lang.Throwable -> L84
            java.util.List r1 = r1.getAllCellInfo()     // Catch: java.lang.Throwable -> L84
            if (r1 == 0) goto L78
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L84
            if (r2 <= 0) goto L78
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L84
        L1d:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L84
            if (r2 == 0) goto L88
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L84
            android.telephony.CellInfo r2 = (android.telephony.CellInfo) r2     // Catch: java.lang.Throwable -> L84
            boolean r3 = r2.isRegistered()     // Catch: java.lang.Throwable -> L84
            if (r3 == 0) goto L30
            goto L1d
        L30:
            a.a.a.g.a r3 = r10.l     // Catch: java.lang.Throwable -> L84
            android.telephony.TelephonyManager r4 = r10.h     // Catch: java.lang.Throwable -> L84
            a.a.a.g.a r2 = r10.a(r2, r3, r4)     // Catch: java.lang.Throwable -> L84
            if (r2 != 0) goto L3b
            goto L1d
        L3b:
            int r3 = r2.f254a     // Catch: java.lang.Throwable -> L84
            r4 = -1
            java.lang.String r5 = ""
            if (r3 == r4) goto L74
            long r6 = r2.f255b     // Catch: java.lang.Throwable -> L84 java.lang.Throwable -> L84
            r8 = -1
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 == 0) goto L74
            int r4 = r11.f254a     // Catch: java.lang.Throwable -> L84 java.lang.Throwable -> L84
            if (r4 == r3) goto L63
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84 java.lang.Throwable -> L84
            r3.<init>()     // Catch: java.lang.Throwable -> L84 java.lang.Throwable -> L84
            int r4 = r2.f254a     // Catch: java.lang.Throwable -> L84 java.lang.Throwable -> L84
            r3.append(r4)     // Catch: java.lang.Throwable -> L84 java.lang.Throwable -> L84
            java.lang.String r4 = "|"
            r3.append(r4)     // Catch: java.lang.Throwable -> L84 java.lang.Throwable -> L84
            long r4 = r2.f255b     // Catch: java.lang.Throwable -> L84 java.lang.Throwable -> L84
            r3.append(r4)     // Catch: java.lang.Throwable -> L84 java.lang.Throwable -> L84
            goto L70
        L63:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84 java.lang.Throwable -> L84
            r3.<init>()     // Catch: java.lang.Throwable -> L84 java.lang.Throwable -> L84
            long r6 = r2.f255b     // Catch: java.lang.Throwable -> L84 java.lang.Throwable -> L84
            r3.append(r6)     // Catch: java.lang.Throwable -> L84 java.lang.Throwable -> L84
            r3.append(r5)     // Catch: java.lang.Throwable -> L84 java.lang.Throwable -> L84
        L70:
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L84 java.lang.Throwable -> L84
        L74:
            r0.add(r5)     // Catch: java.lang.Throwable -> L84 java.lang.Throwable -> L84
            goto L1d
        L78:
            boolean r10 = a.a.a.g.m.a.f310a     // Catch: java.lang.Throwable -> L84 java.lang.Throwable -> L84
            if (r10 == 0) goto L88
            java.lang.String r10 = "getAllCellInfo"
            java.lang.String r11 = "=null"
            android.util.Log.d(r10, r11)     // Catch: java.lang.Throwable -> L84 java.lang.Throwable -> L84
            goto L88
        L84:
            r10 = move-exception
            r10.printStackTrace()
        L88:
            return r0
    }

    public final void d() {
            r2 = this;
            a.a.a.g.l.a$d r0 = r2.q
            if (r0 != 0) goto Lc
            a.a.a.g.l.a$d r0 = new a.a.a.g.l.a$d
            r1 = 0
            r0.<init>(r2, r1)
            r2.q = r0
        Lc:
            java.util.concurrent.Executor r0 = r2.o
            if (r0 == 0) goto L17
            android.telephony.TelephonyManager r1 = r2.h
            a.a.a.g.l.a$d r2 = r2.q
            r1.requestCellInfoUpdate(r0, r2)
        L17:
            return
    }

    public final java.lang.String e(a.a.a.g.a r5) {
            r4 = this;
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r0 = 128(0x80, float:1.8E-43)
            r4.<init>(r0)
            java.lang.String r0 = "&nw2="
            r4.append(r0)
            char r0 = r5.i
            r4.append(r0)
            java.util.Locale r0 = java.util.Locale.CHINA
            r1 = 7
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r2 = r5.f256c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            int r2 = r5.d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 1
            r1[r3] = r2
            int r2 = r5.f254a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 2
            r1[r3] = r2
            long r2 = r5.f255b
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 3
            r1[r3] = r2
            int r2 = r5.h
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 4
            r1[r3] = r2
            int r2 = r5.k
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 5
            r1[r3] = r2
            long r2 = r5.g
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 6
            r1[r3] = r2
            java.lang.String r2 = "&cl2=%d|%d|%d|%d&cl_s2=%d&clp2=%d&cl_t2=%d"
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            r4.append(r0)
            int r0 = r5.j
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L6f
            java.lang.String r0 = "&cl_cs2="
            r4.append(r0)
            int r0 = r5.j
            r4.append(r0)
        L6f:
            java.lang.String r0 = r5.o
            if (r0 == 0) goto L7d
            java.lang.String r0 = "&clnrs2="
            r4.append(r0)
            java.lang.String r5 = r5.o
            r4.append(r5)
        L7d:
            java.lang.String r4 = r4.toString()
            return r4
    }

    public final void e() {
            r8 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r8.x = r0
            boolean r0 = r8.f
            if (r0 != 0) goto Lc
            goto L108
        Lc:
            r0 = 0
            android.telephony.SubscriptionManager r1 = r8.k     // Catch: java.lang.Exception -> Lfe
            if (r1 != 0) goto L1d
            android.content.Context r1 = r8.t     // Catch: java.lang.Exception -> Lfe
            java.lang.String r2 = "telephony_subscription_service"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch: java.lang.Exception -> Lfe
            android.telephony.SubscriptionManager r1 = (android.telephony.SubscriptionManager) r1     // Catch: java.lang.Exception -> Lfe
            r8.k = r1     // Catch: java.lang.Exception -> Lfe
        L1d:
            android.telephony.SubscriptionManager r1 = r8.k     // Catch: java.lang.Exception -> Lfe
            int[] r1 = r1.getSubscriptionIds(r0)     // Catch: java.lang.Exception -> Lfe
            android.telephony.SubscriptionManager r2 = r8.k     // Catch: java.lang.Exception -> Lfe
            r3 = 1
            int[] r2 = r2.getSubscriptionIds(r3)     // Catch: java.lang.Exception -> Lfe
            r4 = -1
            if (r1 == 0) goto L33
            int r5 = r1.length     // Catch: java.lang.Exception -> Lfe
            if (r5 <= 0) goto L33
            r1 = r1[r0]     // Catch: java.lang.Exception -> Lfe
            goto L34
        L33:
            r1 = r4
        L34:
            if (r2 == 0) goto L3b
            int r5 = r2.length     // Catch: java.lang.Exception -> Lfe
            if (r5 <= 0) goto L3b
            r4 = r2[r0]     // Catch: java.lang.Exception -> Lfe
        L3b:
            boolean r2 = android.telephony.SubscriptionManager.isValidSubscriptionId(r1)     // Catch: java.lang.Exception -> Lfe
            if (r2 == 0) goto L4a
            boolean r2 = android.telephony.SubscriptionManager.isValidSubscriptionId(r4)     // Catch: java.lang.Exception -> Lfe
            if (r2 == 0) goto L4a
            r8.z = r3     // Catch: java.lang.Exception -> Lfe
            goto L4c
        L4a:
            r8.z = r0     // Catch: java.lang.Exception -> Lfe
        L4c:
            boolean r2 = a.a.a.g.m.a.f310a     // Catch: java.lang.Exception -> Lfe
            if (r2 == 0) goto L88
            boolean r2 = a.a.a.g.m.a.f311b     // Catch: java.lang.Exception -> Lfe
            if (r2 == 0) goto L88
            a.a.a.g.e r2 = a.a.a.g.g.h()     // Catch: java.lang.Exception -> Lfe
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lfe
            r5.<init>()     // Catch: java.lang.Exception -> Lfe
            java.lang.String r6 = "getCellInfo: subId0 = "
            r5.append(r6)     // Catch: java.lang.Exception -> Lfe
            r5.append(r1)     // Catch: java.lang.Exception -> Lfe
            java.lang.String r6 = ", subId1 = "
            r5.append(r6)     // Catch: java.lang.Exception -> Lfe
            r5.append(r4)     // Catch: java.lang.Exception -> Lfe
            java.lang.String r6 = ", mLastSubId0 = "
            r5.append(r6)     // Catch: java.lang.Exception -> Lfe
            int r6 = r8.D     // Catch: java.lang.Exception -> Lfe
            r5.append(r6)     // Catch: java.lang.Exception -> Lfe
            java.lang.String r6 = ", mLastSubId1 = "
            r5.append(r6)     // Catch: java.lang.Exception -> Lfe
            int r6 = r8.E     // Catch: java.lang.Exception -> Lfe
            r5.append(r6)     // Catch: java.lang.Exception -> Lfe
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> Lfe
            r2.a(r5)     // Catch: java.lang.Exception -> Lfe
        L88:
            boolean r2 = android.telephony.SubscriptionManager.isValidSubscriptionId(r1)     // Catch: java.lang.Exception -> Lfe
            r5 = 0
            if (r2 == 0) goto Lbf
            android.telephony.TelephonyManager r2 = r8.i     // Catch: java.lang.Exception -> Lfe
            if (r2 != 0) goto L9a
            android.telephony.TelephonyManager r2 = r8.h     // Catch: java.lang.Exception -> Lfe
        L95:
            android.telephony.TelephonyManager r2 = r2.createForSubscriptionId(r1)     // Catch: java.lang.Exception -> Lfe
            goto La3
        L9a:
            int r2 = r8.D     // Catch: java.lang.Exception -> Lfe
            if (r2 == r1) goto La5
            r8.i = r5     // Catch: java.lang.Exception -> Lfe
            android.telephony.TelephonyManager r2 = r8.h     // Catch: java.lang.Exception -> Lfe
            goto L95
        La3:
            r8.i = r2     // Catch: java.lang.Exception -> Lfe
        La5:
            a.a.a.g.l.a$b r2 = r8.r     // Catch: java.lang.Exception -> Lfe
            if (r2 != 0) goto Lb0
            a.a.a.g.l.a$b r2 = new a.a.a.g.l.a$b     // Catch: java.lang.Exception -> Lfe
            r2.<init>(r8, r5)     // Catch: java.lang.Exception -> Lfe
            r8.r = r2     // Catch: java.lang.Exception -> Lfe
        Lb0:
            android.telephony.TelephonyManager r2 = r8.i     // Catch: java.lang.Exception -> Lfe
            if (r2 == 0) goto Lc1
            java.util.concurrent.Executor r6 = r8.o     // Catch: java.lang.Exception -> Lfe
            if (r6 == 0) goto Lc1
            a.a.a.g.l.a$b r7 = r8.r     // Catch: java.lang.Exception -> Lfe
            r2.requestCellInfoUpdate(r6, r7)     // Catch: java.lang.Exception -> Lfe
            r0 = r3
            goto Lc1
        Lbf:
            r8.i = r5     // Catch: java.lang.Exception -> Lfe
        Lc1:
            boolean r2 = android.telephony.SubscriptionManager.isValidSubscriptionId(r4)     // Catch: java.lang.Exception -> Lfe
            if (r2 == 0) goto Lf7
            android.telephony.TelephonyManager r2 = r8.j     // Catch: java.lang.Exception -> Lfe
            if (r2 != 0) goto Ld2
            android.telephony.TelephonyManager r2 = r8.h     // Catch: java.lang.Exception -> Lfe
        Lcd:
            android.telephony.TelephonyManager r2 = r2.createForSubscriptionId(r4)     // Catch: java.lang.Exception -> Lfe
            goto Ldb
        Ld2:
            int r2 = r8.E     // Catch: java.lang.Exception -> Lfe
            if (r2 == r4) goto Ldd
            r8.j = r5     // Catch: java.lang.Exception -> Lfe
            android.telephony.TelephonyManager r2 = r8.h     // Catch: java.lang.Exception -> Lfe
            goto Lcd
        Ldb:
            r8.j = r2     // Catch: java.lang.Exception -> Lfe
        Ldd:
            a.a.a.g.l.a$c r2 = r8.s     // Catch: java.lang.Exception -> Lfe
            if (r2 != 0) goto Le8
            a.a.a.g.l.a$c r2 = new a.a.a.g.l.a$c     // Catch: java.lang.Exception -> Lfe
            r2.<init>(r8, r5)     // Catch: java.lang.Exception -> Lfe
            r8.s = r2     // Catch: java.lang.Exception -> Lfe
        Le8:
            android.telephony.TelephonyManager r2 = r8.j     // Catch: java.lang.Exception -> Lfe
            if (r2 == 0) goto Lf9
            java.util.concurrent.Executor r5 = r8.o     // Catch: java.lang.Exception -> Lfe
            if (r5 == 0) goto Lf9
            a.a.a.g.l.a$c r6 = r8.s     // Catch: java.lang.Exception -> Lfe
            r2.requestCellInfoUpdate(r5, r6)     // Catch: java.lang.Exception -> Lfe
            r0 = r3
            goto Lf9
        Lf7:
            r8.j = r5     // Catch: java.lang.Exception -> Lfe
        Lf9:
            r8.D = r1     // Catch: java.lang.Exception -> Lfe
            r8.E = r4     // Catch: java.lang.Exception -> Lfe
            goto L106
        Lfe:
            r1 = move-exception
            boolean r2 = a.a.a.g.m.a.f310a
            if (r2 == 0) goto L106
            r1.printStackTrace()
        L106:
            if (r0 != 0) goto L10b
        L108:
            r8.d()
        L10b:
            java.lang.Object r0 = r8.F
            monitor-enter(r0)
            boolean r1 = a.a.a.g.m.a.f310a     // Catch: java.lang.Throwable -> L12a java.lang.InterruptedException -> L12c
            if (r1 == 0) goto L11f
            boolean r1 = a.a.a.g.m.a.f311b     // Catch: java.lang.Throwable -> L12a java.lang.InterruptedException -> L12c
            if (r1 == 0) goto L11f
            a.a.a.g.e r1 = a.a.a.g.g.h()     // Catch: java.lang.Throwable -> L12a java.lang.InterruptedException -> L12c
            java.lang.String r2 = "start waiting update to finish"
            r1.a(r2)     // Catch: java.lang.Throwable -> L12a java.lang.InterruptedException -> L12c
        L11f:
            int r1 = r8.d     // Catch: java.lang.Throwable -> L12a java.lang.InterruptedException -> L12c
            if (r1 == 0) goto L134
            java.lang.Object r8 = r8.F     // Catch: java.lang.Throwable -> L12a java.lang.InterruptedException -> L12c
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L12a java.lang.InterruptedException -> L12c
            r8.wait(r1)     // Catch: java.lang.Throwable -> L12a java.lang.InterruptedException -> L12c
            goto L134
        L12a:
            r8 = move-exception
            goto L136
        L12c:
            r8 = move-exception
            boolean r1 = a.a.a.g.m.a.f310a     // Catch: java.lang.Throwable -> L12a
            if (r1 == 0) goto L134
            r8.printStackTrace()     // Catch: java.lang.Throwable -> L12a
        L134:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12a
            return
        L136:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12a
            throw r8
    }

    public final java.lang.String f(a.a.a.g.a r4) {
            r3 = this;
            java.util.Locale r3 = java.util.Locale.CHINA
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = r4.f256c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            int r1 = r4.d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            int r1 = r4.f254a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            long r1 = r4.f255b
            java.lang.Long r4 = java.lang.Long.valueOf(r1)
            r1 = 3
            r0[r1] = r4
            java.lang.String r4 = "%d|%d|%d|%d"
            java.lang.String r3 = java.lang.String.format(r3, r4, r0)
            return r3
    }

    public void f() {
            r3 = this;
            boolean r0 = r3.u
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            a.a.a.g.l.a$e r1 = r3.p     // Catch: java.lang.Exception -> L2b
            if (r1 == 0) goto L11
            android.telephony.TelephonyManager r2 = r3.h     // Catch: java.lang.Exception -> L2b
            if (r2 == 0) goto L11
            r2.listen(r1, r0)     // Catch: java.lang.Exception -> L2b
        L11:
            r1 = 0
            r3.p = r1     // Catch: java.lang.Exception -> L2b
            r3.h = r1     // Catch: java.lang.Exception -> L2b
            r3.i = r1     // Catch: java.lang.Exception -> L2b
            r3.j = r1     // Catch: java.lang.Exception -> L2b
            java.util.List<a.a.a.g.a> r2 = r3.n     // Catch: java.lang.Exception -> L2b
            if (r2 == 0) goto L23
            r2.clear()     // Catch: java.lang.Exception -> L2b
            r3.n = r1     // Catch: java.lang.Exception -> L2b
        L23:
            boolean r1 = r3.g     // Catch: java.lang.Exception -> L2b
            if (r1 == 0) goto L33
            r3.h()     // Catch: java.lang.Exception -> L2b
            goto L33
        L2b:
            r1 = move-exception
            boolean r2 = a.a.a.g.m.a.f310a
            if (r2 == 0) goto L33
            r1.printStackTrace()
        L33:
            boolean r1 = a.a.a.g.m.a.f310a
            if (r1 == 0) goto L44
            boolean r1 = a.a.a.g.m.a.f311b
            if (r1 == 0) goto L44
            a.a.a.g.e r1 = a.a.a.g.g.h()
            java.lang.String r2 = "cell manager stop ..."
            r1.a(r2)
        L44:
            r3.u = r0
            return
    }

    public final synchronized void g() {
            r4 = this;
            monitor-enter(r4)
            a.a.a.g.a r0 = r4.l     // Catch: java.lang.Throwable -> L79
            android.telephony.TelephonyManager r1 = r4.h     // Catch: java.lang.Throwable -> L79
            a.a.a.g.a r0 = r4.b(r0, r1)     // Catch: java.lang.Throwable -> L79
            boolean r1 = a.a.a.g.m.a.f310a     // Catch: java.lang.Throwable -> L79
            if (r1 == 0) goto L2f
            boolean r1 = a.a.a.g.m.a.f311b     // Catch: java.lang.Throwable -> L79
            if (r1 == 0) goto L2f
            if (r0 == 0) goto L2f
            a.a.a.g.e r1 = a.a.a.g.g.h()     // Catch: java.lang.Throwable -> L79
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L79
            r2.<init>()     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = "new cell api = "
            r2.append(r3)     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = r4.f(r0)     // Catch: java.lang.Throwable -> L79
            r2.append(r3)     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L79
            r1.a(r2)     // Catch: java.lang.Throwable -> L79
        L2f:
            if (r0 == 0) goto L34
            r4.g(r0)     // Catch: java.lang.Throwable -> L79
        L34:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L79
            r2 = 28
            if (r1 > r2) goto L77
            if (r0 == 0) goto L42
            boolean r0 = r0.e()     // Catch: java.lang.Throwable -> L79
            if (r0 != 0) goto L77
        L42:
            r0 = 0
            android.telephony.TelephonyManager r1 = r4.h     // Catch: java.lang.Throwable -> L4a
            android.telephony.CellLocation r1 = r1.getCellLocation()     // Catch: java.lang.Throwable -> L4a
            goto L4b
        L4a:
            r1 = r0
        L4b:
            if (r1 == 0) goto L51
            a.a.a.g.a r0 = r4.a(r1)     // Catch: java.lang.Throwable -> L79
        L51:
            boolean r1 = a.a.a.g.m.a.f310a     // Catch: java.lang.Throwable -> L79
            if (r1 == 0) goto L77
            boolean r1 = a.a.a.g.m.a.f311b     // Catch: java.lang.Throwable -> L79
            if (r1 == 0) goto L77
            if (r0 == 0) goto L77
            a.a.a.g.e r1 = a.a.a.g.g.h()     // Catch: java.lang.Throwable -> L79
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L79
            r2.<init>()     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = " old cell api = "
            r2.append(r3)     // Catch: java.lang.Throwable -> L79
            java.lang.String r0 = r4.f(r0)     // Catch: java.lang.Throwable -> L79
            r2.append(r0)     // Catch: java.lang.Throwable -> L79
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L79
            r1.a(r0)     // Catch: java.lang.Throwable -> L79
        L77:
            monitor-exit(r4)
            return
        L79:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }

    public final void g(a.a.a.g.a r6) {
            r5 = this;
            a.a.a.g.a r0 = r5.l
            boolean r1 = r6.e()
            if (r1 == 0) goto L1c
            a.a.a.g.a r1 = r5.l
            if (r1 == 0) goto L1a
            boolean r1 = r1.a(r6)
            if (r1 == 0) goto L1a
            a.a.a.g.a r1 = r5.l
            boolean r1 = r5.a(r1, r6)
            if (r1 == 0) goto L1c
        L1a:
            r5.l = r6
        L1c:
            boolean r1 = r6.e()
            if (r1 == 0) goto L7d
            if (r0 == 0) goto L2a
            boolean r0 = r0.a(r6)
            if (r0 != 0) goto L7d
        L2a:
            boolean r6 = r6.e()
            if (r6 == 0) goto L76
            java.util.List<a.a.a.g.a> r6 = r5.n
            int r6 = r6.size()
            if (r6 != 0) goto L3a
            r6 = 0
            goto L44
        L3a:
            java.util.List<a.a.a.g.a> r0 = r5.n
            int r6 = r6 + (-1)
            java.lang.Object r6 = r0.get(r6)
            a.a.a.g.a r6 = (a.a.a.g.a) r6
        L44:
            if (r6 == 0) goto L56
            long r0 = r6.f255b
            a.a.a.g.a r2 = r5.l
            long r3 = r2.f255b
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L56
            int r6 = r6.f254a
            int r0 = r2.f254a
            if (r6 == r0) goto L7d
        L56:
            java.util.List<a.a.a.g.a> r6 = r5.n
            a.a.a.g.a r0 = r5.l
            r6.add(r0)
            java.util.List<a.a.a.g.a> r6 = r5.n
            int r6 = r6.size()
            r0 = 3
            r1 = 0
            if (r6 <= r0) goto L6c
            java.util.List<a.a.a.g.a> r6 = r5.n
            r6.remove(r1)
        L6c:
            boolean r6 = r5.g
            if (r6 == 0) goto L73
            r5.h()
        L73:
            r5.B = r1
            goto L7d
        L76:
            java.util.List<a.a.a.g.a> r5 = r5.n
            if (r5 == 0) goto L7d
            r5.clear()
        L7d:
            return
    }

    public final void h() {
            r9 = this;
            java.util.List<a.a.a.g.a> r0 = r9.n
            if (r0 != 0) goto L1a
            a.a.a.g.a r1 = r9.m
            if (r1 != 0) goto L1a
            boolean r9 = a.a.a.g.m.a.f310a
            if (r9 == 0) goto L19
            boolean r9 = a.a.a.g.m.a.f311b
            if (r9 == 0) goto L19
            a.a.a.g.e r9 = a.a.a.g.g.h()
            java.lang.String r0 = "cellbuffer mTrackList == null"
            r9.a(r0)
        L19:
            return
        L1a:
            if (r0 != 0) goto L2c
            a.a.a.g.a r0 = r9.m
            if (r0 == 0) goto L2c
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r9.n = r0
            a.a.a.g.a r1 = r9.m
            r0.add(r1)
        L2c:
            android.content.Context r0 = r9.t
            java.lang.String r0 = a.a.a.g.m.b.b(r0)
            if (r0 != 0) goto L35
            return
        L35:
            java.util.List<a.a.a.g.a> r1 = r9.n
            if (r1 == 0) goto L11e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = java.io.File.separator
            r1.append(r0)
            java.lang.String r0 = "lcvif2.dat"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            java.util.List<a.a.a.g.a> r0 = r9.n
            int r0 = r0.size()
            boolean r2 = r1.exists()     // Catch: java.lang.Exception -> L116
            if (r2 == 0) goto L63
            r1.delete()     // Catch: java.lang.Exception -> L116
        L63:
            r1.createNewFile()     // Catch: java.lang.Exception -> L116
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> L116
            java.lang.String r3 = "rw"
            r2.<init>(r1, r3)     // Catch: java.lang.Exception -> L116
            r3 = 0
            r2.seek(r3)     // Catch: java.lang.Exception -> L116
            java.util.List<a.a.a.g.a> r1 = r9.n     // Catch: java.lang.Exception -> L116
            int r5 = r0 + (-1)
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Exception -> L116
            a.a.a.g.a r1 = (a.a.a.g.a) r1     // Catch: java.lang.Exception -> L116
            long r5 = r1.g     // Catch: java.lang.Exception -> L116
            r2.writeLong(r5)     // Catch: java.lang.Exception -> L116
            r2.writeInt(r0)     // Catch: java.lang.Exception -> L116
            r1 = 0
            r5 = r1
        L86:
            r6 = 3
            int r7 = 3 - r0
            r8 = 2
            if (r5 >= r7) goto La4
            r2.writeLong(r3)     // Catch: java.lang.Exception -> L116
            r6 = -1
            r2.writeInt(r6)     // Catch: java.lang.Exception -> L116
            r2.writeInt(r6)     // Catch: java.lang.Exception -> L116
            r2.writeInt(r6)     // Catch: java.lang.Exception -> L116
            r6 = -1
            r2.writeLong(r6)     // Catch: java.lang.Exception -> L116
            r2.writeInt(r8)     // Catch: java.lang.Exception -> L116
            int r5 = r5 + 1
            goto L86
        La4:
            if (r1 >= r0) goto L112
            java.util.List<a.a.a.g.a> r3 = r9.n     // Catch: java.lang.Exception -> L116
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Exception -> L116
            a.a.a.g.a r3 = (a.a.a.g.a) r3     // Catch: java.lang.Exception -> L116
            long r3 = r3.g     // Catch: java.lang.Exception -> L116
            r2.writeLong(r3)     // Catch: java.lang.Exception -> L116
            java.util.List<a.a.a.g.a> r3 = r9.n     // Catch: java.lang.Exception -> L116
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Exception -> L116
            a.a.a.g.a r3 = (a.a.a.g.a) r3     // Catch: java.lang.Exception -> L116
            int r3 = r3.f256c     // Catch: java.lang.Exception -> L116
            r2.writeInt(r3)     // Catch: java.lang.Exception -> L116
            java.util.List<a.a.a.g.a> r3 = r9.n     // Catch: java.lang.Exception -> L116
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Exception -> L116
            a.a.a.g.a r3 = (a.a.a.g.a) r3     // Catch: java.lang.Exception -> L116
            int r3 = r3.d     // Catch: java.lang.Exception -> L116
            r2.writeInt(r3)     // Catch: java.lang.Exception -> L116
            java.util.List<a.a.a.g.a> r3 = r9.n     // Catch: java.lang.Exception -> L116
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Exception -> L116
            a.a.a.g.a r3 = (a.a.a.g.a) r3     // Catch: java.lang.Exception -> L116
            int r3 = r3.f254a     // Catch: java.lang.Exception -> L116
            r2.writeInt(r3)     // Catch: java.lang.Exception -> L116
            java.util.List<a.a.a.g.a> r3 = r9.n     // Catch: java.lang.Exception -> L116
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Exception -> L116
            a.a.a.g.a r3 = (a.a.a.g.a) r3     // Catch: java.lang.Exception -> L116
            long r3 = r3.f255b     // Catch: java.lang.Exception -> L116
            r2.writeLong(r3)     // Catch: java.lang.Exception -> L116
            java.util.List<a.a.a.g.a> r3 = r9.n     // Catch: java.lang.Exception -> L116
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Exception -> L116
            a.a.a.g.a r3 = (a.a.a.g.a) r3     // Catch: java.lang.Exception -> L116
            char r3 = r3.i     // Catch: java.lang.Exception -> L116
            r4 = 103(0x67, float:1.44E-43)
            if (r3 != r4) goto Lfa
            r3 = 1
            r2.writeInt(r3)     // Catch: java.lang.Exception -> L116
            goto L10f
        Lfa:
            java.util.List<a.a.a.g.a> r3 = r9.n     // Catch: java.lang.Exception -> L116
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Exception -> L116
            a.a.a.g.a r3 = (a.a.a.g.a) r3     // Catch: java.lang.Exception -> L116
            char r3 = r3.i     // Catch: java.lang.Exception -> L116
            r4 = 99
            if (r3 != r4) goto L10c
            r2.writeInt(r8)     // Catch: java.lang.Exception -> L116
            goto L10f
        L10c:
            r2.writeInt(r6)     // Catch: java.lang.Exception -> L116
        L10f:
            int r1 = r1 + 1
            goto La4
        L112:
            r2.close()     // Catch: java.lang.Exception -> L116
            goto L11e
        L116:
            r9 = move-exception
            boolean r0 = a.a.a.g.m.a.f310a
            if (r0 == 0) goto L11e
            r9.printStackTrace()
        L11e:
            return
    }
}
