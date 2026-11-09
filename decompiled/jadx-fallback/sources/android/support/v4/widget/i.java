package android.support.v4.widget;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static void a(android.widget.ListView r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 < r1) goto La
            r2.scrollListBy(r3)
            goto L22
        La:
            int r0 = r2.getFirstVisiblePosition()
            r1 = -1
            if (r0 != r1) goto L12
            return
        L12:
            r1 = 0
            android.view.View r1 = r2.getChildAt(r1)
            if (r1 != 0) goto L1a
            return
        L1a:
            int r1 = r1.getTop()
            int r1 = r1 - r3
            r2.setSelectionFromTop(r0, r1)
        L22:
            return
    }
}
