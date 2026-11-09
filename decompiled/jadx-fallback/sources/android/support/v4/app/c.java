package android.support.v4.app;

/* JADX INFO: loaded from: classes.dex */
final class c extends android.support.v4.app.o implements android.support.v4.app.k.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final android.support.v4.app.k f536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    java.util.ArrayList<android.support.v4.app.c.a> f537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f538c;
    int d;
    int e;
    int f;
    int g;
    int h;
    boolean i;
    java.lang.String j;
    boolean k;
    int l;
    int m;
    java.lang.CharSequence n;
    int o;
    java.lang.CharSequence p;
    java.util.ArrayList<java.lang.String> q;
    java.util.ArrayList<java.lang.String> r;
    boolean s;
    java.util.ArrayList<java.lang.Runnable> t;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        android.support.v4.app.e f540b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f541c;
        int d;
        int e;
        int f;

        a() {
                r0 = this;
                r0.<init>()
                return
        }

        a(int r1, android.support.v4.app.e r2) {
                r0 = this;
                r0.<init>()
                r0.f539a = r1
                r0.f540b = r2
                return
        }
    }

    public c(android.support.v4.app.k r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f537b = r0
            r0 = -1
            r1.l = r0
            r0 = 0
            r1.s = r0
            r1.f536a = r2
            return
    }

    private static boolean b(android.support.v4.app.c.a r1) {
            android.support.v4.app.e r1 = r1.f540b
            if (r1 == 0) goto L1c
            boolean r0 = r1.l
            if (r0 == 0) goto L1c
            android.view.View r0 = r1.J
            if (r0 == 0) goto L1c
            boolean r0 = r1.C
            if (r0 != 0) goto L1c
            boolean r0 = r1.B
            if (r0 != 0) goto L1c
            boolean r1 = r1.D()
            if (r1 == 0) goto L1c
            r1 = 1
            goto L1d
        L1c:
            r1 = 0
        L1d:
            return r1
    }

    android.support.v4.app.e a(java.util.ArrayList<android.support.v4.app.e> r17, android.support.v4.app.e r18) {
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = 0
        L7:
            java.util.ArrayList<android.support.v4.app.c$a> r5 = r0.f537b
            int r5 = r5.size()
            if (r4 >= r5) goto Lba
            java.util.ArrayList<android.support.v4.app.c$a> r5 = r0.f537b
            java.lang.Object r5 = r5.get(r4)
            android.support.v4.app.c$a r5 = (android.support.v4.app.c.a) r5
            int r6 = r5.f539a
            r7 = 0
            r8 = 1
            if (r6 == r8) goto Lb2
            r9 = 2
            r10 = 3
            r11 = 9
            if (r6 == r9) goto L58
            if (r6 == r10) goto L41
            r9 = 6
            if (r6 == r9) goto L41
            r7 = 7
            if (r6 == r7) goto Lb2
            r7 = 8
            if (r6 == r7) goto L31
            goto Lb7
        L31:
            java.util.ArrayList<android.support.v4.app.c$a> r6 = r0.f537b
            android.support.v4.app.c$a r7 = new android.support.v4.app.c$a
            r7.<init>(r11, r3)
            r6.add(r4, r7)
            int r4 = r4 + 1
            android.support.v4.app.e r3 = r5.f540b
            goto Lb7
        L41:
            android.support.v4.app.e r6 = r5.f540b
            r1.remove(r6)
            android.support.v4.app.e r5 = r5.f540b
            if (r5 != r3) goto Lb7
            java.util.ArrayList<android.support.v4.app.c$a> r3 = r0.f537b
            android.support.v4.app.c$a r6 = new android.support.v4.app.c$a
            r6.<init>(r11, r5)
            r3.add(r4, r6)
            int r4 = r4 + 1
            r3 = r7
            goto Lb7
        L58:
            android.support.v4.app.e r6 = r5.f540b
            int r9 = r6.z
            int r12 = r17.size()
            int r12 = r12 - r8
            r13 = 0
        L62:
            if (r12 < 0) goto La2
            java.lang.Object r14 = r1.get(r12)
            android.support.v4.app.e r14 = (android.support.v4.app.e) r14
            int r15 = r14.z
            if (r15 != r9) goto L9f
            if (r14 != r6) goto L72
            r13 = r8
            goto L9f
        L72:
            if (r14 != r3) goto L81
            java.util.ArrayList<android.support.v4.app.c$a> r3 = r0.f537b
            android.support.v4.app.c$a r15 = new android.support.v4.app.c$a
            r15.<init>(r11, r14)
            r3.add(r4, r15)
            int r4 = r4 + 1
            r3 = r7
        L81:
            android.support.v4.app.c$a r15 = new android.support.v4.app.c$a
            r15.<init>(r10, r14)
            int r2 = r5.f541c
            r15.f541c = r2
            int r2 = r5.e
            r15.e = r2
            int r2 = r5.d
            r15.d = r2
            int r2 = r5.f
            r15.f = r2
            java.util.ArrayList<android.support.v4.app.c$a> r2 = r0.f537b
            r2.add(r4, r15)
            r1.remove(r14)
            int r4 = r4 + r8
        L9f:
            int r12 = r12 + (-1)
            goto L62
        La2:
            if (r13 == 0) goto Lac
            java.util.ArrayList<android.support.v4.app.c$a> r2 = r0.f537b
            r2.remove(r4)
            int r4 = r4 + (-1)
            goto Lb7
        Lac:
            r5.f539a = r8
            r1.add(r6)
            goto Lb7
        Lb2:
            android.support.v4.app.e r2 = r5.f540b
            r1.add(r2)
        Lb7:
            int r4 = r4 + r8
            goto L7
        Lba:
            return r3
    }

    void a() {
            r8 = this;
            java.util.ArrayList<android.support.v4.app.c$a> r0 = r8.f537b
            int r0 = r0.size()
            r1 = 0
            r2 = r1
        L8:
            r3 = 1
            if (r2 >= r0) goto L9d
            java.util.ArrayList<android.support.v4.app.c$a> r4 = r8.f537b
            java.lang.Object r4 = r4.get(r2)
            android.support.v4.app.c$a r4 = (android.support.v4.app.c.a) r4
            android.support.v4.app.e r5 = r4.f540b
            if (r5 == 0) goto L1e
            int r6 = r8.g
            int r7 = r8.h
            r5.a(r6, r7)
        L1e:
            int r6 = r4.f539a
            switch(r6) {
                case 1: goto L80;
                case 2: goto L23;
                case 3: goto L75;
                case 4: goto L6a;
                case 5: goto L5f;
                case 6: goto L54;
                case 7: goto L49;
                case 8: goto L43;
                case 9: goto L3c;
                default: goto L23;
            }
        L23:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown cmd: "
            r0.append(r1)
            int r1 = r4.f539a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L3c:
            android.support.v4.app.k r6 = r8.f536a
            r7 = 0
            r6.n(r7)
            goto L8a
        L43:
            android.support.v4.app.k r6 = r8.f536a
            r6.n(r5)
            goto L8a
        L49:
            int r6 = r4.f541c
            r5.a(r6)
            android.support.v4.app.k r6 = r8.f536a
            r6.a(r5)
            goto L8a
        L54:
            int r6 = r4.d
            r5.a(r6)
            android.support.v4.app.k r6 = r8.f536a
            r6.c(r5)
            goto L8a
        L5f:
            int r6 = r4.f541c
            r5.a(r6)
            android.support.v4.app.k r6 = r8.f536a
            r6.o(r5)
            goto L8a
        L6a:
            int r6 = r4.d
            r5.a(r6)
            android.support.v4.app.k r6 = r8.f536a
            r6.e(r5)
            goto L8a
        L75:
            int r6 = r4.d
            r5.a(r6)
            android.support.v4.app.k r6 = r8.f536a
            r6.k(r5)
            goto L8a
        L80:
            int r6 = r4.f541c
            r5.a(r6)
            android.support.v4.app.k r6 = r8.f536a
            r6.a(r5, r1)
        L8a:
            boolean r6 = r8.s
            if (r6 != 0) goto L99
            int r4 = r4.f539a
            if (r4 == r3) goto L99
            if (r5 == 0) goto L99
            android.support.v4.app.k r3 = r8.f536a
            r3.h(r5)
        L99:
            int r2 = r2 + 1
            goto L8
        L9d:
            boolean r0 = r8.s
            if (r0 != 0) goto La8
            android.support.v4.app.k r8 = r8.f536a
            int r0 = r8.m
            r8.a(r0, r3)
        La8:
            return
    }

    void a(int r7) {
            r6 = this;
            boolean r0 = r6.i
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = android.support.v4.app.k.F
            java.lang.String r1 = "FragmentManager"
            if (r0 == 0) goto L27
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Bump nesting in "
            r0.append(r2)
            r0.append(r6)
            java.lang.String r2 = " by "
            r0.append(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r1, r0)
        L27:
            java.util.ArrayList<android.support.v4.app.c$a> r0 = r6.f537b
            int r0 = r0.size()
            r2 = 0
        L2e:
            if (r2 >= r0) goto L6a
            java.util.ArrayList<android.support.v4.app.c$a> r3 = r6.f537b
            java.lang.Object r3 = r3.get(r2)
            android.support.v4.app.c$a r3 = (android.support.v4.app.c.a) r3
            android.support.v4.app.e r4 = r3.f540b
            if (r4 == 0) goto L67
            int r5 = r4.r
            int r5 = r5 + r7
            r4.r = r5
            boolean r4 = android.support.v4.app.k.F
            if (r4 == 0) goto L67
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Bump nesting of "
            r4.append(r5)
            android.support.v4.app.e r5 = r3.f540b
            r4.append(r5)
            java.lang.String r5 = " to "
            r4.append(r5)
            android.support.v4.app.e r3 = r3.f540b
            int r3 = r3.r
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.util.Log.v(r1, r3)
        L67:
            int r2 = r2 + 1
            goto L2e
        L6a:
            return
    }

    void a(android.support.v4.app.c.a r2) {
            r1 = this;
            java.util.ArrayList<android.support.v4.app.c$a> r0 = r1.f537b
            r0.add(r2)
            int r0 = r1.f538c
            r2.f541c = r0
            int r0 = r1.d
            r2.d = r0
            int r0 = r1.e
            r2.e = r0
            int r1 = r1.f
            r2.f = r1
            return
    }

    void a(android.support.v4.app.e.f r4) {
            r3 = this;
            r0 = 0
        L1:
            java.util.ArrayList<android.support.v4.app.c$a> r1 = r3.f537b
            int r1 = r1.size()
            if (r0 >= r1) goto L1f
            java.util.ArrayList<android.support.v4.app.c$a> r1 = r3.f537b
            java.lang.Object r1 = r1.get(r0)
            android.support.v4.app.c$a r1 = (android.support.v4.app.c.a) r1
            boolean r2 = b(r1)
            if (r2 == 0) goto L1c
            android.support.v4.app.e r1 = r1.f540b
            r1.a(r4)
        L1c:
            int r0 = r0 + 1
            goto L1
        L1f:
            return
    }

    public void a(java.lang.String r1, java.io.FileDescriptor r2, java.io.PrintWriter r3, java.lang.String[] r4) {
            r0 = this;
            r2 = 1
            r0.a(r1, r3, r2)
            return
    }

    public void a(java.lang.String r6, java.io.PrintWriter r7, boolean r8) {
            r5 = this;
            if (r8 == 0) goto Lda
            r7.print(r6)
            java.lang.String r0 = "mName="
            r7.print(r0)
            java.lang.String r0 = r5.j
            r7.print(r0)
            java.lang.String r0 = " mIndex="
            r7.print(r0)
            int r0 = r5.l
            r7.print(r0)
            java.lang.String r0 = " mCommitted="
            r7.print(r0)
            boolean r0 = r5.k
            r7.println(r0)
            int r0 = r5.g
            if (r0 == 0) goto L46
            r7.print(r6)
            java.lang.String r0 = "mTransition=#"
            r7.print(r0)
            int r0 = r5.g
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " mTransitionStyle=#"
            r7.print(r0)
            int r0 = r5.h
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.println(r0)
        L46:
            int r0 = r5.f538c
            if (r0 != 0) goto L4e
            int r0 = r5.d
            if (r0 == 0) goto L6d
        L4e:
            r7.print(r6)
            java.lang.String r0 = "mEnterAnim=#"
            r7.print(r0)
            int r0 = r5.f538c
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " mExitAnim=#"
            r7.print(r0)
            int r0 = r5.d
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.println(r0)
        L6d:
            int r0 = r5.e
            if (r0 != 0) goto L75
            int r0 = r5.f
            if (r0 == 0) goto L94
        L75:
            r7.print(r6)
            java.lang.String r0 = "mPopEnterAnim=#"
            r7.print(r0)
            int r0 = r5.e
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " mPopExitAnim=#"
            r7.print(r0)
            int r0 = r5.f
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.println(r0)
        L94:
            int r0 = r5.m
            if (r0 != 0) goto L9c
            java.lang.CharSequence r0 = r5.n
            if (r0 == 0) goto Lb7
        L9c:
            r7.print(r6)
            java.lang.String r0 = "mBreadCrumbTitleRes=#"
            r7.print(r0)
            int r0 = r5.m
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " mBreadCrumbTitleText="
            r7.print(r0)
            java.lang.CharSequence r0 = r5.n
            r7.println(r0)
        Lb7:
            int r0 = r5.o
            if (r0 != 0) goto Lbf
            java.lang.CharSequence r0 = r5.p
            if (r0 == 0) goto Lda
        Lbf:
            r7.print(r6)
            java.lang.String r0 = "mBreadCrumbShortTitleRes=#"
            r7.print(r0)
            int r0 = r5.o
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " mBreadCrumbShortTitleText="
            r7.print(r0)
            java.lang.CharSequence r0 = r5.p
            r7.println(r0)
        Lda:
            java.util.ArrayList<android.support.v4.app.c$a> r0 = r5.f537b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1b2
            r7.print(r6)
            java.lang.String r0 = "Operations:"
            r7.println(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r1 = "    "
            r0.append(r1)
            r0.toString()
            java.util.ArrayList<android.support.v4.app.c$a> r0 = r5.f537b
            int r0 = r0.size()
            r1 = 0
        L101:
            if (r1 >= r0) goto L1b2
            java.util.ArrayList<android.support.v4.app.c$a> r2 = r5.f537b
            java.lang.Object r2 = r2.get(r1)
            android.support.v4.app.c$a r2 = (android.support.v4.app.c.a) r2
            int r3 = r2.f539a
            switch(r3) {
                case 0: goto L13f;
                case 1: goto L13c;
                case 2: goto L139;
                case 3: goto L136;
                case 4: goto L133;
                case 5: goto L130;
                case 6: goto L12d;
                case 7: goto L12a;
                case 8: goto L127;
                case 9: goto L124;
                default: goto L110;
            }
        L110:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "cmd="
            r3.append(r4)
            int r4 = r2.f539a
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            goto L141
        L124:
            java.lang.String r3 = "UNSET_PRIMARY_NAV"
            goto L141
        L127:
            java.lang.String r3 = "SET_PRIMARY_NAV"
            goto L141
        L12a:
            java.lang.String r3 = "ATTACH"
            goto L141
        L12d:
            java.lang.String r3 = "DETACH"
            goto L141
        L130:
            java.lang.String r3 = "SHOW"
            goto L141
        L133:
            java.lang.String r3 = "HIDE"
            goto L141
        L136:
            java.lang.String r3 = "REMOVE"
            goto L141
        L139:
            java.lang.String r3 = "REPLACE"
            goto L141
        L13c:
            java.lang.String r3 = "ADD"
            goto L141
        L13f:
            java.lang.String r3 = "NULL"
        L141:
            r7.print(r6)
            java.lang.String r4 = "  Op #"
            r7.print(r4)
            r7.print(r1)
            java.lang.String r4 = ": "
            r7.print(r4)
            r7.print(r3)
            java.lang.String r3 = " "
            r7.print(r3)
            android.support.v4.app.e r3 = r2.f540b
            r7.println(r3)
            if (r8 == 0) goto L1ae
            int r3 = r2.f541c
            if (r3 != 0) goto L168
            int r3 = r2.d
            if (r3 == 0) goto L187
        L168:
            r7.print(r6)
            java.lang.String r3 = "enterAnim=#"
            r7.print(r3)
            int r3 = r2.f541c
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r7.print(r3)
            java.lang.String r3 = " exitAnim=#"
            r7.print(r3)
            int r3 = r2.d
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r7.println(r3)
        L187:
            int r3 = r2.e
            if (r3 != 0) goto L18f
            int r3 = r2.f
            if (r3 == 0) goto L1ae
        L18f:
            r7.print(r6)
            java.lang.String r3 = "popEnterAnim=#"
            r7.print(r3)
            int r3 = r2.e
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r7.print(r3)
            java.lang.String r3 = " popExitAnim=#"
            r7.print(r3)
            int r2 = r2.f
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r7.println(r2)
        L1ae:
            int r1 = r1 + 1
            goto L101
        L1b2:
            return
    }

    void a(boolean r7) {
            r6 = this;
            java.util.ArrayList<android.support.v4.app.c$a> r0 = r6.f537b
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto La2
            java.util.ArrayList<android.support.v4.app.c$a> r2 = r6.f537b
            java.lang.Object r2 = r2.get(r0)
            android.support.v4.app.c$a r2 = (android.support.v4.app.c.a) r2
            android.support.v4.app.e r3 = r2.f540b
            if (r3 == 0) goto L21
            int r4 = r6.g
            int r4 = android.support.v4.app.k.e(r4)
            int r5 = r6.h
            r3.a(r4, r5)
        L21:
            int r4 = r2.f539a
            switch(r4) {
                case 1: goto L84;
                case 2: goto L26;
                case 3: goto L78;
                case 4: goto L6d;
                case 5: goto L62;
                case 6: goto L57;
                case 7: goto L4c;
                case 8: goto L45;
                case 9: goto L3f;
                default: goto L26;
            }
        L26:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Unknown cmd: "
            r7.append(r0)
            int r0 = r2.f539a
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L3f:
            android.support.v4.app.k r4 = r6.f536a
            r4.n(r3)
            goto L8e
        L45:
            android.support.v4.app.k r4 = r6.f536a
            r5 = 0
            r4.n(r5)
            goto L8e
        L4c:
            int r4 = r2.f
            r3.a(r4)
            android.support.v4.app.k r4 = r6.f536a
            r4.c(r3)
            goto L8e
        L57:
            int r4 = r2.e
            r3.a(r4)
            android.support.v4.app.k r4 = r6.f536a
            r4.a(r3)
            goto L8e
        L62:
            int r4 = r2.f
            r3.a(r4)
            android.support.v4.app.k r4 = r6.f536a
            r4.e(r3)
            goto L8e
        L6d:
            int r4 = r2.e
            r3.a(r4)
            android.support.v4.app.k r4 = r6.f536a
            r4.o(r3)
            goto L8e
        L78:
            int r4 = r2.e
            r3.a(r4)
            android.support.v4.app.k r4 = r6.f536a
            r5 = 0
            r4.a(r3, r5)
            goto L8e
        L84:
            int r4 = r2.f
            r3.a(r4)
            android.support.v4.app.k r4 = r6.f536a
            r4.k(r3)
        L8e:
            boolean r4 = r6.s
            if (r4 != 0) goto L9e
            int r2 = r2.f539a
            r4 = 3
            if (r2 == r4) goto L9e
            if (r3 == 0) goto L9e
            android.support.v4.app.k r2 = r6.f536a
            r2.h(r3)
        L9e:
            int r0 = r0 + (-1)
            goto L8
        La2:
            boolean r0 = r6.s
            if (r0 != 0) goto Laf
            if (r7 == 0) goto Laf
            android.support.v4.app.k r6 = r6.f536a
            int r7 = r6.m
            r6.a(r7, r1)
        Laf:
            return
    }

    boolean a(java.util.ArrayList<android.support.v4.app.c> r10, int r11, int r12) {
            r9 = this;
            r0 = 0
            if (r12 != r11) goto L4
            return r0
        L4:
            java.util.ArrayList<android.support.v4.app.c$a> r1 = r9.f537b
            int r1 = r1.size()
            r2 = -1
            r3 = r0
        Lc:
            if (r3 >= r1) goto L52
            java.util.ArrayList<android.support.v4.app.c$a> r4 = r9.f537b
            java.lang.Object r4 = r4.get(r3)
            android.support.v4.app.c$a r4 = (android.support.v4.app.c.a) r4
            android.support.v4.app.e r4 = r4.f540b
            if (r4 == 0) goto L1d
            int r4 = r4.z
            goto L1e
        L1d:
            r4 = r0
        L1e:
            if (r4 == 0) goto L4f
            if (r4 == r2) goto L4f
            r2 = r11
        L23:
            if (r2 >= r12) goto L4e
            java.lang.Object r5 = r10.get(r2)
            android.support.v4.app.c r5 = (android.support.v4.app.c) r5
            java.util.ArrayList<android.support.v4.app.c$a> r6 = r5.f537b
            int r6 = r6.size()
            r7 = r0
        L32:
            if (r7 >= r6) goto L4b
            java.util.ArrayList<android.support.v4.app.c$a> r8 = r5.f537b
            java.lang.Object r8 = r8.get(r7)
            android.support.v4.app.c$a r8 = (android.support.v4.app.c.a) r8
            android.support.v4.app.e r8 = r8.f540b
            if (r8 == 0) goto L43
            int r8 = r8.z
            goto L44
        L43:
            r8 = r0
        L44:
            if (r8 != r4) goto L48
            r9 = 1
            return r9
        L48:
            int r7 = r7 + 1
            goto L32
        L4b:
            int r2 = r2 + 1
            goto L23
        L4e:
            r2 = r4
        L4f:
            int r3 = r3 + 1
            goto Lc
        L52:
            return r0
    }

    @Override // android.support.v4.app.k.l
    public boolean a(java.util.ArrayList<android.support.v4.app.c> r3, java.util.ArrayList<java.lang.Boolean> r4) {
            r2 = this;
            boolean r0 = android.support.v4.app.k.F
            if (r0 == 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Run: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L1a:
            r3.add(r2)
            r3 = 0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r4.add(r3)
            boolean r3 = r2.i
            if (r3 == 0) goto L2e
            android.support.v4.app.k r3 = r2.f536a
            r3.a(r2)
        L2e:
            r2 = 1
            return r2
    }

    android.support.v4.app.e b(java.util.ArrayList<android.support.v4.app.e> r5, android.support.v4.app.e r6) {
            r4 = this;
            r0 = 0
        L1:
            java.util.ArrayList<android.support.v4.app.c$a> r1 = r4.f537b
            int r1 = r1.size()
            if (r0 >= r1) goto L30
            java.util.ArrayList<android.support.v4.app.c$a> r1 = r4.f537b
            java.lang.Object r1 = r1.get(r0)
            android.support.v4.app.c$a r1 = (android.support.v4.app.c.a) r1
            int r2 = r1.f539a
            r3 = 1
            if (r2 == r3) goto L28
            r3 = 3
            if (r2 == r3) goto L22
            switch(r2) {
                case 6: goto L22;
                case 7: goto L28;
                case 8: goto L20;
                case 9: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L2d
        L1d:
            android.support.v4.app.e r6 = r1.f540b
            goto L2d
        L20:
            r6 = 0
            goto L2d
        L22:
            android.support.v4.app.e r1 = r1.f540b
            r5.add(r1)
            goto L2d
        L28:
            android.support.v4.app.e r1 = r1.f540b
            r5.remove(r1)
        L2d:
            int r0 = r0 + 1
            goto L1
        L30:
            return r6
    }

    public java.lang.String b() {
            r0 = this;
            java.lang.String r0 = r0.j
            return r0
    }

    boolean b(int r5) {
            r4 = this;
            java.util.ArrayList<android.support.v4.app.c$a> r0 = r4.f537b
            int r0 = r0.size()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L23
            java.util.ArrayList<android.support.v4.app.c$a> r3 = r4.f537b
            java.lang.Object r3 = r3.get(r2)
            android.support.v4.app.c$a r3 = (android.support.v4.app.c.a) r3
            android.support.v4.app.e r3 = r3.f540b
            if (r3 == 0) goto L19
            int r3 = r3.z
            goto L1a
        L19:
            r3 = r1
        L1a:
            if (r3 == 0) goto L20
            if (r3 != r5) goto L20
            r4 = 1
            return r4
        L20:
            int r2 = r2 + 1
            goto L8
        L23:
            return r1
    }

    boolean c() {
            r3 = this;
            r0 = 0
            r1 = r0
        L2:
            java.util.ArrayList<android.support.v4.app.c$a> r2 = r3.f537b
            int r2 = r2.size()
            if (r1 >= r2) goto L1d
            java.util.ArrayList<android.support.v4.app.c$a> r2 = r3.f537b
            java.lang.Object r2 = r2.get(r1)
            android.support.v4.app.c$a r2 = (android.support.v4.app.c.a) r2
            boolean r2 = b(r2)
            if (r2 == 0) goto L1a
            r3 = 1
            return r3
        L1a:
            int r1 = r1 + 1
            goto L2
        L1d:
            return r0
    }

    public void d() {
            r3 = this;
            java.util.ArrayList<java.lang.Runnable> r0 = r3.t
            if (r0 == 0) goto L1c
            r1 = 0
            int r0 = r0.size()
        L9:
            if (r1 >= r0) goto L19
            java.util.ArrayList<java.lang.Runnable> r2 = r3.t
            java.lang.Object r2 = r2.get(r1)
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            int r1 = r1 + 1
            goto L9
        L19:
            r0 = 0
            r3.t = r0
        L1c:
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            java.lang.String r1 = "BackStackEntry{"
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            int r1 = r2.l
            if (r1 < 0) goto L25
            java.lang.String r1 = " #"
            r0.append(r1)
            int r1 = r2.l
            r0.append(r1)
        L25:
            java.lang.String r1 = r2.j
            if (r1 == 0) goto L33
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r2 = r2.j
            r0.append(r2)
        L33:
            java.lang.String r2 = "}"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
