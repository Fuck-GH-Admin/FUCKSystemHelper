package android.support.v7.view.menu;

/* JADX INFO: loaded from: classes.dex */
abstract class m implements android.support.v7.view.menu.s, android.support.v7.view.menu.o, android.widget.AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.graphics.Rect f777b;

    m() {
            r0 = this;
            r0.<init>()
            return
    }

    protected static int a(android.widget.ListAdapter r9, android.view.ViewGroup r10, android.content.Context r11, int r12) {
            r0 = 0
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            int r3 = r9.getCount()
            r4 = 0
            r5 = r0
            r6 = r5
            r7 = r4
        L11:
            if (r0 >= r3) goto L36
            int r8 = r9.getItemViewType(r0)
            if (r8 == r6) goto L1b
            r7 = r4
            r6 = r8
        L1b:
            if (r10 != 0) goto L22
            android.widget.FrameLayout r10 = new android.widget.FrameLayout
            r10.<init>(r11)
        L22:
            android.view.View r7 = r9.getView(r0, r7, r10)
            r7.measure(r1, r2)
            int r8 = r7.getMeasuredWidth()
            if (r8 < r12) goto L30
            return r12
        L30:
            if (r8 <= r5) goto L33
            r5 = r8
        L33:
            int r0 = r0 + 1
            goto L11
        L36:
            return r5
    }

    protected static android.support.v7.view.menu.g a(android.widget.ListAdapter r1) {
            boolean r0 = r1 instanceof android.widget.HeaderViewListAdapter
            if (r0 == 0) goto Ld
            android.widget.HeaderViewListAdapter r1 = (android.widget.HeaderViewListAdapter) r1
            android.widget.ListAdapter r1 = r1.getWrappedAdapter()
            android.support.v7.view.menu.g r1 = (android.support.v7.view.menu.g) r1
            return r1
        Ld:
            android.support.v7.view.menu.g r1 = (android.support.v7.view.menu.g) r1
            return r1
    }

    protected static boolean b(android.support.v7.view.menu.h r5) {
            int r0 = r5.size()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L1d
            android.view.MenuItem r3 = r5.getItem(r2)
            boolean r4 = r3.isVisible()
            if (r4 == 0) goto L1a
            android.graphics.drawable.Drawable r3 = r3.getIcon()
            if (r3 == 0) goto L1a
            r1 = 1
            goto L1d
        L1a:
            int r2 = r2 + 1
            goto L6
        L1d:
            return r1
    }

    public abstract void a(int r1);

    @Override // android.support.v7.view.menu.o
    public void a(android.content.Context r1, android.support.v7.view.menu.h r2) {
            r0 = this;
            return
    }

    public void a(android.graphics.Rect r1) {
            r0 = this;
            r0.f777b = r1
            return
    }

    public abstract void a(android.support.v7.view.menu.h r1);

    public abstract void a(android.view.View r1);

    public abstract void a(android.widget.PopupWindow.OnDismissListener r1);

    @Override // android.support.v7.view.menu.o
    public boolean a(android.support.v7.view.menu.h r1, android.support.v7.view.menu.j r2) {
            r0 = this;
            r0 = 0
            return r0
    }

    public abstract void b(int r1);

    public abstract void b(boolean r1);

    @Override // android.support.v7.view.menu.o
    public boolean b(android.support.v7.view.menu.h r1, android.support.v7.view.menu.j r2) {
            r0 = this;
            r0 = 0
            return r0
    }

    public abstract void c(int r1);

    public abstract void c(boolean r1);

    protected boolean e() {
            r0 = this;
            r0 = 1
            return r0
    }

    public android.graphics.Rect f() {
            r0 = this;
            android.graphics.Rect r0 = r0.f777b
            return r0
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            android.widget.Adapter r1 = r1.getAdapter()
            android.widget.ListAdapter r1 = (android.widget.ListAdapter) r1
            android.support.v7.view.menu.g r2 = a(r1)
            android.support.v7.view.menu.h r2 = r2.f761b
            java.lang.Object r1 = r1.getItem(r3)
            android.view.MenuItem r1 = (android.view.MenuItem) r1
            boolean r3 = r0.e()
            if (r3 == 0) goto L1a
            r3 = 0
            goto L1b
        L1a:
            r3 = 4
        L1b:
            r2.a(r1, r0, r3)
            return
    }
}
