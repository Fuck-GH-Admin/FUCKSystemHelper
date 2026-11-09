package android.support.v7.view.menu;

/* JADX INFO: loaded from: classes.dex */
class l extends android.support.v7.view.menu.k {

    class a extends android.support.v7.view.menu.k.a implements android.view.ActionProvider.VisibilityListener {
        b.b.c.g.c.b d;

        public a(android.support.v7.view.menu.l r1, android.content.Context r2, android.view.ActionProvider r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // b.b.c.g.c
        public android.view.View a(android.view.MenuItem r1) {
                r0 = this;
                android.view.ActionProvider r0 = r0.f772b
                android.view.View r0 = r0.onCreateActionView(r1)
                return r0
        }

        @Override // b.b.c.g.c
        public void a(b.b.c.g.c.b r2) {
                r1 = this;
                r1.d = r2
                android.view.ActionProvider r0 = r1.f772b
                if (r2 == 0) goto L7
                goto L8
            L7:
                r1 = 0
            L8:
                r0.setVisibilityListener(r1)
                return
        }

        @Override // b.b.c.g.c
        public boolean b() {
                r0 = this;
                android.view.ActionProvider r0 = r0.f772b
                boolean r0 = r0.isVisible()
                return r0
        }

        @Override // b.b.c.g.c
        public boolean e() {
                r0 = this;
                android.view.ActionProvider r0 = r0.f772b
                boolean r0 = r0.overridesItemVisibility()
                return r0
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean r1) {
                r0 = this;
                b.b.c.g.c$b r0 = r0.d
                if (r0 == 0) goto L7
                r0.onActionProviderVisibilityChanged(r1)
            L7:
                return
        }
    }

    l(android.content.Context r1, b.b.c.c.a.b r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // android.support.v7.view.menu.k
    android.support.v7.view.menu.k.a a(android.view.ActionProvider r3) {
            r2 = this;
            android.support.v7.view.menu.l$a r0 = new android.support.v7.view.menu.l$a
            android.content.Context r1 = r2.f745b
            r0.<init>(r2, r1, r3)
            return r0
    }
}
