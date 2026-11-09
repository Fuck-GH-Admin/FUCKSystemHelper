package a.a.a.a;

/* JADX INFO: loaded from: classes.dex */
public class a implements c.a.c.a.c {
    public static java.lang.Object d;
    public static a.a.a.a.a e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f0a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public android.content.Context f1b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f2c;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            a.a.a.a.a.d = r0
            return
    }

    public a() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f0a = r0
            r0 = 0
            r2.f1b = r0
            r0 = 0
            r2.f2c = r0
            return
    }

    public static a.a.a.a.a b() {
            java.lang.Object r0 = a.a.a.a.a.d
            monitor-enter(r0)
            a.a.a.a.a r1 = a.a.a.a.a.e     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto Le
            a.a.a.a.a r1 = new a.a.a.a.a     // Catch: java.lang.Throwable -> L12
            r1.<init>()     // Catch: java.lang.Throwable -> L12
            a.a.a.a.a.e = r1     // Catch: java.lang.Throwable -> L12
        Le:
            a.a.a.a.a r1 = a.a.a.a.a.e     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return r1
        L12:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1
    }

    public static java.lang.String b(android.content.Context r1) {
            c.a.c.a.b r0 = c.a.c.a.b.c(r1)     // Catch: java.lang.Exception -> L9
            java.lang.String r1 = r0.a(r1)     // Catch: java.lang.Exception -> L9
            goto Le
        L9:
            r1 = move-exception
            r1.printStackTrace()
            r1 = 0
        Le:
            return r1
    }

    public static java.lang.String c(android.content.Context r0) {
            c.a.c.a.b r0 = c.a.c.a.b.c(r0)     // Catch: java.lang.Exception -> L9
            java.lang.String r0 = r0.b()     // Catch: java.lang.Exception -> L9
            goto Le
        L9:
            r0 = move-exception
            r0.printStackTrace()
            r0 = 0
        Le:
            return r0
    }

    @Override // c.a.c.a.c
    public void a(int r3, java.lang.String r4) {
            r2 = this;
            java.lang.String r0 = "ak_permission"
            java.lang.String r1 = "token"
            r2.f0a = r3
            if (r4 == 0) goto L30
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L2c
            r2.<init>(r4)     // Catch: java.lang.Exception -> L2c
            boolean r3 = r2.has(r1)     // Catch: java.lang.Exception -> L2c
            if (r3 == 0) goto L1c
            java.lang.String r3 = r2.getString(r1)     // Catch: java.lang.Exception -> L2c
            if (r3 == 0) goto L1c
            r2.getString(r1)     // Catch: java.lang.Exception -> L2c
        L1c:
            boolean r3 = r2.has(r0)     // Catch: java.lang.Exception -> L2c
            if (r3 == 0) goto L30
            int r3 = r2.getInt(r0)     // Catch: java.lang.Exception -> L2c
            if (r3 == 0) goto L30
            r2.getInt(r0)     // Catch: java.lang.Exception -> L2c
            goto L30
        L2c:
            r2 = move-exception
            r2.printStackTrace()
        L30:
            return
    }

    public void a(android.content.Context r4) {
            r3 = this;
            r3.f1b = r4
            c.a.c.a.b r4 = c.a.c.a.b.c(r4)
            r0 = 0
            java.lang.String r1 = "lbs_locsdk"
            r2 = 0
            r4.a(r0, r1, r2, r3)
            long r0 = java.lang.System.currentTimeMillis()
            r3.f2c = r0
            return
    }

    public void a(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            c.a.c.a.b r0 = c.a.c.a.b.c(r1)
            r0.a(r2)
            return
    }

    public boolean a() {
            r6 = this;
            int r0 = r6.f0a
            r1 = 0
            if (r0 == 0) goto L17
            r2 = 602(0x25a, float:8.44E-43)
            if (r0 == r2) goto L17
            r2 = 601(0x259, float:8.42E-43)
            if (r0 == r2) goto L17
            r2 = -10
            if (r0 == r2) goto L17
            r2 = -11
            if (r0 == r2) goto L17
            r0 = r1
            goto L18
        L17:
            r0 = 1
        L18:
            android.content.Context r2 = r6.f1b
            if (r2 == 0) goto L4b
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r6.f2c
            long r2 = r2 - r4
            if (r0 == 0) goto L2d
            r4 = 86400000(0x5265c00, double:4.2687272E-316)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L4b
            goto L39
        L2d:
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L39
            r4 = 10000(0x2710, double:4.9407E-320)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L4b
        L39:
            android.content.Context r2 = r6.f1b
            c.a.c.a.b r2 = c.a.c.a.b.c(r2)
            r3 = 0
            java.lang.String r4 = "lbs_locsdk"
            r2.a(r1, r4, r3, r6)
            long r1 = java.lang.System.currentTimeMillis()
            r6.f2c = r1
        L4b:
            return r0
    }
}
