package android.support.v7.view.menu;

/* JADX INFO: loaded from: classes.dex */
public class k extends android.support.v7.view.menu.c<b.b.c.c.a.b> implements android.view.MenuItem {
    private java.lang.reflect.Method e;

    class a extends b.b.c.g.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final android.view.ActionProvider f772b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.support.v7.view.menu.k f773c;

        public a(android.support.v7.view.menu.k r1, android.content.Context r2, android.view.ActionProvider r3) {
                r0 = this;
                r0.f773c = r1
                r0.<init>(r2)
                r0.f772b = r3
                return
        }

        @Override // b.b.c.g.c
        public void a(android.view.SubMenu r2) {
                r1 = this;
                android.view.ActionProvider r0 = r1.f772b
                android.support.v7.view.menu.k r1 = r1.f773c
                android.view.SubMenu r1 = r1.a(r2)
                r0.onPrepareSubMenu(r1)
                return
        }

        @Override // b.b.c.g.c
        public boolean a() {
                r0 = this;
                android.view.ActionProvider r0 = r0.f772b
                boolean r0 = r0.hasSubMenu()
                return r0
        }

        @Override // b.b.c.g.c
        public android.view.View c() {
                r0 = this;
                android.view.ActionProvider r0 = r0.f772b
                android.view.View r0 = r0.onCreateActionView()
                return r0
        }

