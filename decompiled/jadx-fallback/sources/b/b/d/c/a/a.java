package b.b.d.c.a;

/* JADX INFO: loaded from: classes.dex */
public class a extends b.b.d.c.a.d {
    private b.b.d.c.a.a.c p;
    private b.b.d.c.a.a.g q;
    private int r;
    private int s;
    private boolean t;

    /* JADX INFO: renamed from: b.b.d.c.a.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0049a {
    }

    private static class b extends b.b.d.c.a.a.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.graphics.drawable.Animatable f1143a;

        b(android.graphics.drawable.Animatable r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.f1143a = r2
                return
        }

        @Override // b.b.d.c.a.a.g
        public void c() {
                r0 = this;
                android.graphics.drawable.Animatable r0 = r0.f1143a
                r0.start()
                return
        }

        @Override // b.b.d.c.a.a.g
        public void d() {
                r0 = this;
                android.graphics.drawable.Animatable r0 = r0.f1143a
                r0.stop()
                return
        }
    }

    static class c extends b.b.d.c.a.d.a {
        b.b.c.f.f<java.lang.Long> K;
        b.b.c.f.l<java.lang.Integer> L;

        c(b.b.d.c.a.a.c r1, b.b.d.c.a.a r2, android.content.res.Resources r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                if (r1 == 0) goto Lc
                b.b.c.f.f<java.lang.Long> r2 = r1.K
                r0.K = r2
                b.b.c.f.l<java.lang.Integer> r1 = r1.L
                goto L18
            Lc:
                b.b.c.f.f r1 = new b.b.c.f.f
                r1.<init>()
                r0.K = r1
                b.b.c.f.l r1 = new b.b.c.f.l
                r1.<init>()
            L18:
                r0.L = r1
                return
        }

        private static long f(int r2, int r3) {
                long r0 = (long) r2
                r2 = 32
                long r0 = r0 << r2
                long r2 = (long) r3
                long r2 = r2 | r0
                return r2
        }

        int a(int r10, int r11, android.graphics.drawable.Drawable r12, boolean r13) {
                r9 = this;
                int r12 = super.a(r12)
                long r0 = f(r10, r11)
                if (r13 == 0) goto L10
                r2 = 8589934592(0x200000000, double:4.243991582E-314)
                goto L12
            L10:
                r2 = 0
            L12:
                b.b.c.f.f<java.lang.Long> r4 = r9.K
                long r5 = (long) r12
                long r7 = r5 | r2
                java.lang.Long r7 = java.lang.Long.valueOf(r7)
                r4.a(r0, r7)
                if (r13 == 0) goto L34
                long r10 = f(r11, r10)
                b.b.c.f.f<java.lang.Long> r9 = r9.K
                r0 = 4294967296(0x100000000, double:2.121995791E-314)
                long r0 = r0 | r5
                long r0 = r0 | r2
                java.lang.Long r13 = java.lang.Long.valueOf(r0)
                r9.a(r10, r13)
            L34:
                return r12
        }

        int a(int[] r1, android.graphics.drawable.Drawable r2, int r3) {
                r0 = this;
                int r1 = super.a(r1, r2)
                b.b.c.f.l<java.lang.Integer> r0 = r0.L
                java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
                r0.c(r1, r2)
                return r1
        }

        int b(int[] r1) {
                r0 = this;
                int r1 = super.a(r1)
                if (r1 < 0) goto L7
                return r1
            L7:
                int[] r1 = android.util.StateSet.WILD_CARD
                int r0 = super.a(r1)
                return r0
        }

        int c(int r3, int r4) {
                r2 = this;
                long r3 = f(r3, r4)
                b.b.c.f.f<java.lang.Long> r2 = r2.K
                r0 = -1
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                java.lang.Object r2 = r2.b(r3, r0)
                java.lang.Long r2 = (java.lang.Long) r2
                long r2 = r2.longValue()
                int r2 = (int) r2
                return r2
        }

        int d(int r2) {
                r1 = this;
                r0 = 0
                if (r2 >= 0) goto L4
                goto L14
            L4:
                b.b.c.f.l<java.lang.Integer> r1 = r1.L
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.lang.Object r1 = r1.b(r2, r0)
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r0 = r1.intValue()
            L14:
                return r0
        }

        boolean d(int r3, int r4) {
                r2 = this;
                long r3 = f(r3, r4)
                b.b.c.f.f<java.lang.Long> r2 = r2.K
                r0 = -1
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                java.lang.Object r2 = r2.b(r3, r0)
                java.lang.Long r2 = (java.lang.Long) r2
                long r2 = r2.longValue()
                r0 = 4294967296(0x100000000, double:2.121995791E-314)
                long r2 = r2 & r0
                r0 = 0
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 == 0) goto L24
                r2 = 1
                goto L25
            L24:
                r2 = 0
            L25:
                return r2
        }

        boolean e(int r3, int r4) {
                r2 = this;
                long r3 = f(r3, r4)
                b.b.c.f.f<java.lang.Long> r2 = r2.K
                r0 = -1
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                java.lang.Object r2 = r2.b(r3, r0)
                java.lang.Long r2 = (java.lang.Long) r2
                long r2 = r2.longValue()
                r0 = 8589934592(0x200000000, double:4.243991582E-314)
                long r2 = r2 & r0
                r0 = 0
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 == 0) goto L24
                r2 = 1
                goto L25
            L24:
                r2 = 0
            L25:
                return r2
        }

        @Override // b.b.d.c.a.d.a, b.b.d.c.a.b.c
        void m() {
                r1 = this;
                b.b.c.f.f<java.lang.Long> r0 = r1.K
                b.b.c.f.f r0 = r0.clone()
                r1.K = r0
                b.b.c.f.l<java.lang.Integer> r0 = r1.L
                b.b.c.f.l r0 = r0.clone()
                r1.L = r0
                return
        }

        @Override // b.b.d.c.a.d.a, android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
                r2 = this;
                b.b.d.c.a.a r0 = new b.b.d.c.a.a
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        @Override // b.b.d.c.a.d.a, android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r2) {
                r1 = this;
                b.b.d.c.a.a r0 = new b.b.d.c.a.a
                r0.<init>(r1, r2)
                return r0
        }
    }

    private static class d extends b.b.d.c.a.a.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b.b.b.a.c f1144a;

        d(b.b.b.a.c r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.f1144a = r2
                return
        }

        @Override // b.b.d.c.a.a.g
        public void c() {
                r0 = this;
                b.b.b.a.c r0 = r0.f1144a
                r0.start()
                return
        }

        @Override // b.b.d.c.a.a.g
        public void d() {
                r0 = this;
                b.b.b.a.c r0 = r0.f1144a
                r0.stop()
                return
        }
    }

    private static class e extends b.b.d.c.a.a.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.animation.ObjectAnimator f1145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f1146b;

        e(android.graphics.drawable.AnimationDrawable r6, boolean r7, boolean r8) {
                r5 = this;
                r0 = 0
                r5.<init>(r0)
                int r0 = r6.getNumberOfFrames()
                r1 = 0
                if (r7 == 0) goto Le
                int r2 = r0 + (-1)
                goto Lf
            Le:
                r2 = r1
            Lf:
                r3 = 1
                if (r7 == 0) goto L14
                r0 = r1
                goto L15
            L14:
                int r0 = r0 - r3
            L15:
                b.b.d.c.a.a$f r4 = new b.b.d.c.a.a$f
                r4.<init>(r6, r7)
                r7 = 2
                int[] r7 = new int[r7]
                r7[r1] = r2
                r7[r3] = r0
                java.lang.String r0 = "currentIndex"
                android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofInt(r6, r0, r7)
                int r7 = android.os.Build.VERSION.SDK_INT
                r0 = 18
                if (r7 < r0) goto L30
                r6.setAutoCancel(r3)
            L30:
                int r7 = r4.a()
                long r0 = (long) r7
                r6.setDuration(r0)
                r6.setInterpolator(r4)
                r5.f1146b = r8
                r5.f1145a = r6
                return
        }

        @Override // b.b.d.c.a.a.g
        public boolean a() {
                r0 = this;
                boolean r0 = r0.f1146b
                return r0
        }

        @Override // b.b.d.c.a.a.g
        public void b() {
                r0 = this;
                android.animation.ObjectAnimator r0 = r0.f1145a
                r0.reverse()
                return
        }

        @Override // b.b.d.c.a.a.g
        public void c() {
                r0 = this;
                android.animation.ObjectAnimator r0 = r0.f1145a
                r0.start()
                return
        }

        @Override // b.b.d.c.a.a.g
        public void d() {
                r0 = this;
                android.animation.ObjectAnimator r0 = r0.f1145a
                r0.cancel()
                return
        }
    }

    private static class f implements android.animation.TimeInterpolator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int[] f1147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f1148b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f1149c;

        f(android.graphics.drawable.AnimationDrawable r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.a(r1, r2)
                return
        }

        int a() {
                r0 = this;
                int r0 = r0.f1149c
                return r0
        }

        int a(android.graphics.drawable.AnimationDrawable r6, boolean r7) {
                r5 = this;
                int r0 = r6.getNumberOfFrames()
                r5.f1148b = r0
                int[] r1 = r5.f1147a
                if (r1 == 0) goto Ld
                int r1 = r1.length
                if (r1 >= r0) goto L11
            Ld:
                int[] r1 = new int[r0]
                r5.f1147a = r1
            L11:
                int[] r1 = r5.f1147a
                r2 = 0
                r3 = r2
            L15:
                if (r2 >= r0) goto L29
                if (r7 == 0) goto L1e
                int r4 = r0 - r2
                int r4 = r4 + (-1)
                goto L1f
            L1e:
                r4 = r2
            L1f:
                int r4 = r6.getDuration(r4)
                r1[r2] = r4
                int r3 = r3 + r4
                int r2 = r2 + 1
                goto L15
            L29:
                r5.f1149c = r3
                return r3
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float r5) {
                r4 = this;
                int r0 = r4.f1149c
                float r0 = (float) r0
                float r5 = r5 * r0
                r0 = 1056964608(0x3f000000, float:0.5)
                float r5 = r5 + r0
                int r5 = (int) r5
                int r0 = r4.f1148b
                int[] r1 = r4.f1147a
                r2 = 0
            Ld:
                if (r2 >= r0) goto L19
                r3 = r1[r2]
                if (r5 < r3) goto L19
                r3 = r1[r2]
                int r5 = r5 - r3
                int r2 = r2 + 1
                goto Ld
            L19:
                if (r2 >= r0) goto L21
                float r5 = (float) r5
                int r4 = r4.f1149c
                float r4 = (float) r4
                float r5 = r5 / r4
                goto L22
            L21:
                r5 = 0
            L22:
                float r4 = (float) r2
                float r0 = (float) r0
                float r4 = r4 / r0
                float r4 = r4 + r5
                return r4
        }
    }

    private static abstract class g {
        private g() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ g(b.b.d.c.a.a.C0049a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public boolean a() {
                r0 = this;
                r0 = 0
                return r0
        }

        public void b() {
                r0 = this;
                return
        }

        public abstract void c();

        public abstract void d();
    }

    static {
            java.lang.Class<b.b.d.c.a.a> r0 = b.b.d.c.a.a.class
            return
    }

    public a() {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r0)
            return
    }

    a(b.b.d.c.a.a.c r2, android.content.res.Resources r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            r0 = -1
            r1.r = r0
            r1.s = r0
            b.b.d.c.a.a$c r0 = new b.b.d.c.a.a$c
            r0.<init>(r2, r1, r3)
            r1.a(r0)
            int[] r2 = r1.getState()
            r1.onStateChange(r2)
            r1.jumpToCurrentState()
            return
    }

    private void a(android.content.res.TypedArray r4) {
            r3 = this;
            b.b.d.c.a.a$c r0 = r3.p
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L11
            int r1 = r0.d
            int r2 = r4.getChangingConfigurations()
            r1 = r1 | r2
            r0.d = r1
        L11:
            int r1 = b.b.d.a.j.AnimatedStateListDrawableCompat_android_variablePadding
            boolean r2 = r0.i
            boolean r1 = r4.getBoolean(r1, r2)
            r0.b(r1)
            int r1 = b.b.d.a.j.AnimatedStateListDrawableCompat_android_constantSize
            boolean r2 = r0.l
            boolean r1 = r4.getBoolean(r1, r2)
            r0.a(r1)
            int r1 = b.b.d.a.j.AnimatedStateListDrawableCompat_android_enterFadeDuration
            int r2 = r0.A
            int r1 = r4.getInt(r1, r2)
            r0.b(r1)
            int r1 = b.b.d.a.j.AnimatedStateListDrawableCompat_android_exitFadeDuration
            int r2 = r0.B
            int r1 = r4.getInt(r1, r2)
            r0.c(r1)
            int r1 = b.b.d.a.j.AnimatedStateListDrawableCompat_android_dither
            boolean r0 = r0.x
            boolean r4 = r4.getBoolean(r1, r0)
            r3.setDither(r4)
            return
    }

    public static b.b.d.c.a.a b(android.content.Context r8, android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) {
            java.lang.String r0 = r10.getName()
            java.lang.String r1 = "animated-selector"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L1b
            b.b.d.c.a.a r0 = new b.b.d.c.a.a
            r0.<init>()
            r2 = r0
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            r2.a(r3, r4, r5, r6, r7)
            return r0
        L1b:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r9.append(r10)
            java.lang.String r10 = ": invalid animated-selector tag "
            r9.append(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
    }

    private boolean b(int r10) {
            r9 = this;
            b.b.d.c.a.a$g r0 = r9.q
            r1 = 1
            if (r0 == 0) goto L24
            int r2 = r9.r
            if (r10 != r2) goto La
            return r1
        La:
            int r2 = r9.s
            if (r10 != r2) goto L1e
            boolean r2 = r0.a()
            if (r2 == 0) goto L1e
            r0.b()
            int r0 = r9.s
            r9.r = r0
            r9.s = r10
            return r1
        L1e:
            int r2 = r9.r
            r0.d()
            goto L28
        L24:
            int r2 = r9.b()
        L28:
            r0 = 0
            r9.q = r0
            r0 = -1
            r9.s = r0
            r9.r = r0
            b.b.d.c.a.a$c r0 = r9.p
            int r3 = r0.d(r2)
            int r4 = r0.d(r10)
            r5 = 0
            if (r4 == 0) goto L83
            if (r3 != 0) goto L40
            goto L83
        L40:
            int r6 = r0.c(r3, r4)
            if (r6 >= 0) goto L47
            return r5
        L47:
            boolean r7 = r0.e(r3, r4)
            r9.a(r6)
            android.graphics.drawable.Drawable r6 = r9.getCurrent()
            boolean r8 = r6 instanceof android.graphics.drawable.AnimationDrawable
            if (r8 == 0) goto L62
            boolean r0 = r0.d(r3, r4)
            b.b.d.c.a.a$e r3 = new b.b.d.c.a.a$e
            android.graphics.drawable.AnimationDrawable r6 = (android.graphics.drawable.AnimationDrawable) r6
            r3.<init>(r6, r0, r7)
            goto L79
        L62:
            boolean r0 = r6 instanceof b.b.b.a.c
            if (r0 == 0) goto L6e
            b.b.d.c.a.a$d r3 = new b.b.d.c.a.a$d
            b.b.b.a.c r6 = (b.b.b.a.c) r6
            r3.<init>(r6)
            goto L79
        L6e:
            boolean r0 = r6 instanceof android.graphics.drawable.Animatable
            if (r0 == 0) goto L83
            b.b.d.c.a.a$b r3 = new b.b.d.c.a.a$b
            android.graphics.drawable.Animatable r6 = (android.graphics.drawable.Animatable) r6
            r3.<init>(r6)
        L79:
            r3.c()
            r9.q = r3
            r9.s = r2
            r9.r = r10
            return r1
        L83:
            return r5
    }

    private void c() {
            r1 = this;
            int[] r0 = r1.getState()
            r1.onStateChange(r0)
            return
    }

    private void c(android.content.Context r6, android.content.res.Resources r7, org.xmlpull.v1.XmlPullParser r8, android.util.AttributeSet r9, android.content.res.Resources.Theme r10) {
            r5 = this;
            int r0 = r8.getDepth()
            r1 = 1
            int r0 = r0 + r1
        L6:
            int r2 = r8.next()
            if (r2 == r1) goto L3c
            int r3 = r8.getDepth()
            if (r3 >= r0) goto L15
            r4 = 3
            if (r2 == r4) goto L3c
        L15:
            r4 = 2
            if (r2 == r4) goto L19
            goto L6
        L19:
            if (r3 <= r0) goto L1c
            goto L6
        L1c:
            java.lang.String r2 = r8.getName()
            java.lang.String r3 = "item"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L2c
            r5.d(r6, r7, r8, r9, r10)
            goto L6
        L2c:
            java.lang.String r2 = r8.getName()
            java.lang.String r3 = "transition"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L6
            r5.e(r6, r7, r8, r9, r10)
            goto L6
        L3c:
            return
    }

    private int d(android.content.Context r5, android.content.res.Resources r6, org.xmlpull.v1.XmlPullParser r7, android.util.AttributeSet r8, android.content.res.Resources.Theme r9) {
            r4 = this;
            int[] r0 = b.b.d.a.j.AnimatedStateListDrawableItem
            android.content.res.TypedArray r0 = b.b.c.a.d.g.a(r6, r9, r8, r0)
            int r1 = b.b.d.a.j.AnimatedStateListDrawableItem_android_id
            r2 = 0
            int r1 = r0.getResourceId(r1, r2)
            int r2 = b.b.d.a.j.AnimatedStateListDrawableItem_android_drawable
            r3 = -1
            int r2 = r0.getResourceId(r2, r3)
            if (r2 <= 0) goto L1b
            android.graphics.drawable.Drawable r5 = b.b.d.b.a.a.c(r5, r2)
            goto L1c
        L1b:
            r5 = 0
        L1c:
            r0.recycle()
            int[] r0 = r4.a(r8)
            java.lang.String r2 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r5 != 0) goto L6c
        L27:
            int r5 = r7.next()
            r3 = 4
            if (r5 != r3) goto L2f
            goto L27
        L2f:
            r3 = 2
            if (r5 != r3) goto L53
            java.lang.String r5 = r7.getName()
            java.lang.String r3 = "vector"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L43
            b.b.b.a.i r5 = b.b.b.a.i.createFromXmlInner(r6, r7, r8, r9)
            goto L6c
        L43:
            int r5 = android.os.Build.VERSION.SDK_INT
            r3 = 21
            if (r5 < r3) goto L4e
            android.graphics.drawable.Drawable r5 = android.graphics.drawable.Drawable.createFromXmlInner(r6, r7, r8, r9)
            goto L6c
        L4e:
            android.graphics.drawable.Drawable r5 = android.graphics.drawable.Drawable.createFromXmlInner(r6, r7, r8)
            goto L6c
        L53:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r7.getPositionDescription()
            r5.append(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L6c:
            if (r5 == 0) goto L75
            b.b.d.c.a.a$c r4 = r4.p
            int r4 = r4.a(r0, r5, r1)
            return r4
        L75:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r7.getPositionDescription()
            r5.append(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    private int e(android.content.Context r8, android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) {
            r7 = this;
            int[] r0 = b.b.d.a.j.AnimatedStateListDrawableTransition
            android.content.res.TypedArray r0 = b.b.c.a.d.g.a(r9, r12, r11, r0)
            int r1 = b.b.d.a.j.AnimatedStateListDrawableTransition_android_fromId
            r2 = -1
            int r1 = r0.getResourceId(r1, r2)
            int r3 = b.b.d.a.j.AnimatedStateListDrawableTransition_android_toId
            int r3 = r0.getResourceId(r3, r2)
            int r4 = b.b.d.a.j.AnimatedStateListDrawableTransition_android_drawable
            int r4 = r0.getResourceId(r4, r2)
            if (r4 <= 0) goto L20
            android.graphics.drawable.Drawable r4 = b.b.d.b.a.a.c(r8, r4)
            goto L21
        L20:
            r4 = 0
        L21:
            int r5 = b.b.d.a.j.AnimatedStateListDrawableTransition_android_reversible
            r6 = 0
            boolean r5 = r0.getBoolean(r5, r6)
            r0.recycle()
            java.lang.String r0 = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r4 != 0) goto L74
        L2f:
            int r4 = r10.next()
            r6 = 4
            if (r4 != r6) goto L37
            goto L2f
        L37:
            r6 = 2
            if (r4 != r6) goto L5b
            java.lang.String r4 = r10.getName()
            java.lang.String r6 = "animated-vector"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L4b
            b.b.b.a.c r4 = b.b.b.a.c.a(r8, r9, r10, r11, r12)
            goto L74
        L4b:
            int r8 = android.os.Build.VERSION.SDK_INT
            r4 = 21
            if (r8 < r4) goto L56
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromXmlInner(r9, r10, r11, r12)
            goto L74
        L56:
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromXmlInner(r9, r10, r11)
            goto L74
        L5b:
            org.xmlpull.v1.XmlPullParserException r7 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r10.getPositionDescription()
            r8.append(r9)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L74:
            if (r4 == 0) goto L9c
            if (r1 == r2) goto L81
            if (r3 == r2) goto L81
            b.b.d.c.a.a$c r7 = r7.p
            int r7 = r7.a(r1, r3, r4, r5)
            return r7
        L81:
            org.xmlpull.v1.XmlPullParserException r7 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r10.getPositionDescription()
            r8.append(r9)
            java.lang.String r9 = ": <transition> tag requires 'fromId' & 'toId' attributes"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L9c:
            org.xmlpull.v1.XmlPullParserException r7 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r10.getPositionDescription()
            r8.append(r9)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
    }

    @Override // b.b.d.c.a.d, b.b.d.c.a.b
    b.b.d.c.a.a.c a() {
            r3 = this;
            b.b.d.c.a.a$c r0 = new b.b.d.c.a.a$c
            b.b.d.c.a.a$c r1 = r3.p
            r2 = 0
            r0.<init>(r1, r3, r2)
            return r0
    }

    @Override // b.b.d.c.a.d, b.b.d.c.a.b
    /* bridge */ /* synthetic */ b.b.d.c.a.b.c a() {
            r0 = this;
            b.b.d.c.a.a$c r0 = r0.a()
            return r0
    }

