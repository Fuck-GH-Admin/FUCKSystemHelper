package a.a.a.b;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public android.content.SharedPreferences f18a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.util.Deque<java.lang.String> f20c;
    public java.util.Deque<java.lang.String> d;
    public java.util.Deque<java.lang.String> e;
    public int f;
    public int g;
    public int h;
    public int i;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static a.a.a.b.f f21a;

        static {
                a.a.a.b.f r0 = new a.a.a.b.f
                r0.<init>()
                a.a.a.b.f.a.f21a = r0
                return
        }

        public static /* synthetic */ a.a.a.b.f a() {
                a.a.a.b.f r0 = a.a.a.b.f.a.f21a
                return r0
        }
    }

    public f() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f18a = r0
            r0 = 0
            r1.f19b = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1.f20c = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1.d = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1.e = r0
            r0 = 5
            r1.f = r0
            r1.g = r0
            r0 = 1
            r1.h = r0
            r1.i = r0
            return
    }

    public static a.a.a.b.f c() {
            a.a.a.b.f r0 = a.a.a.b.f.a.a()
            return r0
    }

    public synchronized java.lang.String a() {
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.i     // Catch: java.lang.Throwable -> Lb
            int r1 = r2.h     // Catch: java.lang.Throwable -> Lb
            java.lang.String r0 = r2.a(r0, r1)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r2)
            return r0
        Lb:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public final java.lang.String a(int r5, int r6) {
            r4 = this;
            r0 = 1
            java.lang.String r1 = ""
            if (r5 != r0) goto L23
            java.util.Deque<java.lang.String> r5 = r4.e
            java.lang.String r5 = r4.b(r5)
            boolean r2 = r1.equals(r5)
            if (r2 != 0) goto L23
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "&ll_pre="
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            goto L24
        L23:
            r5 = r1
        L24:
            if (r6 != r0) goto L66
            java.util.Deque<java.lang.String> r6 = r4.f20c
            java.lang.String r6 = r4.a(r6)
            boolean r0 = r1.equals(r6)
            if (r0 != 0) goto L46
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r5 = "&cl_pre="
            r0.append(r5)
            r0.append(r6)
            java.lang.String r5 = r0.toString()
        L46:
            java.util.Deque<java.lang.String> r6 = r4.d
            java.lang.String r4 = r4.a(r6)
            boolean r6 = r1.equals(r4)
            if (r6 != 0) goto L66
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = "&wf_pre="
            r6.append(r5)
            r6.append(r4)
            java.lang.String r5 = r6.toString()
        L66:
            return r5
    }

    public final java.lang.String a(java.util.Deque<java.lang.String> r18) {
            r17 = this;
            java.lang.String r0 = ","
            if (r18 == 0) goto L9e
            boolean r1 = r18.isEmpty()
            if (r1 == 0) goto Lc
            goto L9e
        Lc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Object r2 = r18.peekFirst()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L99
            java.lang.String[] r3 = r2.split(r0)     // Catch: java.lang.Exception -> L99
            java.util.Iterator r4 = r18.iterator()     // Catch: java.lang.Exception -> L99
            r5 = 0
            r6 = r5
        L23:
            boolean r7 = r4.hasNext()     // Catch: java.lang.Exception -> L99
            if (r7 == 0) goto L99
            java.lang.Object r7 = r4.next()     // Catch: java.lang.Exception -> L99
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L99
            int r8 = r3.length     // Catch: java.lang.Exception -> L99
            r9 = 3
            if (r8 == r9) goto L34
            goto L99
        L34:
            java.lang.String[] r7 = r7.split(r0)     // Catch: java.lang.Exception -> L99
            r8 = 1
            if (r6 != 0) goto L3f
            r1.append(r2)     // Catch: java.lang.Exception -> L99
            goto L8a
        L3f:
            int r10 = r7.length     // Catch: java.lang.Exception -> L99
            if (r10 == r9) goto L43
            goto L96
        L43:
            r9 = r3[r5]     // Catch: java.lang.Exception -> L8a
            double r9 = java.lang.Double.parseDouble(r9)     // Catch: java.lang.Exception -> L8a
            r11 = r7[r5]     // Catch: java.lang.Exception -> L8a
            double r11 = java.lang.Double.parseDouble(r11)     // Catch: java.lang.Exception -> L8a
            double r9 = r9 - r11
            r11 = 4618441417868443648(0x4018000000000000, double:6.0)
            r13 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r15 = java.lang.Math.pow(r13, r11)     // Catch: java.lang.Exception -> L8a
            double r9 = r9 * r15
            int r9 = (int) r9     // Catch: java.lang.Exception -> L8a
            r1.append(r9)     // Catch: java.lang.Exception -> L8a
            r1.append(r0)     // Catch: java.lang.Exception -> L8a
            r9 = r3[r8]     // Catch: java.lang.Exception -> L8a
            double r9 = java.lang.Double.parseDouble(r9)     // Catch: java.lang.Exception -> L8a
            r15 = r7[r8]     // Catch: java.lang.Exception -> L8a
            double r15 = java.lang.Double.parseDouble(r15)     // Catch: java.lang.Exception -> L8a
            double r9 = r9 - r15
            double r11 = java.lang.Math.pow(r13, r11)     // Catch: java.lang.Exception -> L8a
            double r9 = r9 * r11
            int r9 = (int) r9     // Catch: java.lang.Exception -> L8a
            r1.append(r9)     // Catch: java.lang.Exception -> L8a
            r1.append(r0)     // Catch: java.lang.Exception -> L8a
            r9 = 2
            r10 = r3[r9]     // Catch: java.lang.Exception -> L8a
            long r10 = java.lang.Long.parseLong(r10)     // Catch: java.lang.Exception -> L8a
            r7 = r7[r9]     // Catch: java.lang.Exception -> L8a
            long r12 = java.lang.Long.parseLong(r7)     // Catch: java.lang.Exception -> L8a
            long r10 = r10 - r12
            r1.append(r10)     // Catch: java.lang.Exception -> L8a
        L8a:
            int r7 = r18.size()     // Catch: java.lang.Exception -> L99
            int r7 = r7 - r8
            if (r6 == r7) goto L96
            java.lang.String r7 = "|"
            r1.append(r7)     // Catch: java.lang.Exception -> L99
        L96:
            int r6 = r6 + 1
            goto L23
        L99:
            java.lang.String r0 = r1.toString()
            return r0
        L9e:
            java.lang.String r0 = ""
            return r0
    }

    public void a(android.content.Context r5) {
            r4 = this;
            java.lang.String r0 = ""
            android.content.SharedPreferences r1 = r4.f18a
            if (r1 != 0) goto L10
            a.a.a.b.r r1 = a.a.a.b.r.a()
            android.content.SharedPreferences r5 = r1.a(r5)
            r4.f18a = r5
        L10:
            android.content.SharedPreferences r5 = r4.f18a
            if (r5 == 0) goto L40
            boolean r1 = r4.f19b
            if (r1 != 0) goto L40
            java.lang.String r1 = "cl_pre"
            java.lang.String r5 = r5.getString(r1, r0)     // Catch: java.lang.Exception -> L3d
            android.content.SharedPreferences r1 = r4.f18a     // Catch: java.lang.Exception -> L3d
            java.lang.String r2 = "wf_pre"
            java.lang.String r1 = r1.getString(r2, r0)     // Catch: java.lang.Exception -> L3d
            android.content.SharedPreferences r2 = r4.f18a     // Catch: java.lang.Exception -> L3d
            java.lang.String r3 = "ll_pre"
            java.lang.String r0 = r2.getString(r3, r0)     // Catch: java.lang.Exception -> L3d
            java.util.Deque<java.lang.String> r2 = r4.f20c     // Catch: java.lang.Exception -> L3d
            r4.b(r5, r2)     // Catch: java.lang.Exception -> L3d
            java.util.Deque<java.lang.String> r5 = r4.d     // Catch: java.lang.Exception -> L3d
            r4.b(r1, r5)     // Catch: java.lang.Exception -> L3d
            java.util.Deque<java.lang.String> r5 = r4.e     // Catch: java.lang.Exception -> L3d
            r4.a(r0, r5)     // Catch: java.lang.Exception -> L3d
        L3d:
            r5 = 1
            r4.f19b = r5
        L40:
            return
    }

    public synchronized void a(com.baidu.location.c r10, java.lang.String r11, android.location.Location r12) {
            r9 = this;
            monitor-enter(r9)
            if (r10 == 0) goto L146
            java.lang.String r0 = "gcj02"
            boolean r11 = r0.equals(r11)     // Catch: java.lang.Throwable -> L143
            if (r11 != 0) goto Ld
            goto L146
        Ld:
            java.lang.String r11 = r10.v()     // Catch: java.lang.Throwable -> L143
            int r0 = r10.r()     // Catch: java.lang.Throwable -> L143
            r1 = 61
            if (r0 == r1) goto L1f
            r2 = 161(0xa1, float:2.26E-43)
            if (r0 == r2) goto L1f
            monitor-exit(r9)
            return
        L1f:
            if (r11 != 0) goto L23
            java.lang.String r11 = "null"
        L23:
            java.lang.String r2 = "wf"
            boolean r2 = r11.contains(r2)     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            r3 = 1
            if (r2 == 0) goto L6a
            int r2 = r9.h     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            if (r2 != r3) goto L6a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            r11.<init>()     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            double r0 = r10.t()     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            r11.append(r0)     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            java.lang.String r12 = ","
            r11.append(r12)     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            double r0 = r10.q()     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            r11.append(r0)     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            java.lang.String r12 = ","
            r11.append(r12)     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            java.lang.String r10 = r10.C()     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            long r0 = a.a.a.i.i.a(r10)     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            r11.append(r0)     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            java.lang.String r10 = r11.toString()     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            java.util.Deque<java.lang.String> r11 = r9.d     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            r11.offerFirst(r10)     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            java.util.Deque<java.lang.String> r10 = r9.d     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            java.lang.String r11 = "wf"
        L65:
            r9.a(r10, r11)     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            goto L141
        L6a:
            java.lang.String r2 = "cl"
            boolean r11 = r11.contains(r2)     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            if (r11 == 0) goto Lac
            int r11 = r9.h     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            if (r11 != r3) goto Lac
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            r11.<init>()     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            double r0 = r10.t()     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            r11.append(r0)     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            java.lang.String r12 = ","
            r11.append(r12)     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            double r0 = r10.q()     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            r11.append(r0)     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            java.lang.String r12 = ","
            r11.append(r12)     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            java.lang.String r10 = r10.C()     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            long r0 = a.a.a.i.i.a(r10)     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            r11.append(r0)     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            java.lang.String r10 = r11.toString()     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            java.util.Deque<java.lang.String> r11 = r9.f20c     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            r11.offerFirst(r10)     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            java.util.Deque<java.lang.String> r10 = r9.f20c     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            java.lang.String r11 = "cl"
            goto L65
        Lac:
            if (r0 != r1) goto L141
            int r11 = r9.i     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            if (r11 != r3) goto L141
            if (r12 == 0) goto L141
            float r11 = r10.z()     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            int r11 = (int) r11     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            java.text.DecimalFormat r0 = new java.text.DecimalFormat     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            java.lang.String r1 = "0.00"
            r0.<init>(r1)     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            java.text.DecimalFormat r1 = new java.text.DecimalFormat     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            java.lang.String r2 = "0.0"
            r1.<init>(r2)     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            java.text.DecimalFormat r2 = new java.text.DecimalFormat     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            java.lang.String r3 = "0.000000"
            r2.<init>(r3)     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            double r3 = r12.getLongitude()     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            double r5 = r12.getLatitude()     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            r12.<init>()     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            int r7 = r10.A()     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            r12.append(r7)     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            java.lang.String r7 = ","
            r12.append(r7)     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            r12.append(r11)     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            java.lang.String r11 = ","
            r12.append(r11)     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            double r7 = r10.d()     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            java.lang.String r11 = r0.format(r7)     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            r12.append(r11)     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            java.lang.String r11 = ","
            r12.append(r11)     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            java.lang.String r11 = r10.C()     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            long r7 = a.a.a.i.i.a(r11)     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            r12.append(r7)     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            java.lang.String r11 = ","
            r12.append(r11)     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            float r10 = r10.B()     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            double r10 = (double) r10     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            java.lang.String r10 = r1.format(r10)     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            r12.append(r10)     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            java.lang.String r10 = ","
            r12.append(r10)     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            java.lang.String r10 = r2.format(r3)     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            r12.append(r10)     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            java.lang.String r10 = ","
            r12.append(r10)     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            java.lang.String r10 = r2.format(r5)     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            r12.append(r10)     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            java.lang.String r10 = r12.toString()     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            java.util.Deque<java.lang.String> r11 = r9.e     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            r11.offerFirst(r10)     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            java.util.Deque<java.lang.String> r10 = r9.e     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
            r9.c(r10)     // Catch: java.lang.Exception -> L141 java.lang.Throwable -> L143
        L141:
            monitor-exit(r9)
            return
        L143:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        L146:
            monitor-exit(r9)
            return
    }

    public final void a(java.lang.String r2, java.util.Deque<java.lang.String> r3) {
            r1 = this;
            if (r2 == 0) goto L26
            java.lang.String r1 = ""
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lb
            goto L26
        Lb:
            java.lang.String r1 = new java.lang.String
            byte[] r2 = r2.getBytes()
            r0 = 0
            byte[] r2 = android.util.Base64.decode(r2, r0)
            r1.<init>(r2)
            java.lang.String r2 = "\\|"
            java.lang.String[] r1 = r1.split(r2)
            java.util.List r1 = java.util.Arrays.asList(r1)
            r3.addAll(r1)
        L26:
            return
    }

    public final void a(java.util.Deque<java.lang.String> r6, java.lang.String r7) {
            r5 = this;
            if (r6 == 0) goto L6d
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L9
            goto L6d
        L9:
            int r0 = r6.size()
            int r1 = r5.f
            if (r0 <= r1) goto L15
            r6.pollLast()
            goto L9
        L15:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Iterator r1 = r6.iterator()
            r2 = 0
            r3 = r2
        L20:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L3f
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            r0.append(r4)
            int r4 = r6.size()
            int r4 = r4 + (-1)
            if (r3 == r4) goto L3c
            java.lang.String r4 = "|"
            r0.append(r4)
        L3c:
            int r3 = r3 + 1
            goto L20
        L3f:
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Exception -> L6d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L6d
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Exception -> L6d
            byte[] r0 = android.util.Base64.encode(r0, r2)     // Catch: java.lang.Exception -> L6d
            r6.<init>(r0)     // Catch: java.lang.Exception -> L6d
            android.content.SharedPreferences r5 = r5.f18a     // Catch: java.lang.Exception -> L6d
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch: java.lang.Exception -> L6d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6d
            r0.<init>()     // Catch: java.lang.Exception -> L6d
            r0.append(r7)     // Catch: java.lang.Exception -> L6d
            java.lang.String r7 = "_pre"
            r0.append(r7)     // Catch: java.lang.Exception -> L6d
            java.lang.String r7 = r0.toString()     // Catch: java.lang.Exception -> L6d
            r5.putString(r7, r6)     // Catch: java.lang.Exception -> L6d
            r5.commit()     // Catch: java.lang.Exception -> L6d
        L6d:
            return
    }

    public java.lang.String b() {
            r2 = this;
            int r0 = r2.i
            int r1 = r2.h
            java.lang.String r2 = r2.a(r0, r1)
            return r2
    }

    public final java.lang.String b(java.util.Deque<java.lang.String> r18) {
            r17 = this;
            java.lang.String r0 = ","
            if (r18 == 0) goto L112
            boolean r1 = r18.isEmpty()
            if (r1 == 0) goto Lc
            goto L112
        Lc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Object r2 = r18.peekFirst()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L10d
            java.lang.String[] r3 = r2.split(r0)     // Catch: java.lang.Exception -> L10d
            java.util.Iterator r4 = r18.iterator()     // Catch: java.lang.Exception -> L10d
            r5 = 0
            r6 = r5
        L23:
            boolean r7 = r4.hasNext()     // Catch: java.lang.Exception -> L10d
            if (r7 == 0) goto L10d
            java.lang.Object r7 = r4.next()     // Catch: java.lang.Exception -> L10d
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L10d
            int r8 = r3.length     // Catch: java.lang.Exception -> L10d
            r9 = 7
            if (r8 == r9) goto L35
            goto L10d
        L35:
            java.lang.String[] r7 = r7.split(r0)     // Catch: java.lang.Exception -> L10d
            r8 = 1
            if (r6 != 0) goto L42
            r1.append(r2)     // Catch: java.lang.Exception -> L10d
        L3f:
            r7 = r6
            goto Lfc
        L42:
            int r10 = r7.length     // Catch: java.lang.Exception -> L10d
            if (r10 == r9) goto L48
            r7 = r6
            goto L108
        L48:
            r9 = r3[r5]     // Catch: java.lang.Exception -> L3f
            int r9 = java.lang.Integer.parseInt(r9)     // Catch: java.lang.Exception -> L3f
            r10 = r7[r5]     // Catch: java.lang.Exception -> L3f
            int r10 = java.lang.Integer.parseInt(r10)     // Catch: java.lang.Exception -> L3f
            int r9 = r9 - r10
            r1.append(r9)     // Catch: java.lang.Exception -> L3f
            r1.append(r0)     // Catch: java.lang.Exception -> L3f
            r9 = r3[r8]     // Catch: java.lang.Exception -> L3f
            int r9 = java.lang.Integer.parseInt(r9)     // Catch: java.lang.Exception -> L3f
            r10 = r7[r8]     // Catch: java.lang.Exception -> L3f
            int r10 = java.lang.Integer.parseInt(r10)     // Catch: java.lang.Exception -> L3f
            int r9 = r9 - r10
            r1.append(r9)     // Catch: java.lang.Exception -> L3f
            r1.append(r0)     // Catch: java.lang.Exception -> L3f
            java.math.BigDecimal r9 = new java.math.BigDecimal     // Catch: java.lang.Exception -> L3f
            r10 = 2
            r11 = r3[r10]     // Catch: java.lang.Exception -> L3f
            r9.<init>(r11)     // Catch: java.lang.Exception -> L3f
            java.math.BigDecimal r11 = new java.math.BigDecimal     // Catch: java.lang.Exception -> L3f
            r10 = r7[r10]     // Catch: java.lang.Exception -> L3f
            r11.<init>(r10)     // Catch: java.lang.Exception -> L3f
            java.math.BigDecimal r9 = r9.subtract(r11)     // Catch: java.lang.Exception -> L3f
            r1.append(r9)     // Catch: java.lang.Exception -> L3f
            r1.append(r0)     // Catch: java.lang.Exception -> L3f
            r9 = 3
            r10 = r3[r9]     // Catch: java.lang.Exception -> L3f
            long r10 = java.lang.Long.parseLong(r10)     // Catch: java.lang.Exception -> L3f
            r9 = r7[r9]     // Catch: java.lang.Exception -> L3f
            long r12 = java.lang.Long.parseLong(r9)     // Catch: java.lang.Exception -> L3f
            long r10 = r10 - r12
            r1.append(r10)     // Catch: java.lang.Exception -> L3f
            r1.append(r0)     // Catch: java.lang.Exception -> L3f
            java.math.BigDecimal r9 = new java.math.BigDecimal     // Catch: java.lang.Exception -> L3f
            r10 = 4
            r11 = r3[r10]     // Catch: java.lang.Exception -> L3f
            r9.<init>(r11)     // Catch: java.lang.Exception -> L3f
            java.math.BigDecimal r11 = new java.math.BigDecimal     // Catch: java.lang.Exception -> L3f
            r10 = r7[r10]     // Catch: java.lang.Exception -> L3f
            r11.<init>(r10)     // Catch: java.lang.Exception -> L3f
            java.math.BigDecimal r9 = r9.subtract(r11)     // Catch: java.lang.Exception -> L3f
            r1.append(r9)     // Catch: java.lang.Exception -> L3f
            r1.append(r0)     // Catch: java.lang.Exception -> L3f
            java.math.BigDecimal r9 = new java.math.BigDecimal     // Catch: java.lang.Exception -> L3f
            r10 = 5
            r11 = r3[r10]     // Catch: java.lang.Exception -> L3f
            r9.<init>(r11)     // Catch: java.lang.Exception -> L3f
            java.math.BigDecimal r11 = new java.math.BigDecimal     // Catch: java.lang.Exception -> L3f
            r10 = r7[r10]     // Catch: java.lang.Exception -> L3f
            r11.<init>(r10)     // Catch: java.lang.Exception -> L3f
            java.math.BigDecimal r9 = r9.subtract(r11)     // Catch: java.lang.Exception -> L3f
            double r9 = r9.doubleValue()     // Catch: java.lang.Exception -> L3f
            java.math.BigDecimal r11 = new java.math.BigDecimal     // Catch: java.lang.Exception -> L3f
            r12 = 6
            r13 = r3[r12]     // Catch: java.lang.Exception -> L3f
            r11.<init>(r13)     // Catch: java.lang.Exception -> L3f
            java.math.BigDecimal r13 = new java.math.BigDecimal     // Catch: java.lang.Exception -> L3f
            r7 = r7[r12]     // Catch: java.lang.Exception -> L3f
            r13.<init>(r7)     // Catch: java.lang.Exception -> L3f
            java.math.BigDecimal r7 = r11.subtract(r13)     // Catch: java.lang.Exception -> L3f
            double r11 = r7.doubleValue()     // Catch: java.lang.Exception -> L3f
            r13 = 4618441417868443648(0x4018000000000000, double:6.0)
            r7 = r6
            r5 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r15 = java.lang.Math.pow(r5, r13)     // Catch: java.lang.Exception -> Lfc
            double r9 = r9 * r15
            int r9 = (int) r9     // Catch: java.lang.Exception -> Lfc
            r1.append(r9)     // Catch: java.lang.Exception -> Lfc
            r1.append(r0)     // Catch: java.lang.Exception -> Lfc
            double r5 = java.lang.Math.pow(r5, r13)     // Catch: java.lang.Exception -> Lfc
            double r11 = r11 * r5
            int r5 = (int) r11     // Catch: java.lang.Exception -> Lfc
            r1.append(r5)     // Catch: java.lang.Exception -> Lfc
        Lfc:
            int r5 = r18.size()     // Catch: java.lang.Exception -> L10d
            int r5 = r5 - r8
            if (r7 == r5) goto L108
            java.lang.String r5 = "|"
            r1.append(r5)     // Catch: java.lang.Exception -> L10d
        L108:
            int r6 = r7 + 1
            r5 = 0
            goto L23
        L10d:
            java.lang.String r0 = r1.toString()
            return r0
        L112:
            java.lang.String r0 = ""
            return r0
    }

    public final void b(java.lang.String r2, java.util.Deque<java.lang.String> r3) {
            r1 = this;
            if (r2 == 0) goto L26
            java.lang.String r1 = ""
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lb
            goto L26
        Lb:
            java.lang.String r1 = new java.lang.String
            byte[] r2 = r2.getBytes()
            r0 = 0
            byte[] r2 = android.util.Base64.decode(r2, r0)
            r1.<init>(r2)
            java.lang.String r2 = "\\|"
            java.lang.String[] r1 = r1.split(r2)
            java.util.List r1 = java.util.Arrays.asList(r1)
            r3.addAll(r1)
        L26:
            return
    }

    public final void c(java.util.Deque<java.lang.String> r6) {
            r5 = this;
            if (r6 == 0) goto L5e
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L9
            goto L5e
        L9:
            int r0 = r6.size()
            int r1 = r5.g
            if (r0 <= r1) goto L15
            r6.pollLast()
            goto L9
        L15:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Iterator r1 = r6.iterator()
            r2 = 0
            r3 = r2
        L20:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L3f
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            r0.append(r4)
            int r4 = r6.size()
            int r4 = r4 + (-1)
            if (r3 == r4) goto L3c
            java.lang.String r4 = "|"
            r0.append(r4)
        L3c:
            int r3 = r3 + 1
            goto L20
        L3f:
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Exception -> L5e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L5e
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Exception -> L5e
            byte[] r0 = android.util.Base64.encode(r0, r2)     // Catch: java.lang.Exception -> L5e
            r6.<init>(r0)     // Catch: java.lang.Exception -> L5e
            android.content.SharedPreferences r5 = r5.f18a     // Catch: java.lang.Exception -> L5e
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch: java.lang.Exception -> L5e
            java.lang.String r0 = "ll_pre"
            r5.putString(r0, r6)     // Catch: java.lang.Exception -> L5e
            r5.commit()     // Catch: java.lang.Exception -> L5e
        L5e:
            return
    }
}
