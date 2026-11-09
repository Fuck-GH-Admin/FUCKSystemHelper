package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
class k0 extends android.content.res.Resources {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.res.Resources f878a;

    public k0(android.content.res.Resources r4) {
            r3 = this;
            android.content.res.AssetManager r0 = r4.getAssets()
            android.util.DisplayMetrics r1 = r4.getDisplayMetrics()
            android.content.res.Configuration r2 = r4.getConfiguration()
            r3.<init>(r0, r1, r2)
            r3.f878a = r4
            return
    }

    @Override // android.content.res.Resources
    public android.content.res.XmlResourceParser getAnimation(int r1) {
            r0 = this;
            android.content.res.Resources r0 = r0.f878a
            android.content.res.XmlResourceParser r0 = r0.getAnimation(r1)
            return r0
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int r1) {
            r0 = this;
            android.content.res.Resources r0 = r0.f878a
            boolean r0 = r0.getBoolean(r1)
            return r0
    }

    @Override // android.content.res.Resources
    public int getColor(int r1) {
            r0 = this;
            android.content.res.Resources r0 = r0.f878a
            int r0 = r0.getColor(r1)
            return r0
    }

    @Override // android.content.res.Resources
    public android.content.res.ColorStateList getColorStateList(int r1) {
            r0 = this;
            android.content.res.Resources r0 = r0.f878a
            android.content.res.ColorStateList r0 = r0.getColorStateList(r1)
            return r0
    }

    @Override // android.content.res.Resources
    public android.content.res.Configuration getConfiguration() {
            r0 = this;
            android.content.res.Resources r0 = r0.f878a
            android.content.res.Configuration r0 = r0.getConfiguration()
            return r0
    }

    @Override // android.content.res.Resources
    public float getDimension(int r1) {
            r0 = this;
            android.content.res.Resources r0 = r0.f878a
            float r0 = r0.getDimension(r1)
            return r0
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int r1) {
            r0 = this;
            android.content.res.Resources r0 = r0.f878a
            int r0 = r0.getDimensionPixelOffset(r1)
            return r0
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int r1) {
            r0 = this;
            android.content.res.Resources r0 = r0.f878a
            int r0 = r0.getDimensionPixelSize(r1)
            return r0
    }

    @Override // android.content.res.Resources
    public android.util.DisplayMetrics getDisplayMetrics() {
            r0 = this;
            android.content.res.Resources r0 = r0.f878a
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            return r0
    }

