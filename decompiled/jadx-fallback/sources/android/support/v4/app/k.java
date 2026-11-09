package android.support.v4.app;

/* JADX INFO: loaded from: classes.dex */
final class k extends android.support.v4.app.j implements android.view.LayoutInflater.Factory2 {
    static boolean F = false;
    static java.lang.reflect.Field G;
    static final android.view.animation.Interpolator H = null;
    static final android.view.animation.Interpolator I = null;
    android.os.Bundle A;
    android.util.SparseArray<android.os.Parcelable> B;
    java.util.ArrayList<android.support.v4.app.k.m> C;
    android.support.v4.app.l D;
    java.lang.Runnable E;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    java.util.ArrayList<android.support.v4.app.k.l> f560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f561c;
    int d;
    final java.util.ArrayList<android.support.v4.app.e> e;
    android.util.SparseArray<android.support.v4.app.e> f;
    java.util.ArrayList<android.support.v4.app.c> g;
    java.util.ArrayList<android.support.v4.app.e> h;
    java.util.ArrayList<android.support.v4.app.c> i;
    java.util.ArrayList<java.lang.Integer> j;
    java.util.ArrayList<android.support.v4.app.j.b> k;
    private final java.util.concurrent.CopyOnWriteArrayList<android.support.v4.app.k.j> l;
    int m;
    android.support.v4.app.i n;
    android.support.v4.app.g o;
    android.support.v4.app.e p;
    android.support.v4.app.e q;
    boolean r;
    boolean s;
    boolean t;
    boolean u;
    java.lang.String v;
    boolean w;
    java.util.ArrayList<android.support.v4.app.c> x;
    java.util.ArrayList<java.lang.Boolean> y;
    java.util.ArrayList<android.support.v4.app.e> z;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.support.v4.app.k f562b;

