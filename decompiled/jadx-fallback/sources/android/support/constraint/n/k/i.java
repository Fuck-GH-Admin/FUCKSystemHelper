package android.support.constraint.n.k;

/* JADX INFO: loaded from: classes.dex */
public class i extends android.support.constraint.n.k.e implements android.support.constraint.n.k.h {
    public android.support.constraint.n.k.e[] p0;
    public int q0;

    public i() {
            r1 = this;
            r1.<init>()
            r0 = 4
            android.support.constraint.n.k.e[] r0 = new android.support.constraint.n.k.e[r0]
            r1.p0 = r0
            r0 = 0
            r1.q0 = r0
            return
    }

    @Override // android.support.constraint.n.k.h
    public void a() {
            r1 = this;
            r0 = 0
            r1.q0 = r0
            android.support.constraint.n.k.e[] r1 = r1.p0
            r0 = 0
            java.util.Arrays.fill(r1, r0)
            return
    }

    @Override // android.support.constraint.n.k.h
    public void a(android.support.constraint.n.k.e r4) {
            r3 = this;
            if (r4 == r3) goto L23
            if (r4 != 0) goto L5
            goto L23
        L5:
            int r0 = r3.q0
            int r0 = r0 + 1
            android.support.constraint.n.k.e[] r1 = r3.p0
            int r2 = r1.length
            if (r0 <= r2) goto L19
            int r0 = r1.length
            int r0 = r0 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            android.support.constraint.n.k.e[] r0 = (android.support.constraint.n.k.e[]) r0
            r3.p0 = r0
        L19:
            android.support.constraint.n.k.e[] r0 = r3.p0
            int r1 = r3.q0
            r0[r1] = r4
            int r1 = r1 + 1
            r3.q0 = r1
        L23:
            return
    }

    @Override // android.support.constraint.n.k.h
    public void a(android.support.constraint.n.k.f r1) {
            r0 = this;
            return
    }

    public void a(java.util.ArrayList<android.support.constraint.n.k.m.o> r4, int r5, android.support.constraint.n.k.m.o r6) {
            r3 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r3.q0
            if (r1 >= r2) goto L10
            android.support.constraint.n.k.e[] r2 = r3.p0
            r2 = r2[r1]
            r6.a(r2)
            int r1 = r1 + 1
            goto L2
        L10:
            int r1 = r3.q0
            if (r0 >= r1) goto L1e
            android.support.constraint.n.k.e[] r1 = r3.p0
            r1 = r1[r0]
            android.support.constraint.n.k.m.i.a(r1, r5, r4, r6)
            int r0 = r0 + 1
            goto L10
        L1e:
            return
    }

    public int w(int r5) {
            r4 = this;
            r0 = 0
        L1:
            int r1 = r4.q0
            r2 = -1
            if (r0 >= r1) goto L1c
            android.support.constraint.n.k.e[] r1 = r4.p0
            r1 = r1[r0]
            if (r5 != 0) goto L11
            int r3 = r1.m0
            if (r3 == r2) goto L11
            return r3
        L11:
            r3 = 1
            if (r5 != r3) goto L19
            int r1 = r1.n0
            if (r1 == r2) goto L19
            return r1
        L19:
            int r0 = r0 + 1
            goto L1
        L1c:
            return r2
    }
}
