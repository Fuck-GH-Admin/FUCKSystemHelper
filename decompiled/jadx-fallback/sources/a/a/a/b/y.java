package a.a.a.b;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static java.util.ArrayList<java.lang.String> f93b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static java.util.ArrayList<java.lang.String> f94c;
    public static java.util.ArrayList<java.lang.String> d;
    public static java.lang.String e;
    public static java.lang.String f;
    public static java.lang.String g;
    public static java.lang.String h;
    public static java.lang.String i;
    public static java.io.File j;
    public static int k;
    public static int l;
    public static int m;
    public static int n;
    public static int o;
    public static int p;
    public static int q;
    public static android.location.Location r;
    public static android.location.Location s;
    public static android.location.Location t;
    public static a.a.a.g.k u;
    public static a.a.a.b.y v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.a.a.b.y.a f95a;

    public class a extends a.a.a.i.g {
        public boolean i;
        public int j;
        public int k;
        public java.util.ArrayList<java.lang.String> l;
        public boolean m;

        public a(a.a.a.b.y r1) {
                r0 = this;
                r0.<init>()
                r1 = 0
                r0.i = r1
                r0.j = r1
                r0.k = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.l = r1
                r1 = 1
                r0.m = r1
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                r0.d = r1
                return
        }

        @Override // a.a.a.i.g
        public void a() {
                r7 = this;
                int r0 = r7.j
                r1 = 1
                if (r0 == r1) goto Lb
                java.lang.String r0 = a.a.a.i.i.j()
                r7.f337a = r0
            Lb:
                r0 = 2
                r7.f338b = r0
                java.util.ArrayList<java.lang.String> r0 = r7.l
                if (r0 == 0) goto L76
                r0 = 0
                r2 = r0
            L14:
                java.util.ArrayList<java.lang.String> r3 = r7.l
                int r3 = r3.size()
                if (r2 >= r3) goto L4e
                int r3 = r7.j
                java.lang.String r4 = "]"
                if (r3 != r1) goto L2c
                java.util.Map<java.lang.String, java.lang.Object> r3 = r7.d
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "cldc["
                goto L35
            L2c:
                java.util.Map<java.lang.String, java.lang.Object> r3 = r7.d
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "cltr["
            L35:
                r5.append(r6)
                r5.append(r2)
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                java.util.ArrayList<java.lang.String> r5 = r7.l
                java.lang.Object r5 = r5.get(r2)
                r3.put(r4, r5)
                int r2 = r2 + 1
                goto L14
            L4e:
                java.util.Locale r2 = java.util.Locale.CHINA
                java.lang.Object[] r3 = new java.lang.Object[r1]
                long r4 = java.lang.System.currentTimeMillis()
                java.lang.Long r4 = java.lang.Long.valueOf(r4)
                r3[r0] = r4
                java.lang.String r0 = "%d"
                java.lang.String r0 = java.lang.String.format(r2, r0, r3)
                java.util.Map<java.lang.String, java.lang.Object> r2 = r7.d
                java.lang.String r3 = "trtm"
                r2.put(r3, r0)
                int r0 = r7.j
                if (r0 == r1) goto L76
                java.util.Map<java.lang.String, java.lang.Object> r7 = r7.d
                java.lang.String r0 = "qt"
                java.lang.String r1 = "cltrg"
                r7.put(r0, r1)
            L76:
                return
        }

        @Override // a.a.a.i.g
        public void a(boolean r4) {
                r3 = this;
                java.lang.String r0 = "ison"
                r1 = 0
                if (r4 == 0) goto L2a
                java.lang.String r4 = r3.f339c
                if (r4 == 0) goto L2a
                java.util.ArrayList<java.lang.String> r4 = r3.l
                if (r4 == 0) goto L10
                r4.clear()
            L10:
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> L26
                java.lang.String r2 = r3.f339c     // Catch: java.lang.Exception -> L26
                r4.<init>(r2)     // Catch: java.lang.Exception -> L26
                boolean r2 = r4.has(r0)     // Catch: java.lang.Exception -> L26
                if (r2 == 0) goto L2a
                int r4 = r4.getInt(r0)     // Catch: java.lang.Exception -> L26
                if (r4 != 0) goto L2a
                r3.m = r1     // Catch: java.lang.Exception -> L26
                goto L2a
            L26:
                r4 = move-exception
                r4.printStackTrace()
            L2a:
                java.util.Map<java.lang.String, java.lang.Object> r4 = r3.d
                if (r4 == 0) goto L31
                r4.clear()
            L31:
                r3.i = r1
                return
        }

        public synchronized void b() {
                r7 = this;
                monitor-enter(r7)
                boolean r0 = r7.i     // Catch: java.lang.Throwable -> Lbd
                if (r0 == 0) goto L7
                monitor-exit(r7)
                return
            L7:
                int r0 = a.a.a.i.g.h     // Catch: java.lang.Throwable -> Lbd
                r1 = 4
                r2 = 1
                if (r0 <= r1) goto L16
                int r1 = r7.k     // Catch: java.lang.Throwable -> Lbd
                if (r1 >= r0) goto L16
                int r1 = r1 + r2
                r7.k = r1     // Catch: java.lang.Throwable -> Lbd
                monitor-exit(r7)
                return
            L16:
                r0 = 0
                r7.k = r0     // Catch: java.lang.Throwable -> Lbd
                r7.i = r2     // Catch: java.lang.Throwable -> Lbd
                r7.j = r0     // Catch: java.lang.Throwable -> Lbd
                java.util.ArrayList<java.lang.String> r1 = r7.l     // Catch: java.lang.Exception -> Lb4 java.lang.Throwable -> Lbd
                if (r1 == 0) goto L27
                int r1 = r1.size()     // Catch: java.lang.Exception -> Lb4 java.lang.Throwable -> Lbd
                if (r1 >= r2) goto L6e
            L27:
                java.util.ArrayList<java.lang.String> r1 = r7.l     // Catch: java.lang.Exception -> Lb4 java.lang.Throwable -> Lbd
                if (r1 != 0) goto L32
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lb4 java.lang.Throwable -> Lbd
                r1.<init>()     // Catch: java.lang.Exception -> Lb4 java.lang.Throwable -> Lbd
                r7.l = r1     // Catch: java.lang.Exception -> Lb4 java.lang.Throwable -> Lbd
            L32:
                r7.j = r0     // Catch: java.lang.Exception -> Lb4 java.lang.Throwable -> Lbd
                r1 = r0
            L35:
                int r3 = r7.j     // Catch: java.lang.Exception -> Lb4 java.lang.Throwable -> Lbd
                r4 = 2
                r5 = 0
                if (r3 >= r4) goto L40
                java.lang.String r3 = a.a.a.b.y.f()     // Catch: java.lang.Exception -> Lb4 java.lang.Throwable -> Lbd
                goto L41
            L40:
                r3 = r5
            L41:
                if (r3 != 0) goto L52
                int r6 = r7.j     // Catch: java.lang.Exception -> Lb4 java.lang.Throwable -> Lbd
                if (r6 == r2) goto L52
                boolean r6 = r7.m     // Catch: java.lang.Exception -> Lb4 java.lang.Throwable -> Lbd
                if (r6 == 0) goto L52
                r7.j = r4     // Catch: java.lang.Exception -> Lb4 java.lang.Throwable -> Lbd
                java.lang.String r5 = a.a.a.b.k.b()     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> Lbd
                goto L55
            L52:
                r7.j = r2     // Catch: java.lang.Exception -> Lb4 java.lang.Throwable -> Lbd
                r5 = r3
            L55:
                if (r5 != 0) goto L58
                goto L6e
            L58:
                java.lang.String r3 = "err!"
                boolean r3 = r5.contains(r3)     // Catch: java.lang.Exception -> Lb4 java.lang.Throwable -> Lbd
                if (r3 != 0) goto L35
                java.util.ArrayList<java.lang.String> r3 = r7.l     // Catch: java.lang.Exception -> Lb4 java.lang.Throwable -> Lbd
                r3.add(r5)     // Catch: java.lang.Exception -> Lb4 java.lang.Throwable -> Lbd
                int r3 = r5.length()     // Catch: java.lang.Exception -> Lb4 java.lang.Throwable -> Lbd
                int r1 = r1 + r3
                int r3 = a.a.a.i.a.d     // Catch: java.lang.Exception -> Lb4 java.lang.Throwable -> Lbd
                if (r1 < r3) goto L35
            L6e:
                java.util.ArrayList<java.lang.String> r1 = r7.l     // Catch: java.lang.Exception -> Lb4 java.lang.Throwable -> Lbd
                if (r1 == 0) goto La9
                int r1 = r1.size()     // Catch: java.lang.Exception -> Lb4 java.lang.Throwable -> Lbd
                if (r1 >= r2) goto L79
                goto La9
            L79:
                int r0 = r7.j     // Catch: java.lang.Throwable -> Lbd
                if (r0 == r2) goto L97
                a.a.a.b.w r0 = a.a.a.b.w.d()     // Catch: java.lang.Throwable -> Lbd
                java.util.concurrent.ExecutorService r0 = r0.b()     // Catch: java.lang.Throwable -> Lbd
                if (r0 == 0) goto L8f
                java.lang.String r1 = a.a.a.i.i.j()     // Catch: java.lang.Throwable -> Lbd
            L8b:
                r7.a(r0, r1)     // Catch: java.lang.Throwable -> Lbd
                goto La7
            L8f:
                java.lang.String r0 = a.a.a.i.i.j()     // Catch: java.lang.Throwable -> Lbd
            L93:
                r7.a(r0)     // Catch: java.lang.Throwable -> Lbd
                goto La7
            L97:
                a.a.a.b.w r0 = a.a.a.b.w.d()     // Catch: java.lang.Throwable -> Lbd
                java.util.concurrent.ExecutorService r0 = r0.b()     // Catch: java.lang.Throwable -> Lbd
                if (r0 == 0) goto La4
                java.lang.String r1 = a.a.a.i.d.f324b     // Catch: java.lang.Throwable -> Lbd
                goto L8b
            La4:
                java.lang.String r0 = a.a.a.i.d.f324b     // Catch: java.lang.Throwable -> Lbd
                goto L93
            La7:
                monitor-exit(r7)
                return
            La9:
                java.util.ArrayList<java.lang.String> r1 = r7.l     // Catch: java.lang.Exception -> Lb4 java.lang.Throwable -> Lbd
                if (r1 == 0) goto Lb0
                r1.clear()     // Catch: java.lang.Exception -> Lb4 java.lang.Throwable -> Lbd
            Lb0:
                r7.i = r0     // Catch: java.lang.Exception -> Lb4 java.lang.Throwable -> Lbd
                monitor-exit(r7)
                return
            Lb4:
                java.util.ArrayList<java.lang.String> r0 = r7.l     // Catch: java.lang.Throwable -> Lbd
                if (r0 == 0) goto Lbb
                r0.clear()     // Catch: java.lang.Throwable -> Lbd
            Lbb:
                monitor-exit(r7)
                return
            Lbd:
                r0 = move-exception
                monitor-exit(r7)
                throw r0
        }
    }

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            a.a.a.b.y.f93b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            a.a.a.b.y.f94c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            a.a.a.b.y.d = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = a.a.a.i.h.f353a
            r0.append(r1)
            java.lang.String r1 = "/yo.dat"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            a.a.a.b.y.e = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = a.a.a.i.h.f353a
            r0.append(r1)
            java.lang.String r1 = "/yoh.dat"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            a.a.a.b.y.f = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = a.a.a.i.h.f353a
            r0.append(r1)
            java.lang.String r1 = "/yom.dat"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            a.a.a.b.y.g = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = a.a.a.i.h.f353a
            r0.append(r1)
            java.lang.String r1 = "/yol.dat"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            a.a.a.b.y.h = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = a.a.a.i.h.f353a
            r0.append(r1)
            java.lang.String r1 = "/yor.dat"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            a.a.a.b.y.i = r0
            r0 = 0
            a.a.a.b.y.j = r0
            r1 = 8
            a.a.a.b.y.k = r1
            a.a.a.b.y.l = r1
            r1 = 16
            a.a.a.b.y.m = r1
            r1 = 2048(0x800, float:2.87E-42)
            a.a.a.b.y.n = r1
            r1 = 0
            a.a.a.b.y.o = r1
            r1 = 64
            a.a.a.b.y.p = r1
            r1 = 128(0x80, float:1.8E-43)
            a.a.a.b.y.q = r1
            a.a.a.b.y.r = r0
            a.a.a.b.y.s = r0
            a.a.a.b.y.t = r0
            a.a.a.b.y.u = r0
            a.a.a.b.y.v = r0
            return
    }

    public y() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f95a = r0
            a.a.a.b.y$a r0 = new a.a.a.b.y$a
            r0.<init>(r2)
            r2.f95a = r0
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r2 <= r0) goto L78
            java.lang.String r2 = a.a.a.i.i.e()
            if (r2 == 0) goto L78
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r1 = "/yo2.dat"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            a.a.a.b.y.e = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r1 = "/yoh2.dat"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            a.a.a.b.y.f = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r1 = "/yom2.dat"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            a.a.a.b.y.g = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r1 = "/yol2.dat"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            a.a.a.b.y.h = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = "/yor2.dat"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            a.a.a.b.y.i = r2
        L78:
            return
    }

    public static synchronized int a(java.util.List<java.lang.String> r17, int r18) {
            r0 = r17
            r1 = r18
            java.lang.Class<a.a.a.b.y> r2 = a.a.a.b.y.class
            monitor-enter(r2)
            if (r0 == 0) goto Lce
            r3 = 256(0x100, float:3.59E-43)
            if (r1 > r3) goto Lce
            if (r1 >= 0) goto L11
            goto Lce
        L11:
            java.io.File r3 = a.a.a.b.y.j     // Catch: java.lang.Throwable -> Lc3 java.lang.Exception -> Lc5
            if (r3 != 0) goto L2a
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> Lc3 java.lang.Exception -> Lc5
            java.lang.String r4 = a.a.a.b.y.e     // Catch: java.lang.Throwable -> Lc3 java.lang.Exception -> Lc5
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Lc3 java.lang.Exception -> Lc5
            a.a.a.b.y.j = r3     // Catch: java.lang.Throwable -> Lc3 java.lang.Exception -> Lc5
            boolean r3 = r3.exists()     // Catch: java.lang.Throwable -> Lc3 java.lang.Exception -> Lc5
            if (r3 != 0) goto L2a
            r0 = 0
            a.a.a.b.y.j = r0     // Catch: java.lang.Throwable -> Lc3 java.lang.Exception -> Lc5
            r0 = -2
            monitor-exit(r2)
            return r0
        L2a:
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> Lc3 java.lang.Exception -> Lc5
            java.io.File r4 = a.a.a.b.y.j     // Catch: java.lang.Throwable -> Lc3 java.lang.Exception -> Lc5
            java.lang.String r5 = "rw"
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> Lc3 java.lang.Exception -> Lc5
            long r4 = r3.length()     // Catch: java.lang.Throwable -> Lc3 java.lang.Exception -> Lc5
            r6 = 1
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L43
            r3.close()     // Catch: java.lang.Throwable -> Lc3 java.lang.Exception -> Lc5
            r0 = -3
            monitor-exit(r2)
            return r0
        L43:
            long r4 = (long) r1
            r3.seek(r4)     // Catch: java.lang.Throwable -> Lc3 java.lang.Exception -> Lc5
            int r1 = r3.readInt()     // Catch: java.lang.Throwable -> Lc3 java.lang.Exception -> Lc5
            int r12 = r3.readInt()     // Catch: java.lang.Throwable -> Lc3 java.lang.Exception -> Lc5
            int r13 = r3.readInt()     // Catch: java.lang.Throwable -> Lc3 java.lang.Exception -> Lc5
            int r14 = r3.readInt()     // Catch: java.lang.Throwable -> Lc3 java.lang.Exception -> Lc5
            long r10 = r3.readLong()     // Catch: java.lang.Throwable -> Lc3 java.lang.Exception -> Lc5
            r6 = r1
            r7 = r12
            r8 = r13
            r9 = r14
            r15 = r10
            boolean r6 = a(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Lc3 java.lang.Exception -> Lc5
            if (r6 == 0) goto Lbd
            r6 = 1
            if (r12 >= r6) goto L6a
            goto Lbd
        L6a:
            int r7 = a.a.a.b.y.n     // Catch: java.lang.Throwable -> Lc3 java.lang.Exception -> Lc5
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> Lc3 java.lang.Exception -> Lc5
            int r8 = a.a.a.b.y.k     // Catch: java.lang.Throwable -> Lc3 java.lang.Exception -> Lc5
        L70:
            if (r8 <= 0) goto La2
            if (r12 <= 0) goto La2
            int r9 = r1 + r12
            int r9 = r9 - r6
            int r9 = r9 % r13
            int r9 = r9 * r14
            long r9 = (long) r9     // Catch: java.lang.Throwable -> Lc3 java.lang.Exception -> Lc5
            r11 = r7
            r6 = r15
            long r9 = r9 + r6
            r3.seek(r9)     // Catch: java.lang.Throwable -> Lc3 java.lang.Exception -> Lc5
            int r9 = r3.readInt()     // Catch: java.lang.Throwable -> Lc3 java.lang.Exception -> Lc5
            if (r9 <= 0) goto L9a
            if (r9 >= r14) goto L9a
            r10 = 0
            r3.read(r11, r10, r9)     // Catch: java.lang.Throwable -> Lc3 java.lang.Exception -> Lc5
            int r9 = r9 + (-1)
            r15 = r11[r9]     // Catch: java.lang.Throwable -> Lc3 java.lang.Exception -> Lc5
            if (r15 != 0) goto L9a
            java.lang.String r15 = new java.lang.String     // Catch: java.lang.Throwable -> Lc3 java.lang.Exception -> Lc5
            r15.<init>(r11, r10, r9)     // Catch: java.lang.Throwable -> Lc3 java.lang.Exception -> Lc5
            r0.add(r15)     // Catch: java.lang.Throwable -> Lc3 java.lang.Exception -> Lc5
        L9a:
            int r8 = r8 + (-1)
            int r12 = r12 + (-1)
            r15 = r6
            r7 = r11
            r6 = 1
            goto L70
        La2:
            r6 = r15
            r3.seek(r4)     // Catch: java.lang.Throwable -> Lc3 java.lang.Exception -> Lc5
            r3.writeInt(r1)     // Catch: java.lang.Throwable -> Lc3 java.lang.Exception -> Lc5
            r3.writeInt(r12)     // Catch: java.lang.Throwable -> Lc3 java.lang.Exception -> Lc5
            r3.writeInt(r13)     // Catch: java.lang.Throwable -> Lc3 java.lang.Exception -> Lc5
            r3.writeInt(r14)     // Catch: java.lang.Throwable -> Lc3 java.lang.Exception -> Lc5
            r3.writeLong(r6)     // Catch: java.lang.Throwable -> Lc3 java.lang.Exception -> Lc5
            r3.close()     // Catch: java.lang.Throwable -> Lc3 java.lang.Exception -> Lc5
            int r0 = a.a.a.b.y.k     // Catch: java.lang.Throwable -> Lc3 java.lang.Exception -> Lc5
            int r0 = r0 - r8
            monitor-exit(r2)
            return r0
        Lbd:
            r3.close()     // Catch: java.lang.Throwable -> Lc3 java.lang.Exception -> Lc5
            r0 = -4
            monitor-exit(r2)
            return r0
        Lc3:
            r0 = move-exception
            goto Lcc
        Lc5:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> Lc3
            r0 = -5
            monitor-exit(r2)
            return r0
        Lcc:
            monitor-exit(r2)
            throw r0
        Lce:
            monitor-exit(r2)
            r0 = -1
            return r0
    }

    public static java.lang.String a(int r4) {
            r0 = 1
            r1 = 0
            if (r4 != r0) goto L9
            java.lang.String r4 = a.a.a.b.y.f
            java.util.ArrayList<java.lang.String> r2 = a.a.a.b.y.f93b
            goto L1f
        L9:
            r2 = 2
            if (r4 != r2) goto L11
            java.lang.String r4 = a.a.a.b.y.g
            java.util.ArrayList<java.lang.String> r2 = a.a.a.b.y.f94c
            goto L1f
        L11:
            r2 = 3
            if (r4 != r2) goto L19
            java.lang.String r4 = a.a.a.b.y.h
        L16:
            java.util.ArrayList<java.lang.String> r2 = a.a.a.b.y.d
            goto L1f
        L19:
            r2 = 4
            if (r4 != r2) goto L44
            java.lang.String r4 = a.a.a.b.y.i
            goto L16
        L1f:
            if (r2 != 0) goto L22
            return r1
        L22:
            int r3 = r2.size()
            if (r3 >= r0) goto L2b
            a(r4, r2)
        L2b:
            java.lang.Class<a.a.a.b.y> r4 = a.a.a.b.y.class
            monitor-enter(r4)
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L41
            if (r3 <= 0) goto L3f
            int r3 = r3 - r0
            java.lang.Object r0 = r2.get(r3)     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L41
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L41
            r2.remove(r3)     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L41
        L3e:
            r1 = r0
        L3f:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L41
            return r1
        L41:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L41
            throw r0
        L44:
            return r1
    }

    public static void a(int r14, boolean r15) {
            r0 = 4
            r1 = 1
            if (r14 != r1) goto L9
            java.lang.String r2 = a.a.a.b.y.f
            if (r15 == 0) goto L10
            return
        L9:
            r2 = 2
            if (r14 != r2) goto L13
            java.lang.String r2 = a.a.a.b.y.g
            if (r15 == 0) goto L1a
        L10:
            java.util.ArrayList<java.lang.String> r3 = a.a.a.b.y.f93b
            goto L25
        L13:
            r2 = 3
            if (r14 != r2) goto L1d
            java.lang.String r2 = a.a.a.b.y.h
            if (r15 == 0) goto L23
        L1a:
            java.util.ArrayList<java.lang.String> r3 = a.a.a.b.y.f94c
            goto L25
        L1d:
            if (r14 != r0) goto Le1
            java.lang.String r2 = a.a.a.b.y.i
            if (r15 == 0) goto Le1
        L23:
            java.util.ArrayList<java.lang.String> r3 = a.a.a.b.y.d
        L25:
            java.io.File r4 = new java.io.File
            r4.<init>(r2)
            boolean r5 = r4.exists()
            if (r5 != 0) goto L33
            a(r2)
        L33:
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> Le1
            java.lang.String r5 = "rw"
            r2.<init>(r4, r5)     // Catch: java.lang.Exception -> Le1
            r4 = 4
            r2.seek(r4)     // Catch: java.lang.Exception -> Le1
            int r4 = r2.readInt()     // Catch: java.lang.Exception -> Le1
            int r5 = r2.readInt()     // Catch: java.lang.Exception -> Le1
            int r6 = r2.readInt()     // Catch: java.lang.Exception -> Le1
            int r7 = r2.readInt()     // Catch: java.lang.Exception -> Le1
            int r8 = r2.readInt()     // Catch: java.lang.Exception -> Le1
            int r9 = r3.size()     // Catch: java.lang.Exception -> Le1
        L57:
            int r10 = a.a.a.b.y.l     // Catch: java.lang.Exception -> Le1
            r11 = 0
            if (r9 <= r10) goto Lc8
            if (r15 == 0) goto L60
            int r8 = r8 + 1
        L60:
            if (r6 >= r4) goto L91
            int r10 = r5 * r6
            int r10 = r10 + 128
            long r12 = (long) r10     // Catch: java.lang.Exception -> Le1
            r2.seek(r12)     // Catch: java.lang.Exception -> Le1
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Le1
            r10.<init>()     // Catch: java.lang.Exception -> Le1
            java.lang.Object r12 = r3.get(r11)     // Catch: java.lang.Exception -> Le1
            java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Exception -> Le1
            r10.append(r12)     // Catch: java.lang.Exception -> Le1
            r10.append(r11)     // Catch: java.lang.Exception -> Le1
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Exception -> Le1
            byte[] r10 = r10.getBytes()     // Catch: java.lang.Exception -> Le1
            int r12 = r10.length     // Catch: java.lang.Exception -> Le1
            r2.writeInt(r12)     // Catch: java.lang.Exception -> Le1
            int r12 = r10.length     // Catch: java.lang.Exception -> Le1
            r2.write(r10, r11, r12)     // Catch: java.lang.Exception -> Le1
            r3.remove(r11)     // Catch: java.lang.Exception -> Le1
            int r6 = r6 + 1
            goto Lc4
        L91:
            if (r15 == 0) goto Lc7
            int r10 = r7 * r5
            int r10 = r10 + 128
            long r12 = (long) r10     // Catch: java.lang.Exception -> Le1
            r2.seek(r12)     // Catch: java.lang.Exception -> Le1
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Le1
            r10.<init>()     // Catch: java.lang.Exception -> Le1
            java.lang.Object r12 = r3.get(r11)     // Catch: java.lang.Exception -> Le1
            java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Exception -> Le1
            r10.append(r12)     // Catch: java.lang.Exception -> Le1
            r10.append(r11)     // Catch: java.lang.Exception -> Le1
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Exception -> Le1
            byte[] r10 = r10.getBytes()     // Catch: java.lang.Exception -> Le1
            int r12 = r10.length     // Catch: java.lang.Exception -> Le1
            r2.writeInt(r12)     // Catch: java.lang.Exception -> Le1
            int r12 = r10.length     // Catch: java.lang.Exception -> Le1
            r2.write(r10, r11, r12)     // Catch: java.lang.Exception -> Le1
            r3.remove(r11)     // Catch: java.lang.Exception -> Le1
            int r7 = r7 + 1
            if (r7 <= r6) goto Lc4
            r7 = r11
        Lc4:
            int r9 = r9 + (-1)
            goto L57
        Lc7:
            r11 = r1
        Lc8:
            r3 = 12
            r2.seek(r3)     // Catch: java.lang.Exception -> Le1
            r2.writeInt(r6)     // Catch: java.lang.Exception -> Le1
            r2.writeInt(r7)     // Catch: java.lang.Exception -> Le1
            r2.writeInt(r8)     // Catch: java.lang.Exception -> Le1
            r2.close()     // Catch: java.lang.Exception -> Le1
            if (r11 == 0) goto Le1
            if (r14 >= r0) goto Le1
            int r14 = r14 + r1
            a(r14, r1)     // Catch: java.lang.Exception -> Le1
        Le1:
            return
    }

    public static void a(a.a.a.g.a r10, a.a.a.g.k r11, android.location.Location r12, java.lang.String r13, java.lang.String r14) {
            a.a.a.c.d r0 = a.a.a.c.d.j()
            boolean r0 = r0.f114c
            if (r0 != 0) goto L9
            return
        L9:
            int r0 = a.a.a.i.i.s
            r1 = 3
            r2 = 0
            if (r0 != r1) goto L1c
            boolean r0 = a(r12, r11)
            if (r0 != 0) goto L1c
            boolean r0 = a(r12, r2)
            if (r0 != 0) goto L1c
            return
        L1c:
            if (r10 == 0) goto L25c
            boolean r0 = r10.b()
            if (r0 == 0) goto L26
            goto L25c
        L26:
            android.content.Context r0 = com.baidu.location.f.c()
            boolean r0 = a.a.a.i.i.h(r0)
            a.a.a.f.d r3 = a.a.a.f.d.r()
            if (r0 == 0) goto L37
            a.a.a.f.d$c r7 = a.a.a.f.d.c.f236b
            goto L39
        L37:
            a.a.a.f.d$c r7 = a.a.a.f.d.c.f237c
        L39:
            a.a.a.f.d$b r8 = a.a.a.f.d.b.f235c
            r6 = 0
            r4 = r10
            r5 = r11
            com.baidu.location.c r0 = r3.a(r4, r5, r6, r7, r8)
            java.lang.String r3 = "1"
            r4 = 2
            r5 = 0
            r6 = 1
            if (r0 == 0) goto Lbf
            int r7 = r0.r()
            r8 = 67
            if (r7 != r8) goto L53
            goto Lbf
        L53:
            if (r0 == 0) goto L60
            java.lang.String r7 = r0.v()
            if (r7 == 0) goto L60
            java.lang.String r7 = r0.v()
            goto L61
        L60:
            r7 = r5
        L61:
            if (r7 == 0) goto L6d
            java.lang.String r8 = "cl"
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L6d
            r7 = r6
            goto L7a
        L6d:
            if (r7 == 0) goto L79
            java.lang.String r8 = "wf"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L79
            r7 = r4
            goto L7a
        L79:
            r7 = r2
        L7a:
            if (r0 == 0) goto Lda
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r13)
            java.util.Locale r13 = java.util.Locale.CHINA
            r9 = 5
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r9[r2] = r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            r9[r6] = r2
            double r2 = r0.t()
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r9[r4] = r2
            double r2 = r0.q()
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r9[r1] = r2
            float r0 = r0.z()
            int r0 = (int) r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 4
            r9[r2] = r0
            java.lang.String r0 = "&ofl=%s|%d|%f|%f|%d"
            java.lang.String r13 = java.lang.String.format(r13, r0, r9)
            r8.append(r13)
            java.lang.String r13 = r8.toString()
            goto Lda
        Lbf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r13)
            java.util.Locale r13 = java.util.Locale.CHINA
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r7[r2] = r3
            java.lang.String r2 = "&ofl=%s|0"
            java.lang.String r13 = java.lang.String.format(r13, r2, r7)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
        Lda:
            r0 = 1000(0x3e8, float:1.401E-42)
            r2 = 28
            if (r10 == 0) goto L129
            boolean r3 = r10.a()
            if (r3 == 0) goto L129
            boolean r1 = a(r12, r11)
            if (r1 != 0) goto Led
            r11 = r5
        Led:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r10 = a.a.a.i.i.a(r10, r11, r12, r13, r6)
            r1.append(r10)
            r1.append(r14)
            java.lang.String r10 = r1.toString()
            if (r10 == 0) goto L128
            int r13 = android.os.Build.VERSION.SDK_INT
            if (r13 <= r2) goto L10b
            java.lang.String r10 = com.baidu.location.Jni.f(r10)
            goto L11d
        L10b:
            java.lang.String r13 = com.baidu.location.Jni.f(r10)
            if (r13 == 0) goto L119
            int r14 = r13.length()
            if (r14 >= r0) goto L119
            r10 = r13
            goto L11d
        L119:
            java.lang.String r10 = com.baidu.location.Jni.b(r10)
        L11d:
            b(r10)
            a.a.a.b.y.s = r12
            a.a.a.b.y.r = r12
            if (r11 == 0) goto L128
            a.a.a.b.y.u = r11
        L128:
            return
        L129:
            java.lang.String r3 = "&cfr=3"
            java.lang.String r6 = "&cfr=2"
            java.lang.String r7 = "&cfr=1"
            if (r11 == 0) goto L1c5
            boolean r8 = r11.a()
            if (r8 == 0) goto L1c5
            boolean r8 = a(r12, r11)
            if (r8 == 0) goto L1c5
            boolean r1 = a(r12)
            if (r1 != 0) goto L15d
            a.a.a.g.f r1 = a.a.a.g.f.w()
            boolean r1 = r1.n()
            if (r1 != 0) goto L15d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
        L155:
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            goto L189
        L15d:
            boolean r1 = a(r12)
            if (r1 != 0) goto L176
            a.a.a.g.f r1 = a.a.a.g.f.w()
            boolean r1 = r1.n()
            if (r1 == 0) goto L176
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            goto L155
        L176:
            a.a.a.g.f r1 = a.a.a.g.f.w()
            boolean r1 = r1.n()
            if (r1 == 0) goto L189
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            goto L155
        L189:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r10 = a.a.a.i.i.a(r10, r11, r12, r13, r4)
            r1.append(r10)
            r1.append(r14)
            java.lang.String r10 = r1.toString()
            if (r10 == 0) goto L1c4
            int r13 = android.os.Build.VERSION.SDK_INT
            if (r13 <= r2) goto L1a7
            java.lang.String r10 = com.baidu.location.Jni.f(r10)
            goto L1b9
        L1a7:
            java.lang.String r13 = com.baidu.location.Jni.f(r10)
            if (r13 == 0) goto L1b5
            int r14 = r13.length()
            if (r14 >= r0) goto L1b5
            r10 = r13
            goto L1b9
        L1b5:
            java.lang.String r10 = com.baidu.location.Jni.b(r10)
        L1b9:
            d(r10)
            a.a.a.b.y.t = r12
            a.a.a.b.y.r = r12
            if (r11 == 0) goto L1c4
            a.a.a.b.y.u = r11
        L1c4:
            return
        L1c5:
            boolean r4 = a(r12)
            if (r4 != 0) goto L1e5
            a.a.a.g.f r4 = a.a.a.g.f.w()
            boolean r4 = r4.n()
            if (r4 != 0) goto L1e5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
        L1dd:
            r3.append(r13)
            java.lang.String r13 = r3.toString()
            goto L218
        L1e5:
            boolean r4 = a(r12)
            if (r4 != 0) goto L205
            a.a.a.g.f r4 = a.a.a.g.f.w()
            boolean r4 = r4.n()
            if (r4 == 0) goto L205
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r13)
            java.lang.String r13 = r4.toString()
            goto L218
        L205:
            a.a.a.g.f r3 = a.a.a.g.f.w()
            boolean r3 = r3.n()
            if (r3 == 0) goto L218
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r6)
            goto L1dd
        L218:
            boolean r3 = a(r12, r11)
            if (r3 != 0) goto L21f
            r11 = r5
        L21f:
            if (r10 != 0) goto L223
            if (r11 == 0) goto L25c
        L223:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r10 = a.a.a.i.i.a(r10, r11, r12, r13, r1)
            r3.append(r10)
            r3.append(r14)
            java.lang.String r10 = r3.toString()
            if (r10 == 0) goto L25c
            int r13 = android.os.Build.VERSION.SDK_INT
            if (r13 <= r2) goto L241
            java.lang.String r10 = com.baidu.location.Jni.f(r10)
            goto L253
        L241:
            java.lang.String r13 = com.baidu.location.Jni.f(r10)
            if (r13 == 0) goto L24f
            int r14 = r13.length()
            if (r14 >= r0) goto L24f
            r10 = r13
            goto L253
        L24f:
            java.lang.String r10 = com.baidu.location.Jni.b(r10)
        L253:
            c(r10)
            a.a.a.b.y.r = r12
            if (r11 == 0) goto L25c
            a.a.a.b.y.u = r11
        L25c:
            return
    }

    public static void a(java.lang.String r2) {
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L4a
            r0.<init>(r2)     // Catch: java.lang.Exception -> L4a
            boolean r2 = r0.exists()     // Catch: java.lang.Exception -> L4a
            if (r2 != 0) goto L4a
            java.io.File r2 = new java.io.File     // Catch: java.lang.Exception -> L4a
            java.lang.String r1 = a.a.a.i.h.f353a     // Catch: java.lang.Exception -> L4a
            r2.<init>(r1)     // Catch: java.lang.Exception -> L4a
            boolean r1 = r2.exists()     // Catch: java.lang.Exception -> L4a
            if (r1 != 0) goto L1b
            r2.mkdirs()     // Catch: java.lang.Exception -> L4a
        L1b:
            boolean r2 = r0.createNewFile()     // Catch: java.lang.Exception -> L4a
            if (r2 != 0) goto L22
            r0 = 0
        L22:
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> L4a
            java.lang.String r1 = "rw"
            r2.<init>(r0, r1)     // Catch: java.lang.Exception -> L4a
            r0 = 0
            r2.seek(r0)     // Catch: java.lang.Exception -> L4a
            r0 = 32
            r2.writeInt(r0)     // Catch: java.lang.Exception -> L4a
            r0 = 2048(0x800, float:2.87E-42)
            r2.writeInt(r0)     // Catch: java.lang.Exception -> L4a
            r0 = 5120(0x1400, float:7.175E-42)
            r2.writeInt(r0)     // Catch: java.lang.Exception -> L4a
            r0 = 0
            r2.writeInt(r0)     // Catch: java.lang.Exception -> L4a
            r2.writeInt(r0)     // Catch: java.lang.Exception -> L4a
            r2.writeInt(r0)     // Catch: java.lang.Exception -> L4a
            r2.close()     // Catch: java.lang.Exception -> L4a
        L4a:
            return
    }

    public static boolean a(int r0, int r1, int r2, int r3, long r4) {
            r4 = 0
            if (r0 < 0) goto L1b
            if (r0 < r2) goto L6
            goto L1b
        L6:
            if (r1 < 0) goto L1b
            if (r1 <= r2) goto Lb
            goto L1b
        Lb:
            if (r2 < 0) goto L1b
            r0 = 1024(0x400, float:1.435E-42)
            if (r2 <= r0) goto L12
            goto L1b
        L12:
            r1 = 128(0x80, float:1.8E-43)
            if (r3 < r1) goto L1b
            if (r3 <= r0) goto L19
            goto L1b
        L19:
            r0 = 1
            return r0
        L1b:
            return r4
    }

    public static boolean a(android.location.Location r9) {
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            android.location.Location r1 = a.a.a.b.y.s
            r2 = 1
            if (r1 == 0) goto L2e
            android.location.Location r3 = a.a.a.b.y.r
            if (r3 != 0) goto Le
            goto L2e
        Le:
            float r1 = r9.distanceTo(r1)
            double r3 = (double) r1
            float r1 = a.a.a.i.i.P
            double r5 = (double) r1
            double r5 = r5 * r3
            double r5 = r5 * r3
            float r1 = a.a.a.i.i.Q
            double r7 = (double) r1
            double r7 = r7 * r3
            double r5 = r5 + r7
            int r1 = a.a.a.i.i.R
            double r3 = (double) r1
            double r5 = r5 + r3
            android.location.Location r1 = a.a.a.b.y.r
            float r9 = r9.distanceTo(r1)
            double r3 = (double) r9
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 <= 0) goto L2d
            r0 = r2
        L2d:
            return r0
        L2e:
            a.a.a.b.y.s = r9
            return r2
    }

    public static boolean a(android.location.Location r2, a.a.a.g.k r3) {
            r0 = 0
            if (r2 == 0) goto L20
            if (r3 == 0) goto L20
            java.util.List<android.net.wifi.ScanResult> r1 = r3.f295a
            if (r1 == 0) goto L20
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L10
            goto L20
        L10:
            a.a.a.g.k r1 = a.a.a.b.y.u
            boolean r3 = r3.a(r1)
            if (r3 == 0) goto L19
            return r0
        L19:
            android.location.Location r3 = a.a.a.b.y.t
            r0 = 1
            if (r3 != 0) goto L20
            a.a.a.b.y.t = r2
        L20:
            return r0
    }

    public static boolean a(android.location.Location r1, boolean r2) {
            android.location.Location r0 = a.a.a.b.y.r
            boolean r1 = a.a.a.g.d.a(r0, r1, r2)
            return r1
    }

    public static boolean a(java.lang.String r10, java.util.List<java.lang.String> r11) {
            java.io.File r0 = new java.io.File
            r0.<init>(r10)
            boolean r10 = r0.exists()
            r1 = 0
            if (r10 != 0) goto Ld
            return r1
        Ld:
            java.io.RandomAccessFile r10 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> L6d
            java.lang.String r2 = "rw"
            r10.<init>(r0, r2)     // Catch: java.lang.Exception -> L6d
            r2 = 8
            r10.seek(r2)     // Catch: java.lang.Exception -> L6d
            int r0 = r10.readInt()     // Catch: java.lang.Exception -> L6d
            int r2 = r10.readInt()     // Catch: java.lang.Exception -> L6d
            int r3 = r10.readInt()     // Catch: java.lang.Exception -> L6d
            int r4 = a.a.a.b.y.n     // Catch: java.lang.Exception -> L6d
            byte[] r4 = new byte[r4]     // Catch: java.lang.Exception -> L6d
            int r5 = a.a.a.b.y.l     // Catch: java.lang.Exception -> L6d
            r6 = 1
            int r5 = r5 + r6
            r7 = r1
        L2e:
            if (r5 <= 0) goto L5d
            if (r2 <= 0) goto L5d
            if (r2 >= r3) goto L35
            r3 = r1
        L35:
            int r8 = r2 + (-1)
            int r8 = r8 * r0
            int r8 = r8 + 128
            long r8 = (long) r8
            r10.seek(r8)     // Catch: java.lang.Exception -> L6c
            int r8 = r10.readInt()     // Catch: java.lang.Exception -> L6c
            if (r8 <= 0) goto L58
            if (r8 >= r0) goto L58
            r10.read(r4, r1, r8)     // Catch: java.lang.Exception -> L6c
            int r8 = r8 + (-1)
            r9 = r4[r8]     // Catch: java.lang.Exception -> L6c
            if (r9 != 0) goto L58
            java.lang.String r9 = new java.lang.String     // Catch: java.lang.Exception -> L6c
            r9.<init>(r4, r1, r8)     // Catch: java.lang.Exception -> L6c
            r11.add(r1, r9)     // Catch: java.lang.Exception -> L6c
            r7 = r6
        L58:
            int r5 = r5 + (-1)
            int r2 = r2 + (-1)
            goto L2e
        L5d:
            r0 = 12
            r10.seek(r0)     // Catch: java.lang.Exception -> L6c
            r10.writeInt(r2)     // Catch: java.lang.Exception -> L6c
            r10.writeInt(r3)     // Catch: java.lang.Exception -> L6c
            r10.close()     // Catch: java.lang.Exception -> L6c
            return r7
        L6c:
            r1 = r7
        L6d:
            return r1
    }

    public static void b() {
            r0 = 0
            a.a.a.b.y.l = r0
            r1 = 1
            a(r1, r0)
            r1 = 2
            a(r1, r0)
            r1 = 3
            a(r1, r0)
            r0 = 8
            a.a.a.b.y.l = r0
            return
    }

    public static void b(java.lang.String r0) {
            e(r0)
            return
    }

    public static synchronized a.a.a.b.y c() {
            java.lang.Class<a.a.a.b.y> r0 = a.a.a.b.y.class
            monitor-enter(r0)
            a.a.a.b.y r1 = a.a.a.b.y.v     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto Le
            a.a.a.b.y r1 = new a.a.a.b.y     // Catch: java.lang.Throwable -> L12
            r1.<init>()     // Catch: java.lang.Throwable -> L12
            a.a.a.b.y.v = r1     // Catch: java.lang.Throwable -> L12
        Le:
            a.a.a.b.y r1 = a.a.a.b.y.v     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)
            return r1
        L12:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public static void c(java.lang.String r0) {
            e(r0)
            return
    }

    public static java.lang.String d() {
            java.lang.String r0 = a.a.a.b.y.g
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r0 = r1.exists()
            r2 = 0
            java.lang.String r3 = "rw"
            r4 = 20
            r6 = 0
            if (r0 == 0) goto L43
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> L43
            r0.<init>(r1, r3)     // Catch: java.lang.Exception -> L43
            r0.seek(r4)     // Catch: java.lang.Exception -> L43
            int r1 = r0.readInt()     // Catch: java.lang.Exception -> L43
            r7 = 128(0x80, float:1.8E-43)
            if (r1 <= r7) goto L40
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L43
            r7.<init>()     // Catch: java.lang.Exception -> L43
            java.lang.String r8 = "&p1="
            r7.append(r8)     // Catch: java.lang.Exception -> L43
            r7.append(r1)     // Catch: java.lang.Exception -> L43
            java.lang.String r1 = r7.toString()     // Catch: java.lang.Exception -> L43
            r0.seek(r4)     // Catch: java.lang.Exception -> L3e
            r0.writeInt(r2)     // Catch: java.lang.Exception -> L3e
            r0.close()     // Catch: java.lang.Exception -> L3e
            return r1
        L3e:
            r6 = r1
            goto L43
        L40:
            r0.close()     // Catch: java.lang.Exception -> L43
        L43:
            java.lang.String r0 = a.a.a.b.y.h
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L80
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> L80
            r0.<init>(r1, r3)     // Catch: java.lang.Exception -> L80
            r0.seek(r4)     // Catch: java.lang.Exception -> L80
            int r1 = r0.readInt()     // Catch: java.lang.Exception -> L80
            r7 = 256(0x100, float:3.59E-43)
            if (r1 <= r7) goto L7d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L80
            r7.<init>()     // Catch: java.lang.Exception -> L80
            java.lang.String r8 = "&p2="
            r7.append(r8)     // Catch: java.lang.Exception -> L80
            r7.append(r1)     // Catch: java.lang.Exception -> L80
            java.lang.String r1 = r7.toString()     // Catch: java.lang.Exception -> L80
            r0.seek(r4)     // Catch: java.lang.Exception -> L7b
            r0.writeInt(r2)     // Catch: java.lang.Exception -> L7b
            r0.close()     // Catch: java.lang.Exception -> L7b
            return r1
        L7b:
            r6 = r1
            goto L80
        L7d:
            r0.close()     // Catch: java.lang.Exception -> L80
        L80:
            java.lang.String r0 = a.a.a.b.y.i
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto Lbd
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> Lbd
            r0.<init>(r1, r3)     // Catch: java.lang.Exception -> Lbd
            r0.seek(r4)     // Catch: java.lang.Exception -> Lbd
            int r1 = r0.readInt()     // Catch: java.lang.Exception -> Lbd
            r3 = 512(0x200, float:7.17E-43)
            if (r1 <= r3) goto Lba
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lbd
            r3.<init>()     // Catch: java.lang.Exception -> Lbd
            java.lang.String r7 = "&p3="
            r3.append(r7)     // Catch: java.lang.Exception -> Lbd
            r3.append(r1)     // Catch: java.lang.Exception -> Lbd
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Exception -> Lbd
            r0.seek(r4)     // Catch: java.lang.Exception -> Lb8
            r0.writeInt(r2)     // Catch: java.lang.Exception -> Lb8
            r0.close()     // Catch: java.lang.Exception -> Lb8
            return r1
        Lb8:
            r6 = r1
            goto Lbd
        Lba:
            r0.close()     // Catch: java.lang.Exception -> Lbd
        Lbd:
            return r6
    }

    public static void d(java.lang.String r0) {
            e(r0)
            return
    }

    public static java.lang.String e() {
            r0 = 1
            r1 = 0
        L2:
            r2 = 5
            if (r0 >= r2) goto Lf
            java.lang.String r1 = a(r0)
            if (r1 == 0) goto Lc
            return r1
        Lc:
            int r0 = r0 + 1
            goto L2
        Lf:
            java.util.ArrayList<java.lang.String> r0 = a.a.a.b.y.d
            int r2 = a.a.a.b.y.p
            a(r0, r2)
            r0 = 0
            java.util.ArrayList<java.lang.String> r2 = a.a.a.b.y.d     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2d
            int r2 = r2.size()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2d
            if (r2 <= 0) goto L2d
            java.util.ArrayList<java.lang.String> r2 = a.a.a.b.y.d     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2d
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2d
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2d
            java.util.ArrayList<java.lang.String> r1 = a.a.a.b.y.d     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2c
            r1.remove(r0)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2c
        L2c:
            r1 = r2
        L2d:
            if (r1 == 0) goto L30
            return r1
        L30:
            java.util.ArrayList<java.lang.String> r2 = a.a.a.b.y.d
            int r3 = a.a.a.b.y.o
            a(r2, r3)
            java.util.ArrayList<java.lang.String> r2 = a.a.a.b.y.d     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L4d
            int r2 = r2.size()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L4d
            if (r2 <= 0) goto L4d
            java.util.ArrayList<java.lang.String> r2 = a.a.a.b.y.d     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L4d
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L4d
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L4d
            java.util.ArrayList<java.lang.String> r1 = a.a.a.b.y.d     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L4c
            r1.remove(r0)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L4c
        L4c:
            r1 = r2
        L4d:
            if (r1 == 0) goto L50
            return r1
        L50:
            java.util.ArrayList<java.lang.String> r2 = a.a.a.b.y.d
            int r3 = a.a.a.b.y.q
            a(r2, r3)
            java.util.ArrayList<java.lang.String> r2 = a.a.a.b.y.d     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6d
            int r2 = r2.size()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6d
            if (r2 <= 0) goto L6d
            java.util.ArrayList<java.lang.String> r2 = a.a.a.b.y.d     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6d
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6d
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6d
            java.util.ArrayList<java.lang.String> r1 = a.a.a.b.y.d     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6c
            r1.remove(r0)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6c
        L6c:
            r1 = r2
        L6d:
            return r1
    }

    public static synchronized void e(java.lang.String r5) {
            java.lang.Class<a.a.a.b.y> r0 = a.a.a.b.y.class
            monitor-enter(r0)
            java.lang.String r1 = "err!"
            boolean r1 = r5.contains(r1)     // Catch: java.lang.Throwable -> L4b
            if (r1 == 0) goto Ld
            monitor-exit(r0)
            return
        Ld:
            int r1 = a.a.a.i.i.n     // Catch: java.lang.Throwable -> L4b
            r2 = 1
            if (r1 != r2) goto L15
            java.util.ArrayList<java.lang.String> r2 = a.a.a.b.y.f93b     // Catch: java.lang.Throwable -> L4b
            goto L20
        L15:
            r2 = 2
            if (r1 != r2) goto L1b
            java.util.ArrayList<java.lang.String> r2 = a.a.a.b.y.f94c     // Catch: java.lang.Throwable -> L4b
            goto L20
        L1b:
            r2 = 3
            if (r1 != r2) goto L49
            java.util.ArrayList<java.lang.String> r2 = a.a.a.b.y.d     // Catch: java.lang.Throwable -> L4b
        L20:
            if (r2 != 0) goto L24
            monitor-exit(r0)
            return
        L24:
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L4b
            int r4 = a.a.a.b.y.m     // Catch: java.lang.Throwable -> L4b
            if (r3 > r4) goto L2f
            r2.add(r5)     // Catch: java.lang.Throwable -> L4b
        L2f:
            int r5 = r2.size()     // Catch: java.lang.Throwable -> L4b
            int r3 = a.a.a.b.y.m     // Catch: java.lang.Throwable -> L4b
            r4 = 0
            if (r5 < r3) goto L3b
            a(r1, r4)     // Catch: java.lang.Throwable -> L4b
        L3b:
            int r5 = r2.size()     // Catch: java.lang.Throwable -> L4b
            int r1 = a.a.a.b.y.m     // Catch: java.lang.Throwable -> L4b
            if (r5 <= r1) goto L47
            r2.remove(r4)     // Catch: java.lang.Throwable -> L4b
            goto L3b
        L47:
            monitor-exit(r0)
            return
        L49:
            monitor-exit(r0)
            return
        L4b:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
    }

    public static java.lang.String f() {
            java.lang.String r0 = e()
            return r0
    }

    public void a() {
            r1 = this;
            a.a.a.g.f r0 = a.a.a.g.f.w()
            boolean r0 = r0.p()
            if (r0 != 0) goto Lb
            return
        Lb:
            boolean r0 = a.a.a.i.i.l()
            if (r0 != 0) goto L16
            a.a.a.b.y$a r1 = r1.f95a
            r1.b()
        L16:
            return
    }
}
