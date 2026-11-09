package android.support.constraint.n;

/* JADX INFO: loaded from: classes.dex */
public class d {
    public static boolean r = false;
    public static boolean s = true;
    public static boolean t = true;
    public static boolean u = true;
    public static boolean v = false;
    private static int w = 1000;
    public static android.support.constraint.n.e x;
    public static long y;
    public static long z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.util.HashMap<java.lang.String, android.support.constraint.n.i> f465c;
    private android.support.constraint.n.d.a d;
    private int e;
    private int f;
    android.support.constraint.n.b[] g;
    public boolean h;
    public boolean i;
    private boolean[] j;
    int k;
    int l;
    private int m;
    final android.support.constraint.n.c n;
    private android.support.constraint.n.i[] o;
    private int p;
    private android.support.constraint.n.d.a q;

    interface a {
        android.support.constraint.n.i a(android.support.constraint.n.d r1, boolean[] r2);

        void a(android.support.constraint.n.d.a r1);

        void a(android.support.constraint.n.i r1);

        void clear();

        android.support.constraint.n.i getKey();

        boolean isEmpty();
    }

    class b extends android.support.constraint.n.b {
        public b(android.support.constraint.n.d r1, android.support.constraint.n.c r2) {
                r0 = this;
                r0.<init>()
                android.support.constraint.n.j r1 = new android.support.constraint.n.j
                r1.<init>(r0, r2)
                r0.e = r1
                return
        }
    }

    static {
            return
    }

