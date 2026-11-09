package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
public class f extends android.widget.Button implements b.b.c.g.p, android.support.v4.widget.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.support.v7.widget.e f848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.support.v7.widget.x f849c;

    public f(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = b.b.d.a.a.buttonStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public f(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            android.content.Context r1 = android.support.v7.widget.q0.b(r1)
            r0.<init>(r1, r2, r3)
            android.support.v7.widget.e r1 = new android.support.v7.widget.e
            r1.<init>(r0)
            r0.f848b = r1
            r1.a(r2, r3)
            android.support.v7.widget.x r1 = new android.support.v7.widget.x
            r1.<init>(r0)
            r0.f849c = r1
            r1.a(r2, r3)
            android.support.v7.widget.x r0 = r0.f849c
            r0.a()
            return
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            android.support.v7.widget.e r0 = r1.f848b
            if (r0 == 0) goto La
            r0.a()
        La:
            android.support.v7.widget.x r1 = r1.f849c
            if (r1 == 0) goto L11
            r1.a()
        L11:
            return
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
            r1 = this;
            boolean r0 = android.support.v4.widget.b.f644a
            if (r0 == 0) goto L9
            int r1 = super.getAutoSizeMaxTextSize()
            return r1
        L9:
            android.support.v7.widget.x r1 = r1.f849c
            if (r1 == 0) goto L12
            int r1 = r1.c()
            return r1
        L12:
            r1 = -1
            return r1
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
            r1 = this;
            boolean r0 = android.support.v4.widget.b.f644a
            if (r0 == 0) goto L9
            int r1 = super.getAutoSizeMinTextSize()
            return r1
        L9:
            android.support.v7.widget.x r1 = r1.f849c
            if (r1 == 0) goto L12
            int r1 = r1.d()
            return r1
        L12:
            r1 = -1
            return r1
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
            r1 = this;
            boolean r0 = android.support.v4.widget.b.f644a
            if (r0 == 0) goto L9
            int r1 = super.getAutoSizeStepGranularity()
            return r1
        L9:
            android.support.v7.widget.x r1 = r1.f849c
            if (r1 == 0) goto L12
            int r1 = r1.e()
            return r1
        L12:
            r1 = -1
            return r1
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
            r1 = this;
            boolean r0 = android.support.v4.widget.b.f644a
            if (r0 == 0) goto L9
            int[] r1 = super.getAutoSizeTextAvailableSizes()
            return r1
        L9:
            android.support.v7.widget.x r1 = r1.f849c
            if (r1 == 0) goto L12
            int[] r1 = r1.f()
            return r1
        L12:
            r1 = 0
            int[] r1 = new int[r1]
            return r1
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
            r2 = this;
            boolean r0 = android.support.v4.widget.b.f644a
            r1 = 0
            if (r0 == 0) goto Le
            int r2 = super.getAutoSizeTextType()
            r0 = 1
            if (r2 != r0) goto Ld
            r1 = r0
        Ld:
            return r1
        Le:
            android.support.v7.widget.x r2 = r2.f849c
            if (r2 == 0) goto L17
            int r2 = r2.g()
            return r2
        L17:
            return r1
    }

    @Override // b.b.c.g.p
    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r0 = this;
            android.support.v7.widget.e r0 = r0.f848b
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.b()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // b.b.c.g.p
    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r0 = this;
            android.support.v7.widget.e r0 = r0.f848b
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.c()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r1) {
            r0 = this;
            super.onInitializeAccessibilityEvent(r1)
            java.lang.Class<android.widget.Button> r0 = android.widget.Button.class
            java.lang.String r0 = r0.getName()
            r1.setClassName(r0)
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r1) {
            r0 = this;
            super.onInitializeAccessibilityNodeInfo(r1)
            java.lang.Class<android.widget.Button> r0 = android.widget.Button.class
            java.lang.String r0 = r0.getName()
            r1.setClassName(r0)
            return
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean r7, int r8, int r9, int r10, int r11) {
            r6 = this;
            super.onLayout(r7, r8, r9, r10, r11)
            android.support.v7.widget.x r0 = r6.f849c
            if (r0 == 0) goto Lf
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.a(r1, r2, r3, r4, r5)
        Lf:
            return
    }

    @Override // android.widget.TextView
    protected void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            super.onTextChanged(r1, r2, r3, r4)
            android.support.v7.widget.x r1 = r0.f849c
            if (r1 == 0) goto L16
            boolean r2 = android.support.v4.widget.b.f644a
            if (r2 != 0) goto L16
            boolean r1 = r1.h()
            if (r1 == 0) goto L16
            android.support.v7.widget.x r0 = r0.f849c
            r0.b()
        L16:
            return
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int r2, int r3, int r4, int r5) {
            r1 = this;
            boolean r0 = android.support.v4.widget.b.f644a
            if (r0 == 0) goto L8
            super.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r5)
            goto Lf
        L8:
            android.support.v7.widget.x r1 = r1.f849c
            if (r1 == 0) goto Lf
            r1.a(r2, r3, r4, r5)
        Lf:
            return
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] r2, int r3) {
            r1 = this;
            boolean r0 = android.support.v4.widget.b.f644a
            if (r0 == 0) goto L8
            super.setAutoSizeTextTypeUniformWithPresetSizes(r2, r3)
            goto Lf
        L8:
            android.support.v7.widget.x r1 = r1.f849c
            if (r1 == 0) goto Lf
            r1.a(r2, r3)
        Lf:
            return
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int r2) {
            r1 = this;
            boolean r0 = android.support.v4.widget.b.f644a
            if (r0 == 0) goto L8
            super.setAutoSizeTextTypeWithDefaults(r2)
            goto Lf
        L8:
            android.support.v7.widget.x r1 = r1.f849c
            if (r1 == 0) goto Lf
            r1.a(r2)
        Lf:
            return
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            android.support.v7.widget.e r0 = r0.f848b
            if (r0 == 0) goto La
            r0.a(r1)
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r1) {
            r0 = this;
            super.setBackgroundResource(r1)
            android.support.v7.widget.e r0 = r0.f848b
            if (r0 == 0) goto La
            r0.a(r1)
        La:
            return
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback r1) {
            r0 = this;
            android.view.ActionMode$Callback r1 = android.support.v4.widget.l.a(r0, r1)
            super.setCustomSelectionActionModeCallback(r1)
            return
    }

    public void setSupportAllCaps(boolean r1) {
            r0 = this;
            android.support.v7.widget.x r0 = r0.f849c
            if (r0 == 0) goto L7
            r0.a(r1)
        L7:
            return
    }

    @Override // b.b.c.g.p
    public void setSupportBackgroundTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            android.support.v7.widget.e r0 = r0.f848b
            if (r0 == 0) goto L7
            r0.b(r1)
        L7:
            return
    }

    @Override // b.b.c.g.p
    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            android.support.v7.widget.e r0 = r0.f848b
            if (r0 == 0) goto L7
            r0.a(r1)
        L7:
            return
    }

    @Override // android.widget.TextView
    public void setTextAppearance(android.content.Context r1, int r2) {
            r0 = this;
            super.setTextAppearance(r1, r2)
            android.support.v7.widget.x r0 = r0.f849c
            if (r0 == 0) goto La
            r0.a(r1, r2)
        La:
            return
    }

    @Override // android.widget.TextView
    public void setTextSize(int r2, float r3) {
            r1 = this;
            boolean r0 = android.support.v4.widget.b.f644a
            if (r0 == 0) goto L8
            super.setTextSize(r2, r3)
            goto Lf
        L8:
            android.support.v7.widget.x r1 = r1.f849c
            if (r1 == 0) goto Lf
            r1.a(r2, r3)
        Lf:
            return
    }
}
