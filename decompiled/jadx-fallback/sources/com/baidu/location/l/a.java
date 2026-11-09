package com.baidu.location.l;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c.b.a.a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f1383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1385c;
    private c.b.a.a.a d;
    private boolean e;
    private c.b.a.a.a f;
    private boolean g;
    private int h;
    private boolean i;
    private long j;
    private boolean k;
    private int l;
    private int m;

    public a() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f1384b = r0
            c.b.a.a.a r1 = c.b.a.a.a.f1316c
            r3.d = r1
            r3.f = r1
            r3.h = r0
            r1 = 0
            r3.j = r1
            r3.l = r0
            r0 = -1
            r3.m = r0
            return
    }

    @Override // c.b.a.a.c
    public int a() {
            r1 = this;
            int r0 = r1.m
            if (r0 >= 0) goto L7
            r1.b()
        L7:
            int r1 = r1.m
            return r1
    }

    public com.baidu.location.l.a a(int r2) {
            r1 = this;
            r0 = 1
            r1.f1383a = r0
            r1.f1384b = r2
            return r1
    }

    public com.baidu.location.l.a a(long r2) {
            r1 = this;
            r0 = 1
            r1.i = r0
            r1.j = r2
            return r1
    }

    public com.baidu.location.l.a a(c.b.a.a.a r2) {
            r1 = this;
            r0 = 1
            r1.f1385c = r0
            r1.d = r2
            return r1
    }

    @Override // c.b.a.a.c
    public void a(c.b.a.a.b r4) {
            r3 = this;
            boolean r0 = r3.j()
            if (r0 == 0) goto Le
            int r0 = r3.d()
            r1 = 1
            r4.a(r1, r0)
        Le:
            boolean r0 = r3.l()
            if (r0 == 0) goto L1c
            c.b.a.a.a r0 = r3.f()
            r1 = 2
            r4.a(r1, r0)
        L1c:
            boolean r0 = r3.m()
            if (r0 == 0) goto L2a
            c.b.a.a.a r0 = r3.g()
            r1 = 3
            r4.a(r1, r0)
        L2a:
            boolean r0 = r3.n()
            if (r0 == 0) goto L38
            int r0 = r3.h()
            r1 = 4
            r4.a(r1, r0)
        L38:
            boolean r0 = r3.o()
            if (r0 == 0) goto L46
            long r0 = r3.i()
            r2 = 5
            r4.a(r2, r0)
        L46:
            boolean r0 = r3.k()
            if (r0 == 0) goto L54
            int r3 = r3.e()
            r0 = 6
            r4.a(r0, r3)
        L54:
            return
    }

    @Override // c.b.a.a.c
    public int b() {
            r4 = this;
            boolean r0 = r4.j()
            r1 = 0
            if (r0 == 0) goto L11
            int r0 = r4.d()
            r2 = 1
            int r0 = c.b.a.a.b.c(r2, r0)
            int r1 = r1 + r0
        L11:
            boolean r0 = r4.l()
            if (r0 == 0) goto L21
            c.b.a.a.a r0 = r4.f()
            r2 = 2
            int r0 = c.b.a.a.b.b(r2, r0)
            int r1 = r1 + r0
        L21:
            boolean r0 = r4.m()
            if (r0 == 0) goto L31
            c.b.a.a.a r0 = r4.g()
            r2 = 3
            int r0 = c.b.a.a.b.b(r2, r0)
            int r1 = r1 + r0
        L31:
            boolean r0 = r4.n()
            if (r0 == 0) goto L41
            int r0 = r4.h()
            r2 = 4
            int r0 = c.b.a.a.b.c(r2, r0)
            int r1 = r1 + r0
        L41:
            boolean r0 = r4.o()
            if (r0 == 0) goto L51
            long r2 = r4.i()
            r0 = 5
            int r0 = c.b.a.a.b.b(r0, r2)
            int r1 = r1 + r0
        L51:
            boolean r0 = r4.k()
            if (r0 == 0) goto L61
            int r0 = r4.e()
            r2 = 6
            int r0 = c.b.a.a.b.c(r2, r0)
            int r1 = r1 + r0
        L61:
            r4.m = r1
            return r1
    }

    public com.baidu.location.l.a b(int r2) {
            r1 = this;
            r0 = 1
            r1.k = r0
            r1.l = r2
            return r1
    }

    public com.baidu.location.l.a b(c.b.a.a.a r2) {
            r1 = this;
            r0 = 1
            r1.e = r0
            r1.f = r2
            return r1
    }

    public com.baidu.location.l.a c(int r2) {
            r1 = this;
            r0 = 1
            r1.g = r0
            r1.h = r2
            return r1
    }

    public int d() {
            r0 = this;
            int r0 = r0.f1384b
            return r0
    }

    public int e() {
            r0 = this;
            int r0 = r0.l
            return r0
    }

    public c.b.a.a.a f() {
            r0 = this;
            c.b.a.a.a r0 = r0.d
            return r0
    }

    public c.b.a.a.a g() {
            r0 = this;
            c.b.a.a.a r0 = r0.f
            return r0
    }

    public int h() {
            r0 = this;
            int r0 = r0.h
            return r0
    }

    public long i() {
            r2 = this;
            long r0 = r2.j
            return r0
    }

    public boolean j() {
            r0 = this;
            boolean r0 = r0.f1383a
            return r0
    }

    public boolean k() {
            r0 = this;
            boolean r0 = r0.k
            return r0
    }

    public boolean l() {
            r0 = this;
            boolean r0 = r0.f1385c
            return r0
    }

    public boolean m() {
            r0 = this;
            boolean r0 = r0.e
            return r0
    }

    public boolean n() {
            r0 = this;
            boolean r0 = r0.g
            return r0
    }

    public boolean o() {
            r0 = this;
            boolean r0 = r0.i
            return r0
    }
}
