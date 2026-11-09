package android.support.v7.view.menu;

/* JADX INFO: loaded from: classes.dex */
public class f implements android.support.v7.view.menu.o, android.widget.AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    android.content.Context f757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    android.view.LayoutInflater f758c;
    android.support.v7.view.menu.h d;
    android.support.v7.view.menu.ExpandedMenuView e;
    int f;
    int g;
    int h;
    private android.support.v7.view.menu.o.a i;
    android.support.v7.view.menu.f.a j;

    private class a extends android.widget.BaseAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f759b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.support.v7.view.menu.f f760c;

        public a(android.support.v7.view.menu.f r1) {
                r0 = this;
                r0.f760c = r1
                r0.<init>()
                r1 = -1
                r0.f759b = r1
                r0.a()
                return
        }

        void a() {
                r5 = this;
                android.support.v7.view.menu.f r0 = r5.f760c
                android.support.v7.view.menu.h r0 = r0.d
                android.support.v7.view.menu.j r0 = r0.f()
                if (r0 == 0) goto L27
                android.support.v7.view.menu.f r1 = r5.f760c
                android.support.v7.view.menu.h r1 = r1.d
                java.util.ArrayList r1 = r1.j()
                int r2 = r1.size()
                r3 = 0
            L17:
                if (r3 >= r2) goto L27
                java.lang.Object r4 = r1.get(r3)
                android.support.v7.view.menu.j r4 = (android.support.v7.view.menu.j) r4
                if (r4 != r0) goto L24
                r5.f759b = r3
                return
            L24:
                int r3 = r3 + 1
                goto L17
            L27:
                r0 = -1
                r5.f759b = r0
                return
        }

        @Override // android.widget.Adapter
        public int getCount() {
                r2 = this;
                android.support.v7.view.menu.f r0 = r2.f760c
                android.support.v7.view.menu.h r0 = r0.d
                java.util.ArrayList r0 = r0.j()
                int r0 = r0.size()
                android.support.v7.view.menu.f r1 = r2.f760c
                int r1 = r1.f
                int r0 = r0 - r1
                int r2 = r2.f759b
                if (r2 >= 0) goto L16
                return r0
            L16:
                int r0 = r0 + (-1)
                return r0
        }

        @Override // android.widget.Adapter
        public android.support.v7.view.menu.j getItem(int r3) {
                r2 = this;
                android.support.v7.view.menu.f r0 = r2.f760c
                android.support.v7.view.menu.h r0 = r0.d
                java.util.ArrayList r0 = r0.j()
                android.support.v7.view.menu.f r1 = r2.f760c
                int r1 = r1.f
                int r3 = r3 + r1
                int r2 = r2.f759b
                if (r2 < 0) goto L15
                if (r3 < r2) goto L15
                int r3 = r3 + 1
            L15:
                java.lang.Object r2 = r0.get(r3)
                android.support.v7.view.menu.j r2 = (android.support.v7.view.menu.j) r2
                return r2
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
        public android.view.View getView(int r3, android.view.View r4, android.view.ViewGroup r5) {
                r2 = this;
                r0 = 0
                if (r4 != 0) goto Ld
                android.support.v7.view.menu.f r4 = r2.f760c
                android.view.LayoutInflater r1 = r4.f758c
                int r4 = r4.h
                android.view.View r4 = r1.inflate(r4, r5, r0)
            Ld:
                r5 = r4
                android.support.v7.view.menu.p$a r5 = (android.support.v7.view.menu.p.a) r5
                android.support.v7.view.menu.j r2 = r2.getItem(r3)
                r5.a(r2, r0)
                return r4
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
                r0 = this;
                r0.a()
                super.notifyDataSetChanged()
                return
        }
    }

    public f(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.h = r1
            r0.g = r2
            return
    }

    public f(android.content.Context r2, int r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r3, r0)
            r1.f757b = r2
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r1.f758c = r2
            return
    }

    public android.support.v7.view.menu.p a(android.view.ViewGroup r4) {
            r3 = this;
            android.support.v7.view.menu.ExpandedMenuView r0 = r3.e
            if (r0 != 0) goto L28
            android.view.LayoutInflater r0 = r3.f758c
            int r1 = b.b.d.a.g.abc_expanded_menu_layout
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            android.support.v7.view.menu.ExpandedMenuView r4 = (android.support.v7.view.menu.ExpandedMenuView) r4
            r3.e = r4
            android.support.v7.view.menu.f$a r4 = r3.j
            if (r4 != 0) goto L1c
            android.support.v7.view.menu.f$a r4 = new android.support.v7.view.menu.f$a
            r4.<init>(r3)
            r3.j = r4
        L1c:
            android.support.v7.view.menu.ExpandedMenuView r4 = r3.e
            android.support.v7.view.menu.f$a r0 = r3.j
            r4.setAdapter(r0)
            android.support.v7.view.menu.ExpandedMenuView r4 = r3.e
            r4.setOnItemClickListener(r3)
        L28:
            android.support.v7.view.menu.ExpandedMenuView r3 = r3.e
            return r3
    }

    public android.widget.ListAdapter a() {
            r1 = this;
            android.support.v7.view.menu.f$a r0 = r1.j
            if (r0 != 0) goto Lb
            android.support.v7.view.menu.f$a r0 = new android.support.v7.view.menu.f$a
            r0.<init>(r1)
            r1.j = r0
        Lb:
            android.support.v7.view.menu.f$a r1 = r1.j
            return r1
    }

    @Override // android.support.v7.view.menu.o
    public void a(android.content.Context r3, android.support.v7.view.menu.h r4) {
            r2 = this;
            int r0 = r2.g
            if (r0 == 0) goto L14
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = r2.g
            r0.<init>(r3, r1)
            r2.f757b = r0
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
        L11:
            r2.f758c = r3
            goto L23
        L14:
            android.content.Context r0 = r2.f757b
            if (r0 == 0) goto L23
            r2.f757b = r3
            android.view.LayoutInflater r0 = r2.f758c
            if (r0 != 0) goto L23
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            goto L11
        L23:
            r2.d = r4
            android.support.v7.view.menu.f$a r2 = r2.j
            if (r2 == 0) goto L2c
            r2.notifyDataSetChanged()
        L2c:
            return
    }

    @Override // android.support.v7.view.menu.o
    public void a(android.support.v7.view.menu.h r1, boolean r2) {
            r0 = this;
            android.support.v7.view.menu.o$a r0 = r0.i
            if (r0 == 0) goto L7
            r0.a(r1, r2)
        L7:
            return
    }

    @Override // android.support.v7.view.menu.o
    public void a(android.support.v7.view.menu.o.a r1) {
            r0 = this;
            r0.i = r1
            return
    }

    @Override // android.support.v7.view.menu.o
    public void a(boolean r1) {
            r0 = this;
            android.support.v7.view.menu.f$a r0 = r0.j
            if (r0 == 0) goto L7
            r0.notifyDataSetChanged()
        L7:
            return
    }

    @Override // android.support.v7.view.menu.o
    public boolean a(android.support.v7.view.menu.h r1, android.support.v7.view.menu.j r2) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.support.v7.view.menu.o
    public boolean a(android.support.v7.view.menu.u r3) {
            r2 = this;
            boolean r0 = r3.hasVisibleItems()
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            android.support.v7.view.menu.i r0 = new android.support.v7.view.menu.i
            r0.<init>(r3)
            r1 = 0
            r0.a(r1)
            android.support.v7.view.menu.o$a r2 = r2.i
            if (r2 == 0) goto L18
            r2.a(r3)
        L18:
            r2 = 1
            return r2
    }

    @Override // android.support.v7.view.menu.o
    public boolean b(android.support.v7.view.menu.h r1, android.support.v7.view.menu.j r2) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.support.v7.view.menu.o
    public boolean d() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            android.support.v7.view.menu.h r1 = r0.d
            android.support.v7.view.menu.f$a r2 = r0.j
            android.support.v7.view.menu.j r2 = r2.getItem(r3)
            r3 = 0
            r1.a(r2, r0, r3)
            return
    }
}
