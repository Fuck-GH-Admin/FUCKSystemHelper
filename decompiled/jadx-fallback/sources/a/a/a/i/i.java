package a.a.a.i;

/* JADX INFO: loaded from: classes.dex */
public class i {
    public static int A = 3;
    public static float A0 = 0.2f;
    public static int B = 10;
    public static int B0 = 0;
    public static int C = 2;
    public static int[] C0 = null;
    public static int D = 7;
    public static boolean D0 = false;
    public static int E = 20;
    public static int E0 = 8;
    public static int F = 70;
    public static int F0 = 4000;
    public static int G = 120;
    public static int G0 = -1;
    public static float H = 2.0f;
    public static int H0 = 10;
    public static float I = 10.0f;
    public static int I0 = 3;
    public static float J = 50.0f;
    public static int J0 = 40;
    public static float K = 200.0f;
    public static double[] K0 = null;
    public static int L = 16;
    public static int L0 = 1;
    public static float M = 0.9f;
    public static int M0 = 1;
    public static int N = 10000;
    public static int N0 = 1;
    public static float O = 0.5f;
    public static java.lang.String O0 = null;
    public static float P = 0.0f;
    public static boolean P0 = false;
    public static float Q = 0.1f;
    public static java.lang.String Q0 = null;
    public static int R = 30;
    public static int R0 = 0;
    public static int S = 100;
    public static java.lang.String S0 = null;
    public static int T = 0;
    public static java.lang.String T0 = null;
    public static int U = 0;
    public static int V = 0;
    public static boolean W = true;
    public static boolean X = true;
    public static int Y = 20;
    public static int Z = 1000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f354a = false;
    public static int a0 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f355b = false;
    public static long b0 = 900000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f356c = 0;
    public static long c0 = 15;
    public static java.lang.String d = "no";
    public static long d0 = 300000;
    public static int e = 4;
    public static int e0 = 1000;
    public static boolean f = false;
    public static int f0 = 0;
    public static boolean g = false;
    public static int g0 = 30000;
    public static boolean h = false;
    public static int h0 = 30000;
    public static boolean i = false;
    public static float i0 = 10.0f;
    public static boolean j = false;
    public static float j0 = 6.0f;
    public static boolean k = false;
    public static float k0 = 10.0f;
    public static java.lang.String l = "";
    public static int l0 = 60;
    public static boolean m = true;
    public static int m0 = 70;
    public static int n = 3;
    public static int n0 = 6;
    public static double o = 0.0d;
    public static java.lang.String o0 = null;
    public static double p = 0.0d;
    public static boolean p0 = false;
    public static double q = 0.0d;
    public static int q0 = 16;
    public static double r = 0.0d;
    public static int r0 = 15;
    public static int s = 0;
    public static float s0 = 0.75f;
    public static byte[] t = null;
    public static double t0 = -0.10000000149011612d;
    public static boolean u = false;
    public static int u0 = 0;
    public static int v = 0;
    public static int v0 = 0;
    public static float w = 1.1f;
    public static int w0 = 1;
    public static float x = 2.2f;
    public static int x0 = 1;
    public static float y = 2.3f;
    public static int y0 = 0;
    public static float z = 3.8f;
    public static float z0 = 0.8f;

    public static class a implements javax.net.ssl.X509TrustManager {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(java.security.cert.X509Certificate[] r1, java.lang.String r2) {
                r0 = this;
                return
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(java.security.cert.X509Certificate[] r2, java.lang.String r3) {
                r1 = this;
                int r1 = r2.length
                r3 = 0
            L2:
                if (r3 >= r1) goto Lc
                r0 = r2[r3]
                r0.checkValidity()
                int r3 = r3 + 1
                goto L2
            Lc:
                return
        }

        @Override // javax.net.ssl.X509TrustManager
        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                r0 = this;
                r0 = 0
                java.security.cert.X509Certificate[] r0 = new java.security.cert.X509Certificate[r0]
                return r0
        }
    }

    static {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            a.a.a.i.i.O0 = r0
            r0 = 0
            a.a.a.i.i.P0 = r0
            r0 = 0
            a.a.a.i.i.Q0 = r0
            r1 = -1
            a.a.a.i.i.R0 = r1
            a.a.a.i.i.S0 = r0
            a.a.a.i.i.T0 = r0
            return
    }

