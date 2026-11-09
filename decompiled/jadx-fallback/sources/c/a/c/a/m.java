package c.a.c.a;

/* JADX INFO: loaded from: classes.dex */
class m implements javax.net.ssl.HostnameVerifier {
    m(c.a.c.a.k r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(java.lang.String r1, javax.net.ssl.SSLSession r2) {
            r0 = this;
            java.lang.String r0 = "api.map.baidu.com"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            javax.net.ssl.HostnameVerifier r0 = javax.net.ssl.HttpsURLConnection.getDefaultHostnameVerifier()
            boolean r0 = r0.verify(r1, r2)
            return r0
    }
}
