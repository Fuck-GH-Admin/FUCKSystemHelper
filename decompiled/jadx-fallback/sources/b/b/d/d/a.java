package b.b.d.d;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.content.Context f1158a;

    private a(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.f1158a = r1
            return
    }

    public static b.b.d.d.a a(android.content.Context r1) {
            b.b.d.d.a r0 = new b.b.d.d.a
            r0.<init>(r1)
            return r0
    }

    public boolean a() {
            r1 = this;
            android.content.Context r1 = r1.f1158a
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo()
            int r1 = r1.targetSdkVersion
            r0 = 14
            if (r1 >= r0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    public int b() {
            r0 = this;
            android.content.Context r0 = r0.f1158a
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            int r0 = r0 / 2
            return r0
    }

    public int c() {
            r3 = this;
            android.content.Context r3 = r3.f1158a
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r0 = r3.screenWidthDp
            int r1 = r3.screenHeightDp
            int r3 = r3.smallestScreenWidthDp
            r2 = 600(0x258, float:8.41E-43)
            if (r3 > r2) goto L3e
            if (r0 > r2) goto L3e
            r3 = 720(0x2d0, float:1.009E-42)
            r2 = 960(0x3c0, float:1.345E-42)
            if (r0 <= r2) goto L1e
            if (r1 > r3) goto L3e
        L1e:
            if (r0 <= r3) goto L23
            if (r1 <= r2) goto L23
            goto L3e
        L23:
            r3 = 500(0x1f4, float:7.0E-43)
            if (r0 >= r3) goto L3c
            r3 = 480(0x1e0, float:6.73E-43)
            r2 = 640(0x280, float:8.97E-43)
            if (r0 <= r2) goto L2f
            if (r1 > r3) goto L3c
        L2f:
            if (r0 <= r3) goto L34
            if (r1 <= r2) goto L34
            goto L3c
        L34:
            r3 = 360(0x168, float:5.04E-43)
            if (r0 < r3) goto L3a
            r3 = 3
            return r3
        L3a:
            r3 = 2
            return r3
        L3c:
            r3 = 4
            return r3
        L3e:
            r3 = 5
            return r3
    }

    public int d() {
            r1 = this;
            android.content.Context r1 = r1.f1158a
            android.content.res.Resources r1 = r1.getResources()
            int r0 = b.b.d.a.d.abc_action_bar_stacked_tab_max_width
            int r1 = r1.getDimensionPixelSize(r0)
            return r1
    }

    public int e() {
            r5 = this;
            android.content.Context r0 = r5.f1158a
            int[] r1 = b.b.d.a.j.ActionBar
            int r2 = b.b.d.a.a.actionBarStyle
            r3 = 0
            r4 = 0
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r4, r1, r2, r3)
            int r1 = b.b.d.a.j.ActionBar_height
            int r1 = r0.getLayoutDimension(r1, r3)
            android.content.Context r2 = r5.f1158a
            android.content.res.Resources r2 = r2.getResources()
            boolean r5 = r5.f()
            if (r5 != 0) goto L28
            int r5 = b.b.d.a.d.abc_action_bar_stacked_max_height
            int r5 = r2.getDimensionPixelSize(r5)
            int r1 = java.lang.Math.min(r1, r5)
        L28:
            r0.recycle()
            return r1
    }

    public boolean f() {
            r1 = this;
            android.content.Context r1 = r1.f1158a
            android.content.res.Resources r1 = r1.getResources()
            int r0 = b.b.d.a.b.abc_action_bar_embed_tabs
            boolean r1 = r1.getBoolean(r0)
            return r1
    }

    public boolean g() {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 19
            if (r0 < r2) goto L8
            return r1
        L8:
            android.content.Context r3 = r3.f1158a
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            boolean r3 = r3.hasPermanentMenuKey()
            r3 = r3 ^ r1
            return r3
    }
}
