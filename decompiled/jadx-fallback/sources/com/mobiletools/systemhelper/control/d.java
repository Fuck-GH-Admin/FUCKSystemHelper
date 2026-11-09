package com.mobiletools.systemhelper.control;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.content.Context f1418a;

    public d() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f1418a = r0
            return
    }

    void a(android.content.Context r10, int r11, c.d.a.b.n r12) {
            r9 = this;
            r0 = 0
            android.content.pm.PackageManager r1 = r10.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L12
            java.lang.String r2 = r10.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L12
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L12
            java.lang.String r1 = r1.versionName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L12
            r12.d = r1     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L12
            goto L16
        L12:
            r1 = move-exception
            r1.printStackTrace()
        L16:
            com.mobiletools.systemhelper.control.a r1 = new com.mobiletools.systemhelper.control.a
            r1.<init>(r10, r11)
            java.lang.String r1 = com.mobiletools.systemhelper.control.a.f1410b
            r12.y = r1
            java.lang.String r1 = com.mobiletools.systemhelper.control.a.f1411c
            r12.z = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "signalInfo.callDisconnectCause: "
            r1.append(r2)
            java.lang.String r2 = r12.y
            r1.append(r2)
            java.lang.String r2 = ", "
            r1.append(r2)
            java.lang.String r2 = r12.z
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "GetSignalStrengthInfo"
            c.d.a.b.h.a(r2, r1)
            int r1 = c.d.a.a.a.a(r11)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "getSignal====> slot: "
            r3.append(r4)
            r3.append(r11)
            java.lang.String r4 = " subId: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            c.d.a.b.h.a(r2, r3)
            java.lang.String r3 = "phone"
            java.lang.Object r3 = r10.getSystemService(r3)
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3
            android.telephony.TelephonyManager r1 = r3.createForSubscriptionId(r1)
            java.lang.String r3 = "ro.product.manufacturer"
            java.lang.String r3 = c.d.a.b.l.a(r3)
            if (r3 == 0) goto L8f
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L8f
            java.lang.String r4 = "vivo"
            boolean r4 = r3.equalsIgnoreCase(r4)
            if (r4 == 0) goto L8f
            android.content.Context r9 = r9.f1418a
            boolean r9 = c.d.a.b.l.a(r9)
            c.d.a.b.d.e = r9
        L8f:
            boolean r9 = c.d.a.b.d.e
            if (r9 != 0) goto L94
            return
        L94:
            java.lang.String r9 = r1.getSimSerialNumber()
            r12.f1345c = r9
            java.lang.String r4 = "ex01"
            if (r9 == 0) goto La4
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto La6
        La4:
            r12.f1345c = r4
        La6:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r5 = "ICCID:"
            r9.append(r5)
            java.lang.String r5 = r12.f1345c
            r9.append(r5)
            java.lang.String r9 = r9.toString()
            c.d.a.b.h.a(r2, r9)
            java.lang.String r9 = r1.getSubscriberId()
            r12.g = r9
            if (r9 == 0) goto Lca
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto Lcc
        Lca:
            r12.g = r4
        Lcc:
            java.lang.String r9 = r1.getSimOperator()
            r12.e = r9
            java.lang.String r9 = r1.getNetworkOperator()
            r12.f = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r5 = "mncch :  "
            r9.append(r5)
            java.lang.String r5 = r12.f
            r9.append(r5)
            java.lang.String r9 = r9.toString()
            c.d.a.b.h.a(r2, r9)
            java.lang.String r9 = r12.e
            if (r9 == 0) goto Lf8
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto Lfa
        Lf8:
            r12.e = r4
        Lfa:
            java.lang.String r9 = r12.f
            if (r9 == 0) goto L104
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L11c
        L104:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r5 = "mncch==> null "
            r9.append(r5)
            java.lang.String r5 = r12.f
            r9.append(r5)
            java.lang.String r9 = r9.toString()
            c.d.a.b.h.a(r2, r9)
            r12.f = r4
        L11c:
            java.lang.String r9 = r12.g
            java.lang.String r4 = ""
            if (r9 == 0) goto L1bf
            java.lang.String r5 = r12.f1345c
            if (r5 == 0) goto L1bf
            boolean r9 = r9.equals(r4)
            if (r9 != 0) goto L1bf
            java.lang.String r9 = r12.g
            int r9 = r9.length()
            r5 = 5
            if (r9 < r5) goto L1bf
            java.lang.String r9 = r12.f1345c
            int r9 = r9.length()
            r5 = 6
            if (r9 < r5) goto L1bf
            java.lang.String r9 = r12.g
            java.lang.Boolean r9 = c.d.a.b.l.b(r9)
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L1bf
            java.lang.String r9 = r12.g
            int r9 = r9.length()
            java.lang.String r5 = "**********"
            java.lang.String r6 = "*****"
            r7 = 10
            r8 = 11
            if (r9 < r8) goto L191
            java.lang.String r9 = r12.f1345c
            int r9 = r9.length()
            if (r9 < r8) goto L191
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r8 = r12.g
            java.lang.String r8 = r8.substring(r0, r7)
            r9.append(r8)
            r9.append(r6)
            java.lang.String r9 = r9.toString()
            r12.g = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
        L17e:
            java.lang.String r6 = r12.f1345c
            java.lang.String r6 = r6.substring(r0, r7)
            r9.append(r6)
            r9.append(r5)
            java.lang.String r9 = r9.toString()
            r12.f1345c = r9
            goto L1bf
        L191:
            java.lang.String r9 = r12.g
            int r9 = r9.length()
            if (r9 < r8) goto L1b1
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r5 = r12.g
            java.lang.String r5 = r5.substring(r0, r7)
            r9.append(r5)
            r9.append(r6)
            java.lang.String r9 = r9.toString()
            r12.g = r9
            goto L1bf
        L1b1:
            java.lang.String r9 = r12.f1345c
            int r9 = r9.length()
            if (r9 < r8) goto L1bf
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            goto L17e
        L1bf:
            boolean r9 = c.d.a.b.d.e
            if (r9 == 0) goto L410
            r9 = 1
            if (r3 == 0) goto L23e
            boolean r5 = r3.isEmpty()
            if (r5 != 0) goto L23e
            java.lang.String r5 = "Xiaomi"
            boolean r3 = r3.equalsIgnoreCase(r5)
            if (r3 == 0) goto L222
            java.lang.String r3 = "miui.telephony.TelephonyManager"
            java.lang.Class r3 = c.d.a.b.k.a(r3)
            java.lang.Class[] r5 = new java.lang.Class[r0]
            java.lang.String r6 = "getDefault"
            java.lang.reflect.Method r5 = c.d.a.b.k.a(r3, r6, r5)
            r6 = 0
            java.lang.Object[] r7 = new java.lang.Object[r0]
            java.lang.Object r5 = c.d.a.b.k.a(r5, r6, r7)
            java.lang.String r6 = "getImeiForSlot"
            java.lang.Class[] r7 = new java.lang.Class[r9]     // Catch: java.lang.Exception -> L21c
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L21c
            r7[r0] = r8     // Catch: java.lang.Exception -> L21c
            java.lang.reflect.Method r3 = c.d.a.b.k.a(r3, r6, r7)     // Catch: java.lang.Exception -> L21c
            java.lang.Object[] r6 = new java.lang.Object[r9]     // Catch: java.lang.Exception -> L21c
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Exception -> L21c
            r6[r0] = r7     // Catch: java.lang.Exception -> L21c
            java.lang.Object r0 = c.d.a.b.k.a(r3, r5, r6)     // Catch: java.lang.Exception -> L21c
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L21c
            r12.f1344b = r0     // Catch: java.lang.Exception -> L21c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L21c
            r0.<init>()     // Catch: java.lang.Exception -> L21c
            java.lang.String r3 = "siginfo.IMEI: "
            r0.append(r3)     // Catch: java.lang.Exception -> L21c
            java.lang.String r3 = r12.f1344b     // Catch: java.lang.Exception -> L21c
            r0.append(r3)     // Catch: java.lang.Exception -> L21c
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L21c
            c.d.a.b.h.a(r2, r0)     // Catch: java.lang.Exception -> L21c
            goto L228
        L21c:
            java.lang.String r0 = "Exception:getImeiForSlot"
            c.d.a.b.h.b(r2, r0)
            goto L228
        L222:
            java.lang.String r0 = r1.getImei()
            r12.f1344b = r0
        L228:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "getImei====> imei: "
            r0.append(r3)
            java.lang.String r3 = r12.f1344b
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            c.d.a.b.h.a(r2, r0)
        L23e:
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            int r0 = b.b.c.a.a.a(r10, r0)
            if (r0 != 0) goto L40f
            java.lang.String r0 = "android.permission.READ_PHONE_STATE"
            int r0 = b.b.c.a.a.a(r10, r0)
            if (r0 == 0) goto L250
            goto L40f
        L250:
            android.telephony.ServiceState r0 = r1.getServiceState()
            if (r0 == 0) goto L40f
            java.util.List r0 = r0.getNetworkRegistrationInfoList()
            java.util.Iterator r0 = r0.iterator()
        L25e:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L319
            java.lang.Object r3 = r0.next()
            android.telephony.NetworkRegistrationInfo r3 = (android.telephony.NetworkRegistrationInfo) r3
            int r5 = r3.getDomain()
            r6 = 2
            if (r5 != r6) goto L25e
            int r5 = r3.getTransportType()
            if (r5 != r9) goto L25e
            java.lang.String r5 = r3.toString()
            android.telephony.CellIdentity r3 = r3.getCellIdentity()
            if (r3 != 0) goto L282
            return
        L282:
            boolean r6 = r3 instanceof android.telephony.CellIdentityLte
            java.lang.String r7 = "]"
            java.lang.String r8 = "["
            if (r6 == 0) goto L2d5
            android.telephony.CellIdentityLte r3 = (android.telephony.CellIdentityLte) r3
            int r9 = r3.getCi()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r12.i = r9
            int r9 = r3.getTac()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r12.h = r9
            int r9 = r3.getPci()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r12.j = r9
            int[] r9 = r3.getBands()
            java.lang.String r9 = java.util.Arrays.toString(r9)
            java.lang.String r9 = r9.replace(r8, r4)
            java.lang.String r9 = r9.replace(r7, r4)
            r12.m = r9
            int r9 = r3.getBandwidth()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r12.n = r9
            java.lang.String r9 = "LTE"
            r12.k = r9
            java.lang.String r9 = "isEnDcAvailable = true"
            boolean r9 = r5.contains(r9)
            if (r9 == 0) goto L319
            java.lang.String r9 = "NSA"
            goto L317
        L2d5:
            boolean r5 = r3 instanceof android.telephony.CellIdentityNr
            if (r5 == 0) goto L25e
            android.telephony.CellIdentityNr r3 = (android.telephony.CellIdentityNr) r3
            long r5 = r3.getNci()
            java.lang.String r9 = java.lang.String.valueOf(r5)
            r12.i = r9
            int r9 = r3.getTac()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r12.h = r9
            int r9 = r3.getPci()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r12.j = r9
            int[] r9 = r3.getBands()
            java.lang.String r9 = java.util.Arrays.toString(r9)
            java.lang.String r9 = r9.replace(r8, r4)
            java.lang.String r9 = r9.replace(r7, r4)
            r12.m = r9
            int r9 = r3.getNrarfcn()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r12.l = r9
            java.lang.String r9 = "SA"
        L317:
            r12.k = r9
        L319:
            java.lang.String r9 = "android.permission.ACCESS_NETWORK_STATE"
            int r9 = b.b.c.a.a.a(r10, r9)
            if (r9 != 0) goto L33f
            java.lang.Boolean r9 = c.d.a.b.l.k(r10)
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L33b
            java.lang.Boolean r9 = c.d.a.b.l.l(r10)
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L338
            java.lang.String r9 = "Mobile"
            goto L33d
        L338:
            java.lang.String r9 = "WiFi"
            goto L33d
        L33b:
            java.lang.String r9 = "Disconnected"
        L33d:
            r12.F = r9
        L33f:
            android.telephony.SignalStrength r9 = r1.getSignalStrength()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "slot: "
            r10.append(r0)
            r10.append(r11)
            java.lang.String r11 = "signalStrength"
            r10.append(r11)
            r10.append(r9)
            java.lang.String r10 = r10.toString()
            c.d.a.b.h.a(r2, r10)
            java.util.List r9 = r9.getCellSignalStrengths()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "cellSignalStrengthList ===> "
            r10.append(r11)
            r10.append(r9)
            java.lang.String r10 = r10.toString()
            c.d.a.b.h.a(r2, r10)
            if (r9 == 0) goto L40f
            java.util.Iterator r9 = r9.iterator()
        L37d:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L40f
            java.lang.Object r10 = r9.next()
            android.telephony.CellSignalStrength r10 = (android.telephony.CellSignalStrength) r10
            boolean r11 = r10 instanceof android.telephony.CellSignalStrengthNr
            if (r11 == 0) goto L3d8
            android.telephony.CellSignalStrengthNr r10 = (android.telephony.CellSignalStrengthNr) r10
            int r9 = r10.getSsRsrp()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r12.q = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "rsrp : "
            r9.append(r11)
            java.lang.String r11 = r12.q
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            c.d.a.b.h.a(r2, r9)
            int r9 = r10.getSsRsrq()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r12.s = r9
            int r9 = r10.getSsSinr()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r12.r = r9
            int r9 = r10.getCsiCqiTableIndex()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r12.o = r9
            java.util.List r9 = r10.getCsiCqiReport()
            java.lang.String r9 = java.lang.String.valueOf(r9)
        L3d5:
            r12.p = r9
            goto L40f
        L3d8:
            boolean r11 = r10 instanceof android.telephony.CellSignalStrengthLte
            if (r11 == 0) goto L37d
            android.telephony.CellSignalStrengthLte r10 = (android.telephony.CellSignalStrengthLte) r10
            int r9 = r10.getRsrp()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r12.q = r9
            int r9 = r10.getRsrq()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r12.s = r9
            int r9 = r10.getRssnr()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r12.r = r9
            int r9 = r10.getCqiTableIndex()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r12.o = r9
            int r9 = r10.getCqi()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            goto L3d5
        L40f:
            return
        L410:
            java.lang.String r9 = "Insufficient permission!!"
            c.d.a.b.h.b(r2, r9)
            return
    }

    public void b(android.content.Context r3, int r4, c.d.a.b.n r5) {
            r2 = this;
            r2.f1418a = r3
            java.lang.String r0 = "GetSignalStrengthInfo"
            java.lang.String r1 = "GetSignalStrengthInfo====>"
            c.d.a.b.h.a(r0, r1)
            int r0 = c.d.a.a.a.a(r4)
            if (r0 <= 0) goto L12
            r2.a(r3, r4, r5)
        L12:
            return
    }
}
