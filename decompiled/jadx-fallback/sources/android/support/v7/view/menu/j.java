package android.support.v7.view.menu;

/* JADX INFO: loaded from: classes.dex */
public final class j implements b.b.c.c.a.b {
    private android.view.View A;
    private b.b.c.g.c B;
    private android.view.MenuItem.OnActionExpandListener C;
    private boolean D;
    private android.view.ContextMenu.ContextMenuInfo E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f770c;
    private final int d;
    private java.lang.CharSequence e;
    private java.lang.CharSequence f;
    private android.content.Intent g;
    private char h;
    private int i;
    private char j;
    private int k;
    private android.graphics.drawable.Drawable l;
    private int m;
    android.support.v7.view.menu.h n;
    private android.support.v7.view.menu.u o;
    private java.lang.Runnable p;
    private android.view.MenuItem.OnMenuItemClickListener q;
    private java.lang.CharSequence r;
    private java.lang.CharSequence s;
    private android.content.res.ColorStateList t;
    private android.graphics.PorterDuff.Mode u;
    private boolean v;
    private boolean w;
    private boolean x;
    private int y;
    private int z;

    class a implements b.b.c.g.c.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.support.v7.view.menu.j f771a;

        a(android.support.v7.view.menu.j r1) {
                r0 = this;
                r0.f771a = r1
                r0.<init>()
                return
        }

