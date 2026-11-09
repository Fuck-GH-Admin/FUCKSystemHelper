package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
public class v0 {
    public static void a(android.view.View r2, java.lang.CharSequence r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto La
            r2.setTooltipText(r3)
            goto Ld
        La:
            android.support.v7.widget.w0.a(r2, r3)
        Ld:
            return
    }
}
