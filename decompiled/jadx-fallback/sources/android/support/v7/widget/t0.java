package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
public class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.res.TypedArray f921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.util.TypedValue f922c;

    private t0(android.content.Context r1, android.content.res.TypedArray r2) {
            r0 = this;
            r0.<init>()
            r0.f920a = r1
            r0.f921b = r2
            return
    }

    public static android.support.v7.widget.t0 a(android.content.Context r1, int r2, int[] r3) {
            android.support.v7.widget.t0 r0 = new android.support.v7.widget.t0
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r2, r3)
            r0.<init>(r1, r2)
            return r0
    }

    public static android.support.v7.widget.t0 a(android.content.Context r1, android.util.AttributeSet r2, int[] r3) {
            android.support.v7.widget.t0 r0 = new android.support.v7.widget.t0
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r2, r3)
            r0.<init>(r1, r2)
            return r0
    }

    public static android.support.v7.widget.t0 a(android.content.Context r1, android.util.AttributeSet r2, int[] r3, int r4, int r5) {
            android.support.v7.widget.t0 r0 = new android.support.v7.widget.t0
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r2, r3, r4, r5)
            r0.<init>(r1, r2)
            return r0
    }

    public float a(int r1, float r2) {
            r0 = this;
            android.content.res.TypedArray r0 = r0.f921b
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public int a(int r1, int r2) {
            r0 = this;
            android.content.res.TypedArray r0 = r0.f921b
            int r0 = r0.getColor(r1, r2)
            return r0
    }

    public android.content.res.ColorStateList a(int r3) {
            r2 = this;
            android.content.res.TypedArray r0 = r2.f921b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L1a
            android.content.res.TypedArray r0 = r2.f921b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L1a
            android.content.Context r1 = r2.f920a
            android.content.res.ColorStateList r0 = b.b.d.b.a.a.b(r1, r0)
            if (r0 == 0) goto L1a
            return r0
        L1a:
            android.content.res.TypedArray r2 = r2.f921b
            android.content.res.ColorStateList r2 = r2.getColorStateList(r3)
            return r2
    }

    public android.graphics.Typeface a(int r3, int r4, b.b.c.a.d.f.a r5) {
            r2 = this;
            android.content.res.TypedArray r0 = r2.f921b
            r1 = 0
            int r3 = r0.getResourceId(r3, r1)
            if (r3 != 0) goto Lb
            r2 = 0
            return r2
        Lb:
            android.util.TypedValue r0 = r2.f922c
            if (r0 != 0) goto L16
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r2.f922c = r0
        L16:
            android.content.Context r0 = r2.f920a
            android.util.TypedValue r2 = r2.f922c
            android.graphics.Typeface r2 = b.b.c.a.d.f.a(r0, r3, r2, r4, r5)
            return r2
    }

    public void a() {
            r0 = this;
            android.content.res.TypedArray r0 = r0.f921b
            r0.recycle()
            return
    }

    public boolean a(int r1, boolean r2) {
            r0 = this;
            android.content.res.TypedArray r0 = r0.f921b
            boolean r0 = r0.getBoolean(r1, r2)
            return r0
    }

    public int b(int r1, int r2) {
            r0 = this;
            android.content.res.TypedArray r0 = r0.f921b
            int r0 = r0.getDimensionPixelOffset(r1, r2)
            return r0
    }

    public android.graphics.drawable.Drawable b(int r3) {
            r2 = this;
            android.content.res.TypedArray r0 = r2.f921b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L18
            android.content.res.TypedArray r0 = r2.f921b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L18
            android.content.Context r2 = r2.f920a
            android.graphics.drawable.Drawable r2 = b.b.d.b.a.a.c(r2, r0)
            return r2
        L18:
            android.content.res.TypedArray r2 = r2.f921b
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3)
            return r2
    }

    public int c(int r1, int r2) {
            r0 = this;
            android.content.res.TypedArray r0 = r0.f921b
            int r0 = r0.getDimensionPixelSize(r1, r2)
            return r0
    }

    public android.graphics.drawable.Drawable c(int r3) {
            r2 = this;
            android.content.res.TypedArray r0 = r2.f921b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L1d
            android.content.res.TypedArray r0 = r2.f921b
            r1 = 0
            int r3 = r0.getResourceId(r3, r1)
            if (r3 == 0) goto L1d
            android.support.v7.widget.j r0 = android.support.v7.widget.j.a()
            android.content.Context r2 = r2.f920a
            r1 = 1
            android.graphics.drawable.Drawable r2 = r0.a(r2, r3, r1)
            return r2
        L1d:
            r2 = 0
            return r2
    }

    public int d(int r1, int r2) {
            r0 = this;
            android.content.res.TypedArray r0 = r0.f921b
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public java.lang.String d(int r1) {
            r0 = this;
            android.content.res.TypedArray r0 = r0.f921b
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    public int e(int r1, int r2) {
            r0 = this;
            android.content.res.TypedArray r0 = r0.f921b
            int r0 = r0.getInteger(r1, r2)
            return r0
    }

    public java.lang.CharSequence e(int r1) {
            r0 = this;
            android.content.res.TypedArray r0 = r0.f921b
            java.lang.CharSequence r0 = r0.getText(r1)
            return r0
    }

    public int f(int r1, int r2) {
            r0 = this;
            android.content.res.TypedArray r0 = r0.f921b
            int r0 = r0.getLayoutDimension(r1, r2)
            return r0
    }

    public java.lang.CharSequence[] f(int r1) {
            r0 = this;
            android.content.res.TypedArray r0 = r0.f921b
            java.lang.CharSequence[] r0 = r0.getTextArray(r1)
            return r0
    }

    public int g(int r1, int r2) {
            r0 = this;
            android.content.res.TypedArray r0 = r0.f921b
            int r0 = r0.getResourceId(r1, r2)
            return r0
    }

    public boolean g(int r1) {
            r0 = this;
            android.content.res.TypedArray r0 = r0.f921b
            boolean r0 = r0.hasValue(r1)
            return r0
    }
}
