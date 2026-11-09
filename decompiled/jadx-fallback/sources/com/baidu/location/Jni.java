package com.baidu.location;

/* JADX INFO: loaded from: classes.dex */
public class Jni {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f1346a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f1347b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f1348c = 2;
    public static int d = 11;
    public static int e = 12;
    public static int f = 13;
    public static int g = 15;
    public static int h = 1024;
    public static boolean i = false;

    static {
            java.lang.String r0 = "locSDK8b"
            java.lang.System.loadLibrary(r0)     // Catch: java.lang.UnsatisfiedLinkError -> L6
            goto Ld
        L6:
            r0 = move-exception
            r0.printStackTrace()
            r0 = 1
            com.baidu.location.Jni.i = r0
        Ld:
            return
    }

    public static double a(float r3, double r4, double r6) {
            boolean r0 = com.baidu.location.Jni.i
            r1 = 0
            if (r0 == 0) goto L7
            return r1
        L7:
            double r1 = gsr(r3, r4, r6)     // Catch: java.lang.UnsatisfiedLinkError -> Lb
        Lb:
            return r1
    }

    public static java.lang.String a() {
            boolean r0 = com.baidu.location.Jni.i
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            java.lang.String r1 = ldkaiv()     // Catch: java.lang.UnsatisfiedLinkError -> Lb
            goto Lf
        Lb:
            r0 = move-exception
            r0.printStackTrace()
        Lf:
            return r1
    }

    public static java.lang.String a(java.lang.String r6) {
            boolean r0 = com.baidu.location.Jni.i
            java.lang.String r1 = "err!"
            if (r0 == 0) goto L7
            return r1
        L7:
            if (r6 != 0) goto Lc
            java.lang.String r6 = "null"
            return r6
        Lc:
            byte[] r6 = r6.getBytes()
            int r0 = com.baidu.location.Jni.h
            byte[] r0 = new byte[r0]
            int r2 = r6.length
            r3 = 740(0x2e4, float:1.037E-42)
            if (r2 <= r3) goto L1a
            r2 = r3
        L1a:
            r3 = 0
            r4 = r3
        L1c:
            if (r3 >= r2) goto L2b
            r5 = r6[r3]
            if (r5 == 0) goto L28
            r5 = r6[r3]
            r0[r4] = r5
            int r4 = r4 + 1
        L28:
            int r3 = r3 + 1
            goto L1c
        L2b:
            r6 = 132456(0x20568, float:1.8561E-40)
            java.lang.String r1 = a(r0, r6)     // Catch: java.lang.UnsatisfiedLinkError -> L33
            goto L37
        L33:
            r6 = move-exception
            r6.printStackTrace()
        L37:
            return r1
    }

    public static native java.lang.String a(byte[] r0, int r1);

