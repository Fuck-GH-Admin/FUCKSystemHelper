package c.d.a.a;

/* JADX INFO: loaded from: classes.dex */
public class m extends c.d.a.a.a {
    public m() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // c.d.a.a.a, c.d.a.a.n.c
    public void a(android.content.Context r4, com.mobiletools.systemhelper.control.b r5) {
            r3 = this;
            super.a(r4, r5)
            java.lang.String r0 = "ro.product.hardware"
            java.lang.String r1 = "UnKnow"
            java.lang.String r0 = c.d.a.b.l.b(r0, r1)
            r5.f1415c = r0
            java.lang.String r0 = android.os.Build.DISPLAY
            r5.d = r0
            boolean r0 = c.d.a.b.d.e
            java.lang.String r1 = "DeviceInfoReaderZTE"
            if (r0 != 0) goto L1d
            java.lang.String r3 = "isUserPermissionOpen==false, do not read!"
            c.d.a.b.h.b(r1, r3)
            return
        L1d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r0 < r2) goto L27
            r3.b(r4, r5)
            goto L3d
        L27:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unsupported API:"
            r3.append(r4)
            int r4 = android.os.Build.VERSION.SDK_INT
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            c.d.a.b.h.b(r1, r3)
        L3d:
            return
    }
}
