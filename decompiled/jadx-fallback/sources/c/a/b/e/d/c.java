package c.a.b.e.d;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.String f1258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c.a.b.e.d.f f1259c;
    private byte[] d;
    private int e;
    private c.a.b.e.d.d f;
    private java.lang.String g;

    static {
            return
    }

    public c() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "SHA-1"
            r1.g = r0
            java.lang.String r0 = "PKCS1Padding"
            r1.f1258b = r0
            return
    }

    private void a(int r8, c.a.b.e.d.d r9, java.security.SecureRandom r10, java.security.spec.AlgorithmParameterSpec r11) {
            r7 = this;
            r0 = 0
            r1 = 3
            r2 = 2
            r3 = 4
            r4 = 1
            if (r8 == r4) goto L27
            if (r8 == r2) goto L25
            if (r8 == r1) goto L27
            if (r8 != r3) goto Le
            goto L25
        Le:
            java.security.InvalidKeyException r7 = new java.security.InvalidKeyException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Unknown mode: "
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r7.<init>(r8)
            throw r7
        L25:
            r8 = r0
            goto L28
        L27:
            r8 = r4
        L28:
            boolean r5 = r9 instanceof c.a.b.e.d.d
            if (r5 == 0) goto Lc4
            if (r8 == 0) goto L30
            r5 = r4
            goto L31
        L30:
            r5 = r3
        L31:
            r7.f1257a = r5
            r7.f = r9
            java.math.BigInteger r9 = r9.a()
            int r9 = c.a.b.e.d.b.a(r9)
            r7.e = r0
            java.lang.String r0 = r7.f1258b
            java.lang.String r5 = "Parameters not supported"
            java.lang.String r6 = "NoPadding"
            if (r0 != r6) goto L5a
            if (r11 != 0) goto L54
            c.a.b.e.d.f r8 = c.a.b.e.d.f.a(r1, r9, r10)
            r7.f1259c = r8
            byte[] r8 = new byte[r9]
            r7.d = r8
            goto Lbb
        L54:
            java.security.InvalidAlgorithmParameterException r7 = new java.security.InvalidAlgorithmParameterException
            r7.<init>(r5)
            throw r7
        L5a:
            java.lang.String r6 = "PKCS1Padding"
            if (r0 != r6) goto L82
            if (r11 != 0) goto L7c
            int r11 = r7.f1257a
            if (r11 > r2) goto L65
            goto L66
        L65:
            r2 = r4
        L66:
            c.a.b.e.d.f r10 = c.a.b.e.d.f.a(r2, r9, r10)
            r7.f1259c = r10
            if (r8 == 0) goto L77
            int r8 = r10.a()
            byte[] r8 = new byte[r8]
            r7.d = r8
            goto Lbb
        L77:
            byte[] r8 = new byte[r9]
            r7.d = r8
            goto Lbb
        L7c:
            java.security.InvalidAlgorithmParameterException r7 = new java.security.InvalidAlgorithmParameterException
            r7.<init>(r5)
            throw r7
        L82:
            int r0 = r7.f1257a
            if (r0 == r1) goto Lbc
            if (r0 == r3) goto Lbc
            if (r11 == 0) goto L99
            boolean r0 = r11 instanceof javax.crypto.spec.OAEPParameterSpec
            if (r0 == 0) goto L91
            javax.crypto.spec.OAEPParameterSpec r11 = (javax.crypto.spec.OAEPParameterSpec) r11
            goto La6
        L91:
            java.security.InvalidAlgorithmParameterException r7 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r8 = "Wrong Parameters for OAEP Padding"
            r7.<init>(r8)
            throw r7
        L99:
            javax.crypto.spec.OAEPParameterSpec r11 = new javax.crypto.spec.OAEPParameterSpec
            java.lang.String r0 = r7.g
            java.security.spec.MGF1ParameterSpec r1 = java.security.spec.MGF1ParameterSpec.SHA1
            javax.crypto.spec.PSource$PSpecified r2 = javax.crypto.spec.PSource.PSpecified.DEFAULT
            java.lang.String r4 = "MGF1"
            r11.<init>(r0, r4, r1, r2)
        La6:
            c.a.b.e.d.f r10 = c.a.b.e.d.f.a(r3, r9, r10, r11)
            r7.f1259c = r10
            if (r8 == 0) goto Lb7
            int r8 = r10.a()
            byte[] r8 = new byte[r8]
            r7.d = r8
            goto Lbb
        Lb7:
            byte[] r8 = new byte[r9]
            r7.d = r8
        Lbb:
            return
        Lbc:
            java.security.InvalidKeyException r7 = new java.security.InvalidKeyException
            java.lang.String r8 = "OAEP cannot be used to sign or verify signatures"
            r7.<init>(r8)
            throw r7
        Lc4:
            java.security.InvalidKeyException r7 = new java.security.InvalidKeyException
            java.lang.String r8 = "only support helios key"
            r7.<init>(r8)
            throw r7
    }

    private byte[] a() {
            r6 = this;
            int r0 = r6.e
            byte[] r1 = r6.d
            int r2 = r1.length
            if (r0 > r2) goto L52
            r2 = 0
            int r3 = r6.f1257a     // Catch: java.lang.Throwable -> L4e
            r4 = 1
            if (r3 == r4) goto L3f
            r4 = 2
            java.lang.String r5 = "only verify supported"
            if (r3 == r4) goto L39
            r4 = 3
            if (r3 == r4) goto L33
            r4 = 4
            if (r3 != r4) goto L2b
            byte[] r0 = c.a.b.e.d.b.a(r1, r2, r0)     // Catch: java.lang.Throwable -> L4e
            c.a.b.e.d.d r1 = r6.f     // Catch: java.lang.Throwable -> L4e
            byte[] r0 = c.a.b.e.d.b.a(r0, r1)     // Catch: java.lang.Throwable -> L4e
            c.a.b.e.d.f r1 = r6.f1259c     // Catch: java.lang.Throwable -> L4e
            byte[] r0 = r1.b(r0)     // Catch: java.lang.Throwable -> L4e
            r6.e = r2
            return r0
        L2b:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = "Internal error"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L4e
            throw r0     // Catch: java.lang.Throwable -> L4e
        L33:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch: java.lang.Throwable -> L4e
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L4e
            throw r0     // Catch: java.lang.Throwable -> L4e
        L39:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch: java.lang.Throwable -> L4e
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L4e
            throw r0     // Catch: java.lang.Throwable -> L4e
        L3f:
            c.a.b.e.d.f r3 = r6.f1259c     // Catch: java.lang.Throwable -> L4e
            byte[] r0 = r3.a(r1, r2, r0)     // Catch: java.lang.Throwable -> L4e
            c.a.b.e.d.d r1 = r6.f     // Catch: java.lang.Throwable -> L4e
            byte[] r0 = c.a.b.e.d.b.a(r0, r1)     // Catch: java.lang.Throwable -> L4e
            r6.e = r2
            return r0
        L4e:
            r0 = move-exception
            r6.e = r2
            throw r0
        L52:
            javax.crypto.IllegalBlockSizeException r0 = new javax.crypto.IllegalBlockSizeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Data must not be longer than "
            r1.append(r2)
            byte[] r6 = r6.d
            int r6 = r6.length
            r1.append(r6)
            java.lang.String r6 = " bytes"
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
    }

    private void b(byte[] r5, int r6, int r7) {
            r4 = this;
            if (r7 == 0) goto L1b
            if (r5 != 0) goto L5
            goto L1b
        L5:
            int r0 = r4.e
            int r1 = r0 + r7
            byte[] r2 = r4.d
            int r3 = r2.length
            if (r1 <= r3) goto L14
            int r5 = r2.length
            int r5 = r5 + 1
        L11:
            r4.e = r5
            return
        L14:
            java.lang.System.arraycopy(r5, r6, r2, r0, r7)
            int r5 = r4.e
            int r5 = r5 + r7
            goto L11
        L1b:
            return
    }

    public void a(int r2, c.a.b.e.d.d r3, java.security.SecureRandom r4) {
            r1 = this;
            r0 = 0
            r1.a(r2, r3, r4, r0)     // Catch: java.security.InvalidAlgorithmParameterException -> L5
            return
        L5:
            r1 = move-exception
            java.security.InvalidKeyException r2 = new java.security.InvalidKeyException
            java.lang.String r3 = "Wrong parameters"
            r2.<init>(r3)
            r2.initCause(r1)
            throw r2
    }

    public void a(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "NoPadding"
            boolean r1 = r4.equalsIgnoreCase(r0)
            if (r1 == 0) goto Lb
        L8:
            r3.f1258b = r0
            goto L26
        Lb:
            java.lang.String r0 = "PKCS1Padding"
            boolean r1 = r4.equalsIgnoreCase(r0)
            if (r1 == 0) goto L14
            goto L8
        L14:
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r0 = r4.toLowerCase(r0)
            java.lang.String r1 = "oaeppadding"
            boolean r1 = r0.equals(r1)
            java.lang.String r2 = "OAEP"
            if (r1 == 0) goto L27
            r3.f1258b = r2
        L26:
            return
        L27:
            java.lang.String r1 = "oaepwith"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L5e
            java.lang.String r1 = "andmgf1padding"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L5e
            r3.f1258b = r2
            int r0 = r4.length()
            int r0 = r0 + (-14)
            r1 = 8
            java.lang.String r0 = r4.substring(r1, r0)
            r3.g = r0
            javax.crypto.NoSuchPaddingException r3 = new javax.crypto.NoSuchPaddingException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "MessageDigest not available for "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        L5e:
            javax.crypto.NoSuchPaddingException r3 = new javax.crypto.NoSuchPaddingException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Padding "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = " not supported"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
    }

    public byte[] a(byte[] r1, int r2, int r3) {
            r0 = this;
            r0.b(r1, r2, r3)
            byte[] r0 = r0.a()
            return r0
    }
}
