package android.support.constraint.n.k;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected android.support.constraint.n.k.e f481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected android.support.constraint.n.k.e f482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected android.support.constraint.n.k.e f483c;
    protected android.support.constraint.n.k.e d;
    protected android.support.constraint.n.k.e e;
    protected android.support.constraint.n.k.e f;
    protected android.support.constraint.n.k.e g;
    protected java.util.ArrayList<android.support.constraint.n.k.e> h;
    protected int i;
    protected int j;
    protected float k;
    int l;
    int m;
    int n;
    private int o;
    private boolean p;
    protected boolean q;
    protected boolean r;
    protected boolean s;
    private boolean t;

    public c(android.support.constraint.n.k.e r2, int r3, boolean r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.k = r0
            r0 = 0
            r1.p = r0
            r1.f481a = r2
            r1.o = r3
            r1.p = r4
            return
    }

    private static boolean a(android.support.constraint.n.k.e r2, int r3) {
            int r0 = r2.B()
            r1 = 8
            if (r0 == r1) goto L1d
            android.support.constraint.n.k.e$b[] r0 = r2.Q
            r0 = r0[r3]
            android.support.constraint.n.k.e$b r1 = android.support.constraint.n.k.e.b.d
            if (r0 != r1) goto L1d
            int[] r2 = r2.p
            r0 = r2[r3]
            if (r0 == 0) goto L1b
            r2 = r2[r3]
            r3 = 3
            if (r2 != r3) goto L1d
        L1b:
            r2 = 1
            goto L1e
        L1d:
            r2 = 0
        L1e:
            return r2
    }

    private void b() {
            r13 = this;
            int r0 = r13.o
            r1 = 2
            int r0 = r0 * r1
            android.support.constraint.n.k.e r2 = r13.f481a
            r3 = 0
            r4 = r2
            r5 = r3
        L9:
            r6 = 1
            if (r5 != 0) goto L129
            int r7 = r13.i
            int r7 = r7 + r6
            r13.i = r7
            android.support.constraint.n.k.e[] r7 = r2.l0
            int r8 = r13.o
            r9 = 0
            r7[r8] = r9
            android.support.constraint.n.k.e[] r7 = r2.k0
            r7[r8] = r9
            int r7 = r2.B()
            r8 = 8
            if (r7 == r8) goto Lfa
            int r7 = r13.l
            int r7 = r7 + r6
            r13.l = r7
            int r7 = r13.o
            android.support.constraint.n.k.e$b r7 = r2.b(r7)
            android.support.constraint.n.k.e$b r8 = android.support.constraint.n.k.e.b.d
            if (r7 == r8) goto L3e
            int r7 = r13.m
            int r8 = r13.o
            int r8 = r2.c(r8)
            int r7 = r7 + r8
            r13.m = r7
        L3e:
            int r7 = r13.m
            android.support.constraint.n.k.d[] r8 = r2.N
            r8 = r8[r0]
            int r8 = r8.c()
            int r7 = r7 + r8
            r13.m = r7
            android.support.constraint.n.k.d[] r8 = r2.N
            int r10 = r0 + 1
            r8 = r8[r10]
            int r8 = r8.c()
            int r7 = r7 + r8
            r13.m = r7
            int r7 = r13.n
            android.support.constraint.n.k.d[] r8 = r2.N
            r8 = r8[r0]
            int r8 = r8.c()
            int r7 = r7 + r8
            r13.n = r7
            android.support.constraint.n.k.d[] r8 = r2.N
            r8 = r8[r10]
            int r8 = r8.c()
            int r7 = r7 + r8
            r13.n = r7
            android.support.constraint.n.k.e r7 = r13.f482b
            if (r7 != 0) goto L76
            r13.f482b = r2
        L76:
            r13.d = r2
            android.support.constraint.n.k.e$b[] r7 = r2.Q
            int r8 = r13.o
            r7 = r7[r8]
            android.support.constraint.n.k.e$b r10 = android.support.constraint.n.k.e.b.d
            if (r7 != r10) goto Lfa
            int[] r7 = r2.p
            r10 = r7[r8]
            r11 = 0
            if (r10 == 0) goto L92
            r10 = r7[r8]
            r12 = 3
            if (r10 == r12) goto L92
            r7 = r7[r8]
            if (r7 != r1) goto Ldb
        L92:
            int r7 = r13.j
            int r7 = r7 + r6
            r13.j = r7
            float[] r7 = r2.j0
            int r8 = r13.o
            r10 = r7[r8]
            int r12 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r12 <= 0) goto La8
            float r12 = r13.k
            r7 = r7[r8]
            float r12 = r12 + r7
            r13.k = r12
        La8:
            int r7 = r13.o
            boolean r7 = a(r2, r7)
            if (r7 == 0) goto Lc9
            int r7 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r7 >= 0) goto Lb7
            r13.q = r6
            goto Lb9
        Lb7:
            r13.r = r6
        Lb9:
            java.util.ArrayList<android.support.constraint.n.k.e> r7 = r13.h
            if (r7 != 0) goto Lc4
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r13.h = r7
        Lc4:
            java.util.ArrayList<android.support.constraint.n.k.e> r7 = r13.h
            r7.add(r2)
        Lc9:
            android.support.constraint.n.k.e r7 = r13.f
            if (r7 != 0) goto Lcf
            r13.f = r2
        Lcf:
            android.support.constraint.n.k.e r7 = r13.g
            if (r7 == 0) goto Ld9
            android.support.constraint.n.k.e[] r7 = r7.k0
            int r8 = r13.o
            r7[r8] = r2
        Ld9:
            r13.g = r2
        Ldb:
            int r7 = r13.o
            if (r7 != 0) goto Leb
            int r7 = r2.n
            if (r7 == 0) goto Le4
            goto Lf6
        Le4:
            int r7 = r2.q
            if (r7 != 0) goto Lf6
            int r7 = r2.r
            goto Lf6
        Leb:
            int r7 = r2.o
            if (r7 == 0) goto Lf0
            goto Lf6
        Lf0:
            int r7 = r2.t
            if (r7 != 0) goto Lf6
            int r7 = r2.u
        Lf6:
            float r7 = r2.U
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
        Lfa:
            if (r4 == r2) goto L102
            android.support.constraint.n.k.e[] r4 = r4.l0
            int r7 = r13.o
            r4[r7] = r2
        L102:
            android.support.constraint.n.k.d[] r4 = r2.N
            int r7 = r0 + 1
            r4 = r4[r7]
            android.support.constraint.n.k.d r4 = r4.f
            if (r4 == 0) goto L120
            android.support.constraint.n.k.e r4 = r4.d
            android.support.constraint.n.k.d[] r7 = r4.N
            r8 = r7[r0]
            android.support.constraint.n.k.d r8 = r8.f
            if (r8 == 0) goto L120
            r7 = r7[r0]
            android.support.constraint.n.k.d r7 = r7.f
            android.support.constraint.n.k.e r7 = r7.d
            if (r7 == r2) goto L11f
            goto L120
        L11f:
            r9 = r4
        L120:
            if (r9 == 0) goto L123
            goto L125
        L123:
            r9 = r2
            r5 = r6
        L125:
            r4 = r2
            r2 = r9
            goto L9
        L129:
            android.support.constraint.n.k.e r1 = r13.f482b
            if (r1 == 0) goto L13a
            int r4 = r13.m
            android.support.constraint.n.k.d[] r1 = r1.N
            r1 = r1[r0]
            int r1 = r1.c()
            int r4 = r4 - r1
            r13.m = r4
        L13a:
            android.support.constraint.n.k.e r1 = r13.d
            if (r1 == 0) goto L14c
            int r4 = r13.m
            android.support.constraint.n.k.d[] r1 = r1.N
            int r0 = r0 + r6
            r0 = r1[r0]
            int r0 = r0.c()
            int r4 = r4 - r0
            r13.m = r4
        L14c:
            r13.f483c = r2
            int r0 = r13.o
            if (r0 != 0) goto L159
            boolean r0 = r13.p
            if (r0 == 0) goto L159
            r13.e = r2
            goto L15d
        L159:
            android.support.constraint.n.k.e r0 = r13.f481a
            r13.e = r0
        L15d:
            boolean r0 = r13.r
            if (r0 == 0) goto L166
            boolean r0 = r13.q
            if (r0 == 0) goto L166
            r3 = r6
        L166:
            r13.s = r3
            return
    }

    public void a() {
            r1 = this;
            boolean r0 = r1.t
            if (r0 != 0) goto L7
            r1.b()
        L7:
            r0 = 1
            r1.t = r0
            return
    }
}
