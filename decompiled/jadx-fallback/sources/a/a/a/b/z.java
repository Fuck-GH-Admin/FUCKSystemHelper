package a.a.a.b;

/* JADX INFO: loaded from: classes.dex */
public class z {
    public static java.lang.Object d;
    public static a.a.a.b.z e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public android.os.HandlerThread f96a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public android.os.Handler f97b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f98c;

    public class a extends android.os.Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.a.a.b.z f99a;

        public a(a.a.a.b.z r1, android.os.Looper r2) {
                r0 = this;
                r0.f99a = r1
                r0.<init>(r2)
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r4) {
                r3 = this;
                int r0 = r4.what
                switch(r0) {
                    case 1: goto Le9;
                    case 2: goto Lcd;
                    case 3: goto Lb4;
                    case 4: goto L40;
                    case 5: goto L37;
                    case 6: goto L5;
                    case 7: goto L27;
                    case 8: goto L22;
                    case 9: goto L22;
                    case 10: goto L5;
                    case 11: goto L7;
                    default: goto L5;
                }
            L5:
                goto L108
            L7:
                android.os.Bundle r3 = r4.getData()
                java.lang.String r4 = "gnss_navigation_message"
                android.os.Parcelable r4 = r3.getParcelable(r4)     // Catch: java.lang.Exception -> L108
                android.location.GnssNavigationMessage r4 = (android.location.GnssNavigationMessage) r4     // Catch: java.lang.Exception -> L108
                java.lang.String r0 = "gps_time"
                long r0 = r3.getLong(r0)     // Catch: java.lang.Exception -> L108
                a.a.a.b.x r3 = a.a.a.b.x.b()     // Catch: java.lang.Exception -> L108
                r3.a(r4, r0)     // Catch: java.lang.Exception -> L108
                goto L108
            L22:
                r4.getData()
                goto L108
            L27:
                a.a.a.b.y r3 = a.a.a.b.y.c()
                r3.a()
                a.a.a.c.f r3 = a.a.a.c.f.d()
                r3.a()
                goto L108
            L37:
                a.a.a.c.f r3 = a.a.a.c.f.d()
                r3.b()
                goto L108
            L40:
                a.a.a.g.f r4 = a.a.a.g.f.w()
                boolean r4 = r4.p()
                boolean r0 = a.a.a.i.i.l()
                r1 = 0
                if (r0 == 0) goto L50
                r4 = r1
            L50:
                r0 = 1
                if (r4 == 0) goto L5f
                a.a.a.b.l r4 = a.a.a.b.l.f()
                int r4 = r4.a()
                if (r4 == r0) goto L60
                r1 = r0
                goto L60
            L5f:
                r1 = r4
            L60:
                if (r1 == 0) goto L92
                a.a.a.c.c r4 = a.a.a.c.c.f()
                boolean r4 = r4.c()
                if (r4 == 0) goto L7a
                a.a.a.f.d r4 = a.a.a.f.d.r()
                r4.o()
                a.a.a.f.d r4 = a.a.a.f.d.r()
                r4.p()
            L7a:
                a.a.a.c.f r4 = a.a.a.c.f.d()
                r4.a()
                a.a.a.c.c r4 = a.a.a.c.c.f()
                boolean r4 = r4.c()
                if (r4 == 0) goto L92
                a.a.a.b.y r4 = a.a.a.b.y.c()
                r4.a()
            L92:
                a.a.a.b.z r4 = r3.f99a     // Catch: java.lang.Exception -> La8
                android.os.Handler r4 = a.a.a.b.z.a(r4)     // Catch: java.lang.Exception -> La8
                if (r4 == 0) goto Lac
                a.a.a.b.z r3 = r3.f99a     // Catch: java.lang.Exception -> La8
                android.os.Handler r3 = a.a.a.b.z.a(r3)     // Catch: java.lang.Exception -> La8
                r4 = 4
                int r0 = a.a.a.i.i.N     // Catch: java.lang.Exception -> La8
                long r0 = (long) r0     // Catch: java.lang.Exception -> La8
                r3.sendEmptyMessageDelayed(r4, r0)     // Catch: java.lang.Exception -> La8
                goto Lac
            La8:
                r3 = move-exception
                r3.printStackTrace()
            Lac:
                a.a.a.b.x r3 = a.a.a.b.x.b()
                r3.a()
                goto L108
            Lb4:
                a.a.a.g.a r3 = a.a.a.b.u.d()
                android.location.Location r4 = a.a.a.b.u.c()
                a.a.a.b.c r0 = a.a.a.b.c.h()
                java.lang.String r0 = r0.d()
                java.lang.String r1 = a.a.a.b.u.a()
                r2 = 0
                a.a.a.b.y.a(r3, r2, r4, r0, r1)
                goto L108
            Lcd:
                a.a.a.g.a r3 = a.a.a.b.u.d()
                a.a.a.g.f r4 = a.a.a.g.f.w()
                a.a.a.g.k r4 = r4.j()
                android.location.Location r0 = a.a.a.b.u.c()
                java.lang.String r1 = a.a.a.b.u.b()
                java.lang.String r2 = a.a.a.b.u.a()
                a.a.a.b.y.a(r3, r4, r0, r1, r2)
                goto L108
            Le9:
                android.os.Bundle r3 = r4.getData()
                java.lang.String r4 = "loc"
                android.os.Parcelable r4 = r3.getParcelable(r4)     // Catch: java.lang.Exception -> L104
                android.location.Location r4 = (android.location.Location) r4     // Catch: java.lang.Exception -> L104
                java.lang.String r0 = "satnum"
                r3.getInt(r0)     // Catch: java.lang.Exception -> L104
                if (r4 == 0) goto L108
                a.a.a.b.j r3 = a.a.a.b.j.k()     // Catch: java.lang.Exception -> L104
                r3.e(r4)     // Catch: java.lang.Exception -> L104
                goto L108
            L104:
                r3 = move-exception
                r3.printStackTrace()
            L108:
                return
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            a.a.a.b.z.d = r0
            return
    }

