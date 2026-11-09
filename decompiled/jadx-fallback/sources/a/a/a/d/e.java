package a.a.a.d;

/* JADX INFO: loaded from: classes.dex */
public class e {
    public static final char[] m = null;
    public static a.a.a.d.e n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.util.concurrent.ConcurrentMap<java.lang.String, android.bluetooth.le.ScanResult> f127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public android.content.Context f128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public android.bluetooth.BluetoothAdapter f129c;
    public volatile boolean d;
    public long e;
    public java.lang.Object f;
    public long g;
    public int h;
    public java.lang.String i;
    public long j;
    public long k;
    public long l;

    public class a extends android.bluetooth.le.ScanCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.a.a.d.e f130a;

        public a(a.a.a.d.e r1) {
                r0 = this;
                r0.f130a = r1
                r0.<init>()
                return
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanResult(int r14, android.bluetooth.le.ScanResult r15) {
                r13 = this;
                a.a.a.d.e r14 = r13.f130a
                java.util.concurrent.ConcurrentMap r14 = a.a.a.d.e.a(r14)
                if (r14 == 0) goto Le2
                android.bluetooth.BluetoothDevice r14 = r15.getDevice()
                if (r14 == 0) goto Le2
                android.bluetooth.BluetoothDevice r14 = r15.getDevice()
                java.lang.String r14 = r14.getAddress()
                boolean r14 = android.text.TextUtils.isEmpty(r14)
                if (r14 != 0) goto Le2
                a.a.a.d.e r14 = r13.f130a
                long r0 = java.lang.System.currentTimeMillis()
                r14.g = r0
                a.a.a.d.e r14 = r13.f130a
                java.util.concurrent.ConcurrentMap r14 = a.a.a.d.e.a(r14)
                android.bluetooth.BluetoothDevice r0 = r15.getDevice()
                java.lang.String r0 = r0.getAddress()
                r14.put(r0, r15)
                long r0 = java.lang.System.currentTimeMillis()
                a.a.a.d.e r14 = r13.f130a
                long r2 = a.a.a.d.e.b(r14)
                long r0 = r0 - r2
                r2 = 800(0x320, double:3.953E-321)
                int r14 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r14 > 0) goto L4c
                r2 = -100
                int r14 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r14 >= 0) goto Ld2
            L4c:
                a.a.a.d.e r14 = r13.f130a
                java.util.concurrent.ConcurrentMap r14 = a.a.a.d.e.a(r14)
                java.util.Collection r14 = r14.values()
                r14.size()
                a.a.a.d.e r14 = r13.f130a
                long r0 = java.lang.System.currentTimeMillis()
                a.a.a.d.e.a(r14, r0)
                long r14 = r15.getTimestampNanos()
                r0 = 1000000(0xf4240, double:4.940656E-318)
                long r14 = r14 / r0
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 17
                r4 = 0
                if (r2 < r3) goto L78
                long r2 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Error -> L78
                long r2 = r2 / r0
                goto L79
            L78:
                r2 = r4
            L79:
                a.a.a.d.e r6 = r13.f130a
                java.util.concurrent.ConcurrentMap r6 = a.a.a.d.e.a(r6)
                java.util.Set r6 = r6.entrySet()
                java.util.Iterator r6 = r6.iterator()
            L87:
                boolean r7 = r6.hasNext()
                if (r7 == 0) goto Lc0
                java.lang.Object r7 = r6.next()
                java.util.Map$Entry r7 = (java.util.Map.Entry) r7
                java.lang.Object r7 = r7.getValue()
                android.bluetooth.le.ScanResult r7 = (android.bluetooth.le.ScanResult) r7
                long r8 = r7.getTimestampNanos()
                long r8 = r8 / r0
                long r8 = r14 - r8
                r10 = 0
                r11 = 2500(0x9c4, double:1.235E-320)
                int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
                if (r8 <= 0) goto Lab
                r6.remove()
                r10 = 1
            Lab:
                int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r8 == 0) goto L87
                if (r10 != 0) goto L87
                long r7 = r7.getTimestampNanos()
                long r7 = r7 / r0
                long r7 = r2 - r7
                int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
                if (r7 <= 0) goto L87
                r6.remove()
                goto L87
            Lc0:
                a.a.a.d.e r14 = r13.f130a
                java.util.concurrent.ConcurrentMap r14 = a.a.a.d.e.a(r14)
                java.util.Collection r14 = r14.values()
                r14.size()
                a.a.a.d.e r13 = r13.f130a
                a.a.a.d.e.c(r13)
            Ld2:
                a.a.a.d.d r13 = a.a.a.d.d.b()
                a.a.a.d.b r13 = r13.a()
                if (r13 != 0) goto Ldd
                goto Le2
            Ldd:
                r13.d()
                r13 = 0
                throw r13
            Le2:
                return
        }
    }

    public class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.a.a.d.e f131b;

        public b(a.a.a.d.e r1) {
                r0 = this;
                r0.f131b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r0 = this;
                a.a.a.d.e r0 = r0.f131b
                r0.j()
                return
        }
    }

    public class c implements java.lang.Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.a.a.d.e f132b;

        public c(a.a.a.d.e r1) {
                r0 = this;
                r0.f132b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r0 = this;
                a.a.a.d.e r0 = r0.f132b
                r0.j()
                return
        }
    }

    public class d implements java.lang.Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.a.a.d.e f133b;

        public d(a.a.a.d.e r1) {
                r0 = this;
                r0.f133b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r0 = this;
                a.a.a.d.e r0 = r0.f133b
                r0.i()
                return
        }
    }

    /* JADX INFO: renamed from: a.a.a.d.e$e, reason: collision with other inner class name */
    public class C0006e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public java.lang.String f134a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public java.lang.String f135b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public java.lang.String f136c;
        public int d;
        public int e;
        public int f;
        public long g;

        public C0006e(a.a.a.d.e r1, java.lang.String r2, java.lang.String r3, int r4, long r5) {
                r0 = this;
                r0.<init>()
                r0.f134a = r2
                r0.f135b = r3
                int r1 = -r4
                r0.f = r1
                r1 = 1000000(0xf4240, double:4.940656E-318)
                long r5 = r5 / r1
                r0.g = r5
                return
        }

        public static /* synthetic */ int a(a.a.a.d.e.C0006e r0) {
                int r0 = r0.f
                return r0
        }

        public void a(int r1) {
                r0 = this;
                r0.d = r1
                return
        }

        public void a(java.lang.String r1) {
                r0 = this;
                r0.f134a = r1
                return
        }

        public void b(int r1) {
                r0 = this;
                r0.e = r1
                return
        }

        public void b(java.lang.String r1) {
                r0 = this;
                r0.f136c = r1
                return
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r3.f135b
                r0.append(r1)
                java.lang.String r1 = ";"
                r0.append(r1)
                java.lang.String r2 = r3.f134a
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = r3.f136c
                r0.append(r2)
                r0.append(r1)
                int r2 = r3.d
                r0.append(r2)
                r0.append(r1)
                int r2 = r3.e
                r0.append(r2)
                r0.append(r1)
                int r2 = r3.f
                r0.append(r2)
                r0.append(r1)
                long r1 = r3.g
                r0.append(r1)
                java.lang.String r3 = r0.toString()
                return r3
        }
    }

    public class f implements java.util.Comparator<a.a.a.d.e.C0006e> {
        public f(a.a.a.d.e r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public int a(a.a.a.d.e.C0006e r1, a.a.a.d.e.C0006e r2) {
                r0 = this;
                int r0 = a.a.a.d.e.C0006e.a(r1)
                int r1 = a.a.a.d.e.C0006e.a(r2)
                int r0 = r0 - r1
                return r0
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(a.a.a.d.e.C0006e r1, a.a.a.d.e.C0006e r2) {
                r0 = this;
                a.a.a.d.e$e r1 = (a.a.a.d.e.C0006e) r1
                a.a.a.d.e$e r2 = (a.a.a.d.e.C0006e) r2
                int r0 = r0.a(r1, r2)
                return r0
        }
    }

    static {
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70} // fill-array
            a.a.a.d.e.m = r0
            return
    }

    public e() {
            r4 = this;
            r4.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r4.f127a = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r0 = 0
            r4.d = r0
            r0 = -1
            r4.e = r0
            r2 = 0
            r4.f = r2
            r4.g = r0
            r2 = 0
            r4.j = r2
            r4.k = r0
            r4.l = r2
            return
    }

    public static /* synthetic */ long a(a.a.a.d.e r0, long r1) {
            r0.j = r1
            return r1
    }

    public static java.lang.String a(byte[] r6) {
            int r0 = r6.length
            int r0 = r0 * 2
            char[] r0 = new char[r0]
            r1 = 0
        L6:
            int r2 = r6.length
            if (r1 >= r2) goto L22
            r2 = r6[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 * 2
            char[] r4 = a.a.a.d.e.m
            int r5 = r2 >>> 4
            char r5 = r4[r5]
            r0[r3] = r5
            int r3 = r3 + 1
            r2 = r2 & 15
            char r2 = r4[r2]
            r0[r3] = r2
            int r1 = r1 + 1
            goto L6
        L22:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0)
            java.lang.String r6 = r6.toUpperCase()     // Catch: java.lang.Exception -> L2b
        L2b:
            return r6
    }

    public static /* synthetic */ java.util.concurrent.ConcurrentMap a(a.a.a.d.e r0) {
            java.util.concurrent.ConcurrentMap<java.lang.String, android.bluetooth.le.ScanResult> r0 = r0.f127a
            return r0
    }

    public static /* synthetic */ long b(a.a.a.d.e r2) {
            long r0 = r2.j
            return r0
    }

    public static /* synthetic */ void c(a.a.a.d.e r0) {
            r0.b()
            return
    }

    public static synchronized a.a.a.d.e k() {
            java.lang.Class<a.a.a.d.e> r0 = a.a.a.d.e.class
            monitor-enter(r0)
            a.a.a.d.e r1 = a.a.a.d.e.n     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto Le
            a.a.a.d.e r1 = new a.a.a.d.e     // Catch: java.lang.Throwable -> L12
            r1.<init>()     // Catch: java.lang.Throwable -> L12
            a.a.a.d.e.n = r1     // Catch: java.lang.Throwable -> L12
        Le:
            a.a.a.d.e r1 = a.a.a.d.e.n     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)
            return r1
        L12:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final a.a.a.d.e.C0006e a(a.a.a.d.e.C0006e r3, java.lang.String r4, int r5, int r6, java.lang.String r7) {
            r2 = this;
            a.a.a.d.d r2 = a.a.a.d.d.b()
            a.a.a.d.b r2 = r2.a()
            a.a.a.b.d r0 = a.a.a.b.d.i()
            int r0 = r0.M
            r1 = 1
            if (r0 != r1) goto L19
            if (r2 != 0) goto L14
            goto L19
        L14:
            r2.c()
            r2 = 0
            throw r2
        L19:
            r3.b(r4)
            r3.a(r5)
            r3.b(r6)
            r3.a(r7)
            return r3
    }

    @android.annotation.TargetApi(21)
    public final a.a.a.d.e.C0006e a(android.bluetooth.le.ScanResult r12) {
            r11 = this;
            android.bluetooth.BluetoothDevice r0 = r12.getDevice()
            java.lang.String r0 = r0.getAddress()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Le5
            int r0 = r12.getRssi()
            if (r0 <= 0) goto L16
            goto Le5
        L16:
            r0 = 0
            android.bluetooth.BluetoothDevice r1 = r12.getDevice()
            java.lang.String r1 = r1.getAddress()
            java.lang.String r2 = ":"
            java.lang.String r3 = ""
            java.lang.String r1 = r1.replaceAll(r2, r3)
            android.bluetooth.BluetoothDevice r2 = r12.getDevice()
            java.lang.String r7 = r2.getName()
            a.a.a.d.e$e r2 = new a.a.a.d.e$e
            int r8 = r12.getRssi()
            long r9 = r12.getTimestampNanos()
            r4 = r2
            r5 = r11
            r6 = r1
            r4.<init>(r5, r6, r7, r8, r9)
            android.bluetooth.le.ScanRecord r3 = r12.getScanRecord()
            if (r3 == 0) goto Le4
            android.bluetooth.le.ScanRecord r12 = r12.getScanRecord()
            byte[] r12 = r12.getBytes()
            r3 = 2
            r4 = r3
        L4f:
            r5 = 5
            if (r4 > r5) goto Laa
            int r5 = r4 + 2
            r6 = r12[r5]
            r6 = r6 & 255(0xff, float:3.57E-43)
            if (r6 != r3) goto L66
            int r6 = r4 + 3
            r6 = r12[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r7 = 21
            if (r6 != r7) goto L66
            r0 = 1
            goto Laa
        L66:
            r6 = r12[r4]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r7 = 45
            if (r6 != r7) goto L8b
            int r6 = r4 + 1
            r6 = r12[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r7 = 36
            if (r6 != r7) goto L8b
            r6 = r12[r5]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r7 = 191(0xbf, float:2.68E-43)
            if (r6 != r7) goto L8b
            int r6 = r4 + 3
            r6 = r12[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r7 = 22
            if (r6 != r7) goto L8b
            goto La7
        L8b:
            r6 = r12[r4]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r7 = 173(0xad, float:2.42E-43)
            if (r6 != r7) goto La7
            int r6 = r4 + 1
            r6 = r12[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r7 = 119(0x77, float:1.67E-43)
            if (r6 != r7) goto La7
            r5 = r12[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            if (r5 != 0) goto La7
            int r5 = r4 + 3
            r5 = r12[r5]
        La7:
            int r4 = r4 + 1
            goto L4f
        Laa:
            if (r0 != 0) goto Lad
            return r2
        Lad:
            int r0 = r4 + 20
            r0 = r12[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 * 256
            int r3 = r4 + 21
            r3 = r12[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r7 = r0 + r3
            int r0 = r4 + 22
            r0 = r12[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 * 256
            int r4 = r4 + 23
            r3 = r12[r4]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r8 = r0 + r3
            int r0 = r12.length
            r3 = 26
            if (r0 <= r3) goto Le4
            r0 = 9
            r3 = 25
            byte[] r12 = java.util.Arrays.copyOfRange(r12, r0, r3)
            java.lang.String r6 = a(r12)
            r4 = r11
            r5 = r2
            r9 = r1
            r4.a(r5, r6, r7, r8, r9)
        Le4:
            return r2
        Le5:
            r11 = 0
            return r11
    }

    public final void a() {
            r2 = this;
            java.util.concurrent.ConcurrentMap<java.lang.String, android.bluetooth.le.ScanResult> r0 = r2.f127a
            r0.clear()
            r0 = -1
            r2.h = r0
            java.lang.String r0 = ""
            r2.i = r0
            r0 = -1
            r2.g = r0
            return
    }

    public final void b() {
            r7 = this;
            java.util.concurrent.ConcurrentMap<java.lang.String, android.bluetooth.le.ScanResult> r0 = r7.f127a
            if (r0 == 0) goto Lca
            java.util.Collection r0 = r0.values()
            int r0 = r0.size()
            if (r0 > 0) goto L10
            goto Lca
        L10:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lca
            java.util.concurrent.ConcurrentMap<java.lang.String, android.bluetooth.le.ScanResult> r1 = r7.f127a     // Catch: java.lang.Exception -> Lca
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Exception -> Lca
            r0.<init>(r1)     // Catch: java.lang.Exception -> Lca
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lca
            r1.<init>()     // Catch: java.lang.Exception -> Lca
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lca
            r2.<init>()     // Catch: java.lang.Exception -> Lca
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lca
            r3.<init>()     // Catch: java.lang.Exception -> Lca
            a.a.a.d.d r4 = a.a.a.d.d.b()     // Catch: java.lang.Exception -> Lca
            a.a.a.d.b r4 = r4.a()     // Catch: java.lang.Exception -> Lca
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lca
            r5.<init>()     // Catch: java.lang.Exception -> Lca
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> Lca
        L3b:
            boolean r6 = r0.hasNext()     // Catch: java.lang.Exception -> Lca
            if (r6 == 0) goto L51
            java.lang.Object r6 = r0.next()     // Catch: java.lang.Exception -> Lca
            android.bluetooth.le.ScanResult r6 = (android.bluetooth.le.ScanResult) r6     // Catch: java.lang.Exception -> Lca
            a.a.a.d.e$e r6 = r7.a(r6)     // Catch: java.lang.Exception -> Lca
            if (r6 == 0) goto L3b
            r5.add(r6)     // Catch: java.lang.Exception -> Lca
            goto L3b
        L51:
            int r0 = r5.size()     // Catch: java.lang.Exception -> Lca
            if (r0 <= 0) goto L94
            a.a.a.d.e$f r0 = new a.a.a.d.e$f     // Catch: java.lang.Exception -> Lca
            r0.<init>(r7)     // Catch: java.lang.Exception -> Lca
            java.util.Collections.sort(r5, r0)     // Catch: java.lang.Exception -> Lca
            r0 = 0
            java.lang.Object r0 = r5.get(r0)     // Catch: java.lang.Exception -> Lca
            a.a.a.d.e$e r0 = (a.a.a.d.e.C0006e) r0     // Catch: java.lang.Exception -> Lca
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> Lca
            r1.append(r0)     // Catch: java.lang.Exception -> Lca
            r0 = 1
        L6e:
            int r6 = r5.size()     // Catch: java.lang.Exception -> Lca
            if (r0 >= r6) goto L89
            java.lang.String r6 = "|"
            r1.append(r6)     // Catch: java.lang.Exception -> Lca
            java.lang.Object r6 = r5.get(r0)     // Catch: java.lang.Exception -> Lca
            a.a.a.d.e$e r6 = (a.a.a.d.e.C0006e) r6     // Catch: java.lang.Exception -> Lca
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> Lca
            r1.append(r6)     // Catch: java.lang.Exception -> Lca
            int r0 = r0 + 1
            goto L6e
        L89:
            if (r4 != 0) goto L8c
            goto L94
        L8c:
            r5.size()     // Catch: java.lang.Exception -> Lca
            r4.b()     // Catch: java.lang.Exception -> Lca
            r7 = 0
            throw r7
        L94:
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> Lca
            if (r0 != 0) goto La7
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Exception -> Lca
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> Lca
            if (r0 != 0) goto La7
            r2.toString()     // Catch: java.lang.Exception -> Lca
        La7:
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> Lca
            if (r0 != 0) goto Lbe
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Exception -> Lca
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> Lca
            if (r0 != 0) goto Lbe
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Exception -> Lca
        Lbb:
            r7.i = r0     // Catch: java.lang.Exception -> Lca
            goto Lc1
        Lbe:
            java.lang.String r0 = ""
            goto Lbb
        Lc1:
            r1.toString()     // Catch: java.lang.Exception -> Lca
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> Lca
            r7.e = r0     // Catch: java.lang.Exception -> Lca
        Lca:
            return
    }

    public synchronized java.lang.String c() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.e()     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L13
            java.lang.String r0 = r1.i     // Catch: java.lang.Throwable -> L16
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L13
            java.lang.String r0 = r1.i     // Catch: java.lang.Throwable -> L16
            monitor-exit(r1)
            return r0
        L13:
            r0 = 0
            monitor-exit(r1)
            return r0
        L16:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public int d() {
            r0 = this;
            int r0 = r0.h
            return r0
    }

    public final boolean e() {
            r8 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r8.g
            long r4 = r0 - r2
            r6 = 10000(0x2710, double:4.9407E-320)
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 <= 0) goto L1c
            r6 = 100000(0x186a0, double:4.94066E-319)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 <= 0) goto L1c
            boolean r2 = r8.d
            if (r2 == 0) goto L1c
            r8.g()
        L1c:
            long r2 = r8.e
            long r0 = r0 - r2
            long r2 = java.lang.Math.abs(r4)
            r4 = 5000(0x1388, double:2.4703E-320)
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 > 0) goto L33
            long r0 = java.lang.Math.abs(r0)
            int r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r8 > 0) goto L33
            r8 = 1
            goto L34
        L33:
            r8 = 0
        L34:
            return r8
    }

    public final boolean f() {
            r3 = this;
            r0 = 0
            android.content.Context r1 = r3.f128b     // Catch: java.lang.Exception -> L1f
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Exception -> L1f
            java.lang.String r2 = "android.hardware.bluetooth_le"
            boolean r1 = r1.hasSystemFeature(r2)     // Catch: java.lang.Exception -> L1f
            if (r1 != 0) goto L1d
            android.content.Context r1 = r3.f128b     // Catch: java.lang.Exception -> L1f
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Exception -> L1f
            java.lang.String r2 = "android.hardware.bluetooth"
            boolean r1 = r1.hasSystemFeature(r2)     // Catch: java.lang.Exception -> L1f
            if (r1 == 0) goto L23
        L1d:
            r1 = 1
            goto L24
        L1f:
            r1 = move-exception
            r1.printStackTrace()
        L23:
            r1 = r0
        L24:
            android.bluetooth.BluetoothAdapter r3 = r3.f129c
            if (r3 == 0) goto L34
            if (r1 != 0) goto L2b
            goto L34
        L2b:
            boolean r3 = r3.isEnabled()     // Catch: java.lang.Exception -> L30
            return r3
        L30:
            r3 = move-exception
            r3.printStackTrace()
        L34:
            return r0
    }

    public final void g() {
            r4 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r4.l
            long r0 = r0 - r2
            r2 = 10000(0x2710, double:4.9407E-320)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L37
            a.a.a.d.d r0 = a.a.a.d.d.b()
            a.a.a.d.b r0 = r0.a()
            if (r0 == 0) goto L37
            long r0 = java.lang.System.currentTimeMillis()
            r4.l = r0
            android.os.Handler r0 = a.a.a.h.a.e()
            if (r0 == 0) goto L37
            a.a.a.d.e$c r1 = new a.a.a.d.e$c
            r1.<init>(r4)
            r2 = 1000(0x3e8, double:4.94E-321)
            r0.postDelayed(r1, r2)
            a.a.a.d.e$d r1 = new a.a.a.d.e$d
            r1.<init>(r4)
            r2 = 2000(0x7d0, double:9.88E-321)
            r0.postDelayed(r1, r2)
        L37:
            return
    }

    @android.annotation.TargetApi(21)
    public final void h() {
            r4 = this;
            android.bluetooth.BluetoothAdapter r0 = r4.f129c
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L52
            r1 = 21
            if (r0 < r1) goto L52
            a.a.a.d.e$a r0 = new a.a.a.d.e$a     // Catch: java.lang.Exception -> L52
            r0.<init>(r4)     // Catch: java.lang.Exception -> L52
            r4.f = r0     // Catch: java.lang.Exception -> L52
            android.bluetooth.le.ScanSettings$Builder r0 = new android.bluetooth.le.ScanSettings$Builder     // Catch: java.lang.Exception -> L52
            r0.<init>()     // Catch: java.lang.Exception -> L52
            r1 = 2
            android.bluetooth.le.ScanSettings$Builder r0 = r0.setScanMode(r1)     // Catch: java.lang.Exception -> L52
            android.bluetooth.BluetoothAdapter r1 = r4.f129c     // Catch: java.lang.Exception -> L52
            android.bluetooth.le.BluetoothLeScanner r1 = r1.getBluetoothLeScanner()     // Catch: java.lang.Exception -> L52
            r2 = 0
            android.bluetooth.le.ScanSettings r0 = r0.build()     // Catch: java.lang.Exception -> L52
            java.lang.Object r3 = r4.f     // Catch: java.lang.Exception -> L52
            android.bluetooth.le.ScanCallback r3 = (android.bluetooth.le.ScanCallback) r3     // Catch: java.lang.Exception -> L52
            r1.startScan(r2, r0, r3)     // Catch: java.lang.Exception -> L52
            r0 = 1
            r4.d = r0     // Catch: java.lang.Exception -> L52
            a.a.a.d.d r0 = a.a.a.d.d.b()     // Catch: java.lang.Exception -> L52
            a.a.a.d.b r0 = r0.a()     // Catch: java.lang.Exception -> L52
            if (r0 != 0) goto L52
            android.os.Handler r0 = a.a.a.h.a.e()     // Catch: java.lang.Exception -> L52
            if (r0 == 0) goto L52
            android.os.Handler r0 = a.a.a.h.a.e()     // Catch: java.lang.Exception -> L52
            a.a.a.d.e$b r1 = new a.a.a.d.e$b     // Catch: java.lang.Exception -> L52
            r1.<init>(r4)     // Catch: java.lang.Exception -> L52
            int r4 = a.a.a.i.i.H0     // Catch: java.lang.Exception -> L52
            int r4 = r4 * 1000
            long r2 = (long) r4     // Catch: java.lang.Exception -> L52
            r0.postDelayed(r1, r2)     // Catch: java.lang.Exception -> L52
        L52:
            return
    }

    public synchronized void i() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f()     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L9
            monitor-exit(r1)
            return
        L9:
            boolean r0 = r1.d     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L10
            r1.h()     // Catch: java.lang.Throwable -> L12
        L10:
            monitor-exit(r1)
            return
        L12:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @android.annotation.TargetApi(21)
    public synchronized void j() {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.d     // Catch: java.lang.Throwable -> L49
            if (r0 != 0) goto L7
            monitor-exit(r4)
            return
        L7:
            android.bluetooth.BluetoothAdapter r0 = r4.f129c     // Catch: java.lang.Exception -> L1f java.lang.Throwable -> L49
            if (r0 == 0) goto L23
            android.bluetooth.le.BluetoothLeScanner r0 = r0.getBluetoothLeScanner()     // Catch: java.lang.Exception -> L1f java.lang.Throwable -> L49
            if (r0 == 0) goto L23
            android.bluetooth.BluetoothAdapter r0 = r4.f129c     // Catch: java.lang.Exception -> L1f java.lang.Throwable -> L49
            android.bluetooth.le.BluetoothLeScanner r0 = r0.getBluetoothLeScanner()     // Catch: java.lang.Exception -> L1f java.lang.Throwable -> L49
            java.lang.Object r1 = r4.f     // Catch: java.lang.Exception -> L1f java.lang.Throwable -> L49
            android.bluetooth.le.ScanCallback r1 = (android.bluetooth.le.ScanCallback) r1     // Catch: java.lang.Exception -> L1f java.lang.Throwable -> L49
            r0.stopScan(r1)     // Catch: java.lang.Exception -> L1f java.lang.Throwable -> L49
            goto L23
        L1f:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L49
        L23:
            r0 = 0
            r4.d = r0     // Catch: java.lang.Throwable -> L49
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L49
            r4.k = r1     // Catch: java.lang.Throwable -> L49
            android.content.Context r1 = r4.f128b     // Catch: java.lang.Throwable -> L49
            if (r1 == 0) goto L44
            java.lang.String r2 = "BluetoothManager"
            android.content.SharedPreferences r0 = r1.getSharedPreferences(r2, r0)     // Catch: java.lang.Throwable -> L49
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L49
            long r1 = r4.k     // Catch: java.lang.Throwable -> L49
            java.lang.String r3 = "lastStopScanBluetoothTime"
            r0.putLong(r3, r1)     // Catch: java.lang.Throwable -> L49
            r0.apply()     // Catch: java.lang.Throwable -> L49
        L44:
            r4.a()     // Catch: java.lang.Throwable -> L49
            monitor-exit(r4)
            return
        L49:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }
}
