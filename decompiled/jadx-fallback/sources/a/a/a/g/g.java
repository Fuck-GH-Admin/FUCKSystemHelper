package a.a.a.g;

/* JADX INFO: loaded from: classes.dex */
public class g {
    public static boolean d = false;
    public static a.a.a.g.e e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f288c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f289a = null;

        static {
                a.a.a.g.g$b[] r0 = a.a.a.g.g.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a.a.a.g.g.a.f289a = r0
                a.a.a.g.g$b r1 = a.a.a.g.g.b.f290b     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = a.a.a.g.g.a.f289a     // Catch: java.lang.NoSuchFieldError -> L1d
                a.a.a.g.g$b r1 = a.a.a.g.g.b.f291c     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = a.a.a.g.g.a.f289a     // Catch: java.lang.NoSuchFieldError -> L28
                a.a.a.g.g$b r1 = a.a.a.g.g.b.d     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    public static final enum b extends java.lang.Enum<a.a.a.g.g.b> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a.a.a.g.g.b f290b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a.a.a.g.g.b f291c = null;
        public static final a.a.a.g.g.b d = null;
        public static final /* synthetic */ a.a.a.g.g.b[] e = null;

        static {
                a.a.a.g.g$b r0 = new a.a.a.g.g$b
                r1 = 0
                java.lang.String r2 = "ONLY_CELL_MODE"
                r0.<init>(r2, r1)
                a.a.a.g.g.b.f290b = r0
                a.a.a.g.g$b r2 = new a.a.a.g.g$b
                r3 = 1
                java.lang.String r4 = "ONLY_WIFI_MODE"
                r2.<init>(r4, r3)
                a.a.a.g.g.b.f291c = r2
                a.a.a.g.g$b r4 = new a.a.a.g.g$b
                r5 = 2
                java.lang.String r6 = "GET_ALL_DATA"
                r4.<init>(r6, r5)
                a.a.a.g.g.b.d = r4
                r6 = 3
                a.a.a.g.g$b[] r6 = new a.a.a.g.g.b[r6]
                r6[r1] = r0
                r6[r3] = r2
                r6[r5] = r4
                a.a.a.g.g.b.e = r6
                return
        }

        public b(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static a.a.a.g.g.b valueOf(java.lang.String r1) {
                java.lang.Class<a.a.a.g.g$b> r0 = a.a.a.g.g.b.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                a.a.a.g.g$b r1 = (a.a.a.g.g.b) r1
                return r1
        }

        public static a.a.a.g.g.b[] values() {
                a.a.a.g.g$b[] r0 = a.a.a.g.g.b.e
                java.lang.Object r0 = r0.clone()
                a.a.a.g.g$b[] r0 = (a.a.a.g.g.b[]) r0
                return r0
        }
    }

    static {
            return
    }

    public g() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f286a = r0
            r1.f287b = r0
            r0 = 0
            r1.f288c = r0
            return
    }

    public static boolean g() {
            boolean r0 = a.a.a.g.g.d
            return r0
    }

    public static a.a.a.g.e h() {
            a.a.a.g.e r0 = a.a.a.g.g.e
            return r0
    }

    public a.a.a.g.a a(int r3) {
            r2 = this;
            boolean r0 = r2.f288c
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r2 = r2.f286a
            if (r2 == 0) goto L12
            a.a.a.g.l.a r2 = a.a.a.g.l.a.i()
            a.a.a.g.a r1 = r2.a(r3)
        L12:
            return r1
    }

    public a.a.a.g.a a(a.a.a.g.a r1, android.telephony.TelephonyManager r2) {
            r0 = this;
            a.a.a.g.l.a r0 = a.a.a.g.l.a.i()
            a.a.a.g.a r0 = r0.a(r1, r2)
            return r0
    }

    public android.net.wifi.WifiInfo a() {
            r0 = this;
            a.a.a.g.l.b r0 = a.a.a.g.l.b.i()
            android.net.wifi.WifiInfo r0 = r0.a()
            return r0
    }

    public java.lang.String a(int r1, boolean r2, a.a.a.g.k r3, int r4) {
            r0 = this;
            a.a.a.g.l.b r0 = a.a.a.g.l.b.i()
            java.lang.String r0 = r0.a(r1, r2, r3, r4)
            return r0
    }

    public java.lang.String a(a.a.a.g.a r1) {
            r0 = this;
            a.a.a.g.l.a r0 = a.a.a.g.l.a.i()
            java.lang.String r0 = r0.b(r1)
            return r0
    }

    public java.lang.String a(a.a.a.g.k r7, int r8, java.lang.String r9, boolean r10, int r11) {
            r6 = this;
            a.a.a.g.l.b r0 = a.a.a.g.l.b.i()
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            java.lang.String r6 = r0.a(r1, r2, r3, r4, r5)
            return r6
    }

