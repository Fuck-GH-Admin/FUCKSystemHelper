package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
class q extends android.widget.PopupWindow {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f905b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f906a;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 >= r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            android.support.v7.widget.q.f905b = r0
            return
    }

    public q(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r0.a(r1, r2, r3, r4)
            return
    }

    private void a(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5) {
            r1 = this;
            int[] r0 = b.b.d.a.j.PopupWindow
            android.support.v7.widget.t0 r2 = android.support.v7.widget.t0.a(r2, r3, r0, r4, r5)
            int r3 = b.b.d.a.j.PopupWindow_overlapAnchor
            boolean r3 = r2.g(r3)
            if (r3 == 0) goto L18
            int r3 = b.b.d.a.j.PopupWindow_overlapAnchor
            r4 = 0
            boolean r3 = r2.a(r3, r4)
            r1.a(r3)
        L18:
            int r3 = b.b.d.a.j.PopupWindow_android_popupBackground
            android.graphics.drawable.Drawable r3 = r2.b(r3)
            r1.setBackgroundDrawable(r3)
            r2.a()
            return
    }

    private void a(boolean r2) {
            r1 = this;
            boolean r0 = android.support.v7.widget.q.f905b
            if (r0 == 0) goto L7
            r1.f906a = r2
            goto La
        L7:
            android.support.v4.widget.j.a(r1, r2)
        La:
            return
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(android.view.View r2, int r3, int r4) {
            r1 = this;
            boolean r0 = android.support.v7.widget.q.f905b
            if (r0 == 0) goto Ld
            boolean r0 = r1.f906a
            if (r0 == 0) goto Ld
            int r0 = r2.getHeight()
            int r4 = r4 - r0
        Ld:
            super.showAsDropDown(r2, r3, r4)
            return
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(android.view.View r2, int r3, int r4, int r5) {
            r1 = this;
            boolean r0 = android.support.v7.widget.q.f905b
            if (r0 == 0) goto Ld
            boolean r0 = r1.f906a
            if (r0 == 0) goto Ld
            int r0 = r2.getHeight()
            int r4 = r4 - r0
        Ld:
            super.showAsDropDown(r2, r3, r4, r5)
            return
    }

    @Override // android.widget.PopupWindow
    public void update(android.view.View r7, int r8, int r9, int r10, int r11) {
            r6 = this;
            boolean r0 = android.support.v7.widget.q.f905b
            if (r0 == 0) goto Ld
            boolean r0 = r6.f906a
            if (r0 == 0) goto Ld
            int r0 = r7.getHeight()
            int r9 = r9 - r0
        Ld:
            r3 = r9
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r10
            r5 = r11
            super.update(r1, r2, r3, r4, r5)
            return
    }
}
