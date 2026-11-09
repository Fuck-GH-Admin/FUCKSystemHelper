package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
public class j0 extends android.support.v7.widget.h0 implements android.support.v7.widget.i0 {
    private static java.lang.reflect.Method K;
    private android.support.v7.widget.i0 J;

    public static class a extends android.support.v7.widget.d0 {
        final int p;
        final int q;
        private android.support.v7.widget.i0 r;
        private android.view.MenuItem s;

        public a(android.content.Context r4, boolean r5) {
                r3 = this;
                r3.<init>(r4, r5)
                android.content.res.Resources r4 = r4.getResources()
                android.content.res.Configuration r4 = r4.getConfiguration()
                int r5 = android.os.Build.VERSION.SDK_INT
                r0 = 21
                r1 = 22
                r2 = 17
                if (r5 < r2) goto L21
                r5 = 1
                int r4 = r4.getLayoutDirection()
                if (r5 != r4) goto L21
                r3.p = r0
                r3.q = r1
                goto L25
            L21:
                r3.p = r1
                r3.q = r0
            L25:
                return
        }

        @Override // android.support.v7.widget.d0, android.view.View
        public boolean onHoverEvent(android.view.MotionEvent r6) {
                r5 = this;
                android.support.v7.widget.i0 r0 = r5.r
                if (r0 == 0) goto L59
                android.widget.ListAdapter r0 = r5.getAdapter()
                boolean r1 = r0 instanceof android.widget.HeaderViewListAdapter
                if (r1 == 0) goto L17
                android.widget.HeaderViewListAdapter r0 = (android.widget.HeaderViewListAdapter) r0
                int r1 = r0.getHeadersCount()
                android.widget.ListAdapter r0 = r0.getWrappedAdapter()
                goto L18
            L17:
                r1 = 0
            L18:
                android.support.v7.view.menu.g r0 = (android.support.v7.view.menu.g) r0
                r2 = 0
                int r3 = r6.getAction()
                r4 = 10
                if (r3 == r4) goto L41
                float r3 = r6.getX()
                int r3 = (int) r3
                float r4 = r6.getY()
                int r4 = (int) r4
                int r3 = r5.pointToPosition(r3, r4)
                r4 = -1
                if (r3 == r4) goto L41
                int r3 = r3 - r1
                if (r3 < 0) goto L41
                int r1 = r0.getCount()
                if (r3 >= r1) goto L41
                android.support.v7.view.menu.j r2 = r0.getItem(r3)
            L41:
                android.view.MenuItem r1 = r5.s
                if (r1 == r2) goto L59
                android.support.v7.view.menu.h r0 = r0.b()
                if (r1 == 0) goto L50
                android.support.v7.widget.i0 r3 = r5.r
                r3.b(r0, r1)
            L50:
                r5.s = r2
                if (r2 == 0) goto L59
                android.support.v7.widget.i0 r1 = r5.r
                r1.a(r0, r2)
            L59:
                boolean r5 = super.onHoverEvent(r6)
                return r5
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
                r4 = this;
                android.view.View r0 = r4.getSelectedView()
                android.support.v7.view.menu.ListMenuItemView r0 = (android.support.v7.view.menu.ListMenuItemView) r0
                r1 = 1
                if (r0 == 0) goto L29
                int r2 = r4.p
                if (r5 != r2) goto L29
                boolean r5 = r0.isEnabled()
                if (r5 == 0) goto L28
                android.support.v7.view.menu.j r5 = r0.getItemData()
                boolean r5 = r5.hasSubMenu()
                if (r5 == 0) goto L28
                int r5 = r4.getSelectedItemPosition()
                long r2 = r4.getSelectedItemId()
                r4.performItemClick(r0, r5, r2)
            L28:
                return r1
            L29:
                if (r0 == 0) goto L42
                int r0 = r4.q
                if (r5 != r0) goto L42
                r5 = -1
                r4.setSelection(r5)
                android.widget.ListAdapter r4 = r4.getAdapter()
                android.support.v7.view.menu.g r4 = (android.support.v7.view.menu.g) r4
                android.support.v7.view.menu.h r4 = r4.b()
                r5 = 0
                r4.a(r5)
                return r1
            L42:
                boolean r4 = super.onKeyDown(r5, r6)
                return r4
        }

        public void setHoverListener(android.support.v7.widget.i0 r1) {
                r0 = this;
                r0.r = r1
                return
        }

        @Override // android.support.v7.widget.d0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(android.graphics.drawable.Drawable r1) {
                r0 = this;
                super.setSelector(r1)
                return
        }
    }

    static {
            java.lang.Class<android.widget.PopupWindow> r0 = android.widget.PopupWindow.class
            java.lang.String r1 = "setTouchModal"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L13
            r3 = 0
            java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L13
            r2[r3] = r4     // Catch: java.lang.NoSuchMethodException -> L13
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L13
            android.support.v7.widget.j0.K = r0     // Catch: java.lang.NoSuchMethodException -> L13
            goto L1a
        L13:
            java.lang.String r0 = "MenuPopupWindow"
            java.lang.String r1 = "Could not find method setTouchModal() on PopupWindow. Oh well."
            android.util.Log.i(r0, r1)
        L1a:
            return
    }

    public j0(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @Override // android.support.v7.widget.h0
    android.support.v7.widget.d0 a(android.content.Context r2, boolean r3) {
            r1 = this;
            android.support.v7.widget.j0$a r0 = new android.support.v7.widget.j0$a
            r0.<init>(r2, r3)
            r0.setHoverListener(r1)
            return r0
    }

    @Override // android.support.v7.widget.i0
    public void a(android.support.v7.view.menu.h r1, android.view.MenuItem r2) {
            r0 = this;
            android.support.v7.widget.i0 r0 = r0.J
            if (r0 == 0) goto L7
            r0.a(r1, r2)
        L7:
            return
    }

    public void a(android.support.v7.widget.i0 r1) {
            r0 = this;
            r0.J = r1
            return
    }

    public void a(java.lang.Object r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Ld
            android.widget.PopupWindow r2 = r2.F
            android.transition.Transition r3 = (android.transition.Transition) r3
            r2.setEnterTransition(r3)
        Ld:
            return
    }

    @Override // android.support.v7.widget.i0
    public void b(android.support.v7.view.menu.h r1, android.view.MenuItem r2) {
            r0 = this;
            android.support.v7.widget.i0 r0 = r0.J
            if (r0 == 0) goto L7
            r0.b(r1, r2)
        L7:
            return
    }

    public void b(java.lang.Object r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Ld
            android.widget.PopupWindow r2 = r2.F
            android.transition.Transition r3 = (android.transition.Transition) r3
            r2.setExitTransition(r3)
        Ld:
            return
    }

    public void c(boolean r4) {
            r3 = this;
            java.lang.reflect.Method r0 = android.support.v7.widget.j0.K
            if (r0 == 0) goto L1b
            android.widget.PopupWindow r3 = r3.F     // Catch: java.lang.Exception -> L14
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L14
            r2 = 0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Exception -> L14
            r1[r2] = r4     // Catch: java.lang.Exception -> L14
            r0.invoke(r3, r1)     // Catch: java.lang.Exception -> L14
            goto L1b
        L14:
            java.lang.String r3 = "MenuPopupWindow"
            java.lang.String r4 = "Could not invoke setTouchModal() on PopupWindow. Oh well."
            android.util.Log.i(r3, r4)
        L1b:
            return
    }
}
