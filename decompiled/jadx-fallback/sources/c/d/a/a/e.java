package c.d.a.a;

/* JADX INFO: loaded from: classes.dex */
public class e extends c.d.a.a.a {
    public e() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // c.d.a.a.a, c.d.a.a.n.c
    public void a(android.content.Context r3, com.mobiletools.systemhelper.control.b r4) {
            r2 = this;
            super.a(r3, r4)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto Ld
            r2.b(r3, r4)
            goto L25
        Ld:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unsupported API:"
            r2.append(r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "DeviceInfoReaderOnePlus"
            c.d.a.b.h.b(r3, r2)
        L25:
            return
    }
}
