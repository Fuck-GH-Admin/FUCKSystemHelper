package android.arch.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public abstract class LiveData<T> {
    private static final java.lang.Object i = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b.a.a.b.b<android.arch.lifecycle.k<T>, android.arch.lifecycle.LiveData<T>.b> f374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f375c;
    private volatile java.lang.Object d;
    private volatile java.lang.Object e;
    private int f;
    private boolean g;
    private boolean h;

    class LifecycleBoundObserver extends android.arch.lifecycle.LiveData<T>.b implements android.arch.lifecycle.GenericLifecycleObserver {
        final android.arch.lifecycle.e e;
        final /* synthetic */ android.arch.lifecycle.LiveData f;

        LifecycleBoundObserver(android.arch.lifecycle.LiveData r1, android.arch.lifecycle.e r2, android.arch.lifecycle.k<T> r3) {
                r0 = this;
                r0.f = r1
                r0.<init>(r1, r3)
                r0.e = r2
                return
        }

        @Override // android.arch.lifecycle.LiveData.b
        void a() {
                r1 = this;
                android.arch.lifecycle.e r0 = r1.e
                android.arch.lifecycle.c r0 = r0.a()
                r0.b(r1)
                return
        }

        @Override // android.arch.lifecycle.GenericLifecycleObserver
        public void a(android.arch.lifecycle.e r1, android.arch.lifecycle.c.a r2) {
                r0 = this;
                android.arch.lifecycle.e r1 = r0.e
                android.arch.lifecycle.c r1 = r1.a()
                android.arch.lifecycle.c$b r1 = r1.a()
                android.arch.lifecycle.c$b r2 = android.arch.lifecycle.c.b.f390b
                if (r1 != r2) goto L16
                android.arch.lifecycle.LiveData r1 = r0.f
                android.arch.lifecycle.k<T> r0 = r0.f377a
                r1.a(r0)
                return
            L16:
                boolean r1 = r0.b()
                r0.a(r1)
                return
        }

        @Override // android.arch.lifecycle.LiveData.b
        boolean b() {
                r1 = this;
                android.arch.lifecycle.e r1 = r1.e
                android.arch.lifecycle.c r1 = r1.a()
                android.arch.lifecycle.c$b r1 = r1.a()
                android.arch.lifecycle.c$b r0 = android.arch.lifecycle.c.b.e
                boolean r1 = r1.a(r0)
                return r1
        }

        @Override // android.arch.lifecycle.LiveData.b
        boolean g(android.arch.lifecycle.e r1) {
                r0 = this;
                android.arch.lifecycle.e r0 = r0.e
                if (r0 != r1) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }
    }

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.arch.lifecycle.LiveData f376b;

        a(android.arch.lifecycle.LiveData r1) {
                r0 = this;
                r0.f376b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                android.arch.lifecycle.LiveData r0 = r4.f376b
                java.lang.Object r0 = android.arch.lifecycle.LiveData.a(r0)
                monitor-enter(r0)
                android.arch.lifecycle.LiveData r1 = r4.f376b     // Catch: java.lang.Throwable -> L1d
                java.lang.Object r1 = android.arch.lifecycle.LiveData.b(r1)     // Catch: java.lang.Throwable -> L1d
                android.arch.lifecycle.LiveData r2 = r4.f376b     // Catch: java.lang.Throwable -> L1d
                java.lang.Object r3 = android.arch.lifecycle.LiveData.c()     // Catch: java.lang.Throwable -> L1d
                android.arch.lifecycle.LiveData.a(r2, r3)     // Catch: java.lang.Throwable -> L1d
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
                android.arch.lifecycle.LiveData r4 = r4.f376b
                r4.a(r1)
                return
            L1d:
                r4 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
                throw r4
        }
    }

    private abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final android.arch.lifecycle.k<T> f377a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f378b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f379c;
        final /* synthetic */ android.arch.lifecycle.LiveData d;

        b(android.arch.lifecycle.LiveData r1, android.arch.lifecycle.k<T> r2) {
                r0 = this;
                r0.d = r1
                r0.<init>()
                r1 = -1
                r0.f379c = r1
                r0.f377a = r2
                return
        }

        void a() {
                r0 = this;
                return
        }

        void a(boolean r5) {
                r4 = this;
                boolean r0 = r4.f378b
                if (r5 != r0) goto L5
                return
            L5:
                r4.f378b = r5
                android.arch.lifecycle.LiveData r5 = r4.d
                int r5 = android.arch.lifecycle.LiveData.c(r5)
                r0 = 1
                if (r5 != 0) goto L12
                r5 = r0
                goto L13
            L12:
                r5 = 0
            L13:
                android.arch.lifecycle.LiveData r1 = r4.d
                int r2 = android.arch.lifecycle.LiveData.c(r1)
                boolean r3 = r4.f378b
                if (r3 == 0) goto L1e
                goto L1f
            L1e:
                r0 = -1
            L1f:
                int r2 = r2 + r0
                android.arch.lifecycle.LiveData.a(r1, r2)
                if (r5 == 0) goto L2e
                boolean r5 = r4.f378b
                if (r5 == 0) goto L2e
                android.arch.lifecycle.LiveData r5 = r4.d
                r5.a()
            L2e:
                android.arch.lifecycle.LiveData r5 = r4.d
                int r5 = android.arch.lifecycle.LiveData.c(r5)
                if (r5 != 0) goto L3f
                boolean r5 = r4.f378b
                if (r5 != 0) goto L3f
                android.arch.lifecycle.LiveData r5 = r4.d
                r5.b()
            L3f:
                boolean r5 = r4.f378b
                if (r5 == 0) goto L48
                android.arch.lifecycle.LiveData r5 = r4.d
                android.arch.lifecycle.LiveData.a(r5, r4)
            L48:
                return
        }

        abstract boolean b();

        boolean g(android.arch.lifecycle.e r1) {
                r0 = this;
                r0 = 0
                return r0
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            android.arch.lifecycle.LiveData.i = r0
            return
    }

    public LiveData() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f373a = r0
            b.a.a.b.b r0 = new b.a.a.b.b
            r0.<init>()
            r1.f374b = r0
            r0 = 0
            r1.f375c = r0
            java.lang.Object r0 = android.arch.lifecycle.LiveData.i
            r1.d = r0
            java.lang.Object r0 = android.arch.lifecycle.LiveData.i
            r1.e = r0
            r0 = -1
            r1.f = r0
            android.arch.lifecycle.LiveData$a r0 = new android.arch.lifecycle.LiveData$a
            r0.<init>(r1)
            return
    }

    static /* synthetic */ int a(android.arch.lifecycle.LiveData r0, int r1) {
            r0.f375c = r1
            return r1
    }

    static /* synthetic */ java.lang.Object a(android.arch.lifecycle.LiveData r0) {
            java.lang.Object r0 = r0.f373a
            return r0
    }

    static /* synthetic */ java.lang.Object a(android.arch.lifecycle.LiveData r0, java.lang.Object r1) {
            r0.e = r1
            return r1
    }

    private void a(android.arch.lifecycle.LiveData<T>.b r3) {
            r2 = this;
            boolean r0 = r3.f378b
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = r3.b()
            if (r0 != 0) goto L10
            r2 = 0
            r3.a(r2)
            return
        L10:
            int r0 = r3.f379c
            int r1 = r2.f
            if (r0 < r1) goto L17
            return
        L17:
            r3.f379c = r1
            android.arch.lifecycle.k<T> r3 = r3.f377a
            java.lang.Object r2 = r2.d
            r3.a(r2)
            return
    }

    static /* synthetic */ void a(android.arch.lifecycle.LiveData r0, android.arch.lifecycle.LiveData.b r1) {
            r0.b(r1)
            return
    }

    private static void a(java.lang.String r3) {
            b.a.a.a.a r0 = b.a.a.a.a.b()
            boolean r0 = r0.a()
            if (r0 == 0) goto Lb
            return
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot invoke "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " on a background"
            r1.append(r3)
            java.lang.String r3 = " thread"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    static /* synthetic */ java.lang.Object b(android.arch.lifecycle.LiveData r0) {
            java.lang.Object r0 = r0.e
            return r0
    }

    private void b(android.arch.lifecycle.LiveData<T>.b r4) {
            r3 = this;
            boolean r0 = r3.g
            r1 = 1
            if (r0 == 0) goto L8
            r3.h = r1
            return
        L8:
            r3.g = r1
        La:
            r0 = 0
            r3.h = r0
            if (r4 == 0) goto L14
            r3.a(r4)
            r4 = 0
            goto L33
        L14:
            b.a.a.b.b<android.arch.lifecycle.k<T>, android.arch.lifecycle.LiveData<T>$b> r1 = r3.f374b
            b.a.a.b.b$e r1 = r1.c()
        L1a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getValue()
            android.arch.lifecycle.LiveData$b r2 = (android.arch.lifecycle.LiveData.b) r2
            r3.a(r2)
            boolean r2 = r3.h
            if (r2 == 0) goto L1a
        L33:
            boolean r1 = r3.h
            if (r1 != 0) goto La
            r3.g = r0
            return
    }

    static /* synthetic */ int c(android.arch.lifecycle.LiveData r0) {
            int r0 = r0.f375c
            return r0
    }

    static /* synthetic */ java.lang.Object c() {
            java.lang.Object r0 = android.arch.lifecycle.LiveData.i
            return r0
    }

    protected void a() {
            r0 = this;
            return
    }

    public void a(android.arch.lifecycle.e r3, android.arch.lifecycle.k<T> r4) {
            r2 = this;
            android.arch.lifecycle.c r0 = r3.a()
            android.arch.lifecycle.c$b r0 = r0.a()
            android.arch.lifecycle.c$b r1 = android.arch.lifecycle.c.b.f390b
            if (r0 != r1) goto Ld
            return
        Ld:
            android.arch.lifecycle.LiveData$LifecycleBoundObserver r0 = new android.arch.lifecycle.LiveData$LifecycleBoundObserver
            r0.<init>(r2, r3, r4)
            b.a.a.b.b<android.arch.lifecycle.k<T>, android.arch.lifecycle.LiveData<T>$b> r2 = r2.f374b
            java.lang.Object r2 = r2.b(r4, r0)
            android.arch.lifecycle.LiveData$b r2 = (android.arch.lifecycle.LiveData.b) r2
            if (r2 == 0) goto L2b
            boolean r4 = r2.g(r3)
            if (r4 == 0) goto L23
            goto L2b
        L23:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Cannot add the same observer with different lifecycles"
            r2.<init>(r3)
            throw r2
        L2b:
            if (r2 == 0) goto L2e
            return
        L2e:
            android.arch.lifecycle.c r2 = r3.a()
            r2.a(r0)
            return
    }

    public void a(android.arch.lifecycle.k<T> r2) {
            r1 = this;
            java.lang.String r0 = "removeObserver"
            a(r0)
            b.a.a.b.b<android.arch.lifecycle.k<T>, android.arch.lifecycle.LiveData<T>$b> r1 = r1.f374b
            java.lang.Object r1 = r1.remove(r2)
            android.arch.lifecycle.LiveData$b r1 = (android.arch.lifecycle.LiveData.b) r1
            if (r1 != 0) goto L10
            return
        L10:
            r1.a()
            r2 = 0
            r1.a(r2)
            return
    }

    protected void a(T r2) {
            r1 = this;
            java.lang.String r0 = "setValue"
            a(r0)
            int r0 = r1.f
            int r0 = r0 + 1
            r1.f = r0
            r1.d = r2
            r2 = 0
            r1.b(r2)
            return
    }

    protected void b() {
            r0 = this;
            return
    }
}