        a(android.support.v4.app.k r1) {
                r0 = this;
                r0.f562b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r0 = this;
                android.support.v4.app.k r0 = r0.f562b
                r0.n()
                return
        }
    }

    class b extends android.support.v4.app.k.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.view.ViewGroup f563b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.support.v4.app.e f564c;
        final /* synthetic */ android.support.v4.app.k d;

        class a implements java.lang.Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.support.v4.app.k.b f565b;

            a(android.support.v4.app.k.b r1) {
                    r0 = this;
                    r0.f565b = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r6 = this;
                    android.support.v4.app.k$b r0 = r6.f565b
                    android.support.v4.app.e r0 = r0.f564c
                    android.view.View r0 = r0.g()
                    if (r0 == 0) goto L22
                    android.support.v4.app.k$b r0 = r6.f565b
                    android.support.v4.app.e r0 = r0.f564c
                    r1 = 0
                    r0.a(r1)
                    android.support.v4.app.k$b r6 = r6.f565b
                    android.support.v4.app.k r0 = r6.d
                    android.support.v4.app.e r1 = r6.f564c
                    int r2 = r1.x()
                    r3 = 0
                    r4 = 0
                    r5 = 0
                    r0.a(r1, r2, r3, r4, r5)
                L22:
                    return
            }
        }

        b(android.support.v4.app.k r1, android.view.animation.Animation.AnimationListener r2, android.view.ViewGroup r3, android.support.v4.app.e r4) {
                r0 = this;
                r0.d = r1
                r0.f563b = r3
                r0.f564c = r4
                r0.<init>(r2)
                return
        }

        @Override // android.support.v4.app.k.f, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(android.view.animation.Animation r2) {
                r1 = this;
                super.onAnimationEnd(r2)
                android.view.ViewGroup r2 = r1.f563b
                android.support.v4.app.k$b$a r0 = new android.support.v4.app.k$b$a
                r0.<init>(r1)
                r2.post(r0)
                return
        }
    }

    class c extends android.animation.AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.view.ViewGroup f566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.view.View f567b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.support.v4.app.e f568c;
        final /* synthetic */ android.support.v4.app.k d;

        c(android.support.v4.app.k r1, android.view.ViewGroup r2, android.view.View r3, android.support.v4.app.e r4) {
                r0 = this;
                r0.d = r1
                r0.f566a = r2
                r0.f567b = r3
                r0.f568c = r4
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r7) {
                r6 = this;
                android.view.ViewGroup r7 = r6.f566a
                android.view.View r0 = r6.f567b
                r7.endViewTransition(r0)
                android.support.v4.app.e r7 = r6.f568c
                android.animation.Animator r7 = r7.h()
                android.support.v4.app.e r0 = r6.f568c
                r1 = 0
                r0.a(r1)
                if (r7 == 0) goto L2d
                android.view.ViewGroup r7 = r6.f566a
                android.view.View r0 = r6.f567b
                int r7 = r7.indexOfChild(r0)
                if (r7 >= 0) goto L2d
                android.support.v4.app.k r0 = r6.d
                android.support.v4.app.e r1 = r6.f568c
                int r2 = r1.x()
                r3 = 0
                r4 = 0
                r5 = 0
                r0.a(r1, r2, r3, r4, r5)
            L2d:
                return
        }
    }

    class d extends android.animation.AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.view.ViewGroup f569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.view.View f570b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.support.v4.app.e f571c;

        d(android.support.v4.app.k r1, android.view.ViewGroup r2, android.view.View r3, android.support.v4.app.e r4) {
                r0 = this;
                r0.f569a = r2
                r0.f570b = r3
                r0.f571c = r4
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r3) {
                r2 = this;
                android.view.ViewGroup r0 = r2.f569a
                android.view.View r1 = r2.f570b
                r0.endViewTransition(r1)
                r3.removeListener(r2)
                android.support.v4.app.e r2 = r2.f571c
                android.view.View r2 = r2.J
                if (r2 == 0) goto L15
                r3 = 8
                r2.setVisibility(r3)
            L15:
                return
        }
    }

    private static class e extends android.support.v4.app.k.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        android.view.View f572b;

        class a implements java.lang.Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.support.v4.app.k.e f573b;

            a(android.support.v4.app.k.e r1) {
                    r0 = this;
                    r0.f573b = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    android.support.v4.app.k$e r2 = r2.f573b
                    android.view.View r2 = r2.f572b
                    r0 = 0
                    r1 = 0
                    r2.setLayerType(r0, r1)
                    return
            }
        }

        e(android.view.View r1, android.view.animation.Animation.AnimationListener r2) {
                r0 = this;
                r0.<init>(r2)
                r0.f572b = r1
                return
        }

        @Override // android.support.v4.app.k.f, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(android.view.animation.Animation r4) {
                r3 = this;
                android.view.View r0 = r3.f572b
                boolean r0 = b.b.c.g.q.j(r0)
                if (r0 != 0) goto L17
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 24
                if (r0 < r1) goto Lf
                goto L17
            Lf:
                android.view.View r0 = r3.f572b
                r1 = 0
                r2 = 0
                r0.setLayerType(r1, r2)
                goto L21
            L17:
                android.view.View r0 = r3.f572b
                android.support.v4.app.k$e$a r1 = new android.support.v4.app.k$e$a
                r1.<init>(r3)
                r0.post(r1)
            L21:
                super.onAnimationEnd(r4)
                return
        }
    }

    private static class f implements android.view.animation.Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.view.animation.Animation.AnimationListener f574a;

        f(android.view.animation.Animation.AnimationListener r1) {
                r0 = this;
                r0.<init>()
                r0.f574a = r1
                return
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(android.view.animation.Animation r1) {
                r0 = this;
                android.view.animation.Animation$AnimationListener r0 = r0.f574a
                if (r0 == 0) goto L7
                r0.onAnimationEnd(r1)
            L7:
                return
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(android.view.animation.Animation r1) {
                r0 = this;
                android.view.animation.Animation$AnimationListener r0 = r0.f574a
                if (r0 == 0) goto L7
                r0.onAnimationRepeat(r1)
            L7:
                return
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(android.view.animation.Animation r1) {
                r0 = this;
                android.view.animation.Animation$AnimationListener r0 = r0.f574a
                if (r0 == 0) goto L7
                r0.onAnimationStart(r1)
            L7:
                return
        }
    }

    private static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.view.animation.Animation f575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final android.animation.Animator f576b;

        g(android.animation.Animator r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f575a = r0
                r1.f576b = r2
                if (r2 == 0) goto Lb
                return
            Lb:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "Animator cannot be null"
                r1.<init>(r2)
                throw r1
        }

        g(android.view.animation.Animation r2) {
                r1 = this;
                r1.<init>()
                r1.f575a = r2
                r0 = 0
                r1.f576b = r0
                if (r2 == 0) goto Lb
                return
            Lb:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "Animation cannot be null"
                r1.<init>(r2)
                throw r1
        }
    }

    private static class h extends android.animation.AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        android.view.View f577a;

        h(android.view.View r1) {
                r0 = this;
                r0.<init>()
                r0.f577a = r1
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r4) {
                r3 = this;
                android.view.View r0 = r3.f577a
                r1 = 0
                r2 = 0
                r0.setLayerType(r1, r2)
                r4.removeListener(r3)
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r2) {
                r1 = this;
                android.view.View r1 = r1.f577a
                r2 = 2
                r0 = 0
                r1.setLayerType(r2, r0)
                return
        }
    }

    private static class i extends android.view.animation.AnimationSet implements java.lang.Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final android.view.ViewGroup f578b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final android.view.View f579c;
        private boolean d;
        private boolean e;
        private boolean f;

        i(android.view.animation.Animation r2, android.view.ViewGroup r3, android.view.View r4) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r0 = 1
                r1.f = r0
                r1.f578b = r3
                r1.f579c = r4
                r1.addAnimation(r2)
                android.view.ViewGroup r2 = r1.f578b
                r2.post(r1)
                return
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long r3, android.view.animation.Transformation r5) {
                r2 = this;
                r0 = 1
                r2.f = r0
                boolean r1 = r2.d
                if (r1 == 0) goto Lb
                boolean r2 = r2.e
                r2 = r2 ^ r0
                return r2
            Lb:
                boolean r3 = super.getTransformation(r3, r5)
                if (r3 != 0) goto L18
                r2.d = r0
                android.view.ViewGroup r3 = r2.f578b
                android.support.v4.app.u.a(r3, r2)
            L18:
                return r0
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long r3, android.view.animation.Transformation r5, float r6) {
                r2 = this;
                r0 = 1
                r2.f = r0
                boolean r1 = r2.d
                if (r1 == 0) goto Lb
                boolean r2 = r2.e
                r2 = r2 ^ r0
                return r2
            Lb:
                boolean r3 = super.getTransformation(r3, r5, r6)
                if (r3 != 0) goto L18
                r2.d = r0
                android.view.ViewGroup r3 = r2.f578b
                android.support.v4.app.u.a(r3, r2)
            L18:
                return r0
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                boolean r0 = r2.d
                if (r0 != 0) goto L11
                boolean r0 = r2.f
                if (r0 == 0) goto L11
                r0 = 0
                r2.f = r0
                android.view.ViewGroup r0 = r2.f578b
                r0.post(r2)
                goto L1b
            L11:
                android.view.ViewGroup r0 = r2.f578b
                android.view.View r1 = r2.f579c
                r0.endViewTransition(r1)
                r0 = 1
                r2.e = r0
            L1b:
                return
        }
    }

    private static final class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final android.support.v4.app.j.a f580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean f581b;
    }

    /* JADX INFO: renamed from: android.support.v4.app.k$k, reason: collision with other inner class name */
    static class C0028k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f582a = null;

        static {
                r0 = 3
                int[] r0 = new int[r0]
                r0 = {x000a: FILL_ARRAY_DATA , data: [16842755, 16842960, 16842961} // fill-array
                android.support.v4.app.k.C0028k.f582a = r0
                return
        }
    }

    interface l {
        boolean a(java.util.ArrayList<android.support.v4.app.c> r1, java.util.ArrayList<java.lang.Boolean> r2);
    }

    static class m implements android.support.v4.app.e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final android.support.v4.app.c f584b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f585c;

        m(android.support.v4.app.c r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.f583a = r2
                r0.f584b = r1
                return
        }

        @Override // android.support.v4.app.e.f
        public void a() {
                r1 = this;
                int r0 = r1.f585c
                int r0 = r0 + (-1)
                r1.f585c = r0
                if (r0 == 0) goto L9
                return
            L9:
                android.support.v4.app.c r1 = r1.f584b
                android.support.v4.app.k r1 = r1.f536a
                r1.v()
                return
        }

        @Override // android.support.v4.app.e.f
        public void b() {
                r1 = this;
                int r0 = r1.f585c
                int r0 = r0 + 1
                r1.f585c = r0
                return
        }

        public void c() {
                r3 = this;
                android.support.v4.app.c r0 = r3.f584b
                android.support.v4.app.k r1 = r0.f536a
                boolean r3 = r3.f583a
                r2 = 0
                r1.a(r0, r3, r2, r2)
                return
        }

        public void d() {
                r7 = this;
                int r0 = r7.f585c
                r1 = 0
                r2 = 1
                if (r0 <= 0) goto L8
                r0 = r2
                goto L9
            L8:
                r0 = r1
            L9:
                android.support.v4.app.c r3 = r7.f584b
                android.support.v4.app.k r3 = r3.f536a
                java.util.ArrayList<android.support.v4.app.e> r4 = r3.e
                int r4 = r4.size()
            L13:
                if (r1 >= r4) goto L2f
                java.util.ArrayList<android.support.v4.app.e> r5 = r3.e
                java.lang.Object r5 = r5.get(r1)
                android.support.v4.app.e r5 = (android.support.v4.app.e) r5
                r6 = 0
                r5.a(r6)
                if (r0 == 0) goto L2c
                boolean r6 = r5.D()
                if (r6 == 0) goto L2c
                r5.Y()
            L2c:
                int r1 = r1 + 1
                goto L13
            L2f:
                android.support.v4.app.c r1 = r7.f584b
                android.support.v4.app.k r3 = r1.f536a
                boolean r7 = r7.f583a
                r0 = r0 ^ r2
                r3.a(r1, r7, r0, r2)
                return
        }

        public boolean e() {
                r0 = this;
                int r0 = r0.f585c
                if (r0 != 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }
    }

    static {
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r1 = 1075838976(0x40200000, float:2.5)
            r0.<init>(r1)
            android.support.v4.app.k.H = r0
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r2 = 1069547520(0x3fc00000, float:1.5)
            r0.<init>(r2)
            android.support.v4.app.k.I = r0
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>(r1)
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>(r2)
            return
    }

    k() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.d = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.e = r1
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r2.l = r1
            r2.m = r0
            r0 = 0
            r2.A = r0
            r2.B = r0
            android.support.v4.app.k$a r0 = new android.support.v4.app.k$a
            r0.<init>(r2)
            r2.E = r0
            return
    }

    private void A() {
            r9 = this;
            android.util.SparseArray<android.support.v4.app.e> r0 = r9.f
            r1 = 0
            if (r0 != 0) goto L7
            r0 = r1
            goto Lb
        L7:
            int r0 = r0.size()
        Lb:
            if (r1 >= r0) goto L4e
            android.util.SparseArray<android.support.v4.app.e> r2 = r9.f
            java.lang.Object r2 = r2.valueAt(r1)
            r4 = r2
            android.support.v4.app.e r4 = (android.support.v4.app.e) r4
            if (r4 == 0) goto L4b
            android.view.View r2 = r4.g()
            if (r2 == 0) goto L3e
            int r5 = r4.x()
            android.view.View r2 = r4.g()
            android.view.animation.Animation r3 = r2.getAnimation()
            if (r3 == 0) goto L32
            r3.cancel()
            r2.clearAnimation()
        L32:
            r2 = 0
            r4.a(r2)
            r6 = 0
            r7 = 0
            r8 = 0
            r3 = r9
            r3.a(r4, r5, r6, r7, r8)
            goto L4b
        L3e:
            android.animation.Animator r2 = r4.h()
            if (r2 == 0) goto L4b
            android.animation.Animator r2 = r4.h()
            r2.end()
        L4b:
            int r1 = r1 + 1
            goto Lb
        L4e:
            return
    }

    private void B() {
            r2 = this;
            java.util.ArrayList<android.support.v4.app.k$m> r0 = r2.C
            if (r0 == 0) goto L19
        L4:
            java.util.ArrayList<android.support.v4.app.k$m> r0 = r2.C
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L19
            java.util.ArrayList<android.support.v4.app.k$m> r0 = r2.C
            r1 = 0
            java.lang.Object r0 = r0.remove(r1)
            android.support.v4.app.k$m r0 = (android.support.v4.app.k.m) r0
            r0.d()
            goto L4
        L19:
            return
    }

    private int a(java.util.ArrayList<android.support.v4.app.c> r8, java.util.ArrayList<java.lang.Boolean> r9, int r10, int r11, b.b.c.f.b<android.support.v4.app.e> r12) {
            r7 = this;
            int r0 = r11 + (-1)
            r1 = r11
        L3:
            if (r0 < r10) goto L5a
            java.lang.Object r2 = r8.get(r0)
            android.support.v4.app.c r2 = (android.support.v4.app.c) r2
            java.lang.Object r3 = r9.get(r0)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            boolean r4 = r2.c()
            r5 = 0
            if (r4 == 0) goto L26
            int r4 = r0 + 1
            boolean r4 = r2.a(r8, r4, r11)
            if (r4 != 0) goto L26
            r4 = 1
            goto L27
        L26:
            r4 = r5
        L27:
            if (r4 == 0) goto L57
            java.util.ArrayList<android.support.v4.app.k$m> r4 = r7.C
            if (r4 != 0) goto L34
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r7.C = r4
        L34:
            android.support.v4.app.k$m r4 = new android.support.v4.app.k$m
            r4.<init>(r2, r3)
            java.util.ArrayList<android.support.v4.app.k$m> r6 = r7.C
            r6.add(r4)
            r2.a(r4)
            if (r3 == 0) goto L47
            r2.a()
            goto L4a
        L47:
            r2.a(r5)
        L4a:
            int r1 = r1 + (-1)
            if (r0 == r1) goto L54
            r8.remove(r0)
            r8.add(r1, r2)
        L54:
            r7.a(r12)
        L57:
            int r0 = r0 + (-1)
            goto L3
        L5a:
            return r1
    }

    static android.support.v4.app.k.g a(android.content.Context r0, float r1, float r2) {
            android.view.animation.AlphaAnimation r0 = new android.view.animation.AlphaAnimation
            r0.<init>(r1, r2)
            android.view.animation.Interpolator r1 = android.support.v4.app.k.I
            r0.setInterpolator(r1)
            r1 = 220(0xdc, double:1.087E-321)
            r0.setDuration(r1)
            android.support.v4.app.k$g r1 = new android.support.v4.app.k$g
            r1.<init>(r0)
            return r1
    }

    static android.support.v4.app.k.g a(android.content.Context r10, float r11, float r12, float r13, float r14) {
            android.view.animation.AnimationSet r10 = new android.view.animation.AnimationSet
            r0 = 0
            r10.<init>(r0)
            android.view.animation.ScaleAnimation r0 = new android.view.animation.ScaleAnimation
            r6 = 1
            r7 = 1056964608(0x3f000000, float:0.5)
            r8 = 1
            r9 = 1056964608(0x3f000000, float:0.5)
            r1 = r0
            r2 = r11
            r3 = r12
            r4 = r11
            r5 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            android.view.animation.Interpolator r11 = android.support.v4.app.k.H
            r0.setInterpolator(r11)
            r11 = 220(0xdc, double:1.087E-321)
            r0.setDuration(r11)
            r10.addAnimation(r0)
            android.view.animation.AlphaAnimation r0 = new android.view.animation.AlphaAnimation
            r0.<init>(r13, r14)
            android.view.animation.Interpolator r13 = android.support.v4.app.k.I
            r0.setInterpolator(r13)
            r0.setDuration(r11)
            r10.addAnimation(r0)
            android.support.v4.app.k$g r11 = new android.support.v4.app.k$g
            r11.<init>(r10)
            return r11
    }

    private static android.view.animation.Animation.AnimationListener a(android.view.animation.Animation r3) {
            java.lang.String r0 = "FragmentManager"
            java.lang.reflect.Field r1 = android.support.v4.app.k.G     // Catch: java.lang.IllegalAccessException -> L1d java.lang.NoSuchFieldException -> L21
            if (r1 != 0) goto L14
            java.lang.Class<android.view.animation.Animation> r1 = android.view.animation.Animation.class
            java.lang.String r2 = "mListener"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.IllegalAccessException -> L1d java.lang.NoSuchFieldException -> L21
            android.support.v4.app.k.G = r1     // Catch: java.lang.IllegalAccessException -> L1d java.lang.NoSuchFieldException -> L21
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.IllegalAccessException -> L1d java.lang.NoSuchFieldException -> L21
        L14:
            java.lang.reflect.Field r1 = android.support.v4.app.k.G     // Catch: java.lang.IllegalAccessException -> L1d java.lang.NoSuchFieldException -> L21
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.IllegalAccessException -> L1d java.lang.NoSuchFieldException -> L21
            android.view.animation.Animation$AnimationListener r3 = (android.view.animation.Animation.AnimationListener) r3     // Catch: java.lang.IllegalAccessException -> L1d java.lang.NoSuchFieldException -> L21
            goto L28
        L1d:
            r3 = move-exception
            java.lang.String r1 = "Cannot access Animation's mListener field"
            goto L24
        L21:
            r3 = move-exception
            java.lang.String r1 = "No field with the name mListener is found in Animation class"
        L24:
            android.util.Log.e(r0, r1, r3)
            r3 = 0
        L28:
            return r3
    }

    private void a(android.support.v4.app.e r5, android.support.v4.app.k.g r6, int r7) {
            r4 = this;
            android.view.View r0 = r5.J
            android.view.ViewGroup r1 = r5.I
            r1.startViewTransition(r0)
            r5.b(r7)
            android.view.animation.Animation r7 = r6.f575a
            if (r7 == 0) goto L2f
            android.support.v4.app.k$i r7 = new android.support.v4.app.k$i
            android.view.animation.Animation r2 = r6.f575a
            r7.<init>(r2, r1, r0)
            android.view.View r2 = r5.J
            r5.a(r2)
            android.view.animation.Animation$AnimationListener r2 = a(r7)
            android.support.v4.app.k$b r3 = new android.support.v4.app.k$b
            r3.<init>(r4, r2, r1, r5)
            r7.setAnimationListener(r3)
            a(r0, r6)
            android.view.View r4 = r5.J
            r4.startAnimation(r7)
            goto L49
        L2f:
            android.animation.Animator r7 = r6.f576b
            r5.a(r7)
            android.support.v4.app.k$c r2 = new android.support.v4.app.k$c
            r2.<init>(r4, r1, r0, r5)
            r7.addListener(r2)
            android.view.View r4 = r5.J
            r7.setTarget(r4)
            android.view.View r4 = r5.J
            a(r4, r6)
            r7.start()
        L49:
            return
    }

    private static void a(android.support.v4.app.l r3) {
            if (r3 != 0) goto L3
            return
        L3:
            java.util.List r0 = r3.b()
            if (r0 == 0) goto L1d
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            android.support.v4.app.e r1 = (android.support.v4.app.e) r1
            r2 = 1
            r1.E = r2
            goto Ld
        L1d:
            java.util.List r3 = r3.a()
            if (r3 == 0) goto L37
            java.util.Iterator r3 = r3.iterator()
        L27:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r0 = r3.next()
            android.support.v4.app.l r0 = (android.support.v4.app.l) r0
            a(r0)
            goto L27
        L37:
            return
    }

    private static void a(android.view.View r3, android.support.v4.app.k.g r4) {
            if (r3 == 0) goto L2d
            if (r4 != 0) goto L5
            goto L2d
        L5:
            boolean r0 = b(r3, r4)
            if (r0 == 0) goto L2d
            android.animation.Animator r0 = r4.f576b
            if (r0 == 0) goto L18
            android.support.v4.app.k$h r4 = new android.support.v4.app.k$h
            r4.<init>(r3)
            r0.addListener(r4)
            goto L2d
        L18:
            android.view.animation.Animation r0 = r4.f575a
            android.view.animation.Animation$AnimationListener r0 = a(r0)
            r1 = 2
            r2 = 0
            r3.setLayerType(r1, r2)
            android.view.animation.Animation r4 = r4.f575a
            android.support.v4.app.k$e r1 = new android.support.v4.app.k$e
            r1.<init>(r3, r0)
            r4.setAnimationListener(r1)
        L2d:
            return
    }

    private void a(b.b.c.f.b<android.support.v4.app.e> r11) {
            r10 = this;
            int r0 = r10.m
            r1 = 1
            if (r0 >= r1) goto L6
            return
        L6:
            r1 = 3
            int r0 = java.lang.Math.min(r0, r1)
            java.util.ArrayList<android.support.v4.app.e> r1 = r10.e
            int r1 = r1.size()
            r2 = 0
            r8 = r2
        L13:
            if (r8 >= r1) goto L43
            java.util.ArrayList<android.support.v4.app.e> r2 = r10.e
            java.lang.Object r2 = r2.get(r8)
            r9 = r2
            android.support.v4.app.e r9 = (android.support.v4.app.e) r9
            int r2 = r9.f544b
            if (r2 >= r0) goto L40
            int r5 = r9.p()
            int r6 = r9.q()
            r7 = 0
            r2 = r10
            r3 = r9
            r4 = r0
            r2.a(r3, r4, r5, r6, r7)
            android.view.View r2 = r9.J
            if (r2 == 0) goto L40
            boolean r2 = r9.B
            if (r2 != 0) goto L40
            boolean r2 = r9.O
            if (r2 == 0) goto L40
            r11.add(r9)
        L40:
            int r8 = r8 + 1
            goto L13
        L43:
            return
    }

    private void a(java.lang.RuntimeException r8) {
            r7 = this;
            java.lang.String r0 = r8.getMessage()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.e(r1, r0)
            java.lang.String r0 = "Activity state:"
            android.util.Log.e(r1, r0)
            b.b.c.f.e r0 = new b.b.c.f.e
            r0.<init>(r1)
            java.io.PrintWriter r2 = new java.io.PrintWriter
            r2.<init>(r0)
            android.support.v4.app.i r0 = r7.n
            java.lang.String r3 = "Failed dumping state"
            r4 = 0
            r5 = 0
            java.lang.String r6 = "  "
            if (r0 == 0) goto L28
            java.lang.String[] r7 = new java.lang.String[r4]     // Catch: java.lang.Exception -> L2e
            r0.a(r6, r5, r2, r7)     // Catch: java.lang.Exception -> L2e
            goto L32
        L28:
            java.lang.String[] r0 = new java.lang.String[r4]     // Catch: java.lang.Exception -> L2e
            r7.a(r6, r5, r2, r0)     // Catch: java.lang.Exception -> L2e
            goto L32
        L2e:
            r7 = move-exception
            android.util.Log.e(r1, r3, r7)
        L32:
            throw r8
    }

    private void a(java.util.ArrayList<android.support.v4.app.c> r8, java.util.ArrayList<java.lang.Boolean> r9) {
            r7 = this;
            java.util.ArrayList<android.support.v4.app.k$m> r0 = r7.C
            r1 = 0
            if (r0 != 0) goto L7
            r0 = r1
            goto Lb
        L7:
            int r0 = r0.size()
        Lb:
            r2 = r1
        Lc:
            if (r2 >= r0) goto L73
            java.util.ArrayList<android.support.v4.app.k$m> r3 = r7.C
            java.lang.Object r3 = r3.get(r2)
            android.support.v4.app.k$m r3 = (android.support.v4.app.k.m) r3
            r4 = -1
            if (r8 == 0) goto L35
            boolean r5 = r3.f583a
            if (r5 != 0) goto L35
            android.support.v4.app.c r5 = r3.f584b
            int r5 = r8.indexOf(r5)
            if (r5 == r4) goto L35
            java.lang.Object r5 = r9.get(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L35
        L31:
            r3.c()
            goto L70
        L35:
            boolean r5 = r3.e()
            if (r5 != 0) goto L49
            if (r8 == 0) goto L70
            android.support.v4.app.c r5 = r3.f584b
            int r6 = r8.size()
            boolean r5 = r5.a(r8, r1, r6)
            if (r5 == 0) goto L70
        L49:
            java.util.ArrayList<android.support.v4.app.k$m> r5 = r7.C
            r5.remove(r2)
            int r2 = r2 + (-1)
            int r0 = r0 + (-1)
            if (r8 == 0) goto L6d
            boolean r5 = r3.f583a
            if (r5 != 0) goto L6d
            android.support.v4.app.c r5 = r3.f584b
            int r5 = r8.indexOf(r5)
            if (r5 == r4) goto L6d
            java.lang.Object r4 = r9.get(r5)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L6d
            goto L31
        L6d:
            r3.d()
        L70:
            int r2 = r2 + 1
            goto Lc
        L73:
            return
    }

    private static void a(java.util.ArrayList<android.support.v4.app.c> r3, java.util.ArrayList<java.lang.Boolean> r4, int r5, int r6) {
        L0:
            if (r5 >= r6) goto L2c
            java.lang.Object r0 = r3.get(r5)
            android.support.v4.app.c r0 = (android.support.v4.app.c) r0
            java.lang.Object r1 = r4.get(r5)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 1
            if (r1 == 0) goto L23
            r1 = -1
            r0.a(r1)
            int r1 = r6 + (-1)
            if (r5 != r1) goto L1e
            goto L1f
        L1e:
            r2 = 0
        L1f:
            r0.a(r2)
            goto L29
        L23:
            r0.a(r2)
            r0.a()
        L29:
            int r5 = r5 + 1
            goto L0
        L2c:
            return
    }

    static boolean a(android.animation.Animator r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof android.animation.ValueAnimator
            r2 = 1
            if (r1 == 0) goto L25
            android.animation.ValueAnimator r5 = (android.animation.ValueAnimator) r5
            android.animation.PropertyValuesHolder[] r5 = r5.getValues()
            r1 = r0
        L10:
            int r3 = r5.length
            if (r1 >= r3) goto L46
            r3 = r5[r1]
            java.lang.String r3 = r3.getPropertyName()
            java.lang.String r4 = "alpha"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L22
            return r2
        L22:
            int r1 = r1 + 1
            goto L10
        L25:
            boolean r1 = r5 instanceof android.animation.AnimatorSet
            if (r1 == 0) goto L46
            android.animation.AnimatorSet r5 = (android.animation.AnimatorSet) r5
            java.util.ArrayList r5 = r5.getChildAnimations()
            r1 = r0
        L30:
            int r3 = r5.size()
            if (r1 >= r3) goto L46
            java.lang.Object r3 = r5.get(r1)
            android.animation.Animator r3 = (android.animation.Animator) r3
            boolean r3 = a(r3)
            if (r3 == 0) goto L43
            return r2
        L43:
            int r1 = r1 + 1
            goto L30
        L46:
            return r0
    }

    static boolean a(android.support.v4.app.k.g r4) {
            android.view.animation.Animation r0 = r4.f575a
            boolean r1 = r0 instanceof android.view.animation.AlphaAnimation
            r2 = 1
            if (r1 == 0) goto L8
            return r2
        L8:
            boolean r1 = r0 instanceof android.view.animation.AnimationSet
            if (r1 == 0) goto L27
            android.view.animation.AnimationSet r0 = (android.view.animation.AnimationSet) r0
            java.util.List r4 = r0.getAnimations()
            r0 = 0
            r1 = r0
        L14:
            int r3 = r4.size()
            if (r1 >= r3) goto L26
            java.lang.Object r3 = r4.get(r1)
            boolean r3 = r3 instanceof android.view.animation.AlphaAnimation
            if (r3 == 0) goto L23
            return r2
        L23:
            int r1 = r1 + 1
            goto L14
        L26:
            return r0
        L27:
            android.animation.Animator r4 = r4.f576b
            boolean r4 = a(r4)
            return r4
    }

    private boolean a(java.lang.String r9, int r10, int r11) {
            r8 = this;
            r8.n()
            r0 = 1
            r8.c(r0)
            android.support.v4.app.e r1 = r8.q
            if (r1 == 0) goto L1c
            if (r10 >= 0) goto L1c
            if (r9 != 0) goto L1c
            android.support.v4.app.j r1 = r1.O()
            if (r1 == 0) goto L1c
            boolean r1 = r1.c()
            if (r1 == 0) goto L1c
            return r0
        L1c:
            java.util.ArrayList<android.support.v4.app.c> r3 = r8.x
            java.util.ArrayList<java.lang.Boolean> r4 = r8.y
            r2 = r8
            r5 = r9
            r6 = r10
            r7 = r11
            boolean r9 = r2.a(r3, r4, r5, r6, r7)
            if (r9 == 0) goto L3c
            r8.f561c = r0
            java.util.ArrayList<android.support.v4.app.c> r10 = r8.x     // Catch: java.lang.Throwable -> L37
            java.util.ArrayList<java.lang.Boolean> r11 = r8.y     // Catch: java.lang.Throwable -> L37
            r8.c(r10, r11)     // Catch: java.lang.Throwable -> L37
            r8.z()
            goto L3c
        L37:
            r9 = move-exception
            r8.z()
            throw r9
        L3c:
            r8.m()
            r8.x()
            return r9
    }

    public static int b(int r1, boolean r2) {
            r0 = 4097(0x1001, float:5.741E-42)
            if (r1 == r0) goto L1a
            r0 = 4099(0x1003, float:5.744E-42)
            if (r1 == r0) goto L14
            r0 = 8194(0x2002, float:1.1482E-41)
            if (r1 == r0) goto Le
            r1 = -1
            goto L1f
        Le:
            if (r2 == 0) goto L12
            r1 = 3
            goto L1f
        L12:
            r1 = 4
            goto L1f
        L14:
            if (r2 == 0) goto L18
            r1 = 5
            goto L1f
        L18:
            r1 = 6
            goto L1f
        L1a:
            if (r2 == 0) goto L1e
            r1 = 1
            goto L1f
        L1e:
            r1 = 2
        L1f:
            return r1
    }

    private void b(b.b.c.f.b<android.support.v4.app.e> r5) {
            r4 = this;
            int r4 = r5.size()
            r0 = 0
        L5:
            if (r0 >= r4) goto L22
            java.lang.Object r1 = r5.c(r0)
            android.support.v4.app.e r1 = (android.support.v4.app.e) r1
            boolean r2 = r1.l
            if (r2 != 0) goto L1f
            android.view.View r2 = r1.y()
            float r3 = r2.getAlpha()
            r1.Q = r3
            r1 = 0
            r2.setAlpha(r1)
        L1f:
            int r0 = r0 + 1
            goto L5
        L22:
            return
    }

    private void b(java.util.ArrayList<android.support.v4.app.c> r16, java.util.ArrayList<java.lang.Boolean> r17, int r18, int r19) {
            r15 = this;
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            java.lang.Object r0 = r7.get(r9)
            android.support.v4.app.c r0 = (android.support.v4.app.c) r0
            boolean r11 = r0.s
            java.util.ArrayList<android.support.v4.app.e> r0 = r6.z
            if (r0 != 0) goto L1d
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.z = r0
            goto L20
        L1d:
            r0.clear()
        L20:
            java.util.ArrayList<android.support.v4.app.e> r0 = r6.z
            java.util.ArrayList<android.support.v4.app.e> r1 = r6.e
            r0.addAll(r1)
            android.support.v4.app.e r0 = r15.p()
            r1 = 0
            r12 = r1
            r2 = r9
        L2e:
            r13 = 1
            if (r2 >= r10) goto L5d
            java.lang.Object r3 = r7.get(r2)
            android.support.v4.app.c r3 = (android.support.v4.app.c) r3
            java.lang.Object r4 = r8.get(r2)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L4a
            java.util.ArrayList<android.support.v4.app.e> r4 = r6.z
            android.support.v4.app.e r0 = r3.a(r4, r0)
            goto L50
        L4a:
            java.util.ArrayList<android.support.v4.app.e> r4 = r6.z
            android.support.v4.app.e r0 = r3.b(r4, r0)
        L50:
            if (r12 != 0) goto L59
            boolean r3 = r3.i
            if (r3 == 0) goto L57
            goto L59
        L57:
            r12 = r1
            goto L5a
        L59:
            r12 = r13
        L5a:
            int r2 = r2 + 1
            goto L2e
        L5d:
            java.util.ArrayList<android.support.v4.app.e> r0 = r6.z
            r0.clear()
            if (r11 != 0) goto L71
            r5 = 0
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            android.support.v4.app.p.a(r0, r1, r2, r3, r4, r5)
        L71:
            a(r16, r17, r18, r19)
            if (r11 == 0) goto L91
            b.b.c.f.b r14 = new b.b.c.f.b
            r14.<init>()
            r15.a(r14)
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r14
            int r0 = r0.a(r1, r2, r3, r4, r5)
            r15.b(r14)
            r4 = r0
            goto L92
        L91:
            r4 = r10
        L92:
            if (r4 == r9) goto La6
            if (r11 == 0) goto La6
            r5 = 1
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            android.support.v4.app.p.a(r0, r1, r2, r3, r4, r5)
            int r0 = r6.m
            r15.a(r0, r13)
        La6:
            if (r9 >= r10) goto Lca
            java.lang.Object r0 = r7.get(r9)
            android.support.v4.app.c r0 = (android.support.v4.app.c) r0
            java.lang.Object r1 = r8.get(r9)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Lc4
            int r1 = r0.l
            if (r1 < 0) goto Lc4
            r15.b(r1)
            r1 = -1
            r0.l = r1
        Lc4:
            r0.d()
            int r9 = r9 + 1
            goto La6
        Lca:
            if (r12 == 0) goto Lcf
            r15.r()
        Lcf:
            return
    }

    static boolean b(android.view.View r3, android.support.v4.app.k.g r4) {
            r0 = 0
            if (r3 == 0) goto L1f
            if (r4 != 0) goto L6
            goto L1f
        L6:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 19
            if (r1 < r2) goto L1f
            int r1 = r3.getLayerType()
            if (r1 != 0) goto L1f
            boolean r3 = b.b.c.g.q.i(r3)
            if (r3 == 0) goto L1f
            boolean r3 = a(r4)
            if (r3 == 0) goto L1f
            r0 = 1
        L1f:
            return r0
    }

    private boolean b(java.util.ArrayList<android.support.v4.app.c> r5, java.util.ArrayList<java.lang.Boolean> r6) {
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList<android.support.v4.app.k$l> r0 = r4.f560b     // Catch: java.lang.Throwable -> L3c
            r1 = 0
            if (r0 == 0) goto L3a
            java.util.ArrayList<android.support.v4.app.k$l> r0 = r4.f560b     // Catch: java.lang.Throwable -> L3c
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto Lf
            goto L3a
        Lf:
            java.util.ArrayList<android.support.v4.app.k$l> r0 = r4.f560b     // Catch: java.lang.Throwable -> L3c
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L3c
            r2 = r1
        L16:
            if (r1 >= r0) goto L28
            java.util.ArrayList<android.support.v4.app.k$l> r3 = r4.f560b     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L3c
            android.support.v4.app.k$l r3 = (android.support.v4.app.k.l) r3     // Catch: java.lang.Throwable -> L3c
            boolean r3 = r3.a(r5, r6)     // Catch: java.lang.Throwable -> L3c
            r2 = r2 | r3
            int r1 = r1 + 1
            goto L16
        L28:
            java.util.ArrayList<android.support.v4.app.k$l> r5 = r4.f560b     // Catch: java.lang.Throwable -> L3c
            r5.clear()     // Catch: java.lang.Throwable -> L3c
            android.support.v4.app.i r5 = r4.n     // Catch: java.lang.Throwable -> L3c
            android.os.Handler r5 = r5.e()     // Catch: java.lang.Throwable -> L3c
            java.lang.Runnable r6 = r4.E     // Catch: java.lang.Throwable -> L3c
            r5.removeCallbacks(r6)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3c
            return r2
        L3a:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3c
            return r1
        L3c:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3c
            throw r5
    }

    private void c(java.util.ArrayList<android.support.v4.app.c> r5, java.util.ArrayList<java.lang.Boolean> r6) {
            r4 = this;
            if (r5 == 0) goto L6e
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L9
            goto L6e
        L9:
            if (r6 == 0) goto L66
            int r0 = r5.size()
            int r1 = r6.size()
            if (r0 != r1) goto L66
            r4.a(r5, r6)
            int r0 = r5.size()
            r1 = 0
            r2 = r1
        L1e:
            if (r1 >= r0) goto L60
            java.lang.Object r3 = r5.get(r1)
            android.support.v4.app.c r3 = (android.support.v4.app.c) r3
            boolean r3 = r3.s
            if (r3 != 0) goto L5d
            if (r2 == r1) goto L2f
            r4.b(r5, r6, r2, r1)
        L2f:
            int r2 = r1 + 1
            java.lang.Object r3 = r6.get(r1)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L58
        L3d:
            if (r2 >= r0) goto L58
            java.lang.Object r3 = r6.get(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L58
            java.lang.Object r3 = r5.get(r2)
            android.support.v4.app.c r3 = (android.support.v4.app.c) r3
            boolean r3 = r3.s
            if (r3 != 0) goto L58
            int r2 = r2 + 1
            goto L3d
        L58:
            r4.b(r5, r6, r1, r2)
            int r1 = r2 + (-1)
        L5d:
            int r1 = r1 + 1
            goto L1e
        L60:
            if (r2 == r0) goto L65
            r4.b(r5, r6, r2, r0)
        L65:
            return
        L66:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Internal error with the back stack records"
            r4.<init>(r5)
            throw r4
        L6e:
            return
    }

    private void c(boolean r3) {
            r2 = this;
            boolean r0 = r2.f561c
            if (r0 != 0) goto L4e
            android.support.v4.app.i r0 = r2.n
            if (r0 == 0) goto L46
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.support.v4.app.i r1 = r2.n
            android.os.Handler r1 = r1.e()
            android.os.Looper r1 = r1.getLooper()
            if (r0 != r1) goto L3e
            if (r3 != 0) goto L1d
            r2.y()
        L1d:
            java.util.ArrayList<android.support.v4.app.c> r3 = r2.x
            if (r3 != 0) goto L2f
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.x = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.y = r3
        L2f:
            r3 = 1
            r2.f561c = r3
            r3 = 0
            r0 = 0
            r2.a(r0, r0)     // Catch: java.lang.Throwable -> L3a
            r2.f561c = r3
            return
        L3a:
            r0 = move-exception
            r2.f561c = r3
            throw r0
        L3e:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Must be called from main thread of fragment host"
            r2.<init>(r3)
            throw r2
        L46:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Fragment host has been destroyed"
            r2.<init>(r3)
            throw r2
        L4e:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "FragmentManager is already executing transactions"
            r2.<init>(r3)
            throw r2
    }

    private void d(int r3) {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.f561c = r0     // Catch: java.lang.Throwable -> Ld
            r2.a(r3, r1)     // Catch: java.lang.Throwable -> Ld
            r2.f561c = r1
            r2.n()
            return
        Ld:
            r3 = move-exception
            r2.f561c = r1
            throw r3
    }

    public static int e(int r3) {
            r0 = 8194(0x2002, float:1.1482E-41)
            r1 = 4099(0x1003, float:5.744E-42)
            r2 = 4097(0x1001, float:5.741E-42)
            if (r3 == r2) goto L11
            if (r3 == r1) goto L10
            if (r3 == r0) goto Le
            r0 = 0
            goto L11
        Le:
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            return r0
    }

    private android.support.v4.app.e p(android.support.v4.app.e r5) {
            r4 = this;
            android.view.ViewGroup r0 = r5.I
            android.view.View r1 = r5.J
            r2 = 0
            if (r0 == 0) goto L28
            if (r1 != 0) goto La
            goto L28
        La:
            java.util.ArrayList<android.support.v4.app.e> r1 = r4.e
            int r5 = r1.indexOf(r5)
            int r5 = r5 + (-1)
        L12:
            if (r5 < 0) goto L28
            java.util.ArrayList<android.support.v4.app.e> r1 = r4.e
            java.lang.Object r1 = r1.get(r5)
            android.support.v4.app.e r1 = (android.support.v4.app.e) r1
            android.view.ViewGroup r3 = r1.I
            if (r3 != r0) goto L25
            android.view.View r3 = r1.J
            if (r3 == 0) goto L25
            return r1
        L25:
            int r5 = r5 + (-1)
            goto L12
        L28:
            return r2
    }

    private void x() {
            r3 = this;
            android.util.SparseArray<android.support.v4.app.e> r0 = r3.f
            if (r0 == 0) goto L20
            int r0 = r0.size()
            int r0 = r0 + (-1)
        La:
            if (r0 < 0) goto L20
            android.util.SparseArray<android.support.v4.app.e> r1 = r3.f
            java.lang.Object r1 = r1.valueAt(r0)
            if (r1 != 0) goto L1d
            android.util.SparseArray<android.support.v4.app.e> r1 = r3.f
            int r2 = r1.keyAt(r0)
            r1.delete(r2)
        L1d:
            int r0 = r0 + (-1)
            goto La
        L20:
            return
    }

    private void y() {
            r3 = this;
            boolean r0 = r3.b()
            if (r0 != 0) goto L24
            java.lang.String r0 = r3.v
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Can not perform this action inside of "
            r1.append(r2)
            java.lang.String r3 = r3.v
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L24:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can not perform this action after onSaveInstanceState"
            r3.<init>(r0)
            throw r3
    }

    private void z() {
            r1 = this;
            r0 = 0
            r1.f561c = r0
            java.util.ArrayList<java.lang.Boolean> r0 = r1.y
            r0.clear()
            java.util.ArrayList<android.support.v4.app.c> r1 = r1.x
            r1.clear()
            return
    }

    public android.support.v4.app.e a(int r4) {
            r3 = this;
            java.util.ArrayList<android.support.v4.app.e> r0 = r3.e
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L1c
            java.util.ArrayList<android.support.v4.app.e> r1 = r3.e
            java.lang.Object r1 = r1.get(r0)
            android.support.v4.app.e r1 = (android.support.v4.app.e) r1
            if (r1 == 0) goto L19
            int r2 = r1.y
            if (r2 != r4) goto L19
            return r1
        L19:
            int r0 = r0 + (-1)
            goto L8
        L1c:
            android.util.SparseArray<android.support.v4.app.e> r0 = r3.f
            if (r0 == 0) goto L3a
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L26:
            if (r0 < 0) goto L3a
            android.util.SparseArray<android.support.v4.app.e> r1 = r3.f
            java.lang.Object r1 = r1.valueAt(r0)
            android.support.v4.app.e r1 = (android.support.v4.app.e) r1
            if (r1 == 0) goto L37
            int r2 = r1.y
            if (r2 != r4) goto L37
            return r1
        L37:
            int r0 = r0 + (-1)
            goto L26
        L3a:
            r3 = 0
            return r3
    }

    public android.support.v4.app.e a(android.os.Bundle r5, java.lang.String r6) {
            r4 = this;
            r0 = -1
            int r5 = r5.getInt(r6, r0)
            r1 = 0
            if (r5 != r0) goto L9
            return r1
        L9:
            android.util.SparseArray<android.support.v4.app.e> r0 = r4.f
            java.lang.Object r0 = r0.get(r5)
            android.support.v4.app.e r0 = (android.support.v4.app.e) r0
            if (r0 == 0) goto L14
            return r0
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Fragment no longer exists for key "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = ": index "
            r2.append(r6)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r0.<init>(r5)
            r4.a(r0)
            throw r1
    }

    public android.support.v4.app.e a(java.lang.String r4) {
            r3 = this;
            if (r4 == 0) goto L22
            java.util.ArrayList<android.support.v4.app.e> r0 = r3.e
            int r0 = r0.size()
            int r0 = r0 + (-1)
        La:
            if (r0 < 0) goto L22
            java.util.ArrayList<android.support.v4.app.e> r1 = r3.e
            java.lang.Object r1 = r1.get(r0)
            android.support.v4.app.e r1 = (android.support.v4.app.e) r1
            if (r1 == 0) goto L1f
            java.lang.String r2 = r1.A
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L1f
            return r1
        L1f:
            int r0 = r0 + (-1)
            goto La
        L22:
            android.util.SparseArray<android.support.v4.app.e> r0 = r3.f
            if (r0 == 0) goto L46
            if (r4 == 0) goto L46
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L2e:
            if (r0 < 0) goto L46
            android.util.SparseArray<android.support.v4.app.e> r1 = r3.f
            java.lang.Object r1 = r1.valueAt(r0)
            android.support.v4.app.e r1 = (android.support.v4.app.e) r1
            if (r1 == 0) goto L43
            java.lang.String r2 = r1.A
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L43
            return r1
        L43:
            int r0 = r0 + (-1)
            goto L2e
        L46:
            r3 = 0
            return r3
    }

    android.support.v4.app.k.g a(android.support.v4.app.e r5, int r6, boolean r7, int r8) {
            r4 = this;
            int r0 = r5.p()
            android.view.animation.Animation r1 = r5.a(r6, r7, r0)
            if (r1 == 0) goto L10
            android.support.v4.app.k$g r4 = new android.support.v4.app.k$g
            r4.<init>(r1)
            return r4
        L10:
            android.animation.Animator r5 = r5.b(r6, r7, r0)
            if (r5 == 0) goto L1c
            android.support.v4.app.k$g r4 = new android.support.v4.app.k$g
            r4.<init>(r5)
            return r4
        L1c:
            if (r0 == 0) goto L75
            android.support.v4.app.i r5 = r4.n
            android.content.Context r5 = r5.c()
            android.content.res.Resources r5 = r5.getResources()
            java.lang.String r5 = r5.getResourceTypeName(r0)
            java.lang.String r1 = "anim"
            boolean r5 = r1.equals(r5)
            r1 = 0
            if (r5 == 0) goto L4b
            android.support.v4.app.i r2 = r4.n     // Catch: android.content.res.Resources.NotFoundException -> L49 java.lang.RuntimeException -> L4b
            android.content.Context r2 = r2.c()     // Catch: android.content.res.Resources.NotFoundException -> L49 java.lang.RuntimeException -> L4b
            android.view.animation.Animation r2 = android.view.animation.AnimationUtils.loadAnimation(r2, r0)     // Catch: android.content.res.Resources.NotFoundException -> L49 java.lang.RuntimeException -> L4b
            if (r2 == 0) goto L47
            android.support.v4.app.k$g r3 = new android.support.v4.app.k$g     // Catch: android.content.res.Resources.NotFoundException -> L49 java.lang.RuntimeException -> L4b
            r3.<init>(r2)     // Catch: android.content.res.Resources.NotFoundException -> L49 java.lang.RuntimeException -> L4b
            return r3
        L47:
            r1 = 1
            goto L4b
        L49:
            r4 = move-exception
            throw r4
        L4b:
            if (r1 != 0) goto L75
            android.support.v4.app.i r1 = r4.n     // Catch: java.lang.RuntimeException -> L5f
            android.content.Context r1 = r1.c()     // Catch: java.lang.RuntimeException -> L5f
            android.animation.Animator r1 = android.animation.AnimatorInflater.loadAnimator(r1, r0)     // Catch: java.lang.RuntimeException -> L5f
            if (r1 == 0) goto L75
            android.support.v4.app.k$g r2 = new android.support.v4.app.k$g     // Catch: java.lang.RuntimeException -> L5f
            r2.<init>(r1)     // Catch: java.lang.RuntimeException -> L5f
            return r2
        L5f:
            r1 = move-exception
            if (r5 != 0) goto L74
            android.support.v4.app.i r5 = r4.n
            android.content.Context r5 = r5.c()
            android.view.animation.Animation r5 = android.view.animation.AnimationUtils.loadAnimation(r5, r0)
            if (r5 == 0) goto L75
            android.support.v4.app.k$g r4 = new android.support.v4.app.k$g
            r4.<init>(r5)
            return r4
        L74:
            throw r1
        L75:
            r5 = 0
            if (r6 != 0) goto L79
            return r5
        L79:
            int r6 = b(r6, r7)
            if (r6 >= 0) goto L80
            return r5
        L80:
            r7 = 1064933786(0x3f79999a, float:0.975)
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            switch(r6) {
                case 1: goto Ld4;
                case 2: goto Lc9;
                case 3: goto Lbe;
                case 4: goto Lb0;
                case 5: goto La5;
                case 6: goto L9a;
                default: goto L89;
            }
        L89:
            if (r8 != 0) goto Le1
            android.support.v4.app.i r6 = r4.n
            boolean r6 = r6.h()
            if (r6 == 0) goto Le1
            android.support.v4.app.i r4 = r4.n
            int r8 = r4.g()
            goto Le1
        L9a:
            android.support.v4.app.i r4 = r4.n
            android.content.Context r4 = r4.c()
            android.support.v4.app.k$g r4 = a(r4, r1, r0)
            return r4
        La5:
            android.support.v4.app.i r4 = r4.n
            android.content.Context r4 = r4.c()
            android.support.v4.app.k$g r4 = a(r4, r0, r1)
            return r4
        Lb0:
            android.support.v4.app.i r4 = r4.n
            android.content.Context r4 = r4.c()
            r5 = 1065982362(0x3f89999a, float:1.075)
            android.support.v4.app.k$g r4 = a(r4, r1, r5, r1, r0)
            return r4
        Lbe:
            android.support.v4.app.i r4 = r4.n
            android.content.Context r4 = r4.c()
            android.support.v4.app.k$g r4 = a(r4, r7, r1, r0, r1)
            return r4
        Lc9:
            android.support.v4.app.i r4 = r4.n
            android.content.Context r4 = r4.c()
            android.support.v4.app.k$g r4 = a(r4, r1, r7, r1, r0)
            return r4
        Ld4:
            android.support.v4.app.i r4 = r4.n
            android.content.Context r4 = r4.c()
            r5 = 1066401792(0x3f900000, float:1.125)
            android.support.v4.app.k$g r4 = a(r4, r5, r1, r0, r1)
            return r4
        Le1:
            return r5
    }

    @Override // android.support.v4.app.j
    public java.util.List<android.support.v4.app.e> a() {
            r1 = this;
            java.util.ArrayList<android.support.v4.app.e> r0 = r1.e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            java.util.List r1 = java.util.Collections.emptyList()
            return r1
        Ld:
            java.util.ArrayList<android.support.v4.app.e> r0 = r1.e
            monitor-enter(r0)
            java.util.ArrayList<android.support.v4.app.e> r1 = r1.e     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r1 = r1.clone()     // Catch: java.lang.Throwable -> L1a
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return r1
        L1a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r1
    }

    public void a(int r5, android.support.v4.app.c r6) {
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList<android.support.v4.app.c> r0 = r4.i     // Catch: java.lang.Throwable -> L9e
            if (r0 != 0) goto Lc
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L9e
            r0.<init>()     // Catch: java.lang.Throwable -> L9e
            r4.i = r0     // Catch: java.lang.Throwable -> L9e
        Lc:
            java.util.ArrayList<android.support.v4.app.c> r0 = r4.i     // Catch: java.lang.Throwable -> L9e
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L9e
            if (r5 >= r0) goto L3c
            boolean r0 = android.support.v4.app.k.F     // Catch: java.lang.Throwable -> L9e
            if (r0 == 0) goto L36
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9e
            r1.<init>()     // Catch: java.lang.Throwable -> L9e
            java.lang.String r2 = "Setting back stack index "
            r1.append(r2)     // Catch: java.lang.Throwable -> L9e
            r1.append(r5)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r2 = " to "
            r1.append(r2)     // Catch: java.lang.Throwable -> L9e
            r1.append(r6)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L9e
            android.util.Log.v(r0, r1)     // Catch: java.lang.Throwable -> L9e
        L36:
            java.util.ArrayList<android.support.v4.app.c> r0 = r4.i     // Catch: java.lang.Throwable -> L9e
            r0.set(r5, r6)     // Catch: java.lang.Throwable -> L9e
            goto L9c
        L3c:
            if (r0 >= r5) goto L75
            java.util.ArrayList<android.support.v4.app.c> r1 = r4.i     // Catch: java.lang.Throwable -> L9e
            r2 = 0
            r1.add(r2)     // Catch: java.lang.Throwable -> L9e
            java.util.ArrayList<java.lang.Integer> r1 = r4.j     // Catch: java.lang.Throwable -> L9e
            if (r1 != 0) goto L4f
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L9e
            r1.<init>()     // Catch: java.lang.Throwable -> L9e
            r4.j = r1     // Catch: java.lang.Throwable -> L9e
        L4f:
            boolean r1 = android.support.v4.app.k.F     // Catch: java.lang.Throwable -> L9e
            if (r1 == 0) goto L69
            java.lang.String r1 = "FragmentManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9e
            r2.<init>()     // Catch: java.lang.Throwable -> L9e
            java.lang.String r3 = "Adding available back stack index "
            r2.append(r3)     // Catch: java.lang.Throwable -> L9e
            r2.append(r0)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L9e
            android.util.Log.v(r1, r2)     // Catch: java.lang.Throwable -> L9e
        L69:
            java.util.ArrayList<java.lang.Integer> r1 = r4.j     // Catch: java.lang.Throwable -> L9e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L9e
            r1.add(r2)     // Catch: java.lang.Throwable -> L9e
            int r0 = r0 + 1
            goto L3c
        L75:
            boolean r0 = android.support.v4.app.k.F     // Catch: java.lang.Throwable -> L9e
            if (r0 == 0) goto L97
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9e
            r1.<init>()     // Catch: java.lang.Throwable -> L9e
            java.lang.String r2 = "Adding back stack index "
            r1.append(r2)     // Catch: java.lang.Throwable -> L9e
            r1.append(r5)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r5 = " with "
            r1.append(r5)     // Catch: java.lang.Throwable -> L9e
            r1.append(r6)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L9e
            android.util.Log.v(r0, r5)     // Catch: java.lang.Throwable -> L9e
        L97:
            java.util.ArrayList<android.support.v4.app.c> r5 = r4.i     // Catch: java.lang.Throwable -> L9e
            r5.add(r6)     // Catch: java.lang.Throwable -> L9e
        L9c:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L9e
            return
        L9e:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L9e
            throw r5
    }

    void a(int r4, boolean r5) {
            r3 = this;
            android.support.v4.app.i r0 = r3.n
            if (r0 != 0) goto Lf
            if (r4 != 0) goto L7
            goto Lf
        L7:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "No activity"
            r3.<init>(r4)
            throw r3
        Lf:
            if (r5 != 0) goto L16
            int r5 = r3.m
            if (r4 != r5) goto L16
            return
        L16:
            r3.m = r4
            android.util.SparseArray<android.support.v4.app.e> r4 = r3.f
            if (r4 == 0) goto L6e
            java.util.ArrayList<android.support.v4.app.e> r4 = r3.e
            int r4 = r4.size()
            r5 = 0
            r0 = r5
        L24:
            if (r0 >= r4) goto L34
            java.util.ArrayList<android.support.v4.app.e> r1 = r3.e
            java.lang.Object r1 = r1.get(r0)
            android.support.v4.app.e r1 = (android.support.v4.app.e) r1
            r3.h(r1)
            int r0 = r0 + 1
            goto L24
        L34:
            android.util.SparseArray<android.support.v4.app.e> r4 = r3.f
            int r4 = r4.size()
            r0 = r5
        L3b:
            if (r0 >= r4) goto L59
            android.util.SparseArray<android.support.v4.app.e> r1 = r3.f
            java.lang.Object r1 = r1.valueAt(r0)
            android.support.v4.app.e r1 = (android.support.v4.app.e) r1
            if (r1 == 0) goto L56
            boolean r2 = r1.m
            if (r2 != 0) goto L4f
            boolean r2 = r1.C
            if (r2 == 0) goto L56
        L4f:
            boolean r2 = r1.O
            if (r2 != 0) goto L56
            r3.h(r1)
        L56:
            int r0 = r0 + 1
            goto L3b
        L59:
            r3.w()
            boolean r4 = r3.r
            if (r4 == 0) goto L6e
            android.support.v4.app.i r4 = r3.n
            if (r4 == 0) goto L6e
            int r0 = r3.m
            r1 = 4
            if (r0 != r1) goto L6e
            r4.i()
            r3.r = r5
        L6e:
            return
    }

    public void a(android.content.res.Configuration r3) {
            r2 = this;
            r0 = 0
        L1:
            java.util.ArrayList<android.support.v4.app.e> r1 = r2.e
            int r1 = r1.size()
            if (r0 >= r1) goto L19
            java.util.ArrayList<android.support.v4.app.e> r1 = r2.e
            java.lang.Object r1 = r1.get(r0)
            android.support.v4.app.e r1 = (android.support.v4.app.e) r1
            if (r1 == 0) goto L16
            r1.a(r3)
        L16:
            int r0 = r0 + 1
            goto L1
        L19:
            return
    }

    public void a(android.os.Bundle r2, java.lang.String r3, android.support.v4.app.e r4) {
            r1 = this;
            int r0 = r4.f
            if (r0 < 0) goto L8
            r2.putInt(r3, r0)
            return
        L8:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Fragment "
            r3.append(r0)
            r3.append(r4)
            java.lang.String r4 = " is not currently in the FragmentManager"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            r1.a(r2)
            r1 = 0
            throw r1
    }

    void a(android.os.Parcelable r14, android.support.v4.app.l r15) {
            r13 = this;
            if (r14 != 0) goto L3
            return
        L3:
            android.support.v4.app.m r14 = (android.support.v4.app.m) r14
            android.support.v4.app.n[] r0 = r14.f589b
            if (r0 != 0) goto La
            return
        La:
            r0 = 0
            r1 = 0
            if (r15 == 0) goto La7
            java.util.List r2 = r15.b()
            java.util.List r3 = r15.a()
            java.util.List r4 = r15.c()
            if (r2 == 0) goto L21
            int r5 = r2.size()
            goto L22
        L21:
            r5 = r1
        L22:
            r6 = r1
        L23:
            if (r6 >= r5) goto La9
            java.lang.Object r7 = r2.get(r6)
            android.support.v4.app.e r7 = (android.support.v4.app.e) r7
            boolean r8 = android.support.v4.app.k.F
            if (r8 == 0) goto L45
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "restoreAllState: re-attaching retained "
            r8.append(r9)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "FragmentManager"
            android.util.Log.v(r9, r8)
        L45:
            r8 = r1
        L46:
            android.support.v4.app.n[] r9 = r14.f589b
            int r10 = r9.length
            if (r8 >= r10) goto L56
            r9 = r9[r8]
            int r9 = r9.f592c
            int r10 = r7.f
            if (r9 == r10) goto L56
            int r8 = r8 + 1
            goto L46
        L56:
            android.support.v4.app.n[] r9 = r14.f589b
            int r10 = r9.length
            if (r8 == r10) goto L8b
            r8 = r9[r8]
            r8.m = r7
            r7.d = r0
            r7.r = r1
            r7.o = r1
            r7.l = r1
            r7.i = r0
            android.os.Bundle r9 = r8.l
            if (r9 == 0) goto L88
            android.support.v4.app.i r10 = r13.n
            android.content.Context r10 = r10.c()
            java.lang.ClassLoader r10 = r10.getClassLoader()
            r9.setClassLoader(r10)
            android.os.Bundle r9 = r8.l
            java.lang.String r10 = "android:view_state"
            android.util.SparseArray r9 = r9.getSparseParcelableArray(r10)
            r7.d = r9
            android.os.Bundle r8 = r8.l
            r7.f545c = r8
        L88:
            int r6 = r6 + 1
            goto L23
        L8b:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r1 = "Could not find active fragment with index "
            r15.append(r1)
            int r1 = r7.f
            r15.append(r1)
            java.lang.String r15 = r15.toString()
            r14.<init>(r15)
            r13.a(r14)
            throw r0
        La7:
            r3 = r0
            r4 = r3
        La9:
            android.util.SparseArray r2 = new android.util.SparseArray
            android.support.v4.app.n[] r5 = r14.f589b
            int r5 = r5.length
            r2.<init>(r5)
            r13.f = r2
            r2 = r1
        Lb4:
            android.support.v4.app.n[] r5 = r14.f589b
            int r6 = r5.length
            if (r2 >= r6) goto L118
            r5 = r5[r2]
            if (r5 == 0) goto L115
            if (r3 == 0) goto Lcd
            int r6 = r3.size()
            if (r2 >= r6) goto Lcd
            java.lang.Object r6 = r3.get(r2)
            android.support.v4.app.l r6 = (android.support.v4.app.l) r6
            r11 = r6
            goto Lce
        Lcd:
            r11 = r0
        Lce:
            if (r4 == 0) goto Lde
            int r6 = r4.size()
            if (r2 >= r6) goto Lde
            java.lang.Object r6 = r4.get(r2)
            android.arch.lifecycle.p r6 = (android.arch.lifecycle.p) r6
            r12 = r6
            goto Ldf
        Lde:
            r12 = r0
        Ldf:
            android.support.v4.app.i r8 = r13.n
            android.support.v4.app.g r9 = r13.o
            android.support.v4.app.e r10 = r13.p
            r7 = r5
            android.support.v4.app.e r6 = r7.a(r8, r9, r10, r11, r12)
            boolean r7 = android.support.v4.app.k.F
            if (r7 == 0) goto L10c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "restoreAllState: active #"
            r7.append(r8)
            r7.append(r2)
            java.lang.String r8 = ": "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "FragmentManager"
            android.util.Log.v(r8, r7)
        L10c:
            android.util.SparseArray<android.support.v4.app.e> r7 = r13.f
            int r8 = r6.f
            r7.put(r8, r6)
            r5.m = r0
        L115:
            int r2 = r2 + 1
            goto Lb4
        L118:
            if (r15 == 0) goto L162
            java.util.List r15 = r15.b()
            if (r15 == 0) goto L125
            int r2 = r15.size()
            goto L126
        L125:
            r2 = r1
        L126:
            r3 = r1
        L127:
            if (r3 >= r2) goto L162
            java.lang.Object r4 = r15.get(r3)
            android.support.v4.app.e r4 = (android.support.v4.app.e) r4
            int r5 = r4.j
            if (r5 < 0) goto L15f
            android.util.SparseArray<android.support.v4.app.e> r6 = r13.f
            java.lang.Object r5 = r6.get(r5)
            android.support.v4.app.e r5 = (android.support.v4.app.e) r5
            r4.i = r5
            if (r5 != 0) goto L15f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Re-attaching retained fragment "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r6 = " target no longer exists: "
            r5.append(r6)
            int r4 = r4.j
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "FragmentManager"
            android.util.Log.w(r5, r4)
        L15f:
            int r3 = r3 + 1
            goto L127
        L162:
            java.util.ArrayList<android.support.v4.app.e> r15 = r13.e
            r15.clear()
            int[] r15 = r14.f590c
            if (r15 == 0) goto L1df
            r15 = r1
        L16c:
            int[] r2 = r14.f590c
            int r3 = r2.length
            if (r15 >= r3) goto L1df
            android.util.SparseArray<android.support.v4.app.e> r3 = r13.f
            r2 = r2[r15]
            java.lang.Object r2 = r3.get(r2)
            android.support.v4.app.e r2 = (android.support.v4.app.e) r2
            if (r2 == 0) goto L1c1
            r3 = 1
            r2.l = r3
            boolean r3 = android.support.v4.app.k.F
            if (r3 == 0) goto L1a2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "restoreAllState: added #"
            r3.append(r4)
            r3.append(r15)
            java.lang.String r4 = ": "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "FragmentManager"
            android.util.Log.v(r4, r3)
        L1a2:
            java.util.ArrayList<android.support.v4.app.e> r3 = r13.e
            boolean r3 = r3.contains(r2)
            if (r3 != 0) goto L1b9
            java.util.ArrayList<android.support.v4.app.e> r3 = r13.e
            monitor-enter(r3)
            java.util.ArrayList<android.support.v4.app.e> r4 = r13.e     // Catch: java.lang.Throwable -> L1b6
            r4.add(r2)     // Catch: java.lang.Throwable -> L1b6
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1b6
            int r15 = r15 + 1
            goto L16c
        L1b6:
            r13 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1b6
            throw r13
        L1b9:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "Already added!"
            r13.<init>(r14)
            throw r13
        L1c1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "No instantiated fragment for index #"
            r2.append(r3)
            int[] r14 = r14.f590c
            r14 = r14[r15]
            r2.append(r14)
            java.lang.String r14 = r2.toString()
            r1.<init>(r14)
            r13.a(r1)
            throw r0
        L1df:
            android.support.v4.app.d[] r15 = r14.d
            if (r15 == 0) goto L248
            java.util.ArrayList r15 = new java.util.ArrayList
            android.support.v4.app.d[] r0 = r14.d
            int r0 = r0.length
            r15.<init>(r0)
            r13.g = r15
            r15 = r1
        L1ee:
            android.support.v4.app.d[] r0 = r14.d
            int r2 = r0.length
            if (r15 >= r2) goto L24a
            r0 = r0[r15]
            android.support.v4.app.c r0 = r0.a(r13)
            boolean r2 = android.support.v4.app.k.F
            if (r2 == 0) goto L239
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "restoreAllState: back stack #"
            r2.append(r3)
            r2.append(r15)
            java.lang.String r3 = " (index "
            r2.append(r3)
            int r3 = r0.l
            r2.append(r3)
            java.lang.String r3 = "): "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "FragmentManager"
            android.util.Log.v(r3, r2)
            b.b.c.f.e r2 = new b.b.c.f.e
            java.lang.String r3 = "FragmentManager"
            r2.<init>(r3)
            java.io.PrintWriter r3 = new java.io.PrintWriter
            r3.<init>(r2)
            java.lang.String r2 = "  "
            r0.a(r2, r3, r1)
            r3.close()
        L239:
            java.util.ArrayList<android.support.v4.app.c> r2 = r13.g
            r2.add(r0)
            int r2 = r0.l
            if (r2 < 0) goto L245
            r13.a(r2, r0)
        L245:
            int r15 = r15 + 1
            goto L1ee
        L248:
            r13.g = r0
        L24a:
            int r15 = r14.e
            if (r15 < 0) goto L258
            android.util.SparseArray<android.support.v4.app.e> r0 = r13.f
            java.lang.Object r15 = r0.get(r15)
            android.support.v4.app.e r15 = (android.support.v4.app.e) r15
            r13.q = r15
        L258:
            int r14 = r14.f
            r13.d = r14
            return
    }

    void a(android.support.v4.app.c r2) {
            r1 = this;
            java.util.ArrayList<android.support.v4.app.c> r0 = r1.g
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.g = r0
        Lb:
            java.util.ArrayList<android.support.v4.app.c> r1 = r1.g
            r1.add(r2)
            return
    }

    void a(android.support.v4.app.c r8, boolean r9, boolean r10, boolean r11) {
            r7 = this;
            if (r9 == 0) goto L6
            r8.a(r11)
            goto L9
        L6:
            r8.a()
        L9:
            java.util.ArrayList r1 = new java.util.ArrayList
            r6 = 1
            r1.<init>(r6)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r6)
            r1.add(r8)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r2.add(r9)
            if (r10 == 0) goto L27
            r3 = 0
            r4 = 1
            r5 = 1
            r0 = r7
            android.support.v4.app.p.a(r0, r1, r2, r3, r4, r5)
        L27:
            if (r11 == 0) goto L2e
            int r9 = r7.m
            r7.a(r9, r6)
        L2e:
            android.util.SparseArray<android.support.v4.app.e> r9 = r7.f
            if (r9 == 0) goto L6e
            int r9 = r9.size()
            r10 = 0
            r0 = r10
        L38:
            if (r0 >= r9) goto L6e
            android.util.SparseArray<android.support.v4.app.e> r1 = r7.f
            java.lang.Object r1 = r1.valueAt(r0)
            android.support.v4.app.e r1 = (android.support.v4.app.e) r1
            if (r1 == 0) goto L6b
            android.view.View r2 = r1.J
            if (r2 == 0) goto L6b
            boolean r2 = r1.O
            if (r2 == 0) goto L6b
            int r2 = r1.z
            boolean r2 = r8.b(r2)
            if (r2 == 0) goto L6b
            float r2 = r1.Q
            r3 = 0
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 <= 0) goto L60
            android.view.View r4 = r1.J
            r4.setAlpha(r2)
        L60:
            if (r11 == 0) goto L65
            r1.Q = r3
            goto L6b
        L65:
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.Q = r2
            r1.O = r10
        L6b:
            int r0 = r0 + 1
            goto L38
        L6e:
            return
    }

    public void a(android.support.v4.app.e r3) {
            r2 = this;
            boolean r0 = android.support.v4.app.k.F
            if (r0 == 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "attach: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L1a:
            boolean r0 = r3.C
            if (r0 == 0) goto L78
            r0 = 0
            r3.C = r0
            boolean r0 = r3.l
            if (r0 != 0) goto L78
            java.util.ArrayList<android.support.v4.app.e> r0 = r2.e
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L61
            boolean r0 = android.support.v4.app.k.F
            if (r0 == 0) goto L47
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "add from attach: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L47:
            java.util.ArrayList<android.support.v4.app.e> r0 = r2.e
            monitor-enter(r0)
            java.util.ArrayList<android.support.v4.app.e> r1 = r2.e     // Catch: java.lang.Throwable -> L5e
            r1.add(r3)     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5e
            r0 = 1
            r3.l = r0
            boolean r1 = r3.F
            if (r1 == 0) goto L78
            boolean r3 = r3.G
            if (r3 == 0) goto L78
            r2.r = r0
            goto L78
        L5e:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5e
            throw r2
        L61:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Fragment already added: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
        L78:
            return
    }

    void a(android.support.v4.app.e r17, int r18, int r19, int r20, boolean r21) {
            r16 = this;
            r6 = r16
            r7 = r17
            boolean r0 = r7.l
            r8 = 1
            if (r0 == 0) goto L11
            boolean r0 = r7.C
            if (r0 == 0) goto Le
            goto L11
        Le:
            r0 = r18
            goto L16
        L11:
            r0 = r18
            if (r0 <= r8) goto L16
            r0 = r8
        L16:
            boolean r1 = r7.m
            if (r1 == 0) goto L2a
            int r1 = r7.f544b
            if (r0 <= r1) goto L2a
            if (r1 != 0) goto L28
            boolean r0 = r17.C()
            if (r0 == 0) goto L28
            r0 = r8
            goto L2a
        L28:
            int r0 = r7.f544b
        L2a:
            boolean r1 = r7.L
            r9 = 3
            r10 = 2
            if (r1 == 0) goto L38
            int r1 = r7.f544b
            if (r1 >= r9) goto L38
            if (r0 <= r10) goto L38
            r11 = r10
            goto L39
        L38:
            r11 = r0
        L39:
            int r0 = r7.f544b
            java.lang.String r12 = "FragmentManager"
            r13 = 0
            r14 = 0
            if (r0 > r11) goto L2d6
            boolean r0 = r7.n
            if (r0 == 0) goto L4a
            boolean r0 = r7.o
            if (r0 != 0) goto L4a
            return
        L4a:
            android.view.View r0 = r17.g()
            if (r0 != 0) goto L56
            android.animation.Animator r0 = r17.h()
            if (r0 == 0) goto L6a
        L56:
            r7.a(r14)
            r7.a(r14)
            int r2 = r17.x()
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r16
            r1 = r17
            r0.a(r1, r2, r3, r4, r5)
        L6a:
            int r0 = r7.f544b
            if (r0 == 0) goto L76
            if (r0 == r8) goto L19e
            if (r0 == r10) goto L290
            if (r0 == r9) goto L2b0
            goto L418
        L76:
            if (r11 <= 0) goto L19e
            boolean r0 = android.support.v4.app.k.F
            if (r0 == 0) goto L90
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto CREATED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L90:
            android.os.Bundle r0 = r7.f545c
            if (r0 == 0) goto Le1
            android.support.v4.app.i r1 = r6.n
            android.content.Context r1 = r1.c()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r0.setClassLoader(r1)
            android.os.Bundle r0 = r7.f545c
            java.lang.String r1 = "android:view_state"
            android.util.SparseArray r0 = r0.getSparseParcelableArray(r1)
            r7.d = r0
            android.os.Bundle r0 = r7.f545c
            java.lang.String r1 = "android:target_state"
            android.support.v4.app.e r0 = r6.a(r0, r1)
            r7.i = r0
            if (r0 == 0) goto Lc1
            android.os.Bundle r0 = r7.f545c
            java.lang.String r1 = "android:target_req_state"
            int r0 = r0.getInt(r1, r13)
            r7.k = r0
        Lc1:
            java.lang.Boolean r0 = r7.e
            if (r0 == 0) goto Lce
            boolean r0 = r0.booleanValue()
            r7.M = r0
            r7.e = r14
            goto Ld8
        Lce:
            android.os.Bundle r0 = r7.f545c
            java.lang.String r1 = "android:user_visible_hint"
            boolean r0 = r0.getBoolean(r1, r8)
            r7.M = r0
        Ld8:
            boolean r0 = r7.M
            if (r0 != 0) goto Le1
            r7.L = r8
            if (r11 <= r10) goto Le1
            r11 = r10
        Le1:
            android.support.v4.app.i r0 = r6.n
            r7.t = r0
            android.support.v4.app.e r1 = r6.p
            r7.x = r1
            if (r1 == 0) goto Lee
            android.support.v4.app.k r0 = r1.u
            goto Lf2
        Lee:
            android.support.v4.app.k r0 = r0.d()
        Lf2:
            r7.s = r0
            android.support.v4.app.e r0 = r7.i
            java.lang.String r15 = "Fragment "
            if (r0 == 0) goto L138
            android.util.SparseArray<android.support.v4.app.e> r1 = r6.f
            int r0 = r0.f
            java.lang.Object r0 = r1.get(r0)
            android.support.v4.app.e r1 = r7.i
            if (r0 != r1) goto L114
            int r0 = r1.f544b
            if (r0 >= r8) goto L138
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r16
            r0.a(r1, r2, r3, r4, r5)
            goto L138
        L114:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            r1.append(r7)
            java.lang.String r2 = " declared target fragment "
            r1.append(r2)
            android.support.v4.app.e r2 = r7.i
            r1.append(r2)
            java.lang.String r2 = " that does not belong to this FragmentManager!"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L138:
            android.support.v4.app.i r0 = r6.n
            android.content.Context r0 = r0.c()
            r6.b(r7, r0, r13)
            r7.H = r13
            android.support.v4.app.i r0 = r6.n
            android.content.Context r0 = r0.c()
            r7.a(r0)
            boolean r0 = r7.H
            if (r0 == 0) goto L184
            android.support.v4.app.e r0 = r7.x
            if (r0 != 0) goto L15a
            android.support.v4.app.i r0 = r6.n
            r0.a(r7)
            goto L15d
        L15a:
            r0.a(r7)
        L15d:
            android.support.v4.app.i r0 = r6.n
            android.content.Context r0 = r0.c()
            r6.a(r7, r0, r13)
            boolean r0 = r7.S
            if (r0 != 0) goto L17a
            android.os.Bundle r0 = r7.f545c
            r6.c(r7, r0, r13)
            android.os.Bundle r0 = r7.f545c
            r7.h(r0)
            android.os.Bundle r0 = r7.f545c
            r6.b(r7, r0, r13)
            goto L181
        L17a:
            android.os.Bundle r0 = r7.f545c
            r7.k(r0)
            r7.f544b = r8
        L181:
            r7.E = r13
            goto L19e
        L184:
            android.support.v4.app.w r0 = new android.support.v4.app.w
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            r1.append(r7)
            java.lang.String r2 = " did not call through to super.onAttach()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L19e:
            r16.d(r17)
            if (r11 <= r8) goto L290
            boolean r0 = android.support.v4.app.k.F
            if (r0 == 0) goto L1bb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto ACTIVITY_CREATED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L1bb:
            boolean r0 = r7.n
            if (r0 != 0) goto L27b
            int r0 = r7.z
            if (r0 == 0) goto L231
            r1 = -1
            if (r0 == r1) goto L212
            android.support.v4.app.g r1 = r6.o
            android.view.View r0 = r1.a(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 != 0) goto L232
            boolean r1 = r7.p
            if (r1 == 0) goto L1d5
            goto L232
        L1d5:
            android.content.res.Resources r0 = r17.t()     // Catch: android.content.res.Resources.NotFoundException -> L1e0
            int r1 = r7.z     // Catch: android.content.res.Resources.NotFoundException -> L1e0
            java.lang.String r0 = r0.getResourceName(r1)     // Catch: android.content.res.Resources.NotFoundException -> L1e0
            goto L1e2
        L1e0:
            java.lang.String r0 = "unknown"
        L1e2:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "No view found for id 0x"
            r2.append(r3)
            int r3 = r7.z
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r3 = " ("
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ") for fragment "
            r2.append(r0)
            r2.append(r7)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            r6.a(r1)
            throw r14
        L212:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot create fragment "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = " for a container view with no id"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r6.a(r0)
            throw r14
        L231:
            r0 = r14
        L232:
            r7.I = r0
            android.os.Bundle r1 = r7.f545c
            android.view.LayoutInflater r1 = r7.i(r1)
            android.os.Bundle r2 = r7.f545c
            r7.b(r1, r0, r2)
            android.view.View r1 = r7.J
            if (r1 == 0) goto L279
            r7.K = r1
            r1.setSaveFromParentEnabled(r13)
            if (r0 == 0) goto L24f
            android.view.View r1 = r7.J
            r0.addView(r1)
        L24f:
            boolean r0 = r7.B
            if (r0 == 0) goto L25a
            android.view.View r0 = r7.J
            r1 = 8
            r0.setVisibility(r1)
        L25a:
            android.view.View r0 = r7.J
            android.os.Bundle r1 = r7.f545c
            r7.a(r0, r1)
            android.view.View r0 = r7.J
            android.os.Bundle r1 = r7.f545c
            r6.a(r7, r0, r1, r13)
            android.view.View r0 = r7.J
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L275
            android.view.ViewGroup r0 = r7.I
            if (r0 == 0) goto L275
            goto L276
        L275:
            r8 = r13
        L276:
            r7.O = r8
            goto L27b
        L279:
            r7.K = r14
        L27b:
            android.os.Bundle r0 = r7.f545c
            r7.g(r0)
            android.os.Bundle r0 = r7.f545c
            r6.a(r7, r0, r13)
            android.view.View r0 = r7.J
            if (r0 == 0) goto L28e
            android.os.Bundle r0 = r7.f545c
            r7.l(r0)
        L28e:
            r7.f545c = r14
        L290:
            if (r11 <= r10) goto L2b0
            boolean r0 = android.support.v4.app.k.F
            if (r0 == 0) goto L2aa
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto STARTED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L2aa:
            r17.V()
            r6.f(r7, r13)
        L2b0:
            if (r11 <= r9) goto L418
            boolean r0 = android.support.v4.app.k.F
            if (r0 == 0) goto L2ca
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto RESUMED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L2ca:
            r17.U()
            r6.e(r7, r13)
            r7.f545c = r14
            r7.d = r14
            goto L418
        L2d6:
            if (r0 <= r11) goto L418
            if (r0 == r8) goto L3a4
            if (r0 == r10) goto L323
            if (r0 == r9) goto L303
            r1 = 4
            if (r0 == r1) goto L2e3
            goto L418
        L2e3:
            if (r11 >= r1) goto L303
            boolean r0 = android.support.v4.app.k.F
            if (r0 == 0) goto L2fd
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom RESUMED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L2fd:
            r17.T()
            r6.d(r7, r13)
        L303:
            if (r11 >= r9) goto L323
            boolean r0 = android.support.v4.app.k.F
            if (r0 == 0) goto L31d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom STARTED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L31d:
            r17.W()
            r6.g(r7, r13)
        L323:
            if (r11 >= r10) goto L3a4
            boolean r0 = android.support.v4.app.k.F
            if (r0 == 0) goto L33d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom ACTIVITY_CREATED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L33d:
            android.view.View r0 = r7.J
            if (r0 == 0) goto L350
            android.support.v4.app.i r0 = r6.n
            boolean r0 = r0.b(r7)
            if (r0 == 0) goto L350
            android.util.SparseArray<android.os.Parcelable> r0 = r7.d
            if (r0 != 0) goto L350
            r16.m(r17)
        L350:
            r17.Q()
            r6.h(r7, r13)
            android.view.View r0 = r7.J
            if (r0 == 0) goto L395
            android.view.ViewGroup r1 = r7.I
            if (r1 == 0) goto L395
            r1.endViewTransition(r0)
            android.view.View r0 = r7.J
            r0.clearAnimation()
            int r0 = r6.m
            r1 = 0
            if (r0 <= 0) goto L386
            boolean r0 = r6.u
            if (r0 != 0) goto L386
            android.view.View r0 = r7.J
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L386
            float r0 = r7.Q
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L386
            r0 = r19
            r2 = r20
            android.support.v4.app.k$g r0 = r6.a(r7, r0, r13, r2)
            goto L387
        L386:
            r0 = r14
        L387:
            r7.Q = r1
            if (r0 == 0) goto L38e
            r6.a(r7, r0, r11)
        L38e:
            android.view.ViewGroup r0 = r7.I
            android.view.View r1 = r7.J
            r0.removeView(r1)
        L395:
            r7.I = r14
            r7.J = r14
            r7.V = r14
            android.arch.lifecycle.j<android.arch.lifecycle.e> r0 = r7.W
            r0.a(r14)
            r7.K = r14
            r7.o = r13
        L3a4:
            if (r11 >= r8) goto L418
            boolean r0 = r6.u
            if (r0 == 0) goto L3cb
            android.view.View r0 = r17.g()
            if (r0 == 0) goto L3bb
            android.view.View r0 = r17.g()
            r7.a(r14)
            r0.clearAnimation()
            goto L3cb
        L3bb:
            android.animation.Animator r0 = r17.h()
            if (r0 == 0) goto L3cb
            android.animation.Animator r0 = r17.h()
            r7.a(r14)
            r0.cancel()
        L3cb:
            android.view.View r0 = r17.g()
            if (r0 != 0) goto L414
            android.animation.Animator r0 = r17.h()
            if (r0 == 0) goto L3d8
            goto L414
        L3d8:
            boolean r0 = android.support.v4.app.k.F
            if (r0 == 0) goto L3f0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom CREATED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L3f0:
            boolean r0 = r7.E
            if (r0 != 0) goto L3fb
            r17.P()
            r6.b(r7, r13)
            goto L3fd
        L3fb:
            r7.f544b = r13
        L3fd:
            r17.R()
            r6.c(r7, r13)
            if (r21 != 0) goto L418
            boolean r0 = r7.E
            if (r0 != 0) goto L40d
            r16.g(r17)
            goto L418
        L40d:
            r7.t = r14
            r7.x = r14
            r7.s = r14
            goto L418
        L414:
            r7.b(r11)
            goto L419
        L418:
            r8 = r11
        L419:
            int r0 = r7.f544b
            if (r0 == r8) goto L44a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveToState: Fragment state for "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = " not updated inline; "
            r0.append(r1)
            java.lang.String r1 = "expected state "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = " found "
            r0.append(r1)
            int r1 = r7.f544b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r12, r0)
            r7.f544b = r8
        L44a:
            return
    }

    void a(android.support.v4.app.e r4, android.content.Context r5, boolean r6) {
            r3 = this;
            android.support.v4.app.e r0 = r3.p
            if (r0 == 0) goto L12
            android.support.v4.app.j r0 = r0.o()
            boolean r1 = r0 instanceof android.support.v4.app.k
            if (r1 == 0) goto L12
            android.support.v4.app.k r0 = (android.support.v4.app.k) r0
            r1 = 1
            r0.a(r4, r5, r1)
        L12:
            java.util.concurrent.CopyOnWriteArrayList<android.support.v4.app.k$j> r0 = r3.l
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            android.support.v4.app.k$j r1 = (android.support.v4.app.k.j) r1
            if (r6 == 0) goto L2a
            boolean r2 = r1.f581b
            if (r2 == 0) goto L18
        L2a:
            android.support.v4.app.j$a r1 = r1.f580a
            r1.a(r3, r4, r5)
            goto L18
        L30:
            return
    }

    void a(android.support.v4.app.e r4, android.os.Bundle r5, boolean r6) {
            r3 = this;
            android.support.v4.app.e r0 = r3.p
            if (r0 == 0) goto L12
            android.support.v4.app.j r0 = r0.o()
            boolean r1 = r0 instanceof android.support.v4.app.k
            if (r1 == 0) goto L12
            android.support.v4.app.k r0 = (android.support.v4.app.k) r0
            r1 = 1
            r0.a(r4, r5, r1)
        L12:
            java.util.concurrent.CopyOnWriteArrayList<android.support.v4.app.k$j> r0 = r3.l
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            android.support.v4.app.k$j r1 = (android.support.v4.app.k.j) r1
            if (r6 == 0) goto L2a
            boolean r2 = r1.f581b
            if (r2 == 0) goto L18
        L2a:
            android.support.v4.app.j$a r1 = r1.f580a
            r1.a(r3, r4, r5)
            goto L18
        L30:
            return
    }

    void a(android.support.v4.app.e r4, android.view.View r5, android.os.Bundle r6, boolean r7) {
            r3 = this;
            android.support.v4.app.e r0 = r3.p
            if (r0 == 0) goto L12
            android.support.v4.app.j r0 = r0.o()
            boolean r1 = r0 instanceof android.support.v4.app.k
            if (r1 == 0) goto L12
            android.support.v4.app.k r0 = (android.support.v4.app.k) r0
            r1 = 1
            r0.a(r4, r5, r6, r1)
        L12:
            java.util.concurrent.CopyOnWriteArrayList<android.support.v4.app.k$j> r0 = r3.l
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            android.support.v4.app.k$j r1 = (android.support.v4.app.k.j) r1
            if (r7 == 0) goto L2a
            boolean r2 = r1.f581b
            if (r2 == 0) goto L18
        L2a:
            android.support.v4.app.j$a r1 = r1.f580a
            r1.a(r3, r4, r5, r6)
            goto L18
        L30:
            return
    }

    public void a(android.support.v4.app.e r4, boolean r5) {
            r3 = this;
            boolean r0 = android.support.v4.app.k.F
            if (r0 == 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "add: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L1a:
            r3.f(r4)
            boolean r0 = r4.C
            if (r0 != 0) goto L68
            java.util.ArrayList<android.support.v4.app.e> r0 = r3.e
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L51
            java.util.ArrayList<android.support.v4.app.e> r0 = r3.e
            monitor-enter(r0)
            java.util.ArrayList<android.support.v4.app.e> r1 = r3.e     // Catch: java.lang.Throwable -> L4e
            r1.add(r4)     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            r0 = 1
            r4.l = r0
            r1 = 0
            r4.m = r1
            android.view.View r2 = r4.J
            if (r2 != 0) goto L3e
            r4.P = r1
        L3e:
            boolean r1 = r4.F
            if (r1 == 0) goto L48
            boolean r1 = r4.G
            if (r1 == 0) goto L48
            r3.r = r0
        L48:
            if (r5 == 0) goto L68
            r3.i(r4)
            goto L68
        L4e:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            throw r3
        L51:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Fragment already added: "
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4)
            throw r3
        L68:
            return
    }

    public void a(android.support.v4.app.i r2, android.support.v4.app.g r3, android.support.v4.app.e r4) {
            r1 = this;
            android.support.v4.app.i r0 = r1.n
            if (r0 != 0) goto Lb
            r1.n = r2
            r1.o = r3
            r1.p = r4
            return
        Lb:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Already attached"
            r1.<init>(r2)
            throw r1
    }

    public void a(android.view.Menu r3) {
            r2 = this;
            int r0 = r2.m
            r1 = 1
            if (r0 >= r1) goto L6
            return
        L6:
            r0 = 0
        L7:
            java.util.ArrayList<android.support.v4.app.e> r1 = r2.e
            int r1 = r1.size()
            if (r0 >= r1) goto L1f
            java.util.ArrayList<android.support.v4.app.e> r1 = r2.e
            java.lang.Object r1 = r1.get(r0)
            android.support.v4.app.e r1 = (android.support.v4.app.e) r1
            if (r1 == 0) goto L1c
            r1.c(r3)
        L1c:
            int r0 = r0 + 1
            goto L7
        L1f:
            return
    }

    @Override // android.support.v4.app.j
    public void a(java.lang.String r7, java.io.FileDescriptor r8, java.io.PrintWriter r9, java.lang.String[] r10) {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.lang.String r1 = "    "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.SparseArray<android.support.v4.app.e> r1 = r6.f
            r2 = 0
            if (r1 == 0) goto L5a
            int r1 = r1.size()
            if (r1 <= 0) goto L5a
            r9.print(r7)
            java.lang.String r3 = "Active Fragments in "
            r9.print(r3)
            int r3 = java.lang.System.identityHashCode(r6)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r9.print(r3)
            java.lang.String r3 = ":"
            r9.println(r3)
            r3 = r2
        L35:
            if (r3 >= r1) goto L5a
            android.util.SparseArray<android.support.v4.app.e> r4 = r6.f
            java.lang.Object r4 = r4.valueAt(r3)
            android.support.v4.app.e r4 = (android.support.v4.app.e) r4
            r9.print(r7)
            java.lang.String r5 = "  #"
            r9.print(r5)
            r9.print(r3)
            java.lang.String r5 = ": "
            r9.print(r5)
            r9.println(r4)
            if (r4 == 0) goto L57
            r4.a(r0, r8, r9, r10)
        L57:
            int r3 = r3 + 1
            goto L35
        L5a:
            java.util.ArrayList<android.support.v4.app.e> r1 = r6.e
            int r1 = r1.size()
            if (r1 <= 0) goto L8f
            r9.print(r7)
            java.lang.String r3 = "Added Fragments:"
            r9.println(r3)
            r3 = r2
        L6b:
            if (r3 >= r1) goto L8f
            java.util.ArrayList<android.support.v4.app.e> r4 = r6.e
            java.lang.Object r4 = r4.get(r3)
            android.support.v4.app.e r4 = (android.support.v4.app.e) r4
            r9.print(r7)
            java.lang.String r5 = "  #"
            r9.print(r5)
            r9.print(r3)
            java.lang.String r5 = ": "
            r9.print(r5)
            java.lang.String r4 = r4.toString()
            r9.println(r4)
            int r3 = r3 + 1
            goto L6b
        L8f:
            java.util.ArrayList<android.support.v4.app.e> r1 = r6.h
            if (r1 == 0) goto Lc6
            int r1 = r1.size()
            if (r1 <= 0) goto Lc6
            r9.print(r7)
            java.lang.String r3 = "Fragments Created Menus:"
            r9.println(r3)
            r3 = r2
        La2:
            if (r3 >= r1) goto Lc6
            java.util.ArrayList<android.support.v4.app.e> r4 = r6.h
            java.lang.Object r4 = r4.get(r3)
            android.support.v4.app.e r4 = (android.support.v4.app.e) r4
            r9.print(r7)
            java.lang.String r5 = "  #"
            r9.print(r5)
            r9.print(r3)
            java.lang.String r5 = ": "
            r9.print(r5)
            java.lang.String r4 = r4.toString()
            r9.println(r4)
            int r3 = r3 + 1
            goto La2
        Lc6:
            java.util.ArrayList<android.support.v4.app.c> r1 = r6.g
            if (r1 == 0) goto L100
            int r1 = r1.size()
            if (r1 <= 0) goto L100
            r9.print(r7)
            java.lang.String r3 = "Back Stack:"
            r9.println(r3)
            r3 = r2
        Ld9:
            if (r3 >= r1) goto L100
            java.util.ArrayList<android.support.v4.app.c> r4 = r6.g
            java.lang.Object r4 = r4.get(r3)
            android.support.v4.app.c r4 = (android.support.v4.app.c) r4
            r9.print(r7)
            java.lang.String r5 = "  #"
            r9.print(r5)
            r9.print(r3)
            java.lang.String r5 = ": "
            r9.print(r5)
            java.lang.String r5 = r4.toString()
            r9.println(r5)
            r4.a(r0, r8, r9, r10)
            int r3 = r3 + 1
            goto Ld9
        L100:
            monitor-enter(r6)
            java.util.ArrayList<android.support.v4.app.c> r8 = r6.i     // Catch: java.lang.Throwable -> L20b
            if (r8 == 0) goto L136
            java.util.ArrayList<android.support.v4.app.c> r8 = r6.i     // Catch: java.lang.Throwable -> L20b
            int r8 = r8.size()     // Catch: java.lang.Throwable -> L20b
            if (r8 <= 0) goto L136
            r9.print(r7)     // Catch: java.lang.Throwable -> L20b
            java.lang.String r10 = "Back Stack Indices:"
            r9.println(r10)     // Catch: java.lang.Throwable -> L20b
            r10 = r2
        L116:
            if (r10 >= r8) goto L136
            java.util.ArrayList<android.support.v4.app.c> r0 = r6.i     // Catch: java.lang.Throwable -> L20b
            java.lang.Object r0 = r0.get(r10)     // Catch: java.lang.Throwable -> L20b
            android.support.v4.app.c r0 = (android.support.v4.app.c) r0     // Catch: java.lang.Throwable -> L20b
            r9.print(r7)     // Catch: java.lang.Throwable -> L20b
            java.lang.String r1 = "  #"
            r9.print(r1)     // Catch: java.lang.Throwable -> L20b
            r9.print(r10)     // Catch: java.lang.Throwable -> L20b
            java.lang.String r1 = ": "
            r9.print(r1)     // Catch: java.lang.Throwable -> L20b
            r9.println(r0)     // Catch: java.lang.Throwable -> L20b
            int r10 = r10 + 1
            goto L116
        L136:
            java.util.ArrayList<java.lang.Integer> r8 = r6.j     // Catch: java.lang.Throwable -> L20b
            if (r8 == 0) goto L157
            java.util.ArrayList<java.lang.Integer> r8 = r6.j     // Catch: java.lang.Throwable -> L20b
            int r8 = r8.size()     // Catch: java.lang.Throwable -> L20b
            if (r8 <= 0) goto L157
            r9.print(r7)     // Catch: java.lang.Throwable -> L20b
            java.lang.String r8 = "mAvailBackStackIndices: "
            r9.print(r8)     // Catch: java.lang.Throwable -> L20b
            java.util.ArrayList<java.lang.Integer> r8 = r6.j     // Catch: java.lang.Throwable -> L20b
            java.lang.Object[] r8 = r8.toArray()     // Catch: java.lang.Throwable -> L20b
            java.lang.String r8 = java.util.Arrays.toString(r8)     // Catch: java.lang.Throwable -> L20b
            r9.println(r8)     // Catch: java.lang.Throwable -> L20b
        L157:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L20b
            java.util.ArrayList<android.support.v4.app.k$l> r8 = r6.f560b
            if (r8 == 0) goto L18a
            int r8 = r8.size()
            if (r8 <= 0) goto L18a
            r9.print(r7)
            java.lang.String r10 = "Pending Actions:"
            r9.println(r10)
        L16a:
            if (r2 >= r8) goto L18a
            java.util.ArrayList<android.support.v4.app.k$l> r10 = r6.f560b
            java.lang.Object r10 = r10.get(r2)
            android.support.v4.app.k$l r10 = (android.support.v4.app.k.l) r10
            r9.print(r7)
            java.lang.String r0 = "  #"
            r9.print(r0)
            r9.print(r2)
            java.lang.String r0 = ": "
            r9.print(r0)
            r9.println(r10)
            int r2 = r2 + 1
            goto L16a
        L18a:
            r9.print(r7)
            java.lang.String r8 = "FragmentManager misc state:"
            r9.println(r8)
            r9.print(r7)
            java.lang.String r8 = "  mHost="
            r9.print(r8)
            android.support.v4.app.i r8 = r6.n
            r9.println(r8)
            r9.print(r7)
            java.lang.String r8 = "  mContainer="
            r9.print(r8)
            android.support.v4.app.g r8 = r6.o
            r9.println(r8)
            android.support.v4.app.e r8 = r6.p
            if (r8 == 0) goto L1bd
            r9.print(r7)
            java.lang.String r8 = "  mParent="
            r9.print(r8)
            android.support.v4.app.e r8 = r6.p
            r9.println(r8)
        L1bd:
            r9.print(r7)
            java.lang.String r8 = "  mCurState="
            r9.print(r8)
            int r8 = r6.m
            r9.print(r8)
            java.lang.String r8 = " mStateSaved="
            r9.print(r8)
            boolean r8 = r6.s
            r9.print(r8)
            java.lang.String r8 = " mStopped="
            r9.print(r8)
            boolean r8 = r6.t
            r9.print(r8)
            java.lang.String r8 = " mDestroyed="
            r9.print(r8)
            boolean r8 = r6.u
            r9.println(r8)
            boolean r8 = r6.r
            if (r8 == 0) goto L1f9
            r9.print(r7)
            java.lang.String r8 = "  mNeedMenuInvalidate="
            r9.print(r8)
            boolean r8 = r6.r
            r9.println(r8)
        L1f9:
            java.lang.String r8 = r6.v
            if (r8 == 0) goto L20a
            r9.print(r7)
            java.lang.String r7 = "  mNoTransactionsBecause="
            r9.print(r7)
            java.lang.String r6 = r6.v
            r9.println(r6)
        L20a:
            return
        L20b:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L20b
            throw r7
    }

    public void a(boolean r3) {
            r2 = this;
            java.util.ArrayList<android.support.v4.app.e> r0 = r2.e
            int r0 = r0.size()
        L6:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L18
            java.util.ArrayList<android.support.v4.app.e> r1 = r2.e
            java.lang.Object r1 = r1.get(r0)
            android.support.v4.app.e r1 = (android.support.v4.app.e) r1
            if (r1 == 0) goto L6
            r1.d(r3)
            goto L6
        L18:
            return
    }

    public boolean a(android.view.Menu r8, android.view.MenuInflater r9) {
            r7 = this;
            int r0 = r7.m
            r1 = 1
            r2 = 0
            if (r0 >= r1) goto L7
            return r2
        L7:
            r0 = 0
            r3 = r2
            r4 = r3
        La:
            java.util.ArrayList<android.support.v4.app.e> r5 = r7.e
            int r5 = r5.size()
            if (r3 >= r5) goto L30
            java.util.ArrayList<android.support.v4.app.e> r5 = r7.e
            java.lang.Object r5 = r5.get(r3)
            android.support.v4.app.e r5 = (android.support.v4.app.e) r5
            if (r5 == 0) goto L2d
            boolean r6 = r5.b(r8, r9)
            if (r6 == 0) goto L2d
            if (r0 != 0) goto L29
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L29:
            r0.add(r5)
            r4 = r1
        L2d:
            int r3 = r3 + 1
            goto La
        L30:
            java.util.ArrayList<android.support.v4.app.e> r8 = r7.h
            if (r8 == 0) goto L52
        L34:
            java.util.ArrayList<android.support.v4.app.e> r8 = r7.h
            int r8 = r8.size()
            if (r2 >= r8) goto L52
            java.util.ArrayList<android.support.v4.app.e> r8 = r7.h
            java.lang.Object r8 = r8.get(r2)
            android.support.v4.app.e r8 = (android.support.v4.app.e) r8
            if (r0 == 0) goto L4c
            boolean r9 = r0.contains(r8)
            if (r9 != 0) goto L4f
        L4c:
            r8.H()
        L4f:
            int r2 = r2 + 1
            goto L34
        L52:
            r7.h = r0
            return r4
    }

    public boolean a(android.view.MenuItem r5) {
            r4 = this;
            int r0 = r4.m
            r1 = 1
            r2 = 0
            if (r0 >= r1) goto L7
            return r2
        L7:
            r0 = r2
        L8:
            java.util.ArrayList<android.support.v4.app.e> r3 = r4.e
            int r3 = r3.size()
            if (r0 >= r3) goto L24
            java.util.ArrayList<android.support.v4.app.e> r3 = r4.e
            java.lang.Object r3 = r3.get(r0)
            android.support.v4.app.e r3 = (android.support.v4.app.e) r3
            if (r3 == 0) goto L21
            boolean r3 = r3.c(r5)
            if (r3 == 0) goto L21
            return r1
        L21:
            int r0 = r0 + 1
            goto L8
        L24:
            return r2
    }

    boolean a(java.util.ArrayList<android.support.v4.app.c> r6, java.util.ArrayList<java.lang.Boolean> r7, java.lang.String r8, int r9, int r10) {
            r5 = this;
            java.util.ArrayList<android.support.v4.app.c> r0 = r5.g
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r2 = 1
            if (r8 != 0) goto L29
            if (r9 >= 0) goto L29
            r3 = r10 & 1
            if (r3 != 0) goto L29
            int r8 = r0.size()
            int r8 = r8 - r2
            if (r8 >= 0) goto L17
            return r1
        L17:
            java.util.ArrayList<android.support.v4.app.c> r5 = r5.g
            java.lang.Object r5 = r5.remove(r8)
            r6.add(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            r7.add(r5)
            goto La4
        L29:
            if (r8 != 0) goto L30
            if (r9 < 0) goto L2e
            goto L30
        L2e:
            r8 = -1
            goto L7e
        L30:
            java.util.ArrayList<android.support.v4.app.c> r0 = r5.g
            int r0 = r0.size()
            int r0 = r0 - r2
        L37:
            if (r0 < 0) goto L58
            java.util.ArrayList<android.support.v4.app.c> r3 = r5.g
            java.lang.Object r3 = r3.get(r0)
            android.support.v4.app.c r3 = (android.support.v4.app.c) r3
            if (r8 == 0) goto L4e
            java.lang.String r4 = r3.b()
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L4e
            goto L58
        L4e:
            if (r9 < 0) goto L55
            int r3 = r3.l
            if (r9 != r3) goto L55
            goto L58
        L55:
            int r0 = r0 + (-1)
            goto L37
        L58:
            if (r0 >= 0) goto L5b
            return r1
        L5b:
            r10 = r10 & r2
            if (r10 == 0) goto L7d
        L5e:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L7d
            java.util.ArrayList<android.support.v4.app.c> r10 = r5.g
            java.lang.Object r10 = r10.get(r0)
            android.support.v4.app.c r10 = (android.support.v4.app.c) r10
            if (r8 == 0) goto L76
            java.lang.String r3 = r10.b()
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L5e
        L76:
            if (r9 < 0) goto L7d
            int r10 = r10.l
            if (r9 != r10) goto L7d
            goto L5e
        L7d:
            r8 = r0
        L7e:
            java.util.ArrayList<android.support.v4.app.c> r9 = r5.g
            int r9 = r9.size()
            int r9 = r9 - r2
            if (r8 != r9) goto L88
            return r1
        L88:
            java.util.ArrayList<android.support.v4.app.c> r9 = r5.g
            int r9 = r9.size()
            int r9 = r9 - r2
        L8f:
            if (r9 <= r8) goto La4
            java.util.ArrayList<android.support.v4.app.c> r10 = r5.g
            java.lang.Object r10 = r10.remove(r9)
            r6.add(r10)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r2)
            r7.add(r10)
            int r9 = r9 + (-1)
            goto L8f
        La4:
            return r2
    }

    public android.support.v4.app.e b(java.lang.String r3) {
            r2 = this;
            android.util.SparseArray<android.support.v4.app.e> r0 = r2.f
            if (r0 == 0) goto L22
            if (r3 == 0) goto L22
            int r0 = r0.size()
            int r0 = r0 + (-1)
        Lc:
            if (r0 < 0) goto L22
            android.util.SparseArray<android.support.v4.app.e> r1 = r2.f
            java.lang.Object r1 = r1.valueAt(r0)
            android.support.v4.app.e r1 = (android.support.v4.app.e) r1
            if (r1 == 0) goto L1f
            android.support.v4.app.e r1 = r1.a(r3)
            if (r1 == 0) goto L1f
            return r1
        L1f:
            int r0 = r0 + (-1)
            goto Lc
        L22:
            r2 = 0
            return r2
    }

    public void b(int r4) {
            r3 = this;
            monitor-enter(r3)
            java.util.ArrayList<android.support.v4.app.c> r0 = r3.i     // Catch: java.lang.Throwable -> L37
            r1 = 0
            r0.set(r4, r1)     // Catch: java.lang.Throwable -> L37
            java.util.ArrayList<java.lang.Integer> r0 = r3.j     // Catch: java.lang.Throwable -> L37
            if (r0 != 0) goto L12
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L37
            r0.<init>()     // Catch: java.lang.Throwable -> L37
            r3.j = r0     // Catch: java.lang.Throwable -> L37
        L12:
            boolean r0 = android.support.v4.app.k.F     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L2c
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37
            r1.<init>()     // Catch: java.lang.Throwable -> L37
            java.lang.String r2 = "Freeing back stack index "
            r1.append(r2)     // Catch: java.lang.Throwable -> L37
            r1.append(r4)     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L37
            android.util.Log.v(r0, r1)     // Catch: java.lang.Throwable -> L37
        L2c:
            java.util.ArrayList<java.lang.Integer> r0 = r3.j     // Catch: java.lang.Throwable -> L37
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L37
            r0.add(r4)     // Catch: java.lang.Throwable -> L37
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L37
            return
        L37:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L37
            throw r4
    }

    void b(android.support.v4.app.e r8) {
            r7 = this;
            android.view.View r0 = r8.J
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L7f
            int r0 = r8.q()
            boolean r3 = r8.B
            r3 = r3 ^ r1
            int r4 = r8.r()
            android.support.v4.app.k$g r0 = r7.a(r8, r0, r3, r4)
            if (r0 == 0) goto L50
            android.animation.Animator r3 = r0.f576b
            if (r3 == 0) goto L50
            android.view.View r4 = r8.J
            r3.setTarget(r4)
            boolean r3 = r8.B
            if (r3 == 0) goto L40
            boolean r3 = r8.B()
            if (r3 == 0) goto L2e
            r8.f(r2)
            goto L45
        L2e:
            android.view.ViewGroup r3 = r8.I
            android.view.View r4 = r8.J
            r3.startViewTransition(r4)
            android.animation.Animator r5 = r0.f576b
            android.support.v4.app.k$d r6 = new android.support.v4.app.k$d
            r6.<init>(r7, r3, r4, r8)
            r5.addListener(r6)
            goto L45
        L40:
            android.view.View r3 = r8.J
            r3.setVisibility(r2)
        L45:
            android.view.View r3 = r8.J
            a(r3, r0)
            android.animation.Animator r0 = r0.f576b
            r0.start()
            goto L7f
        L50:
            if (r0 == 0) goto L63
            android.view.View r3 = r8.J
            a(r3, r0)
            android.view.View r3 = r8.J
            android.view.animation.Animation r4 = r0.f575a
            r3.startAnimation(r4)
            android.view.animation.Animation r0 = r0.f575a
            r0.start()
        L63:
            boolean r0 = r8.B
            if (r0 == 0) goto L70
            boolean r0 = r8.B()
            if (r0 != 0) goto L70
            r0 = 8
            goto L71
        L70:
            r0 = r2
        L71:
            android.view.View r3 = r8.J
            r3.setVisibility(r0)
            boolean r0 = r8.B()
            if (r0 == 0) goto L7f
            r8.f(r2)
        L7f:
            boolean r0 = r8.l
            if (r0 == 0) goto L8d
            boolean r0 = r8.F
            if (r0 == 0) goto L8d
            boolean r0 = r8.G
            if (r0 == 0) goto L8d
            r7.r = r1
        L8d:
            r8.P = r2
            boolean r7 = r8.B
            r8.a(r7)
            return
    }

    void b(android.support.v4.app.e r4, android.content.Context r5, boolean r6) {
            r3 = this;
            android.support.v4.app.e r0 = r3.p
            if (r0 == 0) goto L12
            android.support.v4.app.j r0 = r0.o()
            boolean r1 = r0 instanceof android.support.v4.app.k
            if (r1 == 0) goto L12
            android.support.v4.app.k r0 = (android.support.v4.app.k) r0
            r1 = 1
            r0.b(r4, r5, r1)
        L12:
            java.util.concurrent.CopyOnWriteArrayList<android.support.v4.app.k$j> r0 = r3.l
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            android.support.v4.app.k$j r1 = (android.support.v4.app.k.j) r1
            if (r6 == 0) goto L2a
            boolean r2 = r1.f581b
            if (r2 == 0) goto L18
        L2a:
            android.support.v4.app.j$a r1 = r1.f580a
            r1.b(r3, r4, r5)
            goto L18
        L30:
            return
    }

    void b(android.support.v4.app.e r4, android.os.Bundle r5, boolean r6) {
            r3 = this;
            android.support.v4.app.e r0 = r3.p
            if (r0 == 0) goto L12
            android.support.v4.app.j r0 = r0.o()
            boolean r1 = r0 instanceof android.support.v4.app.k
            if (r1 == 0) goto L12
            android.support.v4.app.k r0 = (android.support.v4.app.k) r0
            r1 = 1
            r0.b(r4, r5, r1)
        L12:
            java.util.concurrent.CopyOnWriteArrayList<android.support.v4.app.k$j> r0 = r3.l
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            android.support.v4.app.k$j r1 = (android.support.v4.app.k.j) r1
            if (r6 == 0) goto L2a
            boolean r2 = r1.f581b
            if (r2 == 0) goto L18
        L2a:
            android.support.v4.app.j$a r1 = r1.f580a
            r1.b(r3, r4, r5)
            goto L18
        L30:
            return
    }

    void b(android.support.v4.app.e r4, boolean r5) {
            r3 = this;
            android.support.v4.app.e r0 = r3.p
            if (r0 == 0) goto L12
            android.support.v4.app.j r0 = r0.o()
            boolean r1 = r0 instanceof android.support.v4.app.k
            if (r1 == 0) goto L12
            android.support.v4.app.k r0 = (android.support.v4.app.k) r0
            r1 = 1
            r0.b(r4, r1)
        L12:
            java.util.concurrent.CopyOnWriteArrayList<android.support.v4.app.k$j> r0 = r3.l
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            android.support.v4.app.k$j r1 = (android.support.v4.app.k.j) r1
            if (r5 == 0) goto L2a
            boolean r2 = r1.f581b
            if (r2 == 0) goto L18
        L2a:
            android.support.v4.app.j$a r1 = r1.f580a
            r1.a(r3, r4)
            goto L18
        L30:
            return
    }

    public void b(boolean r3) {
            r2 = this;
            java.util.ArrayList<android.support.v4.app.e> r0 = r2.e
            int r0 = r0.size()
        L6:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L18
            java.util.ArrayList<android.support.v4.app.e> r1 = r2.e
            java.lang.Object r1 = r1.get(r0)
            android.support.v4.app.e r1 = (android.support.v4.app.e) r1
            if (r1 == 0) goto L6
            r1.e(r3)
            goto L6
        L18:
            return
    }

    @Override // android.support.v4.app.j
    public boolean b() {
            r1 = this;
            boolean r0 = r1.s
            if (r0 != 0) goto Lb
            boolean r1 = r1.t
            if (r1 == 0) goto L9
            goto Lb
        L9:
            r1 = 0
            goto Lc
        Lb:
            r1 = 1
        Lc:
            return r1
    }

    public boolean b(android.view.Menu r5) {
            r4 = this;
            int r0 = r4.m
            r1 = 1
            r2 = 0
            if (r0 >= r1) goto L7
            return r2
        L7:
            r0 = r2
        L8:
            java.util.ArrayList<android.support.v4.app.e> r3 = r4.e
            int r3 = r3.size()
            if (r2 >= r3) goto L24
            java.util.ArrayList<android.support.v4.app.e> r3 = r4.e
            java.lang.Object r3 = r3.get(r2)
            android.support.v4.app.e r3 = (android.support.v4.app.e) r3
            if (r3 == 0) goto L21
            boolean r3 = r3.d(r5)
            if (r3 == 0) goto L21
            r0 = r1
        L21:
            int r2 = r2 + 1
            goto L8
        L24:
            return r0
    }

    public boolean b(android.view.MenuItem r5) {
            r4 = this;
            int r0 = r4.m
            r1 = 1
            r2 = 0
            if (r0 >= r1) goto L7
            return r2
        L7:
            r0 = r2
        L8:
            java.util.ArrayList<android.support.v4.app.e> r3 = r4.e
            int r3 = r3.size()
            if (r0 >= r3) goto L24
            java.util.ArrayList<android.support.v4.app.e> r3 = r4.e
            java.lang.Object r3 = r3.get(r0)
            android.support.v4.app.e r3 = (android.support.v4.app.e) r3
            if (r3 == 0) goto L21
            boolean r3 = r3.d(r5)
            if (r3 == 0) goto L21
            return r1
        L21:
            int r0 = r0 + 1
            goto L8
        L24:
            return r2
    }

    public void c(android.support.v4.app.e r4) {
            r3 = this;
            boolean r0 = android.support.v4.app.k.F
            if (r0 == 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "detach: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L1a:
            boolean r0 = r4.C
            if (r0 != 0) goto L59
            r0 = 1
            r4.C = r0
            boolean r1 = r4.l
            if (r1 == 0) goto L59
            boolean r1 = android.support.v4.app.k.F
            if (r1 == 0) goto L3f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "remove from detach: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.v(r2, r1)
        L3f:
            java.util.ArrayList<android.support.v4.app.e> r1 = r3.e
            monitor-enter(r1)
            java.util.ArrayList<android.support.v4.app.e> r2 = r3.e     // Catch: java.lang.Throwable -> L56
            r2.remove(r4)     // Catch: java.lang.Throwable -> L56
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L56
            boolean r1 = r4.F
            if (r1 == 0) goto L52
            boolean r1 = r4.G
            if (r1 == 0) goto L52
            r3.r = r0
        L52:
            r3 = 0
            r4.l = r3
            goto L59
        L56:
            r3 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L56
            throw r3
        L59:
            return
    }

    void c(android.support.v4.app.e r4, android.os.Bundle r5, boolean r6) {
            r3 = this;
            android.support.v4.app.e r0 = r3.p
            if (r0 == 0) goto L12
            android.support.v4.app.j r0 = r0.o()
            boolean r1 = r0 instanceof android.support.v4.app.k
            if (r1 == 0) goto L12
            android.support.v4.app.k r0 = (android.support.v4.app.k) r0
            r1 = 1
            r0.c(r4, r5, r1)
        L12:
            java.util.concurrent.CopyOnWriteArrayList<android.support.v4.app.k$j> r0 = r3.l
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            android.support.v4.app.k$j r1 = (android.support.v4.app.k.j) r1
            if (r6 == 0) goto L2a
            boolean r2 = r1.f581b
            if (r2 == 0) goto L18
        L2a:
            android.support.v4.app.j$a r1 = r1.f580a
            r1.c(r3, r4, r5)
            goto L18
        L30:
            return
    }

    void c(android.support.v4.app.e r4, boolean r5) {
            r3 = this;
            android.support.v4.app.e r0 = r3.p
            if (r0 == 0) goto L12
            android.support.v4.app.j r0 = r0.o()
            boolean r1 = r0 instanceof android.support.v4.app.k
            if (r1 == 0) goto L12
            android.support.v4.app.k r0 = (android.support.v4.app.k) r0
            r1 = 1
            r0.c(r4, r1)
        L12:
            java.util.concurrent.CopyOnWriteArrayList<android.support.v4.app.k$j> r0 = r3.l
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            android.support.v4.app.k$j r1 = (android.support.v4.app.k.j) r1
            if (r5 == 0) goto L2a
            boolean r2 = r1.f581b
            if (r2 == 0) goto L18
        L2a:
            android.support.v4.app.j$a r1 = r1.f580a
            r1.b(r3, r4)
            goto L18
        L30:
            return
    }

    @Override // android.support.v4.app.j
    public boolean c() {
            r3 = this;
            r3.y()
            r0 = 0
            r1 = -1
            r2 = 0
            boolean r3 = r3.a(r0, r1, r2)
            return r3
    }

    boolean c(int r1) {
            r0 = this;
            int r0 = r0.m
            if (r0 < r1) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public void d() {
            r1 = this;
            r0 = 0
            r1.s = r0
            r1.t = r0
            r0 = 2
            r1.d(r0)
            return
    }

    void d(android.support.v4.app.e r4) {
            r3 = this;
            boolean r0 = r4.n
            if (r0 == 0) goto L3a
            boolean r0 = r4.q
            if (r0 != 0) goto L3a
            android.os.Bundle r0 = r4.f545c
            android.view.LayoutInflater r0 = r4.i(r0)
            android.os.Bundle r1 = r4.f545c
            r2 = 0
            r4.b(r0, r2, r1)
            android.view.View r0 = r4.J
            if (r0 == 0) goto L38
            r4.K = r0
            r1 = 0
            r0.setSaveFromParentEnabled(r1)
            boolean r0 = r4.B
            if (r0 == 0) goto L29
            android.view.View r0 = r4.J
            r2 = 8
            r0.setVisibility(r2)
        L29:
            android.view.View r0 = r4.J
            android.os.Bundle r2 = r4.f545c
            r4.a(r0, r2)
            android.view.View r0 = r4.J
            android.os.Bundle r2 = r4.f545c
            r3.a(r4, r0, r2, r1)
            goto L3a
        L38:
            r4.K = r2
        L3a:
            return
    }

    void d(android.support.v4.app.e r4, android.os.Bundle r5, boolean r6) {
            r3 = this;
            android.support.v4.app.e r0 = r3.p
            if (r0 == 0) goto L12
            android.support.v4.app.j r0 = r0.o()
            boolean r1 = r0 instanceof android.support.v4.app.k
            if (r1 == 0) goto L12
            android.support.v4.app.k r0 = (android.support.v4.app.k) r0
            r1 = 1
            r0.d(r4, r5, r1)
        L12:
            java.util.concurrent.CopyOnWriteArrayList<android.support.v4.app.k$j> r0 = r3.l
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            android.support.v4.app.k$j r1 = (android.support.v4.app.k.j) r1
            if (r6 == 0) goto L2a
            boolean r2 = r1.f581b
            if (r2 == 0) goto L18
        L2a:
            android.support.v4.app.j$a r1 = r1.f580a
            r1.d(r3, r4, r5)
            goto L18
        L30:
            return
    }

    void d(android.support.v4.app.e r4, boolean r5) {
            r3 = this;
            android.support.v4.app.e r0 = r3.p
            if (r0 == 0) goto L12
            android.support.v4.app.j r0 = r0.o()
            boolean r1 = r0 instanceof android.support.v4.app.k
            if (r1 == 0) goto L12
            android.support.v4.app.k r0 = (android.support.v4.app.k) r0
            r1 = 1
            r0.d(r4, r1)
        L12:
            java.util.concurrent.CopyOnWriteArrayList<android.support.v4.app.k$j> r0 = r3.l
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            android.support.v4.app.k$j r1 = (android.support.v4.app.k.j) r1
            if (r5 == 0) goto L2a
            boolean r2 = r1.f581b
            if (r2 == 0) goto L18
        L2a:
            android.support.v4.app.j$a r1 = r1.f580a
            r1.c(r3, r4)
            goto L18
        L30:
            return
    }

    public void e() {
            r1 = this;
            r0 = 0
            r1.s = r0
            r1.t = r0
            r0 = 1
            r1.d(r0)
            return
    }

    public void e(android.support.v4.app.e r2) {
            r1 = this;
            boolean r1 = android.support.v4.app.k.F
            if (r1 == 0) goto L1a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "hide: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.v(r0, r1)
        L1a:
            boolean r1 = r2.B
            if (r1 != 0) goto L26
            r1 = 1
            r2.B = r1
            boolean r0 = r2.P
            r1 = r1 ^ r0
            r2.P = r1
        L26:
            return
    }

    void e(android.support.v4.app.e r4, boolean r5) {
            r3 = this;
            android.support.v4.app.e r0 = r3.p
            if (r0 == 0) goto L12
            android.support.v4.app.j r0 = r0.o()
            boolean r1 = r0 instanceof android.support.v4.app.k
            if (r1 == 0) goto L12
            android.support.v4.app.k r0 = (android.support.v4.app.k) r0
            r1 = 1
            r0.e(r4, r1)
        L12:
            java.util.concurrent.CopyOnWriteArrayList<android.support.v4.app.k$j> r0 = r3.l
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            android.support.v4.app.k$j r1 = (android.support.v4.app.k.j) r1
            if (r5 == 0) goto L2a
            boolean r2 = r1.f581b
            if (r2 == 0) goto L18
        L2a:
            android.support.v4.app.j$a r1 = r1.f580a
            r1.d(r3, r4)
            goto L18
        L30:
            return
    }

    public void f() {
            r1 = this;
            r0 = 1
            r1.u = r0
            r1.n()
            r0 = 0
            r1.d(r0)
            r0 = 0
            r1.n = r0
            r1.o = r0
            r1.p = r0
            return
    }

    void f(android.support.v4.app.e r3) {
            r2 = this;
            int r0 = r3.f
            if (r0 < 0) goto L5
            return
        L5:
            int r0 = r2.d
            int r1 = r0 + 1
            r2.d = r1
            android.support.v4.app.e r1 = r2.p
            r3.a(r0, r1)
            android.util.SparseArray<android.support.v4.app.e> r0 = r2.f
            if (r0 != 0) goto L1b
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r2.f = r0
        L1b:
            android.util.SparseArray<android.support.v4.app.e> r2 = r2.f
            int r0 = r3.f
            r2.put(r0, r3)
            boolean r2 = android.support.v4.app.k.F
            if (r2 == 0) goto L3c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "Allocated fragment index "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "FragmentManager"
            android.util.Log.v(r3, r2)
        L3c:
            return
    }

    void f(android.support.v4.app.e r4, boolean r5) {
            r3 = this;
            android.support.v4.app.e r0 = r3.p
            if (r0 == 0) goto L12
            android.support.v4.app.j r0 = r0.o()
            boolean r1 = r0 instanceof android.support.v4.app.k
            if (r1 == 0) goto L12
            android.support.v4.app.k r0 = (android.support.v4.app.k) r0
            r1 = 1
            r0.f(r4, r1)
        L12:
            java.util.concurrent.CopyOnWriteArrayList<android.support.v4.app.k$j> r0 = r3.l
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            android.support.v4.app.k$j r1 = (android.support.v4.app.k.j) r1
            if (r5 == 0) goto L2a
            boolean r2 = r1.f581b
            if (r2 == 0) goto L18
        L2a:
            android.support.v4.app.j$a r1 = r1.f580a
            r1.e(r3, r4)
            goto L18
        L30:
            return
    }

    public void g() {
            r1 = this;
            r0 = 1
            r1.d(r0)
            return
    }

    void g(android.support.v4.app.e r3) {
            r2 = this;
            int r0 = r3.f
            if (r0 >= 0) goto L5
            return
        L5:
            boolean r0 = android.support.v4.app.k.F
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Freeing fragment index "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L1f:
            android.util.SparseArray<android.support.v4.app.e> r2 = r2.f
            int r0 = r3.f
            r1 = 0
            r2.put(r0, r1)
            r3.z()
            return
    }

    void g(android.support.v4.app.e r4, boolean r5) {
            r3 = this;
            android.support.v4.app.e r0 = r3.p
            if (r0 == 0) goto L12
            android.support.v4.app.j r0 = r0.o()
            boolean r1 = r0 instanceof android.support.v4.app.k
            if (r1 == 0) goto L12
            android.support.v4.app.k r0 = (android.support.v4.app.k) r0
            r1 = 1
            r0.g(r4, r1)
        L12:
            java.util.concurrent.CopyOnWriteArrayList<android.support.v4.app.k$j> r0 = r3.l
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            android.support.v4.app.k$j r1 = (android.support.v4.app.k.j) r1
            if (r5 == 0) goto L2a
            boolean r2 = r1.f581b
            if (r2 == 0) goto L18
        L2a:
            android.support.v4.app.j$a r1 = r1.f580a
            r1.f(r3, r4)
            goto L18
        L30:
            return
    }

    public void h() {
            r2 = this;
            r0 = 0
        L1:
            java.util.ArrayList<android.support.v4.app.e> r1 = r2.e
            int r1 = r1.size()
            if (r0 >= r1) goto L19
            java.util.ArrayList<android.support.v4.app.e> r1 = r2.e
            java.lang.Object r1 = r1.get(r0)
            android.support.v4.app.e r1 = (android.support.v4.app.e) r1
            if (r1 == 0) goto L16
            r1.S()
        L16:
            int r0 = r0 + 1
            goto L1
        L19:
            return
    }

    void h(android.support.v4.app.e r11) {
            r10 = this;
            if (r11 != 0) goto L3
            return
        L3:
            int r0 = r10.m
            boolean r1 = r11.m
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1a
            boolean r1 = r11.C()
            if (r1 == 0) goto L16
            int r0 = java.lang.Math.min(r0, r2)
            goto L1a
        L16:
            int r0 = java.lang.Math.min(r0, r3)
        L1a:
            r6 = r0
            int r7 = r11.q()
            int r8 = r11.r()
            r9 = 0
            r4 = r10
            r5 = r11
            r4.a(r5, r6, r7, r8, r9)
            android.view.View r0 = r11.J
            if (r0 == 0) goto L8c
            android.support.v4.app.e r0 = r10.p(r11)
            if (r0 == 0) goto L4b
            android.view.View r0 = r0.J
            android.view.ViewGroup r1 = r11.I
            int r0 = r1.indexOfChild(r0)
            android.view.View r4 = r11.J
            int r4 = r1.indexOfChild(r4)
            if (r4 >= r0) goto L4b
            r1.removeViewAt(r4)
            android.view.View r4 = r11.J
            r1.addView(r4, r0)
        L4b:
            boolean r0 = r11.O
            if (r0 == 0) goto L8c
            android.view.ViewGroup r0 = r11.I
            if (r0 == 0) goto L8c
            float r0 = r11.Q
            r1 = 0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L5f
            android.view.View r4 = r11.J
            r4.setAlpha(r0)
        L5f:
            r11.Q = r1
            r11.O = r3
            int r0 = r11.q()
            int r1 = r11.r()
            android.support.v4.app.k$g r0 = r10.a(r11, r0, r2, r1)
            if (r0 == 0) goto L8c
            android.view.View r1 = r11.J
            a(r1, r0)
            android.view.animation.Animation r1 = r0.f575a
            if (r1 == 0) goto L80
            android.view.View r0 = r11.J
            r0.startAnimation(r1)
            goto L8c
        L80:
            android.animation.Animator r1 = r0.f576b
            android.view.View r2 = r11.J
            r1.setTarget(r2)
            android.animation.Animator r0 = r0.f576b
            r0.start()
        L8c:
            boolean r0 = r11.P
            if (r0 == 0) goto L93
            r10.b(r11)
        L93:
            return
    }

    void h(android.support.v4.app.e r4, boolean r5) {
            r3 = this;
            android.support.v4.app.e r0 = r3.p
            if (r0 == 0) goto L12
            android.support.v4.app.j r0 = r0.o()
            boolean r1 = r0 instanceof android.support.v4.app.k
            if (r1 == 0) goto L12
            android.support.v4.app.k r0 = (android.support.v4.app.k) r0
            r1 = 1
            r0.h(r4, r1)
        L12:
            java.util.concurrent.CopyOnWriteArrayList<android.support.v4.app.k$j> r0 = r3.l
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            android.support.v4.app.k$j r1 = (android.support.v4.app.k.j) r1
            if (r5 == 0) goto L2a
            boolean r2 = r1.f581b
            if (r2 == 0) goto L18
        L2a:
            android.support.v4.app.j$a r1 = r1.f580a
            r1.g(r3, r4)
            goto L18
        L30:
            return
    }

    public void i() {
            r1 = this;
            r0 = 3
            r1.d(r0)
            return
    }

    void i(android.support.v4.app.e r7) {
            r6 = this;
            int r2 = r6.m
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            r1 = r7
            r0.a(r1, r2, r3, r4, r5)
            return
    }

    public void j() {
            r1 = this;
            r0 = 0
            r1.s = r0
            r1.t = r0
            r0 = 4
            r1.d(r0)
            return
    }

    public void j(android.support.v4.app.e r8) {
            r7 = this;
            boolean r0 = r8.L
            if (r0 == 0) goto L19
            boolean r0 = r7.f561c
            if (r0 == 0) goto Lc
            r8 = 1
            r7.w = r8
            return
        Lc:
            r0 = 0
            r8.L = r0
            int r3 = r7.m
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r7
            r2 = r8
            r1.a(r2, r3, r4, r5, r6)
        L19:
            return
    }

    public void k() {
            r1 = this;
            r0 = 0
            r1.s = r0
            r1.t = r0
            r0 = 3
            r1.d(r0)
            return
    }

    public void k(android.support.v4.app.e r4) {
            r3 = this;
            boolean r0 = android.support.v4.app.k.F
            if (r0 == 0) goto L24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "remove: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = " nesting="
            r0.append(r1)
            int r1 = r4.r
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L24:
            boolean r0 = r4.C()
            r1 = 1
            r0 = r0 ^ r1
            boolean r2 = r4.C
            if (r2 == 0) goto L30
            if (r0 == 0) goto L48
        L30:
            java.util.ArrayList<android.support.v4.app.e> r0 = r3.e
            monitor-enter(r0)
            java.util.ArrayList<android.support.v4.app.e> r2 = r3.e     // Catch: java.lang.Throwable -> L49
            r2.remove(r4)     // Catch: java.lang.Throwable -> L49
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
            boolean r0 = r4.F
            if (r0 == 0) goto L43
            boolean r0 = r4.G
            if (r0 == 0) goto L43
            r3.r = r1
        L43:
            r3 = 0
            r4.l = r3
            r4.m = r1
        L48:
            return
        L49:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
            throw r3
    }

    android.os.Bundle l(android.support.v4.app.e r3) {
            r2 = this;
            android.os.Bundle r0 = r2.A
            if (r0 != 0) goto Lb
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r2.A = r0
        Lb:
            android.os.Bundle r0 = r2.A
            r3.j(r0)
            android.os.Bundle r0 = r2.A
            r1 = 0
            r2.d(r3, r0, r1)
            android.os.Bundle r0 = r2.A
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 != 0) goto L24
            android.os.Bundle r0 = r2.A
            r2.A = r1
            r1 = r0
        L24:
            android.view.View r0 = r3.J
            if (r0 == 0) goto L2b
            r2.m(r3)
        L2b:
            android.util.SparseArray<android.os.Parcelable> r2 = r3.d
            if (r2 == 0) goto L3e
            if (r1 != 0) goto L37
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r1 = r2
        L37:
            android.util.SparseArray<android.os.Parcelable> r2 = r3.d
            java.lang.String r0 = "android:view_state"
            r1.putSparseParcelableArray(r0, r2)
        L3e:
            boolean r2 = r3.M
            if (r2 != 0) goto L51
            if (r1 != 0) goto L4a
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r1 = r2
        L4a:
            boolean r2 = r3.M
            java.lang.String r3 = "android:user_visible_hint"
            r1.putBoolean(r3, r2)
        L51:
            return r1
    }

    public void l() {
            r1 = this;
            r0 = 1
            r1.t = r0
            r0 = 2
            r1.d(r0)
            return
    }

    void m() {
            r1 = this;
            boolean r0 = r1.w
            if (r0 == 0) goto La
            r0 = 0
            r1.w = r0
            r1.w()
        La:
            return
    }

    void m(android.support.v4.app.e r3) {
            r2 = this;
            android.view.View r0 = r3.K
            if (r0 != 0) goto L5
            return
        L5:
            android.util.SparseArray<android.os.Parcelable> r0 = r2.B
            if (r0 != 0) goto L11
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r2.B = r0
            goto L14
        L11:
            r0.clear()
        L14:
            android.view.View r0 = r3.K
            android.util.SparseArray<android.os.Parcelable> r1 = r2.B
            r0.saveHierarchyState(r1)
            android.util.SparseArray<android.os.Parcelable> r0 = r2.B
            int r0 = r0.size()
            if (r0 <= 0) goto L2a
            android.util.SparseArray<android.os.Parcelable> r0 = r2.B
            r3.d = r0
            r3 = 0
            r2.B = r3
        L2a:
            return
    }

    public void n(android.support.v4.app.e r4) {
            r3 = this;
            if (r4 == 0) goto L36
            android.util.SparseArray<android.support.v4.app.e> r0 = r3.f
            int r1 = r4.f
            java.lang.Object r0 = r0.get(r1)
            if (r0 != r4) goto L17
            android.support.v4.app.i r0 = r4.t
            if (r0 == 0) goto L36
            android.support.v4.app.j r0 = r4.o()
            if (r0 != r3) goto L17
            goto L36
        L17:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " is not an active fragment of FragmentManager "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L36:
            r3.q = r4
            return
    }

    public boolean n() {
            r4 = this;
            r0 = 1
            r4.c(r0)
            r1 = 0
        L5:
            java.util.ArrayList<android.support.v4.app.c> r2 = r4.x
            java.util.ArrayList<java.lang.Boolean> r3 = r4.y
            boolean r2 = r4.b(r2, r3)
            if (r2 == 0) goto L22
            r4.f561c = r0
            java.util.ArrayList<android.support.v4.app.c> r1 = r4.x     // Catch: java.lang.Throwable -> L1d
            java.util.ArrayList<java.lang.Boolean> r2 = r4.y     // Catch: java.lang.Throwable -> L1d
            r4.c(r1, r2)     // Catch: java.lang.Throwable -> L1d
            r4.z()
            r1 = r0
            goto L5
        L1d:
            r0 = move-exception
            r4.z()
            throw r0
        L22:
            r4.m()
            r4.x()
            return r1
    }

    android.view.LayoutInflater.Factory2 o() {
            r0 = this;
            return r0
    }

    public void o(android.support.v4.app.e r2) {
            r1 = this;
            boolean r1 = android.support.v4.app.k.F
            if (r1 == 0) goto L1a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "show: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.v(r0, r1)
        L1a:
            boolean r1 = r2.B
            if (r1 == 0) goto L27
            r1 = 0
            r2.B = r1
            boolean r1 = r2.P
            r1 = r1 ^ 1
            r2.P = r1
        L27:
            return
    }

    @Override // android.view.LayoutInflater.Factory2
    public android.view.View onCreateView(android.view.View r13, java.lang.String r14, android.content.Context r15, android.util.AttributeSet r16) {
            r12 = this;
            r0 = r12
            r1 = r15
            r2 = r16
            java.lang.String r3 = "fragment"
            r4 = r14
            boolean r3 = r3.equals(r14)
            r4 = 0
            if (r3 != 0) goto Lf
            return r4
        Lf:
            java.lang.String r3 = "class"
            java.lang.String r3 = r2.getAttributeValue(r4, r3)
            int[] r5 = android.support.v4.app.k.C0028k.f582a
            android.content.res.TypedArray r5 = r15.obtainStyledAttributes(r2, r5)
            r6 = 0
            if (r3 != 0) goto L22
            java.lang.String r3 = r5.getString(r6)
        L22:
            r7 = r3
            r3 = -1
            r8 = 1
            int r9 = r5.getResourceId(r8, r3)
            r10 = 2
            java.lang.String r10 = r5.getString(r10)
            r5.recycle()
            android.support.v4.app.i r5 = r0.n
            android.content.Context r5 = r5.c()
            boolean r5 = android.support.v4.app.e.a(r5, r7)
            if (r5 != 0) goto L3e
            return r4
        L3e:
            if (r13 == 0) goto L44
            int r6 = r13.getId()
        L44:
            if (r6 != r3) goto L69
            if (r9 != r3) goto L69
            if (r10 == 0) goto L4b
            goto L69
        L4b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r16.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": Must specify unique android:id, android:tag, or have a parent with an id for "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L69:
            if (r9 == r3) goto L70
            android.support.v4.app.e r5 = r12.a(r9)
            goto L71
        L70:
            r5 = r4
        L71:
            if (r5 != 0) goto L79
            if (r10 == 0) goto L79
            android.support.v4.app.e r5 = r12.a(r10)
        L79:
            if (r5 != 0) goto L81
            if (r6 == r3) goto L81
            android.support.v4.app.e r5 = r12.a(r6)
        L81:
            boolean r3 = android.support.v4.app.k.F
            if (r3 == 0) goto Laf
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r11 = "onCreateView: id=0x"
            r3.append(r11)
            java.lang.String r11 = java.lang.Integer.toHexString(r9)
            r3.append(r11)
            java.lang.String r11 = " fname="
            r3.append(r11)
            r3.append(r7)
            java.lang.String r11 = " existing="
            r3.append(r11)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.String r11 = "FragmentManager"
            android.util.Log.v(r11, r3)
        Laf:
            if (r5 != 0) goto Ld9
            android.support.v4.app.g r3 = r0.o
            android.support.v4.app.e r5 = r3.a(r15, r7, r4)
            r5.n = r8
            if (r9 == 0) goto Lbd
            r1 = r9
            goto Lbe
        Lbd:
            r1 = r6
        Lbe:
            r5.y = r1
            r5.z = r6
            r5.A = r10
            r5.o = r8
            r5.s = r0
            android.support.v4.app.i r1 = r0.n
            r5.t = r1
            android.content.Context r1 = r1.c()
            android.os.Bundle r3 = r5.f545c
            r5.a(r1, r2, r3)
            r12.a(r5, r8)
            goto Lf0
        Ld9:
            boolean r1 = r5.o
            if (r1 != 0) goto L13b
            r5.o = r8
            android.support.v4.app.i r1 = r0.n
            r5.t = r1
            boolean r3 = r5.E
            if (r3 != 0) goto Lf0
            android.content.Context r1 = r1.c()
            android.os.Bundle r3 = r5.f545c
            r5.a(r1, r2, r3)
        Lf0:
            r6 = r5
            int r1 = r0.m
            if (r1 >= r8) goto L103
            boolean r1 = r6.n
            if (r1 == 0) goto L103
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r12
            r1 = r6
            r0.a(r1, r2, r3, r4, r5)
            goto L106
        L103:
            r12.i(r6)
        L106:
            android.view.View r0 = r6.J
            if (r0 == 0) goto L11f
            if (r9 == 0) goto L10f
            r0.setId(r9)
        L10f:
            android.view.View r0 = r6.J
            java.lang.Object r0 = r0.getTag()
            if (r0 != 0) goto L11c
            android.view.View r0 = r6.J
            r0.setTag(r10)
        L11c:
            android.view.View r0 = r6.J
            return r0
        L11f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = " did not create a view."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L13b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r16.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": Duplicate id 0x"
            r1.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r9)
            r1.append(r2)
            java.lang.String r2 = ", tag "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r2 = ", or parent id 0x"
            r1.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r6)
            r1.append(r2)
            java.lang.String r2 = " with another fragment for "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // android.view.LayoutInflater.Factory
    public android.view.View onCreateView(java.lang.String r2, android.content.Context r3, android.util.AttributeSet r4) {
            r1 = this;
            r0 = 0
            android.view.View r1 = r1.onCreateView(r0, r2, r3, r4)
            return r1
    }

    public android.support.v4.app.e p() {
            r0 = this;
            android.support.v4.app.e r0 = r0.q
            return r0
    }

    public void q() {
            r3 = this;
            r0 = 0
            r3.D = r0
            r0 = 0
            r3.s = r0
            r3.t = r0
            java.util.ArrayList<android.support.v4.app.e> r1 = r3.e
            int r1 = r1.size()
        Le:
            if (r0 >= r1) goto L20
            java.util.ArrayList<android.support.v4.app.e> r2 = r3.e
            java.lang.Object r2 = r2.get(r0)
            android.support.v4.app.e r2 = (android.support.v4.app.e) r2
            if (r2 == 0) goto L1d
            r2.F()
        L1d:
            int r0 = r0 + 1
            goto Le
        L20:
            return
    }

    void r() {
            r2 = this;
            java.util.ArrayList<android.support.v4.app.j$b> r0 = r2.k
            if (r0 == 0) goto L1b
            r0 = 0
        L5:
            java.util.ArrayList<android.support.v4.app.j$b> r1 = r2.k
            int r1 = r1.size()
            if (r0 >= r1) goto L1b
            java.util.ArrayList<android.support.v4.app.j$b> r1 = r2.k
            java.lang.Object r1 = r1.get(r0)
            android.support.v4.app.j$b r1 = (android.support.v4.app.j.b) r1
            r1.a()
            int r0 = r0 + 1
            goto L5
        L1b:
            return
    }

    android.support.v4.app.l s() {
            r1 = this;
            android.support.v4.app.l r0 = r1.D
            a(r0)
            android.support.v4.app.l r1 = r1.D
            return r1
    }

    android.os.Parcelable t() {
            r13 = this;
            r13.B()
            r13.A()
            r13.n()
            r0 = 1
            r13.s = r0
            r1 = 0
            r13.D = r1
            android.util.SparseArray<android.support.v4.app.e> r2 = r13.f
            if (r2 == 0) goto L1bd
            int r2 = r2.size()
            if (r2 > 0) goto L1b
            goto L1bd
        L1b:
            android.util.SparseArray<android.support.v4.app.e> r2 = r13.f
            int r2 = r2.size()
            android.support.v4.app.n[] r3 = new android.support.v4.app.n[r2]
            r4 = 0
            r5 = r4
            r6 = r5
        L26:
            java.lang.String r7 = " has cleared index: "
            java.lang.String r8 = "Failure saving state: active "
            java.lang.String r9 = ": "
            java.lang.String r10 = "FragmentManager"
            if (r5 >= r2) goto Le7
            android.util.SparseArray<android.support.v4.app.e> r11 = r13.f
            java.lang.Object r11 = r11.valueAt(r5)
            android.support.v4.app.e r11 = (android.support.v4.app.e) r11
            if (r11 == 0) goto Le3
            int r6 = r11.f
            if (r6 < 0) goto Lc3
            android.support.v4.app.n r6 = new android.support.v4.app.n
            r6.<init>(r11)
            r3[r5] = r6
            int r7 = r11.f544b
            if (r7 <= 0) goto L9d
            android.os.Bundle r7 = r6.l
            if (r7 != 0) goto L9d
            android.os.Bundle r7 = r13.l(r11)
            r6.l = r7
            android.support.v4.app.e r8 = r11.i
            if (r8 == 0) goto La1
            int r8 = r8.f
            if (r8 < 0) goto L79
            if (r7 != 0) goto L64
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            r6.l = r7
        L64:
            android.os.Bundle r7 = r6.l
            android.support.v4.app.e r8 = r11.i
            java.lang.String r12 = "android:target_state"
            r13.a(r7, r12, r8)
            int r7 = r11.k
            if (r7 == 0) goto La1
            android.os.Bundle r8 = r6.l
            java.lang.String r12 = "android:target_req_state"
            r8.putInt(r12, r7)
            goto La1
        L79:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failure saving state: "
            r2.append(r3)
            r2.append(r11)
            java.lang.String r3 = " has target not in fragment manager: "
            r2.append(r3)
            android.support.v4.app.e r3 = r11.i
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            r13.a(r0)
            throw r1
        L9d:
            android.os.Bundle r7 = r11.f545c
            r6.l = r7
        La1:
            boolean r7 = android.support.v4.app.k.F
            if (r7 == 0) goto Lc1
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Saved state of "
            r7.append(r8)
            r7.append(r11)
            r7.append(r9)
            android.os.Bundle r6 = r6.l
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            android.util.Log.v(r10, r6)
        Lc1:
            r6 = r0
            goto Le3
        Lc3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            r2.append(r11)
            r2.append(r7)
            int r3 = r11.f
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            r13.a(r0)
            throw r1
        Le3:
            int r5 = r5 + 1
            goto L26
        Le7:
            if (r6 != 0) goto Lf3
            boolean r13 = android.support.v4.app.k.F
            if (r13 == 0) goto Lf2
            java.lang.String r13 = "saveAllState: no fragments!"
            android.util.Log.v(r10, r13)
        Lf2:
            return r1
        Lf3:
            java.util.ArrayList<android.support.v4.app.e> r0 = r13.e
            int r0 = r0.size()
            if (r0 <= 0) goto L15d
            int[] r2 = new int[r0]
            r5 = r4
        Lfe:
            if (r5 >= r0) goto L15e
            java.util.ArrayList<android.support.v4.app.e> r6 = r13.e
            java.lang.Object r6 = r6.get(r5)
            android.support.v4.app.e r6 = (android.support.v4.app.e) r6
            int r6 = r6.f
            r2[r5] = r6
            r6 = r2[r5]
            if (r6 < 0) goto L137
            boolean r6 = android.support.v4.app.k.F
            if (r6 == 0) goto L134
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r11 = "saveAllState: adding fragment #"
            r6.append(r11)
            r6.append(r5)
            r6.append(r9)
            java.util.ArrayList<android.support.v4.app.e> r11 = r13.e
            java.lang.Object r11 = r11.get(r5)
            r6.append(r11)
            java.lang.String r6 = r6.toString()
            android.util.Log.v(r10, r6)
        L134:
            int r5 = r5 + 1
            goto Lfe
        L137:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            java.util.ArrayList<android.support.v4.app.e> r4 = r13.e
            java.lang.Object r4 = r4.get(r5)
            r3.append(r4)
            r3.append(r7)
            r2 = r2[r5]
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            r13.a(r0)
            throw r1
        L15d:
            r2 = r1
        L15e:
            java.util.ArrayList<android.support.v4.app.c> r0 = r13.g
            if (r0 == 0) goto L1a2
            int r0 = r0.size()
            if (r0 <= 0) goto L1a2
            android.support.v4.app.d[] r1 = new android.support.v4.app.d[r0]
        L16a:
            if (r4 >= r0) goto L1a2
            android.support.v4.app.d r5 = new android.support.v4.app.d
            java.util.ArrayList<android.support.v4.app.c> r6 = r13.g
            java.lang.Object r6 = r6.get(r4)
            android.support.v4.app.c r6 = (android.support.v4.app.c) r6
            r5.<init>(r6)
            r1[r4] = r5
            boolean r5 = android.support.v4.app.k.F
            if (r5 == 0) goto L19f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "saveAllState: adding back stack #"
            r5.append(r6)
            r5.append(r4)
            r5.append(r9)
            java.util.ArrayList<android.support.v4.app.c> r6 = r13.g
            java.lang.Object r6 = r6.get(r4)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.v(r10, r5)
        L19f:
            int r4 = r4 + 1
            goto L16a
        L1a2:
            android.support.v4.app.m r0 = new android.support.v4.app.m
            r0.<init>()
            r0.f589b = r3
            r0.f590c = r2
            r0.d = r1
            android.support.v4.app.e r1 = r13.q
            if (r1 == 0) goto L1b5
            int r1 = r1.f
            r0.e = r1
        L1b5:
            int r1 = r13.d
            r0.f = r1
            r13.u()
            return r0
        L1bd:
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            java.lang.String r1 = "FragmentManager{"
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " in "
            r0.append(r1)
            android.support.v4.app.e r1 = r2.p
            if (r1 == 0) goto L24
            b.b.c.f.d.a(r1, r0)
            goto L29
        L24:
            android.support.v4.app.i r2 = r2.n
            b.b.c.f.d.a(r2, r0)
        L29:
            java.lang.String r2 = "}}"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    void u() {
            r9 = this;
            android.util.SparseArray<android.support.v4.app.e> r0 = r9.f
            r1 = 0
            if (r0 == 0) goto L9e
            r0 = 0
            r2 = r0
            r3 = r1
            r4 = r3
            r5 = r4
        La:
            android.util.SparseArray<android.support.v4.app.e> r6 = r9.f
            int r6 = r6.size()
            if (r2 >= r6) goto La1
            android.util.SparseArray<android.support.v4.app.e> r6 = r9.f
            java.lang.Object r6 = r6.valueAt(r2)
            android.support.v4.app.e r6 = (android.support.v4.app.e) r6
            if (r6 == 0) goto L9a
            boolean r7 = r6.D
            if (r7 == 0) goto L4e
            if (r3 != 0) goto L27
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L27:
            r3.add(r6)
            android.support.v4.app.e r7 = r6.i
            if (r7 == 0) goto L31
            int r7 = r7.f
            goto L32
        L31:
            r7 = -1
        L32:
            r6.j = r7
            boolean r7 = android.support.v4.app.k.F
            if (r7 == 0) goto L4e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "retainNonConfig: keeping retained "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "FragmentManager"
            android.util.Log.v(r8, r7)
        L4e:
            android.support.v4.app.k r7 = r6.u
            if (r7 == 0) goto L5a
            r7.u()
            android.support.v4.app.k r7 = r6.u
            android.support.v4.app.l r7 = r7.D
            goto L5c
        L5a:
            android.support.v4.app.l r7 = r6.v
        L5c:
            if (r4 != 0) goto L74
            if (r7 == 0) goto L74
            java.util.ArrayList r4 = new java.util.ArrayList
            android.util.SparseArray<android.support.v4.app.e> r8 = r9.f
            int r8 = r8.size()
            r4.<init>(r8)
            r8 = r0
        L6c:
            if (r8 >= r2) goto L74
            r4.add(r1)
            int r8 = r8 + 1
            goto L6c
        L74:
            if (r4 == 0) goto L79
            r4.add(r7)
        L79:
            if (r5 != 0) goto L93
            android.arch.lifecycle.p r7 = r6.w
            if (r7 == 0) goto L93
            java.util.ArrayList r5 = new java.util.ArrayList
            android.util.SparseArray<android.support.v4.app.e> r7 = r9.f
            int r7 = r7.size()
            r5.<init>(r7)
            r7 = r0
        L8b:
            if (r7 >= r2) goto L93
            r5.add(r1)
            int r7 = r7 + 1
            goto L8b
        L93:
            if (r5 == 0) goto L9a
            android.arch.lifecycle.p r6 = r6.w
            r5.add(r6)
        L9a:
            int r2 = r2 + 1
            goto La
        L9e:
            r3 = r1
            r4 = r3
            r5 = r4
        La1:
            if (r3 != 0) goto Laa
            if (r4 != 0) goto Laa
            if (r5 != 0) goto Laa
            r9.D = r1
            goto Lb1
        Laa:
            android.support.v4.app.l r0 = new android.support.v4.app.l
            r0.<init>(r3, r4, r5)
            r9.D = r0
        Lb1:
            return
    }

    void v() {
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList<android.support.v4.app.k$m> r0 = r4.C     // Catch: java.lang.Throwable -> L3b
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L11
            java.util.ArrayList<android.support.v4.app.k$m> r0 = r4.C     // Catch: java.lang.Throwable -> L3b
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L3b
            if (r0 != 0) goto L11
            r0 = r2
            goto L12
        L11:
            r0 = r1
        L12:
            java.util.ArrayList<android.support.v4.app.k$l> r3 = r4.f560b     // Catch: java.lang.Throwable -> L3b
            if (r3 == 0) goto L1f
            java.util.ArrayList<android.support.v4.app.k$l> r3 = r4.f560b     // Catch: java.lang.Throwable -> L3b
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L3b
            if (r3 != r2) goto L1f
            r1 = r2
        L1f:
            if (r0 != 0) goto L23
            if (r1 == 0) goto L39
        L23:
            android.support.v4.app.i r0 = r4.n     // Catch: java.lang.Throwable -> L3b
            android.os.Handler r0 = r0.e()     // Catch: java.lang.Throwable -> L3b
            java.lang.Runnable r1 = r4.E     // Catch: java.lang.Throwable -> L3b
            r0.removeCallbacks(r1)     // Catch: java.lang.Throwable -> L3b
            android.support.v4.app.i r0 = r4.n     // Catch: java.lang.Throwable -> L3b
            android.os.Handler r0 = r0.e()     // Catch: java.lang.Throwable -> L3b
            java.lang.Runnable r1 = r4.E     // Catch: java.lang.Throwable -> L3b
            r0.post(r1)     // Catch: java.lang.Throwable -> L3b
        L39:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3b
            return
        L3b:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3b
            throw r0
    }

    void w() {
            r2 = this;
            android.util.SparseArray<android.support.v4.app.e> r0 = r2.f
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
        L6:
            android.util.SparseArray<android.support.v4.app.e> r1 = r2.f
            int r1 = r1.size()
            if (r0 >= r1) goto L1e
            android.util.SparseArray<android.support.v4.app.e> r1 = r2.f
            java.lang.Object r1 = r1.valueAt(r0)
            android.support.v4.app.e r1 = (android.support.v4.app.e) r1
            if (r1 == 0) goto L1b
            r2.j(r1)
        L1b:
            int r0 = r0 + 1
            goto L6
        L1e:
            return
    }
}
