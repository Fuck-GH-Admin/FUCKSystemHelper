package android.support.constraint.n.k.m;

/* JADX INFO: loaded from: classes.dex */
public class o {
    static int f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    java.util.ArrayList<android.support.constraint.n.k.e> f519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f521c;
    java.util.ArrayList<android.support.constraint.n.k.m.o.a> d;
    private int e;

    class a {
        public a(android.support.constraint.n.k.m.o r1, android.support.constraint.n.k.e r2, android.support.constraint.n.d r3, int r4) {
                r0 = this;
                r0.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                android.support.constraint.n.k.d r0 = r2.F
                r3.b(r0)
                android.support.constraint.n.k.d r0 = r2.G
                r3.b(r0)
                android.support.constraint.n.k.d r0 = r2.H
                r3.b(r0)
                android.support.constraint.n.k.d r0 = r2.I
                r3.b(r0)
                android.support.constraint.n.k.d r0 = r2.J
                r3.b(r0)
                return
        }
    }

    static {
            return
    }

    public o(int r3) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f519a = r0
            r0 = -1
            r2.f520b = r0
            r1 = 0
            r2.f521c = r1
            r1 = 0
            r2.d = r1
            r2.e = r0
            int r0 = android.support.constraint.n.k.m.o.f
            int r1 = r0 + 1
            android.support.constraint.n.k.m.o.f = r1
            r2.f520b = r0
            r2.f521c = r3
            return
    }

    private int a(android.support.constraint.n.d r5, java.util.ArrayList<android.support.constraint.n.k.e> r6, int r7) {
            r4 = this;
            r0 = 0
            java.lang.Object r1 = r6.get(r0)
            android.support.constraint.n.k.e r1 = (android.support.constraint.n.k.e) r1
            android.support.constraint.n.k.e r1 = r1.v()
            android.support.constraint.n.k.f r1 = (android.support.constraint.n.k.f) r1
            r5.f()
            r1.a(r5, r0)
            r2 = r0
        L14:
            int r3 = r6.size()
            if (r2 >= r3) goto L26
            java.lang.Object r3 = r6.get(r2)
            android.support.constraint.n.k.e r3 = (android.support.constraint.n.k.e) r3
            r3.a(r5, r0)
            int r2 = r2 + 1
            goto L14
        L26:
            if (r7 != 0) goto L2f
            int r2 = r1.y0
            if (r2 <= 0) goto L2f
            android.support.constraint.n.k.b.a(r1, r5, r6, r0)
        L2f:
            r2 = 1
            if (r7 != r2) goto L39
            int r3 = r1.z0
            if (r3 <= 0) goto L39
            android.support.constraint.n.k.b.a(r1, r5, r6, r2)
        L39:
            r5.e()     // Catch: java.lang.Exception -> L3d
            goto L41
        L3d:
            r2 = move-exception
            r2.printStackTrace()
        L41:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r4.d = r2
        L48:
            int r2 = r6.size()
            if (r0 >= r2) goto L61
            java.lang.Object r2 = r6.get(r0)
            android.support.constraint.n.k.e r2 = (android.support.constraint.n.k.e) r2
            android.support.constraint.n.k.m.o$a r3 = new android.support.constraint.n.k.m.o$a
            r3.<init>(r4, r2, r5, r7)
            java.util.ArrayList<android.support.constraint.n.k.m.o$a> r2 = r4.d
            r2.add(r3)
            int r0 = r0 + 1
            goto L48
        L61:
            if (r7 != 0) goto L74
            android.support.constraint.n.k.d r4 = r1.F
            int r4 = r5.b(r4)
            android.support.constraint.n.k.d r6 = r1.H
        L6b:
            int r6 = r5.b(r6)
            r5.f()
            int r6 = r6 - r4
            return r6
        L74:
            android.support.constraint.n.k.d r4 = r1.G
            int r4 = r5.b(r4)
            android.support.constraint.n.k.d r6 = r1.I
            goto L6b
    }

    private java.lang.String c() {
            r1 = this;
            int r1 = r1.f521c
            if (r1 != 0) goto L7
            java.lang.String r1 = "Horizontal"
            return r1
        L7:
            r0 = 1
            if (r1 != r0) goto Ld
            java.lang.String r1 = "Vertical"
            return r1
        Ld:
            r0 = 2
            if (r1 != r0) goto L13
            java.lang.String r1 = "Both"
            return r1
        L13:
            java.lang.String r1 = "Unknown"
            return r1
    }

    public int a() {
            r0 = this;
            int r0 = r0.f520b
            return r0
    }

    public int a(android.support.constraint.n.d r2, int r3) {
            r1 = this;
            java.util.ArrayList<android.support.constraint.n.k.e> r0 = r1.f519a
            int r0 = r0.size()
            if (r0 != 0) goto La
            r1 = 0
            return r1
        La:
            java.util.ArrayList<android.support.constraint.n.k.e> r0 = r1.f519a
            int r1 = r1.a(r2, r0, r3)
            return r1
    }

    public void a(int r1) {
            r0 = this;
            r0.f521c = r1
            return
    }

    public void a(int r4, android.support.constraint.n.k.m.o r5) {
            r3 = this;
            java.util.ArrayList<android.support.constraint.n.k.e> r0 = r3.f519a
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()
            android.support.constraint.n.k.e r1 = (android.support.constraint.n.k.e) r1
            r5.a(r1)
            int r2 = r5.a()
            if (r4 != 0) goto L1e
            r1.m0 = r2
            goto L6
        L1e:
            r1.n0 = r2
            goto L6
        L21:
            int r4 = r5.f520b
            r3.e = r4
            return
    }

    public void a(java.util.ArrayList<android.support.constraint.n.k.m.o> r6) {
            r5 = this;
            java.util.ArrayList<android.support.constraint.n.k.e> r0 = r5.f519a
            int r0 = r0.size()
            int r1 = r5.e
            r2 = -1
            if (r1 == r2) goto L28
            if (r0 <= 0) goto L28
            r1 = 0
        Le:
            int r2 = r6.size()
            if (r1 >= r2) goto L28
            java.lang.Object r2 = r6.get(r1)
            android.support.constraint.n.k.m.o r2 = (android.support.constraint.n.k.m.o) r2
            int r3 = r5.e
            int r4 = r2.f520b
            if (r3 != r4) goto L25
            int r3 = r5.f521c
            r5.a(r3, r2)
        L25:
            int r1 = r1 + 1
            goto Le
        L28:
            if (r0 != 0) goto L2d
            r6.remove(r5)
        L2d:
            return
    }

    public void a(boolean r1) {
            r0 = this;
            return
    }

    public boolean a(android.support.constraint.n.k.e r2) {
            r1 = this;
            java.util.ArrayList<android.support.constraint.n.k.e> r0 = r1.f519a
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto La
            r1 = 0
            return r1
        La:
            java.util.ArrayList<android.support.constraint.n.k.e> r1 = r1.f519a
            r1.add(r2)
            r1 = 1
            return r1
    }

    public int b() {
            r0 = this;
            int r0 = r0.f521c
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.c()
            r0.append(r1)
            java.lang.String r1 = " ["
            r0.append(r1)
            int r1 = r3.f520b
            r0.append(r1)
            java.lang.String r1 = "] <"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.util.ArrayList<android.support.constraint.n.k.e> r3 = r3.f519a
            java.util.Iterator r3 = r3.iterator()
        L25:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L4a
            java.lang.Object r1 = r3.next()
            android.support.constraint.n.k.e r1 = (android.support.constraint.n.k.e) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = " "
            r2.append(r0)
            java.lang.String r0 = r1.h()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L25
        L4a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = " >"
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            return r3
    }
}
