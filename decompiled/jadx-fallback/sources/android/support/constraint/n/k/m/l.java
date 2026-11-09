package android.support.constraint.n.k.m;

/* JADX INFO: loaded from: classes.dex */
public class l extends android.support.constraint.n.k.m.p {
    private static int[] k;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f514a = null;

        static {
                android.support.constraint.n.k.m.p$b[] r0 = android.support.constraint.n.k.m.p.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                android.support.constraint.n.k.m.l.a.f514a = r0
                android.support.constraint.n.k.m.p$b r1 = android.support.constraint.n.k.m.p.b.f527c     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = android.support.constraint.n.k.m.l.a.f514a     // Catch: java.lang.NoSuchFieldError -> L1d
                android.support.constraint.n.k.m.p$b r1 = android.support.constraint.n.k.m.p.b.d     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = android.support.constraint.n.k.m.l.a.f514a     // Catch: java.lang.NoSuchFieldError -> L28
                android.support.constraint.n.k.m.p$b r1 = android.support.constraint.n.k.m.p.b.e     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    static {
            r0 = 2
            int[] r0 = new int[r0]
            android.support.constraint.n.k.m.l.k = r0
            return
    }

    public l(android.support.constraint.n.k.e r2) {
            r1 = this;
            r1.<init>(r2)
            android.support.constraint.n.k.m.f r2 = r1.h
            android.support.constraint.n.k.m.f$a r0 = android.support.constraint.n.k.m.f.a.e
            r2.e = r0
            android.support.constraint.n.k.m.f r2 = r1.i
            android.support.constraint.n.k.m.f$a r0 = android.support.constraint.n.k.m.f.a.f
            r2.e = r0
            r2 = 0
            r1.f = r2
            return
    }

    private void a(int[] r2, int r3, int r4, int r5, int r6, float r7, int r8) {
            r1 = this;
            int r4 = r4 - r3
            int r6 = r6 - r5
            r1 = -1
            r3 = 0
            r5 = 1056964608(0x3f000000, float:0.5)
            r0 = 1
            if (r8 == r1) goto L20
            if (r8 == 0) goto L17
            if (r8 == r0) goto Le
            goto L39
        Le:
            float r1 = (float) r4
            float r1 = r1 * r7
            float r1 = r1 + r5
            int r1 = (int) r1
            r2[r3] = r4
            r2[r0] = r1
            goto L39
        L17:
            float r1 = (float) r6
            float r1 = r1 * r7
            float r1 = r1 + r5
            int r1 = (int) r1
            r2[r3] = r1
            r2[r0] = r6
            goto L39
        L20:
            float r1 = (float) r6
            float r1 = r1 * r7
            float r1 = r1 + r5
            int r1 = (int) r1
            float r8 = (float) r4
            float r8 = r8 / r7
            float r8 = r8 + r5
            int r5 = (int) r8
            if (r1 > r4) goto L31
            if (r6 > r6) goto L31
            r2[r3] = r1
            r2[r0] = r6
            goto L39
        L31:
            if (r4 > r4) goto L39
            if (r5 > r6) goto L39
            r2[r3] = r4
            r2[r0] = r5
        L39:
            return
    }

    @Override // android.support.constraint.n.k.m.p
    void a() {
            r5 = this;
            android.support.constraint.n.k.e r0 = r5.f523b
            boolean r1 = r0.f490a
            if (r1 == 0) goto Lf
            android.support.constraint.n.k.m.g r1 = r5.e
            int r0 = r0.C()
            r1.a(r0)
        Lf:
            android.support.constraint.n.k.m.g r0 = r5.e
            boolean r0 = r0.j
            if (r0 != 0) goto L8e
            android.support.constraint.n.k.e r0 = r5.f523b
            android.support.constraint.n.k.e$b r0 = r0.n()
            r5.d = r0
            android.support.constraint.n.k.e$b r1 = android.support.constraint.n.k.e.b.d
            if (r0 == r1) goto Ld0
            android.support.constraint.n.k.e$b r1 = android.support.constraint.n.k.e.b.e
            if (r0 != r1) goto L7c
            android.support.constraint.n.k.e r0 = r5.f523b
            android.support.constraint.n.k.e r0 = r0.v()
            if (r0 == 0) goto L35
            android.support.constraint.n.k.e$b r1 = r0.n()
            android.support.constraint.n.k.e$b r2 = android.support.constraint.n.k.e.b.f495b
            if (r1 == r2) goto L3d
        L35:
            android.support.constraint.n.k.e$b r1 = r0.n()
            android.support.constraint.n.k.e$b r2 = android.support.constraint.n.k.e.b.e
            if (r1 != r2) goto L7c
        L3d:
            int r1 = r0.C()
            android.support.constraint.n.k.e r2 = r5.f523b
            android.support.constraint.n.k.d r2 = r2.F
            int r2 = r2.c()
            int r1 = r1 - r2
            android.support.constraint.n.k.e r2 = r5.f523b
            android.support.constraint.n.k.d r2 = r2.H
            int r2 = r2.c()
            int r1 = r1 - r2
            android.support.constraint.n.k.m.f r2 = r5.h
            android.support.constraint.n.k.m.l r3 = r0.d
            android.support.constraint.n.k.m.f r3 = r3.h
            android.support.constraint.n.k.e r4 = r5.f523b
            android.support.constraint.n.k.d r4 = r4.F
            int r4 = r4.c()
            r5.a(r2, r3, r4)
            android.support.constraint.n.k.m.f r2 = r5.i
            android.support.constraint.n.k.m.l r0 = r0.d
            android.support.constraint.n.k.m.f r0 = r0.i
            android.support.constraint.n.k.e r3 = r5.f523b
            android.support.constraint.n.k.d r3 = r3.H
            int r3 = r3.c()
            int r3 = -r3
            r5.a(r2, r0, r3)
            android.support.constraint.n.k.m.g r5 = r5.e
            r5.a(r1)
            return
        L7c:
            android.support.constraint.n.k.e$b r0 = r5.d
            android.support.constraint.n.k.e$b r1 = android.support.constraint.n.k.e.b.f495b
            if (r0 != r1) goto Ld0
            android.support.constraint.n.k.m.g r0 = r5.e
            android.support.constraint.n.k.e r1 = r5.f523b
            int r1 = r1.C()
            r0.a(r1)
            goto Ld0
        L8e:
            android.support.constraint.n.k.e$b r0 = r5.d
            android.support.constraint.n.k.e$b r1 = android.support.constraint.n.k.e.b.e
            if (r0 != r1) goto Ld0
            android.support.constraint.n.k.e r0 = r5.f523b
            android.support.constraint.n.k.e r0 = r0.v()
            if (r0 == 0) goto La4
            android.support.constraint.n.k.e$b r1 = r0.n()
            android.support.constraint.n.k.e$b r2 = android.support.constraint.n.k.e.b.f495b
            if (r1 == r2) goto Lac
        La4:
            android.support.constraint.n.k.e$b r1 = r0.n()
            android.support.constraint.n.k.e$b r2 = android.support.constraint.n.k.e.b.e
            if (r1 != r2) goto Ld0
        Lac:
            android.support.constraint.n.k.m.f r1 = r5.h
            android.support.constraint.n.k.m.l r2 = r0.d
            android.support.constraint.n.k.m.f r2 = r2.h
            android.support.constraint.n.k.e r3 = r5.f523b
            android.support.constraint.n.k.d r3 = r3.F
            int r3 = r3.c()
            r5.a(r1, r2, r3)
            android.support.constraint.n.k.m.f r1 = r5.i
            android.support.constraint.n.k.m.l r0 = r0.d
            android.support.constraint.n.k.m.f r0 = r0.i
            android.support.constraint.n.k.e r2 = r5.f523b
            android.support.constraint.n.k.d r2 = r2.H
            int r2 = r2.c()
            int r2 = -r2
            r5.a(r1, r0, r2)
            return
        Ld0:
            android.support.constraint.n.k.m.g r0 = r5.e
            boolean r0 = r0.j
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L1cd
            android.support.constraint.n.k.e r0 = r5.f523b
            boolean r3 = r0.f490a
            if (r3 == 0) goto L1cd
            android.support.constraint.n.k.d[] r3 = r0.N
            r4 = r3[r1]
            android.support.constraint.n.k.d r4 = r4.f
            if (r4 == 0) goto L14b
            r3 = r3[r2]
            android.support.constraint.n.k.d r3 = r3.f
            if (r3 == 0) goto L14b
            boolean r0 = r0.H()
            if (r0 == 0) goto L10a
            android.support.constraint.n.k.m.f r0 = r5.h
            android.support.constraint.n.k.e r3 = r5.f523b
            android.support.constraint.n.k.d[] r3 = r3.N
            r1 = r3[r1]
            int r1 = r1.c()
            r0.f = r1
            android.support.constraint.n.k.m.f r0 = r5.i
            android.support.constraint.n.k.e r5 = r5.f523b
            android.support.constraint.n.k.d[] r5 = r5.N
            r5 = r5[r2]
            goto L31e
        L10a:
            android.support.constraint.n.k.e r0 = r5.f523b
            android.support.constraint.n.k.d[] r0 = r0.N
            r0 = r0[r1]
            android.support.constraint.n.k.m.f r0 = r5.a(r0)
            if (r0 == 0) goto L125
            android.support.constraint.n.k.m.f r3 = r5.h
            android.support.constraint.n.k.e r4 = r5.f523b
            android.support.constraint.n.k.d[] r4 = r4.N
            r1 = r4[r1]
            int r1 = r1.c()
            r5.a(r3, r0, r1)
        L125:
            android.support.constraint.n.k.e r0 = r5.f523b
            android.support.constraint.n.k.d[] r0 = r0.N
            r0 = r0[r2]
            android.support.constraint.n.k.m.f r0 = r5.a(r0)
            if (r0 == 0) goto L141
            android.support.constraint.n.k.m.f r1 = r5.i
            android.support.constraint.n.k.e r3 = r5.f523b
            android.support.constraint.n.k.d[] r3 = r3.N
            r3 = r3[r2]
            int r3 = r3.c()
            int r3 = -r3
            r5.a(r1, r0, r3)
        L141:
            android.support.constraint.n.k.m.f r0 = r5.h
            r0.f509b = r2
            android.support.constraint.n.k.m.f r5 = r5.i
            r5.f509b = r2
            goto L3b4
        L14b:
            android.support.constraint.n.k.e r0 = r5.f523b
            android.support.constraint.n.k.d[] r3 = r0.N
            r4 = r3[r1]
            android.support.constraint.n.k.d r4 = r4.f
            if (r4 == 0) goto L16d
            r0 = r3[r1]
            android.support.constraint.n.k.m.f r0 = r5.a(r0)
            if (r0 == 0) goto L3b4
            android.support.constraint.n.k.m.f r2 = r5.h
            android.support.constraint.n.k.e r3 = r5.f523b
            android.support.constraint.n.k.d[] r3 = r3.N
            r1 = r3[r1]
            int r1 = r1.c()
            r5.a(r2, r0, r1)
            goto L1c0
        L16d:
            r1 = r3[r2]
            android.support.constraint.n.k.d r1 = r1.f
            if (r1 == 0) goto L195
            r0 = r3[r2]
            android.support.constraint.n.k.m.f r0 = r5.a(r0)
            if (r0 == 0) goto L3b4
            android.support.constraint.n.k.m.f r1 = r5.i
            android.support.constraint.n.k.e r3 = r5.f523b
            android.support.constraint.n.k.d[] r3 = r3.N
            r2 = r3[r2]
            int r2 = r2.c()
            int r2 = -r2
            r5.a(r1, r0, r2)
            android.support.constraint.n.k.m.f r0 = r5.h
            android.support.constraint.n.k.m.f r1 = r5.i
            android.support.constraint.n.k.m.g r2 = r5.e
            int r2 = r2.g
            int r2 = -r2
            goto L1c8
        L195:
            boolean r1 = r0 instanceof android.support.constraint.n.k.h
            if (r1 != 0) goto L3b4
            android.support.constraint.n.k.e r0 = r0.v()
            if (r0 == 0) goto L3b4
            android.support.constraint.n.k.e r0 = r5.f523b
            android.support.constraint.n.k.d$b r1 = android.support.constraint.n.k.d.b.h
            android.support.constraint.n.k.d r0 = r0.a(r1)
            android.support.constraint.n.k.d r0 = r0.f
            if (r0 != 0) goto L3b4
            android.support.constraint.n.k.e r0 = r5.f523b
            android.support.constraint.n.k.e r0 = r0.v()
            android.support.constraint.n.k.m.l r0 = r0.d
            android.support.constraint.n.k.m.f r0 = r0.h
            android.support.constraint.n.k.m.f r1 = r5.h
            android.support.constraint.n.k.e r2 = r5.f523b
            int r2 = r2.D()
            r5.a(r1, r0, r2)
        L1c0:
            android.support.constraint.n.k.m.f r0 = r5.i
            android.support.constraint.n.k.m.f r1 = r5.h
            android.support.constraint.n.k.m.g r2 = r5.e
            int r2 = r2.g
        L1c8:
            r5.a(r0, r1, r2)
            goto L3b4
        L1cd:
            android.support.constraint.n.k.e$b r0 = r5.d
            android.support.constraint.n.k.e$b r3 = android.support.constraint.n.k.e.b.d
            if (r0 != r3) goto L2f2
            android.support.constraint.n.k.e r0 = r5.f523b
            int r3 = r0.n
            r4 = 2
            if (r3 == r4) goto L2c5
            r4 = 3
            if (r3 == r4) goto L1df
            goto L2f2
        L1df:
            int r3 = r0.o
            if (r3 != r4) goto L275
            android.support.constraint.n.k.m.f r3 = r5.h
            r3.f508a = r5
            android.support.constraint.n.k.m.f r3 = r5.i
            r3.f508a = r5
            android.support.constraint.n.k.m.n r3 = r0.e
            android.support.constraint.n.k.m.f r4 = r3.h
            r4.f508a = r5
            android.support.constraint.n.k.m.f r3 = r3.i
            r3.f508a = r5
            android.support.constraint.n.k.m.g r3 = r5.e
            r3.f508a = r5
            boolean r0 = r0.J()
            if (r0 == 0) goto L24d
            android.support.constraint.n.k.m.g r0 = r5.e
            java.util.List<android.support.constraint.n.k.m.f> r0 = r0.l
            android.support.constraint.n.k.e r3 = r5.f523b
            android.support.constraint.n.k.m.n r3 = r3.e
            android.support.constraint.n.k.m.g r3 = r3.e
            r0.add(r3)
            android.support.constraint.n.k.e r0 = r5.f523b
            android.support.constraint.n.k.m.n r0 = r0.e
            android.support.constraint.n.k.m.g r0 = r0.e
            java.util.List<android.support.constraint.n.k.m.d> r0 = r0.k
            android.support.constraint.n.k.m.g r3 = r5.e
            r0.add(r3)
            android.support.constraint.n.k.e r0 = r5.f523b
            android.support.constraint.n.k.m.n r0 = r0.e
            android.support.constraint.n.k.m.g r3 = r0.e
            r3.f508a = r5
            android.support.constraint.n.k.m.g r3 = r5.e
            java.util.List<android.support.constraint.n.k.m.f> r3 = r3.l
            android.support.constraint.n.k.m.f r0 = r0.h
            r3.add(r0)
            android.support.constraint.n.k.m.g r0 = r5.e
            java.util.List<android.support.constraint.n.k.m.f> r0 = r0.l
            android.support.constraint.n.k.e r3 = r5.f523b
            android.support.constraint.n.k.m.n r3 = r3.e
            android.support.constraint.n.k.m.f r3 = r3.i
            r0.add(r3)
            android.support.constraint.n.k.e r0 = r5.f523b
            android.support.constraint.n.k.m.n r0 = r0.e
            android.support.constraint.n.k.m.f r0 = r0.h
            java.util.List<android.support.constraint.n.k.m.d> r0 = r0.k
            android.support.constraint.n.k.m.g r3 = r5.e
            r0.add(r3)
            android.support.constraint.n.k.e r0 = r5.f523b
            android.support.constraint.n.k.m.n r0 = r0.e
            android.support.constraint.n.k.m.f r0 = r0.i
            java.util.List<android.support.constraint.n.k.m.d> r0 = r0.k
            goto L2c2
        L24d:
            android.support.constraint.n.k.e r0 = r5.f523b
            boolean r0 = r0.H()
            if (r0 == 0) goto L26e
            android.support.constraint.n.k.e r0 = r5.f523b
            android.support.constraint.n.k.m.n r0 = r0.e
            android.support.constraint.n.k.m.g r0 = r0.e
            java.util.List<android.support.constraint.n.k.m.f> r0 = r0.l
            android.support.constraint.n.k.m.g r3 = r5.e
            r0.add(r3)
            android.support.constraint.n.k.m.g r0 = r5.e
            java.util.List<android.support.constraint.n.k.m.d> r0 = r0.k
            android.support.constraint.n.k.e r3 = r5.f523b
            android.support.constraint.n.k.m.n r3 = r3.e
            android.support.constraint.n.k.m.g r3 = r3.e
            goto L2ef
        L26e:
            android.support.constraint.n.k.e r0 = r5.f523b
            android.support.constraint.n.k.m.n r0 = r0.e
            android.support.constraint.n.k.m.g r0 = r0.e
            goto L2c0
        L275:
            android.support.constraint.n.k.m.n r0 = r0.e
            android.support.constraint.n.k.m.g r0 = r0.e
            android.support.constraint.n.k.m.g r3 = r5.e
            java.util.List<android.support.constraint.n.k.m.f> r3 = r3.l
            r3.add(r0)
            java.util.List<android.support.constraint.n.k.m.d> r0 = r0.k
            android.support.constraint.n.k.m.g r3 = r5.e
            r0.add(r3)
            android.support.constraint.n.k.e r0 = r5.f523b
            android.support.constraint.n.k.m.n r0 = r0.e
            android.support.constraint.n.k.m.f r0 = r0.h
            java.util.List<android.support.constraint.n.k.m.d> r0 = r0.k
            android.support.constraint.n.k.m.g r3 = r5.e
            r0.add(r3)
            android.support.constraint.n.k.e r0 = r5.f523b
            android.support.constraint.n.k.m.n r0 = r0.e
            android.support.constraint.n.k.m.f r0 = r0.i
            java.util.List<android.support.constraint.n.k.m.d> r0 = r0.k
            android.support.constraint.n.k.m.g r3 = r5.e
            r0.add(r3)
            android.support.constraint.n.k.m.g r0 = r5.e
            r0.f509b = r2
            java.util.List<android.support.constraint.n.k.m.d> r0 = r0.k
            android.support.constraint.n.k.m.f r3 = r5.h
            r0.add(r3)
            android.support.constraint.n.k.m.g r0 = r5.e
            java.util.List<android.support.constraint.n.k.m.d> r0 = r0.k
            android.support.constraint.n.k.m.f r3 = r5.i
            r0.add(r3)
            android.support.constraint.n.k.m.f r0 = r5.h
            java.util.List<android.support.constraint.n.k.m.f> r0 = r0.l
            android.support.constraint.n.k.m.g r3 = r5.e
            r0.add(r3)
            android.support.constraint.n.k.m.f r0 = r5.i
        L2c0:
            java.util.List<android.support.constraint.n.k.m.f> r0 = r0.l
        L2c2:
            android.support.constraint.n.k.m.g r3 = r5.e
            goto L2ef
        L2c5:
            android.support.constraint.n.k.e r0 = r0.v()
            if (r0 != 0) goto L2cc
            goto L2f2
        L2cc:
            android.support.constraint.n.k.m.n r0 = r0.e
            android.support.constraint.n.k.m.g r0 = r0.e
            android.support.constraint.n.k.m.g r3 = r5.e
            java.util.List<android.support.constraint.n.k.m.f> r3 = r3.l
            r3.add(r0)
            java.util.List<android.support.constraint.n.k.m.d> r0 = r0.k
            android.support.constraint.n.k.m.g r3 = r5.e
            r0.add(r3)
            android.support.constraint.n.k.m.g r0 = r5.e
            r0.f509b = r2
            java.util.List<android.support.constraint.n.k.m.d> r0 = r0.k
            android.support.constraint.n.k.m.f r3 = r5.h
            r0.add(r3)
            android.support.constraint.n.k.m.g r0 = r5.e
            java.util.List<android.support.constraint.n.k.m.d> r0 = r0.k
            android.support.constraint.n.k.m.f r3 = r5.i
        L2ef:
            r0.add(r3)
        L2f2:
            android.support.constraint.n.k.e r0 = r5.f523b
            android.support.constraint.n.k.d[] r3 = r0.N
            r4 = r3[r1]
            android.support.constraint.n.k.d r4 = r4.f
            if (r4 == 0) goto L346
            r3 = r3[r2]
            android.support.constraint.n.k.d r3 = r3.f
            if (r3 == 0) goto L346
            boolean r0 = r0.H()
            if (r0 == 0) goto L327
            android.support.constraint.n.k.m.f r0 = r5.h
            android.support.constraint.n.k.e r3 = r5.f523b
            android.support.constraint.n.k.d[] r3 = r3.N
            r1 = r3[r1]
            int r1 = r1.c()
            r0.f = r1
            android.support.constraint.n.k.m.f r0 = r5.i
            android.support.constraint.n.k.e r5 = r5.f523b
            android.support.constraint.n.k.d[] r5 = r5.N
            r5 = r5[r2]
        L31e:
            int r5 = r5.c()
            int r5 = -r5
            r0.f = r5
            goto L3b4
        L327:
            android.support.constraint.n.k.e r0 = r5.f523b
            android.support.constraint.n.k.d[] r0 = r0.N
            r0 = r0[r1]
            android.support.constraint.n.k.m.f r0 = r5.a(r0)
            android.support.constraint.n.k.e r1 = r5.f523b
            android.support.constraint.n.k.d[] r1 = r1.N
            r1 = r1[r2]
            android.support.constraint.n.k.m.f r1 = r5.a(r1)
            r0.b(r5)
            r1.b(r5)
            android.support.constraint.n.k.m.p$b r0 = android.support.constraint.n.k.m.p.b.e
            r5.j = r0
            goto L3b4
        L346:
            android.support.constraint.n.k.e r0 = r5.f523b
            android.support.constraint.n.k.d[] r3 = r0.N
            r4 = r3[r1]
            android.support.constraint.n.k.d r4 = r4.f
            if (r4 == 0) goto L368
            r0 = r3[r1]
            android.support.constraint.n.k.m.f r0 = r5.a(r0)
            if (r0 == 0) goto L3b4
            android.support.constraint.n.k.m.f r3 = r5.h
            android.support.constraint.n.k.e r4 = r5.f523b
            android.support.constraint.n.k.d[] r4 = r4.N
            r1 = r4[r1]
            int r1 = r1.c()
            r5.a(r3, r0, r1)
            goto L3ab
        L368:
            r1 = r3[r2]
            android.support.constraint.n.k.d r1 = r1.f
            if (r1 == 0) goto L38c
            r0 = r3[r2]
            android.support.constraint.n.k.m.f r0 = r5.a(r0)
            if (r0 == 0) goto L3b4
            android.support.constraint.n.k.m.f r1 = r5.i
            android.support.constraint.n.k.e r3 = r5.f523b
            android.support.constraint.n.k.d[] r3 = r3.N
            r2 = r3[r2]
            int r2 = r2.c()
            int r2 = -r2
            r5.a(r1, r0, r2)
            android.support.constraint.n.k.m.f r0 = r5.h
            android.support.constraint.n.k.m.f r1 = r5.i
            r2 = -1
            goto L3af
        L38c:
            boolean r1 = r0 instanceof android.support.constraint.n.k.h
            if (r1 != 0) goto L3b4
            android.support.constraint.n.k.e r0 = r0.v()
            if (r0 == 0) goto L3b4
            android.support.constraint.n.k.e r0 = r5.f523b
            android.support.constraint.n.k.e r0 = r0.v()
            android.support.constraint.n.k.m.l r0 = r0.d
            android.support.constraint.n.k.m.f r0 = r0.h
            android.support.constraint.n.k.m.f r1 = r5.h
            android.support.constraint.n.k.e r3 = r5.f523b
            int r3 = r3.D()
            r5.a(r1, r0, r3)
        L3ab:
            android.support.constraint.n.k.m.f r0 = r5.i
            android.support.constraint.n.k.m.f r1 = r5.h
        L3af:
            android.support.constraint.n.k.m.g r3 = r5.e
            r5.a(r0, r1, r2, r3)
        L3b4:
            return
    }

    @Override // android.support.constraint.n.k.m.p, android.support.constraint.n.k.m.d
    public void a(android.support.constraint.n.k.m.d r17) {
            r16 = this;
            r8 = r16
            int[] r0 = android.support.constraint.n.k.m.l.a.f514a
            android.support.constraint.n.k.m.p$b r1 = r8.j
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 3
            r9 = 1
            r10 = 0
            if (r0 == r9) goto L29
            if (r0 == r1) goto L23
            if (r0 == r2) goto L17
            goto L2e
        L17:
            android.support.constraint.n.k.e r0 = r8.f523b
            android.support.constraint.n.k.d r1 = r0.F
            android.support.constraint.n.k.d r0 = r0.H
            r3 = r17
            r8.a(r3, r1, r0, r10)
            return
        L23:
            r3 = r17
            r16.b(r17)
            goto L2e
        L29:
            r3 = r17
            r16.c(r17)
        L2e:
            android.support.constraint.n.k.m.g r0 = r8.e
            boolean r0 = r0.j
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r0 != 0) goto L2f1
            android.support.constraint.n.k.e$b r0 = r8.d
            android.support.constraint.n.k.e$b r3 = android.support.constraint.n.k.e.b.d
            if (r0 != r3) goto L2f1
            android.support.constraint.n.k.e r0 = r8.f523b
            int r3 = r0.n
            if (r3 == r1) goto L2d4
            if (r3 == r2) goto L46
            goto L2f1
        L46:
            int r1 = r0.o
            r3 = -1
            if (r1 == 0) goto L7c
            if (r1 != r2) goto L4e
            goto L7c
        L4e:
            int r0 = r0.j()
            if (r0 == r3) goto L6a
            if (r0 == 0) goto L5b
            if (r0 == r9) goto L6a
            r0 = r10
            goto L2ec
        L5b:
            android.support.constraint.n.k.e r0 = r8.f523b
            android.support.constraint.n.k.m.n r1 = r0.e
            android.support.constraint.n.k.m.g r1 = r1.e
            int r1 = r1.g
            float r1 = (float) r1
            float r0 = r0.i()
            float r1 = r1 / r0
            goto L78
        L6a:
            android.support.constraint.n.k.e r0 = r8.f523b
            android.support.constraint.n.k.m.n r1 = r0.e
            android.support.constraint.n.k.m.g r1 = r1.e
            int r1 = r1.g
            float r1 = (float) r1
            float r0 = r0.i()
            float r1 = r1 * r0
        L78:
            float r1 = r1 + r11
            int r0 = (int) r1
            goto L2ec
        L7c:
            android.support.constraint.n.k.e r0 = r8.f523b
            android.support.constraint.n.k.m.n r1 = r0.e
            android.support.constraint.n.k.m.f r12 = r1.h
            android.support.constraint.n.k.m.f r13 = r1.i
            android.support.constraint.n.k.d r0 = r0.F
            android.support.constraint.n.k.d r0 = r0.f
            if (r0 == 0) goto L8c
            r0 = r9
            goto L8d
        L8c:
            r0 = r10
        L8d:
            android.support.constraint.n.k.e r1 = r8.f523b
            android.support.constraint.n.k.d r1 = r1.G
            android.support.constraint.n.k.d r1 = r1.f
            if (r1 == 0) goto L97
            r1 = r9
            goto L98
        L97:
            r1 = r10
        L98:
            android.support.constraint.n.k.e r2 = r8.f523b
            android.support.constraint.n.k.d r2 = r2.H
            android.support.constraint.n.k.d r2 = r2.f
            if (r2 == 0) goto La2
            r2 = r9
            goto La3
        La2:
            r2 = r10
        La3:
            android.support.constraint.n.k.e r4 = r8.f523b
            android.support.constraint.n.k.d r4 = r4.I
            android.support.constraint.n.k.d r4 = r4.f
            if (r4 == 0) goto Lad
            r4 = r9
            goto Lae
        Lad:
            r4 = r10
        Lae:
            android.support.constraint.n.k.e r5 = r8.f523b
            int r14 = r5.j()
            if (r0 == 0) goto L1f4
            if (r1 == 0) goto L1f4
            if (r2 == 0) goto L1f4
            if (r4 == 0) goto L1f4
            android.support.constraint.n.k.e r0 = r8.f523b
            float r15 = r0.i()
            boolean r0 = r12.j
            if (r0 == 0) goto L125
            boolean r0 = r13.j
            if (r0 == 0) goto L125
            android.support.constraint.n.k.m.f r0 = r8.h
            boolean r1 = r0.f510c
            if (r1 == 0) goto L124
            android.support.constraint.n.k.m.f r1 = r8.i
            boolean r1 = r1.f510c
            if (r1 != 0) goto Ld7
            goto L124
        Ld7:
            java.util.List<android.support.constraint.n.k.m.f> r0 = r0.l
            java.lang.Object r0 = r0.get(r10)
            android.support.constraint.n.k.m.f r0 = (android.support.constraint.n.k.m.f) r0
            int r0 = r0.g
            android.support.constraint.n.k.m.f r1 = r8.h
            int r1 = r1.f
            int r2 = r0 + r1
            android.support.constraint.n.k.m.f r0 = r8.i
            java.util.List<android.support.constraint.n.k.m.f> r0 = r0.l
            java.lang.Object r0 = r0.get(r10)
            android.support.constraint.n.k.m.f r0 = (android.support.constraint.n.k.m.f) r0
            int r0 = r0.g
            android.support.constraint.n.k.m.f r1 = r8.i
            int r1 = r1.f
            int r3 = r0 - r1
            int r0 = r12.g
            int r1 = r12.f
            int r4 = r0 + r1
            int r0 = r13.g
            int r1 = r13.f
            int r5 = r0 - r1
            int[] r1 = android.support.constraint.n.k.m.l.k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.a(r1, r2, r3, r4, r5, r6, r7)
            android.support.constraint.n.k.m.g r0 = r8.e
            int[] r1 = android.support.constraint.n.k.m.l.k
            r1 = r1[r10]
            r0.a(r1)
            android.support.constraint.n.k.e r0 = r8.f523b
            android.support.constraint.n.k.m.n r0 = r0.e
            android.support.constraint.n.k.m.g r0 = r0.e
            int[] r1 = android.support.constraint.n.k.m.l.k
            r1 = r1[r9]
            r0.a(r1)
        L124:
            return
        L125:
            android.support.constraint.n.k.m.f r0 = r8.h
            boolean r1 = r0.j
            if (r1 == 0) goto L182
            android.support.constraint.n.k.m.f r1 = r8.i
            boolean r2 = r1.j
            if (r2 == 0) goto L182
            boolean r2 = r12.f510c
            if (r2 == 0) goto L181
            boolean r2 = r13.f510c
            if (r2 != 0) goto L13a
            goto L181
        L13a:
            int r2 = r0.g
            int r0 = r0.f
            int r2 = r2 + r0
            int r0 = r1.g
            int r1 = r1.f
            int r3 = r0 - r1
            java.util.List<android.support.constraint.n.k.m.f> r0 = r12.l
            java.lang.Object r0 = r0.get(r10)
            android.support.constraint.n.k.m.f r0 = (android.support.constraint.n.k.m.f) r0
            int r0 = r0.g
            int r1 = r12.f
            int r4 = r0 + r1
            java.util.List<android.support.constraint.n.k.m.f> r0 = r13.l
            java.lang.Object r0 = r0.get(r10)
            android.support.constraint.n.k.m.f r0 = (android.support.constraint.n.k.m.f) r0
            int r0 = r0.g
            int r1 = r13.f
            int r5 = r0 - r1
            int[] r1 = android.support.constraint.n.k.m.l.k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.a(r1, r2, r3, r4, r5, r6, r7)
            android.support.constraint.n.k.m.g r0 = r8.e
            int[] r1 = android.support.constraint.n.k.m.l.k
            r1 = r1[r10]
            r0.a(r1)
            android.support.constraint.n.k.e r0 = r8.f523b
            android.support.constraint.n.k.m.n r0 = r0.e
            android.support.constraint.n.k.m.g r0 = r0.e
            int[] r1 = android.support.constraint.n.k.m.l.k
            r1 = r1[r9]
            r0.a(r1)
            goto L182
        L181:
            return
        L182:
            android.support.constraint.n.k.m.f r0 = r8.h
            boolean r1 = r0.f510c
            if (r1 == 0) goto L1f3
            android.support.constraint.n.k.m.f r1 = r8.i
            boolean r1 = r1.f510c
            if (r1 == 0) goto L1f3
            boolean r1 = r12.f510c
            if (r1 == 0) goto L1f3
            boolean r1 = r13.f510c
            if (r1 != 0) goto L197
            goto L1f3
        L197:
            java.util.List<android.support.constraint.n.k.m.f> r0 = r0.l
            java.lang.Object r0 = r0.get(r10)
            android.support.constraint.n.k.m.f r0 = (android.support.constraint.n.k.m.f) r0
            int r0 = r0.g
            android.support.constraint.n.k.m.f r1 = r8.h
            int r1 = r1.f
            int r2 = r0 + r1
            android.support.constraint.n.k.m.f r0 = r8.i
            java.util.List<android.support.constraint.n.k.m.f> r0 = r0.l
            java.lang.Object r0 = r0.get(r10)
            android.support.constraint.n.k.m.f r0 = (android.support.constraint.n.k.m.f) r0
            int r0 = r0.g
            android.support.constraint.n.k.m.f r1 = r8.i
            int r1 = r1.f
            int r3 = r0 - r1
            java.util.List<android.support.constraint.n.k.m.f> r0 = r12.l
            java.lang.Object r0 = r0.get(r10)
            android.support.constraint.n.k.m.f r0 = (android.support.constraint.n.k.m.f) r0
            int r0 = r0.g
            int r1 = r12.f
            int r4 = r0 + r1
            java.util.List<android.support.constraint.n.k.m.f> r0 = r13.l
            java.lang.Object r0 = r0.get(r10)
            android.support.constraint.n.k.m.f r0 = (android.support.constraint.n.k.m.f) r0
            int r0 = r0.g
            int r1 = r13.f
            int r5 = r0 - r1
            int[] r1 = android.support.constraint.n.k.m.l.k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.a(r1, r2, r3, r4, r5, r6, r7)
            android.support.constraint.n.k.m.g r0 = r8.e
            int[] r1 = android.support.constraint.n.k.m.l.k
            r1 = r1[r10]
            r0.a(r1)
            android.support.constraint.n.k.e r0 = r8.f523b
            android.support.constraint.n.k.m.n r0 = r0.e
            android.support.constraint.n.k.m.g r0 = r0.e
            int[] r1 = android.support.constraint.n.k.m.l.k
            r1 = r1[r9]
            goto L2cf
        L1f3:
            return
        L1f4:
            if (r0 == 0) goto L26b
            if (r2 == 0) goto L26b
            android.support.constraint.n.k.m.f r0 = r8.h
            boolean r0 = r0.f510c
            if (r0 == 0) goto L26a
            android.support.constraint.n.k.m.f r0 = r8.i
            boolean r0 = r0.f510c
            if (r0 != 0) goto L205
            goto L26a
        L205:
            android.support.constraint.n.k.e r0 = r8.f523b
            float r0 = r0.i()
            android.support.constraint.n.k.m.f r1 = r8.h
            java.util.List<android.support.constraint.n.k.m.f> r1 = r1.l
            java.lang.Object r1 = r1.get(r10)
            android.support.constraint.n.k.m.f r1 = (android.support.constraint.n.k.m.f) r1
            int r1 = r1.g
            android.support.constraint.n.k.m.f r2 = r8.h
            int r2 = r2.f
            int r1 = r1 + r2
            android.support.constraint.n.k.m.f r2 = r8.i
            java.util.List<android.support.constraint.n.k.m.f> r2 = r2.l
            java.lang.Object r2 = r2.get(r10)
            android.support.constraint.n.k.m.f r2 = (android.support.constraint.n.k.m.f) r2
            int r2 = r2.g
            android.support.constraint.n.k.m.f r4 = r8.i
            int r4 = r4.f
            int r2 = r2 - r4
            if (r14 == r3) goto L247
            if (r14 == 0) goto L247
            if (r14 == r9) goto L235
            goto L2f1
        L235:
            int r2 = r2 - r1
            int r1 = r8.a(r2, r10)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.a(r2, r9)
            if (r2 == r3) goto L25a
            float r1 = (float) r3
            float r1 = r1 * r0
            goto L258
        L247:
            int r2 = r2 - r1
            int r1 = r8.a(r2, r10)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.a(r2, r9)
            if (r2 == r3) goto L25a
            float r1 = (float) r3
            float r1 = r1 / r0
        L258:
            float r1 = r1 + r11
            int r1 = (int) r1
        L25a:
            android.support.constraint.n.k.m.g r0 = r8.e
            r0.a(r1)
            android.support.constraint.n.k.e r0 = r8.f523b
            android.support.constraint.n.k.m.n r0 = r0.e
            android.support.constraint.n.k.m.g r0 = r0.e
            r0.a(r3)
            goto L2f1
        L26a:
            return
        L26b:
            if (r1 == 0) goto L2f1
            if (r4 == 0) goto L2f1
            boolean r0 = r12.f510c
            if (r0 == 0) goto L2d3
            boolean r0 = r13.f510c
            if (r0 != 0) goto L278
            goto L2d3
        L278:
            android.support.constraint.n.k.e r0 = r8.f523b
            float r0 = r0.i()
            java.util.List<android.support.constraint.n.k.m.f> r1 = r12.l
            java.lang.Object r1 = r1.get(r10)
            android.support.constraint.n.k.m.f r1 = (android.support.constraint.n.k.m.f) r1
            int r1 = r1.g
            int r2 = r12.f
            int r1 = r1 + r2
            java.util.List<android.support.constraint.n.k.m.f> r2 = r13.l
            java.lang.Object r2 = r2.get(r10)
            android.support.constraint.n.k.m.f r2 = (android.support.constraint.n.k.m.f) r2
            int r2 = r2.g
            int r4 = r13.f
            int r2 = r2 - r4
            if (r14 == r3) goto L2b1
            if (r14 == 0) goto L29f
            if (r14 == r9) goto L2b1
            goto L2f1
        L29f:
            int r2 = r2 - r1
            int r1 = r8.a(r2, r9)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.a(r2, r10)
            if (r2 == r3) goto L2c4
            float r1 = (float) r3
            float r1 = r1 / r0
            goto L2c2
        L2b1:
            int r2 = r2 - r1
            int r1 = r8.a(r2, r9)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.a(r2, r10)
            if (r2 == r3) goto L2c4
            float r1 = (float) r3
            float r1 = r1 * r0
        L2c2:
            float r1 = r1 + r11
            int r1 = (int) r1
        L2c4:
            android.support.constraint.n.k.m.g r0 = r8.e
            r0.a(r3)
            android.support.constraint.n.k.e r0 = r8.f523b
            android.support.constraint.n.k.m.n r0 = r0.e
            android.support.constraint.n.k.m.g r0 = r0.e
        L2cf:
            r0.a(r1)
            goto L2f1
        L2d3:
            return
        L2d4:
            android.support.constraint.n.k.e r0 = r0.v()
            if (r0 == 0) goto L2f1
            android.support.constraint.n.k.m.l r0 = r0.d
            android.support.constraint.n.k.m.g r0 = r0.e
            boolean r1 = r0.j
            if (r1 == 0) goto L2f1
            android.support.constraint.n.k.e r1 = r8.f523b
            float r1 = r1.s
            int r0 = r0.g
            float r0 = (float) r0
            float r0 = r0 * r1
            float r0 = r0 + r11
            int r0 = (int) r0
        L2ec:
            android.support.constraint.n.k.m.g r1 = r8.e
            r1.a(r0)
        L2f1:
            android.support.constraint.n.k.m.f r0 = r8.h
            boolean r1 = r0.f510c
            if (r1 == 0) goto L411
            android.support.constraint.n.k.m.f r1 = r8.i
            boolean r2 = r1.f510c
            if (r2 != 0) goto L2ff
            goto L411
        L2ff:
            boolean r0 = r0.j
            if (r0 == 0) goto L30e
            boolean r0 = r1.j
            if (r0 == 0) goto L30e
            android.support.constraint.n.k.m.g r0 = r8.e
            boolean r0 = r0.j
            if (r0 == 0) goto L30e
            return
        L30e:
            android.support.constraint.n.k.m.g r0 = r8.e
            boolean r0 = r0.j
            if (r0 != 0) goto L358
            android.support.constraint.n.k.e$b r0 = r8.d
            android.support.constraint.n.k.e$b r1 = android.support.constraint.n.k.e.b.d
            if (r0 != r1) goto L358
            android.support.constraint.n.k.e r0 = r8.f523b
            int r1 = r0.n
            if (r1 != 0) goto L358
            boolean r0 = r0.H()
            if (r0 != 0) goto L358
            android.support.constraint.n.k.m.f r0 = r8.h
            java.util.List<android.support.constraint.n.k.m.f> r0 = r0.l
            java.lang.Object r0 = r0.get(r10)
            android.support.constraint.n.k.m.f r0 = (android.support.constraint.n.k.m.f) r0
            android.support.constraint.n.k.m.f r1 = r8.i
            java.util.List<android.support.constraint.n.k.m.f> r1 = r1.l
            java.lang.Object r1 = r1.get(r10)
            android.support.constraint.n.k.m.f r1 = (android.support.constraint.n.k.m.f) r1
            int r0 = r0.g
            android.support.constraint.n.k.m.f r2 = r8.h
            int r3 = r2.f
            int r0 = r0 + r3
            int r1 = r1.g
            android.support.constraint.n.k.m.f r3 = r8.i
            int r3 = r3.f
            int r1 = r1 + r3
            int r3 = r1 - r0
            r2.a(r0)
            android.support.constraint.n.k.m.f r0 = r8.i
            r0.a(r1)
            android.support.constraint.n.k.m.g r0 = r8.e
            r0.a(r3)
            return
        L358:
            android.support.constraint.n.k.m.g r0 = r8.e
            boolean r0 = r0.j
            if (r0 != 0) goto L3bc
            android.support.constraint.n.k.e$b r0 = r8.d
            android.support.constraint.n.k.e$b r1 = android.support.constraint.n.k.e.b.d
            if (r0 != r1) goto L3bc
            int r0 = r8.f522a
            if (r0 != r9) goto L3bc
            android.support.constraint.n.k.m.f r0 = r8.h
            java.util.List<android.support.constraint.n.k.m.f> r0 = r0.l
            int r0 = r0.size()
            if (r0 <= 0) goto L3bc
            android.support.constraint.n.k.m.f r0 = r8.i
            java.util.List<android.support.constraint.n.k.m.f> r0 = r0.l
            int r0 = r0.size()
            if (r0 <= 0) goto L3bc
            android.support.constraint.n.k.m.f r0 = r8.h
            java.util.List<android.support.constraint.n.k.m.f> r0 = r0.l
            java.lang.Object r0 = r0.get(r10)
            android.support.constraint.n.k.m.f r0 = (android.support.constraint.n.k.m.f) r0
            android.support.constraint.n.k.m.f r1 = r8.i
            java.util.List<android.support.constraint.n.k.m.f> r1 = r1.l
            java.lang.Object r1 = r1.get(r10)
            android.support.constraint.n.k.m.f r1 = (android.support.constraint.n.k.m.f) r1
            int r0 = r0.g
            android.support.constraint.n.k.m.f r2 = r8.h
            int r2 = r2.f
            int r0 = r0 + r2
            int r1 = r1.g
            android.support.constraint.n.k.m.f r2 = r8.i
            int r2 = r2.f
            int r1 = r1 + r2
            int r1 = r1 - r0
            android.support.constraint.n.k.m.g r0 = r8.e
            int r0 = r0.m
            int r0 = java.lang.Math.min(r1, r0)
            android.support.constraint.n.k.e r1 = r8.f523b
            int r2 = r1.r
            int r1 = r1.q
            int r0 = java.lang.Math.max(r1, r0)
            if (r2 <= 0) goto L3b7
            int r0 = java.lang.Math.min(r2, r0)
        L3b7:
            android.support.constraint.n.k.m.g r1 = r8.e
            r1.a(r0)
        L3bc:
            android.support.constraint.n.k.m.g r0 = r8.e
            boolean r0 = r0.j
            if (r0 != 0) goto L3c3
            return
        L3c3:
            android.support.constraint.n.k.m.f r0 = r8.h
            java.util.List<android.support.constraint.n.k.m.f> r0 = r0.l
            java.lang.Object r0 = r0.get(r10)
            android.support.constraint.n.k.m.f r0 = (android.support.constraint.n.k.m.f) r0
            android.support.constraint.n.k.m.f r1 = r8.i
            java.util.List<android.support.constraint.n.k.m.f> r1 = r1.l
            java.lang.Object r1 = r1.get(r10)
            android.support.constraint.n.k.m.f r1 = (android.support.constraint.n.k.m.f) r1
            int r2 = r0.g
            android.support.constraint.n.k.m.f r3 = r8.h
            int r3 = r3.f
            int r2 = r2 + r3
            int r3 = r1.g
            android.support.constraint.n.k.m.f r4 = r8.i
            int r4 = r4.f
            int r3 = r3 + r4
            android.support.constraint.n.k.e r4 = r8.f523b
            float r4 = r4.l()
            if (r0 != r1) goto L3f2
            int r2 = r0.g
            int r3 = r1.g
            r4 = r11
        L3f2:
            int r3 = r3 - r2
            android.support.constraint.n.k.m.g r0 = r8.e
            int r0 = r0.g
            int r3 = r3 - r0
            android.support.constraint.n.k.m.f r0 = r8.h
            float r1 = (float) r2
            float r1 = r1 + r11
            float r2 = (float) r3
            float r2 = r2 * r4
            float r1 = r1 + r2
            int r1 = (int) r1
            r0.a(r1)
            android.support.constraint.n.k.m.f r0 = r8.i
            android.support.constraint.n.k.m.f r1 = r8.h
            int r1 = r1.g
            android.support.constraint.n.k.m.g r2 = r8.e
            int r2 = r2.g
            int r1 = r1 + r2
            r0.a(r1)
        L411:
            return
    }

