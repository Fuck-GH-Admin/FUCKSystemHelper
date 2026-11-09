package android.support.constraint.n.k.m;

/* JADX INFO: loaded from: classes.dex */
public class i {
    public static android.support.constraint.n.k.m.o a(android.support.constraint.n.k.e r6, int r7, java.util.ArrayList<android.support.constraint.n.k.m.o> r8, android.support.constraint.n.k.m.o r9) {
            if (r7 != 0) goto L5
            int r0 = r6.m0
            goto L7
        L5:
            int r0 = r6.n0
        L7:
            r1 = 0
            r2 = -1
            if (r0 == r2) goto L31
            if (r9 == 0) goto L11
            int r3 = r9.f520b
            if (r0 == r3) goto L31
        L11:
            r3 = r1
        L12:
            int r4 = r8.size()
            if (r3 >= r4) goto L34
            java.lang.Object r4 = r8.get(r3)
            android.support.constraint.n.k.m.o r4 = (android.support.constraint.n.k.m.o) r4
            int r5 = r4.a()
            if (r5 != r0) goto L2e
            if (r9 == 0) goto L2c
            r9.a(r7, r4)
            r8.remove(r9)
        L2c:
            r9 = r4
            goto L34
        L2e:
            int r3 = r3 + 1
            goto L12
        L31:
            if (r0 == r2) goto L34
            return r9
        L34:
            if (r9 != 0) goto L65
            boolean r0 = r6 instanceof android.support.constraint.n.k.i
            if (r0 == 0) goto L5b
            r0 = r6
            android.support.constraint.n.k.i r0 = (android.support.constraint.n.k.i) r0
            int r0 = r0.w(r7)
            if (r0 == r2) goto L5b
            r2 = r1
        L44:
            int r3 = r8.size()
            if (r2 >= r3) goto L5b
            java.lang.Object r3 = r8.get(r2)
            android.support.constraint.n.k.m.o r3 = (android.support.constraint.n.k.m.o) r3
            int r4 = r3.a()
            if (r4 != r0) goto L58
            r9 = r3
            goto L5b
        L58:
            int r2 = r2 + 1
            goto L44
        L5b:
            if (r9 != 0) goto L62
            android.support.constraint.n.k.m.o r9 = new android.support.constraint.n.k.m.o
            r9.<init>(r7)
        L62:
            r8.add(r9)
        L65:
            boolean r0 = r9.a(r6)
            if (r0 == 0) goto La6
            boolean r0 = r6 instanceof android.support.constraint.n.k.g
            if (r0 == 0) goto L80
            r0 = r6
            android.support.constraint.n.k.g r0 = (android.support.constraint.n.k.g) r0
            android.support.constraint.n.k.d r2 = r0.R()
            int r0 = r0.S()
            if (r0 != 0) goto L7d
            r1 = 1
        L7d:
            r2.a(r1, r8, r9)
        L80:
            int r0 = r9.a()
            if (r7 != 0) goto L90
            r6.m0 = r0
            android.support.constraint.n.k.d r0 = r6.F
            r0.a(r7, r8, r9)
            android.support.constraint.n.k.d r0 = r6.H
            goto L9e
        L90:
            r6.n0 = r0
            android.support.constraint.n.k.d r0 = r6.G
            r0.a(r7, r8, r9)
            android.support.constraint.n.k.d r0 = r6.J
            r0.a(r7, r8, r9)
            android.support.constraint.n.k.d r0 = r6.I
        L9e:
            r0.a(r7, r8, r9)
            android.support.constraint.n.k.d r6 = r6.M
            r6.a(r7, r8, r9)
        La6:
            return r9
    }

    private static android.support.constraint.n.k.m.o a(java.util.ArrayList<android.support.constraint.n.k.m.o> r4, int r5) {
            int r0 = r4.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L15
            java.lang.Object r2 = r4.get(r1)
            android.support.constraint.n.k.m.o r2 = (android.support.constraint.n.k.m.o) r2
            int r3 = r2.f520b
            if (r5 != r3) goto L12
            return r2
        L12:
            int r1 = r1 + 1
            goto L5
        L15:
            r4 = 0
            return r4
    }

