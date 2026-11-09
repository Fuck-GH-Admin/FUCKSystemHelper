package c.a.b.i;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.content.Context f1267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c.a.b.i.a.C0053a f1268b;

    /* JADX INFO: renamed from: c.a.b.i.a$a, reason: collision with other inner class name */
    public final class C0053a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.io.File f1269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.lang.String f1270b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private c.a.b.i.a.C0053a f1271c;
        private boolean d;
        final /* synthetic */ c.a.b.i.a e;

        C0053a(c.a.b.i.a r1, java.io.File r2) {
                r0 = this;
                r0.e = r1
                r0.<init>()
                r1 = 0
                r0.d = r1
                r1 = 1
                r0.d = r1
                r0.f1269a = r2
                java.lang.String r1 = r2.getName()
                r0.f1270b = r1
                return
        }

        C0053a(c.a.b.i.a r1, java.lang.String r2, c.a.b.i.a.C0053a r3) {
                r0 = this;
                r0.e = r1
                r0.<init>()
                r1 = 0
                r0.d = r1
                r0.f1270b = r2
                r0.f1271c = r3
                r0.d = r1
                return
        }

        public c.a.b.i.a.C0053a a(java.io.File r5) {
                r4 = this;
                boolean r0 = r4.d
                if (r0 != 0) goto L36
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = r4
            La:
                java.lang.String r2 = r1.c()
                r0.add(r2)
                c.a.b.i.a$a r1 = r1.d()
                if (r1 != 0) goto La
                int r1 = r0.size()
                int r1 = r1 + (-1)
            L1d:
                if (r1 < 0) goto L2e
                java.io.File r2 = new java.io.File
                java.lang.Object r3 = r0.get(r1)
                java.lang.String r3 = (java.lang.String) r3
                r2.<init>(r5, r3)
                int r1 = r1 + (-1)
                r5 = r2
                goto L1d
            L2e:
                c.a.b.i.a$a r0 = new c.a.b.i.a$a
                c.a.b.i.a r4 = r4.e
                r0.<init>(r4, r5)
                return r0
            L36:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "isolate session is not support"
                r4.<init>(r5)
                throw r4
        }

        public c.a.b.i.a.C0053a a(java.lang.String r3) {
                r2 = this;
                c.a.b.i.a$a r0 = new c.a.b.i.a$a
                c.a.b.i.a r1 = r2.e
                r0.<init>(r1, r3, r2)
                return r0
        }

        public java.lang.String a(java.lang.String r2, boolean r3) {
                r1 = this;
                java.io.File r1 = r1.b()
                java.lang.String r0 = "UTF-8"
                java.lang.String r1 = c.a.b.i.a.a(r1, r2, r0, r3)
                return r1
        }

        public void a() {
                r0 = this;
                java.io.File r0 = r0.b()
                r0.mkdirs()
                return
        }

        public boolean a(java.lang.String r2, java.lang.String r3, boolean r4) {
                r1 = this;
                java.io.File r1 = r1.b()
                java.lang.String r0 = "UTF-8"
                boolean r1 = c.a.b.i.a.a(r1, r2, r3, r0, r4)
                return r1
        }

        public java.io.File b() {
                r3 = this;
                java.io.File r0 = r3.f1269a
                if (r0 == 0) goto L5
                return r0
            L5:
                c.a.b.i.a$a r0 = r3.f1271c
                if (r0 != 0) goto L17
                java.io.File r0 = new java.io.File
                c.a.b.i.a r1 = r3.e
                java.io.File r1 = r1.a()
                java.lang.String r2 = r3.f1270b
                r0.<init>(r1, r2)
                goto L24
            L17:
                java.io.File r0 = new java.io.File
                c.a.b.i.a$a r1 = r3.f1271c
                java.io.File r1 = r1.b()
                java.lang.String r2 = r3.f1270b
                r0.<init>(r1, r2)
            L24:
                r3.f1269a = r0
                return r0
        }

        public java.lang.String c() {
                r0 = this;
                java.lang.String r0 = r0.f1270b
                return r0
        }

        public c.a.b.i.a.C0053a d() {
                r0 = this;
                c.a.b.i.a$a r0 = r0.f1271c
                return r0
        }
    }

    public a(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.f1267a = r1
            java.io.File r0 = r0.c()
            r0.mkdirs()
            return
    }

    public static java.lang.String a(java.io.File r4, java.lang.String r5, java.lang.String r6, boolean r7) {
            a(r4)
            java.io.File r0 = new java.io.File
            r0.<init>(r4, r5)
            r4 = 0
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L53
            r5.<init>()     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L53
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L47
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L47
            r4 = 8192(0x2000, float:1.148E-41)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L48
        L17:
            int r0 = r1.read(r4)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L48
            if (r0 <= 0) goto L22
            r2 = 0
            r5.write(r4, r2, r0)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L48
            goto L17
        L22:
            byte[] r4 = r5.toByteArray()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L48
            if (r7 == 0) goto L31
            c.a.b.e.b.c r7 = new c.a.b.e.b.c     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L48
            r7.<init>()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L48
            byte[] r4 = r7.b(r4)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L48
        L31:
            java.lang.String r7 = new java.lang.String     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L48
            r7.<init>(r4, r6)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L48
            c.a.b.k.c.a(r1)
            c.a.b.k.c.a(r5)
            return r7
        L3d:
            r4 = move-exception
            r3 = r5
            r5 = r4
            r4 = r3
            goto L4c
        L42:
            r6 = move-exception
            r1 = r4
            r4 = r5
            r5 = r6
            goto L4c
        L47:
            r1 = r4
        L48:
            r4 = r5
            goto L54
        L4a:
            r5 = move-exception
            r1 = r4
        L4c:
            c.a.b.k.c.a(r1)
            c.a.b.k.c.a(r4)
            throw r5
        L53:
            r1 = r4
        L54:
            c.a.b.k.c.a(r1)
            c.a.b.k.c.a(r4)
            java.lang.String r4 = ""
            return r4
    }

    public static void a(java.io.File r0) {
            r0.mkdirs()
            return
    }

    public static boolean a(java.io.File r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, boolean r6) {
            a(r2)
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r3)
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L39
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L39
            if (r6 == 0) goto L21
            c.a.b.e.b.c r2 = new c.a.b.e.b.c     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L32
            r2.<init>()     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L32
            byte[] r4 = r4.getBytes()     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L32
            byte[] r2 = r2.a(r4)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L32
            r3.write(r2)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L32
            goto L28
        L21:
            byte[] r2 = r4.getBytes(r5)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L32
            r3.write(r2)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L32
        L28:
            c.a.b.k.c.a(r3)
            r2 = 1
            return r2
        L2d:
            r2 = move-exception
            r1 = r3
            r3 = r2
            r2 = r1
            goto L35
        L32:
            r2 = r3
            goto L39
        L34:
            r3 = move-exception
        L35:
            c.a.b.k.c.a(r2)
            throw r3
        L39:
            c.a.b.k.c.a(r2)
            r2 = 0
            return r2
    }

    private java.io.File c() {
            r2 = this;
            java.io.File r0 = new java.io.File
            java.io.File r2 = r2.a()
            java.lang.String r1 = ".cesium"
            r0.<init>(r2, r1)
            return r0
    }

    public java.io.File a() {
            r1 = this;
            java.io.File r0 = new java.io.File
            android.content.Context r1 = r1.f1267a
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo()
            java.lang.String r1 = r1.dataDir
            r0.<init>(r1)
            return r0
    }

    public synchronized c.a.b.i.a.C0053a b() {
            r3 = this;
            monitor-enter(r3)
            c.a.b.i.a$a r0 = r3.f1268b     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto Lf
            c.a.b.i.a$a r0 = new c.a.b.i.a$a     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = ".cesium"
            r2 = 0
            r0.<init>(r3, r1, r2)     // Catch: java.lang.Throwable -> L13
            r3.f1268b = r0     // Catch: java.lang.Throwable -> L13
        Lf:
            c.a.b.i.a$a r0 = r3.f1268b     // Catch: java.lang.Throwable -> L13
            monitor-exit(r3)
            return r0
        L13:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }
}
