package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class f0 implements android.view.View.OnTouchListener, android.view.View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f851c;
    private final int d;
    final android.view.View e;
    private java.lang.Runnable f;
    private java.lang.Runnable g;
    private boolean h;
    private int i;
    private final int[] j;

    private class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.support.v7.widget.f0 f852b;

        a(android.support.v7.widget.f0 r1) {
                r0 = this;
                r0.f852b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                android.support.v7.widget.f0 r1 = r1.f852b
                android.view.View r1 = r1.e
                android.view.ViewParent r1 = r1.getParent()
                if (r1 == 0) goto Le
                r0 = 1
                r1.requestDisallowInterceptTouchEvent(r0)
            Le:
                return
        }
    }

    private class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.support.v7.widget.f0 f853b;

        b(android.support.v7.widget.f0 r1) {
                r0 = this;
                r0.f853b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r0 = this;
                android.support.v7.widget.f0 r0 = r0.f853b
                r0.d()
                return
        }
    }

    public f0(android.view.View r3) {
            r2 = this;
            r2.<init>()
            r0 = 2
            int[] r1 = new int[r0]
            r2.j = r1
            r2.e = r3
            r1 = 1
            r3.setLongClickable(r1)
            r3.addOnAttachStateChangeListener(r2)
            android.content.Context r3 = r3.getContext()
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            int r3 = r3.getScaledTouchSlop()
            float r3 = (float) r3
            r2.f850b = r3
            int r3 = android.view.ViewConfiguration.getTapTimeout()
            r2.f851c = r3
            int r1 = android.view.ViewConfiguration.getLongPressTimeout()
            int r3 = r3 + r1
            int r3 = r3 / r0
            r2.d = r3
            return
    }

    private boolean a(android.view.MotionEvent r5) {
            r4 = this;
            android.view.View r0 = r4.e
            android.support.v7.view.menu.s r1 = r4.a()
            r2 = 0
            if (r1 == 0) goto L44
            boolean r3 = r1.a()
            if (r3 != 0) goto L10
            goto L44
        L10:
            android.widget.ListView r1 = r1.b()
            android.support.v7.widget.d0 r1 = (android.support.v7.widget.d0) r1
            if (r1 == 0) goto L44
            boolean r3 = r1.isShown()
            if (r3 != 0) goto L1f
            goto L44
        L1f:
            android.view.MotionEvent r3 = android.view.MotionEvent.obtainNoHistory(r5)
            r4.a(r0, r3)
            r4.b(r1, r3)
            int r4 = r4.i
            boolean r4 = r1.a(r3, r4)
            r3.recycle()
            int r5 = r5.getActionMasked()
            r0 = 1
            if (r5 == r0) goto L3e
            r1 = 3
            if (r5 == r1) goto L3e
            r5 = r0
            goto L3f
        L3e:
            r5 = r2
        L3f:
            if (r4 == 0) goto L44
            if (r5 == 0) goto L44
            r2 = r0
        L44:
            return r2
    }

    private static boolean a(android.view.View r2, float r3, float r4, float r5) {
            float r0 = -r5
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 < 0) goto L29
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L29
            int r0 = r2.getRight()
            int r1 = r2.getLeft()
            int r0 = r0 - r1
            float r0 = (float) r0
            float r0 = r0 + r5
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 >= 0) goto L29
            int r3 = r2.getBottom()
            int r2 = r2.getTop()
            int r3 = r3 - r2
            float r2 = (float) r3
            float r2 = r2 + r5
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L29
            r2 = 1
            goto L2a
        L29:
            r2 = 0
        L2a:
            return r2
    }

    private boolean a(android.view.View r2, android.view.MotionEvent r3) {
            r1 = this;
            int[] r1 = r1.j
            r2.getLocationOnScreen(r1)
            r2 = 0
            r2 = r1[r2]
            float r2 = (float) r2
            r0 = 1
            r1 = r1[r0]
            float r1 = (float) r1
            r3.offsetLocation(r2, r1)
            return r0
    }

    private boolean b(android.view.MotionEvent r6) {
            r5 = this;
            android.view.View r0 = r5.e
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.i
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f850b
            boolean r6 = a(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.e()
            android.view.ViewParent r5 = r0.getParent()
            r5.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.e()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.i = r6
            java.lang.Runnable r6 = r5.f
            if (r6 != 0) goto L52
            android.support.v7.widget.f0$a r6 = new android.support.v7.widget.f0$a
            r6.<init>(r5)
            r5.f = r6
        L52:
            java.lang.Runnable r6 = r5.f
            int r1 = r5.f851c
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.g
            if (r6 != 0) goto L65
            android.support.v7.widget.f0$b r6 = new android.support.v7.widget.f0$b
            r6.<init>(r5)
            r5.g = r6
        L65:
            java.lang.Runnable r6 = r5.g
            int r5 = r5.d
            long r3 = (long) r5
            r0.postDelayed(r6, r3)
        L6d:
            return r2
    }

    private boolean b(android.view.View r2, android.view.MotionEvent r3) {
            r1 = this;
            int[] r1 = r1.j
            r2.getLocationOnScreen(r1)
            r2 = 0
            r2 = r1[r2]
            int r2 = -r2
            float r2 = (float) r2
            r0 = 1
            r1 = r1[r0]
            int r1 = -r1
            float r1 = (float) r1
            r3.offsetLocation(r2, r1)
            return r0
    }

    private void e() {
            r2 = this;
            java.lang.Runnable r0 = r2.g
            if (r0 == 0) goto L9
            android.view.View r1 = r2.e
            r1.removeCallbacks(r0)
        L9:
            java.lang.Runnable r0 = r2.f
            if (r0 == 0) goto L12
            android.view.View r2 = r2.e
            r2.removeCallbacks(r0)
        L12:
            return
    }

    public abstract android.support.v7.view.menu.s a();

    protected abstract boolean b();

    protected boolean c() {
            r1 = this;
            android.support.v7.view.menu.s r1 = r1.a()
            if (r1 == 0) goto Lf
            boolean r0 = r1.a()
            if (r0 == 0) goto Lf
            r1.dismiss()
        Lf:
            r1 = 1
            return r1
    }

    void d() {
            r11 = this;
            r11.e()
            android.view.View r0 = r11.e
            boolean r1 = r0.isEnabled()
            if (r1 == 0) goto L36
            boolean r1 = r0.isLongClickable()
            if (r1 == 0) goto L12
            goto L36
        L12:
            boolean r1 = r11.b()
            if (r1 != 0) goto L19
            return
        L19:
            android.view.ViewParent r1 = r0.getParent()
            r2 = 1
            r1.requestDisallowInterceptTouchEvent(r2)
            long r5 = android.os.SystemClock.uptimeMillis()
            r7 = 3
            r8 = 0
            r9 = 0
            r10 = 0
            r3 = r5
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r3, r5, r7, r8, r9, r10)
            r0.onTouchEvent(r1)
            r1.recycle()
            r11.h = r2
        L36:
            return
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
            r10 = this;
            boolean r11 = r10.h
            r0 = 1
            r1 = 0
            if (r11 == 0) goto L17
            boolean r12 = r10.a(r12)
            if (r12 != 0) goto L15
            boolean r12 = r10.c()
            if (r12 != 0) goto L13
            goto L15
        L13:
            r12 = r1
            goto L3d
        L15:
            r12 = r0
            goto L3d
        L17:
            boolean r12 = r10.b(r12)
            if (r12 == 0) goto L25
            boolean r12 = r10.b()
            if (r12 == 0) goto L25
            r12 = r0
            goto L26
        L25:
            r12 = r1
        L26:
            if (r12 == 0) goto L3d
            long r4 = android.os.SystemClock.uptimeMillis()
            r6 = 3
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r4
            android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r2, r4, r6, r7, r8, r9)
            android.view.View r3 = r10.e
            r3.onTouchEvent(r2)
            r2.recycle()
        L3d:
            r10.h = r12
            if (r12 != 0) goto L45
            if (r11 == 0) goto L44
            goto L45
        L44:
            r0 = r1
        L45:
            return r0
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View r1) {
            r0 = this;
            r1 = 0
            r0.h = r1
            r1 = -1
            r0.i = r1
            java.lang.Runnable r1 = r0.f
            if (r1 == 0) goto Lf
            android.view.View r0 = r0.e
            r0.removeCallbacks(r1)
        Lf:
            return
    }
}
