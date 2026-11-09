package c.a.c.a;

/* JADX INFO: loaded from: classes.dex */
public final class s {
    public static java.lang.String a(byte[] r6, java.lang.String r7, boolean r8) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r6.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L2c
            r3 = r6[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            if (r8 == 0) goto L17
            java.lang.String r3 = r3.toUpperCase()
        L17:
            int r4 = r3.length()
            r5 = 1
            if (r4 != r5) goto L23
            java.lang.String r4 = "0"
            r0.append(r4)
        L23:
            r0.append(r3)
            r0.append(r7)
            int r2 = r2 + 1
            goto L7
        L2c:
            java.lang.String r6 = r0.toString()
            return r6
    }

    public static java.lang.String a(byte[] r1, boolean r2) {
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L17
            r0.reset()     // Catch: java.security.NoSuchAlgorithmException -> L17
            r0.update(r1)     // Catch: java.security.NoSuchAlgorithmException -> L17
            byte[] r1 = r0.digest()     // Catch: java.security.NoSuchAlgorithmException -> L17
            java.lang.String r0 = ""
            java.lang.String r1 = a(r1, r0, r2)     // Catch: java.security.NoSuchAlgorithmException -> L17
            return r1
        L17:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r1)
            throw r2
    }
}
