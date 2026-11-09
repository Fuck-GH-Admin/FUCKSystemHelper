package com.mobiletools.systemhelper.control;

/* JADX INFO: loaded from: classes.dex */
public class DMApplication extends android.app.Application {
    public DMApplication() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.app.Application
    public void onCreate() {
            r2 = this;
            super.onCreate()
            java.lang.String r0 = "DMApplication"
            java.lang.String r1 = "onCreate--->"
            c.d.a.b.h.a(r0, r1)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L13
            c.d.a.a.a.e(r2)
        L13:
            return
    }

    @Override // android.app.Application
    public void onTerminate() {
            r1 = this;
            super.onTerminate()
            java.lang.String r1 = "DMApplication"
            java.lang.String r0 = "onTerminate--->"
            c.d.a.b.h.a(r1, r0)
            return
    }
}
