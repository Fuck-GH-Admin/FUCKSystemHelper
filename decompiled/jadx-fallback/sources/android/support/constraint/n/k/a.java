package android.support.constraint.n.k;

/* JADX INFO: loaded from: classes.dex */
public class a extends android.support.constraint.n.k.i {
    private int r0;
    private boolean s0;
    private int t0;
    boolean u0;

    public a() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.r0 = r0
            r1 = 1
            r2.s0 = r1
            r2.t0 = r0
            r2.u0 = r0
            return
    }

    @Override // android.support.constraint.n.k.e
    public boolean M() {
            r0 = this;
            boolean r0 = r0.u0
            return r0
    }

    @Override // android.support.constraint.n.k.e
    public boolean N() {
            r0 = this;
            boolean r0 = r0.u0
            return r0
    }

    public boolean R() {
            r8 = this;
            r0 = 0
            r1 = 1
            r2 = r0
            r3 = r1
        L4:
            int r4 = r8.q0
            r5 = 3
            r6 = 2
            if (r2 >= r4) goto L37
            android.support.constraint.n.k.e[] r4 = r8.p0
            r4 = r4[r2]
            boolean r7 = r8.s0
            if (r7 != 0) goto L19
            boolean r7 = r4.c()
            if (r7 != 0) goto L19
            goto L34
        L19:
            int r7 = r8.r0
            if (r7 == 0) goto L1f
            if (r7 != r1) goto L27
        L1f:
            boolean r7 = r4.M()
            if (r7 != 0) goto L27
        L25:
            r3 = r0
            goto L34
        L27:
            int r7 = r8.r0
            if (r7 == r6) goto L2d
            if (r7 != r5) goto L34
        L2d:
            boolean r4 = r4.N()
            if (r4 != 0) goto L34
            goto L25
        L34:
            int r2 = r2 + 1
            goto L4
        L37:
            if (r3 == 0) goto Lb6
            if (r4 <= 0) goto Lb6
            r2 = r0
            r3 = r2
        L3d:
            int r4 = r8.q0
            if (r0 >= r4) goto La2
            android.support.constraint.n.k.e[] r4 = r8.p0
            r4 = r4[r0]
            boolean r7 = r8.s0
            if (r7 != 0) goto L50
            boolean r7 = r4.c()
            if (r7 != 0) goto L50
            goto L9f
        L50:
            if (r3 != 0) goto L71
            int r3 = r8.r0
            if (r3 != 0) goto L61
            android.support.constraint.n.k.d$b r2 = android.support.constraint.n.k.d.b.f489c
        L58:
            android.support.constraint.n.k.d r2 = r4.a(r2)
            int r2 = r2.b()
            goto L70
        L61:
            if (r3 != r1) goto L66
            android.support.constraint.n.k.d$b r2 = android.support.constraint.n.k.d.b.e
            goto L58
        L66:
            if (r3 != r6) goto L6b
            android.support.constraint.n.k.d$b r2 = android.support.constraint.n.k.d.b.d
            goto L58
        L6b:
            if (r3 != r5) goto L70
            android.support.constraint.n.k.d$b r2 = android.support.constraint.n.k.d.b.f
            goto L58
        L70:
            r3 = r1
        L71:
            int r7 = r8.r0
            if (r7 != 0) goto L84
            android.support.constraint.n.k.d$b r7 = android.support.constraint.n.k.d.b.f489c
        L77:
            android.support.constraint.n.k.d r4 = r4.a(r7)
            int r4 = r4.b()
            int r2 = java.lang.Math.min(r2, r4)
            goto L9f
        L84:
            if (r7 != r1) goto L95
            android.support.constraint.n.k.d$b r7 = android.support.constraint.n.k.d.b.e
        L88:
            android.support.constraint.n.k.d r4 = r4.a(r7)
            int r4 = r4.b()
            int r2 = java.lang.Math.max(r2, r4)
            goto L9f
        L95:
            if (r7 != r6) goto L9a
            android.support.constraint.n.k.d$b r7 = android.support.constraint.n.k.d.b.d
            goto L77
        L9a:
            if (r7 != r5) goto L9f
            android.support.constraint.n.k.d$b r7 = android.support.constraint.n.k.d.b.f
            goto L88
        L9f:
            int r0 = r0 + 1
            goto L3d
        La2:
            int r0 = r8.t0
            int r2 = r2 + r0
            int r0 = r8.r0
            if (r0 == 0) goto Lb0
            if (r0 != r1) goto Lac
            goto Lb0
        Lac:
            r8.b(r2, r2)
            goto Lb3
        Lb0:
            r8.a(r2, r2)
        Lb3:
            r8.u0 = r1
            return r1
        Lb6:
            return r0
    }

    public boolean S() {
            r0 = this;
            boolean r0 = r0.s0
            return r0
    }

    public int T() {
            r0 = this;
            int r0 = r0.r0
            return r0
    }

    public int U() {
            r0 = this;
            int r0 = r0.t0
            return r0
    }

    public int V() {
            r2 = this;
            int r2 = r2.r0
            if (r2 == 0) goto L10
            r0 = 1
            if (r2 == r0) goto L10
            r1 = 2
            if (r2 == r1) goto Lf
            r1 = 3
            if (r2 == r1) goto Lf
            r2 = -1
            return r2
        Lf:
            return r0
        L10:
            r2 = 0
            return r2
    }

    protected void W() {
            r6 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r6.q0
            if (r1 >= r2) goto L22
            android.support.constraint.n.k.e[] r2 = r6.p0
            r2 = r2[r1]
            int r3 = r6.r0
            r4 = 1
            if (r3 == 0) goto L1c
            if (r3 != r4) goto L12
            goto L1c
        L12:
            r5 = 2
            if (r3 == r5) goto L18
            r5 = 3
            if (r3 != r5) goto L1f
        L18:
            r2.a(r4, r4)
            goto L1f
        L1c:
            r2.a(r0, r4)
        L1f:
            int r1 = r1 + 1
            goto L2
        L22:
            return
    }

    @Override // android.support.constraint.n.k.e
    public void a(android.support.constraint.n.d r13, boolean r14) {
            r12 = this;
            android.support.constraint.n.k.d[] r14 = r12.N
            android.support.constraint.n.k.d r0 = r12.F
            r1 = 0
            r14[r1] = r0
            android.support.constraint.n.k.d r0 = r12.G
            r2 = 2
            r14[r2] = r0
            android.support.constraint.n.k.d r0 = r12.H
            r3 = 1
            r14[r3] = r0
            android.support.constraint.n.k.d r0 = r12.I
            r4 = 3
            r14[r4] = r0
            r14 = r1
        L17:
            android.support.constraint.n.k.d[] r0 = r12.N
            int r5 = r0.length
            if (r14 >= r5) goto L29
            r5 = r0[r14]
            r0 = r0[r14]
            android.support.constraint.n.i r0 = r13.a(r0)
            r5.i = r0
            int r14 = r14 + 1
            goto L17
        L29:
            int r14 = r12.r0
            if (r14 < 0) goto L1f8
            r5 = 4
            if (r14 >= r5) goto L1f8
            r14 = r0[r14]
            boolean r0 = r12.u0
            if (r0 != 0) goto L39
            r12.R()
        L39:
            boolean r0 = r12.u0
            if (r0 == 0) goto L6d
            r12.u0 = r1
            int r14 = r12.r0
            if (r14 == 0) goto L5a
            if (r14 != r3) goto L46
            goto L5a
        L46:
            if (r14 == r2) goto L4a
            if (r14 != r4) goto L6c
        L4a:
            android.support.constraint.n.k.d r14 = r12.G
            android.support.constraint.n.i r14 = r14.i
            int r0 = r12.X
            r13.a(r14, r0)
            android.support.constraint.n.k.d r14 = r12.I
            android.support.constraint.n.i r14 = r14.i
            int r12 = r12.X
            goto L69
        L5a:
            android.support.constraint.n.k.d r14 = r12.F
            android.support.constraint.n.i r14 = r14.i
            int r0 = r12.W
            r13.a(r14, r0)
            android.support.constraint.n.k.d r14 = r12.H
            android.support.constraint.n.i r14 = r14.i
            int r12 = r12.W
        L69:
            r13.a(r14, r12)
        L6c:
            return
        L6d:
            r0 = r1
        L6e:
            int r6 = r12.q0
            if (r0 >= r6) goto Lbb
            android.support.constraint.n.k.e[] r6 = r12.p0
            r6 = r6[r0]
            boolean r7 = r12.s0
            if (r7 != 0) goto L81
            boolean r7 = r6.c()
            if (r7 != 0) goto L81
            goto Lb8
        L81:
            int r7 = r12.r0
            if (r7 == 0) goto L87
            if (r7 != r3) goto L9d
        L87:
            android.support.constraint.n.k.e$b r7 = r6.n()
            android.support.constraint.n.k.e$b r8 = android.support.constraint.n.k.e.b.d
            if (r7 != r8) goto L9d
            android.support.constraint.n.k.d r7 = r6.F
            android.support.constraint.n.k.d r7 = r7.f
            if (r7 == 0) goto L9d
            android.support.constraint.n.k.d r7 = r6.H
            android.support.constraint.n.k.d r7 = r7.f
            if (r7 == 0) goto L9d
        L9b:
            r0 = r3
            goto Lbc
        L9d:
            int r7 = r12.r0
            if (r7 == r2) goto La3
            if (r7 != r4) goto Lb8
        La3:
            android.support.constraint.n.k.e$b r7 = r6.z()
            android.support.constraint.n.k.e$b r8 = android.support.constraint.n.k.e.b.d
            if (r7 != r8) goto Lb8
            android.support.constraint.n.k.d r7 = r6.G
            android.support.constraint.n.k.d r7 = r7.f
            if (r7 == 0) goto Lb8
            android.support.constraint.n.k.d r6 = r6.I
            android.support.constraint.n.k.d r6 = r6.f
            if (r6 == 0) goto Lb8
            goto L9b
        Lb8:
            int r0 = r0 + 1
            goto L6e
        Lbb:
            r0 = r1
        Lbc:
            android.support.constraint.n.k.d r6 = r12.F
            boolean r6 = r6.i()
            if (r6 != 0) goto Lcf
            android.support.constraint.n.k.d r6 = r12.H
            boolean r6 = r6.i()
            if (r6 == 0) goto Lcd
            goto Lcf
        Lcd:
            r6 = r1
            goto Ld0
        Lcf:
            r6 = r3
        Ld0:
            android.support.constraint.n.k.d r7 = r12.G
            boolean r7 = r7.i()
            if (r7 != 0) goto Le3
            android.support.constraint.n.k.d r7 = r12.I
            boolean r7 = r7.i()
            if (r7 == 0) goto Le1
            goto Le3
        Le1:
            r7 = r1
            goto Le4
        Le3:
            r7 = r3
        Le4:
            if (r0 != 0) goto L100
            int r8 = r12.r0
            if (r8 != 0) goto Lec
            if (r6 != 0) goto Lfe
        Lec:
            int r8 = r12.r0
            if (r8 != r2) goto Lf2
            if (r7 != 0) goto Lfe
        Lf2:
            int r8 = r12.r0
            if (r8 != r3) goto Lf8
            if (r6 != 0) goto Lfe
        Lf8:
            int r6 = r12.r0
            if (r6 != r4) goto L100
            if (r7 == 0) goto L100
        Lfe:
            r6 = r3
            goto L101
        L100:
            r6 = r1
        L101:
            r7 = 5
            if (r6 != 0) goto L105
            r7 = r5
        L105:
            r6 = r1
        L106:
            int r8 = r12.q0
            if (r6 >= r8) goto L163
            android.support.constraint.n.k.e[] r8 = r12.p0
            r8 = r8[r6]
            boolean r9 = r12.s0
            if (r9 != 0) goto L119
            boolean r9 = r8.c()
            if (r9 != 0) goto L119
            goto L160
        L119:
            android.support.constraint.n.k.d[] r9 = r8.N
            int r10 = r12.r0
            r9 = r9[r10]
            android.support.constraint.n.i r9 = r13.a(r9)
            android.support.constraint.n.k.d[] r8 = r8.N
            int r10 = r12.r0
            r11 = r8[r10]
            r11.i = r9
            r11 = r8[r10]
            android.support.constraint.n.k.d r11 = r11.f
            if (r11 == 0) goto L13f
            r11 = r8[r10]
            android.support.constraint.n.k.d r11 = r11.f
            android.support.constraint.n.k.e r11 = r11.d
            if (r11 != r12) goto L13f
            r8 = r8[r10]
            int r8 = r8.g
            int r8 = r8 + r1
            goto L140
        L13f:
            r8 = r1
        L140:
            int r10 = r12.r0
            if (r10 == 0) goto L150
            if (r10 != r2) goto L147
            goto L150
        L147:
            android.support.constraint.n.i r10 = r14.i
            int r11 = r12.t0
            int r11 = r11 + r8
            r13.a(r10, r9, r11, r0)
            goto L158
        L150:
            android.support.constraint.n.i r10 = r14.i
            int r11 = r12.t0
            int r11 = r11 - r8
            r13.b(r10, r9, r11, r0)
        L158:
            android.support.constraint.n.i r10 = r14.i
            int r11 = r12.t0
            int r11 = r11 + r8
            r13.a(r10, r9, r11, r7)
        L160:
            int r6 = r6 + 1
            goto L106
        L163:
            int r14 = r12.r0
            r0 = 8
            if (r14 != 0) goto L18f
            android.support.constraint.n.k.d r14 = r12.H
            android.support.constraint.n.i r14 = r14.i
            android.support.constraint.n.k.d r2 = r12.F
            android.support.constraint.n.i r2 = r2.i
            r13.a(r14, r2, r1, r0)
            android.support.constraint.n.k.d r14 = r12.F
            android.support.constraint.n.i r14 = r14.i
            android.support.constraint.n.k.e r0 = r12.R
            android.support.constraint.n.k.d r0 = r0.H
            android.support.constraint.n.i r0 = r0.i
            r13.a(r14, r0, r1, r5)
            android.support.constraint.n.k.d r14 = r12.F
            android.support.constraint.n.i r14 = r14.i
            android.support.constraint.n.k.e r12 = r12.R
            android.support.constraint.n.k.d r12 = r12.F
        L189:
            android.support.constraint.n.i r12 = r12.i
            r13.a(r14, r12, r1, r1)
            goto L1f8
        L18f:
            if (r14 != r3) goto L1b2
            android.support.constraint.n.k.d r14 = r12.F
            android.support.constraint.n.i r14 = r14.i
            android.support.constraint.n.k.d r2 = r12.H
            android.support.constraint.n.i r2 = r2.i
            r13.a(r14, r2, r1, r0)
            android.support.constraint.n.k.d r14 = r12.F
            android.support.constraint.n.i r14 = r14.i
            android.support.constraint.n.k.e r0 = r12.R
            android.support.constraint.n.k.d r0 = r0.F
            android.support.constraint.n.i r0 = r0.i
            r13.a(r14, r0, r1, r5)
            android.support.constraint.n.k.d r14 = r12.F
            android.support.constraint.n.i r14 = r14.i
            android.support.constraint.n.k.e r12 = r12.R
            android.support.constraint.n.k.d r12 = r12.H
            goto L189
        L1b2:
            if (r14 != r2) goto L1d5
            android.support.constraint.n.k.d r14 = r12.I
            android.support.constraint.n.i r14 = r14.i
            android.support.constraint.n.k.d r2 = r12.G
            android.support.constraint.n.i r2 = r2.i
            r13.a(r14, r2, r1, r0)
            android.support.constraint.n.k.d r14 = r12.G
            android.support.constraint.n.i r14 = r14.i
            android.support.constraint.n.k.e r0 = r12.R
            android.support.constraint.n.k.d r0 = r0.I
            android.support.constraint.n.i r0 = r0.i
            r13.a(r14, r0, r1, r5)
            android.support.constraint.n.k.d r14 = r12.G
            android.support.constraint.n.i r14 = r14.i
            android.support.constraint.n.k.e r12 = r12.R
            android.support.constraint.n.k.d r12 = r12.G
            goto L189
        L1d5:
            if (r14 != r4) goto L1f8
            android.support.constraint.n.k.d r14 = r12.G
            android.support.constraint.n.i r14 = r14.i
            android.support.constraint.n.k.d r2 = r12.I
            android.support.constraint.n.i r2 = r2.i
            r13.a(r14, r2, r1, r0)
            android.support.constraint.n.k.d r14 = r12.G
            android.support.constraint.n.i r14 = r14.i
            android.support.constraint.n.k.e r0 = r12.R
            android.support.constraint.n.k.d r0 = r0.G
            android.support.constraint.n.i r0 = r0.i
            r13.a(r14, r0, r1, r5)
            android.support.constraint.n.k.d r14 = r12.G
            android.support.constraint.n.i r14 = r14.i
            android.support.constraint.n.k.e r12 = r12.R
            android.support.constraint.n.k.d r12 = r12.I
            goto L189
        L1f8:
            return
    }

    @Override // android.support.constraint.n.k.e
    public boolean c() {
            r0 = this;
            r0 = 1
            return r0
    }

    public void e(boolean r1) {
            r0 = this;
            r0.s0 = r1
            return
    }

    @Override // android.support.constraint.n.k.e
    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[Barrier] "
            r0.append(r1)
            java.lang.String r1 = r4.h()
            r0.append(r1)
            java.lang.String r1 = " {"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
        L1b:
            int r2 = r4.q0
            if (r1 >= r2) goto L4c
            android.support.constraint.n.k.e[] r2 = r4.p0
            r2 = r2[r1]
            if (r1 <= 0) goto L36
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = ", "
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        L36:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = r2.h()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            int r1 = r1 + 1
            goto L1b
        L4c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = "}"
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            return r4
    }

    public void x(int r1) {
            r0 = this;
            r0.r0 = r1
            return
    }

    public void y(int r1) {
            r0 = this;
            r0.t0 = r1
            return
    }
}
