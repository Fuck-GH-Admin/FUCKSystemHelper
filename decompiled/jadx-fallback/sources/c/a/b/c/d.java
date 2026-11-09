package c.a.b.c;

/* JADX INFO: loaded from: classes.dex */
public class d extends c.a.b.c.a {
    c.a.b.i.a.C0053a f;

    class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f1215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c.a.b.n.a f1216b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c.a.b.c.d f1217c;

        a(c.a.b.c.d r1) {
                r0 = this;
                r0.f1217c = r1
                r0.<init>()
                c.a.b.k.b r0 = new c.a.b.k.b
                r0.<init>()
                return
        }

        private boolean a(java.lang.String r4) {
                r3 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r4)
                if (r0 != 0) goto L26
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L26
                r0.<init>(r4)     // Catch: java.lang.Exception -> L26
                java.lang.String r4 = "pub_lst_ts"
                long r1 = r0.getLong(r4)     // Catch: java.lang.Exception -> L26
                r3.f1215a = r1     // Catch: java.lang.Exception -> L26
                java.lang.String r4 = "pub_info"
                java.lang.String r4 = r0.getString(r4)     // Catch: java.lang.Exception -> L26
                c.a.b.n$a r4 = c.a.b.n.b(r4)     // Catch: java.lang.Exception -> L26
                r3.f1216b = r4     // Catch: java.lang.Exception -> L26
                java.lang.String r3 = "d_form_ver"
                r0.getInt(r3)     // Catch: java.lang.Exception -> L26
                r3 = 1
                return r3
            L26:
                r3 = 0
                return r3
        }

        public long a() {
                r2 = this;
                long r0 = r2.f1215a
                return r0
        }

        public boolean a(android.content.pm.PackageInfo r3) {
                r2 = this;
                c.a.b.c.d r0 = r2.f1217c
                c.a.b.i.a$a r0 = r0.f
                java.io.File r1 = new java.io.File
                android.content.pm.ApplicationInfo r3 = r3.applicationInfo
                java.lang.String r3 = r3.dataDir
                r1.<init>(r3)
                c.a.b.i.a$a r3 = r0.a(r1)
                java.lang.String r0 = "pub.dat"
                r1 = 1
                java.lang.String r3 = r3.a(r0, r1)
                boolean r2 = r2.a(r3)
                return r2
        }

        public c.a.b.n.a b() {
                r0 = this;
                c.a.b.n$a r0 = r0.f1216b
                return r0
        }
    }

    class b extends c.a.b.c.a.b {
        private java.lang.String d;
        private long e;
        private long f;
        private long g;
        private c.a.b.n.a h;

        public b(c.a.b.c.d r1, java.lang.String r2) {
                r0 = this;
                c.a.b.i.a$a r1 = r1.f
                r0.<init>(r1, r2)
                return
        }

        public void a(c.a.b.c.d.a r3) {
                r2 = this;
                c.a.b.n$a r0 = r3.b()
                r2.a(r0)
                long r0 = r3.a()
                r2.b(r0)
                return
        }

        @Override // c.a.b.c.a.b
        public void a(org.json.JSONObject r3) {
                r2 = this;
                java.lang.String r0 = "pkg"
                java.lang.String r0 = r3.getString(r0)
                r2.d = r0
                java.lang.String r0 = "tar_pkg_lst_pub_ts"
                int r0 = r3.getInt(r0)
                long r0 = (long) r0
                r2.f = r0
                java.lang.String r0 = "last_fe_ts"
                long r0 = r3.getLong(r0)
                r2.e = r0
                java.lang.String r0 = "info"
                java.lang.String r0 = r3.getString(r0)
                c.a.b.n$a r0 = c.a.b.n.b(r0)
                r2.h = r0
                java.lang.String r0 = "tar_pkg_lst_up_ts"
                long r0 = r3.getLong(r0)
                r2.g = r0
                java.lang.String r2 = "d_form_ver"
                r3.getInt(r2)
                return
        }

        public boolean a(long r3) {
                r2 = this;
                long r0 = r2.e
                int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r0 == 0) goto Ld
                r2.e = r3
                r3 = 1
                r2.a(r3)
                return r3
            Ld:
                r2 = 0
                return r2
        }

        public boolean a(c.a.b.n.a r2) {
                r1 = this;
                c.a.b.n$a r0 = r1.h
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto Lf
                r1.h = r2
                r2 = 1
                r1.a(r2)
                return r2
            Lf:
                r1 = 0
                return r1
        }

        public boolean a(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = r1.d
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto Lf
                r1.d = r2
                r2 = 1
                r1.a(r2)
                return r2
            Lf:
                r1 = 0
                return r1
        }

        @Override // c.a.b.c.a.b
        public void b(org.json.JSONObject r4) {
                r3 = this;
                java.lang.String r0 = r3.d
                java.lang.String r1 = "pkg"
                r4.put(r1, r0)
                long r0 = r3.e
                java.lang.String r2 = "last_fe_ts"
                r4.put(r2, r0)
                long r0 = r3.f
                java.lang.String r2 = "tar_pkg_lst_pub_ts"
                r4.put(r2, r0)
                c.a.b.n$a r0 = r3.h
                java.lang.String r0 = r0.a()
                java.lang.String r1 = "info"
                r4.put(r1, r0)
                long r0 = r3.g
                java.lang.String r3 = "tar_pkg_lst_up_ts"
                r4.put(r3, r0)
                java.lang.String r3 = "d_form_ver"
                r0 = 1
                r4.put(r3, r0)
                return
        }

        public boolean b(long r3) {
                r2 = this;
                long r0 = r2.f
                int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r0 == 0) goto Ld
                r2.f = r3
                r3 = 1
                r2.a(r3)
                return r3
            Ld:
                r2 = 0
                return r2
        }

        public java.lang.String c() {
                r0 = this;
                java.lang.String r0 = r0.d
                return r0
        }

        public boolean c(long r3) {
                r2 = this;
                long r0 = r2.g
                int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r0 == 0) goto Ld
                r2.g = r3
                r3 = 1
                r2.a(r3)
                return r3
            Ld:
                r2 = 0
                return r2
        }

        public c.a.b.n.a d() {
                r0 = this;
                c.a.b.n$a r0 = r0.h
                return r0
        }

        public long e() {
                r2 = this;
                long r0 = r2.g
                return r0
        }
    }

    public d() {
            r3 = this;
            java.lang.String r0 = "isc"
            r1 = 8000000(0x7a1200, double:3.952525E-317)
            r3.<init>(r0, r1)
            c.a.b.c.d$a r0 = new c.a.b.c.d$a
            r0.<init>(r3)
            return
    }

    @Override // c.a.b.c.a
    public c.a.b.c.a.e a(java.lang.String r8, c.a.b.c.a.d r9) {
            r7 = this;
            c.a.b.c.a$a r0 = r7.f1203a
            android.content.Context r0 = r0.f1206a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r1 = 0
            r2 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r8, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lf
            goto L10
        Lf:
            r0 = r2
        L10:
            r1 = -2
            if (r0 != 0) goto L18
            c.a.b.c.a$e r7 = c.a.b.c.a.e.a(r1)
            return r7
        L18:
            boolean r3 = r9.f1211a
            if (r3 == 0) goto L41
            c.a.b.c.d$b r2 = new c.a.b.c.d$b
            r2.<init>(r7, r8)
            r2.a()
            java.lang.String r3 = r2.c()
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L41
            long r3 = r0.lastUpdateTime
            long r5 = r2.e()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L41
            c.a.b.n$a r7 = r2.d()
        L3c:
            c.a.b.c.a$e r7 = c.a.b.c.a.e.a(r7)
            return r7
        L41:
            c.a.b.c.d$a r3 = new c.a.b.c.d$a
            r3.<init>(r7)
            boolean r7 = r3.a(r0)
            if (r7 != 0) goto L51
            c.a.b.c.a$e r7 = c.a.b.c.a.e.a(r1)
            return r7
        L51:
            boolean r7 = r9.f1211a
            if (r7 == 0) goto L6c
            if (r2 == 0) goto L6c
            r2.a(r3)
            long r4 = java.lang.System.currentTimeMillis()
            r2.a(r4)
            long r0 = r0.lastUpdateTime
            r2.c(r0)
            r2.a(r8)
            r2.b()
        L6c:
            c.a.b.n$a r7 = r3.b()
            goto L3c
    }

    @Override // c.a.b.c.a
    public void a(c.a.b.c.a.c r2) {
            r1 = this;
            c.a.b.i.a$a r2 = r1.f1204b
            java.lang.String r0 = "isc"
            c.a.b.i.a$a r2 = r2.a(r0)
            r1.f = r2
            return
    }
}
