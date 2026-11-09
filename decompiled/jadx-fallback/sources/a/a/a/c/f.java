package a.a.a.c;

/* JADX INFO: loaded from: classes.dex */
public class f {
    public static java.lang.Object f;
    public static a.a.a.c.f g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public android.os.Handler f118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.String f119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f120c;
    public a.a.a.c.f.b d;
    public long e;

    public class a extends android.os.Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.a.a.c.f f121a;

        public a(a.a.a.c.f r1) {
                r0 = this;
                r0.f121a = r1
                r0.<init>()
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r2) {
                r1 = this;
                int r2 = r2.what
                r0 = 1
                if (r2 == r0) goto L6
                goto Lb
            L6:
                a.a.a.c.f r1 = r1.f121a
                a.a.a.c.f.a(r1)
            Lb:
                return
        }
    }

    public class b extends a.a.a.i.g {
        public boolean i;
        public int j;
        public org.json.JSONArray k;
        public org.json.JSONArray l;
        public final /* synthetic */ a.a.a.c.f m;

        public b(a.a.a.c.f r1) {
                r0 = this;
                r0.m = r1
                r0.<init>()
                r1 = 0
                r0.i = r1
                r0.j = r1
                r1 = 0
                r0.k = r1
                r0.l = r1
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                r0.d = r1
                return
        }

        @Override // a.a.a.i.g
        public void a() {
                r4 = this;
                java.lang.String r0 = a.a.a.i.i.j()
                r4.f337a = r0
                java.util.Map<java.lang.String, java.lang.Object> r0 = r4.d
                r0.clear()
                java.util.Map<java.lang.String, java.lang.Object> r0 = r4.d
                java.lang.String r1 = "qt"
                java.lang.String r2 = "cltrw"
                r0.put(r1, r2)
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                java.lang.String r1 = "data"
                org.json.JSONArray r2 = r4.k     // Catch: java.lang.Exception -> L28
                r0.put(r1, r2)     // Catch: java.lang.Exception -> L28
                java.lang.String r1 = "frt"
                int r2 = r4.j     // Catch: java.lang.Exception -> L28
                r0.put(r1, r2)     // Catch: java.lang.Exception -> L28
                goto L2c
            L28:
                r1 = move-exception
                r1.printStackTrace()
            L2c:
                java.lang.String r0 = r0.toString()
                java.lang.String r0 = com.baidu.location.Jni.e(r0)
                java.util.Map<java.lang.String, java.lang.Object> r1 = r4.d
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = ""
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                java.lang.String r2 = "cltr[0]"
                r1.put(r2, r0)
                java.util.Map<java.lang.String, java.lang.Object> r0 = r4.d
                r1 = 1
                java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
                java.lang.String r3 = "cfg"
                r0.put(r3, r2)
                java.util.Map<java.lang.String, java.lang.Object> r0 = r4.d
                a.a.a.i.b r2 = a.a.a.i.b.e()
                java.lang.String r2 = r2.a()
                java.lang.String r2 = com.baidu.location.Jni.b(r2)
                java.lang.String r3 = "info"
                r0.put(r3, r2)
                java.util.Locale r0 = java.util.Locale.CHINA
                java.lang.Object[] r1 = new java.lang.Object[r1]
                long r2 = java.lang.System.currentTimeMillis()
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                r3 = 0
                r1[r3] = r2
                java.lang.String r2 = "%d"
                java.lang.String r0 = java.lang.String.format(r0, r2, r1)
                java.util.Map<java.lang.String, java.lang.Object> r4 = r4.d
                java.lang.String r1 = "trtm"
                r4.put(r1, r0)
                return
        }

        @Override // a.a.a.i.g
        public void a(boolean r5) {
                r4 = this;
                r0 = 0
                if (r5 == 0) goto L68
                java.lang.String r5 = r4.f339c
                if (r5 == 0) goto L68
                r5 = 0
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L11
                java.lang.String r2 = r4.f339c     // Catch: java.lang.Exception -> L11
                r1.<init>(r2)     // Catch: java.lang.Exception -> L11
                r5 = 1
                goto L13
            L11:
                r1 = r5
                r5 = r0
            L13:
                if (r5 == 0) goto L68
                if (r1 == 0) goto L68
                java.lang.String r5 = "tt"
                long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L68
                r1.put(r5, r2)     // Catch: java.lang.Exception -> L68
                java.lang.String r5 = "data"
                org.json.JSONArray r2 = r4.l     // Catch: java.lang.Exception -> L68
                r1.put(r5, r2)     // Catch: java.lang.Exception -> L68
                java.io.File r5 = new java.io.File     // Catch: java.lang.Exception -> L64
                a.a.a.c.f r2 = r4.m     // Catch: java.lang.Exception -> L64
                java.lang.String r2 = a.a.a.c.f.b(r2)     // Catch: java.lang.Exception -> L64
                java.lang.String r3 = "wcnf.dat"
                r5.<init>(r2, r3)     // Catch: java.lang.Exception -> L64
                boolean r2 = r5.exists()     // Catch: java.lang.Exception -> L64
                if (r2 != 0) goto L3d
                r5.createNewFile()     // Catch: java.lang.Exception -> L64
            L3d:
                java.io.BufferedWriter r2 = new java.io.BufferedWriter     // Catch: java.lang.Exception -> L64
                java.io.FileWriter r3 = new java.io.FileWriter     // Catch: java.lang.Exception -> L64
                r3.<init>(r5, r0)     // Catch: java.lang.Exception -> L64
                r2.<init>(r3)     // Catch: java.lang.Exception -> L64
                java.lang.String r5 = new java.lang.String     // Catch: java.lang.Exception -> L64
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L64
                byte[] r1 = r1.getBytes()     // Catch: java.lang.Exception -> L64
                byte[] r1 = android.util.Base64.encode(r1, r0)     // Catch: java.lang.Exception -> L64
                java.lang.String r3 = "UTF-8"
                r5.<init>(r1, r3)     // Catch: java.lang.Exception -> L64
                r2.write(r5)     // Catch: java.lang.Exception -> L64
                r2.flush()     // Catch: java.lang.Exception -> L64
                r2.close()     // Catch: java.lang.Exception -> L64
                goto L68
            L64:
                r5 = move-exception
                r5.printStackTrace()     // Catch: java.lang.Exception -> L68
            L68:
                r4.i = r0
                return
        }

        public void a(boolean r2, org.json.JSONArray r3, org.json.JSONArray r4) {
                r1 = this;
                boolean r0 = r1.i
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r1.i = r0
                if (r2 == 0) goto Ld
                r1.j = r0
                goto L10
            Ld:
                r2 = 0
                r1.j = r2
            L10:
                r1.k = r3
                r1.l = r4
                a.a.a.b.w r2 = a.a.a.b.w.d()
                java.util.concurrent.ExecutorService r2 = r2.b()
                if (r2 == 0) goto L26
                java.lang.String r3 = a.a.a.i.i.j()
                r1.a(r2, r3)
                goto L2d
            L26:
                java.lang.String r2 = a.a.a.i.i.j()
                r1.a(r2)
            L2d:
                return
        }
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public java.lang.String f122a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f123b;

        public c(a.a.a.c.f r1, java.lang.String r2, int r3) {
                r0 = this;
                r0.<init>()
                r1 = 0
                r0.f122a = r1
                r1 = 0
                r0.f123b = r1
                r0.f122a = r2
                r0.f123b = r3
                return
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            a.a.a.c.f.f = r0
            return
    }

    public f() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f118a = r0
            r2.f119b = r0
            r1 = 24
            r2.f120c = r1
            r2.d = r0
            r0 = 0
            r2.e = r0
            return
    }

    public static /* synthetic */ void a(a.a.a.c.f r0) {
            r0.c()
            return
    }

    public static /* synthetic */ java.lang.String b(a.a.a.c.f r0) {
            java.lang.String r0 = r0.f119b
            return r0
    }

    public static a.a.a.c.f d() {
            java.lang.Object r0 = a.a.a.c.f.f
            monitor-enter(r0)
            a.a.a.c.f r1 = a.a.a.c.f.g     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto Le
            a.a.a.c.f r1 = new a.a.a.c.f     // Catch: java.lang.Throwable -> L12
            r1.<init>()     // Catch: java.lang.Throwable -> L12
            a.a.a.c.f.g = r1     // Catch: java.lang.Throwable -> L12
        Le:
            a.a.a.c.f r1 = a.a.a.c.f.g     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return r1
        L12:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1
    }

    public final java.util.List<a.a.a.c.f.c> a(java.util.List<android.net.wifi.WifiConfiguration> r5) {
            r4 = this;
            if (r5 == 0) goto L3a
            int r0 = r5.size()
            if (r0 <= 0) goto L3a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L11:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r5.next()
            android.net.wifi.WifiConfiguration r1 = (android.net.wifi.WifiConfiguration) r1
            java.lang.String r2 = r1.SSID
            java.lang.String r3 = "numAssociation"
            java.lang.Object r1 = a.a.a.i.i.a(r1, r3)     // Catch: java.lang.Throwable -> L2c
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L2c
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L2c
            goto L2d
        L2c:
            r1 = 0
        L2d:
            if (r1 <= 0) goto L11
            if (r2 == 0) goto L11
            a.a.a.c.f$c r3 = new a.a.a.c.f$c
            r3.<init>(r4, r2, r1)
            r0.add(r3)
            goto L11
        L3a:
            r0 = 0
        L3b:
            return r0
    }

    public void a() {
            r4 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r4.e
            long r0 = r0 - r2
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L1c
            android.os.Handler r0 = r4.f118a
            if (r0 == 0) goto L1c
            r1 = 1
            r0.sendEmptyMessage(r1)
            long r0 = java.lang.System.currentTimeMillis()
            r4.e = r0
        L1c:
            return
    }

    public final void a(boolean r2, org.json.JSONArray r3, org.json.JSONArray r4) {
            r1 = this;
            a.a.a.c.f$b r0 = r1.d
            if (r0 != 0) goto Lb
            a.a.a.c.f$b r0 = new a.a.a.c.f$b
            r0.<init>(r1)
            r1.d = r0
        Lb:
            boolean r0 = a.a.a.i.i.l()
            if (r0 != 0) goto L16
            a.a.a.c.f$b r1 = r1.d
            r1.a(r2, r3, r4)
        L16:
            return
    }

    public void b() {
            r1 = this;
            android.os.Handler r0 = r1.f118a
            if (r0 != 0) goto Lb
            a.a.a.c.f$a r0 = new a.a.a.c.f$a
            r0.<init>(r1)
            r1.f118a = r0
        Lb:
            java.lang.String r0 = a.a.a.i.i.h()
            r1.f119b = r0
            return
    }

    public final void c() {
            r17 = this;
            r1 = r17
            java.lang.String r0 = "frq"
            java.lang.String r2 = "data"
            java.lang.String r3 = "tt"
            java.lang.String r4 = "cfg"
            java.lang.String r5 = "ison"
            java.lang.String r6 = r1.f119b
            if (r6 == 0) goto L1c7
            java.io.File r6 = new java.io.File     // Catch: java.lang.Exception -> L1c3
            java.lang.String r7 = r1.f119b     // Catch: java.lang.Exception -> L1c3
            java.lang.String r8 = "wcnf.dat"
            r6.<init>(r7, r8)     // Catch: java.lang.Exception -> L1c3
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L1c3
            boolean r9 = r6.exists()     // Catch: java.lang.Exception -> L1c3
            r10 = 0
            java.lang.String r14 = "num"
            r15 = 0
            java.lang.String r12 = "ssid"
            if (r9 == 0) goto Ld9
            java.io.BufferedReader r9 = new java.io.BufferedReader     // Catch: java.lang.Exception -> Ld2
            java.io.FileReader r13 = new java.io.FileReader     // Catch: java.lang.Exception -> Ld2
            r13.<init>(r6)     // Catch: java.lang.Exception -> Ld2
            r9.<init>(r13)     // Catch: java.lang.Exception -> Ld2
            java.lang.StringBuffer r6 = new java.lang.StringBuffer     // Catch: java.lang.Exception -> Ld2
            r6.<init>()     // Catch: java.lang.Exception -> Ld2
        L39:
            java.lang.String r13 = r9.readLine()     // Catch: java.lang.Exception -> Ld2
            if (r13 == 0) goto L43
            r6.append(r13)     // Catch: java.lang.Exception -> Ld2
            goto L39
        L43:
            r9.close()     // Catch: java.lang.Exception -> Ld2
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> Ld2
            if (r6 == 0) goto Lcf
            java.lang.String r9 = new java.lang.String     // Catch: java.lang.Exception -> Ld2
            byte[] r6 = r6.getBytes()     // Catch: java.lang.Exception -> Ld2
            byte[] r6 = android.util.Base64.decode(r6, r15)     // Catch: java.lang.Exception -> Ld2
            r9.<init>(r6)     // Catch: java.lang.Exception -> Ld2
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Exception -> Ld2
            r6.<init>(r9)     // Catch: java.lang.Exception -> Ld2
            boolean r9 = r6.has(r5)     // Catch: java.lang.Exception -> Ld2
            if (r9 == 0) goto L6c
            int r5 = r6.getInt(r5)     // Catch: java.lang.Exception -> Ld2
            if (r5 != 0) goto L6c
            r5 = r15
            goto L6d
        L6c:
            r5 = 1
        L6d:
            boolean r9 = r6.has(r4)     // Catch: java.lang.Exception -> Lcd
            if (r9 == 0) goto L83
            org.json.JSONObject r4 = r6.getJSONObject(r4)     // Catch: java.lang.Exception -> Lcd
            boolean r9 = r4.has(r0)     // Catch: java.lang.Exception -> Lcd
            if (r9 == 0) goto L83
            int r0 = r4.getInt(r0)     // Catch: java.lang.Exception -> Lcd
            r1.f120c = r0     // Catch: java.lang.Exception -> Lcd
        L83:
            boolean r0 = r6.has(r3)     // Catch: java.lang.Exception -> Lcd
            if (r0 == 0) goto L8d
            long r7 = r6.getLong(r3)     // Catch: java.lang.Exception -> Lcd
        L8d:
            boolean r0 = r6.has(r2)     // Catch: java.lang.Exception -> Lcd
            if (r0 == 0) goto Ld0
            org.json.JSONArray r0 = r6.getJSONArray(r2)     // Catch: java.lang.Exception -> Lcd
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Exception -> Lcd
            r2.<init>()     // Catch: java.lang.Exception -> Lcd
            int r3 = r0.length()     // Catch: java.lang.Exception -> Lcb
            r4 = r15
        La1:
            if (r4 >= r3) goto Ldc
            org.json.JSONObject r6 = r0.getJSONObject(r4)     // Catch: java.lang.Exception -> Lcb
            boolean r9 = r6.has(r12)     // Catch: java.lang.Exception -> Lcb
            if (r9 == 0) goto Lc7
            boolean r9 = r6.has(r14)     // Catch: java.lang.Exception -> Lcb
            if (r9 == 0) goto Lc7
            a.a.a.c.f$c r9 = new a.a.a.c.f$c     // Catch: java.lang.Exception -> Lcb
            java.lang.String r13 = r6.getString(r12)     // Catch: java.lang.Exception -> Lcb
            int r15 = r6.getInt(r14)     // Catch: java.lang.Exception -> Lcb
            r9.<init>(r1, r13, r15)     // Catch: java.lang.Exception -> Lcb
            java.lang.String r6 = r6.getString(r12)     // Catch: java.lang.Exception -> Lcb
            r2.put(r6, r9)     // Catch: java.lang.Exception -> Lcb
        Lc7:
            int r4 = r4 + 1
            r15 = 0
            goto La1
        Lcb:
            r0 = move-exception
            goto Ld5
        Lcd:
            r0 = move-exception
            goto Ld4
        Lcf:
            r5 = 1
        Ld0:
            r2 = 0
            goto Ldc
        Ld2:
            r0 = move-exception
            r5 = 1
        Ld4:
            r2 = 0
        Ld5:
            r0.printStackTrace()     // Catch: java.lang.Exception -> L1c3
            goto Ldc
        Ld9:
            r7 = r10
            r2 = 0
            r5 = 1
        Ldc:
            if (r5 != 0) goto Le4
            int r0 = r1.f120c     // Catch: java.lang.Exception -> L1c3
            int r0 = r0 * 4
            r1.f120c = r0     // Catch: java.lang.Exception -> L1c3
        Le4:
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L1c3
            long r3 = r3 - r7
            int r0 = r1.f120c     // Catch: java.lang.Exception -> L1c3
            int r0 = r0 * 60
            int r0 = r0 * 60
            int r0 = r0 * 1000
            long r5 = (long) r0     // Catch: java.lang.Exception -> L1c3
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L1c7
            a.a.a.g.f r0 = a.a.a.g.f.w()     // Catch: java.lang.Exception -> L1c3
            java.util.List r0 = r0.i()     // Catch: java.lang.Exception -> L1c3
            java.util.List r0 = r1.a(r0)     // Catch: java.lang.Exception -> L1c3
            int r3 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r3 != 0) goto L142
            if (r0 == 0) goto L1b8
            int r2 = r0.size()     // Catch: java.lang.Exception -> L1c3
            if (r2 <= 0) goto L1b8
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: java.lang.Exception -> L1c3
            r2.<init>()     // Catch: java.lang.Exception -> L1c3
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: java.lang.Exception -> L1c3
            r3.<init>()     // Catch: java.lang.Exception -> L1c3
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L1c3
        L11c:
            boolean r4 = r0.hasNext()     // Catch: java.lang.Exception -> L1c3
            if (r4 == 0) goto L13e
            java.lang.Object r4 = r0.next()     // Catch: java.lang.Exception -> L1c3
            a.a.a.c.f$c r4 = (a.a.a.c.f.c) r4     // Catch: java.lang.Exception -> L1c3
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Exception -> L1c3
            r5.<init>()     // Catch: java.lang.Exception -> L1c3
            java.lang.String r6 = r4.f122a     // Catch: java.lang.Exception -> L1c3
            r5.put(r12, r6)     // Catch: java.lang.Exception -> L1c3
            int r4 = r4.f123b     // Catch: java.lang.Exception -> L1c3
            r5.put(r14, r4)     // Catch: java.lang.Exception -> L1c3
            r2.put(r5)     // Catch: java.lang.Exception -> L1c3
            r3.put(r5)     // Catch: java.lang.Exception -> L1c3
            goto L11c
        L13e:
            r12 = r2
            r13 = 1
            goto L1bb
        L142:
            if (r0 == 0) goto L1b8
            int r3 = r0.size()     // Catch: java.lang.Exception -> L1c3
            if (r3 <= 0) goto L1b8
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: java.lang.Exception -> L1c3
            r3.<init>()     // Catch: java.lang.Exception -> L1c3
            if (r2 == 0) goto L1b9
            int r4 = r2.size()     // Catch: java.lang.Exception -> L1c3
            if (r4 <= 0) goto L1b9
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L1c3
            r16 = 0
        L15d:
            boolean r4 = r0.hasNext()     // Catch: java.lang.Exception -> L1c3
            if (r4 == 0) goto L1b5
            java.lang.Object r4 = r0.next()     // Catch: java.lang.Exception -> L1c3
            a.a.a.c.f$c r4 = (a.a.a.c.f.c) r4     // Catch: java.lang.Exception -> L1c3
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Exception -> L1c3
            r5.<init>()     // Catch: java.lang.Exception -> L1c3
            java.lang.String r6 = r4.f122a     // Catch: java.lang.Exception -> L1c3
            r5.put(r12, r6)     // Catch: java.lang.Exception -> L1c3
            int r6 = r4.f123b     // Catch: java.lang.Exception -> L1c3
            r5.put(r14, r6)     // Catch: java.lang.Exception -> L1c3
            r3.put(r5)     // Catch: java.lang.Exception -> L1c3
            java.lang.String r5 = r4.f122a     // Catch: java.lang.Exception -> L1c3
            boolean r5 = r2.containsKey(r5)     // Catch: java.lang.Exception -> L1c3
            if (r5 == 0) goto L194
            int r5 = r4.f123b     // Catch: java.lang.Exception -> L1c3
            java.lang.String r6 = r4.f122a     // Catch: java.lang.Exception -> L1c3
            java.lang.Object r6 = r2.get(r6)     // Catch: java.lang.Exception -> L1c3
            a.a.a.c.f$c r6 = (a.a.a.c.f.c) r6     // Catch: java.lang.Exception -> L1c3
            int r6 = r6.f123b     // Catch: java.lang.Exception -> L1c3
            if (r5 == r6) goto L192
            goto L194
        L192:
            r5 = 0
            goto L195
        L194:
            r5 = 1
        L195:
            if (r5 == 0) goto L15d
            if (r16 != 0) goto L19e
            org.json.JSONArray r16 = new org.json.JSONArray     // Catch: java.lang.Exception -> L1c3
            r16.<init>()     // Catch: java.lang.Exception -> L1c3
        L19e:
            r5 = r16
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Exception -> L1c3
            r6.<init>()     // Catch: java.lang.Exception -> L1c3
            java.lang.String r7 = r4.f122a     // Catch: java.lang.Exception -> L1c3
            r6.put(r12, r7)     // Catch: java.lang.Exception -> L1c3
            int r4 = r4.f123b     // Catch: java.lang.Exception -> L1c3
            r6.put(r14, r4)     // Catch: java.lang.Exception -> L1c3
            r5.put(r6)     // Catch: java.lang.Exception -> L1c3
            r16 = r5
            goto L15d
        L1b5:
            r12 = r16
            goto L1ba
        L1b8:
            r3 = 0
        L1b9:
            r12 = 0
        L1ba:
            r13 = 0
        L1bb:
            if (r12 == 0) goto L1c7
            if (r3 == 0) goto L1c7
            r1.a(r13, r12, r3)     // Catch: java.lang.Exception -> L1c3
            goto L1c7
        L1c3:
            r0 = move-exception
            r0.printStackTrace()
        L1c7:
            return
    }
}
