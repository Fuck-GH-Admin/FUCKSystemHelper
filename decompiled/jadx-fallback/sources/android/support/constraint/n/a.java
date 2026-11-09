package android.support.constraint.n;

/* JADX INFO: loaded from: classes.dex */
public class a implements android.support.constraint.n.b.a {
    private static float l = 0.001f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.support.constraint.n.b f455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final android.support.constraint.n.c f456c;
    private int d;
    private android.support.constraint.n.i e;
    private int[] f;
    private int[] g;
    private float[] h;
    private int i;
    private int j;
    private boolean k;

    static {
            return
    }

    a(android.support.constraint.n.b r4, android.support.constraint.n.c r5) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f454a = r0
            r1 = 8
            r3.d = r1
            r2 = 0
            r3.e = r2
            int[] r2 = new int[r1]
            r3.f = r2
            int[] r2 = new int[r1]
            r3.g = r2
            float[] r1 = new float[r1]
            r3.h = r1
            r1 = -1
            r3.i = r1
            r3.j = r1
            r3.k = r0
            r3.f455b = r4
            r3.f456c = r5
            return
    }

    @Override // android.support.constraint.n.b.a
    public float a(int r4) {
            r3 = this;
            int r0 = r3.i
            r1 = 0
        L3:
            r2 = -1
            if (r0 == r2) goto L18
            int r2 = r3.f454a
            if (r1 >= r2) goto L18
            if (r1 != r4) goto L11
            float[] r3 = r3.h
            r3 = r3[r0]
            return r3
        L11:
            int[] r2 = r3.g
            r0 = r2[r0]
            int r1 = r1 + 1
            goto L3
        L18:
            r3 = 0
            return r3
    }

    @Override // android.support.constraint.n.b.a
    public float a(android.support.constraint.n.b r6, boolean r7) {
            r5 = this;
            android.support.constraint.n.i r0 = r6.f457a
            float r0 = r5.a(r0)
            android.support.constraint.n.i r1 = r6.f457a
            r5.a(r1, r7)
            android.support.constraint.n.b$a r6 = r6.e
            int r1 = r6.b()
            r2 = 0
        L12:
            if (r2 >= r1) goto L23
            android.support.constraint.n.i r3 = r6.b(r2)
            float r4 = r6.a(r3)
            float r4 = r4 * r0
            r5.a(r3, r4, r7)
            int r2 = r2 + 1
            goto L12
        L23:
            return r0
    }

    @Override // android.support.constraint.n.b.a
    public final float a(android.support.constraint.n.i r5) {
            r4 = this;
            int r0 = r4.i
            r1 = 0
        L3:
            r2 = -1
            if (r0 == r2) goto L1e
            int r2 = r4.f454a
            if (r1 >= r2) goto L1e
            int[] r2 = r4.f
            r2 = r2[r0]
            int r3 = r5.f475c
            if (r2 != r3) goto L17
            float[] r4 = r4.h
            r4 = r4[r0]
            return r4
        L17:
            int[] r2 = r4.g
            r0 = r2[r0]
            int r1 = r1 + 1
            goto L3
        L1e:
            r4 = 0
            return r4
    }

    @Override // android.support.constraint.n.b.a
    public final float a(android.support.constraint.n.i r9, boolean r10) {
            r8 = this;
            android.support.constraint.n.i r0 = r8.e
            if (r0 != r9) goto L7
            r0 = 0
            r8.e = r0
        L7:
            int r0 = r8.i
            r1 = 0
            r2 = -1
            if (r0 != r2) goto Le
            return r1
        Le:
            r3 = 0
            r4 = r2
        L10:
            if (r0 == r2) goto L5b
            int r5 = r8.f454a
            if (r3 >= r5) goto L5b
            int[] r5 = r8.f
            r5 = r5[r0]
            int r6 = r9.f475c
            if (r5 != r6) goto L51
            int r1 = r8.i
            if (r0 != r1) goto L29
            int[] r1 = r8.g
            r1 = r1[r0]
            r8.i = r1
            goto L2f
        L29:
            int[] r1 = r8.g
            r3 = r1[r0]
            r1[r4] = r3
        L2f:
            if (r10 == 0) goto L36
            android.support.constraint.n.b r10 = r8.f455b
            r9.b(r10)
        L36:
            int r10 = r9.m
            int r10 = r10 + (-1)
            r9.m = r10
            int r9 = r8.f454a
            int r9 = r9 + (-1)
            r8.f454a = r9
            int[] r9 = r8.f
            r9[r0] = r2
            boolean r9 = r8.k
            if (r9 == 0) goto L4c
            r8.j = r0
        L4c:
            float[] r8 = r8.h
            r8 = r8[r0]
            return r8
        L51:
            int[] r4 = r8.g
            r4 = r4[r0]
            int r3 = r3 + 1
            r7 = r4
            r4 = r0
            r0 = r7
            goto L10
        L5b:
            return r1
    }

    @Override // android.support.constraint.n.b.a
    public void a() {
            r5 = this;
            int r0 = r5.i
            r1 = 0
        L3:
            r2 = -1
            if (r0 == r2) goto L1a
            int r2 = r5.f454a
            if (r1 >= r2) goto L1a
            float[] r2 = r5.h
            r3 = r2[r0]
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r3 = r3 * r4
            r2[r0] = r3
            int[] r2 = r5.g
            r0 = r2[r0]
            int r1 = r1 + 1
            goto L3
        L1a:
            return
    }

    @Override // android.support.constraint.n.b.a
    public void a(float r5) {
            r4 = this;
            int r0 = r4.i
            r1 = 0
        L3:
            r2 = -1
            if (r0 == r2) goto L18
            int r2 = r4.f454a
            if (r1 >= r2) goto L18
            float[] r2 = r4.h
            r3 = r2[r0]
            float r3 = r3 / r5
            r2[r0] = r3
            int[] r2 = r4.g
            r0 = r2[r0]
            int r1 = r1 + 1
            goto L3
        L18:
            return
    }

    @Override // android.support.constraint.n.b.a
    public final void a(android.support.constraint.n.i r10, float r11) {
            r9 = this;
            r0 = 0
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            r1 = 1
            if (r0 != 0) goto La
            r9.a(r10, r1)
            return
        La:
            int r0 = r9.i
            r2 = 0
            r3 = -1
            if (r0 != r3) goto L44
            r9.i = r2
            float[] r0 = r9.h
            r0[r2] = r11
            int[] r11 = r9.f
            int r0 = r10.f475c
            r11[r2] = r0
            int[] r11 = r9.g
            r11[r2] = r3
            int r11 = r10.m
            int r11 = r11 + r1
            r10.m = r11
            android.support.constraint.n.b r11 = r9.f455b
            r10.a(r11)
            int r10 = r9.f454a
            int r10 = r10 + r1
            r9.f454a = r10
            boolean r10 = r9.k
            if (r10 != 0) goto L43
            int r10 = r9.j
            int r10 = r10 + r1
            r9.j = r10
            int[] r11 = r9.f
            int r0 = r11.length
            if (r10 < r0) goto L43
            r9.k = r1
            int r10 = r11.length
            int r10 = r10 - r1
            r9.j = r10
        L43:
            return
        L44:
            r4 = r2
            r5 = r3
        L46:
            if (r0 == r3) goto L65
            int r6 = r9.f454a
            if (r4 >= r6) goto L65
            int[] r6 = r9.f
            r7 = r6[r0]
            int r8 = r10.f475c
            if (r7 != r8) goto L59
            float[] r9 = r9.h
            r9[r0] = r11
            return
        L59:
            r6 = r6[r0]
            if (r6 >= r8) goto L5e
            r5 = r0
        L5e:
            int[] r6 = r9.g
            r0 = r6[r0]
            int r4 = r4 + 1
            goto L46
        L65:
            int r0 = r9.j
            int r4 = r0 + 1
            boolean r6 = r9.k
            if (r6 == 0) goto L76
            int[] r4 = r9.f
            r6 = r4[r0]
            if (r6 != r3) goto L74
            goto L77
        L74:
            int r0 = r4.length
            goto L77
        L76:
            r0 = r4
        L77:
            int[] r4 = r9.f
            int r6 = r4.length
            if (r0 < r6) goto L90
            int r6 = r9.f454a
            int r4 = r4.length
            if (r6 >= r4) goto L90
            r4 = r2
        L82:
            int[] r6 = r9.f
            int r7 = r6.length
            if (r4 >= r7) goto L90
            r6 = r6[r4]
            if (r6 != r3) goto L8d
            r0 = r4
            goto L90
        L8d:
            int r4 = r4 + 1
            goto L82
        L90:
            int[] r4 = r9.f
            int r6 = r4.length
            if (r0 < r6) goto Lbe
            int r0 = r4.length
            int r4 = r9.d
            int r4 = r4 * 2
            r9.d = r4
            r9.k = r2
            int r2 = r0 + (-1)
            r9.j = r2
            float[] r2 = r9.h
            float[] r2 = java.util.Arrays.copyOf(r2, r4)
            r9.h = r2
            int[] r2 = r9.f
            int r4 = r9.d
            int[] r2 = java.util.Arrays.copyOf(r2, r4)
            r9.f = r2
            int[] r2 = r9.g
            int r4 = r9.d
            int[] r2 = java.util.Arrays.copyOf(r2, r4)
            r9.g = r2
        Lbe:
            int[] r2 = r9.f
            int r4 = r10.f475c
            r2[r0] = r4
            float[] r2 = r9.h
            r2[r0] = r11
            int[] r11 = r9.g
            if (r5 == r3) goto Ld3
            r2 = r11[r5]
            r11[r0] = r2
            r11[r5] = r0
            goto Ld9
        Ld3:
            int r2 = r9.i
            r11[r0] = r2
            r9.i = r0
        Ld9:
            int r11 = r10.m
            int r11 = r11 + r1
            r10.m = r11
            android.support.constraint.n.b r11 = r9.f455b
            r10.a(r11)
            int r10 = r9.f454a
            int r10 = r10 + r1
            r9.f454a = r10
            boolean r10 = r9.k
            if (r10 != 0) goto Lf1
            int r10 = r9.j
            int r10 = r10 + r1
            r9.j = r10
        Lf1:
            int r10 = r9.f454a
            int[] r11 = r9.f
            int r11 = r11.length
            if (r10 < r11) goto Lfa
            r9.k = r1
        Lfa:
            int r10 = r9.j
            int[] r11 = r9.f
            int r0 = r11.length
            if (r10 < r0) goto L107
            r9.k = r1
            int r10 = r11.length
            int r10 = r10 - r1
            r9.j = r10
        L107:
            return
    }

    @Override // android.support.constraint.n.b.a
    public void a(android.support.constraint.n.i r10, float r11, boolean r12) {
            r9 = this;
            float r0 = android.support.constraint.n.a.l
            float r1 = -r0
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 <= 0) goto Lc
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 >= 0) goto Lc
            return
        Lc:
            int r0 = r9.i
            r1 = 0
            r2 = -1
            r3 = 1
            if (r0 != r2) goto L47
            r9.i = r1
            float[] r12 = r9.h
            r12[r1] = r11
            int[] r11 = r9.f
            int r12 = r10.f475c
            r11[r1] = r12
            int[] r11 = r9.g
            r11[r1] = r2
            int r11 = r10.m
            int r11 = r11 + r3
            r10.m = r11
            android.support.constraint.n.b r11 = r9.f455b
            r10.a(r11)
            int r10 = r9.f454a
            int r10 = r10 + r3
            r9.f454a = r10
            boolean r10 = r9.k
            if (r10 != 0) goto L46
            int r10 = r9.j
            int r10 = r10 + r3
            r9.j = r10
            int[] r11 = r9.f
            int r12 = r11.length
            if (r10 < r12) goto L46
            r9.k = r3
            int r10 = r11.length
            int r10 = r10 - r3
            r9.j = r10
        L46:
            return
        L47:
            r4 = r1
            r5 = r2
        L49:
            if (r0 == r2) goto La6
            int r6 = r9.f454a
            if (r4 >= r6) goto La6
            int[] r6 = r9.f
            r7 = r6[r0]
            int r8 = r10.f475c
            if (r7 != r8) goto L9a
            float[] r1 = r9.h
            r1 = r1[r0]
            float r1 = r1 + r11
            float r11 = android.support.constraint.n.a.l
            float r2 = -r11
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r4 = 0
            if (r2 <= 0) goto L69
            int r11 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r11 >= 0) goto L69
            r1 = r4
        L69:
            float[] r11 = r9.h
            r11[r0] = r1
            int r11 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r11 != 0) goto L99
            int r11 = r9.i
            if (r0 != r11) goto L7c
            int[] r11 = r9.g
            r11 = r11[r0]
            r9.i = r11
            goto L82
        L7c:
            int[] r11 = r9.g
            r1 = r11[r0]
            r11[r5] = r1
        L82:
            if (r12 == 0) goto L89
            android.support.constraint.n.b r11 = r9.f455b
            r10.b(r11)
        L89:
            boolean r11 = r9.k
            if (r11 == 0) goto L8f
            r9.j = r0
        L8f:
            int r11 = r10.m
            int r11 = r11 - r3
            r10.m = r11
            int r10 = r9.f454a
            int r10 = r10 - r3
            r9.f454a = r10
        L99:
            return
        L9a:
            r6 = r6[r0]
            if (r6 >= r8) goto L9f
            r5 = r0
        L9f:
            int[] r6 = r9.g
            r0 = r6[r0]
            int r4 = r4 + 1
            goto L49
        La6:
            int r12 = r9.j
            int r0 = r12 + 1
            boolean r4 = r9.k
            if (r4 == 0) goto Lb7
            int[] r0 = r9.f
            r4 = r0[r12]
            if (r4 != r2) goto Lb5
            goto Lb8
        Lb5:
            int r12 = r0.length
            goto Lb8
        Lb7:
            r12 = r0
        Lb8:
            int[] r0 = r9.f
            int r4 = r0.length
            if (r12 < r4) goto Ld1
            int r4 = r9.f454a
            int r0 = r0.length
            if (r4 >= r0) goto Ld1
            r0 = r1
        Lc3:
            int[] r4 = r9.f
            int r6 = r4.length
            if (r0 >= r6) goto Ld1
            r4 = r4[r0]
            if (r4 != r2) goto Lce
            r12 = r0
            goto Ld1
        Lce:
            int r0 = r0 + 1
            goto Lc3
        Ld1:
            int[] r0 = r9.f
            int r4 = r0.length
            if (r12 < r4) goto Lff
            int r12 = r0.length
            int r0 = r9.d
            int r0 = r0 * 2
            r9.d = r0
            r9.k = r1
            int r1 = r12 + (-1)
            r9.j = r1
            float[] r1 = r9.h
            float[] r0 = java.util.Arrays.copyOf(r1, r0)
            r9.h = r0
            int[] r0 = r9.f
            int r1 = r9.d
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            r9.f = r0
            int[] r0 = r9.g
            int r1 = r9.d
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            r9.g = r0
        Lff:
            int[] r0 = r9.f
            int r1 = r10.f475c
            r0[r12] = r1
            float[] r0 = r9.h
            r0[r12] = r11
            int[] r11 = r9.g
            if (r5 == r2) goto L114
            r0 = r11[r5]
            r11[r12] = r0
            r11[r5] = r12
            goto L11a
        L114:
            int r0 = r9.i
            r11[r12] = r0
            r9.i = r12
        L11a:
            int r11 = r10.m
            int r11 = r11 + r3
            r10.m = r11
            android.support.constraint.n.b r11 = r9.f455b
            r10.a(r11)
            int r10 = r9.f454a
            int r10 = r10 + r3
            r9.f454a = r10
            boolean r10 = r9.k
            if (r10 != 0) goto L132
            int r10 = r9.j
            int r10 = r10 + r3
            r9.j = r10
        L132:
            int r10 = r9.j
            int[] r11 = r9.f
            int r12 = r11.length
            if (r10 < r12) goto L13f
            r9.k = r3
            int r10 = r11.length
            int r10 = r10 - r3
            r9.j = r10
        L13f:
            return
    }

    @Override // android.support.constraint.n.b.a
    public int b() {
            r0 = this;
            int r0 = r0.f454a
            return r0
    }

    @Override // android.support.constraint.n.b.a
    public android.support.constraint.n.i b(int r4) {
            r3 = this;
            int r0 = r3.i
            r1 = 0
        L3:
            r2 = -1
            if (r0 == r2) goto L1e
            int r2 = r3.f454a
            if (r1 >= r2) goto L1e
            if (r1 != r4) goto L17
            android.support.constraint.n.c r4 = r3.f456c
            android.support.constraint.n.i[] r4 = r4.d
            int[] r3 = r3.f
            r3 = r3[r0]
            r3 = r4[r3]
            return r3
        L17:
            int[] r2 = r3.g
            r0 = r2[r0]
            int r1 = r1 + 1
            goto L3
        L1e:
            r3 = 0
            return r3
    }

    @Override // android.support.constraint.n.b.a
    public boolean b(android.support.constraint.n.i r7) {
            r6 = this;
            int r0 = r6.i
            r1 = -1
            r2 = 0
            if (r0 != r1) goto L7
            return r2
        L7:
            r3 = r2
        L8:
            if (r0 == r1) goto L1f
            int r4 = r6.f454a
            if (r3 >= r4) goto L1f
            int[] r4 = r6.f
            r4 = r4[r0]
            int r5 = r7.f475c
            if (r4 != r5) goto L18
            r6 = 1
            return r6
        L18:
            int[] r4 = r6.g
            r0 = r4[r0]
            int r3 = r3 + 1
            goto L8
        L1f:
            return r2
    }

    @Override // android.support.constraint.n.b.a
    public final void clear() {
            r5 = this;
            int r0 = r5.i
            r1 = 0
            r2 = r1
        L4:
            r3 = -1
            if (r0 == r3) goto L23
            int r4 = r5.f454a
            if (r2 >= r4) goto L23
            android.support.constraint.n.c r3 = r5.f456c
            android.support.constraint.n.i[] r3 = r3.d
            int[] r4 = r5.f
            r4 = r4[r0]
            r3 = r3[r4]
            if (r3 == 0) goto L1c
            android.support.constraint.n.b r4 = r5.f455b
            r3.b(r4)
        L1c:
            int[] r3 = r5.g
            r0 = r3[r0]
            int r2 = r2 + 1
            goto L4
        L23:
            r5.i = r3
            r5.j = r3
            r5.k = r1
            r5.f454a = r1
            return
    }

    public java.lang.String toString() {
            r5 = this;
            int r0 = r5.i
            java.lang.String r1 = ""
            r2 = 0
        L5:
            r3 = -1
            if (r0 == r3) goto L55
            int r3 = r5.f454a
            if (r2 >= r3) goto L55
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = " -> "
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            float[] r1 = r5.h
            r1 = r1[r0]
            r3.append(r1)
            java.lang.String r1 = " : "
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            android.support.constraint.n.c r1 = r5.f456c
            android.support.constraint.n.i[] r1 = r1.d
            int[] r4 = r5.f
            r4 = r4[r0]
            r1 = r1[r4]
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            int[] r3 = r5.g
            r0 = r3[r0]
            int r2 = r2 + 1
            goto L5
        L55:
            return r1
    }
}
