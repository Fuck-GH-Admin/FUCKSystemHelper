package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
public class k extends android.widget.EditText implements b.b.c.g.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.support.v7.widget.e f876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.support.v7.widget.x f877c;

    public k(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = b.b.d.a.a.editTextStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public k(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            android.content.Context r1 = android.support.v7.widget.q0.b(r1)
            r0.<init>(r1, r2, r3)
            android.support.v7.widget.e r1 = new android.support.v7.widget.e
            r1.<init>(r0)
            r0.f876b = r1
            r1.a(r2, r3)
            android.support.v7.widget.x r1 = new android.support.v7.widget.x
            r1.<init>(r0)
            r0.f877c = r1
            r1.a(r2, r3)
            android.support.v7.widget.x r0 = r0.f877c
            r0.a()
            return
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            android.support.v7.widget.e r0 = r1.f876b
            if (r0 == 0) goto La
            r0.a()
        La:
            android.support.v7.widget.x r1 = r1.f877c
            if (r1 == 0) goto L11
            r1.a()
        L11:
            return
    }

    @Override // b.b.c.g.p
    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r0 = this;
            android.support.v7.widget.e r0 = r0.f876b
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
            android.support.v7.widget.e r0 = r0.f876b
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.c()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // android.widget.EditText, android.widget.TextView
    public android.text.Editable getText() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            android.text.Editable r2 = super.getText()
            return r2
        Lb:
            android.text.Editable r2 = super.getEditableText()
            return r2
    }

    @Override // android.widget.EditText, android.widget.TextView
    public /* bridge */ /* synthetic */ java.lang.CharSequence getText() {
            r0 = this;
            android.text.Editable r0 = r0.getText()
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r2) {
            r1 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r2)
            android.support.v7.widget.l.a(r0, r2, r1)
            return r0
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            android.support.v7.widget.e r0 = r0.f876b
            if (r0 == 0) goto La
            r0.a(r1)
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r1) {
            r0 = this;
            super.setBackgroundResource(r1)
            android.support.v7.widget.e r0 = r0.f876b
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

    @Override // b.b.c.g.p
    public void setSupportBackgroundTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            android.support.v7.widget.e r0 = r0.f876b
            if (r0 == 0) goto L7
            r0.b(r1)
        L7:
            return
    }

    @Override // b.b.c.g.p
    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            android.support.v7.widget.e r0 = r0.f876b
            if (r0 == 0) goto L7
            r0.a(r1)
        L7:
            return
    }

    @Override // android.widget.TextView
    public void setTextAppearance(android.content.Context r1, int r2) {
            r0 = this;
            super.setTextAppearance(r1, r2)
            android.support.v7.widget.x r0 = r0.f877c
            if (r0 == 0) goto La
            r0.a(r1, r2)
        La:
            return
    }
}
