package c.a.b.a;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    c.a.b.a.g[] f1188a;

    public a() {
            r4 = this;
            r4.<init>()
            r0 = 4
            c.a.b.a.g[] r0 = new c.a.b.a.g[r0]
            c.a.b.a.h r1 = new c.a.b.a.h
            r2 = 0
            r3 = 8
            r1.<init>(r3, r2)
            r0[r2] = r1
            c.a.b.a.j r1 = new c.a.b.a.j
            r3 = 1
            r1.<init>(r2, r3)
            r0[r3] = r1
            c.a.b.a.j r1 = new c.a.b.a.j
            r1.<init>(r3, r3)
            r2 = 2
            r0[r2] = r1
            c.a.b.a.h r1 = new c.a.b.a.h
            r2 = 7
            r1.<init>(r2, r3)
            r2 = 3
            r0[r2] = r1
            r4.f1188a = r0
            return
    }

    public byte[] a(byte[] r10) {
            r9 = this;
            c.a.b.a.f r0 = new c.a.b.a.f
            r0.<init>()
            int r1 = r10.length
            c.a.b.a.g[] r2 = r9.f1188a
            int r2 = r2.length
            int r2 = r2 + 1
            int r3 = c.a.b.a.f.f1191b
            int r2 = r2 * r3
            int r1 = r1 + r2
            byte[] r1 = c.a.b.a.c.a(r10, r1)
            byte[] r2 = r0.a()
            int r3 = r10.length
            c.a.b.a.c.a(r1, r2, r3)
            r2 = 0
            r3 = r2
        L1d:
            c.a.b.a.g[] r4 = r9.f1188a
            int r5 = r4.length
            if (r3 >= r5) goto L46
            r4 = r4[r3]
            int r5 = r10.length
            int r3 = r3 + 1
            int r6 = c.a.b.a.f.f1191b
            int r6 = r6 * r3
            int r5 = r5 + r6
            c.a.b.a.b r6 = r4.a(r1, r2, r5)
            int r7 = r4.a()
            int r8 = r4.b()
            int r4 = r4.c()
            r0.a(r6, r7, r8, r4)
            byte[] r4 = r0.a()
            c.a.b.a.c.a(r1, r4, r5)
            goto L1d
        L46:
            byte[] r9 = r0.a()
            int r10 = c.a.b.a.f.f1191b
            byte[] r9 = java.util.Arrays.copyOf(r9, r10)
            return r9
    }
}
