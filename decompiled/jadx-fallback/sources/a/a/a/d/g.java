package a.a.a.d;

/* JADX INFO: loaded from: classes.dex */
public class g {
    public static final char[] n = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public android.content.Context f138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f140c;
    public android.bluetooth.BluetoothAdapter d;
    public boolean e;
    public a.a.a.d.g.c f;
    public boolean g;
    public java.lang.String h;
    public long i;
    public java.util.concurrent.ConcurrentMap<java.lang.String, android.bluetooth.le.ScanResult> j;
    public java.lang.Object k;
    public boolean l;
    public long m;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public java.lang.String f141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f142b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f143c;

        public a(a.a.a.d.g r1, java.lang.String r2, int r3, long r4) {
                r0 = this;
                r0.<init>()
                r0.f141a = r2
                r0.f142b = r3
                r1 = 1000000(0xf4240, double:4.940656E-318)
                long r4 = r4 / r1
                r0.f143c = r4
                return
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r3.f141a
                java.lang.String r1 = r1.toUpperCase()
                r0.append(r1)
                java.lang.String r1 = ";"
                r0.append(r1)
                int r2 = r3.f142b
                r0.append(r2)
                r0.append(r1)
                long r1 = r3.f143c
                r0.append(r1)
                java.lang.String r3 = r0.toString()
                return r3
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public java.lang.String f144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public java.lang.String f145b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f146c;
        public java.lang.String d;
        public java.lang.String e;

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r3.d
                r0.append(r1)
                java.lang.String r1 = ","
                r0.append(r1)
                java.lang.String r2 = r3.f144a
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = r3.f145b
                r0.append(r2)
                r0.append(r1)
                int r3 = r3.f146c
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                return r3
        }
    }

    public interface c {
        void a(boolean r1, java.lang.String r2, java.lang.String r3, java.lang.String r4);
    }

    public class d implements java.util.Comparator<a.a.a.d.g.b> {
        public d(a.a.a.d.g r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public int a(a.a.a.d.g.b r1, a.a.a.d.g.b r2) {
                r0 = this;
                int r0 = r1.f146c
                int r1 = r2.f146c
                int r0 = r0 - r1
                return r0
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(a.a.a.d.g.b r1, a.a.a.d.g.b r2) {
                r0 = this;
                a.a.a.d.g$b r1 = (a.a.a.d.g.b) r1
                a.a.a.d.g$b r2 = (a.a.a.d.g.b) r2
                int r0 = r0.a(r1, r2)
                return r0
        }
    }

    public class e implements java.util.Comparator<a.a.a.d.g.a> {
        public e(a.a.a.d.g r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public int a(a.a.a.d.g.a r1, a.a.a.d.g.a r2) {
                r0 = this;
                int r0 = r2.f142b
                int r1 = r1.f142b
                int r0 = r0 - r1
                return r0
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(a.a.a.d.g.a r1, a.a.a.d.g.a r2) {
                r0 = this;
                a.a.a.d.g$a r1 = (a.a.a.d.g.a) r1
                a.a.a.d.g$a r2 = (a.a.a.d.g.a) r2
                int r0 = r0.a(r1, r2)
                return r0
        }
    }

    static {
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70} // fill-array
            a.a.a.d.g.n = r0
            return
    }

    @android.annotation.TargetApi(21)
    public g(android.content.Context r6) {
            r5 = this;
            r5.<init>()
            r0 = 0
            r5.f139b = r0
            r5.f140c = r0
            r5.e = r0
            r5.g = r0
            r1 = 0
            r5.h = r1
            r2 = -1
            r5.i = r2
            java.util.concurrent.ConcurrentHashMap r4 = new java.util.concurrent.ConcurrentHashMap
            r4.<init>()
            r5.j = r4
            r5.k = r1
            r5.l = r0
            r5.m = r2
            r5.f138a = r6
            android.bluetooth.BluetoothAdapter r0 = r5.d
            if (r0 != 0) goto L54
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L50
            r1 = 21
            if (r0 < r1) goto L49
            java.lang.String r0 = "bluetooth"
            java.lang.Object r6 = r6.getSystemService(r0)     // Catch: java.lang.Exception -> L50
            android.bluetooth.BluetoothManager r6 = (android.bluetooth.BluetoothManager) r6     // Catch: java.lang.Exception -> L50
            android.bluetooth.BluetoothAdapter r6 = r6.getAdapter()     // Catch: java.lang.Exception -> L50
            r5.d = r6     // Catch: java.lang.Exception -> L50
            android.content.Context r6 = r5.f138a     // Catch: java.lang.Exception -> L50
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch: java.lang.Exception -> L50
            java.lang.String r0 = "android.hardware.bluetooth_le"
            boolean r6 = r6.hasSystemFeature(r0)     // Catch: java.lang.Exception -> L50
            r5.e = r6     // Catch: java.lang.Exception -> L50
            goto L54
        L49:
            android.bluetooth.BluetoothAdapter r6 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()     // Catch: java.lang.Exception -> L50
            r5.d = r6     // Catch: java.lang.Exception -> L50
            goto L54
        L50:
            r5 = move-exception
            r5.printStackTrace()
        L54:
            return
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
            char[] r4 = a.a.a.d.g.n
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

    public a.a.a.d.g.b a(byte[] r6, int r7, java.lang.String r8) {
            r5 = this;
            int r5 = -r7
            r7 = 0
            if (r8 == 0) goto L83
            if (r5 >= 0) goto L8
            goto L83
        L8:
            a.a.a.d.d r5 = a.a.a.d.d.b()
            a.a.a.d.b r5 = r5.a()
            if (r5 != 0) goto L13
            return r7
        L13:
            r8 = 0
            r0 = 2
            r1 = r0
        L16:
            r2 = 5
            if (r1 > r2) goto L71
            int r2 = r1 + 2
            r3 = r6[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            if (r3 != r0) goto L2d
            int r3 = r1 + 3
            r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r4 = 21
            if (r3 != r4) goto L2d
            r8 = 1
            goto L71
        L2d:
            r3 = r6[r1]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r4 = 45
            if (r3 != r4) goto L52
            int r3 = r1 + 1
            r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r4 = 36
            if (r3 != r4) goto L52
            r3 = r6[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r4 = 191(0xbf, float:2.68E-43)
            if (r3 != r4) goto L52
            int r3 = r1 + 3
            r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r4 = 22
            if (r3 != r4) goto L52
            goto L6e
        L52:
            r3 = r6[r1]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r4 = 173(0xad, float:2.42E-43)
            if (r3 != r4) goto L6e
            int r3 = r1 + 1
            r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r4 = 119(0x77, float:1.67E-43)
            if (r3 != r4) goto L6e
            r2 = r6[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            if (r2 != 0) goto L6e
            int r2 = r1 + 3
            r2 = r6[r2]
        L6e:
            int r1 = r1 + 1
            goto L16
        L71:
            if (r8 != 0) goto L74
            return r7
        L74:
            r8 = 9
            r0 = 25
            byte[] r6 = java.util.Arrays.copyOfRange(r6, r8, r0)
            a(r6)
            r5.a()
            throw r7
        L83:
            return r7
    }

    public final java.lang.String a(java.util.List<a.a.a.d.g.a> r3, int r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            a.a.a.d.g$e r1 = new a.a.a.d.g$e
            r1.<init>(r2)
            java.util.Collections.sort(r3, r1)
            r2 = 0
            java.lang.Object r2 = r3.get(r2)
            a.a.a.d.g$a r2 = (a.a.a.d.g.a) r2
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            r2 = 1
        L1c:
            int r1 = r3.size()
            if (r2 >= r1) goto L39
            if (r2 >= r4) goto L39
            java.lang.String r1 = "|"
            r0.append(r1)
            java.lang.Object r1 = r3.get(r2)
            a.a.a.d.g$a r1 = (a.a.a.d.g.a) r1
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            int r2 = r2 + 1
            goto L1c
        L39:
            r3.size()
            java.lang.String r2 = r0.toString()
            return r2
    }

    @android.annotation.TargetApi(21)
    public final void a(java.util.concurrent.ConcurrentMap<java.lang.String, android.bluetooth.le.ScanResult> r20) {
            r19 = this;
            r6 = r19
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Collection r1 = r20.values()
            r0.<init>(r1)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r13 = r0.iterator()
        L2d:
            boolean r0 = r13.hasNext()
            java.lang.String r1 = ""
            if (r0 == 0) goto Lc9
            java.lang.Object r0 = r13.next()
            r16 = r0
            android.bluetooth.le.ScanResult r16 = (android.bluetooth.le.ScanResult) r16
            android.bluetooth.le.ScanRecord r0 = r16.getScanRecord()
            byte[] r4 = r0.getBytes()
            int r0 = r4.length
            r2 = 26
            if (r0 >= r2) goto L4b
            goto L2d
        L4b:
            android.bluetooth.BluetoothDevice r0 = r16.getDevice()
            java.lang.String r0 = r0.getAddress()
            java.lang.String r2 = ":"
            java.lang.String r0 = r0.replaceAll(r2, r1)
            int r1 = r16.getRssi()
            a.a.a.d.g$b r0 = r6.a(r4, r1, r0)
            if (r0 == 0) goto L80
            r12.add(r0)
            a.a.a.d.g$a r5 = new a.a.a.d.g$a
            java.lang.String r2 = r0.e
            int r3 = r16.getRssi()
            long r17 = r16.getTimestampNanos()
            r0 = r5
            r1 = r19
            r14 = r4
            r15 = r5
            r4 = r17
            r0.<init>(r1, r2, r3, r4)
            r11.add(r15)
            goto L81
        L80:
            r14 = r4
        L81:
            r0 = 25
            r1 = 9
            byte[] r0 = java.util.Arrays.copyOfRange(r14, r1, r0)
            java.lang.String r0 = a(r0)
            r7.add(r0)
            android.bluetooth.BluetoothDevice r2 = r16.getDevice()
            java.lang.String r2 = r2.getName()
            r8.put(r0, r2)
            r2 = 0
            byte[] r1 = java.util.Arrays.copyOfRange(r14, r2, r1)
            java.lang.String r1 = a(r1)
            r9.put(r0, r1)
            java.lang.Object r1 = r10.get(r0)
            if (r1 != 0) goto Lb4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r10.put(r0, r1)
        Lb4:
            java.lang.Object r1 = r10.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = 1
            int r1 = r1 + r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10.put(r0, r1)
            goto L2d
        Lc9:
            r2 = 1
            r0 = 0
            java.util.Set r3 = r10.keySet()
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
        Ld4:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto Lf9
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r7 = r10.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r7 <= r4) goto Ld4
            java.lang.Object r0 = r10.get(r5)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r4 = r0
            r0 = r5
            goto Ld4
        Lf9:
            r3 = 3
            if (r4 <= r3) goto Lfe
            r14 = r2
            goto Lff
        Lfe:
            r14 = 0
        Lff:
            a.a.a.d.g$c r2 = r6.f
            if (r2 == 0) goto L119
            boolean r3 = r6.f139b
            if (r3 == 0) goto L119
            java.lang.Object r3 = r8.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r9.get(r0)
            java.lang.String r4 = (java.lang.String) r4
            r2.a(r14, r0, r3, r4)
            r0 = 0
            r6.f139b = r0
        L119:
            int r0 = r11.size()
            r2 = 2
            if (r0 <= r2) goto L12c
            r0 = 32
            java.lang.String r1 = r6.a(r11, r0)
            r6.h = r1
            r6.b(r12, r0)
            goto L12e
        L12c:
            r6.h = r1
        L12e:
            boolean r0 = r6.g
            if (r0 == 0) goto L14f
            a.a.a.d.d r0 = a.a.a.d.d.b()
            a.a.a.d.b r0 = r0.a()
            if (r0 == 0) goto L14f
            boolean r0 = r19.a()
            if (r0 == 0) goto L14f
            boolean r0 = r6.l
            if (r0 != 0) goto L14f
            boolean r0 = r19.b()
            if (r0 == 0) goto L14f
            r19.j()
        L14f:
            return
    }

    public final boolean a() {
            r4 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r4.i
            long r0 = r0 - r2
            r2 = 5000(0x1388, double:2.4703E-320)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto Lf
            r4 = 1
            goto L10
        Lf:
            r4 = 0
        L10:
            return r4
    }

    public boolean a(a.a.a.d.g.c r4) {
            r3 = this;
            boolean r0 = r3.f139b
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            boolean r0 = r3.f140c
            if (r0 == 0) goto Lb
            return r1
        Lb:
            r0 = 1
            r3.f140c = r0
            boolean r2 = r3.h()
            if (r2 != 0) goto L15
            return r1
        L15:
            boolean r2 = r3.f()
            if (r2 == 0) goto L1c
            return r1
        L1c:
            r3.k()
            r3.f = r4
            return r0
    }

    public final java.lang.String b(java.util.List<a.a.a.d.g.b> r3, int r4) {
            r2 = this;
            if (r3 == 0) goto L49
            int r0 = r3.size()
            if (r0 <= 0) goto L49
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            a.a.a.d.g$d r1 = new a.a.a.d.g$d
            r1.<init>(r2)
            java.util.Collections.sort(r3, r1)
            r2 = 0
            java.lang.Object r2 = r3.get(r2)
            a.a.a.d.g$b r2 = (a.a.a.d.g.b) r2
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            r2 = 1
        L24:
            int r1 = r3.size()
            if (r2 >= r1) goto L41
            if (r2 >= r4) goto L41
            java.lang.String r1 = "|"
            r0.append(r1)
            java.lang.Object r1 = r3.get(r2)
            a.a.a.d.g$b r1 = (a.a.a.d.g.b) r1
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            int r2 = r2 + 1
            goto L24
        L41:
            r3.size()
            java.lang.String r2 = r0.toString()
            return r2
        L49:
            java.lang.String r2 = ""
            return r2
    }

    public final boolean b() {
            r4 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r4.m
            long r0 = r0 - r2
            r2 = 5000(0x1388, double:2.4703E-320)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto Lf
            r4 = 1
            goto L10
        Lf:
            r4 = 0
        L10:
            return r4
    }

    public final void c() {
            r2 = this;
            java.lang.String r0 = ""
            r2.h = r0
            r0 = -1
            r2.i = r0
            return
    }

    public java.lang.String d() {
            r1 = this;
            java.util.concurrent.ConcurrentMap<java.lang.String, android.bluetooth.le.ScanResult> r0 = r1.j
            r1.a(r0)
            java.lang.String r1 = r1.h
            return r1
    }

    public long e() {
            r2 = this;
            long r0 = r2.i
            return r0
    }

    public final boolean f() {
            r6 = this;
            java.lang.String r0 = ""
            java.io.File r1 = new java.io.File
            android.content.Context r6 = r6.f138a
            java.io.File r6 = r6.getCacheDir()
            java.lang.String r2 = "ibct"
            r1.<init>(r6, r2)
            boolean r6 = r1.exists()
            r2 = 0
            if (r6 != 0) goto L17
            return r2
        L17:
            r6 = 0
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L40
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Exception -> L40
            r4.<init>(r1)     // Catch: java.lang.Exception -> L40
            r3.<init>(r4)     // Catch: java.lang.Exception -> L40
            r1 = r6
            r6 = r0
        L24:
            java.lang.String r1 = r3.readLine()     // Catch: java.lang.Exception -> L3e
            if (r1 == 0) goto L3a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3e
            r4.<init>()     // Catch: java.lang.Exception -> L3e
            r4.append(r6)     // Catch: java.lang.Exception -> L3e
            r4.append(r1)     // Catch: java.lang.Exception -> L3e
            java.lang.String r6 = r4.toString()     // Catch: java.lang.Exception -> L3e
            goto L24
        L3a:
            r3.close()     // Catch: java.lang.Exception -> L40
            goto L48
        L3e:
            r6 = move-exception
            goto L44
        L40:
            r1 = move-exception
            r5 = r1
            r1 = r6
            r6 = r5
        L44:
            r6.printStackTrace()
            r6 = r1
        L48:
            if (r6 == 0) goto L6b
            java.lang.String r1 = r6.trim()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L55
            goto L6b
        L55:
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Exception -> L6b
            long r0 = r6.longValue()     // Catch: java.lang.Exception -> L6b
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L6b
            long r3 = r3 - r0
            r0 = 259200(0x3f480, double:1.28062E-318)
            int r6 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r6 >= 0) goto L6b
            r6 = 1
            return r6
        L6b:
            return r2
    }

    public boolean g() {
            r4 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r4.i
            long r0 = r0 - r2
            r2 = 20000(0x4e20, double:9.8813E-320)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto Lf
            r4 = 1
            goto L10
        Lf:
            r4 = 0
        L10:
            return r4
    }

    public boolean h() {
            r2 = this;
            android.bluetooth.BluetoothAdapter r0 = r2.d
            r1 = 0
            if (r0 == 0) goto L13
            boolean r2 = r2.e
            if (r2 != 0) goto La
            goto L13
        La:
            boolean r2 = r0.isEnabled()     // Catch: java.lang.Exception -> Lf
            return r2
        Lf:
            r2 = move-exception
            r2.printStackTrace()
        L13:
            return r1
    }

    public void i() {
            r2 = this;
            r0 = 0
            r2.f140c = r0
            r2.f139b = r0
            r2.l = r0
            r0 = -1
            r2.m = r0
            return
    }

    public final void j() {
            r0 = this;
            boolean r0 = r0.h()
            return
    }

    public final void k() {
            r3 = this;
            java.io.File r0 = new java.io.File
            android.content.Context r3 = r3.f138a
            java.io.File r3 = r3.getCacheDir()
            java.lang.String r1 = "ibct"
            r0.<init>(r3, r1)
            java.io.FileWriter r3 = new java.io.FileWriter     // Catch: java.lang.Exception -> L30
            r3.<init>(r0)     // Catch: java.lang.Exception -> L30
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L30
            r0.<init>()     // Catch: java.lang.Exception -> L30
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L30
            r0.append(r1)     // Catch: java.lang.Exception -> L30
            java.lang.String r1 = ""
            r0.append(r1)     // Catch: java.lang.Exception -> L30
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L30
            r3.write(r0)     // Catch: java.lang.Exception -> L30
            r3.flush()     // Catch: java.lang.Exception -> L30
            r3.close()     // Catch: java.lang.Exception -> L30
        L30:
            return
    }

    @android.annotation.TargetApi(21)
    public void l() {
            r2 = this;
            boolean r0 = r2.g
            if (r0 != 0) goto L5
            return
        L5:
            android.bluetooth.BluetoothAdapter r0 = r2.d     // Catch: java.lang.Throwable -> L15
            android.bluetooth.le.BluetoothLeScanner r0 = r0.getBluetoothLeScanner()     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L19
            java.lang.Object r1 = r2.k     // Catch: java.lang.Throwable -> L15
            android.bluetooth.le.ScanCallback r1 = (android.bluetooth.le.ScanCallback) r1     // Catch: java.lang.Throwable -> L15
            r0.stopScan(r1)     // Catch: java.lang.Throwable -> L15
            goto L19
        L15:
            r0 = move-exception
            r0.printStackTrace()
        L19:
            r0 = 0
            r2.g = r0
            r2.l = r0
            r0 = -1
            r2.m = r0
            r2.c()
            return
    }
}
