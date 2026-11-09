package b.b.c.d;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final b.b.c.f.g<java.lang.String, android.graphics.Typeface> f1039a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b.b.c.d.c f1040b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final java.lang.Object f1041c = null;
    static final b.b.c.f.k<java.lang.String, java.util.ArrayList<b.b.c.d.c.d<b.b.c.d.b.g>>> d = null;
    private static final java.util.Comparator<byte[]> e = null;

    static class a implements java.util.concurrent.Callable<b.b.c.d.b.g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.content.Context f1042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b.b.c.d.a f1043b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f1044c;
        final /* synthetic */ java.lang.String d;

        a(android.content.Context r1, b.b.c.d.a r2, int r3, java.lang.String r4) {
                r0 = this;
                r0.f1042a = r1
                r0.f1043b = r2
                r0.f1044c = r3
                r0.d = r4
                r0.<init>()
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public b.b.c.d.b.g call() {
                r3 = this;
                android.content.Context r0 = r3.f1042a
                b.b.c.d.a r1 = r3.f1043b
                int r2 = r3.f1044c
                b.b.c.d.b$g r0 = b.b.c.d.b.a(r0, r1, r2)
                android.graphics.Typeface r1 = r0.f1053a
                if (r1 == 0) goto L15
                b.b.c.f.g<java.lang.String, android.graphics.Typeface> r2 = b.b.c.d.b.f1039a
                java.lang.String r3 = r3.d
                r2.a(r3, r1)
            L15:
                return r0
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ b.b.c.d.b.g call() {
                r0 = this;
                b.b.c.d.b$g r0 = r0.call()
                return r0
        }
    }

    /* JADX INFO: renamed from: b.b.c.d.b$b, reason: collision with other inner class name */
    static class C0042b implements b.b.c.d.c.d<b.b.c.d.b.g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b.b.c.a.d.f.a f1045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.os.Handler f1046b;

        C0042b(b.b.c.a.d.f.a r1, android.os.Handler r2) {
                r0 = this;
                r0.f1045a = r1
                r0.f1046b = r2
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method */
        public void a2(b.b.c.d.b.g r2) {
                r1 = this;
                if (r2 != 0) goto Lb
                b.b.c.a.d.f$a r2 = r1.f1045a
                r0 = 1
            L5:
                android.os.Handler r1 = r1.f1046b
                r2.a(r0, r1)
                goto L1c
            Lb:
                int r0 = r2.f1054b
                if (r0 != 0) goto L19
                b.b.c.a.d.f$a r0 = r1.f1045a
                android.graphics.Typeface r2 = r2.f1053a
                android.os.Handler r1 = r1.f1046b
                r0.a(r2, r1)
                goto L1c
            L19:
                b.b.c.a.d.f$a r2 = r1.f1045a
                goto L5
            L1c:
                return
        }

        @Override // b.b.c.d.c.d
        public /* bridge */ /* synthetic */ void a(b.b.c.d.b.g r1) {
                r0 = this;
                b.b.c.d.b$g r1 = (b.b.c.d.b.g) r1
                r0.a2(r1)
                return
        }
    }

    static class c implements b.b.c.d.c.d<b.b.c.d.b.g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f1047a;

        c(java.lang.String r1) {
                r0 = this;
                r0.f1047a = r1
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method */
        public void a2(b.b.c.d.b.g r4) {
                r3 = this;
                java.lang.Object r0 = b.b.c.d.b.f1041c
                monitor-enter(r0)
                b.b.c.f.k<java.lang.String, java.util.ArrayList<b.b.c.d.c$d<b.b.c.d.b$g>>> r1 = b.b.c.d.b.d     // Catch: java.lang.Throwable -> L2d
                java.lang.String r2 = r3.f1047a     // Catch: java.lang.Throwable -> L2d
                java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L2d
                java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> L2d
                if (r1 != 0) goto L11
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
                return
            L11:
                b.b.c.f.k<java.lang.String, java.util.ArrayList<b.b.c.d.c$d<b.b.c.d.b$g>>> r2 = b.b.c.d.b.d     // Catch: java.lang.Throwable -> L2d
                java.lang.String r3 = r3.f1047a     // Catch: java.lang.Throwable -> L2d
                r2.remove(r3)     // Catch: java.lang.Throwable -> L2d
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
                r3 = 0
            L1a:
                int r0 = r1.size()
                if (r3 >= r0) goto L2c
                java.lang.Object r0 = r1.get(r3)
                b.b.c.d.c$d r0 = (b.b.c.d.c.d) r0
                r0.a(r4)
                int r3 = r3 + 1
                goto L1a
            L2c:
                return
            L2d:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
                throw r3
        }

        @Override // b.b.c.d.c.d
        public /* bridge */ /* synthetic */ void a(b.b.c.d.b.g r1) {
                r0 = this;
                b.b.c.d.b$g r1 = (b.b.c.d.b.g) r1
                r0.a2(r1)
                return
        }
    }

    static class d implements java.util.Comparator<byte[]> {
        d() {
                r0 = this;
                r0.<init>()
                return
        }

        public int a(byte[] r4, byte[] r5) {
                r3 = this;
                int r3 = r4.length
                int r0 = r5.length
                if (r3 == r0) goto L8
                int r3 = r4.length
                int r4 = r5.length
            L6:
                int r3 = r3 - r4
                return r3
            L8:
                r3 = 0
                r0 = r3
            La:
                int r1 = r4.length
                if (r0 >= r1) goto L1b
                r1 = r4[r0]
                r2 = r5[r0]
                if (r1 == r2) goto L18
                r3 = r4[r0]
                r4 = r5[r0]
                goto L6
            L18:
                int r0 = r0 + 1
                goto La
            L1b:
                return r3
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(byte[] r1, byte[] r2) {
                r0 = this;
                byte[] r1 = (byte[]) r1
                byte[] r2 = (byte[]) r2
                int r0 = r0.a(r1, r2)
                return r0
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f1048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b.b.c.d.b.f[] f1049b;

        public e(int r1, b.b.c.d.b.f[] r2) {
                r0 = this;
                r0.<init>()
                r0.f1048a = r1
                r0.f1049b = r2
                return
        }

        public b.b.c.d.b.f[] a() {
                r0 = this;
                b.b.c.d.b$f[] r0 = r0.f1049b
                return r0
        }

        public int b() {
                r0 = this;
                int r0 = r0.f1048a
                return r0
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.net.Uri f1050a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f1051b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f1052c;
        private final boolean d;
        private final int e;

        public f(android.net.Uri r1, int r2, int r3, boolean r4, int r5) {
                r0 = this;
                r0.<init>()
                b.b.c.f.j.a(r1)
                android.net.Uri r1 = (android.net.Uri) r1
                r0.f1050a = r1
                r0.f1051b = r2
                r0.f1052c = r3
                r0.d = r4
                r0.e = r5
                return
        }

        public int a() {
                r0 = this;
                int r0 = r0.e
                return r0
        }

        public int b() {
                r0 = this;
                int r0 = r0.f1051b
                return r0
        }

        public android.net.Uri c() {
                r0 = this;
                android.net.Uri r0 = r0.f1050a
                return r0
        }

        public int d() {
                r0 = this;
                int r0 = r0.f1052c
                return r0
        }

        public boolean e() {
                r0 = this;
                boolean r0 = r0.d
                return r0
        }
    }

    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final android.graphics.Typeface f1053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f1054b;

        g(android.graphics.Typeface r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.f1053a = r1
                r0.f1054b = r2
                return
        }
    }

    static {
            b.b.c.f.g r0 = new b.b.c.f.g
            r1 = 16
            r0.<init>(r1)
            b.b.c.d.b.f1039a = r0
            b.b.c.d.c r0 = new b.b.c.d.c
            java.lang.String r1 = "fonts"
            r2 = 10
            r3 = 10000(0x2710, float:1.4013E-41)
            r0.<init>(r1, r2, r3)
            b.b.c.d.b.f1040b = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            b.b.c.d.b.f1041c = r0
            b.b.c.f.k r0 = new b.b.c.f.k
            r0.<init>()
            b.b.c.d.b.d = r0
            b.b.c.d.b$d r0 = new b.b.c.d.b$d
            r0.<init>()
            b.b.c.d.b.e = r0
            return
    }

    public static android.content.pm.ProviderInfo a(android.content.pm.PackageManager r5, b.b.c.d.a r6, android.content.res.Resources r7) {
            java.lang.String r0 = r6.d()
            r1 = 0
            android.content.pm.ProviderInfo r2 = r5.resolveContentProvider(r0, r1)
            if (r2 == 0) goto L73
            java.lang.String r3 = r2.packageName
            java.lang.String r4 = r6.e()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L50
            java.lang.String r0 = r2.packageName
            r3 = 64
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r0, r3)
            android.content.pm.Signature[] r5 = r5.signatures
            java.util.List r5 = a(r5)
            java.util.Comparator<byte[]> r0 = b.b.c.d.b.e
            java.util.Collections.sort(r5, r0)
            java.util.List r6 = a(r6, r7)
        L2e:
            int r7 = r6.size()
            if (r1 >= r7) goto L4e
            java.util.ArrayList r7 = new java.util.ArrayList
            java.lang.Object r0 = r6.get(r1)
            java.util.Collection r0 = (java.util.Collection) r0
            r7.<init>(r0)
            java.util.Comparator<byte[]> r0 = b.b.c.d.b.e
            java.util.Collections.sort(r7, r0)
            boolean r7 = a(r5, r7)
            if (r7 == 0) goto L4b
            return r2
        L4b:
            int r1 = r1 + 1
            goto L2e
        L4e:
            r5 = 0
            return r5
        L50:
            android.content.pm.PackageManager$NameNotFoundException r5 = new android.content.pm.PackageManager$NameNotFoundException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "Found content provider "
            r7.append(r1)
            r7.append(r0)
            java.lang.String r0 = ", but package was not "
            r7.append(r0)
            java.lang.String r6 = r6.e()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.<init>(r6)
            throw r5
        L73:
            android.content.pm.PackageManager$NameNotFoundException r5 = new android.content.pm.PackageManager$NameNotFoundException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "No package found for authority: "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    public static android.graphics.Typeface a(android.content.Context r2, b.b.c.d.a r3, b.b.c.a.d.f.a r4, android.os.Handler r5, boolean r6, int r7, int r8) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.c()
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            b.b.c.f.g<java.lang.String, android.graphics.Typeface> r1 = b.b.c.d.b.f1039a
            java.lang.Object r1 = r1.b(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L28
            if (r4 == 0) goto L27
            r4.a(r1)
        L27:
            return r1
        L28:
            if (r6 == 0) goto L43
            r1 = -1
            if (r7 != r1) goto L43
            b.b.c.d.b$g r2 = a(r2, r3, r8)
            if (r4 == 0) goto L40
            int r3 = r2.f1054b
            if (r3 != 0) goto L3d
            android.graphics.Typeface r3 = r2.f1053a
            r4.a(r3, r5)
            goto L40
        L3d:
            r4.a(r3, r5)
        L40:
            android.graphics.Typeface r2 = r2.f1053a
            return r2
        L43:
            b.b.c.d.b$a r1 = new b.b.c.d.b$a
            r1.<init>(r2, r3, r8, r0)
            r2 = 0
            if (r6 == 0) goto L56
            b.b.c.d.c r3 = b.b.c.d.b.f1040b     // Catch: java.lang.InterruptedException -> L55
            java.lang.Object r3 = r3.a(r1, r7)     // Catch: java.lang.InterruptedException -> L55
            b.b.c.d.b$g r3 = (b.b.c.d.b.g) r3     // Catch: java.lang.InterruptedException -> L55
            android.graphics.Typeface r2 = r3.f1053a     // Catch: java.lang.InterruptedException -> L55
        L55:
            return r2
        L56:
            if (r4 != 0) goto L5a
            r3 = r2
            goto L5f
        L5a:
            b.b.c.d.b$b r3 = new b.b.c.d.b$b
            r3.<init>(r4, r5)
        L5f:
            java.lang.Object r4 = b.b.c.d.b.f1041c
            monitor-enter(r4)
            b.b.c.f.k<java.lang.String, java.util.ArrayList<b.b.c.d.c$d<b.b.c.d.b$g>>> r5 = b.b.c.d.b.d     // Catch: java.lang.Throwable -> L94
            boolean r5 = r5.containsKey(r0)     // Catch: java.lang.Throwable -> L94
            if (r5 == 0) goto L79
            if (r3 == 0) goto L77
            b.b.c.f.k<java.lang.String, java.util.ArrayList<b.b.c.d.c$d<b.b.c.d.b$g>>> r5 = b.b.c.d.b.d     // Catch: java.lang.Throwable -> L94
            java.lang.Object r5 = r5.get(r0)     // Catch: java.lang.Throwable -> L94
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch: java.lang.Throwable -> L94
            r5.add(r3)     // Catch: java.lang.Throwable -> L94
        L77:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L94
            return r2
        L79:
            if (r3 == 0) goto L88
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L94
            r5.<init>()     // Catch: java.lang.Throwable -> L94
            r5.add(r3)     // Catch: java.lang.Throwable -> L94
            b.b.c.f.k<java.lang.String, java.util.ArrayList<b.b.c.d.c$d<b.b.c.d.b$g>>> r3 = b.b.c.d.b.d     // Catch: java.lang.Throwable -> L94
            r3.put(r0, r5)     // Catch: java.lang.Throwable -> L94
        L88:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L94
            b.b.c.d.c r3 = b.b.c.d.b.f1040b
            b.b.c.d.b$c r4 = new b.b.c.d.b$c
            r4.<init>(r0)
            r3.a(r1, r4)
            return r2
        L94:
            r2 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L94
            throw r2
    }

    public static b.b.c.d.b.e a(android.content.Context r2, android.os.CancellationSignal r3, b.b.c.d.a r4) {
            android.content.pm.PackageManager r0 = r2.getPackageManager()
            android.content.res.Resources r1 = r2.getResources()
            android.content.pm.ProviderInfo r0 = a(r0, r4, r1)
            if (r0 != 0) goto L16
            b.b.c.d.b$e r2 = new b.b.c.d.b$e
            r3 = 1
            r4 = 0
            r2.<init>(r3, r4)
            return r2
        L16:
            java.lang.String r0 = r0.authority
            b.b.c.d.b$f[] r2 = a(r2, r4, r0, r3)
            b.b.c.d.b$e r3 = new b.b.c.d.b$e
            r4 = 0
            r3.<init>(r4, r2)
            return r3
    }

    static b.b.c.d.b.g a(android.content.Context r3, b.b.c.d.a r4, int r5) {
            r0 = 0
            b.b.c.d.b$e r4 = a(r3, r0, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2b
            int r1 = r4.b()
            r2 = -3
            if (r1 != 0) goto L1d
            b.b.c.d.b$f[] r4 = r4.a()
            android.graphics.Typeface r3 = b.b.c.b.c.a(r3, r0, r4, r5)
            b.b.c.d.b$g r4 = new b.b.c.d.b$g
            if (r3 == 0) goto L19
            r2 = 0
        L19:
            r4.<init>(r3, r2)
            return r4
        L1d:
            int r3 = r4.b()
            r4 = 1
            if (r3 != r4) goto L25
            r2 = -2
        L25:
            b.b.c.d.b$g r3 = new b.b.c.d.b$g
            r3.<init>(r0, r2)
            return r3
        L2b:
            b.b.c.d.b$g r3 = new b.b.c.d.b$g
            r4 = -1
            r3.<init>(r0, r4)
            return r3
    }

    private static java.util.List<java.util.List<byte[]>> a(b.b.c.d.a r1, android.content.res.Resources r2) {
            java.util.List r0 = r1.a()
            if (r0 == 0) goto Lb
            java.util.List r1 = r1.a()
            return r1
        Lb:
            int r1 = r1.b()
            java.util.List r1 = b.b.c.a.d.c.a(r2, r1)
            return r1
    }

    private static java.util.List<byte[]> a(android.content.pm.Signature[] r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r3.length
            if (r1 >= r2) goto L15
            r2 = r3[r1]
            byte[] r2 = r2.toByteArray()
            r0.add(r2)
            int r1 = r1 + 1
            goto L6
        L15:
            return r0
    }

    public static java.util.Map<android.net.Uri, java.nio.ByteBuffer> a(android.content.Context r5, b.b.c.d.b.f[] r6, android.os.CancellationSignal r7) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = r6.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L27
            r3 = r6[r2]
            int r4 = r3.a()
            if (r4 == 0) goto L12
            goto L24
        L12:
            android.net.Uri r3 = r3.c()
            boolean r4 = r0.containsKey(r3)
            if (r4 == 0) goto L1d
            goto L24
        L1d:
            java.nio.ByteBuffer r4 = b.b.c.b.i.a(r5, r7, r3)
            r0.put(r3, r4)
        L24:
            int r2 = r2 + 1
            goto L7
        L27:
            java.util.Map r5 = java.util.Collections.unmodifiableMap(r0)
            return r5
    }

    private static boolean a(java.util.List<byte[]> r4, java.util.List<byte[]> r5) {
            int r0 = r4.size()
            int r1 = r5.size()
            r2 = 0
            if (r0 == r1) goto Lc
            return r2
        Lc:
            r0 = r2
        Ld:
            int r1 = r4.size()
            if (r0 >= r1) goto L29
            java.lang.Object r1 = r4.get(r0)
            byte[] r1 = (byte[]) r1
            java.lang.Object r3 = r5.get(r0)
            byte[] r3 = (byte[]) r3
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 != 0) goto L26
            return r2
        L26:
            int r0 = r0 + 1
            goto Ld
        L29:
            r4 = 1
            return r4
    }

    static b.b.c.d.b.f[] a(android.content.Context r20, b.b.c.d.a r21, java.lang.String r22, android.os.CancellationSignal r23) {
            r0 = r22
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            java.lang.String r3 = "content"
            android.net.Uri$Builder r2 = r2.scheme(r3)
            android.net.Uri$Builder r2 = r2.authority(r0)
            android.net.Uri r2 = r2.build()
            android.net.Uri$Builder r4 = new android.net.Uri$Builder
            r4.<init>()
            android.net.Uri$Builder r3 = r4.scheme(r3)
            android.net.Uri$Builder r0 = r3.authority(r0)
            java.lang.String r3 = "file"
            android.net.Uri$Builder r0 = r0.appendPath(r3)
            android.net.Uri r0 = r0.build()
            r3 = 0
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L11c
            r5 = 16
            r11 = 1
            r12 = 0
            if (r4 <= r5) goto L63
            android.content.ContentResolver r4 = r20.getContentResolver()     // Catch: java.lang.Throwable -> L11c
            java.lang.String r13 = "_id"
            java.lang.String r14 = "file_id"
            java.lang.String r15 = "font_ttc_index"
            java.lang.String r16 = "font_variation_settings"
            java.lang.String r17 = "font_weight"
            java.lang.String r18 = "font_italic"
            java.lang.String r19 = "result_code"
            java.lang.String[] r6 = new java.lang.String[]{r13, r14, r15, r16, r17, r18, r19}     // Catch: java.lang.Throwable -> L11c
            java.lang.String r7 = "query = ?"
            java.lang.String[] r8 = new java.lang.String[r11]     // Catch: java.lang.Throwable -> L11c
            java.lang.String r5 = r21.f()     // Catch: java.lang.Throwable -> L11c
            r8[r12] = r5     // Catch: java.lang.Throwable -> L11c
            r9 = 0
            r5 = r2
            r10 = r23
            android.database.Cursor r3 = r4.query(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L11c
            goto L89
        L63:
            android.content.ContentResolver r4 = r20.getContentResolver()     // Catch: java.lang.Throwable -> L11c
            java.lang.String r13 = "_id"
            java.lang.String r14 = "file_id"
            java.lang.String r15 = "font_ttc_index"
            java.lang.String r16 = "font_variation_settings"
            java.lang.String r17 = "font_weight"
            java.lang.String r18 = "font_italic"
            java.lang.String r19 = "result_code"
            java.lang.String[] r6 = new java.lang.String[]{r13, r14, r15, r16, r17, r18, r19}     // Catch: java.lang.Throwable -> L11c
            java.lang.String r7 = "query = ?"
            java.lang.String[] r8 = new java.lang.String[r11]     // Catch: java.lang.Throwable -> L11c
            java.lang.String r5 = r21.f()     // Catch: java.lang.Throwable -> L11c
            r8[r12] = r5     // Catch: java.lang.Throwable -> L11c
            r9 = 0
            r5 = r2
            android.database.Cursor r3 = r4.query(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L11c
        L89:
            if (r3 == 0) goto L10e
            int r4 = r3.getCount()     // Catch: java.lang.Throwable -> L11c
            if (r4 <= 0) goto L10e
            java.lang.String r1 = "result_code"
            int r1 = r3.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L11c
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L11c
            r4.<init>()     // Catch: java.lang.Throwable -> L11c
            java.lang.String r5 = "_id"
            int r5 = r3.getColumnIndex(r5)     // Catch: java.lang.Throwable -> L11c
            java.lang.String r6 = "file_id"
            int r6 = r3.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L11c
            java.lang.String r7 = "font_ttc_index"
            int r7 = r3.getColumnIndex(r7)     // Catch: java.lang.Throwable -> L11c
            java.lang.String r8 = "font_weight"
            int r8 = r3.getColumnIndex(r8)     // Catch: java.lang.Throwable -> L11c
            java.lang.String r9 = "font_italic"
            int r9 = r3.getColumnIndex(r9)     // Catch: java.lang.Throwable -> L11c
        Lba:
            boolean r10 = r3.moveToNext()     // Catch: java.lang.Throwable -> L11c
            if (r10 == 0) goto L10d
            r10 = -1
            if (r1 == r10) goto Lca
            int r13 = r3.getInt(r1)     // Catch: java.lang.Throwable -> L11c
            r19 = r13
            goto Lcc
        Lca:
            r19 = r12
        Lcc:
            if (r7 == r10) goto Ld5
            int r13 = r3.getInt(r7)     // Catch: java.lang.Throwable -> L11c
            r16 = r13
            goto Ld7
        Ld5:
            r16 = r12
        Ld7:
            if (r6 != r10) goto Le2
            long r13 = r3.getLong(r5)     // Catch: java.lang.Throwable -> L11c
            android.net.Uri r13 = android.content.ContentUris.withAppendedId(r2, r13)     // Catch: java.lang.Throwable -> L11c
            goto Lea
        Le2:
            long r13 = r3.getLong(r6)     // Catch: java.lang.Throwable -> L11c
            android.net.Uri r13 = android.content.ContentUris.withAppendedId(r0, r13)     // Catch: java.lang.Throwable -> L11c
        Lea:
            r15 = r13
            if (r8 == r10) goto Lf2
            int r13 = r3.getInt(r8)     // Catch: java.lang.Throwable -> L11c
            goto Lf4
        Lf2:
            r13 = 400(0x190, float:5.6E-43)
        Lf4:
            r17 = r13
            if (r9 == r10) goto L101
            int r10 = r3.getInt(r9)     // Catch: java.lang.Throwable -> L11c
            if (r10 != r11) goto L101
            r18 = r11
            goto L103
        L101:
            r18 = r12
        L103:
            b.b.c.d.b$f r10 = new b.b.c.d.b$f     // Catch: java.lang.Throwable -> L11c
            r14 = r10
            r14.<init>(r15, r16, r17, r18, r19)     // Catch: java.lang.Throwable -> L11c
            r4.add(r10)     // Catch: java.lang.Throwable -> L11c
            goto Lba
        L10d:
            r1 = r4
        L10e:
            if (r3 == 0) goto L113
            r3.close()
        L113:
            b.b.c.d.b$f[] r0 = new b.b.c.d.b.f[r12]
            java.lang.Object[] r0 = r1.toArray(r0)
            b.b.c.d.b$f[] r0 = (b.b.c.d.b.f[]) r0
            return r0
        L11c:
            r0 = move-exception
            if (r3 == 0) goto L122
            r3.close()
        L122:
            throw r0
    }
}
