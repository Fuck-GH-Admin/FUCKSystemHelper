package android.support.constraint.n.k.m;

/* JADX INFO: loaded from: classes.dex */
public class c extends android.support.constraint.n.k.m.p {
    java.util.ArrayList<android.support.constraint.n.k.m.p> k;
    private int l;

    public c(android.support.constraint.n.k.e r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.k = r1
            r0.f = r2
            r0.g()
            return
    }

    private void g() {
            r5 = this;
            android.support.constraint.n.k.e r0 = r5.f523b
        L2:
            int r1 = r5.f
            android.support.constraint.n.k.e r1 = r0.e(r1)
            r4 = r1
            r1 = r0
            r0 = r4
            if (r0 == 0) goto Le
            goto L2
        Le:
            r5.f523b = r1
            java.util.ArrayList<android.support.constraint.n.k.m.p> r0 = r5.k
            int r2 = r5.f
            android.support.constraint.n.k.m.p r2 = r1.f(r2)
            r0.add(r2)
            int r0 = r5.f
            android.support.constraint.n.k.e r0 = r1.d(r0)
        L21:
            if (r0 == 0) goto L35
            java.util.ArrayList<android.support.constraint.n.k.m.p> r1 = r5.k
            int r2 = r5.f
            android.support.constraint.n.k.m.p r2 = r0.f(r2)
            r1.add(r2)
            int r1 = r5.f
            android.support.constraint.n.k.e r0 = r0.d(r1)
            goto L21
        L35:
            java.util.ArrayList<android.support.constraint.n.k.m.p> r0 = r5.k
            java.util.Iterator r0 = r0.iterator()
        L3b:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L58
            java.lang.Object r1 = r0.next()
            android.support.constraint.n.k.m.p r1 = (android.support.constraint.n.k.m.p) r1
            int r3 = r5.f
            if (r3 != 0) goto L51
            android.support.constraint.n.k.e r1 = r1.f523b
            r1.f491b = r5
            goto L3b
        L51:
            if (r3 != r2) goto L3b
            android.support.constraint.n.k.e r1 = r1.f523b
            r1.f492c = r5
            goto L3b
        L58:
            int r0 = r5.f
            if (r0 != 0) goto L6c
            android.support.constraint.n.k.e r0 = r5.f523b
            android.support.constraint.n.k.e r0 = r0.v()
            android.support.constraint.n.k.f r0 = (android.support.constraint.n.k.f) r0
            boolean r0 = r0.a0()
            if (r0 == 0) goto L6c
            r0 = r2
            goto L6d
        L6c:
            r0 = 0
        L6d:
            if (r0 == 0) goto L88
            java.util.ArrayList<android.support.constraint.n.k.m.p> r0 = r5.k
            int r0 = r0.size()
            if (r0 <= r2) goto L88
            java.util.ArrayList<android.support.constraint.n.k.m.p> r0 = r5.k
            int r1 = r0.size()
            int r1 = r1 - r2
            java.lang.Object r0 = r0.get(r1)
            android.support.constraint.n.k.m.p r0 = (android.support.constraint.n.k.m.p) r0
            android.support.constraint.n.k.e r0 = r0.f523b
            r5.f523b = r0
        L88:
            int r0 = r5.f
            if (r0 != 0) goto L93
            android.support.constraint.n.k.e r0 = r5.f523b
            int r0 = r0.m()
            goto L99
        L93:
            android.support.constraint.n.k.e r0 = r5.f523b
            int r0 = r0.y()
        L99:
            r5.l = r0
            return
    }

    private android.support.constraint.n.k.e h() {
            r4 = this;
            r0 = 0
        L1:
            java.util.ArrayList<android.support.constraint.n.k.m.p> r1 = r4.k
            int r1 = r1.size()
            if (r0 >= r1) goto L21
            java.util.ArrayList<android.support.constraint.n.k.m.p> r1 = r4.k
            java.lang.Object r1 = r1.get(r0)
            android.support.constraint.n.k.m.p r1 = (android.support.constraint.n.k.m.p) r1
            android.support.constraint.n.k.e r2 = r1.f523b
            int r2 = r2.B()
            r3 = 8
            if (r2 == r3) goto L1e
            android.support.constraint.n.k.e r4 = r1.f523b
            return r4
        L1e:
            int r0 = r0 + 1
            goto L1
        L21:
            r4 = 0
            return r4
    }

