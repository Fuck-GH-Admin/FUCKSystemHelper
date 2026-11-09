package android.support.v7.view.menu;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.support.v7.view.menu.h f779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f780c;
    private final int d;
    private final int e;
    private android.view.View f;
    private int g;
    private boolean h;
    private android.support.v7.view.menu.o.a i;
    private android.support.v7.view.menu.m j;
    private android.widget.PopupWindow.OnDismissListener k;
    private final android.widget.PopupWindow.OnDismissListener l;

    class a implements android.widget.PopupWindow.OnDismissListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.support.v7.view.menu.n f781b;

        a(android.support.v7.view.menu.n r1) {
                r0 = this;
                r0.f781b = r1
                r0.<init>()
                return
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
                r0 = this;
                android.support.v7.view.menu.n r0 = r0.f781b
                r0.d()
                return
        }
    }

    public n(android.content.Context r8, android.support.v7.view.menu.h r9, android.view.View r10, boolean r11, int r12) {
            r7 = this;
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public n(android.content.Context r2, android.support.v7.view.menu.h r3, android.view.View r4, boolean r5, int r6, int r7) {
            r1 = this;
            r1.<init>()
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r1.g = r0
            android.support.v7.view.menu.n$a r0 = new android.support.v7.view.menu.n$a
            r0.<init>(r1)
            r1.l = r0
            r1.f778a = r2
            r1.f779b = r3
            r1.f = r4
            r1.f780c = r5
            r1.d = r6
            r1.e = r7
            return
    }

    private void a(int r3, int r4, boolean r5, boolean r6) {
            r2 = this;
            android.support.v7.view.menu.m r0 = r2.b()
            r0.c(r6)
            if (r5 == 0) goto L48
            int r5 = r2.g
            android.view.View r6 = r2.f
            int r6 = b.b.c.g.q.d(r6)
            int r5 = b.b.c.g.d.a(r5, r6)
            r5 = r5 & 7
            r6 = 5
            if (r5 != r6) goto L21
            android.view.View r5 = r2.f
            int r5 = r5.getWidth()
            int r3 = r3 - r5
        L21:
            r0.b(r3)
            r0.c(r4)
            android.content.Context r2 = r2.f778a
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            r5 = 1111490560(0x42400000, float:48.0)
            float r2 = r2 * r5
            r5 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r5
            int r2 = (int) r2
            android.graphics.Rect r5 = new android.graphics.Rect
            int r6 = r3 - r2
            int r1 = r4 - r2
            int r3 = r3 + r2
            int r4 = r4 + r2
            r5.<init>(r6, r1, r3, r4)
            r0.a(r5)
        L48:
            r0.c()
            return
    }

    private android.support.v7.view.menu.m g() {
            r14 = this;
            android.content.Context r0 = r14.f778a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 17
            if (r2 < r3) goto L1d
            r0.getRealSize(r1)
            goto L20
        L1d:
            r0.getSize(r1)
        L20:
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f778a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = b.b.d.a.d.abc_cascading_menus_min_smallest_width
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L38
            r0 = 1
            goto L39
        L38:
            r0 = 0
        L39:
            if (r0 == 0) goto L4c
            android.support.v7.view.menu.e r0 = new android.support.v7.view.menu.e
            android.content.Context r2 = r14.f778a
            android.view.View r3 = r14.f
            int r4 = r14.d
            int r5 = r14.e
            boolean r6 = r14.f780c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L5e
        L4c:
            android.support.v7.view.menu.t r0 = new android.support.v7.view.menu.t
            android.content.Context r8 = r14.f778a
            android.support.v7.view.menu.h r9 = r14.f779b
            android.view.View r10 = r14.f
            int r11 = r14.d
            int r12 = r14.e
            boolean r13 = r14.f780c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L5e:
            android.support.v7.view.menu.h r1 = r14.f779b
            r0.a(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.l
            r0.a(r1)
            android.view.View r1 = r14.f
            r0.a(r1)
            android.support.v7.view.menu.o$a r1 = r14.i
            r0.a(r1)
            boolean r1 = r14.h
            r0.b(r1)
            int r14 = r14.g
            r0.a(r14)
            return r0
    }

    public void a() {
            r1 = this;
            boolean r0 = r1.c()
            if (r0 == 0) goto Lb
            android.support.v7.view.menu.m r1 = r1.j
            r1.dismiss()
        Lb:
            return
    }

    public void a(int r1) {
            r0 = this;
            r0.g = r1
            return
    }

    public void a(android.support.v7.view.menu.o.a r1) {
            r0 = this;
            r0.i = r1
            android.support.v7.view.menu.m r0 = r0.j
            if (r0 == 0) goto L9
            r0.a(r1)
        L9:
            return
    }

    public void a(android.view.View r1) {
            r0 = this;
            r0.f = r1
            return
    }

    public void a(android.widget.PopupWindow.OnDismissListener r1) {
            r0 = this;
            r0.k = r1
            return
    }

    public void a(boolean r1) {
            r0 = this;
            r0.h = r1
            android.support.v7.view.menu.m r0 = r0.j
            if (r0 == 0) goto L9
            r0.b(r1)
        L9:
            return
    }

    public boolean a(int r3, int r4) {
            r2 = this;
            boolean r0 = r2.c()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            android.view.View r0 = r2.f
            if (r0 != 0) goto Le
            r2 = 0
            return r2
        Le:
            r2.a(r3, r4, r1, r1)
            return r1
    }

    public android.support.v7.view.menu.m b() {
            r1 = this;
            android.support.v7.view.menu.m r0 = r1.j
            if (r0 != 0) goto La
            android.support.v7.view.menu.m r0 = r1.g()
            r1.j = r0
        La:
            android.support.v7.view.menu.m r1 = r1.j
            return r1
    }

    public boolean c() {
            r0 = this;
            android.support.v7.view.menu.m r0 = r0.j
            if (r0 == 0) goto Lc
            boolean r0 = r0.a()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    protected void d() {
            r1 = this;
            r0 = 0
            r1.j = r0
            android.widget.PopupWindow$OnDismissListener r1 = r1.k
            if (r1 == 0) goto La
            r1.onDismiss()
        La:
            return
    }

    public void e() {
            r1 = this;
            boolean r1 = r1.f()
            if (r1 == 0) goto L7
            return
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "MenuPopupHelper cannot be used without an anchor"
            r1.<init>(r0)
            throw r1
    }

    public boolean f() {
            r3 = this;
            boolean r0 = r3.c()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            android.view.View r0 = r3.f
            r2 = 0
            if (r0 != 0) goto Le
            return r2
        Le:
            r3.a(r2, r2, r2, r2)
            return r1
    }
}
