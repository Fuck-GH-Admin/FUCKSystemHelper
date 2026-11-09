package a.a.a.f;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final double[] f = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.a.a.f.d f247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.database.sqlite.SQLiteDatabase f249c;
    public int d;
    public int e;

    public static /* synthetic */ class a {
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double f250a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double f251b;

        public b(double r1, double r3) {
                r0 = this;
                r0.<init>()
                r0.f250a = r1
                r0.f251b = r3
                return
        }

        public /* synthetic */ b(double r1, double r3, a.a.a.f.g.a r5) {
                r0 = this;
                r0.<init>(r1, r3)
                return
        }

        public static /* synthetic */ double a(a.a.a.f.g.b r2) {
                double r0 = r2.f251b
                return r0
        }

        public static /* synthetic */ double a(a.a.a.f.g.b r0, double r1) {
                r0.f251b = r1
                return r1
        }

        public static /* synthetic */ double b(a.a.a.f.g.b r2) {
                double r0 = r2.f250a
                return r0
        }

        public static /* synthetic */ double b(a.a.a.f.g.b r0, double r1) {
                r0.f250a = r1
                return r1
        }
    }

    public static abstract enum c extends java.lang.Enum<a.a.a.f.g.c> {
        public static final a.a.a.f.g.c g = null;
        public static final a.a.a.f.g.c h = null;
        public static final a.a.a.f.g.c i = null;
        public static final a.a.a.f.g.c j = null;
        public static final /* synthetic */ a.a.a.f.g.c[] k = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f252b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final java.lang.String f253c;
        public final java.lang.String d;
        public final java.lang.String e;
        public final int f;

        public static enum a extends a.a.a.f.g.c {
            public a(java.lang.String r10, int r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, int r15, int r16) {
                    r9 = this;
                    r8 = 0
                    r0 = r9
                    r1 = r10
                    r2 = r11
                    r3 = r12
                    r4 = r13
                    r5 = r14
                    r6 = r15
                    r7 = r16
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                    return
            }

            @Override // a.a.a.f.g.c
            public java.util.List<java.lang.String> a(org.json.JSONObject r27, java.lang.String r28, int r29) {
                    r26 = this;
                    java.lang.String r0 = "dist"
                    java.lang.String r1 = "ct"
                    java.lang.String r2 = "ctc"
                    java.lang.String r3 = "prov"
                    java.lang.String r4 = "cyc"
                    java.lang.String r5 = "cy"
                    java.lang.String r6 = "\",\""
                    java.util.Iterator r7 = r27.keys()
                    java.lang.StringBuffer r8 = new java.lang.StringBuffer
                    r8.<init>()
                    java.lang.StringBuffer r9 = new java.lang.StringBuffer
                    r9.<init>()
                    java.util.ArrayList r10 = new java.util.ArrayList
                    r10.<init>()
                    r12 = 0
                L22:
                    boolean r13 = r7.hasNext()
                    java.lang.String r14 = "RGCUPDATE"
                    java.lang.String r15 = "RGCAREA"
                    java.lang.String r11 = "INSERT OR REPLACE INTO %s VALUES %s"
                    r16 = r14
                    if (r13 == 0) goto L17f
                    java.lang.Object r13 = r7.next()
                    java.lang.String r13 = (java.lang.String) r13
                    r14 = r27
                    r17 = r7
                    org.json.JSONObject r7 = r14.getJSONObject(r13)     // Catch: org.json.JSONException -> L12f
                    boolean r18 = r7.has(r5)     // Catch: org.json.JSONException -> L12f
                    r19 = 0
                    if (r18 == 0) goto L51
                    java.lang.String r18 = r7.getString(r5)     // Catch: org.json.JSONException -> L12f
                    r25 = r18
                    r18 = r5
                    r5 = r25
                    goto L55
                L51:
                    r18 = r5
                    r5 = r19
                L55:
                    boolean r20 = r7.has(r4)     // Catch: org.json.JSONException -> L124
                    if (r20 == 0) goto L66
                    java.lang.String r20 = r7.getString(r4)     // Catch: org.json.JSONException -> L124
                    r25 = r20
                    r20 = r4
                    r4 = r25
                    goto L6a
                L66:
                    r20 = r4
                    r4 = r19
                L6a:
                    boolean r21 = r7.has(r3)     // Catch: org.json.JSONException -> L11b
                    if (r21 == 0) goto L7b
                    java.lang.String r21 = r7.getString(r3)     // Catch: org.json.JSONException -> L11b
                    r25 = r21
                    r21 = r3
                    r3 = r25
                    goto L7f
                L7b:
                    r21 = r3
                    r3 = r19
                L7f:
                    boolean r22 = r7.has(r2)     // Catch: org.json.JSONException -> L114
                    if (r22 == 0) goto L90
                    java.lang.String r22 = r7.getString(r2)     // Catch: org.json.JSONException -> L114
                    r25 = r22
                    r22 = r2
                    r2 = r25
                    goto L94
                L90:
                    r22 = r2
                    r2 = r19
                L94:
                    boolean r23 = r7.has(r1)     // Catch: org.json.JSONException -> L10f
                    if (r23 == 0) goto La5
                    java.lang.String r23 = r7.getString(r1)     // Catch: org.json.JSONException -> L10f
                    r25 = r23
                    r23 = r1
                    r1 = r25
                    goto La9
                La5:
                    r23 = r1
                    r1 = r19
                La9:
                    boolean r24 = r7.has(r0)     // Catch: org.json.JSONException -> L10c
                    if (r24 == 0) goto Lb3
                    java.lang.String r19 = r7.getString(r0)     // Catch: org.json.JSONException -> L10c
                Lb3:
                    r7 = r19
                    int r19 = r8.length()     // Catch: org.json.JSONException -> L10c
                    if (r19 <= 0) goto Lc3
                    r19 = r0
                    java.lang.String r0 = ","
                    r8.append(r0)     // Catch: org.json.JSONException -> L13b
                    goto Lc5
                Lc3:
                    r19 = r0
                Lc5:
                    java.lang.String r0 = "(\""
                    r8.append(r0)     // Catch: org.json.JSONException -> L13b
                    r8.append(r13)     // Catch: org.json.JSONException -> L13b
                    r8.append(r6)     // Catch: org.json.JSONException -> L13b
                    r8.append(r5)     // Catch: org.json.JSONException -> L13b
                    r8.append(r6)     // Catch: org.json.JSONException -> L13b
                    r8.append(r4)     // Catch: org.json.JSONException -> L13b
                    r8.append(r6)     // Catch: org.json.JSONException -> L13b
                    r8.append(r3)     // Catch: org.json.JSONException -> L13b
                    r8.append(r6)     // Catch: org.json.JSONException -> L13b
                    r8.append(r1)     // Catch: org.json.JSONException -> L13b
                    r8.append(r6)     // Catch: org.json.JSONException -> L13b
                    r8.append(r2)     // Catch: org.json.JSONException -> L13b
                    r8.append(r6)     // Catch: org.json.JSONException -> L13b
                    r8.append(r7)     // Catch: org.json.JSONException -> L13b
                    java.lang.String r0 = "\","
                    r8.append(r0)     // Catch: org.json.JSONException -> L13b
                    long r0 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L13b
                    r2 = 1000(0x3e8, double:4.94E-321)
                    long r0 = r0 / r2
                    r8.append(r0)     // Catch: org.json.JSONException -> L13b
                    java.lang.String r0 = ",\"\")"
                    r8.append(r0)     // Catch: org.json.JSONException -> L13b
                    r0 = r28
                    r1 = 0
                    a.a.a.f.g.c.a(r9, r13, r0, r1)     // Catch: org.json.JSONException -> L13d
                    goto L13d
                L10c:
                    r19 = r0
                    goto L13b
                L10f:
                    r19 = r0
                    r23 = r1
                    goto L13b
                L114:
                    r19 = r0
                    r23 = r1
                    r22 = r2
                    goto L13b
                L11b:
                    r19 = r0
                    r23 = r1
                    r22 = r2
                    r21 = r3
                    goto L13b
                L124:
                    r19 = r0
                    r23 = r1
                    r22 = r2
                    r21 = r3
                    r20 = r4
                    goto L13b
                L12f:
                    r19 = r0
                    r23 = r1
                    r22 = r2
                    r21 = r3
                    r20 = r4
                    r18 = r5
                L13b:
                    r0 = r28
                L13d:
                    int r1 = r12 % 50
                    r2 = 49
                    if (r1 != r2) goto L16c
                    int r1 = r8.length()
                    if (r1 <= 0) goto L16c
                    java.util.Locale r1 = java.util.Locale.US
                    r2 = 2
                    java.lang.Object[] r3 = new java.lang.Object[r2]
                    r4 = 0
                    r3[r4] = r15
                    r5 = 1
                    r3[r5] = r8
                    java.lang.String r3 = java.lang.String.format(r1, r11, r3)
                    r10.add(r3)
                    java.lang.Object[] r2 = new java.lang.Object[r2]
                    r2[r4] = r16
                    r2[r5] = r9
                    java.lang.String r1 = java.lang.String.format(r1, r11, r2)
                    r10.add(r1)
                    r8.setLength(r4)
                    goto L16d
                L16c:
                    r4 = 0
                L16d:
                    int r12 = r12 + 1
                    r7 = r17
                    r5 = r18
                    r0 = r19
                    r4 = r20
                    r3 = r21
                    r2 = r22
                    r1 = r23
                    goto L22
                L17f:
                    r4 = 0
                    int r0 = r8.length()
                    if (r0 <= 0) goto L1a8
                    java.util.Locale r0 = java.util.Locale.US
                    r1 = 2
                    java.lang.Object[] r2 = new java.lang.Object[r1]
                    r2[r4] = r15
                    r3 = 1
                    r2[r3] = r8
                    java.lang.String r2 = java.lang.String.format(r0, r11, r2)
                    r10.add(r2)
                    java.lang.Object[] r1 = new java.lang.Object[r1]
                    r1[r4] = r16
                    r1[r3] = r9
                    java.lang.String r0 = java.lang.String.format(r0, r11, r1)
                    r10.add(r0)
                    r8.setLength(r4)
                    goto L1a9
                L1a8:
                    r3 = 1
                L1a9:
                    java.util.Locale r0 = java.util.Locale.US
                    java.lang.Object[] r1 = new java.lang.Object[r3]
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r29)
                    r1[r4] = r2
                    java.lang.String r2 = "DELETE FROM RGCAREA WHERE gridkey NOT IN (SELECT gridkey FROM RGCAREA LIMIT %d);"
                    java.lang.String r0 = java.lang.String.format(r0, r2, r1)
                    r10.add(r0)
                    return r10
            }
        }

        public static enum b extends a.a.a.f.g.c {
            public b(java.lang.String r10, int r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, int r15, int r16) {
                    r9 = this;
                    r8 = 0
                    r0 = r9
                    r1 = r10
                    r2 = r11
                    r3 = r12
                    r4 = r13
                    r5 = r14
                    r6 = r15
                    r7 = r16
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                    return
            }

            @Override // a.a.a.f.g.c
            public java.util.List<java.lang.String> a(org.json.JSONObject r26, java.lang.String r27, int r28) {
                    r25 = this;
                    java.lang.String r0 = "y2"
                    java.lang.String r1 = "x2"
                    java.lang.String r2 = "y1"
                    java.lang.String r3 = "x1"
                    java.lang.String r4 = "st"
                    java.util.Iterator r5 = r26.keys()
                    java.util.ArrayList r6 = new java.util.ArrayList
                    r6.<init>()
                    java.lang.StringBuffer r7 = new java.lang.StringBuffer
                    r7.<init>()
                L18:
                    boolean r8 = r5.hasNext()
                    java.lang.String r9 = "INSERT OR REPLACE INTO %s VALUES %s"
                    r12 = 0
                    if (r8 == 0) goto L190
                    java.lang.StringBuffer r8 = new java.lang.StringBuffer
                    r8.<init>()
                    java.lang.Object r13 = r5.next()
                    java.lang.String r13 = (java.lang.String) r13
                    r14 = r27
                    a.a.a.f.g.c.a(r7, r13, r14, r12)
                    r15 = r26
                    org.json.JSONArray r16 = r15.getJSONArray(r13)     // Catch: org.json.JSONException -> L3a
                    r11 = r16
                    goto L3b
                L3a:
                    r11 = 0
                L3b:
                    if (r11 == 0) goto L18
                L3d:
                    int r10 = r11.length()
                    java.lang.String r17 = "RGCROAD"
                    if (r12 >= r10) goto L15a
                    org.json.JSONObject r10 = r11.getJSONObject(r12)     // Catch: org.json.JSONException -> L118
                    boolean r18 = r10.has(r4)     // Catch: org.json.JSONException -> L118
                    if (r18 == 0) goto L5a
                    java.lang.String r18 = r10.getString(r4)     // Catch: org.json.JSONException -> L118
                    r24 = r18
                    r18 = r4
                    r4 = r24
                    goto L5d
                L5a:
                    r18 = r4
                    r4 = 0
                L5d:
                    boolean r19 = r10.has(r3)     // Catch: org.json.JSONException -> L10f
                    if (r19 == 0) goto L72
                    double r19 = r10.getDouble(r3)     // Catch: org.json.JSONException -> L10f
                    java.lang.Double r19 = java.lang.Double.valueOf(r19)     // Catch: org.json.JSONException -> L10f
                    r24 = r19
                    r19 = r3
                    r3 = r24
                    goto L75
                L72:
                    r19 = r3
                    r3 = 0
                L75:
                    boolean r20 = r10.has(r2)     // Catch: org.json.JSONException -> L108
                    if (r20 == 0) goto L8a
                    double r20 = r10.getDouble(r2)     // Catch: org.json.JSONException -> L108
                    java.lang.Double r20 = java.lang.Double.valueOf(r20)     // Catch: org.json.JSONException -> L108
                    r24 = r20
                    r20 = r2
                    r2 = r24
                    goto L8d
                L8a:
                    r20 = r2
                    r2 = 0
                L8d:
                    boolean r21 = r10.has(r1)     // Catch: org.json.JSONException -> L103
                    if (r21 == 0) goto La2
                    double r21 = r10.getDouble(r1)     // Catch: org.json.JSONException -> L103
                    java.lang.Double r21 = java.lang.Double.valueOf(r21)     // Catch: org.json.JSONException -> L103
                    r24 = r21
                    r21 = r1
                    r1 = r24
                    goto La5
                La2:
                    r21 = r1
                    r1 = 0
                La5:
                    boolean r22 = r10.has(r0)     // Catch: org.json.JSONException -> Lfe
                    if (r22 == 0) goto Lb4
                    double r22 = r10.getDouble(r0)     // Catch: org.json.JSONException -> Lfe
                    java.lang.Double r10 = java.lang.Double.valueOf(r22)     // Catch: org.json.JSONException -> Lfe
                    goto Lb5
                Lb4:
                    r10 = 0
                Lb5:
                    if (r4 == 0) goto Lfe
                    if (r3 == 0) goto Lfe
                    if (r2 == 0) goto Lfe
                    if (r1 == 0) goto Lfe
                    if (r10 == 0) goto Lfe
                    int r22 = r8.length()     // Catch: org.json.JSONException -> Lfe
                    r23 = r0
                    java.lang.String r0 = ","
                    if (r22 <= 0) goto Lcc
                    r8.append(r0)     // Catch: org.json.JSONException -> L100
                Lcc:
                    r22 = r5
                    java.lang.String r5 = "(NULL,\""
                    r8.append(r5)     // Catch: org.json.JSONException -> L123
                    r8.append(r13)     // Catch: org.json.JSONException -> L123
                    java.lang.String r5 = "\",\""
                    r8.append(r5)     // Catch: org.json.JSONException -> L123
                    r8.append(r4)     // Catch: org.json.JSONException -> L123
                    java.lang.String r4 = "\","
                    r8.append(r4)     // Catch: org.json.JSONException -> L123
                    r8.append(r3)     // Catch: org.json.JSONException -> L123
                    r8.append(r0)     // Catch: org.json.JSONException -> L123
                    r8.append(r2)     // Catch: org.json.JSONException -> L123
                    r8.append(r0)     // Catch: org.json.JSONException -> L123
                    r8.append(r1)     // Catch: org.json.JSONException -> L123
                    r8.append(r0)     // Catch: org.json.JSONException -> L123
                    r8.append(r10)     // Catch: org.json.JSONException -> L123
                    java.lang.String r0 = ")"
                    r8.append(r0)     // Catch: org.json.JSONException -> L123
                    goto L123
                Lfe:
                    r23 = r0
                L100:
                    r22 = r5
                    goto L123
                L103:
                    r23 = r0
                    r21 = r1
                    goto L100
                L108:
                    r23 = r0
                    r21 = r1
                    r20 = r2
                    goto L100
                L10f:
                    r23 = r0
                    r21 = r1
                    r20 = r2
                    r19 = r3
                    goto L100
                L118:
                    r23 = r0
                    r21 = r1
                    r20 = r2
                    r19 = r3
                    r18 = r4
                    goto L100
                L123:
                    int r0 = r12 % 50
                    r1 = 49
                    if (r0 != r1) goto L149
                    int r0 = r8.length()
                    if (r0 <= 0) goto L149
                    java.util.Locale r0 = java.util.Locale.US
                    r1 = 2
                    java.lang.Object[] r2 = new java.lang.Object[r1]
                    r1 = 0
                    r2[r1] = r17
                    java.lang.String r3 = r8.toString()
                    r4 = 1
                    r2[r4] = r3
                    java.lang.String r0 = java.lang.String.format(r0, r9, r2)
                    r6.add(r0)
                    r8.setLength(r1)
                    goto L14a
                L149:
                    r1 = 0
                L14a:
                    int r12 = r12 + 1
                    r4 = r18
                    r3 = r19
                    r2 = r20
                    r1 = r21
                    r5 = r22
                    r0 = r23
                    goto L3d
                L15a:
                    r23 = r0
                    r21 = r1
                    r20 = r2
                    r19 = r3
                    r18 = r4
                    r22 = r5
                    r1 = 0
                    int r0 = r8.length()
                    if (r0 <= 0) goto L182
                    java.util.Locale r0 = java.util.Locale.US
                    r2 = 2
                    java.lang.Object[] r2 = new java.lang.Object[r2]
                    r2[r1] = r17
                    java.lang.String r1 = r8.toString()
                    r3 = 1
                    r2[r3] = r1
                    java.lang.String r0 = java.lang.String.format(r0, r9, r2)
                    r6.add(r0)
                L182:
                    r4 = r18
                    r3 = r19
                    r2 = r20
                    r1 = r21
                    r5 = r22
                    r0 = r23
                    goto L18
                L190:
                    int r0 = r7.length()
                    if (r0 <= 0) goto L1ab
                    java.util.Locale r0 = java.util.Locale.US
                    r1 = 2
                    java.lang.Object[] r1 = new java.lang.Object[r1]
                    java.lang.String r2 = "RGCUPDATE"
                    r3 = 0
                    r1[r3] = r2
                    r2 = 1
                    r1[r2] = r7
                    java.lang.String r0 = java.lang.String.format(r0, r9, r1)
                    r6.add(r0)
                    goto L1ad
                L1ab:
                    r2 = 1
                    r3 = 0
                L1ad:
                    java.util.Locale r0 = java.util.Locale.US
                    java.lang.Object[] r1 = new java.lang.Object[r2]
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r28)
                    r1[r3] = r2
                    java.lang.String r2 = "DELETE FROM RGCROAD WHERE _id NOT IN (SELECT _id FROM RGCROAD LIMIT %d);"
                    java.lang.String r0 = java.lang.String.format(r0, r2, r1)
                    r6.add(r0)
                    return r6
            }
        }

        /* JADX INFO: renamed from: a.a.a.f.g$c$c, reason: collision with other inner class name */
        public static enum C0013c extends a.a.a.f.g.c {
            public C0013c(java.lang.String r10, int r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, int r15, int r16) {
                    r9 = this;
                    r8 = 0
                    r0 = r9
                    r1 = r10
                    r2 = r11
                    r3 = r12
                    r4 = r13
                    r5 = r14
                    r6 = r15
                    r7 = r16
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                    return
            }

            @Override // a.a.a.f.g.c
            public java.util.List<java.lang.String> a(org.json.JSONObject r25, java.lang.String r26, int r27) {
                    r24 = this;
                    java.lang.String r0 = "\",\""
                    java.lang.String r1 = "y"
                    java.lang.String r2 = "x"
                    java.lang.String r3 = "stn"
                    java.lang.String r4 = "st"
                    java.util.Iterator r5 = r25.keys()
                    java.util.ArrayList r6 = new java.util.ArrayList
                    r6.<init>()
                    java.lang.StringBuffer r7 = new java.lang.StringBuffer
                    r7.<init>()
                L18:
                    boolean r8 = r5.hasNext()
                    java.lang.String r9 = "INSERT OR REPLACE INTO %s VALUES %s"
                    r12 = 0
                    if (r8 == 0) goto L150
                    java.lang.StringBuffer r8 = new java.lang.StringBuffer
                    r8.<init>()
                    java.lang.Object r13 = r5.next()
                    java.lang.String r13 = (java.lang.String) r13
                    r14 = r26
                    a.a.a.f.g.c.a(r7, r13, r14, r12)
                    r15 = r25
                    org.json.JSONArray r16 = r15.getJSONArray(r13)     // Catch: org.json.JSONException -> L3a
                    r11 = r16
                    goto L3b
                L3a:
                    r11 = 0
                L3b:
                    if (r11 == 0) goto L18
                L3d:
                    int r10 = r11.length()
                    java.lang.String r17 = "RGCSITE"
                    if (r12 >= r10) goto L11e
                    org.json.JSONObject r10 = r11.getJSONObject(r12)     // Catch: org.json.JSONException -> Ldf
                    boolean r18 = r10.has(r4)     // Catch: org.json.JSONException -> Ldf
                    if (r18 == 0) goto L5a
                    java.lang.String r18 = r10.getString(r4)     // Catch: org.json.JSONException -> Ldf
                    r23 = r18
                    r18 = r4
                    r4 = r23
                    goto L5d
                L5a:
                    r18 = r4
                    r4 = 0
                L5d:
                    boolean r19 = r10.has(r3)     // Catch: org.json.JSONException -> Ld8
                    if (r19 == 0) goto L6e
                    java.lang.String r19 = r10.getString(r3)     // Catch: org.json.JSONException -> Ld8
                    r23 = r19
                    r19 = r3
                    r3 = r23
                    goto L71
                L6e:
                    r19 = r3
                    r3 = 0
                L71:
                    boolean r20 = r10.has(r2)     // Catch: org.json.JSONException -> Ld3
                    if (r20 == 0) goto L86
                    double r20 = r10.getDouble(r2)     // Catch: org.json.JSONException -> Ld3
                    java.lang.Double r20 = java.lang.Double.valueOf(r20)     // Catch: org.json.JSONException -> Ld3
                    r23 = r20
                    r20 = r2
                    r2 = r23
                    goto L89
                L86:
                    r20 = r2
                    r2 = 0
                L89:
                    boolean r21 = r10.has(r1)     // Catch: org.json.JSONException -> Ld0
                    if (r21 == 0) goto L98
                    double r21 = r10.getDouble(r1)     // Catch: org.json.JSONException -> Ld0
                    java.lang.Double r10 = java.lang.Double.valueOf(r21)     // Catch: org.json.JSONException -> Ld0
                    goto L99
                L98:
                    r10 = 0
                L99:
                    int r21 = r8.length()     // Catch: org.json.JSONException -> Ld0
                    r22 = r1
                    java.lang.String r1 = ","
                    if (r21 <= 0) goto La6
                    r8.append(r1)     // Catch: org.json.JSONException -> Le7
                La6:
                    r21 = r5
                    java.lang.String r5 = "(NULL,\""
                    r8.append(r5)     // Catch: org.json.JSONException -> Le9
                    r8.append(r13)     // Catch: org.json.JSONException -> Le9
                    r8.append(r0)     // Catch: org.json.JSONException -> Le9
                    r8.append(r4)     // Catch: org.json.JSONException -> Le9
                    r8.append(r0)     // Catch: org.json.JSONException -> Le9
                    r8.append(r3)     // Catch: org.json.JSONException -> Le9
                    java.lang.String r3 = "\","
                    r8.append(r3)     // Catch: org.json.JSONException -> Le9
                    r8.append(r2)     // Catch: org.json.JSONException -> Le9
                    r8.append(r1)     // Catch: org.json.JSONException -> Le9
                    r8.append(r10)     // Catch: org.json.JSONException -> Le9
                    java.lang.String r1 = ")"
                    r8.append(r1)     // Catch: org.json.JSONException -> Le9
                    goto Le9
                Ld0:
                    r22 = r1
                    goto Le7
                Ld3:
                    r22 = r1
                    r20 = r2
                    goto Le7
                Ld8:
                    r22 = r1
                    r20 = r2
                    r19 = r3
                    goto Le7
                Ldf:
                    r22 = r1
                    r20 = r2
                    r19 = r3
                    r18 = r4
                Le7:
                    r21 = r5
                Le9:
                    int r1 = r12 % 50
                    r2 = 49
                    if (r1 != r2) goto L10f
                    int r1 = r8.length()
                    if (r1 <= 0) goto L10f
                    java.util.Locale r1 = java.util.Locale.US
                    r2 = 2
                    java.lang.Object[] r3 = new java.lang.Object[r2]
                    r2 = 0
                    r3[r2] = r17
                    java.lang.String r4 = r8.toString()
                    r5 = 1
                    r3[r5] = r4
                    java.lang.String r1 = java.lang.String.format(r1, r9, r3)
                    r6.add(r1)
                    r8.setLength(r2)
                    goto L110
                L10f:
                    r2 = 0
                L110:
                    int r12 = r12 + 1
                    r4 = r18
                    r3 = r19
                    r2 = r20
                    r5 = r21
                    r1 = r22
                    goto L3d
                L11e:
                    r22 = r1
                    r20 = r2
                    r19 = r3
                    r18 = r4
                    r21 = r5
                    r2 = 0
                    int r1 = r8.length()
                    if (r1 <= 0) goto L144
                    java.util.Locale r1 = java.util.Locale.US
                    r3 = 2
                    java.lang.Object[] r3 = new java.lang.Object[r3]
                    r3[r2] = r17
                    java.lang.String r2 = r8.toString()
                    r4 = 1
                    r3[r4] = r2
                    java.lang.String r1 = java.lang.String.format(r1, r9, r3)
                    r6.add(r1)
                L144:
                    r4 = r18
                    r3 = r19
                    r2 = r20
                    r5 = r21
                    r1 = r22
                    goto L18
                L150:
                    int r0 = r7.length()
                    if (r0 <= 0) goto L16b
                    java.util.Locale r0 = java.util.Locale.US
                    r1 = 2
                    java.lang.Object[] r1 = new java.lang.Object[r1]
                    java.lang.String r2 = "RGCUPDATE"
                    r3 = 0
                    r1[r3] = r2
                    r2 = 1
                    r1[r2] = r7
                    java.lang.String r0 = java.lang.String.format(r0, r9, r1)
                    r6.add(r0)
                    goto L16d
                L16b:
                    r2 = 1
                    r3 = 0
                L16d:
                    java.util.Locale r0 = java.util.Locale.US
                    java.lang.Object[] r1 = new java.lang.Object[r2]
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r27)
                    r1[r3] = r2
                    java.lang.String r2 = "DELETE FROM RGCSITE WHERE _id NOT IN (SELECT _id FROM RGCSITE LIMIT %d);"
                    java.lang.String r0 = java.lang.String.format(r0, r2, r1)
                    r6.add(r0)
                    return r6
            }
        }

        public static enum d extends a.a.a.f.g.c {
            public d(java.lang.String r10, int r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, int r15, int r16) {
                    r9 = this;
                    r8 = 0
                    r0 = r9
                    r1 = r10
                    r2 = r11
                    r3 = r12
                    r4 = r13
                    r5 = r14
                    r6 = r15
                    r7 = r16
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                    return
            }

            @Override // a.a.a.f.g.c
            public java.util.List<java.lang.String> a(org.json.JSONObject r29, java.lang.String r30, int r31) {
                    r28 = this;
                    java.lang.String r0 = "y"
                    java.lang.String r1 = "x"
                    java.lang.String r2 = "rk"
                    java.lang.String r3 = "tp"
                    java.lang.String r4 = "ne"
                    java.lang.String r5 = "pid"
                    java.lang.String r6 = "\",\""
                    java.util.Iterator r7 = r29.keys()
                    java.util.ArrayList r8 = new java.util.ArrayList
                    r8.<init>()
                    java.lang.StringBuffer r9 = new java.lang.StringBuffer
                    r9.<init>()
                L1c:
                    boolean r10 = r7.hasNext()
                    java.lang.String r11 = "INSERT OR REPLACE INTO %s VALUES %s"
                    r14 = 1
                    if (r10 == 0) goto L1b4
                    java.lang.StringBuffer r10 = new java.lang.StringBuffer
                    r10.<init>()
                    java.lang.Object r15 = r7.next()
                    java.lang.String r15 = (java.lang.String) r15
                    r13 = r30
                    a.a.a.f.g.c.a(r9, r15, r13, r14)
                    r16 = 0
                    r14 = r29
                    org.json.JSONArray r17 = r14.getJSONArray(r15)     // Catch: org.json.JSONException -> L40
                    r12 = r17
                    goto L42
                L40:
                    r12 = r16
                L42:
                    if (r12 == 0) goto L1c
                    r18 = r7
                    r7 = 0
                L47:
                    int r13 = r12.length()
                    java.lang.String r19 = "RGCPOI"
                    if (r7 >= r13) goto L17c
                    org.json.JSONObject r13 = r12.getJSONObject(r7)     // Catch: org.json.JSONException -> L13b
                    boolean r20 = r13.has(r5)     // Catch: org.json.JSONException -> L13b
                    if (r20 == 0) goto L64
                    java.lang.String r20 = r13.getString(r5)     // Catch: org.json.JSONException -> L13b
                    r27 = r20
                    r20 = r5
                    r5 = r27
                    goto L68
                L64:
                    r20 = r5
                    r5 = r16
                L68:
                    boolean r21 = r13.has(r4)     // Catch: org.json.JSONException -> L130
                    if (r21 == 0) goto L79
                    java.lang.String r21 = r13.getString(r4)     // Catch: org.json.JSONException -> L130
                    r27 = r21
                    r21 = r4
                    r4 = r27
                    goto L7d
                L79:
                    r21 = r4
                    r4 = r16
                L7d:
                    boolean r22 = r13.has(r3)     // Catch: org.json.JSONException -> L127
                    if (r22 == 0) goto L8e
                    java.lang.String r22 = r13.getString(r3)     // Catch: org.json.JSONException -> L127
                    r27 = r22
                    r22 = r3
                    r3 = r27
                    goto L92
                L8e:
                    r22 = r3
                    r3 = r16
                L92:
                    boolean r23 = r13.has(r2)     // Catch: org.json.JSONException -> L120
                    if (r23 == 0) goto La7
                    int r23 = r13.getInt(r2)     // Catch: org.json.JSONException -> L120
                    java.lang.Integer r23 = java.lang.Integer.valueOf(r23)     // Catch: org.json.JSONException -> L120
                    r27 = r23
                    r23 = r2
                    r2 = r27
                    goto Lab
                La7:
                    r23 = r2
                    r2 = r16
                Lab:
                    boolean r24 = r13.has(r1)     // Catch: org.json.JSONException -> L11b
                    if (r24 == 0) goto Lc0
                    double r24 = r13.getDouble(r1)     // Catch: org.json.JSONException -> L11b
                    java.lang.Double r24 = java.lang.Double.valueOf(r24)     // Catch: org.json.JSONException -> L11b
                    r27 = r24
                    r24 = r1
                    r1 = r27
                    goto Lc4
                Lc0:
                    r24 = r1
                    r1 = r16
                Lc4:
                    boolean r25 = r13.has(r0)     // Catch: org.json.JSONException -> L118
                    if (r25 == 0) goto Ld3
                    double r25 = r13.getDouble(r0)     // Catch: org.json.JSONException -> L118
                    java.lang.Double r13 = java.lang.Double.valueOf(r25)     // Catch: org.json.JSONException -> L118
                    goto Ld5
                Ld3:
                    r13 = r16
                Ld5:
                    int r25 = r10.length()     // Catch: org.json.JSONException -> L118
                    r26 = r0
                    java.lang.String r0 = ","
                    if (r25 <= 0) goto Le2
                    r10.append(r0)     // Catch: org.json.JSONException -> L147
                Le2:
                    r25 = r12
                    java.lang.String r12 = "(\""
                    r10.append(r12)     // Catch: org.json.JSONException -> L149
                    r10.append(r5)     // Catch: org.json.JSONException -> L149
                    r10.append(r6)     // Catch: org.json.JSONException -> L149
                    r10.append(r15)     // Catch: org.json.JSONException -> L149
                    r10.append(r6)     // Catch: org.json.JSONException -> L149
                    r10.append(r4)     // Catch: org.json.JSONException -> L149
                    r10.append(r6)     // Catch: org.json.JSONException -> L149
                    r10.append(r3)     // Catch: org.json.JSONException -> L149
                    java.lang.String r3 = "\","
                    r10.append(r3)     // Catch: org.json.JSONException -> L149
                    r10.append(r1)     // Catch: org.json.JSONException -> L149
                    r10.append(r0)     // Catch: org.json.JSONException -> L149
                    r10.append(r13)     // Catch: org.json.JSONException -> L149
                    r10.append(r0)     // Catch: org.json.JSONException -> L149
                    r10.append(r2)     // Catch: org.json.JSONException -> L149
                    java.lang.String r0 = ")"
                    r10.append(r0)     // Catch: org.json.JSONException -> L149
                    goto L149
                L118:
                    r26 = r0
                    goto L147
                L11b:
                    r26 = r0
                    r24 = r1
                    goto L147
                L120:
                    r26 = r0
                    r24 = r1
                    r23 = r2
                    goto L147
                L127:
                    r26 = r0
                    r24 = r1
                    r23 = r2
                    r22 = r3
                    goto L147
                L130:
                    r26 = r0
                    r24 = r1
                    r23 = r2
                    r22 = r3
                    r21 = r4
                    goto L147
                L13b:
                    r26 = r0
                    r24 = r1
                    r23 = r2
                    r22 = r3
                    r21 = r4
                    r20 = r5
                L147:
                    r25 = r12
                L149:
                    int r0 = r7 % 50
                    r1 = 49
                    if (r0 != r1) goto L169
                    java.util.Locale r0 = java.util.Locale.US
                    r1 = 2
                    java.lang.Object[] r2 = new java.lang.Object[r1]
                    r1 = 0
                    r2[r1] = r19
                    java.lang.String r3 = r10.toString()
                    r4 = 1
                    r2[r4] = r3
                    java.lang.String r0 = java.lang.String.format(r0, r11, r2)
                    r8.add(r0)
                    r10.setLength(r1)
                    goto L16a
                L169:
                    r1 = 0
                L16a:
                    int r7 = r7 + 1
                    r5 = r20
                    r4 = r21
                    r3 = r22
                    r2 = r23
                    r1 = r24
                    r12 = r25
                    r0 = r26
                    goto L47
                L17c:
                    r26 = r0
                    r24 = r1
                    r23 = r2
                    r22 = r3
                    r21 = r4
                    r20 = r5
                    r1 = 0
                    int r0 = r10.length()
                    if (r0 <= 0) goto L1a4
                    java.util.Locale r0 = java.util.Locale.US
                    r2 = 2
                    java.lang.Object[] r2 = new java.lang.Object[r2]
                    r2[r1] = r19
                    java.lang.String r1 = r10.toString()
                    r3 = 1
                    r2[r3] = r1
                    java.lang.String r0 = java.lang.String.format(r0, r11, r2)
                    r8.add(r0)
                L1a4:
                    r7 = r18
                    r5 = r20
                    r4 = r21
                    r3 = r22
                    r2 = r23
                    r1 = r24
                    r0 = r26
                    goto L1c
                L1b4:
                    int r0 = r9.length()
                    if (r0 <= 0) goto L1cf
                    java.util.Locale r0 = java.util.Locale.US
                    r1 = 2
                    java.lang.Object[] r1 = new java.lang.Object[r1]
                    java.lang.String r2 = "RGCUPDATE"
                    r3 = 0
                    r1[r3] = r2
                    r2 = 1
                    r1[r2] = r9
                    java.lang.String r0 = java.lang.String.format(r0, r11, r1)
                    r8.add(r0)
                    goto L1d1
                L1cf:
                    r2 = 1
                    r3 = 0
                L1d1:
                    java.util.Locale r0 = java.util.Locale.US
                    java.lang.Object[] r1 = new java.lang.Object[r2]
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r31)
                    r1[r3] = r2
                    java.lang.String r2 = "DELETE FROM RGCPOI WHERE pid NOT IN (SELECT pid FROM RGCPOI LIMIT %d);"
                    java.lang.String r0 = java.lang.String.format(r0, r2, r1)
                    r8.add(r0)
                    return r8
            }
        }

        static {
                a.a.a.f.g$c$a r8 = new a.a.a.f.g$c$a
                java.lang.String r1 = "AREA"
                r2 = 0
                java.lang.String r3 = "RGCAREA"
                java.lang.String r4 = "area"
                java.lang.String r5 = "addrv"
                r6 = 0
                r7 = 1000(0x3e8, float:1.401E-42)
                r0 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                a.a.a.f.g.c.g = r8
                a.a.a.f.g$c$b r0 = new a.a.a.f.g$c$b
                java.lang.String r10 = "ROAD"
                r11 = 1
                java.lang.String r12 = "RGCROAD"
                java.lang.String r13 = "road"
                java.lang.String r14 = "addrv"
                r15 = 1000(0x3e8, float:1.401E-42)
                r16 = 10000(0x2710, float:1.4013E-41)
                r9 = r0
                r9.<init>(r10, r11, r12, r13, r14, r15, r16)
                a.a.a.f.g.c.h = r0
                a.a.a.f.g$c$c r1 = new a.a.a.f.g$c$c
                java.lang.String r18 = "SITE"
                r19 = 2
                java.lang.String r20 = "RGCSITE"
                java.lang.String r21 = "site"
                java.lang.String r22 = "addrv"
                r23 = 100
                r24 = 50000(0xc350, float:7.0065E-41)
                r17 = r1
                r17.<init>(r18, r19, r20, r21, r22, r23, r24)
                a.a.a.f.g.c.i = r1
                a.a.a.f.g$c$d r2 = new a.a.a.f.g$c$d
                java.lang.String r10 = "POI"
                r11 = 3
                java.lang.String r12 = "RGCPOI"
                java.lang.String r13 = "poi"
                java.lang.String r14 = "poiv"
                r16 = 5000(0x1388, float:7.006E-42)
                r9 = r2
                r9.<init>(r10, r11, r12, r13, r14, r15, r16)
                a.a.a.f.g.c.j = r2
                r3 = 4
                a.a.a.f.g$c[] r3 = new a.a.a.f.g.c[r3]
                r4 = 0
                r3[r4] = r8
                r4 = 1
                r3[r4] = r0
                r0 = 2
                r3[r0] = r1
                r0 = 3
                r3[r0] = r2
                a.a.a.f.g.c.k = r3
                return
        }

        public c(java.lang.String r1, int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, int r6, int r7) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.f253c = r3
                r0.d = r4
                r0.e = r5
                r0.f252b = r6
                r0.f = r7
                return
        }

        public /* synthetic */ c(java.lang.String r1, int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, int r6, int r7, a.a.a.f.g.a r8) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return
        }

        public static /* synthetic */ java.lang.String a(a.a.a.f.g.c r0) {
                java.lang.String r0 = r0.d
                return r0
        }

        public static /* synthetic */ java.lang.String a(a.a.a.f.g.c r0, int r1, double r2, double r4) {
                java.lang.String r0 = r0.a(r1, r2, r4)
                return r0
        }

        public static /* synthetic */ java.lang.String a(a.a.a.f.g.c r0, org.json.JSONObject r1) {
                java.lang.String r0 = r0.a(r1)
                return r0
        }

        public static /* synthetic */ void a(java.lang.StringBuffer r0, java.lang.String r1, java.lang.String r2, int r3) {
                b(r0, r1, r2, r3)
                return
        }

        public static /* synthetic */ java.lang.String b(a.a.a.f.g.c r0) {
                java.lang.String r0 = r0.e
                return r0
        }

        public static void b(java.lang.StringBuffer r2, java.lang.String r3, java.lang.String r4, int r5) {
                int r0 = r2.length()
                java.lang.String r1 = ","
                if (r0 <= 0) goto Lb
                r2.append(r1)
            Lb:
                java.lang.String r0 = "(\""
                r2.append(r0)
                r2.append(r3)
                java.lang.String r3 = "\",\""
                r2.append(r3)
                r2.append(r4)
                java.lang.String r3 = "\","
                r2.append(r3)
                r2.append(r5)
                r2.append(r1)
                long r3 = java.lang.System.currentTimeMillis()
                r0 = 86400000(0x5265c00, double:4.2687272E-316)
                long r3 = r3 / r0
                r2.append(r3)
                java.lang.String r3 = ")"
                r2.append(r3)
                return
        }

        public static /* synthetic */ int c(a.a.a.f.g.c r0) {
                int r0 = r0.f
                return r0
        }

        public static /* synthetic */ int d(a.a.a.f.g.c r0) {
                int r0 = r0.f252b
                return r0
        }

        public static a.a.a.f.g.c valueOf(java.lang.String r1) {
                java.lang.Class<a.a.a.f.g$c> r0 = a.a.a.f.g.c.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                a.a.a.f.g$c r1 = (a.a.a.f.g.c) r1
                return r1
        }

        public static a.a.a.f.g.c[] values() {
                a.a.a.f.g$c[] r0 = a.a.a.f.g.c.k
                java.lang.Object r0 = r0.clone()
                a.a.a.f.g$c[] r0 = (a.a.a.f.g.c[]) r0
                return r0
        }

        public final java.lang.String a(int r16, double r17, double r19) {
                r15 = this;
                r0 = r15
                java.util.HashSet r1 = new java.util.HashSet
                r1.<init>()
                java.lang.String r2 = a.a.a.f.g.a(r16, r17, r19)
                r1.add(r2)
                int r2 = r0.f252b
                double r3 = (double) r2
                r5 = 4609046909045748793(0x3ff69fbe76c8b439, double:1.414)
                double r3 = r3 * r5
                r5 = 0
                r6 = 1
                if (r2 <= 0) goto L41
                r2 = r5
            L1b:
                double[] r7 = a.a.a.f.g.c()
                int r7 = r7.length
                if (r2 >= r7) goto L41
                double[] r7 = a.a.a.f.g.c()
                r13 = r7[r2]
                r7 = r19
                r9 = r17
                r11 = r3
                double[] r7 = a.a.a.f.g.b(r7, r9, r11, r13)
                r8 = r7[r6]
                r10 = r7[r5]
                r7 = r16
                java.lang.String r8 = a.a.a.f.g.a(r7, r8, r10)
                r1.add(r8)
                int r2 = r2 + 1
                goto L1b
            L41:
                java.lang.StringBuffer r2 = new java.lang.StringBuffer
                r2.<init>()
                java.util.Iterator r1 = r1.iterator()
                r3 = r6
            L4b:
                boolean r4 = r1.hasNext()
                if (r4 == 0) goto L6c
                java.lang.Object r4 = r1.next()
                java.lang.String r4 = (java.lang.String) r4
                if (r3 == 0) goto L5b
                r3 = r5
                goto L60
            L5b:
                r7 = 44
                r2.append(r7)
            L60:
                java.lang.String r7 = "\""
                r2.append(r7)
                r2.append(r4)
                r2.append(r7)
                goto L4b
            L6c:
                r1 = 2
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.String r0 = r0.f253c
                r1[r5] = r0
                java.lang.String r0 = r2.toString()
                r1[r6] = r0
                java.lang.String r0 = "SELECT * FROM %s WHERE gridkey IN (%s);"
                java.lang.String r0 = java.lang.String.format(r0, r1)
                return r0
        }

        public final java.lang.String a(org.json.JSONObject r4) {
                r3 = this;
                java.util.Iterator r4 = r4.keys()
                java.lang.StringBuffer r0 = new java.lang.StringBuffer
                r0.<init>()
            L9:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L2c
                java.lang.Object r1 = r4.next()
                java.lang.String r1 = (java.lang.String) r1
                int r2 = r0.length()
                if (r2 == 0) goto L20
                java.lang.String r2 = ","
                r0.append(r2)
            L20:
                java.lang.String r2 = "\""
                r0.append(r2)
                r0.append(r1)
                r0.append(r2)
                goto L9
            L2c:
                java.util.Locale r4 = java.util.Locale.US
                r1 = 2
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.String r3 = r3.f253c
                r2 = 0
                r1[r2] = r3
                r3 = 1
                r1[r3] = r0
                java.lang.String r3 = "DELETE FROM %s WHERE gridkey IN (%s)"
                java.lang.String r3 = java.lang.String.format(r4, r3, r1)
                return r3
        }

        public abstract java.util.List<java.lang.String> a(org.json.JSONObject r1, java.lang.String r2, int r3);
    }

    static {
            r0 = 4
            double[] r0 = new double[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [4631530004285489152, 4638953906796232704, 4642120500284227584, 4644249154795601920} // fill-array
            a.a.a.f.g.f = r0
            return
    }

    public g(a.a.a.f.d r1, android.database.sqlite.SQLiteDatabase r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f247a = r1
            r1 = -1
            r0.d = r1
            r0.e = r1
            r0.f249c = r2
            r0.f248b = r3
            if (r2 == 0) goto L34
            boolean r0 = r2.isOpen()
            if (r0 == 0) goto L34
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS RGCAREA(gridkey VARCHAR(10) PRIMARY KEY, country VARCHAR(100),countrycode VARCHAR(100), province VARCHAR(100), city VARCHAR(100), citycode VARCHAR(100), district VARCHAR(100), timestamp INTEGER, version VARCHAR(50))"
            r2.execSQL(r0)     // Catch: java.lang.Exception -> L30
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS RGCROAD(_id INTEGER PRIMARY KEY AUTOINCREMENT, gridkey VARCHAR(10), street VARCHAR(100), x1 DOUBLE, y1 DOUBLE, x2 DOUBLE, y2 DOUBLE)"
            r2.execSQL(r0)     // Catch: java.lang.Exception -> L30
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS RGCSITE(_id INTEGER PRIMARY KEY AUTOINCREMENT, gridkey VARCHAR(10), street VARCHAR(100), streetnumber VARCHAR(100), x DOUBLE, y DOUBLE)"
            r2.execSQL(r0)     // Catch: java.lang.Exception -> L30
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS RGCPOI(pid VARCHAR(50) PRIMARY KEY , gridkey VARCHAR(10), name VARCHAR(100), type VARCHAR(50), x DOUBLE, y DOUBLE, rank INTEGER)"
            r2.execSQL(r0)     // Catch: java.lang.Exception -> L30
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS RGCUPDATE(gridkey VARCHAR(10), version VARCHAR(50), type INTEGER, timestamp INTEGER, PRIMARY KEY(gridkey, type))"
            r2.execSQL(r0)     // Catch: java.lang.Exception -> L30
            goto L34
        L30:
            r0 = move-exception
            r0.printStackTrace()
        L34:
            return
    }

    public static int a(int r5, int r6) {
            r0 = 100
            if (r0 <= r6) goto Ld
            r0 = -4631501856787818086(0xbfb999999999999a, double:-0.1)
            r2 = 60000(0xea60, float:8.4078E-41)
            goto L1a
        Ld:
            r0 = 500(0x1f4, float:7.0E-43)
            if (r0 <= r6) goto L17
            r0 = -4618441417868443648(0xbfe8000000000000, double:-0.75)
            r2 = 55500(0xd8cc, float:7.7772E-41)
            goto L1a
        L17:
            r0 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            r2 = 0
        L1a:
            double r3 = (double) r6
            double r0 = r0 * r3
            double r2 = (double) r2
            double r0 = r0 + r2
            int r6 = (int) r0
            int r6 = r6 + r5
            return r6
    }

    public static /* synthetic */ java.lang.String a(int r0, double r1, double r3) {
            java.lang.String r0 = b(r0, r1, r3)
            return r0
    }

    public static java.lang.String b(int r17, double r18, double r20) {
            r0 = r17
            int r1 = r0 * 5
            int r2 = r0 + 1
            char[] r2 = new char[r2]
            a.a.a.f.g$b r9 = new a.a.a.f.g$b
            r4 = 4636033603912859648(0x4056800000000000, double:90.0)
            r6 = -4587338432941916160(0xc056800000000000, double:-90.0)
            r8 = 0
            r3 = r9
            r3.<init>(r4, r6, r8)
            a.a.a.f.g$b r3 = new a.a.a.f.g$b
            r11 = 4640537203540230144(0x4066800000000000, double:180.0)
            r13 = -4582834833314545664(0xc066800000000000, double:-180.0)
            r15 = 0
            r10 = r3
            r10.<init>(r11, r13, r15)
            r5 = 1
            r6 = r5
            r7 = r6
            r8 = 0
        L2e:
            if (r6 > r1) goto L73
            if (r7 == 0) goto L36
            r10 = r18
            r12 = r3
            goto L39
        L36:
            r10 = r20
            r12 = r9
        L39:
            double r13 = a.a.a.f.g.b.a(r12)
            double r15 = a.a.a.f.g.b.b(r12)
            double r13 = r13 + r15
            r15 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r13 = r13 / r15
            int r8 = r8 << r5
            r15 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r10 = r10 * r15
            int r10 = (int) r10
            double r4 = r13 * r15
            int r4 = (int) r4
            if (r10 <= r4) goto L58
            a.a.a.f.g.b.a(r12, r13)
            r8 = r8 | 1
            goto L5b
        L58:
            a.a.a.f.g.b.b(r12, r13)
        L5b:
            int r4 = r6 % 5
            if (r4 != 0) goto L6d
            int r4 = r6 / 5
            r5 = 1
            int r4 = r4 - r5
            java.lang.String r10 = "0123456789bcdefghjkmnpqrstuvwxyz"
            char r8 = r10.charAt(r8)
            r2[r4] = r8
            r8 = 0
            goto L6e
        L6d:
            r5 = 1
        L6e:
            r7 = r7 ^ 1
            int r6 = r6 + 1
            goto L2e
        L73:
            r4 = 0
            r2[r0] = r4
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
        L7b:
            if (r4 >= r0) goto L85
            char r3 = r2[r4]
            r1.append(r3)
            int r4 = r4 + 1
            goto L7b
        L85:
            java.lang.String r0 = r1.toString()
            return r0
    }

    public static /* synthetic */ double[] b(double r0, double r2, double r4, double r6) {
            double[] r0 = c(r0, r2, r4, r6)
            return r0
    }

    public static /* synthetic */ double[] c() {
            double[] r0 = a.a.a.f.g.f
            return r0
    }

    public static double[] c(double r7, double r9, double r11, double r13) {
            r0 = 2
            double[] r0 = new double[r0]
            double r7 = java.lang.Math.toRadians(r7)
            double r9 = java.lang.Math.toRadians(r9)
            double r13 = java.lang.Math.toRadians(r13)
            double r1 = java.lang.Math.sin(r7)
            r3 = 4708606483430899712(0x415854a640000000, double:6378137.0)
            double r11 = r11 / r3
            double r3 = java.lang.Math.cos(r11)
            double r1 = r1 * r3
            double r3 = java.lang.Math.cos(r7)
            double r5 = java.lang.Math.sin(r11)
            double r3 = r3 * r5
            double r5 = java.lang.Math.cos(r13)
            double r3 = r3 * r5
            double r1 = r1 + r3
            double r1 = java.lang.Math.asin(r1)
            double r13 = java.lang.Math.sin(r13)
            double r3 = java.lang.Math.sin(r11)
            double r13 = r13 * r3
            double r3 = java.lang.Math.cos(r7)
            double r13 = r13 * r3
            double r11 = java.lang.Math.cos(r11)
            double r7 = java.lang.Math.sin(r7)
            double r3 = java.lang.Math.sin(r1)
            double r7 = r7 * r3
            double r11 = r11 - r7
            double r7 = java.lang.Math.atan2(r13, r11)
            double r9 = r9 + r7
            double r7 = java.lang.Math.toDegrees(r1)
            r11 = 0
            r0[r11] = r7
            double r7 = java.lang.Math.toDegrees(r9)
            r9 = 1
            r0[r9] = r7
            return r0
    }

    public final double a(double r5, double r7, double r9, double r11) {
            r4 = this;
            double r0 = r11 - r7
            double r2 = r9 - r5
            double r4 = java.lang.Math.toRadians(r5)
            java.lang.Math.toRadians(r7)
            double r6 = java.lang.Math.toRadians(r9)
            java.lang.Math.toRadians(r11)
            double r8 = java.lang.Math.toRadians(r0)
            double r10 = java.lang.Math.toRadians(r2)
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r10 = r10 / r0
            double r2 = java.lang.Math.sin(r10)
            double r10 = java.lang.Math.sin(r10)
            double r2 = r2 * r10
            double r4 = java.lang.Math.cos(r4)
            double r6 = java.lang.Math.cos(r6)
            double r4 = r4 * r6
            double r8 = r8 / r0
            double r6 = java.lang.Math.sin(r8)
            double r4 = r4 * r6
            double r6 = java.lang.Math.sin(r8)
            double r4 = r4 * r6
            double r2 = r2 + r4
            double r4 = java.lang.Math.sqrt(r2)
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r6 = r6 - r2
            double r6 = java.lang.Math.sqrt(r6)
            double r4 = java.lang.Math.atan2(r4, r6)
            double r4 = r4 * r0
            r6 = 4708606483430899712(0x415854a640000000, double:6378137.0)
            double r4 = r4 * r6
            return r4
    }

    public final double a(double r13, double r15, double r17, double r19, double r21, double r23) {
            r12 = this;
            double r0 = r21 - r17
            double r2 = r13 - r17
            double r4 = r0 * r2
            double r6 = r23 - r19
            double r8 = r15 - r19
            double r10 = r6 * r8
            double r4 = r4 + r10
            r10 = 0
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 > 0) goto L1b
            double r2 = r2 * r2
            double r8 = r8 * r8
            double r2 = r2 + r8
            double r0 = java.lang.Math.sqrt(r2)
            return r0
        L1b:
            double r2 = r0 * r0
            double r8 = r6 * r6
            double r2 = r2 + r8
            int r8 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r8 < 0) goto L30
            double r0 = r13 - r21
            double r0 = r0 * r0
            double r2 = r15 - r23
            double r2 = r2 * r2
            double r0 = r0 + r2
            double r0 = java.lang.Math.sqrt(r0)
            return r0
        L30:
            double r4 = r4 / r2
            double r0 = r0 * r4
            double r0 = r17 + r0
            double r6 = r6 * r4
            double r2 = r19 + r6
            double r0 = r13 - r0
            double r0 = r0 * r0
            double r2 = r2 - r15
            double r2 = r2 * r2
            double r0 = r0 + r2
            double r0 = java.lang.Math.sqrt(r0)
            return r0
    }

    public com.baidu.location.a a(double r35, double r37) {
            r34 = this;
            r0 = r34
            java.lang.String r14 = "wgs842mc"
            r15 = 4
            r12 = 5
            r13 = 3
            r10 = 2
            r16 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            r11 = 0
            a.a.a.f.g$c r1 = a.a.a.f.g.c.i     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L93
            int r2 = r0.f248b     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L93
            r3 = r35
            r5 = r37
            java.lang.String r1 = a.a.a.f.g.c.a(r1, r2, r3, r5)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L93
            android.database.sqlite.SQLiteDatabase r2 = r0.f249c     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L93
            android.database.Cursor r8 = r2.rawQuery(r1, r11)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L93
            boolean r1 = r8.moveToFirst()     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L87
            if (r1 == 0) goto L76
            r18 = r11
            r21 = r18
            r19 = r16
        L2c:
            boolean r1 = r8.isAfterLast()     // Catch: java.lang.Exception -> L73 java.lang.Throwable -> L81
            if (r1 != 0) goto L70
            java.lang.String r22 = r8.getString(r10)     // Catch: java.lang.Exception -> L73 java.lang.Throwable -> L81
            java.lang.String r23 = r8.getString(r13)     // Catch: java.lang.Exception -> L73 java.lang.Throwable -> L81
            double r6 = r8.getDouble(r12)     // Catch: java.lang.Exception -> L73 java.lang.Throwable -> L81
            double r24 = r8.getDouble(r15)     // Catch: java.lang.Exception -> L73 java.lang.Throwable -> L81
            r1 = r34
            r2 = r37
            r4 = r35
            r26 = r8
            r8 = r24
            double r1 = r1.a(r2, r4, r6, r8)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L6e
            int r3 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r3 >= 0) goto L65
            a.a.a.f.g$c r3 = a.a.a.f.g.c.i     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L6e
            int r3 = a.a.a.f.g.c.d(r3)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L6e
            double r3 = (double) r3     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L6e
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 > 0) goto L65
            r19 = r1
            r21 = r22
            r18 = r23
        L65:
            r26.moveToNext()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L6e
            r8 = r26
            goto L2c
        L6b:
            r8 = r26
            goto L98
        L6e:
            r0 = move-exception
            goto L84
        L70:
            r26 = r8
            goto L7c
        L73:
            r26 = r8
            goto L6b
        L76:
            r26 = r8
            r18 = r11
            r21 = r18
        L7c:
            if (r26 == 0) goto L9d
            r8 = r26
            goto L9a
        L81:
            r0 = move-exception
            r26 = r8
        L84:
            r11 = r26
            goto L8d
        L87:
            r26 = r8
            r18 = r11
            goto L96
        L8c:
            r0 = move-exception
        L8d:
            if (r11 == 0) goto L92
            r11.close()     // Catch: java.lang.Exception -> L92
        L92:
            throw r0
        L93:
            r8 = r11
            r18 = r8
        L96:
            r21 = r18
        L98:
            if (r8 == 0) goto L9d
        L9a:
            r8.close()     // Catch: java.lang.Exception -> L9d
        L9d:
            r8 = 0
            if (r18 != 0) goto L15f
            a.a.a.f.g$c r1 = a.a.a.f.g.c.h     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L156
            int r2 = r0.f248b     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L156
            r3 = r35
            r5 = r37
            java.lang.String r1 = a.a.a.f.g.c.a(r1, r2, r3, r5)     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L156
            android.database.sqlite.SQLiteDatabase r2 = r0.f249c     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L156
            android.database.Cursor r9 = r2.rawQuery(r1, r11)     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L156
            boolean r1 = r9.moveToFirst()     // Catch: java.lang.Throwable -> L142 java.lang.Exception -> L148
            if (r1 == 0) goto L13a
            r6 = r35
            r4 = r37
            double[] r19 = com.baidu.location.Jni.a(r6, r4, r14)     // Catch: java.lang.Throwable -> L142 java.lang.Exception -> L148
        Lc0:
            boolean r1 = r9.isAfterLast()     // Catch: java.lang.Throwable -> L142 java.lang.Exception -> L148
            if (r1 != 0) goto L13a
            java.lang.String r20 = r9.getString(r10)     // Catch: java.lang.Throwable -> L142 java.lang.Exception -> L148
            double r1 = r9.getDouble(r13)     // Catch: java.lang.Throwable -> L142 java.lang.Exception -> L148
            double r10 = r9.getDouble(r15)     // Catch: java.lang.Exception -> L136 java.lang.Throwable -> L142
            double[] r1 = com.baidu.location.Jni.a(r1, r10, r14)     // Catch: java.lang.Exception -> L136 java.lang.Throwable -> L142
            double r2 = r9.getDouble(r12)     // Catch: java.lang.Exception -> L136 java.lang.Throwable -> L142
            r10 = 6
            double r10 = r9.getDouble(r10)     // Catch: java.lang.Exception -> L136 java.lang.Throwable -> L142
            double[] r2 = com.baidu.location.Jni.a(r2, r10, r14)     // Catch: java.lang.Exception -> L136 java.lang.Throwable -> L142
            r10 = r19[r8]     // Catch: java.lang.Exception -> L136 java.lang.Throwable -> L142
            r3 = 1
            r24 = r19[r3]     // Catch: java.lang.Exception -> L136 java.lang.Throwable -> L142
            r26 = r1[r8]     // Catch: java.lang.Exception -> L136 java.lang.Throwable -> L142
            r28 = r1[r3]     // Catch: java.lang.Exception -> L136 java.lang.Throwable -> L142
            r30 = r2[r8]     // Catch: java.lang.Exception -> L136 java.lang.Throwable -> L142
            r32 = r2[r3]     // Catch: java.lang.Exception -> L136 java.lang.Throwable -> L142
            r1 = r34
            r2 = r10
            r4 = r24
            r6 = r26
            r10 = r8
            r24 = r9
            r8 = r28
            r15 = 0
            r22 = 2
            r10 = r30
            r23 = r12
            r26 = r13
            r12 = r32
            double r1 = r1.a(r2, r4, r6, r8, r10, r12)     // Catch: java.lang.Throwable -> L134 java.lang.Exception -> L14b
            int r3 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r3 >= 0) goto L11e
            a.a.a.f.g$c r3 = a.a.a.f.g.c.h     // Catch: java.lang.Throwable -> L134 java.lang.Exception -> L14b
            int r3 = a.a.a.f.g.c.d(r3)     // Catch: java.lang.Throwable -> L134 java.lang.Exception -> L14b
            double r3 = (double) r3
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 > 0) goto L11e
            r16 = r1
            r21 = r20
        L11e:
            r24.moveToNext()     // Catch: java.lang.Exception -> L131 java.lang.Throwable -> L134
            r6 = r35
            r4 = r37
            r11 = r15
            r10 = r22
            r12 = r23
            r9 = r24
            r13 = r26
            r8 = 0
            r15 = 4
            goto Lc0
        L131:
            r9 = r24
            goto L159
        L134:
            r0 = move-exception
            goto L145
        L136:
            r24 = r9
            r15 = 0
            goto L14b
        L13a:
            r24 = r9
            r15 = r11
            if (r24 == 0) goto L160
            r9 = r24
            goto L15b
        L142:
            r0 = move-exception
            r24 = r9
        L145:
            r11 = r24
            goto L150
        L148:
            r24 = r9
            r15 = r11
        L14b:
            r11 = r24
            goto L158
        L14e:
            r0 = move-exception
            r15 = r11
        L150:
            if (r11 == 0) goto L155
            r11.close()     // Catch: java.lang.Exception -> L155
        L155:
            throw r0
        L156:
            r15 = r11
            r11 = r15
        L158:
            r9 = r11
        L159:
            if (r9 == 0) goto L160
        L15b:
            r9.close()     // Catch: java.lang.Exception -> L160
            goto L160
        L15f:
            r15 = r11
        L160:
            a.a.a.f.g$c r2 = a.a.a.f.g.c.g
            int r3 = r0.f248b
            r4 = r35
            r6 = r37
            java.lang.String r1 = a.a.a.f.g.c.a(r2, r3, r4, r6)
            android.database.sqlite.SQLiteDatabase r0 = r0.f249c     // Catch: java.lang.Throwable -> L1d8 java.lang.Exception -> L1e0
            android.database.Cursor r11 = r0.rawQuery(r1, r15)     // Catch: java.lang.Throwable -> L1d8 java.lang.Exception -> L1e0
            boolean r0 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L1d0 java.lang.Exception -> L1d2
            if (r0 == 0) goto L1c4
            boolean r0 = r11.isAfterLast()     // Catch: java.lang.Throwable -> L1d0 java.lang.Exception -> L1d2
            if (r0 != 0) goto L1c4
            java.lang.String r0 = "country"
            int r0 = r11.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L1d0 java.lang.Exception -> L1d2
            java.lang.String r0 = r11.getString(r0)     // Catch: java.lang.Throwable -> L1d0 java.lang.Exception -> L1d2
            java.lang.String r1 = "countrycode"
            int r1 = r11.getColumnIndex(r1)     // Catch: java.lang.Exception -> L1c2 java.lang.Throwable -> L1d0
            java.lang.String r1 = r11.getString(r1)     // Catch: java.lang.Exception -> L1c2 java.lang.Throwable -> L1d0
            java.lang.String r2 = "province"
            int r2 = r11.getColumnIndex(r2)     // Catch: java.lang.Exception -> L1c0 java.lang.Throwable -> L1d0
            java.lang.String r2 = r11.getString(r2)     // Catch: java.lang.Exception -> L1c0 java.lang.Throwable -> L1d0
            java.lang.String r3 = "city"
            int r3 = r11.getColumnIndex(r3)     // Catch: java.lang.Exception -> L1be java.lang.Throwable -> L1d0
            java.lang.String r3 = r11.getString(r3)     // Catch: java.lang.Exception -> L1be java.lang.Throwable -> L1d0
            java.lang.String r4 = "citycode"
            int r4 = r11.getColumnIndex(r4)     // Catch: java.lang.Exception -> L1bc java.lang.Throwable -> L1d0
            java.lang.String r4 = r11.getString(r4)     // Catch: java.lang.Exception -> L1bc java.lang.Throwable -> L1d0
            java.lang.String r5 = "district"
            int r5 = r11.getColumnIndex(r5)     // Catch: java.lang.Throwable -> L1d0 java.lang.Exception -> L1e6
            java.lang.String r5 = r11.getString(r5)     // Catch: java.lang.Throwable -> L1d0 java.lang.Exception -> L1e6
            r15 = r0
            goto L1c9
        L1bc:
            r4 = r15
            goto L1e6
        L1be:
            r3 = r15
            goto L1d6
        L1c0:
            r2 = r15
            goto L1d5
        L1c2:
            r1 = r15
            goto L1d4
        L1c4:
            r1 = r15
            r2 = r1
            r3 = r2
            r4 = r3
            r5 = r4
        L1c9:
            if (r11 == 0) goto L1ce
            r0 = r15
            r15 = r5
            goto L1e8
        L1ce:
            r11 = r5
            goto L1ed
        L1d0:
            r0 = move-exception
            goto L1da
        L1d2:
            r0 = r15
            r1 = r0
        L1d4:
            r2 = r1
        L1d5:
            r3 = r2
        L1d6:
            r4 = r3
            goto L1e6
        L1d8:
            r0 = move-exception
            r11 = r15
        L1da:
            if (r11 == 0) goto L1df
            r11.close()     // Catch: java.lang.Exception -> L1df
        L1df:
            throw r0
        L1e0:
            r0 = r15
            r1 = r0
            r2 = r1
            r3 = r2
            r4 = r3
            r11 = r4
        L1e6:
            if (r11 == 0) goto L1eb
        L1e8:
            r11.close()     // Catch: java.lang.Exception -> L1eb
        L1eb:
            r11 = r15
            r15 = r0
        L1ed:
            if (r15 == 0) goto L1ff
            java.lang.String r0 = new java.lang.String
            byte[] r5 = r15.getBytes()
            r6 = 0
            byte[] r5 = android.util.Base64.decode(r5, r6)
            r0.<init>(r5)
            r15 = r0
            goto L200
        L1ff:
            r6 = 0
        L200:
            if (r1 == 0) goto L210
            java.lang.String r0 = new java.lang.String
            byte[] r1 = r1.getBytes()
            byte[] r1 = android.util.Base64.decode(r1, r6)
            r0.<init>(r1)
            r1 = r0
        L210:
            if (r2 == 0) goto L220
            java.lang.String r0 = new java.lang.String
            byte[] r2 = r2.getBytes()
            byte[] r2 = android.util.Base64.decode(r2, r6)
            r0.<init>(r2)
            r2 = r0
        L220:
            if (r3 == 0) goto L230
            java.lang.String r0 = new java.lang.String
            byte[] r3 = r3.getBytes()
            byte[] r3 = android.util.Base64.decode(r3, r6)
            r0.<init>(r3)
            r3 = r0
        L230:
            if (r4 == 0) goto L240
            java.lang.String r0 = new java.lang.String
            byte[] r4 = r4.getBytes()
            byte[] r4 = android.util.Base64.decode(r4, r6)
            r0.<init>(r4)
            r4 = r0
        L240:
            if (r11 == 0) goto L250
            java.lang.String r0 = new java.lang.String
            byte[] r5 = r11.getBytes()
            byte[] r5 = android.util.Base64.decode(r5, r6)
            r0.<init>(r5)
            r11 = r0
        L250:
            if (r21 == 0) goto L260
            java.lang.String r0 = new java.lang.String
            byte[] r5 = r21.getBytes()
            byte[] r5 = android.util.Base64.decode(r5, r6)
            r0.<init>(r5)
            goto L262
        L260:
            r0 = r21
        L262:
            if (r18 == 0) goto L272
            java.lang.String r5 = new java.lang.String
            byte[] r7 = r18.getBytes()
            byte[] r6 = android.util.Base64.decode(r7, r6)
            r5.<init>(r6)
            goto L274
        L272:
            r5 = r18
        L274:
            com.baidu.location.a$a r6 = new com.baidu.location.a$a
            r6.<init>()
            r6.d(r15)
            r6.e(r1)
            r6.g(r2)
            r6.b(r3)
            r6.c(r4)
            r6.f(r11)
            r6.h(r0)
            r6.i(r5)
            com.baidu.location.a r0 = r6.a()
            return r0
    }

    public org.json.JSONObject a() {
            r21 = this;
            r0 = r21
            java.lang.String r1 = "addr"
            java.lang.String r2 = "poi"
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>()
            java.lang.StringBuffer r5 = new java.lang.StringBuffer
            r5.<init>()
            long r6 = java.lang.System.currentTimeMillis()
            r8 = 86400000(0x5265c00, double:4.2687272E-316)
            long r6 = r6 / r8
            int r6 = (int) r6
            java.lang.String r7 = "SELECT * FROM RGCUPDATE WHERE type=%d AND %d > timestamp+%d ORDER BY gridkey"
            android.database.sqlite.SQLiteDatabase r9 = r0.f249c     // Catch: java.lang.Throwable -> L1e0 java.lang.Exception -> L1ee
            r12 = 0
            if (r9 == 0) goto L181
            boolean r9 = r9.isOpen()     // Catch: java.lang.Throwable -> L1e0 java.lang.Exception -> L1ee
            if (r9 == 0) goto L181
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L1e0 java.lang.Exception -> L1ee
            r9.<init>()     // Catch: java.lang.Throwable -> L1e0 java.lang.Exception -> L1ee
            org.json.JSONArray r13 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L1e0 java.lang.Exception -> L1ee
            r13.<init>()     // Catch: java.lang.Throwable -> L1e0 java.lang.Exception -> L1ee
            org.json.JSONArray r14 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L1e0 java.lang.Exception -> L1ee
            r14.<init>()     // Catch: java.lang.Throwable -> L1e0 java.lang.Exception -> L1ee
            org.json.JSONArray r15 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L1e0 java.lang.Exception -> L1ee
            r15.<init>()     // Catch: java.lang.Throwable -> L1e0 java.lang.Exception -> L1ee
            android.database.sqlite.SQLiteDatabase r8 = r0.f249c     // Catch: java.lang.Throwable -> L1e0 java.lang.Exception -> L1ee
            r10 = 3
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch: java.lang.Throwable -> L1e0 java.lang.Exception -> L1ee
            java.lang.Integer r19 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L1e0 java.lang.Exception -> L1ee
            r11[r12] = r19     // Catch: java.lang.Throwable -> L1e0 java.lang.Exception -> L1ee
            java.lang.Integer r19 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L1e0 java.lang.Exception -> L1ee
            r18 = 1
            r11[r18] = r19     // Catch: java.lang.Throwable -> L1e0 java.lang.Exception -> L1ee
            a.a.a.f.d r12 = r0.f247a     // Catch: java.lang.Throwable -> L1e0 java.lang.Exception -> L1ee
            a.a.a.f.c r12 = r12.c()     // Catch: java.lang.Throwable -> L1e0 java.lang.Exception -> L1ee
            int r12 = r12.b()     // Catch: java.lang.Throwable -> L1e0 java.lang.Exception -> L1ee
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L1e0 java.lang.Exception -> L1ee
            r17 = 2
            r11[r17] = r12     // Catch: java.lang.Throwable -> L1e0 java.lang.Exception -> L1ee
            java.lang.String r11 = java.lang.String.format(r7, r11)     // Catch: java.lang.Throwable -> L1e0 java.lang.Exception -> L1ee
            r12 = 0
            android.database.Cursor r8 = r8.rawQuery(r11, r12)     // Catch: java.lang.Throwable -> L1e0 java.lang.Exception -> L1ee
            android.database.sqlite.SQLiteDatabase r11 = r0.f249c     // Catch: java.lang.Throwable -> L179 java.lang.Exception -> L17d
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch: java.lang.Throwable -> L179 java.lang.Exception -> L17d
            r12 = 1
            java.lang.Integer r18 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L179 java.lang.Exception -> L17d
            r19 = 0
            r10[r19] = r18     // Catch: java.lang.Throwable -> L179 java.lang.Exception -> L17d
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L179 java.lang.Exception -> L17d
            r10[r12] = r6     // Catch: java.lang.Throwable -> L179 java.lang.Exception -> L17d
            a.a.a.f.d r6 = r0.f247a     // Catch: java.lang.Throwable -> L179 java.lang.Exception -> L17d
            a.a.a.f.c r6 = r6.c()     // Catch: java.lang.Throwable -> L179 java.lang.Exception -> L17d
            int r6 = r6.e()     // Catch: java.lang.Throwable -> L179 java.lang.Exception -> L17d
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L179 java.lang.Exception -> L17d
            r12 = 2
            r10[r12] = r6     // Catch: java.lang.Throwable -> L179 java.lang.Exception -> L17d
            java.lang.String r6 = java.lang.String.format(r7, r10)     // Catch: java.lang.Throwable -> L179 java.lang.Exception -> L17d
            r12 = 0
            android.database.Cursor r6 = r11.rawQuery(r6, r12)     // Catch: java.lang.Throwable -> L179 java.lang.Exception -> L17d
            boolean r7 = r8.moveToFirst()     // Catch: java.lang.Throwable -> L176 java.lang.Exception -> L1de
            java.lang.String r10 = ","
            java.lang.String r11 = "\""
            if (r7 == 0) goto Lf2
            java.util.HashSet r7 = new java.util.HashSet     // Catch: java.lang.Throwable -> L176 java.lang.Exception -> L1de
            r7.<init>()     // Catch: java.lang.Throwable -> L176 java.lang.Exception -> L1de
        La9:
            boolean r16 = r8.isAfterLast()     // Catch: java.lang.Throwable -> L176 java.lang.Exception -> L1de
            if (r16 != 0) goto Ldc
            r12 = 0
            java.lang.String r0 = r8.getString(r12)     // Catch: java.lang.Throwable -> L176 java.lang.Exception -> L1de
            r20 = r2
            r12 = 1
            java.lang.String r2 = r8.getString(r12)     // Catch: java.lang.Exception -> L172 java.lang.Throwable -> L176
            r14.put(r0)     // Catch: java.lang.Exception -> L172 java.lang.Throwable -> L176
            r7.add(r2)     // Catch: java.lang.Exception -> L172 java.lang.Throwable -> L176
            int r2 = r5.length()     // Catch: java.lang.Exception -> L172 java.lang.Throwable -> L176
            if (r2 <= 0) goto Lca
            r5.append(r10)     // Catch: java.lang.Exception -> L172 java.lang.Throwable -> L176
        Lca:
            r5.append(r11)     // Catch: java.lang.Exception -> L172 java.lang.Throwable -> L176
            r5.append(r0)     // Catch: java.lang.Exception -> L172 java.lang.Throwable -> L176
            r5.append(r11)     // Catch: java.lang.Exception -> L172 java.lang.Throwable -> L176
            r8.moveToNext()     // Catch: java.lang.Exception -> L172 java.lang.Throwable -> L176
            r12 = 0
            r0 = r21
            r2 = r20
            goto La9
        Ldc:
            r20 = r2
            int r0 = r7.size()     // Catch: java.lang.Exception -> L172 java.lang.Throwable -> L176
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch: java.lang.Exception -> L172 java.lang.Throwable -> L176
            r7.toArray(r2)     // Catch: java.lang.Exception -> L172 java.lang.Throwable -> L176
            r7 = 0
        Le8:
            if (r7 >= r0) goto Lf4
            r12 = r2[r7]     // Catch: java.lang.Exception -> L172 java.lang.Throwable -> L176
            r15.put(r12)     // Catch: java.lang.Exception -> L172 java.lang.Throwable -> L176
            int r7 = r7 + 1
            goto Le8
        Lf2:
            r20 = r2
        Lf4:
            boolean r0 = r6.moveToFirst()     // Catch: java.lang.Exception -> L172 java.lang.Throwable -> L176
            if (r0 == 0) goto L13f
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Exception -> L172 java.lang.Throwable -> L176
            r0.<init>()     // Catch: java.lang.Exception -> L172 java.lang.Throwable -> L176
        Lff:
            boolean r2 = r6.isAfterLast()     // Catch: java.lang.Exception -> L172 java.lang.Throwable -> L176
            if (r2 != 0) goto L12b
            r2 = 0
            java.lang.String r7 = r6.getString(r2)     // Catch: java.lang.Exception -> L172 java.lang.Throwable -> L176
            r2 = 1
            java.lang.String r12 = r6.getString(r2)     // Catch: java.lang.Exception -> L172 java.lang.Throwable -> L176
            r9.put(r7)     // Catch: java.lang.Exception -> L172 java.lang.Throwable -> L176
            r0.add(r12)     // Catch: java.lang.Exception -> L172 java.lang.Throwable -> L176
            int r2 = r4.length()     // Catch: java.lang.Exception -> L172 java.lang.Throwable -> L176
            if (r2 <= 0) goto L11e
            r4.append(r10)     // Catch: java.lang.Exception -> L172 java.lang.Throwable -> L176
        L11e:
            r4.append(r11)     // Catch: java.lang.Exception -> L172 java.lang.Throwable -> L176
            r4.append(r7)     // Catch: java.lang.Exception -> L172 java.lang.Throwable -> L176
            r4.append(r11)     // Catch: java.lang.Exception -> L172 java.lang.Throwable -> L176
            r6.moveToNext()     // Catch: java.lang.Exception -> L172 java.lang.Throwable -> L176
            goto Lff
        L12b:
            int r2 = r0.size()     // Catch: java.lang.Exception -> L172 java.lang.Throwable -> L176
            java.lang.String[] r7 = new java.lang.String[r2]     // Catch: java.lang.Exception -> L172 java.lang.Throwable -> L176
            r0.toArray(r7)     // Catch: java.lang.Exception -> L172 java.lang.Throwable -> L176
            r0 = 0
        L135:
            if (r0 >= r2) goto L13f
            r10 = r7[r0]     // Catch: java.lang.Exception -> L172 java.lang.Throwable -> L176
            r13.put(r10)     // Catch: java.lang.Exception -> L172 java.lang.Throwable -> L176
            int r0 = r0 + 1
            goto L135
        L13f:
            int r0 = r14.length()     // Catch: java.lang.Exception -> L172 java.lang.Throwable -> L176
            java.lang.String r2 = "ver"
            java.lang.String r7 = "gk"
            if (r0 == 0) goto L157
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L172 java.lang.Throwable -> L176
            r0.<init>()     // Catch: java.lang.Exception -> L172 java.lang.Throwable -> L176
            r0.put(r7, r14)     // Catch: java.lang.Exception -> L172 java.lang.Throwable -> L176
            r0.put(r2, r15)     // Catch: java.lang.Exception -> L172 java.lang.Throwable -> L176
            r3.put(r1, r0)     // Catch: java.lang.Exception -> L172 java.lang.Throwable -> L176
        L157:
            int r0 = r9.length()     // Catch: java.lang.Exception -> L172 java.lang.Throwable -> L176
            if (r0 == 0) goto L16e
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L172 java.lang.Throwable -> L176
            r0.<init>()     // Catch: java.lang.Exception -> L172 java.lang.Throwable -> L176
            r0.put(r7, r9)     // Catch: java.lang.Exception -> L172 java.lang.Throwable -> L176
            r0.put(r2, r13)     // Catch: java.lang.Exception -> L172 java.lang.Throwable -> L176
            r2 = r20
            r3.put(r2, r0)     // Catch: java.lang.Throwable -> L176 java.lang.Exception -> L1de
            goto L170
        L16e:
            r2 = r20
        L170:
            r12 = r6
            goto L183
        L172:
            r2 = r20
            goto L1de
        L176:
            r0 = move-exception
            goto L1e3
        L179:
            r0 = move-exception
            r6 = 0
            goto L1e3
        L17d:
            r12 = r8
            r6 = 0
            goto L1f0
        L181:
            r8 = 0
            r12 = 0
        L183:
            int r0 = r5.length()     // Catch: java.lang.Throwable -> L1da java.lang.Exception -> L1dd
            java.lang.String r6 = "UPDATE RGCUPDATE SET timestamp=timestamp+1 WHERE type = %d AND gridkey IN (%s)"
            if (r0 <= 0) goto L1ac
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.lang.Throwable -> L1da java.lang.Exception -> L1dd
            r7 = 2
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L1da java.lang.Exception -> L1dd
            r7 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L1da java.lang.Exception -> L1dd
            r9[r7] = r10     // Catch: java.lang.Throwable -> L1da java.lang.Exception -> L1dd
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L1da java.lang.Exception -> L1dd
            r7 = 1
            r9[r7] = r5     // Catch: java.lang.Throwable -> L1da java.lang.Exception -> L1dd
            java.lang.String r0 = java.lang.String.format(r0, r6, r9)     // Catch: java.lang.Throwable -> L1da java.lang.Exception -> L1dd
            r5 = r21
            android.database.sqlite.SQLiteDatabase r7 = r5.f249c     // Catch: java.lang.Throwable -> L1da java.lang.Exception -> L1dd
            if (r7 == 0) goto L1ae
            r7.execSQL(r0)     // Catch: java.lang.Throwable -> L1da java.lang.Exception -> L1dd
            goto L1ae
        L1ac:
            r5 = r21
        L1ae:
            int r0 = r4.length()     // Catch: java.lang.Throwable -> L1da java.lang.Exception -> L1dd
            if (r0 <= 0) goto L1d2
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.lang.Throwable -> L1da java.lang.Exception -> L1dd
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L1da java.lang.Exception -> L1dd
            r9 = 1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L1da java.lang.Exception -> L1dd
            r11 = 0
            r7[r11] = r10     // Catch: java.lang.Throwable -> L1da java.lang.Exception -> L1dd
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L1da java.lang.Exception -> L1dd
            r7[r9] = r4     // Catch: java.lang.Throwable -> L1da java.lang.Exception -> L1dd
            java.lang.String r0 = java.lang.String.format(r0, r6, r7)     // Catch: java.lang.Throwable -> L1da java.lang.Exception -> L1dd
            android.database.sqlite.SQLiteDatabase r4 = r5.f249c     // Catch: java.lang.Throwable -> L1da java.lang.Exception -> L1dd
            if (r4 == 0) goto L1d2
            r4.execSQL(r0)     // Catch: java.lang.Throwable -> L1da java.lang.Exception -> L1dd
        L1d2:
            if (r8 == 0) goto L1d7
            r8.close()     // Catch: java.lang.Exception -> L1d7
        L1d7:
            if (r12 == 0) goto L1fb
            goto L1f8
        L1da:
            r0 = move-exception
            r6 = r12
            goto L1e3
        L1dd:
            r6 = r12
        L1de:
            r12 = r8
            goto L1f0
        L1e0:
            r0 = move-exception
            r6 = 0
            r8 = 0
        L1e3:
            if (r8 == 0) goto L1e8
            r8.close()     // Catch: java.lang.Exception -> L1e8
        L1e8:
            if (r6 == 0) goto L1ed
            r6.close()     // Catch: java.lang.Exception -> L1ed
        L1ed:
            throw r0
        L1ee:
            r6 = 0
            r12 = 0
        L1f0:
            if (r12 == 0) goto L1f5
            r12.close()     // Catch: java.lang.Exception -> L1f5
        L1f5:
            if (r6 == 0) goto L1fb
            r12 = r6
        L1f8:
            r12.close()     // Catch: java.lang.Exception -> L1fb
        L1fb:
            boolean r0 = r3.has(r2)
            if (r0 != 0) goto L208
            boolean r0 = r3.has(r1)
            if (r0 != 0) goto L208
            r3 = 0
        L208:
            return r3
    }

    public void a(org.json.JSONObject r9) {
            r8 = this;
            android.database.sqlite.SQLiteDatabase r0 = r8.f249c
            if (r0 == 0) goto L87
            boolean r0 = r0.isOpen()
            if (r0 == 0) goto L87
            android.database.sqlite.SQLiteDatabase r0 = r8.f249c     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7d
            r0.beginTransaction()     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7d
            a.a.a.f.g$c[] r0 = a.a.a.f.g.c.values()     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7d
            int r1 = r0.length     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7d
            r2 = 0
        L15:
            if (r2 >= r1) goto L70
            r3 = r0[r2]     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7d
            java.lang.String r4 = a.a.a.f.g.c.a(r3)     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7d
            boolean r4 = r9.has(r4)     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7d
            if (r4 == 0) goto L6d
            java.lang.String r4 = a.a.a.f.g.c.b(r3)     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7d
            boolean r4 = r9.has(r4)     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7d
            if (r4 == 0) goto L36
            java.lang.String r4 = a.a.a.f.g.c.b(r3)     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7d
            java.lang.String r4 = r9.getString(r4)     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7d
            goto L38
        L36:
            java.lang.String r4 = ""
        L38:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7d
            r5.<init>()     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7d
            java.lang.String r6 = a.a.a.f.g.c.a(r3)     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7d
            org.json.JSONObject r6 = r9.getJSONObject(r6)     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7d
            java.lang.String r7 = a.a.a.f.g.c.a(r3, r6)     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7d
            r5.add(r7)     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7d
            int r7 = a.a.a.f.g.c.c(r3)     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7d
            java.util.List r3 = r3.a(r6, r4, r7)     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7d
            r5.addAll(r3)     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7d
            java.util.Iterator r3 = r5.iterator()     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7d
        L5b:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7d
            if (r4 == 0) goto L6d
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7d
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7d
            android.database.sqlite.SQLiteDatabase r5 = r8.f249c     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7d
            r5.execSQL(r4)     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7d
            goto L5b
        L6d:
            int r2 = r2 + 1
            goto L15
        L70:
            android.database.sqlite.SQLiteDatabase r9 = r8.f249c     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7d
            r9.setTransactionSuccessful()     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7d
            r9 = -1
            r8.d = r9     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7d
            r8.e = r9     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L7d
        L7a:
            android.database.sqlite.SQLiteDatabase r8 = r8.f249c     // Catch: java.lang.Exception -> L87
            goto L84
        L7d:
            r9 = move-exception
            android.database.sqlite.SQLiteDatabase r8 = r8.f249c     // Catch: java.lang.Exception -> L83
            r8.endTransaction()     // Catch: java.lang.Exception -> L83
        L83:
            throw r9
        L84:
            r8.endTransaction()     // Catch: java.lang.Exception -> L87
        L87:
            return
    }

    public java.util.List<com.baidu.location.j> b(double r26, double r28) {
            r25 = this;
            r0 = r25
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            a.a.a.f.g$c r1 = a.a.a.f.g.c.j
            int r2 = r0.f248b
            r3 = r26
            r5 = r28
            java.lang.String r1 = a.a.a.f.g.c.a(r1, r2, r3, r5)
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r0.f249c     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La7
            android.database.Cursor r11 = r3.rawQuery(r1, r2)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La7
            boolean r1 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L9a java.lang.Exception -> L9d
            if (r1 == 0) goto L97
            r12 = 0
            r13 = r2
            r14 = r12
        L23:
            boolean r1 = r11.isAfterLast()     // Catch: java.lang.Throwable -> L9a java.lang.Exception -> L9e
            if (r1 != 0) goto L96
            java.lang.String r15 = r11.getString(r12)     // Catch: java.lang.Throwable -> L9a java.lang.Exception -> L9e
            r1 = 2
            java.lang.String r16 = r11.getString(r1)     // Catch: java.lang.Throwable -> L9a java.lang.Exception -> L9e
            r1 = 4
            double r8 = r11.getDouble(r1)     // Catch: java.lang.Throwable -> L9a java.lang.Exception -> L9e
            r1 = 5
            double r6 = r11.getDouble(r1)     // Catch: java.lang.Throwable -> L9a java.lang.Exception -> L9e
            r1 = 6
            int r4 = r11.getInt(r1)     // Catch: java.lang.Throwable -> L9a java.lang.Exception -> L9e
            r1 = r25
            r2 = r28
            r17 = r4
            r4 = r26
            double r1 = r1.a(r2, r4, r6, r8)     // Catch: java.lang.Throwable -> L9a java.lang.Exception -> L9e
            a.a.a.f.g$c r3 = a.a.a.f.g.c.j     // Catch: java.lang.Throwable -> L9a java.lang.Exception -> L9e
            int r3 = a.a.a.f.g.c.d(r3)     // Catch: java.lang.Throwable -> L9a java.lang.Exception -> L9e
            double r3 = (double) r3     // Catch: java.lang.Throwable -> L9a java.lang.Exception -> L9e
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 >= 0) goto L92
            com.baidu.location.j r3 = new com.baidu.location.j     // Catch: java.lang.Throwable -> L9a java.lang.Exception -> L9e
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L9a java.lang.Exception -> L9e
            byte[] r5 = r15.getBytes()     // Catch: java.lang.Throwable -> L9a java.lang.Exception -> L9e
            byte[] r5 = android.util.Base64.decode(r5, r12)     // Catch: java.lang.Throwable -> L9a java.lang.Exception -> L9e
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L9a java.lang.Exception -> L9e
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> L9a java.lang.Exception -> L9e
            byte[] r6 = r16.getBytes()     // Catch: java.lang.Throwable -> L9a java.lang.Exception -> L9e
            byte[] r6 = android.util.Base64.decode(r6, r12)     // Catch: java.lang.Throwable -> L9a java.lang.Exception -> L9e
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L9a java.lang.Exception -> L9e
            r21 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.String r23 = ""
            java.lang.String r24 = ""
            r18 = r3
            r19 = r4
            r20 = r5
            r18.<init>(r19, r20, r21, r23, r24)     // Catch: java.lang.Throwable -> L9a java.lang.Exception -> L9e
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L9a java.lang.Exception -> L9e
            int r1 = java.lang.Math.round(r1)     // Catch: java.lang.Throwable -> L9a java.lang.Exception -> L9e
            r2 = r17
            int r1 = a(r2, r1)     // Catch: java.lang.Throwable -> L9a java.lang.Exception -> L9e
            if (r1 <= r14) goto L92
            r14 = r1
            r13 = r3
        L92:
            r11.moveToNext()     // Catch: java.lang.Throwable -> L9a java.lang.Exception -> La9
            goto L23
        L96:
            r2 = r13
        L97:
            if (r11 == 0) goto Laf
            goto Lac
        L9a:
            r0 = move-exception
            r2 = r11
            goto La1
        L9d:
            r13 = r2
        L9e:
            r2 = r11
            goto La8
        La0:
            r0 = move-exception
        La1:
            if (r2 == 0) goto La6
            r2.close()     // Catch: java.lang.Exception -> La6
        La6:
            throw r0
        La7:
            r13 = r2
        La8:
            r11 = r2
        La9:
            r2 = r13
            if (r11 == 0) goto Laf
        Lac:
            r11.close()     // Catch: java.lang.Exception -> Laf
        Laf:
            if (r2 == 0) goto Lb4
            r10.add(r2)
        Lb4:
            return r10
    }

    public boolean b() {
            r6 = this;
            a.a.a.f.d r0 = r6.f247a
            a.a.a.f.c r0 = r0.c()
            boolean r0 = r0.n()
            r1 = 0
            if (r0 == 0) goto L6c
            int r0 = r6.e
            r2 = -1
            if (r0 != r2) goto L6c
            int r0 = r6.d
            if (r0 != r2) goto L6c
            android.database.sqlite.SQLiteDatabase r0 = r6.f249c
            if (r0 == 0) goto L6c
            boolean r0 = r0.isOpen()
            if (r0 == 0) goto L6c
            r0 = 0
            android.database.sqlite.SQLiteDatabase r2 = r6.f249c     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L60
            java.lang.String r3 = "SELECT COUNT(*) FROM RGCSITE;"
            android.database.Cursor r2 = r2.rawQuery(r3, r0)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L60
            r2.moveToFirst()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4f
            int r3 = r2.getInt(r1)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4f
            r6.e = r3     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4f
            android.database.sqlite.SQLiteDatabase r3 = r6.f249c     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4f
            java.lang.String r4 = "SELECT COUNT(*) FROM RGCAREA;"
            android.database.Cursor r0 = r3.rawQuery(r4, r0)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4f
            r0.moveToFirst()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4f
            int r3 = r0.getInt(r1)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4f
            r6.d = r3     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4f
            if (r2 == 0) goto L48
            r2.close()     // Catch: java.lang.Exception -> L48
        L48:
            if (r0 == 0) goto L6c
            goto L69
        L4b:
            r6 = move-exception
            r1 = r0
            r0 = r2
            goto L55
        L4f:
            r5 = r2
            r2 = r0
            r0 = r5
            goto L61
        L53:
            r6 = move-exception
            r1 = r0
        L55:
            if (r0 == 0) goto L5a
            r0.close()     // Catch: java.lang.Exception -> L5a
        L5a:
            if (r1 == 0) goto L5f
            r1.close()     // Catch: java.lang.Exception -> L5f
        L5f:
            throw r6
        L60:
            r2 = r0
        L61:
            if (r0 == 0) goto L66
            r0.close()     // Catch: java.lang.Exception -> L66
        L66:
            if (r2 == 0) goto L6c
            r0 = r2
        L69:
            r0.close()     // Catch: java.lang.Exception -> L6c
        L6c:
            int r0 = r6.e
            if (r0 != 0) goto L76
            int r6 = r6.d
            if (r6 != 0) goto L76
            r6 = 1
            return r6
        L76:
            return r1
    }
}