    private android.support.constraint.n.k.e i() {
            r4 = this;
            java.util.ArrayList<android.support.constraint.n.k.m.p> r0 = r4.k
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L22
            java.util.ArrayList<android.support.constraint.n.k.m.p> r1 = r4.k
            java.lang.Object r1 = r1.get(r0)
            android.support.constraint.n.k.m.p r1 = (android.support.constraint.n.k.m.p) r1
            android.support.constraint.n.k.e r2 = r1.f523b
            int r2 = r2.B()
            r3 = 8
            if (r2 == r3) goto L1f
            android.support.constraint.n.k.e r4 = r1.f523b
            return r4
        L1f:
            int r0 = r0 + (-1)
            goto L8
        L22:
            r4 = 0
            return r4
    }

    @Override // android.support.constraint.n.k.m.p
    void a() {
            r5 = this;
            java.util.ArrayList<android.support.constraint.n.k.m.p> r0 = r5.k
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            android.support.constraint.n.k.m.p r1 = (android.support.constraint.n.k.m.p) r1
            r1.a()
            goto L6
        L16:
            java.util.ArrayList<android.support.constraint.n.k.m.p> r0 = r5.k
            int r0 = r0.size()
            r1 = 1
            if (r0 >= r1) goto L20
            return
        L20:
            java.util.ArrayList<android.support.constraint.n.k.m.p> r2 = r5.k
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            android.support.constraint.n.k.m.p r2 = (android.support.constraint.n.k.m.p) r2
            android.support.constraint.n.k.e r2 = r2.f523b
            java.util.ArrayList<android.support.constraint.n.k.m.p> r4 = r5.k
            int r0 = r0 - r1
            java.lang.Object r0 = r4.get(r0)
            android.support.constraint.n.k.m.p r0 = (android.support.constraint.n.k.m.p) r0
            android.support.constraint.n.k.e r0 = r0.f523b
            int r4 = r5.f
            if (r4 != 0) goto L70
            android.support.constraint.n.k.d r1 = r2.F
            android.support.constraint.n.k.d r0 = r0.H
            android.support.constraint.n.k.m.f r2 = r5.a(r1, r3)
            int r1 = r1.c()
            android.support.constraint.n.k.e r4 = r5.h()
            if (r4 == 0) goto L52
            android.support.constraint.n.k.d r1 = r4.F
            int r1 = r1.c()
        L52:
            if (r2 == 0) goto L59
            android.support.constraint.n.k.m.f r4 = r5.h
            r5.a(r4, r2, r1)
        L59:
            android.support.constraint.n.k.m.f r1 = r5.a(r0, r3)
            int r0 = r0.c()
            android.support.constraint.n.k.e r2 = r5.i()
            if (r2 == 0) goto L6d
            android.support.constraint.n.k.d r0 = r2.H
            int r0 = r0.c()
        L6d:
            if (r1 == 0) goto Lab
            goto La5
        L70:
            android.support.constraint.n.k.d r2 = r2.G
            android.support.constraint.n.k.d r0 = r0.I
            android.support.constraint.n.k.m.f r3 = r5.a(r2, r1)
            int r2 = r2.c()
            android.support.constraint.n.k.e r4 = r5.h()
            if (r4 == 0) goto L88
            android.support.constraint.n.k.d r2 = r4.G
            int r2 = r2.c()
        L88:
            if (r3 == 0) goto L8f
            android.support.constraint.n.k.m.f r4 = r5.h
            r5.a(r4, r3, r2)
        L8f:
            android.support.constraint.n.k.m.f r1 = r5.a(r0, r1)
            int r0 = r0.c()
            android.support.constraint.n.k.e r2 = r5.i()
            if (r2 == 0) goto La3
            android.support.constraint.n.k.d r0 = r2.I
            int r0 = r0.c()
        La3:
            if (r1 == 0) goto Lab
        La5:
            android.support.constraint.n.k.m.f r2 = r5.i
            int r0 = -r0
            r5.a(r2, r1, r0)
        Lab:
            android.support.constraint.n.k.m.f r0 = r5.h
            r0.f508a = r5
            android.support.constraint.n.k.m.f r0 = r5.i
            r0.f508a = r5
            return
    }

