package com.mobiletools.systemhelper.control;

/* JADX INFO: loaded from: classes.dex */
public class SIMStateReceiver extends android.content.BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static android.content.Context f1406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static com.mobiletools.systemhelper.control.SIMStateReceiver f1407b;

    static {
            return
    }

    public SIMStateReceiver() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a() {
            com.mobiletools.systemhelper.control.SIMStateReceiver r0 = com.mobiletools.systemhelper.control.SIMStateReceiver.f1407b
            if (r0 == 0) goto L16
            android.content.Context r1 = com.mobiletools.systemhelper.control.SIMStateReceiver.f1406a
            r1.unregisterReceiver(r0)
            java.lang.String r0 = "SIMStateReceiver"
            java.lang.String r1 = "SimStateReceiver cancel watch-->"
            c.d.a.b.h.a(r0, r1)
            r0 = 0
            com.mobiletools.systemhelper.control.SIMStateReceiver.f1407b = r0
            r0 = 0
            c.d.a.b.d.j = r0
        L16:
            return
    }

    public void a(android.content.Context r2) {
            r1 = this;
            com.mobiletools.systemhelper.control.SIMStateReceiver.f1406a = r2
            a()
            r2 = 1
            c.d.a.b.d.j = r2
            com.mobiletools.systemhelper.control.SIMStateReceiver.f1407b = r1
            java.lang.String r2 = "SIMStateReceiver"
            java.lang.String r0 = "SimStateReceiver startWatch-->"
            c.d.a.b.h.a(r2, r0)
            android.content.IntentFilter r2 = new android.content.IntentFilter
            r2.<init>()
            java.lang.String r0 = "android.intent.action.SIM_STATE_CHANGED"
            r2.addAction(r0)
            android.content.Context r0 = com.mobiletools.systemhelper.control.SIMStateReceiver.f1406a
            r0.registerReceiver(r1, r2)
            return
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context r3, android.content.Intent r4) {
            r2 = this;
            com.mobiletools.systemhelper.control.SIMStateReceiver.f1406a = r3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "onReceive-->intent action: "
            r2.append(r0)
            java.lang.String r0 = r4.getAction()
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "SIMStateReceiver"
            c.d.a.b.h.a(r0, r2)
            boolean r2 = c.d.a.b.d.j
            if (r2 == 0) goto L24
            r2 = 0
            c.d.a.b.d.j = r2
            return
        L24:
            java.lang.String r2 = r4.getAction()
            if (r2 == 0) goto L78
            java.lang.String r4 = "android.intent.action.SIM_STATE_CHANGED"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L78
            java.lang.String r2 = "phone"
            java.lang.Object r2 = r3.getSystemService(r2)
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2
            int r2 = r2.getSimState()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "SIM_STATE_CHANGED, state:"
            r4.append(r1)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            c.d.a.b.h.a(r0, r4)
            if (r2 == 0) goto L5e
            r4 = 1
            if (r2 == r4) goto L61
            r4 = 5
            if (r2 == r4) goto L67
            r4 = 6
            if (r2 == r4) goto L64
            goto L78
        L5e:
            c.d.a.a.a.f(r3)
        L61:
            c.d.a.a.a.f(r3)
        L64:
            c.d.a.a.a.f(r3)
        L67:
            c.d.a.a.a.e(r3)
            java.lang.String r2 = "wait for sim ready for 6 minutes-->"
            c.d.a.b.h.a(r0, r2)
            android.content.Context r2 = com.mobiletools.systemhelper.control.SIMStateReceiver.f1406a
            r3 = 180000(0x2bf20, double:8.8932E-319)
            c.d.a.b.a.c(r2, r3)
            return
        L78:
            c.d.a.a.n.c()
            c.d.a.a.n$c r2 = c.d.a.a.n.a(r3)
            if (r2 == 0) goto L8b
            android.content.Context r2 = com.mobiletools.systemhelper.control.SIMStateReceiver.f1406a
            java.lang.String r4 = "T"
            com.mobiletools.systemhelper.control.b.a(r2, r4)
            c.d.a.a.a.f(r3)
        L8b:
            return
    }
}
