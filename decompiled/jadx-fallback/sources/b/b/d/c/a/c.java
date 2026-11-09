package b.b.d.c.a;

/* JADX INFO: loaded from: classes.dex */
public class c extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.graphics.drawable.Drawable f1157b;

    public c(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.<init>()
            r0.a(r1)
            return
    }

    public android.graphics.drawable.Drawable a() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f1157b
            return r0
    }

    public void a(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f1157b
            if (r0 == 0) goto L8
            r1 = 0
            r0.setCallback(r1)
        L8:
            r2.f1157b = r3
            if (r3 == 0) goto Lf
            r3.setCallback(r2)
        Lf:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f1157b
            r0.draw(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f1157b
            int r0 = r0.getChangingConfigurations()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable getCurrent() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f1157b
            android.graphics.drawable.Drawable r0 = r0.getCurrent()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f1157b
            int r0 = r0.getIntrinsicHeight()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f1157b
            int r0 = r0.getIntrinsicWidth()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f1157b
            int r0 = r0.getMinimumHeight()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f1157b
            int r0 = r0.getMinimumWidth()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f1157b
            int r0 = r0.getOpacity()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(android.graphics.Rect r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f1157b
            boolean r0 = r0.getPadding(r1)
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f1157b
            int[] r0 = r0.getState()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.Region getTransparentRegion() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f1157b
            android.graphics.Region r0 = r0.getTransparentRegion()
            return r0
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f1157b
            boolean r0 = android.support.v4.graphics.drawable.a.e(r0)
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f1157b
            boolean r0 = r0.isStateful()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f1157b
            android.support.v4.graphics.drawable.a.f(r0)
            return
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f1157b
            r0.setBounds(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f1157b
            boolean r0 = r0.setLevel(r1)
            return r0
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2, long r3) {
            r0 = this;
            r0.scheduleSelf(r2, r3)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f1157b
            r0.setAlpha(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f1157b
            android.support.v4.graphics.drawable.a.a(r0, r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f1157b
            r0.setChangingConfigurations(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f1157b
            r0.setColorFilter(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f1157b
            r0.setDither(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f1157b
            r0.setFilterBitmap(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float r1, float r2) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f1157b
            android.support.v4.graphics.drawable.a.a(r0, r1, r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int r1, int r2, int r3, int r4) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f1157b
            android.support.v4.graphics.drawable.a.a(r0, r1, r2, r3, r4)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f1157b
            boolean r0 = r0.setState(r1)
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f1157b
            android.support.v4.graphics.drawable.a.b(r0, r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f1157b
            android.support.v4.graphics.drawable.a.a(r0, r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f1157b
            android.support.v4.graphics.drawable.a.a(r0, r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean r2, boolean r3) {
            r1 = this;
            boolean r0 = super.setVisible(r2, r3)
            if (r0 != 0) goto L11
            android.graphics.drawable.Drawable r1 = r1.f1157b
            boolean r1 = r1.setVisible(r2, r3)
            if (r1 == 0) goto Lf
            goto L11
        Lf:
            r1 = 0
            goto L12
        L11:
            r1 = 1
        L12:
            return r1
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2) {
            r0 = this;
            r0.unscheduleSelf(r2)
            return
    }
}
