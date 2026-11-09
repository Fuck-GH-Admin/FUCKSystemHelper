package b.b.c.a;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static int a(android.content.Context r3, java.lang.String r4) {
            int r0 = android.os.Process.myPid()
            int r1 = android.os.Process.myUid()
            java.lang.String r2 = r3.getPackageName()
            int r3 = a(r3, r4, r0, r1, r2)
            return r3
    }

    public static int a(android.content.Context r1, java.lang.String r2, int r3, int r4, java.lang.String r5) {
            int r3 = r1.checkPermission(r2, r3, r4)
            r0 = -1
            if (r3 != r0) goto L8
            return r0
        L8:
            java.lang.String r2 = android.support.v4.app.b.a(r2)
            r3 = 0
            if (r2 != 0) goto L10
            return r3
        L10:
            if (r5 != 0) goto L24
            android.content.pm.PackageManager r5 = r1.getPackageManager()
            java.lang.String[] r4 = r5.getPackagesForUid(r4)
            if (r4 == 0) goto L23
            int r5 = r4.length
            if (r5 > 0) goto L20
            goto L23
        L20:
            r5 = r4[r3]
            goto L24
        L23:
            return r0
        L24:
            int r1 = android.support.v4.app.b.a(r1, r2, r5)
            if (r1 == 0) goto L2c
            r1 = -2
            return r1
        L2c:
            return r3
    }
}
