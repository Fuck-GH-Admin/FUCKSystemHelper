package android.support.v7.view.menu;

/* JADX INFO: loaded from: classes.dex */
public class h implements b.b.c.c.a.a {
    private static final int[] A = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.res.Resources f764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f765c;
    private boolean d;
    private android.support.v7.view.menu.h.a e;
    private java.util.ArrayList<android.support.v7.view.menu.j> f;
    private java.util.ArrayList<android.support.v7.view.menu.j> g;
    private boolean h;
    private java.util.ArrayList<android.support.v7.view.menu.j> i;
    private java.util.ArrayList<android.support.v7.view.menu.j> j;
    private boolean k;
    private int l;
    private android.view.ContextMenu.ContextMenuInfo m;
    java.lang.CharSequence n;
    android.graphics.drawable.Drawable o;
    android.view.View p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private java.util.ArrayList<android.support.v7.view.menu.j> v;
    private java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<android.support.v7.view.menu.o>> w;
    private android.support.v7.view.menu.j x;
    private boolean y;
    private boolean z;

    public interface a {
        void a(android.support.v7.view.menu.h r1);

        boolean a(android.support.v7.view.menu.h r1, android.view.MenuItem r2);
    }

    public interface b {
        boolean a(android.support.v7.view.menu.j r1);
    }

    static {
            r0 = 6
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [1, 4, 5, 3, 2, 0} // fill-array
            android.support.v7.view.menu.h.A = r0
            return
    }

    public h(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.l = r0
            r2.q = r0
            r2.r = r0
            r2.s = r0
            r2.t = r0
            r2.u = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.v = r1
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r2.w = r1
            r2.y = r0
            r2.f763a = r3
            android.content.res.Resources r3 = r3.getResources()
            r2.f764b = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.g = r3
            r3 = 1
            r2.h = r3
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.i = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.j = r0
            r2.k = r3
            r2.e(r3)
            return
    }

    private static int a(java.util.ArrayList<android.support.v7.view.menu.j> r2, int r3) {
            int r0 = r2.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L1a
            java.lang.Object r1 = r2.get(r0)
            android.support.v7.view.menu.j r1 = (android.support.v7.view.menu.j) r1
            int r1 = r1.c()
            if (r1 > r3) goto L17
            int r0 = r0 + 1
            return r0
        L17:
            int r0 = r0 + (-1)
            goto L6
        L1a:
            r2 = 0
            return r2
    }

