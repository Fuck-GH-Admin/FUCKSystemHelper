package c.a.b;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.content.Context f1278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c.a.b.f f1279b;

    public m(android.content.Context r1, c.a.b.f r2) {
            r0 = this;
            r0.<init>()
            r0.f1278a = r1
            r0.f1279b = r2
            return
    }

    private c.a.b.l a() {
            r2 = this;
            java.io.File r2 = new java.io.File
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r1 = "backups/.SystemConfig/.cuid2"
            r2.<init>(r0, r1)
            boolean r0 = r2.exists()
            if (r0 == 0) goto L1a
            java.lang.String r2 = c.a.b.k.c.a(r2)
            c.a.b.l r2 = c.a.b.l.b(r2)
            return r2
        L1a:
            r2 = 0
            return r2
    }

    private c.a.b.l a(android.content.Context r5) {
            r4 = this;
            c.a.b.f r4 = r4.f1279b
            java.util.List r4 = r4.b(r5)
            r0 = 0
            if (r4 == 0) goto L6c
            java.lang.String r1 = "files"
            java.io.File r5 = r5.getFilesDir()
            java.lang.String r2 = r5.getName()
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L37
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "fetal error:: app files dir name is unexpectedly :: "
            r1.append(r2)
            java.lang.String r2 = r5.getAbsolutePath()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "CuidV266Manager"
            android.util.Log.e(r2, r1)
            java.lang.String r1 = r5.getName()
        L37:
            java.util.Iterator r4 = r4.iterator()
        L3b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L6c
            java.lang.Object r5 = r4.next()
            c.a.b.d r5 = (c.a.b.d) r5
            boolean r2 = r5.d
            if (r2 == 0) goto L4c
            goto L3b
        L4c:
            java.io.File r2 = new java.io.File
            java.io.File r3 = new java.io.File
            android.content.pm.ApplicationInfo r5 = r5.f1231a
            java.lang.String r5 = r5.dataDir
            r3.<init>(r5, r1)
            java.lang.String r5 = "libcuid.so"
            r2.<init>(r3, r5)
            boolean r5 = r2.exists()
            if (r5 == 0) goto L3b
            java.lang.String r5 = c.a.b.k.c.a(r2)
            c.a.b.l r0 = c.a.b.l.b(r5)
            if (r0 == 0) goto L3b
        L6c:
            return r0
    }

    private c.a.b.l b() {
            r2 = this;
            java.lang.String r0 = "com.baidu.deviceid"
            java.lang.String r0 = r2.c(r0)
            java.lang.String r1 = "bd_setting_i"
            java.lang.String r2 = r2.c(r1)
            c.a.b.l r2 = c.a.b.l.a(r0, r2)
            return r2
    }

    private boolean b(java.lang.String r3) {
            r2 = this;
            android.content.Context r2 = r2.f1278a
            int r0 = android.os.Process.myPid()
            int r1 = android.os.Process.myUid()
            int r2 = r2.checkPermission(r3, r0, r1)
            if (r2 != 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    private java.lang.String c(java.lang.String r1) {
            r0 = this;
            android.content.Context r0 = r0.f1278a     // Catch: java.lang.Exception -> Lb
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Exception -> Lb
            java.lang.String r0 = android.provider.Settings.System.getString(r0, r1)     // Catch: java.lang.Exception -> Lb
            return r0
        Lb:
            r0 = move-exception
            c.a.b.k.c.a(r0)
            r0 = 0
            return r0
    }

    private java.lang.String d(java.lang.String r1) {
            r0 = this;
            java.lang.String r0 = "0"
            return r0
    }

    private c.a.b.l e(java.lang.String r3) {
            r2 = this;
            java.lang.String r2 = ""
            java.io.File r3 = new java.io.File
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r1 = "baidu/.cuid"
            r3.<init>(r0, r1)
            boolean r0 = r3.exists()
            if (r0 == 0) goto L14
            goto L1f
        L14:
            java.io.File r3 = new java.io.File
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r1 = "backups/.SystemConfig/.cuid"
            r3.<init>(r0, r1)
        L1f:
            java.io.FileReader r0 = new java.io.FileReader     // Catch: java.lang.Throwable -> L6c
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L6c
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L6c
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L6c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r0.<init>()     // Catch: java.lang.Throwable -> L6c
        L2e:
            java.lang.String r1 = r3.readLine()     // Catch: java.lang.Throwable -> L6c
            if (r1 == 0) goto L3d
            r0.append(r1)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = "\r\n"
            r0.append(r1)     // Catch: java.lang.Throwable -> L6c
            goto L2e
        L3d:
            r3.close()     // Catch: java.lang.Throwable -> L6c
            byte[] r3 = c.a.b.e.a.g.a()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L6c
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L6c
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Throwable -> L6c
            byte[] r0 = c.a.b.g.a.a(r0)     // Catch: java.lang.Throwable -> L6c
            byte[] r3 = c.a.b.e.a.c.a(r3, r3, r0)     // Catch: java.lang.Throwable -> L6c
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r3 = "="
            java.lang.String[] r3 = r1.split(r3)     // Catch: java.lang.Throwable -> L6c
            if (r3 == 0) goto L6c
            int r0 = r3.length     // Catch: java.lang.Throwable -> L6c
            r1 = 2
            if (r0 != r1) goto L6c
            r0 = 0
            r0 = r3[r0]     // Catch: java.lang.Throwable -> L6c
            r1 = 1
            r2 = r3[r1]     // Catch: java.lang.Throwable -> L6d
            goto L6d
        L6c:
            r0 = r2
        L6d:
            c.a.b.l r2 = c.a.b.l.a(r2, r0)
            return r2
    }

    public c.a.b.l a(java.lang.String r4) {
            r3 = this;
            android.content.Context r4 = r3.f1278a
            c.a.b.l r4 = r3.a(r4)
            if (r4 != 0) goto L12
            java.lang.String r4 = "com.baidu.deviceid.v2"
            java.lang.String r4 = r3.c(r4)
            c.a.b.l r4 = c.a.b.l.b(r4)
        L12:
            java.lang.String r0 = "android.permission.READ_EXTERNAL_STORAGE"
            boolean r0 = r3.b(r0)
            if (r4 != 0) goto L20
            if (r0 == 0) goto L20
            c.a.b.l r4 = r3.a()
        L20:
            if (r4 != 0) goto L26
            c.a.b.l r4 = r3.b()
        L26:
            r1 = 0
            java.lang.String r2 = ""
            if (r4 != 0) goto L36
            if (r0 == 0) goto L36
            java.lang.String r4 = r3.d(r2)
            r1 = 1
            c.a.b.l r4 = r3.e(r4)
        L36:
            if (r1 != 0) goto L3b
            r3.d(r2)
        L3b:
            if (r4 == 0) goto L40
            r4.c()
        L40:
            return r4
    }
}
