package android.support.v4.app;

/* JADX INFO: loaded from: classes.dex */
public class e implements android.content.ComponentCallbacks, android.view.View.OnCreateContextMenuListener, android.arch.lifecycle.e, android.arch.lifecycle.q {
    private static final b.b.c.f.k<java.lang.String, java.lang.Class<?>> X = null;
    static final java.lang.Object Y = null;
    java.lang.String A;
    boolean B;
    boolean C;
    boolean D;
    boolean E;
    boolean F;
    boolean G;
    boolean H;
    android.view.ViewGroup I;
    android.view.View J;
    android.view.View K;
    boolean L;
    boolean M;
    android.support.v4.app.e.d N;
    boolean O;
    boolean P;
    float Q;
    android.view.LayoutInflater R;
    boolean S;
    android.arch.lifecycle.f T;
    android.arch.lifecycle.f U;
    android.arch.lifecycle.e V;
    android.arch.lifecycle.j<android.arch.lifecycle.e> W;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    android.os.Bundle f545c;
    android.util.SparseArray<android.os.Parcelable> d;
    java.lang.Boolean e;
    int f;
    java.lang.String g;
    android.os.Bundle h;
    android.support.v4.app.e i;
    int j;
    int k;
    boolean l;
    boolean m;
    boolean n;
    boolean o;
    boolean p;
    boolean q;
    int r;
    android.support.v4.app.k s;
    android.support.v4.app.i t;
    android.support.v4.app.k u;
    android.support.v4.app.l v;
    android.arch.lifecycle.p w;
    android.support.v4.app.e x;
    int y;
    int z;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.support.v4.app.e f546b;

