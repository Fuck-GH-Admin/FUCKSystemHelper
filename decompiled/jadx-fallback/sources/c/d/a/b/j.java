package c.d.a.b;

/* JADX INFO: loaded from: classes.dex */
public class j {
    static {
            return
    }

    public j() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.security.Key a(java.io.InputStream r1) {
            r0 = this;
            java.lang.String r0 = "X.509"
            java.security.cert.CertificateFactory r0 = java.security.cert.CertificateFactory.getInstance(r0)     // Catch: java.security.cert.CertificateException -> L11
            java.security.cert.Certificate r0 = r0.generateCertificate(r1)     // Catch: java.security.cert.CertificateException -> L11
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0     // Catch: java.security.cert.CertificateException -> L11
            java.security.PublicKey r0 = r0.getPublicKey()     // Catch: java.security.cert.CertificateException -> L11
            return r0
        L11:
            r0 = move-exception
            r0.printStackTrace()
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "RSAHelper"
            c.d.a.b.h.b(r1, r0)
            r0 = 0
            return r0
    }

    public byte[] a(java.security.Key r2, byte[] r3) {
            r1 = this;
            if (r2 == 0) goto L1b
            java.lang.String r1 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r1)     // Catch: java.lang.Exception -> L11
            r0 = 1
            r1.init(r0, r2)     // Catch: java.lang.Exception -> L11
            byte[] r1 = r1.doFinal(r3)     // Catch: java.lang.Exception -> L11
            return r1
        L11:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            java.lang.String r2 = "RSAHelper"
            c.d.a.b.h.b(r2, r1)
        L1b:
            r1 = 0
            return r1
    }
}
