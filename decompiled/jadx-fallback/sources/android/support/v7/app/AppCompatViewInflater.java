package android.support.v7.app;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatViewInflater {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.lang.Class<?>[] f684b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f685c = null;
    private static final java.lang.String[] d = null;
    private static final java.util.Map<java.lang.String, java.lang.reflect.Constructor<? extends android.view.View>> e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object[] f686a;

    private static class a implements android.view.View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final android.view.View f687b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final java.lang.String f688c;
        private java.lang.reflect.Method d;
        private android.content.Context e;

        public a(android.view.View r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.f687b = r1
                r0.f688c = r2
                return
        }

        private void a(android.content.Context r5, java.lang.String r6) {
                r4 = this;
            L0:
                if (r5 == 0) goto L2e
                boolean r6 = r5.isRestricted()     // Catch: java.lang.NoSuchMethodException -> L21
                if (r6 != 0) goto L21
                java.lang.Class r6 = r5.getClass()     // Catch: java.lang.NoSuchMethodException -> L21
                java.lang.String r0 = r4.f688c     // Catch: java.lang.NoSuchMethodException -> L21
                r1 = 1
                java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchMethodException -> L21
                r2 = 0
                java.lang.Class<android.view.View> r3 = android.view.View.class
                r1[r2] = r3     // Catch: java.lang.NoSuchMethodException -> L21
                java.lang.reflect.Method r6 = r6.getMethod(r0, r1)     // Catch: java.lang.NoSuchMethodException -> L21
                if (r6 == 0) goto L21
                r4.d = r6     // Catch: java.lang.NoSuchMethodException -> L21
                r4.e = r5     // Catch: java.lang.NoSuchMethodException -> L21
                return
            L21:
                boolean r6 = r5 instanceof android.content.ContextWrapper
                if (r6 == 0) goto L2c
                android.content.ContextWrapper r5 = (android.content.ContextWrapper) r5
                android.content.Context r5 = r5.getBaseContext()
                goto L0
            L2c:
                r5 = 0
                goto L0
            L2e:
                android.view.View r5 = r4.f687b
                int r5 = r5.getId()
                r6 = -1
                if (r5 != r6) goto L3a
                java.lang.String r5 = ""
                goto L5e
            L3a:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r0 = " with id '"
                r6.append(r0)
                android.view.View r0 = r4.f687b
                android.content.Context r0 = r0.getContext()
                android.content.res.Resources r0 = r0.getResources()
                java.lang.String r5 = r0.getResourceEntryName(r5)
                r6.append(r5)
                java.lang.String r5 = "'"
                r6.append(r5)
                java.lang.String r5 = r6.toString()
            L5e:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Could not find method "
                r0.append(r1)
                java.lang.String r1 = r4.f688c
                r0.append(r1)
                java.lang.String r1 = "(View) in a parent or ancestor Context for android:onClick "
                r0.append(r1)
                java.lang.String r1 = "attribute defined on view "
                r0.append(r1)
                android.view.View r4 = r4.f687b
                java.lang.Class r4 = r4.getClass()
                r0.append(r4)
                r0.append(r5)
                java.lang.String r4 = r0.toString()
                r6.<init>(r4)
                throw r6
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r4) {
                r3 = this;
                java.lang.reflect.Method r0 = r3.d
                if (r0 != 0) goto Lf
                android.view.View r0 = r3.f687b
                android.content.Context r0 = r0.getContext()
                java.lang.String r1 = r3.f688c
                r3.a(r0, r1)
            Lf:
                java.lang.reflect.Method r0 = r3.d     // Catch: java.lang.reflect.InvocationTargetException -> L1d java.lang.IllegalAccessException -> L26
                android.content.Context r3 = r3.e     // Catch: java.lang.reflect.InvocationTargetException -> L1d java.lang.IllegalAccessException -> L26
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L1d java.lang.IllegalAccessException -> L26
                r2 = 0
                r1[r2] = r4     // Catch: java.lang.reflect.InvocationTargetException -> L1d java.lang.IllegalAccessException -> L26
                r0.invoke(r3, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L1d java.lang.IllegalAccessException -> L26
                return
            L1d:
                r3 = move-exception
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "Could not execute method for android:onClick"
                r4.<init>(r0, r3)
                throw r4
            L26:
                r3 = move-exception
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "Could not execute non-public method for android:onClick"
                r4.<init>(r0, r3)
                throw r4
        }
    }

    static {
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r2 = 0
            r0[r2] = r1
            java.lang.Class<android.util.AttributeSet> r1 = android.util.AttributeSet.class
            r3 = 1
            r0[r3] = r1
            android.support.v7.app.AppCompatViewInflater.f684b = r0
            int[] r0 = new int[r3]
            r1 = 16843375(0x101026f, float:2.3695304E-38)
            r0[r2] = r1
            android.support.v7.app.AppCompatViewInflater.f685c = r0
            java.lang.String r0 = "android.widget."
            java.lang.String r1 = "android.view."
            java.lang.String r2 = "android.webkit."
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2}
            android.support.v7.app.AppCompatViewInflater.d = r0
            b.b.c.f.a r0 = new b.b.c.f.a
            r0.<init>()
            android.support.v7.app.AppCompatViewInflater.e = r0
            return
    }

    public AppCompatViewInflater() {
            r1 = this;
            r1.<init>()
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1.f686a = r0
            return
    }

    private static android.content.Context a(android.content.Context r2, android.util.AttributeSet r3, boolean r4, boolean r5) {
            int[] r0 = b.b.d.a.j.View
            r1 = 0
            android.content.res.TypedArray r3 = r2.obtainStyledAttributes(r3, r0, r1, r1)
            if (r4 == 0) goto L10
            int r4 = b.b.d.a.j.View_android_theme
            int r4 = r3.getResourceId(r4, r1)
            goto L11
        L10:
            r4 = r1
        L11:
            if (r5 == 0) goto L24
            if (r4 != 0) goto L24
            int r4 = b.b.d.a.j.View_theme
            int r4 = r3.getResourceId(r4, r1)
            if (r4 == 0) goto L24
            java.lang.String r5 = "AppCompatViewInflater"
            java.lang.String r0 = "app:theme is now deprecated. Please move to using android:theme instead."
            android.util.Log.i(r5, r0)
        L24:
            r3.recycle()
            if (r4 == 0) goto L3c
            boolean r3 = r2 instanceof b.b.d.d.d
            if (r3 == 0) goto L36
            r3 = r2
            b.b.d.d.d r3 = (b.b.d.d.d) r3
            int r3 = r3.a()
            if (r3 == r4) goto L3c
        L36:
            b.b.d.d.d r3 = new b.b.d.d.d
            r3.<init>(r2, r4)
            r2 = r3
        L3c:
            return r2
    }

    private android.view.View a(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.reflect.Constructor<? extends android.view.View>> r0 = android.support.v7.app.AppCompatViewInflater.e
            java.lang.Object r0 = r0.get(r3)
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
            if (r0 != 0) goto L36
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Exception -> L43
            if (r4 == 0) goto L20
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L43
            r0.<init>()     // Catch: java.lang.Exception -> L43
            r0.append(r4)     // Catch: java.lang.Exception -> L43
            r0.append(r3)     // Catch: java.lang.Exception -> L43
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Exception -> L43
            goto L21
        L20:
            r4 = r3
        L21:
            java.lang.Class r2 = r2.loadClass(r4)     // Catch: java.lang.Exception -> L43
            java.lang.Class<android.view.View> r4 = android.view.View.class
            java.lang.Class r2 = r2.asSubclass(r4)     // Catch: java.lang.Exception -> L43
            java.lang.Class<?>[] r4 = android.support.v7.app.AppCompatViewInflater.f684b     // Catch: java.lang.Exception -> L43
            java.lang.reflect.Constructor r0 = r2.getConstructor(r4)     // Catch: java.lang.Exception -> L43
            java.util.Map<java.lang.String, java.lang.reflect.Constructor<? extends android.view.View>> r2 = android.support.v7.app.AppCompatViewInflater.e     // Catch: java.lang.Exception -> L43
            r2.put(r3, r0)     // Catch: java.lang.Exception -> L43
        L36:
            r2 = 1
            r0.setAccessible(r2)     // Catch: java.lang.Exception -> L43
            java.lang.Object[] r1 = r1.f686a     // Catch: java.lang.Exception -> L43
            java.lang.Object r1 = r0.newInstance(r1)     // Catch: java.lang.Exception -> L43
            android.view.View r1 = (android.view.View) r1     // Catch: java.lang.Exception -> L43
            return r1
        L43:
            r1 = 0
            return r1
    }

    private void a(android.view.View r3, android.util.AttributeSet r4) {
            r2 = this;
            android.content.Context r2 = r3.getContext()
            boolean r0 = r2 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L2d
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 15
            if (r0 < r1) goto L15
            boolean r0 = b.b.c.g.q.h(r3)
            if (r0 != 0) goto L15
            goto L2d
        L15:
            int[] r0 = android.support.v7.app.AppCompatViewInflater.f685c
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r4, r0)
            r4 = 0
            java.lang.String r4 = r2.getString(r4)
            if (r4 == 0) goto L2a
            android.support.v7.app.AppCompatViewInflater$a r0 = new android.support.v7.app.AppCompatViewInflater$a
            r0.<init>(r3, r4)
            r3.setOnClickListener(r0)
        L2a:
            r2.recycle()
        L2d:
            return
    }

    private void a(android.view.View r2, java.lang.String r3) {
            r1 = this;
            if (r2 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class<android.support.v7.app.AppCompatViewInflater> r0 = android.support.v7.app.AppCompatViewInflater.class
            java.lang.String r0 = r0.getName()
            r2.append(r0)
            java.lang.String r0 = " asked to inflate view for <"
            r2.append(r0)
            r2.append(r3)
            java.lang.String r3 = ">, but returned null"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    private android.view.View b(android.content.Context r5, java.lang.String r6, android.util.AttributeSet r7) {
            r4 = this;
            java.lang.String r0 = "view"
            boolean r0 = r6.equals(r0)
            r1 = 0
            if (r0 == 0) goto Lf
            java.lang.String r6 = "class"
            java.lang.String r6 = r7.getAttributeValue(r1, r6)
        Lf:
            r0 = 1
            r2 = 0
            java.lang.Object[] r3 = r4.f686a     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L56
            r3[r2] = r5     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L56
            java.lang.Object[] r3 = r4.f686a     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L56
            r3[r0] = r7     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L56
            r7 = -1
            r3 = 46
            int r3 = r6.indexOf(r3)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L56
            if (r7 != r3) goto L43
            r7 = r2
        L23:
            java.lang.String[] r3 = android.support.v7.app.AppCompatViewInflater.d     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L56
            int r3 = r3.length     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L56
            if (r7 >= r3) goto L3c
            java.lang.String[] r3 = android.support.v7.app.AppCompatViewInflater.d     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L56
            r3 = r3[r7]     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L56
            android.view.View r3 = r4.a(r5, r6, r3)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L56
            if (r3 == 0) goto L39
            java.lang.Object[] r4 = r4.f686a
            r4[r2] = r1
            r4[r0] = r1
            return r3
        L39:
            int r7 = r7 + 1
            goto L23
        L3c:
            java.lang.Object[] r4 = r4.f686a
            r4[r2] = r1
            r4[r0] = r1
            return r1
        L43:
            android.view.View r5 = r4.a(r5, r6, r1)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L56
            java.lang.Object[] r4 = r4.f686a
            r4[r2] = r1
            r4[r0] = r1
            return r5
        L4e:
            r5 = move-exception
            java.lang.Object[] r4 = r4.f686a
            r4[r2] = r1
            r4[r0] = r1
            throw r5
        L56:
            java.lang.Object[] r4 = r4.f686a
            r4[r2] = r1
            r4[r0] = r1
            return r1
    }

    protected android.support.v7.widget.d a(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            android.support.v7.widget.d r0 = new android.support.v7.widget.d
            r0.<init>(r1, r2)
            return r0
    }

    protected android.view.View a(android.content.Context r1, java.lang.String r2, android.util.AttributeSet r3) {
            r0 = this;
            r0 = 0
            return r0
    }

    final android.view.View a(android.view.View r1, java.lang.String r2, android.content.Context r3, android.util.AttributeSet r4, boolean r5, boolean r6, boolean r7, boolean r8) {
            r0 = this;
            if (r5 == 0) goto L9
            if (r1 == 0) goto L9
            android.content.Context r1 = r1.getContext()
            goto La
        L9:
            r1 = r3
        La:
            if (r6 != 0) goto Le
            if (r7 == 0) goto L12
        Le:
            android.content.Context r1 = a(r1, r4, r6, r7)
        L12:
            if (r8 == 0) goto L18
            android.content.Context r1 = android.support.v7.widget.q0.b(r1)
        L18:
            r5 = -1
            int r6 = r2.hashCode()
            switch(r6) {
                case -1946472170: goto La1;
                case -1455429095: goto L96;
                case -1346021293: goto L8b;
                case -938935918: goto L81;
                case -937446323: goto L77;
                case -658531749: goto L6c;
                case -339785223: goto L62;
                case 776382189: goto L58;
                case 1125864064: goto L4e;
                case 1413872058: goto L43;
                case 1601505219: goto L38;
                case 1666676343: goto L2d;
                case 2001146706: goto L22;
                default: goto L20;
            }
        L20:
            goto Lab
        L22:
            java.lang.String r6 = "Button"
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto Lab
            r5 = 2
            goto Lab
        L2d:
            java.lang.String r6 = "EditText"
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto Lab
            r5 = 3
            goto Lab
        L38:
            java.lang.String r6 = "CheckBox"
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto Lab
            r5 = 6
            goto Lab
        L43:
            java.lang.String r6 = "AutoCompleteTextView"
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto Lab
            r5 = 9
            goto Lab
        L4e:
            java.lang.String r6 = "ImageView"
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto Lab
            r5 = 1
            goto Lab
        L58:
            java.lang.String r6 = "RadioButton"
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto Lab
            r5 = 7
            goto Lab
        L62:
            java.lang.String r6 = "Spinner"
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto Lab
            r5 = 4
            goto Lab
        L6c:
            java.lang.String r6 = "SeekBar"
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto Lab
            r5 = 12
            goto Lab
        L77:
            java.lang.String r6 = "ImageButton"
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto Lab
            r5 = 5
            goto Lab
        L81:
            java.lang.String r6 = "TextView"
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto Lab
            r5 = 0
            goto Lab
        L8b:
            java.lang.String r6 = "MultiAutoCompleteTextView"
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto Lab
            r5 = 10
            goto Lab
        L96:
            java.lang.String r6 = "CheckedTextView"
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto Lab
            r5 = 8
            goto Lab
        La1:
            java.lang.String r6 = "RatingBar"
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto Lab
            r5 = 11
        Lab:
            switch(r5) {
                case 0: goto Lef;
                case 1: goto Lea;
                case 2: goto Le5;
                case 3: goto Le0;
                case 4: goto Ldb;
                case 5: goto Ld6;
                case 6: goto Ld1;
                case 7: goto Lcc;
                case 8: goto Lc7;
                case 9: goto Lc2;
                case 10: goto Lbd;
                case 11: goto Lb8;
                case 12: goto Lb3;
                default: goto Lae;
            }
        Lae:
            android.view.View r5 = r0.a(r1, r2, r4)
            goto Lf6
        Lb3:
            android.support.v7.widget.u r5 = r0.k(r1, r4)
            goto Lf3
        Lb8:
            android.support.v7.widget.t r5 = r0.j(r1, r4)
            goto Lf3
        Lbd:
            android.support.v7.widget.p r5 = r0.h(r1, r4)
            goto Lf3
        Lc2:
            android.support.v7.widget.d r5 = r0.a(r1, r4)
            goto Lf3
        Lc7:
            android.support.v7.widget.h r5 = r0.d(r1, r4)
            goto Lf3
        Lcc:
            android.support.v7.widget.s r5 = r0.i(r1, r4)
            goto Lf3
        Ld1:
            android.support.v7.widget.g r5 = r0.c(r1, r4)
            goto Lf3
        Ld6:
            android.support.v7.widget.m r5 = r0.f(r1, r4)
            goto Lf3
        Ldb:
            android.support.v7.widget.w r5 = r0.l(r1, r4)
            goto Lf3
        Le0:
            android.support.v7.widget.k r5 = r0.e(r1, r4)
            goto Lf3
        Le5:
            android.support.v7.widget.f r5 = r0.b(r1, r4)
            goto Lf3
        Lea:
            android.support.v7.widget.o r5 = r0.g(r1, r4)
            goto Lf3
        Lef:
            android.support.v7.widget.y r5 = r0.m(r1, r4)
        Lf3:
            r0.a(r5, r2)
        Lf6:
            if (r5 != 0) goto Lfe
            if (r3 == r1) goto Lfe
            android.view.View r5 = r0.b(r1, r2, r4)
        Lfe:
            if (r5 == 0) goto L103
            r0.a(r5, r4)
        L103:
            return r5
    }

    protected android.support.v7.widget.f b(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            android.support.v7.widget.f r0 = new android.support.v7.widget.f
            r0.<init>(r1, r2)
            return r0
    }

    protected android.support.v7.widget.g c(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            android.support.v7.widget.g r0 = new android.support.v7.widget.g
            r0.<init>(r1, r2)
            return r0
    }

    protected android.support.v7.widget.h d(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            android.support.v7.widget.h r0 = new android.support.v7.widget.h
            r0.<init>(r1, r2)
            return r0
    }

    protected android.support.v7.widget.k e(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            android.support.v7.widget.k r0 = new android.support.v7.widget.k
            r0.<init>(r1, r2)
            return r0
    }

    protected android.support.v7.widget.m f(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            android.support.v7.widget.m r0 = new android.support.v7.widget.m
            r0.<init>(r1, r2)
            return r0
    }

    protected android.support.v7.widget.o g(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            android.support.v7.widget.o r0 = new android.support.v7.widget.o
            r0.<init>(r1, r2)
            return r0
    }

    protected android.support.v7.widget.p h(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            android.support.v7.widget.p r0 = new android.support.v7.widget.p
            r0.<init>(r1, r2)
            return r0
    }

    protected android.support.v7.widget.s i(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            android.support.v7.widget.s r0 = new android.support.v7.widget.s
            r0.<init>(r1, r2)
            return r0
    }

    protected android.support.v7.widget.t j(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            android.support.v7.widget.t r0 = new android.support.v7.widget.t
            r0.<init>(r1, r2)
            return r0
    }

    protected android.support.v7.widget.u k(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            android.support.v7.widget.u r0 = new android.support.v7.widget.u
            r0.<init>(r1, r2)
            return r0
    }

    protected android.support.v7.widget.w l(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            android.support.v7.widget.w r0 = new android.support.v7.widget.w
            r0.<init>(r1, r2)
            return r0
    }

    protected android.support.v7.widget.y m(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            android.support.v7.widget.y r0 = new android.support.v7.widget.y
            r0.<init>(r1, r2)
            return r0
    }
}
