package a.a.a.b;

/* JADX INFO: loaded from: classes.dex */
public class d extends a.a.a.i.g {
    public boolean A;
    public boolean B;
    public double C;
    public double D;
    public int E;
    public int F;
    public java.lang.String G;
    public int H;
    public java.lang.String I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public boolean i;
    public long j;
    public android.os.Handler k;
    public java.lang.String l;
    public int[] m;
    public double n;
    public double o;
    public float[] p;
    public float[] q;
    public float[] r;
    public float[] s;
    public float[] t;
    public float[] u;
    public java.util.ArrayList<java.util.ArrayList<java.lang.Float>> v;
    public java.util.ArrayList<java.util.ArrayList<java.lang.Double>> w;
    public boolean x;
    public boolean y;
    public boolean z;

    public class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.a.a.b.d f15b;

        public a(a.a.a.b.d r1) {
                r0 = this;
                r0.f15b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 17
                if (r0 < r1) goto L1d
                a.a.a.b.w r0 = a.a.a.b.w.d()
                java.util.concurrent.ExecutorService r0 = r0.b()
                a.a.a.b.d r2 = r2.f15b
                if (r0 == 0) goto L18
                java.lang.String r1 = a.a.a.i.d.f325c
                r2.a(r0, r1)
                goto L1d
            L18:
                java.lang.String r0 = a.a.a.i.d.f325c
                r2.a(r0)
            L1d:
                return
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a.a.a.b.d f16a = null;

        static {
                a.a.a.b.d r0 = new a.a.a.b.d
                r1 = 0
                r0.<init>(r1)
                a.a.a.b.d.b.f16a = r0
                return
        }

        public static /* synthetic */ a.a.a.b.d a() {
                a.a.a.b.d r0 = a.a.a.b.d.b.f16a
                return r0
        }
    }

    static {
            return
    }

    public d() {
            r7 = this;
            r7.<init>()
            r0 = 0
            r7.i = r0
            r1 = 0
            r7.j = r1
            r3 = 0
            r7.k = r3
            r7.l = r3
            r7.m = r3
            r4 = 0
            r7.n = r4
            r7.o = r4
            r4 = 1
            float[] r5 = new float[r4]
            r6 = 0
            r5[r0] = r6
            r7.p = r5
            float[] r5 = new float[r4]
            r5[r0] = r6
            r7.q = r5
            float[] r5 = new float[r4]
            r5[r0] = r6
            r7.r = r5
            float[] r5 = new float[r4]
            r5[r0] = r6
            r7.s = r5
            float[] r5 = new float[r4]
            r5[r0] = r6
            r7.t = r5
            float[] r5 = new float[r4]
            r5[r0] = r6
            r7.u = r5
            r7.v = r3
            r7.w = r3
            r7.x = r0
            r7.y = r0
            r7.z = r0
            r7.A = r0
            r7.B = r0
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r7.C = r5
            r7.D = r5
            r7.E = r0
            r7.F = r0
            java.lang.String r5 = ""
            r7.G = r5
            r7.H = r0
            java.lang.String r5 = "1,1,300,4,30,10,5,10"
            r7.I = r5
            r7.J = r4
            r5 = 30
            r7.K = r5
            r5 = 64
            r7.L = r5
            r7.M = r4
            r7.N = r0
            a.a.a.b.r r0 = a.a.a.b.r.a()
            java.lang.String r4 = "vdrtt"
            long r0 = r0.a(r4, r1)
            r7.j = r0
            a.a.a.b.r r0 = a.a.a.b.r.a()
            java.lang.String r1 = "mapcity"
            java.lang.String r0 = r0.a(r1, r3)
            r7.l = r0
            return
    }