    private android.support.v7.view.menu.j a(int r10, int r11, int r12, int r13, java.lang.CharSequence r14, int r15) {
            r9 = this;
            android.support.v7.view.menu.j r8 = new android.support.v7.view.menu.j
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    private void a(int r3, java.lang.CharSequence r4, int r5, android.graphics.drawable.Drawable r6, android.view.View r7) {
            r2 = this;
            android.content.res.Resources r0 = r2.l()
            r1 = 0
            if (r7 == 0) goto Le
            r2.p = r7
            r2.n = r1
            r2.o = r1
            goto L2e
        Le:
            if (r3 <= 0) goto L17
            java.lang.CharSequence r3 = r0.getText(r3)
            r2.n = r3
            goto L1b
        L17:
            if (r4 == 0) goto L1b
            r2.n = r4
        L1b:
            if (r5 <= 0) goto L28
            android.content.Context r3 = r2.e()
            android.graphics.drawable.Drawable r3 = b.b.c.a.a.b(r3, r5)
            r2.o = r3
            goto L2c
        L28:
            if (r6 == 0) goto L2c
            r2.o = r6
        L2c:
            r2.p = r1
        L2e:
            r3 = 0
            r2.b(r3)
            return
    }

    private void a(int r2, boolean r3) {
            r1 = this;
            if (r2 < 0) goto L16
            java.util.ArrayList<android.support.v7.view.menu.j> r0 = r1.f
            int r0 = r0.size()
            if (r2 < r0) goto Lb
            goto L16
        Lb:
            java.util.ArrayList<android.support.v7.view.menu.j> r0 = r1.f
            r0.remove(r2)
            if (r3 == 0) goto L16
            r2 = 1
            r1.b(r2)
        L16:
            return
    }

    private boolean a(android.support.v7.view.menu.u r4, android.support.v7.view.menu.o r5) {
            r3 = this;
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<android.support.v7.view.menu.o>> r0 = r3.w
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            if (r5 == 0) goto L10
            boolean r1 = r5.a(r4)
        L10:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<android.support.v7.view.menu.o>> r5 = r3.w
            java.util.Iterator r5 = r5.iterator()
        L16:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L38
            java.lang.Object r0 = r5.next()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r2 = r0.get()
            android.support.v7.view.menu.o r2 = (android.support.v7.view.menu.o) r2
            if (r2 != 0) goto L30
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<android.support.v7.view.menu.o>> r2 = r3.w
            r2.remove(r0)
            goto L16
        L30:
            if (r1 != 0) goto L16
            boolean r0 = r2.a(r4)
            r1 = r0
            goto L16
        L38:
            return r1
    }

    private void d(boolean r4) {
            r3 = this;
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<android.support.v7.view.menu.o>> r0 = r3.w
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9
            return
        L9:
            r3.s()
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<android.support.v7.view.menu.o>> r0 = r3.w
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            android.support.v7.view.menu.o r2 = (android.support.v7.view.menu.o) r2
            if (r2 != 0) goto L2c
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<android.support.v7.view.menu.o>> r2 = r3.w
            r2.remove(r1)
            goto L12
        L2c:
            r2.a(r4)
            goto L12
        L30:
            r3.r()
            return
    }

    private void e(boolean r3) {
            r2 = this;
            r0 = 1
            if (r3 == 0) goto L1c
            android.content.res.Resources r3 = r2.f764b
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            if (r3 == r0) goto L1c
            android.content.Context r3 = r2.f763a
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            android.content.Context r1 = r2.f763a
            boolean r3 = b.b.c.g.r.a(r3, r1)
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r2.d = r0
            return
    }

    private static int f(int r3) {
            r0 = -65536(0xffffffffffff0000, float:NaN)
            r0 = r0 & r3
            int r0 = r0 >> 16
            if (r0 < 0) goto L16
            int[] r1 = android.support.v7.view.menu.h.A
            int r2 = r1.length
            if (r0 >= r2) goto L16
            r0 = r1[r0]
            int r0 = r0 << 16
            r1 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r1
            r3 = r3 | r0
            return r3
        L16:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "order does not contain a valid category."
            r3.<init>(r0)
            throw r3
    }

    public int a(int r2) {
            r1 = this;
            r0 = 0
            int r1 = r1.a(r2, r0)
            return r1
    }

    public int a(int r3, int r4) {
            r2 = this;
            int r0 = r2.size()
            if (r4 >= 0) goto L7
            r4 = 0
        L7:
            if (r4 >= r0) goto L1b
            java.util.ArrayList<android.support.v7.view.menu.j> r1 = r2.f
            java.lang.Object r1 = r1.get(r4)
            android.support.v7.view.menu.j r1 = (android.support.v7.view.menu.j) r1
            int r1 = r1.getGroupId()
            if (r1 != r3) goto L18
            return r4
        L18:
            int r4 = r4 + 1
            goto L7
        L1b:
            r2 = -1
            return r2
    }

    protected android.support.v7.view.menu.h a(android.graphics.drawable.Drawable r7) {
            r6 = this;
            r1 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r0 = r6
            r4 = r7
            r0.a(r1, r2, r3, r4, r5)
            return r6
    }

    protected android.support.v7.view.menu.h a(android.view.View r7) {
            r6 = this;
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r0 = r6
            r5 = r7
            r0.a(r1, r2, r3, r4, r5)
            return r6
    }

    protected android.support.v7.view.menu.h a(java.lang.CharSequence r7) {
            r6 = this;
            r1 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            r2 = r7
            r0.a(r1, r2, r3, r4, r5)
            return r6
    }

    android.support.v7.view.menu.j a(int r11, android.view.KeyEvent r12) {
            r10 = this;
            java.util.ArrayList<android.support.v7.view.menu.j> r0 = r10.v
            r0.clear()
            r10.a(r0, r11, r12)
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto L10
            return r2
        L10:
            int r1 = r12.getMetaState()
            android.view.KeyCharacterMap$KeyData r3 = new android.view.KeyCharacterMap$KeyData
            r3.<init>()
            r12.getKeyData(r3)
            int r12 = r0.size()
            r4 = 1
            r5 = 0
            if (r12 != r4) goto L2b
            java.lang.Object r10 = r0.get(r5)
            android.support.v7.view.menu.j r10 = (android.support.v7.view.menu.j) r10
            return r10
        L2b:
            boolean r10 = r10.p()
            r4 = r5
        L30:
            if (r4 >= r12) goto L66
            java.lang.Object r6 = r0.get(r4)
            android.support.v7.view.menu.j r6 = (android.support.v7.view.menu.j) r6
            if (r10 == 0) goto L3f
            char r7 = r6.getAlphabeticShortcut()
            goto L43
        L3f:
            char r7 = r6.getNumericShortcut()
        L43:
            char[] r8 = r3.meta
            char r8 = r8[r5]
            if (r7 != r8) goto L4d
            r8 = r1 & 2
            if (r8 == 0) goto L62
        L4d:
            char[] r8 = r3.meta
            r9 = 2
            char r8 = r8[r9]
            if (r7 != r8) goto L58
            r8 = r1 & 2
            if (r8 != 0) goto L62
        L58:
            if (r10 == 0) goto L63
            r8 = 8
            if (r7 != r8) goto L63
            r7 = 67
            if (r11 != r7) goto L63
        L62:
            return r6
        L63:
            int r4 = r4 + 1
            goto L30
        L66:
            return r2
    }

    protected android.view.MenuItem a(int r9, int r10, int r11, java.lang.CharSequence r12) {
            r8 = this;
            int r7 = f(r11)
            int r6 = r8.l
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r7
            r5 = r12
            android.support.v7.view.menu.j r9 = r0.a(r1, r2, r3, r4, r5, r6)
            android.view.ContextMenu$ContextMenuInfo r10 = r8.m
            if (r10 == 0) goto L17
            r9.a(r10)
        L17:
            java.util.ArrayList<android.support.v7.view.menu.j> r10 = r8.f
            int r11 = a(r10, r7)
            r10.add(r11, r9)
            r10 = 1
            r8.b(r10)
            return r9
    }

    public void a() {
            r1 = this;
            android.support.v7.view.menu.h$a r0 = r1.e
            if (r0 == 0) goto L7
            r0.a(r1)
        L7:
            return
    }

    public void a(android.os.Bundle r8) {
            r7 = this;
            if (r8 != 0) goto L3
            return
        L3:
            java.lang.String r0 = r7.d()
            android.util.SparseArray r0 = r8.getSparseParcelableArray(r0)
            int r1 = r7.size()
            r2 = 0
        L10:
            if (r2 >= r1) goto L38
            android.view.MenuItem r3 = r7.getItem(r2)
            android.view.View r4 = r3.getActionView()
            if (r4 == 0) goto L26
            int r5 = r4.getId()
            r6 = -1
            if (r5 == r6) goto L26
            r4.restoreHierarchyState(r0)
        L26:
            boolean r4 = r3.hasSubMenu()
            if (r4 == 0) goto L35
            android.view.SubMenu r3 = r3.getSubMenu()
            android.support.v7.view.menu.u r3 = (android.support.v7.view.menu.u) r3
            r3.a(r8)
        L35:
            int r2 = r2 + 1
            goto L10
        L38:
            java.lang.String r0 = "android:menu:expandedactionview"
            int r8 = r8.getInt(r0)
            if (r8 <= 0) goto L49
            android.view.MenuItem r7 = r7.findItem(r8)
            if (r7 == 0) goto L49
            r7.expandActionView()
        L49:
            return
    }

    public void a(android.support.v7.view.menu.h.a r1) {
            r0 = this;
            r0.e = r1
            return
    }

    public void a(android.support.v7.view.menu.o r2) {
            r1 = this;
            android.content.Context r0 = r1.f763a
            r1.a(r2, r0)
            return
    }

    public void a(android.support.v7.view.menu.o r3, android.content.Context r4) {
            r2 = this;
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<android.support.v7.view.menu.o>> r0 = r2.w
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r3)
            r0.add(r1)
            r3.a(r4, r2)
            r3 = 1
            r2.k = r3
            return
    }

