package a.a.a.b;

/* JADX INFO: loaded from: classes.dex */
public class j {
    public static a.a.a.b.j H = null;
    public static java.lang.String I = "0";
    public long A;
    public android.os.Handler B;
    public byte[] C;
    public byte[] D;
    public int E;
    public java.util.List<java.lang.Byte> F;
    public boolean G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f37b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.String f38c;
    public int d;
    public int e;
    public int f;
    public double g;
    public double h;
    public double i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public long o;
    public a.a.a.b.j.d p;
    public boolean q;
    public boolean r;
    public int s;
    public float t;
    public float u;
    public long v;
    public int w;
    public long x;
    public android.location.Location y;
    public android.location.Location z;

    public class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ android.location.Location f39b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a.a.a.b.j f40c;

        public a(a.a.a.b.j r1, android.location.Location r2) {
                r0 = this;
                r0.f40c = r1
                r0.f39b = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                a.a.a.b.j r0 = r1.f40c
                android.location.Location r1 = r1.f39b
                a.a.a.b.j.a(r0, r1)
                return
        }
    }

    public class b extends java.lang.Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.a.a.b.j f41b;

        public b(a.a.a.b.j r1) {
                r0 = this;
                r0.f41b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r3 = this;
                java.io.File r0 = new java.io.File
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = a.a.a.i.i.d()
                r1.append(r2)
                java.lang.String r2 = "/baidu/tempdata"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "intime.dat"
                r0.<init>(r1, r2)
                a.a.a.b.j r3 = r3.f41b
                java.lang.String r1 = "https://itsdata.map.baidu.com/long-conn-gps/sdk.php"
                a.a.a.b.j.a(r3, r0, r1)
                return
        }
    }

    public static class c implements javax.net.ssl.HostnameVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public java.net.URL f42a;

        public c(java.net.URL r1) {
                r0 = this;
                r0.<init>()
                r0.f42a = r1
                return
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(java.lang.String r1, javax.net.ssl.SSLSession r2) {
                r0 = this;
                java.net.URL r0 = r0.f42a
                java.lang.String r0 = r0.getHost()
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto Le
                r0 = 1
                return r0
            Le:
                r0 = 0
                return r0
        }
    }

    public class d extends a.a.a.i.g {
        public java.lang.String i;
        public final /* synthetic */ a.a.a.b.j j;

        public d(a.a.a.b.j r1) {
                r0 = this;
                r0.j = r1
                r0.<init>()
                r1 = 0
                r0.i = r1
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                r0.d = r1
                return
        }

        @Override // a.a.a.i.g
        public void a() {
                r2 = this;
                java.lang.String r0 = "https://loc.map.baidu.com/cc.php"
                r2.f337a = r0
                java.lang.String r0 = r2.i
                java.lang.String r0 = com.baidu.location.Jni.b(r0)
                r1 = 0
                r2.i = r1
                java.util.Map<java.lang.String, java.lang.Object> r2 = r2.d
                java.lang.String r1 = "q"
                r2.put(r1, r0)
                return
        }

        @Override // a.a.a.i.g
        public void a(boolean r4) {
                r3 = this;
                if (r4 == 0) goto L24
                java.lang.String r4 = r3.f339c
                if (r4 == 0) goto L24
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L24
                r0.<init>(r4)     // Catch: java.lang.Exception -> L24
                java.lang.String r4 = "prod"
                java.lang.String r1 = a.a.a.i.b.f     // Catch: java.lang.Exception -> L24
                r0.put(r4, r1)     // Catch: java.lang.Exception -> L24
                java.lang.String r4 = "uptime"
                long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L24
                r0.put(r4, r1)     // Catch: java.lang.Exception -> L24
                a.a.a.b.j r4 = r3.j     // Catch: java.lang.Exception -> L24
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L24
                a.a.a.b.j.a(r4, r0)     // Catch: java.lang.Exception -> L24
            L24:
                java.util.Map<java.lang.String, java.lang.Object> r3 = r3.d
                if (r3 == 0) goto L2b
                r3.clear()
            L2b:
                return
        }

        public void c(java.lang.String r1) {
                r0 = this;
                r0.i = r1
                java.lang.String r1 = "https://loc.map.baidu.com/cc.php"
                r0.a(r1)
                return
        }
    }

    static {
            return
    }

    public j() {
            r5 = this;
            r5.<init>()
            r0 = 1
            r5.f36a = r0
            r1 = 4604480258916220928(0x3fe6666660000000, double:0.699999988079071)
            r5.f37b = r1
            java.lang.String r1 = "3G|4G"
            r5.f38c = r1
            r5.d = r0
            r0 = 307200(0x4b000, float:4.30479E-40)
            r5.e = r0
            r0 = 15
            r5.f = r0
            r0 = 4615063718147915776(0x400c000000000000, double:3.5)
            r5.g = r0
            r0 = 4613937818241073152(0x4008000000000000, double:3.0)
            r5.h = r0
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r5.i = r0
            r0 = 300(0x12c, float:4.2E-43)
            r5.j = r0
            r0 = 60
            r5.k = r0
            r1 = 0
            r5.l = r1
            r5.m = r0
            r5.n = r1
            r2 = 0
            r5.o = r2
            r0 = 0
            r5.p = r0
            r5.q = r1
            r5.r = r1
            r5.s = r1
            r4 = 0
            r5.t = r4
            r5.u = r4
            r5.v = r2
            r4 = 500(0x1f4, float:7.0E-43)
            r5.w = r4
            r5.x = r2
            r5.y = r0
            r5.z = r0
            r5.A = r2
            r5.B = r0
            r2 = 4
            byte[] r2 = new byte[r2]
            r5.C = r2
            r5.D = r0
            r5.E = r1
            r5.F = r0
            r5.G = r1
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r5.B = r0
            return
    }

    public static /* synthetic */ java.lang.String a(a.a.a.b.j r0, java.io.File r1, java.lang.String r2) {
            java.lang.String r0 = r0.a(r1, r2)
            return r0
    }

    public static /* synthetic */ void a(a.a.a.b.j r0, android.location.Location r1) {
            r0.c(r1)
            return
    }

    public static /* synthetic */ void a(a.a.a.b.j r0, java.lang.String r1) {
            r0.e(r1)
            return
    }

    public static a.a.a.b.j k() {
            a.a.a.b.j r0 = a.a.a.b.j.H
            if (r0 != 0) goto Lb
            a.a.a.b.j r0 = new a.a.a.b.j
            r0.<init>()
            a.a.a.b.j.H = r0
        Lb:
            a.a.a.b.j r0 = a.a.a.b.j.H
            return r0
    }

    public final java.lang.String a(java.io.File r10, java.lang.String r11) {
            r9 = this;
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "--"
            java.lang.String r2 = "\r\n"
            java.lang.String r3 = "multipart/form-data"
            javax.net.ssl.SSLSocketFactory r4 = a.a.a.i.i.g()     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126
            javax.net.ssl.HttpsURLConnection.setDefaultSSLSocketFactory(r4)     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126
            java.net.URL r4 = new java.net.URL     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126
            r4.<init>(r11)     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126
            java.net.URLConnection r11 = r4.openConnection()     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126
            javax.net.ssl.HttpsURLConnection r11 = (javax.net.ssl.HttpsURLConnection) r11     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126
            r5 = 10000(0x2710, float:1.4013E-41)
            r11.setReadTimeout(r5)     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126
            r11.setConnectTimeout(r5)     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126
            r5 = 1
            r11.setDoInput(r5)     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126
            r11.setDoOutput(r5)     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126
            r5 = 0
            r11.setUseCaches(r5)     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126
            java.lang.String r6 = "POST"
            r11.setRequestMethod(r6)     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126
            java.lang.String r6 = "Charset"
            java.lang.String r7 = "utf-8"
            r11.setRequestProperty(r6, r7)     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126
            a.a.a.b.j$c r6 = new a.a.a.b.j$c     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126
            r6.<init>(r4)     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126
            r11.setHostnameVerifier(r6)     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126
            java.lang.String r4 = "connection"
            java.lang.String r6 = "close"
            r11.setRequestProperty(r4, r6)     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126
            java.lang.String r4 = "Content-Type"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            r6.<init>()     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            r6.append(r3)     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            java.lang.String r3 = ";boundary="
            r6.append(r3)     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            r6.append(r0)     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            java.lang.String r3 = r6.toString()     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            r11.setRequestProperty(r4, r3)     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            if (r10 == 0) goto L126
            boolean r3 = r10.exists()     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            if (r3 == 0) goto L126
            java.io.OutputStream r3 = r11.getOutputStream()     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            java.io.DataOutputStream r4 = new java.io.DataOutputStream     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            r4.<init>(r3)     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            java.lang.StringBuffer r6 = new java.lang.StringBuffer     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            r6.<init>()     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            r6.append(r1)     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            r6.append(r0)     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            r6.append(r2)     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            r7.<init>()     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            java.lang.String r8 = "Content-Disposition: form-data; name=\"location_dat\"; filename=\""
            r7.append(r8)     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            java.lang.String r8 = r10.getName()     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            r7.append(r8)     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            java.lang.String r8 = "\""
            r7.append(r8)     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            r7.append(r2)     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            r6.append(r7)     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            r7.<init>()     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            java.lang.String r8 = "Content-Type: application/octet-stream; charset=utf-8"
            r7.append(r8)     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            r7.append(r2)     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            r6.append(r7)     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            r6.append(r2)     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            byte[] r6 = r6.getBytes()     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            r4.write(r6)     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            r6.<init>(r10)     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            r10 = 1024(0x400, float:1.435E-42)
            byte[] r10 = new byte[r10]     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
        Ld1:
            int r7 = r6.read(r10)     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            r8 = -1
            if (r7 == r8) goto Ldc
            r4.write(r10, r5, r7)     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            goto Ld1
        Ldc:
            r6.close()     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            byte[] r10 = r2.getBytes()     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            r4.write(r10)     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            r10.<init>()     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            r10.append(r1)     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            r10.append(r0)     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            r10.append(r1)     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            r10.append(r2)     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            byte[] r10 = r10.getBytes()     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            r4.write(r10)     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            r4.flush()     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            r4.close()     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            int r10 = r11.getResponseCode()     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            r3.close()     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            r11.disconnect()     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            int r11 = r9.n     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            int r11 = r11 + 400
            r9.n = r11     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            r9.c(r11)     // Catch: java.lang.Exception -> L122 java.lang.Throwable -> L126 java.lang.Throwable -> L126
            r9 = 200(0xc8, float:2.8E-43)
            if (r10 != r9) goto L126
            java.lang.String r9 = "1"
            return r9
        L122:
            r9 = move-exception
            r9.printStackTrace()
        L126:
            java.lang.String r9 = "0"
            return r9
    }

    public final void a() {
            r5 = this;
            long r0 = r5.A
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lfb
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r5.A
            long r0 = r0 - r2
            int r2 = r5.f
            int r2 = r2 * 1000
            long r2 = (long) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L1a
            goto Lfb
        L1a:
            android.content.Context r0 = com.baidu.location.f.c()
            r1 = 4
            java.lang.String r2 = "loc_navi_mode"
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r2, r1)
            r1 = 0
            java.lang.String r2 = "is_navi_on"
            boolean r0 = r0.getBoolean(r2, r1)
            if (r0 == 0) goto L32
            r5.g()
            return
        L32:
            int r0 = r5.d
            r2 = 1
            if (r0 != r2) goto L41
            boolean r0 = r5.e()
            if (r0 != 0) goto L41
            r5.g()
            return
        L41:
            java.lang.String r0 = a.a.a.i.b.f
            java.lang.String r3 = "com.ubercab.driver"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L5b
            java.lang.String r0 = a.a.a.i.b.f
            android.content.Context r3 = com.baidu.location.f.c()
            boolean r0 = r5.a(r0, r3)
            if (r0 != 0) goto L65
            r5.g()
            return
        L5b:
            boolean r0 = r5.d()
            if (r0 == 0) goto L65
            r5.g()
            return
        L65:
            java.util.List<java.lang.Byte> r0 = r5.F
            if (r0 == 0) goto Lfb
            int r0 = r0.size()     // Catch: java.lang.Exception -> Lfb
            java.util.List<java.lang.Byte> r3 = r5.F     // Catch: java.lang.Exception -> Lfb
            r4 = r0 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4     // Catch: java.lang.Exception -> Lfb
            java.lang.Byte r4 = java.lang.Byte.valueOf(r4)     // Catch: java.lang.Exception -> Lfb
            r3.set(r1, r4)     // Catch: java.lang.Exception -> Lfb
            java.util.List<java.lang.Byte> r3 = r5.F     // Catch: java.lang.Exception -> Lfb
            r4 = 65280(0xff00, float:9.1477E-41)
            r4 = r4 & r0
            int r4 = r4 >> 8
            byte r4 = (byte) r4     // Catch: java.lang.Exception -> Lfb
            java.lang.Byte r4 = java.lang.Byte.valueOf(r4)     // Catch: java.lang.Exception -> Lfb
            r3.set(r2, r4)     // Catch: java.lang.Exception -> Lfb
            java.util.List<java.lang.Byte> r2 = r5.F     // Catch: java.lang.Exception -> Lfb
            r3 = 3
            int r4 = r5.E     // Catch: java.lang.Exception -> Lfb
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4     // Catch: java.lang.Exception -> Lfb
            java.lang.Byte r4 = java.lang.Byte.valueOf(r4)     // Catch: java.lang.Exception -> Lfb
            r2.set(r3, r4)     // Catch: java.lang.Exception -> Lfb
            byte[] r2 = new byte[r0]     // Catch: java.lang.Exception -> Lfb
        L9a:
            if (r1 >= r0) goto Lad
            java.util.List<java.lang.Byte> r3 = r5.F     // Catch: java.lang.Exception -> Lfb
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Exception -> Lfb
            java.lang.Byte r3 = (java.lang.Byte) r3     // Catch: java.lang.Exception -> Lfb
            byte r3 = r3.byteValue()     // Catch: java.lang.Exception -> Lfb
            r2[r1] = r3     // Catch: java.lang.Exception -> Lfb
            int r1 = r1 + 1
            goto L9a
        Lad:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> Lfb
            java.lang.String r1 = a.a.a.i.i.d()     // Catch: java.lang.Exception -> Lfb
            java.lang.String r3 = "baidu/tempdata"
            r0.<init>(r1, r3)     // Catch: java.lang.Exception -> Lfb
            boolean r1 = r0.exists()     // Catch: java.lang.Exception -> Lfb
            if (r1 != 0) goto Lc1
            r0.mkdirs()     // Catch: java.lang.Exception -> Lfb
        Lc1:
            boolean r1 = r0.exists()     // Catch: java.lang.Exception -> Lfb
            if (r1 == 0) goto Lf2
            java.lang.String r1 = "intime.dat"
            java.io.File r3 = new java.io.File     // Catch: java.lang.Exception -> Lfb
            r3.<init>(r0, r1)     // Catch: java.lang.Exception -> Lfb
            boolean r0 = r3.exists()     // Catch: java.lang.Exception -> Lfb
            if (r0 == 0) goto Ld7
            r3.delete()     // Catch: java.lang.Exception -> Lfb
        Ld7:
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream     // Catch: java.lang.Exception -> Lf2
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> Lf2
            r1.<init>(r3)     // Catch: java.lang.Exception -> Lf2
            r0.<init>(r1)     // Catch: java.lang.Exception -> Lf2
            r0.write(r2)     // Catch: java.lang.Exception -> Lf2
            r0.flush()     // Catch: java.lang.Exception -> Lf2
            r0.close()     // Catch: java.lang.Exception -> Lf2
            a.a.a.b.j$b r0 = new a.a.a.b.j$b     // Catch: java.lang.Exception -> Lf2
            r0.<init>(r5)     // Catch: java.lang.Exception -> Lf2
            r0.start()     // Catch: java.lang.Exception -> Lf2
        Lf2:
            r5.g()     // Catch: java.lang.Exception -> Lfb
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> Lfb
            r5.v = r0     // Catch: java.lang.Exception -> Lfb
        Lfb:
            return
    }

    public final void a(int r4) {
            r3 = this;
            byte[] r4 = r3.b(r4)
            r0 = 0
        L5:
            r1 = 4
            if (r0 >= r1) goto L16
            java.util.List<java.lang.Byte> r1 = r3.F
            r2 = r4[r0]
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            r1.add(r2)
            int r0 = r0 + 1
            goto L5
        L16:
            return
    }

    public final void a(android.location.Location r5) {
            r4 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r4.A = r0
            long r0 = r5.getTime()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            int r0 = (int) r0
            r4.a(r0)
            double r0 = r5.getLongitude()
            r2 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r0 = r0 * r2
            int r0 = (int) r0
            r4.a(r0)
            double r0 = r5.getLatitude()
            double r0 = r0 * r2
            int r0 = (int) r0
            r4.a(r0)
            boolean r0 = r5.hasBearing()
            r0 = r0 ^ 1
            boolean r1 = r5.hasSpeed()
            r1 = r1 ^ 1
            if (r0 <= 0) goto L42
            java.util.List<java.lang.Byte> r0 = r4.F
            r2 = 32
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            r0.add(r2)
            goto L59
        L42:
            float r0 = r5.getBearing()
            r2 = 1097859072(0x41700000, float:15.0)
            float r0 = r0 / r2
            int r0 = (int) r0
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r0 = r0 & (-33)
            byte r0 = (byte) r0
            java.util.List<java.lang.Byte> r2 = r4.F
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r2.add(r0)
        L59:
            if (r1 <= 0) goto L67
            java.util.List<java.lang.Byte> r0 = r4.F
            r1 = -128(0xffffffffffffff80, float:NaN)
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            r0.add(r1)
            goto L85
        L67:
            float r0 = r5.getSpeed()
            double r0 = (double) r0
            r2 = 4615288898129284301(0x400ccccccccccccd, double:3.6)
            double r0 = r0 * r2
            r2 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r0 = r0 / r2
            int r0 = (int) r0
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r0 = r0 & 127(0x7f, float:1.78E-43)
            byte r0 = (byte) r0
            java.util.List<java.lang.Byte> r1 = r4.F
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r1.add(r0)
        L85:
            r4.y = r5
            return
    }

    public final boolean a(java.lang.String r1, android.content.Context r2) {
            r0 = this;
            r0 = 1
            return r0
    }

    public final byte[] a(java.lang.String r8) {
            r7 = this;
            if (r8 != 0) goto L4
            r7 = 0
            return r7
        L4:
            byte[] r7 = r8.getBytes()
            java.security.SecureRandom r8 = new java.security.SecureRandom
            r8.<init>()
            r0 = 255(0xff, float:3.57E-43)
            int r8 = r8.nextInt(r0)
            byte r8 = (byte) r8
            java.security.SecureRandom r1 = new java.security.SecureRandom
            r1.<init>()
            int r0 = r1.nextInt(r0)
            byte r0 = (byte) r0
            int r1 = r7.length
            int r1 = r1 + 2
            byte[] r1 = new byte[r1]
            int r2 = r7.length
            r3 = 0
            r4 = r3
        L26:
            if (r3 >= r2) goto L34
            r5 = r7[r3]
            int r6 = r4 + 1
            r5 = r5 ^ r8
            byte r5 = (byte) r5
            r1[r4] = r5
            int r3 = r3 + 1
            r4 = r6
            goto L26
        L34:
            int r7 = r4 + 1
            r1[r4] = r8
            r1[r7] = r0
            return r1
    }

    public final java.lang.String b(java.lang.String r5) {
            r4 = this;
            java.util.Calendar r4 = java.util.Calendar.getInstance()
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 1
            int r2 = r4.get(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r0[r3] = r2
            r2 = 2
            int r3 = r4.get(r2)
            int r3 = r3 + r1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r1] = r3
            r1 = 5
            int r4 = r4.get(r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0[r2] = r4
            java.lang.String r4 = java.lang.String.format(r5, r0)
            return r4
    }

    public final void b() {
            r5 = this;
            java.lang.String r0 = "9.5.2.1"
            java.lang.String r1 = "\\."
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            byte[] r2 = r5.C
            r3 = 0
            r2[r3] = r3
            r4 = 1
            r2[r4] = r3
            r4 = 2
            r2[r4] = r3
            r4 = 3
            r2[r4] = r3
            r2 = 4
            if (r1 < r2) goto L1b
            r1 = r2
        L1b:
            if (r3 >= r1) goto L31
            byte[] r2 = r5.C     // Catch: java.lang.Exception -> L31
            r4 = r0[r3]     // Catch: java.lang.Exception -> L31
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L31
            int r4 = r4.intValue()     // Catch: java.lang.Exception -> L31
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4     // Catch: java.lang.Exception -> L31
            r2[r3] = r4     // Catch: java.lang.Exception -> L31
            int r3 = r3 + 1
            goto L1b
        L31:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = a.a.a.i.b.f
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            a.a.a.i.b r1 = a.a.a.i.b.e()
            java.lang.String r1 = r1.f321c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            byte[] r0 = r5.a(r0)
            r5.D = r0
            return
    }

    public final void b(android.location.Location r22) {
            r21 = this;
            r0 = r21
            r1 = r22
            if (r1 != 0) goto L7
            return
        L7:
            double r2 = r22.getLongitude()
            android.location.Location r4 = r0.y
            double r4 = r4.getLongitude()
            double r2 = r2 - r4
            r4 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r2 = r2 * r4
            int r2 = (int) r2
            double r6 = r22.getLatitude()
            android.location.Location r3 = r0.y
            double r8 = r3.getLatitude()
            double r6 = r6 - r8
            double r6 = r6 * r4
            int r3 = (int) r6
            boolean r4 = r22.hasBearing()
            r5 = 1
            r4 = r4 ^ r5
            boolean r6 = r22.hasSpeed()
            r6 = r6 ^ r5
            if (r2 <= 0) goto L35
            r8 = 0
            goto L36
        L35:
            r8 = r5
        L36:
            int r2 = java.lang.Math.abs(r2)
            if (r3 <= 0) goto L3e
            r9 = 0
            goto L3f
        L3e:
            r9 = r5
        L3f:
            int r3 = java.lang.Math.abs(r3)
            int r10 = r0.E
            if (r10 <= r5) goto L4e
            r5 = 0
            r0.z = r5
            android.location.Location r5 = r0.y
            r0.z = r5
        L4e:
            r0.y = r1
            if (r1 == 0) goto Lc1
            android.location.Location r5 = r0.z
            if (r5 == 0) goto Lc1
            long r10 = r22.getTime()
            android.location.Location r5 = r0.z
            long r12 = r5.getTime()
            int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r5 <= 0) goto Lc1
            android.location.Location r5 = r0.y
            long r10 = r5.getTime()
            android.location.Location r5 = r0.z
            long r12 = r5.getTime()
            long r10 = r10 - r12
            r12 = 5000(0x1388, double:2.4703E-320)
            int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r5 >= 0) goto Lc1
            android.location.Location r5 = r0.y
            long r10 = r5.getTime()
            android.location.Location r5 = r0.z
            long r12 = r5.getTime()
            long r10 = r10 - r12
            r5 = 2
            float[] r5 = new float[r5]
            android.location.Location r12 = r0.y
            double r12 = r12.getAltitude()
            android.location.Location r14 = r0.y
            double r14 = r14.getLongitude()
            android.location.Location r7 = r0.z
            double r16 = r7.getLatitude()
            android.location.Location r7 = r0.z
            double r18 = r7.getLongitude()
            r20 = r5
            android.location.Location.distanceBetween(r12, r14, r16, r18, r20)
            r7 = 0
            r5 = r5[r7]
            android.location.Location r7 = r0.z
            float r7 = r7.getSpeed()
            float r12 = (float) r10
            float r7 = r7 * r12
            float r5 = r5 - r7
            r7 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 * r7
            long r10 = r10 * r10
            float r7 = (float) r10
            float r5 = r5 / r7
            double r10 = (double) r5
            float r5 = r0.u
            double r12 = (double) r5
            int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r5 <= 0) goto Lc1
            float r5 = (float) r10
            r0.u = r5
        Lc1:
            java.util.List<java.lang.Byte> r5 = r0.F
            r7 = r2 & 255(0xff, float:3.57E-43)
            byte r7 = (byte) r7
            java.lang.Byte r7 = java.lang.Byte.valueOf(r7)
            r5.add(r7)
            java.util.List<java.lang.Byte> r5 = r0.F
            r7 = 65280(0xff00, float:9.1477E-41)
            r2 = r2 & r7
            int r2 = r2 >> 8
            byte r2 = (byte) r2
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            r5.add(r2)
            java.util.List<java.lang.Byte> r2 = r0.F
            r5 = r3 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            java.lang.Byte r5 = java.lang.Byte.valueOf(r5)
            r2.add(r5)
            java.util.List<java.lang.Byte> r2 = r0.F
            r3 = r3 & r7
            int r3 = r3 >> 8
            byte r3 = (byte) r3
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r2.add(r3)
            r2 = -128(0xffffffffffffff80, float:NaN)
            if (r4 <= 0) goto L104
            r3 = 32
            if (r9 <= 0) goto L101
            r3 = 96
            byte r3 = (byte) r3
        L101:
            if (r8 <= 0) goto L11b
            goto L119
        L104:
            float r3 = r22.getBearing()
            r4 = 1097859072(0x41700000, float:15.0)
            float r3 = r3 / r4
            int r3 = (int) r3
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r3 = r3 & 31
            byte r3 = (byte) r3
            if (r9 <= 0) goto L117
            r3 = r3 | 64
            byte r3 = (byte) r3
        L117:
            if (r8 <= 0) goto L11b
        L119:
            r3 = r3 | r2
            byte r3 = (byte) r3
        L11b:
            java.util.List<java.lang.Byte> r4 = r0.F
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r4.add(r3)
            if (r6 <= 0) goto L12d
            java.util.List<java.lang.Byte> r0 = r0.F
            java.lang.Byte r1 = java.lang.Byte.valueOf(r2)
            goto L148
        L12d:
            float r1 = r22.getSpeed()
            double r1 = (double) r1
            r3 = 4615288898129284301(0x400ccccccccccccd, double:3.6)
            double r1 = r1 * r3
            r3 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r1 = r1 / r3
            int r1 = (int) r1
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r1 = r1 & 127(0x7f, float:1.78E-43)
            byte r1 = (byte) r1
            java.util.List<java.lang.Byte> r0 = r0.F
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
        L148:
            r0.add(r1)
            return
    }

    public final byte[] b(int r3) {
            r2 = this;
            r2 = 4
            byte[] r2 = new byte[r2]
            r0 = r3 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r1 = 0
            r2[r1] = r0
            r0 = 65280(0xff00, float:9.1477E-41)
            r0 = r0 & r3
            int r0 = r0 >> 8
            byte r0 = (byte) r0
            r1 = 1
            r2[r1] = r0
            r0 = 16711680(0xff0000, float:2.3418052E-38)
            r0 = r0 & r3
            int r0 = r0 >> 16
            byte r0 = (byte) r0
            r1 = 2
            r2[r1] = r0
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3 = r3 & r0
            int r3 = r3 >> 24
            byte r3 = (byte) r3
            r0 = 3
            r2[r0] = r3
            return r2
    }

    public final void c() {
            r4 = this;
            java.util.List<java.lang.Byte> r0 = r4.F
            r1 = 0
            java.lang.Byte r2 = java.lang.Byte.valueOf(r1)
            r0.add(r2)
            java.util.List<java.lang.Byte> r0 = r4.F
            r0.add(r2)
            java.lang.String r0 = a.a.a.b.j.I
            java.lang.String r3 = "0"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L1e
            java.util.List<java.lang.Byte> r0 = r4.F
            r3 = -82
            goto L22
        L1e:
            java.util.List<java.lang.Byte> r0 = r4.F
            r3 = -66
        L22:
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r0.add(r3)
            java.util.List<java.lang.Byte> r0 = r4.F
            r0.add(r2)
            java.util.List<java.lang.Byte> r0 = r4.F
            byte[] r2 = r4.C
            r2 = r2[r1]
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            r0.add(r2)
            java.util.List<java.lang.Byte> r0 = r4.F
            byte[] r2 = r4.C
            r3 = 1
            r2 = r2[r3]
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            r0.add(r2)
            java.util.List<java.lang.Byte> r0 = r4.F
            byte[] r2 = r4.C
            r3 = 2
            r2 = r2[r3]
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            r0.add(r2)
            java.util.List<java.lang.Byte> r0 = r4.F
            byte[] r2 = r4.C
            r3 = 3
            r2 = r2[r3]
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            r0.add(r2)
            byte[] r0 = r4.D
            int r0 = r0.length
            java.util.List<java.lang.Byte> r2 = r4.F
            int r3 = r0 + 1
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r2.add(r3)
        L76:
            if (r1 >= r0) goto L88
            java.util.List<java.lang.Byte> r2 = r4.F
            byte[] r3 = r4.D
            r3 = r3[r1]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r2.add(r3)
            int r1 = r1 + 1
            goto L76
        L88:
            return
    }

    public final void c(int r9) {
            r8 = this;
            if (r9 != 0) goto L3
            return
        L3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = a.a.a.i.h.f353a
            r0.append(r1)
            java.lang.String r1 = "/grtcf.dat"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L9e
            r1.<init>(r0)     // Catch: java.lang.Exception -> L9e
            boolean r0 = r1.exists()     // Catch: java.lang.Exception -> L9e
            r2 = 8
            java.lang.String r4 = "rw"
            if (r0 != 0) goto L6e
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L9e
            java.lang.String r5 = a.a.a.i.h.f353a     // Catch: java.lang.Exception -> L9e
            r0.<init>(r5)     // Catch: java.lang.Exception -> L9e
            boolean r5 = r0.exists()     // Catch: java.lang.Exception -> L9e
            if (r5 != 0) goto L35
            r0.mkdirs()     // Catch: java.lang.Exception -> L9e
        L35:
            boolean r0 = r1.createNewFile()     // Catch: java.lang.Exception -> L9e
            if (r0 == 0) goto L6d
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> L9e
            r0.<init>(r1, r4)     // Catch: java.lang.Exception -> L9e
            r5 = 2
            r0.seek(r5)     // Catch: java.lang.Exception -> L9e
            r5 = 0
            r0.writeInt(r5)     // Catch: java.lang.Exception -> L9e
            r0.seek(r2)     // Catch: java.lang.Exception -> L9e
            java.lang.String r6 = "1980_01_01:0"
            byte[] r6 = r6.getBytes()     // Catch: java.lang.Exception -> L9e
            int r7 = r6.length     // Catch: java.lang.Exception -> L9e
            r0.writeInt(r7)     // Catch: java.lang.Exception -> L9e
            r0.write(r6)     // Catch: java.lang.Exception -> L9e
            r6 = 200(0xc8, double:9.9E-322)
            r0.seek(r6)     // Catch: java.lang.Exception -> L9e
            r0.writeBoolean(r5)     // Catch: java.lang.Exception -> L9e
            r6 = 800(0x320, double:3.953E-321)
            r0.seek(r6)     // Catch: java.lang.Exception -> L9e
            r0.writeBoolean(r5)     // Catch: java.lang.Exception -> L9e
            r0.close()     // Catch: java.lang.Exception -> L9e
            goto L6e
        L6d:
            return
        L6e:
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> L9e
            r0.<init>(r1, r4)     // Catch: java.lang.Exception -> L9e
            r0.seek(r2)     // Catch: java.lang.Exception -> L9e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L9e
            r1.<init>()     // Catch: java.lang.Exception -> L9e
            java.lang.String r2 = "%d_%02d_%02d"
            java.lang.String r8 = r8.b(r2)     // Catch: java.lang.Exception -> L9e
            r1.append(r8)     // Catch: java.lang.Exception -> L9e
            java.lang.String r8 = ":"
            r1.append(r8)     // Catch: java.lang.Exception -> L9e
            r1.append(r9)     // Catch: java.lang.Exception -> L9e
            java.lang.String r8 = r1.toString()     // Catch: java.lang.Exception -> L9e
            byte[] r8 = r8.getBytes()     // Catch: java.lang.Exception -> L9e
            int r9 = r8.length     // Catch: java.lang.Exception -> L9e
            r0.writeInt(r9)     // Catch: java.lang.Exception -> L9e
            r0.write(r8)     // Catch: java.lang.Exception -> L9e
            r0.close()     // Catch: java.lang.Exception -> L9e
        L9e:
            return
    }

    public final void c(android.location.Location r1) {
            r0 = this;
            r0.d(r1)
            r0.a()
            return
    }

    public final void c(java.lang.String r10) {
            r9 = this;
            java.lang.String r0 = ":"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = a.a.a.i.h.f353a
            r1.append(r2)
            java.lang.String r2 = "/grtcf.dat"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.io.File r2 = new java.io.File     // Catch: java.lang.Exception -> L99
            r2.<init>(r1)     // Catch: java.lang.Exception -> L99
            boolean r1 = r2.exists()     // Catch: java.lang.Exception -> L99
            if (r1 == 0) goto L99
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> L99
            java.lang.String r3 = "rw"
            r1.<init>(r2, r3)     // Catch: java.lang.Exception -> L99
            r2 = 2
            r1.seek(r2)     // Catch: java.lang.Exception -> L99
            int r2 = r1.readInt()     // Catch: java.lang.Exception -> L99
            r3 = 8
            r1.seek(r3)     // Catch: java.lang.Exception -> L99
            int r3 = r1.readInt()     // Catch: java.lang.Exception -> L99
            r4 = 0
            r5 = 4096(0x1000, float:5.74E-42)
            r6 = 1
            if (r3 >= r5) goto L6e
            byte[] r7 = new byte[r3]     // Catch: java.lang.Exception -> L99
            r1.read(r7, r4, r3)     // Catch: java.lang.Exception -> L99
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Exception -> L99
            r3.<init>(r7)     // Catch: java.lang.Exception -> L99
            java.lang.String r7 = "%d_%02d_%02d"
            java.lang.String r7 = r9.b(r7)     // Catch: java.lang.Exception -> L99
            boolean r7 = r3.contains(r7)     // Catch: java.lang.Exception -> L99
            if (r7 == 0) goto L6e
            boolean r7 = r3.contains(r0)     // Catch: java.lang.Exception -> L99
            if (r7 == 0) goto L6e
            java.lang.String[] r0 = r3.split(r0)     // Catch: java.lang.Exception -> L6e
            int r3 = r0.length     // Catch: java.lang.Exception -> L6e
            if (r3 <= r6) goto L6e
            r0 = r0[r6]     // Catch: java.lang.Exception -> L6e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L6e
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> L6e
            r9.n = r0     // Catch: java.lang.Exception -> L6e
        L6e:
            if (r6 > r2) goto L96
            int r0 = r6 * 2048
            long r7 = (long) r0
            r1.seek(r7)     // Catch: java.lang.Exception -> L99
            int r0 = r1.readInt()     // Catch: java.lang.Exception -> L99
            if (r0 <= r5) goto L7d
            goto L93
        L7d:
            byte[] r3 = new byte[r0]     // Catch: java.lang.Exception -> L99
            r1.read(r3, r4, r0)     // Catch: java.lang.Exception -> L99
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Exception -> L99
            r0.<init>(r3)     // Catch: java.lang.Exception -> L99
            if (r10 == 0) goto L93
            boolean r3 = r0.contains(r10)     // Catch: java.lang.Exception -> L99
            if (r3 == 0) goto L93
            r9.d(r0)     // Catch: java.lang.Exception -> L99
            goto L96
        L93:
            int r6 = r6 + 1
            goto L6e
        L96:
            r1.close()     // Catch: java.lang.Exception -> L99
        L99:
            return
    }

    public final void d(android.location.Location r5) {
            r4 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r4.x
            long r0 = r0 - r2
            int r2 = r4.w
            long r2 = (long) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L44
            if (r5 != 0) goto L11
            goto L44
        L11:
            if (r5 == 0) goto L29
            boolean r0 = r5.hasSpeed()
            if (r0 == 0) goto L29
            float r0 = r5.getSpeed()
            float r1 = r4.t
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L29
            float r0 = r5.getSpeed()
            r4.t = r0
        L29:
            java.util.List<java.lang.Byte> r0 = r4.F     // Catch: java.lang.Exception -> L3e
            if (r0 != 0) goto L3b
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L3e
            r0.<init>()     // Catch: java.lang.Exception -> L3e
            r4.F = r0     // Catch: java.lang.Exception -> L3e
            r4.c()     // Catch: java.lang.Exception -> L3e
            r4.a(r5)     // Catch: java.lang.Exception -> L3e
            goto L3e
        L3b:
            r4.b(r5)     // Catch: java.lang.Exception -> L3e
        L3e:
            int r5 = r4.E
            int r5 = r5 + 1
            r4.E = r5
        L44:
            return
    }

    public final void d(java.lang.String r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            java.lang.String r2 = "uptime"
            java.lang.String r3 = "nondrper"
            java.lang.String r4 = "nondron"
            java.lang.String r5 = "stper"
            java.lang.String r6 = "drstsh"
            java.lang.String r7 = "stspsh"
            java.lang.String r8 = "acsh"
            java.lang.String r9 = "spsh"
            java.lang.String r10 = "chdron"
            java.lang.String r11 = "per"
            java.lang.String r12 = "tcsh"
            java.lang.String r13 = "tcon"
            java.lang.String r14 = "net"
            java.lang.String r15 = "bash"
            r16 = r2
            java.lang.String r2 = "on"
            if (r1 == 0) goto Le5
            r17 = r3
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> Le5
            r3.<init>(r1)     // Catch: org.json.JSONException -> Le5
            boolean r1 = r3.has(r2)     // Catch: org.json.JSONException -> Le5
            if (r1 == 0) goto L39
            int r1 = r3.getInt(r2)     // Catch: org.json.JSONException -> Le5
            r0.f36a = r1     // Catch: org.json.JSONException -> Le5
        L39:
            boolean r1 = r3.has(r15)     // Catch: org.json.JSONException -> Le5
            if (r1 == 0) goto L45
            double r1 = r3.getDouble(r15)     // Catch: org.json.JSONException -> Le5
            r0.f37b = r1     // Catch: org.json.JSONException -> Le5
        L45:
            boolean r1 = r3.has(r14)     // Catch: org.json.JSONException -> Le5
            if (r1 == 0) goto L51
            java.lang.String r1 = r3.getString(r14)     // Catch: org.json.JSONException -> Le5
            r0.f38c = r1     // Catch: org.json.JSONException -> Le5
        L51:
            boolean r1 = r3.has(r13)     // Catch: org.json.JSONException -> Le5
            if (r1 == 0) goto L5d
            int r1 = r3.getInt(r13)     // Catch: org.json.JSONException -> Le5
            r0.d = r1     // Catch: org.json.JSONException -> Le5
        L5d:
            boolean r1 = r3.has(r12)     // Catch: org.json.JSONException -> Le5
            if (r1 == 0) goto L69
            int r1 = r3.getInt(r12)     // Catch: org.json.JSONException -> Le5
            r0.e = r1     // Catch: org.json.JSONException -> Le5
        L69:
            boolean r1 = r3.has(r11)     // Catch: org.json.JSONException -> Le5
            if (r1 == 0) goto L75
            int r1 = r3.getInt(r11)     // Catch: org.json.JSONException -> Le5
            r0.f = r1     // Catch: org.json.JSONException -> Le5
        L75:
            boolean r1 = r3.has(r10)     // Catch: org.json.JSONException -> Le5
            if (r1 == 0) goto L7e
            r3.getInt(r10)     // Catch: org.json.JSONException -> Le5
        L7e:
            boolean r1 = r3.has(r9)     // Catch: org.json.JSONException -> Le5
            if (r1 == 0) goto L8a
            double r1 = r3.getDouble(r9)     // Catch: org.json.JSONException -> Le5
            r0.g = r1     // Catch: org.json.JSONException -> Le5
        L8a:
            boolean r1 = r3.has(r8)     // Catch: org.json.JSONException -> Le5
            if (r1 == 0) goto L96
            double r1 = r3.getDouble(r8)     // Catch: org.json.JSONException -> Le5
            r0.h = r1     // Catch: org.json.JSONException -> Le5
        L96:
            boolean r1 = r3.has(r7)     // Catch: org.json.JSONException -> Le5
            if (r1 == 0) goto La2
            double r1 = r3.getDouble(r7)     // Catch: org.json.JSONException -> Le5
            r0.i = r1     // Catch: org.json.JSONException -> Le5
        La2:
            boolean r1 = r3.has(r6)     // Catch: org.json.JSONException -> Le5
            if (r1 == 0) goto Lae
            int r1 = r3.getInt(r6)     // Catch: org.json.JSONException -> Le5
            r0.j = r1     // Catch: org.json.JSONException -> Le5
        Lae:
            boolean r1 = r3.has(r5)     // Catch: org.json.JSONException -> Le5
            if (r1 == 0) goto Lba
            int r1 = r3.getInt(r5)     // Catch: org.json.JSONException -> Le5
            r0.k = r1     // Catch: org.json.JSONException -> Le5
        Lba:
            boolean r1 = r3.has(r4)     // Catch: org.json.JSONException -> Le5
            if (r1 == 0) goto Lc6
            int r1 = r3.getInt(r4)     // Catch: org.json.JSONException -> Le5
            r0.l = r1     // Catch: org.json.JSONException -> Le5
        Lc6:
            r1 = r17
            boolean r2 = r3.has(r1)     // Catch: org.json.JSONException -> Le5
            if (r2 == 0) goto Ld4
            int r1 = r3.getInt(r1)     // Catch: org.json.JSONException -> Le5
            r0.m = r1     // Catch: org.json.JSONException -> Le5
        Ld4:
            r1 = r16
            boolean r2 = r3.has(r1)     // Catch: org.json.JSONException -> Le5
            if (r2 == 0) goto Le2
            long r1 = r3.getLong(r1)     // Catch: org.json.JSONException -> Le5
            r0.o = r1     // Catch: org.json.JSONException -> Le5
        Le2:
            r18.f()     // Catch: org.json.JSONException -> Le5
        Le5:
            return
    }

    public final boolean d() {
            r4 = this;
            r4 = 0
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L5d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L5d
            r2.<init>()     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L5d
            java.lang.String r3 = a.a.a.i.i.h()     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L5d
            r2.append(r3)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L5d
            java.lang.String r3 = java.io.File.separator     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L5d
            r2.append(r3)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L5d
            java.lang.String r3 = "gflk.dat"
            r2.append(r3)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L5d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L5d
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L5d
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L5d
            if (r2 != 0) goto L2a
            r1.createNewFile()     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L5d
        L2a:
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L5d
            java.lang.String r3 = "rw"
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L5d
            java.nio.channels.FileChannel r1 = r2.getChannel()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4e
            java.nio.channels.FileLock r4 = r1.tryLock()     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            goto L3d
        L3a:
            r4 = move-exception
            goto L4b
        L3c:
            r0 = 1
        L3d:
            if (r4 == 0) goto L42
            r4.release()     // Catch: java.lang.Exception -> L63
        L42:
            if (r1 == 0) goto L60
            r1.close()     // Catch: java.lang.Exception -> L63
            goto L60
        L48:
            r0 = move-exception
            r1 = r4
            r4 = r0
        L4b:
            r0 = r4
            r4 = r1
            goto L52
        L4e:
            r4 = r2
            goto L5d
        L50:
            r0 = move-exception
            r2 = r4
        L52:
            if (r4 == 0) goto L57
            r4.close()     // Catch: java.lang.Exception -> L5c
        L57:
            if (r2 == 0) goto L5c
            r2.close()     // Catch: java.lang.Exception -> L5c
        L5c:
            throw r0
        L5d:
            if (r4 == 0) goto L63
            r2 = r4
        L60:
            r2.close()     // Catch: java.lang.Exception -> L63
        L63:
            return r0
    }

    public void e(android.location.Location r7) {
            r6 = this;
            boolean r0 = r6.G
            if (r0 != 0) goto L7
            r6.h()
        L7:
            a.a.a.c.c r0 = a.a.a.c.c.f()
            int r0 = r0.a()
            double r0 = (double) r0
            double r2 = r6.f37b
            r4 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r2 = r2 * r4
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            if (r0 >= 0) goto L1c
            r0 = r1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            int r2 = r6.f36a
            if (r2 != r1) goto L4c
            if (r0 == 0) goto L4c
            java.lang.String r0 = r6.f38c
            a.a.a.g.f r2 = a.a.a.g.f.w()
            int r2 = r2.f()
            java.lang.String r2 = a.a.a.g.b.a(r2)
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L4c
            int r0 = r6.d
            if (r0 != r1) goto L42
            int r0 = r6.n
            int r1 = r6.e
            if (r0 <= r1) goto L42
            return
        L42:
            android.os.Handler r0 = r6.B
            a.a.a.b.j$a r1 = new a.a.a.b.j$a
            r1.<init>(r6, r7)
            r0.post(r1)
        L4c:
            return
    }

    public final void e(java.lang.String r8) {
            r7 = this;
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = a.a.a.i.h.f353a
            r7.append(r0)
            java.lang.String r0 = "/grtcf.dat"
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> Lb6
            r0.<init>(r7)     // Catch: java.lang.Exception -> Lb6
            boolean r7 = r0.exists()     // Catch: java.lang.Exception -> Lb6
            java.lang.String r1 = "rw"
            r2 = 2
            r4 = 0
            if (r7 != 0) goto L6b
            java.io.File r7 = new java.io.File     // Catch: java.lang.Exception -> Lb6
            java.lang.String r5 = a.a.a.i.h.f353a     // Catch: java.lang.Exception -> Lb6
            r7.<init>(r5)     // Catch: java.lang.Exception -> Lb6
            boolean r5 = r7.exists()     // Catch: java.lang.Exception -> Lb6
            if (r5 != 0) goto L33
            r7.mkdirs()     // Catch: java.lang.Exception -> Lb6
        L33:
            boolean r7 = r0.createNewFile()     // Catch: java.lang.Exception -> Lb6
            if (r7 == 0) goto L6a
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> Lb6
            r7.<init>(r0, r1)     // Catch: java.lang.Exception -> Lb6
            r7.seek(r2)     // Catch: java.lang.Exception -> Lb6
            r7.writeInt(r4)     // Catch: java.lang.Exception -> Lb6
            r5 = 8
            r7.seek(r5)     // Catch: java.lang.Exception -> Lb6
            java.lang.String r5 = "1980_01_01:0"
            byte[] r5 = r5.getBytes()     // Catch: java.lang.Exception -> Lb6
            int r6 = r5.length     // Catch: java.lang.Exception -> Lb6
            r7.writeInt(r6)     // Catch: java.lang.Exception -> Lb6
            r7.write(r5)     // Catch: java.lang.Exception -> Lb6
            r5 = 200(0xc8, double:9.9E-322)
            r7.seek(r5)     // Catch: java.lang.Exception -> Lb6
            r7.writeBoolean(r4)     // Catch: java.lang.Exception -> Lb6
            r5 = 800(0x320, double:3.953E-321)
            r7.seek(r5)     // Catch: java.lang.Exception -> Lb6
            r7.writeBoolean(r4)     // Catch: java.lang.Exception -> Lb6
            r7.close()     // Catch: java.lang.Exception -> Lb6
            goto L6b
        L6a:
            return
        L6b:
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> Lb6
            r7.<init>(r0, r1)     // Catch: java.lang.Exception -> Lb6
            r7.seek(r2)     // Catch: java.lang.Exception -> Lb6
            int r0 = r7.readInt()     // Catch: java.lang.Exception -> Lb6
            r1 = 1
        L78:
            if (r1 > r0) goto L9a
            int r5 = r1 * 2048
            long r5 = (long) r5     // Catch: java.lang.Exception -> Lb6
            r7.seek(r5)     // Catch: java.lang.Exception -> Lb6
            int r5 = r7.readInt()     // Catch: java.lang.Exception -> Lb6
            byte[] r6 = new byte[r5]     // Catch: java.lang.Exception -> Lb6
            r7.read(r6, r4, r5)     // Catch: java.lang.Exception -> Lb6
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Exception -> Lb6
            r5.<init>(r6)     // Catch: java.lang.Exception -> Lb6
            java.lang.String r6 = a.a.a.i.b.f     // Catch: java.lang.Exception -> Lb6
            boolean r5 = r5.contains(r6)     // Catch: java.lang.Exception -> Lb6
            if (r5 == 0) goto L97
            goto L9a
        L97:
            int r1 = r1 + 1
            goto L78
        L9a:
            if (r1 < r0) goto La2
            r7.seek(r2)     // Catch: java.lang.Exception -> Lb6
            r7.writeInt(r1)     // Catch: java.lang.Exception -> Lb6
        La2:
            int r1 = r1 * 2048
            long r0 = (long) r1     // Catch: java.lang.Exception -> Lb6
            r7.seek(r0)     // Catch: java.lang.Exception -> Lb6
            byte[] r8 = r8.getBytes()     // Catch: java.lang.Exception -> Lb6
            int r0 = r8.length     // Catch: java.lang.Exception -> Lb6
            r7.writeInt(r0)     // Catch: java.lang.Exception -> Lb6
            r7.write(r8)     // Catch: java.lang.Exception -> Lb6
            r7.close()     // Catch: java.lang.Exception -> Lb6
        Lb6:
            return
    }

    public final boolean e() {
            r7 = this;
            boolean r0 = r7.q
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L47
            boolean r0 = r7.r
            if (r0 == 0) goto L34
            float r0 = r7.t
            double r3 = (double) r0
            double r5 = r7.i
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L2f
            int r0 = r7.s
            int r3 = r7.f
            int r0 = r0 + r3
            r7.s = r0
            int r3 = r7.j
            if (r0 <= r3) goto L71
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r7.v
            long r3 = r3 - r5
            int r7 = r7.k
            int r7 = r7 * 1000
            long r5 = (long) r7
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L72
            goto L6e
        L2f:
            r7.s = r1
            r7.r = r1
            goto L71
        L34:
            float r0 = r7.t
            double r3 = (double) r0
            double r5 = r7.i
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L71
            r7.r = r2
            r7.s = r1
            int r0 = r7.f
            int r0 = r0 + r1
            r7.s = r0
            goto L6e
        L47:
            float r0 = r7.t
            double r3 = (double) r0
            double r5 = r7.g
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L6f
            float r0 = r7.u
            double r3 = (double) r0
            double r5 = r7.h
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L5a
            goto L6f
        L5a:
            int r0 = r7.l
            if (r0 != r2) goto L72
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r7.v
            long r3 = r3 - r5
            int r7 = r7.m
            int r7 = r7 * 1000
            long r5 = (long) r7
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L72
        L6e:
            goto L71
        L6f:
            r7.q = r2
        L71:
            r1 = r2
        L72:
            return r1
    }

    public final void f() {
            r0 = this;
            return
    }

    public final void g() {
            r3 = this;
            r0 = 0
            r3.F = r0
            r1 = 0
            r3.A = r1
            r1 = 0
            r3.E = r1
            r3.y = r0
            r3.z = r0
            r0 = 0
            r3.t = r0
            r3.u = r0
            return
    }

    public final void h() {
            r1 = this;
            boolean r0 = r1.G
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.G = r0
            java.lang.String r0 = a.a.a.i.b.f
            r1.c(r0)
            r1.j()
            r1.b()
            return
    }

    public void i() {
            r1 = this;
            boolean r0 = r1.G
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            r1.G = r0
            r1.g()
            return
    }

    public final void j() {
            r4 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r4.o
            long r0 = r0 - r2
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L3e
            a.a.a.b.j$d r0 = r4.p
            if (r0 != 0) goto L19
            a.a.a.b.j$d r0 = new a.a.a.b.j$d
            r0.<init>(r4)
            r4.p = r0
        L19:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            a.a.a.i.b r1 = a.a.a.i.b.e()
            r2 = 0
            java.lang.String r1 = r1.a(r2)
            r0.append(r1)
            a.a.a.b.c r1 = a.a.a.b.c.h()
            java.lang.String r1 = r1.d()
            r0.append(r1)
            a.a.a.b.j$d r1 = r4.p
            java.lang.String r0 = r0.toString()
            r1.c(r0)
        L3e:
            r4.f()
            return
    }
}
