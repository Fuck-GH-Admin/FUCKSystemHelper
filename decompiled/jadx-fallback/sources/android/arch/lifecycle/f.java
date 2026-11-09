package android.arch.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public class f extends android.arch.lifecycle.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b.a.a.b.a<android.arch.lifecycle.d, android.arch.lifecycle.f.b> f392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.arch.lifecycle.c.b f393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.ref.WeakReference<android.arch.lifecycle.e> f394c;
    private int d;
    private boolean e;
    private boolean f;
    private java.util.ArrayList<android.arch.lifecycle.c.b> g;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f395a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f396b = null;

        static {
                android.arch.lifecycle.c$b[] r0 = android.arch.lifecycle.c.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                android.arch.lifecycle.f.a.f396b = r0
                r1 = 1
                android.arch.lifecycle.c$b r2 = android.arch.lifecycle.c.b.f391c     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = android.arch.lifecycle.f.a.f396b     // Catch: java.lang.NoSuchFieldError -> L1d
                android.arch.lifecycle.c$b r3 = android.arch.lifecycle.c.b.d     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                r2 = 3
                int[] r3 = android.arch.lifecycle.f.a.f396b     // Catch: java.lang.NoSuchFieldError -> L28
                android.arch.lifecycle.c$b r4 = android.arch.lifecycle.c.b.e     // Catch: java.lang.NoSuchFieldError -> L28
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                r3 = 4
                int[] r4 = android.arch.lifecycle.f.a.f396b     // Catch: java.lang.NoSuchFieldError -> L33
                android.arch.lifecycle.c$b r5 = android.arch.lifecycle.c.b.f     // Catch: java.lang.NoSuchFieldError -> L33
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r4[r5] = r3     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                r4 = 5
                int[] r5 = android.arch.lifecycle.f.a.f396b     // Catch: java.lang.NoSuchFieldError -> L3e
                android.arch.lifecycle.c$b r6 = android.arch.lifecycle.c.b.f390b     // Catch: java.lang.NoSuchFieldError -> L3e
                int r6 = r6.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r5[r6] = r4     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                android.arch.lifecycle.c$a[] r5 = android.arch.lifecycle.c.a.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                android.arch.lifecycle.f.a.f395a = r5
                android.arch.lifecycle.c$a r6 = android.arch.lifecycle.c.a.ON_CREATE     // Catch: java.lang.NoSuchFieldError -> L4f
                int r6 = r6.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4f
                r5[r6] = r1     // Catch: java.lang.NoSuchFieldError -> L4f
            L4f:
                int[] r1 = android.arch.lifecycle.f.a.f395a     // Catch: java.lang.NoSuchFieldError -> L59
                android.arch.lifecycle.c$a r5 = android.arch.lifecycle.c.a.ON_STOP     // Catch: java.lang.NoSuchFieldError -> L59
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r1[r5] = r0     // Catch: java.lang.NoSuchFieldError -> L59
            L59:
                int[] r0 = android.arch.lifecycle.f.a.f395a     // Catch: java.lang.NoSuchFieldError -> L63
                android.arch.lifecycle.c$a r1 = android.arch.lifecycle.c.a.ON_START     // Catch: java.lang.NoSuchFieldError -> L63
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L63
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L63
            L63:
                int[] r0 = android.arch.lifecycle.f.a.f395a     // Catch: java.lang.NoSuchFieldError -> L6d
                android.arch.lifecycle.c$a r1 = android.arch.lifecycle.c.a.ON_PAUSE     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r0[r1] = r3     // Catch: java.lang.NoSuchFieldError -> L6d
            L6d:
                int[] r0 = android.arch.lifecycle.f.a.f395a     // Catch: java.lang.NoSuchFieldError -> L77
                android.arch.lifecycle.c$a r1 = android.arch.lifecycle.c.a.ON_RESUME     // Catch: java.lang.NoSuchFieldError -> L77
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L77
                r0[r1] = r4     // Catch: java.lang.NoSuchFieldError -> L77
            L77:
                int[] r0 = android.arch.lifecycle.f.a.f395a     // Catch: java.lang.NoSuchFieldError -> L82
                android.arch.lifecycle.c$a r1 = android.arch.lifecycle.c.a.ON_DESTROY     // Catch: java.lang.NoSuchFieldError -> L82
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L82
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L82
            L82:
                int[] r0 = android.arch.lifecycle.f.a.f395a     // Catch: java.lang.NoSuchFieldError -> L8d
                android.arch.lifecycle.c$a r1 = android.arch.lifecycle.c.a.ON_ANY     // Catch: java.lang.NoSuchFieldError -> L8d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L8d
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L8d
            L8d:
                return
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        android.arch.lifecycle.c.b f397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        android.arch.lifecycle.GenericLifecycleObserver f398b;

        b(android.arch.lifecycle.d r1, android.arch.lifecycle.c.b r2) {
                r0 = this;
                r0.<init>()
                android.arch.lifecycle.GenericLifecycleObserver r1 = android.arch.lifecycle.h.a(r1)
                r0.f398b = r1
                r0.f397a = r2
                return
        }

        void a(android.arch.lifecycle.e r3, android.arch.lifecycle.c.a r4) {
                r2 = this;
                android.arch.lifecycle.c$b r0 = android.arch.lifecycle.f.b(r4)
                android.arch.lifecycle.c$b r1 = r2.f397a
                android.arch.lifecycle.c$b r1 = android.arch.lifecycle.f.a(r1, r0)
                r2.f397a = r1
                android.arch.lifecycle.GenericLifecycleObserver r1 = r2.f398b
                r1.a(r3, r4)
                r2.f397a = r0
                return
        }
    }

    public f(android.arch.lifecycle.e r2) {
            r1 = this;
            r1.<init>()
            b.a.a.b.a r0 = new b.a.a.b.a
            r0.<init>()
            r1.f392a = r0
            r0 = 0
            r1.d = r0
            r1.e = r0
            r1.f = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.g = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.f394c = r0
            android.arch.lifecycle.c$b r2 = android.arch.lifecycle.c.b.f391c
            r1.f393b = r2
            return
    }

    static android.arch.lifecycle.c.b a(android.arch.lifecycle.c.b r1, android.arch.lifecycle.c.b r2) {
            if (r2 == 0) goto L9
            int r0 = r2.compareTo(r1)
            if (r0 >= 0) goto L9
            r1 = r2
        L9:
            return r1
    }

    private void a(android.arch.lifecycle.e r6) {
            r5 = this;
            b.a.a.b.a<android.arch.lifecycle.d, android.arch.lifecycle.f$b> r0 = r5.f392a
            java.util.Iterator r0 = r0.a()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4a
            boolean r1 = r5.f
            if (r1 != 0) goto L4a
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            android.arch.lifecycle.f$b r2 = (android.arch.lifecycle.f.b) r2
        L1c:
            android.arch.lifecycle.c$b r3 = r2.f397a
            android.arch.lifecycle.c$b r4 = r5.f393b
            int r3 = r3.compareTo(r4)
            if (r3 <= 0) goto L6
            boolean r3 = r5.f
            if (r3 != 0) goto L6
            b.a.a.b.a<android.arch.lifecycle.d, android.arch.lifecycle.f$b> r3 = r5.f392a
            java.lang.Object r4 = r1.getKey()
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L6
            android.arch.lifecycle.c$b r3 = r2.f397a
            android.arch.lifecycle.c$a r3 = b(r3)
            android.arch.lifecycle.c$b r4 = b(r3)
            r5.d(r4)
            r2.a(r6, r3)
            r5.c()
            goto L1c
        L4a:
            return
    }

    private static android.arch.lifecycle.c.a b(android.arch.lifecycle.c.b r3) {
            int[] r0 = android.arch.lifecycle.f.a.f396b
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L3d
            r1 = 2
            if (r0 == r1) goto L3a
            r1 = 3
            if (r0 == r1) goto L37
            r1 = 4
            if (r0 == r1) goto L34
            r1 = 5
            if (r0 == r1) goto L2e
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected state value "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L2e:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
        L34:
            android.arch.lifecycle.c$a r3 = android.arch.lifecycle.c.a.ON_PAUSE
            return r3
        L37:
            android.arch.lifecycle.c$a r3 = android.arch.lifecycle.c.a.ON_STOP
            return r3
        L3a:
            android.arch.lifecycle.c$a r3 = android.arch.lifecycle.c.a.ON_DESTROY
            return r3
        L3d:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
    }

    static android.arch.lifecycle.c.b b(android.arch.lifecycle.c.a r3) {
            int[] r0 = android.arch.lifecycle.f.a.f395a
            int r1 = r3.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L2b;
                case 2: goto L2b;
                case 3: goto L28;
                case 4: goto L28;
                case 5: goto L25;
                case 6: goto L22;
                default: goto Lb;
            }
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected event value "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L22:
            android.arch.lifecycle.c$b r3 = android.arch.lifecycle.c.b.f390b
            return r3
        L25:
            android.arch.lifecycle.c$b r3 = android.arch.lifecycle.c.b.f
            return r3
        L28:
            android.arch.lifecycle.c$b r3 = android.arch.lifecycle.c.b.e
            return r3
        L2b:
            android.arch.lifecycle.c$b r3 = android.arch.lifecycle.c.b.d
            return r3
    }

    private void b(android.arch.lifecycle.e r6) {
            r5 = this;
            b.a.a.b.a<android.arch.lifecycle.d, android.arch.lifecycle.f$b> r0 = r5.f392a
            b.a.a.b.b$e r0 = r0.c()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L48
            boolean r1 = r5.f
            if (r1 != 0) goto L48
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            android.arch.lifecycle.f$b r2 = (android.arch.lifecycle.f.b) r2
        L1c:
            android.arch.lifecycle.c$b r3 = r2.f397a
            android.arch.lifecycle.c$b r4 = r5.f393b
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L6
            boolean r3 = r5.f
            if (r3 != 0) goto L6
            b.a.a.b.a<android.arch.lifecycle.d, android.arch.lifecycle.f$b> r3 = r5.f392a
            java.lang.Object r4 = r1.getKey()
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L6
            android.arch.lifecycle.c$b r3 = r2.f397a
            r5.d(r3)
            android.arch.lifecycle.c$b r3 = r2.f397a
            android.arch.lifecycle.c$a r3 = e(r3)
            r2.a(r6, r3)
            r5.c()
            goto L1c
        L48:
            return
    }

    private boolean b() {
            r3 = this;
            b.a.a.b.a<android.arch.lifecycle.d, android.arch.lifecycle.f$b> r0 = r3.f392a
            int r0 = r0.size()
            r1 = 1
            if (r0 != 0) goto La
            return r1
        La:
            b.a.a.b.a<android.arch.lifecycle.d, android.arch.lifecycle.f$b> r0 = r3.f392a
            java.util.Map$Entry r0 = r0.b()
            java.lang.Object r0 = r0.getValue()
            android.arch.lifecycle.f$b r0 = (android.arch.lifecycle.f.b) r0
            android.arch.lifecycle.c$b r0 = r0.f397a
            b.a.a.b.a<android.arch.lifecycle.d, android.arch.lifecycle.f$b> r2 = r3.f392a
            java.util.Map$Entry r2 = r2.d()
            java.lang.Object r2 = r2.getValue()
            android.arch.lifecycle.f$b r2 = (android.arch.lifecycle.f.b) r2
            android.arch.lifecycle.c$b r2 = r2.f397a
            if (r0 != r2) goto L2d
            android.arch.lifecycle.c$b r3 = r3.f393b
            if (r3 != r2) goto L2d
            goto L2e
        L2d:
            r1 = 0
        L2e:
            return r1
    }

    private android.arch.lifecycle.c.b c(android.arch.lifecycle.d r3) {
            r2 = this;
            b.a.a.b.a<android.arch.lifecycle.d, android.arch.lifecycle.f$b> r0 = r2.f392a
            java.util.Map$Entry r3 = r0.b(r3)
            r0 = 0
            if (r3 == 0) goto L12
            java.lang.Object r3 = r3.getValue()
            android.arch.lifecycle.f$b r3 = (android.arch.lifecycle.f.b) r3
            android.arch.lifecycle.c$b r3 = r3.f397a
            goto L13
        L12:
            r3 = r0
        L13:
            java.util.ArrayList<android.arch.lifecycle.c$b> r1 = r2.g
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L29
            java.util.ArrayList<android.arch.lifecycle.c$b> r0 = r2.g
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            android.arch.lifecycle.c$b r0 = (android.arch.lifecycle.c.b) r0
        L29:
            android.arch.lifecycle.c$b r2 = r2.f393b
            android.arch.lifecycle.c$b r2 = a(r2, r3)
            android.arch.lifecycle.c$b r2 = a(r2, r0)
            return r2
    }

    private void c() {
            r1 = this;
            java.util.ArrayList<android.arch.lifecycle.c$b> r1 = r1.g
            int r0 = r1.size()
            int r0 = r0 + (-1)
            r1.remove(r0)
            return
    }

    private void c(android.arch.lifecycle.c.b r2) {
            r1 = this;
            android.arch.lifecycle.c$b r0 = r1.f393b
            if (r0 != r2) goto L5
            return
        L5:
            r1.f393b = r2
            boolean r2 = r1.e
            r0 = 1
            if (r2 != 0) goto L1a
            int r2 = r1.d
            if (r2 == 0) goto L11
            goto L1a
        L11:
            r1.e = r0
            r1.d()
            r2 = 0
            r1.e = r2
            return
        L1a:
            r1.f = r0
            return
    }

    private void d() {
            r3 = this;
            java.lang.ref.WeakReference<android.arch.lifecycle.e> r0 = r3.f394c
            java.lang.Object r0 = r0.get()
            android.arch.lifecycle.e r0 = (android.arch.lifecycle.e) r0
            if (r0 != 0) goto L12
            java.lang.String r3 = "LifecycleRegistry"
            java.lang.String r0 = "LifecycleOwner is garbage collected, you shouldn't try dispatch new events from it."
            android.util.Log.w(r3, r0)
            return
        L12:
            boolean r1 = r3.b()
            r2 = 0
            r3.f = r2
            if (r1 != 0) goto L54
            android.arch.lifecycle.c$b r1 = r3.f393b
            b.a.a.b.a<android.arch.lifecycle.d, android.arch.lifecycle.f$b> r2 = r3.f392a
            java.util.Map$Entry r2 = r2.b()
            java.lang.Object r2 = r2.getValue()
            android.arch.lifecycle.f$b r2 = (android.arch.lifecycle.f.b) r2
            android.arch.lifecycle.c$b r2 = r2.f397a
            int r1 = r1.compareTo(r2)
            if (r1 >= 0) goto L34
            r3.a(r0)
        L34:
            b.a.a.b.a<android.arch.lifecycle.d, android.arch.lifecycle.f$b> r1 = r3.f392a
            java.util.Map$Entry r1 = r1.d()
            boolean r2 = r3.f
            if (r2 != 0) goto L12
            if (r1 == 0) goto L12
            android.arch.lifecycle.c$b r2 = r3.f393b
            java.lang.Object r1 = r1.getValue()
            android.arch.lifecycle.f$b r1 = (android.arch.lifecycle.f.b) r1
            android.arch.lifecycle.c$b r1 = r1.f397a
            int r1 = r2.compareTo(r1)
            if (r1 <= 0) goto L12
            r3.b(r0)
            goto L12
        L54:
            return
    }

    private void d(android.arch.lifecycle.c.b r1) {
            r0 = this;
            java.util.ArrayList<android.arch.lifecycle.c$b> r0 = r0.g
            r0.add(r1)
            return
    }

    private static android.arch.lifecycle.c.a e(android.arch.lifecycle.c.b r3) {
            int[] r0 = android.arch.lifecycle.f.a.f396b
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L3b
            r1 = 2
            if (r0 == r1) goto L38
            r1 = 3
            if (r0 == r1) goto L35
            r1 = 4
            if (r0 == r1) goto L2f
            r1 = 5
            if (r0 != r1) goto L18
            goto L3b
        L18:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected state value "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L2f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
        L35:
            android.arch.lifecycle.c$a r3 = android.arch.lifecycle.c.a.ON_RESUME
            return r3
        L38:
            android.arch.lifecycle.c$a r3 = android.arch.lifecycle.c.a.ON_START
            return r3
        L3b:
            android.arch.lifecycle.c$a r3 = android.arch.lifecycle.c.a.ON_CREATE
            return r3
    }

    @Override // android.arch.lifecycle.c
    public android.arch.lifecycle.c.b a() {
            r0 = this;
            android.arch.lifecycle.c$b r0 = r0.f393b
            return r0
    }

    public void a(android.arch.lifecycle.c.a r1) {
            r0 = this;
            android.arch.lifecycle.c$b r1 = b(r1)
            r0.c(r1)
            return
    }

    public void a(android.arch.lifecycle.c.b r1) {
            r0 = this;
            r0.c(r1)
            return
    }

    @Override // android.arch.lifecycle.c
    public void a(android.arch.lifecycle.d r7) {
            r6 = this;
            android.arch.lifecycle.c$b r0 = r6.f393b
            android.arch.lifecycle.c$b r1 = android.arch.lifecycle.c.b.f390b
            if (r0 != r1) goto L7
            goto L9
        L7:
            android.arch.lifecycle.c$b r1 = android.arch.lifecycle.c.b.f391c
        L9:
            android.arch.lifecycle.f$b r0 = new android.arch.lifecycle.f$b
            r0.<init>(r7, r1)
            b.a.a.b.a<android.arch.lifecycle.d, android.arch.lifecycle.f$b> r1 = r6.f392a
            java.lang.Object r1 = r1.b(r7, r0)
            android.arch.lifecycle.f$b r1 = (android.arch.lifecycle.f.b) r1
            if (r1 == 0) goto L19
            return
        L19:
            java.lang.ref.WeakReference<android.arch.lifecycle.e> r1 = r6.f394c
            java.lang.Object r1 = r1.get()
            android.arch.lifecycle.e r1 = (android.arch.lifecycle.e) r1
            if (r1 != 0) goto L24
            return
        L24:
            int r2 = r6.d
            r3 = 1
            if (r2 != 0) goto L30
            boolean r2 = r6.e
            if (r2 == 0) goto L2e
            goto L30
        L2e:
            r2 = 0
            goto L31
        L30:
            r2 = r3
        L31:
            android.arch.lifecycle.c$b r4 = r6.c(r7)
            int r5 = r6.d
            int r5 = r5 + r3
            r6.d = r5
        L3a:
            android.arch.lifecycle.c$b r5 = r0.f397a
            int r4 = r5.compareTo(r4)
            if (r4 >= 0) goto L60
            b.a.a.b.a<android.arch.lifecycle.d, android.arch.lifecycle.f$b> r4 = r6.f392a
            boolean r4 = r4.contains(r7)
            if (r4 == 0) goto L60
            android.arch.lifecycle.c$b r4 = r0.f397a
            r6.d(r4)
            android.arch.lifecycle.c$b r4 = r0.f397a
            android.arch.lifecycle.c$a r4 = e(r4)
            r0.a(r1, r4)
            r6.c()
            android.arch.lifecycle.c$b r4 = r6.c(r7)
            goto L3a
        L60:
            if (r2 != 0) goto L65
            r6.d()
        L65:
            int r7 = r6.d
            int r7 = r7 - r3
            r6.d = r7
            return
    }

    @Override // android.arch.lifecycle.c
    public void b(android.arch.lifecycle.d r1) {
            r0 = this;
            b.a.a.b.a<android.arch.lifecycle.d, android.arch.lifecycle.f$b> r0 = r0.f392a
            r0.remove(r1)
            return
    }
}
