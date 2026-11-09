package android.support.v7.view.menu;

/* JADX INFO: loaded from: classes.dex */
public class u extends android.support.v7.view.menu.h implements android.view.SubMenu {
    private android.support.v7.view.menu.h B;
    private android.support.v7.view.menu.j C;

    public u(android.content.Context r1, android.support.v7.view.menu.h r2, android.support.v7.view.menu.j r3) {
            r0 = this;
            r0.<init>(r1)
            r0.B = r2
            r0.C = r3
            return
    }

    @Override // android.support.v7.view.menu.h
    public void a(android.support.v7.view.menu.h.a r1) {
            r0 = this;
            android.support.v7.view.menu.h r0 = r0.B
            r0.a(r1)
            return
    }

    @Override // android.support.v7.view.menu.h
    boolean a(android.support.v7.view.menu.h r2, android.view.MenuItem r3) {
            r1 = this;
            boolean r0 = super.a(r2, r3)
            if (r0 != 0) goto L11
            android.support.v7.view.menu.h r1 = r1.B
            boolean r1 = r1.a(r2, r3)
            if (r1 == 0) goto Lf
            goto L11
        Lf:
            r1 = 0
            goto L12
        L11:
            r1 = 1
        L12:
            return r1
    }

    @Override // android.support.v7.view.menu.h
    public boolean a(android.support.v7.view.menu.j r1) {
            r0 = this;
            android.support.v7.view.menu.h r0 = r0.B
            boolean r0 = r0.a(r1)
            return r0
    }

    @Override // android.support.v7.view.menu.h
    public boolean b(android.support.v7.view.menu.j r1) {
            r0 = this;
            android.support.v7.view.menu.h r0 = r0.B
            boolean r0 = r0.b(r1)
            return r0
    }

    @Override // android.support.v7.view.menu.h
    public java.lang.String d() {
            r2 = this;
            android.support.v7.view.menu.j r0 = r2.C
            if (r0 == 0) goto L9
            int r0 = r0.getItemId()
            goto La
        L9:
            r0 = 0
        La:
            if (r0 != 0) goto Le
            r2 = 0
            return r2
        Le:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = super.d()
            r1.append(r2)
            java.lang.String r2 = ":"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r2 = r1.toString()
            return r2
    }

    @Override // android.view.SubMenu
    public android.view.MenuItem getItem() {
            r0 = this;
            android.support.v7.view.menu.j r0 = r0.C
            return r0
    }

    @Override // android.support.v7.view.menu.h
    public android.support.v7.view.menu.h m() {
            r0 = this;
            android.support.v7.view.menu.h r0 = r0.B
            android.support.v7.view.menu.h r0 = r0.m()
            return r0
    }

    @Override // android.support.v7.view.menu.h
    public boolean o() {
            r0 = this;
            android.support.v7.view.menu.h r0 = r0.B
            boolean r0 = r0.o()
            return r0
    }

    @Override // android.support.v7.view.menu.h
    public boolean p() {
            r0 = this;
            android.support.v7.view.menu.h r0 = r0.B
            boolean r0 = r0.p()
            return r0
    }

    @Override // android.support.v7.view.menu.h
    public boolean q() {
            r0 = this;
            android.support.v7.view.menu.h r0 = r0.B
            boolean r0 = r0.q()
            return r0
    }

    @Override // android.support.v7.view.menu.h, android.view.Menu
    public void setGroupDividerEnabled(boolean r1) {
            r0 = this;
            android.support.v7.view.menu.h r0 = r0.B
            r0.setGroupDividerEnabled(r1)
            return
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderIcon(int r1) {
            r0 = this;
            super.d(r1)
            android.view.SubMenu r0 = (android.view.SubMenu) r0
            return r0
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.a(r1)
            android.view.SubMenu r0 = (android.view.SubMenu) r0
            return r0
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderTitle(int r1) {
            r0 = this;
            super.e(r1)
            android.view.SubMenu r0 = (android.view.SubMenu) r0
            return r0
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderTitle(java.lang.CharSequence r1) {
            r0 = this;
            super.a(r1)
            android.view.SubMenu r0 = (android.view.SubMenu) r0
            return r0
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderView(android.view.View r1) {
            r0 = this;
            super.a(r1)
            android.view.SubMenu r0 = (android.view.SubMenu) r0
            return r0
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setIcon(int r2) {
            r1 = this;
            android.support.v7.view.menu.j r0 = r1.C
            r0.setIcon(r2)
            return r1
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.support.v7.view.menu.j r0 = r1.C
            r0.setIcon(r2)
            return r1
    }

    @Override // android.support.v7.view.menu.h, android.view.Menu
    public void setQwertyMode(boolean r1) {
            r0 = this;
            android.support.v7.view.menu.h r0 = r0.B
            r0.setQwertyMode(r1)
            return
    }

    public android.view.Menu t() {
            r0 = this;
            android.support.v7.view.menu.h r0 = r0.B
            return r0
    }
}
