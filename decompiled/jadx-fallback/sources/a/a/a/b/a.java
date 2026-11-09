package a.a.a.b;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public static java.lang.String B = "BDLocConfigManager";
    public android.content.Context A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public android.content.SharedPreferences f3a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5c;
    public long d;
    public double e;
    public int f;
    public int g;
    public double h;
    public int i;
    public int j;
    public double[] k;
    public int l;
    public int m;
    public int n;
    public int o;
    public float p;
    public float q;
    public int r;
    public int[] s;
    public int t;
    public int u;
    public a.a.a.b.a.b v;
    public boolean w;
    public java.lang.String x;
    public java.lang.String y;
    public java.lang.String z;

    /* JADX INFO: renamed from: a.a.a.b.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0000a {
    }

    public class b extends a.a.a.i.g {
        public java.lang.String i;
        public boolean j;
        public final /* synthetic */ a.a.a.b.a k;

        public b(a.a.a.b.a r1) {
                r0 = this;
                r0.k = r1
                r0.<init>()
                r1 = 0
                r0.i = r1
                r1 = 0
                r0.j = r1
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
                java.util.Map<java.lang.String, java.lang.Object> r1 = r4.d
                java.lang.String r2 = "qt"
                java.lang.String r3 = "conf"
                r1.put(r2, r3)
                java.util.Map<java.lang.String, java.lang.Object> r4 = r4.d
                java.lang.String r1 = "req"
                r4.put(r1, r0)
                return
        }

        @Override // a.a.a.i.g
        public void a(boolean r5) {
                r4 = this;
                r0 = 0
                if (r5 == 0) goto L4e
                java.lang.String r5 = r4.f339c
                if (r5 == 0) goto L4e
                org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Exception -> L4a
                java.lang.String r1 = r4.f339c     // Catch: java.lang.Exception -> L4a
                r5.<init>(r1)     // Catch: java.lang.Exception -> L4a
                a.a.a.b.a r5 = r4.k     // Catch: java.lang.Exception -> L4a
                android.content.SharedPreferences r5 = a.a.a.b.a.a(r5)     // Catch: java.lang.Exception -> L4a
                if (r5 == 0) goto L4e
                a.a.a.b.a r5 = r4.k     // Catch: java.lang.Exception -> L4a
                android.content.SharedPreferences r5 = a.a.a.b.a.a(r5)     // Catch: java.lang.Exception -> L4a
                android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch: java.lang.Exception -> L4a
                java.lang.String r1 = r4.f339c     // Catch: java.lang.Exception -> L4a
                byte[] r1 = r1.getBytes()     // Catch: java.lang.Exception -> L4a
                byte[] r1 = a.a.a.i.i.a(r1)     // Catch: java.lang.Exception -> L4a
                java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)     // Catch: java.lang.Exception -> L4a
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4a
                r2.<init>()     // Catch: java.lang.Exception -> L4a
                java.lang.String r3 = a.a.a.b.a.b()     // Catch: java.lang.Exception -> L4a
                r2.append(r3)     // Catch: java.lang.Exception -> L4a
                java.lang.String r3 = "_newConfig"
                r2.append(r3)     // Catch: java.lang.Exception -> L4a
                java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L4a
                r5.putString(r2, r1)     // Catch: java.lang.Exception -> L4a
                r5.apply()     // Catch: java.lang.Exception -> L4a
                goto L4e
            L4a:
                r5 = move-exception
                r5.printStackTrace()
            L4e:
                java.util.Map<java.lang.String, java.lang.Object> r5 = r4.d
                if (r5 == 0) goto L55
                r5.clear()
            L55:
                r4.j = r0
                return
        }

        public void c(java.lang.String r2) {
                r1 = this;
                boolean r0 = r1.j
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r1.j = r0
                r1.i = r2
                java.lang.String r2 = a.a.a.i.d.f325c
                r1.a(r2)
                return
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a.a.a.b.a f6a = null;

        static {
                a.a.a.b.a r0 = new a.a.a.b.a
                r1 = 0
                r0.<init>(r1)
                a.a.a.b.a.c.f6a = r0
                return
        }
    }

    static {
            return
    }

    public a() {
            r5 = this;
            r5.<init>()
            r0 = 0
            r5.f3a = r0
            r1 = 0
            r5.f4b = r1
            r2 = 16
            r5.f5c = r2
            r2 = 300(0x12c, double:1.48E-321)
            r5.d = r2
            r2 = 4604930618986332160(0x3fe8000000000000, double:0.75)
            r5.e = r2
            r5.f = r1
            r2 = 1
            r5.g = r2
            r3 = -4631501856680443904(0xbfb99999a0000000, double:-0.10000000149011612)
            r5.h = r3
            r5.i = r1
            r5.j = r2
            r5.l = r1
            r5.m = r2
            r5.n = r2
            r5.o = r1
            r2 = 1045220557(0x3e4ccccd, float:0.2)
            r5.p = r2
            r2 = 1061997773(0x3f4ccccd, float:0.8)
            r5.q = r2
            r5.r = r1
            r5.s = r0
            r2 = 8
            r5.t = r2
            r2 = 4000(0xfa0, float:5.605E-42)
            r5.u = r2
            r5.v = r0
            r5.w = r1
            r5.x = r0
            r5.y = r0
            r5.z = r0
            r5.A = r0
            return
    }

    public /* synthetic */ a(a.a.a.b.a.C0000a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ android.content.SharedPreferences a(a.a.a.b.a r0) {
            android.content.SharedPreferences r0 = r0.f3a
            return r0
    }

    public static /* synthetic */ java.lang.String b() {
            java.lang.String r0 = a.a.a.b.a.B
            return r0
    }

    public static a.a.a.b.a c() {
            a.a.a.b.a r0 = a.a.a.b.a.c.f6a
            return r0
    }

    public final java.lang.String a() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "v9.521|"
            r0.append(r1)
            java.lang.String r1 = r3.y
            r0.append(r1)
            java.lang.String r1 = "|"
            r0.append(r1)
            java.lang.String r1 = android.os.Build.MODEL
            r0.append(r1)
            java.lang.String r2 = "&cu="
            r0.append(r2)
            java.lang.String r3 = r3.y
            r0.append(r3)
            java.lang.String r3 = "&mb="
            r0.append(r3)
            r0.append(r1)
            java.lang.String r3 = r0.toString()
            return r3
    }

    public synchronized void a(double r5, double r7, java.lang.String r9) {
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = r4.z     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L6f
            if (r9 == 0) goto L6f
            java.lang.String r0 = "bd09"
            boolean r0 = r9.equals(r0)     // Catch: java.lang.Exception -> L6c java.lang.Throwable -> L71
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L19
            java.lang.String r0 = "wgs84mc"
            boolean r9 = r9.equals(r0)     // Catch: java.lang.Exception -> L6c java.lang.Throwable -> L71
            if (r9 == 0) goto L25
        L19:
            java.lang.String r9 = "bd092gcj"
            double[] r5 = com.baidu.location.Jni.a(r7, r5, r9)     // Catch: java.lang.Exception -> L6c java.lang.Throwable -> L71
            r6 = r5[r1]     // Catch: java.lang.Exception -> L6c java.lang.Throwable -> L71
            r8 = r5[r2]     // Catch: java.lang.Exception -> L6c java.lang.Throwable -> L71
            r5 = r6
            r7 = r8
        L25:
            java.util.Locale r9 = java.util.Locale.US     // Catch: java.lang.Exception -> L6c java.lang.Throwable -> L71
            java.lang.String r0 = "%.5f|%.5f"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L6c java.lang.Throwable -> L71
            java.lang.Double r7 = java.lang.Double.valueOf(r7)     // Catch: java.lang.Exception -> L6c java.lang.Throwable -> L71
            r3[r2] = r7     // Catch: java.lang.Exception -> L6c java.lang.Throwable -> L71
            java.lang.Double r5 = java.lang.Double.valueOf(r5)     // Catch: java.lang.Exception -> L6c java.lang.Throwable -> L71
            r3[r1] = r5     // Catch: java.lang.Exception -> L6c java.lang.Throwable -> L71
            java.lang.String r5 = java.lang.String.format(r9, r0, r3)     // Catch: java.lang.Exception -> L6c java.lang.Throwable -> L71
            r4.z = r5     // Catch: java.lang.Exception -> L6c java.lang.Throwable -> L71
            java.lang.String r6 = "UTF-8"
            byte[] r5 = r5.getBytes(r6)     // Catch: java.lang.Exception -> L6c java.lang.Throwable -> L71
            java.lang.String r5 = android.util.Base64.encodeToString(r5, r2)     // Catch: java.lang.Exception -> L6c java.lang.Throwable -> L71
            if (r5 == 0) goto L6f
            android.content.SharedPreferences r6 = r4.f3a     // Catch: java.lang.Exception -> L6c java.lang.Throwable -> L71
            if (r6 == 0) goto L6f
            android.content.SharedPreferences$Editor r6 = r6.edit()     // Catch: java.lang.Exception -> L6c java.lang.Throwable -> L71
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6c java.lang.Throwable -> L71
            r7.<init>()     // Catch: java.lang.Exception -> L6c java.lang.Throwable -> L71
            java.lang.String r8 = a.a.a.b.a.B     // Catch: java.lang.Exception -> L6c java.lang.Throwable -> L71
            r7.append(r8)     // Catch: java.lang.Exception -> L6c java.lang.Throwable -> L71
            java.lang.String r8 = "_loc"
            r7.append(r8)     // Catch: java.lang.Exception -> L6c java.lang.Throwable -> L71
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L6c java.lang.Throwable -> L71
            r6.putString(r7, r5)     // Catch: java.lang.Exception -> L6c java.lang.Throwable -> L71
            r6.apply()     // Catch: java.lang.Exception -> L6c java.lang.Throwable -> L71
            goto L6f
        L6c:
            r5 = 0
            r4.z = r5     // Catch: java.lang.Throwable -> L71
        L6f:
            monitor-exit(r4)
            return
        L71:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    public synchronized void a(android.content.Context r8, com.baidu.location.i r9, java.lang.String r10) {
            r7 = this;
            monitor-enter(r7)
            boolean r10 = r7.w     // Catch: java.lang.Throwable -> L112
            if (r10 != 0) goto L110
            if (r8 == 0) goto L110
            r10 = 1
            r7.w = r10     // Catch: java.lang.Throwable -> L112
            r7.A = r8     // Catch: java.lang.Throwable -> L112
            if (r9 != 0) goto L13
            com.baidu.location.i r9 = new com.baidu.location.i     // Catch: java.lang.Throwable -> L112
            r9.<init>()     // Catch: java.lang.Throwable -> L112
        L13:
            java.lang.String r10 = r8.getPackageName()     // Catch: java.lang.Throwable -> L112
            r7.x = r10     // Catch: java.lang.Throwable -> L112
            c.a.c.a.b r10 = c.a.c.a.b.c(r8)     // Catch: java.lang.Throwable -> L24
            java.lang.String r10 = r10.a()     // Catch: java.lang.Throwable -> L24
            r7.y = r10     // Catch: java.lang.Throwable -> L24
            goto L27
        L24:
            r10 = 0
            r7.y = r10     // Catch: java.lang.Throwable -> L112
        L27:
            android.content.SharedPreferences r10 = r7.f3a     // Catch: java.lang.Throwable -> L112
            r0 = 0
            if (r10 != 0) goto L45
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L112
            r10.<init>()     // Catch: java.lang.Throwable -> L112
            java.lang.String r1 = a.a.a.b.a.B     // Catch: java.lang.Throwable -> L112
            r10.append(r1)     // Catch: java.lang.Throwable -> L112
            java.lang.String r1 = "BDLocConfig"
            r10.append(r1)     // Catch: java.lang.Throwable -> L112
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L112
            android.content.SharedPreferences r8 = r8.getSharedPreferences(r10, r0)     // Catch: java.lang.Throwable -> L112
            r7.f3a = r8     // Catch: java.lang.Throwable -> L112
        L45:
            android.content.SharedPreferences r8 = r7.f3a     // Catch: java.lang.Throwable -> L112
            if (r8 == 0) goto L110
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L112
            r10.<init>()     // Catch: java.lang.Throwable -> L112
            java.lang.String r1 = a.a.a.b.a.B     // Catch: java.lang.Throwable -> L112
            r10.append(r1)     // Catch: java.lang.Throwable -> L112
            java.lang.String r1 = "_lastCheckTime"
            r10.append(r1)     // Catch: java.lang.Throwable -> L112
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L112
            r1 = 0
            long r1 = r8.getLong(r10, r1)     // Catch: java.lang.Throwable -> L112
            android.content.SharedPreferences r8 = r7.f3a     // Catch: java.lang.Throwable -> L112
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L112
            r10.<init>()     // Catch: java.lang.Throwable -> L112
            java.lang.String r3 = a.a.a.b.a.B     // Catch: java.lang.Throwable -> L112
            r10.append(r3)     // Catch: java.lang.Throwable -> L112
            java.lang.String r3 = "_config"
            r10.append(r3)     // Catch: java.lang.Throwable -> L112
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L112
            java.lang.String r3 = ""
            java.lang.String r8 = r8.getString(r10, r3)     // Catch: java.lang.Throwable -> L112
            android.content.SharedPreferences r10 = r7.f3a     // Catch: java.lang.Throwable -> L112
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L112
            r3.<init>()     // Catch: java.lang.Throwable -> L112
            java.lang.String r4 = a.a.a.b.a.B     // Catch: java.lang.Throwable -> L112
            r3.append(r4)     // Catch: java.lang.Throwable -> L112
            java.lang.String r4 = "_newConfig"
            r3.append(r4)     // Catch: java.lang.Throwable -> L112
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L112
            java.lang.String r4 = ""
            java.lang.String r10 = r10.getString(r3, r4)     // Catch: java.lang.Throwable -> L112
            boolean r3 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> L112
            if (r3 != 0) goto Laf
            byte[] r8 = android.util.Base64.decode(r10, r0)     // Catch: java.lang.Throwable -> L112
            java.lang.String r10 = new java.lang.String     // Catch: java.lang.Throwable -> L112
            byte[] r8 = a.a.a.i.i.b(r8)     // Catch: java.lang.Throwable -> L112
            r10.<init>(r8)     // Catch: java.lang.Throwable -> L112
            r7.a(r10)     // Catch: java.lang.Throwable -> L112
            goto Ld7
        Laf:
            boolean r10 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L112
            if (r10 != 0) goto Ld7
            r7.a(r8)     // Catch: java.lang.Throwable -> L112
            android.content.SharedPreferences r8 = r7.f3a     // Catch: java.lang.Throwable -> L112
            android.content.SharedPreferences$Editor r8 = r8.edit()     // Catch: java.lang.Throwable -> L112
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L112
            r10.<init>()     // Catch: java.lang.Throwable -> L112
            java.lang.String r0 = a.a.a.b.a.B     // Catch: java.lang.Throwable -> L112
            r10.append(r0)     // Catch: java.lang.Throwable -> L112
            java.lang.String r0 = "_config"
            r10.append(r0)     // Catch: java.lang.Throwable -> L112
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L112
            r8.remove(r10)     // Catch: java.lang.Throwable -> L112
            r8.apply()     // Catch: java.lang.Throwable -> L112
        Ld7:
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L112
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r5
            long r3 = r3 - r1
            long r0 = java.lang.Math.abs(r3)     // Catch: java.lang.Throwable -> L112
            long r2 = r7.d     // Catch: java.lang.Throwable -> L112
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 <= 0) goto L110
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L112
            long r0 = r0 / r5
            android.content.SharedPreferences r8 = r7.f3a     // Catch: java.lang.Throwable -> L112
            android.content.SharedPreferences$Editor r8 = r8.edit()     // Catch: java.lang.Throwable -> L112
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L112
            r10.<init>()     // Catch: java.lang.Throwable -> L112
            java.lang.String r2 = a.a.a.b.a.B     // Catch: java.lang.Throwable -> L112
            r10.append(r2)     // Catch: java.lang.Throwable -> L112
            java.lang.String r2 = "_lastCheckTime"
            r10.append(r2)     // Catch: java.lang.Throwable -> L112
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L112
            r8.putLong(r10, r0)     // Catch: java.lang.Throwable -> L112
            r8.apply()     // Catch: java.lang.Throwable -> L112
            r7.a(r9)     // Catch: java.lang.Throwable -> L112
        L110:
            monitor-exit(r7)
            return
        L112:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
    }

    public final void a(com.baidu.location.i r6) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "&ver="
            r0.append(r1)
            int r1 = a.a.a.i.i.v
            r0.append(r1)
            java.lang.String r1 = "&usr="
            r0.append(r1)
            java.lang.String r1 = r5.a()
            r0.append(r1)
            java.lang.String r1 = "&app="
            r0.append(r1)
            java.lang.String r1 = r5.x
            r0.append(r1)
            java.lang.String r1 = "&prod="
            r0.append(r1)
            java.lang.String r6 = r6.f
            r0.append(r6)
            java.lang.String r6 = "&newwf=1"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            r1 = 0
            if (r0 == 0) goto L48
            int r2 = r0.length()
            r3 = 6
            if (r2 <= r3) goto L48
            java.lang.String r0 = r0.substring(r1, r3)
        L48:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.String r6 = "&sv="
            r2.append(r6)
            r2.append(r0)
            java.lang.String r6 = r2.toString()
            java.lang.String r0 = "ro.miui.ui.version.name"
            java.lang.String r0 = a.a.a.i.i.c(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L7c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.String r6 = "&miui="
            r2.append(r6)
            r2.append(r0)
            java.lang.String r6 = r2.toString()
        L7c:
            java.lang.String r0 = a.a.a.i.i.f()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L9a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.String r6 = "&mtk="
            r2.append(r6)
            r2.append(r0)
            java.lang.String r6 = r2.toString()
        L9a:
            android.content.Context r0 = r5.A
            android.content.SharedPreferences r0 = a.a.a.b.r.b(r0)
            r2 = 0
            if (r0 == 0) goto Laa
            java.lang.String r3 = "mapcity"
            java.lang.String r0 = r0.getString(r3, r2)
            goto Lab
        Laa:
            r0 = r2
        Lab:
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto Lc5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r6)
            java.lang.String r6 = "&city="
            r3.append(r6)
            r3.append(r0)
            java.lang.String r6 = r3.toString()
        Lc5:
            android.content.SharedPreferences r0 = r5.f3a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = a.a.a.b.a.B
            r3.append(r4)
            java.lang.String r4 = "_loc"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = r0.getString(r3, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L103
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L103
            r2.<init>()     // Catch: java.lang.Exception -> L103
            r2.append(r6)     // Catch: java.lang.Exception -> L103
            java.lang.String r3 = "&loc="
            r2.append(r3)     // Catch: java.lang.Exception -> L103
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Exception -> L103
            byte[] r0 = android.util.Base64.decode(r0, r1)     // Catch: java.lang.Exception -> L103
            java.lang.String r1 = "UTF-8"
            r3.<init>(r0, r1)     // Catch: java.lang.Exception -> L103
            r2.append(r3)     // Catch: java.lang.Exception -> L103
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Exception -> L103
        L103:
            a.a.a.b.a$b r0 = r5.v
            if (r0 != 0) goto L10e
            a.a.a.b.a$b r0 = new a.a.a.b.a$b
            r0.<init>(r5)
            r5.v = r0
        L10e:
            a.a.a.b.a$b r5 = r5.v
            r5.c(r6)
            return
    }

    public final void a(java.lang.String r25) {
            r24 = this;
            r0 = r24
            java.lang.String r1 = "cl_str_change_rate"
            java.lang.String r2 = "nc_same_rate"
            java.lang.String r3 = "new_loc_cache_switch"
            java.lang.String r4 = "nlp_loc_coarse"
            java.lang.String r5 = "oldts"
            java.lang.String r6 = "hpdts"
            java.lang.String r7 = "ums"
            java.lang.String r8 = "smn"
            java.lang.String r9 = "suci"
            java.lang.String r10 = "ct"
            java.lang.String r11 = "opetco"
            java.lang.String r12 = "iupl"
            java.lang.String r13 = "lpcs"
            java.lang.String r14 = "gnmcon"
            java.lang.String r15 = "gnmcrm"
            r16 = r1
            java.lang.String r1 = "idmoc"
            r17 = r2
            java.lang.String r2 = "wfsm"
            r18 = r3
            java.lang.String r3 = "freq"
            r19 = r4
            java.lang.String r4 = "wfnum"
            r20 = r5
            java.lang.String r5 = "is_check_Per"
            r21 = r6
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Exception -> L1c8
            r22 = r7
            r7 = r25
            r6.<init>(r7)     // Catch: java.lang.Exception -> L1c8
            boolean r7 = r6.has(r5)     // Catch: java.lang.Exception -> L1c8
            r23 = r8
            r8 = 1
            if (r7 == 0) goto L50
            int r5 = r6.getInt(r5)     // Catch: java.lang.Exception -> L1c8
            if (r5 <= 0) goto L50
            r0.f4b = r8     // Catch: java.lang.Exception -> L1c8
        L50:
            boolean r5 = r6.has(r4)     // Catch: java.lang.Exception -> L1c8
            if (r5 == 0) goto L5c
            int r4 = r6.getInt(r4)     // Catch: java.lang.Exception -> L1c8
            r0.f5c = r4     // Catch: java.lang.Exception -> L1c8
        L5c:
            boolean r4 = r6.has(r3)     // Catch: java.lang.Exception -> L1c8
            if (r4 == 0) goto L68
            long r3 = r6.getLong(r3)     // Catch: java.lang.Exception -> L1c8
            r0.d = r3     // Catch: java.lang.Exception -> L1c8
        L68:
            boolean r3 = r6.has(r2)     // Catch: java.lang.Exception -> L1c8
            if (r3 == 0) goto L74
            double r2 = r6.getDouble(r2)     // Catch: java.lang.Exception -> L1c8
            r0.e = r2     // Catch: java.lang.Exception -> L1c8
        L74:
            boolean r2 = r6.has(r1)     // Catch: java.lang.Exception -> L1c8
            if (r2 == 0) goto L80
            int r1 = r6.getInt(r1)     // Catch: java.lang.Exception -> L1c8
            r0.f = r1     // Catch: java.lang.Exception -> L1c8
        L80:
            boolean r1 = r6.has(r15)     // Catch: java.lang.Exception -> L1c8
            if (r1 == 0) goto L8c
            double r1 = r6.getDouble(r15)     // Catch: java.lang.Exception -> L1c8
            r0.h = r1     // Catch: java.lang.Exception -> L1c8
        L8c:
            boolean r1 = r6.has(r14)     // Catch: java.lang.Exception -> L1c8
            if (r1 == 0) goto L98
            int r1 = r6.getInt(r14)     // Catch: java.lang.Exception -> L1c8
            r0.i = r1     // Catch: java.lang.Exception -> L1c8
        L98:
            boolean r1 = r6.has(r13)     // Catch: java.lang.Exception -> L1c8
            if (r1 == 0) goto La4
            int r1 = r6.getInt(r13)     // Catch: java.lang.Exception -> L1c8
            r0.g = r1     // Catch: java.lang.Exception -> L1c8
        La4:
            boolean r1 = r6.has(r12)     // Catch: java.lang.Exception -> L1c8
            if (r1 == 0) goto Lb0
            int r1 = r6.getInt(r12)     // Catch: java.lang.Exception -> L1c8
            r0.j = r1     // Catch: java.lang.Exception -> L1c8
        Lb0:
            boolean r1 = r6.has(r11)     // Catch: java.lang.Exception -> L1c8
            if (r1 == 0) goto Lb9
            r6.getInt(r11)     // Catch: java.lang.Exception -> L1c8
        Lb9:
            boolean r1 = r6.has(r10)     // Catch: java.lang.Exception -> L1c8
            if (r1 == 0) goto Lc2
            r6.getInt(r10)     // Catch: java.lang.Exception -> L1c8
        Lc2:
            boolean r1 = r6.has(r9)     // Catch: java.lang.Exception -> L1c8
            if (r1 == 0) goto Lcb
            r6.getInt(r9)     // Catch: java.lang.Exception -> L1c8
        Lcb:
            r1 = r23
            boolean r2 = r6.has(r1)     // Catch: java.lang.Exception -> L1c8
            if (r2 == 0) goto Ld6
            r6.getInt(r1)     // Catch: java.lang.Exception -> L1c8
        Ld6:
            java.lang.String r1 = "bcar"
            boolean r1 = r6.has(r1)     // Catch: java.lang.Exception -> L1c8
            if (r1 == 0) goto Le1
            r0.a(r6)     // Catch: java.lang.Exception -> L1c8
        Le1:
            r1 = r22
            boolean r2 = r6.has(r1)     // Catch: java.lang.Exception -> L1c8
            if (r2 == 0) goto Lec
            r6.getInt(r1)     // Catch: java.lang.Exception -> L1c8
        Lec:
            r1 = r21
            boolean r2 = r6.has(r1)     // Catch: java.lang.Exception -> L1c8
            if (r2 == 0) goto Lfa
            int r1 = r6.getInt(r1)     // Catch: java.lang.Exception -> L1c8
            r0.l = r1     // Catch: java.lang.Exception -> L1c8
        Lfa:
            r1 = r20
            boolean r2 = r6.has(r1)     // Catch: java.lang.Exception -> L1c8
            if (r2 == 0) goto L108
            int r1 = r6.getInt(r1)     // Catch: java.lang.Exception -> L1c8
            r0.m = r1     // Catch: java.lang.Exception -> L1c8
        L108:
            r1 = r19
            boolean r2 = r6.has(r1)     // Catch: java.lang.Exception -> L1c8
            if (r2 == 0) goto L116
            int r1 = r6.optInt(r1)     // Catch: java.lang.Exception -> L1c8
            r0.n = r1     // Catch: java.lang.Exception -> L1c8
        L116:
            r1 = r18
            boolean r2 = r6.has(r1)     // Catch: java.lang.Exception -> L1c8
            if (r2 == 0) goto L124
            int r1 = r6.optInt(r1)     // Catch: java.lang.Exception -> L1c8
            r0.o = r1     // Catch: java.lang.Exception -> L1c8
        L124:
            r1 = r17
            boolean r2 = r6.has(r1)     // Catch: java.lang.Exception -> L1c8
            if (r2 == 0) goto L138
            r2 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            double r1 = r6.optDouble(r1, r2)     // Catch: java.lang.Exception -> L1c8
            float r1 = (float) r1     // Catch: java.lang.Exception -> L1c8
            r0.p = r1     // Catch: java.lang.Exception -> L1c8
        L138:
            r1 = r16
            boolean r2 = r6.has(r1)     // Catch: java.lang.Exception -> L1c8
            if (r2 == 0) goto L14c
            r2 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            double r1 = r6.optDouble(r1, r2)     // Catch: java.lang.Exception -> L1c8
            float r1 = (float) r1     // Catch: java.lang.Exception -> L1c8
            r0.q = r1     // Catch: java.lang.Exception -> L1c8
        L14c:
            java.lang.String r1 = "cl_list_switch"
            boolean r1 = r6.has(r1)     // Catch: java.lang.Exception -> L1c8
            r2 = 0
            if (r1 == 0) goto L15d
            java.lang.String r1 = "cl_list_switch"
            int r1 = r6.optInt(r1, r2)     // Catch: java.lang.Exception -> L1c8
            r0.r = r1     // Catch: java.lang.Exception -> L1c8
        L15d:
            java.lang.String r1 = "cl_str_switch"
            boolean r1 = r6.has(r1)     // Catch: java.lang.Exception -> L1c8
            if (r1 == 0) goto L196
            java.lang.String r1 = "cl_str_switch"
            java.lang.String r3 = ""
            java.lang.String r1 = r6.optString(r1, r3)     // Catch: java.lang.Exception -> L1c8
            java.lang.String r3 = ","
            java.lang.String[] r1 = r1.split(r3)     // Catch: java.lang.Exception -> L1c8
            int r3 = r1.length     // Catch: java.lang.Exception -> L1c8
            int[] r3 = new int[r3]     // Catch: java.lang.Exception -> L1c8
            r0.s = r3     // Catch: java.lang.Exception -> L1c8
            int r3 = r1.length     // Catch: java.lang.Exception -> L1c8
            r4 = r2
            r5 = r4
        L17b:
            if (r4 >= r3) goto L196
            r7 = r1[r4]     // Catch: java.lang.Exception -> L1c8
            int[] r9 = r0.s     // Catch: java.lang.Exception -> L1c8
            r9[r5] = r2     // Catch: java.lang.Exception -> L1c8
            int r9 = r7.length()     // Catch: java.lang.Exception -> L1c8
            if (r9 <= 0) goto L191
            int[] r9 = r0.s     // Catch: java.lang.Throwable -> L191
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.Throwable -> L191
            r9[r5] = r7     // Catch: java.lang.Throwable -> L191
        L191:
            int r5 = r5 + 1
            int r4 = r4 + 1
            goto L17b
        L196:
            java.lang.String r1 = "cell_number"
            boolean r1 = r6.has(r1)     // Catch: java.lang.Exception -> L1c8
            if (r1 == 0) goto L1a8
            java.lang.String r1 = "cell_number"
            r2 = 10
            int r1 = r6.optInt(r1, r2)     // Catch: java.lang.Exception -> L1c8
            r0.t = r1     // Catch: java.lang.Exception -> L1c8
        L1a8:
            java.lang.String r1 = "loc_str_length"
            boolean r1 = r6.has(r1)     // Catch: java.lang.Exception -> L1c8
            if (r1 == 0) goto L1ba
            java.lang.String r1 = "loc_str_length"
            r2 = 4000(0xfa0, float:5.605E-42)
            int r1 = r6.optInt(r1, r2)     // Catch: java.lang.Exception -> L1c8
            r0.u = r1     // Catch: java.lang.Exception -> L1c8
        L1ba:
            java.lang.String r0 = "loc_to_foreground"
            boolean r0 = r6.has(r0)     // Catch: java.lang.Exception -> L1c8
            if (r0 == 0) goto L1cc
            java.lang.String r0 = "loc_to_foreground"
            r6.optInt(r0, r8)     // Catch: java.lang.Exception -> L1c8
            goto L1cc
        L1c8:
            r0 = move-exception
            r0.printStackTrace()
        L1cc:
            return
    }

    public void a(org.json.JSONObject r7) {
            r6 = this;
            java.lang.String r0 = "bcar"
            if (r7 == 0) goto L7a
            double[] r1 = r6.k
            if (r1 == 0) goto Le
            int r1 = r1.length
            if (r1 <= 0) goto Le
            r1 = 0
            r6.k = r1
        Le:
            boolean r1 = r7.has(r0)     // Catch: java.lang.Exception -> L7a
            if (r1 == 0) goto L7a
            org.json.JSONArray r7 = r7.getJSONArray(r0)     // Catch: java.lang.Exception -> L7a
            if (r7 == 0) goto L7a
            int r0 = r7.length()     // Catch: java.lang.Exception -> L7a
            if (r0 <= 0) goto L7a
            double[] r0 = r6.k     // Catch: java.lang.Exception -> L7a
            if (r0 != 0) goto L2e
            int r0 = r7.length()     // Catch: java.lang.Exception -> L7a
            int r0 = r0 * 4
            double[] r0 = new double[r0]     // Catch: java.lang.Exception -> L7a
            r6.k = r0     // Catch: java.lang.Exception -> L7a
        L2e:
            r0 = 0
            r1 = r0
        L30:
            int r2 = r7.length()     // Catch: java.lang.Exception -> L7a
            if (r0 >= r2) goto L7a
            double[] r2 = r6.k     // Catch: java.lang.Exception -> L7a
            int r3 = r1 + 1
            org.json.JSONObject r4 = r7.getJSONObject(r0)     // Catch: java.lang.Exception -> L7a
            java.lang.String r5 = "x1"
            double r4 = r4.getDouble(r5)     // Catch: java.lang.Exception -> L7a
            r2[r1] = r4     // Catch: java.lang.Exception -> L7a
            double[] r1 = r6.k     // Catch: java.lang.Exception -> L7a
            int r2 = r3 + 1
            org.json.JSONObject r4 = r7.getJSONObject(r0)     // Catch: java.lang.Exception -> L7a
            java.lang.String r5 = "y1"
            double r4 = r4.getDouble(r5)     // Catch: java.lang.Exception -> L7a
            r1[r3] = r4     // Catch: java.lang.Exception -> L7a
            double[] r1 = r6.k     // Catch: java.lang.Exception -> L7a
            int r3 = r2 + 1
            org.json.JSONObject r4 = r7.getJSONObject(r0)     // Catch: java.lang.Exception -> L7a
            java.lang.String r5 = "x2"
            double r4 = r4.getDouble(r5)     // Catch: java.lang.Exception -> L7a
            r1[r2] = r4     // Catch: java.lang.Exception -> L7a
            double[] r1 = r6.k     // Catch: java.lang.Exception -> L7a
            int r2 = r3 + 1
            org.json.JSONObject r4 = r7.getJSONObject(r0)     // Catch: java.lang.Exception -> L7a
            java.lang.String r5 = "y2"
            double r4 = r4.getDouble(r5)     // Catch: java.lang.Exception -> L7a
            r1[r3] = r4     // Catch: java.lang.Exception -> L7a
            int r0 = r0 + 1
            r1 = r2
            goto L30
        L7a:
            return
    }
}