    public d() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f463a = r0
            r3.f464b = r0
            r1 = 0
            r3.f465c = r1
            r2 = 32
            r3.e = r2
            r3.f = r2
            r3.g = r1
            r3.h = r0
            r3.i = r0
            boolean[] r1 = new boolean[r2]
            r3.j = r1
            r1 = 1
            r3.k = r1
            r3.l = r0
            r3.m = r2
            int r1 = android.support.constraint.n.d.w
            android.support.constraint.n.i[] r1 = new android.support.constraint.n.i[r1]
            r3.o = r1
            r3.p = r0
            android.support.constraint.n.b[] r0 = new android.support.constraint.n.b[r2]
            r3.g = r0
            r3.j()
            android.support.constraint.n.c r0 = new android.support.constraint.n.c
            r0.<init>()
            r3.n = r0
            android.support.constraint.n.h r1 = new android.support.constraint.n.h
            r1.<init>(r0)
            r3.d = r1
            boolean r0 = android.support.constraint.n.d.v
            if (r0 == 0) goto L4b
            android.support.constraint.n.d$b r0 = new android.support.constraint.n.d$b
            android.support.constraint.n.c r1 = r3.n
            r0.<init>(r3, r1)
            goto L52
        L4b:
            android.support.constraint.n.b r0 = new android.support.constraint.n.b
            android.support.constraint.n.c r1 = r3.n
            r0.<init>(r1)
        L52:
            r3.q = r0
            return
    }

    private final int a(android.support.constraint.n.d.a r13, boolean r14) {
            r12 = this;
            android.support.constraint.n.e r14 = android.support.constraint.n.d.x
            r0 = 1
            if (r14 == 0) goto Lb
            long r2 = r14.h
            long r2 = r2 + r0
            r14.h = r2
        Lb:
            r14 = 0
            r2 = r14
        Ld:
            int r3 = r12.k
            if (r2 >= r3) goto L18
            boolean[] r3 = r12.j
            r3[r2] = r14
            int r2 = r2 + 1
            goto Ld
        L18:
            r2 = r14
            r3 = r2
        L1a:
            if (r2 != 0) goto Lb0
            android.support.constraint.n.e r4 = android.support.constraint.n.d.x
            if (r4 == 0) goto L25
            long r5 = r4.i
            long r5 = r5 + r0
            r4.i = r5
        L25:
            int r3 = r3 + 1
            int r4 = r12.k
            int r4 = r4 * 2
            if (r3 < r4) goto L2e
            return r3
        L2e:
            android.support.constraint.n.i r4 = r13.getKey()
            r5 = 1
            if (r4 == 0) goto L3f
            boolean[] r4 = r12.j
            android.support.constraint.n.i r6 = r13.getKey()
            int r6 = r6.f475c
            r4[r6] = r5
        L3f:
            boolean[] r4 = r12.j
            android.support.constraint.n.i r4 = r13.a(r12, r4)
            if (r4 == 0) goto L52
            boolean[] r6 = r12.j
            int r7 = r4.f475c
            boolean r8 = r6[r7]
            if (r8 == 0) goto L50
            return r3
        L50:
            r6[r7] = r5
        L52:
            if (r4 == 0) goto Lad
            r5 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r6 = -1
            r7 = r14
            r8 = r6
        L5a:
            int r9 = r12.l
            if (r7 >= r9) goto L8e
            android.support.constraint.n.b[] r9 = r12.g
            r9 = r9[r7]
            android.support.constraint.n.i r10 = r9.f457a
            android.support.constraint.n.i$a r10 = r10.j
            android.support.constraint.n.i$a r11 = android.support.constraint.n.i.a.f476b
            if (r10 != r11) goto L6b
            goto L8b
        L6b:
            boolean r10 = r9.f
            if (r10 == 0) goto L70
            goto L8b
        L70:
            boolean r10 = r9.b(r4)
            if (r10 == 0) goto L8b
            android.support.constraint.n.b$a r10 = r9.e
            float r10 = r10.a(r4)
            r11 = 0
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 >= 0) goto L8b
            float r9 = r9.f458b
            float r9 = -r9
            float r9 = r9 / r10
            int r10 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r10 >= 0) goto L8b
            r8 = r7
            r5 = r9
        L8b:
            int r7 = r7 + 1
            goto L5a
        L8e:
            if (r8 <= r6) goto L1a
            android.support.constraint.n.b[] r5 = r12.g
            r5 = r5[r8]
            android.support.constraint.n.i r7 = r5.f457a
            r7.d = r6
            android.support.constraint.n.e r6 = android.support.constraint.n.d.x
            if (r6 == 0) goto La1
            long r9 = r6.j
            long r9 = r9 + r0
            r6.j = r9
        La1:
            r5.d(r4)
            android.support.constraint.n.i r4 = r5.f457a
            r4.d = r8
            r4.a(r12, r5)
            goto L1a
        Lad:
            r2 = r5
            goto L1a
        Lb0:
            return r3
    }

    public static android.support.constraint.n.b a(android.support.constraint.n.d r0, android.support.constraint.n.i r1, android.support.constraint.n.i r2, float r3) {
            android.support.constraint.n.b r0 = r0.b()
            r0.a(r1, r2, r3)
            return r0
    }

    private android.support.constraint.n.i a(android.support.constraint.n.i.a r3, java.lang.String r4) {
            r2 = this;
            android.support.constraint.n.c r0 = r2.n
            android.support.constraint.n.f<android.support.constraint.n.i> r0 = r0.f462c
            java.lang.Object r0 = r0.a()
            android.support.constraint.n.i r0 = (android.support.constraint.n.i) r0
            if (r0 != 0) goto L12
            android.support.constraint.n.i r0 = new android.support.constraint.n.i
            r0.<init>(r3, r4)
            goto L15
        L12:
            r0.a()
        L15:
            r0.a(r3, r4)
            int r3 = r2.p
            int r4 = android.support.constraint.n.d.w
            if (r3 < r4) goto L2c
            int r4 = r4 * 2
            android.support.constraint.n.d.w = r4
            android.support.constraint.n.i[] r3 = r2.o
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
            android.support.constraint.n.i[] r3 = (android.support.constraint.n.i[]) r3
            r2.o = r3
        L2c:
            android.support.constraint.n.i[] r3 = r2.o
            int r4 = r2.p
            int r1 = r4 + 1
            r2.p = r1
            r3[r4] = r0
            return r0
    }

    private int b(android.support.constraint.n.d.a r20) {
            r19 = this;
            r0 = r19
            r2 = 0
        L3:
            int r3 = r0.l
            r4 = 0
            if (r2 >= r3) goto L22
            android.support.constraint.n.b[] r3 = r0.g
            r6 = r3[r2]
            android.support.constraint.n.i r6 = r6.f457a
            android.support.constraint.n.i$a r6 = r6.j
            android.support.constraint.n.i$a r7 = android.support.constraint.n.i.a.f476b
            if (r6 != r7) goto L15
            goto L1f
        L15:
            r3 = r3[r2]
            float r3 = r3.f458b
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L1f
            r2 = 1
            goto L23
        L1f:
            int r2 = r2 + 1
            goto L3
        L22:
            r2 = 0
        L23:
            if (r2 == 0) goto L109
            r2 = 0
            r3 = 0
        L27:
            if (r2 != 0) goto L107
            android.support.constraint.n.e r6 = android.support.constraint.n.d.x
            r7 = 1
            if (r6 == 0) goto L34
            long r9 = r6.k
            long r9 = r9 + r7
            r6.k = r9
        L34:
            int r3 = r3 + 1
            r6 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r10 = 0
            r11 = -1
            r12 = -1
            r13 = 0
        L3d:
            int r14 = r0.l
            if (r10 >= r14) goto Ld6
            android.support.constraint.n.b[] r14 = r0.g
            r14 = r14[r10]
            android.support.constraint.n.i r15 = r14.f457a
            android.support.constraint.n.i$a r15 = r15.j
            android.support.constraint.n.i$a r1 = android.support.constraint.n.i.a.f476b
            if (r15 != r1) goto L4f
            goto Ld0
        L4f:
            boolean r1 = r14.f
            if (r1 == 0) goto L55
            goto Ld0
        L55:
            float r1 = r14.f458b
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto Ld0
            boolean r1 = android.support.constraint.n.d.u
            r15 = 9
            if (r1 == 0) goto L9c
            android.support.constraint.n.b$a r1 = r14.e
            int r1 = r1.b()
            r5 = 0
        L68:
            if (r5 >= r1) goto Ld0
            android.support.constraint.n.b$a r7 = r14.e
            android.support.constraint.n.i r7 = r7.b(r5)
            android.support.constraint.n.b$a r8 = r14.e
            float r8 = r8.a(r7)
            int r16 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r16 > 0) goto L7b
            goto L95
        L7b:
            r9 = 0
        L7c:
            if (r9 >= r15) goto L95
            float[] r15 = r7.h
            r15 = r15[r9]
            float r15 = r15 / r8
            int r18 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r18 >= 0) goto L89
            if (r9 == r13) goto L8b
        L89:
            if (r9 <= r13) goto L90
        L8b:
            int r12 = r7.f475c
            r13 = r9
            r11 = r10
            r6 = r15
        L90:
            int r9 = r9 + 1
            r15 = 9
            goto L7c
        L95:
            int r5 = r5 + 1
            r7 = 1
            r15 = 9
            goto L68
        L9c:
            r1 = 1
        L9d:
            int r5 = r0.k
            if (r1 >= r5) goto Ld0
            android.support.constraint.n.c r5 = r0.n
            android.support.constraint.n.i[] r5 = r5.d
            r5 = r5[r1]
            android.support.constraint.n.b$a r7 = r14.e
            float r7 = r7.a(r5)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 > 0) goto Lb4
            r9 = 9
            goto Lcd
        Lb4:
            r8 = 0
            r9 = 9
        Lb7:
            if (r8 >= r9) goto Lcd
            float[] r15 = r5.h
            r15 = r15[r8]
            float r15 = r15 / r7
            int r17 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r17 >= 0) goto Lc4
            if (r8 == r13) goto Lc6
        Lc4:
            if (r8 <= r13) goto Lca
        Lc6:
            r12 = r1
            r13 = r8
            r11 = r10
            r6 = r15
        Lca:
            int r8 = r8 + 1
            goto Lb7
        Lcd:
            int r1 = r1 + 1
            goto L9d
        Ld0:
            int r10 = r10 + 1
            r7 = 1
            goto L3d
        Ld6:
            r1 = -1
            if (r11 == r1) goto Lfd
            android.support.constraint.n.b[] r5 = r0.g
            r5 = r5[r11]
            android.support.constraint.n.i r6 = r5.f457a
            r6.d = r1
            android.support.constraint.n.e r1 = android.support.constraint.n.d.x
            if (r1 == 0) goto Lec
            long r6 = r1.j
            r8 = 1
            long r6 = r6 + r8
            r1.j = r6
        Lec:
            android.support.constraint.n.c r1 = r0.n
            android.support.constraint.n.i[] r1 = r1.d
            r1 = r1[r12]
            r5.d(r1)
            android.support.constraint.n.i r1 = r5.f457a
            r1.d = r11
            r1.a(r0, r5)
            goto Lfe
        Lfd:
            r2 = 1
        Lfe:
            int r1 = r0.k
            int r1 = r1 / 2
            if (r3 <= r1) goto L27
            r2 = 1
            goto L27
        L107:
            r1 = r3
            goto L10a
        L109:
            r1 = 0
        L10a:
            return r1
    }

    private final void b(android.support.constraint.n.b r8) {
            r7 = this;
            boolean r0 = android.support.constraint.n.d.t
            if (r0 == 0) goto L10
            boolean r0 = r8.f
            if (r0 == 0) goto L10
            android.support.constraint.n.i r0 = r8.f457a
            float r8 = r8.f458b
            r0.a(r7, r8)
            goto L21
        L10:
            android.support.constraint.n.b[] r0 = r7.g
            int r1 = r7.l
            r0[r1] = r8
            android.support.constraint.n.i r0 = r8.f457a
            r0.d = r1
            int r1 = r1 + 1
            r7.l = r1
            r0.a(r7, r8)
        L21:
            boolean r8 = android.support.constraint.n.d.t
            if (r8 == 0) goto L9c
            boolean r8 = r7.f463a
            if (r8 == 0) goto L9c
            r8 = 0
            r0 = r8
        L2b:
            int r1 = r7.l
            if (r0 >= r1) goto L9a
            android.support.constraint.n.b[] r1 = r7.g
            r1 = r1[r0]
            if (r1 != 0) goto L3c
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.String r2 = "WTF"
            r1.println(r2)
        L3c:
            android.support.constraint.n.b[] r1 = r7.g
            r2 = r1[r0]
            if (r2 == 0) goto L97
            r2 = r1[r0]
            boolean r2 = r2.f
            if (r2 == 0) goto L97
            r1 = r1[r0]
            android.support.constraint.n.i r2 = r1.f457a
            float r3 = r1.f458b
            r2.a(r7, r3)
            boolean r2 = android.support.constraint.n.d.v
            if (r2 == 0) goto L5a
            android.support.constraint.n.c r2 = r7.n
            android.support.constraint.n.f<android.support.constraint.n.b> r2 = r2.f460a
            goto L5e
        L5a:
            android.support.constraint.n.c r2 = r7.n
            android.support.constraint.n.f<android.support.constraint.n.b> r2 = r2.f461b
        L5e:
            r2.a(r1)
            android.support.constraint.n.b[] r1 = r7.g
            r2 = 0
            r1[r0] = r2
            int r1 = r0 + 1
            r3 = r1
        L69:
            int r4 = r7.l
            if (r1 >= r4) goto L89
            android.support.constraint.n.b[] r3 = r7.g
            int r4 = r1 + (-1)
            r5 = r3[r1]
            r3[r4] = r5
            r5 = r3[r4]
            android.support.constraint.n.i r5 = r5.f457a
            int r5 = r5.d
            if (r5 != r1) goto L83
            r3 = r3[r4]
            android.support.constraint.n.i r3 = r3.f457a
            r3.d = r4
        L83:
            int r3 = r1 + 1
            r6 = r3
            r3 = r1
            r1 = r6
            goto L69
        L89:
            if (r3 >= r4) goto L8f
            android.support.constraint.n.b[] r1 = r7.g
            r1[r3] = r2
        L8f:
            int r1 = r7.l
            int r1 = r1 + (-1)
            r7.l = r1
            int r0 = r0 + (-1)
        L97:
            int r0 = r0 + 1
            goto L2b
        L9a:
            r7.f463a = r8
        L9c:
            return
    }

    private void g() {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.l
            if (r0 >= r1) goto L12
            android.support.constraint.n.b[] r1 = r3.g
            r1 = r1[r0]
            android.support.constraint.n.i r2 = r1.f457a
            float r1 = r1.f458b
            r2.f = r1
            int r0 = r0 + 1
            goto L1
        L12:
            return
    }

    public static android.support.constraint.n.e h() {
            android.support.constraint.n.e r0 = android.support.constraint.n.d.x
            return r0
    }

    private void i() {
            r5 = this;
            int r0 = r5.e
            int r0 = r0 * 2
            r5.e = r0
            android.support.constraint.n.b[] r1 = r5.g
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            android.support.constraint.n.b[] r0 = (android.support.constraint.n.b[]) r0
            r5.g = r0
            android.support.constraint.n.c r0 = r5.n
            android.support.constraint.n.i[] r1 = r0.d
            int r2 = r5.e
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            android.support.constraint.n.i[] r1 = (android.support.constraint.n.i[]) r1
            r0.d = r1
            int r0 = r5.e
            boolean[] r1 = new boolean[r0]
            r5.j = r1
            r5.f = r0
            r5.m = r0
            android.support.constraint.n.e r5 = android.support.constraint.n.d.x
            if (r5 == 0) goto L42
            long r1 = r5.d
            r3 = 1
            long r1 = r1 + r3
            r5.d = r1
            long r1 = r5.o
            long r3 = (long) r0
            long r0 = java.lang.Math.max(r1, r3)
            r5.o = r0
            android.support.constraint.n.e r5 = android.support.constraint.n.d.x
            long r0 = r5.o
            r5.x = r0
        L42:
            return
    }

    private void j() {
            r4 = this;
            boolean r0 = android.support.constraint.n.d.v
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L1e
        L6:
            int r0 = r4.l
            if (r2 >= r0) goto L36
            android.support.constraint.n.b[] r0 = r4.g
            r0 = r0[r2]
            if (r0 == 0) goto L17
            android.support.constraint.n.c r3 = r4.n
            android.support.constraint.n.f<android.support.constraint.n.b> r3 = r3.f460a
            r3.a(r0)
        L17:
            android.support.constraint.n.b[] r0 = r4.g
            r0[r2] = r1
            int r2 = r2 + 1
            goto L6
        L1e:
            int r0 = r4.l
            if (r2 >= r0) goto L36
            android.support.constraint.n.b[] r0 = r4.g
            r0 = r0[r2]
            if (r0 == 0) goto L2f
            android.support.constraint.n.c r3 = r4.n
            android.support.constraint.n.f<android.support.constraint.n.b> r3 = r3.f461b
            r3.a(r0)
        L2f:
            android.support.constraint.n.b[] r0 = r4.g
            r0[r2] = r1
            int r2 = r2 + 1
            goto L1e
        L36:
            return
    }

    public android.support.constraint.n.b a(android.support.constraint.n.i r4, android.support.constraint.n.i r5, int r6, int r7) {
            r3 = this;
            boolean r0 = android.support.constraint.n.d.s
            r1 = 8
            if (r0 == 0) goto L1a
            if (r7 != r1) goto L1a
            boolean r0 = r5.g
            if (r0 == 0) goto L1a
            int r0 = r4.d
            r2 = -1
            if (r0 != r2) goto L1a
            float r5 = r5.f
            float r6 = (float) r6
            float r5 = r5 + r6
            r4.a(r3, r5)
            r3 = 0
            return r3
        L1a:
            android.support.constraint.n.b r0 = r3.b()
            r0.a(r4, r5, r6)
            if (r7 == r1) goto L26
            r0.a(r3, r7)
        L26:
            r3.a(r0)
            return r0
    }

    public android.support.constraint.n.i a() {
            r5 = this;
            android.support.constraint.n.e r0 = android.support.constraint.n.d.x
            if (r0 == 0) goto Lb
            long r1 = r0.n
            r3 = 1
            long r1 = r1 + r3
            r0.n = r1
        Lb:
            int r0 = r5.k
            int r0 = r0 + 1
            int r1 = r5.f
            if (r0 < r1) goto L16
            r5.i()
        L16:
            android.support.constraint.n.i$a r0 = android.support.constraint.n.i.a.d
            r1 = 0
            android.support.constraint.n.i r0 = r5.a(r0, r1)
            int r1 = r5.f464b
            int r1 = r1 + 1
            r5.f464b = r1
            int r2 = r5.k
            int r2 = r2 + 1
            r5.k = r2
            r0.f475c = r1
            android.support.constraint.n.c r5 = r5.n
            android.support.constraint.n.i[] r5 = r5.d
            r5[r1] = r0
            return r0
    }

    public android.support.constraint.n.i a(int r6, java.lang.String r7) {
            r5 = this;
            android.support.constraint.n.e r0 = android.support.constraint.n.d.x
            if (r0 == 0) goto Lb
            long r1 = r0.l
            r3 = 1
            long r1 = r1 + r3
            r0.l = r1
        Lb:
            int r0 = r5.k
            int r0 = r0 + 1
            int r1 = r5.f
            if (r0 < r1) goto L16
            r5.i()
        L16:
            android.support.constraint.n.i$a r0 = android.support.constraint.n.i.a.e
            android.support.constraint.n.i r7 = r5.a(r0, r7)
            int r0 = r5.f464b
            int r0 = r0 + 1
            r5.f464b = r0
            int r1 = r5.k
            int r1 = r1 + 1
            r5.k = r1
            r7.f475c = r0
            r7.e = r6
            android.support.constraint.n.c r6 = r5.n
            android.support.constraint.n.i[] r6 = r6.d
            r6[r0] = r7
            android.support.constraint.n.d$a r5 = r5.d
            r5.a(r7)
            return r7
    }

    public android.support.constraint.n.i a(java.lang.Object r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r3.k
            int r1 = r1 + 1
            int r2 = r3.f
            if (r1 < r2) goto Lf
            r3.i()
        Lf:
            boolean r1 = r4 instanceof android.support.constraint.n.k.d
            if (r1 == 0) goto L55
            android.support.constraint.n.k.d r4 = (android.support.constraint.n.k.d) r4
            android.support.constraint.n.i r0 = r4.f()
            if (r0 != 0) goto L25
            android.support.constraint.n.c r0 = r3.n
            r4.a(r0)
            android.support.constraint.n.i r4 = r4.f()
            r0 = r4
        L25:
            int r4 = r0.f475c
            r1 = -1
            if (r4 == r1) goto L36
            int r2 = r3.f464b
            if (r4 > r2) goto L36
            android.support.constraint.n.c r2 = r3.n
            android.support.constraint.n.i[] r2 = r2.d
            r4 = r2[r4]
            if (r4 != 0) goto L55
        L36:
            int r4 = r0.f475c
            if (r4 == r1) goto L3d
            r0.a()
        L3d:
            int r4 = r3.f464b
            int r4 = r4 + 1
            r3.f464b = r4
            int r1 = r3.k
            int r1 = r1 + 1
            r3.k = r1
            r0.f475c = r4
            android.support.constraint.n.i$a r1 = android.support.constraint.n.i.a.f476b
            r0.j = r1
            android.support.constraint.n.c r3 = r3.n
            android.support.constraint.n.i[] r3 = r3.d
            r3[r4] = r0
        L55:
            return r0
    }

    public void a(android.support.constraint.n.b r8) {
            r7 = this;
            if (r8 != 0) goto L3
            return
        L3:
            android.support.constraint.n.e r0 = android.support.constraint.n.d.x
            r1 = 1
            if (r0 == 0) goto L17
            long r3 = r0.f
            long r3 = r3 + r1
            r0.f = r3
            boolean r3 = r8.f
            if (r3 == 0) goto L17
            long r3 = r0.g
            long r3 = r3 + r1
            r0.g = r3
        L17:
            int r0 = r7.l
            r3 = 1
            int r0 = r0 + r3
            int r4 = r7.m
            if (r0 >= r4) goto L26
            int r0 = r7.k
            int r0 = r0 + r3
            int r4 = r7.f
            if (r0 < r4) goto L29
        L26:
            r7.i()
        L29:
            r0 = 0
            boolean r4 = r8.f
            if (r4 != 0) goto L9e
            r8.c(r7)
            boolean r4 = r8.isEmpty()
            if (r4 == 0) goto L38
            return
        L38:
            r8.a()
            boolean r4 = r8.a(r7)
            if (r4 == 0) goto L95
            android.support.constraint.n.i r4 = r7.a()
            r8.f457a = r4
            int r5 = r7.l
            r7.b(r8)
            int r6 = r7.l
            int r5 = r5 + r3
            if (r6 != r5) goto L95
            android.support.constraint.n.d$a r0 = r7.q
            r0.a(r8)
            android.support.constraint.n.d$a r0 = r7.q
            r7.a(r0, r3)
            int r0 = r4.d
            r5 = -1
            if (r0 != r5) goto L96
            android.support.constraint.n.i r0 = r8.f457a
            if (r0 != r4) goto L76
            android.support.constraint.n.i r0 = r8.c(r4)
            if (r0 == 0) goto L76
            android.support.constraint.n.e r4 = android.support.constraint.n.d.x
            if (r4 == 0) goto L73
            long r5 = r4.j
            long r5 = r5 + r1
            r4.j = r5
        L73:
            r8.d(r0)
        L76:
            boolean r0 = r8.f
            if (r0 != 0) goto L7f
            android.support.constraint.n.i r0 = r8.f457a
            r0.a(r7, r8)
        L7f:
            boolean r0 = android.support.constraint.n.d.v
            if (r0 == 0) goto L88
            android.support.constraint.n.c r0 = r7.n
            android.support.constraint.n.f<android.support.constraint.n.b> r0 = r0.f460a
            goto L8c
        L88:
            android.support.constraint.n.c r0 = r7.n
            android.support.constraint.n.f<android.support.constraint.n.b> r0 = r0.f461b
        L8c:
            r0.a(r8)
            int r0 = r7.l
            int r0 = r0 - r3
            r7.l = r0
            goto L96
        L95:
            r3 = r0
        L96:
            boolean r0 = r8.b()
            if (r0 != 0) goto L9d
            return
        L9d:
            r0 = r3
        L9e:
            if (r0 != 0) goto La3
            r7.b(r8)
        La3:
            return
    }

    void a(android.support.constraint.n.b r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            android.support.constraint.n.i r1 = r1.a(r4, r0)
            r2.a(r1, r3)
            return
    }

    void a(android.support.constraint.n.d.a r6) {
            r5 = this;
            android.support.constraint.n.e r0 = android.support.constraint.n.d.x
            if (r0 == 0) goto L23
            long r1 = r0.t
            r3 = 1
            long r1 = r1 + r3
            r0.t = r1
            long r1 = r0.u
            int r3 = r5.k
            long r3 = (long) r3
            long r1 = java.lang.Math.max(r1, r3)
            r0.u = r1
            android.support.constraint.n.e r0 = android.support.constraint.n.d.x
            long r1 = r0.v
            int r3 = r5.l
            long r3 = (long) r3
            long r1 = java.lang.Math.max(r1, r3)
            r0.v = r1
        L23:
            r5.b(r6)
            r0 = 0
            r5.a(r6, r0)
            r5.g()
            return
    }

    public void a(android.support.constraint.n.i r6, int r7) {
            r5 = this;
            boolean r0 = android.support.constraint.n.d.s
            r1 = -1
            r2 = 1
            if (r0 == 0) goto L30
            int r0 = r6.d
            if (r0 != r1) goto L30
            float r7 = (float) r7
            r6.a(r5, r7)
            r0 = 0
        Lf:
            int r1 = r5.f464b
            int r1 = r1 + r2
            if (r0 >= r1) goto L2f
            android.support.constraint.n.c r1 = r5.n
            android.support.constraint.n.i[] r1 = r1.d
            r1 = r1[r0]
            if (r1 == 0) goto L2c
            boolean r3 = r1.n
            if (r3 == 0) goto L2c
            int r3 = r1.o
            int r4 = r6.f475c
            if (r3 != r4) goto L2c
            float r3 = r1.p
            float r3 = r3 + r7
            r1.a(r5, r3)
        L2c:
            int r0 = r0 + 1
            goto Lf
        L2f:
            return
        L30:
            int r0 = r6.d
            if (r0 == r1) goto L53
            android.support.constraint.n.b[] r1 = r5.g
            r0 = r1[r0]
            boolean r1 = r0.f
            if (r1 == 0) goto L40
        L3c:
            float r5 = (float) r7
            r0.f458b = r5
            goto L5d
        L40:
            android.support.constraint.n.b$a r1 = r0.e
            int r1 = r1.b()
            if (r1 != 0) goto L4b
            r0.f = r2
            goto L3c
        L4b:
            android.support.constraint.n.b r0 = r5.b()
            r0.c(r6, r7)
            goto L5a
        L53:
            android.support.constraint.n.b r0 = r5.b()
            r0.b(r6, r7)
        L5a:
            r5.a(r0)
        L5d:
            return
    }

    public void a(android.support.constraint.n.i r12, android.support.constraint.n.i r13, int r14, float r15, android.support.constraint.n.i r16, android.support.constraint.n.i r17, int r18, int r19) {
            r11 = this;
            r0 = r11
            r1 = r19
            android.support.constraint.n.b r10 = r11.b()
            r2 = r10
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r2.a(r3, r4, r5, r6, r7, r8, r9)
            r2 = 8
            if (r1 == r2) goto L1c
            r10.a(r11, r1)
        L1c:
            r11.a(r10)
            return
    }

    public void a(android.support.constraint.n.i r3, android.support.constraint.n.i r4, int r5, boolean r6) {
            r2 = this;
            android.support.constraint.n.b r6 = r2.b()
            android.support.constraint.n.i r0 = r2.c()
            r1 = 0
            r0.e = r1
            r6.a(r3, r4, r0, r5)
            r2.a(r6)
            return
    }

    public void a(android.support.constraint.n.i r8, android.support.constraint.n.i r9, android.support.constraint.n.i r10, android.support.constraint.n.i r11, float r12, int r13) {
            r7 = this;
            android.support.constraint.n.b r6 = r7.b()
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.a(r1, r2, r3, r4, r5)
            r8 = 8
            if (r13 == r8) goto L14
            r6.a(r7, r13)
        L14:
            r7.a(r6)
            return
    }

    public void a(android.support.constraint.n.k.e r19, android.support.constraint.n.k.e r20, float r21, int r22) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            android.support.constraint.n.k.d$b r3 = android.support.constraint.n.k.d.b.f489c
            android.support.constraint.n.k.d r3 = r1.a(r3)
            android.support.constraint.n.i r5 = r0.a(r3)
            android.support.constraint.n.k.d$b r3 = android.support.constraint.n.k.d.b.d
            android.support.constraint.n.k.d r3 = r1.a(r3)
            android.support.constraint.n.i r7 = r0.a(r3)
            android.support.constraint.n.k.d$b r3 = android.support.constraint.n.k.d.b.e
            android.support.constraint.n.k.d r3 = r1.a(r3)
            android.support.constraint.n.i r3 = r0.a(r3)
            android.support.constraint.n.k.d$b r4 = android.support.constraint.n.k.d.b.f
            android.support.constraint.n.k.d r1 = r1.a(r4)
            android.support.constraint.n.i r8 = r0.a(r1)
            android.support.constraint.n.k.d$b r1 = android.support.constraint.n.k.d.b.f489c
            android.support.constraint.n.k.d r1 = r2.a(r1)
            android.support.constraint.n.i r1 = r0.a(r1)
            android.support.constraint.n.k.d$b r4 = android.support.constraint.n.k.d.b.d
            android.support.constraint.n.k.d r4 = r2.a(r4)
            android.support.constraint.n.i r9 = r0.a(r4)
            android.support.constraint.n.k.d$b r4 = android.support.constraint.n.k.d.b.e
            android.support.constraint.n.k.d r4 = r2.a(r4)
            android.support.constraint.n.i r12 = r0.a(r4)
            android.support.constraint.n.k.d$b r4 = android.support.constraint.n.k.d.b.f
            android.support.constraint.n.k.d r2 = r2.a(r4)
            android.support.constraint.n.i r10 = r0.a(r2)
            android.support.constraint.n.b r2 = r18.b()
            r4 = r21
            double r13 = (double) r4
            double r15 = java.lang.Math.sin(r13)
            r4 = r22
            r17 = r3
            double r3 = (double) r4
            r19 = r12
            double r11 = r15 * r3
            float r11 = (float) r11
            r6 = r2
            r6.b(r7, r8, r9, r10, r11)
            r0.a(r2)
            android.support.constraint.n.b r2 = r18.b()
            double r6 = java.lang.Math.cos(r13)
            double r6 = r6 * r3
            float r9 = (float) r6
            r4 = r2
            r6 = r17
            r7 = r1
            r8 = r19
            r4.b(r5, r6, r7, r8, r9)
            r0.a(r2)
            return
    }

    public int b(java.lang.Object r1) {
            r0 = this;
            android.support.constraint.n.k.d r1 = (android.support.constraint.n.k.d) r1
            android.support.constraint.n.i r0 = r1.f()
            if (r0 == 0) goto Lf
            float r0 = r0.f
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r0 = (int) r0
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public android.support.constraint.n.b b() {
            r5 = this;
            boolean r0 = android.support.constraint.n.d.v
            r1 = 1
            if (r0 == 0) goto L1f
            android.support.constraint.n.c r0 = r5.n
            android.support.constraint.n.f<android.support.constraint.n.b> r0 = r0.f460a
            java.lang.Object r0 = r0.a()
            android.support.constraint.n.b r0 = (android.support.constraint.n.b) r0
            if (r0 != 0) goto L38
            android.support.constraint.n.d$b r0 = new android.support.constraint.n.d$b
            android.support.constraint.n.c r3 = r5.n
            r0.<init>(r5, r3)
            long r3 = android.support.constraint.n.d.z
            long r3 = r3 + r1
            android.support.constraint.n.d.z = r3
            goto L3b
        L1f:
            android.support.constraint.n.c r0 = r5.n
            android.support.constraint.n.f<android.support.constraint.n.b> r0 = r0.f461b
            java.lang.Object r0 = r0.a()
            android.support.constraint.n.b r0 = (android.support.constraint.n.b) r0
            if (r0 != 0) goto L38
            android.support.constraint.n.b r0 = new android.support.constraint.n.b
            android.support.constraint.n.c r5 = r5.n
            r0.<init>(r5)
            long r3 = android.support.constraint.n.d.y
            long r3 = r3 + r1
            android.support.constraint.n.d.y = r3
            goto L3b
        L38:
            r0.c()
        L3b:
            android.support.constraint.n.i.b()
            return r0
    }

    public void b(android.support.constraint.n.i r4, android.support.constraint.n.i r5, int r6, int r7) {
            r3 = this;
            android.support.constraint.n.b r0 = r3.b()
            android.support.constraint.n.i r1 = r3.c()
            r2 = 0
            r1.e = r2
            r0.a(r4, r5, r1, r6)
            r4 = 8
            if (r7 == r4) goto L1f
            android.support.constraint.n.b$a r4 = r0.e
            float r4 = r4.a(r1)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r4 * r5
            int r4 = (int) r4
            r3.a(r0, r4, r7)
        L1f:
            r3.a(r0)
            return
    }

    public void b(android.support.constraint.n.i r3, android.support.constraint.n.i r4, int r5, boolean r6) {
            r2 = this;
            android.support.constraint.n.b r6 = r2.b()
            android.support.constraint.n.i r0 = r2.c()
            r1 = 0
            r0.e = r1
            r6.b(r3, r4, r0, r5)
            r2.a(r6)
            return
    }

    public android.support.constraint.n.i c() {
            r5 = this;
            android.support.constraint.n.e r0 = android.support.constraint.n.d.x
            if (r0 == 0) goto Lb
            long r1 = r0.m
            r3 = 1
            long r1 = r1 + r3
            r0.m = r1
        Lb:
            int r0 = r5.k
            int r0 = r0 + 1
            int r1 = r5.f
            if (r0 < r1) goto L16
            r5.i()
        L16:
            android.support.constraint.n.i$a r0 = android.support.constraint.n.i.a.d
            r1 = 0
            android.support.constraint.n.i r0 = r5.a(r0, r1)
            int r1 = r5.f464b
            int r1 = r1 + 1
            r5.f464b = r1
            int r2 = r5.k
            int r2 = r2 + 1
            r5.k = r2
            r0.f475c = r1
            android.support.constraint.n.c r5 = r5.n
            android.support.constraint.n.i[] r5 = r5.d
            r5[r1] = r0
            return r0
    }

    public void c(android.support.constraint.n.i r4, android.support.constraint.n.i r5, int r6, int r7) {
            r3 = this;
            android.support.constraint.n.b r0 = r3.b()
            android.support.constraint.n.i r1 = r3.c()
            r2 = 0
            r1.e = r2
            r0.b(r4, r5, r1, r6)
            r4 = 8
            if (r7 == r4) goto L1f
            android.support.constraint.n.b$a r4 = r0.e
            float r4 = r4.a(r1)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r4 * r5
            int r4 = (int) r4
            r3.a(r0, r4, r7)
        L1f:
            r3.a(r0)
            return
    }

    public android.support.constraint.n.c d() {
            r0 = this;
            android.support.constraint.n.c r0 = r0.n
            return r0
    }

    public void e() {
            r5 = this;
            android.support.constraint.n.e r0 = android.support.constraint.n.d.x
            r1 = 1
            if (r0 == 0) goto Lb
            long r3 = r0.e
            long r3 = r3 + r1
            r0.e = r3
        Lb:
            android.support.constraint.n.d$a r0 = r5.d
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L17
            r5.g()
            return
        L17:
            boolean r0 = r5.h
            if (r0 != 0) goto L26
            boolean r0 = r5.i
            if (r0 == 0) goto L20
            goto L26
        L20:
            android.support.constraint.n.d$a r0 = r5.d
            r5.a(r0)
            goto L51
        L26:
            android.support.constraint.n.e r0 = android.support.constraint.n.d.x
            if (r0 == 0) goto L2f
            long r3 = r0.q
            long r3 = r3 + r1
            r0.q = r3
        L2f:
            r0 = 0
            r3 = r0
        L31:
            int r4 = r5.l
            if (r3 >= r4) goto L41
            android.support.constraint.n.b[] r4 = r5.g
            r4 = r4[r3]
            boolean r4 = r4.f
            if (r4 != 0) goto L3e
            goto L42
        L3e:
            int r3 = r3 + 1
            goto L31
        L41:
            r0 = 1
        L42:
            if (r0 != 0) goto L45
            goto L20
        L45:
            android.support.constraint.n.e r0 = android.support.constraint.n.d.x
            if (r0 == 0) goto L4e
            long r3 = r0.p
            long r3 = r3 + r1
            r0.p = r3
        L4e:
            r5.g()
        L51:
            return
    }

    public void f() {
            r5 = this;
            r0 = 0
            r1 = r0
        L2:
            android.support.constraint.n.c r2 = r5.n
            android.support.constraint.n.i[] r3 = r2.d
            int r4 = r3.length
            if (r1 >= r4) goto L13
            r2 = r3[r1]
            if (r2 == 0) goto L10
            r2.a()
        L10:
            int r1 = r1 + 1
            goto L2
        L13:
            android.support.constraint.n.f<android.support.constraint.n.i> r1 = r2.f462c
            android.support.constraint.n.i[] r2 = r5.o
            int r3 = r5.p
            r1.a(r2, r3)
            r5.p = r0
            android.support.constraint.n.c r1 = r5.n
            android.support.constraint.n.i[] r1 = r1.d
            r2 = 0
            java.util.Arrays.fill(r1, r2)
            java.util.HashMap<java.lang.String, android.support.constraint.n.i> r1 = r5.f465c
            if (r1 == 0) goto L2d
            r1.clear()
        L2d:
            r5.f464b = r0
            android.support.constraint.n.d$a r1 = r5.d
            r1.clear()
            r1 = 1
            r5.k = r1
            r1 = r0
        L38:
            int r2 = r5.l
            if (r1 >= r2) goto L49
            android.support.constraint.n.b[] r2 = r5.g
            r3 = r2[r1]
            if (r3 == 0) goto L46
            r2 = r2[r1]
            r2.f459c = r0
        L46:
            int r1 = r1 + 1
            goto L38
        L49:
            r5.j()
            r5.l = r0
            boolean r0 = android.support.constraint.n.d.v
            if (r0 == 0) goto L5a
            android.support.constraint.n.d$b r0 = new android.support.constraint.n.d$b
            android.support.constraint.n.c r1 = r5.n
            r0.<init>(r5, r1)
            goto L61
        L5a:
            android.support.constraint.n.b r0 = new android.support.constraint.n.b
            android.support.constraint.n.c r1 = r5.n
            r0.<init>(r1)
        L61:
            r5.q = r0
            return
    }
}