    void a(android.view.MenuItem r7) {
            r6 = this;
            int r0 = r7.getGroupId()
            java.util.ArrayList<android.support.v7.view.menu.j> r1 = r6.f
            int r1 = r1.size()
            r6.s()
            r2 = 0
            r3 = r2
        Lf:
            if (r3 >= r1) goto L38
            java.util.ArrayList<android.support.v7.view.menu.j> r4 = r6.f
            java.lang.Object r4 = r4.get(r3)
            android.support.v7.view.menu.j r4 = (android.support.v7.view.menu.j) r4
            int r5 = r4.getGroupId()
            if (r5 != r0) goto L35
            boolean r5 = r4.i()
            if (r5 != 0) goto L26
            goto L35
        L26:
            boolean r5 = r4.isCheckable()
            if (r5 != 0) goto L2d
            goto L35
        L2d:
            if (r4 != r7) goto L31
            r5 = 1
            goto L32
        L31:
            r5 = r2
        L32:
            r4.b(r5)
        L35:
            int r3 = r3 + 1
            goto Lf
        L38:
            r6.r()
            return
    }

    void a(java.util.List<android.support.v7.view.menu.j> r13, int r14, android.view.KeyEvent r15) {
            r12 = this;
            boolean r0 = r12.p()
            int r1 = r15.getModifiers()
            android.view.KeyCharacterMap$KeyData r2 = new android.view.KeyCharacterMap$KeyData
            r2.<init>()
            boolean r3 = r15.getKeyData(r2)
            r4 = 67
            if (r3 != 0) goto L18
            if (r14 == r4) goto L18
            return
        L18:
            java.util.ArrayList<android.support.v7.view.menu.j> r3 = r12.f
            int r3 = r3.size()
            r5 = 0
            r6 = r5
        L20:
            if (r6 >= r3) goto L7d
            java.util.ArrayList<android.support.v7.view.menu.j> r7 = r12.f
            java.lang.Object r7 = r7.get(r6)
            android.support.v7.view.menu.j r7 = (android.support.v7.view.menu.j) r7
            boolean r8 = r7.hasSubMenu()
            if (r8 == 0) goto L39
            android.view.SubMenu r8 = r7.getSubMenu()
            android.support.v7.view.menu.h r8 = (android.support.v7.view.menu.h) r8
            r8.a(r13, r14, r15)
        L39:
            if (r0 == 0) goto L40
            char r8 = r7.getAlphabeticShortcut()
            goto L44
        L40:
            char r8 = r7.getNumericShortcut()
        L44:
            if (r0 == 0) goto L4b
            int r9 = r7.getAlphabeticModifiers()
            goto L4f
        L4b:
            int r9 = r7.getNumericModifiers()
        L4f:
            r10 = 69647(0x1100f, float:9.7596E-41)
            r11 = r1 & r10
            r9 = r9 & r10
            if (r11 != r9) goto L59
            r9 = 1
            goto L5a
        L59:
            r9 = r5
        L5a:
            if (r9 == 0) goto L7a
            if (r8 == 0) goto L7a
            char[] r9 = r2.meta
            char r10 = r9[r5]
            if (r8 == r10) goto L71
            r10 = 2
            char r9 = r9[r10]
            if (r8 == r9) goto L71
            if (r0 == 0) goto L7a
            r9 = 8
            if (r8 != r9) goto L7a
            if (r14 != r4) goto L7a
        L71:
            boolean r8 = r7.isEnabled()
            if (r8 == 0) goto L7a
            r13.add(r7)
        L7a:
            int r6 = r6 + 1
            goto L20
        L7d:
            return
    }

