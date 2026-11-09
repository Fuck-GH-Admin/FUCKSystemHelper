package com.mobiletools.systemhelper.Activity;

/* JADX INFO: loaded from: classes.dex */
public class TestActivity extends android.support.v7.app.c {
    private android.widget.TextView q;

    public TestActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    private void l() {
            r2 = this;
            r0 = 2131165391(0x7f0700cf, float:1.7944998E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.q = r0
            c.d.a.a.n.c()
            c.d.a.a.n$c r0 = c.d.a.a.n.a(r2)
            java.lang.String r1 = ""
            if (r0 == 0) goto L22
            android.content.Context r0 = r2.getApplicationContext()
            com.mobiletools.systemhelper.control.b r0 = com.mobiletools.systemhelper.control.b.a(r0, r1)
            java.lang.String r1 = r0.a()
        L22:
            android.widget.TextView r2 = r2.q
            r2.setText(r1)
            return
    }

    @Override // android.support.v7.app.c, android.support.v4.app.f, android.support.v4.app.x, android.app.Activity
    protected void onCreate(android.os.Bundle r6) {
            r5 = this;
            super.onCreate(r6)
            r6 = 2131296284(0x7f09001c, float:1.821048E38)
            r5.setContentView(r6)
            boolean r6 = c.d.a.b.d.f1332b
            if (r6 != 0) goto L1e
            r6 = 0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            java.lang.String r0 = "preference_enable_log"
            java.lang.Boolean r6 = c.d.a.b.l.a(r5, r0, r6)
            boolean r6 = r6.booleanValue()
            c.d.a.b.d.f1331a = r6
        L1e:
            int r6 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r6 < r0) goto L27
            c.d.a.a.a.e(r5)
        L27:
            java.lang.String r6 = "android.permission.READ_PHONE_STATE"
            int r0 = b.b.c.a.a.a(r5, r6)
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            java.lang.String r2 = "android.permission.ACCESS_BACKGROUND_LOCATION"
            java.lang.String r3 = "android.permission.ACCESS_FINE_LOCATION"
            java.lang.String r4 = "android.permission.ACCESS_COARSE_LOCATION"
            if (r0 != 0) goto L54
            int r0 = b.b.c.a.a.a(r5, r4)
            if (r0 != 0) goto L54
            int r0 = b.b.c.a.a.a(r5, r3)
            if (r0 != 0) goto L54
            int r0 = b.b.c.a.a.a(r5, r2)
            if (r0 != 0) goto L54
            int r0 = b.b.c.a.a.a(r5, r1)
            if (r0 == 0) goto L50
            goto L54
        L50:
            r5.l()
            goto L5c
        L54:
            java.lang.String[] r6 = new java.lang.String[]{r6, r4, r3, r2, r1}
            r0 = 1
            android.support.v4.app.a.a(r5, r6, r0)
        L5c:
            return
    }

    @Override // android.support.v4.app.f, android.app.Activity, android.support.v4.app.a.b
    public void onRequestPermissionsResult(int r2, java.lang.String[] r3, int[] r4) {
            r1 = this;
            r3 = 1
            if (r2 == r3) goto L4
            return
        L4:
            int r2 = r4.length
            r0 = 3
            if (r2 != r0) goto L1a
            r2 = 0
            r2 = r4[r2]
            if (r2 != 0) goto L1a
            r2 = r4[r3]
            if (r2 != 0) goto L1a
            r2 = 2
            r2 = r4[r2]
            if (r2 != 0) goto L1a
            r1.l()
            goto L1d
        L1a:
            r1.finish()
        L1d:
            return
    }
}
