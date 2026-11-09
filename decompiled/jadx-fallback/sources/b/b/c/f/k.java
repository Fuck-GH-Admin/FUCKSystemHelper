package b.b.c.f;

/* JADX INFO: loaded from: classes.dex */
public class k<K, V> {
    static java.lang.Object[] e;
    static int f;
    static java.lang.Object[] g;
    static int h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int[] f1095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    java.lang.Object[] f1096c;
    int d;

    public k() {
            r1 = this;
            r1.<init>()
            int[] r0 = b.b.c.f.c.f1075a
            r1.f1095b = r0
            java.lang.Object[] r0 = b.b.c.f.c.f1077c
            r1.f1096c = r0
            r0 = 0
            r1.d = r0
            return
    }

    public k(int r1) {
            r0 = this;
            r0.<init>()
            if (r1 != 0) goto Le
            int[] r1 = b.b.c.f.c.f1075a
            r0.f1095b = r1
            java.lang.Object[] r1 = b.b.c.f.c.f1077c
            r0.f1096c = r1
            goto L11
        Le:
            r0.e(r1)
        L11:
            r1 = 0
            r0.d = r1
            return
    }

    private static int a(int[] r0, int r1, int r2) {
            int r0 = b.b.c.f.c.a(r0, r1, r2)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L5
            return r0
        L5:
            java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
            r0.<init>()
            throw r0
    }

    private static void a(int[] r7, java.lang.Object[] r8, int r9) {
            int r0 = r7.length
            r1 = 0
            r2 = 2
            r3 = 0
            r4 = 10
            r5 = 1
            r6 = 8
            if (r0 != r6) goto L2e
            java.lang.Class<b.b.c.f.a> r0 = b.b.c.f.a.class
            monitor-enter(r0)
            int r6 = b.b.c.f.k.h     // Catch: java.lang.Throwable -> L2b
            if (r6 >= r4) goto L29
            java.lang.Object[] r4 = b.b.c.f.k.g     // Catch: java.lang.Throwable -> L2b
            r8[r3] = r4     // Catch: java.lang.Throwable -> L2b
            r8[r5] = r7     // Catch: java.lang.Throwable -> L2b
            int r7 = r9 << 1
            int r7 = r7 - r5
        L1b:
            if (r7 < r2) goto L22
            r8[r7] = r1     // Catch: java.lang.Throwable -> L2b
            int r7 = r7 + (-1)
            goto L1b
        L22:
            b.b.c.f.k.g = r8     // Catch: java.lang.Throwable -> L2b
            int r7 = b.b.c.f.k.h     // Catch: java.lang.Throwable -> L2b
            int r7 = r7 + r5
            b.b.c.f.k.h = r7     // Catch: java.lang.Throwable -> L2b
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            goto L55
        L2b:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            throw r7
        L2e:
            int r0 = r7.length
            r6 = 4
            if (r0 != r6) goto L55
            java.lang.Class<b.b.c.f.a> r0 = b.b.c.f.a.class
            monitor-enter(r0)
            int r6 = b.b.c.f.k.f     // Catch: java.lang.Throwable -> L52
            if (r6 >= r4) goto L50
            java.lang.Object[] r4 = b.b.c.f.k.e     // Catch: java.lang.Throwable -> L52
            r8[r3] = r4     // Catch: java.lang.Throwable -> L52
            r8[r5] = r7     // Catch: java.lang.Throwable -> L52
            int r7 = r9 << 1
            int r7 = r7 - r5
        L42:
            if (r7 < r2) goto L49
            r8[r7] = r1     // Catch: java.lang.Throwable -> L52
            int r7 = r7 + (-1)
            goto L42
        L49:
            b.b.c.f.k.e = r8     // Catch: java.lang.Throwable -> L52
            int r7 = b.b.c.f.k.f     // Catch: java.lang.Throwable -> L52
            int r7 = r7 + r5
            b.b.c.f.k.f = r7     // Catch: java.lang.Throwable -> L52
        L50:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L52
            goto L55
        L52:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L52
            throw r7
        L55:
            return
    }

