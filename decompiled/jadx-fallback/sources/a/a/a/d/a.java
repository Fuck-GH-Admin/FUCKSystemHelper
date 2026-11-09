package a.a.a.d;

/* JADX INFO: loaded from: classes.dex */
public class a extends a.a.a.i.g {
    public static java.util.HashMap<java.lang.String, java.lang.Long> s;
    public java.lang.String i;
    public final java.text.SimpleDateFormat j;
    public android.content.Context k;
    public boolean l;
    public java.lang.String m;
    public java.util.HashSet<java.lang.String> n;
    public a.a.a.d.a.b o;
    public java.lang.String p;
    public android.os.Handler q;
    public java.lang.Runnable r;

    /* JADX INFO: renamed from: a.a.a.d.a$a, reason: collision with other inner class name */
    public class RunnableC0005a implements java.lang.Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.a.a.d.a f124b;

        public RunnableC0005a(a.a.a.d.a r1) {
                r0 = this;
                r0.f124b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                a.a.a.d.a r0 = r2.f124b
                java.lang.String r0 = a.a.a.d.a.a(r0)
                if (r0 == 0) goto L2c
                a.a.a.d.a r0 = r2.f124b
                java.lang.String r1 = a.a.a.d.a.a(r0)
                a.a.a.d.a.a(r0, r1)
                a.a.a.b.w r0 = a.a.a.b.w.d()
                java.util.concurrent.ExecutorService r0 = r0.b()
                a.a.a.d.a r2 = r2.f124b
                if (r0 == 0) goto L25
                java.lang.String r1 = a.a.a.d.a.b(r2)
                r2.a(r0, r1)
                goto L2c
            L25:
                java.lang.String r0 = a.a.a.d.a.b(r2)
                r2.a(r0)
            L2c:
                return
        }
    }

    public interface b {
        void a(boolean r1);
    }

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            a.a.a.d.a.s = r0
            return
    }

    public a(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "https://loc.map.baidu.com/indoorlocbuildinginfo.php"
            r2.i = r0
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyyMM"
            r0.<init>(r1)
            r2.j = r0
            r0 = 0
            r2.p = r0
            r2.k = r3
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r2.n = r3
            r3 = 0
            r2.l = r3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r2.d = r3
            android.os.Handler r3 = new android.os.Handler
            r3.<init>()
            r2.q = r3
            a.a.a.d.a$a r3 = new a.a.a.d.a$a
            r3.<init>(r2)
            r2.r = r3
            return
    }

    public static /* synthetic */ java.lang.String a(a.a.a.d.a r0) {
            java.lang.String r0 = r0.p
            return r0
    }

    public static /* synthetic */ java.lang.String a(a.a.a.d.a r0, java.lang.String r1) {
            r0.m = r1
            return r1
    }

    public static /* synthetic */ java.lang.String b(a.a.a.d.a r0) {
            java.lang.String r0 = r0.i
            return r0
    }

    public final java.lang.String a(java.util.Date r6) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r5.m
            r0.append(r1)
            java.text.SimpleDateFormat r1 = r5.j
            java.lang.String r6 = r1.format(r6)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            byte[] r6 = r6.getBytes()
            r0 = 0
            java.lang.String r6 = a.a.a.i.i.a(r6, r0)
            java.io.File r1 = new java.io.File
            android.content.Context r5 = r5.k
            java.io.File r5 = r5.getCacheDir()
            r1.<init>(r5, r6)
            boolean r5 = r1.isFile()
            r6 = 0
            if (r5 != 0) goto L33
            return r6
        L33:
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L72
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.lang.Exception -> L72
            r2.<init>(r1)     // Catch: java.lang.Exception -> L72
            r5.<init>(r2)     // Catch: java.lang.Exception -> L72
            java.lang.String r1 = ""
            r2 = r1
        L40:
            java.lang.String r3 = r5.readLine()     // Catch: java.lang.Exception -> L72
            if (r3 == 0) goto L5b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L72
            r4.<init>()     // Catch: java.lang.Exception -> L72
            r4.append(r2)     // Catch: java.lang.Exception -> L72
            r4.append(r3)     // Catch: java.lang.Exception -> L72
            java.lang.String r2 = "\n"
            r4.append(r2)     // Catch: java.lang.Exception -> L72
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Exception -> L72
            goto L40
        L5b:
            r5.close()     // Catch: java.lang.Exception -> L72
            boolean r5 = r2.equals(r1)     // Catch: java.lang.Exception -> L72
            if (r5 != 0) goto L72
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Exception -> L72
            byte[] r1 = r2.getBytes()     // Catch: java.lang.Exception -> L72
            byte[] r0 = android.util.Base64.decode(r1, r0)     // Catch: java.lang.Exception -> L72
            r5.<init>(r0)     // Catch: java.lang.Exception -> L72
            return r5
        L72:
            return r6
    }

    @Override // a.a.a.i.g
    public void a() {
            r3 = this;
            java.lang.String r0 = r3.i
            r3.f337a = r0
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.d
            r0.clear()
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.d
            java.lang.String r1 = "bid"
            java.lang.String r2 = "none"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.d
            java.lang.String r1 = r3.m
            java.lang.String r2 = "bldg"
            r0.put(r2, r1)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.d
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r2 = "mb"
            r0.put(r2, r1)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.d
            java.lang.String r1 = "msdk"
            java.lang.String r2 = "2.0"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.d
            a.a.a.i.b r1 = a.a.a.i.b.e()
            java.lang.String r1 = r1.f321c
            java.lang.String r2 = "cuid"
            r0.put(r2, r1)
            java.util.Map<java.lang.String, java.lang.Object> r3 = r3.d
            java.lang.String r0 = "anchors"
            java.lang.String r1 = "v1"
            r3.put(r0, r1)
            return
    }

    @Override // a.a.a.i.g
    public void a(boolean r6) {
            r5 = this;
            java.lang.String r0 = "anchorinfo"
            r1 = 1
            r2 = 0
            if (r6 == 0) goto L40
            java.lang.String r6 = r5.f339c
            if (r6 == 0) goto L40
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Exception -> L40
            byte[] r6 = r6.getBytes()     // Catch: java.lang.Exception -> L40
            byte[] r6 = android.util.Base64.decode(r6, r2)     // Catch: java.lang.Exception -> L40
            r3.<init>(r6)     // Catch: java.lang.Exception -> L40
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Exception -> L40
            r6.<init>(r3)     // Catch: java.lang.Exception -> L40
            boolean r3 = r6.has(r0)     // Catch: java.lang.Exception -> L40
            if (r3 == 0) goto L40
            java.lang.String r6 = r6.optString(r0)     // Catch: java.lang.Exception -> L40
            if (r6 == 0) goto L40
            java.lang.String r0 = ""
            boolean r0 = r6.equals(r0)     // Catch: java.lang.Exception -> L40
            if (r0 != 0) goto L40
            java.util.HashSet<java.lang.String> r0 = r5.n     // Catch: java.lang.Exception -> L40
            r0.clear()     // Catch: java.lang.Exception -> L40
            r5.e(r6)     // Catch: java.lang.Exception -> L40
            r5.f(r6)     // Catch: java.lang.Exception -> L40
            r5.c()     // Catch: java.lang.Exception -> L3e
        L3e:
            r6 = r1
            goto L41
        L40:
            r6 = r2
        L41:
            if (r6 != 0) goto L56
            java.lang.String r0 = r5.p
            if (r0 != 0) goto L56
            java.lang.String r0 = r5.m
            r5.p = r0
            android.os.Handler r0 = r5.q
            java.lang.Runnable r1 = r5.r
            r3 = 60000(0xea60, double:2.9644E-319)
            r0.postDelayed(r1, r3)
            goto L77
        L56:
            r0 = 0
            if (r6 == 0) goto L5c
            r5.p = r0
            goto L77
        L5c:
            java.lang.String r3 = r5.p
            r5.g(r3)
            r5.p = r0
            java.util.Date r0 = r5.d()
            java.lang.String r0 = r5.a(r0)
            if (r0 == 0) goto L77
            r5.e(r0)
            a.a.a.d.a$b r0 = r5.o
            if (r0 == 0) goto L77
            r0.a(r1)
        L77:
            r5.l = r2
            a.a.a.d.a$b r5 = r5.o
            if (r5 == 0) goto L80
            r5.a(r6)
        L80:
            return
    }

    public boolean a(java.lang.String r9, a.a.a.d.a.b r10) {
            r8 = this;
            boolean r0 = r8.l
            r1 = 0
            if (r0 != 0) goto L66
            r8.o = r10
            r10 = 1
            r8.l = r10
            r8.m = r9
            java.util.Date r0 = new java.util.Date     // Catch: java.lang.Exception -> L64
            r0.<init>()     // Catch: java.lang.Exception -> L64
            java.lang.String r0 = r8.a(r0)     // Catch: java.lang.Exception -> L64
            if (r0 != 0) goto L57
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L64
            java.util.HashMap<java.lang.String, java.lang.Long> r10 = a.a.a.d.a.s     // Catch: java.lang.Exception -> L64
            java.lang.Object r10 = r10.get(r9)     // Catch: java.lang.Exception -> L64
            if (r10 == 0) goto L38
            java.util.HashMap<java.lang.String, java.lang.Long> r10 = a.a.a.d.a.s     // Catch: java.lang.Exception -> L64
            java.lang.Object r10 = r10.get(r9)     // Catch: java.lang.Exception -> L64
            java.lang.Long r10 = (java.lang.Long) r10     // Catch: java.lang.Exception -> L64
            long r4 = r10.longValue()     // Catch: java.lang.Exception -> L64
            long r4 = r2 - r4
            r6 = 86400000(0x5265c00, double:4.2687272E-316)
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 <= 0) goto L66
        L38:
            java.util.HashMap<java.lang.String, java.lang.Long> r10 = a.a.a.d.a.s     // Catch: java.lang.Exception -> L64
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Exception -> L64
            r10.put(r9, r0)     // Catch: java.lang.Exception -> L64
            a.a.a.b.w r9 = a.a.a.b.w.d()     // Catch: java.lang.Exception -> L64
            java.util.concurrent.ExecutorService r9 = r9.b()     // Catch: java.lang.Exception -> L64
            if (r9 == 0) goto L51
            java.lang.String r10 = r8.i     // Catch: java.lang.Exception -> L64
            r8.a(r9, r10)     // Catch: java.lang.Exception -> L64
            goto L66
        L51:
            java.lang.String r9 = r8.i     // Catch: java.lang.Exception -> L64
            r8.a(r9)     // Catch: java.lang.Exception -> L64
            goto L66
        L57:
            r8.e(r0)     // Catch: java.lang.Exception -> L64
            a.a.a.d.a$b r9 = r8.o     // Catch: java.lang.Exception -> L64
            if (r9 == 0) goto L61
            r9.a(r10)     // Catch: java.lang.Exception -> L64
        L61:
            r8.l = r1     // Catch: java.lang.Exception -> L64
            goto L66
        L64:
            r8.l = r1
        L66:
            return r1
    }

    public void b() {
            r1 = this;
            r0 = 0
            r1.m = r0
            java.util.HashSet<java.lang.String> r1 = r1.n
            r1.clear()
            return
    }

    public final void c() {
            r3 = this;
            java.util.Date r0 = r3.d()     // Catch: java.lang.Exception -> L39
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L39
            r1.<init>()     // Catch: java.lang.Exception -> L39
            java.lang.String r2 = r3.m     // Catch: java.lang.Exception -> L39
            r1.append(r2)     // Catch: java.lang.Exception -> L39
            java.text.SimpleDateFormat r2 = r3.j     // Catch: java.lang.Exception -> L39
            java.lang.String r0 = r2.format(r0)     // Catch: java.lang.Exception -> L39
            r1.append(r0)     // Catch: java.lang.Exception -> L39
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> L39
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Exception -> L39
            r1 = 0
            java.lang.String r0 = a.a.a.i.i.a(r0, r1)     // Catch: java.lang.Exception -> L39
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L39
            android.content.Context r3 = r3.k     // Catch: java.lang.Exception -> L39
            java.io.File r3 = r3.getCacheDir()     // Catch: java.lang.Exception -> L39
            r1.<init>(r3, r0)     // Catch: java.lang.Exception -> L39
            boolean r3 = r1.isFile()     // Catch: java.lang.Exception -> L39
            if (r3 != 0) goto L36
            return
        L36:
            r1.delete()     // Catch: java.lang.Exception -> L39
        L39:
            return
    }

    public boolean c(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = r1.m
            if (r0 == 0) goto L15
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 == 0) goto L15
            java.util.HashSet<java.lang.String> r1 = r1.n
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L13
            goto L15
        L13:
            r1 = 1
            return r1
        L15:
            r1 = 0
            return r1
    }

    public final java.util.Date d() {
            r2 = this;
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            r0 = 2
            r1 = -1
            r2.add(r0, r1)
            java.util.Date r2 = r2.getTime()
            return r2
    }

    public boolean d(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = r2.m
            r1 = 0
            if (r0 == 0) goto L1a
            java.util.HashSet<java.lang.String> r0 = r2.n
            if (r0 == 0) goto L1a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L10
            goto L1a
        L10:
            java.util.HashSet<java.lang.String> r2 = r2.n
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L1a
            r2 = 1
            return r2
        L1a:
            return r1
    }

    public final void e(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = ","
            java.lang.String[] r5 = r5.split(r0)
            int r0 = r5.length
            r1 = 0
        L8:
            if (r1 >= r0) goto L18
            r2 = r5[r1]
            java.util.HashSet<java.lang.String> r3 = r4.n
            java.lang.String r2 = r2.toLowerCase()
            r3.add(r2)
            int r1 = r1 + 1
            goto L8
        L18:
            return
    }

    public boolean e() {
            r0 = this;
            java.util.HashSet<java.lang.String> r0 = r0.n
            if (r0 == 0) goto Lc
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public final void f(java.lang.String r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.m
            r0.append(r1)
            java.text.SimpleDateFormat r1 = r3.j
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            java.lang.String r1 = r1.format(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            byte[] r0 = r0.getBytes()
            r1 = 0
            java.lang.String r0 = a.a.a.i.i.a(r0, r1)
            java.io.File r2 = new java.io.File
            android.content.Context r3 = r3.k
            java.io.File r3 = r3.getCacheDir()
            r2.<init>(r3, r0)
            java.io.FileWriter r3 = new java.io.FileWriter     // Catch: java.io.IOException -> L4d
            r3.<init>(r2)     // Catch: java.io.IOException -> L4d
            java.lang.String r0 = new java.lang.String     // Catch: java.io.IOException -> L4d
            byte[] r4 = r4.getBytes()     // Catch: java.io.IOException -> L4d
            byte[] r4 = android.util.Base64.encode(r4, r1)     // Catch: java.io.IOException -> L4d
            java.lang.String r1 = "UTF-8"
            r0.<init>(r4, r1)     // Catch: java.io.IOException -> L4d
            r3.write(r0)     // Catch: java.io.IOException -> L4d
            r3.flush()     // Catch: java.io.IOException -> L4d
            r3.close()     // Catch: java.io.IOException -> L4d
        L4d:
            return
    }

    public final void g(java.lang.String r3) {
            r2 = this;
            java.io.File r0 = new java.io.File
            android.content.Context r2 = r2.k
            java.io.File r2 = r2.getCacheDir()
            java.lang.String r1 = "buildings"
            r0.<init>(r2, r1)
            java.io.FileWriter r2 = new java.io.FileWriter     // Catch: java.io.IOException -> L2e
            r1 = 1
            r2.<init>(r0, r1)     // Catch: java.io.IOException -> L2e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L2e
            r0.<init>()     // Catch: java.io.IOException -> L2e
            r0.append(r3)     // Catch: java.io.IOException -> L2e
            java.lang.String r3 = "\n"
            r0.append(r3)     // Catch: java.io.IOException -> L2e
            java.lang.String r3 = r0.toString()     // Catch: java.io.IOException -> L2e
            r2.write(r3)     // Catch: java.io.IOException -> L2e
            r2.flush()     // Catch: java.io.IOException -> L2e
            r2.close()     // Catch: java.io.IOException -> L2e
            goto L32
        L2e:
            r2 = move-exception
            r2.printStackTrace()
        L32:
            return
    }
}
