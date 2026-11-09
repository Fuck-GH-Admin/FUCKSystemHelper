package com.mobiletools.systemhelper.control;

/* JADX INFO: loaded from: classes.dex */
public class OnBootReceiver extends android.content.BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static android.content.Context f1405a;

    static {
            return
    }

    public OnBootReceiver() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context r5, android.content.Intent r6) {
            r4 = this;
            com.mobiletools.systemhelper.control.OnBootReceiver.f1405a = r5
            boolean r4 = c.d.a.b.d.f1332b
            if (r4 != 0) goto L17
            r4 = 0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.String r0 = "preference_enable_log"
            java.lang.Boolean r4 = c.d.a.b.l.a(r5, r0, r4)
            boolean r4 = r4.booleanValue()
            c.d.a.b.d.f1331a = r4
        L17:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "onReceive-->intent action: "
            r4.append(r0)
            java.lang.String r0 = r6.getAction()
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "OnBootReceiver"
            c.d.a.b.h.a(r0, r4)
            c.d.a.a.a.e(r5)
            java.lang.String r4 = r6.getAction()
            if (r4 == 0) goto L88
            java.lang.String r6 = "android.intent.action.BOOT_COMPLETED"
            boolean r6 = r4.equals(r6)
            if (r6 != 0) goto L4a
            java.lang.String r6 = "android.intent.action.QUICKBOOT_POWERON"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L88
        L4a:
            java.lang.String r4 = " boot delayed for 4 minutes-->"
            c.d.a.b.h.a(r0, r4)
            android.content.Context r4 = com.mobiletools.systemhelper.control.OnBootReceiver.f1405a
            r0 = 240000(0x3a980, double:1.18576E-318)
            c.d.a.b.a.a(r4, r0)
            android.content.Context r4 = com.mobiletools.systemhelper.control.OnBootReceiver.f1405a
            long r0 = c.d.a.b.l.j(r5)
            c.d.a.b.a.b(r4, r0)
            android.content.Context r4 = com.mobiletools.systemhelper.control.OnBootReceiver.f1405a
            long r0 = c.d.a.b.l.f(r5)
            long r2 = c.d.a.b.l.i(r5)
            c.d.a.b.a.c(r4, r0, r2)
            android.content.Context r4 = com.mobiletools.systemhelper.control.OnBootReceiver.f1405a
            long r0 = c.d.a.b.l.e(r5)
            long r2 = c.d.a.b.l.g(r5)
            c.d.a.b.a.b(r4, r0, r2)
            android.content.Context r4 = com.mobiletools.systemhelper.control.OnBootReceiver.f1405a
            long r0 = c.d.a.b.l.d(r5)
            long r5 = c.d.a.b.l.c(r5)
            c.d.a.b.a.a(r4, r0, r5)
            return
        L88:
            java.lang.String r4 = "phone"
            java.lang.Object r4 = r5.getSystemService(r4)
            android.telephony.TelephonyManager r4 = (android.telephony.TelephonyManager) r4
            int r4 = r4.getSimState()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "SIM_STATE_CHANGED, state:"
            r6.append(r1)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            c.d.a.b.h.a(r0, r4)
            com.mobiletools.systemhelper.control.SIMStateReceiver r4 = new com.mobiletools.systemhelper.control.SIMStateReceiver
            r4.<init>()
            android.content.Context r6 = com.mobiletools.systemhelper.control.OnBootReceiver.f1405a
            android.content.Context r6 = r6.getApplicationContext()
            r4.a(r6)
            com.mobiletools.systemhelper.control.ConnectStateReceiver r4 = new com.mobiletools.systemhelper.control.ConnectStateReceiver
            r4.<init>()
            android.content.Context r6 = com.mobiletools.systemhelper.control.OnBootReceiver.f1405a
            android.content.Context r6 = r6.getApplicationContext()
            r4.a(r6)
            c.d.a.a.n.c()
            c.d.a.a.n$c r4 = c.d.a.a.n.a(r5)
            if (r4 == 0) goto Lf0
            java.lang.String r4 = "firstPowerOn"
            java.lang.String r6 = ""
            java.lang.String r6 = c.d.a.b.l.a(r5, r4, r6)
            if (r6 == 0) goto Le6
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto Lde
            goto Le6
        Lde:
            android.content.Context r4 = com.mobiletools.systemhelper.control.OnBootReceiver.f1405a
            java.lang.String r5 = "B"
            com.mobiletools.systemhelper.control.b.a(r4, r5)
            goto Lf0
        Le6:
            android.content.Context r6 = com.mobiletools.systemhelper.control.OnBootReceiver.f1405a
            java.lang.String r0 = "F"
            com.mobiletools.systemhelper.control.b.a(r6, r0)
            c.d.a.b.l.b(r5, r4, r4)
        Lf0:
            return
    }
}
