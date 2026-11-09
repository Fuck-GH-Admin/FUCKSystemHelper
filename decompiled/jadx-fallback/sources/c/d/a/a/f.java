package c.d.a.a;

/* JADX INFO: loaded from: classes.dex */
public class f extends c.d.a.a.a {
    public f() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // c.d.a.a.a, c.d.a.a.n.c
    public void a(android.content.Context r4, com.mobiletools.systemhelper.control.b r5) {
            r3 = this;
            super.a(r4, r5)
            java.lang.String r0 = android.os.Build.DISPLAY
            java.lang.String r1 = "\\s+"
            java.lang.String[] r0 = r0.split(r1)
            r1 = 1
            r0 = r0[r1]
            r5.d = r0
            java.lang.String r0 = "ro.board.hardware_version"
            java.lang.String r0 = c.d.a.b.l.a(r0)
            r5.f1415c = r0
            boolean r0 = c.d.a.b.d.e
            java.lang.String r1 = "DeviceInfoReaderPTAC"
            if (r0 != 0) goto L24
            java.lang.String r3 = "isUserPermissionOpen==false, do not read!"
            c.d.a.b.h.b(r1, r3)
            return
        L24:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r0 < r2) goto L2e
            r3.b(r4, r5)
            goto L44
        L2e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unsupported API:"
            r3.append(r4)
            int r4 = android.os.Build.VERSION.SDK_INT
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            c.d.a.b.h.b(r1, r3)
        L44:
            return
    }
}
