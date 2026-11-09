package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
public class q0 extends android.content.ContextWrapper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.lang.Object f907c = null;
    private static java.util.ArrayList<java.lang.ref.WeakReference<android.support.v7.widget.q0>> d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.res.Resources f908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.res.Resources.Theme f909b;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            android.support.v7.widget.q0.f907c = r0
            return
    }

    private q0(android.content.Context r3) {
            r2 = this;
            r2.<init>(r3)
            boolean r0 = android.support.v7.widget.y0.b()
            if (r0 == 0) goto L22
            android.support.v7.widget.y0 r0 = new android.support.v7.widget.y0
            android.content.res.Resources r1 = r3.getResources()
            r0.<init>(r2, r1)
            r2.f908a = r0
            android.content.res.Resources$Theme r0 = r0.newTheme()
            r2.f909b = r0
            android.content.res.Resources$Theme r2 = r3.getTheme()
            r0.setTo(r2)
            goto L30
        L22:
            android.support.v7.widget.s0 r0 = new android.support.v7.widget.s0
            android.content.res.Resources r3 = r3.getResources()
            r0.<init>(r2, r3)
            r2.f908a = r0
            r3 = 0
            r2.f909b = r3
        L30:
            return
    }

    private static boolean a(android.content.Context r2) {
            boolean r0 = r2 instanceof android.support.v7.widget.q0
            r1 = 0
            if (r0 != 0) goto L23
            android.content.res.Resources r0 = r2.getResources()
            boolean r0 = r0 instanceof android.support.v7.widget.s0
            if (r0 != 0) goto L23
            android.content.res.Resources r2 = r2.getResources()
            boolean r2 = r2 instanceof android.support.v7.widget.y0
            if (r2 == 0) goto L16
            goto L23
        L16:
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r2 < r0) goto L22
            boolean r2 = android.support.v7.widget.y0.b()
            if (r2 == 0) goto L23
        L22:
            r1 = 1
        L23:
            return r1
    }

    public static android.content.Context b(android.content.Context r4) {
            boolean r0 = a(r4)
            if (r0 == 0) goto L74
            java.lang.Object r0 = android.support.v7.widget.q0.f907c
            monitor-enter(r0)
            java.util.ArrayList<java.lang.ref.WeakReference<android.support.v7.widget.q0>> r1 = android.support.v7.widget.q0.d     // Catch: java.lang.Throwable -> L71
            if (r1 != 0) goto L15
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L71
            r1.<init>()     // Catch: java.lang.Throwable -> L71
            android.support.v7.widget.q0.d = r1     // Catch: java.lang.Throwable -> L71
            goto L60
        L15:
            java.util.ArrayList<java.lang.ref.WeakReference<android.support.v7.widget.q0>> r1 = android.support.v7.widget.q0.d     // Catch: java.lang.Throwable -> L71
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L71
            int r1 = r1 + (-1)
        L1d:
            if (r1 < 0) goto L37
            java.util.ArrayList<java.lang.ref.WeakReference<android.support.v7.widget.q0>> r2 = android.support.v7.widget.q0.d     // Catch: java.lang.Throwable -> L71
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: java.lang.Throwable -> L71
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L71
            if (r2 != 0) goto L34
        L2f:
            java.util.ArrayList<java.lang.ref.WeakReference<android.support.v7.widget.q0>> r2 = android.support.v7.widget.q0.d     // Catch: java.lang.Throwable -> L71
            r2.remove(r1)     // Catch: java.lang.Throwable -> L71
        L34:
            int r1 = r1 + (-1)
            goto L1d
        L37:
            java.util.ArrayList<java.lang.ref.WeakReference<android.support.v7.widget.q0>> r1 = android.support.v7.widget.q0.d     // Catch: java.lang.Throwable -> L71
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L71
            int r1 = r1 + (-1)
        L3f:
            if (r1 < 0) goto L60
            java.util.ArrayList<java.lang.ref.WeakReference<android.support.v7.widget.q0>> r2 = android.support.v7.widget.q0.d     // Catch: java.lang.Throwable -> L71
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: java.lang.Throwable -> L71
            if (r2 == 0) goto L52
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L71
            android.support.v7.widget.q0 r2 = (android.support.v7.widget.q0) r2     // Catch: java.lang.Throwable -> L71
            goto L53
        L52:
            r2 = 0
        L53:
            if (r2 == 0) goto L5d
            android.content.Context r3 = r2.getBaseContext()     // Catch: java.lang.Throwable -> L71
            if (r3 != r4) goto L5d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L71
            return r2
        L5d:
            int r1 = r1 + (-1)
            goto L3f
        L60:
            android.support.v7.widget.q0 r1 = new android.support.v7.widget.q0     // Catch: java.lang.Throwable -> L71
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L71
            java.util.ArrayList<java.lang.ref.WeakReference<android.support.v7.widget.q0>> r4 = android.support.v7.widget.q0.d     // Catch: java.lang.Throwable -> L71
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L71
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L71
            r4.add(r2)     // Catch: java.lang.Throwable -> L71
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L71
            return r1
        L71:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L71
            throw r4
        L74:
            return r4
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.AssetManager getAssets() {
            r0 = this;
            android.content.res.Resources r0 = r0.f908a
            android.content.res.AssetManager r0 = r0.getAssets()
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
            r0 = this;
            android.content.res.Resources r0 = r0.f908a
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources.Theme getTheme() {
            r1 = this;
            android.content.res.Resources$Theme r0 = r1.f909b
            if (r0 != 0) goto L8
            android.content.res.Resources$Theme r0 = super.getTheme()
        L8:
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int r2) {
            r1 = this;
            android.content.res.Resources$Theme r0 = r1.f909b
            if (r0 != 0) goto L8
            super.setTheme(r2)
            goto Lc
        L8:
            r1 = 1
            r0.applyStyle(r2, r1)
        Lc:
            return
    }
}
