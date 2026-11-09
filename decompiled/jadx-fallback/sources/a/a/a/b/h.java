package a.a.a.b;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public android.content.Context f25a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public android.telephony.TelephonyManager f26b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a.a.a.g.a f27c;
    public android.net.wifi.WifiManager d;
    public a.a.a.g.k e;
    public java.lang.String f;
    public com.baidu.location.i g;
    public a.a.a.b.h.b h;
    public java.lang.String i;
    public java.lang.String j;
    public java.lang.String k;
    public java.lang.String l;
    public java.lang.String m;
    public boolean n;
    public a.a.a.b.h.c o;
    public java.lang.String p;
    public long q;
    public boolean r;
    public boolean s;

    public class a implements java.util.Comparator<a.a.a.b.h.d> {
        public a(a.a.a.b.h r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public int a(a.a.a.b.h.d r1, a.a.a.b.h.d r2) {
                r0 = this;
                int r0 = r1.f32b
                int r1 = r2.f32b
                if (r0 <= r1) goto L8
                r0 = -1
                return r0
            L8:
                if (r0 != r1) goto Lc
                r0 = 0
                return r0
            Lc:
                r0 = 1
                return r0
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(a.a.a.b.h.d r1, a.a.a.b.h.d r2) {
                r0 = this;
                a.a.a.b.h$d r1 = (a.a.a.b.h.d) r1
                a.a.a.b.h$d r2 = (a.a.a.b.h.d) r2
                int r0 = r0.a(r1, r2)
                return r0
        }
    }

    public interface b {
        void a(com.baidu.location.c r1);
    }

    public class c extends a.a.a.i.g {
        public java.lang.String i;
        public android.location.LocationManager j;
        public a.a.a.b.h.c.b k;
        public boolean l;
        public final /* synthetic */ a.a.a.b.h m;

        public class a extends java.util.TimerTask {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ java.util.Timer f28b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a.a.a.b.h.c f29c;

            public a(a.a.a.b.h.c r1, java.util.Timer r2) {
                    r0 = this;
                    r0.f29c = r1
                    r0.f28b = r2
                    r0.<init>()
                    return
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                    r2 = this;
                    a.a.a.b.h$c r0 = r2.f29c
                    boolean r1 = r0.l
                    if (r1 != 0) goto L9
                    a.a.a.b.h.c.a(r0)
                L9:
                    java.util.Timer r0 = r2.f28b
                    r0.cancel()
                    java.util.Timer r2 = r2.f28b
                    r2.purge()
                    return
            }
        }

        public class b implements android.location.LocationListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a.a.a.b.h.c f30a;

            public b(a.a.a.b.h.c r1) {
                    r0 = this;
                    r0.f30a = r1
                    r0.<init>()
                    return
            }

            public /* synthetic */ b(a.a.a.b.h.c r1, a.a.a.b.h.a r2) {
                    r0 = this;
                    r0.<init>(r1)
                    return
            }

            @Override // android.location.LocationListener
            public void onLocationChanged(android.location.Location r1) {
                    r0 = this;
                    a.a.a.b.h$c r1 = r0.f30a
                    a.a.a.b.h.c.a(r1)
                    a.a.a.b.h$c r0 = r0.f30a
                    r1 = 1
                    r0.l = r1
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

        public c(a.a.a.b.h r1) {
                r0 = this;
                r0.m = r1
                r0.<init>()
                r1 = 0
                r0.i = r1
                r1 = 0
                r0.l = r1
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                r0.d = r1
                return
        }

        public static /* synthetic */ void a(a.a.a.b.h.c r0) {
                r0.c()
                return
        }

        @Override // a.a.a.i.g
        public void a() {
                r6 = this;
                a.a.a.b.h r0 = r6.m
                java.lang.String r0 = a.a.a.b.h.a(r0)
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L40
                a.a.a.b.h r0 = r6.m
                java.lang.String r0 = a.a.a.b.h.b(r0)
                if (r0 == 0) goto L40
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = r6.i
                r0.append(r3)
                java.util.Locale r3 = java.util.Locale.CHINA
                r4 = 2
                java.lang.Object[] r4 = new java.lang.Object[r4]
                a.a.a.b.h r5 = r6.m
                java.lang.String r5 = a.a.a.b.h.a(r5)
                r4[r1] = r5
                a.a.a.b.h r5 = r6.m
                java.lang.String r5 = a.a.a.b.h.b(r5)
                r4[r2] = r5
                java.lang.String r5 = "&ki=%s&sn=%s"
                java.lang.String r3 = java.lang.String.format(r3, r5, r4)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                r6.i = r0
            L40:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = r6.i
                r0.append(r3)
                java.lang.String r3 = "&enc=2"
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                r6.i = r0
                java.lang.String r0 = com.baidu.location.Jni.f(r0)
                r3 = 0
                r6.i = r3
                java.util.Map<java.lang.String, java.lang.Object> r3 = r6.d
                java.lang.String r4 = "bloc"
                r3.put(r4, r0)
                java.util.Locale r0 = java.util.Locale.CHINA
                java.lang.Object[] r2 = new java.lang.Object[r2]
                long r3 = java.lang.System.currentTimeMillis()
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                r2[r1] = r3
                java.lang.String r1 = "%d"
                java.lang.String r0 = java.lang.String.format(r0, r1, r2)
                java.util.Map<java.lang.String, java.lang.Object> r6 = r6.d
                java.lang.String r1 = "trtm"
                r6.put(r1, r0)
                return
        }

        public final void a(com.baidu.location.c r5) {
                r4 = this;
                java.lang.String r0 = ";"
                boolean r1 = r5.G()     // Catch: java.lang.Exception -> L9d
                if (r1 == 0) goto L9d
                com.baidu.location.a r5 = r5.c()     // Catch: java.lang.Exception -> L9d
                java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch: java.lang.Exception -> L9d
                r1.<init>()     // Catch: java.lang.Exception -> L9d
                java.lang.String r2 = r5.f1349a     // Catch: java.lang.Exception -> L9d
                r1.append(r2)     // Catch: java.lang.Exception -> L9d
                r1.append(r0)     // Catch: java.lang.Exception -> L9d
                java.lang.String r2 = r5.f1350b     // Catch: java.lang.Exception -> L9d
                r1.append(r2)     // Catch: java.lang.Exception -> L9d
                r1.append(r0)     // Catch: java.lang.Exception -> L9d
                java.lang.String r2 = r5.f1351c     // Catch: java.lang.Exception -> L9d
                r1.append(r2)     // Catch: java.lang.Exception -> L9d
                r1.append(r0)     // Catch: java.lang.Exception -> L9d
                java.lang.String r2 = r5.d     // Catch: java.lang.Exception -> L9d
                r1.append(r2)     // Catch: java.lang.Exception -> L9d
                r1.append(r0)     // Catch: java.lang.Exception -> L9d
                java.lang.String r2 = r5.e     // Catch: java.lang.Exception -> L9d
                r1.append(r2)     // Catch: java.lang.Exception -> L9d
                r1.append(r0)     // Catch: java.lang.Exception -> L9d
                java.lang.String r2 = r5.f     // Catch: java.lang.Exception -> L9d
                r1.append(r2)     // Catch: java.lang.Exception -> L9d
                r1.append(r0)     // Catch: java.lang.Exception -> L9d
                java.lang.String r2 = r5.g     // Catch: java.lang.Exception -> L9d
                r1.append(r2)     // Catch: java.lang.Exception -> L9d
                r1.append(r0)     // Catch: java.lang.Exception -> L9d
                java.lang.String r2 = r5.h     // Catch: java.lang.Exception -> L9d
                r1.append(r2)     // Catch: java.lang.Exception -> L9d
                r1.append(r0)     // Catch: java.lang.Exception -> L9d
                java.lang.String r2 = r5.j     // Catch: java.lang.Exception -> L9d
                r1.append(r2)     // Catch: java.lang.Exception -> L9d
                r1.append(r0)     // Catch: java.lang.Exception -> L9d
                java.lang.String r5 = r5.k     // Catch: java.lang.Exception -> L9d
                r1.append(r5)     // Catch: java.lang.Exception -> L9d
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L9d
                r5.<init>()     // Catch: java.lang.Exception -> L9d
                long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L9d
                r5.append(r2)     // Catch: java.lang.Exception -> L9d
                java.lang.String r0 = "_"
                r5.append(r0)     // Catch: java.lang.Exception -> L9d
                java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> L9d
                r5.append(r0)     // Catch: java.lang.Exception -> L9d
                java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L9d
                java.lang.String r0 = "UTF-8"
                byte[] r5 = r5.getBytes(r0)     // Catch: java.lang.Exception -> L9d
                r0 = 0
                java.lang.String r5 = android.util.Base64.encodeToString(r5, r0)     // Catch: java.lang.Exception -> L9d
                a.a.a.b.h r4 = r4.m     // Catch: java.lang.Exception -> L9d
                android.content.Context r4 = a.a.a.b.h.f(r4)     // Catch: java.lang.Exception -> L9d
                android.content.SharedPreferences r4 = a.a.a.b.r.b(r4)     // Catch: java.lang.Exception -> L9d
                if (r4 == 0) goto L9d
                android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch: java.lang.Exception -> L9d
                java.lang.String r0 = "FirstLocAddr"
                r4.putString(r0, r5)     // Catch: java.lang.Exception -> L9d
                r4.apply()     // Catch: java.lang.Exception -> L9d
            L9d:
                return
        }

        @Override // a.a.a.i.g
        public void a(boolean r6) {
                r5 = this;
                java.lang.String r0 = ";"
                java.lang.String r1 = "enc"
                r2 = 63
                if (r6 == 0) goto Ld9
                java.lang.String r6 = r5.f339c
                if (r6 == 0) goto Ld9
                java.lang.String r3 = "\"enc\""
                boolean r3 = r6.contains(r3)     // Catch: java.lang.Exception -> Lcf
                if (r3 == 0) goto L30
                org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L2c
                r3.<init>(r6)     // Catch: java.lang.Exception -> L2c
                boolean r4 = r3.has(r1)     // Catch: java.lang.Exception -> L2c
                if (r4 == 0) goto L30
                java.lang.String r1 = r3.getString(r1)     // Catch: java.lang.Exception -> L2c
                a.a.a.b.n r3 = a.a.a.b.n.b()     // Catch: java.lang.Exception -> L2c
                java.lang.String r6 = r3.a(r1)     // Catch: java.lang.Exception -> L2c
                goto L30
            L2c:
                r1 = move-exception
                r1.printStackTrace()     // Catch: java.lang.Exception -> Lcf
            L30:
                com.baidu.location.c r1 = new com.baidu.location.c     // Catch: java.lang.Exception -> L4a
                r1.<init>(r6)     // Catch: java.lang.Exception -> L4a
                a.a.a.b.h r3 = r5.m     // Catch: java.lang.Exception -> L4a
                a.a.a.b.h.a(r3, r6)     // Catch: java.lang.Exception -> L4a
                a.a.a.b.h r6 = r5.m     // Catch: java.lang.Exception -> L4a
                com.baidu.location.i r6 = a.a.a.b.h.c(r6)     // Catch: java.lang.Exception -> L4a
                boolean r6 = r6.i()     // Catch: java.lang.Exception -> L4a
                if (r6 != 0) goto L52
                r5.a(r1)     // Catch: java.lang.Exception -> L4a
                goto L52
            L4a:
                com.baidu.location.c r1 = new com.baidu.location.c     // Catch: java.lang.Exception -> Lcf
                r1.<init>()     // Catch: java.lang.Exception -> Lcf
                r1.h(r2)     // Catch: java.lang.Exception -> Lcf
            L52:
                int r6 = r1.r()     // Catch: java.lang.Exception -> Lcf
                r3 = 161(0xa1, float:2.26E-43)
                if (r6 != r3) goto Lc5
                java.lang.String r6 = "wgs84"
                java.lang.String r3 = r1.h()     // Catch: java.lang.Exception -> Lcf
                boolean r6 = r6.equals(r3)     // Catch: java.lang.Exception -> Lcf
                if (r6 == 0) goto L7c
                a.a.a.b.h r6 = r5.m     // Catch: java.lang.Exception -> Lcf
                com.baidu.location.i r6 = a.a.a.b.h.c(r6)     // Catch: java.lang.Exception -> Lcf
                java.lang.String r6 = r6.f1370a     // Catch: java.lang.Exception -> Lcf
                java.lang.String r3 = "bd09"
                boolean r6 = r6.equals(r3)     // Catch: java.lang.Exception -> Lcf
                if (r6 == 0) goto L85
                java.lang.String r6 = "wgs84mc"
            L78:
                r1.e(r6)     // Catch: java.lang.Exception -> Lcf
                goto L85
            L7c:
                a.a.a.b.h r6 = r5.m     // Catch: java.lang.Exception -> Lcf
                com.baidu.location.i r6 = a.a.a.b.h.c(r6)     // Catch: java.lang.Exception -> Lcf
                java.lang.String r6 = r6.f1370a     // Catch: java.lang.Exception -> Lcf
                goto L78
            L85:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lcf
                r6.<init>()     // Catch: java.lang.Exception -> Lcf
                a.a.a.b.h r3 = r5.m     // Catch: java.lang.Exception -> Lcf
                java.lang.String r3 = r3.l     // Catch: java.lang.Exception -> Lcf
                r6.append(r3)     // Catch: java.lang.Exception -> Lcf
                r6.append(r0)     // Catch: java.lang.Exception -> Lcf
                a.a.a.b.h r3 = r5.m     // Catch: java.lang.Exception -> Lcf
                java.lang.String r3 = r3.m     // Catch: java.lang.Exception -> Lcf
                r6.append(r3)     // Catch: java.lang.Exception -> Lcf
                r6.append(r0)     // Catch: java.lang.Exception -> Lcf
                java.lang.String r0 = r1.C()     // Catch: java.lang.Exception -> Lcf
                r6.append(r0)     // Catch: java.lang.Exception -> Lcf
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> Lcf
                java.lang.String r6 = com.baidu.location.Jni.a(r6)     // Catch: java.lang.Exception -> Lcf
                r1.k(r6)     // Catch: java.lang.Exception -> Lcf
                r6 = 0
                r0 = 0
                r1.a(r0, r0, r6, r6)     // Catch: java.lang.Exception -> Lcf
                a.a.a.b.h r6 = r5.m     // Catch: java.lang.Exception -> Lcf
                r0 = 1
                a.a.a.b.h.a(r6, r0)     // Catch: java.lang.Exception -> Lcf
                a.a.a.b.h r6 = r5.m     // Catch: java.lang.Exception -> Lcf
                a.a.a.b.h$b r6 = a.a.a.b.h.d(r6)     // Catch: java.lang.Exception -> Lcf
                r6.a(r1)     // Catch: java.lang.Exception -> Lcf
                goto Lde
            Lc5:
                a.a.a.b.h r6 = r5.m     // Catch: java.lang.Exception -> Lcf
                int r0 = r1.r()     // Catch: java.lang.Exception -> Lcf
                a.a.a.b.h.a(r6, r0)     // Catch: java.lang.Exception -> Lcf
                goto Lde
            Lcf:
                r6 = move-exception
                a.a.a.b.h r0 = r5.m
                a.a.a.b.h.a(r0, r2)
                r6.printStackTrace()
                goto Lde
            Ld9:
                a.a.a.b.h r6 = r5.m
                a.a.a.b.h.a(r6, r2)
            Lde:
                java.util.Map<java.lang.String, java.lang.Object> r5 = r5.d
                if (r5 == 0) goto Le5
                r5.clear()
            Le5:
                return
        }

        public final void b() {
                r8 = this;
                a.a.a.b.h r0 = r8.m     // Catch: java.lang.Throwable -> L2c
                android.content.Context r0 = a.a.a.b.h.f(r0)     // Catch: java.lang.Throwable -> L2c
                java.lang.String r1 = "location"
                java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> L2c
                r1 = r0
                android.location.LocationManager r1 = (android.location.LocationManager) r1     // Catch: java.lang.Throwable -> L2c
                r8.j = r1     // Catch: java.lang.Throwable -> L2c
                a.a.a.b.h$c$b r6 = new a.a.a.b.h$c$b     // Catch: java.lang.Throwable -> L2c
                r0 = 0
                r6.<init>(r8, r0)     // Catch: java.lang.Throwable -> L2c
                r8.k = r6     // Catch: java.lang.Throwable -> L2c
                if (r1 == 0) goto L2c
                java.lang.String r2 = "network"
                r3 = 1000(0x3e8, double:4.94E-321)
                r5 = 0
                android.os.Looper r7 = android.os.Looper.getMainLooper()     // Catch: java.lang.SecurityException -> L28 java.lang.Throwable -> L2c
                r1.requestLocationUpdates(r2, r3, r5, r6, r7)     // Catch: java.lang.SecurityException -> L28 java.lang.Throwable -> L2c
                goto L2c
            L28:
                r8 = move-exception
                r8.printStackTrace()     // Catch: java.lang.Throwable -> L2c
            L2c:
                return
        }

        public final void c() {
                r1 = this;
                a.a.a.b.h$c$b r0 = r1.k
                if (r0 == 0) goto Lb
                android.location.LocationManager r1 = r1.j
                if (r1 == 0) goto Lb
                r1.removeUpdates(r0)     // Catch: java.lang.Exception -> Lb
            Lb:
                return
        }

        public void c(java.lang.String r4) {
                r3 = this;
                r3.i = r4
                java.lang.String r4 = a.a.a.i.d.f324b
                r3.a(r4)
                a.a.a.b.h r4 = r3.m
                boolean r4 = a.a.a.b.h.e(r4)
                if (r4 == 0) goto L3e
                r3.b()
                java.util.Timer r4 = new java.util.Timer
                r4.<init>()
                a.a.a.b.h$c$a r0 = new a.a.a.b.h$c$a
                r0.<init>(r3, r4)
                r1 = 10000(0x2710, double:4.9407E-320)
                r4.schedule(r0, r1)
                a.a.a.b.h r3 = r3.m
                android.content.Context r3 = a.a.a.b.h.f(r3)
                r4 = 0
                java.lang.String r0 = "cuidRelate"
                android.content.SharedPreferences r3 = r3.getSharedPreferences(r0, r4)
                android.content.SharedPreferences$Editor r3 = r3.edit()
                long r0 = java.lang.System.currentTimeMillis()
                java.lang.String r4 = "reqtime"
                r3.putLong(r4, r0)
                r3.apply()
            L3e:
                return
        }
    }

    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public java.lang.String f31a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f32b;

        public d(a.a.a.b.h r1, java.lang.String r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.f31a = r2
                r0.f32b = r3
                return
        }
    }

    static {
            java.lang.String r0 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_."
            r0.toCharArray()
            return
    }

    public h(android.content.Context r4, com.baidu.location.i r5, a.a.a.b.h.b r6, java.lang.String r7, boolean r8) {
            r3 = this;
            r3.<init>()
            r7 = 0
            r3.f25a = r7
            r3.f26b = r7
            a.a.a.g.a r0 = new a.a.a.g.a
            r0.<init>()
            r3.f27c = r0
            r3.d = r7
            r3.e = r7
            r3.f = r7
            r3.i = r7
            r3.j = r7
            r3.k = r7
            r3.l = r7
            r3.m = r7
            r0 = 0
            r3.n = r0
            a.a.a.b.h$c r1 = new a.a.a.b.h$c
            r1.<init>(r3)
            r3.o = r1
            r3.p = r7
            r1 = 0
            r3.q = r1
            r3.r = r0
            r3.s = r0
            android.content.Context r4 = r4.getApplicationContext()
            r3.f25a = r4
            java.lang.String r4 = r4.getPackageName()     // Catch: java.lang.Exception -> L3f
            a.a.a.i.i.o0 = r4     // Catch: java.lang.Exception -> L3f
        L3f:
            r4 = 1
            r3.n = r4
            com.baidu.location.i r0 = new com.baidu.location.i
            r0.<init>(r5)
            r3.g = r0
            r3.h = r6
            android.content.Context r6 = r3.f25a
            java.lang.String r6 = r6.getPackageName()
            r3.l = r6
            r3.m = r7
            android.content.Context r6 = r3.f25a     // Catch: java.lang.Exception -> L71
            java.lang.String r0 = "phone"
            java.lang.Object r6 = r6.getSystemService(r0)     // Catch: java.lang.Exception -> L71
            android.telephony.TelephonyManager r6 = (android.telephony.TelephonyManager) r6     // Catch: java.lang.Exception -> L71
            r3.f26b = r6     // Catch: java.lang.Exception -> L71
            android.content.Context r6 = r3.f25a     // Catch: java.lang.Exception -> L71
            android.content.Context r6 = r6.getApplicationContext()     // Catch: java.lang.Exception -> L71
            java.lang.String r0 = "wifi"
            java.lang.Object r6 = r6.getSystemService(r0)     // Catch: java.lang.Exception -> L71
            android.net.wifi.WifiManager r6 = (android.net.wifi.WifiManager) r6     // Catch: java.lang.Exception -> L71
            r3.d = r6     // Catch: java.lang.Exception -> L71
        L71:
            com.baidu.location.i r6 = r3.g
            com.baidu.location.i$a r6 = r6.D
            com.baidu.location.i$a r0 = com.baidu.location.i.a.f1374c
            if (r6 != r0) goto L82
            a.a.a.g.f r6 = a.a.a.g.f.w()
            android.content.Context r0 = r3.f25a
            r6.a(r0)
        L82:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "&"
            r6.append(r0)
            java.lang.String r1 = r3.l
            r6.append(r1)
            r6.append(r0)
            r6.append(r7)
            r6.toString()
            android.content.Context r6 = r3.f25a     // Catch: java.lang.Throwable -> La7
            c.a.c.a.b r6 = c.a.c.a.b.c(r6)     // Catch: java.lang.Throwable -> La7
            java.lang.String r6 = r6.a()     // Catch: java.lang.Throwable -> La7
            r3.m = r6     // Catch: java.lang.Throwable -> La7
            goto Lad
        La7:
            r3.m = r7
            r3.f26b = r7
            r3.d = r7
        Lad:
            java.lang.String r6 = r3.m
            java.lang.String r0 = "&coor="
            java.lang.String r1 = ":"
            java.lang.String r2 = "&prod="
            if (r6 == 0) goto Leb
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = ""
            r6.append(r7)
            java.lang.String r7 = r3.m
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            a.a.a.i.i.l = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            com.baidu.location.i r7 = r3.g
            java.lang.String r7 = r7.f
            r6.append(r7)
            r6.append(r1)
            java.lang.String r7 = r3.l
            r6.append(r7)
            java.lang.String r7 = "|&cu="
            r6.append(r7)
            java.lang.String r7 = r3.m
            goto L107
        Leb:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            com.baidu.location.i r2 = r3.g
            java.lang.String r2 = r2.f
            r6.append(r2)
            r6.append(r1)
            java.lang.String r1 = r3.l
            r6.append(r1)
            java.lang.String r1 = "|&im="
            r6.append(r1)
        L107:
            r6.append(r7)
            r6.append(r0)
            java.lang.String r7 = r5.f()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r3.f = r6
            java.lang.StringBuffer r6 = new java.lang.StringBuffer
            r7 = 256(0x100, float:3.59E-43)
            r6.<init>(r7)
            java.lang.String r7 = "&fw="
            r6.append(r7)
            java.lang.String r7 = "9.521"
            r6.append(r7)
            java.lang.String r0 = "&sdk="
            r6.append(r0)
            r6.append(r7)
            java.lang.String r7 = "&lt=1"
            r6.append(r7)
            java.lang.String r7 = "&mb="
            r6.append(r7)
            java.lang.String r7 = android.os.Build.MODEL
            r6.append(r7)
            java.lang.String r7 = "&resid="
            r6.append(r7)
            java.lang.String r7 = "12"
            r6.append(r7)
            r5.c()
            java.lang.String r7 = r5.c()
            if (r7 == 0) goto L17f
            java.lang.String r7 = r5.c()
            java.lang.String r0 = "all"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L17f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = r3.f
            r7.append(r0)
            java.lang.String r0 = "&addr=allj2"
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r3.f = r7
            boolean r7 = r5.t
            if (r7 == 0) goto L17f
            java.lang.String r7 = "&adtp=n2"
            r6.append(r7)
        L17f:
            boolean r7 = r5.o
            if (r7 == r4) goto L187
            boolean r7 = r5.p
            if (r7 != r4) goto L1de
        L187:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = r3.f
            r7.append(r0)
            java.lang.String r0 = "&sema="
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r3.f = r7
            boolean r7 = r5.o
            if (r7 != r4) goto L1b5
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = r3.f
            r7.append(r0)
            java.lang.String r0 = "aptag|"
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r3.f = r7
        L1b5:
            boolean r5 = r5.p
            if (r5 != r4) goto L1ce
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r3.f
            r4.append(r5)
            java.lang.String r5 = "aptagd2|"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.f = r4
        L1ce:
            android.content.Context r4 = r3.f25a
            java.lang.String r4 = a.a.a.a.a.b(r4)
            r3.j = r4
            android.content.Context r4 = r3.f25a
            java.lang.String r4 = a.a.a.a.a.c(r4)
            r3.k = r4
        L1de:
            java.lang.String r4 = "&first=1"
            r6.append(r4)
            if (r8 == 0) goto L1ea
            java.lang.String r4 = "&state=fore"
            r6.append(r4)
        L1ea:
            java.lang.String r4 = "&os=A"
            r6.append(r4)
            java.lang.String r4 = android.os.Build.VERSION.SDK
            r6.append(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r3.f
            r4.append(r5)
            java.lang.String r5 = r6.toString()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.f = r4
            return
    }

    public static /* synthetic */ java.lang.String a(a.a.a.b.h r0) {
            java.lang.String r0 = r0.j
            return r0
    }

    public static /* synthetic */ void a(a.a.a.b.h r0, int r1) {
            r0.b(r1)
            return
    }

    public static /* synthetic */ void a(a.a.a.b.h r0, java.lang.String r1) {
            r0.a(r1)
            return
    }

    public static /* synthetic */ boolean a(a.a.a.b.h r0, boolean r1) {
            r0.s = r1
            return r1
    }

    public static boolean a(android.net.wifi.WifiManager r2) {
            boolean r0 = r2.isWifiEnabled()     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L7
            goto L13
        L7:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L15
            r1 = 17
            if (r0 <= r1) goto L15
            boolean r2 = r2.isScanAlwaysAvailable()     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L15
        L13:
            r2 = 1
            goto L16
        L15:
            r2 = 0
        L16:
            return r2
    }

    public static /* synthetic */ java.lang.String b(a.a.a.b.h r0) {
            java.lang.String r0 = r0.k
            return r0
    }

    public static /* synthetic */ com.baidu.location.i c(a.a.a.b.h r0) {
            com.baidu.location.i r0 = r0.g
            return r0
    }

    public static /* synthetic */ a.a.a.b.h.b d(a.a.a.b.h r0) {
            a.a.a.b.h$b r0 = r0.h
            return r0
    }

    public static /* synthetic */ boolean e(a.a.a.b.h r0) {
            boolean r0 = r0.r
            return r0
    }

    public static /* synthetic */ android.content.Context f(a.a.a.b.h r0) {
            android.content.Context r0 = r0.f25a
            return r0
    }

    public final java.lang.Object a(java.lang.Object r1, java.lang.String r2) {
            r0 = this;
            java.lang.Class r0 = r1.getClass()
            java.lang.reflect.Field r0 = r0.getField(r2)
            java.lang.Object r0 = r0.get(r1)
            return r0
    }

    public final java.lang.String a(int r13) {
            r12 = this;
            r0 = 0
            a.a.a.g.f r1 = a.a.a.g.f.w()     // Catch: java.lang.Throwable -> L45
            a.a.a.g.a r2 = r12.f27c     // Catch: java.lang.Throwable -> L45
            android.telephony.TelephonyManager r3 = r12.f26b     // Catch: java.lang.Throwable -> L45
            a.a.a.g.a r1 = r1.a(r2, r3)     // Catch: java.lang.Throwable -> L45
            r12.f27c = r1     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L22
            boolean r1 = r1.e()     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L22
            a.a.a.g.f r1 = a.a.a.g.f.w()     // Catch: java.lang.Throwable -> L45
            a.a.a.g.a r2 = r12.f27c     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = r1.a(r2)     // Catch: java.lang.Throwable -> L45
            goto L23
        L22:
            r1 = r0
        L23:
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L46
            if (r2 != 0) goto L46
            a.a.a.g.a r2 = r12.f27c     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L46
            java.lang.String r2 = r2.m     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L46
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46
            r2.<init>()     // Catch: java.lang.Throwable -> L46
            r2.append(r1)     // Catch: java.lang.Throwable -> L46
            a.a.a.g.a r3 = r12.f27c     // Catch: java.lang.Throwable -> L46
            java.lang.String r3 = r3.m     // Catch: java.lang.Throwable -> L46
            r2.append(r3)     // Catch: java.lang.Throwable -> L46
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L46
            goto L46
        L45:
            r1 = r0
        L46:
            r12.e = r0     // Catch: java.lang.Exception -> L8d
            android.net.wifi.WifiManager r2 = r12.d     // Catch: java.lang.Exception -> L8d
            boolean r2 = a(r2)     // Catch: java.lang.Exception -> L8d
            if (r2 == 0) goto L8d
            com.baidu.location.i r2 = r12.g     // Catch: java.lang.Exception -> L8d
            int r2 = r2.g     // Catch: java.lang.Exception -> L8d
            r3 = 4
            if (r2 == r3) goto L8d
            a.a.a.g.k r2 = new a.a.a.g.k     // Catch: java.lang.Exception -> L8d
            android.net.wifi.WifiManager r3 = r12.d     // Catch: java.lang.Exception -> L8d
            java.util.List r3 = r3.getScanResults()     // Catch: java.lang.Exception -> L8d
            r4 = 0
            r2.<init>(r3, r4)     // Catch: java.lang.Exception -> L8d
            r12.e = r2     // Catch: java.lang.Exception -> L8d
            a.a.a.g.f r6 = a.a.a.g.f.w()     // Catch: java.lang.Exception -> L8d
            a.a.a.g.k r7 = r12.e     // Catch: java.lang.Exception -> L8d
            java.lang.String r9 = r12.c()     // Catch: java.lang.Exception -> L8d
            boolean r10 = r12.r     // Catch: java.lang.Exception -> L8d
            a.a.a.b.a r2 = a.a.a.b.a.c()     // Catch: java.lang.Exception -> L8d
            int r11 = r2.f5c     // Catch: java.lang.Exception -> L8d
            r8 = r13
            java.lang.String r13 = r6.a(r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L8d
            com.baidu.location.i r2 = r12.g     // Catch: java.lang.Exception -> L8e
            if (r2 == 0) goto L8e
            boolean r2 = r2.i()     // Catch: java.lang.Exception -> L8e
            if (r2 == 0) goto L8e
            android.net.wifi.WifiManager r2 = r12.d     // Catch: java.lang.Exception -> L8e
            r2.startScan()     // Catch: java.lang.Exception -> L8e
            goto L8e
        L8d:
            r13 = r0
        L8e:
            if (r1 != 0) goto L95
            if (r13 != 0) goto L95
            r12.i = r0
            return r0
        L95:
            if (r13 == 0) goto Laa
            if (r1 != 0) goto L9b
            r1 = r13
            goto Laa
        L9b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r13)
            java.lang.String r1 = r2.toString()
        Laa:
            if (r1 != 0) goto Lad
            return r0
        Lad:
            r12.i = r1
            java.lang.String r13 = r12.f
            if (r13 == 0) goto Lc8
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = r12.i
            r13.append(r0)
            java.lang.String r0 = r12.f
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            r12.i = r13
        Lc8:
            r12.h()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r1)
            java.lang.String r12 = r12.f
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            return r12
    }

    public final java.lang.String a(java.util.List<android.net.wifi.WifiConfiguration> r8) {
            r7 = this;
            r0 = 0
            r1 = 0
            if (r8 == 0) goto L40
            int r2 = r8.size()
            if (r2 <= 0) goto L40
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r8 = r8.iterator()
        L13:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L41
            java.lang.Object r3 = r8.next()
            android.net.wifi.WifiConfiguration r3 = (android.net.wifi.WifiConfiguration) r3
            java.lang.String r4 = r3.SSID
            java.lang.String r5 = "numAssociation"
            java.lang.Object r3 = r7.a(r3, r5)     // Catch: java.lang.Throwable -> L2e
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L2e
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L2e
            goto L2f
        L2e:
            r3 = r0
        L2f:
            if (r3 <= 0) goto L13
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L13
            a.a.a.b.h$d r5 = new a.a.a.b.h$d
            r5.<init>(r7, r4, r3)
            r2.add(r5)
            goto L13
        L40:
            r2 = r1
        L41:
            if (r2 == 0) goto Lac
            boolean r8 = r2.isEmpty()
            if (r8 != 0) goto Lac
            int r8 = r2.size()
            r1 = 1
            if (r8 <= r1) goto L58
            a.a.a.b.h$a r8 = new a.a.a.b.h$a
            r8.<init>(r7)
            java.util.Collections.sort(r2, r8)
        L58:
            java.lang.StringBuffer r7 = new java.lang.StringBuffer
            r8 = 200(0xc8, float:2.8E-43)
            r7.<init>(r8)
            java.util.Iterator r8 = r2.iterator()
        L63:
            boolean r3 = r8.hasNext()
            java.lang.String r4 = ","
            r5 = 4
            if (r3 == 0) goto L87
            java.lang.Object r3 = r8.next()
            a.a.a.b.h$d r3 = (a.a.a.b.h.d) r3
            java.lang.String r6 = r3.f31a
            r7.append(r6)
            r7.append(r4)
            int r3 = r3.f32b
            r7.append(r3)
            java.lang.String r3 = "|"
            r7.append(r3)
            int r0 = r0 + r1
            if (r0 != r5) goto L63
        L87:
            int r8 = r2.size()
            r0 = 5
            if (r8 < r0) goto La7
            java.lang.Object r8 = r2.get(r5)
            a.a.a.b.h$d r8 = (a.a.a.b.h.d) r8
            java.lang.String r8 = r8.f31a
            r7.append(r8)
            r7.append(r4)
            java.lang.Object r8 = r2.get(r5)
            a.a.a.b.h$d r8 = (a.a.a.b.h.d) r8
            int r8 = r8.f32b
            r7.append(r8)
        La7:
            java.lang.String r7 = r7.toString()
            return r7
        Lac:
            return r1
    }

    public void a() {
            r13 = this;
            java.lang.String r0 = r13.i
            if (r0 != 0) goto L20
            r0 = 62
            android.content.Context r1 = r13.f25a
            int r1 = a.a.a.i.i.a(r1)
            r2 = -1
            if (r1 != r2) goto L12
            r0 = 69
            goto L1c
        L12:
            r2 = -2
            if (r1 != r2) goto L18
            r0 = 70
            goto L1c
        L18:
            if (r1 != 0) goto L1c
            r0 = 71
        L1c:
            r13.b(r0)
            return
        L20:
            boolean r0 = r13.n
            if (r0 != 0) goto L25
            return
        L25:
            android.content.Context r0 = r13.f25a
            if (r0 == 0) goto L4d
            a.a.a.b.f r0 = a.a.a.b.f.c()
            android.content.Context r1 = r13.f25a
            r0.a(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r13.i
            r0.append(r1)
            a.a.a.b.f r1 = a.a.a.b.f.c()
            java.lang.String r1 = r1.b()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r13.i = r0
        L4d:
            android.net.wifi.WifiManager r0 = r13.d
            r1 = 0
            if (r0 == 0) goto L14c
            com.baidu.location.i r0 = r13.g
            if (r0 == 0) goto L14c
            int r2 = r0.d
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r2 < r3) goto L14c
            java.lang.String r0 = r0.c()
            java.lang.String r2 = "all"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L14c
            com.baidu.location.i r0 = r13.g
            boolean r2 = r0.o
            if (r2 != 0) goto L14c
            boolean r2 = r0.p
            if (r2 != 0) goto L14c
            boolean r0 = r0.i()
            if (r0 == 0) goto L7a
            goto L14c
        L7a:
            a.a.a.g.a r0 = r13.f27c     // Catch: java.lang.Exception -> L14c
            if (r0 == 0) goto L89
            a.a.a.g.f r0 = a.a.a.g.f.w()     // Catch: java.lang.Exception -> L14c
            a.a.a.g.a r2 = r13.f27c     // Catch: java.lang.Exception -> L14c
            java.lang.String r0 = r0.d(r2)     // Catch: java.lang.Exception -> L14c
            goto L8a
        L89:
            r0 = r1
        L8a:
            android.net.wifi.WifiManager r2 = r13.d     // Catch: java.lang.Exception -> L14c
            r3 = 0
            r4 = 66
            r5 = 4591870180174331904(0x3fb99999a0000000, double:0.10000000149011612)
            if (r2 == 0) goto Ld1
            com.baidu.location.i r7 = r13.g     // Catch: java.lang.Exception -> L14c
            int r7 = r7.g     // Catch: java.lang.Exception -> L14c
            r8 = 4
            if (r7 == r8) goto La2
            java.util.List r2 = r2.getScanResults()     // Catch: java.lang.Exception -> L14c
            goto La3
        La2:
            r2 = r1
        La3:
            a.a.a.f.a r7 = a.a.a.f.a.e()     // Catch: java.lang.Exception -> L14c
            com.baidu.location.c r0 = r7.a(r0, r2, r3)     // Catch: java.lang.Exception -> L14c
            if (r0 == 0) goto Ld2
            int r2 = r0.r()     // Catch: java.lang.Exception -> L14c
            if (r2 != r4) goto Ld2
            double r7 = r0.q()     // Catch: java.lang.Exception -> L14c
            double r7 = java.lang.Math.abs(r7)     // Catch: java.lang.Exception -> L14c
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 >= 0) goto Ld2
            double r7 = r0.t()     // Catch: java.lang.Exception -> L14c
            double r7 = java.lang.Math.abs(r7)     // Catch: java.lang.Exception -> L14c
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 >= 0) goto Ld2
            r2 = 67
            r0.h(r2)     // Catch: java.lang.Exception -> L14c
            goto Ld2
        Ld1:
            r0 = r1
        Ld2:
            if (r0 == 0) goto Ld7
            r0.r()     // Catch: java.lang.Exception -> L14c
        Ld7:
            if (r0 == 0) goto Ldc
            r0.r()     // Catch: java.lang.Exception -> L14c
        Ldc:
            com.baidu.location.i r2 = r13.g     // Catch: java.lang.Exception -> L14c
            java.lang.String r2 = r2.f1370a     // Catch: java.lang.Exception -> L14c
            java.lang.String r7 = "gcj02"
            boolean r2 = r2.equals(r7)     // Catch: java.lang.Exception -> L14c
            if (r2 != 0) goto L122
            if (r0 == 0) goto L122
            int r2 = r0.r()     // Catch: java.lang.Exception -> L14c
            if (r2 != r4) goto L122
            double r7 = r0.t()     // Catch: java.lang.Exception -> L14c
            double r9 = r0.q()     // Catch: java.lang.Exception -> L14c
            double r11 = java.lang.Math.abs(r7)     // Catch: java.lang.Exception -> L14c
            int r2 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r2 <= 0) goto L122
            double r11 = java.lang.Math.abs(r9)     // Catch: java.lang.Exception -> L14c
            int r2 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r2 <= 0) goto L122
            com.baidu.location.i r2 = r13.g     // Catch: java.lang.Exception -> L14c
            java.lang.String r2 = r2.f1370a     // Catch: java.lang.Exception -> L14c
            double[] r2 = com.baidu.location.Jni.a(r7, r9, r2)     // Catch: java.lang.Exception -> L14c
            r7 = r2[r3]     // Catch: java.lang.Exception -> L14c
            r0.d(r7)     // Catch: java.lang.Exception -> L14c
            r3 = 1
            r2 = r2[r3]     // Catch: java.lang.Exception -> L14c
            r0.c(r2)     // Catch: java.lang.Exception -> L14c
            com.baidu.location.i r2 = r13.g     // Catch: java.lang.Exception -> L14c
            java.lang.String r2 = r2.f1370a     // Catch: java.lang.Exception -> L14c
            r0.e(r2)     // Catch: java.lang.Exception -> L14c
        L122:
            if (r0 == 0) goto L14c
            int r2 = r0.r()     // Catch: java.lang.Exception -> L14c
            if (r2 != r4) goto L14c
            double r2 = r0.q()     // Catch: java.lang.Exception -> L14c
            double r2 = java.lang.Math.abs(r2)     // Catch: java.lang.Exception -> L14c
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 <= 0) goto L14c
            double r2 = r0.t()     // Catch: java.lang.Exception -> L14c
            double r2 = java.lang.Math.abs(r2)     // Catch: java.lang.Exception -> L14c
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 <= 0) goto L14c
            boolean r2 = r13.s     // Catch: java.lang.Exception -> L14c
            if (r2 != 0) goto L14b
            a.a.a.b.h$b r2 = r13.h     // Catch: java.lang.Exception -> L14c
            r2.a(r0)     // Catch: java.lang.Exception -> L14c
        L14b:
            r1 = r0
        L14c:
            if (r1 != 0) goto L155
            a.a.a.b.h$c r0 = r13.o
            java.lang.String r13 = r13.i
            r0.c(r13)
        L155:
            return
    }

    public final void a(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "ideocfre"
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L5a
            r1.<init>(r5)     // Catch: java.lang.Exception -> L5a
            java.lang.String r5 = "content"
            org.json.JSONObject r5 = r1.getJSONObject(r5)     // Catch: java.lang.Exception -> L5a
            r1 = 0
            boolean r2 = r5.has(r0)     // Catch: java.lang.Exception -> L5a
            if (r2 == 0) goto L18
            java.lang.String r1 = r5.getString(r0)     // Catch: java.lang.Exception -> L5a
        L18:
            boolean r5 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L5a
            if (r5 != 0) goto L5e
            java.lang.String r5 = "|"
            boolean r5 = r1.contains(r5)     // Catch: java.lang.Exception -> L5a
            if (r5 == 0) goto L5e
            java.lang.String r5 = "\\|"
            java.lang.String[] r5 = r1.split(r5)     // Catch: java.lang.Exception -> L5a
            if (r5 == 0) goto L5e
            int r0 = r5.length     // Catch: java.lang.Exception -> L5a
            r1 = 2
            if (r0 < r1) goto L5e
            r0 = 0
            r1 = r5[r0]     // Catch: java.lang.Exception -> L5a
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Exception -> L5a
            r2 = 1
            r5 = r5[r2]     // Catch: java.lang.Exception -> L5a
            long r2 = java.lang.Long.parseLong(r5)     // Catch: java.lang.Exception -> L5a
            android.content.Context r4 = r4.f25a     // Catch: java.lang.Exception -> L5a
            java.lang.String r5 = "cuidRelate"
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r5, r0)     // Catch: java.lang.Exception -> L5a
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch: java.lang.Exception -> L5a
            java.lang.String r5 = "cuidoc"
            r4.putInt(r5, r1)     // Catch: java.lang.Exception -> L5a
            java.lang.String r5 = "cuidfreq"
            r4.putLong(r5, r2)     // Catch: java.lang.Exception -> L5a
            r4.apply()     // Catch: java.lang.Exception -> L5a
            goto L5e
        L5a:
            r4 = move-exception
            r4.printStackTrace()
        L5e:
            return
    }

    public java.lang.String b() {
            r6 = this;
            android.net.wifi.WifiManager r0 = r6.d
            if (r0 != 0) goto L6
            r6 = 0
            return r6
        L6:
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r6.q
            long r2 = r0 - r2
            r4 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L24
            android.net.wifi.WifiManager r2 = r6.d
            android.net.wifi.WifiInfo r2 = r2.getConnectionInfo()
            if (r2 == 0) goto L24
            java.lang.String r2 = r2.getBSSID()
            r6.p = r2
            r6.q = r0
        L24:
            java.lang.String r6 = r6.p
            return r6
    }

    public final void b(int r5) {
            r4 = this;
            com.baidu.location.i r0 = r4.g
            if (r0 == 0) goto L54
            boolean r0 = r0.i()
            if (r0 == 0) goto L54
            com.baidu.location.c r0 = new com.baidu.location.c
            r0.<init>()
            r0.h(r5)
            java.text.SimpleDateFormat r5 = new java.text.SimpleDateFormat
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r2 = "yyyy-MM-dd HH:mm:ss"
            r5.<init>(r2, r1)
            java.util.Date r1 = new java.util.Date
            long r2 = java.lang.System.currentTimeMillis()
            r1.<init>(r2)
            java.lang.String r5 = r5.format(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r4.l
            r1.append(r2)
            java.lang.String r2 = ";"
            r1.append(r2)
            java.lang.String r3 = r4.m
            r1.append(r3)
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r5 = com.baidu.location.Jni.a(r5)
            r0.k(r5)
            a.a.a.b.h$b r4 = r4.h
            if (r4 == 0) goto L54
            r4.a(r0)
        L54:
            return
    }

    public java.lang.String c() {
            r3 = this;
            r0 = 0
            java.lang.String r3 = r3.b()     // Catch: java.lang.Exception -> L22
            if (r3 == 0) goto L10
            java.lang.String r1 = ":"
            java.lang.String r2 = ""
            java.lang.String r3 = r3.replace(r1, r2)     // Catch: java.lang.Exception -> L22
            goto L11
        L10:
            r3 = r0
        L11:
            if (r3 == 0) goto L1c
            int r1 = r3.length()     // Catch: java.lang.Exception -> L22
            r2 = 12
            if (r1 == r2) goto L1c
            return r0
        L1c:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Exception -> L22
            r1.<init>(r3)     // Catch: java.lang.Exception -> L22
            return r1
        L22:
            return r0
    }

    public java.lang.String d() {
            r1 = this;
            r0 = 15
            java.lang.String r1 = r1.a(r0)     // Catch: java.lang.Exception -> L7
            return r1
        L7:
            r1 = 0
            return r1
    }

    public final java.util.List<android.net.wifi.WifiConfiguration> e() {
            r1 = this;
            r0 = 0
            android.net.wifi.WifiManager r1 = r1.d     // Catch: java.lang.Exception -> La
            if (r1 == 0) goto La
            java.util.List r1 = r1.getConfiguredNetworks()     // Catch: java.lang.Exception -> La
            return r1
        La:
            return r0
    }

    public final boolean f() {
            r8 = this;
            a.a.a.b.a r0 = a.a.a.b.a.c()
            int r0 = r0.f
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            android.content.Context r0 = r8.f25a
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.String r2 = "cuidRelate"
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r2, r1)
            java.lang.String r2 = "isInstalled"
            boolean r3 = r0.contains(r2)
            r4 = 1
            if (r3 != 0) goto L38
            android.content.SharedPreferences$Editor r3 = r0.edit()
            android.content.Context r5 = r8.f25a
            java.lang.String r6 = "com.baidu.map.location"
            boolean r5 = a.a.a.i.i.b(r5, r6)
            if (r5 == 0) goto L34
            r3.putInt(r2, r4)
            r3.apply()
            goto L40
        L34:
            r3.putInt(r2, r1)
            return r1
        L38:
            r3 = -1
            int r2 = r0.getInt(r2, r3)
            if (r2 != 0) goto L40
            return r1
        L40:
            java.lang.String r2 = "cuidoc"
            int r2 = r0.getInt(r2, r4)
            if (r2 != 0) goto L49
            return r1
        L49:
            long r2 = java.lang.System.currentTimeMillis()
            r5 = 0
            java.lang.String r7 = "reqtime"
            long r5 = r0.getLong(r7, r5)
            long r2 = r2 - r5
            r5 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r5
            r5 = 60
            java.lang.String r7 = "cuidfreq"
            long r5 = r0.getLong(r7, r5)
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 >= 0) goto L66
            return r1
        L66:
            android.content.Context r0 = r8.f25a
            int r0 = a.a.a.i.i.c(r0)
            r2 = 2
            if (r0 >= r2) goto L70
            return r1
        L70:
            android.net.wifi.WifiManager r0 = r8.d
            boolean r0 = a(r0)
            if (r0 == 0) goto L83
            a.a.a.g.k r8 = r8.e
            int r8 = r8.c()
            r0 = 3
            if (r8 > r0) goto L82
            goto L83
        L82:
            return r4
        L83:
            return r1
    }

    public void g() {
            r0 = this;
            r0.d()
            return
    }

    public final void h() {
            r11 = this;
            boolean r0 = r11.f()
            r1 = 0
            if (r0 == 0) goto Lc2
            r0 = 1
            r11.r = r0
            a.a.a.g.k r2 = r11.e
            r3 = 0
            if (r2 == 0) goto L67
            int r2 = r2.c()
            r4 = 10
            if (r2 < r4) goto L3e
            a.a.a.g.f r5 = a.a.a.g.f.w()
            a.a.a.g.k r6 = r11.e
            java.lang.String r8 = r11.c()
            boolean r9 = r11.r
            a.a.a.b.a r2 = a.a.a.b.a.c()
            int r10 = r2.f5c
            r7 = 9
            java.lang.String r2 = r5.a(r6, r7, r8, r9, r10)
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto L67
            byte[] r2 = r2.getBytes()
            java.lang.String r2 = a.a.a.i.i.a(r2, r1)
            goto L68
        L3e:
            a.a.a.g.f r4 = a.a.a.g.f.w()
            a.a.a.g.k r5 = r11.e
            int r6 = r5.c()
            java.lang.String r7 = r11.c()
            boolean r8 = r11.r
            a.a.a.b.a r2 = a.a.a.b.a.c()
            int r9 = r2.f5c
            java.lang.String r2 = r4.a(r5, r6, r7, r8, r9)
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto L67
            byte[] r2 = r2.getBytes()
            java.lang.String r2 = a.a.a.i.i.a(r2, r1)
            goto L68
        L67:
            r2 = r3
        L68:
            java.util.List r4 = r11.e()
            java.lang.String r4 = r11.a(r4)
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L7e
            byte[] r3 = r4.getBytes()
            java.lang.String r3 = a.a.a.i.i.a(r3, r1)
        L7e:
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto L9f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = r11.i
            r1.append(r4)
            java.lang.String r4 = "&swf5="
            r1.append(r4)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r11.i = r1
            r11.r = r0
            goto La1
        L9f:
            r11.r = r1
        La1:
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto Lc4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r11.i
            r1.append(r2)
            java.lang.String r2 = "&hwf5="
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r11.i = r1
            r11.r = r0
            goto Lc4
        Lc2:
            r11.r = r1
        Lc4:
            return
    }

    public void i() {
            r2 = this;
            android.net.wifi.WifiManager r0 = r2.d
            boolean r0 = r0.isWifiEnabled()
            if (r0 != 0) goto L10
            android.net.wifi.WifiManager r0 = r2.d
            boolean r0 = r0.isScanAlwaysAvailable()
            if (r0 == 0) goto L1f
        L10:
            com.baidu.location.i r0 = r2.g
            int r0 = r0.g
            r1 = 4
            if (r0 == r1) goto L1f
            a.a.a.g.f r0 = a.a.a.g.f.w()
            r1 = 0
            r0.a(r1)
        L1f:
            android.content.Context r2 = r2.f25a
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            int r2 = a.a.a.i.i.a(r2, r0)
            r0 = 1
            if (r2 != r0) goto L31
            a.a.a.g.f r2 = a.a.a.g.f.w()
            r2.a()
        L31:
            return
    }

    public void j() {
            r0 = this;
            a.a.a.g.f r0 = a.a.a.g.f.w()
            r0.v()
            return
    }
}
