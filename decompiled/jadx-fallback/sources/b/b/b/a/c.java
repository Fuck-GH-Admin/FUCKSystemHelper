package b.b.b.a;

/* JADX INFO: loaded from: classes.dex */
public class c extends b.b.b.a.h implements b.b.b.a.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b.b.b.a.c.b f981c;
    private android.content.Context d;
    private android.animation.ArgbEvaluator e;
    final android.graphics.drawable.Drawable.Callback f;

    class a implements android.graphics.drawable.Drawable.Callback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b.b.b.a.c f982b;

        a(b.b.b.a.c r1) {
                r0 = this;
                r0.f982b = r1
                r0.<init>()
                return
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(android.graphics.drawable.Drawable r1) {
                r0 = this;
                b.b.b.a.c r0 = r0.f982b
                r0.invalidateSelf()
                return
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2, long r3) {
                r0 = this;
                b.b.b.a.c r0 = r0.f982b
                r0.scheduleSelf(r2, r3)
                return
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2) {
                r0 = this;
                b.b.b.a.c r0 = r0.f982b
                r0.unscheduleSelf(r2)
                return
        }
    }

    private static class b extends android.graphics.drawable.Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        b.b.b.a.i f984b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        android.animation.AnimatorSet f985c;
        java.util.ArrayList<android.animation.Animator> d;
        b.b.c.f.a<android.animation.Animator, java.lang.String> e;

        public b(android.content.Context r3, b.b.b.a.c.b r4, android.graphics.drawable.Drawable.Callback r5, android.content.res.Resources r6) {
                r2 = this;
                r2.<init>()
                if (r4 == 0) goto L82
                int r3 = r4.f983a
                r2.f983a = r3
                b.b.b.a.i r3 = r4.f984b
                r0 = 0
                if (r3 == 0) goto L3d
                android.graphics.drawable.Drawable$ConstantState r3 = r3.getConstantState()
                if (r6 == 0) goto L19
                android.graphics.drawable.Drawable r3 = r3.newDrawable(r6)
                goto L1d
            L19:
                android.graphics.drawable.Drawable r3 = r3.newDrawable()
            L1d:
                b.b.b.a.i r3 = (b.b.b.a.i) r3
                r2.f984b = r3
                b.b.b.a.i r3 = r2.f984b
                r3.mutate()
                b.b.b.a.i r3 = (b.b.b.a.i) r3
                r2.f984b = r3
                r3.setCallback(r5)
                b.b.b.a.i r3 = r2.f984b
                b.b.b.a.i r5 = r4.f984b
                android.graphics.Rect r5 = r5.getBounds()
                r3.setBounds(r5)
                b.b.b.a.i r3 = r2.f984b
                r3.a(r0)
            L3d:
                java.util.ArrayList<android.animation.Animator> r3 = r4.d
                if (r3 == 0) goto L82
                int r3 = r3.size()
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>(r3)
                r2.d = r5
                b.b.c.f.a r5 = new b.b.c.f.a
                r5.<init>(r3)
                r2.e = r5
            L53:
                if (r0 >= r3) goto L7f
                java.util.ArrayList<android.animation.Animator> r5 = r4.d
                java.lang.Object r5 = r5.get(r0)
                android.animation.Animator r5 = (android.animation.Animator) r5
                android.animation.Animator r6 = r5.clone()
                b.b.c.f.a<android.animation.Animator, java.lang.String> r1 = r4.e
                java.lang.Object r5 = r1.get(r5)
                java.lang.String r5 = (java.lang.String) r5
                b.b.b.a.i r1 = r2.f984b
                java.lang.Object r1 = r1.a(r5)
                r6.setTarget(r1)
                java.util.ArrayList<android.animation.Animator> r1 = r2.d
                r1.add(r6)
                b.b.c.f.a<android.animation.Animator, java.lang.String> r1 = r2.e
                r1.put(r6, r5)
                int r0 = r0 + 1
                goto L53
            L7f:
                r2.a()
            L82:
                return
        }

        public void a() {
                r1 = this;
                android.animation.AnimatorSet r0 = r1.f985c
                if (r0 != 0) goto Lb
                android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
                r0.<init>()
                r1.f985c = r0
            Lb:
                android.animation.AnimatorSet r0 = r1.f985c
                java.util.ArrayList<android.animation.Animator> r1 = r1.d
                r0.playTogether(r1)
                return
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
                r0 = this;
                int r0 = r0.f983a
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
                r1 = this;
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "No constant state support for SDK < 24."
                r1.<init>(r0)
                throw r1
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r1) {
                r0 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "No constant state support for SDK < 24."
                r0.<init>(r1)
                throw r0
        }
    }

    /* JADX INFO: renamed from: b.b.b.a.c$c, reason: collision with other inner class name */
    private static class C0037c extends android.graphics.drawable.Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.graphics.drawable.Drawable.ConstantState f986a;

        public C0037c(android.graphics.drawable.Drawable.ConstantState r1) {
                r0 = this;
                r0.<init>()
                r0.f986a = r1
                return
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
                r0 = this;
                android.graphics.drawable.Drawable$ConstantState r0 = r0.f986a
                boolean r0 = r0.canApplyTheme()
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
                r0 = this;
                android.graphics.drawable.Drawable$ConstantState r0 = r0.f986a
                int r0 = r0.getChangingConfigurations()
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
                r2 = this;
                b.b.b.a.c r0 = new b.b.b.a.c
                r0.<init>()
                android.graphics.drawable.Drawable$ConstantState r2 = r2.f986a
                android.graphics.drawable.Drawable r2 = r2.newDrawable()
                r0.f991b = r2
                android.graphics.drawable.Drawable$Callback r1 = r0.f
                r2.setCallback(r1)
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r2) {
                r1 = this;
                b.b.b.a.c r0 = new b.b.b.a.c
                r0.<init>()
                android.graphics.drawable.Drawable$ConstantState r1 = r1.f986a
                android.graphics.drawable.Drawable r1 = r1.newDrawable(r2)
                r0.f991b = r1
                android.graphics.drawable.Drawable$Callback r2 = r0.f
                r1.setCallback(r2)
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r2, android.content.res.Resources.Theme r3) {
                r1 = this;
                b.b.b.a.c r0 = new b.b.b.a.c
                r0.<init>()
                android.graphics.drawable.Drawable$ConstantState r1 = r1.f986a
                android.graphics.drawable.Drawable r1 = r1.newDrawable(r2, r3)
                r0.f991b = r1
                android.graphics.drawable.Drawable$Callback r2 = r0.f
                r1.setCallback(r2)
                return r0
        }
    }

    c() {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r0, r0)
            return
    }

    private c(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r0)
            return
    }

    private c(android.content.Context r3, b.b.b.a.c.b r4, android.content.res.Resources r5) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.e = r0
            b.b.b.a.c$a r0 = new b.b.b.a.c$a
            r0.<init>(r2)
            r2.f = r0
            r2.d = r3
            if (r4 == 0) goto L14
            r2.f981c = r4
            goto L1d
        L14:
            b.b.b.a.c$b r0 = new b.b.b.a.c$b
            android.graphics.drawable.Drawable$Callback r1 = r2.f
            r0.<init>(r3, r4, r1, r5)
            r2.f981c = r0
        L1d:
            return
    }

    public static b.b.b.a.c a(android.content.Context r1, android.content.res.Resources r2, org.xmlpull.v1.XmlPullParser r3, android.util.AttributeSet r4, android.content.res.Resources.Theme r5) {
            b.b.b.a.c r0 = new b.b.b.a.c
            r0.<init>(r1)
            r0.inflate(r2, r3, r4, r5)
            return r0
    }

    private void a(android.animation.Animator r4) {
            r3 = this;
            boolean r0 = r4 instanceof android.animation.AnimatorSet
            if (r0 == 0) goto L20
            r0 = r4
            android.animation.AnimatorSet r0 = (android.animation.AnimatorSet) r0
            java.util.ArrayList r0 = r0.getChildAnimations()
            if (r0 == 0) goto L20
            r1 = 0
        Le:
            int r2 = r0.size()
            if (r1 >= r2) goto L20
            java.lang.Object r2 = r0.get(r1)
            android.animation.Animator r2 = (android.animation.Animator) r2
            r3.a(r2)
            int r1 = r1 + 1
            goto Le
        L20:
            boolean r0 = r4 instanceof android.animation.ObjectAnimator
            if (r0 == 0) goto L4a
            android.animation.ObjectAnimator r4 = (android.animation.ObjectAnimator) r4
            java.lang.String r0 = r4.getPropertyName()
            java.lang.String r1 = "fillColor"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L3a
            java.lang.String r1 = "strokeColor"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L4a
        L3a:
            android.animation.ArgbEvaluator r0 = r3.e
            if (r0 != 0) goto L45
            android.animation.ArgbEvaluator r0 = new android.animation.ArgbEvaluator
            r0.<init>()
            r3.e = r0
        L45:
            android.animation.ArgbEvaluator r3 = r3.e
            r4.setEvaluator(r3)
        L4a:
            return
    }

    private void a(java.lang.String r3, android.animation.Animator r4) {
            r2 = this;
            b.b.b.a.c$b r0 = r2.f981c
            b.b.b.a.i r0 = r0.f984b
            java.lang.Object r0 = r0.a(r3)
            r4.setTarget(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 >= r1) goto L14
            r2.a(r4)
        L14:
            b.b.b.a.c$b r0 = r2.f981c
            java.util.ArrayList<android.animation.Animator> r1 = r0.d
            if (r1 != 0) goto L2a
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.d = r1
            b.b.b.a.c$b r0 = r2.f981c
            b.b.c.f.a r1 = new b.b.c.f.a
            r1.<init>()
            r0.e = r1
        L2a:
            b.b.b.a.c$b r0 = r2.f981c
            java.util.ArrayList<android.animation.Animator> r0 = r0.d
            r0.add(r4)
            b.b.b.a.c$b r2 = r2.f981c
            b.b.c.f.a<android.animation.Animator, java.lang.String> r2 = r2.e
            r2.put(r4, r3)
            return
    }

    @Override // b.b.b.a.h, android.graphics.drawable.Drawable
    public void applyTheme(android.content.res.Resources.Theme r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f991b
            if (r0 == 0) goto L7
            android.support.v4.graphics.drawable.a.a(r0, r1)
        L7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f991b
            if (r0 == 0) goto L9
            boolean r0 = android.support.v4.graphics.drawable.a.a(r0)
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f991b
            if (r0 == 0) goto L8
            r0.draw(r2)
            return
        L8:
            b.b.b.a.c$b r0 = r1.f981c
            b.b.b.a.i r0 = r0.f984b
            r0.draw(r2)
            b.b.b.a.c$b r2 = r1.f981c
            android.animation.AnimatorSet r2 = r2.f985c
            boolean r2 = r2.isStarted()
            if (r2 == 0) goto L1c
            r1.invalidateSelf()
        L1c:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f991b
            if (r0 == 0) goto L9
            int r1 = android.support.v4.graphics.drawable.a.b(r0)
            return r1
        L9:
            b.b.b.a.c$b r1 = r1.f981c
            b.b.b.a.i r1 = r1.f984b
            int r1 = r1.getAlpha()
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f991b
            if (r0 == 0) goto L9
            int r1 = r0.getChangingConfigurations()
            return r1
        L9:
            int r0 = super.getChangingConfigurations()
            b.b.b.a.c$b r1 = r1.f981c
            int r1 = r1.f983a
            r1 = r1 | r0
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable.ConstantState getConstantState() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f991b
            if (r0 == 0) goto L16
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L16
            b.b.b.a.c$c r0 = new b.b.b.a.c$c
            android.graphics.drawable.Drawable r2 = r2.f991b
            android.graphics.drawable.Drawable$ConstantState r2 = r2.getConstantState()
            r0.<init>(r2)
            return r0
        L16:
            r2 = 0
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f991b
            if (r0 == 0) goto L9
            int r1 = r0.getIntrinsicHeight()
            return r1
        L9:
            b.b.b.a.c$b r1 = r1.f981c
            b.b.b.a.i r1 = r1.f984b
            int r1 = r1.getIntrinsicHeight()
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f991b
            if (r0 == 0) goto L9
            int r1 = r0.getIntrinsicWidth()
            return r1
        L9:
            b.b.b.a.c$b r1 = r1.f981c
            b.b.b.a.i r1 = r1.f984b
            int r1 = r1.getIntrinsicWidth()
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f991b
            if (r0 == 0) goto L9
            int r1 = r0.getOpacity()
            return r1
        L9:
            b.b.b.a.c$b r1 = r1.f981c
            b.b.b.a.i r1 = r1.f984b
            int r1 = r1.getOpacity()
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(android.content.res.Resources r2, org.xmlpull.v1.XmlPullParser r3, android.util.AttributeSet r4) {
            r1 = this;
            r0 = 0
            r1.inflate(r2, r3, r4, r0)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(android.content.res.Resources r7, org.xmlpull.v1.XmlPullParser r8, android.util.AttributeSet r9, android.content.res.Resources.Theme r10) {
            r6 = this;
            android.graphics.drawable.Drawable r0 = r6.f991b
            if (r0 == 0) goto L8
            android.support.v4.graphics.drawable.a.a(r0, r7, r8, r9, r10)
            return
        L8:
            int r0 = r8.getEventType()
            int r1 = r8.getDepth()
            r2 = 1
            int r1 = r1 + r2
        L12:
            if (r0 == r2) goto L8b
            int r3 = r8.getDepth()
            if (r3 >= r1) goto L1d
            r3 = 3
            if (r0 == r3) goto L8b
        L1d:
            r3 = 2
            if (r0 != r3) goto L86
            java.lang.String r0 = r8.getName()
            java.lang.String r3 = "animated-vector"
            boolean r3 = r3.equals(r0)
            r4 = 0
            if (r3 == 0) goto L57
            int[] r0 = b.b.b.a.a.e
            android.content.res.TypedArray r0 = b.b.c.a.d.g.a(r7, r10, r9, r0)
            int r3 = r0.getResourceId(r4, r4)
            if (r3 == 0) goto L53
            b.b.b.a.i r3 = b.b.b.a.i.a(r7, r3, r10)
            r3.a(r4)
            android.graphics.drawable.Drawable$Callback r4 = r6.f
            r3.setCallback(r4)
            b.b.b.a.c$b r4 = r6.f981c
            b.b.b.a.i r4 = r4.f984b
            if (r4 == 0) goto L4f
            r5 = 0
            r4.setCallback(r5)
        L4f:
            b.b.b.a.c$b r4 = r6.f981c
            r4.f984b = r3
        L53:
            r0.recycle()
            goto L86
        L57:
            java.lang.String r3 = "target"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L86
            int[] r0 = b.b.b.a.a.f
            android.content.res.TypedArray r0 = r7.obtainAttributes(r9, r0)
            java.lang.String r3 = r0.getString(r4)
            int r4 = r0.getResourceId(r2, r4)
            if (r4 == 0) goto L53
            android.content.Context r5 = r6.d
            if (r5 == 0) goto L7b
            android.animation.Animator r4 = b.b.b.a.e.a(r5, r4)
            r6.a(r3, r4)
            goto L53
        L7b:
            r0.recycle()
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Context can't be null when inflating animators"
            r6.<init>(r7)
            throw r6
        L86:
            int r0 = r8.next()
            goto L12
        L8b:
            b.b.b.a.c$b r6 = r6.f981c
            r6.a()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f991b
            if (r0 == 0) goto L9
            boolean r1 = android.support.v4.graphics.drawable.a.e(r0)
            return r1
        L9:
            b.b.b.a.c$b r1 = r1.f981c
            b.b.b.a.i r1 = r1.f984b
            boolean r1 = r1.isAutoMirrored()
            return r1
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f991b
            if (r0 == 0) goto Lb
            android.graphics.drawable.AnimatedVectorDrawable r0 = (android.graphics.drawable.AnimatedVectorDrawable) r0
            boolean r1 = r0.isRunning()
            return r1
        Lb:
            b.b.b.a.c$b r1 = r1.f981c
            android.animation.AnimatorSet r1 = r1.f985c
            boolean r1 = r1.isRunning()
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f991b
            if (r0 == 0) goto L9
            boolean r1 = r0.isStateful()
            return r1
        L9:
            b.b.b.a.c$b r1 = r1.f981c
            b.b.b.a.i r1 = r1.f984b
            boolean r1 = r1.isStateful()
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f991b
            if (r0 == 0) goto L7
            r0.mutate()
        L7:
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f991b
            if (r0 == 0) goto L8
            r0.setBounds(r2)
            return
        L8:
            b.b.b.a.c$b r1 = r1.f981c
            b.b.b.a.i r1 = r1.f984b
            r1.setBounds(r2)
            return
    }

    @Override // b.b.b.a.h, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f991b
            if (r0 == 0) goto L9
            boolean r1 = r0.setLevel(r2)
            return r1
        L9:
            b.b.b.a.c$b r1 = r1.f981c
            b.b.b.a.i r1 = r1.f984b
            boolean r1 = r1.setLevel(r2)
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f991b
            if (r0 == 0) goto L9
            boolean r1 = r0.setState(r2)
            return r1
        L9:
            b.b.b.a.c$b r1 = r1.f981c
            b.b.b.a.i r1 = r1.f984b
            boolean r1 = r1.setState(r2)
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f991b
            if (r0 == 0) goto L8
            r0.setAlpha(r2)
            return
        L8:
            b.b.b.a.c$b r1 = r1.f981c
            b.b.b.a.i r1 = r1.f984b
            r1.setAlpha(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f991b
            if (r0 == 0) goto L8
            android.support.v4.graphics.drawable.a.a(r0, r2)
            return
        L8:
            b.b.b.a.c$b r1 = r1.f981c
            b.b.b.a.i r1 = r1.f984b
            r1.setAutoMirrored(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f991b
            if (r0 == 0) goto L8
            r0.setColorFilter(r2)
            return
        L8:
            b.b.b.a.c$b r1 = r1.f981c
            b.b.b.a.i r1 = r1.f984b
            r1.setColorFilter(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.b
    public void setTint(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f991b
            if (r0 == 0) goto L8
            android.support.v4.graphics.drawable.a.b(r0, r2)
            return
        L8:
            b.b.b.a.c$b r1 = r1.f981c
            b.b.b.a.i r1 = r1.f984b
            r1.setTint(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.b
    public void setTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f991b
            if (r0 == 0) goto L8
            android.support.v4.graphics.drawable.a.a(r0, r2)
            return
        L8:
            b.b.b.a.c$b r1 = r1.f981c
            b.b.b.a.i r1 = r1.f984b
            r1.setTintList(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.b
    public void setTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f991b
            if (r0 == 0) goto L8
            android.support.v4.graphics.drawable.a.a(r0, r2)
            return
        L8:
            b.b.b.a.c$b r1 = r1.f981c
            b.b.b.a.i r1 = r1.f984b
            r1.setTintMode(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean r2, boolean r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f991b
            if (r0 == 0) goto L9
            boolean r1 = r0.setVisible(r2, r3)
            return r1
        L9:
            b.b.b.a.c$b r0 = r1.f981c
            b.b.b.a.i r0 = r0.f984b
            r0.setVisible(r2, r3)
            boolean r1 = super.setVisible(r2, r3)
            return r1
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f991b
            if (r0 == 0) goto La
            android.graphics.drawable.AnimatedVectorDrawable r0 = (android.graphics.drawable.AnimatedVectorDrawable) r0
            r0.start()
            return
        La:
            b.b.b.a.c$b r0 = r1.f981c
            android.animation.AnimatorSet r0 = r0.f985c
            boolean r0 = r0.isStarted()
            if (r0 == 0) goto L15
            return
        L15:
            b.b.b.a.c$b r0 = r1.f981c
            android.animation.AnimatorSet r0 = r0.f985c
            r0.start()
            r1.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f991b
            if (r0 == 0) goto La
            android.graphics.drawable.AnimatedVectorDrawable r0 = (android.graphics.drawable.AnimatedVectorDrawable) r0
            r0.stop()
            return
        La:
            b.b.b.a.c$b r1 = r1.f981c
            android.animation.AnimatorSet r1 = r1.f985c
            r1.end()
            return
    }
}
