package android.support.constraint.n;

/* JADX INFO: loaded from: classes.dex */
public class i {
    private static int q = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.String f474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f475c;
    int d;
    public int e;
    public float f;
    public boolean g;
    float[] h;
    float[] i;
    android.support.constraint.n.i.a j;
    android.support.constraint.n.b[] k;
    int l;
    public int m;
    boolean n;
    int o;
    float p;

    public static final enum a extends java.lang.Enum<android.support.constraint.n.i.a> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final android.support.constraint.n.i.a f476b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final android.support.constraint.n.i.a f477c = null;
        public static final android.support.constraint.n.i.a d = null;
        public static final android.support.constraint.n.i.a e = null;
        public static final android.support.constraint.n.i.a f = null;
        private static final /* synthetic */ android.support.constraint.n.i.a[] g = null;

        static {
                android.support.constraint.n.i$a r0 = new android.support.constraint.n.i$a
                r1 = 0
                java.lang.String r2 = "UNRESTRICTED"
                r0.<init>(r2, r1)
                android.support.constraint.n.i.a.f476b = r0
                android.support.constraint.n.i$a r0 = new android.support.constraint.n.i$a
                r2 = 1
                java.lang.String r3 = "CONSTANT"
                r0.<init>(r3, r2)
                android.support.constraint.n.i.a.f477c = r0
                android.support.constraint.n.i$a r0 = new android.support.constraint.n.i$a
                r3 = 2
                java.lang.String r4 = "SLACK"
                r0.<init>(r4, r3)
                android.support.constraint.n.i.a.d = r0
                android.support.constraint.n.i$a r0 = new android.support.constraint.n.i$a
                r4 = 3
                java.lang.String r5 = "ERROR"
                r0.<init>(r5, r4)
                android.support.constraint.n.i.a.e = r0
                android.support.constraint.n.i$a r0 = new android.support.constraint.n.i$a
                r5 = 4
                java.lang.String r6 = "UNKNOWN"
                r0.<init>(r6, r5)
                android.support.constraint.n.i.a.f = r0
                r6 = 5
                android.support.constraint.n.i$a[] r6 = new android.support.constraint.n.i.a[r6]
                android.support.constraint.n.i$a r7 = android.support.constraint.n.i.a.f476b
                r6[r1] = r7
                android.support.constraint.n.i$a r1 = android.support.constraint.n.i.a.f477c
                r6[r2] = r1
                android.support.constraint.n.i$a r1 = android.support.constraint.n.i.a.d
                r6[r3] = r1
                android.support.constraint.n.i$a r1 = android.support.constraint.n.i.a.e
                r6[r4] = r1
                r6[r5] = r0
                android.support.constraint.n.i.a.g = r6
                return
        }

        private a(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static android.support.constraint.n.i.a valueOf(java.lang.String r1) {
                java.lang.Class<android.support.constraint.n.i$a> r0 = android.support.constraint.n.i.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                android.support.constraint.n.i$a r1 = (android.support.constraint.n.i.a) r1
                return r1
        }

        public static android.support.constraint.n.i.a[] values() {
                android.support.constraint.n.i$a[] r0 = android.support.constraint.n.i.a.g
                java.lang.Object r0 = r0.clone()
                android.support.constraint.n.i$a[] r0 = (android.support.constraint.n.i.a[]) r0
                return r0
        }
    }

    static {
            return
    }

    public i(android.support.constraint.n.i.a r4, java.lang.String r5) {
            r3 = this;
            r3.<init>()
            r5 = -1
            r3.f475c = r5
            r3.d = r5
            r0 = 0
            r3.e = r0
            r3.g = r0
            r1 = 9
            float[] r2 = new float[r1]
            r3.h = r2
            float[] r1 = new float[r1]
            r3.i = r1
            r1 = 16
            android.support.constraint.n.b[] r1 = new android.support.constraint.n.b[r1]
            r3.k = r1
            r3.l = r0
            r3.m = r0
            r3.n = r0
            r3.o = r5
            r5 = 0
            r3.p = r5
            r3.j = r4
            return
    }

