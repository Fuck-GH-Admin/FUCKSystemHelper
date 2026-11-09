package c.a.b.a;

/* JADX INFO: loaded from: classes.dex */
class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f1191b = 5;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f1192c = 40;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c.a.b.a.b f1193a;

    public f() {
            r3 = this;
            r3.<init>()
            c.a.b.a.b r0 = new c.a.b.a.b
            int r1 = c.a.b.a.f.f1192c
            r0.<init>(r1)
            r3.f1193a = r0
            int r3 = c.a.b.a.f.f1192c
            r1 = 0
            r2 = 1
            r0.a(r1, r3, r2)
            return
    }

    public void a(c.a.b.a.b r4, int r5, int r6, int r7) {
            r3 = this;
            c.a.b.a.b r0 = r3.f1193a
            int r1 = r5 + r6
            c.a.b.a.b r0 = r0.c(r5, r1)
            if (r7 == 0) goto L1c
            r1 = 2
            if (r7 == r1) goto L18
            r1 = 3
            if (r7 == r1) goto L14
            r0.c(r4)
            goto L1f
        L14:
            r0.b(r4)
            goto L1f
        L18:
            r0.d(r4)
            goto L1f
        L1c:
            r0.a(r4)
        L1f:
            r4 = 0
        L20:
            if (r4 >= r6) goto L30
            c.a.b.a.b r7 = r3.f1193a
            int r1 = r5 + r4
            boolean r2 = r0.c(r4)
            r7.a(r1, r2)
            int r4 = r4 + 1
            goto L20
        L30:
            return
    }

    public byte[] a() {
            r0 = this;
            c.a.b.a.b r0 = r0.f1193a
            byte[] r0 = r0.a()
            return r0
    }
}
