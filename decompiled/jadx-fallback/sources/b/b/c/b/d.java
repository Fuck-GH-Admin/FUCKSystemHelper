package b.b.c.b;

/* JADX INFO: loaded from: classes.dex */
class d extends b.b.c.b.h {
    d() {
            r0 = this;
            r0.<init>()
            return
    }

    private java.io.File a(android.os.ParcelFileDescriptor r3) {
            r2 = this;
            r2 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: android.system.ErrnoException -> L2c
            r0.<init>()     // Catch: android.system.ErrnoException -> L2c
            java.lang.String r1 = "/proc/self/fd/"
            r0.append(r1)     // Catch: android.system.ErrnoException -> L2c
            int r3 = r3.getFd()     // Catch: android.system.ErrnoException -> L2c
            r0.append(r3)     // Catch: android.system.ErrnoException -> L2c
            java.lang.String r3 = r0.toString()     // Catch: android.system.ErrnoException -> L2c
            java.lang.String r3 = android.system.Os.readlink(r3)     // Catch: android.system.ErrnoException -> L2c
            android.system.StructStat r0 = android.system.Os.stat(r3)     // Catch: android.system.ErrnoException -> L2c
            int r0 = r0.st_mode     // Catch: android.system.ErrnoException -> L2c
            boolean r0 = android.system.OsConstants.S_ISREG(r0)     // Catch: android.system.ErrnoException -> L2c
            if (r0 == 0) goto L2c
            java.io.File r0 = new java.io.File     // Catch: android.system.ErrnoException -> L2c
            r0.<init>(r3)     // Catch: android.system.ErrnoException -> L2c
            return r0
        L2c:
            return r2
    }

    @Override // b.b.c.b.h
    public android.graphics.Typeface a(android.content.Context r4, android.os.CancellationSignal r5, b.b.c.d.b.f[] r6, int r7) {
            r3 = this;
            int r0 = r6.length
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L6
            return r1
        L6:
            b.b.c.d.b$f r6 = r3.a(r6, r7)
            android.content.ContentResolver r7 = r4.getContentResolver()
            android.net.Uri r6 = r6.c()     // Catch: java.io.IOException -> L5f
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r5 = r7.openFileDescriptor(r6, r0, r5)     // Catch: java.io.IOException -> L5f
            java.io.File r6 = r3.a(r5)     // Catch: java.lang.Throwable -> L51
            if (r6 == 0) goto L2f
            boolean r7 = r6.canRead()     // Catch: java.lang.Throwable -> L51
            if (r7 != 0) goto L25
            goto L2f
        L25:
            android.graphics.Typeface r3 = android.graphics.Typeface.createFromFile(r6)     // Catch: java.lang.Throwable -> L51
            if (r5 == 0) goto L2e
            r5.close()     // Catch: java.io.IOException -> L5f
        L2e:
            return r3
        L2f:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L51
            java.io.FileDescriptor r7 = r5.getFileDescriptor()     // Catch: java.lang.Throwable -> L51
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L51
            android.graphics.Typeface r3 = super.a(r4, r6)     // Catch: java.lang.Throwable -> L45
            r6.close()     // Catch: java.lang.Throwable -> L51
            if (r5 == 0) goto L44
            r5.close()     // Catch: java.io.IOException -> L5f
        L44:
            return r3
        L45:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L47
        L47:
            r4 = move-exception
            r6.close()     // Catch: java.lang.Throwable -> L4c
            goto L50
        L4c:
            r6 = move-exception
            r3.addSuppressed(r6)     // Catch: java.lang.Throwable -> L51
        L50:
            throw r4     // Catch: java.lang.Throwable -> L51
        L51:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L53
        L53:
            r4 = move-exception
            if (r5 == 0) goto L5e
            r5.close()     // Catch: java.lang.Throwable -> L5a
            goto L5e
        L5a:
            r5 = move-exception
            r3.addSuppressed(r5)     // Catch: java.io.IOException -> L5f
        L5e:
            throw r4     // Catch: java.io.IOException -> L5f
        L5f:
            return r1
    }
}
