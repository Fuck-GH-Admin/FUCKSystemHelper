package android.support.v4.graphics.drawable;

/* JADX INFO: loaded from: classes.dex */
class e extends android.support.v4.graphics.drawable.d {
    private static java.lang.reflect.Method i;

    private static class a extends android.support.v4.graphics.drawable.d.a {
        a(android.support.v4.graphics.drawable.d.a r1, android.content.res.Resources r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // android.support.v4.graphics.drawable.d.a, android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r2) {
                r1 = this;
                android.support.v4.graphics.drawable.e r0 = new android.support.v4.graphics.drawable.e
                r0.<init>(r1, r2)
                return r0
        }
    }

    e(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.<init>(r1)
            r0.d()
            return
    }

    e(android.support.v4.graphics.drawable.d.a r1, android.content.res.Resources r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.d()
            return
    }

    private void d() {
            r2 = this;
            java.lang.reflect.Method r2 = android.support.v4.graphics.drawable.e.i
            if (r2 != 0) goto L1a
            java.lang.Class<android.graphics.drawable.Drawable> r2 = android.graphics.drawable.Drawable.class
            java.lang.String r0 = "isProjected"
            r1 = 0
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L12
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r0, r1)     // Catch: java.lang.Exception -> L12
            android.support.v4.graphics.drawable.e.i = r2     // Catch: java.lang.Exception -> L12
            goto L1a
        L12:
            r2 = move-exception
            java.lang.String r0 = "WrappedDrawableApi21"
            java.lang.String r1 = "Failed to retrieve Drawable#isProjected() method"
            android.util.Log.w(r0, r1, r2)
        L1a:
            return
    }

    @Override // android.support.v4.graphics.drawable.d
    protected boolean b() {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 21
            if (r0 != r2) goto L1a
            android.graphics.drawable.Drawable r3 = r3.g
            boolean r0 = r3 instanceof android.graphics.drawable.GradientDrawable
            if (r0 != 0) goto L19
            boolean r0 = r3 instanceof android.graphics.drawable.DrawableContainer
            if (r0 != 0) goto L19
            boolean r0 = r3 instanceof android.graphics.drawable.InsetDrawable
            if (r0 != 0) goto L19
            boolean r3 = r3 instanceof android.graphics.drawable.RippleDrawable
            if (r3 == 0) goto L1a
        L19:
            r1 = 1
        L1a:
            return r1
    }

    @Override // android.support.v4.graphics.drawable.d
    android.support.v4.graphics.drawable.d.a c() {
            r2 = this;
            android.support.v4.graphics.drawable.e$a r0 = new android.support.v4.graphics.drawable.e$a
            android.support.v4.graphics.drawable.d$a r2 = r2.e
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.Rect getDirtyBounds() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.g
            android.graphics.Rect r0 = r0.getDirtyBounds()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.g
            r0.getOutline(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
            r3 = this;
            android.graphics.drawable.Drawable r3 = r3.g
            r0 = 0
            if (r3 == 0) goto L1e
            java.lang.reflect.Method r1 = android.support.v4.graphics.drawable.e.i
            if (r1 == 0) goto L1e
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L16
            java.lang.Object r3 = r1.invoke(r3, r2)     // Catch: java.lang.Exception -> L16
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Exception -> L16
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Exception -> L16
            return r3
        L16:
            r3 = move-exception
            java.lang.String r1 = "WrappedDrawableApi21"
            java.lang.String r2 = "Error calling Drawable#isProjected() method"
            android.util.Log.w(r1, r2, r3)
        L1e:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float r1, float r2) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.g
            r0.setHotspot(r1, r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int r1, int r2, int r3, int r4) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.g
            r0.setHotspotBounds(r1, r2, r3, r4)
            return
    }

    @Override // android.support.v4.graphics.drawable.d, android.graphics.drawable.Drawable
    public boolean setState(int[] r1) {
            r0 = this;
            boolean r1 = super.setState(r1)
            if (r1 == 0) goto Lb
            r0.invalidateSelf()
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // android.support.v4.graphics.drawable.d, android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.b
    public void setTint(int r2) {
            r1 = this;
            boolean r0 = r1.b()
            if (r0 == 0) goto La
            super.setTint(r2)
            goto Lf
        La:
            android.graphics.drawable.Drawable r1 = r1.g
            r1.setTint(r2)
        Lf:
            return
    }

    @Override // android.support.v4.graphics.drawable.d, android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.b
    public void setTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            boolean r0 = r1.b()
            if (r0 == 0) goto La
            super.setTintList(r2)
            goto Lf
        La:
            android.graphics.drawable.Drawable r1 = r1.g
            r1.setTintList(r2)
        Lf:
            return
    }

    @Override // android.support.v4.graphics.drawable.d, android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.b
    public void setTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            boolean r0 = r1.b()
            if (r0 == 0) goto La
            super.setTintMode(r2)
            goto Lf
        La:
            android.graphics.drawable.Drawable r1 = r1.g
            r1.setTintMode(r2)
        Lf:
            return
    }
}
