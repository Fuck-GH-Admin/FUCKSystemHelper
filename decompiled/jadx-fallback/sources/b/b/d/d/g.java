package b.b.d.d;

/* JADX INFO: loaded from: classes.dex */
public class g extends android.view.MenuInflater {
    static final java.lang.Class<?>[] e = null;
    static final java.lang.Class<?>[] f = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final java.lang.Object[] f1169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final java.lang.Object[] f1170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    android.content.Context f1171c;
    private java.lang.Object d;

    private static class a implements android.view.MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final java.lang.Class<?>[] f1172c = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.Object f1173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.lang.reflect.Method f1174b;

        static {
                r0 = 1
                java.lang.Class[] r0 = new java.lang.Class[r0]
                r1 = 0
                java.lang.Class<android.view.MenuItem> r2 = android.view.MenuItem.class
                r0[r1] = r2
                b.b.d.d.g.a.f1172c = r0
                return
        }

        public a(java.lang.Object r4, java.lang.String r5) {
                r3 = this;
                r3.<init>()
                r3.f1173a = r4
                java.lang.Class r4 = r4.getClass()
                java.lang.Class<?>[] r0 = b.b.d.d.g.a.f1172c     // Catch: java.lang.Exception -> L12
                java.lang.reflect.Method r0 = r4.getMethod(r5, r0)     // Catch: java.lang.Exception -> L12
                r3.f1174b = r0     // Catch: java.lang.Exception -> L12
                return
            L12:
                r3 = move-exception
                android.view.InflateException r0 = new android.view.InflateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Couldn't resolve menu item onClick handler "
                r1.append(r2)
                r1.append(r5)
                java.lang.String r5 = " in class "
                r1.append(r5)
                java.lang.String r4 = r4.getName()
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                r0.initCause(r3)
                throw r0
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(android.view.MenuItem r5) {
                r4 = this;
                java.lang.reflect.Method r0 = r4.f1174b     // Catch: java.lang.Exception -> L2b
                java.lang.Class r0 = r0.getReturnType()     // Catch: java.lang.Exception -> L2b
                java.lang.Class r1 = java.lang.Boolean.TYPE     // Catch: java.lang.Exception -> L2b
                r2 = 0
                r3 = 1
                if (r0 != r1) goto L1f
                java.lang.reflect.Method r0 = r4.f1174b     // Catch: java.lang.Exception -> L2b
                java.lang.Object r4 = r4.f1173a     // Catch: java.lang.Exception -> L2b
                java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L2b
                r1[r2] = r5     // Catch: java.lang.Exception -> L2b
                java.lang.Object r4 = r0.invoke(r4, r1)     // Catch: java.lang.Exception -> L2b
                java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Exception -> L2b
                boolean r4 = r4.booleanValue()     // Catch: java.lang.Exception -> L2b
                return r4
            L1f:
                java.lang.reflect.Method r0 = r4.f1174b     // Catch: java.lang.Exception -> L2b
                java.lang.Object r4 = r4.f1173a     // Catch: java.lang.Exception -> L2b
                java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L2b
                r1[r2] = r5     // Catch: java.lang.Exception -> L2b
                r0.invoke(r4, r1)     // Catch: java.lang.Exception -> L2b
                return r3
            L2b:
                r4 = move-exception
                java.lang.RuntimeException r5 = new java.lang.RuntimeException
                r5.<init>(r4)
                throw r5
        }
    }

    private class b {
        b.b.c.g.c A;
        private java.lang.CharSequence B;
        private java.lang.CharSequence C;
        private android.content.res.ColorStateList D;
        private android.graphics.PorterDuff.Mode E;
        final /* synthetic */ b.b.d.d.g F;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private android.view.Menu f1175a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f1176b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f1177c;
        private int d;
        private int e;
        private boolean f;
        private boolean g;
        private boolean h;
        private int i;
        private int j;
        private java.lang.CharSequence k;
        private java.lang.CharSequence l;
        private int m;
        private char n;
        private int o;
        private char p;
        private int q;
        private int r;
        private boolean s;
        private boolean t;
        private boolean u;
        private int v;
        private int w;
        private java.lang.String x;
        private java.lang.String y;
        private java.lang.String z;

