package c.a.b;

/* JADX INFO: loaded from: classes.dex */
public class n {
    private static java.lang.String d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.content.Context f1280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c.a.b.c.c f1281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    c.a.b.f f1282c;

    public static class a {
        public static final java.lang.String[] g = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.String f1283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.lang.String f1284b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private java.lang.String f1285c;
        private long d;
        private java.lang.String e;
        private int f;

        static {
                java.lang.String r0 = "V"
                java.lang.String r1 = "O"
                java.lang.String r2 = "0"
                java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2}
                c.a.b.n.a.g = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.f = r0
                return
        }

        static /* synthetic */ int a(c.a.b.n.a r0, int r1) {
                r0.f = r1
                return r1
        }

        static /* synthetic */ long a(c.a.b.n.a r0, long r1) {
                r0.d = r1
                return r1
        }

        static /* synthetic */ java.lang.String a(c.a.b.n.a r0) {
                java.lang.String r0 = r0.f1284b
                return r0
        }

        static /* synthetic */ java.lang.String a(c.a.b.n.a r0, java.lang.String r1) {
                r0.f1283a = r1
                return r1
        }

        static /* synthetic */ java.lang.String b(c.a.b.n.a r0, java.lang.String r1) {
                r0.f1285c = r1
                return r1
        }

        static /* synthetic */ java.lang.String c(c.a.b.n.a r0, java.lang.String r1) {
                r0.e = r1
                return r1
        }

        static /* synthetic */ java.lang.String d(c.a.b.n.a r0, java.lang.String r1) {
                r0.f1284b = r1
                return r1
        }

        public java.lang.String a() {
                r4 = this;
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L34
                r0.<init>()     // Catch: org.json.JSONException -> L34
                java.lang.String r1 = "dik"
                java.lang.String r2 = r4.f1283a     // Catch: org.json.JSONException -> L34
                r0.put(r1, r2)     // Catch: org.json.JSONException -> L34
                java.lang.String r1 = "v270fk"
                java.lang.String r2 = r4.f1284b     // Catch: org.json.JSONException -> L34
                r0.put(r1, r2)     // Catch: org.json.JSONException -> L34
                java.lang.String r1 = "cck"
                java.lang.String r2 = r4.f1285c     // Catch: org.json.JSONException -> L34
                r0.put(r1, r2)     // Catch: org.json.JSONException -> L34
                java.lang.String r1 = "vsk"
                int r2 = r4.f     // Catch: org.json.JSONException -> L34
                r0.put(r1, r2)     // Catch: org.json.JSONException -> L34
                java.lang.String r1 = "ctk"
                long r2 = r4.d     // Catch: org.json.JSONException -> L34
                r0.put(r1, r2)     // Catch: org.json.JSONException -> L34
                java.lang.String r1 = "ek"
                java.lang.String r4 = r4.e     // Catch: org.json.JSONException -> L34
                r0.put(r1, r4)     // Catch: org.json.JSONException -> L34
                java.lang.String r4 = r0.toString()     // Catch: org.json.JSONException -> L34
                return r4
            L34:
                r4 = move-exception
                c.a.b.k.c.a(r4)
                r4 = 0
                return r4
        }

