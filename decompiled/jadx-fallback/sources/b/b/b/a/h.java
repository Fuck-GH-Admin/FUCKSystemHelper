package b.b.b.a;

/* JADX INFO: loaded from: classes.dex */
abstract class h extends android.graphics.drawable.Drawable implements android.support.v4.graphics.drawable.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    android.graphics.drawable.Drawable f991b;

    h() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(android.content.res.Resources.Theme r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f991b
            if (r0 == 0) goto L7
            android.support.v4.graphics.drawable.a.a(r0, r1)
        L7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f991b
            if (r0 == 0) goto L8
            r0.clearColorFilter()
            return
        L8:
            super.clearColorFilter()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.ColorFilter getColorFilter() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f991b
            if (r0 == 0) goto L9
            android.graphics.ColorFilter r0 = android.support.v4.graphics.drawable.a.c(r0)
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable getCurrent() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f991b
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r1 = r0.getCurrent()
            return r1
        L9:
            android.graphics.drawable.Drawable r1 = super.getCurrent()
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f991b
            if (r0 == 0) goto L9
            int r1 = r0.getMinimumHeight()
            return r1
        L9:
            int r1 = super.getMinimumHeight()
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f991b
            if (r0 == 0) goto L9
            int r1 = r0.getMinimumWidth()
            return r1
        L9:
            int r1 = super.getMinimumWidth()
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f991b
            if (r0 == 0) goto L9
            boolean r1 = r0.getPadding(r2)
            return r1
        L9:
            boolean r1 = super.getPadding(r2)
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f991b
            if (r0 == 0) goto L9
            int[] r1 = r0.getState()
            return r1
        L9:
            int[] r1 = super.getState()
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.Region getTransparentRegion() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f991b
            if (r0 == 0) goto L9
            android.graphics.Region r1 = r0.getTransparentRegion()
            return r1
        L9:
            android.graphics.Region r1 = super.getTransparentRegion()
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f991b
            if (r0 == 0) goto L7
            android.support.v4.graphics.drawable.a.f(r0)
        L7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f991b
            if (r0 == 0) goto L9
            boolean r1 = r0.setLevel(r2)
            return r1
        L9:
            boolean r1 = super.onLevelChange(r2)
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f991b
            if (r0 == 0) goto L8
            r0.setChangingConfigurations(r2)
            return
        L8:
            super.setChangingConfigurations(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int r2, android.graphics.PorterDuff.Mode r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f991b
            if (r0 == 0) goto L8
            r0.setColorFilter(r2, r3)
            return
        L8:
            super.setColorFilter(r2, r3)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f991b
            if (r0 == 0) goto L7
            r0.setFilterBitmap(r1)
        L7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float r1, float r2) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f991b
            if (r0 == 0) goto L7
            android.support.v4.graphics.drawable.a.a(r0, r1, r2)
        L7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int r1, int r2, int r3, int r4) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f991b
            if (r0 == 0) goto L7
            android.support.v4.graphics.drawable.a.a(r0, r1, r2, r3, r4)
        L7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f991b
            if (r0 == 0) goto L9
            boolean r1 = r0.setState(r2)
            return r1
        L9:
            boolean r1 = super.setState(r2)
            return r1
    }
}
