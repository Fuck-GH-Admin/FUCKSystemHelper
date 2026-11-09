package a.a.a.f;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final java.lang.String d = null;
    public static final java.lang.String e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.String f244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.database.sqlite.SQLiteDatabase f245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a.a.a.f.f.a f246c;

    public class a extends a.a.a.i.g {
        public int i;
        public long j;
        public java.lang.String k;
        public boolean l;
        public boolean m;
        public a.a.a.f.f n;

        public a(a.a.a.f.f r1, a.a.a.f.f r2) {
                r0 = this;
                r0.<init>()
                r0.n = r2
                r1 = 0
                r0.k = r1
                r1 = 0
                r0.l = r1
                r0.m = r1
                java.util.HashMap r2 = new java.util.HashMap
                r2.<init>()
                r0.d = r2
                r0.i = r1
                r1 = -1
                r0.j = r1
                return
        }

        public static /* synthetic */ void a(a.a.a.f.f.a r0) {
                r0.b()
                return
        }

        @Override // a.a.a.i.g
        public void a() {
                r3 = this;
                java.util.Map<java.lang.String, java.lang.Object> r0 = r3.d
                r0.clear()
                java.util.Map<java.lang.String, java.lang.Object> r0 = r3.d
                java.lang.String r1 = "qt"
                java.lang.String r2 = "ofbh"
                r0.put(r1, r2)
                java.util.Map<java.lang.String, java.lang.Object> r0 = r3.d
                java.lang.String r1 = r3.k
                java.lang.String r2 = "req"
                r0.put(r2, r1)
                java.lang.String r0 = a.a.a.f.d.j
                r3.f337a = r0
                return
        }

        @Override // a.a.a.i.g
        public void a(boolean r5) {
                r4 = this;
                java.lang.String r0 = "error"
                r1 = 0
                r4.m = r1
                r2 = 1
                if (r5 == 0) goto L21
                java.lang.String r5 = r4.f339c
                if (r5 == 0) goto L21
                org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L21
                r3.<init>(r5)     // Catch: java.lang.Exception -> L21
                boolean r5 = r3.has(r0)     // Catch: java.lang.Exception -> L21
                if (r5 == 0) goto L21
                int r5 = r3.getInt(r0)     // Catch: java.lang.Exception -> L21
                r0 = 161(0xa1, float:2.26E-43)
                if (r5 != r0) goto L21
                r4.m = r2     // Catch: java.lang.Exception -> L21
            L21:
                boolean r5 = r4.m
                if (r5 != 0) goto L30
                int r5 = r4.i
                int r5 = r5 + r2
                r4.i = r5
                long r2 = java.lang.System.currentTimeMillis()
                r4.j = r2
            L30:
                a.a.a.f.f r5 = r4.n
                boolean r0 = r4.m
                a.a.a.f.f.a(r5, r0)
                r4.l = r1
                return
        }

        public final void b() {
                r6 = this;
                boolean r0 = r6.l
                if (r0 != 0) goto L44
                a.a.a.f.f r0 = r6.n
                java.lang.String r0 = a.a.a.f.f.a(r0)
                r6.k = r0
                long r0 = r6.j
                r2 = -1
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L25
                r4 = 86400000(0x5265c00, double:4.2687272E-316)
                long r0 = r0 + r4
                long r4 = java.lang.System.currentTimeMillis()
                int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r0 > 0) goto L25
                r0 = 0
                r6.i = r0
                r6.j = r2
            L25:
                java.lang.String r0 = r6.k
                if (r0 == 0) goto L44
                int r0 = r6.i
                r1 = 2
                if (r0 >= r1) goto L44
                r0 = 1
                r6.l = r0
                a.a.a.b.w r0 = a.a.a.b.w.d()
                java.util.concurrent.ExecutorService r0 = r0.b()
                java.lang.String r1 = "https://ofloc.map.baidu.com/offline_loc"
                if (r0 == 0) goto L41
                r6.a(r0, r1)
                goto L44
            L41:
                r6.a(r1)
            L44:
                return
        }
    }

    static {
            java.util.Locale r0 = java.util.Locale.US
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 3000(0xbb8, float:4.204E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "DELETE FROM LOG WHERE timestamp NOT IN (SELECT timestamp FROM LOG ORDER BY timestamp DESC LIMIT %d);"
            java.lang.String r2 = java.lang.String.format(r0, r3, r2)
            a.a.a.f.f.d = r2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r4] = r2
            java.lang.String r2 = "SELECT * FROM LOG ORDER BY timestamp DESC LIMIT %d;"
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            a.a.a.f.f.e = r0
            return
    }

    public f(android.database.sqlite.SQLiteDatabase r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f244a = r0
            r1.f245b = r2
            a.a.a.f.f$a r0 = new a.a.a.f.f$a
            r0.<init>(r1, r1)
            r1.f246c = r0
            if (r2 == 0) goto L1c
            boolean r1 = r2.isOpen()
            if (r1 == 0) goto L1c
            java.lang.String r1 = "CREATE TABLE IF NOT EXISTS LOG(timestamp LONG PRIMARY KEY, log VARCHAR(4000))"
            r2.execSQL(r1)     // Catch: java.lang.Exception -> L1c
        L1c:
            return
    }

    public static /* synthetic */ java.lang.String a(a.a.a.f.f r0) {
            java.lang.String r0 = r0.a()
            return r0
    }

    public static /* synthetic */ void a(a.a.a.f.f r0, boolean r1) {
            r0.a(r1)
            return
    }

    public final java.lang.String a() {
            r7 = this;
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r7.f245b     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L69
            java.lang.String r4 = a.a.a.f.f.e     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L69
            android.database.Cursor r3 = r3.rawQuery(r4, r2)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L69
            if (r3 == 0) goto L5f
            int r4 = r3.getCount()     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5c
            if (r4 <= 0) goto L5f
            java.lang.StringBuffer r4 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5c
            r4.<init>()     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5c
            r3.moveToFirst()     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5c
        L23:
            boolean r5 = r3.isAfterLast()     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5c
            if (r5 != 0) goto L48
            r5 = 1
            java.lang.String r5 = r3.getString(r5)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5c
            r0.put(r5)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5c
            int r5 = r4.length()     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5c
            if (r5 == 0) goto L3c
            java.lang.String r5 = ","
            r4.append(r5)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5c
        L3c:
            r5 = 0
            long r5 = r3.getLong(r5)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5c
            r4.append(r5)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5c
            r3.moveToNext()     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5c
            goto L23
        L48:
            java.lang.String r5 = "ofloc"
            r1.put(r5, r0)     // Catch: org.json.JSONException -> L52 java.lang.Throwable -> L59 java.lang.Exception -> L5c
            java.lang.String r0 = r1.toString()     // Catch: org.json.JSONException -> L52 java.lang.Throwable -> L59 java.lang.Exception -> L5c
            r2 = r0
        L52:
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5c
            r7.f244a = r0     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5c
            goto L5f
        L59:
            r7 = move-exception
            r2 = r3
            goto L63
        L5c:
            r7 = r2
            r2 = r3
            goto L6a
        L5f:
            if (r3 == 0) goto L73
            goto L6e
        L62:
            r7 = move-exception
        L63:
            if (r2 == 0) goto L68
            r2.close()     // Catch: java.lang.Exception -> L68
        L68:
            throw r7
        L69:
            r7 = r2
        L6a:
            if (r2 == 0) goto L72
            r3 = r2
            r2 = r7
        L6e:
            r3.close()     // Catch: java.lang.Exception -> L73
            goto L73
        L72:
            r2 = r7
        L73:
            return r2
    }

    public void a(java.lang.String r5) {
            r4 = this;
            java.lang.String r5 = com.baidu.location.Jni.e(r5)
            java.util.Locale r0 = java.util.Locale.US
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            r2 = 1
            r1[r2] = r5
            java.lang.String r5 = "INSERT OR IGNORE INTO LOG VALUES (%d,\"%s\");"
            java.lang.String r5 = java.lang.String.format(r0, r5, r1)
            android.database.sqlite.SQLiteDatabase r0 = r4.f245b     // Catch: java.lang.Exception -> L29
            r0.execSQL(r5)     // Catch: java.lang.Exception -> L29
            android.database.sqlite.SQLiteDatabase r4 = r4.f245b     // Catch: java.lang.Exception -> L29
            java.lang.String r5 = a.a.a.f.f.d     // Catch: java.lang.Exception -> L29
            r4.execSQL(r5)     // Catch: java.lang.Exception -> L29
        L29:
            return
    }

    public final void a(boolean r3) {
            r2 = this;
            if (r3 == 0) goto L1f
            java.lang.String r3 = r2.f244a
            if (r3 == 0) goto L1f
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            java.lang.String r3 = "DELETE FROM LOG WHERE timestamp in (%s);"
            java.lang.String r3 = java.lang.String.format(r3, r0)
            java.lang.String r0 = r2.f244a     // Catch: java.lang.Exception -> L1f
            int r0 = r0.length()     // Catch: java.lang.Exception -> L1f
            if (r0 <= 0) goto L1f
            android.database.sqlite.SQLiteDatabase r0 = r2.f245b     // Catch: java.lang.Exception -> L1f
            r0.execSQL(r3)     // Catch: java.lang.Exception -> L1f
        L1f:
            r3 = 0
            r2.f244a = r3
            return
    }

    public void b() {
            r0 = this;
            a.a.a.f.f$a r0 = r0.f246c
            a.a.a.f.f.a.a(r0)
            return
    }
}