        public b(b.b.d.d.g r1, android.view.Menu r2) {
                r0 = this;
                r0.F = r1
                r0.<init>()
                r1 = 0
                r0.D = r1
                r0.E = r1
                r0.f1175a = r2
                r0.d()
                return
        }

        private char a(java.lang.String r1) {
                r0 = this;
                r0 = 0
                if (r1 != 0) goto L4
                return r0
            L4:
                char r0 = r1.charAt(r0)
                return r0
        }

        private <T> T a(java.lang.String r1, java.lang.Class<?>[] r2, java.lang.Object[] r3) {
                r0 = this;
                b.b.d.d.g r0 = r0.F     // Catch: java.lang.Exception -> L19
                android.content.Context r0 = r0.f1171c     // Catch: java.lang.Exception -> L19
                java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Exception -> L19
                java.lang.Class r0 = r0.loadClass(r1)     // Catch: java.lang.Exception -> L19
                java.lang.reflect.Constructor r0 = r0.getConstructor(r2)     // Catch: java.lang.Exception -> L19
                r2 = 1
                r0.setAccessible(r2)     // Catch: java.lang.Exception -> L19
                java.lang.Object r0 = r0.newInstance(r3)     // Catch: java.lang.Exception -> L19
                return r0
            L19:
                r0 = move-exception
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Cannot instantiate class: "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                java.lang.String r2 = "SupportMenuInflater"
                android.util.Log.w(r2, r1, r0)
                r0 = 0
                return r0
        }

        private void a(android.view.MenuItem r6) {
                r5 = this;
                boolean r0 = r5.s
                android.view.MenuItem r0 = r6.setChecked(r0)
                boolean r1 = r5.t
                android.view.MenuItem r0 = r0.setVisible(r1)
                boolean r1 = r5.u
                android.view.MenuItem r0 = r0.setEnabled(r1)
                int r1 = r5.r
                r2 = 0
                r3 = 1
                if (r1 < r3) goto L1a
                r1 = r3
                goto L1b
            L1a:
                r1 = r2
            L1b:
                android.view.MenuItem r0 = r0.setCheckable(r1)
                java.lang.CharSequence r1 = r5.l
                android.view.MenuItem r0 = r0.setTitleCondensed(r1)
                int r1 = r5.m
                r0.setIcon(r1)
                int r0 = r5.v
                if (r0 < 0) goto L31
                r6.setShowAsAction(r0)
            L31:
                java.lang.String r0 = r5.z
                if (r0 == 0) goto L58
                b.b.d.d.g r0 = r5.F
                android.content.Context r0 = r0.f1171c
                boolean r0 = r0.isRestricted()
                if (r0 != 0) goto L50
                b.b.d.d.g$a r0 = new b.b.d.d.g$a
                b.b.d.d.g r1 = r5.F
                java.lang.Object r1 = r1.a()
                java.lang.String r4 = r5.z
                r0.<init>(r1, r4)
                r6.setOnMenuItemClickListener(r0)
                goto L58
            L50:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "The android:onClick attribute cannot be used within a restricted context"
                r5.<init>(r6)
                throw r5
            L58:
                boolean r0 = r6 instanceof android.support.v7.view.menu.j
                if (r0 == 0) goto L5f
                r1 = r6
                android.support.v7.view.menu.j r1 = (android.support.v7.view.menu.j) r1
            L5f:
                int r1 = r5.r
                r4 = 2
                if (r1 < r4) goto L77
                if (r0 == 0) goto L6d
                r0 = r6
                android.support.v7.view.menu.j r0 = (android.support.v7.view.menu.j) r0
                r0.c(r3)
                goto L77
            L6d:
                boolean r0 = r6 instanceof android.support.v7.view.menu.k
                if (r0 == 0) goto L77
                r0 = r6
                android.support.v7.view.menu.k r0 = (android.support.v7.view.menu.k) r0
                r0.a(r3)
            L77:
                java.lang.String r0 = r5.x
                if (r0 == 0) goto L8b
                java.lang.Class<?>[] r1 = b.b.d.d.g.e
                b.b.d.d.g r2 = r5.F
                java.lang.Object[] r2 = r2.f1169a
                java.lang.Object r0 = r5.a(r0, r1, r2)
                android.view.View r0 = (android.view.View) r0
                r6.setActionView(r0)
                r2 = r3
            L8b:
                int r0 = r5.w
                if (r0 <= 0) goto L9c
                if (r2 != 0) goto L95
                r6.setActionView(r0)
                goto L9c
            L95:
                java.lang.String r0 = "SupportMenuInflater"
                java.lang.String r1 = "Ignoring attribute 'itemActionViewLayout'. Action view already specified."
                android.util.Log.w(r0, r1)
            L9c:
                b.b.c.g.c r0 = r5.A
                if (r0 == 0) goto La3
                b.b.c.g.h.a(r6, r0)
            La3:
                java.lang.CharSequence r0 = r5.B
                b.b.c.g.h.a(r6, r0)
                java.lang.CharSequence r0 = r5.C
                b.b.c.g.h.b(r6, r0)
                char r0 = r5.n
                int r1 = r5.o
                b.b.c.g.h.a(r6, r0, r1)
                char r0 = r5.p
                int r1 = r5.q
                b.b.c.g.h.b(r6, r0, r1)
                android.graphics.PorterDuff$Mode r0 = r5.E
                if (r0 == 0) goto Lc2
                b.b.c.g.h.a(r6, r0)
            Lc2:
                android.content.res.ColorStateList r5 = r5.D
                if (r5 == 0) goto Lc9
                b.b.c.g.h.a(r6, r5)
            Lc9:
                return
        }

