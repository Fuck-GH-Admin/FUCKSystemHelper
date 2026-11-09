package com.mobiletools.systemhelper.service;

/* JADX INFO: loaded from: classes.dex */
public class RegisterIntentService extends android.app.IntentService {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.content.Context f1426b;

    class a implements android.content.ServiceConnection {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(android.content.ComponentName r1, android.os.IBinder r2) {
                r0 = this;
                java.lang.String r0 = "RegisterIntentService"
                java.lang.String r1 = "onServiceConnected-->"
                c.d.a.b.h.a(r0, r1)
                c.c.a.a r0 = c.c.a.a.AbstractBinderC0054a.a(r2)
                c.d.a.b.d.w = r0
                return
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(android.content.ComponentName r1) {
                r0 = this;
                java.lang.String r0 = "RegisterIntentService"
                java.lang.String r1 = "onServiceDisconnected-->"
                c.d.a.b.h.a(r0, r1)
                r0 = 0
                c.d.a.b.d.w = r0
                return
        }
    }

    static {
            com.mobiletools.systemhelper.service.RegisterIntentService$a r0 = new com.mobiletools.systemhelper.service.RegisterIntentService$a
            r0.<init>()
            return
    }

    public RegisterIntentService() {
            r1 = this;
            java.lang.String r0 = "RegisterIntentService"
            r1.<init>(r0)
            r0 = 0
            r1.f1426b = r0
            return
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
            r2 = this;
            super.onCreate()
            java.lang.String r0 = "RegisterIntentService"
            java.lang.String r1 = "RegisterIntentService onCreate-->"
            c.d.a.b.h.a(r0, r1)
            android.content.Context r0 = r2.getApplicationContext()
            r2.f1426b = r0
            c.d.a.a.n.c()
            android.content.Context r2 = r2.f1426b
            c.d.a.a.n.a(r2)
            return
    }

    @Override // android.app.IntentService, android.app.Service
    public void onDestroy() {
            r0 = this;
            super.onDestroy()
            return
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(android.content.Intent r2) {
            r1 = this;
            java.lang.String r0 = "RegType"
            r2.getStringExtra(r0)
            android.content.Context r1 = r1.f1426b
            c.d.a.a.n.a(r1)
            return
    }
}
