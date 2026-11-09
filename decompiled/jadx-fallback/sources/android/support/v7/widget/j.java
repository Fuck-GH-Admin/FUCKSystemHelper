package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    private static final android.graphics.PorterDuff.Mode g = null;
    private static android.support.v7.widget.j h;
    private static final android.support.v7.widget.j.c i = null;
    private static final int[] j = null;
    private static final int[] k = null;
    private static final int[] l = null;
    private static final int[] m = null;
    private static final int[] n = null;
    private static final int[] o = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.util.WeakHashMap<android.content.Context, b.b.c.f.l<android.content.res.ColorStateList>> f873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b.b.c.f.a<java.lang.String, android.support.v7.widget.j.d> f874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b.b.c.f.l<java.lang.String> f875c;
    private final java.util.WeakHashMap<android.content.Context, b.b.c.f.f<java.lang.ref.WeakReference<android.graphics.drawable.Drawable.ConstantState>>> d;
    private android.util.TypedValue e;
    private boolean f;

    static class a implements android.support.v7.widget.j.d {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.support.v7.widget.j.d
        public android.graphics.drawable.Drawable a(android.content.Context r1, org.xmlpull.v1.XmlPullParser r2, android.util.AttributeSet r3, android.content.res.Resources.Theme r4) {
                r0 = this;
                android.content.res.Resources r0 = r1.getResources()     // Catch: java.lang.Exception -> L9
                b.b.d.c.a.a r0 = b.b.d.c.a.a.b(r1, r0, r2, r3, r4)     // Catch: java.lang.Exception -> L9
                return r0
            L9:
                r0 = move-exception
                java.lang.String r1 = "AsldcInflateDelegate"
                java.lang.String r2 = "Exception while inflating <animated-selector>"
                android.util.Log.e(r1, r2, r0)
                r0 = 0
                return r0
        }
    }

    private static class b implements android.support.v7.widget.j.d {
        b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.support.v7.widget.j.d
        public android.graphics.drawable.Drawable a(android.content.Context r1, org.xmlpull.v1.XmlPullParser r2, android.util.AttributeSet r3, android.content.res.Resources.Theme r4) {
                r0 = this;
                android.content.res.Resources r0 = r1.getResources()     // Catch: java.lang.Exception -> L9
                b.b.b.a.c r0 = b.b.b.a.c.a(r1, r0, r2, r3, r4)     // Catch: java.lang.Exception -> L9
                return r0
            L9:
                r0 = move-exception
                java.lang.String r1 = "AvdcInflateDelegate"
                java.lang.String r2 = "Exception while inflating <animated-vector>"
                android.util.Log.e(r1, r2, r0)
                r0 = 0
                return r0
        }
    }

    private static class c extends b.b.c.f.g<java.lang.Integer, android.graphics.PorterDuffColorFilter> {
        public c(int r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private static int b(int r1, android.graphics.PorterDuff.Mode r2) {
                r0 = 31
                int r1 = r1 + r0
                int r1 = r1 * r0
                int r2 = r2.hashCode()
                int r1 = r1 + r2
                return r1
        }

        android.graphics.PorterDuffColorFilter a(int r1, android.graphics.PorterDuff.Mode r2) {
                r0 = this;
                int r1 = b(r1, r2)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.Object r0 = r0.b(r1)
                android.graphics.PorterDuffColorFilter r0 = (android.graphics.PorterDuffColorFilter) r0
                return r0
        }

        android.graphics.PorterDuffColorFilter a(int r1, android.graphics.PorterDuff.Mode r2, android.graphics.PorterDuffColorFilter r3) {
                r0 = this;
                int r1 = b(r1, r2)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.Object r0 = r0.a(r1, r3)
                android.graphics.PorterDuffColorFilter r0 = (android.graphics.PorterDuffColorFilter) r0
                return r0
        }
    }

    private interface d {
        android.graphics.drawable.Drawable a(android.content.Context r1, org.xmlpull.v1.XmlPullParser r2, android.util.AttributeSet r3, android.content.res.Resources.Theme r4);
    }

    private static class e implements android.support.v7.widget.j.d {
        e() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.support.v7.widget.j.d
        public android.graphics.drawable.Drawable a(android.content.Context r1, org.xmlpull.v1.XmlPullParser r2, android.util.AttributeSet r3, android.content.res.Resources.Theme r4) {
                r0 = this;
                android.content.res.Resources r0 = r1.getResources()     // Catch: java.lang.Exception -> L9
                b.b.b.a.i r0 = b.b.b.a.i.createFromXmlInner(r0, r2, r3, r4)     // Catch: java.lang.Exception -> L9
                return r0
            L9:
                r0 = move-exception
                java.lang.String r1 = "VdcInflateDelegate"
                java.lang.String r2 = "Exception while inflating <vector>"
                android.util.Log.e(r1, r2, r0)
                r0 = 0
                return r0
        }
    }

    static {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            android.support.v7.widget.j.g = r0
            android.support.v7.widget.j$c r0 = new android.support.v7.widget.j$c
            r1 = 6
            r0.<init>(r1)
            android.support.v7.widget.j.i = r0
            r0 = 3
            int[] r2 = new int[r0]
            int r3 = b.b.d.a.e.abc_textfield_search_default_mtrl_alpha
            r4 = 0
            r2[r4] = r3
            int r3 = b.b.d.a.e.abc_textfield_default_mtrl_alpha
            r5 = 1
            r2[r5] = r3
            int r3 = b.b.d.a.e.abc_ab_share_pack_mtrl_alpha
            r6 = 2
            r2[r6] = r3
            android.support.v7.widget.j.j = r2
            r2 = 7
            int[] r3 = new int[r2]
            int r7 = b.b.d.a.e.abc_ic_commit_search_api_mtrl_alpha
            r3[r4] = r7
            int r7 = b.b.d.a.e.abc_seekbar_tick_mark_material
            r3[r5] = r7
            int r7 = b.b.d.a.e.abc_ic_menu_share_mtrl_alpha
            r3[r6] = r7
            int r7 = b.b.d.a.e.abc_ic_menu_copy_mtrl_am_alpha
            r3[r0] = r7
            int r7 = b.b.d.a.e.abc_ic_menu_cut_mtrl_alpha
            r8 = 4
            r3[r8] = r7
            int r7 = b.b.d.a.e.abc_ic_menu_selectall_mtrl_alpha
            r9 = 5
            r3[r9] = r7
            int r7 = b.b.d.a.e.abc_ic_menu_paste_mtrl_am_alpha
            r3[r1] = r7
            android.support.v7.widget.j.k = r3
            r3 = 10
            int[] r3 = new int[r3]
            int r7 = b.b.d.a.e.abc_textfield_activated_mtrl_alpha
            r3[r4] = r7
            int r7 = b.b.d.a.e.abc_textfield_search_activated_mtrl_alpha
            r3[r5] = r7
            int r7 = b.b.d.a.e.abc_cab_background_top_mtrl_alpha
            r3[r6] = r7
            int r7 = b.b.d.a.e.abc_text_cursor_material
            r3[r0] = r7
            int r7 = b.b.d.a.e.abc_text_select_handle_left_mtrl_dark
            r3[r8] = r7
            int r7 = b.b.d.a.e.abc_text_select_handle_middle_mtrl_dark
            r3[r9] = r7
            int r7 = b.b.d.a.e.abc_text_select_handle_right_mtrl_dark
            r3[r1] = r7
            int r1 = b.b.d.a.e.abc_text_select_handle_left_mtrl_light
            r3[r2] = r1
            int r1 = b.b.d.a.e.abc_text_select_handle_middle_mtrl_light
            r2 = 8
            r3[r2] = r1
            int r1 = b.b.d.a.e.abc_text_select_handle_right_mtrl_light
            r2 = 9
            r3[r2] = r1
            android.support.v7.widget.j.l = r3
            int[] r0 = new int[r0]
            int r1 = b.b.d.a.e.abc_popup_background_mtrl_mult
            r0[r4] = r1
            int r1 = b.b.d.a.e.abc_cab_background_internal_bg
            r0[r5] = r1
            int r1 = b.b.d.a.e.abc_menu_hardkey_panel_mtrl_mult
            r0[r6] = r1
            android.support.v7.widget.j.m = r0
            int[] r0 = new int[r6]
            int r1 = b.b.d.a.e.abc_tab_indicator_material
            r0[r4] = r1
            int r1 = b.b.d.a.e.abc_textfield_search_material
            r0[r5] = r1
            android.support.v7.widget.j.n = r0
            int[] r0 = new int[r6]
            int r1 = b.b.d.a.e.abc_btn_check_material
            r0[r4] = r1
            int r1 = b.b.d.a.e.abc_btn_radio_material
            r0[r5] = r1
            android.support.v7.widget.j.o = r0
            return
    }

    public j() {
            r2 = this;
            r2.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r1 = 0
            r0.<init>(r1)
            r2.d = r0
            return
    }

    private static long a(android.util.TypedValue r4) {
            int r0 = r4.assetCookie
            long r0 = (long) r0
            r2 = 32
            long r0 = r0 << r2
            int r4 = r4.data
            long r2 = (long) r4
            long r0 = r0 | r2
            return r0
    }

    static android.graphics.PorterDuff.Mode a(int r1) {
            int r0 = b.b.d.a.e.abc_switch_thumb_material
            if (r1 != r0) goto L7
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L8
        L7:
            r1 = 0
        L8:
            return r1
    }

    public static synchronized android.graphics.PorterDuffColorFilter a(int r3, android.graphics.PorterDuff.Mode r4) {
            java.lang.Class<android.support.v7.widget.j> r0 = android.support.v7.widget.j.class
            monitor-enter(r0)
            android.support.v7.widget.j$c r1 = android.support.v7.widget.j.i     // Catch: java.lang.Throwable -> L17
            android.graphics.PorterDuffColorFilter r1 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L15
            android.graphics.PorterDuffColorFilter r1 = new android.graphics.PorterDuffColorFilter     // Catch: java.lang.Throwable -> L17
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L17
            android.support.v7.widget.j$c r2 = android.support.v7.widget.j.i     // Catch: java.lang.Throwable -> L17
            r2.a(r3, r4, r1)     // Catch: java.lang.Throwable -> L17
        L15:
            monitor-exit(r0)
            return r1
        L17:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    private static android.graphics.PorterDuffColorFilter a(android.content.res.ColorStateList r1, android.graphics.PorterDuff.Mode r2, int[] r3) {
            if (r1 == 0) goto Lf
            if (r2 != 0) goto L5
            goto Lf
        L5:
            r0 = 0
            int r1 = r1.getColorForState(r3, r0)
            android.graphics.PorterDuffColorFilter r1 = a(r1, r2)
            return r1
        Lf:
            r1 = 0
            return r1
    }

    private android.graphics.drawable.Drawable a(android.content.Context r4, int r5, boolean r6, android.graphics.drawable.Drawable r7) {
            r3 = this;
            android.content.res.ColorStateList r3 = r3.b(r4, r5)
            if (r3 == 0) goto L21
            boolean r4 = android.support.v7.widget.c0.a(r7)
            if (r4 == 0) goto L10
            android.graphics.drawable.Drawable r7 = r7.mutate()
        L10:
            android.graphics.drawable.Drawable r7 = android.support.v4.graphics.drawable.a.g(r7)
            android.support.v4.graphics.drawable.a.a(r7, r3)
            android.graphics.PorterDuff$Mode r3 = a(r5)
            if (r3 == 0) goto L8e
            android.support.v4.graphics.drawable.a.a(r7, r3)
            goto L8e
        L21:
            int r3 = b.b.d.a.e.abc_seekbar_track_material
            r0 = 16908301(0x102000d, float:2.3877265E-38)
            r1 = 16908303(0x102000f, float:2.387727E-38)
            r2 = 16908288(0x1020000, float:2.387723E-38)
            if (r5 != r3) goto L5e
            r3 = r7
            android.graphics.drawable.LayerDrawable r3 = (android.graphics.drawable.LayerDrawable) r3
            android.graphics.drawable.Drawable r5 = r3.findDrawableByLayerId(r2)
            int r6 = b.b.d.a.a.colorControlNormal
            int r6 = android.support.v7.widget.o0.b(r4, r6)
            android.graphics.PorterDuff$Mode r2 = android.support.v7.widget.j.g
            a(r5, r6, r2)
            android.graphics.drawable.Drawable r5 = r3.findDrawableByLayerId(r1)
            int r6 = b.b.d.a.a.colorControlNormal
        L45:
            int r6 = android.support.v7.widget.o0.b(r4, r6)
            android.graphics.PorterDuff$Mode r1 = android.support.v7.widget.j.g
            a(r5, r6, r1)
            android.graphics.drawable.Drawable r3 = r3.findDrawableByLayerId(r0)
            int r5 = b.b.d.a.a.colorControlActivated
            int r4 = android.support.v7.widget.o0.b(r4, r5)
            android.graphics.PorterDuff$Mode r5 = android.support.v7.widget.j.g
            a(r3, r4, r5)
            goto L8e
        L5e:
            int r3 = b.b.d.a.e.abc_ratingbar_material
            if (r5 == r3) goto L75
            int r3 = b.b.d.a.e.abc_ratingbar_indicator_material
            if (r5 == r3) goto L75
            int r3 = b.b.d.a.e.abc_ratingbar_small_material
            if (r5 != r3) goto L6b
            goto L75
        L6b:
            boolean r3 = a(r4, r5, r7)
            if (r3 != 0) goto L8e
            if (r6 == 0) goto L8e
            r7 = 0
            goto L8e
        L75:
            r3 = r7
            android.graphics.drawable.LayerDrawable r3 = (android.graphics.drawable.LayerDrawable) r3
            android.graphics.drawable.Drawable r5 = r3.findDrawableByLayerId(r2)
            int r6 = b.b.d.a.a.colorControlNormal
            int r6 = android.support.v7.widget.o0.a(r4, r6)
            android.graphics.PorterDuff$Mode r2 = android.support.v7.widget.j.g
            a(r5, r6, r2)
            android.graphics.drawable.Drawable r5 = r3.findDrawableByLayerId(r1)
            int r6 = b.b.d.a.a.colorControlActivated
            goto L45
        L8e:
            return r7
    }

    private synchronized android.graphics.drawable.Drawable a(android.content.Context r4, long r5) {
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, b.b.c.f.f<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.d     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L2d
            b.b.c.f.f r0 = (b.b.c.f.f) r0     // Catch: java.lang.Throwable -> L2d
            r1 = 0
            if (r0 != 0) goto Le
            monitor-exit(r3)
            return r1
        Le:
            java.lang.Object r2 = r0.b(r5)     // Catch: java.lang.Throwable -> L2d
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L2d
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L28
            android.content.res.Resources r4 = r4.getResources()     // Catch: java.lang.Throwable -> L2d
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r3)
            return r4
        L28:
            r0.a(r5)     // Catch: java.lang.Throwable -> L2d
        L2b:
            monitor-exit(r3)
            return r1
        L2d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    public static synchronized android.support.v7.widget.j a() {
            java.lang.Class<android.support.v7.widget.j> r0 = android.support.v7.widget.j.class
            monitor-enter(r0)
            android.support.v7.widget.j r1 = android.support.v7.widget.j.h     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L11
            android.support.v7.widget.j r1 = new android.support.v7.widget.j     // Catch: java.lang.Throwable -> L15
            r1.<init>()     // Catch: java.lang.Throwable -> L15
            android.support.v7.widget.j.h = r1     // Catch: java.lang.Throwable -> L15
            a(r1)     // Catch: java.lang.Throwable -> L15
        L11:
            android.support.v7.widget.j r1 = android.support.v7.widget.j.h     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)
            return r1
        L15:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    private void a(android.content.Context r2, int r3, android.content.res.ColorStateList r4) {
            r1 = this;
            java.util.WeakHashMap<android.content.Context, b.b.c.f.l<android.content.res.ColorStateList>> r0 = r1.f873a
            if (r0 != 0) goto Lb
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r1.f873a = r0
        Lb:
            java.util.WeakHashMap<android.content.Context, b.b.c.f.l<android.content.res.ColorStateList>> r0 = r1.f873a
            java.lang.Object r0 = r0.get(r2)
            b.b.c.f.l r0 = (b.b.c.f.l) r0
            if (r0 != 0) goto L1f
            b.b.c.f.l r0 = new b.b.c.f.l
            r0.<init>()
            java.util.WeakHashMap<android.content.Context, b.b.c.f.l<android.content.res.ColorStateList>> r1 = r1.f873a
            r1.put(r2, r0)
        L1f:
            r0.a(r3, r4)
            return
    }

    private static void a(android.graphics.drawable.Drawable r1, int r2, android.graphics.PorterDuff.Mode r3) {
            boolean r0 = android.support.v7.widget.c0.a(r1)
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r1 = r1.mutate()
        La:
            if (r3 != 0) goto Le
            android.graphics.PorterDuff$Mode r3 = android.support.v7.widget.j.g
        Le:
            android.graphics.PorterDuffColorFilter r2 = a(r2, r3)
            r1.setColorFilter(r2)
            return
    }

    static void a(android.graphics.drawable.Drawable r2, android.support.v7.widget.r0 r3, int[] r4) {
            boolean r0 = android.support.v7.widget.c0.a(r2)
            if (r0 == 0) goto L14
            android.graphics.drawable.Drawable r0 = r2.mutate()
            if (r0 == r2) goto L14
            java.lang.String r2 = "AppCompatDrawableManag"
            java.lang.String r3 = "Mutated drawable is not the same instance as the input."
            android.util.Log.d(r2, r3)
            return
        L14:
            boolean r0 = r3.d
            if (r0 != 0) goto L21
            boolean r0 = r3.f915c
            if (r0 == 0) goto L1d
            goto L21
        L1d:
            r2.clearColorFilter()
            goto L39
        L21:
            boolean r0 = r3.d
            if (r0 == 0) goto L28
            android.content.res.ColorStateList r0 = r3.f913a
            goto L29
        L28:
            r0 = 0
        L29:
            boolean r1 = r3.f915c
            if (r1 == 0) goto L30
            android.graphics.PorterDuff$Mode r3 = r3.f914b
            goto L32
        L30:
            android.graphics.PorterDuff$Mode r3 = android.support.v7.widget.j.g
        L32:
            android.graphics.PorterDuffColorFilter r3 = a(r0, r3, r4)
            r2.setColorFilter(r3)
        L39:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r3 > r4) goto L42
            r2.invalidateSelf()
        L42:
            return
    }

    private static void a(android.support.v7.widget.j r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 >= r1) goto L24
            android.support.v7.widget.j$e r0 = new android.support.v7.widget.j$e
            r0.<init>()
            java.lang.String r1 = "vector"
            r2.a(r1, r0)
            android.support.v7.widget.j$b r0 = new android.support.v7.widget.j$b
            r0.<init>()
            java.lang.String r1 = "animated-vector"
            r2.a(r1, r0)
            android.support.v7.widget.j$a r0 = new android.support.v7.widget.j$a
            r0.<init>()
            java.lang.String r1 = "animated-selector"
            r2.a(r1, r0)
        L24:
            return
    }

    private void a(java.lang.String r2, android.support.v7.widget.j.d r3) {
            r1 = this;
            b.b.c.f.a<java.lang.String, android.support.v7.widget.j$d> r0 = r1.f874b
            if (r0 != 0) goto Lb
            b.b.c.f.a r0 = new b.b.c.f.a
            r0.<init>()
            r1.f874b = r0
        Lb:
            b.b.c.f.a<java.lang.String, android.support.v7.widget.j$d> r1 = r1.f874b
            r1.put(r2, r3)
            return
    }

    static boolean a(android.content.Context r6, int r7, android.graphics.drawable.Drawable r8) {
            android.graphics.PorterDuff$Mode r0 = android.support.v7.widget.j.g
            int[] r1 = android.support.v7.widget.j.j
            boolean r1 = a(r1, r7)
            r2 = 16842801(0x1010031, float:2.3693695E-38)
            r3 = -1
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L15
            int r2 = b.b.d.a.a.colorControlNormal
        L12:
            r7 = r3
        L13:
            r1 = r5
            goto L42
        L15:
            int[] r1 = android.support.v7.widget.j.l
            boolean r1 = a(r1, r7)
            if (r1 == 0) goto L20
            int r2 = b.b.d.a.a.colorControlActivated
            goto L12
        L20:
            int[] r1 = android.support.v7.widget.j.m
            boolean r1 = a(r1, r7)
            if (r1 == 0) goto L2b
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L12
        L2b:
            int r1 = b.b.d.a.e.abc_list_divider_mtrl_alpha
            if (r7 != r1) goto L3a
            r2 = 16842800(0x1010030, float:2.3693693E-38)
            r7 = 1109603123(0x42233333, float:40.8)
            int r7 = java.lang.Math.round(r7)
            goto L13
        L3a:
            int r1 = b.b.d.a.e.abc_dialog_material_background
            if (r7 != r1) goto L3f
            goto L12
        L3f:
            r7 = r3
            r1 = r4
            r2 = r1
        L42:
            if (r1 == 0) goto L5f
            boolean r1 = android.support.v7.widget.c0.a(r8)
            if (r1 == 0) goto L4e
            android.graphics.drawable.Drawable r8 = r8.mutate()
        L4e:
            int r6 = android.support.v7.widget.o0.b(r6, r2)
            android.graphics.PorterDuffColorFilter r6 = a(r6, r0)
            r8.setColorFilter(r6)
            if (r7 == r3) goto L5e
            r8.setAlpha(r7)
        L5e:
            return r5
        L5f:
            return r4
    }

    private synchronized boolean a(android.content.Context r3, long r4, android.graphics.drawable.Drawable r6) {
            r2 = this;
            monitor-enter(r2)
            android.graphics.drawable.Drawable$ConstantState r6 = r6.getConstantState()     // Catch: java.lang.Throwable -> L28
            if (r6 == 0) goto L26
            java.util.WeakHashMap<android.content.Context, b.b.c.f.f<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r2.d     // Catch: java.lang.Throwable -> L28
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L28
            b.b.c.f.f r0 = (b.b.c.f.f) r0     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto L1b
            b.b.c.f.f r0 = new b.b.c.f.f     // Catch: java.lang.Throwable -> L28
            r0.<init>()     // Catch: java.lang.Throwable -> L28
            java.util.WeakHashMap<android.content.Context, b.b.c.f.f<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r1 = r2.d     // Catch: java.lang.Throwable -> L28
            r1.put(r3, r0)     // Catch: java.lang.Throwable -> L28
        L1b:
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L28
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L28
            r0.c(r4, r3)     // Catch: java.lang.Throwable -> L28
            r3 = 1
        L24:
            monitor-exit(r2)
            return r3
        L26:
            r3 = 0
            goto L24
        L28:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    private static boolean a(android.graphics.drawable.Drawable r1) {
            boolean r0 = r1 instanceof b.b.b.a.i
            if (r0 != 0) goto L17
            java.lang.String r0 = "android.graphics.drawable.VectorDrawable"
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L15
            goto L17
        L15:
            r1 = 0
            goto L18
        L17:
            r1 = 1
        L18:
            return r1
    }

    private static boolean a(int[] r4, int r5) {
            int r0 = r4.length
            r1 = 0
            r2 = r1
        L3:
            if (r2 >= r0) goto Le
            r3 = r4[r2]
            if (r3 != r5) goto Lb
            r4 = 1
            return r4
        Lb:
            int r2 = r2 + 1
            goto L3
        Le:
            return r1
    }

    private void b(android.content.Context r2) {
            r1 = this;
            boolean r0 = r1.f
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.f = r0
            int r0 = b.b.d.a.e.abc_vector_test
            android.graphics.drawable.Drawable r2 = r1.a(r2, r0)
            if (r2 == 0) goto L17
            boolean r2 = a(r2)
            if (r2 == 0) goto L17
            return
        L17:
            r2 = 0
            r1.f = r2
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r1.<init>(r2)
            throw r1
    }

    private android.content.res.ColorStateList c(android.content.Context r2) {
            r1 = this;
            r0 = 0
            android.content.res.ColorStateList r1 = r1.c(r2, r0)
            return r1
    }

    private android.content.res.ColorStateList c(android.content.Context r5, int r6) {
            r4 = this;
            r4 = 4
            int[][] r0 = new int[r4][]
            int[] r4 = new int[r4]
            int r1 = b.b.d.a.a.colorControlHighlight
            int r1 = android.support.v7.widget.o0.b(r5, r1)
            int r2 = b.b.d.a.a.colorButtonNormal
            int r5 = android.support.v7.widget.o0.a(r5, r2)
            int[] r2 = android.support.v7.widget.o0.f901b
            r3 = 0
            r0[r3] = r2
            r4[r3] = r5
            int[] r5 = android.support.v7.widget.o0.d
            r2 = 1
            r0[r2] = r5
            int r5 = b.b.c.b.a.b(r1, r6)
            r4[r2] = r5
            int[] r5 = android.support.v7.widget.o0.f902c
            r2 = 2
            r0[r2] = r5
            int r5 = b.b.c.b.a.b(r1, r6)
            r4[r2] = r5
            int[] r5 = android.support.v7.widget.o0.f
            r1 = 3
            r0[r1] = r5
            r4[r1] = r6
            android.content.res.ColorStateList r5 = new android.content.res.ColorStateList
            r5.<init>(r0, r4)
            return r5
    }

    private android.content.res.ColorStateList d(android.content.Context r2) {
            r1 = this;
            int r0 = b.b.d.a.a.colorAccent
            int r0 = android.support.v7.widget.o0.b(r2, r0)
            android.content.res.ColorStateList r1 = r1.c(r2, r0)
            return r1
    }

    private android.graphics.drawable.Drawable d(android.content.Context r8, int r9) {
            r7 = this;
            android.util.TypedValue r0 = r7.e
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r7.e = r0
        Lb:
            android.util.TypedValue r0 = r7.e
            android.content.res.Resources r1 = r8.getResources()
            r2 = 1
            r1.getValue(r9, r0, r2)
            long r3 = a(r0)
            android.graphics.drawable.Drawable r1 = r7.a(r8, r3)
            if (r1 == 0) goto L20
            return r1
        L20:
            int r5 = b.b.d.a.e.abc_cab_background_top_material
            if (r9 != r5) goto L3d
            android.graphics.drawable.LayerDrawable r1 = new android.graphics.drawable.LayerDrawable
            r9 = 2
            android.graphics.drawable.Drawable[] r9 = new android.graphics.drawable.Drawable[r9]
            r5 = 0
            int r6 = b.b.d.a.e.abc_cab_background_internal_bg
            android.graphics.drawable.Drawable r6 = r7.a(r8, r6)
            r9[r5] = r6
            int r5 = b.b.d.a.e.abc_cab_background_top_mtrl_alpha
            android.graphics.drawable.Drawable r5 = r7.a(r8, r5)
            r9[r2] = r5
            r1.<init>(r9)
        L3d:
            if (r1 == 0) goto L47
            int r9 = r0.changingConfigurations
            r1.setChangingConfigurations(r9)
            r7.a(r8, r3, r1)
        L47:
            return r1
    }

    private android.content.res.ColorStateList e(android.content.Context r2) {
            r1 = this;
            int r0 = b.b.d.a.a.colorButtonNormal
            int r0 = android.support.v7.widget.o0.b(r2, r0)
            android.content.res.ColorStateList r1 = r1.c(r2, r0)
            return r1
    }

    private android.content.res.ColorStateList e(android.content.Context r2, int r3) {
            r1 = this;
            java.util.WeakHashMap<android.content.Context, b.b.c.f.l<android.content.res.ColorStateList>> r1 = r1.f873a
            r0 = 0
            if (r1 == 0) goto L14
            java.lang.Object r1 = r1.get(r2)
            b.b.c.f.l r1 = (b.b.c.f.l) r1
            if (r1 == 0) goto L14
            java.lang.Object r1 = r1.b(r3)
            r0 = r1
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0
        L14:
            return r0
    }

    private android.content.res.ColorStateList f(android.content.Context r7) {
            r6 = this;
            r6 = 3
            int[][] r0 = new int[r6][]
            int[] r6 = new int[r6]
            int r1 = b.b.d.a.a.colorSwitchThumbNormal
            android.content.res.ColorStateList r1 = android.support.v7.widget.o0.c(r7, r1)
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L39
            boolean r5 = r1.isStateful()
            if (r5 == 0) goto L39
            int[] r5 = android.support.v7.widget.o0.f901b
            r0[r4] = r5
            r5 = r0[r4]
            int r5 = r1.getColorForState(r5, r4)
            r6[r4] = r5
            int[] r4 = android.support.v7.widget.o0.e
            r0[r3] = r4
            int r4 = b.b.d.a.a.colorControlActivated
            int r7 = android.support.v7.widget.o0.b(r7, r4)
            r6[r3] = r7
            int[] r7 = android.support.v7.widget.o0.f
            r0[r2] = r7
            int r7 = r1.getDefaultColor()
            r6[r2] = r7
            goto L5d
        L39:
            int[] r1 = android.support.v7.widget.o0.f901b
            r0[r4] = r1
            int r1 = b.b.d.a.a.colorSwitchThumbNormal
            int r1 = android.support.v7.widget.o0.a(r7, r1)
            r6[r4] = r1
            int[] r1 = android.support.v7.widget.o0.e
            r0[r3] = r1
            int r1 = b.b.d.a.a.colorControlActivated
            int r1 = android.support.v7.widget.o0.b(r7, r1)
            r6[r3] = r1
            int[] r1 = android.support.v7.widget.o0.f
            r0[r2] = r1
            int r1 = b.b.d.a.a.colorSwitchThumbNormal
            int r7 = android.support.v7.widget.o0.b(r7, r1)
            r6[r2] = r7
        L5d:
            android.content.res.ColorStateList r7 = new android.content.res.ColorStateList
            r7.<init>(r0, r6)
            return r7
    }

    private android.graphics.drawable.Drawable f(android.content.Context r11, int r12) {
            r10 = this;
            b.b.c.f.a<java.lang.String, android.support.v7.widget.j$d> r0 = r10.f874b
            r1 = 0
            if (r0 == 0) goto Lb2
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lb2
            b.b.c.f.l<java.lang.String> r0 = r10.f875c
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L28
            java.lang.Object r0 = r0.b(r12)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L27
            if (r0 == 0) goto L2f
            b.b.c.f.a<java.lang.String, android.support.v7.widget.j$d> r3 = r10.f874b
            java.lang.Object r0 = r3.get(r0)
            if (r0 != 0) goto L2f
        L27:
            return r1
        L28:
            b.b.c.f.l r0 = new b.b.c.f.l
            r0.<init>()
            r10.f875c = r0
        L2f:
            android.util.TypedValue r0 = r10.e
            if (r0 != 0) goto L3a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.e = r0
        L3a:
            android.util.TypedValue r0 = r10.e
            android.content.res.Resources r1 = r11.getResources()
            r3 = 1
            r1.getValue(r12, r0, r3)
            long r4 = a(r0)
            android.graphics.drawable.Drawable r6 = r10.a(r11, r4)
            if (r6 == 0) goto L4f
            return r6
        L4f:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto Laa
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto Laa
            android.content.res.XmlResourceParser r1 = r1.getXml(r12)     // Catch: java.lang.Exception -> La2
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r1)     // Catch: java.lang.Exception -> La2
        L67:
            int r8 = r1.next()     // Catch: java.lang.Exception -> La2
            r9 = 2
            if (r8 == r9) goto L71
            if (r8 == r3) goto L71
            goto L67
        L71:
            if (r8 != r9) goto L9a
            java.lang.String r3 = r1.getName()     // Catch: java.lang.Exception -> La2
            b.b.c.f.l<java.lang.String> r8 = r10.f875c     // Catch: java.lang.Exception -> La2
            r8.a(r12, r3)     // Catch: java.lang.Exception -> La2
            b.b.c.f.a<java.lang.String, android.support.v7.widget.j$d> r8 = r10.f874b     // Catch: java.lang.Exception -> La2
            java.lang.Object r3 = r8.get(r3)     // Catch: java.lang.Exception -> La2
            android.support.v7.widget.j$d r3 = (android.support.v7.widget.j.d) r3     // Catch: java.lang.Exception -> La2
            if (r3 == 0) goto L8f
            android.content.res.Resources$Theme r8 = r11.getTheme()     // Catch: java.lang.Exception -> La2
            android.graphics.drawable.Drawable r1 = r3.a(r11, r1, r7, r8)     // Catch: java.lang.Exception -> La2
            r6 = r1
        L8f:
            if (r6 == 0) goto Laa
            int r0 = r0.changingConfigurations     // Catch: java.lang.Exception -> La2
            r6.setChangingConfigurations(r0)     // Catch: java.lang.Exception -> La2
            r10.a(r11, r4, r6)     // Catch: java.lang.Exception -> La2
            goto Laa
        L9a:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.lang.Exception -> La2
            java.lang.String r0 = "No start tag found"
            r11.<init>(r0)     // Catch: java.lang.Exception -> La2
            throw r11     // Catch: java.lang.Exception -> La2
        La2:
            r11 = move-exception
            java.lang.String r0 = "AppCompatDrawableManag"
            java.lang.String r1 = "Exception while inflating drawable"
            android.util.Log.e(r0, r1, r11)
        Laa:
            if (r6 != 0) goto Lb1
            b.b.c.f.l<java.lang.String> r10 = r10.f875c
            r10.a(r12, r2)
        Lb1:
            return r6
        Lb2:
            return r1
    }

    public synchronized android.graphics.drawable.Drawable a(android.content.Context r2, int r3) {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            android.graphics.drawable.Drawable r2 = r1.a(r2, r3, r0)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return r2
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    synchronized android.graphics.drawable.Drawable a(android.content.Context r2, int r3, boolean r4) {
            r1 = this;
            monitor-enter(r1)
            r1.b(r2)     // Catch: java.lang.Throwable -> L21
            android.graphics.drawable.Drawable r0 = r1.f(r2, r3)     // Catch: java.lang.Throwable -> L21
            if (r0 != 0) goto Le
            android.graphics.drawable.Drawable r0 = r1.d(r2, r3)     // Catch: java.lang.Throwable -> L21
        Le:
            if (r0 != 0) goto L14
            android.graphics.drawable.Drawable r0 = b.b.c.a.a.b(r2, r3)     // Catch: java.lang.Throwable -> L21
        L14:
            if (r0 == 0) goto L1a
            android.graphics.drawable.Drawable r0 = r1.a(r2, r3, r4, r0)     // Catch: java.lang.Throwable -> L21
        L1a:
            if (r0 == 0) goto L1f
            android.support.v7.widget.c0.b(r0)     // Catch: java.lang.Throwable -> L21
        L1f:
            monitor-exit(r1)
            return r0
        L21:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    synchronized android.graphics.drawable.Drawable a(android.content.Context r2, android.support.v7.widget.y0 r3, int r4) {
            r1 = this;
            monitor-enter(r1)
            android.graphics.drawable.Drawable r0 = r1.f(r2, r4)     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto Lb
            android.graphics.drawable.Drawable r0 = r3.a(r4)     // Catch: java.lang.Throwable -> L17
        Lb:
            if (r0 == 0) goto L14
            r3 = 0
            android.graphics.drawable.Drawable r2 = r1.a(r2, r4, r3, r0)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)
            return r2
        L14:
            r2 = 0
            monitor-exit(r1)
            return r2
        L17:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public synchronized void a(android.content.Context r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.WeakHashMap<android.content.Context, b.b.c.f.f<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r1.d     // Catch: java.lang.Throwable -> L10
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L10
            b.b.c.f.f r2 = (b.b.c.f.f) r2     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto Le
            r2.a()     // Catch: java.lang.Throwable -> L10
        Le:
            monitor-exit(r1)
            return
        L10:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    synchronized android.content.res.ColorStateList b(android.content.Context r3, int r4) {
            r2 = this;
            monitor-enter(r2)
            android.content.res.ColorStateList r0 = r2.e(r3, r4)     // Catch: java.lang.Throwable -> L7d
            if (r0 != 0) goto L7b
            int r1 = b.b.d.a.e.abc_edit_text_material     // Catch: java.lang.Throwable -> L7d
            if (r4 != r1) goto L13
            int r0 = b.b.d.a.c.abc_tint_edittext     // Catch: java.lang.Throwable -> L7d
        Ld:
            android.content.res.ColorStateList r0 = b.b.d.b.a.a.b(r3, r0)     // Catch: java.lang.Throwable -> L7d
            goto L76
        L13:
            int r1 = b.b.d.a.e.abc_switch_track_mtrl_alpha     // Catch: java.lang.Throwable -> L7d
            if (r4 != r1) goto L1a
            int r0 = b.b.d.a.c.abc_tint_switch_track     // Catch: java.lang.Throwable -> L7d
            goto Ld
        L1a:
            int r1 = b.b.d.a.e.abc_switch_thumb_material     // Catch: java.lang.Throwable -> L7d
            if (r4 != r1) goto L23
            android.content.res.ColorStateList r0 = r2.f(r3)     // Catch: java.lang.Throwable -> L7d
            goto L76
        L23:
            int r1 = b.b.d.a.e.abc_btn_default_mtrl_shape     // Catch: java.lang.Throwable -> L7d
            if (r4 != r1) goto L2c
            android.content.res.ColorStateList r0 = r2.e(r3)     // Catch: java.lang.Throwable -> L7d
            goto L76
        L2c:
            int r1 = b.b.d.a.e.abc_btn_borderless_material     // Catch: java.lang.Throwable -> L7d
            if (r4 != r1) goto L35
            android.content.res.ColorStateList r0 = r2.c(r3)     // Catch: java.lang.Throwable -> L7d
            goto L76
        L35:
            int r1 = b.b.d.a.e.abc_btn_colored_material     // Catch: java.lang.Throwable -> L7d
            if (r4 != r1) goto L3e
            android.content.res.ColorStateList r0 = r2.d(r3)     // Catch: java.lang.Throwable -> L7d
            goto L76
        L3e:
            int r1 = b.b.d.a.e.abc_spinner_mtrl_am_alpha     // Catch: java.lang.Throwable -> L7d
            if (r4 == r1) goto L73
            int r1 = b.b.d.a.e.abc_spinner_textfield_background_material     // Catch: java.lang.Throwable -> L7d
            if (r4 != r1) goto L47
            goto L73
        L47:
            int[] r1 = android.support.v7.widget.j.k     // Catch: java.lang.Throwable -> L7d
            boolean r1 = a(r1, r4)     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L56
            int r0 = b.b.d.a.a.colorControlNormal     // Catch: java.lang.Throwable -> L7d
            android.content.res.ColorStateList r0 = android.support.v7.widget.o0.c(r3, r0)     // Catch: java.lang.Throwable -> L7d
            goto L76
        L56:
            int[] r1 = android.support.v7.widget.j.n     // Catch: java.lang.Throwable -> L7d
            boolean r1 = a(r1, r4)     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L61
            int r0 = b.b.d.a.c.abc_tint_default     // Catch: java.lang.Throwable -> L7d
            goto Ld
        L61:
            int[] r1 = android.support.v7.widget.j.o     // Catch: java.lang.Throwable -> L7d
            boolean r1 = a(r1, r4)     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L6c
            int r0 = b.b.d.a.c.abc_tint_btn_checkable     // Catch: java.lang.Throwable -> L7d
            goto Ld
        L6c:
            int r1 = b.b.d.a.e.abc_seekbar_thumb_material     // Catch: java.lang.Throwable -> L7d
            if (r4 != r1) goto L76
            int r0 = b.b.d.a.c.abc_tint_seek_thumb     // Catch: java.lang.Throwable -> L7d
            goto Ld
        L73:
            int r0 = b.b.d.a.c.abc_tint_spinner     // Catch: java.lang.Throwable -> L7d
            goto Ld
        L76:
            if (r0 == 0) goto L7b
            r2.a(r3, r4, r0)     // Catch: java.lang.Throwable -> L7d
        L7b:
            monitor-exit(r2)
            return r0
        L7d:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }
}
