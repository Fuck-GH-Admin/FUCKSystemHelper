package b.b.d.d;

/* JADX INFO: loaded from: classes.dex */
public class f extends android.view.ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final android.content.Context f1164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final b.b.d.d.b f1165b;

    public static class a implements b.b.d.d.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final android.view.ActionMode.Callback f1166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final android.content.Context f1167b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final java.util.ArrayList<b.b.d.d.f> f1168c;
        final b.b.c.f.k<android.view.Menu, android.view.Menu> d;

        public a(android.content.Context r1, android.view.ActionMode.Callback r2) {
                r0 = this;
                r0.<init>()
                r0.f1167b = r1
                r0.f1166a = r2
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.f1168c = r1
                b.b.c.f.k r1 = new b.b.c.f.k
                r1.<init>()
                r0.d = r1
                return
        }

        private android.view.Menu a(android.view.Menu r3) {
                r2 = this;
                b.b.c.f.k<android.view.Menu, android.view.Menu> r0 = r2.d
                java.lang.Object r0 = r0.get(r3)
                android.view.Menu r0 = (android.view.Menu) r0
                if (r0 != 0) goto L18
                android.content.Context r0 = r2.f1167b
                r1 = r3
                b.b.c.c.a.a r1 = (b.b.c.c.a.a) r1
                android.view.Menu r0 = android.support.v7.view.menu.q.a(r0, r1)
                b.b.c.f.k<android.view.Menu, android.view.Menu> r2 = r2.d
                r2.put(r3, r0)
            L18:
                return r0
        }

        @Override // b.b.d.d.b.a
        public void a(b.b.d.d.b r2) {
                r1 = this;
                android.view.ActionMode$Callback r0 = r1.f1166a
                android.view.ActionMode r1 = r1.b(r2)
                r0.onDestroyActionMode(r1)
                return
        }

        @Override // b.b.d.d.b.a
        public boolean a(b.b.d.d.b r2, android.view.Menu r3) {
                r1 = this;
                android.view.ActionMode$Callback r0 = r1.f1166a
                android.view.ActionMode r2 = r1.b(r2)
                android.view.Menu r1 = r1.a(r3)
                boolean r1 = r0.onPrepareActionMode(r2, r1)
                return r1
        }

        @Override // b.b.d.d.b.a
        public boolean a(b.b.d.d.b r2, android.view.MenuItem r3) {
                r1 = this;
                android.view.ActionMode$Callback r0 = r1.f1166a
                android.view.ActionMode r2 = r1.b(r2)
                android.content.Context r1 = r1.f1167b
                b.b.c.c.a.b r3 = (b.b.c.c.a.b) r3
                android.view.MenuItem r1 = android.support.v7.view.menu.q.a(r1, r3)
                boolean r1 = r0.onActionItemClicked(r2, r1)
                return r1
        }

        public android.view.ActionMode b(b.b.d.d.b r5) {
                r4 = this;
                java.util.ArrayList<b.b.d.d.f> r0 = r4.f1168c
                int r0 = r0.size()
                r1 = 0
            L7:
                if (r1 >= r0) goto L1b
                java.util.ArrayList<b.b.d.d.f> r2 = r4.f1168c
                java.lang.Object r2 = r2.get(r1)
                b.b.d.d.f r2 = (b.b.d.d.f) r2
                if (r2 == 0) goto L18
                b.b.d.d.b r3 = r2.f1165b
                if (r3 != r5) goto L18
                return r2
            L18:
                int r1 = r1 + 1
                goto L7
            L1b:
                b.b.d.d.f r0 = new b.b.d.d.f
                android.content.Context r1 = r4.f1167b
                r0.<init>(r1, r5)
                java.util.ArrayList<b.b.d.d.f> r4 = r4.f1168c
                r4.add(r0)
                return r0
        }

        @Override // b.b.d.d.b.a
        public boolean b(b.b.d.d.b r2, android.view.Menu r3) {
                r1 = this;
                android.view.ActionMode$Callback r0 = r1.f1166a
                android.view.ActionMode r2 = r1.b(r2)
                android.view.Menu r1 = r1.a(r3)
                boolean r1 = r0.onCreateActionMode(r2, r1)
                return r1
        }
    }

    public f(android.content.Context r1, b.b.d.d.b r2) {
            r0 = this;
            r0.<init>()
            r0.f1164a = r1
            r0.f1165b = r2
            return
    }

    @Override // android.view.ActionMode
    public void finish() {
            r0 = this;
            b.b.d.d.b r0 = r0.f1165b
            r0.a()
            return
    }

    @Override // android.view.ActionMode
    public android.view.View getCustomView() {
            r0 = this;
            b.b.d.d.b r0 = r0.f1165b
            android.view.View r0 = r0.b()
            return r0
    }

    @Override // android.view.ActionMode
    public android.view.Menu getMenu() {
            r1 = this;
            android.content.Context r0 = r1.f1164a
            b.b.d.d.b r1 = r1.f1165b
            android.view.Menu r1 = r1.c()
            b.b.c.c.a.a r1 = (b.b.c.c.a.a) r1
            android.view.Menu r1 = android.support.v7.view.menu.q.a(r0, r1)
            return r1
    }

    @Override // android.view.ActionMode
    public android.view.MenuInflater getMenuInflater() {
            r0 = this;
            b.b.d.d.b r0 = r0.f1165b
            android.view.MenuInflater r0 = r0.d()
            return r0
    }

    @Override // android.view.ActionMode
    public java.lang.CharSequence getSubtitle() {
            r0 = this;
            b.b.d.d.b r0 = r0.f1165b
            java.lang.CharSequence r0 = r0.e()
            return r0
    }

    @Override // android.view.ActionMode
    public java.lang.Object getTag() {
            r0 = this;
            b.b.d.d.b r0 = r0.f1165b
            java.lang.Object r0 = r0.f()
            return r0
    }

    @Override // android.view.ActionMode
    public java.lang.CharSequence getTitle() {
            r0 = this;
            b.b.d.d.b r0 = r0.f1165b
            java.lang.CharSequence r0 = r0.g()
            return r0
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
            r0 = this;
            b.b.d.d.b r0 = r0.f1165b
            boolean r0 = r0.h()
            return r0
    }

    @Override // android.view.ActionMode
    public void invalidate() {
            r0 = this;
            b.b.d.d.b r0 = r0.f1165b
            r0.i()
            return
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
            r0 = this;
            b.b.d.d.b r0 = r0.f1165b
            boolean r0 = r0.j()
            return r0
    }

    @Override // android.view.ActionMode
    public void setCustomView(android.view.View r1) {
            r0 = this;
            b.b.d.d.b r0 = r0.f1165b
            r0.a(r1)
            return
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int r1) {
            r0 = this;
            b.b.d.d.b r0 = r0.f1165b
            r0.a(r1)
            return
    }

    @Override // android.view.ActionMode
    public void setSubtitle(java.lang.CharSequence r1) {
            r0 = this;
            b.b.d.d.b r0 = r0.f1165b
            r0.a(r1)
            return
    }

    @Override // android.view.ActionMode
    public void setTag(java.lang.Object r1) {
            r0 = this;
            b.b.d.d.b r0 = r0.f1165b
            r0.a(r1)
            return
    }

    @Override // android.view.ActionMode
    public void setTitle(int r1) {
            r0 = this;
            b.b.d.d.b r0 = r0.f1165b
            r0.b(r1)
            return
    }

    @Override // android.view.ActionMode
    public void setTitle(java.lang.CharSequence r1) {
            r0 = this;
            b.b.d.d.b r0 = r0.f1165b
            r0.b(r1)
            return
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean r1) {
            r0 = this;
            b.b.d.d.b r0 = r0.f1165b
            r0.a(r1)
            return
    }
}
