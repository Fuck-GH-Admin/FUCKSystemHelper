package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.widget.CompoundButton f870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.content.res.ColorStateList f871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.graphics.PorterDuff.Mode f872c;
    private boolean d;
    private boolean e;
    private boolean f;

    i(android.widget.CompoundButton r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f871b = r0
            r1.f872c = r0
            r0 = 0
            r1.d = r0
            r1.e = r0
            r1.f870a = r2
            return
    }

    int a(int r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r0 >= r1) goto L13
            android.widget.CompoundButton r2 = r2.f870a
            android.graphics.drawable.Drawable r2 = android.support.v4.widget.c.a(r2)
            if (r2 == 0) goto L13
            int r2 = r2.getIntrinsicWidth()
            int r3 = r3 + r2
        L13:
            return r3
    }

    void a() {
            r2 = this;
            android.widget.CompoundButton r0 = r2.f870a
            android.graphics.drawable.Drawable r0 = android.support.v4.widget.c.a(r0)
            if (r0 == 0) goto L3e
            boolean r1 = r2.d
            if (r1 != 0) goto L10
            boolean r1 = r2.e
            if (r1 == 0) goto L3e
        L10:
            android.graphics.drawable.Drawable r0 = android.support.v4.graphics.drawable.a.g(r0)
            android.graphics.drawable.Drawable r0 = r0.mutate()
            boolean r1 = r2.d
            if (r1 == 0) goto L21
            android.content.res.ColorStateList r1 = r2.f871b
            android.support.v4.graphics.drawable.a.a(r0, r1)
        L21:
            boolean r1 = r2.e
            if (r1 == 0) goto L2a
            android.graphics.PorterDuff$Mode r1 = r2.f872c
            android.support.v4.graphics.drawable.a.a(r0, r1)
        L2a:
            boolean r1 = r0.isStateful()
            if (r1 == 0) goto L39
            android.widget.CompoundButton r1 = r2.f870a
            int[] r1 = r1.getDrawableState()
            r0.setState(r1)
        L39:
            android.widget.CompoundButton r2 = r2.f870a
            r2.setButtonDrawable(r0)
        L3e:
            return
    }

    void a(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.f871b = r1
            r1 = 1
            r0.d = r1
            r0.a()
            return
    }

    void a(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            r0.f872c = r1
            r1 = 1
            r0.e = r1
            r0.a()
            return
    }

    void a(android.util.AttributeSet r4, int r5) {
            r3 = this;
            android.widget.CompoundButton r0 = r3.f870a
            android.content.Context r0 = r0.getContext()
            int[] r1 = b.b.d.a.j.CompoundButton
            r2 = 0
            android.content.res.TypedArray r4 = r0.obtainStyledAttributes(r4, r1, r5, r2)
            int r5 = b.b.d.a.j.CompoundButton_android_button     // Catch: java.lang.Throwable -> L5c
            boolean r5 = r4.hasValue(r5)     // Catch: java.lang.Throwable -> L5c
            if (r5 == 0) goto L2c
            int r5 = b.b.d.a.j.CompoundButton_android_button     // Catch: java.lang.Throwable -> L5c
            int r5 = r4.getResourceId(r5, r2)     // Catch: java.lang.Throwable -> L5c
            if (r5 == 0) goto L2c
            android.widget.CompoundButton r0 = r3.f870a     // Catch: java.lang.Throwable -> L5c
            android.widget.CompoundButton r1 = r3.f870a     // Catch: java.lang.Throwable -> L5c
            android.content.Context r1 = r1.getContext()     // Catch: java.lang.Throwable -> L5c
            android.graphics.drawable.Drawable r5 = b.b.d.b.a.a.c(r1, r5)     // Catch: java.lang.Throwable -> L5c
            r0.setButtonDrawable(r5)     // Catch: java.lang.Throwable -> L5c
        L2c:
            int r5 = b.b.d.a.j.CompoundButton_buttonTint     // Catch: java.lang.Throwable -> L5c
            boolean r5 = r4.hasValue(r5)     // Catch: java.lang.Throwable -> L5c
            if (r5 == 0) goto L3f
            android.widget.CompoundButton r5 = r3.f870a     // Catch: java.lang.Throwable -> L5c
            int r0 = b.b.d.a.j.CompoundButton_buttonTint     // Catch: java.lang.Throwable -> L5c
            android.content.res.ColorStateList r0 = r4.getColorStateList(r0)     // Catch: java.lang.Throwable -> L5c
            android.support.v4.widget.c.a(r5, r0)     // Catch: java.lang.Throwable -> L5c
        L3f:
            int r5 = b.b.d.a.j.CompoundButton_buttonTintMode     // Catch: java.lang.Throwable -> L5c
            boolean r5 = r4.hasValue(r5)     // Catch: java.lang.Throwable -> L5c
            if (r5 == 0) goto L58
            android.widget.CompoundButton r3 = r3.f870a     // Catch: java.lang.Throwable -> L5c
            int r5 = b.b.d.a.j.CompoundButton_buttonTintMode     // Catch: java.lang.Throwable -> L5c
            r0 = -1
            int r5 = r4.getInt(r5, r0)     // Catch: java.lang.Throwable -> L5c
            r0 = 0
            android.graphics.PorterDuff$Mode r5 = android.support.v7.widget.c0.a(r5, r0)     // Catch: java.lang.Throwable -> L5c
            android.support.v4.widget.c.a(r3, r5)     // Catch: java.lang.Throwable -> L5c
        L58:
            r4.recycle()
            return
        L5c:
            r3 = move-exception
            r4.recycle()
            throw r3
    }

    android.content.res.ColorStateList b() {
            r0 = this;
            android.content.res.ColorStateList r0 = r0.f871b
            return r0
    }

    android.graphics.PorterDuff.Mode c() {
            r0 = this;
            android.graphics.PorterDuff$Mode r0 = r0.f872c
            return r0
    }

    void d() {
            r1 = this;
            boolean r0 = r1.f
            if (r0 == 0) goto L8
            r0 = 0
            r1.f = r0
            return
        L8:
            r0 = 1
            r1.f = r0
            r1.a()
            return
    }
}
