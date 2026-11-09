package b.a.a.a;

/* JADX INFO: loaded from: classes.dex */
public class a extends b.a.a.a.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile b.a.a.a.a f964c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b.a.a.a.c f965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b.a.a.a.c f966b;

    /* JADX INFO: renamed from: b.a.a.a.a$a, reason: collision with other inner class name */
    static class ExecutorC0035a implements java.util.concurrent.Executor {
        ExecutorC0035a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable r1) {
                r0 = this;
                b.a.a.a.a r0 = b.a.a.a.a.b()
                r0.b(r1)
                return
        }
    }

    static class b implements java.util.concurrent.Executor {
        b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable r1) {
                r0 = this;
                b.a.a.a.a r0 = b.a.a.a.a.b()
                r0.a(r1)
                return
        }
    }

    static {
            b.a.a.a.a$a r0 = new b.a.a.a.a$a
            r0.<init>()
            b.a.a.a.a$b r0 = new b.a.a.a.a$b
            r0.<init>()
            return
    }

    private a() {
            r1 = this;
            r1.<init>()
            b.a.a.a.b r0 = new b.a.a.a.b
            r0.<init>()
            r1.f966b = r0
            r1.f965a = r0
            return
    }

    public static b.a.a.a.a b() {
            b.a.a.a.a r0 = b.a.a.a.a.f964c
            if (r0 == 0) goto L7
            b.a.a.a.a r0 = b.a.a.a.a.f964c
            return r0
        L7:
            java.lang.Class<b.a.a.a.a> r0 = b.a.a.a.a.class
            monitor-enter(r0)
            b.a.a.a.a r1 = b.a.a.a.a.f964c     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L15
            b.a.a.a.a r1 = new b.a.a.a.a     // Catch: java.lang.Throwable -> L19
            r1.<init>()     // Catch: java.lang.Throwable -> L19
            b.a.a.a.a.f964c = r1     // Catch: java.lang.Throwable -> L19
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            b.a.a.a.a r0 = b.a.a.a.a.f964c
            return r0
        L19:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r1
    }

    @Override // b.a.a.a.c
    public void a(java.lang.Runnable r1) {
            r0 = this;
            b.a.a.a.c r0 = r0.f965a
            r0.a(r1)
            return
    }

    @Override // b.a.a.a.c
    public boolean a() {
            r0 = this;
            b.a.a.a.c r0 = r0.f965a
            boolean r0 = r0.a()
            return r0
    }

    @Override // b.a.a.a.c
    public void b(java.lang.Runnable r1) {
            r0 = this;
            b.a.a.a.c r0 = r0.f965a
            r0.b(r1)
            return
    }
}
