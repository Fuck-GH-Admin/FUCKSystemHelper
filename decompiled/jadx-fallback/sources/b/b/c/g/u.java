package b.b.c.g;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.ref.WeakReference<android.view.View> f1126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    java.lang.Runnable f1127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    java.lang.Runnable f1128c;
    int d;

    class a extends android.animation.AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b.b.c.g.v f1129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.view.View f1130b;

        a(b.b.c.g.u r1, b.b.c.g.v r2, android.view.View r3) {
                r0 = this;
                r0.f1129a = r2
                r0.f1130b = r3
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator r1) {
                r0 = this;
                b.b.c.g.v r1 = r0.f1129a
                android.view.View r0 = r0.f1130b
                r1.c(r0)
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r1) {
                r0 = this;
                b.b.c.g.v r1 = r0.f1129a
                android.view.View r0 = r0.f1130b
                r1.a(r0)
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r1) {
                r0 = this;
                b.b.c.g.v r1 = r0.f1129a
                android.view.View r0 = r0.f1130b
                r1.b(r0)
                return
        }
    }

    class b implements android.animation.ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b.b.c.g.x f1131a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.view.View f1132b;

        b(b.b.c.g.u r1, b.b.c.g.x r2, android.view.View r3) {
                r0 = this;
                r0.f1131a = r2
                r0.f1132b = r3
                r0.<init>()
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator r1) {
                r0 = this;
                b.b.c.g.x r1 = r0.f1131a
                android.view.View r0 = r0.f1132b
                r1.a(r0)
                return
        }
    }

    static class c implements b.b.c.g.v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        b.b.c.g.u f1133a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f1134b;

        c(b.b.c.g.u r1) {
                r0 = this;
                r0.<init>()
                r0.f1133a = r1
                return
        }

        @Override // b.b.c.g.v
        public void a(android.view.View r4) {
                r3 = this;
                b.b.c.g.u r0 = r3.f1133a
                int r0 = r0.d
                r1 = -1
                r2 = 0
                if (r0 <= r1) goto Lf
                r4.setLayerType(r0, r2)
                b.b.c.g.u r0 = r3.f1133a
                r0.d = r1
            Lf:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 16
                if (r0 >= r1) goto L19
                boolean r0 = r3.f1134b
                if (r0 != 0) goto L39
            L19:
                b.b.c.g.u r0 = r3.f1133a
                java.lang.Runnable r1 = r0.f1128c
                if (r1 == 0) goto L24
                r0.f1128c = r2
                r1.run()
            L24:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r1 = r0 instanceof b.b.c.g.v
                if (r1 == 0) goto L31
                r2 = r0
                b.b.c.g.v r2 = (b.b.c.g.v) r2
            L31:
                if (r2 == 0) goto L36
                r2.a(r4)
            L36:
                r4 = 1
                r3.f1134b = r4
            L39:
                return
        }

        @Override // b.b.c.g.v
        public void b(android.view.View r4) {
                r3 = this;
                r0 = 0
                r3.f1134b = r0
                b.b.c.g.u r0 = r3.f1133a
                int r0 = r0.d
                r1 = 0
                r2 = -1
                if (r0 <= r2) goto Lf
                r0 = 2
                r4.setLayerType(r0, r1)
            Lf:
                b.b.c.g.u r3 = r3.f1133a
                java.lang.Runnable r0 = r3.f1127b
                if (r0 == 0) goto L1a
                r3.f1127b = r1
                r0.run()
            L1a:
                r3 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r3 = r4.getTag(r3)
                boolean r0 = r3 instanceof b.b.c.g.v
                if (r0 == 0) goto L27
                r1 = r3
                b.b.c.g.v r1 = (b.b.c.g.v) r1
            L27:
                if (r1 == 0) goto L2c
                r1.b(r4)
            L2c:
                return
        }

        @Override // b.b.c.g.v
        public void c(android.view.View r2) {
                r1 = this;
                r1 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r1 = r2.getTag(r1)
                boolean r0 = r1 instanceof b.b.c.g.v
                if (r0 == 0) goto Ld
                b.b.c.g.v r1 = (b.b.c.g.v) r1
                goto Le
            Ld:
                r1 = 0
            Le:
                if (r1 == 0) goto L13
                r1.c(r2)
            L13:
                return
        }
    }

    u(android.view.View r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f1127b = r0
            r1.f1128c = r0
            r0 = -1
            r1.d = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.f1126a = r0
            return
    }

    private void a(android.view.View r3, b.b.c.g.v r4) {
            r2 = this;
            if (r4 == 0) goto Lf
            android.view.ViewPropertyAnimator r0 = r3.animate()
            b.b.c.g.u$a r1 = new b.b.c.g.u$a
            r1.<init>(r2, r4, r3)
            r0.setListener(r1)
            goto L17
        Lf:
            android.view.ViewPropertyAnimator r2 = r3.animate()
            r3 = 0
            r2.setListener(r3)
        L17:
            return
    }

    public b.b.c.g.u a(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f1126a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.alpha(r2)
        L11:
            return r1
    }

    public b.b.c.g.u a(long r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f1126a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.setDuration(r2)
        L11:
            return r1
    }

    public b.b.c.g.u a(android.view.animation.Interpolator r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f1126a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.setInterpolator(r2)
        L11:
            return r1
    }

    public b.b.c.g.u a(b.b.c.g.v r4) {
            r3 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r3.f1126a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L1e
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 16
            if (r1 < r2) goto L11
            goto L1b
        L11:
            r1 = 2113929216(0x7e000000, float:4.2535296E37)
            r0.setTag(r1, r4)
            b.b.c.g.u$c r4 = new b.b.c.g.u$c
            r4.<init>(r3)
        L1b:
            r3.a(r0, r4)
        L1e:
            return r3
    }

    public b.b.c.g.u a(b.b.c.g.x r4) {
            r3 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r3.f1126a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L1f
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 19
            if (r1 < r2) goto L1f
            r1 = 0
            if (r4 == 0) goto L18
            b.b.c.g.u$b r1 = new b.b.c.g.u$b
            r1.<init>(r3, r4, r0)
        L18:
            android.view.ViewPropertyAnimator r4 = r0.animate()
            r4.setUpdateListener(r1)
        L1f:
            return r3
    }

    public void a() {
            r0 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r0.f1126a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.cancel()
        L11:
            return
    }

    public long b() {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r2 = r2.f1126a
            java.lang.Object r2 = r2.get()
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L13
            android.view.ViewPropertyAnimator r2 = r2.animate()
            long r0 = r2.getDuration()
            return r0
        L13:
            r0 = 0
            return r0
    }

    public b.b.c.g.u b(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f1126a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.translationY(r2)
        L11:
            return r1
    }

    public b.b.c.g.u b(long r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f1126a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.setStartDelay(r2)
        L11:
            return r1
    }

    public void c() {
            r0 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r0.f1126a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.start()
        L11:
            return
    }
}
