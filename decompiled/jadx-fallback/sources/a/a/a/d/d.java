package a.a.a.d;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.a.a.d.b f125a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a.a.a.d.d f126a = null;

        static {
                a.a.a.d.d r0 = new a.a.a.d.d
                r1 = 0
                r0.<init>(r1)
                a.a.a.d.d.a.f126a = r0
                return
        }
    }

    public d() {
            r2 = this;
            r2.<init>()
            a.a.a.b.r r2 = a.a.a.b.r.a()
            java.lang.String r0 = "mapcity"
            java.lang.String r1 = ""
            r2.a(r0, r1)
            return
    }

    public /* synthetic */ d(a.a.a.d.c r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static a.a.a.d.d b() {
            a.a.a.d.d r0 = a.a.a.d.d.a.f126a
            return r0
    }

    public synchronized a.a.a.d.b a() {
            r1 = this;
            monitor-enter(r1)
            a.a.a.d.b r0 = r1.f125a     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }
}
