package android.support.v4.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements android.view.View.OnTouchListener {
    private static final int s = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final android.support.v4.widget.a.C0029a f638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.view.animation.Interpolator f639c;
    final android.view.View d;
    private java.lang.Runnable e;
    private float[] f;
    private float[] g;
    private int h;
    private int i;
    private float[] j;
    private float[] k;
    private float[] l;
    private boolean m;
    boolean n;
    boolean o;
    boolean p;
    private boolean q;
    private boolean r;

    /* JADX INFO: renamed from: android.support.v4.widget.a$a, reason: collision with other inner class name */
    private static class C0029a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f641b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f642c;
        private float d;
        private long e;
        private long f;
        private int g;
        private int h;
        private long i;
        private float j;
        private int k;

        C0029a() {
                r2 = this;
                r2.<init>()
                r0 = -9223372036854775808
                r2.e = r0
                r0 = -1
                r2.i = r0
                r0 = 0
                r2.f = r0
                r0 = 0
                r2.g = r0
                r2.h = r0
                return
        }

        private float a(float r2) {
                r1 = this;
                r1 = -1065353216(0xffffffffc0800000, float:-4.0)
                float r1 = r1 * r2
                float r1 = r1 * r2
                r0 = 1082130432(0x40800000, float:4.0)
                float r2 = r2 * r0
                float r1 = r1 + r2
                return r1
        }

        private float a(long r7) {
                r6 = this;
                long r0 = r6.e
                int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                r1 = 0
                if (r0 >= 0) goto L8
                return r1
            L8:
                long r2 = r6.i
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                r4 = 1065353216(0x3f800000, float:1.0)
                if (r0 < 0) goto L28
                int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                if (r0 >= 0) goto L17
                goto L28
            L17:
                long r7 = r7 - r2
                float r0 = r6.j
                float r2 = r4 - r0
                float r7 = (float) r7
                int r6 = r6.k
                float r6 = (float) r6
                float r7 = r7 / r6
                float r6 = android.support.v4.widget.a.a(r7, r1, r4)
                float r0 = r0 * r6
                float r2 = r2 + r0
                return r2
            L28:
                long r2 = r6.e
                long r7 = r7 - r2
                r0 = 1056964608(0x3f000000, float:0.5)
                float r7 = (float) r7
                int r6 = r6.f640a
                float r6 = (float) r6
                float r7 = r7 / r6
                float r6 = android.support.v4.widget.a.a(r7, r1, r4)
                float r6 = r6 * r0
                return r6
        }

        public void a() {
                r5 = this;
                long r0 = r5.f
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto L29
                long r0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
                float r2 = r5.a(r0)
                float r2 = r5.a(r2)
                long r3 = r5.f
                long r3 = r0 - r3
                r5.f = r0
                float r0 = (float) r3
                float r0 = r0 * r2
                float r1 = r5.f642c
                float r1 = r1 * r0
                int r1 = (int) r1
                r5.g = r1
                float r1 = r5.d
                float r0 = r0 * r1
                int r0 = (int) r0
                r5.h = r0
                return
            L29:
                java.lang.RuntimeException r5 = new java.lang.RuntimeException
                java.lang.String r0 = "Cannot compute scroll delta before calling start()"
                r5.<init>(r0)
                throw r5
        }

        public void a(float r1, float r2) {
                r0 = this;
                r0.f642c = r1
                r0.d = r2
                return
        }

        public void a(int r1) {
                r0 = this;
                r0.f641b = r1
                return
        }

        public int b() {
                r0 = this;
                int r0 = r0.g
                return r0
        }

        public void b(int r1) {
                r0 = this;
                r0.f640a = r1
                return
        }

        public int c() {
                r0 = this;
                int r0 = r0.h
                return r0
        }

        public int d() {
                r1 = this;
                float r1 = r1.f642c
                float r0 = java.lang.Math.abs(r1)
                float r1 = r1 / r0
                int r1 = (int) r1
                return r1
        }

        public int e() {
                r1 = this;
                float r1 = r1.d
                float r0 = java.lang.Math.abs(r1)
                float r1 = r1 / r0
                int r1 = (int) r1
                return r1
        }

        public boolean f() {
                r6 = this;
                long r0 = r6.i
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 <= 0) goto L18
                long r0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
                long r2 = r6.i
                int r6 = r6.k
                long r4 = (long) r6
                long r2 = r2 + r4
                int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r6 <= 0) goto L18
                r6 = 1
                goto L19
            L18:
                r6 = 0
            L19:
                return r6
        }

        public void g() {
                r5 = this;
                long r0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
                long r2 = r5.e
                long r2 = r0 - r2
                int r2 = (int) r2
                int r3 = r5.f641b
                r4 = 0
                int r2 = android.support.v4.widget.a.a(r2, r4, r3)
                r5.k = r2
                float r2 = r5.a(r0)
                r5.j = r2
                r5.i = r0
                return
        }

        public void h() {
                r4 = this;
                long r0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
                r4.e = r0
                r2 = -1
                r4.i = r2
                r4.f = r0
                r0 = 1056964608(0x3f000000, float:0.5)
                r4.j = r0
                r0 = 0
                r4.g = r0
                r4.h = r0
                return
        }
    }

    private class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.support.v4.widget.a f643b;

        b(android.support.v4.widget.a r1) {
                r0 = this;
                r0.f643b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                android.support.v4.widget.a r0 = r4.f643b
                boolean r1 = r0.p
                if (r1 != 0) goto L7
                return
            L7:
                boolean r1 = r0.n
                r2 = 0
                if (r1 == 0) goto L13
                r0.n = r2
                android.support.v4.widget.a$a r0 = r0.f638b
                r0.h()
            L13:
                android.support.v4.widget.a r0 = r4.f643b
                android.support.v4.widget.a$a r0 = r0.f638b
                boolean r1 = r0.f()
                if (r1 != 0) goto L49
                android.support.v4.widget.a r1 = r4.f643b
                boolean r1 = r1.b()
                if (r1 != 0) goto L26
                goto L49
            L26:
                android.support.v4.widget.a r1 = r4.f643b
                boolean r3 = r1.o
                if (r3 == 0) goto L31
                r1.o = r2
                r1.a()
            L31:
                r0.a()
                int r1 = r0.b()
                int r0 = r0.c()
                android.support.v4.widget.a r2 = r4.f643b
                r2.a(r1, r0)
                android.support.v4.widget.a r0 = r4.f643b
                android.view.View r0 = r0.d
                b.b.c.g.q.a(r0, r4)
                return
            L49:
                android.support.v4.widget.a r4 = r4.f643b
                r4.p = r2
                return
        }
    }

    static {
            int r0 = android.view.ViewConfiguration.getTapTimeout()
            android.support.v4.widget.a.s = r0
            return
    }

    public a(android.view.View r4) {
            r3 = this;
            r3.<init>()
            android.support.v4.widget.a$a r0 = new android.support.v4.widget.a$a
            r0.<init>()
            r3.f638b = r0
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>()
            r3.f639c = r0
            r0 = 2
            float[] r1 = new float[r0]
            r1 = {x007a: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            r3.f = r1
            float[] r1 = new float[r0]
            r1 = {x0082: FILL_ARRAY_DATA , data: [2139095039, 2139095039} // fill-array
            r3.g = r1
            float[] r1 = new float[r0]
            r1 = {x008a: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            r3.j = r1
            float[] r1 = new float[r0]
            r1 = {x0092: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            r3.k = r1
            float[] r0 = new float[r0]
            r0 = {x009a: FILL_ARRAY_DATA , data: [2139095039, 2139095039} // fill-array
            r3.l = r0
            r3.d = r4
            android.content.res.Resources r4 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            r0 = 1153753088(0x44c4e000, float:1575.0)
            float r0 = r0 * r4
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r0 = (int) r0
            r2 = 1134395392(0x439d8000, float:315.0)
            float r4 = r4 * r2
            float r4 = r4 + r1
            int r4 = (int) r4
            float r0 = (float) r0
            r3.b(r0, r0)
            float r4 = (float) r4
            r3.c(r4, r4)
            r4 = 1
            r3.d(r4)
            r4 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r3.a(r4, r4)
            r4 = 1045220557(0x3e4ccccd, float:0.2)
            r3.d(r4, r4)
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.e(r4, r4)
            int r4 = android.support.v4.widget.a.s
            r3.c(r4)
            r4 = 500(0x1f4, float:7.0E-43)
            r3.f(r4)
            r3.e(r4)
            return
    }

    static float a(float r1, float r2, float r3) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L5
            return r3
        L5:
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 >= 0) goto La
            return r2
        La:
            return r1
    }

    private float a(float r2, float r3, float r4, float r5) {
            r1 = this;
            float r2 = r2 * r3
            r0 = 0
            float r2 = a(r2, r0, r4)
            float r4 = r1.f(r5, r2)
            float r3 = r3 - r5
            float r2 = r1.f(r3, r2)
            float r2 = r2 - r4
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 >= 0) goto L1d
            android.view.animation.Interpolator r1 = r1.f639c
            float r2 = -r2
            float r1 = r1.getInterpolation(r2)
            float r1 = -r1
            goto L27
        L1d:
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 <= 0) goto L30
            android.view.animation.Interpolator r1 = r1.f639c
            float r1 = r1.getInterpolation(r2)
        L27:
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3 = 1065353216(0x3f800000, float:1.0)
            float r1 = a(r1, r2, r3)
            return r1
        L30:
            return r0
    }

    private float a(int r3, float r4, float r5, float r6) {
            r2 = this;
            float[] r0 = r2.f
            r0 = r0[r3]
            float[] r1 = r2.g
            r1 = r1[r3]
            float r4 = r2.a(r0, r5, r1, r4)
            r5 = 0
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r0 != 0) goto L12
            return r5
        L12:
            float[] r5 = r2.j
            r5 = r5[r3]
            float[] r1 = r2.k
            r1 = r1[r3]
            float[] r2 = r2.l
            r2 = r2[r3]
            float r5 = r5 * r6
            if (r0 <= 0) goto L27
            float r4 = r4 * r5
            float r2 = a(r4, r1, r2)
            return r2
        L27:
            float r3 = -r4
            float r3 = r3 * r5
            float r2 = a(r3, r1, r2)
            float r2 = -r2
            return r2
    }

    static int a(int r0, int r1, int r2) {
            if (r0 <= r2) goto L3
            return r2
        L3:
            if (r0 >= r1) goto L6
            return r1
        L6:
            return r0
    }

    private void c() {
            r1 = this;
            boolean r0 = r1.n
            if (r0 == 0) goto L8
            r0 = 0
            r1.p = r0
            goto Ld
        L8:
            android.support.v4.widget.a$a r1 = r1.f638b
            r1.g()
        Ld:
            return
    }

    private void d() {
            r6 = this;
            java.lang.Runnable r0 = r6.e
            if (r0 != 0) goto Lb
            android.support.v4.widget.a$b r0 = new android.support.v4.widget.a$b
            r0.<init>(r6)
            r6.e = r0
        Lb:
            r0 = 1
            r6.p = r0
            r6.n = r0
            boolean r1 = r6.m
            if (r1 != 0) goto L21
            int r1 = r6.i
            if (r1 <= 0) goto L21
            android.view.View r2 = r6.d
            java.lang.Runnable r3 = r6.e
            long r4 = (long) r1
            b.b.c.g.q.a(r2, r3, r4)
            goto L26
        L21:
            java.lang.Runnable r1 = r6.e
            r1.run()
        L26:
            r6.m = r0
            return
    }

    private float f(float r5, float r6) {
            r4 = this;
            r0 = 0
            int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r1 != 0) goto L6
            return r0
        L6:
            int r1 = r4.h
            r2 = 1
            if (r1 == 0) goto L18
            if (r1 == r2) goto L18
            r4 = 2
            if (r1 == r4) goto L11
            goto L2e
        L11:
            int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r4 >= 0) goto L2e
            float r4 = -r6
            float r5 = r5 / r4
            return r5
        L18:
            int r1 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r1 >= 0) goto L2e
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r1 < 0) goto L25
            float r5 = r5 / r6
            float r3 = r3 - r5
            return r3
        L25:
            boolean r5 = r4.p
            if (r5 == 0) goto L2e
            int r4 = r4.h
            if (r4 != r2) goto L2e
            return r3
        L2e:
            return r0
    }

    public android.support.v4.widget.a a(float r3, float r4) {
            r2 = this;
            float[] r0 = r2.g
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            return r2
    }

    public android.support.v4.widget.a a(boolean r2) {
            r1 = this;
            boolean r0 = r1.q
            if (r0 == 0) goto L9
            if (r2 != 0) goto L9
            r1.c()
        L9:
            r1.q = r2
            return r1
    }

    void a() {
            r8 = this;
            long r2 = android.os.SystemClock.uptimeMillis()
            r4 = 3
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = r2
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r0, r2, r4, r5, r6, r7)
            android.view.View r8 = r8.d
            r8.onTouchEvent(r0)
            r0.recycle()
            return
    }

    public abstract void a(int r1, int r2);

    public abstract boolean a(int r1);

    public android.support.v4.widget.a b(float r4, float r5) {
            r3 = this;
            float[] r0 = r3.l
            r1 = 1148846080(0x447a0000, float:1000.0)
            float r4 = r4 / r1
            r2 = 0
            r0[r2] = r4
            float r5 = r5 / r1
            r4 = 1
            r0[r4] = r5
            return r3
    }

    boolean b() {
            r2 = this;
            android.support.v4.widget.a$a r0 = r2.f638b
            int r1 = r0.e()
            int r0 = r0.d()
            if (r1 == 0) goto L12
            boolean r1 = r2.b(r1)
            if (r1 != 0) goto L1a
        L12:
            if (r0 == 0) goto L1c
            boolean r2 = r2.a(r0)
            if (r2 == 0) goto L1c
        L1a:
            r2 = 1
            goto L1d
        L1c:
            r2 = 0
        L1d:
            return r2
    }

    public abstract boolean b(int r1);

    public android.support.v4.widget.a c(float r4, float r5) {
            r3 = this;
            float[] r0 = r3.k
            r1 = 1148846080(0x447a0000, float:1000.0)
            float r4 = r4 / r1
            r2 = 0
            r0[r2] = r4
            float r5 = r5 / r1
            r4 = 1
            r0[r4] = r5
            return r3
    }

    public android.support.v4.widget.a c(int r1) {
            r0 = this;
            r0.i = r1
            return r0
    }

    public android.support.v4.widget.a d(float r3, float r4) {
            r2 = this;
            float[] r0 = r2.f
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            return r2
    }

    public android.support.v4.widget.a d(int r1) {
            r0 = this;
            r0.h = r1
            return r0
    }

    public android.support.v4.widget.a e(float r4, float r5) {
            r3 = this;
            float[] r0 = r3.j
            r1 = 1148846080(0x447a0000, float:1000.0)
            float r4 = r4 / r1
            r2 = 0
            r0[r2] = r4
            float r5 = r5 / r1
            r4 = 1
            r0[r4] = r5
            return r3
    }

    public android.support.v4.widget.a e(int r2) {
            r1 = this;
            android.support.v4.widget.a$a r0 = r1.f638b
            r0.a(r2)
            return r1
    }

    public android.support.v4.widget.a f(int r2) {
            r1 = this;
            android.support.v4.widget.a$a r0 = r1.f638b
            r0.b(r2)
            return r1
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
            r5 = this;
            boolean r0 = r5.q
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.c()
            goto L58
        L1a:
            r5.o = r2
            r5.m = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.d
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.a(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.d
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.a(r2, r7, r6, r3)
            android.support.v4.widget.a$a r7 = r5.f638b
            r7.a(r0, r6)
            boolean r6 = r5.p
            if (r6 != 0) goto L58
            boolean r6 = r5.b()
            if (r6 == 0) goto L58
            r5.d()
        L58:
            boolean r6 = r5.r
            if (r6 == 0) goto L61
            boolean r5 = r5.p
            if (r5 == 0) goto L61
            r1 = r2
        L61:
            return r1
    }
}
