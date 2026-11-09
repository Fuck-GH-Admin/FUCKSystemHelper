package android.support.constraint.n.k.m;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.support.constraint.n.k.f f505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f507c;
    private android.support.constraint.n.k.f d;
    private java.util.ArrayList<android.support.constraint.n.k.m.p> e;
    private android.support.constraint.n.k.m.b.InterfaceC0025b f;
    private android.support.constraint.n.k.m.b.a g;
    java.util.ArrayList<android.support.constraint.n.k.m.m> h;

    public e(android.support.constraint.n.k.f r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f506b = r0
            r1.f507c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.e = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0 = 0
            r1.f = r0
            android.support.constraint.n.k.m.b$a r0 = new android.support.constraint.n.k.m.b$a
            r0.<init>()
            r1.g = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.h = r0
            r1.f505a = r2
            r1.d = r2
            return
    }

    private int a(android.support.constraint.n.k.f r7, int r8) {
            r6 = this;
            java.util.ArrayList<android.support.constraint.n.k.m.m> r0 = r6.h
            int r0 = r0.size()
            r1 = 0
            r3 = 0
        L9:
            if (r3 >= r0) goto L1e
            java.util.ArrayList<android.support.constraint.n.k.m.m> r4 = r6.h
            java.lang.Object r4 = r4.get(r3)
            android.support.constraint.n.k.m.m r4 = (android.support.constraint.n.k.m.m) r4
            long r4 = r4.a(r7, r8)
            long r1 = java.lang.Math.max(r1, r4)
            int r3 = r3 + 1
            goto L9
        L1e:
            int r6 = (int) r1
            return r6
    }

    private void a(android.support.constraint.n.k.e r2, android.support.constraint.n.k.e.b r3, int r4, android.support.constraint.n.k.e.b r5, int r6) {
            r1 = this;
            android.support.constraint.n.k.m.b$a r0 = r1.g
            r0.f502a = r3
            r0.f503b = r5
            r0.f504c = r4
            r0.d = r6
            android.support.constraint.n.k.m.b$b r3 = r1.f
            r3.a(r2, r0)
            android.support.constraint.n.k.m.b$a r3 = r1.g
            int r3 = r3.e
            r2.t(r3)
            android.support.constraint.n.k.m.b$a r3 = r1.g
            int r3 = r3.f
            r2.l(r3)
            android.support.constraint.n.k.m.b$a r3 = r1.g
            boolean r3 = r3.h
            r2.a(r3)
            android.support.constraint.n.k.m.b$a r1 = r1.g
            int r1 = r1.g
            r2.h(r1)
            return
    }

    private void a(android.support.constraint.n.k.m.f r9, int r10, int r11, android.support.constraint.n.k.m.f r12, java.util.ArrayList<android.support.constraint.n.k.m.m> r13, android.support.constraint.n.k.m.m r14) {
            r8 = this;
            android.support.constraint.n.k.m.p r9 = r9.d
            android.support.constraint.n.k.m.m r0 = r9.f524c
            if (r0 != 0) goto L107
            android.support.constraint.n.k.f r0 = r8.f505a
            android.support.constraint.n.k.m.l r1 = r0.d
            if (r9 == r1) goto L107
            android.support.constraint.n.k.m.n r0 = r0.e
            if (r9 != r0) goto L12
            goto L107
        L12:
            if (r14 != 0) goto L1c
            android.support.constraint.n.k.m.m r14 = new android.support.constraint.n.k.m.m
            r14.<init>(r9, r11)
            r13.add(r14)
        L1c:
            r9.f524c = r14
            r14.a(r9)
            android.support.constraint.n.k.m.f r11 = r9.h
            java.util.List<android.support.constraint.n.k.m.d> r11 = r11.k
            java.util.Iterator r11 = r11.iterator()
        L29:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L46
            java.lang.Object r0 = r11.next()
            android.support.constraint.n.k.m.d r0 = (android.support.constraint.n.k.m.d) r0
            boolean r1 = r0 instanceof android.support.constraint.n.k.m.f
            if (r1 == 0) goto L29
            r1 = r0
            android.support.constraint.n.k.m.f r1 = (android.support.constraint.n.k.m.f) r1
            r3 = 0
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.a(r1, r2, r3, r4, r5, r6)
            goto L29
        L46:
            android.support.constraint.n.k.m.f r11 = r9.i
            java.util.List<android.support.constraint.n.k.m.d> r11 = r11.k
            java.util.Iterator r11 = r11.iterator()
        L4e:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L6b
            java.lang.Object r0 = r11.next()
            android.support.constraint.n.k.m.d r0 = (android.support.constraint.n.k.m.d) r0
            boolean r1 = r0 instanceof android.support.constraint.n.k.m.f
            if (r1 == 0) goto L4e
            r1 = r0
            android.support.constraint.n.k.m.f r1 = (android.support.constraint.n.k.m.f) r1
            r3 = 1
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.a(r1, r2, r3, r4, r5, r6)
            goto L4e
        L6b:
            r11 = 1
            if (r10 != r11) goto L9a
            boolean r0 = r9 instanceof android.support.constraint.n.k.m.n
            if (r0 == 0) goto L9a
            r0 = r9
            android.support.constraint.n.k.m.n r0 = (android.support.constraint.n.k.m.n) r0
            android.support.constraint.n.k.m.f r0 = r0.k
            java.util.List<android.support.constraint.n.k.m.d> r0 = r0.k
            java.util.Iterator r7 = r0.iterator()
        L7d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L9a
            java.lang.Object r0 = r7.next()
            android.support.constraint.n.k.m.d r0 = (android.support.constraint.n.k.m.d) r0
            boolean r1 = r0 instanceof android.support.constraint.n.k.m.f
            if (r1 == 0) goto L7d
            r1 = r0
            android.support.constraint.n.k.m.f r1 = (android.support.constraint.n.k.m.f) r1
            r3 = 2
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.a(r1, r2, r3, r4, r5, r6)
            goto L7d
        L9a:
            android.support.constraint.n.k.m.f r0 = r9.h
            java.util.List<android.support.constraint.n.k.m.f> r0 = r0.l
            java.util.Iterator r7 = r0.iterator()
        La2:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lbd
            java.lang.Object r0 = r7.next()
            r1 = r0
            android.support.constraint.n.k.m.f r1 = (android.support.constraint.n.k.m.f) r1
            if (r1 != r12) goto Lb3
            r14.f515a = r11
        Lb3:
            r3 = 0
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.a(r1, r2, r3, r4, r5, r6)
            goto La2
        Lbd:
            android.support.constraint.n.k.m.f r0 = r9.i
            java.util.List<android.support.constraint.n.k.m.f> r0 = r0.l
            java.util.Iterator r7 = r0.iterator()
        Lc5:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Le0
            java.lang.Object r0 = r7.next()
            r1 = r0
            android.support.constraint.n.k.m.f r1 = (android.support.constraint.n.k.m.f) r1
            if (r1 != r12) goto Ld6
            r14.f515a = r11
        Ld6:
            r3 = 1
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.a(r1, r2, r3, r4, r5, r6)
            goto Lc5
        Le0:
            if (r10 != r11) goto L107
            boolean r11 = r9 instanceof android.support.constraint.n.k.m.n
            if (r11 == 0) goto L107
            android.support.constraint.n.k.m.n r9 = (android.support.constraint.n.k.m.n) r9
            android.support.constraint.n.k.m.f r9 = r9.k
            java.util.List<android.support.constraint.n.k.m.f> r9 = r9.l
            java.util.Iterator r9 = r9.iterator()
        Lf0:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L107
            java.lang.Object r11 = r9.next()
            r1 = r11
            android.support.constraint.n.k.m.f r1 = (android.support.constraint.n.k.m.f) r1
            r3 = 2
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.a(r1, r2, r3, r4, r5, r6)
            goto Lf0
        L107:
            return
    }

    private void a(android.support.constraint.n.k.m.p r11, int r12, java.util.ArrayList<android.support.constraint.n.k.m.m> r13) {
            r10 = this;
            android.support.constraint.n.k.m.f r0 = r11.h
            java.util.List<android.support.constraint.n.k.m.d> r0 = r0.k
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L39
            java.lang.Object r1 = r0.next()
            android.support.constraint.n.k.m.d r1 = (android.support.constraint.n.k.m.d) r1
            boolean r2 = r1 instanceof android.support.constraint.n.k.m.f
            if (r2 == 0) goto L26
            r4 = r1
            android.support.constraint.n.k.m.f r4 = (android.support.constraint.n.k.m.f) r4
            r6 = 0
            android.support.constraint.n.k.m.f r7 = r11.i
            r9 = 0
            r3 = r10
            r5 = r12
            r8 = r13
            r3.a(r4, r5, r6, r7, r8, r9)
            goto L8
        L26:
            boolean r2 = r1 instanceof android.support.constraint.n.k.m.p
            if (r2 == 0) goto L8
            android.support.constraint.n.k.m.p r1 = (android.support.constraint.n.k.m.p) r1
            android.support.constraint.n.k.m.f r3 = r1.h
            r5 = 0
            android.support.constraint.n.k.m.f r6 = r11.i
            r8 = 0
            r2 = r10
            r4 = r12
            r7 = r13
            r2.a(r3, r4, r5, r6, r7, r8)
            goto L8
        L39:
            android.support.constraint.n.k.m.f r0 = r11.i
            java.util.List<android.support.constraint.n.k.m.d> r0 = r0.k
            java.util.Iterator r0 = r0.iterator()
        L41:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L72
            java.lang.Object r1 = r0.next()
            android.support.constraint.n.k.m.d r1 = (android.support.constraint.n.k.m.d) r1
            boolean r2 = r1 instanceof android.support.constraint.n.k.m.f
            if (r2 == 0) goto L5f
            r4 = r1
            android.support.constraint.n.k.m.f r4 = (android.support.constraint.n.k.m.f) r4
            r6 = 1
            android.support.constraint.n.k.m.f r7 = r11.h
            r9 = 0
            r3 = r10
            r5 = r12
            r8 = r13
            r3.a(r4, r5, r6, r7, r8, r9)
            goto L41
        L5f:
            boolean r2 = r1 instanceof android.support.constraint.n.k.m.p
            if (r2 == 0) goto L41
            android.support.constraint.n.k.m.p r1 = (android.support.constraint.n.k.m.p) r1
            android.support.constraint.n.k.m.f r3 = r1.i
            r5 = 1
            android.support.constraint.n.k.m.f r6 = r11.h
            r8 = 0
            r2 = r10
            r4 = r12
            r7 = r13
            r2.a(r3, r4, r5, r6, r7, r8)
            goto L41
        L72:
            r0 = 1
            if (r12 != r0) goto L9c
            android.support.constraint.n.k.m.n r11 = (android.support.constraint.n.k.m.n) r11
            android.support.constraint.n.k.m.f r11 = r11.k
            java.util.List<android.support.constraint.n.k.m.d> r11 = r11.k
            java.util.Iterator r11 = r11.iterator()
        L7f:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L9c
            java.lang.Object r0 = r11.next()
            android.support.constraint.n.k.m.d r0 = (android.support.constraint.n.k.m.d) r0
            boolean r1 = r0 instanceof android.support.constraint.n.k.m.f
            if (r1 == 0) goto L7f
            r3 = r0
            android.support.constraint.n.k.m.f r3 = (android.support.constraint.n.k.m.f) r3
            r5 = 2
            r6 = 0
            r8 = 0
            r2 = r10
            r4 = r12
            r7 = r13
            r2.a(r3, r4, r5, r6, r7, r8)
            goto L7f
        L9c:
            return
    }

    private boolean a(android.support.constraint.n.k.f r14) {
            r13 = this;
            java.util.ArrayList<android.support.constraint.n.k.e> r0 = r14.p0
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L272
            java.lang.Object r1 = r0.next()
            android.support.constraint.n.k.e r1 = (android.support.constraint.n.k.e) r1
            android.support.constraint.n.k.e$b[] r3 = r1.Q
            r4 = r3[r2]
            r9 = 1
            r3 = r3[r9]
            int r5 = r1.B()
            r6 = 8
            if (r5 != r6) goto L25
        L22:
            r1.f490a = r9
            goto L6
        L25:
            float r5 = r1.s
            r10 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            r6 = 2
            if (r5 >= 0) goto L34
            android.support.constraint.n.k.e$b r5 = android.support.constraint.n.k.e.b.d
            if (r4 != r5) goto L34
            r1.n = r6
        L34:
            float r5 = r1.v
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 >= 0) goto L40
            android.support.constraint.n.k.e$b r5 = android.support.constraint.n.k.e.b.d
            if (r3 != r5) goto L40
            r1.o = r6
        L40:
            float r5 = r1.i()
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r7 = 3
            if (r5 <= 0) goto L79
            android.support.constraint.n.k.e$b r5 = android.support.constraint.n.k.e.b.d
            if (r4 != r5) goto L59
            android.support.constraint.n.k.e$b r5 = android.support.constraint.n.k.e.b.f496c
            if (r3 == r5) goto L56
            android.support.constraint.n.k.e$b r5 = android.support.constraint.n.k.e.b.f495b
            if (r3 != r5) goto L59
        L56:
            r1.n = r7
            goto L79
        L59:
            android.support.constraint.n.k.e$b r5 = android.support.constraint.n.k.e.b.d
            if (r3 != r5) goto L68
            android.support.constraint.n.k.e$b r5 = android.support.constraint.n.k.e.b.f496c
            if (r4 == r5) goto L65
            android.support.constraint.n.k.e$b r5 = android.support.constraint.n.k.e.b.f495b
            if (r4 != r5) goto L68
        L65:
            r1.o = r7
            goto L79
        L68:
            android.support.constraint.n.k.e$b r5 = android.support.constraint.n.k.e.b.d
            if (r4 != r5) goto L79
            if (r3 != r5) goto L79
            int r5 = r1.n
            if (r5 != 0) goto L74
            r1.n = r7
        L74:
            int r5 = r1.o
            if (r5 != 0) goto L79
            goto L65
        L79:
            android.support.constraint.n.k.e$b r5 = android.support.constraint.n.k.e.b.d
            if (r4 != r5) goto L8f
            int r5 = r1.n
            if (r5 != r9) goto L8f
            android.support.constraint.n.k.d r5 = r1.F
            android.support.constraint.n.k.d r5 = r5.f
            if (r5 == 0) goto L8d
            android.support.constraint.n.k.d r5 = r1.H
            android.support.constraint.n.k.d r5 = r5.f
            if (r5 != 0) goto L8f
        L8d:
            android.support.constraint.n.k.e$b r4 = android.support.constraint.n.k.e.b.f496c
        L8f:
            r5 = r4
            android.support.constraint.n.k.e$b r4 = android.support.constraint.n.k.e.b.d
            if (r3 != r4) goto La6
            int r4 = r1.o
            if (r4 != r9) goto La6
            android.support.constraint.n.k.d r4 = r1.G
            android.support.constraint.n.k.d r4 = r4.f
            if (r4 == 0) goto La4
            android.support.constraint.n.k.d r4 = r1.I
            android.support.constraint.n.k.d r4 = r4.f
            if (r4 != 0) goto La6
        La4:
            android.support.constraint.n.k.e$b r3 = android.support.constraint.n.k.e.b.f496c
        La6:
            r8 = r3
            android.support.constraint.n.k.m.l r3 = r1.d
            r3.d = r5
            int r4 = r1.n
            r3.f522a = r4
            android.support.constraint.n.k.m.n r3 = r1.e
            r3.d = r8
            int r4 = r1.o
            r3.f522a = r4
            android.support.constraint.n.k.e$b r3 = android.support.constraint.n.k.e.b.e
            if (r5 == r3) goto Lc3
            android.support.constraint.n.k.e$b r3 = android.support.constraint.n.k.e.b.f495b
            if (r5 == r3) goto Lc3
            android.support.constraint.n.k.e$b r3 = android.support.constraint.n.k.e.b.f496c
            if (r5 != r3) goto Ld1
        Lc3:
            android.support.constraint.n.k.e$b r3 = android.support.constraint.n.k.e.b.e
            if (r8 == r3) goto L21c
            android.support.constraint.n.k.e$b r3 = android.support.constraint.n.k.e.b.f495b
            if (r8 == r3) goto L21c
            android.support.constraint.n.k.e$b r3 = android.support.constraint.n.k.e.b.f496c
            if (r8 != r3) goto Ld1
            goto L21c
        Ld1:
            android.support.constraint.n.k.e$b r3 = android.support.constraint.n.k.e.b.d
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r5 != r3) goto L152
            android.support.constraint.n.k.e$b r3 = android.support.constraint.n.k.e.b.f496c
            if (r8 == r3) goto Ldf
            android.support.constraint.n.k.e$b r3 = android.support.constraint.n.k.e.b.f495b
            if (r8 != r3) goto L152
        Ldf:
            int r3 = r1.n
            if (r3 != r7) goto L100
            android.support.constraint.n.k.e$b r7 = android.support.constraint.n.k.e.b.f496c
            if (r8 != r7) goto Lef
            r6 = 0
            r8 = 0
            r3 = r13
            r4 = r1
            r5 = r7
            r3.a(r4, r5, r6, r7, r8)
        Lef:
            int r8 = r1.k()
            float r2 = (float) r8
            float r3 = r1.U
            float r2 = r2 * r3
            float r2 = r2 + r11
            int r6 = (int) r2
        Lf9:
            android.support.constraint.n.k.e$b r7 = android.support.constraint.n.k.e.b.f495b
            r3 = r13
            r4 = r1
            r5 = r7
            goto L257
        L100:
            if (r3 != r9) goto L119
            android.support.constraint.n.k.e$b r5 = android.support.constraint.n.k.e.b.f496c
            r6 = 0
            r2 = 0
            r3 = r13
            r4 = r1
            r7 = r8
            r8 = r2
            r3.a(r4, r5, r6, r7, r8)
            android.support.constraint.n.k.m.l r2 = r1.d
            android.support.constraint.n.k.m.g r2 = r2.e
            int r1 = r1.C()
        L115:
            r2.m = r1
            goto L6
        L119:
            if (r3 != r6) goto L13a
            android.support.constraint.n.k.e$b[] r3 = r14.Q
            r4 = r3[r2]
            android.support.constraint.n.k.e$b r12 = android.support.constraint.n.k.e.b.f495b
            if (r4 == r12) goto L129
            r3 = r3[r2]
            android.support.constraint.n.k.e$b r4 = android.support.constraint.n.k.e.b.e
            if (r3 != r4) goto L152
        L129:
            float r2 = r1.s
            int r3 = r14.C()
            float r3 = (float) r3
            float r2 = r2 * r3
            float r2 = r2 + r11
            int r6 = (int) r2
            int r2 = r1.k()
            android.support.constraint.n.k.e$b r5 = android.support.constraint.n.k.e.b.f495b
            goto L14c
        L13a:
            android.support.constraint.n.k.d[] r3 = r1.N
            r4 = r3[r2]
            android.support.constraint.n.k.d r4 = r4.f
            if (r4 == 0) goto L148
            r3 = r3[r9]
            android.support.constraint.n.k.d r3 = r3.f
            if (r3 != 0) goto L152
        L148:
            android.support.constraint.n.k.e$b r5 = android.support.constraint.n.k.e.b.f496c
            r6 = 0
            r2 = 0
        L14c:
            r3 = r13
            r4 = r1
            r7 = r8
            r8 = r2
            goto L257
        L152:
            android.support.constraint.n.k.e$b r3 = android.support.constraint.n.k.e.b.d
            if (r8 != r3) goto L1c1
            android.support.constraint.n.k.e$b r3 = android.support.constraint.n.k.e.b.f496c
            if (r5 == r3) goto L15e
            android.support.constraint.n.k.e$b r3 = android.support.constraint.n.k.e.b.f495b
            if (r5 != r3) goto L1c1
        L15e:
            int r3 = r1.o
            if (r3 != r7) goto L183
            android.support.constraint.n.k.e$b r7 = android.support.constraint.n.k.e.b.f496c
            if (r5 != r7) goto L16e
            r6 = 0
            r8 = 0
            r3 = r13
            r4 = r1
            r5 = r7
            r3.a(r4, r5, r6, r7, r8)
        L16e:
            int r6 = r1.C()
            float r2 = r1.U
            int r3 = r1.j()
            r4 = -1
            if (r3 != r4) goto L17d
            float r2 = r10 / r2
        L17d:
            float r3 = (float) r6
        L17e:
            float r3 = r3 * r2
            float r3 = r3 + r11
            int r8 = (int) r3
            goto Lf9
        L183:
            if (r3 != r9) goto L190
            r6 = 0
            android.support.constraint.n.k.e$b r7 = android.support.constraint.n.k.e.b.f496c
            r8 = 0
            r3 = r13
            r4 = r1
            r3.a(r4, r5, r6, r7, r8)
            goto L212
        L190:
            if (r3 != r6) goto L1b2
            android.support.constraint.n.k.e$b[] r3 = r14.Q
            r4 = r3[r9]
            android.support.constraint.n.k.e$b r7 = android.support.constraint.n.k.e.b.f495b
            if (r4 == r7) goto L1a0
            r3 = r3[r9]
            android.support.constraint.n.k.e$b r4 = android.support.constraint.n.k.e.b.e
            if (r3 != r4) goto L1c1
        L1a0:
            float r2 = r1.v
            int r6 = r1.C()
            int r3 = r14.k()
            float r3 = (float) r3
            float r2 = r2 * r3
            float r2 = r2 + r11
            int r8 = (int) r2
            android.support.constraint.n.k.e$b r7 = android.support.constraint.n.k.e.b.f495b
            goto L255
        L1b2:
            android.support.constraint.n.k.d[] r3 = r1.N
            r4 = r3[r6]
            android.support.constraint.n.k.d r4 = r4.f
            if (r4 == 0) goto L148
            r3 = r3[r7]
            android.support.constraint.n.k.d r3 = r3.f
            if (r3 != 0) goto L1c1
            goto L148
        L1c1:
            android.support.constraint.n.k.e$b r3 = android.support.constraint.n.k.e.b.d
            if (r5 != r3) goto L6
            if (r8 != r3) goto L6
            int r3 = r1.n
            if (r3 == r9) goto L1fe
            int r4 = r1.o
            if (r4 != r9) goto L1d0
            goto L1fe
        L1d0:
            if (r4 != r6) goto L6
            if (r3 != r6) goto L6
            android.support.constraint.n.k.e$b[] r3 = r14.Q
            r4 = r3[r2]
            android.support.constraint.n.k.e$b r5 = android.support.constraint.n.k.e.b.f495b
            if (r4 == r5) goto L1e0
            r2 = r3[r2]
            if (r2 != r5) goto L6
        L1e0:
            android.support.constraint.n.k.e$b[] r2 = r14.Q
            r3 = r2[r9]
            android.support.constraint.n.k.e$b r4 = android.support.constraint.n.k.e.b.f495b
            if (r3 == r4) goto L1ec
            r2 = r2[r9]
            if (r2 != r4) goto L6
        L1ec:
            float r2 = r1.s
            float r3 = r1.v
            int r4 = r14.C()
            float r4 = (float) r4
            float r2 = r2 * r4
            float r2 = r2 + r11
            int r6 = (int) r2
            int r2 = r14.k()
            float r2 = (float) r2
            goto L17e
        L1fe:
            android.support.constraint.n.k.e$b r7 = android.support.constraint.n.k.e.b.f496c
            r6 = 0
            r8 = 0
            r3 = r13
            r4 = r1
            r5 = r7
            r3.a(r4, r5, r6, r7, r8)
            android.support.constraint.n.k.m.l r2 = r1.d
            android.support.constraint.n.k.m.g r2 = r2.e
            int r3 = r1.C()
            r2.m = r3
        L212:
            android.support.constraint.n.k.m.n r2 = r1.e
            android.support.constraint.n.k.m.g r2 = r2.e
            int r1 = r1.k()
            goto L115
        L21c:
            int r2 = r1.C()
            android.support.constraint.n.k.e$b r3 = android.support.constraint.n.k.e.b.e
            if (r5 != r3) goto L237
            int r2 = r14.C()
            android.support.constraint.n.k.d r3 = r1.F
            int r3 = r3.g
            int r2 = r2 - r3
            android.support.constraint.n.k.d r3 = r1.H
            int r3 = r3.g
            int r2 = r2 - r3
            android.support.constraint.n.k.e$b r3 = android.support.constraint.n.k.e.b.f495b
            r6 = r2
            r5 = r3
            goto L238
        L237:
            r6 = r2
        L238:
            int r2 = r1.k()
            android.support.constraint.n.k.e$b r3 = android.support.constraint.n.k.e.b.e
            if (r8 != r3) goto L253
            int r2 = r14.k()
            android.support.constraint.n.k.d r3 = r1.G
            int r3 = r3.g
            int r2 = r2 - r3
            android.support.constraint.n.k.d r3 = r1.I
            int r3 = r3.g
            int r2 = r2 - r3
            android.support.constraint.n.k.e$b r3 = android.support.constraint.n.k.e.b.f495b
            r8 = r2
            r7 = r3
            goto L255
        L253:
            r7 = r8
            r8 = r2
        L255:
            r3 = r13
            r4 = r1
        L257:
            r3.a(r4, r5, r6, r7, r8)
            android.support.constraint.n.k.m.l r2 = r1.d
            android.support.constraint.n.k.m.g r2 = r2.e
            int r3 = r1.C()
            r2.a(r3)
            android.support.constraint.n.k.m.n r2 = r1.e
            android.support.constraint.n.k.m.g r2 = r2.e
            int r3 = r1.k()
            r2.a(r3)
            goto L22
        L272:
            return r2
    }

    public void a() {
            r4 = this;
            java.util.ArrayList<android.support.constraint.n.k.m.p> r0 = r4.e
            r4.a(r0)
            java.util.ArrayList<android.support.constraint.n.k.m.m> r0 = r4.h
            r0.clear()
            r0 = 0
            android.support.constraint.n.k.m.m.d = r0
            android.support.constraint.n.k.f r1 = r4.f505a
            android.support.constraint.n.k.m.l r1 = r1.d
            java.util.ArrayList<android.support.constraint.n.k.m.m> r2 = r4.h
            r4.a(r1, r0, r2)
            android.support.constraint.n.k.f r1 = r4.f505a
            android.support.constraint.n.k.m.n r1 = r1.e
            java.util.ArrayList<android.support.constraint.n.k.m.m> r2 = r4.h
            r3 = 1
            r4.a(r1, r3, r2)
            r4.f506b = r0
            return
    }

    public void a(android.support.constraint.n.k.m.b.InterfaceC0025b r1) {
            r0 = this;
            r0.f = r1
            return
    }

    public void a(java.util.ArrayList<android.support.constraint.n.k.m.p> r6) {
            r5 = this;
            r6.clear()
            android.support.constraint.n.k.f r0 = r5.d
            android.support.constraint.n.k.m.l r0 = r0.d
            r0.c()
            android.support.constraint.n.k.f r0 = r5.d
            android.support.constraint.n.k.m.n r0 = r0.e
            r0.c()
            android.support.constraint.n.k.f r0 = r5.d
            android.support.constraint.n.k.m.l r0 = r0.d
            r6.add(r0)
            android.support.constraint.n.k.f r0 = r5.d
            android.support.constraint.n.k.m.n r0 = r0.e
            r6.add(r0)
            android.support.constraint.n.k.f r0 = r5.d
            java.util.ArrayList<android.support.constraint.n.k.e> r0 = r0.p0
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L28:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L93
            java.lang.Object r2 = r0.next()
            android.support.constraint.n.k.e r2 = (android.support.constraint.n.k.e) r2
            boolean r3 = r2 instanceof android.support.constraint.n.k.g
            if (r3 == 0) goto L41
            android.support.constraint.n.k.m.j r3 = new android.support.constraint.n.k.m.j
            r3.<init>(r2)
        L3d:
            r6.add(r3)
            goto L28
        L41:
            boolean r3 = r2.H()
            if (r3 == 0) goto L60
            android.support.constraint.n.k.m.c r3 = r2.f491b
            if (r3 != 0) goto L53
            android.support.constraint.n.k.m.c r3 = new android.support.constraint.n.k.m.c
            r4 = 0
            r3.<init>(r2, r4)
            r2.f491b = r3
        L53:
            if (r1 != 0) goto L5a
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
        L5a:
            android.support.constraint.n.k.m.c r3 = r2.f491b
            r1.add(r3)
            goto L65
        L60:
            android.support.constraint.n.k.m.l r3 = r2.d
            r6.add(r3)
        L65:
            boolean r3 = r2.J()
            if (r3 == 0) goto L84
            android.support.constraint.n.k.m.c r3 = r2.f492c
            if (r3 != 0) goto L77
            android.support.constraint.n.k.m.c r3 = new android.support.constraint.n.k.m.c
            r4 = 1
            r3.<init>(r2, r4)
            r2.f492c = r3
        L77:
            if (r1 != 0) goto L7e
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
        L7e:
            android.support.constraint.n.k.m.c r3 = r2.f492c
            r1.add(r3)
            goto L89
        L84:
            android.support.constraint.n.k.m.n r3 = r2.e
            r6.add(r3)
        L89:
            boolean r3 = r2 instanceof android.support.constraint.n.k.i
            if (r3 == 0) goto L28
            android.support.constraint.n.k.m.k r3 = new android.support.constraint.n.k.m.k
            r3.<init>(r2)
            goto L3d
        L93:
            if (r1 == 0) goto L98
            r6.addAll(r1)
        L98:
            java.util.Iterator r0 = r6.iterator()
        L9c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lac
            java.lang.Object r1 = r0.next()
            android.support.constraint.n.k.m.p r1 = (android.support.constraint.n.k.m.p) r1
            r1.c()
            goto L9c
        Lac:
            java.util.Iterator r6 = r6.iterator()
        Lb0:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Lc7
            java.lang.Object r0 = r6.next()
            android.support.constraint.n.k.m.p r0 = (android.support.constraint.n.k.m.p) r0
            android.support.constraint.n.k.e r1 = r0.f523b
            android.support.constraint.n.k.f r2 = r5.d
            if (r1 != r2) goto Lc3
            goto Lb0
        Lc3:
            r0.a()
            goto Lb0
        Lc7:
            return
    }

    public boolean a(boolean r9) {
            r8 = this;
            r0 = 1
            r9 = r9 & r0
            boolean r1 = r8.f506b
            r2 = 0
            if (r1 != 0) goto Lb
            boolean r1 = r8.f507c
            if (r1 == 0) goto L46
        Lb:
            android.support.constraint.n.k.f r1 = r8.f505a
            java.util.ArrayList<android.support.constraint.n.k.e> r1 = r1.p0
            java.util.Iterator r1 = r1.iterator()
        L13:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L2f
            java.lang.Object r3 = r1.next()
            android.support.constraint.n.k.e r3 = (android.support.constraint.n.k.e) r3
            r3.d()
            r3.f490a = r2
            android.support.constraint.n.k.m.l r4 = r3.d
            r4.g()
            android.support.constraint.n.k.m.n r3 = r3.e
            r3.g()
            goto L13
        L2f:
            android.support.constraint.n.k.f r1 = r8.f505a
            r1.d()
            android.support.constraint.n.k.f r1 = r8.f505a
            r1.f490a = r2
            android.support.constraint.n.k.m.l r1 = r1.d
            r1.g()
            android.support.constraint.n.k.f r1 = r8.f505a
            android.support.constraint.n.k.m.n r1 = r1.e
            r1.g()
            r8.f507c = r2
        L46:
            android.support.constraint.n.k.f r1 = r8.d
            boolean r1 = r8.a(r1)
            if (r1 == 0) goto L4f
            return r2
        L4f:
            android.support.constraint.n.k.f r1 = r8.f505a
            r1.u(r2)
            android.support.constraint.n.k.f r1 = r8.f505a
            r1.v(r2)
            android.support.constraint.n.k.f r1 = r8.f505a
            android.support.constraint.n.k.e$b r1 = r1.b(r2)
            android.support.constraint.n.k.f r3 = r8.f505a
            android.support.constraint.n.k.e$b r3 = r3.b(r0)
            boolean r4 = r8.f506b
            if (r4 == 0) goto L6c
            r8.a()
        L6c:
            android.support.constraint.n.k.f r4 = r8.f505a
            int r4 = r4.D()
            android.support.constraint.n.k.f r5 = r8.f505a
            int r5 = r5.E()
            android.support.constraint.n.k.f r6 = r8.f505a
            android.support.constraint.n.k.m.l r6 = r6.d
            android.support.constraint.n.k.m.f r6 = r6.h
            r6.a(r4)
            android.support.constraint.n.k.f r6 = r8.f505a
            android.support.constraint.n.k.m.n r6 = r6.e
            android.support.constraint.n.k.m.f r6 = r6.h
            r6.a(r5)
            r8.d()
            android.support.constraint.n.k.e$b r6 = android.support.constraint.n.k.e.b.f496c
            if (r1 == r6) goto L93
            if (r3 != r6) goto Lf4
        L93:
            if (r9 == 0) goto Lae
            java.util.ArrayList<android.support.constraint.n.k.m.p> r6 = r8.e
            java.util.Iterator r6 = r6.iterator()
        L9b:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lae
            java.lang.Object r7 = r6.next()
            android.support.constraint.n.k.m.p r7 = (android.support.constraint.n.k.m.p) r7
            boolean r7 = r7.f()
            if (r7 != 0) goto L9b
            r9 = r2
        Lae:
            if (r9 == 0) goto Ld1
            android.support.constraint.n.k.e$b r6 = android.support.constraint.n.k.e.b.f496c
            if (r1 != r6) goto Ld1
            android.support.constraint.n.k.f r6 = r8.f505a
            android.support.constraint.n.k.e$b r7 = android.support.constraint.n.k.e.b.f495b
            r6.a(r7)
            android.support.constraint.n.k.f r6 = r8.f505a
            int r7 = r8.a(r6, r2)
            r6.t(r7)
            android.support.constraint.n.k.f r6 = r8.f505a
            android.support.constraint.n.k.m.l r7 = r6.d
            android.support.constraint.n.k.m.g r7 = r7.e
            int r6 = r6.C()
            r7.a(r6)
        Ld1:
            if (r9 == 0) goto Lf4
            android.support.constraint.n.k.e$b r9 = android.support.constraint.n.k.e.b.f496c
            if (r3 != r9) goto Lf4
            android.support.constraint.n.k.f r9 = r8.f505a
            android.support.constraint.n.k.e$b r6 = android.support.constraint.n.k.e.b.f495b
            r9.b(r6)
            android.support.constraint.n.k.f r9 = r8.f505a
            int r6 = r8.a(r9, r0)
            r9.l(r6)
            android.support.constraint.n.k.f r9 = r8.f505a
            android.support.constraint.n.k.m.n r6 = r9.e
            android.support.constraint.n.k.m.g r6 = r6.e
            int r9 = r9.k()
            r6.a(r9)
        Lf4:
            android.support.constraint.n.k.f r9 = r8.f505a
            android.support.constraint.n.k.e$b[] r9 = r9.Q
            r6 = r9[r2]
            android.support.constraint.n.k.e$b r7 = android.support.constraint.n.k.e.b.f495b
            if (r6 == r7) goto L107
            r9 = r9[r2]
            android.support.constraint.n.k.e$b r6 = android.support.constraint.n.k.e.b.e
            if (r9 != r6) goto L105
            goto L107
        L105:
            r9 = r2
            goto L152
        L107:
            android.support.constraint.n.k.f r9 = r8.f505a
            int r9 = r9.C()
            int r9 = r9 + r4
            android.support.constraint.n.k.f r6 = r8.f505a
            android.support.constraint.n.k.m.l r6 = r6.d
            android.support.constraint.n.k.m.f r6 = r6.i
            r6.a(r9)
            android.support.constraint.n.k.f r6 = r8.f505a
            android.support.constraint.n.k.m.l r6 = r6.d
            android.support.constraint.n.k.m.g r6 = r6.e
            int r9 = r9 - r4
            r6.a(r9)
            r8.d()
            android.support.constraint.n.k.f r9 = r8.f505a
            android.support.constraint.n.k.e$b[] r9 = r9.Q
            r4 = r9[r0]
            android.support.constraint.n.k.e$b r6 = android.support.constraint.n.k.e.b.f495b
            if (r4 == r6) goto L134
            r9 = r9[r0]
            android.support.constraint.n.k.e$b r4 = android.support.constraint.n.k.e.b.e
            if (r9 != r4) goto L14e
        L134:
            android.support.constraint.n.k.f r9 = r8.f505a
            int r9 = r9.k()
            int r9 = r9 + r5
            android.support.constraint.n.k.f r4 = r8.f505a
            android.support.constraint.n.k.m.n r4 = r4.e
            android.support.constraint.n.k.m.f r4 = r4.i
            r4.a(r9)
            android.support.constraint.n.k.f r4 = r8.f505a
            android.support.constraint.n.k.m.n r4 = r4.e
            android.support.constraint.n.k.m.g r4 = r4.e
            int r9 = r9 - r5
            r4.a(r9)
        L14e:
            r8.d()
            r9 = r0
        L152:
            java.util.ArrayList<android.support.constraint.n.k.m.p> r4 = r8.e
            java.util.Iterator r4 = r4.iterator()
        L158:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L173
            java.lang.Object r5 = r4.next()
            android.support.constraint.n.k.m.p r5 = (android.support.constraint.n.k.m.p) r5
            android.support.constraint.n.k.e r6 = r5.f523b
            android.support.constraint.n.k.f r7 = r8.f505a
            if (r6 != r7) goto L16f
            boolean r6 = r5.g
            if (r6 != 0) goto L16f
            goto L158
        L16f:
            r5.b()
            goto L158
        L173:
            java.util.ArrayList<android.support.constraint.n.k.m.p> r4 = r8.e
            java.util.Iterator r4 = r4.iterator()
        L179:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L1b0
            java.lang.Object r5 = r4.next()
            android.support.constraint.n.k.m.p r5 = (android.support.constraint.n.k.m.p) r5
            if (r9 != 0) goto L18e
            android.support.constraint.n.k.e r6 = r5.f523b
            android.support.constraint.n.k.f r7 = r8.f505a
            if (r6 != r7) goto L18e
            goto L179
        L18e:
            android.support.constraint.n.k.m.f r6 = r5.h
            boolean r6 = r6.j
            if (r6 != 0) goto L196
        L194:
            r0 = r2
            goto L1b0
        L196:
            android.support.constraint.n.k.m.f r6 = r5.i
            boolean r6 = r6.j
            if (r6 != 0) goto L1a1
            boolean r6 = r5 instanceof android.support.constraint.n.k.m.j
            if (r6 != 0) goto L1a1
            goto L194
        L1a1:
            android.support.constraint.n.k.m.g r6 = r5.e
            boolean r6 = r6.j
            if (r6 != 0) goto L179
            boolean r6 = r5 instanceof android.support.constraint.n.k.m.c
            if (r6 != 0) goto L179
            boolean r5 = r5 instanceof android.support.constraint.n.k.m.j
            if (r5 != 0) goto L179
            goto L194
        L1b0:
            android.support.constraint.n.k.f r9 = r8.f505a
            r9.a(r1)
            android.support.constraint.n.k.f r8 = r8.f505a
            r8.b(r3)
            return r0
    }

    public boolean a(boolean r10, int r11) {
            r9 = this;
            r0 = 1
            r10 = r10 & r0
            android.support.constraint.n.k.f r1 = r9.f505a
            r2 = 0
            android.support.constraint.n.k.e$b r1 = r1.b(r2)
            android.support.constraint.n.k.f r3 = r9.f505a
            android.support.constraint.n.k.e$b r3 = r3.b(r0)
            android.support.constraint.n.k.f r4 = r9.f505a
            int r4 = r4.D()
            android.support.constraint.n.k.f r5 = r9.f505a
            int r5 = r5.E()
            if (r10 == 0) goto L86
            android.support.constraint.n.k.e$b r6 = android.support.constraint.n.k.e.b.f496c
            if (r1 == r6) goto L23
            if (r3 != r6) goto L86
        L23:
            java.util.ArrayList<android.support.constraint.n.k.m.p> r6 = r9.e
            java.util.Iterator r6 = r6.iterator()
        L29:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L40
            java.lang.Object r7 = r6.next()
            android.support.constraint.n.k.m.p r7 = (android.support.constraint.n.k.m.p) r7
            int r8 = r7.f
            if (r8 != r11) goto L29
            boolean r7 = r7.f()
            if (r7 != 0) goto L29
            r10 = r2
        L40:
            if (r11 != 0) goto L63
            if (r10 == 0) goto L86
            android.support.constraint.n.k.e$b r10 = android.support.constraint.n.k.e.b.f496c
            if (r1 != r10) goto L86
            android.support.constraint.n.k.f r10 = r9.f505a
            android.support.constraint.n.k.e$b r6 = android.support.constraint.n.k.e.b.f495b
            r10.a(r6)
            android.support.constraint.n.k.f r10 = r9.f505a
            int r6 = r9.a(r10, r2)
            r10.t(r6)
            android.support.constraint.n.k.f r10 = r9.f505a
            android.support.constraint.n.k.m.l r6 = r10.d
            android.support.constraint.n.k.m.g r6 = r6.e
            int r10 = r10.C()
            goto L83
        L63:
            if (r10 == 0) goto L86
            android.support.constraint.n.k.e$b r10 = android.support.constraint.n.k.e.b.f496c
            if (r3 != r10) goto L86
            android.support.constraint.n.k.f r10 = r9.f505a
            android.support.constraint.n.k.e$b r6 = android.support.constraint.n.k.e.b.f495b
            r10.b(r6)
            android.support.constraint.n.k.f r10 = r9.f505a
            int r6 = r9.a(r10, r0)
            r10.l(r6)
            android.support.constraint.n.k.f r10 = r9.f505a
            android.support.constraint.n.k.m.n r6 = r10.e
            android.support.constraint.n.k.m.g r6 = r6.e
            int r10 = r10.k()
        L83:
            r6.a(r10)
        L86:
            android.support.constraint.n.k.f r10 = r9.f505a
            android.support.constraint.n.k.e$b[] r10 = r10.Q
            if (r11 != 0) goto Lb3
            r5 = r10[r2]
            android.support.constraint.n.k.e$b r6 = android.support.constraint.n.k.e.b.f495b
            if (r5 == r6) goto L98
            r10 = r10[r2]
            android.support.constraint.n.k.e$b r5 = android.support.constraint.n.k.e.b.e
            if (r10 != r5) goto Lc0
        L98:
            android.support.constraint.n.k.f r10 = r9.f505a
            int r10 = r10.C()
            int r10 = r10 + r4
            android.support.constraint.n.k.f r5 = r9.f505a
            android.support.constraint.n.k.m.l r5 = r5.d
            android.support.constraint.n.k.m.f r5 = r5.i
            r5.a(r10)
            android.support.constraint.n.k.f r5 = r9.f505a
            android.support.constraint.n.k.m.l r5 = r5.d
            android.support.constraint.n.k.m.g r5 = r5.e
            int r10 = r10 - r4
            r5.a(r10)
            goto Ldc
        Lb3:
            r4 = r10[r0]
            android.support.constraint.n.k.e$b r6 = android.support.constraint.n.k.e.b.f495b
            if (r4 == r6) goto Lc2
            r10 = r10[r0]
            android.support.constraint.n.k.e$b r4 = android.support.constraint.n.k.e.b.e
            if (r10 != r4) goto Lc0
            goto Lc2
        Lc0:
            r10 = r2
            goto Ldd
        Lc2:
            android.support.constraint.n.k.f r10 = r9.f505a
            int r10 = r10.k()
            int r10 = r10 + r5
            android.support.constraint.n.k.f r4 = r9.f505a
            android.support.constraint.n.k.m.n r4 = r4.e
            android.support.constraint.n.k.m.f r4 = r4.i
            r4.a(r10)
            android.support.constraint.n.k.f r4 = r9.f505a
            android.support.constraint.n.k.m.n r4 = r4.e
            android.support.constraint.n.k.m.g r4 = r4.e
            int r10 = r10 - r5
            r4.a(r10)
        Ldc:
            r10 = r0
        Ldd:
            r9.d()
            java.util.ArrayList<android.support.constraint.n.k.m.p> r4 = r9.e
            java.util.Iterator r4 = r4.iterator()
        Le6:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L106
            java.lang.Object r5 = r4.next()
            android.support.constraint.n.k.m.p r5 = (android.support.constraint.n.k.m.p) r5
            int r6 = r5.f
            if (r6 == r11) goto Lf7
            goto Le6
        Lf7:
            android.support.constraint.n.k.e r6 = r5.f523b
            android.support.constraint.n.k.f r7 = r9.f505a
            if (r6 != r7) goto L102
            boolean r6 = r5.g
            if (r6 != 0) goto L102
            goto Le6
        L102:
            r5.b()
            goto Le6
        L106:
            java.util.ArrayList<android.support.constraint.n.k.m.p> r4 = r9.e
            java.util.Iterator r4 = r4.iterator()
        L10c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L140
            java.lang.Object r5 = r4.next()
            android.support.constraint.n.k.m.p r5 = (android.support.constraint.n.k.m.p) r5
            int r6 = r5.f
            if (r6 == r11) goto L11d
            goto L10c
        L11d:
            if (r10 != 0) goto L126
            android.support.constraint.n.k.e r6 = r5.f523b
            android.support.constraint.n.k.f r7 = r9.f505a
            if (r6 != r7) goto L126
            goto L10c
        L126:
            android.support.constraint.n.k.m.f r6 = r5.h
            boolean r6 = r6.j
            if (r6 != 0) goto L12e
        L12c:
            r0 = r2
            goto L140
        L12e:
            android.support.constraint.n.k.m.f r6 = r5.i
            boolean r6 = r6.j
            if (r6 != 0) goto L135
            goto L12c
        L135:
            boolean r6 = r5 instanceof android.support.constraint.n.k.m.c
            if (r6 != 0) goto L10c
            android.support.constraint.n.k.m.g r5 = r5.e
            boolean r5 = r5.j
            if (r5 != 0) goto L10c
            goto L12c
        L140:
            android.support.constraint.n.k.f r10 = r9.f505a
            r10.a(r1)
            android.support.constraint.n.k.f r9 = r9.f505a
            r9.b(r3)
            return r0
    }

    public void b() {
            r1 = this;
            r0 = 1
            r1.f506b = r0
            return
    }

    public boolean b(boolean r5) {
            r4 = this;
            boolean r5 = r4.f506b
            r0 = 0
            if (r5 == 0) goto L59
            android.support.constraint.n.k.f r5 = r4.f505a
            java.util.ArrayList<android.support.constraint.n.k.e> r5 = r5.p0
            java.util.Iterator r5 = r5.iterator()
        Ld:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L35
            java.lang.Object r1 = r5.next()
            android.support.constraint.n.k.e r1 = (android.support.constraint.n.k.e) r1
            r1.d()
            r1.f490a = r0
            android.support.constraint.n.k.m.l r2 = r1.d
            android.support.constraint.n.k.m.g r3 = r2.e
            r3.j = r0
            r2.g = r0
            r2.g()
            android.support.constraint.n.k.m.n r1 = r1.e
            android.support.constraint.n.k.m.g r2 = r1.e
            r2.j = r0
            r1.g = r0
            r1.g()
            goto Ld
        L35:
            android.support.constraint.n.k.f r5 = r4.f505a
            r5.d()
            android.support.constraint.n.k.f r5 = r4.f505a
            r5.f490a = r0
            android.support.constraint.n.k.m.l r5 = r5.d
            android.support.constraint.n.k.m.g r1 = r5.e
            r1.j = r0
            r5.g = r0
            r5.g()
            android.support.constraint.n.k.f r5 = r4.f505a
            android.support.constraint.n.k.m.n r5 = r5.e
            android.support.constraint.n.k.m.g r1 = r5.e
            r1.j = r0
            r5.g = r0
            r5.g()
            r4.a()
        L59:
            android.support.constraint.n.k.f r5 = r4.d
            boolean r5 = r4.a(r5)
            if (r5 == 0) goto L62
            return r0
        L62:
            android.support.constraint.n.k.f r5 = r4.f505a
            r5.u(r0)
            android.support.constraint.n.k.f r5 = r4.f505a
            r5.v(r0)
            android.support.constraint.n.k.f r5 = r4.f505a
            android.support.constraint.n.k.m.l r5 = r5.d
            android.support.constraint.n.k.m.f r5 = r5.h
            r5.a(r0)
            android.support.constraint.n.k.f r4 = r4.f505a
            android.support.constraint.n.k.m.n r4 = r4.e
            android.support.constraint.n.k.m.f r4 = r4.h
            r4.a(r0)
            r4 = 1
            return r4
    }

    public void c() {
            r1 = this;
            r0 = 1
            r1.f507c = r0
            return
    }

    public void d() {
            r11 = this;
            android.support.constraint.n.k.f r0 = r11.f505a
            java.util.ArrayList<android.support.constraint.n.k.e> r0 = r0.p0
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Ld5
            java.lang.Object r1 = r0.next()
            android.support.constraint.n.k.e r1 = (android.support.constraint.n.k.e) r1
            boolean r2 = r1.f490a
            if (r2 == 0) goto L19
            goto L8
        L19:
            android.support.constraint.n.k.e$b[] r2 = r1.Q
            r3 = 0
            r8 = r2[r3]
            r9 = 1
            r10 = r2[r9]
            int r2 = r1.n
            int r4 = r1.o
            android.support.constraint.n.k.e$b r5 = android.support.constraint.n.k.e.b.f496c
            if (r8 == r5) goto L32
            android.support.constraint.n.k.e$b r5 = android.support.constraint.n.k.e.b.d
            if (r8 != r5) goto L30
            if (r2 != r9) goto L30
            goto L32
        L30:
            r2 = r3
            goto L33
        L32:
            r2 = r9
        L33:
            android.support.constraint.n.k.e$b r5 = android.support.constraint.n.k.e.b.f496c
            if (r10 == r5) goto L3d
            android.support.constraint.n.k.e$b r5 = android.support.constraint.n.k.e.b.d
            if (r10 != r5) goto L3e
            if (r4 != r9) goto L3e
        L3d:
            r3 = r9
        L3e:
            android.support.constraint.n.k.m.l r4 = r1.d
            android.support.constraint.n.k.m.g r4 = r4.e
            boolean r5 = r4.j
            android.support.constraint.n.k.m.n r6 = r1.e
            android.support.constraint.n.k.m.g r6 = r6.e
            boolean r7 = r6.j
            if (r5 == 0) goto L5f
            if (r7 == 0) goto L5f
            android.support.constraint.n.k.e$b r7 = android.support.constraint.n.k.e.b.f495b
            int r5 = r4.g
            int r8 = r6.g
            r2 = r11
            r3 = r1
            r4 = r7
            r6 = r7
            r7 = r8
            r2.a(r3, r4, r5, r6, r7)
        L5c:
            r1.f490a = r9
            goto Lc2
        L5f:
            if (r5 == 0) goto L93
            if (r3 == 0) goto L93
            android.support.constraint.n.k.e$b r4 = android.support.constraint.n.k.e.b.f495b
            android.support.constraint.n.k.m.l r2 = r1.d
            android.support.constraint.n.k.m.g r2 = r2.e
            int r5 = r2.g
            android.support.constraint.n.k.e$b r6 = android.support.constraint.n.k.e.b.f496c
            android.support.constraint.n.k.m.n r2 = r1.e
            android.support.constraint.n.k.m.g r2 = r2.e
            int r7 = r2.g
            r2 = r11
            r3 = r1
            r2.a(r3, r4, r5, r6, r7)
            android.support.constraint.n.k.e$b r2 = android.support.constraint.n.k.e.b.d
            if (r10 != r2) goto L87
            android.support.constraint.n.k.m.n r2 = r1.e
            android.support.constraint.n.k.m.g r2 = r2.e
            int r3 = r1.k()
        L84:
            r2.m = r3
            goto Lc2
        L87:
            android.support.constraint.n.k.m.n r2 = r1.e
            android.support.constraint.n.k.m.g r2 = r2.e
            int r3 = r1.k()
        L8f:
            r2.a(r3)
            goto L5c
        L93:
            if (r7 == 0) goto Lc2
            if (r2 == 0) goto Lc2
            android.support.constraint.n.k.e$b r4 = android.support.constraint.n.k.e.b.f496c
            android.support.constraint.n.k.m.l r2 = r1.d
            android.support.constraint.n.k.m.g r2 = r2.e
            int r5 = r2.g
            android.support.constraint.n.k.e$b r6 = android.support.constraint.n.k.e.b.f495b
            android.support.constraint.n.k.m.n r2 = r1.e
            android.support.constraint.n.k.m.g r2 = r2.e
            int r7 = r2.g
            r2 = r11
            r3 = r1
            r2.a(r3, r4, r5, r6, r7)
            android.support.constraint.n.k.e$b r2 = android.support.constraint.n.k.e.b.d
            if (r8 != r2) goto Lb9
            android.support.constraint.n.k.m.l r2 = r1.d
            android.support.constraint.n.k.m.g r2 = r2.e
            int r3 = r1.C()
            goto L84
        Lb9:
            android.support.constraint.n.k.m.l r2 = r1.d
            android.support.constraint.n.k.m.g r2 = r2.e
            int r3 = r1.C()
            goto L8f
        Lc2:
            boolean r2 = r1.f490a
            if (r2 == 0) goto L8
            android.support.constraint.n.k.m.n r2 = r1.e
            android.support.constraint.n.k.m.g r2 = r2.l
            if (r2 == 0) goto L8
            int r1 = r1.e()
            r2.a(r1)
            goto L8
        Ld5:
            return
    }
}
