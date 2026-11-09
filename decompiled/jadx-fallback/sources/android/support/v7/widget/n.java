package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.widget.ImageView f892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.support.v7.widget.r0 f893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.support.v7.widget.r0 f894c;
    private android.support.v7.widget.r0 d;

    public n(android.widget.ImageView r1) {
            r0 = this;
            r0.<init>()
            r0.f892a = r1
            return
    }

    private boolean a(android.graphics.drawable.Drawable r4) {
            r3 = this;
            android.support.v7.widget.r0 r0 = r3.d
            if (r0 != 0) goto Lb
            android.support.v7.widget.r0 r0 = new android.support.v7.widget.r0
            r0.<init>()
            r3.d = r0
        Lb:
            android.support.v7.widget.r0 r0 = r3.d
            r0.a()
            android.widget.ImageView r1 = r3.f892a
            android.content.res.ColorStateList r1 = android.support.v4.widget.g.a(r1)
            r2 = 1
            if (r1 == 0) goto L1d
            r0.d = r2
            r0.f913a = r1
        L1d:
            android.widget.ImageView r1 = r3.f892a
            android.graphics.PorterDuff$Mode r1 = android.support.v4.widget.g.b(r1)
            if (r1 == 0) goto L29
            r0.f915c = r2
            r0.f914b = r1
        L29:
            boolean r1 = r0.d
            if (r1 != 0) goto L34
            boolean r1 = r0.f915c
            if (r1 == 0) goto L32
            goto L34
        L32:
            r3 = 0
            return r3
        L34:
            android.widget.ImageView r3 = r3.f892a
            int[] r3 = r3.getDrawableState()
            android.support.v7.widget.j.a(r4, r0, r3)
            return r2
    }

    private boolean e() {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 0
            r3 = 21
            if (r0 <= r3) goto Lf
            android.support.v7.widget.r0 r4 = r4.f893b
            if (r4 == 0) goto Ld
            goto Le
        Ld:
            r1 = r2
        Le:
            return r1
        Lf:
            if (r0 != r3) goto L12
            return r1
        L12:
            return r2
    }

    void a() {
            r2 = this;
            android.widget.ImageView r0 = r2.f892a
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            if (r0 == 0) goto Lb
            android.support.v7.widget.c0.b(r0)
        Lb:
            if (r0 == 0) goto L35
            boolean r1 = r2.e()
            if (r1 == 0) goto L1a
            boolean r1 = r2.a(r0)
            if (r1 == 0) goto L1a
            return
        L1a:
            android.support.v7.widget.r0 r1 = r2.f894c
            if (r1 == 0) goto L28
            android.widget.ImageView r2 = r2.f892a
            int[] r2 = r2.getDrawableState()
            android.support.v7.widget.j.a(r0, r1, r2)
            goto L35
        L28:
            android.support.v7.widget.r0 r1 = r2.f893b
            if (r1 == 0) goto L35
            android.widget.ImageView r2 = r2.f892a
            int[] r2 = r2.getDrawableState()
            android.support.v7.widget.j.a(r0, r1, r2)
        L35:
            return
    }

    public void a(int r2) {
            r1 = this;
            if (r2 == 0) goto L17
            android.widget.ImageView r0 = r1.f892a
            android.content.Context r0 = r0.getContext()
            android.graphics.drawable.Drawable r2 = b.b.d.b.a.a.c(r0, r2)
            if (r2 == 0) goto L11
            android.support.v7.widget.c0.b(r2)
        L11:
            android.widget.ImageView r0 = r1.f892a
            r0.setImageDrawable(r2)
            goto L1d
        L17:
            android.widget.ImageView r2 = r1.f892a
            r0 = 0
            r2.setImageDrawable(r0)
        L1d:
            r1.a()
            return
    }

    void a(android.content.res.ColorStateList r2) {
            r1 = this;
            android.support.v7.widget.r0 r0 = r1.f894c
            if (r0 != 0) goto Lb
            android.support.v7.widget.r0 r0 = new android.support.v7.widget.r0
            r0.<init>()
            r1.f894c = r0
        Lb:
            android.support.v7.widget.r0 r0 = r1.f894c
            r0.f913a = r2
            r2 = 1
            r0.d = r2
            r1.a()
            return
    }

    void a(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            android.support.v7.widget.r0 r0 = r1.f894c
            if (r0 != 0) goto Lb
            android.support.v7.widget.r0 r0 = new android.support.v7.widget.r0
            r0.<init>()
            r1.f894c = r0
        Lb:
            android.support.v7.widget.r0 r0 = r1.f894c
            r0.f914b = r2
            r2 = 1
            r0.f915c = r2
            r1.a()
            return
    }

    public void a(android.util.AttributeSet r4, int r5) {
            r3 = this;
            android.widget.ImageView r0 = r3.f892a
            android.content.Context r0 = r0.getContext()
            int[] r1 = b.b.d.a.j.AppCompatImageView
            r2 = 0
            android.support.v7.widget.t0 r4 = android.support.v7.widget.t0.a(r0, r4, r1, r5, r2)
            android.widget.ImageView r5 = r3.f892a     // Catch: java.lang.Throwable -> L63
            android.graphics.drawable.Drawable r5 = r5.getDrawable()     // Catch: java.lang.Throwable -> L63
            r0 = -1
            if (r5 != 0) goto L2f
            int r1 = b.b.d.a.j.AppCompatImageView_srcCompat     // Catch: java.lang.Throwable -> L63
            int r1 = r4.g(r1, r0)     // Catch: java.lang.Throwable -> L63
            if (r1 == r0) goto L2f
            android.widget.ImageView r5 = r3.f892a     // Catch: java.lang.Throwable -> L63
            android.content.Context r5 = r5.getContext()     // Catch: java.lang.Throwable -> L63
            android.graphics.drawable.Drawable r5 = b.b.d.b.a.a.c(r5, r1)     // Catch: java.lang.Throwable -> L63
            if (r5 == 0) goto L2f
            android.widget.ImageView r1 = r3.f892a     // Catch: java.lang.Throwable -> L63
            r1.setImageDrawable(r5)     // Catch: java.lang.Throwable -> L63
        L2f:
            if (r5 == 0) goto L34
            android.support.v7.widget.c0.b(r5)     // Catch: java.lang.Throwable -> L63
        L34:
            int r5 = b.b.d.a.j.AppCompatImageView_tint     // Catch: java.lang.Throwable -> L63
            boolean r5 = r4.g(r5)     // Catch: java.lang.Throwable -> L63
            if (r5 == 0) goto L47
            android.widget.ImageView r5 = r3.f892a     // Catch: java.lang.Throwable -> L63
            int r1 = b.b.d.a.j.AppCompatImageView_tint     // Catch: java.lang.Throwable -> L63
            android.content.res.ColorStateList r1 = r4.a(r1)     // Catch: java.lang.Throwable -> L63
            android.support.v4.widget.g.a(r5, r1)     // Catch: java.lang.Throwable -> L63
        L47:
            int r5 = b.b.d.a.j.AppCompatImageView_tintMode     // Catch: java.lang.Throwable -> L63
            boolean r5 = r4.g(r5)     // Catch: java.lang.Throwable -> L63
            if (r5 == 0) goto L5f
            android.widget.ImageView r3 = r3.f892a     // Catch: java.lang.Throwable -> L63
            int r5 = b.b.d.a.j.AppCompatImageView_tintMode     // Catch: java.lang.Throwable -> L63
            int r5 = r4.d(r5, r0)     // Catch: java.lang.Throwable -> L63
            r0 = 0
            android.graphics.PorterDuff$Mode r5 = android.support.v7.widget.c0.a(r5, r0)     // Catch: java.lang.Throwable -> L63
            android.support.v4.widget.g.a(r3, r5)     // Catch: java.lang.Throwable -> L63
        L5f:
            r4.a()
            return
        L63:
            r3 = move-exception
            r4.a()
            throw r3
    }

    android.content.res.ColorStateList b() {
            r0 = this;
            android.support.v7.widget.r0 r0 = r0.f894c
            if (r0 == 0) goto L7
            android.content.res.ColorStateList r0 = r0.f913a
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    android.graphics.PorterDuff.Mode c() {
            r0 = this;
            android.support.v7.widget.r0 r0 = r0.f894c
            if (r0 == 0) goto L7
            android.graphics.PorterDuff$Mode r0 = r0.f914b
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    boolean d() {
            r2 = this;
            android.widget.ImageView r2 = r2.f892a
            android.graphics.drawable.Drawable r2 = r2.getBackground()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L12
            boolean r2 = r2 instanceof android.graphics.drawable.RippleDrawable
            if (r2 == 0) goto L12
            r2 = 0
            return r2
        L12:
            r2 = 1
            return r2
    }
}
