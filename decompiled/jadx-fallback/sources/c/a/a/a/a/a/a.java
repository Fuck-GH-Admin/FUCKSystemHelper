package c.a.a.a.a.a;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private static volatile c.a.a.a.a.a.a h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f1185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c.a.b.n f1186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c.a.b.m f1187c;
    private c.a.b.f d;
    private c.a.b.n.a e;
    private c.a.b.n.a f;
    private long g;

    private a(android.content.Context r4) {
            r3 = this;
            r3.<init>()
            android.content.Context r4 = r4.getApplicationContext()
            r3.f1185a = r4
            c.a.b.f r4 = new c.a.b.f
            r4.<init>()
            r3.d = r4
            c.a.b.i.a r4 = new c.a.b.i.a
            android.content.Context r0 = r3.f1185a
            r4.<init>(r0)
            c.a.b.n r0 = new c.a.b.n
            android.content.Context r1 = r3.f1185a
            c.a.b.f r2 = r3.d
            r0.<init>(r1, r4, r2)
            r3.f1186b = r0
            c.a.b.m r4 = new c.a.b.m
            android.content.Context r0 = r3.f1185a
            c.a.b.f r1 = r3.d
            r4.<init>(r0, r1)
            r3.f1187c = r4
            return
    }

    private c.a.b.n.a a() {
            r6 = this;
            c.a.b.n$a r0 = r6.f
            if (r0 == 0) goto L5
            return r0
        L5:
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r6.g
            long r2 = r0 - r2
            long r2 = java.lang.Math.abs(r2)
            r4 = 3600000(0x36ee80, double:1.7786363E-317)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L20
            c.a.b.n$a r2 = r6.b()
            r6.f = r2
            r6.g = r0
        L20:
            c.a.b.n$a r0 = r6.f
            if (r0 == 0) goto L25
            return r0
        L25:
            c.a.b.n$a r0 = r6.e
            if (r0 != 0) goto L30
            r0 = 0
            c.a.b.n$a r0 = r6.d(r0)
            r6.f = r0
        L30:
            c.a.b.n$a r6 = r6.f
            return r6
    }

    public static java.lang.String a(android.content.Context r1) {
            java.lang.Class<c.a.a.a.a.a.a> r0 = c.a.a.a.a.a.a.class
            monitor-enter(r0)
            c.a.a.a.a.a.a r1 = b(r1)     // Catch: java.lang.Throwable -> L11
            c.a.b.n$a r1 = r1.a()     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = r1.b()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r1
        L11:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }

    public static void a(java.lang.String r0) {
            c.a.b.n.c(r0)
            return
    }

    static c.a.a.a.a.a.a b(android.content.Context r2) {
            java.lang.Class<c.a.b.l> r0 = c.a.b.l.class
            monitor-enter(r0)
            c.a.a.a.a.a.a r1 = c.a.a.a.a.a.a.h     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto Le
            c.a.a.a.a.a.a r1 = new c.a.a.a.a.a.a     // Catch: java.lang.Throwable -> L12
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L12
            c.a.a.a.a.a.a.h = r1     // Catch: java.lang.Throwable -> L12
        Le:
            c.a.a.a.a.a.a r2 = c.a.a.a.a.a.a.h     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return r2
        L12:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r2
    }

    private c.a.b.n.a b() {
            r1 = this;
            r0 = 0
            c.a.b.n$a r1 = r1.b(r0)     // Catch: java.lang.Throwable -> L6
            return r1
        L6:
            r1 = move-exception
            throw r1
    }

    private c.a.b.n.a b(java.lang.String r2) {
            r1 = this;
            c.a.b.n r0 = r1.f1186b
            c.a.b.n$a r0 = r0.a()
            if (r0 != 0) goto Lc
            c.a.b.n$a r0 = r1.c(r2)
        Lc:
            return r0
    }

    private c.a.b.n.a c(java.lang.String r2) {
            r1 = this;
            c.a.b.m r0 = r1.f1187c
            c.a.b.l r2 = r0.a(r2)
            if (r2 == 0) goto Lf
            c.a.b.n r1 = r1.f1186b
            c.a.b.n$a r1 = r1.a(r2)
            return r1
        Lf:
            r1 = 0
            return r1
    }

    private c.a.b.n.a d(java.lang.String r1) {
            r0 = this;
            c.a.b.n r0 = r0.f1186b
            c.a.b.n$a r0 = r0.a(r1)
            return r0
    }
}
