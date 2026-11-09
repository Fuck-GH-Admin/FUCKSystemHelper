package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.view.View f950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.widget.TextView f951c;
    private final android.view.WindowManager.LayoutParams d;
    private final android.graphics.Rect e;
    private final int[] f;
    private final int[] g;

    x0(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            android.view.WindowManager$LayoutParams r0 = new android.view.WindowManager$LayoutParams
            r0.<init>()
            r2.d = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.e = r0
            r0 = 2
            int[] r1 = new int[r0]
            r2.f = r1
            int[] r0 = new int[r0]
            r2.g = r0
            r2.f949a = r3
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            int r0 = b.b.d.a.g.abc_tooltip
            r1 = 0
            android.view.View r3 = r3.inflate(r0, r1)
            r2.f950b = r3
            int r0 = b.b.d.a.f.message
            android.view.View r3 = r3.findViewById(r0)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.f951c = r3
            android.view.WindowManager$LayoutParams r3 = r2.d
            java.lang.Class<android.support.v7.widget.x0> r0 = android.support.v7.widget.x0.class
            java.lang.String r0 = r0.getSimpleName()
            r3.setTitle(r0)
            android.view.WindowManager$LayoutParams r3 = r2.d
            android.content.Context r0 = r2.f949a
            java.lang.String r0 = r0.getPackageName()
            r3.packageName = r0
            android.view.WindowManager$LayoutParams r2 = r2.d
            r3 = 1002(0x3ea, float:1.404E-42)
            r2.type = r3
            r3 = -2
            r2.width = r3
            r2.height = r3
            r3 = -3
            r2.format = r3
            int r3 = b.b.d.a.i.Animation_AppCompat_Tooltip
            r2.windowAnimations = r3
            r3 = 24
            r2.flags = r3
            return
    }

    private static android.view.View a(android.view.View r3) {
            android.view.View r0 = r3.getRootView()
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r2 = r1 instanceof android.view.WindowManager.LayoutParams
            if (r2 == 0) goto L14
            android.view.WindowManager$LayoutParams r1 = (android.view.WindowManager.LayoutParams) r1
            int r1 = r1.type
            r2 = 2
            if (r1 != r2) goto L14
            return r0
        L14:
            android.content.Context r3 = r3.getContext()
        L18:
            boolean r1 = r3 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L32
            boolean r1 = r3 instanceof android.app.Activity
            if (r1 == 0) goto L2b
            android.app.Activity r3 = (android.app.Activity) r3
            android.view.Window r3 = r3.getWindow()
            android.view.View r3 = r3.getDecorView()
            return r3
        L2b:
            android.content.ContextWrapper r3 = (android.content.ContextWrapper) r3
            android.content.Context r3 = r3.getBaseContext()
            goto L18
        L32:
            return r0
    }

    private void a(android.view.View r9, int r10, int r11, boolean r12, android.view.WindowManager.LayoutParams r13) {
            r8 = this;
            android.os.IBinder r0 = r9.getApplicationWindowToken()
            r13.token = r0
            android.content.Context r0 = r8.f949a
            android.content.res.Resources r0 = r0.getResources()
            int r1 = b.b.d.a.d.tooltip_precise_anchor_threshold
            int r0 = r0.getDimensionPixelOffset(r1)
            int r1 = r9.getWidth()
            if (r1 < r0) goto L19
            goto L1f
        L19:
            int r10 = r9.getWidth()
            int r10 = r10 / 2
        L1f:
            int r1 = r9.getHeight()
            r2 = 0
            if (r1 < r0) goto L36
            android.content.Context r0 = r8.f949a
            android.content.res.Resources r0 = r0.getResources()
            int r1 = b.b.d.a.d.tooltip_precise_anchor_extra_offset
            int r0 = r0.getDimensionPixelOffset(r1)
            int r1 = r11 + r0
            int r11 = r11 - r0
            goto L3b
        L36:
            int r1 = r9.getHeight()
            r11 = r2
        L3b:
            r0 = 49
            r13.gravity = r0
            android.content.Context r0 = r8.f949a
            android.content.res.Resources r0 = r0.getResources()
            if (r12 == 0) goto L4a
            int r3 = b.b.d.a.d.tooltip_y_offset_touch
            goto L4c
        L4a:
            int r3 = b.b.d.a.d.tooltip_y_offset_non_touch
        L4c:
            int r0 = r0.getDimensionPixelOffset(r3)
            android.view.View r3 = a(r9)
            if (r3 != 0) goto L5e
            java.lang.String r8 = "TooltipPopup"
            java.lang.String r9 = "Cannot find app view"
            android.util.Log.e(r8, r9)
            return
        L5e:
            android.graphics.Rect r4 = r8.e
            r3.getWindowVisibleDisplayFrame(r4)
            android.graphics.Rect r4 = r8.e
            int r5 = r4.left
            if (r5 >= 0) goto L92
            int r4 = r4.top
            if (r4 >= 0) goto L92
            android.content.Context r4 = r8.f949a
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r5 = "status_bar_height"
            java.lang.String r6 = "dimen"
            java.lang.String r7 = "android"
            int r5 = r4.getIdentifier(r5, r6, r7)
            if (r5 == 0) goto L84
            int r5 = r4.getDimensionPixelSize(r5)
            goto L85
        L84:
            r5 = r2
        L85:
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            android.graphics.Rect r6 = r8.e
            int r7 = r4.widthPixels
            int r4 = r4.heightPixels
            r6.set(r2, r5, r7, r4)
        L92:
            int[] r4 = r8.g
            r3.getLocationOnScreen(r4)
            int[] r4 = r8.f
            r9.getLocationOnScreen(r4)
            int[] r9 = r8.f
            r4 = r9[r2]
            int[] r5 = r8.g
            r6 = r5[r2]
            int r4 = r4 - r6
            r9[r2] = r4
            r4 = 1
            r6 = r9[r4]
            r5 = r5[r4]
            int r6 = r6 - r5
            r9[r4] = r6
            r9 = r9[r2]
            int r9 = r9 + r10
            int r10 = r3.getWidth()
            int r10 = r10 / 2
            int r9 = r9 - r10
            r13.x = r9
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)
            android.view.View r10 = r8.f950b
            r10.measure(r9, r9)
            android.view.View r9 = r8.f950b
            int r9 = r9.getMeasuredHeight()
            int[] r10 = r8.f
            r2 = r10[r4]
            int r2 = r2 + r11
            int r2 = r2 - r0
            int r2 = r2 - r9
            r10 = r10[r4]
            int r10 = r10 + r1
            int r10 = r10 + r0
            if (r12 == 0) goto Lda
            if (r2 < 0) goto Le3
            goto Le6
        Lda:
            int r9 = r9 + r10
            android.graphics.Rect r8 = r8.e
            int r8 = r8.height()
            if (r9 > r8) goto Le6
        Le3:
            r13.y = r10
            goto Le8
        Le6:
            r13.y = r2
        Le8:
            return
    }

    void a() {
            r2 = this;
            boolean r0 = r2.b()
            if (r0 != 0) goto L7
            return
        L7:
            android.content.Context r0 = r2.f949a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.View r2 = r2.f950b
            r0.removeView(r2)
            return
    }

    void a(android.view.View r8, int r9, int r10, boolean r11, java.lang.CharSequence r12) {
            r7 = this;
            boolean r0 = r7.b()
            if (r0 == 0) goto L9
            r7.a()
        L9:
            android.widget.TextView r0 = r7.f951c
            r0.setText(r12)
            android.view.WindowManager$LayoutParams r6 = r7.d
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r1.a(r2, r3, r4, r5, r6)
            android.content.Context r8 = r7.f949a
            java.lang.String r9 = "window"
            java.lang.Object r8 = r8.getSystemService(r9)
            android.view.WindowManager r8 = (android.view.WindowManager) r8
            android.view.View r9 = r7.f950b
            android.view.WindowManager$LayoutParams r7 = r7.d
            r8.addView(r9, r7)
            return
    }

    boolean b() {
            r0 = this;
            android.view.View r0 = r0.f950b
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }
}
