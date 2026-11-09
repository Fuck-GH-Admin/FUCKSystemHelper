package android.support.v7.view.menu;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements android.support.v7.view.menu.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected android.content.Context f743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected android.content.Context f744c;
    protected android.support.v7.view.menu.h d;
    protected android.view.LayoutInflater e;
    private android.support.v7.view.menu.o.a f;
    private int g;
    private int h;
    protected android.support.v7.view.menu.p i;

    public b(android.content.Context r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f743b = r1
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r0.e = r1
            r0.g = r2
            r0.h = r3
            return
    }

    public android.support.v7.view.menu.o.a a() {
            r0 = this;
            android.support.v7.view.menu.o$a r0 = r0.f
            return r0
    }

    public android.support.v7.view.menu.p.a a(android.view.ViewGroup r3) {
            r2 = this;
            android.view.LayoutInflater r0 = r2.e
            int r2 = r2.h
            r1 = 0
            android.view.View r2 = r0.inflate(r2, r3, r1)
            android.support.v7.view.menu.p$a r2 = (android.support.v7.view.menu.p.a) r2
            return r2
    }

    public android.view.View a(android.support.v7.view.menu.j r2, android.view.View r3, android.view.ViewGroup r4) {
            r1 = this;
            boolean r0 = r3 instanceof android.support.v7.view.menu.p.a
            if (r0 == 0) goto L7
            android.support.v7.view.menu.p$a r3 = (android.support.v7.view.menu.p.a) r3
            goto Lb
        L7:
            android.support.v7.view.menu.p$a r3 = r1.a(r4)
        Lb:
            r1.a(r2, r3)
            android.view.View r3 = (android.view.View) r3
            return r3
    }

    public void a(int r1) {
            r0 = this;
            return
    }

    @Override // android.support.v7.view.menu.o
    public void a(android.content.Context r1, android.support.v7.view.menu.h r2) {
            r0 = this;
            r0.f744c = r1
            android.view.LayoutInflater.from(r1)
            r0.d = r2
            return
    }

    @Override // android.support.v7.view.menu.o
    public void a(android.support.v7.view.menu.h r1, boolean r2) {
            r0 = this;
            android.support.v7.view.menu.o$a r0 = r0.f
            if (r0 == 0) goto L7
            r0.a(r1, r2)
        L7:
            return
    }

    public abstract void a(android.support.v7.view.menu.j r1, android.support.v7.view.menu.p.a r2);

    @Override // android.support.v7.view.menu.o
    public void a(android.support.v7.view.menu.o.a r1) {
            r0 = this;
            r0.f = r1
            return
    }

    protected void a(android.view.View r2, int r3) {
            r1 = this;
            android.view.ViewParent r0 = r2.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto Lb
            r0.removeView(r2)
        Lb:
            android.support.v7.view.menu.p r1 = r1.i
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r1.addView(r2, r3)
            return
    }

    @Override // android.support.v7.view.menu.o
    public void a(boolean r10) {
            r9 = this;
            android.support.v7.view.menu.p r10 = r9.i
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            if (r10 != 0) goto L7
            return
        L7:
            android.support.v7.view.menu.h r0 = r9.d
            r1 = 0
            if (r0 == 0) goto L51
            r0.b()
            android.support.v7.view.menu.h r0 = r9.d
            java.util.ArrayList r0 = r0.n()
            int r2 = r0.size()
            r3 = r1
            r4 = r3
        L1b:
            if (r3 >= r2) goto L50
            java.lang.Object r5 = r0.get(r3)
            android.support.v7.view.menu.j r5 = (android.support.v7.view.menu.j) r5
            boolean r6 = r9.a(r4, r5)
            if (r6 == 0) goto L4d
            android.view.View r6 = r10.getChildAt(r4)
            boolean r7 = r6 instanceof android.support.v7.view.menu.p.a
            if (r7 == 0) goto L39
            r7 = r6
            android.support.v7.view.menu.p$a r7 = (android.support.v7.view.menu.p.a) r7
            android.support.v7.view.menu.j r7 = r7.getItemData()
            goto L3a
        L39:
            r7 = 0
        L3a:
            android.view.View r8 = r9.a(r5, r6, r10)
            if (r5 == r7) goto L46
            r8.setPressed(r1)
            r8.jumpDrawablesToCurrentState()
        L46:
            if (r8 == r6) goto L4b
            r9.a(r8, r4)
        L4b:
            int r4 = r4 + 1
        L4d:
            int r3 = r3 + 1
            goto L1b
        L50:
            r1 = r4
        L51:
            int r0 = r10.getChildCount()
            if (r1 >= r0) goto L60
            boolean r0 = r9.a(r10, r1)
            if (r0 != 0) goto L51
            int r1 = r1 + 1
            goto L51
        L60:
            return
    }

    public abstract boolean a(int r1, android.support.v7.view.menu.j r2);

    @Override // android.support.v7.view.menu.o
    public boolean a(android.support.v7.view.menu.h r1, android.support.v7.view.menu.j r2) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.support.v7.view.menu.o
    public boolean a(android.support.v7.view.menu.u r1) {
            r0 = this;
            android.support.v7.view.menu.o$a r0 = r0.f
            if (r0 == 0) goto L9
            boolean r0 = r0.a(r1)
            return r0
        L9:
            r0 = 0
            return r0
    }

    protected boolean a(android.view.ViewGroup r1, int r2) {
            r0 = this;
            r1.removeViewAt(r2)
            r0 = 1
            return r0
    }

    public android.support.v7.view.menu.p b(android.view.ViewGroup r4) {
            r3 = this;
            android.support.v7.view.menu.p r0 = r3.i
            if (r0 != 0) goto L1a
            android.view.LayoutInflater r0 = r3.e
            int r1 = r3.g
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            android.support.v7.view.menu.p r4 = (android.support.v7.view.menu.p) r4
            r3.i = r4
            android.support.v7.view.menu.h r0 = r3.d
            r4.a(r0)
            r4 = 1
            r3.a(r4)
        L1a:
            android.support.v7.view.menu.p r3 = r3.i
            return r3
    }

    @Override // android.support.v7.view.menu.o
    public boolean b(android.support.v7.view.menu.h r1, android.support.v7.view.menu.j r2) {
            r0 = this;
            r0 = 0
            return r0
    }
}
