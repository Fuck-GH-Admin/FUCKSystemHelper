package android.support.constraint.n;

/* JADX INFO: loaded from: classes.dex */
public class b implements android.support.constraint.n.d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    android.support.constraint.n.i f457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f459c;
    java.util.ArrayList<android.support.constraint.n.i> d;
    public android.support.constraint.n.b.a e;
    boolean f;

    public interface a {
        float a(int r1);

        float a(android.support.constraint.n.b r1, boolean r2);

        float a(android.support.constraint.n.i r1);

        float a(android.support.constraint.n.i r1, boolean r2);

        void a();

        void a(float r1);

        void a(android.support.constraint.n.i r1, float r2);

        void a(android.support.constraint.n.i r1, float r2, boolean r3);

        int b();

        android.support.constraint.n.i b(int r1);

        boolean b(android.support.constraint.n.i r1);

        void clear();
    }

    public b() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f457a = r0
            r0 = 0
            r1.f458b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.d = r0
            r0 = 0
            r1.f = r0
            return
    }

    public b(android.support.constraint.n.c r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f457a = r0
            r0 = 0
            r1.f458b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.d = r0
            r0 = 0
            r1.f = r0
            android.support.constraint.n.a r0 = new android.support.constraint.n.a
            r0.<init>(r1, r2)
            r1.e = r0
            return
    }

    private android.support.constraint.n.i a(boolean[] r10, android.support.constraint.n.i r11) {
            r9 = this;
            android.support.constraint.n.b$a r0 = r9.e
            int r0 = r0.b()
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = r1
        La:
            if (r3 >= r0) goto L39
            android.support.constraint.n.b$a r5 = r9.e
            float r5 = r5.a(r3)
            int r6 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r6 >= 0) goto L36
            android.support.constraint.n.b$a r6 = r9.e
            android.support.constraint.n.i r6 = r6.b(r3)
            if (r10 == 0) goto L24
            int r7 = r6.f475c
            boolean r7 = r10[r7]
            if (r7 != 0) goto L36
        L24:
            if (r6 == r11) goto L36
            android.support.constraint.n.i$a r7 = r6.j
            android.support.constraint.n.i$a r8 = android.support.constraint.n.i.a.d
            if (r7 == r8) goto L30
            android.support.constraint.n.i$a r8 = android.support.constraint.n.i.a.e
            if (r7 != r8) goto L36
        L30:
            int r7 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r7 >= 0) goto L36
            r4 = r5
            r2 = r6
        L36:
            int r3 = r3 + 1
            goto La
        L39:
            return r2
    }

    private boolean a(android.support.constraint.n.i r1, android.support.constraint.n.d r2) {
            r0 = this;
            int r0 = r1.m
            r1 = 1
            if (r0 > r1) goto L6
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    public android.support.constraint.n.b a(float r5, float r6, float r7, android.support.constraint.n.i r8, android.support.constraint.n.i r9, android.support.constraint.n.i r10, android.support.constraint.n.i r11) {
            r4 = this;
            r0 = 0
            r4.f458b = r0
            int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L47
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 != 0) goto L10
            goto L47
        L10:
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r1 != 0) goto L1f
            android.support.constraint.n.b$a r5 = r4.e
            r5.a(r8, r3)
            android.support.constraint.n.b$a r5 = r4.e
            r5.a(r9, r2)
            goto L5b
        L1f:
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 != 0) goto L2e
            android.support.constraint.n.b$a r5 = r4.e
            r5.a(r10, r3)
            android.support.constraint.n.b$a r5 = r4.e
            r5.a(r11, r2)
            goto L5b
        L2e:
            float r5 = r5 / r6
            float r7 = r7 / r6
            float r5 = r5 / r7
            android.support.constraint.n.b$a r6 = r4.e
            r6.a(r8, r3)
            android.support.constraint.n.b$a r6 = r4.e
            r6.a(r9, r2)
            android.support.constraint.n.b$a r6 = r4.e
            r6.a(r11, r5)
            android.support.constraint.n.b$a r6 = r4.e
            float r5 = -r5
            r6.a(r10, r5)
            goto L5b
        L47:
            android.support.constraint.n.b$a r5 = r4.e
            r5.a(r8, r3)
            android.support.constraint.n.b$a r5 = r4.e
            r5.a(r9, r2)
            android.support.constraint.n.b$a r5 = r4.e
            r5.a(r11, r3)
            android.support.constraint.n.b$a r5 = r4.e
            r5.a(r10, r2)
        L5b:
            return r4
    }

    public android.support.constraint.n.b a(android.support.constraint.n.d r4, int r5) {
            r3 = this;
            android.support.constraint.n.b$a r0 = r3.e
            java.lang.String r1 = "ep"
            android.support.constraint.n.i r1 = r4.a(r5, r1)
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.a(r1, r2)
            android.support.constraint.n.b$a r0 = r3.e
            java.lang.String r1 = "em"
            android.support.constraint.n.i r4 = r4.a(r5, r1)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.a(r4, r5)
            return r3
    }

    android.support.constraint.n.b a(android.support.constraint.n.i r2, int r3) {
            r1 = this;
            android.support.constraint.n.b$a r0 = r1.e
            float r3 = (float) r3
            r0.a(r2, r3)
            return r1
    }

    android.support.constraint.n.b a(android.support.constraint.n.i r3, android.support.constraint.n.i r4, float r5) {
            r2 = this;
            android.support.constraint.n.b$a r0 = r2.e
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.a(r3, r1)
            android.support.constraint.n.b$a r3 = r2.e
            r3.a(r4, r5)
            return r2
    }

    public android.support.constraint.n.b a(android.support.constraint.n.i r3, android.support.constraint.n.i r4, int r5) {
            r2 = this;
            r0 = 0
            if (r5 == 0) goto Lb
            if (r5 >= 0) goto L8
            int r5 = r5 * (-1)
            r0 = 1
        L8:
            float r5 = (float) r5
            r2.f458b = r5
        Lb:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L1c
            android.support.constraint.n.b$a r0 = r2.e
            r0.a(r3, r5)
            android.support.constraint.n.b$a r3 = r2.e
            r3.a(r4, r1)
            goto L26
        L1c:
            android.support.constraint.n.b$a r0 = r2.e
            r0.a(r3, r1)
            android.support.constraint.n.b$a r3 = r2.e
            r3.a(r4, r5)
        L26:
            return r2
    }

    android.support.constraint.n.b a(android.support.constraint.n.i r6, android.support.constraint.n.i r7, int r8, float r9, android.support.constraint.n.i r10, android.support.constraint.n.i r11, int r12) {
            r5 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r7 != r10) goto L16
            android.support.constraint.n.b$a r8 = r5.e
            r8.a(r6, r0)
            android.support.constraint.n.b$a r6 = r5.e
            r6.a(r11, r0)
            android.support.constraint.n.b$a r6 = r5.e
            r8 = -1073741824(0xffffffffc0000000, float:-2.0)
            r6.a(r7, r8)
            return r5
        L16:
            r1 = 1056964608(0x3f000000, float:0.5)
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L3a
            android.support.constraint.n.b$a r9 = r5.e
            r9.a(r6, r0)
            android.support.constraint.n.b$a r6 = r5.e
            r6.a(r7, r2)
            android.support.constraint.n.b$a r6 = r5.e
            r6.a(r10, r2)
            android.support.constraint.n.b$a r6 = r5.e
            r6.a(r11, r0)
            if (r8 > 0) goto L36
            if (r12 <= 0) goto L84
        L36:
            int r6 = -r8
            int r6 = r6 + r12
        L38:
            float r6 = (float) r6
            goto L4a
        L3a:
            r1 = 0
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 > 0) goto L4d
            android.support.constraint.n.b$a r9 = r5.e
            r9.a(r6, r2)
            android.support.constraint.n.b$a r6 = r5.e
            r6.a(r7, r0)
            float r6 = (float) r8
        L4a:
            r5.f458b = r6
            goto L84
        L4d:
            int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r1 < 0) goto L5d
            android.support.constraint.n.b$a r6 = r5.e
            r6.a(r11, r2)
            android.support.constraint.n.b$a r6 = r5.e
            r6.a(r10, r0)
            int r6 = -r12
            goto L38
        L5d:
            android.support.constraint.n.b$a r1 = r5.e
            float r3 = r0 - r9
            float r4 = r3 * r0
            r1.a(r6, r4)
            android.support.constraint.n.b$a r6 = r5.e
            float r1 = r3 * r2
            r6.a(r7, r1)
            android.support.constraint.n.b$a r6 = r5.e
            float r2 = r2 * r9
            r6.a(r10, r2)
            android.support.constraint.n.b$a r6 = r5.e
            float r0 = r0 * r9
            r6.a(r11, r0)
            if (r8 > 0) goto L7d
            if (r12 <= 0) goto L84
        L7d:
            int r6 = -r8
            float r6 = (float) r6
            float r6 = r6 * r3
            float r7 = (float) r12
            float r7 = r7 * r9
            float r6 = r6 + r7
            goto L4a
        L84:
            return r5
    }

    public android.support.constraint.n.b a(android.support.constraint.n.i r3, android.support.constraint.n.i r4, android.support.constraint.n.i r5, int r6) {
            r2 = this;
            r0 = 0
            if (r6 == 0) goto Lb
            if (r6 >= 0) goto L8
            int r6 = r6 * (-1)
            r0 = 1
        L8:
            float r6 = (float) r6
            r2.f458b = r6
        Lb:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L21
            android.support.constraint.n.b$a r0 = r2.e
            r0.a(r3, r6)
            android.support.constraint.n.b$a r3 = r2.e
            r3.a(r4, r1)
            android.support.constraint.n.b$a r3 = r2.e
            r3.a(r5, r1)
            goto L30
        L21:
            android.support.constraint.n.b$a r0 = r2.e
            r0.a(r3, r1)
            android.support.constraint.n.b$a r3 = r2.e
            r3.a(r4, r6)
            android.support.constraint.n.b$a r3 = r2.e
            r3.a(r5, r6)
        L30:
            return r2
    }

    public android.support.constraint.n.b a(android.support.constraint.n.i r3, android.support.constraint.n.i r4, android.support.constraint.n.i r5, android.support.constraint.n.i r6, float r7) {
            r2 = this;
            android.support.constraint.n.b$a r0 = r2.e
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.a(r3, r1)
            android.support.constraint.n.b$a r3 = r2.e
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.a(r4, r0)
            android.support.constraint.n.b$a r3 = r2.e
            r3.a(r5, r7)
            android.support.constraint.n.b$a r3 = r2.e
            float r4 = -r7
            r3.a(r6, r4)
            return r2
    }

    @Override // android.support.constraint.n.d.a
    public android.support.constraint.n.i a(android.support.constraint.n.d r1, boolean[] r2) {
            r0 = this;
            r1 = 0
            android.support.constraint.n.i r0 = r0.a(r2, r1)
            return r0
    }

    void a() {
            r2 = this;
            float r0 = r2.f458b
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 >= 0) goto L11
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r0 = r0 * r1
            r2.f458b = r0
            android.support.constraint.n.b$a r2 = r2.e
            r2.a()
        L11:
            return
    }

    @Override // android.support.constraint.n.d.a
    public void a(android.support.constraint.n.d.a r6) {
            r5 = this;
            boolean r0 = r6 instanceof android.support.constraint.n.b
            if (r0 == 0) goto L2c
            android.support.constraint.n.b r6 = (android.support.constraint.n.b) r6
            r0 = 0
            r5.f457a = r0
            android.support.constraint.n.b$a r0 = r5.e
            r0.clear()
            r0 = 0
        Lf:
            android.support.constraint.n.b$a r1 = r6.e
            int r1 = r1.b()
            if (r0 >= r1) goto L2c
            android.support.constraint.n.b$a r1 = r6.e
            android.support.constraint.n.i r1 = r1.b(r0)
            android.support.constraint.n.b$a r2 = r6.e
            float r2 = r2.a(r0)
            android.support.constraint.n.b$a r3 = r5.e
            r4 = 1
            r3.a(r1, r2, r4)
            int r0 = r0 + 1
            goto Lf
        L2c:
            return
    }

    public void a(android.support.constraint.n.d r4, android.support.constraint.n.b r5, boolean r6) {
            r3 = this;
            android.support.constraint.n.b$a r0 = r3.e
            float r0 = r0.a(r5, r6)
            float r1 = r3.f458b
            float r2 = r5.f458b
            float r2 = r2 * r0
            float r1 = r1 + r2
            r3.f458b = r1
            if (r6 == 0) goto L15
            android.support.constraint.n.i r5 = r5.f457a
            r5.b(r3)
        L15:
            boolean r5 = android.support.constraint.n.d.t
            if (r5 == 0) goto L2a
            android.support.constraint.n.i r5 = r3.f457a
            if (r5 == 0) goto L2a
            android.support.constraint.n.b$a r5 = r3.e
            int r5 = r5.b()
            if (r5 != 0) goto L2a
            r5 = 1
            r3.f = r5
            r4.f463a = r5
        L2a:
            return
    }

    public void a(android.support.constraint.n.d r4, android.support.constraint.n.i r5, boolean r6) {
            r3 = this;
            boolean r0 = r5.g
            if (r0 != 0) goto L5
            return
        L5:
            android.support.constraint.n.b$a r0 = r3.e
            float r0 = r0.a(r5)
            float r1 = r3.f458b
            float r2 = r5.f
            float r2 = r2 * r0
            float r1 = r1 + r2
            r3.f458b = r1
            android.support.constraint.n.b$a r0 = r3.e
            r0.a(r5, r6)
            if (r6 == 0) goto L1d
            r5.b(r3)
        L1d:
            boolean r6 = android.support.constraint.n.d.t
            if (r6 == 0) goto L30
            if (r5 == 0) goto L30
            android.support.constraint.n.b$a r5 = r3.e
            int r5 = r5.b()
            if (r5 != 0) goto L30
            r5 = 1
            r3.f = r5
            r4.f463a = r5
        L30:
            return
    }

    @Override // android.support.constraint.n.d.a
    public void a(android.support.constraint.n.i r4) {
            r3 = this;
            int r0 = r4.e
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 1
            if (r0 != r2) goto L8
            goto L22
        L8:
            r2 = 2
            if (r0 != r2) goto Le
            r1 = 1148846080(0x447a0000, float:1000.0)
            goto L22
        Le:
            r2 = 3
            if (r0 != r2) goto L15
            r1 = 1232348160(0x49742400, float:1000000.0)
            goto L22
        L15:
            r2 = 4
            if (r0 != r2) goto L1c
            r1 = 1315859240(0x4e6e6b28, float:1.0E9)
            goto L22
        L1c:
            r2 = 5
            if (r0 != r2) goto L22
            r1 = 1399379109(0x5368d4a5, float:1.0E12)
        L22:
            android.support.constraint.n.b$a r3 = r3.e
            r3.a(r4, r1)
            return
    }

    boolean a(android.support.constraint.n.d r3) {
            r2 = this;
            android.support.constraint.n.i r3 = r2.b(r3)
            r0 = 1
            if (r3 != 0) goto L9
            r3 = r0
            goto Ld
        L9:
            r2.d(r3)
            r3 = 0
        Ld:
            android.support.constraint.n.b$a r1 = r2.e
            int r1 = r1.b()
            if (r1 != 0) goto L17
            r2.f = r0
        L17:
            return r3
    }

    android.support.constraint.n.b b(android.support.constraint.n.i r1, int r2) {
            r0 = this;
            r0.f457a = r1
            float r2 = (float) r2
            r1.f = r2
            r0.f458b = r2
            r1 = 1
            r0.f = r1
            return r0
    }

    public android.support.constraint.n.b b(android.support.constraint.n.i r3, android.support.constraint.n.i r4, android.support.constraint.n.i r5, int r6) {
            r2 = this;
            r0 = 0
            if (r6 == 0) goto Lb
            if (r6 >= 0) goto L8
            int r6 = r6 * (-1)
            r0 = 1
        L8:
            float r6 = (float) r6
            r2.f458b = r6
        Lb:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L21
            android.support.constraint.n.b$a r0 = r2.e
            r0.a(r3, r6)
            android.support.constraint.n.b$a r3 = r2.e
            r3.a(r4, r1)
            android.support.constraint.n.b$a r3 = r2.e
            r3.a(r5, r6)
            goto L30
        L21:
            android.support.constraint.n.b$a r0 = r2.e
            r0.a(r3, r1)
            android.support.constraint.n.b$a r3 = r2.e
            r3.a(r4, r6)
            android.support.constraint.n.b$a r3 = r2.e
            r3.a(r5, r1)
        L30:
            return r2
    }

    public android.support.constraint.n.b b(android.support.constraint.n.i r3, android.support.constraint.n.i r4, android.support.constraint.n.i r5, android.support.constraint.n.i r6, float r7) {
            r2 = this;
            android.support.constraint.n.b$a r0 = r2.e
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.a(r5, r1)
            android.support.constraint.n.b$a r5 = r2.e
            r5.a(r6, r1)
            android.support.constraint.n.b$a r5 = r2.e
            r6 = -1090519040(0xffffffffbf000000, float:-0.5)
            r5.a(r3, r6)
            android.support.constraint.n.b$a r3 = r2.e
            r3.a(r4, r6)
            float r3 = -r7
            r2.f458b = r3
            return r2
    }

    android.support.constraint.n.i b(android.support.constraint.n.d r15) {
            r14 = this;
            android.support.constraint.n.b$a r0 = r14.e
            int r0 = r0.b()
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = r2
            r5 = r4
            r6 = r5
            r7 = r3
            r8 = r7
            r2 = r1
        Lf:
            if (r4 >= r0) goto L62
            android.support.constraint.n.b$a r9 = r14.e
            float r9 = r9.a(r4)
            android.support.constraint.n.b$a r10 = r14.e
            android.support.constraint.n.i r10 = r10.b(r4)
            android.support.constraint.n.i$a r11 = r10.j
            android.support.constraint.n.i$a r12 = android.support.constraint.n.i.a.f476b
            r13 = 1
            if (r11 != r12) goto L3f
            if (r1 != 0) goto L2e
        L26:
            boolean r1 = r14.a(r10, r15)
            r5 = r1
            r7 = r9
            r1 = r10
            goto L5f
        L2e:
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 <= 0) goto L33
            goto L26
        L33:
            if (r5 != 0) goto L5f
            boolean r11 = r14.a(r10, r15)
            if (r11 == 0) goto L5f
            r7 = r9
            r1 = r10
            r5 = r13
            goto L5f
        L3f:
            if (r1 != 0) goto L5f
            int r11 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r11 >= 0) goto L5f
            if (r2 != 0) goto L4f
        L47:
            boolean r2 = r14.a(r10, r15)
            r6 = r2
            r8 = r9
            r2 = r10
            goto L5f
        L4f:
            int r11 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r11 <= 0) goto L54
            goto L47
        L54:
            if (r6 != 0) goto L5f
            boolean r11 = r14.a(r10, r15)
            if (r11 == 0) goto L5f
            r8 = r9
            r2 = r10
            r6 = r13
        L5f:
            int r4 = r4 + 1
            goto Lf
        L62:
            if (r1 == 0) goto L65
            return r1
        L65:
            return r2
    }

    public void b(android.support.constraint.n.d r5, android.support.constraint.n.i r6, boolean r7) {
            r4 = this;
            boolean r0 = r6.n
            if (r0 != 0) goto L5
            return
        L5:
            android.support.constraint.n.b$a r0 = r4.e
            float r0 = r0.a(r6)
            float r1 = r4.f458b
            float r2 = r6.p
            float r2 = r2 * r0
            float r1 = r1 + r2
            r4.f458b = r1
            android.support.constraint.n.b$a r1 = r4.e
            r1.a(r6, r7)
            if (r7 == 0) goto L1d
            r6.b(r4)
        L1d:
            android.support.constraint.n.b$a r1 = r4.e
            android.support.constraint.n.c r2 = r5.n
            android.support.constraint.n.i[] r2 = r2.d
            int r3 = r6.o
            r2 = r2[r3]
            r1.a(r2, r0, r7)
            boolean r7 = android.support.constraint.n.d.t
            if (r7 == 0) goto L3d
            if (r6 == 0) goto L3d
            android.support.constraint.n.b$a r6 = r4.e
            int r6 = r6.b()
            if (r6 != 0) goto L3d
            r6 = 1
            r4.f = r6
            r5.f463a = r6
        L3d:
            return
    }

    boolean b() {
            r2 = this;
            android.support.constraint.n.i r0 = r2.f457a
            if (r0 == 0) goto L13
            android.support.constraint.n.i$a r0 = r0.j
            android.support.constraint.n.i$a r1 = android.support.constraint.n.i.a.f476b
            if (r0 == r1) goto L11
            float r2 = r2.f458b
            r0 = 0
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 < 0) goto L13
        L11:
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            return r2
    }

    boolean b(android.support.constraint.n.i r1) {
            r0 = this;
            android.support.constraint.n.b$a r0 = r0.e
            boolean r0 = r0.b(r1)
            return r0
    }

    public android.support.constraint.n.b c(android.support.constraint.n.i r2, int r3) {
            r1 = this;
            if (r3 >= 0) goto Lc
            int r3 = r3 * (-1)
            float r3 = (float) r3
            r1.f458b = r3
            android.support.constraint.n.b$a r3 = r1.e
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L13
        Lc:
            float r3 = (float) r3
            r1.f458b = r3
            android.support.constraint.n.b$a r3 = r1.e
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
        L13:
            r3.a(r2, r0)
            return r1
    }

    public android.support.constraint.n.i c(android.support.constraint.n.i r2) {
            r1 = this;
            r0 = 0
            android.support.constraint.n.i r1 = r1.a(r0, r2)
            return r1
    }

    public void c() {
            r1 = this;
            r0 = 0
            r1.f457a = r0
            android.support.constraint.n.b$a r0 = r1.e
            r0.clear()
            r0 = 0
            r1.f458b = r0
            r0 = 0
            r1.f = r0
            return
    }

    public void c(android.support.constraint.n.d r9) {
            r8 = this;
            android.support.constraint.n.b[] r0 = r9.g
            int r0 = r0.length
            if (r0 != 0) goto L6
            return
        L6:
            r0 = 0
            r1 = r0
        L8:
            r2 = 1
            if (r1 != 0) goto L66
            android.support.constraint.n.b$a r3 = r8.e
            int r3 = r3.b()
            r4 = r0
        L12:
            if (r4 >= r3) goto L2f
            android.support.constraint.n.b$a r5 = r8.e
            android.support.constraint.n.i r5 = r5.b(r4)
            int r6 = r5.d
            r7 = -1
            if (r6 != r7) goto L27
            boolean r6 = r5.g
            if (r6 != 0) goto L27
            boolean r6 = r5.n
            if (r6 == 0) goto L2c
        L27:
            java.util.ArrayList<android.support.constraint.n.i> r6 = r8.d
            r6.add(r5)
        L2c:
            int r4 = r4 + 1
            goto L12
        L2f:
            java.util.ArrayList<android.support.constraint.n.i> r3 = r8.d
            int r3 = r3.size()
            if (r3 <= 0) goto L64
            r4 = r0
        L38:
            if (r4 >= r3) goto L5e
            java.util.ArrayList<android.support.constraint.n.i> r5 = r8.d
            java.lang.Object r5 = r5.get(r4)
            android.support.constraint.n.i r5 = (android.support.constraint.n.i) r5
            boolean r6 = r5.g
            if (r6 == 0) goto L4a
            r8.a(r9, r5, r2)
            goto L5b
        L4a:
            boolean r6 = r5.n
            if (r6 == 0) goto L52
            r8.b(r9, r5, r2)
            goto L5b
        L52:
            android.support.constraint.n.b[] r6 = r9.g
            int r5 = r5.d
            r5 = r6[r5]
            r8.a(r9, r5, r2)
        L5b:
            int r4 = r4 + 1
            goto L38
        L5e:
            java.util.ArrayList<android.support.constraint.n.i> r2 = r8.d
            r2.clear()
            goto L8
        L64:
            r1 = r2
            goto L8
        L66:
            boolean r0 = android.support.constraint.n.d.t
            if (r0 == 0) goto L7a
            android.support.constraint.n.i r0 = r8.f457a
            if (r0 == 0) goto L7a
            android.support.constraint.n.b$a r0 = r8.e
            int r0 = r0.b()
            if (r0 != 0) goto L7a
            r8.f = r2
            r9.f463a = r2
        L7a:
            return
    }

    @Override // android.support.constraint.n.d.a
    public void clear() {
            r1 = this;
            android.support.constraint.n.b$a r0 = r1.e
            r0.clear()
            r0 = 0
            r1.f457a = r0
            r0 = 0
            r1.f458b = r0
            return
    }

    java.lang.String d() {
            r10 = this;
            android.support.constraint.n.i r0 = r10.f457a
            java.lang.String r1 = ""
            if (r0 != 0) goto L14
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            goto L21
        L14:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            android.support.constraint.n.i r1 = r10.f457a
            r0.append(r1)
        L21:
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r10.f458b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L52
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f458b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r4
            goto L53
        L52:
            r1 = r3
        L53:
            android.support.constraint.n.b$a r5 = r10.e
            int r5 = r5.b()
        L59:
            if (r3 >= r5) goto Ld1
            android.support.constraint.n.b$a r6 = r10.e
            android.support.constraint.n.i r6 = r6.b(r3)
            if (r6 != 0) goto L64
            goto Lce
        L64:
            android.support.constraint.n.b$a r7 = r10.e
            float r7 = r7.a(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L6f
            goto Lce
        L6f:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L86
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto Laa
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            goto La2
        L86:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            if (r8 <= 0) goto L9a
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto Laa
        L9a:
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
        La2:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r7 = r7 * r9
        Laa:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto Lb6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto Lc3
        Lb6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        Lc3:
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            r1 = r4
        Lce:
            int r3 = r3 + 1
            goto L59
        Ld1:
            if (r1 != 0) goto Le4
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r0)
            java.lang.String r0 = "0.0"
            r10.append(r0)
            java.lang.String r0 = r10.toString()
        Le4:
            return r0
    }

    void d(android.support.constraint.n.i r4) {
            r3 = this;
            android.support.constraint.n.i r0 = r3.f457a
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 == 0) goto L13
            android.support.constraint.n.b$a r2 = r3.e
            r2.a(r0, r1)
            android.support.constraint.n.i r0 = r3.f457a
            r2 = -1
            r0.d = r2
            r0 = 0
            r3.f457a = r0
        L13:
            android.support.constraint.n.b$a r0 = r3.e
            r2 = 1
            float r0 = r0.a(r4, r2)
            float r0 = r0 * r1
            r3.f457a = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 != 0) goto L24
            return
        L24:
            float r4 = r3.f458b
            float r4 = r4 / r0
            r3.f458b = r4
            android.support.constraint.n.b$a r3 = r3.e
            r3.a(r0)
            return
    }

    @Override // android.support.constraint.n.d.a
    public android.support.constraint.n.i getKey() {
            r0 = this;
            android.support.constraint.n.i r0 = r0.f457a
            return r0
    }

    @Override // android.support.constraint.n.d.a
    public boolean isEmpty() {
            r2 = this;
            android.support.constraint.n.i r0 = r2.f457a
            if (r0 != 0) goto L15
            float r0 = r2.f458b
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L15
            android.support.constraint.n.b$a r2 = r2.e
            int r2 = r2.b()
            if (r2 != 0) goto L15
            r2 = 1
            goto L16
        L15:
            r2 = 0
        L16:
            return r2
    }

    public java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = r0.d()
            return r0
    }
}
