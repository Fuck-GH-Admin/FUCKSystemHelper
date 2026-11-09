package c.a.b;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.String f1275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.String f1276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1277c;

    public l() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f1277c = r0
            return
    }

    public static c.a.b.l a(java.lang.String r2, java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L2a
            c.a.b.l r0 = new c.a.b.l
            r0.<init>()
            r0.f1275a = r2
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 == 0) goto L15
            r2 = 0
            goto L19
        L15:
            int r2 = r3.length()
        L19:
            r0.f1277c = r2
            r1 = 14
            if (r2 >= r1) goto L29
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 == 0) goto L27
            java.lang.String r3 = "0"
        L27:
            r0.f1276b = r3
        L29:
            return r0
        L2a:
            r2 = 0
            return r2
    }

    public static boolean a(int r1) {
            r0 = 14
            if (r1 < r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    public static boolean a(java.lang.String r0) {
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            return r0
    }

    public static c.a.b.l b(java.lang.String r0) {
            java.lang.String r0 = e(r0)
            c.a.b.l r0 = c(r0)
            return r0
    }

    private static c.a.b.l c(java.lang.String r7) {
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L7a
            r0.<init>(r7)     // Catch: org.json.JSONException -> L7a
            java.util.Iterator r7 = r0.keys()     // Catch: org.json.JSONException -> L7a
            java.lang.String r2 = "0"
            r3 = r2
        L14:
            boolean r4 = r7.hasNext()     // Catch: org.json.JSONException -> L7a
            java.lang.String r5 = "dmVy"
            java.lang.String r6 = "ZGV2aWNlaWQ="
            if (r4 == 0) goto L3e
            java.lang.Object r4 = r7.next()     // Catch: org.json.JSONException -> L7a
            java.lang.String r4 = (java.lang.String) r4     // Catch: org.json.JSONException -> L7a
            java.lang.String r6 = d(r6)     // Catch: org.json.JSONException -> L7a
            boolean r6 = r6.equals(r4)     // Catch: org.json.JSONException -> L7a
            if (r6 != 0) goto L14
            java.lang.String r5 = d(r5)     // Catch: org.json.JSONException -> L7a
            boolean r5 = r5.equals(r4)     // Catch: org.json.JSONException -> L7a
            if (r5 == 0) goto L39
            goto L14
        L39:
            java.lang.String r3 = r0.optString(r4, r2)     // Catch: org.json.JSONException -> L7a
            goto L14
        L3e:
            java.lang.String r7 = d(r6)     // Catch: org.json.JSONException -> L7a
            java.lang.String r7 = r0.getString(r7)     // Catch: org.json.JSONException -> L7a
            java.lang.String r4 = d(r5)     // Catch: org.json.JSONException -> L7a
            r0.getInt(r4)     // Catch: org.json.JSONException -> L7a
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: org.json.JSONException -> L7a
            if (r0 == 0) goto L55
            r0 = 0
            goto L59
        L55:
            int r0 = r3.length()     // Catch: org.json.JSONException -> L7a
        L59:
            boolean r4 = android.text.TextUtils.isEmpty(r7)     // Catch: org.json.JSONException -> L7a
            if (r4 != 0) goto L7e
            c.a.b.l r4 = new c.a.b.l     // Catch: org.json.JSONException -> L7a
            r4.<init>()     // Catch: org.json.JSONException -> L7a
            r4.f1275a = r7     // Catch: org.json.JSONException -> L7a
            r4.f1277c = r0     // Catch: org.json.JSONException -> L7a
            r7 = 14
            if (r0 >= r7) goto L76
            boolean r7 = android.text.TextUtils.isEmpty(r3)     // Catch: org.json.JSONException -> L7a
            if (r7 == 0) goto L73
            goto L74
        L73:
            r2 = r3
        L74:
            r4.f1276b = r2     // Catch: org.json.JSONException -> L7a
        L76:
            r4.c()     // Catch: org.json.JSONException -> L7a
            return r4
        L7a:
            r7 = move-exception
            c.a.b.k.c.a(r7)
        L7e:
            return r1
    }

    private static java.lang.String d(java.lang.String r1) {
            java.lang.String r0 = new java.lang.String
            byte[] r1 = r1.getBytes()
            byte[] r1 = c.a.b.g.a.a(r1)
            r0.<init>(r1)
            return r0
    }

    private static java.lang.String e(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L8
            r2 = 0
            return r2
        L8:
            byte[] r0 = c.a.b.e.a.g.a()     // Catch: java.lang.Exception -> L1e
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Exception -> L1e
            byte[] r2 = r2.getBytes()     // Catch: java.lang.Exception -> L1e
            byte[] r2 = c.a.b.g.a.a(r2)     // Catch: java.lang.Exception -> L1e
            byte[] r2 = c.a.b.e.a.c.a(r0, r0, r2)     // Catch: java.lang.Exception -> L1e
            r1.<init>(r2)     // Catch: java.lang.Exception -> L1e
            return r1
        L1e:
            r2 = move-exception
            c.a.b.k.c.a(r2)
            java.lang.String r2 = ""
            return r2
    }

    boolean a() {
            r0 = this;
            java.lang.String r0 = r0.f1276b
            boolean r0 = a(r0)
            return r0
    }

    boolean b() {
            r0 = this;
            int r0 = r0.f1277c
            boolean r0 = a(r0)
            return r0
    }

    boolean c() {
            r2 = this;
            boolean r0 = r2.b()
            r1 = 1
            if (r0 == 0) goto Lc
            java.lang.String r0 = "O"
        L9:
            r2.f1276b = r0
            goto L16
        Lc:
            boolean r0 = r2.a()
            if (r0 == 0) goto L15
            java.lang.String r0 = "0"
            goto L9
        L15:
            r1 = 0
        L16:
            return r1
    }
}
