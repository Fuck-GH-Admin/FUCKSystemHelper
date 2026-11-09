package b.b.c.f;

/* JADX INFO: loaded from: classes.dex */
public final class b<E> implements java.util.Collection<E>, java.util.Set<E> {
    private static final int[] f = null;
    private static final java.lang.Object[] g = null;
    private static java.lang.Object[] h;
    private static int i;
    private static java.lang.Object[] j;
    private static int k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f1073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    java.lang.Object[] f1074c;
    int d;
    private b.b.c.f.h<E, E> e;

    class a extends b.b.c.f.h<E, E> {
        final /* synthetic */ b.b.c.f.b d;

        a(b.b.c.f.b r1) {
                r0 = this;
                r0.d = r1
                r0.<init>()
                return
        }

        @Override // b.b.c.f.h
        protected int a(java.lang.Object r1) {
                r0 = this;
                b.b.c.f.b r0 = r0.d
                int r0 = r0.indexOf(r1)
                return r0
        }

        @Override // b.b.c.f.h
        protected java.lang.Object a(int r1, int r2) {
                r0 = this;
                b.b.c.f.b r0 = r0.d
                java.lang.Object[] r0 = r0.f1074c
                r0 = r0[r1]
                return r0
        }

        @Override // b.b.c.f.h
        protected E a(int r1, E r2) {
                r0 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "not a map"
                r0.<init>(r1)
                throw r0
        }

        @Override // b.b.c.f.h
        protected void a() {
                r0 = this;
                b.b.c.f.b r0 = r0.d
                r0.clear()
                return
        }

        @Override // b.b.c.f.h
        protected void a(int r1) {
                r0 = this;
                b.b.c.f.b r0 = r0.d
                r0.b(r1)
                return
        }

        @Override // b.b.c.f.h
        protected void a(E r1, E r2) {
                r0 = this;
                b.b.c.f.b r0 = r0.d
                r0.add(r1)
                return
        }

        @Override // b.b.c.f.h
        protected int b(java.lang.Object r1) {
                r0 = this;
                b.b.c.f.b r0 = r0.d
                int r0 = r0.indexOf(r1)
                return r0
        }

        @Override // b.b.c.f.h
        protected java.util.Map<E, E> b() {
                r1 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "not a map"
                r1.<init>(r0)
                throw r1
        }

        @Override // b.b.c.f.h
        protected int c() {
                r0 = this;
                b.b.c.f.b r0 = r0.d
                int r0 = r0.d
                return r0
        }
    }

    static {
            r0 = 0
            int[] r1 = new int[r0]
            b.b.c.f.b.f = r1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            b.b.c.f.b.g = r0
            return
    }

    public b() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public b(int r1) {
            r0 = this;
            r0.<init>()
            if (r1 != 0) goto Le
            int[] r1 = b.b.c.f.b.f
            r0.f1073b = r1
            java.lang.Object[] r1 = b.b.c.f.b.g
            r0.f1074c = r1
            goto L11
        Le:
            r0.d(r1)
        L11:
            r1 = 0
            r0.d = r1
            return
    }

    private int a(java.lang.Object r5, int r6) {
            r4 = this;
            int r0 = r4.d
            if (r0 != 0) goto L6
            r4 = -1
            return r4
        L6:
            int[] r1 = r4.f1073b
            int r1 = b.b.c.f.c.a(r1, r0, r6)
            if (r1 >= 0) goto Lf
            return r1
        Lf:
            java.lang.Object[] r2 = r4.f1074c
            r2 = r2[r1]
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L1a
            return r1
        L1a:
            int r2 = r1 + 1
        L1c:
            if (r2 >= r0) goto L32
            int[] r3 = r4.f1073b
            r3 = r3[r2]
            if (r3 != r6) goto L32
            java.lang.Object[] r3 = r4.f1074c
            r3 = r3[r2]
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L2f
            return r2
        L2f:
            int r2 = r2 + 1
            goto L1c
        L32:
            int r1 = r1 + (-1)
        L34:
            if (r1 < 0) goto L4a
            int[] r0 = r4.f1073b
            r0 = r0[r1]
            if (r0 != r6) goto L4a
            java.lang.Object[] r0 = r4.f1074c
            r0 = r0[r1]
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L47
            return r1
        L47:
            int r1 = r1 + (-1)
            goto L34
        L4a:
            int r4 = ~r2
            return r4
    }

