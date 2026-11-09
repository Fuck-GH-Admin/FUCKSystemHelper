package c.a.c.a;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static java.security.KeyPair f1315a;

    public static java.lang.String a(java.lang.String r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 != 0) goto L35
            java.security.KeyPair r0 = c.a.c.a.t.f1315a
            if (r0 != 0) goto Lc
            goto L35
        Lc:
            java.lang.String r0 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)     // Catch: java.lang.Exception -> L31
            r2 = 1
            java.security.KeyPair r3 = c.a.c.a.t.f1315a     // Catch: java.lang.Exception -> L31
            java.security.PrivateKey r3 = r3.getPrivate()     // Catch: java.lang.Exception -> L31
            r0.init(r2, r3)     // Catch: java.lang.Exception -> L31
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Exception -> L31
            byte[] r4 = r4.getBytes(r2)     // Catch: java.lang.Exception -> L31
            byte[] r4 = r0.doFinal(r4)     // Catch: java.lang.Exception -> L31
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Exception -> L31
            java.lang.String r0 = r0.name()     // Catch: java.lang.Exception -> L31
            java.lang.String r4 = c.a.c.a.e.a(r4, r0)     // Catch: java.lang.Exception -> L31
            return r4
        L31:
            r4 = move-exception
            r4.printStackTrace()
        L35:
            return r1
    }

    public static java.security.KeyPair a() {
            java.lang.String r0 = "RSA"
            java.security.KeyPairGenerator r0 = java.security.KeyPairGenerator.getInstance(r0)     // Catch: java.lang.Exception -> L1d
            r1 = 2048(0x800, float:2.87E-42)
            java.security.SecureRandom r2 = new java.security.SecureRandom     // Catch: java.lang.Exception -> L1d
            r2.<init>()     // Catch: java.lang.Exception -> L1d
            r0.initialize(r1, r2)     // Catch: java.lang.Exception -> L1d
            java.security.KeyPair r1 = c.a.c.a.t.f1315a     // Catch: java.lang.Exception -> L1d
            if (r1 != 0) goto L1a
            java.security.KeyPair r0 = r0.generateKeyPair()     // Catch: java.lang.Exception -> L1d
            c.a.c.a.t.f1315a = r0     // Catch: java.lang.Exception -> L1d
        L1a:
            java.security.KeyPair r0 = c.a.c.a.t.f1315a     // Catch: java.lang.Exception -> L1d
            return r0
        L1d:
            r0 = 0
            return r0
    }

    public static java.lang.String b() {
            java.security.KeyPair r0 = c.a.c.a.t.f1315a
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.security.PublicKey r0 = r0.getPublic()
            if (r0 != 0) goto Ld
            return r1
        Ld:
            byte[] r0 = r0.getEncoded()     // Catch: java.lang.Exception -> L1c
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Exception -> L1c
            java.lang.String r2 = r2.name()     // Catch: java.lang.Exception -> L1c
            java.lang.String r0 = c.a.c.a.e.a(r0, r2)     // Catch: java.lang.Exception -> L1c
            return r0
        L1c:
            return r1
    }

    public static byte[] b(java.lang.String r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 != 0) goto L2f
            java.security.KeyPair r0 = c.a.c.a.t.f1315a
            if (r0 != 0) goto Lc
            goto L2f
        Lc:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Exception -> L2b
            byte[] r4 = r4.getBytes(r0)     // Catch: java.lang.Exception -> L2b
            byte[] r4 = c.a.c.a.e.a(r4)     // Catch: java.lang.Exception -> L2b
            java.lang.String r0 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)     // Catch: java.lang.Exception -> L2b
            r2 = 2
            java.security.KeyPair r3 = c.a.c.a.t.f1315a     // Catch: java.lang.Exception -> L2b
            java.security.PrivateKey r3 = r3.getPrivate()     // Catch: java.lang.Exception -> L2b
            r0.init(r2, r3)     // Catch: java.lang.Exception -> L2b
            byte[] r4 = r0.doFinal(r4)     // Catch: java.lang.Exception -> L2b
            return r4
        L2b:
            r4 = move-exception
            r4.printStackTrace()
        L2f:
            return r1
    }
}
