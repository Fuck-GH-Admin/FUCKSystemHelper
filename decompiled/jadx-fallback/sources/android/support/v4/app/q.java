package android.support.v4.app;

/* JADX INFO: loaded from: classes.dex */
class q extends android.support.v4.app.r {

    class a extends android.transition.Transition.EpicenterCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.graphics.Rect f606a;

        a(android.support.v4.app.q r1, android.graphics.Rect r2) {
                r0 = this;
                r0.f606a = r2
                r0.<init>()
                return
        }

        @Override // android.transition.Transition.EpicenterCallback
        public android.graphics.Rect onGetEpicenter(android.transition.Transition r1) {
                r0 = this;
                android.graphics.Rect r0 = r0.f606a
                return r0
        }
    }

    class b implements android.transition.Transition.TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.view.View f607a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.util.ArrayList f608b;

        b(android.support.v4.app.q r1, android.view.View r2, java.util.ArrayList r3) {
                r0 = this;
                r0.f607a = r2
                r0.f608b = r3
                r0.<init>()
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(android.transition.Transition r1) {
                r0 = this;
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(android.transition.Transition r4) {
                r3 = this;
                r4.removeListener(r3)
                android.view.View r4 = r3.f607a
                r0 = 8
                r4.setVisibility(r0)
                java.util.ArrayList r4 = r3.f608b
                int r4 = r4.size()
                r0 = 0
                r1 = r0
            L12:
                if (r1 >= r4) goto L22
                java.util.ArrayList r2 = r3.f608b
                java.lang.Object r2 = r2.get(r1)
                android.view.View r2 = (android.view.View) r2
                r2.setVisibility(r0)
                int r1 = r1 + 1
                goto L12
            L22:
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(android.transition.Transition r1) {
                r0 = this;
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(android.transition.Transition r1) {
                r0 = this;
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(android.transition.Transition r1) {
                r0 = this;
                return
        }
    }

    class c implements android.transition.Transition.TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f609a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.util.ArrayList f610b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f611c;
        final /* synthetic */ java.util.ArrayList d;
        final /* synthetic */ java.lang.Object e;
        final /* synthetic */ java.util.ArrayList f;
        final /* synthetic */ android.support.v4.app.q g;

        c(android.support.v4.app.q r1, java.lang.Object r2, java.util.ArrayList r3, java.lang.Object r4, java.util.ArrayList r5, java.lang.Object r6, java.util.ArrayList r7) {
                r0 = this;
                r0.g = r1
                r0.f609a = r2
                r0.f610b = r3
                r0.f611c = r4
                r0.d = r5
                r0.e = r6
                r0.f = r7
                r0.<init>()
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(android.transition.Transition r1) {
                r0 = this;
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(android.transition.Transition r1) {
                r0 = this;
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(android.transition.Transition r1) {
                r0 = this;
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(android.transition.Transition r1) {
                r0 = this;
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(android.transition.Transition r4) {
                r3 = this;
                java.lang.Object r4 = r3.f609a
                r0 = 0
                if (r4 == 0) goto Lc
                android.support.v4.app.q r1 = r3.g
                java.util.ArrayList r2 = r3.f610b
                r1.a(r4, r2, r0)
            Lc:
                java.lang.Object r4 = r3.f611c
                if (r4 == 0) goto L17
                android.support.v4.app.q r1 = r3.g
                java.util.ArrayList r2 = r3.d
                r1.a(r4, r2, r0)
            L17:
                java.lang.Object r4 = r3.e
                if (r4 == 0) goto L22
                android.support.v4.app.q r1 = r3.g
                java.util.ArrayList r3 = r3.f
                r1.a(r4, r3, r0)
            L22:
                return
        }
    }

    class d extends android.transition.Transition.EpicenterCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.graphics.Rect f612a;

        d(android.support.v4.app.q r1, android.graphics.Rect r2) {
                r0 = this;
                r0.f612a = r2
                r0.<init>()
                return
        }

        @Override // android.transition.Transition.EpicenterCallback
        public android.graphics.Rect onGetEpicenter(android.transition.Transition r1) {
                r0 = this;
                android.graphics.Rect r1 = r0.f612a
                if (r1 == 0) goto Le
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto Lb
                goto Le
            Lb:
                android.graphics.Rect r0 = r0.f612a
                return r0
            Le:
                r0 = 0
                return r0
        }
    }

    q() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean a(android.transition.Transition r1) {
            java.util.List r0 = r1.getTargetIds()
            boolean r0 = android.support.v4.app.r.a(r0)
            if (r0 == 0) goto L21
            java.util.List r0 = r1.getTargetNames()
            boolean r0 = android.support.v4.app.r.a(r0)
            if (r0 == 0) goto L21
            java.util.List r1 = r1.getTargetTypes()
            boolean r1 = android.support.v4.app.r.a(r1)
            if (r1 != 0) goto L1f
            goto L21
        L1f:
            r1 = 0
            goto L22
        L21:
            r1 = 1
        L22:
            return r1
    }

    @Override // android.support.v4.app.r
    public java.lang.Object a(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            android.transition.Transition r1 = (android.transition.Transition) r1
            android.transition.Transition r2 = (android.transition.Transition) r2
            android.transition.Transition r3 = (android.transition.Transition) r3
            if (r1 == 0) goto L1d
            if (r2 == 0) goto L1d
            android.transition.TransitionSet r0 = new android.transition.TransitionSet
            r0.<init>()
            android.transition.TransitionSet r0 = r0.addTransition(r1)
            android.transition.TransitionSet r0 = r0.addTransition(r2)
            r1 = 1
            android.transition.TransitionSet r1 = r0.setOrdering(r1)
            goto L25
        L1d:
            if (r1 == 0) goto L20
            goto L25
        L20:
            if (r2 == 0) goto L24
            r1 = r2
            goto L25
        L24:
            r1 = 0
        L25:
            if (r3 == 0) goto L35
            android.transition.TransitionSet r0 = new android.transition.TransitionSet
            r0.<init>()
            if (r1 == 0) goto L31
            r0.addTransition(r1)
        L31:
            r0.addTransition(r3)
            return r0
        L35:
            return r1
    }

    @Override // android.support.v4.app.r
    public void a(android.view.ViewGroup r1, java.lang.Object r2) {
            r0 = this;
            android.transition.Transition r2 = (android.transition.Transition) r2
            android.transition.TransitionManager.beginDelayedTransition(r1, r2)
            return
    }

    @Override // android.support.v4.app.r
    public void a(java.lang.Object r2, android.graphics.Rect r3) {
            r1 = this;
            if (r2 == 0) goto Lc
            android.transition.Transition r2 = (android.transition.Transition) r2
            android.support.v4.app.q$d r0 = new android.support.v4.app.q$d
            r0.<init>(r1, r3)
            r2.setEpicenterCallback(r0)
        Lc:
            return
    }

    @Override // android.support.v4.app.r
    public void a(java.lang.Object r1, android.view.View r2) {
            r0 = this;
            if (r1 == 0) goto L7
            android.transition.Transition r1 = (android.transition.Transition) r1
            r1.addTarget(r2)
        L7:
            return
    }

    @Override // android.support.v4.app.r
    public void a(java.lang.Object r2, android.view.View r3, java.util.ArrayList<android.view.View> r4) {
            r1 = this;
            android.transition.Transition r2 = (android.transition.Transition) r2
            android.support.v4.app.q$b r0 = new android.support.v4.app.q$b
            r0.<init>(r1, r3, r4)
            r2.addListener(r0)
            return
    }

    @Override // android.support.v4.app.r
    public void a(java.lang.Object r11, java.lang.Object r12, java.util.ArrayList<android.view.View> r13, java.lang.Object r14, java.util.ArrayList<android.view.View> r15, java.lang.Object r16, java.util.ArrayList<android.view.View> r17) {
            r10 = this;
            r0 = r11
            android.transition.Transition r0 = (android.transition.Transition) r0
            android.support.v4.app.q$c r9 = new android.support.v4.app.q$c
            r1 = r9
            r2 = r10
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0.addListener(r9)
            return
    }

    @Override // android.support.v4.app.r
    public void a(java.lang.Object r4, java.util.ArrayList<android.view.View> r5) {
            r3 = this;
            android.transition.Transition r4 = (android.transition.Transition) r4
            if (r4 != 0) goto L5
            return
        L5:
            boolean r0 = r4 instanceof android.transition.TransitionSet
            r1 = 0
            if (r0 == 0) goto L1c
            android.transition.TransitionSet r4 = (android.transition.TransitionSet) r4
            int r0 = r4.getTransitionCount()
        L10:
            if (r1 >= r0) goto L3e
            android.transition.Transition r2 = r4.getTransitionAt(r1)
            r3.a(r2, r5)
            int r1 = r1 + 1
            goto L10
        L1c:
            boolean r3 = a(r4)
            if (r3 != 0) goto L3e
            java.util.List r3 = r4.getTargets()
            boolean r3 = android.support.v4.app.r.a(r3)
            if (r3 == 0) goto L3e
            int r3 = r5.size()
        L30:
            if (r1 >= r3) goto L3e
            java.lang.Object r0 = r5.get(r1)
            android.view.View r0 = (android.view.View) r0
            r4.addTarget(r0)
            int r1 = r1 + 1
            goto L30
        L3e:
            return
    }

    @Override // android.support.v4.app.r
    public void a(java.lang.Object r4, java.util.ArrayList<android.view.View> r5, java.util.ArrayList<android.view.View> r6) {
            r3 = this;
            android.transition.Transition r4 = (android.transition.Transition) r4
            boolean r0 = r4 instanceof android.transition.TransitionSet
            r1 = 0
            if (r0 == 0) goto L19
            android.transition.TransitionSet r4 = (android.transition.TransitionSet) r4
            int r0 = r4.getTransitionCount()
        Ld:
            if (r1 >= r0) goto L5f
            android.transition.Transition r2 = r4.getTransitionAt(r1)
            r3.a(r2, r5, r6)
            int r1 = r1 + 1
            goto Ld
        L19:
            boolean r3 = a(r4)
            if (r3 != 0) goto L5f
            java.util.List r3 = r4.getTargets()
            if (r3 == 0) goto L5f
            int r0 = r3.size()
            int r2 = r5.size()
            if (r0 != r2) goto L5f
            boolean r3 = r3.containsAll(r5)
            if (r3 == 0) goto L5f
            if (r6 != 0) goto L39
            r3 = r1
            goto L3d
        L39:
            int r3 = r6.size()
        L3d:
            if (r1 >= r3) goto L4b
            java.lang.Object r0 = r6.get(r1)
            android.view.View r0 = (android.view.View) r0
            r4.addTarget(r0)
            int r1 = r1 + 1
            goto L3d
        L4b:
            int r3 = r5.size()
            int r3 = r3 + (-1)
        L51:
            if (r3 < 0) goto L5f
            java.lang.Object r6 = r5.get(r3)
            android.view.View r6 = (android.view.View) r6
            r4.removeTarget(r6)
            int r3 = r3 + (-1)
            goto L51
        L5f:
            return
    }

    @Override // android.support.v4.app.r
    public boolean a(java.lang.Object r1) {
            r0 = this;
            boolean r0 = r1 instanceof android.transition.Transition
            return r0
    }

    @Override // android.support.v4.app.r
    public java.lang.Object b(java.lang.Object r1) {
            r0 = this;
            if (r1 == 0) goto L9
            android.transition.Transition r1 = (android.transition.Transition) r1
            android.transition.Transition r0 = r1.clone()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // android.support.v4.app.r
    public java.lang.Object b(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            android.transition.TransitionSet r0 = new android.transition.TransitionSet
            r0.<init>()
            if (r1 == 0) goto Lc
            android.transition.Transition r1 = (android.transition.Transition) r1
            r0.addTransition(r1)
        Lc:
            if (r2 == 0) goto L13
            android.transition.Transition r2 = (android.transition.Transition) r2
            r0.addTransition(r2)
        L13:
            if (r3 == 0) goto L1a
            android.transition.Transition r3 = (android.transition.Transition) r3
            r0.addTransition(r3)
        L1a:
            return r0
    }

    @Override // android.support.v4.app.r
    public void b(java.lang.Object r1, android.view.View r2) {
            r0 = this;
            if (r1 == 0) goto L7
            android.transition.Transition r1 = (android.transition.Transition) r1
            r1.removeTarget(r2)
        L7:
            return
    }

    @Override // android.support.v4.app.r
    public void b(java.lang.Object r5, android.view.View r6, java.util.ArrayList<android.view.View> r7) {
            r4 = this;
            android.transition.TransitionSet r5 = (android.transition.TransitionSet) r5
            java.util.List r0 = r5.getTargets()
            r0.clear()
            int r1 = r7.size()
            r2 = 0
        Le:
            if (r2 >= r1) goto L1c
            java.lang.Object r3 = r7.get(r2)
            android.view.View r3 = (android.view.View) r3
            android.support.v4.app.r.a(r0, r3)
            int r2 = r2 + 1
            goto Le
        L1c:
            r0.add(r6)
            r7.add(r6)
            r4.a(r5, r7)
            return
    }

    @Override // android.support.v4.app.r
    public void b(java.lang.Object r2, java.util.ArrayList<android.view.View> r3, java.util.ArrayList<android.view.View> r4) {
            r1 = this;
            android.transition.TransitionSet r2 = (android.transition.TransitionSet) r2
            if (r2 == 0) goto L15
            java.util.List r0 = r2.getTargets()
            r0.clear()
            java.util.List r0 = r2.getTargets()
            r0.addAll(r4)
            r1.a(r2, r3, r4)
        L15:
            return
    }

    @Override // android.support.v4.app.r
    public java.lang.Object c(java.lang.Object r1) {
            r0 = this;
            if (r1 != 0) goto L4
            r0 = 0
            return r0
        L4:
            android.transition.TransitionSet r0 = new android.transition.TransitionSet
            r0.<init>()
            android.transition.Transition r1 = (android.transition.Transition) r1
            r0.addTransition(r1)
            return r0
    }

    @Override // android.support.v4.app.r
    public void c(java.lang.Object r2, android.view.View r3) {
            r1 = this;
            if (r3 == 0) goto L14
            android.transition.Transition r2 = (android.transition.Transition) r2
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.a(r3, r0)
            android.support.v4.app.q$a r3 = new android.support.v4.app.q$a
            r3.<init>(r1, r0)
            r2.setEpicenterCallback(r3)
        L14:
            return
    }
}
