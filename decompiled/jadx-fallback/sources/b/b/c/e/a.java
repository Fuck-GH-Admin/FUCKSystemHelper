package b.b.c.e;

/* JADX INFO: loaded from: classes.dex */
public class a implements android.text.Spannable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.text.Spannable f1065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b.b.c.e.a.C0044a f1066c;
    private final android.text.PrecomputedText d;

    /* JADX INFO: renamed from: b.b.c.e.a$a, reason: collision with other inner class name */
    public static final class C0044a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.text.TextPaint f1067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final android.text.TextDirectionHeuristic f1068b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f1069c;
        private final int d;
        final android.text.PrecomputedText.Params e;

        /* JADX INFO: renamed from: b.b.c.e.a$a$a, reason: collision with other inner class name */
        public static class C0045a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final android.text.TextPaint f1070a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private android.text.TextDirectionHeuristic f1071b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f1072c;
            private int d;

            public C0045a(android.text.TextPaint r2) {
                    r1 = this;
                    r1.<init>()
                    r1.f1070a = r2
                    int r2 = android.os.Build.VERSION.SDK_INT
                    r0 = 23
                    if (r2 < r0) goto L11
                    r2 = 1
                    r1.f1072c = r2
                    r1.d = r2
                    goto L16
                L11:
                    r2 = 0
                    r1.d = r2
                    r1.f1072c = r2
                L16:
                    int r2 = android.os.Build.VERSION.SDK_INT
                    r0 = 18
                    if (r2 < r0) goto L1f
                    android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
                    goto L20
                L1f:
                    r2 = 0
                L20:
                    r1.f1071b = r2
                    return
            }

            public b.b.c.e.a.C0044a.C0045a a(int r1) {
                    r0 = this;
                    r0.f1072c = r1
                    return r0
            }

            public b.b.c.e.a.C0044a.C0045a a(android.text.TextDirectionHeuristic r1) {
                    r0 = this;
                    r0.f1071b = r1
                    return r0
            }

            public b.b.c.e.a.C0044a a() {
                    r4 = this;
                    b.b.c.e.a$a r0 = new b.b.c.e.a$a
                    android.text.TextPaint r1 = r4.f1070a
                    android.text.TextDirectionHeuristic r2 = r4.f1071b
                    int r3 = r4.f1072c
                    int r4 = r4.d
                    r0.<init>(r1, r2, r3, r4)
                    return r0
            }

            public b.b.c.e.a.C0044a.C0045a b(int r1) {
                    r0 = this;
                    r0.d = r1
                    return r0
            }
        }

        public C0044a(android.text.PrecomputedText.Params r2) {
                r1 = this;
                r1.<init>()
                android.text.TextPaint r0 = r2.getTextPaint()
                r1.f1067a = r0
                android.text.TextDirectionHeuristic r0 = r2.getTextDirection()
                r1.f1068b = r0
                int r0 = r2.getBreakStrategy()
                r1.f1069c = r0
                int r0 = r2.getHyphenationFrequency()
                r1.d = r0
                r1.e = r2
                return
        }

        C0044a(android.text.TextPaint r3, android.text.TextDirectionHeuristic r4, int r5, int r6) {
                r2 = this;
                r2.<init>()
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                if (r0 < r1) goto L1f
                android.text.PrecomputedText$Params$Builder r0 = new android.text.PrecomputedText$Params$Builder
                r0.<init>(r3)
                android.text.PrecomputedText$Params$Builder r0 = r0.setBreakStrategy(r5)
                android.text.PrecomputedText$Params$Builder r0 = r0.setHyphenationFrequency(r6)
                android.text.PrecomputedText$Params$Builder r0 = r0.setTextDirection(r4)
                android.text.PrecomputedText$Params r0 = r0.build()
                goto L20
            L1f:
                r0 = 0
            L20:
                r2.e = r0
                r2.f1067a = r3
                r2.f1068b = r4
                r2.f1069c = r5
                r2.d = r6
                return
        }

        public int a() {
                r0 = this;
                int r0 = r0.f1069c
                return r0
        }

        public int b() {
                r0 = this;
                int r0 = r0.d
                return r0
        }

        public android.text.TextDirectionHeuristic c() {
                r0 = this;
                android.text.TextDirectionHeuristic r0 = r0.f1068b
                return r0
        }

        public android.text.TextPaint d() {
                r0 = this;
                android.text.TextPaint r0 = r0.f1067a
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r5 != r4) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 == 0) goto L116
                boolean r2 = r5 instanceof b.b.c.e.a.C0044a
                if (r2 != 0) goto Ld
                goto L116
            Ld:
                b.b.c.e.a$a r5 = (b.b.c.e.a.C0044a) r5
                android.text.PrecomputedText$Params r2 = r4.e
                if (r2 == 0) goto L1a
                android.text.PrecomputedText$Params r4 = r5.e
                boolean r4 = r2.equals(r4)
                return r4
            L1a:
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 23
                if (r2 < r3) goto L32
                int r2 = r4.f1069c
                int r3 = r5.a()
                if (r2 == r3) goto L29
                return r1
            L29:
                int r2 = r4.d
                int r3 = r5.b()
                if (r2 == r3) goto L32
                return r1
            L32:
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 18
                if (r2 < r3) goto L41
                android.text.TextDirectionHeuristic r2 = r4.f1068b
                android.text.TextDirectionHeuristic r3 = r5.c()
                if (r2 == r3) goto L41
                return r1
            L41:
                android.text.TextPaint r2 = r4.f1067a
                float r2 = r2.getTextSize()
                android.text.TextPaint r3 = r5.d()
                float r3 = r3.getTextSize()
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 == 0) goto L54
                return r1
            L54:
                android.text.TextPaint r2 = r4.f1067a
                float r2 = r2.getTextScaleX()
                android.text.TextPaint r3 = r5.d()
                float r3 = r3.getTextScaleX()
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 == 0) goto L67
                return r1
            L67:
                android.text.TextPaint r2 = r4.f1067a
                float r2 = r2.getTextSkewX()
                android.text.TextPaint r3 = r5.d()
                float r3 = r3.getTextSkewX()
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 == 0) goto L7a
                return r1
            L7a:
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 21
                if (r2 < r3) goto La8
                android.text.TextPaint r2 = r4.f1067a
                float r2 = r2.getLetterSpacing()
                android.text.TextPaint r3 = r5.d()
                float r3 = r3.getLetterSpacing()
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 == 0) goto L93
                return r1
            L93:
                android.text.TextPaint r2 = r4.f1067a
                java.lang.String r2 = r2.getFontFeatureSettings()
                android.text.TextPaint r3 = r5.d()
                java.lang.String r3 = r3.getFontFeatureSettings()
                boolean r2 = android.text.TextUtils.equals(r2, r3)
                if (r2 != 0) goto La8
                return r1
            La8:
                android.text.TextPaint r2 = r4.f1067a
                int r2 = r2.getFlags()
                android.text.TextPaint r3 = r5.d()
                int r3 = r3.getFlags()
                if (r2 == r3) goto Lb9
                return r1
            Lb9:
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 24
                if (r2 < r3) goto Ld4
                android.text.TextPaint r2 = r4.f1067a
                android.os.LocaleList r2 = r2.getTextLocales()
                android.text.TextPaint r3 = r5.d()
                android.os.LocaleList r3 = r3.getTextLocales()
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto Led
                return r1
            Ld4:
                r3 = 17
                if (r2 < r3) goto Led
                android.text.TextPaint r2 = r4.f1067a
                java.util.Locale r2 = r2.getTextLocale()
                android.text.TextPaint r3 = r5.d()
                java.util.Locale r3 = r3.getTextLocale()
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto Led
                return r1
            Led:
                android.text.TextPaint r2 = r4.f1067a
                android.graphics.Typeface r2 = r2.getTypeface()
                if (r2 != 0) goto L100
                android.text.TextPaint r4 = r5.d()
                android.graphics.Typeface r4 = r4.getTypeface()
                if (r4 == 0) goto L115
                return r1
            L100:
                android.text.TextPaint r4 = r4.f1067a
                android.graphics.Typeface r4 = r4.getTypeface()
                android.text.TextPaint r5 = r5.d()
                android.graphics.Typeface r5 = r5.getTypeface()
                boolean r4 = r4.equals(r5)
                if (r4 != 0) goto L115
                return r1
            L115:
                return r0
            L116:
                return r1
        }

        public int hashCode() {
                r14 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 10
                r2 = 11
                r3 = 9
                r4 = 8
                r5 = 7
                r6 = 6
                r7 = 5
                r8 = 4
                r9 = 3
                r10 = 2
                r11 = 1
                r12 = 0
                r13 = 24
                if (r0 < r13) goto L89
                java.lang.Object[] r0 = new java.lang.Object[r2]
                android.text.TextPaint r2 = r14.f1067a
                float r2 = r2.getTextSize()
                java.lang.Float r2 = java.lang.Float.valueOf(r2)
                r0[r12] = r2
                android.text.TextPaint r2 = r14.f1067a
                float r2 = r2.getTextScaleX()
                java.lang.Float r2 = java.lang.Float.valueOf(r2)
                r0[r11] = r2
                android.text.TextPaint r2 = r14.f1067a
                float r2 = r2.getTextSkewX()
                java.lang.Float r2 = java.lang.Float.valueOf(r2)
                r0[r10] = r2
                android.text.TextPaint r2 = r14.f1067a
                float r2 = r2.getLetterSpacing()
                java.lang.Float r2 = java.lang.Float.valueOf(r2)
                r0[r9] = r2
                android.text.TextPaint r2 = r14.f1067a
                int r2 = r2.getFlags()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0[r8] = r2
                android.text.TextPaint r2 = r14.f1067a
                android.os.LocaleList r2 = r2.getTextLocales()
                r0[r7] = r2
                android.text.TextPaint r2 = r14.f1067a
                android.graphics.Typeface r2 = r2.getTypeface()
                r0[r6] = r2
                android.text.TextPaint r2 = r14.f1067a
                boolean r2 = r2.isElegantTextHeight()
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                r0[r5] = r2
                android.text.TextDirectionHeuristic r2 = r14.f1068b
                r0[r4] = r2
                int r2 = r14.f1069c
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0[r3] = r2
                int r14 = r14.d
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                r0[r1] = r14
                int r14 = b.b.c.f.i.a(r0)
                return r14
            L89:
                r13 = 21
                if (r0 < r13) goto L100
                java.lang.Object[] r0 = new java.lang.Object[r2]
                android.text.TextPaint r2 = r14.f1067a
                float r2 = r2.getTextSize()
                java.lang.Float r2 = java.lang.Float.valueOf(r2)
                r0[r12] = r2
                android.text.TextPaint r2 = r14.f1067a
                float r2 = r2.getTextScaleX()
                java.lang.Float r2 = java.lang.Float.valueOf(r2)
                r0[r11] = r2
                android.text.TextPaint r2 = r14.f1067a
                float r2 = r2.getTextSkewX()
                java.lang.Float r2 = java.lang.Float.valueOf(r2)
                r0[r10] = r2
                android.text.TextPaint r2 = r14.f1067a
                float r2 = r2.getLetterSpacing()
                java.lang.Float r2 = java.lang.Float.valueOf(r2)
                r0[r9] = r2
                android.text.TextPaint r2 = r14.f1067a
                int r2 = r2.getFlags()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0[r8] = r2
                android.text.TextPaint r2 = r14.f1067a
                java.util.Locale r2 = r2.getTextLocale()
                r0[r7] = r2
                android.text.TextPaint r2 = r14.f1067a
                android.graphics.Typeface r2 = r2.getTypeface()
                r0[r6] = r2
                android.text.TextPaint r2 = r14.f1067a
                boolean r2 = r2.isElegantTextHeight()
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                r0[r5] = r2
                android.text.TextDirectionHeuristic r2 = r14.f1068b
                r0[r4] = r2
                int r2 = r14.f1069c
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0[r3] = r2
                int r14 = r14.d
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                r0[r1] = r14
                int r14 = b.b.c.f.i.a(r0)
                return r14
            L100:
                r1 = 18
                if (r0 < r1) goto L15f
                java.lang.Object[] r0 = new java.lang.Object[r3]
                android.text.TextPaint r1 = r14.f1067a
                float r1 = r1.getTextSize()
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                r0[r12] = r1
                android.text.TextPaint r1 = r14.f1067a
                float r1 = r1.getTextScaleX()
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                r0[r11] = r1
                android.text.TextPaint r1 = r14.f1067a
                float r1 = r1.getTextSkewX()
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                r0[r10] = r1
                android.text.TextPaint r1 = r14.f1067a
                int r1 = r1.getFlags()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0[r9] = r1
                android.text.TextPaint r1 = r14.f1067a
                java.util.Locale r1 = r1.getTextLocale()
                r0[r8] = r1
                android.text.TextPaint r1 = r14.f1067a
                android.graphics.Typeface r1 = r1.getTypeface()
                r0[r7] = r1
                android.text.TextDirectionHeuristic r1 = r14.f1068b
                r0[r6] = r1
                int r1 = r14.f1069c
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0[r5] = r1
                int r14 = r14.d
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                r0[r4] = r14
                int r14 = b.b.c.f.i.a(r0)
                return r14
            L15f:
                r1 = 17
                if (r0 < r1) goto L1be
                java.lang.Object[] r0 = new java.lang.Object[r3]
                android.text.TextPaint r1 = r14.f1067a
                float r1 = r1.getTextSize()
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                r0[r12] = r1
                android.text.TextPaint r1 = r14.f1067a
                float r1 = r1.getTextScaleX()
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                r0[r11] = r1
                android.text.TextPaint r1 = r14.f1067a
                float r1 = r1.getTextSkewX()
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                r0[r10] = r1
                android.text.TextPaint r1 = r14.f1067a
                int r1 = r1.getFlags()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0[r9] = r1
                android.text.TextPaint r1 = r14.f1067a
                java.util.Locale r1 = r1.getTextLocale()
                r0[r8] = r1
                android.text.TextPaint r1 = r14.f1067a
                android.graphics.Typeface r1 = r1.getTypeface()
                r0[r7] = r1
                android.text.TextDirectionHeuristic r1 = r14.f1068b
                r0[r6] = r1
                int r1 = r14.f1069c
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0[r5] = r1
                int r14 = r14.d
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                r0[r4] = r14
                int r14 = b.b.c.f.i.a(r0)
                return r14
            L1be:
                java.lang.Object[] r0 = new java.lang.Object[r4]
                android.text.TextPaint r1 = r14.f1067a
                float r1 = r1.getTextSize()
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                r0[r12] = r1
                android.text.TextPaint r1 = r14.f1067a
                float r1 = r1.getTextScaleX()
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                r0[r11] = r1
                android.text.TextPaint r1 = r14.f1067a
                float r1 = r1.getTextSkewX()
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                r0[r10] = r1
                android.text.TextPaint r1 = r14.f1067a
                int r1 = r1.getFlags()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0[r9] = r1
                android.text.TextPaint r1 = r14.f1067a
                android.graphics.Typeface r1 = r1.getTypeface()
                r0[r8] = r1
                android.text.TextDirectionHeuristic r1 = r14.f1068b
                r0[r7] = r1
                int r1 = r14.f1069c
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0[r6] = r1
                int r14 = r14.d
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                r0[r5] = r14
                int r14 = b.b.c.f.i.a(r0)
                return r14
        }

        public java.lang.String toString() {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "{"
                r0.<init>(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "textSize="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f1067a
                float r2 = r2.getTextSize()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", textScaleX="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f1067a
                float r2 = r2.getTextScaleX()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", textSkewX="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f1067a
                float r2 = r2.getTextSkewX()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 21
                if (r1 < r2) goto L8f
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", letterSpacing="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f1067a
                float r2 = r2.getLetterSpacing()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", elegantTextHeight="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f1067a
                boolean r2 = r2.isElegantTextHeight()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
            L8f:
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 24
                java.lang.String r3 = ", textLocale="
                if (r1 < r2) goto Lb0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                android.text.TextPaint r2 = r4.f1067a
                android.os.LocaleList r2 = r2.getTextLocales()
            La5:
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                goto Lc3
            Lb0:
                r2 = 17
                if (r1 < r2) goto Lc3
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                android.text.TextPaint r2 = r4.f1067a
                java.util.Locale r2 = r2.getTextLocale()
                goto La5
            Lc3:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", typeface="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f1067a
                android.graphics.Typeface r2 = r2.getTypeface()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 26
                if (r1 < r2) goto Lfd
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", variationSettings="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f1067a
                java.lang.String r2 = r2.getFontVariationSettings()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
            Lfd:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", textDir="
                r1.append(r2)
                android.text.TextDirectionHeuristic r2 = r4.f1068b
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", breakStrategy="
                r1.append(r2)
                int r2 = r4.f1069c
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", hyphenationFrequency="
                r1.append(r2)
                int r4 = r4.d
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.append(r4)
                java.lang.String r4 = "}"
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                return r4
        }
    }

    static {
            return
    }

    public b.b.c.e.a.C0044a a() {
            r0 = this;
            b.b.c.e.a$a r0 = r0.f1066c
            return r0
    }

    public android.text.PrecomputedText b() {
            r1 = this;
            android.text.Spannable r1 = r1.f1065b
            boolean r0 = r1 instanceof android.text.PrecomputedText
            if (r0 == 0) goto L9
            android.text.PrecomputedText r1 = (android.text.PrecomputedText) r1
            return r1
        L9:
            r1 = 0
            return r1
    }

    @Override // java.lang.CharSequence
    public char charAt(int r1) {
            r0 = this;
            android.text.Spannable r0 = r0.f1065b
            char r0 = r0.charAt(r1)
            return r0
    }

    @Override // android.text.Spanned
    public int getSpanEnd(java.lang.Object r1) {
            r0 = this;
            android.text.Spannable r0 = r0.f1065b
            int r0 = r0.getSpanEnd(r1)
            return r0
    }

    @Override // android.text.Spanned
    public int getSpanFlags(java.lang.Object r1) {
            r0 = this;
            android.text.Spannable r0 = r0.f1065b
            int r0 = r0.getSpanFlags(r1)
            return r0
    }

    @Override // android.text.Spanned
    public int getSpanStart(java.lang.Object r1) {
            r0 = this;
            android.text.Spannable r0 = r0.f1065b
            int r0 = r0.getSpanStart(r1)
            return r0
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int r3, int r4, java.lang.Class<T> r5) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            android.text.PrecomputedText r2 = r2.d
            java.lang.Object[] r2 = r2.getSpans(r3, r4, r5)
            return r2
        Ld:
            android.text.Spannable r2 = r2.f1065b
            java.lang.Object[] r2 = r2.getSpans(r3, r4, r5)
            return r2
    }

    @Override // java.lang.CharSequence
    public int length() {
            r0 = this;
            android.text.Spannable r0 = r0.f1065b
            int r0 = r0.length()
            return r0
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int r1, int r2, java.lang.Class r3) {
            r0 = this;
            android.text.Spannable r0 = r0.f1065b
            int r0 = r0.nextSpanTransition(r1, r2, r3)
            return r0
    }

    @Override // android.text.Spannable
    public void removeSpan(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof android.text.style.MetricAffectingSpan
            if (r0 != 0) goto L16
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L10
            android.text.PrecomputedText r2 = r2.d
            r2.removeSpan(r3)
            goto L15
        L10:
            android.text.Spannable r2 = r2.f1065b
            r2.removeSpan(r3)
        L15:
            return
        L16:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "MetricAffectingSpan can not be removed from PrecomputedText."
            r2.<init>(r3)
            throw r2
    }

    @Override // android.text.Spannable
    public void setSpan(java.lang.Object r3, int r4, int r5, int r6) {
            r2 = this;
            boolean r0 = r3 instanceof android.text.style.MetricAffectingSpan
            if (r0 != 0) goto L16
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L10
            android.text.PrecomputedText r2 = r2.d
            r2.setSpan(r3, r4, r5, r6)
            goto L15
        L10:
            android.text.Spannable r2 = r2.f1065b
            r2.setSpan(r3, r4, r5, r6)
        L15:
            return
        L16:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "MetricAffectingSpan can not be set to PrecomputedText."
            r2.<init>(r3)
            throw r2
    }

    @Override // java.lang.CharSequence
    public java.lang.CharSequence subSequence(int r1, int r2) {
            r0 = this;
            android.text.Spannable r0 = r0.f1065b
            java.lang.CharSequence r0 = r0.subSequence(r1, r2)
            return r0
    }

    @Override // java.lang.CharSequence
    public java.lang.String toString() {
            r0 = this;
            android.text.Spannable r0 = r0.f1065b
            java.lang.String r0 = r0.toString()
            return r0
    }
}
