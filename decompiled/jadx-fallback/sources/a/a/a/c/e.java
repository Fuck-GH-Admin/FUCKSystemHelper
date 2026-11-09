package a.a.a.c;

/* JADX INFO: loaded from: classes.dex */
public class e implements java.lang.Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static a.a.a.c.e f116b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f117a;

    static {
            return
    }

    public e() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f117a = r0
            return
    }

    public static a.a.a.c.e b() {
            a.a.a.c.e r0 = a.a.a.c.e.f116b
            if (r0 != 0) goto Lb
            a.a.a.c.e r0 = new a.a.a.c.e
            r0.<init>()
            a.a.a.c.e.f116b = r0
        Lb:
            a.a.a.c.e r0 = a.a.a.c.e.f116b
            return r0
    }

    public final java.lang.String a(java.lang.Throwable r2) {
            r1 = this;
            java.io.StringWriter r1 = new java.io.StringWriter
            r1.<init>()
            java.io.PrintWriter r0 = new java.io.PrintWriter
            r0.<init>(r1)
            r2.printStackTrace(r0)
            r0.close()
            java.lang.String r1 = r1.toString()
            return r1
    }

    public void a() {
            r11 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L8e
            r0.<init>()     // Catch: java.lang.Exception -> L8e
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()     // Catch: java.lang.Exception -> L8e
            java.lang.String r1 = r1.getPath()     // Catch: java.lang.Exception -> L8e
            r0.append(r1)     // Catch: java.lang.Exception -> L8e
            java.lang.String r1 = "/traces"
            r0.append(r1)     // Catch: java.lang.Exception -> L8e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L8e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L8e
            r1.<init>()     // Catch: java.lang.Exception -> L8e
            r1.append(r0)     // Catch: java.lang.Exception -> L8e
            java.lang.String r0 = "/error_fs2.dat"
            r1.append(r0)     // Catch: java.lang.Exception -> L8e
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> L8e
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L8e
            r1.<init>(r0)     // Catch: java.lang.Exception -> L8e
            boolean r0 = r1.exists()     // Catch: java.lang.Exception -> L8e
            if (r0 == 0) goto L8e
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> L8e
            java.lang.String r2 = "rw"
            r0.<init>(r1, r2)     // Catch: java.lang.Exception -> L8e
            r1 = 280(0x118, double:1.383E-321)
            r0.seek(r1)     // Catch: java.lang.Exception -> L8e
            int r3 = r0.readInt()     // Catch: java.lang.Exception -> L8e
            r4 = 1326(0x52e, float:1.858E-42)
            if (r4 != r3) goto L8b
            r3 = 308(0x134, double:1.52E-321)
            r0.seek(r3)     // Catch: java.lang.Exception -> L8e
            int r3 = r0.readInt()     // Catch: java.lang.Exception -> L8e
            r4 = 2048(0x800, float:2.87E-42)
            r5 = 0
            r6 = 0
            if (r3 <= 0) goto L65
            if (r3 >= r4) goto L65
            byte[] r7 = new byte[r3]     // Catch: java.lang.Exception -> L8e
            r0.read(r7, r6, r3)     // Catch: java.lang.Exception -> L8e
            java.lang.String r8 = new java.lang.String     // Catch: java.lang.Exception -> L8e
            r8.<init>(r7, r6, r3)     // Catch: java.lang.Exception -> L8e
            goto L66
        L65:
            r8 = r5
        L66:
            r9 = 600(0x258, double:2.964E-321)
            r0.seek(r9)     // Catch: java.lang.Exception -> L8e
            int r3 = r0.readInt()     // Catch: java.lang.Exception -> L8e
            if (r3 <= 0) goto L7d
            if (r3 >= r4) goto L7d
            byte[] r4 = new byte[r3]     // Catch: java.lang.Exception -> L8e
            r0.read(r4, r6, r3)     // Catch: java.lang.Exception -> L8e
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Exception -> L8e
            r5.<init>(r4, r6, r3)     // Catch: java.lang.Exception -> L8e
        L7d:
            boolean r11 = r11.a(r8, r5)     // Catch: java.lang.Exception -> L8e
            if (r11 == 0) goto L8b
            r0.seek(r1)     // Catch: java.lang.Exception -> L8e
            r11 = 12346(0x303a, float:1.73E-41)
            r0.writeInt(r11)     // Catch: java.lang.Exception -> L8e
        L8b:
            r0.close()     // Catch: java.lang.Exception -> L8e
        L8e:
            return
    }

    public final void a(java.io.File r8, java.lang.String r9, java.lang.String r10) {
            r7 = this;
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> L4c
            java.lang.String r1 = "rw"
            r0.<init>(r8, r1)     // Catch: java.lang.Exception -> L4c
            r1 = 280(0x118, double:1.383E-321)
            r0.seek(r1)     // Catch: java.lang.Exception -> L4c
            r8 = 12346(0x303a, float:1.73E-41)
            r0.writeInt(r8)     // Catch: java.lang.Exception -> L4c
            r3 = 300(0x12c, double:1.48E-321)
            r0.seek(r3)     // Catch: java.lang.Exception -> L4c
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L4c
            r0.writeLong(r3)     // Catch: java.lang.Exception -> L4c
            byte[] r8 = r9.getBytes()     // Catch: java.lang.Exception -> L4c
            int r3 = r8.length     // Catch: java.lang.Exception -> L4c
            r0.writeInt(r3)     // Catch: java.lang.Exception -> L4c
            int r3 = r8.length     // Catch: java.lang.Exception -> L4c
            r4 = 0
            r0.write(r8, r4, r3)     // Catch: java.lang.Exception -> L4c
            r5 = 600(0x258, double:2.964E-321)
            r0.seek(r5)     // Catch: java.lang.Exception -> L4c
            byte[] r8 = r10.getBytes()     // Catch: java.lang.Exception -> L4c
            int r3 = r8.length     // Catch: java.lang.Exception -> L4c
            r0.writeInt(r3)     // Catch: java.lang.Exception -> L4c
            int r3 = r8.length     // Catch: java.lang.Exception -> L4c
            r0.write(r8, r4, r3)     // Catch: java.lang.Exception -> L4c
            boolean r7 = r7.a(r9, r10)     // Catch: java.lang.Exception -> L4c
            if (r7 != 0) goto L49
            r0.seek(r1)     // Catch: java.lang.Exception -> L4c
            r7 = 1326(0x52e, float:1.858E-42)
            r0.writeInt(r7)     // Catch: java.lang.Exception -> L4c
        L49:
            r0.close()     // Catch: java.lang.Exception -> L4c
        L4c:
            return
    }

    public final boolean a(java.lang.String r6, java.lang.String r7) {
            r5 = this;
            java.lang.String r5 = "&"
            java.lang.String r0 = "="
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            r2 = 0
            if (r1 != 0) goto L9f
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 == 0) goto L13
            goto L9f
        L13:
            a.a.a.g.f r1 = a.a.a.g.f.w()
            boolean r1 = r1.p()
            if (r1 != 0) goto L1e
            return r2
        L1e:
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Exception -> L9f
            java.lang.String r3 = a.a.a.i.d.f323a     // Catch: java.lang.Exception -> L9f
            r1.<init>(r3)     // Catch: java.lang.Exception -> L9f
            java.lang.StringBuffer r3 = new java.lang.StringBuffer     // Catch: java.lang.Exception -> L9f
            r3.<init>()     // Catch: java.lang.Exception -> L9f
            java.lang.String r4 = "e0"
            r3.append(r4)     // Catch: java.lang.Exception -> L9f
            r3.append(r0)     // Catch: java.lang.Exception -> L9f
            r3.append(r6)     // Catch: java.lang.Exception -> L9f
            r3.append(r5)     // Catch: java.lang.Exception -> L9f
            java.lang.String r6 = "e1"
            r3.append(r6)     // Catch: java.lang.Exception -> L9f
            r3.append(r0)     // Catch: java.lang.Exception -> L9f
            r3.append(r7)     // Catch: java.lang.Exception -> L9f
            r3.append(r5)     // Catch: java.lang.Exception -> L9f
            int r5 = r3.length()     // Catch: java.lang.Exception -> L9f
            r6 = 1
            if (r5 <= 0) goto L55
            int r5 = r3.length()     // Catch: java.lang.Exception -> L9f
            int r5 = r5 - r6
            r3.deleteCharAt(r5)     // Catch: java.lang.Exception -> L9f
        L55:
            java.net.URLConnection r5 = r1.openConnection()     // Catch: java.lang.Exception -> L9f
            javax.net.ssl.HttpsURLConnection r5 = (javax.net.ssl.HttpsURLConnection) r5     // Catch: java.lang.Exception -> L9f
            java.lang.String r7 = "POST"
            r5.setRequestMethod(r7)     // Catch: java.lang.Exception -> L9f
            r5.setDoInput(r6)     // Catch: java.lang.Exception -> L9f
            r5.setDoOutput(r6)     // Catch: java.lang.Exception -> L9f
            r5.setUseCaches(r2)     // Catch: java.lang.Exception -> L9f
            int r7 = a.a.a.i.a.f316a     // Catch: java.lang.Exception -> L9f
            r5.setConnectTimeout(r7)     // Catch: java.lang.Exception -> L9f
            int r7 = a.a.a.i.a.f316a     // Catch: java.lang.Exception -> L9f
            r5.setReadTimeout(r7)     // Catch: java.lang.Exception -> L9f
            java.lang.String r7 = "Content-Type"
            java.lang.String r0 = "application/x-www-form-urlencoded; charset=utf-8"
            r5.setRequestProperty(r7, r0)     // Catch: java.lang.Exception -> L9f
            java.lang.String r7 = "Accept-Charset"
            java.lang.String r0 = "UTF-8"
            r5.setRequestProperty(r7, r0)     // Catch: java.lang.Exception -> L9f
            java.io.OutputStream r7 = r5.getOutputStream()     // Catch: java.lang.Exception -> L9f
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Exception -> L9f
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Exception -> L9f
            r7.write(r0)     // Catch: java.lang.Exception -> L9f
            r7.flush()     // Catch: java.lang.Exception -> L9f
            r7.close()     // Catch: java.lang.Exception -> L9f
            int r5 = r5.getResponseCode()     // Catch: java.lang.Exception -> L9f
            r7 = 200(0xc8, float:2.8E-43)
            if (r5 != r7) goto L9f
            return r6
        L9f:
            return r2
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(java.lang.Thread r8, java.lang.Throwable r9) {
            r7 = this;
            int r8 = r7.f117a
            r0 = 1
            int r8 = r8 + r0
            r7.f117a = r8
            r1 = 2
            if (r8 <= r1) goto L11
        L9:
            int r7 = android.os.Process.myPid()
            android.os.Process.killProcess(r7)
            return
        L11:
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = a.a.a.h.a.d()
            long r1 = r1 - r3
            r3 = 10000(0x2710, double:4.9407E-320)
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 >= 0) goto L75
            float r8 = com.baidu.location.f.a()
            r1 = 1092113924(0x41185604, float:9.521)
            int r8 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r8 <= 0) goto L75
            a.a.a.i.e r8 = a.a.a.i.e.c()
            long r1 = r8.a()
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r1
            r1 = 40000(0x9c40, double:1.97626E-319)
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 >= 0) goto L6a
            java.io.File r8 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = a.a.a.i.i.c()
            r1.append(r2)
            java.lang.String r2 = java.io.File.separator
            r1.append(r2)
            java.lang.String r2 = com.baidu.location.f.b()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r8.<init>(r1)
            boolean r1 = r8.exists()
            if (r1 == 0) goto L75
            r8.delete()
            goto L75
        L6a:
            a.a.a.i.e r8 = a.a.a.i.e.c()
            long r1 = java.lang.System.currentTimeMillis()
            r8.a(r1)
        L75:
            r8 = 0
            r1 = 0
            java.lang.String r9 = r7.a(r9)     // Catch: java.lang.Exception -> Lb3
            if (r9 == 0) goto L86
            java.lang.String r2 = "com.baidu.location"
            boolean r2 = r9.contains(r2)     // Catch: java.lang.Exception -> Lb4
            if (r2 == 0) goto L86
            goto L87
        L86:
            r0 = r8
        L87:
            a.a.a.i.b r2 = a.a.a.i.b.e()     // Catch: java.lang.Exception -> Lb4
            java.lang.String r2 = r2.a(r8)     // Catch: java.lang.Exception -> Lb4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lb4
            r3.<init>()     // Catch: java.lang.Exception -> Lb4
            r3.append(r2)     // Catch: java.lang.Exception -> Lb4
            a.a.a.b.c r2 = a.a.a.b.c.h()     // Catch: java.lang.Exception -> Lb4
            java.lang.String r2 = r2.d()     // Catch: java.lang.Exception -> Lb4
            r3.append(r2)     // Catch: java.lang.Exception -> Lb4
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Exception -> Lb4
            if (r2 == 0) goto Lb1
            java.lang.String r8 = com.baidu.location.Jni.b(r2)     // Catch: java.lang.Exception -> Lb4
            r6 = r9
            r9 = r8
            r8 = r0
            r0 = r6
            goto Lb6
        Lb1:
            r8 = r0
            goto Lb4
        Lb3:
            r9 = r1
        Lb4:
            r0 = r9
            r9 = r1
        Lb6:
            if (r8 == 0) goto L9
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L9
            r8.<init>()     // Catch: java.lang.Exception -> L9
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()     // Catch: java.lang.Exception -> L9
            java.lang.String r2 = r2.getPath()     // Catch: java.lang.Exception -> L9
            r8.append(r2)     // Catch: java.lang.Exception -> L9
            java.lang.String r2 = "/traces"
            r8.append(r2)     // Catch: java.lang.Exception -> L9
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> L9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L9
            r2.<init>()     // Catch: java.lang.Exception -> L9
            r2.append(r8)     // Catch: java.lang.Exception -> L9
            java.lang.String r3 = "/error_fs2.dat"
            r2.append(r3)     // Catch: java.lang.Exception -> L9
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L9
            java.io.File r3 = new java.io.File     // Catch: java.lang.Exception -> L9
            r3.<init>(r2)     // Catch: java.lang.Exception -> L9
            boolean r2 = r3.exists()     // Catch: java.lang.Exception -> L9
            if (r2 != 0) goto L108
            java.io.File r2 = new java.io.File     // Catch: java.lang.Exception -> L9
            r2.<init>(r8)     // Catch: java.lang.Exception -> L9
            boolean r8 = r2.exists()     // Catch: java.lang.Exception -> L9
            if (r8 != 0) goto Lfb
            r2.mkdirs()     // Catch: java.lang.Exception -> L9
        Lfb:
            boolean r8 = r3.createNewFile()     // Catch: java.lang.Exception -> L9
            if (r8 != 0) goto L102
            goto L103
        L102:
            r1 = r3
        L103:
            r7.a(r1, r9, r0)     // Catch: java.lang.Exception -> L9
            goto L9
        L108:
            java.io.RandomAccessFile r8 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> L9
            java.lang.String r1 = "rw"
            r8.<init>(r3, r1)     // Catch: java.lang.Exception -> L9
            r1 = 300(0x12c, double:1.48E-321)
            r8.seek(r1)     // Catch: java.lang.Exception -> L9
            long r1 = r8.readLong()     // Catch: java.lang.Exception -> L9
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L9
            long r4 = r4 - r1
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 <= 0) goto L127
            r7.a(r3, r9, r0)     // Catch: java.lang.Exception -> L9
        L127:
            r8.close()     // Catch: java.lang.Exception -> L9
            goto L9
    }
}
