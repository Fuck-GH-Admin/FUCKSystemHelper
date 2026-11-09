package android.support.v4.app;

/* JADX INFO: loaded from: classes.dex */
public class f extends android.support.v4.app.x implements android.arch.lifecycle.q, android.support.v4.app.a.b, android.support.v4.app.a.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final android.os.Handler f552c;
    final android.support.v4.app.h d;
    private android.arch.lifecycle.p e;
    boolean f;
    boolean g;
    boolean h;
    boolean i;
    boolean j;
    boolean k;
    int l;
    b.b.c.f.l<java.lang.String> m;

    class a extends android.os.Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.support.v4.app.f f553a;

        a(android.support.v4.app.f r1) {
                r0 = this;
                r0.f553a = r1
                r0.<init>()
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r3) {
                r2 = this;
                int r0 = r3.what
                r1 = 2
                if (r0 == r1) goto L9
                super.handleMessage(r3)
                goto L15
            L9:
                android.support.v4.app.f r3 = r2.f553a
                r3.e()
                android.support.v4.app.f r2 = r2.f553a
                android.support.v4.app.h r2 = r2.d
                r2.i()
            L15:
                return
        }
    }

    class b extends android.support.v4.app.i<android.support.v4.app.f> {
        final /* synthetic */ android.support.v4.app.f e;

        public b(android.support.v4.app.f r1) {
                r0 = this;
                r0.e = r1
                r0.<init>(r1)
                return
        }

        @Override // android.support.v4.app.g
        public android.view.View a(int r1) {
                r0 = this;
                android.support.v4.app.f r0 = r0.e
                android.view.View r0 = r0.findViewById(r1)
                return r0
        }

        @Override // android.support.v4.app.i
        public void a(android.support.v4.app.e r1) {
                r0 = this;
                android.support.v4.app.f r0 = r0.e
                r0.a(r1)
                return
        }

        @Override // android.support.v4.app.i
        public void a(java.lang.String r1, java.io.FileDescriptor r2, java.io.PrintWriter r3, java.lang.String[] r4) {
                r0 = this;
                android.support.v4.app.f r0 = r0.e
                r0.dump(r1, r2, r3, r4)
                return
        }

        @Override // android.support.v4.app.g
        public boolean a() {
                r0 = this;
                android.support.v4.app.f r0 = r0.e
                android.view.Window r0 = r0.getWindow()
                if (r0 == 0) goto L10
                android.view.View r0 = r0.peekDecorView()
                if (r0 == 0) goto L10
                r0 = 1
                goto L11
            L10:
                r0 = 0
            L11:
                return r0
        }

        @Override // android.support.v4.app.i
        public boolean b(android.support.v4.app.e r1) {
                r0 = this;
                android.support.v4.app.f r0 = r0.e
                boolean r0 = r0.isFinishing()
                r0 = r0 ^ 1
                return r0
        }

        @Override // android.support.v4.app.i
        public android.view.LayoutInflater f() {
                r1 = this;
                android.support.v4.app.f r0 = r1.e
                android.view.LayoutInflater r0 = r0.getLayoutInflater()
                android.support.v4.app.f r1 = r1.e
                android.view.LayoutInflater r1 = r0.cloneInContext(r1)
                return r1
        }

        @Override // android.support.v4.app.i
        public int g() {
                r0 = this;
                android.support.v4.app.f r0 = r0.e
                android.view.Window r0 = r0.getWindow()
                if (r0 != 0) goto La
                r0 = 0
                goto L10
            La:
                android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
                int r0 = r0.windowAnimations
            L10:
                return r0
        }

        @Override // android.support.v4.app.i
        public boolean h() {
                r0 = this;
                android.support.v4.app.f r0 = r0.e
                android.view.Window r0 = r0.getWindow()
                if (r0 == 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                return r0
        }

        @Override // android.support.v4.app.i
        public void i() {
                r0 = this;
                android.support.v4.app.f r0 = r0.e
                r0.g()
                return
        }
    }

    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        android.arch.lifecycle.p f554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        android.support.v4.app.l f555b;

        c() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public f() {
            r1 = this;
            r1.<init>()
            android.support.v4.app.f$a r0 = new android.support.v4.app.f$a
            r0.<init>(r1)
            r1.f552c = r0
            android.support.v4.app.f$b r0 = new android.support.v4.app.f$b
            r0.<init>(r1)
            android.support.v4.app.h r0 = android.support.v4.app.h.a(r0)
            r1.d = r0
            r0 = 1
            r1.h = r0
            return
    }

    private static boolean a(android.support.v4.app.j r4, android.arch.lifecycle.c.b r5) {
            java.util.List r4 = r4.a()
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
        L9:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r4.next()
            android.support.v4.app.e r1 = (android.support.v4.app.e) r1
            if (r1 != 0) goto L18
            goto L9
        L18:
            android.arch.lifecycle.c r2 = r1.a()
            android.arch.lifecycle.c$b r2 = r2.a()
            android.arch.lifecycle.c$b r3 = android.arch.lifecycle.c.b.e
            boolean r2 = r2.a(r3)
            if (r2 == 0) goto L2e
            android.arch.lifecycle.f r0 = r1.T
            r0.a(r5)
            r0 = 1
        L2e:
            android.support.v4.app.j r1 = r1.O()
            if (r1 == 0) goto L9
            boolean r1 = a(r1, r5)
            r0 = r0 | r1
            goto L9
        L3a:
            return r0
    }

    static void b(int r1) {
            r0 = -65536(0xffffffffffff0000, float:NaN)
            r1 = r1 & r0
            if (r1 != 0) goto L6
            return
        L6:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Can only use lower 16 bits for requestCode"
            r1.<init>(r0)
            throw r1
    }

    private void h() {
            r2 = this;
        L0:
            android.support.v4.app.j r0 = r2.d()
            android.arch.lifecycle.c$b r1 = android.arch.lifecycle.c.b.d
            boolean r0 = a(r0, r1)
            if (r0 != 0) goto L0
            return
    }

    @Override // android.support.v4.app.x, android.arch.lifecycle.e
    public android.arch.lifecycle.c a() {
            r0 = this;
            android.arch.lifecycle.c r0 = super.a()
            return r0
    }

    final android.view.View a(android.view.View r1, java.lang.String r2, android.content.Context r3, android.util.AttributeSet r4) {
            r0 = this;
            android.support.v4.app.h r0 = r0.d
            android.view.View r0 = r0.a(r1, r2, r3, r4)
            return r0
    }

    @Override // android.support.v4.app.a.d
    public final void a(int r1) {
            r0 = this;
            boolean r0 = r0.i
            if (r0 != 0) goto La
            r0 = -1
            if (r1 == r0) goto La
            b(r1)
        La:
            return
    }

    public void a(android.support.v4.app.e r1) {
            r0 = this;
            return
    }

    protected boolean a(android.view.View r2, android.view.Menu r3) {
            r1 = this;
            r0 = 0
            boolean r1 = super.onPreparePanel(r0, r2, r3)
            return r1
    }

    @Override // android.arch.lifecycle.q
    public android.arch.lifecycle.p b() {
            r1 = this;
            android.app.Application r0 = r1.getApplication()
            if (r0 == 0) goto L24
            android.arch.lifecycle.p r0 = r1.e
            if (r0 != 0) goto L21
            java.lang.Object r0 = r1.getLastNonConfigurationInstance()
            android.support.v4.app.f$c r0 = (android.support.v4.app.f.c) r0
            if (r0 == 0) goto L16
            android.arch.lifecycle.p r0 = r0.f554a
            r1.e = r0
        L16:
            android.arch.lifecycle.p r0 = r1.e
            if (r0 != 0) goto L21
            android.arch.lifecycle.p r0 = new android.arch.lifecycle.p
            r0.<init>()
            r1.e = r0
        L21:
            android.arch.lifecycle.p r1 = r1.e
            return r1
        L24:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call."
            r1.<init>(r0)
            throw r1
    }

    public android.support.v4.app.j d() {
            r0 = this;
            android.support.v4.app.h r0 = r0.d
            android.support.v4.app.j r0 = r0.j()
            return r0
    }

    @Override // android.app.Activity
    public void dump(java.lang.String r3, java.io.FileDescriptor r4, java.io.PrintWriter r5, java.lang.String[] r6) {
            r2 = this;
            super.dump(r3, r4, r5, r6)
            r5.print(r3)
            java.lang.String r0 = "Local FragmentActivity "
            r5.print(r0)
            int r0 = java.lang.System.identityHashCode(r2)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r5.print(r0)
            java.lang.String r0 = " State:"
            r5.println(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r1 = "  "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.print(r0)
            java.lang.String r1 = "mCreated="
            r5.print(r1)
            boolean r1 = r2.f
            r5.print(r1)
            java.lang.String r1 = " mResumed="
            r5.print(r1)
            boolean r1 = r2.g
            r5.print(r1)
            java.lang.String r1 = " mStopped="
            r5.print(r1)
            boolean r1 = r2.h
            r5.print(r1)
            android.app.Application r1 = r2.getApplication()
            if (r1 == 0) goto L5a
            android.support.v4.app.s r1 = android.support.v4.app.s.a(r2)
            r1.a(r0, r4, r5, r6)
        L5a:
            android.support.v4.app.h r2 = r2.d
            android.support.v4.app.j r2 = r2.j()
            r2.a(r3, r4, r5, r6)
            return
    }

    protected void e() {
            r0 = this;
            android.support.v4.app.h r0 = r0.d
            r0.f()
            return
    }

    public java.lang.Object f() {
            r0 = this;
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    public void g() {
            r0 = this;
            r0.invalidateOptionsMenu()
            return
    }

    @Override // android.app.Activity
    protected void onActivityResult(int r4, int r5, android.content.Intent r6) {
            r3 = this;
            android.support.v4.app.h r0 = r3.d
            r0.k()
            int r0 = r4 >> 16
            if (r0 == 0) goto L47
            int r0 = r0 + (-1)
            b.b.c.f.l<java.lang.String> r1 = r3.m
            java.lang.Object r1 = r1.b(r0)
            java.lang.String r1 = (java.lang.String) r1
            b.b.c.f.l<java.lang.String> r2 = r3.m
            r2.d(r0)
            java.lang.String r0 = "FragmentActivity"
            if (r1 != 0) goto L22
            java.lang.String r3 = "Activity result delivered for unknown Fragment."
            android.util.Log.w(r0, r3)
            return
        L22:
            android.support.v4.app.h r3 = r3.d
            android.support.v4.app.e r3 = r3.a(r1)
            if (r3 != 0) goto L3f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Activity result no fragment exists for who: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            android.util.Log.w(r0, r3)
            goto L46
        L3f:
            r0 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r0
            r3.a(r4, r5, r6)
        L46:
            return
        L47:
            android.support.v4.app.a$c r0 = android.support.v4.app.a.a()
            if (r0 == 0) goto L54
            boolean r0 = r0.a(r3, r4, r5, r6)
            if (r0 == 0) goto L54
            return
        L54:
            super.onActivityResult(r4, r5, r6)
            return
    }

    @Override // android.app.Activity
    public void onBackPressed() {
            r4 = this;
            android.support.v4.app.h r0 = r4.d
            android.support.v4.app.j r0 = r0.j()
            boolean r1 = r0.b()
            if (r1 == 0) goto L13
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 25
            if (r2 > r3) goto L13
            return
        L13:
            if (r1 != 0) goto L1b
            boolean r0 = r0.c()
            if (r0 != 0) goto L1e
        L1b:
            super.onBackPressed()
        L1e:
            return
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration r2) {
            r1 = this;
            super.onConfigurationChanged(r2)
            android.support.v4.app.h r0 = r1.d
            r0.k()
            android.support.v4.app.h r1 = r1.d
            r1.a(r2)
            return
    }

    @Override // android.support.v4.app.x, android.app.Activity
    protected void onCreate(android.os.Bundle r7) {
            r6 = this;
            android.support.v4.app.h r0 = r6.d
            r1 = 0
            r0.a(r1)
            super.onCreate(r7)
            java.lang.Object r0 = r6.getLastNonConfigurationInstance()
            android.support.v4.app.f$c r0 = (android.support.v4.app.f.c) r0
            if (r0 == 0) goto L1b
            android.arch.lifecycle.p r2 = r0.f554a
            if (r2 == 0) goto L1b
            android.arch.lifecycle.p r3 = r6.e
            if (r3 != 0) goto L1b
            r6.e = r2
        L1b:
            r2 = 0
            if (r7 == 0) goto L6f
            java.lang.String r3 = "android:support:fragments"
            android.os.Parcelable r3 = r7.getParcelable(r3)
            android.support.v4.app.h r4 = r6.d
            if (r0 == 0) goto L2a
            android.support.v4.app.l r1 = r0.f555b
        L2a:
            r4.a(r3, r1)
            java.lang.String r0 = "android:support:next_request_index"
            boolean r1 = r7.containsKey(r0)
            if (r1 == 0) goto L6f
            int r0 = r7.getInt(r0)
            r6.l = r0
            java.lang.String r0 = "android:support:request_indicies"
            int[] r0 = r7.getIntArray(r0)
            java.lang.String r1 = "android:support:request_fragment_who"
            java.lang.String[] r7 = r7.getStringArray(r1)
            if (r0 == 0) goto L68
            if (r7 == 0) goto L68
            int r1 = r0.length
            int r3 = r7.length
            if (r1 == r3) goto L50
            goto L68
        L50:
            b.b.c.f.l r1 = new b.b.c.f.l
            int r3 = r0.length
            r1.<init>(r3)
            r6.m = r1
            r1 = r2
        L59:
            int r3 = r0.length
            if (r1 >= r3) goto L6f
            b.b.c.f.l<java.lang.String> r3 = r6.m
            r4 = r0[r1]
            r5 = r7[r1]
            r3.c(r4, r5)
            int r1 = r1 + 1
            goto L59
        L68:
            java.lang.String r7 = "FragmentActivity"
            java.lang.String r0 = "Invalid requestCode mapping in savedInstanceState."
            android.util.Log.w(r7, r0)
        L6f:
            b.b.c.f.l<java.lang.String> r7 = r6.m
            if (r7 != 0) goto L7c
            b.b.c.f.l r7 = new b.b.c.f.l
            r7.<init>()
            r6.m = r7
            r6.l = r2
        L7c:
            android.support.v4.app.h r6 = r6.d
            r6.b()
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int r2, android.view.Menu r3) {
            r1 = this;
            if (r2 != 0) goto L12
            boolean r2 = super.onCreatePanelMenu(r2, r3)
            android.support.v4.app.h r0 = r1.d
            android.view.MenuInflater r1 = r1.getMenuInflater()
            boolean r1 = r0.a(r3, r1)
            r1 = r1 | r2
            return r1
        L12:
            boolean r1 = super.onCreatePanelMenu(r2, r3)
            return r1
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public android.view.View onCreateView(android.view.View r2, java.lang.String r3, android.content.Context r4, android.util.AttributeSet r5) {
            r1 = this;
            android.view.View r0 = r1.a(r2, r3, r4, r5)
            if (r0 != 0) goto Lb
            android.view.View r1 = super.onCreateView(r2, r3, r4, r5)
            return r1
        Lb:
            return r0
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public android.view.View onCreateView(java.lang.String r2, android.content.Context r3, android.util.AttributeSet r4) {
            r1 = this;
            r0 = 0
            android.view.View r0 = r1.a(r0, r2, r3, r4)
            if (r0 != 0) goto Lc
            android.view.View r1 = super.onCreateView(r2, r3, r4)
            return r1
        Lc:
            return r0
    }

    @Override // android.app.Activity
    protected void onDestroy() {
            r1 = this;
            super.onDestroy()
            android.arch.lifecycle.p r0 = r1.e
            if (r0 == 0) goto L12
            boolean r0 = r1.isChangingConfigurations()
            if (r0 != 0) goto L12
            android.arch.lifecycle.p r0 = r1.e
            r0.a()
        L12:
            android.support.v4.app.h r1 = r1.d
            r1.c()
            return
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
            r0 = this;
            super.onLowMemory()
            android.support.v4.app.h r0 = r0.d
            r0.d()
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int r2, android.view.MenuItem r3) {
            r1 = this;
            boolean r0 = super.onMenuItemSelected(r2, r3)
            if (r0 == 0) goto L8
            r1 = 1
            return r1
        L8:
            if (r2 == 0) goto L16
            r0 = 6
            if (r2 == r0) goto Lf
            r1 = 0
            return r1
        Lf:
            android.support.v4.app.h r1 = r1.d
            boolean r1 = r1.a(r3)
            return r1
        L16:
            android.support.v4.app.h r1 = r1.d
            boolean r1 = r1.b(r3)
            return r1
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean r1) {
            r0 = this;
            android.support.v4.app.h r0 = r0.d
            r0.a(r1)
            return
    }

    @Override // android.app.Activity
    protected void onNewIntent(android.content.Intent r1) {
            r0 = this;
            super.onNewIntent(r1)
            android.support.v4.app.h r0 = r0.d
            r0.k()
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int r2, android.view.Menu r3) {
            r1 = this;
            if (r2 == 0) goto L3
            goto L8
        L3:
            android.support.v4.app.h r0 = r1.d
            r0.a(r3)
        L8:
            super.onPanelClosed(r2, r3)
            return
    }

    @Override // android.app.Activity
    protected void onPause() {
            r2 = this;
            super.onPause()
            r0 = 0
            r2.g = r0
            android.os.Handler r0 = r2.f552c
            r1 = 2
            boolean r0 = r0.hasMessages(r1)
            if (r0 == 0) goto L17
            android.os.Handler r0 = r2.f552c
            r0.removeMessages(r1)
            r2.e()
        L17:
            android.support.v4.app.h r2 = r2.d
            r2.e()
            return
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean r1) {
            r0 = this;
            android.support.v4.app.h r0 = r0.d
            r0.b(r1)
            return
    }

    @Override // android.app.Activity
    protected void onPostResume() {
            r2 = this;
            super.onPostResume()
            android.os.Handler r0 = r2.f552c
            r1 = 2
            r0.removeMessages(r1)
            r2.e()
            android.support.v4.app.h r2 = r2.d
            r2.i()
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int r1, android.view.View r2, android.view.Menu r3) {
            r0 = this;
            if (r1 != 0) goto L10
            if (r3 == 0) goto L10
            boolean r1 = r0.a(r2, r3)
            android.support.v4.app.h r0 = r0.d
            boolean r0 = r0.b(r3)
            r0 = r0 | r1
            return r0
        L10:
            boolean r0 = super.onPreparePanel(r1, r2, r3)
            return r0
    }

    @Override // android.app.Activity, android.support.v4.app.a.b
    public void onRequestPermissionsResult(int r5, java.lang.String[] r6, int[] r7) {
            r4 = this;
            android.support.v4.app.h r0 = r4.d
            r0.k()
            int r0 = r5 >> 16
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L47
            int r0 = r0 + (-1)
            b.b.c.f.l<java.lang.String> r2 = r4.m
            java.lang.Object r2 = r2.b(r0)
            java.lang.String r2 = (java.lang.String) r2
            b.b.c.f.l<java.lang.String> r3 = r4.m
            r3.d(r0)
            java.lang.String r0 = "FragmentActivity"
            if (r2 != 0) goto L26
            java.lang.String r4 = "Activity result delivered for unknown Fragment."
            android.util.Log.w(r0, r4)
            return
        L26:
            android.support.v4.app.h r4 = r4.d
            android.support.v4.app.e r4 = r4.a(r2)
            if (r4 != 0) goto L43
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Activity result no fragment exists for who: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            android.util.Log.w(r0, r4)
            goto L47
        L43:
            r5 = r5 & r1
            r4.a(r5, r6, r7)
        L47:
            return
    }

    @Override // android.app.Activity
    protected void onResume() {
            r2 = this;
            super.onResume()
            android.os.Handler r0 = r2.f552c
            r1 = 2
            r0.sendEmptyMessage(r1)
            r0 = 1
            r2.g = r0
            android.support.v4.app.h r2 = r2.d
            r2.i()
            return
    }

    @Override // android.app.Activity
    public final java.lang.Object onRetainNonConfigurationInstance() {
            r3 = this;
            java.lang.Object r0 = r3.f()
            android.support.v4.app.h r1 = r3.d
            android.support.v4.app.l r1 = r1.l()
            if (r1 != 0) goto L14
            android.arch.lifecycle.p r2 = r3.e
            if (r2 != 0) goto L14
            if (r0 != 0) goto L14
            r3 = 0
            return r3
        L14:
            android.support.v4.app.f$c r0 = new android.support.v4.app.f$c
            r0.<init>()
            android.arch.lifecycle.p r3 = r3.e
            r0.f554a = r3
            r0.f555b = r1
            return r0
    }

    @Override // android.support.v4.app.x, android.app.Activity
    protected void onSaveInstanceState(android.os.Bundle r5) {
            r4 = this;
            super.onSaveInstanceState(r5)
            r4.h()
            android.support.v4.app.h r0 = r4.d
            android.os.Parcelable r0 = r0.m()
            if (r0 == 0) goto L13
            java.lang.String r1 = "android:support:fragments"
            r5.putParcelable(r1, r0)
        L13:
            b.b.c.f.l<java.lang.String> r0 = r4.m
            int r0 = r0.b()
            if (r0 <= 0) goto L5a
            int r0 = r4.l
            java.lang.String r1 = "android:support:next_request_index"
            r5.putInt(r1, r0)
            b.b.c.f.l<java.lang.String> r0 = r4.m
            int r0 = r0.b()
            int[] r0 = new int[r0]
            b.b.c.f.l<java.lang.String> r1 = r4.m
            int r1 = r1.b()
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
        L33:
            b.b.c.f.l<java.lang.String> r3 = r4.m
            int r3 = r3.b()
            if (r2 >= r3) goto L50
            b.b.c.f.l<java.lang.String> r3 = r4.m
            int r3 = r3.c(r2)
            r0[r2] = r3
            b.b.c.f.l<java.lang.String> r3 = r4.m
            java.lang.Object r3 = r3.e(r2)
            java.lang.String r3 = (java.lang.String) r3
            r1[r2] = r3
            int r2 = r2 + 1
            goto L33
        L50:
            java.lang.String r4 = "android:support:request_indicies"
            r5.putIntArray(r4, r0)
            java.lang.String r4 = "android:support:request_fragment_who"
            r5.putStringArray(r4, r1)
        L5a:
            return
    }

    @Override // android.app.Activity
    protected void onStart() {
            r1 = this;
            super.onStart()
            r0 = 0
            r1.h = r0
            boolean r0 = r1.f
            if (r0 != 0) goto L12
            r0 = 1
            r1.f = r0
            android.support.v4.app.h r0 = r1.d
            r0.a()
        L12:
            android.support.v4.app.h r0 = r1.d
            r0.k()
            android.support.v4.app.h r0 = r1.d
            r0.i()
            android.support.v4.app.h r1 = r1.d
            r1.g()
            return
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
            r0 = this;
            android.support.v4.app.h r0 = r0.d
            r0.k()
            return
    }

    @Override // android.app.Activity
    protected void onStop() {
            r1 = this;
            super.onStop()
            r0 = 1
            r1.h = r0
            r1.h()
            android.support.v4.app.h r1 = r1.d
            r1.h()
            return
    }

    @Override // android.app.Activity
    public void startActivityForResult(android.content.Intent r2, int r3) {
            r1 = this;
            boolean r0 = r1.k
            if (r0 != 0) goto La
            r0 = -1
            if (r3 == r0) goto La
            b(r3)
        La:
            super.startActivityForResult(r2, r3)
            return
    }

    @Override // android.app.Activity
    public void startActivityForResult(android.content.Intent r2, int r3, android.os.Bundle r4) {
            r1 = this;
            boolean r0 = r1.k
            if (r0 != 0) goto La
            r0 = -1
            if (r3 == r0) goto La
            b(r3)
        La:
            super.startActivityForResult(r2, r3, r4)
            return
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(android.content.IntentSender r2, int r3, android.content.Intent r4, int r5, int r6, int r7) {
            r1 = this;
            boolean r0 = r1.j
            if (r0 != 0) goto La
            r0 = -1
            if (r3 == r0) goto La
            b(r3)
        La:
            super.startIntentSenderForResult(r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(android.content.IntentSender r2, int r3, android.content.Intent r4, int r5, int r6, int r7, android.os.Bundle r8) {
            r1 = this;
            boolean r0 = r1.j
            if (r0 != 0) goto La
            r0 = -1
            if (r3 == r0) goto La
            b(r3)
        La:
            super.startIntentSenderForResult(r2, r3, r4, r5, r6, r7, r8)
            return
    }
}
