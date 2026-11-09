package b.b.c.g;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f1135a;

    private y(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.f1135a = r1
            return
    }

    static b.b.c.g.y a(java.lang.Object r1) {
            if (r1 != 0) goto L4
            r1 = 0
            goto La
        L4:
            b.b.c.g.y r0 = new b.b.c.g.y
            r0.<init>(r1)
            r1 = r0
        La:
            return r1
    }

    static java.lang.Object a(b.b.c.g.y r0) {
            if (r0 != 0) goto L4
            r0 = 0
            goto L6
        L4:
            java.lang.Object r0 = r0.f1135a
        L6:
            return r0
    }

    public int a() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 20
            if (r0 < r1) goto Lf
            java.lang.Object r2 = r2.f1135a
            android.view.WindowInsets r2 = (android.view.WindowInsets) r2
            int r2 = r2.getSystemWindowInsetBottom()
            return r2
        Lf:
            r2 = 0
            return r2
    }

    public b.b.c.g.y a(int r3, int r4, int r5, int r6) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 20
            if (r0 < r1) goto L14
            b.b.c.g.y r0 = new b.b.c.g.y
            java.lang.Object r2 = r2.f1135a
            android.view.WindowInsets r2 = (android.view.WindowInsets) r2
            android.view.WindowInsets r2 = r2.replaceSystemWindowInsets(r3, r4, r5, r6)
            r0.<init>(r2)
            return r0
        L14:
            r2 = 0
            return r2
    }

    public int b() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 20
            if (r0 < r1) goto Lf
            java.lang.Object r2 = r2.f1135a
            android.view.WindowInsets r2 = (android.view.WindowInsets) r2
            int r2 = r2.getSystemWindowInsetLeft()
            return r2
        Lf:
            r2 = 0
            return r2
    }

    public int c() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 20
            if (r0 < r1) goto Lf
            java.lang.Object r2 = r2.f1135a
            android.view.WindowInsets r2 = (android.view.WindowInsets) r2
            int r2 = r2.getSystemWindowInsetRight()
            return r2
        Lf:
            r2 = 0
            return r2
    }

    public int d() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 20
            if (r0 < r1) goto Lf
            java.lang.Object r2 = r2.f1135a
            android.view.WindowInsets r2 = (android.view.WindowInsets) r2
            int r2 = r2.getSystemWindowInsetTop()
            return r2
        Lf:
            r2 = 0
            return r2
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L24
            java.lang.Class<b.b.c.g.y> r2 = b.b.c.g.y.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L24
        L10:
            b.b.c.g.y r5 = (b.b.c.g.y) r5
            java.lang.Object r4 = r4.f1135a
            if (r4 != 0) goto L1d
            java.lang.Object r4 = r5.f1135a
            if (r4 != 0) goto L1b
            goto L23
        L1b:
            r0 = r1
            goto L23
        L1d:
            java.lang.Object r5 = r5.f1135a
            boolean r0 = r4.equals(r5)
        L23:
            return r0
        L24:
            return r1
    }

    public int hashCode() {
            r0 = this;
            java.lang.Object r0 = r0.f1135a
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            return r0
    }
}
