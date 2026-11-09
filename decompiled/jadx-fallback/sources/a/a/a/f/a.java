package a.a.a.f;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static a.a.a.f.a l;
    public static final java.lang.String m = null;
    public static final java.lang.String n = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.String f211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f213c;
    public double d;
    public double e;
    public double f;
    public double g;
    public double h;
    public volatile boolean i;
    public android.os.Handler j;
    public boolean k;

    /* JADX INFO: renamed from: a.a.a.f.a$a, reason: collision with other inner class name */
    public class RunnableC0010a implements java.lang.Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.a.a.f.a f214b;

        public RunnableC0010a(a.a.a.f.a r1) {
                r0 = this;
                r0.f214b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                boolean r0 = com.baidu.location.f.f
                if (r0 == 0) goto L9
                a.a.a.f.a r1 = r1.f214b
                a.a.a.f.a.a(r1)
            L9:
                return
        }
    }

    public class b extends android.os.AsyncTask<java.lang.Boolean, java.lang.Void, java.lang.Boolean> {
        public b(a.a.a.f.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ b(a.a.a.f.a r1, a.a.a.f.a.RunnableC0010a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public java.lang.Boolean a(java.lang.Boolean... r4) {
                r3 = this;
                int r3 = r4.length
                r0 = 4
                if (r3 == r0) goto L7
                java.lang.Boolean r3 = java.lang.Boolean.FALSE
                return r3
            L7:
                r3 = 0
                java.lang.String r0 = a.a.a.f.a.d()     // Catch: java.lang.Exception -> L10
                android.database.sqlite.SQLiteDatabase r3 = android.database.sqlite.SQLiteDatabase.openOrCreateDatabase(r0, r3)     // Catch: java.lang.Exception -> L10
            L10:
                if (r3 != 0) goto L15
                java.lang.Boolean r3 = java.lang.Boolean.FALSE
                return r3
            L15:
                long r0 = java.lang.System.currentTimeMillis()
                r2 = 28
                long r0 = r0 >> r2
                int r0 = (int) r0
                r3.beginTransaction()     // Catch: java.lang.Exception -> L67
                r1 = 0
                r1 = r4[r1]     // Catch: java.lang.Exception -> L67
                boolean r1 = r1.booleanValue()     // Catch: java.lang.Exception -> L67
                if (r1 == 0) goto L3f
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L67
                r1.<init>()     // Catch: java.lang.Exception -> L67
                java.lang.String r2 = "delete from wof where ac < "
                r1.append(r2)     // Catch: java.lang.Exception -> L67
                int r2 = r0 + (-35)
                r1.append(r2)     // Catch: java.lang.Exception -> L67
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L67
                r3.execSQL(r1)     // Catch: java.lang.Exception -> L3f
            L3f:
                r1 = 1
                r4 = r4[r1]     // Catch: java.lang.Exception -> L67
                boolean r4 = r4.booleanValue()     // Catch: java.lang.Exception -> L67
                if (r4 == 0) goto L5e
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L67
                r4.<init>()     // Catch: java.lang.Exception -> L67
                java.lang.String r1 = "delete from bdcltb09 where ac is NULL or ac < "
                r4.append(r1)     // Catch: java.lang.Exception -> L67
                int r0 = r0 + (-130)
                r4.append(r0)     // Catch: java.lang.Exception -> L67
                java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L67
                r3.execSQL(r4)     // Catch: java.lang.Exception -> L5e
            L5e:
                r3.setTransactionSuccessful()     // Catch: java.lang.Exception -> L67
                r3.endTransaction()     // Catch: java.lang.Exception -> L67
                r3.close()     // Catch: java.lang.Exception -> L67
            L67:
                java.lang.Boolean r3 = java.lang.Boolean.TRUE
                return r3
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ java.lang.Boolean doInBackground(java.lang.Boolean[] r1) {
                r0 = this;
                java.lang.Boolean[] r1 = (java.lang.Boolean[]) r1
                java.lang.Boolean r0 = r0.a(r1)
                return r0
        }
    }

    public class c extends android.os.AsyncTask<java.lang.Object, java.lang.Void, java.lang.Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.a.a.f.a f215a;

        public c(a.a.a.f.a r1) {
                r0 = this;
                r0.f215a = r1
                r0.<init>()
                return
        }

        public /* synthetic */ c(a.a.a.f.a r1, a.a.a.f.a.RunnableC0010a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public java.lang.Boolean a(java.lang.Object... r6) {
                r5 = this;
                int r0 = r6.length
                r1 = 0
                r2 = 4
                if (r0 == r2) goto Ld
                a.a.a.f.a r5 = r5.f215a
                a.a.a.f.a.a(r5, r1)
                java.lang.Boolean r5 = java.lang.Boolean.FALSE
                return r5
            Ld:
                r0 = 0
                java.lang.String r2 = a.a.a.f.a.d()     // Catch: java.lang.Exception -> L16
                android.database.sqlite.SQLiteDatabase r0 = android.database.sqlite.SQLiteDatabase.openOrCreateDatabase(r2, r0)     // Catch: java.lang.Exception -> L16
            L16:
                if (r0 != 0) goto L20
                a.a.a.f.a r5 = r5.f215a
                a.a.a.f.a.a(r5, r1)
                java.lang.Boolean r5 = java.lang.Boolean.FALSE
                return r5
            L20:
                r0.beginTransaction()     // Catch: java.lang.Exception -> L49
                a.a.a.f.a r2 = r5.f215a     // Catch: java.lang.Exception -> L49
                r3 = r6[r1]     // Catch: java.lang.Exception -> L49
                java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L49
                r4 = 1
                r4 = r6[r4]     // Catch: java.lang.Exception -> L49
                a.a.a.g.a r4 = (a.a.a.g.a) r4     // Catch: java.lang.Exception -> L49
                a.a.a.f.a.a(r2, r3, r4, r0)     // Catch: java.lang.Exception -> L49
                a.a.a.f.a r2 = r5.f215a     // Catch: java.lang.Exception -> L49
                r3 = 2
                r3 = r6[r3]     // Catch: java.lang.Exception -> L49
                a.a.a.g.k r3 = (a.a.a.g.k) r3     // Catch: java.lang.Exception -> L49
                r4 = 3
                r6 = r6[r4]     // Catch: java.lang.Exception -> L49
                com.baidu.location.c r6 = (com.baidu.location.c) r6     // Catch: java.lang.Exception -> L49
                a.a.a.f.a.a(r2, r3, r6, r0)     // Catch: java.lang.Exception -> L49
                r0.setTransactionSuccessful()     // Catch: java.lang.Exception -> L49
                r0.endTransaction()     // Catch: java.lang.Exception -> L49
                r0.close()     // Catch: java.lang.Exception -> L49
            L49:
                a.a.a.f.a r5 = r5.f215a
                a.a.a.f.a.a(r5, r1)
                java.lang.Boolean r5 = java.lang.Boolean.TRUE
                return r5
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ java.lang.Boolean doInBackground(java.lang.Object[] r1) {
                r0 = this;
                java.lang.Boolean r0 = r0.a(r1)
                return r0
        }
    }

    static {
            java.lang.String r0 = a.a.a.i.h.f353a
            a.a.a.f.a.m = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = a.a.a.i.h.f353a
            r0.append(r1)
            java.lang.String r1 = "/ls.db"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            a.a.a.f.a.n = r0
            return
    }

    public a() {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.f211a = r0
            r1 = 0
            r4.f212b = r1
            r4.f213c = r1
            r2 = 0
            r4.d = r2
            r4.e = r2
            r4.f = r2
            r4.g = r2
            r4.h = r2
            r4.i = r1
            r4.j = r0
            r4.k = r1
            r4.b()
            return
    }

    public static /* synthetic */ void a(a.a.a.f.a r0) {
            r0.a()
            return
    }

    public static /* synthetic */ void a(a.a.a.f.a r0, a.a.a.g.k r1, com.baidu.location.c r2, android.database.sqlite.SQLiteDatabase r3) {
            r0.a(r1, r2, r3)
            return
    }

    public static /* synthetic */ void a(a.a.a.f.a r0, java.lang.String r1, a.a.a.g.a r2, android.database.sqlite.SQLiteDatabase r3) {
            r0.a(r1, r2, r3)
            return
    }

    public static /* synthetic */ boolean a(a.a.a.f.a r0, boolean r1) {
            r0.i = r1
            return r1
    }

    public static /* synthetic */ java.lang.String d() {
            java.lang.String r0 = a.a.a.f.a.n
            return r0
    }

    public static synchronized a.a.a.f.a e() {
            java.lang.Class<a.a.a.f.a> r0 = a.a.a.f.a.class
            monitor-enter(r0)
            a.a.a.f.a r1 = a.a.a.f.a.l     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto Le
            a.a.a.f.a r1 = new a.a.a.f.a     // Catch: java.lang.Throwable -> L12
            r1.<init>()     // Catch: java.lang.Throwable -> L12
            a.a.a.f.a.l = r1     // Catch: java.lang.Throwable -> L12
        Le:
            a.a.a.f.a r1 = a.a.a.f.a.l     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)
            return r1
        L12:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public com.baidu.location.c a(java.lang.String r3, java.util.List<android.net.wifi.ScanResult> r4, boolean r5) {
            r2 = this;
            boolean r5 = r2.k
            java.lang.String r0 = "\",\"error\":\"67\"}}"
            java.lang.String r1 = "{\"result\":{\"time\":\""
            if (r5 != 0) goto L24
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r3 = a.a.a.i.i.i()
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.baidu.location.c r3 = new com.baidu.location.c
            r3.<init>(r2)
            return r3
        L24:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            java.lang.String r1 = a.a.a.i.i.i()
            r5.append(r1)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r2.a(r3, r4)     // Catch: java.lang.Throwable -> L46
            r3 = 1
            java.lang.String r2 = r2.a(r3)     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L4a
            r5 = r2
            goto L4a
        L46:
            r2 = move-exception
            r2.printStackTrace()
        L4a:
            com.baidu.location.c r2 = new com.baidu.location.c
            r2.<init>(r5)
            return r2
    }

    public final java.lang.String a(boolean r18) {
            r17 = this;
            r0 = r17
            boolean r1 = r0.f213c
            r2 = 0
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L19
            double r2 = r0.g
            double r0 = r0.h
            r6 = 4642873445846928589(0x406ecccccccccccd, double:246.4)
            r8 = r5
            r9 = r8
            r15 = r2
            r2 = r6
            r6 = r15
            goto L2e
        L19:
            boolean r1 = r0.f212b
            if (r1 == 0) goto L2a
            double r2 = r0.e
            double r6 = r0.f
            double r0 = r0.d
            r8 = r5
            r9 = r8
            r15 = r0
            r0 = r6
            r6 = r2
            r2 = r15
            goto L2e
        L2a:
            r0 = r2
            r6 = r0
            r8 = r4
            r9 = r8
        L2e:
            java.lang.String r10 = "{\"result\":{\"time\":\""
            if (r8 == 0) goto La5
            r8 = 3
            r11 = 2
            r12 = 4
            java.lang.String r13 = "\",\"error\":\"66\"},\"content\":{\"point\":{\"x\":\"%f\",\"y\":\"%f\"},\"radius\":\"%f\",\"isCellChanged\":\"%b\"}}"
            if (r18 == 0) goto L6e
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r10)
            java.lang.String r10 = a.a.a.i.i.i()
            r9.append(r10)
            r9.append(r13)
            java.lang.String r9 = r9.toString()
            java.util.Locale r10 = java.util.Locale.CHINA
            java.lang.Object[] r12 = new java.lang.Object[r12]
            java.lang.Double r6 = java.lang.Double.valueOf(r6)
            r12[r4] = r6
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r12[r5] = r0
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            r12[r11] = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r12[r8] = r0
            java.lang.String r0 = java.lang.String.format(r10, r9, r12)
            goto Lcf
        L6e:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r10)
            java.lang.String r10 = a.a.a.i.i.i()
            r14.append(r10)
            r14.append(r13)
            java.lang.String r10 = r14.toString()
            java.util.Locale r13 = java.util.Locale.CHINA
            java.lang.Object[] r12 = new java.lang.Object[r12]
            java.lang.Double r6 = java.lang.Double.valueOf(r6)
            r12[r4] = r6
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r12[r5] = r0
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            r12[r11] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            r12[r8] = r0
            java.lang.String r0 = java.lang.String.format(r13, r10, r12)
            goto Lcf
        La5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            if (r18 == 0) goto Lb9
            r0.<init>()
            r0.append(r10)
            java.lang.String r1 = a.a.a.i.i.i()
            r0.append(r1)
            java.lang.String r1 = "\",\"error\":\"67\"}}"
            goto Lc8
        Lb9:
            r0.<init>()
            r0.append(r10)
            java.lang.String r1 = a.a.a.i.i.i()
            r0.append(r1)
            java.lang.String r1 = "\",\"error\":\"63\"}}"
        Lc8:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        Lcf:
            return r0
    }

    public final void a() {
            r9 = this;
            r0 = 0
            java.lang.String r1 = a.a.a.f.a.n     // Catch: java.lang.Exception -> L8
            android.database.sqlite.SQLiteDatabase r1 = android.database.sqlite.SQLiteDatabase.openOrCreateDatabase(r1, r0)     // Catch: java.lang.Exception -> L8
            goto L9
        L8:
            r1 = r0
        L9:
            if (r1 != 0) goto Lc
            return
        Lc:
            java.lang.String r2 = "wof"
            long r2 = android.database.DatabaseUtils.queryNumEntries(r1, r2)     // Catch: java.lang.Exception -> L48
            java.lang.String r4 = "bdcltb09"
            long r4 = android.database.DatabaseUtils.queryNumEntries(r1, r4)     // Catch: java.lang.Exception -> L48
            r6 = 10000(0x2710, double:4.9407E-320)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            r3 = 1
            r8 = 0
            if (r2 <= 0) goto L22
            r2 = r3
            goto L23
        L22:
            r2 = r8
        L23:
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L29
            r4 = r3
            goto L2a
        L29:
            r4 = r8
        L2a:
            r1.close()     // Catch: java.lang.Exception -> L48
            if (r2 != 0) goto L31
            if (r4 == 0) goto L48
        L31:
            a.a.a.f.a$b r1 = new a.a.a.f.a$b     // Catch: java.lang.Exception -> L48
            r1.<init>(r9, r0)     // Catch: java.lang.Exception -> L48
            r9 = 2
            java.lang.Boolean[] r9 = new java.lang.Boolean[r9]     // Catch: java.lang.Exception -> L48
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Exception -> L48
            r9[r8] = r0     // Catch: java.lang.Exception -> L48
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Exception -> L48
            r9[r3] = r0     // Catch: java.lang.Exception -> L48
            r1.execute(r9)     // Catch: java.lang.Exception -> L48
        L48:
            return
    }

    public final void a(a.a.a.g.k r29, com.baidu.location.c r30, android.database.sqlite.SQLiteDatabase r31) {
            r28 = this;
            r0 = r29
            r1 = r31
            if (r30 == 0) goto L1db
            int r2 = r30.r()
            r3 = 161(0xa1, float:2.26E-43)
            if (r2 != r3) goto L1db
            java.lang.String r2 = r30.v()
            java.lang.String r3 = "wf"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L26
            float r2 = r30.z()
            r3 = 1133903872(0x43960000, float:300.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L26
            goto L1db
        L26:
            java.util.List<android.net.wifi.ScanResult> r2 = r0.f295a
            if (r2 != 0) goto L2b
            return
        L2b:
            long r2 = java.lang.System.currentTimeMillis()
            r4 = 28
            long r2 = r2 >> r4
            int r2 = (int) r2
            java.lang.System.currentTimeMillis()
            java.util.List<android.net.wifi.ScanResult> r0 = r0.f295a
            java.util.Iterator r0 = r0.iterator()
            r3 = 0
            r4 = r3
        L3e:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L1db
            java.lang.Object r5 = r0.next()
            android.net.wifi.ScanResult r5 = (android.net.wifi.ScanResult) r5
            int r6 = r5.level
            if (r6 != 0) goto L4f
            goto L3e
        L4f:
            int r4 = r4 + 1
            r6 = 6
            if (r4 <= r6) goto L56
            goto L1db
        L56:
            android.content.ContentValues r6 = new android.content.ContentValues
            r6.<init>()
            java.lang.String r5 = r5.BSSID
            java.lang.String r7 = ":"
            java.lang.String r8 = ""
            java.lang.String r5 = r5.replace(r7, r8)
            java.lang.String r5 = com.baidu.location.Jni.c(r5)
            java.lang.String r7 = "select * from wof where id = ?"
            r8 = 1
            java.lang.String[] r9 = new java.lang.String[r8]     // Catch: java.lang.Exception -> L104
            r9[r3] = r5     // Catch: java.lang.Exception -> L104
            android.database.Cursor r7 = r1.rawQuery(r7, r9)     // Catch: java.lang.Exception -> L104
            r9 = 0
            r11 = 4646309618475430891(0x407b01fb15b573eb, double:432.1238)
            r13 = 4637668614646953253(0x405c4f089a027525, double:113.2349)
            if (r7 == 0) goto La5
            boolean r15 = r7.moveToFirst()     // Catch: java.lang.Exception -> L104
            if (r15 == 0) goto La5
            double r9 = r7.getDouble(r8)     // Catch: java.lang.Exception -> L104
            double r9 = r9 - r13
            r15 = 2
            double r15 = r7.getDouble(r15)     // Catch: java.lang.Exception -> L104
            double r15 = r15 - r11
            r3 = 4
            int r3 = r7.getInt(r3)     // Catch: java.lang.Exception -> L104
            r8 = 5
            int r8 = r7.getInt(r8)     // Catch: java.lang.Exception -> L104
            r26 = r9
            r24 = r15
            r9 = r8
            r8 = r3
            r3 = 1
            goto Lac
        La5:
            r24 = r9
            r26 = r24
            r3 = 0
            r8 = 0
            r9 = 0
        Lac:
            if (r7 == 0) goto Lb1
            r7.close()     // Catch: java.lang.Exception -> L104
        Lb1:
            java.lang.String r10 = "wof"
            java.lang.String r15 = "ac"
            java.lang.String r7 = "cc"
            java.lang.String r11 = "bc"
            java.lang.String r12 = "time"
            java.lang.String r13 = "mktime"
            if (r3 != 0) goto L102
            double r8 = r30.t()     // Catch: java.lang.Exception -> L104
            r16 = 4637668614646953253(0x405c4f089a027525, double:113.2349)
            double r8 = r8 + r16
            java.lang.Double r3 = java.lang.Double.valueOf(r8)     // Catch: java.lang.Exception -> L104
            r6.put(r13, r3)     // Catch: java.lang.Exception -> L104
            double r8 = r30.q()     // Catch: java.lang.Exception -> L104
            r13 = 4646309618475430891(0x407b01fb15b573eb, double:432.1238)
            double r8 = r8 + r13
            java.lang.Double r3 = java.lang.Double.valueOf(r8)     // Catch: java.lang.Exception -> L104
            r6.put(r12, r3)     // Catch: java.lang.Exception -> L104
            r3 = 1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L104
            r6.put(r11, r8)     // Catch: java.lang.Exception -> L104
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L104
            r6.put(r7, r3)     // Catch: java.lang.Exception -> L104
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L104
            r6.put(r15, r3)     // Catch: java.lang.Exception -> L104
            java.lang.String r3 = "id"
            r6.put(r3, r5)     // Catch: java.lang.Exception -> L104
            r3 = 0
            r1.insert(r10, r3, r6)     // Catch: java.lang.Exception -> L104
            goto L104
        L102:
            if (r9 != 0) goto L108
        L104:
            r28 = r4
            goto L1d6
        L108:
            r3 = 1
            float[] r14 = new float[r3]     // Catch: java.lang.Exception -> L104
            double r19 = r30.q()     // Catch: java.lang.Exception -> L104
            double r21 = r30.t()     // Catch: java.lang.Exception -> L104
            r3 = r15
            r15 = r24
            r17 = r26
            r23 = r14
            android.location.Location.distanceBetween(r15, r17, r19, r21, r23)     // Catch: java.lang.Exception -> L104
            r15 = 0
            r14 = r14[r15]     // Catch: java.lang.Exception -> L104
            r16 = 1153138688(0x44bb8000, float:1500.0)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 <= 0) goto L174
            int r9 = r9 + 1
            r14 = 10
            if (r9 <= r14) goto L16c
            int r8 = r8 * 3
            if (r9 <= r8) goto L16c
            double r8 = r30.t()     // Catch: java.lang.Exception -> L104
            r16 = 4637668614646953253(0x405c4f089a027525, double:113.2349)
            double r8 = r8 + r16
            java.lang.Double r8 = java.lang.Double.valueOf(r8)     // Catch: java.lang.Exception -> L104
            r6.put(r13, r8)     // Catch: java.lang.Exception -> L104
            double r8 = r30.q()     // Catch: java.lang.Exception -> L104
            r13 = 4646309618475430891(0x407b01fb15b573eb, double:432.1238)
            double r8 = r8 + r13
            java.lang.Double r8 = java.lang.Double.valueOf(r8)     // Catch: java.lang.Exception -> L104
            r6.put(r12, r8)     // Catch: java.lang.Exception -> L104
            r8 = 1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Exception -> L104
            r6.put(r11, r9)     // Catch: java.lang.Exception -> L104
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Exception -> L104
            r6.put(r7, r8)     // Catch: java.lang.Exception -> L104
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L104
            r15 = r3
            r28 = r4
            r3 = r7
            goto L1b9
        L16c:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Exception -> L104
            r28 = r4
            r15 = r7
            goto L1b9
        L174:
            r29 = r3
            r28 = r4
            double r3 = (double) r8
            double r26 = r26 * r3
            double r16 = r30.t()     // Catch: java.lang.Exception -> L1d6
            double r26 = r26 + r16
            int r8 = r8 + 1
            double r14 = (double) r8     // Catch: java.lang.Exception -> L1d6
            double r26 = r26 / r14
            double r24 = r24 * r3
            double r3 = r30.q()     // Catch: java.lang.Exception -> L1d6
            double r24 = r24 + r3
            double r24 = r24 / r14
            r3 = 4637668614646953253(0x405c4f089a027525, double:113.2349)
            double r26 = r26 + r3
            java.lang.Double r3 = java.lang.Double.valueOf(r26)     // Catch: java.lang.Exception -> L1d6
            r6.put(r13, r3)     // Catch: java.lang.Exception -> L1d6
            r3 = 4646309618475430891(0x407b01fb15b573eb, double:432.1238)
            double r24 = r24 + r3
            java.lang.Double r3 = java.lang.Double.valueOf(r24)     // Catch: java.lang.Exception -> L1d6
            r6.put(r12, r3)     // Catch: java.lang.Exception -> L1d6
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Exception -> L1d6
            r6.put(r11, r3)     // Catch: java.lang.Exception -> L1d6
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L1d6
            r15 = r29
        L1b9:
            r6.put(r15, r3)     // Catch: java.lang.Exception -> L1d6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1d6
            r3.<init>()     // Catch: java.lang.Exception -> L1d6
            java.lang.String r4 = "id = \""
            r3.append(r4)     // Catch: java.lang.Exception -> L1d6
            r3.append(r5)     // Catch: java.lang.Exception -> L1d6
            java.lang.String r4 = "\""
            r3.append(r4)     // Catch: java.lang.Exception -> L1d6
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L1d6
            r4 = 0
            r1.update(r10, r6, r3, r4)     // Catch: java.lang.Exception -> L1d6
        L1d6:
            r4 = r28
            r3 = 0
            goto L3e
        L1db:
            return
    }

    public void a(java.lang.String r6, a.a.a.g.a r7, a.a.a.g.k r8, com.baidu.location.c r9) {
            r5 = this;
            boolean r0 = r5.k
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = r7.e()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L1a
            a.a.a.b.o r0 = a.a.a.b.o.q()
            boolean r0 = r0.e()
            if (r0 != 0) goto L18
            goto L1a
        L18:
            r0 = r1
            goto L1b
        L1a:
            r0 = r2
        L1b:
            if (r9 == 0) goto L3e
            int r3 = r9.r()
            r4 = 161(0xa1, float:2.26E-43)
            if (r3 != r4) goto L3e
            java.lang.String r3 = r9.v()
            java.lang.String r4 = "wf"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L3c
            float r3 = r9.z()
            r4 = 1133903872(0x43960000, float:300.0)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 < 0) goto L3c
            goto L3e
        L3c:
            r3 = r1
            goto L3f
        L3e:
            r3 = r2
        L3f:
            java.util.List<android.net.wifi.ScanResult> r4 = r8.f295a
            if (r4 != 0) goto L44
            r3 = r2
        L44:
            if (r0 == 0) goto L49
            if (r3 == 0) goto L49
            return
        L49:
            boolean r0 = r5.i
            if (r0 == 0) goto L4e
            return
        L4e:
            r5.i = r2
            a.a.a.f.a$c r0 = new a.a.a.f.a$c
            r3 = 0
            r0.<init>(r5, r3)
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r1] = r6
            r5[r2] = r7
            r6 = 2
            r5[r6] = r8
            r6 = 3
            r5[r6] = r9
            r0.execute(r5)
            return
    }

    public final void a(java.lang.String r21, a.a.a.g.a r22, android.database.sqlite.SQLiteDatabase r23) {
            r20 = this;
            r0 = r23
            java.lang.String r1 = "clf"
            boolean r2 = r22.e()
            if (r2 == 0) goto L12c
            a.a.a.b.o r2 = a.a.a.b.o.q()
            boolean r2 = r2.e()
            if (r2 != 0) goto L16
            goto L12c
        L16:
            java.lang.System.currentTimeMillis()
            r2 = 0
            long r3 = java.lang.System.currentTimeMillis()
            r5 = 28
            long r3 = r3 >> r5
            int r3 = (int) r3
            a.a.a.g.f r4 = a.a.a.g.f.w()
            r5 = r22
            java.lang.String r4 = r4.d(r5)
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Exception -> L12c
            r6 = r21
            r5.<init>(r6)     // Catch: java.lang.Exception -> L12c
            java.lang.String r6 = "result"
            org.json.JSONObject r6 = r5.getJSONObject(r6)     // Catch: java.lang.Exception -> L12c
            java.lang.String r7 = "error"
            java.lang.String r6 = r6.getString(r7)     // Catch: java.lang.Exception -> L12c
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.Exception -> L12c
            r7 = 161(0xa1, float:2.26E-43)
            java.lang.String r8 = "\""
            r9 = 0
            java.lang.String r10 = "id = \""
            r11 = 1
            r12 = 0
            r14 = 0
            java.lang.String r15 = "bdcltb09"
            if (r6 != r7) goto Lb2
            java.lang.String r6 = "content"
            org.json.JSONObject r5 = r5.getJSONObject(r6)     // Catch: java.lang.Exception -> L12c
            boolean r6 = r5.has(r1)     // Catch: java.lang.Exception -> L12c
            if (r6 == 0) goto Lcc
            java.lang.String r1 = r5.getString(r1)     // Catch: java.lang.Exception -> L12c
            java.lang.String r2 = "0"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L12c
            if (r2 == 0) goto L8c
            java.lang.String r1 = "point"
            org.json.JSONObject r1 = r5.getJSONObject(r1)     // Catch: java.lang.Exception -> L12c
            java.lang.String r2 = "x"
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Exception -> L12c
            double r6 = java.lang.Double.parseDouble(r2)     // Catch: java.lang.Exception -> L12c
            java.lang.String r2 = "y"
            java.lang.String r1 = r1.getString(r2)     // Catch: java.lang.Exception -> L12c
            double r1 = java.lang.Double.parseDouble(r1)     // Catch: java.lang.Exception -> L12c
            java.lang.String r11 = "radius"
            java.lang.String r5 = r5.getString(r11)     // Catch: java.lang.Exception -> L12c
            r12 = r6
            goto La7
        L8c:
            java.lang.String r2 = "\\|"
            java.lang.String[] r1 = r1.split(r2)     // Catch: java.lang.Exception -> L12c
            r2 = r1[r9]     // Catch: java.lang.Exception -> L12c
            double r5 = java.lang.Double.parseDouble(r2)     // Catch: java.lang.Exception -> L12c
            r2 = r1[r11]     // Catch: java.lang.Exception -> L12c
            double r11 = java.lang.Double.parseDouble(r2)     // Catch: java.lang.Exception -> L12c
            r2 = 2
            r1 = r1[r2]     // Catch: java.lang.Exception -> L12c
            r18 = r5
            r5 = r1
            r1 = r11
            r12 = r18
        La7:
            float r5 = java.lang.Float.parseFloat(r5)     // Catch: java.lang.Exception -> L12c
            r18 = r1
            r2 = r5
            r5 = r12
            r12 = r18
            goto Lce
        Lb2:
            r1 = 167(0xa7, float:2.34E-43)
            if (r6 != r1) goto Lcc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L12c
            r1.<init>()     // Catch: java.lang.Exception -> L12c
            r1.append(r10)     // Catch: java.lang.Exception -> L12c
            r1.append(r4)     // Catch: java.lang.Exception -> L12c
            r1.append(r8)     // Catch: java.lang.Exception -> L12c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L12c
            r0.delete(r15, r1, r14)     // Catch: java.lang.Exception -> L12c
            return
        Lcc:
            r9 = r11
            r5 = r12
        Lce:
            if (r9 == 0) goto Ld1
            return
        Ld1:
            r16 = 4653148304163072062(0x40934dbaacd9e83e, double:1235.4323)
            double r5 = r5 + r16
            r16 = 4657424210545395263(0x40a27ea4b5dcc63f, double:2367.3217)
            double r12 = r12 + r16
            r1 = 1166487552(0x45873000, float:4326.0)
            float r2 = r2 + r1
            android.content.ContentValues r1 = new android.content.ContentValues
            r1.<init>()
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            java.lang.String r6 = "time"
            r1.put(r6, r5)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.String r5 = "tag"
            r1.put(r5, r2)
            java.lang.Double r2 = java.lang.Double.valueOf(r12)
            java.lang.String r5 = "type"
            r1.put(r5, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = "ac"
            r1.put(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L12c
            r2.<init>()     // Catch: java.lang.Exception -> L12c
            r2.append(r10)     // Catch: java.lang.Exception -> L12c
            r2.append(r4)     // Catch: java.lang.Exception -> L12c
            r2.append(r8)     // Catch: java.lang.Exception -> L12c
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L12c
            int r2 = r0.update(r15, r1, r2, r14)     // Catch: java.lang.Exception -> L12c
            if (r2 > 0) goto L12c
            java.lang.String r2 = "id"
            r1.put(r2, r4)     // Catch: java.lang.Exception -> L12c
            r0.insert(r15, r14, r1)     // Catch: java.lang.Exception -> L12c
        L12c:
            return
    }

    public final void a(java.lang.String r7, android.database.sqlite.SQLiteDatabase r8) {
            r6 = this;
            if (r7 == 0) goto L59
            java.lang.String r0 = r6.f211a
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto Lb
            goto L59
        Lb:
            r0 = 0
            r6.f212b = r0
            r1 = 0
            java.lang.String r2 = "select * from bdcltb09 where id = ?"
            r3 = 1
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L54
            r4[r0] = r7     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L54
            android.database.Cursor r1 = r8.rawQuery(r2, r4)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L54
            r6.f211a = r7     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L54
            boolean r7 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L54
            if (r7 == 0) goto L4a
            double r7 = r1.getDouble(r3)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L54
            r4 = 4653148304163072062(0x40934dbaacd9e83e, double:1235.4323)
            double r7 = r7 - r4
            r6.e = r7     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L54
            r7 = 2
            double r7 = r1.getDouble(r7)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L54
            r4 = 4661478502002851840(0x40b0e60000000000, double:4326.0)
            double r7 = r7 - r4
            r6.d = r7     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L54
            r7 = 3
            double r7 = r1.getDouble(r7)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L54
            r4 = 4657424210545395263(0x40a27ea4b5dcc63f, double:2367.3217)
            double r7 = r7 - r4
            r6.f = r7     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L54
            r6.f212b = r3     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L54
        L4a:
            if (r1 == 0) goto L59
            goto L56
        L4d:
            r6 = move-exception
            if (r1 == 0) goto L53
            r1.close()     // Catch: java.lang.Exception -> L53
        L53:
            throw r6
        L54:
            if (r1 == 0) goto L59
        L56:
            r1.close()     // Catch: java.lang.Exception -> L59
        L59:
            return
    }

    public final void a(java.lang.String r3, java.util.List<android.net.wifi.ScanResult> r4) {
            r2 = this;
            r0 = 0
            r2.f212b = r0
            r2.f213c = r0
            r0 = 0
            java.lang.String r1 = a.a.a.f.a.n     // Catch: java.lang.Throwable -> Lc
            android.database.sqlite.SQLiteDatabase r0 = android.database.sqlite.SQLiteDatabase.openOrCreateDatabase(r1, r0)     // Catch: java.lang.Throwable -> Lc
        Lc:
            if (r3 == 0) goto L13
            if (r0 == 0) goto L13
            r2.a(r3, r0)
        L13:
            if (r4 == 0) goto L1a
            if (r0 == 0) goto L1a
            r2.a(r4, r0)
        L1a:
            if (r0 == 0) goto L25
            boolean r2 = r0.isOpen()
            if (r2 == 0) goto L25
            r0.close()
        L25:
            return
    }

    public final void a(java.util.List<android.net.wifi.ScanResult> r30, android.database.sqlite.SQLiteDatabase r31) {
            r29 = this;
            r0 = r29
            r1 = r31
            java.lang.System.currentTimeMillis()
            r2 = 0
            r0.f213c = r2
            if (r30 == 0) goto L189
            int r3 = r30.size()
            if (r3 != 0) goto L14
            goto L189
        L14:
            if (r1 == 0) goto L189
            if (r30 != 0) goto L1a
            goto L189
        L1a:
            r3 = 8
            double[] r4 = new double[r3]
            java.lang.StringBuffer r5 = new java.lang.StringBuffer
            r5.<init>()
            java.util.Iterator r6 = r30.iterator()
            r7 = r2
        L28:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L5c
            java.lang.Object r8 = r6.next()
            android.net.wifi.ScanResult r8 = (android.net.wifi.ScanResult) r8
            r9 = 10
            if (r7 <= r9) goto L39
            goto L5c
        L39:
            if (r7 <= 0) goto L40
            java.lang.String r9 = ","
            r5.append(r9)
        L40:
            int r7 = r7 + 1
            java.lang.String r8 = r8.BSSID
            java.lang.String r9 = ":"
            java.lang.String r10 = ""
            java.lang.String r8 = r8.replace(r9, r10)
            java.lang.String r8 = com.baidu.location.Jni.c(r8)
            java.lang.String r9 = "\""
            r5.append(r9)
            r5.append(r8)
            r5.append(r9)
            goto L28
        L5c:
            r6 = 0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17d java.lang.Exception -> L184
            r7.<init>()     // Catch: java.lang.Throwable -> L17d java.lang.Exception -> L184
            java.lang.String r8 = "select * from wof where id in ("
            r7.append(r8)     // Catch: java.lang.Throwable -> L17d java.lang.Exception -> L184
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L17d java.lang.Exception -> L184
            r7.append(r5)     // Catch: java.lang.Throwable -> L17d java.lang.Exception -> L184
            java.lang.String r5 = ");"
            r7.append(r5)     // Catch: java.lang.Throwable -> L17d java.lang.Exception -> L184
            java.lang.String r5 = r7.toString()     // Catch: java.lang.Throwable -> L17d java.lang.Exception -> L184
            android.database.Cursor r6 = r1.rawQuery(r5, r6)     // Catch: java.lang.Throwable -> L17d java.lang.Exception -> L184
            boolean r1 = r6.moveToFirst()     // Catch: java.lang.Throwable -> L17d java.lang.Exception -> L184
            if (r1 == 0) goto L17a
            r7 = 0
            r1 = r2
            r5 = r1
            r11 = r5
            r12 = r11
            r9 = r7
        L88:
            boolean r13 = r6.isAfterLast()     // Catch: java.lang.Throwable -> L17d java.lang.Exception -> L184
            r14 = 1
            if (r13 != 0) goto L16e
            double r15 = r6.getDouble(r14)     // Catch: java.lang.Throwable -> L17d java.lang.Exception -> L184
            r17 = 4637668614646953253(0x405c4f089a027525, double:113.2349)
            double r15 = r15 - r17
            r13 = 2
            double r17 = r6.getDouble(r13)     // Catch: java.lang.Throwable -> L17d java.lang.Exception -> L184
            r19 = 4646309618475430891(0x407b01fb15b573eb, double:432.1238)
            double r17 = r17 - r19
            r13 = 4
            int r2 = r6.getInt(r13)     // Catch: java.lang.Throwable -> L17d java.lang.Exception -> L184
            r13 = 5
            int r13 = r6.getInt(r13)     // Catch: java.lang.Throwable -> L17d java.lang.Exception -> L184
            if (r13 <= r3) goto Lb7
            if (r13 <= r2) goto Lb7
            r28 = r4
            goto L107
        Lb7:
            boolean r2 = r0.f212b     // Catch: java.lang.Throwable -> L17d java.lang.Exception -> L184
            if (r2 == 0) goto Le9
            float[] r2 = new float[r14]     // Catch: java.lang.Throwable -> L17d java.lang.Exception -> L184
            r28 = r4
            double r3 = r0.f     // Catch: java.lang.Throwable -> L17d java.lang.Exception -> L184
            double r13 = r0.e     // Catch: java.lang.Throwable -> L17d java.lang.Exception -> L184
            r19 = r17
            r21 = r15
            r23 = r3
            r25 = r13
            r27 = r2
            android.location.Location.distanceBetween(r19, r21, r23, r25, r27)     // Catch: java.lang.Throwable -> L17d java.lang.Exception -> L184
            r3 = 0
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L17d java.lang.Exception -> L184
            double r2 = (double) r2     // Catch: java.lang.Throwable -> L17d java.lang.Exception -> L184
            double r13 = r0.d     // Catch: java.lang.Throwable -> L17d java.lang.Exception -> L184
            r19 = 4656510908468559872(0x409f400000000000, double:2000.0)
            double r13 = r13 + r19
            int r2 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r2 <= 0) goto Le2
            goto L107
        Le2:
            double r7 = r7 + r15
            double r9 = r9 + r17
            int r12 = r12 + 1
            r1 = 1
            goto L10b
        Le9:
            r28 = r4
            r2 = 1148846080(0x447a0000, float:1000.0)
            if (r1 == 0) goto L110
            r3 = 1
            float[] r4 = new float[r3]     // Catch: java.lang.Throwable -> L17d java.lang.Exception -> L184
            double r13 = (double) r12     // Catch: java.lang.Throwable -> L17d java.lang.Exception -> L184
            double r23 = r9 / r13
            double r25 = r7 / r13
            r19 = r17
            r21 = r15
            r27 = r4
            android.location.Location.distanceBetween(r19, r21, r23, r25, r27)     // Catch: java.lang.Throwable -> L17d java.lang.Exception -> L184
            r3 = 0
            r4 = r4[r3]     // Catch: java.lang.Throwable -> L17d java.lang.Exception -> L184
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L10b
        L107:
            r2 = 8
            r14 = 0
            goto L165
        L10b:
            r2 = 8
            r3 = 4
        L10e:
            r14 = 0
            goto L162
        L110:
            if (r5 != 0) goto L11f
            int r2 = r11 + 1
            r28[r11] = r15     // Catch: java.lang.Throwable -> L17d java.lang.Exception -> L184
            int r11 = r2 + 1
            r28[r2] = r17     // Catch: java.lang.Throwable -> L17d java.lang.Exception -> L184
            r2 = 8
            r3 = 4
            r5 = 1
            goto L10e
        L11f:
            r3 = 0
        L120:
            if (r3 >= r11) goto L149
            r4 = 1
            float[] r13 = new float[r4]     // Catch: java.lang.Throwable -> L17d java.lang.Exception -> L184
            int r4 = r3 + 1
            r23 = r28[r4]     // Catch: java.lang.Throwable -> L17d java.lang.Exception -> L184
            r25 = r28[r3]     // Catch: java.lang.Throwable -> L17d java.lang.Exception -> L184
            r19 = r17
            r21 = r15
            r27 = r13
            android.location.Location.distanceBetween(r19, r21, r23, r25, r27)     // Catch: java.lang.Throwable -> L17d java.lang.Exception -> L184
            r14 = 0
            r13 = r13[r14]     // Catch: java.lang.Throwable -> L17d java.lang.Exception -> L184
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 >= 0) goto L146
            r19 = r28[r3]     // Catch: java.lang.Throwable -> L17d java.lang.Exception -> L184
            double r7 = r7 + r19
            r19 = r28[r4]     // Catch: java.lang.Throwable -> L17d java.lang.Exception -> L184
            double r9 = r9 + r19
            int r12 = r12 + 1
            r1 = 1
        L146:
            int r3 = r3 + 2
            goto L120
        L149:
            r14 = 0
            if (r1 == 0) goto L155
            double r7 = r7 + r15
            double r9 = r9 + r17
            int r12 = r12 + 1
            r2 = 8
        L153:
            r3 = 4
            goto L162
        L155:
            r2 = 8
            if (r11 >= r2) goto L16e
            int r3 = r11 + 1
            r28[r11] = r15     // Catch: java.lang.Throwable -> L17d java.lang.Exception -> L184
            int r11 = r3 + 1
            r28[r3] = r17     // Catch: java.lang.Throwable -> L17d java.lang.Exception -> L184
            goto L153
        L162:
            if (r12 <= r3) goto L165
            goto L16e
        L165:
            r6.moveToNext()     // Catch: java.lang.Throwable -> L17d java.lang.Exception -> L184
            r3 = r2
            r2 = r14
            r4 = r28
            goto L88
        L16e:
            if (r12 <= 0) goto L17a
            r1 = 1
            r0.f213c = r1     // Catch: java.lang.Throwable -> L17d java.lang.Exception -> L184
            double r1 = (double) r12     // Catch: java.lang.Throwable -> L17d java.lang.Exception -> L184
            double r7 = r7 / r1
            r0.g = r7     // Catch: java.lang.Throwable -> L17d java.lang.Exception -> L184
            double r9 = r9 / r1
            r0.h = r9     // Catch: java.lang.Throwable -> L17d java.lang.Exception -> L184
        L17a:
            if (r6 == 0) goto L189
            goto L186
        L17d:
            r0 = move-exception
            if (r6 == 0) goto L183
            r6.close()     // Catch: java.lang.Exception -> L183
        L183:
            throw r0
        L184:
            if (r6 == 0) goto L189
        L186:
            r6.close()     // Catch: java.lang.Exception -> L189
        L189:
            return
    }

    public com.baidu.location.c b(boolean r10) {
            r9 = this;
            boolean r10 = r9.k
            if (r10 != 0) goto L24
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "{\"result\":{\"time\":\""
            r9.append(r10)
            java.lang.String r10 = a.a.a.i.i.i()
            r9.append(r10)
            java.lang.String r10 = "\",\"error\":\"67\"}}"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.baidu.location.c r10 = new com.baidu.location.c
            r10.<init>(r9)
            return r10
        L24:
            a.a.a.g.f r10 = a.a.a.g.f.w()
            a.a.a.g.a r10 = r10.a()
            r0 = 0
            if (r10 == 0) goto L3e
            boolean r1 = r10.d()
            if (r1 == 0) goto L3e
            a.a.a.g.f r1 = a.a.a.g.f.w()
            java.lang.String r1 = r1.d(r10)
            goto L3f
        L3e:
            r1 = r0
        L3f:
            a.a.a.g.f r2 = a.a.a.g.f.w()
            a.a.a.g.k r2 = r2.j()
            r3 = 1
            if (r2 == 0) goto L50
            java.util.List<android.net.wifi.ScanResult> r0 = r2.f295a
            com.baidu.location.c r0 = r9.a(r1, r0, r3)
        L50:
            if (r0 == 0) goto Ldf
            int r9 = r0.r()
            r1 = 66
            if (r9 != r1) goto Ldf
            java.lang.StringBuffer r9 = new java.lang.StringBuffer
            r1 = 1024(0x400, float:1.435E-42)
            r9.<init>(r1)
            java.util.Locale r1 = java.util.Locale.CHINA
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            double r5 = r0.q()
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            r6 = 0
            r4[r6] = r5
            double r7 = r0.t()
            java.lang.Double r5 = java.lang.Double.valueOf(r7)
            r4[r3] = r5
            float r3 = r0.z()
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r5 = 2
            r4[r5] = r3
            java.lang.String r3 = "&ofl=%f|%f|%f"
            java.lang.String r1 = java.lang.String.format(r1, r3, r4)
            r9.append(r1)
            if (r2 == 0) goto La9
            int r1 = r2.c()
            if (r1 <= 0) goto La9
            java.lang.String r1 = "&wf="
            r9.append(r1)
            a.a.a.g.f r1 = a.a.a.g.f.w()
            r3 = 15
            java.lang.String r1 = r1.b(r3, r2)
            r9.append(r1)
        La9:
            if (r10 == 0) goto Lb6
            a.a.a.g.f r1 = a.a.a.g.f.w()
            java.lang.String r10 = r1.a(r10)
            r9.append(r10)
        Lb6:
            java.lang.String r10 = "&uptype=oldoff"
            r9.append(r10)
            android.content.Context r10 = com.baidu.location.f.c()
            java.lang.String r10 = a.a.a.i.i.d(r10)
            r9.append(r10)
            a.a.a.i.b r10 = a.a.a.i.b.e()
            java.lang.String r10 = r10.a(r6)
            r9.append(r10)
            a.a.a.b.c r10 = a.a.a.b.c.h()
            java.lang.String r10 = r10.d()
            r9.append(r10)
            r9.toString()
        Ldf:
            return r0
    }

    public void b() {
            r3 = this;
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = a.a.a.f.a.m     // Catch: java.lang.Throwable -> L3f
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L3f
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = a.a.a.f.a.n     // Catch: java.lang.Throwable -> L3f
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L3f
            boolean r2 = r0.exists()     // Catch: java.lang.Throwable -> L3f
            if (r2 != 0) goto L17
            r0.mkdirs()     // Catch: java.lang.Throwable -> L3f
        L17:
            boolean r0 = r1.exists()     // Catch: java.lang.Throwable -> L3f
            if (r0 != 0) goto L20
            r1.createNewFile()     // Catch: java.lang.Throwable -> L3f
        L20:
            boolean r0 = r1.exists()     // Catch: java.lang.Throwable -> L3f
            r2 = 1
            if (r0 == 0) goto L3c
            r0 = 0
            android.database.sqlite.SQLiteDatabase r0 = android.database.sqlite.SQLiteDatabase.openOrCreateDatabase(r1, r0)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = "CREATE TABLE IF NOT EXISTS bdcltb09(id CHAR(40) PRIMARY KEY,time DOUBLE,tag DOUBLE, type DOUBLE , ac INT);"
            r0.execSQL(r1)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = "CREATE TABLE IF NOT EXISTS wof(id CHAR(15) PRIMARY KEY,mktime DOUBLE,time DOUBLE, ac INT, bc INT, cc INT);"
            r0.execSQL(r1)     // Catch: java.lang.Throwable -> L3f
            r0.setVersion(r2)     // Catch: java.lang.Throwable -> L3f
            r0.close()     // Catch: java.lang.Throwable -> L3f
        L3c:
            r3.k = r2     // Catch: java.lang.Throwable -> L3f
            goto L42
        L3f:
            r0 = 0
            r3.k = r0
        L42:
            return
    }

    public void c() {
            r4 = this;
            android.os.Handler r0 = r4.j
            if (r0 != 0) goto Lb
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r4.j = r0
        Lb:
            android.os.Handler r0 = r4.j
            a.a.a.f.a$a r1 = new a.a.a.f.a$a
            r1.<init>(r4)
            r2 = 3000(0xbb8, double:1.482E-320)
            r0.postDelayed(r1, r2)
            return
    }
}
