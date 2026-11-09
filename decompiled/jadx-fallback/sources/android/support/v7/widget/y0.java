package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
public class y0 extends android.content.res.Resources {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f954b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.ref.WeakReference<android.content.Context> f955a;

    static {
            return
    }

    public y0(android.content.Context r3, android.content.res.Resources r4) {
            r2 = this;
            android.content.res.AssetManager r0 = r4.getAssets()
            android.util.DisplayMetrics r1 = r4.getDisplayMetrics()
            android.content.res.Configuration r4 = r4.getConfiguration()
            r2.<init>(r0, r1, r4)
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r3)
            r2.f955a = r4
            return
    }

    public static boolean a() {
            boolean r0 = android.support.v7.widget.y0.f954b
            return r0
    }

    public static boolean b() {
            boolean r0 = a()
            if (r0 == 0) goto Le
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 20
            if (r0 > r1) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    final android.graphics.drawable.Drawable a(int r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = super.getDrawable(r1)
            return r0
    }

    @Override // android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawable(int r3) {
            r2 = this;
            java.lang.ref.WeakReference<android.content.Context> r0 = r2.f955a
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            if (r0 == 0) goto L13
            android.support.v7.widget.j r1 = android.support.v7.widget.j.a()
            android.graphics.drawable.Drawable r2 = r1.a(r0, r2, r3)
            return r2
        L13:
            android.graphics.drawable.Drawable r2 = super.getDrawable(r3)
            return r2
    }
}
