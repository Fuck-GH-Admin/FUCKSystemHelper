package c.b.a.a;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c.b.a.a.a f1316c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f1317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile int f1318b;

    static {
            c.b.a.a.a r0 = new c.b.a.a.a
            r1 = 0
            byte[] r1 = new byte[r1]
            r0.<init>(r1)
            c.b.a.a.a.f1316c = r0
            return
    }

    private a(byte[] r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f1318b = r0
            r1.f1317a = r2
            return
    }

    public static c.b.a.a.a a(java.lang.String r2) {
            c.b.a.a.a r0 = new c.b.a.a.a     // Catch: java.io.UnsupportedEncodingException -> Lc
            java.lang.String r1 = "UTF-8"
            byte[] r2 = r2.getBytes(r1)     // Catch: java.io.UnsupportedEncodingException -> Lc
            r0.<init>(r2)     // Catch: java.io.UnsupportedEncodingException -> Lc
            return r0
        Lc:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r0 = "UTF-8 not supported?"
            r2.<init>(r0)
            throw r2
    }

    public int a() {
            r0 = this;
            byte[] r0 = r0.f1317a
            int r0 = r0.length
            return r0
    }

    public byte[] b() {
            r3 = this;
            byte[] r3 = r3.f1317a
            int r0 = r3.length
            byte[] r1 = new byte[r0]
            r2 = 0
            java.lang.System.arraycopy(r3, r2, r1, r2, r0)
            return r1
    }

    public boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof c.b.a.a.a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            c.b.a.a.a r7 = (c.b.a.a.a) r7
            byte[] r6 = r6.f1317a
            int r1 = r6.length
            byte[] r7 = r7.f1317a
            int r3 = r7.length
            if (r1 == r3) goto L15
            return r2
        L15:
            r3 = r2
        L16:
            if (r3 >= r1) goto L22
            r4 = r6[r3]
            r5 = r7[r3]
            if (r4 == r5) goto L1f
            return r2
        L1f:
            int r3 = r3 + 1
            goto L16
        L22:
            return r0
    }

    public int hashCode() {
            r5 = this;
            int r0 = r5.f1318b
            if (r0 != 0) goto L1a
            byte[] r0 = r5.f1317a
            int r1 = r0.length
            r2 = 0
            r3 = r1
        L9:
            if (r2 >= r1) goto L13
            int r3 = r3 * 31
            r4 = r0[r2]
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L9
        L13:
            if (r3 != 0) goto L17
            r0 = 1
            goto L18
        L17:
            r0 = r3
        L18:
            r5.f1318b = r0
        L1a:
            return r0
    }
}