        @Override // b.b.c.g.c.b
        public void onActionProviderVisibilityChanged(boolean r1) {
                r0 = this;
                android.support.v7.view.menu.j r0 = r0.f771a
                android.support.v7.view.menu.h r1 = r0.n
                r1.d(r0)
                return
        }
    }

    j(android.support.v7.view.menu.h r3, int r4, int r5, int r6, int r7, java.lang.CharSequence r8, int r9) {
            r2 = this;
            r2.<init>()
            r0 = 4096(0x1000, float:5.74E-42)
            r2.i = r0
            r2.k = r0
            r0 = 0
            r2.m = r0
            r1 = 0
            r2.t = r1
            r2.u = r1
            r2.v = r0
            r2.w = r0
            r2.x = r0
            r1 = 16
            r2.y = r1
            r2.z = r0
            r2.D = r0
            r2.n = r3
            r2.f768a = r5
            r2.f769b = r4
            r2.f770c = r6
            r2.d = r7
            r2.e = r8
            r2.z = r9
            return
    }

    private android.graphics.drawable.Drawable a(android.graphics.drawable.Drawable r2) {
            r1 = this;
            if (r2 == 0) goto L2b
            boolean r0 = r1.x
            if (r0 == 0) goto L2b
            boolean r0 = r1.v
            if (r0 != 0) goto Le
            boolean r0 = r1.w
            if (r0 == 0) goto L2b
        Le:
            android.graphics.drawable.Drawable r2 = android.support.v4.graphics.drawable.a.g(r2)
            android.graphics.drawable.Drawable r2 = r2.mutate()
            boolean r0 = r1.v
            if (r0 == 0) goto L1f
            android.content.res.ColorStateList r0 = r1.t
            android.support.v4.graphics.drawable.a.a(r2, r0)
        L1f:
            boolean r0 = r1.w
            if (r0 == 0) goto L28
            android.graphics.PorterDuff$Mode r0 = r1.u
            android.support.v4.graphics.drawable.a.a(r2, r0)
        L28:
            r0 = 0
            r1.x = r0
        L2b:
            return r2
    }

    private static void a(java.lang.StringBuilder r0, int r1, int r2, java.lang.String r3) {
            r1 = r1 & r2
            if (r1 != r2) goto L6
            r0.append(r3)
        L6:
            return
    }

    @Override // b.b.c.c.a.b
    public b.b.c.c.a.b a(b.b.c.g.c r2) {
            r1 = this;
            b.b.c.g.c r0 = r1.B
            if (r0 == 0) goto L7
            r0.f()
        L7:
            r0 = 0
            r1.A = r0
            r1.B = r2
            android.support.v7.view.menu.h r2 = r1.n
            r0 = 1
            r2.b(r0)
            b.b.c.g.c r2 = r1.B
            if (r2 == 0) goto L1e
            android.support.v7.view.menu.j$a r0 = new android.support.v7.view.menu.j$a
            r0.<init>(r1)
            r2.a(r0)
        L1e:
            return r1
    }

    @Override // b.b.c.c.a.b
    public b.b.c.g.c a() {
            r0 = this;
            b.b.c.g.c r0 = r0.B
            return r0
    }

    java.lang.CharSequence a(android.support.v7.view.menu.p.a r1) {
            r0 = this;
            if (r1 == 0) goto Ld
            boolean r1 = r1.c()
            if (r1 == 0) goto Ld
            java.lang.CharSequence r0 = r0.getTitleCondensed()
            goto L11
        Ld:
            java.lang.CharSequence r0 = r0.getTitle()
        L11:
            return r0
    }

    public void a(android.support.v7.view.menu.u r1) {
            r0 = this;
            r0.o = r1
            java.lang.CharSequence r0 = r0.getTitle()
            r1.setHeaderTitle(r0)
            return
    }

    void a(android.view.ContextMenu.ContextMenuInfo r1) {
            r0 = this;
            r0.E = r1
            return
    }

    public void a(boolean r1) {
            r0 = this;
            r0.D = r1
            android.support.v7.view.menu.h r0 = r0.n
            r1 = 0
            r0.b(r1)
            return
    }

    public void b() {
            r1 = this;
            android.support.v7.view.menu.h r0 = r1.n
            r0.c(r1)
            return
    }

    void b(boolean r4) {
            r3 = this;
            int r0 = r3.y
            r1 = r0 & (-3)
            r2 = 0
            if (r4 == 0) goto L9
            r4 = 2
            goto La
        L9:
            r4 = r2
        La:
            r4 = r4 | r1
            r3.y = r4
            if (r0 == r4) goto L14
            android.support.v7.view.menu.h r3 = r3.n
            r3.b(r2)
        L14:
            return
    }

    public int c() {
            r0 = this;
            int r0 = r0.d
            return r0
    }

    public void c(boolean r2) {
            r1 = this;
            int r0 = r1.y
            r0 = r0 & (-5)
            if (r2 == 0) goto L8
            r2 = 4
            goto L9
        L8:
            r2 = 0
        L9:
            r2 = r2 | r0
            r1.y = r2
            return
    }

    @Override // b.b.c.c.a.b, android.view.MenuItem
    public boolean collapseActionView() {
            r2 = this;
            int r0 = r2.z
            r0 = r0 & 8
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            android.view.View r0 = r2.A
            if (r0 != 0) goto Le
            r2 = 1
            return r2
        Le:
            android.view.MenuItem$OnActionExpandListener r0 = r2.C
            if (r0 == 0) goto L1a
            boolean r0 = r0.onMenuItemActionCollapse(r2)
            if (r0 == 0) goto L19
            goto L1a
        L19:
            return r1
        L1a:
            android.support.v7.view.menu.h r0 = r2.n
            boolean r2 = r0.a(r2)
            return r2
    }

    char d() {
            r1 = this;
            android.support.v7.view.menu.h r0 = r1.n
            boolean r0 = r0.p()
            if (r0 == 0) goto Lb
            char r1 = r1.j
            goto Ld
        Lb:
            char r1 = r1.h
        Ld:
            return r1
    }

    public void d(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L7
            int r1 = r0.y
            r1 = r1 | 32
            goto Lb
        L7:
            int r1 = r0.y
            r1 = r1 & (-33)
        Lb:
            r0.y = r1
            return
    }

    java.lang.String e() {
            r5 = this;
            char r0 = r5.d()
            if (r0 != 0) goto L9
            java.lang.String r5 = ""
            return r5
        L9:
            android.support.v7.view.menu.h r1 = r5.n
            android.content.Context r1 = r1.e()
            android.content.res.Resources r1 = r1.getResources()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.support.v7.view.menu.h r3 = r5.n
            android.content.Context r3 = r3.e()
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            boolean r3 = r3.hasPermanentMenuKey()
            if (r3 == 0) goto L31
            int r3 = b.b.d.a.h.abc_prepend_shortcut_label
            java.lang.String r3 = r1.getString(r3)
            r2.append(r3)
        L31:
            android.support.v7.view.menu.h r3 = r5.n
            boolean r3 = r3.p()
            if (r3 == 0) goto L3c
            int r5 = r5.k
            goto L3e
        L3c:
            int r5 = r5.i
        L3e:
            r3 = 65536(0x10000, float:9.1835E-41)
            int r4 = b.b.d.a.h.abc_menu_meta_shortcut_label
            java.lang.String r4 = r1.getString(r4)
            a(r2, r5, r3, r4)
            r3 = 4096(0x1000, float:5.74E-42)
            int r4 = b.b.d.a.h.abc_menu_ctrl_shortcut_label
            java.lang.String r4 = r1.getString(r4)
            a(r2, r5, r3, r4)
            r3 = 2
            int r4 = b.b.d.a.h.abc_menu_alt_shortcut_label
            java.lang.String r4 = r1.getString(r4)
            a(r2, r5, r3, r4)
            r3 = 1
            int r4 = b.b.d.a.h.abc_menu_shift_shortcut_label
            java.lang.String r4 = r1.getString(r4)
            a(r2, r5, r3, r4)
            r3 = 4
            int r4 = b.b.d.a.h.abc_menu_sym_shortcut_label
            java.lang.String r4 = r1.getString(r4)
            a(r2, r5, r3, r4)
            int r3 = b.b.d.a.h.abc_menu_function_shortcut_label
            java.lang.String r3 = r1.getString(r3)
            r4 = 8
            a(r2, r5, r4, r3)
            if (r0 == r4) goto L91
            r5 = 10
            if (r0 == r5) goto L8e
            r5 = 32
            if (r0 == r5) goto L8b
            r2.append(r0)
            goto L9a
        L8b:
            int r5 = b.b.d.a.h.abc_menu_space_shortcut_label
            goto L93
        L8e:
            int r5 = b.b.d.a.h.abc_menu_enter_shortcut_label
            goto L93
        L91:
            int r5 = b.b.d.a.h.abc_menu_delete_shortcut_label
        L93:
            java.lang.String r5 = r1.getString(r5)
            r2.append(r5)
        L9a:
            java.lang.String r5 = r2.toString()
            return r5
    }

    boolean e(boolean r4) {
            r3 = this;
            int r0 = r3.y
            r1 = r0 & (-9)
            r2 = 0
            if (r4 == 0) goto L9
            r4 = r2
            goto Lb
        L9:
            r4 = 8
        Lb:
            r4 = r4 | r1
            r3.y = r4
            if (r0 == r4) goto L11
            r2 = 1
        L11:
            return r2
    }

    @Override // b.b.c.c.a.b, android.view.MenuItem
    public boolean expandActionView() {
            r2 = this;
            boolean r0 = r2.f()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            android.view.MenuItem$OnActionExpandListener r0 = r2.C
            if (r0 == 0) goto L14
            boolean r0 = r0.onMenuItemActionExpand(r2)
            if (r0 == 0) goto L13
            goto L14
        L13:
            return r1
        L14:
            android.support.v7.view.menu.h r0 = r2.n
            boolean r2 = r0.b(r2)
            return r2
    }

    public boolean f() {
            r2 = this;
            int r0 = r2.z
            r0 = r0 & 8
            r1 = 0
            if (r0 == 0) goto L1a
            android.view.View r0 = r2.A
            if (r0 != 0) goto L15
            b.b.c.g.c r0 = r2.B
            if (r0 == 0) goto L15
            android.view.View r0 = r0.a(r2)
            r2.A = r0
        L15:
            android.view.View r2 = r2.A
            if (r2 == 0) goto L1a
            r1 = 1
        L1a:
            return r1
    }

    public boolean g() {
            r4 = this;
            android.view.MenuItem$OnMenuItemClickListener r0 = r4.q
            r1 = 1
            if (r0 == 0) goto Lc
            boolean r0 = r0.onMenuItemClick(r4)
            if (r0 == 0) goto Lc
            return r1
        Lc:
            android.support.v7.view.menu.h r0 = r4.n
            boolean r0 = r0.a(r0, r4)
            if (r0 == 0) goto L15
            return r1
        L15:
            java.lang.Runnable r0 = r4.p
            if (r0 == 0) goto L1d
            r0.run()
            return r1
        L1d:
            android.content.Intent r0 = r4.g
            if (r0 == 0) goto L35
            android.support.v7.view.menu.h r0 = r4.n     // Catch: android.content.ActivityNotFoundException -> L2d
            android.content.Context r0 = r0.e()     // Catch: android.content.ActivityNotFoundException -> L2d
            android.content.Intent r2 = r4.g     // Catch: android.content.ActivityNotFoundException -> L2d
            r0.startActivity(r2)     // Catch: android.content.ActivityNotFoundException -> L2d
            return r1
        L2d:
            r0 = move-exception
            java.lang.String r2 = "MenuItemImpl"
            java.lang.String r3 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r2, r3, r0)
        L35:
            b.b.c.g.c r4 = r4.B
            if (r4 == 0) goto L40
            boolean r4 = r4.d()
            if (r4 == 0) goto L40
            return r1
        L40:
            r4 = 0
            return r4
    }

    @Override // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "This is not supported, use MenuItemCompat.getActionProvider()"
            r1.<init>(r0)
            throw r1
    }

    @Override // b.b.c.c.a.b, android.view.MenuItem
    public android.view.View getActionView() {
            r1 = this;
            android.view.View r0 = r1.A
            if (r0 == 0) goto L5
            return r0
        L5:
            b.b.c.g.c r0 = r1.B
            if (r0 == 0) goto L10
            android.view.View r0 = r0.a(r1)
            r1.A = r0
            return r0
        L10:
            r1 = 0
            return r1
    }

    @Override // b.b.c.c.a.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
            r0 = this;
            int r0 = r0.k
            return r0
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
            r0 = this;
            char r0 = r0.j
            return r0
    }

    @Override // b.b.c.c.a.b, android.view.MenuItem
    public java.lang.CharSequence getContentDescription() {
            r0 = this;
            java.lang.CharSequence r0 = r0.r
            return r0
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
            r0 = this;
            int r0 = r0.f769b
            return r0
    }

    @Override // android.view.MenuItem
    public android.graphics.drawable.Drawable getIcon() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.l
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r2 = r2.a(r0)
            return r2
        L9:
            int r0 = r2.m
            if (r0 == 0) goto L23
            android.support.v7.view.menu.h r0 = r2.n
            android.content.Context r0 = r0.e()
            int r1 = r2.m
            android.graphics.drawable.Drawable r0 = b.b.d.b.a.a.c(r0, r1)
            r1 = 0
            r2.m = r1
            r2.l = r0
            android.graphics.drawable.Drawable r2 = r2.a(r0)
            return r2
        L23:
            r2 = 0
            return r2
    }

    @Override // b.b.c.c.a.b, android.view.MenuItem
    public android.content.res.ColorStateList getIconTintList() {
            r0 = this;
            android.content.res.ColorStateList r0 = r0.t
            return r0
    }

    @Override // b.b.c.c.a.b, android.view.MenuItem
    public android.graphics.PorterDuff.Mode getIconTintMode() {
            r0 = this;
            android.graphics.PorterDuff$Mode r0 = r0.u
            return r0
    }

    @Override // android.view.MenuItem
    public android.content.Intent getIntent() {
            r0 = this;
            android.content.Intent r0 = r0.g
            return r0
    }

    @Override // android.view.MenuItem
    @android.view.ViewDebug.CapturedViewProperty
    public int getItemId() {
            r0 = this;
            int r0 = r0.f768a
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
            r0 = this;
            android.view.ContextMenu$ContextMenuInfo r0 = r0.E
            return r0
    }

    @Override // b.b.c.c.a.b, android.view.MenuItem
    public int getNumericModifiers() {
            r0 = this;
            int r0 = r0.i
            return r0
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
            r0 = this;
            char r0 = r0.h
            return r0
    }

    @Override // android.view.MenuItem
    public int getOrder() {
            r0 = this;
            int r0 = r0.f770c
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.SubMenu getSubMenu() {
            r0 = this;
            android.support.v7.view.menu.u r0 = r0.o
            return r0
    }

    @Override // android.view.MenuItem
    @android.view.ViewDebug.CapturedViewProperty
    public java.lang.CharSequence getTitle() {
            r0 = this;
            java.lang.CharSequence r0 = r0.e
            return r0
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTitleCondensed() {
            r2 = this;
            java.lang.CharSequence r0 = r2.f
            if (r0 == 0) goto L5
            goto L7
        L5:
            java.lang.CharSequence r0 = r2.e
        L7:
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 18
            if (r2 >= r1) goto L18
            if (r0 == 0) goto L18
            boolean r2 = r0 instanceof java.lang.String
            if (r2 != 0) goto L18
            java.lang.String r2 = r0.toString()
            return r2
        L18:
            return r0
    }

    @Override // b.b.c.c.a.b, android.view.MenuItem
    public java.lang.CharSequence getTooltipText() {
            r0 = this;
            java.lang.CharSequence r0 = r0.s
            return r0
    }

    public boolean h() {
            r1 = this;
            int r1 = r1.y
            r0 = 32
            r1 = r1 & r0
            if (r1 != r0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
            r0 = this;
            android.support.v7.view.menu.u r0 = r0.o
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean i() {
            r0 = this;
            int r0 = r0.y
            r0 = r0 & 4
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // b.b.c.c.a.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
            r0 = this;
            boolean r0 = r0.D
            return r0
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
            r1 = this;
            int r1 = r1.y
            r0 = 1
            r1 = r1 & r0
            if (r1 != r0) goto L7
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
            r1 = this;
            int r1 = r1.y
            r0 = 2
            r1 = r1 & r0
            if (r1 != r0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
            r0 = this;
            int r0 = r0.y
            r0 = r0 & 16
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
            r3 = this;
            b.b.c.g.c r0 = r3.B
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1d
            boolean r0 = r0.e()
            if (r0 == 0) goto L1d
            int r0 = r3.y
            r0 = r0 & 8
            if (r0 != 0) goto L1b
            b.b.c.g.c r3 = r3.B
            boolean r3 = r3.b()
            if (r3 == 0) goto L1b
            goto L1c
        L1b:
            r1 = r2
        L1c:
            return r1
        L1d:
            int r3 = r3.y
            r3 = r3 & 8
            if (r3 != 0) goto L24
            goto L25
        L24:
            r1 = r2
        L25:
            return r1
    }

    public boolean j() {
            r1 = this;
            int r1 = r1.z
            r0 = 1
            r1 = r1 & r0
            if (r1 != r0) goto L7
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public boolean k() {
            r1 = this;
            int r1 = r1.z
            r0 = 2
            r1 = r1 & r0
            if (r1 != r0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    public boolean l() {
            r0 = this;
            android.support.v7.view.menu.h r0 = r0.n
            boolean r0 = r0.k()
            return r0
    }

    boolean m() {
            r1 = this;
            android.support.v7.view.menu.h r0 = r1.n
            boolean r0 = r0.q()
            if (r0 == 0) goto L10
            char r1 = r1.d()
            if (r1 == 0) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
    }

    public boolean n() {
            r1 = this;
            int r1 = r1.z
            r0 = 4
            r1 = r1 & r0
            if (r1 != r0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionProvider(android.view.ActionProvider r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "This is not supported, use MenuItemCompat.setActionProvider()"
            r0.<init>(r1)
            throw r0
    }

    @Override // b.b.c.c.a.b, android.view.MenuItem
    public /* bridge */ /* synthetic */ android.view.MenuItem setActionView(int r1) {
            r0 = this;
            r0.setActionView(r1)
            return r0
    }

    @Override // b.b.c.c.a.b, android.view.MenuItem
    public /* bridge */ /* synthetic */ android.view.MenuItem setActionView(android.view.View r1) {
            r0 = this;
            r0.setActionView(r1)
            return r0
    }

    @Override // b.b.c.c.a.b, android.view.MenuItem
    public b.b.c.c.a.b setActionView(int r4) {
            r3 = this;
            android.support.v7.view.menu.h r0 = r3.n
            android.content.Context r0 = r0.e()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r0)
            r0 = 0
            android.view.View r4 = r1.inflate(r4, r2, r0)
            r3.setActionView(r4)
            return r3
    }

    @Override // b.b.c.c.a.b, android.view.MenuItem
    public b.b.c.c.a.b setActionView(android.view.View r3) {
            r2 = this;
            r2.A = r3
            r0 = 0
            r2.B = r0
            if (r3 == 0) goto L15
            int r0 = r3.getId()
            r1 = -1
            if (r0 != r1) goto L15
            int r0 = r2.f768a
            if (r0 <= 0) goto L15
            r3.setId(r0)
        L15:
            android.support.v7.view.menu.h r3 = r2.n
            r3.c(r2)
            return r2
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char r2) {
            r1 = this;
            char r0 = r1.j
            if (r0 != r2) goto L5
            return r1
        L5:
            char r2 = java.lang.Character.toLowerCase(r2)
            r1.j = r2
            android.support.v7.view.menu.h r2 = r1.n
            r0 = 0
            r2.b(r0)
            return r1
    }

    @Override // b.b.c.c.a.b, android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char r2, int r3) {
            r1 = this;
            char r0 = r1.j
            if (r0 != r2) goto L9
            int r0 = r1.k
            if (r0 != r3) goto L9
            return r1
        L9:
            char r2 = java.lang.Character.toLowerCase(r2)
            r1.j = r2
            int r2 = android.view.KeyEvent.normalizeMetaState(r3)
            r1.k = r2
            android.support.v7.view.menu.h r2 = r1.n
            r3 = 0
            r2.b(r3)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setCheckable(boolean r3) {
            r2 = this;
            int r0 = r2.y
            r1 = r0 & (-2)
            r3 = r3 | r1
            r2.y = r3
            if (r0 == r3) goto Lf
            android.support.v7.view.menu.h r3 = r2.n
            r0 = 0
            r3.b(r0)
        Lf:
            return r2
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setChecked(boolean r2) {
            r1 = this;
            int r0 = r1.y
            r0 = r0 & 4
            if (r0 == 0) goto Lc
            android.support.v7.view.menu.h r2 = r1.n
            r2.a(r1)
            goto Lf
        Lc:
            r1.b(r2)
        Lf:
            return r1
    }

    @Override // android.view.MenuItem
    public /* bridge */ /* synthetic */ android.view.MenuItem setContentDescription(java.lang.CharSequence r1) {
            r0 = this;
            r0.setContentDescription(r1)
            return r0
    }

    @Override // b.b.c.c.a.b, android.view.MenuItem
    public b.b.c.c.a.b setContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            r1.r = r2
            android.support.v7.view.menu.h r2 = r1.n
            r0 = 0
            r2.b(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setEnabled(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L7
            int r2 = r1.y
            r2 = r2 | 16
            goto Lb
        L7:
            int r2 = r1.y
            r2 = r2 & (-17)
        Lb:
            r1.y = r2
            android.support.v7.view.menu.h r2 = r1.n
            r0 = 0
            r2.b(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(int r2) {
            r1 = this;
            r0 = 0
            r1.l = r0
            r1.m = r2
            r2 = 1
            r1.x = r2
            android.support.v7.view.menu.h r2 = r1.n
            r0 = 0
            r2.b(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r0 = 0
            r1.m = r0
            r1.l = r2
            r2 = 1
            r1.x = r2
            android.support.v7.view.menu.h r2 = r1.n
            r2.b(r0)
            return r1
    }

    @Override // b.b.c.c.a.b, android.view.MenuItem
    public android.view.MenuItem setIconTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            r1.t = r2
            r2 = 1
            r1.v = r2
            r1.x = r2
            android.support.v7.view.menu.h r2 = r1.n
            r0 = 0
            r2.b(r0)
            return r1
    }

    @Override // b.b.c.c.a.b, android.view.MenuItem
    public android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            r1.u = r2
            r2 = 1
            r1.w = r2
            r1.x = r2
            android.support.v7.view.menu.h r2 = r1.n
            r0 = 0
            r2.b(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIntent(android.content.Intent r1) {
            r0 = this;
            r0.g = r1
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char r2) {
            r1 = this;
            char r0 = r1.h
            if (r0 != r2) goto L5
            return r1
        L5:
            r1.h = r2
            android.support.v7.view.menu.h r2 = r1.n
            r0 = 0
            r2.b(r0)
            return r1
    }

    @Override // b.b.c.c.a.b, android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char r2, int r3) {
            r1 = this;
            char r0 = r1.h
            if (r0 != r2) goto L9
            int r0 = r1.i
            if (r0 != r3) goto L9
            return r1
        L9:
            r1.h = r2
            int r2 = android.view.KeyEvent.normalizeMetaState(r3)
            r1.i = r2
            android.support.v7.view.menu.h r2 = r1.n
            r3 = 0
            r2.b(r3)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener r1) {
            r0 = this;
            r0.C = r1
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener r1) {
            r0 = this;
            r0.q = r1
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShortcut(char r1, char r2) {
            r0 = this;
            r0.h = r1
            char r1 = java.lang.Character.toLowerCase(r2)
            r0.j = r1
            android.support.v7.view.menu.h r1 = r0.n
            r2 = 0
            r1.b(r2)
            return r0
    }

    @Override // b.b.c.c.a.b, android.view.MenuItem
    public android.view.MenuItem setShortcut(char r1, char r2, int r3, int r4) {
            r0 = this;
            r0.h = r1
            int r1 = android.view.KeyEvent.normalizeMetaState(r3)
            r0.i = r1
            char r1 = java.lang.Character.toLowerCase(r2)
            r0.j = r1
            int r1 = android.view.KeyEvent.normalizeMetaState(r4)
            r0.k = r1
            android.support.v7.view.menu.h r1 = r0.n
            r2 = 0
            r1.b(r2)
            return r0
    }

    @Override // b.b.c.c.a.b, android.view.MenuItem
    public void setShowAsAction(int r3) {
            r2 = this;
            r0 = r3 & 3
            if (r0 == 0) goto L13
            r1 = 1
            if (r0 == r1) goto L13
            r1 = 2
            if (r0 != r1) goto Lb
            goto L13
        Lb:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive."
            r2.<init>(r3)
            throw r2
        L13:
            r2.z = r3
            android.support.v7.view.menu.h r3 = r2.n
            r3.c(r2)
            return
    }

    @Override // b.b.c.c.a.b, android.view.MenuItem
    public /* bridge */ /* synthetic */ android.view.MenuItem setShowAsActionFlags(int r1) {
            r0 = this;
            r0.setShowAsActionFlags(r1)
            return r0
    }

    @Override // b.b.c.c.a.b, android.view.MenuItem
    public b.b.c.c.a.b setShowAsActionFlags(int r1) {
            r0 = this;
            r0.setShowAsAction(r1)
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(int r2) {
            r1 = this;
            android.support.v7.view.menu.h r0 = r1.n
            android.content.Context r0 = r0.e()
            java.lang.String r2 = r0.getString(r2)
            r1.setTitle(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(java.lang.CharSequence r3) {
            r2 = this;
            r2.e = r3
            android.support.v7.view.menu.h r0 = r2.n
            r1 = 0
            r0.b(r1)
            android.support.v7.view.menu.u r0 = r2.o
            if (r0 == 0) goto Lf
            r0.setHeaderTitle(r3)
        Lf:
            return r2
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitleCondensed(java.lang.CharSequence r2) {
            r1 = this;
            r1.f = r2
            android.support.v7.view.menu.h r2 = r1.n
            r0 = 0
            r2.b(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public /* bridge */ /* synthetic */ android.view.MenuItem setTooltipText(java.lang.CharSequence r1) {
            r0 = this;
            r0.setTooltipText(r1)
            return r0
    }

    @Override // b.b.c.c.a.b, android.view.MenuItem
    public b.b.c.c.a.b setTooltipText(java.lang.CharSequence r2) {
            r1 = this;
            r1.s = r2
            android.support.v7.view.menu.h r2 = r1.n
            r0 = 0
            r2.b(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setVisible(boolean r1) {
            r0 = this;
            boolean r1 = r0.e(r1)
            if (r1 == 0) goto Lb
            android.support.v7.view.menu.h r1 = r0.n
            r1.d(r0)
        Lb:
            return r0
    }

    public java.lang.String toString() {
            r0 = this;
            java.lang.CharSequence r0 = r0.e
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.toString()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }
}