        public void a() {
                r5 = this;
                r0 = 1
                r5.h = r0
                android.view.Menu r0 = r5.f1175a
                int r1 = r5.f1176b
                int r2 = r5.i
                int r3 = r5.j
                java.lang.CharSequence r4 = r5.k
                android.view.MenuItem r0 = r0.add(r1, r2, r3, r4)
                r5.a(r0)
                return
        }

        public void a(android.util.AttributeSet r3) {
                r2 = this;
                b.b.d.d.g r0 = r2.F
                android.content.Context r0 = r0.f1171c
                int[] r1 = b.b.d.a.j.MenuGroup
                android.content.res.TypedArray r3 = r0.obtainStyledAttributes(r3, r1)
                int r0 = b.b.d.a.j.MenuGroup_android_id
                r1 = 0
                int r0 = r3.getResourceId(r0, r1)
                r2.f1176b = r0
                int r0 = b.b.d.a.j.MenuGroup_android_menuCategory
                int r0 = r3.getInt(r0, r1)
                r2.f1177c = r0
                int r0 = b.b.d.a.j.MenuGroup_android_orderInCategory
                int r0 = r3.getInt(r0, r1)
                r2.d = r0
                int r0 = b.b.d.a.j.MenuGroup_android_checkableBehavior
                int r0 = r3.getInt(r0, r1)
                r2.e = r0
                int r0 = b.b.d.a.j.MenuGroup_android_visible
                r1 = 1
                boolean r0 = r3.getBoolean(r0, r1)
                r2.f = r0
                int r0 = b.b.d.a.j.MenuGroup_android_enabled
                boolean r0 = r3.getBoolean(r0, r1)
                r2.g = r0
                r3.recycle()
                return
        }

        public android.view.SubMenu b() {
                r5 = this;
                r0 = 1
                r5.h = r0
                android.view.Menu r0 = r5.f1175a
                int r1 = r5.f1176b
                int r2 = r5.i
                int r3 = r5.j
                java.lang.CharSequence r4 = r5.k
                android.view.SubMenu r0 = r0.addSubMenu(r1, r2, r3, r4)
                android.view.MenuItem r1 = r0.getItem()
                r5.a(r1)
                return r0
        }

