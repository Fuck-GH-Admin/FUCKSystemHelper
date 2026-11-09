package a.a.a.g.m;

/* JADX INFO: loaded from: classes.dex */
public class b implements a.a.a.g.m.a {
    public static int a(java.lang.Object r5, java.lang.String r6) {
            java.lang.Class r0 = r5.getClass()
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]
            r3 = 0
            r4 = 0
            r2[r4] = r3
            java.lang.reflect.Method r6 = r0.getDeclaredMethod(r6, r2)
            boolean r0 = r6.isAccessible()
            if (r0 != 0) goto L18
            r6.setAccessible(r1)
        L18:
            java.lang.Object r5 = r6.invoke(r5, r3)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            return r5
    }

    public static java.lang.String a(android.content.Context r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            r2 = 0
            if (r0 > r1) goto L20
            java.lang.String r0 = android.os.Environment.getExternalStorageState()     // Catch: java.lang.Exception -> L1c
            java.lang.String r3 = "mounted"
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Exception -> L1c
            if (r0 == 0) goto L20
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()     // Catch: java.lang.Exception -> L1c
            java.lang.String r0 = r0.getPath()     // Catch: java.lang.Exception -> L1c
            goto L21
        L1c:
            r0 = move-exception
            r0.printStackTrace()
        L20:
            r0 = r2
        L21:
            if (r0 != 0) goto L35
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 <= r1) goto L35
            if (r4 == 0) goto L35
            java.lang.String r0 = android.os.Environment.DIRECTORY_MOVIES     // Catch: java.lang.Exception -> L34
            java.io.File r4 = r4.getExternalFilesDir(r0)     // Catch: java.lang.Exception -> L34
            java.lang.String r0 = r4.getAbsolutePath()     // Catch: java.lang.Exception -> L34
            goto L35
        L34:
            r0 = r2
        L35:
            if (r0 == 0) goto L5c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L57
            r4.<init>()     // Catch: java.lang.Exception -> L57
            r4.append(r0)     // Catch: java.lang.Exception -> L57
            java.lang.String r1 = "/baidu/tempdata"
            r4.append(r1)     // Catch: java.lang.Exception -> L57
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L57
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L57
            r1.<init>(r4)     // Catch: java.lang.Exception -> L57
            boolean r4 = r1.exists()     // Catch: java.lang.Exception -> L57
            if (r4 != 0) goto L5c
            r1.mkdirs()     // Catch: java.lang.Exception -> L57
            goto L5c
        L57:
            r4 = move-exception
            r4.printStackTrace()
            goto L5d
        L5c:
            r2 = r0
        L5d:
            return r2
    }

    public static boolean a(java.lang.String r1) {
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L8
            if (r1 == 0) goto L10
            r1 = 1
            goto L11
        L8:
            r1 = move-exception
            boolean r0 = a.a.a.g.m.a.f310a
            if (r0 == 0) goto L10
            r1.printStackTrace()
        L10:
            r1 = 0
        L11:
            return r1
    }

    public static java.lang.String b(android.content.Context r1) {
            java.lang.String r1 = a(r1)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "/baidu/tempdata"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }
}