    private b.b.c.f.h<E, E> a() {
            r1 = this;
            b.b.c.f.h<E, E> r0 = r1.e
            if (r0 != 0) goto Lb
            b.b.c.f.b$a r0 = new b.b.c.f.b$a
            r0.<init>(r1)
            r1.e = r0
        Lb:
            b.b.c.f.h<E, E> r1 = r1.e
            return r1
    }

    private static void a(int[] r7, java.lang.Object[] r8, int r9) {
            int r0 = r7.length
            r1 = 0
            r2 = 2
            r3 = 0
            r4 = 10
            r5 = 1
            r6 = 8
            if (r0 != r6) goto L2c
            java.lang.Class<b.b.c.f.b> r0 = b.b.c.f.b.class
            monitor-enter(r0)
            int r6 = b.b.c.f.b.k     // Catch: java.lang.Throwable -> L29
            if (r6 >= r4) goto L27
            java.lang.Object[] r4 = b.b.c.f.b.j     // Catch: java.lang.Throwable -> L29
            r8[r3] = r4     // Catch: java.lang.Throwable -> L29
            r8[r5] = r7     // Catch: java.lang.Throwable -> L29
            int r9 = r9 - r5
        L19:
            if (r9 < r2) goto L20
            r8[r9] = r1     // Catch: java.lang.Throwable -> L29
            int r9 = r9 + (-1)
            goto L19
        L20:
            b.b.c.f.b.j = r8     // Catch: java.lang.Throwable -> L29
            int r7 = b.b.c.f.b.k     // Catch: java.lang.Throwable -> L29
            int r7 = r7 + r5
            b.b.c.f.b.k = r7     // Catch: java.lang.Throwable -> L29
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            goto L51
        L29:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            throw r7
        L2c:
            int r0 = r7.length
            r6 = 4
            if (r0 != r6) goto L51
            java.lang.Class<b.b.c.f.b> r0 = b.b.c.f.b.class
            monitor-enter(r0)
            int r6 = b.b.c.f.b.i     // Catch: java.lang.Throwable -> L4e
            if (r6 >= r4) goto L4c
            java.lang.Object[] r4 = b.b.c.f.b.h     // Catch: java.lang.Throwable -> L4e
            r8[r3] = r4     // Catch: java.lang.Throwable -> L4e
            r8[r5] = r7     // Catch: java.lang.Throwable -> L4e
            int r9 = r9 - r5
        L3e:
            if (r9 < r2) goto L45
            r8[r9] = r1     // Catch: java.lang.Throwable -> L4e
            int r9 = r9 + (-1)
            goto L3e
        L45:
            b.b.c.f.b.h = r8     // Catch: java.lang.Throwable -> L4e
            int r7 = b.b.c.f.b.i     // Catch: java.lang.Throwable -> L4e
            int r7 = r7 + r5
            b.b.c.f.b.i = r7     // Catch: java.lang.Throwable -> L4e
        L4c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            goto L51
        L4e:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            throw r7
        L51:
            return
    }

    private int b() {
            r4 = this;
            int r0 = r4.d
            if (r0 != 0) goto L6
            r4 = -1
            return r4
        L6:
            int[] r1 = r4.f1073b
            r2 = 0
            int r1 = b.b.c.f.c.a(r1, r0, r2)
            if (r1 >= 0) goto L10
            return r1
        L10:
            java.lang.Object[] r2 = r4.f1074c
            r2 = r2[r1]
            if (r2 != 0) goto L17
            return r1
        L17:
            int r2 = r1 + 1
        L19:
            if (r2 >= r0) goto L2b
            int[] r3 = r4.f1073b
            r3 = r3[r2]
            if (r3 != 0) goto L2b
            java.lang.Object[] r3 = r4.f1074c
            r3 = r3[r2]
            if (r3 != 0) goto L28
            return r2
        L28:
            int r2 = r2 + 1
            goto L19
        L2b:
            int r1 = r1 + (-1)
        L2d:
            if (r1 < 0) goto L3f
            int[] r0 = r4.f1073b
            r0 = r0[r1]
            if (r0 != 0) goto L3f
            java.lang.Object[] r0 = r4.f1074c
            r0 = r0[r1]
            if (r0 != 0) goto L3c
            return r1
        L3c:
            int r1 = r1 + (-1)
            goto L2d
        L3f:
            int r4 = ~r2
            return r4
    }

