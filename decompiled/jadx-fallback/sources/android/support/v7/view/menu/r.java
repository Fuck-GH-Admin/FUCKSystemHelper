package android.support.v7.view.menu;

/* JADX INFO: loaded from: classes.dex */
class r extends android.support.v7.view.menu.c<b.b.c.c.a.a> implements android.view.Menu {
    r(android.content.Context r1, b.b.c.c.a.a r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int r2) {
            r1 = this;
            T r0 = r1.f747a
            b.b.c.c.a.a r0 = (b.b.c.c.a.a) r0
            android.view.MenuItem r2 = r0.add(r2)
            android.view.MenuItem r1 = r1.a(r2)
            return r1
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int r2, int r3, int r4, int r5) {
            r1 = this;
            T r0 = r1.f747a
            b.b.c.c.a.a r0 = (b.b.c.c.a.a) r0
            android.view.MenuItem r2 = r0.add(r2, r3, r4, r5)
            android.view.MenuItem r1 = r1.a(r2)
            return r1
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int r2, int r3, int r4, java.lang.CharSequence r5) {
            r1 = this;
            T r0 = r1.f747a
            b.b.c.c.a.a r0 = (b.b.c.c.a.a) r0
            android.view.MenuItem r2 = r0.add(r2, r3, r4, r5)
            android.view.MenuItem r1 = r1.a(r2)
            return r1
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(java.lang.CharSequence r2) {
            r1 = this;
            T r0 = r1.f747a
            b.b.c.c.a.a r0 = (b.b.c.c.a.a) r0
            android.view.MenuItem r2 = r0.add(r2)
            android.view.MenuItem r1 = r1.a(r2)
            return r1
    }

    @Override // android.view.Menu
    public int addIntentOptions(int r13, int r14, int r15, android.content.ComponentName r16, android.content.Intent[] r17, android.content.Intent r18, int r19, android.view.MenuItem[] r20) {
            r12 = this;
            r0 = r12
            r1 = r20
            if (r1 == 0) goto L9
            int r2 = r1.length
            android.view.MenuItem[] r2 = new android.view.MenuItem[r2]
            goto La
        L9:
            r2 = 0
        La:
            T r3 = r0.f747a
            b.b.c.c.a.a r3 = (b.b.c.c.a.a) r3
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r11 = r2
            int r3 = r3.addIntentOptions(r4, r5, r6, r7, r8, r9, r10, r11)
            if (r2 == 0) goto L2f
            r4 = 0
            int r5 = r2.length
        L22:
            if (r4 >= r5) goto L2f
            r6 = r2[r4]
            android.view.MenuItem r6 = r12.a(r6)
            r1[r4] = r6
            int r4 = r4 + 1
            goto L22
        L2f:
            return r3
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int r2) {
            r1 = this;
            T r0 = r1.f747a
            b.b.c.c.a.a r0 = (b.b.c.c.a.a) r0
            android.view.SubMenu r2 = r0.addSubMenu(r2)
            android.view.SubMenu r1 = r1.a(r2)
            return r1
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int r2, int r3, int r4, int r5) {
            r1 = this;
            T r0 = r1.f747a
            b.b.c.c.a.a r0 = (b.b.c.c.a.a) r0
            android.view.SubMenu r2 = r0.addSubMenu(r2, r3, r4, r5)
            android.view.SubMenu r1 = r1.a(r2)
            return r1
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int r2, int r3, int r4, java.lang.CharSequence r5) {
            r1 = this;
            T r0 = r1.f747a
            b.b.c.c.a.a r0 = (b.b.c.c.a.a) r0
            android.view.SubMenu r2 = r0.addSubMenu(r2, r3, r4, r5)
            android.view.SubMenu r1 = r1.a(r2)
            return r1
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(java.lang.CharSequence r2) {
            r1 = this;
            T r0 = r1.f747a
            b.b.c.c.a.a r0 = (b.b.c.c.a.a) r0
            android.view.SubMenu r2 = r0.addSubMenu(r2)
            android.view.SubMenu r1 = r1.a(r2)
            return r1
    }

    @Override // android.view.Menu
    public void clear() {
            r0 = this;
            r0.b()
            T r0 = r0.f747a
            b.b.c.c.a.a r0 = (b.b.c.c.a.a) r0
            r0.clear()
            return
    }

    @Override // android.view.Menu
    public void close() {
            r0 = this;
            T r0 = r0.f747a
            b.b.c.c.a.a r0 = (b.b.c.c.a.a) r0
            r0.close()
            return
    }

    @Override // android.view.Menu
    public android.view.MenuItem findItem(int r2) {
            r1 = this;
            T r0 = r1.f747a
            b.b.c.c.a.a r0 = (b.b.c.c.a.a) r0
            android.view.MenuItem r2 = r0.findItem(r2)
            android.view.MenuItem r1 = r1.a(r2)
            return r1
    }

    @Override // android.view.Menu
    public android.view.MenuItem getItem(int r2) {
            r1 = this;
            T r0 = r1.f747a
            b.b.c.c.a.a r0 = (b.b.c.c.a.a) r0
            android.view.MenuItem r2 = r0.getItem(r2)
            android.view.MenuItem r1 = r1.a(r2)
            return r1
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
            r0 = this;
            T r0 = r0.f747a
            b.b.c.c.a.a r0 = (b.b.c.c.a.a) r0
            boolean r0 = r0.hasVisibleItems()
            return r0
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int r1, android.view.KeyEvent r2) {
            r0 = this;
            T r0 = r0.f747a
            b.b.c.c.a.a r0 = (b.b.c.c.a.a) r0
            boolean r0 = r0.isShortcutKey(r1, r2)
            return r0
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int r1, int r2) {
            r0 = this;
            T r0 = r0.f747a
            b.b.c.c.a.a r0 = (b.b.c.c.a.a) r0
            boolean r0 = r0.performIdentifierAction(r1, r2)
            return r0
    }

    @Override // android.view.Menu
    public boolean performShortcut(int r1, android.view.KeyEvent r2, int r3) {
            r0 = this;
            T r0 = r0.f747a
            b.b.c.c.a.a r0 = (b.b.c.c.a.a) r0
            boolean r0 = r0.performShortcut(r1, r2, r3)
            return r0
    }

    @Override // android.view.Menu
    public void removeGroup(int r1) {
            r0 = this;
            r0.a(r1)
            T r0 = r0.f747a
            b.b.c.c.a.a r0 = (b.b.c.c.a.a) r0
            r0.removeGroup(r1)
            return
    }

    @Override // android.view.Menu
    public void removeItem(int r1) {
            r0 = this;
            r0.b(r1)
            T r0 = r0.f747a
            b.b.c.c.a.a r0 = (b.b.c.c.a.a) r0
            r0.removeItem(r1)
            return
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int r1, boolean r2, boolean r3) {
            r0 = this;
            T r0 = r0.f747a
            b.b.c.c.a.a r0 = (b.b.c.c.a.a) r0
            r0.setGroupCheckable(r1, r2, r3)
            return
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int r1, boolean r2) {
            r0 = this;
            T r0 = r0.f747a
            b.b.c.c.a.a r0 = (b.b.c.c.a.a) r0
            r0.setGroupEnabled(r1, r2)
            return
    }

    @Override // android.view.Menu
    public void setGroupVisible(int r1, boolean r2) {
            r0 = this;
            T r0 = r0.f747a
            b.b.c.c.a.a r0 = (b.b.c.c.a.a) r0
            r0.setGroupVisible(r1, r2)
            return
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean r1) {
            r0 = this;
            T r0 = r0.f747a
            b.b.c.c.a.a r0 = (b.b.c.c.a.a) r0
            r0.setQwertyMode(r1)
            return
    }

    @Override // android.view.Menu
    public int size() {
            r0 = this;
            T r0 = r0.f747a
            b.b.c.c.a.a r0 = (b.b.c.c.a.a) r0
            int r0 = r0.size()
            return r0
    }
}
