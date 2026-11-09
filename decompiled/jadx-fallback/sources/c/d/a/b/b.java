package c.d.a.b;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f1328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.String f1329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f1330c;
    private long d;
    private long e;
    private long f;
    private int g;
    private long h;
    private long i;
    private long j;
    private long k;

    public b() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f1330c = r0
            r3.d = r0
            r3.e = r0
            r3.f = r0
            r2 = -1
            r3.g = r2
            r3.h = r0
            r3.i = r0
            r3.j = r0
            r3.k = r0
            return
    }

    public org.json.JSONObject a() {
            r6 = this;
            java.lang.String r0 = "KB"
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = c.d.a.b.l.a()
            java.lang.String r3 = r6.f1329b     // Catch: org.json.JSONException -> Le1
            java.lang.String r4 = ""
            if (r3 != 0) goto L13
            r6.f1329b = r4     // Catch: org.json.JSONException -> Le1
        L13:
            java.lang.String r3 = "appLabel"
            java.lang.String r5 = r6.f1329b     // Catch: org.json.JSONException -> Le1
            r1.put(r3, r5)     // Catch: org.json.JSONException -> Le1
            java.lang.String r3 = r6.f1328a     // Catch: org.json.JSONException -> Le1
            if (r3 != 0) goto L20
            r6.f1328a = r4     // Catch: org.json.JSONException -> Le1
        L20:
            java.lang.String r3 = "pkgName"
            java.lang.String r4 = r6.f1328a     // Catch: org.json.JSONException -> Le1
            r1.put(r3, r4)     // Catch: org.json.JSONException -> Le1
            java.lang.String r3 = "Time"
            r1.put(r3, r2)     // Catch: org.json.JSONException -> Le1
            java.lang.String r2 = "runTime"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> Le1
            r3.<init>()     // Catch: org.json.JSONException -> Le1
            long r4 = r6.f1330c     // Catch: org.json.JSONException -> Le1
            r3.append(r4)     // Catch: org.json.JSONException -> Le1
            java.lang.String r4 = "min"
            r3.append(r4)     // Catch: org.json.JSONException -> Le1
            java.lang.String r3 = r3.toString()     // Catch: org.json.JSONException -> Le1
            r1.put(r2, r3)     // Catch: org.json.JSONException -> Le1
            java.lang.String r2 = "tx1"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> Le1
            r3.<init>()     // Catch: org.json.JSONException -> Le1
            long r4 = r6.h     // Catch: org.json.JSONException -> Le1
            r3.append(r4)     // Catch: org.json.JSONException -> Le1
            r3.append(r0)     // Catch: org.json.JSONException -> Le1
            java.lang.String r3 = r3.toString()     // Catch: org.json.JSONException -> Le1
            r1.put(r2, r3)     // Catch: org.json.JSONException -> Le1
            java.lang.String r2 = "rx1"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> Le1
            r3.<init>()     // Catch: org.json.JSONException -> Le1
            long r4 = r6.i     // Catch: org.json.JSONException -> Le1
            r3.append(r4)     // Catch: org.json.JSONException -> Le1
            r3.append(r0)     // Catch: org.json.JSONException -> Le1
            java.lang.String r3 = r3.toString()     // Catch: org.json.JSONException -> Le1
            r1.put(r2, r3)     // Catch: org.json.JSONException -> Le1
            java.lang.String r2 = "tx2"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> Le1
            r3.<init>()     // Catch: org.json.JSONException -> Le1
            long r4 = r6.j     // Catch: org.json.JSONException -> Le1
            r3.append(r4)     // Catch: org.json.JSONException -> Le1
            r3.append(r0)     // Catch: org.json.JSONException -> Le1
            java.lang.String r3 = r3.toString()     // Catch: org.json.JSONException -> Le1
            r1.put(r2, r3)     // Catch: org.json.JSONException -> Le1
            java.lang.String r2 = "rx2"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> Le1
            r3.<init>()     // Catch: org.json.JSONException -> Le1
            long r4 = r6.k     // Catch: org.json.JSONException -> Le1
            r3.append(r4)     // Catch: org.json.JSONException -> Le1
            r3.append(r0)     // Catch: org.json.JSONException -> Le1
            java.lang.String r3 = r3.toString()     // Catch: org.json.JSONException -> Le1
            r1.put(r2, r3)     // Catch: org.json.JSONException -> Le1
            java.lang.String r2 = "totalData1"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> Le1
            r3.<init>()     // Catch: org.json.JSONException -> Le1
            long r4 = r6.d     // Catch: org.json.JSONException -> Le1
            r3.append(r4)     // Catch: org.json.JSONException -> Le1
            r3.append(r0)     // Catch: org.json.JSONException -> Le1
            java.lang.String r3 = r3.toString()     // Catch: org.json.JSONException -> Le1
            r1.put(r2, r3)     // Catch: org.json.JSONException -> Le1
            java.lang.String r2 = "totalData2"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> Le1
            r3.<init>()     // Catch: org.json.JSONException -> Le1
            long r4 = r6.e     // Catch: org.json.JSONException -> Le1
            r3.append(r4)     // Catch: org.json.JSONException -> Le1
            r3.append(r0)     // Catch: org.json.JSONException -> Le1
            java.lang.String r0 = r3.toString()     // Catch: org.json.JSONException -> Le1
            r1.put(r2, r0)     // Catch: org.json.JSONException -> Le1
            java.lang.String r0 = "totalDataWiFi"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> Le1
            r2.<init>()     // Catch: org.json.JSONException -> Le1
            long r3 = r6.f     // Catch: org.json.JSONException -> Le1
            r2.append(r3)     // Catch: org.json.JSONException -> Le1
            java.lang.String r6 = "MB"
            r2.append(r6)     // Catch: org.json.JSONException -> Le1
            java.lang.String r6 = r2.toString()     // Catch: org.json.JSONException -> Le1
            r1.put(r0, r6)     // Catch: org.json.JSONException -> Le1
            goto Lfc
        Le1:
            r6 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "getJsonObject->"
            r0.append(r2)
            java.lang.String r6 = r6.getMessage()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "AppInfo"
            c.d.a.b.h.b(r0, r6)
        Lfc:
            return r1
    }

    public void a(int r1) {
            r0 = this;
            r0.g = r1
            return
    }

    public void a(long r1) {
            r0 = this;
            r0.f1330c = r1
            return
    }

    public void a(java.lang.String r1) {
            r0 = this;
            r0.f1329b = r1
            return
    }

    public int b() {
            r0 = this;
            int r0 = r0.g
            return r0
    }

    public void b(long r1) {
            r0 = this;
            r0.i = r1
            return
    }

    public void b(java.lang.String r1) {
            r0 = this;
            r0.f1328a = r1
            return
    }

    public void c(long r1) {
            r0 = this;
            r0.k = r1
            return
    }

    public void d(long r1) {
            r0 = this;
            return
    }

    public void e(long r1) {
            r0 = this;
            r0.d = r1
            return
    }

    public void f(long r1) {
            r0 = this;
            r0.e = r1
            return
    }

    public void g(long r1) {
            r0 = this;
            r0.f = r1
            return
    }

    public void h(long r1) {
            r0 = this;
            r0.h = r1
            return
    }

    public void i(long r1) {
            r0 = this;
            r0.j = r1
            return
    }

    public void j(long r1) {
            r0 = this;
            return
    }
}
