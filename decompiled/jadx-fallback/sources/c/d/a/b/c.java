package c.d.a.b;

/* JADX INFO: loaded from: classes.dex */
public class c {
    public static java.lang.String a(byte[] r2) {
            int r0 = r2.length
            r1 = 0
            java.lang.String r2 = android.util.Base64.encodeToString(r2, r1, r0, r1)
            return r2
    }

    public static byte[] a(android.content.Context r2, byte[] r3) {
            c.d.a.b.j r0 = new c.d.a.b.j
            r0.<init>()
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.AssetManager r2 = r2.getAssets()
            java.lang.String r1 = "pub.cer"
            java.io.InputStream r2 = r2.open(r1)
            java.security.Key r2 = r0.a(r2)
            byte[] r2 = r0.a(r2, r3)
            return r2
    }

    public static byte[] a(java.lang.String r2) {
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.io.UnsupportedEncodingException -> L11 java.security.NoSuchAlgorithmException -> L1a
            java.lang.String r1 = "UTF-8"
            byte[] r2 = r2.getBytes(r1)     // Catch: java.io.UnsupportedEncodingException -> L11 java.security.NoSuchAlgorithmException -> L1a
            byte[] r2 = r0.digest(r2)     // Catch: java.io.UnsupportedEncodingException -> L11 java.security.NoSuchAlgorithmException -> L1a
            return r2
        L11:
            r2 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Huh, UTF-8 should be supported?"
            r0.<init>(r1, r2)
            throw r0
        L1a:
            r2 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Huh, MD5 should be supported?"
            r0.<init>(r1, r2)
            throw r0
    }

    public static byte[] a(java.lang.String r4, byte[] r5) {
            java.lang.String r0 = "utf-8"
            r1 = 0
            javax.crypto.spec.SecretKeySpec r2 = new javax.crypto.spec.SecretKeySpec     // Catch: javax.crypto.BadPaddingException -> L1d javax.crypto.IllegalBlockSizeException -> L22 java.io.UnsupportedEncodingException -> L27 java.security.InvalidKeyException -> L2c javax.crypto.NoSuchPaddingException -> L31 java.security.NoSuchAlgorithmException -> L36 java.lang.Throwable -> L3a
            java.lang.String r3 = "AES"
            r2.<init>(r5, r3)     // Catch: javax.crypto.BadPaddingException -> L1d javax.crypto.IllegalBlockSizeException -> L22 java.io.UnsupportedEncodingException -> L27 java.security.InvalidKeyException -> L2c javax.crypto.NoSuchPaddingException -> L31 java.security.NoSuchAlgorithmException -> L36 java.lang.Throwable -> L3a
            java.lang.String r5 = "AES/ECB/PKCS5Padding"
            javax.crypto.Cipher r5 = javax.crypto.Cipher.getInstance(r5)     // Catch: javax.crypto.BadPaddingException -> L1d javax.crypto.IllegalBlockSizeException -> L22 java.io.UnsupportedEncodingException -> L27 java.security.InvalidKeyException -> L2c javax.crypto.NoSuchPaddingException -> L31 java.security.NoSuchAlgorithmException -> L36 java.lang.Throwable -> L3a
            r3 = 1
            r5.init(r3, r2)     // Catch: javax.crypto.BadPaddingException -> L1d javax.crypto.IllegalBlockSizeException -> L22 java.io.UnsupportedEncodingException -> L27 java.security.InvalidKeyException -> L2c javax.crypto.NoSuchPaddingException -> L31 java.security.NoSuchAlgorithmException -> L36 java.lang.Throwable -> L3a
            byte[] r4 = r4.getBytes(r0)     // Catch: javax.crypto.BadPaddingException -> L1d javax.crypto.IllegalBlockSizeException -> L22 java.io.UnsupportedEncodingException -> L27 java.security.InvalidKeyException -> L2c javax.crypto.NoSuchPaddingException -> L31 java.security.NoSuchAlgorithmException -> L36 java.lang.Throwable -> L3a
            byte[] r4 = r5.doFinal(r4)     // Catch: javax.crypto.BadPaddingException -> L1d javax.crypto.IllegalBlockSizeException -> L22 java.io.UnsupportedEncodingException -> L27 java.security.InvalidKeyException -> L2c javax.crypto.NoSuchPaddingException -> L31 java.security.NoSuchAlgorithmException -> L36 java.lang.Throwable -> L3a
            return r4
        L1d:
            r4 = move-exception
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L3a
            return r1
        L22:
            r4 = move-exception
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L3a
            return r1
        L27:
            r4 = move-exception
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L3a
            return r1
        L2c:
            r4 = move-exception
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L3a
            return r1
        L31:
            r4 = move-exception
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L3a
            return r1
        L36:
            r4 = move-exception
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L3a
        L3a:
            return r1
    }
}
