package a.a.a.b;

/* JADX INFO: loaded from: classes.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.a.a.b.x.b f89a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f90b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f91c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static a.a.a.b.x f92a;

        static {
                a.a.a.b.x r0 = new a.a.a.b.x
                r0.<init>()
                a.a.a.b.x.a.f92a = r0
                return
        }

        public static /* synthetic */ a.a.a.b.x a() {
                a.a.a.b.x r0 = a.a.a.b.x.a.f92a
                return r0
        }
    }

    public class b extends a.a.a.i.g {
        public boolean i;
        public java.lang.String j;
        public long k;

        public b(a.a.a.b.x r3) {
                r2 = this;
                r2.<init>()
                r3 = 0
                r2.i = r3
                r3 = 0
                r2.j = r3
                r0 = 0
                r2.k = r0
                java.util.HashMap r3 = new java.util.HashMap
                r3.<init>()
                r2.d = r3
                return
        }

        @Override // a.a.a.i.g
        public void a() {
                r7 = this;
                java.lang.String r0 = "utf-8"
                a.a.a.i.b r1 = a.a.a.i.b.e()
                java.lang.String r1 = r1.a()
                if (r1 == 0) goto L22
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r1)
                java.lang.String r1 = "&gnsst="
                r2.append(r1)
                long r3 = r7.k
                r2.append(r3)
                java.lang.String r1 = r2.toString()
            L22:
                a.a.a.b.n r2 = a.a.a.b.n.b()
                java.lang.String r1 = r2.b(r1)
                boolean r2 = android.text.TextUtils.isEmpty(r1)
                java.lang.String r3 = ""
                java.lang.String r4 = "\r|\n"
                java.lang.String r5 = "null"
                if (r2 != 0) goto L3f
                java.lang.String r1 = r1.trim()
                java.lang.String r1 = r1.replaceAll(r4, r3)
                goto L40
            L3f:
                r1 = r5
            L40:
                a.a.a.b.n r2 = a.a.a.b.n.b()
                java.lang.String r6 = r7.j
                java.lang.String r2 = r2.b(r6)
                boolean r6 = android.text.TextUtils.isEmpty(r2)
                if (r6 != 0) goto L58
                java.lang.String r2 = r2.trim()
                java.lang.String r5 = r2.replaceAll(r4, r3)
            L58:
                java.util.Map<java.lang.String, java.lang.Object> r2 = r7.d     // Catch: java.lang.Exception -> L6e
                java.lang.String r3 = "info"
                java.lang.String r1 = java.net.URLEncoder.encode(r1, r0)     // Catch: java.lang.Exception -> L6e
                r2.put(r3, r1)     // Catch: java.lang.Exception -> L6e
                java.util.Map<java.lang.String, java.lang.Object> r7 = r7.d     // Catch: java.lang.Exception -> L6e
                java.lang.String r1 = "enl"
                java.lang.String r0 = java.net.URLEncoder.encode(r5, r0)     // Catch: java.lang.Exception -> L6e
                r7.put(r1, r0)     // Catch: java.lang.Exception -> L6e
            L6e:
                return
        }

        public void a(java.lang.String r2, long r3) {
                r1 = this;
                boolean r0 = r1.i
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r1.i = r0
                r1.j = r2
                r1.k = r3
                a.a.a.b.w r2 = a.a.a.b.w.d()
                java.util.concurrent.ExecutorService r2 = r2.b()
                java.lang.String r3 = "https://ofloc.map.baidu.com/locnu"
                if (r2 == 0) goto L1c
                r1.a(r2, r3)
                goto L1f
            L1c:
                r1.a(r3)
            L1f:
                return
        }

        @Override // a.a.a.i.g
        public void a(boolean r2) {
                r1 = this;
                if (r2 == 0) goto Ld
                java.lang.String r2 = r1.f339c
                if (r2 == 0) goto Ld
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ld
                java.lang.String r0 = r1.f339c     // Catch: java.lang.Throwable -> Ld
                r2.<init>(r0)     // Catch: java.lang.Throwable -> Ld
            Ld:
                java.util.Map<java.lang.String, java.lang.Object> r2 = r1.d
                if (r2 == 0) goto L14
                r2.clear()
            L14:
                r2 = 0
                r1.i = r2
                return
        }

        public boolean b() {
                r0 = this;
                boolean r0 = r0.i
                return r0
        }
    }

    public x() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f90b = r0
            r2.f91c = r0
            return
    }

    public static a.a.a.b.x b() {
            a.a.a.b.x r0 = a.a.a.b.x.a.a()
            return r0
    }

    public void a() {
            r5 = this;
            long r0 = r5.f90b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L70
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r5.f90b
            long r0 = r0 - r2
            long r0 = java.lang.Math.abs(r0)
            r2 = 20000(0x4e20, double:9.8813E-320)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L70
            a.a.a.b.x$b r0 = r5.f89a
            if (r0 != 0) goto L24
            a.a.a.b.x$b r0 = new a.a.a.b.x$b
            r0.<init>(r5)
            r5.f89a = r0
        L24:
            a.a.a.b.x$b r0 = r5.f89a
            if (r0 == 0) goto L70
            boolean r0 = r0.b()
            if (r0 != 0) goto L70
            a.a.a.b.s r0 = a.a.a.b.s.c()
            java.util.ArrayList r0 = r0.a()
            if (r0 == 0) goto L70
            int r1 = r0.size()
            if (r1 <= 0) goto L70
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            r2 = 0
            java.util.Iterator r3 = r0.iterator()
        L48:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L65
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            r1.append(r4)
            int r2 = r2 + 1
            int r4 = r0.size()
            if (r2 == r4) goto L48
            java.lang.String r4 = ";"
            r1.append(r4)
            goto L48
        L65:
            a.a.a.b.x$b r0 = r5.f89a
            java.lang.String r1 = r1.toString()
            long r2 = r5.f91c
            r0.a(r1, r2)
        L70:
            return
    }

    @android.annotation.TargetApi(24)
    public void a(android.location.GnssNavigationMessage r3, long r4) {
            r2 = this;
            a.a.a.b.s r0 = a.a.a.b.s.c()
            r0.a(r3, r4)
            long r0 = java.lang.System.currentTimeMillis()
            r2.f90b = r0
            r2.f91c = r4
            return
    }
}
