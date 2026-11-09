package android.support.constraint.n.k.m;

/* JADX INFO: loaded from: classes.dex */
class m {
    public static int d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    android.support.constraint.n.k.m.p f516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    java.util.ArrayList<android.support.constraint.n.k.m.p> f517c;

    public m(android.support.constraint.n.k.m.p r1, int r2) {
            r0 = this;
            r0.<init>()
            r2 = 0
            r0.f516b = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.f517c = r2
            int r2 = android.support.constraint.n.k.m.m.d
            int r2 = r2 + 1
            android.support.constraint.n.k.m.m.d = r2
            r0.f516b = r1
            return
    }

    private long a(android.support.constraint.n.k.m.f r9, long r10) {
            r8 = this;
            android.support.constraint.n.k.m.p r0 = r9.d
            boolean r1 = r0 instanceof android.support.constraint.n.k.m.k
            if (r1 == 0) goto L7
            return r10
        L7:
            java.util.List<android.support.constraint.n.k.m.d> r1 = r9.k
            int r1 = r1.size()
            r2 = 0
            r3 = r10
        Lf:
            if (r2 >= r1) goto L33
            java.util.List<android.support.constraint.n.k.m.d> r5 = r9.k
            java.lang.Object r5 = r5.get(r2)
            android.support.constraint.n.k.m.d r5 = (android.support.constraint.n.k.m.d) r5
            boolean r6 = r5 instanceof android.support.constraint.n.k.m.f
            if (r6 == 0) goto L30
            android.support.constraint.n.k.m.f r5 = (android.support.constraint.n.k.m.f) r5
            android.support.constraint.n.k.m.p r6 = r5.d
            if (r6 != r0) goto L24
            goto L30
        L24:
            int r6 = r5.f
            long r6 = (long) r6
            long r6 = r6 + r10
            long r5 = r8.a(r5, r6)
            long r3 = java.lang.Math.min(r3, r5)
        L30:
            int r2 = r2 + 1
            goto Lf
        L33:
            android.support.constraint.n.k.m.f r1 = r0.i
            if (r9 != r1) goto L50
            long r1 = r0.d()
            android.support.constraint.n.k.m.f r9 = r0.h
            long r10 = r10 - r1
            long r8 = r8.a(r9, r10)
            long r8 = java.lang.Math.min(r3, r8)
            android.support.constraint.n.k.m.f r0 = r0.h
            int r0 = r0.f
            long r0 = (long) r0
            long r10 = r10 - r0
            long r3 = java.lang.Math.min(r8, r10)
        L50:
            return r3
    }

    private long b(android.support.constraint.n.k.m.f r9, long r10) {
            r8 = this;
            android.support.constraint.n.k.m.p r0 = r9.d
            boolean r1 = r0 instanceof android.support.constraint.n.k.m.k
            if (r1 == 0) goto L7
            return r10
        L7:
            java.util.List<android.support.constraint.n.k.m.d> r1 = r9.k
            int r1 = r1.size()
            r2 = 0
            r3 = r10
        Lf:
            if (r2 >= r1) goto L33
            java.util.List<android.support.constraint.n.k.m.d> r5 = r9.k
            java.lang.Object r5 = r5.get(r2)
            android.support.constraint.n.k.m.d r5 = (android.support.constraint.n.k.m.d) r5
            boolean r6 = r5 instanceof android.support.constraint.n.k.m.f
            if (r6 == 0) goto L30
            android.support.constraint.n.k.m.f r5 = (android.support.constraint.n.k.m.f) r5
            android.support.constraint.n.k.m.p r6 = r5.d
            if (r6 != r0) goto L24
            goto L30
        L24:
            int r6 = r5.f
            long r6 = (long) r6
            long r6 = r6 + r10
            long r5 = r8.b(r5, r6)
            long r3 = java.lang.Math.max(r3, r5)
        L30:
            int r2 = r2 + 1
            goto Lf
        L33:
            android.support.constraint.n.k.m.f r1 = r0.h
            if (r9 != r1) goto L50
            long r1 = r0.d()
            android.support.constraint.n.k.m.f r9 = r0.i
            long r10 = r10 + r1
            long r8 = r8.b(r9, r10)
            long r8 = java.lang.Math.max(r3, r8)
            android.support.constraint.n.k.m.f r0 = r0.i
            int r0 = r0.f
            long r0 = (long) r0
            long r10 = r10 - r0
            long r3 = java.lang.Math.max(r8, r10)
        L50:
            return r3
    }

