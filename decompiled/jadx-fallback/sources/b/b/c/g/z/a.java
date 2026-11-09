package b.b.c.g.z;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.view.accessibility.AccessibilityNodeInfo f1136a;

    private a(android.view.accessibility.AccessibilityNodeInfo r1) {
            r0 = this;
            r0.<init>()
            r0.f1136a = r1
            return
    }

    public static b.b.c.g.z.a a(android.view.accessibility.AccessibilityNodeInfo r1) {
            b.b.c.g.z.a r0 = new b.b.c.g.z.a
            r0.<init>(r1)
            return r0
    }

    private static java.lang.String b(int r1) {
            r0 = 1
            if (r1 == r0) goto L3f
            r0 = 2
            if (r1 == r0) goto L3c
            switch(r1) {
                case 4: goto L39;
                case 8: goto L36;
                case 16: goto L33;
                case 32: goto L30;
                case 64: goto L2d;
                case 128: goto L2a;
                case 256: goto L27;
                case 512: goto L24;
                case 1024: goto L21;
                case 2048: goto L1e;
                case 4096: goto L1b;
                case 8192: goto L18;
                case 16384: goto L15;
                case 32768: goto L12;
                case 65536: goto Lf;
                case 131072: goto Lc;
                default: goto L9;
            }
        L9:
            java.lang.String r1 = "ACTION_UNKNOWN"
            return r1
        Lc:
            java.lang.String r1 = "ACTION_SET_SELECTION"
            return r1
        Lf:
            java.lang.String r1 = "ACTION_CUT"
            return r1
        L12:
            java.lang.String r1 = "ACTION_PASTE"
            return r1
        L15:
            java.lang.String r1 = "ACTION_COPY"
            return r1
        L18:
            java.lang.String r1 = "ACTION_SCROLL_BACKWARD"
            return r1
        L1b:
            java.lang.String r1 = "ACTION_SCROLL_FORWARD"
            return r1
        L1e:
            java.lang.String r1 = "ACTION_PREVIOUS_HTML_ELEMENT"
            return r1
        L21:
            java.lang.String r1 = "ACTION_NEXT_HTML_ELEMENT"
            return r1
        L24:
            java.lang.String r1 = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY"
            return r1
        L27:
            java.lang.String r1 = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY"
            return r1
        L2a:
            java.lang.String r1 = "ACTION_CLEAR_ACCESSIBILITY_FOCUS"
            return r1
        L2d:
            java.lang.String r1 = "ACTION_ACCESSIBILITY_FOCUS"
            return r1
        L30:
            java.lang.String r1 = "ACTION_LONG_CLICK"
            return r1
        L33:
            java.lang.String r1 = "ACTION_CLICK"
            return r1
        L36:
            java.lang.String r1 = "ACTION_CLEAR_SELECTION"
            return r1
        L39:
            java.lang.String r1 = "ACTION_SELECT"
            return r1
        L3c:
            java.lang.String r1 = "ACTION_CLEAR_FOCUS"
            return r1
        L3f:
            java.lang.String r1 = "ACTION_FOCUS"
            return r1
    }

    public int a() {
            r0 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.f1136a
            int r0 = r0.getActions()
            return r0
    }

    public void a(int r1) {
            r0 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.f1136a
            r0.addAction(r1)
            return
    }

    public void a(android.graphics.Rect r1) {
            r0 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.f1136a
            r0.getBoundsInParent(r1)
            return
    }

    public void a(java.lang.CharSequence r1) {
            r0 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.f1136a
            r0.setClassName(r1)
            return
    }

    public void a(boolean r1) {
            r0 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.f1136a
            r0.setScrollable(r1)
            return
    }

    public java.lang.CharSequence b() {
            r0 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.f1136a
            java.lang.CharSequence r0 = r0.getClassName()
            return r0
    }

    public void b(android.graphics.Rect r1) {
            r0 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.f1136a
            r0.getBoundsInScreen(r1)
            return
    }

    public java.lang.CharSequence c() {
            r0 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.f1136a
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
    }

    public java.lang.CharSequence d() {
            r0 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.f1136a
            java.lang.CharSequence r0 = r0.getPackageName()
            return r0
    }

    public java.lang.CharSequence e() {
            r0 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.f1136a
            java.lang.CharSequence r0 = r0.getText()
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 != 0) goto L8
            return r1
        L8:
            java.lang.Class<b.b.c.g.z.a> r2 = b.b.c.g.z.a.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L11
            return r1
        L11:
            b.b.c.g.z.a r5 = (b.b.c.g.z.a) r5
            android.view.accessibility.AccessibilityNodeInfo r4 = r4.f1136a
            if (r4 != 0) goto L1c
            android.view.accessibility.AccessibilityNodeInfo r4 = r5.f1136a
            if (r4 == 0) goto L25
            return r1
        L1c:
            android.view.accessibility.AccessibilityNodeInfo r5 = r5.f1136a
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L25
            return r1
        L25:
            return r0
    }

    public java.lang.String f() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 18
            if (r0 < r1) goto Ld
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.f1136a
            java.lang.String r2 = r2.getViewIdResourceName()
            return r2
        Ld:
            r2 = 0
            return r2
    }

    public boolean g() {
            r0 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.f1136a
            boolean r0 = r0.isCheckable()
            return r0
    }

    public boolean h() {
            r0 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.f1136a
            boolean r0 = r0.isChecked()
            return r0
    }

    public int hashCode() {
            r0 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.f1136a
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            return r0
    }

    public boolean i() {
            r0 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.f1136a
            boolean r0 = r0.isClickable()
            return r0
    }

    public boolean j() {
            r0 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.f1136a
            boolean r0 = r0.isEnabled()
            return r0
    }

    public boolean k() {
            r0 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.f1136a
            boolean r0 = r0.isFocusable()
            return r0
    }

    public boolean l() {
            r0 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.f1136a
            boolean r0 = r0.isFocused()
            return r0
    }

    public boolean m() {
            r0 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.f1136a
            boolean r0 = r0.isLongClickable()
            return r0
    }

    public boolean n() {
            r0 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.f1136a
            boolean r0 = r0.isPassword()
            return r0
    }

    public boolean o() {
            r0 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.f1136a
            boolean r0 = r0.isScrollable()
            return r0
    }

    public boolean p() {
            r0 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.f1136a
            boolean r0 = r0.isSelected()
            return r0
    }

    public android.view.accessibility.AccessibilityNodeInfo q() {
            r0 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.f1136a
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r4.a(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "; boundsInParent: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            r4.b(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "; boundsInScreen: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.append(r1)
            java.lang.String r1 = "; packageName: "
            r0.append(r1)
            java.lang.CharSequence r1 = r4.d()
            r0.append(r1)
            java.lang.String r1 = "; className: "
            r0.append(r1)
            java.lang.CharSequence r1 = r4.b()
            r0.append(r1)
            java.lang.String r1 = "; text: "
            r0.append(r1)
            java.lang.CharSequence r1 = r4.e()
            r0.append(r1)
            java.lang.String r1 = "; contentDescription: "
            r0.append(r1)
            java.lang.CharSequence r1 = r4.c()
            r0.append(r1)
            java.lang.String r1 = "; viewId: "
            r0.append(r1)
            java.lang.String r1 = r4.f()
            r0.append(r1)
            java.lang.String r1 = "; checkable: "
            r0.append(r1)
            boolean r1 = r4.g()
            r0.append(r1)
            java.lang.String r1 = "; checked: "
            r0.append(r1)
            boolean r1 = r4.h()
            r0.append(r1)
            java.lang.String r1 = "; focusable: "
            r0.append(r1)
            boolean r1 = r4.k()
            r0.append(r1)
            java.lang.String r1 = "; focused: "
            r0.append(r1)
            boolean r1 = r4.l()
            r0.append(r1)
            java.lang.String r1 = "; selected: "
            r0.append(r1)
            boolean r1 = r4.p()
            r0.append(r1)
            java.lang.String r1 = "; clickable: "
            r0.append(r1)
            boolean r1 = r4.i()
            r0.append(r1)
            java.lang.String r1 = "; longClickable: "
            r0.append(r1)
            boolean r1 = r4.m()
            r0.append(r1)
            java.lang.String r1 = "; enabled: "
            r0.append(r1)
            boolean r1 = r4.j()
            r0.append(r1)
            java.lang.String r1 = "; password: "
            r0.append(r1)
            boolean r1 = r4.n()
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "; scrollable: "
            r1.append(r2)
            boolean r2 = r4.o()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = "; ["
            r0.append(r1)
            int r4 = r4.a()
        L108:
            if (r4 == 0) goto L121
            r1 = 1
            int r2 = java.lang.Integer.numberOfTrailingZeros(r4)
            int r1 = r1 << r2
            int r2 = ~r1
            r4 = r4 & r2
            java.lang.String r1 = b(r1)
            r0.append(r1)
            if (r4 == 0) goto L108
            java.lang.String r1 = ", "
            r0.append(r1)
            goto L108
        L121:
            java.lang.String r4 = "]"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }
}
