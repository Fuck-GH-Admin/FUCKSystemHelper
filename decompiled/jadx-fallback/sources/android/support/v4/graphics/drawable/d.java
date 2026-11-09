package android.support.v4.graphics.drawable;

/* JADX INFO: loaded from: classes.dex */
class d extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback, android.support.v4.graphics.drawable.c, android.support.v4.graphics.drawable.b {
    static final android.graphics.PorterDuff.Mode h = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.graphics.PorterDuff.Mode f631c;
    private boolean d;
    android.support.v4.graphics.drawable.d.a e;
    private boolean f;
    android.graphics.drawable.Drawable g;

    protected static abstract class a extends android.graphics.drawable.Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f632a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        android.graphics.drawable.Drawable.ConstantState f633b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        android.content.res.ColorStateList f634c;
        android.graphics.PorterDuff.Mode d;

        a(android.support.v4.graphics.drawable.d.a r1, android.content.res.Resources r2) {
                r0 = this;
                r0.<init>()
                r2 = 0
                r0.f634c = r2
                android.graphics.PorterDuff$Mode r2 = android.support.v4.graphics.drawable.d.h
                r0.d = r2
                if (r1 == 0) goto L1c
                int r2 = r1.f632a
                r0.f632a = r2
                android.graphics.drawable.Drawable$ConstantState r2 = r1.f633b
                r0.f633b = r2
                android.content.res.ColorStateList r2 = r1.f634c
                r0.f634c = r2
                android.graphics.PorterDuff$Mode r1 = r1.d
                r0.d = r1
            L1c:
                return
        }

