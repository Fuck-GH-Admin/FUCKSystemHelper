package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends android.view.ViewGroup {
    private int A;
    private int B;
    private boolean C;
    private boolean D;
    private final java.util.ArrayList<android.view.View> E;
    private final java.util.ArrayList<android.view.View> F;
    private final int[] G;
    android.support.v7.widget.Toolbar.f H;
    private final android.support.v7.widget.ActionMenuView.e I;
    private android.support.v7.widget.u0 J;
    private android.support.v7.widget.c K;
    private android.support.v7.widget.Toolbar.d L;
    private android.support.v7.view.menu.o.a M;
    private android.support.v7.view.menu.h.a N;
    private boolean O;
    private final java.lang.Runnable P;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.support.v7.widget.ActionMenuView f819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.widget.TextView f820c;
    private android.widget.TextView d;
    private android.widget.ImageButton e;
    private android.widget.ImageView f;
    private android.graphics.drawable.Drawable g;
    private java.lang.CharSequence h;
    android.widget.ImageButton i;
    android.view.View j;
    private android.content.Context k;
    private int l;
    private int m;
    private int n;
    int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private android.support.v7.widget.l0 u;
    private int v;
    private int w;
    private int x;
    private java.lang.CharSequence y;
    private java.lang.CharSequence z;

    class a implements android.support.v7.widget.ActionMenuView.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.support.v7.widget.Toolbar f821a;

        a(android.support.v7.widget.Toolbar r1) {
                r0 = this;
                r0.f821a = r1
                r0.<init>()
                return
        }

        @Override // android.support.v7.widget.ActionMenuView.e
        public boolean onMenuItemClick(android.view.MenuItem r1) {
                r0 = this;
                android.support.v7.widget.Toolbar r0 = r0.f821a
                android.support.v7.widget.Toolbar$f r0 = r0.H
                if (r0 == 0) goto Lb
                boolean r0 = r0.onMenuItemClick(r1)
                return r0
            Lb:
                r0 = 0
                return r0
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.support.v7.widget.Toolbar f822b;

        b(android.support.v7.widget.Toolbar r1) {
                r0 = this;
                r0.f822b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r0 = this;
                android.support.v7.widget.Toolbar r0 = r0.f822b
                r0.k()
                return
        }
    }

    class c implements android.view.View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.support.v7.widget.Toolbar f823b;

        c(android.support.v7.widget.Toolbar r1) {
                r0 = this;
                r0.f823b = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                android.support.v7.widget.Toolbar r0 = r0.f823b
                r0.c()
                return
        }
    }

    private class d implements android.support.v7.view.menu.o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        android.support.v7.view.menu.h f824b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        android.support.v7.view.menu.j f825c;
        final /* synthetic */ android.support.v7.widget.Toolbar d;

        d(android.support.v7.widget.Toolbar r1) {
                r0 = this;
                r0.d = r1
                r0.<init>()
                return
        }

        @Override // android.support.v7.view.menu.o
        public void a(android.content.Context r2, android.support.v7.view.menu.h r3) {
                r1 = this;
                android.support.v7.view.menu.h r2 = r1.f824b
                if (r2 == 0) goto Lb
                android.support.v7.view.menu.j r0 = r1.f825c
                if (r0 == 0) goto Lb
                r2.a(r0)
            Lb:
                r1.f824b = r3
                return
        }

        @Override // android.support.v7.view.menu.o
        public void a(android.support.v7.view.menu.h r1, boolean r2) {
                r0 = this;
                return
        }

        @Override // android.support.v7.view.menu.o
        public void a(android.support.v7.view.menu.o.a r1) {
                r0 = this;
                return
        }

        @Override // android.support.v7.view.menu.o
        public void a(boolean r5) {
                r4 = this;
                android.support.v7.view.menu.j r5 = r4.f825c
                if (r5 == 0) goto L28
                android.support.v7.view.menu.h r5 = r4.f824b
                r0 = 0
                if (r5 == 0) goto L1f
                int r5 = r5.size()
                r1 = r0
            Le:
                if (r1 >= r5) goto L1f
                android.support.v7.view.menu.h r2 = r4.f824b
                android.view.MenuItem r2 = r2.getItem(r1)
                android.support.v7.view.menu.j r3 = r4.f825c
                if (r2 != r3) goto L1c
                r0 = 1
                goto L1f
            L1c:
                int r1 = r1 + 1
                goto Le
            L1f:
                if (r0 != 0) goto L28
                android.support.v7.view.menu.h r5 = r4.f824b
                android.support.v7.view.menu.j r0 = r4.f825c
                r4.b(r5, r0)
            L28:
                return
        }

        @Override // android.support.v7.view.menu.o
        public boolean a(android.support.v7.view.menu.h r4, android.support.v7.view.menu.j r5) {
                r3 = this;
                android.support.v7.widget.Toolbar r4 = r3.d
                r4.e()
                android.support.v7.widget.Toolbar r4 = r3.d
                android.widget.ImageButton r4 = r4.i
                android.view.ViewParent r4 = r4.getParent()
                android.support.v7.widget.Toolbar r0 = r3.d
                if (r4 == r0) goto L23
                boolean r1 = r4 instanceof android.view.ViewGroup
                if (r1 == 0) goto L1c
                android.view.ViewGroup r4 = (android.view.ViewGroup) r4
                android.widget.ImageButton r0 = r0.i
                r4.removeView(r0)
            L1c:
                android.support.v7.widget.Toolbar r4 = r3.d
                android.widget.ImageButton r0 = r4.i
                r4.addView(r0)
            L23:
                android.support.v7.widget.Toolbar r4 = r3.d
                android.view.View r0 = r5.getActionView()
                r4.j = r0
                r3.f825c = r5
                android.support.v7.widget.Toolbar r4 = r3.d
                android.view.View r4 = r4.j
                android.view.ViewParent r4 = r4.getParent()
                android.support.v7.widget.Toolbar r0 = r3.d
                if (r4 == r0) goto L65
                boolean r1 = r4 instanceof android.view.ViewGroup
                if (r1 == 0) goto L44
                android.view.ViewGroup r4 = (android.view.ViewGroup) r4
                android.view.View r0 = r0.j
                r4.removeView(r0)
            L44:
                android.support.v7.widget.Toolbar r4 = r3.d
                android.support.v7.widget.Toolbar$e r4 = r4.generateDefaultLayoutParams()
                r0 = 8388611(0x800003, float:1.1754948E-38)
                android.support.v7.widget.Toolbar r1 = r3.d
                int r2 = r1.o
                r2 = r2 & 112(0x70, float:1.57E-43)
                r0 = r0 | r2
                r4.f689a = r0
                r0 = 2
                r4.f826b = r0
                android.view.View r0 = r1.j
                r0.setLayoutParams(r4)
                android.support.v7.widget.Toolbar r4 = r3.d
                android.view.View r0 = r4.j
                r4.addView(r0)
            L65:
                android.support.v7.widget.Toolbar r4 = r3.d
                r4.j()
                android.support.v7.widget.Toolbar r4 = r3.d
                r4.requestLayout()
                r4 = 1
                r5.a(r4)
                android.support.v7.widget.Toolbar r3 = r3.d
                android.view.View r3 = r3.j
                boolean r5 = r3 instanceof b.b.d.d.c
                if (r5 == 0) goto L80
                b.b.d.d.c r3 = (b.b.d.d.c) r3
                r3.a()
            L80:
                return r4
        }

        @Override // android.support.v7.view.menu.o
        public boolean a(android.support.v7.view.menu.u r1) {
                r0 = this;
                r0 = 0
                return r0
        }

        @Override // android.support.v7.view.menu.o
        public boolean b(android.support.v7.view.menu.h r2, android.support.v7.view.menu.j r3) {
                r1 = this;
                android.support.v7.widget.Toolbar r2 = r1.d
                android.view.View r2 = r2.j
                boolean r0 = r2 instanceof b.b.d.d.c
                if (r0 == 0) goto Ld
                b.b.d.d.c r2 = (b.b.d.d.c) r2
                r2.b()
            Ld:
                android.support.v7.widget.Toolbar r2 = r1.d
                android.view.View r0 = r2.j
                r2.removeView(r0)
                android.support.v7.widget.Toolbar r2 = r1.d
                android.widget.ImageButton r0 = r2.i
                r2.removeView(r0)
                android.support.v7.widget.Toolbar r2 = r1.d
                r0 = 0
                r2.j = r0
                r2.a()
                r1.f825c = r0
                android.support.v7.widget.Toolbar r1 = r1.d
                r1.requestLayout()
                r1 = 0
                r3.a(r1)
                r1 = 1
                return r1
        }

        @Override // android.support.v7.view.menu.o
        public boolean d() {
                r0 = this;
                r0 = 0
                return r0
        }
    }

    public static class e extends android.support.v7.app.a.C0030a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f826b;

        public e(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.f826b = r1
                r1 = 8388627(0x800013, float:1.175497E-38)
                r0.f689a = r1
                return
        }

        public e(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.f826b = r1
                return
        }

        public e(android.support.v7.app.a.C0030a r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = 0
                r0.f826b = r1
                return
        }

        public e(android.support.v7.widget.Toolbar.e r2) {
                r1 = this;
                r1.<init>(r2)
                r0 = 0
                r1.f826b = r0
                int r2 = r2.f826b
                r1.f826b = r2
                return
        }

        public e(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = 0
                r0.f826b = r1
                return
        }

        public e(android.view.ViewGroup.MarginLayoutParams r2) {
                r1 = this;
                r1.<init>(r2)
                r0 = 0
                r1.f826b = r0
                r1.a(r2)
                return
        }

        void a(android.view.ViewGroup.MarginLayoutParams r2) {
                r1 = this;
                int r0 = r2.leftMargin
                r1.leftMargin = r0
                int r0 = r2.topMargin
                r1.topMargin = r0
                int r0 = r2.rightMargin
                r1.rightMargin = r0
                int r2 = r2.bottomMargin
                r1.bottomMargin = r2
                return
        }
    }

    public interface f {
        boolean onMenuItemClick(android.view.MenuItem r1);
    }

    public static class g extends b.b.c.g.a {
        public static final android.os.Parcelable.Creator<android.support.v7.widget.Toolbar.g> CREATOR = null;
        int d;
        boolean e;

        static class a implements android.os.Parcelable.ClassLoaderCreator<android.support.v7.widget.Toolbar.g> {
            a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.os.Parcelable.Creator
            public android.support.v7.widget.Toolbar.g createFromParcel(android.os.Parcel r2) {
                    r1 = this;
                    android.support.v7.widget.Toolbar$g r1 = new android.support.v7.widget.Toolbar$g
                    r0 = 0
                    r1.<init>(r2, r0)
                    return r1
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public android.support.v7.widget.Toolbar.g createFromParcel(android.os.Parcel r1, java.lang.ClassLoader r2) {
                    r0 = this;
                    android.support.v7.widget.Toolbar$g r0 = new android.support.v7.widget.Toolbar$g
                    r0.<init>(r1, r2)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r1) {
                    r0 = this;
                    android.support.v7.widget.Toolbar$g r0 = r0.createFromParcel(r1)
                    return r0
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* bridge */ /* synthetic */ android.support.v7.widget.Toolbar.g createFromParcel(android.os.Parcel r1, java.lang.ClassLoader r2) {
                    r0 = this;
                    android.support.v7.widget.Toolbar$g r0 = r0.createFromParcel(r1, r2)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public android.support.v7.widget.Toolbar.g[] newArray(int r1) {
                    r0 = this;
                    android.support.v7.widget.Toolbar$g[] r0 = new android.support.v7.widget.Toolbar.g[r1]
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ java.lang.Object[] newArray(int r1) {
                    r0 = this;
                    android.support.v7.widget.Toolbar$g[] r0 = r0.newArray(r1)
                    return r0
            }
        }

        static {
                android.support.v7.widget.Toolbar$g$a r0 = new android.support.v7.widget.Toolbar$g$a
                r0.<init>()
                android.support.v7.widget.Toolbar.g.CREATOR = r0
                return
        }

        public g(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                int r2 = r1.readInt()
                r0.d = r2
                int r1 = r1.readInt()
                if (r1 == 0) goto L11
                r1 = 1
                goto L12
            L11:
                r1 = 0
            L12:
                r0.e = r1
                return
        }

        public g(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // b.b.c.g.a, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                int r2 = r0.d
                r1.writeInt(r2)
                boolean r0 = r0.e
                r1.writeInt(r0)
                return
        }
    }

    public Toolbar(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public Toolbar(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = b.b.d.a.a.toolbarStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public Toolbar(android.content.Context r7, android.util.AttributeSet r8, int r9) {
            r6 = this;
            r6.<init>(r7, r8, r9)
            r7 = 8388627(0x800013, float:1.175497E-38)
            r6.x = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.E = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.F = r7
            r7 = 2
            int[] r7 = new int[r7]
            r6.G = r7
            android.support.v7.widget.Toolbar$a r7 = new android.support.v7.widget.Toolbar$a
            r7.<init>(r6)
            r6.I = r7
            android.support.v7.widget.Toolbar$b r7 = new android.support.v7.widget.Toolbar$b
            r7.<init>(r6)
            r6.P = r7
            android.content.Context r7 = r6.getContext()
            int[] r0 = b.b.d.a.j.Toolbar
            r1 = 0
            android.support.v7.widget.t0 r7 = android.support.v7.widget.t0.a(r7, r8, r0, r9, r1)
            int r8 = b.b.d.a.j.Toolbar_titleTextAppearance
            int r8 = r7.g(r8, r1)
            r6.m = r8
            int r8 = b.b.d.a.j.Toolbar_subtitleTextAppearance
            int r8 = r7.g(r8, r1)
            r6.n = r8
            int r8 = b.b.d.a.j.Toolbar_android_gravity
            int r9 = r6.x
            int r8 = r7.e(r8, r9)
            r6.x = r8
            int r8 = b.b.d.a.j.Toolbar_buttonGravity
            r9 = 48
            int r8 = r7.e(r8, r9)
            r6.o = r8
            int r8 = b.b.d.a.j.Toolbar_titleMargin
            int r8 = r7.b(r8, r1)
            int r9 = b.b.d.a.j.Toolbar_titleMargins
            boolean r9 = r7.g(r9)
            if (r9 == 0) goto L6c
            int r9 = b.b.d.a.j.Toolbar_titleMargins
            int r8 = r7.b(r9, r8)
        L6c:
            r6.t = r8
            r6.s = r8
            r6.r = r8
            r6.q = r8
            int r8 = b.b.d.a.j.Toolbar_titleMarginStart
            r9 = -1
            int r8 = r7.b(r8, r9)
            if (r8 < 0) goto L7f
            r6.q = r8
        L7f:
            int r8 = b.b.d.a.j.Toolbar_titleMarginEnd
            int r8 = r7.b(r8, r9)
            if (r8 < 0) goto L89
            r6.r = r8
        L89:
            int r8 = b.b.d.a.j.Toolbar_titleMarginTop
            int r8 = r7.b(r8, r9)
            if (r8 < 0) goto L93
            r6.s = r8
        L93:
            int r8 = b.b.d.a.j.Toolbar_titleMarginBottom
            int r8 = r7.b(r8, r9)
            if (r8 < 0) goto L9d
            r6.t = r8
        L9d:
            int r8 = b.b.d.a.j.Toolbar_maxButtonHeight
            int r8 = r7.c(r8, r9)
            r6.p = r8
            int r8 = b.b.d.a.j.Toolbar_contentInsetStart
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r8 = r7.b(r8, r0)
            int r2 = b.b.d.a.j.Toolbar_contentInsetEnd
            int r2 = r7.b(r2, r0)
            int r3 = b.b.d.a.j.Toolbar_contentInsetLeft
            int r3 = r7.c(r3, r1)
            int r4 = b.b.d.a.j.Toolbar_contentInsetRight
            int r4 = r7.c(r4, r1)
            r6.l()
            android.support.v7.widget.l0 r5 = r6.u
            r5.a(r3, r4)
            if (r8 != r0) goto Lcb
            if (r2 == r0) goto Ld0
        Lcb:
            android.support.v7.widget.l0 r3 = r6.u
            r3.b(r8, r2)
        Ld0:
            int r8 = b.b.d.a.j.Toolbar_contentInsetStartWithNavigation
            int r8 = r7.b(r8, r0)
            r6.v = r8
            int r8 = b.b.d.a.j.Toolbar_contentInsetEndWithActions
            int r8 = r7.b(r8, r0)
            r6.w = r8
            int r8 = b.b.d.a.j.Toolbar_collapseIcon
            android.graphics.drawable.Drawable r8 = r7.b(r8)
            r6.g = r8
            int r8 = b.b.d.a.j.Toolbar_collapseContentDescription
            java.lang.CharSequence r8 = r7.e(r8)
            r6.h = r8
            int r8 = b.b.d.a.j.Toolbar_title
            java.lang.CharSequence r8 = r7.e(r8)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto Lff
            r6.setTitle(r8)
        Lff:
            int r8 = b.b.d.a.j.Toolbar_subtitle
            java.lang.CharSequence r8 = r7.e(r8)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L10e
            r6.setSubtitle(r8)
        L10e:
            android.content.Context r8 = r6.getContext()
            r6.k = r8
            int r8 = b.b.d.a.j.Toolbar_popupTheme
            int r8 = r7.g(r8, r1)
            r6.setPopupTheme(r8)
            int r8 = b.b.d.a.j.Toolbar_navigationIcon
            android.graphics.drawable.Drawable r8 = r7.b(r8)
            if (r8 == 0) goto L128
            r6.setNavigationIcon(r8)
        L128:
            int r8 = b.b.d.a.j.Toolbar_navigationContentDescription
            java.lang.CharSequence r8 = r7.e(r8)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L137
            r6.setNavigationContentDescription(r8)
        L137:
            int r8 = b.b.d.a.j.Toolbar_logo
            android.graphics.drawable.Drawable r8 = r7.b(r8)
            if (r8 == 0) goto L142
            r6.setLogo(r8)
        L142:
            int r8 = b.b.d.a.j.Toolbar_logoDescription
            java.lang.CharSequence r8 = r7.e(r8)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L151
            r6.setLogoDescription(r8)
        L151:
            int r8 = b.b.d.a.j.Toolbar_titleTextColor
            boolean r8 = r7.g(r8)
            if (r8 == 0) goto L162
            int r8 = b.b.d.a.j.Toolbar_titleTextColor
            int r8 = r7.a(r8, r9)
            r6.setTitleTextColor(r8)
        L162:
            int r8 = b.b.d.a.j.Toolbar_subtitleTextColor
            boolean r8 = r7.g(r8)
            if (r8 == 0) goto L173
            int r8 = b.b.d.a.j.Toolbar_subtitleTextColor
            int r8 = r7.a(r8, r9)
            r6.setSubtitleTextColor(r8)
        L173:
            r7.a()
            return
    }

    private int a(int r4) {
            r3 = this;
            int r3 = b.b.c.g.q.d(r3)
            int r4 = b.b.c.g.d.a(r4, r3)
            r4 = r4 & 7
            r0 = 1
            if (r4 == r0) goto L17
            r1 = 3
            if (r4 == r1) goto L17
            r2 = 5
            if (r4 == r2) goto L17
            if (r3 != r0) goto L16
            r1 = r2
        L16:
            return r1
        L17:
            return r4
    }

    private int a(android.view.View r1) {
            r0 = this;
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = b.b.c.g.g.b(r0)
            int r0 = b.b.c.g.g.a(r0)
            int r1 = r1 + r0
            return r1
    }

    private int a(android.view.View r6, int r7) {
            r5 = this;
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.support.v7.widget.Toolbar$e r0 = (android.support.v7.widget.Toolbar.e) r0
            int r6 = r6.getMeasuredHeight()
            r1 = 0
            if (r7 <= 0) goto L12
            int r7 = r6 - r7
            int r7 = r7 / 2
            goto L13
        L12:
            r7 = r1
        L13:
            int r2 = r0.f689a
            int r2 = r5.b(r2)
            r3 = 48
            if (r2 == r3) goto L58
            r3 = 80
            if (r2 == r3) goto L49
            int r7 = r5.getPaddingTop()
            int r2 = r5.getPaddingBottom()
            int r5 = r5.getHeight()
            int r3 = r5 - r7
            int r3 = r3 - r2
            int r3 = r3 - r6
            int r3 = r3 / 2
            int r4 = r0.topMargin
            if (r3 >= r4) goto L39
            r3 = r4
            goto L47
        L39:
            int r5 = r5 - r2
            int r5 = r5 - r6
            int r5 = r5 - r3
            int r5 = r5 - r7
            int r6 = r0.bottomMargin
            if (r5 >= r6) goto L47
            int r6 = r6 - r5
            int r3 = r3 - r6
            int r3 = java.lang.Math.max(r1, r3)
        L47:
            int r7 = r7 + r3
            return r7
        L49:
            int r1 = r5.getHeight()
            int r5 = r5.getPaddingBottom()
            int r1 = r1 - r5
            int r1 = r1 - r6
            int r5 = r0.bottomMargin
            int r1 = r1 - r5
            int r1 = r1 - r7
            return r1
        L58:
            int r5 = r5.getPaddingTop()
            int r5 = r5 - r7
            return r5
    }

    private int a(android.view.View r8, int r9, int r10, int r11, int r12, int[] r13) {
            r7 = this;
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r0.leftMargin
            r2 = 0
            r3 = r13[r2]
            int r1 = r1 - r3
            int r3 = r0.rightMargin
            r4 = 1
            r5 = r13[r4]
            int r3 = r3 - r5
            int r5 = java.lang.Math.max(r2, r1)
            int r6 = java.lang.Math.max(r2, r3)
            int r5 = r5 + r6
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r13[r2] = r1
            int r1 = -r3
            int r1 = java.lang.Math.max(r2, r1)
            r13[r4] = r1
            int r13 = r7.getPaddingLeft()
            int r1 = r7.getPaddingRight()
            int r13 = r13 + r1
            int r13 = r13 + r5
            int r13 = r13 + r10
            int r10 = r0.width
            int r9 = android.view.ViewGroup.getChildMeasureSpec(r9, r13, r10)
            int r10 = r7.getPaddingTop()
            int r7 = r7.getPaddingBottom()
            int r10 = r10 + r7
            int r7 = r0.topMargin
            int r10 = r10 + r7
            int r7 = r0.bottomMargin
            int r10 = r10 + r7
            int r10 = r10 + r12
            int r7 = r0.height
            int r7 = android.view.ViewGroup.getChildMeasureSpec(r11, r10, r7)
            r8.measure(r9, r7)
            int r7 = r8.getMeasuredWidth()
            int r7 = r7 + r5
            return r7
    }

    private int a(android.view.View r5, int r6, int[] r7, int r8) {
            r4 = this;
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            android.support.v7.widget.Toolbar$e r0 = (android.support.v7.widget.Toolbar.e) r0
            int r1 = r0.leftMargin
            r2 = 0
            r3 = r7[r2]
            int r1 = r1 - r3
            int r3 = java.lang.Math.max(r2, r1)
            int r6 = r6 + r3
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r7[r2] = r1
            int r4 = r4.a(r5, r8)
            int r7 = r5.getMeasuredWidth()
            int r8 = r6 + r7
            int r1 = r5.getMeasuredHeight()
            int r1 = r1 + r4
            r5.layout(r6, r4, r8, r1)
            int r4 = r0.rightMargin
            int r7 = r7 + r4
            int r6 = r6 + r7
            return r6
    }

    private int a(java.util.List<android.view.View> r8, int[] r9) {
            r7 = this;
            r7 = 0
            r0 = r9[r7]
            r1 = 1
            r9 = r9[r1]
            int r1 = r8.size()
            r2 = r7
            r3 = r2
        Lc:
            if (r2 >= r1) goto L3e
            java.lang.Object r4 = r8.get(r2)
            android.view.View r4 = (android.view.View) r4
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            android.support.v7.widget.Toolbar$e r5 = (android.support.v7.widget.Toolbar.e) r5
            int r6 = r5.leftMargin
            int r6 = r6 - r0
            int r0 = r5.rightMargin
            int r0 = r0 - r9
            int r9 = java.lang.Math.max(r7, r6)
            int r5 = java.lang.Math.max(r7, r0)
            int r6 = -r6
            int r6 = java.lang.Math.max(r7, r6)
            int r0 = -r0
            int r0 = java.lang.Math.max(r7, r0)
            int r4 = r4.getMeasuredWidth()
            int r9 = r9 + r4
            int r9 = r9 + r5
            int r3 = r3 + r9
            int r2 = r2 + 1
            r9 = r0
            r0 = r6
            goto Lc
        L3e:
            return r3
    }

    private void a(android.view.View r4, int r5, int r6, int r7, int r8, int r9) {
            r3 = this;
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r3.getPaddingLeft()
            int r2 = r3.getPaddingRight()
            int r1 = r1 + r2
            int r2 = r0.leftMargin
            int r1 = r1 + r2
            int r2 = r0.rightMargin
            int r1 = r1 + r2
            int r1 = r1 + r6
            int r6 = r0.width
            int r5 = android.view.ViewGroup.getChildMeasureSpec(r5, r1, r6)
            int r6 = r3.getPaddingTop()
            int r3 = r3.getPaddingBottom()
            int r6 = r6 + r3
            int r3 = r0.topMargin
            int r6 = r6 + r3
            int r3 = r0.bottomMargin
            int r6 = r6 + r3
            int r6 = r6 + r8
            int r3 = r0.height
            int r3 = android.view.ViewGroup.getChildMeasureSpec(r7, r6, r3)
            int r6 = android.view.View.MeasureSpec.getMode(r3)
            r7 = 1073741824(0x40000000, float:2.0)
            if (r6 == r7) goto L4a
            if (r9 < 0) goto L4a
            if (r6 == 0) goto L46
            int r3 = android.view.View.MeasureSpec.getSize(r3)
            int r9 = java.lang.Math.min(r3, r9)
        L46:
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r7)
        L4a:
            r4.measure(r5, r3)
            return
    }

    private void a(android.view.View r3, boolean r4) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            if (r0 != 0) goto Lb
            android.support.v7.widget.Toolbar$e r0 = r2.generateDefaultLayoutParams()
            goto L18
        Lb:
            boolean r1 = r2.checkLayoutParams(r0)
            if (r1 != 0) goto L16
            android.support.v7.widget.Toolbar$e r0 = r2.generateLayoutParams(r0)
            goto L18
        L16:
            android.support.v7.widget.Toolbar$e r0 = (android.support.v7.widget.Toolbar.e) r0
        L18:
            r1 = 1
            r0.f826b = r1
            if (r4 == 0) goto L2a
            android.view.View r4 = r2.j
            if (r4 == 0) goto L2a
            r3.setLayoutParams(r0)
            java.util.ArrayList<android.view.View> r2 = r2.F
            r2.add(r3)
            goto L2d
        L2a:
            r2.addView(r3, r0)
        L2d:
            return
    }

    private void a(java.util.List<android.view.View> r6, int r7) {
            r5 = this;
            int r0 = b.b.c.g.q.d(r5)
            r1 = 0
            r2 = 1
            if (r0 != r2) goto La
            r0 = r2
            goto Lb
        La:
            r0 = r1
        Lb:
            int r3 = r5.getChildCount()
            int r4 = b.b.c.g.q.d(r5)
            int r7 = b.b.c.g.d.a(r7, r4)
            r6.clear()
            if (r0 == 0) goto L41
            int r3 = r3 - r2
        L1d:
            if (r3 < 0) goto L65
            android.view.View r0 = r5.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.support.v7.widget.Toolbar$e r1 = (android.support.v7.widget.Toolbar.e) r1
            int r2 = r1.f826b
            if (r2 != 0) goto L3e
            boolean r2 = r5.d(r0)
            if (r2 == 0) goto L3e
            int r1 = r1.f689a
            int r1 = r5.a(r1)
            if (r1 != r7) goto L3e
            r6.add(r0)
        L3e:
            int r3 = r3 + (-1)
            goto L1d
        L41:
            if (r1 >= r3) goto L65
            android.view.View r0 = r5.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.support.v7.widget.Toolbar$e r2 = (android.support.v7.widget.Toolbar.e) r2
            int r4 = r2.f826b
            if (r4 != 0) goto L62
            boolean r4 = r5.d(r0)
            if (r4 == 0) goto L62
            int r2 = r2.f689a
            int r2 = r5.a(r2)
            if (r2 != r7) goto L62
            r6.add(r0)
        L62:
            int r1 = r1 + 1
            goto L41
        L65:
            return
    }

    private int b(int r2) {
            r1 = this;
            r2 = r2 & 112(0x70, float:1.57E-43)
            r0 = 16
            if (r2 == r0) goto L13
            r0 = 48
            if (r2 == r0) goto L13
            r0 = 80
            if (r2 == r0) goto L13
            int r1 = r1.x
            r1 = r1 & 112(0x70, float:1.57E-43)
            return r1
        L13:
            return r2
    }

    private int b(android.view.View r1) {
            r0 = this;
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r0.topMargin
            int r0 = r0.bottomMargin
            int r1 = r1 + r0
            return r1
    }

    private int b(android.view.View r6, int r7, int[] r8, int r9) {
            r5 = this;
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.support.v7.widget.Toolbar$e r0 = (android.support.v7.widget.Toolbar.e) r0
            int r1 = r0.rightMargin
            r2 = 1
            r3 = r8[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r7 = r7 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r8[r2] = r1
            int r5 = r5.a(r6, r9)
            int r8 = r6.getMeasuredWidth()
            int r9 = r7 - r8
            int r1 = r6.getMeasuredHeight()
            int r1 = r1 + r5
            r6.layout(r9, r5, r7, r1)
            int r5 = r0.leftMargin
            int r8 = r8 + r5
            int r7 = r7 - r8
            return r7
    }

    private boolean c(android.view.View r2) {
            r1 = this;
            android.view.ViewParent r0 = r2.getParent()
            if (r0 == r1) goto L11
            java.util.ArrayList<android.view.View> r1 = r1.F
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto Lf
            goto L11
        Lf:
            r1 = 0
            goto L12
        L11:
            r1 = 1
        L12:
            return r1
    }

    private boolean d(android.view.View r2) {
            r1 = this;
            if (r2 == 0) goto L12
            android.view.ViewParent r0 = r2.getParent()
            if (r0 != r1) goto L12
            int r1 = r2.getVisibility()
            r2 = 8
            if (r1 == r2) goto L12
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }

    private android.view.MenuInflater getMenuInflater() {
            r1 = this;
            b.b.d.d.g r0 = new b.b.d.d.g
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1)
            return r0
    }

    private void l() {
            r1 = this;
            android.support.v7.widget.l0 r0 = r1.u
            if (r0 != 0) goto Lb
            android.support.v7.widget.l0 r0 = new android.support.v7.widget.l0
            r0.<init>()
            r1.u = r0
        Lb:
            return
    }

    private void m() {
            r2 = this;
            android.widget.ImageView r0 = r2.f
            if (r0 != 0) goto Lf
            android.support.v7.widget.o r0 = new android.support.v7.widget.o
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            r2.f = r0
        Lf:
            return
    }

    private void n() {
            r3 = this;
            r3.o()
            android.support.v7.widget.ActionMenuView r0 = r3.f819b
            android.support.v7.view.menu.h r0 = r0.i()
            if (r0 != 0) goto L2b
            android.support.v7.widget.ActionMenuView r0 = r3.f819b
            android.view.Menu r0 = r0.getMenu()
            android.support.v7.view.menu.h r0 = (android.support.v7.view.menu.h) r0
            android.support.v7.widget.Toolbar$d r1 = r3.L
            if (r1 != 0) goto L1e
            android.support.v7.widget.Toolbar$d r1 = new android.support.v7.widget.Toolbar$d
            r1.<init>(r3)
            r3.L = r1
        L1e:
            android.support.v7.widget.ActionMenuView r1 = r3.f819b
            r2 = 1
            r1.setExpandedActionViewsExclusive(r2)
            android.support.v7.widget.Toolbar$d r1 = r3.L
            android.content.Context r3 = r3.k
            r0.a(r1, r3)
        L2b:
            return
    }

    private void o() {
            r3 = this;
            android.support.v7.widget.ActionMenuView r0 = r3.f819b
            if (r0 != 0) goto L3d
            android.support.v7.widget.ActionMenuView r0 = new android.support.v7.widget.ActionMenuView
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.f819b = r0
            int r1 = r3.l
            r0.setPopupTheme(r1)
            android.support.v7.widget.ActionMenuView r0 = r3.f819b
            android.support.v7.widget.ActionMenuView$e r1 = r3.I
            r0.setOnMenuItemClickListener(r1)
            android.support.v7.widget.ActionMenuView r0 = r3.f819b
            android.support.v7.view.menu.o$a r1 = r3.M
            android.support.v7.view.menu.h$a r2 = r3.N
            r0.a(r1, r2)
            android.support.v7.widget.Toolbar$e r0 = r3.generateDefaultLayoutParams()
            r1 = 8388613(0x800005, float:1.175495E-38)
            int r2 = r3.o
            r2 = r2 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            r0.f689a = r1
            android.support.v7.widget.ActionMenuView r1 = r3.f819b
            r1.setLayoutParams(r0)
            android.support.v7.widget.ActionMenuView r0 = r3.f819b
            r1 = 0
            r3.a(r0, r1)
        L3d:
            return
    }

    private void p() {
            r4 = this;
            android.widget.ImageButton r0 = r4.e
            if (r0 != 0) goto L25
            android.support.v7.widget.m r0 = new android.support.v7.widget.m
            android.content.Context r1 = r4.getContext()
            r2 = 0
            int r3 = b.b.d.a.a.toolbarNavigationButtonStyle
            r0.<init>(r1, r2, r3)
            r4.e = r0
            android.support.v7.widget.Toolbar$e r0 = r4.generateDefaultLayoutParams()
            r1 = 8388611(0x800003, float:1.1754948E-38)
            int r2 = r4.o
            r2 = r2 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            r0.f689a = r1
            android.widget.ImageButton r4 = r4.e
            r4.setLayoutParams(r0)
        L25:
            return
    }

    private void q() {
            r1 = this;
            java.lang.Runnable r0 = r1.P
            r1.removeCallbacks(r0)
            java.lang.Runnable r0 = r1.P
            r1.post(r0)
            return
    }

    private boolean r() {
            r5 = this;
            boolean r0 = r5.O
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r5.getChildCount()
            r2 = r1
        Lb:
            if (r2 >= r0) goto L27
            android.view.View r3 = r5.getChildAt(r2)
            boolean r4 = r5.d(r3)
            if (r4 == 0) goto L24
            int r4 = r3.getMeasuredWidth()
            if (r4 <= 0) goto L24
            int r3 = r3.getMeasuredHeight()
            if (r3 <= 0) goto L24
            return r1
        L24:
            int r2 = r2 + 1
            goto Lb
        L27:
            r5 = 1
            return r5
    }

    void a() {
            r2 = this;
            java.util.ArrayList<android.view.View> r0 = r2.F
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L18
            java.util.ArrayList<android.view.View> r1 = r2.F
            java.lang.Object r1 = r1.get(r0)
            android.view.View r1 = (android.view.View) r1
            r2.addView(r1)
            int r0 = r0 + (-1)
            goto L8
        L18:
            java.util.ArrayList<android.view.View> r2 = r2.F
            r2.clear()
            return
    }

    public void a(int r1, int r2) {
            r0 = this;
            r0.l()
            android.support.v7.widget.l0 r0 = r0.u
            r0.b(r1, r2)
            return
    }

    public void a(android.content.Context r1, int r2) {
            r0 = this;
            r0.n = r2
            android.widget.TextView r0 = r0.d
            if (r0 == 0) goto L9
            r0.setTextAppearance(r1, r2)
        L9:
            return
    }

    public void a(android.support.v7.view.menu.h r4, android.support.v7.widget.c r5) {
            r3 = this;
            if (r4 != 0) goto L7
            android.support.v7.widget.ActionMenuView r0 = r3.f819b
            if (r0 != 0) goto L7
            return
        L7:
            r3.o()
            android.support.v7.widget.ActionMenuView r0 = r3.f819b
            android.support.v7.view.menu.h r0 = r0.i()
            if (r0 != r4) goto L13
            return
        L13:
            if (r0 == 0) goto L1f
            android.support.v7.widget.c r1 = r3.K
            r0.b(r1)
            android.support.v7.widget.Toolbar$d r1 = r3.L
            r0.b(r1)
        L1f:
            android.support.v7.widget.Toolbar$d r0 = r3.L
            if (r0 != 0) goto L2a
            android.support.v7.widget.Toolbar$d r0 = new android.support.v7.widget.Toolbar$d
            r0.<init>(r3)
            r3.L = r0
        L2a:
            r0 = 1
            r5.b(r0)
            if (r4 == 0) goto L3d
            android.content.Context r0 = r3.k
            r4.a(r5, r0)
            android.support.v7.widget.Toolbar$d r0 = r3.L
            android.content.Context r1 = r3.k
            r4.a(r0, r1)
            goto L52
        L3d:
            android.content.Context r4 = r3.k
            r1 = 0
            r5.a(r4, r1)
            android.support.v7.widget.Toolbar$d r4 = r3.L
            android.content.Context r2 = r3.k
            r4.a(r2, r1)
            r5.a(r0)
            android.support.v7.widget.Toolbar$d r4 = r3.L
            r4.a(r0)
        L52:
            android.support.v7.widget.ActionMenuView r4 = r3.f819b
            int r0 = r3.l
            r4.setPopupTheme(r0)
            android.support.v7.widget.ActionMenuView r4 = r3.f819b
            r4.setPresenter(r5)
            r3.K = r5
            return
    }

    public void b(android.content.Context r1, int r2) {
            r0 = this;
            r0.m = r2
            android.widget.TextView r0 = r0.f820c
            if (r0 == 0) goto L9
            r0.setTextAppearance(r1, r2)
        L9:
            return
    }

    public boolean b() {
            r1 = this;
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L12
            android.support.v7.widget.ActionMenuView r1 = r1.f819b
            if (r1 == 0) goto L12
            boolean r1 = r1.h()
            if (r1 == 0) goto L12
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }

    public void c() {
            r0 = this;
            android.support.v7.widget.Toolbar$d r0 = r0.L
            if (r0 != 0) goto L6
            r0 = 0
            goto L8
        L6:
            android.support.v7.view.menu.j r0 = r0.f825c
        L8:
            if (r0 == 0) goto Ld
            r0.collapseActionView()
        Ld:
            return
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r0 = super.checkLayoutParams(r1)
            if (r0 == 0) goto Lc
            boolean r0 = r1 instanceof android.support.v7.widget.Toolbar.e
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public void d() {
            r0 = this;
            android.support.v7.widget.ActionMenuView r0 = r0.f819b
            if (r0 == 0) goto L7
            r0.c()
        L7:
            return
    }

    void e() {
            r4 = this;
            android.widget.ImageButton r0 = r4.i
            if (r0 != 0) goto L3e
            android.support.v7.widget.m r0 = new android.support.v7.widget.m
            android.content.Context r1 = r4.getContext()
            r2 = 0
            int r3 = b.b.d.a.a.toolbarNavigationButtonStyle
            r0.<init>(r1, r2, r3)
            r4.i = r0
            android.graphics.drawable.Drawable r1 = r4.g
            r0.setImageDrawable(r1)
            android.widget.ImageButton r0 = r4.i
            java.lang.CharSequence r1 = r4.h
            r0.setContentDescription(r1)
            android.support.v7.widget.Toolbar$e r0 = r4.generateDefaultLayoutParams()
            r1 = 8388611(0x800003, float:1.1754948E-38)
            int r2 = r4.o
            r2 = r2 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            r0.f689a = r1
            r1 = 2
            r0.f826b = r1
            android.widget.ImageButton r1 = r4.i
            r1.setLayoutParams(r0)
            android.widget.ImageButton r0 = r4.i
            android.support.v7.widget.Toolbar$c r1 = new android.support.v7.widget.Toolbar$c
            r1.<init>(r4)
            r0.setOnClickListener(r1)
        L3e:
            return
    }

    public boolean f() {
            r0 = this;
            android.support.v7.widget.Toolbar$d r0 = r0.L
            if (r0 == 0) goto La
            android.support.v7.view.menu.j r0 = r0.f825c
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public boolean g() {
            r0 = this;
            android.support.v7.widget.ActionMenuView r0 = r0.f819b
            if (r0 == 0) goto Lc
            boolean r0 = r0.e()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @Override // android.view.ViewGroup
    protected android.support.v7.widget.Toolbar.e generateDefaultLayoutParams() {
            r1 = this;
            android.support.v7.widget.Toolbar$e r1 = new android.support.v7.widget.Toolbar$e
            r0 = -2
            r1.<init>(r0, r0)
            return r1
    }

    @Override // android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r0 = this;
            android.support.v7.widget.Toolbar$e r0 = r0.generateDefaultLayoutParams()
            return r0
    }

    @Override // android.view.ViewGroup
    public android.support.v7.widget.Toolbar.e generateLayoutParams(android.util.AttributeSet r2) {
            r1 = this;
            android.support.v7.widget.Toolbar$e r0 = new android.support.v7.widget.Toolbar$e
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1, r2)
            return r0
    }

    @Override // android.view.ViewGroup
    protected android.support.v7.widget.Toolbar.e generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r0 = r1 instanceof android.support.v7.widget.Toolbar.e
            if (r0 == 0) goto Lc
            android.support.v7.widget.Toolbar$e r0 = new android.support.v7.widget.Toolbar$e
            android.support.v7.widget.Toolbar$e r1 = (android.support.v7.widget.Toolbar.e) r1
            r0.<init>(r1)
            return r0
        Lc:
            boolean r0 = r1 instanceof android.support.v7.app.a.C0030a
            if (r0 == 0) goto L18
            android.support.v7.widget.Toolbar$e r0 = new android.support.v7.widget.Toolbar$e
            android.support.v7.app.a$a r1 = (android.support.v7.app.a.C0030a) r1
            r0.<init>(r1)
            return r0
        L18:
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L24
            android.support.v7.widget.Toolbar$e r0 = new android.support.v7.widget.Toolbar$e
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            r0.<init>(r1)
            return r0
        L24:
            android.support.v7.widget.Toolbar$e r0 = new android.support.v7.widget.Toolbar$e
            r0.<init>(r1)
            return r0
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            android.support.v7.widget.Toolbar$e r0 = r0.generateLayoutParams(r1)
            return r0
    }

    @Override // android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            android.support.v7.widget.Toolbar$e r0 = r0.generateLayoutParams(r1)
            return r0
    }

    public int getContentInsetEnd() {
            r0 = this;
            android.support.v7.widget.l0 r0 = r0.u
            if (r0 == 0) goto L9
            int r0 = r0.a()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public int getContentInsetEndWithActions() {
            r2 = this;
            int r0 = r2.w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L7
            goto Lb
        L7:
            int r0 = r2.getContentInsetEnd()
        Lb:
            return r0
    }

    public int getContentInsetLeft() {
            r0 = this;
            android.support.v7.widget.l0 r0 = r0.u
            if (r0 == 0) goto L9
            int r0 = r0.b()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public int getContentInsetRight() {
            r0 = this;
            android.support.v7.widget.l0 r0 = r0.u
            if (r0 == 0) goto L9
            int r0 = r0.c()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public int getContentInsetStart() {
            r0 = this;
            android.support.v7.widget.l0 r0 = r0.u
            if (r0 == 0) goto L9
            int r0 = r0.d()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public int getContentInsetStartWithNavigation() {
            r2 = this;
            int r0 = r2.v
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L7
            goto Lb
        L7:
            int r0 = r2.getContentInsetStart()
        Lb:
            return r0
    }

    public int getCurrentContentInsetEnd() {
            r2 = this;
            android.support.v7.widget.ActionMenuView r0 = r2.f819b
            r1 = 0
            if (r0 == 0) goto L13
            android.support.v7.view.menu.h r0 = r0.i()
            if (r0 == 0) goto L13
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = r1
        L14:
            if (r0 == 0) goto L25
            int r0 = r2.getContentInsetEnd()
            int r2 = r2.w
            int r2 = java.lang.Math.max(r2, r1)
            int r2 = java.lang.Math.max(r0, r2)
            goto L29
        L25:
            int r2 = r2.getContentInsetEnd()
        L29:
            return r2
    }

    public int getCurrentContentInsetLeft() {
            r2 = this;
            int r0 = b.b.c.g.q.d(r2)
            r1 = 1
            if (r0 != r1) goto Lc
            int r2 = r2.getCurrentContentInsetEnd()
            goto L10
        Lc:
            int r2 = r2.getCurrentContentInsetStart()
        L10:
            return r2
    }

    public int getCurrentContentInsetRight() {
            r2 = this;
            int r0 = b.b.c.g.q.d(r2)
            r1 = 1
            if (r0 != r1) goto Lc
            int r2 = r2.getCurrentContentInsetStart()
            goto L10
        Lc:
            int r2 = r2.getCurrentContentInsetEnd()
        L10:
            return r2
    }

    public int getCurrentContentInsetStart() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.getNavigationIcon()
            if (r0 == 0) goto L16
            int r0 = r2.getContentInsetStart()
            int r2 = r2.v
            r1 = 0
            int r2 = java.lang.Math.max(r2, r1)
            int r2 = java.lang.Math.max(r0, r2)
            goto L1a
        L16:
            int r2 = r2.getContentInsetStart()
        L1a:
            return r2
    }

    public android.graphics.drawable.Drawable getLogo() {
            r0 = this;
            android.widget.ImageView r0 = r0.f
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public java.lang.CharSequence getLogoDescription() {
            r0 = this;
            android.widget.ImageView r0 = r0.f
            if (r0 == 0) goto L9
            java.lang.CharSequence r0 = r0.getContentDescription()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public android.view.Menu getMenu() {
            r0 = this;
            r0.n()
            android.support.v7.widget.ActionMenuView r0 = r0.f819b
            android.view.Menu r0 = r0.getMenu()
            return r0
    }

    public java.lang.CharSequence getNavigationContentDescription() {
            r0 = this;
            android.widget.ImageButton r0 = r0.e
            if (r0 == 0) goto L9
            java.lang.CharSequence r0 = r0.getContentDescription()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public android.graphics.drawable.Drawable getNavigationIcon() {
            r0 = this;
            android.widget.ImageButton r0 = r0.e
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    android.support.v7.widget.c getOuterActionMenuPresenter() {
            r0 = this;
            android.support.v7.widget.c r0 = r0.K
            return r0
    }

    public android.graphics.drawable.Drawable getOverflowIcon() {
            r0 = this;
            r0.n()
            android.support.v7.widget.ActionMenuView r0 = r0.f819b
            android.graphics.drawable.Drawable r0 = r0.getOverflowIcon()
            return r0
    }

    android.content.Context getPopupContext() {
            r0 = this;
            android.content.Context r0 = r0.k
            return r0
    }

    public int getPopupTheme() {
            r0 = this;
            int r0 = r0.l
            return r0
    }

    public java.lang.CharSequence getSubtitle() {
            r0 = this;
            java.lang.CharSequence r0 = r0.z
            return r0
    }

    public java.lang.CharSequence getTitle() {
            r0 = this;
            java.lang.CharSequence r0 = r0.y
            return r0
    }

    public int getTitleMarginBottom() {
            r0 = this;
            int r0 = r0.t
            return r0
    }

    public int getTitleMarginEnd() {
            r0 = this;
            int r0 = r0.r
            return r0
    }

    public int getTitleMarginStart() {
            r0 = this;
            int r0 = r0.q
            return r0
    }

    public int getTitleMarginTop() {
            r0 = this;
            int r0 = r0.s
            return r0
    }

    public android.support.v7.widget.b0 getWrapper() {
            r2 = this;
            android.support.v7.widget.u0 r0 = r2.J
            if (r0 != 0) goto Lc
            android.support.v7.widget.u0 r0 = new android.support.v7.widget.u0
            r1 = 1
            r0.<init>(r2, r1)
            r2.J = r0
        Lc:
            android.support.v7.widget.u0 r2 = r2.J
            return r2
    }

    public boolean h() {
            r0 = this;
            android.support.v7.widget.ActionMenuView r0 = r0.f819b
            if (r0 == 0) goto Lc
            boolean r0 = r0.f()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public boolean i() {
            r0 = this;
            android.support.v7.widget.ActionMenuView r0 = r0.f819b
            if (r0 == 0) goto Lc
            boolean r0 = r0.g()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    void j() {
            r4 = this;
            int r0 = r4.getChildCount()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L26
            android.view.View r1 = r4.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            android.support.v7.widget.Toolbar$e r2 = (android.support.v7.widget.Toolbar.e) r2
            int r2 = r2.f826b
            r3 = 2
            if (r2 == r3) goto L23
            android.support.v7.widget.ActionMenuView r2 = r4.f819b
            if (r1 == r2) goto L23
            r4.removeViewAt(r0)
            java.util.ArrayList<android.view.View> r2 = r4.F
            r2.add(r1)
        L23:
            int r0 = r0 + (-1)
            goto L6
        L26:
            return
    }

    public boolean k() {
            r0 = this;
            android.support.v7.widget.ActionMenuView r0 = r0.f819b
            if (r0 == 0) goto Lc
            boolean r0 = r0.j()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            java.lang.Runnable r0 = r1.P
            r1.removeCallbacks(r0)
            return
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent r6) {
            r5 = this;
            int r0 = r6.getActionMasked()
            r1 = 0
            r2 = 9
            if (r0 != r2) goto Lb
            r5.D = r1
        Lb:
            boolean r3 = r5.D
            r4 = 1
            if (r3 != 0) goto L1a
            boolean r6 = super.onHoverEvent(r6)
            if (r0 != r2) goto L1a
            if (r6 != 0) goto L1a
            r5.D = r4
        L1a:
            r6 = 10
            if (r0 == r6) goto L21
            r6 = 3
            if (r0 != r6) goto L23
        L21:
            r5.D = r1
        L23:
            return r4
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
            r19 = this;
            r0 = r19
            int r1 = b.b.c.g.q.d(r19)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto Lc
            r1 = r2
            goto Ld
        Lc:
            r1 = r3
        Ld:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.G
            r11[r2] = r3
            r11[r3] = r3
            int r12 = b.b.c.g.q.e(r19)
            if (r12 < 0) goto L3a
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L3b
        L3a:
            r12 = r3
        L3b:
            android.widget.ImageButton r13 = r0.e
            boolean r13 = r0.d(r13)
            if (r13 == 0) goto L53
            android.widget.ImageButton r13 = r0.e
            if (r1 == 0) goto L4e
            int r13 = r0.b(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L55
        L4e:
            int r13 = r0.a(r13, r6, r11, r12)
            goto L54
        L53:
            r13 = r6
        L54:
            r14 = r10
        L55:
            android.widget.ImageButton r15 = r0.i
            boolean r15 = r0.d(r15)
            if (r15 == 0) goto L6a
            android.widget.ImageButton r15 = r0.i
            if (r1 == 0) goto L66
            int r14 = r0.b(r15, r14, r11, r12)
            goto L6a
        L66:
            int r13 = r0.a(r15, r13, r11, r12)
        L6a:
            android.support.v7.widget.ActionMenuView r15 = r0.f819b
            boolean r15 = r0.d(r15)
            if (r15 == 0) goto L7f
            android.support.v7.widget.ActionMenuView r15 = r0.f819b
            if (r1 == 0) goto L7b
            int r13 = r0.a(r15, r13, r11, r12)
            goto L7f
        L7b:
            int r14 = r0.b(r15, r14, r11, r12)
        L7f:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.j
            boolean r13 = r0.d(r13)
            if (r13 == 0) goto Lba
            android.view.View r13 = r0.j
            if (r1 == 0) goto Lb6
            int r10 = r0.b(r13, r10, r11, r12)
            goto Lba
        Lb6:
            int r2 = r0.a(r13, r2, r11, r12)
        Lba:
            android.widget.ImageView r13 = r0.f
            boolean r13 = r0.d(r13)
            if (r13 == 0) goto Lcf
            android.widget.ImageView r13 = r0.f
            if (r1 == 0) goto Lcb
            int r10 = r0.b(r13, r10, r11, r12)
            goto Lcf
        Lcb:
            int r2 = r0.a(r13, r2, r11, r12)
        Lcf:
            android.widget.TextView r13 = r0.f820c
            boolean r13 = r0.d(r13)
            android.widget.TextView r14 = r0.d
            boolean r14 = r0.d(r14)
            if (r13 == 0) goto Lf6
            android.widget.TextView r15 = r0.f820c
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            android.support.v7.widget.Toolbar$e r15 = (android.support.v7.widget.Toolbar.e) r15
            int r3 = r15.topMargin
            r23 = r7
            android.widget.TextView r7 = r0.f820c
            int r7 = r7.getMeasuredHeight()
            int r3 = r3 + r7
            int r7 = r15.bottomMargin
            int r3 = r3 + r7
            r7 = 0
            int r3 = r3 + r7
            goto Lf9
        Lf6:
            r23 = r7
            r3 = 0
        Lf9:
            if (r14 == 0) goto L113
            android.widget.TextView r7 = r0.d
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            android.support.v7.widget.Toolbar$e r7 = (android.support.v7.widget.Toolbar.e) r7
            int r15 = r7.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.d
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r7.bottomMargin
            int r15 = r15 + r4
            int r3 = r3 + r15
            goto L115
        L113:
            r16 = r4
        L115:
            if (r13 != 0) goto L121
            if (r14 == 0) goto L11a
            goto L121
        L11a:
            r18 = r6
            r22 = r12
        L11e:
            r1 = 0
            goto L28a
        L121:
            if (r13 == 0) goto L126
            android.widget.TextView r4 = r0.f820c
            goto L128
        L126:
            android.widget.TextView r4 = r0.d
        L128:
            if (r14 == 0) goto L12d
            android.widget.TextView r7 = r0.d
            goto L12f
        L12d:
            android.widget.TextView r7 = r0.f820c
        L12f:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            android.support.v7.widget.Toolbar$e r4 = (android.support.v7.widget.Toolbar.e) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            android.support.v7.widget.Toolbar$e r7 = (android.support.v7.widget.Toolbar.e) r7
            if (r13 == 0) goto L145
            android.widget.TextView r15 = r0.f820c
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L14f
        L145:
            if (r14 == 0) goto L152
            android.widget.TextView r15 = r0.d
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L152
        L14f:
            r17 = 1
            goto L154
        L152:
            r17 = 0
        L154:
            int r15 = r0.x
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L19c
            r6 = 80
            if (r15 == r6) goto L18e
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r3
            int r6 = r6 / 2
            int r15 = r4.topMargin
            r22 = r12
            int r12 = r0.s
            r24 = r2
            int r2 = r15 + r12
            if (r6 >= r2) goto L177
            int r6 = r15 + r12
            goto L18c
        L177:
            int r5 = r5 - r9
            int r5 = r5 - r3
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r3 = r0.t
            int r2 = r2 + r3
            if (r5 >= r2) goto L18c
            int r2 = r7.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L18c:
            int r8 = r8 + r6
            goto L1ab
        L18e:
            r24 = r2
            r22 = r12
            int r5 = r5 - r9
            int r2 = r7.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.t
            int r5 = r5 - r2
            int r8 = r5 - r3
            goto L1ab
        L19c:
            r24 = r2
            r22 = r12
            int r2 = r19.getPaddingTop()
            int r3 = r4.topMargin
            int r2 = r2 + r3
            int r3 = r0.s
            int r8 = r2 + r3
        L1ab:
            if (r1 == 0) goto L21f
            if (r17 == 0) goto L1b2
            int r1 = r0.q
            goto L1b3
        L1b2:
            r1 = 0
        L1b3:
            r2 = 1
            r3 = r11[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r10 = r10 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r2] = r1
            if (r13 == 0) goto L1ea
            android.widget.TextView r1 = r0.f820c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.support.v7.widget.Toolbar$e r1 = (android.support.v7.widget.Toolbar.e) r1
            android.widget.TextView r2 = r0.f820c
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.f820c
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f820c
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.r
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L1eb
        L1ea:
            r2 = r10
        L1eb:
            if (r14 == 0) goto L213
            android.widget.TextView r1 = r0.d
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.support.v7.widget.Toolbar$e r1 = (android.support.v7.widget.Toolbar.e) r1
            int r3 = r1.topMargin
            int r8 = r8 + r3
            android.widget.TextView r3 = r0.d
            int r3 = r3.getMeasuredWidth()
            int r3 = r10 - r3
            android.widget.TextView r4 = r0.d
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.d
            r5.layout(r3, r8, r10, r4)
            int r3 = r0.r
            int r3 = r10 - r3
            int r1 = r1.bottomMargin
            goto L214
        L213:
            r3 = r10
        L214:
            if (r17 == 0) goto L21b
            int r1 = java.lang.Math.min(r2, r3)
            r10 = r1
        L21b:
            r2 = r24
            goto L11e
        L21f:
            if (r17 == 0) goto L225
            int r7 = r0.q
            r1 = 0
            goto L227
        L225:
            r1 = 0
            r7 = 0
        L227:
            r2 = r11[r1]
            int r7 = r7 - r2
            int r2 = java.lang.Math.max(r1, r7)
            int r2 = r24 + r2
            int r3 = -r7
            int r3 = java.lang.Math.max(r1, r3)
            r11[r1] = r3
            if (r13 == 0) goto L25c
            android.widget.TextView r3 = r0.f820c
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            android.support.v7.widget.Toolbar$e r3 = (android.support.v7.widget.Toolbar.e) r3
            android.widget.TextView r4 = r0.f820c
            int r4 = r4.getMeasuredWidth()
            int r4 = r4 + r2
            android.widget.TextView r5 = r0.f820c
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f820c
            r6.layout(r2, r8, r4, r5)
            int r6 = r0.r
            int r4 = r4 + r6
            int r3 = r3.bottomMargin
            int r8 = r5 + r3
            goto L25d
        L25c:
            r4 = r2
        L25d:
            if (r14 == 0) goto L283
            android.widget.TextView r3 = r0.d
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            android.support.v7.widget.Toolbar$e r3 = (android.support.v7.widget.Toolbar.e) r3
            int r5 = r3.topMargin
            int r8 = r8 + r5
            android.widget.TextView r5 = r0.d
            int r5 = r5.getMeasuredWidth()
            int r5 = r5 + r2
            android.widget.TextView r6 = r0.d
            int r6 = r6.getMeasuredHeight()
            int r6 = r6 + r8
            android.widget.TextView r7 = r0.d
            r7.layout(r2, r8, r5, r6)
            int r6 = r0.r
            int r5 = r5 + r6
            int r3 = r3.bottomMargin
            goto L284
        L283:
            r5 = r2
        L284:
            if (r17 == 0) goto L28a
            int r2 = java.lang.Math.max(r4, r5)
        L28a:
            java.util.ArrayList<android.view.View> r3 = r0.E
            r4 = 3
            r0.a(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.E
            int r3 = r3.size()
            r7 = r1
        L297:
            if (r7 >= r3) goto L2aa
            java.util.ArrayList<android.view.View> r4 = r0.E
            java.lang.Object r4 = r4.get(r7)
            android.view.View r4 = (android.view.View) r4
            r12 = r22
            int r2 = r0.a(r4, r2, r11, r12)
            int r7 = r7 + 1
            goto L297
        L2aa:
            r12 = r22
            java.util.ArrayList<android.view.View> r3 = r0.E
            r4 = 5
            r0.a(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.E
            int r3 = r3.size()
            r7 = r1
        L2b9:
            if (r7 >= r3) goto L2ca
            java.util.ArrayList<android.view.View> r4 = r0.E
            java.lang.Object r4 = r4.get(r7)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.b(r4, r10, r11, r12)
            int r7 = r7 + 1
            goto L2b9
        L2ca:
            java.util.ArrayList<android.view.View> r3 = r0.E
            r4 = 1
            r0.a(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.E
            int r3 = r0.a(r3, r11)
            int r4 = r16 - r18
            int r4 = r4 - r23
            int r4 = r4 / 2
            int r6 = r18 + r4
            int r4 = r3 / 2
            int r6 = r6 - r4
            int r3 = r3 + r6
            if (r6 >= r2) goto L2e5
            goto L2ec
        L2e5:
            if (r3 <= r10) goto L2eb
            int r3 = r3 - r10
            int r2 = r6 - r3
            goto L2ec
        L2eb:
            r2 = r6
        L2ec:
            java.util.ArrayList<android.view.View> r3 = r0.E
            int r3 = r3.size()
        L2f2:
            if (r1 >= r3) goto L303
            java.util.ArrayList<android.view.View> r4 = r0.E
            java.lang.Object r4 = r4.get(r1)
            android.view.View r4 = (android.view.View) r4
            int r2 = r0.a(r4, r2, r11, r12)
            int r1 = r1 + 1
            goto L2f2
        L303:
            java.util.ArrayList<android.view.View> r0 = r0.E
            r0.clear()
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r17, int r18) {
            r16 = this;
            r7 = r16
            int[] r8 = r7.G
            boolean r0 = android.support.v7.widget.z0.a(r16)
            r1 = 1
            r9 = 0
            if (r0 == 0) goto Lf
            r10 = r1
            r11 = r9
            goto L11
        Lf:
            r11 = r1
            r10 = r9
        L11:
            android.widget.ImageButton r0 = r7.e
            boolean r0 = r7.d(r0)
            if (r0 == 0) goto L53
            android.widget.ImageButton r1 = r7.e
            r5 = 0
            int r6 = r7.p
            r3 = 0
            r0 = r16
            r2 = r17
            r4 = r18
            r0.a(r1, r2, r3, r4, r5, r6)
            android.widget.ImageButton r0 = r7.e
            int r0 = r0.getMeasuredWidth()
            android.widget.ImageButton r1 = r7.e
            int r1 = r7.a(r1)
            int r0 = r0 + r1
            android.widget.ImageButton r1 = r7.e
            int r1 = r1.getMeasuredHeight()
            android.widget.ImageButton r2 = r7.e
            int r2 = r7.b(r2)
            int r1 = r1 + r2
            int r1 = java.lang.Math.max(r9, r1)
            android.widget.ImageButton r2 = r7.e
            int r2 = r2.getMeasuredState()
            int r2 = android.view.View.combineMeasuredStates(r9, r2)
            r12 = r1
            r13 = r2
            goto L56
        L53:
            r0 = r9
            r12 = r0
            r13 = r12
        L56:
            android.widget.ImageButton r1 = r7.i
            boolean r1 = r7.d(r1)
            if (r1 == 0) goto L95
            android.widget.ImageButton r1 = r7.i
            r5 = 0
            int r6 = r7.p
            r3 = 0
            r0 = r16
            r2 = r17
            r4 = r18
            r0.a(r1, r2, r3, r4, r5, r6)
            android.widget.ImageButton r0 = r7.i
            int r0 = r0.getMeasuredWidth()
            android.widget.ImageButton r1 = r7.i
            int r1 = r7.a(r1)
            int r0 = r0 + r1
            android.widget.ImageButton r1 = r7.i
            int r1 = r1.getMeasuredHeight()
            android.widget.ImageButton r2 = r7.i
            int r2 = r7.b(r2)
            int r1 = r1 + r2
            int r12 = java.lang.Math.max(r12, r1)
            android.widget.ImageButton r1 = r7.i
            int r1 = r1.getMeasuredState()
            int r13 = android.view.View.combineMeasuredStates(r13, r1)
        L95:
            int r1 = r16.getCurrentContentInsetStart()
            int r2 = java.lang.Math.max(r1, r0)
            int r14 = r9 + r2
            int r1 = r1 - r0
            int r0 = java.lang.Math.max(r9, r1)
            r8[r10] = r0
            android.support.v7.widget.ActionMenuView r0 = r7.f819b
            boolean r0 = r7.d(r0)
            if (r0 == 0) goto Le6
            android.support.v7.widget.ActionMenuView r1 = r7.f819b
            r5 = 0
            int r6 = r7.p
            r0 = r16
            r2 = r17
            r3 = r14
            r4 = r18
            r0.a(r1, r2, r3, r4, r5, r6)
            android.support.v7.widget.ActionMenuView r0 = r7.f819b
            int r0 = r0.getMeasuredWidth()
            android.support.v7.widget.ActionMenuView r1 = r7.f819b
            int r1 = r7.a(r1)
            int r0 = r0 + r1
            android.support.v7.widget.ActionMenuView r1 = r7.f819b
            int r1 = r1.getMeasuredHeight()
            android.support.v7.widget.ActionMenuView r2 = r7.f819b
            int r2 = r7.b(r2)
            int r1 = r1 + r2
            int r12 = java.lang.Math.max(r12, r1)
            android.support.v7.widget.ActionMenuView r1 = r7.f819b
            int r1 = r1.getMeasuredState()
            int r13 = android.view.View.combineMeasuredStates(r13, r1)
            goto Le7
        Le6:
            r0 = r9
        Le7:
            int r1 = r16.getCurrentContentInsetEnd()
            int r2 = java.lang.Math.max(r1, r0)
            int r14 = r14 + r2
            int r1 = r1 - r0
            int r0 = java.lang.Math.max(r9, r1)
            r8[r11] = r0
            android.view.View r0 = r7.j
            boolean r0 = r7.d(r0)
            if (r0 == 0) goto L12a
            android.view.View r1 = r7.j
            r5 = 0
            r0 = r16
            r2 = r17
            r3 = r14
            r4 = r18
            r6 = r8
            int r0 = r0.a(r1, r2, r3, r4, r5, r6)
            int r14 = r14 + r0
            android.view.View r0 = r7.j
            int r0 = r0.getMeasuredHeight()
            android.view.View r1 = r7.j
            int r1 = r7.b(r1)
            int r0 = r0 + r1
            int r12 = java.lang.Math.max(r12, r0)
            android.view.View r0 = r7.j
            int r0 = r0.getMeasuredState()
            int r13 = android.view.View.combineMeasuredStates(r13, r0)
        L12a:
            android.widget.ImageView r0 = r7.f
            boolean r0 = r7.d(r0)
            if (r0 == 0) goto L15d
            android.widget.ImageView r1 = r7.f
            r5 = 0
            r0 = r16
            r2 = r17
            r3 = r14
            r4 = r18
            r6 = r8
            int r0 = r0.a(r1, r2, r3, r4, r5, r6)
            int r14 = r14 + r0
            android.widget.ImageView r0 = r7.f
            int r0 = r0.getMeasuredHeight()
            android.widget.ImageView r1 = r7.f
            int r1 = r7.b(r1)
            int r0 = r0 + r1
            int r12 = java.lang.Math.max(r12, r0)
            android.widget.ImageView r0 = r7.f
            int r0 = r0.getMeasuredState()
            int r13 = android.view.View.combineMeasuredStates(r13, r0)
        L15d:
            int r10 = r16.getChildCount()
            r11 = r9
        L162:
            if (r11 >= r10) goto L1a2
            android.view.View r15 = r7.getChildAt(r11)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            android.support.v7.widget.Toolbar$e r0 = (android.support.v7.widget.Toolbar.e) r0
            int r0 = r0.f826b
            if (r0 != 0) goto L19f
            boolean r0 = r7.d(r15)
            if (r0 != 0) goto L179
            goto L19f
        L179:
            r5 = 0
            r0 = r16
            r1 = r15
            r2 = r17
            r3 = r14
            r4 = r18
            r6 = r8
            int r0 = r0.a(r1, r2, r3, r4, r5, r6)
            int r14 = r14 + r0
            int r0 = r15.getMeasuredHeight()
            int r1 = r7.b(r15)
            int r0 = r0 + r1
            int r0 = java.lang.Math.max(r12, r0)
            int r1 = r15.getMeasuredState()
            int r1 = android.view.View.combineMeasuredStates(r13, r1)
            r12 = r0
            r13 = r1
        L19f:
            int r11 = r11 + 1
            goto L162
        L1a2:
            int r0 = r7.s
            int r1 = r7.t
            int r10 = r0 + r1
            int r0 = r7.q
            int r1 = r7.r
            int r11 = r0 + r1
            android.widget.TextView r0 = r7.f820c
            boolean r0 = r7.d(r0)
            if (r0 == 0) goto L1ed
            android.widget.TextView r1 = r7.f820c
            int r3 = r14 + r11
            r0 = r16
            r2 = r17
            r4 = r18
            r5 = r10
            r6 = r8
            r0.a(r1, r2, r3, r4, r5, r6)
            android.widget.TextView r0 = r7.f820c
            int r0 = r0.getMeasuredWidth()
            android.widget.TextView r1 = r7.f820c
            int r1 = r7.a(r1)
            int r0 = r0 + r1
            android.widget.TextView r1 = r7.f820c
            int r1 = r1.getMeasuredHeight()
            android.widget.TextView r2 = r7.f820c
            int r2 = r7.b(r2)
            int r1 = r1 + r2
            android.widget.TextView r2 = r7.f820c
            int r2 = r2.getMeasuredState()
            int r13 = android.view.View.combineMeasuredStates(r13, r2)
            r15 = r1
            r6 = r13
            r13 = r0
            goto L1f0
        L1ed:
            r15 = r9
            r6 = r13
            r13 = r15
        L1f0:
            android.widget.TextView r0 = r7.d
            boolean r0 = r7.d(r0)
            if (r0 == 0) goto L227
            android.widget.TextView r1 = r7.d
            int r3 = r14 + r11
            int r5 = r15 + r10
            r0 = r16
            r2 = r17
            r4 = r18
            r10 = r6
            r6 = r8
            int r0 = r0.a(r1, r2, r3, r4, r5, r6)
            int r13 = java.lang.Math.max(r13, r0)
            android.widget.TextView r0 = r7.d
            int r0 = r0.getMeasuredHeight()
            android.widget.TextView r1 = r7.d
            int r1 = r7.b(r1)
            int r0 = r0 + r1
            int r15 = r15 + r0
            android.widget.TextView r0 = r7.d
            int r0 = r0.getMeasuredState()
            int r6 = android.view.View.combineMeasuredStates(r10, r0)
            goto L228
        L227:
            r10 = r6
        L228:
            int r14 = r14 + r13
            int r0 = java.lang.Math.max(r12, r15)
            int r1 = r16.getPaddingLeft()
            int r2 = r16.getPaddingRight()
            int r1 = r1 + r2
            int r14 = r14 + r1
            int r1 = r16.getPaddingTop()
            int r2 = r16.getPaddingBottom()
            int r1 = r1 + r2
            int r0 = r0 + r1
            int r1 = r16.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r14, r1)
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 & r6
            r3 = r17
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            int r2 = r16.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = r6 << 16
            r3 = r18
            int r0 = android.view.View.resolveSizeAndState(r0, r3, r2)
            boolean r2 = r16.r()
            if (r2 == 0) goto L269
            goto L26a
        L269:
            r9 = r0
        L26a:
            r7.setMeasuredDimension(r1, r9)
            return
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable r4) {
            r3 = this;
            boolean r0 = r4 instanceof android.support.v7.widget.Toolbar.g
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r4)
            return
        L8:
            android.support.v7.widget.Toolbar$g r4 = (android.support.v7.widget.Toolbar.g) r4
            android.os.Parcelable r0 = r4.a()
            super.onRestoreInstanceState(r0)
            android.support.v7.widget.ActionMenuView r0 = r3.f819b
            if (r0 == 0) goto L1a
            android.support.v7.view.menu.h r0 = r0.i()
            goto L1b
        L1a:
            r0 = 0
        L1b:
            int r1 = r4.d
            if (r1 == 0) goto L2e
            android.support.v7.widget.Toolbar$d r2 = r3.L
            if (r2 == 0) goto L2e
            if (r0 == 0) goto L2e
            android.view.MenuItem r0 = r0.findItem(r1)
            if (r0 == 0) goto L2e
            r0.expandActionView()
        L2e:
            boolean r4 = r4.e
            if (r4 == 0) goto L35
            r3.q()
        L35:
            return
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r0 < r1) goto L9
            super.onRtlPropertiesChanged(r3)
        L9:
            r2.l()
            android.support.v7.widget.l0 r2 = r2.u
            r0 = 1
            if (r3 != r0) goto L12
            goto L13
        L12:
            r0 = 0
        L13:
            r2.a(r0)
            return
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.support.v7.widget.Toolbar$g r0 = new android.support.v7.widget.Toolbar$g
            android.os.Parcelable r1 = super.onSaveInstanceState()
            r0.<init>(r1)
            android.support.v7.widget.Toolbar$d r1 = r2.L
            if (r1 == 0) goto L17
            android.support.v7.view.menu.j r1 = r1.f825c
            if (r1 == 0) goto L17
            int r1 = r1.getItemId()
            r0.d = r1
        L17:
            boolean r2 = r2.i()
            r0.e = r2
            return r0
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r5) {
            r4 = this;
            int r0 = r5.getActionMasked()
            r1 = 0
            if (r0 != 0) goto L9
            r4.C = r1
        L9:
            boolean r2 = r4.C
            r3 = 1
            if (r2 != 0) goto L18
            boolean r5 = super.onTouchEvent(r5)
            if (r0 != 0) goto L18
            if (r5 != 0) goto L18
            r4.C = r3
        L18:
            if (r0 == r3) goto L1d
            r5 = 3
            if (r0 != r5) goto L1f
        L1d:
            r4.C = r1
        L1f:
            return r3
    }

    public void setCollapsible(boolean r1) {
            r0 = this;
            r0.O = r1
            r0.requestLayout()
            return
    }

    public void setContentInsetEndWithActions(int r2) {
            r1 = this;
            if (r2 >= 0) goto L4
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L4:
            int r0 = r1.w
            if (r2 == r0) goto L13
            r1.w = r2
            android.graphics.drawable.Drawable r2 = r1.getNavigationIcon()
            if (r2 == 0) goto L13
            r1.requestLayout()
        L13:
            return
    }

    public void setContentInsetStartWithNavigation(int r2) {
            r1 = this;
            if (r2 >= 0) goto L4
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L4:
            int r0 = r1.v
            if (r2 == r0) goto L13
            r1.v = r2
            android.graphics.drawable.Drawable r2 = r1.getNavigationIcon()
            if (r2 == 0) goto L13
            r1.requestLayout()
        L13:
            return
    }

    public void setLogo(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = b.b.d.b.a.a.c(r0, r2)
            r1.setLogo(r2)
            return
    }

    public void setLogo(android.graphics.drawable.Drawable r3) {
            r2 = this;
            if (r3 == 0) goto L14
            r2.m()
            android.widget.ImageView r0 = r2.f
            boolean r0 = r2.c(r0)
            if (r0 != 0) goto L2a
            android.widget.ImageView r0 = r2.f
            r1 = 1
            r2.a(r0, r1)
            goto L2a
        L14:
            android.widget.ImageView r0 = r2.f
            if (r0 == 0) goto L2a
            boolean r0 = r2.c(r0)
            if (r0 == 0) goto L2a
            android.widget.ImageView r0 = r2.f
            r2.removeView(r0)
            java.util.ArrayList<android.view.View> r0 = r2.F
            android.widget.ImageView r1 = r2.f
            r0.remove(r1)
        L2a:
            android.widget.ImageView r2 = r2.f
            if (r2 == 0) goto L31
            r2.setImageDrawable(r3)
        L31:
            return
    }

    public void setLogoDescription(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            java.lang.CharSequence r2 = r0.getText(r2)
            r1.setLogoDescription(r2)
            return
    }

    public void setLogoDescription(java.lang.CharSequence r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L9
            r1.m()
        L9:
            android.widget.ImageView r1 = r1.f
            if (r1 == 0) goto L10
            r1.setContentDescription(r2)
        L10:
            return
    }

    public void setNavigationContentDescription(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            java.lang.CharSequence r2 = r0.getText(r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setNavigationContentDescription(r2)
            return
    }

    public void setNavigationContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L9
            r1.p()
        L9:
            android.widget.ImageButton r1 = r1.e
            if (r1 == 0) goto L10
            r1.setContentDescription(r2)
        L10:
            return
    }

    public void setNavigationIcon(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = b.b.d.b.a.a.c(r0, r2)
            r1.setNavigationIcon(r2)
            return
    }

    public void setNavigationIcon(android.graphics.drawable.Drawable r3) {
            r2 = this;
            if (r3 == 0) goto L14
            r2.p()
            android.widget.ImageButton r0 = r2.e
            boolean r0 = r2.c(r0)
            if (r0 != 0) goto L2a
            android.widget.ImageButton r0 = r2.e
            r1 = 1
            r2.a(r0, r1)
            goto L2a
        L14:
            android.widget.ImageButton r0 = r2.e
            if (r0 == 0) goto L2a
            boolean r0 = r2.c(r0)
            if (r0 == 0) goto L2a
            android.widget.ImageButton r0 = r2.e
            r2.removeView(r0)
            java.util.ArrayList<android.view.View> r0 = r2.F
            android.widget.ImageButton r1 = r2.e
            r0.remove(r1)
        L2a:
            android.widget.ImageButton r2 = r2.e
            if (r2 == 0) goto L31
            r2.setImageDrawable(r3)
        L31:
            return
    }

    public void setNavigationOnClickListener(android.view.View.OnClickListener r1) {
            r0 = this;
            r0.p()
            android.widget.ImageButton r0 = r0.e
            r0.setOnClickListener(r1)
            return
    }

    public void setOnMenuItemClickListener(android.support.v7.widget.Toolbar.f r1) {
            r0 = this;
            r0.H = r1
            return
    }

    public void setOverflowIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.n()
            android.support.v7.widget.ActionMenuView r0 = r0.f819b
            r0.setOverflowIcon(r1)
            return
    }

    public void setPopupTheme(int r3) {
            r2 = this;
            int r0 = r2.l
            if (r0 == r3) goto L1a
            r2.l = r3
            if (r3 != 0) goto Lf
            android.content.Context r3 = r2.getContext()
            r2.k = r3
            goto L1a
        Lf:
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            r2.k = r0
        L1a:
            return
    }

    public void setSubtitle(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            java.lang.CharSequence r2 = r0.getText(r2)
            r1.setSubtitle(r2)
            return
    }

    public void setSubtitle(java.lang.CharSequence r4) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L40
            android.widget.TextView r0 = r3.d
            if (r0 != 0) goto L31
            android.content.Context r0 = r3.getContext()
            android.support.v7.widget.y r1 = new android.support.v7.widget.y
            r1.<init>(r0)
            r3.d = r1
            r1.setSingleLine()
            android.widget.TextView r1 = r3.d
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            r1.setEllipsize(r2)
            int r1 = r3.n
            if (r1 == 0) goto L28
            android.widget.TextView r2 = r3.d
            r2.setTextAppearance(r0, r1)
        L28:
            int r0 = r3.B
            if (r0 == 0) goto L31
            android.widget.TextView r1 = r3.d
            r1.setTextColor(r0)
        L31:
            android.widget.TextView r0 = r3.d
            boolean r0 = r3.c(r0)
            if (r0 != 0) goto L56
            android.widget.TextView r0 = r3.d
            r1 = 1
            r3.a(r0, r1)
            goto L56
        L40:
            android.widget.TextView r0 = r3.d
            if (r0 == 0) goto L56
            boolean r0 = r3.c(r0)
            if (r0 == 0) goto L56
            android.widget.TextView r0 = r3.d
            r3.removeView(r0)
            java.util.ArrayList<android.view.View> r0 = r3.F
            android.widget.TextView r1 = r3.d
            r0.remove(r1)
        L56:
            android.widget.TextView r0 = r3.d
            if (r0 == 0) goto L5d
            r0.setText(r4)
        L5d:
            r3.z = r4
            return
    }

    public void setSubtitleTextColor(int r1) {
            r0 = this;
            r0.B = r1
            android.widget.TextView r0 = r0.d
            if (r0 == 0) goto L9
            r0.setTextColor(r1)
        L9:
            return
    }

    public void setTitle(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            java.lang.CharSequence r2 = r0.getText(r2)
            r1.setTitle(r2)
            return
    }

    public void setTitle(java.lang.CharSequence r4) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L40
            android.widget.TextView r0 = r3.f820c
            if (r0 != 0) goto L31
            android.content.Context r0 = r3.getContext()
            android.support.v7.widget.y r1 = new android.support.v7.widget.y
            r1.<init>(r0)
            r3.f820c = r1
            r1.setSingleLine()
            android.widget.TextView r1 = r3.f820c
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            r1.setEllipsize(r2)
            int r1 = r3.m
            if (r1 == 0) goto L28
            android.widget.TextView r2 = r3.f820c
            r2.setTextAppearance(r0, r1)
        L28:
            int r0 = r3.A
            if (r0 == 0) goto L31
            android.widget.TextView r1 = r3.f820c
            r1.setTextColor(r0)
        L31:
            android.widget.TextView r0 = r3.f820c
            boolean r0 = r3.c(r0)
            if (r0 != 0) goto L56
            android.widget.TextView r0 = r3.f820c
            r1 = 1
            r3.a(r0, r1)
            goto L56
        L40:
            android.widget.TextView r0 = r3.f820c
            if (r0 == 0) goto L56
            boolean r0 = r3.c(r0)
            if (r0 == 0) goto L56
            android.widget.TextView r0 = r3.f820c
            r3.removeView(r0)
            java.util.ArrayList<android.view.View> r0 = r3.F
            android.widget.TextView r1 = r3.f820c
            r0.remove(r1)
        L56:
            android.widget.TextView r0 = r3.f820c
            if (r0 == 0) goto L5d
            r0.setText(r4)
        L5d:
            r3.y = r4
            return
    }

    public void setTitleMarginBottom(int r1) {
            r0 = this;
            r0.t = r1
            r0.requestLayout()
            return
    }

    public void setTitleMarginEnd(int r1) {
            r0 = this;
            r0.r = r1
            r0.requestLayout()
            return
    }

    public void setTitleMarginStart(int r1) {
            r0 = this;
            r0.q = r1
            r0.requestLayout()
            return
    }

    public void setTitleMarginTop(int r1) {
            r0 = this;
            r0.s = r1
            r0.requestLayout()
            return
    }

    public void setTitleTextColor(int r1) {
            r0 = this;
            r0.A = r1
            android.widget.TextView r0 = r0.f820c
            if (r0 == 0) goto L9
            r0.setTextColor(r1)
        L9:
            return
    }
}
