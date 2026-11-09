package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f881c;
    private int d;
    private int e;
    private int f;
    private boolean g;
    private boolean h;

    l0() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f879a = r0
            r2.f880b = r0
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.f881c = r1
            r2.d = r1
            r2.e = r0
            r2.f = r0
            r2.g = r0
            r2.h = r0
            return
    }

    public int a() {
            r1 = this;
            boolean r0 = r1.g
            if (r0 == 0) goto L7
            int r1 = r1.f879a
            goto L9
        L7:
            int r1 = r1.f880b
        L9:
            return r1
    }

    public void a(int r2, int r3) {
            r1 = this;
            r0 = 0
            r1.h = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r0) goto Lb
            r1.e = r2
            r1.f879a = r2
        Lb:
            if (r3 == r0) goto L11
            r1.f = r3
            r1.f880b = r3
        L11:
            return
    }

    public void a(boolean r2) {
            r1 = this;
            boolean r0 = r1.g
            if (r2 != r0) goto L5
            return
        L5:
            r1.g = r2
            boolean r0 = r1.h
            if (r0 == 0) goto L2b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L1d
            int r2 = r1.d
            if (r2 == r0) goto L14
            goto L16
        L14:
            int r2 = r1.e
        L16:
            r1.f879a = r2
            int r2 = r1.f881c
            if (r2 == r0) goto L2f
            goto L31
        L1d:
            int r2 = r1.f881c
            if (r2 == r0) goto L22
            goto L24
        L22:
            int r2 = r1.e
        L24:
            r1.f879a = r2
            int r2 = r1.d
            if (r2 == r0) goto L2f
            goto L31
        L2b:
            int r2 = r1.e
            r1.f879a = r2
        L2f:
            int r2 = r1.f
        L31:
            r1.f880b = r2
            return
    }

    public int b() {
            r0 = this;
            int r0 = r0.f879a
            return r0
    }

    public void b(int r3, int r4) {
            r2 = this;
            r2.f881c = r3
            r2.d = r4
            r0 = 1
            r2.h = r0
            boolean r0 = r2.g
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == 0) goto L16
            if (r4 == r1) goto L11
            r2.f879a = r4
        L11:
            if (r3 == r1) goto L1e
            r2.f880b = r3
            goto L1e
        L16:
            if (r3 == r1) goto L1a
            r2.f879a = r3
        L1a:
            if (r4 == r1) goto L1e
            r2.f880b = r4
        L1e:
            return
    }

    public int c() {
            r0 = this;
            int r0 = r0.f880b
            return r0
    }

    public int d() {
            r1 = this;
            boolean r0 = r1.g
            if (r0 == 0) goto L7
            int r1 = r1.f880b
            goto L9
        L7:
            int r1 = r1.f879a
        L9:
            return r1
    }
}
