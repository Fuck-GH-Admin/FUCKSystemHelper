package c.d.a.a;

/* JADX INFO: loaded from: classes.dex */
public class l extends c.d.a.a.a {
    public l() {
            r0 = this;
            r0.<init>()
            return
    }

    private java.lang.String a(com.mobiletools.systemhelper.control.b r1) {
            r0 = this;
            java.lang.String r0 = r1.f1414b
            java.lang.String r1 = "2106118C"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L11
            java.lang.String r0 = "ro.build.hardware.version"
        Lc:
            java.lang.String r0 = c.d.a.b.l.a(r0)
            return r0
        L11:
            java.lang.String r0 = "ro.miui.cust_hardware"
            goto Lc
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
            java.lang.String r0 = "DeviceInfoReaderXiaomi"
            c.d.a.b.h.a(r0, r2)
            boolean r1 = r1.booleanValue()
            return r1
    }

    private java.lang.String g(android.content.Context r5) {
            r4 = this;
            android.content.ContentResolver r4 = r5.getContentResolver()
            java.lang.String r5 = "miui_version_name"
            java.lang.String r4 = android.provider.Settings.Global.getString(r4, r5)
            java.lang.String r5 = "ro.build.version.incremental"
            java.lang.String r5 = c.d.a.b.l.a(r5)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 1
            if (r0 != 0) goto L26
            int r0 = r4.length()
            if (r0 <= r1) goto L26
            java.lang.String r5 = "\r|\n"
            java.lang.String r0 = ""
            java.lang.String r5 = r4.replaceAll(r5, r0)
            goto L71
        L26:
            if (r5 == 0) goto L71
            int r4 = r5.length()
            if (r4 == 0) goto L71
            java.lang.String r4 = "."
            int r0 = r5.lastIndexOf(r4)
            java.lang.String r2 = r5.substring(r1, r0)
            int r3 = r2.indexOf(r4)
            int r3 = r3 + r1
            int r3 = r2.indexOf(r4, r3)
            int r3 = r3 + r1
            int r4 = r2.indexOf(r4, r3)
            r3 = 0
            java.lang.String r4 = r2.substring(r3, r4)
            int r0 = r0 + r1
            java.lang.String r5 = r5.substring(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "MIUI "
            r0.append(r1)
            r0.append(r4)
            r0.append(r2)
            java.lang.String r4 = "("
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = ")"
            r0.append(r4)
            java.lang.String r5 = r0.toString()
        L71:
            return r5
    }

    @Override // c.d.a.a.a, c.d.a.a.n.c
    public void a(android.content.Context r4, com.mobiletools.systemhelper.control.b r5) {
            r3 = this;
            super.a(r4, r5)
            boolean r0 = r3.d(r4)
            c.d.a.b.d.e = r0
            if (r0 == 0) goto L4f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "GlobalSetting.isUserPermissionOpen"
            r0.append(r1)
            boolean r1 = c.d.a.b.d.e
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "DeviceInfoReaderXiaomi"
            c.d.a.b.h.a(r1, r0)
            java.lang.String r0 = r3.a(r5)
            r5.f1415c = r0
            java.lang.String r0 = r3.g(r4)
            r5.d = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r0 < r2) goto L39
            r3.b(r4, r5)
            goto L4f
        L39:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unsupported API:"
            r3.append(r4)
            int r4 = android.os.Build.VERSION.SDK_INT
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            c.d.a.b.h.b(r1, r3)
        L4f:
            return
    }
}
