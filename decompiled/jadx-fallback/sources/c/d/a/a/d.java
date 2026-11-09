package c.d.a.a;

/* JADX INFO: loaded from: classes.dex */
public class d extends c.d.a.a.a {
    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    private boolean d(android.content.Context r2) {
            r1 = this;
            android.content.ContentResolver r1 = r2.getContentResolver()
            r2 = 0
            java.lang.String r0 = "device_provisioned"
            int r1 = android.provider.Settings.Global.getInt(r1, r0, r2)
            r0 = 1
            if (r1 != r0) goto Lf
            r2 = r0
        Lf:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "isBootWizardCompleted: "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "DeviceInfoReaderOPPO"
            c.d.a.b.h.a(r0, r2)
            boolean r1 = r1.booleanValue()
            return r1
    }

    @Override // c.d.a.a.a, c.d.a.a.n.c
    public void a(android.content.Context r4, com.mobiletools.systemhelper.control.b r5) {
            r3 = this;
            super.a(r4, r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DeviceInfoReaderOPPO module:"
            r0.append(r1)
            java.lang.String r1 = android.os.Build.MODEL
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "DeviceInfoReaderOPPO"
            c.d.a.b.h.a(r1, r0)
            java.lang.String r0 = "ro.build.hardware.version"
            java.lang.String r0 = c.d.a.b.l.a(r0)
            r5.f1415c = r0
            boolean r0 = r3.d(r4)
            c.d.a.b.d.e = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "GlobalSetting.isUserPermissionOpen"
            r0.append(r2)
            boolean r2 = c.d.a.b.d.e
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            c.d.a.b.h.a(r1, r0)
            boolean r0 = c.d.a.b.d.e
            if (r0 != 0) goto L49
            java.lang.String r3 = "isUserPermissionOpen==false, do not read!"
            c.d.a.b.h.b(r1, r3)
            return
        L49:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r0 < r2) goto L53
            r3.b(r4, r5)
            goto L69
        L53:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unsupported API:"
            r3.append(r4)
            int r4 = android.os.Build.VERSION.SDK_INT
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            c.d.a.b.h.b(r1, r3)
        L69:
            return
    }
}
