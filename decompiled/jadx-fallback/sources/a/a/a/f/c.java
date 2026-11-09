package a.a.a.f;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.a.a.f.d f225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.database.sqlite.SQLiteDatabase f226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a.a.a.f.c.b f227c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public java.lang.String[] i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public double o;
    public double p;
    public double q;
    public double r;
    public double s;
    public int t;
    public boolean u;
    public long v;
    public long w;
    public long x;
    public long y;
    public long z;

    public static /* synthetic */ class a {
    }

    public final class b extends a.a.a.i.g {
        public int i;
        public long j;
        public long k;
        public boolean l;
        public final java.lang.String m;
        public final /* synthetic */ a.a.a.f.c n;

        public class a implements java.lang.Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a.a.a.f.c.b f228b;

            public a(a.a.a.f.c.b r1) {
                    r0 = this;
                    r0.f228b = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    a.a.a.b.w r0 = a.a.a.b.w.d()
                    java.util.concurrent.ExecutorService r0 = r0.b()
                    java.lang.String r1 = "https://ofloc.map.baidu.com/offline_loc"
                    a.a.a.f.c$b r2 = r2.f228b
                    if (r0 == 0) goto L12
                    r2.a(r0, r1)
                    goto L15
                L12:
                    r2.a(r1)
                L15:
                    return
            }
        }

        public b(a.a.a.f.c r4) {
                r3 = this;
                r3.n = r4
                r3.<init>()
                r4 = 0
                r3.i = r4
                r3.l = r4
                r0 = -1
                r3.j = r0
                r3.k = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r3.d = r0
                java.util.Locale r0 = java.util.Locale.US
                r1 = 7
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.String r2 = "1"
                r1[r4] = r2
                a.a.a.i.b r4 = a.a.a.i.b.e()
                java.lang.String r4 = r4.f321c
                r2 = 1
                r1[r2] = r4
                java.lang.String r4 = a.a.a.i.b.g
                r2 = 2
                r1[r2] = r4
                java.lang.String r4 = a.a.a.i.b.f
                r2 = 3
                r1[r2] = r4
                r4 = 1092113924(0x41185604, float:9.521)
                java.lang.Float r4 = java.lang.Float.valueOf(r4)
                r2 = 4
                r1[r2] = r4
                java.lang.String r4 = android.os.Build.MODEL
                r2 = 5
                r1[r2] = r4
                java.lang.String r4 = android.os.Build.VERSION.SDK
                r2 = 6
                r1[r2] = r4
                java.lang.String r4 = "&ver=%s&cuid=%s&prod=%s:%s&sdk=%.2f&mb=%s&os=A%s"
                java.lang.String r4 = java.lang.String.format(r0, r4, r1)
                java.lang.String r4 = com.baidu.location.Jni.e(r4)
                r3.m = r4
                return
        }

        public /* synthetic */ b(a.a.a.f.c r1, a.a.a.f.c.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public static /* synthetic */ void a(a.a.a.f.c.b r0) {
                r0.b()
                return
        }

        @Override // a.a.a.i.g
        public void a() {
                r3 = this;
                java.util.Map<java.lang.String, java.lang.Object> r0 = r3.d
                r0.clear()
                java.util.Map<java.lang.String, java.lang.Object> r0 = r3.d
                java.lang.String r1 = "qt"
                java.lang.String r2 = "conf"
                r0.put(r1, r2)
                java.util.Map<java.lang.String, java.lang.Object> r0 = r3.d
                java.lang.String r1 = r3.m
                java.lang.String r2 = "req"
                r0.put(r2, r1)
                java.lang.String r0 = a.a.a.f.d.j
                r3.f337a = r0
                return
        }

        @Override // a.a.a.i.g
        public void a(boolean r20) {
                r19 = this;
                r0 = r19
                java.lang.String r1 = "ofl"
                java.lang.String r2 = "ver"
                java.lang.String r3 = "cplist"
                r4 = 1
                if (r20 == 0) goto L301
                java.lang.String r5 = r0.f339c
                if (r5 == 0) goto L301
                org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Exception -> L301
                r6.<init>(r5)     // Catch: java.lang.Exception -> L301
                r7 = 0
                boolean r5 = r6.has(r1)     // Catch: java.lang.Exception -> L301
                if (r5 == 0) goto L20
                long r7 = r6.getLong(r1)     // Catch: java.lang.Exception -> L301
            L20:
                boolean r1 = r6.has(r2)     // Catch: java.lang.Exception -> L301
                java.lang.String r5 = "1"
                if (r1 == 0) goto L2d
                java.lang.String r1 = r6.getString(r2)     // Catch: java.lang.Exception -> L301
                goto L2e
            L2d:
                r1 = r5
            L2e:
                r9 = 1
                long r11 = r7 & r9
                int r9 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                if (r9 != 0) goto L3b
                a.a.a.f.c r9 = r0.n     // Catch: java.lang.Exception -> L301
                a.a.a.f.c.a(r9, r4)     // Catch: java.lang.Exception -> L301
            L3b:
                r9 = 2
                long r11 = r7 & r9
                int r9 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                if (r9 != 0) goto L48
                a.a.a.f.c r9 = r0.n     // Catch: java.lang.Exception -> L301
                a.a.a.f.c.b(r9, r4)     // Catch: java.lang.Exception -> L301
            L48:
                r9 = 4
                long r11 = r7 & r9
                int r9 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                if (r9 != 0) goto L55
                a.a.a.f.c r9 = r0.n     // Catch: java.lang.Exception -> L301
                a.a.a.f.c.c(r9, r4)     // Catch: java.lang.Exception -> L301
            L55:
                r9 = 8
                long r11 = r7 & r9
                int r9 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                if (r9 != 0) goto L62
                a.a.a.f.c r9 = r0.n     // Catch: java.lang.Exception -> L301
                a.a.a.f.c.d(r9, r4)     // Catch: java.lang.Exception -> L301
            L62:
                r9 = 16
                long r11 = r7 & r9
                int r9 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                if (r9 != 0) goto L6f
                a.a.a.f.c r9 = r0.n     // Catch: java.lang.Exception -> L301
                a.a.a.f.c.e(r9, r4)     // Catch: java.lang.Exception -> L301
            L6f:
                r9 = 32
                long r11 = r7 & r9
                int r9 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                if (r9 != 0) goto L7c
                a.a.a.f.c r9 = r0.n     // Catch: java.lang.Exception -> L301
                a.a.a.f.c.f(r9, r4)     // Catch: java.lang.Exception -> L301
            L7c:
                r9 = 64
                long r7 = r7 & r9
                int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r7 != 0) goto L88
                a.a.a.f.c r7 = r0.n     // Catch: java.lang.Exception -> L301
                a.a.a.f.c.g(r7, r4)     // Catch: java.lang.Exception -> L301
            L88:
                org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Exception -> L301
                r7.<init>()     // Catch: java.lang.Exception -> L301
                boolean r8 = r6.has(r3)     // Catch: java.lang.Exception -> L301
                if (r8 == 0) goto La9
                a.a.a.f.c r8 = r0.n     // Catch: java.lang.Exception -> L301
                java.lang.String r9 = r6.getString(r3)     // Catch: java.lang.Exception -> L301
                java.lang.String r10 = ";"
                java.lang.String[] r9 = r9.split(r10)     // Catch: java.lang.Exception -> L301
                a.a.a.f.c.a(r8, r9)     // Catch: java.lang.Exception -> L301
                java.lang.String r8 = r6.getString(r3)     // Catch: java.lang.Exception -> L301
                r7.put(r3, r8)     // Catch: java.lang.Exception -> L301
            La9:
                java.lang.String r3 = "bklist"
                boolean r3 = r6.has(r3)     // Catch: java.lang.Exception -> L301
                if (r3 == 0) goto Lc2
                java.lang.String r3 = "bklist"
                java.lang.String r3 = r6.getString(r3)     // Catch: java.lang.Exception -> L301
                java.lang.String r8 = ";"
                java.lang.String[] r3 = r3.split(r8)     // Catch: java.lang.Exception -> L301
                a.a.a.f.c r8 = r0.n     // Catch: java.lang.Exception -> L301
                r8.a(r3)     // Catch: java.lang.Exception -> L301
            Lc2:
                java.lang.String r3 = "para"
                boolean r3 = r6.has(r3)     // Catch: java.lang.Exception -> L301
                java.lang.String r8 = "minapn"
                java.lang.String r9 = "onlt"
                java.lang.String r10 = "oflp"
                java.lang.String r11 = "poiup"
                java.lang.String r12 = "addrup"
                java.lang.String r13 = "rgcgp"
                java.lang.String r14 = "4"
                java.lang.String r15 = "3"
                java.lang.String r4 = "2"
                r20 = r1
                java.lang.String r1 = "0"
                if (r3 == 0) goto L1e0
                java.lang.String r3 = "para"
                org.json.JSONObject r3 = r6.getJSONObject(r3)     // Catch: java.lang.Exception -> L301
                boolean r6 = r3.has(r13)     // Catch: java.lang.Exception -> L301
                if (r6 == 0) goto Lf8
                a.a.a.f.c r6 = r0.n     // Catch: java.lang.Exception -> L301
                r16 = r2
                int r2 = r3.getInt(r13)     // Catch: java.lang.Exception -> L301
                a.a.a.f.c.a(r6, r2)     // Catch: java.lang.Exception -> L301
                goto Lfa
            Lf8:
                r16 = r2
            Lfa:
                boolean r2 = r3.has(r12)     // Catch: java.lang.Exception -> L301
                if (r2 == 0) goto L109
                a.a.a.f.c r2 = r0.n     // Catch: java.lang.Exception -> L301
                int r6 = r3.getInt(r12)     // Catch: java.lang.Exception -> L301
                a.a.a.f.c.b(r2, r6)     // Catch: java.lang.Exception -> L301
            L109:
                boolean r2 = r3.has(r11)     // Catch: java.lang.Exception -> L301
                if (r2 == 0) goto L118
                a.a.a.f.c r2 = r0.n     // Catch: java.lang.Exception -> L301
                int r6 = r3.getInt(r11)     // Catch: java.lang.Exception -> L301
                a.a.a.f.c.c(r2, r6)     // Catch: java.lang.Exception -> L301
            L118:
                boolean r2 = r3.has(r10)     // Catch: java.lang.Exception -> L301
                if (r2 == 0) goto L177
                org.json.JSONObject r2 = r3.getJSONObject(r10)     // Catch: java.lang.Exception -> L301
                boolean r6 = r2.has(r1)     // Catch: java.lang.Exception -> L301
                if (r6 == 0) goto L136
                a.a.a.f.c r6 = r0.n     // Catch: java.lang.Exception -> L301
                r17 = r11
                r18 = r12
                double r11 = r2.getDouble(r1)     // Catch: java.lang.Exception -> L301
                a.a.a.f.c.a(r6, r11)     // Catch: java.lang.Exception -> L301
                goto L13a
            L136:
                r17 = r11
                r18 = r12
            L13a:
                boolean r6 = r2.has(r5)     // Catch: java.lang.Exception -> L301
                if (r6 == 0) goto L149
                a.a.a.f.c r6 = r0.n     // Catch: java.lang.Exception -> L301
                double r11 = r2.getDouble(r5)     // Catch: java.lang.Exception -> L301
                a.a.a.f.c.b(r6, r11)     // Catch: java.lang.Exception -> L301
            L149:
                boolean r6 = r2.has(r4)     // Catch: java.lang.Exception -> L301
                if (r6 == 0) goto L158
                a.a.a.f.c r6 = r0.n     // Catch: java.lang.Exception -> L301
                double r11 = r2.getDouble(r4)     // Catch: java.lang.Exception -> L301
                a.a.a.f.c.c(r6, r11)     // Catch: java.lang.Exception -> L301
            L158:
                boolean r6 = r2.has(r15)     // Catch: java.lang.Exception -> L301
                if (r6 == 0) goto L167
                a.a.a.f.c r6 = r0.n     // Catch: java.lang.Exception -> L301
                double r11 = r2.getDouble(r15)     // Catch: java.lang.Exception -> L301
                a.a.a.f.c.d(r6, r11)     // Catch: java.lang.Exception -> L301
            L167:
                boolean r6 = r2.has(r14)     // Catch: java.lang.Exception -> L301
                if (r6 == 0) goto L17b
                a.a.a.f.c r6 = r0.n     // Catch: java.lang.Exception -> L301
                double r11 = r2.getDouble(r14)     // Catch: java.lang.Exception -> L301
                a.a.a.f.c.e(r6, r11)     // Catch: java.lang.Exception -> L301
                goto L17b
            L177:
                r17 = r11
                r18 = r12
            L17b:
                boolean r2 = r3.has(r9)     // Catch: java.lang.Exception -> L301
                if (r2 == 0) goto L1d0
                org.json.JSONObject r2 = r3.getJSONObject(r9)     // Catch: java.lang.Exception -> L301
                boolean r6 = r2.has(r1)     // Catch: java.lang.Exception -> L301
                if (r6 == 0) goto L194
                a.a.a.f.c r6 = r0.n     // Catch: java.lang.Exception -> L301
                long r11 = r2.getLong(r1)     // Catch: java.lang.Exception -> L301
                a.a.a.f.c.a(r6, r11)     // Catch: java.lang.Exception -> L301
            L194:
                boolean r6 = r2.has(r5)     // Catch: java.lang.Exception -> L301
                if (r6 == 0) goto L1a3
                a.a.a.f.c r6 = r0.n     // Catch: java.lang.Exception -> L301
                long r11 = r2.getLong(r5)     // Catch: java.lang.Exception -> L301
                a.a.a.f.c.b(r6, r11)     // Catch: java.lang.Exception -> L301
            L1a3:
                boolean r6 = r2.has(r4)     // Catch: java.lang.Exception -> L301
                if (r6 == 0) goto L1b2
                a.a.a.f.c r6 = r0.n     // Catch: java.lang.Exception -> L301
                long r11 = r2.getLong(r4)     // Catch: java.lang.Exception -> L301
                a.a.a.f.c.c(r6, r11)     // Catch: java.lang.Exception -> L301
            L1b2:
                boolean r6 = r2.has(r15)     // Catch: java.lang.Exception -> L301
                if (r6 == 0) goto L1c1
                a.a.a.f.c r6 = r0.n     // Catch: java.lang.Exception -> L301
                long r11 = r2.getLong(r15)     // Catch: java.lang.Exception -> L301
                a.a.a.f.c.d(r6, r11)     // Catch: java.lang.Exception -> L301
            L1c1:
                boolean r6 = r2.has(r14)     // Catch: java.lang.Exception -> L301
                if (r6 == 0) goto L1d0
                a.a.a.f.c r6 = r0.n     // Catch: java.lang.Exception -> L301
                long r11 = r2.getLong(r14)     // Catch: java.lang.Exception -> L301
                a.a.a.f.c.e(r6, r11)     // Catch: java.lang.Exception -> L301
            L1d0:
                boolean r2 = r3.has(r8)     // Catch: java.lang.Exception -> L301
                if (r2 == 0) goto L1e6
                a.a.a.f.c r2 = r0.n     // Catch: java.lang.Exception -> L301
                int r3 = r3.getInt(r8)     // Catch: java.lang.Exception -> L301
                a.a.a.f.c.d(r2, r3)     // Catch: java.lang.Exception -> L301
                goto L1e6
            L1e0:
                r16 = r2
                r17 = r11
                r18 = r12
            L1e6:
                java.lang.String r2 = "ol"
                a.a.a.f.c r3 = r0.n     // Catch: java.lang.Exception -> L301
                boolean r3 = a.a.a.f.c.k(r3)     // Catch: java.lang.Exception -> L301
                r7.put(r2, r3)     // Catch: java.lang.Exception -> L301
                java.lang.String r2 = "olv2"
                a.a.a.f.c r3 = r0.n     // Catch: java.lang.Exception -> L301
                boolean r3 = a.a.a.f.c.v(r3)     // Catch: java.lang.Exception -> L301
                r7.put(r2, r3)     // Catch: java.lang.Exception -> L301
                java.lang.String r2 = "fl"
                a.a.a.f.c r3 = r0.n     // Catch: java.lang.Exception -> L301
                boolean r3 = a.a.a.f.c.q(r3)     // Catch: java.lang.Exception -> L301
                r7.put(r2, r3)     // Catch: java.lang.Exception -> L301
                java.lang.String r2 = "on"
                a.a.a.f.c r3 = r0.n     // Catch: java.lang.Exception -> L301
                boolean r3 = a.a.a.f.c.r(r3)     // Catch: java.lang.Exception -> L301
                r7.put(r2, r3)     // Catch: java.lang.Exception -> L301
                java.lang.String r2 = "wn"
                a.a.a.f.c r3 = r0.n     // Catch: java.lang.Exception -> L301
                boolean r3 = a.a.a.f.c.s(r3)     // Catch: java.lang.Exception -> L301
                r7.put(r2, r3)     // Catch: java.lang.Exception -> L301
                java.lang.String r2 = "oc"
                a.a.a.f.c r3 = r0.n     // Catch: java.lang.Exception -> L301
                boolean r3 = a.a.a.f.c.t(r3)     // Catch: java.lang.Exception -> L301
                r7.put(r2, r3)     // Catch: java.lang.Exception -> L301
                long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L301
                r0.k = r2     // Catch: java.lang.Exception -> L301
                java.lang.String r6 = "t"
                r7.put(r6, r2)     // Catch: java.lang.Exception -> L301
                r2 = r20
                r3 = r16
                r7.put(r3, r2)     // Catch: java.lang.Exception -> L301
                java.lang.String r2 = "rgcon"
                a.a.a.f.c r3 = r0.n     // Catch: java.lang.Exception -> L301
                boolean r3 = a.a.a.f.c.u(r3)     // Catch: java.lang.Exception -> L301
                r7.put(r2, r3)     // Catch: java.lang.Exception -> L301
                a.a.a.f.c r2 = r0.n     // Catch: java.lang.Exception -> L301
                int r2 = a.a.a.f.c.a(r2)     // Catch: java.lang.Exception -> L301
                r7.put(r13, r2)     // Catch: java.lang.Exception -> L301
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L301
                r2.<init>()     // Catch: java.lang.Exception -> L301
                a.a.a.f.c r3 = r0.n     // Catch: java.lang.Exception -> L301
                double r11 = a.a.a.f.c.d(r3)     // Catch: java.lang.Exception -> L301
                r2.put(r1, r11)     // Catch: java.lang.Exception -> L301
                a.a.a.f.c r3 = r0.n     // Catch: java.lang.Exception -> L301
                double r11 = a.a.a.f.c.e(r3)     // Catch: java.lang.Exception -> L301
                r2.put(r5, r11)     // Catch: java.lang.Exception -> L301
                a.a.a.f.c r3 = r0.n     // Catch: java.lang.Exception -> L301
                double r11 = a.a.a.f.c.f(r3)     // Catch: java.lang.Exception -> L301
                r2.put(r4, r11)     // Catch: java.lang.Exception -> L301
                a.a.a.f.c r3 = r0.n     // Catch: java.lang.Exception -> L301
                double r11 = a.a.a.f.c.g(r3)     // Catch: java.lang.Exception -> L301
                r2.put(r15, r11)     // Catch: java.lang.Exception -> L301
                a.a.a.f.c r3 = r0.n     // Catch: java.lang.Exception -> L301
                double r11 = a.a.a.f.c.h(r3)     // Catch: java.lang.Exception -> L301
                r2.put(r14, r11)     // Catch: java.lang.Exception -> L301
                r7.put(r10, r2)     // Catch: java.lang.Exception -> L301
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L301
                r2.<init>()     // Catch: java.lang.Exception -> L301
                a.a.a.f.c r3 = r0.n     // Catch: java.lang.Exception -> L301
                long r10 = a.a.a.f.c.i(r3)     // Catch: java.lang.Exception -> L301
                r2.put(r1, r10)     // Catch: java.lang.Exception -> L301
                a.a.a.f.c r1 = r0.n     // Catch: java.lang.Exception -> L301
                long r10 = a.a.a.f.c.j(r1)     // Catch: java.lang.Exception -> L301
                r2.put(r5, r10)     // Catch: java.lang.Exception -> L301
                a.a.a.f.c r1 = r0.n     // Catch: java.lang.Exception -> L301
                long r5 = a.a.a.f.c.l(r1)     // Catch: java.lang.Exception -> L301
                r2.put(r4, r5)     // Catch: java.lang.Exception -> L301
                a.a.a.f.c r1 = r0.n     // Catch: java.lang.Exception -> L301
                long r3 = a.a.a.f.c.m(r1)     // Catch: java.lang.Exception -> L301
                r2.put(r15, r3)     // Catch: java.lang.Exception -> L301
                a.a.a.f.c r1 = r0.n     // Catch: java.lang.Exception -> L301
                long r3 = a.a.a.f.c.n(r1)     // Catch: java.lang.Exception -> L301
                r2.put(r14, r3)     // Catch: java.lang.Exception -> L301
                r7.put(r9, r2)     // Catch: java.lang.Exception -> L301
                a.a.a.f.c r1 = r0.n     // Catch: java.lang.Exception -> L301
                int r1 = a.a.a.f.c.b(r1)     // Catch: java.lang.Exception -> L301
                r2 = r18
                r7.put(r2, r1)     // Catch: java.lang.Exception -> L301
                a.a.a.f.c r1 = r0.n     // Catch: java.lang.Exception -> L301
                int r1 = a.a.a.f.c.c(r1)     // Catch: java.lang.Exception -> L301
                r2 = r17
                r7.put(r2, r1)     // Catch: java.lang.Exception -> L301
                a.a.a.f.c r1 = r0.n     // Catch: java.lang.Exception -> L301
                int r1 = a.a.a.f.c.o(r1)     // Catch: java.lang.Exception -> L301
                r7.put(r8, r1)     // Catch: java.lang.Exception -> L301
                java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L301
                a.a.a.f.c r2 = r0.n     // Catch: java.lang.Exception -> L301
                a.a.a.f.d r2 = a.a.a.f.c.p(r2)     // Catch: java.lang.Exception -> L301
                java.io.File r2 = r2.h()     // Catch: java.lang.Exception -> L301
                java.lang.String r3 = "ofl.config"
                r1.<init>(r2, r3)     // Catch: java.lang.Exception -> L301
                boolean r2 = r1.exists()     // Catch: java.lang.Exception -> L301
                if (r2 != 0) goto L2f1
                r1.createNewFile()     // Catch: java.lang.Exception -> L301
            L2f1:
                java.io.FileWriter r2 = new java.io.FileWriter     // Catch: java.lang.Exception -> L301
                r2.<init>(r1)     // Catch: java.lang.Exception -> L301
                java.lang.String r1 = r7.toString()     // Catch: java.lang.Exception -> L301
                r2.write(r1)     // Catch: java.lang.Exception -> L301
                r2.close()     // Catch: java.lang.Exception -> L301
                goto L30d
            L301:
                int r1 = r0.i
                r2 = 1
                int r1 = r1 + r2
                r0.i = r1
                long r1 = java.lang.System.currentTimeMillis()
                r0.j = r1
            L30d:
                r1 = 0
                r0.l = r1
                return
        }

        public final void b() {
                r16 = this;
                r0 = r16
                java.lang.String r1 = "minapn"
                java.lang.String r2 = "onlt"
                java.lang.String r3 = "oflp"
                java.lang.String r4 = "poiup"
                java.lang.String r5 = "addrup"
                java.lang.String r6 = "rgcon"
                java.lang.String r7 = "rgcgp"
                java.lang.String r8 = "cplist"
                java.lang.String r9 = "ol"
                boolean r10 = r0.l
                if (r10 == 0) goto L19
                return
            L19:
                r12 = -1
                java.io.File r14 = new java.io.File     // Catch: java.lang.Exception -> L1ca
                a.a.a.f.c r15 = r0.n     // Catch: java.lang.Exception -> L1ca
                a.a.a.f.d r15 = a.a.a.f.c.p(r15)     // Catch: java.lang.Exception -> L1ca
                java.io.File r15 = r15.h()     // Catch: java.lang.Exception -> L1ca
                java.lang.String r10 = "ofl.config"
                r14.<init>(r15, r10)     // Catch: java.lang.Exception -> L1ca
                long r10 = r0.k     // Catch: java.lang.Exception -> L1ca
                int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r10 != 0) goto L1ab
                boolean r10 = r14.exists()     // Catch: java.lang.Exception -> L1ca
                if (r10 == 0) goto L1ab
                java.util.Scanner r10 = new java.util.Scanner     // Catch: java.lang.Exception -> L1ca
                r10.<init>(r14)     // Catch: java.lang.Exception -> L1ca
                java.lang.String r11 = r10.next()     // Catch: java.lang.Exception -> L1ca
                r10.close()     // Catch: java.lang.Exception -> L1ca
                org.json.JSONObject r10 = new org.json.JSONObject     // Catch: java.lang.Exception -> L1ca
                r10.<init>(r11)     // Catch: java.lang.Exception -> L1ca
                a.a.a.f.c r11 = r0.n     // Catch: java.lang.Exception -> L1ca
                boolean r15 = r10.getBoolean(r9)     // Catch: java.lang.Exception -> L1ca
                a.a.a.f.c.a(r11, r15)     // Catch: java.lang.Exception -> L1ca
                a.a.a.f.c r11 = r0.n     // Catch: java.lang.Exception -> L1ca
                java.lang.String r15 = "fl"
                boolean r15 = r10.getBoolean(r15)     // Catch: java.lang.Exception -> L1ca
                a.a.a.f.c.b(r11, r15)     // Catch: java.lang.Exception -> L1ca
                a.a.a.f.c r11 = r0.n     // Catch: java.lang.Exception -> L1ca
                java.lang.String r15 = "on"
                boolean r15 = r10.getBoolean(r15)     // Catch: java.lang.Exception -> L1ca
                a.a.a.f.c.c(r11, r15)     // Catch: java.lang.Exception -> L1ca
                a.a.a.f.c r11 = r0.n     // Catch: java.lang.Exception -> L1ca
                java.lang.String r15 = "wn"
                boolean r15 = r10.getBoolean(r15)     // Catch: java.lang.Exception -> L1ca
                a.a.a.f.c.d(r11, r15)     // Catch: java.lang.Exception -> L1ca
                a.a.a.f.c r11 = r0.n     // Catch: java.lang.Exception -> L1ca
                java.lang.String r15 = "oc"
                boolean r15 = r10.getBoolean(r15)     // Catch: java.lang.Exception -> L1ca
                a.a.a.f.c.e(r11, r15)     // Catch: java.lang.Exception -> L1ca
                java.lang.String r11 = "t"
                long r12 = r10.getLong(r11)     // Catch: java.lang.Exception -> L1ca
                r0.k = r12     // Catch: java.lang.Exception -> L1ca
                boolean r9 = r10.has(r9)     // Catch: java.lang.Exception -> L1ca
                if (r9 == 0) goto L97
                a.a.a.f.c r9 = r0.n     // Catch: java.lang.Exception -> L1ca
                java.lang.String r11 = "olv2"
                boolean r11 = r10.getBoolean(r11)     // Catch: java.lang.Exception -> L1ca
                a.a.a.f.c.g(r9, r11)     // Catch: java.lang.Exception -> L1ca
            L97:
                boolean r9 = r10.has(r8)     // Catch: java.lang.Exception -> L1ca
                if (r9 == 0) goto Lac
                a.a.a.f.c r9 = r0.n     // Catch: java.lang.Exception -> L1ca
                java.lang.String r8 = r10.getString(r8)     // Catch: java.lang.Exception -> L1ca
                java.lang.String r11 = ";"
                java.lang.String[] r8 = r8.split(r11)     // Catch: java.lang.Exception -> L1ca
                a.a.a.f.c.a(r9, r8)     // Catch: java.lang.Exception -> L1ca
            Lac:
                boolean r8 = r10.has(r7)     // Catch: java.lang.Exception -> L1ca
                if (r8 == 0) goto Lbb
                a.a.a.f.c r8 = r0.n     // Catch: java.lang.Exception -> L1ca
                int r7 = r10.getInt(r7)     // Catch: java.lang.Exception -> L1ca
                a.a.a.f.c.a(r8, r7)     // Catch: java.lang.Exception -> L1ca
            Lbb:
                boolean r7 = r10.has(r6)     // Catch: java.lang.Exception -> L1ca
                if (r7 == 0) goto Lca
                a.a.a.f.c r7 = r0.n     // Catch: java.lang.Exception -> L1ca
                boolean r6 = r10.getBoolean(r6)     // Catch: java.lang.Exception -> L1ca
                a.a.a.f.c.f(r7, r6)     // Catch: java.lang.Exception -> L1ca
            Lca:
                boolean r6 = r10.has(r5)     // Catch: java.lang.Exception -> L1ca
                if (r6 == 0) goto Ld9
                a.a.a.f.c r6 = r0.n     // Catch: java.lang.Exception -> L1ca
                int r5 = r10.getInt(r5)     // Catch: java.lang.Exception -> L1ca
                a.a.a.f.c.b(r6, r5)     // Catch: java.lang.Exception -> L1ca
            Ld9:
                boolean r5 = r10.has(r4)     // Catch: java.lang.Exception -> L1ca
                if (r5 == 0) goto Le8
                a.a.a.f.c r5 = r0.n     // Catch: java.lang.Exception -> L1ca
                int r4 = r10.getInt(r4)     // Catch: java.lang.Exception -> L1ca
                a.a.a.f.c.c(r5, r4)     // Catch: java.lang.Exception -> L1ca
            Le8:
                boolean r4 = r10.has(r3)     // Catch: java.lang.Exception -> L1ca
                java.lang.String r5 = "4"
                java.lang.String r6 = "3"
                java.lang.String r7 = "2"
                java.lang.String r8 = "1"
                java.lang.String r9 = "0"
                if (r4 == 0) goto L147
                org.json.JSONObject r3 = r10.getJSONObject(r3)     // Catch: java.lang.Exception -> L1ca
                boolean r4 = r3.has(r9)     // Catch: java.lang.Exception -> L1ca
                if (r4 == 0) goto L10b
                a.a.a.f.c r4 = r0.n     // Catch: java.lang.Exception -> L1ca
                double r11 = r3.getDouble(r9)     // Catch: java.lang.Exception -> L1ca
                a.a.a.f.c.a(r4, r11)     // Catch: java.lang.Exception -> L1ca
            L10b:
                boolean r4 = r3.has(r8)     // Catch: java.lang.Exception -> L1ca
                if (r4 == 0) goto L11a
                a.a.a.f.c r4 = r0.n     // Catch: java.lang.Exception -> L1ca
                double r11 = r3.getDouble(r8)     // Catch: java.lang.Exception -> L1ca
                a.a.a.f.c.b(r4, r11)     // Catch: java.lang.Exception -> L1ca
            L11a:
                boolean r4 = r3.has(r7)     // Catch: java.lang.Exception -> L1ca
                if (r4 == 0) goto L129
                a.a.a.f.c r4 = r0.n     // Catch: java.lang.Exception -> L1ca
                double r11 = r3.getDouble(r7)     // Catch: java.lang.Exception -> L1ca
                a.a.a.f.c.c(r4, r11)     // Catch: java.lang.Exception -> L1ca
            L129:
                boolean r4 = r3.has(r6)     // Catch: java.lang.Exception -> L1ca
                if (r4 == 0) goto L138
                a.a.a.f.c r4 = r0.n     // Catch: java.lang.Exception -> L1ca
                double r11 = r3.getDouble(r6)     // Catch: java.lang.Exception -> L1ca
                a.a.a.f.c.d(r4, r11)     // Catch: java.lang.Exception -> L1ca
            L138:
                boolean r4 = r3.has(r5)     // Catch: java.lang.Exception -> L1ca
                if (r4 == 0) goto L147
                a.a.a.f.c r4 = r0.n     // Catch: java.lang.Exception -> L1ca
                double r11 = r3.getDouble(r5)     // Catch: java.lang.Exception -> L1ca
                a.a.a.f.c.e(r4, r11)     // Catch: java.lang.Exception -> L1ca
            L147:
                boolean r3 = r10.has(r2)     // Catch: java.lang.Exception -> L1ca
                if (r3 == 0) goto L19c
                org.json.JSONObject r2 = r10.getJSONObject(r2)     // Catch: java.lang.Exception -> L1ca
                boolean r3 = r2.has(r9)     // Catch: java.lang.Exception -> L1ca
                if (r3 == 0) goto L160
                a.a.a.f.c r3 = r0.n     // Catch: java.lang.Exception -> L1ca
                long r11 = r2.getLong(r9)     // Catch: java.lang.Exception -> L1ca
                a.a.a.f.c.a(r3, r11)     // Catch: java.lang.Exception -> L1ca
            L160:
                boolean r3 = r2.has(r8)     // Catch: java.lang.Exception -> L1ca
                if (r3 == 0) goto L16f
                a.a.a.f.c r3 = r0.n     // Catch: java.lang.Exception -> L1ca
                long r8 = r2.getLong(r8)     // Catch: java.lang.Exception -> L1ca
                a.a.a.f.c.b(r3, r8)     // Catch: java.lang.Exception -> L1ca
            L16f:
                boolean r3 = r2.has(r7)     // Catch: java.lang.Exception -> L1ca
                if (r3 == 0) goto L17e
                a.a.a.f.c r3 = r0.n     // Catch: java.lang.Exception -> L1ca
                long r7 = r2.getLong(r7)     // Catch: java.lang.Exception -> L1ca
                a.a.a.f.c.c(r3, r7)     // Catch: java.lang.Exception -> L1ca
            L17e:
                boolean r3 = r2.has(r6)     // Catch: java.lang.Exception -> L1ca
                if (r3 == 0) goto L18d
                a.a.a.f.c r3 = r0.n     // Catch: java.lang.Exception -> L1ca
                long r6 = r2.getLong(r6)     // Catch: java.lang.Exception -> L1ca
                a.a.a.f.c.d(r3, r6)     // Catch: java.lang.Exception -> L1ca
            L18d:
                boolean r3 = r2.has(r5)     // Catch: java.lang.Exception -> L1ca
                if (r3 == 0) goto L19c
                a.a.a.f.c r3 = r0.n     // Catch: java.lang.Exception -> L1ca
                long r4 = r2.getLong(r5)     // Catch: java.lang.Exception -> L1ca
                a.a.a.f.c.e(r3, r4)     // Catch: java.lang.Exception -> L1ca
            L19c:
                boolean r2 = r10.has(r1)     // Catch: java.lang.Exception -> L1ca
                if (r2 == 0) goto L1ab
                a.a.a.f.c r2 = r0.n     // Catch: java.lang.Exception -> L1ca
                int r1 = r10.getInt(r1)     // Catch: java.lang.Exception -> L1ca
                a.a.a.f.c.d(r2, r1)     // Catch: java.lang.Exception -> L1ca
            L1ab:
                long r1 = r0.k     // Catch: java.lang.Exception -> L1ca
                r3 = -1
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 != 0) goto L1b6
                r14.exists()     // Catch: java.lang.Exception -> L1ca
            L1b6:
                long r1 = r0.k     // Catch: java.lang.Exception -> L1ca
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 == 0) goto L1ca
                r3 = 86400000(0x5265c00, double:4.2687272E-316)
                long r1 = r1 + r3
                long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L1ca
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 > 0) goto L1ca
                r10 = 1
                goto L1cb
            L1ca:
                r10 = 0
            L1cb:
                long r1 = r0.k
                r3 = -1
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 == 0) goto L1d5
                if (r10 == 0) goto L202
            L1d5:
                boolean r1 = r16.c()
                if (r1 == 0) goto L202
                a.a.a.f.c r1 = r0.n
                a.a.a.f.d r1 = a.a.a.f.c.p(r1)
                android.content.Context r1 = r1.d()
                boolean r1 = a.a.a.i.i.h(r1)
                if (r1 == 0) goto L202
                r1 = 1
                r0.l = r1
                boolean r1 = a.a.a.i.i.l()
                if (r1 != 0) goto L202
                android.os.Handler r1 = a.a.a.h.a.e()
                a.a.a.f.c$b$a r2 = new a.a.a.f.c$b$a
                r2.<init>(r0)
                r3 = 1000(0x3e8, double:4.94E-321)
                r1.postDelayed(r2, r3)
            L202:
                return
        }

        public final boolean c() {
                r7 = this;
                int r0 = r7.i
                r1 = 1
                r2 = 0
                r3 = 2
                if (r0 >= r3) goto L8
                goto L1e
            L8:
                long r3 = r7.j
                r5 = 86400000(0x5265c00, double:4.2687272E-316)
                long r3 = r3 + r5
                long r5 = java.lang.System.currentTimeMillis()
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L1d
                r7.i = r2
                r2 = -1
                r7.j = r2
                goto L1e
            L1d:
                r1 = r2
            L1e:
                return r1
        }
    }

    public c(a.a.a.f.d r3, android.database.sqlite.SQLiteDatabase r4) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.u = r0
            r0 = 8000(0x1f40, double:3.9525E-320)
            r2.v = r0
            r0 = 5000(0x1388, double:2.4703E-320)
            r2.w = r0
            r2.x = r0
            r2.y = r0
            r2.z = r0
            r2.f225a = r3
            r3 = 0
            r2.d = r3
            r2.e = r3
            r2.f = r3
            r2.g = r3
            r2.h = r3
            r2.j = r3
            r2.k = r3
            r0 = 6
            r2.l = r0
            r0 = 30
            r2.m = r0
            r2.n = r0
            r0 = 0
            r2.o = r0
            r2.p = r0
            r2.q = r0
            r2.r = r0
            r2.s = r0
            r0 = 8
            r2.t = r0
            java.lang.String[] r3 = new java.lang.String[r3]
            r2.i = r3
            r2.f226b = r4
            a.a.a.f.c$b r3 = new a.a.a.f.c$b
            r0 = 0
            r3.<init>(r2, r0)
            r2.f227c = r3
            if (r4 == 0) goto L59
            boolean r3 = r4.isOpen()
            if (r3 == 0) goto L59
            java.lang.String r3 = "CREATE TABLE IF NOT EXISTS BLACK (name VARCHAR(100) PRIMARY KEY);"
            r4.execSQL(r3)     // Catch: java.lang.Exception -> L59
        L59:
            r2.a()
            return
    }

    public static /* synthetic */ double a(a.a.a.f.c r0, double r1) {
            r0.o = r1
            return r1
    }

    public static /* synthetic */ int a(a.a.a.f.c r0) {
            int r0 = r0.l
            return r0
    }

    public static /* synthetic */ int a(a.a.a.f.c r0, int r1) {
            r0.l = r1
            return r1
    }

    public static /* synthetic */ long a(a.a.a.f.c r0, long r1) {
            r0.z = r1
            return r1
    }

    public static /* synthetic */ boolean a(a.a.a.f.c r0, boolean r1) {
            r0.d = r1
            return r1
    }

    public static /* synthetic */ java.lang.String[] a(a.a.a.f.c r0, java.lang.String[] r1) {
            r0.i = r1
            return r1
    }

    public static /* synthetic */ double b(a.a.a.f.c r0, double r1) {
            r0.p = r1
            return r1
    }

    public static /* synthetic */ int b(a.a.a.f.c r0) {
            int r0 = r0.n
            return r0
    }

    public static /* synthetic */ int b(a.a.a.f.c r0, int r1) {
            r0.n = r1
            return r1
    }

    public static /* synthetic */ long b(a.a.a.f.c r0, long r1) {
            r0.y = r1
            return r1
    }

    public static /* synthetic */ boolean b(a.a.a.f.c r0, boolean r1) {
            r0.e = r1
            return r1
    }

    public static /* synthetic */ double c(a.a.a.f.c r0, double r1) {
            r0.q = r1
            return r1
    }

    public static /* synthetic */ int c(a.a.a.f.c r0) {
            int r0 = r0.m
            return r0
    }

    public static /* synthetic */ int c(a.a.a.f.c r0, int r1) {
            r0.m = r1
            return r1
    }

    public static /* synthetic */ long c(a.a.a.f.c r0, long r1) {
            r0.v = r1
            return r1
    }

    public static /* synthetic */ boolean c(a.a.a.f.c r0, boolean r1) {
            r0.f = r1
            return r1
    }

    public static /* synthetic */ double d(a.a.a.f.c r2) {
            double r0 = r2.o
            return r0
    }

    public static /* synthetic */ double d(a.a.a.f.c r0, double r1) {
            r0.r = r1
            return r1
    }

    public static /* synthetic */ int d(a.a.a.f.c r0, int r1) {
            r0.t = r1
            return r1
    }

    public static /* synthetic */ long d(a.a.a.f.c r0, long r1) {
            r0.w = r1
            return r1
    }

    public static /* synthetic */ boolean d(a.a.a.f.c r0, boolean r1) {
            r0.g = r1
            return r1
    }

    public static /* synthetic */ double e(a.a.a.f.c r2) {
            double r0 = r2.p
            return r0
    }

    public static /* synthetic */ double e(a.a.a.f.c r0, double r1) {
            r0.s = r1
            return r1
    }

    public static /* synthetic */ long e(a.a.a.f.c r0, long r1) {
            r0.x = r1
            return r1
    }

    public static /* synthetic */ boolean e(a.a.a.f.c r0, boolean r1) {
            r0.h = r1
            return r1
    }

    public static /* synthetic */ double f(a.a.a.f.c r2) {
            double r0 = r2.q
            return r0
    }

    public static /* synthetic */ boolean f(a.a.a.f.c r0, boolean r1) {
            r0.j = r1
            return r1
    }

    public static /* synthetic */ double g(a.a.a.f.c r2) {
            double r0 = r2.r
            return r0
    }

    public static /* synthetic */ boolean g(a.a.a.f.c r0, boolean r1) {
            r0.k = r1
            return r1
    }

    public static /* synthetic */ double h(a.a.a.f.c r2) {
            double r0 = r2.s
            return r0
    }

    public static /* synthetic */ long i(a.a.a.f.c r2) {
            long r0 = r2.z
            return r0
    }

    public static /* synthetic */ long j(a.a.a.f.c r2) {
            long r0 = r2.y
            return r0
    }

    public static /* synthetic */ boolean k(a.a.a.f.c r0) {
            boolean r0 = r0.d
            return r0
    }

    public static /* synthetic */ long l(a.a.a.f.c r2) {
            long r0 = r2.v
            return r0
    }

    public static /* synthetic */ long m(a.a.a.f.c r2) {
            long r0 = r2.w
            return r0
    }

    public static /* synthetic */ long n(a.a.a.f.c r2) {
            long r0 = r2.x
            return r0
    }

    public static /* synthetic */ int o(a.a.a.f.c r0) {
            int r0 = r0.t
            return r0
    }

    public static /* synthetic */ a.a.a.f.d p(a.a.a.f.c r0) {
            a.a.a.f.d r0 = r0.f225a
            return r0
    }

    public static /* synthetic */ boolean q(a.a.a.f.c r0) {
            boolean r0 = r0.e
            return r0
    }

    public static /* synthetic */ boolean r(a.a.a.f.c r0) {
            boolean r0 = r0.f
            return r0
    }

    public static /* synthetic */ boolean s(a.a.a.f.c r0) {
            boolean r0 = r0.g
            return r0
    }

    public static /* synthetic */ boolean t(a.a.a.f.c r0) {
            boolean r0 = r0.h
            return r0
    }

    public static /* synthetic */ boolean u(a.a.a.f.c r0) {
            boolean r0 = r0.j
            return r0
    }

    public static /* synthetic */ boolean v(a.a.a.f.c r0) {
            boolean r0 = r0.k
            return r0
    }

    public long a(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "2G"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lb
            long r1 = r1.v
            goto L39
        Lb:
            java.lang.String r0 = "3G"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L16
            long r1 = r1.w
            goto L39
        L16:
            java.lang.String r0 = "4G"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L21
            long r1 = r1.x
            goto L39
        L21:
            java.lang.String r0 = "WIFI"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L2c
            long r1 = r1.y
            goto L39
        L2c:
            java.lang.String r0 = "unknown"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L37
            long r1 = r1.z
            goto L39
        L37:
            r1 = 5000(0x1388, double:2.4703E-320)
        L39:
            return r1
    }

    public void a() {
            r0 = this;
            a.a.a.f.c$b r0 = r0.f227c
            if (r0 == 0) goto L7
            a.a.a.f.c.b.a(r0)
        L7:
            return
    }

    public void a(java.lang.String[] r5) {
            r4 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r1 = 0
            r2 = r1
        L7:
            int r3 = r5.length
            if (r2 >= r3) goto L23
            if (r2 <= 0) goto L11
            java.lang.String r3 = ","
            r0.append(r3)
        L11:
            java.lang.String r3 = "(\""
            r0.append(r3)
            r3 = r5[r2]
            r0.append(r3)
            java.lang.String r3 = "\")"
            r0.append(r3)
            int r2 = r2 + 1
            goto L7
        L23:
            android.database.sqlite.SQLiteDatabase r5 = r4.f226b
            if (r5 == 0) goto L49
            boolean r5 = r5.isOpen()
            if (r5 == 0) goto L49
            int r5 = r0.length()
            if (r5 <= 0) goto L49
            java.util.Locale r5 = java.util.Locale.US
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r0 = r0.toString()
            r2[r1] = r0
            java.lang.String r0 = "INSERT OR IGNORE INTO BLACK VALUES %s;"
            java.lang.String r5 = java.lang.String.format(r5, r0, r2)
            android.database.sqlite.SQLiteDatabase r4 = r4.f226b     // Catch: java.lang.Exception -> L49
            r4.execSQL(r5)     // Catch: java.lang.Exception -> L49
        L49:
            return
    }

    public int b() {
            r0 = this;
            int r0 = r0.n
            return r0
    }

    public int c() {
            r0 = this;
            int r0 = r0.l
            return r0
    }

    public int d() {
            r0 = this;
            int r0 = r0.t
            return r0
    }

    public int e() {
            r0 = this;
            int r0 = r0.m
            return r0
    }

    public double f() {
            r2 = this;
            double r0 = r2.q
            return r0
    }

    public double g() {
            r2 = this;
            double r0 = r2.r
            return r0
    }

    public double h() {
            r2 = this;
            double r0 = r2.s
            return r0
    }

    public double i() {
            r2 = this;
            double r0 = r2.o
            return r0
    }

    public double j() {
            r2 = this;
            double r0 = r2.p
            return r0
    }

    public java.lang.String[] k() {
            r0 = this;
            java.lang.String[] r0 = r0.i
            return r0
    }

    public boolean l() {
            r0 = this;
            boolean r0 = r0.e
            return r0
    }

    public boolean m() {
            r0 = this;
            boolean r0 = r0.d
            return r0
    }

    public boolean n() {
            r0 = this;
            boolean r0 = r0.j
            return r0
    }

    public boolean o() {
            r0 = this;
            boolean r0 = r0.u
            return r0
    }

    public boolean p() {
            r0 = this;
            boolean r0 = r0.g
            return r0
    }

    public boolean q() {
            r0 = this;
            boolean r0 = r0.f
            return r0
    }
}