    public z() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f98c = r0
            return
    }

    public static /* synthetic */ android.os.Handler a(a.a.a.b.z r0) {
            android.os.Handler r0 = r0.f97b
            return r0
    }

    public static a.a.a.b.z f() {
            java.lang.Object r0 = a.a.a.b.z.d
            monitor-enter(r0)
            a.a.a.b.z r1 = a.a.a.b.z.e     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto Le
            a.a.a.b.z r1 = new a.a.a.b.z     // Catch: java.lang.Throwable -> L12
            r1.<init>()     // Catch: java.lang.Throwable -> L12
            a.a.a.b.z.e = r1     // Catch: java.lang.Throwable -> L12
        Le:
            a.a.a.b.z r1 = a.a.a.b.z.e     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return r1
        L12:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1
    }

    public void a() {
            r3 = this;
            boolean r0 = r3.f98c
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r3.f98c = r0
            android.os.HandlerThread r0 = r3.f96a
            if (r0 != 0) goto L29
            android.os.HandlerThread r0 = new android.os.HandlerThread
            java.lang.String r1 = "LocUploadThreadManager"
            r0.<init>(r1)
            r3.f96a = r0
            r0.start()
            android.os.HandlerThread r0 = r3.f96a
            if (r0 == 0) goto L29
            a.a.a.b.z$a r0 = new a.a.a.b.z$a
            android.os.HandlerThread r1 = r3.f96a
            android.os.Looper r1 = r1.getLooper()
            r0.<init>(r3, r1)
            r3.f97b = r0
        L29:
            android.os.Handler r0 = r3.f97b     // Catch: java.lang.Exception -> L36
            if (r0 == 0) goto L3a
            r1 = 5
            android.os.Message r0 = r0.obtainMessage(r1)     // Catch: java.lang.Exception -> L36
            r0.sendToTarget()     // Catch: java.lang.Exception -> L36
            goto L3a
        L36:
            r0 = move-exception
            r0.printStackTrace()
        L3a:
            android.os.Handler r3 = r3.f97b     // Catch: java.lang.Exception -> L46
            if (r3 == 0) goto L4a
            r0 = 4
            int r1 = a.a.a.i.i.N     // Catch: java.lang.Exception -> L46
            long r1 = (long) r1     // Catch: java.lang.Exception -> L46
            r3.sendEmptyMessageDelayed(r0, r1)     // Catch: java.lang.Exception -> L46
            goto L4a
        L46:
            r3 = move-exception
            r3.printStackTrace()
        L4a:
            return
    }

    @android.annotation.TargetApi(24)
    public void a(android.location.GnssNavigationMessage r3, long r4) {
            r2 = this;
            boolean r0 = r2.f98c
            if (r0 == 0) goto L2b
            if (r3 != 0) goto L7
            goto L2b
        L7:
            android.os.Handler r2 = r2.f97b     // Catch: java.lang.Exception -> L27
            if (r2 == 0) goto L2b
            r0 = 11
            android.os.Message r2 = r2.obtainMessage(r0)     // Catch: java.lang.Exception -> L27
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Exception -> L27
            r0.<init>()     // Catch: java.lang.Exception -> L27
            java.lang.String r1 = "gnss_navigation_message"
            r0.putParcelable(r1, r3)     // Catch: java.lang.Exception -> L27
            java.lang.String r3 = "gps_time"
            r0.putLong(r3, r4)     // Catch: java.lang.Exception -> L27
            r2.setData(r0)     // Catch: java.lang.Exception -> L27
            r2.sendToTarget()     // Catch: java.lang.Exception -> L27
            goto L2b
        L27:
            r2 = move-exception
            r2.printStackTrace()
        L2b:
            return
    }

    public void a(android.location.Location r4, int r5) {
            r3 = this;
            boolean r0 = r3.f98c
            if (r0 == 0) goto L2f
            if (r4 != 0) goto L7
            goto L2f
        L7:
            android.os.Handler r3 = r3.f97b     // Catch: java.lang.Exception -> L2b
            if (r3 == 0) goto L2f
            r0 = 1
            android.os.Message r3 = r3.obtainMessage(r0)     // Catch: java.lang.Exception -> L2b
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Exception -> L2b
            r0.<init>()     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = "loc"
            android.location.Location r2 = new android.location.Location     // Catch: java.lang.Exception -> L2b
            r2.<init>(r4)     // Catch: java.lang.Exception -> L2b
            r0.putParcelable(r1, r2)     // Catch: java.lang.Exception -> L2b
            java.lang.String r4 = "satnum"
            r0.putInt(r4, r5)     // Catch: java.lang.Exception -> L2b
            r3.setData(r0)     // Catch: java.lang.Exception -> L2b
            r3.sendToTarget()     // Catch: java.lang.Exception -> L2b
            goto L2f
        L2b:
            r3 = move-exception
            r3.printStackTrace()
        L2f:
            return
    }

    public void b() {
            r2 = this;
            boolean r0 = r2.f98c
            if (r0 != 0) goto L5
            return
        L5:
            a.a.a.b.j r0 = a.a.a.b.j.k()
            r0.i()
            r0 = 0
            android.os.Handler r1 = r2.f97b     // Catch: java.lang.Exception -> L15
            if (r1 == 0) goto L19
            r1.removeCallbacksAndMessages(r0)     // Catch: java.lang.Exception -> L15
            goto L19
        L15:
            r1 = move-exception
            r1.printStackTrace()
        L19:
            r2.f97b = r0
            android.os.HandlerThread r1 = r2.f96a     // Catch: java.lang.Exception -> L28
            if (r1 == 0) goto L2c
            r1.quit()     // Catch: java.lang.Exception -> L28
            android.os.HandlerThread r1 = r2.f96a     // Catch: java.lang.Exception -> L28
            r1.interrupt()     // Catch: java.lang.Exception -> L28
            goto L2c
        L28:
            r1 = move-exception
            r1.printStackTrace()
        L2c:
            r2.f96a = r0
            r0 = 0
            r2.f98c = r0
            return
    }

    public void c() {
            r1 = this;
            boolean r0 = r1.f98c
            if (r0 != 0) goto L5
            return
        L5:
            android.os.Handler r1 = r1.f97b     // Catch: java.lang.Exception -> L12
            if (r1 == 0) goto L16
            r0 = 7
            android.os.Message r1 = r1.obtainMessage(r0)     // Catch: java.lang.Exception -> L12
            r1.sendToTarget()     // Catch: java.lang.Exception -> L12
            goto L16
        L12:
            r1 = move-exception
            r1.printStackTrace()
        L16:
            return
    }

    public void d() {
            r1 = this;
            boolean r0 = r1.f98c
            if (r0 != 0) goto L5
            return
        L5:
            android.os.Handler r1 = r1.f97b     // Catch: java.lang.Exception -> L12
            if (r1 == 0) goto L16
            r0 = 3
            android.os.Message r1 = r1.obtainMessage(r0)     // Catch: java.lang.Exception -> L12
            r1.sendToTarget()     // Catch: java.lang.Exception -> L12
            goto L16
        L12:
            r1 = move-exception
            r1.printStackTrace()
        L16:
            return
    }

    public void e() {
            r1 = this;
            boolean r0 = r1.f98c
            if (r0 != 0) goto L5
            return
        L5:
            android.os.Handler r1 = r1.f97b     // Catch: java.lang.Exception -> L12
            if (r1 == 0) goto L16
            r0 = 2
            android.os.Message r1 = r1.obtainMessage(r0)     // Catch: java.lang.Exception -> L12
            r1.sendToTarget()     // Catch: java.lang.Exception -> L12
            goto L16
        L12:
            r1 = move-exception
            r1.printStackTrace()
        L16:
            return
    }
}
