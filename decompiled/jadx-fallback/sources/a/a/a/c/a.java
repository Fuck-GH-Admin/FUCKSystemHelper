package a.a.a.c;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public static java.lang.Object g;
    public static a.a.a.c.a h;
    public static final java.lang.String i = null;
    public static java.util.concurrent.locks.Lock j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public android.database.sqlite.SQLiteDatabase f100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a.a.a.c.a.C0003a f102c;
    public java.lang.String d;
    public double e;
    public double f;

    /* JADX INFO: renamed from: a.a.a.c.a$a, reason: collision with other inner class name */
    public class C0003a extends a.a.a.i.g {
        public int i;
        public int j;
        public int k;
        public int l;
        public final /* synthetic */ a.a.a.c.a m;

        public C0003a(a.a.a.c.a r1) {
                r0 = this;
                r0.m = r1
                r0.<init>()
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                r0.d = r1
                return
        }

        @Override // a.a.a.i.g
        public void a() {
                r5 = this;
                java.lang.String r0 = "https://loc.map.baidu.com/gpsz"
                r5.f337a = r0
                java.util.Locale r0 = java.util.Locale.CHINESE
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                int r2 = r5.i
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3 = 0
                r1[r3] = r2
                int r2 = r5.j
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r4 = 1
                r1[r4] = r2
                a.a.a.i.b r2 = a.a.a.i.b.e()
                java.lang.String r2 = r2.a()
                r4 = 2
                r1[r4] = r2
                java.lang.String r2 = "&is_vdr=1&x=%d&y=%d%s"
                java.lang.String r0 = java.lang.String.format(r0, r2, r1)
                java.lang.String r1 = com.baidu.location.Jni.b(r0)
                java.lang.String r2 = "err!"
                boolean r2 = r1.contains(r2)
                if (r2 == 0) goto L4f
                java.lang.String r1 = new java.lang.String     // Catch: java.lang.Exception -> L48
                byte[] r0 = r0.getBytes()     // Catch: java.lang.Exception -> L48
                byte[] r0 = android.util.Base64.encode(r0, r3)     // Catch: java.lang.Exception -> L48
                java.lang.String r2 = "UTF-8"
                r1.<init>(r0, r2)     // Catch: java.lang.Exception -> L48
                goto L4a
            L48:
                java.lang.String r1 = "err2!"
            L4a:
                java.util.Map<java.lang.String, java.lang.Object> r5 = r5.d
                java.lang.String r0 = "gpszb"
                goto L53
            L4f:
                java.util.Map<java.lang.String, java.lang.Object> r5 = r5.d
                java.lang.String r0 = "gpsz"
            L53:
                r5.put(r0, r1)
                return
        }

        public void a(double r5, double r7, double r9) {
                r4 = this;
                a.a.a.c.a r9 = r4.m
                boolean r9 = a.a.a.c.a.b(r9)
                if (r9 == 0) goto L9
                return
            L9:
                java.lang.String r9 = "gcj2wgs"
                double[] r9 = com.baidu.location.Jni.a(r5, r7, r9)
                r10 = 0
                r0 = r9[r10]
                r2 = 4636737291354636288(0x4059000000000000, double:100.0)
                double r0 = r0 * r2
                double r0 = java.lang.Math.floor(r0)
                int r10 = (int) r0
                r4.i = r10
                r10 = 1
                r0 = r9[r10]
                double r0 = r0 * r2
                double r0 = java.lang.Math.floor(r0)
                int r9 = (int) r0
                r4.j = r9
                double r5 = r5 * r2
                double r5 = java.lang.Math.floor(r5)
                int r5 = (int) r5
                r4.k = r5
                double r7 = r7 * r2
                double r5 = java.lang.Math.floor(r7)
                int r5 = (int) r5
                r4.l = r5
                a.a.a.c.a r5 = r4.m
                a.a.a.c.a.a(r5, r10)
                boolean r5 = a.a.a.i.i.l()
                if (r5 != 0) goto L55
                a.a.a.b.w r5 = a.a.a.b.w.d()
                java.util.concurrent.ExecutorService r5 = r5.b()
                java.lang.String r6 = "https://loc.map.baidu.com/gpsz"
                if (r5 == 0) goto L52
                r4.a(r5, r6)
                goto L55
            L52:
                r4.a(r6)
            L55:
                return
        }

        @Override // a.a.a.i.g
        public void a(boolean r30) {
                r29 = this;
                r0 = r29
                java.lang.String r1 = "galdata_new"
                java.lang.String r2 = "locStateData"
                java.lang.String r3 = ":"
                java.lang.String r4 = "info"
                java.lang.String r5 = "height"
                if (r30 == 0) goto L238
                java.lang.String r7 = r0.f339c
                if (r7 == 0) goto L238
                java.util.concurrent.locks.Lock r7 = a.a.a.c.a.c()
                r7.lock()
                org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Exception -> L231
                java.lang.String r8 = r0.f339c     // Catch: java.lang.Exception -> L231
                r7.<init>(r8)     // Catch: java.lang.Exception -> L231
                boolean r8 = r7.has(r5)     // Catch: java.lang.Exception -> L231
                java.lang.String r9 = "id"
                java.lang.String r10 = "\""
                java.lang.String r11 = "id = \""
                java.lang.String r12 = "%d,%d"
                java.lang.String r13 = "E"
                java.lang.String r15 = ","
                r14 = 2
                r16 = 1
                if (r8 == 0) goto L155
                java.lang.String r5 = r7.getString(r5)     // Catch: java.lang.Exception -> L231
                boolean r8 = r5.contains(r15)     // Catch: java.lang.Exception -> L231
                if (r8 == 0) goto L155
                java.lang.String r5 = r5.trim()     // Catch: java.lang.Exception -> L231
                java.lang.String[] r5 = r5.split(r15)     // Catch: java.lang.Exception -> L231
                int r8 = r5.length     // Catch: java.lang.Exception -> L231
                r18 = r7
                double r6 = (double) r8     // Catch: java.lang.Exception -> L231
                double r6 = java.lang.Math.sqrt(r6)     // Catch: java.lang.Exception -> L231
                int r6 = (int) r6     // Catch: java.lang.Exception -> L231
                int r7 = r6 * r6
                if (r7 != r8) goto L150
                int r7 = r0.k     // Catch: java.lang.Exception -> L231
                int r8 = r6 + (-1)
                int r19 = r8 / 2
                int r7 = r7 - r19
                r19 = r2
                int r2 = r0.l     // Catch: java.lang.Exception -> L231
                int r8 = r8 / r14
                int r2 = r2 - r8
                r8 = 0
            L63:
                if (r8 >= r6) goto L152
                r14 = 0
            L66:
                if (r14 >= r6) goto L13f
                r21 = r15
                android.content.ContentValues r15 = new android.content.ContentValues     // Catch: java.lang.Exception -> L231
                r15.<init>()     // Catch: java.lang.Exception -> L231
                int r22 = r8 * r6
                int r22 = r22 + r14
                r23 = r6
                r6 = r5[r22]     // Catch: java.lang.Exception -> L231
                boolean r6 = r6.contains(r13)     // Catch: java.lang.Exception -> L231
                r24 = r13
                java.lang.String r13 = "sigma"
                r25 = r4
                java.lang.String r4 = "aldata"
                r26 = 4666723172467343360(0x40c3880000000000, double:10000.0)
                if (r6 == 0) goto L9a
                java.lang.Double r6 = java.lang.Double.valueOf(r26)     // Catch: java.lang.Exception -> L231
                r15.put(r4, r6)     // Catch: java.lang.Exception -> L231
            L91:
                java.lang.Double r4 = java.lang.Double.valueOf(r26)     // Catch: java.lang.Exception -> L231
                r22 = r3
                r28 = r5
                goto Ld5
            L9a:
                r6 = r5[r22]     // Catch: java.lang.Exception -> L231
                boolean r6 = r6.contains(r3)     // Catch: java.lang.Exception -> L231
                if (r6 != 0) goto Lac
                r6 = r5[r22]     // Catch: java.lang.Exception -> L231
                java.lang.Double r6 = java.lang.Double.valueOf(r6)     // Catch: java.lang.Exception -> L231
                r15.put(r4, r6)     // Catch: java.lang.Exception -> L231
                goto L91
            Lac:
                r6 = r5[r22]     // Catch: java.lang.Exception -> L231
                java.lang.String[] r6 = r6.split(r3)     // Catch: java.lang.Exception -> L231
                r22 = r3
                int r3 = r6.length     // Catch: java.lang.Exception -> L231
                r28 = r5
                r5 = 2
                if (r3 != r5) goto Lca
                r3 = 0
                r5 = r6[r3]     // Catch: java.lang.Exception -> L231
                java.lang.Double r3 = java.lang.Double.valueOf(r5)     // Catch: java.lang.Exception -> L231
                r15.put(r4, r3)     // Catch: java.lang.Exception -> L231
                r3 = r6[r16]     // Catch: java.lang.Exception -> L231
                r15.put(r13, r3)     // Catch: java.lang.Exception -> L231
                goto Ld8
            Lca:
                java.lang.Double r3 = java.lang.Double.valueOf(r26)     // Catch: java.lang.Exception -> L231
                r15.put(r4, r3)     // Catch: java.lang.Exception -> L231
                java.lang.Double r4 = java.lang.Double.valueOf(r26)     // Catch: java.lang.Exception -> L231
            Ld5:
                r15.put(r13, r4)     // Catch: java.lang.Exception -> L231
            Ld8:
                java.lang.String r3 = "tt"
                long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L231
                r26 = 1000(0x3e8, double:4.94E-321)
                long r4 = r4 / r26
                int r4 = (int) r4     // Catch: java.lang.Exception -> L231
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L231
                r15.put(r3, r4)     // Catch: java.lang.Exception -> L231
                int r3 = r7 + r14
                int r4 = r2 + r8
                java.util.Locale r5 = java.util.Locale.CHINESE     // Catch: java.lang.Exception -> L231
                r6 = 2
                java.lang.Object[] r13 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L231
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L231
                r6 = 0
                r13[r6] = r3     // Catch: java.lang.Exception -> L231
                java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L231
                r13[r16] = r3     // Catch: java.lang.Exception -> L231
                java.lang.String r3 = java.lang.String.format(r5, r12, r13)     // Catch: java.lang.Exception -> L231
                a.a.a.c.a r4 = r0.m     // Catch: java.lang.Exception -> L12f
                android.database.sqlite.SQLiteDatabase r4 = a.a.a.c.a.a(r4)     // Catch: java.lang.Exception -> L12f
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L12f
                r5.<init>()     // Catch: java.lang.Exception -> L12f
                r5.append(r11)     // Catch: java.lang.Exception -> L12f
                r5.append(r3)     // Catch: java.lang.Exception -> L12f
                r5.append(r10)     // Catch: java.lang.Exception -> L12f
                java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L12f
                r6 = 0
                int r4 = r4.update(r1, r15, r5, r6)     // Catch: java.lang.Exception -> L12f
                if (r4 > 0) goto L12f
                r15.put(r9, r3)     // Catch: java.lang.Exception -> L12f
                a.a.a.c.a r3 = r0.m     // Catch: java.lang.Exception -> L12f
                android.database.sqlite.SQLiteDatabase r3 = a.a.a.c.a.a(r3)     // Catch: java.lang.Exception -> L12f
                r3.insert(r1, r6, r15)     // Catch: java.lang.Exception -> L12f
            L12f:
                int r14 = r14 + 1
                r15 = r21
                r3 = r22
                r6 = r23
                r13 = r24
                r4 = r25
                r5 = r28
                goto L66
            L13f:
                r22 = r3
                r25 = r4
                r28 = r5
                r23 = r6
                r24 = r13
                r21 = r15
                int r8 = r8 + 1
                r14 = 2
                goto L63
            L150:
                r19 = r2
            L152:
                r25 = r4
                goto L15b
            L155:
                r19 = r2
                r25 = r4
                r18 = r7
            L15b:
                r24 = r13
                r21 = r15
                r1 = r18
                r2 = r25
                boolean r3 = r1.has(r2)     // Catch: java.lang.Exception -> L231
                if (r3 == 0) goto L231
                java.lang.String r1 = r1.getString(r2)     // Catch: java.lang.Exception -> L231
                r2 = r21
                boolean r3 = r1.contains(r2)     // Catch: java.lang.Exception -> L231
                if (r3 == 0) goto L231
                java.lang.String r1 = r1.trim()     // Catch: java.lang.Exception -> L231
                java.lang.String[] r1 = r1.split(r2)     // Catch: java.lang.Exception -> L231
                int r2 = r1.length     // Catch: java.lang.Exception -> L231
                double r3 = (double) r2     // Catch: java.lang.Exception -> L231
                double r3 = java.lang.Math.sqrt(r3)     // Catch: java.lang.Exception -> L231
                int r3 = (int) r3     // Catch: java.lang.Exception -> L231
                int r4 = r3 * r3
                if (r4 != r2) goto L231
                int r2 = r0.k     // Catch: java.lang.Exception -> L231
                int r4 = r3 + (-1)
                int r5 = r4 / 2
                int r2 = r2 - r5
                int r5 = r0.l     // Catch: java.lang.Exception -> L231
                r6 = 2
                int r4 = r4 / r6
                int r5 = r5 - r4
                r4 = 0
            L195:
                if (r4 >= r3) goto L231
                r6 = 0
            L198:
                if (r6 >= r3) goto L222
                android.content.ContentValues r7 = new android.content.ContentValues     // Catch: java.lang.Exception -> L231
                r7.<init>()     // Catch: java.lang.Exception -> L231
                int r8 = r4 * r3
                int r8 = r8 + r6
                r13 = r1[r8]     // Catch: java.lang.Exception -> L231
                r14 = r24
                boolean r13 = r13.contains(r14)     // Catch: java.lang.Exception -> L231
                java.lang.String r15 = "state"
                if (r13 == 0) goto L1b7
                r8 = -1
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Exception -> L231
            L1b3:
                r7.put(r15, r8)     // Catch: java.lang.Exception -> L231
                goto L1c6
            L1b7:
                r8 = r1[r8]     // Catch: java.lang.Exception -> L231
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Exception -> L231
                int r8 = r8.intValue()     // Catch: java.lang.Exception -> L231
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Exception -> L231
                goto L1b3
            L1c6:
                int r8 = r2 + r6
                int r13 = r5 + r4
                java.util.Locale r15 = java.util.Locale.CHINESE     // Catch: java.lang.Exception -> L231
                r18 = r1
                r20 = r2
                r1 = 2
                java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L231
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Exception -> L231
                r17 = 0
                r2[r17] = r8     // Catch: java.lang.Exception -> L231
                java.lang.Integer r8 = java.lang.Integer.valueOf(r13)     // Catch: java.lang.Exception -> L231
                r2[r16] = r8     // Catch: java.lang.Exception -> L231
                java.lang.String r2 = java.lang.String.format(r15, r12, r2)     // Catch: java.lang.Exception -> L231
                a.a.a.c.a r8 = r0.m     // Catch: java.lang.Exception -> L213
                android.database.sqlite.SQLiteDatabase r8 = a.a.a.c.a.a(r8)     // Catch: java.lang.Exception -> L213
                java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L213
                r13.<init>()     // Catch: java.lang.Exception -> L213
                r13.append(r11)     // Catch: java.lang.Exception -> L213
                r13.append(r2)     // Catch: java.lang.Exception -> L213
                r13.append(r10)     // Catch: java.lang.Exception -> L213
                java.lang.String r13 = r13.toString()     // Catch: java.lang.Exception -> L213
                r15 = r19
                r1 = 0
                int r8 = r8.update(r15, r7, r13, r1)     // Catch: java.lang.Exception -> L216
                if (r8 > 0) goto L216
                r7.put(r9, r2)     // Catch: java.lang.Exception -> L216
                a.a.a.c.a r2 = r0.m     // Catch: java.lang.Exception -> L216
                android.database.sqlite.SQLiteDatabase r2 = a.a.a.c.a.a(r2)     // Catch: java.lang.Exception -> L216
                r2.insert(r15, r1, r7)     // Catch: java.lang.Exception -> L216
                goto L216
            L213:
                r15 = r19
                r1 = 0
            L216:
                int r6 = r6 + 1
                r24 = r14
                r19 = r15
                r1 = r18
                r2 = r20
                goto L198
            L222:
                r18 = r1
                r20 = r2
                r15 = r19
                r14 = r24
                r1 = 0
                int r4 = r4 + 1
                r1 = r18
                goto L195
            L231:
                java.util.concurrent.locks.Lock r1 = a.a.a.c.a.c()
                r1.unlock()
            L238:
                java.util.Map<java.lang.String, java.lang.Object> r1 = r0.d
                if (r1 == 0) goto L23f
                r1.clear()
            L23f:
                a.a.a.c.a r0 = r0.m
                r1 = 0
                a.a.a.c.a.a(r0, r1)
                return
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            a.a.a.c.a.g = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = a.a.a.i.i.c()
            r0.append(r1)
            java.lang.String r1 = "/gal.db"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            a.a.a.c.a.i = r0
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            a.a.a.c.a.j = r0
            return
    }

    public a() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f100a = r0
            r1 = 0
            r2.f101b = r1
            r2.f102c = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2.d = r0
            r0 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            r2.e = r0
            r2.f = r0
            return
    }

    public static /* synthetic */ android.database.sqlite.SQLiteDatabase a(a.a.a.c.a r0) {
            android.database.sqlite.SQLiteDatabase r0 = r0.f100a
            return r0
    }

    public static /* synthetic */ boolean a(a.a.a.c.a r0, boolean r1) {
            r0.f101b = r1
            return r1
    }

    public static /* synthetic */ boolean b(a.a.a.c.a r0) {
            boolean r0 = r0.f101b
            return r0
    }

    public static /* synthetic */ java.util.concurrent.locks.Lock c() {
            java.util.concurrent.locks.Lock r0 = a.a.a.c.a.j
            return r0
    }

    public static a.a.a.c.a d() {
            java.lang.Object r0 = a.a.a.c.a.g
            monitor-enter(r0)
            a.a.a.c.a r1 = a.a.a.c.a.h     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto Le
            a.a.a.c.a r1 = new a.a.a.c.a     // Catch: java.lang.Throwable -> L12
            r1.<init>()     // Catch: java.lang.Throwable -> L12
            a.a.a.c.a.h = r1     // Catch: java.lang.Throwable -> L12
        Le:
            a.a.a.c.a r1 = a.a.a.c.a.h     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return r1
        L12:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1
    }

    public int a(com.baidu.location.c r11) {
            r10 = this;
            r0 = 0
            r2 = 0
            if (r11 == 0) goto Le
            float r3 = r11.z()
            double r4 = r11.d()
            goto L10
        Le:
            r4 = r0
            r3 = r2
        L10:
            android.database.sqlite.SQLiteDatabase r6 = r10.f100a
            r7 = 0
            if (r6 == 0) goto L4b
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 <= 0) goto L4b
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L4b
            if (r11 == 0) goto L4b
            double r0 = r11.t()
            double r8 = r11.q()
            double[] r10 = r10.a(r0, r8)
            r10 = r10[r7]
            r0 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 == 0) goto L4b
            double r10 = com.baidu.location.Jni.a(r3, r4, r10)
            r0 = 4632233691727265792(0x4049000000000000, double:50.0)
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 <= 0) goto L42
            r7 = 3
            goto L4b
        L42:
            r0 = 4626322717216342016(0x4034000000000000, double:20.0)
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 <= 0) goto L4a
            r7 = 2
            goto L4b
        L4a:
            r7 = 1
        L4b:
            return r7
    }

    public void a() {
            r4 = this;
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L55
            java.lang.String r2 = a.a.a.c.a.i     // Catch: java.lang.Exception -> L55
            r1.<init>(r2)     // Catch: java.lang.Exception -> L55
            boolean r2 = r1.exists()     // Catch: java.lang.Exception -> L55
            if (r2 != 0) goto L11
            r1.createNewFile()     // Catch: java.lang.Exception -> L55
        L11:
            boolean r2 = r1.exists()     // Catch: java.lang.Exception -> L55
            if (r2 == 0) goto L57
            android.database.sqlite.SQLiteDatabase r1 = android.database.sqlite.SQLiteDatabase.openOrCreateDatabase(r1, r0)     // Catch: java.lang.Exception -> L55
            r4.f100a = r1     // Catch: java.lang.Exception -> L55
            java.lang.String r2 = "SELECT count(*) FROM sqlite_master WHERE type='table' AND name='galdata'"
            android.database.Cursor r1 = r1.rawQuery(r2, r0)     // Catch: java.lang.Exception -> L55
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Exception -> L55
            if (r2 == 0) goto L4b
            r2 = 0
            int r2 = r1.getInt(r2)     // Catch: java.lang.Exception -> L55
            if (r2 != 0) goto L3a
            android.database.sqlite.SQLiteDatabase r2 = r4.f100a     // Catch: java.lang.Exception -> L55
            java.lang.String r3 = "CREATE TABLE IF NOT EXISTS galdata_new(id CHAR(40) PRIMARY KEY,aldata DOUBLE, sigma DOUBLE,tt INT);"
        L34:
            r2.execSQL(r3)     // Catch: java.lang.Exception -> L55
            android.database.sqlite.SQLiteDatabase r2 = r4.f100a     // Catch: java.lang.Exception -> L55
            goto L46
        L3a:
            android.database.sqlite.SQLiteDatabase r2 = r4.f100a     // Catch: java.lang.Exception -> L55
            java.lang.String r3 = "DROP TABLE galdata"
            r2.execSQL(r3)     // Catch: java.lang.Exception -> L55
            android.database.sqlite.SQLiteDatabase r2 = r4.f100a     // Catch: java.lang.Exception -> L55
            java.lang.String r3 = "CREATE TABLE galdata_new(id CHAR(40) PRIMARY KEY,aldata DOUBLE, sigma DOUBLE,tt INT);"
            goto L34
        L46:
            java.lang.String r3 = "CREATE TABLE IF NOT EXISTS locStateData(id CHAR(40) PRIMARY KEY,state INT);"
            r2.execSQL(r3)     // Catch: java.lang.Exception -> L55
        L4b:
            android.database.sqlite.SQLiteDatabase r2 = r4.f100a     // Catch: java.lang.Exception -> L55
            r3 = 1
            r2.setVersion(r3)     // Catch: java.lang.Exception -> L55
            r1.close()     // Catch: java.lang.Exception -> L55
            goto L57
        L55:
            r4.f100a = r0
        L57:
            return
    }

    public final void a(double r9, double r11, double r13) {
            r8 = this;
            a.a.a.c.a$a r0 = r8.f102c
            if (r0 != 0) goto Lb
            a.a.a.c.a$a r0 = new a.a.a.c.a$a
            r0.<init>(r8)
            r8.f102c = r0
        Lb:
            a.a.a.c.a$a r1 = r8.f102c
            r2 = r9
            r4 = r11
            r6 = r13
            r1.a(r2, r4, r6)
            return
    }

    public double[] a(double r20, double r22) {
            r19 = this;
            r0 = r19
            r1 = 2
            double[] r8 = new double[r1]
            android.database.sqlite.SQLiteDatabase r2 = r0.f100a
            r9 = 0
            r10 = 1
            r11 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            r13 = 4666723172467343360(0x40c3880000000000, double:10000.0)
            if (r2 == 0) goto L120
            r2 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r4 = (r20 > r2 ? 1 : (r20 == r2 ? 0 : -1))
            if (r4 <= 0) goto L120
            int r2 = (r22 > r2 ? 1 : (r22 == r2 ? 0 : -1))
            if (r2 <= 0) goto L120
            java.util.Locale r2 = java.util.Locale.CHINESE
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r4 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r6 = r20 * r4
            double r6 = java.lang.Math.floor(r6)
            int r6 = (int) r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3[r9] = r6
            double r4 = r4 * r22
            double r4 = java.lang.Math.floor(r4)
            int r4 = (int) r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r10] = r4
            java.lang.String r4 = "%d,%d"
            java.lang.String r15 = java.lang.String.format(r2, r4, r3)
            java.lang.String r2 = r0.d
            if (r2 == 0) goto L59
            boolean r2 = r2.equals(r15)
            if (r2 == 0) goto L59
            double r11 = r0.e
            double r0 = r0.f
            r2 = r13
            goto L126
        L59:
            java.util.concurrent.locks.Lock r2 = a.a.a.c.a.j
            r2.lock()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r0.f100a     // Catch: java.lang.Throwable -> L109 java.lang.Exception -> L110
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L109 java.lang.Exception -> L110
            r4.<init>()     // Catch: java.lang.Throwable -> L109 java.lang.Exception -> L110
            java.lang.String r5 = "select * from galdata_new where id = \""
            r4.append(r5)     // Catch: java.lang.Throwable -> L109 java.lang.Exception -> L110
            r4.append(r15)     // Catch: java.lang.Throwable -> L109 java.lang.Exception -> L110
            java.lang.String r5 = "\";"
            r4.append(r5)     // Catch: java.lang.Throwable -> L109 java.lang.Exception -> L110
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L109 java.lang.Exception -> L110
            android.database.Cursor r6 = r3.rawQuery(r4, r2)     // Catch: java.lang.Throwable -> L109 java.lang.Exception -> L110
            if (r6 == 0) goto Le7
            boolean r2 = r6.moveToFirst()     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le4
            if (r2 == 0) goto Le7
            double r2 = r6.getDouble(r10)     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le4
            double r4 = r6.getDouble(r1)     // Catch: java.lang.Exception -> Ldb java.lang.Throwable -> Le0
            r1 = 3
            int r1 = r6.getInt(r1)     // Catch: java.lang.Exception -> Ld8 java.lang.Throwable -> Le0
            int r7 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r7 != 0) goto L95
            r2 = r11
        L95:
            r16 = 0
            int r7 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r7 > 0) goto L9c
            goto L9d
        L9c:
            r11 = r4
        L9d:
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> Ld2 java.lang.Throwable -> Le0
            r16 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r16
            long r9 = (long) r1     // Catch: java.lang.Exception -> Ld2 java.lang.Throwable -> Le0
            long r4 = r4 - r9
            boolean r1 = r0.f101b     // Catch: java.lang.Exception -> Ld2 java.lang.Throwable -> Le0
            if (r1 != 0) goto Lc6
            r9 = 604800(0x93a80, double:2.98811E-318)
            int r1 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r1 <= 0) goto Lc6
            r9 = 4621549464509743104(0x40230ac080000000, double:9.520999908447266)
            r1 = r19
            r4 = r2
            r2 = r20
            r13 = r4
            r4 = r22
            r18 = r6
            r6 = r9
            r1.a(r2, r4, r6)     // Catch: java.lang.Exception -> Ld5 java.lang.Throwable -> L101
            goto Lc9
        Lc6:
            r13 = r2
            r18 = r6
        Lc9:
            r0.d = r15     // Catch: java.lang.Exception -> Ld5 java.lang.Throwable -> L101
            r0.e = r13     // Catch: java.lang.Exception -> Ld5 java.lang.Throwable -> L101
            r0.f = r11     // Catch: java.lang.Exception -> Ld5 java.lang.Throwable -> L101
            r0 = r11
            r11 = r13
            goto Lfc
        Ld2:
            r13 = r2
            r18 = r6
        Ld5:
            r4 = r11
            r11 = r13
            goto L106
        Ld8:
            r18 = r6
            goto Lde
        Ldb:
            r18 = r6
            r4 = r11
        Lde:
            r11 = r2
            goto L106
        Le0:
            r0 = move-exception
            r18 = r6
            goto L102
        Le4:
            r18 = r6
            goto L105
        Le7:
            r18 = r6
            boolean r1 = r0.f101b     // Catch: java.lang.Throwable -> L101 java.lang.Exception -> L105
            if (r1 != 0) goto Lfb
            r6 = 4621549464509743104(0x40230ac080000000, double:9.520999908447266)
            r1 = r19
            r2 = r20
            r4 = r22
            r1.a(r2, r4, r6)     // Catch: java.lang.Throwable -> L101 java.lang.Exception -> L105
        Lfb:
            r0 = r11
        Lfc:
            if (r18 == 0) goto L11a
            r6 = r18
            goto L115
        L101:
            r0 = move-exception
        L102:
            r2 = r18
            goto L10a
        L105:
            r4 = r11
        L106:
            r2 = r18
            goto L111
        L109:
            r0 = move-exception
        L10a:
            if (r2 == 0) goto L10f
            r2.close()     // Catch: java.lang.Exception -> L10f
        L10f:
            throw r0
        L110:
            r4 = r11
        L111:
            if (r2 == 0) goto L119
            r6 = r2
            r0 = r4
        L115:
            r6.close()     // Catch: java.lang.Exception -> L11a
            goto L11a
        L119:
            r0 = r4
        L11a:
            java.util.concurrent.locks.Lock r2 = a.a.a.c.a.j
            r2.unlock()
            goto L121
        L120:
            r0 = r11
        L121:
            r2 = 4666723172467343360(0x40c3880000000000, double:10000.0)
        L126:
            int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r4 <= 0) goto L12e
            r4 = 0
            r8[r4] = r2
            goto L131
        L12e:
            r4 = 0
            r8[r4] = r11
        L131:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L139
            r4 = 1
            r8[r4] = r2
            goto L13c
        L139:
            r4 = 1
            r8[r4] = r0
        L13c:
            return r8
    }

    public void b() {
            r2 = this;
            android.database.sqlite.SQLiteDatabase r0 = r2.f100a
            if (r0 == 0) goto Lf
            r1 = 0
            r0.close()     // Catch: java.lang.Exception -> L8 java.lang.Throwable -> Lb
        L8:
            r2.f100a = r1
            goto Lf
        Lb:
            r0 = move-exception
            r2.f100a = r1
            throw r0
        Lf:
            return
    }
}
