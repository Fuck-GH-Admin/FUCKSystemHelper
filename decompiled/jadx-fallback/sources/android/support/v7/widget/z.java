package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
class z {
    private static final android.graphics.RectF k = null;
    private static java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.reflect.Method> l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f958c;
    private float d;
    private float e;
    private int[] f;
    private boolean g;
    private android.text.TextPaint h;
    private final android.widget.TextView i;
    private final android.content.Context j;

    static {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            android.support.v7.widget.z.k = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            android.support.v7.widget.z.l = r0
            return
    }

    z(android.widget.TextView r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f956a = r0
            r2.f957b = r0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.f958c = r1
            r2.d = r1
            r2.e = r1
            int[] r1 = new int[r0]
            r2.f = r1
            r2.g = r0
            r2.i = r3
            android.content.Context r3 = r3.getContext()
            r2.j = r3
            return
    }

    private int a(android.graphics.RectF r6) {
            r5 = this;
            int[] r0 = r5.f
            int r0 = r0.length
            if (r0 == 0) goto L27
            r1 = 0
            r2 = 1
            int r0 = r0 - r2
        L8:
            r4 = r2
            r2 = r1
            r1 = r4
        Lb:
            if (r1 > r0) goto L22
            int r2 = r1 + r0
            int r2 = r2 / 2
            int[] r3 = r5.f
            r3 = r3[r2]
            boolean r3 = r5.a(r3, r6)
            if (r3 == 0) goto L1e
            int r2 = r2 + 1
            goto L8
        L1e:
            int r2 = r2 + (-1)
            r0 = r2
            goto Lb
        L22:
            int[] r5 = r5.f
            r5 = r5[r2]
            return r5
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "No available text sizes to choose from."
            r5.<init>(r6)
            throw r5
    }

    private android.text.StaticLayout a(java.lang.CharSequence r12, android.text.Layout.Alignment r13, int r14) {
            r11 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L19
            android.widget.TextView r0 = r11.i
            float r0 = r0.getLineSpacingMultiplier()
            android.widget.TextView r1 = r11.i
            float r1 = r1.getLineSpacingExtra()
            android.widget.TextView r2 = r11.i
            boolean r2 = r2.getIncludeFontPadding()
            goto L53
        L19:
            android.widget.TextView r0 = r11.i
            r1 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.String r2 = "getLineSpacingMultiplier"
            java.lang.Object r0 = r11.a(r0, r2, r1)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            android.widget.TextView r1 = r11.i
            r2 = 0
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.String r3 = "getLineSpacingExtra"
            java.lang.Object r1 = r11.a(r1, r3, r2)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            android.widget.TextView r2 = r11.i
            r3 = 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r4 = "getIncludeFontPadding"
            java.lang.Object r2 = r11.a(r2, r4, r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
        L53:
            r8 = r0
            r9 = r1
            r10 = r2
            android.text.StaticLayout r0 = new android.text.StaticLayout
            android.text.TextPaint r5 = r11.h
            r3 = r0
            r4 = r12
            r6 = r14
            r7 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r0
    }

    private android.text.StaticLayout a(java.lang.CharSequence r5, android.text.Layout.Alignment r6, int r7, int r8) {
            r4 = this;
            android.widget.TextView r0 = r4.i
            android.text.TextDirectionHeuristic r1 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            java.lang.String r2 = "getTextDirectionHeuristic"
            java.lang.Object r0 = r4.a(r0, r2, r1)
            android.text.TextDirectionHeuristic r0 = (android.text.TextDirectionHeuristic) r0
            int r1 = r5.length()
            android.text.TextPaint r2 = r4.h
            r3 = 0
            android.text.StaticLayout$Builder r5 = android.text.StaticLayout.Builder.obtain(r5, r3, r1, r2, r7)
            android.text.StaticLayout$Builder r5 = r5.setAlignment(r6)
            android.widget.TextView r6 = r4.i
            float r6 = r6.getLineSpacingExtra()
            android.widget.TextView r7 = r4.i
            float r7 = r7.getLineSpacingMultiplier()
            android.text.StaticLayout$Builder r5 = r5.setLineSpacing(r6, r7)
            android.widget.TextView r6 = r4.i
            boolean r6 = r6.getIncludeFontPadding()
            android.text.StaticLayout$Builder r5 = r5.setIncludePad(r6)
            android.widget.TextView r6 = r4.i
            int r6 = r6.getBreakStrategy()
            android.text.StaticLayout$Builder r5 = r5.setBreakStrategy(r6)
            android.widget.TextView r4 = r4.i
            int r4 = r4.getHyphenationFrequency()
            android.text.StaticLayout$Builder r4 = r5.setHyphenationFrequency(r4)
            r5 = -1
            if (r8 != r5) goto L4f
            r8 = 2147483647(0x7fffffff, float:NaN)
        L4f:
            android.text.StaticLayout$Builder r4 = r4.setMaxLines(r8)
            android.text.StaticLayout$Builder r4 = r4.setTextDirection(r0)
            android.text.StaticLayout r4 = r4.build()
            return r4
    }

    private <T> T a(java.lang.Object r4, java.lang.String r5, T r6) {
            r3 = this;
            r0 = 0
            java.lang.reflect.Method r3 = r3.a(r5)     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> Le
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> Le
            java.lang.Object r6 = r3.invoke(r4, r1)     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> Le
            goto L2b
        Lc:
            r3 = move-exception
            goto L2c
        Le:
            r3 = move-exception
            r0 = 1
            java.lang.String r4 = "ACTVAutoSizeHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc
            r1.<init>()     // Catch: java.lang.Throwable -> Lc
            java.lang.String r2 = "Failed to invoke TextView#"
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc
            r1.append(r5)     // Catch: java.lang.Throwable -> Lc
            java.lang.String r5 = "() method"
            r1.append(r5)     // Catch: java.lang.Throwable -> Lc
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> Lc
            android.util.Log.w(r4, r5, r3)     // Catch: java.lang.Throwable -> Lc
        L2b:
            return r6
        L2c:
            throw r3
    }

    private java.lang.reflect.Method a(java.lang.String r3) {
            r2 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.reflect.Method> r2 = android.support.v7.widget.z.l     // Catch: java.lang.Exception -> L1f
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Exception -> L1f
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch: java.lang.Exception -> L1f
            if (r2 != 0) goto L1e
            java.lang.Class<android.widget.TextView> r2 = android.widget.TextView.class
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L1f
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r0)     // Catch: java.lang.Exception -> L1f
            if (r2 == 0) goto L1e
            r0 = 1
            r2.setAccessible(r0)     // Catch: java.lang.Exception -> L1f
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.reflect.Method> r0 = android.support.v7.widget.z.l     // Catch: java.lang.Exception -> L1f
            r0.put(r3, r2)     // Catch: java.lang.Exception -> L1f
        L1e:
            return r2
        L1f:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to retrieve TextView#"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "() method"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "ACTVAutoSizeHelper"
            android.util.Log.w(r0, r3, r2)
            r2 = 0
            return r2
    }

