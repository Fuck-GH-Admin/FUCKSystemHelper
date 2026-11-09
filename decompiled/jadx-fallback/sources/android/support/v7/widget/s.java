package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
public class s extends android.widget.RadioButton implements android.support.v4.widget.m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.support.v7.widget.i f916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.support.v7.widget.x f917c;

    public s(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = b.b.d.a.a.radioButtonStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public s(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            android.content.Context r1 = android.support.v7.widget.q0.b(r1)
            r0.<init>(r1, r2, r3)
            android.support.v7.widget.i r1 = new android.support.v7.widget.i
            r1.<init>(r0)
            r0.f916b = r1
            r1.a(r2, r3)
            android.support.v7.widget.x r1 = new android.support.v7.widget.x
            r1.<init>(r0)
            r0.f917c = r1
            r1.a(r2, r3)
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
            r1 = this;
            int r0 = super.getCompoundPaddingLeft()
            android.support.v7.widget.i r1 = r1.f916b
            if (r1 == 0) goto Lc
            int r0 = r1.a(r0)
        Lc:
            return r0
    }

    public android.content.res.ColorStateList getSupportButtonTintList() {
            r0 = this;
            android.support.v7.widget.i r0 = r0.f916b
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.b()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportButtonTintMode() {
            r0 = this;
            android.support.v7.widget.i r0 = r0.f916b
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.c()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = b.b.d.b.a.a.c(r0, r2)
            r1.setButtonDrawable(r2)
            return
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setButtonDrawable(r1)
            android.support.v7.widget.i r0 = r0.f916b
            if (r0 == 0) goto La
            r0.d()
        La:
            return
    }

    @Override // android.support.v4.widget.m
    public void setSupportButtonTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            android.support.v7.widget.i r0 = r0.f916b
            if (r0 == 0) goto L7
            r0.a(r1)
        L7:
            return
    }

    @Override // android.support.v4.widget.m
    public void setSupportButtonTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            android.support.v7.widget.i r0 = r0.f916b
            if (r0 == 0) goto L7
            r0.a(r1)
        L7:
            return
    }
}
