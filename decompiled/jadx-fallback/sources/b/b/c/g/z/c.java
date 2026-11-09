package b.b.c.g.z;

/* JADX INFO: loaded from: classes.dex */
public class c {
    public static void a(android.view.accessibility.AccessibilityRecord r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 15
            if (r0 < r1) goto L9
            r2.setMaxScrollX(r3)
        L9:
            return
    }

    public static void b(android.view.accessibility.AccessibilityRecord r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 15
            if (r0 < r1) goto L9
            r2.setMaxScrollY(r3)
        L9:
            return
    }
}
