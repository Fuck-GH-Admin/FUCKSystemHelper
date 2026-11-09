package android.support.v4.widget;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static void a(android.widget.EdgeEffect r2, float r3, float r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto La
            r2.onPull(r3, r4)
            goto Ld
        La:
            r2.onPull(r3)
        Ld:
            return
    }
}
