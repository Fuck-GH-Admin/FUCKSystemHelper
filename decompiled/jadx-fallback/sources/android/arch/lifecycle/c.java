package android.arch.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    public static final enum a extends java.lang.Enum<android.arch.lifecycle.c.a> {
        private static final /* synthetic */ android.arch.lifecycle.c.a[] $VALUES = null;
        public static final android.arch.lifecycle.c.a ON_ANY = null;
        public static final android.arch.lifecycle.c.a ON_CREATE = null;
        public static final android.arch.lifecycle.c.a ON_DESTROY = null;
        public static final android.arch.lifecycle.c.a ON_PAUSE = null;
        public static final android.arch.lifecycle.c.a ON_RESUME = null;
        public static final android.arch.lifecycle.c.a ON_START = null;
        public static final android.arch.lifecycle.c.a ON_STOP = null;

        static {
                android.arch.lifecycle.c$a r0 = new android.arch.lifecycle.c$a
                r1 = 0
                java.lang.String r2 = "ON_CREATE"
                r0.<init>(r2, r1)
                android.arch.lifecycle.c.a.ON_CREATE = r0
                android.arch.lifecycle.c$a r0 = new android.arch.lifecycle.c$a
                r2 = 1
                java.lang.String r3 = "ON_START"
                r0.<init>(r3, r2)
                android.arch.lifecycle.c.a.ON_START = r0
                android.arch.lifecycle.c$a r0 = new android.arch.lifecycle.c$a
                r3 = 2
                java.lang.String r4 = "ON_RESUME"
                r0.<init>(r4, r3)
                android.arch.lifecycle.c.a.ON_RESUME = r0
                android.arch.lifecycle.c$a r0 = new android.arch.lifecycle.c$a
                r4 = 3
                java.lang.String r5 = "ON_PAUSE"
                r0.<init>(r5, r4)
                android.arch.lifecycle.c.a.ON_PAUSE = r0
                android.arch.lifecycle.c$a r0 = new android.arch.lifecycle.c$a
                r5 = 4
                java.lang.String r6 = "ON_STOP"
                r0.<init>(r6, r5)
                android.arch.lifecycle.c.a.ON_STOP = r0
                android.arch.lifecycle.c$a r0 = new android.arch.lifecycle.c$a
                r6 = 5
                java.lang.String r7 = "ON_DESTROY"
                r0.<init>(r7, r6)
                android.arch.lifecycle.c.a.ON_DESTROY = r0
                android.arch.lifecycle.c$a r0 = new android.arch.lifecycle.c$a
                r7 = 6
                java.lang.String r8 = "ON_ANY"
                r0.<init>(r8, r7)
                android.arch.lifecycle.c.a.ON_ANY = r0
                r8 = 7
                android.arch.lifecycle.c$a[] r8 = new android.arch.lifecycle.c.a[r8]
                android.arch.lifecycle.c$a r9 = android.arch.lifecycle.c.a.ON_CREATE
                r8[r1] = r9
                android.arch.lifecycle.c$a r1 = android.arch.lifecycle.c.a.ON_START
                r8[r2] = r1
                android.arch.lifecycle.c$a r1 = android.arch.lifecycle.c.a.ON_RESUME
                r8[r3] = r1
                android.arch.lifecycle.c$a r1 = android.arch.lifecycle.c.a.ON_PAUSE
                r8[r4] = r1
                android.arch.lifecycle.c$a r1 = android.arch.lifecycle.c.a.ON_STOP
                r8[r5] = r1
                android.arch.lifecycle.c$a r1 = android.arch.lifecycle.c.a.ON_DESTROY
                r8[r6] = r1
                r8[r7] = r0
                android.arch.lifecycle.c.a.$VALUES = r8
                return
        }

        private a(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static android.arch.lifecycle.c.a valueOf(java.lang.String r1) {
                java.lang.Class<android.arch.lifecycle.c$a> r0 = android.arch.lifecycle.c.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                android.arch.lifecycle.c$a r1 = (android.arch.lifecycle.c.a) r1
                return r1
        }

        public static android.arch.lifecycle.c.a[] values() {
                android.arch.lifecycle.c$a[] r0 = android.arch.lifecycle.c.a.$VALUES
                java.lang.Object r0 = r0.clone()
                android.arch.lifecycle.c$a[] r0 = (android.arch.lifecycle.c.a[]) r0
                return r0
        }
    }

    public static final enum b extends java.lang.Enum<android.arch.lifecycle.c.b> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final android.arch.lifecycle.c.b f390b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final android.arch.lifecycle.c.b f391c = null;
        public static final android.arch.lifecycle.c.b d = null;
        public static final android.arch.lifecycle.c.b e = null;
        public static final android.arch.lifecycle.c.b f = null;
        private static final /* synthetic */ android.arch.lifecycle.c.b[] g = null;

        static {
                android.arch.lifecycle.c$b r0 = new android.arch.lifecycle.c$b
                r1 = 0
                java.lang.String r2 = "DESTROYED"
                r0.<init>(r2, r1)
                android.arch.lifecycle.c.b.f390b = r0
                android.arch.lifecycle.c$b r0 = new android.arch.lifecycle.c$b
                r2 = 1
                java.lang.String r3 = "INITIALIZED"
                r0.<init>(r3, r2)
                android.arch.lifecycle.c.b.f391c = r0
                android.arch.lifecycle.c$b r0 = new android.arch.lifecycle.c$b
                r3 = 2
                java.lang.String r4 = "CREATED"
                r0.<init>(r4, r3)
                android.arch.lifecycle.c.b.d = r0
                android.arch.lifecycle.c$b r0 = new android.arch.lifecycle.c$b
                r4 = 3
                java.lang.String r5 = "STARTED"
                r0.<init>(r5, r4)
                android.arch.lifecycle.c.b.e = r0
                android.arch.lifecycle.c$b r0 = new android.arch.lifecycle.c$b
                r5 = 4
                java.lang.String r6 = "RESUMED"
                r0.<init>(r6, r5)
                android.arch.lifecycle.c.b.f = r0
                r6 = 5
                android.arch.lifecycle.c$b[] r6 = new android.arch.lifecycle.c.b[r6]
                android.arch.lifecycle.c$b r7 = android.arch.lifecycle.c.b.f390b
                r6[r1] = r7
                android.arch.lifecycle.c$b r1 = android.arch.lifecycle.c.b.f391c
                r6[r2] = r1
                android.arch.lifecycle.c$b r1 = android.arch.lifecycle.c.b.d
                r6[r3] = r1
                android.arch.lifecycle.c$b r1 = android.arch.lifecycle.c.b.e
                r6[r4] = r1
                r6[r5] = r0
                android.arch.lifecycle.c.b.g = r6
                return
        }

        private b(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static android.arch.lifecycle.c.b valueOf(java.lang.String r1) {
                java.lang.Class<android.arch.lifecycle.c$b> r0 = android.arch.lifecycle.c.b.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                android.arch.lifecycle.c$b r1 = (android.arch.lifecycle.c.b) r1
                return r1
        }

        public static android.arch.lifecycle.c.b[] values() {
                android.arch.lifecycle.c$b[] r0 = android.arch.lifecycle.c.b.g
                java.lang.Object r0 = r0.clone()
                android.arch.lifecycle.c$b[] r0 = (android.arch.lifecycle.c.b[]) r0
                return r0
        }

        public boolean a(android.arch.lifecycle.c.b r1) {
                r0 = this;
                int r0 = r0.compareTo(r1)
                if (r0 < 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }
    }

    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract android.arch.lifecycle.c.b a();

    public abstract void a(android.arch.lifecycle.d r1);

    public abstract void b(android.arch.lifecycle.d r1);
}
