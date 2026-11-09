package b.b.c.g;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static int a(android.view.ViewGroup.MarginLayoutParams r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r0 < r1) goto Lb
            int r2 = r2.getMarginEnd()
            return r2
        Lb:
            int r2 = r2.rightMargin
            return r2
    }

    public static int b(android.view.ViewGroup.MarginLayoutParams r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r0 < r1) goto Lb
            int r2 = r2.getMarginStart()
            return r2
        Lb:
            int r2 = r2.leftMargin
            return r2
    }
}
