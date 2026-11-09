package a.a.a.b;

/* JADX INFO: loaded from: classes.dex */
public class l {
    public static java.lang.Object f;
    public static a.a.a.b.l g;
    public static final java.lang.String h = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public android.database.sqlite.SQLiteDatabase f45a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f46b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a.a.a.b.l.a f47c;
    public java.lang.String d;
    public int e;

    public class a extends a.a.a.i.g {
        public java.lang.String i;
        public java.lang.String j;
        public boolean k;
        public final /* synthetic */ a.a.a.b.l l;

        public a(a.a.a.b.l r1) {
                r0 = this;
                r0.l = r1
                r0.<init>()
                r1 = 0
                r0.i = r1
                r0.j = r1
                r1 = 1
                r0.k = r1
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                r0.d = r1
                return
        }

        @Override // a.a.a.i.g
        public void a() {
                r2 = this;
                r0 = 1
                r2.f338b = r0
                a.a.a.g.f r0 = a.a.a.g.f.w()
                java.lang.String r0 = r0.k()
                if (r0 == 0) goto L13
                java.lang.String r0 = com.baidu.location.Jni.f(r0)
                r2.f = r0
            L13:
                java.lang.String r0 = r2.j
                java.lang.String r0 = com.baidu.location.Jni.f(r0)
                r1 = 0
                r2.j = r1
                java.util.Map<java.lang.String, java.lang.Object> r2 = r2.d
                java.lang.String r1 = "bloc"
                r2.put(r1, r0)
                return
        }

        public void a(java.lang.String r3, java.lang.String r4) {
                r2 = this;
                a.a.a.b.l r0 = r2.l
                boolean r0 = a.a.a.b.l.c(r0)
                if (r0 != 0) goto L45
                a.a.a.b.l r0 = r2.l
                r1 = 1
                a.a.a.b.l.a(r0, r1)
                r2.i = r3
                a.a.a.b.n r3 = a.a.a.b.n.b()
                boolean r3 = r3.a()
                if (r3 == 0) goto L2e
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r4)
                java.lang.String r4 = "&enc=2"
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                r2.j = r3
                goto L30
            L2e:
                r2.j = r4
            L30:
                a.a.a.b.w r3 = a.a.a.b.w.d()
                java.util.concurrent.ExecutorService r3 = r3.b()
                if (r3 == 0) goto L40
                java.lang.String r4 = a.a.a.i.d.f324b
                r2.a(r3, r4)
                goto L45
            L40:
                java.lang.String r3 = a.a.a.i.d.f324b
                r2.a(r3)
            L45:
                return
        }

