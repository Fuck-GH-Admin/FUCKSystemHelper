package android.support.constraint.n;

/* JADX INFO: loaded from: classes.dex */
public class j implements android.support.constraint.n.b.a {
    private static float m = 0.001f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int[] f480c;
    int[] d;
    int[] e;
    float[] f;
    int[] g;
    int[] h;
    int i;
    int j;
    private final android.support.constraint.n.b k;
    protected final android.support.constraint.n.c l;

    static {
            return
    }

    j(android.support.constraint.n.b r3, android.support.constraint.n.c r4) {
            r2 = this;
            r2.<init>()
            r0 = 16
            r2.f478a = r0
            r2.f479b = r0
            int[] r1 = new int[r0]
            r2.f480c = r1
            int[] r1 = new int[r0]
            r2.d = r1
            int[] r1 = new int[r0]
            r2.e = r1
            float[] r1 = new float[r0]
            r2.f = r1
            int[] r1 = new int[r0]
            r2.g = r1
            int[] r0 = new int[r0]
            r2.h = r0
            r0 = 0
            r2.i = r0
            r0 = -1
            r2.j = r0
            r2.k = r3
            r2.l = r4
            r2.clear()
            return
    }

    private void a(int r3, android.support.constraint.n.i r4, float r5) {
            r2 = this;
            int[] r0 = r2.e
            int r1 = r4.f475c
            r0[r3] = r1
            float[] r0 = r2.f
            r0[r3] = r5
            int[] r5 = r2.g
            r0 = -1
            r5[r3] = r0
            int[] r5 = r2.h
            r5[r3] = r0
            android.support.constraint.n.b r3 = r2.k
            r4.a(r3)
            int r3 = r4.m
            int r3 = r3 + 1
            r4.m = r3
            int r3 = r2.i
            int r3 = r3 + 1
            r2.i = r3
            return
    }

    private void a(android.support.constraint.n.i r4, int r5) {
            r3 = this;
            int r4 = r4.f475c
            int r0 = r3.f479b
            int r4 = r4 % r0
            int[] r0 = r3.f480c
            r1 = r0[r4]
            r2 = -1
            if (r1 != r2) goto Lf
            r0[r4] = r5
            goto L1a
        Lf:
            int[] r4 = r3.d
            r0 = r4[r1]
            if (r0 == r2) goto L18
            r1 = r4[r1]
            goto Lf
        L18:
            r4[r1] = r5
        L1a:
            int[] r3 = r3.d
            r3[r5] = r2
            return
    }

    private void b(int r4, android.support.constraint.n.i r5, float r6) {
            r3 = this;
            int r0 = r3.c()
            r3.a(r0, r5, r6)
            r6 = -1
            if (r4 == r6) goto L17
            int[] r1 = r3.g
            r1[r0] = r4
            int[] r1 = r3.h
            r2 = r1[r4]
            r1[r0] = r2
            r1[r4] = r0
            goto L2c
        L17:
            int[] r4 = r3.g
            r4[r0] = r6
            int r4 = r3.i
            if (r4 <= 0) goto L28
            int[] r4 = r3.h
            int r1 = r3.j
            r4[r0] = r1
            r3.j = r0
            goto L2c
        L28:
            int[] r4 = r3.h
            r4[r0] = r6
        L2c:
            int[] r4 = r3.h
            r1 = r4[r0]
            if (r1 == r6) goto L38
            int[] r6 = r3.g
            r4 = r4[r0]
            r6[r4] = r0
        L38:
            r3.a(r5, r0)
            return
    }

    private int c() {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.f478a
            r2 = -1
            if (r0 >= r1) goto L10
            int[] r1 = r3.e
            r1 = r1[r0]
            if (r1 != r2) goto Ld
            return r0
        Ld:
            int r0 = r0 + 1
            goto L1
        L10:
            return r2
    }

    private void d() {
            r4 = this;
            int r0 = r4.f478a
            int r0 = r0 * 2
            int[] r1 = r4.e
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            r4.e = r1
            float[] r1 = r4.f
            float[] r1 = java.util.Arrays.copyOf(r1, r0)
            r4.f = r1
            int[] r1 = r4.g
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            r4.g = r1
            int[] r1 = r4.h
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            r4.h = r1
            int[] r1 = r4.d
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            r4.d = r1
            int r1 = r4.f478a
        L2e:
            if (r1 >= r0) goto L3c
            int[] r2 = r4.e
            r3 = -1
            r2[r1] = r3
            int[] r2 = r4.d
            r2[r1] = r3
            int r1 = r1 + 1
            goto L2e
        L3c:
            r4.f478a = r0
            return
    }

