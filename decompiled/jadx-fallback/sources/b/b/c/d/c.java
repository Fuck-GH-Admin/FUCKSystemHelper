package b.b.c.d;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f1055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.os.HandlerThread f1056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.os.Handler f1057c;
    private int d;
    private android.os.Handler.Callback e;
    private final int f;
    private final int g;
    private final java.lang.String h;

    class a implements android.os.Handler.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b.b.c.d.c f1058a;

        a(b.b.c.d.c r1) {
                r0 = this;
                r0.f1058a = r1
                r0.<init>()
                return
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message r3) {
                r2 = this;
                int r0 = r3.what
                r1 = 1
                if (r0 == 0) goto L12
                if (r0 == r1) goto L8
                return r1
            L8:
                b.b.c.d.c r2 = r2.f1058a
                java.lang.Object r3 = r3.obj
                java.lang.Runnable r3 = (java.lang.Runnable) r3
                r2.a(r3)
                return r1
            L12:
                b.b.c.d.c r2 = r2.f1058a
                r2.a()
                return r1
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.util.concurrent.Callable f1059b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.os.Handler f1060c;
        final /* synthetic */ b.b.c.d.c.d d;

        class a implements java.lang.Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ java.lang.Object f1061b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b.b.c.d.c.b f1062c;

            a(b.b.c.d.c.b r1, java.lang.Object r2) {
                    r0 = this;
                    r0.f1062c = r1
                    r0.f1061b = r2
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r1 = this;
                    b.b.c.d.c$b r0 = r1.f1062c
                    b.b.c.d.c$d r0 = r0.d
                    java.lang.Object r1 = r1.f1061b
                    r0.a(r1)
                    return
            }
        }

        b(b.b.c.d.c r1, java.util.concurrent.Callable r2, android.os.Handler r3, b.b.c.d.c.d r4) {
                r0 = this;
                r0.f1059b = r2
                r0.f1060c = r3
                r0.d = r4
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                java.util.concurrent.Callable r0 = r3.f1059b     // Catch: java.lang.Exception -> L7
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Exception -> L7
                goto L8
            L7:
                r0 = 0
            L8:
                android.os.Handler r1 = r3.f1060c
                b.b.c.d.c$b$a r2 = new b.b.c.d.c$b$a
                r2.<init>(r3, r0)
                r1.post(r2)
                return
        }
    }

    /* JADX INFO: renamed from: b.b.c.d.c$c, reason: collision with other inner class name */
    class RunnableC0043c implements java.lang.Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.util.concurrent.atomic.AtomicReference f1063b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ java.util.concurrent.Callable f1064c;
        final /* synthetic */ java.util.concurrent.locks.ReentrantLock d;
        final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean e;
        final /* synthetic */ java.util.concurrent.locks.Condition f;

        RunnableC0043c(b.b.c.d.c r1, java.util.concurrent.atomic.AtomicReference r2, java.util.concurrent.Callable r3, java.util.concurrent.locks.ReentrantLock r4, java.util.concurrent.atomic.AtomicBoolean r5, java.util.concurrent.locks.Condition r6) {
                r0 = this;
                r0.f1063b = r2
                r0.f1064c = r3
                r0.d = r4
                r0.e = r5
                r0.f = r6
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference r0 = r2.f1063b     // Catch: java.lang.Exception -> Lb
                java.util.concurrent.Callable r1 = r2.f1064c     // Catch: java.lang.Exception -> Lb
                java.lang.Object r1 = r1.call()     // Catch: java.lang.Exception -> Lb
                r0.set(r1)     // Catch: java.lang.Exception -> Lb
            Lb:
                java.util.concurrent.locks.ReentrantLock r0 = r2.d
                r0.lock()
                java.util.concurrent.atomic.AtomicBoolean r0 = r2.e     // Catch: java.lang.Throwable -> L21
                r1 = 0
                r0.set(r1)     // Catch: java.lang.Throwable -> L21
                java.util.concurrent.locks.Condition r0 = r2.f     // Catch: java.lang.Throwable -> L21
                r0.signal()     // Catch: java.lang.Throwable -> L21
                java.util.concurrent.locks.ReentrantLock r2 = r2.d
                r2.unlock()
                return
            L21:
                r0 = move-exception
                java.util.concurrent.locks.ReentrantLock r2 = r2.d
                r2.unlock()
                throw r0
        }
    }

    public interface d<T> {
        void a(T r1);
    }

    public c(java.lang.String r2, int r3, int r4) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f1055a = r0
            b.b.c.d.c$a r0 = new b.b.c.d.c$a
            r0.<init>(r1)
            r1.e = r0
            r1.h = r2
            r1.g = r3
            r1.f = r4
            r2 = 0
            r1.d = r2
            return
    }

    private void b(java.lang.Runnable r6) {
            r5 = this;
            java.lang.Object r0 = r5.f1055a
            monitor-enter(r0)
            android.os.HandlerThread r1 = r5.f1056b     // Catch: java.lang.Throwable -> L3d
            r2 = 1
            if (r1 != 0) goto L2a
            android.os.HandlerThread r1 = new android.os.HandlerThread     // Catch: java.lang.Throwable -> L3d
            java.lang.String r3 = r5.h     // Catch: java.lang.Throwable -> L3d
            int r4 = r5.g     // Catch: java.lang.Throwable -> L3d
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L3d
            r5.f1056b = r1     // Catch: java.lang.Throwable -> L3d
            r1.start()     // Catch: java.lang.Throwable -> L3d
            android.os.Handler r1 = new android.os.Handler     // Catch: java.lang.Throwable -> L3d
            android.os.HandlerThread r3 = r5.f1056b     // Catch: java.lang.Throwable -> L3d
            android.os.Looper r3 = r3.getLooper()     // Catch: java.lang.Throwable -> L3d
            android.os.Handler$Callback r4 = r5.e     // Catch: java.lang.Throwable -> L3d
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L3d
            r5.f1057c = r1     // Catch: java.lang.Throwable -> L3d
            int r1 = r5.d     // Catch: java.lang.Throwable -> L3d
            int r1 = r1 + r2
            r5.d = r1     // Catch: java.lang.Throwable -> L3d
        L2a:
            android.os.Handler r1 = r5.f1057c     // Catch: java.lang.Throwable -> L3d
            r3 = 0
            r1.removeMessages(r3)     // Catch: java.lang.Throwable -> L3d
            android.os.Handler r1 = r5.f1057c     // Catch: java.lang.Throwable -> L3d
            android.os.Handler r5 = r5.f1057c     // Catch: java.lang.Throwable -> L3d
            android.os.Message r5 = r5.obtainMessage(r2, r6)     // Catch: java.lang.Throwable -> L3d
            r1.sendMessage(r5)     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
            return
        L3d:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
            throw r5
    }

    public <T> T a(java.util.concurrent.Callable<T> r13, int r14) {
            r12 = this;
            java.util.concurrent.locks.ReentrantLock r7 = new java.util.concurrent.locks.ReentrantLock
            r7.<init>()
            java.util.concurrent.locks.Condition r8 = r7.newCondition()
            java.util.concurrent.atomic.AtomicReference r9 = new java.util.concurrent.atomic.AtomicReference
            r9.<init>()
            java.util.concurrent.atomic.AtomicBoolean r10 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 1
            r10.<init>(r0)
            b.b.c.d.c$c r11 = new b.b.c.d.c$c
            r0 = r11
            r1 = r12
            r2 = r9
            r3 = r13
            r4 = r7
            r5 = r10
            r6 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r12.b(r11)
            r7.lock()
            boolean r12 = r10.get()     // Catch: java.lang.Throwable -> L5c
            if (r12 != 0) goto L34
            java.lang.Object r12 = r9.get()     // Catch: java.lang.Throwable -> L5c
            r7.unlock()
            return r12
        L34:
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L5c
            long r13 = (long) r14     // Catch: java.lang.Throwable -> L5c
            long r12 = r12.toNanos(r13)     // Catch: java.lang.Throwable -> L5c
        L3b:
            long r12 = r8.awaitNanos(r12)     // Catch: java.lang.InterruptedException -> L3f java.lang.Throwable -> L5c
        L3f:
            boolean r14 = r10.get()     // Catch: java.lang.Throwable -> L5c
            if (r14 != 0) goto L4d
            java.lang.Object r12 = r9.get()     // Catch: java.lang.Throwable -> L5c
            r7.unlock()
            return r12
        L4d:
            r0 = 0
            int r14 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r14 <= 0) goto L54
            goto L3b
        L54:
            java.lang.InterruptedException r12 = new java.lang.InterruptedException     // Catch: java.lang.Throwable -> L5c
            java.lang.String r13 = "timeout"
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L5c
            throw r12     // Catch: java.lang.Throwable -> L5c
        L5c:
            r12 = move-exception
            r7.unlock()
            throw r12
    }

    void a() {
            r3 = this;
            java.lang.Object r0 = r3.f1055a
            monitor-enter(r0)
            android.os.Handler r1 = r3.f1057c     // Catch: java.lang.Throwable -> L1a
            r2 = 1
            boolean r1 = r1.hasMessages(r2)     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return
        Le:
            android.os.HandlerThread r1 = r3.f1056b     // Catch: java.lang.Throwable -> L1a
            r1.quit()     // Catch: java.lang.Throwable -> L1a
            r1 = 0
            r3.f1056b = r1     // Catch: java.lang.Throwable -> L1a
            r3.f1057c = r1     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return
        L1a:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r3
    }

    void a(java.lang.Runnable r5) {
            r4 = this;
            r5.run()
            java.lang.Object r5 = r4.f1055a
            monitor-enter(r5)
            android.os.Handler r0 = r4.f1057c     // Catch: java.lang.Throwable -> L1c
            r1 = 0
            r0.removeMessages(r1)     // Catch: java.lang.Throwable -> L1c
            android.os.Handler r0 = r4.f1057c     // Catch: java.lang.Throwable -> L1c
            android.os.Handler r2 = r4.f1057c     // Catch: java.lang.Throwable -> L1c
            android.os.Message r1 = r2.obtainMessage(r1)     // Catch: java.lang.Throwable -> L1c
            int r4 = r4.f     // Catch: java.lang.Throwable -> L1c
            long r2 = (long) r4     // Catch: java.lang.Throwable -> L1c
            r0.sendMessageDelayed(r1, r2)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L1c
            return
        L1c:
            r4 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L1c
            throw r4
    }

    public <T> void a(java.util.concurrent.Callable<T> r3, b.b.c.d.c.d<T> r4) {
            r2 = this;
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            b.b.c.d.c$b r1 = new b.b.c.d.c$b
            r1.<init>(r2, r3, r0, r4)
            r2.b(r1)
            return
    }
}
