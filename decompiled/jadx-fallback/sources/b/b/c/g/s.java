package b.b.c.g;

/* JADX INFO: loaded from: classes.dex */
public final class s {
    public static boolean a(android.view.ViewGroup r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto Lb
            boolean r2 = r2.isTransitionGroup()
            return r2
        Lb:
            int r0 = b.b.a.b.tag_transition_group
            java.lang.Object r0 = r2.getTag(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L1b
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L2a
        L1b:
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            if (r0 != 0) goto L2a
            java.lang.String r2 = b.b.c.g.q.f(r2)
            if (r2 == 0) goto L28
            goto L2a
        L28:
            r2 = 0
            goto L2b
        L2a:
            r2 = 1
        L2b:
            return r2
    }
}