    @Override // b.b.d.c.a.d, b.b.d.c.a.b
    /* bridge */ /* synthetic */ b.b.d.c.a.d.a a() {
            r0 = this;
            b.b.d.c.a.a$c r0 = r0.a()
            return r0
    }

    public void a(android.content.Context r4, android.content.res.Resources r5, org.xmlpull.v1.XmlPullParser r6, android.util.AttributeSet r7, android.content.res.Resources.Theme r8) {
            r3 = this;
            int[] r0 = b.b.d.a.j.AnimatedStateListDrawableCompat
            android.content.res.TypedArray r0 = b.b.c.a.d.g.a(r5, r8, r7, r0)
            int r1 = b.b.d.a.j.AnimatedStateListDrawableCompat_android_visible
            r2 = 1
            boolean r1 = r0.getBoolean(r1, r2)
            r3.setVisible(r1, r2)
            r3.a(r0)
            r3.a(r5)
            r0.recycle()
            r3.c(r4, r5, r6, r7, r8)
            r3.c()
            return
    }

    @Override // b.b.d.c.a.d, b.b.d.c.a.b
    protected void a(b.b.d.c.a.b.c r2) {
            r1 = this;
            super.a(r2)
            boolean r0 = r2 instanceof b.b.d.c.a.a.c
            if (r0 == 0) goto Lb
            b.b.d.c.a.a$c r2 = (b.b.d.c.a.a.c) r2
            r1.p = r2
        Lb:
            return
    }

