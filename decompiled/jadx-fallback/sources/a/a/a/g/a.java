package a.a.a.g;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f256c;
    public int d;
    public int e;
    public int f;
    public long g;
    public int h;
    public char i;
    public int j;
    public int k;
    public int l;
    public java.lang.String m;
    public java.lang.String n;
    public java.lang.String o;

    public a() {
            r4 = this;
            r4.<init>()
            r0 = -1
            r4.f254a = r0
            r1 = -1
            r4.f255b = r1
            r4.f256c = r0
            r4.d = r0
            r1 = 2147483647(0x7fffffff, float:NaN)
            r4.e = r1
            r4.f = r1
            r2 = 0
            r4.g = r2
            r4.h = r0
            r0 = 48
            r4.i = r0
            r4.j = r1
            r0 = 0
            r4.k = r0
            r4.l = r0
            r0 = 0
            r4.m = r0
            r4.n = r0
            r4.o = r0
            long r0 = java.lang.System.currentTimeMillis()
            r4.g = r0
            return
    }

    public a(int r5, long r6, int r8, int r9, int r10, char r11, int r12) {
            r4 = this;
            r4.<init>()
            r0 = -1
            r4.f254a = r0
            r1 = -1
            r4.f255b = r1
            r4.f256c = r0
            r4.d = r0
            r1 = 2147483647(0x7fffffff, float:NaN)
            r4.e = r1
            r4.f = r1
            r2 = 0
            r4.g = r2
            r4.h = r0
            r0 = 48
            r4.i = r0
            r4.j = r1
            r0 = 0
            r4.k = r0
            r4.l = r0
            r0 = 0
            r4.m = r0
            r4.n = r0
            r4.o = r0
            r4.f254a = r5
            r4.f255b = r6
            r4.f256c = r8
            r4.d = r9
            r4.h = r10
            r4.i = r11
            long r5 = java.lang.System.currentTimeMillis()
            r4.g = r5
            r4.j = r12
            return
    }

    public a(a.a.a.g.a r10) {
            r9 = this;
            int r1 = r10.f254a
            long r2 = r10.f255b
            int r4 = r10.f256c
            int r5 = r10.d
            int r6 = r10.h
            char r7 = r10.i
            int r8 = r10.j
            r0 = r9
            r0.<init>(r1, r2, r4, r5, r6, r7, r8)
            long r0 = r10.g
            r9.g = r0
            java.lang.String r0 = r10.m
            r9.m = r0
            int r0 = r10.k
            r9.k = r0
            java.lang.String r0 = r10.o
            r9.o = r0
            int r0 = r10.l
            r9.l = r0
            java.lang.String r10 = r10.n
            r9.n = r10
            return
    }

    public boolean a() {
            r4 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r4.g
            long r0 = r0 - r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L15
            r2 = 3000(0xbb8, double:1.482E-320)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L15
            r4 = 1
            goto L16
        L15:
            r4 = 0
        L16:
            return r4
    }

    public boolean a(a.a.a.g.a r5) {
            r4 = this;
            int r0 = r4.f254a
            int r1 = r5.f254a
            if (r0 != r1) goto L30
            long r0 = r4.f255b
            long r2 = r5.f255b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L30
            int r0 = r4.d
            int r1 = r5.d
            if (r0 != r1) goto L30
            int r0 = r4.f256c
            int r1 = r5.f256c
            if (r0 != r1) goto L30
            java.lang.String r0 = r4.n
            if (r0 == 0) goto L26
            java.lang.String r1 = r5.n
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2e
        L26:
            java.lang.String r4 = r4.n
            if (r4 != 0) goto L30
            java.lang.String r4 = r5.n
            if (r4 != 0) goto L30
        L2e:
            r4 = 1
            return r4
        L30:
            r4 = 0
            return r4
    }

    public boolean b() {
            r6 = this;
            int r0 = r6.f254a
            r1 = -1
            if (r0 != r1) goto L17
            long r2 = r6.f255b
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L17
            int r0 = r6.d
            if (r0 != r1) goto L17
            int r6 = r6.f256c
            if (r6 != r1) goto L17
            r6 = 1
            goto L18
        L17:
            r6 = 0
        L18:
            return r6
    }

    public boolean c() {
            r6 = this;
            int r0 = r6.f254a
            r1 = -1
            if (r0 <= r1) goto L17
            long r2 = r6.f255b
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L17
            int r0 = r6.d
            if (r0 != r1) goto L17
            int r6 = r6.f256c
            if (r6 != r1) goto L17
            r6 = 1
            goto L18
        L17:
            r6 = 0
        L18:
            return r6
    }

    public boolean d() {
            r6 = this;
            int r0 = r6.f254a
            r1 = -1
            if (r0 <= r1) goto L17
            long r2 = r6.f255b
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L17
            int r0 = r6.d
            if (r0 <= r1) goto L17
            int r6 = r6.f256c
            if (r6 <= r1) goto L17
            r6 = 1
            goto L18
        L17:
            r6 = 0
        L18:
            return r6
    }

    public boolean e() {
            r4 = this;
            int r0 = r4.f254a
            r1 = -1
            if (r0 <= r1) goto Lf
            long r0 = r4.f255b
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto Lf
            r4 = 1
            goto L10
        Lf:
            r4 = 0
        L10:
            return r4
    }
}
