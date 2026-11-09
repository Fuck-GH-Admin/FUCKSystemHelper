package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
class s0 extends android.support.v7.widget.k0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.ref.WeakReference<android.content.Context> f918b;

    public s0(android.content.Context r1, android.content.res.Resources r2) {
            r0 = this;
            r0.<init>(r2)
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            r0.f918b = r2
            return
    }

    @Override // android.support.v7.widget.k0, android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawable(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = super.getDrawable(r2)
            java.lang.ref.WeakReference<android.content.Context> r1 = r1.f918b
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            if (r0 == 0) goto L16
            if (r1 == 0) goto L16
            android.support.v7.widget.j.a()
            android.support.v7.widget.j.a(r1, r2, r0)
        L16:
            return r0
    }
}
