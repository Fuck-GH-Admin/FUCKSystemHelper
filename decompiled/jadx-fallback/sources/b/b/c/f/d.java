package b.b.c.f;

/* JADX INFO: loaded from: classes.dex */
public class d {
    public static void a(java.lang.Object r2, java.lang.StringBuilder r3) {
            if (r2 != 0) goto L8
            java.lang.String r2 = "null"
        L4:
            r3.append(r2)
            goto L3f
        L8:
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getSimpleName()
            if (r0 == 0) goto L18
            int r1 = r0.length()
            if (r1 > 0) goto L2e
        L18:
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            r1 = 46
            int r1 = r0.lastIndexOf(r1)
            if (r1 <= 0) goto L2e
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)
        L2e:
            r3.append(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r3.append(r0)
            int r2 = java.lang.System.identityHashCode(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            goto L4
        L3f:
            return
    }
}
