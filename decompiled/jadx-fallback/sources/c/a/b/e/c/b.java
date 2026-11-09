package c.a.b.e.c;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static byte[] f1253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static byte[] f1254b;

    public static byte[] a() {
            byte[] r0 = c.a.b.e.c.b.f1253a
            if (r0 == 0) goto L5
            return r0
        L5:
            java.math.BigInteger r0 = new java.math.BigInteger
            byte[] r1 = c.a.b.e.c.a.f1250a
            r0.<init>(r1)
            java.math.BigInteger r1 = new java.math.BigInteger
            byte[] r2 = c.a.b.e.c.a.f1251b
            r1.<init>(r2)
            java.math.BigInteger r2 = new java.math.BigInteger
            byte[] r3 = c.a.b.e.c.a.e
            r2.<init>(r3)
            java.math.BigInteger r0 = r0.modPow(r1, r2)
            byte[] r0 = r0.toByteArray()
            c.a.b.e.c.b.f1253a = r0
            return r0
    }

    public static byte[] b() {
            byte[] r0 = c.a.b.e.c.b.f1254b
            if (r0 == 0) goto L5
            return r0
        L5:
            java.math.BigInteger r0 = new java.math.BigInteger
            byte[] r1 = c.a.b.e.c.a.f1252c
            r0.<init>(r1)
            java.math.BigInteger r1 = new java.math.BigInteger
            byte[] r2 = c.a.b.e.c.a.d
            r1.<init>(r2)
            java.math.BigInteger r2 = new java.math.BigInteger
            byte[] r3 = c.a.b.e.c.a.e
            r2.<init>(r3)
            java.math.BigInteger r0 = r0.modPow(r1, r2)
            byte[] r0 = r0.toByteArray()
            c.a.b.e.c.b.f1254b = r0
            return r0
    }
}
