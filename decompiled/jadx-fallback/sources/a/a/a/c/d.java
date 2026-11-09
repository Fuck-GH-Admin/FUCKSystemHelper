package a.a.a.c;

/* JADX INFO: loaded from: classes.dex */
public class d {
    public static a.a.a.c.d d;
    public static final java.lang.String e = null;
    public static int f;
    public static int g;
    public static int h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.a.a.c.d.b f112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f114c;

    public class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.a.a.c.d f115b;

        public a(a.a.a.c.d r1) {
                r0 = this;
                r0.f115b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r0 = this;
                a.a.a.c.d r0 = r0.f115b
                a.a.a.c.d.a(r0)
                return
        }
    }

    public class b extends a.a.a.i.g {
        public java.lang.String i;
        public boolean j;
        public boolean k;
        public final /* synthetic */ a.a.a.c.d l;

        public b(a.a.a.c.d r1) {
                r0 = this;
                r0.l = r1
                r0.<init>()
                r1 = 0
                r0.i = r1
                r1 = 0
                r0.j = r1
                r0.k = r1
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                r0.d = r1
                return
        }

        @Override // a.a.a.i.g
        public void a() {
                r4 = this;
                r0 = 2
                r4.f338b = r0
                java.lang.String r0 = r4.i
                java.lang.String r0 = com.baidu.location.Jni.b(r0)
                r1 = 0
                r4.i = r1
                boolean r1 = r4.j
                java.lang.String r2 = "qt"
                if (r1 == 0) goto L17
                java.util.Map<java.lang.String, java.lang.Object> r1 = r4.d
                java.lang.String r3 = "grid"
                goto L1b
            L17:
                java.util.Map<java.lang.String, java.lang.Object> r1 = r4.d
                java.lang.String r3 = "conf"
            L1b:
                r1.put(r2, r3)
                java.util.Map<java.lang.String, java.lang.Object> r4 = r4.d
                java.lang.String r1 = "req"
                r4.put(r1, r0)
                return
        }

        public void a(java.lang.String r2, boolean r3) {
                r1 = this;
                boolean r0 = r1.k
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r1.k = r0
                r1.i = r2
                r1.j = r3
                a.a.a.b.w r2 = a.a.a.b.w.d()
                java.util.concurrent.ExecutorService r2 = r2.b()
                if (r3 == 0) goto L1c
                java.lang.String r3 = "loc.map.baidu.com"
                r1.a(r2, r0, r3)
                goto L29
            L1c:
                if (r2 == 0) goto L24
                java.lang.String r3 = a.a.a.i.d.f325c
                r1.a(r2, r3)
                goto L29
            L24:
                java.lang.String r2 = a.a.a.i.d.f325c
                r1.a(r2)
            L29:
                return
        }

        @Override // a.a.a.i.g
        public void a(boolean r2) {
                r1 = this;
                if (r2 == 0) goto L18
                java.lang.String r2 = r1.f339c
                if (r2 == 0) goto L18
                boolean r0 = r1.j
                if (r0 == 0) goto L12
                a.a.a.c.d r2 = r1.l
                byte[] r0 = r1.e
                a.a.a.c.d.a(r2, r0)
                goto L1e
            L12:
                a.a.a.c.d r0 = r1.l
                a.a.a.c.d.a(r0, r2)
                goto L1e
            L18:
                a.a.a.c.d r2 = r1.l
                r0 = 0
                a.a.a.c.d.a(r2, r0)
            L1e:
                java.util.Map<java.lang.String, java.lang.Object> r2 = r1.d
                if (r2 == 0) goto L25
                r2.clear()
            L25:
                r2 = 0
                r1.k = r2
                return
        }
    }

    static {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = a.a.a.i.h.f353a
            r0.append(r1)
            java.lang.String r1 = "/conlts.dat"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            a.a.a.c.d.e = r0
            r0 = -1
            a.a.a.c.d.f = r0
            a.a.a.c.d.g = r0
            r0 = 0
            a.a.a.c.d.h = r0
            return
    }

    public d() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f112a = r0
            r0 = 604800(0x93a80, double:2.98811E-318)
            r2.f113b = r0
            r0 = 1
            r2.f114c = r0
            return
    }

    public static /* synthetic */ void a(a.a.a.c.d r0) {
            r0.a()
            return
    }

    public static /* synthetic */ void a(a.a.a.c.d r0, java.lang.String r1) {
            r0.b(r1)
            return
    }

    public static /* synthetic */ void a(a.a.a.c.d r0, byte[] r1) {
            r0.a(r1)
            return
    }

    public static a.a.a.c.d j() {
            a.a.a.c.d r0 = a.a.a.c.d.d
            if (r0 != 0) goto Lb
            a.a.a.c.d r0 = new a.a.a.c.d
            r0.<init>()
            a.a.a.c.d.d = r0
        Lb:
            a.a.a.c.d r0 = a.a.a.c.d.d
            return r0
    }

    public final void a() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "&ver="
            r0.append(r1)
            int r1 = a.a.a.i.i.v
            r0.append(r1)
            java.lang.String r1 = "&usr="
            r0.append(r1)
            a.a.a.i.b r1 = a.a.a.i.b.e()
            java.lang.String r1 = r1.d()
            r0.append(r1)
            java.lang.String r1 = "&app="
            r0.append(r1)
            java.lang.String r1 = a.a.a.i.b.f
            r0.append(r1)
            java.lang.String r1 = "&prod="
            r0.append(r1)
            java.lang.String r1 = a.a.a.i.b.g
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            a.a.a.c.d$b r1 = r2.f112a
            if (r1 != 0) goto L42
            a.a.a.c.d$b r1 = new a.a.a.c.d$b
            r1.<init>(r2)
            r2.f112a = r1
        L42:
            boolean r1 = a.a.a.i.i.l()
            if (r1 != 0) goto L4e
            a.a.a.c.d$b r2 = r2.f112a
            r1 = 0
            r2.a(r0, r1)
        L4e:
            return
    }

    public final void a(int r2) {
            r1 = this;
            r0 = 1
            r2 = r2 & r0
            if (r2 != r0) goto L5
            goto L6
        L5:
            r0 = 0
        L6:
            r1.f114c = r0
            return
    }

    public final void a(org.json.JSONObject r8) {
            r7 = this;
            java.lang.String r7 = "ipvn"
            java.lang.String r0 = "ipvt"
            java.lang.String r1 = "ipen"
            if (r8 != 0) goto L9
            return
        L9:
            r2 = 1
            r3 = 14400000(0xdbba00, float:2.0178698E-38)
            r4 = 10
            boolean r5 = r8.has(r1)     // Catch: java.lang.Exception -> L51
            r6 = 0
            if (r5 == 0) goto L1d
            int r1 = r8.getInt(r1)     // Catch: java.lang.Exception -> L51
            if (r1 != 0) goto L1d
            r2 = r6
        L1d:
            boolean r1 = r8.has(r0)     // Catch: java.lang.Exception -> L51
            if (r1 == 0) goto L27
            int r3 = r8.getInt(r0)     // Catch: java.lang.Exception -> L51
        L27:
            boolean r0 = r8.has(r7)     // Catch: java.lang.Exception -> L51
            if (r0 == 0) goto L31
            int r4 = r8.getInt(r7)     // Catch: java.lang.Exception -> L51
        L31:
            android.content.Context r7 = com.baidu.location.f.c()     // Catch: java.lang.Exception -> L51
            java.lang.String r8 = "MapCoreServicePre"
            android.content.SharedPreferences r7 = r7.getSharedPreferences(r8, r6)     // Catch: java.lang.Exception -> L51
            android.content.SharedPreferences$Editor r7 = r7.edit()     // Catch: java.lang.Exception -> L51
            java.lang.String r8 = "ipLocInfoUpload"
            r7.putBoolean(r8, r2)     // Catch: java.lang.Exception -> L51
            java.lang.String r8 = "ipValidTime"
            r7.putInt(r8, r3)     // Catch: java.lang.Exception -> L51
            java.lang.String r8 = "ipLocInfoUploadTimesPerDay"
            r7.putInt(r8, r4)     // Catch: java.lang.Exception -> L51
            r7.commit()     // Catch: java.lang.Exception -> L51
        L51:
            return
    }

    public final void a(byte[] r17) {
            r16 = this;
            r0 = r17
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L8
            goto Lc2
        L8:
            int r3 = r0.length     // Catch: java.lang.Exception -> Lc7
            r4 = 640(0x280, float:8.97E-43)
            if (r3 >= r4) goto L20
            a.a.a.i.i.u = r1     // Catch: java.lang.Exception -> Lc7
            double r0 = a.a.a.i.i.p     // Catch: java.lang.Exception -> Lc7
            r3 = 4582862980812216730(0x3f9999999999999a, double:0.025)
            double r0 = r0 + r3
            a.a.a.i.i.r = r0     // Catch: java.lang.Exception -> Lc7
            double r0 = a.a.a.i.i.o     // Catch: java.lang.Exception -> Lc7
            double r0 = r0 - r3
            a.a.a.i.i.q = r0     // Catch: java.lang.Exception -> Lc7
            goto Lc1
        L20:
            a.a.a.i.i.u = r2     // Catch: java.lang.Exception -> Lc7
            r3 = 7
            r3 = r0[r3]     // Catch: java.lang.Exception -> Lc7
            long r3 = (long) r3     // Catch: java.lang.Exception -> Lc7
            r5 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r5
            r7 = 56
            long r3 = r3 << r7
            r8 = 6
            r8 = r0[r8]     // Catch: java.lang.Exception -> Lc7
            long r8 = (long) r8     // Catch: java.lang.Exception -> Lc7
            long r8 = r8 & r5
            r10 = 48
            long r8 = r8 << r10
            long r3 = r3 | r8
            r8 = 5
            r8 = r0[r8]     // Catch: java.lang.Exception -> Lc7
            long r8 = (long) r8     // Catch: java.lang.Exception -> Lc7
            long r8 = r8 & r5
            r11 = 40
            long r8 = r8 << r11
            long r3 = r3 | r8
            r8 = 4
            r8 = r0[r8]     // Catch: java.lang.Exception -> Lc7
            long r8 = (long) r8     // Catch: java.lang.Exception -> Lc7
            long r8 = r8 & r5
            r12 = 32
            long r8 = r8 << r12
            long r3 = r3 | r8
            r8 = 3
            r8 = r0[r8]     // Catch: java.lang.Exception -> Lc7
            long r8 = (long) r8     // Catch: java.lang.Exception -> Lc7
            long r8 = r8 & r5
            r13 = 24
            long r8 = r8 << r13
            long r3 = r3 | r8
            r8 = 2
            r8 = r0[r8]     // Catch: java.lang.Exception -> Lc7
            long r8 = (long) r8     // Catch: java.lang.Exception -> Lc7
            long r8 = r8 & r5
            r14 = 16
            long r8 = r8 << r14
            long r3 = r3 | r8
            r8 = r0[r2]     // Catch: java.lang.Exception -> Lc7
            long r8 = (long) r8     // Catch: java.lang.Exception -> Lc7
            long r8 = r8 & r5
            r15 = 8
            long r8 = r8 << r15
            long r3 = r3 | r8
            r8 = r0[r1]     // Catch: java.lang.Exception -> Lc7
            long r8 = (long) r8     // Catch: java.lang.Exception -> Lc7
            long r8 = r8 & r5
            long r3 = r3 | r8
            double r3 = java.lang.Double.longBitsToDouble(r3)     // Catch: java.lang.Exception -> Lc7
            a.a.a.i.i.q = r3     // Catch: java.lang.Exception -> Lc7
            r3 = 15
            r3 = r0[r3]     // Catch: java.lang.Exception -> Lc7
            long r3 = (long) r3     // Catch: java.lang.Exception -> Lc7
            long r3 = r3 & r5
            long r3 = r3 << r7
            r7 = 14
            r7 = r0[r7]     // Catch: java.lang.Exception -> Lc7
            long r7 = (long) r7     // Catch: java.lang.Exception -> Lc7
            long r7 = r7 & r5
            long r7 = r7 << r10
            long r3 = r3 | r7
            r7 = 13
            r7 = r0[r7]     // Catch: java.lang.Exception -> Lc7
            long r7 = (long) r7     // Catch: java.lang.Exception -> Lc7
            long r7 = r7 & r5
            long r7 = r7 << r11
            long r3 = r3 | r7
            r7 = 12
            r7 = r0[r7]     // Catch: java.lang.Exception -> Lc7
            long r7 = (long) r7     // Catch: java.lang.Exception -> Lc7
            long r7 = r7 & r5
            long r7 = r7 << r12
            long r3 = r3 | r7
            r7 = 11
            r7 = r0[r7]     // Catch: java.lang.Exception -> Lc7
            long r7 = (long) r7     // Catch: java.lang.Exception -> Lc7
            long r7 = r7 & r5
            long r7 = r7 << r13
            long r3 = r3 | r7
            r7 = 10
            r7 = r0[r7]     // Catch: java.lang.Exception -> Lc7
            long r7 = (long) r7     // Catch: java.lang.Exception -> Lc7
            long r7 = r7 & r5
            long r7 = r7 << r14
            long r3 = r3 | r7
            r7 = 9
            r7 = r0[r7]     // Catch: java.lang.Exception -> Lc7
            long r7 = (long) r7     // Catch: java.lang.Exception -> Lc7
            long r7 = r7 & r5
            long r7 = r7 << r15
            long r3 = r3 | r7
            r7 = r0[r15]     // Catch: java.lang.Exception -> Lc7
            long r7 = (long) r7     // Catch: java.lang.Exception -> Lc7
            long r5 = r5 & r7
            long r3 = r3 | r5
            double r3 = java.lang.Double.longBitsToDouble(r3)     // Catch: java.lang.Exception -> Lc7
            a.a.a.i.i.r = r3     // Catch: java.lang.Exception -> Lc7
            r3 = 625(0x271, float:8.76E-43)
            byte[] r4 = new byte[r3]     // Catch: java.lang.Exception -> Lc7
            a.a.a.i.i.t = r4     // Catch: java.lang.Exception -> Lc7
        Lb4:
            if (r1 >= r3) goto Lc1
            byte[] r4 = a.a.a.i.i.t     // Catch: java.lang.Exception -> Lc7
            int r5 = r1 + 16
            r5 = r0[r5]     // Catch: java.lang.Exception -> Lc7
            r4[r1] = r5     // Catch: java.lang.Exception -> Lc7
            int r1 = r1 + 1
            goto Lb4
        Lc1:
            r1 = r2
        Lc2:
            if (r1 == 0) goto Lc7
            r16.g()     // Catch: java.lang.Exception -> Lc7
        Lc7:
            return
    }

    public final boolean a(java.lang.String r18) {
            r17 = this;
            r0 = r18
            java.lang.String r1 = "shak"
            java.lang.String r2 = "gpc"
            java.lang.String r3 = "zxd"
            java.lang.String r4 = "ab"
            java.lang.String r5 = "wf"
            java.lang.String r6 = "up"
            java.lang.String r7 = "gps"
            java.lang.String r8 = "is_check_Per"
            java.lang.String r9 = "ipconf"
            r10 = 1
            r11 = 0
            if (r0 == 0) goto L3ee
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch: java.lang.Exception -> L3ee
            r12.<init>(r0)     // Catch: java.lang.Exception -> L3ee
            boolean r0 = r12.has(r9)     // Catch: java.lang.Exception -> L3ee
            if (r0 == 0) goto L2c
            org.json.JSONObject r0 = r12.getJSONObject(r9)     // Catch: java.lang.Exception -> L2c
            r9 = r17
            r9.a(r0)     // Catch: java.lang.Exception -> L2c
        L2c:
            boolean r0 = r12.has(r8)     // Catch: java.lang.Exception -> L3ee
            if (r0 == 0) goto L3a
            int r0 = r12.getInt(r8)     // Catch: java.lang.Exception -> L3a
            if (r0 <= 0) goto L3a
            a.a.a.i.i.p0 = r10     // Catch: java.lang.Exception -> L3a
        L3a:
            java.lang.String r0 = "ver"
            java.lang.String r0 = r12.getString(r0)     // Catch: java.lang.Exception -> L3ee
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L3ee
            int r8 = a.a.a.i.i.v     // Catch: java.lang.Exception -> L3ee
            if (r0 <= r8) goto L3ee
            a.a.a.i.i.v = r0     // Catch: java.lang.Exception -> L3ee
            boolean r0 = r12.has(r7)     // Catch: java.lang.Exception -> L3ee
            java.lang.String r9 = "\\|"
            r14 = 3
            r15 = 2
            java.lang.String r8 = ""
            if (r0 == 0) goto L147
            java.lang.String r0 = r12.getString(r7)     // Catch: java.lang.Exception -> L3ee
            java.lang.String[] r0 = r0.split(r9)     // Catch: java.lang.Exception -> L3ee
            int r7 = r0.length     // Catch: java.lang.Exception -> L3ee
            r13 = 10
            if (r7 <= r13) goto L147
            r7 = r0[r11]     // Catch: java.lang.Exception -> L3ee
            if (r7 == 0) goto L77
            r7 = r0[r11]     // Catch: java.lang.Exception -> L3ee
            boolean r7 = r7.equals(r8)     // Catch: java.lang.Exception -> L3ee
            if (r7 != 0) goto L77
            r7 = r0[r11]     // Catch: java.lang.Exception -> L3ee
            float r7 = java.lang.Float.parseFloat(r7)     // Catch: java.lang.Exception -> L3ee
            a.a.a.i.i.w = r7     // Catch: java.lang.Exception -> L3ee
        L77:
            r7 = r0[r10]     // Catch: java.lang.Exception -> L3ee
            if (r7 == 0) goto L8b
            r7 = r0[r10]     // Catch: java.lang.Exception -> L3ee
            boolean r7 = r7.equals(r8)     // Catch: java.lang.Exception -> L3ee
            if (r7 != 0) goto L8b
            r7 = r0[r10]     // Catch: java.lang.Exception -> L3ee
            float r7 = java.lang.Float.parseFloat(r7)     // Catch: java.lang.Exception -> L3ee
            a.a.a.i.i.x = r7     // Catch: java.lang.Exception -> L3ee
        L8b:
            r7 = r0[r15]     // Catch: java.lang.Exception -> L3ee
            if (r7 == 0) goto L9f
            r7 = r0[r15]     // Catch: java.lang.Exception -> L3ee
            boolean r7 = r7.equals(r8)     // Catch: java.lang.Exception -> L3ee
            if (r7 != 0) goto L9f
            r7 = r0[r15]     // Catch: java.lang.Exception -> L3ee
            float r7 = java.lang.Float.parseFloat(r7)     // Catch: java.lang.Exception -> L3ee
            a.a.a.i.i.y = r7     // Catch: java.lang.Exception -> L3ee
        L9f:
            r7 = r0[r14]     // Catch: java.lang.Exception -> L3ee
            if (r7 == 0) goto Lb3
            r7 = r0[r14]     // Catch: java.lang.Exception -> L3ee
            boolean r7 = r7.equals(r8)     // Catch: java.lang.Exception -> L3ee
            if (r7 != 0) goto Lb3
            r7 = r0[r14]     // Catch: java.lang.Exception -> L3ee
            float r7 = java.lang.Float.parseFloat(r7)     // Catch: java.lang.Exception -> L3ee
            a.a.a.i.i.z = r7     // Catch: java.lang.Exception -> L3ee
        Lb3:
            r7 = 4
            r16 = r0[r7]     // Catch: java.lang.Exception -> L3ee
            if (r16 == 0) goto Lc8
            r15 = r0[r7]     // Catch: java.lang.Exception -> L3ee
            boolean r15 = r15.equals(r8)     // Catch: java.lang.Exception -> L3ee
            if (r15 != 0) goto Lc8
            r15 = r0[r7]     // Catch: java.lang.Exception -> L3ee
            int r7 = java.lang.Integer.parseInt(r15)     // Catch: java.lang.Exception -> L3ee
            a.a.a.i.i.A = r7     // Catch: java.lang.Exception -> L3ee
        Lc8:
            r7 = 5
            r15 = r0[r7]     // Catch: java.lang.Exception -> L3ee
            if (r15 == 0) goto Ldd
            r15 = r0[r7]     // Catch: java.lang.Exception -> L3ee
            boolean r15 = r15.equals(r8)     // Catch: java.lang.Exception -> L3ee
            if (r15 != 0) goto Ldd
            r15 = r0[r7]     // Catch: java.lang.Exception -> L3ee
            int r7 = java.lang.Integer.parseInt(r15)     // Catch: java.lang.Exception -> L3ee
            a.a.a.i.i.B = r7     // Catch: java.lang.Exception -> L3ee
        Ldd:
            r7 = 6
            r15 = r0[r7]     // Catch: java.lang.Exception -> L3ee
            if (r15 == 0) goto Lf2
            r15 = r0[r7]     // Catch: java.lang.Exception -> L3ee
            boolean r15 = r15.equals(r8)     // Catch: java.lang.Exception -> L3ee
            if (r15 != 0) goto Lf2
            r7 = r0[r7]     // Catch: java.lang.Exception -> L3ee
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.Exception -> L3ee
            a.a.a.i.i.C = r7     // Catch: java.lang.Exception -> L3ee
        Lf2:
            r7 = 7
            r15 = r0[r7]     // Catch: java.lang.Exception -> L3ee
            if (r15 == 0) goto L107
            r15 = r0[r7]     // Catch: java.lang.Exception -> L3ee
            boolean r15 = r15.equals(r8)     // Catch: java.lang.Exception -> L3ee
            if (r15 != 0) goto L107
            r7 = r0[r7]     // Catch: java.lang.Exception -> L3ee
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.Exception -> L3ee
            a.a.a.i.i.D = r7     // Catch: java.lang.Exception -> L3ee
        L107:
            r7 = 8
            r15 = r0[r7]     // Catch: java.lang.Exception -> L3ee
            if (r15 == 0) goto L11d
            r15 = r0[r7]     // Catch: java.lang.Exception -> L3ee
            boolean r15 = r15.equals(r8)     // Catch: java.lang.Exception -> L3ee
            if (r15 != 0) goto L11d
            r7 = r0[r7]     // Catch: java.lang.Exception -> L3ee
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.Exception -> L3ee
            a.a.a.i.i.E = r7     // Catch: java.lang.Exception -> L3ee
        L11d:
            r7 = 9
            r15 = r0[r7]     // Catch: java.lang.Exception -> L3ee
            if (r15 == 0) goto L133
            r15 = r0[r7]     // Catch: java.lang.Exception -> L3ee
            boolean r15 = r15.equals(r8)     // Catch: java.lang.Exception -> L3ee
            if (r15 != 0) goto L133
            r7 = r0[r7]     // Catch: java.lang.Exception -> L3ee
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.Exception -> L3ee
            a.a.a.i.i.F = r7     // Catch: java.lang.Exception -> L3ee
        L133:
            r7 = r0[r13]     // Catch: java.lang.Exception -> L3ee
            if (r7 == 0) goto L147
            r7 = r0[r13]     // Catch: java.lang.Exception -> L3ee
            boolean r7 = r7.equals(r8)     // Catch: java.lang.Exception -> L3ee
            if (r7 != 0) goto L147
            r0 = r0[r13]     // Catch: java.lang.Exception -> L3ee
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L3ee
            a.a.a.i.i.G = r0     // Catch: java.lang.Exception -> L3ee
        L147:
            boolean r0 = r12.has(r6)     // Catch: java.lang.Exception -> L3ee
            if (r0 == 0) goto L1a9
            java.lang.String r0 = r12.getString(r6)     // Catch: java.lang.Exception -> L3ee
            java.lang.String[] r0 = r0.split(r9)     // Catch: java.lang.Exception -> L3ee
            int r6 = r0.length     // Catch: java.lang.Exception -> L3ee
            if (r6 <= r14) goto L1a9
            r6 = r0[r11]     // Catch: java.lang.Exception -> L3ee
            if (r6 == 0) goto L16c
            r6 = r0[r11]     // Catch: java.lang.Exception -> L3ee
            boolean r6 = r6.equals(r8)     // Catch: java.lang.Exception -> L3ee
            if (r6 != 0) goto L16c
            r6 = r0[r11]     // Catch: java.lang.Exception -> L3ee
            float r6 = java.lang.Float.parseFloat(r6)     // Catch: java.lang.Exception -> L3ee
            a.a.a.i.i.H = r6     // Catch: java.lang.Exception -> L3ee
        L16c:
            r6 = r0[r10]     // Catch: java.lang.Exception -> L3ee
            if (r6 == 0) goto L180
            r6 = r0[r10]     // Catch: java.lang.Exception -> L3ee
            boolean r6 = r6.equals(r8)     // Catch: java.lang.Exception -> L3ee
            if (r6 != 0) goto L180
            r6 = r0[r10]     // Catch: java.lang.Exception -> L3ee
            float r6 = java.lang.Float.parseFloat(r6)     // Catch: java.lang.Exception -> L3ee
            a.a.a.i.i.I = r6     // Catch: java.lang.Exception -> L3ee
        L180:
            r6 = 2
            r7 = r0[r6]     // Catch: java.lang.Exception -> L3ee
            if (r7 == 0) goto L195
            r7 = r0[r6]     // Catch: java.lang.Exception -> L3ee
            boolean r7 = r7.equals(r8)     // Catch: java.lang.Exception -> L3ee
            if (r7 != 0) goto L195
            r7 = r0[r6]     // Catch: java.lang.Exception -> L3ee
            float r6 = java.lang.Float.parseFloat(r7)     // Catch: java.lang.Exception -> L3ee
            a.a.a.i.i.J = r6     // Catch: java.lang.Exception -> L3ee
        L195:
            r6 = r0[r14]     // Catch: java.lang.Exception -> L3ee
            if (r6 == 0) goto L1a9
            r6 = r0[r14]     // Catch: java.lang.Exception -> L3ee
            boolean r6 = r6.equals(r8)     // Catch: java.lang.Exception -> L3ee
            if (r6 != 0) goto L1a9
            r0 = r0[r14]     // Catch: java.lang.Exception -> L3ee
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.Exception -> L3ee
            a.a.a.i.i.K = r0     // Catch: java.lang.Exception -> L3ee
        L1a9:
            boolean r0 = r12.has(r5)     // Catch: java.lang.Exception -> L3ee
            if (r0 == 0) goto L20b
            java.lang.String r0 = r12.getString(r5)     // Catch: java.lang.Exception -> L3ee
            java.lang.String[] r0 = r0.split(r9)     // Catch: java.lang.Exception -> L3ee
            int r5 = r0.length     // Catch: java.lang.Exception -> L3ee
            if (r5 <= r14) goto L20b
            r5 = r0[r11]     // Catch: java.lang.Exception -> L3ee
            if (r5 == 0) goto L1ce
            r5 = r0[r11]     // Catch: java.lang.Exception -> L3ee
            boolean r5 = r5.equals(r8)     // Catch: java.lang.Exception -> L3ee
            if (r5 != 0) goto L1ce
            r5 = r0[r11]     // Catch: java.lang.Exception -> L3ee
            int r5 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.Exception -> L3ee
            a.a.a.i.i.L = r5     // Catch: java.lang.Exception -> L3ee
        L1ce:
            r5 = r0[r10]     // Catch: java.lang.Exception -> L3ee
            if (r5 == 0) goto L1e2
            r5 = r0[r10]     // Catch: java.lang.Exception -> L3ee
            boolean r5 = r5.equals(r8)     // Catch: java.lang.Exception -> L3ee
            if (r5 != 0) goto L1e2
            r5 = r0[r10]     // Catch: java.lang.Exception -> L3ee
            float r5 = java.lang.Float.parseFloat(r5)     // Catch: java.lang.Exception -> L3ee
            a.a.a.i.i.M = r5     // Catch: java.lang.Exception -> L3ee
        L1e2:
            r5 = 2
            r6 = r0[r5]     // Catch: java.lang.Exception -> L3ee
            if (r6 == 0) goto L1f7
            r6 = r0[r5]     // Catch: java.lang.Exception -> L3ee
            boolean r6 = r6.equals(r8)     // Catch: java.lang.Exception -> L3ee
            if (r6 != 0) goto L1f7
            r6 = r0[r5]     // Catch: java.lang.Exception -> L3ee
            int r5 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.Exception -> L3ee
            a.a.a.i.i.N = r5     // Catch: java.lang.Exception -> L3ee
        L1f7:
            r5 = r0[r14]     // Catch: java.lang.Exception -> L3ee
            if (r5 == 0) goto L20b
            r5 = r0[r14]     // Catch: java.lang.Exception -> L3ee
            boolean r5 = r5.equals(r8)     // Catch: java.lang.Exception -> L3ee
            if (r5 != 0) goto L20b
            r0 = r0[r14]     // Catch: java.lang.Exception -> L3ee
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.Exception -> L3ee
            a.a.a.i.i.O = r0     // Catch: java.lang.Exception -> L3ee
        L20b:
            boolean r0 = r12.has(r4)     // Catch: java.lang.Exception -> L3ee
            if (r0 == 0) goto L26d
            java.lang.String r0 = r12.getString(r4)     // Catch: java.lang.Exception -> L3ee
            java.lang.String[] r0 = r0.split(r9)     // Catch: java.lang.Exception -> L3ee
            int r4 = r0.length     // Catch: java.lang.Exception -> L3ee
            if (r4 <= r14) goto L26d
            r4 = r0[r11]     // Catch: java.lang.Exception -> L3ee
            if (r4 == 0) goto L230
            r4 = r0[r11]     // Catch: java.lang.Exception -> L3ee
            boolean r4 = r4.equals(r8)     // Catch: java.lang.Exception -> L3ee
            if (r4 != 0) goto L230
            r4 = r0[r11]     // Catch: java.lang.Exception -> L3ee
            float r4 = java.lang.Float.parseFloat(r4)     // Catch: java.lang.Exception -> L3ee
            a.a.a.i.i.P = r4     // Catch: java.lang.Exception -> L3ee
        L230:
            r4 = r0[r10]     // Catch: java.lang.Exception -> L3ee
            if (r4 == 0) goto L244
            r4 = r0[r10]     // Catch: java.lang.Exception -> L3ee
            boolean r4 = r4.equals(r8)     // Catch: java.lang.Exception -> L3ee
            if (r4 != 0) goto L244
            r4 = r0[r10]     // Catch: java.lang.Exception -> L3ee
            float r4 = java.lang.Float.parseFloat(r4)     // Catch: java.lang.Exception -> L3ee
            a.a.a.i.i.Q = r4     // Catch: java.lang.Exception -> L3ee
        L244:
            r4 = 2
            r5 = r0[r4]     // Catch: java.lang.Exception -> L3ee
            if (r5 == 0) goto L259
            r5 = r0[r4]     // Catch: java.lang.Exception -> L3ee
            boolean r5 = r5.equals(r8)     // Catch: java.lang.Exception -> L3ee
            if (r5 != 0) goto L259
            r5 = r0[r4]     // Catch: java.lang.Exception -> L3ee
            int r4 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.Exception -> L3ee
            a.a.a.i.i.R = r4     // Catch: java.lang.Exception -> L3ee
        L259:
            r4 = r0[r14]     // Catch: java.lang.Exception -> L3ee
            if (r4 == 0) goto L26d
            r4 = r0[r14]     // Catch: java.lang.Exception -> L3ee
            boolean r4 = r4.equals(r8)     // Catch: java.lang.Exception -> L3ee
            if (r4 != 0) goto L26d
            r0 = r0[r14]     // Catch: java.lang.Exception -> L3ee
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L3ee
            a.a.a.i.i.S = r0     // Catch: java.lang.Exception -> L3ee
        L26d:
            boolean r0 = r12.has(r3)     // Catch: java.lang.Exception -> L3ee
            if (r0 == 0) goto L2e5
            java.lang.String r0 = r12.getString(r3)     // Catch: java.lang.Exception -> L3ee
            java.lang.String[] r0 = r0.split(r9)     // Catch: java.lang.Exception -> L3ee
            int r3 = r0.length     // Catch: java.lang.Exception -> L3ee
            r4 = 4
            if (r3 <= r4) goto L2e5
            r3 = r0[r11]     // Catch: java.lang.Exception -> L3ee
            if (r3 == 0) goto L293
            r3 = r0[r11]     // Catch: java.lang.Exception -> L3ee
            boolean r3 = r3.equals(r8)     // Catch: java.lang.Exception -> L3ee
            if (r3 != 0) goto L293
            r3 = r0[r11]     // Catch: java.lang.Exception -> L3ee
            float r3 = java.lang.Float.parseFloat(r3)     // Catch: java.lang.Exception -> L3ee
            a.a.a.i.i.j0 = r3     // Catch: java.lang.Exception -> L3ee
        L293:
            r3 = r0[r10]     // Catch: java.lang.Exception -> L3ee
            if (r3 == 0) goto L2a7
            r3 = r0[r10]     // Catch: java.lang.Exception -> L3ee
            boolean r3 = r3.equals(r8)     // Catch: java.lang.Exception -> L3ee
            if (r3 != 0) goto L2a7
            r3 = r0[r10]     // Catch: java.lang.Exception -> L3ee
            float r3 = java.lang.Float.parseFloat(r3)     // Catch: java.lang.Exception -> L3ee
            a.a.a.i.i.k0 = r3     // Catch: java.lang.Exception -> L3ee
        L2a7:
            r3 = 2
            r4 = r0[r3]     // Catch: java.lang.Exception -> L3ee
            if (r4 == 0) goto L2bc
            r4 = r0[r3]     // Catch: java.lang.Exception -> L3ee
            boolean r4 = r4.equals(r8)     // Catch: java.lang.Exception -> L3ee
            if (r4 != 0) goto L2bc
            r4 = r0[r3]     // Catch: java.lang.Exception -> L3ee
            int r3 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Exception -> L3ee
            a.a.a.i.i.l0 = r3     // Catch: java.lang.Exception -> L3ee
        L2bc:
            r3 = r0[r14]     // Catch: java.lang.Exception -> L3ee
            if (r3 == 0) goto L2d0
            r3 = r0[r14]     // Catch: java.lang.Exception -> L3ee
            boolean r3 = r3.equals(r8)     // Catch: java.lang.Exception -> L3ee
            if (r3 != 0) goto L2d0
            r3 = r0[r14]     // Catch: java.lang.Exception -> L3ee
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Exception -> L3ee
            a.a.a.i.i.m0 = r3     // Catch: java.lang.Exception -> L3ee
        L2d0:
            r3 = 4
            r4 = r0[r3]     // Catch: java.lang.Exception -> L3ee
            if (r4 == 0) goto L2e5
            r4 = r0[r3]     // Catch: java.lang.Exception -> L3ee
            boolean r4 = r4.equals(r8)     // Catch: java.lang.Exception -> L3ee
            if (r4 != 0) goto L2e5
            r0 = r0[r3]     // Catch: java.lang.Exception -> L3ee
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L3ee
            a.a.a.i.i.n0 = r0     // Catch: java.lang.Exception -> L3ee
        L2e5:
            boolean r0 = r12.has(r2)     // Catch: java.lang.Exception -> L3ee
            if (r0 == 0) goto L38e
            java.lang.String r0 = r12.getString(r2)     // Catch: java.lang.Exception -> L3ee
            java.lang.String[] r0 = r0.split(r9)     // Catch: java.lang.Exception -> L3ee
            int r2 = r0.length     // Catch: java.lang.Exception -> L3ee
            r3 = 5
            if (r2 <= r3) goto L38e
            r2 = r0[r11]     // Catch: java.lang.Exception -> L3ee
            if (r2 == 0) goto L310
            r2 = r0[r11]     // Catch: java.lang.Exception -> L3ee
            boolean r2 = r2.equals(r8)     // Catch: java.lang.Exception -> L3ee
            if (r2 != 0) goto L310
            r2 = r0[r11]     // Catch: java.lang.Exception -> L3ee
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Exception -> L3ee
            if (r2 <= 0) goto L30e
            a.a.a.i.i.W = r10     // Catch: java.lang.Exception -> L3ee
            goto L310
        L30e:
            a.a.a.i.i.W = r11     // Catch: java.lang.Exception -> L3ee
        L310:
            r2 = r0[r10]     // Catch: java.lang.Exception -> L3ee
            if (r2 == 0) goto L329
            r2 = r0[r10]     // Catch: java.lang.Exception -> L3ee
            boolean r2 = r2.equals(r8)     // Catch: java.lang.Exception -> L3ee
            if (r2 != 0) goto L329
            r2 = r0[r10]     // Catch: java.lang.Exception -> L3ee
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Exception -> L3ee
            if (r2 <= 0) goto L327
            a.a.a.i.i.X = r10     // Catch: java.lang.Exception -> L3ee
            goto L329
        L327:
            a.a.a.i.i.X = r11     // Catch: java.lang.Exception -> L3ee
        L329:
            r2 = 2
            r3 = r0[r2]     // Catch: java.lang.Exception -> L3ee
            if (r3 == 0) goto L33e
            r3 = r0[r2]     // Catch: java.lang.Exception -> L3ee
            boolean r3 = r3.equals(r8)     // Catch: java.lang.Exception -> L3ee
            if (r3 != 0) goto L33e
            r3 = r0[r2]     // Catch: java.lang.Exception -> L3ee
            int r2 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Exception -> L3ee
            a.a.a.i.i.Y = r2     // Catch: java.lang.Exception -> L3ee
        L33e:
            r2 = r0[r14]     // Catch: java.lang.Exception -> L3ee
            if (r2 == 0) goto L352
            r2 = r0[r14]     // Catch: java.lang.Exception -> L3ee
            boolean r2 = r2.equals(r8)     // Catch: java.lang.Exception -> L3ee
            if (r2 != 0) goto L352
            r2 = r0[r14]     // Catch: java.lang.Exception -> L3ee
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Exception -> L3ee
            a.a.a.i.i.Z = r2     // Catch: java.lang.Exception -> L3ee
        L352:
            r2 = 4
            r3 = r0[r2]     // Catch: java.lang.Exception -> L3ee
            if (r3 == 0) goto L379
            r3 = r0[r2]     // Catch: java.lang.Exception -> L3ee
            boolean r3 = r3.equals(r8)     // Catch: java.lang.Exception -> L3ee
            if (r3 != 0) goto L379
            r2 = r0[r2]     // Catch: java.lang.Exception -> L3ee
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Exception -> L3ee
            if (r2 <= 0) goto L377
            long r2 = (long) r2     // Catch: java.lang.Exception -> L3ee
            a.a.a.i.i.c0 = r2     // Catch: java.lang.Exception -> L3ee
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            r4 = 60
            long r2 = r2 * r4
            a.a.a.i.i.b0 = r2     // Catch: java.lang.Exception -> L3ee
            r4 = 2
            long r2 = r2 >> r4
            a.a.a.i.i.d0 = r2     // Catch: java.lang.Exception -> L3ee
            goto L379
        L377:
            a.a.a.i.i.m = r11     // Catch: java.lang.Exception -> L3ee
        L379:
            r2 = 5
            r3 = r0[r2]     // Catch: java.lang.Exception -> L3ee
            if (r3 == 0) goto L38e
            r3 = r0[r2]     // Catch: java.lang.Exception -> L3ee
            boolean r3 = r3.equals(r8)     // Catch: java.lang.Exception -> L3ee
            if (r3 != 0) goto L38e
            r0 = r0[r2]     // Catch: java.lang.Exception -> L3ee
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L3ee
            a.a.a.i.i.f0 = r0     // Catch: java.lang.Exception -> L3ee
        L38e:
            boolean r0 = r12.has(r1)     // Catch: java.lang.Exception -> L3ee
            if (r0 == 0) goto L3dd
            java.lang.String r0 = r12.getString(r1)     // Catch: java.lang.Exception -> L3ee
            java.lang.String[] r0 = r0.split(r9)     // Catch: java.lang.Exception -> L3ee
            int r1 = r0.length     // Catch: java.lang.Exception -> L3ee
            r2 = 2
            if (r1 <= r2) goto L3dd
            r1 = r0[r11]     // Catch: java.lang.Exception -> L3ee
            if (r1 == 0) goto L3b4
            r1 = r0[r11]     // Catch: java.lang.Exception -> L3ee
            boolean r1 = r1.equals(r8)     // Catch: java.lang.Exception -> L3ee
            if (r1 != 0) goto L3b4
            r1 = r0[r11]     // Catch: java.lang.Exception -> L3ee
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Exception -> L3ee
            a.a.a.i.i.g0 = r1     // Catch: java.lang.Exception -> L3ee
        L3b4:
            r1 = r0[r10]     // Catch: java.lang.Exception -> L3ee
            if (r1 == 0) goto L3c8
            r1 = r0[r10]     // Catch: java.lang.Exception -> L3ee
            boolean r1 = r1.equals(r8)     // Catch: java.lang.Exception -> L3ee
            if (r1 != 0) goto L3c8
            r1 = r0[r10]     // Catch: java.lang.Exception -> L3ee
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Exception -> L3ee
            a.a.a.i.i.h0 = r1     // Catch: java.lang.Exception -> L3ee
        L3c8:
            r1 = 2
            r2 = r0[r1]     // Catch: java.lang.Exception -> L3ee
            if (r2 == 0) goto L3dd
            r2 = r0[r1]     // Catch: java.lang.Exception -> L3ee
            boolean r2 = r2.equals(r8)     // Catch: java.lang.Exception -> L3ee
            if (r2 != 0) goto L3dd
            r0 = r0[r1]     // Catch: java.lang.Exception -> L3ee
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.Exception -> L3ee
            a.a.a.i.i.i0 = r0     // Catch: java.lang.Exception -> L3ee
        L3dd:
            java.lang.String r0 = "dmx"
            boolean r0 = r12.has(r0)     // Catch: java.lang.Exception -> L3ee
            if (r0 == 0) goto L3ef
            java.lang.String r0 = "dmx"
            int r0 = r12.getInt(r0)     // Catch: java.lang.Exception -> L3ee
            a.a.a.i.i.e0 = r0     // Catch: java.lang.Exception -> L3ee
            goto L3ef
        L3ee:
            r10 = r11
        L3ef:
            return r10
    }

    public final void b() {
            r3 = this;
            java.io.File r3 = new java.io.File     // Catch: java.lang.Exception -> L3f
            java.lang.String r0 = a.a.a.c.d.e     // Catch: java.lang.Exception -> L3f
            r3.<init>(r0)     // Catch: java.lang.Exception -> L3f
            boolean r0 = r3.exists()     // Catch: java.lang.Exception -> L3f
            if (r0 != 0) goto L3f
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L3f
            java.lang.String r1 = a.a.a.i.h.f353a     // Catch: java.lang.Exception -> L3f
            r0.<init>(r1)     // Catch: java.lang.Exception -> L3f
            boolean r1 = r0.exists()     // Catch: java.lang.Exception -> L3f
            if (r1 != 0) goto L1d
            r0.mkdirs()     // Catch: java.lang.Exception -> L3f
        L1d:
            boolean r0 = r3.createNewFile()     // Catch: java.lang.Exception -> L3f
            if (r0 != 0) goto L24
            r3 = 0
        L24:
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> L3f
            java.lang.String r1 = "rw"
            r0.<init>(r3, r1)     // Catch: java.lang.Exception -> L3f
            r1 = 0
            r0.seek(r1)     // Catch: java.lang.Exception -> L3f
            r3 = 0
            r0.writeInt(r3)     // Catch: java.lang.Exception -> L3f
            r1 = 128(0x80, float:1.8E-43)
            r0.writeInt(r1)     // Catch: java.lang.Exception -> L3f
            r0.writeInt(r3)     // Catch: java.lang.Exception -> L3f
            r0.close()     // Catch: java.lang.Exception -> L3f
        L3f:
            return
    }

    public final void b(int r5) {
            r4 = this;
            java.io.File r0 = new java.io.File
            java.lang.String r1 = a.a.a.c.d.e
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L10
            r4.b()
        L10:
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> L5f
            java.lang.String r1 = "rw"
            r4.<init>(r0, r1)     // Catch: java.lang.Exception -> L5f
            r0 = 4
            r4.seek(r0)     // Catch: java.lang.Exception -> L5f
            int r0 = r4.readInt()     // Catch: java.lang.Exception -> L5f
            int r1 = r4.readInt()     // Catch: java.lang.Exception -> L5f
            int r2 = a.a.a.c.d.h     // Catch: java.lang.Exception -> L5f
            int r0 = r0 * r2
            int r0 = r0 + 128
            long r2 = (long) r0     // Catch: java.lang.Exception -> L5f
            r4.seek(r2)     // Catch: java.lang.Exception -> L5f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L5f
            r0.<init>()     // Catch: java.lang.Exception -> L5f
            java.lang.String r2 = a.a.a.i.b.f     // Catch: java.lang.Exception -> L5f
            r0.append(r2)     // Catch: java.lang.Exception -> L5f
            r2 = 0
            r0.append(r2)     // Catch: java.lang.Exception -> L5f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L5f
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Exception -> L5f
            int r3 = r0.length     // Catch: java.lang.Exception -> L5f
            r4.writeInt(r3)     // Catch: java.lang.Exception -> L5f
            int r3 = r0.length     // Catch: java.lang.Exception -> L5f
            r4.write(r0, r2, r3)     // Catch: java.lang.Exception -> L5f
            r4.writeInt(r5)     // Catch: java.lang.Exception -> L5f
            int r5 = a.a.a.c.d.h     // Catch: java.lang.Exception -> L5f
            if (r1 != r5) goto L5c
            r2 = 8
            r4.seek(r2)     // Catch: java.lang.Exception -> L5f
            int r1 = r1 + 1
            r4.writeInt(r1)     // Catch: java.lang.Exception -> L5f
        L5c:
            r4.close()     // Catch: java.lang.Exception -> L5f
        L5f:
            return
    }

    public final void b(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "ctr"
            r1 = -1
            a.a.a.c.d.g = r1
            if (r4 == 0) goto L3b
            boolean r2 = r3.a(r4)     // Catch: java.lang.Exception -> L10
            if (r2 == 0) goto L10
            r3.f()     // Catch: java.lang.Exception -> L10
        L10:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L25
            r2.<init>(r4)     // Catch: java.lang.Exception -> L25
            boolean r4 = r2.has(r0)     // Catch: java.lang.Exception -> L25
            if (r4 == 0) goto L25
            java.lang.String r4 = r2.getString(r0)     // Catch: java.lang.Exception -> L25
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Exception -> L25
            a.a.a.c.d.g = r4     // Catch: java.lang.Exception -> L25
        L25:
            r3.e()     // Catch: java.lang.Exception -> L3b
            int r4 = a.a.a.c.d.g     // Catch: java.lang.Exception -> L3b
            if (r4 == r1) goto L30
            r3.b(r4)     // Catch: java.lang.Exception -> L3b
            goto L36
        L30:
            int r4 = a.a.a.c.d.f     // Catch: java.lang.Exception -> L3b
            if (r4 == r1) goto L35
            goto L36
        L35:
            r4 = r1
        L36:
            if (r4 == r1) goto L3b
            r3.a(r4)     // Catch: java.lang.Exception -> L3b
        L3b:
            return
    }

    public void c() {
            r6 = this;
            long r0 = java.lang.System.currentTimeMillis()
            a.a.a.i.e r2 = a.a.a.i.e.c()
            long r2 = r2.b()
            long r0 = r0 - r2
            long r2 = r6.f113b
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L2d
            a.a.a.i.e r0 = a.a.a.i.e.c()
            long r1 = java.lang.System.currentTimeMillis()
            r0.b(r1)
            android.os.Handler r0 = a.a.a.h.a.e()
            a.a.a.c.d$a r1 = new a.a.a.c.d$a
            r1.<init>(r6)
            r0.postDelayed(r1, r4)
        L2d:
            return
    }

    public final void d() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = a.a.a.i.h.f353a
            r0.append(r1)
            java.lang.String r1 = "/config.dat"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L72
            r1.<init>(r0)     // Catch: java.lang.Exception -> L72
            boolean r0 = r1.exists()     // Catch: java.lang.Exception -> L72
            if (r0 == 0) goto L72
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> L72
            java.lang.String r2 = "rw"
            r0.<init>(r1, r2)     // Catch: java.lang.Exception -> L72
            boolean r1 = r0.readBoolean()     // Catch: java.lang.Exception -> L72
            r2 = 0
            if (r1 == 0) goto L42
            r3 = 2
            r0.seek(r3)     // Catch: java.lang.Exception -> L72
            int r1 = r0.readInt()     // Catch: java.lang.Exception -> L72
            byte[] r3 = new byte[r1]     // Catch: java.lang.Exception -> L72
            r0.read(r3, r2, r1)     // Catch: java.lang.Exception -> L72
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Exception -> L72
            r1.<init>(r3)     // Catch: java.lang.Exception -> L72
            r5.a(r1)     // Catch: java.lang.Exception -> L72
        L42:
            r3 = 1
            r0.seek(r3)     // Catch: java.lang.Exception -> L72
            boolean r5 = r0.readBoolean()     // Catch: java.lang.Exception -> L72
            if (r5 == 0) goto L6f
            r3 = 1024(0x400, double:5.06E-321)
            r0.seek(r3)     // Catch: java.lang.Exception -> L72
            double r3 = r0.readDouble()     // Catch: java.lang.Exception -> L72
            a.a.a.i.i.q = r3     // Catch: java.lang.Exception -> L72
            double r3 = r0.readDouble()     // Catch: java.lang.Exception -> L72
            a.a.a.i.i.r = r3     // Catch: java.lang.Exception -> L72
            boolean r5 = r0.readBoolean()     // Catch: java.lang.Exception -> L72
            a.a.a.i.i.u = r5     // Catch: java.lang.Exception -> L72
            if (r5 == 0) goto L6f
            r5 = 625(0x271, float:8.76E-43)
            byte[] r1 = new byte[r5]     // Catch: java.lang.Exception -> L72
            a.a.a.i.i.t = r1     // Catch: java.lang.Exception -> L72
            r0.read(r1, r2, r5)     // Catch: java.lang.Exception -> L72
        L6f:
            r0.close()     // Catch: java.lang.Exception -> L72
        L72:
            boolean r5 = a.a.a.i.i.m
            if (r5 == 0) goto L78
            boolean r5 = com.baidu.location.f.f
        L78:
            return
    }

    public final void e() {
            r7 = this;
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L75
            java.lang.String r1 = a.a.a.c.d.e     // Catch: java.lang.Exception -> L75
            r0.<init>(r1)     // Catch: java.lang.Exception -> L75
            boolean r1 = r0.exists()     // Catch: java.lang.Exception -> L75
            if (r1 == 0) goto L75
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> L75
            java.lang.String r2 = "rw"
            r1.<init>(r0, r2)     // Catch: java.lang.Exception -> L75
            r2 = 4
            r1.seek(r2)     // Catch: java.lang.Exception -> L75
            int r0 = r1.readInt()     // Catch: java.lang.Exception -> L75
            r2 = 3000(0xbb8, float:4.204E-42)
            r3 = 0
            if (r0 <= r2) goto L2b
            r1.close()     // Catch: java.lang.Exception -> L75
            a.a.a.c.d.h = r3     // Catch: java.lang.Exception -> L75
            r7.b()     // Catch: java.lang.Exception -> L75
            return
        L2b:
            int r7 = r1.readInt()     // Catch: java.lang.Exception -> L75
            r4 = 128(0x80, double:6.3E-322)
            r1.seek(r4)     // Catch: java.lang.Exception -> L75
            byte[] r2 = new byte[r0]     // Catch: java.lang.Exception -> L75
            r4 = r3
        L37:
            if (r4 >= r7) goto L6e
            int r5 = r0 * r4
            int r5 = r5 + 128
            long r5 = (long) r5     // Catch: java.lang.Exception -> L75
            r1.seek(r5)     // Catch: java.lang.Exception -> L75
            int r5 = r1.readInt()     // Catch: java.lang.Exception -> L75
            if (r5 <= 0) goto L6b
            if (r5 >= r0) goto L6b
            r1.read(r2, r3, r5)     // Catch: java.lang.Exception -> L75
            int r5 = r5 + (-1)
            r6 = r2[r5]     // Catch: java.lang.Exception -> L75
            if (r6 != 0) goto L6b
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Exception -> L75
            r6.<init>(r2, r3, r5)     // Catch: java.lang.Exception -> L75
            a.a.a.i.b.e()     // Catch: java.lang.Exception -> L75
            java.lang.String r5 = a.a.a.i.b.f     // Catch: java.lang.Exception -> L75
            boolean r5 = r6.equals(r5)     // Catch: java.lang.Exception -> L75
            if (r5 == 0) goto L6b
            int r0 = r1.readInt()     // Catch: java.lang.Exception -> L75
            a.a.a.c.d.f = r0     // Catch: java.lang.Exception -> L75
            a.a.a.c.d.h = r4     // Catch: java.lang.Exception -> L75
            goto L6e
        L6b:
            int r4 = r4 + 1
            goto L37
        L6e:
            if (r4 != r7) goto L72
            a.a.a.c.d.h = r7     // Catch: java.lang.Exception -> L75
        L72:
            r1.close()     // Catch: java.lang.Exception -> L75
        L75:
            return
    }

    public final void f() {
            r8 = this;
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = a.a.a.i.h.f353a
            r8.append(r0)
            java.lang.String r0 = "/config.dat"
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            boolean r0 = a.a.a.i.i.W
            boolean r1 = a.a.a.i.i.X
            java.util.Locale r2 = java.util.Locale.CHINA
            r3 = 39
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = a.a.a.i.i.v
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 0
            r3[r5] = r4
            float r4 = a.a.a.i.i.w
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r6 = 1
            r3[r6] = r4
            float r4 = a.a.a.i.i.x
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r7 = 2
            r3[r7] = r4
            float r4 = a.a.a.i.i.y
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r7 = 3
            r3[r7] = r4
            float r4 = a.a.a.i.i.z
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r7 = 4
            r3[r7] = r4
            int r4 = a.a.a.i.i.A
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7 = 5
            r3[r7] = r4
            int r4 = a.a.a.i.i.B
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7 = 6
            r3[r7] = r4
            int r4 = a.a.a.i.i.C
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7 = 7
            r3[r7] = r4
            int r4 = a.a.a.i.i.D
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7 = 8
            r3[r7] = r4
            int r4 = a.a.a.i.i.E
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7 = 9
            r3[r7] = r4
            int r4 = a.a.a.i.i.F
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7 = 10
            r3[r7] = r4
            int r4 = a.a.a.i.i.G
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7 = 11
            r3[r7] = r4
            float r4 = a.a.a.i.i.H
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r7 = 12
            r3[r7] = r4
            float r4 = a.a.a.i.i.I
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r7 = 13
            r3[r7] = r4
            float r4 = a.a.a.i.i.J
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r7 = 14
            r3[r7] = r4
            float r4 = a.a.a.i.i.K
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r7 = 15
            r3[r7] = r4
            int r4 = a.a.a.i.i.L
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7 = 16
            r3[r7] = r4
            float r4 = a.a.a.i.i.M
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r7 = 17
            r3[r7] = r4
            int r4 = a.a.a.i.i.N
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7 = 18
            r3[r7] = r4
            float r4 = a.a.a.i.i.O
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r7 = 19
            r3[r7] = r4
            float r4 = a.a.a.i.i.P
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r7 = 20
            r3[r7] = r4
            float r4 = a.a.a.i.i.Q
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r7 = 21
            r3[r7] = r4
            int r4 = a.a.a.i.i.R
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7 = 22
            r3[r7] = r4
            int r4 = a.a.a.i.i.S
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7 = 23
            r3[r7] = r4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4 = 24
            r3[r4] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r1 = 25
            r3[r1] = r0
            int r0 = a.a.a.i.i.Y
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 26
            r3[r1] = r0
            int r0 = a.a.a.i.i.Z
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 27
            r3[r1] = r0
            long r0 = a.a.a.i.i.c0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = 28
            r3[r1] = r0
            int r0 = a.a.a.i.i.f0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 29
            r3[r1] = r0
            float r0 = a.a.a.i.i.j0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1 = 30
            r3[r1] = r0
            float r0 = a.a.a.i.i.k0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1 = 31
            r3[r1] = r0
            int r0 = a.a.a.i.i.l0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 32
            r3[r1] = r0
            int r0 = a.a.a.i.i.m0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 33
            r3[r1] = r0
            int r0 = a.a.a.i.i.n0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 34
            r3[r1] = r0
            int r0 = a.a.a.i.i.g0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 35
            r3[r1] = r0
            int r0 = a.a.a.i.i.h0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 36
            r3[r1] = r0
            float r0 = a.a.a.i.i.i0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1 = 37
            r3[r1] = r0
            int r0 = a.a.a.i.i.e0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 38
            r3[r1] = r0
            java.lang.String r0 = "{\"ver\":\"%d\",\"gps\":\"%.1f|%.1f|%.1f|%.1f|%d|%d|%d|%d|%d|%d|%d\",\"up\":\"%.1f|%.1f|%.1f|%.1f\",\"wf\":\"%d|%.1f|%d|%.1f\",\"ab\":\"%.2f|%.2f|%d|%d\",\"gpc\":\"%d|%d|%d|%d|%d|%d\",\"zxd\":\"%.1f|%.1f|%d|%d|%d\",\"shak\":\"%d|%d|%.1f\",\"dmx\":%d}"
            java.lang.String r0 = java.lang.String.format(r2, r0, r3)
            byte[] r0 = r0.getBytes()
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L1f3
            r1.<init>(r8)     // Catch: java.lang.Exception -> L1f3
            boolean r8 = r1.exists()     // Catch: java.lang.Exception -> L1f3
            r2 = 0
            java.lang.String r4 = "rw"
            if (r8 != 0) goto L1d9
            java.io.File r8 = new java.io.File     // Catch: java.lang.Exception -> L1f3
            java.lang.String r7 = a.a.a.i.h.f353a     // Catch: java.lang.Exception -> L1f3
            r8.<init>(r7)     // Catch: java.lang.Exception -> L1f3
            boolean r7 = r8.exists()     // Catch: java.lang.Exception -> L1f3
            if (r7 != 0) goto L1c0
            r8.mkdirs()     // Catch: java.lang.Exception -> L1f3
        L1c0:
            boolean r8 = r1.createNewFile()     // Catch: java.lang.Exception -> L1f3
            if (r8 == 0) goto L1d8
            java.io.RandomAccessFile r8 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> L1f3
            r8.<init>(r1, r4)     // Catch: java.lang.Exception -> L1f3
            r8.seek(r2)     // Catch: java.lang.Exception -> L1f3
            r8.writeBoolean(r5)     // Catch: java.lang.Exception -> L1f3
            r8.writeBoolean(r5)     // Catch: java.lang.Exception -> L1f3
            r8.close()     // Catch: java.lang.Exception -> L1f3
            goto L1d9
        L1d8:
            return
        L1d9:
            java.io.RandomAccessFile r8 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> L1f3
            r8.<init>(r1, r4)     // Catch: java.lang.Exception -> L1f3
            r8.seek(r2)     // Catch: java.lang.Exception -> L1f3
            r8.writeBoolean(r6)     // Catch: java.lang.Exception -> L1f3
            r1 = 2
            r8.seek(r1)     // Catch: java.lang.Exception -> L1f3
            int r1 = r0.length     // Catch: java.lang.Exception -> L1f3
            r8.writeInt(r1)     // Catch: java.lang.Exception -> L1f3
            r8.write(r0)     // Catch: java.lang.Exception -> L1f3
            r8.close()     // Catch: java.lang.Exception -> L1f3
        L1f3:
            return
    }

    public final void g() {
            r4 = this;
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = a.a.a.i.h.f353a
            r4.append(r0)
            java.lang.String r0 = "/config.dat"
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L7c
            r0.<init>(r4)     // Catch: java.lang.Exception -> L7c
            boolean r4 = r0.exists()     // Catch: java.lang.Exception -> L7c
            java.lang.String r1 = "rw"
            if (r4 != 0) goto L4c
            java.io.File r4 = new java.io.File     // Catch: java.lang.Exception -> L7c
            java.lang.String r2 = a.a.a.i.h.f353a     // Catch: java.lang.Exception -> L7c
            r4.<init>(r2)     // Catch: java.lang.Exception -> L7c
            boolean r2 = r4.exists()     // Catch: java.lang.Exception -> L7c
            if (r2 != 0) goto L30
            r4.mkdirs()     // Catch: java.lang.Exception -> L7c
        L30:
            boolean r4 = r0.createNewFile()     // Catch: java.lang.Exception -> L7c
            if (r4 == 0) goto L4b
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> L7c
            r4.<init>(r0, r1)     // Catch: java.lang.Exception -> L7c
            r2 = 0
            r4.seek(r2)     // Catch: java.lang.Exception -> L7c
            r2 = 0
            r4.writeBoolean(r2)     // Catch: java.lang.Exception -> L7c
            r4.writeBoolean(r2)     // Catch: java.lang.Exception -> L7c
            r4.close()     // Catch: java.lang.Exception -> L7c
            goto L4c
        L4b:
            return
        L4c:
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> L7c
            r4.<init>(r0, r1)     // Catch: java.lang.Exception -> L7c
            r0 = 1
            r4.seek(r0)     // Catch: java.lang.Exception -> L7c
            r0 = 1
            r4.writeBoolean(r0)     // Catch: java.lang.Exception -> L7c
            r0 = 1024(0x400, double:5.06E-321)
            r4.seek(r0)     // Catch: java.lang.Exception -> L7c
            double r0 = a.a.a.i.i.q     // Catch: java.lang.Exception -> L7c
            r4.writeDouble(r0)     // Catch: java.lang.Exception -> L7c
            double r0 = a.a.a.i.i.r     // Catch: java.lang.Exception -> L7c
            r4.writeDouble(r0)     // Catch: java.lang.Exception -> L7c
            boolean r0 = a.a.a.i.i.u     // Catch: java.lang.Exception -> L7c
            r4.writeBoolean(r0)     // Catch: java.lang.Exception -> L7c
            boolean r0 = a.a.a.i.i.u     // Catch: java.lang.Exception -> L7c
            if (r0 == 0) goto L79
            byte[] r0 = a.a.a.i.i.t     // Catch: java.lang.Exception -> L7c
            if (r0 == 0) goto L79
            r4.write(r0)     // Catch: java.lang.Exception -> L7c
        L79:
            r4.close()     // Catch: java.lang.Exception -> L7c
        L7c:
            return
    }

    public void h() {
            r0 = this;
            r0.d()
            return
    }

    public void i() {
            r0 = this;
            return
    }
}
