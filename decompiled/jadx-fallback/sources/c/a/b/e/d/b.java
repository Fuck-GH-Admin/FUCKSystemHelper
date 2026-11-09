package c.a.b.e.d;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.security.SecureRandom f1256a = null;

    static {
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            c.a.b.e.d.b.f1256a = r0
            return
    }

    public static int a(java.math.BigInteger r0) {
            int r0 = r0.bitLength()
            int r0 = r0 + 7
            int r0 = r0 >> 3
            return r0
    }

    private static java.math.BigInteger a(byte[] r2, java.math.BigInteger r3) {
            java.math.BigInteger r0 = new java.math.BigInteger
            r1 = 1
            r0.<init>(r1, r2)
            int r2 = r0.compareTo(r3)
            if (r2 >= 0) goto Ld
            return r0
        Ld:
            javax.crypto.BadPaddingException r2 = new javax.crypto.BadPaddingException
            java.lang.String r3 = "Message is larger than modulus"
            r2.<init>(r3)
            throw r2
    }

    private static byte[] a(java.math.BigInteger r3, int r4) {
            byte[] r3 = r3.toByteArray()
            int r0 = r3.length
            if (r0 != r4) goto L8
            return r3
        L8:
            int r1 = r4 + 1
            r2 = 0
            if (r0 != r1) goto L18
            r1 = r3[r2]
            if (r1 != 0) goto L18
            byte[] r0 = new byte[r4]
            r1 = 1
            java.lang.System.arraycopy(r3, r1, r0, r2, r4)
            return r0
        L18:
            if (r0 < r4) goto L1c
            r3 = 0
            return r3
        L1c:
            byte[] r1 = new byte[r4]
            int r4 = r4 - r0
            java.lang.System.arraycopy(r3, r2, r1, r4, r0)
            return r1
    }

    public static byte[] a(byte[] r2, int r3, int r4) {
            if (r3 != 0) goto L6
            int r0 = r2.length
            if (r4 != r0) goto L6
            return r2
        L6:
            byte[] r0 = new byte[r4]
            r1 = 0
            java.lang.System.arraycopy(r2, r3, r0, r1, r4)
            return r0
    }

    public static byte[] a(byte[] r1, c.a.b.e.d.d r2) {
            java.math.BigInteger r0 = r2.a()
            java.math.BigInteger r2 = r2.b()
            byte[] r1 = a(r1, r0, r2)
            return r1
    }

    private static byte[] a(byte[] r0, java.math.BigInteger r1, java.math.BigInteger r2) {
            java.math.BigInteger r0 = a(r0, r1)
            java.math.BigInteger r0 = r0.modPow(r2, r1)
            int r1 = a(r1)
            byte[] r0 = a(r0, r1)
            return r0
    }
}
