package android.support.constraint.n.k;

/* JADX INFO: loaded from: classes.dex */
public class l extends android.support.constraint.n.k.e {
    public java.util.ArrayList<android.support.constraint.n.k.e> p0;

    public l() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.p0 = r0
            return
    }

    @Override // android.support.constraint.n.k.e
    public void P() {
            r1 = this;
            java.util.ArrayList<android.support.constraint.n.k.e> r0 = r1.p0
            r0.clear()
            super.P()
            return
    }

    public java.util.ArrayList<android.support.constraint.n.k.e> R() {
            r0 = this;
            java.util.ArrayList<android.support.constraint.n.k.e> r0 = r0.p0
            return r0
    }

    public void S() {
            r4 = this;
            java.util.ArrayList<android.support.constraint.n.k.e> r0 = r4.p0
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = r0.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L20
            java.util.ArrayList<android.support.constraint.n.k.e> r2 = r4.p0
            java.lang.Object r2 = r2.get(r1)
            android.support.constraint.n.k.e r2 = (android.support.constraint.n.k.e) r2
            boolean r3 = r2 instanceof android.support.constraint.n.k.l
            if (r3 == 0) goto L1d
            android.support.constraint.n.k.l r2 = (android.support.constraint.n.k.l) r2
            r2.S()
        L1d:
            int r1 = r1 + 1
            goto La
        L20:
            return
    }

    public void T() {
            r0 = this;
            java.util.ArrayList<android.support.constraint.n.k.e> r0 = r0.p0
            r0.clear()
            return
    }

    @Override // android.support.constraint.n.k.e
    public void a(android.support.constraint.n.c r4) {
            r3 = this;
            super.a(r4)
            java.util.ArrayList<android.support.constraint.n.k.e> r0 = r3.p0
            int r0 = r0.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L1a
            java.util.ArrayList<android.support.constraint.n.k.e> r2 = r3.p0
            java.lang.Object r2 = r2.get(r1)
            android.support.constraint.n.k.e r2 = (android.support.constraint.n.k.e) r2
            r2.a(r4)
            int r1 = r1 + 1
            goto La
        L1a:
            return
    }

    public void a(android.support.constraint.n.k.e r2) {
            r1 = this;
            java.util.ArrayList<android.support.constraint.n.k.e> r0 = r1.p0
            r0.add(r2)
            android.support.constraint.n.k.e r0 = r2.v()
            if (r0 == 0) goto L14
            android.support.constraint.n.k.e r0 = r2.v()
            android.support.constraint.n.k.l r0 = (android.support.constraint.n.k.l) r0
            r0.c(r2)
        L14:
            r2.b(r1)
            return
    }

    public void c(android.support.constraint.n.k.e r1) {
            r0 = this;
            java.util.ArrayList<android.support.constraint.n.k.e> r0 = r0.p0
            r0.remove(r1)
            r1.P()
            return
    }
}
