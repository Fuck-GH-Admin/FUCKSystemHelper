package com.mobiletools.systemhelper.control;

/* JADX INFO: loaded from: classes.dex */
public class GetSignalInfoReceiver extends android.content.BroadcastReceiver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static android.content.Context f1400c;
    private static com.baidu.location.b d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    c.d.a.b.n f1401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.baidu.location.h f1402b;

    class a extends com.baidu.location.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.content.Context f1403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.mobiletools.systemhelper.control.GetSignalInfoReceiver f1404b;

        a(com.mobiletools.systemhelper.control.GetSignalInfoReceiver r1, android.content.Context r2) {
                r0 = this;
                r0.f1404b = r1
                r0.f1403a = r2
                r0.<init>()
                return
        }

        @Override // com.baidu.location.b
        public void a(com.baidu.location.c r9) {
                r8 = this;
                java.lang.String r0 = "GetSignalInfoReceiver"
                if (r9 == 0) goto L1c6
                int r1 = r9.r()
                r2 = 167(0xa7, float:2.34E-43)
                if (r1 == r2) goto L1c6
                int r1 = r9.r()
                r2 = 67
                if (r1 == r2) goto L1c6
                int r1 = r9.r()
                r2 = 62
                if (r1 == r2) goto L1c6
                java.lang.String r1 = "定位成功！"
                c.d.a.b.h.a(r0, r1)
                com.mobiletools.systemhelper.control.GetSignalInfoReceiver r1 = r8.f1404b
                c.d.a.b.n r1 = r1.f1401a
                double r2 = r9.t()
                java.lang.String r2 = java.lang.String.valueOf(r2)
                r1.B = r2
                com.mobiletools.systemhelper.control.GetSignalInfoReceiver r1 = r8.f1404b
                c.d.a.b.n r1 = r1.f1401a
                double r2 = r9.q()
                java.lang.String r2 = java.lang.String.valueOf(r2)
                r1.C = r2
                com.mobiletools.systemhelper.control.GetSignalInfoReceiver r1 = r8.f1404b
                c.d.a.b.n r1 = r1.f1401a
                double r2 = r9.d()
                java.lang.String r9 = java.lang.String.valueOf(r2)
                r1.D = r9
                r9 = 0
                int r1 = c.d.a.a.a.a(r9)
                java.lang.String r2 = "inSigChinaNetwork"
                java.lang.String r3 = "siginfo: "
                java.lang.String r4 = "signalInfo.longitude: "
                java.lang.String r5 = ""
                if (r1 <= 0) goto Lf2
                com.mobiletools.systemhelper.control.GetSignalInfoReceiver r6 = r8.f1404b
                c.d.a.b.n r6 = r6.f1401a
                java.lang.String r6 = r6.B
                if (r6 == 0) goto Lf2
                if (r6 == r5) goto Lf2
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r4)
                com.mobiletools.systemhelper.control.GetSignalInfoReceiver r7 = r8.f1404b
                c.d.a.b.n r7 = r7.f1401a
                java.lang.String r7 = r7.B
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                c.d.a.b.h.a(r0, r6)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "Receiver subIdSlot1: "
                r6.append(r7)
                r6.append(r1)
                java.lang.String r1 = r6.toString()
                c.d.a.b.h.a(r0, r1)
                com.mobiletools.systemhelper.control.d r1 = new com.mobiletools.systemhelper.control.d
                r1.<init>()
                android.content.Context r6 = r8.f1403a
                com.mobiletools.systemhelper.control.GetSignalInfoReceiver r7 = r8.f1404b
                c.d.a.b.n r7 = r7.f1401a
                r1.b(r6, r9, r7)
                com.mobiletools.systemhelper.control.GetSignalInfoReceiver r9 = r8.f1404b
                c.d.a.b.n r9 = r9.f1401a
                org.json.JSONObject r9 = r9.a()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                r1.append(r9)
                java.lang.String r1 = r1.toString()
                c.d.a.b.h.a(r0, r1)
                if (r9 == 0) goto Lf2
                com.mobiletools.systemhelper.control.GetSignalInfoReceiver r1 = r8.f1404b     // Catch: java.lang.Exception -> Leb
                c.d.a.b.n r1 = r1.f1401a     // Catch: java.lang.Exception -> Leb
                java.lang.String r1 = r1.f     // Catch: java.lang.Exception -> Leb
                if (r1 == 0) goto Lf2
                com.mobiletools.systemhelper.control.GetSignalInfoReceiver r1 = r8.f1404b     // Catch: java.lang.Exception -> Leb
                c.d.a.b.n r1 = r1.f1401a     // Catch: java.lang.Exception -> Leb
                java.lang.Boolean r1 = com.mobiletools.systemhelper.control.GetSignalInfoReceiver.a(r1)     // Catch: java.lang.Exception -> Leb
                boolean r1 = r1.booleanValue()     // Catch: java.lang.Exception -> Leb
                if (r1 == 0) goto Lf2
                android.content.Context r1 = com.mobiletools.systemhelper.control.GetSignalInfoReceiver.a()     // Catch: java.lang.Exception -> Leb
                java.lang.String r6 = c.d.a.b.m.f1342c     // Catch: java.lang.Exception -> Leb
                java.lang.Integer r7 = c.d.a.b.m.f1341b     // Catch: java.lang.Exception -> Leb
                int r7 = r7.intValue()     // Catch: java.lang.Exception -> Leb
                c.d.a.b.m r1 = c.d.a.b.m.a(r1, r6, r7)     // Catch: java.lang.Exception -> Leb
                java.lang.String r9 = r9.toString()     // Catch: java.lang.Exception -> Leb
                r1.a(r9)     // Catch: java.lang.Exception -> Leb
                r1.close()     // Catch: java.lang.Exception -> Leb
                goto Lf2
            Leb:
                r9 = move-exception
                c.d.a.b.h.b(r0, r2)
                r9.printStackTrace()
            Lf2:
                r9 = 1
                int r1 = c.d.a.a.a.a(r9)
                if (r1 <= 0) goto L191
                com.mobiletools.systemhelper.control.GetSignalInfoReceiver r6 = r8.f1404b
                c.d.a.b.n r6 = r6.f1401a
                java.lang.String r6 = r6.B
                if (r6 == 0) goto L191
                if (r6 == r5) goto L191
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r4)
                com.mobiletools.systemhelper.control.GetSignalInfoReceiver r4 = r8.f1404b
                c.d.a.b.n r4 = r4.f1401a
                java.lang.String r4 = r4.B
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                c.d.a.b.h.a(r0, r4)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Receiver subIdSlot2: "
                r4.append(r5)
                r4.append(r1)
                java.lang.String r1 = r4.toString()
                c.d.a.b.h.a(r0, r1)
                com.mobiletools.systemhelper.control.d r1 = new com.mobiletools.systemhelper.control.d
                r1.<init>()
                android.content.Context r4 = r8.f1403a
                com.mobiletools.systemhelper.control.GetSignalInfoReceiver r5 = r8.f1404b
                c.d.a.b.n r5 = r5.f1401a
                r1.b(r4, r9, r5)
                com.mobiletools.systemhelper.control.GetSignalInfoReceiver r9 = r8.f1404b
                c.d.a.b.n r9 = r9.f1401a
                org.json.JSONObject r9 = r9.a()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                r1.append(r9)
                java.lang.String r1 = r1.toString()
                c.d.a.b.h.a(r0, r1)
                if (r9 == 0) goto L191
                com.mobiletools.systemhelper.control.GetSignalInfoReceiver r1 = r8.f1404b     // Catch: java.lang.Exception -> L18a
                c.d.a.b.n r1 = r1.f1401a     // Catch: java.lang.Exception -> L18a
                java.lang.String r1 = r1.f     // Catch: java.lang.Exception -> L18a
                if (r1 == 0) goto L191
                com.mobiletools.systemhelper.control.GetSignalInfoReceiver r1 = r8.f1404b     // Catch: java.lang.Exception -> L18a
                c.d.a.b.n r1 = r1.f1401a     // Catch: java.lang.Exception -> L18a
                java.lang.Boolean r1 = com.mobiletools.systemhelper.control.GetSignalInfoReceiver.a(r1)     // Catch: java.lang.Exception -> L18a
                boolean r1 = r1.booleanValue()     // Catch: java.lang.Exception -> L18a
                if (r1 == 0) goto L191
                android.content.Context r1 = com.mobiletools.systemhelper.control.GetSignalInfoReceiver.a()     // Catch: java.lang.Exception -> L18a
                java.lang.String r3 = c.d.a.b.m.f1342c     // Catch: java.lang.Exception -> L18a
                java.lang.Integer r4 = c.d.a.b.m.f1341b     // Catch: java.lang.Exception -> L18a
                int r4 = r4.intValue()     // Catch: java.lang.Exception -> L18a
                c.d.a.b.m r1 = c.d.a.b.m.a(r1, r3, r4)     // Catch: java.lang.Exception -> L18a
                java.lang.String r9 = r9.toString()     // Catch: java.lang.Exception -> L18a
                r1.a(r9)     // Catch: java.lang.Exception -> L18a
                r1.close()     // Catch: java.lang.Exception -> L18a
                goto L191
            L18a:
                r9 = move-exception
                c.d.a.b.h.b(r0, r2)
                r9.printStackTrace()
            L191:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r1 = "经纬度信息signalInfo.longitude： "
                r9.append(r1)
                com.mobiletools.systemhelper.control.GetSignalInfoReceiver r1 = r8.f1404b
                c.d.a.b.n r1 = r1.f1401a
                java.lang.String r1 = r1.B
                r9.append(r1)
                java.lang.String r1 = ", "
                r9.append(r1)
                com.mobiletools.systemhelper.control.GetSignalInfoReceiver r2 = r8.f1404b
                c.d.a.b.n r2 = r2.f1401a
                java.lang.String r2 = r2.C
                r9.append(r2)
                r9.append(r1)
                com.mobiletools.systemhelper.control.GetSignalInfoReceiver r8 = r8.f1404b
                c.d.a.b.n r8 = r8.f1401a
                java.lang.String r8 = r8.D
                r9.append(r8)
                java.lang.String r8 = r9.toString()
                c.d.a.b.h.a(r0, r8)
                goto L1cb
            L1c6:
                java.lang.String r8 = "定位失败！"
                c.d.a.b.h.b(r0, r8)
            L1cb:
                return
        }
    }

    static {
            return
    }

    public GetSignalInfoReceiver() {
            r1 = this;
            r1.<init>()
            c.d.a.b.n r0 = new c.d.a.b.n
            r0.<init>()
            r1.f1401a = r0
            return
    }

    static /* synthetic */ android.content.Context a() {
            android.content.Context r0 = com.mobiletools.systemhelper.control.GetSignalInfoReceiver.f1400c
            return r0
    }

    public static java.lang.Boolean a(c.d.a.b.n r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "siginfo.mncCH: "
            r0.append(r1)
            java.lang.String r1 = r2.f
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "GetSignalInfoReceiver"
            c.d.a.b.h.a(r1, r0)
            java.lang.String r0 = r2.f
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            if (r0 == 0) goto L37
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L37
            java.lang.String r2 = r2.f
            java.lang.String r0 = "460"
            boolean r2 = r2.startsWith(r0)
            if (r2 == 0) goto L37
            r2 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L37:
            return r1
    }

    private boolean a(android.content.Context r5) {
            r4 = this;
            android.content.ContentResolver r4 = r5.getContentResolver()
            r0 = 0
            java.lang.String r1 = "device_provisioned"
            int r4 = android.provider.Settings.Global.getInt(r4, r1, r0)
            r1 = 1
            if (r4 != r1) goto L10
            r4 = r1
            goto L11
        L10:
            r4 = r0
        L11:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "isBootWizardCompleted: "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "GetSignalInfoReceiver"
            c.d.a.b.h.a(r3, r2)
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L52
            android.content.ContentResolver r4 = r5.getContentResolver()
            java.lang.String r5 = "operator_service_improve_plan"
            int r4 = android.provider.Settings.Secure.getInt(r4, r5, r0)
            if (r4 != r1) goto L3e
            r0 = r1
        L3e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "checkUserPermission:"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            c.d.a.b.h.a(r3, r4)
        L52:
            return r0
    }

    private boolean b(android.content.Context r2) {
            r1 = this;
            android.content.ContentResolver r1 = r2.getContentResolver()
            r2 = 0
            java.lang.String r0 = "device_provisioned"
            int r1 = android.provider.Settings.Global.getInt(r1, r0, r2)
            r0 = 1
            if (r1 != r0) goto Lf
            r2 = r0
        Lf:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "isBootWizardCompleted: "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "GetSignalInfoReceiver"
            c.d.a.b.h.a(r0, r2)
            boolean r1 = r1.booleanValue()
            return r1
    }

    public void a(com.baidu.location.b r3) {
            r2 = this;
            r0 = 1
            com.baidu.location.h.b(r0)
            com.baidu.location.h r1 = r2.f1402b
            if (r1 == 0) goto L35
            r1.a(r3)
            com.baidu.location.i r3 = new com.baidu.location.i
            r3.<init>()
            java.lang.String r1 = "bd09ll"
            r3.a(r1)
            com.baidu.location.i$b r1 = com.baidu.location.i.b.f1375b
            r3.a(r1)
            r3.c(r0)
            r1 = 0
            r3.a(r1)
            r3.a(r0)
            com.baidu.location.h r0 = r2.f1402b
            r0.a(r3)
            com.baidu.location.h r2 = r2.f1402b
            r2.j()
            java.lang.String r2 = "GetSignalInfoReceiver"
            java.lang.String r3 = "mLocationClient start!"
            c.d.a.b.h.a(r2, r3)
        L35:
            return
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context r4, android.content.Intent r5) {
            r3 = this;
            com.mobiletools.systemhelper.control.GetSignalInfoReceiver.f1400c = r4
            java.lang.String r5 = "ro.product.manufacturer"
            java.lang.String r5 = c.d.a.b.l.a(r5)
            r0 = 1
            com.baidu.location.h.b(r0)
            c.d.a.a.a.e(r4)
            java.lang.String r0 = "GetSignalInfoReceiver"
            java.lang.String r1 = "enter GetSignalInfoReceiver --->"
            c.d.a.b.h.a(r0, r1)
            com.baidu.location.h r0 = new com.baidu.location.h     // Catch: java.lang.Exception -> L5d
            android.content.Context r1 = com.mobiletools.systemhelper.control.GetSignalInfoReceiver.f1400c     // Catch: java.lang.Exception -> L5d
            r0.<init>(r1)     // Catch: java.lang.Exception -> L5d
            r3.f1402b = r0     // Catch: java.lang.Exception -> L5d
            android.content.Context r0 = com.mobiletools.systemhelper.control.GetSignalInfoReceiver.f1400c
            long r1 = c.d.a.b.l.j(r4)
            c.d.a.b.a.b(r0, r1)
            if (r5 == 0) goto L47
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L47
            java.lang.String r0 = "vivo"
            boolean r5 = r5.equalsIgnoreCase(r0)
            if (r5 == 0) goto L3f
            android.content.Context r5 = com.mobiletools.systemhelper.control.GetSignalInfoReceiver.f1400c
            boolean r5 = r3.a(r5)
            goto L45
        L3f:
            android.content.Context r5 = com.mobiletools.systemhelper.control.GetSignalInfoReceiver.f1400c
            boolean r5 = r3.b(r5)
        L45:
            c.d.a.b.d.e = r5
        L47:
            boolean r5 = c.d.a.b.d.e
            if (r5 != 0) goto L4c
            return
        L4c:
            com.mobiletools.systemhelper.control.GetSignalInfoReceiver$a r5 = new com.mobiletools.systemhelper.control.GetSignalInfoReceiver$a
            r5.<init>(r3, r4)
            com.mobiletools.systemhelper.control.GetSignalInfoReceiver.d = r5
            r3.a(r5)
            c.d.a.a.n.c()
            c.d.a.a.n.a(r4)
            return
        L5d:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>(r3)
            throw r4
    }
}
