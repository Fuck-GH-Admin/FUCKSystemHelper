package c.d.a.a;

/* JADX INFO: loaded from: classes.dex */
public class j extends c.d.a.a.a {
    public j() {
            r0 = this;
            r0.<init>()
            return
    }

    private java.lang.String b() {
            r1 = this;
            java.lang.String r1 = "ro.vivo.hardware_version"
            java.lang.String r1 = c.d.a.b.l.a(r1)
            if (r1 == 0) goto Lf
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Lf
            return r1
        Lf:
            java.lang.String r1 = "MP_0.1"
            return r1
    }

    private java.lang.String c() {
            r0 = this;
            boolean r0 = r0.d()
            if (r0 == 0) goto Ld
            java.lang.String r0 = "ro.vivo.op.entry.version"
        L8:
            java.lang.String r0 = c.d.a.b.l.a(r0)
            return r0
        Ld:
            java.lang.String r0 = "ro.vivo.product.version"
            goto L8
    }

    private boolean d() {
            r2 = this;
            java.lang.String r2 = "ro.vivo.op.entry"
            java.lang.String r2 = c.d.a.b.l.a(r2)
            java.lang.String r2 = r2.toUpperCase()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "isUnicomEntry-->opEntry:"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "DeviceInfoReaderVIVO"
            c.d.a.b.h.a(r1, r0)
            java.lang.String r0 = "UNICOM"
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L2a
            r2 = 1
            return r2
        L2a:
            r2 = 0
            return r2
    }

    @Override // c.d.a.a.a, c.d.a.a.n.c
    public void a(android.content.Context r4, com.mobiletools.systemhelper.control.b r5) {
            r3 = this;
            super.a(r4, r5)
            boolean r0 = r3.d(r4)
            c.d.a.b.d.e = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "GlobalSetting.isUserPermissionOpen"
            r0.append(r1)
            boolean r1 = c.d.a.b.d.e
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "DeviceInfoReaderVIVO"
            c.d.a.b.h.a(r1, r0)
            boolean r0 = c.d.a.b.d.e
            if (r0 != 0) goto L2b
            java.lang.String r3 = "isUserPermissionOpen==false, do not read!"
            c.d.a.b.h.b(r1, r3)
            return
        L2b:
            java.lang.String r0 = r3.b()
            r5.f1415c = r0
            java.lang.String r0 = r3.c()
            r5.d = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r0 < r2) goto L46
            java.lang.String r0 = "enter DeviceInfoReaderVIVO read vivo"
            c.d.a.b.h.a(r1, r0)
            r3.c(r4, r5)
            goto L5c
        L46:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unsupported API:"
            r3.append(r4)
            int r4 = android.os.Build.VERSION.SDK_INT
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            c.d.a.b.h.b(r1, r3)
        L5c:
            return
    }

    protected boolean d(android.content.Context r5) {
            r4 = this;
            android.content.ContentResolver r4 = r5.getContentResolver()
            r0 = 0
            java.lang.String r1 = "device_provisioned"
            int r4 = android.provider.Settings.Global.getInt(r4, r1, r0)
            r1 = 1
            if (r4 != r1) goto L10
            r4 = r1
            goto L11
        L10:
            r4 = r0
        L11:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "isBootWizardCompleted: "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "DeviceInfoReaderVIVO"
            c.d.a.b.h.a(r3, r2)
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L52
            android.content.ContentResolver r4 = r5.getContentResolver()
            java.lang.String r5 = "operator_service_improve_plan"
            int r4 = android.provider.Settings.Secure.getInt(r4, r5, r0)
            if (r4 != r1) goto L3e
            r0 = r1
        L3e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "checkUserPermission:"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            c.d.a.b.h.a(r3, r4)
        L52:
            return r0
    }
}
