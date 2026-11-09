package c.d.a.b;

/* JADX INFO: loaded from: classes.dex */
public class n {
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String C;
    public java.lang.String D;
    public java.lang.String E;
    public java.lang.String F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.String f1343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.String f1344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.String f1345c;
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

    public n() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.f1343a = r0
            r1.f1344b = r0
            r1.f1345c = r0
            r1.d = r0
            r1.e = r0
            r1.f = r0
            r1.g = r0
            r1.h = r0
            r1.i = r0
            r1.j = r0
            r1.k = r0
            r1.l = r0
            r1.m = r0
            r1.n = r0
            r1.o = r0
            r1.p = r0
            r1.q = r0
            r1.r = r0
            r1.s = r0
            r1.t = r0
            r1.u = r0
            r1.v = r0
            r1.w = r0
            r1.x = r0
            r1.y = r0
            r1.z = r0
            r1.A = r0
            r1.B = r0
            r1.C = r0
            r1.D = r0
            r1.E = r0
            r1.F = r0
            java.lang.String r0 = c.d.a.b.l.a()
            r1.f1343a = r0
            return
    }

    public org.json.JSONObject a() {
            r4 = this;
            java.lang.String r0 = r4.f1344b
            r1 = 0
            java.lang.String r2 = "SignalInfo"
            if (r0 == 0) goto L1c0
            java.lang.String r3 = r4.e
            if (r3 == 0) goto L1c0
            java.lang.String r3 = r4.g
            if (r3 == 0) goto L1c0
            java.lang.String r3 = r4.h
            if (r3 == 0) goto L1c0
            java.lang.String r3 = r4.i
            if (r3 == 0) goto L1c0
            java.lang.String r3 = r4.j
            if (r3 == 0) goto L1c0
            java.lang.String r3 = r4.k
            if (r3 == 0) goto L1c0
            java.lang.String r3 = r4.f
            if (r3 != 0) goto L25
            goto L1c0
        L25:
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L15e
            java.lang.String r0 = r4.e
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L15e
            java.lang.String r0 = r4.g
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L15e
            java.lang.String r0 = r4.h
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L15e
            java.lang.String r0 = r4.i
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L15e
            java.lang.String r0 = r4.j
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L15e
            java.lang.String r0 = r4.k
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L15e
            java.lang.String r0 = r4.f
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L65
            goto L15e
        L65:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "Time"
            java.lang.String r3 = r4.f1343a     // Catch: org.json.JSONException -> L144
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L144
            java.lang.String r1 = "IMEI"
            java.lang.String r3 = r4.f1344b     // Catch: org.json.JSONException -> L144
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L144
            java.lang.String r1 = "ICCID"
            java.lang.String r3 = r4.f1345c     // Catch: org.json.JSONException -> L144
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L144
            java.lang.String r1 = "ClientVersion"
            java.lang.String r3 = r4.d     // Catch: org.json.JSONException -> L144
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L144
            java.lang.String r1 = "MNC"
            java.lang.String r3 = r4.e     // Catch: org.json.JSONException -> L144
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L144
            java.lang.String r1 = "IMSI"
            java.lang.String r3 = r4.g     // Catch: org.json.JSONException -> L144
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L144
            java.lang.String r1 = "TAC"
            java.lang.String r3 = r4.h     // Catch: org.json.JSONException -> L144
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L144
            java.lang.String r1 = "CID"
            java.lang.String r3 = r4.i     // Catch: org.json.JSONException -> L144
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L144
            java.lang.String r1 = "PCI"
            java.lang.String r3 = r4.j     // Catch: org.json.JSONException -> L144
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L144
            java.lang.String r1 = "NetworkType"
            java.lang.String r3 = r4.k     // Catch: org.json.JSONException -> L144
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L144
            java.lang.String r1 = "ARFCN"
            java.lang.String r3 = r4.l     // Catch: org.json.JSONException -> L144
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L144
            java.lang.String r1 = "Bands"
            java.lang.String r3 = r4.m     // Catch: org.json.JSONException -> L144
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L144
            java.lang.String r1 = "Bandwidth"
            java.lang.String r3 = r4.n     // Catch: org.json.JSONException -> L144
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L144
            java.lang.String r1 = "CQITableIndex"
            java.lang.String r3 = r4.o     // Catch: org.json.JSONException -> L144
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L144
            java.lang.String r1 = "CQIIndex"
            java.lang.String r3 = r4.p     // Catch: org.json.JSONException -> L144
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L144
            java.lang.String r1 = "RSRP"
            java.lang.String r3 = r4.q     // Catch: org.json.JSONException -> L144
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L144
            java.lang.String r1 = "RSRQ"
            java.lang.String r3 = r4.s     // Catch: org.json.JSONException -> L144
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L144
            java.lang.String r1 = "SINR"
            java.lang.String r3 = r4.r     // Catch: org.json.JSONException -> L144
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L144
            java.lang.String r1 = "CSIRSRP"
            java.lang.String r3 = r4.t     // Catch: org.json.JSONException -> L144
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L144
            java.lang.String r1 = "CSIRSRQ"
            java.lang.String r3 = r4.u     // Catch: org.json.JSONException -> L144
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L144
            java.lang.String r1 = "CSISINR"
            java.lang.String r3 = r4.v     // Catch: org.json.JSONException -> L144
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L144
            java.lang.String r1 = "Uspeed"
            java.lang.String r3 = r4.w     // Catch: org.json.JSONException -> L144
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L144
            java.lang.String r1 = "Dspeed"
            java.lang.String r3 = r4.x     // Catch: org.json.JSONException -> L144
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L144
            java.lang.String r1 = "CallDisconnectCause"
            java.lang.String r3 = r4.y     // Catch: org.json.JSONException -> L144
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L144
            java.lang.String r1 = "DataFailCause"
            java.lang.String r3 = r4.z     // Catch: org.json.JSONException -> L144
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L144
            java.lang.String r1 = "EPSFallback"
            java.lang.String r3 = r4.A     // Catch: org.json.JSONException -> L144
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L144
            java.lang.String r1 = "LONGITUDE"
            java.lang.String r3 = r4.B     // Catch: org.json.JSONException -> L144
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L144
            java.lang.String r1 = "LATITUDE"
            java.lang.String r3 = r4.C     // Catch: org.json.JSONException -> L144
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L144
            java.lang.String r1 = "ALTITUDE"
            java.lang.String r3 = r4.D     // Catch: org.json.JSONException -> L144
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L144
            java.lang.String r1 = "SPEED"
            java.lang.String r3 = r4.E     // Catch: org.json.JSONException -> L144
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L144
            java.lang.String r1 = "BEARING"
            java.lang.String r4 = r4.F     // Catch: org.json.JSONException -> L144
            r0.put(r1, r4)     // Catch: org.json.JSONException -> L144
            goto L15d
        L144:
            r4 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "getJsonObject->"
            r1.append(r3)
            java.lang.String r4 = r4.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            c.d.a.b.h.b(r2, r4)
        L15d:
            return r0
        L15e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "imei:"
            r0.append(r3)
            java.lang.String r3 = r4.f1344b
            r0.append(r3)
            java.lang.String r3 = "mnc:"
            r0.append(r3)
            java.lang.String r3 = r4.e
            r0.append(r3)
            java.lang.String r3 = "imsi:"
            r0.append(r3)
            java.lang.String r3 = r4.g
            r0.append(r3)
            java.lang.String r3 = "tac:"
            r0.append(r3)
            java.lang.String r3 = r4.h
            r0.append(r3)
            java.lang.String r3 = "cid:"
            r0.append(r3)
            java.lang.String r3 = r4.i
            r0.append(r3)
            java.lang.String r3 = "pci:"
            r0.append(r3)
            java.lang.String r3 = r4.j
            r0.append(r3)
            java.lang.String r3 = "networkType:"
            r0.append(r3)
            java.lang.String r3 = r4.k
            r0.append(r3)
            java.lang.String r3 = "mncch:"
            r0.append(r3)
            java.lang.String r4 = r4.f
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            c.d.a.b.h.a(r2, r4)
            java.lang.String r4 = "SignalInfo->getJsonObject==null"
        L1bc:
            c.d.a.b.h.b(r2, r4)
            return r1
        L1c0:
            java.lang.String r4 = "imei/mnc/imsi/tac/cid/pci/networkType/mncch is null!"
            goto L1bc
    }
}
