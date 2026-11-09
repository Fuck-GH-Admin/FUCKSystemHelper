package c.d.a.a;

/* JADX INFO: loaded from: classes.dex */
@android.annotation.SuppressLint({"DefaultLocale"})
public class k extends c.d.a.a.a {
    public k() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // c.d.a.a.a, c.d.a.a.n.c
    public void a(android.content.Context r4, com.mobiletools.systemhelper.control.b r5) {
            r3 = this;
            super.a(r4, r5)
            boolean r0 = c.d.a.b.d.e
            java.lang.String r1 = "DeviceInfoReaderWIKO"
            if (r0 != 0) goto Lf
            java.lang.String r3 = "isUserPermissionOpen==false, do not read!"
            c.d.a.b.h.b(r1, r3)
            return
        Lf:
            java.lang.String r0 = "model : MKY-AN20"
            c.d.a.b.h.a(r1, r0)
            java.lang.String r0 = android.os.Build.DISPLAY
            java.lang.String r2 = "\\s+"
            java.lang.String[] r0 = r0.split(r2)
            r2 = 1
            r0 = r0[r2]
            r5.d = r0
            java.lang.String r0 = "ro.board.hardware_version"
            java.lang.String r0 = c.d.a.b.l.a(r0)
            r5.f1415c = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r0 < r2) goto L33
            r3.b(r4, r5)
            goto L49
        L33:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unsupported API:"
            r3.append(r4)
            int r4 = android.os.Build.VERSION.SDK_INT
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            c.d.a.b.h.b(r1, r3)
        L49:
            return
    }
}