    @Override // b.b.d.c.a.d, android.graphics.drawable.Drawable
    public boolean isStateful() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // b.b.d.c.a.b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
            r1 = this;
            super.jumpToCurrentState()
            b.b.d.c.a.a$g r0 = r1.q
            if (r0 == 0) goto L17
            r0.d()
            r0 = 0
            r1.q = r0
            int r0 = r1.r
            r1.a(r0)
            r0 = -1
            r1.r = r0
            r1.s = r0
        L17:
            return
    }

    @Override // b.b.d.c.a.d, b.b.d.c.a.b, android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
            r1 = this;
            boolean r0 = r1.t
            if (r0 != 0) goto L11
            super.mutate()
            if (r1 != r1) goto L11
            b.b.d.c.a.a$c r0 = r1.p
            r0.m()
            r0 = 1
            r1.t = r0
        L11:
            return r1
    }

    @Override // b.b.d.c.a.d, b.b.d.c.a.b, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] r3) {
            r2 = this;
            b.b.d.c.a.a$c r0 = r2.p
            int r0 = r0.b(r3)
            int r1 = r2.b()
            if (r0 == r1) goto L1a
            boolean r1 = r2.b(r0)
            if (r1 != 0) goto L18
            boolean r0 = r2.a(r0)
            if (r0 == 0) goto L1a
        L18:
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            android.graphics.drawable.Drawable r2 = r2.getCurrent()
            if (r2 == 0) goto L26
            boolean r2 = r2.setState(r3)
            r0 = r0 | r2
        L26:
            return r0
    }

    @Override // b.b.d.c.a.b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean r3, boolean r4) {
            r2 = this;
            boolean r0 = super.setVisible(r3, r4)
            b.b.d.c.a.a$g r1 = r2.q
            if (r1 == 0) goto L17
            if (r0 != 0) goto Lc
            if (r4 == 0) goto L17
        Lc:
            if (r3 == 0) goto L14
            b.b.d.c.a.a$g r2 = r2.q
            r2.c()
            goto L17
        L14:
            r2.jumpToCurrentState()
        L17:
            return r0
    }
}
