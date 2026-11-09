package android.support.v4.app;

/* JADX INFO: loaded from: classes.dex */
class LoaderManagerImpl extends android.support.v4.app.s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static boolean f528c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.arch.lifecycle.e f529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.support.v4.app.LoaderManagerImpl.LoaderViewModel f530b;

    static class LoaderViewModel extends android.arch.lifecycle.n {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final android.arch.lifecycle.o.a f531b = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b.b.c.f.l<android.support.v4.app.LoaderManagerImpl.a> f532a;

        static class a implements android.arch.lifecycle.o.a {
            a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.arch.lifecycle.o.a
            public <T extends android.arch.lifecycle.n> T a(java.lang.Class<T> r1) {
                    r0 = this;
                    android.support.v4.app.LoaderManagerImpl$LoaderViewModel r0 = new android.support.v4.app.LoaderManagerImpl$LoaderViewModel
                    r0.<init>()
                    return r0
            }
        }

        static {
                android.support.v4.app.LoaderManagerImpl$LoaderViewModel$a r0 = new android.support.v4.app.LoaderManagerImpl$LoaderViewModel$a
                r0.<init>()
                android.support.v4.app.LoaderManagerImpl.LoaderViewModel.f531b = r0
                return
        }

        LoaderViewModel() {
                r1 = this;
                r1.<init>()
                b.b.c.f.l r0 = new b.b.c.f.l
                r0.<init>()
                r1.f532a = r0
                return
        }

        static android.support.v4.app.LoaderManagerImpl.LoaderViewModel a(android.arch.lifecycle.p r2) {
                android.arch.lifecycle.o r0 = new android.arch.lifecycle.o
                android.arch.lifecycle.o$a r1 = android.support.v4.app.LoaderManagerImpl.LoaderViewModel.f531b
                r0.<init>(r2, r1)
                java.lang.Class<android.support.v4.app.LoaderManagerImpl$LoaderViewModel> r2 = android.support.v4.app.LoaderManagerImpl.LoaderViewModel.class
                android.arch.lifecycle.n r2 = r0.a(r2)
                android.support.v4.app.LoaderManagerImpl$LoaderViewModel r2 = (android.support.v4.app.LoaderManagerImpl.LoaderViewModel) r2
                return r2
        }

        @Override // android.arch.lifecycle.n
        protected void a() {
                r1 = this;
                super.a()
                b.b.c.f.l<android.support.v4.app.LoaderManagerImpl$a> r0 = r1.f532a
                int r0 = r0.b()
                b.b.c.f.l<android.support.v4.app.LoaderManagerImpl$a> r1 = r1.f532a
                if (r0 > 0) goto L11
                r1.a()
                return
            L11:
                r0 = 0
                java.lang.Object r1 = r1.e(r0)
                android.support.v4.app.LoaderManagerImpl$a r1 = (android.support.v4.app.LoaderManagerImpl.a) r1
                r0 = 1
                r1.a(r0)
                r1 = 0
                throw r1
        }

        public void a(java.lang.String r4, java.io.FileDescriptor r5, java.io.PrintWriter r6, java.lang.String[] r7) {
                r3 = this;
                b.b.c.f.l<android.support.v4.app.LoaderManagerImpl$a> r0 = r3.f532a
                int r0 = r0.b()
                if (r0 <= 0) goto L55
                r6.print(r4)
                java.lang.String r0 = "Loaders:"
                r6.println(r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r4)
                java.lang.String r1 = "    "
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 0
                b.b.c.f.l<android.support.v4.app.LoaderManagerImpl$a> r2 = r3.f532a
                int r2 = r2.b()
                if (r2 > 0) goto L2b
                goto L55
            L2b:
                b.b.c.f.l<android.support.v4.app.LoaderManagerImpl$a> r2 = r3.f532a
                java.lang.Object r2 = r2.e(r1)
                android.support.v4.app.LoaderManagerImpl$a r2 = (android.support.v4.app.LoaderManagerImpl.a) r2
                r6.print(r4)
                java.lang.String r4 = "  #"
                r6.print(r4)
                b.b.c.f.l<android.support.v4.app.LoaderManagerImpl$a> r3 = r3.f532a
                int r3 = r3.c(r1)
                r6.print(r3)
                java.lang.String r3 = ": "
                r6.print(r3)
                java.lang.String r3 = r2.toString()
                r6.println(r3)
                r2.a(r0, r5, r6, r7)
                r3 = 0
                throw r3
            L55:
                return
        }

        void b() {
                r3 = this;
                b.b.c.f.l<android.support.v4.app.LoaderManagerImpl$a> r0 = r3.f532a
                int r0 = r0.b()
                r1 = 0
            L7:
                if (r1 >= r0) goto L17
                b.b.c.f.l<android.support.v4.app.LoaderManagerImpl$a> r2 = r3.f532a
                java.lang.Object r2 = r2.e(r1)
                android.support.v4.app.LoaderManagerImpl$a r2 = (android.support.v4.app.LoaderManagerImpl.a) r2
                r2.d()
                int r1 = r1 + 1
                goto L7
            L17:
                return
        }
    }

    /* JADX WARN: Unexpected interfaces in signature: [java.lang.Object<D>] */
    public static class a<D> extends android.arch.lifecycle.j<D> {
        private final int j;
        private final android.os.Bundle k;
        private final b.b.c.a.b<D> l;
        private android.arch.lifecycle.e m;
        private android.support.v4.app.LoaderManagerImpl.b<D> n;
        private b.b.c.a.b<D> o;

        b.b.c.a.b<D> a(boolean r2) {
                r1 = this;
                boolean r2 = android.support.v4.app.LoaderManagerImpl.f528c
                if (r2 == 0) goto L1a
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r0 = "  Destroying: "
                r2.append(r0)
                r2.append(r1)
                java.lang.String r2 = r2.toString()
                java.lang.String r0 = "LoaderManager"
                android.util.Log.v(r0, r2)
            L1a:
                b.b.c.a.b<D> r1 = r1.l
                r1.a()
                r1 = 0
                throw r1
        }

        @Override // android.arch.lifecycle.LiveData
        protected void a() {
                r2 = this;
                boolean r0 = android.support.v4.app.LoaderManagerImpl.f528c
                if (r0 == 0) goto L1a
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "  Starting: "
                r0.append(r1)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "LoaderManager"
                android.util.Log.v(r1, r0)
            L1a:
                b.b.c.a.b<D> r2 = r2.l
                r2.c()
                r2 = 0
                throw r2
        }

        @Override // android.arch.lifecycle.LiveData
        public void a(android.arch.lifecycle.k<? super D> r1) {
                r0 = this;
                super.a(r1)
                r1 = 0
                r0.m = r1
                r0.n = r1
                return
        }

        @Override // android.arch.lifecycle.j, android.arch.lifecycle.LiveData
        public void a(D r1) {
                r0 = this;
                super.a(r1)
                b.b.c.a.b<D> r0 = r0.o
                if (r0 != 0) goto L8
                return
            L8:
                r0.b()
                r0 = 0
                throw r0
        }

        public void a(java.lang.String r2, java.io.FileDescriptor r3, java.io.PrintWriter r4, java.lang.String[] r5) {
                r1 = this;
                r4.print(r2)
                java.lang.String r0 = "mId="
                r4.print(r0)
                int r0 = r1.j
                r4.print(r0)
                java.lang.String r0 = " mArgs="
                r4.print(r0)
                android.os.Bundle r0 = r1.k
                r4.println(r0)
                r4.print(r2)
                java.lang.String r0 = "mLoader="
                r4.print(r0)
                b.b.c.a.b<D> r0 = r1.l
                r4.println(r0)
                b.b.c.a.b<D> r1 = r1.l
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r2)
                java.lang.String r2 = "  "
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                r1.a(r2, r3, r4, r5)
                r1 = 0
                throw r1
        }

        @Override // android.arch.lifecycle.LiveData
        protected void b() {
                r2 = this;
                boolean r0 = android.support.v4.app.LoaderManagerImpl.f528c
                if (r0 == 0) goto L1a
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "  Stopping: "
                r0.append(r1)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "LoaderManager"
                android.util.Log.v(r1, r0)
            L1a:
                b.b.c.a.b<D> r2 = r2.l
                r2.d()
                r2 = 0
                throw r2
        }

        void d() {
                r2 = this;
                android.arch.lifecycle.e r0 = r2.m
                android.support.v4.app.LoaderManagerImpl$b<D> r1 = r2.n
                if (r0 == 0) goto Le
                if (r1 == 0) goto Le
                super.a(r1)
                r2.a(r0, r1)
            Le:
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 64
                r0.<init>(r1)
                java.lang.String r1 = "LoaderInfo{"
                r0.append(r1)
                int r1 = java.lang.System.identityHashCode(r2)
                java.lang.String r1 = java.lang.Integer.toHexString(r1)
                r0.append(r1)
                java.lang.String r1 = " #"
                r0.append(r1)
                int r1 = r2.j
                r0.append(r1)
                java.lang.String r1 = " : "
                r0.append(r1)
                b.b.c.a.b<D> r2 = r2.l
                b.b.c.f.d.a(r2, r0)
                java.lang.String r2 = "}}"
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                return r2
        }
    }

    static class b<D> implements android.arch.lifecycle.k<D> {
    }

    static {
            return
    }

    LoaderManagerImpl(android.arch.lifecycle.e r1, android.arch.lifecycle.p r2) {
            r0 = this;
            r0.<init>()
            r0.f529a = r1
            android.support.v4.app.LoaderManagerImpl$LoaderViewModel r1 = android.support.v4.app.LoaderManagerImpl.LoaderViewModel.a(r2)
            r0.f530b = r1
            return
    }

    @Override // android.support.v4.app.s
    public void a() {
            r0 = this;
            android.support.v4.app.LoaderManagerImpl$LoaderViewModel r0 = r0.f530b
            r0.b()
            return
    }

    @Override // android.support.v4.app.s
    @java.lang.Deprecated
    public void a(java.lang.String r1, java.io.FileDescriptor r2, java.io.PrintWriter r3, java.lang.String[] r4) {
            r0 = this;
            android.support.v4.app.LoaderManagerImpl$LoaderViewModel r0 = r0.f530b
            r0.a(r1, r2, r3, r4)
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            java.lang.String r1 = "LoaderManager{"
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " in "
            r0.append(r1)
            android.arch.lifecycle.e r2 = r2.f529a
            b.b.c.f.d.a(r2, r0)
            java.lang.String r2 = "}}"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