    public long a(android.support.constraint.n.k.f r11, int r12) {
            r10 = this;
            android.support.constraint.n.k.m.p r0 = r10.f516b
            boolean r1 = r0 instanceof android.support.constraint.n.k.m.c
            r2 = 0
            if (r1 == 0) goto Lf
            android.support.constraint.n.k.m.c r0 = (android.support.constraint.n.k.m.c) r0
            int r0 = r0.f
            if (r0 == r12) goto L1b
            return r2
        Lf:
            if (r12 != 0) goto L16
            boolean r0 = r0 instanceof android.support.constraint.n.k.m.l
            if (r0 != 0) goto L1b
            return r2
        L16:
            boolean r0 = r0 instanceof android.support.constraint.n.k.m.n
            if (r0 != 0) goto L1b
            return r2
        L1b:
            if (r12 != 0) goto L20
            android.support.constraint.n.k.m.l r0 = r11.d
            goto L22
        L20:
            android.support.constraint.n.k.m.n r0 = r11.e
        L22:
            android.support.constraint.n.k.m.f r0 = r0.h
            if (r12 != 0) goto L29
            android.support.constraint.n.k.m.l r11 = r11.d
            goto L2b
        L29:
            android.support.constraint.n.k.m.n r11 = r11.e
        L2b:
            android.support.constraint.n.k.m.f r11 = r11.i
            android.support.constraint.n.k.m.p r1 = r10.f516b
            android.support.constraint.n.k.m.f r1 = r1.h
            java.util.List<android.support.constraint.n.k.m.f> r1 = r1.l
            boolean r0 = r1.contains(r0)
            android.support.constraint.n.k.m.p r1 = r10.f516b
            android.support.constraint.n.k.m.f r1 = r1.i
            java.util.List<android.support.constraint.n.k.m.f> r1 = r1.l
            boolean r11 = r1.contains(r11)
            android.support.constraint.n.k.m.p r1 = r10.f516b
            long r4 = r1.d()
            if (r0 == 0) goto Lae
            if (r11 == 0) goto Lae
            android.support.constraint.n.k.m.p r11 = r10.f516b
            android.support.constraint.n.k.m.f r11 = r11.h
            long r0 = r10.b(r11, r2)
            android.support.constraint.n.k.m.p r11 = r10.f516b
            android.support.constraint.n.k.m.f r11 = r11.i
            long r6 = r10.a(r11, r2)
            long r0 = r0 - r4
            android.support.constraint.n.k.m.p r11 = r10.f516b
            android.support.constraint.n.k.m.f r11 = r11.i
            int r11 = r11.f
            int r8 = -r11
            long r8 = (long) r8
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r8 < 0) goto L6a
            long r8 = (long) r11
            long r0 = r0 + r8
        L6a:
            long r6 = -r6
            long r6 = r6 - r4
            android.support.constraint.n.k.m.p r11 = r10.f516b
            android.support.constraint.n.k.m.f r11 = r11.h
            int r11 = r11.f
            long r8 = (long) r11
            long r6 = r6 - r8
            long r8 = (long) r11
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 < 0) goto L7b
            long r8 = (long) r11
            long r6 = r6 - r8
        L7b:
            android.support.constraint.n.k.m.p r11 = r10.f516b
            android.support.constraint.n.k.e r11 = r11.f523b
            float r11 = r11.a(r12)
            r12 = 0
            int r12 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r12 <= 0) goto L92
            float r12 = (float) r6
            float r12 = r12 / r11
            float r0 = (float) r0
            float r1 = r8 - r11
            float r0 = r0 / r1
            float r12 = r12 + r0
            long r2 = (long) r12
        L92:
            float r12 = (float) r2
            float r0 = r12 * r11
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            long r2 = (long) r0
            float r8 = r8 - r11
            float r12 = r12 * r8
            float r12 = r12 + r1
            long r11 = (long) r12
            long r2 = r2 + r4
            long r2 = r2 + r11
            android.support.constraint.n.k.m.p r10 = r10.f516b
            android.support.constraint.n.k.m.f r11 = r10.h
            int r11 = r11.f
            long r11 = (long) r11
            long r11 = r11 + r2
            android.support.constraint.n.k.m.f r10 = r10.i
            int r10 = r10.f
            long r0 = (long) r10
            long r11 = r11 - r0
            goto Lf9
        Lae:
            if (r0 == 0) goto Lc8
            android.support.constraint.n.k.m.p r11 = r10.f516b
            android.support.constraint.n.k.m.f r11 = r11.h
            int r12 = r11.f
            long r0 = (long) r12
            long r11 = r10.b(r11, r0)
            android.support.constraint.n.k.m.p r10 = r10.f516b
            android.support.constraint.n.k.m.f r10 = r10.h
            int r10 = r10.f
            long r0 = (long) r10
            long r0 = r0 + r4
            long r11 = java.lang.Math.max(r11, r0)
            goto Lf9
        Lc8:
            if (r11 == 0) goto Le4
            android.support.constraint.n.k.m.p r11 = r10.f516b
            android.support.constraint.n.k.m.f r11 = r11.i
            int r12 = r11.f
            long r0 = (long) r12
            long r11 = r10.a(r11, r0)
            android.support.constraint.n.k.m.p r10 = r10.f516b
            android.support.constraint.n.k.m.f r10 = r10.i
            int r10 = r10.f
            int r10 = -r10
            long r0 = (long) r10
            long r0 = r0 + r4
            long r10 = -r11
            long r11 = java.lang.Math.max(r10, r0)
            goto Lf9
        Le4:
            android.support.constraint.n.k.m.p r11 = r10.f516b
            android.support.constraint.n.k.m.f r12 = r11.h
            int r12 = r12.f
            long r0 = (long) r12
            long r11 = r11.d()
            long r0 = r0 + r11
            android.support.constraint.n.k.m.p r10 = r10.f516b
            android.support.constraint.n.k.m.f r10 = r10.i
            int r10 = r10.f
            long r10 = (long) r10
            long r11 = r0 - r10
        Lf9:
            return r11
    }

    public void a(android.support.constraint.n.k.m.p r1) {
            r0 = this;
            java.util.ArrayList<android.support.constraint.n.k.m.p> r0 = r0.f517c
            r0.add(r1)
            return
    }
}