    private void e(int r6) {
            r5 = this;
            r0 = 0
            r1 = 0
            r2 = 1
            r3 = 8
            if (r6 != r3) goto L2e
            java.lang.Class<b.b.c.f.a> r3 = b.b.c.f.a.class
            monitor-enter(r3)
            java.lang.Object[] r4 = b.b.c.f.k.g     // Catch: java.lang.Throwable -> L2b
            if (r4 == 0) goto L29
            java.lang.Object[] r6 = b.b.c.f.k.g     // Catch: java.lang.Throwable -> L2b
            r5.f1096c = r6     // Catch: java.lang.Throwable -> L2b
            r4 = r6[r1]     // Catch: java.lang.Throwable -> L2b
            java.lang.Object[] r4 = (java.lang.Object[]) r4     // Catch: java.lang.Throwable -> L2b
            b.b.c.f.k.g = r4     // Catch: java.lang.Throwable -> L2b
            r4 = r6[r2]     // Catch: java.lang.Throwable -> L2b
            int[] r4 = (int[]) r4     // Catch: java.lang.Throwable -> L2b
            r5.f1095b = r4     // Catch: java.lang.Throwable -> L2b
            r6[r2] = r0     // Catch: java.lang.Throwable -> L2b
            r6[r1] = r0     // Catch: java.lang.Throwable -> L2b
            int r5 = b.b.c.f.k.h     // Catch: java.lang.Throwable -> L2b
            int r5 = r5 - r2
            b.b.c.f.k.h = r5     // Catch: java.lang.Throwable -> L2b
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
            java.lang.Class<b.b.c.f.a> r3 = b.b.c.f.a.class
            monitor-enter(r3)
            java.lang.Object[] r4 = b.b.c.f.k.e     // Catch: java.lang.Throwable -> L55
            if (r4 == 0) goto L53
            java.lang.Object[] r6 = b.b.c.f.k.e     // Catch: java.lang.Throwable -> L55
            r5.f1096c = r6     // Catch: java.lang.Throwable -> L55
            r4 = r6[r1]     // Catch: java.lang.Throwable -> L55
            java.lang.Object[] r4 = (java.lang.Object[]) r4     // Catch: java.lang.Throwable -> L55
            b.b.c.f.k.e = r4     // Catch: java.lang.Throwable -> L55
            r4 = r6[r2]     // Catch: java.lang.Throwable -> L55
            int[] r4 = (int[]) r4     // Catch: java.lang.Throwable -> L55
            r5.f1095b = r4     // Catch: java.lang.Throwable -> L55
            r6[r2] = r0     // Catch: java.lang.Throwable -> L55
            r6[r1] = r0     // Catch: java.lang.Throwable -> L55
            int r5 = b.b.c.f.k.f     // Catch: java.lang.Throwable -> L55
            int r5 = r5 - r2
            b.b.c.f.k.f = r5     // Catch: java.lang.Throwable -> L55
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
            r5.f1095b = r0
            int r6 = r6 << r2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r5.f1096c = r6
            return
    }

    int a() {
            r5 = this;
            int r0 = r5.d
            if (r0 != 0) goto L6
            r5 = -1
            return r5
        L6:
            int[] r1 = r5.f1095b
            r2 = 0
            int r1 = a(r1, r0, r2)
            if (r1 >= 0) goto L10
            return r1
        L10:
            java.lang.Object[] r2 = r5.f1096c
            int r3 = r1 << 1
            r2 = r2[r3]
            if (r2 != 0) goto L19
            return r1
        L19:
            int r2 = r1 + 1
        L1b:
            if (r2 >= r0) goto L2f
            int[] r3 = r5.f1095b
            r3 = r3[r2]
            if (r3 != 0) goto L2f
            java.lang.Object[] r3 = r5.f1096c
            int r4 = r2 << 1
            r3 = r3[r4]
            if (r3 != 0) goto L2c
            return r2
        L2c:
            int r2 = r2 + 1
            goto L1b
        L2f:
            int r1 = r1 + (-1)
        L31:
            if (r1 < 0) goto L45
            int[] r0 = r5.f1095b
            r0 = r0[r1]
            if (r0 != 0) goto L45
            java.lang.Object[] r0 = r5.f1096c
            int r3 = r1 << 1
            r0 = r0[r3]
            if (r0 != 0) goto L42
            return r1
        L42:
            int r1 = r1 + (-1)
            goto L31
        L45:
            int r5 = ~r2
            return r5
    }

