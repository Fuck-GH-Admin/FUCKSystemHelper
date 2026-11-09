package a.a.a.i;

/* JADX INFO: loaded from: classes.dex */
public class e {
    public static a.a.a.i.e e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.String f326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f328c;
    public int d;

    public e() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "firll.dat"
            r1.f326a = r0
            r0 = 3164(0xc5c, float:4.434E-42)
            r1.f327b = r0
            r0 = 20
            r1.f328c = r0
            r0 = 60
            r1.d = r0
            return
    }

    public static a.a.a.i.e c() {
            a.a.a.i.e r0 = a.a.a.i.e.e
            if (r0 != 0) goto Lb
            a.a.a.i.e r0 = new a.a.a.i.e
            r0.<init>()
            a.a.a.i.e.e = r0
        Lb:
            a.a.a.i.e r0 = a.a.a.i.e.e
            return r0
    }

    public long a() {
            r2 = this;
            int r0 = r2.f328c
            long r0 = r2.a(r0)
            return r0
    }

    public final long a(int r7) {
            r6 = this;
            java.lang.String r0 = a.a.a.i.i.c()
            r1 = -1
            if (r0 != 0) goto L9
            return r1
        L9:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = java.io.File.separator
            r3.append(r0)
            java.lang.String r6 = r6.f326a
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            r0 = 0
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L49
            java.lang.String r4 = "rw"
            r3.<init>(r6, r4)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L49
            long r6 = (long) r7
            r3.seek(r6)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40
            int r6 = r3.readInt()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40
            long r4 = r3.readLong()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40
            int r7 = r3.readInt()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40
            if (r6 != r7) goto L4c
            r3.close()     // Catch: java.io.IOException -> L3c
        L3c:
            return r4
        L3d:
            r6 = move-exception
            r0 = r3
            goto L43
        L40:
            r0 = r3
            goto L49
        L42:
            r6 = move-exception
        L43:
            if (r0 == 0) goto L48
            r0.close()     // Catch: java.io.IOException -> L48
        L48:
            throw r6
        L49:
            if (r0 == 0) goto L4f
            r3 = r0
        L4c:
            r3.close()     // Catch: java.io.IOException -> L4f
        L4f:
            return r1
    }

    public final void a(int r5, long r6) {
            r4 = this;
            java.lang.String r0 = a.a.a.i.i.c()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = java.io.File.separator
            r1.append(r0)
            java.lang.String r0 = r4.f326a
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> L38
            java.lang.String r2 = "rw"
            r1.<init>(r0, r2)     // Catch: java.lang.Exception -> L38
            long r2 = (long) r5     // Catch: java.lang.Exception -> L38
            r1.seek(r2)     // Catch: java.lang.Exception -> L38
            int r5 = r4.f327b     // Catch: java.lang.Exception -> L38
            r1.writeInt(r5)     // Catch: java.lang.Exception -> L38
            r1.writeLong(r6)     // Catch: java.lang.Exception -> L38
            int r4 = r4.f327b     // Catch: java.lang.Exception -> L38
            r1.writeInt(r4)     // Catch: java.lang.Exception -> L38
            r1.close()     // Catch: java.lang.Exception -> L38
        L38:
            return
    }

    public void a(long r2) {
            r1 = this;
            int r0 = r1.f328c
            r1.a(r0, r2)
            return
    }

    public long b() {
            r2 = this;
            int r0 = r2.d
            long r0 = r2.a(r0)
            return r0
    }

    public void b(long r2) {
            r1 = this;
            int r0 = r1.d
            r1.a(r0, r2)
            return
    }
}
