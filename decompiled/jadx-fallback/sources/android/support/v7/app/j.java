package android.support.v7.app;

/* JADX INFO: loaded from: classes.dex */
class j {
    private static android.support.v7.app.j d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.location.LocationManager f725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.support.v7.app.j.a f726c;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f728b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f729c;
        long d;
        long e;
        long f;

        a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    j(android.content.Context r2, android.location.LocationManager r3) {
            r1 = this;
            r1.<init>()
            android.support.v7.app.j$a r0 = new android.support.v7.app.j$a
            r0.<init>()
            r1.f726c = r0
            r1.f724a = r2
            r1.f725b = r3
            return
    }

    private android.location.Location a(java.lang.String r2) {
            r1 = this;
            android.location.LocationManager r0 = r1.f725b     // Catch: java.lang.Exception -> Lf
            boolean r0 = r0.isProviderEnabled(r2)     // Catch: java.lang.Exception -> Lf
            if (r0 == 0) goto L17
            android.location.LocationManager r1 = r1.f725b     // Catch: java.lang.Exception -> Lf
            android.location.Location r1 = r1.getLastKnownLocation(r2)     // Catch: java.lang.Exception -> Lf
            return r1
        Lf:
            r1 = move-exception
            java.lang.String r2 = "TwilightManager"
            java.lang.String r0 = "Failed to get last known location"
            android.util.Log.d(r2, r0, r1)
        L17:
            r1 = 0
            return r1
    }

    static android.support.v7.app.j a(android.content.Context r2) {
            android.support.v7.app.j r0 = android.support.v7.app.j.d
            if (r0 != 0) goto L17
            android.content.Context r2 = r2.getApplicationContext()
            android.support.v7.app.j r0 = new android.support.v7.app.j
            java.lang.String r1 = "location"
            java.lang.Object r1 = r2.getSystemService(r1)
            android.location.LocationManager r1 = (android.location.LocationManager) r1
            r0.<init>(r2, r1)
            android.support.v7.app.j.d = r0
        L17:
            android.support.v7.app.j r2 = android.support.v7.app.j.d
            return r2
    }

    private void a(android.location.Location r21) {
            r20 = this;
            r0 = r20
            android.support.v7.app.j$a r0 = r0.f726c
            long r8 = java.lang.System.currentTimeMillis()
            android.support.v7.app.i r10 = android.support.v7.app.i.a()
            r11 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r8 - r11
            double r4 = r21.getLatitude()
            double r6 = r21.getLongitude()
            r1 = r10
            r1.a(r2, r4, r6)
            long r13 = r10.f721a
            double r4 = r21.getLatitude()
            double r6 = r21.getLongitude()
            r2 = r8
            r1.a(r2, r4, r6)
            int r1 = r10.f723c
            r2 = 1
            if (r1 != r2) goto L31
            goto L32
        L31:
            r2 = 0
        L32:
            r15 = r2
            long r6 = r10.f722b
            long r4 = r10.f721a
            long r2 = r8 + r11
            double r11 = r21.getLatitude()
            double r16 = r21.getLongitude()
            r1 = r10
            r18 = r13
            r13 = r4
            r4 = r11
            r11 = r6
            r6 = r16
            r1.a(r2, r4, r6)
            long r1 = r10.f722b
            r3 = 0
            r5 = -1
            int r7 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r7 == 0) goto L6d
            int r5 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r5 != 0) goto L5b
            goto L6d
        L5b:
            int r5 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r5 <= 0) goto L61
            long r3 = r3 + r1
            goto L68
        L61:
            int r5 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r5 <= 0) goto L67
            long r3 = r3 + r13
            goto L68
        L67:
            long r3 = r3 + r11
        L68:
            r5 = 60000(0xea60, double:2.9644E-319)
            long r3 = r3 + r5
            goto L71
        L6d:
            r3 = 43200000(0x2932e00, double:2.1343636E-316)
            long r3 = r3 + r8
        L71:
            r0.f727a = r15
            r5 = r18
            r0.f728b = r5
            r0.f729c = r11
            r0.d = r13
            r0.e = r1
            r0.f = r3
            return
    }

    @android.annotation.SuppressLint({"MissingPermission"})
    private android.location.Location b() {
            r6 = this;
            android.content.Context r0 = r6.f724a
            java.lang.String r1 = "android.permission.ACCESS_COARSE_LOCATION"
            int r0 = b.b.c.a.c.a(r0, r1)
            r1 = 0
            if (r0 != 0) goto L12
            java.lang.String r0 = "network"
            android.location.Location r0 = r6.a(r0)
            goto L13
        L12:
            r0 = r1
        L13:
            android.content.Context r2 = r6.f724a
            java.lang.String r3 = "android.permission.ACCESS_FINE_LOCATION"
            int r2 = b.b.c.a.c.a(r2, r3)
            if (r2 != 0) goto L23
            java.lang.String r1 = "gps"
            android.location.Location r1 = r6.a(r1)
        L23:
            if (r1 == 0) goto L35
            if (r0 == 0) goto L35
            long r2 = r1.getTime()
            long r4 = r0.getTime()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L34
            r0 = r1
        L34:
            return r0
        L35:
            if (r1 == 0) goto L38
            r0 = r1
        L38:
            return r0
    }

    private boolean c() {
            r4 = this;
            android.support.v7.app.j$a r4 = r4.f726c
            long r0 = r4.f
            long r2 = java.lang.System.currentTimeMillis()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto Le
            r4 = 1
            goto Lf
        Le:
            r4 = 0
        Lf:
            return r4
    }

    boolean a() {
            r2 = this;
            android.support.v7.app.j$a r0 = r2.f726c
            boolean r1 = r2.c()
            if (r1 == 0) goto Lb
            boolean r2 = r0.f727a
            return r2
        Lb:
            android.location.Location r1 = r2.b()
            if (r1 == 0) goto L17
            r2.a(r1)
            boolean r2 = r0.f727a
            return r2
        L17:
            java.lang.String r2 = "TwilightManager"
            java.lang.String r0 = "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values."
            android.util.Log.i(r2, r0)
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            r0 = 11
            int r2 = r2.get(r0)
            r0 = 6
            if (r2 < r0) goto L32
            r0 = 22
            if (r2 < r0) goto L30
            goto L32
        L30:
            r2 = 0
            goto L33
        L32:
            r2 = 1
        L33:
            return r2
    }
}
