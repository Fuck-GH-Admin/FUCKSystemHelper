package android.support.v7.view.menu;

/* JADX INFO: loaded from: classes.dex */
public class a implements b.b.c.c.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f742c;
    private java.lang.CharSequence d;
    private java.lang.CharSequence e;
    private android.content.Intent f;
    private char g;
    private int h;
    private char i;
    private int j;
    private android.graphics.drawable.Drawable k;
    private android.content.Context l;
    private java.lang.CharSequence m;
    private java.lang.CharSequence n;
    private android.content.res.ColorStateList o;
    private android.graphics.PorterDuff.Mode p;
    private boolean q;
    private boolean r;
    private int s;

    public a(android.content.Context r1, int r2, int r3, int r4, int r5, java.lang.CharSequence r6) {
            r0 = this;
            r0.<init>()
            r4 = 4096(0x1000, float:5.74E-42)
            r0.h = r4
            r0.j = r4
            r4 = 0
            r0.o = r4
            r0.p = r4
            r4 = 0
            r0.q = r4
            r0.r = r4
            r4 = 16
            r0.s = r4
            r0.l = r1
            r0.f740a = r3
            r0.f741b = r2
            r0.f742c = r5
            r0.d = r6
            return
    }

    private void b() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.k
            if (r0 == 0) goto L2e
            boolean r0 = r2.q
            if (r0 != 0) goto Lc
            boolean r0 = r2.r
            if (r0 == 0) goto L2e
        Lc:
            android.graphics.drawable.Drawable r0 = r2.k
            android.graphics.drawable.Drawable r0 = android.support.v4.graphics.drawable.a.g(r0)
            r2.k = r0
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r2.k = r0
            boolean r1 = r2.q
            if (r1 == 0) goto L23
            android.content.res.ColorStateList r1 = r2.o
            android.support.v4.graphics.drawable.a.a(r0, r1)
        L23:
            boolean r0 = r2.r
            if (r0 == 0) goto L2e
            android.graphics.drawable.Drawable r0 = r2.k
            android.graphics.PorterDuff$Mode r2 = r2.p
            android.support.v4.graphics.drawable.a.a(r0, r2)
        L2e:
            return
    }

    @Override // b.b.c.c.a.b
    public b.b.c.c.a.b a(b.b.c.g.c r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // b.b.c.c.a.b
    public b.b.c.g.c a() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // b.b.c.c.a.b, android.view.MenuItem
    public boolean collapseActionView() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // b.b.c.c.a.b, android.view.MenuItem
    public boolean expandActionView() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // b.b.c.c.a.b, android.view.MenuItem
    public android.view.View getActionView() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // b.b.c.c.a.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
            r0 = this;
            int r0 = r0.j
            return r0
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
            r0 = this;
            char r0 = r0.i
            return r0
    }

    @Override // b.b.c.c.a.b, android.view.MenuItem
    public java.lang.CharSequence getContentDescription() {
            r0 = this;
            java.lang.CharSequence r0 = r0.m
            return r0
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
            r0 = this;
            int r0 = r0.f741b
            return r0
    }

    @Override // android.view.MenuItem
    public android.graphics.drawable.Drawable getIcon() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.k
            return r0
    }

    @Override // b.b.c.c.a.b, android.view.MenuItem
    public android.content.res.ColorStateList getIconTintList() {
            r0 = this;
            android.content.res.ColorStateList r0 = r0.o
            return r0
    }

    @Override // b.b.c.c.a.b, android.view.MenuItem
    public android.graphics.PorterDuff.Mode getIconTintMode() {
            r0 = this;
            android.graphics.PorterDuff$Mode r0 = r0.p
            return r0
    }

    @Override // android.view.MenuItem
    public android.content.Intent getIntent() {
            r0 = this;
            android.content.Intent r0 = r0.f
            return r0
    }

    @Override // android.view.MenuItem
    public int getItemId() {
            r0 = this;
            int r0 = r0.f740a
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // b.b.c.c.a.b, android.view.MenuItem
    public int getNumericModifiers() {
            r0 = this;
            int r0 = r0.h
            return r0
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
            r0 = this;
            char r0 = r0.g
            return r0
    }

    @Override // android.view.MenuItem
    public int getOrder() {
            r0 = this;
            int r0 = r0.f742c
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.SubMenu getSubMenu() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTitle() {
            r0 = this;
            java.lang.CharSequence r0 = r0.d
            return r0
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTitleCondensed() {
            r1 = this;
            java.lang.CharSequence r0 = r1.e
            if (r0 == 0) goto L5
            goto L7
        L5:
            java.lang.CharSequence r0 = r1.d
        L7:
            return r0
    }

    @Override // b.b.c.c.a.b, android.view.MenuItem
    public java.lang.CharSequence getTooltipText() {
            r0 = this;
            java.lang.CharSequence r0 = r0.n
            return r0
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // b.b.c.c.a.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
            r1 = this;
            int r1 = r1.s
            r0 = 1
            r1 = r1 & r0
            if (r1 == 0) goto L7
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
            r0 = this;
            int r0 = r0.s
            r0 = r0 & 2
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
            r0 = this;
            int r0 = r0.s
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
            r0 = this;
            int r0 = r0.s
            r0 = r0 & 8
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionProvider(android.view.ActionProvider r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // b.b.c.c.a.b, android.view.MenuItem
    public /* bridge */ /* synthetic */ android.view.MenuItem setActionView(int r1) {
            r0 = this;
            r0.setActionView(r1)
            r0 = 0
            throw r0
    }

    @Override // b.b.c.c.a.b, android.view.MenuItem
    public /* bridge */ /* synthetic */ android.view.MenuItem setActionView(android.view.View r1) {
            r0 = this;
            r0.setActionView(r1)
            r0 = 0
            throw r0
    }

    @Override // b.b.c.c.a.b, android.view.MenuItem
    public b.b.c.c.a.b setActionView(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // b.b.c.c.a.b, android.view.MenuItem
    public b.b.c.c.a.b setActionView(android.view.View r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char r1) {
            r0 = this;
            char r1 = java.lang.Character.toLowerCase(r1)
            r0.i = r1
            return r0
    }

    @Override // b.b.c.c.a.b, android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char r1, int r2) {
            r0 = this;
            char r1 = java.lang.Character.toLowerCase(r1)
            r0.i = r1
            int r1 = android.view.KeyEvent.normalizeMetaState(r2)
            r0.j = r1
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setCheckable(boolean r2) {
            r1 = this;
            int r0 = r1.s
            r0 = r0 & (-2)
            r2 = r2 | r0
            r1.s = r2
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setChecked(boolean r2) {
            r1 = this;
            int r0 = r1.s
            r0 = r0 & (-3)
            if (r2 == 0) goto L8
            r2 = 2
            goto L9
        L8:
            r2 = 0
        L9:
            r2 = r2 | r0
            r1.s = r2
            return r1
    }

    @Override // android.view.MenuItem
    public /* bridge */ /* synthetic */ android.view.MenuItem setContentDescription(java.lang.CharSequence r1) {
            r0 = this;
            r0.setContentDescription(r1)
            return r0
    }

    @Override // b.b.c.c.a.b, android.view.MenuItem
    public b.b.c.c.a.b setContentDescription(java.lang.CharSequence r1) {
            r0 = this;
            r0.m = r1
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setEnabled(boolean r2) {
            r1 = this;
            int r0 = r1.s
            r0 = r0 & (-17)
            if (r2 == 0) goto L9
            r2 = 16
            goto La
        L9:
            r2 = 0
        La:
            r2 = r2 | r0
            r1.s = r2
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(int r2) {
            r1 = this;
            android.content.Context r0 = r1.l
            android.graphics.drawable.Drawable r2 = b.b.c.a.a.b(r0, r2)
            r1.k = r2
            r1.b()
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.k = r1
            r0.b()
            return r0
    }

    @Override // b.b.c.c.a.b, android.view.MenuItem
    public android.view.MenuItem setIconTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.o = r1
            r1 = 1
            r0.q = r1
            r0.b()
            return r0
    }

    @Override // b.b.c.c.a.b, android.view.MenuItem
    public android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            r0.p = r1
            r1 = 1
            r0.r = r1
            r0.b()
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIntent(android.content.Intent r1) {
            r0 = this;
            r0.f = r1
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char r1) {
            r0 = this;
            r0.g = r1
            return r0
    }

    @Override // b.b.c.c.a.b, android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char r1, int r2) {
            r0 = this;
            r0.g = r1
            int r1 = android.view.KeyEvent.normalizeMetaState(r2)
            r0.h = r1
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener r1) {
            r0 = this;
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShortcut(char r1, char r2) {
            r0 = this;
            r0.g = r1
            char r1 = java.lang.Character.toLowerCase(r2)
            r0.i = r1
            return r0
    }

    @Override // b.b.c.c.a.b, android.view.MenuItem
    public android.view.MenuItem setShortcut(char r1, char r2, int r3, int r4) {
            r0 = this;
            r0.g = r1
            int r1 = android.view.KeyEvent.normalizeMetaState(r3)
            r0.h = r1
            char r1 = java.lang.Character.toLowerCase(r2)
            r0.i = r1
            int r1 = android.view.KeyEvent.normalizeMetaState(r4)
            r0.j = r1
            return r0
    }

    @Override // b.b.c.c.a.b, android.view.MenuItem
    public void setShowAsAction(int r1) {
            r0 = this;
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
            android.content.Context r0 = r1.l
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r2 = r0.getString(r2)
            r1.d = r2
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.d = r1
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitleCondensed(java.lang.CharSequence r1) {
            r0 = this;
            r0.e = r1
            return r0
    }

    @Override // android.view.MenuItem
    public /* bridge */ /* synthetic */ android.view.MenuItem setTooltipText(java.lang.CharSequence r1) {
            r0 = this;
            r0.setTooltipText(r1)
            return r0
    }

    @Override // b.b.c.c.a.b, android.view.MenuItem
    public b.b.c.c.a.b setTooltipText(java.lang.CharSequence r1) {
            r0 = this;
            r0.n = r1
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setVisible(boolean r3) {
            r2 = this;
            int r0 = r2.s
            r1 = 8
            r0 = r0 & r1
            if (r3 == 0) goto L8
            r1 = 0
        L8:
            r3 = r0 | r1
            r2.s = r3
            return r2
    }
}
