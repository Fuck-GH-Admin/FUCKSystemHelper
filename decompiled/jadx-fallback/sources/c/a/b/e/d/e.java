package c.a.b.e.d;

/* JADX INFO: loaded from: classes.dex */
public class e implements c.a.b.e.d.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.math.BigInteger f1260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.math.BigInteger f1261b;

    public e(byte[] r2, byte[] r3) {
            r1 = this;
            r1.<init>()
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r2)
            r1.f1260a = r0
            java.math.BigInteger r2 = new java.math.BigInteger
            r2.<init>(r3)
            r1.f1261b = r2
            return
    }

    @Override // c.a.b.e.d.d
    public java.math.BigInteger a() {
            r0 = this;
            java.math.BigInteger r0 = r0.f1260a
            return r0
    }

    @Override // c.a.b.e.d.d
    public java.math.BigInteger b() {
            r0 = this;
            java.math.BigInteger r0 = r0.f1261b
            return r0
    }
}