    public final void a(boolean r4) {
            r3 = this;
            boolean r0 = r3.u
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r3.u = r0
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<android.support.v7.view.menu.o>> r0 = r3.w
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            android.support.v7.view.menu.o r2 = (android.support.v7.view.menu.o) r2
            if (r2 != 0) goto L28
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<android.support.v7.view.menu.o>> r2 = r3.w
            r2.remove(r1)
            goto Le
        L28:
            r2.a(r3, r4)
            goto Le
        L2c:
            r4 = 0
            r3.u = r4
            return
    }

    boolean a(android.support.v7.view.menu.h r1, android.view.MenuItem r2) {
            r0 = this;
            android.support.v7.view.menu.h$a r0 = r0.e
            if (r0 == 0) goto Lc
            boolean r0 = r0.a(r1, r2)
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public boolean a(android.support.v7.view.menu.j r5) {
            r4 = this;
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<android.support.v7.view.menu.o>> r0 = r4.w
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 != 0) goto L3f
            android.support.v7.view.menu.j r0 = r4.x
            if (r0 == r5) goto Le
            goto L3f
        Le:
            r4.s()
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<android.support.v7.view.menu.o>> r0 = r4.w
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L37
            java.lang.Object r2 = r0.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r3 = r2.get()
            android.support.v7.view.menu.o r3 = (android.support.v7.view.menu.o) r3
            if (r3 != 0) goto L31
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<android.support.v7.view.menu.o>> r3 = r4.w
            r3.remove(r2)
            goto L17
        L31:
            boolean r1 = r3.b(r4, r5)
            if (r1 == 0) goto L17
        L37:
            r4.r()
            if (r1 == 0) goto L3f
            r5 = 0
            r4.x = r5
        L3f:
            return r1
    }

    public boolean a(android.view.MenuItem r2, int r3) {
            r1 = this;
            r0 = 0
            boolean r1 = r1.a(r2, r0, r3)
            return r1
    }

