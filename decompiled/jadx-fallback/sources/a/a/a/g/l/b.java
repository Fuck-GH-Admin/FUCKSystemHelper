package a.a.a.g.l;

/* JADX INFO: loaded from: classes.dex */
public class b implements a.a.a.g.m.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f306c;
    public android.net.wifi.WifiManager d;
    public a.a.a.g.l.b.c e;
    public a.a.a.g.k f;
    public android.content.Context g;
    public int h;
    public long i;
    public long j;
    public long k;
    public long l;
    public java.lang.String m;
    public final java.lang.Object n;
    public final java.lang.Object o;
    public android.os.Handler p;
    public java.lang.String q;

    public static /* synthetic */ class a {
    }

    /* JADX INFO: renamed from: a.a.a.g.l.b$b, reason: collision with other inner class name */
    public static class C0018b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static a.a.a.g.l.b f307a;

        static {
                a.a.a.g.l.b r0 = new a.a.a.g.l.b
                r0.<init>()
                a.a.a.g.l.b.C0018b.f307a = r0
                return
        }

        public static /* synthetic */ a.a.a.g.l.b a() {
                a.a.a.g.l.b r0 = a.a.a.g.l.b.C0018b.f307a
                return r0
        }
    }

    public class c extends android.content.BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.a.a.g.l.b f308a;

        public class a implements java.lang.Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a.a.a.g.l.b.c f309b;

            public a(a.a.a.g.l.b.c r1) {
                    r0 = this;
                    r0.f309b = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    a.a.a.g.l.b$c r0 = r2.f309b
                    a.a.a.g.l.b r0 = r0.f308a
                    a.a.a.g.l.b.a(r0)
                    a.a.a.g.l.b$c r0 = r2.f309b
                    a.a.a.g.l.b r0 = r0.f308a
                    java.lang.Object r0 = a.a.a.g.l.b.b(r0)
                    monitor-enter(r0)
                    a.a.a.g.l.b$c r2 = r2.f309b     // Catch: java.lang.Throwable -> L2e
                    a.a.a.g.l.b r2 = r2.f308a     // Catch: java.lang.Throwable -> L2e
                    java.lang.Object r2 = a.a.a.g.l.b.b(r2)     // Catch: java.lang.Throwable -> L2e
                    r2.notifyAll()     // Catch: java.lang.Throwable -> L2e
                    boolean r2 = a.a.a.g.m.a.f310a     // Catch: java.lang.Throwable -> L2e
                    if (r2 == 0) goto L2c
                    boolean r2 = a.a.a.g.m.a.f311b     // Catch: java.lang.Throwable -> L2e
                    if (r2 == 0) goto L2c
                    a.a.a.g.e r2 = a.a.a.g.g.h()     // Catch: java.lang.Throwable -> L2e
                    java.lang.String r1 = "WifiScan finished, in callback."
                    r2.a(r1)     // Catch: java.lang.Throwable -> L2e
                L2c:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
                    return
                L2e:
                    r2 = move-exception
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
                    throw r2
            }
        }

        public c(a.a.a.g.l.b r1) {
                r0 = this;
                r0.f308a = r1
                r0.<init>()
                return
        }

        public /* synthetic */ c(a.a.a.g.l.b r1, a.a.a.g.l.b.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r5, android.content.Intent r6) {
                r4 = this;
                if (r5 != 0) goto L3
                return
            L3:
                boolean r5 = a.a.a.g.m.a.f311b
                if (r5 == 0) goto L12
                a.a.a.g.e r5 = a.a.a.g.g.h()
                boolean r5 = r5.a(r6)
                if (r5 != 0) goto L12
                return
            L12:
                java.lang.String r5 = r6.getAction()
                java.lang.String r6 = "android.net.wifi.SCAN_RESULTS"
                boolean r5 = r5.equals(r6)
                if (r5 == 0) goto L37
                a.a.a.g.l.b r5 = r4.f308a
                long r0 = java.lang.System.currentTimeMillis()
                r2 = 1000(0x3e8, double:4.94E-321)
                long r0 = r0 / r2
                r5.i = r0
                a.a.a.g.l.b r5 = r4.f308a
                android.os.Handler r5 = a.a.a.g.l.b.c(r5)
                a.a.a.g.l.b$c$a r6 = new a.a.a.g.l.b$c$a
                r6.<init>(r4)
                r5.post(r6)
            L37:
                return
        }
    }

    public b() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f306c = r0
            r0 = 0
            r3.d = r0
            r3.e = r0
            r3.f = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r3.h = r1
            r1 = 0
            r3.i = r1
            r3.j = r1
            r3.k = r1
            r3.l = r1
            r3.m = r0
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r3.n = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r3.o = r1
            r3.p = r0
            r3.q = r0
            return
    }

    public static /* synthetic */ void a(a.a.a.g.l.b r0) {
            r0.f()
            return
    }

    public static boolean a(a.a.a.g.k r10, a.a.a.g.k r11, float r12) {
            r0 = 0
            if (r10 == 0) goto L90
            if (r11 != 0) goto L7
            goto L90
        L7:
            java.util.List<android.net.wifi.ScanResult> r10 = r10.f295a
            java.util.List<android.net.wifi.ScanResult> r11 = r11.f295a
            r1 = 1
            if (r10 != r11) goto Lf
            return r1
        Lf:
            if (r10 == 0) goto L90
            if (r11 != 0) goto L15
            goto L90
        L15:
            int r2 = r10.size()
            int r3 = r11.size()
            if (r2 != 0) goto L22
            if (r3 != 0) goto L22
            return r1
        L22:
            if (r2 == 0) goto L90
            if (r3 != 0) goto L28
            goto L90
        L28:
            r4 = r0
            r5 = r4
        L2a:
            if (r4 >= r2) goto L65
            java.lang.Object r6 = r10.get(r4)
            r7 = 0
            if (r6 == 0) goto L3c
            java.lang.Object r6 = r10.get(r4)
            android.net.wifi.ScanResult r6 = (android.net.wifi.ScanResult) r6
            java.lang.String r6 = r6.BSSID
            goto L3d
        L3c:
            r6 = r7
        L3d:
            if (r6 != 0) goto L40
            goto L62
        L40:
            r8 = r0
        L41:
            if (r8 >= r3) goto L62
            java.lang.Object r9 = r11.get(r8)
            if (r9 == 0) goto L52
            java.lang.Object r9 = r11.get(r8)
            android.net.wifi.ScanResult r9 = (android.net.wifi.ScanResult) r9
            java.lang.String r9 = r9.BSSID
            goto L53
        L52:
            r9 = r7
        L53:
            if (r9 != 0) goto L56
            goto L5f
        L56:
            boolean r9 = r6.equals(r9)
            if (r9 == 0) goto L5f
            int r5 = r5 + 1
            goto L62
        L5f:
            int r8 = r8 + 1
            goto L41
        L62:
            int r4 = r4 + 1
            goto L2a
        L65:
            boolean r10 = a.a.a.g.m.a.f310a
            if (r10 == 0) goto L88
            boolean r10 = a.a.a.g.m.a.f311b
            if (r10 == 0) goto L88
            a.a.a.g.e r10 = a.a.a.g.g.h()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r3 = "wifi same!"
            r11.append(r3)
            float r3 = (float) r5
            float r4 = (float) r2
            float r3 = r3 / r4
            r11.append(r3)
            java.lang.String r11 = r11.toString()
            r10.a(r11)
        L88:
            float r10 = (float) r5
            float r11 = (float) r2
            float r11 = r11 * r12
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 < 0) goto L90
            return r1
        L90:
            return r0
    }

    public static /* synthetic */ java.lang.Object b(a.a.a.g.l.b r0) {
            java.lang.Object r0 = r0.n
            return r0
    }

    public static /* synthetic */ android.os.Handler c(a.a.a.g.l.b r0) {
            android.os.Handler r0 = r0.p
            return r0
    }

    public static a.a.a.g.l.b i() {
            a.a.a.g.l.b r0 = a.a.a.g.l.b.C0018b.a()
            return r0
    }

    public final a.a.a.g.k a(a.a.a.g.k r4) {
            r3 = this;
            if (r4 == 0) goto Lc
            a.a.a.g.k r3 = new a.a.a.g.k
            java.util.List<android.net.wifi.ScanResult> r0 = r4.f295a
            long r1 = r4.f296b
            r3.<init>(r0, r1)
            return r3
        Lc:
            r3 = 0
            return r3
    }

    public android.net.wifi.WifiInfo a() {
            r5 = this;
            java.lang.String r0 = ""
            r1 = 0
            android.net.wifi.WifiManager r2 = r5.d     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto Lc
            android.net.wifi.WifiInfo r2 = r2.getConnectionInfo()     // Catch: java.lang.Throwable -> L3e
            goto Ld
        Lc:
            r2 = r1
        Ld:
            java.lang.String r5 = r5.a(r2, r1)     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L3e
            if (r5 == 0) goto L3e
            int r3 = r2.getRssi()     // Catch: java.lang.Throwable -> L3e
            r4 = -100
            if (r3 > r4) goto L1e
            goto L3e
        L1e:
            if (r5 == 0) goto L3d
            java.lang.String r3 = ":"
            java.lang.String r5 = r5.replace(r3, r0)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = "000000000000"
            boolean r3 = r3.equals(r5)     // Catch: java.lang.Throwable -> L3e
            if (r3 != 0) goto L3c
            boolean r0 = r0.equals(r5)     // Catch: java.lang.Throwable -> L3e
            if (r0 != 0) goto L3c
            java.lang.String r0 = "020000000000"
            boolean r5 = r0.equals(r5)     // Catch: java.lang.Throwable -> L3e
            if (r5 == 0) goto L3d
        L3c:
            return r1
        L3d:
            return r2
        L3e:
            return r1
    }

    @android.annotation.SuppressLint({"NewApi"})
    public java.lang.String a(int r36, boolean r37, a.a.a.g.k r38, int r39) {
            r35 = this;
            r1 = r35
            r2 = r36
            r3 = r38
            r4 = r39
            r5 = 0
            if (r3 == 0) goto L4f4
            int r6 = r38.c()
            r7 = 1
            if (r6 >= r7) goto L14
            goto L4f4
        L14:
            java.util.Random r6 = new java.util.Random     // Catch: java.lang.Throwable -> L4e9
            r6.<init>()     // Catch: java.lang.Throwable -> L4e9
            java.lang.StringBuffer r8 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L4e9
            r9 = 512(0x200, float:7.17E-43)
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L4e9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e9
            r9.<init>()     // Catch: java.lang.Throwable -> L4e9
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4e9
            r10.<init>()     // Catch: java.lang.Throwable -> L4e9
            android.net.wifi.WifiInfo r11 = r35.a()     // Catch: java.lang.Throwable -> L4e9
            java.lang.String r12 = r1.a(r11, r5)     // Catch: java.lang.Throwable -> L4e9
            java.lang.String r14 = ":"
            java.lang.String r15 = ""
            if (r11 == 0) goto L88
            if (r12 == 0) goto L88
            java.lang.String r12 = r12.replace(r14, r15)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            int r11 = r11.getRssi()     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            a.a.a.g.l.b r16 = i()     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.String r16 = r16.d()     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            if (r11 >= 0) goto L4d
            int r11 = -r11
        L4d:
            boolean r17 = a.a.a.g.m.a.f310a     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            if (r17 == 0) goto L85
            boolean r17 = a.a.a.g.m.a.f311b     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            if (r17 == 0) goto L85
            a.a.a.g.e r5 = a.a.a.g.g.h()     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r13.<init>()     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.String r7 = "wifi connected mac = "
            r13.append(r7)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r13.append(r12)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.String r7 = r13.toString()     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r5.a(r7)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            a.a.a.g.e r5 = a.a.a.g.g.h()     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r7.<init>()     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.String r13 = "wifi connected mac rssi= "
            r7.append(r13)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r7.append(r11)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r5.a(r7)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
        L85:
            r5 = r16
            goto L8b
        L88:
            r5 = 0
            r11 = -1
            r12 = 0
        L8b:
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r13 = 17
            r18 = 0
            r16 = r5
            if (r7 < r13) goto La6
            long r20 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Error -> L9e java.lang.Throwable -> L4e9
            r22 = 1000(0x3e8, double:4.94E-321)
            long r20 = r20 / r22
            goto La0
        L9e:
            r20 = r18
        La0:
            int r7 = (r20 > r18 ? 1 : (r20 == r18 ? 0 : -1))
            if (r7 <= 0) goto La8
            r7 = 1
            goto La9
        La6:
            r20 = r18
        La8:
            r7 = 0
        La9:
            if (r7 == 0) goto Lb2
            if (r7 == 0) goto Lb1
            if (r37 == 0) goto Lb1
            r7 = 1
            goto Lb2
        Lb1:
            r7 = 0
        Lb2:
            java.util.List<android.net.wifi.ScanResult> r13 = r3.f295a     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            int r13 = r13.size()     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            if (r13 <= r2) goto Lbe
            if (r2 >= r4) goto Lbf
            r13 = 1
            goto Lc0
        Lbe:
            r2 = r13
        Lbf:
            r13 = 0
        Lc0:
            r29 = r11
            r27 = r18
            r36 = 0
            r5 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r30 = 1
        Ld1:
            java.lang.String r11 = ";%d;"
            java.lang.String r4 = "|"
            if (r5 >= r2) goto L338
            int r25 = r25 + 1
            r37 = r2
            java.util.List<android.net.wifi.ScanResult> r2 = r3.f295a     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.Object r2 = r2.get(r5)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r31 = r13
            if (r2 == 0) goto L31c
            java.util.List<android.net.wifi.ScanResult> r2 = r3.f295a     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.Object r2 = r2.get(r5)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            android.net.wifi.ScanResult r2 = (android.net.wifi.ScanResult) r2     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            int r2 = r2.level     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            if (r2 != 0) goto Lf3
            goto L31c
        Lf3:
            if (r7 == 0) goto L169
            java.util.List<android.net.wifi.ScanResult> r2 = r3.f295a     // Catch: java.lang.Exception -> L10b java.lang.Throwable -> L4e9
            java.lang.Object r2 = r2.get(r5)     // Catch: java.lang.Exception -> L10b java.lang.Throwable -> L4e9
            android.net.wifi.ScanResult r2 = (android.net.wifi.ScanResult) r2     // Catch: java.lang.Exception -> L10b java.lang.Throwable -> L4e9
            r32 = r14
            long r13 = r2.timestamp     // Catch: java.lang.Exception -> L109 java.lang.Throwable -> L4e9
            long r13 = r20 - r13
            r33 = 1000000(0xf4240, double:4.940656E-318)
            long r13 = r13 / r33
            goto L118
        L109:
            r0 = move-exception
            goto L10e
        L10b:
            r0 = move-exception
            r32 = r14
        L10e:
            r2 = r0
            boolean r13 = a.a.a.g.m.a.f310a     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            if (r13 == 0) goto L116
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
        L116:
            r13 = r18
        L118:
            boolean r2 = a.a.a.g.m.a.f310a     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            if (r2 == 0) goto L13d
            boolean r33 = a.a.a.g.m.a.f311b     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            if (r33 == 0) goto L13d
            r33 = r7
            a.a.a.g.e r7 = a.a.a.g.g.h()     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r34 = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r6.<init>()     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.String r1 = "wifi noUpdateTime = "
            r6.append(r1)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r6.append(r13)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r7.a(r1)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            goto L141
        L13d:
            r34 = r6
            r33 = r7
        L141:
            java.lang.Long r1 = java.lang.Long.valueOf(r13)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r10.add(r1)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            int r1 = (r13 > r27 ? 1 : (r13 == r27 ? 0 : -1))
            if (r1 <= 0) goto L16f
            if (r2 == 0) goto L166
            a.a.a.g.e r1 = a.a.a.g.g.h()     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r2.<init>()     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.String r6 = "wifi maxScanTime = "
            r2.append(r6)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r2.append(r13)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r1.a(r2)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
        L166:
            r27 = r13
            goto L16f
        L169:
            r34 = r6
            r33 = r7
            r32 = r14
        L16f:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r2 = 23
            if (r1 < r2) goto L1a0
            java.util.List<android.net.wifi.ScanResult> r1 = r3.f295a     // Catch: java.lang.Throwable -> L19b
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L19b
            android.net.wifi.ScanResult r1 = (android.net.wifi.ScanResult) r1     // Catch: java.lang.Throwable -> L19b
            boolean r1 = r1.is80211mcResponder()     // Catch: java.lang.Throwable -> L19b
            if (r1 == 0) goto L1a0
            if (r22 != 0) goto L18b
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L19b
            r1.<init>()     // Catch: java.lang.Throwable -> L19b
            goto L18d
        L18b:
            r1 = r22
        L18d:
            r1.append(r5)     // Catch: java.lang.Throwable -> L196
            r1.append(r4)     // Catch: java.lang.Throwable -> L196
            r22 = r1
            goto L1a0
        L196:
            r0 = move-exception
            r2 = r0
            r22 = r1
            goto L19d
        L19b:
            r0 = move-exception
            r2 = r0
        L19d:
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
        L1a0:
            if (r30 == 0) goto L1aa
            java.lang.String r1 = "&wf="
            r8.append(r1)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r30 = 0
            goto L1b0
        L1aa:
            r8.append(r4)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r9.append(r4)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
        L1b0:
            java.util.List<android.net.wifi.ScanResult> r1 = r3.f295a     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            android.net.wifi.ScanResult r1 = (android.net.wifi.ScanResult) r1     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.String r1 = r1.BSSID     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            if (r1 == 0) goto L311
            r2 = r32
            java.lang.String r1 = r1.replace(r2, r15)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r8.append(r1)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r9.append(r1)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.util.List<android.net.wifi.ScanResult> r4 = r3.f295a     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            android.net.wifi.ScanResult r4 = (android.net.wifi.ScanResult) r4     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            int r4 = r4.level     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            if (r4 >= 0) goto L1d5
            int r4 = -r4
        L1d5:
            java.util.Locale r6 = java.util.Locale.CHINA     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r7 = 1
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r7 = 0
            r13[r7] = r4     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.String r4 = java.lang.String.format(r6, r11, r13)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r8.append(r4)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r9.append(r4)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            int r26 = r26 + 1
            if (r12 == 0) goto L20b
            boolean r1 = r12.equals(r1)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            if (r1 == 0) goto L20b
            java.util.List<android.net.wifi.ScanResult> r1 = r3.f295a     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            android.net.wifi.ScanResult r1 = (android.net.wifi.ScanResult) r1     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.String r1 = r1.capabilities     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r6 = r35
            boolean r1 = r6.a(r1)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r3.e = r1     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r11 = r26
            r1 = 1
            goto L210
        L20b:
            r6 = r35
            r11 = r36
            r1 = 0
        L210:
            if (r1 != 0) goto L2c0
            r1 = 30
            r4 = r24
            if (r4 != 0) goto L268
            r7 = 10
            r13 = r34
            int r7 = r13.nextInt(r7)     // Catch: java.lang.Exception -> L265 java.lang.Throwable -> L4e9
            r14 = 2
            if (r7 != r14) goto L325
            java.util.List<android.net.wifi.ScanResult> r7 = r3.f295a     // Catch: java.lang.Exception -> L265 java.lang.Throwable -> L4e9
            java.lang.Object r7 = r7.get(r5)     // Catch: java.lang.Exception -> L265 java.lang.Throwable -> L4e9
            android.net.wifi.ScanResult r7 = (android.net.wifi.ScanResult) r7     // Catch: java.lang.Exception -> L265 java.lang.Throwable -> L4e9
            java.lang.String r7 = r7.SSID     // Catch: java.lang.Exception -> L265 java.lang.Throwable -> L4e9
            if (r7 == 0) goto L325
            java.util.List<android.net.wifi.ScanResult> r7 = r3.f295a     // Catch: java.lang.Exception -> L265 java.lang.Throwable -> L4e9
            java.lang.Object r7 = r7.get(r5)     // Catch: java.lang.Exception -> L265 java.lang.Throwable -> L4e9
            android.net.wifi.ScanResult r7 = (android.net.wifi.ScanResult) r7     // Catch: java.lang.Exception -> L265 java.lang.Throwable -> L4e9
            java.lang.String r7 = r7.SSID     // Catch: java.lang.Exception -> L265 java.lang.Throwable -> L4e9
            int r7 = r7.length()     // Catch: java.lang.Exception -> L265 java.lang.Throwable -> L4e9
            if (r7 >= r1) goto L325
            java.util.List<android.net.wifi.ScanResult> r1 = r3.f295a     // Catch: java.lang.Exception -> L265 java.lang.Throwable -> L4e9
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Exception -> L265 java.lang.Throwable -> L4e9
            android.net.wifi.ScanResult r1 = (android.net.wifi.ScanResult) r1     // Catch: java.lang.Exception -> L265 java.lang.Throwable -> L4e9
            java.lang.String r1 = r1.SSID     // Catch: java.lang.Exception -> L265 java.lang.Throwable -> L4e9
            java.lang.String r1 = r6.b(r1)     // Catch: java.lang.Exception -> L265 java.lang.Throwable -> L4e9
            r8.append(r1)     // Catch: java.lang.Exception -> L265 java.lang.Throwable -> L4e9
            java.util.List<android.net.wifi.ScanResult> r1 = r3.f295a     // Catch: java.lang.Exception -> L265 java.lang.Throwable -> L4e9
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Exception -> L265 java.lang.Throwable -> L4e9
            android.net.wifi.ScanResult r1 = (android.net.wifi.ScanResult) r1     // Catch: java.lang.Exception -> L265 java.lang.Throwable -> L4e9
            java.lang.String r1 = r1.SSID     // Catch: java.lang.Exception -> L265 java.lang.Throwable -> L4e9
            java.lang.String r1 = r6.b(r1)     // Catch: java.lang.Exception -> L265 java.lang.Throwable -> L4e9
            r9.append(r1)     // Catch: java.lang.Exception -> L265 java.lang.Throwable -> L4e9
            r24 = 1
            goto L327
        L265:
            r0 = move-exception
            r1 = r0
            goto L2b8
        L268:
            r13 = r34
            r7 = 1
            r14 = 2
            if (r4 != r7) goto L325
            r14 = 20
            int r14 = r13.nextInt(r14)     // Catch: java.lang.Exception -> L265 java.lang.Throwable -> L4e9
            if (r14 != r7) goto L325
            java.util.List<android.net.wifi.ScanResult> r7 = r3.f295a     // Catch: java.lang.Exception -> L265 java.lang.Throwable -> L4e9
            java.lang.Object r7 = r7.get(r5)     // Catch: java.lang.Exception -> L265 java.lang.Throwable -> L4e9
            android.net.wifi.ScanResult r7 = (android.net.wifi.ScanResult) r7     // Catch: java.lang.Exception -> L265 java.lang.Throwable -> L4e9
            java.lang.String r7 = r7.SSID     // Catch: java.lang.Exception -> L265 java.lang.Throwable -> L4e9
            if (r7 == 0) goto L325
            java.util.List<android.net.wifi.ScanResult> r7 = r3.f295a     // Catch: java.lang.Exception -> L265 java.lang.Throwable -> L4e9
            java.lang.Object r7 = r7.get(r5)     // Catch: java.lang.Exception -> L265 java.lang.Throwable -> L4e9
            android.net.wifi.ScanResult r7 = (android.net.wifi.ScanResult) r7     // Catch: java.lang.Exception -> L265 java.lang.Throwable -> L4e9
            java.lang.String r7 = r7.SSID     // Catch: java.lang.Exception -> L265 java.lang.Throwable -> L4e9
            int r7 = r7.length()     // Catch: java.lang.Exception -> L265 java.lang.Throwable -> L4e9
            if (r7 >= r1) goto L325
            java.util.List<android.net.wifi.ScanResult> r1 = r3.f295a     // Catch: java.lang.Exception -> L265 java.lang.Throwable -> L4e9
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Exception -> L265 java.lang.Throwable -> L4e9
            android.net.wifi.ScanResult r1 = (android.net.wifi.ScanResult) r1     // Catch: java.lang.Exception -> L265 java.lang.Throwable -> L4e9
            java.lang.String r1 = r1.SSID     // Catch: java.lang.Exception -> L265 java.lang.Throwable -> L4e9
            java.lang.String r1 = r6.b(r1)     // Catch: java.lang.Exception -> L265 java.lang.Throwable -> L4e9
            r8.append(r1)     // Catch: java.lang.Exception -> L265 java.lang.Throwable -> L4e9
            java.util.List<android.net.wifi.ScanResult> r1 = r3.f295a     // Catch: java.lang.Exception -> L265 java.lang.Throwable -> L4e9
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Exception -> L265 java.lang.Throwable -> L4e9
            android.net.wifi.ScanResult r1 = (android.net.wifi.ScanResult) r1     // Catch: java.lang.Exception -> L265 java.lang.Throwable -> L4e9
            java.lang.String r1 = r1.SSID     // Catch: java.lang.Exception -> L265 java.lang.Throwable -> L4e9
            java.lang.String r1 = r6.b(r1)     // Catch: java.lang.Exception -> L265 java.lang.Throwable -> L4e9
            r9.append(r1)     // Catch: java.lang.Exception -> L265 java.lang.Throwable -> L4e9
            r24 = 2
            goto L327
        L2b8:
            boolean r7 = a.a.a.g.m.a.f310a     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            if (r7 == 0) goto L325
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            goto L325
        L2c0:
            r4 = r24
            r13 = r34
            boolean r1 = a.a.a.g.m.a.f310a     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            if (r1 == 0) goto L2ee
            boolean r1 = a.a.a.g.m.a.f311b     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            if (r1 == 0) goto L2ee
            a.a.a.g.e r1 = a.a.a.g.g.h()     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r7.<init>()     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.String r14 = "wifi str add connected ssid = "
            r7.append(r14)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.util.List<android.net.wifi.ScanResult> r14 = r3.f295a     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.Object r14 = r14.get(r5)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            android.net.wifi.ScanResult r14 = (android.net.wifi.ScanResult) r14     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.String r14 = r14.SSID     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r7.append(r14)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r1.a(r7)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
        L2ee:
            java.util.List<android.net.wifi.ScanResult> r1 = r3.f295a     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            android.net.wifi.ScanResult r1 = (android.net.wifi.ScanResult) r1     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.String r1 = r1.SSID     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.String r1 = r6.b(r1)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r8.append(r1)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.util.List<android.net.wifi.ScanResult> r1 = r3.f295a     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            android.net.wifi.ScanResult r1 = (android.net.wifi.ScanResult) r1     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.String r1 = r1.SSID     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.String r1 = r6.b(r1)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r9.append(r1)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            goto L325
        L311:
            r6 = r35
            r4 = r24
            r2 = r32
            r13 = r34
            r11 = r36
            goto L327
        L31c:
            r13 = r6
            r33 = r7
            r2 = r14
            r4 = r24
            r6 = r1
            r11 = r36
        L325:
            r24 = r4
        L327:
            int r5 = r5 + 1
            r4 = r39
            r14 = r2
            r1 = r6
            r36 = r11
            r6 = r13
            r13 = r31
            r7 = r33
            r2 = r37
            goto Ld1
        L338:
            r6 = r1
            r37 = r2
            r31 = r13
            r2 = r14
            java.lang.String r1 = r9.toString()     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r6.q = r1     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            boolean r1 = a.a.a.g.m.a.f310a     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            if (r1 == 0) goto L362
            a.a.a.g.e r1 = a.a.a.g.g.h()     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r5.<init>()     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.String r7 = "last wifi str = "
            r5.append(r7)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.String r7 = r6.q     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r5.append(r7)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r1.a(r5)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
        L362:
            if (r31 == 0) goto L3db
            r1 = r37
            r5 = 1
        L367:
            java.util.List<android.net.wifi.ScanResult> r7 = r3.f295a     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            if (r1 >= r7) goto L3db
            r7 = 1
            int r9 = r25 + 1
            java.util.List<android.net.wifi.ScanResult> r7 = r3.f295a     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.Object r7 = r7.get(r1)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            if (r7 == 0) goto L3d0
            java.util.List<android.net.wifi.ScanResult> r7 = r3.f295a     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.Object r7 = r7.get(r1)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            android.net.wifi.ScanResult r7 = (android.net.wifi.ScanResult) r7     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            int r7 = r7.level     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            if (r7 != 0) goto L387
            goto L3d0
        L387:
            if (r5 == 0) goto L390
            java.lang.String r5 = "&wf2="
            r8.append(r5)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r5 = 0
            goto L393
        L390:
            r8.append(r4)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
        L393:
            java.util.List<android.net.wifi.ScanResult> r7 = r3.f295a     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.Object r7 = r7.get(r1)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            android.net.wifi.ScanResult r7 = (android.net.wifi.ScanResult) r7     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.String r7 = r7.BSSID     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            if (r7 == 0) goto L3c9
            java.lang.String r7 = r7.replace(r2, r15)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r8.append(r7)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.util.List<android.net.wifi.ScanResult> r7 = r3.f295a     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.Object r7 = r7.get(r1)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            android.net.wifi.ScanResult r7 = (android.net.wifi.ScanResult) r7     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            int r7 = r7.level     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            if (r7 >= 0) goto L3b3
            int r7 = -r7
        L3b3:
            java.util.Locale r13 = java.util.Locale.CHINA     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r32 = r2
            r14 = 1
            java.lang.Object[] r2 = new java.lang.Object[r14]     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r14 = 0
            r2[r14] = r7     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.String r2 = java.lang.String.format(r13, r11, r2)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r8.append(r2)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            goto L3cb
        L3c9:
            r32 = r2
        L3cb:
            r2 = r39
            if (r9 < r2) goto L3d4
            goto L3db
        L3d0:
            r32 = r2
            r2 = r39
        L3d4:
            int r1 = r1 + 1
            r25 = r9
            r2 = r32
            goto L367
        L3db:
            if (r30 != 0) goto L4e7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r1.<init>()     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.String r2 = "&wf_n="
            r1.append(r2)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r11 = r36
            r1.append(r11)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r8.append(r1)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            if (r22 == 0) goto L401
            java.lang.String r1 = "&wf_mc="
            r8.append(r1)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.String r1 = r22.toString()     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r8.append(r1)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
        L401:
            if (r12 == 0) goto L41c
            r1 = r29
            r2 = -1
            if (r1 == r2) goto L41c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r2.<init>()     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.String r5 = "&wf_rs="
            r2.append(r5)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r2.append(r1)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r8.append(r1)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
        L41c:
            r1 = 10
            int r1 = (r27 > r1 ? 1 : (r27 == r1 ? 0 : -1))
            if (r1 <= 0) goto L4a9
            int r1 = r10.size()     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            if (r1 <= 0) goto L4a9
            r1 = 0
            java.lang.Object r2 = r10.get(r1)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            long r1 = r2.longValue()     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            int r1 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r1 <= 0) goto L4a9
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r2 = 128(0x80, float:1.8E-43)
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.String r2 = "&wf_ut="
            r1.append(r2)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r7 = 0
            java.lang.Object r2 = r10.get(r7)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.util.Iterator r5 = r10.iterator()     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r9 = 1
        L44f:
            boolean r10 = r5.hasNext()     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            if (r10 == 0) goto L47e
            java.lang.Object r10 = r5.next()     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.Long r10 = (java.lang.Long) r10     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            if (r9 == 0) goto L466
            long r9 = r10.longValue()     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r1.append(r9)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r9 = r7
            goto L47a
        L466:
            long r12 = r10.longValue()     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            long r20 = r2.longValue()     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            long r12 = r12 - r20
            int r10 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r10 == 0) goto L47a
            r1.append(r15)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r1.append(r12)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
        L47a:
            r1.append(r4)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            goto L44f
        L47e:
            boolean r2 = a.a.a.g.m.a.f310a     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            if (r2 == 0) goto L4a2
            boolean r2 = a.a.a.g.m.a.f311b     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            if (r2 == 0) goto L4a2
            a.a.a.g.e r2 = a.a.a.g.g.h()     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r4.<init>()     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.String r5 = "wifi scantime list str = "
            r4.append(r5)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r4.append(r5)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r2.a(r4)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
        L4a2:
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r8.append(r1)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
        L4a9:
            java.lang.String r1 = "&wf_st="
            r8.append(r1)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            long r1 = r3.f296b     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r8.append(r1)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.String r1 = "&wf_et="
            r8.append(r1)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            long r1 = r3.f297c     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r8.append(r1)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.String r1 = "&wf_vt="
            r8.append(r1)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            long r1 = r6.i     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r8.append(r1)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            if (r11 <= 0) goto L4d6
            r1 = 1
            r3.d = r1     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            java.lang.String r1 = "&wf_en="
            r8.append(r1)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            boolean r1 = r3.e     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r8.append(r1)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
        L4d6:
            if (r16 == 0) goto L4e2
            java.lang.String r1 = "&wf_gw="
            r8.append(r1)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            r1 = r16
            r8.append(r1)     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
        L4e2:
            java.lang.String r1 = r8.toString()     // Catch: java.lang.Throwable -> L4e9 java.lang.Throwable -> L4e9
            return r1
        L4e7:
            r1 = 0
            return r1
        L4e9:
            r0 = move-exception
            r1 = r0
            boolean r2 = a.a.a.g.m.a.f310a
            if (r2 == 0) goto L4f2
            r1.printStackTrace()
        L4f2:
            r1 = 0
            return r1
        L4f4:
            r1 = r5
            return r1
    }

    public final java.lang.String a(long r6) {
            r5 = this;
            java.lang.StringBuffer r5 = new java.lang.StringBuffer
            r5.<init>()
            r0 = 255(0xff, double:1.26E-321)
            long r2 = r6 & r0
            int r2 = (int) r2
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r5.append(r2)
            r2 = 46
            r5.append(r2)
            r3 = 8
            long r3 = r6 >> r3
            long r3 = r3 & r0
            int r3 = (int) r3
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r5.append(r3)
            r5.append(r2)
            r3 = 16
            long r3 = r6 >> r3
            long r3 = r3 & r0
            int r3 = (int) r3
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r5.append(r3)
            r5.append(r2)
            r2 = 24
            long r6 = r6 >> r2
            long r6 = r6 & r0
            int r6 = (int) r6
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            return r5
    }

    public java.lang.String a(a.a.a.g.k r28, int r29, java.lang.String r30, boolean r31, int r32) {
            r27 = this;
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r32
            int r0 = r28.c()
            r5 = 0
            r6 = 1
            if (r0 >= r6) goto L11
            return r5
        L11:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r8 = 19
            r9 = 0
            if (r0 < r8) goto L2d
            long r12 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Error -> L26
            r14 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 / r14
            goto L27
        L26:
            r12 = r9
        L27:
            int r0 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r0 <= 0) goto L2e
            r8 = r6
            goto L2f
        L2d:
            r12 = r9
        L2e:
            r8 = 0
        L2f:
            java.lang.StringBuffer r14 = new java.lang.StringBuffer
            r0 = 512(0x200, float:7.17E-43)
            r14.<init>(r0)
            java.util.List<android.net.wifi.ScanResult> r0 = r1.f295a
            int r15 = r0.size()
            r0 = r6
            r16 = r9
            r9 = 0
            r10 = 0
            r18 = 0
            r19 = 0
        L45:
            java.lang.String r5 = ";%d;"
            java.lang.String r11 = ":"
            java.lang.String r6 = ""
            java.lang.String r4 = "|"
            if (r9 >= r15) goto L153
            r20 = r15
            java.util.List<android.net.wifi.ScanResult> r15 = r1.f295a
            java.lang.Object r15 = r15.get(r9)
            if (r15 == 0) goto L140
            java.util.List<android.net.wifi.ScanResult> r15 = r1.f295a
            java.lang.Object r15 = r15.get(r9)
            android.net.wifi.ScanResult r15 = (android.net.wifi.ScanResult) r15
            int r15 = r15.level
            if (r15 != 0) goto L67
            goto L140
        L67:
            int r10 = r10 + 1
            if (r0 == 0) goto L72
            java.lang.String r0 = "&wf="
            r14.append(r0)
            r15 = 0
            goto L76
        L72:
            r14.append(r4)
            r15 = r0
        L76:
            java.util.List<android.net.wifi.ScanResult> r0 = r1.f295a
            java.lang.Object r0 = r0.get(r9)
            android.net.wifi.ScanResult r0 = (android.net.wifi.ScanResult) r0
            java.lang.String r0 = r0.BSSID
            java.lang.String r0 = r0.replace(r11, r6)
            r14.append(r0)
            if (r3 == 0) goto L91
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L91
            r19 = r10
        L91:
            java.util.List<android.net.wifi.ScanResult> r0 = r1.f295a
            java.lang.Object r0 = r0.get(r9)
            android.net.wifi.ScanResult r0 = (android.net.wifi.ScanResult) r0
            int r0 = r0.level
            if (r0 >= 0) goto L9e
            int r0 = -r0
        L9e:
            java.util.Locale r3 = java.util.Locale.CHINA
            r21 = r4
            r22 = r10
            r4 = 1
            java.lang.Object[] r10 = new java.lang.Object[r4]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4 = 0
            r10[r4] = r0
            java.lang.String r0 = java.lang.String.format(r3, r5, r10)
            r14.append(r0)
            int r3 = r18 + 1
            if (r8 == 0) goto L130
            java.util.List<android.net.wifi.ScanResult> r0 = r1.f295a     // Catch: java.lang.Throwable -> Lcf
            java.lang.Object r0 = r0.get(r9)     // Catch: java.lang.Throwable -> Lcf
            android.net.wifi.ScanResult r0 = (android.net.wifi.ScanResult) r0     // Catch: java.lang.Throwable -> Lcf
            r23 = r5
            long r4 = r0.timestamp     // Catch: java.lang.Throwable -> Lcd
            long r4 = r12 - r4
            r24 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r4 / r24
            goto Ldb
        Lcd:
            r0 = move-exception
            goto Ld2
        Lcf:
            r0 = move-exception
            r23 = r5
        Ld2:
            boolean r4 = a.a.a.g.m.a.f310a
            if (r4 == 0) goto Ld9
            r0.printStackTrace()
        Ld9:
            r4 = 0
        Ldb:
            boolean r0 = a.a.a.g.m.a.f310a
            if (r0 == 0) goto L100
            boolean r10 = a.a.a.g.m.a.f311b
            if (r10 == 0) goto L100
            a.a.a.g.e r10 = a.a.a.g.g.h()
            r24 = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r25 = r12
            java.lang.String r12 = "wifi noUpdateTime = "
            r8.append(r12)
            r8.append(r4)
            java.lang.String r8 = r8.toString()
            r10.a(r8)
            goto L104
        L100:
            r24 = r8
            r25 = r12
        L104:
            java.lang.Long r8 = java.lang.Long.valueOf(r4)
            r7.add(r8)
            int r8 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r8 <= 0) goto L136
            if (r0 == 0) goto L12d
            boolean r0 = a.a.a.g.m.a.f311b
            if (r0 == 0) goto L12d
            a.a.a.g.e r0 = a.a.a.g.g.h()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "wifi maxScanTime = "
            r8.append(r10)
            r8.append(r4)
            java.lang.String r8 = r8.toString()
            r0.a(r8)
        L12d:
            r16 = r4
            goto L136
        L130:
            r23 = r5
            r24 = r8
            r25 = r12
        L136:
            if (r3 <= r2) goto L13a
            r0 = r15
            goto L15b
        L13a:
            r18 = r3
            r0 = r15
            r10 = r22
            goto L144
        L140:
            r24 = r8
            r25 = r12
        L144:
            int r9 = r9 + 1
            r3 = r30
            r4 = r32
            r15 = r20
            r8 = r24
            r12 = r25
            r6 = 1
            goto L45
        L153:
            r21 = r4
            r23 = r5
            r20 = r15
            r3 = r18
        L15b:
            r4 = r19
            if (r31 == 0) goto L164
            java.lang.String r0 = r14.toString()
            return r0
        L164:
            if (r4 <= 0) goto L16e
            java.lang.String r5 = "&wf_n="
            r14.append(r5)
            r14.append(r4)
        L16e:
            if (r3 <= r2) goto L1c3
            r4 = 1
            int r2 = r2 + r4
            r4 = r32
            r5 = r21
            if (r4 <= r2) goto L1c5
            r8 = r3
            r2 = r20
        L17b:
            if (r8 >= r2) goto L1c5
            if (r8 != r3) goto L185
            java.lang.String r9 = "&wf2="
            r14.append(r9)
            goto L188
        L185:
            r14.append(r5)
        L188:
            java.util.List<android.net.wifi.ScanResult> r9 = r1.f295a
            java.lang.Object r9 = r9.get(r8)
            android.net.wifi.ScanResult r9 = (android.net.wifi.ScanResult) r9
            java.lang.String r9 = r9.BSSID
            java.lang.String r9 = r9.replace(r11, r6)
            r14.append(r9)
            java.util.List<android.net.wifi.ScanResult> r9 = r1.f295a
            java.lang.Object r9 = r9.get(r8)
            android.net.wifi.ScanResult r9 = (android.net.wifi.ScanResult) r9
            int r9 = r9.level
            if (r9 >= 0) goto L1a6
            int r9 = -r9
        L1a6:
            java.util.Locale r10 = java.util.Locale.CHINA
            r12 = 1
            java.lang.Object[] r13 = new java.lang.Object[r12]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r15 = 0
            r13[r15] = r9
            r9 = r23
            java.lang.String r10 = java.lang.String.format(r10, r9, r13)
            r14.append(r10)
            if (r8 < r4) goto L1be
            goto L1c6
        L1be:
            int r8 = r8 + 1
            r23 = r9
            goto L17b
        L1c3:
            r5 = r21
        L1c5:
            r12 = 1
        L1c6:
            if (r0 == 0) goto L1ca
            r1 = 0
            return r1
        L1ca:
            r0 = 10
            int r0 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r0 <= 0) goto L262
            int r0 = r7.size()
            if (r0 <= 0) goto L262
            r1 = 0
            java.lang.Object r0 = r7.get(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            r8 = 0
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L262
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r2 = 128(0x80, float:1.8E-43)
            r0.<init>(r2)
            java.lang.String r2 = "&wf_ut="
            r0.append(r2)
            java.lang.Object r2 = r7.get(r1)
            java.lang.Long r2 = (java.lang.Long) r2
            java.util.Iterator r3 = r7.iterator()
        L1fd:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L237
            java.lang.Object r4 = r3.next()
            java.lang.Long r4 = (java.lang.Long) r4
            long r7 = r4.longValue()
            if (r12 == 0) goto L216
            r0.append(r7)
            r12 = r1
            r9 = 0
            goto L233
        L216:
            long r9 = r2.longValue()
            long r7 = r7 - r9
            r9 = 0
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 == 0) goto L233
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
        L233:
            r0.append(r5)
            goto L1fd
        L237:
            boolean r1 = a.a.a.g.m.a.f310a
            if (r1 == 0) goto L25b
            boolean r1 = a.a.a.g.m.a.f311b
            if (r1 == 0) goto L25b
            a.a.a.g.e r1 = a.a.a.g.g.h()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "wifi scantime list str = "
            r2.append(r3)
            java.lang.String r3 = r0.toString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.a(r2)
        L25b:
            java.lang.String r0 = r0.toString()
            r14.append(r0)
        L262:
            java.lang.String r0 = r14.toString()
            return r0
    }

    public synchronized java.lang.String a(android.net.wifi.WifiInfo r7, java.lang.String r8) {
            r6 = this;
            monitor-enter(r6)
            if (r7 != 0) goto L8
            if (r8 != 0) goto L8
            r7 = 0
            monitor-exit(r6)
            return r7
        L8:
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L27
            long r2 = r6.l     // Catch: java.lang.Throwable -> L27
            long r2 = r0 - r2
            r4 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L23
            if (r7 == 0) goto L1f
            java.lang.String r7 = r7.getBSSID()     // Catch: java.lang.Throwable -> L27
            r6.m = r7     // Catch: java.lang.Throwable -> L27
            goto L21
        L1f:
            r6.m = r8     // Catch: java.lang.Throwable -> L27
        L21:
            r6.l = r0     // Catch: java.lang.Throwable -> L27
        L23:
            java.lang.String r7 = r6.m     // Catch: java.lang.Throwable -> L27
            monitor-exit(r6)
            return r7
        L27:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }

    public void a(int r1) {
            r0 = this;
            r0.h = r1
            return
    }

    public void a(android.content.Context r4, java.util.List<java.lang.String> r5) {
            r3 = this;
            boolean r0 = r3.f306c
            if (r0 == 0) goto L5
            return
        L5:
            r3.g = r4
            android.content.Context r4 = r4.getApplicationContext()
            java.lang.String r0 = "wifi"
            java.lang.Object r4 = r4.getSystemService(r0)
            android.net.wifi.WifiManager r4 = (android.net.wifi.WifiManager) r4
            r3.d = r4
            a.a.a.g.l.b$c r4 = new a.a.a.g.l.b$c
            r0 = 0
            r4.<init>(r3, r0)
            r3.e = r4
            android.os.Handler r4 = r3.p
            if (r4 != 0) goto L2c
            android.os.Handler r4 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r4.<init>(r0)
            r3.p = r4
        L2c:
            if (r5 != 0) goto L33
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L33:
            java.lang.String r4 = "android.net.wifi.SCAN_RESULTS"
            boolean r0 = r5.contains(r4)
            if (r0 != 0) goto L3e
            r5.add(r4)
        L3e:
            java.util.Iterator r4 = r5.iterator()     // Catch: java.lang.Exception -> L5b
        L42:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Exception -> L5b
            if (r5 == 0) goto L63
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Exception -> L5b
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L5b
            android.content.Context r0 = r3.g     // Catch: java.lang.Exception -> L5b
            a.a.a.g.l.b$c r1 = r3.e     // Catch: java.lang.Exception -> L5b
            android.content.IntentFilter r2 = new android.content.IntentFilter     // Catch: java.lang.Exception -> L5b
            r2.<init>(r5)     // Catch: java.lang.Exception -> L5b
            r0.registerReceiver(r1, r2)     // Catch: java.lang.Exception -> L5b
            goto L42
        L5b:
            r4 = move-exception
            boolean r5 = a.a.a.g.m.a.f310a
            if (r5 == 0) goto L63
            r4.printStackTrace()
        L63:
            r4 = 1
            r3.f306c = r4
            boolean r3 = a.a.a.g.m.a.f310a
            if (r3 == 0) goto L77
            boolean r3 = a.a.a.g.m.a.f311b
            if (r3 == 0) goto L77
            a.a.a.g.e r3 = a.a.a.g.g.h()
            java.lang.String r4 = "wifimanager start ..."
            r3.a(r4)
        L77:
            return
    }

    public boolean a(a.a.a.g.k r6, a.a.a.g.k r7) {
            r5 = this;
            java.util.List<android.net.wifi.ScanResult> r5 = r6.f295a
            r0 = 0
            if (r5 == 0) goto L54
            if (r7 == 0) goto L54
            java.util.List<android.net.wifi.ScanResult> r1 = r7.f295a
            if (r1 == 0) goto L54
            int r5 = r5.size()
            java.util.List<android.net.wifi.ScanResult> r1 = r7.f295a
            int r1 = r1.size()
            int r5 = java.lang.Math.min(r5, r1)
            r1 = r0
        L1a:
            if (r1 >= r5) goto L52
            java.util.List<android.net.wifi.ScanResult> r2 = r6.f295a     // Catch: java.lang.Exception -> L49
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Exception -> L49
            if (r2 != 0) goto L25
            goto L46
        L25:
            java.util.List<android.net.wifi.ScanResult> r2 = r6.f295a     // Catch: java.lang.Exception -> L49
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Exception -> L49
            android.net.wifi.ScanResult r2 = (android.net.wifi.ScanResult) r2     // Catch: java.lang.Exception -> L49
            java.lang.String r2 = r2.BSSID     // Catch: java.lang.Exception -> L49
            java.util.List<android.net.wifi.ScanResult> r3 = r7.f295a     // Catch: java.lang.Exception -> L49
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Exception -> L49
            android.net.wifi.ScanResult r3 = (android.net.wifi.ScanResult) r3     // Catch: java.lang.Exception -> L49
            java.lang.String r3 = r3.BSSID     // Catch: java.lang.Exception -> L49
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L49
            if (r4 != 0) goto L46
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> L49
            if (r2 != 0) goto L46
            return r0
        L46:
            int r1 = r1 + 1
            goto L1a
        L49:
            r5 = move-exception
            boolean r6 = a.a.a.g.m.a.f310a
            if (r6 == 0) goto L51
            r5.printStackTrace()
        L51:
            return r0
        L52:
            r5 = 1
            return r5
        L54:
            return r0
    }

    public final boolean a(java.lang.String r2) {
            r1 = this;
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 == 0) goto L8
            r1 = 0
            goto L17
        L8:
            r1 = 2
            java.lang.String r0 = "wpa|wep"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r0, r1)
            java.util.regex.Matcher r1 = r1.matcher(r2)
            boolean r1 = r1.find()
        L17:
            return r1
    }

    public a.a.a.g.k b(long r6) {
            r5 = this;
            android.net.wifi.WifiManager r0 = r5.d
            if (r0 == 0) goto L99
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 >= 0) goto L99
            boolean r0 = a.a.a.g.m.a.f310a
            if (r0 == 0) goto L35
            boolean r1 = a.a.a.g.m.a.f311b
            if (r1 == 0) goto L35
            a.a.a.g.e r1 = a.a.a.g.g.h()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Wi-Fi diffTime = "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r3 = "mLastDiffTime = "
            r2.append(r3)
            long r3 = r5.k
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.a(r2)
        L35:
            long r1 = r5.k
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 != 0) goto L87
            if (r0 == 0) goto L6f
            boolean r1 = a.a.a.g.m.a.f311b
            if (r1 == 0) goto L6f
            a.a.a.g.e r1 = a.a.a.g.g.h()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "System.currentTimeMillis() = "
            r2.append(r3)
            long r3 = java.lang.System.currentTimeMillis()
            r2.append(r3)
            java.lang.String r3 = "wifi diffTime = "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r3 = ", mScanTime = "
            r2.append(r3)
            long r3 = r5.j
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.a(r2)
        L6f:
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r5.j
            long r1 = r1 - r3
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 <= 0) goto L99
            if (r0 == 0) goto L96
            boolean r0 = a.a.a.g.m.a.f311b
            if (r0 == 0) goto L96
            a.a.a.g.e r0 = a.a.a.g.g.h()
            java.lang.String r1 = "time is over"
            goto L93
        L87:
            if (r0 == 0) goto L96
            boolean r0 = a.a.a.g.m.a.f311b
            if (r0 == 0) goto L96
            a.a.a.g.e r0 = a.a.a.g.g.h()
            java.lang.String r1 = "diffTime is changed"
        L93:
            r0.a(r1)
        L96:
            r5.g()
        L99:
            r5.k = r6
            a.a.a.g.k r5 = r5.f
            return r5
    }

    public java.lang.String b() {
            r7 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            a.a.a.g.l.b r1 = i()
            android.net.wifi.WifiInfo r1 = r1.a()
            r2 = 0
            java.lang.String r7 = r7.a(r1, r2)
            if (r1 == 0) goto L8d
            if (r7 == 0) goto L8d
            java.lang.String r3 = ""
            java.lang.String r4 = ":"
            java.lang.String r7 = r7.replace(r4, r3)
            int r4 = r1.getRssi()
            a.a.a.g.l.b r5 = i()
            java.lang.String r5 = r5.d()
            if (r4 >= 0) goto L2d
            int r4 = -r4
        L2d:
            if (r7 == 0) goto L8d
            r6 = 100
            if (r4 >= r6) goto L8d
            java.lang.String r6 = "020000000000"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L8d
            java.lang.String r2 = "&wf="
            r0.append(r2)
            r0.append(r7)
            java.lang.String r7 = ";"
            r0.append(r7)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            r2.append(r4)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r1 = r1.getSSID()
            if (r1 == 0) goto L77
            java.lang.String r2 = "&"
            boolean r3 = r1.contains(r2)
            if (r3 != 0) goto L71
            boolean r7 = r1.contains(r7)
            if (r7 == 0) goto L77
        L71:
            java.lang.String r7 = "_"
            java.lang.String r1 = r1.replace(r2, r7)
        L77:
            r0.append(r1)
            java.lang.String r7 = "&wf_n=1"
            r0.append(r7)
            if (r5 == 0) goto L89
            java.lang.String r7 = "&wf_gw="
            r0.append(r7)
            r0.append(r5)
        L89:
            java.lang.String r2 = r0.toString()
        L8d:
            return r2
    }

    public final java.lang.String b(java.lang.String r3) {
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

    public a.a.a.g.k c() {
            r5 = this;
            java.lang.Object r0 = r5.o
            monitor-enter(r0)
            a.a.a.g.k r1 = r5.f     // Catch: java.lang.Throwable -> L36
            a.a.a.g.k r1 = r5.a(r1)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L12
            boolean r0 = r1.b()
            if (r0 != 0) goto L35
        L12:
            android.net.wifi.WifiManager r0 = r5.d     // Catch: java.lang.Exception -> L2d
            if (r0 == 0) goto L23
            a.a.a.g.k r2 = new a.a.a.g.k     // Catch: java.lang.Exception -> L2d
            java.util.List r0 = r0.getScanResults()     // Catch: java.lang.Exception -> L2d
            long r3 = r5.j     // Catch: java.lang.Exception -> L2d
            r2.<init>(r0, r3)     // Catch: java.lang.Exception -> L2d
            r1 = r2
            goto L35
        L23:
            a.a.a.g.k r5 = new a.a.a.g.k     // Catch: java.lang.Exception -> L2d
            r0 = 0
            r2 = 0
            r5.<init>(r0, r2)     // Catch: java.lang.Exception -> L2d
            r1 = r5
            goto L35
        L2d:
            r5 = move-exception
            boolean r0 = a.a.a.g.m.a.f310a
            if (r0 == 0) goto L35
            r5.printStackTrace()
        L35:
            return r1
        L36:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            throw r5
    }

    public final java.lang.String d() {
            r2 = this;
            android.net.wifi.WifiManager r0 = r2.d
            if (r0 == 0) goto L12
            android.net.DhcpInfo r0 = r0.getDhcpInfo()
            if (r0 == 0) goto L12
            int r0 = r0.gateway
            long r0 = (long) r0
            java.lang.String r2 = r2.a(r0)
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    public long e() {
            r2 = this;
            long r0 = r2.j
            return r0
    }

    public final void f() {
            r15 = this;
            android.net.wifi.WifiManager r0 = r15.d
            if (r0 != 0) goto L5
            return
        L5:
            java.util.List r0 = r0.getScanResults()     // Catch: java.lang.Exception -> L15b
            boolean r1 = a.a.a.g.m.a.f310a     // Catch: java.lang.Exception -> L15b
            if (r1 == 0) goto L13b
            boolean r1 = a.a.a.g.m.a.f311b     // Catch: java.lang.Exception -> L15b
            if (r1 == 0) goto L13b
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch: java.lang.Exception -> L15b
            java.lang.String r2 = "yyyy-MM-dd HH:mm:ss"
            r1.<init>(r2)     // Catch: java.lang.Exception -> L15b
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L15b
            if (r0 == 0) goto L13b
            int r4 = r0.size()     // Catch: java.lang.Exception -> L15b
            if (r4 <= 0) goto L13b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L15b
            r4.<init>()     // Catch: java.lang.Exception -> L15b
            r5 = 0
            r7 = 0
            r9 = r5
            r8 = r7
        L2e:
            int r11 = r0.size()     // Catch: java.lang.Exception -> L15b
            if (r8 >= r11) goto L112
            r11 = 1000000(0xf4240, double:4.940656E-318)
            if (r8 != 0) goto La6
            java.lang.Object r9 = r0.get(r7)     // Catch: java.lang.Exception -> L45
            android.net.wifi.ScanResult r9 = (android.net.wifi.ScanResult) r9     // Catch: java.lang.Exception -> L45
            long r9 = r9.timestamp     // Catch: java.lang.Exception -> L45
            long r9 = r2 - r9
            long r9 = r9 / r11
            goto L4a
        L45:
            r9 = move-exception
            r9.printStackTrace()     // Catch: java.lang.Exception -> L15b
            r9 = r5
        L4a:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L15b
            r13.<init>()     // Catch: java.lang.Exception -> L15b
            java.lang.Object r14 = r0.get(r7)     // Catch: java.lang.Exception -> L15b
            android.net.wifi.ScanResult r14 = (android.net.wifi.ScanResult) r14     // Catch: java.lang.Exception -> L15b
            java.lang.String r14 = r14.BSSID     // Catch: java.lang.Exception -> L15b
            r13.append(r14)     // Catch: java.lang.Exception -> L15b
            java.lang.String r14 = ";"
            r13.append(r14)     // Catch: java.lang.Exception -> L15b
            java.lang.Object r14 = r0.get(r7)     // Catch: java.lang.Exception -> L15b
            android.net.wifi.ScanResult r14 = (android.net.wifi.ScanResult) r14     // Catch: java.lang.Exception -> L15b
            int r14 = r14.level     // Catch: java.lang.Exception -> L15b
            int r14 = java.lang.Math.abs(r14)     // Catch: java.lang.Exception -> L15b
            r13.append(r14)     // Catch: java.lang.Exception -> L15b
            java.lang.String r14 = ";"
            r13.append(r14)     // Catch: java.lang.Exception -> L15b
            java.lang.Object r14 = r0.get(r7)     // Catch: java.lang.Exception -> L15b
            android.net.wifi.ScanResult r14 = (android.net.wifi.ScanResult) r14     // Catch: java.lang.Exception -> L15b
            java.lang.String r14 = r14.SSID     // Catch: java.lang.Exception -> L15b
            java.lang.String r14 = r14.trim()     // Catch: java.lang.Exception -> L15b
            r13.append(r14)     // Catch: java.lang.Exception -> L15b
            java.lang.String r14 = ";"
            r13.append(r14)     // Catch: java.lang.Exception -> L15b
            java.lang.Object r14 = r0.get(r7)     // Catch: java.lang.Exception -> L15b
            android.net.wifi.ScanResult r14 = (android.net.wifi.ScanResult) r14     // Catch: java.lang.Exception -> L15b
            int r14 = r14.frequency     // Catch: java.lang.Exception -> L15b
            r13.append(r14)     // Catch: java.lang.Exception -> L15b
            java.lang.String r14 = ";"
            r13.append(r14)     // Catch: java.lang.Exception -> L15b
            r13.append(r9)     // Catch: java.lang.Exception -> L15b
            java.lang.String r14 = "|"
            r13.append(r14)     // Catch: java.lang.Exception -> L15b
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Exception -> L15b
            r4.append(r13)     // Catch: java.lang.Exception -> L15b
        La6:
            java.lang.Object r13 = r0.get(r8)     // Catch: java.lang.Exception -> L15b
            android.net.wifi.ScanResult r13 = (android.net.wifi.ScanResult) r13     // Catch: java.lang.Exception -> L15b
            long r13 = r13.timestamp     // Catch: java.lang.Exception -> L15b
            long r13 = r2 - r13
            long r13 = r13 / r11
            long r13 = r13 - r9
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L15b
            r11.<init>()     // Catch: java.lang.Exception -> L15b
            java.lang.Object r12 = r0.get(r8)     // Catch: java.lang.Exception -> L15b
            android.net.wifi.ScanResult r12 = (android.net.wifi.ScanResult) r12     // Catch: java.lang.Exception -> L15b
            java.lang.String r12 = r12.BSSID     // Catch: java.lang.Exception -> L15b
            r11.append(r12)     // Catch: java.lang.Exception -> L15b
            java.lang.String r12 = ";"
            r11.append(r12)     // Catch: java.lang.Exception -> L15b
            java.lang.Object r12 = r0.get(r8)     // Catch: java.lang.Exception -> L15b
            android.net.wifi.ScanResult r12 = (android.net.wifi.ScanResult) r12     // Catch: java.lang.Exception -> L15b
            int r12 = r12.level     // Catch: java.lang.Exception -> L15b
            int r12 = java.lang.Math.abs(r12)     // Catch: java.lang.Exception -> L15b
            r11.append(r12)     // Catch: java.lang.Exception -> L15b
            java.lang.String r12 = ";"
            r11.append(r12)     // Catch: java.lang.Exception -> L15b
            java.lang.Object r12 = r0.get(r8)     // Catch: java.lang.Exception -> L15b
            android.net.wifi.ScanResult r12 = (android.net.wifi.ScanResult) r12     // Catch: java.lang.Exception -> L15b
            java.lang.String r12 = r12.SSID     // Catch: java.lang.Exception -> L15b
            java.lang.String r12 = r12.trim()     // Catch: java.lang.Exception -> L15b
            r11.append(r12)     // Catch: java.lang.Exception -> L15b
            java.lang.String r12 = ";"
            r11.append(r12)     // Catch: java.lang.Exception -> L15b
            java.lang.Object r12 = r0.get(r8)     // Catch: java.lang.Exception -> L15b
            android.net.wifi.ScanResult r12 = (android.net.wifi.ScanResult) r12     // Catch: java.lang.Exception -> L15b
            int r12 = r12.frequency     // Catch: java.lang.Exception -> L15b
            r11.append(r12)     // Catch: java.lang.Exception -> L15b
            java.lang.String r12 = ";"
            r11.append(r12)     // Catch: java.lang.Exception -> L15b
            r11.append(r13)     // Catch: java.lang.Exception -> L15b
            java.lang.String r12 = "|"
            r11.append(r12)     // Catch: java.lang.Exception -> L15b
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Exception -> L15b
            r4.append(r11)     // Catch: java.lang.Exception -> L15b
            int r8 = r8 + 1
            goto L2e
        L112:
            java.lang.String r5 = "\t"
            r4.append(r5)     // Catch: java.lang.Exception -> L15b
            java.util.Date r5 = new java.util.Date     // Catch: java.lang.Exception -> L15b
            r5.<init>(r2)     // Catch: java.lang.Exception -> L15b
            java.lang.String r1 = r1.format(r5)     // Catch: java.lang.Exception -> L15b
            r4.append(r1)     // Catch: java.lang.Exception -> L15b
            java.lang.String r1 = "\t"
            r4.append(r1)     // Catch: java.lang.Exception -> L15b
            r4.append(r2)     // Catch: java.lang.Exception -> L15b
            java.lang.String r1 = "\tnull\n"
            r4.append(r1)     // Catch: java.lang.Exception -> L15b
            a.a.a.g.e r1 = a.a.a.g.g.h()     // Catch: java.lang.Exception -> L15b
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Exception -> L15b
            r1.a(r2)     // Catch: java.lang.Exception -> L15b
        L13b:
            if (r0 == 0) goto L15a
            a.a.a.g.k r1 = new a.a.a.g.k
            long r2 = java.lang.System.currentTimeMillis()
            r1.<init>(r0, r2)
            java.lang.Object r0 = r15.o
            monitor-enter(r0)
            a.a.a.g.k r2 = r15.f     // Catch: java.lang.Throwable -> L157
            if (r2 == 0) goto L153
            boolean r2 = r15.a(r1, r2)     // Catch: java.lang.Throwable -> L157
            if (r2 != 0) goto L155
        L153:
            r15.f = r1     // Catch: java.lang.Throwable -> L157
        L155:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L157
            goto L15a
        L157:
            r15 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L157
            throw r15
        L15a:
            return
        L15b:
            r15 = move-exception
            boolean r0 = a.a.a.g.m.a.f310a
            if (r0 == 0) goto L163
            r15.printStackTrace()
        L163:
            return
    }

    public final void g() {
            r3 = this;
            android.net.wifi.WifiManager r0 = r3.d     // Catch: java.lang.Exception -> L2d
            boolean r0 = r0.isWifiEnabled()     // Catch: java.lang.Exception -> L2d
            if (r0 != 0) goto L16
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L2d
            r1 = 17
            if (r0 <= r1) goto L31
            android.net.wifi.WifiManager r0 = r3.d     // Catch: java.lang.Exception -> L2d
            boolean r0 = r0.isScanAlwaysAvailable()     // Catch: java.lang.Exception -> L2d
            if (r0 == 0) goto L31
        L16:
            android.net.wifi.WifiManager r0 = r3.d     // Catch: java.lang.Exception -> L2d
            r0.startScan()     // Catch: java.lang.Exception -> L2d
            boolean r0 = a.a.a.g.m.a.f310a     // Catch: java.lang.Exception -> L2d
            if (r0 == 0) goto L31
            boolean r0 = a.a.a.g.m.a.f311b     // Catch: java.lang.Exception -> L2d
            if (r0 == 0) goto L31
            a.a.a.g.e r0 = a.a.a.g.g.h()     // Catch: java.lang.Exception -> L2d
            java.lang.String r1 = "wifimanager start scan ..."
            r0.a(r1)     // Catch: java.lang.Exception -> L2d
            goto L31
        L2d:
            r0 = move-exception
            r0.printStackTrace()
        L31:
            long r0 = java.lang.System.currentTimeMillis()
            r3.j = r0
            java.lang.Object r0 = r3.n
            monitor-enter(r0)
            int r1 = r3.h     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L47
            if (r1 == 0) goto L4b
            java.lang.Object r3 = r3.n     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L47
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L47
            r3.wait(r1)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L47
            goto L4b
        L45:
            r3 = move-exception
            goto L4d
        L47:
            r3 = move-exception
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L45
        L4b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            return
        L4d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            throw r3
    }

    public void h() {
            r2 = this;
            boolean r0 = r2.f306c
            if (r0 != 0) goto L5
            return
        L5:
            android.content.Context r0 = r2.g     // Catch: java.lang.Exception -> L11
            a.a.a.g.l.b$c r1 = r2.e     // Catch: java.lang.Exception -> L11
            r0.unregisterReceiver(r1)     // Catch: java.lang.Exception -> L11
            r0 = 0
            r2.i = r0     // Catch: java.lang.Exception -> L11
            goto L19
        L11:
            r0 = move-exception
            boolean r1 = a.a.a.g.m.a.f310a
            if (r1 == 0) goto L19
            r0.printStackTrace()
        L19:
            r0 = 0
            r2.e = r0
            r2.d = r0
            r0 = 0
            r2.f306c = r0
            boolean r2 = a.a.a.g.m.a.f310a
            if (r2 == 0) goto L32
            boolean r2 = a.a.a.g.m.a.f311b
            if (r2 == 0) goto L32
            a.a.a.g.e r2 = a.a.a.g.g.h()
            java.lang.String r0 = "wifimanager stop ..."
            r2.a(r0)
        L32:
            return
    }
}
