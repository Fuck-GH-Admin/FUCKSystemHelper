package android.support.constraint.n;

/* JADX INFO: loaded from: classes.dex */
class g<T> implements android.support.constraint.n.f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object[] f469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f470b;

    g(int r1) {
            r0 = this;
            r0.<init>()
            if (r1 <= 0) goto La
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.f469a = r1
            return
        La:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The max pool size must be > 0"
            r0.<init>(r1)
            throw r0
    }

    @Override // android.support.constraint.n.f
    public T a() {
            r5 = this;
            int r0 = r5.f470b
            r1 = 0
            if (r0 <= 0) goto L12
            int r2 = r0 + (-1)
            java.lang.Object[] r3 = r5.f469a
            r4 = r3[r2]
            r3[r2] = r1
            int r0 = r0 + (-1)
            r5.f470b = r0
            return r4
        L12:
            return r1
    }

    @Override // android.support.constraint.n.f
    public void a(T[] r6, int r7) {
            r5 = this;
            int r0 = r6.length
            if (r7 <= r0) goto L4
            int r7 = r6.length
        L4:
            r0 = 0
        L5:
            if (r0 >= r7) goto L19
            r1 = r6[r0]
            int r2 = r5.f470b
            java.lang.Object[] r3 = r5.f469a
            int r4 = r3.length
            if (r2 >= r4) goto L16
            r3[r2] = r1
            int r2 = r2 + 1
            r5.f470b = r2
        L16:
            int r0 = r0 + 1
            goto L5
        L19:
            return
    }

    @Override // android.support.constraint.n.f
    public boolean a(T r4) {
            r3 = this;
            int r0 = r3.f470b
            java.lang.Object[] r1 = r3.f469a
            int r2 = r1.length
            if (r0 >= r2) goto Le
            r1[r0] = r4
            r4 = 1
            int r0 = r0 + r4
            r3.f470b = r0
            return r4
        Le:
            r3 = 0
            return r3
    }
}