        @Override // b.b.c.g.c
        public boolean d() {
                r0 = this;
                android.view.ActionProvider r0 = r0.f772b
                boolean r0 = r0.onPerformDefaultAction()
                return r0
        }
    }

    static class b extends android.widget.FrameLayout implements b.b.d.d.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final android.view.CollapsibleActionView f774b;

        b(android.view.View r2) {
                r1 = this;
                android.content.Context r0 = r2.getContext()
                r1.<init>(r0)
                r0 = r2
                android.view.CollapsibleActionView r0 = (android.view.CollapsibleActionView) r0
                r1.f774b = r0
                r1.addView(r2)
                return
        }

        @Override // b.b.d.d.c
        public void a() {
                r0 = this;
                android.view.CollapsibleActionView r0 = r0.f774b
                r0.onActionViewExpanded()
                return
        }

        @Override // b.b.d.d.c
        public void b() {
                r0 = this;
                android.view.CollapsibleActionView r0 = r0.f774b
                r0.onActionViewCollapsed()
                return
        }

        android.view.View c() {
                r0 = this;
                android.view.CollapsibleActionView r0 = r0.f774b
                android.view.View r0 = (android.view.View) r0
                return r0
        }
    }

    private class c extends android.support.v7.view.menu.d<android.view.MenuItem.OnActionExpandListener> implements android.view.MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.support.v7.view.menu.k f775b;

        c(android.support.v7.view.menu.k r1, android.view.MenuItem.OnActionExpandListener r2) {
                r0 = this;
                r0.f775b = r1
                r0.<init>(r2)
                return
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(android.view.MenuItem r2) {
                r1 = this;
                T r0 = r1.f747a
                android.view.MenuItem$OnActionExpandListener r0 = (android.view.MenuItem.OnActionExpandListener) r0
                android.support.v7.view.menu.k r1 = r1.f775b
                android.view.MenuItem r1 = r1.a(r2)
                boolean r1 = r0.onMenuItemActionCollapse(r1)
                return r1
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(android.view.MenuItem r2) {
                r1 = this;
                T r0 = r1.f747a
                android.view.MenuItem$OnActionExpandListener r0 = (android.view.MenuItem.OnActionExpandListener) r0
                android.support.v7.view.menu.k r1 = r1.f775b
                android.view.MenuItem r1 = r1.a(r2)
                boolean r1 = r0.onMenuItemActionExpand(r1)
                return r1
        }
    }

    private class d extends android.support.v7.view.menu.d<android.view.MenuItem.OnMenuItemClickListener> implements android.view.MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.support.v7.view.menu.k f776b;

        d(android.support.v7.view.menu.k r1, android.view.MenuItem.OnMenuItemClickListener r2) {
                r0 = this;
                r0.f776b = r1
                r0.<init>(r2)
                return
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(android.view.MenuItem r2) {
                r1 = this;
                T r0 = r1.f747a
                android.view.MenuItem$OnMenuItemClickListener r0 = (android.view.MenuItem.OnMenuItemClickListener) r0
                android.support.v7.view.menu.k r1 = r1.f776b
                android.view.MenuItem r1 = r1.a(r2)
                boolean r1 = r0.onMenuItemClick(r1)
                return r1
        }
    }

    k(android.content.Context r1, b.b.c.c.a.b r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    android.support.v7.view.menu.k.a a(android.view.ActionProvider r3) {
            r2 = this;
            android.support.v7.view.menu.k$a r0 = new android.support.v7.view.menu.k$a
            android.content.Context r1 = r2.f745b
            r0.<init>(r2, r1, r3)
            return r0
    }

    public void a(boolean r7) {
            r6 = this;
            java.lang.reflect.Method r0 = r6.e     // Catch: java.lang.Exception -> L2c
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L1c
            T r0 = r6.f747a     // Catch: java.lang.Exception -> L2c
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0     // Catch: java.lang.Exception -> L2c
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Exception -> L2c
            java.lang.String r3 = "setExclusiveCheckable"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L2c
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: java.lang.Exception -> L2c
            r4[r1] = r5     // Catch: java.lang.Exception -> L2c
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r4)     // Catch: java.lang.Exception -> L2c
            r6.e = r0     // Catch: java.lang.Exception -> L2c
        L1c:
            java.lang.reflect.Method r0 = r6.e     // Catch: java.lang.Exception -> L2c
            T r6 = r6.f747a     // Catch: java.lang.Exception -> L2c
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L2c
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Exception -> L2c
            r2[r1] = r7     // Catch: java.lang.Exception -> L2c
            r0.invoke(r6, r2)     // Catch: java.lang.Exception -> L2c
            goto L34
        L2c:
            r6 = move-exception
            java.lang.String r7 = "MenuItemWrapper"
            java.lang.String r0 = "Error while calling setExclusiveCheckable"
            android.util.Log.w(r7, r0, r6)
        L34:
            return
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
            r0 = this;
            T r0 = r0.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            boolean r0 = r0.collapseActionView()
            return r0
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
            r0 = this;
            T r0 = r0.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            boolean r0 = r0.expandActionView()
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
            r1 = this;
            T r1 = r1.f747a
            b.b.c.c.a.b r1 = (b.b.c.c.a.b) r1
            b.b.c.g.c r1 = r1.a()
            boolean r0 = r1 instanceof android.support.v7.view.menu.k.a
            if (r0 == 0) goto L11
            android.support.v7.view.menu.k$a r1 = (android.support.v7.view.menu.k.a) r1
            android.view.ActionProvider r1 = r1.f772b
            return r1
        L11:
            r1 = 0
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.View getActionView() {
            r1 = this;
            T r1 = r1.f747a
            b.b.c.c.a.b r1 = (b.b.c.c.a.b) r1
            android.view.View r1 = r1.getActionView()
            boolean r0 = r1 instanceof android.support.v7.view.menu.k.b
            if (r0 == 0) goto L12
            android.support.v7.view.menu.k$b r1 = (android.support.v7.view.menu.k.b) r1
            android.view.View r1 = r1.c()
        L12:
            return r1
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
            r0 = this;
            T r0 = r0.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            int r0 = r0.getAlphabeticModifiers()
            return r0
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
            r0 = this;
            T r0 = r0.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            char r0 = r0.getAlphabeticShortcut()
            return r0
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getContentDescription() {
            r0 = this;
            T r0 = r0.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
            r0 = this;
            T r0 = r0.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            int r0 = r0.getGroupId()
            return r0
    }

    @Override // android.view.MenuItem
    public android.graphics.drawable.Drawable getIcon() {
            r0 = this;
            T r0 = r0.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            android.graphics.drawable.Drawable r0 = r0.getIcon()
            return r0
    }

    @Override // android.view.MenuItem
    public android.content.res.ColorStateList getIconTintList() {
            r0 = this;
            T r0 = r0.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            android.content.res.ColorStateList r0 = r0.getIconTintList()
            return r0
    }

    @Override // android.view.MenuItem
    public android.graphics.PorterDuff.Mode getIconTintMode() {
            r0 = this;
            T r0 = r0.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            android.graphics.PorterDuff$Mode r0 = r0.getIconTintMode()
            return r0
    }

    @Override // android.view.MenuItem
    public android.content.Intent getIntent() {
            r0 = this;
            T r0 = r0.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            android.content.Intent r0 = r0.getIntent()
            return r0
    }

    @Override // android.view.MenuItem
    public int getItemId() {
            r0 = this;
            T r0 = r0.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            int r0 = r0.getItemId()
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
            r0 = this;
            T r0 = r0.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            android.view.ContextMenu$ContextMenuInfo r0 = r0.getMenuInfo()
            return r0
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
            r0 = this;
            T r0 = r0.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            int r0 = r0.getNumericModifiers()
            return r0
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
            r0 = this;
            T r0 = r0.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            char r0 = r0.getNumericShortcut()
            return r0
    }

    @Override // android.view.MenuItem
    public int getOrder() {
            r0 = this;
            T r0 = r0.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            int r0 = r0.getOrder()
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.SubMenu getSubMenu() {
            r1 = this;
            T r0 = r1.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            android.view.SubMenu r0 = r0.getSubMenu()
            android.view.SubMenu r1 = r1.a(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTitle() {
            r0 = this;
            T r0 = r0.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTitleCondensed() {
            r0 = this;
            T r0 = r0.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            java.lang.CharSequence r0 = r0.getTitleCondensed()
            return r0
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTooltipText() {
            r0 = this;
            T r0 = r0.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            java.lang.CharSequence r0 = r0.getTooltipText()
            return r0
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
            r0 = this;
            T r0 = r0.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            boolean r0 = r0.hasSubMenu()
            return r0
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
            r0 = this;
            T r0 = r0.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            boolean r0 = r0.isActionViewExpanded()
            return r0
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
            r0 = this;
            T r0 = r0.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            boolean r0 = r0.isCheckable()
            return r0
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
            r0 = this;
            T r0 = r0.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            boolean r0 = r0.isChecked()
            return r0
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
            r0 = this;
            T r0 = r0.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            boolean r0 = r0.isEnabled()
            return r0
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
            r0 = this;
            T r0 = r0.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            boolean r0 = r0.isVisible()
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionProvider(android.view.ActionProvider r2) {
            r1 = this;
            T r0 = r1.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            if (r2 == 0) goto Lb
            android.support.v7.view.menu.k$a r2 = r1.a(r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r0.a(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionView(int r3) {
            r2 = this;
            T r0 = r2.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            r0.setActionView(r3)
            T r3 = r2.f747a
            b.b.c.c.a.b r3 = (b.b.c.c.a.b) r3
            android.view.View r3 = r3.getActionView()
            boolean r0 = r3 instanceof android.view.CollapsibleActionView
            if (r0 == 0) goto L1f
            T r0 = r2.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            android.support.v7.view.menu.k$b r1 = new android.support.v7.view.menu.k$b
            r1.<init>(r3)
            r0.setActionView(r1)
        L1f:
            return r2
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionView(android.view.View r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.view.CollapsibleActionView
            if (r0 == 0) goto La
            android.support.v7.view.menu.k$b r0 = new android.support.v7.view.menu.k$b
            r0.<init>(r2)
            r2 = r0
        La:
            T r0 = r1.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            r0.setActionView(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char r2) {
            r1 = this;
            T r0 = r1.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            r0.setAlphabeticShortcut(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char r2, int r3) {
            r1 = this;
            T r0 = r1.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            r0.setAlphabeticShortcut(r2, r3)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setCheckable(boolean r2) {
            r1 = this;
            T r0 = r1.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            r0.setCheckable(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setChecked(boolean r2) {
            r1 = this;
            T r0 = r1.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            r0.setChecked(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            T r0 = r1.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            r0.setContentDescription(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setEnabled(boolean r2) {
            r1 = this;
            T r0 = r1.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            r0.setEnabled(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(int r2) {
            r1 = this;
            T r0 = r1.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            r0.setIcon(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            T r0 = r1.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            r0.setIcon(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIconTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            T r0 = r1.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            r0.setIconTintList(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            T r0 = r1.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            r0.setIconTintMode(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIntent(android.content.Intent r2) {
            r1 = this;
            T r0 = r1.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            r0.setIntent(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char r2) {
            r1 = this;
            T r0 = r1.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            r0.setNumericShortcut(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char r2, int r3) {
            r1 = this;
            T r0 = r1.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            r0.setNumericShortcut(r2, r3)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener r3) {
            r2 = this;
            T r0 = r2.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            if (r3 == 0) goto Lc
            android.support.v7.view.menu.k$c r1 = new android.support.v7.view.menu.k$c
            r1.<init>(r2, r3)
            goto Ld
        Lc:
            r1 = 0
        Ld:
            r0.setOnActionExpandListener(r1)
            return r2
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener r3) {
            r2 = this;
            T r0 = r2.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            if (r3 == 0) goto Lc
            android.support.v7.view.menu.k$d r1 = new android.support.v7.view.menu.k$d
            r1.<init>(r2, r3)
            goto Ld
        Lc:
            r1 = 0
        Ld:
            r0.setOnMenuItemClickListener(r1)
            return r2
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShortcut(char r2, char r3) {
            r1 = this;
            T r0 = r1.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            r0.setShortcut(r2, r3)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShortcut(char r2, char r3, int r4, int r5) {
            r1 = this;
            T r0 = r1.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            r0.setShortcut(r2, r3, r4, r5)
            return r1
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int r1) {
            r0 = this;
            T r0 = r0.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            r0.setShowAsAction(r1)
            return
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShowAsActionFlags(int r2) {
            r1 = this;
            T r0 = r1.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            r0.setShowAsActionFlags(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(int r2) {
            r1 = this;
            T r0 = r1.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            r0.setTitle(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(java.lang.CharSequence r2) {
            r1 = this;
            T r0 = r1.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            r0.setTitle(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitleCondensed(java.lang.CharSequence r2) {
            r1 = this;
            T r0 = r1.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            r0.setTitleCondensed(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTooltipText(java.lang.CharSequence r2) {
            r1 = this;
            T r0 = r1.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            r0.setTooltipText(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setVisible(boolean r1) {
            r0 = this;
            T r0 = r0.f747a
            b.b.c.c.a.b r0 = (b.b.c.c.a.b) r0
            android.view.MenuItem r0 = r0.setVisible(r1)
            return r0
    }
}
