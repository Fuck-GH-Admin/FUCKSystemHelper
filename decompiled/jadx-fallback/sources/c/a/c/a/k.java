package c.a.c.a;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.content.Context f1302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.String f1303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.util.HashMap f1304c;
    private java.lang.String d;
    private java.lang.String e;
    private int f;
    private java.lang.String g;
    private java.lang.String h;

    public k(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f1303b = r0
            r1.f1304c = r0
            r1.d = r0
            r0 = -1
            r1.f = r0
            r1.f1302a = r2
            return
    }

    private java.lang.String a(android.content.Context r8) {
            r7 = this;
            r7 = 0
            java.lang.String r0 = "connectivity"
            java.lang.Object r8 = r8.getSystemService(r0)     // Catch: java.lang.Exception -> Lc0
            android.net.ConnectivityManager r8 = (android.net.ConnectivityManager) r8     // Catch: java.lang.Exception -> Lc0
            if (r8 != 0) goto Lc
            return r7
        Lc:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> Lc0
            r1 = 29
            java.lang.String r2 = "wifi"
            if (r0 < r1) goto L5a
            android.net.Network r0 = r8.getActiveNetwork()     // Catch: java.lang.Exception -> Lc0
            android.net.NetworkCapabilities r8 = r8.getNetworkCapabilities(r0)     // Catch: java.lang.Exception -> Lc0
            if (r8 == 0) goto L59
            r0 = 1
            boolean r0 = r8.hasTransport(r0)     // Catch: java.lang.Exception -> Lc0
            r1 = 0
            boolean r1 = r8.hasTransport(r1)     // Catch: java.lang.Exception -> Lc0
            r3 = 3
            boolean r3 = r8.hasTransport(r3)     // Catch: java.lang.Exception -> Lc0
            r4 = 6
            boolean r4 = r8.hasTransport(r4)     // Catch: java.lang.Exception -> Lc0
            r5 = 4
            boolean r5 = r8.hasTransport(r5)     // Catch: java.lang.Exception -> Lc0
            r6 = 5
            boolean r8 = r8.hasTransport(r6)     // Catch: java.lang.Exception -> Lc0
            if (r0 == 0) goto L41
            java.lang.String r2 = "WIFI"
            goto L59
        L41:
            if (r1 == 0) goto L46
            java.lang.String r2 = "CELLULAR"
            goto L59
        L46:
            if (r3 == 0) goto L4b
            java.lang.String r2 = "ETHERNET"
            goto L59
        L4b:
            if (r4 == 0) goto L50
            java.lang.String r2 = "LoWPAN"
            goto L59
        L50:
            if (r5 == 0) goto L55
            java.lang.String r2 = "VPN"
            goto L59
        L55:
            if (r8 == 0) goto L59
            java.lang.String r2 = "WifiAware"
        L59:
            return r2
        L5a:
            android.net.NetworkInfo r8 = r8.getActiveNetworkInfo()     // Catch: java.lang.Exception -> Lc0
            if (r8 == 0) goto Lbf
            boolean r0 = r8.isAvailable()     // Catch: java.lang.Exception -> Lc0
            if (r0 != 0) goto L67
            goto Lbf
        L67:
            java.lang.String r8 = r8.getExtraInfo()     // Catch: java.lang.Exception -> Lc0
            java.lang.String r0 = "cmwap"
            java.lang.String r1 = "ctwap"
            if (r8 == 0) goto Lbe
            java.lang.String r3 = r8.trim()     // Catch: java.lang.Exception -> Lc0
            java.lang.String r3 = r3.toLowerCase()     // Catch: java.lang.Exception -> Lc0
            boolean r3 = r3.equals(r0)     // Catch: java.lang.Exception -> Lc0
            if (r3 != 0) goto Lad
            java.lang.String r3 = r8.trim()     // Catch: java.lang.Exception -> Lc0
            java.lang.String r3 = r3.toLowerCase()     // Catch: java.lang.Exception -> Lc0
            java.lang.String r4 = "uniwap"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> Lc0
            if (r3 != 0) goto Lad
            java.lang.String r3 = r8.trim()     // Catch: java.lang.Exception -> Lc0
            java.lang.String r3 = r3.toLowerCase()     // Catch: java.lang.Exception -> Lc0
            java.lang.String r4 = "3gwap"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> Lc0
            if (r3 != 0) goto Lad
            java.lang.String r3 = r8.trim()     // Catch: java.lang.Exception -> Lc0
            java.lang.String r3 = r3.toLowerCase()     // Catch: java.lang.Exception -> Lc0
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Exception -> Lc0
            if (r3 == 0) goto Lbe
        Lad:
            java.lang.String r8 = r8.trim()     // Catch: java.lang.Exception -> Lc0
            java.lang.String r8 = r8.toLowerCase()     // Catch: java.lang.Exception -> Lc0
            boolean r7 = r8.equals(r1)     // Catch: java.lang.Exception -> Lc0
            if (r7 == 0) goto Lbd
            r2 = r1
            goto Lbe
        Lbd:
            r2 = r0
        Lbe:
            return r2
        Lbf:
            return r7
        Lc0:
            r8 = move-exception
            boolean r0 = c.a.c.a.d.f1289a
            if (r0 == 0) goto Lc8
            r8.printStackTrace()
        Lc8:
            return r7
    }

    static /* synthetic */ java.lang.String a(c.a.c.a.k r0) {
            java.lang.String r0 = r0.g
            return r0
    }

    private static java.lang.String a(java.util.HashMap r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
            r1 = 1
        Le:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L45
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            if (r1 == 0) goto L1e
            r1 = 0
            goto L23
        L1e:
            java.lang.String r3 = "&"
            r0.append(r3)
        L23:
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "UTF-8"
            java.lang.String r3 = java.net.URLEncoder.encode(r3, r4)
            r0.append(r3)
            java.lang.String r3 = "="
            r0.append(r3)
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = java.net.URLEncoder.encode(r2, r4)
            r0.append(r2)
            goto Le
        L45:
            java.lang.String r5 = r0.toString()
            return r5
    }

    private void a(javax.net.ssl.HttpsURLConnection r14) {
            r13 = this;
            java.lang.String r0 = "httpsPost failed,IOException:"
            java.lang.String r1 = "UTF-8"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "https Post start,url:"
            r2.append(r3)
            java.lang.String r3 = r13.f1303b
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            c.a.c.a.d.a(r2)
            java.util.HashMap r2 = r13.f1304c
            if (r2 != 0) goto L27
            java.lang.String r14 = "httpsPost request paramters is null."
            java.lang.String r14 = c.a.c.a.a.a(r14)
            r13.d = r14
            return
        L27:
            r2 = 1
            r3 = 200(0xc8, float:2.8E-43)
            r4 = -1
            r5 = 0
            r6 = 0
            r7 = -11
            java.io.OutputStream r8 = r14.getOutputStream()     // Catch: java.lang.Throwable -> L12e java.lang.Exception -> L131 java.io.IOException -> L164 java.net.MalformedURLException -> L192
            java.io.BufferedWriter r9 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> L11e java.lang.Exception -> L122 java.io.IOException -> L126 java.net.MalformedURLException -> L12a
            java.io.OutputStreamWriter r10 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> L11e java.lang.Exception -> L122 java.io.IOException -> L126 java.net.MalformedURLException -> L12a
            r10.<init>(r8, r1)     // Catch: java.lang.Throwable -> L11e java.lang.Exception -> L122 java.io.IOException -> L126 java.net.MalformedURLException -> L12a
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L11e java.lang.Exception -> L122 java.io.IOException -> L126 java.net.MalformedURLException -> L12a
            java.util.HashMap r10 = r13.f1304c     // Catch: java.lang.Throwable -> L11e java.lang.Exception -> L122 java.io.IOException -> L126 java.net.MalformedURLException -> L12a
            java.lang.String r10 = a(r10)     // Catch: java.lang.Throwable -> L11e java.lang.Exception -> L122 java.io.IOException -> L126 java.net.MalformedURLException -> L12a
            r9.write(r10)     // Catch: java.lang.Throwable -> L11e java.lang.Exception -> L122 java.io.IOException -> L126 java.net.MalformedURLException -> L12a
            java.util.HashMap r10 = r13.f1304c     // Catch: java.lang.Throwable -> L11e java.lang.Exception -> L122 java.io.IOException -> L126 java.net.MalformedURLException -> L12a
            java.lang.String r10 = a(r10)     // Catch: java.lang.Throwable -> L11e java.lang.Exception -> L122 java.io.IOException -> L126 java.net.MalformedURLException -> L12a
            c.a.c.a.d.a(r10)     // Catch: java.lang.Throwable -> L11e java.lang.Exception -> L122 java.io.IOException -> L126 java.net.MalformedURLException -> L12a
            r9.flush()     // Catch: java.lang.Throwable -> L11e java.lang.Exception -> L122 java.io.IOException -> L126 java.net.MalformedURLException -> L12a
            r9.close()     // Catch: java.lang.Throwable -> L11e java.lang.Exception -> L122 java.io.IOException -> L126 java.net.MalformedURLException -> L12a
            r14.connect()     // Catch: java.lang.Throwable -> L11e java.lang.Exception -> L122 java.io.IOException -> L126 java.net.MalformedURLException -> L12a
            java.io.InputStream r9 = r14.getInputStream()     // Catch: java.lang.Throwable -> La7 java.io.IOException -> Lab
            int r10 = r14.getResponseCode()     // Catch: java.lang.Throwable -> L9c java.io.IOException -> La2
            if (r3 != r10) goto L8c
            java.io.BufferedReader r11 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8a
            java.io.InputStreamReader r12 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8a
            r12.<init>(r9, r1)     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8a
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8a
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86
            r1.<init>()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86
        L71:
            int r5 = r11.read()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86
            if (r5 == r4) goto L7c
            char r5 = (char) r5     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86
            r1.append(r5)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86
            goto L71
        L7c:
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86
            r13.d = r1     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86
            r5 = r11
            goto L8c
        L84:
            r1 = move-exception
            goto L9f
        L86:
            r1 = move-exception
            goto La5
        L88:
            r1 = move-exception
            goto L9e
        L8a:
            r1 = move-exception
            goto La4
        L8c:
            if (r9 == 0) goto L96
            if (r5 == 0) goto L96
            r5.close()     // Catch: java.lang.Exception -> L118 java.io.IOException -> L11a java.net.MalformedURLException -> L11c java.lang.Throwable -> L11e
            r9.close()     // Catch: java.lang.Exception -> L118 java.io.IOException -> L11a java.net.MalformedURLException -> L11c java.lang.Throwable -> L11e
        L96:
            if (r14 == 0) goto Lf6
            r14.disconnect()     // Catch: java.lang.Exception -> L118 java.io.IOException -> L11a java.net.MalformedURLException -> L11c java.lang.Throwable -> L11e
            goto Lf6
        L9c:
            r1 = move-exception
            r10 = r4
        L9e:
            r11 = r5
        L9f:
            r5 = r9
            goto L108
        La2:
            r1 = move-exception
            r10 = r4
        La4:
            r11 = r5
        La5:
            r5 = r9
            goto Lae
        La7:
            r1 = move-exception
            r10 = r4
            r11 = r5
            goto L108
        Lab:
            r1 = move-exception
            r10 = r4
            r11 = r5
        Lae:
            boolean r2 = c.a.c.a.d.f1289a     // Catch: java.lang.Throwable -> L107
            if (r2 == 0) goto Lcd
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L107
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L107
            r2.<init>()     // Catch: java.lang.Throwable -> L107
            java.lang.String r9 = "httpsPost parse failed;"
            r2.append(r9)     // Catch: java.lang.Throwable -> L107
            java.lang.String r9 = r1.getMessage()     // Catch: java.lang.Throwable -> L107
            r2.append(r9)     // Catch: java.lang.Throwable -> L107
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L107
            c.a.c.a.d.a(r2)     // Catch: java.lang.Throwable -> L107
        Lcd:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L107
            r2.<init>()     // Catch: java.lang.Throwable -> L107
            r2.append(r0)     // Catch: java.lang.Throwable -> L107
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L107
            r2.append(r1)     // Catch: java.lang.Throwable -> L107
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L107
            java.lang.String r1 = c.a.c.a.a.a(r7, r1)     // Catch: java.lang.Throwable -> L107
            r13.d = r1     // Catch: java.lang.Throwable -> L107
            if (r5 == 0) goto Lf0
            if (r11 == 0) goto Lf0
            r11.close()     // Catch: java.lang.Exception -> L118 java.io.IOException -> L11a java.net.MalformedURLException -> L11c java.lang.Throwable -> L11e
            r5.close()     // Catch: java.lang.Exception -> L118 java.io.IOException -> L11a java.net.MalformedURLException -> L11c java.lang.Throwable -> L11e
        Lf0:
            if (r14 == 0) goto Lf5
            r14.disconnect()     // Catch: java.lang.Exception -> L118 java.io.IOException -> L11a java.net.MalformedURLException -> L11c java.lang.Throwable -> L11e
        Lf5:
            r2 = r6
        Lf6:
            if (r8 == 0) goto L104
            r8.close()     // Catch: java.io.IOException -> Lfc
            goto L104
        Lfc:
            r14 = move-exception
            boolean r0 = c.a.c.a.d.f1289a
            if (r0 == 0) goto L104
            r14.printStackTrace()
        L104:
            r6 = r2
            goto L1c2
        L107:
            r1 = move-exception
        L108:
            if (r5 == 0) goto L112
            if (r11 == 0) goto L112
            r11.close()     // Catch: java.lang.Exception -> L118 java.io.IOException -> L11a java.net.MalformedURLException -> L11c java.lang.Throwable -> L11e
            r5.close()     // Catch: java.lang.Exception -> L118 java.io.IOException -> L11a java.net.MalformedURLException -> L11c java.lang.Throwable -> L11e
        L112:
            if (r14 == 0) goto L117
            r14.disconnect()     // Catch: java.lang.Exception -> L118 java.io.IOException -> L11a java.net.MalformedURLException -> L11c java.lang.Throwable -> L11e
        L117:
            throw r1     // Catch: java.lang.Exception -> L118 java.io.IOException -> L11a java.net.MalformedURLException -> L11c java.lang.Throwable -> L11e
        L118:
            r14 = move-exception
            goto L124
        L11a:
            r14 = move-exception
            goto L128
        L11c:
            r14 = move-exception
            goto L12c
        L11e:
            r13 = move-exception
            r5 = r8
            goto L219
        L122:
            r14 = move-exception
            r10 = r4
        L124:
            r5 = r8
            goto L133
        L126:
            r14 = move-exception
            r10 = r4
        L128:
            r5 = r8
            goto L166
        L12a:
            r14 = move-exception
            r10 = r4
        L12c:
            r5 = r8
            goto L194
        L12e:
            r13 = move-exception
            goto L219
        L131:
            r14 = move-exception
            r10 = r4
        L133:
            boolean r0 = c.a.c.a.d.f1289a     // Catch: java.lang.Throwable -> L12e
            if (r0 == 0) goto L13a
            r14.printStackTrace()     // Catch: java.lang.Throwable -> L12e
        L13a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12e
            r0.<init>()     // Catch: java.lang.Throwable -> L12e
            java.lang.String r1 = "httpsPost failed,Exception:"
            r0.append(r1)     // Catch: java.lang.Throwable -> L12e
            java.lang.String r14 = r14.getMessage()     // Catch: java.lang.Throwable -> L12e
            r0.append(r14)     // Catch: java.lang.Throwable -> L12e
            java.lang.String r14 = r0.toString()     // Catch: java.lang.Throwable -> L12e
            java.lang.String r14 = c.a.c.a.a.a(r7, r14)     // Catch: java.lang.Throwable -> L12e
            r13.d = r14     // Catch: java.lang.Throwable -> L12e
            if (r5 == 0) goto L1c2
            r5.close()     // Catch: java.io.IOException -> L15b
            goto L1c2
        L15b:
            r14 = move-exception
            boolean r0 = c.a.c.a.d.f1289a
            if (r0 == 0) goto L1c2
        L160:
            r14.printStackTrace()
            goto L1c2
        L164:
            r14 = move-exception
            r10 = r4
        L166:
            boolean r1 = c.a.c.a.d.f1289a     // Catch: java.lang.Throwable -> L12e
            if (r1 == 0) goto L16d
            r14.printStackTrace()     // Catch: java.lang.Throwable -> L12e
        L16d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12e
            r1.<init>()     // Catch: java.lang.Throwable -> L12e
            r1.append(r0)     // Catch: java.lang.Throwable -> L12e
            java.lang.String r14 = r14.getMessage()     // Catch: java.lang.Throwable -> L12e
            r1.append(r14)     // Catch: java.lang.Throwable -> L12e
            java.lang.String r14 = r1.toString()     // Catch: java.lang.Throwable -> L12e
            java.lang.String r14 = c.a.c.a.a.a(r7, r14)     // Catch: java.lang.Throwable -> L12e
            r13.d = r14     // Catch: java.lang.Throwable -> L12e
            if (r5 == 0) goto L1c2
            r5.close()     // Catch: java.io.IOException -> L18c
            goto L1c2
        L18c:
            r14 = move-exception
            boolean r0 = c.a.c.a.d.f1289a
            if (r0 == 0) goto L1c2
            goto L160
        L192:
            r14 = move-exception
            r10 = r4
        L194:
            boolean r0 = c.a.c.a.d.f1289a     // Catch: java.lang.Throwable -> L12e
            if (r0 == 0) goto L19b
            r14.printStackTrace()     // Catch: java.lang.Throwable -> L12e
        L19b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12e
            r0.<init>()     // Catch: java.lang.Throwable -> L12e
            java.lang.String r1 = "httpsPost failed,MalformedURLException:"
            r0.append(r1)     // Catch: java.lang.Throwable -> L12e
            java.lang.String r14 = r14.getMessage()     // Catch: java.lang.Throwable -> L12e
            r0.append(r14)     // Catch: java.lang.Throwable -> L12e
            java.lang.String r14 = r0.toString()     // Catch: java.lang.Throwable -> L12e
            java.lang.String r14 = c.a.c.a.a.a(r7, r14)     // Catch: java.lang.Throwable -> L12e
            r13.d = r14     // Catch: java.lang.Throwable -> L12e
            if (r5 == 0) goto L1c2
            r5.close()     // Catch: java.io.IOException -> L1bc
            goto L1c2
        L1bc:
            r14 = move-exception
            boolean r0 = c.a.c.a.d.f1289a
            if (r0 == 0) goto L1c2
            goto L160
        L1c2:
            if (r6 == 0) goto L1f0
            if (r3 == r10) goto L1f0
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "httpsPost failed,statusCode:"
            r14.append(r0)
            r14.append(r10)
            java.lang.String r14 = r14.toString()
            c.a.c.a.d.a(r14)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r0)
            r14.append(r10)
            java.lang.String r14 = r14.toString()
            java.lang.String r14 = c.a.c.a.a.a(r7, r14)
            r13.d = r14
            return
        L1f0:
            java.lang.String r14 = r13.d
            if (r14 != 0) goto L202
            java.lang.String r14 = "httpsPost failed,mResult is null"
            c.a.c.a.d.a(r14)
            java.lang.String r14 = "httpsPost failed,internal error"
            java.lang.String r14 = c.a.c.a.a.a(r4, r14)
            r13.d = r14
            return
        L202:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "httpsPost success end,parse result = "
            r14.append(r0)
            java.lang.String r13 = r13.d
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            c.a.c.a.d.a(r13)
            return
        L219:
            if (r5 == 0) goto L227
            r5.close()     // Catch: java.io.IOException -> L21f
            goto L227
        L21f:
            r14 = move-exception
            boolean r0 = c.a.c.a.d.f1289a
            if (r0 == 0) goto L227
            r14.printStackTrace()
        L227:
            throw r13
    }

    static /* synthetic */ java.lang.String b(c.a.c.a.k r0) {
            java.lang.String r0 = r0.h
            return r0
    }

    private java.util.HashMap b(java.util.HashMap r4) {
            r3 = this;
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Set r0 = r4.keySet()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.toString()
            java.lang.Object r2 = r4.get(r1)
            r3.put(r1, r2)
            goto Ld
        L25:
            return r3
    }

    private javax.net.ssl.HttpsURLConnection b() {
            r8 = this;
            java.lang.String r0 = "Current network is not available."
            r1 = -11
            r2 = 0
            java.net.URL r3 = new java.net.URL     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            java.lang.String r4 = r8.f1303b     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            r3.<init>(r4)     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            r4.<init>()     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            java.lang.String r5 = "https URL: "
            r4.append(r5)     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            java.lang.String r5 = r8.f1303b     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            r4.append(r5)     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            c.a.c.a.d.a(r4)     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            android.content.Context r4 = r8.f1302a     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            java.lang.String r4 = r8.a(r4)     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            if (r4 == 0) goto Lef
            java.lang.String r5 = ""
            boolean r5 = r4.equals(r5)     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            if (r5 == 0) goto L34
            goto Lef
        L34:
            java.lang.String r0 = r8.e     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            if (r0 != 0) goto L80
            int r0 = r8.f     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            r5 = -1
            if (r0 == r5) goto L80
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            r0.<init>()     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            java.lang.String r4 = "Proxy mProxyHost: = "
            r0.append(r4)     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            java.lang.String r4 = r8.e     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            r0.append(r4)     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            java.lang.String r4 = " mProxyPort: "
            r0.append(r4)     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            int r4 = r8.f     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            r0.append(r4)     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            c.a.c.a.d.a(r0)     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            java.net.Proxy r0 = new java.net.Proxy     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            java.net.Proxy$Type r4 = java.net.Proxy.Type.SOCKS     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            java.net.InetSocketAddress r5 = new java.net.InetSocketAddress     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            java.lang.String r6 = r8.e     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            int r7 = r8.f     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            r5.<init>(r6, r7)     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            r0.<init>(r4, r5)     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            c.a.c.a.l r4 = new c.a.c.a.l     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            r4.<init>(r8)     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            java.net.Authenticator.setDefault(r4)     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            java.net.URLConnection r0 = r3.openConnection(r0)     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
        L7d:
            javax.net.ssl.HttpsURLConnection r0 = (javax.net.ssl.HttpsURLConnection) r0     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            goto Ld1
        L80:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            r0.<init>()     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            java.lang.String r5 = "checkNetwork = "
            r0.append(r5)     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            r0.append(r4)     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            c.a.c.a.d.a(r0)     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            java.lang.String r0 = "cmwap"
            boolean r0 = r0.equals(r4)     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            r5 = 80
            if (r0 == 0) goto Lb1
            java.net.Proxy r0 = new java.net.Proxy     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            java.net.Proxy$Type r4 = java.net.Proxy.Type.HTTP     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            java.net.InetSocketAddress r6 = new java.net.InetSocketAddress     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            java.lang.String r7 = "10.0.0.172"
            r6.<init>(r7, r5)     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            r0.<init>(r4, r6)     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            java.net.URLConnection r0 = r3.openConnection(r0)     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            goto L7d
        Lb1:
            java.lang.String r0 = "ctwap"
            boolean r0 = r0.equals(r4)     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            if (r0 == 0) goto Lcc
            java.net.Proxy r0 = new java.net.Proxy     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            java.net.Proxy$Type r4 = java.net.Proxy.Type.HTTP     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            java.net.InetSocketAddress r6 = new java.net.InetSocketAddress     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            java.lang.String r7 = "10.0.0.200"
            r6.<init>(r7, r5)     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            r0.<init>(r4, r6)     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            java.net.URLConnection r0 = r3.openConnection(r0)     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            goto L7d
        Lcc:
            java.net.URLConnection r0 = r3.openConnection()     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            goto L7d
        Ld1:
            c.a.c.a.m r3 = new c.a.c.a.m     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            r3.<init>(r8)     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            r0.setHostnameVerifier(r3)     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            r3 = 1
            r0.setDoInput(r3)     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            r0.setDoOutput(r3)     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            java.lang.String r3 = "POST"
            r0.setRequestMethod(r3)     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            r3 = 50000(0xc350, float:7.0065E-41)
            r0.setConnectTimeout(r3)     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            r0.setReadTimeout(r3)     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            return r0
        Lef:
            c.a.c.a.d.c(r0)     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            r3 = -10
            java.lang.String r0 = c.a.c.a.a.a(r3, r0)     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            r8.d = r0     // Catch: java.lang.Exception -> Lfb java.net.MalformedURLException -> L113
            return r2
        Lfb:
            r0 = move-exception
            boolean r3 = c.a.c.a.d.f1289a
            if (r3 == 0) goto L10a
            r0.printStackTrace()
            java.lang.String r0 = r0.getMessage()
            c.a.c.a.d.a(r0)
        L10a:
            java.lang.String r0 = "Init httpsurlconnection failed."
        L10c:
            java.lang.String r0 = c.a.c.a.a.a(r1, r0)
            r8.d = r0
            return r2
        L113:
            r0 = move-exception
            boolean r3 = c.a.c.a.d.f1289a
            if (r3 == 0) goto L122
            r0.printStackTrace()
            java.lang.String r0 = r0.getMessage()
            c.a.c.a.d.a(r0)
        L122:
            java.lang.String r0 = "Auth server could not be parsed as a URL."
            goto L10c
    }

    protected java.lang.String a(java.util.HashMap r2, java.lang.String r3, int r4, java.lang.String r5, java.lang.String r6) {
            r1 = this;
            java.util.HashMap r2 = r1.b(r2)
            r1.f1304c = r2
            java.lang.String r0 = "url"
            java.lang.Object r2 = r2.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            r1.f1303b = r2
            r1.e = r3
            r1.f = r4
            r1.g = r5
            r1.h = r6
            javax.net.ssl.HttpsURLConnection r2 = r1.b()
            if (r2 != 0) goto L26
            java.lang.String r2 = "syncConnect failed,httpsURLConnection is null"
            c.a.c.a.d.c(r2)
        L23:
            java.lang.String r1 = r1.d
            return r1
        L26:
            r1.a(r2)
            goto L23
    }

    protected boolean a() {
            r4 = this;
            java.lang.String r0 = "checkNetwork start"
            c.a.c.a.d.a(r0)
            r0 = 0
            android.content.Context r4 = r4.f1302a     // Catch: java.lang.Exception -> L4a
            java.lang.String r1 = "connectivity"
            java.lang.Object r4 = r4.getSystemService(r1)     // Catch: java.lang.Exception -> L4a
            android.net.ConnectivityManager r4 = (android.net.ConnectivityManager) r4     // Catch: java.lang.Exception -> L4a
            if (r4 != 0) goto L13
            return r0
        L13:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L4a
            r2 = 29
            r3 = 1
            if (r1 < r2) goto L36
            android.net.Network r1 = r4.getActiveNetwork()     // Catch: java.lang.Exception -> L4a
            android.net.NetworkCapabilities r4 = r4.getNetworkCapabilities(r1)     // Catch: java.lang.Exception -> L4a
            if (r4 == 0) goto L35
            r1 = 12
            boolean r1 = r4.hasCapability(r1)     // Catch: java.lang.Exception -> L4a
            if (r1 == 0) goto L35
            r1 = 16
            boolean r4 = r4.hasCapability(r1)     // Catch: java.lang.Exception -> L4a
            if (r4 == 0) goto L35
            return r3
        L35:
            return r0
        L36:
            android.net.NetworkInfo r4 = r4.getActiveNetworkInfo()     // Catch: java.lang.Exception -> L4a
            if (r4 == 0) goto L49
            boolean r4 = r4.isAvailable()     // Catch: java.lang.Exception -> L4a
            if (r4 != 0) goto L43
            goto L49
        L43:
            java.lang.String r4 = "checkNetwork end"
            c.a.c.a.d.a(r4)
            return r3
        L49:
            return r0
        L4a:
            r4 = move-exception
            boolean r1 = c.a.c.a.d.f1289a
            if (r1 == 0) goto L52
            r4.printStackTrace()
        L52:
            return r0
    }
}
