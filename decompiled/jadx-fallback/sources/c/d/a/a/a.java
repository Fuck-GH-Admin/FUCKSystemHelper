package c.d.a.a;

/* JADX INFO: loaded from: classes.dex */
public class a implements c.d.a.a.n.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.String f1323a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.lang.String f1324b = null;

    static {
            java.lang.String r0 = "persist.vendor.radio.5g_mode_pref"
            java.lang.String r1 = "0"
            java.lang.String r0 = a(r0, r1)
            c.d.a.a.a.f1323a = r0
            java.lang.String r0 = "persist.radio.vivo.fiveg"
            java.lang.String r1 = "false"
            java.lang.String r0 = a(r0, r1)
            c.d.a.a.a.f1324b = r0
            return
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int a(int r8) {
            java.lang.String r0 = "ro.product.manufacturer"
            java.lang.String r0 = c.d.a.b.l.a(r0)
            r1 = -1
            if (r0 == 0) goto La0
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto La0
            java.lang.String r2 = "Xiaomi"
            boolean r2 = r0.equalsIgnoreCase(r2)
            java.lang.String r3 = "getSubId"
            java.lang.String r4 = "android.telephony.SubscriptionManager"
            r5 = 0
            r6 = 1
            r7 = 0
            if (r2 != 0) goto L59
            java.lang.String r2 = "SamSung"
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 != 0) goto L59
            java.lang.String r2 = "WIKO"
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 != 0) goto L59
            java.lang.String r2 = "ZTE"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L37
            goto L59
        L37:
            java.lang.Class r0 = c.d.a.b.k.a(r4)
            java.lang.Class[] r2 = new java.lang.Class[r6]
            java.lang.Class r4 = java.lang.Integer.TYPE
            r2[r7] = r4
            java.lang.reflect.Method r0 = c.d.a.b.k.a(r0, r3, r2)
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r2[r7] = r8
            java.lang.Object r8 = c.d.a.b.k.a(r0, r5, r2)
            int[] r8 = (int[]) r8
            if (r8 == 0) goto L58
            r8 = r8[r7]
            return r8
        L58:
            return r1
        L59:
            java.lang.Class r0 = c.d.a.b.k.a(r4)
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 33
            if (r2 > r4) goto L81
            java.lang.Class[] r2 = new java.lang.Class[r6]
            java.lang.Class r4 = java.lang.Integer.TYPE
            r2[r7] = r4
            java.lang.reflect.Method r0 = c.d.a.b.k.a(r0, r3, r2)
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r2[r7] = r8
            java.lang.Object r8 = c.d.a.b.k.a(r0, r5, r2)
            int[] r8 = (int[]) r8
            if (r8 == 0) goto L80
            r8 = r8[r7]
            return r8
        L80:
            return r1
        L81:
            java.lang.Class[] r1 = new java.lang.Class[r6]
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r7] = r2
            java.lang.String r2 = "getSubscriptionId"
            java.lang.reflect.Method r0 = c.d.a.b.k.a(r0, r2, r1)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r1[r7] = r8
            java.lang.Object r8 = c.d.a.b.k.a(r0, r5, r1)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            return r8
        La0:
            return r1
    }

    public static java.lang.String a(java.lang.String r7, java.lang.String r8) {
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.String r1 = "android.os.SystemProperties"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L2b
            java.lang.String r2 = "get"
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L2b
            r5 = 0
            r4[r5] = r0     // Catch: java.lang.Exception -> L2b
            r6 = 1
            r4[r6] = r0     // Catch: java.lang.Exception -> L2b
            java.lang.reflect.Method r0 = r1.getMethod(r2, r4)     // Catch: java.lang.Exception -> L2b
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L2b
            r2[r5] = r7     // Catch: java.lang.Exception -> L2b
            r2[r6] = r8     // Catch: java.lang.Exception -> L2b
            java.lang.Object r7 = r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L2b
            if (r7 == 0) goto L33
            boolean r0 = r7 instanceof java.lang.String     // Catch: java.lang.Exception -> L2b
            if (r0 == 0) goto L33
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L2b
            r8 = r7
            goto L33
        L2b:
            r7 = move-exception
            java.lang.String r0 = "DeviceInfoReaderBase"
            java.lang.String r1 = "getString failed"
            android.util.Log.e(r0, r1, r7)
        L33:
            return r8
    }

    private java.lang.String c(android.content.Context r6, int r7) {
            r5 = this;
            java.lang.String r0 = "telephony_subscription_service"
            java.lang.Object r0 = r6.getSystemService(r0)
            android.telephony.SubscriptionManager r0 = (android.telephony.SubscriptionManager) r0
            int r0 = android.telephony.SubscriptionManager.getDefaultDataSubscriptionId()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto L28
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r0 = android.telephony.SubscriptionManager.getSlotIndex(r0)
            r1.append(r0)
            java.lang.String r0 = ""
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L29
        L28:
            r0 = 0
        L29:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "DataSlot:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "DeviceInfoReaderBase"
            android.util.Log.d(r2, r1)
            java.lang.String r1 = r5.b(r6, r7)
            int r0 = java.lang.Integer.parseInt(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "get5GState: ----switchState:"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r4 = "-----slotBySubId："
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r2, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "phoneId:"
            r3.append(r4)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r2, r3)
            boolean r5 = r5.c(r6)
            if (r5 != 0) goto L81
            if (r0 == r7) goto L81
            java.lang.String r1 = "0"
        L81:
            return r1
    }

    private java.lang.String d(android.content.Context r5) {
            r4 = this;
            android.content.ContentResolver r4 = r5.getContentResolver()
            java.lang.String r5 = "miui_version_name"
            java.lang.String r4 = android.provider.Settings.Global.getString(r4, r5)
            java.lang.String r5 = "ro.build.version.incremental"
            java.lang.String r5 = c.d.a.b.l.a(r5)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 1
            if (r0 != 0) goto L26
            int r0 = r4.length()
            if (r0 <= r1) goto L26
            java.lang.String r5 = "\r|\n"
            java.lang.String r0 = ""
            java.lang.String r5 = r4.replaceAll(r5, r0)
            goto L71
        L26:
            if (r5 == 0) goto L71
            int r4 = r5.length()
            if (r4 == 0) goto L71
            java.lang.String r4 = "."
            int r0 = r5.lastIndexOf(r4)
            java.lang.String r2 = r5.substring(r1, r0)
            int r3 = r2.indexOf(r4)
            int r3 = r3 + r1
            int r3 = r2.indexOf(r4, r3)
            int r3 = r3 + r1
            int r4 = r2.indexOf(r4, r3)
            r3 = 0
            java.lang.String r4 = r2.substring(r3, r4)
            int r0 = r0 + r1
            java.lang.String r5 = r5.substring(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "MIUI "
            r0.append(r1)
            r0.append(r4)
            r0.append(r2)
            java.lang.String r4 = "("
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = ")"
            r0.append(r4)
            java.lang.String r5 = r0.toString()
        L71:
            return r5
    }

    public static synchronized void e(android.content.Context r6) {
            java.lang.Class<c.d.a.a.a> r0 = c.d.a.a.a.class
            monitor-enter(r0)
            java.lang.String r1 = "DeviceInfoReaderBase"
            java.lang.String r2 = "listenNetworkState---->"
            c.d.a.b.h.a(r1, r2)     // Catch: java.lang.Throwable -> Ld8
            boolean r1 = c.d.a.b.d.e     // Catch: java.lang.Throwable -> Ld8
            if (r1 == 0) goto Ld6
            r1 = 0
            int r2 = a(r1)     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r3 = "DeviceInfoReaderBase"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld8
            r4.<init>()     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r5 = "subIdSlot1:"
            r4.append(r5)     // Catch: java.lang.Throwable -> Ld8
            r4.append(r2)     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Ld8
            c.d.a.b.h.a(r3, r4)     // Catch: java.lang.Throwable -> Ld8
            if (r2 <= 0) goto L72
            android.telephony.TelephonyManager r3 = c.d.a.b.d.f     // Catch: java.lang.Throwable -> Ld8
            if (r3 != 0) goto L72
            java.lang.String r3 = "phone"
            java.lang.Object r3 = r6.getSystemService(r3)     // Catch: java.lang.Throwable -> Ld8
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3     // Catch: java.lang.Throwable -> Ld8
            android.telephony.TelephonyManager r2 = r3.createForSubscriptionId(r2)     // Catch: java.lang.Throwable -> Ld8
            c.d.a.b.d.f = r2     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r2 = "DeviceInfoReaderBase"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld8
            r3.<init>()     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r4 = "telephonyManagerSlot1"
            r3.append(r4)     // Catch: java.lang.Throwable -> Ld8
            android.telephony.TelephonyManager r4 = c.d.a.b.d.f     // Catch: java.lang.Throwable -> Ld8
            r3.append(r4)     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Ld8
            c.d.a.b.h.a(r2, r3)     // Catch: java.lang.Throwable -> Ld8
            com.mobiletools.systemhelper.control.a r2 = c.d.a.b.d.h     // Catch: java.lang.Throwable -> Ld8
            if (r2 != 0) goto L72
            java.lang.String r2 = "DeviceInfoReaderBase"
            java.lang.String r3 = "registerTelephonyCallback--mDMTelephonyCallback1"
            c.d.a.b.h.a(r2, r3)     // Catch: java.lang.Throwable -> Ld8
            com.mobiletools.systemhelper.control.a r2 = new com.mobiletools.systemhelper.control.a     // Catch: java.lang.Throwable -> Ld8
            r2.<init>(r6, r1)     // Catch: java.lang.Throwable -> Ld8
            c.d.a.b.d.h = r2     // Catch: java.lang.Throwable -> Ld8
            android.telephony.TelephonyManager r1 = c.d.a.b.d.f     // Catch: java.lang.Throwable -> Ld8
            java.util.concurrent.Executor r2 = r6.getMainExecutor()     // Catch: java.lang.Throwable -> Ld8
            com.mobiletools.systemhelper.control.a r3 = c.d.a.b.d.h     // Catch: java.lang.Throwable -> Ld8
            r1.registerTelephonyCallback(r2, r3)     // Catch: java.lang.Throwable -> Ld8
        L72:
            r1 = 1
            int r2 = a(r1)     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r3 = "DeviceInfoReaderBase"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld8
            r4.<init>()     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r5 = "subIdSlot2:"
            r4.append(r5)     // Catch: java.lang.Throwable -> Ld8
            r4.append(r2)     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Ld8
            c.d.a.b.h.a(r3, r4)     // Catch: java.lang.Throwable -> Ld8
            if (r2 <= 0) goto Ld6
            android.telephony.TelephonyManager r3 = c.d.a.b.d.g     // Catch: java.lang.Throwable -> Ld8
            if (r3 != 0) goto Ld6
            java.lang.String r3 = "phone"
            java.lang.Object r3 = r6.getSystemService(r3)     // Catch: java.lang.Throwable -> Ld8
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3     // Catch: java.lang.Throwable -> Ld8
            android.telephony.TelephonyManager r2 = r3.createForSubscriptionId(r2)     // Catch: java.lang.Throwable -> Ld8
            c.d.a.b.d.g = r2     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r2 = "DeviceInfoReaderBase"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld8
            r3.<init>()     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r4 = "telephonyManagerSlot2"
            r3.append(r4)     // Catch: java.lang.Throwable -> Ld8
            android.telephony.TelephonyManager r4 = c.d.a.b.d.g     // Catch: java.lang.Throwable -> Ld8
            r3.append(r4)     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Ld8
            c.d.a.b.h.a(r2, r3)     // Catch: java.lang.Throwable -> Ld8
            com.mobiletools.systemhelper.control.a r2 = c.d.a.b.d.i     // Catch: java.lang.Throwable -> Ld8
            if (r2 != 0) goto Ld6
            java.lang.String r2 = "DeviceInfoReaderBase"
            java.lang.String r3 = "registerTelephonyCallback--mDMTelephonyCallback2"
            c.d.a.b.h.a(r2, r3)     // Catch: java.lang.Throwable -> Ld8
            com.mobiletools.systemhelper.control.a r2 = new com.mobiletools.systemhelper.control.a     // Catch: java.lang.Throwable -> Ld8
            r2.<init>(r6, r1)     // Catch: java.lang.Throwable -> Ld8
            c.d.a.b.d.i = r2     // Catch: java.lang.Throwable -> Ld8
            android.telephony.TelephonyManager r1 = c.d.a.b.d.g     // Catch: java.lang.Throwable -> Ld8
            java.util.concurrent.Executor r6 = r6.getMainExecutor()     // Catch: java.lang.Throwable -> Ld8
            com.mobiletools.systemhelper.control.a r2 = c.d.a.b.d.i     // Catch: java.lang.Throwable -> Ld8
            r1.registerTelephonyCallback(r6, r2)     // Catch: java.lang.Throwable -> Ld8
        Ld6:
            monitor-exit(r0)
            return
        Ld8:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
    }

    public static synchronized void f(android.content.Context r3) {
            java.lang.Class<c.d.a.a.a> r3 = c.d.a.a.a.class
            monitor-enter(r3)
            java.lang.String r0 = "DeviceInfoReaderBase"
            java.lang.String r1 = "unlistenNetworkState-->"
            c.d.a.b.h.a(r0, r1)     // Catch: java.lang.Throwable -> L35
            com.mobiletools.systemhelper.control.a r0 = c.d.a.b.d.h     // Catch: java.lang.Throwable -> L35
            r1 = 31
            if (r0 == 0) goto L1b
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L35
            if (r0 < r1) goto L1b
            android.telephony.TelephonyManager r0 = c.d.a.b.d.f     // Catch: java.lang.Throwable -> L35
            com.mobiletools.systemhelper.control.a r2 = c.d.a.b.d.h     // Catch: java.lang.Throwable -> L35
            r0.unregisterTelephonyCallback(r2)     // Catch: java.lang.Throwable -> L35
        L1b:
            r0 = 0
            c.d.a.b.d.f = r0     // Catch: java.lang.Throwable -> L35
            c.d.a.b.d.h = r0     // Catch: java.lang.Throwable -> L35
            com.mobiletools.systemhelper.control.a r2 = c.d.a.b.d.i     // Catch: java.lang.Throwable -> L35
            if (r2 == 0) goto L2f
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L35
            if (r2 < r1) goto L2f
            android.telephony.TelephonyManager r1 = c.d.a.b.d.g     // Catch: java.lang.Throwable -> L35
            com.mobiletools.systemhelper.control.a r2 = c.d.a.b.d.i     // Catch: java.lang.Throwable -> L35
            r1.unregisterTelephonyCallback(r2)     // Catch: java.lang.Throwable -> L35
        L2f:
            c.d.a.b.d.g = r0     // Catch: java.lang.Throwable -> L35
            c.d.a.b.d.i = r0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r3)
            return
        L35:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    public java.lang.Object a(android.content.Context r3, java.lang.String r4, java.lang.String r5, int r6) {
            r2 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r1 = "slotId"
            r0.put(r1, r6)
            java.util.HashMap r2 = r2.a(r3, r4, r0)
            if (r2 == 0) goto L19
            java.lang.Object r2 = r2.get(r5)
            return r2
        L19:
            r2 = 0
            return r2
    }

    protected synchronized java.lang.String a(android.content.Context r3, int r4) {
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "-1"
            java.lang.String r1 = "telephony_ims"
            java.lang.Object r3 = r3.getSystemService(r1)     // Catch: java.lang.Throwable -> L22
            android.telephony.ims.ImsManager r3 = (android.telephony.ims.ImsManager) r3     // Catch: java.lang.Throwable -> L22
            int r4 = a(r4)     // Catch: java.lang.Throwable -> L22
            if (r4 < 0) goto L20
            android.telephony.ims.ImsMmTelManager r3 = r3.getImsMmTelManager(r4)     // Catch: java.lang.Throwable -> L22
            boolean r3 = r3.isAdvancedCallingSettingEnabled()     // Catch: java.lang.Throwable -> L22
            if (r3 == 0) goto L1e
            java.lang.String r0 = "1"
            goto L20
        L1e:
            java.lang.String r0 = "0"
        L20:
            monitor-exit(r2)
            return r0
        L22:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    public java.util.HashMap<java.lang.String, java.lang.Object> a(android.content.Context r10, java.lang.String r11, java.util.HashMap<java.lang.String, java.lang.Object> r12) {
            r9 = this;
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            java.lang.String r0 = "DeviceInfoReaderBase"
            r1 = 0
            if (r11 != 0) goto L8
            return r1
        L8:
            java.lang.String r2 = "phone"
            java.lang.Object r10 = r10.getSystemService(r2)     // Catch: java.lang.Exception -> Ld3
            android.telephony.TelephonyManager r10 = (android.telephony.TelephonyManager) r10     // Catch: java.lang.Exception -> Ld3
            java.lang.Class r2 = r10.getClass()     // Catch: java.lang.Exception -> Ld3
            java.lang.String r3 = "getITelephony"
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r1)     // Catch: java.lang.Exception -> Ld3
            r3 = 1
            r2.setAccessible(r3)     // Catch: java.lang.Exception -> Ld3
            java.lang.Object r10 = r2.invoke(r10, r1)     // Catch: java.lang.Exception -> Ld3
            if (r10 == 0) goto Lb9
            java.lang.String r2 = "com.android.internal.telephony.VivoTelephonyApiParams"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Exception -> Ld3
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> Ld3
            r5 = 0
            r4[r5] = r9     // Catch: java.lang.Exception -> Ld3
            java.lang.reflect.Constructor r4 = r2.getConstructor(r4)     // Catch: java.lang.Exception -> Ld3
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> Ld3
            r6[r5] = r11     // Catch: java.lang.Exception -> Ld3
            java.lang.Object r11 = r4.newInstance(r6)     // Catch: java.lang.Exception -> Ld3
            if (r12 == 0) goto L8b
            java.lang.String r4 = "put"
            r6 = 2
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> Ld3
            r7[r5] = r9     // Catch: java.lang.Exception -> Ld3
            java.lang.Class<java.lang.Object> r9 = java.lang.Object.class
            r7[r3] = r9     // Catch: java.lang.Exception -> Ld3
            java.lang.reflect.Method r9 = r2.getMethod(r4, r7)     // Catch: java.lang.Exception -> Ld3
            java.util.Set r4 = r12.keySet()     // Catch: java.lang.Exception -> Ld3
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Exception -> Ld3
        L54:
            boolean r7 = r4.hasNext()     // Catch: java.lang.Exception -> Ld3
            if (r7 == 0) goto L8b
            java.lang.Object r7 = r4.next()     // Catch: java.lang.Exception -> Ld3
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> Ld3
            java.lang.String r8 = "slot"
            boolean r8 = r8.equals(r7)     // Catch: java.lang.Exception -> Ld3
            if (r8 != 0) goto L70
            java.lang.String r8 = "phoneId"
            boolean r8 = r8.equals(r7)     // Catch: java.lang.Exception -> Ld3
            if (r8 == 0) goto L7d
        L70:
            java.lang.Object r8 = r12.get(r7)     // Catch: java.lang.Exception -> Ld3
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch: java.lang.Exception -> Ld3
            int r8 = r8.intValue()     // Catch: java.lang.Exception -> Ld3
            if (r8 >= 0) goto L7d
            goto L54
        L7d:
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> Ld3
            r8[r5] = r7     // Catch: java.lang.Exception -> Ld3
            java.lang.Object r7 = r12.get(r7)     // Catch: java.lang.Exception -> Ld3
            r8[r3] = r7     // Catch: java.lang.Exception -> Ld3
            r9.invoke(r11, r8)     // Catch: java.lang.Exception -> Ld3
            goto L54
        L8b:
            java.lang.Class r9 = r10.getClass()     // Catch: java.lang.Exception -> Ld3
            java.lang.String r12 = "vivoTelephonyApi"
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> Ld3
            r4[r5] = r2     // Catch: java.lang.Exception -> Ld3
            java.lang.reflect.Method r9 = r9.getMethod(r12, r4)     // Catch: java.lang.Exception -> Ld3
            java.lang.Object[] r12 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> Ld3
            r12[r5] = r11     // Catch: java.lang.Exception -> Ld3
            java.lang.Object r9 = r9.invoke(r10, r12)     // Catch: java.lang.Exception -> Ld3
            if (r9 == 0) goto Ldb
            java.lang.Class r10 = r9.getClass()     // Catch: java.lang.Exception -> Ld3
            java.lang.String r11 = "getParamValues"
            java.lang.Class[] r12 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> Ld3
            java.lang.reflect.Method r10 = r10.getMethod(r11, r12)     // Catch: java.lang.Exception -> Ld3
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> Ld3
            java.lang.Object r9 = r10.invoke(r9, r11)     // Catch: java.lang.Exception -> Ld3
            java.util.HashMap r9 = (java.util.HashMap) r9     // Catch: java.lang.Exception -> Ld3
            r1 = r9
            goto Ldb
        Lb9:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld3
            r9.<init>()     // Catch: java.lang.Exception -> Ld3
            java.lang.String r10 = "invoke method: "
            r9.append(r10)     // Catch: java.lang.Exception -> Ld3
            r9.append(r11)     // Catch: java.lang.Exception -> Ld3
            java.lang.String r10 = " error!"
            r9.append(r10)     // Catch: java.lang.Exception -> Ld3
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Exception -> Ld3
            android.util.Log.e(r0, r9)     // Catch: java.lang.Exception -> Ld3
            goto Ldb
        Ld3:
            r9 = move-exception
            java.lang.String r9 = android.util.Log.getStackTraceString(r9)
            android.util.Log.e(r0, r9)
        Ldb:
            return r1
    }

    protected synchronized void a(android.content.Context r17, int r18, com.mobiletools.systemhelper.control.b r19) {
            r16 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            monitor-enter(r16)
            java.lang.String r3 = "android.permission.ACCESS_COARSE_LOCATION"
            int r3 = b.b.c.a.a.a(r0, r3)     // Catch: java.lang.Throwable -> L25e
            if (r3 != 0) goto L255
            java.lang.String r3 = "android.permission.READ_PHONE_STATE"
            int r3 = b.b.c.a.a.a(r0, r3)     // Catch: java.lang.Throwable -> L25e
            if (r3 == 0) goto L19
            goto L255
        L19:
            int r3 = a(r18)     // Catch: java.lang.Throwable -> L25e
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = ""
            java.lang.String r8 = "1"
            java.lang.String r9 = "phone"
            java.lang.Object r0 = r0.getSystemService(r9)     // Catch: java.lang.Throwable -> L25e
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch: java.lang.Throwable -> L25e
            android.telephony.TelephonyManager r0 = r0.createForSubscriptionId(r3)     // Catch: java.lang.Throwable -> L25e
            java.lang.String r3 = r0.getSimSerialNumber()     // Catch: java.lang.Throwable -> L25e
            java.lang.String r9 = "DeviceInfoReaderBase"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25e
            r10.<init>()     // Catch: java.lang.Throwable -> L25e
            java.lang.String r11 = "iccid:"
            r10.append(r11)     // Catch: java.lang.Throwable -> L25e
            r10.append(r3)     // Catch: java.lang.Throwable -> L25e
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L25e
            c.d.a.b.h.a(r9, r10)     // Catch: java.lang.Throwable -> L25e
            if (r3 == 0) goto L55
            boolean r9 = r3.isEmpty()     // Catch: java.lang.Throwable -> L25e
            if (r9 == 0) goto L57
        L55:
            java.lang.String r3 = "ex01"
        L57:
            java.lang.String r9 = r0.getSubscriberId()     // Catch: java.lang.Throwable -> L25e
            if (r9 == 0) goto L63
            boolean r10 = r9.isEmpty()     // Catch: java.lang.Throwable -> L25e
            if (r10 == 0) goto L65
        L63:
            java.lang.String r9 = "ex01"
        L65:
            java.lang.String r10 = r0.getNetworkOperator()     // Catch: java.lang.Throwable -> L25e
            java.lang.String r11 = "DeviceInfoReaderBase"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25e
            r12.<init>()     // Catch: java.lang.Throwable -> L25e
            java.lang.String r13 = "MNCCH register network:"
            r12.append(r13)     // Catch: java.lang.Throwable -> L25e
            r12.append(r10)     // Catch: java.lang.Throwable -> L25e
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L25e
            c.d.a.b.h.a(r11, r12)     // Catch: java.lang.Throwable -> L25e
            java.lang.String r11 = r0.getSimOperator()     // Catch: java.lang.Throwable -> L25e
            java.lang.String r12 = "DeviceInfoReaderBase"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25e
            r13.<init>()     // Catch: java.lang.Throwable -> L25e
            java.lang.String r14 = "tm.getSimOperator mnc :"
            r13.append(r14)     // Catch: java.lang.Throwable -> L25e
            r13.append(r11)     // Catch: java.lang.Throwable -> L25e
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L25e
            c.d.a.b.h.a(r12, r13)     // Catch: java.lang.Throwable -> L25e
            if (r11 == 0) goto La1
            boolean r12 = r11.isEmpty()     // Catch: java.lang.Throwable -> L25e
            if (r12 == 0) goto La3
        La1:
            java.lang.String r11 = "ex01"
        La3:
            android.telephony.ServiceState r0 = r0.getServiceState()     // Catch: java.lang.Throwable -> L25e
            if (r0 == 0) goto L24c
            java.util.List r0 = r0.getNetworkRegistrationInfoList()     // Catch: java.lang.Throwable -> L25e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L25e
        Lb1:
            boolean r12 = r0.hasNext()     // Catch: java.lang.Throwable -> L25e
            r13 = 1
            if (r12 == 0) goto L1bb
            java.lang.Object r12 = r0.next()     // Catch: java.lang.Throwable -> L25e
            android.telephony.NetworkRegistrationInfo r12 = (android.telephony.NetworkRegistrationInfo) r12     // Catch: java.lang.Throwable -> L25e
            int r14 = r12.getDomain()     // Catch: java.lang.Throwable -> L25e
            r15 = 2
            if (r14 != r15) goto Lb1
            int r14 = r12.getTransportType()     // Catch: java.lang.Throwable -> L25e
            if (r14 != r13) goto Lb1
            java.lang.String r14 = r12.toString()     // Catch: java.lang.Throwable -> L25e
            android.telephony.CellIdentity r12 = r12.getCellIdentity()     // Catch: java.lang.Throwable -> L25e
            if (r12 != 0) goto Lde
            java.lang.String r0 = "DeviceInfoReaderBase"
            java.lang.String r12 = "cellIdentity==null!"
            c.d.a.b.h.b(r0, r12)     // Catch: java.lang.Throwable -> L25e
            goto L1bb
        Lde:
            boolean r13 = r12 instanceof android.telephony.CellIdentityGsm     // Catch: java.lang.Throwable -> L25e
            if (r13 == 0) goto Lf8
            android.telephony.CellIdentityGsm r12 = (android.telephony.CellIdentityGsm) r12     // Catch: java.lang.Throwable -> L25e
            int r0 = r12.getCid()     // Catch: java.lang.Throwable -> L25e
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L25e
            int r0 = r12.getLac()     // Catch: java.lang.Throwable -> L25e
            java.lang.String r5 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L25e
            java.lang.String r7 = "GSM"
            goto L1bb
        Lf8:
            boolean r13 = r12 instanceof android.telephony.CellIdentityWcdma     // Catch: java.lang.Throwable -> L25e
            if (r13 == 0) goto L112
            android.telephony.CellIdentityWcdma r12 = (android.telephony.CellIdentityWcdma) r12     // Catch: java.lang.Throwable -> L25e
            int r0 = r12.getCid()     // Catch: java.lang.Throwable -> L25e
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L25e
            int r0 = r12.getLac()     // Catch: java.lang.Throwable -> L25e
            java.lang.String r5 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L25e
            java.lang.String r7 = "WCDMA"
            goto L1bb
        L112:
            boolean r13 = r12 instanceof android.telephony.CellIdentityTdscdma     // Catch: java.lang.Throwable -> L25e
            if (r13 == 0) goto L12c
            android.telephony.CellIdentityTdscdma r12 = (android.telephony.CellIdentityTdscdma) r12     // Catch: java.lang.Throwable -> L25e
            int r0 = r12.getCid()     // Catch: java.lang.Throwable -> L25e
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L25e
            int r0 = r12.getLac()     // Catch: java.lang.Throwable -> L25e
            java.lang.String r5 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L25e
            java.lang.String r7 = "TD-SCDMA"
            goto L1bb
        L12c:
            boolean r13 = r12 instanceof android.telephony.CellIdentityCdma     // Catch: java.lang.Throwable -> L25e
            if (r13 == 0) goto L162
            android.telephony.CellIdentityCdma r12 = (android.telephony.CellIdentityCdma) r12     // Catch: java.lang.Throwable -> L25e
            int r0 = r12.getBasestationId()     // Catch: java.lang.Throwable -> L25e
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L25e
            int r0 = r12.getLongitude()     // Catch: java.lang.Throwable -> L25e
            int r7 = r12.getLatitude()     // Catch: java.lang.Throwable -> L25e
            r12 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r12) goto L15f
            if (r7 == r12) goto L15f
            java.lang.String r5 = "%d:%d"
            java.lang.Object[] r12 = new java.lang.Object[r15]     // Catch: java.lang.Throwable -> L25e
            r13 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L25e
            r12[r13] = r0     // Catch: java.lang.Throwable -> L25e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L25e
            r7 = 1
            r12[r7] = r0     // Catch: java.lang.Throwable -> L25e
            java.lang.String r5 = java.lang.String.format(r5, r12)     // Catch: java.lang.Throwable -> L25e
        L15f:
            java.lang.String r7 = "CDMA"
            goto L1bb
        L162:
            boolean r13 = r12 instanceof android.telephony.CellIdentityLte     // Catch: java.lang.Throwable -> L25e
            if (r13 == 0) goto L190
            android.telephony.CellIdentityLte r12 = (android.telephony.CellIdentityLte) r12     // Catch: java.lang.Throwable -> L25e
            int r0 = r12.getCi()     // Catch: java.lang.Throwable -> L25e
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L25e
            int r0 = r12.getTac()     // Catch: java.lang.Throwable -> L25e
            java.lang.String r5 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L25e
            int r0 = r12.getPci()     // Catch: java.lang.Throwable -> L25e
            java.lang.String r6 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L25e
            java.lang.String r0 = "LTE"
            java.lang.String r7 = "isEnDcAvailable = true"
            boolean r7 = r14.contains(r7)     // Catch: java.lang.Throwable -> L25e
            if (r7 == 0) goto L18c
            java.lang.String r0 = "NSA"
        L18c:
            r7 = r0
        L18d:
            java.lang.String r8 = "1"
            goto L1bb
        L190:
            boolean r13 = r12 instanceof android.telephony.CellIdentityNr     // Catch: java.lang.Throwable -> L25e
            if (r13 == 0) goto Lb1
            android.telephony.CellIdentityNr r12 = (android.telephony.CellIdentityNr) r12     // Catch: java.lang.Throwable -> L25e
            long r4 = r12.getNci()     // Catch: java.lang.Throwable -> L25e
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L25e
            int r0 = r12.getTac()     // Catch: java.lang.Throwable -> L25e
            java.lang.String r5 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L25e
            int r0 = r12.getPci()     // Catch: java.lang.Throwable -> L25e
            java.lang.String r6 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L25e
            java.lang.String r7 = "SA"
            java.lang.String r0 = "mVopsSupport = 1"
            boolean r0 = r14.contains(r0)     // Catch: java.lang.Throwable -> L25e
            if (r0 == 0) goto L1b9
            goto L18d
        L1b9:
            java.lang.String r8 = "0"
        L1bb:
            if (r4 == 0) goto L1c3
            boolean r0 = r4.isEmpty()     // Catch: java.lang.Throwable -> L25e
            if (r0 == 0) goto L1c5
        L1c3:
            java.lang.String r4 = "ex01"
        L1c5:
            if (r5 == 0) goto L1cd
            boolean r0 = r5.isEmpty()     // Catch: java.lang.Throwable -> L25e
            if (r0 == 0) goto L1cf
        L1cd:
            java.lang.String r5 = "ex01"
        L1cf:
            if (r6 == 0) goto L1d7
            boolean r0 = r6.isEmpty()     // Catch: java.lang.Throwable -> L25e
            if (r0 == 0) goto L1d9
        L1d7:
            java.lang.String r6 = "ex01"
        L1d9:
            boolean r0 = r7.isEmpty()     // Catch: java.lang.Throwable -> L25e
            if (r0 == 0) goto L1e1
            java.lang.String r7 = "ex01"
        L1e1:
            java.lang.String r0 = "DeviceInfoReaderBase"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25e
            r12.<init>()     // Catch: java.lang.Throwable -> L25e
            java.lang.String r13 = "getNetworkRegistrationInfo->slot:"
            r12.append(r13)     // Catch: java.lang.Throwable -> L25e
            r12.append(r1)     // Catch: java.lang.Throwable -> L25e
            java.lang.String r13 = ", tac:"
            r12.append(r13)     // Catch: java.lang.Throwable -> L25e
            r12.append(r5)     // Catch: java.lang.Throwable -> L25e
            java.lang.String r13 = ", cid:"
            r12.append(r13)     // Catch: java.lang.Throwable -> L25e
            r12.append(r4)     // Catch: java.lang.Throwable -> L25e
            java.lang.String r13 = "，pci:"
            r12.append(r13)     // Catch: java.lang.Throwable -> L25e
            r12.append(r6)     // Catch: java.lang.Throwable -> L25e
            java.lang.String r13 = "，networkType:"
            r12.append(r13)     // Catch: java.lang.Throwable -> L25e
            r12.append(r7)     // Catch: java.lang.Throwable -> L25e
            java.lang.String r13 = ", voNREnable:"
            r12.append(r13)     // Catch: java.lang.Throwable -> L25e
            r12.append(r8)     // Catch: java.lang.Throwable -> L25e
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L25e
            c.d.a.b.h.a(r0, r12)     // Catch: java.lang.Throwable -> L25e
            if (r1 == 0) goto L238
            r0 = 1
            if (r1 == r0) goto L225
            goto L24a
        L225:
            r2.t = r3     // Catch: java.lang.Throwable -> L25e
            r2.u = r9     // Catch: java.lang.Throwable -> L25e
            r2.v = r11     // Catch: java.lang.Throwable -> L25e
            r2.w = r10     // Catch: java.lang.Throwable -> L25e
            r2.z = r4     // Catch: java.lang.Throwable -> L25e
            r2.y = r5     // Catch: java.lang.Throwable -> L25e
            r2.A = r6     // Catch: java.lang.Throwable -> L25e
            r2.x = r7     // Catch: java.lang.Throwable -> L25e
            r2.D = r8     // Catch: java.lang.Throwable -> L25e
            goto L24a
        L238:
            r2.h = r3     // Catch: java.lang.Throwable -> L25e
            r2.i = r9     // Catch: java.lang.Throwable -> L25e
            r2.j = r11     // Catch: java.lang.Throwable -> L25e
            r2.k = r10     // Catch: java.lang.Throwable -> L25e
            r2.n = r4     // Catch: java.lang.Throwable -> L25e
            r2.m = r5     // Catch: java.lang.Throwable -> L25e
            r2.o = r6     // Catch: java.lang.Throwable -> L25e
            r2.l = r7     // Catch: java.lang.Throwable -> L25e
            r2.r = r8     // Catch: java.lang.Throwable -> L25e
        L24a:
            monitor-exit(r16)
            return
        L24c:
            java.lang.String r0 = "DeviceInfoReaderBase"
            java.lang.String r1 = "setCellLoc failed!"
            c.d.a.b.h.a(r0, r1)     // Catch: java.lang.Throwable -> L25e
            monitor-exit(r16)
            return
        L255:
            java.lang.String r0 = "DeviceInfoReaderBase"
            java.lang.String r1 = "getNetworkRegistrationInfo no enough permission!"
            c.d.a.b.h.b(r0, r1)     // Catch: java.lang.Throwable -> L25e
            monitor-exit(r16)
            return
        L25e:
            r0 = move-exception
            monitor-exit(r16)
            throw r0
    }

    @Override // c.d.a.a.n.c
    public void a(android.content.Context r8, com.mobiletools.systemhelper.control.b r9) {
            r7 = this;
            java.lang.String r0 = android.os.Build.MODEL
            r9.f1414b = r0
            java.util.Map<java.lang.String, java.lang.String> r1 = c.d.a.a.n.f1325a
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r9.f1413a = r0
            if (r0 == 0) goto L16
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1a
        L16:
            java.lang.String r0 = android.os.Build.MANUFACTURER
            r9.f1413a = r0
        L1a:
            java.lang.String r0 = r9.f1413a
            java.lang.String r1 = "vivo"
            boolean r0 = r0.equals(r1)
            java.lang.String r2 = "vivo DM isUserPermissionOpen : "
            java.lang.String r3 = "DeviceInfoReaderBase"
            if (r0 == 0) goto L45
            boolean r0 = c.d.a.b.l.a(r8)
            c.d.a.b.d.e = r0
            if (r0 != 0) goto L4b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
        L35:
            r7.append(r2)
            boolean r8 = c.d.a.b.d.e
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            c.d.a.b.h.a(r3, r7)
            return
        L45:
            boolean r0 = r7.b(r8)
            c.d.a.b.d.e = r0
        L4b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "queryAppUsageStatsDescend  isUserPermissionOpen :"
            r0.append(r4)
            boolean r4 = c.d.a.b.d.e
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            c.d.a.b.h.a(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "GlobalSetting.isUserPermissionOpen"
            r0.append(r4)
            boolean r4 = c.d.a.b.d.e
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            c.d.a.b.h.a(r3, r0)
            boolean r0 = c.d.a.b.d.e
            java.lang.String r4 = "Unknown"
            java.lang.String r5 = "ro.hardware.version"
            java.lang.String r6 = "Android"
            if (r0 == 0) goto Lf5
            r9.e = r6
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            r9.f = r0
            java.lang.String r0 = r9.f1413a
            java.lang.String r6 = "Xiaomi"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L96
            java.lang.String r0 = r7.d(r8)
            goto L98
        L96:
            java.lang.String r0 = android.os.Build.DISPLAY
        L98:
            r9.d = r0
            java.lang.String r0 = c.d.a.b.l.a(r5, r4)
            r9.f1415c = r0
            org.json.JSONObject r0 = c.d.a.b.g.b(r8)
            r9.I = r0
            java.lang.String r0 = r9.f1413a
            boolean r0 = r0.equals(r1)
            java.lang.String r1 = "Unsupported API:"
            if (r0 == 0) goto Ld6
            android.content.Context r0 = c.d.a.b.d.d
            boolean r0 = c.d.a.b.l.a(r0)
            c.d.a.b.d.e = r0
            if (r0 != 0) goto Lc1
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            goto L35
        Lc1:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r0 < r2) goto Ld0
            java.lang.String r0 = "enter DeviceInfoReaderBase super.read read vivo"
            c.d.a.b.h.a(r3, r0)
            r7.c(r8, r9)
            goto L125
        Ld0:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            goto Le5
        Ld6:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto Le0
            r7.b(r8, r9)
            goto L125
        Le0:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
        Le5:
            r7.append(r1)
            int r8 = android.os.Build.VERSION.SDK_INT
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            c.d.a.b.h.b(r3, r7)
            goto L125
        Lf5:
            java.lang.String r7 = android.os.Build.MODEL
            r9.f1414b = r7
            java.util.Map<java.lang.String, java.lang.String> r0 = c.d.a.a.n.f1325a
            java.lang.Object r7 = r0.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            r9.f1413a = r7
            if (r7 == 0) goto L10b
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L10f
        L10b:
            java.lang.String r7 = android.os.Build.MANUFACTURER
            r9.f1413a = r7
        L10f:
            r9.e = r6
            java.lang.String r7 = android.os.Build.VERSION.RELEASE
            r9.f = r7
            java.lang.String r7 = android.os.Build.DISPLAY
            r9.d = r7
            java.lang.String r7 = c.d.a.b.l.a(r5, r4)
            r9.f1415c = r7
            org.json.JSONObject r7 = c.d.a.b.g.b(r8)
            r9.I = r7
        L125:
            return
    }

    public boolean a() {
            r1 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "the 5G attribute:"
            r1.append(r0)
            java.lang.String r0 = c.d.a.a.a.f1323a
            r1.append(r0)
            java.lang.String r0 = ", "
            r1.append(r0)
            java.lang.String r0 = c.d.a.a.a.f1324b
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "DeviceInfoReaderBase"
            android.util.Log.d(r0, r1)
            java.lang.String r1 = c.d.a.a.a.f1323a
            java.lang.String r0 = "1"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L39
            java.lang.String r1 = c.d.a.a.a.f1324b
            java.lang.String r0 = "true"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L37
            goto L39
        L37:
            r1 = 0
            return r1
        L39:
            r1 = 1
            return r1
    }

    @Override // c.d.a.a.n.c
    public boolean a(android.content.Context r1) {
            r0 = this;
            android.telephony.ServiceState r0 = new android.telephony.ServiceState
            r0.<init>()
            boolean r0 = r0.getRoaming()
            return r0
    }

    public java.lang.String b(android.content.Context r3, int r4) {
            r2 = this;
            java.lang.String r0 = "API_TAG_getNRSwitchState"
            java.lang.String r1 = "response"
            java.lang.Object r2 = r2.a(r3, r0, r1, r4)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "ret:"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "DeviceInfoReaderBase"
            android.util.Log.d(r4, r3)
            if (r2 == 0) goto L2b
            boolean r3 = r2 instanceof java.lang.Integer
            if (r3 == 0) goto L2b
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            goto L2c
        L2b:
            r2 = -1
        L2c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "get5GSwitchState: "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r4, r3)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            return r2
    }

    void b(android.content.Context r11, com.mobiletools.systemhelper.control.b r12) {
            r10 = this;
            java.lang.String r0 = "getImeiForSlot"
            java.lang.String r1 = "phone"
            java.lang.Object r1 = r11.getSystemService(r1)
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1
            java.lang.String r2 = "000005"
            r12.J = r2
            java.lang.String r3 = r12.f1413a
            java.lang.String r4 = "Xiaomi"
            boolean r3 = r3.equals(r4)
            java.lang.String r4 = "DeviceInfoReaderBase"
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L6e
            r12.J = r2
            java.lang.String r1 = "miui.telephony.TelephonyManager"
            java.lang.Class r1 = c.d.a.b.k.a(r1)
            java.lang.Class[] r2 = new java.lang.Class[r6]
            java.lang.String r3 = "getDefault"
            java.lang.reflect.Method r2 = c.d.a.b.k.a(r1, r3, r2)
            r3 = 0
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.Object r2 = c.d.a.b.k.a(r2, r3, r7)
            java.lang.Class[] r3 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L68
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L68
            r3[r6] = r7     // Catch: java.lang.Exception -> L68
            java.lang.reflect.Method r3 = c.d.a.b.k.a(r1, r0, r3)     // Catch: java.lang.Exception -> L68
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L68
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L68
            r7[r6] = r8     // Catch: java.lang.Exception -> L68
            java.lang.Object r3 = c.d.a.b.k.a(r3, r2, r7)     // Catch: java.lang.Exception -> L68
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L68
            r12.g = r3     // Catch: java.lang.Exception -> L68
            java.lang.Class[] r3 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L68
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L68
            r3[r6] = r7     // Catch: java.lang.Exception -> L68
            java.lang.reflect.Method r0 = c.d.a.b.k.a(r1, r0, r3)     // Catch: java.lang.Exception -> L68
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L68
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L68
            r1[r6] = r3     // Catch: java.lang.Exception -> L68
            java.lang.Object r0 = c.d.a.b.k.a(r0, r2, r1)     // Catch: java.lang.Exception -> L68
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L68
            r12.s = r0     // Catch: java.lang.Exception -> L68
            goto L7a
        L68:
            java.lang.String r0 = "Exception:getImeiForSlot"
            c.d.a.b.h.b(r4, r0)
            goto L7a
        L6e:
            java.lang.String r0 = r1.getImei(r6)
            r12.g = r0
            java.lang.String r0 = r1.getImei(r5)
            r12.s = r0
        L7a:
            java.lang.String r0 = r12.g
            java.lang.String r1 = "ex00"
            if (r0 == 0) goto L86
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L88
        L86:
            r12.g = r1
        L88:
            java.lang.String r0 = r12.s
            if (r0 == 0) goto L92
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L94
        L92:
            r12.s = r1
        L94:
            java.lang.String r0 = "telephony_subscription_service"
            java.lang.Object r0 = r11.getSystemService(r0)
            android.telephony.SubscriptionManager r0 = (android.telephony.SubscriptionManager) r0
            int r2 = a(r6)
            int r3 = a(r5)
            int r7 = android.telephony.SubscriptionManager.getActiveDataSubscriptionId()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "subId0:"
            r8.append(r9)
            r8.append(r2)
            java.lang.String r9 = "，subId1:"
            r8.append(r9)
            r8.append(r3)
            java.lang.String r9 = ", activeDataSubId："
            r8.append(r9)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            c.d.a.b.h.a(r4, r8)
            if (r2 >= 0) goto Ld4
            if (r3 < 0) goto Ld1
            goto Ld4
        Ld1:
            java.lang.String r7 = "0"
            goto Lda
        Ld4:
            if (r7 != r2) goto Ldd
            java.lang.String r7 = java.lang.String.valueOf(r5)
        Lda:
            r12.E = r7
            goto Le5
        Ldd:
            if (r7 != r3) goto Le5
            r7 = 2
            java.lang.String r7 = java.lang.String.valueOf(r7)
            goto Lda
        Le5:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "20240524dataslot: "
            r7.append(r8)
            java.lang.String r8 = r12.E
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            c.d.a.b.h.a(r4, r7)
            java.lang.Class r7 = r0.getClass()     // Catch: java.lang.Exception -> L128
            java.lang.String r8 = "getDefaultDataSubscriptionId"
            java.lang.Class[] r9 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> L128
            java.lang.reflect.Method r7 = r7.getMethod(r8, r9)     // Catch: java.lang.Exception -> L128
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L128
            java.lang.Object r0 = r7.invoke(r0, r8)     // Catch: java.lang.Exception -> L128
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Exception -> L128
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> L128
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L128
            r7.<init>()     // Catch: java.lang.Exception -> L128
            java.lang.String r8 = "20240524defaultDataSubId: "
            r7.append(r8)     // Catch: java.lang.Exception -> L128
            r7.append(r0)     // Catch: java.lang.Exception -> L128
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Exception -> L128
            c.d.a.b.h.a(r4, r0)     // Catch: java.lang.Exception -> L128
            goto L12c
        L128:
            r0 = move-exception
            r0.printStackTrace()
        L12c:
            r0 = 30
            java.lang.String r4 = "1"
            if (r2 < 0) goto L13e
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r0) goto L152
            r12.q = r4
            r10.a(r11, r6, r12)
            r12.p = r4
            goto L152
        L13e:
            r12.h = r1
            r12.i = r1
            r12.j = r1
            r12.l = r1
            r12.m = r1
            r12.n = r1
            r12.o = r1
            r12.r = r1
            r12.p = r1
            r12.q = r1
        L152:
            if (r3 < 0) goto L160
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r0) goto L174
            r12.C = r4
            r10.a(r11, r5, r12)
            r12.B = r4
            goto L174
        L160:
            r12.t = r1
            r12.u = r1
            r12.v = r1
            r12.x = r1
            r12.y = r1
            r12.z = r1
            r12.A = r1
            r12.D = r1
            r12.B = r1
            r12.C = r1
        L174:
            return
    }

    protected synchronized boolean b(android.content.Context r4) {
            r3 = this;
            monitor-enter(r3)
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L30
            java.lang.String r0 = "device_provisioned"
            r1 = 0
            int r4 = android.provider.Settings.Global.getInt(r4, r0, r1)     // Catch: java.lang.Throwable -> L30
            r0 = 1
            if (r4 != r0) goto L10
            r1 = r0
        L10:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L30
            java.lang.String r0 = "DeviceInfoReaderBase"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
            r1.<init>()     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = "isBootWizardCompleted: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L30
            r1.append(r4)     // Catch: java.lang.Throwable -> L30
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L30
            c.d.a.b.h.a(r0, r1)     // Catch: java.lang.Throwable -> L30
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L30
            monitor-exit(r3)
            return r4
        L30:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    void c(android.content.Context r9, com.mobiletools.systemhelper.control.b r10) {
            r8 = this;
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r9.getSystemService(r0)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r1 = "000005"
            r10.J = r1
            r1 = 0
            java.lang.String r2 = r0.getImei(r1)
            r10.g = r2
            java.lang.String r3 = "ex00"
            if (r2 == 0) goto L1d
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L1f
        L1d:
            r10.g = r3
        L1f:
            r2 = 1
            java.lang.String r0 = r0.getImei(r2)
            r10.s = r0
            if (r0 == 0) goto L2e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L30
        L2e:
            r10.s = r3
        L30:
            java.lang.String r0 = "telephony_subscription_service"
            java.lang.Object r0 = r9.getSystemService(r0)
            android.telephony.SubscriptionManager r0 = (android.telephony.SubscriptionManager) r0
            int r0 = a(r1)
            int r4 = a(r2)
            int r5 = android.telephony.SubscriptionManager.getActiveDataSubscriptionId()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "subId0:"
            r6.append(r7)
            r6.append(r0)
            java.lang.String r7 = "，subId1:"
            r6.append(r7)
            r6.append(r4)
            java.lang.String r7 = ", activeDataSubId："
            r6.append(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "DeviceInfoReaderBase"
            c.d.a.b.h.a(r7, r6)
            if (r0 >= 0) goto L72
            if (r4 < 0) goto L6f
            goto L72
        L6f:
            java.lang.String r5 = "0"
            goto L78
        L72:
            if (r5 != r0) goto L7b
            java.lang.String r5 = java.lang.String.valueOf(r2)
        L78:
            r10.E = r5
            goto L83
        L7b:
            if (r5 != r4) goto L83
            r5 = 2
            java.lang.String r5 = java.lang.String.valueOf(r5)
            goto L78
        L83:
            r5 = 30
            if (r0 < 0) goto La1
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r5) goto Lb5
            boolean r0 = r8.a()
            if (r0 == 0) goto L97
            java.lang.String r0 = r8.c(r9, r1)
            r10.q = r0
        L97:
            r8.a(r9, r1, r10)
            java.lang.String r0 = r8.a(r9, r1)
            r10.p = r0
            goto Lb5
        La1:
            r10.h = r3
            r10.i = r3
            r10.j = r3
            r10.l = r3
            r10.m = r3
            r10.n = r3
            r10.o = r3
            r10.r = r3
            r10.p = r3
            r10.q = r3
        Lb5:
            if (r4 < 0) goto Ld1
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r5) goto Le5
            boolean r0 = r8.a()
            if (r0 == 0) goto Lc7
            java.lang.String r0 = r8.c(r9, r2)
            r10.C = r0
        Lc7:
            r8.a(r9, r2, r10)
            java.lang.String r8 = r8.a(r9, r2)
            r10.B = r8
            goto Le5
        Ld1:
            r10.t = r3
            r10.u = r3
            r10.v = r3
            r10.x = r3
            r10.y = r3
            r10.z = r3
            r10.A = r3
            r10.D = r3
            r10.B = r3
            r10.C = r3
        Le5:
            return
    }

    public boolean c(android.content.Context r5) {
            r4 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            java.lang.String r3 = "dual_nr_support"
            r0.put(r3, r2)
            java.lang.String r2 = "API_TAG_getNrCapability"
            java.util.HashMap r4 = r4.a(r5, r2, r0)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r2 = "resultMap:"
            r5.append(r2)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = "DeviceInfoReaderBase"
            android.util.Log.d(r0, r5)
            if (r4 == 0) goto L37
            java.lang.Object r4 = r4.get(r3)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r1 = r4.booleanValue()
        L37:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "isDualMode5G: "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r0, r4)
            return r1
    }
}