    @Override // android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawable(int r1) {
            r0 = this;
            android.content.res.Resources r0 = r0.f878a
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
            return r0
    }

    @Override // android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawable(int r1, android.content.res.Resources.Theme r2) {
            r0 = this;
            android.content.res.Resources r0 = r0.f878a
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1, r2)
            return r0
    }

    @Override // android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawableForDensity(int r1, int r2) {
            r0 = this;
            android.content.res.Resources r0 = r0.f878a
            android.graphics.drawable.Drawable r0 = r0.getDrawableForDensity(r1, r2)
            return r0
    }

    @Override // android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawableForDensity(int r1, int r2, android.content.res.Resources.Theme r3) {
            r0 = this;
            android.content.res.Resources r0 = r0.f878a
            android.graphics.drawable.Drawable r0 = r0.getDrawableForDensity(r1, r2, r3)
            return r0
    }

    @Override // android.content.res.Resources
    public float getFraction(int r1, int r2, int r3) {
            r0 = this;
            android.content.res.Resources r0 = r0.f878a
            float r0 = r0.getFraction(r1, r2, r3)
            return r0
    }

    @Override // android.content.res.Resources
    public int getIdentifier(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            android.content.res.Resources r0 = r0.f878a
            int r0 = r0.getIdentifier(r1, r2, r3)
            return r0
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int r1) {
            r0 = this;
            android.content.res.Resources r0 = r0.f878a
            int[] r0 = r0.getIntArray(r1)
            return r0
    }

    @Override // android.content.res.Resources
    public int getInteger(int r1) {
            r0 = this;
            android.content.res.Resources r0 = r0.f878a
            int r0 = r0.getInteger(r1)
            return r0
    }

    @Override // android.content.res.Resources
    public android.content.res.XmlResourceParser getLayout(int r1) {
            r0 = this;
            android.content.res.Resources r0 = r0.f878a
            android.content.res.XmlResourceParser r0 = r0.getLayout(r1)
            return r0
    }

    @Override // android.content.res.Resources
    public android.graphics.Movie getMovie(int r1) {
            r0 = this;
            android.content.res.Resources r0 = r0.f878a
            android.graphics.Movie r0 = r0.getMovie(r1)
            return r0
    }

    @Override // android.content.res.Resources
    public java.lang.String getQuantityString(int r1, int r2) {
            r0 = this;
            android.content.res.Resources r0 = r0.f878a
            java.lang.String r0 = r0.getQuantityString(r1, r2)
            return r0
    }

    @Override // android.content.res.Resources
    public java.lang.String getQuantityString(int r1, int r2, java.lang.Object... r3) {
            r0 = this;
            android.content.res.Resources r0 = r0.f878a
            java.lang.String r0 = r0.getQuantityString(r1, r2, r3)
            return r0
    }

    @Override // android.content.res.Resources
    public java.lang.CharSequence getQuantityText(int r1, int r2) {
            r0 = this;
            android.content.res.Resources r0 = r0.f878a
            java.lang.CharSequence r0 = r0.getQuantityText(r1, r2)
            return r0
    }

    @Override // android.content.res.Resources
    public java.lang.String getResourceEntryName(int r1) {
            r0 = this;
            android.content.res.Resources r0 = r0.f878a
            java.lang.String r0 = r0.getResourceEntryName(r1)
            return r0
    }

    @Override // android.content.res.Resources
    public java.lang.String getResourceName(int r1) {
            r0 = this;
            android.content.res.Resources r0 = r0.f878a
            java.lang.String r0 = r0.getResourceName(r1)
            return r0
    }

    @Override // android.content.res.Resources
    public java.lang.String getResourcePackageName(int r1) {
            r0 = this;
            android.content.res.Resources r0 = r0.f878a
            java.lang.String r0 = r0.getResourcePackageName(r1)
            return r0
    }

    @Override // android.content.res.Resources
    public java.lang.String getResourceTypeName(int r1) {
            r0 = this;
            android.content.res.Resources r0 = r0.f878a
            java.lang.String r0 = r0.getResourceTypeName(r1)
            return r0
    }

    @Override // android.content.res.Resources
    public java.lang.String getString(int r1) {
            r0 = this;
            android.content.res.Resources r0 = r0.f878a
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    @Override // android.content.res.Resources
    public java.lang.String getString(int r1, java.lang.Object... r2) {
            r0 = this;
            android.content.res.Resources r0 = r0.f878a
            java.lang.String r0 = r0.getString(r1, r2)
            return r0
    }

    @Override // android.content.res.Resources
    public java.lang.String[] getStringArray(int r1) {
            r0 = this;
            android.content.res.Resources r0 = r0.f878a
            java.lang.String[] r0 = r0.getStringArray(r1)
            return r0
    }

    @Override // android.content.res.Resources
    public java.lang.CharSequence getText(int r1) {
            r0 = this;
            android.content.res.Resources r0 = r0.f878a
            java.lang.CharSequence r0 = r0.getText(r1)
            return r0
    }

    @Override // android.content.res.Resources
    public java.lang.CharSequence getText(int r1, java.lang.CharSequence r2) {
            r0 = this;
            android.content.res.Resources r0 = r0.f878a
            java.lang.CharSequence r0 = r0.getText(r1, r2)
            return r0
    }

    @Override // android.content.res.Resources
    public java.lang.CharSequence[] getTextArray(int r1) {
            r0 = this;
            android.content.res.Resources r0 = r0.f878a
            java.lang.CharSequence[] r0 = r0.getTextArray(r1)
            return r0
    }

    @Override // android.content.res.Resources
    public void getValue(int r1, android.util.TypedValue r2, boolean r3) {
            r0 = this;
            android.content.res.Resources r0 = r0.f878a
            r0.getValue(r1, r2, r3)
            return
    }

    @Override // android.content.res.Resources
    public void getValue(java.lang.String r1, android.util.TypedValue r2, boolean r3) {
            r0 = this;
            android.content.res.Resources r0 = r0.f878a
            r0.getValue(r1, r2, r3)
            return
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int r1, int r2, android.util.TypedValue r3, boolean r4) {
            r0 = this;
            android.content.res.Resources r0 = r0.f878a
            r0.getValueForDensity(r1, r2, r3, r4)
            return
    }

    @Override // android.content.res.Resources
    public android.content.res.XmlResourceParser getXml(int r1) {
            r0 = this;
            android.content.res.Resources r0 = r0.f878a
            android.content.res.XmlResourceParser r0 = r0.getXml(r1)
            return r0
    }

    @Override // android.content.res.Resources
    public android.content.res.TypedArray obtainAttributes(android.util.AttributeSet r1, int[] r2) {
            r0 = this;
            android.content.res.Resources r0 = r0.f878a
            android.content.res.TypedArray r0 = r0.obtainAttributes(r1, r2)
            return r0
    }

    @Override // android.content.res.Resources
    public android.content.res.TypedArray obtainTypedArray(int r1) {
            r0 = this;
            android.content.res.Resources r0 = r0.f878a
            android.content.res.TypedArray r0 = r0.obtainTypedArray(r1)
            return r0
    }

    @Override // android.content.res.Resources
    public java.io.InputStream openRawResource(int r1) {
            r0 = this;
            android.content.res.Resources r0 = r0.f878a
            java.io.InputStream r0 = r0.openRawResource(r1)
            return r0
    }

    @Override // android.content.res.Resources
    public java.io.InputStream openRawResource(int r1, android.util.TypedValue r2) {
            r0 = this;
            android.content.res.Resources r0 = r0.f878a
            java.io.InputStream r0 = r0.openRawResource(r1, r2)
            return r0
    }

    @Override // android.content.res.Resources
    public android.content.res.AssetFileDescriptor openRawResourceFd(int r1) {
            r0 = this;
            android.content.res.Resources r0 = r0.f878a
            android.content.res.AssetFileDescriptor r0 = r0.openRawResourceFd(r1)
            return r0
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(java.lang.String r1, android.util.AttributeSet r2, android.os.Bundle r3) {
            r0 = this;
            android.content.res.Resources r0 = r0.f878a
            r0.parseBundleExtra(r1, r2, r3)
            return
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(android.content.res.XmlResourceParser r1, android.os.Bundle r2) {
            r0 = this;
            android.content.res.Resources r0 = r0.f878a
            r0.parseBundleExtras(r1, r2)
            return
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(android.content.res.Configuration r1, android.util.DisplayMetrics r2) {
            r0 = this;
            super.updateConfiguration(r1, r2)
            android.content.res.Resources r0 = r0.f878a
            if (r0 == 0) goto La
            r0.updateConfiguration(r1, r2)
        La:
            return
    }
}
