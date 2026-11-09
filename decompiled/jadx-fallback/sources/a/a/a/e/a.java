package a.a.a.e;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.util.ArrayList<com.baidu.location.e> f206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.baidu.location.c f208c;
    public long d;
    public com.baidu.location.h e;
    public android.content.Context f;
    public int g;
    public long h;
    public boolean i;
    public android.app.PendingIntent j;
    public android.app.AlarmManager k;
    public a.a.a.e.a.C0009a l;
    public boolean m;

    /* JADX INFO: renamed from: a.a.a.e.a$a, reason: collision with other inner class name */
    public class C0009a extends android.content.BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.a.a.e.a f209a;

        public C0009a(a.a.a.e.a r1) {
                r0 = this;
                r0.f209a = r1
                r0.<init>()
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r1, android.content.Intent r2) {
                r0 = this;
                a.a.a.e.a r1 = r0.f209a
                java.util.ArrayList r1 = a.a.a.e.a.a(r1)
                if (r1 == 0) goto L1e
                a.a.a.e.a r1 = r0.f209a
                java.util.ArrayList r1 = a.a.a.e.a.a(r1)
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L15
                goto L1e
            L15:
                a.a.a.e.a r0 = r0.f209a
                com.baidu.location.h r0 = a.a.a.e.a.b(r0)
                r0.i()
            L1e:
                return
        }
    }

    public class b implements com.baidu.location.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.a.a.e.a f210a;

        public b(a.a.a.e.a r1) {
                r0 = this;
                r0.f210a = r1
                r0.<init>()
                return
        }

        @Override // com.baidu.location.d
        public void a(com.baidu.location.c r2) {
                r1 = this;
                a.a.a.e.a r0 = r1.f210a
                java.util.ArrayList r0 = a.a.a.e.a.a(r0)
                if (r0 == 0) goto L19
                a.a.a.e.a r0 = r1.f210a
                java.util.ArrayList r0 = a.a.a.e.a.a(r0)
                int r0 = r0.size()
                if (r0 <= 0) goto L19
                a.a.a.e.a r1 = r1.f210a
                a.a.a.e.a.a(r1, r2)
            L19:
                return
        }
    }

    public a(android.content.Context r5, com.baidu.location.h r6) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.f206a = r0
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r4.f207b = r1
            r4.f208c = r0
            r1 = 0
            r4.d = r1
            r4.e = r0
            r4.f = r0
            r3 = 0
            r4.g = r3
            r4.h = r1
            r4.i = r3
            r4.j = r0
            r4.k = r0
            r4.l = r0
            a.a.a.e.a$b r0 = new a.a.a.e.a$b
            r0.<init>(r4)
            r4.m = r3
            r4.f = r5
            r4.e = r6
            r6.a(r0)
            android.content.Context r5 = r4.f
            java.lang.String r6 = "alarm"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.app.AlarmManager r5 = (android.app.AlarmManager) r5
            r4.k = r5
            a.a.a.e.a$a r5 = new a.a.a.e.a$a
            r5.<init>(r4)
            r4.l = r5
            r4.m = r3
            return
    }

    public static /* synthetic */ java.util.ArrayList a(a.a.a.e.a r0) {
            java.util.ArrayList<com.baidu.location.e> r0 = r0.f206a
            return r0
    }

    public static /* synthetic */ void a(a.a.a.e.a r0, com.baidu.location.c r1) {
            r0.a(r1)
            return
    }

    public static /* synthetic */ com.baidu.location.h b(a.a.a.e.a r0) {
            com.baidu.location.h r0 = r0.e
            return r0
    }

    public int a(com.baidu.location.e r13) {
            r12 = this;
            java.util.ArrayList<com.baidu.location.e> r0 = r12.f206a
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r12.f206a = r0
        Lb:
            java.util.ArrayList<com.baidu.location.e> r0 = r12.f206a
            r0.add(r13)
            r0 = 1
            r13.h = r0
            r13.i = r12
            boolean r1 = r12.m
            if (r1 != 0) goto L2c
            android.content.Context r1 = r12.f
            a.a.a.e.a$a r2 = r12.l
            android.content.IntentFilter r3 = new android.content.IntentFilter
            java.lang.String r4 = "android.com.baidu.location.TIMER.NOTIFY"
            r3.<init>(r4)
            r4 = 0
            java.lang.String r5 = "android.permission.ACCESS_FINE_LOCATION"
            r1.registerReceiver(r2, r3, r5, r4)
            r12.m = r0
        L2c:
            java.lang.String r1 = r13.d
            if (r1 != 0) goto L31
            return r0
        L31:
            java.lang.String r2 = "gcj02"
            boolean r1 = r1.equals(r2)
            r2 = 0
            if (r1 != 0) goto L5d
            double r3 = r13.f1358b
            double r5 = r13.f1357a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r7 = r13.d
            r1.append(r7)
            java.lang.String r7 = "2gcj"
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            double[] r1 = com.baidu.location.Jni.a(r3, r5, r1)
            r3 = r1[r2]
            r13.f = r3
            r3 = r1[r0]
            r13.e = r3
        L5d:
            com.baidu.location.c r1 = r12.f208c
            if (r1 == 0) goto Lb5
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r12.d
            long r3 = r3 - r5
            r5 = 30000(0x7530, double:1.4822E-319)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L6f
            goto Lb5
        L6f:
            float[] r1 = new float[r0]
            com.baidu.location.c r3 = r12.f208c
            double r3 = r3.q()
            com.baidu.location.c r5 = r12.f208c
            double r5 = r5.t()
            double r7 = r13.e
            double r9 = r13.f
            r11 = r1
            android.location.Location.distanceBetween(r3, r5, r7, r9, r11)
            r3 = r1[r2]
            float r4 = r13.f1359c
            float r3 = r3 - r4
            com.baidu.location.c r4 = r12.f208c
            float r4 = r4.z()
            float r3 = r3 - r4
            r4 = 0
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 <= 0) goto L9f
            float r13 = r12.f207b
            int r13 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r13 >= 0) goto Lba
            r12.f207b = r3
            goto Lba
        L9f:
            int r3 = r13.g
            r4 = 3
            if (r3 >= r4) goto Lba
            int r3 = r3 + r0
            r13.g = r3
            com.baidu.location.c r3 = r12.f208c
            r1 = r1[r2]
            r13.a(r3, r1)
            int r13 = r13.g
            if (r13 >= r4) goto Lba
            r12.i = r0
            goto Lba
        Lb5:
            com.baidu.location.h r13 = r12.e
            r13.i()
        Lba:
            r12.b()
            return r0
    }

    public final void a(long r5) {
            r4 = this;
            android.app.PendingIntent r0 = r4.j     // Catch: java.lang.Exception -> L2a
            if (r0 == 0) goto L9
            android.app.AlarmManager r1 = r4.k     // Catch: java.lang.Exception -> L2a
            r1.cancel(r0)     // Catch: java.lang.Exception -> L2a
        L9:
            android.content.Context r0 = r4.f     // Catch: java.lang.Exception -> L2a
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Exception -> L2a
            java.lang.String r2 = "android.com.baidu.location.TIMER.NOTIFY"
            r1.<init>(r2)     // Catch: java.lang.Exception -> L2a
            r2 = 201326592(0xc000000, float:9.8607613E-32)
            r3 = 0
            android.app.PendingIntent r0 = android.app.PendingIntent.getBroadcast(r0, r3, r1, r2)     // Catch: java.lang.Exception -> L2a
            r4.j = r0     // Catch: java.lang.Exception -> L2a
            if (r0 != 0) goto L1e
            return
        L1e:
            android.app.AlarmManager r0 = r4.k     // Catch: java.lang.Exception -> L2a
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L2a
            long r1 = r1 + r5
            android.app.PendingIntent r4 = r4.j     // Catch: java.lang.Exception -> L2a
            r0.set(r3, r1, r4)     // Catch: java.lang.Exception -> L2a
        L2a:
            return
    }

    public final void a(com.baidu.location.c r17) {
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.r()
            r3 = 61
            if (r2 == r3) goto L23
            int r2 = r17.r()
            r3 = 161(0xa1, float:2.26E-43)
            if (r2 == r3) goto L23
            int r2 = r17.r()
            r3 = 65
            if (r2 == r3) goto L23
            r1 = 120000(0x1d4c0, double:5.9288E-319)
            r0.a(r1)
            return
        L23:
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r0.d
            long r2 = r2 - r4
            r4 = 5000(0x1388, double:2.4703E-320)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto La4
            java.util.ArrayList<com.baidu.location.e> r2 = r0.f206a
            if (r2 != 0) goto L36
            goto La4
        L36:
            r0.f208c = r1
            long r2 = java.lang.System.currentTimeMillis()
            r0.d = r2
            r2 = 1
            float[] r12 = new float[r2]
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            java.util.ArrayList<com.baidu.location.e> r4 = r0.f206a
            java.util.Iterator r13 = r4.iterator()
            r14 = r3
        L4b:
            boolean r3 = r13.hasNext()
            r15 = 0
            if (r3 == 0) goto L97
            java.lang.Object r3 = r13.next()
            r11 = r3
            com.baidu.location.e r11 = (com.baidu.location.e) r11
            double r3 = r17.q()
            double r5 = r17.t()
            double r7 = r11.e
            double r9 = r11.f
            r2 = r11
            r11 = r12
            android.location.Location.distanceBetween(r3, r5, r7, r9, r11)
            r3 = r12[r15]
            float r4 = r2.f1359c
            float r3 = r3 - r4
            float r4 = r17.z()
            float r3 = r3 - r4
            r4 = 0
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 <= 0) goto L7f
            int r2 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r2 >= 0) goto L95
            r14 = r3
            goto L95
        L7f:
            int r3 = r2.g
            r4 = 3
            if (r3 >= r4) goto L95
            int r3 = r3 + 1
            r2.g = r3
            r3 = r12[r15]
            r2.a(r1, r3)
            int r2 = r2.g
            if (r2 >= r4) goto L95
            r2 = 1
            r0.i = r2
            goto L4b
        L95:
            r2 = 1
            goto L4b
        L97:
            float r1 = r0.f207b
            int r1 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r1 >= 0) goto L9f
            r0.f207b = r14
        L9f:
            r0.g = r15
            r16.b()
        La4:
            return
    }

    public final boolean a() {
            r3 = this;
            java.util.ArrayList<com.baidu.location.e> r0 = r3.f206a
            r1 = 0
            if (r0 == 0) goto L25
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lc
            goto L25
        Lc:
            java.util.ArrayList<com.baidu.location.e> r3 = r3.f206a
            java.util.Iterator r3 = r3.iterator()
        L12:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r3.next()
            com.baidu.location.e r0 = (com.baidu.location.e) r0
            int r0 = r0.g
            r2 = 3
            if (r0 >= r2) goto L12
            r1 = 1
            goto L12
        L25:
            return r1
    }

    public int b(com.baidu.location.e r2) {
            r1 = this;
            java.util.ArrayList<com.baidu.location.e> r0 = r1.f206a
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L6:
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L11
            java.util.ArrayList<com.baidu.location.e> r0 = r1.f206a
            r0.remove(r2)
        L11:
            java.util.ArrayList<com.baidu.location.e> r2 = r1.f206a
            int r2 = r2.size()
            if (r2 != 0) goto L22
            android.app.PendingIntent r2 = r1.j
            if (r2 == 0) goto L22
            android.app.AlarmManager r1 = r1.k
            r1.cancel(r2)
        L22:
            r1 = 1
            return r1
    }

    public final void b() {
            r6 = this;
            boolean r0 = r6.a()
            if (r0 != 0) goto L7
            return
        L7:
            float r0 = r6.f207b
            r1 = 1167867904(0x459c4000, float:5000.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r2 = 10000(0x2710, float:1.4013E-41)
            if (r1 <= 0) goto L16
            r0 = 600000(0x927c0, float:8.40779E-40)
            goto L2b
        L16:
            r1 = 1148846080(0x447a0000, float:1000.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L20
            r0 = 120000(0x1d4c0, float:1.68156E-40)
            goto L2b
        L20:
            r1 = 1140457472(0x43fa0000, float:500.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L2a
            r0 = 60000(0xea60, float:8.4078E-41)
            goto L2b
        L2a:
            r0 = r2
        L2b:
            boolean r1 = r6.i
            r3 = 0
            if (r1 == 0) goto L33
            r6.i = r3
            goto L34
        L33:
            r2 = r0
        L34:
            int r0 = r6.g
            if (r0 == 0) goto L47
            long r4 = r6.h
            long r0 = (long) r0
            long r4 = r4 + r0
            long r0 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r0
            long r0 = (long) r2
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L47
            goto L48
        L47:
            r3 = 1
        L48:
            if (r3 == 0) goto L58
            r6.g = r2
            long r0 = java.lang.System.currentTimeMillis()
            r6.h = r0
            int r0 = r6.g
            long r0 = (long) r0
            r6.a(r0)
        L58:
            return
    }

    public void c() {
            r2 = this;
            android.app.PendingIntent r0 = r2.j
            if (r0 == 0) goto L9
            android.app.AlarmManager r1 = r2.k
            r1.cancel(r0)
        L9:
            r0 = 0
            r2.f208c = r0
            r0 = 0
            r2.d = r0
            boolean r0 = r2.m
            if (r0 == 0) goto L1b
            android.content.Context r0 = r2.f
            a.a.a.e.a$a r1 = r2.l
            r0.unregisterReceiver(r1)
        L1b:
            r0 = 0
            r2.m = r0
            return
    }
}
