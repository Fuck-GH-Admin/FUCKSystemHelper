package android.support.v4.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f613b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ java.util.ArrayList f614c;
        final /* synthetic */ java.util.ArrayList d;
        final /* synthetic */ java.util.ArrayList e;
        final /* synthetic */ java.util.ArrayList f;

        a(android.support.v4.app.r r1, int r2, java.util.ArrayList r3, java.util.ArrayList r4, java.util.ArrayList r5, java.util.ArrayList r6) {
                r0 = this;
                r0.f613b = r2
                r0.f614c = r3
                r0.d = r4
                r0.e = r5
                r0.f = r6
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                r0 = 0
            L1:
                int r1 = r3.f613b
                if (r0 >= r1) goto L2e
                java.util.ArrayList r1 = r3.f614c
                java.lang.Object r1 = r1.get(r0)
                android.view.View r1 = (android.view.View) r1
                java.util.ArrayList r2 = r3.d
                java.lang.Object r2 = r2.get(r0)
                java.lang.String r2 = (java.lang.String) r2
                b.b.c.g.q.a(r1, r2)
                java.util.ArrayList r1 = r3.e
                java.lang.Object r1 = r1.get(r0)
                android.view.View r1 = (android.view.View) r1
                java.util.ArrayList r2 = r3.f
                java.lang.Object r2 = r2.get(r0)
                java.lang.String r2 = (java.lang.String) r2
                b.b.c.g.q.a(r1, r2)
                int r0 = r0 + 1
                goto L1
            L2e:
                return
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.util.ArrayList f615b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ java.util.Map f616c;

        b(android.support.v4.app.r r1, java.util.ArrayList r2, java.util.Map r3) {
                r0 = this;
                r0.f615b = r2
                r0.f616c = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r5 = this;
                java.util.ArrayList r0 = r5.f615b
                int r0 = r0.size()
                r1 = 0
            L7:
                if (r1 >= r0) goto L23
                java.util.ArrayList r2 = r5.f615b
                java.lang.Object r2 = r2.get(r1)
                android.view.View r2 = (android.view.View) r2
                java.lang.String r3 = b.b.c.g.q.f(r2)
                if (r3 == 0) goto L20
                java.util.Map r4 = r5.f616c
                java.lang.String r3 = android.support.v4.app.r.a(r4, r3)
                b.b.c.g.q.a(r2, r3)
            L20:
                int r1 = r1 + 1
                goto L7
            L23:
                return
        }
    }

    class c implements java.lang.Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.util.ArrayList f617b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ java.util.Map f618c;

        c(android.support.v4.app.r r1, java.util.ArrayList r2, java.util.Map r3) {
                r0 = this;
                r0.f617b = r2
                r0.f618c = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r5 = this;
                java.util.ArrayList r0 = r5.f617b
                int r0 = r0.size()
                r1 = 0
            L7:
                if (r1 >= r0) goto L23
                java.util.ArrayList r2 = r5.f617b
                java.lang.Object r2 = r2.get(r1)
                android.view.View r2 = (android.view.View) r2
                java.lang.String r3 = b.b.c.g.q.f(r2)
                java.util.Map r4 = r5.f618c
                java.lang.Object r3 = r4.get(r3)
                java.lang.String r3 = (java.lang.String) r3
                b.b.c.g.q.a(r2, r3)
                int r1 = r1 + 1
                goto L7
            L23:
                return
        }
    }

    public r() {
            r0 = this;
            r0.<init>()
            return
    }

    static java.lang.String a(java.util.Map<java.lang.String, java.lang.String> r2, java.lang.String r3) {
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getValue()
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L8
            java.lang.Object r2 = r0.getKey()
            java.lang.String r2 = (java.lang.String) r2
            return r2
        L25:
            r2 = 0
            return r2
    }

    protected static void a(java.util.List<android.view.View> r6, android.view.View r7) {
            int r0 = r6.size()
            boolean r1 = a(r6, r7, r0)
            if (r1 == 0) goto Lb
            return
        Lb:
            r6.add(r7)
            r7 = r0
        Lf:
            int r1 = r6.size()
            if (r7 >= r1) goto L3b
            java.lang.Object r1 = r6.get(r7)
            android.view.View r1 = (android.view.View) r1
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L38
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r2 = r1.getChildCount()
            r3 = 0
        L26:
            if (r3 >= r2) goto L38
            android.view.View r4 = r1.getChildAt(r3)
            boolean r5 = a(r6, r4, r0)
            if (r5 != 0) goto L35
            r6.add(r4)
        L35:
            int r3 = r3 + 1
            goto L26
        L38:
            int r7 = r7 + 1
            goto Lf
        L3b:
            return
    }

    protected static boolean a(java.util.List r0) {
            if (r0 == 0) goto Lb
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }

    private static boolean a(java.util.List<android.view.View> r3, android.view.View r4, int r5) {
            r0 = 0
            r1 = r0
        L2:
            if (r1 >= r5) goto Lf
            java.lang.Object r2 = r3.get(r1)
            if (r2 != r4) goto Lc
            r3 = 1
            return r3
        Lc:
            int r1 = r1 + 1
            goto L2
        Lf:
            return r0
    }

    public abstract java.lang.Object a(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3);

    java.util.ArrayList<java.lang.String> a(java.util.ArrayList<android.view.View> r5) {
            r4 = this;
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r0 = r5.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L20
            java.lang.Object r2 = r5.get(r1)
            android.view.View r2 = (android.view.View) r2
            java.lang.String r3 = b.b.c.g.q.f(r2)
            r4.add(r3)
            r3 = 0
            b.b.c.g.q.a(r2, r3)
            int r1 = r1 + 1
            goto La
        L20:
            return r4
    }

    protected void a(android.view.View r6, android.graphics.Rect r7) {
            r5 = this;
            r5 = 2
            int[] r5 = new int[r5]
            r6.getLocationOnScreen(r5)
            r0 = 0
            r1 = r5[r0]
            r2 = 1
            r3 = r5[r2]
            r0 = r5[r0]
            int r4 = r6.getWidth()
            int r0 = r0 + r4
            r5 = r5[r2]
            int r6 = r6.getHeight()
            int r5 = r5 + r6
            r7.set(r1, r3, r0, r5)
            return
    }

    void a(android.view.View r9, java.util.ArrayList<android.view.View> r10, java.util.ArrayList<android.view.View> r11, java.util.ArrayList<java.lang.String> r12, java.util.Map<java.lang.String, java.lang.String> r13) {
            r8 = this;
            int r2 = r11.size()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r0 = 0
            r1 = r0
        Lb:
            if (r1 >= r2) goto L44
            java.lang.Object r3 = r10.get(r1)
            android.view.View r3 = (android.view.View) r3
            java.lang.String r4 = b.b.c.g.q.f(r3)
            r6.add(r4)
            if (r4 != 0) goto L1d
            goto L41
        L1d:
            r5 = 0
            b.b.c.g.q.a(r3, r5)
            java.lang.Object r3 = r13.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            r5 = r0
        L28:
            if (r5 >= r2) goto L41
            java.lang.Object r7 = r12.get(r5)
            boolean r7 = r3.equals(r7)
            if (r7 == 0) goto L3e
            java.lang.Object r3 = r11.get(r5)
            android.view.View r3 = (android.view.View) r3
            b.b.c.g.q.a(r3, r4)
            goto L41
        L3e:
            int r5 = r5 + 1
            goto L28
        L41:
            int r1 = r1 + 1
            goto Lb
        L44:
            android.support.v4.app.r$a r13 = new android.support.v4.app.r$a
            r0 = r13
            r1 = r8
            r3 = r11
            r4 = r12
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            android.support.v4.app.u.a(r9, r13)
            return
    }

    void a(android.view.View r2, java.util.ArrayList<android.view.View> r3, java.util.Map<java.lang.String, java.lang.String> r4) {
            r1 = this;
            android.support.v4.app.r$b r0 = new android.support.v4.app.r$b
            r0.<init>(r1, r3, r4)
            android.support.v4.app.u.a(r2, r0)
            return
    }

    public abstract void a(android.view.ViewGroup r1, java.lang.Object r2);

    void a(android.view.ViewGroup r2, java.util.ArrayList<android.view.View> r3, java.util.Map<java.lang.String, java.lang.String> r4) {
            r1 = this;
            android.support.v4.app.r$c r0 = new android.support.v4.app.r$c
            r0.<init>(r1, r3, r4)
            android.support.v4.app.u.a(r2, r0)
            return
    }

    public abstract void a(java.lang.Object r1, android.graphics.Rect r2);

    public abstract void a(java.lang.Object r1, android.view.View r2);

    public abstract void a(java.lang.Object r1, android.view.View r2, java.util.ArrayList<android.view.View> r3);

    public abstract void a(java.lang.Object r1, java.lang.Object r2, java.util.ArrayList<android.view.View> r3, java.lang.Object r4, java.util.ArrayList<android.view.View> r5, java.lang.Object r6, java.util.ArrayList<android.view.View> r7);

    public abstract void a(java.lang.Object r1, java.util.ArrayList<android.view.View> r2);

    public abstract void a(java.lang.Object r1, java.util.ArrayList<android.view.View> r2, java.util.ArrayList<android.view.View> r3);

    void a(java.util.ArrayList<android.view.View> r4, android.view.View r5) {
            r3 = this;
            int r0 = r5.getVisibility()
            if (r0 != 0) goto L27
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto L24
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            boolean r0 = b.b.c.g.s.a(r5)
            if (r0 == 0) goto L13
            goto L24
        L13:
            int r0 = r5.getChildCount()
            r1 = 0
        L18:
            if (r1 >= r0) goto L27
            android.view.View r2 = r5.getChildAt(r1)
            r3.a(r4, r2)
            int r1 = r1 + 1
            goto L18
        L24:
            r4.add(r5)
        L27:
            return
    }

    void a(java.util.Map<java.lang.String, android.view.View> r4, android.view.View r5) {
            r3 = this;
            int r0 = r5.getVisibility()
            if (r0 != 0) goto L26
            java.lang.String r0 = b.b.c.g.q.f(r5)
            if (r0 == 0) goto Lf
            r4.put(r0, r5)
        Lf:
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto L26
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            int r0 = r5.getChildCount()
            r1 = 0
        L1a:
            if (r1 >= r0) goto L26
            android.view.View r2 = r5.getChildAt(r1)
            r3.a(r4, r2)
            int r1 = r1 + 1
            goto L1a
        L26:
            return
    }

    public abstract boolean a(java.lang.Object r1);

    public abstract java.lang.Object b(java.lang.Object r1);

    public abstract java.lang.Object b(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3);

    public abstract void b(java.lang.Object r1, android.view.View r2);

    public abstract void b(java.lang.Object r1, android.view.View r2, java.util.ArrayList<android.view.View> r3);

    public abstract void b(java.lang.Object r1, java.util.ArrayList<android.view.View> r2, java.util.ArrayList<android.view.View> r3);

    public abstract java.lang.Object c(java.lang.Object r1);

    public abstract void c(java.lang.Object r1, android.view.View r2);
}