    public boolean a(android.view.MenuItem r7, android.support.v7.view.menu.o r8, int r9) {
            r6 = this;
            android.support.v7.view.menu.j r7 = (android.support.v7.view.menu.j) r7
            r0 = 0
            if (r7 == 0) goto L6c
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Lc
            goto L6c
        Lc:
            boolean r1 = r7.g()
            b.b.c.g.c r2 = r7.a()
            r3 = 1
            if (r2 == 0) goto L1f
            boolean r4 = r2.a()
            if (r4 == 0) goto L1f
            r4 = r3
            goto L20
        L1f:
            r4 = r0
        L20:
            boolean r5 = r7.f()
            if (r5 == 0) goto L31
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L6b
        L2d:
            r6.a(r3)
            goto L6b
        L31:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L3f
            if (r4 == 0) goto L3a
            goto L3f
        L3a:
            r7 = r9 & 1
            if (r7 != 0) goto L6b
            goto L2d
        L3f:
            r9 = r9 & 4
            if (r9 != 0) goto L46
            r6.a(r0)
        L46:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L58
            android.support.v7.view.menu.u r9 = new android.support.v7.view.menu.u
            android.content.Context r0 = r6.e()
            r9.<init>(r0, r6, r7)
            r7.a(r9)
        L58:
            android.view.SubMenu r7 = r7.getSubMenu()
            android.support.v7.view.menu.u r7 = (android.support.v7.view.menu.u) r7
            if (r4 == 0) goto L63
            r2.a(r7)
        L63:
            boolean r7 = r6.a(r7, r8)
            r1 = r1 | r7
            if (r1 != 0) goto L6b
            goto L2d
        L6b:
            return r1
        L6c:
            return r0
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.f764b
            java.lang.String r2 = r0.getString(r2)
            r0 = 0
            android.view.MenuItem r1 = r1.a(r0, r0, r0, r2)
            return r1
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.content.res.Resources r0 = r1.f764b
            java.lang.String r5 = r0.getString(r5)
            android.view.MenuItem r1 = r1.a(r2, r3, r4, r5)
            return r1
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int r1, int r2, int r3, java.lang.CharSequence r4) {
            r0 = this;
            android.view.MenuItem r0 = r0.a(r1, r2, r3, r4)
            return r0
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(java.lang.CharSequence r2) {
            r1 = this;
            r0 = 0
            android.view.MenuItem r1 = r1.a(r0, r0, r0, r2)
            return r1
    }

    @Override // android.view.Menu
    public int addIntentOptions(int r8, int r9, int r10, android.content.ComponentName r11, android.content.Intent[] r12, android.content.Intent r13, int r14, android.view.MenuItem[] r15) {
            r7 = this;
            android.content.Context r0 = r7.f763a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r1 = 0
            java.util.List r11 = r0.queryIntentActivityOptions(r11, r12, r13, r1)
            if (r11 == 0) goto L12
            int r2 = r11.size()
            goto L13
        L12:
            r2 = r1
        L13:
            r14 = r14 & 1
            if (r14 != 0) goto L1a
            r7.removeGroup(r8)
        L1a:
            if (r1 >= r2) goto L5e
            java.lang.Object r14 = r11.get(r1)
            android.content.pm.ResolveInfo r14 = (android.content.pm.ResolveInfo) r14
            android.content.Intent r3 = new android.content.Intent
            int r4 = r14.specificIndex
            if (r4 >= 0) goto L2a
            r4 = r13
            goto L2c
        L2a:
            r4 = r12[r4]
        L2c:
            r3.<init>(r4)
            android.content.ComponentName r4 = new android.content.ComponentName
            android.content.pm.ActivityInfo r5 = r14.activityInfo
            android.content.pm.ApplicationInfo r6 = r5.applicationInfo
            java.lang.String r6 = r6.packageName
            java.lang.String r5 = r5.name
            r4.<init>(r6, r5)
            r3.setComponent(r4)
            java.lang.CharSequence r4 = r14.loadLabel(r0)
            android.view.MenuItem r4 = r7.add(r8, r9, r10, r4)
            android.graphics.drawable.Drawable r5 = r14.loadIcon(r0)
            android.view.MenuItem r4 = r4.setIcon(r5)
            android.view.MenuItem r3 = r4.setIntent(r3)
            if (r15 == 0) goto L5b
            int r14 = r14.specificIndex
            if (r14 < 0) goto L5b
            r15[r14] = r3
        L5b:
            int r1 = r1 + 1
            goto L1a
        L5e:
            return r2
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.f764b
            java.lang.String r2 = r0.getString(r2)
            r0 = 0
            android.view.SubMenu r1 = r1.addSubMenu(r0, r0, r0, r2)
            return r1
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.content.res.Resources r0 = r1.f764b
            java.lang.String r5 = r0.getString(r5)
            android.view.SubMenu r1 = r1.addSubMenu(r2, r3, r4, r5)
            return r1
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int r1, int r2, int r3, java.lang.CharSequence r4) {
            r0 = this;
            android.view.MenuItem r1 = r0.a(r1, r2, r3, r4)
            android.support.v7.view.menu.j r1 = (android.support.v7.view.menu.j) r1
            android.support.v7.view.menu.u r2 = new android.support.v7.view.menu.u
            android.content.Context r3 = r0.f763a
            r2.<init>(r3, r0, r1)
            r1.a(r2)
            return r2
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(java.lang.CharSequence r2) {
            r1 = this;
            r0 = 0
            android.view.SubMenu r1 = r1.addSubMenu(r0, r0, r0, r2)
            return r1
    }

    public int b(int r4) {
            r3 = this;
            int r0 = r3.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L19
            java.util.ArrayList<android.support.v7.view.menu.j> r2 = r3.f
            java.lang.Object r2 = r2.get(r1)
            android.support.v7.view.menu.j r2 = (android.support.v7.view.menu.j) r2
            int r2 = r2.getItemId()
            if (r2 != r4) goto L16
            return r1
        L16:
            int r1 = r1 + 1
            goto L5
        L19:
            r3 = -1
            return r3
    }

    public void b() {
            r6 = this;
            java.util.ArrayList r0 = r6.n()
            boolean r1 = r6.k
            if (r1 != 0) goto L9
            return
        L9:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<android.support.v7.view.menu.o>> r1 = r6.w
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
            r3 = r2
        L11:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L31
            java.lang.Object r4 = r1.next()
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
            java.lang.Object r5 = r4.get()
            android.support.v7.view.menu.o r5 = (android.support.v7.view.menu.o) r5
            if (r5 != 0) goto L2b
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<android.support.v7.view.menu.o>> r5 = r6.w
            r5.remove(r4)
            goto L11
        L2b:
            boolean r4 = r5.d()
            r3 = r3 | r4
            goto L11
        L31:
            if (r3 == 0) goto L5b
            java.util.ArrayList<android.support.v7.view.menu.j> r1 = r6.i
            r1.clear()
            java.util.ArrayList<android.support.v7.view.menu.j> r1 = r6.j
            r1.clear()
            int r1 = r0.size()
            r3 = r2
        L42:
            if (r3 >= r1) goto L6e
            java.lang.Object r4 = r0.get(r3)
            android.support.v7.view.menu.j r4 = (android.support.v7.view.menu.j) r4
            boolean r5 = r4.h()
            if (r5 == 0) goto L53
            java.util.ArrayList<android.support.v7.view.menu.j> r5 = r6.i
            goto L55
        L53:
            java.util.ArrayList<android.support.v7.view.menu.j> r5 = r6.j
        L55:
            r5.add(r4)
            int r3 = r3 + 1
            goto L42
        L5b:
            java.util.ArrayList<android.support.v7.view.menu.j> r0 = r6.i
            r0.clear()
            java.util.ArrayList<android.support.v7.view.menu.j> r0 = r6.j
            r0.clear()
            java.util.ArrayList<android.support.v7.view.menu.j> r0 = r6.j
            java.util.ArrayList r1 = r6.n()
            r0.addAll(r1)
        L6e:
            r6.k = r2
            return
    }

    public void b(android.os.Bundle r8) {
            r7 = this;
            int r0 = r7.size()
            r1 = 0
            r2 = 0
        L6:
            if (r2 >= r0) goto L44
            android.view.MenuItem r3 = r7.getItem(r2)
            android.view.View r4 = r3.getActionView()
            if (r4 == 0) goto L32
            int r5 = r4.getId()
            r6 = -1
            if (r5 == r6) goto L32
            if (r1 != 0) goto L20
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
        L20:
            r4.saveHierarchyState(r1)
            boolean r4 = r3.isActionViewExpanded()
            if (r4 == 0) goto L32
            int r4 = r3.getItemId()
            java.lang.String r5 = "android:menu:expandedactionview"
            r8.putInt(r5, r4)
        L32:
            boolean r4 = r3.hasSubMenu()
            if (r4 == 0) goto L41
            android.view.SubMenu r3 = r3.getSubMenu()
            android.support.v7.view.menu.u r3 = (android.support.v7.view.menu.u) r3
            r3.b(r8)
        L41:
            int r2 = r2 + 1
            goto L6
        L44:
            if (r1 == 0) goto L4d
            java.lang.String r7 = r7.d()
            r8.putSparseParcelableArray(r7, r1)
        L4d:
            return
    }

    public void b(android.support.v7.view.menu.o r4) {
            r3 = this;
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<android.support.v7.view.menu.o>> r0 = r3.w
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            android.support.v7.view.menu.o r2 = (android.support.v7.view.menu.o) r2
            if (r2 == 0) goto L1c
            if (r2 != r4) goto L6
        L1c:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<android.support.v7.view.menu.o>> r2 = r3.w
            r2.remove(r1)
            goto L6
        L22:
            return
    }

    public void b(boolean r3) {
            r2 = this;
            boolean r0 = r2.q
            r1 = 1
            if (r0 != 0) goto Lf
            if (r3 == 0) goto Lb
            r2.h = r1
            r2.k = r1
        Lb:
            r2.d(r3)
            goto L15
        Lf:
            r2.r = r1
            if (r3 == 0) goto L15
            r2.s = r1
        L15:
            return
    }

    public boolean b(android.support.v7.view.menu.j r5) {
            r4 = this;
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<android.support.v7.view.menu.o>> r0 = r4.w
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            r4.s()
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<android.support.v7.view.menu.o>> r0 = r4.w
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r0.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r3 = r2.get()
            android.support.v7.view.menu.o r3 = (android.support.v7.view.menu.o) r3
            if (r3 != 0) goto L2d
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<android.support.v7.view.menu.o>> r3 = r4.w
            r3.remove(r2)
            goto L13
        L2d:
            boolean r1 = r3.a(r4, r5)
            if (r1 == 0) goto L13
        L33:
            r4.r()
            if (r1 == 0) goto L3a
            r4.x = r5
        L3a:
            return r1
    }

    public android.support.v7.view.menu.h c(int r1) {
            r0 = this;
            r0.l = r1
            return r0
    }

    public java.util.ArrayList<android.support.v7.view.menu.j> c() {
            r0 = this;
            r0.b()
            java.util.ArrayList<android.support.v7.view.menu.j> r0 = r0.i
            return r0
    }

    void c(android.support.v7.view.menu.j r1) {
            r0 = this;
            r1 = 1
            r0.k = r1
            r0.b(r1)
            return
    }

    public void c(boolean r1) {
            r0 = this;
            r0.z = r1
            return
    }

    @Override // android.view.Menu
    public void clear() {
            r1 = this;
            android.support.v7.view.menu.j r0 = r1.x
            if (r0 == 0) goto L7
            r1.a(r0)
        L7:
            java.util.ArrayList<android.support.v7.view.menu.j> r0 = r1.f
            r0.clear()
            r0 = 1
            r1.b(r0)
            return
    }

    public void clearHeader() {
            r1 = this;
            r0 = 0
            r1.o = r0
            r1.n = r0
            r1.p = r0
            r0 = 0
            r1.b(r0)
            return
    }

    @Override // android.view.Menu
    public void close() {
            r1 = this;
            r0 = 1
            r1.a(r0)
            return
    }

    protected android.support.v7.view.menu.h d(int r7) {
            r6 = this;
            r1 = 0
            r2 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            r3 = r7
            r0.a(r1, r2, r3, r4, r5)
            return r6
    }

    protected java.lang.String d() {
            r0 = this;
            java.lang.String r0 = "android:menu:actionviewstates"
            return r0
    }

    void d(android.support.v7.view.menu.j r1) {
            r0 = this;
            r1 = 1
            r0.h = r1
            r0.b(r1)
            return
    }

    public android.content.Context e() {
            r0 = this;
            android.content.Context r0 = r0.f763a
            return r0
    }

    protected android.support.v7.view.menu.h e(int r7) {
            r6 = this;
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            r1 = r7
            r0.a(r1, r2, r3, r4, r5)
            return r6
    }

    public android.support.v7.view.menu.j f() {
            r0 = this;
            android.support.v7.view.menu.j r0 = r0.x
            return r0
    }

    @Override // android.view.Menu
    public android.view.MenuItem findItem(int r5) {
            r4 = this;
            int r0 = r4.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L2a
            java.util.ArrayList<android.support.v7.view.menu.j> r2 = r4.f
            java.lang.Object r2 = r2.get(r1)
            android.support.v7.view.menu.j r2 = (android.support.v7.view.menu.j) r2
            int r3 = r2.getItemId()
            if (r3 != r5) goto L16
            return r2
        L16:
            boolean r3 = r2.hasSubMenu()
            if (r3 == 0) goto L27
            android.view.SubMenu r2 = r2.getSubMenu()
            android.view.MenuItem r2 = r2.findItem(r5)
            if (r2 == 0) goto L27
            return r2
        L27:
            int r1 = r1 + 1
            goto L5
        L2a:
            r4 = 0
            return r4
    }

    public android.graphics.drawable.Drawable g() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.o
            return r0
    }

    @Override // android.view.Menu
    public android.view.MenuItem getItem(int r1) {
            r0 = this;
            java.util.ArrayList<android.support.v7.view.menu.j> r0 = r0.f
            java.lang.Object r0 = r0.get(r1)
            android.view.MenuItem r0 = (android.view.MenuItem) r0
            return r0
    }

    public java.lang.CharSequence h() {
            r0 = this;
            java.lang.CharSequence r0 = r0.n
            return r0
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
            r5 = this;
            boolean r0 = r5.z
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            int r0 = r5.size()
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r0) goto L20
            java.util.ArrayList<android.support.v7.view.menu.j> r4 = r5.f
            java.lang.Object r4 = r4.get(r3)
            android.support.v7.view.menu.j r4 = (android.support.v7.view.menu.j) r4
            boolean r4 = r4.isVisible()
            if (r4 == 0) goto L1d
            return r1
        L1d:
            int r3 = r3 + 1
            goto Lc
        L20:
            return r2
    }

