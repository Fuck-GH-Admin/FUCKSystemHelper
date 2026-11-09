package android.support.v4.app;

/* JADX INFO: loaded from: classes.dex */
class u implements android.view.ViewTreeObserver.OnPreDrawListener, android.view.View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.view.View f619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.view.ViewTreeObserver f620c;
    private final java.lang.Runnable d;

    private u(android.view.View r1, java.lang.Runnable r2) {
            r0 = this;
            r0.<init>()
            r0.f619b = r1
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            r0.f620c = r1
            r0.d = r2
            return
    }

    public static android.support.v4.app.u a(android.view.View r1, java.lang.Runnable r2) {
            android.support.v4.app.u r0 = new android.support.v4.app.u
            r0.<init>(r1, r2)
            android.view.ViewTreeObserver r2 = r1.getViewTreeObserver()
            r2.addOnPreDrawListener(r0)
            r1.addOnAttachStateChangeListener(r0)
            return r0
    }

    public void a() {
            r1 = this;
            android.view.ViewTreeObserver r0 = r1.f620c
            boolean r0 = r0.isAlive()
            if (r0 == 0) goto Lb
            android.view.ViewTreeObserver r0 = r1.f620c
            goto L11
        Lb:
            android.view.View r0 = r1.f619b
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
        L11:
            r0.removeOnPreDrawListener(r1)
            android.view.View r0 = r1.f619b
            r0.removeOnAttachStateChangeListener(r1)
            return
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
            r0 = this;
            r0.a()
            java.lang.Runnable r0 = r0.d
            r0.run()
            r0 = 1
            return r0
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View r1) {
            r0 = this;
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            r0.f620c = r1
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View r1) {
            r0 = this;
            r0.a()
            return
    }
}