        @Override // a.a.a.i.g
        public void a(boolean r11) {
                r10 = this;
                java.lang.String r0 = "hstdata"
                java.lang.String r1 = "mac"
                java.lang.String r2 = "content"
                java.lang.String r3 = "imo"
                java.lang.String r4 = "enc"
                if (r11 == 0) goto Lea
                java.lang.String r11 = r10.f339c
                if (r11 == 0) goto Lea
                boolean r5 = r11.contains(r4)     // Catch: java.lang.Exception -> Lf3
                if (r5 == 0) goto L3c
                a.a.a.b.n r5 = a.a.a.b.n.b()     // Catch: java.lang.Exception -> Lf3
                boolean r5 = r5.a()     // Catch: java.lang.Exception -> Lf3
                if (r5 == 0) goto L3c
                org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Exception -> L38
                r5.<init>(r11)     // Catch: java.lang.Exception -> L38
                boolean r6 = r5.has(r4)     // Catch: java.lang.Exception -> L38
                if (r6 == 0) goto L3c
                java.lang.String r4 = r5.getString(r4)     // Catch: java.lang.Exception -> L38
                a.a.a.b.n r5 = a.a.a.b.n.b()     // Catch: java.lang.Exception -> L38
                java.lang.String r11 = r5.a(r4)     // Catch: java.lang.Exception -> L38
                goto L3c
            L38:
                r4 = move-exception
                r4.printStackTrace()     // Catch: java.lang.Exception -> Lf3
            L3c:
                boolean r4 = r10.k     // Catch: java.lang.Exception -> Lf3
                if (r4 == 0) goto Lf3
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lf3
                r4.<init>(r11)     // Catch: java.lang.Exception -> Lf3
                boolean r11 = r4.has(r2)     // Catch: java.lang.Exception -> Lf3
                r5 = 0
                if (r11 == 0) goto L51
                org.json.JSONObject r11 = r4.getJSONObject(r2)     // Catch: java.lang.Exception -> Lf3
                goto L52
            L51:
                r11 = r5
            L52:
                if (r11 == 0) goto Lf3
                boolean r2 = r11.has(r3)     // Catch: java.lang.Exception -> Lf3
                if (r2 == 0) goto Lf3
                org.json.JSONObject r2 = r11.getJSONObject(r3)     // Catch: java.lang.Exception -> Lf3
                java.lang.String r2 = r2.getString(r1)     // Catch: java.lang.Exception -> Lf3
                java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Exception -> Lf3
                org.json.JSONObject r11 = r11.getJSONObject(r3)     // Catch: java.lang.Exception -> Lf3
                java.lang.String r3 = "mv"
                int r11 = r11.getInt(r3)     // Catch: java.lang.Exception -> Lf3
                java.lang.String r3 = r10.i     // Catch: java.lang.Exception -> Lf3
                java.lang.Long r3 = com.baidu.location.Jni.d(r3)     // Catch: java.lang.Exception -> Lf3
                long r3 = r3.longValue()     // Catch: java.lang.Exception -> Lf3
                long r6 = r2.longValue()     // Catch: java.lang.Exception -> Lf3
                int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r3 != 0) goto Lf3
                android.content.ContentValues r3 = new android.content.ContentValues     // Catch: java.lang.Exception -> Lf3
                r3.<init>()     // Catch: java.lang.Exception -> Lf3
                java.lang.String r4 = "tt"
                long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> Lf3
                r8 = 1000(0x3e8, double:4.94E-321)
                long r6 = r6 / r8
                int r6 = (int) r6     // Catch: java.lang.Exception -> Lf3
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> Lf3
                r3.put(r4, r6)     // Catch: java.lang.Exception -> Lf3
                java.lang.String r4 = "hst"
                java.lang.Integer r6 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Exception -> Lf3
                r3.put(r4, r6)     // Catch: java.lang.Exception -> Lf3
                a.a.a.b.l r4 = r10.l     // Catch: java.lang.Exception -> Ld1
                android.database.sqlite.SQLiteDatabase r4 = a.a.a.b.l.a(r4)     // Catch: java.lang.Exception -> Ld1
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld1
                r6.<init>()     // Catch: java.lang.Exception -> Ld1
                java.lang.String r7 = "id = \""
                r6.append(r7)     // Catch: java.lang.Exception -> Ld1
                r6.append(r2)     // Catch: java.lang.Exception -> Ld1
                java.lang.String r7 = "\""
                r6.append(r7)     // Catch: java.lang.Exception -> Ld1
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> Ld1
                int r4 = r4.update(r0, r3, r6, r5)     // Catch: java.lang.Exception -> Ld1
                if (r4 > 0) goto Ld1
                java.lang.String r4 = "id"
                r3.put(r4, r2)     // Catch: java.lang.Exception -> Ld1
                a.a.a.b.l r2 = r10.l     // Catch: java.lang.Exception -> Ld1
                android.database.sqlite.SQLiteDatabase r2 = a.a.a.b.l.a(r2)     // Catch: java.lang.Exception -> Ld1
                r2.insert(r0, r5, r3)     // Catch: java.lang.Exception -> Ld1
            Ld1:
                android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Exception -> Lf3
                r0.<init>()     // Catch: java.lang.Exception -> Lf3
                java.lang.String r2 = r10.i     // Catch: java.lang.Exception -> Lf3
                byte[] r2 = r2.getBytes()     // Catch: java.lang.Exception -> Lf3
                r0.putByteArray(r1, r2)     // Catch: java.lang.Exception -> Lf3
                java.lang.String r1 = "hotspot"
                r0.putInt(r1, r11)     // Catch: java.lang.Exception -> Lf3
                a.a.a.b.l r11 = r10.l     // Catch: java.lang.Exception -> Lf3
                a.a.a.b.l.a(r11, r0)     // Catch: java.lang.Exception -> Lf3
                goto Lf3
            Lea:
                boolean r11 = r10.k
                if (r11 == 0) goto Lf3
                a.a.a.b.l r11 = r10.l
                a.a.a.b.l.b(r11)
            Lf3:
                java.util.Map<java.lang.String, java.lang.Object> r11 = r10.d
                if (r11 == 0) goto Lfa
                r11.clear()
            Lfa:
                a.a.a.b.l r10 = r10.l
                r11 = 0
                a.a.a.b.l.a(r10, r11)
                return
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            a.a.a.b.l.f = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = a.a.a.i.i.c()
            r0.append(r1)
            java.lang.String r1 = "/hst.db"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            a.a.a.b.l.h = r0
            return
    }

    public l() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f45a = r0
            r1 = 0
            r2.f46b = r1
            r2.f47c = r0
            r2.d = r0
            r0 = -2
            r2.e = r0
            return
    }

    public static /* synthetic */ android.database.sqlite.SQLiteDatabase a(a.a.a.b.l r0) {
            android.database.sqlite.SQLiteDatabase r0 = r0.f45a
            return r0
    }

    public static /* synthetic */ void a(a.a.a.b.l r0, android.os.Bundle r1) {
            r0.a(r1)
            return
    }

    public static /* synthetic */ boolean a(a.a.a.b.l r0, boolean r1) {
            r0.f46b = r1
            return r1
    }

    public static /* synthetic */ void b(a.a.a.b.l r0) {
            r0.c()
            return
    }

    public static /* synthetic */ boolean c(a.a.a.b.l r0) {
            boolean r0 = r0.f46b
            return r0
    }

    public static a.a.a.b.l f() {
            java.lang.Object r0 = a.a.a.b.l.f
            monitor-enter(r0)
            a.a.a.b.l r1 = a.a.a.b.l.g     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto Le
            a.a.a.b.l r1 = new a.a.a.b.l     // Catch: java.lang.Throwable -> L12
            r1.<init>()     // Catch: java.lang.Throwable -> L12
            a.a.a.b.l.g = r1     // Catch: java.lang.Throwable -> L12
        Le:
            a.a.a.b.l r1 = a.a.a.b.l.g     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return r1
        L12:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1
    }

    public synchronized int a() {
            r10 = this;
            monitor-enter(r10)
            r0 = -3
            boolean r1 = r10.f46b     // Catch: java.lang.Throwable -> L7f
            if (r1 == 0) goto L8
            monitor-exit(r10)
            return r0
        L8:
            a.a.a.g.f r1 = a.a.a.g.f.w()     // Catch: java.lang.Exception -> L7b java.lang.Throwable -> L7f
            boolean r1 = r1.p()     // Catch: java.lang.Exception -> L7b java.lang.Throwable -> L7f
            if (r1 == 0) goto L7b
            android.database.sqlite.SQLiteDatabase r1 = r10.f45a     // Catch: java.lang.Exception -> L7b java.lang.Throwable -> L7f
            if (r1 == 0) goto L7b
            a.a.a.g.f r1 = a.a.a.g.f.w()     // Catch: java.lang.Exception -> L7b java.lang.Throwable -> L7f
            android.net.wifi.WifiInfo r1 = r1.c()     // Catch: java.lang.Exception -> L7b java.lang.Throwable -> L7f
            a.a.a.g.f r2 = a.a.a.g.f.w()     // Catch: java.lang.Exception -> L7b java.lang.Throwable -> L7f
            r3 = 0
            java.lang.String r2 = r2.a(r1, r3)     // Catch: java.lang.Exception -> L7b java.lang.Throwable -> L7f
            if (r1 == 0) goto L7b
            if (r2 == 0) goto L7b
            java.lang.String r1 = ":"
            java.lang.String r4 = ""
            java.lang.String r1 = r2.replace(r1, r4)     // Catch: java.lang.Exception -> L7b java.lang.Throwable -> L7f
            java.lang.Long r2 = com.baidu.location.Jni.d(r1)     // Catch: java.lang.Exception -> L7b java.lang.Throwable -> L7f
            java.lang.String r4 = r10.d     // Catch: java.lang.Exception -> L7b java.lang.Throwable -> L7f
            r5 = -2
            if (r4 == 0) goto L48
            boolean r4 = r1.equals(r4)     // Catch: java.lang.Exception -> L7b java.lang.Throwable -> L7f
            if (r4 == 0) goto L48
            int r4 = r10.e     // Catch: java.lang.Exception -> L7b java.lang.Throwable -> L7f
            if (r4 <= r5) goto L48
            r0 = r4
            goto L7b
        L48:
            android.database.sqlite.SQLiteDatabase r4 = r10.f45a     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L76
            java.lang.String r6 = "select * from hstdata where id = ?"
            r7 = 1
            java.lang.String[] r8 = new java.lang.String[r7]     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L76
            r9 = 0
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L76
            r8[r9] = r2     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L76
            android.database.Cursor r3 = r4.rawQuery(r6, r8)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L76
            if (r3 == 0) goto L6b
            boolean r2 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L76
            if (r2 == 0) goto L6b
            int r0 = r3.getInt(r7)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L76
            r10.d = r1     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L76
            r10.e = r0     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L76
            goto L6c
        L6b:
            r0 = r5
        L6c:
            if (r3 == 0) goto L7b
            goto L78
        L6f:
            r1 = move-exception
            if (r3 == 0) goto L75
            r3.close()     // Catch: java.lang.Exception -> L75 java.lang.Throwable -> L7f
        L75:
            throw r1     // Catch: java.lang.Exception -> L7b java.lang.Throwable -> L7f
        L76:
            if (r3 == 0) goto L7b
        L78:
            r3.close()     // Catch: java.lang.Exception -> L7b java.lang.Throwable -> L7f
        L7b:
            r10.e = r0     // Catch: java.lang.Throwable -> L7f
            monitor-exit(r10)
            return r0
        L7f:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
    }

    public final java.lang.String a(boolean r7) {
            r6 = this;
            a.a.a.g.f r6 = a.a.a.g.f.w()
            a.a.a.g.a r6 = r6.a()
            a.a.a.g.f r0 = a.a.a.g.f.w()
            a.a.a.g.k r0 = r0.j()
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r2 = 1024(0x400, float:1.435E-42)
            r1.<init>(r2)
            if (r6 == 0) goto L2a
            boolean r2 = r6.e()
            if (r2 == 0) goto L2a
            a.a.a.g.f r2 = a.a.a.g.f.w()
            java.lang.String r6 = r2.a(r6)
            r1.append(r6)
        L2a:
            r6 = 1
            r2 = 0
            if (r0 == 0) goto L41
            int r3 = r0.c()
            if (r3 <= r6) goto L41
            a.a.a.g.f r3 = a.a.a.g.f.w()
            int r4 = a.a.a.i.i.q0
            r5 = 15
            java.lang.String r0 = r3.a(r5, r2, r0, r4)
            goto L4b
        L41:
            a.a.a.g.f r0 = a.a.a.g.f.w()
            java.lang.String r0 = r0.d()
            if (r0 == 0) goto L4e
        L4b:
            r1.append(r0)
        L4e:
            if (r7 == 0) goto L55
            java.lang.String r7 = "&imo=1"
            r1.append(r7)
        L55:
            a.a.a.g.d r7 = a.a.a.g.d.n()
            java.lang.String r7 = r7.c()
            r1.append(r7)
            a.a.a.i.b r7 = a.a.a.i.b.e()
            java.lang.String r7 = r7.a(r2)
            r1.append(r7)
            a.a.a.b.c r7 = a.a.a.b.c.h()
            java.lang.String r7 = r7.d()
            r1.append(r7)
            a.a.a.b.f r7 = a.a.a.b.f.c()
            java.lang.String r7 = r7.a()
            r1.append(r7)
            android.content.Context r7 = com.baidu.location.f.c()
            java.lang.String r7 = a.a.a.i.i.e(r7)
            r1.append(r7)
            android.content.Context r7 = com.baidu.location.f.c()
            int r7 = a.a.a.i.i.c(r7)
            if (r7 < 0) goto L9e
            java.lang.String r0 = "&lmd="
            r1.append(r0)
            r1.append(r7)
        L9e:
            java.lang.String r7 = r1.toString()
            int r0 = r7.length()
            int r1 = a.a.a.i.i.F0
            if (r0 <= r1) goto Leb
            java.lang.String r0 = "&cl_list="
            java.lang.String[] r0 = r7.split(r0)
            int r1 = r0.length
            r3 = 2
            if (r1 != r3) goto Leb
            r7 = r0[r6]
            java.lang.String r1 = "&"
            java.lang.String[] r7 = r7.split(r1, r3)
            int r1 = r7.length
            if (r1 != r3) goto Ld8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0 = r0[r2]
            r1.append(r0)
            java.lang.String r0 = "&cl_list=null&"
            r1.append(r0)
            r6 = r7[r6]
            r1.append(r6)
            java.lang.String r7 = r1.toString()
            goto Leb
        Ld8:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r7 = r0[r2]
            r6.append(r7)
            java.lang.String r7 = "&cl_list=null"
            r6.append(r7)
            java.lang.String r7 = r6.toString()
        Leb:
            return r7
    }

    public final void a(android.os.Bundle r2) {
            r1 = this;
            a.a.a.b.c r1 = a.a.a.b.c.h()
            r0 = 406(0x196, float:5.69E-43)
            r1.a(r2, r0)
            return
    }

    public void a(java.lang.String r10) {
            r9 = this;
            java.lang.String r0 = "hstdata"
            java.lang.String r1 = "content"
            java.lang.String r2 = "imo"
            boolean r3 = r9.f46b
            if (r3 == 0) goto Lb
            return
        Lb:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L84
            r3.<init>(r10)     // Catch: java.lang.Exception -> L84
            boolean r10 = r3.has(r1)     // Catch: java.lang.Exception -> L84
            r4 = 0
            if (r10 == 0) goto L1c
            org.json.JSONObject r10 = r3.getJSONObject(r1)     // Catch: java.lang.Exception -> L84
            goto L1d
        L1c:
            r10 = r4
        L1d:
            if (r10 == 0) goto L84
            boolean r1 = r10.has(r2)     // Catch: java.lang.Exception -> L84
            if (r1 == 0) goto L84
            org.json.JSONObject r1 = r10.getJSONObject(r2)     // Catch: java.lang.Exception -> L84
            java.lang.String r3 = "mac"
            java.lang.String r1 = r1.getString(r3)     // Catch: java.lang.Exception -> L84
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Exception -> L84
            org.json.JSONObject r10 = r10.getJSONObject(r2)     // Catch: java.lang.Exception -> L84
            java.lang.String r2 = "mv"
            int r10 = r10.getInt(r2)     // Catch: java.lang.Exception -> L84
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch: java.lang.Exception -> L84
            r2.<init>()     // Catch: java.lang.Exception -> L84
            java.lang.String r3 = "tt"
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L84
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r7
            int r5 = (int) r5     // Catch: java.lang.Exception -> L84
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L84
            r2.put(r3, r5)     // Catch: java.lang.Exception -> L84
            java.lang.String r3 = "hst"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Exception -> L84
            r2.put(r3, r10)     // Catch: java.lang.Exception -> L84
            android.database.sqlite.SQLiteDatabase r10 = r9.f45a     // Catch: java.lang.Exception -> L84
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L84
            r3.<init>()     // Catch: java.lang.Exception -> L84
            java.lang.String r5 = "id = \""
            r3.append(r5)     // Catch: java.lang.Exception -> L84
            r3.append(r1)     // Catch: java.lang.Exception -> L84
            java.lang.String r5 = "\""
            r3.append(r5)     // Catch: java.lang.Exception -> L84
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L84
            int r10 = r10.update(r0, r2, r3, r4)     // Catch: java.lang.Exception -> L84
            if (r10 > 0) goto L84
            java.lang.String r10 = "id"
            r2.put(r10, r1)     // Catch: java.lang.Exception -> L84
            android.database.sqlite.SQLiteDatabase r9 = r9.f45a     // Catch: java.lang.Exception -> L84
            r9.insert(r0, r4, r2)     // Catch: java.lang.Exception -> L84
        L84:
            return
    }

    public void b() {
            r10 = this;
            boolean r0 = r10.f46b
            if (r0 == 0) goto L5
            return
        L5:
            a.a.a.g.f r0 = a.a.a.g.f.w()     // Catch: java.lang.Exception -> Lab
            boolean r0 = r0.p()     // Catch: java.lang.Exception -> Lab
            if (r0 == 0) goto La8
            android.database.sqlite.SQLiteDatabase r0 = r10.f45a     // Catch: java.lang.Exception -> Lab
            if (r0 == 0) goto La8
            a.a.a.g.f r0 = a.a.a.g.f.w()     // Catch: java.lang.Exception -> Lab
            android.net.wifi.WifiInfo r0 = r0.c()     // Catch: java.lang.Exception -> Lab
            if (r0 == 0) goto La8
            java.lang.String r1 = r0.getBSSID()     // Catch: java.lang.Exception -> Lab
            if (r1 == 0) goto La8
            java.lang.String r0 = r0.getBSSID()     // Catch: java.lang.Exception -> Lab
            java.lang.String r1 = ":"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.replace(r1, r2)     // Catch: java.lang.Exception -> Lab
            java.lang.Long r1 = com.baidu.location.Jni.d(r0)     // Catch: java.lang.Exception -> Lab
            r2 = 0
            r3 = 0
            r4 = 1
            android.database.sqlite.SQLiteDatabase r5 = r10.f45a     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L8a
            java.lang.String r6 = "select * from hstdata where id = ?"
            java.lang.String[] r7 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L8a
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L8a
            r7[r3] = r1     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L8a
            android.database.Cursor r2 = r5.rawQuery(r6, r7)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L8a
            if (r2 == 0) goto L7f
            boolean r1 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L8a
            if (r1 == 0) goto L7f
            int r1 = r2.getInt(r4)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L8a
            r5 = 2
            int r5 = r2.getInt(r5)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L8a
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L8a
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r8
            long r8 = (long) r5     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L8a
            long r6 = r6 - r8
            r8 = 259200(0x3f480, double:1.28062E-318)
            int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r5 <= 0) goto L68
            goto L7f
        L68:
            android.os.Bundle r5 = new android.os.Bundle     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L8a
            r5.<init>()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L8a
            java.lang.String r6 = "mac"
            byte[] r7 = r0.getBytes()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L8a
            r5.putByteArray(r6, r7)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L8a
            java.lang.String r6 = "hotspot"
            r5.putInt(r6, r1)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L8a
            r10.a(r5)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L8a
            goto L80
        L7f:
            r3 = r4
        L80:
            if (r2 == 0) goto L8f
            goto L8c
        L83:
            r10 = move-exception
            if (r2 == 0) goto L89
            r2.close()     // Catch: java.lang.Exception -> L89
        L89:
            throw r10     // Catch: java.lang.Exception -> Lab
        L8a:
            if (r2 == 0) goto L8f
        L8c:
            r2.close()     // Catch: java.lang.Exception -> L8f
        L8f:
            if (r3 == 0) goto Lab
            a.a.a.b.l$a r1 = r10.f47c     // Catch: java.lang.Exception -> Lab
            if (r1 != 0) goto L9c
            a.a.a.b.l$a r1 = new a.a.a.b.l$a     // Catch: java.lang.Exception -> Lab
            r1.<init>(r10)     // Catch: java.lang.Exception -> Lab
            r10.f47c = r1     // Catch: java.lang.Exception -> Lab
        L9c:
            a.a.a.b.l$a r1 = r10.f47c     // Catch: java.lang.Exception -> Lab
            if (r1 == 0) goto Lab
            java.lang.String r10 = r10.a(r4)     // Catch: java.lang.Exception -> Lab
            r1.a(r0, r10)     // Catch: java.lang.Exception -> Lab
            goto Lab
        La8:
            r10.c()     // Catch: java.lang.Exception -> Lab
        Lab:
            return
    }

    public final void c() {
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "hotspot"
            r2 = -1
            r0.putInt(r1, r2)
            r3.a(r0)
            return
    }

    public void d() {
            r3 = this;
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L29
            java.lang.String r2 = a.a.a.b.l.h     // Catch: java.lang.Exception -> L29
            r1.<init>(r2)     // Catch: java.lang.Exception -> L29
            boolean r2 = r1.exists()     // Catch: java.lang.Exception -> L29
            if (r2 != 0) goto L11
            r1.createNewFile()     // Catch: java.lang.Exception -> L29
        L11:
            boolean r2 = r1.exists()     // Catch: java.lang.Exception -> L29
            if (r2 == 0) goto L2b
            android.database.sqlite.SQLiteDatabase r1 = android.database.sqlite.SQLiteDatabase.openOrCreateDatabase(r1, r0)     // Catch: java.lang.Exception -> L29
            r3.f45a = r1     // Catch: java.lang.Exception -> L29
            java.lang.String r2 = "CREATE TABLE IF NOT EXISTS hstdata(id Long PRIMARY KEY,hst INT,tt INT);"
            r1.execSQL(r2)     // Catch: java.lang.Exception -> L29
            android.database.sqlite.SQLiteDatabase r1 = r3.f45a     // Catch: java.lang.Exception -> L29
            r2 = 1
            r1.setVersion(r2)     // Catch: java.lang.Exception -> L29
            goto L2b
        L29:
            r3.f45a = r0
        L2b:
            return
    }

    public void e() {
            r2 = this;
            android.database.sqlite.SQLiteDatabase r0 = r2.f45a
            if (r0 == 0) goto Lf
            r1 = 0
            r0.close()     // Catch: java.lang.Exception -> L8 java.lang.Throwable -> Lb
        L8:
            r2.f45a = r1
            goto Lf
        Lb:
            r0 = move-exception
            r2.f45a = r1
            throw r0
        Lf:
            return
    }
}
