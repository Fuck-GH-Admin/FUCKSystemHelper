package c.d.a.b;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.net.HttpURLConnection f1336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private javax.net.ssl.HttpsURLConnection f1337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1338c;

    public f() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f1336a = r0
            r1.f1337b = r0
            r0 = 0
            r1.f1338c = r0
            return
    }

    public synchronized int a() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.f1338c     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public synchronized boolean a(java.lang.String r6, byte[] r7, byte[] r8) {
            r5 = this;
            monitor-enter(r5)
            r8 = 0
            java.lang.String r0 = "HttpHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L160
            r1.<init>()     // Catch: java.lang.Throwable -> L160
            java.lang.String r2 = "sendHttpRequest() path = "
            r1.append(r2)     // Catch: java.lang.Throwable -> L160
            r1.append(r6)     // Catch: java.lang.Throwable -> L160
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L160
            c.d.a.b.h.a(r0, r1)     // Catch: java.lang.Throwable -> L160
            java.lang.String r0 = "http://"
            boolean r0 = r6.startsWith(r0)     // Catch: java.lang.Throwable -> L160
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 15000(0x3a98, float:2.102E-41)
            r3 = 10000(0x2710, float:1.4013E-41)
            r4 = 1
            if (r0 == 0) goto Lbf
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> Lb4
            r0.<init>(r6)     // Catch: java.lang.Throwable -> Lb4
            java.net.URLConnection r6 = r0.openConnection()     // Catch: java.lang.Throwable -> Lb4
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch: java.lang.Throwable -> Lb4
            r5.f1336a = r6     // Catch: java.lang.Throwable -> Lb4
            r6.setConnectTimeout(r3)     // Catch: java.lang.Throwable -> Lb4
            java.net.HttpURLConnection r6 = r5.f1336a     // Catch: java.lang.Throwable -> Lb4
            r6.setReadTimeout(r2)     // Catch: java.lang.Throwable -> Lb4
            java.net.HttpURLConnection r6 = r5.f1336a     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r0 = "POST"
            r6.setRequestMethod(r0)     // Catch: java.lang.Throwable -> Lb4
            java.net.HttpURLConnection r6 = r5.f1336a     // Catch: java.lang.Throwable -> Lb4
            r6.setDoOutput(r4)     // Catch: java.lang.Throwable -> Lb4
            java.net.HttpURLConnection r6 = r5.f1336a     // Catch: java.lang.Throwable -> Lb4
            r6.setDoInput(r4)     // Catch: java.lang.Throwable -> Lb4
            java.net.HttpURLConnection r6 = r5.f1336a     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r0 = "Content-Type"
            java.lang.String r2 = "application/encrypted-json"
            r6.setRequestProperty(r0, r2)     // Catch: java.lang.Throwable -> Lb4
            java.net.HttpURLConnection r6 = r5.f1336a     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r0 = "Content-Length"
            int r2 = r7.length     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> Lb4
            r6.setRequestProperty(r0, r2)     // Catch: java.lang.Throwable -> Lb4
            java.net.HttpURLConnection r6 = r5.f1336a     // Catch: java.lang.Throwable -> Lb4
            java.io.OutputStream r6 = r6.getOutputStream()     // Catch: java.lang.Throwable -> Lb4
            r6.write(r7)     // Catch: java.lang.Throwable -> Lb4
            r6.flush()     // Catch: java.lang.Throwable -> Lb4
            r6.close()     // Catch: java.lang.Throwable -> Lb4
            java.net.HttpURLConnection r6 = r5.f1336a     // Catch: java.lang.Throwable -> Lb4
            int r6 = r6.getResponseCode()     // Catch: java.lang.Throwable -> Lb4
            r5.f1338c = r6     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r6 = "HttpHelper"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb4
            r7.<init>()     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r0 = "server responseCode-->"
            r7.append(r0)     // Catch: java.lang.Throwable -> Lb4
            int r0 = r5.f1338c     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> Lb4
            r7.append(r0)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> Lb4
            c.d.a.b.h.a(r6, r7)     // Catch: java.lang.Throwable -> Lb4
            int r6 = r5.f1338c     // Catch: java.lang.Throwable -> Lb4
            if (r6 != r1) goto La2
            java.lang.String r6 = "HttpHelper"
            java.lang.String r7 = "register success!"
            c.d.a.b.h.a(r6, r7)     // Catch: java.lang.Throwable -> Lb4
            r8 = r4
            goto La9
        La2:
            java.lang.String r6 = "HttpHelper"
            java.lang.String r7 = "register fail!"
            c.d.a.b.h.b(r6, r7)     // Catch: java.lang.Throwable -> Lb4
        La9:
            java.net.HttpURLConnection r6 = r5.f1336a     // Catch: java.lang.Throwable -> L160
            if (r6 == 0) goto L15e
            java.net.HttpURLConnection r6 = r5.f1336a     // Catch: java.lang.Throwable -> L160
            r6.disconnect()     // Catch: java.lang.Throwable -> L160
            goto L15e
        Lb4:
            r6 = move-exception
            java.net.HttpURLConnection r7 = r5.f1336a     // Catch: java.lang.Throwable -> L160
            if (r7 == 0) goto Lbe
            java.net.HttpURLConnection r7 = r5.f1336a     // Catch: java.lang.Throwable -> L160
            r7.disconnect()     // Catch: java.lang.Throwable -> L160
        Lbe:
            throw r6     // Catch: java.lang.Throwable -> L160
        Lbf:
            java.lang.String r0 = "https://"
            boolean r0 = r6.startsWith(r0)     // Catch: java.lang.Throwable -> L160
            if (r0 == 0) goto L15e
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> L153
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L153
            java.net.URLConnection r6 = r0.openConnection()     // Catch: java.lang.Throwable -> L153
            javax.net.ssl.HttpsURLConnection r6 = (javax.net.ssl.HttpsURLConnection) r6     // Catch: java.lang.Throwable -> L153
            r5.f1337b = r6     // Catch: java.lang.Throwable -> L153
            r6.setConnectTimeout(r3)     // Catch: java.lang.Throwable -> L153
            javax.net.ssl.HttpsURLConnection r6 = r5.f1337b     // Catch: java.lang.Throwable -> L153
            r6.setReadTimeout(r2)     // Catch: java.lang.Throwable -> L153
            javax.net.ssl.HttpsURLConnection r6 = r5.f1337b     // Catch: java.lang.Throwable -> L153
            java.lang.String r0 = "POST"
            r6.setRequestMethod(r0)     // Catch: java.lang.Throwable -> L153
            javax.net.ssl.HttpsURLConnection r6 = r5.f1337b     // Catch: java.lang.Throwable -> L153
            r6.setDoOutput(r4)     // Catch: java.lang.Throwable -> L153
            javax.net.ssl.HttpsURLConnection r6 = r5.f1337b     // Catch: java.lang.Throwable -> L153
            r6.setDoInput(r4)     // Catch: java.lang.Throwable -> L153
            javax.net.ssl.HttpsURLConnection r6 = r5.f1337b     // Catch: java.lang.Throwable -> L153
            java.lang.String r0 = "Content-Type"
            java.lang.String r2 = "application/encrypted-json"
            r6.setRequestProperty(r0, r2)     // Catch: java.lang.Throwable -> L153
            javax.net.ssl.HttpsURLConnection r6 = r5.f1337b     // Catch: java.lang.Throwable -> L153
            java.lang.String r0 = "Content-Length"
            int r2 = r7.length     // Catch: java.lang.Throwable -> L153
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L153
            r6.setRequestProperty(r0, r2)     // Catch: java.lang.Throwable -> L153
            javax.net.ssl.HttpsURLConnection r6 = r5.f1337b     // Catch: java.lang.Throwable -> L153
            java.io.OutputStream r6 = r6.getOutputStream()     // Catch: java.lang.Throwable -> L153
            r6.write(r7)     // Catch: java.lang.Throwable -> L153
            r6.flush()     // Catch: java.lang.Throwable -> L153
            r6.close()     // Catch: java.lang.Throwable -> L153
            javax.net.ssl.HttpsURLConnection r6 = r5.f1337b     // Catch: java.lang.Throwable -> L153
            int r6 = r6.getResponseCode()     // Catch: java.lang.Throwable -> L153
            r5.f1338c = r6     // Catch: java.lang.Throwable -> L153
            java.lang.String r6 = "HttpHelper"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L153
            r7.<init>()     // Catch: java.lang.Throwable -> L153
            java.lang.String r0 = "server responseCode-->"
            r7.append(r0)     // Catch: java.lang.Throwable -> L153
            int r0 = r5.f1338c     // Catch: java.lang.Throwable -> L153
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L153
            r7.append(r0)     // Catch: java.lang.Throwable -> L153
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L153
            c.d.a.b.h.a(r6, r7)     // Catch: java.lang.Throwable -> L153
            int r6 = r5.f1338c     // Catch: java.lang.Throwable -> L153
            if (r6 != r1) goto L142
            java.lang.String r6 = "HttpHelper"
            java.lang.String r7 = "register success!"
            c.d.a.b.h.a(r6, r7)     // Catch: java.lang.Throwable -> L153
            r8 = r4
            goto L149
        L142:
            java.lang.String r6 = "HttpHelper"
            java.lang.String r7 = "register fail!"
            c.d.a.b.h.b(r6, r7)     // Catch: java.lang.Throwable -> L153
        L149:
            javax.net.ssl.HttpsURLConnection r6 = r5.f1337b     // Catch: java.lang.Throwable -> L160
            if (r6 == 0) goto L15e
            javax.net.ssl.HttpsURLConnection r6 = r5.f1337b     // Catch: java.lang.Throwable -> L160
            r6.disconnect()     // Catch: java.lang.Throwable -> L160
            goto L15e
        L153:
            r6 = move-exception
            javax.net.ssl.HttpsURLConnection r7 = r5.f1337b     // Catch: java.lang.Throwable -> L160
            if (r7 == 0) goto L15d
            javax.net.ssl.HttpsURLConnection r7 = r5.f1337b     // Catch: java.lang.Throwable -> L160
            r7.disconnect()     // Catch: java.lang.Throwable -> L160
        L15d:
            throw r6     // Catch: java.lang.Throwable -> L160
        L15e:
            monitor-exit(r5)
            return r8
        L160:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }
}
