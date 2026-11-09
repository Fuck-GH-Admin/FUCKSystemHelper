package com.baidu.location.l;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c.b.a.a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f1386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.baidu.location.l.a f1387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1388c;
    private com.baidu.location.l.d d;
    private boolean e;
    private com.baidu.location.l.e f;
    private int g;

    public b() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f1387b = r0
            r1.d = r0
            r1.f = r0
            r0 = -1
            r1.g = r0
            return
    }

    @Override // c.b.a.a.c
    public int a() {
            r1 = this;
            int r0 = r1.g
            if (r0 >= 0) goto L7
            r1.b()
        L7:
            int r1 = r1.g
            return r1
    }

    public com.baidu.location.l.b a(com.baidu.location.l.a r2) {
            r1 = this;
            if (r2 != 0) goto L6
            r1.d()
            return r1
        L6:
            r0 = 1
            r1.f1386a = r0
            r1.f1387b = r2
            return r1
    }

    public com.baidu.location.l.b a(com.baidu.location.l.d r2) {
            r1 = this;
            if (r2 != 0) goto L6
            r1.e()
            return r1
        L6:
            r0 = 1
            r1.f1388c = r0
            r1.d = r2
            return r1
    }

    public com.baidu.location.l.b a(com.baidu.location.l.e r2) {
            r1 = this;
            if (r2 != 0) goto L6
            r1.f()
            return r1
        L6:
            r0 = 1
            r1.e = r0
            r1.f = r2
            return r1
    }

    @Override // c.b.a.a.c
    public void a(c.b.a.a.b r3) {
            r2 = this;
            boolean r0 = r2.j()
            if (r0 == 0) goto Le
            com.baidu.location.l.a r0 = r2.g()
            r1 = 1
            r3.a(r1, r0)
        Le:
            boolean r0 = r2.k()
            if (r0 == 0) goto L1c
            com.baidu.location.l.d r0 = r2.h()
            r1 = 2
            r3.a(r1, r0)
        L1c:
            boolean r0 = r2.l()
            if (r0 == 0) goto L2a
            com.baidu.location.l.e r2 = r2.i()
            r0 = 3
            r3.a(r0, r2)
        L2a:
            return
    }

    @Override // c.b.a.a.c
    public int b() {
            r3 = this;
            boolean r0 = r3.j()
            r1 = 0
            if (r0 == 0) goto L11
            com.baidu.location.l.a r0 = r3.g()
            r2 = 1
            int r0 = c.b.a.a.b.b(r2, r0)
            int r1 = r1 + r0
        L11:
            boolean r0 = r3.k()
            if (r0 == 0) goto L21
            com.baidu.location.l.d r0 = r3.h()
            r2 = 2
            int r0 = c.b.a.a.b.b(r2, r0)
            int r1 = r1 + r0
        L21:
            boolean r0 = r3.l()
            if (r0 == 0) goto L31
            com.baidu.location.l.e r0 = r3.i()
            r2 = 3
            int r0 = c.b.a.a.b.b(r2, r0)
            int r1 = r1 + r0
        L31:
            r3.g = r1
            return r1
    }

    public com.baidu.location.l.b d() {
            r1 = this;
            r0 = 0
            r1.f1386a = r0
            r0 = 0
            r1.f1387b = r0
            return r1
    }

    public com.baidu.location.l.b e() {
            r1 = this;
            r0 = 0
            r1.f1388c = r0
            r0 = 0
            r1.d = r0
            return r1
    }

    public com.baidu.location.l.b f() {
            r1 = this;
            r0 = 0
            r1.e = r0
            r0 = 0
            r1.f = r0
            return r1
    }

    public com.baidu.location.l.a g() {
            r0 = this;
            com.baidu.location.l.a r0 = r0.f1387b
            return r0
    }

    public com.baidu.location.l.d h() {
            r0 = this;
            com.baidu.location.l.d r0 = r0.d
            return r0
    }

    public com.baidu.location.l.e i() {
            r0 = this;
            com.baidu.location.l.e r0 = r0.f
            return r0
    }

    public boolean j() {
            r0 = this;
            boolean r0 = r0.f1386a
            return r0
    }

    public boolean k() {
            r0 = this;
            boolean r0 = r0.f1388c
            return r0
    }

    public boolean l() {
            r0 = this;
            boolean r0 = r0.e
            return r0
    }
}
