package android.support.constraint.n.k.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class p implements android.support.constraint.n.k.m.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    android.support.constraint.n.k.e f523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    android.support.constraint.n.k.m.m f524c;
    protected android.support.constraint.n.k.e.b d;
    android.support.constraint.n.k.m.g e;
    public int f;
    boolean g;
    public android.support.constraint.n.k.m.f h;
    public android.support.constraint.n.k.m.f i;
    protected android.support.constraint.n.k.m.p.b j;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f525a = null;

        static {
                android.support.constraint.n.k.d$b[] r0 = android.support.constraint.n.k.d.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                android.support.constraint.n.k.m.p.a.f525a = r0
                android.support.constraint.n.k.d$b r1 = android.support.constraint.n.k.d.b.f489c     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = android.support.constraint.n.k.m.p.a.f525a     // Catch: java.lang.NoSuchFieldError -> L1d
                android.support.constraint.n.k.d$b r1 = android.support.constraint.n.k.d.b.e     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = android.support.constraint.n.k.m.p.a.f525a     // Catch: java.lang.NoSuchFieldError -> L28
                android.support.constraint.n.k.d$b r1 = android.support.constraint.n.k.d.b.d     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = android.support.constraint.n.k.m.p.a.f525a     // Catch: java.lang.NoSuchFieldError -> L33
                android.support.constraint.n.k.d$b r1 = android.support.constraint.n.k.d.b.g     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = android.support.constraint.n.k.m.p.a.f525a     // Catch: java.lang.NoSuchFieldError -> L3e
                android.support.constraint.n.k.d$b r1 = android.support.constraint.n.k.d.b.f     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                return
        }
    }

    static final enum b extends java.lang.Enum<android.support.constraint.n.k.m.p.b> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final android.support.constraint.n.k.m.p.b f526b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final android.support.constraint.n.k.m.p.b f527c = null;
        public static final android.support.constraint.n.k.m.p.b d = null;
        public static final android.support.constraint.n.k.m.p.b e = null;
        private static final /* synthetic */ android.support.constraint.n.k.m.p.b[] f = null;

        static {
                android.support.constraint.n.k.m.p$b r0 = new android.support.constraint.n.k.m.p$b
                r1 = 0
                java.lang.String r2 = "NONE"
                r0.<init>(r2, r1)
                android.support.constraint.n.k.m.p.b.f526b = r0
                android.support.constraint.n.k.m.p$b r0 = new android.support.constraint.n.k.m.p$b
                r2 = 1
                java.lang.String r3 = "START"
                r0.<init>(r3, r2)
                android.support.constraint.n.k.m.p.b.f527c = r0
                android.support.constraint.n.k.m.p$b r0 = new android.support.constraint.n.k.m.p$b
                r3 = 2
                java.lang.String r4 = "END"
                r0.<init>(r4, r3)
                android.support.constraint.n.k.m.p.b.d = r0
                android.support.constraint.n.k.m.p$b r0 = new android.support.constraint.n.k.m.p$b
                r4 = 3
                java.lang.String r5 = "CENTER"
                r0.<init>(r5, r4)
                android.support.constraint.n.k.m.p.b.e = r0
                r5 = 4
                android.support.constraint.n.k.m.p$b[] r5 = new android.support.constraint.n.k.m.p.b[r5]
                android.support.constraint.n.k.m.p$b r6 = android.support.constraint.n.k.m.p.b.f526b
                r5[r1] = r6
                android.support.constraint.n.k.m.p$b r1 = android.support.constraint.n.k.m.p.b.f527c
                r5[r2] = r1
                android.support.constraint.n.k.m.p$b r1 = android.support.constraint.n.k.m.p.b.d
                r5[r3] = r1
                r5[r4] = r0
                android.support.constraint.n.k.m.p.b.f = r5
                return
        }

        private b(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static android.support.constraint.n.k.m.p.b valueOf(java.lang.String r1) {
                java.lang.Class<android.support.constraint.n.k.m.p$b> r0 = android.support.constraint.n.k.m.p.b.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                android.support.constraint.n.k.m.p$b r1 = (android.support.constraint.n.k.m.p.b) r1
                return r1
        }

        public static android.support.constraint.n.k.m.p.b[] values() {
                android.support.constraint.n.k.m.p$b[] r0 = android.support.constraint.n.k.m.p.b.f
                java.lang.Object r0 = r0.clone()
                android.support.constraint.n.k.m.p$b[] r0 = (android.support.constraint.n.k.m.p.b[]) r0
                return r0
        }
    }

    public p(android.support.constraint.n.k.e r2) {
            r1 = this;
            r1.<init>()
            android.support.constraint.n.k.m.g r0 = new android.support.constraint.n.k.m.g
            r0.<init>(r1)
            r1.e = r0
            r0 = 0
            r1.f = r0
            r1.g = r0
            android.support.constraint.n.k.m.f r0 = new android.support.constraint.n.k.m.f
            r0.<init>(r1)
            r1.h = r0
            android.support.constraint.n.k.m.f r0 = new android.support.constraint.n.k.m.f
            r0.<init>(r1)
            r1.i = r0
            android.support.constraint.n.k.m.p$b r0 = android.support.constraint.n.k.m.p.b.f526b
            r1.j = r0
            r1.f523b = r2
            return
    }

    private void b(int r7, int r8) {
            r6 = this;
            int r0 = r6.f522a
            if (r0 == 0) goto L8f
            r1 = 1
            if (r0 == r1) goto L7d
            r8 = 2
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r0 == r8) goto L56
            r8 = 3
            if (r0 == r8) goto L11
            goto L98
        L11:
            android.support.constraint.n.k.e r0 = r6.f523b
            android.support.constraint.n.k.m.l r3 = r0.d
            android.support.constraint.n.k.e$b r4 = r3.d
            android.support.constraint.n.k.e$b r5 = android.support.constraint.n.k.e.b.d
            if (r4 != r5) goto L2b
            int r3 = r3.f522a
            if (r3 != r8) goto L2b
            android.support.constraint.n.k.m.n r0 = r0.e
            android.support.constraint.n.k.e$b r3 = r0.d
            if (r3 != r5) goto L2b
            int r0 = r0.f522a
            if (r0 != r8) goto L2b
            goto L98
        L2b:
            android.support.constraint.n.k.e r8 = r6.f523b
            if (r7 != 0) goto L32
            android.support.constraint.n.k.m.n r8 = r8.e
            goto L34
        L32:
            android.support.constraint.n.k.m.l r8 = r8.d
        L34:
            android.support.constraint.n.k.m.g r0 = r8.e
            boolean r0 = r0.j
            if (r0 == 0) goto L98
            android.support.constraint.n.k.e r0 = r6.f523b
            float r0 = r0.i()
            if (r7 != r1) goto L4b
            android.support.constraint.n.k.m.g r7 = r8.e
            int r7 = r7.g
            float r7 = (float) r7
            float r7 = r7 / r0
            float r7 = r7 + r2
            int r7 = (int) r7
            goto L53
        L4b:
            android.support.constraint.n.k.m.g r7 = r8.e
            int r7 = r7.g
            float r7 = (float) r7
            float r0 = r0 * r7
            float r0 = r0 + r2
            int r7 = (int) r0
        L53:
            android.support.constraint.n.k.m.g r6 = r6.e
            goto L8b
        L56:
            android.support.constraint.n.k.e r8 = r6.f523b
            android.support.constraint.n.k.e r8 = r8.v()
            if (r8 == 0) goto L98
            if (r7 != 0) goto L63
            android.support.constraint.n.k.m.l r8 = r8.d
            goto L65
        L63:
            android.support.constraint.n.k.m.n r8 = r8.e
        L65:
            android.support.constraint.n.k.m.g r0 = r8.e
            boolean r0 = r0.j
            if (r0 == 0) goto L98
            android.support.constraint.n.k.e r0 = r6.f523b
            if (r7 != 0) goto L72
            float r0 = r0.s
            goto L74
        L72:
            float r0 = r0.v
        L74:
            android.support.constraint.n.k.m.g r8 = r8.e
            int r8 = r8.g
            float r8 = (float) r8
            float r8 = r8 * r0
            float r8 = r8 + r2
            int r8 = (int) r8
            goto L8f
        L7d:
            android.support.constraint.n.k.m.g r0 = r6.e
            int r0 = r0.m
            int r7 = r6.a(r0, r7)
            android.support.constraint.n.k.m.g r6 = r6.e
            int r7 = java.lang.Math.min(r7, r8)
        L8b:
            r6.a(r7)
            goto L98
        L8f:
            android.support.constraint.n.k.m.g r0 = r6.e
            int r6 = r6.a(r8, r7)
            r0.a(r6)
        L98:
            return
    }

    protected final int a(int r1, int r2) {
            r0 = this;
            android.support.constraint.n.k.e r0 = r0.f523b
            if (r2 != 0) goto L15
            int r2 = r0.r
            int r0 = r0.q
            int r0 = java.lang.Math.max(r0, r1)
            if (r2 <= 0) goto L12
            int r0 = java.lang.Math.min(r2, r1)
        L12:
            if (r0 == r1) goto L26
            goto L25
        L15:
            int r2 = r0.u
            int r0 = r0.t
            int r0 = java.lang.Math.max(r0, r1)
            if (r2 <= 0) goto L23
            int r0 = java.lang.Math.min(r2, r1)
        L23:
            if (r0 == r1) goto L26
        L25:
            r1 = r0
        L26:
            return r1
    }

    protected final android.support.constraint.n.k.m.f a(android.support.constraint.n.k.d r3) {
            r2 = this;
            android.support.constraint.n.k.d r2 = r3.f
            r3 = 0
            if (r2 != 0) goto L6
            return r3
        L6:
            android.support.constraint.n.k.e r0 = r2.d
            android.support.constraint.n.k.d$b r2 = r2.e
            int[] r1 = android.support.constraint.n.k.m.p.a.f525a
            int r2 = r2.ordinal()
            r2 = r1[r2]
            r1 = 1
            if (r2 == r1) goto L32
            r1 = 2
            if (r2 == r1) goto L2d
            r1 = 3
            if (r2 == r1) goto L2a
            r1 = 4
            if (r2 == r1) goto L25
            r1 = 5
            if (r2 == r1) goto L22
            goto L36
        L22:
            android.support.constraint.n.k.m.n r2 = r0.e
            goto L2f
        L25:
            android.support.constraint.n.k.m.n r2 = r0.e
            android.support.constraint.n.k.m.f r3 = r2.k
            goto L36
        L2a:
            android.support.constraint.n.k.m.n r2 = r0.e
            goto L34
        L2d:
            android.support.constraint.n.k.m.l r2 = r0.d
        L2f:
            android.support.constraint.n.k.m.f r3 = r2.i
            goto L36
        L32:
            android.support.constraint.n.k.m.l r2 = r0.d
        L34:
            android.support.constraint.n.k.m.f r3 = r2.h
        L36:
            return r3
    }

    protected final android.support.constraint.n.k.m.f a(android.support.constraint.n.k.d r2, int r3) {
            r1 = this;
            android.support.constraint.n.k.d r1 = r2.f
            r0 = 0
            if (r1 != 0) goto L6
            return r0
        L6:
            android.support.constraint.n.k.e r1 = r1.d
            if (r3 != 0) goto Ld
            android.support.constraint.n.k.m.l r1 = r1.d
            goto Lf
        Ld:
            android.support.constraint.n.k.m.n r1 = r1.e
        Lf:
            android.support.constraint.n.k.d r2 = r2.f
            android.support.constraint.n.k.d$b r2 = r2.e
            int[] r3 = android.support.constraint.n.k.m.p.a.f525a
            int r2 = r2.ordinal()
            r2 = r3[r2]
            r3 = 1
            if (r2 == r3) goto L2b
            r3 = 2
            if (r2 == r3) goto L28
            r3 = 3
            if (r2 == r3) goto L2b
            r3 = 5
            if (r2 == r3) goto L28
            goto L2d
        L28:
            android.support.constraint.n.k.m.f r0 = r1.i
            goto L2d
        L2b:
            android.support.constraint.n.k.m.f r0 = r1.h
        L2d:
            return r0
    }

    abstract void a();

    @Override // android.support.constraint.n.k.m.d
    public void a(android.support.constraint.n.k.m.d r1) {
            r0 = this;
            return
    }

    protected void a(android.support.constraint.n.k.m.d r5, android.support.constraint.n.k.d r6, android.support.constraint.n.k.d r7, int r8) {
            r4 = this;
            android.support.constraint.n.k.m.f r5 = r4.a(r6)
            android.support.constraint.n.k.m.f r0 = r4.a(r7)
            boolean r1 = r5.j
            if (r1 == 0) goto L7b
            boolean r1 = r0.j
            if (r1 != 0) goto L11
            goto L7b
        L11:
            int r1 = r5.g
            int r6 = r6.c()
            int r1 = r1 + r6
            int r6 = r0.g
            int r7 = r7.c()
            int r6 = r6 - r7
            int r7 = r6 - r1
            android.support.constraint.n.k.m.g r2 = r4.e
            boolean r2 = r2.j
            if (r2 != 0) goto L30
            android.support.constraint.n.k.e$b r2 = r4.d
            android.support.constraint.n.k.e$b r3 = android.support.constraint.n.k.e.b.d
            if (r2 != r3) goto L30
            r4.b(r8, r7)
        L30:
            android.support.constraint.n.k.m.g r2 = r4.e
            boolean r3 = r2.j
            if (r3 != 0) goto L37
            return
        L37:
            int r2 = r2.g
            if (r2 != r7) goto L46
            android.support.constraint.n.k.m.f r5 = r4.h
            r5.a(r1)
            android.support.constraint.n.k.m.f r4 = r4.i
            r4.a(r6)
            return
        L46:
            android.support.constraint.n.k.e r7 = r4.f523b
            if (r8 != 0) goto L4f
            float r7 = r7.l()
            goto L53
        L4f:
            float r7 = r7.x()
        L53:
            r8 = 1056964608(0x3f000000, float:0.5)
            if (r5 != r0) goto L5c
            int r1 = r5.g
            int r6 = r0.g
            r7 = r8
        L5c:
            int r6 = r6 - r1
            android.support.constraint.n.k.m.g r5 = r4.e
            int r5 = r5.g
            int r6 = r6 - r5
            android.support.constraint.n.k.m.f r5 = r4.h
            float r0 = (float) r1
            float r0 = r0 + r8
            float r6 = (float) r6
            float r6 = r6 * r7
            float r0 = r0 + r6
            int r6 = (int) r0
            r5.a(r6)
            android.support.constraint.n.k.m.f r5 = r4.i
            android.support.constraint.n.k.m.f r6 = r4.h
            int r6 = r6.g
            android.support.constraint.n.k.m.g r4 = r4.e
            int r4 = r4.g
            int r6 = r6 + r4
            r5.a(r6)
        L7b:
            return
    }

    protected final void a(android.support.constraint.n.k.m.f r1, android.support.constraint.n.k.m.f r2, int r3) {
            r0 = this;
            java.util.List<android.support.constraint.n.k.m.f> r0 = r1.l
            r0.add(r2)
            r1.f = r3
            java.util.List<android.support.constraint.n.k.m.d> r0 = r2.k
            r0.add(r1)
            return
    }

    protected final void a(android.support.constraint.n.k.m.f r2, android.support.constraint.n.k.m.f r3, int r4, android.support.constraint.n.k.m.g r5) {
            r1 = this;
            java.util.List<android.support.constraint.n.k.m.f> r0 = r2.l
            r0.add(r3)
            java.util.List<android.support.constraint.n.k.m.f> r0 = r2.l
            android.support.constraint.n.k.m.g r1 = r1.e
            r0.add(r1)
            r2.h = r4
            r2.i = r5
            java.util.List<android.support.constraint.n.k.m.d> r1 = r3.k
            r1.add(r2)
            java.util.List<android.support.constraint.n.k.m.d> r1 = r5.k
            r1.add(r2)
            return
    }

    abstract void b();

    protected void b(android.support.constraint.n.k.m.d r1) {
            r0 = this;
            return
    }

    abstract void c();

    protected void c(android.support.constraint.n.k.m.d r1) {
            r0 = this;
            return
    }

    public long d() {
            r2 = this;
            android.support.constraint.n.k.m.g r2 = r2.e
            boolean r0 = r2.j
            if (r0 == 0) goto La
            int r2 = r2.g
            long r0 = (long) r2
            return r0
        La:
            r0 = 0
            return r0
    }

    public boolean e() {
            r0 = this;
            boolean r0 = r0.g
            return r0
    }

    abstract boolean f();
}
