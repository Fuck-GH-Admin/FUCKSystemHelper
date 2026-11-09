package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.widget.TextView f944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.support.v7.widget.r0 f945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.support.v7.widget.r0 f946c;
    private android.support.v7.widget.r0 d;
    private android.support.v7.widget.r0 e;
    private android.support.v7.widget.r0 f;
    private android.support.v7.widget.r0 g;
    private final android.support.v7.widget.z h;
    private int i;
    private android.graphics.Typeface j;
    private boolean k;

    class a extends b.b.c.a.d.f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.ref.WeakReference f947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.support.v7.widget.x f948b;

        a(android.support.v7.widget.x r1, java.lang.ref.WeakReference r2) {
                r0 = this;
                r0.f948b = r1
                r0.f947a = r2
                r0.<init>()
                return
        }

        @Override // b.b.c.a.d.f.a
        public void a(int r1) {
                r0 = this;
                return
        }

        @Override // b.b.c.a.d.f.a
        public void a(android.graphics.Typeface r2) {
                r1 = this;
                android.support.v7.widget.x r0 = r1.f948b
                java.lang.ref.WeakReference r1 = r1.f947a
                r0.a(r1, r2)
                return
        }
    }

    x(android.widget.TextView r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.i = r0
            r1.f944a = r2
            android.support.v7.widget.z r2 = new android.support.v7.widget.z
            android.widget.TextView r0 = r1.f944a
            r2.<init>(r0)
            r1.h = r2
            return
    }

    private static android.support.v7.widget.r0 a(android.content.Context r0, android.support.v7.widget.j r1, int r2) {
            android.content.res.ColorStateList r0 = r1.b(r0, r2)
            if (r0 == 0) goto L11
            android.support.v7.widget.r0 r1 = new android.support.v7.widget.r0
            r1.<init>()
            r2 = 1
            r1.d = r2
            r1.f913a = r0
            return r1
        L11:
            r0 = 0
            return r0
    }

    private void a(android.content.Context r5, android.support.v7.widget.t0 r6) {
            r4 = this;
            int r0 = b.b.d.a.j.TextAppearance_android_textStyle
            int r1 = r4.i
            int r0 = r6.d(r0, r1)
            r4.i = r0
            int r0 = b.b.d.a.j.TextAppearance_android_fontFamily
            boolean r0 = r6.g(r0)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L41
            int r0 = b.b.d.a.j.TextAppearance_fontFamily
            boolean r0 = r6.g(r0)
            if (r0 == 0) goto L1d
            goto L41
        L1d:
            int r5 = b.b.d.a.j.TextAppearance_android_typeface
            boolean r5 = r6.g(r5)
            if (r5 == 0) goto L40
            r4.k = r1
            int r5 = b.b.d.a.j.TextAppearance_android_typeface
            int r5 = r6.d(r5, r2)
            if (r5 == r2) goto L3c
            r6 = 2
            if (r5 == r6) goto L39
            r6 = 3
            if (r5 == r6) goto L36
            goto L40
        L36:
            android.graphics.Typeface r5 = android.graphics.Typeface.MONOSPACE
            goto L3e
        L39:
            android.graphics.Typeface r5 = android.graphics.Typeface.SERIF
            goto L3e
        L3c:
            android.graphics.Typeface r5 = android.graphics.Typeface.SANS_SERIF
        L3e:
            r4.j = r5
        L40:
            return
        L41:
            r0 = 0
            r4.j = r0
            int r0 = b.b.d.a.j.TextAppearance_fontFamily
            boolean r0 = r6.g(r0)
            if (r0 == 0) goto L4f
            int r0 = b.b.d.a.j.TextAppearance_fontFamily
            goto L51
        L4f:
            int r0 = b.b.d.a.j.TextAppearance_android_fontFamily
        L51:
            boolean r5 = r5.isRestricted()
            if (r5 != 0) goto L70
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            android.widget.TextView r3 = r4.f944a
            r5.<init>(r3)
            android.support.v7.widget.x$a r3 = new android.support.v7.widget.x$a
            r3.<init>(r4, r5)
            int r5 = r4.i     // Catch: java.lang.Throwable -> L70
            android.graphics.Typeface r5 = r6.a(r0, r5, r3)     // Catch: java.lang.Throwable -> L70
            r4.j = r5     // Catch: java.lang.Throwable -> L70
            if (r5 != 0) goto L6e
            r1 = r2
        L6e:
            r4.k = r1     // Catch: java.lang.Throwable -> L70
        L70:
            android.graphics.Typeface r5 = r4.j
            if (r5 != 0) goto L82
            java.lang.String r5 = r6.d(r0)
            if (r5 == 0) goto L82
            int r6 = r4.i
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r5, r6)
            r4.j = r5
        L82:
            return
    }

    private void a(android.graphics.drawable.Drawable r1, android.support.v7.widget.r0 r2) {
            r0 = this;
            if (r1 == 0) goto Ld
            if (r2 == 0) goto Ld
            android.widget.TextView r0 = r0.f944a
            int[] r0 = r0.getDrawableState()
            android.support.v7.widget.j.a(r1, r2, r0)
        Ld:
            return
    }

    private void b(int r1, float r2) {
            r0 = this;
            android.support.v7.widget.z r0 = r0.h
            r0.a(r1, r2)
            return
    }

    void a() {
            r5 = this;
            android.support.v7.widget.r0 r0 = r5.f945b
            r1 = 2
            r2 = 0
            if (r0 != 0) goto L12
            android.support.v7.widget.r0 r0 = r5.f946c
            if (r0 != 0) goto L12
            android.support.v7.widget.r0 r0 = r5.d
            if (r0 != 0) goto L12
            android.support.v7.widget.r0 r0 = r5.e
            if (r0 == 0) goto L36
        L12:
            android.widget.TextView r0 = r5.f944a
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawables()
            r3 = r0[r2]
            android.support.v7.widget.r0 r4 = r5.f945b
            r5.a(r3, r4)
            r3 = 1
            r3 = r0[r3]
            android.support.v7.widget.r0 r4 = r5.f946c
            r5.a(r3, r4)
            r3 = r0[r1]
            android.support.v7.widget.r0 r4 = r5.d
            r5.a(r3, r4)
            r3 = 3
            r0 = r0[r3]
            android.support.v7.widget.r0 r3 = r5.e
            r5.a(r0, r3)
        L36:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 17
            if (r0 < r3) goto L58
            android.support.v7.widget.r0 r0 = r5.f
            if (r0 != 0) goto L44
            android.support.v7.widget.r0 r0 = r5.g
            if (r0 == 0) goto L58
        L44:
            android.widget.TextView r0 = r5.f944a
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            r2 = r0[r2]
            android.support.v7.widget.r0 r3 = r5.f
            r5.a(r2, r3)
            r0 = r0[r1]
            android.support.v7.widget.r0 r1 = r5.g
            r5.a(r0, r1)
        L58:
            return
    }

    void a(int r1) {
            r0 = this;
            android.support.v7.widget.z r0 = r0.h
            r0.a(r1)
            return
    }

    void a(int r2, float r3) {
            r1 = this;
            boolean r0 = android.support.v4.widget.b.f644a
            if (r0 != 0) goto Ld
            boolean r0 = r1.h()
            if (r0 != 0) goto Ld
            r1.b(r2, r3)
        Ld:
            return
    }

    void a(int r1, int r2, int r3, int r4) {
            r0 = this;
            android.support.v7.widget.z r0 = r0.h
            r0.a(r1, r2, r3, r4)
            return
    }

    void a(android.content.Context r4, int r5) {
            r3 = this;
            int[] r0 = b.b.d.a.j.TextAppearance
            android.support.v7.widget.t0 r5 = android.support.v7.widget.t0.a(r4, r5, r0)
            int r0 = b.b.d.a.j.TextAppearance_textAllCaps
            boolean r0 = r5.g(r0)
            r1 = 0
            if (r0 == 0) goto L18
            int r0 = b.b.d.a.j.TextAppearance_textAllCaps
            boolean r0 = r5.a(r0, r1)
            r3.a(r0)
        L18:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r0 >= r2) goto L33
            int r0 = b.b.d.a.j.TextAppearance_android_textColor
            boolean r0 = r5.g(r0)
            if (r0 == 0) goto L33
            int r0 = b.b.d.a.j.TextAppearance_android_textColor
            android.content.res.ColorStateList r0 = r5.a(r0)
            if (r0 == 0) goto L33
            android.widget.TextView r2 = r3.f944a
            r2.setTextColor(r0)
        L33:
            int r0 = b.b.d.a.j.TextAppearance_android_textSize
            boolean r0 = r5.g(r0)
            if (r0 == 0) goto L4a
            int r0 = b.b.d.a.j.TextAppearance_android_textSize
            r2 = -1
            int r0 = r5.c(r0, r2)
            if (r0 != 0) goto L4a
            android.widget.TextView r0 = r3.f944a
            r2 = 0
            r0.setTextSize(r1, r2)
        L4a:
            r3.a(r4, r5)
            r5.a()
            android.graphics.Typeface r4 = r3.j
            if (r4 == 0) goto L5b
            android.widget.TextView r5 = r3.f944a
            int r3 = r3.i
            r5.setTypeface(r4, r3)
        L5b:
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    void a(android.util.AttributeSet r18, int r19) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            android.widget.TextView r3 = r0.f944a
            android.content.Context r3 = r3.getContext()
            android.support.v7.widget.j r4 = android.support.v7.widget.j.a()
            int[] r5 = b.b.d.a.j.AppCompatTextHelper
            r6 = 0
            android.support.v7.widget.t0 r5 = android.support.v7.widget.t0.a(r3, r1, r5, r2, r6)
            int r7 = b.b.d.a.j.AppCompatTextHelper_android_textAppearance
            r8 = -1
            int r7 = r5.g(r7, r8)
            int r9 = b.b.d.a.j.AppCompatTextHelper_android_drawableLeft
            boolean r9 = r5.g(r9)
            if (r9 == 0) goto L32
            int r9 = b.b.d.a.j.AppCompatTextHelper_android_drawableLeft
            int r9 = r5.g(r9, r6)
            android.support.v7.widget.r0 r9 = a(r3, r4, r9)
            r0.f945b = r9
        L32:
            int r9 = b.b.d.a.j.AppCompatTextHelper_android_drawableTop
            boolean r9 = r5.g(r9)
            if (r9 == 0) goto L46
            int r9 = b.b.d.a.j.AppCompatTextHelper_android_drawableTop
            int r9 = r5.g(r9, r6)
            android.support.v7.widget.r0 r9 = a(r3, r4, r9)
            r0.f946c = r9
        L46:
            int r9 = b.b.d.a.j.AppCompatTextHelper_android_drawableRight
            boolean r9 = r5.g(r9)
            if (r9 == 0) goto L5a
            int r9 = b.b.d.a.j.AppCompatTextHelper_android_drawableRight
            int r9 = r5.g(r9, r6)
            android.support.v7.widget.r0 r9 = a(r3, r4, r9)
            r0.d = r9
        L5a:
            int r9 = b.b.d.a.j.AppCompatTextHelper_android_drawableBottom
            boolean r9 = r5.g(r9)
            if (r9 == 0) goto L6e
            int r9 = b.b.d.a.j.AppCompatTextHelper_android_drawableBottom
            int r9 = r5.g(r9, r6)
            android.support.v7.widget.r0 r9 = a(r3, r4, r9)
            r0.e = r9
        L6e:
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 17
            if (r9 < r10) goto L9c
            int r9 = b.b.d.a.j.AppCompatTextHelper_android_drawableStart
            boolean r9 = r5.g(r9)
            if (r9 == 0) goto L88
            int r9 = b.b.d.a.j.AppCompatTextHelper_android_drawableStart
            int r9 = r5.g(r9, r6)
            android.support.v7.widget.r0 r9 = a(r3, r4, r9)
            r0.f = r9
        L88:
            int r9 = b.b.d.a.j.AppCompatTextHelper_android_drawableEnd
            boolean r9 = r5.g(r9)
            if (r9 == 0) goto L9c
            int r9 = b.b.d.a.j.AppCompatTextHelper_android_drawableEnd
            int r9 = r5.g(r9, r6)
            android.support.v7.widget.r0 r4 = a(r3, r4, r9)
            r0.g = r4
        L9c:
            r5.a()
            android.widget.TextView r4 = r0.f944a
            android.text.method.TransformationMethod r4 = r4.getTransformationMethod()
            boolean r4 = r4 instanceof android.text.method.PasswordTransformationMethod
            r5 = 1
            r9 = 23
            r10 = 0
            if (r7 == r8) goto L108
            int[] r11 = b.b.d.a.j.TextAppearance
            android.support.v7.widget.t0 r7 = android.support.v7.widget.t0.a(r3, r7, r11)
            if (r4 != 0) goto Lc5
            int r11 = b.b.d.a.j.TextAppearance_textAllCaps
            boolean r11 = r7.g(r11)
            if (r11 == 0) goto Lc5
            int r11 = b.b.d.a.j.TextAppearance_textAllCaps
            boolean r11 = r7.a(r11, r6)
            r12 = r5
            goto Lc7
        Lc5:
            r11 = r6
            r12 = r11
        Lc7:
            r0.a(r3, r7)
            int r13 = android.os.Build.VERSION.SDK_INT
            if (r13 >= r9) goto L102
            int r13 = b.b.d.a.j.TextAppearance_android_textColor
            boolean r13 = r7.g(r13)
            if (r13 == 0) goto Ldd
            int r13 = b.b.d.a.j.TextAppearance_android_textColor
            android.content.res.ColorStateList r13 = r7.a(r13)
            goto Lde
        Ldd:
            r13 = r10
        Lde:
            int r14 = b.b.d.a.j.TextAppearance_android_textColorHint
            boolean r14 = r7.g(r14)
            if (r14 == 0) goto Led
            int r14 = b.b.d.a.j.TextAppearance_android_textColorHint
            android.content.res.ColorStateList r14 = r7.a(r14)
            goto Lee
        Led:
            r14 = r10
        Lee:
            int r15 = b.b.d.a.j.TextAppearance_android_textColorLink
            boolean r15 = r7.g(r15)
            if (r15 == 0) goto Lfc
            int r10 = b.b.d.a.j.TextAppearance_android_textColorLink
            android.content.res.ColorStateList r10 = r7.a(r10)
        Lfc:
            r16 = r13
            r13 = r10
            r10 = r16
            goto L104
        L102:
            r13 = r10
            r14 = r13
        L104:
            r7.a()
            goto L10c
        L108:
            r11 = r6
            r12 = r11
            r13 = r10
            r14 = r13
        L10c:
            int[] r7 = b.b.d.a.j.TextAppearance
            android.support.v7.widget.t0 r7 = android.support.v7.widget.t0.a(r3, r1, r7, r2, r6)
            if (r4 != 0) goto L123
            int r15 = b.b.d.a.j.TextAppearance_textAllCaps
            boolean r15 = r7.g(r15)
            if (r15 == 0) goto L123
            int r11 = b.b.d.a.j.TextAppearance_textAllCaps
            boolean r11 = r7.a(r11, r6)
            goto L124
        L123:
            r5 = r12
        L124:
            int r12 = android.os.Build.VERSION.SDK_INT
            if (r12 >= r9) goto L152
            int r9 = b.b.d.a.j.TextAppearance_android_textColor
            boolean r9 = r7.g(r9)
            if (r9 == 0) goto L136
            int r9 = b.b.d.a.j.TextAppearance_android_textColor
            android.content.res.ColorStateList r10 = r7.a(r9)
        L136:
            int r9 = b.b.d.a.j.TextAppearance_android_textColorHint
            boolean r9 = r7.g(r9)
            if (r9 == 0) goto L144
            int r9 = b.b.d.a.j.TextAppearance_android_textColorHint
            android.content.res.ColorStateList r14 = r7.a(r9)
        L144:
            int r9 = b.b.d.a.j.TextAppearance_android_textColorLink
            boolean r9 = r7.g(r9)
            if (r9 == 0) goto L152
            int r9 = b.b.d.a.j.TextAppearance_android_textColorLink
            android.content.res.ColorStateList r13 = r7.a(r9)
        L152:
            int r9 = android.os.Build.VERSION.SDK_INT
            r12 = 28
            if (r9 < r12) goto L16e
            int r9 = b.b.d.a.j.TextAppearance_android_textSize
            boolean r9 = r7.g(r9)
            if (r9 == 0) goto L16e
            int r9 = b.b.d.a.j.TextAppearance_android_textSize
            int r9 = r7.c(r9, r8)
            if (r9 != 0) goto L16e
            android.widget.TextView r9 = r0.f944a
            r12 = 0
            r9.setTextSize(r6, r12)
        L16e:
            r0.a(r3, r7)
            r7.a()
            if (r10 == 0) goto L17b
            android.widget.TextView r7 = r0.f944a
            r7.setTextColor(r10)
        L17b:
            if (r14 == 0) goto L182
            android.widget.TextView r7 = r0.f944a
            r7.setHintTextColor(r14)
        L182:
            if (r13 == 0) goto L189
            android.widget.TextView r7 = r0.f944a
            r7.setLinkTextColor(r13)
        L189:
            if (r4 != 0) goto L190
            if (r5 == 0) goto L190
            r0.a(r11)
        L190:
            android.graphics.Typeface r4 = r0.j
            if (r4 == 0) goto L19b
            android.widget.TextView r5 = r0.f944a
            int r7 = r0.i
            r5.setTypeface(r4, r7)
        L19b:
            android.support.v7.widget.z r4 = r0.h
            r4.a(r1, r2)
            boolean r2 = android.support.v4.widget.b.f644a
            if (r2 == 0) goto L1df
            android.support.v7.widget.z r2 = r0.h
            int r2 = r2.f()
            if (r2 == 0) goto L1df
            android.support.v7.widget.z r2 = r0.h
            int[] r2 = r2.e()
            int r4 = r2.length
            if (r4 <= 0) goto L1df
            android.widget.TextView r4 = r0.f944a
            int r4 = r4.getAutoSizeStepGranularity()
            float r4 = (float) r4
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 == 0) goto L1da
            android.widget.TextView r2 = r0.f944a
            android.support.v7.widget.z r4 = r0.h
            int r4 = r4.c()
            android.support.v7.widget.z r5 = r0.h
            int r5 = r5.b()
            android.support.v7.widget.z r7 = r0.h
            int r7 = r7.d()
            r2.setAutoSizeTextTypeUniformWithConfiguration(r4, r5, r7, r6)
            goto L1df
        L1da:
            android.widget.TextView r4 = r0.f944a
            r4.setAutoSizeTextTypeUniformWithPresetSizes(r2, r6)
        L1df:
            int[] r2 = b.b.d.a.j.AppCompatTextView
            android.support.v7.widget.t0 r1 = android.support.v7.widget.t0.a(r3, r1, r2)
            int r2 = b.b.d.a.j.AppCompatTextView_firstBaselineToTopHeight
            int r2 = r1.c(r2, r8)
            int r3 = b.b.d.a.j.AppCompatTextView_lastBaselineToBottomHeight
            int r3 = r1.c(r3, r8)
            int r4 = b.b.d.a.j.AppCompatTextView_lineHeight
            int r4 = r1.c(r4, r8)
            r1.a()
            if (r2 == r8) goto L201
            android.widget.TextView r1 = r0.f944a
            android.support.v4.widget.l.a(r1, r2)
        L201:
            if (r3 == r8) goto L208
            android.widget.TextView r1 = r0.f944a
            android.support.v4.widget.l.b(r1, r3)
        L208:
            if (r4 == r8) goto L20f
            android.widget.TextView r0 = r0.f944a
            android.support.v4.widget.l.c(r0, r4)
        L20f:
            return
    }

    void a(java.lang.ref.WeakReference<android.widget.TextView> r2, android.graphics.Typeface r3) {
            r1 = this;
            boolean r0 = r1.k
            if (r0 == 0) goto L13
            r1.j = r3
            java.lang.Object r2 = r2.get()
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L13
            int r1 = r1.i
            r2.setTypeface(r3, r1)
        L13:
            return
    }

    void a(boolean r1) {
            r0 = this;
            android.widget.TextView r0 = r0.f944a
            r0.setAllCaps(r1)
            return
    }

    void a(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            boolean r1 = android.support.v4.widget.b.f644a
            if (r1 != 0) goto L7
            r0.b()
        L7:
            return
    }

    void a(int[] r1, int r2) {
            r0 = this;
            android.support.v7.widget.z r0 = r0.h
            r0.a(r1, r2)
            return
    }

    void b() {
            r0 = this;
            android.support.v7.widget.z r0 = r0.h
            r0.a()
            return
    }

    int c() {
            r0 = this;
            android.support.v7.widget.z r0 = r0.h
            int r0 = r0.b()
            return r0
    }

    int d() {
            r0 = this;
            android.support.v7.widget.z r0 = r0.h
            int r0 = r0.c()
            return r0
    }

    int e() {
            r0 = this;
            android.support.v7.widget.z r0 = r0.h
            int r0 = r0.d()
            return r0
    }

    int[] f() {
            r0 = this;
            android.support.v7.widget.z r0 = r0.h
            int[] r0 = r0.e()
            return r0
    }

    int g() {
            r0 = this;
            android.support.v7.widget.z r0 = r0.h
            int r0 = r0.f()
            return r0
    }

    boolean h() {
            r0 = this;
            android.support.v7.widget.z r0 = r0.h
            boolean r0 = r0.g()
            return r0
    }
}
