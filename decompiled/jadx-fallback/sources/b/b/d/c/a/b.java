package b.b.d.c.a;

/* JADX INFO: loaded from: classes.dex */
class b extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b.b.d.c.a.b.c f1150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.graphics.Rect f1151c;
    private android.graphics.drawable.Drawable d;
    private android.graphics.drawable.Drawable e;
    private int f;
    private boolean g;
    private int h;
    private boolean i;
    private java.lang.Runnable j;
    private long k;
    private long l;
    private b.b.d.c.a.b.C0050b m;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b.b.d.c.a.b f1152b;

        a(b.b.d.c.a.b r1) {
                r0 = this;
                r0.f1152b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                b.b.d.c.a.b r0 = r2.f1152b
                r1 = 1
                r0.a(r1)
                b.b.d.c.a.b r2 = r2.f1152b
                r2.invalidateSelf()
                return
        }
    }

    /* JADX INFO: renamed from: b.b.d.c.a.b$b, reason: collision with other inner class name */
    static class C0050b implements android.graphics.drawable.Drawable.Callback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private android.graphics.drawable.Drawable.Callback f1153b;

        C0050b() {
                r0 = this;
                r0.<init>()
                return
        }

        public android.graphics.drawable.Drawable.Callback a() {
                r2 = this;
                android.graphics.drawable.Drawable$Callback r0 = r2.f1153b
                r1 = 0
                r2.f1153b = r1
                return r0
        }

        public b.b.d.c.a.b.C0050b a(android.graphics.drawable.Drawable.Callback r1) {
                r0 = this;
                r0.f1153b = r1
                return r0
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(android.graphics.drawable.Drawable r1) {
                r0 = this;
                return
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2, long r3) {
                r0 = this;
                android.graphics.drawable.Drawable$Callback r0 = r0.f1153b
                if (r0 == 0) goto L7
                r0.scheduleDrawable(r1, r2, r3)
            L7:
                return
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2) {
                r0 = this;
                android.graphics.drawable.Drawable$Callback r0 = r0.f1153b
                if (r0 == 0) goto L7
                r0.unscheduleDrawable(r1, r2)
            L7:
                return
        }
    }

    static abstract class c extends android.graphics.drawable.Drawable.ConstantState {
        int A;
        int B;
        boolean C;
        android.graphics.ColorFilter D;
        boolean E;
        android.content.res.ColorStateList F;
        android.graphics.PorterDuff.Mode G;
        boolean H;
        boolean I;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final b.b.d.c.a.b f1154a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        android.content.res.Resources f1155b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f1156c;
        int d;
        int e;
        android.util.SparseArray<android.graphics.drawable.Drawable.ConstantState> f;
        android.graphics.drawable.Drawable[] g;
        int h;
        boolean i;
        boolean j;
        android.graphics.Rect k;
        boolean l;
        boolean m;
        int n;
        int o;
        int p;
        int q;
        boolean r;
        int s;
        boolean t;
        boolean u;
        boolean v;
        boolean w;
        boolean x;
        boolean y;
        int z;

        c(b.b.d.c.a.b.c r3, b.b.d.c.a.b r4, android.content.res.Resources r5) {
                r2 = this;
                r2.<init>()
                r0 = 160(0xa0, float:2.24E-43)
                r2.f1156c = r0
                r0 = 0
                r2.i = r0
                r2.l = r0
                r1 = 1
                r2.x = r1
                r2.A = r0
                r2.B = r0
                r2.f1154a = r4
                if (r5 == 0) goto L19
                r4 = r5
                goto L1f
            L19:
                if (r3 == 0) goto L1e
                android.content.res.Resources r4 = r3.f1155b
                goto L1f
            L1e:
                r4 = 0
            L1f:
                r2.f1155b = r4
                if (r3 == 0) goto L26
                int r4 = r3.f1156c
                goto L27
            L26:
                r4 = r0
            L27:
                int r4 = b.b.d.c.a.b.a(r5, r4)
                r2.f1156c = r4
                if (r3 == 0) goto Lec
                int r5 = r3.d
                r2.d = r5
                int r5 = r3.e
                r2.e = r5
                r2.v = r1
                r2.w = r1
                boolean r5 = r3.i
                r2.i = r5
                boolean r5 = r3.l
                r2.l = r5
                boolean r5 = r3.x
                r2.x = r5
                boolean r5 = r3.y
                r2.y = r5
                int r5 = r3.z
                r2.z = r5
                int r5 = r3.A
                r2.A = r5
                int r5 = r3.B
                r2.B = r5
                boolean r5 = r3.C
                r2.C = r5
                android.graphics.ColorFilter r5 = r3.D
                r2.D = r5
                boolean r5 = r3.E
                r2.E = r5
                android.content.res.ColorStateList r5 = r3.F
                r2.F = r5
                android.graphics.PorterDuff$Mode r5 = r3.G
                r2.G = r5
                boolean r5 = r3.H
                r2.H = r5
                boolean r5 = r3.I
                r2.I = r5
                int r5 = r3.f1156c
                if (r5 != r4) goto L9c
                boolean r4 = r3.j
                if (r4 == 0) goto L86
                android.graphics.Rect r4 = new android.graphics.Rect
                android.graphics.Rect r5 = r3.k
                r4.<init>(r5)
                r2.k = r4
                r2.j = r1
            L86:
                boolean r4 = r3.m
                if (r4 == 0) goto L9c
                int r4 = r3.n
                r2.n = r4
                int r4 = r3.o
                r2.o = r4
                int r4 = r3.p
                r2.p = r4
                int r4 = r3.q
                r2.q = r4
                r2.m = r1
            L9c:
                boolean r4 = r3.r
                if (r4 == 0) goto La6
                int r4 = r3.s
                r2.s = r4
                r2.r = r1
            La6:
                boolean r4 = r3.t
                if (r4 == 0) goto Lb0
                boolean r4 = r3.u
                r2.u = r4
                r2.t = r1
            Lb0:
                android.graphics.drawable.Drawable[] r4 = r3.g
                int r5 = r4.length
                android.graphics.drawable.Drawable[] r5 = new android.graphics.drawable.Drawable[r5]
                r2.g = r5
                int r5 = r3.h
                r2.h = r5
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r3 = r3.f
                if (r3 == 0) goto Lc4
                android.util.SparseArray r3 = r3.clone()
                goto Lcb
            Lc4:
                android.util.SparseArray r3 = new android.util.SparseArray
                int r5 = r2.h
                r3.<init>(r5)
            Lcb:
                r2.f = r3
                int r3 = r2.h
            Lcf:
                if (r0 >= r3) goto Lf4
                r5 = r4[r0]
                if (r5 == 0) goto Le9
                r5 = r4[r0]
                android.graphics.drawable.Drawable$ConstantState r5 = r5.getConstantState()
                if (r5 == 0) goto Le3
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r1 = r2.f
                r1.put(r0, r5)
                goto Le9
            Le3:
                android.graphics.drawable.Drawable[] r5 = r2.g
                r1 = r4[r0]
                r5[r0] = r1
            Le9:
                int r0 = r0 + 1
                goto Lcf
            Lec:
                r3 = 10
                android.graphics.drawable.Drawable[] r3 = new android.graphics.drawable.Drawable[r3]
                r2.g = r3
                r2.h = r0
            Lf4:
                return
        }

        private android.graphics.drawable.Drawable b(android.graphics.drawable.Drawable r3) {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 23
                if (r0 < r1) goto Lb
                int r0 = r2.z
                r3.setLayoutDirection(r0)
            Lb:
                android.graphics.drawable.Drawable r3 = r3.mutate()
                b.b.d.c.a.b r2 = r2.f1154a
                r3.setCallback(r2)
                return r3
        }

        private void n() {
                r6 = this;
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r0 = r6.f
                if (r0 == 0) goto L2d
                int r0 = r0.size()
                r1 = 0
            L9:
                if (r1 >= r0) goto L2a
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r2 = r6.f
                int r2 = r2.keyAt(r1)
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r3 = r6.f
                java.lang.Object r3 = r3.valueAt(r1)
                android.graphics.drawable.Drawable$ConstantState r3 = (android.graphics.drawable.Drawable.ConstantState) r3
                android.graphics.drawable.Drawable[] r4 = r6.g
                android.content.res.Resources r5 = r6.f1155b
                android.graphics.drawable.Drawable r3 = r3.newDrawable(r5)
                android.graphics.drawable.Drawable r3 = r6.b(r3)
                r4[r2] = r3
                int r1 = r1 + 1
                goto L9
            L2a:
                r0 = 0
                r6.f = r0
            L2d:
                return
        }

        public final int a(android.graphics.drawable.Drawable r5) {
                r4 = this;
                int r0 = r4.h
                android.graphics.drawable.Drawable[] r1 = r4.g
                int r1 = r1.length
                if (r0 < r1) goto Lc
                int r1 = r0 + 10
                r4.a(r0, r1)
            Lc:
                r5.mutate()
                r1 = 1
                r2 = 0
                r5.setVisible(r2, r1)
                b.b.d.c.a.b r3 = r4.f1154a
                r5.setCallback(r3)
                android.graphics.drawable.Drawable[] r3 = r4.g
                r3[r0] = r5
                int r3 = r4.h
                int r3 = r3 + r1
                r4.h = r3
                int r1 = r4.e
                int r5 = r5.getChangingConfigurations()
                r5 = r5 | r1
                r4.e = r5
                r4.k()
                r5 = 0
                r4.k = r5
                r4.j = r2
                r4.m = r2
                r4.v = r2
                return r0
        }

        public final android.graphics.drawable.Drawable a(int r5) {
                r4 = this;
                android.graphics.drawable.Drawable[] r0 = r4.g
                r0 = r0[r5]
                if (r0 == 0) goto L7
                return r0
            L7:
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r0 = r4.f
                r1 = 0
                if (r0 == 0) goto L38
                int r0 = r0.indexOfKey(r5)
                if (r0 < 0) goto L38
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r2 = r4.f
                java.lang.Object r2 = r2.valueAt(r0)
                android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2
                android.content.res.Resources r3 = r4.f1155b
                android.graphics.drawable.Drawable r2 = r2.newDrawable(r3)
                android.graphics.drawable.Drawable r2 = r4.b(r2)
                android.graphics.drawable.Drawable[] r3 = r4.g
                r3[r5] = r2
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r5 = r4.f
                r5.removeAt(r0)
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r5 = r4.f
                int r5 = r5.size()
                if (r5 != 0) goto L37
                r4.f = r1
            L37:
                return r2
            L38:
                return r1
        }

        public void a(int r3, int r4) {
                r2 = this;
                android.graphics.drawable.Drawable[] r4 = new android.graphics.drawable.Drawable[r4]
                android.graphics.drawable.Drawable[] r0 = r2.g
                r1 = 0
                java.lang.System.arraycopy(r0, r1, r4, r1, r3)
                r2.g = r4
                return
        }

        final void a(android.content.res.Resources.Theme r6) {
                r5 = this;
                if (r6 == 0) goto L32
                r5.n()
                int r0 = r5.h
                android.graphics.drawable.Drawable[] r1 = r5.g
                r2 = 0
            La:
                if (r2 >= r0) goto L2b
                r3 = r1[r2]
                if (r3 == 0) goto L28
                r3 = r1[r2]
                boolean r3 = r3.canApplyTheme()
                if (r3 == 0) goto L28
                r3 = r1[r2]
                r3.applyTheme(r6)
                int r3 = r5.e
                r4 = r1[r2]
                int r4 = r4.getChangingConfigurations()
                r3 = r3 | r4
                r5.e = r3
            L28:
                int r2 = r2 + 1
                goto La
            L2b:
                android.content.res.Resources r6 = r6.getResources()
                r5.a(r6)
            L32:
                return
        }

        final void a(android.content.res.Resources r2) {
                r1 = this;
                if (r2 == 0) goto L15
                r1.f1155b = r2
                int r0 = r1.f1156c
                int r2 = b.b.d.c.a.b.a(r2, r0)
                int r0 = r1.f1156c
                r1.f1156c = r2
                if (r0 == r2) goto L15
                r2 = 0
                r1.m = r2
                r1.j = r2
            L15:
                return
        }

        public final void a(boolean r1) {
                r0 = this;
                r0.l = r1
                return
        }

        public synchronized boolean a() {
                r6 = this;
                monitor-enter(r6)
                boolean r0 = r6.v     // Catch: java.lang.Throwable -> L2a
                if (r0 == 0) goto L9
                boolean r0 = r6.w     // Catch: java.lang.Throwable -> L2a
                monitor-exit(r6)
                return r0
            L9:
                r6.n()     // Catch: java.lang.Throwable -> L2a
                r0 = 1
                r6.v = r0     // Catch: java.lang.Throwable -> L2a
                int r1 = r6.h     // Catch: java.lang.Throwable -> L2a
                android.graphics.drawable.Drawable[] r2 = r6.g     // Catch: java.lang.Throwable -> L2a
                r3 = 0
                r4 = r3
            L15:
                if (r4 >= r1) goto L26
                r5 = r2[r4]     // Catch: java.lang.Throwable -> L2a
                android.graphics.drawable.Drawable$ConstantState r5 = r5.getConstantState()     // Catch: java.lang.Throwable -> L2a
                if (r5 != 0) goto L23
                r6.w = r3     // Catch: java.lang.Throwable -> L2a
                monitor-exit(r6)
                return r3
            L23:
                int r4 = r4 + 1
                goto L15
            L26:
                r6.w = r0     // Catch: java.lang.Throwable -> L2a
                monitor-exit(r6)
                return r0
            L2a:
                r0 = move-exception
                monitor-exit(r6)
                throw r0
        }

        protected void b() {
                r6 = this;
                r0 = 1
                r6.m = r0
                r6.n()
                int r0 = r6.h
                android.graphics.drawable.Drawable[] r1 = r6.g
                r2 = -1
                r6.o = r2
                r6.n = r2
                r2 = 0
                r6.q = r2
                r6.p = r2
            L14:
                if (r2 >= r0) goto L43
                r3 = r1[r2]
                int r4 = r3.getIntrinsicWidth()
                int r5 = r6.n
                if (r4 <= r5) goto L22
                r6.n = r4
            L22:
                int r4 = r3.getIntrinsicHeight()
                int r5 = r6.o
                if (r4 <= r5) goto L2c
                r6.o = r4
            L2c:
                int r4 = r3.getMinimumWidth()
                int r5 = r6.p
                if (r4 <= r5) goto L36
                r6.p = r4
            L36:
                int r3 = r3.getMinimumHeight()
                int r4 = r6.q
                if (r3 <= r4) goto L40
                r6.q = r3
            L40:
                int r2 = r2 + 1
                goto L14
            L43:
                return
        }

        public final void b(int r1) {
                r0 = this;
                r0.A = r1
                return
        }

        public final void b(boolean r1) {
                r0 = this;
                r0.i = r1
                return
        }

        final boolean b(int r8, int r9) {
                r7 = this;
                int r0 = r7.h
                android.graphics.drawable.Drawable[] r1 = r7.g
                r2 = 0
                r3 = r2
                r4 = r3
            L7:
                if (r3 >= r0) goto L21
                r5 = r1[r3]
                if (r5 == 0) goto L1e
                int r5 = android.os.Build.VERSION.SDK_INT
                r6 = 23
                if (r5 < r6) goto L1a
                r5 = r1[r3]
                boolean r5 = r5.setLayoutDirection(r8)
                goto L1b
            L1a:
                r5 = r2
            L1b:
                if (r3 != r9) goto L1e
                r4 = r5
            L1e:
                int r3 = r3 + 1
                goto L7
            L21:
                r7.z = r8
                return r4
        }

        final int c() {
                r0 = this;
                android.graphics.drawable.Drawable[] r0 = r0.g
                int r0 = r0.length
                return r0
        }

        public final void c(int r1) {
                r0 = this;
                r0.B = r1
                return
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
                r6 = this;
                int r0 = r6.h
                android.graphics.drawable.Drawable[] r1 = r6.g
                r2 = 0
                r3 = r2
            L6:
                if (r3 >= r0) goto L28
                r4 = r1[r3]
                r5 = 1
                if (r4 == 0) goto L14
                boolean r4 = r4.canApplyTheme()
                if (r4 == 0) goto L25
                return r5
            L14:
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r4 = r6.f
                java.lang.Object r4 = r4.get(r3)
                android.graphics.drawable.Drawable$ConstantState r4 = (android.graphics.drawable.Drawable.ConstantState) r4
                if (r4 == 0) goto L25
                boolean r4 = r4.canApplyTheme()
                if (r4 == 0) goto L25
                return r5
            L25:
                int r3 = r3 + 1
                goto L6
            L28:
                return r2
        }

        public final int d() {
                r0 = this;
                int r0 = r0.h
                return r0
        }

        public final int e() {
                r1 = this;
                boolean r0 = r1.m
                if (r0 != 0) goto L7
                r1.b()
            L7:
                int r1 = r1.o
                return r1
        }

        public final int f() {
                r1 = this;
                boolean r0 = r1.m
                if (r0 != 0) goto L7
                r1.b()
            L7:
                int r1 = r1.q
                return r1
        }

        public final int g() {
                r1 = this;
                boolean r0 = r1.m
                if (r0 != 0) goto L7
                r1.b()
            L7:
                int r1 = r1.p
                return r1
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
                r1 = this;
                int r0 = r1.d
                int r1 = r1.e
                r1 = r1 | r0
                return r1
        }

        public final android.graphics.Rect h() {
                r8 = this;
                boolean r0 = r8.i
                r1 = 0
                if (r0 == 0) goto L6
                return r1
            L6:
                android.graphics.Rect r0 = r8.k
                if (r0 != 0) goto L57
                boolean r0 = r8.j
                if (r0 == 0) goto Lf
                goto L57
            Lf:
                r8.n()
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                int r2 = r8.h
                android.graphics.drawable.Drawable[] r3 = r8.g
                r4 = 0
                r5 = r4
            L1d:
                if (r5 >= r2) goto L51
                r6 = r3[r5]
                boolean r6 = r6.getPadding(r0)
                if (r6 == 0) goto L4e
                if (r1 != 0) goto L2e
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>(r4, r4, r4, r4)
            L2e:
                int r6 = r0.left
                int r7 = r1.left
                if (r6 <= r7) goto L36
                r1.left = r6
            L36:
                int r6 = r0.top
                int r7 = r1.top
                if (r6 <= r7) goto L3e
                r1.top = r6
            L3e:
                int r6 = r0.right
                int r7 = r1.right
                if (r6 <= r7) goto L46
                r1.right = r6
            L46:
                int r6 = r0.bottom
                int r7 = r1.bottom
                if (r6 <= r7) goto L4e
                r1.bottom = r6
            L4e:
                int r5 = r5 + 1
                goto L1d
            L51:
                r0 = 1
                r8.j = r0
                r8.k = r1
                return r1
            L57:
                android.graphics.Rect r8 = r8.k
                return r8
        }

        public final int i() {
                r1 = this;
                boolean r0 = r1.m
                if (r0 != 0) goto L7
                r1.b()
            L7:
                int r1 = r1.n
                return r1
        }

        public final int j() {
                r6 = this;
                boolean r0 = r6.r
                if (r0 == 0) goto L7
                int r6 = r6.s
                return r6
            L7:
                r6.n()
                int r0 = r6.h
                android.graphics.drawable.Drawable[] r1 = r6.g
                if (r0 <= 0) goto L18
                r2 = 0
                r2 = r1[r2]
                int r2 = r2.getOpacity()
                goto L19
            L18:
                r2 = -2
            L19:
                r3 = 1
                r4 = r3
            L1b:
                if (r4 >= r0) goto L2a
                r5 = r1[r4]
                int r5 = r5.getOpacity()
                int r2 = android.graphics.drawable.Drawable.resolveOpacity(r2, r5)
                int r4 = r4 + 1
                goto L1b
            L2a:
                r6.s = r2
                r6.r = r3
                return r2
        }

        void k() {
                r1 = this;
                r0 = 0
                r1.r = r0
                r1.t = r0
                return
        }

        public final boolean l() {
                r0 = this;
                boolean r0 = r0.l
                return r0
        }

        abstract void m();
    }

    b() {
            r1 = this;
            r1.<init>()
            r0 = 255(0xff, float:3.57E-43)
            r1.f = r0
            r0 = -1
            r1.h = r0
            return
    }

    static int a(android.content.res.Resources r0, int r1) {
            if (r0 != 0) goto L3
            goto L9
        L3:
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r1 = r0.densityDpi
        L9:
            if (r1 != 0) goto Ld
            r1 = 160(0xa0, float:2.24E-43)
        Ld:
            return r1
    }

    private void a(android.graphics.drawable.Drawable r5) {
            r4 = this;
            b.b.d.c.a.b$b r0 = r4.m
            if (r0 != 0) goto Lb
            b.b.d.c.a.b$b r0 = new b.b.d.c.a.b$b
            r0.<init>()
            r4.m = r0
        Lb:
            b.b.d.c.a.b$b r0 = r4.m
            android.graphics.drawable.Drawable$Callback r1 = r5.getCallback()
            r0.a(r1)
            r5.setCallback(r0)
            b.b.d.c.a.b$c r0 = r4.f1150b     // Catch: java.lang.Throwable -> Lab
            int r0 = r0.A     // Catch: java.lang.Throwable -> Lab
            if (r0 > 0) goto L26
            boolean r0 = r4.g     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto L26
            int r0 = r4.f     // Catch: java.lang.Throwable -> Lab
            r5.setAlpha(r0)     // Catch: java.lang.Throwable -> Lab
        L26:
            b.b.d.c.a.b$c r0 = r4.f1150b     // Catch: java.lang.Throwable -> Lab
            boolean r0 = r0.E     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto L34
            b.b.d.c.a.b$c r0 = r4.f1150b     // Catch: java.lang.Throwable -> Lab
            android.graphics.ColorFilter r0 = r0.D     // Catch: java.lang.Throwable -> Lab
            r5.setColorFilter(r0)     // Catch: java.lang.Throwable -> Lab
            goto L4e
        L34:
            b.b.d.c.a.b$c r0 = r4.f1150b     // Catch: java.lang.Throwable -> Lab
            boolean r0 = r0.H     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto L41
            b.b.d.c.a.b$c r0 = r4.f1150b     // Catch: java.lang.Throwable -> Lab
            android.content.res.ColorStateList r0 = r0.F     // Catch: java.lang.Throwable -> Lab
            android.support.v4.graphics.drawable.a.a(r5, r0)     // Catch: java.lang.Throwable -> Lab
        L41:
            b.b.d.c.a.b$c r0 = r4.f1150b     // Catch: java.lang.Throwable -> Lab
            boolean r0 = r0.I     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto L4e
            b.b.d.c.a.b$c r0 = r4.f1150b     // Catch: java.lang.Throwable -> Lab
            android.graphics.PorterDuff$Mode r0 = r0.G     // Catch: java.lang.Throwable -> Lab
            android.support.v4.graphics.drawable.a.a(r5, r0)     // Catch: java.lang.Throwable -> Lab
        L4e:
            boolean r0 = r4.isVisible()     // Catch: java.lang.Throwable -> Lab
            r1 = 1
            r5.setVisible(r0, r1)     // Catch: java.lang.Throwable -> Lab
            b.b.d.c.a.b$c r0 = r4.f1150b     // Catch: java.lang.Throwable -> Lab
            boolean r0 = r0.x     // Catch: java.lang.Throwable -> Lab
            r5.setDither(r0)     // Catch: java.lang.Throwable -> Lab
            int[] r0 = r4.getState()     // Catch: java.lang.Throwable -> Lab
            r5.setState(r0)     // Catch: java.lang.Throwable -> Lab
            int r0 = r4.getLevel()     // Catch: java.lang.Throwable -> Lab
            r5.setLevel(r0)     // Catch: java.lang.Throwable -> Lab
            android.graphics.Rect r0 = r4.getBounds()     // Catch: java.lang.Throwable -> Lab
            r5.setBounds(r0)     // Catch: java.lang.Throwable -> Lab
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lab
            r1 = 23
            if (r0 < r1) goto L7f
            int r0 = r4.getLayoutDirection()     // Catch: java.lang.Throwable -> Lab
            r5.setLayoutDirection(r0)     // Catch: java.lang.Throwable -> Lab
        L7f:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lab
            r1 = 19
            if (r0 < r1) goto L8c
            b.b.d.c.a.b$c r0 = r4.f1150b     // Catch: java.lang.Throwable -> Lab
            boolean r0 = r0.C     // Catch: java.lang.Throwable -> Lab
            r5.setAutoMirrored(r0)     // Catch: java.lang.Throwable -> Lab
        L8c:
            android.graphics.Rect r0 = r4.f1151c     // Catch: java.lang.Throwable -> Lab
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lab
            r2 = 21
            if (r1 < r2) goto La1
            if (r0 == 0) goto La1
            int r1 = r0.left     // Catch: java.lang.Throwable -> Lab
            int r2 = r0.top     // Catch: java.lang.Throwable -> Lab
            int r3 = r0.right     // Catch: java.lang.Throwable -> Lab
            int r0 = r0.bottom     // Catch: java.lang.Throwable -> Lab
            r5.setHotspotBounds(r1, r2, r3, r0)     // Catch: java.lang.Throwable -> Lab
        La1:
            b.b.d.c.a.b$b r4 = r4.m
            android.graphics.drawable.Drawable$Callback r4 = r4.a()
            r5.setCallback(r4)
            return
        Lab:
            r0 = move-exception
            b.b.d.c.a.b$b r4 = r4.m
            android.graphics.drawable.Drawable$Callback r4 = r4.a()
            r5.setCallback(r4)
            throw r0
    }

    @android.annotation.SuppressLint({"WrongConstant"})
    @android.annotation.TargetApi(23)
    private boolean c() {
            r2 = this;
            boolean r0 = r2.isAutoMirrored()
            r1 = 1
            if (r0 == 0) goto Le
            int r2 = r2.getLayoutDirection()
            if (r2 != r1) goto Le
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    b.b.d.c.a.b.c a() {
            r0 = this;
            r0 = 0
            throw r0
    }

    final void a(android.content.res.Resources r1) {
            r0 = this;
            b.b.d.c.a.b$c r0 = r0.f1150b
            r0.a(r1)
            return
    }

    protected void a(b.b.d.c.a.b.c r2) {
            r1 = this;
            r1.f1150b = r2
            int r0 = r1.h
            if (r0 < 0) goto L11
            android.graphics.drawable.Drawable r2 = r2.a(r0)
            r1.d = r2
            if (r2 == 0) goto L11
            r1.a(r2)
        L11:
            r2 = 0
            r1.e = r2
            return
    }

    void a(boolean r14) {
            r13 = this;
            r0 = 1
            r13.g = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.d
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L34
            long r9 = r13.k
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L36
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L20
            int r9 = r13.f
            r3.setAlpha(r9)
            goto L34
        L20:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            b.b.d.c.a.b$c r10 = r13.f1150b
            int r10 = r10.A
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L37
        L34:
            r13.k = r7
        L36:
            r3 = r6
        L37:
            android.graphics.drawable.Drawable r9 = r13.e
            if (r9 == 0) goto L5d
            long r10 = r13.l
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L5f
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L4c
            r9.setVisible(r6, r6)
            r0 = 0
            r13.e = r0
            goto L5d
        L4c:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            b.b.d.c.a.b$c r4 = r13.f1150b
            int r4 = r4.B
            int r3 = r3 / r4
            int r4 = r13.f
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L60
        L5d:
            r13.l = r7
        L5f:
            r0 = r3
        L60:
            if (r14 == 0) goto L6c
            if (r0 == 0) goto L6c
            java.lang.Runnable r14 = r13.j
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L6c:
            return
    }

    boolean a(int r10) {
            r9 = this;
            int r0 = r9.h
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            b.b.d.c.a.b$c r0 = r9.f1150b
            int r0 = r0.B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.e
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.d
            if (r0 == 0) goto L29
            r9.e = r0
            b.b.d.c.a.b$c r0 = r9.f1150b
            int r0 = r0.B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.l = r0
            goto L35
        L29:
            r9.e = r4
            r9.l = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.d
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            b.b.d.c.a.b$c r0 = r9.f1150b
            int r1 = r0.h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.a(r10)
            r9.d = r0
            r9.h = r10
            if (r0 == 0) goto L5a
            b.b.d.c.a.b$c r10 = r9.f1150b
            int r10 = r10.A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.k = r2
        L51:
            r9.a(r0)
            goto L5a
        L55:
            r9.d = r4
            r10 = -1
            r9.h = r10
        L5a:
            long r0 = r9.k
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.l
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L79
        L67:
            java.lang.Runnable r10 = r9.j
            if (r10 != 0) goto L73
            b.b.d.c.a.b$a r10 = new b.b.d.c.a.b$a
            r10.<init>(r9)
            r9.j = r10
            goto L76
        L73:
            r9.unscheduleSelf(r10)
        L76:
            r9.a(r0)
        L79:
            r9.invalidateSelf()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(android.content.res.Resources.Theme r1) {
            r0 = this;
            b.b.d.c.a.b$c r0 = r0.f1150b
            r0.a(r1)
            return
    }

    int b() {
            r0 = this;
            int r0 = r0.h
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
            r0 = this;
            b.b.d.c.a.b$c r0 = r0.f1150b
            boolean r0 = r0.canApplyTheme()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.d
            if (r0 == 0) goto L7
            r0.draw(r2)
        L7:
            android.graphics.drawable.Drawable r1 = r1.e
            if (r1 == 0) goto Le
            r1.draw(r2)
        Le:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
            r0 = this;
            int r0 = r0.f
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
            r1 = this;
            int r0 = super.getChangingConfigurations()
            b.b.d.c.a.b$c r1 = r1.f1150b
            int r1 = r1.getChangingConfigurations()
            r1 = r1 | r0
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable.ConstantState getConstantState() {
            r2 = this;
            b.b.d.c.a.b$c r0 = r2.f1150b
            boolean r0 = r0.a()
            if (r0 == 0) goto L13
            b.b.d.c.a.b$c r0 = r2.f1150b
            int r1 = r2.getChangingConfigurations()
            r0.d = r1
            b.b.d.c.a.b$c r2 = r2.f1150b
            return r2
        L13:
            r2 = 0
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable getCurrent() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.d
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.Rect r0 = r1.f1151c
            if (r0 == 0) goto L8
            r2.set(r0)
            goto Lb
        L8:
            super.getHotspotBounds(r2)
        Lb:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            b.b.d.c.a.b$c r0 = r1.f1150b
            boolean r0 = r0.l()
            if (r0 == 0) goto Lf
            b.b.d.c.a.b$c r1 = r1.f1150b
            int r1 = r1.e()
            return r1
        Lf:
            android.graphics.drawable.Drawable r1 = r1.d
            if (r1 == 0) goto L18
            int r1 = r1.getIntrinsicHeight()
            goto L19
        L18:
            r1 = -1
        L19:
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            b.b.d.c.a.b$c r0 = r1.f1150b
            boolean r0 = r0.l()
            if (r0 == 0) goto Lf
            b.b.d.c.a.b$c r1 = r1.f1150b
            int r1 = r1.i()
            return r1
        Lf:
            android.graphics.drawable.Drawable r1 = r1.d
            if (r1 == 0) goto L18
            int r1 = r1.getIntrinsicWidth()
            goto L19
        L18:
            r1 = -1
        L19:
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
            r1 = this;
            b.b.d.c.a.b$c r0 = r1.f1150b
            boolean r0 = r0.l()
            if (r0 == 0) goto Lf
            b.b.d.c.a.b$c r1 = r1.f1150b
            int r1 = r1.f()
            return r1
        Lf:
            android.graphics.drawable.Drawable r1 = r1.d
            if (r1 == 0) goto L18
            int r1 = r1.getMinimumHeight()
            goto L19
        L18:
            r1 = 0
        L19:
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
            r1 = this;
            b.b.d.c.a.b$c r0 = r1.f1150b
            boolean r0 = r0.l()
            if (r0 == 0) goto Lf
            b.b.d.c.a.b$c r1 = r1.f1150b
            int r1 = r1.g()
            return r1
        Lf:
            android.graphics.drawable.Drawable r1 = r1.d
            if (r1 == 0) goto L18
            int r1 = r1.getMinimumWidth()
            goto L19
        L18:
            r1 = 0
        L19:
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.d
            if (r0 == 0) goto L12
            boolean r0 = r0.isVisible()
            if (r0 != 0) goto Lb
            goto L12
        Lb:
            b.b.d.c.a.b$c r1 = r1.f1150b
            int r1 = r1.j()
            goto L13
        L12:
            r1 = -2
        L13:
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.d
            if (r0 == 0) goto L7
            r0.getOutline(r1)
        L7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(android.graphics.Rect r4) {
            r3 = this;
            b.b.d.c.a.b$c r0 = r3.f1150b
            android.graphics.Rect r0 = r0.h()
            if (r0 == 0) goto L1c
            r4.set(r0)
            int r1 = r0.left
            int r2 = r0.top
            r1 = r1 | r2
            int r2 = r0.bottom
            r1 = r1 | r2
            int r0 = r0.right
            r0 = r0 | r1
            if (r0 == 0) goto L1a
            r0 = 1
            goto L29
        L1a:
            r0 = 0
            goto L29
        L1c:
            android.graphics.drawable.Drawable r0 = r3.d
            if (r0 == 0) goto L25
            boolean r0 = r0.getPadding(r4)
            goto L29
        L25:
            boolean r0 = super.getPadding(r4)
        L29:
            boolean r3 = r3.c()
            if (r3 == 0) goto L37
            int r3 = r4.left
            int r1 = r4.right
            r4.left = r1
            r4.right = r3
        L37:
            return r0
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            b.b.d.c.a.b$c r0 = r1.f1150b
            if (r0 == 0) goto L7
            r0.k()
        L7:
            android.graphics.drawable.Drawable r0 = r1.d
            if (r2 != r0) goto L18
            android.graphics.drawable.Drawable$Callback r2 = r1.getCallback()
            if (r2 == 0) goto L18
            android.graphics.drawable.Drawable$Callback r2 = r1.getCallback()
            r2.invalidateDrawable(r1)
        L18:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
            r0 = this;
            b.b.d.c.a.b$c r0 = r0.f1150b
            boolean r0 = r0.C
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
            r6 = this;
            android.graphics.drawable.Drawable r0 = r6.e
            r1 = 1
            if (r0 == 0) goto Ld
            r0.jumpToCurrentState()
            r0 = 0
            r6.e = r0
            r0 = r1
            goto Le
        Ld:
            r0 = 0
        Le:
            android.graphics.drawable.Drawable r2 = r6.d
            if (r2 == 0) goto L20
            r2.jumpToCurrentState()
            boolean r2 = r6.g
            if (r2 == 0) goto L20
            android.graphics.drawable.Drawable r2 = r6.d
            int r3 = r6.f
            r2.setAlpha(r3)
        L20:
            long r2 = r6.l
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L2b
            r6.l = r4
            r0 = r1
        L2b:
            long r2 = r6.k
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L34
            r6.k = r4
            goto L35
        L34:
            r1 = r0
        L35:
            if (r1 == 0) goto L3a
            r6.invalidateSelf()
        L3a:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
            r1 = this;
            boolean r0 = r1.i
            if (r0 != 0) goto L17
            android.graphics.drawable.Drawable r0 = super.mutate()
            if (r0 != r1) goto L17
            b.b.d.c.a.b$c r0 = r1.a()
            r0.m()
            r1.a(r0)
            r0 = 1
            r1.i = r0
        L17:
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.e
            if (r0 == 0) goto L7
            r0.setBounds(r2)
        L7:
            android.graphics.drawable.Drawable r1 = r1.d
            if (r1 == 0) goto Le
            r1.setBounds(r2)
        Le:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int r2) {
            r1 = this;
            b.b.d.c.a.b$c r0 = r1.f1150b
            int r1 = r1.b()
            boolean r1 = r0.b(r2, r1)
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.e
            if (r0 == 0) goto L9
            boolean r1 = r0.setLevel(r2)
            return r1
        L9:
            android.graphics.drawable.Drawable r1 = r1.d
            if (r1 == 0) goto L12
            boolean r1 = r1.setLevel(r2)
            return r1
        L12:
            r1 = 0
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.e
            if (r0 == 0) goto L9
            boolean r1 = r0.setState(r2)
            return r1
        L9:
            android.graphics.drawable.Drawable r1 = r1.d
            if (r1 == 0) goto L12
            boolean r1 = r1.setState(r2)
            return r1
        L12:
            r1 = 0
            return r1
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(android.graphics.drawable.Drawable r2, java.lang.Runnable r3, long r4) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.d
            if (r2 != r0) goto L11
            android.graphics.drawable.Drawable$Callback r2 = r1.getCallback()
            if (r2 == 0) goto L11
            android.graphics.drawable.Drawable$Callback r2 = r1.getCallback()
            r2.scheduleDrawable(r1, r3, r4)
        L11:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r6) {
            r5 = this;
            boolean r0 = r5.g
            if (r0 == 0) goto L8
            int r0 = r5.f
            if (r0 == r6) goto L21
        L8:
            r0 = 1
            r5.g = r0
            r5.f = r6
            android.graphics.drawable.Drawable r0 = r5.d
            if (r0 == 0) goto L21
            long r1 = r5.k
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L1d
            r0.setAlpha(r6)
            goto L21
        L1d:
            r6 = 0
            r5.a(r6)
        L21:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean r3) {
            r2 = this;
            b.b.d.c.a.b$c r0 = r2.f1150b
            boolean r1 = r0.C
            if (r1 == r3) goto Lf
            r0.C = r3
            android.graphics.drawable.Drawable r2 = r2.d
            if (r2 == 0) goto Lf
            android.support.v4.graphics.drawable.a.a(r2, r3)
        Lf:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r3) {
            r2 = this;
            b.b.d.c.a.b$c r0 = r2.f1150b
            r1 = 1
            r0.E = r1
            android.graphics.ColorFilter r1 = r0.D
            if (r1 == r3) goto L12
            r0.D = r3
            android.graphics.drawable.Drawable r2 = r2.d
            if (r2 == 0) goto L12
            r2.setColorFilter(r3)
        L12:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean r3) {
            r2 = this;
            b.b.d.c.a.b$c r0 = r2.f1150b
            boolean r1 = r0.x
            if (r1 == r3) goto Lf
            r0.x = r3
            android.graphics.drawable.Drawable r2 = r2.d
            if (r2 == 0) goto Lf
            r2.setDither(r3)
        Lf:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float r1, float r2) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.d
            if (r0 == 0) goto L7
            android.support.v4.graphics.drawable.a.a(r0, r1, r2)
        L7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.graphics.Rect r0 = r1.f1151c
            if (r0 != 0) goto Lc
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r2, r3, r4, r5)
            r1.f1151c = r0
            goto Lf
        Lc:
            r0.set(r2, r3, r4, r5)
        Lf:
            android.graphics.drawable.Drawable r1 = r1.d
            if (r1 == 0) goto L16
            android.support.v4.graphics.drawable.a.a(r1, r2, r3, r4, r5)
        L16:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(android.content.res.ColorStateList r3) {
            r2 = this;
            b.b.d.c.a.b$c r0 = r2.f1150b
            r1 = 1
            r0.H = r1
            android.content.res.ColorStateList r1 = r0.F
            if (r1 == r3) goto L10
            r0.F = r3
            android.graphics.drawable.Drawable r2 = r2.d
            android.support.v4.graphics.drawable.a.a(r2, r3)
        L10:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(android.graphics.PorterDuff.Mode r3) {
            r2 = this;
            b.b.d.c.a.b$c r0 = r2.f1150b
            r1 = 1
            r0.I = r1
            android.graphics.PorterDuff$Mode r1 = r0.G
            if (r1 == r3) goto L10
            r0.G = r3
            android.graphics.drawable.Drawable r2 = r2.d
            android.support.v4.graphics.drawable.a.a(r2, r3)
        L10:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean r3, boolean r4) {
            r2 = this;
            boolean r0 = super.setVisible(r3, r4)
            android.graphics.drawable.Drawable r1 = r2.e
            if (r1 == 0) goto Lb
            r1.setVisible(r3, r4)
        Lb:
            android.graphics.drawable.Drawable r2 = r2.d
            if (r2 == 0) goto L12
            r2.setVisible(r3, r4)
        L12:
            return r0
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(android.graphics.drawable.Drawable r2, java.lang.Runnable r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.d
            if (r2 != r0) goto L11
            android.graphics.drawable.Drawable$Callback r2 = r1.getCallback()
            if (r2 == 0) goto L11
            android.graphics.drawable.Drawable$Callback r2 = r1.getCallback()
            r2.unscheduleDrawable(r1, r3)
        L11:
            return
    }
}
