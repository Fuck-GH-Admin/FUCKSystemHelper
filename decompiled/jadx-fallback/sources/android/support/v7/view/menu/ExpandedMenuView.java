package android.support.v7.view.menu;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends android.widget.ListView implements android.support.v7.view.menu.h.b, android.support.v7.view.menu.p, android.widget.AdapterView.OnItemClickListener {
    private static final int[] d = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.support.v7.view.menu.h f736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f737c;

    static {
            r0 = 2
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [16842964, 16843049} // fill-array
            android.support.v7.view.menu.ExpandedMenuView.d = r0
            return
    }

    public ExpandedMenuView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 16842868(0x1010074, float:2.3693883E-38)
            r1.<init>(r2, r3, r0)
            return
    }

    public ExpandedMenuView(android.content.Context r3, android.util.AttributeSet r4, int r5) {
            r2 = this;
            r2.<init>(r3, r4)
            r2.setOnItemClickListener(r2)
            int[] r0 = android.support.v7.view.menu.ExpandedMenuView.d
            r1 = 0
            android.support.v7.widget.t0 r3 = android.support.v7.widget.t0.a(r3, r4, r0, r5, r1)
            boolean r4 = r3.g(r1)
            if (r4 == 0) goto L1a
            android.graphics.drawable.Drawable r4 = r3.b(r1)
            r2.setBackgroundDrawable(r4)
        L1a:
            r4 = 1
            boolean r5 = r3.g(r4)
            if (r5 == 0) goto L28
            android.graphics.drawable.Drawable r4 = r3.b(r4)
            r2.setDivider(r4)
        L28:
            r3.a()
            return
    }

    @Override // android.support.v7.view.menu.p
    public void a(android.support.v7.view.menu.h r1) {
            r0 = this;
            r0.f736b = r1
            return
    }

    @Override // android.support.v7.view.menu.h.b
    public boolean a(android.support.v7.view.menu.j r2) {
            r1 = this;
            android.support.v7.view.menu.h r1 = r1.f736b
            r0 = 0
            boolean r1 = r1.a(r2, r0)
            return r1
    }

    public int getWindowAnimations() {
            r0 = this;
            int r0 = r0.f737c
            return r0
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            r0 = 0
            r1.setChildrenDrawingCacheEnabled(r0)
            return
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            android.widget.ListAdapter r1 = r0.getAdapter()
            java.lang.Object r1 = r1.getItem(r3)
            android.support.v7.view.menu.j r1 = (android.support.v7.view.menu.j) r1
            r0.a(r1)
            return
    }
}
