package a.a.a.g;

/* JADX INFO: loaded from: classes.dex */
public class d {
    public static a.a.a.g.d U = null;
    public static android.location.Location V = null;
    public static int W = -1;
    public static int X = 0;
    public static int Y = 0;
    public static int Z = 0;
    public static int a0 = 0;
    public static int b0 = 0;
    public static int c0 = 0;
    public static int d0 = 0;
    public static int e0 = 0;
    public static int f0 = 0;
    public static int g0 = 0;
    public static long h0 = 0;
    public static java.lang.String i0 = null;
    public static double j0 = 100.0d;
    public static java.lang.String k0 = "";
    public static java.lang.String l0 = "";
    public static float m0 = -1.0f;
    public java.util.ArrayList<java.util.ArrayList<java.lang.Float>> A;
    public java.util.ArrayList<java.util.ArrayList<java.lang.Float>> B;
    public java.util.ArrayList<java.util.ArrayList<java.lang.Float>> C;
    public java.util.ArrayList<java.util.ArrayList<java.lang.Float>> D;
    public java.util.ArrayList<java.util.ArrayList<java.lang.Float>> E;
    public java.util.ArrayList<java.util.ArrayList<java.lang.Float>> F;
    public java.util.ArrayList<java.util.ArrayList<java.lang.Float>> G;
    public java.lang.String H;
    public long I;
    public long J;
    public long K;
    public com.baidu.location.c L;
    public boolean M;
    public boolean N;
    public long O;
    public boolean P;
    public boolean Q;
    public long R;
    public boolean S;
    public long T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public android.content.Context f263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public android.location.LocationManager f264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public android.location.Location f265c;
    public a.a.a.g.d.g d;
    public a.a.a.g.d.i e;
    public android.location.GpsStatus f;
    public a.a.a.g.d.C0015d g;
    public boolean h;
    public a.a.a.g.d.e i;
    public boolean j;
    public android.location.GpsStatus.NmeaListener k;
    public android.location.OnNmeaMessageListener l;
    public long m;
    public boolean n;
    public boolean o;
    public boolean p;
    public long q;
    public double r;
    public double s;
    public long t;
    public long u;
    public long v;
    public a.a.a.g.d.f w;
    public long x;
    public a.a.a.g.d.b y;
    public a.a.a.g.d.c z;

    public class a implements android.location.OnNmeaMessageListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.a.a.g.d f266a;

        public a(a.a.a.g.d r1) {
                r0 = this;
                r0.f266a = r1
                r0.<init>()
                return
        }

