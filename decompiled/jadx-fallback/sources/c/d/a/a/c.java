package c.d.a.a;

/* JADX INFO: loaded from: classes.dex */
@android.annotation.SuppressLint({"DefaultLocale"})
public class c extends c.d.a.a.a {
    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // c.d.a.a.a, c.d.a.a.n.c
    public void a(android.content.Context r4, com.mobiletools.systemhelper.control.b r5) {
            r3 = this;
            super.a(r4, r5)
            boolean r0 = c.d.a.b.d.e
            java.lang.String r1 = "DeviceInfoReaderNubia"
            if (r0 != 0) goto Lf
            java.lang.String r3 = "isUserPermissionOpen==false, do not read!"
            c.d.a.b.h.b(r1, r3)
            return
        Lf:
            java.lang.String r0 = r5.f1414b
            java.lang.String r2 = "NX659J"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L3e
            java.lang.String r0 = r5.f1414b
            java.lang.String r2 = "NX651J"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L3e
            java.lang.String r0 = r5.f1414b
            java.lang.String r2 = "angelcare N9"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L3e
            java.lang.String r0 = r5.f1414b
            java.lang.String r2 = "NX724J"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L38
            goto L3e
        L38:
            java.lang.String r3 = "DeviceInfoReaderNubia model unknow!!!"
            c.d.a.b.h.b(r1, r3)
            goto L56
        L3e:
            java.lang.String r0 = "model : angelcare N9"
            c.d.a.b.h.a(r1, r0)
            java.lang.String r0 = "ro.build.display.id"
            java.lang.String r0 = c.d.a.b.l.a(r0)
            r5.d = r0
            java.lang.String r0 = "ro.product.hardware"
            java.lang.String r0 = c.d.a.b.l.a(r0)
            r5.f1415c = r0
            r3.b(r4, r5)
        L56:
            return
    }
}
