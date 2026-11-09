package c.d.a.b;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static java.text.SimpleDateFormat f1340a;

    static {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r2 = "yyyy-MM-dd HH:mm:ss"
            r0.<init>(r2, r1)
            c.d.a.b.l.f1340a = r0
            return
    }

    public static long a(android.content.Context r2, java.lang.String r3, long r4) {
            java.lang.String r0 = "com_mobiletools_systemhelper_preference"
            r1 = 4
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            long r2 = r2.getLong(r3, r4)
            return r2
    }

    public static java.lang.Boolean a(android.content.Context r2, java.lang.String r3, java.lang.Boolean r4) {
            java.lang.String r0 = "com_mobiletools_systemhelper_preference"
            r1 = 4
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            boolean r4 = r4.booleanValue()
            boolean r2 = r2.getBoolean(r3, r4)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
    }

    public static java.lang.Boolean a(com.mobiletools.systemhelper.control.b r8) {
            java.lang.String r0 = "success —— in china network!"
            java.lang.String r1 = "RegisterUtils"
            r2 = 1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L107
            r3.<init>()     // Catch: java.lang.Exception -> L107
            java.lang.String r4 = "deviceinfo.mnc1: "
            r3.append(r4)     // Catch: java.lang.Exception -> L107
            java.lang.String r4 = r8.j     // Catch: java.lang.Exception -> L107
            r3.append(r4)     // Catch: java.lang.Exception -> L107
            java.lang.String r4 = "mnc2:"
            r3.append(r4)     // Catch: java.lang.Exception -> L107
            java.lang.String r4 = r8.v     // Catch: java.lang.Exception -> L107
            r3.append(r4)     // Catch: java.lang.Exception -> L107
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L107
            c.d.a.b.h.a(r1, r3)     // Catch: java.lang.Exception -> L107
            java.lang.String r3 = r8.j     // Catch: java.lang.Exception -> L107
            java.lang.String r4 = "ex01"
            java.lang.String r5 = "ex00"
            java.lang.String r6 = "460"
            r7 = 0
            if (r3 == 0) goto L5a
            java.lang.String r3 = r8.j     // Catch: java.lang.Exception -> L107
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Exception -> L107
            if (r3 != 0) goto L5a
            java.lang.String r3 = r8.j     // Catch: java.lang.Exception -> L107
            boolean r3 = r3.equals(r5)     // Catch: java.lang.Exception -> L107
            if (r3 != 0) goto L5a
            java.lang.String r3 = r8.j     // Catch: java.lang.Exception -> L107
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> L107
            if (r3 != 0) goto L5a
            java.lang.String r3 = r8.j     // Catch: java.lang.Exception -> L107
            boolean r3 = r3.startsWith(r6)     // Catch: java.lang.Exception -> L107
            if (r3 != 0) goto L5a
            java.lang.String r8 = "MNC1 is not startwith 460!"
            c.d.a.b.h.a(r1, r8)     // Catch: java.lang.Exception -> L107
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Exception -> L107
            return r8
        L5a:
            java.lang.String r3 = r8.v     // Catch: java.lang.Exception -> L107
            if (r3 == 0) goto L88
            java.lang.String r3 = r8.v     // Catch: java.lang.Exception -> L107
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Exception -> L107
            if (r3 != 0) goto L88
            java.lang.String r3 = r8.v     // Catch: java.lang.Exception -> L107
            boolean r3 = r3.equals(r5)     // Catch: java.lang.Exception -> L107
            if (r3 != 0) goto L88
            java.lang.String r3 = r8.v     // Catch: java.lang.Exception -> L107
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> L107
            if (r3 != 0) goto L88
            java.lang.String r3 = r8.v     // Catch: java.lang.Exception -> L107
            boolean r3 = r3.startsWith(r6)     // Catch: java.lang.Exception -> L107
            if (r3 != 0) goto L88
            java.lang.String r8 = "MNC2 is not startwith 460!"
            c.d.a.b.h.a(r1, r8)     // Catch: java.lang.Exception -> L107
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Exception -> L107
            return r8
        L88:
            java.lang.String r3 = r8.E     // Catch: java.lang.Exception -> L107
            if (r3 == 0) goto Lff
            java.lang.String r3 = r8.E     // Catch: java.lang.Exception -> L107
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Exception -> L107
            if (r3 != 0) goto Lff
            java.lang.String r3 = r8.E     // Catch: java.lang.Exception -> L107
            java.lang.String r4 = "1"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> L107
            if (r3 == 0) goto Lbc
            java.lang.String r3 = r8.k     // Catch: java.lang.Exception -> L107
            if (r3 == 0) goto Lff
            java.lang.String r3 = r8.k     // Catch: java.lang.Exception -> L107
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Exception -> L107
            if (r3 != 0) goto Lff
            java.lang.String r8 = r8.k     // Catch: java.lang.Exception -> L107
            boolean r8 = r8.startsWith(r6)     // Catch: java.lang.Exception -> L107
            if (r8 != 0) goto Lff
            java.lang.String r8 = "register mnc1 is not startwith 460!"
            c.d.a.b.h.a(r1, r8)     // Catch: java.lang.Exception -> L107
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Exception -> L107
            return r8
        Lbc:
            java.lang.String r3 = r8.E     // Catch: java.lang.Exception -> L107
            java.lang.String r4 = "2"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> L107
            if (r3 == 0) goto Le4
            java.lang.String r3 = r8.w     // Catch: java.lang.Exception -> L107
            if (r3 == 0) goto Lff
            java.lang.String r3 = r8.w     // Catch: java.lang.Exception -> L107
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Exception -> L107
            if (r3 != 0) goto Lff
            java.lang.String r8 = r8.w     // Catch: java.lang.Exception -> L107
            boolean r8 = r8.startsWith(r6)     // Catch: java.lang.Exception -> L107
            if (r8 != 0) goto Lff
            java.lang.String r8 = "register mnc2 is not startwith 460!"
            c.d.a.b.h.a(r1, r8)     // Catch: java.lang.Exception -> L107
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Exception -> L107
            return r8
        Le4:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L107
            r3.<init>()     // Catch: java.lang.Exception -> L107
            java.lang.String r4 = "isUnicomNetwork->DataSlot："
            r3.append(r4)     // Catch: java.lang.Exception -> L107
            java.lang.String r8 = r8.E     // Catch: java.lang.Exception -> L107
            r3.append(r8)     // Catch: java.lang.Exception -> L107
            java.lang.String r8 = r3.toString()     // Catch: java.lang.Exception -> L107
            c.d.a.b.h.b(r1, r8)     // Catch: java.lang.Exception -> L107
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Exception -> L107
            return r8
        Lff:
            c.d.a.b.h.a(r1, r0)     // Catch: java.lang.Exception -> L107
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Exception -> L107
            return r8
        L107:
            r8 = move-exception
            java.lang.String r3 = "Exception===isChinaNetwork"
            c.d.a.b.h.b(r1, r3)
            r8.printStackTrace()
            c.d.a.b.h.a(r1, r0)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
    }

    public static java.lang.String a() {
            java.text.SimpleDateFormat r0 = c.d.a.b.l.f1340a
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            java.lang.String r0 = r0.format(r1)
            return r0
    }

    public static java.lang.String a(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            java.lang.String r0 = "com_mobiletools_systemhelper_preference"
            r1 = 4
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            java.lang.String r2 = r2.getString(r3, r4)
            return r2
    }

    public static java.lang.String a(java.lang.String r6) {
            java.lang.String r0 = "android.os.SystemProperties"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L1f
            java.lang.String r1 = "get"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L1f
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Exception -> L1f
            java.lang.reflect.Method r1 = r0.getMethod(r1, r3)     // Catch: java.lang.Exception -> L1f
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L1f
            r2[r5] = r6     // Catch: java.lang.Exception -> L1f
            java.lang.Object r6 = r1.invoke(r0, r2)     // Catch: java.lang.Exception -> L1f
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L1f
            return r6
        L1f:
            r6 = move-exception
            r6.printStackTrace()
            r6 = 0
            return r6
    }

    public static java.lang.String a(java.lang.String r8, java.lang.String r9) {
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.String r1 = "android.os.SystemProperties"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L28
            java.lang.Object r2 = r1.newInstance()     // Catch: java.lang.Exception -> L28
            java.lang.String r3 = "get"
            r4 = 2
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L28
            r6 = 0
            r5[r6] = r0     // Catch: java.lang.Exception -> L28
            r7 = 1
            r5[r7] = r0     // Catch: java.lang.Exception -> L28
            java.lang.reflect.Method r0 = r1.getMethod(r3, r5)     // Catch: java.lang.Exception -> L28
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L28
            r1[r6] = r8     // Catch: java.lang.Exception -> L28
            r1[r7] = r9     // Catch: java.lang.Exception -> L28
            java.lang.Object r8 = r0.invoke(r2, r1)     // Catch: java.lang.Exception -> L28
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L28
            return r8
        L28:
            r8 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getSystemProperties->"
            r0.append(r1)
            java.lang.String r8 = r8.getMessage()
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.String r0 = "RegisterUtils"
            c.d.a.b.h.b(r0, r8)
            return r9
    }

    public static void a(android.content.Context r2, long r3) {
            java.lang.String r0 = "RegisterUtils"
            java.lang.String r1 = "setAppInfoInterval--->"
            c.d.a.b.h.a(r0, r1)
            java.lang.String r0 = "appInfoInterval"
            b(r2, r0, r3)
            return
    }

    public static void a(android.content.Context r1, java.lang.String r2) {
            java.lang.String r0 = "serverAddress"
            b(r1, r0, r2)
            return
    }

    public static boolean a(android.content.Context r5) {
            android.content.ContentResolver r0 = r5.getContentResolver()
            r1 = 0
            java.lang.String r2 = "device_provisioned"
            int r0 = android.provider.Settings.Global.getInt(r0, r2, r1)
            r2 = 1
            if (r0 != r2) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "isBootWizardCompleted: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "RegisterUtils"
            c.d.a.b.h.a(r4, r3)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L52
            android.content.ContentResolver r5 = r5.getContentResolver()
            java.lang.String r0 = "operator_service_improve_plan"
            int r5 = android.provider.Settings.Secure.getInt(r5, r0, r1)
            if (r5 != r2) goto L3e
            r1 = r2
        L3e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "checkUserPermission:"
            r5.append(r0)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            c.d.a.b.h.a(r4, r5)
        L52:
            return r1
    }

    public static java.lang.Boolean b(com.mobiletools.systemhelper.control.b r10) {
            java.lang.String r0 = "RegisterUtils"
            r1 = 0
            java.lang.String r2 = r10.E     // Catch: java.lang.Exception -> Lb1
            if (r2 == 0) goto Lba
            java.lang.String r2 = r10.E     // Catch: java.lang.Exception -> Lb1
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Exception -> Lb1
            if (r2 != 0) goto Lba
            java.lang.String r2 = r10.E     // Catch: java.lang.Exception -> Lb1
            java.lang.String r3 = "1"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> Lb1
            java.lang.String r3 = "46010"
            java.lang.String r4 = "46009"
            r5 = 1
            java.lang.String r6 = "46006"
            java.lang.String r7 = "is unicom network!"
            java.lang.String r8 = "46001"
            if (r2 == 0) goto L58
            java.lang.String r2 = r10.j     // Catch: java.lang.Exception -> Lb1
            if (r2 == 0) goto Lba
            java.lang.String r2 = r10.j     // Catch: java.lang.Exception -> Lb1
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Exception -> Lb1
            if (r2 != 0) goto Lba
            java.lang.String r2 = r10.j     // Catch: java.lang.Exception -> Lb1
            boolean r2 = r2.equals(r8)     // Catch: java.lang.Exception -> Lb1
            if (r2 != 0) goto L50
            java.lang.String r2 = r10.j     // Catch: java.lang.Exception -> Lb1
            boolean r2 = r2.equals(r6)     // Catch: java.lang.Exception -> Lb1
            if (r2 != 0) goto L50
            java.lang.String r2 = r10.j     // Catch: java.lang.Exception -> Lb1
            boolean r2 = r2.equals(r4)     // Catch: java.lang.Exception -> Lb1
            if (r2 != 0) goto L50
            java.lang.String r10 = r10.j     // Catch: java.lang.Exception -> Lb1
            boolean r10 = r10.equals(r3)     // Catch: java.lang.Exception -> Lb1
            if (r10 == 0) goto Lba
        L50:
            c.d.a.b.h.a(r0, r7)     // Catch: java.lang.Exception -> Lb1
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Exception -> Lb1
            return r10
        L58:
            java.lang.String r2 = r10.E     // Catch: java.lang.Exception -> Lb1
            java.lang.String r9 = "2"
            boolean r2 = r2.equals(r9)     // Catch: java.lang.Exception -> Lb1
            if (r2 == 0) goto L96
            java.lang.String r2 = r10.v     // Catch: java.lang.Exception -> Lb1
            if (r2 == 0) goto Lba
            java.lang.String r2 = r10.v     // Catch: java.lang.Exception -> Lb1
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Exception -> Lb1
            if (r2 != 0) goto Lba
            java.lang.String r2 = r10.v     // Catch: java.lang.Exception -> Lb1
            boolean r2 = r2.equals(r8)     // Catch: java.lang.Exception -> Lb1
            if (r2 != 0) goto L8e
            java.lang.String r2 = r10.v     // Catch: java.lang.Exception -> Lb1
            boolean r2 = r2.equals(r6)     // Catch: java.lang.Exception -> Lb1
            if (r2 != 0) goto L8e
            java.lang.String r2 = r10.v     // Catch: java.lang.Exception -> Lb1
            boolean r2 = r2.equals(r4)     // Catch: java.lang.Exception -> Lb1
            if (r2 != 0) goto L8e
            java.lang.String r10 = r10.v     // Catch: java.lang.Exception -> Lb1
            boolean r10 = r10.equals(r3)     // Catch: java.lang.Exception -> Lb1
            if (r10 == 0) goto Lba
        L8e:
            c.d.a.b.h.a(r0, r7)     // Catch: java.lang.Exception -> Lb1
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Exception -> Lb1
            return r10
        L96:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lb1
            r2.<init>()     // Catch: java.lang.Exception -> Lb1
            java.lang.String r3 = "isUnicomNetwork->DataSlot："
            r2.append(r3)     // Catch: java.lang.Exception -> Lb1
            java.lang.String r10 = r10.E     // Catch: java.lang.Exception -> Lb1
            r2.append(r10)     // Catch: java.lang.Exception -> Lb1
            java.lang.String r10 = r2.toString()     // Catch: java.lang.Exception -> Lb1
            c.d.a.b.h.b(r0, r10)     // Catch: java.lang.Exception -> Lb1
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Exception -> Lb1
            return r10
        Lb1:
            r10 = move-exception
            java.lang.String r2 = "Exception====isUnicomNetwork"
            c.d.a.b.h.b(r0, r2)
            r10.printStackTrace()
        Lba:
            java.lang.String r10 = "isunicomNetwork return false!"
            c.d.a.b.h.a(r0, r10)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r1)
            return r10
    }

    public static java.lang.Boolean b(java.lang.String r2) {
            if (r2 == 0) goto L39
            boolean r0 = r2.isEmpty()     // Catch: java.lang.Exception -> L2e
            if (r0 != 0) goto L39
            java.lang.String r0 = "46001"
            int r0 = r2.indexOf(r0)     // Catch: java.lang.Exception -> L2e
            if (r0 == 0) goto L28
            java.lang.String r0 = "46006"
            int r0 = r2.indexOf(r0)     // Catch: java.lang.Exception -> L2e
            if (r0 == 0) goto L28
            java.lang.String r0 = "46009"
            int r0 = r2.indexOf(r0)     // Catch: java.lang.Exception -> L2e
            if (r0 == 0) goto L28
            java.lang.String r0 = "46010"
            int r2 = r2.indexOf(r0)     // Catch: java.lang.Exception -> L2e
            if (r2 != 0) goto L39
        L28:
            r2 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Exception -> L2e
            return r2
        L2e:
            r2 = move-exception
            java.lang.String r0 = "RegisterUtils"
            java.lang.String r1 = "Exception==="
            c.d.a.b.h.b(r0, r1)
            r2.printStackTrace()
        L39:
            r2 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
    }

    public static java.lang.String b(java.lang.String r7, java.lang.String r8) {
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.String r1 = "android.os.SystemProperties"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L26 java.lang.Throwable -> L2a
            java.lang.String r2 = "get"
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L26 java.lang.Throwable -> L2a
            r5 = 0
            r4[r5] = r0     // Catch: java.lang.Exception -> L26 java.lang.Throwable -> L2a
            r6 = 1
            r4[r6] = r0     // Catch: java.lang.Exception -> L26 java.lang.Throwable -> L2a
            java.lang.reflect.Method r0 = r1.getMethod(r2, r4)     // Catch: java.lang.Exception -> L26 java.lang.Throwable -> L2a
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L26 java.lang.Throwable -> L2a
            r2[r5] = r7     // Catch: java.lang.Exception -> L26 java.lang.Throwable -> L2a
            java.lang.String r7 = "unknown"
            r2[r6] = r7     // Catch: java.lang.Exception -> L26 java.lang.Throwable -> L2a
            java.lang.Object r7 = r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L26 java.lang.Throwable -> L2a
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L26 java.lang.Throwable -> L2a
            return r7
        L26:
            r7 = move-exception
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L2a
        L2a:
            return r8
    }

    @android.annotation.SuppressLint({"SdCardPath"})
    public static void b(android.content.Context r1) {
            java.io.File r1 = new java.io.File
            java.lang.String r0 = "/data/data/com.mobiletools.systemhelper/shared_prefs/com_mobiletools_systemhelper_preference.xml"
            r1.<init>(r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L10
            r1.delete()
        L10:
            return
    }

    public static void b(android.content.Context r2, long r3) {
            java.lang.String r0 = "RegisterUtils"
            java.lang.String r1 = "setInitAppInfoInterval--->"
            c.d.a.b.h.a(r0, r1)
            java.lang.String r0 = "appInfoInterval2"
            b(r2, r0, r3)
            return
    }

    public static void b(android.content.Context r2, java.lang.String r3, long r4) {
            java.lang.String r0 = "com_mobiletools_systemhelper_preference"
            r1 = 4
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            r2.putLong(r3, r4)
            r2.commit()
            return
    }

    public static void b(android.content.Context r2, java.lang.String r3, java.lang.Boolean r4) {
            java.lang.String r0 = "com_mobiletools_systemhelper_preference"
            r1 = 4
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            boolean r4 = r4.booleanValue()
            r2.putBoolean(r3, r4)
            r2.commit()
            return
    }

    public static void b(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            java.lang.String r0 = "com_mobiletools_systemhelper_preference"
            r1 = 4
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            r2.putString(r3, r4)
            r2.commit()
            return
    }

    public static long c(android.content.Context r3) {
            java.lang.String r0 = "RegisterUtils"
            java.lang.String r1 = "getAppInfoInterval--->"
            c.d.a.b.h.a(r0, r1)
            long r0 = c.d.a.b.d.t
            java.lang.String r2 = "appInfoInterval"
            long r0 = a(r3, r2, r0)
            return r0
    }

    public static void c(android.content.Context r2, long r3) {
            java.lang.String r0 = "RegisterUtils"
            java.lang.String r1 = "setInitScheduleInterval--->"
            c.d.a.b.h.a(r0, r1)
            java.lang.String r0 = "scheduleInterval2"
            b(r2, r0, r3)
            return
    }

    public static long d(android.content.Context r3) {
            java.lang.String r0 = "RegisterUtils"
            java.lang.String r1 = "getInitAppInfoInterval--->"
            c.d.a.b.h.a(r0, r1)
            long r0 = c.d.a.b.d.m
            java.lang.String r2 = "appInfoInterval2"
            long r0 = a(r3, r2, r0)
            return r0
    }

    public static void d(android.content.Context r2, long r3) {
            java.lang.String r0 = "RegisterUtils"
            java.lang.String r1 = "setInitScheduleInterval--->"
            c.d.a.b.h.a(r0, r1)
            java.lang.String r0 = "signalInfoInterval2"
            b(r2, r0, r3)
            return
    }

    public static long e(android.content.Context r3) {
            java.lang.String r0 = "RegisterUtils"
            java.lang.String r1 = "getInitScheduleInterval--->"
            c.d.a.b.h.a(r0, r1)
            long r0 = c.d.a.b.d.n
            java.lang.String r2 = "scheduleInterval2"
            long r0 = a(r3, r2, r0)
            return r0
    }

    public static void e(android.content.Context r2, long r3) {
            java.lang.String r0 = "RegisterUtils"
            java.lang.String r1 = "setScheduleInterval--->"
            c.d.a.b.h.a(r0, r1)
            java.lang.String r0 = "scheduleInterval"
            b(r2, r0, r3)
            return
    }

    public static long f(android.content.Context r4) {
            java.lang.String r0 = "RegisterUtils"
            java.lang.String r1 = "getInitScheduleInterval--->"
            c.d.a.b.h.a(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "GlobalSetting.DEFAULT_RANDOM_SIG : "
            r1.append(r2)
            long r2 = c.d.a.b.d.o
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            c.d.a.b.h.a(r0, r1)
            long r0 = c.d.a.b.d.o
            java.lang.String r2 = "signalInfoInterval2"
            long r0 = a(r4, r2, r0)
            return r0
    }

    public static void f(android.content.Context r2, long r3) {
            java.lang.String r0 = "RegisterUtils"
            java.lang.String r1 = "setSignalInfoInterval--->"
            c.d.a.b.h.a(r0, r1)
            java.lang.String r0 = "signalInfoInterval"
            b(r2, r0, r3)
            return
    }

    public static long g(android.content.Context r3) {
            java.lang.String r0 = "RegisterUtils"
            java.lang.String r1 = "getScheduleInterval--->"
            c.d.a.b.h.a(r0, r1)
            long r0 = c.d.a.b.d.s
            java.lang.String r2 = "scheduleInterval"
            long r0 = a(r3, r2, r0)
            return r0
    }

    public static void g(android.content.Context r1, long r2) {
            java.lang.String r0 = "GetsignalInfoInterval"
            b(r1, r0, r2)
            return
    }

    public static java.lang.String h(android.content.Context r2) {
            boolean r0 = c.d.a.b.d.f1332b
            if (r0 == 0) goto L7
            java.lang.String r2 = c.d.a.b.d.l
            return r2
        L7:
            java.lang.String r0 = c.d.a.b.d.l
            java.lang.String r1 = "serverAddress"
            java.lang.String r2 = a(r2, r1, r0)
            return r2
    }

    public static long i(android.content.Context r3) {
            java.lang.String r0 = "RegisterUtils"
            java.lang.String r1 = "getSignalInfoInterval--->"
            c.d.a.b.h.a(r0, r1)
            long r0 = c.d.a.b.d.u
            java.lang.String r2 = "signalInfoInterval"
            long r0 = a(r3, r2, r0)
            return r0
    }

    public static long j(android.content.Context r3) {
            long r0 = c.d.a.b.d.v
            java.lang.String r2 = "GetsignalInfoInterval"
            long r0 = a(r3, r2, r0)
            return r0
    }

    public static java.lang.Boolean k(android.content.Context r2) {
            java.lang.String r0 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2
            android.net.NetworkInfo r2 = r2.getActiveNetworkInfo()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "network connected------------->:"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RegisterUtils"
            c.d.a.b.h.a(r1, r0)
            if (r2 == 0) goto L31
            boolean r2 = r2.isConnected()
            if (r2 != 0) goto L2b
            goto L31
        L2b:
            r2 = 1
        L2c:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L31:
            r2 = 0
            goto L2c
    }

    public static java.lang.Boolean l(android.content.Context r2) {
            java.lang.String r0 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2
            r0 = 1
            android.net.NetworkInfo r2 = r2.getNetworkInfo(r0)
            android.net.NetworkInfo$State r2 = r2.getState()
            android.net.NetworkInfo$State r1 = android.net.NetworkInfo.State.CONNECTED
            if (r2 != r1) goto L16
            goto L17
        L16:
            r0 = 0
        L17:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "isWifiConnected:"
            r2.append(r1)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r1 = "RegisterUtils"
            c.d.a.b.h.a(r1, r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
    }
}
