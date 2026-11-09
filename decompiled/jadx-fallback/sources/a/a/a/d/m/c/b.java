package a.a.a.d.m.c;

/* JADX INFO: loaded from: classes.dex */
public class b {
    public static a.a.a.d.m.c.b e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.String f202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.String f203c;
    public java.util.Map<java.lang.String, a.a.a.d.m.c.b.a> d;

    public static class a implements java.io.Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public java.lang.String f204b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public java.lang.String f205c;
        public double d;
        public double e;
        public double f;
        public double g;
        public java.lang.String h;
    }

    static {
            return
    }

    public b(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f201a = r0
            java.lang.String r0 = "slr"
            r2.f202b = r0
            java.lang.String r0 = ""
            r2.f203c = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r2.d = r0
            java.io.File r0 = new java.io.File
            java.io.File r3 = r3.getCacheDir()
            java.lang.String r1 = r2.f202b
            r0.<init>(r3, r1)
            java.lang.String r3 = r0.getAbsolutePath()
            r2.f202b = r3
            return
    }

    public static a.a.a.d.m.c.b a(android.content.Context r1) {
            a.a.a.d.m.c.b r0 = a.a.a.d.m.c.b.e
            if (r0 != 0) goto Lb
            a.a.a.d.m.c.b r0 = new a.a.a.d.m.c.b
            r0.<init>(r1)
            a.a.a.d.m.c.b.e = r0
        Lb:
            a.a.a.d.m.c.b r1 = a.a.a.d.m.c.b.e
            return r1
    }

    public static synchronized a.a.a.d.m.c.b d() {
            java.lang.Class<a.a.a.d.m.c.b> r0 = a.a.a.d.m.c.b.class
            monitor-enter(r0)
            a.a.a.d.m.c.b r1 = a.a.a.d.m.c.b.e     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public java.util.Map<java.lang.String, a.a.a.d.m.c.b.a> a() {
            r0 = this;
            java.util.Map<java.lang.String, a.a.a.d.m.c.b$a> r0 = r0.d
            return r0
    }

    public boolean b() {
            r0 = this;
            boolean r0 = r0.f201a
            return r0
    }

    public boolean c() {
            r1 = this;
            java.lang.String r1 = r1.f203c
            java.lang.String r0 = "on"
            boolean r1 = r1.equals(r0)
            return r1
    }
}