    private void d(int r6) {
            r5 = this;
            r0 = 0
            r1 = 0
            r2 = 1
            r3 = 8
            if (r6 != r3) goto L2e
            java.lang.Class<b.b.c.f.b> r3 = b.b.c.f.b.class
            monitor-enter(r3)
            java.lang.Object[] r4 = b.b.c.f.b.j     // Catch: java.lang.Throwable -> L2b
            if (r4 == 0) goto L29
            java.lang.Object[] r6 = b.b.c.f.b.j     // Catch: java.lang.Throwable -> L2b
            r5.f1074c = r6     // Catch: java.lang.Throwable -> L2b
            r4 = r6[r1]     // Catch: java.lang.Throwable -> L2b
            java.lang.Object[] r4 = (java.lang.Object[]) r4     // Catch: java.lang.Throwable -> L2b
            b.b.c.f.b.j = r4     // Catch: java.lang.Throwable -> L2b
            r4 = r6[r2]     // Catch: java.lang.Throwable -> L2b
            int[] r4 = (int[]) r4     // Catch: java.lang.Throwable -> L2b
            r5.f1073b = r4     // Catch: java.lang.Throwable -> L2b
            r6[r2] = r0     // Catch: java.lang.Throwable -> L2b
            r6[r1] = r0     // Catch: java.lang.Throwable -> L2b
            int r5 = b.b.c.f.b.k     // Catch: java.lang.Throwable -> L2b
            int r5 = r5 - r2
            b.b.c.f.b.k = r5     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2b
            return
        L29:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2b
            goto L58
        L2b:
            r5 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2b
            throw r5
        L2e:
            r3 = 4
            if (r6 != r3) goto L58
            java.lang.Class<b.b.c.f.b> r3 = b.b.c.f.b.class
            monitor-enter(r3)
            java.lang.Object[] r4 = b.b.c.f.b.h     // Catch: java.lang.Throwable -> L55
            if (r4 == 0) goto L53
            java.lang.Object[] r6 = b.b.c.f.b.h     // Catch: java.lang.Throwable -> L55
            r5.f1074c = r6     // Catch: java.lang.Throwable -> L55
            r4 = r6[r1]     // Catch: java.lang.Throwable -> L55
            java.lang.Object[] r4 = (java.lang.Object[]) r4     // Catch: java.lang.Throwable -> L55
            b.b.c.f.b.h = r4     // Catch: java.lang.Throwable -> L55
            r4 = r6[r2]     // Catch: java.lang.Throwable -> L55
            int[] r4 = (int[]) r4     // Catch: java.lang.Throwable -> L55
            r5.f1073b = r4     // Catch: java.lang.Throwable -> L55
            r6[r2] = r0     // Catch: java.lang.Throwable -> L55
            r6[r1] = r0     // Catch: java.lang.Throwable -> L55
            int r5 = b.b.c.f.b.i     // Catch: java.lang.Throwable -> L55
            int r5 = r5 - r2
            b.b.c.f.b.i = r5     // Catch: java.lang.Throwable -> L55
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L55
            return
        L53:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L55
            goto L58
        L55:
            r5 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L55
            throw r5
        L58:
            int[] r0 = new int[r6]
            r5.f1073b = r0
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r5.f1074c = r6
            return
    }

