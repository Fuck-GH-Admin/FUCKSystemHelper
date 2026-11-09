package android.support.v7.view.menu;

/* JADX INFO: loaded from: classes.dex */
public class g extends android.widget.BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    android.support.v7.view.menu.h f761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f762c;
    private boolean d;
    private final boolean e;
    private final android.view.LayoutInflater f;
    private final int g;

    public g(android.support.v7.view.menu.h r2, android.view.LayoutInflater r3, boolean r4, int r5) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f762c = r0
            r1.e = r4
            r1.f = r3
            r1.f761b = r2
            r1.g = r5
            r1.a()
            return
    }

    void a() {
            r5 = this;
            android.support.v7.view.menu.h r0 = r5.f761b
            android.support.v7.view.menu.j r0 = r0.f()
            if (r0 == 0) goto L23
            android.support.v7.view.menu.h r1 = r5.f761b
            java.util.ArrayList r1 = r1.j()
            int r2 = r1.size()
            r3 = 0
        L13:
            if (r3 >= r2) goto L23
            java.lang.Object r4 = r1.get(r3)
            android.support.v7.view.menu.j r4 = (android.support.v7.view.menu.j) r4
            if (r4 != r0) goto L20
            r5.f762c = r3
            return
        L20:
            int r3 = r3 + 1
            goto L13
        L23:
            r0 = -1
            r5.f762c = r0
            return
    }

    public void a(boolean r1) {
            r0 = this;
            r0.d = r1
            return
    }

    public android.support.v7.view.menu.h b() {
            r0 = this;
            android.support.v7.view.menu.h r0 = r0.f761b
            return r0
    }

    @Override // android.widget.Adapter
    public int getCount() {
            r1 = this;
            boolean r0 = r1.e
            if (r0 == 0) goto Lb
            android.support.v7.view.menu.h r0 = r1.f761b
            java.util.ArrayList r0 = r0.j()
            goto L11
        Lb:
            android.support.v7.view.menu.h r0 = r1.f761b
            java.util.ArrayList r0 = r0.n()
        L11:
            int r1 = r1.f762c
            if (r1 >= 0) goto L1a
            int r1 = r0.size()
            return r1
        L1a:
            int r1 = r0.size()
            int r1 = r1 + (-1)
            return r1
    }

    @Override // android.widget.Adapter
    public android.support.v7.view.menu.j getItem(int r2) {
            r1 = this;
            boolean r0 = r1.e
            if (r0 == 0) goto Lb
            android.support.v7.view.menu.h r0 = r1.f761b
            java.util.ArrayList r0 = r0.j()
            goto L11
        Lb:
            android.support.v7.view.menu.h r0 = r1.f761b
            java.util.ArrayList r0 = r0.n()
        L11:
            int r1 = r1.f762c
            if (r1 < 0) goto L19
            if (r2 < r1) goto L19
            int r2 = r2 + 1
        L19:
            java.lang.Object r1 = r0.get(r2)
            android.support.v7.view.menu.j r1 = (android.support.v7.view.menu.j) r1
            return r1
    }

    @Override // android.widget.Adapter
    public /* bridge */ /* synthetic */ java.lang.Object getItem(int r1) {
            r0 = this;
            android.support.v7.view.menu.j r0 = r0.getItem(r1)
            return r0
    }

    @Override // android.widget.Adapter
    public long getItemId(int r1) {
            r0 = this;
            long r0 = (long) r1
            return r0
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
            r5 = this;
            r0 = 0
            if (r7 != 0) goto Lb
            android.view.LayoutInflater r7 = r5.f
            int r1 = r5.g
            android.view.View r7 = r7.inflate(r1, r8, r0)
        Lb:
            android.support.v7.view.menu.j r8 = r5.getItem(r6)
            int r8 = r8.getGroupId()
            int r1 = r6 + (-1)
            if (r1 < 0) goto L20
            android.support.v7.view.menu.j r1 = r5.getItem(r1)
            int r1 = r1.getGroupId()
            goto L21
        L20:
            r1 = r8
        L21:
            r2 = r7
            android.support.v7.view.menu.ListMenuItemView r2 = (android.support.v7.view.menu.ListMenuItemView) r2
            android.support.v7.view.menu.h r3 = r5.f761b
            boolean r3 = r3.o()
            r4 = 1
            if (r3 == 0) goto L31
            if (r8 == r1) goto L31
            r8 = r4
            goto L32
        L31:
            r8 = r0
        L32:
            r2.setGroupDividerEnabled(r8)
            r8 = r7
            android.support.v7.view.menu.p$a r8 = (android.support.v7.view.menu.p.a) r8
            boolean r1 = r5.d
            if (r1 == 0) goto L3f
            r2.setForceShowIcon(r4)
        L3f:
            android.support.v7.view.menu.j r5 = r5.getItem(r6)
            r8.a(r5, r0)
            return r7
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
            r0 = this;
            r0.a()
            super.notifyDataSetChanged()
            return
    }
}
