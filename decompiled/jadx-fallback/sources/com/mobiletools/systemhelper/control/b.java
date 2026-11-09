package com.mobiletools.systemhelper.control;

/* JADX INFO: loaded from: classes.dex */
public class b {
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String C;
    public java.lang.String D;
    public java.lang.String E;
    public java.lang.String F;
    public java.lang.String G;
    public java.lang.String H;
    public org.json.JSONObject I;
    public java.lang.String J;
    public java.lang.String K;
    public java.lang.String L;
    public java.lang.String M;
    public java.lang.String N;
    public org.json.JSONArray O;
    public org.json.JSONArray P;
    private java.lang.String Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.String f1413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.String f1414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.String f1415c;
    public java.lang.String d;
    public java.lang.String e;
    public java.lang.String f;
    public java.lang.String g;
    public java.lang.String h;
    public java.lang.String i;
    public java.lang.String j;
    public java.lang.String k;
    public java.lang.String l;
    public java.lang.String m;
    public java.lang.String n;
    public java.lang.String o;
    public java.lang.String p;
    public java.lang.String q;
    public java.lang.String r;
    public java.lang.String s;
    public java.lang.String t;
    public java.lang.String u;
    public java.lang.String v;
    public java.lang.String w;
    public java.lang.String x;
    public java.lang.String y;
    public java.lang.String z;