    public static double a(double r10, double r12, double r14, double r16) {
            r0 = 1
            float[] r0 = new float[r0]
            r1 = r10
            r3 = r12
            r5 = r14
            r7 = r16
            r9 = r0
            android.location.Location.distanceBetween(r1, r3, r5, r7, r9)
            r1 = 0
            r0 = r0[r1]
            double r0 = (double) r0
            return r0
    }

    public static int a(android.content.Context r3) {
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            int r0 = a(r3, r0)
            java.lang.String r1 = "android.permission.ACCESS_COARSE_LOCATION"
            int r1 = a(r3, r1)
            r0 = r0 | r1
            int r1 = c(r3)
            r2 = 1
            if (r1 == 0) goto L17
            if (r0 != r2) goto L17
            goto L2c
        L17:
            int r1 = c(r3)
            if (r1 == 0) goto L21
            if (r0 == r2) goto L21
            r2 = -2
            goto L2c
        L21:
            int r3 = c(r3)
            if (r3 >= r2) goto L2b
            if (r0 != r2) goto L2b
            r2 = -1
            goto L2c
        L2b:
            r2 = 0
        L2c:
            return r2
    }

    public static int a(android.content.Context r4, java.lang.String r5) {
            r0 = 0
            r1 = 1
            int r2 = android.os.Process.myPid()     // Catch: java.lang.Exception -> L13
            int r3 = android.os.Process.myUid()     // Catch: java.lang.Exception -> L13
            int r4 = r4.checkPermission(r5, r2, r3)     // Catch: java.lang.Exception -> L13
            if (r4 != 0) goto L11
            goto L13
        L11:
            r4 = r0
            goto L14
        L13:
            r4 = r1
        L14:
            if (r4 != 0) goto L17
            return r0
        L17:
            return r1
    }