    public static boolean a(android.support.constraint.n.k.e.b r3, android.support.constraint.n.k.e.b r4, android.support.constraint.n.k.e.b r5, android.support.constraint.n.k.e.b r6) {
            android.support.constraint.n.k.e$b r0 = android.support.constraint.n.k.e.b.f495b
            r1 = 0
            r2 = 1
            if (r5 == r0) goto L15
            android.support.constraint.n.k.e$b r0 = android.support.constraint.n.k.e.b.f496c
            if (r5 == r0) goto L15
            android.support.constraint.n.k.e$b r0 = android.support.constraint.n.k.e.b.e
            if (r5 != r0) goto L13
            android.support.constraint.n.k.e$b r5 = android.support.constraint.n.k.e.b.f496c
            if (r3 == r5) goto L13
            goto L15
        L13:
            r3 = r1
            goto L16
        L15:
            r3 = r2
        L16:
            android.support.constraint.n.k.e$b r5 = android.support.constraint.n.k.e.b.f495b
            if (r6 == r5) goto L29
            android.support.constraint.n.k.e$b r5 = android.support.constraint.n.k.e.b.f496c
            if (r6 == r5) goto L29
            android.support.constraint.n.k.e$b r5 = android.support.constraint.n.k.e.b.e
            if (r6 != r5) goto L27
            android.support.constraint.n.k.e$b r5 = android.support.constraint.n.k.e.b.f496c
            if (r4 == r5) goto L27
            goto L29
        L27:
            r4 = r1
            goto L2a
        L29:
            r4 = r2
        L2a:
            if (r3 != 0) goto L30
            if (r4 == 0) goto L2f
            goto L30
        L2f:
            return r1
        L30:
            return r2
    }