    public int a(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L7
            int r1 = r1.a()
            goto Lf
        L7:
            int r0 = r2.hashCode()
            int r1 = r1.a(r2, r0)
        Lf:
            return r1
    }

    int a(java.lang.Object r6, int r7) {
            r5 = this;
            int r0 = r5.d
            if (r0 != 0) goto L6
            r5 = -1
            return r5
        L6:
            int[] r1 = r5.f1095b
            int r1 = a(r1, r0, r7)
            if (r1 >= 0) goto Lf
            return r1
        Lf:
            java.lang.Object[] r2 = r5.f1096c
            int r3 = r1 << 1
            r2 = r2[r3]
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L1c
            return r1
        L1c:
            int r2 = r1 + 1
        L1e:
            if (r2 >= r0) goto L36
            int[] r3 = r5.f1095b
            r3 = r3[r2]
            if (r3 != r7) goto L36
            java.lang.Object[] r3 = r5.f1096c
            int r4 = r2 << 1
            r3 = r3[r4]
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L33
            return r2
        L33:
            int r2 = r2 + 1
            goto L1e
        L36:
            int r1 = r1 + (-1)
        L38:
            if (r1 < 0) goto L50
            int[] r0 = r5.f1095b
            r0 = r0[r1]
            if (r0 != r7) goto L50
            java.lang.Object[] r0 = r5.f1096c
            int r3 = r1 << 1
            r0 = r0[r3]
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L4d
            return r1
        L4d:
            int r1 = r1 + (-1)
            goto L38
        L50:
            int r5 = ~r2
            return r5
    }

    public V a(int r2, V r3) {
            r1 = this;
            int r2 = r2 << 1
            int r2 = r2 + 1
            java.lang.Object[] r1 = r1.f1096c
            r0 = r1[r2]
            r1[r2] = r3
            return r0
    }