        public void b(android.util.AttributeSet r7) {
                r6 = this;
                b.b.d.d.g r0 = r6.F
                android.content.Context r0 = r0.f1171c
                int[] r1 = b.b.d.a.j.MenuItem
                android.content.res.TypedArray r7 = r0.obtainStyledAttributes(r7, r1)
                int r0 = b.b.d.a.j.MenuItem_android_id
                r1 = 0
                int r0 = r7.getResourceId(r0, r1)
                r6.i = r0
                int r0 = b.b.d.a.j.MenuItem_android_menuCategory
                int r2 = r6.f1177c
                int r0 = r7.getInt(r0, r2)
                int r2 = b.b.d.a.j.MenuItem_android_orderInCategory
                int r3 = r6.d
                int r2 = r7.getInt(r2, r3)
                r3 = -65536(0xffffffffffff0000, float:NaN)
                r0 = r0 & r3
                r3 = 65535(0xffff, float:9.1834E-41)
                r2 = r2 & r3
                r0 = r0 | r2
                r6.j = r0
                int r0 = b.b.d.a.j.MenuItem_android_title
                java.lang.CharSequence r0 = r7.getText(r0)
                r6.k = r0
                int r0 = b.b.d.a.j.MenuItem_android_titleCondensed
                java.lang.CharSequence r0 = r7.getText(r0)
                r6.l = r0
                int r0 = b.b.d.a.j.MenuItem_android_icon
                int r0 = r7.getResourceId(r0, r1)
                r6.m = r0
                int r0 = b.b.d.a.j.MenuItem_android_alphabeticShortcut
                java.lang.String r0 = r7.getString(r0)
                char r0 = r6.a(r0)
                r6.n = r0
                int r0 = b.b.d.a.j.MenuItem_alphabeticModifiers
                r2 = 4096(0x1000, float:5.74E-42)
                int r0 = r7.getInt(r0, r2)
                r6.o = r0
                int r0 = b.b.d.a.j.MenuItem_android_numericShortcut
                java.lang.String r0 = r7.getString(r0)
                char r0 = r6.a(r0)
                r6.p = r0
                int r0 = b.b.d.a.j.MenuItem_numericModifiers
                int r0 = r7.getInt(r0, r2)
                r6.q = r0
                int r0 = b.b.d.a.j.MenuItem_android_checkable
                boolean r0 = r7.hasValue(r0)
                if (r0 == 0) goto L7e
                int r0 = b.b.d.a.j.MenuItem_android_checkable
                boolean r0 = r7.getBoolean(r0, r1)
                goto L80
            L7e:
                int r0 = r6.e
            L80:
                r6.r = r0
                int r0 = b.b.d.a.j.MenuItem_android_checked
                boolean r0 = r7.getBoolean(r0, r1)
                r6.s = r0
                int r0 = b.b.d.a.j.MenuItem_android_visible
                boolean r2 = r6.f
                boolean r0 = r7.getBoolean(r0, r2)
                r6.t = r0
                int r0 = b.b.d.a.j.MenuItem_android_enabled
                boolean r2 = r6.g
                boolean r0 = r7.getBoolean(r0, r2)
                r6.u = r0
                int r0 = b.b.d.a.j.MenuItem_showAsAction
                r2 = -1
                int r0 = r7.getInt(r0, r2)
                r6.v = r0
                int r0 = b.b.d.a.j.MenuItem_android_onClick
                java.lang.String r0 = r7.getString(r0)
                r6.z = r0
                int r0 = b.b.d.a.j.MenuItem_actionLayout
                int r0 = r7.getResourceId(r0, r1)
                r6.w = r0
                int r0 = b.b.d.a.j.MenuItem_actionViewClass
                java.lang.String r0 = r7.getString(r0)
                r6.x = r0
                int r0 = b.b.d.a.j.MenuItem_actionProviderClass
                java.lang.String r0 = r7.getString(r0)
                r6.y = r0
                if (r0 == 0) goto Lcb
                r0 = 1
                goto Lcc
            Lcb:
                r0 = r1
            Lcc:
                r3 = 0
                if (r0 == 0) goto Le8
                int r4 = r6.w
                if (r4 != 0) goto Le8
                java.lang.String r4 = r6.x
                if (r4 != 0) goto Le8
                java.lang.String r0 = r6.y
                java.lang.Class<?>[] r4 = b.b.d.d.g.f
                b.b.d.d.g r5 = r6.F
                java.lang.Object[] r5 = r5.f1170b
                java.lang.Object r0 = r6.a(r0, r4, r5)
                b.b.c.g.c r0 = (b.b.c.g.c) r0
                r6.A = r0
                goto Lf3
            Le8:
                if (r0 == 0) goto Lf1
                java.lang.String r0 = "SupportMenuInflater"
                java.lang.String r4 = "Ignoring attribute 'actionProviderClass'. Action view already specified."
                android.util.Log.w(r0, r4)
            Lf1:
                r6.A = r3
            Lf3:
                int r0 = b.b.d.a.j.MenuItem_contentDescription
                java.lang.CharSequence r0 = r7.getText(r0)
                r6.B = r0
                int r0 = b.b.d.a.j.MenuItem_tooltipText
                java.lang.CharSequence r0 = r7.getText(r0)
                r6.C = r0
                int r0 = b.b.d.a.j.MenuItem_iconTintMode
                boolean r0 = r7.hasValue(r0)
                if (r0 == 0) goto L11a
                int r0 = b.b.d.a.j.MenuItem_iconTintMode
                int r0 = r7.getInt(r0, r2)
                android.graphics.PorterDuff$Mode r2 = r6.E
                android.graphics.PorterDuff$Mode r0 = android.support.v7.widget.c0.a(r0, r2)
                r6.E = r0
                goto L11c
            L11a:
                r6.E = r3
            L11c:
                int r0 = b.b.d.a.j.MenuItem_iconTint
                boolean r0 = r7.hasValue(r0)
                if (r0 == 0) goto L12d
                int r0 = b.b.d.a.j.MenuItem_iconTint
                android.content.res.ColorStateList r0 = r7.getColorStateList(r0)
                r6.D = r0
                goto L12f
            L12d:
                r6.D = r3
            L12f:
                r7.recycle()
                r6.h = r1
                return
        }

