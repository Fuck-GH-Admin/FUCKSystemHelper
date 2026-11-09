package android.support.constraint.n;

/* JADX INFO: loaded from: classes.dex */
public class h extends android.support.constraint.n.b {
    private int g;
    private android.support.constraint.n.i[] h;
    private android.support.constraint.n.i[] i;
    private int j;
    android.support.constraint.n.h.b k;

    class a implements java.util.Comparator<android.support.constraint.n.i> {
        a(android.support.constraint.n.h r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public int a(android.support.constraint.n.i r1, android.support.constraint.n.i r2) {
                r0 = this;
                int r0 = r1.f475c
                int r1 = r2.f475c
                int r0 = r0 - r1
                return r0
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(android.support.constraint.n.i r1, android.support.constraint.n.i r2) {
                r0 = this;
                android.support.constraint.n.i r1 = (android.support.constraint.n.i) r1
                android.support.constraint.n.i r2 = (android.support.constraint.n.i) r2
                int r0 = r0.a(r1, r2)
                return r0
        }
    }

    class b implements java.lang.Comparable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        android.support.constraint.n.i f471b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.support.constraint.n.h f472c;

        public b(android.support.constraint.n.h r1, android.support.constraint.n.h r2) {
                r0 = this;
                r0.f472c = r1
                r0.<init>()
                return
        }

        public void a(android.support.constraint.n.i r1) {
                r0 = this;
                r0.f471b = r1
                return
        }

        public final boolean a() {
                r5 = this;
                r0 = 8
            L2:
                r1 = 0
                if (r0 < 0) goto L1a
                android.support.constraint.n.i r2 = r5.f471b
                float[] r2 = r2.i
                r2 = r2[r0]
                r3 = 0
                int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r4 <= 0) goto L11
                return r1
            L11:
                int r1 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r1 >= 0) goto L17
                r5 = 1
                return r5
            L17:
                int r0 = r0 + (-1)
                goto L2
            L1a:
                return r1
        }