    public void a(int r5) {
            r4 = this;
            int[] r0 = r4.f1073b
            int r1 = r0.length
            if (r1 >= r5) goto L20
            java.lang.Object[] r1 = r4.f1074c
            r4.d(r5)
            int r5 = r4.d
            if (r5 <= 0) goto L1b
            int[] r2 = r4.f1073b
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r2, r3, r5)
            java.lang.Object[] r5 = r4.f1074c
            int r2 = r4.d
            java.lang.System.arraycopy(r1, r3, r5, r3, r2)
        L1b:
            int r4 = r4.d
            a(r0, r1, r4)
        L20:
            return
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E r9) {
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L9
            int r1 = r8.b()
            r2 = r0
            goto L14
        L9:
            int r1 = r9.hashCode()
            int r2 = r8.a(r9, r1)
            r7 = r2
            r2 = r1
            r1 = r7
        L14:
            if (r1 < 0) goto L17
            return r0
        L17:
            int r1 = ~r1
            int r3 = r8.d
            int[] r4 = r8.f1073b
            int r4 = r4.length
            if (r3 < r4) goto L46
            r4 = 4
            r5 = 8
            if (r3 < r5) goto L28
            int r4 = r3 >> 1
            int r4 = r4 + r3
            goto L2b
        L28:
            if (r3 < r4) goto L2b
            r4 = r5
        L2b:
            int[] r3 = r8.f1073b
            java.lang.Object[] r5 = r8.f1074c
            r8.d(r4)
            int[] r4 = r8.f1073b
            int r6 = r4.length
            if (r6 <= 0) goto L41
            int r6 = r3.length
            java.lang.System.arraycopy(r3, r0, r4, r0, r6)
            java.lang.Object[] r4 = r8.f1074c
            int r6 = r5.length
            java.lang.System.arraycopy(r5, r0, r4, r0, r6)
        L41:
            int r0 = r8.d
            a(r3, r5, r0)
        L46:
            int r0 = r8.d
            if (r1 >= r0) goto L5a
            int[] r3 = r8.f1073b
            int r4 = r1 + 1
            int r0 = r0 - r1
            java.lang.System.arraycopy(r3, r1, r3, r4, r0)
            java.lang.Object[] r0 = r8.f1074c
            int r3 = r8.d
            int r3 = r3 - r1
            java.lang.System.arraycopy(r0, r1, r0, r4, r3)
        L5a:
            int[] r0 = r8.f1073b
            r0[r1] = r2
            java.lang.Object[] r0 = r8.f1074c
            r0[r1] = r9
            int r9 = r8.d
            r0 = 1
            int r9 = r9 + r0
            r8.d = r9
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(java.util.Collection<? extends E> r3) {
            r2 = this;
            int r0 = r2.d
            int r1 = r3.size()
            int r0 = r0 + r1
            r2.a(r0)
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        Lf:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r3.next()
            boolean r1 = r2.add(r1)
            r0 = r0 | r1
            goto Lf
        L1f:
            return r0
    }

    public E b(int r8) {
            r7 = this;
            java.lang.Object[] r0 = r7.f1074c
            r1 = r0[r8]
            int r2 = r7.d
            r3 = 0
            r4 = 1
            if (r2 > r4) goto L1a
            int[] r8 = r7.f1073b
            a(r8, r0, r2)
            int[] r8 = b.b.c.f.b.f
            r7.f1073b = r8
            java.lang.Object[] r8 = b.b.c.f.b.g
            r7.f1074c = r8
            r7.d = r3
            goto L77
        L1a:
            int[] r0 = r7.f1073b
            int r5 = r0.length
            r6 = 8
            if (r5 <= r6) goto L59
            int r0 = r0.length
            int r0 = r0 / 3
            if (r2 >= r0) goto L59
            if (r2 <= r6) goto L2c
            int r0 = r2 >> 1
            int r6 = r2 + r0
        L2c:
            int[] r0 = r7.f1073b
            java.lang.Object[] r2 = r7.f1074c
            r7.d(r6)
            int r5 = r7.d
            int r5 = r5 - r4
            r7.d = r5
            if (r8 <= 0) goto L44
            int[] r4 = r7.f1073b
            java.lang.System.arraycopy(r0, r3, r4, r3, r8)
            java.lang.Object[] r4 = r7.f1074c
            java.lang.System.arraycopy(r2, r3, r4, r3, r8)
        L44:
            int r3 = r7.d
            if (r8 >= r3) goto L77
            int r4 = r8 + 1
            int[] r5 = r7.f1073b
            int r3 = r3 - r8
            java.lang.System.arraycopy(r0, r4, r5, r8, r3)
            java.lang.Object[] r0 = r7.f1074c
            int r7 = r7.d
            int r7 = r7 - r8
            java.lang.System.arraycopy(r2, r4, r0, r8, r7)
            goto L77
        L59:
            int r0 = r7.d
            int r0 = r0 - r4
            r7.d = r0
            if (r8 >= r0) goto L70
            int[] r2 = r7.f1073b
            int r3 = r8 + 1
            int r0 = r0 - r8
            java.lang.System.arraycopy(r2, r3, r2, r8, r0)
            java.lang.Object[] r0 = r7.f1074c
            int r2 = r7.d
            int r2 = r2 - r8
            java.lang.System.arraycopy(r0, r3, r0, r8, r2)
        L70:
            java.lang.Object[] r8 = r7.f1074c
            int r7 = r7.d
            r0 = 0
            r8[r7] = r0
        L77:
            return r1
    }

    public E c(int r1) {
            r0 = this;
            java.lang.Object[] r0 = r0.f1074c
            r0 = r0[r1]
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
            r3 = this;
            int r0 = r3.d
            if (r0 == 0) goto L16
            int[] r1 = r3.f1073b
            java.lang.Object[] r2 = r3.f1074c
            a(r1, r2, r0)
            int[] r0 = b.b.c.f.b.f
            r3.f1073b = r0
            java.lang.Object[] r0 = b.b.c.f.b.g
            r3.f1074c = r0
            r0 = 0
            r3.d = r0
        L16:
            return
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.indexOf(r1)
            if (r0 < 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(java.util.Collection<?> r2) {
            r1 = this;
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r2.next()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L4
            r1 = 0
            return r1
        L16:
            r1 = 1
            return r1
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof java.util.Set
            r2 = 0
            if (r1 == 0) goto L2a
            java.util.Set r5 = (java.util.Set) r5
            int r1 = r4.size()
            int r3 = r5.size()
            if (r1 == r3) goto L16
            return r2
        L16:
            r1 = r2
        L17:
            int r3 = r4.d     // Catch: java.lang.Throwable -> L2a
            if (r1 >= r3) goto L29
            java.lang.Object r3 = r4.c(r1)     // Catch: java.lang.Throwable -> L2a
            boolean r3 = r5.contains(r3)     // Catch: java.lang.Throwable -> L2a
            if (r3 != 0) goto L26
            return r2
        L26:
            int r1 = r1 + 1
            goto L17
        L29:
            return r0
        L2a:
            return r2
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
            r4 = this;
            int[] r0 = r4.f1073b
            int r4 = r4.d
            r1 = 0
            r2 = r1
        L6:
            if (r1 >= r4) goto Le
            r3 = r0[r1]
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L6
        Le:
            return r2
    }

    public int indexOf(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L7
            int r1 = r1.b()
            goto Lf
        L7:
            int r0 = r2.hashCode()
            int r1 = r1.a(r2, r0)
        Lf:
            return r1
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
            r0 = this;
            int r0 = r0.d
            if (r0 > 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator<E> iterator() {
            r0 = this;
            b.b.c.f.h r0 = r0.a()
            java.util.Set r0 = r0.e()
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto Lb
            r0.b(r1)
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(java.util.Collection<?> r3) {
            r2 = this;
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L5:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L15
            java.lang.Object r1 = r3.next()
            boolean r1 = r2.remove(r1)
            r0 = r0 | r1
            goto L5
        L15:
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(java.util.Collection<?> r5) {
            r4 = this;
            int r0 = r4.d
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
        L5:
            if (r0 < 0) goto L18
            java.lang.Object[] r3 = r4.f1074c
            r3 = r3[r0]
            boolean r3 = r5.contains(r3)
            if (r3 != 0) goto L15
            r4.b(r0)
            r2 = r1
        L15:
            int r0 = r0 + (-1)
            goto L5
        L18:
            return r2
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
            r0 = this;
            int r0 = r0.d
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public java.lang.Object[] toArray() {
            r3 = this;
            int r0 = r3.d
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Object[] r3 = r3.f1074c
            r2 = 0
            java.lang.System.arraycopy(r3, r2, r1, r2, r0)
            return r1
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] r4) {
            r3 = this;
            int r0 = r4.length
            int r1 = r3.d
            if (r0 >= r1) goto L15
            java.lang.Class r4 = r4.getClass()
            java.lang.Class r4 = r4.getComponentType()
            int r0 = r3.d
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r0)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
        L15:
            java.lang.Object[] r0 = r3.f1074c
            int r1 = r3.d
            r2 = 0
            java.lang.System.arraycopy(r0, r2, r4, r2, r1)
            int r0 = r4.length
            int r3 = r3.d
            if (r0 <= r3) goto L25
            r0 = 0
            r4[r3] = r0
        L25:
            return r4
    }

    public java.lang.String toString() {
            r3 = this;
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L9
            java.lang.String r3 = "{}"
            return r3
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r3.d
            int r1 = r1 * 14
            r0.<init>(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            r1 = 0
        L18:
            int r2 = r3.d
            if (r1 >= r2) goto L35
            if (r1 <= 0) goto L23
            java.lang.String r2 = ", "
            r0.append(r2)
        L23:
            java.lang.Object r2 = r3.c(r1)
            if (r2 == r3) goto L2d
            r0.append(r2)
            goto L32
        L2d:
            java.lang.String r2 = "(this Set)"
            r0.append(r2)
        L32:
            int r1 = r1 + 1
            goto L18
        L35:
            r3 = 125(0x7d, float:1.75E-43)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
