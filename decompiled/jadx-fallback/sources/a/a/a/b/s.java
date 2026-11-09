package a.a.a.b;

/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final double[] f69c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.util.HashMap<java.lang.String, a.a.a.b.s.c> f70a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.util.HashMap<java.lang.String, java.lang.String> f71b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static a.a.a.b.s f72a;

        static {
                a.a.a.b.s r0 = new a.a.a.b.s
                r0.<init>()
                a.a.a.b.s.a.f72a = r0
                return
        }

        public static /* synthetic */ a.a.a.b.s a() {
                a.a.a.b.s r0 = a.a.a.b.s.a.f72a
                return r0
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f73a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double f74b;

        public b(a.a.a.b.s r3) {
                r2 = this;
                r2.<init>()
                r3 = 0
                r2.f73a = r3
                r0 = 0
                r2.f74b = r0
                return
        }
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f75a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f76b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f77c;
        public int d;
        public int e;
        public java.util.ArrayList<java.lang.String> f;
        public java.util.ArrayList<java.lang.Integer> g;
        public int h;
        public double i;
        public double j;
        public double k;
        public int l;
        public a.a.a.b.s.b m;
        public final /* synthetic */ a.a.a.b.s n;

        public c(a.a.a.b.s r3, int r4, int r5) {
                r2 = this;
                r2.n = r3
                r2.<init>()
                r2.a(r4, r5)
                r4 = 0
                r2.h = r4
                r0 = 0
                r2.i = r0
                r2.j = r0
                r2.k = r0
                r2.l = r4
                a.a.a.b.s$b r4 = new a.a.a.b.s$b
                r4.<init>(r3)
                r2.m = r4
                return
        }

        public static /* synthetic */ java.lang.String a(a.a.a.b.s.c r0) {
                java.lang.String r0 = r0.c()
                return r0
        }

        public static /* synthetic */ void a(a.a.a.b.s.c r0, android.location.GnssNavigationMessage r1, long r2) {
                r0.a(r1, r2)
                return
        }

        public final a.a.a.b.s.b a(int r3, double r4) {
                r2 = this;
                double[] r0 = a.a.a.b.s.b()
                a.a.a.b.s$b r2 = r2.a(r0)
                r0 = -4481700220488384512(0xc1cdcd6500000000, double:-1.0E9)
                int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r0 < 0) goto L1a
                r0 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
                int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r0 >= 0) goto L1c
            L1a:
                r4 = 0
            L1c:
                int r0 = r2.f73a
                r1 = 604800(0x93a80, float:8.47505E-40)
                int r3 = r3 * r1
                int r1 = (int) r4
                int r3 = r3 + r1
                int r0 = r0 + r3
                r2.f73a = r0
                double r0 = (double) r1
                double r4 = r4 - r0
                r2.f74b = r4
                return r2
        }

        public final a.a.a.b.s.b a(double[] r11) {
                r10 = this;
                r0 = 12
                int[] r1 = new int[r0]
                r1 = {x0062: FILL_ARRAY_DATA , data: [1, 32, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335} // fill-array
                a.a.a.b.s$b r2 = new a.a.a.b.s$b
                a.a.a.b.s r10 = r10.n
                r2.<init>(r10)
                r10 = 0
                r3 = r11[r10]
                int r3 = (int) r3
                r4 = 1
                r5 = r11[r4]
                int r5 = (int) r5
                r6 = 2
                r7 = r11[r6]
                int r7 = (int) r7
                r8 = 1970(0x7b2, float:2.76E-42)
                if (r3 < r8) goto L60
                r8 = 2099(0x833, float:2.941E-42)
                if (r8 < r3) goto L60
                if (r5 < r4) goto L60
                if (r0 >= r5) goto L27
                goto L60
            L27:
                int r0 = r3 + (-1970)
                int r0 = r0 * 365
                int r8 = r3 + (-1969)
                r9 = 4
                int r8 = r8 / r9
                int r0 = r0 + r8
                int r8 = r5 + (-1)
                r1 = r1[r8]
                int r0 = r0 + r1
                int r0 = r0 + r7
                int r0 = r0 - r6
                int r3 = r3 % r9
                r1 = 3
                if (r3 != 0) goto L3e
                if (r5 < r1) goto L3e
                r10 = r4
            L3e:
                int r0 = r0 + r10
                r10 = 5
                r3 = r11[r10]
                double r3 = java.lang.Math.floor(r3)
                int r3 = (int) r3
                r4 = 86400(0x15180, float:1.21072E-40)
                int r0 = r0 * r4
                r4 = r11[r1]
                int r1 = (int) r4
                int r1 = r1 * 3600
                int r0 = r0 + r1
                r4 = r11[r9]
                int r1 = (int) r4
                int r1 = r1 * 60
                int r0 = r0 + r1
                int r0 = r0 + r3
                r2.f73a = r0
                r10 = r11[r10]
                double r0 = (double) r3
                double r10 = r10 - r0
                r2.f74b = r10
            L60:
                return r2
        }

        @android.annotation.TargetApi(24)
        public final java.lang.String a(android.location.GnssNavigationMessage r7) {
                r6 = this;
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                byte[] r7 = r7.getData()
                int r0 = r7.length
                r1 = 0
                r2 = r1
            Lc:
                if (r2 >= r0) goto L2f
                r3 = r7[r2]
                r4 = 1
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r3 = r3 & 255(0xff, float:3.57E-43)
                java.lang.String r3 = java.lang.Integer.toBinaryString(r3)
                r4[r1] = r3
                java.lang.String r3 = "%8s"
                java.lang.String r3 = java.lang.String.format(r3, r4)
                r4 = 32
                r5 = 48
                java.lang.String r3 = r3.replace(r4, r5)
                r6.append(r3)
                int r2 = r2 + 1
                goto Lc
            L2f:
                java.lang.String r6 = r6.toString()
                return r6
        }

        public final void a() {
                r5 = this;
                java.util.ArrayList<java.lang.String> r0 = r5.f
                int r0 = r0.size()
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L29
                r0 = r1
            Lb:
                java.util.ArrayList<java.lang.String> r3 = r5.f
                int r3 = r3.size()
                if (r0 >= r3) goto L27
                java.util.ArrayList<java.lang.String> r3 = r5.f
                java.lang.Object r3 = r3.get(r0)
                java.lang.String r3 = (java.lang.String) r3
                java.lang.String r4 = "None"
                boolean r3 = r3.contains(r4)
                if (r3 == 0) goto L24
                goto L29
            L24:
                int r0 = r0 + 1
                goto Lb
            L27:
                r0 = r2
                goto L2a
            L29:
                r0 = r1
            L2a:
                if (r0 == 0) goto L2f
                r5.f76b = r2
                goto L31
            L2f:
                r5.f76b = r1
            L31:
                return
        }

        public final void a(int r6, int r7) {
                r5 = this;
                int r0 = r5.e
                r1 = 257(0x101, float:3.6E-43)
                r2 = 0
                if (r0 == r1) goto L20
                r1 = 769(0x301, float:1.078E-42)
                if (r0 == r1) goto L20
                r1 = 1537(0x601, float:2.154E-42)
                if (r0 == r1) goto L1e
                r1 = 1281(0x501, float:1.795E-42)
                if (r0 == r1) goto L1c
                r1 = 1282(0x502, float:1.796E-42)
                if (r0 == r1) goto L19
                r0 = r2
                goto L21
            L19:
                r0 = 10
                goto L21
            L1c:
                r0 = 3
                goto L21
            L1e:
                r0 = 6
                goto L21
            L20:
                r0 = 5
            L21:
                java.util.ArrayList<java.lang.String> r1 = r5.f
                if (r1 == 0) goto L29
                r1.clear()
                goto L30
            L29:
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r5.f = r1
            L30:
                java.util.ArrayList<java.lang.Integer> r1 = r5.g
                if (r1 == 0) goto L38
                r1.clear()
                goto L3f
            L38:
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r5.g = r1
            L3f:
                r1 = r2
            L40:
                if (r1 >= r0) goto L4c
                java.util.ArrayList<java.lang.String> r3 = r5.f
                java.lang.String r4 = "None"
                r3.add(r4)
                int r1 = r1 + 1
                goto L40
            L4c:
                r5.d = r6
                r5.e = r7
                r5.f75a = r2
                r5.f76b = r2
                r6 = 0
                r5.f77c = r6
                return
        }

        @android.annotation.TargetApi(24)
        public final void a(android.location.GnssNavigationMessage r17, long r18) {
                r16 = this;
                r0 = r16
                r1 = r18
                int r3 = r17.getType()
                int r4 = r17.getSvid()
                int r5 = r17.getSubmessageId()
                byte[] r6 = r17.getData()
                long r7 = r0.f77c
                long r7 = r1 - r7
                r9 = 1200(0x4b0, double:5.93E-321)
                int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r7 > 0) goto L32
                boolean r7 = r0.f75a
                if (r7 != 0) goto L32
                java.util.ArrayList<java.lang.String> r7 = r0.f
                int r7 = r7.size()
                if (r7 == 0) goto L32
                int r7 = r0.e
                if (r3 != r7) goto L32
                int r7 = r0.d
                if (r4 == r7) goto L35
            L32:
                r0.a(r4, r3)
            L35:
                r7 = 1281(0x501, float:1.795E-42)
                r8 = 1282(0x502, float:1.796E-42)
                if (r3 == r8) goto L3d
                if (r3 != r7) goto L46
            L3d:
                boolean r9 = r16.b()
                if (r9 != 0) goto L46
                r0.a(r4, r3)
            L46:
                java.util.ArrayList<java.lang.String> r4 = r0.f
                int r4 = r4.size()
                if (r4 != 0) goto L4f
                return
            L4f:
                int r4 = r0.e
                r9 = 1537(0x601, float:2.154E-42)
                r10 = 0
                r11 = 1
                if (r4 != r9) goto L59
                r12 = r10
                goto L5a
            L59:
                r12 = r11
            L5a:
                if (r4 != r8) goto L69
                if (r5 != r11) goto L68
                java.lang.String r4 = r16.b(r17)
                r0.a(r4)
                int r5 = r0.l
                goto L69
            L68:
                return
            L69:
                int r5 = r5 - r12
                java.util.ArrayList<java.lang.String> r4 = r0.f
                int r4 = r4.size()
                if (r5 < r4) goto L73
                return
            L73:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                int r12 = r6.length
                r13 = r10
            L7a:
                if (r13 >= r12) goto L8d
                r14 = r6[r13]
                if (r11 == 0) goto L82
                r11 = r10
                goto L87
            L82:
                r15 = 44
                r4.append(r15)
            L87:
                r4.append(r14)
                int r13 = r13 + 1
                goto L7a
            L8d:
                java.lang.String r4 = r4.toString()
                java.util.ArrayList<java.lang.String> r6 = r0.f
                r6.set(r5, r4)
                if (r3 == r7) goto L9a
                if (r3 != r8) goto La3
            L9a:
                java.util.ArrayList<java.lang.Integer> r3 = r0.g
                java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
                r3.add(r4)
            La3:
                int r3 = r0.e
                if (r3 != r9) goto Lae
                java.lang.String r3 = r16.a(r17)
                r0.b(r3)
            Lae:
                r16.a()
                r0.f77c = r1
                return
        }

        public final void a(java.lang.String r3) {
                r2 = this;
                r0 = 42
                r1 = 46
                java.lang.String r3 = r3.substring(r0, r1)
                r0 = 2
                int r3 = java.lang.Integer.parseInt(r3, r0)
                r2.l = r3
                return
        }

        @android.annotation.TargetApi(24)
        public final java.lang.String b(android.location.GnssNavigationMessage r7) {
                r6 = this;
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                byte[] r7 = r7.getData()
                int r0 = r7.length
                r1 = 0
                r2 = r1
            Lc:
                if (r2 >= r0) goto L3a
                r3 = r7[r2]
                r4 = 1
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r3 = r3 & 255(0xff, float:3.57E-43)
                java.lang.String r3 = java.lang.Integer.toBinaryString(r3)
                r4[r1] = r3
                java.lang.String r3 = "%8s"
                java.lang.String r3 = java.lang.String.format(r3, r4)
                r4 = 32
                r5 = 48
                java.lang.String r3 = r3.replace(r4, r5)
                int r4 = r2 % 4
                if (r4 != 0) goto L34
                r4 = 2
                r5 = 8
                java.lang.String r3 = r3.substring(r4, r5)
            L34:
                r6.append(r3)
                int r2 = r2 + 1
                goto Lc
            L3a:
                java.lang.String r6 = r6.toString()
                return r6
        }

        public final void b(java.lang.String r8) {
                r7 = this;
                r0 = 0
                char r1 = r8.charAt(r0)
                r2 = 120(0x78, float:1.68E-43)
                char r2 = r8.charAt(r2)
                r3 = 122(0x7a, float:1.71E-43)
                r4 = 48
                r5 = 49
                r6 = 2
                if (r1 != r5) goto L32
                if (r2 != r4) goto L32
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r2 = 18
                java.lang.String r2 = r8.substring(r6, r2)
                r1.append(r2)
                r2 = 234(0xea, float:3.28E-43)
            L26:
                java.lang.String r8 = r8.substring(r3, r2)
                r1.append(r8)
                java.lang.String r8 = r1.toString()
                goto L47
            L32:
                if (r1 != r4) goto L63
                if (r2 != r5) goto L63
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r2 = 114(0x72, float:1.6E-43)
                java.lang.String r2 = r8.substring(r6, r2)
                r1.append(r2)
                r2 = 138(0x8a, float:1.93E-43)
                goto L26
            L47:
                r1 = 6
                java.lang.String r0 = r8.substring(r0, r1)
                int r0 = java.lang.Integer.parseInt(r0, r6)
                if (r0 != 0) goto L56
                r7.e(r8)
                goto L63
            L56:
                r1 = 1
                if (r0 != r1) goto L5d
                r7.d(r8)
                goto L63
            L5d:
                r1 = 4
                if (r0 != r1) goto L63
                r7.c(r8)
            L63:
                return
        }

        public final boolean b() {
                r3 = this;
                java.util.ArrayList<java.lang.Integer> r0 = r3.g
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                r0 = r1
            L7:
                java.util.ArrayList<java.lang.Integer> r2 = r3.g
                int r2 = r2.size()
                if (r0 >= r2) goto L21
                java.util.ArrayList<java.lang.Integer> r2 = r3.g
                java.lang.Object r2 = r2.get(r0)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                if (r2 == r0) goto L1e
                goto L22
            L1e:
                int r0 = r0 + 1
                goto L7
            L21:
                r1 = 1
            L22:
                return r1
        }

        public final java.lang.String c() {
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                boolean r1 = r6.f76b
                if (r1 != 0) goto Le
                java.lang.String r6 = r0.toString()
                return r6
            Le:
                int r1 = r6.e
                r2 = 1537(0x601, float:2.154E-42)
                if (r1 != r2) goto L17
                r6.d()
            L17:
                a.a.a.b.s$b r1 = r6.m
                int r1 = r1.f73a
                r0.append(r1)
                r1 = 124(0x7c, float:1.74E-43)
                r0.append(r1)
                r1 = 0
                r2 = 1
                r3 = r1
                r4 = r2
            L27:
                java.util.ArrayList<java.lang.String> r5 = r6.f
                int r5 = r5.size()
                if (r3 >= r5) goto L46
                if (r4 == 0) goto L33
                r4 = r1
                goto L38
            L33:
                r5 = 44
                r0.append(r5)
            L38:
                java.util.ArrayList<java.lang.String> r5 = r6.f
                java.lang.Object r5 = r5.get(r3)
                java.lang.String r5 = (java.lang.String) r5
                r0.append(r5)
                int r3 = r3 + 1
                goto L27
            L46:
                r6.f75a = r2
                java.lang.String r6 = r0.toString()
                return r6
        }

        public final void c(java.lang.String r5) {
                r4 = this;
                r0 = 54
                r1 = 68
                java.lang.String r5 = r5.substring(r0, r1)
                r0 = 2
                long r0 = java.lang.Long.parseLong(r5, r0)
                r2 = 60
                long r0 = r0 * r2
                double r0 = (double) r0
                r4.k = r0
                return
        }

        public final void d() {
                r6 = this;
                int r0 = r6.h
                double r1 = r6.i
                a.a.a.b.s$b r0 = r6.a(r0, r1)
                int r1 = r6.h
                double r2 = r6.j
                a.a.a.b.s$b r1 = r6.a(r1, r2)
                int r2 = r1.f73a
                int r3 = r0.f73a
                int r2 = r2 - r3
                double r2 = (double) r2
                double r4 = r1.f74b
                double r2 = r2 + r4
                double r0 = r0.f74b
                double r2 = r2 - r0
                r0 = 4688938804906557440(0x4112750000000000, double:302400.0)
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 <= 0) goto L2c
                int r0 = r6.h
                int r0 = r0 + (-1)
            L29:
                r6.h = r0
                goto L3a
            L2c:
                r0 = -4534433231948218368(0xc112750000000000, double:-302400.0)
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 >= 0) goto L3a
                int r0 = r6.h
                int r0 = r0 + 1
                goto L29
            L3a:
                int r0 = r6.h
                double r1 = r6.k
                a.a.a.b.s$b r0 = r6.a(r0, r1)
                r6.m = r0
                return
        }

        public final void d(java.lang.String r5) {
                r4 = this;
                r0 = 16
                r1 = 30
                java.lang.String r5 = r5.substring(r0, r1)
                r0 = 2
                long r0 = java.lang.Long.parseLong(r5, r0)
                double r0 = (double) r0
                r2 = 4633641066610819072(0x404e000000000000, double:60.0)
                double r0 = r0 * r2
                r4.j = r0
                return
        }

        public final void e(java.lang.String r4) {
                r3 = this;
                r0 = 108(0x6c, float:1.51E-43)
                r1 = 96
                java.lang.String r1 = r4.substring(r1, r0)
                r2 = 2
                int r1 = java.lang.Integer.parseInt(r1, r2)
                r3.h = r1
                r1 = 128(0x80, float:1.8E-43)
                java.lang.String r4 = r4.substring(r0, r1)
                long r0 = java.lang.Long.parseLong(r4, r2)
                double r0 = (double) r0
                r3.i = r0
                return
        }
    }

    static {
            r0 = 6
            double[] r0 = new double[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [4656506510422048768, 4620693217682128896, 4626885667169763328, 0, 0, 0} // fill-array
            a.a.a.b.s.f69c = r0
            return
    }

    public s() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f70a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f71b = r0
            return
    }

    public static /* synthetic */ double[] b() {
            double[] r0 = a.a.a.b.s.f69c
            return r0
    }

    public static a.a.a.b.s c() {
            a.a.a.b.s r0 = a.a.a.b.s.a.a()
            return r0
    }

    public java.util.ArrayList<java.lang.String> a() {
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashMap<java.lang.String, a.a.a.b.s$c> r1 = r8.f70a
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L74
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            a.a.a.b.s$c r2 = (a.a.a.b.s.c) r2
            java.lang.String r2 = a.a.a.b.s.c.a(r2)
            if (r2 == 0) goto Lf
            int r4 = r2.length()
            if (r4 != 0) goto L34
            goto Lf
        L34:
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r8.f71b
            boolean r4 = r4.containsKey(r3)
            if (r4 != 0) goto L42
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r8.f71b
            r4.put(r3, r2)
            goto L5c
        L42:
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r8.f71b
            java.lang.Object r4 = r4.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            r5 = 100
            r6 = 0
            java.lang.String r7 = r2.substring(r6, r5)
            java.lang.String r4 = r4.substring(r6, r5)
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L5c
            goto Lf
        L5c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r3 = 124(0x7c, float:1.74E-43)
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r0.add(r2)
            goto Lf
        L74:
            return r0
    }

    @android.annotation.TargetApi(24)
    public void a(android.location.GnssNavigationMessage r6, long r7) {
            r5 = this;
            int r0 = r6.getSvid()
            int r1 = r6.getType()
            r2 = 257(0x101, float:3.6E-43)
            java.lang.String r3 = "none"
            if (r1 == r2) goto L2c
            r2 = 769(0x301, float:1.078E-42)
            if (r1 == r2) goto L29
            r2 = 1537(0x601, float:2.154E-42)
            if (r1 == r2) goto L26
            r2 = 1281(0x501, float:1.795E-42)
            if (r1 == r2) goto L23
            r2 = 1282(0x502, float:1.796E-42)
            if (r1 == r2) goto L20
            r2 = r3
            goto L2e
        L20:
            java.lang.String r2 = "CT"
            goto L2e
        L23:
            java.lang.String r2 = "CO"
            goto L2e
        L26:
            java.lang.String r2 = "E"
            goto L2e
        L29:
            java.lang.String r2 = "R"
            goto L2e
        L2c:
            java.lang.String r2 = "G"
        L2e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r4.append(r0)
            java.lang.String r2 = r4.toString()
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L44
            return
        L44:
            java.util.HashMap<java.lang.String, a.a.a.b.s$c> r3 = r5.f70a
            if (r3 != 0) goto L49
            return
        L49:
            boolean r3 = r3.containsKey(r2)
            if (r3 != 0) goto L59
            a.a.a.b.s$c r3 = new a.a.a.b.s$c
            r3.<init>(r5, r0, r1)
            java.util.HashMap<java.lang.String, a.a.a.b.s$c> r0 = r5.f70a
            r0.put(r2, r3)
        L59:
            java.util.HashMap<java.lang.String, a.a.a.b.s$c> r5 = r5.f70a
            java.lang.Object r5 = r5.get(r2)
            a.a.a.b.s$c r5 = (a.a.a.b.s.c) r5
            a.a.a.b.s.c.a(r5, r6, r7)
            return
    }
}
