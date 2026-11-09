package android.support.v4.app;

/* JADX INFO: loaded from: classes.dex */
public final class t {
    public static android.content.Intent a(android.app.Activity r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto Ld
            android.content.Intent r0 = r3.getParentActivityIntent()
            if (r0 == 0) goto Ld
            return r0
        Ld:
            java.lang.String r0 = b(r3)
            r1 = 0
            if (r0 != 0) goto L15
            return r1
        L15:
            android.content.ComponentName r2 = new android.content.ComponentName
            r2.<init>(r3, r0)
            java.lang.String r3 = b(r3, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            if (r3 != 0) goto L25
            android.content.Intent r3 = android.content.Intent.makeMainActivity(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            goto L2e
        L25:
            android.content.Intent r3 = new android.content.Intent     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            r3.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            android.content.Intent r3 = r3.setComponent(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
        L2e:
            return r3
        L2f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "getParentActivityIntent: bad parentActivityName '"
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = "' in manifest"
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "NavUtils"
            android.util.Log.e(r0, r3)
            return r1
    }

    public static android.content.Intent a(android.content.Context r2, android.content.ComponentName r3) {
            java.lang.String r0 = b(r2, r3)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.String r3 = r3.getPackageName()
            r1.<init>(r3, r0)
            java.lang.String r2 = b(r2, r1)
            if (r2 != 0) goto L1c
            android.content.Intent r2 = android.content.Intent.makeMainActivity(r1)
            goto L25
        L1c:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            android.content.Intent r2 = r2.setComponent(r1)
        L25:
            return r2
    }

    public static void a(android.app.Activity r2, android.content.Intent r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto La
            r2.navigateUpTo(r3)
            goto L15
        La:
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r3.addFlags(r0)
            r2.startActivity(r3)
            r2.finish()
        L15:
            return
    }

    public static java.lang.String b(android.app.Activity r1) {
            android.content.ComponentName r0 = r1.getComponentName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9
            java.lang.String r1 = b(r1, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9
            return r1
        L9:
            r1 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
    }

    public static java.lang.String b(android.content.Context r2, android.content.ComponentName r3) {
            android.content.pm.PackageManager r0 = r2.getPackageManager()
            r1 = 128(0x80, float:1.8E-43)
            android.content.pm.ActivityInfo r3 = r0.getActivityInfo(r3, r1)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L15
            java.lang.String r0 = r3.parentActivityName
            if (r0 == 0) goto L15
            return r0
        L15:
            android.os.Bundle r3 = r3.metaData
            r0 = 0
            if (r3 != 0) goto L1b
            return r0
        L1b:
            java.lang.String r1 = "android.support.PARENT_ACTIVITY"
            java.lang.String r3 = r3.getString(r1)
            if (r3 != 0) goto L24
            return r0
        L24:
            r0 = 0
            char r0 = r3.charAt(r0)
            r1 = 46
            if (r0 != r1) goto L40
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r2.getPackageName()
            r0.append(r2)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
        L40:
            return r3
    }

    public static boolean b(android.app.Activity r2, android.content.Intent r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto Lb
            boolean r2 = r2.shouldUpRecreateTask(r3)
            return r2
        Lb:
            android.content.Intent r2 = r2.getIntent()
            java.lang.String r2 = r2.getAction()
            if (r2 == 0) goto L1f
            java.lang.String r3 = "android.intent.action.MAIN"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1f
            r2 = 1
            goto L20
        L1f:
            r2 = 0
        L20:
            return r2
    }
}
