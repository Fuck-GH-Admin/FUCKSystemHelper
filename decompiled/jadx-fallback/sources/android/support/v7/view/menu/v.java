package android.support.v7.view.menu;

/* JADX INFO: loaded from: classes.dex */
class v extends android.support.v7.view.menu.r implements android.view.SubMenu {
    v(android.content.Context r1, b.b.c.c.a.c r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public b.b.c.c.a.c c() {
            r0 = this;
            T r0 = r0.f747a
            b.b.c.c.a.c r0 = (b.b.c.c.a.c) r0
            return r0
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
            r0 = this;
            b.b.c.c.a.c r0 = r0.c()
            r0.clearHeader()
            return
    }

    @Override // android.view.SubMenu
    public android.view.MenuItem getItem() {
            r1 = this;
            b.b.c.c.a.c r0 = r1.c()
            android.view.MenuItem r0 = r0.getItem()
            android.view.MenuItem r1 = r1.a(r0)
            return r1
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderIcon(int r2) {
            r1 = this;
            b.b.c.c.a.c r0 = r1.c()
            r0.setHeaderIcon(r2)
            return r1
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            b.b.c.c.a.c r0 = r1.c()
            r0.setHeaderIcon(r2)
            return r1
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderTitle(int r2) {
            r1 = this;
            b.b.c.c.a.c r0 = r1.c()
            r0.setHeaderTitle(r2)
            return r1
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderTitle(java.lang.CharSequence r2) {
            r1 = this;
            b.b.c.c.a.c r0 = r1.c()
            r0.setHeaderTitle(r2)
            return r1
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderView(android.view.View r2) {
            r1 = this;
            b.b.c.c.a.c r0 = r1.c()
            r0.setHeaderView(r2)
            return r1
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setIcon(int r2) {
            r1 = this;
            b.b.c.c.a.c r0 = r1.c()
            r0.setIcon(r2)
            return r1
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            b.b.c.c.a.c r0 = r1.c()
            r0.setIcon(r2)
            return r1
    }
}
