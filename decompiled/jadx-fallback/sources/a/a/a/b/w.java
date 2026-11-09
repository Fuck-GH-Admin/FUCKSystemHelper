package a.a.a.b;

/* JADX INFO: loaded from: classes.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.util.concurrent.ExecutorService f86a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.util.concurrent.ExecutorService f87b;

    public static /* synthetic */ class a {
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static a.a.a.b.w f88a;

        static {
                a.a.a.b.w r0 = new a.a.a.b.w
                r1 = 0
                r0.<init>(r1)
                a.a.a.b.w.b.f88a = r0
                return
        }

        public static /* synthetic */ a.a.a.b.w a() {
                a.a.a.b.w r0 = a.a.a.b.w.b.f88a
                return r0
        }
    }

    public w() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f86a = r0
            r1.f87b = r0
            return
    }

    public /* synthetic */ w(a.a.a.b.w.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static a.a.a.b.w d() {
            a.a.a.b.w r0 = a.a.a.b.w.b.a()
            return r0
    }

    public synchronized java.util.concurrent.ExecutorService a() {
            r1 = this;
            monitor-enter(r1)
            java.util.concurrent.ExecutorService r0 = r1.f86a     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public synchronized java.util.concurrent.ExecutorService b() {
            r1 = this;
            monitor-enter(r1)
            java.util.concurrent.ExecutorService r0 = r1.f87b     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public void c() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.f86a
            if (r0 == 0) goto L7
            r0.shutdown()
        L7:
            java.util.concurrent.ExecutorService r1 = r1.f87b
            if (r1 == 0) goto Le
            r1.shutdown()
        Le:
            return
    }
}
