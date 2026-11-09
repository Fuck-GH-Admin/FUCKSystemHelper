package com.mobiletools.systemhelper.control;

/* JADX INFO: loaded from: classes.dex */
public class ConnectStateReceiver extends android.content.BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static android.content.Context f1398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static com.mobiletools.systemhelper.control.ConnectStateReceiver f1399b;

    static {
            return
    }

    public ConnectStateReceiver() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a() {
            com.mobiletools.systemhelper.control.ConnectStateReceiver r0 = com.mobiletools.systemhelper.control.ConnectStateReceiver.f1399b
            if (r0 == 0) goto L16
            android.content.Context r1 = com.mobiletools.systemhelper.control.ConnectStateReceiver.f1398a
            r1.unregisterReceiver(r0)
            java.lang.String r0 = "ConnectStateReceiver"
            java.lang.String r1 = "ConnectStateReceiver cancel watch-->"
            c.d.a.b.h.a(r0, r1)
            r0 = 0
            com.mobiletools.systemhelper.control.ConnectStateReceiver.f1399b = r0
            r0 = 0
            c.d.a.b.d.k = r0
        L16:
            return
    }

    public void a(android.content.Context r2) {
            r1 = this;
            com.mobiletools.systemhelper.control.ConnectStateReceiver.f1398a = r2
            a()
            r2 = 1
            c.d.a.b.d.k = r2
            com.mobiletools.systemhelper.control.ConnectStateReceiver.f1399b = r1
            java.lang.String r2 = "ConnectStateReceiver"
            java.lang.String r0 = "ConnectStateReceiver startWatch-->"
            c.d.a.b.h.a(r2, r0)
            android.content.IntentFilter r2 = new android.content.IntentFilter
            r2.<init>()
            java.lang.String r0 = "android.net.conn.CONNECTIVITY_CHANGE"
            r2.addAction(r0)
            android.content.Context r0 = com.mobiletools.systemhelper.control.ConnectStateReceiver.f1398a
            r0.registerReceiver(r1, r2)
            return
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context r1, android.content.Intent r2) {
            r0 = this;
            com.mobiletools.systemhelper.control.ConnectStateReceiver.f1398a = r1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onReceive-->intent action: "
            r0.append(r1)
            java.lang.String r1 = r2.getAction()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ConnectStateReceiver"
            c.d.a.b.h.a(r1, r0)
            boolean r0 = c.d.a.b.d.k
            if (r0 == 0) goto L24
            r0 = 0
            c.d.a.b.d.k = r0
            return
        L24:
            java.lang.String r0 = r2.getAction()
            if (r0 == 0) goto L46
            java.lang.String r2 = "android.net.conn.CONNECTIVITY_CHANGE"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L46
            android.content.Context r0 = com.mobiletools.systemhelper.control.ConnectStateReceiver.f1398a
            java.lang.Boolean r0 = c.d.a.b.l.k(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L41
            java.lang.String r0 = "NetWork disconnected"
            goto L43
        L41:
            java.lang.String r0 = "NetWork connected"
        L43:
            c.d.a.b.h.a(r1, r0)
        L46:
            return
    }
}