        a(android.support.v4.app.e r1) {
                r0 = this;
                r0.f546b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r0 = this;
                android.support.v4.app.e r0 = r0.f546b
                r0.c()
                return
        }
    }

    class b extends android.support.v4.app.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.support.v4.app.e f547a;

        b(android.support.v4.app.e r1) {
                r0 = this;
                r0.f547a = r1
                r0.<init>()
                return
        }

        @Override // android.support.v4.app.g
        public android.support.v4.app.e a(android.content.Context r1, java.lang.String r2, android.os.Bundle r3) {
                r0 = this;
                android.support.v4.app.e r0 = r0.f547a
                android.support.v4.app.i r0 = r0.t
                android.support.v4.app.e r0 = r0.a(r1, r2, r3)
                return r0
        }

        @Override // android.support.v4.app.g
        public android.view.View a(int r1) {
                r0 = this;
                android.support.v4.app.e r0 = r0.f547a
                android.view.View r0 = r0.J
                if (r0 == 0) goto Lb
                android.view.View r0 = r0.findViewById(r1)
                return r0
            Lb:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Fragment does not have a view"
                r0.<init>(r1)
                throw r0
        }

        @Override // android.support.v4.app.g
        public boolean a() {
                r0 = this;
                android.support.v4.app.e r0 = r0.f547a
                android.view.View r0 = r0.J
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }
    }

    class c implements android.arch.lifecycle.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.support.v4.app.e f548b;

        c(android.support.v4.app.e r1) {
                r0 = this;
                r0.f548b = r1
                r0.<init>()
                return
        }

        @Override // android.arch.lifecycle.e
        public android.arch.lifecycle.c a() {
                r3 = this;
                android.support.v4.app.e r0 = r3.f548b
                android.arch.lifecycle.f r1 = r0.U
                if (r1 != 0) goto Lf
                android.arch.lifecycle.f r1 = new android.arch.lifecycle.f
                android.arch.lifecycle.e r2 = r0.V
                r1.<init>(r2)
                r0.U = r1
            Lf:
                android.support.v4.app.e r3 = r3.f548b
                android.arch.lifecycle.f r3 = r3.U
                return r3
        }
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        android.view.View f549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        android.animation.Animator f550b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f551c;
        int d;
        int e;
        int f;
        java.lang.Object g;
        java.lang.Object h;
        java.lang.Object i;
        java.lang.Object j;
        java.lang.Object k;
        java.lang.Object l;
        java.lang.Boolean m;
        java.lang.Boolean n;
        android.support.v4.app.v o;
        android.support.v4.app.v p;
        boolean q;
        android.support.v4.app.e.f r;
        boolean s;

        d() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.g = r0
                java.lang.Object r1 = android.support.v4.app.e.Y
                r2.h = r1
                r2.i = r0
                r2.j = r1
                r2.k = r0
                r2.l = r1
                r2.o = r0
                r2.p = r0
                return
        }
    }

    /* JADX INFO: renamed from: android.support.v4.app.e$e, reason: collision with other inner class name */
    public static class C0027e extends java.lang.RuntimeException {
        public C0027e(java.lang.String r1, java.lang.Exception r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    interface f {
        void a();

        void b();
    }

    static {
            b.b.c.f.k r0 = new b.b.c.f.k
            r0.<init>()
            android.support.v4.app.e.X = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            android.support.v4.app.e.Y = r0
            return
    }

    public e() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f544b = r0
            r0 = -1
            r1.f = r0
            r1.j = r0
            r0 = 1
            r1.G = r0
            r1.M = r0
            android.arch.lifecycle.f r0 = new android.arch.lifecycle.f
            r0.<init>(r1)
            r1.T = r0
            android.arch.lifecycle.j r0 = new android.arch.lifecycle.j
            r0.<init>()
            r1.W = r0
            return
    }

    private android.support.v4.app.e.d Z() {
            r1 = this;
            android.support.v4.app.e$d r0 = r1.N
            if (r0 != 0) goto Lb
            android.support.v4.app.e$d r0 = new android.support.v4.app.e$d
            r0.<init>()
            r1.N = r0
        Lb:
            android.support.v4.app.e$d r1 = r1.N
            return r1
    }

    public static android.support.v4.app.e a(android.content.Context r5, java.lang.String r6, android.os.Bundle r7) {
            java.lang.String r0 = " empty constructor that is public"
            java.lang.String r1 = ": make sure class name exists, is public, and has an"
            java.lang.String r2 = "Unable to instantiate fragment "
            b.b.c.f.k<java.lang.String, java.lang.Class<?>> r3 = android.support.v4.app.e.X     // Catch: java.lang.reflect.InvocationTargetException -> L3d java.lang.NoSuchMethodException -> L58 java.lang.IllegalAccessException -> L73 java.lang.InstantiationException -> L8f java.lang.ClassNotFoundException -> Lab
            java.lang.Object r3 = r3.get(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L3d java.lang.NoSuchMethodException -> L58 java.lang.IllegalAccessException -> L73 java.lang.InstantiationException -> L8f java.lang.ClassNotFoundException -> Lab
            java.lang.Class r3 = (java.lang.Class) r3     // Catch: java.lang.reflect.InvocationTargetException -> L3d java.lang.NoSuchMethodException -> L58 java.lang.IllegalAccessException -> L73 java.lang.InstantiationException -> L8f java.lang.ClassNotFoundException -> Lab
            if (r3 != 0) goto L1d
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch: java.lang.reflect.InvocationTargetException -> L3d java.lang.NoSuchMethodException -> L58 java.lang.IllegalAccessException -> L73 java.lang.InstantiationException -> L8f java.lang.ClassNotFoundException -> Lab
            java.lang.Class r3 = r5.loadClass(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L3d java.lang.NoSuchMethodException -> L58 java.lang.IllegalAccessException -> L73 java.lang.InstantiationException -> L8f java.lang.ClassNotFoundException -> Lab
            b.b.c.f.k<java.lang.String, java.lang.Class<?>> r5 = android.support.v4.app.e.X     // Catch: java.lang.reflect.InvocationTargetException -> L3d java.lang.NoSuchMethodException -> L58 java.lang.IllegalAccessException -> L73 java.lang.InstantiationException -> L8f java.lang.ClassNotFoundException -> Lab
            r5.put(r6, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L3d java.lang.NoSuchMethodException -> L58 java.lang.IllegalAccessException -> L73 java.lang.InstantiationException -> L8f java.lang.ClassNotFoundException -> Lab
        L1d:
            r5 = 0
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch: java.lang.reflect.InvocationTargetException -> L3d java.lang.NoSuchMethodException -> L58 java.lang.IllegalAccessException -> L73 java.lang.InstantiationException -> L8f java.lang.ClassNotFoundException -> Lab
            java.lang.reflect.Constructor r3 = r3.getConstructor(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L3d java.lang.NoSuchMethodException -> L58 java.lang.IllegalAccessException -> L73 java.lang.InstantiationException -> L8f java.lang.ClassNotFoundException -> Lab
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.reflect.InvocationTargetException -> L3d java.lang.NoSuchMethodException -> L58 java.lang.IllegalAccessException -> L73 java.lang.InstantiationException -> L8f java.lang.ClassNotFoundException -> Lab
            java.lang.Object r5 = r3.newInstance(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L3d java.lang.NoSuchMethodException -> L58 java.lang.IllegalAccessException -> L73 java.lang.InstantiationException -> L8f java.lang.ClassNotFoundException -> Lab
            android.support.v4.app.e r5 = (android.support.v4.app.e) r5     // Catch: java.lang.reflect.InvocationTargetException -> L3d java.lang.NoSuchMethodException -> L58 java.lang.IllegalAccessException -> L73 java.lang.InstantiationException -> L8f java.lang.ClassNotFoundException -> Lab
            if (r7 == 0) goto L3c
            java.lang.Class r3 = r5.getClass()     // Catch: java.lang.reflect.InvocationTargetException -> L3d java.lang.NoSuchMethodException -> L58 java.lang.IllegalAccessException -> L73 java.lang.InstantiationException -> L8f java.lang.ClassNotFoundException -> Lab
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.reflect.InvocationTargetException -> L3d java.lang.NoSuchMethodException -> L58 java.lang.IllegalAccessException -> L73 java.lang.InstantiationException -> L8f java.lang.ClassNotFoundException -> Lab
            r7.setClassLoader(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L3d java.lang.NoSuchMethodException -> L58 java.lang.IllegalAccessException -> L73 java.lang.InstantiationException -> L8f java.lang.ClassNotFoundException -> Lab
            r5.m(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L3d java.lang.NoSuchMethodException -> L58 java.lang.IllegalAccessException -> L73 java.lang.InstantiationException -> L8f java.lang.ClassNotFoundException -> Lab
        L3c:
            return r5
        L3d:
            r5 = move-exception
            android.support.v4.app.e$e r7 = new android.support.v4.app.e$e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r6)
            java.lang.String r6 = ": calling Fragment constructor caused an exception"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6, r5)
            throw r7
        L58:
            r5 = move-exception
            android.support.v4.app.e$e r7 = new android.support.v4.app.e$e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r6)
            java.lang.String r6 = ": could not find Fragment constructor"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6, r5)
            throw r7
        L73:
            r5 = move-exception
            android.support.v4.app.e$e r7 = new android.support.v4.app.e$e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r6)
            r3.append(r1)
            r3.append(r0)
            java.lang.String r6 = r3.toString()
            r7.<init>(r6, r5)
            throw r7
        L8f:
            r5 = move-exception
            android.support.v4.app.e$e r7 = new android.support.v4.app.e$e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r6)
            r3.append(r1)
            r3.append(r0)
            java.lang.String r6 = r3.toString()
            r7.<init>(r6, r5)
            throw r7
        Lab:
            r5 = move-exception
            android.support.v4.app.e$e r7 = new android.support.v4.app.e$e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r6)
            r3.append(r1)
            r3.append(r0)
            java.lang.String r6 = r3.toString()
            r7.<init>(r6, r5)
            throw r7
    }

    static boolean a(android.content.Context r1, java.lang.String r2) {
            b.b.c.f.k<java.lang.String, java.lang.Class<?>> r0 = android.support.v4.app.e.X     // Catch: java.lang.ClassNotFoundException -> L1e
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.ClassNotFoundException -> L1e
            java.lang.Class r0 = (java.lang.Class) r0     // Catch: java.lang.ClassNotFoundException -> L1e
            if (r0 != 0) goto L17
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L1e
            java.lang.Class r0 = r1.loadClass(r2)     // Catch: java.lang.ClassNotFoundException -> L1e
            b.b.c.f.k<java.lang.String, java.lang.Class<?>> r1 = android.support.v4.app.e.X     // Catch: java.lang.ClassNotFoundException -> L1e
            r1.put(r2, r0)     // Catch: java.lang.ClassNotFoundException -> L1e
        L17:
            java.lang.Class<android.support.v4.app.e> r1 = android.support.v4.app.e.class
            boolean r1 = r1.isAssignableFrom(r0)     // Catch: java.lang.ClassNotFoundException -> L1e
            return r1
        L1e:
            r1 = 0
            return r1
    }

    void A() {
            r3 = this;
            android.support.v4.app.i r0 = r3.t
            if (r0 == 0) goto L16
            android.support.v4.app.k r0 = new android.support.v4.app.k
            r0.<init>()
            r3.u = r0
            android.support.v4.app.i r1 = r3.t
            android.support.v4.app.e$b r2 = new android.support.v4.app.e$b
            r2.<init>(r3)
            r0.a(r1, r2, r3)
            return
        L16:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Fragment has not been attached yet."
            r3.<init>(r0)
            throw r3
    }

    boolean B() {
            r0 = this;
            android.support.v4.app.e$d r0 = r0.N
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            boolean r0 = r0.s
            return r0
    }

    final boolean C() {
            r0 = this;
            int r0 = r0.r
            if (r0 <= 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    boolean D() {
            r0 = this;
            android.support.v4.app.e$d r0 = r0.N
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            boolean r0 = r0.q
            return r0
    }

    public final boolean E() {
            r0 = this;
            android.support.v4.app.k r0 = r0.s
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            boolean r0 = r0.b()
            return r0
    }

    void F() {
            r0 = this;
            android.support.v4.app.k r0 = r0.u
            if (r0 == 0) goto L7
            r0.q()
        L7:
            return
    }

    public void G() {
            r2 = this;
            r0 = 1
            r2.H = r0
            android.support.v4.app.f r1 = r2.d()
            if (r1 == 0) goto L10
            boolean r1 = r1.isChangingConfigurations()
            if (r1 == 0) goto L10
            goto L11
        L10:
            r0 = 0
        L11:
            android.arch.lifecycle.p r2 = r2.w
            if (r2 == 0) goto L1a
            if (r0 != 0) goto L1a
            r2.a()
        L1a:
            return
    }

    public void H() {
            r0 = this;
            return
    }

    public void I() {
            r1 = this;
            r0 = 1
            r1.H = r0
            return
    }

    public void J() {
            r1 = this;
            r0 = 1
            r1.H = r0
            return
    }

    public void K() {
            r1 = this;
            r0 = 1
            r1.H = r0
            return
    }

    public void L() {
            r1 = this;
            r0 = 1
            r1.H = r0
            return
    }

    public void M() {
            r1 = this;
            r0 = 1
            r1.H = r0
            return
    }

    public void N() {
            r1 = this;
            r0 = 1
            r1.H = r0
            return
    }

    android.support.v4.app.j O() {
            r0 = this;
            android.support.v4.app.k r0 = r0.u
            return r0
    }

    void P() {
            r3 = this;
            android.arch.lifecycle.f r0 = r3.T
            android.arch.lifecycle.c$a r1 = android.arch.lifecycle.c.a.ON_DESTROY
            r0.a(r1)
            android.support.v4.app.k r0 = r3.u
            if (r0 == 0) goto Le
            r0.f()
        Le:
            r0 = 0
            r3.f544b = r0
            r3.H = r0
            r3.S = r0
            r3.G()
            boolean r0 = r3.H
            if (r0 == 0) goto L20
            r0 = 0
            r3.u = r0
            return
        L20:
            android.support.v4.app.w r0 = new android.support.v4.app.w
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " did not call through to super.onDestroy()"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    void Q() {
            r3 = this;
            android.view.View r0 = r3.J
            if (r0 == 0) goto Lb
            android.arch.lifecycle.f r0 = r3.U
            android.arch.lifecycle.c$a r1 = android.arch.lifecycle.c.a.ON_DESTROY
            r0.a(r1)
        Lb:
            android.support.v4.app.k r0 = r3.u
            if (r0 == 0) goto L12
            r0.g()
        L12:
            r0 = 1
            r3.f544b = r0
            r0 = 0
            r3.H = r0
            r3.I()
            boolean r1 = r3.H
            if (r1 == 0) goto L29
            android.support.v4.app.s r1 = android.support.v4.app.s.a(r3)
            r1.a()
            r3.q = r0
            return
        L29:
            android.support.v4.app.w r0 = new android.support.v4.app.w
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " did not call through to super.onDestroyView()"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    void R() {
            r3 = this;
            r0 = 0
            r3.H = r0
            r3.J()
            r0 = 0
            r3.R = r0
            boolean r1 = r3.H
            if (r1 == 0) goto L3d
            android.support.v4.app.k r1 = r3.u
            if (r1 == 0) goto L3c
            boolean r2 = r3.E
            if (r2 == 0) goto L1b
            r1.f()
            r3.u = r0
            goto L3c
        L1b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Child FragmentManager of "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " was not "
            r1.append(r3)
            java.lang.String r3 = " destroyed and this fragment is not retaining instance"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L3c:
            return
        L3d:
            android.support.v4.app.w r0 = new android.support.v4.app.w
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " did not call through to super.onDetach()"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    void S() {
            r0 = this;
            r0.onLowMemory()
            android.support.v4.app.k r0 = r0.u
            if (r0 == 0) goto La
            r0.h()
        La:
            return
    }

    void T() {
            r3 = this;
            android.view.View r0 = r3.J
            if (r0 == 0) goto Lb
            android.arch.lifecycle.f r0 = r3.U
            android.arch.lifecycle.c$a r1 = android.arch.lifecycle.c.a.ON_PAUSE
            r0.a(r1)
        Lb:
            android.arch.lifecycle.f r0 = r3.T
            android.arch.lifecycle.c$a r1 = android.arch.lifecycle.c.a.ON_PAUSE
            r0.a(r1)
            android.support.v4.app.k r0 = r3.u
            if (r0 == 0) goto L19
            r0.i()
        L19:
            r0 = 3
            r3.f544b = r0
            r0 = 0
            r3.H = r0
            r3.K()
            boolean r0 = r3.H
            if (r0 == 0) goto L27
            return
        L27:
            android.support.v4.app.w r0 = new android.support.v4.app.w
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " did not call through to super.onPause()"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    void U() {
            r3 = this;
            android.support.v4.app.k r0 = r3.u
            if (r0 == 0) goto Lc
            r0.q()
            android.support.v4.app.k r0 = r3.u
            r0.n()
        Lc:
            r0 = 4
            r3.f544b = r0
            r0 = 0
            r3.H = r0
            r3.L()
            boolean r0 = r3.H
            if (r0 == 0) goto L38
            android.support.v4.app.k r0 = r3.u
            if (r0 == 0) goto L25
            r0.j()
            android.support.v4.app.k r0 = r3.u
            r0.n()
        L25:
            android.arch.lifecycle.f r0 = r3.T
            android.arch.lifecycle.c$a r1 = android.arch.lifecycle.c.a.ON_RESUME
            r0.a(r1)
            android.view.View r0 = r3.J
            if (r0 == 0) goto L37
            android.arch.lifecycle.f r3 = r3.U
            android.arch.lifecycle.c$a r0 = android.arch.lifecycle.c.a.ON_RESUME
            r3.a(r0)
        L37:
            return
        L38:
            android.support.v4.app.w r0 = new android.support.v4.app.w
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " did not call through to super.onResume()"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    void V() {
            r3 = this;
            android.support.v4.app.k r0 = r3.u
            if (r0 == 0) goto Lc
            r0.q()
            android.support.v4.app.k r0 = r3.u
            r0.n()
        Lc:
            r0 = 3
            r3.f544b = r0
            r0 = 0
            r3.H = r0
            r3.M()
            boolean r0 = r3.H
            if (r0 == 0) goto L33
            android.support.v4.app.k r0 = r3.u
            if (r0 == 0) goto L20
            r0.k()
        L20:
            android.arch.lifecycle.f r0 = r3.T
            android.arch.lifecycle.c$a r1 = android.arch.lifecycle.c.a.ON_START
            r0.a(r1)
            android.view.View r0 = r3.J
            if (r0 == 0) goto L32
            android.arch.lifecycle.f r3 = r3.U
            android.arch.lifecycle.c$a r0 = android.arch.lifecycle.c.a.ON_START
            r3.a(r0)
        L32:
            return
        L33:
            android.support.v4.app.w r0 = new android.support.v4.app.w
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " did not call through to super.onStart()"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    void W() {
            r3 = this;
            android.view.View r0 = r3.J
            if (r0 == 0) goto Lb
            android.arch.lifecycle.f r0 = r3.U
            android.arch.lifecycle.c$a r1 = android.arch.lifecycle.c.a.ON_STOP
            r0.a(r1)
        Lb:
            android.arch.lifecycle.f r0 = r3.T
            android.arch.lifecycle.c$a r1 = android.arch.lifecycle.c.a.ON_STOP
            r0.a(r1)
            android.support.v4.app.k r0 = r3.u
            if (r0 == 0) goto L19
            r0.l()
        L19:
            r0 = 2
            r3.f544b = r0
            r0 = 0
            r3.H = r0
            r3.N()
            boolean r0 = r3.H
            if (r0 == 0) goto L27
            return
        L27:
            android.support.v4.app.w r0 = new android.support.v4.app.w
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " did not call through to super.onStop()"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public final android.content.Context X() {
            r3 = this;
            android.content.Context r0 = r3.j()
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " not attached to a context."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public void Y() {
            r2 = this;
            android.support.v4.app.k r0 = r2.s
            if (r0 == 0) goto L30
            android.support.v4.app.i r0 = r0.n
            if (r0 != 0) goto L9
            goto L30
        L9:
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.support.v4.app.k r1 = r2.s
            android.support.v4.app.i r1 = r1.n
            android.os.Handler r1 = r1.e()
            android.os.Looper r1 = r1.getLooper()
            if (r0 == r1) goto L2c
            android.support.v4.app.k r0 = r2.s
            android.support.v4.app.i r0 = r0.n
            android.os.Handler r0 = r0.e()
            android.support.v4.app.e$a r1 = new android.support.v4.app.e$a
            r1.<init>(r2)
            r0.postAtFrontOfQueue(r1)
            goto L37
        L2c:
            r2.c()
            goto L37
        L30:
            android.support.v4.app.e$d r2 = r2.Z()
            r0 = 0
            r2.q = r0
        L37:
            return
    }

    @Override // android.arch.lifecycle.e
    public android.arch.lifecycle.c a() {
            r0 = this;
            android.arch.lifecycle.f r0 = r0.T
            return r0
    }

    android.support.v4.app.e a(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = r1.g
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            return r1
        L9:
            android.support.v4.app.k r1 = r1.u
            if (r1 == 0) goto L12
            android.support.v4.app.e r1 = r1.b(r2)
            return r1
        L12:
            r1 = 0
            return r1
    }

    @java.lang.Deprecated
    public android.view.LayoutInflater a(android.os.Bundle r1) {
            r0 = this;
            android.support.v4.app.i r1 = r0.t
            if (r1 == 0) goto L14
            android.view.LayoutInflater r1 = r1.f()
            r0.i()
            android.support.v4.app.k r0 = r0.u
            r0.o()
            b.b.c.g.f.b(r1, r0)
            return r1
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager."
            r0.<init>(r1)
            throw r0
    }

    public android.view.View a(android.view.LayoutInflater r1, android.view.ViewGroup r2, android.os.Bundle r3) {
            r0 = this;
            r0 = 0
            return r0
    }

    public android.view.animation.Animation a(int r1, boolean r2, int r3) {
            r0 = this;
            r0 = 0
            return r0
    }

    void a(int r2) {
            r1 = this;
            android.support.v4.app.e$d r0 = r1.N
            if (r0 != 0) goto L7
            if (r2 != 0) goto L7
            return
        L7:
            android.support.v4.app.e$d r1 = r1.Z()
            r1.d = r2
            return
    }

    void a(int r2, int r3) {
            r1 = this;
            android.support.v4.app.e$d r0 = r1.N
            if (r0 != 0) goto L9
            if (r2 != 0) goto L9
            if (r3 != 0) goto L9
            return
        L9:
            r1.Z()
            android.support.v4.app.e$d r1 = r1.N
            r1.e = r2
            r1.f = r3
            return
    }

    public void a(int r1, int r2, android.content.Intent r3) {
            r0 = this;
            return
    }

    final void a(int r1, android.support.v4.app.e r2) {
            r0 = this;
            r0.f = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            if (r2 == 0) goto L11
            r1.<init>()
            java.lang.String r2 = r2.g
            r1.append(r2)
            java.lang.String r2 = ":"
            goto L16
        L11:
            r1.<init>()
            java.lang.String r2 = "android:fragment:"
        L16:
            r1.append(r2)
            int r2 = r0.f
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.g = r1
            return
    }

    public void a(int r1, java.lang.String[] r2, int[] r3) {
            r0 = this;
            return
    }

    void a(android.animation.Animator r1) {
            r0 = this;
            android.support.v4.app.e$d r0 = r0.Z()
            r0.f550b = r1
            return
    }

    @java.lang.Deprecated
    public void a(android.app.Activity r1) {
            r0 = this;
            r1 = 1
            r0.H = r1
            return
    }

    @java.lang.Deprecated
    public void a(android.app.Activity r1, android.util.AttributeSet r2, android.os.Bundle r3) {
            r0 = this;
            r1 = 1
            r0.H = r1
            return
    }

    public void a(android.content.Context r2) {
            r1 = this;
            r2 = 1
            r1.H = r2
            android.support.v4.app.i r2 = r1.t
            if (r2 != 0) goto L9
            r2 = 0
            goto Ld
        L9:
            android.app.Activity r2 = r2.b()
        Ld:
            if (r2 == 0) goto L15
            r0 = 0
            r1.H = r0
            r1.a(r2)
        L15:
            return
    }

    public void a(android.content.Context r2, android.util.AttributeSet r3, android.os.Bundle r4) {
            r1 = this;
            r2 = 1
            r1.H = r2
            android.support.v4.app.i r2 = r1.t
            if (r2 != 0) goto L9
            r2 = 0
            goto Ld
        L9:
            android.app.Activity r2 = r2.b()
        Ld:
            if (r2 == 0) goto L15
            r0 = 0
            r1.H = r0
            r1.a(r2, r3, r4)
        L15:
            return
    }

    void a(android.content.res.Configuration r1) {
            r0 = this;
            r0.onConfigurationChanged(r1)
            android.support.v4.app.k r0 = r0.u
            if (r0 == 0) goto La
            r0.a(r1)
        La:
            return
    }

    void a(android.support.v4.app.e.f r3) {
            r2 = this;
            r2.Z()
            android.support.v4.app.e$d r0 = r2.N
            android.support.v4.app.e$f r0 = r0.r
            if (r3 != r0) goto La
            return
        La:
            if (r3 == 0) goto L26
            if (r0 != 0) goto Lf
            goto L26
        Lf:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Trying to set a replacement startPostponedEnterTransition on "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
        L26:
            android.support.v4.app.e$d r2 = r2.N
            boolean r0 = r2.q
            if (r0 == 0) goto L2e
            r2.r = r3
        L2e:
            if (r3 == 0) goto L33
            r3.b()
        L33:
            return
    }

    public void a(android.support.v4.app.e r1) {
            r0 = this;
            return
    }

    public void a(android.view.Menu r1) {
            r0 = this;
            return
    }

    public void a(android.view.Menu r1, android.view.MenuInflater r2) {
            r0 = this;
            return
    }

    void a(android.view.View r1) {
            r0 = this;
            android.support.v4.app.e$d r0 = r0.Z()
            r0.f549a = r1
            return
    }

    public void a(android.view.View r1, android.os.Bundle r2) {
            r0 = this;
            return
    }

    public void a(java.lang.String r3, java.io.FileDescriptor r4, java.io.PrintWriter r5, java.lang.String[] r6) {
            r2 = this;
            r5.print(r3)
            java.lang.String r0 = "mFragmentId=#"
            r5.print(r0)
            int r0 = r2.y
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r5.print(r0)
            java.lang.String r0 = " mContainerId=#"
            r5.print(r0)
            int r0 = r2.z
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r5.print(r0)
            java.lang.String r0 = " mTag="
            r5.print(r0)
            java.lang.String r0 = r2.A
            r5.println(r0)
            r5.print(r3)
            java.lang.String r0 = "mState="
            r5.print(r0)
            int r0 = r2.f544b
            r5.print(r0)
            java.lang.String r0 = " mIndex="
            r5.print(r0)
            int r0 = r2.f
            r5.print(r0)
            java.lang.String r0 = " mWho="
            r5.print(r0)
            java.lang.String r0 = r2.g
            r5.print(r0)
            java.lang.String r0 = " mBackStackNesting="
            r5.print(r0)
            int r0 = r2.r
            r5.println(r0)
            r5.print(r3)
            java.lang.String r0 = "mAdded="
            r5.print(r0)
            boolean r0 = r2.l
            r5.print(r0)
            java.lang.String r0 = " mRemoving="
            r5.print(r0)
            boolean r0 = r2.m
            r5.print(r0)
            java.lang.String r0 = " mFromLayout="
            r5.print(r0)
            boolean r0 = r2.n
            r5.print(r0)
            java.lang.String r0 = " mInLayout="
            r5.print(r0)
            boolean r0 = r2.o
            r5.println(r0)
            r5.print(r3)
            java.lang.String r0 = "mHidden="
            r5.print(r0)
            boolean r0 = r2.B
            r5.print(r0)
            java.lang.String r0 = " mDetached="
            r5.print(r0)
            boolean r0 = r2.C
            r5.print(r0)
            java.lang.String r0 = " mMenuVisible="
            r5.print(r0)
            boolean r0 = r2.G
            r5.print(r0)
            java.lang.String r0 = " mHasMenu="
            r5.print(r0)
            boolean r0 = r2.F
            r5.println(r0)
            r5.print(r3)
            java.lang.String r0 = "mRetainInstance="
            r5.print(r0)
            boolean r0 = r2.D
            r5.print(r0)
            java.lang.String r0 = " mRetaining="
            r5.print(r0)
            boolean r0 = r2.E
            r5.print(r0)
            java.lang.String r0 = " mUserVisibleHint="
            r5.print(r0)
            boolean r0 = r2.M
            r5.println(r0)
            android.support.v4.app.k r0 = r2.s
            if (r0 == 0) goto Ldc
            r5.print(r3)
            java.lang.String r0 = "mFragmentManager="
            r5.print(r0)
            android.support.v4.app.k r0 = r2.s
            r5.println(r0)
        Ldc:
            android.support.v4.app.i r0 = r2.t
            if (r0 == 0) goto Led
            r5.print(r3)
            java.lang.String r0 = "mHost="
            r5.print(r0)
            android.support.v4.app.i r0 = r2.t
            r5.println(r0)
        Led:
            android.support.v4.app.e r0 = r2.x
            if (r0 == 0) goto Lfe
            r5.print(r3)
            java.lang.String r0 = "mParentFragment="
            r5.print(r0)
            android.support.v4.app.e r0 = r2.x
            r5.println(r0)
        Lfe:
            android.os.Bundle r0 = r2.h
            if (r0 == 0) goto L10f
            r5.print(r3)
            java.lang.String r0 = "mArguments="
            r5.print(r0)
            android.os.Bundle r0 = r2.h
            r5.println(r0)
        L10f:
            android.os.Bundle r0 = r2.f545c
            if (r0 == 0) goto L120
            r5.print(r3)
            java.lang.String r0 = "mSavedFragmentState="
            r5.print(r0)
            android.os.Bundle r0 = r2.f545c
            r5.println(r0)
        L120:
            android.util.SparseArray<android.os.Parcelable> r0 = r2.d
            if (r0 == 0) goto L131
            r5.print(r3)
            java.lang.String r0 = "mSavedViewState="
            r5.print(r0)
            android.util.SparseArray<android.os.Parcelable> r0 = r2.d
            r5.println(r0)
        L131:
            android.support.v4.app.e r0 = r2.i
            if (r0 == 0) goto L14c
            r5.print(r3)
            java.lang.String r0 = "mTarget="
            r5.print(r0)
            android.support.v4.app.e r0 = r2.i
            r5.print(r0)
            java.lang.String r0 = " mTargetRequestCode="
            r5.print(r0)
            int r0 = r2.k
            r5.println(r0)
        L14c:
            int r0 = r2.p()
            if (r0 == 0) goto L161
            r5.print(r3)
            java.lang.String r0 = "mNextAnim="
            r5.print(r0)
            int r0 = r2.p()
            r5.println(r0)
        L161:
            android.view.ViewGroup r0 = r2.I
            if (r0 == 0) goto L172
            r5.print(r3)
            java.lang.String r0 = "mContainer="
            r5.print(r0)
            android.view.ViewGroup r0 = r2.I
            r5.println(r0)
        L172:
            android.view.View r0 = r2.J
            if (r0 == 0) goto L183
            r5.print(r3)
            java.lang.String r0 = "mView="
            r5.print(r0)
            android.view.View r0 = r2.J
            r5.println(r0)
        L183:
            android.view.View r0 = r2.K
            if (r0 == 0) goto L194
            r5.print(r3)
            java.lang.String r0 = "mInnerView="
            r5.print(r0)
            android.view.View r0 = r2.J
            r5.println(r0)
        L194:
            android.view.View r0 = r2.g()
            if (r0 == 0) goto L1b8
            r5.print(r3)
            java.lang.String r0 = "mAnimatingAway="
            r5.print(r0)
            android.view.View r0 = r2.g()
            r5.println(r0)
            r5.print(r3)
            java.lang.String r0 = "mStateAfterAnimating="
            r5.print(r0)
            int r0 = r2.x()
            r5.println(r0)
        L1b8:
            android.content.Context r0 = r2.j()
            if (r0 == 0) goto L1c5
            android.support.v4.app.s r0 = android.support.v4.app.s.a(r2)
            r0.a(r3, r4, r5, r6)
        L1c5:
            android.support.v4.app.k r0 = r2.u
            if (r0 == 0) goto L1fd
            r5.print(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Child "
            r0.append(r1)
            android.support.v4.app.k r1 = r2.u
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.println(r0)
            android.support.v4.app.k r2 = r2.u
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = "  "
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.a(r3, r4, r5, r6)
        L1fd:
            return
    }

    public void a(boolean r1) {
            r0 = this;
            return
    }

    public boolean a(android.view.MenuItem r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    public android.animation.Animator b(int r1, boolean r2, int r3) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.arch.lifecycle.q
    public android.arch.lifecycle.p b() {
            r1 = this;
            android.content.Context r0 = r1.j()
            if (r0 == 0) goto L14
            android.arch.lifecycle.p r0 = r1.w
            if (r0 != 0) goto L11
            android.arch.lifecycle.p r0 = new android.arch.lifecycle.p
            r0.<init>()
            r1.w = r0
        L11:
            android.arch.lifecycle.p r1 = r1.w
            return r1
        L14:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can't access ViewModels from detached fragment"
            r1.<init>(r0)
            throw r1
    }

    void b(int r1) {
            r0 = this;
            android.support.v4.app.e$d r0 = r0.Z()
            r0.f551c = r1
            return
    }

    public void b(android.os.Bundle r1) {
            r0 = this;
            r1 = 1
            r0.H = r1
            return
    }

    void b(android.view.LayoutInflater r2, android.view.ViewGroup r3, android.os.Bundle r4) {
            r1 = this;
            android.support.v4.app.k r0 = r1.u
            if (r0 == 0) goto L7
            r0.q()
        L7:
            r0 = 1
            r1.q = r0
            android.support.v4.app.e$c r0 = new android.support.v4.app.e$c
            r0.<init>(r1)
            r1.V = r0
            r0 = 0
            r1.U = r0
            android.view.View r2 = r1.a(r2, r3, r4)
            r1.J = r2
            if (r2 == 0) goto L29
            android.arch.lifecycle.e r2 = r1.V
            r2.a()
            android.arch.lifecycle.j<android.arch.lifecycle.e> r2 = r1.W
            android.arch.lifecycle.e r1 = r1.V
            r2.a(r1)
            goto L2f
        L29:
            android.arch.lifecycle.f r2 = r1.U
            if (r2 != 0) goto L30
            r1.V = r0
        L2f:
            return
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Called getViewLifecycleOwner() but onCreateView() returned null"
            r1.<init>(r2)
            throw r1
    }

    public void b(android.view.Menu r1) {
            r0 = this;
            return
    }

    public void b(boolean r1) {
            r0 = this;
            return
    }

    boolean b(android.view.Menu r3, android.view.MenuInflater r4) {
            r2 = this;
            boolean r0 = r2.B
            r1 = 0
            if (r0 != 0) goto L1b
            boolean r0 = r2.F
            if (r0 == 0) goto L12
            boolean r0 = r2.G
            if (r0 == 0) goto L12
            r0 = 1
            r2.a(r3, r4)
            r1 = r0
        L12:
            android.support.v4.app.k r2 = r2.u
            if (r2 == 0) goto L1b
            boolean r2 = r2.a(r3, r4)
            r1 = r1 | r2
        L1b:
            return r1
    }

    public boolean b(android.view.MenuItem r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    void c() {
            r2 = this;
            android.support.v4.app.e$d r2 = r2.N
            r0 = 0
            if (r2 != 0) goto L6
            goto Le
        L6:
            r1 = 0
            r2.q = r1
            android.support.v4.app.e$f r1 = r2.r
            r2.r = r0
            r0 = r1
        Le:
            if (r0 == 0) goto L13
            r0.a()
        L13:
            return
    }

    public void c(android.os.Bundle r2) {
            r1 = this;
            r0 = 1
            r1.H = r0
            r1.k(r2)
            android.support.v4.app.k r2 = r1.u
            if (r2 == 0) goto L15
            boolean r2 = r2.c(r0)
            if (r2 != 0) goto L15
            android.support.v4.app.k r1 = r1.u
            r1.e()
        L15:
            return
    }

    void c(android.view.Menu r2) {
            r1 = this;
            boolean r0 = r1.B
            if (r0 != 0) goto L16
            boolean r0 = r1.F
            if (r0 == 0) goto Lf
            boolean r0 = r1.G
            if (r0 == 0) goto Lf
            r1.a(r2)
        Lf:
            android.support.v4.app.k r1 = r1.u
            if (r1 == 0) goto L16
            r1.a(r2)
        L16:
            return
    }

    public void c(boolean r1) {
            r0 = this;
            return
    }

    boolean c(android.view.MenuItem r3) {
            r2 = this;
            boolean r0 = r2.B
            if (r0 != 0) goto L17
            boolean r0 = r2.a(r3)
            r1 = 1
            if (r0 == 0) goto Lc
            return r1
        Lc:
            android.support.v4.app.k r2 = r2.u
            if (r2 == 0) goto L17
            boolean r2 = r2.a(r3)
            if (r2 == 0) goto L17
            return r1
        L17:
            r2 = 0
            return r2
    }

    public final android.support.v4.app.f d() {
            r0 = this;
            android.support.v4.app.i r0 = r0.t
            if (r0 != 0) goto L6
            r0 = 0
            goto Lc
        L6:
            android.app.Activity r0 = r0.b()
            android.support.v4.app.f r0 = (android.support.v4.app.f) r0
        Lc:
            return r0
    }

    public android.view.LayoutInflater d(android.os.Bundle r1) {
            r0 = this;
            android.view.LayoutInflater r0 = r0.a(r1)
            return r0
    }

    void d(boolean r1) {
            r0 = this;
            r0.b(r1)
            android.support.v4.app.k r0 = r0.u
            if (r0 == 0) goto La
            r0.a(r1)
        La:
            return
    }

    boolean d(android.view.Menu r3) {
            r2 = this;
            boolean r0 = r2.B
            r1 = 0
            if (r0 != 0) goto L1b
            boolean r0 = r2.F
            if (r0 == 0) goto L12
            boolean r0 = r2.G
            if (r0 == 0) goto L12
            r0 = 1
            r2.b(r3)
            r1 = r0
        L12:
            android.support.v4.app.k r2 = r2.u
            if (r2 == 0) goto L1b
            boolean r2 = r2.b(r3)
            r1 = r1 | r2
        L1b:
            return r1
    }

    boolean d(android.view.MenuItem r3) {
            r2 = this;
            boolean r0 = r2.B
            if (r0 != 0) goto L1f
            boolean r0 = r2.F
            r1 = 1
            if (r0 == 0) goto L14
            boolean r0 = r2.G
            if (r0 == 0) goto L14
            boolean r0 = r2.b(r3)
            if (r0 == 0) goto L14
            return r1
        L14:
            android.support.v4.app.k r2 = r2.u
            if (r2 == 0) goto L1f
            boolean r2 = r2.b(r3)
            if (r2 == 0) goto L1f
            return r1
        L1f:
            r2 = 0
            return r2
    }

    public void e(android.os.Bundle r1) {
            r0 = this;
            return
    }

    void e(boolean r1) {
            r0 = this;
            r0.c(r1)
            android.support.v4.app.k r0 = r0.u
            if (r0 == 0) goto La
            r0.b(r1)
        La:
            return
    }

    public boolean e() {
            r0 = this;
            android.support.v4.app.e$d r0 = r0.N
            if (r0 == 0) goto Le
            java.lang.Boolean r0 = r0.n
            if (r0 != 0) goto L9
            goto Le
        L9:
            boolean r0 = r0.booleanValue()
            goto Lf
        Le:
            r0 = 1
        Lf:
            return r0
    }

    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r0 = super.equals(r1)
            return r0
    }

    public void f(android.os.Bundle r1) {
            r0 = this;
            r1 = 1
            r0.H = r1
            return
    }

    void f(boolean r1) {
            r0 = this;
            android.support.v4.app.e$d r0 = r0.Z()
            r0.s = r1
            return
    }

    public boolean f() {
            r0 = this;
            android.support.v4.app.e$d r0 = r0.N
            if (r0 == 0) goto Le
            java.lang.Boolean r0 = r0.m
            if (r0 != 0) goto L9
            goto Le
        L9:
            boolean r0 = r0.booleanValue()
            goto Lf
        Le:
            r0 = 1
        Lf:
            return r0
    }

    android.view.View g() {
            r0 = this;
            android.support.v4.app.e$d r0 = r0.N
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.view.View r0 = r0.f549a
            return r0
    }

    void g(android.os.Bundle r3) {
            r2 = this;
            android.support.v4.app.k r0 = r2.u
            if (r0 == 0) goto L7
            r0.q()
        L7:
            r0 = 2
            r2.f544b = r0
            r0 = 0
            r2.H = r0
            r2.b(r3)
            boolean r3 = r2.H
            if (r3 == 0) goto L1c
            android.support.v4.app.k r2 = r2.u
            if (r2 == 0) goto L1b
            r2.d()
        L1b:
            return
        L1c:
            android.support.v4.app.w r3 = new android.support.v4.app.w
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Fragment "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = " did not call through to super.onActivityCreated()"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
    }

    android.animation.Animator h() {
            r0 = this;
            android.support.v4.app.e$d r0 = r0.N
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.animation.Animator r0 = r0.f550b
            return r0
    }

    void h(android.os.Bundle r3) {
            r2 = this;
            android.support.v4.app.k r0 = r2.u
            if (r0 == 0) goto L7
            r0.q()
        L7:
            r0 = 1
            r2.f544b = r0
            r1 = 0
            r2.H = r1
            r2.c(r3)
            r2.S = r0
            boolean r3 = r2.H
            if (r3 == 0) goto L1e
            android.arch.lifecycle.f r2 = r2.T
            android.arch.lifecycle.c$a r3 = android.arch.lifecycle.c.a.ON_CREATE
            r2.a(r3)
            return
        L1e:
            android.support.v4.app.w r3 = new android.support.v4.app.w
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Fragment "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = " did not call through to super.onCreate()"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
    }

    public final int hashCode() {
            r0 = this;
            int r0 = super.hashCode()
            return r0
    }

    public final android.support.v4.app.j i() {
            r2 = this;
            android.support.v4.app.k r0 = r2.u
            if (r0 != 0) goto L2c
            r2.A()
            int r0 = r2.f544b
            r1 = 4
            if (r0 < r1) goto L12
            android.support.v4.app.k r0 = r2.u
            r0.j()
            goto L2c
        L12:
            r1 = 3
            if (r0 < r1) goto L1b
            android.support.v4.app.k r0 = r2.u
            r0.k()
            goto L2c
        L1b:
            r1 = 2
            if (r0 < r1) goto L24
            android.support.v4.app.k r0 = r2.u
            r0.d()
            goto L2c
        L24:
            r1 = 1
            if (r0 < r1) goto L2c
            android.support.v4.app.k r0 = r2.u
            r0.e()
        L2c:
            android.support.v4.app.k r2 = r2.u
            return r2
    }

    android.view.LayoutInflater i(android.os.Bundle r1) {
            r0 = this;
            android.view.LayoutInflater r1 = r0.d(r1)
            r0.R = r1
            return r1
    }

    public android.content.Context j() {
            r0 = this;
            android.support.v4.app.i r0 = r0.t
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            android.content.Context r0 = r0.c()
        La:
            return r0
    }

    void j(android.os.Bundle r2) {
            r1 = this;
            r1.e(r2)
            android.support.v4.app.k r1 = r1.u
            if (r1 == 0) goto L12
            android.os.Parcelable r1 = r1.t()
            if (r1 == 0) goto L12
            java.lang.String r0 = "android:support:fragments"
            r2.putParcelable(r0, r1)
        L12:
            return
    }

    public java.lang.Object k() {
            r0 = this;
            android.support.v4.app.e$d r0 = r0.N
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.Object r0 = r0.g
            return r0
    }

    void k(android.os.Bundle r3) {
            r2 = this;
            if (r3 == 0) goto L20
            java.lang.String r0 = "android:support:fragments"
            android.os.Parcelable r3 = r3.getParcelable(r0)
            if (r3 == 0) goto L20
            android.support.v4.app.k r0 = r2.u
            if (r0 != 0) goto L11
            r2.A()
        L11:
            android.support.v4.app.k r0 = r2.u
            android.support.v4.app.l r1 = r2.v
            r0.a(r3, r1)
            r3 = 0
            r2.v = r3
            android.support.v4.app.k r2 = r2.u
            r2.e()
        L20:
            return
    }

    android.support.v4.app.v l() {
            r0 = this;
            android.support.v4.app.e$d r0 = r0.N
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.support.v4.app.v r0 = r0.o
            return r0
    }

    final void l(android.os.Bundle r3) {
            r2 = this;
            android.util.SparseArray<android.os.Parcelable> r0 = r2.d
            if (r0 == 0) goto Lc
            android.view.View r1 = r2.K
            r1.restoreHierarchyState(r0)
            r0 = 0
            r2.d = r0
        Lc:
            r0 = 0
            r2.H = r0
            r2.f(r3)
            boolean r3 = r2.H
            if (r3 == 0) goto L22
            android.view.View r3 = r2.J
            if (r3 == 0) goto L21
            android.arch.lifecycle.f r2 = r2.U
            android.arch.lifecycle.c$a r3 = android.arch.lifecycle.c.a.ON_CREATE
            r2.a(r3)
        L21:
            return
        L22:
            android.support.v4.app.w r3 = new android.support.v4.app.w
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Fragment "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = " did not call through to super.onViewStateRestored()"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
    }

    public java.lang.Object m() {
            r0 = this;
            android.support.v4.app.e$d r0 = r0.N
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.Object r0 = r0.i
            return r0
    }

    public void m(android.os.Bundle r2) {
            r1 = this;
            int r0 = r1.f
            if (r0 < 0) goto L13
            boolean r0 = r1.E()
            if (r0 != 0) goto Lb
            goto L13
        Lb:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Fragment already active and state has been saved"
            r1.<init>(r2)
            throw r1
        L13:
            r1.h = r2
            return
    }

    android.support.v4.app.v n() {
            r0 = this;
            android.support.v4.app.e$d r0 = r0.N
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.support.v4.app.v r0 = r0.p
            return r0
    }

    public final android.support.v4.app.j o() {
            r0 = this;
            android.support.v4.app.k r0 = r0.s
            return r0
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            r1 = 1
            r0.H = r1
            return
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu r1, android.view.View r2, android.view.ContextMenu.ContextMenuInfo r3) {
            r0 = this;
            android.support.v4.app.f r0 = r0.d()
            r0.onCreateContextMenu(r1, r2, r3)
            return
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
            r1 = this;
            r0 = 1
            r1.H = r0
            return
    }

    int p() {
            r0 = this;
            android.support.v4.app.e$d r0 = r0.N
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.d
            return r0
    }

    int q() {
            r0 = this;
            android.support.v4.app.e$d r0 = r0.N
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.e
            return r0
    }

    int r() {
            r0 = this;
            android.support.v4.app.e$d r0 = r0.N
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.f
            return r0
    }

    public java.lang.Object s() {
            r2 = this;
            android.support.v4.app.e$d r0 = r2.N
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            java.lang.Object r0 = r0.j
            java.lang.Object r1 = android.support.v4.app.e.Y
            if (r0 != r1) goto L10
            java.lang.Object r0 = r2.m()
        L10:
            return r0
    }

    public final android.content.res.Resources t() {
            r0 = this;
            android.content.Context r0 = r0.X()
            android.content.res.Resources r0 = r0.getResources()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            b.b.c.f.d.a(r2, r0)
            int r1 = r2.f
            if (r1 < 0) goto L18
            java.lang.String r1 = " #"
            r0.append(r1)
            int r1 = r2.f
            r0.append(r1)
        L18:
            int r1 = r2.y
            if (r1 == 0) goto L2a
            java.lang.String r1 = " id=0x"
            r0.append(r1)
            int r1 = r2.y
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
        L2a:
            java.lang.String r1 = r2.A
            if (r1 == 0) goto L38
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r2 = r2.A
            r0.append(r2)
        L38:
            r2 = 125(0x7d, float:1.75E-43)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public java.lang.Object u() {
            r2 = this;
            android.support.v4.app.e$d r0 = r2.N
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            java.lang.Object r0 = r0.h
            java.lang.Object r1 = android.support.v4.app.e.Y
            if (r0 != r1) goto L10
            java.lang.Object r0 = r2.k()
        L10:
            return r0
    }

    public java.lang.Object v() {
            r0 = this;
            android.support.v4.app.e$d r0 = r0.N
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.Object r0 = r0.k
            return r0
    }

    public java.lang.Object w() {
            r2 = this;
            android.support.v4.app.e$d r0 = r2.N
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            java.lang.Object r0 = r0.l
            java.lang.Object r1 = android.support.v4.app.e.Y
            if (r0 != r1) goto L10
            java.lang.Object r0 = r2.v()
        L10:
            return r0
    }

    int x() {
            r0 = this;
            android.support.v4.app.e$d r0 = r0.N
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.f551c
            return r0
    }

    public android.view.View y() {
            r0 = this;
            android.view.View r0 = r0.J
            return r0
    }

    void z() {
            r2 = this;
            r0 = -1
            r2.f = r0
            r0 = 0
            r2.g = r0
            r1 = 0
            r2.l = r1
            r2.m = r1
            r2.n = r1
            r2.o = r1
            r2.p = r1
            r2.r = r1
            r2.s = r0
            r2.u = r0
            r2.t = r0
            r2.y = r1
            r2.z = r1
            r2.A = r0
            r2.B = r1
            r2.C = r1
            r2.E = r1
            return
    }
}