    public b() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f1413a = r0
            r2.f1414b = r0
            r2.f1415c = r0
            r2.d = r0
            r2.e = r0
            r2.f = r0
            r2.g = r0
            r2.h = r0
            r2.i = r0
            r2.j = r0
            r2.k = r0
            r2.l = r0
            r2.m = r0
            r2.n = r0
            r2.o = r0
            r2.p = r0
            r2.q = r0
            r2.r = r0
            r2.s = r0
            r2.t = r0
            r2.u = r0
            r2.v = r0
            r2.w = r0
            r2.x = r0
            r2.y = r0
            r2.z = r0
            r2.A = r0
            r2.B = r0
            r2.C = r0
            r2.D = r0
            java.lang.String r1 = "0"
            r2.E = r1
            r2.F = r0
            r2.G = r0
            r2.H = r0
            r2.I = r0
            r2.J = r0
            r2.K = r0
            r2.L = r0
            r2.M = r0
            r2.N = r0
            r2.O = r0
            r2.P = r0
            r2.Q = r0
            return
    }

    public static synchronized com.mobiletools.systemhelper.control.b a(android.content.Context r1, java.lang.String r2) {
            java.lang.Class<com.mobiletools.systemhelper.control.b> r0 = com.mobiletools.systemhelper.control.b.class
            monitor-enter(r0)
            c.d.a.b.d.d = r1     // Catch: java.lang.Throwable -> Lb
            com.mobiletools.systemhelper.control.b r1 = c.d.a.a.n.a(r1, r2)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public synchronized java.lang.String a() {
            r4 = this;
            monitor-enter(r4)
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            r0.<init>()     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            java.lang.String r1 = r4.f1413a     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 != 0) goto Le
            java.lang.String r1 = "Unknown"
            r4.f1413a = r1     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
        Le:
            java.lang.String r1 = "Manuf"
            java.lang.String r2 = r4.f1413a     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            java.lang.String r1 = r4.f1414b     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 != 0) goto L1d
            java.lang.String r1 = "Unknown"
            r4.f1414b = r1     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
        L1d:
            java.lang.String r1 = "Model"
            java.lang.String r2 = r4.f1414b     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            java.lang.String r1 = r4.f1415c     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 != 0) goto L2c
            java.lang.String r1 = "Unknown"
            r4.f1415c = r1     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
        L2c:
            java.lang.String r1 = "HWVersion"
            java.lang.String r2 = r4.f1415c     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            java.lang.String r1 = r4.d     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 != 0) goto L3b
            java.lang.String r1 = "Unknown"
            r4.d = r1     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
        L3b:
            java.lang.String r1 = "SWVersion"
            java.lang.String r2 = r4.d     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            java.lang.String r1 = r4.e     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 != 0) goto L4a
            java.lang.String r1 = "Unknown"
            r4.e = r1     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
        L4a:
            java.lang.String r1 = "OS"
            java.lang.String r2 = r4.e     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            java.lang.String r1 = r4.f     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 != 0) goto L59
            java.lang.String r1 = "Unknown"
            r4.f = r1     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
        L59:
            java.lang.String r1 = "OSVersion"
            java.lang.String r2 = r4.f     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            java.lang.String r1 = r4.g     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 != 0) goto L68
            java.lang.String r1 = "Unknown"
            r4.g = r1     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
        L68:
            java.lang.String r1 = "IMEI1"
            java.lang.String r2 = r4.g     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            java.lang.String r1 = r4.h     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 != 0) goto L77
            java.lang.String r1 = ""
            r4.h = r1     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
        L77:
            java.lang.String r1 = "ICCID1"
            java.lang.String r2 = r4.h     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            java.lang.String r1 = r4.i     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 != 0) goto L86
            java.lang.String r1 = ""
            r4.i = r1     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
        L86:
            java.lang.String r1 = "IMSI1"
            java.lang.String r2 = r4.i     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            java.lang.String r1 = r4.j     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 != 0) goto L95
            java.lang.String r1 = ""
            r4.j = r1     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
        L95:
            java.lang.String r1 = "MNC1"
            java.lang.String r2 = r4.j     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            java.lang.String r1 = r4.k     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 != 0) goto La4
            java.lang.String r1 = ""
            r4.k = r1     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
        La4:
            java.lang.String r1 = r4.l     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 != 0) goto Lac
            java.lang.String r1 = ""
            r4.l = r1     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
        Lac:
            java.lang.String r1 = "NetworkType1"
            java.lang.String r2 = r4.l     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            java.lang.String r1 = r4.m     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 != 0) goto Lbb
            java.lang.String r1 = ""
            r4.m = r1     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
        Lbb:
            java.lang.String r1 = "TAC1"
            java.lang.String r2 = r4.m     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            java.lang.String r1 = r4.n     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 != 0) goto Lca
            java.lang.String r1 = ""
            r4.n = r1     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
        Lca:
            java.lang.String r1 = "CID1"
            java.lang.String r2 = r4.n     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            java.lang.String r1 = r4.o     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 != 0) goto Ld9
            java.lang.String r1 = ""
            r4.o = r1     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
        Ld9:
            java.lang.String r1 = "PCI1"
            java.lang.String r2 = r4.o     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            java.lang.String r1 = r4.p     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 != 0) goto Le8
            java.lang.String r1 = ""
            r4.p = r1     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
        Le8:
            java.lang.String r1 = "VolteEnabled1"
            java.lang.String r2 = r4.p     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            java.lang.String r1 = r4.q     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 != 0) goto Lf7
            java.lang.String r1 = ""
            r4.q = r1     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
        Lf7:
            java.lang.String r1 = "5GEnabled1"
            java.lang.String r2 = r4.q     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            java.lang.String r1 = r4.r     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 != 0) goto L106
            java.lang.String r1 = ""
            r4.r = r1     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
        L106:
            java.lang.String r1 = "VoNREnable1"
            java.lang.String r2 = r4.r     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            java.lang.String r1 = r4.s     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 != 0) goto L115
            java.lang.String r1 = ""
            r4.s = r1     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
        L115:
            java.lang.String r1 = "IMEI2"
            java.lang.String r2 = r4.s     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            java.lang.String r1 = r4.t     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 != 0) goto L124
            java.lang.String r1 = ""
            r4.t = r1     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
        L124:
            java.lang.String r1 = "ICCID2"
            java.lang.String r2 = r4.t     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            java.lang.String r1 = r4.u     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 != 0) goto L133
            java.lang.String r1 = ""
            r4.u = r1     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
        L133:
            java.lang.String r1 = "IMSI2"
            java.lang.String r2 = r4.u     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            java.lang.String r1 = r4.v     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 != 0) goto L142
            java.lang.String r1 = ""
            r4.v = r1     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
        L142:
            java.lang.String r1 = "MNC2"
            java.lang.String r2 = r4.v     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            java.lang.String r1 = r4.w     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 != 0) goto L151
            java.lang.String r1 = ""
            r4.w = r1     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
        L151:
            java.lang.String r1 = r4.x     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 != 0) goto L159
            java.lang.String r1 = ""
            r4.x = r1     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
        L159:
            java.lang.String r1 = "NetworkType2"
            java.lang.String r2 = r4.x     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            java.lang.String r1 = r4.y     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 != 0) goto L168
            java.lang.String r1 = ""
            r4.y = r1     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
        L168:
            java.lang.String r1 = "TAC2"
            java.lang.String r2 = r4.y     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            java.lang.String r1 = r4.z     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 != 0) goto L177
            java.lang.String r1 = ""
            r4.z = r1     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
        L177:
            java.lang.String r1 = "CID2"
            java.lang.String r2 = r4.z     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            java.lang.String r1 = r4.A     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 != 0) goto L186
            java.lang.String r1 = ""
            r4.A = r1     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
        L186:
            java.lang.String r1 = "PCI2"
            java.lang.String r2 = r4.A     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            java.lang.String r1 = r4.B     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 != 0) goto L195
            java.lang.String r1 = ""
            r4.B = r1     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
        L195:
            java.lang.String r1 = "VolteEnabled2"
            java.lang.String r2 = r4.B     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            java.lang.String r1 = r4.C     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 != 0) goto L1a4
            java.lang.String r1 = ""
            r4.C = r1     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
        L1a4:
            java.lang.String r1 = "5GEnabled2"
            java.lang.String r2 = r4.C     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            java.lang.String r1 = r4.D     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 != 0) goto L1b3
            java.lang.String r1 = ""
            r4.D = r1     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
        L1b3:
            java.lang.String r1 = "VoNREnable2"
            java.lang.String r2 = r4.D     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            java.lang.String r1 = r4.E     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 != 0) goto L1c3
            java.lang.String r1 = "0"
        L1c0:
            r4.E = r1     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            goto L1e2
        L1c3:
            java.lang.String r1 = r4.E     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 != 0) goto L1df
            java.lang.String r1 = r4.E     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            java.lang.String r2 = "1"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 != 0) goto L1e2
            java.lang.String r1 = r4.E     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            java.lang.String r2 = "2"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 != 0) goto L1e2
        L1df:
            java.lang.String r1 = "0"
            goto L1c0
        L1e2:
            java.lang.String r1 = "DataSlot"
            java.lang.String r2 = r4.E     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            java.lang.String r1 = r4.F     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 != 0) goto L1f1
            java.lang.String r1 = "Unknown"
            r4.F = r1     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
        L1f1:
            java.lang.String r1 = "AccType"
            java.lang.String r2 = r4.F     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            java.lang.String r1 = r4.G     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 != 0) goto L200
            java.lang.String r1 = ""
            r4.G = r1     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
        L200:
            java.lang.String r1 = r4.H     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 != 0) goto L208
            java.lang.String r1 = ""
            r4.H = r1     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
        L208:
            java.lang.String r1 = "IPv6"
            java.lang.String r2 = r4.H     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            org.json.JSONObject r1 = r4.I     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 != 0) goto L21b
            java.lang.String r1 = "SubType"
            java.lang.String r2 = ""
        L217:
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            goto L220
        L21b:
            java.lang.String r1 = "SubType"
            org.json.JSONObject r2 = r4.I     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            goto L217
        L220:
            java.lang.String r1 = r4.J     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 == 0) goto L22c
            java.lang.String r1 = r4.J     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 == 0) goto L230
        L22c:
            java.lang.String r1 = "000"
            r4.J = r1     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
        L230:
            java.lang.String r1 = r4.J     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 == 0) goto L23b
            java.lang.String r1 = "DeviceType"
            java.lang.String r2 = r4.J     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
        L23b:
            java.lang.String r1 = r4.K     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 != 0) goto L243
            java.lang.String r1 = ""
            r4.K = r1     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
        L243:
            java.lang.String r1 = "RegType"
            java.lang.String r2 = r4.K     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            java.lang.String r1 = "5.0"
            r4.L = r1     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 == 0) goto L255
            java.lang.String r2 = "SpecVersion"
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
        L255:
            java.lang.String r1 = r4.M     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 != 0) goto L25d
            java.lang.String r1 = "3.0.1"
            r4.M = r1     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
        L25d:
            java.lang.String r1 = r4.M     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 == 0) goto L268
            java.lang.String r1 = "ClientVersion"
            java.lang.String r2 = r4.M     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
        L268:
            java.lang.String r1 = r4.N     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 != 0) goto L270
            java.lang.String r1 = ""
            r4.N = r1     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
        L270:
            java.lang.String r1 = "Time"
            java.lang.String r2 = r4.N     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            java.lang.String r1 = r4.K     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            java.lang.String r2 = "R"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 != 0) goto L28b
            java.lang.String r1 = r4.K     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            java.lang.String r2 = ""
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 == 0) goto L2a1
        L28b:
            org.json.JSONArray r1 = r4.P     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 != 0) goto L29a
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            r1.<init>()     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            java.lang.String r2 = "SigInfo"
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            goto L2a1
        L29a:
            java.lang.String r1 = "SigInfo"
            org.json.JSONArray r2 = r4.P     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
        L2a1:
            java.lang.String r1 = r4.K     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            java.lang.String r2 = "A"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 != 0) goto L2b5
            java.lang.String r1 = r4.K     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            java.lang.String r2 = ""
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 == 0) goto L2cb
        L2b5:
            org.json.JSONArray r1 = r4.O     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            if (r1 != 0) goto L2c4
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            r1.<init>()     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            java.lang.String r2 = "AppInfo"
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            goto L2cb
        L2c4:
            java.lang.String r1 = "AppInfo"
            org.json.JSONArray r2 = r4.O     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
        L2cb:
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            r4.Q = r0     // Catch: java.lang.Throwable -> L2d2 org.json.JSONException -> L2d4
            goto L2ef
        L2d2:
            r0 = move-exception
            goto L2f3
        L2d4:
            r0 = move-exception
            java.lang.String r1 = "DeviceInfo"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d2
            r2.<init>()     // Catch: java.lang.Throwable -> L2d2
            java.lang.String r3 = "JSONException->"
            r2.append(r3)     // Catch: java.lang.Throwable -> L2d2
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L2d2
            r2.append(r0)     // Catch: java.lang.Throwable -> L2d2
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L2d2
            c.d.a.b.h.b(r1, r0)     // Catch: java.lang.Throwable -> L2d2
        L2ef:
            java.lang.String r0 = r4.Q     // Catch: java.lang.Throwable -> L2d2
            monitor-exit(r4)
            return r0
        L2f3:
            monitor-exit(r4)
            throw r0
    }
}
