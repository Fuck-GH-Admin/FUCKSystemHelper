package c.a.b.e.a;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile byte[] f1245a;

    public g() {
            r0 = this;
            r0.<init>()
            return
    }

    public static byte[] a() {
            byte[] r0 = c.a.b.e.a.g.f1245a
            if (r0 != 0) goto Lcf
            java.lang.Class<c.a.b.e.a.g> r0 = c.a.b.e.a.g.class
            monitor-enter(r0)
            byte[] r1 = c.a.b.e.a.g.f1245a     // Catch: java.lang.Throwable -> Lcc
            if (r1 != 0) goto Lca
            byte[] r1 = c.a.b.e.c.b.b()     // Catch: java.lang.Throwable -> Lcc
            r2 = 16
            byte[] r3 = new byte[r2]     // Catch: java.lang.Throwable -> Lcc
            r4 = 0
            java.lang.System.arraycopy(r1, r4, r3, r4, r2)     // Catch: java.lang.Throwable -> Lcc
            c.a.b.e.a.c r1 = new c.a.b.e.a.c     // Catch: java.lang.Throwable -> Lcc
            r1.<init>()     // Catch: java.lang.Throwable -> Lcc
            r5 = 2
            r1.a(r5, r3, r3)     // Catch: java.lang.Throwable -> Lcc
            r3 = 32
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> Lcc
            r6 = -71
            r3[r4] = r6     // Catch: java.lang.Throwable -> Lcc
            r4 = -100
            r6 = 1
            r3[r6] = r4     // Catch: java.lang.Throwable -> Lcc
            r4 = -115(0xffffffffffffff8d, float:NaN)
            r3[r5] = r4     // Catch: java.lang.Throwable -> Lcc
            r4 = 3
            r5 = 26
            r3[r4] = r5     // Catch: java.lang.Throwable -> Lcc
            r4 = 4
            r7 = 39
            r3[r4] = r7     // Catch: java.lang.Throwable -> Lcc
            r4 = -124(0xffffffffffffff84, float:NaN)
            r7 = 5
            r3[r7] = r4     // Catch: java.lang.Throwable -> Lcc
            r4 = 6
            r8 = 14
            r3[r4] = r8     // Catch: java.lang.Throwable -> Lcc
            r4 = 7
            r3[r4] = r8     // Catch: java.lang.Throwable -> Lcc
            r4 = 8
            r9 = -31
            r3[r4] = r9     // Catch: java.lang.Throwable -> Lcc
            r4 = 9
            r9 = -46
            r3[r4] = r9     // Catch: java.lang.Throwable -> Lcc
            r4 = 10
            r9 = -56
            r3[r4] = r9     // Catch: java.lang.Throwable -> Lcc
            r4 = 11
            r3[r4] = r6     // Catch: java.lang.Throwable -> Lcc
            r4 = 12
            r6 = 25
            r3[r4] = r6     // Catch: java.lang.Throwable -> Lcc
            r4 = 13
            r9 = -127(0xffffffffffffff81, float:NaN)
            r3[r4] = r9     // Catch: java.lang.Throwable -> Lcc
            r4 = -99
            r3[r8] = r4     // Catch: java.lang.Throwable -> Lcc
            r4 = 15
            r9 = -107(0xffffffffffffff95, float:NaN)
            r3[r4] = r9     // Catch: java.lang.Throwable -> Lcc
            r4 = -54
            r3[r2] = r4     // Catch: java.lang.Throwable -> Lcc
            r2 = 17
            r4 = 51
            r3[r2] = r4     // Catch: java.lang.Throwable -> Lcc
            r2 = 18
            r4 = 46
            r3[r2] = r4     // Catch: java.lang.Throwable -> Lcc
            r2 = 19
            r3[r2] = r8     // Catch: java.lang.Throwable -> Lcc
            r4 = 20
            r8 = 68
            r3[r4] = r8     // Catch: java.lang.Throwable -> Lcc
            r4 = 21
            r8 = -68
            r3[r4] = r8     // Catch: java.lang.Throwable -> Lcc
            r4 = 22
            r8 = -19
            r3[r4] = r8     // Catch: java.lang.Throwable -> Lcc
            r4 = 23
            r8 = 28
            r3[r4] = r8     // Catch: java.lang.Throwable -> Lcc
            r4 = 24
            r9 = 66
            r3[r4] = r9     // Catch: java.lang.Throwable -> Lcc
            r3[r6] = r2     // Catch: java.lang.Throwable -> Lcc
            r2 = -113(0xffffffffffffff8f, float:NaN)
            r3[r5] = r2     // Catch: java.lang.Throwable -> Lcc
            r2 = 27
            r3[r2] = r7     // Catch: java.lang.Throwable -> Lcc
            r3[r8] = r6     // Catch: java.lang.Throwable -> Lcc
            r2 = 29
            r4 = -11
            r3[r2] = r4     // Catch: java.lang.Throwable -> Lcc
            r2 = 30
            r4 = -123(0xffffffffffffff85, float:NaN)
            r3[r2] = r4     // Catch: java.lang.Throwable -> Lcc
            r2 = 31
            r4 = 50
            r3[r2] = r4     // Catch: java.lang.Throwable -> Lcc
            byte[] r1 = r1.a(r3)     // Catch: java.lang.Throwable -> Lcc
            c.a.b.e.a.g.f1245a = r1     // Catch: java.lang.Throwable -> Lcc
        Lca:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lcc
            goto Lcf
        Lcc:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lcc
            throw r1
        Lcf:
            byte[] r0 = c.a.b.e.a.g.f1245a
            return r0
    }
}
