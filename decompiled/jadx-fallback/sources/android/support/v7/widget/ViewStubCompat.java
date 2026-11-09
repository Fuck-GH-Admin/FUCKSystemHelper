package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
public final class ViewStubCompat extends android.view.View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f828c;
    private java.lang.ref.WeakReference<android.view.View> d;
    private android.view.LayoutInflater e;
    private android.support.v7.widget.ViewStubCompat.a f;

    public interface a {
        void a(android.support.v7.widget.ViewStubCompat r1, android.view.View r2);
    }

    public ViewStubCompat(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public ViewStubCompat(android.content.Context r3, android.util.AttributeSet r4, int r5) {
            r2 = this;
            r2.<init>(r3, r4, r5)
            r0 = 0
            r2.f827b = r0
            int[] r1 = b.b.d.a.j.ViewStubCompat
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r1, r5, r0)
            int r4 = b.b.d.a.j.ViewStubCompat_android_inflatedId
            r5 = -1
            int r4 = r3.getResourceId(r4, r5)
            r2.f828c = r4
            int r4 = b.b.d.a.j.ViewStubCompat_android_layout
            int r4 = r3.getResourceId(r4, r0)
            r2.f827b = r4
            int r4 = b.b.d.a.j.ViewStubCompat_android_id
            int r4 = r3.getResourceId(r4, r5)
            r2.setId(r4)
            r3.recycle()
            r3 = 8
            r2.setVisibility(r3)
            r3 = 1
            r2.setWillNotDraw(r3)
            return
    }

    public android.view.View a() {
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            if (r0 == 0) goto L57
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L57
            int r1 = r4.f827b
            if (r1 == 0) goto L4f
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.LayoutInflater r1 = r4.e
            if (r1 == 0) goto L15
            goto L1d
        L15:
            android.content.Context r1 = r4.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
        L1d:
            int r2 = r4.f827b
            r3 = 0
            android.view.View r1 = r1.inflate(r2, r0, r3)
            int r2 = r4.f828c
            r3 = -1
            if (r2 == r3) goto L2c
            r1.setId(r2)
        L2c:
            int r2 = r0.indexOfChild(r4)
            r0.removeViewInLayout(r4)
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            if (r3 == 0) goto L3d
            r0.addView(r1, r2, r3)
            goto L40
        L3d:
            r0.addView(r1, r2)
        L40:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            r4.d = r0
            android.support.v7.widget.ViewStubCompat$a r0 = r4.f
            if (r0 == 0) goto L4e
            r0.a(r4, r1)
        L4e:
            return r1
        L4f:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "ViewStub must have a valid layoutResource"
            r4.<init>(r0)
            throw r4
        L57:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "ViewStub must have a non-null ViewGroup viewParent"
            r4.<init>(r0)
            throw r4
    }

    @Override // android.view.View
    protected void dispatchDraw(android.graphics.Canvas r1) {
            r0 = this;
            return
    }

    @Override // android.view.View
    @android.annotation.SuppressLint({"MissingSuperCall"})
    public void draw(android.graphics.Canvas r1) {
            r0 = this;
            return
    }

    public int getInflatedId() {
            r0 = this;
            int r0 = r0.f828c
            return r0
    }

    public android.view.LayoutInflater getLayoutInflater() {
            r0 = this;
            android.view.LayoutInflater r0 = r0.e
            return r0
    }

    public int getLayoutResource() {
            r0 = this;
            int r0 = r0.f827b
            return r0
    }

    @Override // android.view.View
    protected void onMeasure(int r1, int r2) {
            r0 = this;
            r1 = 0
            r0.setMeasuredDimension(r1, r1)
            return
    }

    public void setInflatedId(int r1) {
            r0 = this;
            r0.f828c = r1
            return
    }

    public void setLayoutInflater(android.view.LayoutInflater r1) {
            r0 = this;
            r0.e = r1
            return
    }

    public void setLayoutResource(int r1) {
            r0 = this;
            r0.f827b = r1
            return
    }

    public void setOnInflateListener(android.support.v7.widget.ViewStubCompat.a r1) {
            r0 = this;
            r0.f = r1
            return
    }

    @Override // android.view.View
    public void setVisibility(int r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.d
            if (r0 == 0) goto L18
            java.lang.Object r1 = r0.get()
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L10
            r1.setVisibility(r2)
            goto L23
        L10:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "setVisibility called on un-referenced view"
            r1.<init>(r2)
            throw r1
        L18:
            super.setVisibility(r2)
            if (r2 == 0) goto L20
            r0 = 4
            if (r2 != r0) goto L23
        L20:
            r1.a()
        L23:
            return
    }
}
