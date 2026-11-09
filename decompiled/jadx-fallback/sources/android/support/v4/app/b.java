package android.support.v4.app;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static int a(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L13
            java.lang.Class<android.app.AppOpsManager> r0 = android.app.AppOpsManager.class
            java.lang.Object r2 = r2.getSystemService(r0)
            android.app.AppOpsManager r2 = (android.app.AppOpsManager) r2
            int r2 = r2.noteProxyOpNoThrow(r3, r4)
            return r2
        L13:
            r2 = 1
            return r2
    }

    public static java.lang.String a(java.lang.String r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            java.lang.String r2 = android.app.AppOpsManager.permissionToOp(r2)
            return r2
        Lb:
            r2 = 0
            return r2
    }
}