        public java.lang.String b() {
                r3 = this;
                java.lang.String r0 = r3.f1284b
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                if (r1 == 0) goto La
                java.lang.String r0 = "0"
            La:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = r3.f1283a
                r1.append(r2)
                java.lang.String r2 = "|"
                r1.append(r2)
                r1.append(r0)
                java.lang.String r2 = "V"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto L29
                java.lang.String r0 = r3.f1285c
                r1.append(r0)
            L29:
                java.lang.String r0 = r3.e
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L36
                java.lang.String r3 = r3.e
                r1.append(r3)
            L36:
                java.lang.String r3 = r1.toString()
                java.lang.String r3 = r3.trim()
                return r3
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 == 0) goto L47
                java.lang.Class r2 = r5.getClass()
                java.lang.Class<c.a.b.n$a> r3 = c.a.b.n.a.class
                if (r3 == r2) goto L10
                goto L47
            L10:
                c.a.b.n$a r5 = (c.a.b.n.a) r5
                int r2 = r4.f
                int r3 = r5.f
                if (r2 != r3) goto L45
                java.lang.String r2 = r4.f1283a
                java.lang.String r3 = r5.f1283a
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L45
                java.lang.String r2 = r4.f1284b
                java.lang.String r3 = r5.f1284b
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L45
                java.lang.String r2 = r4.f1285c
                java.lang.String r3 = r5.f1285c
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L45
                java.lang.String r4 = r4.e
                java.lang.String r5 = r5.e
                if (r4 == r5) goto L46
                if (r4 == 0) goto L45
                boolean r4 = r4.equals(r5)
                if (r4 == 0) goto L45
                goto L46
            L45:
                r0 = r1
            L46:
                return r0
            L47:
                return r1
        }

        public int hashCode() {
                r3 = this;
                r0 = 5
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = r3.f1283a
                r2 = 0
                r0[r2] = r1
                java.lang.String r1 = r3.f1284b
                r2 = 1
                r0[r2] = r1
                java.lang.String r1 = r3.f1285c
                r2 = 2
                r0[r2] = r1
                java.lang.String r1 = r3.e
                r2 = 3
                r0[r2] = r1
                int r3 = r3.f
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r1 = 4
                r0[r1] = r3
                int r3 = java.util.Arrays.hashCode(r0)
                return r3
        }
    }

    public n(android.content.Context r2, c.a.b.i.a r3, c.a.b.f r4) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L1e
            android.content.Context r2 = r2.getApplicationContext()
            r1.f1280a = r2
            c.a.b.i.a$a r2 = r3.b()
            java.lang.String r0 = "bohrium"
            c.a.b.i.a$a r2 = r2.a(r0)
            r2.a()
            r1.f1282c = r4
            r1.a(r3)
            return
        L1e:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "context should not be null!!!"
            r1.<init>(r2)
            throw r1
    }

    public static c.a.b.n.a a(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r1 = 0
            if (r0 != 0) goto L33
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto Le
            goto L33
        Le:
            java.lang.String r0 = d(r6)     // Catch: java.lang.Exception -> L2f
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L2f
            r4 = 1
            c.a.b.n$a r5 = new c.a.b.n$a     // Catch: java.lang.Exception -> L2f
            r5.<init>()     // Catch: java.lang.Exception -> L2f
            c.a.b.n.a.a(r5, r6)     // Catch: java.lang.Exception -> L2f
            c.a.b.n.a.b(r5, r0)     // Catch: java.lang.Exception -> L2f
            c.a.b.n.a.a(r5, r2)     // Catch: java.lang.Exception -> L2f
            c.a.b.n.a.a(r5, r4)     // Catch: java.lang.Exception -> L2f
            c.a.b.n.a.c(r5, r8)     // Catch: java.lang.Exception -> L2f
            c.a.b.n.a.d(r5, r7)     // Catch: java.lang.Exception -> L2f
            return r5
        L2f:
            r6 = move-exception
            c.a.b.k.c.a(r6)
        L33:
            return r1
    }

    private java.lang.String a(android.content.Context r1) {
            r0 = this;
            java.lang.String r0 = c.a.b.n.d
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto La
            java.lang.String r0 = "123456"
        La:
            return r0
    }

    private void a(c.a.b.i.a r5) {
            r4 = this;
            c.a.b.b r0 = new c.a.b.b
            r0.<init>()
            c.a.b.c.c r1 = new c.a.b.c.c
            r1.<init>(r0)
            c.a.b.c.a$a r0 = new c.a.b.c.a$a
            r0.<init>()
            android.content.Context r2 = r4.f1280a
            r0.f1206a = r2
            r0.f1207b = r5
            c.a.b.c.a$c r5 = new c.a.b.c.a$c
            r5.<init>()
            java.util.List r2 = r1.a()
            java.util.Iterator r2 = r2.iterator()
        L22:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L35
            java.lang.Object r3 = r2.next()
            c.a.b.c.a r3 = (c.a.b.c.a) r3
            r3.a(r0)
            r3.a(r5)
            goto L22
        L35:
            r4.f1281b = r1
            return
    }

    public static c.a.b.n.a b(java.lang.String r9) {
            java.lang.String r0 = ""
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L56
            r1.<init>(r9)     // Catch: java.lang.Exception -> L56
            java.lang.String r9 = "dik"
            java.lang.String r9 = r1.optString(r9, r0)     // Catch: java.lang.Exception -> L56
            java.lang.String r3 = "cck"
            java.lang.String r3 = r1.optString(r3, r0)     // Catch: java.lang.Exception -> L56
            java.lang.String r4 = "ctk"
            r5 = 0
            long r4 = r1.optLong(r4, r5)     // Catch: java.lang.Exception -> L56
            java.lang.String r6 = "vsk"
            r7 = 1
            int r6 = r1.optInt(r6, r7)     // Catch: java.lang.Exception -> L56
            java.lang.String r7 = "ek"
            java.lang.String r0 = r1.optString(r7, r0)     // Catch: java.lang.Exception -> L56
            java.lang.String r7 = "v270fk"
            java.lang.String r8 = "V"
            java.lang.String r1 = r1.optString(r7, r8)     // Catch: java.lang.Exception -> L56
            boolean r7 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L56
            if (r7 != 0) goto L5a
            c.a.b.n$a r7 = new c.a.b.n$a     // Catch: java.lang.Exception -> L56
            r7.<init>()     // Catch: java.lang.Exception -> L56
            c.a.b.n.a.a(r7, r9)     // Catch: java.lang.Exception -> L56
            c.a.b.n.a.b(r7, r3)     // Catch: java.lang.Exception -> L56
            c.a.b.n.a.a(r7, r4)     // Catch: java.lang.Exception -> L56
            c.a.b.n.a.a(r7, r6)     // Catch: java.lang.Exception -> L56
            c.a.b.n.a.c(r7, r0)     // Catch: java.lang.Exception -> L56
            c.a.b.n.a.d(r7, r1)     // Catch: java.lang.Exception -> L56
            return r7
        L56:
            r9 = move-exception
            c.a.b.k.c.a(r9)
        L5a:
            return r2
    }

    public static void c(java.lang.String r0) {
            c.a.b.n.d = r0
            return
    }

    private static java.lang.String d(java.lang.String r3) {
            c.a.b.a.a r0 = new c.a.b.a.a     // Catch: java.lang.Exception -> L1c
            r0.<init>()     // Catch: java.lang.Exception -> L1c
            java.lang.String r1 = "UTF-8"
            byte[] r3 = r3.getBytes(r1)     // Catch: java.lang.Exception -> L1c
            byte[] r3 = r0.a(r3)     // Catch: java.lang.Exception -> L1c
            c.a.b.k.a r0 = new c.a.b.k.a     // Catch: java.lang.Exception -> L1c
            java.lang.String r1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567="
            r2 = 0
            r0.<init>(r1, r2, r2)     // Catch: java.lang.Exception -> L1c
            java.lang.String r3 = r0.a(r3)     // Catch: java.lang.Exception -> L1c
            goto L22
        L1c:
            r3 = move-exception
            r3.printStackTrace()
            java.lang.String r3 = ""
        L22:
            return r3
    }

    public c.a.b.n.a a() {
            r6 = this;
            c.a.b.c.a$d r0 = new c.a.b.c.a$d
            r0.<init>()
            r1 = 1
            r0.f1211a = r1
            c.a.b.c.c r1 = r6.f1281b
            java.util.List r1 = r1.a()
            java.util.Comparator r2 = c.a.b.c.a.e
            java.util.Collections.sort(r1, r2)
            c.a.b.f r2 = r6.f1282c
            android.content.Context r6 = r6.f1280a
            java.util.List r6 = r2.b(r6)
            if (r6 == 0) goto L5c
            java.util.Iterator r6 = r6.iterator()
        L21:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L5c
            java.lang.Object r2 = r6.next()
            c.a.b.d r2 = (c.a.b.d) r2
            boolean r3 = r2.d
            if (r3 == 0) goto L32
            goto L21
        L32:
            boolean r3 = r2.f1233c
            if (r3 != 0) goto L37
            goto L21
        L37:
            java.util.Iterator r3 = r1.iterator()
        L3b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L21
            java.lang.Object r4 = r3.next()
            c.a.b.c.a r4 = (c.a.b.c.a) r4
            android.content.pm.ApplicationInfo r5 = r2.f1231a
            java.lang.String r5 = r5.packageName
            c.a.b.c.a$e r4 = r4.a(r5, r0)
            if (r4 == 0) goto L3b
            boolean r5 = r4.a()
            if (r5 == 0) goto L3b
            c.a.b.n$a r4 = r4.f1212a
            if (r4 == 0) goto L3b
            return r4
        L5c:
            r6 = 0
            return r6
    }

    public c.a.b.n.a a(c.a.b.l r8) {
            r7 = this;
            if (r8 == 0) goto L5a
            c.a.b.n$a r7 = new c.a.b.n$a
            r7.<init>()
            long r0 = java.lang.System.currentTimeMillis()
            c.a.b.n.a.a(r7, r0)
            r0 = 1
            c.a.b.n.a.a(r7, r0)
            java.lang.String r1 = r8.f1276b     // Catch: java.lang.Exception -> L58
            r2 = 0
            java.lang.String r1 = r1.substring(r2, r0)     // Catch: java.lang.Exception -> L58
            c.a.b.n.a.d(r7, r1)     // Catch: java.lang.Exception -> L58
            java.lang.String r1 = r8.f1275a
            c.a.b.n.a.a(r7, r1)
            java.lang.String r1 = r8.f1275a
            java.lang.String r1 = d(r1)
            c.a.b.n.a.b(r7, r1)
            java.lang.String[] r1 = c.a.b.n.a.g
            int r3 = r1.length
            r4 = r2
        L2e:
            if (r4 >= r3) goto L40
            r5 = r1[r4]
            java.lang.String r6 = c.a.b.n.a.a(r7)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L3d
            goto L41
        L3d:
            int r4 = r4 + 1
            goto L2e
        L40:
            r2 = r0
        L41:
            if (r2 == 0) goto L57
            java.lang.String r1 = r8.f1276b
            if (r1 == 0) goto L57
            int r1 = r1.length()
            r2 = 2
            if (r1 < r2) goto L57
            java.lang.String r8 = r8.f1276b
            java.lang.String r8 = r8.substring(r0)
            c.a.b.n.a.c(r7, r8)
        L57:
            return r7
        L58:
            r7 = 0
            return r7
        L5a:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "arg non-nullable is expected"
            r7.<init>(r8)
            throw r7
    }

    public c.a.b.n.a a(java.lang.String r4) {
            r3 = this;
            android.content.Context r4 = r3.f1280a
            java.lang.String r3 = r3.a(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "com.baidu"
            r4.append(r0)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            byte[] r3 = r3.getBytes()
            r4 = 1
            java.lang.String r3 = c.a.b.g.b.a(r3, r4)
            c.a.b.n$a r0 = new c.a.b.n$a
            r0.<init>()
            long r1 = java.lang.System.currentTimeMillis()
            c.a.b.n.a.a(r0, r1)
            c.a.b.n.a.a(r0, r4)
            c.a.b.n.a.a(r0, r3)
            java.lang.String r4 = "E"
            c.a.b.n.a.d(r0, r4)
            java.lang.String r3 = d(r3)
            c.a.b.n.a.b(r0, r3)
            java.lang.String r3 = "RO"
            c.a.b.n.a.c(r0, r3)
            return r0
    }
}