    private void d(android.support.constraint.n.i r6) {
            r5 = this;
            int r6 = r6.f475c
            int r0 = r5.f479b
            int r0 = r6 % r0
            int[] r1 = r5.f480c
            r2 = r1[r0]
            r3 = -1
            if (r2 != r3) goto Le
            return
        Le:
            int[] r4 = r5.e
            r4 = r4[r2]
            if (r4 != r6) goto L1d
            int[] r5 = r5.d
            r6 = r5[r2]
            r1[r0] = r6
            r5[r2] = r3
            goto L40
        L1d:
            int[] r0 = r5.d
            r1 = r0[r2]
            if (r1 == r3) goto L2e
            int[] r1 = r5.e
            r4 = r0[r2]
            r1 = r1[r4]
            if (r1 == r6) goto L2e
            r2 = r0[r2]
            goto L1d
        L2e:
            int[] r0 = r5.d
            r1 = r0[r2]
            if (r1 == r3) goto L40
            int[] r5 = r5.e
            r5 = r5[r1]
            if (r5 != r6) goto L40
            r5 = r0[r1]
            r0[r2] = r5
            r0[r1] = r3
        L40:
            return
    }

    @Override // android.support.constraint.n.b.a
    public float a(int r5) {
            r4 = this;
            int r0 = r4.i
            int r1 = r4.j
            r2 = 0
        L5:
            if (r2 >= r0) goto L19
            if (r2 != r5) goto Le
            float[] r4 = r4.f
            r4 = r4[r1]
            return r4
        Le:
            int[] r3 = r4.h
            r1 = r3[r1]
            r3 = -1
            if (r1 != r3) goto L16
            goto L19
        L16:
            int r2 = r2 + 1
            goto L5
        L19:
            r4 = 0
            return r4
    }

    @Override // android.support.constraint.n.b.a
    public float a(android.support.constraint.n.b r8, boolean r9) {
            r7 = this;
            android.support.constraint.n.i r0 = r8.f457a
            float r0 = r7.a(r0)
            android.support.constraint.n.i r1 = r8.f457a
            r7.a(r1, r9)
            android.support.constraint.n.b$a r8 = r8.e
            android.support.constraint.n.j r8 = (android.support.constraint.n.j) r8
            int r1 = r8.b()
            int r2 = r8.j
            r2 = 0
            r3 = r2
        L17:
            if (r2 >= r1) goto L35
            int[] r4 = r8.e
            r5 = r4[r3]
            r6 = -1
            if (r5 == r6) goto L32
            float[] r5 = r8.f
            r5 = r5[r3]
            android.support.constraint.n.c r6 = r7.l
            android.support.constraint.n.i[] r6 = r6.d
            r4 = r4[r3]
            r4 = r6[r4]
            float r5 = r5 * r0
            r7.a(r4, r5, r9)
            int r2 = r2 + 1
        L32:
            int r3 = r3 + 1
            goto L17
        L35:
            return r0
    }

    @Override // android.support.constraint.n.b.a
    public float a(android.support.constraint.n.i r2) {
            r1 = this;
            int r2 = r1.c(r2)
            r0 = -1
            if (r2 == r0) goto Lc
            float[] r1 = r1.f
            r1 = r1[r2]
            return r1
        Lc:
            r1 = 0
            return r1
    }

    @Override // android.support.constraint.n.b.a
    public float a(android.support.constraint.n.i r7, boolean r8) {
            r6 = this;
            int r0 = r6.c(r7)
            r1 = -1
            if (r0 != r1) goto L9
            r6 = 0
            return r6
        L9:
            r6.d(r7)
            float[] r2 = r6.f
            r2 = r2[r0]
            int r3 = r6.j
            if (r3 != r0) goto L1a
            int[] r3 = r6.h
            r3 = r3[r0]
            r6.j = r3
        L1a:
            int[] r3 = r6.e
            r3[r0] = r1
            int[] r3 = r6.g
            r4 = r3[r0]
            if (r4 == r1) goto L2c
            int[] r4 = r6.h
            r3 = r3[r0]
            r5 = r4[r0]
            r4[r3] = r5
        L2c:
            int[] r3 = r6.h
            r4 = r3[r0]
            if (r4 == r1) goto L3a
            int[] r1 = r6.g
            r3 = r3[r0]
            r0 = r1[r0]
            r1[r3] = r0
        L3a:
            int r0 = r6.i
            int r0 = r0 + (-1)
            r6.i = r0
            int r0 = r7.m
            int r0 = r0 + (-1)
            r7.m = r0
            if (r8 == 0) goto L4d
            android.support.constraint.n.b r6 = r6.k
            r7.b(r6)
        L4d:
            return r2
    }

