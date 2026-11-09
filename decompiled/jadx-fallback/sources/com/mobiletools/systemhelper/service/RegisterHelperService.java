package com.mobiletools.systemhelper.service;

/* JADX INFO: loaded from: classes.dex */
public class RegisterHelperService extends android.app.Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.content.Context f1424b;

    class a extends com.mobiletools.systemhelper.service.a.AbstractBinderC0057a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mobiletools.systemhelper.service.RegisterHelperService f1425a;

        a(com.mobiletools.systemhelper.service.RegisterHelperService r1) {
                r0 = this;
                r0.f1425a = r1
                r0.<init>()
                return
        }

        @Override // com.mobiletools.systemhelper.service.a
        public void a(int r4) {
                r3 = this;
                com.mobiletools.systemhelper.service.RegisterHelperService r0 = r3.f1425a
                android.content.Context r0 = com.mobiletools.systemhelper.service.RegisterHelperService.a(r0)
                long r1 = (long) r4
                c.d.a.b.l.e(r0, r1)
                com.mobiletools.systemhelper.service.RegisterHelperService r0 = r3.f1425a
                android.content.Context r0 = com.mobiletools.systemhelper.service.RegisterHelperService.a(r0)
                int r1 = r4 * 8
                int r1 = r1 / 5
                long r1 = (long) r1
                c.d.a.b.l.a(r0, r1)
                com.mobiletools.systemhelper.service.RegisterHelperService r0 = r3.f1425a
                android.content.Context r0 = com.mobiletools.systemhelper.service.RegisterHelperService.a(r0)
                int r1 = r4 * 4
                int r1 = r1 / 5
                long r1 = (long) r1
                c.d.a.b.l.c(r0, r1)
                com.mobiletools.systemhelper.service.RegisterHelperService r0 = r3.f1425a
                android.content.Context r0 = com.mobiletools.systemhelper.service.RegisterHelperService.a(r0)
                c.d.a.b.l.b(r0, r1)
                com.mobiletools.systemhelper.service.RegisterHelperService r0 = r3.f1425a
                android.content.Context r0 = com.mobiletools.systemhelper.service.RegisterHelperService.a(r0)
                c.d.a.b.l.d(r0, r1)
                com.mobiletools.systemhelper.service.RegisterHelperService r0 = r3.f1425a
                android.content.Context r0 = com.mobiletools.systemhelper.service.RegisterHelperService.a(r0)
                int r1 = r4 * 6
                int r1 = r1 / 5
                long r1 = (long) r1
                c.d.a.b.l.f(r0, r1)
                com.mobiletools.systemhelper.service.RegisterHelperService r3 = r3.f1425a
                android.content.Context r3 = com.mobiletools.systemhelper.service.RegisterHelperService.a(r3)
                int r4 = r4 * 3
                int r4 = r4 / 5
                long r0 = (long) r4
                c.d.a.b.l.g(r3, r0)
                return
        }

        @Override // com.mobiletools.systemhelper.service.a
        public void a(java.lang.String r1) {
                r0 = this;
                com.mobiletools.systemhelper.service.RegisterHelperService r0 = r0.f1425a
                android.content.Context r0 = com.mobiletools.systemhelper.service.RegisterHelperService.a(r0)
                c.d.a.b.l.a(r0, r1)
                return
        }

        @Override // com.mobiletools.systemhelper.service.a
        public void a(boolean r2) {
                r1 = this;
                c.d.a.b.d.f1331a = r2
                com.mobiletools.systemhelper.service.RegisterHelperService r1 = r1.f1425a
                android.content.Context r1 = com.mobiletools.systemhelper.service.RegisterHelperService.a(r1)
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                java.lang.String r0 = "preference_enable_log"
                c.d.a.b.l.b(r1, r0, r2)
                return
        }

        @Override // com.mobiletools.systemhelper.service.a
        public boolean a() {
                r2 = this;
                com.mobiletools.systemhelper.service.RegisterHelperService r2 = r2.f1425a
                android.content.Context r2 = com.mobiletools.systemhelper.service.RegisterHelperService.a(r2)
                r0 = 0
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                java.lang.String r1 = "preference_enable_log"
                java.lang.Boolean r2 = c.d.a.b.l.a(r2, r1, r0)
                boolean r2 = r2.booleanValue()
                return r2
        }

        @Override // com.mobiletools.systemhelper.service.a
        public void b() {
                r0 = this;
                com.mobiletools.systemhelper.service.RegisterHelperService r0 = r0.f1425a
                android.content.Context r0 = com.mobiletools.systemhelper.service.RegisterHelperService.a(r0)
                c.d.a.b.l.b(r0)
                return
        }
    }

    public RegisterHelperService() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f1424b = r0
            return
    }

    static /* synthetic */ android.content.Context a(com.mobiletools.systemhelper.service.RegisterHelperService r0) {
            android.content.Context r0 = r0.f1424b
            return r0
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent r2) {
            r1 = this;
            java.lang.String r2 = "RegisterHelperService"
            java.lang.String r0 = "registerhelper Service onBind sucessed!"
            c.d.a.b.h.b(r2, r0)
            com.mobiletools.systemhelper.service.RegisterHelperService$a r2 = new com.mobiletools.systemhelper.service.RegisterHelperService$a
            r2.<init>(r1)
            return r2
    }

    @Override // android.app.Service
    public void onCreate() {
            r2 = this;
            java.lang.String r0 = "RegisterHelperService"
            java.lang.String r1 = "registerhelper Service onCreate-->"
            c.d.a.b.h.b(r0, r1)
            android.content.Context r0 = r2.getApplicationContext()
            r2.f1424b = r0
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r2 < r1) goto L16
            c.d.a.a.a.e(r0)
        L16:
            return
    }

    @Override // android.app.Service
    public void onDestroy() {
            r2 = this;
            java.lang.String r0 = "RegisterHelperService"
            java.lang.String r1 = "registerhelper Service onDestroy--->"
            c.d.a.b.h.b(r0, r1)
            super.onDestroy()
            return
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent r1) {
            r0 = this;
            super.onUnbind(r1)
            java.lang.String r0 = "RegisterHelperService"
            java.lang.String r1 = "registerhelper Service onUnbind sucessed!"
            c.d.a.b.h.b(r0, r1)
            r0 = 1
            return r0
    }
}
