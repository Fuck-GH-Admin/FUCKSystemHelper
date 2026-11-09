package b.a.a.a;

/* JADX INFO: loaded from: classes.dex */
public class b extends b.a.a.a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.util.concurrent.ExecutorService f968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile android.os.Handler f969c;

    public b() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f967a = r0
            r0 = 2
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r0)
            r1.f968b = r0
            return
    }

    @Override // b.a.a.a.c
    public void a(java.lang.Runnable r1) {
            r0 = this;
            java.util.concurrent.ExecutorService r0 = r0.f968b
            r0.execute(r1)
            return
    }

    @Override // b.a.a.a.c
    public boolean a() {
            r1 = this;
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            java.lang.Thread r1 = r1.getThread()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            if (r1 != r0) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
    }

    @Override // b.a.a.a.c
    public void b(java.lang.Runnable r4) {
            r3 = this;
            android.os.Handler r0 = r3.f969c
            if (r0 != 0) goto L1b
            java.lang.Object r0 = r3.f967a
            monitor-enter(r0)
            android.os.Handler r1 = r3.f969c     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L16
            android.os.Handler r1 = new android.os.Handler     // Catch: java.lang.Throwable -> L18
            android.os.Looper r2 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L18
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L18
            r3.f969c = r1     // Catch: java.lang.Throwable -> L18
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            goto L1b
        L18:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r3
        L1b:
            android.os.Handler r3 = r3.f969c
            r3.post(r4)
            return
    }
}
