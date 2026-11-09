package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
public class m extends android.widget.ImageButton implements b.b.c.g.p, android.support.v4.widget.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.support.v7.widget.e f882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.support.v7.widget.n f883c;

    public m(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = b.b.d.a.a.imageButtonStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public m(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            android.content.Context r1 = android.support.v7.widget.q0.b(r1)
            r0.<init>(r1, r2, r3)
            android.support.v7.widget.e r1 = new android.support.v7.widget.e
            r1.<init>(r0)
            r0.f882b = r1
            r1.a(r2, r3)
            android.support.v7.widget.n r1 = new android.support.v7.widget.n
            r1.<init>(r0)
            r0.f883c = r1
            r1.a(r2, r3)
            return
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            android.support.v7.widget.e r0 = r1.f882b
            if (r0 == 0) goto La
            r0.a()
        La:
            android.support.v7.widget.n r1 = r1.f883c
            if (r1 == 0) goto L11
            r1.a()
        L11:
            return
    }

    @Override // b.b.c.g.p
    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r0 = this;
            android.support.v7.widget.e r0 = r0.f882b
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
            android.support.v7.widget.e r0 = r0.f882b
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.c()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // android.support.v4.widget.n
    public android.content.res.ColorStateList getSupportImageTintList() {
            r0 = this;
            android.support.v7.widget.n r0 = r0.f883c
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.b()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // android.support.v4.widget.n
    public android.graphics.PorterDuff.Mode getSupportImageTintMode() {
            r0 = this;
            android.support.v7.widget.n r0 = r0.f883c
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.c()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
            r1 = this;
            android.support.v7.widget.n r0 = r1.f883c
            boolean r0 = r0.d()
            if (r0 == 0) goto L10
            boolean r1 = super.hasOverlappingRendering()
            if (r1 == 0) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            android.support.v7.widget.e r0 = r0.f882b
            if (r0 == 0) goto La
            r0.a(r1)
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r1) {
            r0 = this;
            super.setBackgroundResource(r1)
            android.support.v7.widget.e r0 = r0.f882b
            if (r0 == 0) goto La
            r0.a(r1)
        La:
            return
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap r1) {
            r0 = this;
            super.setImageBitmap(r1)
            android.support.v7.widget.n r0 = r0.f883c
            if (r0 == 0) goto La
            r0.a()
        La:
            return
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setImageDrawable(r1)
            android.support.v7.widget.n r0 = r0.f883c
            if (r0 == 0) goto La
            r0.a()
        La:
            return
    }

    @Override // android.widget.ImageView
    public void setImageResource(int r1) {
            r0 = this;
            android.support.v7.widget.n r0 = r0.f883c
            r0.a(r1)
            return
    }

    @Override // android.widget.ImageView
    public void setImageURI(android.net.Uri r1) {
            r0 = this;
            super.setImageURI(r1)
            android.support.v7.widget.n r0 = r0.f883c
            if (r0 == 0) goto La
            r0.a()
        La:
            return
    }

    @Override // b.b.c.g.p
    public void setSupportBackgroundTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            android.support.v7.widget.e r0 = r0.f882b
            if (r0 == 0) goto L7
            r0.b(r1)
        L7:
            return
    }

    @Override // b.b.c.g.p
    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            android.support.v7.widget.e r0 = r0.f882b
            if (r0 == 0) goto L7
            r0.a(r1)
        L7:
            return
    }

    @Override // android.support.v4.widget.n
    public void setSupportImageTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            android.support.v7.widget.n r0 = r0.f883c
            if (r0 == 0) goto L7
            r0.a(r1)
        L7:
            return
    }

    @Override // android.support.v4.widget.n
    public void setSupportImageTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            android.support.v7.widget.n r0 = r0.f883c
            if (r0 == 0) goto L7
            r0.a(r1)
        L7:
            return
    }
}
