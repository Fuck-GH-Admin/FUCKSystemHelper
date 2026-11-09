package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
class b extends android.graphics.drawable.Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final android.support.v7.widget.ActionBarContainer f834a;

    public b(android.support.v7.widget.ActionBarContainer r1) {
            r0 = this;
            r0.<init>()
            r0.f834a = r1
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r3) {
            r2 = this;
            android.support.v7.widget.ActionBarContainer r0 = r2.f834a
            boolean r1 = r0.i
            if (r1 == 0) goto Le
            android.graphics.drawable.Drawable r2 = r0.h
            if (r2 == 0) goto L22
            r2.draw(r3)
            goto L22
        Le:
            android.graphics.drawable.Drawable r0 = r0.f
            if (r0 == 0) goto L15
            r0.draw(r3)
        L15:
            android.support.v7.widget.ActionBarContainer r2 = r2.f834a
            android.graphics.drawable.Drawable r0 = r2.g
            if (r0 == 0) goto L22
            boolean r2 = r2.j
            if (r2 == 0) goto L22
            r0.draw(r3)
        L22:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline r2) {
            r1 = this;
            android.support.v7.widget.ActionBarContainer r1 = r1.f834a
            boolean r0 = r1.i
            if (r0 == 0) goto Lb
            android.graphics.drawable.Drawable r1 = r1.h
            if (r1 == 0) goto L12
            goto Lf
        Lb:
            android.graphics.drawable.Drawable r1 = r1.f
            if (r1 == 0) goto L12
        Lf:
            r1.getOutline(r2)
        L12:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r1) {
            r0 = this;
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r1) {
            r0 = this;
            return
    }
}
