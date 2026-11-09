package c.a.c.a;

/* JADX INFO: loaded from: classes.dex */
class r extends java.lang.Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    android.os.Handler f1313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.Object f1314c;
    private boolean d;

    r(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.f1313b = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.f1314c = r1
            r1 = 0
            r0.d = r1
            return
    }

    public void a() {
            r1 = this;
            boolean r0 = c.a.c.a.d.f1289a
            if (r0 == 0) goto L9
            java.lang.String r0 = "Looper thread quit()"
            c.a.c.a.d.a(r0)
        L9:
            android.os.Handler r0 = r1.f1313b
            if (r0 == 0) goto L1d
            android.os.Looper r0 = r0.getLooper()
            if (r0 != 0) goto L14
            goto L1d
        L14:
            android.os.Handler r1 = r1.f1313b
            android.os.Looper r1 = r1.getLooper()
            r1.quit()
        L1d:
            return
    }

    public void b() {
            r2 = this;
            java.lang.Object r0 = r2.f1314c
            monitor-enter(r0)
            boolean r1 = r2.d     // Catch: java.lang.Throwable -> Ld java.lang.InterruptedException -> Lf
            if (r1 != 0) goto L13
            java.lang.Object r2 = r2.f1314c     // Catch: java.lang.Throwable -> Ld java.lang.InterruptedException -> Lf
            r2.wait()     // Catch: java.lang.Throwable -> Ld java.lang.InterruptedException -> Lf
            goto L13
        Ld:
            r2 = move-exception
            goto L15
        Lf:
            r2 = move-exception
            r2.printStackTrace()     // Catch: java.lang.Throwable -> Ld
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    public void c() {
            r2 = this;
            java.lang.Object r0 = r2.f1314c
            monitor-enter(r0)
            r1 = 1
            r2.d = r1     // Catch: java.lang.Throwable -> Ld
            java.lang.Object r2 = r2.f1314c     // Catch: java.lang.Throwable -> Ld
            r2.notifyAll()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
            r2 = this;
            android.os.Looper.prepare()
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r2.f1313b = r0
            boolean r2 = c.a.c.a.d.f1289a
            if (r2 == 0) goto L13
            java.lang.String r2 = "new Handler() finish!!"
            c.a.c.a.d.a(r2)
        L13:
            android.os.Looper.loop()
            boolean r2 = c.a.c.a.d.f1289a
            if (r2 == 0) goto L3a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "LooperThread run() thread id:"
            r2.append(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            long r0 = r0.getId()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            c.a.c.a.d.a(r2)
        L3a:
            return
    }
}
