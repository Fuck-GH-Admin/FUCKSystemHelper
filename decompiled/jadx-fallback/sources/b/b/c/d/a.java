package b.b.c.d;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f1036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f1037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f1038c;
    private final java.util.List<java.util.List<byte[]>> d;
    private final int e;
    private final java.lang.String f;

    public a(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.util.List<java.util.List<byte[]>> r4) {
            r0 = this;
            r0.<init>()
            b.b.c.f.j.a(r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.f1036a = r1
            b.b.c.f.j.a(r2)
            java.lang.String r2 = (java.lang.String) r2
            r0.f1037b = r2
            b.b.c.f.j.a(r3)
            java.lang.String r3 = (java.lang.String) r3
            r0.f1038c = r3
            b.b.c.f.j.a(r4)
            java.util.List r4 = (java.util.List) r4
            r0.d = r4
            r1 = 0
            r0.e = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = r0.f1036a
            r1.<init>(r2)
            java.lang.String r2 = "-"
            r1.append(r2)
            java.lang.String r3 = r0.f1037b
            r1.append(r3)
            r1.append(r2)
            java.lang.String r2 = r0.f1038c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.f = r1
            return
    }

    public java.util.List<java.util.List<byte[]>> a() {
            r0 = this;
            java.util.List<java.util.List<byte[]>> r0 = r0.d
            return r0
    }

    public int b() {
            r0 = this;
            int r0 = r0.e
            return r0
    }

    public java.lang.String c() {
            r0 = this;
            java.lang.String r0 = r0.f
            return r0
    }

    public java.lang.String d() {
            r0 = this;
            java.lang.String r0 = r0.f1036a
            return r0
    }

    public java.lang.String e() {
            r0 = this;
            java.lang.String r0 = r0.f1037b
            return r0
    }

    public java.lang.String f() {
            r0 = this;
            java.lang.String r0 = r0.f1038c
            return r0
    }

    public java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "FontRequest {mProviderAuthority: "
            r1.append(r2)
            java.lang.String r2 = r6.f1036a
            r1.append(r2)
            java.lang.String r2 = ", mProviderPackage: "
            r1.append(r2)
            java.lang.String r2 = r6.f1037b
            r1.append(r2)
            java.lang.String r2 = ", mQuery: "
            r1.append(r2)
            java.lang.String r2 = r6.f1038c
            r1.append(r2)
            java.lang.String r2 = ", mCertificates:"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            r1 = 0
            r2 = r1
        L36:
            java.util.List<java.util.List<byte[]>> r3 = r6.d
            int r3 = r3.size()
            if (r2 >= r3) goto L74
            java.lang.String r3 = " ["
            r0.append(r3)
            java.util.List<java.util.List<byte[]>> r3 = r6.d
            java.lang.Object r3 = r3.get(r2)
            java.util.List r3 = (java.util.List) r3
            r4 = r1
        L4c:
            int r5 = r3.size()
            if (r4 >= r5) goto L6c
            java.lang.String r5 = " \""
            r0.append(r5)
            java.lang.Object r5 = r3.get(r4)
            byte[] r5 = (byte[]) r5
            java.lang.String r5 = android.util.Base64.encodeToString(r5, r1)
            r0.append(r5)
            java.lang.String r5 = "\""
            r0.append(r5)
            int r4 = r4 + 1
            goto L4c
        L6c:
            java.lang.String r3 = " ]"
            r0.append(r3)
            int r2 = r2 + 1
            goto L36
        L74:
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "mCertificatesArray: "
            r1.append(r2)
            int r6 = r6.e
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            return r6
    }
}