        @Override // android.location.OnNmeaMessageListener
        public void onNmeaMessage(java.lang.String r1, long r2) {
                r0 = this;
                a.a.a.g.d r2 = r0.f266a
                a.a.a.g.d$f r2 = a.a.a.g.d.m(r2)
                if (r2 == 0) goto L1c
                a.a.a.g.d r2 = r0.f266a
                a.a.a.g.d$f r2 = a.a.a.g.d.m(r2)
                r3 = 5
                android.os.Message r1 = r2.obtainMessage(r3, r1)
                a.a.a.g.d r0 = r0.f266a
                a.a.a.g.d$f r0 = a.a.a.g.d.m(r0)
                r0.sendMessage(r1)
            L1c:
                return
        }
    }

    @android.annotation.TargetApi(24)
    public class b extends android.location.GnssMeasurementsEvent.Callback {
    }

    @android.annotation.TargetApi(24)
    public class c extends android.location.GnssNavigationMessage.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.a.a.g.d f267a;

        public c(a.a.a.g.d r1) {
                r0 = this;
                r0.f267a = r1
                r0.<init>()
                return
        }

        public /* synthetic */ c(a.a.a.g.d r1, a.a.a.g.d.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.location.GnssNavigationMessage.Callback
        public void onGnssNavigationMessageReceived(android.location.GnssNavigationMessage r5) {
                r4 = this;
                a.a.a.g.d r0 = r4.f267a
                long r0 = a.a.a.g.d.b(r0)
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto L1a
                a.a.a.b.z r0 = a.a.a.b.z.f()
                a.a.a.g.d r4 = r4.f267a
                long r1 = a.a.a.g.d.b(r4)
                r0.a(r5, r1)
                goto L28
            L1a:
                a.a.a.b.z r4 = a.a.a.b.z.f()
                long r0 = java.lang.System.currentTimeMillis()
                r2 = 1000(0x3e8, double:4.94E-321)
                long r0 = r0 / r2
                r4.a(r5, r0)
            L28:
                return
        }

        @Override // android.location.GnssNavigationMessage.Callback
        public void onStatusChanged(int r1) {
                r0 = this;
                return
        }
    }

    /* JADX INFO: renamed from: a.a.a.g.d$d, reason: collision with other inner class name */
    @android.annotation.TargetApi(24)
    public class C0015d extends android.location.GnssStatus.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.a.a.g.d f268a;

        public C0015d(a.a.a.g.d r1) {
                r0 = this;
                r0.f268a = r1
                r0.<init>()
                return
        }

        public /* synthetic */ C0015d(a.a.a.g.d r1, a.a.a.g.d.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(int r1) {
                r0 = this;
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(android.location.GnssStatus r15) {
                r14 = this;
                a.a.a.g.d r0 = r14.f268a
                android.location.LocationManager r0 = a.a.a.g.d.e(r0)
                if (r0 != 0) goto L9
                return
            L9:
                if (r15 != 0) goto Lc
                return
            Lc:
                a.a.a.g.d r0 = r14.f268a
                long r1 = java.lang.System.currentTimeMillis()
                a.a.a.g.d.e(r0, r1)
                int r0 = r15.getSatelliteCount()
                a.a.a.g.d r1 = r14.f268a
                java.util.ArrayList r1 = a.a.a.g.d.f(r1)
                r1.clear()
                a.a.a.g.d r1 = r14.f268a
                java.util.ArrayList r1 = a.a.a.g.d.g(r1)
                r1.clear()
                a.a.a.g.d r1 = r14.f268a
                java.util.ArrayList r1 = a.a.a.g.d.h(r1)
                r1.clear()
                a.a.a.g.d r1 = r14.f268a
                java.util.ArrayList r1 = a.a.a.g.d.i(r1)
                r1.clear()
                r1 = 0
                r2 = r1
                r3 = r2
                r4 = r3
                r5 = r4
            L42:
                r6 = 1
                if (r2 >= r0) goto Lf7
                int r3 = r3 + 1
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                int r8 = r15.getConstellationType(r2)
                float r9 = r15.getAzimuthDegrees(r2)
                java.lang.Float r9 = java.lang.Float.valueOf(r9)
                r7.add(r9)
                float r9 = r15.getElevationDegrees(r2)
                java.lang.Float r9 = java.lang.Float.valueOf(r9)
                r7.add(r9)
                float r9 = r15.getCn0DbHz(r2)
                java.lang.Float r9 = java.lang.Float.valueOf(r9)
                r7.add(r9)
                boolean r9 = r15.usedInFix(r2)
                r10 = 1065353216(0x3f800000, float:1.0)
                if (r9 == 0) goto L87
                int r4 = r4 + 1
                java.lang.Float r9 = java.lang.Float.valueOf(r10)
                r7.add(r9)
                if (r8 != r6) goto L8f
                int r5 = r5 + 1
                goto L8f
            L87:
                r9 = 0
                java.lang.Float r9 = java.lang.Float.valueOf(r9)
                r7.add(r9)
            L8f:
                int r9 = r15.getSvid(r2)
                float r9 = (float) r9
                java.lang.Float r9 = java.lang.Float.valueOf(r9)
                r7.add(r9)
                if (r8 != r6) goto Lae
                java.lang.Float r6 = java.lang.Float.valueOf(r10)
                r7.add(r6)
                a.a.a.g.d r6 = r14.f268a
                java.util.ArrayList r6 = a.a.a.g.d.f(r6)
            Laa:
                r6.add(r7)
                goto Lf3
            Lae:
                r6 = 5
                if (r8 != r6) goto Lcd
                r6 = 1073741824(0x40000000, float:2.0)
                java.lang.Float r6 = java.lang.Float.valueOf(r6)
                r7.add(r6)
                a.a.a.g.d r6 = r14.f268a
                java.util.ArrayList r6 = a.a.a.g.d.g(r6)
                r6.add(r7)
                a.a.a.g.d r6 = r14.f268a
                long r7 = java.lang.System.currentTimeMillis()
                a.a.a.g.d.g(r6, r7)
                goto Lf3
            Lcd:
                r6 = 3
                if (r8 != r6) goto Le0
                r6 = 1077936128(0x40400000, float:3.0)
                java.lang.Float r6 = java.lang.Float.valueOf(r6)
                r7.add(r6)
                a.a.a.g.d r6 = r14.f268a
                java.util.ArrayList r6 = a.a.a.g.d.h(r6)
                goto Laa
            Le0:
                r6 = 6
                if (r8 != r6) goto Lf3
                r6 = 1082130432(0x40800000, float:4.0)
                java.lang.Float r6 = java.lang.Float.valueOf(r6)
                r7.add(r6)
                a.a.a.g.d r6 = r14.f268a
                java.util.ArrayList r6 = a.a.a.g.d.i(r6)
                goto Laa
            Lf3:
                int r2 = r2 + 1
                goto L42
            Lf7:
                java.util.ArrayList r15 = new java.util.ArrayList
                r15.<init>()
                a.a.a.g.d r0 = r14.f268a
                java.util.ArrayList r0 = a.a.a.g.d.f(r0)
                r15.addAll(r0)
                a.a.a.g.d r0 = r14.f268a
                java.util.ArrayList r0 = a.a.a.g.d.g(r0)
                r15.addAll(r0)
                a.a.a.g.d r0 = r14.f268a
                java.util.ArrayList r0 = a.a.a.g.d.h(r0)
                r15.addAll(r0)
                a.a.a.g.d r0 = r14.f268a
                java.util.ArrayList r0 = a.a.a.g.d.i(r0)
                r15.addAll(r0)
                a.a.a.g.d r0 = r14.f268a
                a.a.a.g.d.a(r0, r15)
                a.a.a.g.d r15 = r14.f268a
                r8 = 1
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 1
                r13 = -1082130432(0xffffffffbf800000, float:-1.0)
                r7 = r15
                java.util.ArrayList r0 = a.a.a.g.d.a(r7, r8, r9, r10, r11, r12, r13)
                a.a.a.g.d.b(r15, r0)
                a.a.a.g.d r15 = r14.f268a
                java.util.ArrayList r0 = a.a.a.g.d.j(r15)
                java.lang.String r15 = a.a.a.g.d.c(r15, r0)
                a.a.a.g.d.k0 = r15
                a.a.a.g.d r15 = r14.f268a
                r9 = 1
                r10 = 1
                r11 = 1
                r7 = r15
                java.util.ArrayList r0 = a.a.a.g.d.a(r7, r8, r9, r10, r11, r12, r13)
                a.a.a.g.d.d(r15, r0)
                a.a.a.g.d r15 = r14.f268a
                r12 = 0
                r7 = r15
                java.util.ArrayList r0 = a.a.a.g.d.a(r7, r8, r9, r10, r11, r12, r13)
                a.a.a.g.d.e(r15, r0)
                a.a.a.g.d r15 = r14.f268a
                java.util.ArrayList r0 = a.a.a.g.d.k(r15)
                java.lang.String r15 = a.a.a.g.d.c(r15, r0)
                a.a.a.g.d.l0 = r15
                a.a.a.b.d r15 = a.a.a.b.d.i()
                int r15 = r15.F
                if (r15 != r6) goto L17b
                a.a.a.b.i r15 = a.a.a.b.i.d()
                a.a.a.g.d r0 = r14.f268a
                java.util.ArrayList r0 = a.a.a.g.d.k(r0)
                r15.a(r0)
            L17b:
                a.a.a.g.d.X = r4
                a.a.a.g.d.b(r5)
                a.a.a.g.d.j(r3)
                long r2 = java.lang.System.currentTimeMillis()
                a.a.a.g.d.a(r2)
                a.a.a.g.d r15 = r14.f268a
                java.util.ArrayList r0 = a.a.a.g.d.h(r15)
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                java.util.ArrayList r15 = a.a.a.g.d.a(r15, r0, r6, r2)
                int r15 = r15.size()
                a.a.a.g.d.c(r15)
                a.a.a.g.d r15 = r14.f268a
                java.util.ArrayList r0 = a.a.a.g.d.i(r15)
                java.util.ArrayList r15 = a.a.a.g.d.a(r15, r0, r6, r2)
                int r15 = r15.size()
                a.a.a.g.d.d(r15)
                a.a.a.g.d r15 = r14.f268a
                java.util.ArrayList r0 = a.a.a.g.d.g(r15)
                java.util.ArrayList r15 = a.a.a.g.d.a(r15, r0, r6, r2)
                int r15 = r15.size()
                a.a.a.g.d.e(r15)
                a.a.a.g.d r15 = r14.f268a
                java.util.ArrayList r0 = a.a.a.g.d.f(r15)
                java.util.ArrayList r15 = a.a.a.g.d.a(r15, r0, r1, r2)
                int r15 = r15.size()
                a.a.a.g.d.f(r15)
                a.a.a.g.d r15 = r14.f268a
                java.util.ArrayList r0 = a.a.a.g.d.h(r15)
                java.util.ArrayList r15 = a.a.a.g.d.a(r15, r0, r1, r2)
                int r15 = r15.size()
                a.a.a.g.d.g(r15)
                a.a.a.g.d r15 = r14.f268a
                java.util.ArrayList r0 = a.a.a.g.d.i(r15)
                java.util.ArrayList r15 = a.a.a.g.d.a(r15, r0, r1, r2)
                int r15 = r15.size()
                a.a.a.g.d.h(r15)
                a.a.a.g.d r14 = r14.f268a
                java.util.ArrayList r15 = a.a.a.g.d.g(r14)
                java.util.ArrayList r14 = a.a.a.g.d.a(r14, r15, r1, r2)
                int r14 = r14.size()
                a.a.a.g.d.i(r14)
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
                r0 = this;
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
                r2 = this;
                a.a.a.g.d r0 = r2.f268a
                r1 = 0
                a.a.a.g.d.a(r0, r1)
                a.a.a.g.d r2 = r2.f268a
                r0 = 0
                a.a.a.g.d.a(r2, r0)
                a.a.a.g.d.X = r0
                a.a.a.g.d.b(r0)
                a.a.a.g.d.c(r0)
                a.a.a.g.d.d(r0)
                a.a.a.g.d.e(r0)
                a.a.a.g.d.f(r0)
                a.a.a.g.d.g(r0)
                a.a.a.g.d.h(r0)
                a.a.a.g.d.i(r0)
                a.a.a.g.d.j(r0)
                r2 = -1
                a.a.a.g.d.k(r2)
                a.a.a.g.d.c(r1)
                return
        }
    }

    public class e implements android.location.GpsStatus.Listener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.a.a.g.d f270b;

        public e(a.a.a.g.d r3) {
                r2 = this;
                r2.f270b = r3
                r2.<init>()
                r0 = 0
                r2.f269a = r0
                return
        }

        public /* synthetic */ e(a.a.a.g.d r1, a.a.a.g.d.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.location.GpsStatus.Listener
        public void onGpsStatusChanged(int r12) {
                r11 = this;
                a.a.a.g.d r0 = r11.f270b
                android.location.LocationManager r0 = a.a.a.g.d.e(r0)
                if (r0 != 0) goto L9
                return
            L9:
                r0 = 2
                r1 = 0
                r2 = 0
                if (r12 == r0) goto L1f0
                r0 = 4
                if (r12 == r0) goto L13
                goto L208
            L13:
                a.a.a.g.d r12 = r11.f270b
                boolean r12 = a.a.a.g.d.a(r12)
                if (r12 != 0) goto L1c
                return
            L1c:
                a.a.a.g.d r12 = r11.f270b     // Catch: java.lang.Exception -> L208
                android.location.GpsStatus r12 = a.a.a.g.d.l(r12)     // Catch: java.lang.Exception -> L208
                if (r12 != 0) goto L32
                a.a.a.g.d r12 = r11.f270b     // Catch: java.lang.Exception -> L208
                android.location.LocationManager r0 = a.a.a.g.d.e(r12)     // Catch: java.lang.Exception -> L208
                android.location.GpsStatus r0 = r0.getGpsStatus(r1)     // Catch: java.lang.Exception -> L208
                a.a.a.g.d.a(r12, r0)     // Catch: java.lang.Exception -> L208
                goto L41
            L32:
                a.a.a.g.d r12 = r11.f270b     // Catch: java.lang.Exception -> L208
                android.location.LocationManager r12 = a.a.a.g.d.e(r12)     // Catch: java.lang.Exception -> L208
                a.a.a.g.d r0 = r11.f270b     // Catch: java.lang.Exception -> L208
                android.location.GpsStatus r0 = a.a.a.g.d.l(r0)     // Catch: java.lang.Exception -> L208
                r12.getGpsStatus(r0)     // Catch: java.lang.Exception -> L208
            L41:
                a.a.a.g.d r12 = r11.f270b     // Catch: java.lang.Exception -> L208
                android.location.GpsStatus r12 = a.a.a.g.d.l(r12)     // Catch: java.lang.Exception -> L208
                java.lang.Iterable r12 = r12.getSatellites()     // Catch: java.lang.Exception -> L208
                java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Exception -> L208
                a.a.a.g.d r0 = r11.f270b     // Catch: java.lang.Exception -> L208
                long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L208
                a.a.a.g.d.e(r0, r3)     // Catch: java.lang.Exception -> L208
                a.a.a.g.d r0 = r11.f270b     // Catch: java.lang.Exception -> L208
                java.util.ArrayList r0 = a.a.a.g.d.f(r0)     // Catch: java.lang.Exception -> L208
                r0.clear()     // Catch: java.lang.Exception -> L208
                a.a.a.g.d r0 = r11.f270b     // Catch: java.lang.Exception -> L208
                java.util.ArrayList r0 = a.a.a.g.d.g(r0)     // Catch: java.lang.Exception -> L208
                r0.clear()     // Catch: java.lang.Exception -> L208
                a.a.a.g.d r0 = r11.f270b     // Catch: java.lang.Exception -> L208
                java.util.ArrayList r0 = a.a.a.g.d.h(r0)     // Catch: java.lang.Exception -> L208
                r0.clear()     // Catch: java.lang.Exception -> L208
                a.a.a.g.d r0 = r11.f270b     // Catch: java.lang.Exception -> L208
                java.util.ArrayList r0 = a.a.a.g.d.i(r0)     // Catch: java.lang.Exception -> L208
                r0.clear()     // Catch: java.lang.Exception -> L208
                r0 = r2
            L7d:
                boolean r1 = r12.hasNext()     // Catch: java.lang.Exception -> L208
                r3 = 1
                if (r1 == 0) goto L13c
                java.lang.Object r1 = r12.next()     // Catch: java.lang.Exception -> L208
                android.location.GpsSatellite r1 = (android.location.GpsSatellite) r1     // Catch: java.lang.Exception -> L208
                java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Exception -> L208
                r4.<init>()     // Catch: java.lang.Exception -> L208
                int r5 = r1.getPrn()     // Catch: java.lang.Exception -> L208
                float r6 = r1.getAzimuth()     // Catch: java.lang.Exception -> L208
                java.lang.Float r6 = java.lang.Float.valueOf(r6)     // Catch: java.lang.Exception -> L208
                r4.add(r6)     // Catch: java.lang.Exception -> L208
                float r6 = r1.getElevation()     // Catch: java.lang.Exception -> L208
                java.lang.Float r6 = java.lang.Float.valueOf(r6)     // Catch: java.lang.Exception -> L208
                r4.add(r6)     // Catch: java.lang.Exception -> L208
                float r6 = r1.getSnr()     // Catch: java.lang.Exception -> L208
                java.lang.Float r6 = java.lang.Float.valueOf(r6)     // Catch: java.lang.Exception -> L208
                r4.add(r6)     // Catch: java.lang.Exception -> L208
                boolean r1 = r1.usedInFix()     // Catch: java.lang.Exception -> L208
                r6 = 32
                r7 = 1065353216(0x3f800000, float:1.0)
                if (r1 == 0) goto Lce
                int r2 = r2 + 1
                java.lang.Float r1 = java.lang.Float.valueOf(r7)     // Catch: java.lang.Exception -> L208
                r4.add(r1)     // Catch: java.lang.Exception -> L208
                if (r5 < r3) goto Ld6
                if (r5 > r6) goto Ld6
                int r0 = r0 + 1
                goto Ld6
            Lce:
                r1 = 0
                java.lang.Float r1 = java.lang.Float.valueOf(r1)     // Catch: java.lang.Exception -> L208
                r4.add(r1)     // Catch: java.lang.Exception -> L208
            Ld6:
                float r1 = (float) r5     // Catch: java.lang.Exception -> L208
                java.lang.Float r1 = java.lang.Float.valueOf(r1)     // Catch: java.lang.Exception -> L208
                r4.add(r1)     // Catch: java.lang.Exception -> L208
                if (r5 < r3) goto Lf0
                if (r5 > r6) goto Lf0
                java.lang.Float r1 = java.lang.Float.valueOf(r7)     // Catch: java.lang.Exception -> L208
                r4.add(r1)     // Catch: java.lang.Exception -> L208
                a.a.a.g.d r1 = r11.f270b     // Catch: java.lang.Exception -> L208
                java.util.ArrayList r1 = a.a.a.g.d.f(r1)     // Catch: java.lang.Exception -> L208
                goto L137
            Lf0:
                r1 = 201(0xc9, float:2.82E-43)
                if (r5 < r1) goto L108
                r1 = 261(0x105, float:3.66E-43)
                if (r5 > r1) goto L108
                r1 = 1073741824(0x40000000, float:2.0)
                java.lang.Float r1 = java.lang.Float.valueOf(r1)     // Catch: java.lang.Exception -> L208
                r4.add(r1)     // Catch: java.lang.Exception -> L208
                a.a.a.g.d r1 = r11.f270b     // Catch: java.lang.Exception -> L208
                java.util.ArrayList r1 = a.a.a.g.d.g(r1)     // Catch: java.lang.Exception -> L208
                goto L137
            L108:
                r1 = 65
                if (r5 < r1) goto L120
                r1 = 96
                if (r5 > r1) goto L120
                r1 = 1077936128(0x40400000, float:3.0)
                java.lang.Float r1 = java.lang.Float.valueOf(r1)     // Catch: java.lang.Exception -> L208
                r4.add(r1)     // Catch: java.lang.Exception -> L208
                a.a.a.g.d r1 = r11.f270b     // Catch: java.lang.Exception -> L208
                java.util.ArrayList r1 = a.a.a.g.d.h(r1)     // Catch: java.lang.Exception -> L208
                goto L137
            L120:
                r1 = 301(0x12d, float:4.22E-43)
                if (r5 < r1) goto L7d
                r1 = 336(0x150, float:4.71E-43)
                if (r5 > r1) goto L7d
                r1 = 1082130432(0x40800000, float:4.0)
                java.lang.Float r1 = java.lang.Float.valueOf(r1)     // Catch: java.lang.Exception -> L208
                r4.add(r1)     // Catch: java.lang.Exception -> L208
                a.a.a.g.d r1 = r11.f270b     // Catch: java.lang.Exception -> L208
                java.util.ArrayList r1 = a.a.a.g.d.i(r1)     // Catch: java.lang.Exception -> L208
            L137:
                r1.add(r4)     // Catch: java.lang.Exception -> L208
                goto L7d
            L13c:
                java.util.ArrayList r12 = new java.util.ArrayList     // Catch: java.lang.Exception -> L208
                r12.<init>()     // Catch: java.lang.Exception -> L208
                a.a.a.g.d r1 = r11.f270b     // Catch: java.lang.Exception -> L208
                java.util.ArrayList r1 = a.a.a.g.d.f(r1)     // Catch: java.lang.Exception -> L208
                r12.addAll(r1)     // Catch: java.lang.Exception -> L208
                a.a.a.g.d r1 = r11.f270b     // Catch: java.lang.Exception -> L208
                java.util.ArrayList r1 = a.a.a.g.d.g(r1)     // Catch: java.lang.Exception -> L208
                r12.addAll(r1)     // Catch: java.lang.Exception -> L208
                a.a.a.g.d r1 = r11.f270b     // Catch: java.lang.Exception -> L208
                java.util.ArrayList r1 = a.a.a.g.d.h(r1)     // Catch: java.lang.Exception -> L208
                r12.addAll(r1)     // Catch: java.lang.Exception -> L208
                a.a.a.g.d r1 = r11.f270b     // Catch: java.lang.Exception -> L208
                java.util.ArrayList r1 = a.a.a.g.d.i(r1)     // Catch: java.lang.Exception -> L208
                r12.addAll(r1)     // Catch: java.lang.Exception -> L208
                a.a.a.g.d r1 = r11.f270b     // Catch: java.lang.Exception -> L208
                a.a.a.g.d.a(r1, r12)     // Catch: java.lang.Exception -> L208
                a.a.a.g.d r12 = r11.f270b     // Catch: java.lang.Exception -> L208
                r5 = 1
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 1
                r10 = -1082130432(0xffffffffbf800000, float:-1.0)
                r4 = r12
                java.util.ArrayList r1 = a.a.a.g.d.a(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L208
                a.a.a.g.d.b(r12, r1)     // Catch: java.lang.Exception -> L208
                a.a.a.g.d r12 = r11.f270b     // Catch: java.lang.Exception -> L208
                java.util.ArrayList r1 = a.a.a.g.d.j(r12)     // Catch: java.lang.Exception -> L208
                java.lang.String r12 = a.a.a.g.d.c(r12, r1)     // Catch: java.lang.Exception -> L208
                a.a.a.g.d.k0 = r12     // Catch: java.lang.Exception -> L208
                a.a.a.g.d r12 = r11.f270b     // Catch: java.lang.Exception -> L208
                r5 = 1
                r6 = 1
                r7 = 1
                r8 = 1
                r9 = 1
                r10 = -1082130432(0xffffffffbf800000, float:-1.0)
                r4 = r12
                java.util.ArrayList r1 = a.a.a.g.d.a(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L208
                a.a.a.g.d.d(r12, r1)     // Catch: java.lang.Exception -> L208
                a.a.a.g.d r12 = r11.f270b     // Catch: java.lang.Exception -> L208
                r5 = 1
                r6 = 1
                r7 = 1
                r8 = 1
                r9 = 0
                r10 = -1082130432(0xffffffffbf800000, float:-1.0)
                r4 = r12
                java.util.ArrayList r1 = a.a.a.g.d.a(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L208
                a.a.a.g.d.e(r12, r1)     // Catch: java.lang.Exception -> L208
                a.a.a.g.d r12 = r11.f270b     // Catch: java.lang.Exception -> L208
                java.util.ArrayList r1 = a.a.a.g.d.k(r12)     // Catch: java.lang.Exception -> L208
                java.lang.String r12 = a.a.a.g.d.c(r12, r1)     // Catch: java.lang.Exception -> L208
                a.a.a.g.d.l0 = r12     // Catch: java.lang.Exception -> L208
                a.a.a.b.d r12 = a.a.a.b.d.i()     // Catch: java.lang.Exception -> L208
                int r12 = r12.F     // Catch: java.lang.Exception -> L208
                if (r12 != r3) goto L1ca
                a.a.a.b.i r12 = a.a.a.b.i.d()     // Catch: java.lang.Exception -> L208
                a.a.a.g.d r1 = r11.f270b     // Catch: java.lang.Exception -> L208
                java.util.ArrayList r1 = a.a.a.g.d.k(r1)     // Catch: java.lang.Exception -> L208
                r12.a(r1)     // Catch: java.lang.Exception -> L208
            L1ca:
                if (r0 <= 0) goto L1cf
                a.a.a.g.d.b(r0)     // Catch: java.lang.Exception -> L208
            L1cf:
                if (r2 <= 0) goto L1d8
            L1d1:
                long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L208
                r11.f269a = r0     // Catch: java.lang.Exception -> L208
                goto L1e6
            L1d8:
                long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L208
                long r3 = r11.f269a     // Catch: java.lang.Exception -> L208
                long r0 = r0 - r3
                r3 = 100
                int r12 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r12 <= 0) goto L1e8
                goto L1d1
            L1e6:
                a.a.a.g.d.X = r2     // Catch: java.lang.Exception -> L208
            L1e8:
                long r11 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L208
                a.a.a.g.d.a(r11)     // Catch: java.lang.Exception -> L208
                goto L208
            L1f0:
                a.a.a.g.d r12 = r11.f270b
                a.a.a.g.d.a(r12, r1)
                a.a.a.g.d r11 = r11.f270b
                a.a.a.g.d.a(r11, r2)
                a.a.a.g.d.X = r2
                a.a.a.g.d.b(r2)
                a.a.a.g.d.c(r2)
                a.a.a.g.d.d(r2)
                a.a.a.g.d.e(r2)
            L208:
                return
        }
    }

    public static class f extends android.os.Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public java.lang.ref.WeakReference<a.a.a.g.d> f271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a.a.a.g.d f272b;

        public f(a.a.a.g.d r2) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.f271a = r0
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r4) {
                r3 = this;
                boolean r0 = com.baidu.location.f.f
                if (r0 != 0) goto L5
                return
            L5:
                java.lang.ref.WeakReference<a.a.a.g.d> r0 = r3.f271a
                java.lang.Object r0 = r0.get()
                a.a.a.g.d r0 = (a.a.a.g.d) r0
                r3.f272b = r0
                if (r0 != 0) goto L12
                return
            L12:
                int r1 = r4.what
                r2 = 1
                if (r1 == r2) goto L3a
                r3 = 3
                if (r1 == r3) goto L30
                r3 = 4
                if (r1 == r3) goto L29
                r3 = 5
                if (r1 == r3) goto L21
                goto L54
            L21:
                java.lang.Object r3 = r4.obj
                java.lang.String r3 = (java.lang.String) r3
                a.a.a.g.d.a(r0, r3)
                goto L54
            L29:
                java.lang.Object r3 = r4.obj
                android.location.Location r3 = (android.location.Location) r3
                java.lang.String r4 = "&og=2"
                goto L36
            L30:
                java.lang.Object r3 = r4.obj
                android.location.Location r3 = (android.location.Location) r3
                java.lang.String r4 = "&og=1"
            L36:
                a.a.a.g.d.a(r0, r4, r3)
                goto L54
            L3a:
                r0 = -1
                java.lang.Object r4 = r4.obj
                android.location.Location r4 = (android.location.Location) r4
                a.a.a.b.d r1 = a.a.a.b.d.i()
                int r1 = r1.F
                if (r1 != r2) goto L4f
                a.a.a.b.i r0 = a.a.a.b.i.d()
                int r0 = r0.b(r4)
            L4f:
                a.a.a.g.d r3 = r3.f272b
                a.a.a.g.d.a(r3, r4, r0)
            L54:
                return
        }
    }

    public class g implements android.location.LocationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.a.a.g.d f273a;

        public g(a.a.a.g.d r1) {
                r0 = this;
                r0.f273a = r1
                r0.<init>()
                return
        }

        public /* synthetic */ g(a.a.a.g.d r1, a.a.a.g.d.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(android.location.Location r6) {
                r5 = this;
                if (r6 != 0) goto L8
                int r0 = a.a.a.i.i.e
                r1 = 4
                if (r0 != r1) goto L8
                return
            L8:
                boolean r0 = a.a.a.i.i.k()
                if (r0 == 0) goto L16
                a.a.a.g.c r5 = a.a.a.g.c.e()
                r5.b(r6)
                return
            L16:
                boolean r0 = a.a.a.i.i.a(r6)
                if (r0 == 0) goto L1d
                return
            L1d:
                double r0 = r6.getLatitude()
                double r0 = java.lang.Math.abs(r0)
                r2 = 4645040803167600640(0x4076800000000000, double:360.0)
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 > 0) goto La8
                double r0 = r6.getLongitude()
                double r0 = java.lang.Math.abs(r0)
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 <= 0) goto L3b
                goto La8
            L3b:
                a.a.a.g.d r0 = r5.f273a
                long r1 = r6.getTime()
                r3 = 1000(0x3e8, double:4.94E-321)
                long r1 = r1 / r3
                a.a.a.g.d.a(r0, r1)
                a.a.a.g.d r0 = r5.f273a
                long r1 = java.lang.System.currentTimeMillis()
                a.a.a.g.d.b(r0, r1)
                a.a.a.g.d r0 = r5.f273a
                long r0 = a.a.a.g.d.c(r0)
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto L6c
                a.a.a.g.d r0 = r5.f273a
                long r1 = java.lang.System.currentTimeMillis()
                a.a.a.g.d r3 = r5.f273a
                long r3 = a.a.a.g.d.c(r3)
                long r1 = r1 - r3
                a.a.a.g.d.d(r0, r1)
            L6c:
                a.a.a.g.d r0 = r5.f273a
                long r1 = java.lang.System.currentTimeMillis()
                a.a.a.g.d.c(r0, r1)
                int r0 = a.a.a.g.d.X
                if (r0 != 0) goto L83
                android.os.Bundle r1 = r6.getExtras()     // Catch: java.lang.Exception -> L83
                java.lang.String r2 = "satellites"
                int r0 = r1.getInt(r2)     // Catch: java.lang.Exception -> L83
            L83:
                if (r0 == 0) goto L8f
                a.a.a.b.o r0 = a.a.a.b.o.q()
                boolean r0 = r0.k()
                if (r0 == 0) goto L97
            L8f:
                java.lang.System.currentTimeMillis()
                a.a.a.g.d r0 = r5.f273a
                a.a.a.g.d.d(r0)
            L97:
                a.a.a.g.d r0 = r5.f273a
                r1 = 1
                a.a.a.g.d.a(r0, r1)
                a.a.a.g.d r0 = r5.f273a
                a.a.a.g.d.a(r0, r6)
                a.a.a.g.d r5 = r5.f273a
                r6 = 0
                a.a.a.g.d.b(r5, r6)
            La8:
                return
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(java.lang.String r2) {
                r1 = this;
                a.a.a.g.d r2 = r1.f273a
                r0 = 0
                a.a.a.g.d.a(r2, r0)
                a.a.a.g.d r1 = r1.f273a
                r2 = 0
                a.a.a.g.d.a(r1, r2)
                return
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(java.lang.String r1) {
                r0 = this;
                return
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(java.lang.String r3, int r4, android.os.Bundle r5) {
                r2 = this;
                r3 = 0
                if (r4 == 0) goto L1f
                r5 = 1
                if (r4 == r5) goto L10
                r5 = 2
                if (r4 == r5) goto La
                goto L2a
            La:
                a.a.a.g.d r2 = r2.f273a
                a.a.a.g.d.b(r2, r3)
                goto L2a
            L10:
                a.a.a.g.d r4 = r2.f273a
                long r0 = java.lang.System.currentTimeMillis()
                a.a.a.g.d.f(r4, r0)
                a.a.a.g.d r4 = r2.f273a
                a.a.a.g.d.b(r4, r5)
                goto L25
            L1f:
                a.a.a.g.d r4 = r2.f273a
                r5 = 0
                a.a.a.g.d.a(r4, r5)
            L25:
                a.a.a.g.d r2 = r2.f273a
                a.a.a.g.d.a(r2, r3)
            L2a:
                return
        }
    }

    public class h implements android.location.GpsStatus.NmeaListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.a.a.g.d f274a;

        public h(a.a.a.g.d r1) {
                r0 = this;
                r0.f274a = r1
                r0.<init>()
                return
        }

        public /* synthetic */ h(a.a.a.g.d r1, a.a.a.g.d.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.location.GpsStatus.NmeaListener
        public void onNmeaReceived(long r1, java.lang.String r3) {
                r0 = this;
                a.a.a.g.d r1 = r0.f274a
                a.a.a.g.d$f r1 = a.a.a.g.d.m(r1)
                if (r1 == 0) goto L1c
                a.a.a.g.d r1 = r0.f274a
                a.a.a.g.d$f r1 = a.a.a.g.d.m(r1)
                r2 = 5
                android.os.Message r1 = r1.obtainMessage(r2, r3)
                a.a.a.g.d r0 = r0.f274a
                a.a.a.g.d$f r0 = a.a.a.g.d.m(r0)
                r0.sendMessage(r1)
            L1c:
                return
        }
    }

    public class i implements android.location.LocationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.a.a.g.d f276b;

        public i(a.a.a.g.d r3) {
                r2 = this;
                r2.f276b = r3
                r2.<init>()
                r0 = 0
                r2.f275a = r0
                return
        }

        public /* synthetic */ i(a.a.a.g.d r1, a.a.a.g.d.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(android.location.Location r7) {
                r6 = this;
                a.a.a.g.d r0 = r6.f276b
                boolean r0 = a.a.a.g.d.a(r0)
                r1 = 4
                if (r0 == 0) goto Le
                int r0 = a.a.a.i.i.e
                if (r0 != r1) goto Le
                return
            Le:
                if (r7 == 0) goto L79
                java.lang.String r0 = r7.getProvider()
                java.lang.String r2 = "gps"
                boolean r0 = android.text.TextUtils.equals(r0, r2)
                if (r0 == 0) goto L79
                long r2 = java.lang.System.currentTimeMillis()
                long r4 = r6.f275a
                long r2 = r2 - r4
                r4 = 10000(0x2710, double:4.9407E-320)
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 >= 0) goto L2a
                return
            L2a:
                double r2 = r7.getLatitude()
                double r2 = java.lang.Math.abs(r2)
                r4 = 4645040803167600640(0x4076800000000000, double:360.0)
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 > 0) goto L79
                double r2 = r7.getLongitude()
                double r2 = java.lang.Math.abs(r2)
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L48
                goto L79
            L48:
                r0 = 0
                boolean r0 = a.a.a.b.y.a(r7, r0)
                if (r0 == 0) goto L79
                long r2 = java.lang.System.currentTimeMillis()
                r6.f275a = r2
                a.a.a.g.d r0 = r6.f276b
                a.a.a.g.d$f r0 = a.a.a.g.d.m(r0)
                if (r0 == 0) goto L79
                a.a.a.g.d r0 = r6.f276b
                long r2 = java.lang.System.currentTimeMillis()
                r0.T = r2
                a.a.a.g.d r0 = r6.f276b
                a.a.a.g.d$f r0 = a.a.a.g.d.m(r0)
                android.os.Message r7 = r0.obtainMessage(r1, r7)
                a.a.a.g.d r6 = r6.f276b
                a.a.a.g.d$f r6 = a.a.a.g.d.m(r6)
                r6.sendMessage(r7)
            L79:
                return
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(java.lang.String r1) {
                r0 = this;
                return
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(java.lang.String r1) {
                r0 = this;
                return
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(java.lang.String r1, int r2, android.os.Bundle r3) {
                r0 = this;
                return
        }
    }

    static {
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            return
    }

    public d() {
            r6 = this;
            r6.<init>()
            r0 = 0
            r6.f264b = r0
            r6.d = r0
            r6.e = r0
            r1 = 0
            r6.h = r1
            r6.i = r0
            r6.j = r1
            r6.k = r0
            r6.l = r0
            r2 = 0
            r6.m = r2
            r6.n = r1
            r6.o = r1
            r6.p = r1
            r6.q = r2
            r4 = 0
            r6.r = r4
            r6.s = r4
            r6.u = r2
            r6.v = r2
            r6.w = r0
            r6.x = r2
            r6.z = r0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r6.A = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r6.C = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r6.D = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r6.E = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r6.F = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r6.G = r4
            r6.H = r0
            r6.I = r2
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r4 = -1
            r6.J = r4
            r6.K = r4
            r6.M = r1
            r6.N = r1
            r6.O = r2
            r6.P = r1
            r6.Q = r1
            r6.R = r2
            r6.S = r1
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 24
            if (r0 < r2) goto L98
            java.lang.String r0 = "android.location.GnssStatus"
            java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L96
            r0 = 1
            r6.h = r0     // Catch: java.lang.ClassNotFoundException -> L96
            goto L98
        L96:
            r6.h = r1
        L98:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r0 < r2) goto La5
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch: java.lang.Throwable -> La1
            goto La5
        La1:
            r0 = move-exception
            r0.printStackTrace()
        La5:
            r6.j = r1
            return
    }

    public static /* synthetic */ long a(long r0) {
            a.a.a.g.d.h0 = r0
            return r0
    }

    public static /* synthetic */ long a(a.a.a.g.d r0, long r1) {
            r0.v = r1
            return r1
    }

    public static /* synthetic */ android.location.GpsStatus a(a.a.a.g.d r0, android.location.GpsStatus r1) {
            r0.f = r1
            return r1
    }

    public static /* synthetic */ java.util.ArrayList a(a.a.a.g.d r0, java.util.ArrayList r1, boolean r2, float r3) {
            java.util.ArrayList r0 = r0.a(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ java.util.ArrayList a(a.a.a.g.d r0, boolean r1, boolean r2, boolean r3, boolean r4, boolean r5, float r6) {
            java.util.ArrayList r0 = r0.a(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static /* synthetic */ void a(a.a.a.g.d r0, android.location.Location r1) {
            r0.b(r1)
            return
    }

    public static /* synthetic */ void a(a.a.a.g.d r0, android.location.Location r1, int r2) {
            r0.a(r1, r2)
            return
    }

    public static /* synthetic */ void a(a.a.a.g.d r0, java.lang.String r1) {
            r0.b(r1)
            return
    }

    public static /* synthetic */ void a(a.a.a.g.d r0, java.lang.String r1, android.location.Location r2) {
            r0.a(r1, r2)
            return
    }

    public static /* synthetic */ void a(a.a.a.g.d r0, java.util.ArrayList r1) {
            r0.a(r1)
            return
    }

    public static /* synthetic */ void a(a.a.a.g.d r0, boolean r1) {
            r0.b(r1)
            return
    }

    public static /* synthetic */ boolean a(a.a.a.g.d r0) {
            boolean r0 = r0.o
            return r0
    }

    public static boolean a(android.location.Location r8, android.location.Location r9, boolean r10) {
            r0 = 0
            if (r8 != r9) goto L4
            return r0
        L4:
            r1 = 1
            if (r8 == 0) goto L54
            if (r9 != 0) goto La
            goto L54
        La:
            float r2 = r9.getSpeed()
            r3 = 1084227584(0x40a00000, float:5.0)
            if (r10 == 0) goto L2e
            int r10 = a.a.a.i.i.s
            r4 = 3
            if (r10 == r4) goto L29
            a.a.a.i.f r10 = a.a.a.i.f.a()
            double r4 = r9.getLongitude()
            double r6 = r9.getLatitude()
            boolean r10 = r10.a(r4, r6)
            if (r10 != 0) goto L2e
        L29:
            int r10 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r10 >= 0) goto L2e
            return r1
        L2e:
            float r8 = r9.distanceTo(r8)
            float r9 = a.a.a.i.i.I
            int r9 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r9 <= 0) goto L40
            float r9 = a.a.a.i.i.K
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 <= 0) goto L3f
            r0 = r1
        L3f:
            return r0
        L40:
            float r9 = a.a.a.i.i.H
            int r9 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r9 <= 0) goto L4e
            float r9 = a.a.a.i.i.J
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 <= 0) goto L4d
            r0 = r1
        L4d:
            return r0
        L4e:
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 <= 0) goto L53
            r0 = r1
        L53:
            return r0
        L54:
            return r1
    }

    public static /* synthetic */ int b(int r0) {
            a.a.a.g.d.Y = r0
            return r0
    }

    public static /* synthetic */ long b(a.a.a.g.d r2) {
            long r0 = r2.v
            return r0
    }

    public static /* synthetic */ long b(a.a.a.g.d r0, long r1) {
            r0.J = r1
            return r1
    }

    public static /* synthetic */ java.util.ArrayList b(a.a.a.g.d r0, java.util.ArrayList r1) {
            r0.A = r1
            return r1
    }

    public static /* synthetic */ boolean b(a.a.a.g.d r0, boolean r1) {
            r0.n = r1
            return r1
    }

    public static /* synthetic */ int c(int r0) {
            a.a.a.g.d.Z = r0
            return r0
    }

    public static /* synthetic */ long c(a.a.a.g.d r2) {
            long r0 = r2.u
            return r0
    }

    public static /* synthetic */ long c(a.a.a.g.d r0, long r1) {
            r0.u = r1
            return r1
    }

    public static /* synthetic */ android.location.Location c(android.location.Location r0) {
            a.a.a.g.d.V = r0
            return r0
    }

    public static /* synthetic */ java.lang.String c(a.a.a.g.d r0, java.util.ArrayList r1) {
            java.lang.String r0 = r0.b(r1)
            return r0
    }

    public static /* synthetic */ int d(int r0) {
            a.a.a.g.d.a0 = r0
            return r0
    }

    public static /* synthetic */ long d(a.a.a.g.d r2) {
            long r0 = r2.x
            return r0
    }

    public static /* synthetic */ long d(a.a.a.g.d r0, long r1) {
            r0.t = r1
            return r1
    }

    public static java.lang.String d(android.location.Location r1) {
            java.lang.String r1 = f(r1)
            if (r1 == 0) goto L17
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "&g_tp=0"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
        L17:
            return r1
    }

    public static /* synthetic */ java.util.ArrayList d(a.a.a.g.d r0, java.util.ArrayList r1) {
            r0.B = r1
            return r1
    }

    public static /* synthetic */ int e(int r0) {
            a.a.a.g.d.b0 = r0
            return r0
    }

    public static /* synthetic */ long e(a.a.a.g.d r0, long r1) {
            r0.x = r1
            return r1
    }

    public static /* synthetic */ android.location.LocationManager e(a.a.a.g.d r0) {
            android.location.LocationManager r0 = r0.f264b
            return r0
    }

    public static java.lang.String e(android.location.Location r1) {
            java.lang.String r1 = f(r1)
            if (r1 == 0) goto L17
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = a.a.a.g.d.i0
            r0.append(r1)
            java.lang.String r1 = r0.toString()
        L17:
            return r1
    }

    public static /* synthetic */ java.util.ArrayList e(a.a.a.g.d r0, java.util.ArrayList r1) {
            r0.C = r1
            return r1
    }

    public static /* synthetic */ int f(int r0) {
            a.a.a.g.d.c0 = r0
            return r0
    }

    public static /* synthetic */ long f(a.a.a.g.d r0, long r1) {
            r0.m = r1
            return r1
    }

    public static java.lang.String f(android.location.Location r29) {
            if (r29 != 0) goto L5
            r0 = 0
            goto L231
        L5:
            float r0 = r29.getSpeed()
            double r0 = (double) r0
            r2 = 4615288898129284301(0x400ccccccccccccd, double:3.6)
            double r0 = r0 * r2
            float r0 = (float) r0
            boolean r1 = r29.hasSpeed()
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L1a
            r0 = r2
        L1a:
            boolean r1 = r29.hasAccuracy()
            if (r1 == 0) goto L25
            float r1 = r29.getAccuracy()
            goto L26
        L25:
            r1 = r2
        L26:
            int r1 = (int) r1
            boolean r3 = r29.hasAltitude()
            if (r3 == 0) goto L32
            double r3 = r29.getAltitude()
            goto L37
        L32:
            r3 = 4648093047446306816(0x4081580000000000, double:555.0)
        L37:
            boolean r5 = r29.hasBearing()
            if (r5 == 0) goto L41
            float r2 = r29.getBearing()
        L41:
            float r5 = a.a.a.g.d.m0
            r6 = -1138501878(0xffffffffbc23d70a, float:-0.01)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            r6 = 19
            r9 = 16
            r10 = 15
            r11 = 14
            r12 = 13
            r13 = 12
            r14 = 11
            r15 = 10
            r16 = 9
            r17 = 8
            r18 = 7
            r19 = 6
            r20 = 5
            r21 = 1000(0x3e8, double:4.94E-321)
            r7 = 4
            r23 = 3
            r24 = 1
            r25 = 0
            r8 = 2
            if (r5 >= 0) goto L116
            java.util.Locale r5 = java.util.Locale.CHINA
            java.lang.Object[] r6 = new java.lang.Object[r6]
            double r26 = r29.getLongitude()
            java.lang.Double r26 = java.lang.Double.valueOf(r26)
            r6[r25] = r26
            double r26 = r29.getLatitude()
            java.lang.Double r26 = java.lang.Double.valueOf(r26)
            r6[r24] = r26
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r6[r8] = r0
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            r6[r23] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r6[r7] = r0
            int r0 = a.a.a.g.d.X
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r20] = r0
            java.lang.Double r0 = java.lang.Double.valueOf(r3)
            r6[r19] = r0
            long r0 = r29.getTime()
            long r0 = r0 / r21
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6[r18] = r0
            int r0 = a.a.a.g.d.X
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r17] = r0
            int r0 = a.a.a.g.d.Y
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r16] = r0
            int r0 = a.a.a.g.d.Z
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r15] = r0
            int r0 = a.a.a.g.d.a0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r14] = r0
            int r0 = a.a.a.g.d.b0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r13] = r0
            int r0 = a.a.a.g.d.g0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r12] = r0
            int r0 = a.a.a.g.d.c0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r11] = r0
            int r0 = a.a.a.g.d.d0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r10] = r0
            int r0 = a.a.a.g.d.e0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r9] = r0
            int r0 = a.a.a.g.d.f0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 17
            r6[r1] = r0
            double r0 = a.a.a.g.d.j0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r1 = 18
            r6[r1] = r0
            java.lang.String r0 = "&ll=%.5f|%.5f&s=%.1f&d=%.1f&ll_r=%d&ll_n=%d&ll_h=%.2f&ll_t=%d&ll_sn=%d|%d|%d|%d|%d&ll_asn=%d|%d|%d|%d|%d&ll_snr=%.1f"
            java.lang.String r0 = java.lang.String.format(r5, r0, r6)
            goto L1c8
        L116:
            java.util.Locale r5 = java.util.Locale.CHINA
            r6 = 20
            java.lang.Object[] r6 = new java.lang.Object[r6]
            double r27 = r29.getLongitude()
            java.lang.Double r27 = java.lang.Double.valueOf(r27)
            r6[r25] = r27
            double r27 = r29.getLatitude()
            java.lang.Double r27 = java.lang.Double.valueOf(r27)
            r6[r24] = r27
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r6[r8] = r0
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            r6[r23] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r6[r7] = r0
            int r0 = a.a.a.g.d.X
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r20] = r0
            java.lang.Double r0 = java.lang.Double.valueOf(r3)
            r6[r19] = r0
            long r0 = r29.getTime()
            long r0 = r0 / r21
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6[r18] = r0
            int r0 = a.a.a.g.d.X
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r17] = r0
            int r0 = a.a.a.g.d.Y
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r16] = r0
            int r0 = a.a.a.g.d.Z
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r15] = r0
            int r0 = a.a.a.g.d.a0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r14] = r0
            int r0 = a.a.a.g.d.b0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r13] = r0
            int r0 = a.a.a.g.d.g0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r12] = r0
            int r0 = a.a.a.g.d.c0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r11] = r0
            int r0 = a.a.a.g.d.d0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r10] = r0
            int r0 = a.a.a.g.d.e0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r9] = r0
            int r0 = a.a.a.g.d.f0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 17
            r6[r1] = r0
            double r0 = a.a.a.g.d.j0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r1 = 18
            r6[r1] = r0
            float r0 = a.a.a.g.d.m0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1 = 19
            r6[r1] = r0
            java.lang.String r0 = "&ll=%.5f|%.5f&s=%.1f&d=%.1f&ll_r=%d&ll_n=%d&ll_h=%.2f&ll_t=%d&ll_sn=%d|%d|%d|%d|%d&ll_asn=%d|%d|%d|%d|%d&ll_snr=%.1f&ll_bp=%.2f"
            java.lang.String r0 = java.lang.String.format(r5, r0, r6)
        L1c8:
            r1 = r0
            int r0 = a.a.a.g.d.W     // Catch: java.lang.Exception -> L22c
            if (r0 != r8) goto L215
            android.location.Location r0 = a.a.a.g.d.V     // Catch: java.lang.Exception -> L22c
            if (r0 == 0) goto L215
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L22c
            r0.<init>()     // Catch: java.lang.Exception -> L22c
            r0.append(r1)     // Catch: java.lang.Exception -> L22c
            java.util.Locale r2 = java.util.Locale.CHINA     // Catch: java.lang.Exception -> L22c
            java.lang.String r3 = "&ll_fake=%d|%.5f|%.5f|%d"
            java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> L22c
            int r5 = a.a.a.g.d.W     // Catch: java.lang.Exception -> L22c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L22c
            r4[r25] = r5     // Catch: java.lang.Exception -> L22c
            android.location.Location r5 = a.a.a.g.d.V     // Catch: java.lang.Exception -> L22c
            double r5 = r5.getLongitude()     // Catch: java.lang.Exception -> L22c
            java.lang.Double r5 = java.lang.Double.valueOf(r5)     // Catch: java.lang.Exception -> L22c
            r4[r24] = r5     // Catch: java.lang.Exception -> L22c
            android.location.Location r5 = a.a.a.g.d.V     // Catch: java.lang.Exception -> L22c
            double r5 = r5.getLatitude()     // Catch: java.lang.Exception -> L22c
            java.lang.Double r5 = java.lang.Double.valueOf(r5)     // Catch: java.lang.Exception -> L22c
            r4[r8] = r5     // Catch: java.lang.Exception -> L22c
            android.location.Location r5 = a.a.a.g.d.V     // Catch: java.lang.Exception -> L22c
            long r5 = r5.getTime()     // Catch: java.lang.Exception -> L22c
            long r5 = r5 / r21
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Exception -> L22c
            r4[r23] = r5     // Catch: java.lang.Exception -> L22c
            java.lang.String r2 = java.lang.String.format(r2, r3, r4)     // Catch: java.lang.Exception -> L22c
            r0.append(r2)     // Catch: java.lang.Exception -> L22c
            goto L227
        L215:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L22c
            r0.<init>()     // Catch: java.lang.Exception -> L22c
            r0.append(r1)     // Catch: java.lang.Exception -> L22c
            java.lang.String r2 = "&ll_fake="
            r0.append(r2)     // Catch: java.lang.Exception -> L22c
            int r2 = a.a.a.g.d.W     // Catch: java.lang.Exception -> L22c
            r0.append(r2)     // Catch: java.lang.Exception -> L22c
        L227:
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L22c
            goto L231
        L22c:
            r0 = move-exception
            r0.printStackTrace()
            r0 = r1
        L231:
            return r0
    }

    public static /* synthetic */ java.util.ArrayList f(a.a.a.g.d r0) {
            java.util.ArrayList<java.util.ArrayList<java.lang.Float>> r0 = r0.D
            return r0
    }

    public static /* synthetic */ int g(int r0) {
            a.a.a.g.d.d0 = r0
            return r0
    }

    public static /* synthetic */ long g(a.a.a.g.d r0, long r1) {
            r0.R = r1
            return r1
    }

    public static /* synthetic */ java.util.ArrayList g(a.a.a.g.d r0) {
            java.util.ArrayList<java.util.ArrayList<java.lang.Float>> r0 = r0.E
            return r0
    }

    public static /* synthetic */ int h(int r0) {
            a.a.a.g.d.e0 = r0
            return r0
    }

    public static /* synthetic */ java.util.ArrayList h(a.a.a.g.d r0) {
            java.util.ArrayList<java.util.ArrayList<java.lang.Float>> r0 = r0.F
            return r0
    }

    public static /* synthetic */ int i(int r0) {
            a.a.a.g.d.f0 = r0
            return r0
    }

    public static /* synthetic */ java.util.ArrayList i(a.a.a.g.d r0) {
            java.util.ArrayList<java.util.ArrayList<java.lang.Float>> r0 = r0.G
            return r0
    }

    public static /* synthetic */ int j(int r0) {
            a.a.a.g.d.g0 = r0
            return r0
    }

    public static /* synthetic */ java.util.ArrayList j(a.a.a.g.d r0) {
            java.util.ArrayList<java.util.ArrayList<java.lang.Float>> r0 = r0.A
            return r0
    }

    public static /* synthetic */ int k(int r0) {
            a.a.a.g.d.W = r0
            return r0
    }

    public static /* synthetic */ java.util.ArrayList k(a.a.a.g.d r0) {
            java.util.ArrayList<java.util.ArrayList<java.lang.Float>> r0 = r0.C
            return r0
    }

    public static /* synthetic */ android.location.GpsStatus l(a.a.a.g.d r0) {
            android.location.GpsStatus r0 = r0.f
            return r0
    }

    public static /* synthetic */ a.a.a.g.d.f m(a.a.a.g.d r0) {
            a.a.a.g.d$f r0 = r0.w
            return r0
    }

    public static java.lang.String m() {
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = a.a.a.g.d.h0
            long r0 = r0 - r2
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L31
            r2 = 3000(0xbb8, double:1.482E-320)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L31
            java.util.Locale r0 = java.util.Locale.US
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r2 = a.a.a.g.d.g0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            int r2 = a.a.a.g.d.X
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 1
            r1[r3] = r2
            java.lang.String r2 = "&gsvn=%d&gsfn=%d"
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            goto L32
        L31:
            r0 = 0
        L32:
            return r0
    }

    public static synchronized a.a.a.g.d n() {
            java.lang.Class<a.a.a.g.d> r0 = a.a.a.g.d.class
            monitor-enter(r0)
            a.a.a.g.d r1 = a.a.a.g.d.U     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto Le
            a.a.a.g.d r1 = new a.a.a.g.d     // Catch: java.lang.Throwable -> L12
            r1.<init>()     // Catch: java.lang.Throwable -> L12
            a.a.a.g.d.U = r1     // Catch: java.lang.Throwable -> L12
        Le:
            a.a.a.g.d r1 = a.a.a.g.d.U     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)
            return r1
        L12:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final int a(android.location.Location r8) {
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L5b
            r2 = 17
            if (r1 <= r2) goto L13
            boolean r8 = r8.isFromMockProvider()     // Catch: java.lang.Throwable -> L5b
            if (r8 == 0) goto L13
            r7 = 100
            return r7
        L13:
            long r1 = r7.J     // Catch: java.lang.Throwable -> L5b
            long r3 = r7.K     // Catch: java.lang.Throwable -> L5b
            long r1 = r1 - r3
            long r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Throwable -> L5b
            r3 = 3000(0xbb8, double:1.482E-320)
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r1 = -1
            if (r8 >= 0) goto L41
            com.baidu.location.c r8 = r7.L     // Catch: java.lang.Throwable -> L5b
            if (r8 != 0) goto L36
            boolean r8 = r7.M     // Catch: java.lang.Throwable -> L5b
            if (r8 != 0) goto L2f
            r7 = 200(0xc8, float:2.8E-43)
            return r7
        L2f:
            boolean r8 = r7.N     // Catch: java.lang.Throwable -> L5b
            if (r8 == 0) goto L4a
            r7 = 300(0x12c, float:4.2E-43)
            return r7
        L36:
            boolean r8 = r7.N     // Catch: java.lang.Throwable -> L5b
            if (r8 != 0) goto L4a
            boolean r8 = r7.M     // Catch: java.lang.Throwable -> L5b
            if (r8 == 0) goto L4a
            r7 = 400(0x190, float:5.6E-43)
            return r7
        L41:
            r7.K = r1     // Catch: java.lang.Throwable -> L5b
            r7.N = r0     // Catch: java.lang.Throwable -> L5b
            r7.M = r0     // Catch: java.lang.Throwable -> L5b
            r8 = 0
            r7.L = r8     // Catch: java.lang.Throwable -> L5b
        L4a:
            long r3 = r7.J     // Catch: java.lang.Throwable -> L5b
            r5 = 0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 <= 0) goto L5b
            long r7 = r7.K     // Catch: java.lang.Throwable -> L5b
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 != 0) goto L5b
            r7 = 500(0x1f4, float:7.0E-43)
            return r7
        L5b:
            return r0
    }

    public final java.util.ArrayList<java.util.ArrayList<java.lang.Float>> a(java.util.ArrayList<java.util.ArrayList<java.lang.Float>> r5, boolean r6, float r7) {
            r4 = this;
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r0 = r5.size()
            r1 = 40
            if (r0 > r1) goto L59
            int r0 = r5.size()
            if (r0 != 0) goto L14
            goto L59
        L14:
            java.util.Iterator r5 = r5.iterator()
        L18:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L59
            java.lang.Object r0 = r5.next()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            r2 = 6
            if (r1 == r2) goto L2c
            goto L18
        L2c:
            r1 = 3
            java.lang.Object r1 = r0.get(r1)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r2 = 2
            java.lang.Object r2 = r0.get(r2)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            if (r6 == 0) goto L4b
            r3 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L4b
            goto L18
        L4b:
            r1 = 0
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 <= 0) goto L55
            int r1 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r1 >= 0) goto L55
            goto L18
        L55:
            r4.add(r0)
            goto L18
        L59:
            return r4
    }

    public final java.util.ArrayList<java.util.ArrayList<java.lang.Float>> a(boolean r2, boolean r3, boolean r4, boolean r5, boolean r6, float r7) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r2 == 0) goto L10
            java.util.ArrayList<java.util.ArrayList<java.lang.Float>> r2 = r1.D
            java.util.ArrayList r2 = r1.a(r2, r6, r7)
            r0.addAll(r2)
        L10:
            if (r3 == 0) goto L1b
            java.util.ArrayList<java.util.ArrayList<java.lang.Float>> r2 = r1.E
            java.util.ArrayList r2 = r1.a(r2, r6, r7)
            r0.addAll(r2)
        L1b:
            if (r4 == 0) goto L26
            java.util.ArrayList<java.util.ArrayList<java.lang.Float>> r2 = r1.F
            java.util.ArrayList r2 = r1.a(r2, r6, r7)
            r0.addAll(r2)
        L26:
            if (r5 == 0) goto L31
            java.util.ArrayList<java.util.ArrayList<java.lang.Float>> r2 = r1.G
            java.util.ArrayList r1 = r1.a(r2, r6, r7)
            r0.addAll(r1)
        L31:
            return r0
    }

    public synchronized void a() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = com.baidu.location.f.f     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L7
            monitor-exit(r2)
            return
        L7:
            android.content.Context r0 = com.baidu.location.f.c()     // Catch: java.lang.Throwable -> L20
            r2.f263a = r0     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = "location"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Exception -> L17 java.lang.Throwable -> L20
            android.location.LocationManager r0 = (android.location.LocationManager) r0     // Catch: java.lang.Exception -> L17 java.lang.Throwable -> L20
            r2.f264b = r0     // Catch: java.lang.Exception -> L17 java.lang.Throwable -> L20
        L17:
            a.a.a.g.d$f r0 = new a.a.a.g.d$f     // Catch: java.lang.Throwable -> L20
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L20
            r2.w = r0     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)
            return
        L20:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public void a(int r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L8
            r2.Q = r0
        L5:
            r2.P = r0
            goto L12
        L8:
            r1 = 2
            if (r3 != r1) goto Le
            r2.Q = r0
            goto L12
        Le:
            r1 = 1
            if (r3 != r1) goto L12
            goto L5
        L12:
            boolean r3 = r2.P
            if (r3 != 0) goto L2f
            boolean r3 = r2.Q
            if (r3 == 0) goto L1b
            goto L2f
        L1b:
            boolean r3 = r2.h
            if (r3 == 0) goto L2f
            a.a.a.g.d$b r3 = r2.y
            if (r3 == 0) goto L2f
            android.location.LocationManager r2 = r2.f264b
            if (r2 == 0) goto L2f
            r2.unregisterGnssMeasurementsCallback(r3)     // Catch: java.lang.Exception -> L2b
            goto L2f
        L2b:
            r2 = move-exception
            r2.printStackTrace()
        L2f:
            return
    }

    public final void a(android.location.Location r12, int r13) {
            r11 = this;
            if (r12 == 0) goto L1d1
            int r13 = a.a.a.g.d.X
            java.lang.String r0 = "satellites"
            if (r13 != 0) goto Lf
            android.os.Bundle r13 = r12.getExtras()     // Catch: java.lang.Exception -> Lf
            r13.getInt(r0)     // Catch: java.lang.Exception -> Lf
        Lf:
            boolean r13 = r11.j
            if (r13 == 0) goto L3f
            float r13 = r12.getSpeed()
            r1 = 0
            boolean r13 = a.a.a.i.i.a(r13, r1)
            if (r13 == 0) goto L3f
            double r1 = r11.r
            r3 = 0
            boolean r13 = a.a.a.i.i.a(r1, r3)
            if (r13 != 0) goto L3f
            long r1 = java.lang.System.currentTimeMillis()
            double r1 = (double) r1
            double r3 = r11.s
            double r1 = r1 - r3
            r3 = 4656510908468559872(0x409f400000000000, double:2000.0)
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 >= 0) goto L3f
            double r1 = r11.r
            float r13 = (float) r1
            r12.setSpeed(r13)
        L3f:
            android.location.Location r13 = new android.location.Location
            r13.<init>(r12)
            long r1 = java.lang.System.currentTimeMillis()
            r11.q = r1
            r11.f265c = r12
            int r1 = a.a.a.g.d.X
            r2 = 2
            r3 = 0
            r4 = 1
            if (r12 != 0) goto L54
            goto Lc5
        L54:
            long r5 = java.lang.System.currentTimeMillis()
            android.location.Location r7 = r11.f265c
            r7.setTime(r5)
            android.location.Location r7 = r11.f265c
            float r7 = r7.getSpeed()
            double r7 = (double) r7
            r9 = 4615288898129284301(0x400ccccccccccccd, double:3.6)
            double r7 = r7 * r9
            float r7 = (float) r7
            android.location.Location r8 = r11.f265c
            boolean r8 = r8.hasSpeed()
            if (r8 != 0) goto L75
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
        L75:
            if (r1 != 0) goto L82
            android.location.Location r8 = r11.f265c     // Catch: java.lang.Exception -> L82
            android.os.Bundle r8 = r8.getExtras()     // Catch: java.lang.Exception -> L82
            int r0 = r8.getInt(r0)     // Catch: java.lang.Exception -> L82
            r1 = r0
        L82:
            java.util.Locale r0 = java.util.Locale.CHINA
            r8 = 6
            java.lang.Object[] r8 = new java.lang.Object[r8]
            android.location.Location r9 = r11.f265c
            double r9 = r9.getLongitude()
            java.lang.Double r9 = java.lang.Double.valueOf(r9)
            r8[r3] = r9
            android.location.Location r9 = r11.f265c
            double r9 = r9.getLatitude()
            java.lang.Double r9 = java.lang.Double.valueOf(r9)
            r8[r4] = r9
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            r8[r2] = r7
            android.location.Location r7 = r11.f265c
            float r7 = r7.getBearing()
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            r9 = 3
            r8[r9] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            r9 = 4
            r8[r9] = r7
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r6 = 5
            r8[r6] = r5
            java.lang.String r5 = "&ll=%.5f|%.5f&s=%.1f&d=%.1f&ll_n=%d&ll_t=%d"
            java.lang.String.format(r0, r5, r8)
        Lc5:
            android.location.Location r0 = r11.f265c
            java.lang.String r5 = "gps"
            if (r0 == 0) goto L1bd
            a.a.a.d.i r0 = a.a.a.d.i.m()
            boolean r0 = r0.f()
            if (r0 == 0) goto Le0
            a.a.a.d.i r0 = a.a.a.d.i.m()
            android.location.Location r6 = r11.f265c
            java.util.ArrayList<java.util.ArrayList<java.lang.Float>> r7 = r11.A
            r0.a(r6, r7)
        Le0:
            com.baidu.location.c r0 = new com.baidu.location.c
            java.lang.String r6 = r11.d()
            r0.<init>(r6)
            a.a.a.b.f r6 = a.a.a.b.f.c()
            android.location.Location r7 = r11.f265c
            java.lang.String r8 = "gcj02"
            r6.a(r0, r8, r7)
            android.os.Bundle r12 = r12.getExtras()
            if (r12 != 0) goto Lff
            android.os.Bundle r12 = new android.os.Bundle
            r12.<init>()
        Lff:
            java.lang.String r6 = "sat_num"
            r12.putInt(r6, r1)
            long r6 = java.lang.System.currentTimeMillis()
            long r8 = r11.R
            long r6 = r6 - r8
            long r6 = java.lang.Math.abs(r6)
            r8 = 3000(0xbb8, double:1.482E-320)
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            java.lang.String r6 = "is_support_beidou"
            if (r1 < 0) goto L11b
            r12.putBoolean(r6, r3)
            goto L11e
        L11b:
            r12.putBoolean(r6, r4)
        L11e:
            r0.a(r12)
            a.a.a.d.i r12 = a.a.a.d.i.m()
            boolean r12 = r12.g()
            if (r12 == 0) goto L12c
            goto L15b
        L12c:
            a.a.a.d.i r12 = a.a.a.d.i.m()
            boolean r12 = r12.g()
            java.lang.String r1 = "bd_beidou"
            if (r12 != 0) goto L147
            android.location.Location r12 = r11.f265c
            if (r12 == 0) goto L158
            java.lang.String r12 = r12.getProvider()
            boolean r12 = r1.equals(r12)
            if (r12 == 0) goto L158
            goto L155
        L147:
            android.location.Location r12 = r11.f265c
            if (r12 == 0) goto L158
            java.lang.String r12 = r12.getProvider()
            boolean r12 = r1.equals(r12)
            if (r12 == 0) goto L158
        L155:
            r0.g(r1)
        L158:
            r11.a(r0)
        L15b:
            int r12 = a.a.a.g.d.X
            if (r12 <= r2) goto L1bd
            android.location.Location r12 = r11.f265c
            boolean r12 = a.a.a.b.y.a(r12, r4)
            if (r12 == 0) goto L1bd
            android.location.Location r12 = r11.f265c
            java.lang.String r12 = r12.getProvider()
            boolean r12 = r5.equals(r12)
            if (r12 == 0) goto L1bd
            a.a.a.g.f r12 = a.a.a.g.f.w()
            boolean r12 = r12.t()
            a.a.a.g.f r0 = a.a.a.g.f.w()
            a.a.a.g.a r0 = r0.a()
            if (r0 == 0) goto L18d
            a.a.a.g.a r1 = new a.a.a.g.a
            r1.<init>(r0)
            a.a.a.b.u.a(r1)
        L18d:
            long r0 = java.lang.System.currentTimeMillis()
            a.a.a.b.u.a(r0)
            android.location.Location r0 = new android.location.Location
            android.location.Location r11 = r11.f265c
            r0.<init>(r11)
            a.a.a.b.u.a(r0)
            a.a.a.b.c r11 = a.a.a.b.c.h()
            java.lang.String r11 = r11.d()
            a.a.a.b.u.b(r11)
            a.a.a.b.f r11 = a.a.a.b.f.c()
            java.lang.String r11 = r11.a()
            a.a.a.b.u.a(r11)
            if (r12 != 0) goto L1bd
            a.a.a.b.z r11 = a.a.a.b.z.f()
            r11.d()
        L1bd:
            java.lang.String r11 = r13.getProvider()
            boolean r11 = r5.equals(r11)
            if (r11 == 0) goto L1d0
            a.a.a.b.z r11 = a.a.a.b.z.f()
            int r12 = a.a.a.g.d.X
            r11.a(r13, r12)
        L1d0:
            return
        L1d1:
            r12 = 0
            r11.f265c = r12
            return
    }

    public void a(com.baidu.location.c r2) {
            r1 = this;
            boolean r0 = a.a.a.i.i.k
            if (r0 != 0) goto L14
            android.location.Location r0 = r1.f265c
            int r1 = r1.a(r0)
            if (r1 <= 0) goto L14
            a.a.a.b.c r1 = a.a.a.b.c.h()
            r1.a(r2)
            goto L1b
        L14:
            a.a.a.b.c r1 = a.a.a.b.c.h()
            r1.b(r2)
        L1b:
            return
    }

    public final void a(java.lang.String r11, int r12, int r13, int r14) {
            r10 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 != 0) goto L107
            boolean r0 = r10.a(r11)
            if (r0 != 0) goto Le
            goto L107
        Le:
            java.lang.String r0 = ","
            java.lang.String[] r0 = r11.split(r0)
            java.lang.String r1 = "$GPGGA,"
            boolean r1 = r11.startsWith(r1)
            r2 = 6
            if (r1 == 0) goto L22
            int r11 = r0.length
            r1 = 7
            if (r11 >= r1) goto L2e
            return
        L22:
            java.lang.String r1 = "$GPRMC,"
            boolean r11 = r11.startsWith(r1)
            if (r11 == 0) goto L2e
            int r11 = r0.length
            if (r11 >= r2) goto L2e
            return
        L2e:
            r11 = r0[r12]
            java.lang.String r11 = r11.trim()
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            r3 = 4633641066610819072(0x404e000000000000, double:60.0)
            r1 = 0
            r5 = 1
            r6 = 0
            r7 = 2
            if (r11 != 0) goto L7e
            r11 = r0[r12]
            java.lang.String r11 = r11.trim()
            int r11 = r11.length()
            if (r11 <= r7) goto L7e
            r11 = r0[r12]     // Catch: java.lang.NumberFormatException -> L7b
            java.lang.String r11 = r11.substring(r6, r7)     // Catch: java.lang.NumberFormatException -> L7b
            java.lang.Double r11 = java.lang.Double.valueOf(r11)     // Catch: java.lang.NumberFormatException -> L7b
            double r8 = r11.doubleValue()     // Catch: java.lang.NumberFormatException -> L7b
            r11 = r0[r12]     // Catch: java.lang.NumberFormatException -> L7b
            java.lang.String r11 = r11.substring(r7)     // Catch: java.lang.NumberFormatException -> L7b
            java.lang.Double r11 = java.lang.Double.valueOf(r11)     // Catch: java.lang.NumberFormatException -> L7b
            double r11 = r11.doubleValue()     // Catch: java.lang.NumberFormatException -> L7b
            double r11 = r11 / r3
            double r8 = r8 + r11
            com.baidu.location.c r11 = r10.L     // Catch: java.lang.NumberFormatException -> L7b
            if (r11 != 0) goto L75
            com.baidu.location.c r11 = new com.baidu.location.c     // Catch: java.lang.NumberFormatException -> L7b
            r11.<init>()     // Catch: java.lang.NumberFormatException -> L7b
            r10.L = r11     // Catch: java.lang.NumberFormatException -> L7b
        L75:
            com.baidu.location.c r11 = r10.L     // Catch: java.lang.NumberFormatException -> L7b
            r11.c(r8)     // Catch: java.lang.NumberFormatException -> L7b
            goto L80
        L7b:
            r10.N = r5
            goto L80
        L7e:
            r10.L = r1
        L80:
            com.baidu.location.c r11 = r10.L
            if (r11 == 0) goto Lc4
            r11 = r0[r13]
            java.lang.String r11 = r11.trim()
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto Lc4
            r11 = r0[r13]
            java.lang.String r11 = r11.trim()
            int r11 = r11.length()
            r12 = 3
            if (r11 <= r12) goto Lc4
            r11 = r0[r13]     // Catch: java.lang.NumberFormatException -> Lc1
            java.lang.String r11 = r11.substring(r6, r12)     // Catch: java.lang.NumberFormatException -> Lc1
            java.lang.Double r11 = java.lang.Double.valueOf(r11)     // Catch: java.lang.NumberFormatException -> Lc1
            double r8 = r11.doubleValue()     // Catch: java.lang.NumberFormatException -> Lc1
            r11 = r0[r13]     // Catch: java.lang.NumberFormatException -> Lc1
            java.lang.String r11 = r11.substring(r12)     // Catch: java.lang.NumberFormatException -> Lc1
            java.lang.Double r11 = java.lang.Double.valueOf(r11)     // Catch: java.lang.NumberFormatException -> Lc1
            double r11 = r11.doubleValue()     // Catch: java.lang.NumberFormatException -> Lc1
            double r11 = r11 / r3
            double r8 = r8 + r11
            com.baidu.location.c r11 = r10.L     // Catch: java.lang.NumberFormatException -> Lc1
            r11.d(r8)     // Catch: java.lang.NumberFormatException -> Lc1
            goto Lc6
        Lc1:
            r10.N = r5
            goto Lc6
        Lc4:
            r10.L = r1
        Lc6:
            r11 = r0[r14]
            java.lang.String r11 = r11.trim()
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto Lfb
            if (r14 != r7) goto Lea
            r11 = r0[r14]
            java.lang.String r12 = "V"
            boolean r11 = android.text.TextUtils.equals(r11, r12)
            if (r11 == 0) goto Ldf
            goto Lf6
        Ldf:
            r11 = r0[r14]
            java.lang.String r12 = "A"
            boolean r11 = android.text.TextUtils.equals(r11, r12)
            if (r11 == 0) goto Lfb
            goto Lf9
        Lea:
            if (r14 != r2) goto Lfb
            r11 = r0[r14]
            java.lang.String r12 = "0"
            boolean r11 = android.text.TextUtils.equals(r11, r12)
            if (r11 == 0) goto Lf9
        Lf6:
            r10.M = r6
            goto Lfb
        Lf9:
            r10.M = r5
        Lfb:
            com.baidu.location.c r11 = r10.L
            if (r11 == 0) goto L101
            r10.N = r6
        L101:
            long r11 = java.lang.System.currentTimeMillis()
            r10.K = r11
        L107:
            return
    }

    public final void a(java.lang.String r3, android.location.Location r4) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            a.a.a.b.c r3 = a.a.a.b.c.h()
            java.lang.String r3 = r3.d()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            a.a.a.g.f r3 = a.a.a.g.f.w()
            boolean r3 = r3.t()
            a.a.a.g.f r0 = a.a.a.g.f.w()
            a.a.a.g.a r0 = r0.a()
            if (r0 == 0) goto L34
            a.a.a.g.a r1 = new a.a.a.g.a
            r1.<init>(r0)
            a.a.a.b.u.a(r1)
        L34:
            long r0 = java.lang.System.currentTimeMillis()
            a.a.a.b.u.a(r0)
            android.location.Location r0 = new android.location.Location
            r0.<init>(r4)
            a.a.a.b.u.a(r0)
            a.a.a.b.u.b(r2)
            a.a.a.b.f r4 = a.a.a.b.f.c()
            java.lang.String r4 = r4.a()
            a.a.a.b.u.a(r4)
            if (r3 != 0) goto L63
            a.a.a.g.a r3 = a.a.a.b.u.d()
            android.location.Location r4 = a.a.a.b.u.c()
            java.lang.String r0 = a.a.a.b.u.a()
            r1 = 0
            a.a.a.b.y.a(r3, r1, r4, r2, r0)
        L63:
            return
    }

    public final void a(java.util.ArrayList<java.util.ArrayList<java.lang.Float>> r4) {
            r3 = this;
            if (r4 == 0) goto L6d
            int r4 = r4.size()
            if (r4 <= 0) goto L6d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r0 = 100
            r4.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList<java.util.ArrayList<java.lang.Float>> r1 = r3.D
            r0.addAll(r1)
            int r1 = a.a.a.i.c.a(r0)
            r4.append(r1)
            java.lang.String r1 = "|"
            r4.append(r1)
            int r2 = a.a.a.i.c.b(r0)
            r4.append(r2)
            r4.append(r1)
            int r2 = a.a.a.i.c.c(r0)
            r4.append(r2)
            r4.append(r1)
            int r2 = a.a.a.i.c.h(r0)
            r4.append(r2)
            r4.append(r1)
            int r2 = a.a.a.i.c.d(r0)
            r4.append(r2)
            r4.append(r1)
            int r2 = a.a.a.i.c.e(r0)
            r4.append(r2)
            r4.append(r1)
            int r2 = a.a.a.i.c.f(r0)
            r4.append(r2)
            r4.append(r1)
            int r0 = a.a.a.i.c.g(r0)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            goto L6e
        L6d:
            r4 = 0
        L6e:
            r3.H = r4
            long r0 = java.lang.System.currentTimeMillis()
            r3.I = r0
            return
    }

    public void a(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L6
            r0.k()
            goto L9
        L6:
            r0.l()
        L9:
            return
    }

    public final boolean a(java.lang.String r8) {
            r7 = this;
            java.lang.String r7 = "*"
            int r0 = r8.indexOf(r7)
            r1 = -1
            r2 = 0
            if (r0 != r1) goto Lb
            return r2
        Lb:
            java.lang.String r0 = "$"
            int r3 = r8.indexOf(r0)
            if (r3 != r1) goto L14
            return r2
        L14:
            int r0 = r8.indexOf(r0)
            int r3 = r8.indexOf(r7)
            if (r0 <= r3) goto L1f
            return r2
        L1f:
            int r0 = r8.length()
            int r3 = r8.indexOf(r7)
            if (r0 < r3) goto L6b
            int r0 = r8.indexOf(r7)
            java.lang.String r0 = r8.substring(r2, r0)
            byte[] r0 = r0.getBytes()
            r3 = 1
            r4 = r0[r3]
            r5 = 2
        L39:
            int r6 = r0.length
            if (r5 >= r6) goto L42
            r6 = r0[r5]
            r4 = r4 ^ r6
            int r5 = r5 + 1
            goto L39
        L42:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0[r2] = r4
            java.lang.String r4 = "%02x"
            java.lang.String r0 = java.lang.String.format(r4, r0)
            int r7 = r8.indexOf(r7)
            if (r7 != r1) goto L57
            return r2
        L57:
            int r1 = r8.length()
            int r4 = r7 + 3
            if (r1 < r4) goto L6b
            int r7 = r7 + r3
            java.lang.String r7 = r8.substring(r7, r4)
            boolean r7 = r0.equalsIgnoreCase(r7)
            if (r7 == 0) goto L6b
            return r3
        L6b:
            return r2
    }

    public final java.lang.String b(java.util.ArrayList<java.util.ArrayList<java.lang.Float>> r8) {
            r7 = this;
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            int r0 = r8.size()
            if (r0 != 0) goto L10
            java.lang.String r7 = r7.toString()
            return r7
        L10:
            java.util.Iterator r8 = r8.iterator()
            r0 = 1
            r1 = r0
        L16:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L9a
            java.lang.Object r2 = r8.next()
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r3 = r2.size()
            r4 = 6
            if (r3 == r4) goto L2a
            goto L16
        L2a:
            r3 = 0
            if (r1 == 0) goto L2f
            r1 = r3
            goto L34
        L2f:
            java.lang.String r4 = "|"
            r7.append(r4)
        L34:
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.Object r5 = r2.get(r3)
            r4[r3] = r5
            java.lang.String r5 = "%.1f;"
            java.lang.String r4 = java.lang.String.format(r5, r4)
            r7.append(r4)
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.Object r6 = r2.get(r0)
            r4[r3] = r6
            java.lang.String r4 = java.lang.String.format(r5, r4)
            r7.append(r4)
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r6 = 2
            java.lang.Object r6 = r2.get(r6)
            r4[r3] = r6
            java.lang.String r4 = java.lang.String.format(r5, r4)
            r7.append(r4)
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r5 = 3
            java.lang.Object r5 = r2.get(r5)
            r4[r3] = r5
            java.lang.String r5 = "%.0f;"
            java.lang.String r4 = java.lang.String.format(r5, r4)
            r7.append(r4)
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r6 = 4
            java.lang.Object r6 = r2.get(r6)
            r4[r3] = r6
            java.lang.String r4 = java.lang.String.format(r5, r4)
            r7.append(r4)
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r5 = 5
            java.lang.Object r2 = r2.get(r5)
            r4[r3] = r2
            java.lang.String r2 = "%.0f"
            java.lang.String r2 = java.lang.String.format(r2, r4)
            r7.append(r2)
            goto L16
        L9a:
            java.lang.String r7 = r7.toString()
            return r7
    }

    public synchronized void b() {
            r2 = this;
            monitor-enter(r2)
            r2.l()     // Catch: java.lang.Throwable -> L35
            android.location.LocationManager r0 = r2.f264b     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto La
            monitor-exit(r2)
            return
        La:
            r0 = 0
            a.a.a.g.d$f r1 = r2.w     // Catch: java.lang.Exception -> L13 java.lang.Throwable -> L35
            if (r1 == 0) goto L17
            r1.removeCallbacksAndMessages(r0)     // Catch: java.lang.Exception -> L13 java.lang.Throwable -> L35
            goto L17
        L13:
            r1 = move-exception
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L35
        L17:
            r2.f264b = r0     // Catch: java.lang.Throwable -> L35
            a.a.a.b.d r0 = a.a.a.b.d.i()     // Catch: java.lang.Throwable -> L35
            int r0 = r0.F     // Catch: java.lang.Throwable -> L35
            r1 = 1
            if (r0 != r1) goto L33
            a.a.a.b.i r0 = a.a.a.b.i.d()     // Catch: java.lang.Throwable -> L35
            boolean r0 = r0.c()     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L33
            a.a.a.b.i r0 = a.a.a.b.i.d()     // Catch: java.lang.Throwable -> L35
            r0.a()     // Catch: java.lang.Throwable -> L35
        L33:
            monitor-exit(r2)
            return
        L35:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public final void b(android.location.Location r5) {
            r4 = this;
            a.a.a.g.d$f r0 = r4.w
            if (r0 == 0) goto L1d
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r4.O
            long r0 = r0 - r2
            r2 = 3000(0xbb8, double:1.482E-320)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L1d
            a.a.a.g.d$f r0 = r4.w
            r1 = 1
            android.os.Message r5 = r0.obtainMessage(r1, r5)
            a.a.a.g.d$f r4 = r4.w
            r4.sendMessage(r5)
        L1d:
            return
    }

    public final void b(java.lang.String r4) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L29
            boolean r0 = r3.a(r4)
            if (r0 != 0) goto Ld
            goto L29
        Ld:
            java.lang.String r0 = "$GPGGA,"
            boolean r0 = r4.startsWith(r0)
            r1 = 2
            if (r0 == 0) goto L1c
            r0 = 4
            r2 = 6
            r3.a(r4, r1, r0, r2)
            goto L29
        L1c:
            java.lang.String r0 = "$GPRMC,"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L29
            r0 = 3
            r2 = 5
            r3.a(r4, r0, r2, r1)
        L29:
            return
    }

    public final void b(boolean r1) {
            r0 = this;
            r0.p = r1
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            a.a.a.g.d.m0 = r0
            return
    }

    public synchronized java.lang.String c() {
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "-2"
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1e
            long r3 = r5.I     // Catch: java.lang.Throwable -> L1e
            long r1 = r1 - r3
            long r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Throwable -> L1e
            r3 = 3000(0xbb8, double:1.482E-320)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L1b
            java.lang.String r0 = r5.H     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L22
            java.lang.String r0 = "0"
            goto L22
        L1b:
            java.lang.String r0 = "-1"
            goto L22
        L1e:
            r1 = move-exception
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L35
        L22:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r1.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = "&gnsf="
            r1.append(r2)     // Catch: java.lang.Throwable -> L35
            r1.append(r0)     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L35
            monitor-exit(r5)
            return r0
        L35:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
    }

    public java.lang.String d() {
            r13 = this;
            android.location.Location r0 = r13.f265c
            if (r0 == 0) goto L17a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "{\"result\":{\"time\":\""
            r0.append(r1)
            java.lang.String r1 = a.a.a.i.i.i()
            r0.append(r1)
            java.lang.String r1 = "\",\"error\":\"61\"},\"content\":{\"point\":{\"x\":\"%f\",\"y\":\"%f\"},\"radius\":\"%d\",\"d\":\"%f\",\"s\":\"%f\",\"n\":\"%d\""
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.location.Location r1 = r13.f265c
            boolean r1 = r1.hasAccuracy()
            if (r1 == 0) goto L2d
            android.location.Location r1 = r13.f265c
            float r1 = r1.getAccuracy()
            goto L2f
        L2d:
            r1 = 1092616192(0x41200000, float:10.0)
        L2f:
            int r1 = (int) r1
            android.location.Location r2 = r13.f265c
            float r2 = r2.getSpeed()
            double r2 = (double) r2
            r4 = 4615288898129284301(0x400ccccccccccccd, double:3.6)
            double r2 = r2 * r4
            float r2 = (float) r2
            android.location.Location r3 = r13.f265c
            boolean r3 = r3.hasSpeed()
            if (r3 != 0) goto L48
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L48:
            r3 = 2
            double[] r4 = new double[r3]
            a.a.a.i.f r5 = a.a.a.i.f.a()
            android.location.Location r6 = r13.f265c
            double r6 = r6.getLongitude()
            android.location.Location r8 = r13.f265c
            double r8 = r8.getLatitude()
            boolean r5 = r5.a(r6, r8)
            r6 = 0
            r8 = 0
            r9 = 1
            if (r5 == 0) goto L95
            android.location.Location r4 = r13.f265c
            double r4 = r4.getLongitude()
            android.location.Location r10 = r13.f265c
            double r10 = r10.getLatitude()
            java.lang.String r12 = "gps2gcj"
            double[] r4 = com.baidu.location.Jni.a(r4, r10, r12)
            r10 = r4[r8]
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 > 0) goto L93
            r10 = r4[r9]
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 > 0) goto L93
            android.location.Location r5 = r13.f265c
            double r5 = r5.getLongitude()
            r4[r8] = r5
            android.location.Location r5 = r13.f265c
            double r5 = r5.getLatitude()
            r4[r9] = r5
        L93:
            r5 = r9
            goto Lc2
        L95:
            android.location.Location r5 = r13.f265c
            double r10 = r5.getLongitude()
            r4[r8] = r10
            android.location.Location r5 = r13.f265c
            double r10 = r5.getLatitude()
            r4[r9] = r10
            r10 = r4[r8]
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 > 0) goto Lc1
            r10 = r4[r9]
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 > 0) goto Lc1
            android.location.Location r5 = r13.f265c
            double r5 = r5.getLongitude()
            r4[r8] = r5
            android.location.Location r5 = r13.f265c
            double r5 = r5.getLatitude()
            r4[r9] = r5
        Lc1:
            r5 = r8
        Lc2:
            java.util.Locale r6 = java.util.Locale.CHINA
            r7 = 6
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r10 = r4[r8]
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            r7[r8] = r10
            r10 = r4[r9]
            java.lang.Double r4 = java.lang.Double.valueOf(r10)
            r7[r9] = r4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r7[r3] = r1
            android.location.Location r1 = r13.f265c
            float r1 = r1.getBearing()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r3 = 3
            r7[r3] = r1
            java.lang.Float r1 = java.lang.Float.valueOf(r2)
            r2 = 4
            r7[r2] = r1
            int r1 = a.a.a.g.d.X
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 5
            r7[r2] = r1
            java.lang.String r0 = java.lang.String.format(r6, r0, r7)
            if (r5 != 0) goto L111
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ",\"in_cn\":\"0\""
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L111:
            boolean r1 = a.a.a.i.i.k
            if (r1 != 0) goto L13a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.util.Locale r0 = java.util.Locale.CHINA
            java.lang.Object[] r2 = new java.lang.Object[r9]
            android.location.Location r3 = r13.f265c
            int r3 = r13.a(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r8] = r3
            java.lang.String r3 = ",\"is_mock\":%d"
            java.lang.String r0 = java.lang.String.format(r0, r3, r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L13a:
            android.location.Location r1 = r13.f265c
            boolean r1 = r1.hasAltitude()
            if (r1 == 0) goto L168
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.util.Locale r0 = java.util.Locale.CHINA
            java.lang.Object[] r2 = new java.lang.Object[r9]
            android.location.Location r13 = r13.f265c
            double r3 = r13.getAltitude()
            java.lang.Double r13 = java.lang.Double.valueOf(r3)
            r2[r8] = r13
            java.lang.String r13 = ",\"h\":%.2f}}"
            java.lang.String r13 = java.lang.String.format(r0, r13, r2)
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            goto L17b
        L168:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r0)
            java.lang.String r0 = "}}"
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            goto L17b
        L17a:
            r13 = 0
        L17b:
            return r13
    }

    public android.location.Location e() {
            r6 = this;
            android.location.Location r0 = r6.f265c
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            long r2 = java.lang.System.currentTimeMillis()
            android.location.Location r0 = r6.f265c
            long r4 = r0.getTime()
            long r2 = r2 - r4
            long r2 = java.lang.Math.abs(r2)
            r4 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L1d
            return r1
        L1d:
            android.location.Location r6 = r6.f265c
            return r6
    }

    public java.lang.String f() {
            r3 = this;
            boolean r0 = r3.j()
            if (r0 == 0) goto L3c
            android.location.Location r0 = r3.f265c
            if (r0 == 0) goto L3c
            java.lang.String r0 = f(r0)
            java.lang.String r1 = "ll"
            java.lang.String r2 = "idll"
            java.lang.String r0 = r0.replaceAll(r1, r2)
            java.lang.String r1 = "&d="
            java.lang.String r2 = "&idd="
            java.lang.String r0 = r0.replaceAll(r1, r2)
            java.lang.String r1 = "&s"
            java.lang.String r2 = "&ids="
            java.lang.String r0 = r0.replaceAll(r1, r2)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            android.location.Location r3 = r3.f265c
            java.lang.String r3 = r3.getProvider()
            r0 = 1
            r1[r0] = r3
            java.lang.String r3 = "%s&idgps_tp=%s"
            java.lang.String r3 = java.lang.String.format(r3, r1)
            return r3
        L3c:
            r3 = 0
            return r3
    }

    public com.baidu.location.c g() {
            r6 = this;
            com.baidu.location.c r0 = r6.L
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r6.K
            long r2 = r2 - r4
            long r2 = java.lang.Math.abs(r2)
            r4 = 3000(0xbb8, double:1.482E-320)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L18
            return r1
        L18:
            com.baidu.location.c r6 = r6.L
            return r6
    }

    public boolean h() {
            r0 = this;
            boolean r0 = r0.S
            return r0
    }

    public boolean i() {
            r6 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L2e
            int r4 = a.a.a.g.d.X     // Catch: java.lang.Exception -> L2e
            if (r4 != 0) goto L16
            android.location.Location r4 = r6.f265c     // Catch: java.lang.Exception -> L16
            android.os.Bundle r4 = r4.getExtras()     // Catch: java.lang.Exception -> L16
            java.lang.String r5 = "satellites"
            r4.getInt(r5)     // Catch: java.lang.Exception -> L16
        L16:
            android.location.Location r4 = r6.f265c     // Catch: java.lang.Exception -> L2e
            if (r4 == 0) goto L2d
            double r4 = r4.getLatitude()     // Catch: java.lang.Exception -> L2e
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L2d
            android.location.Location r4 = r6.f265c     // Catch: java.lang.Exception -> L2e
            double r4 = r4.getLongitude()     // Catch: java.lang.Exception -> L2e
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L2d
            return r0
        L2d:
            return r1
        L2e:
            android.location.Location r4 = r6.f265c
            if (r4 == 0) goto L45
            double r4 = r4.getLatitude()
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L45
            android.location.Location r6 = r6.f265c
            double r4 = r6.getLongitude()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L45
            return r0
        L45:
            return r1
    }

    public boolean j() {
            r6 = this;
            boolean r0 = r6.i()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r0 = a.a.a.i.i.k()
            if (r0 == 0) goto Lf
            return r1
        Lf:
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r6.q
            long r2 = r2 - r4
            r4 = 10000(0x2710, double:4.9407E-320)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L1d
            return r1
        L1d:
            long r0 = java.lang.System.currentTimeMillis()
            boolean r2 = r6.n
            if (r2 == 0) goto L30
            long r2 = r6.m
            long r0 = r0 - r2
            r2 = 3000(0xbb8, double:1.482E-320)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L30
            r6 = 1
            return r6
        L30:
            boolean r6 = r6.p
            return r6
    }

    public void k() {
            r11 = this;
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r1 = r11.o
            if (r1 == 0) goto L7
            return
        L7:
            r1 = 0
            r2 = 1
            boolean r3 = r11.h     // Catch: java.lang.Exception -> L3f
            if (r3 != 0) goto L1a
            a.a.a.g.d$e r3 = new a.a.a.g.d$e     // Catch: java.lang.Exception -> L3f
            r3.<init>(r11, r1)     // Catch: java.lang.Exception -> L3f
            r11.i = r3     // Catch: java.lang.Exception -> L3f
            android.location.LocationManager r4 = r11.f264b     // Catch: java.lang.Exception -> L3f
            r4.addGpsStatusListener(r3)     // Catch: java.lang.Exception -> L3f
            goto L2e
        L1a:
            android.content.Context r3 = r11.f263a     // Catch: java.lang.Exception -> L3f
            int r3 = a.a.a.i.i.a(r3, r0)     // Catch: java.lang.Exception -> L3f
            if (r3 != r2) goto L2e
            a.a.a.g.d$d r3 = new a.a.a.g.d$d     // Catch: java.lang.Exception -> L3f
            r3.<init>(r11, r1)     // Catch: java.lang.Exception -> L3f
            r11.g = r3     // Catch: java.lang.Exception -> L3f
            android.location.LocationManager r4 = r11.f264b     // Catch: java.lang.Exception -> L3f
            r4.registerGnssStatusCallback(r3)     // Catch: java.lang.Exception -> L3f
        L2e:
            a.a.a.g.d$i r10 = new a.a.a.g.d$i     // Catch: java.lang.Exception -> L3f
            r10.<init>(r11, r1)     // Catch: java.lang.Exception -> L3f
            r11.e = r10     // Catch: java.lang.Exception -> L3f
            android.location.LocationManager r5 = r11.f264b     // Catch: java.lang.Exception -> L3f
            java.lang.String r6 = "passive"
            r7 = 9000(0x2328, double:4.4466E-320)
            r9 = 0
            r5.requestLocationUpdates(r6, r7, r9, r10)     // Catch: java.lang.Exception -> L3f
        L3f:
            a.a.a.g.d$g r3 = new a.a.a.g.d$g     // Catch: java.lang.Exception -> Lda
            r3.<init>(r11, r1)     // Catch: java.lang.Exception -> Lda
            r11.d = r3     // Catch: java.lang.Exception -> Lda
            android.os.Bundle r3 = new android.os.Bundle     // Catch: java.lang.Exception -> L54
            r3.<init>()     // Catch: java.lang.Exception -> L54
            android.location.LocationManager r4 = r11.f264b     // Catch: java.lang.Exception -> L54
            java.lang.String r5 = "gps"
            java.lang.String r6 = "force_xtra_injection"
            r4.sendExtraCommand(r5, r6, r3)     // Catch: java.lang.Exception -> L54
        L54:
            android.content.Context r3 = r11.f263a     // Catch: java.lang.Exception -> Lda
            int r0 = a.a.a.i.i.a(r3, r0)     // Catch: java.lang.Exception -> Lda
            if (r0 != r2) goto L6a
            android.location.LocationManager r3 = r11.f264b     // Catch: java.lang.Exception -> Lda
            java.lang.String r4 = "gps"
            r5 = 1000(0x3e8, double:4.94E-321)
            r7 = 0
            a.a.a.g.d$g r8 = r11.d     // Catch: java.lang.Exception -> Lda
            r3.requestLocationUpdates(r4, r5, r7, r8)     // Catch: java.lang.Exception -> Lda
            r11.S = r2     // Catch: java.lang.Exception -> Lda
        L6a:
            boolean r0 = r11.h     // Catch: java.lang.Exception -> Lda
            if (r0 == 0) goto L8c
            a.a.a.g.d$c r0 = r11.z     // Catch: java.lang.Exception -> Lda
            if (r0 != 0) goto L8c
            int r0 = a.a.a.i.i.u0     // Catch: java.lang.Exception -> Lda
            if (r0 != r2) goto L8c
            java.util.Random r0 = new java.util.Random     // Catch: java.lang.Exception -> Lda
            r0.<init>()     // Catch: java.lang.Exception -> Lda
            double r3 = r0.nextDouble()     // Catch: java.lang.Exception -> Lda
            double r5 = a.a.a.i.i.t0     // Catch: java.lang.Exception -> Lda
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L8c
            a.a.a.g.d$c r0 = new a.a.a.g.d$c     // Catch: java.lang.Exception -> Lda
            r0.<init>(r11, r1)     // Catch: java.lang.Exception -> Lda
            r11.z = r0     // Catch: java.lang.Exception -> Lda
        L8c:
            a.a.a.g.d$c r0 = r11.z     // Catch: java.lang.Exception -> Lda
            if (r0 == 0) goto L95
            android.location.LocationManager r3 = r11.f264b     // Catch: java.lang.Exception -> Lda
            r3.registerGnssNavigationMessageCallback(r0)     // Catch: java.lang.Exception -> Lda
        L95:
            java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> Lda
            boolean r0 = a.a.a.i.i.k     // Catch: java.lang.Exception -> Lda
            if (r0 != 0) goto Ld8
            int r0 = a.a.a.i.i.N0     // Catch: java.lang.Exception -> Lda
            if (r0 != r2) goto Ld8
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> Lda
            r3 = 24
            if (r0 < r3) goto Lb3
            a.a.a.g.d$a r0 = new a.a.a.g.d$a     // Catch: java.lang.Exception -> Lda
            r0.<init>(r11)     // Catch: java.lang.Exception -> Lda
            r11.l = r0     // Catch: java.lang.Exception -> Lda
            android.location.LocationManager r1 = r11.f264b     // Catch: java.lang.Exception -> Lda
            r1.addNmeaListener(r0)     // Catch: java.lang.Exception -> Lda
            goto Ld8
        Lb3:
            a.a.a.g.d$h r0 = new a.a.a.g.d$h     // Catch: java.lang.Exception -> Lda
            r0.<init>(r11, r1)     // Catch: java.lang.Exception -> Lda
            r11.k = r0     // Catch: java.lang.Exception -> Lda
            java.lang.String r0 = "android.location.LocationManager"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> Lda
            java.lang.String r1 = "addNmeaListener"
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> Lda
            java.lang.Class<android.location.GpsStatus$NmeaListener> r4 = android.location.GpsStatus.NmeaListener.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Exception -> Lda
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch: java.lang.Exception -> Lda
            android.location.LocationManager r1 = r11.f264b     // Catch: java.lang.Exception -> Lda
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> Lda
            android.location.GpsStatus$NmeaListener r4 = r11.k     // Catch: java.lang.Exception -> Lda
            r3[r5] = r4     // Catch: java.lang.Exception -> Lda
            r0.invoke(r1, r3)     // Catch: java.lang.Exception -> Lda
        Ld8:
            r11.o = r2     // Catch: java.lang.Exception -> Lda
        Lda:
            return
    }

    public void l() {
            r7 = this;
            boolean r0 = r7.o
            if (r0 != 0) goto L5
            return
        L5:
            android.location.LocationManager r0 = r7.f264b
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L70
            a.a.a.g.d$e r3 = r7.i     // Catch: java.lang.Exception -> L2e
            if (r3 == 0) goto L14
            r0.removeGpsStatusListener(r3)     // Catch: java.lang.Exception -> L2e
            r7.i = r1     // Catch: java.lang.Exception -> L2e
        L14:
            boolean r0 = r7.h     // Catch: java.lang.Exception -> L2e
            if (r0 == 0) goto L23
            a.a.a.g.d$d r0 = r7.g     // Catch: java.lang.Exception -> L2e
            if (r0 == 0) goto L23
            android.location.LocationManager r3 = r7.f264b     // Catch: java.lang.Exception -> L2e
            r3.unregisterGnssStatusCallback(r0)     // Catch: java.lang.Exception -> L2e
            r7.g = r1     // Catch: java.lang.Exception -> L2e
        L23:
            a.a.a.g.d$i r0 = r7.e     // Catch: java.lang.Exception -> L2e
            if (r0 == 0) goto L2e
            android.location.LocationManager r3 = r7.f264b     // Catch: java.lang.Exception -> L2e
            r3.removeUpdates(r0)     // Catch: java.lang.Exception -> L2e
            r7.e = r1     // Catch: java.lang.Exception -> L2e
        L2e:
            a.a.a.g.d$g r0 = r7.d     // Catch: java.lang.Exception -> L70
            if (r0 == 0) goto L39
            android.location.LocationManager r3 = r7.f264b     // Catch: java.lang.Exception -> L70
            r3.removeUpdates(r0)     // Catch: java.lang.Exception -> L70
            r7.S = r2     // Catch: java.lang.Exception -> L70
        L39:
            android.location.OnNmeaMessageListener r0 = r7.l     // Catch: java.lang.Exception -> L70
            if (r0 == 0) goto L42
            android.location.LocationManager r3 = r7.f264b     // Catch: java.lang.Exception -> L70
            r3.removeNmeaListener(r0)     // Catch: java.lang.Exception -> L70
        L42:
            android.location.GpsStatus$NmeaListener r0 = r7.k     // Catch: java.lang.Exception -> L70
            if (r0 == 0) goto L64
            java.lang.String r0 = "android.location.LocationManager"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L70
            java.lang.String r3 = "removeNmeaListener"
            r4 = 1
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L70
            java.lang.Class<android.location.GpsStatus$NmeaListener> r6 = android.location.GpsStatus.NmeaListener.class
            r5[r2] = r6     // Catch: java.lang.Exception -> L70
            java.lang.reflect.Method r0 = r0.getMethod(r3, r5)     // Catch: java.lang.Exception -> L70
            android.location.LocationManager r3 = r7.f264b     // Catch: java.lang.Exception -> L70
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L70
            android.location.GpsStatus$NmeaListener r5 = r7.k     // Catch: java.lang.Exception -> L70
            r4[r2] = r5     // Catch: java.lang.Exception -> L70
            r0.invoke(r3, r4)     // Catch: java.lang.Exception -> L70
        L64:
            a.a.a.g.d$c r0 = r7.z     // Catch: java.lang.Exception -> L70
            if (r0 == 0) goto L6d
            android.location.LocationManager r3 = r7.f264b     // Catch: java.lang.Exception -> L70
            r3.unregisterGnssNavigationMessageCallback(r0)     // Catch: java.lang.Exception -> L70
        L6d:
            r7.a(r2)     // Catch: java.lang.Exception -> L70
        L70:
            a.a.a.i.i.f356c = r2
            a.a.a.i.i.s = r2
            r7.d = r1
            r7.o = r2
            r7.b(r2)
            return
    }
}
