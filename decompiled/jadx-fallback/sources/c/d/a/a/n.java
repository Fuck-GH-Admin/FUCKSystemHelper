package c.d.a.a;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static java.util.Map<java.lang.String, java.lang.String> f1325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static c.d.a.a.n.c f1326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static java.util.List<c.d.a.b.b> f1327c;
    private static com.mobiletools.systemhelper.control.f.a d;
    private static com.mobiletools.systemhelper.control.c.a e;

    class a implements com.mobiletools.systemhelper.control.f.a {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.mobiletools.systemhelper.control.f.a
        public void a(android.content.Context r4, com.mobiletools.systemhelper.control.b r5, java.util.List<c.d.a.b.b> r6) {
                r3 = this;
                c.d.a.a.n.a(r6)
                java.util.List r3 = c.d.a.a.n.a()
                if (r3 == 0) goto L61
                org.json.JSONArray r3 = new org.json.JSONArray
                r3.<init>()
                java.util.List r6 = c.d.a.a.n.a()
                java.util.Iterator r6 = r6.iterator()
            L16:
                boolean r0 = r6.hasNext()
                if (r0 == 0) goto L43
                java.lang.Object r0 = r6.next()
                c.d.a.b.b r0 = (c.d.a.b.b) r0
                org.json.JSONObject r1 = r0.a()
                java.lang.String r2 = "pkgName"
                java.lang.String r1 = r1.getString(r2)     // Catch: org.json.JSONException -> L3c
                java.lang.String r2 = "com.android"
                boolean r1 = r1.startsWith(r2)     // Catch: org.json.JSONException -> L3c
                if (r1 != 0) goto L16
                org.json.JSONObject r0 = r0.a()
                r3.put(r0)
                goto L16
            L3c:
                r3 = move-exception
                java.lang.RuntimeException r4 = new java.lang.RuntimeException
                r4.<init>(r3)
                throw r4
            L43:
                if (r5 == 0) goto L61
                r5.O = r3
                int r3 = r3.length()
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r0 = "appInfolength:"
                r6.append(r0)
                r6.append(r3)
                java.lang.String r3 = r6.toString()
                java.lang.String r6 = "DeviceManager"
                c.d.a.b.h.a(r6, r3)
            L61:
                boolean r3 = c.d.a.b.d.f1333c
                if (r3 == 0) goto L73
                boolean r3 = c.d.a.b.d.e
                if (r3 == 0) goto L73
                com.mobiletools.systemhelper.control.c r3 = new com.mobiletools.systemhelper.control.c
                com.mobiletools.systemhelper.control.c$a r6 = c.d.a.a.n.b()
                r3.<init>(r4, r5, r6)
                goto L78
            L73:
                com.mobiletools.systemhelper.control.g r3 = new com.mobiletools.systemhelper.control.g
                r3.<init>(r4, r5)
            L78:
                r3.start()
                return
        }
    }

    class b implements com.mobiletools.systemhelper.control.c.a {
        b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.mobiletools.systemhelper.control.c.a
        public void a(android.content.Context r1, com.mobiletools.systemhelper.control.b r2, java.lang.String r3, java.lang.String r4) {
                r0 = this;
                if (r2 == 0) goto L6
                r2.G = r3
                r2.H = r4
            L6:
                java.lang.String r0 = r2.H
                if (r0 == 0) goto L12
                java.lang.String r3 = ""
                boolean r0 = r0.equals(r3)
                if (r0 == 0) goto L16
            L12:
                java.lang.String r0 = "ex01"
                r2.H = r0
            L16:
                com.mobiletools.systemhelper.control.g r0 = new com.mobiletools.systemhelper.control.g
                r0.<init>(r1, r2)
                r0.start()
                return
        }
    }

    public interface c {
        void a(android.content.Context r1, com.mobiletools.systemhelper.control.b r2);

        boolean a(android.content.Context r1);
    }

    static {
            c.d.a.a.n$a r0 = new c.d.a.a.n$a
            r0.<init>()
            c.d.a.a.n.d = r0
            c.d.a.a.n$b r0 = new c.d.a.a.n$b
            r0.<init>()
            c.d.a.a.n.e = r0
            return
    }

    public static c.d.a.a.n.c a(android.content.Context r2) {
            c.d.a.a.a.e(r2)
            c.d.a.a.n$c r2 = c.d.a.a.n.f1326b
            if (r2 == 0) goto L8
            return r2
        L8:
            android.content.Context r2 = c.d.a.b.d.d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "model is "
            r0.append(r1)
            java.lang.String r1 = android.os.Build.MODEL
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            c.d.a.b.h.a(r2, r0)
            java.util.Map<java.lang.String, java.lang.String> r2 = c.d.a.a.n.f1325a
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.Object r2 = r2.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto Le0
            java.lang.String r0 = "Xiaomi"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L3b
            c.d.a.a.l r2 = new c.d.a.a.l
            r2.<init>()
            goto Lfd
        L3b:
            java.lang.String r0 = "OPPO"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L4a
            c.d.a.a.d r2 = new c.d.a.a.d
            r2.<init>()
            goto Lfd
        L4a:
            java.lang.String r0 = "vivo"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L59
            c.d.a.a.j r2 = new c.d.a.a.j
            r2.<init>()
            goto Lfd
        L59:
            java.lang.String r0 = "samsung"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L68
            c.d.a.a.h r2 = new c.d.a.a.h
            r2.<init>()
            goto Lfd
        L68:
            java.lang.String r0 = "realme"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L77
            c.d.a.a.g r2 = new c.d.a.a.g
            r2.<init>()
            goto Lfd
        L77:
            java.lang.String r0 = "ZTE"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L86
            c.d.a.a.m r2 = new c.d.a.a.m
            r2.<init>()
            goto Lfd
        L86:
            java.lang.String r0 = "nubia"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L94
            c.d.a.a.c r2 = new c.d.a.a.c
            r2.<init>()
            goto Lfd
        L94:
            java.lang.String r0 = "OnePlus"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto La2
            c.d.a.a.e r2 = new c.d.a.a.e
            r2.<init>()
            goto Lfd
        La2:
            java.lang.String r0 = "Liantong"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto Lb0
            c.d.a.a.b r2 = new c.d.a.a.b
            r2.<init>()
            goto Lfd
        Lb0:
            java.lang.String r0 = "TDTECH"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto Lbe
            c.d.a.a.i r2 = new c.d.a.a.i
            r2.<init>()
            goto Lfd
        Lbe:
            java.lang.String r0 = "PTAC"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto Lcc
            c.d.a.a.f r2 = new c.d.a.a.f
            r2.<init>()
            goto Lfd
        Lcc:
            java.lang.String r0 = "WIKO"
            boolean r2 = r2.equalsIgnoreCase(r0)
            if (r2 == 0) goto Lda
            c.d.a.a.k r2 = new c.d.a.a.k
            r2.<init>()
            goto Lfd
        Lda:
            c.d.a.a.a r2 = new c.d.a.a.a
            r2.<init>()
            goto Lfd
        Le0:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "getReader error!! manufacture==null! model="
            r2.append(r0)
            java.lang.String r0 = android.os.Build.MODEL
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "DeviceManager"
            c.d.a.b.h.b(r0, r2)
            c.d.a.a.a r2 = new c.d.a.a.a
            r2.<init>()
        Lfd:
            c.d.a.a.n.f1326b = r2
            c.d.a.a.n$c r2 = c.d.a.a.n.f1326b
            return r2
    }

    public static synchronized com.mobiletools.systemhelper.control.b a(android.content.Context r6, java.lang.String r7) {
            java.lang.Class<c.d.a.a.n> r0 = c.d.a.a.n.class
            monitor-enter(r0)
            java.lang.String r1 = "DeviceManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L155
            r2.<init>()     // Catch: java.lang.Throwable -> L155
            java.lang.String r3 = "enter getCurDeviceInfo--RegType:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L155
            r2.append(r7)     // Catch: java.lang.Throwable -> L155
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L155
            c.d.a.b.h.a(r1, r2)     // Catch: java.lang.Throwable -> L155
            com.mobiletools.systemhelper.control.b r1 = new com.mobiletools.systemhelper.control.b     // Catch: java.lang.Throwable -> L155
            r1.<init>()     // Catch: java.lang.Throwable -> L155
            r1.K = r7     // Catch: java.lang.Throwable -> L155
            c(r6, r1)     // Catch: java.lang.Throwable -> L155
            java.lang.String r2 = r7.trim()     // Catch: java.lang.Throwable -> L155
            java.lang.String r3 = "T"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L155
            if (r2 == 0) goto L44
            boolean r2 = a(r6, r1)     // Catch: java.lang.Throwable -> L155
            if (r2 != 0) goto L4a
            boolean r2 = b(r6, r1)     // Catch: java.lang.Throwable -> L155
            if (r2 != 0) goto L4a
            java.lang.String r6 = "DeviceManager"
            java.lang.String r7 = "SIM not changed，not post！"
            c.d.a.b.h.a(r6, r7)     // Catch: java.lang.Throwable -> L155
            monitor-exit(r0)
            return r1
        L44:
            a(r6, r1)     // Catch: java.lang.Throwable -> L155
            b(r6, r1)     // Catch: java.lang.Throwable -> L155
        L4a:
            a(r1)     // Catch: java.lang.Throwable -> L155
            java.lang.String r2 = r7.trim()     // Catch: java.lang.Throwable -> L155
            java.lang.String r3 = "A"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L155
            if (r2 == 0) goto L76
            boolean r7 = c.d.a.b.d.e     // Catch: java.lang.Throwable -> L155
            if (r7 == 0) goto L69
            com.mobiletools.systemhelper.control.f r7 = new com.mobiletools.systemhelper.control.f     // Catch: java.lang.Throwable -> L155
            com.mobiletools.systemhelper.control.f$a r2 = c.d.a.a.n.d     // Catch: java.lang.Throwable -> L155
            r7.<init>(r6, r1, r2)     // Catch: java.lang.Throwable -> L155
        L64:
            r7.start()     // Catch: java.lang.Throwable -> L155
            goto L153
        L69:
            java.lang.String r7 = "DeviceManager"
            java.lang.String r2 = "GlobalSetting.isUserPermissionOpen is false,type A-appinfo is not post"
            c.d.a.b.h.a(r7, r2)     // Catch: java.lang.Throwable -> L155
            com.mobiletools.systemhelper.control.g r7 = new com.mobiletools.systemhelper.control.g     // Catch: java.lang.Throwable -> L155
            r7.<init>(r6, r1)     // Catch: java.lang.Throwable -> L155
            goto L64
        L76:
            java.lang.String r2 = r7.trim()     // Catch: java.lang.Throwable -> L155
            java.lang.String r3 = "R"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L155
            if (r2 == 0) goto L104
            java.lang.String r7 = "DeviceManager"
            java.lang.String r2 = "regtype R"
            c.d.a.b.h.a(r7, r2)     // Catch: java.lang.Throwable -> L155
            java.lang.String r7 = c.d.a.b.m.f1342c     // Catch: java.lang.Throwable -> L155
            java.lang.Integer r2 = c.d.a.b.m.f1341b     // Catch: java.lang.Throwable -> L155
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L155
            c.d.a.b.m r7 = c.d.a.b.m.a(r6, r7, r2)     // Catch: java.lang.Throwable -> L155
            org.json.JSONArray r2 = r7.b()     // Catch: java.lang.Throwable -> L155
            java.lang.String r3 = "DeviceManager"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L155
            r4.<init>()     // Catch: java.lang.Throwable -> L155
            java.lang.String r5 = "signalJSONArray.length() : "
            r4.append(r5)     // Catch: java.lang.Throwable -> L155
            int r5 = r2.length()     // Catch: java.lang.Throwable -> L155
            r4.append(r5)     // Catch: java.lang.Throwable -> L155
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L155
            c.d.a.b.h.a(r3, r4)     // Catch: java.lang.Throwable -> L155
            if (r2 == 0) goto Lfc
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L155
            if (r3 <= 0) goto Lfc
            r1.P = r2     // Catch: java.lang.Throwable -> L155
            r7.a()     // Catch: java.lang.Throwable -> L155
            r7.close()     // Catch: java.lang.Throwable -> L155
            java.lang.String r7 = "DeviceManager"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L155
            r3.<init>()     // Catch: java.lang.Throwable -> L155
            java.lang.String r4 = "signalJSONArray>>>>>:"
            r3.append(r4)     // Catch: java.lang.Throwable -> L155
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L155
            r3.append(r2)     // Catch: java.lang.Throwable -> L155
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L155
            c.d.a.b.h.a(r7, r2)     // Catch: java.lang.Throwable -> L155
            boolean r7 = c.d.a.b.d.f1333c     // Catch: java.lang.Throwable -> L155
            if (r7 == 0) goto Lee
            boolean r7 = c.d.a.b.d.e     // Catch: java.lang.Throwable -> L155
            if (r7 == 0) goto Lee
            com.mobiletools.systemhelper.control.c r7 = new com.mobiletools.systemhelper.control.c     // Catch: java.lang.Throwable -> L155
            com.mobiletools.systemhelper.control.c$a r2 = c.d.a.a.n.e     // Catch: java.lang.Throwable -> L155
            r7.<init>(r6, r1, r2)     // Catch: java.lang.Throwable -> L155
            goto L64
        Lee:
            java.lang.String r7 = "DeviceManager"
            java.lang.String r2 = "GlobalSetting.isUserPermissionOpen is false,type R-appinfo is not post"
            c.d.a.b.h.a(r7, r2)     // Catch: java.lang.Throwable -> L155
            com.mobiletools.systemhelper.control.g r7 = new com.mobiletools.systemhelper.control.g     // Catch: java.lang.Throwable -> L155
            r7.<init>(r6, r1)     // Catch: java.lang.Throwable -> L155
            goto L64
        Lfc:
            java.lang.String r6 = "DeviceManager"
            java.lang.String r7 = "deviceinfo.siginfo 为空！ "
            c.d.a.b.h.a(r6, r7)     // Catch: java.lang.Throwable -> L155
            goto L153
        L104:
            java.lang.String r2 = r7.trim()     // Catch: java.lang.Throwable -> L155
            java.lang.String r3 = "B"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L155
            if (r2 != 0) goto L134
            java.lang.String r2 = r7.trim()     // Catch: java.lang.Throwable -> L155
            java.lang.String r3 = "F"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L155
            if (r2 != 0) goto L134
            java.lang.String r2 = r7.trim()     // Catch: java.lang.Throwable -> L155
            java.lang.String r3 = "S"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L155
            if (r2 != 0) goto L134
            java.lang.String r7 = r7.trim()     // Catch: java.lang.Throwable -> L155
            java.lang.String r2 = "T"
            boolean r7 = r7.equals(r2)     // Catch: java.lang.Throwable -> L155
            if (r7 == 0) goto L153
        L134:
            boolean r7 = c.d.a.b.d.f1333c     // Catch: java.lang.Throwable -> L155
            if (r7 == 0) goto L145
            boolean r7 = c.d.a.b.d.e     // Catch: java.lang.Throwable -> L155
            if (r7 == 0) goto L145
            com.mobiletools.systemhelper.control.c r7 = new com.mobiletools.systemhelper.control.c     // Catch: java.lang.Throwable -> L155
            com.mobiletools.systemhelper.control.c$a r2 = c.d.a.a.n.e     // Catch: java.lang.Throwable -> L155
            r7.<init>(r6, r1, r2)     // Catch: java.lang.Throwable -> L155
            goto L64
        L145:
            java.lang.String r7 = "DeviceManager"
            java.lang.String r2 = "GlobalSetting.isUserPermissionOpen is false,B/F/S/Tdeviceinfo is not post"
            c.d.a.b.h.a(r7, r2)     // Catch: java.lang.Throwable -> L155
            com.mobiletools.systemhelper.control.g r7 = new com.mobiletools.systemhelper.control.g     // Catch: java.lang.Throwable -> L155
            r7.<init>(r6, r1)     // Catch: java.lang.Throwable -> L155
            goto L64
        L153:
            monitor-exit(r0)
            return r1
        L155:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
    }

    static /* synthetic */ java.util.List a() {
            java.util.List<c.d.a.b.b> r0 = c.d.a.a.n.f1327c
            return r0
    }

    static /* synthetic */ java.util.List a(java.util.List r0) {
            c.d.a.a.n.f1327c = r0
            return r0
    }

    private static synchronized void a(com.mobiletools.systemhelper.control.b r14) {
            java.lang.Class<c.d.a.a.n> r0 = c.d.a.a.n.class
            monitor-enter(r0)
            java.lang.String r1 = r14.g     // Catch: java.lang.Throwable -> L28d
            if (r1 == 0) goto Lf2
            java.lang.String r1 = r14.s     // Catch: java.lang.Throwable -> L28d
            if (r1 == 0) goto Lf2
            java.lang.String r1 = r14.g     // Catch: java.lang.Throwable -> L28d
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L28d
            if (r1 != 0) goto Lf2
            java.lang.String r1 = r14.s     // Catch: java.lang.Throwable -> L28d
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L28d
            if (r1 != 0) goto Lf2
            java.lang.String r1 = r14.g     // Catch: java.lang.Throwable -> L28d
            java.lang.String r2 = r14.s     // Catch: java.lang.Throwable -> L28d
            int r1 = r1.compareTo(r2)     // Catch: java.lang.Throwable -> L28d
            if (r1 <= 0) goto Lf2
            com.mobiletools.systemhelper.control.b r1 = new com.mobiletools.systemhelper.control.b     // Catch: java.lang.Throwable -> L28d
            r1.<init>()     // Catch: java.lang.Throwable -> L28d
            java.lang.String r2 = r14.g     // Catch: java.lang.Throwable -> L28d
            r1.g = r2     // Catch: java.lang.Throwable -> L28d
            java.lang.String r2 = r14.h     // Catch: java.lang.Throwable -> L28d
            r1.h = r2     // Catch: java.lang.Throwable -> L28d
            java.lang.String r2 = r14.i     // Catch: java.lang.Throwable -> L28d
            r1.i = r2     // Catch: java.lang.Throwable -> L28d
            java.lang.String r2 = r14.j     // Catch: java.lang.Throwable -> L28d
            r1.j = r2     // Catch: java.lang.Throwable -> L28d
            java.lang.String r2 = r14.k     // Catch: java.lang.Throwable -> L28d
            r1.k = r2     // Catch: java.lang.Throwable -> L28d
            java.lang.String r2 = r14.l     // Catch: java.lang.Throwable -> L28d
            r1.l = r2     // Catch: java.lang.Throwable -> L28d
            java.lang.String r2 = r14.n     // Catch: java.lang.Throwable -> L28d
            r1.n = r2     // Catch: java.lang.Throwable -> L28d
            java.lang.String r2 = r14.o     // Catch: java.lang.Throwable -> L28d
            r1.o = r2     // Catch: java.lang.Throwable -> L28d
            java.lang.String r2 = r14.m     // Catch: java.lang.Throwable -> L28d
            r1.m = r2     // Catch: java.lang.Throwable -> L28d
            java.lang.String r2 = r14.p     // Catch: java.lang.Throwable -> L28d
            r1.p = r2     // Catch: java.lang.Throwable -> L28d
            java.lang.String r2 = r14.r     // Catch: java.lang.Throwable -> L28d
            r1.r = r2     // Catch: java.lang.Throwable -> L28d
            java.lang.String r2 = r14.q     // Catch: java.lang.Throwable -> L28d
            r1.q = r2     // Catch: java.lang.Throwable -> L28d
            java.lang.String r2 = r14.s     // Catch: java.lang.Throwable -> L28d
            r1.s = r2     // Catch: java.lang.Throwable -> L28d
            java.lang.String r3 = r14.t     // Catch: java.lang.Throwable -> L28d
            r1.t = r3     // Catch: java.lang.Throwable -> L28d
            java.lang.String r4 = r14.u     // Catch: java.lang.Throwable -> L28d
            r1.u = r4     // Catch: java.lang.Throwable -> L28d
            java.lang.String r5 = r14.v     // Catch: java.lang.Throwable -> L28d
            r1.v = r5     // Catch: java.lang.Throwable -> L28d
            java.lang.String r6 = r14.w     // Catch: java.lang.Throwable -> L28d
            r1.w = r6     // Catch: java.lang.Throwable -> L28d
            java.lang.String r7 = r14.x     // Catch: java.lang.Throwable -> L28d
            r1.x = r7     // Catch: java.lang.Throwable -> L28d
            java.lang.String r8 = r14.z     // Catch: java.lang.Throwable -> L28d
            r1.z = r8     // Catch: java.lang.Throwable -> L28d
            java.lang.String r9 = r14.A     // Catch: java.lang.Throwable -> L28d
            r1.A = r9     // Catch: java.lang.Throwable -> L28d
            java.lang.String r10 = r14.y     // Catch: java.lang.Throwable -> L28d
            r1.y = r10     // Catch: java.lang.Throwable -> L28d
            java.lang.String r11 = r14.B     // Catch: java.lang.Throwable -> L28d
            r1.B = r11     // Catch: java.lang.Throwable -> L28d
            java.lang.String r12 = r14.D     // Catch: java.lang.Throwable -> L28d
            r1.D = r12     // Catch: java.lang.Throwable -> L28d
            java.lang.String r13 = r14.C     // Catch: java.lang.Throwable -> L28d
            r1.C = r13     // Catch: java.lang.Throwable -> L28d
            r14.g = r2     // Catch: java.lang.Throwable -> L28d
            r14.h = r3     // Catch: java.lang.Throwable -> L28d
            r14.i = r4     // Catch: java.lang.Throwable -> L28d
            r14.j = r5     // Catch: java.lang.Throwable -> L28d
            r14.k = r6     // Catch: java.lang.Throwable -> L28d
            r14.l = r7     // Catch: java.lang.Throwable -> L28d
            r14.n = r8     // Catch: java.lang.Throwable -> L28d
            r14.o = r9     // Catch: java.lang.Throwable -> L28d
            r14.m = r10     // Catch: java.lang.Throwable -> L28d
            r14.p = r11     // Catch: java.lang.Throwable -> L28d
            r14.r = r12     // Catch: java.lang.Throwable -> L28d
            r14.q = r13     // Catch: java.lang.Throwable -> L28d
            java.lang.String r2 = r1.g     // Catch: java.lang.Throwable -> L28d
            r14.s = r2     // Catch: java.lang.Throwable -> L28d
            java.lang.String r2 = r1.h     // Catch: java.lang.Throwable -> L28d
            r14.t = r2     // Catch: java.lang.Throwable -> L28d
            java.lang.String r2 = r1.i     // Catch: java.lang.Throwable -> L28d
            r14.u = r2     // Catch: java.lang.Throwable -> L28d
            java.lang.String r2 = r1.j     // Catch: java.lang.Throwable -> L28d
            r14.v = r2     // Catch: java.lang.Throwable -> L28d
            java.lang.String r2 = r1.k     // Catch: java.lang.Throwable -> L28d
            r14.w = r2     // Catch: java.lang.Throwable -> L28d
            java.lang.String r2 = r1.l     // Catch: java.lang.Throwable -> L28d
            r14.x = r2     // Catch: java.lang.Throwable -> L28d
            java.lang.String r2 = r1.n     // Catch: java.lang.Throwable -> L28d
            r14.z = r2     // Catch: java.lang.Throwable -> L28d
            java.lang.String r2 = r1.o     // Catch: java.lang.Throwable -> L28d
            r14.A = r2     // Catch: java.lang.Throwable -> L28d
            java.lang.String r2 = r1.m     // Catch: java.lang.Throwable -> L28d
            r14.y = r2     // Catch: java.lang.Throwable -> L28d
            java.lang.String r2 = r1.p     // Catch: java.lang.Throwable -> L28d
            r14.B = r2     // Catch: java.lang.Throwable -> L28d
            java.lang.String r2 = r1.r     // Catch: java.lang.Throwable -> L28d
            r14.D = r2     // Catch: java.lang.Throwable -> L28d
            java.lang.String r1 = r1.q     // Catch: java.lang.Throwable -> L28d
            r14.C = r1     // Catch: java.lang.Throwable -> L28d
            java.lang.String r1 = r14.E     // Catch: java.lang.Throwable -> L28d
            if (r1 == 0) goto Lf2
            java.lang.String r1 = r14.E     // Catch: java.lang.Throwable -> L28d
            java.lang.String r2 = "1"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L28d
            if (r1 == 0) goto Le5
            java.lang.String r1 = "2"
        Le2:
            r14.E = r1     // Catch: java.lang.Throwable -> L28d
            goto Lf2
        Le5:
            java.lang.String r1 = r14.E     // Catch: java.lang.Throwable -> L28d
            java.lang.String r2 = "2"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L28d
            if (r1 == 0) goto Lf2
            java.lang.String r1 = "1"
            goto Le2
        Lf2:
            java.lang.String r1 = r14.i     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            r2 = 6
            r3 = 5
            r4 = 10
            r5 = 0
            r6 = 11
            if (r1 == 0) goto L1bc
            java.lang.String r1 = r14.h     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            if (r1 == 0) goto L1bc
            java.lang.String r1 = r14.i     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            java.lang.String r7 = ""
            boolean r1 = r1.equals(r7)     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            if (r1 != 0) goto L1bc
            java.lang.String r1 = r14.i     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            int r1 = r1.length()     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            if (r1 < r3) goto L1bc
            java.lang.String r1 = r14.h     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            int r1 = r1.length()     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            if (r1 < r2) goto L1bc
            java.lang.String r1 = r14.i     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            java.lang.Boolean r1 = c.d.a.b.l.b(r1)     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            if (r1 != 0) goto L1bc
            java.lang.String r1 = r14.i     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            int r1 = r1.length()     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            if (r1 < r6) goto L16a
            java.lang.String r1 = r14.h     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            int r1 = r1.length()     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            if (r1 < r6) goto L16a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            r1.<init>()     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            java.lang.String r7 = r14.h     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            java.lang.String r7 = r7.substring(r5, r4)     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            r1.append(r7)     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            java.lang.String r7 = "**********"
            r1.append(r7)     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            r14.h = r1     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            r1.<init>()     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            java.lang.String r7 = r14.i     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            java.lang.String r7 = r7.substring(r5, r4)     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            r1.append(r7)     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            java.lang.String r7 = "*****"
            r1.append(r7)     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
        L167:
            r14.i = r1     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            goto L1ac
        L16a:
            java.lang.String r1 = r14.h     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            int r1 = r1.length()     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            if (r1 < r6) goto L18c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            r1.<init>()     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            java.lang.String r7 = r14.h     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            java.lang.String r7 = r7.substring(r5, r4)     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            r1.append(r7)     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            java.lang.String r7 = "**********"
            r1.append(r7)     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            r14.h = r1     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            goto L1ac
        L18c:
            java.lang.String r1 = r14.i     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            int r1 = r1.length()     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            if (r1 < r6) goto L1ac
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            r1.<init>()     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            java.lang.String r7 = r14.i     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            java.lang.String r7 = r7.substring(r5, r4)     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            r1.append(r7)     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            java.lang.String r7 = "*****"
            r1.append(r7)     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            goto L167
        L1ac:
            java.lang.String r1 = r14.n     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            java.lang.String r1 = c.d.a.b.i.a(r1)     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            r14.n = r1     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            java.lang.String r1 = r14.m     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            java.lang.String r1 = c.d.a.b.i.a(r1)     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            r14.m = r1     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
        L1bc:
            java.lang.String r1 = r14.u     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            if (r1 == 0) goto L28b
            java.lang.String r1 = r14.t     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            if (r1 == 0) goto L28b
            java.lang.String r1 = r14.u     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            java.lang.String r7 = ""
            boolean r1 = r1.equals(r7)     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            if (r1 != 0) goto L28b
            java.lang.String r1 = r14.u     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            int r1 = r1.length()     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            if (r1 < r3) goto L28b
            java.lang.String r1 = r14.t     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            int r1 = r1.length()     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            if (r1 < r2) goto L28b
            java.lang.String r1 = r14.u     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            java.lang.Boolean r1 = c.d.a.b.l.b(r1)     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            if (r1 != 0) goto L28b
            java.lang.String r1 = r14.u     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            int r1 = r1.length()     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            if (r1 < r6) goto L22d
            java.lang.String r1 = r14.t     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            int r1 = r1.length()     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            if (r1 < r6) goto L22d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            r1.<init>()     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            java.lang.String r2 = r14.t     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            java.lang.String r2 = r2.substring(r5, r4)     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            r1.append(r2)     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            java.lang.String r2 = "**********"
            r1.append(r2)     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            r14.t = r1     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            r1.<init>()     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            java.lang.String r2 = r14.u     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            java.lang.String r2 = r2.substring(r5, r4)     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            r1.append(r2)     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            java.lang.String r2 = "*****"
            r1.append(r2)     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
        L22a:
            r14.u = r1     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            goto L26f
        L22d:
            java.lang.String r1 = r14.t     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            int r1 = r1.length()     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            if (r1 < r6) goto L24f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            r1.<init>()     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            java.lang.String r2 = r14.t     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            java.lang.String r2 = r2.substring(r5, r4)     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            r1.append(r2)     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            java.lang.String r2 = "**********"
            r1.append(r2)     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            r14.t = r1     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            goto L26f
        L24f:
            java.lang.String r1 = r14.u     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            int r1 = r1.length()     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            if (r1 < r6) goto L26f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            r1.<init>()     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            java.lang.String r2 = r14.u     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            java.lang.String r2 = r2.substring(r5, r4)     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            r1.append(r2)     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            java.lang.String r2 = "*****"
            r1.append(r2)     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            goto L22a
        L26f:
            java.lang.String r1 = r14.z     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            java.lang.String r1 = c.d.a.b.i.a(r1)     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            r14.z = r1     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            java.lang.String r1 = r14.y     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            java.lang.String r1 = c.d.a.b.i.a(r1)     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            r14.y = r1     // Catch: java.lang.Exception -> L280 java.lang.Throwable -> L28d
            goto L28b
        L280:
            r14 = move-exception
            java.lang.String r1 = "DeviceManager"
            java.lang.String r2 = "exception === sortAndAnonymousSubscriber"
            c.d.a.b.h.b(r1, r2)     // Catch: java.lang.Throwable -> L28d
            r14.printStackTrace()     // Catch: java.lang.Throwable -> L28d
        L28b:
            monitor-exit(r0)
            return
        L28d:
            r14 = move-exception
            monitor-exit(r0)
            throw r14
    }

    private static synchronized boolean a(android.content.Context r6, com.mobiletools.systemhelper.control.b r7) {
            java.lang.Class<c.d.a.a.n> r0 = c.d.a.a.n.class
            monitor-enter(r0)
            java.lang.String r1 = "iccid1"
            r2 = 0
            java.lang.String r1 = c.d.a.b.l.a(r6, r1, r2)     // Catch: java.lang.Throwable -> L7c
            r2 = 1
            if (r1 == 0) goto L44
            boolean r3 = r1.isEmpty()     // Catch: java.lang.Throwable -> L7c
            if (r3 != 0) goto L44
            java.lang.String r3 = r7.h     // Catch: java.lang.Throwable -> L7c
            boolean r3 = r1.equals(r3)     // Catch: java.lang.Throwable -> L7c
            if (r3 != 0) goto L79
            java.lang.String r3 = "DeviceManager"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c
            r4.<init>()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r5 = "SIM1 Changed,old iccid:"
            r4.append(r5)     // Catch: java.lang.Throwable -> L7c
            r4.append(r1)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r1 = ", new iccid:"
            r4.append(r1)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r1 = r7.h     // Catch: java.lang.Throwable -> L7c
            r4.append(r1)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L7c
            c.d.a.b.h.a(r3, r1)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r1 = "iccid1"
            java.lang.String r7 = r7.h     // Catch: java.lang.Throwable -> L7c
            c.d.a.b.l.b(r6, r1, r7)     // Catch: java.lang.Throwable -> L7c
            monitor-exit(r0)
            return r2
        L44:
            java.lang.String r3 = r7.h     // Catch: java.lang.Throwable -> L7c
            if (r3 == 0) goto L79
            java.lang.String r3 = r7.h     // Catch: java.lang.Throwable -> L7c
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L7c
            if (r3 != 0) goto L79
            java.lang.String r3 = "DeviceManager"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c
            r4.<init>()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r5 = "SIM1 Changed,old iccid:"
            r4.append(r5)     // Catch: java.lang.Throwable -> L7c
            r4.append(r1)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r1 = ", new iccid:"
            r4.append(r1)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r1 = r7.h     // Catch: java.lang.Throwable -> L7c
            r4.append(r1)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L7c
            c.d.a.b.h.a(r3, r1)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r1 = "iccid1"
            java.lang.String r7 = r7.h     // Catch: java.lang.Throwable -> L7c
            c.d.a.b.l.b(r6, r1, r7)     // Catch: java.lang.Throwable -> L7c
            monitor-exit(r0)
            return r2
        L79:
            r6 = 0
            monitor-exit(r0)
            return r6
        L7c:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
    }

    static /* synthetic */ com.mobiletools.systemhelper.control.c.a b() {
            com.mobiletools.systemhelper.control.c$a r0 = c.d.a.a.n.e
            return r0
    }

    public static boolean b(android.content.Context r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            c.d.a.a.n$c r1 = a(r2)
            if (r1 != 0) goto Lb
            return r0
        Lb:
            boolean r2 = r1.a(r2)
            return r2
    }

    private static synchronized boolean b(android.content.Context r6, com.mobiletools.systemhelper.control.b r7) {
            java.lang.Class<c.d.a.a.n> r0 = c.d.a.a.n.class
            monitor-enter(r0)
            java.lang.String r1 = "iccid2"
            r2 = 0
            java.lang.String r1 = c.d.a.b.l.a(r6, r1, r2)     // Catch: java.lang.Throwable -> L7c
            r2 = 1
            if (r1 == 0) goto L44
            boolean r3 = r1.isEmpty()     // Catch: java.lang.Throwable -> L7c
            if (r3 != 0) goto L44
            java.lang.String r3 = r7.t     // Catch: java.lang.Throwable -> L7c
            boolean r3 = r1.equals(r3)     // Catch: java.lang.Throwable -> L7c
            if (r3 != 0) goto L79
            java.lang.String r3 = "DeviceManager"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c
            r4.<init>()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r5 = "SIM2 Changed,old iccid:"
            r4.append(r5)     // Catch: java.lang.Throwable -> L7c
            r4.append(r1)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r1 = ", new iccid:"
            r4.append(r1)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r1 = r7.t     // Catch: java.lang.Throwable -> L7c
            r4.append(r1)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L7c
            c.d.a.b.h.a(r3, r1)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r1 = "iccid2"
            java.lang.String r7 = r7.t     // Catch: java.lang.Throwable -> L7c
            c.d.a.b.l.b(r6, r1, r7)     // Catch: java.lang.Throwable -> L7c
            monitor-exit(r0)
            return r2
        L44:
            java.lang.String r3 = r7.t     // Catch: java.lang.Throwable -> L7c
            if (r3 == 0) goto L79
            java.lang.String r3 = r7.t     // Catch: java.lang.Throwable -> L7c
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L7c
            if (r3 != 0) goto L79
            java.lang.String r3 = "DeviceManager"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c
            r4.<init>()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r5 = "SIM2 Changed,old iccid:"
            r4.append(r5)     // Catch: java.lang.Throwable -> L7c
            r4.append(r1)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r1 = ", new iccid:"
            r4.append(r1)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r1 = r7.t     // Catch: java.lang.Throwable -> L7c
            r4.append(r1)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L7c
            c.d.a.b.h.a(r3, r1)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r1 = "iccid2"
            java.lang.String r7 = r7.t     // Catch: java.lang.Throwable -> L7c
            c.d.a.b.l.b(r6, r1, r7)     // Catch: java.lang.Throwable -> L7c
            monitor-exit(r0)
            return r2
        L79:
            r6 = 0
            monitor-exit(r0)
            return r6
        L7c:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
    }

    public static java.lang.Boolean c(android.content.Context r0) {
            if (r0 != 0) goto L8
            r0 = 0
        L3:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L8:
            c()
            boolean r0 = b(r0)
            goto L3
    }

    public static void c() {
            java.util.Map<java.lang.String, java.lang.String> r0 = c.d.a.a.n.f1325a
            if (r0 != 0) goto Ldc
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            c.d.a.a.n.f1325a = r0
            java.lang.String r0 = "ro.product.manufacturer"
            java.lang.String r0 = c.d.a.b.l.a(r0)
            if (r0 == 0) goto Ldc
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto Ldc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "manufacturer="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "DeviceManager"
            c.d.a.b.h.a(r2, r1)
            java.lang.String r1 = r0.trim()
            java.lang.String r3 = "vivo"
            boolean r1 = r1.equalsIgnoreCase(r3)
            if (r1 != 0) goto Lbf
            java.lang.String r1 = r0.trim()
            java.lang.String r3 = "samsung"
            boolean r1 = r1.equalsIgnoreCase(r3)
            if (r1 != 0) goto Lbf
            java.lang.String r1 = r0.trim()
            java.lang.String r3 = "realme"
            boolean r1 = r1.equalsIgnoreCase(r3)
            if (r1 != 0) goto Lbf
            java.lang.String r1 = r0.trim()
            java.lang.String r3 = "Xiaomi"
            boolean r1 = r1.equalsIgnoreCase(r3)
            if (r1 != 0) goto Lbf
            java.lang.String r1 = r0.trim()
            java.lang.String r3 = "OPPO"
            boolean r1 = r1.equalsIgnoreCase(r3)
            if (r1 != 0) goto Lbf
            java.lang.String r1 = r0.trim()
            java.lang.String r3 = "Liantong"
            boolean r1 = r1.equalsIgnoreCase(r3)
            if (r1 != 0) goto Lbf
            java.lang.String r1 = r0.trim()
            java.lang.String r3 = "OnePlus"
            boolean r1 = r1.equalsIgnoreCase(r3)
            if (r1 != 0) goto Lbf
            java.lang.String r1 = r0.trim()
            java.lang.String r3 = "TDTECH"
            boolean r1 = r1.equalsIgnoreCase(r3)
            if (r1 != 0) goto Lbf
            java.lang.String r1 = r0.trim()
            java.lang.String r3 = "nubia"
            boolean r1 = r1.equalsIgnoreCase(r3)
            if (r1 != 0) goto Lbf
            java.lang.String r1 = r0.trim()
            java.lang.String r3 = "PTAC"
            boolean r1 = r1.equalsIgnoreCase(r3)
            if (r1 != 0) goto Lbf
            java.lang.String r1 = r0.trim()
            java.lang.String r3 = "ZTE"
            boolean r1 = r1.equalsIgnoreCase(r3)
            if (r1 != 0) goto Lbf
            java.lang.String r1 = r0.trim()
            java.lang.String r3 = "WIKO"
            boolean r1 = r1.equalsIgnoreCase(r3)
            if (r1 == 0) goto Ldc
        Lbf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "model: "
            r1.append(r3)
            java.lang.String r3 = android.os.Build.MODEL
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            c.d.a.b.h.a(r2, r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = c.d.a.a.n.f1325a
            java.lang.String r2 = android.os.Build.MODEL
            r1.put(r2, r0)
        Ldc:
            return
    }

    private static synchronized void c(android.content.Context r4, com.mobiletools.systemhelper.control.b r5) {
            java.lang.Class<c.d.a.a.n> r0 = c.d.a.a.n.class
            monitor-enter(r0)
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L15 android.content.pm.PackageManager.NameNotFoundException -> L18
            java.lang.String r2 = r4.getPackageName()     // Catch: java.lang.Throwable -> L15 android.content.pm.PackageManager.NameNotFoundException -> L18
            r3 = 0
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r3)     // Catch: java.lang.Throwable -> L15 android.content.pm.PackageManager.NameNotFoundException -> L18
            java.lang.String r1 = r1.versionName     // Catch: java.lang.Throwable -> L15 android.content.pm.PackageManager.NameNotFoundException -> L18
            r5.M = r1     // Catch: java.lang.Throwable -> L15 android.content.pm.PackageManager.NameNotFoundException -> L18
            goto L1c
        L15:
            r4 = move-exception
            goto L8b
        L18:
            r1 = move-exception
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L15
        L1c:
            c()     // Catch: java.lang.Throwable -> L15
            c.d.a.a.n$c r1 = a(r4)     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L71
            r1.a(r4, r5)     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            int r1 = b.b.c.a.a.a(r4, r1)     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L4f
            java.lang.Boolean r1 = c.d.a.b.l.k(r4)     // Catch: java.lang.Throwable -> L15
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L4c
            java.lang.Boolean r4 = c.d.a.b.l.l(r4)     // Catch: java.lang.Throwable -> L15
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L15
            if (r4 != 0) goto L49
            java.lang.String r4 = "Mobile"
        L46:
            r5.F = r4     // Catch: java.lang.Throwable -> L15
            goto L4f
        L49:
            java.lang.String r4 = "WiFi"
            goto L46
        L4c:
            java.lang.String r4 = "Disconnected"
            goto L46
        L4f:
            java.lang.String r4 = c.d.a.b.l.a()     // Catch: java.lang.Throwable -> L15
            r5.N = r4     // Catch: java.lang.Throwable -> L15
            java.lang.String r4 = "DeviceManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15
            r1.<init>()     // Catch: java.lang.Throwable -> L15
            java.lang.String r2 = "getDeviceInfo:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L15
            java.lang.String r5 = r5.a()     // Catch: java.lang.Throwable -> L15
            r1.append(r5)     // Catch: java.lang.Throwable -> L15
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L15
            c.d.a.b.h.a(r4, r5)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)
            return
        L71:
            java.lang.String r4 = "DeviceManager"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15
            r5.<init>()     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = "manuf==null,model="
            r5.append(r1)     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> L15
            r5.append(r1)     // Catch: java.lang.Throwable -> L15
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L15
            c.d.a.b.h.b(r4, r5)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)
            return
        L8b:
            monitor-exit(r0)
            throw r4
    }
}