    static void b() {
            int r0 = android.support.constraint.n.i.q
            int r0 = r0 + 1
            android.support.constraint.n.i.q = r0
            return
    }

    public void a() {
            r6 = this;
            r0 = 0
            r6.f474b = r0
            android.support.constraint.n.i$a r1 = android.support.constraint.n.i.a.f
            r6.j = r1
            r1 = 0
            r6.e = r1
            r2 = -1
            r6.f475c = r2
            r6.d = r2
            r3 = 0
            r6.f = r3
            r6.g = r1
            r6.n = r1
            r6.o = r2
            r6.p = r3
            int r2 = r6.l
            r4 = r1
        L1d:
            if (r4 >= r2) goto L26
            android.support.constraint.n.b[] r5 = r6.k
            r5[r4] = r0
            int r4 = r4 + 1
            goto L1d
        L26:
            r6.l = r1
            r6.m = r1
            r6.f473a = r1
            float[] r6 = r6.i
            java.util.Arrays.fill(r6, r3)
            return
    }

    public final void a(android.support.constraint.n.b r4) {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.l
            if (r0 >= r1) goto Lf
            android.support.constraint.n.b[] r1 = r3.k
            r1 = r1[r0]
            if (r1 != r4) goto Lc
            return
        Lc:
            int r0 = r0 + 1
            goto L1
        Lf:
            android.support.constraint.n.b[] r0 = r3.k
            int r2 = r0.length
            if (r1 < r2) goto L1f
            int r1 = r0.length
            int r1 = r1 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            android.support.constraint.n.b[] r0 = (android.support.constraint.n.b[]) r0
            r3.k = r0
        L1f:
            android.support.constraint.n.b[] r0 = r3.k
            int r1 = r3.l
            r0[r1] = r4
            int r1 = r1 + 1
            r3.l = r1
            return
    }

    public void a(android.support.constraint.n.d r4, float r5) {
            r3 = this;
            r3.f = r5
            r5 = 1
            r3.g = r5
            r5 = 0
            r3.n = r5
            r0 = -1
            r3.o = r0
            r1 = 0
            r3.p = r1
            int r1 = r3.l
            r3.d = r0
            r0 = r5
        L13:
            if (r0 >= r1) goto L1f
            android.support.constraint.n.b[] r2 = r3.k
            r2 = r2[r0]
            r2.a(r4, r3, r5)
            int r0 = r0 + 1
            goto L13
        L1f:
            r3.l = r5
            return
    }

    public final void a(android.support.constraint.n.d r5, android.support.constraint.n.b r6) {
            r4 = this;
            int r0 = r4.l
            r1 = 0
            r2 = r1
        L4:
            if (r2 >= r0) goto L10
            android.support.constraint.n.b[] r3 = r4.k
            r3 = r3[r2]
            r3.a(r5, r6, r1)
            int r2 = r2 + 1
            goto L4
        L10:
            r4.l = r1
            return
    }

    public void a(android.support.constraint.n.i.a r1, java.lang.String r2) {
            r0 = this;
            r0.j = r1
            return
    }

    public final void b(android.support.constraint.n.b r5) {
            r4 = this;
            int r0 = r4.l
            r1 = 0
        L3:
            if (r1 >= r0) goto L23
            android.support.constraint.n.b[] r2 = r4.k
            r2 = r2[r1]
            if (r2 != r5) goto L20
        Lb:
            int r5 = r0 + (-1)
            if (r1 >= r5) goto L19
            android.support.constraint.n.b[] r5 = r4.k
            int r2 = r1 + 1
            r3 = r5[r2]
            r5[r1] = r3
            r1 = r2
            goto Lb
        L19:
            int r5 = r4.l
            int r5 = r5 + (-1)
            r4.l = r5
            return
        L20:
            int r1 = r1 + 1
            goto L3
        L23:
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = r2.f474b
            java.lang.String r1 = ""
            if (r0 == 0) goto L14
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r2 = r2.f474b
            r0.append(r2)
            goto L21
        L14:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            int r2 = r2.f475c
            r0.append(r2)
        L21:
            java.lang.String r2 = r0.toString()
            return r2
    }
}
