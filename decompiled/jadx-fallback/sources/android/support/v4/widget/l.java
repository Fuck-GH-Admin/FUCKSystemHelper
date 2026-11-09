package android.support.v4.widget;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    private static class a implements android.view.ActionMode.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.view.ActionMode.Callback f655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final android.widget.TextView f656b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private java.lang.Class f657c;
        private java.lang.reflect.Method d;
        private boolean e;
        private boolean f;

        a(android.view.ActionMode.Callback r1, android.widget.TextView r2) {
                r0 = this;
                r0.<init>()
                r0.f655a = r1
                r0.f656b = r2
                r1 = 0
                r0.f = r1
                return
        }

        private android.content.Intent a() {
                r1 = this;
                android.content.Intent r1 = new android.content.Intent
                r1.<init>()
                java.lang.String r0 = "android.intent.action.PROCESS_TEXT"
                android.content.Intent r1 = r1.setAction(r0)
                java.lang.String r0 = "text/plain"
                android.content.Intent r1 = r1.setType(r0)
                return r1
        }

        private android.content.Intent a(android.content.pm.ResolveInfo r2, android.widget.TextView r3) {
                r1 = this;
                android.content.Intent r0 = r1.a()
                boolean r1 = r1.a(r3)
                r1 = r1 ^ 1
                java.lang.String r3 = "android.intent.extra.PROCESS_TEXT_READONLY"
                android.content.Intent r1 = r0.putExtra(r3, r1)
                android.content.pm.ActivityInfo r2 = r2.activityInfo
                java.lang.String r3 = r2.packageName
                java.lang.String r2 = r2.name
                android.content.Intent r1 = r1.setClassName(r3, r2)
                return r1
        }

        private java.util.List<android.content.pm.ResolveInfo> a(android.content.Context r4, android.content.pm.PackageManager r5) {
                r3 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                boolean r1 = r4 instanceof android.app.Activity
                if (r1 != 0) goto La
                return r0
            La:
                android.content.Intent r1 = r3.a()
                r2 = 0
                java.util.List r5 = r5.queryIntentActivities(r1, r2)
                java.util.Iterator r5 = r5.iterator()
            L17:
                boolean r1 = r5.hasNext()
                if (r1 == 0) goto L2d
                java.lang.Object r1 = r5.next()
                android.content.pm.ResolveInfo r1 = (android.content.pm.ResolveInfo) r1
                boolean r2 = r3.a(r1, r4)
                if (r2 == 0) goto L17
                r0.add(r1)
                goto L17
            L2d:
                return r0
        }

        private void a(android.view.Menu r9) {
                r8 = this;
                android.widget.TextView r0 = r8.f656b
                android.content.Context r0 = r0.getContext()
                android.content.pm.PackageManager r1 = r0.getPackageManager()
                boolean r2 = r8.f
                java.lang.String r3 = "removeItemAt"
                r4 = 0
                r5 = 1
                if (r2 != 0) goto L32
                r8.f = r5
                java.lang.String r2 = "com.android.internal.view.menu.MenuBuilder"
                java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L2b
                r8.f657c = r2     // Catch: java.lang.Throwable -> L2b
                java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L2b
                java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L2b
                r6[r4] = r7     // Catch: java.lang.Throwable -> L2b
                java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r6)     // Catch: java.lang.Throwable -> L2b
                r8.d = r2     // Catch: java.lang.Throwable -> L2b
                r8.e = r5     // Catch: java.lang.Throwable -> L2b
                goto L32
            L2b:
                r2 = 0
                r8.f657c = r2
                r8.d = r2
                r8.e = r4
            L32:
                boolean r2 = r8.e     // Catch: java.lang.Throwable -> La9
                if (r2 == 0) goto L41
                java.lang.Class r2 = r8.f657c     // Catch: java.lang.Throwable -> La9
                boolean r2 = r2.isInstance(r9)     // Catch: java.lang.Throwable -> La9
                if (r2 == 0) goto L41
                java.lang.reflect.Method r2 = r8.d     // Catch: java.lang.Throwable -> La9
                goto L4f
            L41:
                java.lang.Class r2 = r9.getClass()     // Catch: java.lang.Throwable -> La9
                java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> La9
                java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> La9
                r6[r4] = r7     // Catch: java.lang.Throwable -> La9
                java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r6)     // Catch: java.lang.Throwable -> La9
            L4f:
                int r3 = r9.size()     // Catch: java.lang.Throwable -> La9
                int r3 = r3 - r5
            L54:
                if (r3 < 0) goto L7e
                android.view.MenuItem r6 = r9.getItem(r3)     // Catch: java.lang.Throwable -> La9
                android.content.Intent r7 = r6.getIntent()     // Catch: java.lang.Throwable -> La9
                if (r7 == 0) goto L7b
                java.lang.String r7 = "android.intent.action.PROCESS_TEXT"
                android.content.Intent r6 = r6.getIntent()     // Catch: java.lang.Throwable -> La9
                java.lang.String r6 = r6.getAction()     // Catch: java.lang.Throwable -> La9
                boolean r6 = r7.equals(r6)     // Catch: java.lang.Throwable -> La9
                if (r6 == 0) goto L7b
                java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> La9
                java.lang.Integer r7 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> La9
                r6[r4] = r7     // Catch: java.lang.Throwable -> La9
                r2.invoke(r9, r6)     // Catch: java.lang.Throwable -> La9
            L7b:
                int r3 = r3 + (-1)
                goto L54
            L7e:
                java.util.List r0 = r8.a(r0, r1)
                r2 = r4
            L83:
                int r3 = r0.size()
                if (r2 >= r3) goto La9
                java.lang.Object r3 = r0.get(r2)
                android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
                int r6 = r2 + 100
                java.lang.CharSequence r7 = r3.loadLabel(r1)
                android.view.MenuItem r6 = r9.add(r4, r4, r6, r7)
                android.widget.TextView r7 = r8.f656b
                android.content.Intent r3 = r8.a(r3, r7)
                android.view.MenuItem r3 = r6.setIntent(r3)
                r3.setShowAsAction(r5)
                int r2 = r2 + 1
                goto L83
            La9:
                return
        }

        private boolean a(android.content.pm.ResolveInfo r3, android.content.Context r4) {
                r2 = this;
                java.lang.String r2 = r4.getPackageName()
                android.content.pm.ActivityInfo r0 = r3.activityInfo
                java.lang.String r0 = r0.packageName
                boolean r2 = r2.equals(r0)
                r0 = 1
                if (r2 == 0) goto L10
                return r0
            L10:
                android.content.pm.ActivityInfo r2 = r3.activityInfo
                boolean r3 = r2.exported
                r1 = 0
                if (r3 != 0) goto L18
                return r1
            L18:
                java.lang.String r2 = r2.permission
                if (r2 == 0) goto L24
                int r2 = r4.checkSelfPermission(r2)
                if (r2 != 0) goto L23
                goto L24
            L23:
                r0 = r1
            L24:
                return r0
        }

        private boolean a(android.widget.TextView r1) {
                r0 = this;
                boolean r0 = r1 instanceof android.text.Editable
                if (r0 == 0) goto L12
                boolean r0 = r1.onCheckIsTextEditor()
                if (r0 == 0) goto L12
                boolean r0 = r1.isEnabled()
                if (r0 == 0) goto L12
                r0 = 1
                goto L13
            L12:
                r0 = 0
            L13:
                return r0
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(android.view.ActionMode r1, android.view.MenuItem r2) {
                r0 = this;
                android.view.ActionMode$Callback r0 = r0.f655a
                boolean r0 = r0.onActionItemClicked(r1, r2)
                return r0
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(android.view.ActionMode r1, android.view.Menu r2) {
                r0 = this;
                android.view.ActionMode$Callback r0 = r0.f655a
                boolean r0 = r0.onCreateActionMode(r1, r2)
                return r0
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(android.view.ActionMode r1) {
                r0 = this;
                android.view.ActionMode$Callback r0 = r0.f655a
                r0.onDestroyActionMode(r1)
                return
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(android.view.ActionMode r1, android.view.Menu r2) {
                r0 = this;
                r0.a(r2)
                android.view.ActionMode$Callback r0 = r0.f655a
                boolean r0 = r0.onPrepareActionMode(r1, r2)
                return r0
        }
    }

    private static int a(android.text.TextDirectionHeuristic r2) {
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            r1 = 1
            if (r2 != r0) goto L6
            return r1
        L6:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            if (r2 != r0) goto Lb
            return r1
        Lb:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.ANYRTL_LTR
            if (r2 != r0) goto L11
            r2 = 2
            return r2
        L11:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.LTR
            if (r2 != r0) goto L17
            r2 = 3
            return r2
        L17:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.RTL
            if (r2 != r0) goto L1d
            r2 = 4
            return r2
        L1d:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.LOCALE
            if (r2 != r0) goto L23
            r2 = 5
            return r2
        L23:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            if (r2 != r0) goto L29
            r2 = 6
            return r2
        L29:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            if (r2 != r0) goto L2f
            r2 = 7
            return r2
        L2f:
            return r1
    }

    public static int a(android.widget.TextView r1) {
            int r0 = r1.getPaddingTop()
            android.text.TextPaint r1 = r1.getPaint()
            android.graphics.Paint$FontMetricsInt r1 = r1.getFontMetricsInt()
            int r1 = r1.top
            int r0 = r0 - r1
            return r0
    }

    public static android.view.ActionMode.Callback a(android.widget.TextView r2, android.view.ActionMode.Callback r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L15
            r1 = 27
            if (r0 > r1) goto L15
            boolean r0 = r3 instanceof android.support.v4.widget.l.a
            if (r0 == 0) goto Lf
            goto L15
        Lf:
            android.support.v4.widget.l$a r0 = new android.support.v4.widget.l$a
            r0.<init>(r3, r2)
            return r0
        L15:
            return r3
    }

    public static void a(android.widget.TextView r3, int r4) {
            b.b.c.f.j.a(r4)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            r3.setFirstBaselineToTopHeight(r4)
            return
        Ld:
            android.text.TextPaint r0 = r3.getPaint()
            android.graphics.Paint$FontMetricsInt r0 = r0.getFontMetricsInt()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 16
            if (r1 < r2) goto L25
            boolean r1 = r3.getIncludeFontPadding()
            if (r1 == 0) goto L22
            goto L25
        L22:
            int r0 = r0.ascent
            goto L27
        L25:
            int r0 = r0.top
        L27:
            int r1 = java.lang.Math.abs(r0)
            if (r4 <= r1) goto L3e
            int r0 = -r0
            int r4 = r4 - r0
            int r0 = r3.getPaddingLeft()
            int r1 = r3.getPaddingRight()
            int r2 = r3.getPaddingBottom()
            r3.setPadding(r0, r4, r1, r2)
        L3e:
            return
    }

    public static void a(android.widget.TextView r2, b.b.c.e.a.C0044a r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 18
            if (r0 < r1) goto L11
            android.text.TextDirectionHeuristic r0 = r3.c()
            int r0 = a(r0)
            r2.setTextDirection(r0)
        L11:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 >= r1) goto L40
            android.text.TextPaint r0 = r3.d()
            float r0 = r0.getTextScaleX()
            android.text.TextPaint r1 = r2.getPaint()
            android.text.TextPaint r3 = r3.d()
            r1.set(r3)
            float r3 = r2.getTextScaleX()
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L3c
            r3 = 1073741824(0x40000000, float:2.0)
            float r3 = r0 / r3
            r1 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 + r1
            r2.setTextScaleX(r3)
        L3c:
            r2.setTextScaleX(r0)
            goto L59
        L40:
            android.text.TextPaint r0 = r2.getPaint()
            android.text.TextPaint r1 = r3.d()
            r0.set(r1)
            int r0 = r3.a()
            r2.setBreakStrategy(r0)
            int r3 = r3.b()
            r2.setHyphenationFrequency(r3)
        L59:
            return
    }

    public static void a(android.widget.TextView r2, b.b.c.e.a r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Le
            android.text.PrecomputedText r3 = r3.b()
        La:
            r2.setText(r3)
            goto L1d
        Le:
            b.b.c.e.a$a r0 = d(r2)
            b.b.c.e.a$a r1 = r3.a()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1e
            goto La
        L1d:
            return
        L1e:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Given text can not be applied to TextView."
            r2.<init>(r3)
            throw r2
    }

    public static int b(android.widget.TextView r1) {
            int r0 = r1.getPaddingBottom()
            android.text.TextPaint r1 = r1.getPaint()
            android.graphics.Paint$FontMetricsInt r1 = r1.getFontMetricsInt()
            int r1 = r1.bottom
            int r0 = r0 + r1
            return r0
    }

    public static void b(android.widget.TextView r3, int r4) {
            b.b.c.f.j.a(r4)
            android.text.TextPaint r0 = r3.getPaint()
            android.graphics.Paint$FontMetricsInt r0 = r0.getFontMetricsInt()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 16
            if (r1 < r2) goto L1b
            boolean r1 = r3.getIncludeFontPadding()
            if (r1 == 0) goto L18
            goto L1b
        L18:
            int r0 = r0.descent
            goto L1d
        L1b:
            int r0 = r0.bottom
        L1d:
            int r1 = java.lang.Math.abs(r0)
            if (r4 <= r1) goto L33
            int r4 = r4 - r0
            int r0 = r3.getPaddingLeft()
            int r1 = r3.getPaddingTop()
            int r2 = r3.getPaddingRight()
            r3.setPadding(r0, r1, r2, r4)
        L33:
            return
    }

    private static android.text.TextDirectionHeuristic c(android.widget.TextView r4) {
            android.text.method.TransformationMethod r0 = r4.getTransformationMethod()
            boolean r0 = r0 instanceof android.text.method.PasswordTransformationMethod
            if (r0 == 0) goto Lb
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.LTR
            return r4
        Lb:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            r2 = 0
            r3 = 1
            if (r0 < r1) goto L3e
            int r0 = r4.getInputType()
            r0 = r0 & 15
            r1 = 3
            if (r0 != r1) goto L3e
            java.util.Locale r4 = r4.getTextLocale()
            android.icu.text.DecimalFormatSymbols r4 = android.icu.text.DecimalFormatSymbols.getInstance(r4)
            java.lang.String[] r4 = r4.getDigitStrings()
            r4 = r4[r2]
            int r4 = r4.codePointAt(r2)
            byte r4 = java.lang.Character.getDirectionality(r4)
            if (r4 == r3) goto L3b
            r0 = 2
            if (r4 != r0) goto L38
            goto L3b
        L38:
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.LTR
            return r4
        L3b:
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.RTL
            return r4
        L3e:
            int r0 = r4.getLayoutDirection()
            if (r0 != r3) goto L45
            r2 = r3
        L45:
            int r4 = r4.getTextDirection()
            switch(r4) {
                case 2: goto L60;
                case 3: goto L5d;
                case 4: goto L5a;
                case 5: goto L57;
                case 6: goto L54;
                case 7: goto L51;
                default: goto L4c;
            }
        L4c:
            if (r2 == 0) goto L63
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            goto L65
        L51:
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            return r4
        L54:
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            return r4
        L57:
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.LOCALE
            return r4
        L5a:
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.RTL
            return r4
        L5d:
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.LTR
            return r4
        L60:
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.ANYRTL_LTR
            return r4
        L63:
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
        L65:
            return r4
    }

    public static void c(android.widget.TextView r2, int r3) {
            b.b.c.f.j.a(r3)
            android.text.TextPaint r0 = r2.getPaint()
            r1 = 0
            int r0 = r0.getFontMetricsInt(r1)
            if (r3 == r0) goto L15
            int r3 = r3 - r0
            float r3 = (float) r3
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.setLineSpacing(r3, r0)
        L15:
            return
    }

    public static b.b.c.e.a.C0044a d(android.widget.TextView r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L10
            b.b.c.e.a$a r0 = new b.b.c.e.a$a
            android.text.PrecomputedText$Params r3 = r3.getTextMetricsParams()
            r0.<init>(r3)
            return r0
        L10:
            b.b.c.e.a$a$a r0 = new b.b.c.e.a$a$a
            android.text.TextPaint r1 = new android.text.TextPaint
            android.text.TextPaint r2 = r3.getPaint()
            r1.<init>(r2)
            r0.<init>(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L32
            int r1 = r3.getBreakStrategy()
            r0.a(r1)
            int r1 = r3.getHyphenationFrequency()
            r0.b(r1)
        L32:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 18
            if (r1 < r2) goto L3f
            android.text.TextDirectionHeuristic r3 = c(r3)
            r0.a(r3)
        L3f:
            b.b.c.e.a$a r3 = r0.a()
            return r3
    }
}