    public /* synthetic */ d(a.a.a.b.d.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static a.a.a.b.d i() {
            a.a.a.b.d r0 = a.a.a.b.d.b.a()
            return r0
    }

    @Override // a.a.a.i.g
    public void a() {
            r7 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = "&sdk="
            r0.append(r1)
            r1 = 1092113924(0x41185604, float:9.521)
            r0.append(r1)
            java.lang.String r1 = "&stp=1"
            r0.append(r1)
            a.a.a.i.b r1 = a.a.a.i.b.e()
            java.lang.String r1 = r1.f321c
            if (r1 != 0) goto L29
            java.lang.String r1 = "&im="
            r0.append(r1)
            a.a.a.i.b r1 = a.a.a.i.b.e()
            java.lang.String r1 = r1.f319a
            goto L34
        L29:
            java.lang.String r1 = "&cu="
            r0.append(r1)
            a.a.a.i.b r1 = a.a.a.i.b.e()
            java.lang.String r1 = r1.f321c
        L34:
            r0.append(r1)
            java.lang.String r1 = "&mb="
            r0.append(r1)
            java.lang.String r1 = android.os.Build.MODEL
            r0.append(r1)
            java.lang.String r1 = "&abtest=1"
            r0.append(r1)
            java.lang.String r1 = "&fixa9=2"
            r0.append(r1)
            java.lang.String r1 = "&sv="
            r0.append(r1)
            java.lang.String r1 = android.os.Build.VERSION.RELEASE
            r2 = 0
            if (r1 == 0) goto L61
            int r3 = r1.length()
            r4 = 10
            if (r3 <= r4) goto L61
            java.lang.String r1 = r1.substring(r2, r4)
        L61:
            r0.append(r1)
            java.lang.String r1 = "&os="
            r0.append(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0.append(r1)
            java.lang.String r3 = "&pack="
            r0.append(r3)
            java.lang.String r3 = a.a.a.i.b.f
            r0.append(r3)
            java.lang.String r3 = "&city="
            r0.append(r3)
            java.lang.String r3 = r7.l
            r0.append(r3)
            java.lang.String r3 = "&locmode="
            r0.append(r3)
            android.content.Context r3 = com.baidu.location.f.c()
            int r3 = a.a.a.i.i.c(r3)
            r0.append(r3)
            java.lang.String r3 = "&locper="
            r0.append(r3)
            android.content.Context r3 = com.baidu.location.f.c()
            java.lang.String r4 = "android.permission.ACCESS_FINE_LOCATION"
            int r3 = a.a.a.i.i.a(r3, r4)
            r0.append(r3)
            double r3 = r7.o
            r5 = 4591870180174331904(0x3fb99999a0000000, double:0.10000000149011612)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto Lc9
            double r3 = r7.n
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto Lc9
            java.lang.String r3 = "&x="
            r0.append(r3)
            double r3 = r7.o
            r0.append(r3)
            java.lang.String r3 = "&y="
            r0.append(r3)
            double r3 = r7.n
            r0.append(r3)
        Lc9:
            java.lang.String r3 = "&selftest="
            r0.append(r3)
            r0.append(r2)
            r2 = 25
            if (r1 <= r2) goto Ldf
            java.lang.String r1 = "&rpmmc="
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
        Ldf:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r7.d
            if (r1 != 0) goto Lea
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r7.d = r1
        Lea:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r7.d
            if (r1 == 0) goto L109
            r1.clear()
            java.util.Map<java.lang.String, java.lang.Object> r1 = r7.d
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = com.baidu.location.Jni.a(r0)
            java.lang.String r2 = "it"
            r1.put(r2, r0)
            java.util.Map<java.lang.String, java.lang.Object> r7 = r7.d
            java.lang.String r0 = "qt"
            java.lang.String r1 = "vdr"
            r7.put(r0, r1)
        L109:
            return
    }

    public void a(double r1, double r3) {
            r0 = this;
            r0.n = r1
            r0.o = r3
            return
    }

    @Override // a.a.a.i.g
    public void a(boolean r5) {
            r4 = this;
            java.lang.String r0 = "data"
            r1 = 1
            if (r5 == 0) goto L3f
            java.lang.String r5 = r4.f339c
            if (r5 == 0) goto L3f
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L3a
            r2.<init>(r5)     // Catch: java.lang.Exception -> L3a
            boolean r5 = r2.has(r0)     // Catch: java.lang.Exception -> L3a
            if (r5 == 0) goto L30
            java.lang.String r5 = r2.getString(r0)     // Catch: java.lang.Exception -> L3a
            a.a.a.b.r r0 = a.a.a.b.r.a()     // Catch: java.lang.Exception -> L3a
            java.lang.String r2 = "vdrconfig"
            java.lang.String r3 = ""
            r0.b(r2, r3)     // Catch: java.lang.Exception -> L3a
            a.a.a.b.r r0 = a.a.a.b.r.a()     // Catch: java.lang.Exception -> L3a
            java.lang.String r2 = "vdrconfig_gz"
            r0.b(r2, r5)     // Catch: java.lang.Exception -> L3a
            r4.b(r1)     // Catch: java.lang.Exception -> L3a
            goto L48
        L30:
            boolean r5 = r4.i     // Catch: java.lang.Exception -> L3a
            if (r5 != 0) goto L48
            r4.h()     // Catch: java.lang.Exception -> L3a
            r4.i = r1     // Catch: java.lang.Exception -> L3a
            goto L48
        L3a:
            boolean r5 = r4.i
            if (r5 != 0) goto L48
            goto L43
        L3f:
            boolean r5 = r4.i
            if (r5 != 0) goto L48
        L43:
            r4.h()
            r4.i = r1
        L48:
            java.util.Map<java.lang.String, java.lang.Object> r4 = r4.d
            if (r4 == 0) goto L4f
            r4.clear()
        L4f:
            return
    }

    public final void b() {
            r4 = this;
            java.lang.String r0 = "1|0|300|80|2|300|80|2|100|40|30|3|8|4050|5|5|0.1|1|1|0|0.325|0.15|3|0.5|1|6|15|10|0.05|10|10|1|5|10|10|30|5|5.5|1|0|1|40|0.5|120|180|20|200|300|600|2|10|2|4|1.02|2|0|20|10|60|2|100|2|10|1|20|0|0.2|0|0|0.5|0|1|1000|10|1|40|5|10|5|0.8|1|5.0|50|6.0|2.0|4.0|1|1|0|0|1|0.5|1|0.0|1|200|100|1|8|5|25|20|1|70.0|110.0|300|1|15|1.0"
            java.lang.String r1 = "\\|"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            float[] r1 = new float[r1]
            r4.p = r1
            r1 = 0
        Le:
            int r2 = r0.length
            if (r1 >= r2) goto L23
            float[] r2 = r4.p     // Catch: java.lang.NumberFormatException -> L1c
            r3 = r0[r1]     // Catch: java.lang.NumberFormatException -> L1c
            float r3 = java.lang.Float.parseFloat(r3)     // Catch: java.lang.NumberFormatException -> L1c
            r2[r1] = r3     // Catch: java.lang.NumberFormatException -> L1c
            goto L20
        L1c:
            r2 = move-exception
            r2.printStackTrace()
        L20:
            int r1 = r1 + 1
            goto Le
        L23:
            return
    }

    public void b(boolean r22) {
            r21 = this;
            r1 = r21
            java.lang.String r2 = "hdynwot"
            java.lang.String r3 = "hysV2"
            java.lang.String r4 = "ison"
            java.lang.String r5 = "voc"
            java.lang.String r6 = "vdt"
            java.lang.String r7 = "vgs"
            java.lang.String r8 = "vte"
            java.lang.String r9 = "vzo"
            java.lang.String r10 = "vir"
            java.lang.String r11 = "vds"
            java.lang.String r12 = "vl"
            java.lang.String r13 = "vr"
            java.lang.String r14 = "vt"
            java.lang.String r15 = ","
            r22 = r5
            a.a.a.b.r r5 = a.a.a.b.r.a()
            r16 = r6
            java.lang.String r6 = ""
            r17 = r7
            java.lang.String r7 = "vdrconfig_gz"
            java.lang.String r5 = r5.a(r7, r6)
            boolean r7 = android.text.TextUtils.isEmpty(r5)
            r18 = r8
            r8 = 0
            if (r7 != 0) goto L4c
            byte[] r7 = android.util.Base64.decode(r5, r8)     // Catch: java.lang.Exception -> L4b
            byte[] r7 = a.a.a.i.i.b(r7)     // Catch: java.lang.Exception -> L4b
            if (r7 == 0) goto L4c
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Exception -> L4b
            java.lang.String r8 = "UTF-8"
            r5.<init>(r7, r8)     // Catch: java.lang.Exception -> L4b
            goto L4c
        L4b:
            r5 = 0
        L4c:
            if (r5 == 0) goto Lfbb
            int r7 = r5.length()
            r8 = 1
            if (r7 <= r8) goto Lfbb
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lfb6
            r7.<init>(r5)     // Catch: java.lang.Exception -> Lfb6
            boolean r5 = r7.has(r4)     // Catch: java.lang.Exception -> Lfb6
            if (r5 == 0) goto L63
            r7.getInt(r4)     // Catch: java.lang.Exception -> Lfb6
        L63:
            boolean r4 = r7.has(r3)     // Catch: java.lang.Exception -> Lfb6
            java.lang.String r5 = "|"
            java.lang.String r8 = "\\|"
            if (r4 == 0) goto L9f
            r4 = 1
            r7.optInt(r3, r4)     // Catch: java.lang.Exception -> Lfb6
            java.lang.String r3 = "hdyfms"
            boolean r3 = r7.has(r3)     // Catch: java.lang.Exception -> Lfb6
            if (r3 == 0) goto L9f
            java.lang.String r3 = "hdyfms"
            java.lang.String r3 = r7.optString(r3)     // Catch: java.lang.Exception -> Lfb6
            boolean r4 = r6.equals(r3)     // Catch: java.lang.Exception -> Lfb6
            if (r4 != 0) goto L9f
            boolean r4 = r3.contains(r5)     // Catch: java.lang.Exception -> Lfb6
            if (r4 == 0) goto L9f
            java.lang.String[] r3 = r3.split(r8)     // Catch: java.lang.Exception -> Lfb6
            int r4 = r3.length     // Catch: java.lang.Exception -> Lfb6
            r6 = 2
            if (r4 < r6) goto L9f
            r4 = 0
            r6 = r3[r4]     // Catch: java.lang.Exception -> Lfb6
            java.lang.Integer.parseInt(r6)     // Catch: java.lang.Exception -> Lfb6
            r4 = 1
            r3 = r3[r4]     // Catch: java.lang.Exception -> Lfb6
            java.lang.Integer.parseInt(r3)     // Catch: java.lang.Exception -> Lfb6
        L9f:
            boolean r3 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r3 == 0) goto Laa
            r3 = 2000(0x7d0, float:2.803E-42)
            r7.optInt(r2, r3)     // Catch: java.lang.Exception -> Lfb6
        Laa:
            java.lang.String r2 = "hyp"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Lb8
            java.lang.String r2 = "hyp"
            r3 = 0
            r7.optString(r2, r3)     // Catch: java.lang.Exception -> Lfb6
        Lb8:
            java.lang.String r2 = "navilane"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Lc6
            java.lang.String r2 = "navilane"
            r3 = 0
            r7.optInt(r2, r3)     // Catch: java.lang.Exception -> Lfb6
        Lc6:
            java.lang.String r2 = "navilane_dr"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Ld4
            java.lang.String r2 = "navilane_dr"
            r3 = 0
            r7.optInt(r2, r3)     // Catch: java.lang.Exception -> Lfb6
        Ld4:
            java.lang.String r2 = "navilane_uat"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Le3
            java.lang.String r2 = "navilane_uat"
            r3 = 15
            r7.optInt(r2, r3)     // Catch: java.lang.Exception -> Lfb6
        Le3:
            java.lang.String r2 = "navilane_dr_para"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Lf2
            java.lang.String r2 = "navilane_dr_para"
            r3 = 500(0x1f4, float:7.0E-43)
            r7.optInt(r2, r3)     // Catch: java.lang.Exception -> Lfb6
        Lf2:
            java.lang.String r2 = "bmsrco"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L100
            java.lang.String r2 = "bmsrco"
            r3 = 1
            r7.optInt(r2, r3)     // Catch: java.lang.Exception -> Lfb6
        L100:
            java.lang.String r2 = "bhyco"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L10e
            java.lang.String r2 = "bhyco"
            r3 = 1
            r7.optInt(r2, r3)     // Catch: java.lang.Exception -> Lfb6
        L10e:
            java.lang.String r2 = "rcapso"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L11c
            java.lang.String r2 = "rcapso"
            r3 = 1
            r7.optInt(r2, r3)     // Catch: java.lang.Exception -> Lfb6
        L11c:
            java.lang.String r2 = "rcpgn"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L12b
            java.lang.String r2 = "rcpgn"
            r3 = 15
            r7.optInt(r2, r3)     // Catch: java.lang.Exception -> Lfb6
        L12b:
            java.lang.String r2 = "rcjlgt"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            r3 = 3
            if (r2 == 0) goto L139
            java.lang.String r2 = "rcjlgt"
            r7.optInt(r2, r3)     // Catch: java.lang.Exception -> Lfb6
        L139:
            java.lang.String r2 = "splprs"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L147
            java.lang.String r2 = "splprs"
            r4 = -1
            r7.optInt(r2, r4)     // Catch: java.lang.Exception -> Lfb6
        L147:
            java.lang.String r2 = "cbds"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L154
            java.lang.String r2 = "cbds"
            r7.optInt(r2)     // Catch: java.lang.Exception -> Lfb6
        L154:
            java.lang.String r2 = "hploc"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> L296
            if (r2 == 0) goto L264
            java.lang.String r2 = "hploc"
            java.lang.String r2 = r7.getString(r2)     // Catch: java.lang.Exception -> L296
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L296
            if (r4 != 0) goto L264
            boolean r4 = r2.contains(r5)     // Catch: java.lang.Exception -> L296
            if (r4 == 0) goto L264
            java.lang.String[] r4 = r2.split(r8)     // Catch: java.lang.Exception -> L296
            if (r4 == 0) goto L22e
            int r6 = r4.length     // Catch: java.lang.Exception -> L296
            r3 = 2
            if (r6 < r3) goto L22e
            r3 = 0
            r6 = r4[r3]     // Catch: java.lang.Exception -> L296
            java.lang.String r3 = "RMS"
            boolean r3 = r6.equals(r3)     // Catch: java.lang.Exception -> L296
            if (r3 == 0) goto L187
            r3 = 1
            r1.z = r3     // Catch: java.lang.Exception -> L296
            goto L1c2
        L187:
            r6 = 0
            r3 = r4[r6]     // Catch: java.lang.Exception -> L296
            java.lang.String r6 = "BMS"
            boolean r3 = r3.equals(r6)     // Catch: java.lang.Exception -> L296
            if (r3 == 0) goto L196
            r3 = 1
            r1.A = r3     // Catch: java.lang.Exception -> L296
            goto L1c2
        L196:
            r6 = 0
            r3 = r4[r6]     // Catch: java.lang.Exception -> L296
            java.lang.String r6 = "HMS"
            boolean r3 = r3.equals(r6)     // Catch: java.lang.Exception -> L296
            if (r3 == 0) goto L1a5
            r3 = 1
            r1.x = r3     // Catch: java.lang.Exception -> L296
            goto L1c2
        L1a5:
            r6 = 0
            r3 = r4[r6]     // Catch: java.lang.Exception -> L296
            java.lang.String r6 = "HPMS"
            boolean r3 = r3.equals(r6)     // Catch: java.lang.Exception -> L296
            if (r3 == 0) goto L1b4
            r3 = 1
            r1.B = r3     // Catch: java.lang.Exception -> L296
            goto L1c2
        L1b4:
            r6 = 0
            r3 = r4[r6]     // Catch: java.lang.Exception -> L296
            java.lang.String r6 = "HMS,BMS"
            boolean r3 = r3.equals(r6)     // Catch: java.lang.Exception -> L296
            if (r3 == 0) goto L1c2
            r3 = 1
            r1.y = r3     // Catch: java.lang.Exception -> L296
        L1c2:
            boolean r3 = r1.z     // Catch: java.lang.Exception -> L296
            if (r3 != 0) goto L1d6
            boolean r3 = r1.A     // Catch: java.lang.Exception -> L296
            if (r3 != 0) goto L1d6
            boolean r3 = r1.x     // Catch: java.lang.Exception -> L296
            if (r3 != 0) goto L1d6
            boolean r3 = r1.B     // Catch: java.lang.Exception -> L296
            if (r3 != 0) goto L1d6
            boolean r3 = r1.y     // Catch: java.lang.Exception -> L296
            if (r3 == 0) goto L1f3
        L1d6:
            r3 = 1
            r6 = r4[r3]     // Catch: java.lang.Exception -> L296
            java.lang.String r3 = "ALL"
            boolean r3 = r6.equals(r3)     // Catch: java.lang.Exception -> L296
            if (r3 == 0) goto L1e5
            r3 = 1
            r1.E = r3     // Catch: java.lang.Exception -> L296
            goto L1f3
        L1e5:
            r3 = 1
            r4 = r4[r3]     // Catch: java.lang.Exception -> L296
            java.lang.String r3 = "NAVI"
            boolean r3 = r4.equals(r3)     // Catch: java.lang.Exception -> L296
            if (r3 == 0) goto L1f3
            r3 = 2
            r1.E = r3     // Catch: java.lang.Exception -> L296
        L1f3:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L296
            r3.<init>()     // Catch: java.lang.Exception -> L296
            r3.append(r2)     // Catch: java.lang.Exception -> L296
            r3.append(r15)     // Catch: java.lang.Exception -> L296
            boolean r2 = r1.z     // Catch: java.lang.Exception -> L296
            r3.append(r2)     // Catch: java.lang.Exception -> L296
            r3.append(r15)     // Catch: java.lang.Exception -> L296
            boolean r2 = r1.B     // Catch: java.lang.Exception -> L296
            r3.append(r2)     // Catch: java.lang.Exception -> L296
            r3.append(r15)     // Catch: java.lang.Exception -> L296
            boolean r2 = r1.x     // Catch: java.lang.Exception -> L296
            r3.append(r2)     // Catch: java.lang.Exception -> L296
            r3.append(r15)     // Catch: java.lang.Exception -> L296
            boolean r2 = r1.A     // Catch: java.lang.Exception -> L296
            r3.append(r2)     // Catch: java.lang.Exception -> L296
            r3.append(r15)     // Catch: java.lang.Exception -> L296
            boolean r2 = r1.y     // Catch: java.lang.Exception -> L296
            r3.append(r2)     // Catch: java.lang.Exception -> L296
            r3.append(r15)     // Catch: java.lang.Exception -> L296
            int r2 = r1.E     // Catch: java.lang.Exception -> L296
            r3.append(r2)     // Catch: java.lang.Exception -> L296
            r3.toString()     // Catch: java.lang.Exception -> L296
        L22e:
            java.lang.String r2 = "baidu_location_service"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L296
            r3.<init>()     // Catch: java.lang.Exception -> L296
            java.lang.String r4 = "CloudConfig hplocation config = hms "
            r3.append(r4)     // Catch: java.lang.Exception -> L296
            boolean r4 = r1.x     // Catch: java.lang.Exception -> L296
            r3.append(r4)     // Catch: java.lang.Exception -> L296
            java.lang.String r4 = "; rms "
            r3.append(r4)     // Catch: java.lang.Exception -> L296
            boolean r4 = r1.z     // Catch: java.lang.Exception -> L296
            r3.append(r4)     // Catch: java.lang.Exception -> L296
            java.lang.String r4 = "; baidurtk "
            r3.append(r4)     // Catch: java.lang.Exception -> L296
            boolean r4 = r1.A     // Catch: java.lang.Exception -> L296
            r3.append(r4)     // Catch: java.lang.Exception -> L296
            java.lang.String r4 = " ; hdlocationuse = "
            r3.append(r4)     // Catch: java.lang.Exception -> L296
            int r4 = r1.E     // Catch: java.lang.Exception -> L296
            r3.append(r4)     // Catch: java.lang.Exception -> L296
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L296
            android.util.Log.i(r2, r3)     // Catch: java.lang.Exception -> L296
        L264:
            java.lang.String r2 = "hdlnp"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> L296
            if (r2 == 0) goto L272
            java.lang.String r2 = "hdlnp"
            r3 = 1
            r7.optInt(r2, r3)     // Catch: java.lang.Exception -> L296
        L272:
            java.lang.String r2 = "hdlnpt"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> L296
            if (r2 == 0) goto L281
            java.lang.String r2 = "hdlnpt"
            r3 = 1500(0x5dc, float:2.102E-42)
            r7.optInt(r2, r3)     // Catch: java.lang.Exception -> L296
        L281:
            java.lang.String r2 = "viaduct"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> L296
            if (r2 == 0) goto L296
            java.lang.String r2 = "viaduct"
            java.lang.String r2 = r7.getString(r2)     // Catch: java.lang.Exception -> L296
            if (r2 == 0) goto L296
            java.lang.String r3 = "RY"
            r3.equals(r2)     // Catch: java.lang.Exception -> L296
        L296:
            java.lang.String r2 = "cfms"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> L2a3
            if (r2 == 0) goto L2a3
            java.lang.String r2 = "cfms"
            r7.getJSONArray(r2)     // Catch: java.lang.Exception -> L2a3
        L2a3:
            java.lang.String r2 = "traf_ctrl_value"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> L378
            if (r2 == 0) goto L37d
            java.lang.String r2 = "traf_ctrl_value"
            org.json.JSONObject r2 = r7.optJSONObject(r2)     // Catch: java.lang.Exception -> L378
            java.lang.String r3 = "subway_switch"
            boolean r3 = r2.has(r3)     // Catch: java.lang.Exception -> L378
            if (r3 == 0) goto L2be
            java.lang.String r3 = "subway_switch"
            r2.optInt(r3)     // Catch: java.lang.Exception -> L378
        L2be:
            java.lang.String r3 = "subway_paramter"
            boolean r3 = r2.has(r3)     // Catch: java.lang.Exception -> L378
            if (r3 == 0) goto L2cb
            java.lang.String r3 = "subway_paramter"
            r2.optString(r3)     // Catch: java.lang.Exception -> L378
        L2cb:
            java.lang.String r3 = "sub_col_prob"
            boolean r3 = r2.has(r3)     // Catch: java.lang.Exception -> L378
            if (r3 == 0) goto L2e3
            java.lang.String r3 = "sub_col_prob"
            double r3 = r2.optDouble(r3)     // Catch: java.lang.Exception -> L378
            r1.C = r3     // Catch: java.lang.Exception -> L378
            java.util.Random r3 = new java.util.Random     // Catch: java.lang.Exception -> L378
            r3.<init>()     // Catch: java.lang.Exception -> L378
            r3.nextDouble()     // Catch: java.lang.Exception -> L378
        L2e3:
            java.lang.String r3 = "sub_col_onland"
            boolean r3 = r2.has(r3)     // Catch: java.lang.Exception -> L378
            if (r3 == 0) goto L2f0
            java.lang.String r3 = "sub_col_onland"
            r2.optInt(r3)     // Catch: java.lang.Exception -> L378
        L2f0:
            java.lang.String r3 = "press_col_switch"
            boolean r3 = r2.has(r3)     // Catch: java.lang.Exception -> L378
            if (r3 == 0) goto L2fd
            java.lang.String r3 = "press_col_switch"
            r2.optInt(r3)     // Catch: java.lang.Exception -> L378
        L2fd:
            java.lang.String r3 = "press_col_prob"
            boolean r3 = r2.has(r3)     // Catch: java.lang.Exception -> L378
            if (r3 == 0) goto L315
            java.lang.String r3 = "press_col_prob"
            double r3 = r2.optDouble(r3)     // Catch: java.lang.Exception -> L378
            r1.D = r3     // Catch: java.lang.Exception -> L378
            java.util.Random r3 = new java.util.Random     // Catch: java.lang.Exception -> L378
            r3.<init>()     // Catch: java.lang.Exception -> L378
            r3.nextDouble()     // Catch: java.lang.Exception -> L378
        L315:
            java.lang.String r3 = "traffic_switch"
            boolean r3 = r2.has(r3)     // Catch: java.lang.Exception -> L378
            if (r3 == 0) goto L322
            java.lang.String r3 = "traffic_switch"
            r2.optInt(r3)     // Catch: java.lang.Exception -> L378
        L322:
            java.lang.String r3 = "traffic_paramter"
            boolean r3 = r2.has(r3)     // Catch: java.lang.Exception -> L378
            if (r3 == 0) goto L32f
            java.lang.String r3 = "traffic_paramter"
            r2.optString(r3)     // Catch: java.lang.Exception -> L378
        L32f:
            java.lang.String r3 = "gps_checker_switch_android"
            boolean r3 = r2.has(r3)     // Catch: java.lang.Exception -> L378
            if (r3 == 0) goto L33f
            java.lang.String r3 = "gps_checker_switch_android"
            int r3 = r2.optInt(r3)     // Catch: java.lang.Exception -> L378
            r1.F = r3     // Catch: java.lang.Exception -> L378
        L33f:
            java.lang.String r3 = "gps_checker_params_android"
            boolean r3 = r2.has(r3)     // Catch: java.lang.Exception -> L378
            if (r3 == 0) goto L34f
            java.lang.String r3 = "gps_checker_params_android"
            java.lang.String r3 = r2.optString(r3)     // Catch: java.lang.Exception -> L378
            r1.G = r3     // Catch: java.lang.Exception -> L378
        L34f:
            java.lang.String r3 = "model"
            boolean r3 = r2.has(r3)     // Catch: java.lang.Exception -> L378
            if (r3 == 0) goto L37d
            java.lang.String r3 = "model"
            org.json.JSONArray r2 = r2.optJSONArray(r3)     // Catch: java.lang.Exception -> L378
            r3 = 0
        L35e:
            int r4 = r2.length()     // Catch: java.lang.Exception -> L378
            if (r3 >= r4) goto L37d
            org.json.JSONObject r4 = r2.optJSONObject(r3)     // Catch: java.lang.Exception -> L378
            java.lang.String r6 = "name"
            boolean r6 = r4.has(r6)     // Catch: java.lang.Exception -> L378
            if (r6 == 0) goto L375
            java.lang.String r6 = "name"
            r4.optString(r6)     // Catch: java.lang.Exception -> L378
        L375:
            int r3 = r3 + 1
            goto L35e
        L378:
            r0 = move-exception
            r2 = r0
            r2.printStackTrace()     // Catch: java.lang.Exception -> Lfb6
        L37d:
            java.lang.String r2 = "rpmp_indoor_model"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L38a
            java.lang.String r2 = "rpmp_indoor_model"
            r7.optString(r2)     // Catch: java.lang.Exception -> Lfb6
        L38a:
            java.lang.String r2 = "rpmp_indoor_md5"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L397
            java.lang.String r2 = "rpmp_indoor_md5"
            r7.optString(r2)     // Catch: java.lang.Exception -> Lfb6
        L397:
            java.lang.String r2 = "rpmp_indoor_ver"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L3a4
            java.lang.String r2 = "rpmp_indoor_ver"
            r7.optString(r2)     // Catch: java.lang.Exception -> Lfb6
        L3a4:
            java.lang.String r2 = "rpmp_indoor_switch"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L3b1
            java.lang.String r2 = "rpmp_indoor_switch"
            r7.optInt(r2)     // Catch: java.lang.Exception -> Lfb6
        L3b1:
            java.lang.String r2 = "ipbos"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L3be
            java.lang.String r2 = "ipbos"
            r7.optInt(r2)     // Catch: java.lang.Exception -> Lfb6
        L3be:
            java.lang.String r2 = "cell_scan_ver"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L3cb
            java.lang.String r2 = "cell_scan_ver"
            r7.optInt(r2)     // Catch: java.lang.Exception -> Lfb6
        L3cb:
            java.lang.String r2 = "tvurnd"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L3d8
            java.lang.String r2 = "tvurnd"
            r7.optInt(r2)     // Catch: java.lang.Exception -> Lfb6
        L3d8:
            java.lang.String r2 = "vo_t"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L3e5
            java.lang.String r2 = "vo_t"
            r7.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        L3e5:
            java.lang.String r2 = "vo_ep"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L3f2
            java.lang.String r2 = "vo_ep"
            r7.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        L3f2:
            java.lang.String r2 = "vo_sl"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L3ff
            java.lang.String r2 = "vo_sl"
            r7.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        L3ff:
            java.lang.String r2 = "nvso"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L40c
            java.lang.String r2 = "nvso"
            r7.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        L40c:
            java.lang.String r2 = "vo_d"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L419
            java.lang.String r2 = "vo_d"
            r7.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        L419:
            java.lang.String r2 = "grrct"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L428
            java.lang.String r2 = "grrct"
            r3 = 72
            r7.optInt(r2, r3)     // Catch: java.lang.Exception -> Lfb6
        L428:
            java.lang.String r2 = "vnrlon"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L435
            java.lang.String r2 = "vnrlon"
            r7.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        L435:
            java.lang.String r2 = "vlogon"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L442
            java.lang.String r2 = "vlogon"
            r7.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        L442:
            java.lang.String r2 = "vrtlog"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L44f
            java.lang.String r2 = "vrtlog"
            r7.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        L44f:
            java.lang.String r2 = "tbs"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L45c
            java.lang.String r2 = "tbs"
            r7.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        L45c:
            java.lang.String r2 = "rls"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L469
            java.lang.String r2 = "rls"
            r7.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        L469:
            java.lang.String r2 = "sdth"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L476
            java.lang.String r2 = "sdth"
            r7.getDouble(r2)     // Catch: java.lang.Exception -> Lfb6
        L476:
            java.lang.String r2 = "couth"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L483
            java.lang.String r2 = "couth"
            r7.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        L483:
            java.lang.String r2 = "accth"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L490
            java.lang.String r2 = "accth"
            r7.getDouble(r2)     // Catch: java.lang.Exception -> Lfb6
        L490:
            java.lang.String r2 = "lenth"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L49d
            java.lang.String r2 = "lenth"
            r7.getDouble(r2)     // Catch: java.lang.Exception -> Lfb6
        L49d:
            java.lang.String r2 = "seth"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L4aa
            java.lang.String r2 = "seth"
            r7.getDouble(r2)     // Catch: java.lang.Exception -> Lfb6
        L4aa:
            java.lang.String r2 = "vcso"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L4b7
            java.lang.String r2 = "vcso"
            r7.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        L4b7:
            java.lang.String r2 = "laeso"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L4c4
            java.lang.String r2 = "laeso"
            r7.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        L4c4:
            java.lang.String r2 = "vdro"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L4d1
            java.lang.String r2 = "vdro"
            r7.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        L4d1:
            java.lang.String r2 = "snco"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L4de
            java.lang.String r2 = "snco"
            r7.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        L4de:
            java.lang.String r2 = "vnmlo"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L4eb
            java.lang.String r2 = "vnmlo"
            r7.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        L4eb:
            java.lang.String r2 = "vtcrf"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L4f8
            java.lang.String r2 = "vtcrf"
            r7.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        L4f8:
            java.lang.String r2 = "vnsl"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L505
            java.lang.String r2 = "vnsl"
            r7.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        L505:
            java.lang.String r2 = "vt_max_drift"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L512
            java.lang.String r2 = "vt_max_drift"
            r7.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        L512:
            java.lang.String r2 = "wnsgrs"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L51f
            java.lang.String r2 = "wnsgrs"
            r7.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        L51f:
            java.lang.String r2 = "snct"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L52c
            java.lang.String r2 = "snct"
            r7.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        L52c:
            java.lang.String r2 = "vd_cross"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L539
            java.lang.String r2 = "vd_cross"
            r7.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        L539:
            java.lang.String r2 = "vpan"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L546
            java.lang.String r2 = "vpan"
            r7.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        L546:
            java.lang.String r2 = "yw"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L553
            java.lang.String r2 = "yw"
            r7.getDouble(r2)     // Catch: java.lang.Exception -> Lfb6
        L553:
            java.lang.String r2 = "yd1"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L560
            java.lang.String r2 = "yd1"
            r7.getDouble(r2)     // Catch: java.lang.Exception -> Lfb6
        L560:
            java.lang.String r2 = "yd2"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L56d
            java.lang.String r2 = "yd2"
            r7.getDouble(r2)     // Catch: java.lang.Exception -> Lfb6
        L56d:
            java.lang.String r2 = "yd3"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L57a
            java.lang.String r2 = "yd3"
            r7.getDouble(r2)     // Catch: java.lang.Exception -> Lfb6
        L57a:
            java.lang.String r2 = "yd4"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L587
            java.lang.String r2 = "yd4"
            r7.getDouble(r2)     // Catch: java.lang.Exception -> Lfb6
        L587:
            java.lang.String r2 = "yd5"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L594
            java.lang.String r2 = "yd5"
            r7.getDouble(r2)     // Catch: java.lang.Exception -> Lfb6
        L594:
            java.lang.String r2 = "yd6"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L5a1
            java.lang.String r2 = "yd6"
            r7.getDouble(r2)     // Catch: java.lang.Exception -> Lfb6
        L5a1:
            java.lang.String r2 = "yd7"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L5ae
            java.lang.String r2 = "yd7"
            r7.getDouble(r2)     // Catch: java.lang.Exception -> Lfb6
        L5ae:
            java.lang.String r2 = "yd8"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L5bb
            java.lang.String r2 = "yd8"
            r7.getDouble(r2)     // Catch: java.lang.Exception -> Lfb6
        L5bb:
            boolean r2 = r7.has(r14)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L5c4
            r7.getInt(r14)     // Catch: java.lang.Exception -> Lfb6
        L5c4:
            java.lang.String r2 = "vwnp"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L5d1
            java.lang.String r2 = "vwnp"
            r7.getDouble(r2)     // Catch: java.lang.Exception -> Lfb6
        L5d1:
            java.lang.String r2 = "vtpct"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L5de
            java.lang.String r2 = "vtpct"
            r7.getDouble(r2)     // Catch: java.lang.Exception -> Lfb6
        L5de:
            boolean r2 = r7.has(r13)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L5e7
            r7.getInt(r13)     // Catch: java.lang.Exception -> Lfb6
        L5e7:
            boolean r2 = r7.has(r12)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L5f0
            r7.getInt(r12)     // Catch: java.lang.Exception -> Lfb6
        L5f0:
            java.lang.String r2 = "vg"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L5fd
            java.lang.String r2 = "vg"
            r7.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        L5fd:
            boolean r2 = r7.has(r11)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L606
            r7.getInt(r11)     // Catch: java.lang.Exception -> Lfb6
        L606:
            java.lang.String r2 = "vnt1"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L613
            java.lang.String r2 = "vnt1"
            r7.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        L613:
            java.lang.String r2 = "vnt2"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L620
            java.lang.String r2 = "vnt2"
            r7.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        L620:
            java.lang.String r2 = "vndis"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L62d
            java.lang.String r2 = "vndis"
            r7.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        L62d:
            boolean r2 = r7.has(r10)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L636
            r7.getInt(r10)     // Catch: java.lang.Exception -> Lfb6
        L636:
            boolean r2 = r7.has(r9)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto L63f
            r7.getInt(r9)     // Catch: java.lang.Exception -> Lfb6
        L63f:
            r2 = r18
            boolean r3 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r3 == 0) goto L64a
            r7.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        L64a:
            r3 = r17
            boolean r4 = r7.has(r3)     // Catch: java.lang.Exception -> Lfb6
            if (r4 == 0) goto L655
            r7.getInt(r3)     // Catch: java.lang.Exception -> Lfb6
        L655:
            r4 = r16
            boolean r6 = r7.has(r4)     // Catch: java.lang.Exception -> Lfb6
            if (r6 == 0) goto L660
            r7.getInt(r4)     // Catch: java.lang.Exception -> Lfb6
        L660:
            r6 = r22
            boolean r16 = r7.has(r6)     // Catch: java.lang.Exception -> Lfb6
            if (r16 == 0) goto L66b
            r7.getInt(r6)     // Catch: java.lang.Exception -> Lfb6
        L66b:
            r22 = r6
            java.lang.String r6 = "gdco"
            boolean r6 = r7.has(r6)     // Catch: java.lang.Exception -> Lfb6
            if (r6 == 0) goto L67a
            java.lang.String r6 = "gdco"
            r7.getInt(r6)     // Catch: java.lang.Exception -> Lfb6
        L67a:
            java.lang.String r6 = "sopt"
            boolean r6 = r7.has(r6)     // Catch: java.lang.Exception -> Lfb6
            if (r6 == 0) goto L687
            java.lang.String r6 = "sopt"
            r7.getInt(r6)     // Catch: java.lang.Exception -> Lfb6
        L687:
            java.lang.String r6 = "vsd"
            boolean r6 = r7.has(r6)     // Catch: java.lang.Exception -> Lfb6
            if (r6 == 0) goto L694
            java.lang.String r6 = "vsd"
            r7.getInt(r6)     // Catch: java.lang.Exception -> Lfb6
        L694:
            java.lang.String r6 = "vtast"
            boolean r6 = r7.has(r6)     // Catch: java.lang.Exception -> Lfb6
            if (r6 == 0) goto L6a1
            java.lang.String r6 = "vtast"
            r7.getInt(r6)     // Catch: java.lang.Exception -> Lfb6
        L6a1:
            java.lang.String r6 = "otd"
            boolean r6 = r7.has(r6)     // Catch: java.lang.Exception -> Lfb6
            if (r6 == 0) goto L6ae
            java.lang.String r6 = "otd"
            r7.getInt(r6)     // Catch: java.lang.Exception -> Lfb6
        L6ae:
            java.lang.String r6 = "atrf"
            boolean r6 = r7.has(r6)     // Catch: java.lang.Exception -> Lfb6
            if (r6 == 0) goto L6bb
            java.lang.String r6 = "atrf"
            r7.getInt(r6)     // Catch: java.lang.Exception -> Lfb6
        L6bb:
            java.lang.String r6 = "mdin"
            boolean r6 = r7.has(r6)     // Catch: java.lang.Exception -> Lfb6
            if (r6 == 0) goto L6c8
            java.lang.String r6 = "mdin"
            r7.getInt(r6)     // Catch: java.lang.Exception -> Lfb6
        L6c8:
            java.lang.String r6 = "dmd"
            boolean r6 = r7.has(r6)     // Catch: java.lang.Exception -> Lfb6
            if (r6 == 0) goto L6d5
            java.lang.String r6 = "dmd"
            r7.getInt(r6)     // Catch: java.lang.Exception -> Lfb6
        L6d5:
            java.lang.String r6 = "tunnel_vl"
            boolean r6 = r7.has(r6)     // Catch: java.lang.Exception -> Lfb6
            if (r6 == 0) goto L6e2
            java.lang.String r6 = "tunnel_vl"
            r7.getDouble(r6)     // Catch: java.lang.Exception -> Lfb6
        L6e2:
            java.lang.String r6 = "vtarm"
            boolean r6 = r7.has(r6)     // Catch: java.lang.Exception -> Lfb6
            if (r6 == 0) goto L6ef
            java.lang.String r6 = "vtarm"
            r7.getDouble(r6)     // Catch: java.lang.Exception -> Lfb6
        L6ef:
            java.lang.String r6 = "pms"
            boolean r6 = r7.has(r6)     // Catch: java.lang.Exception -> Lfb6
            if (r6 == 0) goto L6fc
            java.lang.String r6 = "pms"
            r7.getInt(r6)     // Catch: java.lang.Exception -> Lfb6
        L6fc:
            java.lang.String r6 = "ipblo"
            boolean r6 = r7.has(r6)     // Catch: java.lang.Exception -> Lfb6
            if (r6 == 0) goto L709
            java.lang.String r6 = "ipblo"
            r7.getInt(r6)     // Catch: java.lang.Exception -> Lfb6
        L709:
            java.lang.String r6 = "ipbwn"
            boolean r6 = r7.has(r6)     // Catch: java.lang.Exception -> Lfb6
            if (r6 == 0) goto L716
            java.lang.String r6 = "ipbwn"
            r7.getInt(r6)     // Catch: java.lang.Exception -> Lfb6
        L716:
            java.lang.String r6 = "ipbdalp"
            boolean r6 = r7.has(r6)     // Catch: java.lang.Exception -> Lfb6
            if (r6 == 0) goto L723
            java.lang.String r6 = "ipbdalp"
            r7.getInt(r6)     // Catch: java.lang.Exception -> Lfb6
        L723:
            java.lang.String r6 = "ipbalp"
            boolean r6 = r7.has(r6)     // Catch: java.lang.Exception -> Lfb6
            if (r6 == 0) goto L730
            java.lang.String r6 = "ipbalp"
            r7.getDouble(r6)     // Catch: java.lang.Exception -> Lfb6
        L730:
            java.lang.String r6 = "ipbmt"
            boolean r6 = r7.has(r6)     // Catch: java.lang.Exception -> Lfb6
            if (r6 == 0) goto L73d
            java.lang.String r6 = "ipbmt"
            r7.getDouble(r6)     // Catch: java.lang.Exception -> Lfb6
        L73d:
            java.lang.String r6 = "ipbmth"
            boolean r6 = r7.has(r6)     // Catch: java.lang.Exception -> Lfb6
            if (r6 == 0) goto L74a
            java.lang.String r6 = "ipbmth"
            r7.getDouble(r6)     // Catch: java.lang.Exception -> Lfb6
        L74a:
            java.lang.String r6 = "ews"
            boolean r6 = r7.has(r6)     // Catch: java.lang.Exception -> Lfb6
            if (r6 == 0) goto L757
            java.lang.String r6 = "ews"
            r7.getInt(r6)     // Catch: java.lang.Exception -> Lfb6
        L757:
            java.lang.String r6 = "mds"
            boolean r6 = r7.has(r6)     // Catch: java.lang.Exception -> Lfb6
            if (r6 == 0) goto L764
            java.lang.String r6 = "mds"
            r7.getInt(r6)     // Catch: java.lang.Exception -> Lfb6
        L764:
            java.lang.String r6 = "nps"
            boolean r6 = r7.has(r6)     // Catch: java.lang.Exception -> Lfb6
            if (r6 == 0) goto L771
            java.lang.String r6 = "nps"
            r7.getInt(r6)     // Catch: java.lang.Exception -> Lfb6
        L771:
            java.lang.String r6 = "raws"
            boolean r6 = r7.has(r6)     // Catch: java.lang.Exception -> Lfb6
            if (r6 == 0) goto L77e
            java.lang.String r6 = "raws"
            r7.getInt(r6)     // Catch: java.lang.Exception -> Lfb6
        L77e:
            java.lang.String r6 = "rawp"
            boolean r6 = r7.has(r6)     // Catch: java.lang.Exception -> Lfb6
            if (r6 == 0) goto L78b
            java.lang.String r6 = "rawp"
            r7.optDouble(r6)     // Catch: java.lang.Exception -> L78b
        L78b:
            java.lang.String r6 = "tspp"
            boolean r6 = r7.has(r6)     // Catch: java.lang.Exception -> Lfb6
            if (r6 == 0) goto L79c
            java.lang.String r6 = "tspp"
            r16 = r4
            r4 = 0
            r7.optInt(r6, r4)     // Catch: java.lang.Exception -> L79e
            goto L79e
        L79c:
            r16 = r4
        L79e:
            java.lang.String r4 = "ircbms"
            boolean r4 = r7.has(r4)     // Catch: java.lang.Exception -> Lfb6
            if (r4 == 0) goto L7ac
            java.lang.String r4 = "ircbms"
            r6 = 0
            r7.optInt(r4, r6)     // Catch: java.lang.Exception -> L7ac
        L7ac:
            java.lang.String r4 = "dbds"
            boolean r4 = r7.has(r4)     // Catch: java.lang.Exception -> Lfb6
            if (r4 == 0) goto L7ba
            java.lang.String r4 = "dbds"
            r6 = -1
            r7.optInt(r4, r6)     // Catch: java.lang.Exception -> L7ba
        L7ba:
            java.lang.String r4 = "spic"
            boolean r4 = r7.has(r4)     // Catch: java.lang.Exception -> Lfb6
            if (r4 == 0) goto L7d2
            java.lang.String r4 = "spic"
            java.lang.String r6 = r1.I     // Catch: java.lang.Exception -> Lfb6
            java.lang.String r4 = r7.optString(r4, r6)     // Catch: java.lang.Exception -> Lfb6
            boolean r6 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> Lfb6
            if (r6 != 0) goto L7d2
            r1.I = r4     // Catch: java.lang.Exception -> Lfb6
        L7d2:
            java.lang.String r4 = "total_spic"
            boolean r4 = r7.has(r4)     // Catch: java.lang.Exception -> Lfb6
            if (r4 == 0) goto L7e0
            java.lang.String r4 = "total_spic"
            r6 = 0
            r7.optInt(r4, r6)     // Catch: java.lang.Exception -> L7e0
        L7e0:
            java.lang.String r4 = "total_spic_2"
            boolean r4 = r7.has(r4)     // Catch: java.lang.Exception -> Lfb6
            if (r4 == 0) goto L7ee
            java.lang.String r4 = "total_spic_2"
            r6 = 0
            r7.optInt(r4, r6)     // Catch: java.lang.Exception -> L7ee
        L7ee:
            java.lang.String r4 = "cfgs_params_mode0_new"
            boolean r4 = r7.has(r4)     // Catch: java.lang.Exception -> Lfb6
            if (r4 == 0) goto L82a
            java.lang.String r4 = "cfgs_params_mode0_new"
            java.lang.String r4 = r7.getString(r4)     // Catch: java.lang.Exception -> Lfb6
            boolean r6 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> Lfb6
            if (r6 != 0) goto L82a
            boolean r6 = r4.contains(r5)     // Catch: java.lang.Exception -> Lfb6
            if (r6 == 0) goto L82a
            java.lang.String[] r4 = r4.split(r8)     // Catch: java.lang.Exception -> Lfb6
            int r6 = r4.length     // Catch: java.lang.Exception -> Lfb6
            float[] r6 = new float[r6]     // Catch: java.lang.Exception -> Lfb6
            r1.p = r6     // Catch: java.lang.Exception -> Lfb6
            r17 = r3
            r6 = 0
        L814:
            int r3 = r4.length     // Catch: java.lang.Exception -> Lfb6
            if (r6 >= r3) goto L82f
            float[] r3 = r1.p     // Catch: java.lang.NumberFormatException -> L822 java.lang.Exception -> Lfb6
            r18 = r4[r6]     // Catch: java.lang.NumberFormatException -> L822 java.lang.Exception -> Lfb6
            float r18 = java.lang.Float.parseFloat(r18)     // Catch: java.lang.NumberFormatException -> L822 java.lang.Exception -> Lfb6
            r3[r6] = r18     // Catch: java.lang.NumberFormatException -> L822 java.lang.Exception -> Lfb6
            goto L827
        L822:
            r0 = move-exception
            r3 = r0
            r3.printStackTrace()     // Catch: java.lang.Exception -> Lfb6
        L827:
            int r6 = r6 + 1
            goto L814
        L82a:
            r17 = r3
            r21.b()     // Catch: java.lang.Exception -> Lfb6
        L82f:
            java.lang.String r3 = "cfgs_params_mode1"
            boolean r3 = r7.has(r3)     // Catch: java.lang.Exception -> Lfb6
            if (r3 == 0) goto L869
            java.lang.String r3 = "cfgs_params_mode1"
            java.lang.String r3 = r7.getString(r3)     // Catch: java.lang.Exception -> Lfb6
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> Lfb6
            if (r4 != 0) goto L869
            boolean r4 = r3.contains(r5)     // Catch: java.lang.Exception -> Lfb6
            if (r4 == 0) goto L869
            java.lang.String[] r3 = r3.split(r8)     // Catch: java.lang.Exception -> Lfb6
            int r4 = r3.length     // Catch: java.lang.Exception -> Lfb6
            float[] r4 = new float[r4]     // Catch: java.lang.Exception -> Lfb6
            r1.q = r4     // Catch: java.lang.Exception -> Lfb6
            r4 = 0
        L853:
            int r6 = r3.length     // Catch: java.lang.Exception -> Lfb6
            if (r4 >= r6) goto L86c
            float[] r6 = r1.q     // Catch: java.lang.NumberFormatException -> L861 java.lang.Exception -> Lfb6
            r18 = r3[r4]     // Catch: java.lang.NumberFormatException -> L861 java.lang.Exception -> Lfb6
            float r18 = java.lang.Float.parseFloat(r18)     // Catch: java.lang.NumberFormatException -> L861 java.lang.Exception -> Lfb6
            r6[r4] = r18     // Catch: java.lang.NumberFormatException -> L861 java.lang.Exception -> Lfb6
            goto L866
        L861:
            r0 = move-exception
            r6 = r0
            r6.printStackTrace()     // Catch: java.lang.Exception -> Lfb6
        L866:
            int r4 = r4 + 1
            goto L853
        L869:
            r21.c()     // Catch: java.lang.Exception -> Lfb6
        L86c:
            java.lang.String r3 = "cfgs_params_mode2"
            boolean r3 = r7.has(r3)     // Catch: java.lang.Exception -> Lfb6
            if (r3 == 0) goto L8a6
            java.lang.String r3 = "cfgs_params_mode2"
            java.lang.String r3 = r7.getString(r3)     // Catch: java.lang.Exception -> Lfb6
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> Lfb6
            if (r4 != 0) goto L8a6
            boolean r4 = r3.contains(r5)     // Catch: java.lang.Exception -> Lfb6
            if (r4 == 0) goto L8a6
            java.lang.String[] r3 = r3.split(r8)     // Catch: java.lang.Exception -> Lfb6
            int r4 = r3.length     // Catch: java.lang.Exception -> Lfb6
            float[] r4 = new float[r4]     // Catch: java.lang.Exception -> Lfb6
            r1.r = r4     // Catch: java.lang.Exception -> Lfb6
            r4 = 0
        L890:
            int r6 = r3.length     // Catch: java.lang.Exception -> Lfb6
            if (r4 >= r6) goto L8a9
            float[] r6 = r1.r     // Catch: java.lang.NumberFormatException -> L89e java.lang.Exception -> Lfb6
            r18 = r3[r4]     // Catch: java.lang.NumberFormatException -> L89e java.lang.Exception -> Lfb6
            float r18 = java.lang.Float.parseFloat(r18)     // Catch: java.lang.NumberFormatException -> L89e java.lang.Exception -> Lfb6
            r6[r4] = r18     // Catch: java.lang.NumberFormatException -> L89e java.lang.Exception -> Lfb6
            goto L8a3
        L89e:
            r0 = move-exception
            r6 = r0
            r6.printStackTrace()     // Catch: java.lang.Exception -> Lfb6
        L8a3:
            int r4 = r4 + 1
            goto L890
        L8a6:
            r21.d()     // Catch: java.lang.Exception -> Lfb6
        L8a9:
            java.lang.String r3 = "cfgs_params_mode4"
            boolean r3 = r7.has(r3)     // Catch: java.lang.Exception -> Lfb6
            if (r3 == 0) goto L8e3
            java.lang.String r3 = "cfgs_params_mode4"
            java.lang.String r3 = r7.getString(r3)     // Catch: java.lang.Exception -> Lfb6
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> Lfb6
            if (r4 != 0) goto L8e3
            boolean r4 = r3.contains(r5)     // Catch: java.lang.Exception -> Lfb6
            if (r4 == 0) goto L8e3
            java.lang.String[] r3 = r3.split(r8)     // Catch: java.lang.Exception -> Lfb6
            int r4 = r3.length     // Catch: java.lang.Exception -> Lfb6
            float[] r4 = new float[r4]     // Catch: java.lang.Exception -> Lfb6
            r1.s = r4     // Catch: java.lang.Exception -> Lfb6
            r4 = 0
        L8cd:
            int r6 = r3.length     // Catch: java.lang.Exception -> Lfb6
            if (r4 >= r6) goto L8e6
            float[] r6 = r1.s     // Catch: java.lang.NumberFormatException -> L8db java.lang.Exception -> Lfb6
            r18 = r3[r4]     // Catch: java.lang.NumberFormatException -> L8db java.lang.Exception -> Lfb6
            float r18 = java.lang.Float.parseFloat(r18)     // Catch: java.lang.NumberFormatException -> L8db java.lang.Exception -> Lfb6
            r6[r4] = r18     // Catch: java.lang.NumberFormatException -> L8db java.lang.Exception -> Lfb6
            goto L8e0
        L8db:
            r0 = move-exception
            r6 = r0
            r6.printStackTrace()     // Catch: java.lang.Exception -> Lfb6
        L8e0:
            int r4 = r4 + 1
            goto L8cd
        L8e3:
            r21.g()     // Catch: java.lang.Exception -> Lfb6
        L8e6:
            java.lang.String r3 = "cfgs_params_mode5"
            boolean r3 = r7.has(r3)     // Catch: java.lang.Exception -> Lfb6
            if (r3 == 0) goto L920
            java.lang.String r3 = "cfgs_params_mode5"
            java.lang.String r3 = r7.getString(r3)     // Catch: java.lang.Exception -> Lfb6
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> Lfb6
            if (r4 != 0) goto L920
            boolean r4 = r3.contains(r5)     // Catch: java.lang.Exception -> Lfb6
            if (r4 == 0) goto L920
            java.lang.String[] r3 = r3.split(r8)     // Catch: java.lang.Exception -> Lfb6
            int r4 = r3.length     // Catch: java.lang.Exception -> Lfb6
            float[] r4 = new float[r4]     // Catch: java.lang.Exception -> Lfb6
            r1.t = r4     // Catch: java.lang.Exception -> Lfb6
            r4 = 0
        L90a:
            int r6 = r3.length     // Catch: java.lang.Exception -> Lfb6
            if (r4 >= r6) goto L923
            float[] r6 = r1.t     // Catch: java.lang.NumberFormatException -> L918 java.lang.Exception -> Lfb6
            r18 = r3[r4]     // Catch: java.lang.NumberFormatException -> L918 java.lang.Exception -> Lfb6
            float r18 = java.lang.Float.parseFloat(r18)     // Catch: java.lang.NumberFormatException -> L918 java.lang.Exception -> Lfb6
            r6[r4] = r18     // Catch: java.lang.NumberFormatException -> L918 java.lang.Exception -> Lfb6
            goto L91d
        L918:
            r0 = move-exception
            r6 = r0
            r6.printStackTrace()     // Catch: java.lang.Exception -> Lfb6
        L91d:
            int r4 = r4 + 1
            goto L90a
        L920:
            r21.e()     // Catch: java.lang.Exception -> Lfb6
        L923:
            java.lang.String r3 = "cfgs_params_mode6"
            boolean r3 = r7.has(r3)     // Catch: java.lang.Exception -> Lfb6
            if (r3 == 0) goto L95d
            java.lang.String r3 = "cfgs_params_mode6"
            java.lang.String r3 = r7.getString(r3)     // Catch: java.lang.Exception -> Lfb6
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> Lfb6
            if (r4 != 0) goto L95d
            boolean r4 = r3.contains(r5)     // Catch: java.lang.Exception -> Lfb6
            if (r4 == 0) goto L95d
            java.lang.String[] r3 = r3.split(r8)     // Catch: java.lang.Exception -> Lfb6
            int r4 = r3.length     // Catch: java.lang.Exception -> Lfb6
            float[] r4 = new float[r4]     // Catch: java.lang.Exception -> Lfb6
            r1.u = r4     // Catch: java.lang.Exception -> Lfb6
            r4 = 0
        L947:
            int r5 = r3.length     // Catch: java.lang.Exception -> Lfb6
            if (r4 >= r5) goto L960
            float[] r5 = r1.u     // Catch: java.lang.NumberFormatException -> L955 java.lang.Exception -> Lfb6
            r6 = r3[r4]     // Catch: java.lang.NumberFormatException -> L955 java.lang.Exception -> Lfb6
            float r6 = java.lang.Float.parseFloat(r6)     // Catch: java.lang.NumberFormatException -> L955 java.lang.Exception -> Lfb6
            r5[r4] = r6     // Catch: java.lang.NumberFormatException -> L955 java.lang.Exception -> Lfb6
            goto L95a
        L955:
            r0 = move-exception
            r5 = r0
            r5.printStackTrace()     // Catch: java.lang.Exception -> Lfb6
        L95a:
            int r4 = r4 + 1
            goto L947
        L95d:
            r21.f()     // Catch: java.lang.Exception -> Lfb6
        L960:
            java.lang.String r3 = "vsc"
            boolean r3 = r7.has(r3)     // Catch: java.lang.Exception -> Lfb6
            if (r3 == 0) goto L9a7
            java.lang.String r3 = "vsc"
            java.lang.String r3 = r7.getString(r3)     // Catch: java.lang.Exception -> Lfb6
            if (r3 == 0) goto L9a7
            boolean r4 = r3.contains(r15)     // Catch: java.lang.Exception -> Lfb6
            if (r4 == 0) goto L9a7
            java.lang.String[] r3 = r3.split(r15)     // Catch: java.lang.Exception -> Lfb6
            int r4 = r3.length     // Catch: java.lang.Exception -> Lfb6
            int[] r4 = new int[r4]     // Catch: java.lang.Exception -> Lfb6
            r1.m = r4     // Catch: java.lang.Exception -> Lfb6
            int r4 = r3.length     // Catch: java.lang.Exception -> Lfb6
            r5 = 0
            r6 = 0
        L982:
            if (r5 >= r4) goto L9a7
            r18 = r3[r5]     // Catch: java.lang.Exception -> Lfb6
            r20 = r3
            int[] r3 = r1.m     // Catch: java.lang.Exception -> Lfb6
            r19 = 0
            r3[r6] = r19     // Catch: java.lang.Exception -> Lfb6
            int r3 = r18.length()     // Catch: java.lang.Exception -> Lfb6
            if (r3 <= 0) goto L9a0
            int[] r3 = r1.m     // Catch: java.lang.Throwable -> L9a0
            java.lang.Integer r18 = java.lang.Integer.valueOf(r18)     // Catch: java.lang.Throwable -> L9a0
            int r18 = r18.intValue()     // Catch: java.lang.Throwable -> L9a0
            r3[r6] = r18     // Catch: java.lang.Throwable -> L9a0
        L9a0:
            int r6 = r6 + 1
            int r5 = r5 + 1
            r3 = r20
            goto L982
        L9a7:
            java.lang.String r3 = "d"
            boolean r3 = r7.has(r3)     // Catch: java.lang.Exception -> Lfb6
            if (r3 == 0) goto La15
            java.lang.String r3 = "d"
            org.json.JSONObject r3 = r7.getJSONObject(r3)     // Catch: java.lang.Exception -> Lfb6
            boolean r4 = r3.has(r14)     // Catch: java.lang.Exception -> Lfb6
            if (r4 == 0) goto L9be
            r3.getInt(r14)     // Catch: java.lang.Exception -> Lfb6
        L9be:
            boolean r4 = r3.has(r13)     // Catch: java.lang.Exception -> Lfb6
            if (r4 == 0) goto L9c7
            r3.getInt(r13)     // Catch: java.lang.Exception -> Lfb6
        L9c7:
            boolean r4 = r3.has(r12)     // Catch: java.lang.Exception -> Lfb6
            if (r4 == 0) goto L9d0
            r3.getInt(r12)     // Catch: java.lang.Exception -> Lfb6
        L9d0:
            boolean r4 = r3.has(r11)     // Catch: java.lang.Exception -> Lfb6
            if (r4 == 0) goto L9d9
            r3.getInt(r11)     // Catch: java.lang.Exception -> Lfb6
        L9d9:
            boolean r4 = r3.has(r10)     // Catch: java.lang.Exception -> Lfb6
            if (r4 == 0) goto L9e2
            r3.getInt(r10)     // Catch: java.lang.Exception -> Lfb6
        L9e2:
            boolean r4 = r3.has(r9)     // Catch: java.lang.Exception -> Lfb6
            if (r4 == 0) goto L9eb
            r3.getInt(r9)     // Catch: java.lang.Exception -> Lfb6
        L9eb:
            boolean r4 = r3.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r4 == 0) goto L9f4
            r3.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        L9f4:
            r2 = r17
            boolean r4 = r3.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r4 == 0) goto L9ff
            r3.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        L9ff:
            r2 = r16
            boolean r4 = r3.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r4 == 0) goto La0a
            r3.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        La0a:
            r2 = r22
            boolean r4 = r3.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r4 == 0) goto La15
            r3.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        La15:
            java.lang.String r2 = "ao"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto La8b
            java.lang.String r2 = "ao"
            org.json.JSONObject r2 = r7.getJSONObject(r2)     // Catch: java.lang.Exception -> Lfb6
            java.lang.String r3 = "rn0"
            boolean r3 = r2.has(r3)     // Catch: java.lang.Exception -> Lfb6
            if (r3 == 0) goto La30
            java.lang.String r3 = "rn0"
            r2.getDouble(r3)     // Catch: java.lang.Exception -> Lfb6
        La30:
            java.lang.String r3 = "rn1"
            boolean r3 = r2.has(r3)     // Catch: java.lang.Exception -> Lfb6
            if (r3 == 0) goto La3d
            java.lang.String r3 = "rn1"
            r2.getDouble(r3)     // Catch: java.lang.Exception -> Lfb6
        La3d:
            java.lang.String r3 = "rn2"
            boolean r3 = r2.has(r3)     // Catch: java.lang.Exception -> Lfb6
            if (r3 == 0) goto La4a
            java.lang.String r3 = "rn2"
            r2.getDouble(r3)     // Catch: java.lang.Exception -> Lfb6
        La4a:
            java.lang.String r3 = "rv0"
            boolean r3 = r2.has(r3)     // Catch: java.lang.Exception -> Lfb6
            if (r3 == 0) goto La57
            java.lang.String r3 = "rv0"
            r2.getDouble(r3)     // Catch: java.lang.Exception -> Lfb6
        La57:
            java.lang.String r3 = "rv1"
            boolean r3 = r2.has(r3)     // Catch: java.lang.Exception -> Lfb6
            if (r3 == 0) goto La64
            java.lang.String r3 = "rv1"
            r2.getDouble(r3)     // Catch: java.lang.Exception -> Lfb6
        La64:
            java.lang.String r3 = "rv2"
            boolean r3 = r2.has(r3)     // Catch: java.lang.Exception -> Lfb6
            if (r3 == 0) goto La71
            java.lang.String r3 = "rv2"
            r2.getDouble(r3)     // Catch: java.lang.Exception -> Lfb6
        La71:
            java.lang.String r3 = "rvb"
            boolean r3 = r2.has(r3)     // Catch: java.lang.Exception -> Lfb6
            if (r3 == 0) goto La7e
            java.lang.String r3 = "rvb"
            r2.getDouble(r3)     // Catch: java.lang.Exception -> Lfb6
        La7e:
            java.lang.String r3 = "swt"
            boolean r3 = r2.has(r3)     // Catch: java.lang.Exception -> Lfb6
            if (r3 == 0) goto La8b
            java.lang.String r3 = "swt"
            r2.getInt(r3)     // Catch: java.lang.Exception -> Lfb6
        La8b:
            java.lang.String r2 = "vcr"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto La98
            java.lang.String r2 = "vcr"
            r7.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        La98:
            java.lang.String r2 = "vgrids"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Lafe
            java.lang.String r2 = "vgrids"
            org.json.JSONArray r2 = r7.getJSONArray(r2)     // Catch: java.lang.Exception -> Laf9
            int r3 = r2.length()     // Catch: java.lang.Exception -> Laf9
            r4 = 0
        Laab:
            if (r4 >= r3) goto Lafe
            java.lang.String r5 = r2.getString(r4)     // Catch: java.lang.Exception -> Laf9
            java.lang.String[] r5 = r5.split(r15)     // Catch: java.lang.Exception -> Laf9
            int r6 = r5.length     // Catch: java.lang.Exception -> Laf9
            r9 = 4
            if (r6 != r9) goto Laf6
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Exception -> Laf9
            r6.<init>()     // Catch: java.lang.Exception -> Laf9
            r9 = 0
            r10 = r5[r9]     // Catch: java.lang.Exception -> Laf9
            java.lang.Float r9 = java.lang.Float.valueOf(r10)     // Catch: java.lang.Exception -> Laf9
            r6.add(r9)     // Catch: java.lang.Exception -> Laf9
            r9 = 1
            r10 = r5[r9]     // Catch: java.lang.Exception -> Laf9
            java.lang.Float r9 = java.lang.Float.valueOf(r10)     // Catch: java.lang.Exception -> Laf9
            r6.add(r9)     // Catch: java.lang.Exception -> Laf9
            r9 = 2
            r10 = r5[r9]     // Catch: java.lang.Exception -> Laf9
            java.lang.Float r9 = java.lang.Float.valueOf(r10)     // Catch: java.lang.Exception -> Laf9
            r6.add(r9)     // Catch: java.lang.Exception -> Laf9
            r9 = 3
            r5 = r5[r9]     // Catch: java.lang.Exception -> Laf9
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch: java.lang.Exception -> Laf9
            r6.add(r5)     // Catch: java.lang.Exception -> Laf9
            java.util.ArrayList<java.util.ArrayList<java.lang.Float>> r5 = r1.v     // Catch: java.lang.Exception -> Laf9
            if (r5 != 0) goto Laf1
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Exception -> Laf9
            r5.<init>()     // Catch: java.lang.Exception -> Laf9
            r1.v = r5     // Catch: java.lang.Exception -> Laf9
        Laf1:
            java.util.ArrayList<java.util.ArrayList<java.lang.Float>> r5 = r1.v     // Catch: java.lang.Exception -> Laf9
            r5.add(r6)     // Catch: java.lang.Exception -> Laf9
        Laf6:
            int r4 = r4 + 1
            goto Laab
        Laf9:
            r0 = move-exception
            r2 = r0
            r2.printStackTrace()     // Catch: java.lang.Exception -> Lfb6
        Lafe:
            java.lang.String r2 = "net_vdr_polygon"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Ld70
            java.lang.String r2 = "net_vdr_polygon"
            org.json.JSONArray r2 = r7.getJSONArray(r2)     // Catch: java.lang.Exception -> Lb85
            int r3 = r2.length()     // Catch: java.lang.Exception -> Lb85
            r4 = 0
        Lb11:
            if (r4 >= r3) goto Lb8a
            org.json.JSONObject r5 = r2.getJSONObject(r4)     // Catch: java.lang.Exception -> Lb85
            if (r5 == 0) goto Lb82
            java.lang.String r6 = "x1"
            boolean r6 = r5.has(r6)     // Catch: java.lang.Exception -> Lb85
            if (r6 == 0) goto Lb82
            java.lang.String r6 = "x2"
            boolean r6 = r5.has(r6)     // Catch: java.lang.Exception -> Lb85
            if (r6 == 0) goto Lb82
            java.lang.String r6 = "y1"
            boolean r6 = r5.has(r6)     // Catch: java.lang.Exception -> Lb85
            if (r6 == 0) goto Lb82
            java.lang.String r6 = "y2"
            boolean r6 = r5.has(r6)     // Catch: java.lang.Exception -> Lb85
            if (r6 == 0) goto Lb82
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lb85
            r6.<init>()     // Catch: java.lang.Exception -> Lb85
            java.lang.String r9 = "x1"
            double r9 = r5.getDouble(r9)     // Catch: java.lang.Exception -> Lb85
            java.lang.Double r9 = java.lang.Double.valueOf(r9)     // Catch: java.lang.Exception -> Lb85
            r6.add(r9)     // Catch: java.lang.Exception -> Lb85
            java.lang.String r9 = "y1"
            double r9 = r5.getDouble(r9)     // Catch: java.lang.Exception -> Lb85
            java.lang.Double r9 = java.lang.Double.valueOf(r9)     // Catch: java.lang.Exception -> Lb85
            r6.add(r9)     // Catch: java.lang.Exception -> Lb85
            java.lang.String r9 = "x2"
            double r9 = r5.getDouble(r9)     // Catch: java.lang.Exception -> Lb85
            java.lang.Double r9 = java.lang.Double.valueOf(r9)     // Catch: java.lang.Exception -> Lb85
            r6.add(r9)     // Catch: java.lang.Exception -> Lb85
            java.lang.String r9 = "y2"
            double r9 = r5.getDouble(r9)     // Catch: java.lang.Exception -> Lb85
            java.lang.Double r5 = java.lang.Double.valueOf(r9)     // Catch: java.lang.Exception -> Lb85
            r6.add(r5)     // Catch: java.lang.Exception -> Lb85
            java.util.ArrayList<java.util.ArrayList<java.lang.Double>> r5 = r1.w     // Catch: java.lang.Exception -> Lb85
            if (r5 != 0) goto Lb7d
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lb85
            r5.<init>()     // Catch: java.lang.Exception -> Lb85
            r1.w = r5     // Catch: java.lang.Exception -> Lb85
        Lb7d:
            java.util.ArrayList<java.util.ArrayList<java.lang.Double>> r5 = r1.w     // Catch: java.lang.Exception -> Lb85
            r5.add(r6)     // Catch: java.lang.Exception -> Lb85
        Lb82:
            int r4 = r4 + 1
            goto Lb11
        Lb85:
            r0 = move-exception
            r2 = r0
            r2.printStackTrace()     // Catch: java.lang.Exception -> Lfb6
        Lb8a:
            java.lang.String r2 = "pps"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Lb97
            java.lang.String r2 = "pps"
            r7.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        Lb97:
            java.lang.String r2 = "ppsw"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Lba4
            java.lang.String r2 = "ppsw"
            r7.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        Lba4:
            java.lang.String r2 = "ppsv"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Lbb1
            java.lang.String r2 = "ppsv"
            r7.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        Lbb1:
            java.lang.String r2 = "ppsmt"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Lbbe
            java.lang.String r2 = "ppsmt"
            r7.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        Lbbe:
            java.lang.String r2 = "ppst"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Lbcb
            java.lang.String r2 = "ppst"
            r7.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        Lbcb:
            java.lang.String r2 = "spef"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Lbd8
            java.lang.String r2 = "spef"
            r7.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        Lbd8:
            java.lang.String r2 = "ppsut"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Lbe5
            java.lang.String r2 = "ppsut"
            r7.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        Lbe5:
            java.lang.String r2 = "csps"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Lbf2
            java.lang.String r2 = "csps"
            r7.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        Lbf2:
            java.lang.String r2 = "cspd"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Lbff
            java.lang.String r2 = "cspd"
            r7.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        Lbff:
            java.lang.String r2 = "cspr"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Lc0c
            java.lang.String r2 = "cspr"
            r7.getDouble(r2)     // Catch: java.lang.Exception -> Lfb6
        Lc0c:
            java.lang.String r2 = "ntb"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Lc19
            java.lang.String r2 = "ntb"
            r7.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        Lc19:
            java.lang.String r2 = "hcs"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Lc26
            java.lang.String r2 = "hcs"
            r7.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        Lc26:
            java.lang.String r2 = "hss"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Lc33
            java.lang.String r2 = "hss"
            r7.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        Lc33:
            java.lang.String r2 = "drs"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Lc40
            java.lang.String r2 = "drs"
            r7.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        Lc40:
            java.lang.String r2 = "rfdd"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Lc4d
            java.lang.String r2 = "rfdd"
            r7.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        Lc4d:
            java.lang.String r2 = "ncls"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Lc5a
            java.lang.String r2 = "ncls"
            r7.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        Lc5a:
            java.lang.String r2 = "nclw"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Lc67
            java.lang.String r2 = "nclw"
            r7.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        Lc67:
            java.lang.String r2 = "nvwst"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Lc74
            java.lang.String r2 = "nvwst"
            r7.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        Lc74:
            java.lang.String r2 = "ctz"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Lc81
            java.lang.String r2 = "ctz"
            r7.getDouble(r2)     // Catch: java.lang.Exception -> Lfb6
        Lc81:
            java.lang.String r2 = "cdt"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Lc8e
            java.lang.String r2 = "cdt"
            r7.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        Lc8e:
            java.lang.String r2 = "ccfb"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Lc9b
            java.lang.String r2 = "ccfb"
            r7.getInt(r2)     // Catch: java.lang.Exception -> Lfb6
        Lc9b:
            java.lang.String r2 = "epoch_switch"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Lca9
            java.lang.String r2 = "epoch_switch"
            r3 = 0
            r7.optInt(r2, r3)     // Catch: java.lang.Exception -> Lfb6
        Lca9:
            java.lang.String r2 = "epoch_to"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Lcb8
            java.lang.String r2 = "epoch_to"
            r3 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r7.optDouble(r2, r3)     // Catch: java.lang.Exception -> Lfb6
        Lcb8:
            java.lang.String r2 = "cl_list_switch"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Lcc9
            java.lang.String r2 = "cl_list_switch"
            r3 = 0
            int r2 = r7.optInt(r2, r3)     // Catch: java.lang.Exception -> Lfb6
            r1.H = r2     // Catch: java.lang.Exception -> Lfb6
        Lcc9:
            java.lang.String r2 = "cell_number"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Lcd8
            java.lang.String r2 = "cell_number"
            r3 = 10
            r7.optInt(r2, r3)     // Catch: java.lang.Exception -> Lfb6
        Lcd8:
            java.lang.String r2 = "loc_str_length"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Lce7
            java.lang.String r2 = "loc_str_length"
            r3 = 4000(0xfa0, float:5.605E-42)
            r7.optInt(r2, r3)     // Catch: java.lang.Exception -> Lfb6
        Lce7:
            java.lang.String r2 = "hrck"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Lcf4
            java.lang.String r2 = "hrck"
            r7.getString(r2)     // Catch: java.lang.Exception -> Lfb6
        Lcf4:
            java.lang.String r2 = "hmsk"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Ld01
            java.lang.String r2 = "hmsk"
            r7.getString(r2)     // Catch: java.lang.Exception -> Lfb6
        Ld01:
            java.lang.String r2 = "rmsk"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Ld0e
            java.lang.String r2 = "rmsk"
            r7.getString(r2)     // Catch: java.lang.Exception -> Lfb6
        Ld0e:
            java.lang.String r2 = "hpstdk"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Ld1b
            java.lang.String r2 = "hpstdk"
            r7.getString(r2)     // Catch: java.lang.Exception -> Lfb6
        Ld1b:
            java.lang.String r2 = "doubt_loc_switch"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Ld29
            java.lang.String r2 = "doubt_loc_switch"
            r3 = 0
            r7.optInt(r2, r3)     // Catch: java.lang.Exception -> Lfb6
        Ld29:
            java.lang.String r2 = "doubt_loc_time"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Ld38
            java.lang.String r2 = "doubt_loc_time"
            r3 = 3600(0xe10, float:5.045E-42)
            r7.optInt(r2, r3)     // Catch: java.lang.Exception -> Lfb6
        Ld38:
            java.lang.String r2 = "gps_pre_switch"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Ld46
            java.lang.String r2 = "gps_pre_switch"
            r3 = 1
            r7.optInt(r2, r3)     // Catch: java.lang.Exception -> Lfb6
        Ld46:
            java.lang.String r2 = "net_pre_switch"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Ld54
            java.lang.String r2 = "net_pre_switch"
            r3 = 1
            r7.optInt(r2, r3)     // Catch: java.lang.Exception -> Lfb6
        Ld54:
            java.lang.String r2 = "gps_pre_length"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Ld62
            java.lang.String r2 = "gps_pre_length"
            r3 = 5
            r7.optInt(r2, r3)     // Catch: java.lang.Exception -> Lfb6
        Ld62:
            java.lang.String r2 = "net_pre_length"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Ld70
            java.lang.String r2 = "net_pre_length"
            r3 = 5
            r7.optInt(r2, r3)     // Catch: java.lang.Exception -> Lfb6
        Ld70:
            java.lang.String r2 = "iblqp"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Ld98
            if (r2 == 0) goto Ld98
            java.lang.String r2 = "iblqp"
            java.lang.String r2 = r7.optString(r2)     // Catch: java.lang.Exception -> Ld98
            java.lang.String[] r2 = r2.split(r15)     // Catch: java.lang.Exception -> Ld98
            int r3 = r2.length     // Catch: java.lang.Exception -> Ld98
            r4 = 3
            if (r3 < r4) goto Ld98
            r3 = 0
            r4 = r2[r3]     // Catch: java.lang.Exception -> Ld98
            java.lang.Integer.parseInt(r4)     // Catch: java.lang.Exception -> Ld98
            r3 = 1
            r4 = r2[r3]     // Catch: java.lang.Exception -> Ld98
            java.lang.Integer.parseInt(r4)     // Catch: java.lang.Exception -> Ld98
            r3 = 2
            r2 = r2[r3]     // Catch: java.lang.Exception -> Ld98
            java.lang.Integer.parseInt(r2)     // Catch: java.lang.Exception -> Ld98
        Ld98:
            java.lang.String r2 = "miytp"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Lda5
            java.lang.String r2 = "miytp"
            r7.optInt(r2)     // Catch: java.lang.Exception -> Lfb6
        Lda5:
            java.lang.String r2 = "itptn"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Ldb2
            java.lang.String r2 = "itptn "
            r7.optInt(r2)     // Catch: java.lang.Exception -> Lfb6
        Ldb2:
            java.lang.String r2 = "new_cl_scan_switch"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Ldc0
            java.lang.String r2 = "new_cl_scan_switch"
            r3 = 1
            r7.optInt(r2, r3)     // Catch: java.lang.Exception -> Lfb6
        Ldc0:
            java.lang.String r2 = "new_cl_scan_time"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Ldcf
            java.lang.String r2 = "new_cl_scan_time"
            r3 = 100
            r7.optInt(r2, r3)     // Catch: java.lang.Exception -> Lfb6
        Ldcf:
            java.lang.String r2 = "click_nlp_switch"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Lddd
            java.lang.String r2 = "click_nlp_switch"
            r3 = 0
            r7.optInt(r2, r3)     // Catch: java.lang.Exception -> Lfb6
        Lddd:
            java.lang.String r2 = "irgs"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Ldea
            java.lang.String r2 = "irgs"
            r7.optDouble(r2)     // Catch: java.lang.Exception -> Lfb6
        Ldea:
            java.lang.String r2 = "pdr_indoor_switch"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Ldf8
            java.lang.String r2 = "pdr_indoor_switch"
            r3 = 0
            r7.optInt(r2, r3)     // Catch: java.lang.Exception -> Lfb6
        Ldf8:
            java.lang.String r2 = "ilprs"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Le05
            java.lang.String r2 = "ilprs"
            r7.optInt(r2)     // Catch: java.lang.Exception -> Lfb6
        Le05:
            java.lang.String r2 = "cell_scan_time"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Le14
            java.lang.String r2 = "cell_scan_time"
            r3 = 30000(0x7530, double:1.4822E-319)
            r7.optLong(r2, r3)     // Catch: java.lang.Exception -> Lfb6
        Le14:
            java.lang.String r2 = "tunnel_mobile_switch"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Le22
            java.lang.String r2 = "tunnel_mobile_switch"
            r3 = 0
            r7.optInt(r2, r3)     // Catch: java.lang.Exception -> Lfb6
        Le22:
            java.lang.String r2 = "new_loc_cache_switch"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Le30
            java.lang.String r2 = "new_loc_cache_switch"
            r3 = 1
            r7.optInt(r2, r3)     // Catch: java.lang.Exception -> Lfb6
        Le30:
            java.lang.String r2 = "nc_same_rate"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Le42
            java.lang.String r2 = "nc_same_rate"
            r3 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            r7.optDouble(r2, r3)     // Catch: java.lang.Exception -> Lfb6
        Le42:
            java.lang.String r2 = "cl_str_change_rate"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Le54
            java.lang.String r2 = "cl_str_change_rate"
            r3 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            r7.optDouble(r2, r3)     // Catch: java.lang.Exception -> Lfb6
        Le54:
            java.lang.String r2 = "wf_high_freq_vdr_loss"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Le62
            java.lang.String r2 = "wf_high_freq_vdr_loss"
            r3 = 0
            r7.optInt(r2, r3)     // Catch: java.lang.Exception -> Lfb6
        Le62:
            java.lang.String r2 = "gnssods"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Le6f
            java.lang.String r2 = "gnssods"
            r7.optInt(r2)     // Catch: java.lang.Exception -> Lfb6
        Le6f:
            java.lang.String r2 = "rtdrns"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Le7c
            java.lang.String r2 = "rtdrns"
            r7.optInt(r2)     // Catch: java.lang.Exception -> Lfb6
        Le7c:
            java.lang.String r2 = "vcsrps"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Le89
            java.lang.String r2 = "vcsrps"
            r7.optInt(r2)     // Catch: java.lang.Exception -> Lfb6
        Le89:
            java.lang.String r2 = "nlp_loc_coarse"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Le96
            java.lang.String r2 = "nlp_loc_coarse"
            r7.optInt(r2)     // Catch: java.lang.Exception -> Lfb6
        Le96:
            java.lang.String r2 = "lspfnis"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Lea4
            java.lang.String r2 = "lspfnis"
            r3 = 1
            r7.optInt(r2, r3)     // Catch: java.lang.Exception -> Lfb6
        Lea4:
            java.lang.String r2 = "upload_ssid_switch"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Leb5
            java.lang.String r2 = "upload_ssid_switch"
            r3 = 1
            int r2 = r7.optInt(r2, r3)     // Catch: java.lang.Exception -> Lfb6
            r1.J = r2     // Catch: java.lang.Exception -> Lfb6
        Leb5:
            java.lang.String r2 = "single_ssid_length_max"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Lec7
            java.lang.String r2 = "single_ssid_length_max"
            r3 = 30
            int r2 = r7.optInt(r2, r3)     // Catch: java.lang.Exception -> Lfb6
            r1.K = r2     // Catch: java.lang.Exception -> Lfb6
        Lec7:
            java.lang.String r2 = "max_request_ssid_number"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Led9
            java.lang.String r2 = "max_request_ssid_number"
            r3 = 64
            int r2 = r7.optInt(r2, r3)     // Catch: java.lang.Exception -> Lfb6
            r1.L = r2     // Catch: java.lang.Exception -> Lfb6
        Led9:
            java.lang.String r2 = "fix_telephony_crash"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Lee7
            java.lang.String r2 = "fix_telephony_crash"
            r3 = 1
            r7.optInt(r2, r3)     // Catch: java.lang.Exception -> Lfb6
        Lee7:
            java.lang.String r2 = "is_monitor_index"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Lef5
            java.lang.String r2 = "is_monitor_index"
            r3 = 0
            r7.optInt(r2, r3)     // Catch: java.lang.Exception -> Lfb6
        Lef5:
            java.lang.String r2 = "monitor_frequency"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Lf05
            java.lang.String r2 = "monitor_frequency"
            r3 = 60000(0xea60, float:8.4078E-41)
            r7.optInt(r2, r3)     // Catch: java.lang.Exception -> Lfb6
        Lf05:
            java.lang.String r2 = "iens"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Lf15
            java.lang.String r2 = "iens"
            int r2 = r7.optInt(r2)     // Catch: java.lang.Exception -> Lfb6
            r1.M = r2     // Catch: java.lang.Exception -> Lfb6
        Lf15:
            java.lang.String r2 = "kahts"
            boolean r2 = r7.has(r2)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Lf25
            java.lang.String r2 = "kahts"
            int r2 = r7.optInt(r2)     // Catch: java.lang.Exception -> Lfb6
            r1.N = r2     // Catch: java.lang.Exception -> Lfb6
        Lf25:
            java.lang.String r1 = "nvlyps"
            boolean r1 = r7.has(r1)     // Catch: java.lang.Exception -> Lfb6
            if (r1 == 0) goto Lf32
            java.lang.String r1 = "nvlyps"
            r7.optInt(r1)     // Catch: java.lang.Exception -> Lfb6
        Lf32:
            java.lang.String r1 = "nvlypsl"
            boolean r1 = r7.has(r1)     // Catch: java.lang.Exception -> Lfb6
            if (r1 == 0) goto Lf3f
            java.lang.String r1 = "nvlypsl"
            r7.optInt(r1)     // Catch: java.lang.Exception -> Lfb6
        Lf3f:
            java.lang.String r1 = "nvlypsp"
            boolean r1 = r7.has(r1)     // Catch: java.lang.Exception -> Lfb6
            if (r1 == 0) goto Lf67
            java.lang.String r1 = "nvlypsp"
            java.lang.String r1 = r7.optString(r1)     // Catch: java.lang.Exception -> Lfb6
            boolean r2 = r1.contains(r8)     // Catch: java.lang.Exception -> Lfb6
            if (r2 == 0) goto Lf67
            java.lang.String[] r1 = r1.split(r8)     // Catch: java.lang.Exception -> Lfb6
            int r2 = r1.length     // Catch: java.lang.Exception -> Lfb6
            r3 = 2
            if (r2 < r3) goto Lf67
            r2 = 0
            r2 = r1[r2]     // Catch: java.lang.Exception -> Lfb6
            java.lang.Integer.parseInt(r2)     // Catch: java.lang.Exception -> Lfb6
            r2 = 1
            r1 = r1[r2]     // Catch: java.lang.Exception -> Lfb6
            java.lang.Integer.parseInt(r1)     // Catch: java.lang.Exception -> Lfb6
        Lf67:
            java.lang.String r1 = "nvlgfs"
            boolean r1 = r7.has(r1)     // Catch: java.lang.Exception -> Lfb6
            if (r1 == 0) goto Lf74
            java.lang.String r1 = "nvlgfs"
            r7.optInt(r1)     // Catch: java.lang.Exception -> Lfb6
        Lf74:
            java.lang.String r1 = "sppfs"
            boolean r1 = r7.has(r1)     // Catch: java.lang.Exception -> Lfb6
            if (r1 == 0) goto Lf81
            java.lang.String r1 = "sppfs"
            r7.optInt(r1)     // Catch: java.lang.Exception -> Lfb6
        Lf81:
            java.lang.String r1 = "ipsd"
            boolean r1 = r7.has(r1)     // Catch: java.lang.Exception -> Lfb6
            if (r1 == 0) goto Lf8e
            java.lang.String r1 = "ipsd"
            r7.optString(r1)     // Catch: java.lang.Exception -> Lfb6
        Lf8e:
            java.lang.String r1 = "nipvgdt"
            boolean r1 = r7.has(r1)     // Catch: java.lang.Exception -> Lfb6
            if (r1 == 0) goto Lf9b
            java.lang.String r1 = "nipvgdt"
            r7.optInt(r1)     // Catch: java.lang.Exception -> Lfb6
        Lf9b:
            java.lang.String r1 = "nipvpyt"
            boolean r1 = r7.has(r1)     // Catch: java.lang.Exception -> Lfb6
            if (r1 == 0) goto Lfa8
            java.lang.String r1 = "nipvpyt"
            r7.optInt(r1)     // Catch: java.lang.Exception -> Lfb6
        Lfa8:
            java.lang.String r1 = "nipvdcf"
            boolean r1 = r7.has(r1)     // Catch: java.lang.Exception -> Lfb6
            if (r1 == 0) goto Lfbb
            java.lang.String r1 = "nipvdcf"
            r7.optInt(r1)     // Catch: java.lang.Exception -> Lfb6
            goto Lfbb
        Lfb6:
            r0 = move-exception
            r1 = r0
            r1.printStackTrace()
        Lfbb:
            return
    }

    public final void c() {
            r4 = this;
            java.lang.String r0 = "1|0.05|60|45|2|300|80|2|100|40|30|3|8|4050|5|5|0.1|1|1|0|0.325|0|0|0.5|1|6|15|10|0.05|10|10|1|5|10|10|30|5|5.5|1|0|1|40|0.5|120|180|20|200|300|600|2|10|2|4|1.02|0|0|20|10|60|2|100|2|10|1|20|1|0.2|0|0|0.5|0|1|1000|10|1|40|5|10|5|0.8|1|5|50|6|2|4|1|1|0|0|1|0.5|1|0|1|200|100|1"
            java.lang.String r1 = "\\|"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            float[] r1 = new float[r1]
            r4.q = r1
            r1 = 0
        Le:
            int r2 = r0.length
            if (r1 >= r2) goto L23
            float[] r2 = r4.q     // Catch: java.lang.NumberFormatException -> L1c
            r3 = r0[r1]     // Catch: java.lang.NumberFormatException -> L1c
            float r3 = java.lang.Float.parseFloat(r3)     // Catch: java.lang.NumberFormatException -> L1c
            r2[r1] = r3     // Catch: java.lang.NumberFormatException -> L1c
            goto L20
        L1c:
            r2 = move-exception
            r2.printStackTrace()
        L20:
            int r1 = r1 + 1
            goto Le
        L23:
            return
    }

    public void c(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L8
            r1.l = r2
        L8:
            return
    }

    public final void d() {
            r4 = this;
            java.lang.String r0 = "1|0.05|200|80|1|300|80|2|100|40|30|3|8|4050|5|30|0.1|1|1|0|0.325|0|0|0.5|1|5|15|10|0.05|10|10|1|5|10|10|30|5|5.5|1|0|1|40|0.5|120|180|20|200|300|600|2|10|2|4|1.02|0|0|20|10|60|2|100|2|10|1|20|0"
            java.lang.String r1 = "\\|"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            float[] r1 = new float[r1]
            r4.r = r1
            r1 = 0
        Le:
            int r2 = r0.length
            if (r1 >= r2) goto L23
            float[] r2 = r4.r     // Catch: java.lang.NumberFormatException -> L1c
            r3 = r0[r1]     // Catch: java.lang.NumberFormatException -> L1c
            float r3 = java.lang.Float.parseFloat(r3)     // Catch: java.lang.NumberFormatException -> L1c
            r2[r1] = r3     // Catch: java.lang.NumberFormatException -> L1c
            goto L20
        L1c:
            r2 = move-exception
            r2.printStackTrace()
        L20:
            int r1 = r1 + 1
            goto Le
        L23:
            return
    }

    public final void e() {
            r4 = this;
            java.lang.String r0 = "1|10000|90|5|3|3|85|87|5|10|15|8|5|5"
            java.lang.String r1 = "\\|"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            float[] r1 = new float[r1]
            r4.t = r1
            r1 = 0
        Le:
            int r2 = r0.length
            if (r1 >= r2) goto L23
            float[] r2 = r4.t     // Catch: java.lang.NumberFormatException -> L1c
            r3 = r0[r1]     // Catch: java.lang.NumberFormatException -> L1c
            float r3 = java.lang.Float.parseFloat(r3)     // Catch: java.lang.NumberFormatException -> L1c
            r2[r1] = r3     // Catch: java.lang.NumberFormatException -> L1c
            goto L20
        L1c:
            r2 = move-exception
            r2.printStackTrace()
        L20:
            int r1 = r1 + 1
            goto Le
        L23:
            return
    }

    public final void f() {
            r4 = this;
            java.lang.String r0 = "1|0.05|60|45|2|300|80|2|100|40|30|3|8|4050|5|5|0.1|1|1|0|0.325|0|0|0.5|1|6|15|10|0.05|10|10|1|5|10|10|30|5|5.5|1|0|1|40|0.5|120|180|20|200|300|600|2|10|2|4|1.02|0|0|20|10|60|2|100|2|10|1|20|1|0.2|0|0|0.5|0|1|1000|10|1|40|5|10|5|0.8|1|5|50|6|2|4|1|1|0|0|1|0.5|1|0|1|200|100|1"
            java.lang.String r1 = "\\|"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            float[] r1 = new float[r1]
            r4.u = r1
            r1 = 0
        Le:
            int r2 = r0.length
            if (r1 >= r2) goto L23
            float[] r2 = r4.u     // Catch: java.lang.NumberFormatException -> L1c
            r3 = r0[r1]     // Catch: java.lang.NumberFormatException -> L1c
            float r3 = java.lang.Float.parseFloat(r3)     // Catch: java.lang.NumberFormatException -> L1c
            r2[r1] = r3     // Catch: java.lang.NumberFormatException -> L1c
            goto L20
        L1c:
            r2 = move-exception
            r2.printStackTrace()
        L20:
            int r1 = r1 + 1
            goto Le
        L23:
            return
    }

    public final void g() {
            r4 = this;
            java.lang.String r0 = "1|0.05|30|25|1|15|80|2|100|40|30|3|8|4050|10|7|0.1|1|1|0.1|0.325|0|0|0.5|1|6|15|10|0.05|10|10|1|5|10|10|30|5|5.5|1|0|1|40|0.5|120|180|20|200|300|600|2|10|2|4|1.02|0|0|20|10|60|2|100|2|10|1|20|0|1|1|0|1"
            java.lang.String r1 = "\\|"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            float[] r1 = new float[r1]
            r4.s = r1
            r1 = 0
        Le:
            int r2 = r0.length
            if (r1 >= r2) goto L23
            float[] r2 = r4.s     // Catch: java.lang.NumberFormatException -> L1c
            r3 = r0[r1]     // Catch: java.lang.NumberFormatException -> L1c
            float r3 = java.lang.Float.parseFloat(r3)     // Catch: java.lang.NumberFormatException -> L1c
            r2[r1] = r3     // Catch: java.lang.NumberFormatException -> L1c
            goto L20
        L1c:
            r2 = move-exception
            r2.printStackTrace()
        L20:
            int r1 = r1 + 1
            goto Le
        L23:
            return
    }

    public void h() {
            r5 = this;
            android.os.Handler r0 = r5.k
            if (r0 != 0) goto Lb
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r5.k = r0
        Lb:
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r5.j
            long r0 = r0 - r2
            r2 = 0
            r3 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L1c
            r2 = r1
        L1c:
            a.a.a.b.r r0 = a.a.a.b.r.a()
            java.lang.String r3 = ""
            java.lang.String r4 = "vdrconfig_gz"
            java.lang.String r0 = r0.a(r4, r3)
            if (r0 == 0) goto L32
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L31
            goto L32
        L31:
            r1 = r2
        L32:
            if (r1 == 0) goto L53
            long r0 = java.lang.System.currentTimeMillis()
            r5.j = r0
            a.a.a.b.r r0 = a.a.a.b.r.a()
            long r1 = r5.j
            java.lang.String r3 = "vdrtt"
            r0.b(r3, r1)
            android.os.Handler r0 = r5.k
            if (r0 == 0) goto L53
            a.a.a.b.d$a r1 = new a.a.a.b.d$a
            r1.<init>(r5)
            r2 = 5000(0x1388, double:2.4703E-320)
            r0.postDelayed(r1, r2)
        L53:
            return
    }
}
