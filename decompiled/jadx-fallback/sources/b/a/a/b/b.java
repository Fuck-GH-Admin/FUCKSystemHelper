package b.a.a.b;

/* JADX INFO: loaded from: classes.dex */
public class b<K, V> implements java.lang.Iterable<java.util.Map.Entry<K, V>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b.a.a.b.b.d<K, V> f970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b.a.a.b.b.d<K, V> f971c;
    private java.util.WeakHashMap<b.a.a.b.b.g<K, V>, java.lang.Boolean> d;
    private int e;

    static /* synthetic */ class a {
    }

    /* JADX INFO: renamed from: b.a.a.b.b$b, reason: collision with other inner class name */
    static class C0036b<K, V> extends b.a.a.b.b.f<K, V> {
        C0036b(b.a.a.b.b.d<K, V> r1, b.a.a.b.b.d<K, V> r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // b.a.a.b.b.f
        b.a.a.b.b.d<K, V> b(b.a.a.b.b.d<K, V> r1) {
                r0 = this;
                b.a.a.b.b$d<K, V> r0 = r1.e
                return r0
        }

        @Override // b.a.a.b.b.f
        b.a.a.b.b.d<K, V> c(b.a.a.b.b.d<K, V> r1) {
                r0 = this;
                b.a.a.b.b$d<K, V> r0 = r1.d
                return r0
        }
    }

    private static class c<K, V> extends b.a.a.b.b.f<K, V> {
        c(b.a.a.b.b.d<K, V> r1, b.a.a.b.b.d<K, V> r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // b.a.a.b.b.f
        b.a.a.b.b.d<K, V> b(b.a.a.b.b.d<K, V> r1) {
                r0 = this;
                b.a.a.b.b$d<K, V> r0 = r1.d
                return r0
        }

        @Override // b.a.a.b.b.f
        b.a.a.b.b.d<K, V> c(b.a.a.b.b.d<K, V> r1) {
                r0 = this;
                b.a.a.b.b$d<K, V> r0 = r1.e
                return r0
        }
    }

    static class d<K, V> implements java.util.Map.Entry<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final K f972b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final V f973c;
        b.a.a.b.b.d<K, V> d;
        b.a.a.b.b.d<K, V> e;

        d(K r1, V r2) {
                r0 = this;
                r0.<init>()
                r0.f972b = r1
                r0.f973c = r2
                return
        }

        @Override // java.util.Map.Entry
        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r5 != r4) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof b.a.a.b.b.d
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                b.a.a.b.b$d r5 = (b.a.a.b.b.d) r5
                K r1 = r4.f972b
                K r3 = r5.f972b
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L21
                V r4 = r4.f973c
                V r5 = r5.f973c
                boolean r4 = r4.equals(r5)
                if (r4 == 0) goto L21
                goto L22
            L21:
                r0 = r2
            L22:
                return r0
        }

        @Override // java.util.Map.Entry
        public K getKey() {
                r0 = this;
                K r0 = r0.f972b
                return r0
        }

        @Override // java.util.Map.Entry
        public V getValue() {
                r0 = this;
                V r0 = r0.f973c
                return r0
        }

        @Override // java.util.Map.Entry
        public V setValue(V r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "An entry modification is not supported"
                r0.<init>(r1)
                throw r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                K r1 = r2.f972b
                r0.append(r1)
                java.lang.String r1 = "="
                r0.append(r1)
                V r2 = r2.f973c
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                return r2
        }
    }

    private class e implements java.util.Iterator<java.util.Map.Entry<K, V>>, b.a.a.b.b.g<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b.a.a.b.b.d<K, V> f974b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f975c;
        final /* synthetic */ b.a.a.b.b d;

        private e(b.a.a.b.b r1) {
                r0 = this;
                r0.d = r1
                r0.<init>()
                r1 = 1
                r0.f975c = r1
                return
        }

        /* synthetic */ e(b.a.a.b.b r1, b.a.a.b.b.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // b.a.a.b.b.g
        public void a(b.a.a.b.b.d<K, V> r2) {
                r1 = this;
                b.a.a.b.b$d<K, V> r0 = r1.f974b
                if (r2 != r0) goto Lf
                b.a.a.b.b$d<K, V> r2 = r0.e
                r1.f974b = r2
                if (r2 != 0) goto Lc
                r2 = 1
                goto Ld
            Lc:
                r2 = 0
            Ld:
                r1.f975c = r2
            Lf:
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r3 = this;
                boolean r0 = r3.f975c
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L11
                b.a.a.b.b r3 = r3.d
                b.a.a.b.b$d r3 = b.a.a.b.b.a(r3)
                if (r3 == 0) goto Lf
                goto L10
            Lf:
                r1 = r2
            L10:
                return r1
            L11:
                b.a.a.b.b$d<K, V> r3 = r3.f974b
                if (r3 == 0) goto L1a
                b.a.a.b.b$d<K, V> r3 = r3.d
                if (r3 == 0) goto L1a
                goto L1b
            L1a:
                r1 = r2
            L1b:
                return r1
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
                r0 = this;
                java.util.Map$Entry r0 = r0.next()
                return r0
        }

        @Override // java.util.Iterator
        public java.util.Map.Entry<K, V> next() {
                r1 = this;
                boolean r0 = r1.f975c
                if (r0 == 0) goto L10
                r0 = 0
                r1.f975c = r0
                b.a.a.b.b r0 = r1.d
                b.a.a.b.b$d r0 = b.a.a.b.b.a(r0)
            Ld:
                r1.f974b = r0
                goto L19
            L10:
                b.a.a.b.b$d<K, V> r0 = r1.f974b
                if (r0 == 0) goto L17
                b.a.a.b.b$d<K, V> r0 = r0.d
                goto Ld
            L17:
                r0 = 0
                goto Ld
            L19:
                b.a.a.b.b$d<K, V> r1 = r1.f974b
                return r1
        }
    }

    private static abstract class f<K, V> implements java.util.Iterator<java.util.Map.Entry<K, V>>, b.a.a.b.b.g<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        b.a.a.b.b.d<K, V> f976b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        b.a.a.b.b.d<K, V> f977c;

        f(b.a.a.b.b.d<K, V> r1, b.a.a.b.b.d<K, V> r2) {
                r0 = this;
                r0.<init>()
                r0.f976b = r2
                r0.f977c = r1
                return
        }

        private b.a.a.b.b.d<K, V> a() {
                r2 = this;
                b.a.a.b.b$d<K, V> r0 = r2.f977c
                b.a.a.b.b$d<K, V> r1 = r2.f976b
                if (r0 == r1) goto Le
                if (r1 != 0) goto L9
                goto Le
            L9:
                b.a.a.b.b$d r2 = r2.c(r0)
                return r2
            Le:
                r2 = 0
                return r2
        }

        @Override // b.a.a.b.b.g
        public void a(b.a.a.b.b.d<K, V> r2) {
                r1 = this;
                b.a.a.b.b$d<K, V> r0 = r1.f976b
                if (r0 != r2) goto Ld
                b.a.a.b.b$d<K, V> r0 = r1.f977c
                if (r2 != r0) goto Ld
                r0 = 0
                r1.f977c = r0
                r1.f976b = r0
            Ld:
                b.a.a.b.b$d<K, V> r0 = r1.f976b
                if (r0 != r2) goto L17
                b.a.a.b.b$d r0 = r1.b(r0)
                r1.f976b = r0
            L17:
                b.a.a.b.b$d<K, V> r0 = r1.f977c
                if (r0 != r2) goto L21
                b.a.a.b.b$d r2 = r1.a()
                r1.f977c = r2
            L21:
                return
        }

        abstract b.a.a.b.b.d<K, V> b(b.a.a.b.b.d<K, V> r1);

        abstract b.a.a.b.b.d<K, V> c(b.a.a.b.b.d<K, V> r1);

        @Override // java.util.Iterator
        public boolean hasNext() {
                r0 = this;
                b.a.a.b.b$d<K, V> r0 = r0.f977c
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
                r0 = this;
                java.util.Map$Entry r0 = r0.next()
                return r0
        }

        @Override // java.util.Iterator
        public java.util.Map.Entry<K, V> next() {
                r2 = this;
                b.a.a.b.b$d<K, V> r0 = r2.f977c
                b.a.a.b.b$d r1 = r2.a()
                r2.f977c = r1
                return r0
        }
    }

    interface g<K, V> {
        void a(b.a.a.b.b.d<K, V> r1);
    }

    public b() {
            r1 = this;
            r1.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r1.d = r0
            r0 = 0
            r1.e = r0
            return
    }

    static /* synthetic */ b.a.a.b.b.d a(b.a.a.b.b r0) {
            b.a.a.b.b$d<K, V> r0 = r0.f970b
            return r0
    }

    protected b.a.a.b.b.d<K, V> a(K r2) {
            r1 = this;
            b.a.a.b.b$d<K, V> r1 = r1.f970b
        L2:
            if (r1 == 0) goto L10
            K r0 = r1.f972b
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Ld
            goto L10
        Ld:
            b.a.a.b.b$d<K, V> r1 = r1.d
            goto L2
        L10:
            return r1
    }

    protected b.a.a.b.b.d<K, V> a(K r2, V r3) {
            r1 = this;
            b.a.a.b.b$d r0 = new b.a.a.b.b$d
            r0.<init>(r2, r3)
            int r2 = r1.e
            int r2 = r2 + 1
            r1.e = r2
            b.a.a.b.b$d<K, V> r2 = r1.f971c
            if (r2 != 0) goto L14
            r1.f970b = r0
        L11:
            r1.f971c = r0
            return r0
        L14:
            r2.d = r0
            r0.e = r2
            goto L11
    }

    public java.util.Iterator<java.util.Map.Entry<K, V>> a() {
            r3 = this;
            b.a.a.b.b$c r0 = new b.a.a.b.b$c
            b.a.a.b.b$d<K, V> r1 = r3.f971c
            b.a.a.b.b$d<K, V> r2 = r3.f970b
            r0.<init>(r1, r2)
            java.util.WeakHashMap<b.a.a.b.b$g<K, V>, java.lang.Boolean> r3 = r3.d
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r3.put(r0, r1)
            return r0
    }

    public V b(K r2, V r3) {
            r1 = this;
            b.a.a.b.b$d r0 = r1.a(r2)
            if (r0 == 0) goto L9
            V r1 = r0.f973c
            return r1
        L9:
            r1.a(r2, r3)
            r1 = 0
            return r1
    }

    public java.util.Map.Entry<K, V> b() {
            r0 = this;
            b.a.a.b.b$d<K, V> r0 = r0.f970b
            return r0
    }

    public b.a.a.b.b<K, V>.e c() {
            r2 = this;
            b.a.a.b.b$e r0 = new b.a.a.b.b$e
            r1 = 0
            r0.<init>(r2, r1)
            java.util.WeakHashMap<b.a.a.b.b$g<K, V>, java.lang.Boolean> r2 = r2.d
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2.put(r0, r1)
            return r0
    }

    public java.util.Map.Entry<K, V> d() {
            r0 = this;
            b.a.a.b.b$d<K, V> r0 = r0.f971c
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof b.a.a.b.b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            b.a.a.b.b r5 = (b.a.a.b.b) r5
            int r1 = r4.size()
            int r3 = r5.size()
            if (r1 == r3) goto L17
            return r2
        L17:
            java.util.Iterator r4 = r4.iterator()
            java.util.Iterator r5 = r5.iterator()
        L1f:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L42
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L42
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r5.next()
            if (r1 != 0) goto L39
            if (r3 != 0) goto L41
        L39:
            if (r1 == 0) goto L1f
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L1f
        L41:
            return r2
        L42:
            boolean r4 = r4.hasNext()
            if (r4 != 0) goto L4f
            boolean r4 = r5.hasNext()
            if (r4 != 0) goto L4f
            goto L50
        L4f:
            r0 = r2
        L50:
            return r0
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
            r3 = this;
            b.a.a.b.b$b r0 = new b.a.a.b.b$b
            b.a.a.b.b$d<K, V> r1 = r3.f970b
            b.a.a.b.b$d<K, V> r2 = r3.f971c
            r0.<init>(r1, r2)
            java.util.WeakHashMap<b.a.a.b.b$g<K, V>, java.lang.Boolean> r3 = r3.d
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r3.put(r0, r1)
            return r0
    }

    public V remove(K r4) {
            r3 = this;
            b.a.a.b.b$d r4 = r3.a(r4)
            r0 = 0
            if (r4 != 0) goto L8
            return r0
        L8:
            int r1 = r3.e
            int r1 = r1 + (-1)
            r3.e = r1
            java.util.WeakHashMap<b.a.a.b.b$g<K, V>, java.lang.Boolean> r1 = r3.d
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L30
            java.util.WeakHashMap<b.a.a.b.b$g<K, V>, java.lang.Boolean> r1 = r3.d
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L20:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L30
            java.lang.Object r2 = r1.next()
            b.a.a.b.b$g r2 = (b.a.a.b.b.g) r2
            r2.a(r4)
            goto L20
        L30:
            b.a.a.b.b$d<K, V> r1 = r4.e
            if (r1 == 0) goto L39
            b.a.a.b.b$d<K, V> r2 = r4.d
            r1.d = r2
            goto L3d
        L39:
            b.a.a.b.b$d<K, V> r1 = r4.d
            r3.f970b = r1
        L3d:
            b.a.a.b.b$d<K, V> r1 = r4.d
            if (r1 == 0) goto L46
            b.a.a.b.b$d<K, V> r3 = r4.e
            r1.e = r3
            goto L4a
        L46:
            b.a.a.b.b$d<K, V> r1 = r4.e
            r3.f971c = r1
        L4a:
            r4.d = r0
            r4.e = r0
            V r3 = r4.f973c
            return r3
    }

    public int size() {
            r0 = this;
            int r0 = r0.e
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            r0.append(r1)
            java.util.Iterator r2 = r2.iterator()
        Le:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r2.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto Le
            java.lang.String r1 = ", "
            r0.append(r1)
            goto Le
        L2d:
            java.lang.String r2 = "]"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
