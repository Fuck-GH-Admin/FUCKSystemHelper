package com.baidu.location;

/* JADX INFO: loaded from: classes.dex */
public class f extends android.app.Service {
    public static android.content.Context e = null;
    public static boolean f = false;
    public static boolean g = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.baidu.location.g f1360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.baidu.location.g f1361c;
    public com.baidu.location.g d;

    static {
            return
    }

    public f() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f1360b = r0
            r1.f1361c = r0
            r1.d = r0
            return
    }

    public static float a() {
            r0 = 1092113924(0x41185604, float:9.521)
            return r0
    }

    public static java.lang.String b() {
            java.lang.String r0 = "app.jar"
            return r0
    }

    public static android.content.Context c() {
            android.content.Context r0 = com.baidu.location.f.e
            return r0
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent r1) {
            r0 = this;
            com.baidu.location.g r0 = r0.d
            if (r0 == 0) goto L9
            android.os.IBinder r0 = r0.onBind(r1)
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // android.app.Service
    @android.annotation.SuppressLint({"NewApi"})
    public void onCreate() {
            r6 = this;
            boolean r0 = com.baidu.location.f.f
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "baidu location service can not start again ...20190306..."
            r6.append(r0)
            int r0 = android.os.Process.myPid()
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.String r0 = "baidu_location_service"
            android.util.Log.d(r0, r6)
            return
        L1f:
            android.content.Context r0 = r6.getApplicationContext()
            com.baidu.location.f.e = r0
            java.lang.System.currentTimeMillis()
            a.a.a.h.a r0 = new a.a.a.h.a
            r0.<init>()
            r6.f1361c = r0
            com.baidu.location.g r0 = r6.f1360b
            r1 = 0
            if (r0 == 0) goto L49
            double r2 = r0.a()
            com.baidu.location.g r0 = r6.f1361c
            double r4 = r0.a()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L49
            com.baidu.location.g r0 = r6.f1360b
            r6.d = r0
            r6.f1361c = r1
            goto L4f
        L49:
            com.baidu.location.g r0 = r6.f1361c
            r6.d = r0
            r6.f1360b = r1
        L4f:
            r0 = 1
            com.baidu.location.f.f = r0
            com.baidu.location.g r0 = r6.d
            r0.a(r6)
            return
    }

    @Override // android.app.Service
    public void onDestroy() {
            r1 = this;
            r0 = 0
            com.baidu.location.f.f = r0
            com.baidu.location.g r0 = r1.d
            if (r0 == 0) goto La
            r0.onDestroy()
        La:
            boolean r0 = com.baidu.location.f.g
            if (r0 == 0) goto L12
            r0 = 1
            r1.stopForeground(r0)
        L12:
            return
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent r5, int r6, int r7) {
            r4 = this;
            r0 = 2
            if (r5 == 0) goto L33
            java.lang.String r1 = "command"
            r2 = 0
            int r1 = r5.getIntExtra(r1, r2)     // Catch: java.lang.Exception -> L2f
            r3 = 1
            if (r1 != r3) goto L21
            java.lang.String r1 = "id"
            int r1 = r5.getIntExtra(r1, r2)     // Catch: java.lang.Exception -> L2f
            java.lang.String r2 = "notification"
            android.os.Parcelable r2 = r5.getParcelableExtra(r2)     // Catch: java.lang.Exception -> L2f
            android.app.Notification r2 = (android.app.Notification) r2     // Catch: java.lang.Exception -> L2f
            r4.startForeground(r1, r2)     // Catch: java.lang.Exception -> L2f
            com.baidu.location.f.g = r3     // Catch: java.lang.Exception -> L2f
            goto L33
        L21:
            if (r1 != r0) goto L33
            java.lang.String r1 = "removenotify"
            boolean r1 = r5.getBooleanExtra(r1, r3)     // Catch: java.lang.Exception -> L2f
            r4.stopForeground(r1)     // Catch: java.lang.Exception -> L2f
            com.baidu.location.f.g = r2     // Catch: java.lang.Exception -> L2f
            goto L33
        L2f:
            r1 = move-exception
            r1.printStackTrace()
        L33:
            com.baidu.location.g r4 = r4.d
            if (r4 != 0) goto L38
            return r0
        L38:
            int r4 = r4.onStartCommand(r5, r6, r7)
            return r4
    }

    @Override // android.app.Service
    public void onTaskRemoved(android.content.Intent r1) {
            r0 = this;
            com.baidu.location.g r0 = r0.d
            if (r0 == 0) goto L7
            r0.onTaskRemoved(r1)
        L7:
            return
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent r1) {
            r0 = this;
            r0 = 0
            return r0
    }
}
