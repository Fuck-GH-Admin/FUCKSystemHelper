package c.a.c.a;

/* JADX INFO: loaded from: classes.dex */
class f {

    static class a {
        public static java.lang.String a(byte[] r4) {
                r0 = 16
                char[] r0 = new char[r0]
                r0 = {x0030: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70} // fill-array
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                int r2 = r4.length
                int r2 = r2 * 2
                r1.<init>(r2)
                r2 = 0
            L10:
                int r3 = r4.length
                if (r2 >= r3) goto L2a
                r3 = r4[r2]
                r3 = r3 & 240(0xf0, float:3.36E-43)
                int r3 = r3 >> 4
                char r3 = r0[r3]
                r1.append(r3)
                r3 = r4[r2]
                r3 = r3 & 15
                char r3 = r0[r3]
                r1.append(r3)
                int r2 = r2 + 1
                goto L10
            L2a:
                java.lang.String r4 = r1.toString()
                return r4
        }
    }

    static java.lang.String a() {
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getLanguage()
            return r0
    }

    protected static java.lang.String a(android.content.Context r2) {
            java.lang.String r0 = r2.getPackageName()
            java.lang.String r2 = a(r2, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r2 = ";"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r2 = r1.toString()
            return r2
    }

    private static java.lang.String a(android.content.Context r5, java.lang.String r6) {
            java.lang.String r0 = "getFingerPrint："
            r1 = 0
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L7b
            r3 = 28
            r4 = 64
            if (r2 < r3) goto L48
            android.content.pm.PackageManager r2 = r5.getPackageManager()     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L7b
            r3 = 134217728(0x8000000, float:3.85186E-34)
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r6, r3)     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L7b
            android.content.pm.SigningInfo r2 = r2.signingInfo     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L7b
            if (r2 != 0) goto L24
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L7b
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r6, r4)     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L7b
        L21:
            android.content.pm.Signature[] r5 = r5.signatures     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L7b
            goto L51
        L24:
            boolean r2 = r2.hasMultipleSigners()     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L7b
            if (r2 == 0) goto L39
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L7b
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r6, r3)     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L7b
            android.content.pm.SigningInfo r5 = r5.signingInfo     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L7b
            android.content.pm.Signature[] r5 = r5.getApkContentsSigners()     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L7b
            goto L51
        L39:
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L7b
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r6, r3)     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L7b
            android.content.pm.SigningInfo r5 = r5.signingInfo     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L7b
            android.content.pm.Signature[] r5 = r5.getSigningCertificateHistory()     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L7b
            goto L51
        L48:
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L7b
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r6, r4)     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L7b
            goto L21
        L51:
            java.lang.String r6 = "X.509"
            java.security.cert.CertificateFactory r6 = java.security.cert.CertificateFactory.getInstance(r6)     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L7b
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L7b
            r5 = r5[r1]     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L7b
            byte[] r5 = r5.toByteArray()     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L7b
            r2.<init>(r5)     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L7b
            java.security.cert.Certificate r5 = r6.generateCertificate(r2)     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L7b
            java.security.cert.X509Certificate r5 = (java.security.cert.X509Certificate) r5     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L7b
            java.lang.String r5 = a(r5)     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L7b
            goto L94
        L6d:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            java.lang.String r5 = r5.toString()
            goto L88
        L7b:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            java.lang.String r5 = r5.toString()
        L88:
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            c.a.c.a.d.a(r5)
            java.lang.String r5 = ""
        L94:
            java.lang.StringBuffer r6 = new java.lang.StringBuffer
            r6.<init>()
            if (r5 == 0) goto Lbe
        L9b:
            int r0 = r5.length()
            if (r1 >= r0) goto Lbe
            char r0 = r5.charAt(r1)
            r6.append(r0)
            if (r1 <= 0) goto Lbb
            int r0 = r1 % 2
            r2 = 1
            if (r0 != r2) goto Lbb
            int r0 = r5.length()
            int r0 = r0 - r2
            if (r1 >= r0) goto Lbb
            java.lang.String r0 = ":"
            r6.append(r0)
        Lbb:
            int r1 = r1 + 1
            goto L9b
        Lbe:
            java.lang.String r5 = r6.toString()
            return r5
    }

    static java.lang.String a(java.security.cert.X509Certificate r2) {
            byte[] r2 = r2.getEncoded()     // Catch: java.security.cert.CertificateEncodingException -> Ld
            byte[] r2 = a(r2)     // Catch: java.security.cert.CertificateEncodingException -> Ld
            java.lang.String r2 = c.a.c.a.f.a.a(r2)     // Catch: java.security.cert.CertificateEncodingException -> Ld
            return r2
        Ld:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getFingerprintAs："
            r0.append(r1)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            c.a.c.a.d.a(r2)
            r2 = 0
            return r2
    }

    static byte[] a(byte[] r2) {
            java.lang.String r0 = "SHA1"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> Lb
            byte[] r2 = r0.digest(r2)     // Catch: java.security.NoSuchAlgorithmException -> Lb
            return r2
        Lb:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "generateSHA1："
            r0.append(r1)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            c.a.c.a.d.a(r2)
            r2 = 0
            return r2
    }

    protected static java.lang.String[] b(android.content.Context r6) {
            java.lang.String r0 = r6.getPackageName()
            java.lang.String[] r6 = b(r6, r0)
            if (r6 == 0) goto L48
            int r1 = r6.length
            if (r1 <= 0) goto L48
            int r1 = r6.length
            java.lang.String[] r2 = new java.lang.String[r1]
            r3 = 0
        L11:
            if (r3 >= r1) goto L49
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = r6[r3]
            r4.append(r5)
            java.lang.String r5 = ";"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r2[r3] = r4
            boolean r4 = c.a.c.a.d.f1289a
            if (r4 == 0) goto L45
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "mcode"
            r4.append(r5)
            r5 = r2[r3]
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            c.a.c.a.d.a(r4)
        L45:
            int r3 = r3 + 1
            goto L11
        L48:
            r2 = 0
        L49:
            return r2
    }

    private static java.lang.String[] b(android.content.Context r7, java.lang.String r8) {
            java.lang.String r0 = "getFingerPrint："
            r1 = 0
            r2 = 0
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.security.cert.CertificateException -> L84 android.content.pm.PackageManager.NameNotFoundException -> L93
            r4 = 28
            r5 = 64
            if (r3 < r4) goto L49
            android.content.pm.PackageManager r3 = r7.getPackageManager()     // Catch: java.security.cert.CertificateException -> L84 android.content.pm.PackageManager.NameNotFoundException -> L93
            r4 = 134217728(0x8000000, float:3.85186E-34)
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r8, r4)     // Catch: java.security.cert.CertificateException -> L84 android.content.pm.PackageManager.NameNotFoundException -> L93
            android.content.pm.SigningInfo r3 = r3.signingInfo     // Catch: java.security.cert.CertificateException -> L84 android.content.pm.PackageManager.NameNotFoundException -> L93
            if (r3 != 0) goto L25
            android.content.pm.PackageManager r7 = r7.getPackageManager()     // Catch: java.security.cert.CertificateException -> L84 android.content.pm.PackageManager.NameNotFoundException -> L93
            android.content.pm.PackageInfo r7 = r7.getPackageInfo(r8, r5)     // Catch: java.security.cert.CertificateException -> L84 android.content.pm.PackageManager.NameNotFoundException -> L93
        L22:
            android.content.pm.Signature[] r7 = r7.signatures     // Catch: java.security.cert.CertificateException -> L84 android.content.pm.PackageManager.NameNotFoundException -> L93
            goto L52
        L25:
            boolean r3 = r3.hasMultipleSigners()     // Catch: java.security.cert.CertificateException -> L84 android.content.pm.PackageManager.NameNotFoundException -> L93
            if (r3 == 0) goto L3a
            android.content.pm.PackageManager r7 = r7.getPackageManager()     // Catch: java.security.cert.CertificateException -> L84 android.content.pm.PackageManager.NameNotFoundException -> L93
            android.content.pm.PackageInfo r7 = r7.getPackageInfo(r8, r4)     // Catch: java.security.cert.CertificateException -> L84 android.content.pm.PackageManager.NameNotFoundException -> L93
            android.content.pm.SigningInfo r7 = r7.signingInfo     // Catch: java.security.cert.CertificateException -> L84 android.content.pm.PackageManager.NameNotFoundException -> L93
            android.content.pm.Signature[] r7 = r7.getApkContentsSigners()     // Catch: java.security.cert.CertificateException -> L84 android.content.pm.PackageManager.NameNotFoundException -> L93
            goto L52
        L3a:
            android.content.pm.PackageManager r7 = r7.getPackageManager()     // Catch: java.security.cert.CertificateException -> L84 android.content.pm.PackageManager.NameNotFoundException -> L93
            android.content.pm.PackageInfo r7 = r7.getPackageInfo(r8, r4)     // Catch: java.security.cert.CertificateException -> L84 android.content.pm.PackageManager.NameNotFoundException -> L93
            android.content.pm.SigningInfo r7 = r7.signingInfo     // Catch: java.security.cert.CertificateException -> L84 android.content.pm.PackageManager.NameNotFoundException -> L93
            android.content.pm.Signature[] r7 = r7.getSigningCertificateHistory()     // Catch: java.security.cert.CertificateException -> L84 android.content.pm.PackageManager.NameNotFoundException -> L93
            goto L52
        L49:
            android.content.pm.PackageManager r7 = r7.getPackageManager()     // Catch: java.security.cert.CertificateException -> L84 android.content.pm.PackageManager.NameNotFoundException -> L93
            android.content.pm.PackageInfo r7 = r7.getPackageInfo(r8, r5)     // Catch: java.security.cert.CertificateException -> L84 android.content.pm.PackageManager.NameNotFoundException -> L93
            goto L22
        L52:
            if (r7 == 0) goto L82
            int r8 = r7.length     // Catch: java.security.cert.CertificateException -> L84 android.content.pm.PackageManager.NameNotFoundException -> L93
            if (r8 <= 0) goto L82
            int r8 = r7.length     // Catch: java.security.cert.CertificateException -> L84 android.content.pm.PackageManager.NameNotFoundException -> L93
            java.lang.String[] r8 = new java.lang.String[r8]     // Catch: java.security.cert.CertificateException -> L84 android.content.pm.PackageManager.NameNotFoundException -> L93
            r3 = r2
        L5b:
            int r4 = r7.length     // Catch: java.security.cert.CertificateException -> L7e android.content.pm.PackageManager.NameNotFoundException -> L80
            if (r3 >= r4) goto Lab
            java.lang.String r4 = "X.509"
            java.security.cert.CertificateFactory r4 = java.security.cert.CertificateFactory.getInstance(r4)     // Catch: java.security.cert.CertificateException -> L7e android.content.pm.PackageManager.NameNotFoundException -> L80
            java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream     // Catch: java.security.cert.CertificateException -> L7e android.content.pm.PackageManager.NameNotFoundException -> L80
            r6 = r7[r3]     // Catch: java.security.cert.CertificateException -> L7e android.content.pm.PackageManager.NameNotFoundException -> L80
            byte[] r6 = r6.toByteArray()     // Catch: java.security.cert.CertificateException -> L7e android.content.pm.PackageManager.NameNotFoundException -> L80
            r5.<init>(r6)     // Catch: java.security.cert.CertificateException -> L7e android.content.pm.PackageManager.NameNotFoundException -> L80
            java.security.cert.Certificate r4 = r4.generateCertificate(r5)     // Catch: java.security.cert.CertificateException -> L7e android.content.pm.PackageManager.NameNotFoundException -> L80
            java.security.cert.X509Certificate r4 = (java.security.cert.X509Certificate) r4     // Catch: java.security.cert.CertificateException -> L7e android.content.pm.PackageManager.NameNotFoundException -> L80
            java.lang.String r4 = a(r4)     // Catch: java.security.cert.CertificateException -> L7e android.content.pm.PackageManager.NameNotFoundException -> L80
            r8[r3] = r4     // Catch: java.security.cert.CertificateException -> L7e android.content.pm.PackageManager.NameNotFoundException -> L80
            int r3 = r3 + 1
            goto L5b
        L7e:
            r7 = move-exception
            goto L86
        L80:
            r7 = move-exception
            goto L95
        L82:
            r8 = r1
            goto Lab
        L84:
            r7 = move-exception
            r8 = r1
        L86:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r7 = r7.toString()
            goto La1
        L93:
            r7 = move-exception
            r8 = r1
        L95:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r7 = r7.toString()
        La1:
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            c.a.c.a.d.a(r7)
        Lab:
            if (r8 == 0) goto Lef
            int r7 = r8.length
            if (r7 <= 0) goto Lef
            int r7 = r8.length
            java.lang.String[] r1 = new java.lang.String[r7]
            r7 = r2
        Lb4:
            int r0 = r8.length
            if (r7 >= r0) goto Lef
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r3 = r2
        Lbd:
            r4 = r8[r7]
            int r4 = r4.length()
            if (r3 >= r4) goto Le6
            r4 = r8[r7]
            char r4 = r4.charAt(r3)
            r0.append(r4)
            if (r3 <= 0) goto Le3
            int r4 = r3 % 2
            r5 = 1
            if (r4 != r5) goto Le3
            r4 = r8[r7]
            int r4 = r4.length()
            int r4 = r4 - r5
            if (r3 >= r4) goto Le3
            java.lang.String r4 = ":"
            r0.append(r4)
        Le3:
            int r3 = r3 + 1
            goto Lbd
        Le6:
            java.lang.String r0 = r0.toString()
            r1[r7] = r0
            int r7 = r7 + 1
            goto Lb4
        Lef:
            return r1
    }
}
