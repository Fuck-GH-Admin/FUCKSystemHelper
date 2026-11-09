package a.a.a.d;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.a.a.d.l.b f182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.baidu.location.c f184c;
    public a.a.a.d.l.c d;
    public com.baidu.location.c e;
    public boolean f;
    public android.os.Handler g;
    public java.lang.Runnable h;

    public class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.a.a.d.l f185b;

        public a(a.a.a.d.l r1) {
                r0 = this;
                r0.f185b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                a.a.a.d.l r0 = r4.f185b
                com.baidu.location.c r0 = a.a.a.d.l.f(r0)
                if (r0 == 0) goto L3e
                a.a.a.d.l r0 = r4.f185b
                a.a.a.d.l$b r0 = a.a.a.d.l.a(r0)
                if (r0 == 0) goto L3e
                com.baidu.location.c r0 = new com.baidu.location.c
                a.a.a.d.l r1 = r4.f185b
                com.baidu.location.c r1 = a.a.a.d.l.c(r1)
                r0.<init>(r1)
                a.a.a.d.l r1 = r4.f185b
                com.baidu.location.c r1 = a.a.a.d.l.f(r1)
                double r1 = r1.q()
                r0.c(r1)
                a.a.a.d.l r1 = r4.f185b
                com.baidu.location.c r1 = a.a.a.d.l.f(r1)
                double r1 = r1.t()
                r0.d(r1)
                a.a.a.d.l r1 = r4.f185b
                a.a.a.d.l$b r1 = a.a.a.d.l.a(r1)
                r1.a(r0)
            L3e:
                a.a.a.d.l r0 = r4.f185b
                android.os.Handler r0 = a.a.a.d.l.e(r0)
                a.a.a.d.l r1 = r4.f185b
                java.lang.Runnable r1 = a.a.a.d.l.d(r1)
                a.a.a.d.l r4 = r4.f185b
                long r2 = a.a.a.d.l.b(r4)
                r0.postDelayed(r1, r2)
                return
        }
    }

    public interface b {
        void a(com.baidu.location.c r1);
    }

    public class c {
        public c(a.a.a.d.l r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public c(a.a.a.d.l r1, double r2, double r4) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public l() {
            r2 = this;
            r2.<init>()
            r0 = 450(0x1c2, double:2.223E-321)
            r2.f183b = r0
            r0 = 0
            r2.d = r0
            a.a.a.d.l$c r1 = new a.a.a.d.l$c
            r1.<init>(r2)
            a.a.a.d.l$c r1 = new a.a.a.d.l$c
            r1.<init>(r2)
            a.a.a.d.l$c r1 = new a.a.a.d.l$c
            r1.<init>(r2)
            r2.e = r0
            r0 = 0
            r2.f = r0
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r2.g = r0
            a.a.a.d.l$a r0 = new a.a.a.d.l$a
            r0.<init>(r2)
            r2.h = r0
            return
    }

    public static /* synthetic */ a.a.a.d.l.b a(a.a.a.d.l r0) {
            a.a.a.d.l$b r0 = r0.f182a
            return r0
    }

    public static /* synthetic */ long b(a.a.a.d.l r2) {
            long r0 = r2.f183b
            return r0
    }

    public static /* synthetic */ com.baidu.location.c c(a.a.a.d.l r0) {
            com.baidu.location.c r0 = r0.f184c
            return r0
    }

    public static /* synthetic */ java.lang.Runnable d(a.a.a.d.l r0) {
            java.lang.Runnable r0 = r0.h
            return r0
    }

    public static /* synthetic */ android.os.Handler e(a.a.a.d.l r0) {
            android.os.Handler r0 = r0.g
            return r0
    }

    public static /* synthetic */ com.baidu.location.c f(a.a.a.d.l r0) {
            com.baidu.location.c r0 = r0.e
            return r0
    }

    public void a(long r1) {
            r0 = this;
            r0.f183b = r1
            return
    }

    public synchronized void a(com.baidu.location.c r20) {
            r19 = this;
            r7 = r19
            r0 = r20
            monitor-enter(r19)
            double r8 = r20.q()     // Catch: java.lang.Throwable -> L7d
            double r10 = r20.t()     // Catch: java.lang.Throwable -> L7d
            r7.f184c = r0     // Catch: java.lang.Throwable -> L7d
            a.a.a.d.l$c r1 = new a.a.a.d.l$c     // Catch: java.lang.Throwable -> L7d
            r2 = r19
            r3 = r8
            r5 = r10
            r1.<init>(r2, r3, r5)     // Catch: java.lang.Throwable -> L7d
            a.a.a.d.l$c r1 = r7.d     // Catch: java.lang.Throwable -> L7d
            if (r1 != 0) goto L28
            a.a.a.d.l$c r12 = new a.a.a.d.l$c     // Catch: java.lang.Throwable -> L7d
            r1 = r12
            r2 = r19
            r3 = r8
            r5 = r10
            r1.<init>(r2, r3, r5)     // Catch: java.lang.Throwable -> L7d
            r7.d = r12     // Catch: java.lang.Throwable -> L7d
        L28:
            com.baidu.location.c r1 = r7.e     // Catch: java.lang.Throwable -> L7d
            if (r1 != 0) goto L34
            com.baidu.location.c r1 = new com.baidu.location.c     // Catch: java.lang.Throwable -> L7d
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L7d
            r7.e = r1     // Catch: java.lang.Throwable -> L7d
            goto L7b
        L34:
            double r1 = r1.q()     // Catch: java.lang.Throwable -> L7d
            com.baidu.location.c r3 = r7.e     // Catch: java.lang.Throwable -> L7d
            double r3 = r3.t()     // Catch: java.lang.Throwable -> L7d
            double r5 = r20.q()     // Catch: java.lang.Throwable -> L7d
            double r14 = r20.t()     // Catch: java.lang.Throwable -> L7d
            r0 = 2
            float[] r0 = new float[r0]     // Catch: java.lang.Throwable -> L7d
            r8 = r1
            r10 = r3
            r12 = r5
            r17 = r14
            r16 = r0
            android.location.Location.distanceBetween(r8, r10, r12, r14, r16)     // Catch: java.lang.Throwable -> L7d
            r8 = 0
            r0 = r0[r8]     // Catch: java.lang.Throwable -> L7d
            r8 = 1092616192(0x41200000, float:10.0)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 <= 0) goto L69
            com.baidu.location.c r0 = r7.e     // Catch: java.lang.Throwable -> L7d
            r0.c(r5)     // Catch: java.lang.Throwable -> L7d
            com.baidu.location.c r0 = r7.e     // Catch: java.lang.Throwable -> L7d
            r8 = r17
            r0.d(r8)     // Catch: java.lang.Throwable -> L7d
            goto L7b
        L69:
            r8 = r17
            com.baidu.location.c r0 = r7.e     // Catch: java.lang.Throwable -> L7d
            double r1 = r1 + r5
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r1 = r1 / r5
            r0.c(r1)     // Catch: java.lang.Throwable -> L7d
            com.baidu.location.c r0 = r7.e     // Catch: java.lang.Throwable -> L7d
            double r3 = r3 + r8
            double r3 = r3 / r5
            r0.d(r3)     // Catch: java.lang.Throwable -> L7d
        L7b:
            monitor-exit(r19)
            return
        L7d:
            r0 = move-exception
            monitor-exit(r19)
            throw r0
    }

    public boolean a() {
            r0 = this;
            boolean r0 = r0.f
            return r0
    }

    public void b() {
            r1 = this;
            r0 = 0
            r1.d = r0
            a.a.a.d.l$c r0 = new a.a.a.d.l$c
            r0.<init>(r1)
            a.a.a.d.l$c r0 = new a.a.a.d.l$c
            r0.<init>(r1)
            a.a.a.d.l$c r0 = new a.a.a.d.l$c
            r0.<init>(r1)
            return
    }

    public void c() {
            r2 = this;
            boolean r0 = r2.f
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            r2.f = r0
            android.os.Handler r0 = r2.g
            java.lang.Runnable r1 = r2.h
            r0.removeCallbacks(r1)
            r2.b()
            return
    }
}
