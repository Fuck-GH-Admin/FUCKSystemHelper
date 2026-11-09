package android.support.constraint.n.k.m;

/* JADX INFO: loaded from: classes.dex */
public class f implements android.support.constraint.n.k.m.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public android.support.constraint.n.k.m.d f508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f510c;
    android.support.constraint.n.k.m.p d;
    android.support.constraint.n.k.m.f.a e;
    int f;
    public int g;
    int h;
    android.support.constraint.n.k.m.g i;
    public boolean j;
    java.util.List<android.support.constraint.n.k.m.d> k;
    java.util.List<android.support.constraint.n.k.m.f> l;

    static final enum a extends java.lang.Enum<android.support.constraint.n.k.m.f.a> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final android.support.constraint.n.k.m.f.a f511b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final android.support.constraint.n.k.m.f.a f512c = null;
        public static final android.support.constraint.n.k.m.f.a d = null;
        public static final android.support.constraint.n.k.m.f.a e = null;
        public static final android.support.constraint.n.k.m.f.a f = null;
        public static final android.support.constraint.n.k.m.f.a g = null;
        public static final android.support.constraint.n.k.m.f.a h = null;
        public static final android.support.constraint.n.k.m.f.a i = null;
        private static final /* synthetic */ android.support.constraint.n.k.m.f.a[] j = null;

        static {
                android.support.constraint.n.k.m.f$a r0 = new android.support.constraint.n.k.m.f$a
                r1 = 0
                java.lang.String r2 = "UNKNOWN"
                r0.<init>(r2, r1)
                android.support.constraint.n.k.m.f.a.f511b = r0
                android.support.constraint.n.k.m.f$a r0 = new android.support.constraint.n.k.m.f$a
                r2 = 1
                java.lang.String r3 = "HORIZONTAL_DIMENSION"
                r0.<init>(r3, r2)
                android.support.constraint.n.k.m.f.a.f512c = r0
                android.support.constraint.n.k.m.f$a r0 = new android.support.constraint.n.k.m.f$a
                r3 = 2
                java.lang.String r4 = "VERTICAL_DIMENSION"
                r0.<init>(r4, r3)
                android.support.constraint.n.k.m.f.a.d = r0
                android.support.constraint.n.k.m.f$a r0 = new android.support.constraint.n.k.m.f$a
                r4 = 3
                java.lang.String r5 = "LEFT"
                r0.<init>(r5, r4)
                android.support.constraint.n.k.m.f.a.e = r0
                android.support.constraint.n.k.m.f$a r0 = new android.support.constraint.n.k.m.f$a
                r5 = 4
                java.lang.String r6 = "RIGHT"
                r0.<init>(r6, r5)
                android.support.constraint.n.k.m.f.a.f = r0
                android.support.constraint.n.k.m.f$a r0 = new android.support.constraint.n.k.m.f$a
                r6 = 5
                java.lang.String r7 = "TOP"
                r0.<init>(r7, r6)
                android.support.constraint.n.k.m.f.a.g = r0
                android.support.constraint.n.k.m.f$a r0 = new android.support.constraint.n.k.m.f$a
                r7 = 6
                java.lang.String r8 = "BOTTOM"
                r0.<init>(r8, r7)
                android.support.constraint.n.k.m.f.a.h = r0
                android.support.constraint.n.k.m.f$a r0 = new android.support.constraint.n.k.m.f$a
                r8 = 7
                java.lang.String r9 = "BASELINE"
                r0.<init>(r9, r8)
                android.support.constraint.n.k.m.f.a.i = r0
                r9 = 8
                android.support.constraint.n.k.m.f$a[] r9 = new android.support.constraint.n.k.m.f.a[r9]
                android.support.constraint.n.k.m.f$a r10 = android.support.constraint.n.k.m.f.a.f511b
                r9[r1] = r10
                android.support.constraint.n.k.m.f$a r1 = android.support.constraint.n.k.m.f.a.f512c
                r9[r2] = r1
                android.support.constraint.n.k.m.f$a r1 = android.support.constraint.n.k.m.f.a.d
                r9[r3] = r1
                android.support.constraint.n.k.m.f$a r1 = android.support.constraint.n.k.m.f.a.e
                r9[r4] = r1
                android.support.constraint.n.k.m.f$a r1 = android.support.constraint.n.k.m.f.a.f
                r9[r5] = r1
                android.support.constraint.n.k.m.f$a r1 = android.support.constraint.n.k.m.f.a.g
                r9[r6] = r1
                android.support.constraint.n.k.m.f$a r1 = android.support.constraint.n.k.m.f.a.h
                r9[r7] = r1
                r9[r8] = r0
                android.support.constraint.n.k.m.f.a.j = r9
                return
        }

        private a(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static android.support.constraint.n.k.m.f.a valueOf(java.lang.String r1) {
                java.lang.Class<android.support.constraint.n.k.m.f$a> r0 = android.support.constraint.n.k.m.f.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                android.support.constraint.n.k.m.f$a r1 = (android.support.constraint.n.k.m.f.a) r1
                return r1
        }

        public static android.support.constraint.n.k.m.f.a[] values() {
                android.support.constraint.n.k.m.f$a[] r0 = android.support.constraint.n.k.m.f.a.j
                java.lang.Object r0 = r0.clone()
                android.support.constraint.n.k.m.f$a[] r0 = (android.support.constraint.n.k.m.f.a[]) r0
                return r0
        }
    }

    public f(android.support.constraint.n.k.m.p r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f508a = r0
            r1 = 0
            r3.f509b = r1
            r3.f510c = r1
            android.support.constraint.n.k.m.f$a r2 = android.support.constraint.n.k.m.f.a.f511b
            r3.e = r2
            r2 = 1
            r3.h = r2
            r3.i = r0
            r3.j = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.k = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.l = r0
            r3.d = r4
            return
    }

    public void a() {
            r1 = this;
            java.util.List<android.support.constraint.n.k.m.f> r0 = r1.l
            r0.clear()
            java.util.List<android.support.constraint.n.k.m.d> r0 = r1.k
            r0.clear()
            r0 = 0
            r1.j = r0
            r1.g = r0
            r1.f510c = r0
            r1.f509b = r0
            return
    }

    public void a(int r2) {
            r1 = this;
            boolean r0 = r1.j
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.j = r0
            r1.g = r2
            java.util.List<android.support.constraint.n.k.m.d> r1 = r1.k
            java.util.Iterator r1 = r1.iterator()
        L10:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L20
            java.lang.Object r2 = r1.next()
            android.support.constraint.n.k.m.d r2 = (android.support.constraint.n.k.m.d) r2
            r2.a(r2)
            goto L10
        L20:
            return
    }

    @Override // android.support.constraint.n.k.m.d
    public void a(android.support.constraint.n.k.m.d r6) {
            r5 = this;
            java.util.List<android.support.constraint.n.k.m.f> r6 = r5.l
            java.util.Iterator r6 = r6.iterator()
        L6:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L17
            java.lang.Object r0 = r6.next()
            android.support.constraint.n.k.m.f r0 = (android.support.constraint.n.k.m.f) r0
            boolean r0 = r0.j
            if (r0 != 0) goto L6
            return
        L17:
            r6 = 1
            r5.f510c = r6
            android.support.constraint.n.k.m.d r0 = r5.f508a
            if (r0 == 0) goto L21
            r0.a(r5)
        L21:
            boolean r0 = r5.f509b
            if (r0 == 0) goto L2b
            android.support.constraint.n.k.m.p r6 = r5.d
            r6.a(r5)
            return
        L2b:
            r0 = 0
            r1 = 0
            java.util.List<android.support.constraint.n.k.m.f> r2 = r5.l
            java.util.Iterator r2 = r2.iterator()
        L33:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L48
            java.lang.Object r3 = r2.next()
            android.support.constraint.n.k.m.f r3 = (android.support.constraint.n.k.m.f) r3
            boolean r4 = r3 instanceof android.support.constraint.n.k.m.g
            if (r4 == 0) goto L44
            goto L33
        L44:
            int r1 = r1 + 1
            r0 = r3
            goto L33
        L48:
            if (r0 == 0) goto L69
            if (r1 != r6) goto L69
            boolean r6 = r0.j
            if (r6 == 0) goto L69
            android.support.constraint.n.k.m.g r6 = r5.i
            if (r6 == 0) goto L61
            boolean r1 = r6.j
            if (r1 == 0) goto L60
            int r1 = r5.h
            int r6 = r6.g
            int r1 = r1 * r6
            r5.f = r1
            goto L61
        L60:
            return
        L61:
            int r6 = r0.g
            int r0 = r5.f
            int r6 = r6 + r0
            r5.a(r6)
        L69:
            android.support.constraint.n.k.m.d r6 = r5.f508a
            if (r6 == 0) goto L70
            r6.a(r5)
        L70:
            return
    }

    public void b(android.support.constraint.n.k.m.d r2) {
            r1 = this;
            java.util.List<android.support.constraint.n.k.m.d> r0 = r1.k
            r0.add(r2)
            boolean r1 = r1.j
            if (r1 == 0) goto Lc
            r2.a(r2)
        Lc:
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.support.constraint.n.k.m.p r1 = r2.d
            android.support.constraint.n.k.e r1 = r1.f523b
            java.lang.String r1 = r1.h()
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            android.support.constraint.n.k.m.f$a r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = "("
            r0.append(r1)
            boolean r1 = r2.j
            if (r1 == 0) goto L2a
            int r1 = r2.g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L2c
        L2a:
            java.lang.String r1 = "unresolved"
        L2c:
            r0.append(r1)
            java.lang.String r1 = ") <t="
            r0.append(r1)
            java.util.List<android.support.constraint.n.k.m.f> r1 = r2.l
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r1 = ":d="
            r0.append(r1)
            java.util.List<android.support.constraint.n.k.m.d> r2 = r2.k
            int r2 = r2.size()
            r0.append(r2)
            java.lang.String r2 = ">"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
