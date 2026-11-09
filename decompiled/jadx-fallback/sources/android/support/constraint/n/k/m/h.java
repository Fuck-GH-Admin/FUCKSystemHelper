package android.support.constraint.n.k.m;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static android.support.constraint.n.k.m.b.a f513a;

    static {
            android.support.constraint.n.k.m.b$a r0 = new android.support.constraint.n.k.m.b$a
            r0.<init>()
            android.support.constraint.n.k.m.h.f513a = r0
            return
    }

    private static void a(android.support.constraint.n.k.a r1, android.support.constraint.n.k.m.b.InterfaceC0025b r2, int r3, boolean r4) {
            boolean r0 = r1.R()
            if (r0 == 0) goto Lf
            if (r3 != 0) goto Lc
            a(r1, r2, r4)
            goto Lf
        Lc:
            a(r1, r2)
        Lf:
            return
    }

    private static void a(android.support.constraint.n.k.e r13, android.support.constraint.n.k.m.b.InterfaceC0025b r14) {
            boolean r0 = r13 instanceof android.support.constraint.n.k.f
            if (r0 != 0) goto L1a
            boolean r0 = r13.L()
            if (r0 == 0) goto L1a
            boolean r0 = a(r13)
            if (r0 == 0) goto L1a
            android.support.constraint.n.k.m.b$a r0 = new android.support.constraint.n.k.m.b$a
            r0.<init>()
            int r1 = android.support.constraint.n.k.m.b.a.k
            android.support.constraint.n.k.f.a(r13, r14, r0, r1)
        L1a:
            android.support.constraint.n.k.d$b r0 = android.support.constraint.n.k.d.b.d
            android.support.constraint.n.k.d r0 = r13.a(r0)
            android.support.constraint.n.k.d$b r1 = android.support.constraint.n.k.d.b.f
            android.support.constraint.n.k.d r1 = r13.a(r1)
            int r2 = r0.b()
            int r3 = r1.b()
            java.util.HashSet r4 = r0.a()
            r5 = 0
            r6 = 8
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L125
            boolean r4 = r0.k()
            if (r4 == 0) goto L125
            java.util.HashSet r0 = r0.a()
            java.util.Iterator r0 = r0.iterator()
        L47:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L125
            java.lang.Object r4 = r0.next()
            android.support.constraint.n.k.d r4 = (android.support.constraint.n.k.d) r4
            android.support.constraint.n.k.e r9 = r4.d
            boolean r10 = a(r9)
            boolean r11 = r9.L()
            if (r11 == 0) goto L6b
            if (r10 == 0) goto L6b
            android.support.constraint.n.k.m.b$a r11 = new android.support.constraint.n.k.m.b$a
            r11.<init>()
            int r12 = android.support.constraint.n.k.m.b.a.k
            android.support.constraint.n.k.f.a(r9, r14, r11, r12)
        L6b:
            android.support.constraint.n.k.e$b r11 = r9.z()
            android.support.constraint.n.k.e$b r12 = android.support.constraint.n.k.e.b.d
            if (r11 != r12) goto Ld4
            if (r10 == 0) goto L76
            goto Ld4
        L76:
            android.support.constraint.n.k.e$b r10 = r9.z()
            android.support.constraint.n.k.e$b r11 = android.support.constraint.n.k.e.b.d
            if (r10 != r11) goto L47
            int r10 = r9.u
            if (r10 < 0) goto L47
            int r10 = r9.t
            if (r10 < 0) goto L47
            int r10 = r9.B()
            if (r10 == r6) goto L98
            int r10 = r9.o
            if (r10 != 0) goto L47
            float r10 = r9.i()
            int r10 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r10 != 0) goto L47
        L98:
            boolean r10 = r9.J()
            if (r10 != 0) goto L47
            boolean r10 = r9.K()
            if (r10 != 0) goto L47
            android.support.constraint.n.k.d r10 = r9.G
            if (r4 != r10) goto Lb4
            android.support.constraint.n.k.d r10 = r9.I
            android.support.constraint.n.k.d r10 = r10.f
            if (r10 == 0) goto Lb4
            boolean r10 = r10.k()
            if (r10 != 0) goto Lc4
        Lb4:
            android.support.constraint.n.k.d r10 = r9.I
            if (r4 != r10) goto Lc6
            android.support.constraint.n.k.d r4 = r9.G
            android.support.constraint.n.k.d r4 = r4.f
            if (r4 == 0) goto Lc6
            boolean r4 = r4.k()
            if (r4 == 0) goto Lc6
        Lc4:
            r4 = r7
            goto Lc7
        Lc6:
            r4 = r8
        Lc7:
            if (r4 == 0) goto L47
            boolean r4 = r9.J()
            if (r4 != 0) goto L47
            a(r13, r14, r9)
            goto L47
        Ld4:
            boolean r10 = r9.L()
            if (r10 == 0) goto Ldc
            goto L47
        Ldc:
            android.support.constraint.n.k.d r10 = r9.G
            if (r4 != r10) goto Lf8
            android.support.constraint.n.k.d r11 = r9.I
            android.support.constraint.n.k.d r11 = r11.f
            if (r11 != 0) goto Lf8
            int r4 = r10.c()
            int r4 = r4 + r2
            int r10 = r9.k()
            int r10 = r10 + r4
            r9.b(r4, r10)
        Lf3:
            a(r9, r14)
            goto L47
        Lf8:
            android.support.constraint.n.k.d r10 = r9.I
            if (r4 != r10) goto L110
            android.support.constraint.n.k.d r11 = r10.f
            if (r11 != 0) goto L110
            int r4 = r10.c()
            int r4 = r2 - r4
            int r10 = r9.k()
            int r10 = r4 - r10
            r9.b(r10, r4)
            goto Lf3
        L110:
            android.support.constraint.n.k.d r10 = r9.G
            if (r4 != r10) goto L47
            android.support.constraint.n.k.d r4 = r9.I
            android.support.constraint.n.k.d r4 = r4.f
            if (r4 == 0) goto L47
            boolean r4 = r4.k()
            if (r4 == 0) goto L47
            a(r14, r9)
            goto L47
        L125:
            boolean r0 = r13 instanceof android.support.constraint.n.k.g
            if (r0 == 0) goto L12a
            return
        L12a:
            java.util.HashSet r0 = r1.a()
            if (r0 == 0) goto L216
            boolean r0 = r1.k()
            if (r0 == 0) goto L216
            java.util.HashSet r0 = r1.a()
            java.util.Iterator r0 = r0.iterator()
        L13e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L216
            java.lang.Object r1 = r0.next()
            android.support.constraint.n.k.d r1 = (android.support.constraint.n.k.d) r1
            android.support.constraint.n.k.e r2 = r1.d
            boolean r4 = a(r2)
            boolean r9 = r2.L()
            if (r9 == 0) goto L162
            if (r4 == 0) goto L162
            android.support.constraint.n.k.m.b$a r9 = new android.support.constraint.n.k.m.b$a
            r9.<init>()
            int r10 = android.support.constraint.n.k.m.b.a.k
            android.support.constraint.n.k.f.a(r2, r14, r9, r10)
        L162:
            android.support.constraint.n.k.d r9 = r2.G
            if (r1 != r9) goto L172
            android.support.constraint.n.k.d r9 = r2.I
            android.support.constraint.n.k.d r9 = r9.f
            if (r9 == 0) goto L172
            boolean r9 = r9.k()
            if (r9 != 0) goto L182
        L172:
            android.support.constraint.n.k.d r9 = r2.I
            if (r1 != r9) goto L184
            android.support.constraint.n.k.d r9 = r2.G
            android.support.constraint.n.k.d r9 = r9.f
            if (r9 == 0) goto L184
            boolean r9 = r9.k()
            if (r9 == 0) goto L184
        L182:
            r9 = r7
            goto L185
        L184:
            r9 = r8
        L185:
            android.support.constraint.n.k.e$b r10 = r2.z()
            android.support.constraint.n.k.e$b r11 = android.support.constraint.n.k.e.b.d
            if (r10 != r11) goto L1cb
            if (r4 == 0) goto L190
            goto L1cb
        L190:
            android.support.constraint.n.k.e$b r1 = r2.z()
            android.support.constraint.n.k.e$b r4 = android.support.constraint.n.k.e.b.d
            if (r1 != r4) goto L13e
            int r1 = r2.u
            if (r1 < 0) goto L13e
            int r1 = r2.t
            if (r1 < 0) goto L13e
            int r1 = r2.B()
            if (r1 == r6) goto L1b2
            int r1 = r2.o
            if (r1 != 0) goto L13e
            float r1 = r2.i()
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 != 0) goto L13e
        L1b2:
            boolean r1 = r2.J()
            if (r1 != 0) goto L13e
            boolean r1 = r2.K()
            if (r1 != 0) goto L13e
            if (r9 == 0) goto L13e
            boolean r1 = r2.J()
            if (r1 != 0) goto L13e
            a(r13, r14, r2)
            goto L13e
        L1cb:
            boolean r4 = r2.L()
            if (r4 == 0) goto L1d3
            goto L13e
        L1d3:
            android.support.constraint.n.k.d r4 = r2.G
            if (r1 != r4) goto L1ef
            android.support.constraint.n.k.d r10 = r2.I
            android.support.constraint.n.k.d r10 = r10.f
            if (r10 != 0) goto L1ef
            int r1 = r4.c()
            int r1 = r1 + r3
            int r4 = r2.k()
            int r4 = r4 + r1
            r2.b(r1, r4)
        L1ea:
            a(r2, r14)
            goto L13e
        L1ef:
            android.support.constraint.n.k.d r4 = r2.I
            if (r1 != r4) goto L209
            android.support.constraint.n.k.d r1 = r2.G
            android.support.constraint.n.k.d r1 = r1.f
            if (r1 != 0) goto L209
            int r1 = r4.c()
            int r1 = r3 - r1
            int r4 = r2.k()
            int r4 = r1 - r4
            r2.b(r4, r1)
            goto L1ea
        L209:
            if (r9 == 0) goto L13e
            boolean r1 = r2.J()
            if (r1 != 0) goto L13e
            a(r14, r2)
            goto L13e
        L216:
            android.support.constraint.n.k.d$b r0 = android.support.constraint.n.k.d.b.g
            android.support.constraint.n.k.d r13 = r13.a(r0)
            java.util.HashSet r0 = r13.a()
            if (r0 == 0) goto L274
            boolean r0 = r13.k()
            if (r0 == 0) goto L274
            int r0 = r13.b()
            java.util.HashSet r13 = r13.a()
            java.util.Iterator r13 = r13.iterator()
        L234:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L274
            java.lang.Object r1 = r13.next()
            android.support.constraint.n.k.d r1 = (android.support.constraint.n.k.d) r1
            android.support.constraint.n.k.e r2 = r1.d
            boolean r3 = a(r2)
            boolean r4 = r2.L()
            if (r4 == 0) goto L258
            if (r3 == 0) goto L258
            android.support.constraint.n.k.m.b$a r4 = new android.support.constraint.n.k.m.b$a
            r4.<init>()
            int r5 = android.support.constraint.n.k.m.b.a.k
            android.support.constraint.n.k.f.a(r2, r14, r4, r5)
        L258:
            android.support.constraint.n.k.e$b r4 = r2.z()
            android.support.constraint.n.k.e$b r5 = android.support.constraint.n.k.e.b.d
            if (r4 != r5) goto L262
            if (r3 == 0) goto L234
        L262:
            boolean r3 = r2.L()
            if (r3 == 0) goto L269
            goto L234
        L269:
            android.support.constraint.n.k.d r3 = r2.J
            if (r1 != r3) goto L234
            r2.i(r0)
            a(r2, r14)
            goto L234
        L274:
            return
    }

    private static void a(android.support.constraint.n.k.e r7, android.support.constraint.n.k.m.b.InterfaceC0025b r8, android.support.constraint.n.k.e r9) {
            float r0 = r9.x()
            android.support.constraint.n.k.d r1 = r9.G
            android.support.constraint.n.k.d r1 = r1.f
            int r1 = r1.b()
            android.support.constraint.n.k.d r2 = r9.G
            int r2 = r2.c()
            int r1 = r1 + r2
            android.support.constraint.n.k.d r2 = r9.I
            android.support.constraint.n.k.d r2 = r2.f
            int r2 = r2.b()
            android.support.constraint.n.k.d r3 = r9.I
            int r3 = r3.c()
            int r2 = r2 - r3
            if (r2 < r1) goto L6a
            int r3 = r9.k()
            int r4 = r9.B()
            r5 = 8
            r6 = 1056964608(0x3f000000, float:0.5)
            if (r4 == r5) goto L5c
            int r4 = r9.o
            r5 = 2
            if (r4 != r5) goto L4a
            boolean r3 = r7 instanceof android.support.constraint.n.k.f
            if (r3 == 0) goto L3c
            goto L40
        L3c:
            android.support.constraint.n.k.e r7 = r7.v()
        L40:
            int r7 = r7.k()
            float r3 = r0 * r6
            float r7 = (float) r7
            float r3 = r3 * r7
            int r3 = (int) r3
            goto L4e
        L4a:
            if (r4 != 0) goto L4e
            int r3 = r2 - r1
        L4e:
            int r7 = r9.t
            int r3 = java.lang.Math.max(r7, r3)
            int r7 = r9.u
            if (r7 <= 0) goto L5c
            int r3 = java.lang.Math.min(r7, r3)
        L5c:
            int r2 = r2 - r1
            int r2 = r2 - r3
            float r7 = (float) r2
            float r0 = r0 * r7
            float r0 = r0 + r6
            int r7 = (int) r0
            int r1 = r1 + r7
            int r3 = r3 + r1
            r9.b(r1, r3)
            a(r9, r8)
        L6a:
            return
    }

    private static void a(android.support.constraint.n.k.e r7, android.support.constraint.n.k.m.b.InterfaceC0025b r8, android.support.constraint.n.k.e r9, boolean r10) {
            float r0 = r9.l()
            android.support.constraint.n.k.d r1 = r9.F
            android.support.constraint.n.k.d r1 = r1.f
            int r1 = r1.b()
            android.support.constraint.n.k.d r2 = r9.F
            int r2 = r2.c()
            int r1 = r1 + r2
            android.support.constraint.n.k.d r2 = r9.H
            android.support.constraint.n.k.d r2 = r2.f
            int r2 = r2.b()
            android.support.constraint.n.k.d r3 = r9.H
            int r3 = r3.c()
            int r2 = r2 - r3
            if (r2 < r1) goto L6d
            int r3 = r9.C()
            int r4 = r9.B()
            r5 = 8
            r6 = 1056964608(0x3f000000, float:0.5)
            if (r4 == r5) goto L5f
            int r4 = r9.n
            r5 = 2
            if (r4 != r5) goto L4d
            boolean r3 = r7 instanceof android.support.constraint.n.k.f
            if (r3 == 0) goto L3c
            goto L40
        L3c:
            android.support.constraint.n.k.e r7 = r7.v()
        L40:
            int r7 = r7.C()
            float r3 = r9.l()
            float r3 = r3 * r6
            float r7 = (float) r7
            float r3 = r3 * r7
            int r3 = (int) r3
            goto L51
        L4d:
            if (r4 != 0) goto L51
            int r3 = r2 - r1
        L51:
            int r7 = r9.q
            int r3 = java.lang.Math.max(r7, r3)
            int r7 = r9.r
            if (r7 <= 0) goto L5f
            int r3 = java.lang.Math.min(r7, r3)
        L5f:
            int r2 = r2 - r1
            int r2 = r2 - r3
            float r7 = (float) r2
            float r0 = r0 * r7
            float r0 = r0 + r6
            int r7 = (int) r0
            int r1 = r1 + r7
            int r3 = r3 + r1
            r9.a(r1, r3)
            a(r9, r8, r10)
        L6d:
            return
    }

    private static void a(android.support.constraint.n.k.e r13, android.support.constraint.n.k.m.b.InterfaceC0025b r14, boolean r15) {
            boolean r0 = r13 instanceof android.support.constraint.n.k.f
            if (r0 != 0) goto L1a
            boolean r0 = r13.L()
            if (r0 == 0) goto L1a
            boolean r0 = a(r13)
            if (r0 == 0) goto L1a
            android.support.constraint.n.k.m.b$a r0 = new android.support.constraint.n.k.m.b$a
            r0.<init>()
            int r1 = android.support.constraint.n.k.m.b.a.k
            android.support.constraint.n.k.f.a(r13, r14, r0, r1)
        L1a:
            android.support.constraint.n.k.d$b r0 = android.support.constraint.n.k.d.b.f489c
            android.support.constraint.n.k.d r0 = r13.a(r0)
            android.support.constraint.n.k.d$b r1 = android.support.constraint.n.k.d.b.e
            android.support.constraint.n.k.d r1 = r13.a(r1)
            int r2 = r0.b()
            int r3 = r1.b()
            java.util.HashSet r4 = r0.a()
            r5 = 0
            r6 = 8
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L12d
            boolean r4 = r0.k()
            if (r4 == 0) goto L12d
            java.util.HashSet r0 = r0.a()
            java.util.Iterator r0 = r0.iterator()
        L47:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L12d
            java.lang.Object r4 = r0.next()
            android.support.constraint.n.k.d r4 = (android.support.constraint.n.k.d) r4
            android.support.constraint.n.k.e r9 = r4.d
            boolean r10 = a(r9)
            boolean r11 = r9.L()
            if (r11 == 0) goto L6b
            if (r10 == 0) goto L6b
            android.support.constraint.n.k.m.b$a r11 = new android.support.constraint.n.k.m.b$a
            r11.<init>()
            int r12 = android.support.constraint.n.k.m.b.a.k
            android.support.constraint.n.k.f.a(r9, r14, r11, r12)
        L6b:
            android.support.constraint.n.k.e$b r11 = r9.n()
            android.support.constraint.n.k.e$b r12 = android.support.constraint.n.k.e.b.d
            if (r11 != r12) goto Ld4
            if (r10 == 0) goto L76
            goto Ld4
        L76:
            android.support.constraint.n.k.e$b r10 = r9.n()
            android.support.constraint.n.k.e$b r11 = android.support.constraint.n.k.e.b.d
            if (r10 != r11) goto L47
            int r10 = r9.r
            if (r10 < 0) goto L47
            int r10 = r9.q
            if (r10 < 0) goto L47
            int r10 = r9.B()
            if (r10 == r6) goto L98
            int r10 = r9.n
            if (r10 != 0) goto L47
            float r10 = r9.i()
            int r10 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r10 != 0) goto L47
        L98:
            boolean r10 = r9.H()
            if (r10 != 0) goto L47
            boolean r10 = r9.K()
            if (r10 != 0) goto L47
            android.support.constraint.n.k.d r10 = r9.F
            if (r4 != r10) goto Lb4
            android.support.constraint.n.k.d r10 = r9.H
            android.support.constraint.n.k.d r10 = r10.f
            if (r10 == 0) goto Lb4
            boolean r10 = r10.k()
            if (r10 != 0) goto Lc4
        Lb4:
            android.support.constraint.n.k.d r10 = r9.H
            if (r4 != r10) goto Lc6
            android.support.constraint.n.k.d r4 = r9.F
            android.support.constraint.n.k.d r4 = r4.f
            if (r4 == 0) goto Lc6
            boolean r4 = r4.k()
            if (r4 == 0) goto Lc6
        Lc4:
            r4 = r7
            goto Lc7
        Lc6:
            r4 = r8
        Lc7:
            if (r4 == 0) goto L47
            boolean r4 = r9.H()
            if (r4 != 0) goto L47
            a(r13, r14, r9, r15)
            goto L47
        Ld4:
            boolean r10 = r9.L()
            if (r10 == 0) goto Ldc
            goto L47
        Ldc:
            android.support.constraint.n.k.d r10 = r9.F
            if (r4 != r10) goto Lf8
            android.support.constraint.n.k.d r11 = r9.H
            android.support.constraint.n.k.d r11 = r11.f
            if (r11 != 0) goto Lf8
            int r4 = r10.c()
            int r4 = r4 + r2
            int r10 = r9.C()
            int r10 = r10 + r4
            r9.a(r4, r10)
        Lf3:
            a(r9, r14, r15)
            goto L47
        Lf8:
            android.support.constraint.n.k.d r10 = r9.H
            if (r4 != r10) goto L112
            android.support.constraint.n.k.d r11 = r9.F
            android.support.constraint.n.k.d r11 = r11.f
            if (r11 != 0) goto L112
            int r4 = r10.c()
            int r4 = r2 - r4
            int r10 = r9.C()
            int r10 = r4 - r10
            r9.a(r10, r4)
            goto Lf3
        L112:
            android.support.constraint.n.k.d r10 = r9.F
            if (r4 != r10) goto L47
            android.support.constraint.n.k.d r4 = r9.H
            android.support.constraint.n.k.d r4 = r4.f
            if (r4 == 0) goto L47
            boolean r4 = r4.k()
            if (r4 == 0) goto L47
            boolean r4 = r9.H()
            if (r4 != 0) goto L47
            a(r14, r9, r15)
            goto L47
        L12d:
            boolean r0 = r13 instanceof android.support.constraint.n.k.g
            if (r0 == 0) goto L132
            return
        L132:
            java.util.HashSet r0 = r1.a()
            if (r0 == 0) goto L21e
            boolean r0 = r1.k()
            if (r0 == 0) goto L21e
            java.util.HashSet r0 = r1.a()
            java.util.Iterator r0 = r0.iterator()
        L146:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L21e
            java.lang.Object r1 = r0.next()
            android.support.constraint.n.k.d r1 = (android.support.constraint.n.k.d) r1
            android.support.constraint.n.k.e r2 = r1.d
            boolean r4 = a(r2)
            boolean r9 = r2.L()
            if (r9 == 0) goto L16a
            if (r4 == 0) goto L16a
            android.support.constraint.n.k.m.b$a r9 = new android.support.constraint.n.k.m.b$a
            r9.<init>()
            int r10 = android.support.constraint.n.k.m.b.a.k
            android.support.constraint.n.k.f.a(r2, r14, r9, r10)
        L16a:
            android.support.constraint.n.k.d r9 = r2.F
            if (r1 != r9) goto L17a
            android.support.constraint.n.k.d r9 = r2.H
            android.support.constraint.n.k.d r9 = r9.f
            if (r9 == 0) goto L17a
            boolean r9 = r9.k()
            if (r9 != 0) goto L18a
        L17a:
            android.support.constraint.n.k.d r9 = r2.H
            if (r1 != r9) goto L18c
            android.support.constraint.n.k.d r9 = r2.F
            android.support.constraint.n.k.d r9 = r9.f
            if (r9 == 0) goto L18c
            boolean r9 = r9.k()
            if (r9 == 0) goto L18c
        L18a:
            r9 = r7
            goto L18d
        L18c:
            r9 = r8
        L18d:
            android.support.constraint.n.k.e$b r10 = r2.n()
            android.support.constraint.n.k.e$b r11 = android.support.constraint.n.k.e.b.d
            if (r10 != r11) goto L1d3
            if (r4 == 0) goto L198
            goto L1d3
        L198:
            android.support.constraint.n.k.e$b r1 = r2.n()
            android.support.constraint.n.k.e$b r4 = android.support.constraint.n.k.e.b.d
            if (r1 != r4) goto L146
            int r1 = r2.r
            if (r1 < 0) goto L146
            int r1 = r2.q
            if (r1 < 0) goto L146
            int r1 = r2.B()
            if (r1 == r6) goto L1ba
            int r1 = r2.n
            if (r1 != 0) goto L146
            float r1 = r2.i()
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 != 0) goto L146
        L1ba:
            boolean r1 = r2.H()
            if (r1 != 0) goto L146
            boolean r1 = r2.K()
            if (r1 != 0) goto L146
            if (r9 == 0) goto L146
            boolean r1 = r2.H()
            if (r1 != 0) goto L146
            a(r13, r14, r2, r15)
            goto L146
        L1d3:
            boolean r4 = r2.L()
            if (r4 == 0) goto L1db
            goto L146
        L1db:
            android.support.constraint.n.k.d r4 = r2.F
            if (r1 != r4) goto L1f7
            android.support.constraint.n.k.d r10 = r2.H
            android.support.constraint.n.k.d r10 = r10.f
            if (r10 != 0) goto L1f7
            int r1 = r4.c()
            int r1 = r1 + r3
            int r4 = r2.C()
            int r4 = r4 + r1
            r2.a(r1, r4)
        L1f2:
            a(r2, r14, r15)
            goto L146
        L1f7:
            android.support.constraint.n.k.d r4 = r2.H
            if (r1 != r4) goto L211
            android.support.constraint.n.k.d r1 = r2.F
            android.support.constraint.n.k.d r1 = r1.f
            if (r1 != 0) goto L211
            int r1 = r4.c()
            int r1 = r3 - r1
            int r4 = r2.C()
            int r4 = r1 - r4
            r2.a(r4, r1)
            goto L1f2
        L211:
            if (r9 == 0) goto L146
            boolean r1 = r2.H()
            if (r1 != 0) goto L146
            a(r14, r2, r15)
            goto L146
        L21e:
            return
    }

    public static void a(android.support.constraint.n.k.f r13, android.support.constraint.n.k.m.b.InterfaceC0025b r14) {
            android.support.constraint.n.k.e$b r0 = r13.n()
            android.support.constraint.n.k.e$b r1 = r13.z()
            r13.Q()
            java.util.ArrayList r2 = r13.R()
            int r3 = r2.size()
            r4 = 0
            r5 = r4
        L15:
            if (r5 >= r3) goto L23
            java.lang.Object r6 = r2.get(r5)
            android.support.constraint.n.k.e r6 = (android.support.constraint.n.k.e) r6
            r6.Q()
            int r5 = r5 + 1
            goto L15
        L23:
            boolean r5 = r13.a0()
            android.support.constraint.n.k.e$b r6 = android.support.constraint.n.k.e.b.f495b
            if (r0 != r6) goto L33
            int r0 = r13.C()
            r13.a(r4, r0)
            goto L36
        L33:
            r13.j(r4)
        L36:
            r0 = r4
            r6 = r0
            r7 = r6
        L39:
            r8 = 1056964608(0x3f000000, float:0.5)
            r9 = -1
            r10 = 1
            if (r0 >= r3) goto L9a
            java.lang.Object r11 = r2.get(r0)
            android.support.constraint.n.k.e r11 = (android.support.constraint.n.k.e) r11
            boolean r12 = r11 instanceof android.support.constraint.n.k.g
            if (r12 == 0) goto L8a
            android.support.constraint.n.k.g r11 = (android.support.constraint.n.k.g) r11
            int r12 = r11.S()
            if (r12 != r10) goto L97
            int r6 = r11.T()
            if (r6 == r9) goto L5f
            int r6 = r11.T()
        L5b:
            r11.w(r6)
            goto L88
        L5f:
            int r6 = r11.U()
            if (r6 == r9) goto L75
            boolean r6 = r13.M()
            if (r6 == 0) goto L75
            int r6 = r13.C()
            int r8 = r11.U()
            int r6 = r6 - r8
            goto L5b
        L75:
            boolean r6 = r13.M()
            if (r6 == 0) goto L88
            float r6 = r11.V()
            int r9 = r13.C()
            float r9 = (float) r9
            float r6 = r6 * r9
            float r6 = r6 + r8
            int r6 = (int) r6
            goto L5b
        L88:
            r6 = r10
            goto L97
        L8a:
            boolean r8 = r11 instanceof android.support.constraint.n.k.a
            if (r8 == 0) goto L97
            android.support.constraint.n.k.a r11 = (android.support.constraint.n.k.a) r11
            int r8 = r11.V()
            if (r8 != 0) goto L97
            r7 = r10
        L97:
            int r0 = r0 + 1
            goto L39
        L9a:
            if (r6 == 0) goto Lb7
            r0 = r4
        L9d:
            if (r0 >= r3) goto Lb7
            java.lang.Object r6 = r2.get(r0)
            android.support.constraint.n.k.e r6 = (android.support.constraint.n.k.e) r6
            boolean r11 = r6 instanceof android.support.constraint.n.k.g
            if (r11 == 0) goto Lb4
            android.support.constraint.n.k.g r6 = (android.support.constraint.n.k.g) r6
            int r11 = r6.S()
            if (r11 != r10) goto Lb4
            a(r6, r14, r5)
        Lb4:
            int r0 = r0 + 1
            goto L9d
        Lb7:
            a(r13, r14, r5)
            if (r7 == 0) goto Ld7
            r0 = r4
        Lbd:
            if (r0 >= r3) goto Ld7
            java.lang.Object r6 = r2.get(r0)
            android.support.constraint.n.k.e r6 = (android.support.constraint.n.k.e) r6
            boolean r7 = r6 instanceof android.support.constraint.n.k.a
            if (r7 == 0) goto Ld4
            android.support.constraint.n.k.a r6 = (android.support.constraint.n.k.a) r6
            int r7 = r6.V()
            if (r7 != 0) goto Ld4
            a(r6, r14, r4, r5)
        Ld4:
            int r0 = r0 + 1
            goto Lbd
        Ld7:
            android.support.constraint.n.k.e$b r0 = android.support.constraint.n.k.e.b.f495b
            if (r1 != r0) goto Le3
            int r0 = r13.k()
            r13.b(r4, r0)
            goto Le6
        Le3:
            r13.k(r4)
        Le6:
            r0 = r4
            r1 = r0
            r6 = r1
        Le9:
            if (r0 >= r3) goto L146
            java.lang.Object r7 = r2.get(r0)
            android.support.constraint.n.k.e r7 = (android.support.constraint.n.k.e) r7
            boolean r11 = r7 instanceof android.support.constraint.n.k.g
            if (r11 == 0) goto L136
            android.support.constraint.n.k.g r7 = (android.support.constraint.n.k.g) r7
            int r11 = r7.S()
            if (r11 != 0) goto L143
            int r1 = r7.T()
            if (r1 == r9) goto L10b
            int r1 = r7.T()
        L107:
            r7.w(r1)
            goto L134
        L10b:
            int r1 = r7.U()
            if (r1 == r9) goto L121
            boolean r1 = r13.N()
            if (r1 == 0) goto L121
            int r1 = r13.k()
            int r11 = r7.U()
            int r1 = r1 - r11
            goto L107
        L121:
            boolean r1 = r13.N()
            if (r1 == 0) goto L134
            float r1 = r7.V()
            int r11 = r13.k()
            float r11 = (float) r11
            float r1 = r1 * r11
            float r1 = r1 + r8
            int r1 = (int) r1
            goto L107
        L134:
            r1 = r10
            goto L143
        L136:
            boolean r11 = r7 instanceof android.support.constraint.n.k.a
            if (r11 == 0) goto L143
            android.support.constraint.n.k.a r7 = (android.support.constraint.n.k.a) r7
            int r7 = r7.V()
            if (r7 != r10) goto L143
            r6 = r10
        L143:
            int r0 = r0 + 1
            goto Le9
        L146:
            if (r1 == 0) goto L163
            r0 = r4
        L149:
            if (r0 >= r3) goto L163
            java.lang.Object r1 = r2.get(r0)
            android.support.constraint.n.k.e r1 = (android.support.constraint.n.k.e) r1
            boolean r7 = r1 instanceof android.support.constraint.n.k.g
            if (r7 == 0) goto L160
            android.support.constraint.n.k.g r1 = (android.support.constraint.n.k.g) r1
            int r7 = r1.S()
            if (r7 != 0) goto L160
            a(r1, r14)
        L160:
            int r0 = r0 + 1
            goto L149
        L163:
            a(r13, r14)
            if (r6 == 0) goto L183
            r13 = r4
        L169:
            if (r13 >= r3) goto L183
            java.lang.Object r0 = r2.get(r13)
            android.support.constraint.n.k.e r0 = (android.support.constraint.n.k.e) r0
            boolean r1 = r0 instanceof android.support.constraint.n.k.a
            if (r1 == 0) goto L180
            android.support.constraint.n.k.a r0 = (android.support.constraint.n.k.a) r0
            int r1 = r0.V()
            if (r1 != r10) goto L180
            a(r0, r14, r10, r5)
        L180:
            int r13 = r13 + 1
            goto L169
        L183:
            if (r4 >= r3) goto L1a7
            java.lang.Object r13 = r2.get(r4)
            android.support.constraint.n.k.e r13 = (android.support.constraint.n.k.e) r13
            boolean r0 = r13.L()
            if (r0 == 0) goto L1a4
            boolean r0 = a(r13)
            if (r0 == 0) goto L1a4
            android.support.constraint.n.k.m.b$a r0 = android.support.constraint.n.k.m.h.f513a
            int r1 = android.support.constraint.n.k.m.b.a.k
            android.support.constraint.n.k.f.a(r13, r14, r0, r1)
            a(r13, r14, r5)
            a(r13, r14)
        L1a4:
            int r4 = r4 + 1
            goto L183
        L1a7:
            return
    }

    private static void a(android.support.constraint.n.k.m.b.InterfaceC0025b r6, android.support.constraint.n.k.e r7) {
            float r0 = r7.x()
            android.support.constraint.n.k.d r1 = r7.G
            android.support.constraint.n.k.d r1 = r1.f
            int r1 = r1.b()
            android.support.constraint.n.k.d r2 = r7.I
            android.support.constraint.n.k.d r2 = r2.f
            int r2 = r2.b()
            android.support.constraint.n.k.d r3 = r7.G
            int r3 = r3.c()
            int r3 = r3 + r1
            android.support.constraint.n.k.d r4 = r7.I
            int r4 = r4.c()
            int r4 = r2 - r4
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r1 != r2) goto L29
            r0 = r5
            goto L2b
        L29:
            r1 = r3
            r2 = r4
        L2b:
            int r3 = r7.k()
            int r4 = r2 - r1
            int r4 = r4 - r3
            if (r1 <= r2) goto L37
            int r4 = r1 - r2
            int r4 = r4 - r3
        L37:
            float r4 = (float) r4
            float r0 = r0 * r4
            float r0 = r0 + r5
            int r0 = (int) r0
            int r4 = r1 + r0
            int r5 = r4 + r3
            if (r1 <= r2) goto L45
            int r4 = r1 - r0
            int r5 = r4 - r3
        L45:
            r7.b(r4, r5)
            a(r7, r6)
            return
    }

    private static void a(android.support.constraint.n.k.m.b.InterfaceC0025b r6, android.support.constraint.n.k.e r7, boolean r8) {
            float r0 = r7.l()
            android.support.constraint.n.k.d r1 = r7.F
            android.support.constraint.n.k.d r1 = r1.f
            int r1 = r1.b()
            android.support.constraint.n.k.d r2 = r7.H
            android.support.constraint.n.k.d r2 = r2.f
            int r2 = r2.b()
            android.support.constraint.n.k.d r3 = r7.F
            int r3 = r3.c()
            int r3 = r3 + r1
            android.support.constraint.n.k.d r4 = r7.H
            int r4 = r4.c()
            int r4 = r2 - r4
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r1 != r2) goto L29
            r0 = r5
            goto L2b
        L29:
            r1 = r3
            r2 = r4
        L2b:
            int r3 = r7.C()
            int r4 = r2 - r1
            int r4 = r4 - r3
            if (r1 <= r2) goto L37
            int r4 = r1 - r2
            int r4 = r4 - r3
        L37:
            float r4 = (float) r4
            float r0 = r0 * r4
            float r0 = r0 + r5
            int r0 = (int) r0
            int r0 = r0 + r1
            int r4 = r0 + r3
            if (r1 <= r2) goto L42
            int r4 = r0 - r3
        L42:
            r7.a(r0, r4)
            a(r7, r6, r8)
            return
    }

    private static boolean a(android.support.constraint.n.k.e r6) {
            android.support.constraint.n.k.e$b r0 = r6.n()
            android.support.constraint.n.k.e$b r1 = r6.z()
            android.support.constraint.n.k.e r2 = r6.v()
            if (r2 == 0) goto L15
            android.support.constraint.n.k.e r2 = r6.v()
            android.support.constraint.n.k.f r2 = (android.support.constraint.n.k.f) r2
            goto L16
        L15:
            r2 = 0
        L16:
            if (r2 == 0) goto L1e
            android.support.constraint.n.k.e$b r3 = r2.n()
            android.support.constraint.n.k.e$b r4 = android.support.constraint.n.k.e.b.f495b
        L1e:
            if (r2 == 0) goto L26
            android.support.constraint.n.k.e$b r2 = r2.z()
            android.support.constraint.n.k.e$b r3 = android.support.constraint.n.k.e.b.f495b
        L26:
            android.support.constraint.n.k.e$b r2 = android.support.constraint.n.k.e.b.f495b
            r3 = 0
            r4 = 0
            r5 = 1
            if (r0 == r2) goto L4e
            android.support.constraint.n.k.e$b r2 = android.support.constraint.n.k.e.b.f496c
            if (r0 == r2) goto L4e
            android.support.constraint.n.k.e$b r2 = android.support.constraint.n.k.e.b.d
            if (r0 != r2) goto L45
            int r0 = r6.n
            if (r0 != 0) goto L45
            float r0 = r6.U
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L45
            boolean r0 = r6.g(r4)
            if (r0 != 0) goto L4e
        L45:
            boolean r0 = r6.M()
            if (r0 == 0) goto L4c
            goto L4e
        L4c:
            r0 = r4
            goto L4f
        L4e:
            r0 = r5
        L4f:
            android.support.constraint.n.k.e$b r2 = android.support.constraint.n.k.e.b.f495b
            if (r1 == r2) goto L74
            android.support.constraint.n.k.e$b r2 = android.support.constraint.n.k.e.b.f496c
            if (r1 == r2) goto L74
            android.support.constraint.n.k.e$b r2 = android.support.constraint.n.k.e.b.d
            if (r1 != r2) goto L6b
            int r1 = r6.o
            if (r1 != 0) goto L6b
            float r1 = r6.U
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L6b
            boolean r1 = r6.g(r5)
            if (r1 != 0) goto L74
        L6b:
            boolean r1 = r6.N()
            if (r1 == 0) goto L72
            goto L74
        L72:
            r1 = r4
            goto L75
        L74:
            r1 = r5
        L75:
            float r6 = r6.U
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 <= 0) goto L80
            if (r0 != 0) goto L7f
            if (r1 == 0) goto L80
        L7f:
            return r5
        L80:
            if (r0 == 0) goto L85
            if (r1 == 0) goto L85
            r4 = r5
        L85:
            return r4
    }
}
