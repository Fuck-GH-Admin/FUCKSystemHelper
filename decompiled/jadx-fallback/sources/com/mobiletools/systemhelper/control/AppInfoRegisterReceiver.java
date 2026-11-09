package com.mobiletools.systemhelper.control;

/* JADX INFO: loaded from: classes.dex */
public class AppInfoRegisterReceiver extends android.content.BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static android.content.Context f1397a;

    static {
            return
    }

    public AppInfoRegisterReceiver() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context r5, android.content.Intent r6) {
            r4 = this;
            com.mobiletools.systemhelper.control.AppInfoRegisterReceiver.f1397a = r5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "onReceive-->intent action: "
            r4.append(r0)
            java.lang.String r6 = r6.getAction()
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            java.lang.String r6 = "AppInfoRegisterReceiver"
            c.d.a.b.h.a(r6, r4)
            int r4 = android.os.Build.VERSION.SDK_INT
            r6 = 31
            if (r4 < r6) goto L25
            c.d.a.a.a.e(r5)
        L25:
            android.content.Context r4 = com.mobiletools.systemhelper.control.AppInfoRegisterReceiver.f1397a
            long r0 = c.d.a.b.l.d(r5)
            long r2 = c.d.a.b.l.c(r5)
            c.d.a.b.a.a(r4, r0, r2)
            c.d.a.a.n.c()
            c.d.a.a.n$c r4 = c.d.a.a.n.a(r5)
            if (r4 == 0) goto L42
            android.content.Context r4 = com.mobiletools.systemhelper.control.AppInfoRegisterReceiver.f1397a
            java.lang.String r5 = "A"
            com.mobiletools.systemhelper.control.b.a(r4, r5)
        L42:
            return
    }
}
