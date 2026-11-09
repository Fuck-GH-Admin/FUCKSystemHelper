package b.b.c.f;

/* JADX INFO: loaded from: classes.dex */
public class f<E> implements java.lang.Cloneable {
    private static final java.lang.Object f = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f1080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long[] f1081c;
    private java.lang.Object[] d;
    private int e;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            b.b.c.f.f.f = r0
            return
    }

    public f() {
            r1 = this;
            r0 = 10
            r1.<init>(r0)
            return
    }

    public f(int r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f1080b = r0
            if (r3 != 0) goto L11
            long[] r3 = b.b.c.f.c.f1076b
            r2.f1081c = r3
            java.lang.Object[] r3 = b.b.c.f.c.f1077c
            r2.d = r3
            goto L1d
        L11:
            int r3 = b.b.c.f.c.c(r3)
            long[] r1 = new long[r3]
            r2.f1081c = r1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r2.d = r3
        L1d:
            r2.e = r0
            return
    }

    private void c() {
            r9 = this;
            int r0 = r9.e
            long[] r1 = r9.f1081c
            java.lang.Object[] r2 = r9.d
            r3 = 0
            r4 = r3
            r5 = r4
        L9:
            if (r4 >= r0) goto L21
            r6 = r2[r4]
            java.lang.Object r7 = b.b.c.f.f.f
            if (r6 == r7) goto L1e
            if (r4 == r5) goto L1c
            r7 = r1[r4]
            r1[r5] = r7
            r2[r5] = r6
            r6 = 0
            r2[r4] = r6
        L1c:
            int r5 = r5 + 1
        L1e:
            int r4 = r4 + 1
            goto L9
        L21:
            r9.f1080b = r3
            r9.e = r5
            return
    }

    public long a(int r2) {
            r1 = this;
            boolean r0 = r1.f1080b
            if (r0 == 0) goto L7
            r1.c()
        L7:
            long[] r1 = r1.f1081c
            r1 = r1[r2]
            return r1
    }

    public void a() {
            r5 = this;
            int r0 = r5.e
            java.lang.Object[] r1 = r5.d
            r2 = 0
            r3 = r2
        L6:
            if (r3 >= r0) goto Le
            r4 = 0
            r1[r3] = r4
            int r3 = r3 + 1
            goto L6
        Le:
            r5.e = r2
            r5.f1080b = r2
            return
    }

    public void a(long r3) {
            r2 = this;
            long[] r0 = r2.f1081c
            int r1 = r2.e
            int r3 = b.b.c.f.c.a(r0, r1, r3)
            if (r3 < 0) goto L17
            java.lang.Object[] r4 = r2.d
            r0 = r4[r3]
            java.lang.Object r1 = b.b.c.f.f.f
            if (r0 == r1) goto L17
            r4[r3] = r1
            r3 = 1
            r2.f1080b = r3
        L17:
            return
    }

    public void a(long r7, E r9) {
            r6 = this;
            int r0 = r6.e
            if (r0 == 0) goto L12
            long[] r1 = r6.f1081c
            int r0 = r0 + (-1)
            r0 = r1[r0]
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 > 0) goto L12
            r6.c(r7, r9)
            return
        L12:
            boolean r0 = r6.f1080b
            if (r0 == 0) goto L20
            int r0 = r6.e
            long[] r1 = r6.f1081c
            int r1 = r1.length
            if (r0 < r1) goto L20
            r6.c()
        L20:
            int r0 = r6.e
            long[] r1 = r6.f1081c
            int r1 = r1.length
            if (r0 < r1) goto L42
            int r1 = r0 + 1
            int r1 = b.b.c.f.c.c(r1)
            long[] r2 = new long[r1]
            java.lang.Object[] r1 = new java.lang.Object[r1]
            long[] r3 = r6.f1081c
            int r4 = r3.length
            r5 = 0
            java.lang.System.arraycopy(r3, r5, r2, r5, r4)
            java.lang.Object[] r3 = r6.d
            int r4 = r3.length
            java.lang.System.arraycopy(r3, r5, r1, r5, r4)
            r6.f1081c = r2
            r6.d = r1
        L42:
            long[] r1 = r6.f1081c
            r1[r0] = r7
            java.lang.Object[] r7 = r6.d
            r7[r0] = r9
            int r0 = r0 + 1
            r6.e = r0
            return
    }

    public int b() {
            r1 = this;
            boolean r0 = r1.f1080b
            if (r0 == 0) goto L7
            r1.c()
        L7:
            int r1 = r1.e
            return r1
    }

    public E b(int r2) {
            r1 = this;
            boolean r0 = r1.f1080b
            if (r0 == 0) goto L7
            r1.c()
        L7:
            java.lang.Object[] r1 = r1.d
            r1 = r1[r2]
            return r1
    }

    public E b(long r2) {
            r1 = this;
            r0 = 0
            java.lang.Object r1 = r1.b(r2, r0)
            return r1
    }

    public E b(long r3, E r5) {
            r2 = this;
            long[] r0 = r2.f1081c
            int r1 = r2.e
            int r3 = b.b.c.f.c.a(r0, r1, r3)
            if (r3 < 0) goto L16
            java.lang.Object[] r2 = r2.d
            r4 = r2[r3]
            java.lang.Object r0 = b.b.c.f.f.f
            if (r4 != r0) goto L13
            goto L16
        L13:
            r2 = r2[r3]
            return r2
        L16:
            return r5
    }

    public void c(long r7, E r9) {
            r6 = this;
            long[] r0 = r6.f1081c
            int r1 = r6.e
            int r0 = b.b.c.f.c.a(r0, r1, r7)
            if (r0 < 0) goto Lf
            java.lang.Object[] r6 = r6.d
            r6[r0] = r9
            goto L80
        Lf:
            int r0 = ~r0
            int r1 = r6.e
            if (r0 >= r1) goto L23
            java.lang.Object[] r1 = r6.d
            r2 = r1[r0]
            java.lang.Object r3 = b.b.c.f.f.f
            if (r2 != r3) goto L23
            long[] r6 = r6.f1081c
            r6[r0] = r7
            r1[r0] = r9
            return
        L23:
            boolean r1 = r6.f1080b
            if (r1 == 0) goto L3a
            int r1 = r6.e
            long[] r2 = r6.f1081c
            int r2 = r2.length
            if (r1 < r2) goto L3a
            r6.c()
            long[] r0 = r6.f1081c
            int r1 = r6.e
            int r0 = b.b.c.f.c.a(r0, r1, r7)
            int r0 = ~r0
        L3a:
            int r1 = r6.e
            long[] r2 = r6.f1081c
            int r2 = r2.length
            if (r1 < r2) goto L5c
            int r1 = r1 + 1
            int r1 = b.b.c.f.c.c(r1)
            long[] r2 = new long[r1]
            java.lang.Object[] r1 = new java.lang.Object[r1]
            long[] r3 = r6.f1081c
            int r4 = r3.length
            r5 = 0
            java.lang.System.arraycopy(r3, r5, r2, r5, r4)
            java.lang.Object[] r3 = r6.d
            int r4 = r3.length
            java.lang.System.arraycopy(r3, r5, r1, r5, r4)
            r6.f1081c = r2
            r6.d = r1
        L5c:
            int r1 = r6.e
            int r2 = r1 - r0
            if (r2 == 0) goto L72
            long[] r2 = r6.f1081c
            int r3 = r0 + 1
            int r1 = r1 - r0
            java.lang.System.arraycopy(r2, r0, r2, r3, r1)
            java.lang.Object[] r1 = r6.d
            int r2 = r6.e
            int r2 = r2 - r0
            java.lang.System.arraycopy(r1, r0, r1, r3, r2)
        L72:
            long[] r1 = r6.f1081c
            r1[r0] = r7
            java.lang.Object[] r7 = r6.d
            r7[r0] = r9
            int r7 = r6.e
            int r7 = r7 + 1
            r6.e = r7
        L80:
            return
    }

    public b.b.c.f.f<E> clone() {
            r2 = this;
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L1b
            b.b.c.f.f r0 = (b.b.c.f.f) r0     // Catch: java.lang.CloneNotSupportedException -> L1b
            long[] r1 = r2.f1081c     // Catch: java.lang.CloneNotSupportedException -> L1b
            java.lang.Object r1 = r1.clone()     // Catch: java.lang.CloneNotSupportedException -> L1b
            long[] r1 = (long[]) r1     // Catch: java.lang.CloneNotSupportedException -> L1b
            r0.f1081c = r1     // Catch: java.lang.CloneNotSupportedException -> L1b
            java.lang.Object[] r2 = r2.d     // Catch: java.lang.CloneNotSupportedException -> L1b
            java.lang.Object r2 = r2.clone()     // Catch: java.lang.CloneNotSupportedException -> L1b
            java.lang.Object[] r2 = (java.lang.Object[]) r2     // Catch: java.lang.CloneNotSupportedException -> L1b
            r0.d = r2     // Catch: java.lang.CloneNotSupportedException -> L1b
            return r0
        L1b:
            r2 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r2)
            throw r0
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m1clone() {
            r0 = this;
            b.b.c.f.f r0 = r0.clone()
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            int r0 = r4.b()
            if (r0 > 0) goto L9
            java.lang.String r4 = "{}"
            return r4
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r4.e
            int r1 = r1 * 28
            r0.<init>(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            r1 = 0
        L18:
            int r2 = r4.e
            if (r1 >= r2) goto L41
            if (r1 <= 0) goto L23
            java.lang.String r2 = ", "
            r0.append(r2)
        L23:
            long r2 = r4.a(r1)
            r0.append(r2)
            r2 = 61
            r0.append(r2)
            java.lang.Object r2 = r4.b(r1)
            if (r2 == r4) goto L39
            r0.append(r2)
            goto L3e
        L39:
            java.lang.String r2 = "(this Map)"
            r0.append(r2)
        L3e:
            int r1 = r1 + 1
            goto L18
        L41:
            r4 = 125(0x7d, float:1.75E-43)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }
}
