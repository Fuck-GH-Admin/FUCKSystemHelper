package c.b.a.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract int a();

    public abstract void a(c.b.a.a.b r1);

    public void a(byte[] r1, int r2, int r3) {
            r0 = this;
            c.b.a.a.b r1 = c.b.a.a.b.b(r1, r2, r3)     // Catch: java.io.IOException -> Lb
            r0.a(r1)     // Catch: java.io.IOException -> Lb
            r1.a()     // Catch: java.io.IOException -> Lb
            return
        Lb:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Serializing to a byte array threw an IOException (should never happen)."
            r0.<init>(r1)
            throw r0
    }

    public abstract int b();

    public byte[] c() {
            r3 = this;
            int r0 = r3.b()
            byte[] r1 = new byte[r0]
            r2 = 0
            r3.a(r1, r2, r0)
            return r1
    }
}
