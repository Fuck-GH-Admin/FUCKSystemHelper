package a.a.a.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static java.lang.String l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.a.a.g.k f48a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a.a.a.g.a f49b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.util.HashSet<java.lang.String> f50c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final android.os.Handler g;
    public java.lang.String h;
    public java.lang.String i;
    public boolean j;
    public long k;

    public static class a extends a.a.a.i.g {
        public long i;
        public int j;

        public a() {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.d = r0
                return
        }

        @Override // a.a.a.i.g
        public void a() {
                r5 = this;
                java.lang.StringBuffer r0 = new java.lang.StringBuffer
                r1 = 256(0x100, float:3.59E-43)
                r0.<init>(r1)
                java.lang.String r1 = "os=A"
                r0.append(r1)
                int r1 = android.os.Build.VERSION.SDK_INT
                r0.append(r1)
                java.lang.String r1 = "&prod="
                r0.append(r1)
                java.lang.String r1 = a.a.a.i.b.f
                r0.append(r1)
                java.lang.String r1 = "&resid="
                r0.append(r1)
                java.lang.String r1 = "12"
                r0.append(r1)
                java.lang.String r1 = a.a.a.i.b.j
                if (r1 == 0) goto L2a
                goto L2c
            L2a:
                java.lang.String r1 = ""
            L2c:
                java.lang.String r2 = "&mapver="
                r0.append(r2)
                r0.append(r1)
                android.content.Context r1 = com.baidu.location.f.c()
                java.lang.String r1 = a.a.a.i.i.d(r1)
                r0.append(r1)
                java.lang.String r1 = "&cu="
                r0.append(r1)
                a.a.a.i.b r1 = a.a.a.i.b.e()
                java.lang.String r1 = r1.b()
                r0.append(r1)
                java.lang.String r1 = "&error="
                r0.append(r1)
                int r1 = r5.j
                r0.append(r1)
                long r1 = r5.i
                r3 = 0
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 <= 0) goto L6b
                java.lang.String r1 = "&tm="
                r0.append(r1)
                long r1 = r5.i
                r0.append(r1)
            L6b:
                java.lang.String r0 = r0.toString()
                java.lang.String r0 = com.baidu.location.Jni.f(r0)
                java.util.Map<java.lang.String, java.lang.Object> r1 = r5.d
                java.lang.String r2 = "info"
                r1.put(r2, r0)
                java.util.Map<java.lang.String, java.lang.Object> r5 = r5.d
                java.lang.String r0 = "qt"
                java.lang.String r1 = "monitor"
                r5.put(r0, r1)
                return
        }

        @Override // a.a.a.i.g
        public void a(boolean r1) {
                r0 = this;
                java.util.Map<java.lang.String, java.lang.Object> r0 = r0.d
                if (r0 == 0) goto L7
                r0.clear()
            L7:
                return
        }
    }

    public class b extends android.os.Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.a.a.b.m f51a;

        public b(a.a.a.b.m r1) {
                r0 = this;
                r0.f51a = r1
                r0.<init>()
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r3) {
                r2 = this;
                boolean r0 = com.baidu.location.f.f
                if (r0 != 0) goto L5
                return
            L5:
                int r0 = r3.what
                r1 = 21
                if (r0 == r1) goto L1a
                r3 = 62
                if (r0 == r3) goto L14
                r3 = 63
                if (r0 == r3) goto L14
                goto L1f
            L14:
                a.a.a.b.m r2 = r2.f51a
                r2.b()
                goto L1f
            L1a:
                a.a.a.b.m r2 = r2.f51a
                r2.a(r3)
            L1f:
                return
        }
    }

    public class c extends a.a.a.i.g {
        public java.lang.String i;
        public java.lang.String j;
        public long k;
        public long l;
        public final /* synthetic */ a.a.a.b.m m;

        public c(a.a.a.b.m r3) {
                r2 = this;
                r2.m = r3
                r2.<init>()
                r3 = 0
                r2.i = r3
                r2.j = r3
                r0 = 0
                r2.k = r0
                r2.l = r0
                java.util.HashMap r3 = new java.util.HashMap
                r3.<init>()
                r2.d = r3
                return
        }

        @Override // a.a.a.i.g
        public void a() {
                r6 = this;
                boolean r0 = a.a.a.i.i.f
                r1 = 1
                r2 = 0
                if (r0 != 0) goto La
                boolean r0 = a.a.a.i.i.h
                if (r0 == 0) goto L48
            La:
                a.a.a.b.m r0 = r6.m
                java.lang.String r0 = a.a.a.b.m.a(r0)
                if (r0 == 0) goto L48
                a.a.a.b.m r0 = r6.m
                java.lang.String r0 = a.a.a.b.m.b(r0)
                if (r0 == 0) goto L48
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = r6.j
                r0.append(r3)
                java.util.Locale r3 = java.util.Locale.CHINA
                r4 = 2
                java.lang.Object[] r4 = new java.lang.Object[r4]
                a.a.a.b.m r5 = r6.m
                java.lang.String r5 = a.a.a.b.m.a(r5)
                r4[r2] = r5
                a.a.a.b.m r5 = r6.m
                java.lang.String r5 = a.a.a.b.m.b(r5)
                r4[r1] = r5
                java.lang.String r5 = "&ki=%s&sn=%s"
                java.lang.String r3 = java.lang.String.format(r3, r5, r4)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                r6.j = r0
            L48:
                a.a.a.b.n r0 = a.a.a.b.n.b()
                boolean r0 = r0.a()
                if (r0 == 0) goto L67
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = r6.j
                r0.append(r3)
                java.lang.String r3 = "&enc=2"
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                r6.j = r0
            L67:
                a.a.a.g.f r0 = a.a.a.g.f.w()
                java.lang.String r0 = r0.k()
                if (r0 == 0) goto L77
                java.lang.String r0 = com.baidu.location.Jni.f(r0)
                r6.f = r0
            L77:
                java.lang.String r0 = r6.j
                java.lang.String r0 = com.baidu.location.Jni.f(r0)
                r3 = 0
                r6.j = r3
                java.lang.String r3 = r6.i
                if (r3 != 0) goto L8a
                java.lang.String r3 = a.a.a.b.y.f()
                r6.i = r3
            L8a:
                java.util.Map<java.lang.String, java.lang.Object> r3 = r6.d
                java.lang.String r4 = "bloc"
                r3.put(r4, r0)
                java.lang.String r0 = r6.i
                if (r0 == 0) goto L9c
                java.util.Map<java.lang.String, java.lang.Object> r3 = r6.d
                java.lang.String r4 = "up"
                r3.put(r4, r0)
            L9c:
                java.util.Locale r0 = java.util.Locale.CHINA
                java.lang.Object[] r1 = new java.lang.Object[r1]
                long r3 = java.lang.System.currentTimeMillis()
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                r1[r2] = r3
                java.lang.String r2 = "%d"
                java.lang.String r0 = java.lang.String.format(r0, r2, r1)
                java.util.Map<java.lang.String, java.lang.Object> r6 = r6.d
                java.lang.String r1 = "trtm"
                r6.put(r1, r0)
                return
        }

        public void a(java.lang.String r3, long r4) {
                r2 = this;
                r2.j = r3
                long r0 = java.lang.System.currentTimeMillis()
                r2.l = r0
                r2.k = r4
                a.a.a.b.w r3 = a.a.a.b.w.d()
                java.util.concurrent.ExecutorService r3 = r3.a()
                boolean r4 = a.a.a.i.i.l()
                if (r4 == 0) goto L1e
                r4 = 0
                r5 = 0
                r2.a(r3, r4, r5)
                goto L2b
            L1e:
                if (r3 == 0) goto L26
                java.lang.String r4 = a.a.a.i.d.f324b
                r2.a(r3, r4)
                goto L2b
            L26:
                java.lang.String r3 = a.a.a.i.d.f324b
                r2.a(r3)
            L2b:
                return
        }

        @Override // a.a.a.i.g
        public void a(boolean r12) {
                r11 = this;
                java.lang.String r0 = "content"
                java.lang.String r1 = "net_loc_save"
                java.lang.String r2 = "enc"
                java.lang.String r3 = "HttpStatus error"
                r4 = 63
                if (r12 == 0) goto L109
                java.lang.String r12 = r11.f339c
                if (r12 == 0) goto L109
                a.a.a.b.m.l = r12     // Catch: java.lang.Exception -> L109
                boolean r5 = r12.contains(r2)     // Catch: java.lang.Exception -> L109
                if (r5 == 0) goto L3e
                a.a.a.b.n r5 = a.a.a.b.n.b()     // Catch: java.lang.Exception -> L109
                boolean r5 = r5.a()     // Catch: java.lang.Exception -> L109
                if (r5 == 0) goto L3e
                org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Exception -> L3a
                r5.<init>(r12)     // Catch: java.lang.Exception -> L3a
                boolean r6 = r5.has(r2)     // Catch: java.lang.Exception -> L3a
                if (r6 == 0) goto L3e
                java.lang.String r2 = r5.getString(r2)     // Catch: java.lang.Exception -> L3a
                a.a.a.b.n r5 = a.a.a.b.n.b()     // Catch: java.lang.Exception -> L3a
                java.lang.String r12 = r5.a(r2)     // Catch: java.lang.Exception -> L3a
                goto L3e
            L3a:
                r2 = move-exception
                r2.printStackTrace()     // Catch: java.lang.Exception -> L109
            L3e:
                boolean r2 = r12.contains(r1)     // Catch: java.lang.Exception -> L109
                r5 = 0
                r6 = 1
                if (r2 == 0) goto L63
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L63
                r2.<init>(r12)     // Catch: java.lang.Exception -> L63
                boolean r7 = r2.has(r0)     // Catch: java.lang.Exception -> L63
                if (r7 == 0) goto L56
                org.json.JSONObject r0 = r2.getJSONObject(r0)     // Catch: java.lang.Exception -> L63
                goto L57
            L56:
                r0 = r5
            L57:
                if (r0 == 0) goto L63
                boolean r2 = r0.has(r1)     // Catch: java.lang.Exception -> L63
                if (r2 == 0) goto L63
                int r6 = r0.optInt(r1, r6)     // Catch: java.lang.Exception -> L63
            L63:
                com.baidu.location.c r0 = new com.baidu.location.c     // Catch: java.lang.Exception -> La6
                r0.<init>(r12)     // Catch: java.lang.Exception -> La6
                r0.r()     // Catch: java.lang.Exception -> La6
                boolean r1 = a.a.a.i.i.k()     // Catch: java.lang.Exception -> La6
                r2 = 161(0xa1, float:2.26E-43)
                if (r1 == 0) goto L83
                int r1 = r0.r()     // Catch: java.lang.Exception -> La6
                if (r1 != r2) goto L83
                r1 = 160(0xa0, float:2.24E-43)
                r0.h(r1)     // Catch: java.lang.Exception -> La6
                r1 = 1157234688(0x44fa0000, float:2000.0)
                r0.b(r1)     // Catch: java.lang.Exception -> La6
            L83:
                int r1 = r0.r()     // Catch: java.lang.Exception -> La6
                if (r1 != r2) goto L90
                a.a.a.b.l r1 = a.a.a.b.l.f()     // Catch: java.lang.Exception -> La6
                r1.a(r12)     // Catch: java.lang.Exception -> La6
            L90:
                a.a.a.b.t r12 = a.a.a.b.t.e()     // Catch: java.lang.Exception -> La6
                boolean r12 = r12.b()     // Catch: java.lang.Exception -> La6
                if (r12 == 0) goto Lb3
                a.a.a.b.t r12 = a.a.a.b.t.e()     // Catch: java.lang.Exception -> La6
                float r12 = r12.a()     // Catch: java.lang.Exception -> La6
                r0.a(r12)     // Catch: java.lang.Exception -> La6
                goto Lb3
            La6:
                r12 = move-exception
                r12.printStackTrace()     // Catch: java.lang.Exception -> L109
                com.baidu.location.c r0 = new com.baidu.location.c     // Catch: java.lang.Exception -> L109
                r0.<init>()     // Catch: java.lang.Exception -> L109
                r12 = 0
                r0.h(r12)     // Catch: java.lang.Exception -> L109
            Lb3:
                r11.i = r5     // Catch: java.lang.Exception -> L109
                int r12 = r0.r()     // Catch: java.lang.Exception -> L109
                if (r12 != 0) goto Ld8
                double r1 = r0.q()     // Catch: java.lang.Exception -> L109
                r7 = 1
                int r12 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
                if (r12 != 0) goto Ld8
                double r1 = r0.t()     // Catch: java.lang.Exception -> L109
                int r12 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
                if (r12 != 0) goto Ld8
                a.a.a.b.m r12 = r11.m     // Catch: java.lang.Exception -> L109
                android.os.Handler r12 = r12.g     // Catch: java.lang.Exception -> L109
                android.os.Message r12 = r12.obtainMessage(r4)     // Catch: java.lang.Exception -> L109
                r12.obj = r3     // Catch: java.lang.Exception -> L109
                goto L105
            Ld8:
                long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L109
                long r7 = r11.l     // Catch: java.lang.Exception -> L109
                long r1 = r1 - r7
                r7 = 1000(0x3e8, double:4.94E-321)
                long r1 = r1 / r7
                r7 = 0
                int r12 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
                if (r12 >= 0) goto Le9
                r1 = r7
            Le9:
                long r9 = r11.k     // Catch: java.lang.Exception -> L109
                int r12 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r12 >= 0) goto Lf1
                r11.k = r7     // Catch: java.lang.Exception -> L109
            Lf1:
                long r7 = r11.k     // Catch: java.lang.Exception -> L109
                long r7 = r7 + r1
                r0.a(r7)     // Catch: java.lang.Exception -> L109
                a.a.a.b.m r12 = r11.m     // Catch: java.lang.Exception -> L109
                android.os.Handler r12 = r12.g     // Catch: java.lang.Exception -> L109
                r1 = 21
                android.os.Message r12 = r12.obtainMessage(r1)     // Catch: java.lang.Exception -> L109
                r12.obj = r0     // Catch: java.lang.Exception -> L109
                r12.arg1 = r6     // Catch: java.lang.Exception -> L109
            L105:
                r12.sendToTarget()     // Catch: java.lang.Exception -> L109
                goto L116
            L109:
                a.a.a.b.m r12 = r11.m
                android.os.Handler r12 = r12.g
                android.os.Message r12 = r12.obtainMessage(r4)
                r12.obj = r3
                r12.sendToTarget()
            L116:
                java.util.Map<java.lang.String, java.lang.Object> r11 = r11.d
                if (r11 == 0) goto L11d
                r11.clear()
            L11d:
                return
        }
    }

    static {
            return
    }

    public m() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f48a = r0
            r3.f49b = r0
            r3.f50c = r0
            r1 = 1
            r3.d = r1
            r3.e = r1
            r1 = 0
            r3.f = r1
            a.a.a.b.m$b r2 = new a.a.a.b.m$b
            r2.<init>(r3)
            r3.g = r2
            r3.h = r0
            r3.i = r0
            r3.j = r1
            r0 = 0
            r3.k = r0
            return
    }

    public static /* synthetic */ java.lang.String a(a.a.a.b.m r0) {
            java.lang.String r0 = r0.h
            return r0
    }

    public static /* synthetic */ java.lang.String b(a.a.a.b.m r0) {
            java.lang.String r0 = r0.i
            return r0
    }

    public java.lang.String a() {
            r8 = this;
            a.a.a.b.c r0 = a.a.a.b.c.h()
            java.lang.String r0 = r0.d()
            a.a.a.g.f r1 = a.a.a.g.f.w()
            boolean r1 = r1.p()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L17
            java.lang.String r1 = "&cn=32"
            goto L2f
        L17:
            java.util.Locale r1 = java.util.Locale.CHINA
            java.lang.Object[] r4 = new java.lang.Object[r3]
            a.a.a.g.f r5 = a.a.a.g.f.w()
            int r5 = r5.f()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r2] = r5
            java.lang.String r5 = "&cn=%d"
            java.lang.String r1 = java.lang.String.format(r1, r5, r4)
        L2f:
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r8.k
            long r4 = r4 - r6
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 18
            if (r6 < r7) goto L67
            r6 = 60000(0xea60, double:2.9644E-319)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L67
            long r4 = java.lang.System.currentTimeMillis()
            r8.k = r4
            java.lang.String r4 = a.a.a.i.i.b()
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L67
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            java.lang.String r1 = "&qcip6c="
            r5.append(r1)
            r5.append(r4)
            java.lang.String r1 = r5.toString()
        L67:
            boolean r4 = r8.d
            if (r4 == 0) goto L6e
            r8.d = r2
            goto L89
        L6e:
            boolean r2 = r8.f
            if (r2 != 0) goto L89
            java.lang.String r2 = a.a.a.b.y.d()
            if (r2 == 0) goto L87
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
        L87:
            r8.f = r3
        L89:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r1)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            return r8
    }

    public java.lang.String a(java.lang.String r8) {
            r7 = this;
            java.lang.String r8 = r7.h
            if (r8 != 0) goto Le
            android.content.Context r8 = com.baidu.location.f.c()
            java.lang.String r8 = a.a.a.a.a.b(r8)
            r7.h = r8
        Le:
            java.lang.String r8 = r7.i
            if (r8 != 0) goto L1c
            android.content.Context r8 = com.baidu.location.f.c()
            java.lang.String r8 = a.a.a.a.a.c(r8)
            r7.i = r8
        L1c:
            a.a.a.g.a r8 = r7.f49b
            if (r8 == 0) goto L26
            boolean r8 = r8.a()
            if (r8 != 0) goto L30
        L26:
            a.a.a.g.f r8 = a.a.a.g.f.w()
            a.a.a.g.a r8 = r8.a()
            r7.f49b = r8
        L30:
            a.a.a.g.k r8 = r7.f48a
            if (r8 == 0) goto L3a
            boolean r8 = r8.b()
            if (r8 != 0) goto L44
        L3a:
            a.a.a.g.f r8 = a.a.a.g.f.w()
            a.a.a.g.k r8 = r8.j()
            r7.f48a = r8
        L44:
            a.a.a.g.d r8 = a.a.a.g.d.n()
            boolean r8 = r8.j()
            r0 = 0
            if (r8 == 0) goto L59
            a.a.a.g.d r8 = a.a.a.g.d.n()
            android.location.Location r8 = r8.e()
            r3 = r8
            goto L5a
        L59:
            r3 = r0
        L5a:
            a.a.a.g.a r8 = r7.f49b
            if (r8 == 0) goto L6c
            boolean r8 = r8.c()
            if (r8 != 0) goto L6c
            a.a.a.g.a r8 = r7.f49b
            boolean r8 = r8.b()
            if (r8 == 0) goto L79
        L6c:
            a.a.a.g.k r8 = r7.f48a
            if (r8 == 0) goto L76
            int r8 = r8.c()
            if (r8 != 0) goto L79
        L76:
            if (r3 != 0) goto L79
            return r0
        L79:
            java.lang.String r8 = r7.a()
            a.a.a.b.l r0 = a.a.a.b.l.f()
            int r0 = r0.a()
            r1 = -2
            if (r0 != r1) goto L99
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r8 = "&imo=1"
            r0.append(r8)
            java.lang.String r8 = r0.toString()
        L99:
            android.content.Context r0 = com.baidu.location.f.c()
            int r0 = a.a.a.i.i.c(r0)
            if (r0 < 0) goto Lea
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r8 = "&lmd="
            r1.append(r8)
            r1.append(r0)
            java.lang.String r8 = r1.toString()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lea
            boolean r0 = r7.j
            if (r0 != 0) goto Lea
            r0 = 1
            r7.j = r0
            android.content.Context r0 = com.baidu.location.f.c()     // Catch: java.lang.Throwable -> Le6
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> Le6
            java.lang.String r1 = "android.hardware.wifi.rtt"
            boolean r0 = r0.hasSystemFeature(r1)     // Catch: java.lang.Throwable -> Le6
            if (r0 == 0) goto Lea
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le6
            r0.<init>()     // Catch: java.lang.Throwable -> Le6
            r0.append(r8)     // Catch: java.lang.Throwable -> Le6
            java.lang.String r1 = "&rtt=1"
            r0.append(r1)     // Catch: java.lang.Throwable -> Le6
            java.lang.String r8 = r0.toString()     // Catch: java.lang.Throwable -> Le6
            goto Lea
        Le6:
            r0 = move-exception
            r0.printStackTrace()
        Lea:
            a.a.a.g.k r0 = r7.f48a
            if (r0 == 0) goto Lf4
            int r0 = r0.c()
            if (r0 != 0) goto L10d
        Lf4:
            a.a.a.g.f r0 = a.a.a.g.f.w()
            java.lang.String r0 = r0.d()
            if (r0 == 0) goto L10d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
        L10d:
            a.a.a.g.f r0 = a.a.a.g.f.w()
            boolean r0 = r0.o()
            if (r0 == 0) goto L128
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r8 = "&wf_freq=1"
            r0.append(r8)
            java.lang.String r8 = r0.toString()
        L128:
            r4 = r8
            boolean r8 = r7.e
            r0 = 0
            if (r8 == 0) goto L13b
            r7.e = r0
            a.a.a.g.a r1 = r7.f49b
            a.a.a.g.k r2 = r7.f48a
            r5 = 0
            r6 = 1
            java.lang.String r7 = a.a.a.i.i.a(r1, r2, r3, r4, r5, r6)
            return r7
        L13b:
            a.a.a.g.a r8 = r7.f49b
            a.a.a.g.k r7 = r7.f48a
            java.lang.String r7 = a.a.a.i.i.a(r8, r7, r3, r4, r0)
            return r7
    }

    public abstract void a(android.os.Message r1);

    public abstract void b();
}
