package android.support.v7.view.menu;

/* JADX INFO: loaded from: classes.dex */
abstract class c<T> extends android.support.v7.view.menu.d<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final android.content.Context f745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.util.Map<b.b.c.c.a.b, android.view.MenuItem> f746c;
    private java.util.Map<b.b.c.c.a.c, android.view.SubMenu> d;

    c(android.content.Context r1, T r2) {
            r0 = this;
            r0.<init>(r2)
            r0.f745b = r1
            return
    }

    final android.view.MenuItem a(android.view.MenuItem r3) {
            r2 = this;
            boolean r0 = r3 instanceof b.b.c.c.a.b
            if (r0 == 0) goto L27
            r0 = r3
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            java.util.Map<b.b.c.c.a.b, android.view.MenuItem> r1 = r2.f746c
            if (r1 != 0) goto L12
            b.b.c.f.a r1 = new b.b.c.f.a
            r1.<init>()
            r2.f746c = r1
        L12:
            java.util.Map<b.b.c.c.a.b, android.view.MenuItem> r1 = r2.f746c
            java.lang.Object r3 = r1.get(r3)
            android.view.MenuItem r3 = (android.view.MenuItem) r3
            if (r3 != 0) goto L27
            android.content.Context r3 = r2.f745b
            android.view.MenuItem r3 = android.support.v7.view.menu.q.a(r3, r0)
            java.util.Map<b.b.c.c.a.b, android.view.MenuItem> r2 = r2.f746c
            r2.put(r0, r3)
        L27:
            return r3
    }

    final android.view.SubMenu a(android.view.SubMenu r2) {
            r1 = this;
            boolean r0 = r2 instanceof b.b.c.c.a.c
            if (r0 == 0) goto L27
            b.b.c.c.a.c r2 = (b.b.c.c.a.c) r2
            java.util.Map<b.b.c.c.a.c, android.view.SubMenu> r0 = r1.d
            if (r0 != 0) goto L11
            b.b.c.f.a r0 = new b.b.c.f.a
            r0.<init>()
            r1.d = r0
        L11:
            java.util.Map<b.b.c.c.a.c, android.view.SubMenu> r0 = r1.d
            java.lang.Object r0 = r0.get(r2)
            android.view.SubMenu r0 = (android.view.SubMenu) r0
            if (r0 != 0) goto L26
            android.content.Context r0 = r1.f745b
            android.view.SubMenu r0 = android.support.v7.view.menu.q.a(r0, r2)
            java.util.Map<b.b.c.c.a.c, android.view.SubMenu> r1 = r1.d
            r1.put(r2, r0)
        L26:
            return r0
        L27:
            return r2
    }

    final void a(int r2) {
            r1 = this;
            java.util.Map<b.b.c.c.a.b, android.view.MenuItem> r1 = r1.f746c
            if (r1 != 0) goto L5
            return
        L5:
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r0 = r1.next()
            android.view.MenuItem r0 = (android.view.MenuItem) r0
            int r0 = r0.getGroupId()
            if (r2 != r0) goto Ld
            r1.remove()
            goto Ld
        L23:
            return
    }

    final void b() {
            r1 = this;
            java.util.Map<b.b.c.c.a.b, android.view.MenuItem> r0 = r1.f746c
            if (r0 == 0) goto L7
            r0.clear()
        L7:
            java.util.Map<b.b.c.c.a.c, android.view.SubMenu> r1 = r1.d
            if (r1 == 0) goto Le
            r1.clear()
        Le:
            return
    }

    final void b(int r2) {
            r1 = this;
            java.util.Map<b.b.c.c.a.b, android.view.MenuItem> r1 = r1.f746c
            if (r1 != 0) goto L5
            return
        L5:
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r1.next()
            android.view.MenuItem r0 = (android.view.MenuItem) r0
            int r0 = r0.getItemId()
            if (r2 != r0) goto Ld
            r1.remove()
        L22:
            return
    }
}