    public static int a(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == 0) goto L33
            java.lang.String r1 = ""
            boolean r2 = r4.equals(r1)
            if (r2 == 0) goto Ld
            goto L33
        Ld:
            int r2 = r4.indexOf(r5)
            r3 = -1
            if (r2 != r3) goto L15
            return r0
        L15:
            int r5 = r5.length()
            int r2 = r2 + r5
            int r5 = r4.indexOf(r6, r2)
            if (r5 != r3) goto L21
            return r0
        L21:
            java.lang.String r4 = r4.substring(r2, r5)
            if (r4 == 0) goto L33
            boolean r5 = r4.equals(r1)
            if (r5 == 0) goto L2e
            goto L33
        L2e:
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> L33
            return r4
        L33:
            return r0
    }

    public static long a(java.lang.String r4) {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch: java.lang.Exception -> L13
            java.lang.String r1 = "yyyy-MM-dd HH:mm:ss"
            r0.<init>(r1)     // Catch: java.lang.Exception -> L13
            java.util.Date r4 = r0.parse(r4)     // Catch: java.lang.Exception -> L13
            long r0 = r4.getTime()     // Catch: java.lang.Exception -> L13
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            goto L15
        L13:
            r0 = 0
        L15:
            return r0
    }

    public static java.lang.Object a(java.lang.Object r1, java.lang.String r2) {
            java.lang.Class r0 = r1.getClass()
            java.lang.reflect.Field r2 = r0.getDeclaredField(r2)
            r0 = 1
            r2.setAccessible(r0)
            java.lang.Object r1 = r2.get(r1)
            return r1
    }

    public static java.lang.String a() {
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
            if (r0 != 0) goto L3d
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 <= r1) goto L3d
            android.content.Context r1 = com.baidu.location.f.c()
            if (r1 == 0) goto L3d
            android.content.Context r0 = com.baidu.location.f.c()     // Catch: java.lang.Exception -> L3c
            java.lang.String r1 = android.os.Environment.DIRECTORY_MOVIES     // Catch: java.lang.Exception -> L3c
            java.io.File r0 = r0.getExternalFilesDir(r1)     // Catch: java.lang.Exception -> L3c
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Exception -> L3c
            goto L3d
        L3c:
            r0 = r2
        L3d:
            if (r0 == 0) goto L64
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L5f
            r1.<init>()     // Catch: java.lang.Exception -> L5f
            r1.append(r0)     // Catch: java.lang.Exception -> L5f
            java.lang.String r3 = "/baidu/tempdata"
            r1.append(r3)     // Catch: java.lang.Exception -> L5f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L5f
            java.io.File r3 = new java.io.File     // Catch: java.lang.Exception -> L5f
            r3.<init>(r1)     // Catch: java.lang.Exception -> L5f
            boolean r1 = r3.exists()     // Catch: java.lang.Exception -> L5f
            if (r1 != 0) goto L64
            r3.mkdirs()     // Catch: java.lang.Exception -> L5f
            goto L64
        L5f:
            r0 = move-exception
            r0.printStackTrace()
            goto L65
        L64:
            r2 = r0
        L65:
            return r2
    }

    public static java.lang.String a(a.a.a.g.a r6, a.a.a.g.k r7, android.location.Location r8, java.lang.String r9, int r10) {
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            java.lang.String r6 = a(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static java.lang.String a(a.a.a.g.a r4, a.a.a.g.k r5, android.location.Location r6, java.lang.String r7, int r8, boolean r9) {
            java.lang.StringBuffer r9 = new java.lang.StringBuffer
            r0 = 2048(0x800, float:2.87E-42)
            r9.<init>(r0)
            if (r4 == 0) goto L16
            a.a.a.g.f r0 = a.a.a.g.f.w()
            java.lang.String r0 = r0.a(r4)
            if (r0 == 0) goto L16
            r9.append(r0)
        L16:
            r0 = 1
            if (r5 == 0) goto L2f
            a.a.a.g.f r1 = a.a.a.g.f.w()
            if (r8 != 0) goto L22
            int r2 = a.a.a.i.i.L
            goto L24
        L22:
            int r2 = a.a.a.i.i.r0
        L24:
            int r3 = a.a.a.i.i.q0
            java.lang.String r1 = r1.a(r2, r0, r5, r3)
            if (r1 == 0) goto L2f
            r9.append(r1)
        L2f:
            if (r6 == 0) goto L45
            int r1 = a.a.a.i.i.f356c
            if (r1 == 0) goto L3c
            if (r8 == 0) goto L3c
            java.lang.String r1 = a.a.a.g.d.e(r6)
            goto L40
        L3c:
            java.lang.String r1 = a.a.a.g.d.d(r6)
        L40:
            if (r1 == 0) goto L45
            r9.append(r1)
        L45:
            r1 = 0
            if (r8 != 0) goto L49
            r1 = r0
        L49:
            a.a.a.i.b r8 = a.a.a.i.b.e()
            java.lang.String r8 = r8.a(r1)
            if (r8 == 0) goto L56
            r9.append(r8)
        L56:
            if (r7 == 0) goto L5b
            r9.append(r7)
        L5b:
            a.a.a.c.c r7 = a.a.a.c.c.f()
            java.lang.String r7 = r7.b()
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 != 0) goto L71
            java.lang.String r8 = "&bc="
            r9.append(r8)
            r9.append(r7)
        L71:
            a.a.a.g.d r7 = a.a.a.g.d.n()
            java.lang.String r7 = r7.c()
            r9.append(r7)
            a.a.a.g.f r7 = a.a.a.g.f.w()
            java.lang.String r4 = r7.b(r4)
            if (r4 == 0) goto L96
            int r7 = r4.length()
            int r8 = r9.length()
            int r7 = r7 + r8
            r8 = 2000(0x7d0, float:2.803E-42)
            if (r7 >= r8) goto L96
            r9.append(r4)
        L96:
            java.lang.String r4 = r9.toString()
            r7 = 3
            if (r6 == 0) goto Lde
            if (r5 == 0) goto Lde
            float r6 = r6.getSpeed()     // Catch: java.lang.Exception -> Le1
            int r8 = a.a.a.i.i.f356c     // Catch: java.lang.Exception -> Le1
            a.a.a.g.f r9 = a.a.a.g.f.w()     // Catch: java.lang.Exception -> Le1
            int r9 = r9.d(r5)     // Catch: java.lang.Exception -> Le1
            int r1 = r5.c()     // Catch: java.lang.Exception -> Le1
            boolean r5 = r5.d     // Catch: java.lang.Exception -> Le1
            float r2 = a.a.a.i.i.j0     // Catch: java.lang.Exception -> Le1
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 >= 0) goto Lc6
            if (r8 == r0) goto Lbd
            if (r8 != 0) goto Lc6
        Lbd:
            int r2 = a.a.a.i.i.l0     // Catch: java.lang.Exception -> Le1
            if (r9 < r2) goto Lc3
            if (r5 != r0) goto Lc6
        Lc3:
            a.a.a.i.i.n = r0     // Catch: java.lang.Exception -> Le1
            goto Le3
        Lc6:
            float r5 = a.a.a.i.i.k0     // Catch: java.lang.Exception -> Le1
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 >= 0) goto Lde
            if (r8 == r0) goto Ld2
            if (r8 == 0) goto Ld2
            if (r8 != r7) goto Lde
        Ld2:
            int r5 = a.a.a.i.i.m0     // Catch: java.lang.Exception -> Le1
            if (r9 < r5) goto Lda
            int r5 = a.a.a.i.i.n0     // Catch: java.lang.Exception -> Le1
            if (r1 <= r5) goto Lde
        Lda:
            r5 = 2
            a.a.a.i.i.n = r5     // Catch: java.lang.Exception -> Le1
            goto Le3
        Lde:
            a.a.a.i.i.n = r7     // Catch: java.lang.Exception -> Le1
            goto Le3
        Le1:
            a.a.a.i.i.n = r7
        Le3:
            return r4
    }

    public static java.lang.String a(byte[] r6, java.lang.String r7, boolean r8) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r6.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L2c
            r3 = r6[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            if (r8 == 0) goto L17
            java.lang.String r3 = r3.toUpperCase()
        L17:
            int r4 = r3.length()
            r5 = 1
            if (r4 != r5) goto L23
            java.lang.String r4 = "0"
            r0.append(r4)
        L23:
            r0.append(r3)
            r0.append(r7)
            int r2 = r2 + 1
            goto L7
        L2c:
            java.lang.String r6 = r0.toString()
            return r6
    }

    public static java.lang.String a(byte[] r1, boolean r2) {
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L17
            r0.reset()     // Catch: java.security.NoSuchAlgorithmException -> L17
            r0.update(r1)     // Catch: java.security.NoSuchAlgorithmException -> L17
            byte[] r1 = r0.digest()     // Catch: java.security.NoSuchAlgorithmException -> L17
            java.lang.String r0 = ""
            java.lang.String r1 = a(r1, r0, r2)     // Catch: java.security.NoSuchAlgorithmException -> L17
            return r1
        L17:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r1)
            throw r2
    }

    public static boolean a(double r0, double r2) {
            double r0 = r0 - r2
            double r0 = java.lang.Math.abs(r0)
            r2 = 4503599627372355432(0x3e800000001c5f68, double:1.192092896E-7)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    public static boolean a(float r0, float r1) {
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            r1 = 872415232(0x34000000, float:1.1920929E-7)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    public static boolean a(android.location.Location r3) {
            r0 = 0
            if (r3 == 0) goto L22
            java.lang.String r1 = a.a.a.i.i.O0
            if (r1 == 0) goto L22
            java.lang.String r2 = "huawei"
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 != 0) goto L10
            goto L22
        L10:
            android.os.Bundle r3 = r3.getExtras()     // Catch: java.lang.Exception -> L22
            if (r3 == 0) goto L22
            java.lang.String r1 = "SourceType"
            int r3 = r3.getInt(r1)     // Catch: java.lang.Exception -> L22
            r1 = 128(0x80, float:1.8E-43)
            r3 = r3 & r1
            if (r3 != r1) goto L22
            r0 = 1
        L22:
            return r0
    }

    public static boolean a(com.baidu.location.c r1) {
            int r1 = r1.r()
            r0 = 100
            if (r1 <= r0) goto Lc
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 < r0) goto L10
        Lc:
            r0 = 62
            if (r1 != r0) goto L12
        L10:
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public static boolean a(int[] r5) {
            r0 = 0
            if (r5 == 0) goto L16
            int r1 = r5.length
            r2 = 18
            if (r1 >= r2) goto L9
            goto L16
        L9:
            int r1 = r5.length
            r2 = r0
        Lb:
            if (r2 >= r1) goto L16
            r3 = r5[r2]
            r4 = 1
            if (r3 != r4) goto L13
            return r4
        L13:
            int r2 = r2 + 1
            goto Lb
        L16:
            return r0
    }

    public static byte[] a(byte[] r2) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.util.zip.GZIPOutputStream r1 = new java.util.zip.GZIPOutputStream     // Catch: java.io.IOException -> L11
            r1.<init>(r0)     // Catch: java.io.IOException -> L11
            r1.write(r2)     // Catch: java.io.IOException -> L11
            r1.close()     // Catch: java.io.IOException -> L11
            goto L15
        L11:
            r2 = move-exception
            r2.printStackTrace()
        L15:
            byte[] r2 = r0.toByteArray()
            return r2
    }

    public static int b(android.content.Context r3) {
            r0 = 2
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L12
            r2 = 17
            if (r1 <= r2) goto L12
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch: java.lang.Exception -> L12
            java.lang.String r1 = "airplane_mode_on"
            r2 = 0
            int r0 = android.provider.Settings.Global.getInt(r3, r1, r2)     // Catch: java.lang.Exception -> L12
        L12:
            return r0
    }

    public static int b(java.lang.Object r2, java.lang.String r3) {
            java.lang.Class r0 = r2.getClass()
            r1 = 0
            java.lang.reflect.Method r3 = r0.getDeclaredMethod(r3, r1)
            boolean r0 = r3.isAccessible()
            if (r0 != 0) goto L13
            r0 = 1
            r3.setAccessible(r0)
        L13:
            java.lang.Object r2 = r3.invoke(r2, r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            return r2
    }

    public static java.lang.String b() {
            java.lang.String r0 = ""
            java.util.Enumeration r1 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.lang.Throwable -> L42
        L6:
            boolean r2 = r1.hasMoreElements()     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L42
            java.lang.Object r2 = r1.nextElement()     // Catch: java.lang.Throwable -> L42
            java.net.NetworkInterface r2 = (java.net.NetworkInterface) r2     // Catch: java.lang.Throwable -> L42
            java.util.Enumeration r2 = r2.getInetAddresses()     // Catch: java.lang.Throwable -> L42
        L16:
            boolean r3 = r2.hasMoreElements()     // Catch: java.lang.Throwable -> L42
            if (r3 == 0) goto L6
            java.lang.Object r3 = r2.nextElement()     // Catch: java.lang.Throwable -> L42
            java.net.InetAddress r3 = (java.net.InetAddress) r3     // Catch: java.lang.Throwable -> L42
            boolean r4 = r3.isLoopbackAddress()     // Catch: java.lang.Throwable -> L42
            if (r4 != 0) goto L16
            boolean r4 = r3 instanceof java.net.Inet6Address     // Catch: java.lang.Throwable -> L42
            if (r4 == 0) goto L16
            java.lang.String r4 = r3.getHostAddress()     // Catch: java.lang.Throwable -> L42
            if (r4 == 0) goto L16
            java.lang.String r4 = r3.getHostAddress()     // Catch: java.lang.Throwable -> L42
            java.lang.String r5 = "fe80:"
            boolean r4 = r4.startsWith(r5)     // Catch: java.lang.Throwable -> L42
            if (r4 != 0) goto L16
            java.lang.String r0 = r3.getHostAddress()     // Catch: java.lang.Throwable -> L42
        L42:
            return r0
    }

    public static java.lang.String b(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = a.a.a.i.i.l
            r0.append(r1)
            java.lang.String r1 = ";"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r2 = com.baidu.location.Jni.a(r2)
            return r2
    }

    public static boolean b(android.content.Context r1, java.lang.String r2) {
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            r0 = 1
            r1.getPackageInfo(r2, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9
            goto Le
        L9:
            r1 = move-exception
            r1.printStackTrace()
            r0 = 0
        Le:
            return r0
    }

    public static byte[] b(byte[] r4) {
            r0 = 0
            if (r4 == 0) goto L4c
            int r1 = r4.length
            if (r1 != 0) goto L7
            goto L4c
        L7:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r4)
            r4 = 0
            java.util.zip.GZIPInputStream r3 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            r4 = 2048(0x800, float:2.87E-42)
            byte[] r4 = new byte[r4]     // Catch: java.io.IOException -> L25 java.lang.Throwable -> L3e
        L1b:
            int r2 = r3.read(r4)     // Catch: java.io.IOException -> L25 java.lang.Throwable -> L3e
            if (r2 < 0) goto L31
            r1.write(r4, r0, r2)     // Catch: java.io.IOException -> L25 java.lang.Throwable -> L3e
            goto L1b
        L25:
            r4 = move-exception
            goto L2c
        L27:
            r0 = move-exception
            goto L41
        L29:
            r0 = move-exception
            r3 = r4
            r4 = r0
        L2c:
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L3e
            if (r3 == 0) goto L39
        L31:
            r3.close()     // Catch: java.io.IOException -> L35
            goto L39
        L35:
            r4 = move-exception
            r4.printStackTrace()
        L39:
            byte[] r4 = r1.toByteArray()
            return r4
        L3e:
            r4 = move-exception
            r0 = r4
            r4 = r3
        L41:
            if (r4 == 0) goto L4b
            r4.close()     // Catch: java.io.IOException -> L47
            goto L4b
        L47:
            r4 = move-exception
            r4.printStackTrace()
        L4b:
            throw r0
        L4c:
            byte[] r4 = new byte[r0]
            return r4
    }

    public static int c(android.content.Context r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = -1
            r2 = 19
            if (r0 < r2) goto L12
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch: java.lang.Exception -> L13
            java.lang.String r0 = "location_mode"
            int r1 = android.provider.Settings.Secure.getInt(r3, r0, r1)     // Catch: java.lang.Exception -> L13
            goto L13
        L12:
            r1 = -2
        L13:
            return r1
    }

    public static java.lang.String c() {
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L31
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L31
            r1.<init>()     // Catch: java.lang.Exception -> L31
            android.content.Context r2 = com.baidu.location.f.c()     // Catch: java.lang.Exception -> L31
            java.io.File r2 = r2.getFilesDir()     // Catch: java.lang.Exception -> L31
            r1.append(r2)     // Catch: java.lang.Exception -> L31
            java.lang.String r2 = java.io.File.separator     // Catch: java.lang.Exception -> L31
            r1.append(r2)     // Catch: java.lang.Exception -> L31
            java.lang.String r2 = "lldt"
            r1.append(r2)     // Catch: java.lang.Exception -> L31
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L31
            r0.<init>(r1)     // Catch: java.lang.Exception -> L31
            boolean r1 = r0.exists()     // Catch: java.lang.Exception -> L31
            if (r1 != 0) goto L2c
            r0.mkdirs()     // Catch: java.lang.Exception -> L31
        L2c:
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Exception -> L31
            return r0
        L31:
            r0 = 0
            return r0
    }

    public static java.lang.String c(java.lang.String r4) {
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L47
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L47
            r2.<init>()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L47
            java.lang.String r3 = "getprop "
            r2.append(r3)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L47
            r2.append(r4)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L47
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L47
            java.lang.Process r4 = r1.exec(r4)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L47
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L47
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L47
            java.io.InputStream r4 = r4.getInputStream()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L47
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L47
            r4 = 1024(0x400, float:1.435E-42)
            r1.<init>(r2, r4)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L47
            java.lang.String r4 = r1.readLine()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L48
            r1.close()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L48
            r1.close()     // Catch: java.io.IOException -> L34
        L34:
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto L3b
            goto L3c
        L3b:
            r0 = r4
        L3c:
            return r0
        L3d:
            r4 = move-exception
            r0 = r1
            goto L41
        L40:
            r4 = move-exception
        L41:
            if (r0 == 0) goto L46
            r0.close()     // Catch: java.io.IOException -> L46
        L46:
            throw r4
        L47:
            r1 = r0
        L48:
            if (r1 == 0) goto L4d
            r1.close()     // Catch: java.io.IOException -> L4d
        L4d:
            return r0
    }

    public static java.lang.String d() {
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L39
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L39
            r1.<init>()     // Catch: java.lang.Exception -> L39
            android.content.Context r2 = com.baidu.location.f.c()     // Catch: java.lang.Exception -> L39
            java.io.File r2 = r2.getFilesDir()     // Catch: java.lang.Exception -> L39
            r1.append(r2)     // Catch: java.lang.Exception -> L39
            java.lang.String r2 = java.io.File.separator     // Catch: java.lang.Exception -> L39
            r1.append(r2)     // Catch: java.lang.Exception -> L39
            java.lang.String r2 = "/baidu/tempdata"
            r1.append(r2)     // Catch: java.lang.Exception -> L39
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L39
            r0.<init>(r1)     // Catch: java.lang.Exception -> L39
            boolean r1 = r0.exists()     // Catch: java.lang.Exception -> L39
            if (r1 != 0) goto L2c
            r0.mkdirs()     // Catch: java.lang.Exception -> L39
        L2c:
            android.content.Context r0 = com.baidu.location.f.c()     // Catch: java.lang.Exception -> L39
            java.io.File r0 = r0.getFilesDir()     // Catch: java.lang.Exception -> L39
            java.lang.String r0 = r0.getPath()     // Catch: java.lang.Exception -> L39
            return r0
        L39:
            r0 = 0
            return r0
    }

    public static java.lang.String d(android.content.Context r2) {
            r0 = -1
            if (r2 == 0) goto L1b
            java.lang.String r1 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r1)     // Catch: java.lang.Throwable -> L1b
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2     // Catch: java.lang.Throwable -> L1b
            android.net.NetworkInfo r2 = r2.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L1b
            boolean r1 = r2.isAvailable()     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L1b
            int r0 = r2.getType()     // Catch: java.lang.Throwable -> L1b
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "&netc="
            r2.append(r1)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public static java.lang.String e() {
            java.lang.String r0 = "/baidu/tempdata"
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L4b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4b
            r2.<init>()     // Catch: java.lang.Exception -> L4b
            android.content.Context r3 = com.baidu.location.f.c()     // Catch: java.lang.Exception -> L4b
            java.io.File r3 = r3.getFilesDir()     // Catch: java.lang.Exception -> L4b
            r2.append(r3)     // Catch: java.lang.Exception -> L4b
            java.lang.String r3 = java.io.File.separator     // Catch: java.lang.Exception -> L4b
            r2.append(r3)     // Catch: java.lang.Exception -> L4b
            r2.append(r0)     // Catch: java.lang.Exception -> L4b
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L4b
            r1.<init>(r2)     // Catch: java.lang.Exception -> L4b
            boolean r2 = r1.exists()     // Catch: java.lang.Exception -> L4b
            if (r2 != 0) goto L2c
            r1.mkdirs()     // Catch: java.lang.Exception -> L4b
        L2c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4b
            r1.<init>()     // Catch: java.lang.Exception -> L4b
            android.content.Context r2 = com.baidu.location.f.c()     // Catch: java.lang.Exception -> L4b
            java.io.File r2 = r2.getFilesDir()     // Catch: java.lang.Exception -> L4b
            java.lang.String r2 = r2.getPath()     // Catch: java.lang.Exception -> L4b
            r1.append(r2)     // Catch: java.lang.Exception -> L4b
            r1.append(r3)     // Catch: java.lang.Exception -> L4b
            r1.append(r0)     // Catch: java.lang.Exception -> L4b
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> L4b
            return r0
        L4b:
            r0 = 0
            return r0
    }

    public static java.lang.String e(android.content.Context r7) {
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            int r0 = a(r7, r0)
            java.lang.String r1 = "android.permission.ACCESS_FINE_LOCATION"
            int r1 = a(r7, r1)
            java.lang.String r2 = "android.permission.READ_PHONE_STATE"
            int r2 = a(r7, r2)
            int r3 = android.os.Build.VERSION.SDK_INT
            java.lang.String r4 = "&per="
            java.lang.String r5 = "|"
            r6 = 29
            if (r3 < r6) goto L44
            java.lang.String r3 = "android.permission.ACCESS_BACKGROUND_LOCATION"
            int r7 = a(r7, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            r3.append(r0)
            r3.append(r5)
            r3.append(r1)
            r3.append(r5)
            r3.append(r2)
            r3.append(r5)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            goto L5f
        L44:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r0)
            r7.append(r5)
            r7.append(r1)
            r7.append(r5)
            r7.append(r2)
            java.lang.String r7 = r7.toString()
        L5f:
            return r7
    }

    public static java.lang.String f() {
            java.lang.String r0 = "ro.mediatek.platform"
            java.lang.String r0 = c(r0)
            return r0
    }

    public static java.lang.String f(android.content.Context r2) {
            android.content.pm.PackageManager r0 = r2.getPackageManager()     // Catch: java.lang.Exception -> L10
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Exception -> L10
            r1 = 0
            android.content.pm.PackageInfo r2 = r0.getPackageInfo(r2, r1)     // Catch: java.lang.Exception -> L10
            java.lang.String r2 = r2.versionName     // Catch: java.lang.Exception -> L10
            return r2
        L10:
            r2 = 0
            return r2
    }

    public static javax.net.ssl.SSLSocketFactory g() {
            r0 = 1
            javax.net.ssl.TrustManager[] r0 = new javax.net.ssl.TrustManager[r0]
            a.a.a.i.i$a r1 = new a.a.a.i.i$a
            r1.<init>()
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "TLS"
            javax.net.ssl.SSLContext r1 = javax.net.ssl.SSLContext.getInstance(r1)
            java.security.SecureRandom r2 = new java.security.SecureRandom
            r2.<init>()
            r3 = 0
            r1.init(r3, r0, r2)
            javax.net.ssl.SSLSocketFactory r0 = r1.getSocketFactory()
            return r0
    }

    public static boolean g(android.content.Context r5) {
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L2c
            java.lang.String r2 = "android.permission.ACCESS_COARSE_LOCATION"
            int r2 = a(r5, r2)     // Catch: java.lang.Exception -> Lb
            goto L10
        Lb:
            r2 = move-exception
            r2.printStackTrace()
            r2 = r1
        L10:
            if (r2 == r1) goto L14
            r2 = r0
            goto L15
        L14:
            r2 = r1
        L15:
            if (r2 == 0) goto L2a
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r3 < r4) goto L2a
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch: java.lang.Exception -> L2a
            java.lang.String r3 = "location_mode"
            int r5 = android.provider.Settings.Secure.getInt(r5, r3, r1)     // Catch: java.lang.Exception -> L2a
            if (r5 != 0) goto L2a
            goto L2d
        L2a:
            r0 = r2
            goto L2d
        L2c:
            r0 = r1
        L2d:
            return r0
    }

    public static java.lang.String h() {
            java.lang.String r0 = a()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "/baidu/tempdata"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    public static boolean h(android.content.Context r4) {
            java.lang.String r0 = "connectivity"
            java.lang.Object r4 = r4.getSystemService(r0)
            android.net.ConnectivityManager r4 = (android.net.ConnectivityManager) r4
            r0 = 0
            if (r4 == 0) goto L25
            r1 = 0
            android.net.NetworkInfo[] r1 = r4.getAllNetworkInfo()     // Catch: java.lang.Exception -> L10
        L10:
            if (r1 == 0) goto L25
            r4 = r0
        L13:
            int r2 = r1.length
            if (r4 >= r2) goto L25
            r2 = r1[r4]
            android.net.NetworkInfo$State r2 = r2.getState()
            android.net.NetworkInfo$State r3 = android.net.NetworkInfo.State.CONNECTED
            if (r2 != r3) goto L22
            r4 = 1
            return r4
        L22:
            int r4 = r4 + 1
            goto L13
        L25:
            return r0
    }

    public static java.lang.String i() {
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r1 = 5
            int r2 = r0.get(r1)
            r3 = 1
            int r4 = r0.get(r3)
            r5 = 2
            int r6 = r0.get(r5)
            int r6 = r6 + r3
            r7 = 11
            int r7 = r0.get(r7)
            r8 = 12
            int r8 = r0.get(r8)
            r9 = 13
            int r0 = r0.get(r9)
            java.util.Locale r9 = java.util.Locale.CHINA
            r10 = 6
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r11 = 0
            r10[r11] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r10[r3] = r4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r10[r5] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            r3 = 3
            r10[r3] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            r3 = 4
            r10[r3] = r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10[r1] = r0
            java.lang.String r0 = "%d-%02d-%02d %02d:%02d:%02d"
            java.lang.String r0 = java.lang.String.format(r9, r0, r10)
            return r0
    }

    public static java.lang.String j() {
            java.lang.String r0 = a.a.a.i.d.g
            return r0
    }

    public static boolean k() {
            android.content.Context r0 = com.baidu.location.f.c()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            android.content.Context r0 = com.baidu.location.f.c()
            java.lang.String r2 = "android.permission.ACCESS_FINE_LOCATION"
            int r0 = a(r0, r2)
            android.content.Context r2 = com.baidu.location.f.c()
            java.lang.String r3 = "android.permission.ACCESS_COARSE_LOCATION"
            int r2 = a(r2, r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 31
            if (r3 < r4) goto L28
            if (r0 != 0) goto L28
            r0 = 1
            if (r2 != r0) goto L28
            return r0
        L28:
            return r1
    }

    public static boolean l() {
            r0 = 0
            return r0
    }
}
