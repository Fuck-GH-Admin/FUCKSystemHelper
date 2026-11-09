package a.a.a.d.m.c;

/* JADX INFO: loaded from: classes.dex */
public class c {
    public static boolean a(java.io.File r8, java.io.ByteArrayOutputStream r9) {
            r0 = 0
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile     // Catch: java.lang.Exception -> L49
            r1.<init>(r8)     // Catch: java.lang.Exception -> L49
            java.util.Enumeration r8 = r1.entries()     // Catch: java.lang.Exception -> L49
        La:
            boolean r2 = r8.hasMoreElements()     // Catch: java.lang.Exception -> L49
            if (r2 == 0) goto L44
            java.lang.Object r2 = r8.nextElement()     // Catch: java.lang.Exception -> L49
            java.util.zip.ZipEntry r2 = (java.util.zip.ZipEntry) r2     // Catch: java.lang.Exception -> L49
            boolean r3 = r2.isDirectory()     // Catch: java.lang.Exception -> L49
            if (r3 == 0) goto L1d
            goto La
        L1d:
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch: java.lang.Exception -> L49
            java.io.InputStream r2 = r1.getInputStream(r2)     // Catch: java.lang.Exception -> L49
            r3.<init>(r2)     // Catch: java.lang.Exception -> L49
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch: java.lang.Exception -> L49
            r4 = 2048(0x800, float:2.87E-42)
            r2.<init>(r9, r4)     // Catch: java.lang.Exception -> L49
            byte[] r5 = new byte[r4]     // Catch: java.lang.Exception -> L49
        L2f:
            int r6 = r3.read(r5, r0, r4)     // Catch: java.lang.Exception -> L49
            r7 = -1
            if (r6 == r7) goto L3a
            r2.write(r5, r0, r6)     // Catch: java.lang.Exception -> L49
            goto L2f
        L3a:
            r2.flush()     // Catch: java.lang.Exception -> L49
            r2.close()     // Catch: java.lang.Exception -> L49
            r3.close()     // Catch: java.lang.Exception -> L49
            goto La
        L44:
            r1.close()     // Catch: java.lang.Exception -> L49
            r8 = 1
            return r8
        L49:
            r8 = move-exception
            r8.printStackTrace()
            return r0
    }
}
