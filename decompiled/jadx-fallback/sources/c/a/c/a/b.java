package c.a.c.a;

/* JADX INFO: loaded from: classes.dex */
public class b {
    private static android.content.Context e = null;
    private static java.lang.String f = null;
    private static int g = -1;
    private static java.lang.String h;
    private static java.lang.String i;
    private static c.a.c.a.r j;
    private static int k;
    private static java.util.Hashtable l;
    private static c.a.c.a.b m;
    private static java.lang.String n;
    private static java.lang.String o;
    private static boolean p;
    private static java.lang.String q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c.a.c.a.g f1286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c.a.c.a.i f1287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1288c;
    private final android.os.Handler d;

    static {
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            c.a.c.a.b.l = r0
            java.lang.String r0 = ""
            c.a.c.a.b.n = r0
            c.a.c.a.b.o = r0
            r0 = 0
            c.a.c.a.b.p = r0
            r0 = 0
            c.a.c.a.b.q = r0
            return
    }

    private b(android.content.Context r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f1286a = r0
            r3.f1287b = r0
            r1 = 0
            r3.f1288c = r1
            c.a.c.a.n r1 = new c.a.c.a.n
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r3, r2)
            r3.d = r1
            c.a.c.a.b.e = r4
            c.a.c.a.r r4 = c.a.c.a.b.j
            if (r4 == 0) goto L24
            boolean r4 = r4.isAlive()
            if (r4 != 0) goto L24
            c.a.c.a.b.j = r0
        L24:
            java.lang.String r4 = "BaiduApiAuth SDK Version:1.0.29"
            c.a.c.a.d.b(r4)
            r3.j()
            return
    }

    private java.lang.String a(int r5) {
            r4 = this;
            r4 = 0
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L63 java.io.FileNotFoundException -> L73
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L63 java.io.FileNotFoundException -> L73
            r1.<init>()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L63 java.io.FileNotFoundException -> L73
            java.lang.String r2 = "/proc/"
            r1.append(r2)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L63 java.io.FileNotFoundException -> L73
            r1.append(r5)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L63 java.io.FileNotFoundException -> L73
            java.lang.String r5 = "/cmdline"
            r1.append(r5)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L63 java.io.FileNotFoundException -> L73
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L63 java.io.FileNotFoundException -> L73
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L63 java.io.FileNotFoundException -> L73
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L63 java.io.FileNotFoundException -> L73
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L63 java.io.FileNotFoundException -> L73
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L4a java.io.FileNotFoundException -> L4c
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L4a java.io.FileNotFoundException -> L4c
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L41 java.io.FileNotFoundException -> L43
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L41 java.io.FileNotFoundException -> L43
            java.lang.String r4 = r1.readLine()     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L66 java.io.FileNotFoundException -> L76
            r1.close()
            r0.close()
        L35:
            r5.close()
            goto L83
        L3a:
            r4 = move-exception
            goto L53
        L3c:
            r1 = move-exception
            r3 = r1
            r1 = r4
            r4 = r3
            goto L53
        L41:
            r1 = r4
            goto L66
        L43:
            r1 = r4
            goto L76
        L45:
            r0 = move-exception
            r1 = r4
            r4 = r0
            r0 = r1
            goto L53
        L4a:
            r0 = r4
            goto L65
        L4c:
            r0 = r4
            goto L75
        L4e:
            r5 = move-exception
            r0 = r4
            r1 = r0
            r4 = r5
            r5 = r1
        L53:
            if (r1 == 0) goto L58
            r1.close()
        L58:
            if (r0 == 0) goto L5d
            r0.close()
        L5d:
            if (r5 == 0) goto L62
            r5.close()
        L62:
            throw r4
        L63:
            r5 = r4
            r0 = r5
        L65:
            r1 = r0
        L66:
            if (r1 == 0) goto L6b
            r1.close()
        L6b:
            if (r0 == 0) goto L70
            r0.close()
        L70:
            if (r5 == 0) goto L83
            goto L35
        L73:
            r5 = r4
            r0 = r5
        L75:
            r1 = r0
        L76:
            if (r1 == 0) goto L7b
            r1.close()
        L7b:
            if (r0 == 0) goto L80
            r0.close()
        L80:
            if (r5 == 0) goto L83
            goto L35
        L83:
            return r4
    }

    private java.lang.String a(android.content.Context r5, java.lang.String r6) {
            r4 = this;
            java.lang.String r4 = "无法在AndroidManifest.xml中获取com.baidu.android.lbs.API_KEY的值"
            java.lang.String r0 = ""
            java.lang.String r1 = c.a.c.a.b.n
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto Lf
            java.lang.String r4 = c.a.c.a.b.n
            return r4
        Lf:
            java.lang.String r1 = r5.getPackageName()
            r2 = 101(0x65, float:1.42E-43)
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5b
            r3 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo(r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5b
            android.os.Bundle r1 = r5.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5b
            if (r1 != 0) goto L37
            java.util.Hashtable r5 = c.a.c.a.b.l     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5b
            java.lang.Object r5 = r5.get(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5b
            c.a.c.a.c r5 = (c.a.c.a.c) r5     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5b
            if (r5 == 0) goto L6c
            java.lang.String r1 = "AndroidManifest.xml的application中没有meta-data标签"
            java.lang.String r1 = c.a.c.a.a.a(r2, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5b
            r5.a(r2, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5b
            goto L6c
        L37:
            android.os.Bundle r5 = r5.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5b
            java.lang.String r1 = "com.baidu.lbsapi.API_KEY"
            java.lang.String r5 = r5.getString(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5b
            if (r5 == 0) goto L47
            boolean r0 = r5.equals(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5a
            if (r0 == 0) goto L58
        L47:
            java.util.Hashtable r0 = c.a.c.a.b.l     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5a
            java.lang.Object r0 = r0.get(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5a
            c.a.c.a.c r0 = (c.a.c.a.c) r0     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5a
            if (r0 == 0) goto L58
            java.lang.String r1 = c.a.c.a.a.a(r2, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5a
            r0.a(r2, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5a
        L58:
            r0 = r5
            goto L6c
        L5a:
            r0 = r5
        L5b:
            java.util.Hashtable r5 = c.a.c.a.b.l
            java.lang.Object r5 = r5.get(r6)
            c.a.c.a.c r5 = (c.a.c.a.c) r5
            if (r5 == 0) goto L6c
            java.lang.String r4 = c.a.c.a.a.a(r2, r4)
            r5.a(r2, r4)
        L6c:
            return r0
    }

    static /* synthetic */ void a(c.a.c.a.b r0, java.lang.String r1, java.lang.String r2) {
            r0.b(r1, r2)
            return
    }

    static /* synthetic */ void a(c.a.c.a.b r0, org.json.JSONObject r1) {
            r0.a(r1)
            return
    }

    static /* synthetic */ void a(c.a.c.a.b r0, boolean r1, java.lang.String r2, java.util.Hashtable r3, java.lang.String r4, java.lang.String r5, int r6, java.lang.String r7, java.lang.String r8) {
            r0.a(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    static /* synthetic */ void a(c.a.c.a.b r0, boolean r1, java.lang.String r2, java.util.Hashtable r3, java.lang.String[] r4, java.lang.String r5, java.lang.String r6, int r7, java.lang.String r8, java.lang.String r9) {
            r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    private void a(java.util.HashMap r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            if (r2 == 0) goto L38
            int r1 = r2.size()
            if (r1 <= 0) goto L38
            if (r3 == 0) goto L38
            int r1 = r3.length()
            if (r1 <= 0) goto L38
            if (r4 == 0) goto L38
            int r1 = r4.length()
            if (r1 > 0) goto L19
            goto L38
        L19:
            java.lang.String r1 = c.a.c.a.t.a(r4)     // Catch: java.lang.Exception -> L2d
            if (r1 == 0) goto L29
            int r0 = r1.length()     // Catch: java.lang.Exception -> L2d
            if (r0 <= 0) goto L29
            r2.put(r3, r1)     // Catch: java.lang.Exception -> L2d
            goto L38
        L29:
            r2.put(r3, r4)     // Catch: java.lang.Exception -> L2d
            goto L38
        L2d:
            r1 = move-exception
            r2.put(r3, r4)
            java.lang.String r2 = "LBSAuthManager"
            java.lang.String r3 = "encodeAuthParam"
            android.util.Log.e(r2, r3, r1)
        L38:
            return
    }

    private void a(org.json.JSONObject r3) {
            r2 = this;
            if (r3 == 0) goto L48
            int r0 = r3.length()
            if (r0 > 0) goto L9
            goto L48
        L9:
            java.lang.String r0 = "en"
            boolean r1 = r3.has(r0)
            if (r1 != 0) goto L12
            return
        L12:
            r1 = 0
            int r0 = r3.optInt(r0, r1)
            java.lang.String r1 = "ck"
            if (r0 != 0) goto L33
            java.lang.String r2 = r3.optString(r1)
            int r2 = r2.length()
            if (r2 <= 0) goto L32
            java.lang.String r2 = r3.optString(r1)
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r2 = r2.getBytes(r3)
            c.a.c.a.e.a(r2)
        L32:
            return
        L33:
            java.lang.String r0 = "ak"
            r2.a(r3, r0)
            r2.a(r3, r1)
            java.lang.String r0 = "sk"
            r2.a(r3, r0)
            java.lang.String r0 = "uid"
            r2.a(r3, r0)
            r2.b(r3)
        L48:
            return
    }

    private void a(org.json.JSONObject r3, java.lang.String r4) {
            r2 = this;
            if (r3 == 0) goto L4b
            int r2 = r3.length()
            if (r2 > 0) goto L9
            goto L4b
        L9:
            if (r4 == 0) goto L4b
            int r2 = r4.length()
            if (r2 <= 0) goto L4b
            boolean r2 = r3.has(r4)
            if (r2 != 0) goto L18
            goto L4b
        L18:
            java.lang.String r2 = r3.optString(r4)     // Catch: java.lang.Exception -> L43
            byte[] r2 = c.a.c.a.t.b(r2)     // Catch: java.lang.Exception -> L43
            if (r2 == 0) goto L37
            int r0 = r2.length     // Catch: java.lang.Exception -> L43
            if (r0 > 0) goto L26
            goto L37
        L26:
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Exception -> L43
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Exception -> L43
            r0.<init>(r2, r1)     // Catch: java.lang.Exception -> L43
            r3.put(r4, r0)     // Catch: java.lang.Exception -> L43
            java.lang.String r2 = "ck"
            boolean r2 = r2.equals(r4)     // Catch: java.lang.Exception -> L43
            goto L4b
        L37:
            java.lang.String r2 = ""
            r3.put(r4, r2)     // Catch: java.lang.Exception -> L43
            java.lang.String r2 = "decode_status"
            r4 = -1
            r3.put(r2, r4)     // Catch: java.lang.Exception -> L43
            return
        L43:
            r2 = move-exception
            java.lang.String r3 = "LBSAuthManager"
            java.lang.String r4 = " decodeAuthResult "
            android.util.Log.e(r3, r4, r2)
        L4b:
            return
    }

    private void a(boolean r14, java.lang.String r15, java.util.Hashtable r16, java.lang.String r17, java.lang.String r18, int r19, java.lang.String r20, java.lang.String r21) {
            r13 = this;
            r0 = r13
            r1 = r15
            r2 = r17
            android.content.Context r3 = c.a.c.a.b.e
            java.lang.String r3 = r13.a(r3, r2)
            if (r3 == 0) goto L15c
            java.lang.String r4 = ""
            boolean r5 = r3.equals(r4)
            if (r5 == 0) goto L16
            goto L15c
        L16:
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            c.a.c.a.t.a()
            java.lang.String r5 = c.a.c.a.t.b()
            if (r5 == 0) goto L29
            java.lang.String r5 = c.a.c.a.t.b()
            goto L2a
        L29:
            r5 = r4
        L2a:
            java.lang.String r6 = "pk"
            r7.put(r6, r5)
            java.lang.String r5 = "url"
            java.lang.String r6 = "https://api.map.baidu.com/sdkcs/verify"
            r7.put(r5, r6)
            java.lang.String r5 = "url:https://api.map.baidu.com/sdkcs/verify"
            c.a.c.a.d.a(r5)
            java.lang.String r5 = "output"
            java.lang.String r6 = "json"
            r7.put(r5, r6)
            java.lang.String r5 = "ak"
            r13.a(r7, r5, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "ak:"
            r3.append(r6)
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            c.a.c.a.d.a(r3)
            android.content.Context r3 = c.a.c.a.b.e
            java.lang.String r3 = c.a.c.a.f.a(r3)
            java.lang.String r5 = "mcode"
            r13.a(r7, r5, r3)
            java.lang.String r3 = "from"
            java.lang.String r5 = "lbs_yunsdk"
            r7.put(r3, r5)
            if (r16 == 0) goto Lab
            int r3 = r16.size()
            if (r3 <= 0) goto Lab
            java.util.Set r3 = r16.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L83:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto Lab
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            boolean r8 = android.text.TextUtils.isEmpty(r6)
            if (r8 != 0) goto L83
            boolean r8 = android.text.TextUtils.isEmpty(r5)
            if (r8 != 0) goto L83
            r7.put(r6, r5)
            goto L83
        Lab:
            java.lang.String r3 = c.a.c.a.b.o
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto Lb8
            java.lang.String r3 = r13.a()
            goto Lba
        Lb8:
            java.lang.String r3 = c.a.c.a.b.q
        Lba:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "cuid:"
            r5.append(r6)
            java.lang.String r6 = c.a.c.a.b.q
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            c.a.c.a.d.a(r5)
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r6 = "cuid"
            if (r5 != 0) goto Ldc
            r7.put(r6, r3)
            goto Ldf
        Ldc:
            r7.put(r6, r4)
        Ldf:
            android.content.Context r3 = c.a.c.a.b.e
            java.lang.String r3 = r3.getPackageName()
            java.lang.String r5 = "pcn"
            r7.put(r5, r3)
            java.lang.String r3 = "version"
            java.lang.String r5 = "1.0.29"
            r7.put(r3, r5)
            java.lang.String r3 = "macaddr"
            r7.put(r3, r4)
            java.lang.String r3 = c.a.c.a.f.a()     // Catch: java.lang.Exception -> Lfb
            goto Lfc
        Lfb:
            r3 = r4
        Lfc:
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r6 = "language"
            if (r5 != 0) goto L108
            r7.put(r6, r3)
            goto L10b
        L108:
            r7.put(r6, r4)
        L10b:
            if (r14 == 0) goto L129
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            if (r14 == 0) goto L116
            r3.<init>()
            r5 = 1
            goto L11a
        L116:
            r3.<init>()
            r5 = 0
        L11a:
            r3.append(r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = "force"
            r7.put(r5, r3)
        L129:
            java.lang.String r3 = "from_service"
            if (r1 != 0) goto L131
            r7.put(r3, r4)
            goto L134
        L131:
            r7.put(r3, r15)
        L134:
            java.lang.String r1 = r13.k()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L143
            java.lang.String r3 = "extend"
            r7.put(r3, r1)
        L143:
            c.a.c.a.g r6 = new c.a.c.a.g
            android.content.Context r1 = c.a.c.a.b.e
            r6.<init>(r1)
            r0.f1286a = r6
            c.a.c.a.p r12 = new c.a.c.a.p
            r12.<init>(r13, r2)
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            r6.a(r7, r8, r9, r10, r11, r12)
        L15c:
            return
    }

    private void a(boolean r16, java.lang.String r17, java.util.Hashtable r18, java.lang.String[] r19, java.lang.String r20, java.lang.String r21, int r22, java.lang.String r23, java.lang.String r24) {
            r15 = this;
            r0 = r15
            r1 = r17
            r2 = r19
            r3 = r20
            android.content.Context r4 = c.a.c.a.b.e
            java.lang.String r4 = r15.a(r4, r3)
            if (r4 == 0) goto L156
            java.lang.String r5 = ""
            boolean r6 = r4.equals(r5)
            if (r6 == 0) goto L19
            goto L156
        L19:
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            c.a.c.a.t.a()
            java.lang.String r6 = c.a.c.a.t.b()
            if (r6 == 0) goto L2c
            java.lang.String r6 = c.a.c.a.t.b()
            goto L2d
        L2c:
            r6 = r5
        L2d:
            java.lang.String r7 = "pk"
            r8.put(r7, r6)
            java.lang.String r6 = "url"
            java.lang.String r7 = "https://api.map.baidu.com/sdkcs/verify"
            r8.put(r6, r7)
            java.lang.String r6 = "output"
            java.lang.String r7 = "json"
            r8.put(r6, r7)
            java.lang.String r6 = "ak"
            r15.a(r8, r6, r4)
            java.lang.String r4 = "from"
            java.lang.String r6 = "lbs_yunsdk"
            r8.put(r4, r6)
            if (r18 == 0) goto L84
            int r4 = r18.size()
            if (r4 <= 0) goto L84
            java.util.Set r4 = r18.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L5c:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L84
            java.lang.Object r6 = r4.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r6.getValue()
            java.lang.String r6 = (java.lang.String) r6
            boolean r9 = android.text.TextUtils.isEmpty(r7)
            if (r9 != 0) goto L5c
            boolean r9 = android.text.TextUtils.isEmpty(r6)
            if (r9 != 0) goto L5c
            r8.put(r7, r6)
            goto L5c
        L84:
            java.lang.String r4 = c.a.c.a.b.o
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L91
            java.lang.String r4 = r15.a()
            goto L93
        L91:
            java.lang.String r4 = c.a.c.a.b.q
        L93:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "sendAuthRequests : cuid: "
            r6.append(r7)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            c.a.c.a.d.a(r6)
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r7 = "cuid"
            if (r6 != 0) goto Lb3
            r8.put(r7, r4)
            goto Lb6
        Lb3:
            r8.put(r7, r5)
        Lb6:
            android.content.Context r4 = c.a.c.a.b.e
            java.lang.String r4 = r4.getPackageName()
            java.lang.String r6 = "pcn"
            r8.put(r6, r4)
            java.lang.String r4 = "version"
            java.lang.String r6 = "1.0.29"
            r8.put(r4, r6)
            java.lang.String r4 = "macaddr"
            r8.put(r4, r5)
            java.lang.String r4 = c.a.c.a.f.a()     // Catch: java.lang.Exception -> Ld2
            goto Ld3
        Ld2:
            r4 = r5
        Ld3:
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r7 = "language"
            if (r6 != 0) goto Ldf
            r8.put(r7, r4)
            goto Le2
        Ldf:
            r8.put(r7, r5)
        Le2:
            r4 = 0
            if (r16 == 0) goto L103
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            if (r16 == 0) goto Lf1
            r6.<init>()
            r7 = 1
            r6.append(r7)
            goto Lf7
        Lf1:
            r6.<init>()
            r6.append(r4)
        Lf7:
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "force"
            r8.put(r7, r6)
        L103:
            java.lang.String r6 = "from_service"
            if (r1 != 0) goto L10b
            r8.put(r6, r5)
            goto L10e
        L10b:
            r8.put(r6, r1)
        L10e:
            java.lang.String r1 = r15.k()
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 != 0) goto L11d
            java.lang.String r5 = "extend"
            r8.put(r5, r1)
        L11d:
            int r1 = r2.length
            java.lang.String[] r9 = new java.lang.String[r1]
        L120:
            if (r2 == 0) goto L13d
            int r1 = r2.length
            if (r4 >= r1) goto L13d
            r1 = r2[r4]
            java.lang.String r1 = c.a.c.a.t.a(r1)
            if (r1 == 0) goto L136
            int r5 = r1.length()
            if (r5 <= 0) goto L136
            r9[r4] = r1
            goto L13a
        L136:
            r1 = r2[r4]
            r9[r4] = r1
        L13a:
            int r4 = r4 + 1
            goto L120
        L13d:
            c.a.c.a.i r7 = new c.a.c.a.i
            android.content.Context r1 = c.a.c.a.b.e
            r7.<init>(r1)
            r0.f1287b = r7
            c.a.c.a.q r14 = new c.a.c.a.q
            r14.<init>(r15, r3)
            r10 = r21
            r11 = r22
            r12 = r23
            r13 = r24
            r7.a(r8, r9, r10, r11, r12, r13, r14)
        L156:
            return
    }

    static /* synthetic */ boolean a(c.a.c.a.b r0, java.lang.String r1) {
            boolean r0 = r0.c(r1)
            return r0
    }

    private int b(java.lang.String r13) {
            r12 = this;
            java.lang.String r0 = "status"
            java.lang.String r1 = "current"
            r2 = -1
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L7d
            r3.<init>(r13)     // Catch: org.json.JSONException -> L7d
            boolean r13 = r3.has(r0)     // Catch: org.json.JSONException -> L7d
            if (r13 != 0) goto L13
            r3.put(r0, r2)     // Catch: org.json.JSONException -> L7d
        L13:
            int r2 = r3.getInt(r0)     // Catch: org.json.JSONException -> L7d
            boolean r13 = r3.has(r1)     // Catch: org.json.JSONException -> L7d
            r0 = 601(0x259, float:8.42E-43)
            if (r13 == 0) goto L5c
            if (r2 != 0) goto L5c
            long r4 = r3.getLong(r1)     // Catch: org.json.JSONException -> L7d
            long r6 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L7d
            long r8 = r6 - r4
            double r8 = (double) r8     // Catch: org.json.JSONException -> L7d
            r10 = 4704985352480227328(0x414b774000000000, double:3600000.0)
            double r8 = r8 / r10
            r10 = 4627448617123184640(0x4038000000000000, double:24.0)
            int r13 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r13 < 0) goto L3a
        L38:
            r2 = r0
            goto L5c
        L3a:
            boolean r12 = r12.f1288c     // Catch: org.json.JSONException -> L7d
            if (r12 == 0) goto L5c
            java.text.SimpleDateFormat r12 = new java.text.SimpleDateFormat     // Catch: org.json.JSONException -> L7d
            java.lang.String r13 = "yyyy-MM-dd"
            r12.<init>(r13)     // Catch: org.json.JSONException -> L7d
            java.lang.Long r13 = java.lang.Long.valueOf(r6)     // Catch: org.json.JSONException -> L7d
            java.lang.String r13 = r12.format(r13)     // Catch: org.json.JSONException -> L7d
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: org.json.JSONException -> L7d
            java.lang.String r12 = r12.format(r4)     // Catch: org.json.JSONException -> L7d
            boolean r12 = r13.equals(r12)     // Catch: org.json.JSONException -> L7d
            if (r12 != 0) goto L5c
            goto L38
        L5c:
            boolean r12 = r3.has(r1)     // Catch: org.json.JSONException -> L7d
            if (r12 == 0) goto L81
            r12 = 602(0x25a, float:8.44E-43)
            if (r2 != r12) goto L81
            long r12 = r3.getLong(r1)     // Catch: org.json.JSONException -> L7d
            long r3 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L7d
            long r3 = r3 - r12
            r12 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r12
            double r12 = (double) r3
            r3 = 4640537203540230144(0x4066800000000000, double:180.0)
            int r12 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r12 <= 0) goto L81
            goto L82
        L7d:
            r12 = move-exception
            r12.printStackTrace()
        L81:
            r0 = r2
        L82:
            return r0
    }

    private java.lang.String b(android.content.Context r1) {
            r0 = this;
            int r1 = android.os.Process.myPid()
            java.lang.String r0 = r0.a(r1)     // Catch: java.io.IOException -> L9
            goto La
        L9:
            r0 = 0
        La:
            if (r0 == 0) goto Ld
            return r0
        Ld:
            android.content.Context r0 = c.a.c.a.b.e
            java.lang.String r0 = r0.getPackageName()
            return r0
    }

    private synchronized void b(java.lang.String r6, java.lang.String r7) {
            r5 = this;
            monitor-enter(r5)
            if (r6 != 0) goto L7
            java.lang.String r6 = r5.l()     // Catch: java.lang.Throwable -> Lb8
        L7:
            android.os.Handler r0 = r5.d     // Catch: java.lang.Throwable -> Lb8
            android.os.Message r0 = r0.obtainMessage()     // Catch: java.lang.Throwable -> Lb8
            r1 = -1
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L62 java.lang.Throwable -> Lb8
            r2.<init>(r6)     // Catch: org.json.JSONException -> L62 java.lang.Throwable -> Lb8
            java.lang.String r6 = "status"
            boolean r6 = r2.has(r6)     // Catch: org.json.JSONException -> L62 java.lang.Throwable -> Lb8
            if (r6 != 0) goto L20
            java.lang.String r6 = "status"
            r2.put(r6, r1)     // Catch: org.json.JSONException -> L62 java.lang.Throwable -> Lb8
        L20:
            java.lang.String r6 = "current"
            boolean r6 = r2.has(r6)     // Catch: org.json.JSONException -> L62 java.lang.Throwable -> Lb8
            if (r6 != 0) goto L31
            java.lang.String r6 = "current"
            long r3 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L62 java.lang.Throwable -> Lb8
            r2.put(r6, r3)     // Catch: org.json.JSONException -> L62 java.lang.Throwable -> Lb8
        L31:
            java.lang.String r6 = r2.toString()     // Catch: org.json.JSONException -> L62 java.lang.Throwable -> Lb8
            r5.d(r6)     // Catch: org.json.JSONException -> L62 java.lang.Throwable -> Lb8
            java.lang.String r6 = "current"
            boolean r6 = r2.has(r6)     // Catch: org.json.JSONException -> L62 java.lang.Throwable -> Lb8
            if (r6 == 0) goto L45
            java.lang.String r6 = "current"
            r2.remove(r6)     // Catch: org.json.JSONException -> L62 java.lang.Throwable -> Lb8
        L45:
            java.lang.String r6 = "status"
            int r1 = r2.getInt(r6)     // Catch: org.json.JSONException -> L62 java.lang.Throwable -> Lb8
            r0.what = r1     // Catch: org.json.JSONException -> L62 java.lang.Throwable -> Lb8
            r0.obj = r2     // Catch: org.json.JSONException -> L62 java.lang.Throwable -> Lb8
            android.os.Bundle r6 = new android.os.Bundle     // Catch: org.json.JSONException -> L62 java.lang.Throwable -> Lb8
            r6.<init>()     // Catch: org.json.JSONException -> L62 java.lang.Throwable -> Lb8
            java.lang.String r2 = "listenerKey"
            r6.putString(r2, r7)     // Catch: org.json.JSONException -> L62 java.lang.Throwable -> Lb8
            r0.setData(r6)     // Catch: org.json.JSONException -> L62 java.lang.Throwable -> Lb8
            android.os.Handler r6 = r5.d     // Catch: org.json.JSONException -> L62 java.lang.Throwable -> Lb8
            r6.sendMessage(r0)     // Catch: org.json.JSONException -> L62 java.lang.Throwable -> Lb8
            goto L81
        L62:
            r6 = move-exception
            r6.printStackTrace()     // Catch: java.lang.Throwable -> Lb8
            r0.what = r1     // Catch: java.lang.Throwable -> Lb8
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lb8
            r6.<init>()     // Catch: java.lang.Throwable -> Lb8
            r0.obj = r6     // Catch: java.lang.Throwable -> Lb8
            android.os.Bundle r6 = new android.os.Bundle     // Catch: java.lang.Throwable -> Lb8
            r6.<init>()     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r1 = "listenerKey"
            r6.putString(r1, r7)     // Catch: java.lang.Throwable -> Lb8
            r0.setData(r6)     // Catch: java.lang.Throwable -> Lb8
            android.os.Handler r6 = r5.d     // Catch: java.lang.Throwable -> Lb8
            r6.sendMessage(r0)     // Catch: java.lang.Throwable -> Lb8
        L81:
            c.a.c.a.r r6 = c.a.c.a.b.j     // Catch: java.lang.Throwable -> Lb8
            if (r6 == 0) goto L8a
            c.a.c.a.r r6 = c.a.c.a.b.j     // Catch: java.lang.Throwable -> Lb8
            r6.c()     // Catch: java.lang.Throwable -> Lb8
        L8a:
            int r6 = c.a.c.a.b.k     // Catch: java.lang.Throwable -> Lb8
            int r6 = r6 + (-1)
            c.a.c.a.b.k = r6     // Catch: java.lang.Throwable -> Lb8
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb8
            r6.<init>()     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r7 = "httpRequest called mAuthCounter-- = "
            r6.append(r7)     // Catch: java.lang.Throwable -> Lb8
            int r7 = c.a.c.a.b.k     // Catch: java.lang.Throwable -> Lb8
            r6.append(r7)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Lb8
            c.a.c.a.d.a(r6)     // Catch: java.lang.Throwable -> Lb8
            int r6 = c.a.c.a.b.k     // Catch: java.lang.Throwable -> Lb8
            if (r6 != 0) goto Lb6
            c.a.c.a.r r6 = c.a.c.a.b.j     // Catch: java.lang.Throwable -> Lb8
            if (r6 == 0) goto Lb6
            c.a.c.a.r r6 = c.a.c.a.b.j     // Catch: java.lang.Throwable -> Lb8
            r6.a()     // Catch: java.lang.Throwable -> Lb8
            r6 = 0
            c.a.c.a.b.j = r6     // Catch: java.lang.Throwable -> Lb8
        Lb6:
            monitor-exit(r5)
            return
        Lb8:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    private void b(org.json.JSONObject r2) {
            r1 = this;
            if (r2 == 0) goto L1f
            int r1 = r2.length()
            if (r1 > 0) goto L9
            goto L1f
        L9:
            java.lang.String r1 = "ck"
            boolean r0 = r2.has(r1)
            if (r0 == 0) goto L14
            r2.remove(r1)
        L14:
            java.lang.String r1 = "en"
            boolean r0 = r2.has(r1)
            if (r0 == 0) goto L1f
            r2.remove(r1)
        L1f:
            return
    }

    public static c.a.c.a.b c(android.content.Context r2) {
            c.a.c.a.b r0 = c.a.c.a.b.m
            if (r0 != 0) goto L17
            java.lang.Class<c.a.c.a.b> r0 = c.a.c.a.b.class
            monitor-enter(r0)
            c.a.c.a.b r1 = c.a.c.a.b.m     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L12
            c.a.c.a.b r1 = new c.a.c.a.b     // Catch: java.lang.Throwable -> L14
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L14
            c.a.c.a.b.m = r1     // Catch: java.lang.Throwable -> L14
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            goto L2f
        L14:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r2
        L17:
            if (r2 != 0) goto L2d
            boolean r2 = c.a.c.a.d.f1289a
            if (r2 == 0) goto L2f
            java.lang.String r2 = "input context is null"
            c.a.c.a.d.c(r2)
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r0 = "here"
            r2.<init>(r0)
            r2.printStackTrace()
            goto L2f
        L2d:
            c.a.c.a.b.e = r2
        L2f:
            c.a.c.a.b r2 = c.a.c.a.b.m
            return r2
    }

    static /* synthetic */ java.util.Hashtable c() {
            java.util.Hashtable r0 = c.a.c.a.b.l
            return r0
    }

    private boolean c(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "ak"
            android.content.Context r1 = c.a.c.a.b.e
            java.lang.String r4 = r3.a(r1, r4)
            java.lang.String r3 = r3.l()
            r1 = 1
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1e
            r2.<init>(r3)     // Catch: org.json.JSONException -> L1e
            boolean r3 = r2.has(r0)     // Catch: org.json.JSONException -> L1e
            if (r3 != 0) goto L19
            return r1
        L19:
            java.lang.String r3 = r2.getString(r0)     // Catch: org.json.JSONException -> L1e
            goto L24
        L1e:
            r3 = move-exception
            r3.printStackTrace()
            java.lang.String r3 = ""
        L24:
            if (r4 == 0) goto L2f
            if (r3 == 0) goto L2f
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L2f
            return r1
        L2f:
            r3 = 0
            return r3
    }

    static /* synthetic */ android.content.Context d() {
            android.content.Context r0 = c.a.c.a.b.e
            return r0
    }

    private void d(java.lang.String r4) {
            r3 = this;
            android.content.Context r0 = c.a.c.a.b.e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "authStatus_"
            r1.append(r2)
            android.content.Context r2 = c.a.c.a.b.e
            java.lang.String r3 = r3.b(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r1 = 0
            android.content.SharedPreferences r3 = r0.getSharedPreferences(r3, r1)
            android.content.SharedPreferences$Editor r3 = r3.edit()
            java.lang.String r0 = "status"
            android.content.SharedPreferences$Editor r3 = r3.putString(r0, r4)
            r3.apply()
            return
    }

    static /* synthetic */ java.lang.String e() {
            java.lang.String r0 = c.a.c.a.b.f
            return r0
    }

    static /* synthetic */ int f() {
            int r0 = c.a.c.a.b.g
            return r0
    }

    static /* synthetic */ java.lang.String g() {
            java.lang.String r0 = c.a.c.a.b.h
            return r0
    }

    static /* synthetic */ java.lang.String h() {
            java.lang.String r0 = c.a.c.a.b.i
            return r0
    }

    static /* synthetic */ c.a.c.a.r i() {
            c.a.c.a.r r0 = c.a.c.a.b.j
            return r0
    }

    private void j() {
            r2 = this;
            java.lang.Class<c.a.c.a.b> r2 = c.a.c.a.b.class
            monitor-enter(r2)
            c.a.c.a.r r0 = c.a.c.a.b.j     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L29
            c.a.c.a.r r0 = new c.a.c.a.r     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = "auth"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2b
            c.a.c.a.b.j = r0     // Catch: java.lang.Throwable -> L2b
            r0.start()     // Catch: java.lang.Throwable -> L2b
        L13:
            c.a.c.a.r r0 = c.a.c.a.b.j     // Catch: java.lang.Throwable -> L2b
            android.os.Handler r0 = r0.f1313b     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L29
            java.lang.String r0 = "wait for create auth thread."
            c.a.c.a.d.a(r0)     // Catch: java.lang.InterruptedException -> L24 java.lang.Throwable -> L2b
            r0 = 3
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L24 java.lang.Throwable -> L2b
            goto L13
        L24:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L2b
            goto L13
        L29:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            return
        L2b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            throw r0
    }

    private java.lang.String k() {
            r3 = this;
            java.lang.String r0 = "extend"
            java.lang.String r1 = ""
            java.lang.String r3 = r3.l()
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L19
            r2.<init>(r3)     // Catch: org.json.JSONException -> L19
            boolean r3 = r2.has(r0)     // Catch: org.json.JSONException -> L19
            if (r3 != 0) goto L14
            return r1
        L14:
            java.lang.String r3 = r2.getString(r0)     // Catch: org.json.JSONException -> L19
            return r3
        L19:
            return r1
    }

    private java.lang.String l() {
            r3 = this;
            android.content.Context r0 = c.a.c.a.b.e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "authStatus_"
            r1.append(r2)
            android.content.Context r2 = c.a.c.a.b.e
            java.lang.String r3 = r3.b(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r1 = 0
            android.content.SharedPreferences r3 = r0.getSharedPreferences(r3, r1)
            java.lang.String r0 = "status"
            java.lang.String r1 = "{\"status\":601}"
            java.lang.String r3 = r3.getString(r0, r1)
            return r3
    }

    public int a(boolean r12, java.lang.String r13, java.util.Hashtable r14, c.a.c.a.c r15) {
            r11 = this;
            java.lang.Class<c.a.c.a.b> r0 = c.a.c.a.b.class
            monitor-enter(r0)
            r1 = 1
            r2 = 0
            if (r14 == 0) goto L1d
            java.lang.String r3 = "zero_auth"
            java.lang.Object r3 = r14.get(r3)     // Catch: java.lang.Throwable -> Le2
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> Le2
            if (r3 != 0) goto L12
            goto L1d
        L12:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> Le2
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> Le2
            if (r3 != r1) goto L1d
            r2 = r1
        L1d:
            r11.f1288c = r2     // Catch: java.lang.Throwable -> Le2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le2
            r2.<init>()     // Catch: java.lang.Throwable -> Le2
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Le2
            r2.append(r3)     // Catch: java.lang.Throwable -> Le2
            java.lang.String r3 = ""
            r2.append(r3)     // Catch: java.lang.Throwable -> Le2
            java.lang.String r8 = r2.toString()     // Catch: java.lang.Throwable -> Le2
            if (r15 == 0) goto L3b
            java.util.Hashtable r2 = c.a.c.a.b.l     // Catch: java.lang.Throwable -> Le2
            r2.put(r8, r15)     // Catch: java.lang.Throwable -> Le2
        L3b:
            android.content.Context r15 = c.a.c.a.b.e     // Catch: java.lang.Throwable -> Le2
            java.lang.String r15 = r11.a(r15, r8)     // Catch: java.lang.Throwable -> Le2
            if (r15 == 0) goto Lde
            java.lang.String r2 = ""
            boolean r15 = r15.equals(r2)     // Catch: java.lang.Throwable -> Le2
            if (r15 == 0) goto L4d
            goto Lde
        L4d:
            int r15 = c.a.c.a.b.k     // Catch: java.lang.Throwable -> Le2
            int r15 = r15 + r1
            c.a.c.a.b.k = r15     // Catch: java.lang.Throwable -> Le2
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le2
            r15.<init>()     // Catch: java.lang.Throwable -> Le2
            java.lang.String r1 = " mAuthCounter  ++ = "
            r15.append(r1)     // Catch: java.lang.Throwable -> Le2
            int r1 = c.a.c.a.b.k     // Catch: java.lang.Throwable -> Le2
            r15.append(r1)     // Catch: java.lang.Throwable -> Le2
            java.lang.String r15 = r15.toString()     // Catch: java.lang.Throwable -> Le2
            c.a.c.a.d.a(r15)     // Catch: java.lang.Throwable -> Le2
            java.lang.String r15 = r11.l()     // Catch: java.lang.Throwable -> Le2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le2
            r1.<init>()     // Catch: java.lang.Throwable -> Le2
            java.lang.String r2 = "getAuthMessage from cache:"
            r1.append(r2)     // Catch: java.lang.Throwable -> Le2
            r1.append(r15)     // Catch: java.lang.Throwable -> Le2
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Le2
            c.a.c.a.d.a(r1)     // Catch: java.lang.Throwable -> Le2
            int r15 = r11.b(r15)     // Catch: java.lang.Throwable -> Le2
            r1 = 601(0x259, float:8.42E-43)
            if (r15 != r1) goto La1
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L9d java.lang.Throwable -> Le2
            r1.<init>()     // Catch: org.json.JSONException -> L9d java.lang.Throwable -> Le2
            java.lang.String r2 = "status"
            r3 = 602(0x25a, float:8.44E-43)
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L9d java.lang.Throwable -> Le2
            java.lang.String r1 = r1.toString()     // Catch: org.json.JSONException -> L9d java.lang.Throwable -> Le2
            r11.d(r1)     // Catch: org.json.JSONException -> L9d java.lang.Throwable -> Le2
            goto La1
        L9d:
            r1 = move-exception
            r1.printStackTrace()     // Catch: java.lang.Throwable -> Le2
        La1:
            r11.j()     // Catch: java.lang.Throwable -> Le2
            c.a.c.a.r r1 = c.a.c.a.b.j     // Catch: java.lang.Throwable -> Le2
            if (r1 == 0) goto Ldb
            c.a.c.a.r r1 = c.a.c.a.b.j     // Catch: java.lang.Throwable -> Le2
            android.os.Handler r1 = r1.f1313b     // Catch: java.lang.Throwable -> Le2
            if (r1 != 0) goto Laf
            goto Ldb
        Laf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le2
            r1.<init>()     // Catch: java.lang.Throwable -> Le2
            java.lang.String r2 = "mThreadLooper.mHandler = "
            r1.append(r2)     // Catch: java.lang.Throwable -> Le2
            c.a.c.a.r r2 = c.a.c.a.b.j     // Catch: java.lang.Throwable -> Le2
            android.os.Handler r2 = r2.f1313b     // Catch: java.lang.Throwable -> Le2
            r1.append(r2)     // Catch: java.lang.Throwable -> Le2
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Le2
            c.a.c.a.d.a(r1)     // Catch: java.lang.Throwable -> Le2
            c.a.c.a.r r1 = c.a.c.a.b.j     // Catch: java.lang.Throwable -> Le2
            android.os.Handler r1 = r1.f1313b     // Catch: java.lang.Throwable -> Le2
            c.a.c.a.o r2 = new c.a.c.a.o     // Catch: java.lang.Throwable -> Le2
            r4 = r2
            r5 = r11
            r6 = r15
            r7 = r12
            r9 = r13
            r10 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Le2
            r1.post(r2)     // Catch: java.lang.Throwable -> Le2
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le2
            return r15
        Ldb:
            r11 = -1
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le2
            return r11
        Lde:
            r11 = 101(0x65, float:1.42E-43)
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le2
            return r11
        Le2:
            r11 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le2
            throw r11
    }

    public java.lang.String a() {
            r4 = this;
            java.lang.String r4 = "cuid"
            java.lang.String r0 = c.a.c.a.b.q
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Ld
            java.lang.String r4 = c.a.c.a.b.q
            return r4
        Ld:
            android.content.Context r0 = c.a.c.a.b.e
            java.lang.String r1 = ""
            if (r0 != 0) goto L14
            return r1
        L14:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L99
            r0.<init>()     // Catch: java.lang.Exception -> L99
            java.lang.String r2 = "mIsPrivacyMode "
            r0.append(r2)     // Catch: java.lang.Exception -> L99
            boolean r2 = c.a.c.a.b.p     // Catch: java.lang.Exception -> L99
            r0.append(r2)     // Catch: java.lang.Exception -> L99
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L99
            c.a.c.a.d.a(r0)     // Catch: java.lang.Exception -> L99
            boolean r0 = c.a.c.a.b.p     // Catch: java.lang.Exception -> L99
            if (r0 == 0) goto L58
            java.lang.String r4 = c.a.c.a.b.o     // Catch: java.lang.Exception -> L99
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L99
            if (r4 != 0) goto L3b
            java.lang.String r4 = c.a.c.a.b.o     // Catch: java.lang.Exception -> L99
            c.a.a.a.a.a.a.a(r4)     // Catch: java.lang.Exception -> L99
        L3b:
            android.content.Context r4 = c.a.c.a.b.e     // Catch: java.lang.Exception -> L99
            java.lang.String r1 = c.a.a.a.a.a.a.a(r4)     // Catch: java.lang.Exception -> L99
            c.a.c.a.b.q = r1     // Catch: java.lang.Exception -> L99
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L99
            r4.<init>()     // Catch: java.lang.Exception -> L99
            java.lang.String r0 = "getCUID: "
            r4.append(r0)     // Catch: java.lang.Exception -> L99
            r4.append(r1)     // Catch: java.lang.Exception -> L99
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L99
            c.a.c.a.d.a(r4)     // Catch: java.lang.Exception -> L99
            goto L9d
        L58:
            android.content.Context r0 = c.a.c.a.b.e     // Catch: java.lang.Exception -> L99
            java.lang.String r2 = "Map_Privacy"
            r3 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r2, r3)     // Catch: java.lang.Exception -> L99
            boolean r2 = r0.contains(r4)     // Catch: java.lang.Exception -> L99
            if (r2 == 0) goto L6c
            java.lang.String r1 = r0.getString(r4, r1)     // Catch: java.lang.Exception -> L99
            goto L9d
        L6c:
            java.util.UUID r2 = java.util.UUID.randomUUID()     // Catch: java.lang.Exception -> L99
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L99
            byte[] r2 = r2.getBytes()     // Catch: java.lang.Exception -> L99
            r3 = 1
            java.lang.String r2 = c.a.c.a.s.a(r2, r3)     // Catch: java.lang.Exception -> L99
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L99
            r3.<init>()     // Catch: java.lang.Exception -> L99
            r3.append(r2)     // Catch: java.lang.Exception -> L99
            java.lang.String r2 = "|MAPSDK001"
            r3.append(r2)     // Catch: java.lang.Exception -> L99
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Exception -> L99
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Exception -> L99
            r0.putString(r4, r1)     // Catch: java.lang.Exception -> L99
            r0.apply()     // Catch: java.lang.Exception -> L99
            goto L9d
        L99:
            r4 = move-exception
            r4.printStackTrace()
        L9d:
            return r1
    }

    public java.lang.String a(android.content.Context r2) {
            r1 = this;
            java.lang.String r1 = c.a.c.a.b.n
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto Lb
            java.lang.String r1 = c.a.c.a.b.n
            return r1
        Lb:
            java.lang.String r1 = r2.getPackageName()
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            r0 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r1 = r2.getApplicationInfo(r1, r0)
            android.os.Bundle r1 = r1.metaData
            java.lang.String r2 = "com.baidu.lbsapi.API_KEY"
            java.lang.String r1 = r1.getString(r2)
            return r1
    }

    public void a(java.lang.String r1) {
            r0 = this;
            android.content.Context r0 = c.a.c.a.b.e
            if (r0 == 0) goto Ld
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            c.a.c.a.b.n = r1
        Ld:
            return
    }

    public void a(java.lang.String r1, int r2) {
            r0 = this;
            c.a.c.a.b.f = r1
            c.a.c.a.b.g = r2
            return
    }

    public void a(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            c.a.c.a.b.h = r1
            c.a.c.a.b.i = r2
            return
    }

    public void a(boolean r4) {
            r3 = this;
            android.content.Context r3 = c.a.c.a.b.e
            if (r3 != 0) goto L5
            return
        L5:
            r0 = 0
            java.lang.String r1 = "Map_Privacy"
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r1, r0)
            android.content.SharedPreferences$Editor r1 = r3.edit()
            java.lang.String r2 = "privacyMode"
            if (r4 == 0) goto L1d
            r1.putBoolean(r2, r4)
            r1.apply()
            c.a.c.a.b.p = r4
            goto L23
        L1d:
            boolean r3 = r3.getBoolean(r2, r0)
            c.a.c.a.b.p = r3
        L23:
            return
    }

    public java.lang.String b() {
            r0 = this;
            android.content.Context r0 = c.a.c.a.b.e
            if (r0 != 0) goto L7
            java.lang.String r0 = ""
            return r0
        L7:
            java.lang.String r0 = c.a.c.a.f.a(r0)
            return r0
    }
}
