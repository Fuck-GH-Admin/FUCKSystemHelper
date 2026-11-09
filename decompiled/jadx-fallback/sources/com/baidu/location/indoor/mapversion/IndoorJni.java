package com.baidu.location.indoor.mapversion;

/* JADX INFO: loaded from: classes.dex */
public class IndoorJni {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f1378a = false;

    static {
            java.lang.String r0 = "indoorJNI"
            java.lang.String r1 = "indoor"
            java.lang.System.loadLibrary(r1)     // Catch: java.lang.Throwable -> L28
            r1 = 1
            com.baidu.location.indoor.mapversion.IndoorJni.f1378a = r1     // Catch: java.lang.Throwable -> L28
            java.io.PrintStream r1 = java.lang.System.err     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "load vdr indoor lib success."
            r1.println(r2)     // Catch: java.lang.Throwable -> L28
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            r1.<init>()     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "indoor lib loadJniSuccess:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L28
            boolean r2 = com.baidu.location.indoor.mapversion.IndoorJni.f1378a     // Catch: java.lang.Throwable -> L28
            r1.append(r2)     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L28
            android.util.Log.i(r0, r1)     // Catch: java.lang.Throwable -> L28
            goto L4e
        L28:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "indoor lib annot load indoor lib:"
            r2.append(r3)
            java.lang.String r3 = r1.toString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.i(r0, r2)
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r2 = "Cannot load indoor lib"
            r0.println(r2)
            r1.printStackTrace()
            r0 = 0
            com.baidu.location.indoor.mapversion.IndoorJni.f1378a = r0
        L4e:
            return
    }

    public static native int destroyGpsChecker();

    public static native java.lang.String getFloor(long r0, int r2);

    public static native int getGpsStatus(int r0, java.lang.String r1);

    public static native int getInout(long r0, int r2);

    public static native int initGpsChecker(int r0, java.lang.String r1, java.lang.String r2);

    public static native void initPf();

    public static native float pgo();

    public static native java.lang.String phs(int r0, float r1, float r2, float r3, long r4);

    public static native void resetPf();

    public static native void setBarometers(float r0, long r1);

    public static native void setBleLoc4Scenario(double r0, double r2, java.lang.String r4, int r5, long r6, int r8);

    public static native void setGps(double r0, double r2, float r4, float r5, float r6, double r7, int r9, long r10);

    public static native double[] setPfBle(double r0, double r2, double r4, double r6, java.lang.String r8, java.lang.String r9, long r10, int r12, java.lang.String r13);

    public static native double[] setPfDr(double r0, double r2, java.lang.String r4, long r5);

    public static native void setPfGeoMap(double[][] r0, java.lang.String r1, int r2, int r3);

    public static native void setPfRdnt(java.lang.String r0, short[][] r1, double r2, double r4, int r6, int r7, double r8, double r10, java.lang.String r12);

    public static native double[] setPfWf(double r0, double r2, double r4, long r6);

    public static native void startPdr();

    public static native void stopPdr();
}
