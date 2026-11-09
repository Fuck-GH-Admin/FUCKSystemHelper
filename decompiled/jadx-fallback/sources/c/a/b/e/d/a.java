package c.a.b.e.d;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c.a.b.e.d.c f1255a;

    private a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static c.a.b.e.d.a a() {
            c.a.b.e.d.a r0 = new c.a.b.e.d.a
            r0.<init>()
            c.a.b.e.d.c r1 = new c.a.b.e.d.c
            r1.<init>()
            r0.f1255a = r1
            java.lang.String r2 = "PKCS1Padding"
            r1.a(r2)
            return r0
    }

    public void a(int r2, c.a.b.e.d.d r3) {
            r1 = this;
            c.a.b.e.d.c r1 = r1.f1255a
            java.security.SecureRandom r0 = c.a.b.e.d.b.f1256a
            r1.a(r2, r3, r0)
            return
    }

    public final byte[] a(byte[] r3) {
            r2 = this;
            if (r3 == 0) goto Lb
            c.a.b.e.d.c r2 = r2.f1255a
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
