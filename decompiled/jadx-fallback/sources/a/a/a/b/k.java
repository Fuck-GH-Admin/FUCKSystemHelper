package a.a.a.b;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static java.lang.String f43a = "Temp_in.dat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static java.io.File f44b;

    static {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = a.a.a.i.h.f353a
            java.lang.String r2 = a.a.a.b.k.f43a
            r0.<init>(r1, r2)
            a.a.a.b.k.f44b = r0
            return
    }

    public static boolean a() {
            java.io.File r0 = a.a.a.b.k.f44b
            boolean r0 = r0.exists()
            if (r0 == 0) goto Ld
            java.io.File r0 = a.a.a.b.k.f44b
            r0.delete()
        Ld:
            java.io.File r0 = a.a.a.b.k.f44b
            java.io.File r0 = r0.getParentFile()
            boolean r0 = r0.exists()
            if (r0 != 0) goto L22
            java.io.File r0 = a.a.a.b.k.f44b
            java.io.File r0 = r0.getParentFile()
            r0.mkdirs()
        L22:
            r0 = 0
            java.io.File r1 = a.a.a.b.k.f44b     // Catch: java.io.IOException -> L4c
            r1.createNewFile()     // Catch: java.io.IOException -> L4c
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.io.IOException -> L4c
            java.io.File r2 = a.a.a.b.k.f44b     // Catch: java.io.IOException -> L4c
            java.lang.String r3 = "rw"
            r1.<init>(r2, r3)     // Catch: java.io.IOException -> L4c
            r2 = 0
            r1.seek(r2)     // Catch: java.io.IOException -> L4c
            r1.writeInt(r0)     // Catch: java.io.IOException -> L4c
            r1.writeInt(r0)     // Catch: java.io.IOException -> L4c
            r2 = 1
            r1.writeInt(r2)     // Catch: java.io.IOException -> L4c
            r1.close()     // Catch: java.io.IOException -> L4c
            c()     // Catch: java.io.IOException -> L4c
            java.io.File r0 = a.a.a.b.k.f44b
            boolean r0 = r0.exists()
        L4c:
            return r0
    }

    public static boolean a(int r3, int r4, int r5) {
            r0 = 0
            if (r3 < 0) goto L17
            int r1 = a.a.a.i.i.Z
            if (r3 <= r1) goto L8
            goto L17
        L8:
            if (r4 < 0) goto L17
            r2 = 1
            int r3 = r3 + r2
            if (r4 <= r3) goto Lf
            goto L17
        Lf:
            if (r5 < r2) goto L17
            if (r5 > r3) goto L17
            if (r5 <= r1) goto L16
            goto L17
        L16:
            return r2
        L17:
            return r0
    }

    public static java.lang.String b() {
            java.io.File r0 = a.a.a.b.k.f44b
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r0.exists()
            if (r0 != 0) goto Ld
            return r1
        Ld:
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch: java.io.IOException -> L78
            java.io.File r2 = a.a.a.b.k.f44b     // Catch: java.io.IOException -> L78
            java.lang.String r3 = "rw"
            r0.<init>(r2, r3)     // Catch: java.io.IOException -> L78
            r2 = 0
            r0.seek(r2)     // Catch: java.io.IOException -> L78
            int r4 = r0.readInt()     // Catch: java.io.IOException -> L78
            int r5 = r0.readInt()     // Catch: java.io.IOException -> L78
            int r6 = r0.readInt()     // Catch: java.io.IOException -> L78
            boolean r7 = a(r4, r5, r6)     // Catch: java.io.IOException -> L78
            if (r7 != 0) goto L34
            r0.close()     // Catch: java.io.IOException -> L78
            a()     // Catch: java.io.IOException -> L78
            return r1
        L34:
            if (r5 == 0) goto L75
            if (r5 != r6) goto L39
            goto L75
        L39:
            int r6 = r5 + (-1)
            int r6 = r6 * 1024
            int r6 = r6 + 12
            long r6 = (long) r6     // Catch: java.io.IOException -> L78
            long r6 = r6 + r2
            r0.seek(r6)     // Catch: java.io.IOException -> L78
            int r2 = r0.readInt()     // Catch: java.io.IOException -> L78
            byte[] r3 = new byte[r2]     // Catch: java.io.IOException -> L78
            r8 = 4
            long r6 = r6 + r8
            r0.seek(r6)     // Catch: java.io.IOException -> L78
            r6 = 0
        L51:
            if (r6 >= r2) goto L5c
            byte r7 = r0.readByte()     // Catch: java.io.IOException -> L78
            r3[r6] = r7     // Catch: java.io.IOException -> L78
            int r6 = r6 + 1
            goto L51
        L5c:
            java.lang.String r2 = new java.lang.String     // Catch: java.io.IOException -> L78
            r2.<init>(r3)     // Catch: java.io.IOException -> L78
            int r3 = a.a.a.i.i.Z     // Catch: java.io.IOException -> L78
            r6 = 1
            if (r4 >= r3) goto L67
            goto L6a
        L67:
            if (r5 != r3) goto L6a
            goto L6b
        L6a:
            int r6 = r6 + r5
        L6b:
            r0.seek(r8)     // Catch: java.io.IOException -> L78
            r0.writeInt(r6)     // Catch: java.io.IOException -> L78
            r0.close()     // Catch: java.io.IOException -> L78
            return r2
        L75:
            r0.close()     // Catch: java.io.IOException -> L78
        L78:
            return r1
    }

    public static void c() {
            return
    }
}
