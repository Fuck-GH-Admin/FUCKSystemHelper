package b.b.c.g;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static int a(int r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r0 < r1) goto Lb
            int r2 = android.view.Gravity.getAbsoluteGravity(r2, r3)
            return r2
        Lb:
            r3 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r2 = r2 & r3
            return r2
    }
}