    public android.view.View i() {
            r0 = this;
            android.view.View r0 = r0.p
            return r0
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int r1, android.view.KeyEvent r2) {
            r0 = this;
            android.support.v7.view.menu.j r0 = r0.a(r1, r2)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public java.util.ArrayList<android.support.v7.view.menu.j> j() {
            r0 = this;
            r0.b()
            java.util.ArrayList<android.support.v7.view.menu.j> r0 = r0.j
            return r0
    }

    boolean k() {
            r0 = this;
            boolean r0 = r0.t
            return r0
    }

    android.content.res.Resources l() {
            r0 = this;
            android.content.res.Resources r0 = r0.f764b
            return r0
    }

    public android.support.v7.view.menu.h m() {
            r0 = this;
            return r0
    }

    public java.util.ArrayList<android.support.v7.view.menu.j> n() {
            r5 = this;
            boolean r0 = r5.h
            if (r0 != 0) goto L7
            java.util.ArrayList<android.support.v7.view.menu.j> r5 = r5.g
            return r5
        L7:
            java.util.ArrayList<android.support.v7.view.menu.j> r0 = r5.g
            r0.clear()
            java.util.ArrayList<android.support.v7.view.menu.j> r0 = r5.f
            int r0 = r0.size()
            r1 = 0
            r2 = r1
        L14:
            if (r2 >= r0) goto L2c
            java.util.ArrayList<android.support.v7.view.menu.j> r3 = r5.f
            java.lang.Object r3 = r3.get(r2)
            android.support.v7.view.menu.j r3 = (android.support.v7.view.menu.j) r3
            boolean r4 = r3.isVisible()
            if (r4 == 0) goto L29
            java.util.ArrayList<android.support.v7.view.menu.j> r4 = r5.g
            r4.add(r3)
        L29:
            int r2 = r2 + 1
            goto L14
        L2c:
            r5.h = r1
            r0 = 1
            r5.k = r0
            java.util.ArrayList<android.support.v7.view.menu.j> r5 = r5.g
            return r5
    }

    public boolean o() {
            r0 = this;
            boolean r0 = r0.y
            return r0
    }

    boolean p() {
            r0 = this;
            boolean r0 = r0.f765c
            return r0
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int r1, int r2) {
            r0 = this;
            android.view.MenuItem r1 = r0.findItem(r1)
            boolean r0 = r0.a(r1, r2)
            return r0
    }

    @Override // android.view.Menu
    public boolean performShortcut(int r1, android.view.KeyEvent r2, int r3) {
            r0 = this;
            android.support.v7.view.menu.j r1 = r0.a(r1, r2)
            if (r1 == 0) goto Lb
            boolean r1 = r0.a(r1, r3)
            goto Lc
        Lb:
            r1 = 0
        Lc:
            r2 = r3 & 2
            if (r2 == 0) goto L14
            r2 = 1
            r0.a(r2)
        L14:
            return r1
    }

    public boolean q() {
            r0 = this;
            boolean r0 = r0.d
            return r0
    }

    public void r() {
            r2 = this;
            r0 = 0
            r2.q = r0
            boolean r1 = r2.r
            if (r1 == 0) goto Le
            r2.r = r0
            boolean r0 = r2.s
            r2.b(r0)
        Le:
            return
    }

    @Override // android.view.Menu
    public void removeGroup(int r6) {
            r5 = this;
            int r0 = r5.a(r6)
            if (r0 < 0) goto L2a
            java.util.ArrayList<android.support.v7.view.menu.j> r1 = r5.f
            int r1 = r1.size()
            int r1 = r1 - r0
            r2 = 0
            r3 = r2
        Lf:
            int r4 = r3 + 1
            if (r3 >= r1) goto L26
            java.util.ArrayList<android.support.v7.view.menu.j> r3 = r5.f
            java.lang.Object r3 = r3.get(r0)
            android.support.v7.view.menu.j r3 = (android.support.v7.view.menu.j) r3
            int r3 = r3.getGroupId()
            if (r3 != r6) goto L26
            r5.a(r0, r2)
            r3 = r4
            goto Lf
        L26:
            r6 = 1
            r5.b(r6)
        L2a:
            return
    }

    @Override // android.view.Menu
    public void removeItem(int r2) {
            r1 = this;
            int r2 = r1.b(r2)
            r0 = 1
            r1.a(r2, r0)
            return
    }

    public void s() {
            r1 = this;
            boolean r0 = r1.q
            if (r0 != 0) goto Lc
            r0 = 1
            r1.q = r0
            r0 = 0
            r1.r = r0
            r1.s = r0
        Lc:
            return
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int r5, boolean r6, boolean r7) {
            r4 = this;
            java.util.ArrayList<android.support.v7.view.menu.j> r0 = r4.f
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L20
            java.util.ArrayList<android.support.v7.view.menu.j> r2 = r4.f
            java.lang.Object r2 = r2.get(r1)
            android.support.v7.view.menu.j r2 = (android.support.v7.view.menu.j) r2
            int r3 = r2.getGroupId()
            if (r3 != r5) goto L1d
            r2.c(r7)
            r2.setCheckable(r6)
        L1d:
            int r1 = r1 + 1
            goto L7
        L20:
            return
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean r1) {
            r0 = this;
            r0.y = r1
            return
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int r5, boolean r6) {
            r4 = this;
            java.util.ArrayList<android.support.v7.view.menu.j> r0 = r4.f
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L1d
            java.util.ArrayList<android.support.v7.view.menu.j> r2 = r4.f
            java.lang.Object r2 = r2.get(r1)
            android.support.v7.view.menu.j r2 = (android.support.v7.view.menu.j) r2
            int r3 = r2.getGroupId()
            if (r3 != r5) goto L1a
            r2.setEnabled(r6)
        L1a:
            int r1 = r1 + 1
            goto L7
        L1d:
            return
    }

    @Override // android.view.Menu
    public void setGroupVisible(int r7, boolean r8) {
            r6 = this;
            java.util.ArrayList<android.support.v7.view.menu.j> r0 = r6.f
            int r0 = r0.size()
            r1 = 0
            r2 = r1
        L8:
            r3 = 1
            if (r1 >= r0) goto L23
            java.util.ArrayList<android.support.v7.view.menu.j> r4 = r6.f
            java.lang.Object r4 = r4.get(r1)
            android.support.v7.view.menu.j r4 = (android.support.v7.view.menu.j) r4
            int r5 = r4.getGroupId()
            if (r5 != r7) goto L20
            boolean r4 = r4.e(r8)
            if (r4 == 0) goto L20
            r2 = r3
        L20:
            int r1 = r1 + 1
            goto L8
        L23:
            if (r2 == 0) goto L28
            r6.b(r3)
        L28:
            return
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean r1) {
            r0 = this;
            r0.f765c = r1
            r1 = 0
            r0.b(r1)
            return
    }

    @Override // android.view.Menu
    public int size() {
            r0 = this;
            java.util.ArrayList<android.support.v7.view.menu.j> r0 = r0.f
            int r0 = r0.size()
            return r0
    }
}
