package a.a.a.f;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.String[] f240a = null;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.String f241a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final java.lang.String f242b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f243c;
        public final boolean d;
        public final boolean e;
        public final int f;
        public final com.baidu.location.c g;
        public final boolean h;
        public final java.util.LinkedHashMap<java.lang.String, java.lang.Integer> i;

        public a(java.lang.String[] r22) {
                r21 = this;
                r0 = r21
                r1 = r22
                r21.<init>()
                r2 = 8
                r3 = 0
                r4 = 0
                if (r1 != 0) goto L21
                r0.f241a = r3
                r0.f242b = r3
                r0.i = r3
                r0.f243c = r4
                r0.d = r4
                r0.e = r4
                r0.g = r3
                r0.h = r4
                r0.f = r2
                goto L1b9
            L21:
                java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
                r5.<init>()
                r8 = r3
                r9 = r8
                r10 = r9
                r6 = r4
                r7 = r6
                r11 = r7
                r12 = r11
                r13 = r12
            L2e:
                int r15 = r1.length     // Catch: java.lang.Exception -> L19c
                if (r6 >= r15) goto L190
                r15 = r1[r6]     // Catch: java.lang.Exception -> L19c
                java.lang.String r3 = "-loc"
                boolean r3 = r15.equals(r3)     // Catch: java.lang.Exception -> L19c
                java.lang.String r15 = ";"
                if (r3 == 0) goto Lc3
                int r3 = r6 + 1
                r9 = r1[r3]     // Catch: java.lang.Exception -> Lc0
                java.lang.String r3 = "&"
                java.lang.String[] r3 = r9.split(r3)     // Catch: java.lang.Exception -> Lb7
                r4 = 0
            L48:
                int r14 = r3.length     // Catch: java.lang.Exception -> Lb4
                if (r4 >= r14) goto Laf
                r14 = r3[r4]     // Catch: java.lang.Exception -> Lb4
                r16 = r8
                java.lang.String r8 = "cl="
                boolean r8 = r14.startsWith(r8)     // Catch: java.lang.Exception -> Lb9
                if (r8 == 0) goto L64
                r8 = r3[r4]     // Catch: java.lang.Exception -> Lb9
                r14 = 3
                java.lang.String r8 = r8.substring(r14)     // Catch: java.lang.Exception -> Lb9
                r17 = r3
                r10 = r8
            L61:
                r19 = r9
                goto La6
            L64:
                r8 = r3[r4]     // Catch: java.lang.Exception -> Lb9
                java.lang.String r14 = "wf="
                boolean r8 = r8.startsWith(r14)     // Catch: java.lang.Exception -> Lb9
                if (r8 == 0) goto La3
                r8 = r3[r4]     // Catch: java.lang.Exception -> Lb9
                r14 = 3
                java.lang.String r8 = r8.substring(r14)     // Catch: java.lang.Exception -> Lb9
                java.lang.String r14 = "\\|"
                java.lang.String[] r8 = r8.split(r14)     // Catch: java.lang.Exception -> Lb9
                r17 = r3
                r14 = 0
            L7e:
                int r3 = r8.length     // Catch: java.lang.Exception -> Lb9
                if (r14 >= r3) goto L61
                r3 = r8[r14]     // Catch: java.lang.Exception -> Lb9
                java.lang.String[] r3 = r3.split(r15)     // Catch: java.lang.Exception -> Lb9
                r18 = r8
                int r8 = r3.length     // Catch: java.lang.Exception -> Lb9
                r19 = r9
                r9 = 2
                if (r8 < r9) goto L9c
                r8 = 0
                r9 = r3[r8]     // Catch: java.lang.Exception -> Lbb
                r8 = 1
                r3 = r3[r8]     // Catch: java.lang.Exception -> Lbb
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> Lbb
                r5.put(r9, r3)     // Catch: java.lang.Exception -> Lbb
            L9c:
                int r14 = r14 + 1
                r8 = r18
                r9 = r19
                goto L7e
            La3:
                r17 = r3
                goto L61
            La6:
                int r4 = r4 + 1
                r8 = r16
                r3 = r17
                r9 = r19
                goto L48
            Laf:
                r16 = r8
                r19 = r9
                goto L113
            Lb4:
                r16 = r8
                goto Lb9
            Lb7:
                r16 = r8
            Lb9:
                r19 = r9
            Lbb:
                r9 = r19
            Lbd:
                r8 = 0
                goto L19f
            Lc0:
                r16 = r8
                goto Lbd
            Lc3:
                r16 = r8
                r3 = r1[r6]     // Catch: java.lang.Exception -> Lbd
                java.lang.String r4 = "-com"
                boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> Lbd
                if (r3 == 0) goto L116
                int r3 = r6 + 1
                r3 = r1[r3]     // Catch: java.lang.Exception -> Lbd
                java.lang.String[] r3 = r3.split(r15)     // Catch: java.lang.Exception -> Lbd
                int r4 = r3.length     // Catch: java.lang.Exception -> Lbd
                if (r4 <= 0) goto L113
                com.baidu.location.c r4 = new com.baidu.location.c     // Catch: java.lang.Exception -> Lbd
                r4.<init>()     // Catch: java.lang.Exception -> Lbd
                r8 = 0
                r14 = r3[r8]     // Catch: java.lang.Exception -> L1a1
                java.lang.Double r14 = java.lang.Double.valueOf(r14)     // Catch: java.lang.Exception -> L1a1
                double r14 = r14.doubleValue()     // Catch: java.lang.Exception -> L1a1
                r4.c(r14)     // Catch: java.lang.Exception -> L1a1
                r14 = 1
                r14 = r3[r14]     // Catch: java.lang.Exception -> L1a1
                java.lang.Double r14 = java.lang.Double.valueOf(r14)     // Catch: java.lang.Exception -> L1a1
                double r14 = r14.doubleValue()     // Catch: java.lang.Exception -> L1a1
                r4.d(r14)     // Catch: java.lang.Exception -> L1a1
                r14 = 2
                r14 = r3[r14]     // Catch: java.lang.Exception -> L1a1
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch: java.lang.Exception -> L1a1
                int r14 = r14.intValue()     // Catch: java.lang.Exception -> L1a1
                r4.h(r14)     // Catch: java.lang.Exception -> L1a1
                r14 = 3
                r3 = r3[r14]     // Catch: java.lang.Exception -> L1a1
                r4.l(r3)     // Catch: java.lang.Exception -> L1a1
                r16 = r4
                goto L188
            L113:
                r8 = 0
                goto L188
            L116:
                r8 = 0
                r14 = 1
                r3 = r1[r6]     // Catch: java.lang.Exception -> L19f
                java.lang.String r4 = "-log"
                boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> L19f
                java.lang.String r4 = "true"
                if (r3 == 0) goto L130
                int r3 = r6 + 1
                r3 = r1[r3]     // Catch: java.lang.Exception -> L19f
                boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> L19f
                if (r3 == 0) goto L188
                r7 = r14
                goto L188
            L130:
                r3 = r1[r6]     // Catch: java.lang.Exception -> L19f
                java.lang.String r15 = "-rgc"
                boolean r3 = r3.equals(r15)     // Catch: java.lang.Exception -> L19f
                if (r3 == 0) goto L146
                int r3 = r6 + 1
                r3 = r1[r3]     // Catch: java.lang.Exception -> L19f
                boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> L19f
                if (r3 == 0) goto L188
                r12 = r14
                goto L188
            L146:
                r3 = r1[r6]     // Catch: java.lang.Exception -> L19f
                java.lang.String r15 = "-poi"
                boolean r3 = r3.equals(r15)     // Catch: java.lang.Exception -> L19f
                if (r3 == 0) goto L15c
                int r3 = r6 + 1
                r3 = r1[r3]     // Catch: java.lang.Exception -> L19f
                boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> L19f
                if (r3 == 0) goto L188
                r11 = r14
                goto L188
            L15c:
                r3 = r1[r6]     // Catch: java.lang.Exception -> L19f
                java.lang.String r15 = "-minap"
                boolean r3 = r3.equals(r15)     // Catch: java.lang.Exception -> L19f
                if (r3 == 0) goto L173
                int r3 = r6 + 1
                r3 = r1[r3]     // Catch: java.lang.Exception -> L188
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L188
                int r2 = r3.intValue()     // Catch: java.lang.Exception -> L188
                goto L188
            L173:
                r3 = r1[r6]     // Catch: java.lang.Exception -> L19f
                java.lang.String r15 = "-des"
                boolean r3 = r3.equals(r15)     // Catch: java.lang.Exception -> L19f
                if (r3 == 0) goto L188
                int r3 = r6 + 1
                r3 = r1[r3]     // Catch: java.lang.Exception -> L19f
                boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> L19f
                if (r3 == 0) goto L188
                r13 = r14
            L188:
                int r6 = r6 + 2
                r4 = r8
                r8 = r16
                r3 = 0
                goto L2e
            L190:
                r16 = r8
                r14 = 1
                if (r7 != 0) goto L197
                r3 = 0
                goto L198
            L197:
                r3 = r9
            L198:
                r4 = r14
                r8 = r16
                goto L1a7
            L19c:
                r16 = r8
                r8 = r4
            L19f:
                r4 = r16
            L1a1:
                r3 = r9
                r20 = r8
                r8 = r4
                r4 = r20
            L1a7:
                r0.f241a = r3
                r0.f242b = r10
                r0.i = r5
                r0.f243c = r4
                r0.d = r11
                r0.e = r12
                r0.f = r2
                r0.g = r8
                r0.h = r13
            L1b9:
                return
        }
    }

    static {
            java.lang.String r0 = "CoorType"
            java.lang.String r1 = "Time"
            java.lang.String r2 = "LocType"
            java.lang.String r3 = "Longitude"
            java.lang.String r4 = "Latitude"
            java.lang.String r5 = "Radius"
            java.lang.String r6 = "NetworkLocationType"
            java.lang.String r7 = "Country"
            java.lang.String r8 = "CountryCode"
            java.lang.String r9 = "Province"
            java.lang.String r10 = "City"
            java.lang.String r11 = "CityCode"
            java.lang.String r12 = "District"
            java.lang.String r13 = "Street"
            java.lang.String r14 = "StreetNumber"
            java.lang.String r15 = "PoiList"
            java.lang.String r16 = "LocationDescription"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16}
            a.a.a.f.e.f240a = r0
            return
    }

    public static android.database.Cursor a(com.baidu.location.c r12) {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r2 = "yyyy-MM-dd HH:mm:ss"
            r0.<init>(r2, r1)
            java.util.Date r1 = new java.util.Date
            long r2 = java.lang.System.currentTimeMillis()
            r1.<init>(r2)
            java.lang.String r0 = r0.format(r1)
            android.database.MatrixCursor r1 = new android.database.MatrixCursor
            java.lang.String[] r2 = a.a.a.f.e.f240a
            r1.<init>(r2)
            int r2 = r2.length
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "CoorType"
            int r3 = r1.getColumnIndex(r3)
            java.lang.String r4 = "gcj02"
            r2[r3] = r4
            java.lang.String r3 = "Time"
            int r3 = r1.getColumnIndex(r3)
            r2[r3] = r0
            java.lang.String r0 = "LocType"
            int r0 = r1.getColumnIndex(r0)
            int r3 = r12.r()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r0] = r3
            java.lang.String r0 = "Longitude"
            int r0 = r1.getColumnIndex(r0)
            double r3 = r12.t()
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            r2[r0] = r3
            java.lang.String r0 = "Latitude"
            int r0 = r1.getColumnIndex(r0)
            double r3 = r12.q()
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            r2[r0] = r3
            java.lang.String r0 = "Radius"
            int r0 = r1.getColumnIndex(r0)
            float r3 = r12.z()
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r2[r0] = r3
            java.lang.String r0 = "NetworkLocationType"
            int r0 = r1.getColumnIndex(r0)
            java.lang.String r3 = r12.v()
            r2[r0] = r3
            com.baidu.location.a r0 = r12.c()
            r3 = 0
            if (r0 == 0) goto L96
            java.lang.String r4 = r0.f1349a
            java.lang.String r5 = r0.f1350b
            java.lang.String r6 = r0.f1351c
            java.lang.String r7 = r0.d
            java.lang.String r8 = r0.e
            java.lang.String r9 = r0.f
            java.lang.String r10 = r0.g
            java.lang.String r0 = r0.h
            goto L9e
        L96:
            r0 = r3
            r4 = r0
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
        L9e:
            java.lang.String r11 = "Country"
            int r11 = r1.getColumnIndex(r11)
            r2[r11] = r4
            java.lang.String r4 = "CountryCode"
            int r4 = r1.getColumnIndex(r4)
            r2[r4] = r5
            java.lang.String r4 = "Province"
            int r4 = r1.getColumnIndex(r4)
            r2[r4] = r6
            java.lang.String r4 = "City"
            int r4 = r1.getColumnIndex(r4)
            r2[r4] = r7
            java.lang.String r4 = "CityCode"
            int r4 = r1.getColumnIndex(r4)
            r2[r4] = r8
            java.lang.String r4 = "District"
            int r4 = r1.getColumnIndex(r4)
            r2[r4] = r9
            java.lang.String r4 = "Street"
            int r4 = r1.getColumnIndex(r4)
            r2[r4] = r10
            java.lang.String r4 = "StreetNumber"
            int r4 = r1.getColumnIndex(r4)
            r2[r4] = r0
            java.util.List r0 = r12.x()
            java.lang.String r4 = "PoiList"
            if (r0 != 0) goto Led
            int r0 = r1.getColumnIndex(r4)
            r2[r0] = r3
            goto L12e
        Led:
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            r5 = 0
        Lf3:
            int r6 = r0.size()
            if (r5 >= r6) goto L124
            java.lang.Object r6 = r0.get(r5)
            com.baidu.location.j r6 = (com.baidu.location.j) r6
            java.lang.String r7 = r6.b()
            r3.append(r7)
            java.lang.String r7 = ";"
            r3.append(r7)
            java.lang.String r8 = r6.c()
            r3.append(r8)
            r3.append(r7)
            double r6 = r6.d()
            r3.append(r6)
            java.lang.String r6 = ";|"
            r3.append(r6)
            int r5 = r5 + 1
            goto Lf3
        L124:
            int r0 = r1.getColumnIndex(r4)
            java.lang.String r3 = r3.toString()
            r2[r0] = r3
        L12e:
            java.lang.String r12 = r12.s()
            java.lang.String r0 = "LocationDescription"
            int r0 = r1.getColumnIndex(r0)
            r2[r0] = r12
            r1.addRow(r2)
            return r1
    }

    public static com.baidu.location.c a(android.database.Cursor r28) {
            r0 = r28
            com.baidu.location.c r1 = new com.baidu.location.c
            r1.<init>()
            if (r0 == 0) goto L1e5
            int r2 = r28.getCount()
            if (r2 <= 0) goto L1e5
            boolean r2 = r28.moveToFirst()
            if (r2 == 0) goto L1e5
            r2 = 0
            java.lang.String r3 = "LocType"
            int r4 = r0.getColumnIndex(r3)
            r6 = -1
            if (r4 == r6) goto L28
            int r3 = r0.getColumnIndex(r3)
            int r3 = r0.getInt(r3)
            goto L29
        L28:
            r3 = 0
        L29:
            java.lang.String r4 = "Latitude"
            int r7 = r0.getColumnIndex(r4)
            r8 = 0
            if (r7 == r6) goto L3c
            int r4 = r0.getColumnIndex(r4)
            double r10 = r0.getDouble(r4)
            goto L3d
        L3c:
            r10 = r8
        L3d:
            java.lang.String r4 = "Longitude"
            int r7 = r0.getColumnIndex(r4)
            if (r7 == r6) goto L4d
            int r4 = r0.getColumnIndex(r4)
            double r8 = r0.getDouble(r4)
        L4d:
            java.lang.String r4 = "CoorType"
            int r7 = r0.getColumnIndex(r4)
            if (r7 == r6) goto L5e
            int r4 = r0.getColumnIndex(r4)
            java.lang.String r4 = r0.getString(r4)
            goto L5f
        L5e:
            r4 = 0
        L5f:
            java.lang.String r7 = "NetworkLocationType"
            int r13 = r0.getColumnIndex(r7)
            if (r13 == r6) goto L70
            int r7 = r0.getColumnIndex(r7)
            java.lang.String r7 = r0.getString(r7)
            goto L71
        L70:
            r7 = 0
        L71:
            java.lang.String r13 = "Radius"
            int r14 = r0.getColumnIndex(r13)
            if (r14 == r6) goto L81
            int r2 = r0.getColumnIndex(r13)
            float r2 = r0.getFloat(r2)
        L81:
            java.lang.String r13 = "Time"
            int r14 = r0.getColumnIndex(r13)
            if (r14 == r6) goto L92
            int r13 = r0.getColumnIndex(r13)
            java.lang.String r13 = r0.getString(r13)
            goto L93
        L92:
            r13 = 0
        L93:
            java.lang.String r14 = "Country"
            int r15 = r0.getColumnIndex(r14)
            if (r15 == r6) goto La4
            int r14 = r0.getColumnIndex(r14)
            java.lang.String r14 = r0.getString(r14)
            goto La5
        La4:
            r14 = 0
        La5:
            java.lang.String r15 = "CountryCode"
            int r12 = r0.getColumnIndex(r15)
            if (r12 == r6) goto Lb6
            int r12 = r0.getColumnIndex(r15)
            java.lang.String r12 = r0.getString(r12)
            goto Lb7
        Lb6:
            r12 = 0
        Lb7:
            java.lang.String r15 = "Province"
            int r5 = r0.getColumnIndex(r15)
            if (r5 == r6) goto Lc8
            int r5 = r0.getColumnIndex(r15)
            java.lang.String r5 = r0.getString(r5)
            goto Lc9
        Lc8:
            r5 = 0
        Lc9:
            java.lang.String r15 = "City"
            r16 = r7
            int r7 = r0.getColumnIndex(r15)
            if (r7 == r6) goto Ldc
            int r7 = r0.getColumnIndex(r15)
            java.lang.String r7 = r0.getString(r7)
            goto Ldd
        Ldc:
            r7 = 0
        Ldd:
            java.lang.String r15 = "CityCode"
            r17 = r8
            int r8 = r0.getColumnIndex(r15)
            if (r8 == r6) goto Lf0
            int r8 = r0.getColumnIndex(r15)
            java.lang.String r8 = r0.getString(r8)
            goto Lf1
        Lf0:
            r8 = 0
        Lf1:
            java.lang.String r9 = "District"
            int r15 = r0.getColumnIndex(r9)
            if (r15 == r6) goto L102
            int r9 = r0.getColumnIndex(r9)
            java.lang.String r9 = r0.getString(r9)
            goto L103
        L102:
            r9 = 0
        L103:
            java.lang.String r15 = "Street"
            r19 = r10
            int r10 = r0.getColumnIndex(r15)
            if (r10 == r6) goto L116
            int r10 = r0.getColumnIndex(r15)
            java.lang.String r10 = r0.getString(r10)
            goto L117
        L116:
            r10 = 0
        L117:
            java.lang.String r11 = "StreetNumber"
            int r15 = r0.getColumnIndex(r11)
            if (r15 == r6) goto L128
            int r11 = r0.getColumnIndex(r11)
            java.lang.String r11 = r0.getString(r11)
            goto L129
        L128:
            r11 = 0
        L129:
            com.baidu.location.a$a r15 = new com.baidu.location.a$a
            r15.<init>()
            r15.d(r14)
            r15.e(r12)
            r15.g(r5)
            r15.b(r7)
            r15.c(r8)
            r15.f(r9)
            r15.h(r10)
            r15.i(r11)
            com.baidu.location.a r5 = r15.a()
            java.lang.String r7 = "PoiList"
            int r8 = r0.getColumnIndex(r7)
            if (r8 == r6) goto L1ad
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            int r7 = r0.getColumnIndex(r7)
            java.lang.String r7 = r0.getString(r7)
            if (r7 == 0) goto L1a7
            java.lang.String r9 = "\\|"
            java.lang.String[] r7 = r7.split(r9)     // Catch: java.lang.Throwable -> L19b java.lang.Exception -> L1a0
            r9 = 0
        L168:
            int r10 = r7.length     // Catch: java.lang.Throwable -> L19b java.lang.Exception -> L1a0
            if (r9 >= r10) goto L1a7
            r10 = r7[r9]     // Catch: java.lang.Throwable -> L19b java.lang.Exception -> L1a0
            java.lang.String r11 = ";"
            java.lang.String[] r10 = r10.split(r11)     // Catch: java.lang.Throwable -> L19b java.lang.Exception -> L1a0
            int r11 = r10.length     // Catch: java.lang.Throwable -> L19b java.lang.Exception -> L1a0
            r12 = 3
            if (r11 < r12) goto L197
            com.baidu.location.j r11 = new com.baidu.location.j     // Catch: java.lang.Throwable -> L19b java.lang.Exception -> L1a0
            r12 = 0
            r22 = r10[r12]     // Catch: java.lang.Throwable -> L19b java.lang.Exception -> L1a0
            r14 = 1
            r23 = r10[r14]     // Catch: java.lang.Throwable -> L19b java.lang.Exception -> L1a0
            r14 = 2
            r10 = r10[r14]     // Catch: java.lang.Throwable -> L19b java.lang.Exception -> L1a0
            java.lang.Double r10 = java.lang.Double.valueOf(r10)     // Catch: java.lang.Throwable -> L19b java.lang.Exception -> L1a0
            double r24 = r10.doubleValue()     // Catch: java.lang.Throwable -> L19b java.lang.Exception -> L1a0
            java.lang.String r26 = ""
            java.lang.String r27 = ""
            r21 = r11
            r21.<init>(r22, r23, r24, r26, r27)     // Catch: java.lang.Throwable -> L19b java.lang.Exception -> L1a0
            r8.add(r11)     // Catch: java.lang.Throwable -> L19b java.lang.Exception -> L1a0
            goto L198
        L197:
            r12 = 0
        L198:
            int r9 = r9 + 1
            goto L168
        L19b:
            r0 = move-exception
            r8.size()
            throw r0
        L1a0:
            int r7 = r8.size()
            if (r7 != 0) goto L1ae
            goto L1ad
        L1a7:
            int r7 = r8.size()
            if (r7 != 0) goto L1ae
        L1ad:
            r8 = 0
        L1ae:
            java.lang.String r7 = "LocationDescription"
            int r9 = r0.getColumnIndex(r7)
            if (r9 == r6) goto L1bf
            int r6 = r0.getColumnIndex(r7)
            java.lang.String r12 = r0.getString(r6)
            goto L1c0
        L1bf:
            r12 = 0
        L1c0:
            r1.n(r13)
            r1.b(r2)
            r1.h(r3)
            r1.e(r4)
            r10 = r19
            r1.c(r10)
            r2 = r17
            r1.d(r2)
            r7 = r16
            r1.l(r7)
            r1.a(r5)
            r1.a(r8)
            r1.j(r12)
            goto L1ea
        L1e5:
            r0 = 67
            r1.h(r0)
        L1ea:
            return r1
    }

    public static java.lang.String a(com.baidu.location.c r8, int r9) {
            java.lang.String r0 = "1"
            r1 = 1
            r2 = 2
            r3 = 0
            if (r8 == 0) goto Lcf
            int r4 = r8.r()
            r5 = 67
            if (r4 != r5) goto L11
            goto Lcf
        L11:
            java.util.Locale r4 = java.util.Locale.CHINA
            r5 = 5
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r3] = r0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r5[r1] = r9
            double r6 = r8.t()
            java.lang.Double r9 = java.lang.Double.valueOf(r6)
            r5[r2] = r9
            double r6 = r8.q()
            java.lang.Double r9 = java.lang.Double.valueOf(r6)
            r0 = 3
            r5[r0] = r9
            float r9 = r8.z()
            int r9 = (int) r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r0 = 4
            r5[r0] = r9
            java.lang.String r9 = "&ofl=%s|%d|%f|%f|%d"
            java.lang.String r9 = java.lang.String.format(r4, r9, r5)
            com.baidu.location.a r0 = r8.c()
            if (r0 == 0) goto L65
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            java.lang.String r9 = "&ofaddr="
            r0.append(r9)
            com.baidu.location.a r9 = r8.c()
            java.lang.String r9 = r9.i
            r0.append(r9)
            java.lang.String r9 = r0.toString()
        L65:
            java.util.List r0 = r8.x()
            if (r0 == 0) goto La4
            java.util.List r0 = r8.x()
            int r0 = r0.size()
            if (r0 <= 0) goto La4
            java.util.List r8 = r8.x()
            java.lang.Object r8 = r8.get(r3)
            com.baidu.location.j r8 = (com.baidu.location.j) r8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            java.util.Locale r9 = java.util.Locale.US
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r5 = r8.b()
            r4[r3] = r5
            java.lang.String r8 = r8.c()
            r4[r1] = r8
            java.lang.String r8 = "&ofpoi=%s|%s"
            java.lang.String r8 = java.lang.String.format(r9, r8, r4)
            r0.append(r8)
            java.lang.String r9 = r0.toString()
        La4:
            java.lang.String r8 = a.a.a.i.b.f
            if (r8 == 0) goto Le1
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r9)
            java.util.Locale r9 = java.util.Locale.US
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = a.a.a.i.b.f
            r0[r3] = r2
            r2 = 1092113924(0x41185604, float:9.521)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r0[r1] = r2
            java.lang.String r1 = "&pack=%s&sdk=%.3f"
            java.lang.String r9 = java.lang.String.format(r9, r1, r0)
            r8.append(r9)
            java.lang.String r9 = r8.toString()
            goto Le1
        Lcf:
            java.util.Locale r8 = java.util.Locale.CHINA
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r3] = r0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r2[r1] = r9
            java.lang.String r9 = "&ofl=%s|%d"
            java.lang.String r9 = java.lang.String.format(r8, r9, r2)
        Le1:
            return r9
    }

    public static java.lang.String a(com.baidu.location.c r9, com.baidu.location.c r10, a.a.a.f.e.a r11) {
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r1 = 2
            r2 = 3
            r3 = 1
            r4 = 0
            if (r10 != 0) goto Le
            java.lang.String r10 = "&ofcl=0"
            goto L37
        Le:
            java.util.Locale r5 = java.util.Locale.US
            java.lang.Object[] r6 = new java.lang.Object[r2]
            double r7 = r10.t()
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            r6[r4] = r7
            double r7 = r10.q()
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            r6[r3] = r7
            float r10 = r10.z()
            int r10 = (int) r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r6[r1] = r10
            java.lang.String r10 = "&ofcl=1|%f|%f|%d"
            java.lang.String r10 = java.lang.String.format(r5, r10, r6)
        L37:
            r0.append(r10)
            if (r9 != 0) goto L3f
            java.lang.String r9 = "&ofwf=0"
            goto L68
        L3f:
            java.util.Locale r10 = java.util.Locale.US
            java.lang.Object[] r2 = new java.lang.Object[r2]
            double r5 = r9.t()
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            r2[r4] = r5
            double r5 = r9.q()
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            r2[r3] = r5
            float r9 = r9.z()
            int r9 = (int) r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r2[r1] = r9
            java.lang.String r9 = "&ofwf=1|%f|%f|%d"
            java.lang.String r9 = java.lang.String.format(r10, r9, r2)
        L68:
            r0.append(r9)
            if (r11 == 0) goto L74
            boolean r9 = r11.e
            if (r9 == 0) goto L74
            java.lang.String r9 = "&rgcn=1"
            goto L76
        L74:
            java.lang.String r9 = "&rgcn=0"
        L76:
            r0.append(r9)
            if (r11 == 0) goto L82
            boolean r9 = r11.d
            if (r9 == 0) goto L82
            java.lang.String r9 = "&poin=1"
            goto L84
        L82:
            java.lang.String r9 = "&poin=0"
        L84:
            r0.append(r9)
            if (r11 == 0) goto L90
            boolean r9 = r11.h
            if (r9 == 0) goto L90
            java.lang.String r9 = "&desc=1"
            goto L92
        L90:
            java.lang.String r9 = "&desc=0"
        L92:
            r0.append(r9)
            if (r11 == 0) goto Lac
            java.util.Locale r9 = java.util.Locale.US
            java.lang.Object[] r10 = new java.lang.Object[r3]
            int r11 = r11.f
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10[r4] = r11
            java.lang.String r11 = "&aps=%d"
            java.lang.String r9 = java.lang.String.format(r9, r11, r10)
            r0.append(r9)
        Lac:
            java.lang.String r9 = r0.toString()
            return r9
    }

    public static java.lang.String[] a(a.a.a.g.a r5, a.a.a.g.k r6, com.baidu.location.c r7, java.lang.String r8, boolean r9, int r10) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            if (r5 == 0) goto L17
            a.a.a.g.f r2 = a.a.a.g.f.w()
            java.lang.String r5 = r2.a(r5)
            r1.append(r5)
        L17:
            r5 = 0
            if (r6 == 0) goto L29
            a.a.a.g.f r2 = a.a.a.g.f.w()
            int r3 = a.a.a.i.i.q0
            r4 = 30
            java.lang.String r6 = r2.a(r4, r5, r6, r3)
            r1.append(r6)
        L29:
            int r6 = r1.length()
            if (r6 <= 0) goto L40
            if (r8 == 0) goto L34
            r1.append(r8)
        L34:
            java.lang.String r6 = "-loc"
            r0.add(r6)
            java.lang.String r6 = r1.toString()
            r0.add(r6)
        L40:
            if (r7 == 0) goto L7c
            java.util.Locale r6 = java.util.Locale.US
            r8 = 4
            java.lang.Object[] r8 = new java.lang.Object[r8]
            double r1 = r7.q()
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r8[r5] = r1
            double r1 = r7.t()
            java.lang.Double r5 = java.lang.Double.valueOf(r1)
            r1 = 1
            r8[r1] = r5
            int r5 = r7.r()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1 = 2
            r8[r1] = r5
            java.lang.String r5 = r7.v()
            r7 = 3
            r8[r7] = r5
            java.lang.String r5 = "%f;%f;%d;%s"
            java.lang.String r5 = java.lang.String.format(r6, r5, r8)
            java.lang.String r6 = "-com"
            r0.add(r6)
            r0.add(r5)
        L7c:
            java.lang.String r5 = "true"
            if (r9 == 0) goto L88
            java.lang.String r6 = "-log"
            r0.add(r6)
            r0.add(r5)
        L88:
            java.lang.String r6 = a.a.a.i.i.d
            java.lang.String r7 = "all"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L9a
            java.lang.String r6 = "-rgc"
            r0.add(r6)
            r0.add(r5)
        L9a:
            boolean r6 = a.a.a.i.i.h
            if (r6 == 0) goto La6
            java.lang.String r6 = "-poi"
            r0.add(r6)
            r0.add(r5)
        La6:
            boolean r6 = a.a.a.i.i.f
            if (r6 == 0) goto Lb2
            java.lang.String r6 = "-des"
            r0.add(r6)
            r0.add(r5)
        Lb2:
            java.lang.String r5 = "-minap"
            r0.add(r5)
            java.lang.String r5 = java.lang.Integer.toString(r10)
            r0.add(r5)
            int r5 = r0.size()
            java.lang.String[] r5 = new java.lang.String[r5]
            r0.toArray(r5)
            return r5
    }
}