    public java.lang.String a(android.net.wifi.WifiInfo r1, java.lang.String r2) {
            r0 = this;
            a.a.a.g.l.b r0 = a.a.a.g.l.b.i()
            java.lang.String r0 = r0.a(r1, r2)
            return r0
    }

    public void a(a.a.a.g.e r1) {
            r0 = this;
            a.a.a.g.g.e = r1
            return
    }

    public void a(a.a.a.g.g.b r5) {
            r4 = this;
            int[] r0 = a.a.a.g.g.a.f289a
            int r1 = r5.ordinal()
            r0 = r0[r1]
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L31
            r3 = 2
            if (r0 == r3) goto L2c
            r1 = 3
            if (r0 != r1) goto L15
            r4.f286a = r2
            goto L2e
        L15:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Illegal this mode : "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
        L2c:
            r4.f286a = r1
        L2e:
            r4.f287b = r2
            goto L35
        L31:
            r4.f286a = r2
            r4.f287b = r1
        L35:
            return
    }

    public void a(android.content.Context r2, java.util.List<java.lang.String> r3) {
            r1 = this;
            boolean r0 = r1.f286a
            if (r0 == 0) goto Lb
            a.a.a.g.l.a r0 = a.a.a.g.l.a.i()
            r0.a(r2)
        Lb:
            boolean r0 = r1.f287b
            if (r0 == 0) goto L16
            a.a.a.g.l.b r0 = a.a.a.g.l.b.i()
            r0.a(r2, r3)
        L16:
            r2 = 1
            r1.f288c = r2
            return
    }

    public void a(boolean r1) {
            r0 = this;
            a.a.a.g.l.a r0 = a.a.a.g.l.a.i()
            r0.a(r1)
            return
    }

    public boolean a(a.a.a.g.a r1, a.a.a.g.a r2) {
            r0 = this;
            a.a.a.g.l.a r0 = a.a.a.g.l.a.i()
            boolean r0 = r0.a(r1, r2)
            return r0
    }

    public a.a.a.g.k b(int r3) {
            r2 = this;
            boolean r0 = r2.f288c
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r2 = r2.f287b
            if (r2 == 0) goto L13
            a.a.a.g.l.b r2 = a.a.a.g.l.b.i()
            long r0 = (long) r3
            a.a.a.g.k r1 = r2.b(r0)
        L13:
            return r1
    }

    public java.lang.String b() {
            r0 = this;
            a.a.a.g.l.b r0 = a.a.a.g.l.b.i()
            java.lang.String r0 = r0.b()
            return r0
    }

    public java.lang.String b(a.a.a.g.a r1) {
            r0 = this;
            a.a.a.g.l.a r0 = a.a.a.g.l.a.i()
            java.lang.String r0 = r0.c(r1)
            return r0
    }

    public void b(boolean r1) {
            r0 = this;
            a.a.a.g.l.a r0 = a.a.a.g.l.a.i()
            r0.b(r1)
            return
    }

    public a.a.a.g.k c() {
            r0 = this;
            a.a.a.g.l.b r0 = a.a.a.g.l.b.i()
            a.a.a.g.k r0 = r0.c()
            return r0
    }

    public java.util.HashSet<java.lang.String> c(a.a.a.g.a r1) {
            r0 = this;
            a.a.a.g.l.a r0 = a.a.a.g.l.a.i()
            java.util.HashSet r0 = r0.d(r1)
            return r0
    }

    public void c(int r1) {
            r0 = this;
            r0 = 29
            int r0 = java.lang.Math.max(r1, r0)
            a.a.a.g.l.a r1 = a.a.a.g.l.a.i()
            r1.b(r0)
            return
    }

    public long d() {
            r2 = this;
            a.a.a.g.l.b r2 = a.a.a.g.l.b.i()
            long r0 = r2.e()
            return r0
    }

    public void d(int r1) {
            r0 = this;
            if (r1 < 0) goto L9
            a.a.a.g.l.a r0 = a.a.a.g.l.a.i()
            r0.c(r1)
        L9:
            return
    }

    public void e(int r1) {
            r0 = this;
            if (r1 < 0) goto L9
            a.a.a.g.l.b r0 = a.a.a.g.l.b.i()
            r0.a(r1)
        L9:
            return
    }

    public boolean e() {
            r0 = this;
            a.a.a.g.l.a r0 = a.a.a.g.l.a.i()
            boolean r0 = r0.b()
            return r0
    }

    public void f() {
            r1 = this;
            boolean r0 = r1.f286a
            if (r0 == 0) goto Lb
            a.a.a.g.l.a r0 = a.a.a.g.l.a.i()
            r0.f()
        Lb:
            boolean r0 = r1.f287b
            if (r0 == 0) goto L16
            a.a.a.g.l.b r0 = a.a.a.g.l.b.i()
            r0.h()
        L16:
            r0 = 0
            r1.f288c = r0
            return
    }
}