    public static boolean a(android.support.constraint.n.k.f r16, android.support.constraint.n.k.m.b.InterfaceC0025b r17) {
            r0 = r16
            java.util.ArrayList r1 = r16.R()
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r2) goto L2e
            java.lang.Object r5 = r1.get(r4)
            android.support.constraint.n.k.e r5 = (android.support.constraint.n.k.e) r5
            android.support.constraint.n.k.e$b r6 = r16.n()
            android.support.constraint.n.k.e$b r7 = r16.z()
            android.support.constraint.n.k.e$b r8 = r5.n()
            android.support.constraint.n.k.e$b r5 = r5.z()
            boolean r5 = a(r6, r7, r8, r5)
            if (r5 != 0) goto L2b
            return r3
        L2b:
            int r4 = r4 + 1
            goto Lc
        L2e:
            android.support.constraint.n.e r4 = r0.u0
            if (r4 == 0) goto L39
            long r5 = r4.A
            r7 = 1
            long r5 = r5 + r7
            r4.A = r5
        L39:
            r5 = r3
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L40:
            r12 = 1
            if (r5 >= r2) goto L116
            java.lang.Object r13 = r1.get(r5)
            android.support.constraint.n.k.e r13 = (android.support.constraint.n.k.e) r13
            android.support.constraint.n.k.e$b r14 = r16.n()
            android.support.constraint.n.k.e$b r15 = r16.z()
            android.support.constraint.n.k.e$b r3 = r13.n()
            android.support.constraint.n.k.e$b r4 = r13.z()
            boolean r3 = a(r14, r15, r3, r4)
            if (r3 != 0) goto L69
            android.support.constraint.n.k.m.b$a r3 = r0.J0
            int r4 = android.support.constraint.n.k.m.b.a.k
            r14 = r17
            android.support.constraint.n.k.f.a(r13, r14, r3, r4)
            goto L6b
        L69:
            r14 = r17
        L6b:
            boolean r3 = r13 instanceof android.support.constraint.n.k.g
            if (r3 == 0) goto L92
            r4 = r13
            android.support.constraint.n.k.g r4 = (android.support.constraint.n.k.g) r4
            int r15 = r4.S()
            if (r15 != 0) goto L82
            if (r8 != 0) goto L7f
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L7f:
            r8.add(r4)
        L82:
            int r15 = r4.S()
            if (r15 != r12) goto L92
            if (r6 != 0) goto L8f
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L8f:
            r6.add(r4)
        L92:
            boolean r4 = r13 instanceof android.support.constraint.n.k.i
            if (r4 == 0) goto Ld2
            boolean r4 = r13 instanceof android.support.constraint.n.k.a
            if (r4 == 0) goto Lbb
            r4 = r13
            android.support.constraint.n.k.a r4 = (android.support.constraint.n.k.a) r4
            int r15 = r4.V()
            if (r15 != 0) goto Lad
            if (r7 != 0) goto Laa
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        Laa:
            r7.add(r4)
        Lad:
            int r15 = r4.V()
            if (r15 != r12) goto Ld2
            if (r9 != 0) goto Lcf
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            goto Lcf
        Lbb:
            r4 = r13
            android.support.constraint.n.k.i r4 = (android.support.constraint.n.k.i) r4
            if (r7 != 0) goto Lc5
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        Lc5:
            r7.add(r4)
            if (r9 != 0) goto Lcf
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        Lcf:
            r9.add(r4)
        Ld2:
            android.support.constraint.n.k.d r4 = r13.F
            android.support.constraint.n.k.d r4 = r4.f
            if (r4 != 0) goto Lee
            android.support.constraint.n.k.d r4 = r13.H
            android.support.constraint.n.k.d r4 = r4.f
            if (r4 != 0) goto Lee
            if (r3 != 0) goto Lee
            boolean r4 = r13 instanceof android.support.constraint.n.k.a
            if (r4 != 0) goto Lee
            if (r10 != 0) goto Leb
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        Leb:
            r10.add(r13)
        Lee:
            android.support.constraint.n.k.d r4 = r13.G
            android.support.constraint.n.k.d r4 = r4.f
            if (r4 != 0) goto L111
            android.support.constraint.n.k.d r4 = r13.I
            android.support.constraint.n.k.d r4 = r4.f
            if (r4 != 0) goto L111
            android.support.constraint.n.k.d r4 = r13.J
            android.support.constraint.n.k.d r4 = r4.f
            if (r4 != 0) goto L111
            if (r3 != 0) goto L111
            boolean r3 = r13 instanceof android.support.constraint.n.k.a
            if (r3 != 0) goto L111
            if (r11 != 0) goto L10e
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r11 = r3
        L10e:
            r11.add(r13)
        L111:
            int r5 = r5 + 1
            r3 = 0
            goto L40
        L116:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r6 == 0) goto L133
            java.util.Iterator r4 = r6.iterator()
        L121:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L133
            java.lang.Object r5 = r4.next()
            android.support.constraint.n.k.g r5 = (android.support.constraint.n.k.g) r5
            r6 = 0
            r13 = 0
            a(r5, r6, r3, r13)
            goto L121
        L133:
            r6 = 0
            r13 = 0
            if (r7 == 0) goto L154
            java.util.Iterator r4 = r7.iterator()
        L13b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L154
            java.lang.Object r5 = r4.next()
            android.support.constraint.n.k.i r5 = (android.support.constraint.n.k.i) r5
            android.support.constraint.n.k.m.o r7 = a(r5, r6, r3, r13)
            r5.a(r3, r6, r7)
            r7.a(r3)
            r6 = 0
            r13 = 0
            goto L13b
        L154:
            android.support.constraint.n.k.d$b r4 = android.support.constraint.n.k.d.b.f489c
            android.support.constraint.n.k.d r4 = r0.a(r4)
            java.util.HashSet r5 = r4.a()
            if (r5 == 0) goto L17c
            java.util.HashSet r4 = r4.a()
            java.util.Iterator r4 = r4.iterator()
        L168:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L17c
            java.lang.Object r5 = r4.next()
            android.support.constraint.n.k.d r5 = (android.support.constraint.n.k.d) r5
            android.support.constraint.n.k.e r5 = r5.d
            r6 = 0
            r7 = 0
            a(r5, r6, r3, r7)
            goto L168
        L17c:
            android.support.constraint.n.k.d$b r4 = android.support.constraint.n.k.d.b.e
            android.support.constraint.n.k.d r4 = r0.a(r4)
            java.util.HashSet r5 = r4.a()
            if (r5 == 0) goto L1a4
            java.util.HashSet r4 = r4.a()
            java.util.Iterator r4 = r4.iterator()
        L190:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L1a4
            java.lang.Object r5 = r4.next()
            android.support.constraint.n.k.d r5 = (android.support.constraint.n.k.d) r5
            android.support.constraint.n.k.e r5 = r5.d
            r6 = 0
            r7 = 0
            a(r5, r6, r3, r7)
            goto L190
        L1a4:
            android.support.constraint.n.k.d$b r4 = android.support.constraint.n.k.d.b.h
            android.support.constraint.n.k.d r4 = r0.a(r4)
            java.util.HashSet r5 = r4.a()
            if (r5 == 0) goto L1cc
            java.util.HashSet r4 = r4.a()
            java.util.Iterator r4 = r4.iterator()
        L1b8:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L1cc
            java.lang.Object r5 = r4.next()
            android.support.constraint.n.k.d r5 = (android.support.constraint.n.k.d) r5
            android.support.constraint.n.k.e r5 = r5.d
            r6 = 0
            r7 = 0
            a(r5, r6, r3, r7)
            goto L1b8
        L1cc:
            r6 = 0
            r7 = 0
            if (r10 == 0) goto L1e4
            java.util.Iterator r4 = r10.iterator()
        L1d4:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L1e4
            java.lang.Object r5 = r4.next()
            android.support.constraint.n.k.e r5 = (android.support.constraint.n.k.e) r5
            a(r5, r6, r3, r7)
            goto L1d4
        L1e4:
            if (r8 == 0) goto L1fa
            java.util.Iterator r4 = r8.iterator()
        L1ea:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L1fa
            java.lang.Object r5 = r4.next()
            android.support.constraint.n.k.g r5 = (android.support.constraint.n.k.g) r5
            a(r5, r12, r3, r7)
            goto L1ea
        L1fa:
            if (r9 == 0) goto L218
            java.util.Iterator r4 = r9.iterator()
        L200:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L218
            java.lang.Object r5 = r4.next()
            android.support.constraint.n.k.i r5 = (android.support.constraint.n.k.i) r5
            android.support.constraint.n.k.m.o r6 = a(r5, r12, r3, r7)
            r5.a(r3, r12, r6)
            r6.a(r3)
            r7 = 0
            goto L200
        L218:
            android.support.constraint.n.k.d$b r4 = android.support.constraint.n.k.d.b.d
            android.support.constraint.n.k.d r4 = r0.a(r4)
            java.util.HashSet r5 = r4.a()
            if (r5 == 0) goto L23f
            java.util.HashSet r4 = r4.a()
            java.util.Iterator r4 = r4.iterator()
        L22c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L23f
            java.lang.Object r5 = r4.next()
            android.support.constraint.n.k.d r5 = (android.support.constraint.n.k.d) r5
            android.support.constraint.n.k.e r5 = r5.d
            r6 = 0
            a(r5, r12, r3, r6)
            goto L22c
        L23f:
            android.support.constraint.n.k.d$b r4 = android.support.constraint.n.k.d.b.g
            android.support.constraint.n.k.d r4 = r0.a(r4)
            java.util.HashSet r5 = r4.a()
            if (r5 == 0) goto L266
            java.util.HashSet r4 = r4.a()
            java.util.Iterator r4 = r4.iterator()
        L253:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L266
            java.lang.Object r5 = r4.next()
            android.support.constraint.n.k.d r5 = (android.support.constraint.n.k.d) r5
            android.support.constraint.n.k.e r5 = r5.d
            r6 = 0
            a(r5, r12, r3, r6)
            goto L253
        L266:
            android.support.constraint.n.k.d$b r4 = android.support.constraint.n.k.d.b.f
            android.support.constraint.n.k.d r4 = r0.a(r4)
            java.util.HashSet r5 = r4.a()
            if (r5 == 0) goto L28d
            java.util.HashSet r4 = r4.a()
            java.util.Iterator r4 = r4.iterator()
        L27a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L28d
            java.lang.Object r5 = r4.next()
            android.support.constraint.n.k.d r5 = (android.support.constraint.n.k.d) r5
            android.support.constraint.n.k.e r5 = r5.d
            r6 = 0
            a(r5, r12, r3, r6)
            goto L27a
        L28d:
            android.support.constraint.n.k.d$b r4 = android.support.constraint.n.k.d.b.h
            android.support.constraint.n.k.d r4 = r0.a(r4)
            java.util.HashSet r5 = r4.a()
            if (r5 == 0) goto L2b4
            java.util.HashSet r4 = r4.a()
            java.util.Iterator r4 = r4.iterator()
        L2a1:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L2b4
            java.lang.Object r5 = r4.next()
            android.support.constraint.n.k.d r5 = (android.support.constraint.n.k.d) r5
            android.support.constraint.n.k.e r5 = r5.d
            r13 = 0
            a(r5, r12, r3, r13)
            goto L2a1
        L2b4:
            r13 = 0
            if (r11 == 0) goto L2cb
            java.util.Iterator r4 = r11.iterator()
        L2bb:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L2cb
            java.lang.Object r5 = r4.next()
            android.support.constraint.n.k.e r5 = (android.support.constraint.n.k.e) r5
            a(r5, r12, r3, r13)
            goto L2bb
        L2cb:
            r4 = 0
        L2cc:
            if (r4 >= r2) goto L2f8
            java.lang.Object r5 = r1.get(r4)
            android.support.constraint.n.k.e r5 = (android.support.constraint.n.k.e) r5
            boolean r6 = r5.O()
            if (r6 == 0) goto L2f5
            int r6 = r5.m0
            android.support.constraint.n.k.m.o r6 = a(r3, r6)
            int r5 = r5.n0
            android.support.constraint.n.k.m.o r5 = a(r3, r5)
            if (r6 == 0) goto L2f5
            if (r5 == 0) goto L2f5
            r7 = 0
            r6.a(r7, r5)
            r7 = 2
            r5.a(r7)
            r3.remove(r6)
        L2f5:
            int r4 = r4 + 1
            goto L2cc
        L2f8:
            int r1 = r3.size()
            if (r1 > r12) goto L300
            r1 = 0
            return r1
        L300:
            android.support.constraint.n.k.e$b r1 = r16.n()
            android.support.constraint.n.k.e$b r2 = android.support.constraint.n.k.e.b.f496c
            if (r1 != r2) goto L340
            java.util.Iterator r1 = r3.iterator()
            r2 = r13
            r6 = 0
        L30e:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L332
            java.lang.Object r4 = r1.next()
            android.support.constraint.n.k.m.o r4 = (android.support.constraint.n.k.m.o) r4
            int r5 = r4.b()
            if (r5 != r12) goto L321
            goto L30e
        L321:
            r5 = 0
            r4.a(r5)
            android.support.constraint.n.d r7 = r16.W()
            int r7 = r4.a(r7, r5)
            if (r7 <= r6) goto L30e
            r2 = r4
            r6 = r7
            goto L30e
        L332:
            if (r2 == 0) goto L340
            android.support.constraint.n.k.e$b r1 = android.support.constraint.n.k.e.b.f495b
            r0.a(r1)
            r0.t(r6)
            r2.a(r12)
            goto L341
        L340:
            r2 = r13
        L341:
            android.support.constraint.n.k.e$b r1 = r16.z()
            android.support.constraint.n.k.e$b r4 = android.support.constraint.n.k.e.b.f496c
            if (r1 != r4) goto L383
            java.util.Iterator r1 = r3.iterator()
            r3 = r13
            r6 = 0
        L34f:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L373
            java.lang.Object r4 = r1.next()
            android.support.constraint.n.k.m.o r4 = (android.support.constraint.n.k.m.o) r4
            int r5 = r4.b()
            if (r5 != 0) goto L362
            goto L34f
        L362:
            r5 = 0
            r4.a(r5)
            android.support.constraint.n.d r7 = r16.W()
            int r7 = r4.a(r7, r12)
            if (r7 <= r6) goto L34f
            r3 = r4
            r6 = r7
            goto L34f
        L373:
            r5 = 0
            if (r3 == 0) goto L384
            android.support.constraint.n.k.e$b r1 = android.support.constraint.n.k.e.b.f495b
            r0.b(r1)
            r0.l(r6)
            r3.a(r12)
            r4 = r3
            goto L385
        L383:
            r5 = 0
        L384:
            r4 = r13
        L385:
            if (r2 != 0) goto L38c
            if (r4 == 0) goto L38a
            goto L38c
        L38a:
            r3 = r5
            goto L38d
        L38c:
            r3 = r12
        L38d:
            return r3
    }
}
