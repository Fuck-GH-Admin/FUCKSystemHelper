package com.baidu.location.l;

/* JADX INFO: loaded from: classes.dex */
public final class c extends c.b.a.a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.util.List<com.baidu.location.l.b> f1389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1390b;

    public c() {
            r1 = this;
            r1.<init>()
            java.util.List r0 = java.util.Collections.emptyList()
            r1.f1389a = r0
            r0 = -1
            r1.f1390b = r0
            return
    }

    @Override // c.b.a.a.c
    public int a() {
            r1 = this;
            int r0 = r1.f1390b
            if (r0 >= 0) goto L7
            r1.b()
        L7:
            int r1 = r1.f1390b
            return r1
    }

    public com.baidu.location.l.c a(com.baidu.location.l.b r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return r1
        L3:
            java.util.List<com.baidu.location.l.b> r0 = r1.f1389a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L12
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f1389a = r0
        L12:
            java.util.List<com.baidu.location.l.b> r0 = r1.f1389a
            r0.add(r2)
            return r1
    }

    @Override // c.b.a.a.c
    public void a(c.b.a.a.b r3) {
            r2 = this;
            java.util.List r2 = r2.d()
            java.util.Iterator r2 = r2.iterator()
        L8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L19
            java.lang.Object r0 = r2.next()
            com.baidu.location.l.b r0 = (com.baidu.location.l.b) r0
            r1 = 1
            r3.a(r1, r0)
            goto L8
        L19:
            return
    }

    @Override // c.b.a.a.c
    public int b() {
            r4 = this;
            java.util.List r0 = r4.d()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L9:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1c
            java.lang.Object r2 = r0.next()
            com.baidu.location.l.b r2 = (com.baidu.location.l.b) r2
            r3 = 1
            int r2 = c.b.a.a.b.b(r3, r2)
            int r1 = r1 + r2
            goto L9
        L1c:
            r4.f1390b = r1
            return r1
    }

    public java.util.List<com.baidu.location.l.b> d() {
            r0 = this;
            java.util.List<com.baidu.location.l.b> r0 = r0.f1389a
            return r0
    }
}
