package a.a.a.b;

/* JADX INFO: loaded from: classes.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public okhttp3.OkHttpClient f63a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.String f64b;

    public interface a {
        void a(int r1, java.lang.String r2);

        void b(int r1, java.lang.String r2);
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a.a.a.b.q f65a = null;

        static {
                a.a.a.b.q r0 = new a.a.a.b.q
                r0.<init>()
                a.a.a.b.q.b.f65a = r0
                return
        }

        public static /* synthetic */ a.a.a.b.q a() {
                a.a.a.b.q r0 = a.a.a.b.q.b.f65a
                return r0
        }
    }

    public q() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f64b = r0
            r1.b()
            return
    }

    public static a.a.a.b.q c() {
            a.a.a.b.q r0 = a.a.a.b.q.b.a()
            return r0
    }

    public final okhttp3.Request.Builder a() {
            r2 = this;
            okhttp3.Request$Builder r2 = new okhttp3.Request$Builder
            r2.<init>()
            java.lang.String r0 = "Content-Type"
            java.lang.String r1 = "application/x-www-form-urlencoded; charset=utf-8"
            r2.addHeader(r0, r1)
            java.lang.String r0 = a.a.a.i.i.o0
            if (r0 == 0) goto L15
            java.lang.String r1 = "bd-loc-android"
            r2.addHeader(r1, r0)
        L15:
            return r2
    }

    public final synchronized okhttp3.RequestBody a(java.util.Map<java.lang.String, java.lang.Object> r4) {
            r3 = this;
            monitor-enter(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L54
            r0.<init>()     // Catch: java.lang.Throwable -> L54
            java.util.Set r4 = r4.entrySet()     // Catch: java.lang.Throwable -> L54
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L54
        Le:
            boolean r1 = r4.hasNext()     // Catch: java.lang.Throwable -> L54
            if (r1 == 0) goto L35
            java.lang.Object r1 = r4.next()     // Catch: java.lang.Throwable -> L54
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L54
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L54
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L54
            r0.append(r2)     // Catch: java.lang.Throwable -> L54
            java.lang.String r2 = "="
            r0.append(r2)     // Catch: java.lang.Throwable -> L54
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L54
            r0.append(r1)     // Catch: java.lang.Throwable -> L54
            java.lang.String r1 = "&"
            r0.append(r1)     // Catch: java.lang.Throwable -> L54
            goto Le
        L35:
            int r4 = r0.length()     // Catch: java.lang.Throwable -> L54
            if (r4 <= 0) goto L44
            int r4 = r0.length()     // Catch: java.lang.Throwable -> L54
            int r4 = r4 + (-1)
            r0.deleteCharAt(r4)     // Catch: java.lang.Throwable -> L54
        L44:
            java.lang.String r4 = "application/json;charset=UTF-8"
            okhttp3.MediaType r4 = okhttp3.MediaType.parse(r4)     // Catch: java.lang.Throwable -> L54
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L54
            okhttp3.RequestBody r4 = okhttp3.RequestBody.create(r4, r0)     // Catch: java.lang.Throwable -> L54
            monitor-exit(r3)
            return r4
        L54:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    public void a(java.lang.String r1) {
            r0 = this;
            r0.f64b = r1
            return
    }

    public void a(java.util.Map<java.lang.String, java.lang.Object> r4, java.lang.String r5, a.a.a.b.q.a r6) {
            r3 = this;
            okhttp3.RequestBody r4 = r3.a(r4)     // Catch: java.io.IOException -> L51
            okhttp3.Request$Builder r0 = r3.a()     // Catch: java.io.IOException -> L51
            java.lang.String r1 = r3.f64b     // Catch: java.io.IOException -> L51
            if (r1 == 0) goto L11
            java.lang.String r2 = "alwd"
            r0.addHeader(r2, r1)     // Catch: java.io.IOException -> L51
        L11:
            okhttp3.Request$Builder r5 = r0.url(r5)     // Catch: java.io.IOException -> L51
            okhttp3.Request$Builder r4 = r5.post(r4)     // Catch: java.io.IOException -> L51
            okhttp3.Request r4 = r4.build()     // Catch: java.io.IOException -> L51
            okhttp3.OkHttpClient r3 = r3.f63a     // Catch: java.io.IOException -> L51
            okhttp3.Call r3 = r3.newCall(r4)     // Catch: java.io.IOException -> L51
            okhttp3.Response r3 = r3.execute()     // Catch: java.io.IOException -> L51
            boolean r4 = r3.isSuccessful()     // Catch: java.io.IOException -> L51
            if (r4 == 0) goto L48
            okhttp3.ResponseBody r4 = r3.body()     // Catch: java.io.IOException -> L51
            if (r4 == 0) goto L41
            okhttp3.ResponseBody r3 = r3.body()     // Catch: java.io.IOException -> L51
            java.lang.String r3 = r3.string()     // Catch: java.io.IOException -> L51
            r4 = 200(0xc8, float:2.8E-43)
            r6.a(r4, r3)     // Catch: java.io.IOException -> L51
            goto L71
        L41:
            r4 = 400(0x190, float:5.6E-43)
        L43:
            java.lang.String r3 = r3.message()     // Catch: java.io.IOException -> L51
            goto L4d
        L48:
            int r4 = r3.code()     // Catch: java.io.IOException -> L51
            goto L43
        L4d:
            r6.b(r4, r3)     // Catch: java.io.IOException -> L51
            goto L71
        L51:
            r3 = move-exception
            r3.printStackTrace()
            if (r6 == 0) goto L71
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "e="
            r4.append(r5)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r4 = -100
            r6.b(r4, r3)
        L71:
            return
    }

    public final synchronized void b() {
            r4 = this;
            monitor-enter(r4)
            okhttp3.OkHttpClient r0 = r4.f63a     // Catch: java.lang.Throwable -> L27
            if (r0 != 0) goto L25
            okhttp3.OkHttpClient$Builder r0 = new okhttp3.OkHttpClient$Builder     // Catch: java.lang.Throwable -> L27
            r0.<init>()     // Catch: java.lang.Throwable -> L27
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L27
            r2 = 12000(0x2ee0, double:5.929E-320)
            okhttp3.OkHttpClient$Builder r0 = r0.connectTimeout(r2, r1)     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L27
            okhttp3.OkHttpClient$Builder r0 = r0.readTimeout(r2, r1)     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L27
            okhttp3.OkHttpClient$Builder r0 = r0.writeTimeout(r2, r1)     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L27
            okhttp3.OkHttpClient r0 = r0.build()     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L27
            r4.f63a = r0     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L27
            goto L25
        L21:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L27
        L25:
            monitor-exit(r4)
            return
        L27:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }
}
