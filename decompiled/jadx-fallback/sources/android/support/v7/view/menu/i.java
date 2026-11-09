package android.support.v7.view.menu;

/* JADX INFO: loaded from: classes.dex */
class i implements android.content.DialogInterface.OnKeyListener, android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener, android.support.v7.view.menu.o.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.support.v7.view.menu.h f766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.support.v7.app.b f767c;
    android.support.v7.view.menu.f d;
    private android.support.v7.view.menu.o.a e;

    public i(android.support.v7.view.menu.h r1) {
            r0 = this;
            r0.<init>()
            r0.f766b = r1
            return
    }

    public void a() {
            r0 = this;
            android.support.v7.app.b r0 = r0.f767c
            if (r0 == 0) goto L7
            r0.dismiss()
        L7:
            return
    }

    public void a(android.os.IBinder r6) {
            r5 = this;
            android.support.v7.view.menu.h r0 = r5.f766b
            android.support.v7.app.b$a r1 = new android.support.v7.app.b$a
            android.content.Context r2 = r0.e()
            r1.<init>(r2)
            android.support.v7.view.menu.f r2 = new android.support.v7.view.menu.f
            android.content.Context r3 = r1.b()
            int r4 = b.b.d.a.g.abc_list_menu_item_layout
            r2.<init>(r3, r4)
            r5.d = r2
            r2.a(r5)
            android.support.v7.view.menu.h r2 = r5.f766b
            android.support.v7.view.menu.f r3 = r5.d
            r2.a(r3)
            android.support.v7.view.menu.f r2 = r5.d
            android.widget.ListAdapter r2 = r2.a()
            r1.a(r2, r5)
            android.view.View r2 = r0.i()
            if (r2 == 0) goto L35
            r1.a(r2)
            goto L43
        L35:
            android.graphics.drawable.Drawable r2 = r0.g()
            r1.a(r2)
            java.lang.CharSequence r0 = r0.h()
            r1.a(r0)
        L43:
            r1.a(r5)
            android.support.v7.app.b r0 = r1.a()
            r5.f767c = r0
            r0.setOnDismissListener(r5)
            android.support.v7.app.b r0 = r5.f767c
            android.view.Window r0 = r0.getWindow()
            android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
            r1 = 1003(0x3eb, float:1.406E-42)
            r0.type = r1
            if (r6 == 0) goto L61
            r0.token = r6
        L61:
            int r6 = r0.flags
            r1 = 131072(0x20000, float:1.83671E-40)
            r6 = r6 | r1
            r0.flags = r6
            android.support.v7.app.b r5 = r5.f767c
            r5.show()
            return
    }

    @Override // android.support.v7.view.menu.o.a
    public void a(android.support.v7.view.menu.h r2, boolean r3) {
            r1 = this;
            if (r3 != 0) goto L6
            android.support.v7.view.menu.h r0 = r1.f766b
            if (r2 != r0) goto L9
        L6:
            r1.a()
        L9:
            android.support.v7.view.menu.o$a r1 = r1.e
            if (r1 == 0) goto L10
            r1.a(r2, r3)
        L10:
            return
    }

    @Override // android.support.v7.view.menu.o.a
    public boolean a(android.support.v7.view.menu.h r1) {
            r0 = this;
            android.support.v7.view.menu.o$a r0 = r0.e
            if (r0 == 0) goto L9
            boolean r0 = r0.a(r1)
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface r1, int r2) {
            r0 = this;
            android.support.v7.view.menu.h r1 = r0.f766b
            android.support.v7.view.menu.f r0 = r0.d
            android.widget.ListAdapter r0 = r0.a()
            java.lang.Object r0 = r0.getItem(r2)
            android.support.v7.view.menu.j r0 = (android.support.v7.view.menu.j) r0
            r2 = 0
            r1.a(r0, r2)
            return
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface r2) {
            r1 = this;
            android.support.v7.view.menu.f r2 = r1.d
            android.support.v7.view.menu.h r1 = r1.f766b
            r0 = 1
            r2.a(r1, r0)
            return
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(android.content.DialogInterface r3, int r4, android.view.KeyEvent r5) {
            r2 = this;
            r0 = 82
            if (r4 == r0) goto L7
            r0 = 4
            if (r4 != r0) goto L5b
        L7:
            int r0 = r5.getAction()
            r1 = 1
            if (r0 != 0) goto L2c
            int r0 = r5.getRepeatCount()
            if (r0 != 0) goto L2c
            android.support.v7.app.b r3 = r2.f767c
            android.view.Window r3 = r3.getWindow()
            if (r3 == 0) goto L5b
            android.view.View r3 = r3.getDecorView()
            if (r3 == 0) goto L5b
            android.view.KeyEvent$DispatcherState r3 = r3.getKeyDispatcherState()
            if (r3 == 0) goto L5b
            r3.startTracking(r5, r2)
            return r1
        L2c:
            int r0 = r5.getAction()
            if (r0 != r1) goto L5b
            boolean r0 = r5.isCanceled()
            if (r0 != 0) goto L5b
            android.support.v7.app.b r0 = r2.f767c
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L5b
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L5b
            android.view.KeyEvent$DispatcherState r0 = r0.getKeyDispatcherState()
            if (r0 == 0) goto L5b
            boolean r0 = r0.isTracking(r5)
            if (r0 == 0) goto L5b
            android.support.v7.view.menu.h r2 = r2.f766b
            r2.a(r1)
            r3.dismiss()
            return r1
        L5b:
            android.support.v7.view.menu.h r2 = r2.f766b
            r3 = 0
            boolean r2 = r2.performShortcut(r4, r5, r3)
            return r2
    }
}
