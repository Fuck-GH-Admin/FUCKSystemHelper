package c.a.b.g;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static byte[] a(byte[] r1) {
            java.lang.String r0 = "SHA-1"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> Lb
            byte[] r1 = r0.digest(r1)     // Catch: java.security.NoSuchAlgorithmException -> Lb
            return r1
        Lb:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
    }
}