    @Override // android.support.constraint.n.k.m.p, android.support.constraint.n.k.m.d
    public void a(android.support.constraint.n.k.m.d r23) {
            r22 = this;
            r0 = r22
            android.support.constraint.n.k.m.f r1 = r0.h
            boolean r1 = r1.j
            if (r1 == 0) goto L3f2
            android.support.constraint.n.k.m.f r1 = r0.i
            boolean r1 = r1.j
            if (r1 != 0) goto L10
            goto L3f2
        L10:
            android.support.constraint.n.k.e r1 = r0.f523b
            android.support.constraint.n.k.e r1 = r1.v()
            if (r1 == 0) goto L23
            boolean r3 = r1 instanceof android.support.constraint.n.k.f
            if (r3 == 0) goto L23
            android.support.constraint.n.k.f r1 = (android.support.constraint.n.k.f) r1
            boolean r1 = r1.a0()
            goto L24
        L23:
            r1 = 0
        L24:
            android.support.constraint.n.k.m.f r3 = r0.i
            int r3 = r3.g
            android.support.constraint.n.k.m.f r4 = r0.h
            int r4 = r4.g
            int r3 = r3 - r4
            java.util.ArrayList<android.support.constraint.n.k.m.p> r4 = r0.k
            int r4 = r4.size()
            r5 = 0
        L34:
            r6 = -1
            r7 = 8
            if (r5 >= r4) goto L4c
            java.util.ArrayList<android.support.constraint.n.k.m.p> r8 = r0.k
            java.lang.Object r8 = r8.get(r5)
            android.support.constraint.n.k.m.p r8 = (android.support.constraint.n.k.m.p) r8
            android.support.constraint.n.k.e r8 = r8.f523b
            int r8 = r8.B()
            if (r8 != r7) goto L4d
            int r5 = r5 + 1
            goto L34
        L4c:
            r5 = r6
        L4d:
            int r8 = r4 + (-1)
            r9 = r8
        L50:
            if (r9 < 0) goto L66
            java.util.ArrayList<android.support.constraint.n.k.m.p> r10 = r0.k
            java.lang.Object r10 = r10.get(r9)
            android.support.constraint.n.k.m.p r10 = (android.support.constraint.n.k.m.p) r10
            android.support.constraint.n.k.e r10 = r10.f523b
            int r10 = r10.B()
            if (r10 != r7) goto L65
            int r9 = r9 + (-1)
            goto L50
        L65:
            r6 = r9
        L66:
            r9 = 0
        L67:
            r11 = 2
            r12 = 1
            if (r9 >= r11) goto L106
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L72:
            if (r13 >= r4) goto Lf8
            java.util.ArrayList<android.support.constraint.n.k.m.p> r2 = r0.k
            java.lang.Object r2 = r2.get(r13)
            android.support.constraint.n.k.m.p r2 = (android.support.constraint.n.k.m.p) r2
            android.support.constraint.n.k.e r11 = r2.f523b
            int r11 = r11.B()
            if (r11 != r7) goto L86
            goto Lf1
        L86:
            int r16 = r16 + 1
            if (r13 <= 0) goto L91
            if (r13 < r5) goto L91
            android.support.constraint.n.k.m.f r11 = r2.h
            int r11 = r11.f
            int r14 = r14 + r11
        L91:
            android.support.constraint.n.k.m.g r11 = r2.e
            int r11 = r11.g
            android.support.constraint.n.k.e$b r7 = r2.d
            android.support.constraint.n.k.e$b r10 = android.support.constraint.n.k.e.b.d
            if (r7 == r10) goto L9d
            r7 = r12
            goto L9e
        L9d:
            r7 = 0
        L9e:
            if (r7 == 0) goto Lbe
            int r10 = r0.f
            if (r10 != 0) goto Laf
            android.support.constraint.n.k.e r10 = r2.f523b
            android.support.constraint.n.k.m.l r10 = r10.d
            android.support.constraint.n.k.m.g r10 = r10.e
            boolean r10 = r10.j
            if (r10 != 0) goto Laf
            return
        Laf:
            int r10 = r0.f
            if (r10 != r12) goto Ld2
            android.support.constraint.n.k.e r10 = r2.f523b
            android.support.constraint.n.k.m.n r10 = r10.e
            android.support.constraint.n.k.m.g r10 = r10.e
            boolean r10 = r10.j
            if (r10 != 0) goto Ld2
            return
        Lbe:
            int r10 = r2.f522a
            if (r10 != r12) goto Lcb
            if (r9 != 0) goto Lcb
            android.support.constraint.n.k.m.g r7 = r2.e
            int r11 = r7.m
            int r15 = r15 + 1
            goto Ld1
        Lcb:
            android.support.constraint.n.k.m.g r10 = r2.e
            boolean r10 = r10.j
            if (r10 == 0) goto Ld2
        Ld1:
            r7 = r12
        Ld2:
            if (r7 != 0) goto Le6
            int r15 = r15 + 1
            android.support.constraint.n.k.e r7 = r2.f523b
            float[] r7 = r7.j0
            int r10 = r0.f
            r7 = r7[r10]
            r10 = 0
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 < 0) goto Le7
            float r17 = r17 + r7
            goto Le7
        Le6:
            int r14 = r14 + r11
        Le7:
            if (r13 >= r8) goto Lf1
            if (r13 >= r6) goto Lf1
            android.support.constraint.n.k.m.f r2 = r2.i
            int r2 = r2.f
            int r2 = -r2
            int r14 = r14 + r2
        Lf1:
            int r13 = r13 + 1
            r7 = 8
            r11 = 2
            goto L72
        Lf8:
            if (r14 < r3) goto L103
            if (r15 != 0) goto Lfd
            goto L103
        Lfd:
            int r9 = r9 + 1
            r7 = 8
            goto L67
        L103:
            r2 = r16
            goto L10b
        L106:
            r2 = 0
            r14 = 0
            r15 = 0
            r17 = 0
        L10b:
            android.support.constraint.n.k.m.f r7 = r0.h
            int r7 = r7.g
            if (r1 == 0) goto L115
            android.support.constraint.n.k.m.f r7 = r0.i
            int r7 = r7.g
        L115:
            r9 = 1056964608(0x3f000000, float:0.5)
            if (r14 <= r3) goto L126
            r10 = 1073741824(0x40000000, float:2.0)
            int r11 = r14 - r3
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            if (r1 == 0) goto L125
            int r7 = r7 + r10
            goto L126
        L125:
            int r7 = r7 - r10
        L126:
            if (r15 <= 0) goto L22a
            int r10 = r3 - r14
            float r10 = (float) r10
            float r11 = (float) r15
            float r11 = r10 / r11
            float r11 = r11 + r9
            int r11 = (int) r11
            r13 = 0
            r16 = 0
        L133:
            if (r13 >= r4) goto L1df
            java.util.ArrayList<android.support.constraint.n.k.m.p> r12 = r0.k
            java.lang.Object r12 = r12.get(r13)
            android.support.constraint.n.k.m.p r12 = (android.support.constraint.n.k.m.p) r12
            android.support.constraint.n.k.e r9 = r12.f523b
            int r9 = r9.B()
            r18 = r11
            r11 = 8
            if (r9 != r11) goto L14b
            goto L1ca
        L14b:
            android.support.constraint.n.k.e$b r9 = r12.d
            android.support.constraint.n.k.e$b r11 = android.support.constraint.n.k.e.b.d
            if (r9 != r11) goto L1ca
            android.support.constraint.n.k.m.g r9 = r12.e
            boolean r9 = r9.j
            if (r9 != 0) goto L1ca
            r9 = 0
            int r11 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r11 <= 0) goto L16c
            android.support.constraint.n.k.e r11 = r12.f523b
            float[] r11 = r11.j0
            int r9 = r0.f
            r9 = r11[r9]
            float r9 = r9 * r10
            float r9 = r9 / r17
            r11 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 + r11
            int r9 = (int) r9
            goto L16e
        L16c:
            r9 = r18
        L16e:
            int r11 = r0.f
            if (r11 != 0) goto L19a
            android.support.constraint.n.k.e r11 = r12.f523b
            r19 = r10
            int r10 = r11.r
            int r11 = r11.q
            r20 = r14
            int r14 = r12.f522a
            r21 = r7
            r7 = 1
            if (r14 != r7) goto L18c
            android.support.constraint.n.k.m.g r7 = r12.e
            int r7 = r7.m
            int r7 = java.lang.Math.min(r9, r7)
            goto L18d
        L18c:
            r7 = r9
        L18d:
            int r7 = java.lang.Math.max(r11, r7)
            if (r10 <= 0) goto L197
            int r7 = java.lang.Math.min(r10, r7)
        L197:
            if (r7 == r9) goto L1c4
            goto L1c1
        L19a:
            r21 = r7
            r19 = r10
            r20 = r14
            android.support.constraint.n.k.e r7 = r12.f523b
            int r10 = r7.u
            int r7 = r7.t
            int r11 = r12.f522a
            r14 = 1
            if (r11 != r14) goto L1b4
            android.support.constraint.n.k.m.g r11 = r12.e
            int r11 = r11.m
            int r11 = java.lang.Math.min(r9, r11)
            goto L1b5
        L1b4:
            r11 = r9
        L1b5:
            int r7 = java.lang.Math.max(r7, r11)
            if (r10 <= 0) goto L1bf
            int r7 = java.lang.Math.min(r10, r7)
        L1bf:
            if (r7 == r9) goto L1c4
        L1c1:
            int r16 = r16 + 1
            r9 = r7
        L1c4:
            android.support.constraint.n.k.m.g r7 = r12.e
            r7.a(r9)
            goto L1d0
        L1ca:
            r21 = r7
            r19 = r10
            r20 = r14
        L1d0:
            int r13 = r13 + 1
            r11 = r18
            r10 = r19
            r14 = r20
            r7 = r21
            r9 = 1056964608(0x3f000000, float:0.5)
            r12 = 1
            goto L133
        L1df:
            r21 = r7
            r20 = r14
            if (r16 <= 0) goto L21b
            int r15 = r15 - r16
            r7 = 0
            r9 = 0
        L1e9:
            if (r7 >= r4) goto L219
            java.util.ArrayList<android.support.constraint.n.k.m.p> r10 = r0.k
            java.lang.Object r10 = r10.get(r7)
            android.support.constraint.n.k.m.p r10 = (android.support.constraint.n.k.m.p) r10
            android.support.constraint.n.k.e r11 = r10.f523b
            int r11 = r11.B()
            r12 = 8
            if (r11 != r12) goto L1fe
            goto L216
        L1fe:
            if (r7 <= 0) goto L207
            if (r7 < r5) goto L207
            android.support.constraint.n.k.m.f r11 = r10.h
            int r11 = r11.f
            int r9 = r9 + r11
        L207:
            android.support.constraint.n.k.m.g r11 = r10.e
            int r11 = r11.g
            int r9 = r9 + r11
            if (r7 >= r8) goto L216
            if (r7 >= r6) goto L216
            android.support.constraint.n.k.m.f r10 = r10.i
            int r10 = r10.f
            int r10 = -r10
            int r9 = r9 + r10
        L216:
            int r7 = r7 + 1
            goto L1e9
        L219:
            r14 = r9
            goto L21d
        L21b:
            r14 = r20
        L21d:
            int r7 = r0.l
            r9 = 2
            if (r7 != r9) goto L228
            if (r16 != 0) goto L228
            r7 = 0
            r0.l = r7
            goto L230
        L228:
            r7 = 0
            goto L230
        L22a:
            r21 = r7
            r20 = r14
            r7 = 0
            r9 = 2
        L230:
            if (r14 <= r3) goto L234
            r0.l = r9
        L234:
            if (r2 <= 0) goto L23c
            if (r15 != 0) goto L23c
            if (r5 != r6) goto L23c
            r0.l = r9
        L23c:
            int r9 = r0.l
            r10 = 1
            if (r9 != r10) goto L2cd
            if (r2 <= r10) goto L247
            int r3 = r3 - r14
            int r2 = r2 - r10
            int r3 = r3 / r2
            goto L24e
        L247:
            if (r2 != r10) goto L24d
            int r3 = r3 - r14
            r2 = 2
            int r3 = r3 / r2
            goto L24e
        L24d:
            r3 = r7
        L24e:
            if (r15 <= 0) goto L251
            r3 = r7
        L251:
            r2 = r7
            r7 = r21
        L254:
            if (r2 >= r4) goto L3f2
            if (r1 == 0) goto L25d
            int r9 = r2 + 1
            int r9 = r4 - r9
            goto L25e
        L25d:
            r9 = r2
        L25e:
            java.util.ArrayList<android.support.constraint.n.k.m.p> r10 = r0.k
            java.lang.Object r9 = r10.get(r9)
            android.support.constraint.n.k.m.p r9 = (android.support.constraint.n.k.m.p) r9
            android.support.constraint.n.k.e r10 = r9.f523b
            int r10 = r10.B()
            r11 = 8
            if (r10 != r11) goto L27b
            android.support.constraint.n.k.m.f r10 = r9.h
            r10.a(r7)
            android.support.constraint.n.k.m.f r9 = r9.i
            r9.a(r7)
            goto L2ca
        L27b:
            if (r2 <= 0) goto L282
            if (r1 == 0) goto L281
            int r7 = r7 - r3
            goto L282
        L281:
            int r7 = r7 + r3
        L282:
            if (r2 <= 0) goto L28f
            if (r2 < r5) goto L28f
            android.support.constraint.n.k.m.f r10 = r9.h
            int r10 = r10.f
            if (r1 == 0) goto L28e
            int r7 = r7 - r10
            goto L28f
        L28e:
            int r7 = r7 + r10
        L28f:
            if (r1 == 0) goto L294
            android.support.constraint.n.k.m.f r10 = r9.i
            goto L296
        L294:
            android.support.constraint.n.k.m.f r10 = r9.h
        L296:
            r10.a(r7)
            android.support.constraint.n.k.m.g r10 = r9.e
            int r11 = r10.g
            android.support.constraint.n.k.e$b r12 = r9.d
            android.support.constraint.n.k.e$b r13 = android.support.constraint.n.k.e.b.d
            if (r12 != r13) goto L2aa
            int r12 = r9.f522a
            r13 = 1
            if (r12 != r13) goto L2aa
            int r11 = r10.m
        L2aa:
            if (r1 == 0) goto L2ae
            int r7 = r7 - r11
            goto L2af
        L2ae:
            int r7 = r7 + r11
        L2af:
            if (r1 == 0) goto L2b4
            android.support.constraint.n.k.m.f r10 = r9.h
            goto L2b6
        L2b4:
            android.support.constraint.n.k.m.f r10 = r9.i
        L2b6:
            r10.a(r7)
            r10 = 1
            r9.g = r10
            if (r2 >= r8) goto L2ca
            if (r2 >= r6) goto L2ca
            android.support.constraint.n.k.m.f r9 = r9.i
            int r9 = r9.f
            int r9 = -r9
            if (r1 == 0) goto L2c9
            int r7 = r7 - r9
            goto L2ca
        L2c9:
            int r7 = r7 + r9
        L2ca:
            int r2 = r2 + 1
            goto L254
        L2cd:
            if (r9 != 0) goto L351
            int r3 = r3 - r14
            r9 = 1
            int r2 = r2 + r9
            int r3 = r3 / r2
            if (r15 <= 0) goto L2d6
            r3 = r7
        L2d6:
            r2 = r7
            r7 = r21
        L2d9:
            if (r2 >= r4) goto L3f2
            if (r1 == 0) goto L2e2
            int r9 = r2 + 1
            int r9 = r4 - r9
            goto L2e3
        L2e2:
            r9 = r2
        L2e3:
            java.util.ArrayList<android.support.constraint.n.k.m.p> r10 = r0.k
            java.lang.Object r9 = r10.get(r9)
            android.support.constraint.n.k.m.p r9 = (android.support.constraint.n.k.m.p) r9
            android.support.constraint.n.k.e r10 = r9.f523b
            int r10 = r10.B()
            r11 = 8
            if (r10 != r11) goto L300
            android.support.constraint.n.k.m.f r10 = r9.h
            r10.a(r7)
            android.support.constraint.n.k.m.f r9 = r9.i
            r9.a(r7)
            goto L34e
        L300:
            if (r1 == 0) goto L304
            int r7 = r7 - r3
            goto L305
        L304:
            int r7 = r7 + r3
        L305:
            if (r2 <= 0) goto L312
            if (r2 < r5) goto L312
            android.support.constraint.n.k.m.f r10 = r9.h
            int r10 = r10.f
            if (r1 == 0) goto L311
            int r7 = r7 - r10
            goto L312
        L311:
            int r7 = r7 + r10
        L312:
            if (r1 == 0) goto L317
            android.support.constraint.n.k.m.f r10 = r9.i
            goto L319
        L317:
            android.support.constraint.n.k.m.f r10 = r9.h
        L319:
            r10.a(r7)
            android.support.constraint.n.k.m.g r10 = r9.e
            int r11 = r10.g
            android.support.constraint.n.k.e$b r12 = r9.d
            android.support.constraint.n.k.e$b r13 = android.support.constraint.n.k.e.b.d
            if (r12 != r13) goto L331
            int r12 = r9.f522a
            r13 = 1
            if (r12 != r13) goto L331
            int r10 = r10.m
            int r11 = java.lang.Math.min(r11, r10)
        L331:
            if (r1 == 0) goto L335
            int r7 = r7 - r11
            goto L336
        L335:
            int r7 = r7 + r11
        L336:
            if (r1 == 0) goto L33b
            android.support.constraint.n.k.m.f r10 = r9.h
            goto L33d
        L33b:
            android.support.constraint.n.k.m.f r10 = r9.i
        L33d:
            r10.a(r7)
            if (r2 >= r8) goto L34e
            if (r2 >= r6) goto L34e
            android.support.constraint.n.k.m.f r9 = r9.i
            int r9 = r9.f
            int r9 = -r9
            if (r1 == 0) goto L34d
            int r7 = r7 - r9
            goto L34e
        L34d:
            int r7 = r7 + r9
        L34e:
            int r2 = r2 + 1
            goto L2d9
        L351:
            r2 = 2
            if (r9 != r2) goto L3f2
            int r2 = r0.f
            if (r2 != 0) goto L35f
            android.support.constraint.n.k.e r2 = r0.f523b
            float r2 = r2.l()
            goto L365
        L35f:
            android.support.constraint.n.k.e r2 = r0.f523b
            float r2 = r2.x()
        L365:
            if (r1 == 0) goto L36b
            r9 = 1065353216(0x3f800000, float:1.0)
            float r2 = r9 - r2
        L36b:
            int r3 = r3 - r14
            float r3 = (float) r3
            float r3 = r3 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r2
            int r2 = (int) r3
            if (r2 < 0) goto L376
            if (r15 <= 0) goto L377
        L376:
            r2 = r7
        L377:
            if (r1 == 0) goto L37c
            int r2 = r21 - r2
            goto L37e
        L37c:
            int r2 = r21 + r2
        L37e:
            r3 = r2
            r2 = r7
        L380:
            if (r2 >= r4) goto L3f2
            if (r1 == 0) goto L389
            int r7 = r2 + 1
            int r7 = r4 - r7
            goto L38a
        L389:
            r7 = r2
        L38a:
            java.util.ArrayList<android.support.constraint.n.k.m.p> r9 = r0.k
            java.lang.Object r7 = r9.get(r7)
            android.support.constraint.n.k.m.p r7 = (android.support.constraint.n.k.m.p) r7
            android.support.constraint.n.k.e r9 = r7.f523b
            int r9 = r9.B()
            r10 = 8
            if (r9 != r10) goto L3a8
            android.support.constraint.n.k.m.f r9 = r7.h
            r9.a(r3)
            android.support.constraint.n.k.m.f r7 = r7.i
            r7.a(r3)
            r13 = 1
            goto L3ef
        L3a8:
            if (r2 <= 0) goto L3b5
            if (r2 < r5) goto L3b5
            android.support.constraint.n.k.m.f r9 = r7.h
            int r9 = r9.f
            if (r1 == 0) goto L3b4
            int r3 = r3 - r9
            goto L3b5
        L3b4:
            int r3 = r3 + r9
        L3b5:
            if (r1 == 0) goto L3ba
            android.support.constraint.n.k.m.f r9 = r7.i
            goto L3bc
        L3ba:
            android.support.constraint.n.k.m.f r9 = r7.h
        L3bc:
            r9.a(r3)
            android.support.constraint.n.k.m.g r9 = r7.e
            int r11 = r9.g
            android.support.constraint.n.k.e$b r12 = r7.d
            android.support.constraint.n.k.e$b r13 = android.support.constraint.n.k.e.b.d
            if (r12 != r13) goto L3d1
            int r12 = r7.f522a
            r13 = 1
            if (r12 != r13) goto L3d2
            int r11 = r9.m
            goto L3d2
        L3d1:
            r13 = 1
        L3d2:
            if (r1 == 0) goto L3d6
            int r3 = r3 - r11
            goto L3d7
        L3d6:
            int r3 = r3 + r11
        L3d7:
            if (r1 == 0) goto L3dc
            android.support.constraint.n.k.m.f r9 = r7.h
            goto L3de
        L3dc:
            android.support.constraint.n.k.m.f r9 = r7.i
        L3de:
            r9.a(r3)
            if (r2 >= r8) goto L3ef
            if (r2 >= r6) goto L3ef
            android.support.constraint.n.k.m.f r7 = r7.i
            int r7 = r7.f
            int r7 = -r7
            if (r1 == 0) goto L3ee
            int r3 = r3 - r7
            goto L3ef
        L3ee:
            int r3 = r3 + r7
        L3ef:
            int r2 = r2 + 1
            goto L380
        L3f2:
            return
    }

    @Override // android.support.constraint.n.k.m.p
    public void b() {
            r2 = this;
            r0 = 0
        L1:
            java.util.ArrayList<android.support.constraint.n.k.m.p> r1 = r2.k
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.ArrayList<android.support.constraint.n.k.m.p> r1 = r2.k
            java.lang.Object r1 = r1.get(r0)
            android.support.constraint.n.k.m.p r1 = (android.support.constraint.n.k.m.p) r1
            r1.b()
            int r0 = r0 + 1
            goto L1
        L17:
            return
    }

    @Override // android.support.constraint.n.k.m.p
    void c() {
            r1 = this;
            r0 = 0
            r1.f524c = r0
            java.util.ArrayList<android.support.constraint.n.k.m.p> r1 = r1.k
            java.util.Iterator r1 = r1.iterator()
        L9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L19
            java.lang.Object r0 = r1.next()
            android.support.constraint.n.k.m.p r0 = (android.support.constraint.n.k.m.p) r0
            r0.c()
            goto L9
        L19:
            return
    }

    @Override // android.support.constraint.n.k.m.p
    public long d() {
            r7 = this;
            java.util.ArrayList<android.support.constraint.n.k.m.p> r0 = r7.k
            int r0 = r0.size()
            r1 = 0
            r3 = 0
        L9:
            if (r3 >= r0) goto L27
            java.util.ArrayList<android.support.constraint.n.k.m.p> r4 = r7.k
            java.lang.Object r4 = r4.get(r3)
            android.support.constraint.n.k.m.p r4 = (android.support.constraint.n.k.m.p) r4
            android.support.constraint.n.k.m.f r5 = r4.h
            int r5 = r5.f
            long r5 = (long) r5
            long r1 = r1 + r5
            long r5 = r4.d()
            long r1 = r1 + r5
            android.support.constraint.n.k.m.f r4 = r4.i
            int r4 = r4.f
            long r4 = (long) r4
            long r1 = r1 + r4
            int r3 = r3 + 1
            goto L9
        L27:
            return r1
    }

    @Override // android.support.constraint.n.k.m.p
    boolean f() {
            r4 = this;
            java.util.ArrayList<android.support.constraint.n.k.m.p> r0 = r4.k
            int r0 = r0.size()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L1c
            java.util.ArrayList<android.support.constraint.n.k.m.p> r3 = r4.k
            java.lang.Object r3 = r3.get(r2)
            android.support.constraint.n.k.m.p r3 = (android.support.constraint.n.k.m.p) r3
            boolean r3 = r3.f()
            if (r3 != 0) goto L19
            return r1
        L19:
            int r2 = r2 + 1
            goto L8
        L1c:
            r4 = 1
            return r4
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ChainRun "
            r0.append(r1)
            int r1 = r3.f
            if (r1 != 0) goto L11
            java.lang.String r1 = "horizontal : "
            goto L13
        L11:
            java.lang.String r1 = "vertical : "
        L13:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.util.ArrayList<android.support.constraint.n.k.m.p> r3 = r3.k
            java.util.Iterator r3 = r3.iterator()
        L20:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L5e
            java.lang.Object r1 = r3.next()
            android.support.constraint.n.k.m.p r1 = (android.support.constraint.n.k.m.p) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "<"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "> "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L20
        L5e:
            return r0
    }
}
