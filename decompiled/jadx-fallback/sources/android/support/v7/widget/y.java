package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
public class y extends android.widget.TextView implements b.b.c.g.p, android.support.v4.widget.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.support.v7.widget.e f952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.support.v7.widget.x f953c;
    private java.util.concurrent.Future<b.b.c.e.a> d;

    public y(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public y(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 16842884(0x1010084, float:2.3693928E-38)
            r1.<init>(r2, r3, r0)
            return
    }

    public y(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            android.content.Context r1 = android.support.v7.widget.q0.b(r1)
            r0.<init>(r1, r2, r3)
            android.support.v7.widget.e r1 = new android.support.v7.widget.e
            r1.<init>(r0)
            r0.f952b = r1
            r1.a(r2, r3)
            android.support.v7.widget.x r1 = new android.support.v7.widget.x
            r1.<init>(r0)
            r0.f953c = r1
            r1.a(r2, r3)
            android.support.v7.widget.x r0 = r0.f953c
            r0.a()
            return
    }

    private void d() {
            r2 = this;
            java.util.concurrent.Future<b.b.c.e.a> r0 = r2.d
            if (r0 == 0) goto L10
            r1 = 0
            r2.d = r1     // Catch: java.lang.Throwable -> L10
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L10
            b.b.c.e.a r0 = (b.b.c.e.a) r0     // Catch: java.lang.Throwable -> L10
            android.support.v4.widget.l.a(r2, r0)     // Catch: java.lang.Throwable -> L10
        L10:
            return
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            android.support.v7.widget.e r0 = r1.f952b
            if (r0 == 0) goto La
            r0.a()
        La:
            android.support.v7.widget.x r1 = r1.f953c
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
            android.support.v7.widget.x r1 = r1.f953c
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
            android.support.v7.widget.x r1 = r1.f953c
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
            android.support.v7.widget.x r1 = r1.f953c
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
            android.support.v7.widget.x r1 = r1.f953c
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
            android.support.v7.widget.x r2 = r2.f953c
            if (r2 == 0) goto L17
            int r2 = r2.g()
            return r2
        L17:
            return r1
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
            r0 = this;
            int r0 = android.support.v4.widget.l.a(r0)
            return r0
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
            r0 = this;
            int r0 = android.support.v4.widget.l.b(r0)
            return r0
    }

    @Override // b.b.c.g.p
    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r0 = this;
            android.support.v7.widget.e r0 = r0.f952b
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
            android.support.v7.widget.e r0 = r0.f952b
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.c()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // android.widget.TextView
    public java.lang.CharSequence getText() {
            r0 = this;
            r0.d()
            java.lang.CharSequence r0 = super.getText()
            return r0
    }

    public b.b.c.e.a.C0044a getTextMetricsParamsCompat() {
            r0 = this;
            b.b.c.e.a$a r0 = android.support.v4.widget.l.d(r0)
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r2) {
            r1 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r2)
            android.support.v7.widget.l.a(r0, r2, r1)
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean r7, int r8, int r9, int r10, int r11) {
            r6 = this;
            super.onLayout(r7, r8, r9, r10, r11)
            android.support.v7.widget.x r0 = r6.f953c
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

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int r1, int r2) {
            r0 = this;
            r0.d()
            super.onMeasure(r1, r2)
            return
    }

    @Override // android.widget.TextView
    protected void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            super.onTextChanged(r1, r2, r3, r4)
            android.support.v7.widget.x r1 = r0.f953c
            if (r1 == 0) goto L16
            boolean r2 = android.support.v4.widget.b.f644a
            if (r2 != 0) goto L16
            boolean r1 = r1.h()
            if (r1 == 0) goto L16
            android.support.v7.widget.x r0 = r0.f953c
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
            android.support.v7.widget.x r1 = r1.f953c
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
            android.support.v7.widget.x r1 = r1.f953c
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
            android.support.v7.widget.x r1 = r1.f953c
            if (r1 == 0) goto Lf
            r1.a(r2)
        Lf:
            return
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            android.support.v7.widget.e r0 = r0.f952b
            if (r0 == 0) goto La
            r0.a(r1)
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r1) {
            r0 = this;
            super.setBackgroundResource(r1)
            android.support.v7.widget.e r0 = r0.f952b
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

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto La
            super.setFirstBaselineToTopHeight(r3)
            goto Ld
        La:
            android.support.v4.widget.l.a(r2, r3)
        Ld:
            return
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto La
            super.setLastBaselineToBottomHeight(r3)
            goto Ld
        La:
            android.support.v4.widget.l.b(r2, r3)
        Ld:
            return
    }

    @Override // android.widget.TextView
    public void setLineHeight(int r1) {
            r0 = this;
            android.support.v4.widget.l.c(r0, r1)
            return
    }

    public void setPrecomputedText(b.b.c.e.a r1) {
            r0 = this;
            android.support.v4.widget.l.a(r0, r1)
            return
    }

    @Override // b.b.c.g.p
    public void setSupportBackgroundTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            android.support.v7.widget.e r0 = r0.f952b
            if (r0 == 0) goto L7
            r0.b(r1)
        L7:
            return
    }

    @Override // b.b.c.g.p
    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            android.support.v7.widget.e r0 = r0.f952b
            if (r0 == 0) goto L7
            r0.a(r1)
        L7:
            return
    }

    @Override // android.widget.TextView
    public void setTextAppearance(android.content.Context r1, int r2) {
            r0 = this;
            super.setTextAppearance(r1, r2)
            android.support.v7.widget.x r0 = r0.f953c
            if (r0 == 0) goto La
            r0.a(r1, r2)
        La:
            return
    }

    public void setTextFuture(java.util.concurrent.Future<b.b.c.e.a> r1) {
            r0 = this;
            r0.d = r1
            r0.requestLayout()
            return
    }

    public void setTextMetricsParamsCompat(b.b.c.e.a.C0044a r1) {
            r0 = this;
            android.support.v4.widget.l.a(r0, r1)
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
            android.support.v7.widget.x r1 = r1.f953c
            if (r1 == 0) goto Lf
            r1.a(r2, r3)
        Lf:
            return
    }
}