    @Override // android.support.constraint.n.k.m.p
    public void b() {
            r2 = this;
            android.support.constraint.n.k.m.f r0 = r2.h
            boolean r1 = r0.j
            if (r1 == 0) goto Ld
            android.support.constraint.n.k.e r2 = r2.f523b
            int r0 = r0.g
            r2.u(r0)
        Ld:
            return
    }

    @Override // android.support.constraint.n.k.m.p
    void c() {
            r1 = this;
            r0 = 0
            r1.f524c = r0
            android.support.constraint.n.k.m.f r0 = r1.h
            r0.a()
            android.support.constraint.n.k.m.f r0 = r1.i
            r0.a()
            android.support.constraint.n.k.m.g r0 = r1.e
            r0.a()
            r0 = 0
            r1.g = r0
            return
    }

    @Override // android.support.constraint.n.k.m.p
    boolean f() {
            r3 = this;
            android.support.constraint.n.k.e$b r0 = r3.d
            android.support.constraint.n.k.e$b r1 = android.support.constraint.n.k.e.b.d
            r2 = 1
            if (r0 != r1) goto L10
            android.support.constraint.n.k.e r3 = r3.f523b
            int r3 = r3.n
            if (r3 != 0) goto Le
            return r2
        Le:
            r3 = 0
            return r3
        L10:
            return r2
    }

    void g() {
            r2 = this;
            r0 = 0
            r2.g = r0
            android.support.constraint.n.k.m.f r1 = r2.h
            r1.a()
            android.support.constraint.n.k.m.f r1 = r2.h
            r1.j = r0
            android.support.constraint.n.k.m.f r1 = r2.i
            r1.a()
            android.support.constraint.n.k.m.f r1 = r2.i
            r1.j = r0
            android.support.constraint.n.k.m.g r2 = r2.e
            r2.j = r0
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "HorizontalRun "
            r0.append(r1)
            android.support.constraint.n.k.e r2 = r2.f523b
            java.lang.String r2 = r2.h()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
