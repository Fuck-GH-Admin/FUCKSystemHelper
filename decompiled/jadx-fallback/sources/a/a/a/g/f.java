package a.a.a.g;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.a.a.g.g f277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public android.telephony.TelephonyManager f278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public android.net.ConnectivityManager f279c;
    public android.net.wifi.WifiManager d;
    public android.os.Handler e;
    public java.lang.String f;
    public boolean g;
    public long h;
    public long i;
    public long j;
    public long k;

    public static /* synthetic */ class a {
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a.a.a.g.f f280a = null;

        static {
                a.a.a.g.f r0 = new a.a.a.g.f
                r0.<init>()
                a.a.a.g.f.b.f280a = r0
                return
        }

        public static /* synthetic */ a.a.a.g.f a() {
                a.a.a.g.f r0 = a.a.a.g.f.b.f280a
                return r0
        }
    }

    public class c extends a.a.a.g.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f281a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f282b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a.a.a.g.f f283c;

        public class a implements java.lang.Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ boolean f284b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a.a.a.g.f.c f285c;

            public a(a.a.a.g.f.c r1, boolean r2) {
                    r0 = this;
                    r0.f285c = r1
                    r0.f284b = r2
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r4 = this;
                    a.a.a.g.f$c r0 = r4.f285c
                    a.a.a.g.f r0 = r0.f283c
                    boolean r0 = a.a.a.g.f.b(r0)
                    if (r0 != 0) goto L13
                    a.a.a.g.f$c r0 = r4.f285c
                    a.a.a.g.f r0 = r0.f283c
                    boolean r4 = r4.f284b
                    a.a.a.g.f.a(r0, r4)
                L13:
                    a.a.a.b.o r4 = a.a.a.b.o.q()
                    r4.m()
                    a.a.a.d.i r4 = a.a.a.d.i.m()
                    boolean r4 = r4.f()
                    if (r4 == 0) goto L33
                    a.a.a.d.i r4 = a.a.a.d.i.m()
                    a.a.a.d.i$g r4 = r4.f
                    r0 = 41
                    android.os.Message r4 = r4.obtainMessage(r0)
                    r4.sendToTarget()
                L33:
                    long r0 = java.lang.System.currentTimeMillis()
                    long r2 = a.a.a.b.u.e()
                    long r0 = r0 - r2
                    r2 = 5000(0x1388, double:2.4703E-320)
                    int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r4 > 0) goto L49
                    a.a.a.b.z r4 = a.a.a.b.z.f()
                    r4.e()
                L49:
                    return
            }
        }

        public c(a.a.a.g.f r3) {
                r2 = this;
                r2.f283c = r3
                r2.<init>()
                r0 = 0
                r2.f281a = r0
                r3 = 0
                r2.f282b = r3
                return
        }

        @Override // a.a.a.g.e
        public void a(java.lang.String r1) {
                r0 = this;
                return
        }

        @Override // a.a.a.g.e
        public boolean a(android.content.Intent r8) {
                r7 = this;
                java.lang.String r0 = r8.getAction()
                java.lang.String r1 = "android.net.wifi.SCAN_RESULTS"
                boolean r1 = r0.equals(r1)
                r2 = 1
                if (r1 == 0) goto L37
                java.lang.String r0 = "resultsUpdated"
                boolean r8 = r8.getBooleanExtra(r0, r2)
                a.a.a.g.f r0 = r7.f283c
                long r3 = java.lang.System.currentTimeMillis()
                r5 = 1000(0x3e8, double:4.94E-321)
                long r3 = r3 / r5
                a.a.a.g.f.a(r0, r3)
                a.a.a.g.f r0 = r7.f283c
                android.os.Handler r0 = a.a.a.g.f.a(r0)
                if (r0 != 0) goto L28
                return r2
            L28:
                a.a.a.g.f r0 = r7.f283c
                android.os.Handler r0 = a.a.a.g.f.a(r0)
                a.a.a.g.f$c$a r1 = new a.a.a.g.f$c$a
                r1.<init>(r7, r8)
                r0.post(r1)
                goto L79
            L37:
                java.lang.String r1 = "android.net.wifi.STATE_CHANGE"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L79
                java.lang.String r0 = "networkInfo"
                android.os.Parcelable r8 = r8.getParcelableExtra(r0)
                android.net.NetworkInfo r8 = (android.net.NetworkInfo) r8
                android.net.NetworkInfo$State r8 = r8.getState()
                android.net.NetworkInfo$State r0 = android.net.NetworkInfo.State.CONNECTED
                boolean r8 = r8.equals(r0)
                r0 = 0
                if (r8 != 0) goto L55
                return r0
            L55:
                long r3 = java.lang.System.currentTimeMillis()
                long r5 = r7.f281a
                long r3 = r3 - r5
                r5 = 5000(0x1388, double:2.4703E-320)
                int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r8 >= 0) goto L63
                return r0
            L63:
                long r3 = java.lang.System.currentTimeMillis()
                r7.f281a = r3
                boolean r8 = r7.f282b
                if (r8 != 0) goto L70
                r7.f282b = r2
                return r0
            L70:
                a.a.a.g.f r7 = r7.f283c
                android.os.Handler r7 = a.a.a.g.f.a(r7)
                if (r7 != 0) goto L79
                return r0
            L79:
                return r2
        }

        @Override // a.a.a.g.e
        public boolean a(java.util.List<android.telephony.CellInfo> r1) {
                r0 = this;
                a.a.a.c.b r0 = a.a.a.c.b.g()
                r0.b()
                r0 = 1
                return r0
        }
    }

    public static class d implements java.util.Comparator<android.net.wifi.ScanResult> {
        public d() {
                r0 = this;
                r0.<init>()
                return
        }

        public int a(android.net.wifi.ScanResult r1, android.net.wifi.ScanResult r2) {
                r0 = this;
                int r0 = r2.level
                int r1 = r1.level
                int r0 = r0 - r1
                return r0
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(android.net.wifi.ScanResult r1, android.net.wifi.ScanResult r2) {
                r0 = this;
                android.net.wifi.ScanResult r1 = (android.net.wifi.ScanResult) r1
                android.net.wifi.ScanResult r2 = (android.net.wifi.ScanResult) r2
                int r0 = r0.a(r1, r2)
                return r0
        }
    }

    public static class e implements java.util.Comparator<a.a.a.g.h> {
        public e() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ e(a.a.a.g.f.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public int a(a.a.a.g.h r1, a.a.a.g.h r2) {
                r0 = this;
                int r0 = r1.g
                int r1 = r2.g
                int r0 = r0 - r1
                return r0
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(a.a.a.g.h r1, a.a.a.g.h r2) {
                r0 = this;
                a.a.a.g.h r1 = (a.a.a.g.h) r1
                a.a.a.g.h r2 = (a.a.a.g.h) r2
                int r0 = r0.a(r1, r2)
                return r0
        }
    }

    public f() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f279c = r0
            r2.d = r0
            r2.e = r0
            r2.f = r0
            r0 = 0
            r2.g = r0
            r0 = 0
            r2.h = r0
            r2.i = r0
            r2.j = r0
            r2.k = r0
            return
    }

    public static /* synthetic */ long a(a.a.a.g.f r0, long r1) {
            r0.i = r1
            return r1
    }

    public static /* synthetic */ android.os.Handler a(a.a.a.g.f r0) {
            android.os.Handler r0 = r0.e
            return r0
    }

    public static java.util.List<a.a.a.g.h> a(java.util.List<a.a.a.g.h> r3, int r4) {
            int r0 = r3.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r3.size()
            r2 = 1
            if (r0 != r2) goto L10
            return r3
        L10:
            int r0 = r3.size()
            java.util.List r0 = r3.subList(r2, r0)
            a.a.a.g.f$e r2 = new a.a.a.g.f$e
            r2.<init>(r1)
            java.util.Collections.sort(r0, r2)
            r3.size()
            int r0 = r3.size()
            int r4 = java.lang.Math.min(r0, r4)
            r0 = 0
            java.util.List r3 = r3.subList(r0, r4)
            return r3
    }

    public static /* synthetic */ boolean a(a.a.a.g.f r0, boolean r1) {
            r0.g = r1
            return r1
    }

    public static /* synthetic */ boolean b(a.a.a.g.f r0) {
            boolean r0 = r0.g
            return r0
    }

    public static a.a.a.g.f w() {
            a.a.a.g.f r0 = a.a.a.g.f.b.a()
            return r0
    }

    public int a(android.telephony.CellIdentityNr r1) {
            r0 = this;
            java.lang.String r0 = "getHwTac"
            int r0 = a.a.a.i.i.b(r1, r0)     // Catch: java.lang.Throwable -> L7
            goto L8
        L7:
            r0 = -1
        L8:
            return r0
    }

    @android.annotation.SuppressLint({"NewApi"})
    public long a(a.a.a.g.k r13) {
            r12 = this;
            java.util.List<android.net.wifi.ScanResult> r12 = r13.f295a
            r0 = 0
            if (r12 == 0) goto L68
            int r12 = r12.size()
            if (r12 != 0) goto Ld
            goto L68
        Ld:
            int r12 = android.os.Build.VERSION.SDK_INT
            r2 = 17
            r3 = 0
            if (r12 < r2) goto L23
            long r4 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Throwable -> L1c
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r6
            goto L1d
        L1c:
            r4 = r0
        L1d:
            int r12 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r12 <= 0) goto L24
            r12 = 1
            goto L25
        L23:
            r4 = r0
        L24:
            r12 = r3
        L25:
            if (r12 != 0) goto L28
            return r0
        L28:
            java.util.List<android.net.wifi.ScanResult> r2 = r13.f295a
            int r2 = r2.size()
            r6 = 16
            if (r2 <= r6) goto L33
            r2 = r6
        L33:
            r6 = r0
        L34:
            if (r3 >= r2) goto L67
            java.util.List<android.net.wifi.ScanResult> r8 = r13.f295a
            java.lang.Object r8 = r8.get(r3)
            if (r8 == 0) goto L64
            java.util.List<android.net.wifi.ScanResult> r8 = r13.f295a
            java.lang.Object r8 = r8.get(r3)
            android.net.wifi.ScanResult r8 = (android.net.wifi.ScanResult) r8
            int r8 = r8.level
            if (r8 != 0) goto L4b
            goto L64
        L4b:
            if (r12 == 0) goto L64
            java.util.List<android.net.wifi.ScanResult> r8 = r13.f295a     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r8 = r8.get(r3)     // Catch: java.lang.Throwable -> L5e
            android.net.wifi.ScanResult r8 = (android.net.wifi.ScanResult) r8     // Catch: java.lang.Throwable -> L5e
            long r8 = r8.timestamp     // Catch: java.lang.Throwable -> L5e
            long r8 = r4 - r8
            r10 = 1000000(0xf4240, double:4.940656E-318)
            long r8 = r8 / r10
            goto L5f
        L5e:
            r8 = r0
        L5f:
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 <= 0) goto L64
            r6 = r8
        L64:
            int r3 = r3 + 1
            goto L34
        L67:
            return r6
        L68:
            return r0
    }

    public synchronized a.a.a.g.a a() {
            r8 = this;
            monitor-enter(r8)
            r0 = 30000(0x7530, float:4.2039E-41)
            a.a.a.g.g r1 = r8.f277a     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L1d
            android.telephony.TelephonyManager r3 = r8.f278b     // Catch: java.lang.Throwable -> L20
            int r4 = a.a.a.i.i.B0     // Catch: java.lang.Throwable -> L20
            int[] r5 = a.a.a.i.i.C0     // Catch: java.lang.Throwable -> L20
            boolean r6 = a.a.a.i.i.D0     // Catch: java.lang.Throwable -> L20
            int r7 = a.a.a.i.i.E0     // Catch: java.lang.Throwable -> L20
            r2 = r8
            r2.a(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L20
            a.a.a.g.g r1 = r8.f277a     // Catch: java.lang.Throwable -> L20
            a.a.a.g.a r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r8)
            return r0
        L1d:
            r0 = 0
            monitor-exit(r8)
            return r0
        L20:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
    }

    public a.a.a.g.a a(a.a.a.g.a r1, android.telephony.TelephonyManager r2) {
            r0 = this;
            a.a.a.g.g r0 = r0.f277a
            if (r0 == 0) goto L9
            a.a.a.g.a r0 = r0.a(r1, r2)
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final a.a.a.g.h a(android.telephony.CellInfo r12, android.telephony.TelephonyManager r13) {
            r11 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 17
            if (r0 >= r2) goto L8
            return r1
        L8:
            boolean r2 = r12 instanceof android.telephony.CellInfoGsm
            r3 = 28
            r4 = 1000000(0xf4240, double:4.940656E-318)
            r6 = 30
            r7 = 1
            r8 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == 0) goto L89
            a.a.a.g.h r11 = new a.a.a.g.h
            r11.<init>()
            r13 = r12
            android.telephony.CellInfoGsm r13 = (android.telephony.CellInfoGsm) r13
            android.telephony.CellIdentityGsm r13 = r13.getCellIdentity()
            r11.f292a = r7
            boolean r2 = r12.isRegistered()
            if (r2 == 0) goto L2d
            r11.d = r7
        L2d:
            if (r0 < r3) goto L42
            java.lang.String r1 = r13.getMccString()
            r11.f293b = r1
            java.lang.String r13 = r13.getMncString()
            r11.f294c = r13
            int r13 = r12.getCellConnectionStatus()
            r11.f = r13
            goto L65
        L42:
            int r2 = r13.getMcc()
            if (r2 != r8) goto L4a
            r2 = r1
            goto L52
        L4a:
            int r2 = r13.getMcc()
            java.lang.String r2 = java.lang.String.valueOf(r2)
        L52:
            r11.f293b = r2
            int r2 = r13.getMnc()
            if (r2 != r8) goto L5b
            goto L63
        L5b:
            int r13 = r13.getMnc()
            java.lang.String r1 = java.lang.String.valueOf(r13)
        L63:
            r11.f294c = r1
        L65:
            if (r0 < r6) goto L76
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Error -> L86
            long r12 = r12.getTimestampMillis()     // Catch: java.lang.Error -> L86
            long r0 = r0 - r12
        L70:
            long r12 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Error -> L86
            long r12 = r12 - r0
            goto L81
        L76:
            long r0 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Error -> L86
            long r12 = r12.getTimeStamp()     // Catch: java.lang.Error -> L86
            long r0 = r0 - r12
            long r0 = r0 / r4
            goto L70
        L81:
            r11.e = r12     // Catch: java.lang.Error -> L86
            r1 = r11
            goto L360
        L86:
            r1 = r11
            goto L35a
        L89:
            boolean r2 = r12 instanceof android.telephony.CellInfoCdma
            r9 = 3
            if (r2 == 0) goto Lf1
            a.a.a.g.h r11 = new a.a.a.g.h
            r11.<init>()
            r2 = r12
            android.telephony.CellInfoCdma r2 = (android.telephony.CellInfoCdma) r2
            android.telephony.CellIdentityCdma r2 = r2.getCellIdentity()
            r10 = 2
            r11.f292a = r10
            int r10 = r2.getSystemId()
            if (r10 != r8) goto La4
            goto Lac
        La4:
            int r1 = r2.getSystemId()
            java.lang.String r1 = java.lang.String.valueOf(r1)
        Lac:
            r11.f294c = r1
            boolean r1 = r12.isRegistered()
            if (r1 == 0) goto Lb6
            r11.d = r7
        Lb6:
            if (r0 < r3) goto Lbe
            int r1 = r12.getCellConnectionStatus()
            r11.f = r1
        Lbe:
            java.lang.String r13 = r13.getNetworkOperator()     // Catch: java.lang.Exception -> Ld5
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Exception -> Ld5
            if (r1 != 0) goto Ld5
            int r1 = r13.length()     // Catch: java.lang.Exception -> Ld5
            if (r1 < r9) goto Ld5
            r1 = 0
            java.lang.String r13 = r13.substring(r1, r9)     // Catch: java.lang.Exception -> Ld5
            r11.f293b = r13     // Catch: java.lang.Exception -> Ld5
        Ld5:
            if (r0 < r6) goto Le6
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Error -> L86
            long r12 = r12.getTimestampMillis()     // Catch: java.lang.Error -> L86
            long r0 = r0 - r12
        Le0:
            long r12 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Error -> L86
            long r12 = r12 - r0
            goto L81
        Le6:
            long r0 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Error -> L86
            long r12 = r12.getTimeStamp()     // Catch: java.lang.Error -> L86
            long r0 = r0 - r12
            long r0 = r0 / r4
            goto Le0
        Lf1:
            boolean r13 = r12 instanceof android.telephony.CellInfoWcdma
            if (r13 == 0) goto L161
            a.a.a.g.h r11 = new a.a.a.g.h
            r11.<init>()
            r13 = r12
            android.telephony.CellInfoWcdma r13 = (android.telephony.CellInfoWcdma) r13
            android.telephony.CellIdentityWcdma r13 = r13.getCellIdentity()
            r2 = 4
            r11.f292a = r2
            boolean r2 = r12.isRegistered()
            if (r2 == 0) goto L10c
            r11.d = r7
        L10c:
            if (r0 < r3) goto L121
            java.lang.String r1 = r13.getMccString()
            r11.f293b = r1
            java.lang.String r13 = r13.getMncString()
            r11.f294c = r13
            int r13 = r12.getCellConnectionStatus()
            r11.f = r13
            goto L144
        L121:
            int r2 = r13.getMcc()
            if (r2 != r8) goto L129
            r2 = r1
            goto L131
        L129:
            int r2 = r13.getMcc()
            java.lang.String r2 = java.lang.String.valueOf(r2)
        L131:
            r11.f293b = r2
            int r2 = r13.getMnc()
            if (r2 != r8) goto L13a
            goto L142
        L13a:
            int r13 = r13.getMnc()
            java.lang.String r1 = java.lang.String.valueOf(r13)
        L142:
            r11.f294c = r1
        L144:
            if (r0 < r6) goto L156
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Error -> L86
            long r12 = r12.getTimestampMillis()     // Catch: java.lang.Error -> L86
            long r0 = r0 - r12
        L14f:
            long r12 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Error -> L86
            long r12 = r12 - r0
            goto L81
        L156:
            long r0 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Error -> L86
            long r12 = r12.getTimeStamp()     // Catch: java.lang.Error -> L86
            long r0 = r0 - r12
            long r0 = r0 / r4
            goto L14f
        L161:
            r13 = 29
            if (r0 < r13) goto L1b2
            boolean r2 = r12 instanceof android.telephony.CellInfoTdscdma
            if (r2 == 0) goto L1b2
            a.a.a.g.h r1 = new a.a.a.g.h
            r1.<init>()
            r11 = r12
            android.telephony.CellInfoTdscdma r11 = (android.telephony.CellInfoTdscdma) r11
            android.telephony.CellIdentityTdscdma r11 = r11.getCellIdentity()
            r13 = 5
            r1.f292a = r13
            boolean r13 = r12.isRegistered()
            if (r13 == 0) goto L180
            r1.d = r7
        L180:
            java.lang.String r13 = r11.getMccString()
            r1.f293b = r13
            java.lang.String r11 = r11.getMncString()
            r1.f294c = r11
            int r11 = r12.getCellConnectionStatus()
            r1.f = r11
            if (r0 < r6) goto L1a3
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Error -> L35a
            long r11 = r12.getTimestampMillis()     // Catch: java.lang.Error -> L35a
            long r2 = r2 - r11
        L19d:
            long r11 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Error -> L35a
        L1a1:
            long r11 = r11 - r2
            goto L1ae
        L1a3:
            long r2 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Error -> L35a
            long r11 = r12.getTimeStamp()     // Catch: java.lang.Error -> L35a
            long r2 = r2 - r11
            long r2 = r2 / r4
            goto L19d
        L1ae:
            r1.e = r11     // Catch: java.lang.Error -> L35a
            goto L360
        L1b2:
            boolean r2 = r12 instanceof android.telephony.CellInfoLte
            if (r2 == 0) goto L28b
            a.a.a.g.i r1 = new a.a.a.g.i
            r1.<init>()
            r2 = r12
            android.telephony.CellInfoLte r2 = (android.telephony.CellInfoLte) r2
            android.telephony.CellIdentityLte r10 = r2.getCellIdentity()
            android.telephony.CellSignalStrengthLte r2 = r2.getCellSignalStrength()
            r1.f292a = r9
            boolean r9 = r12.isRegistered()
            if (r9 == 0) goto L1d0
            r1.d = r7
        L1d0:
            int r7 = r10.getCi()
            r1.h = r7
            int r7 = r10.getPci()
            r1.i = r7
            int r7 = r10.getTac()
            r1.j = r7
            int r7 = r2.getTimingAdvance()
            r1.r = r7
            if (r0 < r3) goto L203
            java.lang.String r3 = r10.getMccString()
            r1.f293b = r3
            java.lang.String r3 = r10.getMncString()
            r1.f294c = r3
            int r3 = r12.getCellConnectionStatus()
            r1.f = r3
            int r3 = r10.getBandwidth()
            r1.l = r3
            goto L223
        L203:
            int r3 = r10.getMcc()
            if (r3 == r8) goto L213
            int r3 = r10.getMcc()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r1.f293b = r3
        L213:
            int r3 = r10.getMnc()
            if (r3 == r8) goto L223
            int r3 = r10.getMnc()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r1.f294c = r3
        L223:
            r3 = 24
            if (r0 < r3) goto L22d
            int r3 = r10.getEarfcn()
            r1.k = r3
        L22d:
            if (r0 < r13) goto L239
            int r13 = r2.getRssi()
            int r13 = java.lang.Math.abs(r13)
            r1.m = r13
        L239:
            r13 = 26
            if (r0 < r13) goto L26f
            int r13 = r2.getRsrp()
            int r13 = java.lang.Math.abs(r13)
            r1.n = r13
            int r13 = r2.getRsrp()
            int r13 = java.lang.Math.abs(r13)
            r1.g = r13
            int r13 = r2.getRsrq()
            r1.o = r13
            int r13 = r2.getRssnr()
            if (r13 != r8) goto L267
            boolean r3 = r12.isRegistered()
            if (r3 == 0) goto L267
            int r13 = r11.e()
        L267:
            r1.p = r13
            int r11 = r2.getCqi()
            r1.q = r11
        L26f:
            if (r0 < r6) goto L280
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Error -> L35a
            long r11 = r12.getTimestampMillis()     // Catch: java.lang.Error -> L35a
            long r2 = r2 - r11
        L27a:
            long r11 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Error -> L35a
            goto L1a1
        L280:
            long r2 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Error -> L35a
            long r11 = r12.getTimeStamp()     // Catch: java.lang.Error -> L35a
            long r2 = r2 - r11
            long r2 = r2 / r4
            goto L27a
        L28b:
            if (r0 < r13) goto L360
            boolean r13 = r12 instanceof android.telephony.CellInfoNr
            if (r13 == 0) goto L360
            a.a.a.g.j r13 = new a.a.a.g.j
            r13.<init>()
            r2 = r12
            android.telephony.CellInfoNr r2 = (android.telephony.CellInfoNr) r2     // Catch: java.lang.Throwable -> L2a1
            android.telephony.CellIdentity r2 = r2.getCellIdentity()     // Catch: java.lang.Throwable -> L2a1
            android.telephony.CellIdentityNr r2 = (android.telephony.CellIdentityNr) r2     // Catch: java.lang.Throwable -> L2a1
            r1 = r2
            goto L2a5
        L2a1:
            r2 = move-exception
            r2.printStackTrace()
        L2a5:
            r2 = r12
            android.telephony.CellInfoNr r2 = (android.telephony.CellInfoNr) r2
            android.telephony.CellSignalStrength r2 = r2.getCellSignalStrength()
            android.telephony.CellSignalStrengthNr r2 = (android.telephony.CellSignalStrengthNr) r2
            if (r1 == 0) goto L2ed
            r3 = 6
            r13.f292a = r3
            java.lang.String r3 = r1.getMccString()
            r13.f293b = r3
            java.lang.String r3 = r1.getMncString()
            r13.f294c = r3
            long r9 = r1.getNci()
            r13.h = r9
            int r3 = r1.getPci()
            r13.i = r3
            int r3 = r1.getTac()
            r13.j = r3
            if (r3 != r8) goto L2d9
            int r3 = r11.a(r1)     // Catch: java.lang.Throwable -> L2d9
            r13.j = r3     // Catch: java.lang.Throwable -> L2d9
        L2d9:
            int r3 = r13.j
            if (r3 != r8) goto L2e7
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L2e7
            int r11 = r11.b(r3)     // Catch: java.lang.Throwable -> L2e7
            r13.j = r11     // Catch: java.lang.Throwable -> L2e7
        L2e7:
            int r11 = r1.getNrarfcn()
            r13.k = r11
        L2ed:
            boolean r11 = r12.isRegistered()
            if (r11 == 0) goto L2f5
            r13.d = r7
        L2f5:
            int r11 = r12.getCellConnectionStatus()
            r13.f = r11
            int r11 = r2.getSsRsrp()
            int r11 = java.lang.Math.abs(r11)
            r13.l = r11
            int r11 = r2.getSsRsrp()
            int r11 = java.lang.Math.abs(r11)
            r13.g = r11
            int r11 = r2.getSsRsrq()
            int r11 = java.lang.Math.abs(r11)
            r13.m = r11
            int r11 = r2.getSsSinr()
            r13.n = r11
            int r11 = r2.getCsiRsrp()
            int r11 = java.lang.Math.abs(r11)
            r13.o = r11
            int r11 = r2.getCsiRsrq()
            int r11 = java.lang.Math.abs(r11)
            r13.p = r11
            int r11 = r2.getCsiSinr()
            r13.q = r11
            if (r0 < r6) goto L34a
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Error -> L359
            long r11 = r12.getTimestampMillis()     // Catch: java.lang.Error -> L359
            long r0 = r0 - r11
        L344:
            long r11 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Error -> L359
            long r11 = r11 - r0
            goto L355
        L34a:
            long r0 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Error -> L359
            long r11 = r12.getTimeStamp()     // Catch: java.lang.Error -> L359
            long r0 = r0 - r11
            long r0 = r0 / r4
            goto L344
        L355:
            r13.e = r11     // Catch: java.lang.Error -> L359
            r1 = r13
            goto L360
        L359:
            r1 = r13
        L35a:
            long r11 = java.lang.System.currentTimeMillis()
            r1.e = r11
        L360:
            return r1
    }

    public a.a.a.g.k a(int r1) {
            r0 = this;
            a.a.a.g.g r0 = r0.f277a
            if (r0 == 0) goto L9
            a.a.a.g.k r0 = r0.b(r1)
            return r0
        L9:
            r0 = 0
            return r0
    }

    public java.lang.String a(int r9, a.a.a.g.k r10) {
            r8 = this;
            if (r9 == 0) goto L7b
            int r0 = r10.c()
            r1 = 1
            if (r0 >= r1) goto Lb
            goto L7b
        Lb:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r2 = 256(0x100, float:3.59E-43)
            r0.<init>(r2)
            java.util.List<android.net.wifi.ScanResult> r2 = r10.f295a
            int r2 = r2.size()
            int r3 = a.a.a.i.i.L
            if (r2 <= r3) goto L1d
            r2 = r3
        L1d:
            r3 = 0
            r4 = r3
        L1f:
            if (r3 >= r2) goto L76
            java.util.List<android.net.wifi.ScanResult> r5 = r10.f295a
            java.lang.Object r5 = r5.get(r3)
            if (r5 != 0) goto L2a
            goto L73
        L2a:
            r5 = r1 & r9
            if (r5 == 0) goto L71
            java.util.List<android.net.wifi.ScanResult> r5 = r10.f295a
            java.lang.Object r5 = r5.get(r3)
            android.net.wifi.ScanResult r5 = (android.net.wifi.ScanResult) r5
            java.lang.String r5 = r5.BSSID
            if (r5 == 0) goto L71
            if (r4 != 0) goto L3f
            java.lang.String r5 = "&ssid="
            goto L41
        L3f:
            java.lang.String r5 = "|"
        L41:
            r0.append(r5)
            java.util.List<android.net.wifi.ScanResult> r5 = r10.f295a
            java.lang.Object r5 = r5.get(r3)
            android.net.wifi.ScanResult r5 = (android.net.wifi.ScanResult) r5
            java.lang.String r5 = r5.BSSID
            java.lang.String r6 = ":"
            java.lang.String r7 = ""
            java.lang.String r5 = r5.replace(r6, r7)
            r0.append(r5)
            java.lang.String r5 = ";"
            r0.append(r5)
            java.util.List<android.net.wifi.ScanResult> r5 = r10.f295a
            java.lang.Object r5 = r5.get(r3)
            android.net.wifi.ScanResult r5 = (android.net.wifi.ScanResult) r5
            java.lang.String r5 = r5.SSID
            java.lang.String r5 = r8.c(r5)
            r0.append(r5)
            int r4 = r4 + 1
        L71:
            int r1 = r1 << 1
        L73:
            int r3 = r3 + 1
            goto L1f
        L76:
            java.lang.String r8 = r0.toString()
            return r8
        L7b:
            r8 = 0
            return r8
    }

    public java.lang.String a(int r1, boolean r2, a.a.a.g.k r3, int r4) {
            r0 = this;
            a.a.a.g.g r0 = r0.f277a
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.a(r1, r2, r3, r4)
            return r0
        L9:
            r0 = 0
            return r0
    }

    public java.lang.String a(a.a.a.g.a r3) {
            r2 = this;
            a.a.a.g.g r0 = r2.f277a
            if (r0 == 0) goto L23
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            a.a.a.g.g r1 = r2.f277a
            java.lang.String r3 = r1.a(r3)
            r0.append(r3)
            java.lang.String r3 = "&cl_list="
            r0.append(r3)
            java.lang.String r2 = r2.b()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
        L23:
            r2 = 0
            return r2
    }

    public java.lang.String a(a.a.a.g.k r7, int r8, java.lang.String r9, boolean r10, int r11) {
            r6 = this;
            a.a.a.g.g r0 = r6.f277a
            if (r0 == 0) goto Le
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            java.lang.String r6 = r0.a(r1, r2, r3, r4, r5)
            return r6
        Le:
            r6 = 0
            return r6
    }

    public java.lang.String a(android.net.wifi.WifiInfo r1, java.lang.String r2) {
            r0 = this;
            a.a.a.g.g r0 = r0.f277a
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.a(r1, r2)
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final java.lang.String a(java.lang.String r3) {
            r2 = this;
            if (r3 == 0) goto L19
            int r2 = r3.length()
            a.a.a.b.d r0 = a.a.a.b.d.i()
            int r0 = r0.K
            if (r2 <= r0) goto L19
            a.a.a.b.d r2 = a.a.a.b.d.i()
            int r2 = r2.K
            r0 = 0
            java.lang.String r3 = r3.substring(r0, r2)
        L19:
            if (r3 == 0) goto L35
            java.lang.String r2 = "&"
            boolean r0 = r3.contains(r2)
            java.lang.String r1 = ";"
            if (r0 != 0) goto L2b
            boolean r0 = r3.contains(r1)
            if (r0 == 0) goto L35
        L2b:
            java.lang.String r0 = "_"
            java.lang.String r2 = r3.replace(r2, r0)
            java.lang.String r3 = r2.replace(r1, r0)
        L35:
            return r3
    }

    public final java.lang.String a(java.util.List<android.telephony.CellInfo> r3, android.telephony.TelephonyManager r4, int r5, int[] r6, boolean r7, int r8) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 1
            if (r5 == r1) goto L13
            a.a.a.b.d r5 = a.a.a.b.d.i()
            int r5 = r5.H
            if (r5 != r1) goto L11
            goto L13
        L11:
            r2 = 0
            return r2
        L13:
            a.a.a.b.d r5 = a.a.a.b.d.i()
            int r5 = r5.H
            if (r5 == r1) goto L1e
            if (r7 == 0) goto L1e
            goto L1f
        L1e:
            r1 = 0
        L1f:
            java.util.Iterator r3 = r3.iterator()
        L23:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L37
            java.lang.Object r5 = r3.next()
            android.telephony.CellInfo r5 = (android.telephony.CellInfo) r5
            a.a.a.g.h r5 = r2.a(r5, r4)
            r0.add(r5)
            goto L23
        L37:
            java.util.List r3 = a(r0, r8)
            java.lang.String r2 = r2.a(r3, r6, r1)
            return r2
    }

    public final java.lang.String a(java.util.List<a.a.a.g.h> r12, int[] r13, boolean r14) {
            r11 = this;
            if (r12 == 0) goto L1bd
            int r11 = r12.size()
            if (r11 != 0) goto La
            goto L1bd
        La:
            com.baidu.location.l.c r11 = new com.baidu.location.l.c
            r11.<init>()
            java.util.Iterator r12 = r12.iterator()
        L13:
            boolean r0 = r12.hasNext()
            r1 = 0
            if (r0 == 0) goto L1b4
            java.lang.Object r0 = r12.next()
            a.a.a.g.h r0 = (a.a.a.g.h) r0
            com.baidu.location.l.b r2 = new com.baidu.location.l.b
            r2.<init>()
            com.baidu.location.l.a r3 = new com.baidu.location.l.a
            r3.<init>()
            int r4 = r0.f292a
            r3.a(r4)
            java.lang.String r4 = r0.f293b
            if (r4 == 0) goto L3a
            c.b.a.a.a r4 = c.b.a.a.a.a(r4)
            r3.a(r4)
        L3a:
            java.lang.String r4 = r0.f294c
            if (r4 == 0) goto L45
            c.b.a.a.a r4 = c.b.a.a.a.a(r4)
            r3.b(r4)
        L45:
            int r4 = r0.d
            r3.c(r4)
            long r4 = r0.e
            r3.a(r4)
            int r4 = r0.f
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L59
            r3.b(r4)
        L59:
            if (r14 != 0) goto L5e
            r2.a(r3)
        L5e:
            boolean r3 = r0 instanceof a.a.a.g.i
            r4 = 2
            r6 = 1
            if (r3 == 0) goto L10a
            com.baidu.location.l.d r3 = new com.baidu.location.l.d
            r3.<init>()
            a.a.a.g.i r0 = (a.a.a.g.i) r0
            int r7 = r0.h
            if (r7 == r5) goto L78
            if (r14 == 0) goto L75
            r1 = r13[r1]
            if (r1 != r6) goto L78
        L75:
            r3.b(r7)
        L78:
            int r1 = r0.i
            if (r1 == r5) goto L85
            if (r14 == 0) goto L82
            r7 = r13[r6]
            if (r7 != r6) goto L85
        L82:
            r3.e(r1)
        L85:
            int r1 = r0.j
            if (r1 == r5) goto L92
            if (r14 == 0) goto L8f
            r4 = r13[r4]
            if (r4 != r6) goto L92
        L8f:
            r3.j(r1)
        L92:
            int r1 = r0.k
            if (r1 == r5) goto La0
            if (r14 == 0) goto L9d
            r4 = 3
            r4 = r13[r4]
            if (r4 != r6) goto La0
        L9d:
            r3.d(r1)
        La0:
            int r1 = r0.l
            if (r1 == r5) goto Lae
            if (r14 == 0) goto Lab
            r4 = 4
            r4 = r13[r4]
            if (r4 != r6) goto Lae
        Lab:
            r3.a(r1)
        Lae:
            int r1 = r0.m
            if (r1 == r5) goto Lbc
            if (r14 == 0) goto Lb9
            r4 = 5
            r4 = r13[r4]
            if (r4 != r6) goto Lbc
        Lb9:
            r3.h(r1)
        Lbc:
            int r1 = r0.n
            if (r1 == r5) goto Lca
            if (r14 == 0) goto Lc7
            r4 = 6
            r4 = r13[r4]
            if (r4 != r6) goto Lca
        Lc7:
            r3.f(r1)
        Lca:
            int r1 = r0.o
            if (r1 == r5) goto Ld8
            if (r14 == 0) goto Ld5
            r4 = 7
            r4 = r13[r4]
            if (r4 != r6) goto Ld8
        Ld5:
            r3.g(r1)
        Ld8:
            int r1 = r0.p
            if (r1 == r5) goto Le7
            if (r14 == 0) goto Le4
            r4 = 8
            r4 = r13[r4]
            if (r4 != r6) goto Le7
        Le4:
            r3.i(r1)
        Le7:
            int r1 = r0.q
            if (r1 == r5) goto Lf6
            if (r14 == 0) goto Lf3
            r4 = 9
            r4 = r13[r4]
            if (r4 != r6) goto Lf6
        Lf3:
            r3.c(r1)
        Lf6:
            int r0 = r0.r
            if (r0 == r5) goto L105
            if (r14 == 0) goto L102
            r1 = 10
            r1 = r13[r1]
            if (r1 != r6) goto L105
        L102:
            r3.k(r0)
        L105:
            r2.a(r3)
            goto L1af
        L10a:
            boolean r3 = r0 instanceof a.a.a.g.j
            if (r3 == 0) goto L1af
            com.baidu.location.l.e r3 = new com.baidu.location.l.e
            r3.<init>()
            a.a.a.g.j r0 = (a.a.a.g.j) r0
            long r7 = r0.h
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 == 0) goto L129
            if (r14 == 0) goto L126
            r1 = r13[r1]
            if (r1 != r6) goto L129
        L126:
            r3.a(r7)
        L129:
            int r1 = r0.i
            if (r1 == r5) goto L136
            if (r14 == 0) goto L133
            r7 = r13[r6]
            if (r7 != r6) goto L136
        L133:
            r3.e(r1)
        L136:
            int r1 = r0.j
            if (r1 == r5) goto L143
            if (r14 == 0) goto L140
            r4 = r13[r4]
            if (r4 != r6) goto L143
        L140:
            r3.i(r1)
        L143:
            int r1 = r0.k
            if (r1 == r5) goto L152
            if (r14 == 0) goto L14f
            r4 = 11
            r4 = r13[r4]
            if (r4 != r6) goto L152
        L14f:
            r3.d(r1)
        L152:
            int r1 = r0.l
            if (r1 == r5) goto L161
            if (r14 == 0) goto L15e
            r4 = 12
            r4 = r13[r4]
            if (r4 != r6) goto L161
        L15e:
            r3.f(r1)
        L161:
            int r1 = r0.m
            if (r1 == r5) goto L170
            if (r14 == 0) goto L16d
            r4 = 13
            r4 = r13[r4]
            if (r4 != r6) goto L170
        L16d:
            r3.g(r1)
        L170:
            int r1 = r0.n
            if (r1 == r5) goto L17f
            if (r14 == 0) goto L17c
            r4 = 14
            r4 = r13[r4]
            if (r4 != r6) goto L17f
        L17c:
            r3.h(r1)
        L17f:
            int r1 = r0.o
            if (r1 == r5) goto L18e
            if (r14 == 0) goto L18b
            r4 = 15
            r4 = r13[r4]
            if (r4 != r6) goto L18e
        L18b:
            r3.a(r1)
        L18e:
            int r1 = r0.p
            if (r1 == r5) goto L19d
            if (r14 == 0) goto L19a
            r4 = 16
            r4 = r13[r4]
            if (r4 != r6) goto L19d
        L19a:
            r3.b(r1)
        L19d:
            int r0 = r0.q
            if (r0 == r5) goto L1ac
            if (r14 == 0) goto L1a9
            r1 = 17
            r1 = r13[r1]
            if (r1 != r6) goto L1ac
        L1a9:
            r3.c(r0)
        L1ac:
            r2.a(r3)
        L1af:
            r11.a(r2)
            goto L13
        L1b4:
            byte[] r11 = r11.c()
            java.lang.String r11 = android.util.Base64.encodeToString(r11, r1)
            return r11
        L1bd:
            r11 = 0
            return r11
    }

    public synchronized void a(android.content.Context r3) {
            r2 = this;
            monitor-enter(r2)
            a.a.a.g.g r0 = r2.f277a     // Catch: java.lang.Throwable -> L66
            if (r0 != 0) goto L7
            monitor-exit(r2)
            return
        L7:
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r3.getSystemService(r0)     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L66
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L66
            r2.f278b = r0     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L66
            java.lang.String r0 = "wifi"
            java.lang.Object r0 = r3.getSystemService(r0)     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L66
            android.net.wifi.WifiManager r0 = (android.net.wifi.WifiManager) r0     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L66
            r2.d = r0     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L66
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r3.getSystemService(r0)     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L66
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L66
            r2.f279c = r0     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L66
            android.os.Looper r0 = android.os.Looper.myLooper()     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L66
            if (r0 == 0) goto L32
            android.os.Handler r0 = new android.os.Handler     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L66
            r0.<init>()     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L66
            r2.e = r0     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L66
        L32:
            a.a.a.g.g r0 = r2.f277a     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L66
            a.a.a.g.g$b r1 = a.a.a.g.g.b.d     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L66
            r0.a(r1)     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L66
            r0 = 100
            a.a.a.g.g r1 = r2.f277a     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L66
            r1.d(r0)     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L66
            a.a.a.g.g r0 = r2.f277a     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L66
            r1 = 2000(0x7d0, float:2.803E-42)
            r0.e(r1)     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L66
            a.a.a.g.g r0 = r2.f277a     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L66
            r1 = 1
            r0.b(r1)     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L66
            r0 = 30
            a.a.a.g.g r1 = r2.f277a     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L66
            r1.c(r0)     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L66
            r0 = 0
            a.a.a.g.g r1 = r2.f277a     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L66
            r1.a(r0)     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L66
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L66
            r0.<init>()     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L66
            a.a.a.g.g r1 = r2.f277a     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L66
            r1.a(r3, r0)     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L66
        L64:
            monitor-exit(r2)
            return
        L66:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    public final void a(android.telephony.TelephonyManager r8, int r9, int[] r10, boolean r11, int r12) {
            r7 = this;
            if (r8 == 0) goto L12
            java.util.List r1 = r8.getAllCellInfo()     // Catch: java.lang.Throwable -> L12
            r0 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            java.lang.String r8 = r0.a(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L12
            r7.f = r8     // Catch: java.lang.Throwable -> L12
        L12:
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public boolean a(long r4) {
            r3 = this;
            r0 = 0
            android.net.wifi.WifiManager r1 = r3.d     // Catch: java.lang.Throwable -> L2b
            boolean r1 = r1.isWifiEnabled()     // Catch: java.lang.Throwable -> L2b
            if (r1 != 0) goto L17
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L2b
            r2 = 17
            if (r1 <= r2) goto L2b
            android.net.wifi.WifiManager r1 = r3.d     // Catch: java.lang.Throwable -> L2b
            boolean r1 = r1.isScanAlwaysAvailable()     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L2b
        L17:
            boolean r1 = r3.p()     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L1e
            return r0
        L1e:
            a.a.a.g.k r1 = r3.j()     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L2b
            boolean r3 = r3.a(r1, r4)     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L2b
            r0 = 1
        L2b:
            return r0
    }

    public boolean a(a.a.a.g.a r1, a.a.a.g.a r2) {
            r0 = this;
            a.a.a.g.g r0 = r0.f277a
            if (r0 == 0) goto L9
            boolean r0 = r0.a(r1, r2)
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final boolean a(a.a.a.g.k r19, long r20) {
            r18 = this;
            r0 = r19
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 1000(0x3e8, double:4.94E-321)
            r5 = 0
            r6 = 0
            r8 = 17
            if (r1 < r8) goto L1c
            long r8 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Throwable -> L13
            long r8 = r8 / r3
            goto L14
        L13:
            r8 = r6
        L14:
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 <= 0) goto L1a
            r1 = 1
            goto L1e
        L1a:
            r1 = r5
            goto L1e
        L1c:
            r1 = r5
            r8 = r6
        L1e:
            if (r1 != 0) goto L21
            return r5
        L21:
            java.util.List<android.net.wifi.ScanResult> r10 = r0.f295a
            if (r10 == 0) goto L83
            int r10 = r10.size()
            if (r10 != 0) goto L2c
            goto L83
        L2c:
            java.util.List<android.net.wifi.ScanResult> r10 = r0.f295a
            int r10 = r10.size()
            r11 = 16
            if (r10 <= r11) goto L37
            r10 = r11
        L37:
            r11 = r5
            r12 = r6
            r14 = r12
        L3a:
            if (r11 >= r10) goto L72
            java.util.List<android.net.wifi.ScanResult> r2 = r0.f295a
            java.lang.Object r2 = r2.get(r11)
            if (r2 == 0) goto L6d
            java.util.List<android.net.wifi.ScanResult> r2 = r0.f295a
            java.lang.Object r2 = r2.get(r11)
            android.net.wifi.ScanResult r2 = (android.net.wifi.ScanResult) r2
            int r2 = r2.level
            if (r2 != 0) goto L51
            goto L6d
        L51:
            if (r1 == 0) goto L6d
            java.util.List<android.net.wifi.ScanResult> r2 = r0.f295a     // Catch: java.lang.Throwable -> L65
            java.lang.Object r2 = r2.get(r11)     // Catch: java.lang.Throwable -> L65
            android.net.wifi.ScanResult r2 = (android.net.wifi.ScanResult) r2     // Catch: java.lang.Throwable -> L65
            long r6 = r2.timestamp     // Catch: java.lang.Throwable -> L65
            long r6 = r8 - r6
            r16 = 1000000(0xf4240, double:4.940656E-318)
            long r6 = r6 / r16
            goto L67
        L65:
            r6 = 0
        L67:
            long r14 = r14 + r6
            int r2 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r2 <= 0) goto L6d
            r12 = r6
        L6d:
            int r11 = r11 + 1
            r6 = 0
            goto L3a
        L72:
            long r0 = (long) r10
            long r14 = r14 / r0
            long r12 = r12 * r3
            int r0 = (r12 > r20 ? 1 : (r12 == r20 ? 0 : -1))
            if (r0 > 0) goto L81
            long r14 = r14 * r3
            int r0 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r0 <= 0) goto L7f
            goto L81
        L7f:
            r2 = r5
            goto L82
        L81:
            r2 = 1
        L82:
            return r2
        L83:
            return r5
    }

    public boolean a(a.a.a.g.k r5, a.a.a.g.k r6, float r7) {
            r4 = this;
            boolean r7 = r6.a(r5, r7)
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = a.a.a.b.c.i
            long r0 = r0 - r2
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L29
            r2 = 30000(0x7530, double:1.4822E-319)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L29
            if (r7 == 0) goto L29
            long r0 = r4.b(r6)
            long r4 = r4.b(r5)
            long r0 = r0 - r4
            r4 = 30
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 <= 0) goto L29
            r7 = 0
        L29:
            return r7
    }

    public int b(java.lang.String r4) {
            r3 = this;
            r3 = -1
            if (r4 == 0) goto L35
            java.lang.String r0 = "mNrTac"
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L35
            java.lang.String r0 = " "
            java.lang.String r1 = ""
            java.lang.String r4 = r4.replace(r0, r1)
            java.lang.String r0 = "mNrTac=(.+?)\\}"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r4 = r0.matcher(r4)
        L1d:
            r0 = r3
        L1e:
            boolean r1 = r4.find()
            if (r1 == 0) goto L34
            int r1 = r4.groupCount()
            r2 = 1
            if (r1 < r2) goto L1e
            java.lang.String r0 = r4.group(r2)
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L1d
            goto L1e
        L34:
            r3 = r0
        L35:
            return r3
    }

    public long b(a.a.a.g.k r19) {
            r18 = this;
            r0 = r19
            int r1 = r19.c()
            r2 = 0
            if (r1 != 0) goto Lb
            return r2
        Lb:
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 17
            r5 = 0
            if (r1 < r4) goto L21
            long r6 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Throwable -> L1a
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r8
            goto L1b
        L1a:
            r6 = r2
        L1b:
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 <= 0) goto L22
            r1 = 1
            goto L23
        L21:
            r6 = r2
        L22:
            r1 = r5
        L23:
            if (r1 != 0) goto L26
            return r2
        L26:
            java.util.List<android.net.wifi.ScanResult> r4 = r0.f295a
            int r4 = r4.size()
            r8 = 16
            if (r4 <= r8) goto L31
            r4 = r8
        L31:
            r8 = r2
            r10 = r8
            r12 = r10
        L34:
            r14 = 1
            if (r5 >= r4) goto L6f
            java.util.List<android.net.wifi.ScanResult> r2 = r0.f295a
            java.lang.Object r2 = r2.get(r5)
            if (r2 == 0) goto L6a
            java.util.List<android.net.wifi.ScanResult> r2 = r0.f295a
            java.lang.Object r2 = r2.get(r5)
            android.net.wifi.ScanResult r2 = (android.net.wifi.ScanResult) r2
            int r2 = r2.level
            if (r2 != 0) goto L4d
            goto L6a
        L4d:
            if (r1 == 0) goto L6a
            java.util.List<android.net.wifi.ScanResult> r2 = r0.f295a     // Catch: java.lang.Throwable -> L61
            java.lang.Object r2 = r2.get(r5)     // Catch: java.lang.Throwable -> L61
            android.net.wifi.ScanResult r2 = (android.net.wifi.ScanResult) r2     // Catch: java.lang.Throwable -> L61
            long r2 = r2.timestamp     // Catch: java.lang.Throwable -> L61
            long r2 = r6 - r2
            r16 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 / r16
            goto L63
        L61:
            r2 = 0
        L63:
            long r10 = r10 + r2
            long r8 = r8 + r14
            int r14 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r14 <= 0) goto L6a
            r12 = r2
        L6a:
            int r5 = r5 + 1
            r2 = 0
            goto L34
        L6f:
            int r0 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r0 <= 0) goto L77
            long r10 = r10 - r12
            long r8 = r8 - r14
            long r12 = r10 / r8
        L77:
            return r12
    }

    public final synchronized java.lang.String b() {
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            java.lang.String r1 = r3.f     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L16
            int r1 = r1.length()     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L16
            java.lang.String r0 = r3.f     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = "\n"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.replace(r1, r2)     // Catch: java.lang.Throwable -> L18
        L16:
            monitor-exit(r3)
            return r0
        L18:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    public java.lang.String b(int r9, a.a.a.g.k r10) {
            r8 = this;
            int r8 = r10.c()
            r0 = 0
            r1 = 1
            if (r8 >= r1) goto L9
            return r0
        L9:
            java.lang.StringBuffer r8 = new java.lang.StringBuffer
            r2 = 512(0x200, float:7.17E-43)
            r8.<init>(r2)
            java.util.List<android.net.wifi.ScanResult> r2 = r10.f295a
            int r2 = r2.size()
            if (r2 <= r9) goto L19
            goto L1a
        L19:
            r9 = r2
        L1a:
            r2 = 0
            r4 = r1
            r3 = r2
        L1d:
            if (r3 >= r9) goto L81
            java.util.List<android.net.wifi.ScanResult> r5 = r10.f295a
            java.lang.Object r5 = r5.get(r3)
            if (r5 == 0) goto L7e
            java.util.List<android.net.wifi.ScanResult> r5 = r10.f295a
            java.lang.Object r5 = r5.get(r3)
            android.net.wifi.ScanResult r5 = (android.net.wifi.ScanResult) r5
            int r5 = r5.level
            if (r5 == 0) goto L7e
            java.util.List<android.net.wifi.ScanResult> r5 = r10.f295a
            java.lang.Object r5 = r5.get(r3)
            android.net.wifi.ScanResult r5 = (android.net.wifi.ScanResult) r5
            java.lang.String r5 = r5.BSSID
            if (r5 != 0) goto L40
            goto L7e
        L40:
            if (r4 == 0) goto L44
            r4 = r2
            goto L49
        L44:
            java.lang.String r5 = "|"
            r8.append(r5)
        L49:
            java.util.List<android.net.wifi.ScanResult> r5 = r10.f295a
            java.lang.Object r5 = r5.get(r3)
            android.net.wifi.ScanResult r5 = (android.net.wifi.ScanResult) r5
            java.lang.String r5 = r5.BSSID
            java.lang.String r6 = ":"
            java.lang.String r7 = ""
            java.lang.String r5 = r5.replace(r6, r7)
            r8.append(r5)
            java.util.List<android.net.wifi.ScanResult> r5 = r10.f295a
            java.lang.Object r5 = r5.get(r3)
            android.net.wifi.ScanResult r5 = (android.net.wifi.ScanResult) r5
            int r5 = r5.level
            if (r5 >= 0) goto L6b
            int r5 = -r5
        L6b:
            java.util.Locale r6 = java.util.Locale.CHINA
            java.lang.Object[] r7 = new java.lang.Object[r1]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r7[r2] = r5
            java.lang.String r5 = ";%d;"
            java.lang.String r5 = java.lang.String.format(r6, r5, r7)
            r8.append(r5)
        L7e:
            int r3 = r3 + 1
            goto L1d
        L81:
            if (r4 != 0) goto L88
            java.lang.String r8 = r8.toString()
            return r8
        L88:
            return r0
    }

    public java.lang.String b(a.a.a.g.a r1) {
            r0 = this;
            a.a.a.g.g r0 = r0.f277a
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.b(r1)
            return r0
        L9:
            r0 = 0
            return r0
    }

    public boolean b(long r9) {
            r8 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r8.j
            long r0 = r0 - r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            if (r4 < 0) goto L15
            r6 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 > 0) goto L15
            return r5
        L15:
            long r0 = java.lang.System.currentTimeMillis()
            r8.j = r0
            int r0 = a.a.a.i.i.e
            r1 = 4
            if (r0 == r1) goto L23
            r8.a(r5)
        L23:
            a.a.a.g.g r8 = r8.f277a
            if (r8 == 0) goto L32
            long r0 = r8.d()
            long r0 = r0 - r9
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 <= 0) goto L32
            r8 = 1
            return r8
        L32:
            return r5
    }

    @android.annotation.SuppressLint({"NewApi"})
    public long c(a.a.a.g.k r13) {
            r12 = this;
            java.util.List<android.net.wifi.ScanResult> r12 = r13.f295a
            r0 = 0
            if (r12 == 0) goto L74
            int r12 = r12.size()
            if (r12 != 0) goto Le
            goto L74
        Le:
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r12 = android.os.Build.VERSION.SDK_INT
            r4 = 17
            r5 = 0
            if (r12 < r4) goto L27
            long r6 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Throwable -> L20
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r8
            goto L21
        L20:
            r6 = r0
        L21:
            int r12 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r12 <= 0) goto L28
            r12 = 1
            goto L29
        L27:
            r6 = r0
        L28:
            r12 = r5
        L29:
            if (r12 != 0) goto L2c
            return r0
        L2c:
            java.util.List<android.net.wifi.ScanResult> r4 = r13.f295a
            int r4 = r4.size()
            r8 = 16
            if (r4 <= r8) goto L37
            r4 = r8
        L37:
            if (r5 >= r4) goto L6a
            java.util.List<android.net.wifi.ScanResult> r8 = r13.f295a
            java.lang.Object r8 = r8.get(r5)
            if (r8 == 0) goto L67
            java.util.List<android.net.wifi.ScanResult> r8 = r13.f295a
            java.lang.Object r8 = r8.get(r5)
            android.net.wifi.ScanResult r8 = (android.net.wifi.ScanResult) r8
            int r8 = r8.level
            if (r8 != 0) goto L4e
            goto L67
        L4e:
            if (r12 == 0) goto L67
            java.util.List<android.net.wifi.ScanResult> r8 = r13.f295a     // Catch: java.lang.Throwable -> L61
            java.lang.Object r8 = r8.get(r5)     // Catch: java.lang.Throwable -> L61
            android.net.wifi.ScanResult r8 = (android.net.wifi.ScanResult) r8     // Catch: java.lang.Throwable -> L61
            long r8 = r8.timestamp     // Catch: java.lang.Throwable -> L61
            long r8 = r6 - r8
            r10 = 1000000(0xf4240, double:4.940656E-318)
            long r8 = r8 / r10
            goto L62
        L61:
            r8 = r0
        L62:
            int r10 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r10 >= 0) goto L67
            r2 = r8
        L67:
            int r5 = r5 + 1
            goto L37
        L6a:
            if (r12 == 0) goto L6d
            goto L6e
        L6d:
            r2 = r0
        L6e:
            int r12 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r12 >= 0) goto L73
            goto L74
        L73:
            r0 = r2
        L74:
            return r0
    }

    public android.net.wifi.WifiInfo c() {
            r2 = this;
            int r0 = a.a.a.i.i.e
            r1 = 4
            if (r0 == r1) goto Lf
            a.a.a.g.g r2 = r2.f277a
            if (r2 != 0) goto La
            goto Lf
        La:
            android.net.wifi.WifiInfo r2 = r2.a()
            return r2
        Lf:
            r2 = 0
            return r2
    }

    public final java.lang.String c(java.lang.String r3) {
            r2 = this;
            if (r3 == 0) goto L1c
            java.lang.String r2 = "&"
            boolean r0 = r3.contains(r2)
            java.lang.String r1 = ";"
            if (r0 != 0) goto L12
            boolean r0 = r3.contains(r1)
            if (r0 == 0) goto L1c
        L12:
            java.lang.String r0 = "_"
            java.lang.String r2 = r3.replace(r2, r0)
            java.lang.String r3 = r2.replace(r1, r0)
        L1c:
            return r3
    }

    public java.util.HashSet<java.lang.String> c(a.a.a.g.a r1) {
            r0 = this;
            a.a.a.g.g r0 = r0.f277a
            if (r0 == 0) goto L9
            java.util.HashSet r0 = r0.c(r1)
            return r0
        L9:
            r0 = 0
            return r0
    }

    public int d(a.a.a.g.k r3) {
            r2 = this;
            r2 = 0
            r0 = r2
        L2:
            int r1 = r3.c()
            if (r0 >= r1) goto L22
            java.util.List<android.net.wifi.ScanResult> r1 = r3.f295a
            java.lang.Object r1 = r1.get(r0)
            if (r1 != 0) goto L11
            goto L1f
        L11:
            java.util.List<android.net.wifi.ScanResult> r1 = r3.f295a
            java.lang.Object r1 = r1.get(r0)
            android.net.wifi.ScanResult r1 = (android.net.wifi.ScanResult) r1
            int r1 = r1.level
            int r1 = -r1
            if (r1 <= 0) goto L1f
            return r1
        L1f:
            int r0 = r0 + 1
            goto L2
        L22:
            return r2
    }

    public java.lang.String d() {
            r2 = this;
            a.a.a.g.g r2 = r2.f277a
            if (r2 == 0) goto Le
            int r0 = a.a.a.i.i.e
            r1 = 4
            if (r0 == r1) goto Le
            java.lang.String r2 = r2.b()
            return r2
        Le:
            r2 = 0
            return r2
    }

    public java.lang.String d(a.a.a.g.a r5) {
            r4 = this;
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r0 = 128(0x80, float:1.8E-43)
            r4.<init>(r0)
            long r0 = r5.f255b
            r2 = 23
            long r0 = r0 + r2
            r4.append(r0)
            java.lang.String r0 = "H"
            r4.append(r0)
            int r0 = r5.f254a
            int r0 = r0 + 45
            r4.append(r0)
            java.lang.String r0 = "K"
            r4.append(r0)
            int r0 = r5.d
            int r0 = r0 + 54
            r4.append(r0)
            java.lang.String r0 = "Q"
            r4.append(r0)
            int r5 = r5.f256c
            int r5 = r5 + 203
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            return r4
    }

    public final int e() {
            r1 = this;
            android.telephony.TelephonyManager r1 = r1.f278b     // Catch: java.lang.Exception -> Lf
            if (r1 == 0) goto Lf
            android.telephony.SignalStrength r1 = r1.getSignalStrength()     // Catch: java.lang.Exception -> Lf
            java.lang.String r0 = "getLteRssnr"
            int r1 = a.a.a.i.i.b(r1, r0)     // Catch: java.lang.Exception -> Lf
            goto L12
        Lf:
            r1 = 2147483647(0x7fffffff, float:NaN)
        L12:
            return r1
    }

    public int f() {
            r1 = this;
            r0 = 0
            android.net.ConnectivityManager r1 = r1.f279c     // Catch: java.lang.Exception -> Lf
            if (r1 == 0) goto Lf
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()     // Catch: java.lang.Exception -> Lf
            if (r1 == 0) goto Lf
            int r0 = r1.getSubtype()     // Catch: java.lang.Exception -> Lf
        Lf:
            return r0
    }

    public long g() {
            r2 = this;
            a.a.a.g.g r2 = r2.f277a
            if (r2 == 0) goto L9
            long r0 = r2.d()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public java.lang.String h() {
            r2 = this;
            r0 = -1
            android.telephony.TelephonyManager r2 = r2.f278b     // Catch: java.lang.Exception -> L9
            if (r2 == 0) goto L9
            int r0 = r2.getSimState()     // Catch: java.lang.Exception -> L9
        L9:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "&sim="
            r2.append(r1)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public java.util.List<android.net.wifi.WifiConfiguration> i() {
            r1 = this;
            r0 = 0
            android.net.wifi.WifiManager r1 = r1.d     // Catch: java.lang.Exception -> Lb
            if (r1 == 0) goto La
            java.util.List r1 = r1.getConfiguredNetworks()     // Catch: java.lang.Exception -> Lb
            return r1
        La:
            return r0
        Lb:
            r1 = move-exception
            r1.printStackTrace()
            return r0
    }

    public a.a.a.g.k j() {
            r3 = this;
            a.a.a.g.g r3 = r3.f277a
            if (r3 == 0) goto Le
            int r0 = a.a.a.i.i.e
            r1 = 4
            if (r0 == r1) goto Le
            a.a.a.g.k r3 = r3.c()
            return r3
        Le:
            a.a.a.g.k r3 = new a.a.a.g.k
            r0 = 0
            r1 = 0
            r3.<init>(r0, r1)
            return r3
    }

    public java.lang.String k() {
            r7 = this;
            a.a.a.b.d r0 = a.a.a.b.d.i()
            int r0 = r0.J
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            a.a.a.g.k r0 = r7.j()
            if (r0 == 0) goto L9d
            int r2 = r0.c()
            r3 = 1
            if (r2 >= r3) goto L19
            goto L9d
        L19:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List<android.net.wifi.ScanResult> r0 = r0.f295a
            java.util.Iterator r0 = r0.iterator()
        L24:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r0.next()
            android.net.wifi.ScanResult r2 = (android.net.wifi.ScanResult) r2
            if (r2 == 0) goto L24
            int r3 = r2.level
            if (r3 == 0) goto L24
            java.lang.String r3 = r2.BSSID
            if (r3 != 0) goto L3b
            goto L24
        L3b:
            r1.add(r2)
            goto L24
        L3f:
            a.a.a.g.f$d r0 = new a.a.a.g.f$d
            r0.<init>()
            java.util.Collections.sort(r1, r0)
            int r0 = r1.size()
            a.a.a.b.d r2 = a.a.a.b.d.i()
            int r2 = r2.L
            int r0 = java.lang.Math.min(r2, r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 0
        L5b:
            if (r3 >= r0) goto L98
            java.lang.Object r4 = r1.get(r3)
            android.net.wifi.ScanResult r4 = (android.net.wifi.ScanResult) r4
            java.lang.String r4 = r4.BSSID
            java.lang.String r5 = ":"
            java.lang.String r6 = ""
            java.lang.String r4 = r4.replace(r5, r6)
            java.lang.Object r5 = r1.get(r3)
            android.net.wifi.ScanResult r5 = (android.net.wifi.ScanResult) r5
            java.lang.String r5 = r5.SSID
            java.lang.String r5 = r7.a(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r4 = ","
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            r2.append(r4)
            java.lang.String r4 = ";"
            r2.append(r4)
            int r3 = r3 + 1
            goto L5b
        L98:
            java.lang.String r7 = r2.toString()
            return r7
        L9d:
            return r1
    }

    @android.annotation.SuppressLint({"NewApi"})
    public java.lang.String l() {
            r3 = this;
            android.net.wifi.WifiManager r0 = r3.d
            java.lang.String r1 = ""
            if (r0 == 0) goto L1d
            boolean r0 = r0.isWifiEnabled()     // Catch: java.lang.Throwable -> L1d
            if (r0 != 0) goto L1a
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L1d
            r2 = 17
            if (r0 <= r2) goto L1d
            android.net.wifi.WifiManager r3 = r3.d     // Catch: java.lang.Throwable -> L1d
            boolean r3 = r3.isScanAlwaysAvailable()     // Catch: java.lang.Throwable -> L1d
            if (r3 == 0) goto L1d
        L1a:
            java.lang.String r1 = "&wifio=1"
        L1d:
            return r1
    }

    public void m() {
            r1 = this;
            a.a.a.g.g r0 = r1.f277a
            if (r0 != 0) goto Lb
            a.a.a.g.g r0 = new a.a.a.g.g
            r0.<init>()
            r1.f277a = r0
        Lb:
            a.a.a.g.f$c r0 = new a.a.a.g.f$c
            r0.<init>(r1)
            a.a.a.g.g r1 = r1.f277a
            r1.a(r0)
            return
    }

    public boolean n() {
            r0 = this;
            a.a.a.g.g r0 = r0.f277a
            if (r0 == 0) goto L9
            boolean r0 = r0.e()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public boolean o() {
            r0 = this;
            r0 = 0
            return r0
    }

    public boolean p() {
            r2 = this;
            r0 = 0
            android.net.ConnectivityManager r2 = r2.f279c     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto Lf
            r1 = 1
            android.net.NetworkInfo r2 = r2.getNetworkInfo(r1)     // Catch: java.lang.Throwable -> Lf
            boolean r2 = r2.isConnected()     // Catch: java.lang.Throwable -> Lf
            return r2
        Lf:
            return r0
    }

    @android.annotation.SuppressLint({"NewApi"})
    public boolean q() {
            r3 = this;
            r0 = 0
            android.net.wifi.WifiManager r1 = r3.d     // Catch: java.lang.Throwable -> L1b
            boolean r1 = r1.isWifiEnabled()     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L19
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L1b
            r2 = 17
            if (r1 <= r2) goto L18
            android.net.wifi.WifiManager r3 = r3.d     // Catch: java.lang.Throwable -> L1b
            boolean r3 = r3.isScanAlwaysAvailable()     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto L18
            goto L19
        L18:
            return r0
        L19:
            r3 = 1
            return r3
        L1b:
            return r0
    }

    public void r() {
            r2 = this;
            r0 = 0
            r2.k = r0
            return
    }

    public boolean s() {
            r14 = this;
            long r0 = java.lang.System.currentTimeMillis()
            a.a.a.g.g r2 = r14.f277a
            r3 = 0
            if (r2 == 0) goto Lf
            long r5 = r2.d()
            goto L10
        Lf:
            r5 = r3
        L10:
            long r7 = r0 - r5
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 <= 0) goto L4f
            long r2 = r14.k
            r9 = 5000(0x1388, double:2.4703E-320)
            long r2 = r2 + r9
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            r9 = 0
            if (r4 > 0) goto L21
            return r9
        L21:
            long r10 = r14.i
            r12 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r12
            long r0 = r0 - r10
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L2c
            return r9
        L2c:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L39
            r0 = 25000(0x61a8, double:1.23516E-319)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 >= 0) goto L39
            return r9
        L39:
            boolean r0 = r14.p()
            if (r0 == 0) goto L4f
            boolean r0 = r14.o()
            if (r0 != 0) goto L4f
            long r0 = r14.k
            r2 = 10000(0x2710, double:4.9407E-320)
            long r0 = r0 + r2
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 > 0) goto L4f
            return r9
        L4f:
            boolean r14 = r14.b(r5)
            return r14
    }

    public boolean t() {
            r6 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r6.h
            long r2 = r0 - r2
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto L16
            r4 = 5000(0x1388, double:2.4703E-320)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L16
            r6 = 0
            return r6
        L16:
            r6.h = r0
            r6.r()
            boolean r6 = r6.s()
            return r6
    }

    public synchronized void u() {
            r2 = this;
            monitor-enter(r2)
            r2.v()     // Catch: java.lang.Throwable -> L11
            a.a.a.g.g r0 = r2.f277a     // Catch: java.lang.Throwable -> L11
            r1 = 0
            if (r0 == 0) goto Lb
            r2.f277a = r1     // Catch: java.lang.Throwable -> L11
        Lb:
            r2.f278b = r1     // Catch: java.lang.Throwable -> L11
            r2.d = r1     // Catch: java.lang.Throwable -> L11
            monitor-exit(r2)
            return
        L11:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public void v() {
            r0 = this;
            a.a.a.g.g r0 = r0.f277a
            if (r0 == 0) goto L7
            r0.f()
        L7:
            return
    }
}