    @Override // android.support.constraint.n.b.a
    public void a() {
            r6 = this;
            int r0 = r6.i
            int r1 = r6.j
            r2 = 0
        L5:
            if (r2 >= r0) goto L1b
            float[] r3 = r6.f
            r4 = r3[r1]
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r4 * r5
            r3[r1] = r4
            int[] r3 = r6.h
            r1 = r3[r1]
            r3 = -1
            if (r1 != r3) goto L18
            goto L1b
        L18:
            int r2 = r2 + 1
            goto L5
        L1b:
            return
    }

    @Override // android.support.constraint.n.b.a
    public void a(float r6) {
            r5 = this;
            int r0 = r5.i
            int r1 = r5.j
            r2 = 0
        L5:
            if (r2 >= r0) goto L19
            float[] r3 = r5.f
            r4 = r3[r1]
            float r4 = r4 / r6
            r3[r1] = r4
            int[] r3 = r5.h
            r1 = r3[r1]
            r3 = -1
            if (r1 != r3) goto L16
            goto L19
        L16:
            int r2 = r2 + 1
            goto L5
        L19:
            return
    }

    @Override // android.support.constraint.n.b.a
    public void a(android.support.constraint.n.i r9, float r10) {
            r8 = this;
            float r0 = android.support.constraint.n.j.m
            float r1 = -r0
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            r2 = 1
            if (r1 <= 0) goto L10
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 >= 0) goto L10
            r8.a(r9, r2)
            return
        L10:
            int r0 = r8.i
            r1 = 0
            if (r0 != 0) goto L1e
            r8.a(r1, r9, r10)
            r8.a(r9, r1)
            r8.j = r1
            goto L5a
        L1e:
            int r0 = r8.c(r9)
            r3 = -1
            if (r0 == r3) goto L2a
            float[] r8 = r8.f
            r8[r0] = r10
            goto L5a
        L2a:
            int r0 = r8.i
            int r0 = r0 + r2
            int r2 = r8.f478a
            if (r0 < r2) goto L34
            r8.d()
        L34:
            int r0 = r8.i
            int r2 = r8.j
            r4 = r3
        L39:
            if (r1 >= r0) goto L57
            int[] r5 = r8.e
            r6 = r5[r2]
            int r7 = r9.f475c
            if (r6 != r7) goto L48
            float[] r8 = r8.f
            r8[r2] = r10
            return
        L48:
            r5 = r5[r2]
            if (r5 >= r7) goto L4d
            r4 = r2
        L4d:
            int[] r5 = r8.h
            r2 = r5[r2]
            if (r2 != r3) goto L54
            goto L57
        L54:
            int r1 = r1 + 1
            goto L39
        L57:
            r8.b(r4, r9, r10)
        L5a:
            return
    }

    @Override // android.support.constraint.n.b.a
    public void a(android.support.constraint.n.i r5, float r6, boolean r7) {
            r4 = this;
            float r0 = android.support.constraint.n.j.m
            float r1 = -r0
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 <= 0) goto Lc
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 >= 0) goto Lc
            return
        Lc:
            int r0 = r4.c(r5)
            r1 = -1
            if (r0 != r1) goto L17
            r4.a(r5, r6)
            goto L33
        L17:
            float[] r1 = r4.f
            r2 = r1[r0]
            float r2 = r2 + r6
            r1[r0] = r2
            r6 = r1[r0]
            float r2 = android.support.constraint.n.j.m
            float r3 = -r2
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 <= 0) goto L33
            r6 = r1[r0]
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 >= 0) goto L33
            r6 = 0
            r1[r0] = r6
            r4.a(r5, r7)
        L33:
            return
    }

    @Override // android.support.constraint.n.b.a
    public int b() {
            r0 = this;
            int r0 = r0.i
            return r0
    }

    @Override // android.support.constraint.n.b.a
    public android.support.constraint.n.i b(int r7) {
            r6 = this;
            int r0 = r6.i
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r2 = r6.j
            r3 = 0
        L9:
            if (r3 >= r0) goto L25
            r4 = -1
            if (r3 != r7) goto L1b
            if (r2 == r4) goto L1b
            android.support.constraint.n.c r7 = r6.l
            android.support.constraint.n.i[] r7 = r7.d
            int[] r6 = r6.e
            r6 = r6[r2]
            r6 = r7[r6]
            return r6
        L1b:
            int[] r5 = r6.h
            r2 = r5[r2]
            if (r2 != r4) goto L22
            goto L25
        L22:
            int r3 = r3 + 1
            goto L9
        L25:
            return r1
    }

    @Override // android.support.constraint.n.b.a
    public boolean b(android.support.constraint.n.i r1) {
            r0 = this;
            int r0 = r0.c(r1)
            r1 = -1
            if (r0 == r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public int c(android.support.constraint.n.i r6) {
            r5 = this;
            int r0 = r5.i
            r1 = -1
            if (r0 == 0) goto L3f
            if (r6 != 0) goto L8
            goto L3f
        L8:
            int r6 = r6.f475c
            int r0 = r5.f479b
            int r0 = r6 % r0
            int[] r2 = r5.f480c
            r0 = r2[r0]
            if (r0 != r1) goto L15
            return r1
        L15:
            int[] r2 = r5.e
            r2 = r2[r0]
            if (r2 != r6) goto L1c
            return r0
        L1c:
            int[] r2 = r5.d
            r3 = r2[r0]
            if (r3 == r1) goto L2d
            int[] r3 = r5.e
            r4 = r2[r0]
            r3 = r3[r4]
            if (r3 == r6) goto L2d
            r0 = r2[r0]
            goto L1c
        L2d:
            int[] r2 = r5.d
            r3 = r2[r0]
            if (r3 != r1) goto L34
            return r1
        L34:
            int[] r5 = r5.e
            r3 = r2[r0]
            r5 = r5[r3]
            if (r5 != r6) goto L3f
            r5 = r2[r0]
            return r5
        L3f:
            return r1
    }

    @Override // android.support.constraint.n.b.a
    public void clear() {
            r5 = this;
            int r0 = r5.i
            r1 = 0
            r2 = r1
        L4:
            if (r2 >= r0) goto L14
            android.support.constraint.n.i r3 = r5.b(r2)
            if (r3 == 0) goto L11
            android.support.constraint.n.b r4 = r5.k
            r3.b(r4)
        L11:
            int r2 = r2 + 1
            goto L4
        L14:
            r0 = r1
        L15:
            int r2 = r5.f478a
            r3 = -1
            if (r0 >= r2) goto L25
            int[] r2 = r5.e
            r2[r0] = r3
            int[] r2 = r5.d
            r2[r0] = r3
            int r0 = r0 + 1
            goto L15
        L25:
            r0 = r1
        L26:
            int r2 = r5.f479b
            if (r0 >= r2) goto L31
            int[] r2 = r5.f480c
            r2[r0] = r3
            int r0 = r0 + 1
            goto L26
        L31:
            r5.i = r1
            r5.j = r3
            return
    }

    public java.lang.String toString() {
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r9.hashCode()
            r0.append(r1)
            java.lang.String r1 = " { "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            int r1 = r9.i
            r2 = 0
        L18:
            if (r2 >= r1) goto Le2
            android.support.constraint.n.i r3 = r9.b(r2)
            if (r3 != 0) goto L22
            goto Lde
        L22:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = " = "
            r4.append(r0)
            float r0 = r9.a(r2)
            r4.append(r0)
            java.lang.String r0 = " "
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            int r3 = r9.c(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = "[p: "
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            int[] r4 = r9.g
            r4 = r4[r3]
            java.lang.String r5 = "none"
            r6 = -1
            if (r4 == r6) goto L7a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            android.support.constraint.n.c r0 = r9.l
            android.support.constraint.n.i[] r0 = r0.d
            int[] r7 = r9.e
            int[] r8 = r9.g
            r8 = r8[r3]
            r7 = r7[r8]
            r0 = r0[r7]
            r4.append(r0)
            goto L85
        L7a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r5)
        L85:
            java.lang.String r0 = r4.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = ", n: "
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            int[] r4 = r9.h
            r4 = r4[r3]
            if (r4 == r6) goto Lbe
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            android.support.constraint.n.c r0 = r9.l
            android.support.constraint.n.i[] r0 = r0.d
            int[] r5 = r9.e
            int[] r6 = r9.h
            r3 = r6[r3]
            r3 = r5[r3]
            r0 = r0[r3]
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            goto Lcd
        Lbe:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r5)
            java.lang.String r0 = r3.toString()
        Lcd:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = "]"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        Lde:
            int r2 = r2 + 1
            goto L18
        Le2:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r0 = " }"
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            return r9
    }
}
