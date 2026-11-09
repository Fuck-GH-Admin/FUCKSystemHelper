package c.a.b.c;

/* JADX INFO: loaded from: classes.dex */
public class e extends c.a.b.c.a {
    private android.content.Context f;
    private c.a.b.c.e.f g;

    static final class a implements java.lang.Comparable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final java.lang.String[] f1218c = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f1219b;

        static {
                java.lang.String r0 = "read0"
                java.lang.String r1 = "read1"
                java.lang.String r2 = "read2"
                java.lang.String r3 = "read3"
                java.lang.String r4 = "access0"
                java.lang.String r5 = "access1"
                java.lang.String r6 = "access2"
                java.lang.String r7 = "access3"
                java.lang.String r8 = "sync0"
                java.lang.String r9 = "sync1"
                java.lang.String r10 = "sync2"
                java.lang.String r11 = "sync3"
                java.lang.String r12 = "open0"
                java.lang.String r13 = "open1"
                java.lang.String r14 = "open2"
                java.lang.String r15 = "open3"
                java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15}
                c.a.b.c.e.a.f1218c = r0
                return
        }

        private a(int r1) {
                r0 = this;
                r0.<init>()
                r0.f1219b = r1
                return
        }

        public static c.a.b.c.e.a a(byte r0, boolean r1) {
                r0 = r0 & 255(0xff, float:3.57E-43)
                if (r1 == 0) goto Lb
                int r0 = r0 >> 4
            L6:
                c.a.b.c.e$a r0 = a(r0)
                return r0
            Lb:
                r0 = r0 & 15
                goto L6
        }

        public static c.a.b.c.e.a a(int r3) {
                if (r3 < 0) goto Lc
                r0 = 16
                if (r3 >= r0) goto Lc
                c.a.b.c.e$a r0 = new c.a.b.c.e$a
                r0.<init>(r3)
                return r0
            Lc:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "invalid idx "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
        }

        public int a(c.a.b.c.e.a r1) {
                r0 = this;
                int r0 = r0.f1219b
                int r1 = r1.f1219b
                int r0 = r0 - r1
                return r0
        }

        public java.lang.String a() {
                r1 = this;
                java.lang.String[] r0 = c.a.b.c.e.a.f1218c
                int r1 = r1.f1219b
                r1 = r0[r1]
                return r1
        }

        public byte b() {
                r0 = this;
                int r0 = r0.f1219b
                byte r0 = (byte) r0
                return r0
        }

        @Override // java.lang.Comparable
        public /* synthetic */ int compareTo(java.lang.Object r1) {
                r0 = this;
                c.a.b.c.e$a r1 = (c.a.b.c.e.a) r1
                int r0 = r0.a(r1)
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 == 0) goto L1b
                java.lang.Class r2 = r5.getClass()
                java.lang.Class<c.a.b.c.e$a> r3 = c.a.b.c.e.a.class
                if (r3 == r2) goto L10
                goto L1b
            L10:
                c.a.b.c.e$a r5 = (c.a.b.c.e.a) r5
                int r4 = r4.f1219b
                int r5 = r5.f1219b
                if (r4 != r5) goto L19
                goto L1a
            L19:
                r0 = r1
            L1a:
                return r0
            L1b:
                return r1
        }

        public int hashCode() {
                r0 = this;
                int r0 = r0.f1219b
                return r0
        }
    }

    class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c.a.b.c.e.a[] f1220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f1221b;

        public b(c.a.b.c.e r1) {
                r0 = this;
                r0.<init>()
                r1 = 33
                c.a.b.c.e$a[] r1 = new c.a.b.c.e.a[r1]
                r0.f1220a = r1
                return
        }

        private void b(int r3) {
                r2 = this;
                c.a.b.c.e$a[] r0 = r2.f1220a
                int r1 = r0.length
                int r1 = r3 - r1
                if (r1 <= 0) goto L1b
                int r0 = r0.length
                int r1 = r0 >> 1
                int r0 = r0 + r1
                int r1 = r0 - r3
                if (r1 >= 0) goto L10
                goto L11
            L10:
                r3 = r0
            L11:
                c.a.b.c.e$a[] r0 = r2.f1220a
                java.lang.Object[] r3 = java.util.Arrays.copyOf(r0, r3)
                c.a.b.c.e$a[] r3 = (c.a.b.c.e.a[]) r3
                r2.f1220a = r3
            L1b:
                return
        }

        public int a() {
                r0 = this;
                int r0 = r0.f1221b
                return r0
        }

        public c.a.b.c.e.a a(int r4) {
                r3 = this;
                int r0 = r3.f1221b
                if (r4 >= r0) goto L9
                c.a.b.c.e$a[] r3 = r3.f1220a
                r3 = r3[r4]
                return r3
            L9:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "idx "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = " size "
                r1.append(r4)
                int r3 = r3.f1221b
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
        }

        public void a(c.a.b.c.e.a r4) {
                r3 = this;
                int r0 = r3.f1221b
                int r0 = r0 + 1
                r3.b(r0)
                c.a.b.c.e$a[] r0 = r3.f1220a
                int r1 = r3.f1221b
                int r2 = r1 + 1
                r3.f1221b = r2
                r0[r1] = r4
                return
        }

        public byte[] b() {
                r4 = this;
                java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
                r0.<init>()
                r1 = 0
            L6:
                int r2 = r4.f1221b
                int r3 = r2 / 2
                if (r1 >= r3) goto L2e
                int r2 = r1 * 2
                c.a.b.c.e$a r3 = r4.a(r2)
                byte r3 = r3.b()
                r3 = r3 & 255(0xff, float:3.57E-43)
                int r2 = r2 + 1
                c.a.b.c.e$a r2 = r4.a(r2)
                byte r2 = r2.b()
                r2 = r2 & 255(0xff, float:3.57E-43)
                int r2 = r2 << 4
                r2 = r2 | r3
                byte r2 = (byte) r2
                r0.write(r2)
                int r1 = r1 + 1
                goto L6
            L2e:
                int r1 = r2 % 2
                if (r1 == 0) goto L42
                int r2 = r2 + (-1)
                c.a.b.c.e$a r4 = r4.a(r2)
                byte r4 = r4.b()
                r4 = r4 & 255(0xff, float:3.57E-43)
                byte r4 = (byte) r4
                r0.write(r4)
            L42:
                byte[] r4 = r0.toByteArray()
                return r4
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.util.List f1222a;

        static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f1223a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private c.a.b.c.e.a f1224b;

            public a(c.a.b.c.e.a r1) {
                    r0 = this;
                    r0.<init>()
                    r0.f1224b = r1
                    return
            }

            static /* synthetic */ int a(c.a.b.c.e.c.a r0) {
                    int r0 = r0.f1223a
                    return r0
            }

            static /* synthetic */ c.a.b.c.e.a b(c.a.b.c.e.c.a r0) {
                    c.a.b.c.e$a r0 = r0.f1224b
                    return r0
            }

            public void a() {
                    r1 = this;
                    int r0 = r1.f1223a
                    int r0 = r0 + 1
                    r1.f1223a = r0
                    return
            }
        }

        c() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.f1222a = r0
                return
        }

        public java.util.List a() {
                r2 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.List r1 = r2.f1222a
                r0.<init>(r1)
                c.a.b.c.f r1 = new c.a.b.c.f
                r1.<init>(r2)
                java.util.Collections.sort(r0, r1)
                return r0
        }

        public void a(c.a.b.c.e.a r2) {
                r1 = this;
                java.util.List r1 = r1.f1222a
                c.a.b.c.e$c$a r0 = new c.a.b.c.e$c$a
                r0.<init>(r2)
                r1.add(r0)
                return
        }
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        byte[] f1225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        byte f1226b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        byte[] f1227c;

        public d(byte[] r1, byte r2, byte[] r3) {
                r0 = this;
                r0.<init>()
                r0.f1225a = r1
                r0.f1226b = r2
                r0.f1227c = r3
                return
        }

        public c.a.b.n.a a() {
                r7 = this;
                java.lang.String r0 = "UTF-8"
                r1 = 0
                byte[] r2 = r7.f1225a     // Catch: java.lang.Exception -> L2a
                java.lang.String r3 = ""
                r4 = 1
                java.lang.String r2 = c.a.b.g.b.a(r2, r3, r4)     // Catch: java.lang.Exception -> L2a
                java.lang.String r3 = new java.lang.String     // Catch: java.lang.Exception -> L2a
                byte[] r4 = new byte[r4]     // Catch: java.lang.Exception -> L2a
                r5 = 0
                byte r6 = r7.f1226b     // Catch: java.lang.Exception -> L2a
                r4[r5] = r6     // Catch: java.lang.Exception -> L2a
                r3.<init>(r4, r0)     // Catch: java.lang.Exception -> L2a
                byte[] r4 = r7.f1227c     // Catch: java.lang.Exception -> L2a
                if (r4 == 0) goto L24
                java.lang.String r4 = new java.lang.String     // Catch: java.lang.Exception -> L2a
                byte[] r7 = r7.f1227c     // Catch: java.lang.Exception -> L2a
                r4.<init>(r7, r0)     // Catch: java.lang.Exception -> L2a
                goto L25
            L24:
                r4 = r1
            L25:
                c.a.b.n$a r7 = c.a.b.n.a(r2, r3, r4)     // Catch: java.lang.Exception -> L2a
                return r7
            L2a:
                return r1
        }
    }

    /* JADX INFO: renamed from: c.a.b.c.e$e, reason: collision with other inner class name */
    static class C0052e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1229b;

        C0052e() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.lang.String toString() {
                r0 = this;
                java.lang.String r0 = ""
                return r0
        }
    }

    static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.reflect.Method f1230a;

        f() {
                r0 = this;
                r0.<init>()
                return
        }

        public int a(android.content.Context r3, android.net.Uri r4, int r5, int r6, int r7) {
                r2 = this;
                java.lang.reflect.Method r2 = r2.f1230a     // Catch: java.lang.Exception -> L28
                r0 = 4
                java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L28
                r1 = 0
                r0[r1] = r4     // Catch: java.lang.Exception -> L28
                r4 = 1
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L28
                r0[r4] = r5     // Catch: java.lang.Exception -> L28
                r4 = 2
                java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L28
                r0[r4] = r5     // Catch: java.lang.Exception -> L28
                r4 = 3
                java.lang.Integer r5 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L28
                r0[r4] = r5     // Catch: java.lang.Exception -> L28
                java.lang.Object r2 = r2.invoke(r3, r0)     // Catch: java.lang.Exception -> L28
                java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Exception -> L28
                int r2 = r2.intValue()     // Catch: java.lang.Exception -> L28
                return r2
            L28:
                r2 = move-exception
                c.a.b.a.e$a r3 = new c.a.b.a.e$a
                r3.<init>(r2)
                throw r3
        }

        void a() {
                r8 = this;
                byte[] r0 = c.a.b.a.d.d()     // Catch: java.lang.Exception -> L87
                java.lang.String r0 = c.a.b.a.e.a(r0)     // Catch: java.lang.Exception -> L87
                java.lang.Class<android.content.Context> r1 = android.content.Context.class
                r2 = 4
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L87
                java.lang.Class<android.net.Uri> r3 = android.net.Uri.class
                r4 = 0
                r2[r4] = r3     // Catch: java.lang.Exception -> L87
                java.lang.Class r3 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L87
                r5 = 1
                r2[r5] = r3     // Catch: java.lang.Exception -> L87
                java.lang.Class r3 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L87
                r6 = 2
                r2[r6] = r3     // Catch: java.lang.Exception -> L87
                java.lang.Class r3 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L87
                r7 = 3
                r2[r7] = r3     // Catch: java.lang.Exception -> L87
                java.lang.reflect.Method r0 = c.a.b.a.e.a(r1, r0, r2)     // Catch: java.lang.Exception -> L87
                r8.f1230a = r0     // Catch: java.lang.Exception -> L87
                byte[] r8 = c.a.b.a.d.e()     // Catch: java.lang.Exception -> L87
                java.lang.String r8 = c.a.b.a.e.a(r8)     // Catch: java.lang.Exception -> L87
                java.lang.Class<android.content.Context> r0 = android.content.Context.class
                java.lang.Class[] r1 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L87
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                r1[r4] = r2     // Catch: java.lang.Exception -> L87
                java.lang.Class<android.net.Uri> r2 = android.net.Uri.class
                r1[r5] = r2     // Catch: java.lang.Exception -> L87
                java.lang.Class r2 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L87
                r1[r6] = r2     // Catch: java.lang.Exception -> L87
                c.a.b.a.e.a(r0, r8, r1)     // Catch: java.lang.Exception -> L87
                byte[] r8 = c.a.b.a.d.f()     // Catch: java.lang.Exception -> L87
                java.lang.String r8 = c.a.b.a.e.a(r8)     // Catch: java.lang.Exception -> L87
                java.lang.Class<android.content.ContentResolver> r0 = android.content.ContentResolver.class
                java.lang.Class[] r1 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> L87
                java.lang.Class<android.net.Uri> r2 = android.net.Uri.class
                r1[r4] = r2     // Catch: java.lang.Exception -> L87
                java.lang.Class r2 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L87
                r1[r5] = r2     // Catch: java.lang.Exception -> L87
                c.a.b.a.e.a(r0, r8, r1)     // Catch: java.lang.Exception -> L87
                byte[] r8 = c.a.b.a.d.g()     // Catch: java.lang.Exception -> L87
                java.lang.String r8 = c.a.b.a.e.a(r8)     // Catch: java.lang.Exception -> L87
                java.lang.Class<android.content.Context> r0 = android.content.Context.class
                java.lang.Class[] r1 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> L87
                java.lang.Class<android.net.Uri> r2 = android.net.Uri.class
                r1[r4] = r2     // Catch: java.lang.Exception -> L87
                java.lang.Class r2 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L87
                r1[r5] = r2     // Catch: java.lang.Exception -> L87
                c.a.b.a.e.a(r0, r8, r1)     // Catch: java.lang.Exception -> L87
                byte[] r8 = c.a.b.a.d.h()     // Catch: java.lang.Exception -> L87
                java.lang.String r8 = c.a.b.a.e.a(r8)     // Catch: java.lang.Exception -> L87
                java.lang.Class<android.content.ContentResolver> r0 = android.content.ContentResolver.class
                java.lang.Class[] r1 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> L87
                java.lang.Class<android.net.Uri> r2 = android.net.Uri.class
                r1[r4] = r2     // Catch: java.lang.Exception -> L87
                java.lang.Class r2 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L87
                r1[r5] = r2     // Catch: java.lang.Exception -> L87
                c.a.b.a.e.a(r0, r8, r1)     // Catch: java.lang.Exception -> L87
            L87:
                return
        }
    }

    public e() {
            r3 = this;
            java.lang.String r0 = "upc"
            r1 = 9000000(0x895440, double:4.446591E-317)
            r3.<init>(r0, r1)
            c.a.b.c.e$f r0 = new c.a.b.c.e$f
            r0.<init>()
            r3.g = r0
            r0.a()
            return
    }

    private c.a.b.c.e.a a(java.lang.String r8, int r9, java.util.List r10, int r11, c.a.b.c.e.C0052e r12) {
            r7 = this;
            java.util.Iterator r10 = r10.iterator()
        L4:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r10.next()
            c.a.b.c.e$c$a r0 = (c.a.b.c.e.c.a) r0
            c.a.b.c.e$a r4 = c.a.b.c.e.c.a.b(r0)
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r11
            r6 = r12
            boolean r1 = r1.a(r2, r3, r4, r5, r6)
            if (r1 == 0) goto L4
            r0.a()
            c.a.b.c.e$a r7 = c.a.b.c.e.c.a.b(r0)
            return r7
        L27:
            r7 = 0
            return r7
    }

    private java.lang.String a(java.lang.String r1) {
            r0 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = ".cesium"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    private java.lang.String a(java.lang.String r2, int r3, c.a.b.c.e.a r4) {
            r1 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r1.a(r2)
            r2 = 0
            r0[r2] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = r4.a()
            r2 = 2
            r0[r2] = r1
            java.lang.String r1 = "content://%s/dat/v1/i%d/%s"
            java.lang.String r1 = java.lang.String.format(r1, r0)
            return r1
    }

    private java.lang.String a(java.lang.String r2, c.a.b.c.e.a r3) {
            r1 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r1.a(r2)
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r3.a()
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "content://%s/dic/v1/%s"
            java.lang.String r1 = java.lang.String.format(r1, r0)
            return r1
    }

    private boolean a(java.lang.String r8, int r9, c.a.b.c.e.a r10, int r11, c.a.b.c.e.C0052e r12) {
            r7 = this;
            java.lang.String r8 = r7.a(r8, r9, r10)
            android.net.Uri r8 = android.net.Uri.parse(r8)
            r9 = 0
            r10 = r9
        La:
            r0 = 2
            r6 = 1
            if (r10 >= r0) goto L2a
            if (r12 == 0) goto L15
            int r0 = r12.f1228a     // Catch: java.lang.Throwable -> L22
            int r0 = r0 + r6
            r12.f1228a = r0     // Catch: java.lang.Throwable -> L22
        L15:
            c.a.b.c.e$f r0 = r7.g     // Catch: java.lang.Throwable -> L22
            android.content.Context r1 = r7.f     // Catch: java.lang.Throwable -> L22
            r3 = 0
            r5 = 1
            r2 = r8
            r4 = r11
            int r7 = r0.a(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L22
            goto L2b
        L22:
            r0 = 5
            java.lang.Thread.sleep(r0)     // Catch: java.lang.Exception -> L27
        L27:
            int r10 = r10 + 1
            goto La
        L2a:
            r7 = -1
        L2b:
            if (r7 != 0) goto L2e
            return r6
        L2e:
            if (r12 == 0) goto L35
            int r7 = r12.f1229b
            int r7 = r7 + r6
            r12.f1229b = r7
        L35:
            return r9
    }

    private boolean a(java.lang.String r8, c.a.b.c.e.a r9, int r10) {
            r7 = this;
            java.lang.String r8 = r7.a(r8, r9)
            android.net.Uri r8 = android.net.Uri.parse(r8)
            r9 = 0
            r6 = r9
        La:
            r0 = 2
            if (r6 >= r0) goto L22
            c.a.b.c.e$f r0 = r7.g     // Catch: java.lang.Throwable -> L1a
            android.content.Context r1 = r7.f     // Catch: java.lang.Throwable -> L1a
            r3 = 0
            r5 = 1
            r2 = r8
            r4 = r10
            int r7 = r0.a(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L1a
            goto L23
        L1a:
            r0 = 5
            java.lang.Thread.sleep(r0)     // Catch: java.lang.Exception -> L1f
        L1f:
            int r6 = r6 + 1
            goto La
        L22:
            r7 = -1
        L23:
            if (r7 != 0) goto L27
            r7 = 1
            return r7
        L27:
            return r9
    }

    @Override // c.a.b.c.a
    public c.a.b.c.a.e a(java.lang.String r21, c.a.b.c.a.d r22) {
            r20 = this;
            r6 = r20
            r7 = r21
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto Lf
            c.a.b.c.a$e r0 = c.a.b.c.a.e.b()
            return r0
        Lf:
            r0 = -1
            android.content.Context r1 = r6.f
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            r8 = 0
            int r0 = r1.getPackageUid(r7, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b
        L1b:
            r9 = r0
            if (r9 >= 0) goto L23
            c.a.b.c.a$e r0 = c.a.b.c.a.e.b()
            return r0
        L23:
            c.a.b.c.e$e r10 = new c.a.b.c.e$e
            r10.<init>()
            c.a.b.c.e$b r11 = new c.a.b.c.e$b
            r11.<init>(r6)
            c.a.b.c.e$c r12 = new c.a.b.c.e$c
            r12.<init>()
            c.a.b.c.e$c r13 = new c.a.b.c.e$c
            r13.<init>()
            r0 = r8
        L38:
            r1 = 16
            if (r0 >= r1) goto L50
            c.a.b.c.e$a r1 = c.a.b.c.e.a.a(r0)
            boolean r2 = r6.a(r7, r1, r9)
            if (r2 == 0) goto L4a
            r12.a(r1)
            goto L4d
        L4a:
            r13.a(r1)
        L4d:
            int r0 = r0 + 1
            goto L38
        L50:
            r14 = r8
        L51:
            r15 = 32
            if (r14 >= r15) goto L82
            java.util.List r3 = r12.a()
            r0 = r20
            r1 = r21
            r2 = r14
            r4 = r9
            r5 = r10
            c.a.b.c.e$a r0 = r0.a(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L75
            java.util.List r3 = r13.a()
            r0 = r20
            r1 = r21
            r2 = r14
            r4 = r9
            r5 = r10
            c.a.b.c.e$a r0 = r0.a(r1, r2, r3, r4, r5)
        L75:
            if (r0 != 0) goto L7c
            c.a.b.c.a$e r0 = c.a.b.c.a.e.b()
            return r0
        L7c:
            r11.a(r0)
            int r14 = r14 + 1
            goto L51
        L82:
            byte[] r11 = r11.b()
            r14 = 3
            byte[] r5 = new byte[r14]
            java.lang.String r0 = "0"
            byte[] r0 = r0.getBytes()
            r0 = r0[r8]
            r5[r8] = r0
            java.lang.String r0 = "O"
            byte[] r0 = r0.getBytes()
            r0 = r0[r8]
            r4 = 1
            r5[r4] = r0
            java.lang.String r0 = "V"
            byte[] r0 = r0.getBytes()
            r0 = r0[r8]
            r1 = 2
            r5[r1] = r0
            r3 = r8
        Laa:
            r16 = 0
            if (r3 >= r14) goto L102
            r2 = r5[r3]
            c.a.b.c.e$a r1 = c.a.b.c.e.a.a(r2, r8)
            r17 = 32
            r0 = r20
            r22 = r1
            r1 = r21
            r14 = r2
            r2 = r17
            r17 = r3
            r3 = r22
            r15 = r4
            r4 = r9
            r19 = r5
            r5 = r10
            boolean r0 = r0.a(r1, r2, r3, r4, r5)
            if (r0 == 0) goto Lf9
            c.a.b.c.e$a r14 = c.a.b.c.e.a.a(r14, r15)
            r2 = 33
            r0 = r20
            r1 = r21
            r3 = r14
            r4 = r9
            r5 = r10
            boolean r0 = r0.a(r1, r2, r3, r4, r5)
            if (r0 == 0) goto Lf9
            c.a.b.c.e$b r0 = new c.a.b.c.e$b
            r0.<init>(r6)
            r1 = r22
            r0.a(r1)
            r0.a(r14)
            byte[] r0 = r0.b()
            r0 = r0[r8]
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            goto L105
        Lf9:
            int r3 = r17 + 1
            r4 = r15
            r5 = r19
            r14 = 3
            r15 = 32
            goto Laa
        L102:
            r15 = r4
            r0 = r16
        L105:
            r14 = 34
            if (r0 != 0) goto L152
            c.a.b.c.e$b r5 = new c.a.b.c.e$b
            r5.<init>(r6)
            r4 = 32
        L110:
            if (r4 >= r14) goto L146
            java.util.List r3 = r12.a()
            r0 = r20
            r1 = r21
            r2 = r4
            r18 = r4
            r4 = r9
            r14 = r5
            r5 = r10
            c.a.b.c.e$a r0 = r0.a(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L136
            java.util.List r3 = r13.a()
            r0 = r20
            r1 = r21
            r2 = r18
            r4 = r9
            r5 = r10
            c.a.b.c.e$a r0 = r0.a(r1, r2, r3, r4, r5)
        L136:
            if (r0 != 0) goto L13d
            c.a.b.c.a$e r0 = c.a.b.c.a.e.b()
            return r0
        L13d:
            r14.a(r0)
            int r4 = r18 + 1
            r5 = r14
            r14 = 34
            goto L110
        L146:
            r14 = r5
            byte[] r0 = r14.b()
            r0 = r0[r8]
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            goto L153
        L152:
            r15 = r8
        L153:
            r8 = r0
            if (r15 == 0) goto L194
            c.a.b.c.e$b r14 = new c.a.b.c.e$b
            r14.<init>(r6)
            r15 = 34
        L15d:
            r0 = 94
            if (r15 >= r0) goto L18a
            java.util.List r3 = r12.a()
            r0 = r20
            r1 = r21
            r2 = r15
            r4 = r9
            r5 = r10
            c.a.b.c.e$a r0 = r0.a(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L181
            java.util.List r3 = r13.a()
            r0 = r20
            r1 = r21
            r2 = r15
            r4 = r9
            r5 = r10
            c.a.b.c.e$a r0 = r0.a(r1, r2, r3, r4, r5)
        L181:
            if (r0 != 0) goto L184
            goto L18a
        L184:
            r14.a(r0)
            int r15 = r15 + 1
            goto L15d
        L18a:
            int r0 = r14.a()
            if (r0 <= 0) goto L194
            byte[] r16 = r14.b()
        L194:
            r0 = r16
            c.a.b.c.e$d r1 = new c.a.b.c.e$d
            byte r2 = r8.byteValue()
            r1.<init>(r11, r2, r0)
            c.a.b.n$a r0 = r1.a()
            c.a.b.c.a$e r0 = c.a.b.c.a.e.a(r0)
            return r0
    }

    @Override // c.a.b.c.a
    public void a(c.a.b.c.a.c r1) {
            r0 = this;
            c.a.b.c.a$a r1 = r0.f1203a
            android.content.Context r1 = r1.f1206a
            r0.f = r1
            return
    }
}
