package b.b.c.g;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.view.ViewParent f1115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.view.ViewParent f1116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.view.View f1117c;
    private boolean d;
    private int[] e;

    public k(android.view.View r1) {
            r0 = this;
            r0.<init>()
            r0.f1117c = r1
            return
    }

    private void a(int r2, android.view.ViewParent r3) {
            r1 = this;
            if (r2 == 0) goto L9
            r0 = 1
            if (r2 == r0) goto L6
            goto Lb
        L6:
            r1.f1116b = r3
            goto Lb
        L9:
            r1.f1115a = r3
        Lb:
            return
    }

    private android.view.ViewParent c(int r2) {
            r1 = this;
            if (r2 == 0) goto La
            r0 = 1
            if (r2 == r0) goto L7
            r1 = 0
            return r1
        L7:
            android.view.ViewParent r1 = r1.f1116b
            return r1
        La:
            android.view.ViewParent r1 = r1.f1115a
            return r1
    }

    public void a(boolean r2) {
            r1 = this;
            boolean r0 = r1.d
            if (r0 == 0) goto L9
            android.view.View r0 = r1.f1117c
            b.b.c.g.q.n(r0)
        L9:
            r1.d = r2
            return
    }

    public boolean a() {
            r0 = this;
            boolean r0 = r0.d
            return r0
    }

    public boolean a(float r3, float r4) {
            r2 = this;
            boolean r0 = r2.a()
            r1 = 0
            if (r0 == 0) goto L14
            android.view.ViewParent r0 = r2.c(r1)
            if (r0 == 0) goto L14
            android.view.View r2 = r2.f1117c
            boolean r2 = b.b.c.g.t.a(r0, r2, r3, r4)
            return r2
        L14:
            return r1
    }

    public boolean a(float r3, float r4, boolean r5) {
            r2 = this;
            boolean r0 = r2.a()
            r1 = 0
            if (r0 == 0) goto L14
            android.view.ViewParent r0 = r2.c(r1)
            if (r0 == 0) goto L14
            android.view.View r2 = r2.f1117c
            boolean r2 = b.b.c.g.t.a(r0, r2, r3, r4, r5)
            return r2
        L14:
            return r1
    }

    public boolean a(int r1) {
            r0 = this;
            android.view.ViewParent r0 = r0.c(r1)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean a(int r5, int r6) {
            r4 = this;
            boolean r0 = r4.a(r6)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r4.a()
            if (r0 == 0) goto L35
            android.view.View r0 = r4.f1117c
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r2 = r4.f1117c
        L16:
            if (r0 == 0) goto L35
            android.view.View r3 = r4.f1117c
            boolean r3 = b.b.c.g.t.b(r0, r2, r3, r5, r6)
            if (r3 == 0) goto L29
            r4.a(r6, r0)
            android.view.View r4 = r4.f1117c
            b.b.c.g.t.a(r0, r2, r4, r5, r6)
            return r1
        L29:
            boolean r3 = r0 instanceof android.view.View
            if (r3 == 0) goto L30
            r2 = r0
            android.view.View r2 = (android.view.View) r2
        L30:
            android.view.ViewParent r0 = r0.getParent()
            goto L16
        L35:
            r4 = 0
            return r4
    }

    public boolean a(int r15, int r16, int r17, int r18, int[] r19, int r20) {
            r14 = this;
            r0 = r14
            r1 = r19
            boolean r2 = r14.a()
            r3 = 0
            if (r2 == 0) goto L54
            r2 = r20
            android.view.ViewParent r4 = r14.c(r2)
            if (r4 != 0) goto L13
            return r3
        L13:
            r11 = 1
            if (r15 != 0) goto L24
            if (r16 != 0) goto L24
            if (r17 != 0) goto L24
            if (r18 == 0) goto L1d
            goto L24
        L1d:
            if (r1 == 0) goto L54
            r1[r3] = r3
            r1[r11] = r3
            goto L54
        L24:
            if (r1 == 0) goto L32
            android.view.View r5 = r0.f1117c
            r5.getLocationInWindow(r1)
            r5 = r1[r3]
            r6 = r1[r11]
            r12 = r5
            r13 = r6
            goto L34
        L32:
            r12 = r3
            r13 = r12
        L34:
            android.view.View r5 = r0.f1117c
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r20
            b.b.c.g.t.a(r4, r5, r6, r7, r8, r9, r10)
            if (r1 == 0) goto L53
            android.view.View r0 = r0.f1117c
            r0.getLocationInWindow(r1)
            r0 = r1[r3]
            int r0 = r0 - r12
            r1[r3] = r0
            r0 = r1[r11]
            int r0 = r0 - r13
            r1[r11] = r0
        L53:
            return r11
        L54:
            return r3
    }

    public boolean a(int r11, int r12, int[] r13, int[] r14, int r15) {
            r10 = this;
            boolean r0 = r10.a()
            r1 = 0
            if (r0 == 0) goto L5f
            android.view.ViewParent r2 = r10.c(r15)
            if (r2 != 0) goto Le
            return r1
        Le:
            r0 = 1
            if (r11 != 0) goto L1b
            if (r12 == 0) goto L14
            goto L1b
        L14:
            if (r14 == 0) goto L5f
            r14[r1] = r1
            r14[r0] = r1
            goto L5f
        L1b:
            if (r14 == 0) goto L29
            android.view.View r3 = r10.f1117c
            r3.getLocationInWindow(r14)
            r3 = r14[r1]
            r4 = r14[r0]
            r8 = r3
            r9 = r4
            goto L2b
        L29:
            r8 = r1
            r9 = r8
        L2b:
            if (r13 != 0) goto L38
            int[] r13 = r10.e
            if (r13 != 0) goto L36
            r13 = 2
            int[] r13 = new int[r13]
            r10.e = r13
        L36:
            int[] r13 = r10.e
        L38:
            r13[r1] = r1
            r13[r0] = r1
            android.view.View r3 = r10.f1117c
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r15
            b.b.c.g.t.a(r2, r3, r4, r5, r6, r7)
            if (r14 == 0) goto L56
            android.view.View r10 = r10.f1117c
            r10.getLocationInWindow(r14)
            r10 = r14[r1]
            int r10 = r10 - r8
            r14[r1] = r10
            r10 = r14[r0]
            int r10 = r10 - r9
            r14[r0] = r10
        L56:
            r10 = r13[r1]
            if (r10 != 0) goto L5e
            r10 = r13[r0]
            if (r10 == 0) goto L5f
        L5e:
            r1 = r0
        L5f:
            return r1
    }

    public void b(int r3) {
            r2 = this;
            android.view.ViewParent r0 = r2.c(r3)
            if (r0 == 0) goto Lf
            android.view.View r1 = r2.f1117c
            b.b.c.g.t.a(r0, r1, r3)
            r0 = 0
            r2.a(r3, r0)
        Lf:
            return
    }
}
