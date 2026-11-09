package b.b.c.g;

/* JADX INFO: loaded from: classes.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static java.lang.reflect.Field f1119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f1120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static java.util.WeakHashMap<android.view.View, java.lang.String> f1121c;
    private static java.util.WeakHashMap<android.view.View, b.b.c.g.u> d;

    static class a implements android.view.View.OnApplyWindowInsetsListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b.b.c.g.o f1122a;

        a(b.b.c.g.o r1) {
                r0 = this;
                r0.f1122a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public android.view.WindowInsets onApplyWindowInsets(android.view.View r1, android.view.WindowInsets r2) {
                r0 = this;
                b.b.c.g.y r2 = b.b.c.g.y.a(r2)
                b.b.c.g.o r0 = r0.f1122a
                b.b.c.g.y r0 = r0.a(r1, r2)
                java.lang.Object r0 = b.b.c.g.y.a(r0)
                android.view.WindowInsets r0 = (android.view.WindowInsets) r0
                return r0
        }
    }

    public interface b {
        boolean a(android.view.View r1, android.view.KeyEvent r2);
    }

    static class c {
        private static final java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> d = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.util.WeakHashMap<android.view.View, java.lang.Boolean> f1123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> f1124b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private java.lang.ref.WeakReference<android.view.KeyEvent> f1125c;

        static {
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                b.b.c.g.q.c.d = r0
                return
        }

        c() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f1123a = r0
                r1.f1124b = r0
                r1.f1125c = r0
                return
        }

        private android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> a() {
                r1 = this;
                android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> r0 = r1.f1124b
                if (r0 != 0) goto Lb
                android.util.SparseArray r0 = new android.util.SparseArray
                r0.<init>()
                r1.f1124b = r0
            Lb:
                android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> r1 = r1.f1124b
                return r1
        }

        static b.b.c.g.q.c a(android.view.View r2) {
                int r0 = b.b.a.b.tag_unhandled_key_event_manager
                java.lang.Object r0 = r2.getTag(r0)
                b.b.c.g.q$c r0 = (b.b.c.g.q.c) r0
                if (r0 != 0) goto L14
                b.b.c.g.q$c r0 = new b.b.c.g.q$c
                r0.<init>()
                int r1 = b.b.a.b.tag_unhandled_key_event_manager
                r2.setTag(r1, r0)
            L14:
                return r0
        }

        private android.view.View b(android.view.View r5, android.view.KeyEvent r6) {
                r4 = this;
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r0 = r4.f1123a
                r1 = 0
                if (r0 == 0) goto L30
                boolean r0 = r0.containsKey(r5)
                if (r0 != 0) goto Lc
                goto L30
            Lc:
                boolean r0 = r5 instanceof android.view.ViewGroup
                if (r0 == 0) goto L29
                r0 = r5
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                int r2 = r0.getChildCount()
                int r2 = r2 + (-1)
            L19:
                if (r2 < 0) goto L29
                android.view.View r3 = r0.getChildAt(r2)
                android.view.View r3 = r4.b(r3, r6)
                if (r3 == 0) goto L26
                return r3
            L26:
                int r2 = r2 + (-1)
                goto L19
            L29:
                boolean r4 = r4.c(r5, r6)
                if (r4 == 0) goto L30
                return r5
            L30:
                return r1
        }

        private void b() {
                r6 = this;
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r0 = r6.f1123a
                if (r0 == 0) goto L7
                r0.clear()
            L7:
                java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> r0 = b.b.c.g.q.c.d
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L10
                return
            L10:
                java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> r0 = b.b.c.g.q.c.d
                monitor-enter(r0)
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r1 = r6.f1123a     // Catch: java.lang.Throwable -> L61
                if (r1 != 0) goto L1e
                java.util.WeakHashMap r1 = new java.util.WeakHashMap     // Catch: java.lang.Throwable -> L61
                r1.<init>()     // Catch: java.lang.Throwable -> L61
                r6.f1123a = r1     // Catch: java.lang.Throwable -> L61
            L1e:
                java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> r1 = b.b.c.g.q.c.d     // Catch: java.lang.Throwable -> L61
                int r1 = r1.size()     // Catch: java.lang.Throwable -> L61
                int r1 = r1 + (-1)
            L26:
                if (r1 < 0) goto L5f
                java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> r2 = b.b.c.g.q.c.d     // Catch: java.lang.Throwable -> L61
                java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L61
                java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: java.lang.Throwable -> L61
                java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L61
                android.view.View r2 = (android.view.View) r2     // Catch: java.lang.Throwable -> L61
                if (r2 != 0) goto L3e
                java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> r2 = b.b.c.g.q.c.d     // Catch: java.lang.Throwable -> L61
                r2.remove(r1)     // Catch: java.lang.Throwable -> L61
                goto L5c
            L3e:
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r3 = r6.f1123a     // Catch: java.lang.Throwable -> L61
                java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L61
                r3.put(r2, r4)     // Catch: java.lang.Throwable -> L61
                android.view.ViewParent r2 = r2.getParent()     // Catch: java.lang.Throwable -> L61
            L49:
                boolean r3 = r2 instanceof android.view.View     // Catch: java.lang.Throwable -> L61
                if (r3 == 0) goto L5c
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r3 = r6.f1123a     // Catch: java.lang.Throwable -> L61
                r4 = r2
                android.view.View r4 = (android.view.View) r4     // Catch: java.lang.Throwable -> L61
                java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L61
                r3.put(r4, r5)     // Catch: java.lang.Throwable -> L61
                android.view.ViewParent r2 = r2.getParent()     // Catch: java.lang.Throwable -> L61
                goto L49
            L5c:
                int r1 = r1 + (-1)
                goto L26
            L5f:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L61
                return
            L61:
                r6 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L61
                throw r6
        }

        private boolean c(android.view.View r4, android.view.KeyEvent r5) {
                r3 = this;
                int r3 = b.b.a.b.tag_unhandled_key_listeners
                java.lang.Object r3 = r4.getTag(r3)
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                if (r3 == 0) goto L22
                int r0 = r3.size()
                r1 = 1
                int r0 = r0 - r1
            L10:
                if (r0 < 0) goto L22
                java.lang.Object r2 = r3.get(r0)
                b.b.c.g.q$b r2 = (b.b.c.g.q.b) r2
                boolean r2 = r2.a(r4, r5)
                if (r2 == 0) goto L1f
                return r1
            L1f:
                int r0 = r0 + (-1)
                goto L10
            L22:
                r3 = 0
                return r3
        }

        boolean a(android.view.KeyEvent r6) {
                r5 = this;
                java.lang.ref.WeakReference<android.view.KeyEvent> r0 = r5.f1125c
                r1 = 0
                if (r0 == 0) goto Lc
                java.lang.Object r0 = r0.get()
                if (r0 != r6) goto Lc
                return r1
            Lc:
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r6)
                r5.f1125c = r0
                r0 = 0
                android.util.SparseArray r2 = r5.a()
                int r3 = r6.getAction()
                r4 = 1
                if (r3 != r4) goto L32
                int r3 = r6.getKeyCode()
                int r3 = r2.indexOfKey(r3)
                if (r3 < 0) goto L32
                java.lang.Object r0 = r2.valueAt(r3)
                java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
                r2.removeAt(r3)
            L32:
                if (r0 != 0) goto L3e
                int r0 = r6.getKeyCode()
                java.lang.Object r0 = r2.get(r0)
                java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            L3e:
                if (r0 == 0) goto L52
                java.lang.Object r0 = r0.get()
                android.view.View r0 = (android.view.View) r0
                if (r0 == 0) goto L51
                boolean r1 = b.b.c.g.q.j(r0)
                if (r1 == 0) goto L51
                r5.c(r0, r6)
            L51:
                return r4
            L52:
                return r1
        }

        boolean a(android.view.View r2, android.view.KeyEvent r3) {
                r1 = this;
                int r0 = r3.getAction()
                if (r0 != 0) goto L9
                r1.b()
            L9:
                android.view.View r2 = r1.b(r2, r3)
                int r0 = r3.getAction()
                if (r0 != 0) goto L2b
                int r3 = r3.getKeyCode()
                if (r2 == 0) goto L2b
                boolean r0 = android.view.KeyEvent.isModifierKey(r3)
                if (r0 != 0) goto L2b
                android.util.SparseArray r1 = r1.a()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.put(r3, r0)
            L2b:
                if (r2 == 0) goto L2f
                r1 = 1
                goto L30
            L2f:
                r1 = 0
            L30:
                return r1
        }
    }

    static {
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 1
            r0.<init>(r1)
            r0 = 0
            b.b.c.g.q.d = r0
            return
    }

    public static b.b.c.g.u a(android.view.View r2) {
            java.util.WeakHashMap<android.view.View, b.b.c.g.u> r0 = b.b.c.g.q.d
            if (r0 != 0) goto Lb
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            b.b.c.g.q.d = r0
        Lb:
            java.util.WeakHashMap<android.view.View, b.b.c.g.u> r0 = b.b.c.g.q.d
            java.lang.Object r0 = r0.get(r2)
            b.b.c.g.u r0 = (b.b.c.g.u) r0
            if (r0 != 0) goto L1f
            b.b.c.g.u r0 = new b.b.c.g.u
            r0.<init>(r2)
            java.util.WeakHashMap<android.view.View, b.b.c.g.u> r1 = b.b.c.g.q.d
            r1.put(r2, r0)
        L1f:
            return r0
    }

    public static b.b.c.g.y a(android.view.View r2, b.b.c.g.y r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L1c
            java.lang.Object r3 = b.b.c.g.y.a(r3)
            android.view.WindowInsets r3 = (android.view.WindowInsets) r3
            android.view.WindowInsets r2 = r2.onApplyWindowInsets(r3)
            if (r2 == r3) goto L17
            android.view.WindowInsets r3 = new android.view.WindowInsets
            r3.<init>(r2)
        L17:
            b.b.c.g.y r2 = b.b.c.g.y.a(r3)
            return r2
        L1c:
            return r3
    }

    public static void a(android.view.View r2, float r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L9
            r2.setElevation(r3)
        L9:
            return
    }

    public static void a(android.view.View r2, int r3, int r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L9
            r2.setScrollIndicators(r3, r4)
        L9:
            return
    }

    public static void a(android.view.View r2, android.content.res.ColorStateList r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L36
            r2.setBackgroundTintList(r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 != r1) goto L3f
            android.graphics.drawable.Drawable r3 = r2.getBackground()
            android.content.res.ColorStateList r0 = r2.getBackgroundTintList()
            if (r0 != 0) goto L20
            android.graphics.PorterDuff$Mode r0 = r2.getBackgroundTintMode()
            if (r0 == 0) goto L1e
            goto L20
        L1e:
            r0 = 0
            goto L21
        L20:
            r0 = 1
        L21:
            if (r3 == 0) goto L3f
            if (r0 == 0) goto L3f
            boolean r0 = r3.isStateful()
            if (r0 == 0) goto L32
            int[] r0 = r2.getDrawableState()
            r3.setState(r0)
        L32:
            r2.setBackground(r3)
            goto L3f
        L36:
            boolean r0 = r2 instanceof b.b.c.g.p
            if (r0 == 0) goto L3f
            b.b.c.g.p r2 = (b.b.c.g.p) r2
            r2.setSupportBackgroundTintList(r3)
        L3f:
            return
    }

    public static void a(android.view.View r2, android.graphics.PorterDuff.Mode r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L36
            r2.setBackgroundTintMode(r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 != r1) goto L3f
            android.graphics.drawable.Drawable r3 = r2.getBackground()
            android.content.res.ColorStateList r0 = r2.getBackgroundTintList()
            if (r0 != 0) goto L20
            android.graphics.PorterDuff$Mode r0 = r2.getBackgroundTintMode()
            if (r0 == 0) goto L1e
            goto L20
        L1e:
            r0 = 0
            goto L21
        L20:
            r0 = 1
        L21:
            if (r3 == 0) goto L3f
            if (r0 == 0) goto L3f
            boolean r0 = r3.isStateful()
            if (r0 == 0) goto L32
            int[] r0 = r2.getDrawableState()
            r3.setState(r0)
        L32:
            r2.setBackground(r3)
            goto L3f
        L36:
            boolean r0 = r2 instanceof b.b.c.g.p
            if (r0 == 0) goto L3f
            b.b.c.g.p r2 = (b.b.c.g.p) r2
            r2.setSupportBackgroundTintMode(r3)
        L3f:
            return
    }

    public static void a(android.view.View r2, android.graphics.drawable.Drawable r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto La
            r2.setBackground(r3)
            goto Ld
        La:
            r2.setBackgroundDrawable(r3)
        Ld:
            return
    }

    public static void a(android.view.View r0, b.b.c.g.b r1) {
            if (r1 != 0) goto L4
            r1 = 0
            goto L8
        L4:
            android.view.View$AccessibilityDelegate r1 = r1.a()
        L8:
            r0.setAccessibilityDelegate(r1)
            return
    }

    public static void a(android.view.View r2, b.b.c.g.o r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L15
            if (r3 != 0) goto Ld
            r3 = 0
            r2.setOnApplyWindowInsetsListener(r3)
            return
        Ld:
            b.b.c.g.q$a r0 = new b.b.c.g.q$a
            r0.<init>(r3)
            r2.setOnApplyWindowInsetsListener(r0)
        L15:
            return
    }

    public static void a(android.view.View r2, java.lang.Runnable r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto La
            r2.postOnAnimation(r3)
            goto L11
        La:
            long r0 = android.animation.ValueAnimator.getFrameDelay()
            r2.postDelayed(r3, r0)
        L11:
            return
    }

    public static void a(android.view.View r2, java.lang.Runnable r3, long r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto La
            r2.postOnAnimationDelayed(r3, r4)
            goto L12
        La:
            long r0 = android.animation.ValueAnimator.getFrameDelay()
            long r0 = r0 + r4
            r2.postDelayed(r3, r0)
        L12:
            return
    }

    public static void a(android.view.View r2, java.lang.String r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto La
            r2.setTransitionName(r3)
            goto L1a
        La:
            java.util.WeakHashMap<android.view.View, java.lang.String> r0 = b.b.c.g.q.f1121c
            if (r0 != 0) goto L15
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            b.b.c.g.q.f1121c = r0
        L15:
            java.util.WeakHashMap<android.view.View, java.lang.String> r0 = b.b.c.g.q.f1121c
            r0.put(r2, r3)
        L1a:
            return
    }

    static boolean a(android.view.View r2, android.view.KeyEvent r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L8
            r2 = 0
            return r2
        L8:
            b.b.c.g.q$c r0 = b.b.c.g.q.c.a(r2)
            boolean r2 = r0.a(r2, r3)
            return r2
    }

    public static android.content.res.ColorStateList b(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto Lb
            android.content.res.ColorStateList r2 = r2.getBackgroundTintList()
            return r2
        Lb:
            boolean r0 = r2 instanceof b.b.c.g.p
            if (r0 == 0) goto L16
            b.b.c.g.p r2 = (b.b.c.g.p) r2
            android.content.res.ColorStateList r2 = r2.getSupportBackgroundTintList()
            goto L17
        L16:
            r2 = 0
        L17:
            return r2
    }

    static boolean b(android.view.View r2, android.view.KeyEvent r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L8
            r2 = 0
            return r2
        L8:
            b.b.c.g.q$c r2 = b.b.c.g.q.c.a(r2)
            boolean r2 = r2.a(r3)
            return r2
    }

    public static android.graphics.PorterDuff.Mode c(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto Lb
            android.graphics.PorterDuff$Mode r2 = r2.getBackgroundTintMode()
            return r2
        Lb:
            boolean r0 = r2 instanceof b.b.c.g.p
            if (r0 == 0) goto L16
            b.b.c.g.p r2 = (b.b.c.g.p) r2
            android.graphics.PorterDuff$Mode r2 = r2.getSupportBackgroundTintMode()
            goto L17
        L16:
            r2 = 0
        L17:
            return r2
    }

    public static int d(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r0 < r1) goto Lb
            int r2 = r2.getLayoutDirection()
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public static int e(android.view.View r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto Lb
            int r3 = r3.getMinimumHeight()
            return r3
        Lb:
            boolean r0 = b.b.c.g.q.f1120b
            if (r0 != 0) goto L1f
            r0 = 1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            java.lang.String r2 = "mMinHeight"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> L1d
            b.b.c.g.q.f1119a = r1     // Catch: java.lang.NoSuchFieldException -> L1d
            r1.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L1d
        L1d:
            b.b.c.g.q.f1120b = r0
        L1f:
            java.lang.reflect.Field r0 = b.b.c.g.q.f1119a
            if (r0 == 0) goto L2e
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Exception -> L2e
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Exception -> L2e
            int r3 = r3.intValue()     // Catch: java.lang.Exception -> L2e
            return r3
        L2e:
            r3 = 0
            return r3
    }

    public static java.lang.String f(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto Lb
            java.lang.String r2 = r2.getTransitionName()
            return r2
        Lb:
            java.util.WeakHashMap<android.view.View, java.lang.String> r0 = b.b.c.g.q.f1121c
            if (r0 != 0) goto L11
            r2 = 0
            return r2
        L11:
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }

    public static int g(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto Lb
            int r2 = r2.getWindowSystemUiVisibility()
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public static boolean h(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 15
            if (r0 < r1) goto Lb
            boolean r2 = r2.hasOnClickListeners()
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public static boolean i(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto Lb
            boolean r2 = r2.hasOverlappingRendering()
            return r2
        Lb:
            r2 = 1
            return r2
    }

    public static boolean j(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 < r1) goto Lb
            boolean r2 = r2.isAttachedToWindow()
            return r2
        Lb:
            android.os.IBinder r2 = r2.getWindowToken()
            if (r2 == 0) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            return r2
    }

    public static boolean k(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 < r1) goto Lb
            boolean r2 = r2.isLaidOut()
            return r2
        Lb:
            int r0 = r2.getWidth()
            if (r0 <= 0) goto L19
            int r2 = r2.getHeight()
            if (r2 <= 0) goto L19
            r2 = 1
            goto L1a
        L19:
            r2 = 0
        L1a:
            return r2
    }

    public static void l(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto La
            r2.postInvalidateOnAnimation()
            goto Ld
        La:
            r2.postInvalidate()
        Ld:
            return
    }

    public static void m(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 20
            if (r0 < r1) goto La
            r2.requestApplyInsets()
            goto L11
        La:
            r1 = 16
            if (r0 < r1) goto L11
            r2.requestFitSystemWindows()
        L11:
            return
    }

    public static void n(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto La
            r2.stopNestedScroll()
            goto L13
        La:
            boolean r0 = r2 instanceof b.b.c.g.j
            if (r0 == 0) goto L13
            b.b.c.g.j r2 = (b.b.c.g.j) r2
            r2.stopNestedScroll()
        L13:
            return
    }
}
