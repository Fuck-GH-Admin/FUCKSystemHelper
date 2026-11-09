package a.a.a.b;

/* JADX INFO: loaded from: classes.dex */
public class c {
    public static long i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.util.ArrayList<a.a.a.b.c.b> f8a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10c;
    public com.baidu.location.c d;
    public com.baidu.location.c e;
    public java.lang.Object f;
    public android.util.LruCache<java.lang.String, org.json.JSONObject> g;
    public boolean h;

    public static /* synthetic */ class a {
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public java.lang.String f11a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public android.os.Messenger f12b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public com.baidu.location.i f13c;
        public int d;

        public b(a.a.a.b.c r13, android.os.Message r14) {
                r12 = this;
                r12.<init>()
                r0 = 0
                r12.f11a = r0
                r12.f12b = r0
                com.baidu.location.i r1 = new com.baidu.location.i
                r1.<init>()
                r12.f13c = r1
                r1 = 0
                r12.d = r1
                android.os.Messenger r2 = r14.replyTo
                r12.f12b = r2
                android.os.Bundle r2 = r14.getData()
                java.lang.String r3 = "packName"
                java.lang.String r2 = r2.getString(r3)
                r12.f11a = r2
                com.baidu.location.i r2 = r12.f13c
                android.os.Bundle r3 = r14.getData()
                java.lang.String r4 = "prodName"
                java.lang.String r3 = r3.getString(r4)
                r2.f = r3
                a.a.a.i.b r2 = a.a.a.i.b.e()
                com.baidu.location.i r3 = r12.f13c
                java.lang.String r3 = r3.f
                java.lang.String r4 = r12.f11a
                r2.a(r3, r4)
                com.baidu.location.i r2 = r12.f13c
                android.os.Bundle r3 = r14.getData()
                java.lang.String r4 = "coorType"
                java.lang.String r3 = r3.getString(r4)
                r2.f1370a = r3
                com.baidu.location.i r2 = r12.f13c
                android.os.Bundle r3 = r14.getData()
                java.lang.String r4 = "addrType"
                java.lang.String r3 = r3.getString(r4)
                r2.f1371b = r3
                com.baidu.location.i r2 = r12.f13c
                android.os.Bundle r3 = r14.getData()
                java.lang.String r4 = "enableSimulateGps"
                boolean r3 = r3.getBoolean(r4, r1)
                r2.j = r3
                boolean r2 = a.a.a.i.i.k
                r3 = 1
                if (r2 != 0) goto L75
                com.baidu.location.i r2 = r12.f13c
                boolean r2 = r2.j
                if (r2 == 0) goto L73
                goto L75
            L73:
                r2 = r1
                goto L76
            L75:
                r2 = r3
            L76:
                a.a.a.i.i.k = r2
                java.lang.String r2 = a.a.a.i.i.d
                java.lang.String r4 = "all"
                boolean r2 = r2.equals(r4)
                if (r2 != 0) goto L88
                com.baidu.location.i r2 = r12.f13c
                java.lang.String r2 = r2.f1371b
                a.a.a.i.i.d = r2
            L88:
                com.baidu.location.i r2 = r12.f13c
                android.os.Bundle r4 = r14.getData()
                java.lang.String r5 = "openGPS"
                boolean r4 = r4.getBoolean(r5)
                r2.f1372c = r4
                com.baidu.location.i r2 = r12.f13c
                android.os.Bundle r4 = r14.getData()
                java.lang.String r5 = "scanSpan"
                int r4 = r4.getInt(r5)
                r2.d = r4
                com.baidu.location.i r2 = r12.f13c
                android.os.Bundle r4 = r14.getData()
                java.lang.String r5 = "timeOut"
                int r4 = r4.getInt(r5)
                r2.e = r4
                com.baidu.location.i r2 = r12.f13c
                android.os.Bundle r4 = r14.getData()
                java.lang.String r5 = "priority"
                int r4 = r4.getInt(r5)
                r2.g = r4
                com.baidu.location.i r2 = r12.f13c
                android.os.Bundle r4 = r14.getData()
                java.lang.String r5 = "location_change_notify"
                boolean r4 = r4.getBoolean(r5)
                r2.h = r4
                com.baidu.location.i r2 = r12.f13c
                android.os.Bundle r4 = r14.getData()
                java.lang.String r5 = "needDirect"
                boolean r4 = r4.getBoolean(r5, r1)
                r2.n = r4
                com.baidu.location.i r2 = r12.f13c
                android.os.Bundle r4 = r14.getData()
                java.lang.String r5 = "isneedaltitude"
                boolean r4 = r4.getBoolean(r5, r1)
                r2.s = r4
                com.baidu.location.i r2 = r12.f13c
                android.os.Bundle r4 = r14.getData()
                java.lang.String r5 = "isneednewrgc"
                boolean r4 = r4.getBoolean(r5, r1)
                r2.t = r4
                boolean r2 = a.a.a.i.i.g
                if (r2 != 0) goto L105
                com.baidu.location.i r2 = r12.f13c
                boolean r2 = r2.t
                if (r2 == 0) goto L103
                goto L105
            L103:
                r2 = r1
                goto L106
            L105:
                r2 = r3
            L106:
                a.a.a.i.i.g = r2
                boolean r2 = a.a.a.i.i.f
                if (r2 != 0) goto L11b
                android.os.Bundle r2 = r14.getData()
                java.lang.String r4 = "isneedaptag"
                boolean r2 = r2.getBoolean(r4, r1)
                if (r2 == 0) goto L119
                goto L11b
            L119:
                r2 = r1
                goto L11c
            L11b:
                r2 = r3
            L11c:
                a.a.a.i.i.f = r2
                boolean r2 = a.a.a.i.i.h
                if (r2 != 0) goto L131
                android.os.Bundle r2 = r14.getData()
                java.lang.String r4 = "isneedaptagd"
                boolean r2 = r2.getBoolean(r4, r1)
                if (r2 == 0) goto L12f
                goto L131
            L12f:
                r2 = r1
                goto L132
            L131:
                r2 = r3
            L132:
                a.a.a.i.i.h = r2
                android.os.Bundle r2 = r14.getData()
                r4 = 1056964608(0x3f000000, float:0.5)
                java.lang.String r5 = "autoNotifyLocSensitivity"
                float r2 = r2.getFloat(r5, r4)
                a.a.a.i.i.O = r2
                android.os.Bundle r2 = r14.getData()
                int r4 = a.a.a.i.i.q0
                java.lang.String r5 = "wfnum"
                int r2 = r2.getInt(r5, r4)
                android.os.Bundle r4 = r14.getData()
                float r5 = a.a.a.i.i.s0
                java.lang.String r6 = "wfsm"
                float r4 = r4.getFloat(r6, r5)
                android.os.Bundle r5 = r14.getData()
                int r6 = a.a.a.i.i.u0
                java.lang.String r7 = "gnmcon"
                int r5 = r5.getInt(r7, r6)
                android.os.Bundle r6 = r14.getData()
                double r7 = a.a.a.i.i.t0
                java.lang.String r9 = "gnmcrm"
                double r6 = r6.getDouble(r9, r7)
                android.os.Bundle r8 = r14.getData()
                java.lang.String r9 = "iupl"
                int r8 = r8.getInt(r9, r3)
                android.os.Bundle r9 = r14.getData()
                r10 = 10
                java.lang.String r11 = "ct"
                int r9 = r9.getInt(r11, r10)
                a.a.a.i.i.H0 = r9
                android.os.Bundle r9 = r14.getData()
                r10 = 3
                java.lang.String r11 = "suci"
                int r9 = r9.getInt(r11, r10)
                a.a.a.i.i.I0 = r9
                android.os.Bundle r9 = r14.getData()
                java.lang.String r10 = "cgs"
                double[] r9 = r9.getDoubleArray(r10)
                a.a.a.i.i.K0 = r9
                android.os.Bundle r9 = r14.getData()
                java.lang.String r10 = "ums"
                int r9 = r9.getInt(r10, r3)
                a.a.a.i.i.L0 = r9
                android.os.Bundle r9 = r14.getData()
                r10 = 40
                java.lang.String r11 = "smn"
                int r9 = r9.getInt(r11, r10)
                a.a.a.i.i.J0 = r9
                if (r8 > 0) goto L1c2
                a.a.a.i.i.G0 = r1
                goto L1c9
            L1c2:
                int r8 = a.a.a.i.i.G0
                r9 = -1
                if (r8 != r9) goto L1c9
                a.a.a.i.i.G0 = r3
            L1c9:
                android.os.Bundle r8 = r14.getData()
                java.lang.String r9 = "opetco"
                int r8 = r8.getInt(r9, r3)
                if (r8 != 0) goto L1d7
                a.a.a.i.i.M0 = r1
            L1d7:
                android.os.Bundle r8 = r14.getData()
                int r9 = a.a.a.i.i.N0
                java.lang.String r10 = "lpcs"
                int r8 = r8.getInt(r10, r9)
                if (r8 != 0) goto L1e7
                a.a.a.i.i.N0 = r1
            L1e7:
                if (r5 != r3) goto L1eb
                a.a.a.i.i.u0 = r3
            L1eb:
                double r8 = a.a.a.i.i.t0
                int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r5 <= 0) goto L1f3
                a.a.a.i.i.t0 = r6
            L1f3:
                android.os.Bundle r5 = r14.getData()
                java.lang.String r6 = "ischeckper"
                boolean r5 = r5.getBoolean(r6, r1)
                boolean r6 = a.a.a.i.i.p0
                if (r6 != 0) goto L206
                if (r5 == 0) goto L204
                goto L206
            L204:
                r5 = r1
                goto L207
            L206:
                r5 = r3
            L207:
                a.a.a.i.i.p0 = r5
                android.os.Bundle r5 = r14.getData()
                java.lang.String r6 = "isEnableBeidouMode"
                boolean r5 = r5.getBoolean(r6, r1)
                int r6 = android.os.Build.VERSION.SDK_INT
                r7 = 28
                if (r6 < r7) goto L225
                boolean r6 = a.a.a.i.i.P0
                if (r6 != 0) goto L222
                if (r5 == 0) goto L220
                goto L222
            L220:
                r5 = r1
                goto L223
            L222:
                r5 = r3
            L223:
                a.a.a.i.i.P0 = r5
            L225:
                int r5 = a.a.a.i.i.q0
                if (r2 <= r5) goto L22b
                a.a.a.i.i.q0 = r2
            L22b:
                float r2 = a.a.a.i.i.s0
                int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r2 <= 0) goto L233
                a.a.a.i.i.s0 = r4
            L233:
                android.os.Bundle r2 = r14.getData()
                r4 = 2147483647(0x7fffffff, float:NaN)
                java.lang.String r5 = "wifitimeout"
                int r2 = r2.getInt(r5, r4)
                int r4 = a.a.a.i.i.a0
                if (r2 >= r4) goto L246
                a.a.a.i.i.a0 = r2
            L246:
                android.os.Bundle r2 = r14.getData()
                java.lang.String r4 = "autoNotifyMaxInterval"
                int r2 = r2.getInt(r4, r1)
                int r4 = a.a.a.i.i.T
                if (r2 < r4) goto L256
                a.a.a.i.i.T = r2
            L256:
                android.os.Bundle r2 = r14.getData()
                java.lang.String r4 = "autoNotifyMinDistance"
                int r2 = r2.getInt(r4, r1)
                int r4 = a.a.a.i.i.V
                if (r2 < r4) goto L266
                a.a.a.i.i.V = r2
            L266:
                android.os.Bundle r2 = r14.getData()
                java.lang.String r4 = "autoNotifyMinTimeInterval"
                int r2 = r2.getInt(r4, r1)
                int r4 = a.a.a.i.i.U
                if (r2 < r4) goto L276
                a.a.a.i.i.U = r2
            L276:
                com.baidu.location.i r2 = r12.f13c
                boolean r4 = r2.n
                if (r4 != 0) goto L280
                boolean r2 = r2.s
                if (r2 == 0) goto L292
            L280:
                a.a.a.b.t r2 = a.a.a.b.t.e()
                com.baidu.location.i r4 = r12.f13c
                boolean r4 = r4.n
                r2.b(r4)
                a.a.a.b.t r2 = a.a.a.b.t.e()
                r2.c()
            L292:
                boolean r2 = r13.f10c
                if (r2 != 0) goto L29f
                com.baidu.location.i r12 = r12.f13c
                boolean r12 = r12.s
                if (r12 == 0) goto L29d
                goto L29f
            L29d:
                r12 = r1
                goto L2a0
            L29f:
                r12 = r3
            L2a0:
                r13.f10c = r12
                android.os.Bundle r12 = r14.getData()
                int r13 = a.a.a.i.i.v0
                java.lang.String r2 = "hpdts"
                int r12 = r12.getInt(r2, r13)
                if (r12 != r3) goto L2b3
                a.a.a.i.i.v0 = r3
                goto L2b5
            L2b3:
                a.a.a.i.i.v0 = r1
            L2b5:
                android.os.Bundle r12 = r14.getData()
                int r13 = a.a.a.i.i.w0
                java.lang.String r2 = "oldts"
                int r12 = r12.getInt(r2, r13)
                if (r12 != r3) goto L2c6
                a.a.a.i.i.w0 = r3
                goto L2c8
            L2c6:
                a.a.a.i.i.w0 = r1
            L2c8:
                android.os.Bundle r12 = r14.getData()
                int r13 = a.a.a.i.i.x0
                java.lang.String r1 = "onic"
                int r12 = r12.getInt(r1, r13)
                if (r12 != 0) goto L2d8
                a.a.a.i.i.x0 = r12
            L2d8:
                android.os.Bundle r12 = r14.getData()
                int r13 = a.a.a.i.i.y0
                java.lang.String r1 = "nlcs"
                int r12 = r12.getInt(r1, r13)
                if (r12 != r3) goto L2e8
                a.a.a.i.i.y0 = r12
            L2e8:
                android.os.Bundle r12 = r14.getData()
                float r13 = a.a.a.i.i.z0
                java.lang.String r1 = "ncsr"
                float r12 = r12.getFloat(r1, r13)
                a.a.a.i.i.z0 = r12
                android.os.Bundle r12 = r14.getData()
                float r13 = a.a.a.i.i.A0
                java.lang.String r1 = "cscr"
                float r12 = r12.getFloat(r1, r13)
                a.a.a.i.i.A0 = r12
                android.os.Bundle r12 = r14.getData()
                int r13 = a.a.a.i.i.B0
                java.lang.String r1 = "cls"
                int r12 = r12.getInt(r1, r13)
                a.a.a.i.i.B0 = r12
                android.os.Bundle r12 = r14.getData()
                java.lang.String r13 = "ocs"
                int[] r12 = r12.getIntArray(r13)
                a.a.a.i.i.C0 = r12
                boolean r12 = a.a.a.i.i.a(r12)
                a.a.a.i.i.D0 = r12
                android.os.Bundle r12 = r14.getData()
                java.lang.String r13 = "topCellNumber"
                int r12 = r12.getInt(r13)
                a.a.a.i.i.E0 = r12
                android.os.Bundle r12 = r14.getData()
                java.lang.String r13 = "locStrLength"
                int r12 = r12.getInt(r13)
                a.a.a.i.i.F0 = r12
                android.os.Bundle r12 = r14.getData()
                java.lang.String r13 = "connectBssid"
                java.lang.String r12 = r12.getString(r13, r0)
                a.a.a.g.f r13 = a.a.a.g.f.w()
                r13.a(r0, r12)
                return
        }

        public static /* synthetic */ void a(a.a.a.b.c.b r0, int r1) {
                r0.a(r1)
                return
        }

        public static /* synthetic */ void a(a.a.a.b.c.b r0, int r1, android.os.Bundle r2) {
                r0.a(r1, r2)
                return
        }

        public final double a(boolean r12, com.baidu.location.c r13, com.baidu.location.c r14) {
                r11 = this;
                java.lang.String r11 = "gcj2wgs"
                java.lang.String r0 = "wgs84"
                r1 = 0
                r2 = 1
                if (r12 == 0) goto Lb0
                java.lang.String r12 = r14.h()
                java.lang.String r3 = r13.h()
                boolean r12 = android.text.TextUtils.equals(r12, r3)
                java.lang.String r3 = "bd09"
                java.lang.String r4 = "bd092gcj"
                if (r12 == 0) goto L46
                java.lang.String r11 = r14.h()
                boolean r11 = android.text.TextUtils.equals(r3, r11)
                if (r11 == 0) goto Lbe
                double r11 = r14.t()
                double r5 = r14.q()
                double[] r11 = com.baidu.location.Jni.a(r11, r5, r4)
                double r5 = r13.t()
                double r7 = r13.q()
                double[] r12 = com.baidu.location.Jni.a(r5, r7, r4)
                r3 = r11[r2]
                r5 = r11[r1]
                r7 = r12[r2]
                r9 = r12[r1]
                goto Lce
            L46:
                java.lang.String r12 = r13.h()
                boolean r12 = android.text.TextUtils.equals(r0, r12)
                r5 = 2
                if (r12 != 0) goto L9a
                java.lang.String r12 = r13.h()
                boolean r12 = android.text.TextUtils.equals(r3, r12)
                if (r12 == 0) goto L68
                double r5 = r13.t()
                double r7 = r13.q()
                double[] r12 = com.baidu.location.Jni.a(r5, r7, r4)
                goto L91
            L68:
                java.lang.String r12 = r13.h()
                java.lang.String r3 = "bd09ll"
                boolean r12 = android.text.TextUtils.equals(r3, r12)
                if (r12 == 0) goto L83
                double r3 = r13.t()
                double r5 = r13.q()
                java.lang.String r12 = "bd09ll2gcj"
                double[] r12 = com.baidu.location.Jni.a(r3, r5, r12)
                goto L91
            L83:
                double[] r12 = new double[r5]
                double r3 = r13.t()
                r12[r1] = r3
                double r3 = r13.q()
                r12[r2] = r3
            L91:
                r3 = r12[r1]
                r5 = r12[r2]
                double[] r11 = com.baidu.location.Jni.a(r3, r5, r11)
                goto La8
            L9a:
                double[] r11 = new double[r5]
                double r3 = r13.t()
                r11[r1] = r3
                double r3 = r13.q()
                r11[r2] = r3
            La8:
                r2 = r11[r2]
                r13.c(r2)
                r11 = r11[r1]
                goto Le9
            Lb0:
                java.lang.String r12 = r14.h()
                java.lang.String r3 = r13.h()
                boolean r12 = android.text.TextUtils.equals(r12, r3)
                if (r12 == 0) goto Ld6
            Lbe:
                double r3 = r14.q()
                double r5 = r14.t()
                double r7 = r13.q()
                double r9 = r13.t()
            Lce:
                double r11 = a.a.a.i.i.a(r3, r5, r7, r9)
            Ld2:
                r14.b(r11)
                goto L10b
            Ld6:
                double r3 = r13.t()
                double r5 = r13.q()
                double[] r11 = com.baidu.location.Jni.a(r3, r5, r11)
                r2 = r11[r2]
                r13.c(r2)
                r11 = r11[r1]
            Le9:
                r13.d(r11)
                java.lang.String r11 = a.a.a.i.i.i()
                r13.n(r11)
                r13.e(r0)
                double r1 = r14.q()
                double r3 = r14.t()
                double r5 = r13.q()
                double r7 = r13.t()
                double r11 = a.a.a.i.i.a(r1, r3, r5, r7)
                goto Ld2
            L10b:
                if (r13 == 0) goto L110
                r14.a(r13)
            L110:
                return r11
        }

        public final int a(double r3) {
                r2 = this;
                r0 = 0
                int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                r0 = 4621819117588971520(0x4024000000000000, double:10.0)
                if (r2 < 0) goto Le
                int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r2 > 0) goto Le
                r2 = 0
                return r2
            Le:
                int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                r0 = 4636737291354636288(0x4059000000000000, double:100.0)
                if (r2 <= 0) goto L1a
                int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r2 > 0) goto L1a
                r2 = 1
                return r2
            L1a:
                int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r2 <= 0) goto L26
                r0 = 4641240890982006784(0x4069000000000000, double:200.0)
                int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r2 > 0) goto L26
                r2 = 2
                return r2
            L26:
                r2 = 3
                return r2
        }

        public int a(int r4, boolean r5, com.baidu.location.c r6) {
                r3 = this;
                r0 = 0
                r1 = 1
                r2 = 100
                if (r4 != r2) goto L1d
                if (r5 == 0) goto L12
                com.baidu.location.c r4 = r3.c()
                if (r4 == 0) goto L1b
                r3.a(r1, r4, r6)
                goto L1b
            L12:
                com.baidu.location.c r4 = r3.d()
                if (r4 == 0) goto L1b
                r3.a(r0, r4, r6)
            L1b:
                r3 = 3
                return r3
            L1d:
                r2 = 200(0xc8, float:2.8E-43)
                if (r4 != r2) goto L22
                return r1
            L22:
                r2 = 300(0x12c, float:4.2E-43)
                if (r4 != r2) goto L27
                return r1
            L27:
                r2 = 400(0x190, float:5.6E-43)
                if (r4 != r2) goto L49
                if (r5 == 0) goto L3c
                com.baidu.location.c r4 = r3.c()
                if (r4 == 0) goto L47
                double r4 = r3.a(r1, r4, r6)
            L37:
                int r3 = r3.a(r4)
                return r3
            L3c:
                com.baidu.location.c r4 = r3.d()
                if (r4 == 0) goto L47
                double r4 = r3.a(r0, r4, r6)
                goto L37
            L47:
                r3 = -1
                return r3
            L49:
                r3 = 500(0x1f4, float:7.0E-43)
                if (r4 != r3) goto L4e
                return r1
            L4e:
                return r0
        }

        public void a() {
                r2 = this;
                com.baidu.location.i r0 = r2.f13c
                boolean r0 = r0.h
                r1 = 1
                if (r0 != r1) goto L13
                boolean r0 = a.a.a.i.i.f355b
                if (r0 == 0) goto Le
                r0 = 54
                goto L10
            Le:
                r0 = 55
            L10:
                r2.a(r0)
            L13:
                return
        }

        public final void a(int r2) {
                r1 = this;
                r0 = 0
                android.os.Message r2 = android.os.Message.obtain(r0, r2)
                android.os.Messenger r0 = r1.f12b     // Catch: java.lang.Exception -> L10
                if (r0 == 0) goto Lc
                r0.send(r2)     // Catch: java.lang.Exception -> L10
            Lc:
                r2 = 0
                r1.d = r2     // Catch: java.lang.Exception -> L10
                goto L1b
            L10:
                r2 = move-exception
                boolean r2 = r2 instanceof android.os.DeadObjectException
                if (r2 == 0) goto L1b
                int r2 = r1.d
                int r2 = r2 + 1
                r1.d = r2
            L1b:
                return
        }

        public final void a(int r2, android.os.Bundle r3) {
                r1 = this;
                r0 = 0
                android.os.Message r2 = android.os.Message.obtain(r0, r2)
                r2.setData(r3)
                android.os.Messenger r3 = r1.f12b     // Catch: java.lang.Exception -> L13
                if (r3 == 0) goto Lf
                r3.send(r2)     // Catch: java.lang.Exception -> L13
            Lf:
                r2 = 0
                r1.d = r2     // Catch: java.lang.Exception -> L13
                goto L21
            L13:
                r2 = move-exception
                boolean r3 = r2 instanceof android.os.DeadObjectException
                if (r3 == 0) goto L1e
                int r3 = r1.d
                int r3 = r3 + 1
                r1.d = r3
            L1e:
                r2.printStackTrace()
            L21:
                return
        }

        public final void a(int r2, java.lang.String r3, com.baidu.location.c r4) {
                r1 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                r0.putParcelable(r3, r4)
                java.lang.Class<com.baidu.location.c> r3 = com.baidu.location.c.class
                java.lang.ClassLoader r3 = r3.getClassLoader()
                r0.setClassLoader(r3)
                r3 = 0
                android.os.Message r2 = android.os.Message.obtain(r3, r2)
                r2.setData(r0)
                android.os.Messenger r3 = r1.f12b     // Catch: java.lang.Exception -> L24
                if (r3 == 0) goto L20
                r3.send(r2)     // Catch: java.lang.Exception -> L24
            L20:
                r2 = 0
                r1.d = r2     // Catch: java.lang.Exception -> L24
                goto L2f
            L24:
                r2 = move-exception
                boolean r2 = r2 instanceof android.os.DeadObjectException
                if (r2 == 0) goto L2f
                int r2 = r1.d
                int r2 = r2 + 1
                r1.d = r2
            L2f:
                return
        }

        public void a(com.baidu.location.c r2) {
                r1 = this;
                r0 = 21
                r1.a(r2, r0)
                return
        }

        public void a(com.baidu.location.c r12, int r13) {
                r11 = this;
                com.baidu.location.c r0 = new com.baidu.location.c
                r0.<init>(r12)
                a.a.a.d.i r12 = a.a.a.d.i.m()
                boolean r12 = r12.f()
                r1 = 1
                if (r12 == 0) goto L13
                r0.a(r1)
            L13:
                r12 = 21
                java.lang.String r2 = "locStr"
                if (r13 != r12) goto L1e
                r12 = 27
                r11.a(r12, r2, r0)
            L1e:
                com.baidu.location.i r12 = r11.f13c
                java.lang.String r12 = r12.f1370a
                r3 = 0
                if (r12 == 0) goto Lb3
                java.lang.String r4 = "gcj02"
                boolean r12 = r12.equals(r4)
                if (r12 != 0) goto Lb3
                double r5 = r0.t()
                double r7 = r0.q()
                r9 = 1
                int r12 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r12 == 0) goto La0
                int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r12 == 0) goto La0
                java.lang.String r12 = r0.h()
                if (r12 == 0) goto L4f
                java.lang.String r12 = r0.h()
                boolean r12 = r12.equals(r4)
                if (r12 != 0) goto L55
            L4f:
                java.lang.String r12 = r0.h()
                if (r12 != 0) goto L6f
            L55:
                com.baidu.location.i r12 = r11.f13c
                java.lang.String r12 = r12.f1370a
                double[] r12 = com.baidu.location.Jni.a(r5, r7, r12)
                r3 = r12[r3]
                r0.d(r3)
                r3 = r12[r1]
                r0.c(r3)
                com.baidu.location.i r12 = r11.f13c
                java.lang.String r12 = r12.f1370a
            L6b:
                r0.e(r12)
                goto La0
            L6f:
                java.lang.String r12 = r0.h()
                if (r12 == 0) goto La0
                java.lang.String r12 = r0.h()
                java.lang.String r4 = "wgs84"
                boolean r12 = r12.equals(r4)
                if (r12 == 0) goto La0
                com.baidu.location.i r12 = r11.f13c
                java.lang.String r12 = r12.f1370a
                java.lang.String r4 = "bd09ll"
                boolean r12 = r12.equals(r4)
                if (r12 != 0) goto La0
                java.lang.String r12 = "wgs842mc"
                double[] r12 = com.baidu.location.Jni.a(r5, r7, r12)
                r3 = r12[r3]
                r0.d(r3)
                r3 = r12[r1]
                r0.c(r3)
                java.lang.String r12 = "wgs84mc"
                goto L6b
            La0:
                boolean r12 = a.a.a.i.i.k
                if (r12 != 0) goto Lc8
                int r12 = r0.u()
                if (r12 <= 0) goto Lc8
                int r12 = r0.u()
                int r12 = r11.a(r12, r1, r0)
                goto Lc5
            Lb3:
                boolean r12 = a.a.a.i.i.k
                if (r12 != 0) goto Lc8
                int r12 = r0.u()
                if (r12 <= 0) goto Lc8
                int r12 = r0.u()
                int r12 = r11.a(r12, r3, r0)
            Lc5:
                r0.j(r12)
            Lc8:
                r11.a(r13, r2, r0)
                return
        }

        public void b() {
                r1 = this;
                r0 = 111(0x6f, float:1.56E-43)
                r1.a(r0)
                return
        }

        public final com.baidu.location.c c() {
                r7 = this;
                a.a.a.g.d r0 = a.a.a.g.d.n()
                com.baidu.location.c r0 = r0.g()
                if (r0 == 0) goto L49
                double r1 = r0.t()
                double r3 = r0.q()
                java.lang.String r0 = "gps2gcj"
                double[] r0 = com.baidu.location.Jni.a(r1, r3, r0)
                r1 = 0
                r2 = r0[r1]
                r4 = 1
                r5 = r0[r4]
                com.baidu.location.i r0 = r7.f13c
                java.lang.String r0 = r0.f1370a
                double[] r0 = com.baidu.location.Jni.a(r2, r5, r0)
                com.baidu.location.c r2 = new com.baidu.location.c
                r2.<init>()
                r5 = r0[r1]
                r2.d(r5)
                r0 = r0[r4]
                r2.c(r0)
                java.lang.String r0 = a.a.a.i.i.i()
                r2.n(r0)
                r0 = 61
                r2.h(r0)
                com.baidu.location.i r7 = r7.f13c
                java.lang.String r7 = r7.f1370a
                r2.e(r7)
                goto L4a
            L49:
                r2 = 0
            L4a:
                return r2
        }

        public final com.baidu.location.c d() {
                r4 = this;
                a.a.a.g.d r4 = a.a.a.g.d.n()
                com.baidu.location.c r4 = r4.g()
                if (r4 == 0) goto L3b
                double r0 = r4.t()
                double r2 = r4.q()
                java.lang.String r4 = "gps2gcj"
                double[] r4 = com.baidu.location.Jni.a(r0, r2, r4)
                com.baidu.location.c r0 = new com.baidu.location.c
                r0.<init>()
                r1 = 0
                r1 = r4[r1]
                r0.d(r1)
                r1 = 1
                r1 = r4[r1]
                r0.c(r1)
                java.lang.String r4 = a.a.a.i.i.i()
                r0.n(r4)
                r4 = 61
                r0.h(r4)
                java.lang.String r4 = "gcj02"
                r0.e(r4)
                goto L3c
            L3b:
                r0 = 0
            L3c:
                return r0
        }
    }

    /* JADX INFO: renamed from: a.a.a.b.c$c, reason: collision with other inner class name */
    public static class C0002c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static a.a.a.b.c f14a;

        static {
                a.a.a.b.c r0 = new a.a.a.b.c
                r1 = 0
                r0.<init>(r1)
                a.a.a.b.c.C0002c.f14a = r0
                return
        }

        public static /* synthetic */ a.a.a.b.c a() {
                a.a.a.b.c r0 = a.a.a.b.c.C0002c.f14a
                return r0
        }
    }

    static {
            return
    }

    public c() {
            r5 = this;
            r5.<init>()
            r0 = 0
            r5.f8a = r0
            r1 = 0
            r5.f9b = r1
            r5.f10c = r1
            r5.d = r0
            r5.e = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r5.f = r0
            r5.h = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.f8a = r0
            android.util.LruCache r0 = new android.util.LruCache
            r2 = 3
            r0.<init>(r2)
            r5.g = r0
            a.a.a.b.r r0 = a.a.a.b.r.a()
            java.lang.String r2 = ""
            java.lang.String r3 = "sp_loc_map_end_str"
            r0.a(r3, r2)
            a.a.a.b.r r0 = a.a.a.b.r.a()
            java.lang.String r3 = "sp_loc_navi_end_str"
            r0.a(r3, r2)
            a.a.a.b.r r0 = a.a.a.b.r.a()
            java.lang.String r3 = "sp_loc_last_navi_end_str"
            r0.a(r3, r2)
            a.a.a.b.r r0 = a.a.a.b.r.a()
            java.lang.String r3 = "sp_bluetooth_info"
            java.lang.String r0 = r0.a(r3, r2)
            if (r0 == 0) goto L77
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L77
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: org.json.JSONException -> L73
            r2.<init>(r0)     // Catch: org.json.JSONException -> L73
        L5b:
            int r0 = r2.length()     // Catch: org.json.JSONException -> L73
            if (r1 >= r0) goto L77
            org.json.JSONObject r0 = r2.getJSONObject(r1)     // Catch: org.json.JSONException -> L73
            android.util.LruCache<java.lang.String, org.json.JSONObject> r3 = r5.g     // Catch: org.json.JSONException -> L73
            java.lang.String r4 = "mac"
            java.lang.String r4 = r0.getString(r4)     // Catch: org.json.JSONException -> L73
            r3.put(r4, r0)     // Catch: org.json.JSONException -> L73
            int r1 = r1 + 1
            goto L5b
        L73:
            r5 = move-exception
            r5.printStackTrace()
        L77:
            return
    }

    public /* synthetic */ c(a.a.a.b.c.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static a.a.a.b.c h() {
            a.a.a.b.c r0 = a.a.a.b.c.C0002c.a()
            return r0
    }

    public final a.a.a.b.c.b a(android.os.Messenger r5) {
            r4 = this;
            java.util.ArrayList<a.a.a.b.c$b> r0 = r4.f8a
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Object r0 = r4.f     // Catch: java.lang.Exception -> L2a
            monitor-enter(r0)     // Catch: java.lang.Exception -> L2a
            java.util.ArrayList<a.a.a.b.c$b> r4 = r4.f8a     // Catch: java.lang.Throwable -> L27
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L27
        Lf:
            boolean r2 = r4.hasNext()     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L25
            java.lang.Object r2 = r4.next()     // Catch: java.lang.Throwable -> L27
            a.a.a.b.c$b r2 = (a.a.a.b.c.b) r2     // Catch: java.lang.Throwable -> L27
            android.os.Messenger r3 = r2.f12b     // Catch: java.lang.Throwable -> L27
            boolean r3 = r3.equals(r5)     // Catch: java.lang.Throwable -> L27
            if (r3 == 0) goto Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            return r2
        L25:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            goto L2e
        L27:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            throw r4     // Catch: java.lang.Exception -> L2a
        L2a:
            r4 = move-exception
            r4.printStackTrace()
        L2e:
            return r1
    }

    public final void a() {
            r7 = this;
            r0 = 0
            java.lang.Object r1 = r7.f     // Catch: java.lang.Exception -> L2f
            monitor-enter(r1)     // Catch: java.lang.Exception -> L2f
            java.util.ArrayList<a.a.a.b.c$b> r2 = r7.f8a     // Catch: java.lang.Throwable -> L27
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L27
            r3 = 1
            r4 = r0
        Lc:
            boolean r5 = r2.hasNext()     // Catch: java.lang.Throwable -> L2d
            if (r5 == 0) goto L25
            java.lang.Object r5 = r2.next()     // Catch: java.lang.Throwable -> L2d
            a.a.a.b.c$b r5 = (a.a.a.b.c.b) r5     // Catch: java.lang.Throwable -> L2d
            com.baidu.location.i r5 = r5.f13c     // Catch: java.lang.Throwable -> L2d
            boolean r6 = r5.f1372c     // Catch: java.lang.Throwable -> L2d
            if (r6 == 0) goto L1f
            r0 = r3
        L1f:
            boolean r5 = r5.h     // Catch: java.lang.Throwable -> L2d
            if (r5 == 0) goto Lc
            r4 = r3
            goto Lc
        L25:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2d
            goto L34
        L27:
            r2 = move-exception
            r4 = r0
        L29:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2d
            throw r2     // Catch: java.lang.Exception -> L2b
        L2b:
            r1 = move-exception
            goto L31
        L2d:
            r2 = move-exception
            goto L29
        L2f:
            r1 = move-exception
            r4 = r0
        L31:
            r1.printStackTrace()
        L34:
            a.a.a.i.i.f354a = r4
            boolean r1 = r7.f9b
            if (r1 != r0) goto L48
            a.a.a.g.d r1 = a.a.a.g.d.n()
            boolean r1 = r1.h()
            if (r1 != 0) goto L53
            boolean r1 = r7.f9b
            if (r1 == 0) goto L53
        L48:
            r7.f9b = r0
            a.a.a.g.d r0 = a.a.a.g.d.n()
            boolean r7 = r7.f9b
            r0.a(r7)
        L53:
            return
    }

    public final void a(a.a.a.b.c.b r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            java.lang.Object r0 = r2.f
            monitor-enter(r0)
            android.os.Messenger r1 = r3.f12b     // Catch: java.lang.Throwable -> L20
            a.a.a.b.c$b r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L14
            r2 = 14
            a.a.a.b.c.b.a(r3, r2)     // Catch: java.lang.Throwable -> L20
            goto L1e
        L14:
            java.util.ArrayList<a.a.a.b.c$b> r2 = r2.f8a     // Catch: java.lang.Throwable -> L20
            r2.add(r3)     // Catch: java.lang.Throwable -> L20
            r2 = 13
            a.a.a.b.c.b.a(r3, r2)     // Catch: java.lang.Throwable -> L20
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            return
        L20:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            throw r2
    }

    public void a(android.os.Bundle r4, int r5) {
            r3 = this;
            java.lang.Object r0 = r3.f
            monitor-enter(r0)
            java.util.ArrayList<a.a.a.b.c$b> r3 = r3.f8a     // Catch: java.lang.Throwable -> L23
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L23
        L9:
            boolean r1 = r3.hasNext()     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L23
            if (r1 == 0) goto L21
            java.lang.Object r1 = r3.next()     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L23
            a.a.a.b.c$b r1 = (a.a.a.b.c.b) r1     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L23
            a.a.a.b.c.b.a(r1, r5, r4)     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L23
            int r1 = r1.d     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L23
            r2 = 4
            if (r1 <= r2) goto L9
            r3.remove()     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L23
            goto L9
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return
        L23:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r3
    }

    public void a(com.baidu.location.c r5) {
            r4 = this;
            a.a.a.b.o r0 = a.a.a.b.o.q()
            com.baidu.location.a r0 = r0.a(r5)
            a.a.a.b.o r1 = a.a.a.b.o.q()
            java.lang.String r1 = r1.h()
            a.a.a.b.o r2 = a.a.a.b.o.q()
            java.util.List r2 = r2.i()
            a.a.a.b.o r3 = a.a.a.b.o.q()
            com.baidu.location.k r3 = r3.j()
            if (r0 == 0) goto L25
            r5.a(r0)
        L25:
            if (r1 == 0) goto L2a
            r5.j(r1)
        L2a:
            if (r2 == 0) goto L2f
            r5.a(r2)
        L2f:
            if (r3 == 0) goto L34
            r5.a(r3)
        L34:
            a.a.a.d.i r0 = a.a.a.d.i.m()
            boolean r0 = r0.g()
            if (r0 == 0) goto L6c
            a.a.a.d.i r0 = a.a.a.d.i.m()
            java.lang.String r0 = r0.d()
            if (r0 == 0) goto L6c
            a.a.a.d.i r0 = a.a.a.d.i.m()
            java.lang.String r0 = r0.d()
            r5.f(r0)
            r0 = 1
            r5.a(r0)
            a.a.a.d.i r0 = a.a.a.d.i.m()
            java.lang.String r0 = r0.c()
            if (r0 == 0) goto L6c
            a.a.a.d.i r0 = a.a.a.d.i.m()
            java.lang.String r0 = r0.c()
            r5.c(r0)
        L6c:
            r4.c(r5)
            a.a.a.b.o r4 = a.a.a.b.o.q()
            r4.d(r5)
            return
    }

    public final void a(java.lang.String r2) {
            r1 = this;
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r0 = "com.baidu.location.flp.log"
            r1.<init>(r0)
            java.lang.String r0 = "com.baidu.baidulocationdemo"
            r1.setPackage(r0)
            java.lang.String r0 = "data"
            r1.putExtra(r0, r2)
            java.lang.String r2 = a.a.a.i.b.f
            java.lang.String r0 = "pack"
            r1.putExtra(r0, r2)
            java.lang.String r2 = "tag"
            java.lang.String r0 = "state"
            r1.putExtra(r2, r0)
            android.content.Context r2 = com.baidu.location.f.c()
            r2.sendBroadcast(r1)
            return
    }

    public void a(boolean r1) {
            r0 = this;
            return
    }

    public boolean a(android.os.Message r9) {
            r8 = this;
            android.os.Messenger r0 = r9.replyTo
            a.a.a.b.c$b r0 = r8.a(r0)
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            com.baidu.location.i r2 = r0.f13c
            int r3 = r2.d
            android.os.Bundle r4 = r9.getData()
            com.baidu.location.i r5 = r0.f13c
            int r5 = r5.d
            java.lang.String r6 = "scanSpan"
            int r4 = r4.getInt(r6, r5)
            r2.d = r4
            com.baidu.location.i r2 = r0.f13c
            int r2 = r2.d
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r2 >= r4) goto L2d
            a.a.a.b.t r2 = a.a.a.b.t.e()
            r2.d()
        L2d:
            com.baidu.location.i r2 = r0.f13c
            int r5 = r2.d
            r6 = 999(0x3e7, float:1.4E-42)
            r7 = 1
            if (r5 <= r6) goto L60
            if (r3 >= r4) goto L60
            boolean r3 = r2.n
            if (r3 != 0) goto L40
            boolean r2 = r2.s
            if (r2 == 0) goto L52
        L40:
            a.a.a.b.t r2 = a.a.a.b.t.e()
            com.baidu.location.i r3 = r0.f13c
            boolean r3 = r3.n
            r2.b(r3)
            a.a.a.b.t r2 = a.a.a.b.t.e()
            r2.c()
        L52:
            boolean r2 = r8.f10c
            if (r2 != 0) goto L5c
            com.baidu.location.i r2 = r0.f13c
            boolean r2 = r2.s
            if (r2 == 0) goto L5d
        L5c:
            r1 = r7
        L5d:
            r8.f10c = r1
            r1 = r7
        L60:
            com.baidu.location.i r2 = r0.f13c
            android.os.Bundle r3 = r9.getData()
            com.baidu.location.i r4 = r0.f13c
            boolean r4 = r4.f1372c
            java.lang.String r5 = "openGPS"
            boolean r3 = r3.getBoolean(r5, r4)
            r2.f1372c = r3
            android.os.Bundle r2 = r9.getData()
            java.lang.String r3 = "coorType"
            java.lang.String r2 = r2.getString(r3)
            com.baidu.location.i r3 = r0.f13c
            java.lang.String r4 = ""
            if (r2 == 0) goto L89
            boolean r5 = r2.equals(r4)
            if (r5 != 0) goto L89
            goto L8d
        L89:
            com.baidu.location.i r2 = r0.f13c
            java.lang.String r2 = r2.f1370a
        L8d:
            r3.f1370a = r2
            android.os.Bundle r2 = r9.getData()
            java.lang.String r3 = "addrType"
            java.lang.String r2 = r2.getString(r3)
            com.baidu.location.i r3 = r0.f13c
            if (r2 == 0) goto La4
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto La4
            goto La8
        La4:
            com.baidu.location.i r2 = r0.f13c
            java.lang.String r2 = r2.f1371b
        La8:
            r3.f1371b = r2
            java.lang.String r2 = a.a.a.i.i.d
            com.baidu.location.i r3 = r0.f13c
            java.lang.String r3 = r3.f1371b
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Lbd
            a.a.a.b.o r2 = a.a.a.b.o.q()
            r2.c()
        Lbd:
            com.baidu.location.i r2 = r0.f13c
            android.os.Bundle r3 = r9.getData()
            com.baidu.location.i r4 = r0.f13c
            int r4 = r4.e
            java.lang.String r5 = "timeOut"
            int r3 = r3.getInt(r5, r4)
            r2.e = r3
            com.baidu.location.i r2 = r0.f13c
            android.os.Bundle r3 = r9.getData()
            com.baidu.location.i r4 = r0.f13c
            boolean r4 = r4.h
            java.lang.String r5 = "location_change_notify"
            boolean r3 = r3.getBoolean(r5, r4)
            r2.h = r3
            com.baidu.location.i r2 = r0.f13c
            android.os.Bundle r3 = r9.getData()
            com.baidu.location.i r4 = r0.f13c
            int r4 = r4.g
            java.lang.String r5 = "priority"
            int r3 = r3.getInt(r5, r4)
            r2.g = r3
            com.baidu.location.i r0 = r0.f13c
            int r0 = r0.g
            a.a.a.i.i.e = r0
            android.os.Bundle r9 = r9.getData()
            r0 = 2147483647(0x7fffffff, float:NaN)
            java.lang.String r2 = "wifitimeout"
            int r9 = r9.getInt(r2, r0)
            int r0 = a.a.a.i.i.a0
            if (r9 >= r0) goto L10c
            a.a.a.i.i.a0 = r9
        L10c:
            r8.b()
            return r1
    }

    public int b(android.os.Message r2) {
            r1 = this;
            r0 = 1
            if (r2 == 0) goto L16
            android.os.Messenger r2 = r2.replyTo
            if (r2 != 0) goto L8
            goto L16
        L8:
            a.a.a.b.c$b r1 = r1.a(r2)
            if (r1 == 0) goto L16
            com.baidu.location.i r1 = r1.f13c
            if (r1 != 0) goto L13
            goto L16
        L13:
            int r1 = a.a.a.i.i.e
            return r1
        L16:
            return r0
    }

    public final void b() {
            r0 = this;
            r0.a()
            r0.e()
            r0.g()
            return
    }

    public void b(com.baidu.location.c r1) {
            r0 = this;
            r0.a(r1)
            return
    }

    public int c(android.os.Message r2) {
            r1 = this;
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r2 == 0) goto L17
            android.os.Messenger r2 = r2.replyTo
            if (r2 != 0) goto L9
            goto L17
        L9:
            a.a.a.b.c$b r1 = r1.a(r2)
            if (r1 == 0) goto L17
            com.baidu.location.i r1 = r1.f13c
            if (r1 != 0) goto L14
            goto L17
        L14:
            int r1 = r1.d
            return r1
        L17:
            return r0
    }

    public void c() {
            r2 = this;
            java.lang.Object r0 = r2.f
            monitor-enter(r0)
            java.util.ArrayList<a.a.a.b.c$b> r1 = r2.f8a     // Catch: java.lang.Throwable -> La
            if (r1 == 0) goto La
            r1.clear()     // Catch: java.lang.Throwable -> La
        La:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            r0 = 0
            r2.d = r0
            r2.b()
            return
        L12:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r2
    }

    public void c(com.baidu.location.c r1) {
            r0 = this;
            r0.d(r1)
            return
    }

    public java.lang.String d() {
            r5 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r1 = 256(0x100, float:3.59E-43)
            r0.<init>(r1)
            java.util.ArrayList<a.a.a.b.c$b> r1 = r5.f8a
            boolean r1 = r1.isEmpty()
            java.lang.String r2 = ":"
            java.lang.String r3 = "&prod="
            if (r1 == 0) goto L2d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r0 = a.a.a.i.b.g
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = a.a.a.i.b.f
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            return r5
        L2d:
            java.lang.String r1 = r0.toString()
            java.util.ArrayList<a.a.a.b.c$b> r5 = r5.f8a     // Catch: java.lang.Exception -> L84
            r4 = 0
            java.lang.Object r5 = r5.get(r4)     // Catch: java.lang.Exception -> L84
            a.a.a.b.c$b r5 = (a.a.a.b.c.b) r5     // Catch: java.lang.Exception -> L84
            com.baidu.location.i r4 = r5.f13c     // Catch: java.lang.Exception -> L84
            java.lang.String r4 = r4.f     // Catch: java.lang.Exception -> L84
            if (r4 == 0) goto L43
            r0.append(r4)     // Catch: java.lang.Exception -> L84
        L43:
            java.lang.String r4 = r5.f11a     // Catch: java.lang.Exception -> L84
            if (r4 == 0) goto L54
            r0.append(r2)     // Catch: java.lang.Exception -> L84
            java.lang.String r5 = r5.f11a     // Catch: java.lang.Exception -> L84
            r0.append(r5)     // Catch: java.lang.Exception -> L84
            java.lang.String r5 = "|"
            r0.append(r5)     // Catch: java.lang.Exception -> L84
        L54:
            if (r1 == 0) goto L6a
            java.lang.String r5 = ""
            boolean r5 = r1.equals(r5)     // Catch: java.lang.Exception -> L84
            if (r5 != 0) goto L6a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L84
            r5.<init>()     // Catch: java.lang.Exception -> L84
            r5.append(r3)     // Catch: java.lang.Exception -> L84
            r5.append(r1)     // Catch: java.lang.Exception -> L84
            goto L7f
        L6a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L84
            r5.<init>()     // Catch: java.lang.Exception -> L84
            r5.append(r3)     // Catch: java.lang.Exception -> L84
            java.lang.String r0 = a.a.a.i.b.g     // Catch: java.lang.Exception -> L84
            r5.append(r0)     // Catch: java.lang.Exception -> L84
            r5.append(r2)     // Catch: java.lang.Exception -> L84
            java.lang.String r0 = a.a.a.i.b.f     // Catch: java.lang.Exception -> L84
            r5.append(r0)     // Catch: java.lang.Exception -> L84
        L7f:
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L84
            goto L9d
        L84:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r0 = a.a.a.i.b.g
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = a.a.a.i.b.f
            r5.append(r0)
            java.lang.String r5 = r5.toString()
        L9d:
            return r5
    }

    public void d(android.os.Message r3) {
            r2 = this;
            if (r3 == 0) goto L28
            android.os.Messenger r0 = r3.replyTo
            if (r0 != 0) goto L7
            goto L28
        L7:
            long r0 = java.lang.System.currentTimeMillis()
            a.a.a.b.c.i = r0
            a.a.a.g.f r0 = a.a.a.g.f.w()
            r0.r()
            a.a.a.b.c$b r0 = new a.a.a.b.c$b
            r0.<init>(r2, r3)
            r2.a(r0)
            r2.b()
            boolean r3 = r2.h
            if (r3 == 0) goto L28
            java.lang.String r3 = "start"
            r2.a(r3)
        L28:
            return
    }

    public void d(com.baidu.location.c r14) {
            r13 = this;
            r0 = 4
            r1 = 66
            r2 = 0
            r3 = 61
            r4 = 161(0xa1, float:2.26E-43)
            if (r14 == 0) goto L51
            int r5 = r14.r()
            if (r5 != r4) goto L51
            a.a.a.a.a r5 = a.a.a.a.a.b()
            boolean r5 = r5.a()
            if (r5 != 0) goto L51
            com.baidu.location.c r5 = r13.e
            if (r5 != 0) goto L2a
            com.baidu.location.c r5 = new com.baidu.location.c
            r5.<init>()
            r13.e = r5
            r6 = 505(0x1f9, float:7.08E-43)
            r5.h(r6)
        L2a:
            java.lang.Object r5 = r13.f
            monitor-enter(r5)
            java.util.ArrayList<a.a.a.b.c$b> r6 = r13.f8a     // Catch: java.lang.Throwable -> L4e
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L4e
        L33:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Exception -> L4c java.lang.Throwable -> L4e
            if (r7 == 0) goto L4c
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Exception -> L4c java.lang.Throwable -> L4e
            a.a.a.b.c$b r7 = (a.a.a.b.c.b) r7     // Catch: java.lang.Exception -> L4c java.lang.Throwable -> L4e
            com.baidu.location.c r8 = r13.e     // Catch: java.lang.Exception -> L4c java.lang.Throwable -> L4e
            r7.a(r8)     // Catch: java.lang.Exception -> L4c java.lang.Throwable -> L4e
            int r7 = r7.d     // Catch: java.lang.Exception -> L4c java.lang.Throwable -> L4e
            if (r7 <= r0) goto L33
            r6.remove()     // Catch: java.lang.Exception -> L4c java.lang.Throwable -> L4e
            goto L33
        L4c:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4e
            goto Lba
        L4e:
            r13 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4e
            throw r13
        L51:
            boolean r5 = r14.H()
            if (r5 != 0) goto L88
            boolean r5 = r13.f10c
            if (r5 == 0) goto L88
            int r5 = r14.r()
            if (r5 == r4) goto L67
            int r5 = r14.r()
            if (r5 != r1) goto L88
        L67:
            a.a.a.c.a r5 = a.a.a.c.a.d()
            double r6 = r14.t()
            double r8 = r14.q()
            double[] r5 = r5.a(r6, r8)
            r5 = r5[r2]
            a.a.a.c.a.d()
            r7 = 4666722622711529472(0x40c3878000000000, double:9999.0)
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 >= 0) goto L88
            r14.a(r5)
        L88:
            int r5 = r14.r()
            if (r5 != r3) goto L99
            a.a.a.c.a r5 = a.a.a.c.a.d()
            int r5 = r5.a(r14)
            r14.a(r5)
        L99:
            java.lang.Object r5 = r13.f
            monitor-enter(r5)
            java.util.ArrayList<a.a.a.b.c$b> r6 = r13.f8a     // Catch: java.lang.Throwable -> L140
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L140
        La2:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Exception -> Lb9 java.lang.Throwable -> L140
            if (r7 == 0) goto Lb9
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Exception -> Lb9 java.lang.Throwable -> L140
            a.a.a.b.c$b r7 = (a.a.a.b.c.b) r7     // Catch: java.lang.Exception -> Lb9 java.lang.Throwable -> L140
            r7.a(r14)     // Catch: java.lang.Exception -> Lb9 java.lang.Throwable -> L140
            int r7 = r7.d     // Catch: java.lang.Exception -> Lb9 java.lang.Throwable -> L140
            if (r7 <= r0) goto La2
            r6.remove()     // Catch: java.lang.Exception -> Lb9 java.lang.Throwable -> L140
            goto La2
        Lb9:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L140
        Lba:
            if (r14 == 0) goto Le8
            int r0 = r14.r()
            if (r0 == r3) goto Lce
            int r0 = r14.r()
            if (r0 == r4) goto Lce
            int r0 = r14.r()
            if (r0 != r1) goto Le8
        Lce:
            a.a.a.b.d r0 = a.a.a.b.d.i()
            double r5 = r14.q()
            double r7 = r14.t()
            r0.a(r5, r7)
            a.a.a.b.d r0 = a.a.a.b.d.i()
            java.lang.String r5 = r14.g()
            r0.c(r5)
        Le8:
            boolean r0 = a.a.a.b.o.a0
            if (r0 == 0) goto Lee
            a.a.a.b.o.a0 = r2
        Lee:
            int r5 = a.a.a.i.i.T
            r6 = 10000(0x2710, float:1.4013E-41)
            if (r5 < r6) goto L13f
            int r5 = r14.r()
            if (r5 == r3) goto L106
            int r3 = r14.r()
            if (r3 == r4) goto L106
            int r3 = r14.r()
            if (r3 != r1) goto L13f
        L106:
            com.baidu.location.c r1 = r13.d
            if (r1 == 0) goto L138
            r3 = 1
            float[] r3 = new float[r3]
            double r4 = r1.q()
            com.baidu.location.c r1 = r13.d
            double r6 = r1.t()
            double r8 = r14.q()
            double r10 = r14.t()
            r12 = r3
            android.location.Location.distanceBetween(r4, r6, r8, r10, r12)
            r1 = r3[r2]
            int r2 = a.a.a.i.i.V
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L12f
            if (r0 != 0) goto L12f
            return
        L12f:
            r0 = 0
            r13.d = r0
            com.baidu.location.c r0 = new com.baidu.location.c
            r0.<init>(r14)
            goto L13d
        L138:
            com.baidu.location.c r0 = new com.baidu.location.c
            r0.<init>(r14)
        L13d:
            r13.d = r0
        L13f:
            return
        L140:
            r13 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L140
            throw r13
    }

    public void e() {
            r2 = this;
            java.lang.Object r0 = r2.f     // Catch: java.lang.Exception -> L1e
            monitor-enter(r0)     // Catch: java.lang.Exception -> L1e
            java.util.ArrayList<a.a.a.b.c$b> r2 = r2.f8a     // Catch: java.lang.Throwable -> L1b
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L1b
        L9:
            boolean r1 = r2.hasNext()     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L19
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L1b
            a.a.a.b.c$b r1 = (a.a.a.b.c.b) r1     // Catch: java.lang.Throwable -> L1b
            r1.a()     // Catch: java.lang.Throwable -> L1b
            goto L9
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            goto L22
        L1b:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r2     // Catch: java.lang.Exception -> L1e
        L1e:
            r2 = move-exception
            r2.printStackTrace()
        L22:
            return
    }

    public void e(android.os.Message r3) {
            r2 = this;
            java.lang.Object r0 = r2.f
            monitor-enter(r0)
            android.os.Messenger r3 = r3.replyTo     // Catch: java.lang.Throwable -> L25
            a.a.a.b.c$b r3 = r2.a(r3)     // Catch: java.lang.Throwable -> L25
            if (r3 == 0) goto L10
            java.util.ArrayList<a.a.a.b.c$b> r1 = r2.f8a     // Catch: java.lang.Throwable -> L25
            r1.remove(r3)     // Catch: java.lang.Throwable -> L25
        L10:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            a.a.a.b.t r3 = a.a.a.b.t.e()
            r3.d()
            r2.b()
            boolean r3 = r2.h
            if (r3 == 0) goto L24
            java.lang.String r3 = "stop"
            r2.a(r3)
        L24:
            return
        L25:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            throw r2
    }

    public void f() {
            r2 = this;
            java.lang.Object r0 = r2.f
            monitor-enter(r0)
            java.util.ArrayList<a.a.a.b.c$b> r2 = r2.f8a     // Catch: java.lang.Throwable -> L1b
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L1b
        L9:
            boolean r1 = r2.hasNext()     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L19
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L1b
            a.a.a.b.c$b r1 = (a.a.a.b.c.b) r1     // Catch: java.lang.Throwable -> L1b
            r1.b()     // Catch: java.lang.Throwable -> L1b
            goto L9
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return
        L1b:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r2
    }

    public final void g() {
            r2 = this;
            java.util.ArrayList<a.a.a.b.c$b> r2 = r2.f8a     // Catch: java.lang.Exception -> L27
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> L27
        L6:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> L27
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Exception -> L27
            a.a.a.b.c$b r0 = (a.a.a.b.c.b) r0     // Catch: java.lang.Exception -> L27
            int r1 = a.a.a.i.i.e     // Catch: java.lang.Exception -> L27
            com.baidu.location.i r0 = r0.f13c     // Catch: java.lang.Exception -> L27
            int r0 = r0.g     // Catch: java.lang.Exception -> L27
            int r0 = java.lang.Math.min(r1, r0)     // Catch: java.lang.Exception -> L27
            a.a.a.i.i.e = r0     // Catch: java.lang.Exception -> L27
            goto L6
        L1f:
            boolean r2 = com.baidu.location.f.f     // Catch: java.lang.Exception -> L27
            if (r2 != 0) goto L2b
            r2 = 4
            a.a.a.i.i.e = r2     // Catch: java.lang.Exception -> L27
            goto L2b
        L27:
            r2 = move-exception
            r2.printStackTrace()
        L2b:
            return
    }
}
