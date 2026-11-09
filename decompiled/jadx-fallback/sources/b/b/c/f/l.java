package b.b.c.f;

/* JADX INFO: loaded from: classes.dex */
public class l<E> implements java.lang.Cloneable {
    private static final java.lang.Object f = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f1097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f1098c;
    private java.lang.Object[] d;
    private int e;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            b.b.c.f.l.f = r0
            return
    }

    public l() {
            r1 = this;
            r0 = 10
            r1.<init>(r0)
            return
    }

    public l(int r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f1097b = r0
            if (r3 != 0) goto L11
            int[] r3 = b.b.c.f.c.f1075a
            r2.f1098c = r3
            java.lang.Object[] r3 = b.b.c.f.c.f1077c
            r2.d = r3
            goto L1d
        L11:
            int r3 = b.b.c.f.c.b(r3)
            int[] r1 = new int[r3]
            r2.f1098c = r1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r2.d = r3
        L1d:
            r2.e = r0
            return
    }

    private void c() {
            r8 = this;
            int r0 = r8.e
            int[] r1 = r8.f1098c
            java.lang.Object[] r2 = r8.d
            r3 = 0
            r4 = r3
            r5 = r4
        L9:
            if (r4 >= r0) goto L21
            r6 = r2[r4]
            java.lang.Object r7 = b.b.c.f.l.f
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
            r8.f1097b = r3
            r8.e = r5
            return
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
            r5.f1097b = r2
            return
    }

    public void a(int r4) {
            r3 = this;
            int[] r0 = r3.f1098c
            int r1 = r3.e
            int r4 = b.b.c.f.c.a(r0, r1, r4)
            if (r4 < 0) goto L17
            java.lang.Object[] r0 = r3.d
            r1 = r0[r4]
            java.lang.Object r2 = b.b.c.f.l.f
            if (r1 == r2) goto L17
            r0[r4] = r2
            r4 = 1
            r3.f1097b = r4
        L17:
            return
    }

    public void a(int r7, E r8) {
            r6 = this;
            int r0 = r6.e
            if (r0 == 0) goto L10
            int[] r1 = r6.f1098c
            int r0 = r0 + (-1)
            r0 = r1[r0]
            if (r7 > r0) goto L10
            r6.c(r7, r8)
            return
        L10:
            boolean r0 = r6.f1097b
            if (r0 == 0) goto L1e
            int r0 = r6.e
            int[] r1 = r6.f1098c
            int r1 = r1.length
            if (r0 < r1) goto L1e
            r6.c()
        L1e:
            int r0 = r6.e
            int[] r1 = r6.f1098c
            int r1 = r1.length
            if (r0 < r1) goto L40
            int r1 = r0 + 1
            int r1 = b.b.c.f.c.b(r1)
            int[] r2 = new int[r1]
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int[] r3 = r6.f1098c
            int r4 = r3.length
            r5 = 0
            java.lang.System.arraycopy(r3, r5, r2, r5, r4)
            java.lang.Object[] r3 = r6.d
            int r4 = r3.length
            java.lang.System.arraycopy(r3, r5, r1, r5, r4)
            r6.f1098c = r2
            r6.d = r1
        L40:
            int[] r1 = r6.f1098c
            r1[r0] = r7
            java.lang.Object[] r7 = r6.d
            r7[r0] = r8
            int r0 = r0 + 1
            r6.e = r0
            return
    }

    public int b() {
            r1 = this;
            boolean r0 = r1.f1097b
            if (r0 == 0) goto L7
            r1.c()
        L7:
            int r1 = r1.e
            return r1
    }

    public E b(int r2) {
            r1 = this;
            r0 = 0
            java.lang.Object r1 = r1.b(r2, r0)
            return r1
    }

    public E b(int r3, E r4) {
            r2 = this;
            int[] r0 = r2.f1098c
            int r1 = r2.e
            int r3 = b.b.c.f.c.a(r0, r1, r3)
            if (r3 < 0) goto L16
            java.lang.Object[] r2 = r2.d
            r0 = r2[r3]
            java.lang.Object r1 = b.b.c.f.l.f
            if (r0 != r1) goto L13
            goto L16
        L13:
            r2 = r2[r3]
            return r2
        L16:
            return r4
    }

    public int c(int r2) {
            r1 = this;
            boolean r0 = r1.f1097b
            if (r0 == 0) goto L7
            r1.c()
        L7:
            int[] r1 = r1.f1098c
            r1 = r1[r2]
            return r1
    }

    public void c(int r7, E r8) {
            r6 = this;
            int[] r0 = r6.f1098c
            int r1 = r6.e
            int r0 = b.b.c.f.c.a(r0, r1, r7)
            if (r0 < 0) goto Lf
            java.lang.Object[] r6 = r6.d
            r6[r0] = r8
            goto L80
        Lf:
            int r0 = ~r0
            int r1 = r6.e
            if (r0 >= r1) goto L23
            java.lang.Object[] r1 = r6.d
            r2 = r1[r0]
            java.lang.Object r3 = b.b.c.f.l.f
            if (r2 != r3) goto L23
            int[] r6 = r6.f1098c
            r6[r0] = r7
            r1[r0] = r8
            return
        L23:
            boolean r1 = r6.f1097b
            if (r1 == 0) goto L3a
            int r1 = r6.e
            int[] r2 = r6.f1098c
            int r2 = r2.length
            if (r1 < r2) goto L3a
            r6.c()
            int[] r0 = r6.f1098c
            int r1 = r6.e
            int r0 = b.b.c.f.c.a(r0, r1, r7)
            int r0 = ~r0
        L3a:
            int r1 = r6.e
            int[] r2 = r6.f1098c
            int r2 = r2.length
            if (r1 < r2) goto L5c
            int r1 = r1 + 1
            int r1 = b.b.c.f.c.b(r1)
            int[] r2 = new int[r1]
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int[] r3 = r6.f1098c
            int r4 = r3.length
            r5 = 0
            java.lang.System.arraycopy(r3, r5, r2, r5, r4)
            java.lang.Object[] r3 = r6.d
            int r4 = r3.length
            java.lang.System.arraycopy(r3, r5, r1, r5, r4)
            r6.f1098c = r2
            r6.d = r1
        L5c:
            int r1 = r6.e
            int r2 = r1 - r0
            if (r2 == 0) goto L72
            int[] r2 = r6.f1098c
            int r3 = r0 + 1
            int r1 = r1 - r0
            java.lang.System.arraycopy(r2, r0, r2, r3, r1)
            java.lang.Object[] r1 = r6.d
            int r2 = r6.e
            int r2 = r2 - r0
            java.lang.System.arraycopy(r1, r0, r1, r3, r2)
        L72:
            int[] r1 = r6.f1098c
            r1[r0] = r7
            java.lang.Object[] r7 = r6.d
            r7[r0] = r8
            int r7 = r6.e
            int r7 = r7 + 1
            r6.e = r7
        L80:
            return
    }

    public b.b.c.f.l<E> clone() {
            r2 = this;
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L1b
            b.b.c.f.l r0 = (b.b.c.f.l) r0     // Catch: java.lang.CloneNotSupportedException -> L1b
            int[] r1 = r2.f1098c     // Catch: java.lang.CloneNotSupportedException -> L1b
            java.lang.Object r1 = r1.clone()     // Catch: java.lang.CloneNotSupportedException -> L1b
            int[] r1 = (int[]) r1     // Catch: java.lang.CloneNotSupportedException -> L1b
            r0.f1098c = r1     // Catch: java.lang.CloneNotSupportedException -> L1b
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
    public /* bridge */ /* synthetic */ java.lang.Object m2clone() {
            r0 = this;
            b.b.c.f.l r0 = r0.clone()
            return r0
    }

    public void d(int r1) {
            r0 = this;
            r0.a(r1)
            return
    }

    public E e(int r2) {
            r1 = this;
            boolean r0 = r1.f1097b
            if (r0 == 0) goto L7
            r1.c()
        L7:
            java.lang.Object[] r1 = r1.d
            r1 = r1[r2]
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            int r0 = r3.b()
            if (r0 > 0) goto L9
            java.lang.String r3 = "{}"
            return r3
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r3.e
            int r1 = r1 * 28
            r0.<init>(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            r1 = 0
        L18:
            int r2 = r3.e
            if (r1 >= r2) goto L41
            if (r1 <= 0) goto L23
            java.lang.String r2 = ", "
            r0.append(r2)
        L23:
            int r2 = r3.c(r1)
            r0.append(r2)
            r2 = 61
            r0.append(r2)
            java.lang.Object r2 = r3.e(r1)
            if (r2 == r3) goto L39
            r0.append(r2)
            goto L3e
        L39:
            java.lang.String r2 = "(this Map)"
            r0.append(r2)
        L3e:
            int r1 = r1 + 1
            goto L18
        L41:
            r3 = 125(0x7d, float:1.75E-43)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