    public static double[] a(double r8, double r10, java.lang.String r12) {
            r0 = 2
            double[] r0 = new double[r0]
            r0 = {x008c: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            boolean r1 = com.baidu.location.Jni.i
            if (r1 == 0) goto Lb
            return r0
        Lb:
            r1 = -1
            java.lang.String r2 = "bd09"
            boolean r2 = r12.equals(r2)
            if (r2 == 0) goto L17
            int r1 = com.baidu.location.Jni.f1346a
            goto L58
        L17:
            java.lang.String r2 = "bd09ll"
            boolean r2 = r12.equals(r2)
            if (r2 == 0) goto L22
            int r1 = com.baidu.location.Jni.f1347b
            goto L58
        L22:
            java.lang.String r2 = "gcj02"
            boolean r2 = r12.equals(r2)
            if (r2 == 0) goto L2d
            int r1 = com.baidu.location.Jni.f1348c
            goto L58
        L2d:
            java.lang.String r2 = "gps2gcj"
            boolean r2 = r12.equals(r2)
            if (r2 == 0) goto L38
            int r1 = com.baidu.location.Jni.d
            goto L58
        L38:
            java.lang.String r2 = "bd092gcj"
            boolean r2 = r12.equals(r2)
            if (r2 == 0) goto L43
            int r1 = com.baidu.location.Jni.e
            goto L58
        L43:
            java.lang.String r2 = "bd09ll2gcj"
            boolean r2 = r12.equals(r2)
            if (r2 == 0) goto L4e
            int r1 = com.baidu.location.Jni.f
            goto L58
        L4e:
            java.lang.String r2 = "wgs842mc"
            boolean r2 = r12.equals(r2)
            if (r2 == 0) goto L58
            int r1 = com.baidu.location.Jni.g
        L58:
            java.lang.String r2 = "gcj2wgs"
            boolean r12 = r12.equals(r2)
            if (r12 == 0) goto L62
            r1 = 16
        L62:
            r6 = r1
            r7 = 132456(0x20568, float:1.8561E-40)
            r12 = 1
            r1 = 0
            r2 = r8
            r4 = r10
            java.lang.String r8 = b(r2, r4, r6, r7)     // Catch: java.lang.Throwable -> L85
            java.lang.String r9 = ":"
            java.lang.String[] r8 = r8.split(r9)     // Catch: java.lang.Throwable -> L85
            r9 = r8[r1]     // Catch: java.lang.Throwable -> L85
            double r9 = java.lang.Double.parseDouble(r9)     // Catch: java.lang.Throwable -> L85
            r0[r1] = r9     // Catch: java.lang.Throwable -> L85
            r8 = r8[r12]     // Catch: java.lang.Throwable -> L85
            double r8 = java.lang.Double.parseDouble(r8)     // Catch: java.lang.Throwable -> L85
            r0[r12] = r8     // Catch: java.lang.Throwable -> L85
            goto L8b
        L85:
            r8 = 0
            r0[r1] = r8
            r0[r12] = r8
        L8b:
            return r0
    }

    public static native java.lang.String b(double r0, double r2, int r4, int r5);

    public static java.lang.String b(java.lang.String r1) {
            boolean r0 = com.baidu.location.Jni.i
            if (r0 == 0) goto L7
            java.lang.String r1 = "err!"
            return r1
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = a(r1)
            r0.append(r1)
            java.lang.String r1 = "|tp=3"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static java.lang.String c(java.lang.String r2) {
            boolean r0 = com.baidu.location.Jni.i
            java.lang.String r1 = "err!"
            if (r0 == 0) goto L7
            return r1
        L7:
            if (r2 != 0) goto Lc
            java.lang.String r2 = "null"
            return r2
        Lc:
            byte[] r2 = r2.getBytes()
            r0 = 132456(0x20568, float:1.8561E-40)
            java.lang.String r1 = c(r2, r0)     // Catch: java.lang.UnsatisfiedLinkError -> L18
            goto L1c
        L18:
            r2 = move-exception
            r2.printStackTrace()
        L1c:
            return r1
    }

    public static native java.lang.String c(byte[] r0, int r1);

    public static java.lang.Long d(java.lang.String r4) {
            boolean r0 = com.baidu.location.Jni.i
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Exception -> L12
            byte[] r4 = r4.getBytes()     // Catch: java.lang.Exception -> L12
            java.lang.String r2 = "UTF-8"
            r0.<init>(r4, r2)     // Catch: java.lang.Exception -> L12
            goto L14
        L12:
            java.lang.String r0 = ""
        L14:
            long r2 = murmur(r0)     // Catch: java.lang.UnsatisfiedLinkError -> L1d
            java.lang.Long r1 = java.lang.Long.valueOf(r2)     // Catch: java.lang.UnsatisfiedLinkError -> L1d
            goto L21
        L1d:
            r4 = move-exception
            r4.printStackTrace()
        L21:
            return r1
    }

    public static java.lang.String e(java.lang.String r3) {
            boolean r0 = com.baidu.location.Jni.i
            java.lang.String r1 = "err!"
            if (r0 == 0) goto L7
            return r1
        L7:
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Exception -> L13
            byte[] r3 = r3.getBytes()     // Catch: java.lang.Exception -> L13
            java.lang.String r2 = "UTF-8"
            r0.<init>(r3, r2)     // Catch: java.lang.Exception -> L13
            goto L15
        L13:
            java.lang.String r0 = ""
        L15:
            r3 = 132456(0x20568, float:1.8561E-40)
            java.lang.String r1 = encodeNotLimit(r0, r3)     // Catch: java.lang.UnsatisfiedLinkError -> L1d
            goto L21
        L1d:
            r3 = move-exception
            r3.printStackTrace()
        L21:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r0 = "|tp=3"
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            return r3
    }

    public static native java.lang.String ee(java.lang.String r0, int r1);

    public static native java.lang.String encodeNotLimit(java.lang.String r0, int r1);

    public static java.lang.String f(java.lang.String r3) {
            boolean r0 = com.baidu.location.Jni.i
            java.lang.String r1 = "err!"
            if (r0 == 0) goto L7
            return r1
        L7:
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Exception -> L13
            byte[] r3 = r3.getBytes()     // Catch: java.lang.Exception -> L13
            java.lang.String r2 = "UTF-8"
            r0.<init>(r3, r2)     // Catch: java.lang.Exception -> L13
            goto L15
        L13:
            java.lang.String r0 = ""
        L15:
            r3 = 132456(0x20568, float:1.8561E-40)
            java.lang.String r1 = ee(r0, r3)     // Catch: java.lang.UnsatisfiedLinkError -> L1d
            goto L21
        L1d:
            r3 = move-exception
            r3.printStackTrace()
        L21:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r0 = "|tp=4"
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            return r3
    }

    public static native double gsr(float r0, double r1, double r3);

    public static native java.lang.String ldkaiv();

    public static native long murmur(java.lang.String r0);
}
