package android.support.constraint.n.k;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static boolean[] f498a;

    static {
            r0 = 3
            boolean[] r0 = new boolean[r0]
            android.support.constraint.n.k.j.f498a = r0
            return
    }

    static void a(android.support.constraint.n.k.f r5, android.support.constraint.n.d r6, android.support.constraint.n.k.e r7) {
            r0 = -1
            r7.l = r0
            r7.m = r0
            android.support.constraint.n.k.e$b[] r0 = r5.Q
            r1 = 0
            r0 = r0[r1]
            android.support.constraint.n.k.e$b r2 = android.support.constraint.n.k.e.b.f496c
            r3 = 2
            if (r0 == r2) goto L47
            android.support.constraint.n.k.e$b[] r0 = r7.Q
            r0 = r0[r1]
            android.support.constraint.n.k.e$b r1 = android.support.constraint.n.k.e.b.e
            if (r0 != r1) goto L47
            android.support.constraint.n.k.d r0 = r7.F
            int r0 = r0.g
            int r1 = r5.C()
            android.support.constraint.n.k.d r2 = r7.H
            int r2 = r2.g
            int r1 = r1 - r2
            android.support.constraint.n.k.d r2 = r7.F
            android.support.constraint.n.i r4 = r6.a(r2)
            r2.i = r4
            android.support.constraint.n.k.d r2 = r7.H
            android.support.constraint.n.i r4 = r6.a(r2)
            r2.i = r4
            android.support.constraint.n.k.d r2 = r7.F
            android.support.constraint.n.i r2 = r2.i
            r6.a(r2, r0)
            android.support.constraint.n.k.d r2 = r7.H
            android.support.constraint.n.i r2 = r2.i
            r6.a(r2, r1)
            r7.l = r3
            r7.c(r0, r1)
        L47:
            android.support.constraint.n.k.e$b[] r0 = r5.Q
            r1 = 1
            r0 = r0[r1]
            android.support.constraint.n.k.e$b r2 = android.support.constraint.n.k.e.b.f496c
            if (r0 == r2) goto La6
            android.support.constraint.n.k.e$b[] r0 = r7.Q
            r0 = r0[r1]
            android.support.constraint.n.k.e$b r1 = android.support.constraint.n.k.e.b.e
            if (r0 != r1) goto La6
            android.support.constraint.n.k.d r0 = r7.G
            int r0 = r0.g
            int r5 = r5.k()
            android.support.constraint.n.k.d r1 = r7.I
            int r1 = r1.g
            int r5 = r5 - r1
            android.support.constraint.n.k.d r1 = r7.G
            android.support.constraint.n.i r2 = r6.a(r1)
            r1.i = r2
            android.support.constraint.n.k.d r1 = r7.I
            android.support.constraint.n.i r2 = r6.a(r1)
            r1.i = r2
            android.support.constraint.n.k.d r1 = r7.G
            android.support.constraint.n.i r1 = r1.i
            r6.a(r1, r0)
            android.support.constraint.n.k.d r1 = r7.I
            android.support.constraint.n.i r1 = r1.i
            r6.a(r1, r5)
            int r1 = r7.Y
            if (r1 > 0) goto L8f
            int r1 = r7.B()
            r2 = 8
            if (r1 != r2) goto La1
        L8f:
            android.support.constraint.n.k.d r1 = r7.J
            android.support.constraint.n.i r2 = r6.a(r1)
            r1.i = r2
            android.support.constraint.n.k.d r1 = r7.J
            android.support.constraint.n.i r1 = r1.i
            int r2 = r7.Y
            int r2 = r2 + r0
            r6.a(r1, r2)
        La1:
            r7.m = r3
            r7.f(r0, r5)
        La6:
            return
    }

    public static final boolean a(int r0, int r1) {
            r0 = r0 & r1
            if (r0 != r1) goto L5
            r0 = 1
            goto L6
        L5:
            r0 = 0
        L6:
            return r0
    }
}
