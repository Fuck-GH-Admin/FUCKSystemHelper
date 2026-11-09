package com.baidu.location;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public int A;
    public int B;
    public boolean C;
    public com.baidu.location.i.a D;
    public java.lang.String E;
    public int F;
    public java.lang.String G;
    public java.lang.String H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.String f1370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.String f1371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1372c;
    public int d;
    public int e;
    public java.lang.String f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public java.lang.String k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public com.baidu.location.i.b v;
    public int w;
    public float x;
    public int y;
    public int z;

    public static final enum a extends java.lang.Enum<com.baidu.location.i.a> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final com.baidu.location.i.a f1373b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final com.baidu.location.i.a f1374c = null;
        private static final /* synthetic */ com.baidu.location.i.a[] d = null;

        static {
                com.baidu.location.i$a r0 = new com.baidu.location.i$a
                r1 = 0
                java.lang.String r2 = "SPEED_IN_FIRST_LOC"
                r0.<init>(r2, r1)
                com.baidu.location.i.a.f1373b = r0
                com.baidu.location.i$a r2 = new com.baidu.location.i$a
                r3 = 1
                java.lang.String r4 = "ACCURACY_IN_FIRST_LOC"
                r2.<init>(r4, r3)
                com.baidu.location.i.a.f1374c = r2
                r4 = 2
                com.baidu.location.i$a[] r4 = new com.baidu.location.i.a[r4]
                r4[r1] = r0
                r4[r3] = r2
                com.baidu.location.i.a.d = r4
                return
        }

        private a(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.baidu.location.i.a valueOf(java.lang.String r1) {
                java.lang.Class<com.baidu.location.i$a> r0 = com.baidu.location.i.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.baidu.location.i$a r1 = (com.baidu.location.i.a) r1
                return r1
        }

        public static com.baidu.location.i.a[] values() {
                com.baidu.location.i$a[] r0 = com.baidu.location.i.a.d
                java.lang.Object r0 = r0.clone()
                com.baidu.location.i$a[] r0 = (com.baidu.location.i.a[]) r0
                return r0
        }
    }

    public static final enum b extends java.lang.Enum<com.baidu.location.i.b> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final com.baidu.location.i.b f1375b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final com.baidu.location.i.b f1376c = null;
        public static final com.baidu.location.i.b d = null;
        public static final com.baidu.location.i.b e = null;
        private static final /* synthetic */ com.baidu.location.i.b[] f = null;

        static {
                com.baidu.location.i$b r0 = new com.baidu.location.i$b
                r1 = 0
                java.lang.String r2 = "Hight_Accuracy"
                r0.<init>(r2, r1)
                com.baidu.location.i.b.f1375b = r0
                com.baidu.location.i$b r2 = new com.baidu.location.i$b
                r3 = 1
                java.lang.String r4 = "Battery_Saving"
                r2.<init>(r4, r3)
                com.baidu.location.i.b.f1376c = r2
                com.baidu.location.i$b r4 = new com.baidu.location.i$b
                r5 = 2
                java.lang.String r6 = "Device_Sensors"
                r4.<init>(r6, r5)
                com.baidu.location.i.b.d = r4
                com.baidu.location.i$b r6 = new com.baidu.location.i$b
                r7 = 3
                java.lang.String r8 = "Fuzzy_Locating"
                r6.<init>(r8, r7)
                com.baidu.location.i.b.e = r6
                r8 = 4
                com.baidu.location.i$b[] r8 = new com.baidu.location.i.b[r8]
                r8[r1] = r0
                r8[r3] = r2
                r8[r5] = r4
                r8[r7] = r6
                com.baidu.location.i.b.f = r8
                return
        }

        private b(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.baidu.location.i.b valueOf(java.lang.String r1) {
                java.lang.Class<com.baidu.location.i$b> r0 = com.baidu.location.i.b.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.baidu.location.i$b r1 = (com.baidu.location.i.b) r1
                return r1
        }

        public static com.baidu.location.i.b[] values() {
                com.baidu.location.i$b[] r0 = com.baidu.location.i.b.f
                java.lang.Object r0 = r0.clone()
                com.baidu.location.i$b[] r0 = (com.baidu.location.i.b[]) r0
                return r0
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1377a = null;

        static {
                com.baidu.location.i$b[] r0 = com.baidu.location.i.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.baidu.location.i.c.f1377a = r0
                com.baidu.location.i$b r1 = com.baidu.location.i.b.f1375b     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.baidu.location.i.c.f1377a     // Catch: java.lang.NoSuchFieldError -> L1d
                com.baidu.location.i$b r1 = com.baidu.location.i.b.f1376c     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.baidu.location.i.c.f1377a     // Catch: java.lang.NoSuchFieldError -> L28
                com.baidu.location.i$b r1 = com.baidu.location.i.b.d     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.baidu.location.i.c.f1377a     // Catch: java.lang.NoSuchFieldError -> L33
                com.baidu.location.i$b r1 = com.baidu.location.i.b.e     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    public i() {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = "gcj02"
            r3.f1370a = r0
            java.lang.String r0 = "noaddr"
            r3.f1371b = r0
            r0 = 0
            r3.f1372c = r0
            r3.d = r0
            r1 = 12000(0x2ee0, float:1.6816E-41)
            r3.e = r1
            java.lang.String r1 = "SDK6.0"
            r3.f = r1
            r1 = 1
            r3.g = r1
            r3.h = r0
            r3.i = r1
            r3.j = r0
            java.lang.String r2 = "com.baidu.location.service_v2.9"
            r3.k = r2
            r3.l = r1
            r3.m = r1
            r3.n = r0
            r3.o = r0
            r3.p = r0
            r3.q = r0
            r3.r = r0
            r3.s = r0
            r3.t = r1
            r3.u = r0
            r3.w = r0
            r2 = 1056964608(0x3f000000, float:0.5)
            r3.x = r2
            r3.y = r0
            r3.z = r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3.A = r2
            r3.B = r1
            r3.C = r0
            com.baidu.location.i$a r0 = com.baidu.location.i.a.f1373b
            r3.D = r0
            r0 = 0
            r3.E = r0
            r1 = -1
            r3.F = r1
            r3.G = r0
            r3.H = r0
            return
    }

    public i(com.baidu.location.i r4) {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = "gcj02"
            r3.f1370a = r0
            java.lang.String r0 = "noaddr"
            r3.f1371b = r0
            r0 = 0
            r3.f1372c = r0
            r3.d = r0
            r1 = 12000(0x2ee0, float:1.6816E-41)
            r3.e = r1
            java.lang.String r1 = "SDK6.0"
            r3.f = r1
            r1 = 1
            r3.g = r1
            r3.h = r0
            r3.i = r1
            r3.j = r0
            java.lang.String r2 = "com.baidu.location.service_v2.9"
            r3.k = r2
            r3.l = r1
            r3.m = r1
            r3.n = r0
            r3.o = r0
            r3.p = r0
            r3.q = r0
            r3.r = r0
            r3.s = r0
            r3.t = r1
            r3.u = r0
            r3.w = r0
            r2 = 1056964608(0x3f000000, float:0.5)
            r3.x = r2
            r3.y = r0
            r3.z = r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3.A = r2
            r3.B = r1
            r3.C = r0
            com.baidu.location.i$a r0 = com.baidu.location.i.a.f1373b
            r3.D = r0
            r0 = 0
            r3.E = r0
            r1 = -1
            r3.F = r1
            r3.G = r0
            r3.H = r0
            java.lang.String r0 = r4.f1370a
            r3.f1370a = r0
            java.lang.String r0 = r4.f1371b
            r3.f1371b = r0
            boolean r0 = r4.f1372c
            r3.f1372c = r0
            int r0 = r4.d
            r3.d = r0
            int r0 = r4.e
            r3.e = r0
            java.lang.String r0 = r4.f
            r3.f = r0
            int r0 = r4.g
            r3.g = r0
            boolean r0 = r4.h
            r3.h = r0
            java.lang.String r0 = r4.k
            r3.k = r0
            boolean r0 = r4.i
            r3.i = r0
            boolean r0 = r4.l
            r3.l = r0
            boolean r0 = r4.m
            r3.m = r0
            boolean r0 = r4.j
            r3.j = r0
            com.baidu.location.i$b r0 = r4.v
            r3.v = r0
            boolean r0 = r4.o
            r3.o = r0
            boolean r0 = r4.p
            r3.p = r0
            boolean r0 = r4.q
            r3.q = r0
            boolean r0 = r4.r
            r3.r = r0
            boolean r0 = r4.n
            r3.n = r0
            boolean r0 = r4.s
            r3.s = r0
            int r0 = r4.w
            r3.w = r0
            float r0 = r4.x
            r3.x = r0
            int r0 = r4.y
            r3.y = r0
            int r0 = r4.z
            r3.z = r0
            int r0 = r4.A
            r3.A = r0
            boolean r0 = r4.t
            r3.t = r0
            boolean r0 = r4.u
            r3.u = r0
            int r0 = r4.B
            r3.B = r0
            boolean r0 = r4.C
            r3.C = r0
            com.baidu.location.i$a r0 = r4.D
            r3.D = r0
            java.lang.String r0 = r4.E
            r3.E = r0
            int r0 = r4.F
            r3.F = r0
            java.lang.String r0 = r4.G
            r3.G = r0
            java.lang.String r4 = r4.H
            r3.H = r4
            return
    }

    public float a() {
            r0 = this;
            float r0 = r0.x
            return r0
    }

    public void a(int r1) {
            r0 = this;
            if (r1 < 0) goto L4
            r0.d = r1
        L4:
            return
    }

    public void a(com.baidu.location.i.b r6) {
            r5 = this;
            int[] r0 = com.baidu.location.i.c.f1377a
            int r1 = r6.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L3b
            r2 = 0
            r3 = 3
            r4 = 2
            if (r0 == r4) goto L36
            if (r0 == r3) goto L31
            r1 = 4
            if (r0 != r1) goto L1a
            r5.g = r1
            r5.f1372c = r2
            goto L3f
        L1a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Illegal this mode : "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
        L31:
            r5.g = r4
            r5.f1372c = r1
            goto L3f
        L36:
            r5.f1372c = r2
            r5.g = r3
            goto L3f
        L3b:
            r5.f1372c = r1
            r5.g = r1
        L3f:
            r5.v = r6
            return
    }

    public void a(java.lang.String r2) {
            r1 = this;
            java.lang.String r2 = r2.toLowerCase()
            java.lang.String r0 = "gcj02"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L1c
            java.lang.String r0 = "bd09"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L1c
            java.lang.String r0 = "bd09ll"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L1e
        L1c:
            r1.f1370a = r2
        L1e:
            return
    }

    public void a(boolean r1) {
            r0 = this;
            r0.s = r1
            return
    }

    public boolean a(com.baidu.location.i r3) {
            r2 = this;
            java.lang.String r0 = r2.f1370a
            java.lang.String r1 = r3.f1370a
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lbe
            java.lang.String r0 = r2.f1371b
            java.lang.String r1 = r3.f1371b
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lbe
            boolean r0 = r2.f1372c
            boolean r1 = r3.f1372c
            if (r0 != r1) goto Lbe
            int r0 = r2.d
            int r1 = r3.d
            if (r0 != r1) goto Lbe
            int r0 = r2.e
            int r1 = r3.e
            if (r0 != r1) goto Lbe
            java.lang.String r0 = r2.f
            java.lang.String r1 = r3.f
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lbe
            boolean r0 = r2.h
            boolean r1 = r3.h
            if (r0 != r1) goto Lbe
            int r0 = r2.g
            int r1 = r3.g
            if (r0 != r1) goto Lbe
            boolean r0 = r2.i
            boolean r1 = r3.i
            if (r0 != r1) goto Lbe
            boolean r0 = r2.l
            boolean r1 = r3.l
            if (r0 != r1) goto Lbe
            boolean r0 = r2.t
            boolean r1 = r3.t
            if (r0 != r1) goto Lbe
            boolean r0 = r2.m
            boolean r1 = r3.m
            if (r0 != r1) goto Lbe
            boolean r0 = r2.o
            boolean r1 = r3.o
            if (r0 != r1) goto Lbe
            boolean r0 = r2.p
            boolean r1 = r3.p
            if (r0 != r1) goto Lbe
            boolean r0 = r2.q
            boolean r1 = r3.q
            if (r0 != r1) goto Lbe
            boolean r0 = r2.r
            boolean r1 = r3.r
            if (r0 != r1) goto Lbe
            boolean r0 = r2.n
            boolean r1 = r3.n
            if (r0 != r1) goto Lbe
            int r0 = r2.w
            int r1 = r3.w
            if (r0 != r1) goto Lbe
            float r0 = r2.x
            float r1 = r3.x
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Lbe
            int r0 = r2.y
            int r1 = r3.y
            if (r0 != r1) goto Lbe
            int r0 = r2.z
            int r1 = r3.z
            if (r0 != r1) goto Lbe
            int r0 = r2.A
            int r1 = r3.A
            if (r0 != r1) goto Lbe
            boolean r0 = r2.u
            boolean r1 = r3.u
            if (r0 != r1) goto Lbe
            int r0 = r2.B
            int r1 = r3.B
            if (r0 != r1) goto Lbe
            boolean r0 = r2.C
            boolean r1 = r3.C
            if (r0 != r1) goto Lbe
            boolean r0 = r2.s
            boolean r1 = r3.s
            if (r0 != r1) goto Lbe
            com.baidu.location.i$b r0 = r2.v
            com.baidu.location.i$b r1 = r3.v
            if (r0 != r1) goto Lbe
            boolean r0 = r2.j
            boolean r1 = r3.j
            if (r0 != r1) goto Lbe
            com.baidu.location.i$a r2 = r2.D
            com.baidu.location.i$a r3 = r3.D
            if (r2 != r3) goto Lbe
            r2 = 1
            return r2
        Lbe:
            r2 = 0
            return r2
    }

    public int b() {
            r0 = this;
            int r0 = r0.w
            return r0
    }

    public void b(boolean r1) {
            r0 = this;
            r0.h = r1
            return
    }

    public java.lang.String c() {
            r0 = this;
            java.lang.String r0 = r0.f1371b
            return r0
    }

    public void c(boolean r1) {
            r0 = this;
            r0.f1372c = r1
            return
    }

    public int d() {
            r0 = this;
            int r0 = r0.z
            return r0
    }

    public int e() {
            r0 = this;
            int r0 = r0.y
            return r0
    }

    public java.lang.String f() {
            r0 = this;
            java.lang.String r0 = r0.f1370a
            return r0
    }

    public int g() {
            r0 = this;
            int r0 = r0.d
            return r0
    }

    public boolean h() {
            r0 = this;
            boolean r0 = r0.i
            return r0
    }

    public boolean i() {
            r0 = this;
            boolean r0 = r0.u
            return r0
    }
}
