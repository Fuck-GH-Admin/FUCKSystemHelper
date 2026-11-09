package a.a.a.b;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static java.lang.Object f22b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static a.a.a.b.g f23c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24a;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            a.a.a.b.g.f22b = r0
            return
    }

    public g() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f24a = r0
            return
    }

    public static a.a.a.b.g b() {
            java.lang.Object r0 = a.a.a.b.g.f22b
            monitor-enter(r0)
            a.a.a.b.g r1 = a.a.a.b.g.f23c     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto Le
            a.a.a.b.g r1 = new a.a.a.b.g     // Catch: java.lang.Throwable -> L12
            r1.<init>()     // Catch: java.lang.Throwable -> L12
            a.a.a.b.g.f23c = r1     // Catch: java.lang.Throwable -> L12
        Le:
            a.a.a.b.g r1 = a.a.a.b.g.f23c     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return r1
        L12:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1
    }

    public void a() {
            r1 = this;
            r0 = -1
            r1.f24a = r0
            return
    }

    public void a(int r2, int r3, java.lang.String r4) {
            r1 = this;
            int r0 = r1.f24a
            if (r3 == r0) goto L27
            r1.f24a = r3
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r0 = "loctype"
            r1.putInt(r0, r2)
            java.lang.String r2 = "diagtype"
            r1.putInt(r2, r3)
            byte[] r2 = r4.getBytes()
            java.lang.String r3 = "diagmessage"
            r1.putByteArray(r3, r2)
            a.a.a.b.c r2 = a.a.a.b.c.h()
            r3 = 303(0x12f, float:4.25E-43)
            r2.a(r1, r3)
        L27:
            return
    }
}
