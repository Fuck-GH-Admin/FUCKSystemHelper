package c.a.b.e.a;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.security.SecureRandom f1237b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c.a.b.e.a.e f1238a;

    static {
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            c.a.b.e.a.c.f1237b = r0
            return
    }

    public c() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f1238a = r0
            c.a.b.e.a.e r0 = new c.a.b.e.a.e
            c.a.b.e.a.b r1 = new c.a.b.e.a.b
            r1.<init>()
            r2 = 16
            r0.<init>(r1, r2)
            r3.f1238a = r0
            return
    }

    public static byte[] a(byte[] r2, byte[] r3, byte[] r4) {
            c.a.b.e.a.c r0 = new c.a.b.e.a.c
            r0.<init>()
            r1 = 2
            r0.a(r1, r2, r3)
            byte[] r2 = r0.a(r4)
            return r2
    }

    public void a(int r2, byte[] r3, byte[] r4) {
            r1 = this;
            c.a.b.e.a.e r1 = r1.f1238a
            java.security.SecureRandom r0 = c.a.b.e.a.c.f1237b
            r1.a(r2, r3, r4, r0)
            return
    }

    public final byte[] a(byte[] r3) {
            r2 = this;
            if (r3 == 0) goto Lb
            c.a.b.e.a.e r2 = r2.f1238a
            int r0 = r3.length
            r1 = 0
            byte[] r2 = r2.a(r3, r1, r0)
            return r2
        Lb:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Null input buffer"
            r2.<init>(r3)
            throw r2
    }
}
