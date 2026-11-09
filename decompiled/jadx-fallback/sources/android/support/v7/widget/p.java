package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
public class p extends android.widget.MultiAutoCompleteTextView implements b.b.c.g.p {
    private static final int[] d = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.support.v7.widget.e f903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.support.v7.widget.x f904c;

    static {
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16843126(0x1010176, float:2.3694606E-38)
            r0[r1] = r2
            android.support.v7.widget.p.d = r0
            return
    }

    public p(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = b.b.d.a.a.autoCompleteTextViewStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public p(android.content.Context r3, android.util.AttributeSet r4, int r5) {
            r2 = this;
            android.content.Context r3 = android.support.v7.widget.q0.b(r3)
            r2.<init>(r3, r4, r5)
            android.content.Context r3 = r2.getContext()
            int[] r0 = android.support.v7.widget.p.d
            r1 = 0
            android.support.v7.widget.t0 r3 = android.support.v7.widget.t0.a(r3, r4, r0, r5, r1)
            boolean r0 = r3.g(r1)
            if (r0 == 0) goto L1f
            android.graphics.drawable.Drawable r0 = r3.b(r1)
            r2.setDropDownBackgroundDrawable(r0)
        L1f:
            r3.a()
            android.support.v7.widget.e r3 = new android.support.v7.widget.e
            r3.<init>(r2)
            r2.f903b = r3
            r3.a(r4, r5)
            android.support.v7.widget.x r3 = new android.support.v7.widget.x
            r3.<init>(r2)
            r2.f904c = r3
            r3.a(r4, r5)
            android.support.v7.widget.x r2 = r2.f904c
            r2.a()
            return
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            android.support.v7.widget.e r0 = r1.f903b
            if (r0 == 0) goto La
            r0.a()
        La:
            android.support.v7.widget.x r1 = r1.f904c
            if (r1 == 0) goto L11
            r1.a()
        L11:
            return
    }

    @Override // b.b.c.g.p
    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r0 = this;
            android.support.v7.widget.e r0 = r0.f903b
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
            android.support.v7.widget.e r0 = r0.f903b
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.c()
            goto La
        L9:
            r0 = 0
        La:
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
            android.support.v7.widget.e r0 = r0.f903b
            if (r0 == 0) goto La
            r0.a(r1)
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r1) {
            r0 = this;
            super.setBackgroundResource(r1)
            android.support.v7.widget.e r0 = r0.f903b
            if (r0 == 0) goto La
            r0.a(r1)
        La:
            return
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = b.b.d.b.a.a.c(r0, r2)
            r1.setDropDownBackgroundDrawable(r2)
            return
    }

    @Override // b.b.c.g.p
    public void setSupportBackgroundTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            android.support.v7.widget.e r0 = r0.f903b
            if (r0 == 0) goto L7
            r0.b(r1)
        L7:
            return
    }

    @Override // b.b.c.g.p
    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            android.support.v7.widget.e r0 = r0.f903b
            if (r0 == 0) goto L7
            r0.a(r1)
        L7:
            return
    }

    @Override // android.widget.TextView
    public void setTextAppearance(android.content.Context r1, int r2) {
            r0 = this;
            super.setTextAppearance(r1, r2)
            android.support.v7.widget.x r0 = r0.f904c
            if (r0 == 0) goto La
            r0.a(r1, r2)
        La:
            return
    }
}
