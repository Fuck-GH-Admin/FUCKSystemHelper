package c.a.b.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static java.util.Comparator e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected c.a.b.c.a.C0051a f1203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected c.a.b.i.a.C0053a f1204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f1205c;
    private long d;

    /* JADX INFO: renamed from: c.a.b.c.a$a, reason: collision with other inner class name */
    public static class C0051a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public android.content.Context f1206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c.a.b.i.a f1207b;

        public C0051a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c.a.b.i.a.C0053a f1208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.lang.String f1209b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f1210c;

        public b(c.a.b.i.a.C0053a r2, java.lang.String r3) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.f1210c = r0
                r1.f1208a = r2
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r0 = "target-pkg-"
                r2.append(r0)
                byte[] r3 = r3.getBytes()
                r0 = 3
                java.lang.String r3 = android.util.Base64.encodeToString(r3, r0)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.f1209b = r2
                return
        }

        public abstract void a(org.json.JSONObject r1);

        public void a(boolean r1) {
                r0 = this;
                r0.f1210c = r1
                return
        }

        public boolean a() {
                r4 = this;
                c.a.b.i.a$a r0 = r4.f1208a
                java.lang.String r1 = r4.f1209b
                r2 = 1
                java.lang.String r0 = r0.a(r1, r2)
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                r3 = 0
                if (r1 != 0) goto L1c
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L1c
                r1.<init>(r0)     // Catch: java.lang.Exception -> L1c
                r4.a(r1)     // Catch: java.lang.Exception -> L1c
                r4.a(r3)     // Catch: java.lang.Exception -> L1c
                return r2
            L1c:
                return r3
        }

        public abstract void b(org.json.JSONObject r1);

        public boolean b() {
                r5 = this;
                boolean r0 = r5.f1210c
                r1 = 0
                if (r0 == 0) goto L1d
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L1d
                r0.<init>()     // Catch: java.lang.Exception -> L1d
                r5.b(r0)     // Catch: java.lang.Exception -> L1d
                c.a.b.i.a$a r2 = r5.f1208a     // Catch: java.lang.Exception -> L1d
                java.lang.String r3 = r5.f1209b     // Catch: java.lang.Exception -> L1d
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L1d
                r4 = 1
                r2.a(r3, r0, r4)     // Catch: java.lang.Exception -> L1d
                r5.a(r1)     // Catch: java.lang.Exception -> L1d
                return r4
            L1d:
                return r1
        }
    }

    public static class c {
        public c() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1211a;

        public d() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c.a.b.n.a f1212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1213b;

        public e(int r1, c.a.b.n.a r2, java.lang.Exception r3) {
                r0 = this;
                r0.<init>()
                r0.f1213b = r1
                r0.f1212a = r2
                return
        }

        public static c.a.b.c.a.e a(int r2) {
                c.a.b.c.a$e r0 = new c.a.b.c.a$e
                r1 = 0
                r0.<init>(r2, r1, r1)
                return r0
        }

        public static c.a.b.c.a.e a(c.a.b.n.a r3) {
                c.a.b.c.a$e r0 = new c.a.b.c.a$e
                r1 = 0
                r2 = 0
                r0.<init>(r1, r3, r2)
                return r0
        }

        public static c.a.b.c.a.e b() {
                c.a.b.c.a$e r0 = new c.a.b.c.a$e
                r1 = 0
                r2 = -1
                r0.<init>(r2, r1, r1)
                return r0
        }

        public boolean a() {
                r0 = this;
                int r0 = r0.f1213b
                if (r0 != 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }
    }

    static {
            c.a.b.c.b r0 = new c.a.b.c.b
            r0.<init>()
            c.a.b.c.a.e = r0
            return
    }

    public a(java.lang.String r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.f1205c = r1
            r0.d = r2
            return
    }

    public abstract c.a.b.c.a.e a(java.lang.String r1, c.a.b.c.a.d r2);

    public java.lang.String a() {
            r0 = this;
            java.lang.String r0 = r0.f1205c
            return r0
    }

    public final void a(c.a.b.c.a.C0051a r2) {
            r1 = this;
            r1.f1203a = r2
            c.a.b.i.a r2 = r2.f1207b
            c.a.b.i.a$a r2 = r2.b()
            java.lang.String r0 = "cs"
            c.a.b.i.a$a r2 = r2.a(r0)
            r1.f1204b = r2
            return
    }

    public abstract void a(c.a.b.c.a.c r1);

    public long b() {
            r2 = this;
            long r0 = r2.d
            return r0
    }
}
