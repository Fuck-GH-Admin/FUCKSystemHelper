package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.view.View f845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.support.v7.widget.j f846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f847c;
    private android.support.v7.widget.r0 d;
    private android.support.v7.widget.r0 e;
    private android.support.v7.widget.r0 f;

    e(android.view.View r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f847c = r0
            r1.f845a = r2
            android.support.v7.widget.j r2 = android.support.v7.widget.j.a()
            r1.f846b = r2
            return
    }

    private boolean b(android.graphics.drawable.Drawable r4) {
            r3 = this;
            android.support.v7.widget.r0 r0 = r3.f
            if (r0 != 0) goto Lb
            android.support.v7.widget.r0 r0 = new android.support.v7.widget.r0
            r0.<init>()
            r3.f = r0
        Lb:
            android.support.v7.widget.r0 r0 = r3.f
            r0.a()
            android.view.View r1 = r3.f845a
            android.content.res.ColorStateList r1 = b.b.c.g.q.b(r1)
            r2 = 1
            if (r1 == 0) goto L1d
            r0.d = r2
            r0.f913a = r1
        L1d:
            android.view.View r1 = r3.f845a
            android.graphics.PorterDuff$Mode r1 = b.b.c.g.q.c(r1)
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
            android.view.View r3 = r3.f845a
            int[] r3 = r3.getDrawableState()
            android.support.v7.widget.j.a(r4, r0, r3)
            return r2
    }

    private boolean d() {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 0
            r3 = 21
            if (r0 <= r3) goto Lf
            android.support.v7.widget.r0 r4 = r4.d
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
            android.view.View r0 = r2.f845a
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 == 0) goto L30
            boolean r1 = r2.d()
            if (r1 == 0) goto L15
            boolean r1 = r2.b(r0)
            if (r1 == 0) goto L15
            return
        L15:
            android.support.v7.widget.r0 r1 = r2.e
            if (r1 == 0) goto L23
            android.view.View r2 = r2.f845a
            int[] r2 = r2.getDrawableState()
            android.support.v7.widget.j.a(r0, r1, r2)
            goto L30
        L23:
            android.support.v7.widget.r0 r1 = r2.d
            if (r1 == 0) goto L30
            android.view.View r2 = r2.f845a
            int[] r2 = r2.getDrawableState()
            android.support.v7.widget.j.a(r0, r1, r2)
        L30:
            return
    }

    void a(int r3) {
            r2 = this;
            r2.f847c = r3
            android.support.v7.widget.j r0 = r2.f846b
            if (r0 == 0) goto L11
            android.view.View r1 = r2.f845a
            android.content.Context r1 = r1.getContext()
            android.content.res.ColorStateList r3 = r0.b(r1, r3)
            goto L12
        L11:
            r3 = 0
        L12:
            r2.a(r3)
            r2.a()
            return
    }

    void a(android.content.res.ColorStateList r2) {
            r1 = this;
            if (r2 == 0) goto L15
            android.support.v7.widget.r0 r0 = r1.d
            if (r0 != 0) goto Ld
            android.support.v7.widget.r0 r0 = new android.support.v7.widget.r0
            r0.<init>()
            r1.d = r0
        Ld:
            android.support.v7.widget.r0 r0 = r1.d
            r0.f913a = r2
            r2 = 1
            r0.d = r2
            goto L18
        L15:
            r2 = 0
            r1.d = r2
        L18:
            r1.a()
            return
    }

    void a(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            android.support.v7.widget.r0 r0 = r1.e
            if (r0 != 0) goto Lb
            android.support.v7.widget.r0 r0 = new android.support.v7.widget.r0
            r0.<init>()
            r1.e = r0
        Lb:
            android.support.v7.widget.r0 r0 = r1.e
            r0.f914b = r2
            r2 = 1
            r0.f915c = r2
            r1.a()
            return
    }

    void a(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r1 = -1
            r0.f847c = r1
            r1 = 0
            r0.a(r1)
            r0.a()
            return
    }

    void a(android.util.AttributeSet r4, int r5) {
            r3 = this;
            android.view.View r0 = r3.f845a
            android.content.Context r0 = r0.getContext()
            int[] r1 = b.b.d.a.j.ViewBackgroundHelper
            r2 = 0
            android.support.v7.widget.t0 r4 = android.support.v7.widget.t0.a(r0, r4, r1, r5, r2)
            int r5 = b.b.d.a.j.ViewBackgroundHelper_android_background     // Catch: java.lang.Throwable -> L60
            boolean r5 = r4.g(r5)     // Catch: java.lang.Throwable -> L60
            r0 = -1
            if (r5 == 0) goto L31
            int r5 = b.b.d.a.j.ViewBackgroundHelper_android_background     // Catch: java.lang.Throwable -> L60
            int r5 = r4.g(r5, r0)     // Catch: java.lang.Throwable -> L60
            r3.f847c = r5     // Catch: java.lang.Throwable -> L60
            android.support.v7.widget.j r5 = r3.f846b     // Catch: java.lang.Throwable -> L60
            android.view.View r1 = r3.f845a     // Catch: java.lang.Throwable -> L60
            android.content.Context r1 = r1.getContext()     // Catch: java.lang.Throwable -> L60
            int r2 = r3.f847c     // Catch: java.lang.Throwable -> L60
            android.content.res.ColorStateList r5 = r5.b(r1, r2)     // Catch: java.lang.Throwable -> L60
            if (r5 == 0) goto L31
            r3.a(r5)     // Catch: java.lang.Throwable -> L60
        L31:
            int r5 = b.b.d.a.j.ViewBackgroundHelper_backgroundTint     // Catch: java.lang.Throwable -> L60
            boolean r5 = r4.g(r5)     // Catch: java.lang.Throwable -> L60
            if (r5 == 0) goto L44
            android.view.View r5 = r3.f845a     // Catch: java.lang.Throwable -> L60
            int r1 = b.b.d.a.j.ViewBackgroundHelper_backgroundTint     // Catch: java.lang.Throwable -> L60
            android.content.res.ColorStateList r1 = r4.a(r1)     // Catch: java.lang.Throwable -> L60
            b.b.c.g.q.a(r5, r1)     // Catch: java.lang.Throwable -> L60
        L44:
            int r5 = b.b.d.a.j.ViewBackgroundHelper_backgroundTintMode     // Catch: java.lang.Throwable -> L60
            boolean r5 = r4.g(r5)     // Catch: java.lang.Throwable -> L60
            if (r5 == 0) goto L5c
            android.view.View r3 = r3.f845a     // Catch: java.lang.Throwable -> L60
            int r5 = b.b.d.a.j.ViewBackgroundHelper_backgroundTintMode     // Catch: java.lang.Throwable -> L60
            int r5 = r4.d(r5, r0)     // Catch: java.lang.Throwable -> L60
            r0 = 0
            android.graphics.PorterDuff$Mode r5 = android.support.v7.widget.c0.a(r5, r0)     // Catch: java.lang.Throwable -> L60
            b.b.c.g.q.a(r3, r5)     // Catch: java.lang.Throwable -> L60
        L5c:
            r4.a()
            return
        L60:
            r3 = move-exception
            r4.a()
            throw r3
    }

    android.content.res.ColorStateList b() {
            r0 = this;
            android.support.v7.widget.r0 r0 = r0.e
            if (r0 == 0) goto L7
            android.content.res.ColorStateList r0 = r0.f913a
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    void b(android.content.res.ColorStateList r2) {
            r1 = this;
            android.support.v7.widget.r0 r0 = r1.e
            if (r0 != 0) goto Lb
            android.support.v7.widget.r0 r0 = new android.support.v7.widget.r0
            r0.<init>()
            r1.e = r0
        Lb:
            android.support.v7.widget.r0 r0 = r1.e
            r0.f913a = r2
            r2 = 1
            r0.d = r2
            r1.a()
            return
    }

    android.graphics.PorterDuff.Mode c() {
            r0 = this;
            android.support.v7.widget.r0 r0 = r0.e
            if (r0 == 0) goto L7
            android.graphics.PorterDuff$Mode r0 = r0.f914b
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }
}