    public void a(int r6) {
            r5 = this;
            int r0 = r5.d
            int[] r1 = r5.f1095b
            int r2 = r1.length
            if (r2 >= r6) goto L20
            java.lang.Object[] r2 = r5.f1096c
            r5.e(r6)
            int r6 = r5.d
            if (r6 <= 0) goto L1d
            int[] r6 = r5.f1095b
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r6, r3, r0)
            java.lang.Object[] r6 = r5.f1096c
            int r4 = r0 << 1
            java.lang.System.arraycopy(r2, r3, r6, r3, r4)
        L1d:
            a(r1, r2, r0)
        L20:
            int r5 = r5.d
            if (r5 != r0) goto L25
            return
        L25:
            java.util.ConcurrentModificationException r5 = new java.util.ConcurrentModificationException
            r5.<init>()
            throw r5
    }

    int b(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.d
            int r0 = r0 * 2
            java.lang.Object[] r4 = r4.f1096c
            r1 = 1
            if (r5 != 0) goto L16
            r5 = r1
        La:
            if (r5 >= r0) goto L27
            r2 = r4[r5]
            if (r2 != 0) goto L13
            int r4 = r5 >> 1
            return r4
        L13:
            int r5 = r5 + 2
            goto La
        L16:
            r2 = r1
        L17:
            if (r2 >= r0) goto L27
            r3 = r4[r2]
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L24
            int r4 = r2 >> 1
            return r4
        L24:
            int r2 = r2 + 2
            goto L17
        L27:
            r4 = -1
            return r4
    }

    public K b(int r1) {
            r0 = this;
            java.lang.Object[] r0 = r0.f1096c
            int r1 = r1 << 1
            r0 = r0[r1]
            return r0
    }

    public V c(int r11) {
            r10 = this;
            java.lang.Object[] r0 = r10.f1096c
            int r1 = r11 << 1
            int r2 = r1 + 1
            r2 = r0[r2]
            int r3 = r10.d
            r4 = 0
            r5 = 1
            if (r3 > r5) goto L1c
            int[] r11 = r10.f1095b
            a(r11, r0, r3)
            int[] r11 = b.b.c.f.c.f1075a
            r10.f1095b = r11
            java.lang.Object[] r11 = b.b.c.f.c.f1077c
            r10.f1096c = r11
            goto L81
        L1c:
            int r0 = r3 + (-1)
            int[] r6 = r10.f1095b
            int r7 = r6.length
            r8 = 8
            if (r7 <= r8) goto L62
            int r6 = r6.length
            int r6 = r6 / 3
            if (r3 >= r6) goto L62
            if (r3 <= r8) goto L30
            int r6 = r3 >> 1
            int r8 = r3 + r6
        L30:
            int[] r6 = r10.f1095b
            java.lang.Object[] r7 = r10.f1096c
            r10.e(r8)
            int r8 = r10.d
            if (r3 != r8) goto L5c
            if (r11 <= 0) goto L47
            int[] r8 = r10.f1095b
            java.lang.System.arraycopy(r6, r4, r8, r4, r11)
            java.lang.Object[] r8 = r10.f1096c
            java.lang.System.arraycopy(r7, r4, r8, r4, r1)
        L47:
            if (r11 >= r0) goto L80
            int r4 = r11 + 1
            int[] r8 = r10.f1095b
            int r9 = r0 - r11
            java.lang.System.arraycopy(r6, r4, r8, r11, r9)
            int r11 = r4 << 1
            java.lang.Object[] r4 = r10.f1096c
            int r5 = r9 << 1
            java.lang.System.arraycopy(r7, r11, r4, r1, r5)
            goto L80
        L5c:
            java.util.ConcurrentModificationException r10 = new java.util.ConcurrentModificationException
            r10.<init>()
            throw r10
        L62:
            if (r11 >= r0) goto L76
            int[] r4 = r10.f1095b
            int r6 = r11 + 1
            int r7 = r0 - r11
            java.lang.System.arraycopy(r4, r6, r4, r11, r7)
            java.lang.Object[] r11 = r10.f1096c
            int r4 = r6 << 1
            int r6 = r7 << 1
            java.lang.System.arraycopy(r11, r4, r11, r1, r6)
        L76:
            java.lang.Object[] r11 = r10.f1096c
            int r1 = r0 << 1
            r4 = 0
            r11[r1] = r4
            int r1 = r1 + r5
            r11[r1] = r4
        L80:
            r4 = r0
        L81:
            int r11 = r10.d
            if (r3 != r11) goto L88
            r10.d = r4
            return r2
        L88:
            java.util.ConcurrentModificationException r10 = new java.util.ConcurrentModificationException
            r10.<init>()
            throw r10
    }

    public void clear() {
            r4 = this;
            int r0 = r4.d
            if (r0 <= 0) goto L16
            int[] r1 = r4.f1095b
            java.lang.Object[] r2 = r4.f1096c
            int[] r3 = b.b.c.f.c.f1075a
            r4.f1095b = r3
            java.lang.Object[] r3 = b.b.c.f.c.f1077c
            r4.f1096c = r3
            r3 = 0
            r4.d = r3
            a(r1, r2, r0)
        L16:
            int r4 = r4.d
            if (r4 > 0) goto L1b
            return
        L1b:
            java.util.ConcurrentModificationException r4 = new java.util.ConcurrentModificationException
            r4.<init>()
            throw r4
    }

    public boolean containsKey(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.a(r1)
            if (r0 < 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean containsValue(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.b(r1)
            if (r0 < 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public V d(int r1) {
            r0 = this;
            java.lang.Object[] r0 = r0.f1096c
            int r1 = r1 << 1
            int r1 = r1 + 1
            r0 = r0[r1]
            return r0
    }

    public boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof b.b.c.f.k
            r2 = 0
            if (r1 == 0) goto L3e
            b.b.c.f.k r7 = (b.b.c.f.k) r7
            int r1 = r6.size()
            int r3 = r7.size()
            if (r1 == r3) goto L16
            return r2
        L16:
            r1 = r2
        L17:
            int r3 = r6.d     // Catch: java.lang.Throwable -> L3d
            if (r1 >= r3) goto L3c
            java.lang.Object r3 = r6.b(r1)     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r4 = r6.d(r1)     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r5 = r7.get(r3)     // Catch: java.lang.Throwable -> L3d
            if (r4 != 0) goto L32
            if (r5 != 0) goto L31
            boolean r3 = r7.containsKey(r3)     // Catch: java.lang.Throwable -> L3d
            if (r3 != 0) goto L39
        L31:
            return r2
        L32:
            boolean r3 = r4.equals(r5)     // Catch: java.lang.Throwable -> L3d
            if (r3 != 0) goto L39
            return r2
        L39:
            int r1 = r1 + 1
            goto L17
        L3c:
            return r0
        L3d:
            return r2
        L3e:
            boolean r1 = r7 instanceof java.util.Map
            if (r1 == 0) goto L76
            java.util.Map r7 = (java.util.Map) r7
            int r1 = r6.size()
            int r3 = r7.size()
            if (r1 == r3) goto L4f
            return r2
        L4f:
            r1 = r2
        L50:
            int r3 = r6.d     // Catch: java.lang.Throwable -> L76
            if (r1 >= r3) goto L75
            java.lang.Object r3 = r6.b(r1)     // Catch: java.lang.Throwable -> L76
            java.lang.Object r4 = r6.d(r1)     // Catch: java.lang.Throwable -> L76
            java.lang.Object r5 = r7.get(r3)     // Catch: java.lang.Throwable -> L76
            if (r4 != 0) goto L6b
            if (r5 != 0) goto L6a
            boolean r3 = r7.containsKey(r3)     // Catch: java.lang.Throwable -> L76
            if (r3 != 0) goto L72
        L6a:
            return r2
        L6b:
            boolean r3 = r4.equals(r5)     // Catch: java.lang.Throwable -> L76
            if (r3 != 0) goto L72
            return r2
        L72:
            int r1 = r1 + 1
            goto L50
        L75:
            return r0
        L76:
            return r2
    }

    public V get(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.a(r1)
            if (r1 < 0) goto Lf
            java.lang.Object[] r0 = r0.f1096c
            int r1 = r1 << 1
            int r1 = r1 + 1
            r0 = r0[r1]
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    public int hashCode() {
            r8 = this;
            int[] r0 = r8.f1095b
            java.lang.Object[] r1 = r8.f1096c
            int r8 = r8.d
            r2 = 1
            r3 = 0
            r4 = r3
            r5 = r4
        La:
            if (r4 >= r8) goto L1f
            r6 = r1[r2]
            r7 = r0[r4]
            if (r6 != 0) goto L14
            r6 = r3
            goto L18
        L14:
            int r6 = r6.hashCode()
        L18:
            r6 = r6 ^ r7
            int r5 = r5 + r6
            int r4 = r4 + 1
            int r2 = r2 + 2
            goto La
        L1f:
            return r5
    }

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

    public V put(K r10, V r11) {
            r9 = this;
            int r0 = r9.d
            r1 = 0
            if (r10 != 0) goto Lb
            int r2 = r9.a()
            r3 = r1
            goto L16
        Lb:
            int r2 = r10.hashCode()
            int r3 = r9.a(r10, r2)
            r8 = r3
            r3 = r2
            r2 = r8
        L16:
            if (r2 < 0) goto L23
            int r10 = r2 << 1
            int r10 = r10 + 1
            java.lang.Object[] r9 = r9.f1096c
            r0 = r9[r10]
            r9[r10] = r11
            return r0
        L23:
            int r2 = ~r2
            int[] r4 = r9.f1095b
            int r4 = r4.length
            if (r0 < r4) goto L59
            r4 = 4
            r5 = 8
            if (r0 < r5) goto L32
            int r4 = r0 >> 1
            int r4 = r4 + r0
            goto L35
        L32:
            if (r0 < r4) goto L35
            r4 = r5
        L35:
            int[] r5 = r9.f1095b
            java.lang.Object[] r6 = r9.f1096c
            r9.e(r4)
            int r4 = r9.d
            if (r0 != r4) goto L53
            int[] r4 = r9.f1095b
            int r7 = r4.length
            if (r7 <= 0) goto L4f
            int r7 = r5.length
            java.lang.System.arraycopy(r5, r1, r4, r1, r7)
            java.lang.Object[] r4 = r9.f1096c
            int r7 = r6.length
            java.lang.System.arraycopy(r6, r1, r4, r1, r7)
        L4f:
            a(r5, r6, r0)
            goto L59
        L53:
            java.util.ConcurrentModificationException r9 = new java.util.ConcurrentModificationException
            r9.<init>()
            throw r9
        L59:
            if (r2 >= r0) goto L72
            int[] r1 = r9.f1095b
            int r4 = r2 + 1
            int r5 = r0 - r2
            java.lang.System.arraycopy(r1, r2, r1, r4, r5)
            java.lang.Object[] r1 = r9.f1096c
            int r5 = r2 << 1
            int r4 = r4 << 1
            int r6 = r9.d
            int r6 = r6 - r2
            int r6 = r6 << 1
            java.lang.System.arraycopy(r1, r5, r1, r4, r6)
        L72:
            int r1 = r9.d
            if (r0 != r1) goto L8d
            int[] r0 = r9.f1095b
            int r4 = r0.length
            if (r2 >= r4) goto L8d
            r0[r2] = r3
            java.lang.Object[] r0 = r9.f1096c
            int r2 = r2 << 1
            r0[r2] = r10
            int r2 = r2 + 1
            r0[r2] = r11
            int r1 = r1 + 1
            r9.d = r1
            r9 = 0
            return r9
        L8d:
            java.util.ConcurrentModificationException r9 = new java.util.ConcurrentModificationException
            r9.<init>()
            throw r9
    }

    public V remove(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.a(r1)
            if (r1 < 0) goto Lb
            java.lang.Object r0 = r0.c(r1)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public int size() {
            r0 = this;
            int r0 = r0.d
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L9
            java.lang.String r4 = "{}"
            return r4
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r4.d
            int r1 = r1 * 28
            r0.<init>(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            r1 = 0
        L18:
            int r2 = r4.d
            if (r1 >= r2) goto L47
            if (r1 <= 0) goto L23
            java.lang.String r2 = ", "
            r0.append(r2)
        L23:
            java.lang.Object r2 = r4.b(r1)
            java.lang.String r3 = "(this Map)"
            if (r2 == r4) goto L2f
            r0.append(r2)
            goto L32
        L2f:
            r0.append(r3)
        L32:
            r2 = 61
            r0.append(r2)
            java.lang.Object r2 = r4.d(r1)
            if (r2 == r4) goto L41
            r0.append(r2)
            goto L44
        L41:
            r0.append(r3)
        L44:
            int r1 = r1 + 1
            goto L18
        L47:
            r4 = 125(0x7d, float:1.75E-43)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }
}