        public boolean c() {
                r0 = this;
                boolean r0 = r0.h
                return r0
        }

        public void d() {
                r1 = this;
                r0 = 0
                r1.f1176b = r0
                r1.f1177c = r0
                r1.d = r0
                r1.e = r0
                r0 = 1
                r1.f = r0
                r1.g = r0
                return
        }
    }

    static {
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            b.b.d.d.g.e = r0
            b.b.d.d.g.f = r0
            return
    }

    public g(android.content.Context r3) {
            r2 = this;
            r2.<init>(r3)
            r2.f1171c = r3
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r2.f1169a = r0
            r2.f1170b = r0
            return
    }

    private java.lang.Object a(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 == 0) goto L5
            return r2
        L5:
            boolean r0 = r2 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L14
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            android.content.Context r2 = r2.getBaseContext()
            java.lang.Object r1 = r1.a(r2)
            return r1
        L14:
            return r2
    }

    private void a(org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.view.Menu r15) {
            r12 = this;
            b.b.d.d.g$b r0 = new b.b.d.d.g$b
            r0.<init>(r12, r15)
            int r15 = r13.getEventType()
        L9:
            r1 = 2
            java.lang.String r2 = "menu"
            r3 = 1
            if (r15 != r1) goto L35
            java.lang.String r15 = r13.getName()
            boolean r4 = r15.equals(r2)
            if (r4 == 0) goto L1e
            int r15 = r13.next()
            goto L3b
        L1e:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "Expecting menu, got "
            r13.append(r14)
            r13.append(r15)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L35:
            int r15 = r13.next()
            if (r15 != r3) goto L9
        L3b:
            r4 = 0
            r5 = 0
            r8 = r4
            r6 = r5
            r7 = r6
        L40:
            if (r6 != 0) goto Lc6
            if (r15 == r3) goto Lbe
            java.lang.String r9 = "item"
            java.lang.String r10 = "group"
            if (r15 == r1) goto L8e
            r11 = 3
            if (r15 == r11) goto L4f
            goto Lb9
        L4f:
            java.lang.String r15 = r13.getName()
            if (r7 == 0) goto L5e
            boolean r11 = r15.equals(r8)
            if (r11 == 0) goto L5e
            r8 = r4
            r7 = r5
            goto Lb9
        L5e:
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L68
            r0.d()
            goto Lb9
        L68:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L86
            boolean r15 = r0.c()
            if (r15 != 0) goto Lb9
            b.b.c.g.c r15 = r0.A
            if (r15 == 0) goto L82
            boolean r15 = r15.a()
            if (r15 == 0) goto L82
            r0.b()
            goto Lb9
        L82:
            r0.a()
            goto Lb9
        L86:
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto Lb9
            r6 = r3
            goto Lb9
        L8e:
            if (r7 == 0) goto L91
            goto Lb9
        L91:
            java.lang.String r15 = r13.getName()
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L9f
            r0.a(r14)
            goto Lb9
        L9f:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto La9
            r0.b(r14)
            goto Lb9
        La9:
            boolean r9 = r15.equals(r2)
            if (r9 == 0) goto Lb7
            android.view.SubMenu r15 = r0.b()
            r12.a(r13, r14, r15)
            goto Lb9
        Lb7:
            r8 = r15
            r7 = r3
        Lb9:
            int r15 = r13.next()
            goto L40
        Lbe:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException
            java.lang.String r13 = "Unexpected end of document"
            r12.<init>(r13)
            throw r12
        Lc6:
            return
    }

    java.lang.Object a() {
            r1 = this;
            java.lang.Object r0 = r1.d
            if (r0 != 0) goto Lc
            android.content.Context r0 = r1.f1171c
            java.lang.Object r0 = r1.a(r0)
            r1.d = r0
        Lc:
            java.lang.Object r1 = r1.d
            return r1
    }

    @Override // android.view.MenuInflater
    public void inflate(int r4, android.view.Menu r5) {
            r3 = this;
            java.lang.String r0 = "Error inflating menu XML"
            boolean r1 = r5 instanceof b.b.c.c.a.a
            if (r1 != 0) goto La
            super.inflate(r4, r5)
            return
        La:
            r1 = 0
            android.content.Context r2 = r3.f1171c     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24 org.xmlpull.v1.XmlPullParserException -> L2b
            android.content.res.Resources r2 = r2.getResources()     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24 org.xmlpull.v1.XmlPullParserException -> L2b
            android.content.res.XmlResourceParser r1 = r2.getLayout(r4)     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24 org.xmlpull.v1.XmlPullParserException -> L2b
            android.util.AttributeSet r4 = android.util.Xml.asAttributeSet(r1)     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24 org.xmlpull.v1.XmlPullParserException -> L2b
            r3.a(r1, r4, r5)     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24 org.xmlpull.v1.XmlPullParserException -> L2b
            if (r1 == 0) goto L21
            r1.close()
        L21:
            return
        L22:
            r3 = move-exception
            goto L32
        L24:
            r3 = move-exception
            android.view.InflateException r4 = new android.view.InflateException     // Catch: java.lang.Throwable -> L22
            r4.<init>(r0, r3)     // Catch: java.lang.Throwable -> L22
            throw r4     // Catch: java.lang.Throwable -> L22
        L2b:
            r3 = move-exception
            android.view.InflateException r4 = new android.view.InflateException     // Catch: java.lang.Throwable -> L22
            r4.<init>(r0, r3)     // Catch: java.lang.Throwable -> L22
            throw r4     // Catch: java.lang.Throwable -> L22
        L32:
            if (r1 == 0) goto L37
            r1.close()
        L37:
            throw r3
    }
}
