package c.d.a.b;

/* JADX INFO: loaded from: classes.dex */
public class i {
    public static java.lang.String a(java.lang.String r4) {
            java.lang.String r0 = ""
            if (r4 == 0) goto L7a
            boolean r1 = r4.equals(r0)
            if (r1 == 0) goto Lb
            goto L7a
        Lb:
            r0 = 0
            java.lang.String r1 = "SHA-256"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r1)     // Catch: java.io.UnsupportedEncodingException -> L1f java.security.NoSuchAlgorithmException -> L24
            r0.reset()     // Catch: java.io.UnsupportedEncodingException -> L1f java.security.NoSuchAlgorithmException -> L24
            java.lang.String r1 = "UTF-8"
            byte[] r4 = r4.getBytes(r1)     // Catch: java.io.UnsupportedEncodingException -> L1f java.security.NoSuchAlgorithmException -> L24
            r0.update(r4)     // Catch: java.io.UnsupportedEncodingException -> L1f java.security.NoSuchAlgorithmException -> L24
            goto L3f
        L1f:
            r4 = move-exception
            r4.printStackTrace()
            goto L3f
        L24:
            r4 = move-exception
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "NoSuchAlgorithmException = "
            r2.append(r3)
            java.lang.String r4 = r4.toString()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.println(r4)
        L3f:
            byte[] r4 = r0.digest()
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r1 = 0
        L49:
            int r2 = r4.length
            if (r1 >= r2) goto L71
            r2 = r4[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            int r2 = r2.length()
            r3 = 1
            if (r2 != r3) goto L63
            java.lang.String r2 = "0"
            r0.append(r2)
            r2 = r4[r1]
            goto L65
        L63:
            r2 = r4[r1]
        L65:
            r2 = r2 & 255(0xff, float:3.57E-43)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r0.append(r2)
            int r1 = r1 + 1
            goto L49
        L71:
            java.lang.String r4 = r0.toString()
            java.lang.String r4 = r4.toLowerCase()
            return r4
        L7a:
            return r0
    }
}