    private void a(float r4) {
            r3 = this;
            android.widget.TextView r0 = r3.i
            android.text.TextPaint r0 = r0.getPaint()
            float r0 = r0.getTextSize()
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 == 0) goto L5a
            android.widget.TextView r0 = r3.i
            android.text.TextPaint r0 = r0.getPaint()
            r0.setTextSize(r4)
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 18
            r1 = 0
            if (r4 < r0) goto L25
            android.widget.TextView r4 = r3.i
            boolean r4 = r4.isInLayout()
            goto L26
        L25:
            r4 = r1
        L26:
            android.widget.TextView r0 = r3.i
            android.text.Layout r0 = r0.getLayout()
            if (r0 == 0) goto L5a
            r3.f957b = r1
            java.lang.String r0 = "nullLayouts"
            java.lang.reflect.Method r0 = r3.a(r0)     // Catch: java.lang.Exception -> L40
            if (r0 == 0) goto L48
            android.widget.TextView r2 = r3.i     // Catch: java.lang.Exception -> L40
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L40
            r0.invoke(r2, r1)     // Catch: java.lang.Exception -> L40
            goto L48
        L40:
            r0 = move-exception
            java.lang.String r1 = "ACTVAutoSizeHelper"
            java.lang.String r2 = "Failed to invoke TextView#nullLayouts() method"
            android.util.Log.w(r1, r2, r0)
        L48:
            if (r4 != 0) goto L50
            android.widget.TextView r4 = r3.i
            r4.requestLayout()
            goto L55
        L50:
            android.widget.TextView r4 = r3.i
            r4.forceLayout()
        L55:
            android.widget.TextView r3 = r3.i
            r3.invalidate()
        L5a:
            return
    }

    private void a(float r4, float r5, float r6) {
            r3 = this;
            r0 = 0
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            java.lang.String r2 = "px) is less or equal to (0px)"
            if (r1 <= 0) goto L5f
            int r1 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r1 <= 0) goto L36
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L1c
            r0 = 1
            r3.f956a = r0
            r3.d = r4
            r3.e = r5
            r3.f958c = r6
            r4 = 0
            r3.g = r4
            return
        L1c:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "The auto-size step granularity ("
            r4.append(r5)
            r4.append(r6)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L36:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Maximum auto-size text size ("
            r6.append(r0)
            r6.append(r5)
            java.lang.String r5 = "px) is less or equal to minimum auto-size "
            r6.append(r5)
            java.lang.String r5 = "text size ("
            r6.append(r5)
            r6.append(r4)
            java.lang.String r4 = "px)"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r3.<init>(r4)
            throw r3
        L5f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Minimum auto-size text size ("
            r5.append(r6)
            r5.append(r4)
            r5.append(r2)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4)
            throw r3
    }

    private void a(android.content.res.TypedArray r5) {
            r4 = this;
            int r0 = r5.length()
            int[] r1 = new int[r0]
            if (r0 <= 0) goto L1e
            r2 = 0
        L9:
            if (r2 >= r0) goto L15
            r3 = -1
            int r3 = r5.getDimensionPixelSize(r2, r3)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L9
        L15:
            int[] r5 = r4.a(r1)
            r4.f = r5
            r4.j()
        L1e:
            return
    }

    private boolean a(int r6, android.graphics.RectF r7) {
            r5 = this;
            android.widget.TextView r0 = r5.i
            java.lang.CharSequence r0 = r0.getText()
            android.widget.TextView r1 = r5.i
            android.text.method.TransformationMethod r1 = r1.getTransformationMethod()
            if (r1 == 0) goto L17
            android.widget.TextView r2 = r5.i
            java.lang.CharSequence r1 = r1.getTransformation(r0, r2)
            if (r1 == 0) goto L17
            r0 = r1
        L17:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 16
            r3 = -1
            if (r1 < r2) goto L25
            android.widget.TextView r1 = r5.i
            int r1 = r1.getMaxLines()
            goto L26
        L25:
            r1 = r3
        L26:
            android.text.TextPaint r2 = r5.h
            if (r2 != 0) goto L32
            android.text.TextPaint r2 = new android.text.TextPaint
            r2.<init>()
            r5.h = r2
            goto L35
        L32:
            r2.reset()
        L35:
            android.text.TextPaint r2 = r5.h
            android.widget.TextView r4 = r5.i
            android.text.TextPaint r4 = r4.getPaint()
            r2.set(r4)
            android.text.TextPaint r2 = r5.h
            float r6 = (float) r6
            r2.setTextSize(r6)
            android.widget.TextView r6 = r5.i
            android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_NORMAL
            java.lang.String r4 = "getLayoutAlignment"
            java.lang.Object r6 = r5.a(r6, r4, r2)
            android.text.Layout$Alignment r6 = (android.text.Layout.Alignment) r6
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r2 < r4) goto L63
            float r2 = r7.right
            int r2 = java.lang.Math.round(r2)
            android.text.StaticLayout r5 = r5.a(r0, r6, r2, r1)
            goto L6d
        L63:
            float r2 = r7.right
            int r2 = java.lang.Math.round(r2)
            android.text.StaticLayout r5 = r5.a(r0, r6, r2)
        L6d:
            r6 = 0
            r2 = 1
            if (r1 == r3) goto L87
            int r3 = r5.getLineCount()
            if (r3 > r1) goto L86
            int r1 = r5.getLineCount()
            int r1 = r1 - r2
            int r1 = r5.getLineEnd(r1)
            int r0 = r0.length()
            if (r1 == r0) goto L87
        L86:
            return r6
        L87:
            int r5 = r5.getHeight()
            float r5 = (float) r5
            float r7 = r7.bottom
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L93
            return r6
        L93:
            return r2
    }

    private int[] a(int[] r6) {
            r5 = this;
            int r5 = r6.length
            if (r5 != 0) goto L4
            return r6
        L4:
            java.util.Arrays.sort(r6)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = r1
        Le:
            if (r2 >= r5) goto L28
            r3 = r6[r2]
            if (r3 <= 0) goto L25
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            int r4 = java.util.Collections.binarySearch(r0, r4)
            if (r4 >= 0) goto L25
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.add(r3)
        L25:
            int r2 = r2 + 1
            goto Le
        L28:
            int r2 = r0.size()
            if (r5 != r2) goto L2f
            return r6
        L2f:
            int r5 = r0.size()
            int[] r6 = new int[r5]
        L35:
            if (r1 >= r5) goto L46
            java.lang.Object r2 = r0.get(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r6[r1] = r2
            int r1 = r1 + 1
            goto L35
        L46:
            return r6
    }

    private void h() {
            r2 = this;
            r0 = 0
            r2.f956a = r0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.d = r1
            r2.e = r1
            r2.f958c = r1
            int[] r1 = new int[r0]
            r2.f = r1
            r2.f957b = r0
            return
    }

    private boolean i() {
            r6 = this;
            boolean r0 = r6.k()
            r1 = 0
            if (r0 == 0) goto L4d
            int r0 = r6.f956a
            r2 = 1
            if (r0 != r2) goto L4d
            boolean r0 = r6.g
            if (r0 == 0) goto L15
            int[] r0 = r6.f
            int r0 = r0.length
            if (r0 != 0) goto L4a
        L15:
            float r0 = r6.d
            int r0 = java.lang.Math.round(r0)
            float r0 = (float) r0
            r3 = r2
        L1d:
            float r4 = r6.f958c
            float r4 = r4 + r0
            int r4 = java.lang.Math.round(r4)
            float r5 = r6.e
            int r5 = java.lang.Math.round(r5)
            if (r4 > r5) goto L32
            int r3 = r3 + 1
            float r4 = r6.f958c
            float r0 = r0 + r4
            goto L1d
        L32:
            int[] r0 = new int[r3]
            float r4 = r6.d
        L36:
            if (r1 >= r3) goto L44
            int r5 = java.lang.Math.round(r4)
            r0[r1] = r5
            float r5 = r6.f958c
            float r4 = r4 + r5
            int r1 = r1 + 1
            goto L36
        L44:
            int[] r0 = r6.a(r0)
            r6.f = r0
        L4a:
            r6.f957b = r2
            goto L4f
        L4d:
            r6.f957b = r1
        L4f:
            boolean r6 = r6.f957b
            return r6
    }

    private boolean j() {
            r4 = this;
            int[] r0 = r4.f
            int r0 = r0.length
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L9
            r3 = r2
            goto La
        L9:
            r3 = r1
        La:
            r4.g = r3
            if (r3 == 0) goto L21
            r4.f956a = r2
            int[] r3 = r4.f
            r1 = r3[r1]
            float r1 = (float) r1
            r4.d = r1
            int r0 = r0 - r2
            r0 = r3[r0]
            float r0 = (float) r0
            r4.e = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.f958c = r0
        L21:
            boolean r4 = r4.g
            return r4
    }

    private boolean k() {
            r0 = this;
            android.widget.TextView r0 = r0.i
            boolean r0 = r0 instanceof android.support.v7.widget.k
            r0 = r0 ^ 1
            return r0
    }

    void a() {
            r5 = this;
            boolean r0 = r5.g()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r5.f957b
            if (r0 == 0) goto L8d
            android.widget.TextView r0 = r5.i
            int r0 = r0.getMeasuredHeight()
            if (r0 <= 0) goto L8c
            android.widget.TextView r0 = r5.i
            int r0 = r0.getMeasuredWidth()
            if (r0 > 0) goto L1c
            goto L8c
        L1c:
            android.widget.TextView r0 = r5.i
            r1 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            java.lang.String r3 = "getHorizontallyScrolling"
            java.lang.Object r0 = r5.a(r0, r3, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L34
            r0 = 1048576(0x100000, float:1.469368E-39)
            goto L48
        L34:
            android.widget.TextView r0 = r5.i
            int r0 = r0.getMeasuredWidth()
            android.widget.TextView r2 = r5.i
            int r2 = r2.getTotalPaddingLeft()
            int r0 = r0 - r2
            android.widget.TextView r2 = r5.i
            int r2 = r2.getTotalPaddingRight()
            int r0 = r0 - r2
        L48:
            android.widget.TextView r2 = r5.i
            int r2 = r2.getHeight()
            android.widget.TextView r3 = r5.i
            int r3 = r3.getCompoundPaddingBottom()
            int r2 = r2 - r3
            android.widget.TextView r3 = r5.i
            int r3 = r3.getCompoundPaddingTop()
            int r2 = r2 - r3
            if (r0 <= 0) goto L8c
            if (r2 > 0) goto L61
            goto L8c
        L61:
            android.graphics.RectF r3 = android.support.v7.widget.z.k
            monitor-enter(r3)
            android.graphics.RectF r4 = android.support.v7.widget.z.k     // Catch: java.lang.Throwable -> L89
            r4.setEmpty()     // Catch: java.lang.Throwable -> L89
            android.graphics.RectF r4 = android.support.v7.widget.z.k     // Catch: java.lang.Throwable -> L89
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L89
            r4.right = r0     // Catch: java.lang.Throwable -> L89
            android.graphics.RectF r0 = android.support.v7.widget.z.k     // Catch: java.lang.Throwable -> L89
            float r2 = (float) r2     // Catch: java.lang.Throwable -> L89
            r0.bottom = r2     // Catch: java.lang.Throwable -> L89
            android.graphics.RectF r0 = android.support.v7.widget.z.k     // Catch: java.lang.Throwable -> L89
            int r0 = r5.a(r0)     // Catch: java.lang.Throwable -> L89
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L89
            android.widget.TextView r2 = r5.i     // Catch: java.lang.Throwable -> L89
            float r2 = r2.getTextSize()     // Catch: java.lang.Throwable -> L89
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L87
            r5.a(r1, r0)     // Catch: java.lang.Throwable -> L89
        L87:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L89
            goto L8d
        L89:
            r5 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L89
            throw r5
        L8c:
            return
        L8d:
            r0 = 1
            r5.f957b = r0
            return
    }

    void a(int r4) {
            r3 = this;
            boolean r0 = r3.k()
            if (r0 == 0) goto L4b
            if (r4 == 0) goto L48
            r0 = 1
            if (r4 != r0) goto L31
            android.content.Context r4 = r3.j
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            r0 = 1094713344(0x41400000, float:12.0)
            r1 = 2
            float r0 = android.util.TypedValue.applyDimension(r1, r0, r4)
            r2 = 1121976320(0x42e00000, float:112.0)
            float r4 = android.util.TypedValue.applyDimension(r1, r2, r4)
            r1 = 1065353216(0x3f800000, float:1.0)
            r3.a(r0, r4, r1)
            boolean r4 = r3.i()
            if (r4 == 0) goto L4b
            r3.a()
            goto L4b
        L31:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown auto-size text type: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        L48:
            r3.h()
        L4b:
            return
    }

    void a(int r2, float r3) {
            r1 = this;
            android.content.Context r0 = r1.j
            if (r0 != 0) goto L9
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            goto Ld
        L9:
            android.content.res.Resources r0 = r0.getResources()
        Ld:
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r2 = android.util.TypedValue.applyDimension(r2, r3, r0)
            r1.a(r2)
            return
    }

    void a(int r2, int r3, int r4, int r5) {
            r1 = this;
            boolean r0 = r1.k()
            if (r0 == 0) goto L2b
            android.content.Context r0 = r1.j
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r2 = (float) r2
            float r2 = android.util.TypedValue.applyDimension(r5, r2, r0)
            float r3 = (float) r3
            float r3 = android.util.TypedValue.applyDimension(r5, r3, r0)
            float r4 = (float) r4
            float r4 = android.util.TypedValue.applyDimension(r5, r4, r0)
            r1.a(r2, r3, r4)
            boolean r2 = r1.i()
            if (r2 == 0) goto L2b
            r1.a()
        L2b:
            return
    }

    void a(android.util.AttributeSet r7, int r8) {
            r6 = this;
            android.content.Context r0 = r6.j
            int[] r1 = b.b.d.a.j.AppCompatTextView
            r2 = 0
            android.content.res.TypedArray r7 = r0.obtainStyledAttributes(r7, r1, r8, r2)
            int r8 = b.b.d.a.j.AppCompatTextView_autoSizeTextType
            boolean r8 = r7.hasValue(r8)
            if (r8 == 0) goto L19
            int r8 = b.b.d.a.j.AppCompatTextView_autoSizeTextType
            int r8 = r7.getInt(r8, r2)
            r6.f956a = r8
        L19:
            int r8 = b.b.d.a.j.AppCompatTextView_autoSizeStepGranularity
            boolean r8 = r7.hasValue(r8)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r8 == 0) goto L2a
            int r8 = b.b.d.a.j.AppCompatTextView_autoSizeStepGranularity
            float r8 = r7.getDimension(r8, r0)
            goto L2b
        L2a:
            r8 = r0
        L2b:
            int r1 = b.b.d.a.j.AppCompatTextView_autoSizeMinTextSize
            boolean r1 = r7.hasValue(r1)
            if (r1 == 0) goto L3a
            int r1 = b.b.d.a.j.AppCompatTextView_autoSizeMinTextSize
            float r1 = r7.getDimension(r1, r0)
            goto L3b
        L3a:
            r1 = r0
        L3b:
            int r3 = b.b.d.a.j.AppCompatTextView_autoSizeMaxTextSize
            boolean r3 = r7.hasValue(r3)
            if (r3 == 0) goto L4a
            int r3 = b.b.d.a.j.AppCompatTextView_autoSizeMaxTextSize
            float r3 = r7.getDimension(r3, r0)
            goto L4b
        L4a:
            r3 = r0
        L4b:
            int r4 = b.b.d.a.j.AppCompatTextView_autoSizePresetSizes
            boolean r4 = r7.hasValue(r4)
            if (r4 == 0) goto L69
            int r4 = b.b.d.a.j.AppCompatTextView_autoSizePresetSizes
            int r4 = r7.getResourceId(r4, r2)
            if (r4 <= 0) goto L69
            android.content.res.Resources r5 = r7.getResources()
            android.content.res.TypedArray r4 = r5.obtainTypedArray(r4)
            r6.a(r4)
            r4.recycle()
        L69:
            r7.recycle()
            boolean r7 = r6.k()
            if (r7 == 0) goto La7
            int r7 = r6.f956a
            r2 = 1
            if (r7 != r2) goto La9
            boolean r7 = r6.g
            if (r7 != 0) goto La3
            android.content.Context r7 = r6.j
            android.content.res.Resources r7 = r7.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r4 = 2
            if (r2 != 0) goto L90
            r1 = 1094713344(0x41400000, float:12.0)
            float r1 = android.util.TypedValue.applyDimension(r4, r1, r7)
        L90:
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto L9a
            r2 = 1121976320(0x42e00000, float:112.0)
            float r3 = android.util.TypedValue.applyDimension(r4, r2, r7)
        L9a:
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto La0
            r8 = 1065353216(0x3f800000, float:1.0)
        La0:
            r6.a(r1, r3, r8)
        La3:
            r6.i()
            goto La9
        La7:
            r6.f956a = r2
        La9:
            return
    }

    void a(int[] r6, int r7) {
            r5 = this;
            boolean r0 = r5.k()
            if (r0 == 0) goto L62
            int r0 = r6.length
            r1 = 0
            if (r0 <= 0) goto L57
            int[] r2 = new int[r0]
            if (r7 != 0) goto L13
            int[] r2 = java.util.Arrays.copyOf(r6, r0)
            goto L2f
        L13:
            android.content.Context r3 = r5.j
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
        L1d:
            if (r1 >= r0) goto L2f
            r4 = r6[r1]
            float r4 = (float) r4
            float r4 = android.util.TypedValue.applyDimension(r7, r4, r3)
            int r4 = java.lang.Math.round(r4)
            r2[r1] = r4
            int r1 = r1 + 1
            goto L1d
        L2f:
            int[] r7 = r5.a(r2)
            r5.f = r7
            boolean r7 = r5.j()
            if (r7 == 0) goto L3c
            goto L59
        L3c:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "None of the preset sizes is valid: "
            r7.append(r0)
            java.lang.String r6 = java.util.Arrays.toString(r6)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.<init>(r6)
            throw r5
        L57:
            r5.g = r1
        L59:
            boolean r6 = r5.i()
            if (r6 == 0) goto L62
            r5.a()
        L62:
            return
    }

    int b() {
            r0 = this;
            float r0 = r0.e
            int r0 = java.lang.Math.round(r0)
            return r0
    }

    int c() {
            r0 = this;
            float r0 = r0.d
            int r0 = java.lang.Math.round(r0)
            return r0
    }

    int d() {
            r0 = this;
            float r0 = r0.f958c
            int r0 = java.lang.Math.round(r0)
            return r0
    }

    int[] e() {
            r0 = this;
            int[] r0 = r0.f
            return r0
    }

    int f() {
            r0 = this;
            int r0 = r0.f956a
            return r0
    }

    boolean g() {
            r1 = this;
            boolean r0 = r1.k()
            if (r0 == 0) goto Lc
            int r1 = r1.f956a
            if (r1 == 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            return r1
    }
}