        public boolean a(android.support.constraint.n.i r10, float r11) {
                r9 = this;
                android.support.constraint.n.i r0 = r9.f471b
                boolean r0 = r0.f473a
                r1 = 953267991(0x38d1b717, float:1.0E-4)
                r2 = 9
                r3 = 0
                r4 = 1
                r5 = 0
                if (r0 == 0) goto L3e
                r0 = r5
            Lf:
                if (r0 >= r2) goto L34
                android.support.constraint.n.i r6 = r9.f471b
                float[] r6 = r6.i
                r7 = r6[r0]
                float[] r8 = r10.i
                r8 = r8[r0]
                float r8 = r8 * r11
                float r7 = r7 + r8
                r6[r0] = r7
                r6 = r6[r0]
                float r6 = java.lang.Math.abs(r6)
                int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r6 >= 0) goto L30
                android.support.constraint.n.i r6 = r9.f471b
                float[] r6 = r6.i
                r6[r0] = r3
                goto L31
            L30:
                r4 = r5
            L31:
                int r0 = r0 + 1
                goto Lf
            L34:
                if (r4 == 0) goto L3d
                android.support.constraint.n.h r10 = r9.f472c
                android.support.constraint.n.i r9 = r9.f471b
                android.support.constraint.n.h.a(r10, r9)
            L3d:
                return r5
            L3e:
                if (r5 >= r2) goto L62
                float[] r0 = r10.i
                r0 = r0[r5]
                int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r6 == 0) goto L59
                float r0 = r0 * r11
                float r6 = java.lang.Math.abs(r0)
                int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r6 >= 0) goto L52
                r0 = r3
            L52:
                android.support.constraint.n.i r6 = r9.f471b
                float[] r6 = r6.i
                r6[r5] = r0
                goto L5f
            L59:
                android.support.constraint.n.i r0 = r9.f471b
                float[] r0 = r0.i
                r0[r5] = r3
            L5f:
                int r5 = r5 + 1
                goto L3e
            L62:
                return r4
        }

        public void b() {
                r1 = this;
                android.support.constraint.n.i r1 = r1.f471b
                float[] r1 = r1.i
                r0 = 0
                java.util.Arrays.fill(r1, r0)
                return
        }

        public final boolean b(android.support.constraint.n.i r6) {
                r5 = this;
                r0 = 8
            L2:
                r1 = 0
                if (r0 < 0) goto L1c
                float[] r2 = r6.i
                r2 = r2[r0]
                android.support.constraint.n.i r3 = r5.f471b
                float[] r3 = r3.i
                r3 = r3[r0]
                int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
                if (r4 != 0) goto L16
                int r0 = r0 + (-1)
                goto L2
            L16:
                int r5 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
                if (r5 >= 0) goto L1c
                r5 = 1
                return r5
            L1c:
                return r1
        }

        @Override // java.lang.Comparable
        public int compareTo(java.lang.Object r1) {
                r0 = this;
                android.support.constraint.n.i r1 = (android.support.constraint.n.i) r1
                android.support.constraint.n.i r0 = r0.f471b
                int r0 = r0.f475c
                int r1 = r1.f475c
                int r0 = r0 - r1
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                android.support.constraint.n.i r0 = r3.f471b
                java.lang.String r1 = "[ "
                if (r0 == 0) goto L28
                r0 = 0
            L7:
                r2 = 9
                if (r0 >= r2) goto L28
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r1)
                android.support.constraint.n.i r1 = r3.f471b
                float[] r1 = r1.i
                r1 = r1[r0]
                r2.append(r1)
                java.lang.String r1 = " "
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                int r0 = r0 + 1
                goto L7
            L28:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = "] "
                r0.append(r1)
                android.support.constraint.n.i r3 = r3.f471b
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                return r3
        }
    }

    public h(android.support.constraint.n.c r2) {
            r1 = this;
            r1.<init>(r2)
            r2 = 128(0x80, float:1.8E-43)
            r1.g = r2
            android.support.constraint.n.i[] r0 = new android.support.constraint.n.i[r2]
            r1.h = r0
            android.support.constraint.n.i[] r2 = new android.support.constraint.n.i[r2]
            r1.i = r2
            r2 = 0
            r1.j = r2
            android.support.constraint.n.h$b r2 = new android.support.constraint.n.h$b
            r2.<init>(r1, r1)
            r1.k = r2
            return
    }

    static /* synthetic */ void a(android.support.constraint.n.h r0, android.support.constraint.n.i r1) {
            r0.f(r1)
            return
    }

    private final void e(android.support.constraint.n.i r6) {
            r5 = this;
            int r0 = r5.j
            r1 = 1
            int r0 = r0 + r1
            android.support.constraint.n.i[] r2 = r5.h
            int r3 = r2.length
            if (r0 <= r3) goto L1f
            int r0 = r2.length
            int r0 = r0 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r0)
            android.support.constraint.n.i[] r0 = (android.support.constraint.n.i[]) r0
            r5.h = r0
            int r2 = r0.length
            int r2 = r2 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            android.support.constraint.n.i[] r0 = (android.support.constraint.n.i[]) r0
            r5.i = r0
        L1f:
            android.support.constraint.n.i[] r0 = r5.h
            int r2 = r5.j
            r0[r2] = r6
            int r2 = r2 + r1
            r5.j = r2
            if (r2 <= r1) goto L5d
            int r2 = r2 - r1
            r0 = r0[r2]
            int r0 = r0.f475c
            int r2 = r6.f475c
            if (r0 <= r2) goto L5d
            r0 = 0
            r2 = r0
        L35:
            int r3 = r5.j
            if (r2 >= r3) goto L44
            android.support.constraint.n.i[] r3 = r5.i
            android.support.constraint.n.i[] r4 = r5.h
            r4 = r4[r2]
            r3[r2] = r4
            int r2 = r2 + 1
            goto L35
        L44:
            android.support.constraint.n.i[] r2 = r5.i
            android.support.constraint.n.h$a r4 = new android.support.constraint.n.h$a
            r4.<init>(r5)
            java.util.Arrays.sort(r2, r0, r3, r4)
        L4e:
            int r2 = r5.j
            if (r0 >= r2) goto L5d
            android.support.constraint.n.i[] r2 = r5.h
            android.support.constraint.n.i[] r3 = r5.i
            r3 = r3[r0]
            r2[r0] = r3
            int r0 = r0 + 1
            goto L4e
        L5d:
            r6.f473a = r1
            r6.a(r5)
            return
    }

    private final void f(android.support.constraint.n.i r6) {
            r5 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r5.j
            if (r1 >= r2) goto L26
            android.support.constraint.n.i[] r2 = r5.h
            r2 = r2[r1]
            if (r2 != r6) goto L23
        Lc:
            int r2 = r5.j
            int r3 = r2 + (-1)
            if (r1 >= r3) goto L1c
            android.support.constraint.n.i[] r2 = r5.h
            int r3 = r1 + 1
            r4 = r2[r3]
            r2[r1] = r4
            r1 = r3
            goto Lc
        L1c:
            int r2 = r2 + (-1)
            r5.j = r2
            r6.f473a = r0
            return
        L23:
            int r1 = r1 + 1
            goto L2
        L26:
            return
    }

    @Override // android.support.constraint.n.b, android.support.constraint.n.d.a
    public android.support.constraint.n.i a(android.support.constraint.n.d r5, boolean[] r6) {
            r4 = this;
            r5 = -1
            r0 = 0
            r1 = r5
        L3:
            int r2 = r4.j
            if (r0 >= r2) goto L30
            android.support.constraint.n.i[] r2 = r4.h
            r2 = r2[r0]
            int r3 = r2.f475c
            boolean r3 = r6[r3]
            if (r3 == 0) goto L12
            goto L2d
        L12:
            android.support.constraint.n.h$b r3 = r4.k
            r3.a(r2)
            android.support.constraint.n.h$b r2 = r4.k
            if (r1 != r5) goto L22
            boolean r2 = r2.a()
            if (r2 == 0) goto L2d
            goto L2c
        L22:
            android.support.constraint.n.i[] r3 = r4.h
            r3 = r3[r1]
            boolean r2 = r2.b(r3)
            if (r2 == 0) goto L2d
        L2c:
            r1 = r0
        L2d:
            int r0 = r0 + 1
            goto L3
        L30:
            if (r1 != r5) goto L34
            r4 = 0
            return r4
        L34:
            android.support.constraint.n.i[] r4 = r4.h
            r4 = r4[r1]
            return r4
    }

    @Override // android.support.constraint.n.b
    public void a(android.support.constraint.n.d r6, android.support.constraint.n.b r7, boolean r8) {
            r5 = this;
            android.support.constraint.n.i r6 = r7.f457a
            if (r6 != 0) goto L5
            return
        L5:
            android.support.constraint.n.b$a r8 = r7.e
            int r0 = r8.b()
            r1 = 0
        Lc:
            if (r1 >= r0) goto L31
            android.support.constraint.n.i r2 = r8.b(r1)
            float r3 = r8.a(r1)
            android.support.constraint.n.h$b r4 = r5.k
            r4.a(r2)
            android.support.constraint.n.h$b r4 = r5.k
            boolean r4 = r4.a(r6, r3)
            if (r4 == 0) goto L26
            r5.e(r2)
        L26:
            float r2 = r5.f458b
            float r4 = r7.f458b
            float r4 = r4 * r3
            float r2 = r2 + r4
            r5.f458b = r2
            int r1 = r1 + 1
            goto Lc
        L31:
            r5.f(r6)
            return
    }

    @Override // android.support.constraint.n.b, android.support.constraint.n.d.a
    public void a(android.support.constraint.n.i r4) {
            r3 = this;
            android.support.constraint.n.h$b r0 = r3.k
            r0.a(r4)
            android.support.constraint.n.h$b r0 = r3.k
            r0.b()
            float[] r0 = r4.i
            int r1 = r4.e
            r2 = 1065353216(0x3f800000, float:1.0)
            r0[r1] = r2
            r3.e(r4)
            return
    }

    @Override // android.support.constraint.n.b, android.support.constraint.n.d.a
    public void clear() {
            r1 = this;
            r0 = 0
            r1.j = r0
            r0 = 0
            r1.f458b = r0
            return
    }

    @Override // android.support.constraint.n.b, android.support.constraint.n.d.a
    public boolean isEmpty() {
            r0 = this;
            int r0 = r0.j
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // android.support.constraint.n.b
    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            java.lang.String r1 = " goal -> ("
            r0.append(r1)
            float r1 = r4.f458b
            r0.append(r1)
            java.lang.String r1 = ") : "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
        L1e:
            int r2 = r4.j
            if (r1 >= r2) goto L44
            android.support.constraint.n.i[] r2 = r4.h
            r2 = r2[r1]
            android.support.constraint.n.h$b r3 = r4.k
            r3.a(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            android.support.constraint.n.h$b r0 = r4.k
            r2.append(r0)
            java.lang.String r0 = " "
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            int r1 = r1 + 1
            goto L1e
        L44:
            return r0
    }
}
