package android.support.constraint.n.k;

/* JADX INFO: loaded from: classes.dex */
public class k extends android.support.constraint.n.k.i {
    private boolean r0;

    public k() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.r0 = r0
            android.support.constraint.n.k.m.b$a r1 = new android.support.constraint.n.k.m.b$a
            r1.<init>()
            return
    }

    public void R() {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.q0
            if (r0 >= r1) goto L12
            android.support.constraint.n.k.e[] r1 = r3.p0
            r1 = r1[r0]
            if (r1 == 0) goto Lf
            r2 = 1
            r1.c(r2)
        Lf:
            int r0 = r0 + 1
            goto L1
        L12:
            return
    }

    public boolean S() {
            r0 = this;
            boolean r0 = r0.r0
            return r0
    }

    @Override // android.support.constraint.n.k.i, android.support.constraint.n.k.h
    public void a(android.support.constraint.n.k.f r1) {
            r0 = this;
            r0.R()
            return
    }
}
