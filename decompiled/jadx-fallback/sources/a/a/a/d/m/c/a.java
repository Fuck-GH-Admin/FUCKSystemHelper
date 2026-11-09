package a.a.a.d.m.c;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public static a.a.a.d.m.c.a j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.a.a.d.m.c.a.d f188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.String f189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f190c;
    public java.lang.String d;
    public java.lang.String e;
    public boolean f;
    public java.util.HashMap<java.lang.String, a.a.a.d.m.c.a.e> g;
    public java.util.HashMap<java.lang.String, double[][]> h;
    public a.a.a.d.m.c.a.e i;

    /* JADX INFO: renamed from: a.a.a.d.m.c.a$a, reason: collision with other inner class name */
    public class C0008a implements java.io.FilenameFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f191a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.a.a.d.m.c.a f192b;

        public C0008a(a.a.a.d.m.c.a r1, java.lang.String r2) {
                r0 = this;
                r0.f192b = r1
                r0.f191a = r2
                r0.<init>()
                return
        }

        @Override // java.io.FilenameFilter
        public boolean accept(java.io.File r2, java.lang.String r3) {
                r1 = this;
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                a.a.a.d.m.c.a r0 = r1.f192b
                java.lang.String r1 = r1.f191a
                a.a.a.d.m.c.a.a(r0, r1)
                r2.append(r1)
                java.lang.String r1 = "_"
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                boolean r1 = r3.startsWith(r1)
                if (r1 == 0) goto L20
                r1 = 1
                return r1
            L20:
                r1 = 0
                return r1
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double f193a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double f194b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public double f195c;
        public double d;
        public double e;
        public double f;
        public double g;
        public double h;

        public b(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.a(r1)
                return
        }

        public void a(java.lang.String r3) {
                r2 = this;
                java.lang.String r3 = r3.trim()
                java.lang.String r0 = "\\|"
                java.lang.String[] r3 = r3.split(r0)
                r0 = 0
                r0 = r3[r0]
                java.lang.Double r0 = java.lang.Double.valueOf(r0)
                double r0 = r0.doubleValue()
                r2.f193a = r0
                r0 = 1
                r0 = r3[r0]
                java.lang.Double r0 = java.lang.Double.valueOf(r0)
                double r0 = r0.doubleValue()
                r2.f194b = r0
                r0 = 2
                r0 = r3[r0]
                java.lang.Double r0 = java.lang.Double.valueOf(r0)
                double r0 = r0.doubleValue()
                r2.f195c = r0
                r0 = 3
                r0 = r3[r0]
                java.lang.Double r0 = java.lang.Double.valueOf(r0)
                double r0 = r0.doubleValue()
                r2.d = r0
                r0 = 4
                r0 = r3[r0]
                java.lang.Double r0 = java.lang.Double.valueOf(r0)
                double r0 = r0.doubleValue()
                r2.e = r0
                r0 = 5
                r0 = r3[r0]
                java.lang.Double r0 = java.lang.Double.valueOf(r0)
                double r0 = r0.doubleValue()
                r2.f = r0
                r0 = 6
                r0 = r3[r0]
                java.lang.Double r0 = java.lang.Double.valueOf(r0)
                double r0 = r0.doubleValue()
                r2.g = r0
                r0 = 7
                r3 = r3[r0]
                java.lang.Double r3 = java.lang.Double.valueOf(r3)
                double r0 = r3.doubleValue()
                r2.h = r0
                return
        }
    }

    public class c extends java.lang.Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public java.lang.String f196b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public java.lang.String f197c;
        public final /* synthetic */ a.a.a.d.m.c.a d;

        public c(a.a.a.d.m.c.a r1, java.lang.String r2, java.lang.String r3) {
                r0 = this;
                r0.d = r1
                r0.<init>()
                r0.f196b = r2
                r0.f197c = r3
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r7 = this;
                r0 = 0
                java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L137
                a.a.a.d.m.c.a r2 = r7.d     // Catch: java.lang.Exception -> L137
                java.lang.String r2 = a.a.a.d.m.c.a.a(r2)     // Catch: java.lang.Exception -> L137
                r1.<init>(r2)     // Catch: java.lang.Exception -> L137
                boolean r2 = r1.exists()     // Catch: java.lang.Exception -> L137
                if (r2 == 0) goto L18
                boolean r2 = r1.isDirectory()     // Catch: java.lang.Exception -> L137
                if (r2 != 0) goto L1b
            L18:
                r1.mkdirs()     // Catch: java.lang.Exception -> L137
            L1b:
                javax.net.ssl.SSLSocketFactory r2 = a.a.a.i.i.g()     // Catch: java.lang.Exception -> L137
                javax.net.ssl.HttpsURLConnection.setDefaultSSLSocketFactory(r2)     // Catch: java.lang.Exception -> L137
                java.net.URL r2 = new java.net.URL     // Catch: java.lang.Exception -> L137
                java.lang.String r3 = a.a.a.i.d.d     // Catch: java.lang.Exception -> L137
                r2.<init>(r3)     // Catch: java.lang.Exception -> L137
                java.net.URLConnection r3 = r2.openConnection()     // Catch: java.lang.Exception -> L137
                javax.net.ssl.HttpsURLConnection r3 = (javax.net.ssl.HttpsURLConnection) r3     // Catch: java.lang.Exception -> L137
                r4 = 1
                r3.setDoInput(r4)     // Catch: java.lang.Exception -> L137
                r3.setDoOutput(r4)     // Catch: java.lang.Exception -> L137
                java.lang.String r5 = "POST"
                r3.setRequestMethod(r5)     // Catch: java.lang.Exception -> L137
                a.a.a.d.m.c.a$f r5 = new a.a.a.d.m.c.a$f     // Catch: java.lang.Exception -> L137
                r5.<init>(r2)     // Catch: java.lang.Exception -> L137
                r3.setHostnameVerifier(r5)     // Catch: java.lang.Exception -> L137
                java.lang.String r2 = "Accept-encoding"
                java.lang.String r5 = "gzip"
                r3.addRequestProperty(r2, r5)     // Catch: java.lang.Exception -> L137
                java.io.OutputStream r2 = r3.getOutputStream()     // Catch: java.lang.Exception -> L137
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L137
                r5.<init>()     // Catch: java.lang.Exception -> L137
                java.lang.String r6 = "bldg="
                r5.append(r6)     // Catch: java.lang.Exception -> L137
                java.lang.String r6 = r7.f196b     // Catch: java.lang.Exception -> L137
                r5.append(r6)     // Catch: java.lang.Exception -> L137
                java.lang.String r6 = "&md5="
                r5.append(r6)     // Catch: java.lang.Exception -> L137
                java.lang.String r6 = r7.f197c     // Catch: java.lang.Exception -> L137
                if (r6 != 0) goto L68
                java.lang.String r6 = "null"
            L68:
                r5.append(r6)     // Catch: java.lang.Exception -> L137
                java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L137
                byte[] r5 = r5.getBytes()     // Catch: java.lang.Exception -> L137
                r2.write(r5)     // Catch: java.lang.Exception -> L137
                int r2 = r3.getResponseCode()     // Catch: java.lang.Exception -> L137
                r5 = 0
                r6 = 200(0xc8, float:2.8E-43)
                if (r2 != r6) goto Ld8
                java.lang.String r2 = "Hash"
                java.lang.String r2 = r3.getHeaderField(r2)     // Catch: java.lang.Exception -> L137
                java.io.InputStream r3 = r3.getInputStream()     // Catch: java.lang.Exception -> L137
                java.io.File r4 = new java.io.File     // Catch: java.lang.Exception -> L137
                a.a.a.d.m.c.a r5 = r7.d     // Catch: java.lang.Exception -> L137
                java.lang.String r6 = r7.f196b     // Catch: java.lang.Exception -> L137
                java.lang.String r5 = a.a.a.d.m.c.a.a(r5, r6, r2)     // Catch: java.lang.Exception -> L137
                r4.<init>(r1, r5)     // Catch: java.lang.Exception -> L137
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L137
                r1.<init>(r4)     // Catch: java.lang.Exception -> L137
                r5 = 1024(0x400, float:1.435E-42)
                byte[] r5 = new byte[r5]     // Catch: java.lang.Exception -> L137
            L9f:
                int r6 = r3.read(r5)     // Catch: java.lang.Exception -> L137
                if (r6 < 0) goto La9
                r1.write(r5, r0, r6)     // Catch: java.lang.Exception -> L137
                goto L9f
            La9:
                r1.flush()     // Catch: java.lang.Exception -> L137
                r1.close()     // Catch: java.lang.Exception -> L137
                java.lang.String r1 = a.a.a.d.m.c.a.a(r4)     // Catch: java.lang.Exception -> L137
                boolean r1 = r1.equalsIgnoreCase(r2)     // Catch: java.lang.Exception -> L137
                if (r1 == 0) goto Ld2
                a.a.a.d.m.c.a r1 = r7.d     // Catch: java.lang.Exception -> L137
                java.lang.String r2 = r7.f196b     // Catch: java.lang.Exception -> L137
                java.lang.String r3 = r7.f197c     // Catch: java.lang.Exception -> L137
                a.a.a.d.m.c.a.b(r1, r2, r3)     // Catch: java.lang.Exception -> L137
                a.a.a.d.m.c.a r1 = r7.d     // Catch: java.lang.Exception -> L137
                java.lang.String r2 = r7.f196b     // Catch: java.lang.Exception -> L137
                a.a.a.d.m.c.a.b(r1, r2)     // Catch: java.lang.Exception -> L137
                a.a.a.d.m.c.a r1 = r7.d     // Catch: java.lang.Exception -> L137
                boolean r1 = a.a.a.d.m.c.a.b(r1)     // Catch: java.lang.Exception -> L137
                java.lang.String r5 = "OK"
                goto L125
            Ld2:
                r4.delete()     // Catch: java.lang.Exception -> L137
                java.lang.String r1 = "Download failed"
                goto L123
            Ld8:
                r1 = 304(0x130, float:4.26E-43)
                if (r2 != r1) goto L107
                a.a.a.d.m.c.a r1 = r7.d     // Catch: java.lang.Exception -> L137
                java.lang.String r2 = r7.f196b     // Catch: java.lang.Exception -> L137
                a.a.a.d.m.c.a.b(r1, r2)     // Catch: java.lang.Exception -> L137
                a.a.a.d.m.c.a r1 = r7.d     // Catch: java.lang.Exception -> L137
                boolean r1 = a.a.a.d.m.c.a.b(r1)     // Catch: java.lang.Exception -> L137
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L137
                r2.<init>()     // Catch: java.lang.Exception -> L137
                java.lang.String r3 = "No roadnet update for "
                r2.append(r3)     // Catch: java.lang.Exception -> L137
                java.lang.String r3 = r7.f196b     // Catch: java.lang.Exception -> L137
                r2.append(r3)     // Catch: java.lang.Exception -> L137
                java.lang.String r3 = ","
                r2.append(r3)     // Catch: java.lang.Exception -> L137
                java.lang.String r3 = r7.f197c     // Catch: java.lang.Exception -> L137
                r2.append(r3)     // Catch: java.lang.Exception -> L137
                java.lang.String r5 = r2.toString()     // Catch: java.lang.Exception -> L137
                goto L125
            L107:
                r1 = 204(0xcc, float:2.86E-43)
                if (r2 != r1) goto L124
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L137
                r1.<init>()     // Catch: java.lang.Exception -> L137
                java.lang.String r2 = "Not found bldg "
                r1.append(r2)     // Catch: java.lang.Exception -> L137
                java.lang.String r2 = r7.f196b     // Catch: java.lang.Exception -> L137
                r1.append(r2)     // Catch: java.lang.Exception -> L137
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L137
                a.a.a.d.m.c.a r2 = r7.d     // Catch: java.lang.Exception -> L137
                a.a.a.d.m.c.a.a(r2, r4)     // Catch: java.lang.Exception -> L137
            L123:
                r5 = r1
            L124:
                r1 = r0
            L125:
                a.a.a.d.m.c.a r2 = r7.d     // Catch: java.lang.Exception -> L137
                a.a.a.d.m.c.a$d r2 = a.a.a.d.m.c.a.c(r2)     // Catch: java.lang.Exception -> L137
                if (r2 == 0) goto L13b
                a.a.a.d.m.c.a r2 = r7.d     // Catch: java.lang.Exception -> L137
                a.a.a.d.m.c.a$d r2 = a.a.a.d.m.c.a.c(r2)     // Catch: java.lang.Exception -> L137
                r2.a(r1, r5)     // Catch: java.lang.Exception -> L137
                goto L13b
            L137:
                r1 = move-exception
                r1.printStackTrace()
            L13b:
                a.a.a.d.m.c.a r7 = r7.d
                a.a.a.d.m.c.a.b(r7, r0)
                return
        }
    }

    public interface d {
        void a(boolean r1, java.lang.String r2);
    }

    public static class e implements java.io.Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public java.lang.String f198b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public java.lang.String f199c;
        public a.a.a.d.m.c.a.b d;
        public a.a.a.d.m.c.a.b e;
        public a.a.a.d.m.c.a.b f;
        public a.a.a.d.m.c.a.b g;
        public short[][] h;
        public java.lang.String i;

        public e(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                java.lang.String r1 = "0|3"
                r0.f199c = r1
                a.a.a.d.m.c.a$b r1 = r0.e
                r0.g = r1
                java.lang.String r1 = "gcj02"
                r0.i = r1
                return
        }

        public double a(double r3) {
                r2 = this;
                a.a.a.d.m.c.a$b r2 = r2.g
                double r0 = r2.f
                double r3 = r3 + r0
                double r0 = r2.e
                double r3 = r3 * r0
                return r3
        }

        public a.a.a.d.m.c.a.b a() {
                r0 = this;
                a.a.a.d.m.c.a$b r0 = r0.g
                return r0
        }

        public void a(java.lang.String r8) {
                r7 = this;
                java.lang.String r0 = "\\t"
                java.lang.String[] r8 = r8.split(r0)
                r0 = 1
                r1 = r8[r0]
                r7.f198b = r1
                a.a.a.d.m.c.a$b r1 = new a.a.a.d.m.c.a$b
                r2 = 2
                r3 = r8[r2]
                r1.<init>(r3)
                r7.d = r1
                a.a.a.d.m.c.a$b r1 = new a.a.a.d.m.c.a$b
                r3 = 3
                r3 = r8[r3]
                r1.<init>(r3)
                r7.f = r1
                a.a.a.d.m.c.a$b r1 = new a.a.a.d.m.c.a$b
                r3 = 4
                r3 = r8[r3]
                r1.<init>(r3)
                r7.e = r1
                r7.g = r1
                double r3 = r1.g
                int r3 = (int) r3
                double r4 = r1.h
                int r1 = (int) r4
                int[] r2 = new int[r2]
                r2[r0] = r1
                r0 = 0
                r2[r0] = r3
                java.lang.Class<short> r1 = short.class
                java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)
                short[][] r1 = (short[][]) r1
                r7.h = r1
                r1 = r0
            L43:
                double r2 = (double) r1
                a.a.a.d.m.c.a$b r4 = r7.g
                double r4 = r4.g
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 >= 0) goto L6f
                r2 = r0
            L4d:
                double r3 = (double) r2
                a.a.a.d.m.c.a$b r5 = r7.g
                double r5 = r5.h
                int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r3 >= 0) goto L6c
                int r3 = (int) r5
                int r3 = r3 * r1
                int r3 = r3 + r2
                short[][] r4 = r7.h
                r4 = r4[r1]
                r5 = 5
                r5 = r8[r5]
                char r3 = r5.charAt(r3)
                int r3 = r3 + (-48)
                short r3 = (short) r3
                r4[r2] = r3
                int r2 = r2 + 1
                goto L4d
            L6c:
                int r1 = r1 + 1
                goto L43
            L6f:
                int r0 = r8.length
                r1 = 7
                if (r0 < r1) goto L78
                r0 = 6
                r8 = r8[r0]
                r7.f199c = r8
            L78:
                return
        }

        public double b(double r3) {
                r2 = this;
                a.a.a.d.m.c.a$b r2 = r2.g
                double r0 = r2.d
                double r3 = r3 + r0
                double r0 = r2.f195c
                double r3 = r3 * r0
                return r3
        }

        public void b(java.lang.String r2) {
                r1 = this;
                if (r2 == 0) goto L2f
                java.lang.String r2 = r2.toLowerCase()
                r1.i = r2
                java.lang.String r0 = "wgs84"
                boolean r2 = r2.startsWith(r0)
                if (r2 == 0) goto L15
                a.a.a.d.m.c.a$b r2 = r1.d
            L12:
                r1.g = r2
                goto L2f
            L15:
                java.lang.String r2 = r1.i
                java.lang.String r0 = "bd09"
                boolean r2 = r2.startsWith(r0)
                if (r2 == 0) goto L22
                a.a.a.d.m.c.a$b r2 = r1.f
                goto L12
            L22:
                java.lang.String r2 = r1.i
                java.lang.String r0 = "gcj02"
                boolean r2 = r2.startsWith(r0)
                if (r2 == 0) goto L2f
                a.a.a.d.m.c.a$b r2 = r1.e
                goto L12
            L2f:
                return
        }

        public double c(double r3) {
                r2 = this;
                a.a.a.d.m.c.a$b r2 = r2.g
                double r0 = r2.f195c
                double r3 = r3 / r0
                double r0 = r2.d
                double r3 = r3 - r0
                return r3
        }

        public double d(double r3) {
                r2 = this;
                a.a.a.d.m.c.a$b r2 = r2.g
                double r0 = r2.e
                double r3 = r3 / r0
                double r0 = r2.f
                double r3 = r3 - r0
                return r3
        }
    }

    public static class f implements javax.net.ssl.HostnameVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public java.net.URL f200a;

        public f(java.net.URL r1) {
                r0 = this;
                r0.<init>()
                r0.f200a = r1
                return
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(java.lang.String r1, javax.net.ssl.SSLSession r2) {
                r0 = this;
                java.net.URL r0 = r0.f200a
                java.lang.String r0 = r0.getHost()
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto Le
                r0 = 1
                return r0
            Le:
                r0 = 0
                return r0
        }
    }

    public a(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f190c = r0
            java.lang.String r1 = "rn"
            r2.d = r1
            java.lang.String r1 = "gcj02"
            r2.e = r1
            r2.f = r0
            r0 = 0
            r2.i = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.g = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.h = r0
            java.io.File r0 = new java.io.File
            java.io.File r3 = r3.getCacheDir()
            java.lang.String r1 = r2.d
            r0.<init>(r3, r1)
            java.lang.String r3 = r0.getAbsolutePath()
            r2.d = r3
            return
    }

    public static a.a.a.d.m.c.a a(android.content.Context r1) {
            a.a.a.d.m.c.a r0 = a.a.a.d.m.c.a.j
            if (r0 != 0) goto Lb
            a.a.a.d.m.c.a r0 = new a.a.a.d.m.c.a
            r0.<init>(r1)
            a.a.a.d.m.c.a.j = r0
        Lb:
            a.a.a.d.m.c.a r1 = a.a.a.d.m.c.a.j
            return r1
    }

    public static /* synthetic */ java.lang.String a(a.a.a.d.m.c.a r0) {
            java.lang.String r0 = r0.d
            return r0
    }

    public static /* synthetic */ java.lang.String a(a.a.a.d.m.c.a r0, java.lang.String r1) {
            r0.b(r1)
            return r1
    }

    public static /* synthetic */ java.lang.String a(a.a.a.d.m.c.a r0, java.lang.String r1, java.lang.String r2) {
            java.lang.String r0 = r0.b(r1, r2)
            return r0
    }

    public static java.lang.String a(java.io.File r8) {
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L4f
            r1.<init>(r8)     // Catch: java.lang.Exception -> L4f
            java.nio.channels.FileChannel r2 = r1.getChannel()     // Catch: java.lang.Exception -> L4f
            java.nio.channels.FileChannel$MapMode r3 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Exception -> L4f
            r4 = 0
            long r6 = r8.length()     // Catch: java.lang.Exception -> L4f
            java.nio.MappedByteBuffer r8 = r2.map(r3, r4, r6)     // Catch: java.lang.Exception -> L4f
            java.lang.String r2 = "MD5"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)     // Catch: java.lang.Exception -> L4f
            r2.update(r8)     // Catch: java.lang.Exception -> L4f
            java.math.BigInteger r8 = new java.math.BigInteger     // Catch: java.lang.Exception -> L4f
            r3 = 1
            byte[] r2 = r2.digest()     // Catch: java.lang.Exception -> L4f
            r8.<init>(r3, r2)     // Catch: java.lang.Exception -> L4f
            r2 = 16
            java.lang.String r0 = r8.toString(r2)     // Catch: java.lang.Exception -> L4f
            r1.close()     // Catch: java.lang.Exception -> L4f
            int r8 = r0.length()     // Catch: java.lang.Exception -> L4f
            int r8 = 32 - r8
        L38:
            if (r8 <= 0) goto L4e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4f
            r1.<init>()     // Catch: java.lang.Exception -> L4f
            java.lang.String r2 = "0"
            r1.append(r2)     // Catch: java.lang.Exception -> L4f
            r1.append(r0)     // Catch: java.lang.Exception -> L4f
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> L4f
            int r8 = r8 + (-1)
            goto L38
        L4e:
            return r0
        L4f:
            r8 = move-exception
            r8.printStackTrace()
            return r0
    }

    public static /* synthetic */ boolean a(a.a.a.d.m.c.a r0, boolean r1) {
            r0.f = r1
            return r1
    }

    public static /* synthetic */ java.lang.String b(a.a.a.d.m.c.a r0, java.lang.String r1) {
            r0.f189b = r1
            return r1
    }

    public static /* synthetic */ void b(a.a.a.d.m.c.a r0, java.lang.String r1, java.lang.String r2) {
            r0.a(r1, r2)
            return
    }

    public static /* synthetic */ boolean b(a.a.a.d.m.c.a r0) {
            boolean r0 = r0.c()
            return r0
    }

    public static /* synthetic */ boolean b(a.a.a.d.m.c.a r0, boolean r1) {
            r0.f190c = r1
            return r1
    }

    public static /* synthetic */ a.a.a.d.m.c.a.d c(a.a.a.d.m.c.a r0) {
            a.a.a.d.m.c.a$d r0 = r0.f188a
            return r0
    }

    public static a.a.a.d.m.c.a d() {
            a.a.a.d.m.c.a r0 = a.a.a.d.m.c.a.j
            return r0
    }

    public void a() {
            r1 = this;
            java.util.HashMap<java.lang.String, a.a.a.d.m.c.a$e> r0 = r1.g
            r0.clear()
            java.util.HashMap<java.lang.String, double[][]> r0 = r1.h
            r0.clear()
            r0 = 0
            r1.f189b = r0
            r0 = 0
            r1.f190c = r0
            return
    }

    public void a(double r22, double r24) {
            r21 = this;
            r0 = r21
            r10 = r22
            r12 = r24
            a.a.a.d.m.c.a$e r1 = r0.i
            if (r1 != 0) goto L7b
            r1 = 2
            float[] r14 = new float[r1]
            float[] r15 = new float[r1]
            r16 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r7 = r10 + r16
            double r18 = r12 + r16
            r1 = r24
            r3 = r22
            r5 = r24
            r9 = r14
            android.location.Location.distanceBetween(r1, r3, r5, r7, r9)
            r20 = 0
            r1 = r14[r20]
            double r1 = (double) r1
            double r7 = r1 / r16
            r1 = r24
            r5 = r18
            r12 = r7
            r7 = r22
            r9 = r15
            android.location.Location.distanceBetween(r1, r3, r5, r7, r9)
            r1 = r15[r20]
            double r1 = (double) r1
            double r1 = r1 / r16
            a.a.a.d.m.c.a$e r3 = new a.a.a.d.m.c.a$e
            java.lang.String r4 = "outdoor"
            r3.<init>(r4)
            r0.i = r3
            java.lang.String r0 = "out"
            r3.f198b = r0
            a.a.a.d.m.c.a$b r0 = new a.a.a.d.m.c.a$b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "0|1.0|"
            r4.append(r5)
            r4.append(r12)
            java.lang.String r5 = "|"
            r4.append(r5)
            double r6 = -r10
            r4.append(r6)
            r4.append(r5)
            r4.append(r1)
            r4.append(r5)
            r1 = r24
            double r1 = -r1
            r4.append(r1)
            java.lang.String r1 = "|0|0"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r0.<init>(r1)
            r3.g = r0
        L7b:
            return
    }

    public final void a(java.lang.String r3) {
            r2 = this;
            boolean r0 = r2.f190c
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r2.f190c = r0
            java.lang.String r0 = r2.d(r3)
            a.a.a.d.m.c.a$c r1 = new a.a.a.d.m.c.a$c
            r1.<init>(r2, r3, r0)
            r1.start()
            return
    }

    public void a(java.lang.String r2, a.a.a.d.m.c.a.d r3) {
            r1 = this;
            java.lang.String r0 = r1.f189b
            if (r0 == 0) goto Lb
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lb
            return
        Lb:
            boolean r0 = r1.f
            if (r0 == 0) goto L10
            return
        L10:
            r1.f188a = r3
            boolean r3 = r1.h(r2)
            if (r3 == 0) goto L2e
            boolean r3 = r1.i(r2)
            if (r3 != 0) goto L2e
            r1.f189b = r2
            r1.c()
            a.a.a.d.m.c.a$d r1 = r1.f188a
            if (r1 == 0) goto L2d
            r2 = 1
            java.lang.String r3 = "OK"
            r1.a(r2, r3)
        L2d:
            return
        L2e:
            r1.a(r2)
            return
    }

    public final void a(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L29
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L29
            r1.<init>()     // Catch: java.lang.Exception -> L29
            java.lang.String r2 = r3.d     // Catch: java.lang.Exception -> L29
            r1.append(r2)     // Catch: java.lang.Exception -> L29
            java.lang.String r2 = "/"
            r1.append(r2)     // Catch: java.lang.Exception -> L29
            java.lang.String r3 = r3.b(r4, r5)     // Catch: java.lang.Exception -> L29
            r1.append(r3)     // Catch: java.lang.Exception -> L29
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Exception -> L29
            r0.<init>(r3)     // Catch: java.lang.Exception -> L29
            boolean r3 = r0.exists()     // Catch: java.lang.Exception -> L29
            if (r3 == 0) goto L2d
            r0.delete()     // Catch: java.lang.Exception -> L29
            goto L2d
        L29:
            r3 = move-exception
            r3.printStackTrace()
        L2d:
            return
    }

    public a.a.a.d.m.c.a.e b() {
            r0 = this;
            a.a.a.d.m.c.a$e r0 = r0.i
            return r0
    }

    public final java.lang.String b(java.lang.String r1) {
            r0 = this;
            return r1
    }

    public final java.lang.String b(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1.b(r2)
            r0.append(r2)
            java.lang.String r1 = "_"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public final java.util.ArrayList<java.lang.Double> c(java.lang.String r5) {
            r4 = this;
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0 = 0
        L6:
            int r1 = r5.length()
            if (r0 >= r1) goto L58
            char r1 = r5.charAt(r0)
            r2 = 44
            if (r1 != r2) goto L26
            int r1 = r0 + 1
            int r0 = r0 + 2
            java.lang.String r1 = r5.substring(r1, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r1 = r1.intValue()
            double r1 = (double) r1
            goto L50
        L26:
            char r1 = r5.charAt(r0)
            r2 = 46
            if (r1 != r2) goto L3f
            int r1 = r0 + 1
            int r0 = r0 + 4
            java.lang.String r1 = r5.substring(r1, r0)
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            double r1 = r1.doubleValue()
            goto L50
        L3f:
            int r1 = r0 + 2
            java.lang.String r0 = r5.substring(r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = r0.intValue()
            double r2 = (double) r0
            r0 = r1
            r1 = r2
        L50:
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r4.add(r1)
            goto L6
        L58:
            return r4
    }

    public final boolean c() {
            r6 = this;
            java.lang.String r0 = r6.f189b
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.io.File r0 = r6.e(r0)
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>()
            boolean r0 = a.a.a.d.m.c.c.a(r0, r2)
            if (r0 == 0) goto L79
            java.util.HashMap<java.lang.String, a.a.a.d.m.c.a$e> r0 = r6.g
            r0.clear()
            java.util.HashMap<java.lang.String, double[][]> r0 = r6.h
            r0.clear()
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
            byte[] r2 = r2.toByteArray()
            r4.<init>(r2)
            r3.<init>(r4)
            r0.<init>(r3)
        L32:
            r2 = 1
            java.lang.String r3 = r0.readLine()     // Catch: java.io.IOException -> L74
            if (r3 == 0) goto L70
            java.lang.String r4 = "\\t"
            java.lang.String[] r4 = r3.split(r4)     // Catch: java.io.IOException -> L74
            r4 = r4[r2]     // Catch: java.io.IOException -> L74
            java.lang.String r5 = "_"
            java.lang.String[] r4 = r4.split(r5)     // Catch: java.io.IOException -> L74
            r4 = r4[r1]     // Catch: java.io.IOException -> L74
            java.lang.String r5 = "geo"
            boolean r4 = r4.equals(r5)     // Catch: java.io.IOException -> L74
            if (r4 == 0) goto L55
            r6.j(r3)     // Catch: java.io.IOException -> L74
            goto L32
        L55:
            a.a.a.d.m.c.a$e r4 = new a.a.a.d.m.c.a$e     // Catch: java.io.IOException -> L74
            java.lang.String r5 = r6.f189b     // Catch: java.io.IOException -> L74
            r4.<init>(r5)     // Catch: java.io.IOException -> L74
            r4.a(r3)     // Catch: java.io.IOException -> L74
            java.lang.String r3 = r6.e     // Catch: java.io.IOException -> L74
            r4.b(r3)     // Catch: java.io.IOException -> L74
            java.util.HashMap<java.lang.String, a.a.a.d.m.c.a$e> r3 = r6.g     // Catch: java.io.IOException -> L74
            java.lang.String r5 = r4.f198b     // Catch: java.io.IOException -> L74
            java.lang.String r5 = r5.toLowerCase()     // Catch: java.io.IOException -> L74
            r3.put(r5, r4)     // Catch: java.io.IOException -> L74
            goto L32
        L70:
            r0.close()     // Catch: java.io.IOException -> L74
            goto L78
        L74:
            r6 = move-exception
            r6.printStackTrace()
        L78:
            return r2
        L79:
            return r1
    }

    public final java.lang.String d(java.lang.String r4) {
            r3 = this;
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r3.d
            r0.<init>(r1)
            boolean r1 = r0.exists()
            r2 = 0
            if (r1 == 0) goto L47
            boolean r1 = r0.isDirectory()
            if (r1 != 0) goto L15
            goto L47
        L15:
            a.a.a.d.m.c.a$a r1 = new a.a.a.d.m.c.a$a
            r1.<init>(r3, r4)
            java.io.File[] r3 = r0.listFiles(r1)
            r4 = 0
            if (r3 == 0) goto L3a
            int r0 = r3.length
            r1 = 1
            if (r0 == r1) goto L26
            goto L3a
        L26:
            r3 = r3[r4]
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = "_"
            java.lang.String[] r3 = r3.split(r4)
            int r4 = r3.length
            r0 = 2
            if (r4 >= r0) goto L37
            return r2
        L37:
            r3 = r3[r1]
            return r3
        L3a:
            if (r3 == 0) goto L47
            int r0 = r3.length
            if (r4 >= r0) goto L47
            r0 = r3[r4]
            r0.delete()
            int r4 = r4 + 1
            goto L3a
        L47:
            return r2
    }

    public final java.io.File e(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = r4.d(r5)
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r4.d
            r2.append(r3)
            java.lang.String r3 = "/"
            r2.append(r3)
            java.lang.String r4 = r4.b(r5, r0)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            return r1
    }

    public double[][] f(java.lang.String r1) {
            r0 = this;
            java.util.HashMap<java.lang.String, double[][]> r0 = r0.h
            java.lang.String r1 = r1.toLowerCase()
            java.lang.Object r0 = r0.get(r1)
            double[][] r0 = (double[][]) r0
            return r0
    }

    public a.a.a.d.m.c.a.e g(java.lang.String r1) {
            r0 = this;
            java.util.HashMap<java.lang.String, a.a.a.d.m.c.a$e> r0 = r0.g
            java.lang.String r1 = r1.toLowerCase()
            java.lang.Object r0 = r0.get(r1)
            a.a.a.d.m.c.a$e r0 = (a.a.a.d.m.c.a.e) r0
            return r0
    }

    public final boolean h(java.lang.String r3) {
            r2 = this;
            java.io.File r2 = r2.e(r3)
            boolean r3 = r2.exists()
            if (r3 == 0) goto L16
            long r2 = r2.length()
            r0 = 0
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 <= 0) goto L16
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            return r2
    }

    public final boolean i(java.lang.String r3) {
            r2 = this;
            java.io.File r2 = r2.e(r3)
            long r2 = r2.lastModified()
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r2
            r2 = 1296000000(0x4d3f6400, double:6.40309077E-315)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L16
            r2 = 1
            return r2
        L16:
            r2 = 0
            return r2
    }

    public final void j(java.lang.String r12) {
            r11 = this;
            java.lang.String r0 = "\\t"
            java.lang.String[] r12 = r12.split(r0)
            r0 = 1
            r1 = r12[r0]
            java.lang.String r2 = "_"
            java.lang.String[] r1 = r1.split(r2)
            r1 = r1[r0]
            java.lang.String r1 = r1.toLowerCase()
            java.util.HashMap<java.lang.String, a.a.a.d.m.c.a$e> r2 = r11.g     // Catch: java.lang.Exception -> L9d
            boolean r2 = r2.containsKey(r1)     // Catch: java.lang.Exception -> L9d
            if (r2 != 0) goto L1e
            return
        L1e:
            r2 = 5
            r12 = r12[r2]     // Catch: java.lang.Exception -> L9d
            java.util.ArrayList r12 = r11.c(r12)     // Catch: java.lang.Exception -> L9d
            java.util.HashMap<java.lang.String, a.a.a.d.m.c.a$e> r2 = r11.g     // Catch: java.lang.Exception -> L9d
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Exception -> L9d
            a.a.a.d.m.c.a$e r2 = (a.a.a.d.m.c.a.e) r2     // Catch: java.lang.Exception -> L9d
            short[][] r2 = r2.h     // Catch: java.lang.Exception -> L9d
            int r2 = r2.length     // Catch: java.lang.Exception -> L9d
            java.util.HashMap<java.lang.String, a.a.a.d.m.c.a$e> r3 = r11.g     // Catch: java.lang.Exception -> L9d
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Exception -> L9d
            a.a.a.d.m.c.a$e r3 = (a.a.a.d.m.c.a.e) r3     // Catch: java.lang.Exception -> L9d
            short[][] r3 = r3.h     // Catch: java.lang.Exception -> L9d
            r4 = 0
            r3 = r3[r4]     // Catch: java.lang.Exception -> L9d
            int r3 = r3.length     // Catch: java.lang.Exception -> L9d
            r5 = 2
            int[] r5 = new int[r5]     // Catch: java.lang.Exception -> L9d
            r5[r0] = r3     // Catch: java.lang.Exception -> L9d
            r5[r4] = r2     // Catch: java.lang.Exception -> L9d
            java.lang.Class<double> r0 = double.class
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r5)     // Catch: java.lang.Exception -> L9d
            double[][] r0 = (double[][]) r0     // Catch: java.lang.Exception -> L9d
            r5 = r4
            r6 = r5
        L4f:
            if (r5 >= r2) goto L93
            r7 = r4
        L52:
            if (r7 >= r3) goto L90
            java.util.HashMap<java.lang.String, a.a.a.d.m.c.a$e> r8 = r11.g     // Catch: java.lang.Exception -> L9d
            java.lang.Object r8 = r8.get(r1)     // Catch: java.lang.Exception -> L9d
            a.a.a.d.m.c.a$e r8 = (a.a.a.d.m.c.a.e) r8     // Catch: java.lang.Exception -> L9d
            short[][] r8 = r8.h     // Catch: java.lang.Exception -> L9d
            r8 = r8[r5]     // Catch: java.lang.Exception -> L9d
            short r8 = r8[r7]     // Catch: java.lang.Exception -> L9d
            if (r8 <= 0) goto L87
            java.util.HashMap<java.lang.String, a.a.a.d.m.c.a$e> r8 = r11.g     // Catch: java.lang.Exception -> L9d
            java.lang.Object r8 = r8.get(r1)     // Catch: java.lang.Exception -> L9d
            a.a.a.d.m.c.a$e r8 = (a.a.a.d.m.c.a.e) r8     // Catch: java.lang.Exception -> L9d
            short[][] r8 = r8.h     // Catch: java.lang.Exception -> L9d
            r8 = r8[r5]     // Catch: java.lang.Exception -> L9d
            short r8 = r8[r7]     // Catch: java.lang.Exception -> L9d
            r9 = 9
            if (r8 == r9) goto L87
            r8 = r0[r5]     // Catch: java.lang.Exception -> L9d
            java.lang.Object r9 = r12.get(r6)     // Catch: java.lang.Exception -> L9d
            java.lang.Double r9 = (java.lang.Double) r9     // Catch: java.lang.Exception -> L9d
            double r9 = r9.doubleValue()     // Catch: java.lang.Exception -> L9d
            r8[r7] = r9     // Catch: java.lang.Exception -> L9d
            int r6 = r6 + 1
            goto L8d
        L87:
            r8 = r0[r5]     // Catch: java.lang.Exception -> L9d
            r9 = 0
            r8[r7] = r9     // Catch: java.lang.Exception -> L9d
        L8d:
            int r7 = r7 + 1
            goto L52
        L90:
            int r5 = r5 + 1
            goto L4f
        L93:
            java.util.HashMap<java.lang.String, double[][]> r11 = r11.h     // Catch: java.lang.Exception -> L9d
            java.lang.String r12 = r1.toLowerCase()     // Catch: java.lang.Exception -> L9d
            r11.put(r12, r0)     // Catch: java.lang.Exception -> L9d
            goto La1
        L9d:
            r11 = move-exception
            r11.printStackTrace()
        La1:
            return
    }

    public void k(java.lang.String r1) {
            r0 = this;
            r0.e = r1
            return
    }
}
