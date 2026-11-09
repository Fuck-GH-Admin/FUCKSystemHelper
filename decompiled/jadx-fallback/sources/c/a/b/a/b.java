package c.a.b.a;

/* JADX INFO: loaded from: classes.dex */
public class b implements java.io.Serializable, java.lang.Cloneable {
    static final /* synthetic */ boolean e = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f1189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient int f1190c;
    private transient boolean d;

    static {
            java.lang.Class<c.a.b.a.b> r0 = c.a.b.a.b.class
            boolean r0 = r0.desiredAssertionStatus()
            r0 = r0 ^ 1
            c.a.b.a.b.e = r0
            java.io.ObjectStreamField r0 = new java.io.ObjectStreamField
            java.lang.Class<long[]> r1 = long[].class
            java.lang.String r2 = "bits"
            r0.<init>(r2, r1)
            return
    }

    public b() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f1190c = r0
            r2.d = r0
            r1 = 64
            r2.g(r1)
            r2.d = r0
            return
    }

    public b(int r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f1190c = r0
            r2.d = r0
            if (r3 < 0) goto L11
            r2.g(r3)
            r3 = 1
            r2.d = r3
            return
        L11:
            java.lang.NegativeArraySizeException r2 = new java.lang.NegativeArraySizeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "nbits < 0: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    private b(long[] r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f1190c = r0
            r1.d = r0
            r1.f1189b = r2
            int r2 = r2.length
            r1.f1190c = r2
            r1.d()
            return
    }

    public static c.a.b.a.b a(long[] r5) {
            int r0 = r5.length
        L1:
            if (r0 <= 0) goto L10
            int r1 = r0 + (-1)
            r1 = r5[r1]
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L10
            int r0 = r0 + (-1)
            goto L1
        L10:
            c.a.b.a.b r1 = new c.a.b.a.b
            long[] r5 = java.util.Arrays.copyOf(r5, r0)
            r1.<init>(r5)
            return r1
    }

    private void d() {
            r5 = this;
            boolean r0 = c.a.b.a.b.e
            r1 = 0
            if (r0 != 0) goto L1b
            int r0 = r5.f1190c
            if (r0 == 0) goto L1b
            long[] r3 = r5.f1189b
            int r0 = r0 + (-1)
            r3 = r3[r0]
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L15
            goto L1b
        L15:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L1b:
            boolean r0 = c.a.b.a.b.e
            if (r0 != 0) goto L2f
            int r0 = r5.f1190c
            if (r0 < 0) goto L29
            long[] r3 = r5.f1189b
            int r3 = r3.length
            if (r0 > r3) goto L29
            goto L2f
        L29:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L2f:
            boolean r0 = c.a.b.a.b.e
            if (r0 != 0) goto L47
            int r0 = r5.f1190c
            long[] r5 = r5.f1189b
            int r3 = r5.length
            if (r0 == r3) goto L47
            r3 = r5[r0]
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 != 0) goto L41
            goto L47
        L41:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L47:
            return
    }

    private static void d(int r3, int r4) {
            if (r3 < 0) goto L3d
            if (r4 < 0) goto L26
            if (r3 > r4) goto L7
            return
        L7:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "fromIndex: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " > toIndex: "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L26:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "toIndex < 0: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        L3d:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "fromIndex < 0: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    private void e() {
            r5 = this;
            int r0 = r5.f1190c
            int r0 = r0 + (-1)
        L4:
            if (r0 < 0) goto L14
            long[] r1 = r5.f1189b
            r1 = r1[r0]
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L11
            goto L14
        L11:
            int r0 = r0 + (-1)
            goto L4
        L14:
            int r0 = r0 + 1
            r5.f1190c = r0
            return
    }

    private static int f(int r0) {
            int r0 = r0 >> 6
            return r0
    }

    private void f() {
            r3 = this;
            int r0 = r3.f1190c
            long[] r1 = r3.f1189b
            int r2 = r1.length
            if (r0 == r2) goto L10
            long[] r0 = java.util.Arrays.copyOf(r1, r0)
            r3.f1189b = r0
            r3.d()
        L10:
            return
    }

    private void g(int r1) {
            r0 = this;
            int r1 = r1 + (-1)
            int r1 = f(r1)
            int r1 = r1 + 1
            long[] r1 = new long[r1]
            r0.f1189b = r1
            return
    }

    private void h(int r3) {
            r2 = this;
            long[] r0 = r2.f1189b
            int r1 = r0.length
            if (r1 >= r3) goto L17
            int r0 = r0.length
            int r0 = r0 * 2
            int r3 = java.lang.Math.max(r0, r3)
            long[] r0 = r2.f1189b
            long[] r3 = java.util.Arrays.copyOf(r0, r3)
            r2.f1189b = r3
            r3 = 0
            r2.d = r3
        L17:
            return
    }

    private void i(int r2) {
            r1 = this;
            int r2 = r2 + 1
            int r0 = r1.f1190c
            if (r0 >= r2) goto Lb
            r1.h(r2)
            r1.f1190c = r2
        Lb:
            return
    }

    public void a(int r7) {
            r6 = this;
            if (r7 < 0) goto L17
            int r0 = f(r7)
            r6.i(r0)
            long[] r1 = r6.f1189b
            r2 = r1[r0]
            r4 = 1
            long r4 = r4 << r7
            long r2 = r2 | r4
            r1[r0] = r2
            r6.d()
            return
        L17:
            java.lang.IndexOutOfBoundsException r6 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "bitIndex < 0: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7)
            throw r6
    }

    public void a(int r10, int r11) {
            r9 = this;
            d(r10, r11)
            if (r10 != r11) goto L6
            return
        L6:
            int r0 = f(r10)
            int r1 = r11 + (-1)
            int r1 = f(r1)
            r9.i(r1)
            r2 = -1
            long r4 = r2 << r10
            int r10 = -r11
            long r10 = r2 >>> r10
            if (r0 != r1) goto L25
            long[] r1 = r9.f1189b
            r2 = r1[r0]
            long r10 = r10 & r4
            long r10 = r10 | r2
            r1[r0] = r10
            goto L3c
        L25:
            long[] r6 = r9.f1189b
            r7 = r6[r0]
            long r4 = r4 | r7
            r6[r0] = r4
        L2c:
            int r0 = r0 + 1
            if (r0 >= r1) goto L35
            long[] r4 = r9.f1189b
            r4[r0] = r2
            goto L2c
        L35:
            long[] r0 = r9.f1189b
            r2 = r0[r1]
            long r10 = r10 | r2
            r0[r1] = r10
        L3c:
            r9.d()
            return
    }

    public void a(int r1, int r2, boolean r3) {
            r0 = this;
            if (r3 == 0) goto L6
            r0.a(r1, r2)
            goto L9
        L6:
            r0.b(r1, r2)
        L9:
            return
    }

    public void a(int r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto L6
            r0.a(r1)
            goto L9
        L6:
            r0.b(r1)
        L9:
            return
    }

    public void a(c.a.b.a.b r7) {
            r6 = this;
            if (r6 != r7) goto L3
            return
        L3:
            int r0 = r6.f1190c
            int r1 = r7.f1190c
            if (r0 <= r1) goto L14
            long[] r1 = r6.f1189b
            int r0 = r0 + (-1)
            r6.f1190c = r0
            r2 = 0
            r1[r0] = r2
            goto L3
        L14:
            r0 = 0
        L15:
            int r1 = r6.f1190c
            if (r0 >= r1) goto L27
            long[] r1 = r6.f1189b
            r2 = r1[r0]
            long[] r4 = r7.f1189b
            r4 = r4[r0]
            long r2 = r2 & r4
            r1[r0] = r2
            int r0 = r0 + 1
            goto L15
        L27:
            r6.e()
            r6.d()
            return
    }

    public byte[] a() {
            r11 = this;
            int r0 = r11.f1190c
            r1 = 0
            if (r0 != 0) goto L8
            byte[] r11 = new byte[r1]
            return r11
        L8:
            int r0 = r0 + (-1)
            int r2 = r0 * 8
            long[] r3 = r11.f1189b
            r3 = r3[r0]
        L10:
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r8 = 8
            if (r7 == 0) goto L1c
            int r2 = r2 + 1
            long r3 = r3 >>> r8
            goto L10
        L1c:
            byte[] r2 = new byte[r2]
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r2)
            java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r3 = r3.order(r4)
        L28:
            if (r1 >= r0) goto L34
            long[] r4 = r11.f1189b
            r9 = r4[r1]
            r3.putLong(r9)
            int r1 = r1 + 1
            goto L28
        L34:
            long[] r11 = r11.f1189b
            r0 = r11[r0]
        L38:
            int r11 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r11 == 0) goto L46
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r0
            int r11 = (int) r9
            byte r11 = (byte) r11
            r3.put(r11)
            long r0 = r0 >>> r8
            goto L38
        L46:
            return r2
    }

    public int b() {
            r4 = this;
            int r0 = r4.f1190c
            if (r0 != 0) goto L6
            r4 = 0
            return r4
        L6:
            int r0 = r0 + (-1)
            int r1 = r0 * 64
            long[] r4 = r4.f1189b
            r2 = r4[r0]
            int r4 = java.lang.Long.numberOfLeadingZeros(r2)
            int r4 = 64 - r4
            int r1 = r1 + r4
            return r1
    }

    public void b(int r7) {
            r6 = this;
            if (r7 < 0) goto L1d
            int r0 = f(r7)
            int r1 = r6.f1190c
            if (r0 < r1) goto Lb
            return
        Lb:
            long[] r1 = r6.f1189b
            r2 = r1[r0]
            r4 = 1
            long r4 = r4 << r7
            long r4 = ~r4
            long r2 = r2 & r4
            r1[r0] = r2
            r6.e()
            r6.d()
            return
        L1d:
            java.lang.IndexOutOfBoundsException r6 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "bitIndex < 0: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7)
            throw r6
    }

    public void b(int r9, int r10) {
            r8 = this;
            d(r9, r10)
            if (r9 != r10) goto L6
            return
        L6:
            int r0 = f(r9)
            int r1 = r8.f1190c
            if (r0 < r1) goto Lf
            return
        Lf:
            int r1 = r10 + (-1)
            int r1 = f(r1)
            int r2 = r8.f1190c
            if (r1 < r2) goto L21
            int r10 = r8.b()
            int r1 = r8.f1190c
            int r1 = r1 + (-1)
        L21:
            r2 = -1
            long r4 = r2 << r9
            int r9 = -r10
            long r9 = r2 >>> r9
            if (r0 != r1) goto L34
            long[] r1 = r8.f1189b
            r2 = r1[r0]
            long r9 = r9 & r4
            long r9 = ~r9
            long r9 = r9 & r2
            r1[r0] = r9
            goto L4f
        L34:
            long[] r2 = r8.f1189b
            r6 = r2[r0]
            long r3 = ~r4
            long r3 = r3 & r6
            r2[r0] = r3
        L3c:
            int r0 = r0 + 1
            if (r0 >= r1) goto L47
            long[] r2 = r8.f1189b
            r3 = 0
            r2[r0] = r3
            goto L3c
        L47:
            long[] r0 = r8.f1189b
            r2 = r0[r1]
            long r9 = ~r9
            long r9 = r9 & r2
            r0[r1] = r9
        L4f:
            r8.e()
            r8.d()
            return
    }

    public void b(c.a.b.a.b r8) {
            r7 = this;
            if (r7 != r8) goto L3
            return
        L3:
            int r0 = r7.f1190c
            int r1 = r8.f1190c
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = r7.f1190c
            int r2 = r8.f1190c
            if (r1 >= r2) goto L18
            r7.h(r2)
            int r1 = r8.f1190c
            r7.f1190c = r1
        L18:
            r1 = 0
        L19:
            if (r1 >= r0) goto L29
            long[] r2 = r7.f1189b
            r3 = r2[r1]
            long[] r5 = r8.f1189b
            r5 = r5[r1]
            long r3 = r3 | r5
            r2[r1] = r3
            int r1 = r1 + 1
            goto L19
        L29:
            int r1 = r8.f1190c
            if (r0 >= r1) goto L37
            long[] r8 = r8.f1189b
            long[] r1 = r7.f1189b
            int r2 = r7.f1190c
            int r2 = r2 - r0
            java.lang.System.arraycopy(r8, r0, r1, r0, r2)
        L37:
            r7.d()
            return
    }

    public int c() {
            r4 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r4.f1190c
            if (r0 >= r2) goto L12
            long[] r2 = r4.f1189b
            r2 = r2[r0]
            int r2 = java.lang.Long.bitCount(r2)
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L2
        L12:
            return r1
    }

    public c.a.b.a.b c(int r14, int r15) {
            r13 = this;
            d(r14, r15)
            r13.d()
            int r0 = r13.b()
            r1 = 0
            if (r0 <= r14) goto L74
            if (r14 != r15) goto L10
            goto L74
        L10:
            if (r15 <= r0) goto L13
            r15 = r0
        L13:
            c.a.b.a.b r0 = new c.a.b.a.b
            int r2 = r15 - r14
            r0.<init>(r2)
            r3 = 1
            int r2 = r2 - r3
            int r2 = f(r2)
            int r2 = r2 + r3
            int r4 = f(r14)
            r5 = r14 & 63
            if (r5 != 0) goto L2b
            r6 = r3
            goto L2c
        L2b:
            r6 = r1
        L2c:
            int r7 = r2 + (-1)
            if (r1 >= r7) goto L4b
            long[] r7 = r0.f1189b
            long[] r8 = r13.f1189b
            if (r6 == 0) goto L39
            r8 = r8[r4]
            goto L44
        L39:
            r9 = r8[r4]
            long r9 = r9 >>> r14
            int r11 = r4 + 1
            r11 = r8[r11]
            int r8 = -r14
            long r11 = r11 << r8
            long r8 = r9 | r11
        L44:
            r7[r1] = r8
            int r1 = r1 + 1
            int r4 = r4 + 1
            goto L2c
        L4b:
            int r1 = -r15
            r8 = -1
            long r8 = r8 >>> r1
            long[] r1 = r0.f1189b
            int r15 = r15 - r3
            r15 = r15 & 63
            long[] r13 = r13.f1189b
            if (r15 >= r5) goto L64
            r5 = r13[r4]
            long r5 = r5 >>> r14
            int r4 = r4 + r3
            r3 = r13[r4]
            long r3 = r3 & r8
            int r13 = -r14
            long r13 = r3 << r13
            long r13 = r13 | r5
            goto L69
        L64:
            r3 = r13[r4]
            long r3 = r3 & r8
            long r13 = r3 >>> r14
        L69:
            r1[r7] = r13
            r0.f1190c = r2
            r0.e()
            r0.d()
            return r0
        L74:
            c.a.b.a.b r13 = new c.a.b.a.b
            r13.<init>(r1)
            return r13
    }

    public void c(c.a.b.a.b r8) {
            r7 = this;
            int r0 = r7.f1190c
            int r1 = r8.f1190c
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = r7.f1190c
            int r2 = r8.f1190c
            if (r1 >= r2) goto L15
            r7.h(r2)
            int r1 = r8.f1190c
            r7.f1190c = r1
        L15:
            r1 = 0
        L16:
            if (r1 >= r0) goto L26
            long[] r2 = r7.f1189b
            r3 = r2[r1]
            long[] r5 = r8.f1189b
            r5 = r5[r1]
            long r3 = r3 ^ r5
            r2[r1] = r3
            int r1 = r1 + 1
            goto L16
        L26:
            int r1 = r8.f1190c
            if (r0 >= r1) goto L32
            long[] r8 = r8.f1189b
            long[] r2 = r7.f1189b
            int r1 = r1 - r0
            java.lang.System.arraycopy(r8, r0, r2, r0, r1)
        L32:
            r7.e()
            r7.d()
            return
    }

    public boolean c(int r5) {
            r4 = this;
            if (r5 < 0) goto L20
            r4.d()
            int r0 = f(r5)
            int r1 = r4.f1190c
            if (r0 >= r1) goto L1e
            long[] r4 = r4.f1189b
            r0 = r4[r0]
            r2 = 1
            long r4 = r2 << r5
            long r4 = r4 & r0
            r0 = 0
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 == 0) goto L1e
            r4 = 1
            goto L1f
        L1e:
            r4 = 0
        L1f:
            return r4
        L20:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "bitIndex < 0: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
    }

    public java.lang.Object clone() {
            r1 = this;
            boolean r0 = r1.d
            if (r0 != 0) goto L7
            r1.f()
        L7:
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L1b
            c.a.b.a.b r0 = (c.a.b.a.b) r0     // Catch: java.lang.CloneNotSupportedException -> L1b
            long[] r1 = r1.f1189b     // Catch: java.lang.CloneNotSupportedException -> L1b
            java.lang.Object r1 = r1.clone()     // Catch: java.lang.CloneNotSupportedException -> L1b
            long[] r1 = (long[]) r1     // Catch: java.lang.CloneNotSupportedException -> L1b
            r0.f1189b = r1     // Catch: java.lang.CloneNotSupportedException -> L1b
            r0.d()     // Catch: java.lang.CloneNotSupportedException -> L1b
            return r0
        L1b:
            java.lang.InternalError r1 = new java.lang.InternalError
            r1.<init>()
            throw r1
    }

    public int d(int r8) {
            r7 = this;
            if (r8 < 0) goto L31
            r7.d()
            int r0 = f(r8)
            int r1 = r7.f1190c
            r2 = -1
            if (r0 < r1) goto Lf
            return r2
        Lf:
            long[] r1 = r7.f1189b
            r3 = r1[r0]
            r5 = -1
            long r5 = r5 << r8
            long r3 = r3 & r5
        L17:
            r5 = 0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L25
            int r0 = r0 * 64
            int r7 = java.lang.Long.numberOfTrailingZeros(r3)
            int r0 = r0 + r7
            return r0
        L25:
            int r0 = r0 + 1
            int r8 = r7.f1190c
            if (r0 != r8) goto L2c
            return r2
        L2c:
            long[] r8 = r7.f1189b
            r3 = r8[r0]
            goto L17
        L31:
            java.lang.IndexOutOfBoundsException r7 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "fromIndex < 0: "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.<init>(r8)
            throw r7
    }

    public void d(c.a.b.a.b r7) {
            r6 = this;
            int r0 = r6.f1190c
            int r1 = r7.f1190c
            int r0 = java.lang.Math.min(r0, r1)
            int r0 = r0 + (-1)
        La:
            if (r0 < 0) goto L1b
            long[] r1 = r6.f1189b
            r2 = r1[r0]
            long[] r4 = r7.f1189b
            r4 = r4[r0]
            long r4 = ~r4
            long r2 = r2 & r4
            r1[r0] = r2
            int r0 = r0 + (-1)
            goto La
        L1b:
            r6.e()
            r6.d()
            return
    }

    public int e(int r6) {
            r5 = this;
            if (r6 < 0) goto L34
            r5.d()
            int r0 = f(r6)
            int r1 = r5.f1190c
            if (r0 < r1) goto Le
            return r6
        Le:
            long[] r1 = r5.f1189b
            r1 = r1[r0]
            long r1 = ~r1
            r3 = -1
            long r3 = r3 << r6
            long r1 = r1 & r3
        L17:
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L25
            int r0 = r0 * 64
            int r5 = java.lang.Long.numberOfTrailingZeros(r1)
            int r0 = r0 + r5
            return r0
        L25:
            int r0 = r0 + 1
            int r6 = r5.f1190c
            if (r0 != r6) goto L2e
            int r6 = r6 * 64
            return r6
        L2e:
            long[] r6 = r5.f1189b
            r1 = r6[r0]
            long r1 = ~r1
            goto L17
        L34:
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "fromIndex < 0: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            boolean r0 = r8 instanceof c.a.b.a.b
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = 1
            if (r7 != r8) goto La
            return r0
        La:
            c.a.b.a.b r8 = (c.a.b.a.b) r8
            r7.d()
            r8.d()
            int r2 = r7.f1190c
            int r3 = r8.f1190c
            if (r2 == r3) goto L19
            return r1
        L19:
            r2 = r1
        L1a:
            int r3 = r7.f1190c
            if (r2 >= r3) goto L2e
            long[] r3 = r7.f1189b
            r3 = r3[r2]
            long[] r5 = r8.f1189b
            r5 = r5[r2]
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L2b
            return r1
        L2b:
            int r2 = r2 + 1
            goto L1a
        L2e:
            return r0
    }

    public int hashCode() {
            r7 = this;
            int r0 = r7.f1190c
            r1 = 1234(0x4d2, double:6.097E-321)
        L4:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L12
            long[] r3 = r7.f1189b
            r3 = r3[r0]
            int r5 = r0 + 1
            long r5 = (long) r5
            long r3 = r3 * r5
            long r1 = r1 ^ r3
            goto L4
        L12:
            r7 = 32
            long r3 = r1 >> r7
            long r0 = r3 ^ r1
            int r7 = (int) r0
            return r7
    }

    public java.lang.String toString() {
            r4 = this;
            r4.d()
            int r0 = r4.f1190c
            r1 = 128(0x80, float:1.8E-43)
            if (r0 <= r1) goto Le
            int r0 = r4.c()
            goto L10
        Le:
            int r0 = r0 * 64
        L10:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 * 6
            int r0 = r0 + 2
            r1.<init>(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r1.append(r0)
            r0 = 0
            int r0 = r4.d(r0)
            r2 = -1
            if (r0 == r2) goto L42
            r1.append(r0)
        L29:
            int r0 = r0 + 1
            int r0 = r4.d(r0)
            if (r0 < 0) goto L42
            int r2 = r4.e(r0)
        L35:
            java.lang.String r3 = ", "
            r1.append(r3)
            r1.append(r0)
            int r0 = r0 + 1
            if (r0 < r2) goto L35
            goto L29
        L42:
            r4 = 125(0x7d, float:1.75E-43)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            return r4
    }
}
