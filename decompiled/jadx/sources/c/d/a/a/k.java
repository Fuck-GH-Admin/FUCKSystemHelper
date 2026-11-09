package c.d.a.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"DefaultLocale"})
public class k extends a {
    @Override // c.d.a.a.a, c.d.a.a.n.c
    public void a(Context context, com.mobiletools.systemhelper.control.b bVar) {
        super.a(context, bVar);
        if (!c.d.a.b.d.e) {
            c.d.a.b.h.b("DeviceInfoReaderWIKO", "isUserPermissionOpen==false, do not read!");
            return;
        }
        c.d.a.b.h.a("DeviceInfoReaderWIKO", "model : MKY-AN20");
        bVar.d = Build.DISPLAY.split("\\s+")[1];
        bVar.f1415c = c.d.a.b.l.a("ro.board.hardware_version");
        if (Build.VERSION.SDK_INT >= 33) {
            b(context, bVar);
            return;
        }
        c.d.a.b.h.b("DeviceInfoReaderWIKO", "Unsupported API:" + Build.VERSION.SDK_INT);
    }
}