        boolean a() {
                r0 = this;
                android.graphics.drawable.Drawable$ConstantState r0 = r0.f633b
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
                r1 = this;
                int r0 = r1.f632a
                android.graphics.drawable.Drawable$ConstantState r1 = r1.f633b
                if (r1 == 0) goto Lb
                int r1 = r1.getChangingConfigurations()
                goto Lc
            Lb:
                r1 = 0
            Lc:
                r1 = r1 | r0
                return r1
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
                r1 = this;
                r0 = 0
                android.graphics.drawable.Drawable r1 = r1.newDrawable(r0)
                return r1
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public abstract android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r1);
    }

    private static class b extends android.support.v4.graphics.drawable.d.a {
        b(android.support.v4.graphics.drawable.d.a r1, android.content.res.Resources r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // android.support.v4.graphics.drawable.d.a, android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r2) {
                r1 = this;
                android.support.v4.graphics.drawable.d r0 = new android.support.v4.graphics.drawable.d
                r0.<init>(r1, r2)
                return r0
        }
    }

    static {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            android.support.v4.graphics.drawable.d.h = r0
            return
    }

    d(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r1.<init>()
            android.support.v4.graphics.drawable.d$a r0 = r1.c()
            r1.e = r0
            r1.a(r2)
            return
    }

    d(android.support.v4.graphics.drawable.d.a r1, android.content.res.Resources r2) {
            r0 = this;
            r0.<init>()
            r0.e = r1
            r0.a(r2)
            return
    }

    private void a(android.content.res.Resources r2) {
            r1 = this;
            android.support.v4.graphics.drawable.d$a r0 = r1.e
            if (r0 == 0) goto Lf
            android.graphics.drawable.Drawable$ConstantState r0 = r0.f633b
            if (r0 == 0) goto Lf
            android.graphics.drawable.Drawable r2 = r0.newDrawable(r2)
            r1.a(r2)
        Lf:
            return
    }

    private boolean a(int[] r5) {
            r4 = this;
            boolean r0 = r4.b()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            android.support.v4.graphics.drawable.d$a r0 = r4.e
            android.content.res.ColorStateList r2 = r0.f634c
            android.graphics.PorterDuff$Mode r0 = r0.d
            if (r2 == 0) goto L31
            if (r0 == 0) goto L31
            int r3 = r2.getDefaultColor()
            int r5 = r2.getColorForState(r5, r3)
            boolean r2 = r4.d
            if (r2 == 0) goto L26
            int r2 = r4.f630b
            if (r5 != r2) goto L26
            android.graphics.PorterDuff$Mode r2 = r4.f631c
            if (r0 == r2) goto L36
        L26:
            r4.setColorFilter(r5, r0)
            r4.f630b = r5
            r4.f631c = r0
            r5 = 1
            r4.d = r5
            return r5
        L31:
            r4.d = r1
            r4.clearColorFilter()
        L36:
            return r1
    }

    @Override // android.support.v4.graphics.drawable.c
    public final android.graphics.drawable.Drawable a() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.g
            return r0
    }

    @Override // android.support.v4.graphics.drawable.c
    public final void a(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.g
            if (r0 == 0) goto L8
            r1 = 0
            r0.setCallback(r1)
        L8:
            r2.g = r3
            if (r3 == 0) goto L36
            r3.setCallback(r2)
            boolean r0 = r3.isVisible()
            r1 = 1
            r2.setVisible(r0, r1)
            int[] r0 = r3.getState()
            r2.setState(r0)
            int r0 = r3.getLevel()
            r2.setLevel(r0)
            android.graphics.Rect r0 = r3.getBounds()
            r2.setBounds(r0)
            android.support.v4.graphics.drawable.d$a r0 = r2.e
            if (r0 == 0) goto L36
            android.graphics.drawable.Drawable$ConstantState r3 = r3.getConstantState()
            r0.f633b = r3
        L36:
            r2.invalidateSelf()
            return
    }

    protected boolean b() {
            r0 = this;
            r0 = 1
            return r0
    }

    android.support.v4.graphics.drawable.d.a c() {
            r2 = this;
            android.support.v4.graphics.drawable.d$b r0 = new android.support.v4.graphics.drawable.d$b
            android.support.v4.graphics.drawable.d$a r2 = r2.e
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.g
            r0.draw(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
            r2 = this;
            int r0 = super.getChangingConfigurations()
            android.support.v4.graphics.drawable.d$a r1 = r2.e
            if (r1 == 0) goto Ld
            int r1 = r1.getChangingConfigurations()
            goto Le
        Ld:
            r1 = 0
        Le:
            r0 = r0 | r1
            android.graphics.drawable.Drawable r2 = r2.g
            int r2 = r2.getChangingConfigurations()
            r2 = r2 | r0
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable.ConstantState getConstantState() {
            r2 = this;
            android.support.v4.graphics.drawable.d$a r0 = r2.e
            if (r0 == 0) goto L15
            boolean r0 = r0.a()
            if (r0 == 0) goto L15
            android.support.v4.graphics.drawable.d$a r0 = r2.e
            int r1 = r2.getChangingConfigurations()
            r0.f632a = r1
            android.support.v4.graphics.drawable.d$a r2 = r2.e
            return r2
        L15:
            r2 = 0
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable getCurrent() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.g
            android.graphics.drawable.Drawable r0 = r0.getCurrent()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.g
            int r0 = r0.getIntrinsicHeight()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.g
            int r0 = r0.getIntrinsicWidth()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.g
            int r0 = r0.getMinimumHeight()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.g
            int r0 = r0.getMinimumWidth()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.g
            int r0 = r0.getOpacity()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(android.graphics.Rect r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.g
            boolean r0 = r0.getPadding(r1)
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.g
            int[] r0 = r0.getState()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.Region getTransparentRegion() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.g
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
            android.graphics.drawable.Drawable r0 = r0.g
            boolean r0 = r0.isAutoMirrored()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            boolean r0 = r1.b()
            if (r0 == 0) goto Ld
            android.support.v4.graphics.drawable.d$a r0 = r1.e
            if (r0 == 0) goto Ld
            android.content.res.ColorStateList r0 = r0.f634c
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L16
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L1e
        L16:
            android.graphics.drawable.Drawable r1 = r1.g
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L20
        L1e:
            r1 = 1
            goto L21
        L20:
            r1 = 0
        L21:
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.g
            r0.jumpToCurrentState()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
            r2 = this;
            boolean r0 = r2.f
            if (r0 != 0) goto L2a
            android.graphics.drawable.Drawable r0 = super.mutate()
            if (r0 != r2) goto L2a
            android.support.v4.graphics.drawable.d$a r0 = r2.c()
            r2.e = r0
            android.graphics.drawable.Drawable r0 = r2.g
            if (r0 == 0) goto L17
            r0.mutate()
        L17:
            android.support.v4.graphics.drawable.d$a r0 = r2.e
            if (r0 == 0) goto L27
            android.graphics.drawable.Drawable r1 = r2.g
            if (r1 == 0) goto L24
            android.graphics.drawable.Drawable$ConstantState r1 = r1.getConstantState()
            goto L25
        L24:
            r1 = 0
        L25:
            r0.f633b = r1
        L27:
            r0 = 1
            r2.f = r0
        L2a:
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.g
            if (r0 == 0) goto L7
            r0.setBounds(r1)
        L7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.g
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
            android.graphics.drawable.Drawable r0 = r0.g
            r0.setAlpha(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.g
            r0.setAutoMirrored(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.g
            r0.setChangingConfigurations(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.g
            r0.setColorFilter(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.g
            r0.setDither(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.g
            r0.setFilterBitmap(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.g
            boolean r0 = r0.setState(r2)
            boolean r1 = r1.a(r2)
            if (r1 != 0) goto L11
            if (r0 == 0) goto Lf
            goto L11
        Lf:
            r1 = 0
            goto L12
        L11:
            r1 = 1
        L12:
            return r1
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.b
    public void setTint(int r1) {
            r0 = this;
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setTintList(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.b
    public void setTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            android.support.v4.graphics.drawable.d$a r0 = r1.e
            r0.f634c = r2
            int[] r2 = r1.getState()
            r1.a(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.b
    public void setTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            android.support.v4.graphics.drawable.d$a r0 = r1.e
            r0.d = r2
            int[] r2 = r1.getState()
            r1.a(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean r2, boolean r3) {
            r1 = this;
            boolean r0 = super.setVisible(r2, r3)
            if (r0 != 0) goto L11
            android.graphics.drawable.Drawable r1 = r1.g
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
