package b.b.c.f;

/* JADX INFO: loaded from: classes.dex */
abstract class h<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    b.b.c.f.h<K, V>.b f1085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    b.b.c.f.h<K, V>.c f1086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    b.b.c.f.h<K, V>.e f1087c;

    final class a<T> implements java.util.Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f1088b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f1089c;
        int d;
        boolean e;
        final /* synthetic */ b.b.c.f.h f;

        a(b.b.c.f.h r2, int r3) {
                r1 = this;
                r1.f = r2
                r1.<init>()
                r0 = 0
                r1.e = r0
                r1.f1088b = r3
                int r2 = r2.c()
                r1.f1089c = r2
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                int r0 = r1.d
                int r1 = r1.f1089c
                if (r0 >= r1) goto L8
                r1 = 1
                goto L9
            L8:
                r1 = 0
            L9:
                return r1
        }

        @Override // java.util.Iterator
        public T next() {
                r3 = this;
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L19
                b.b.c.f.h r0 = r3.f
                int r1 = r3.d
                int r2 = r3.f1088b
                java.lang.Object r0 = r0.a(r1, r2)
                int r1 = r3.d
                r2 = 1
                int r1 = r1 + r2
                r3.d = r1
                r3.e = r2
                return r0
            L19:
                java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
                r3.<init>()
                throw r3
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                boolean r0 = r2.e
                if (r0 == 0) goto L19
                int r0 = r2.d
                int r0 = r0 + (-1)
                r2.d = r0
                int r1 = r2.f1089c
                int r1 = r1 + (-1)
                r2.f1089c = r1
                r1 = 0
                r2.e = r1
                b.b.c.f.h r2 = r2.f
                r2.a(r0)
                return
            L19:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                r2.<init>()
                throw r2
        }
    }

    final class b implements java.util.Set<java.util.Map.Entry<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b.b.c.f.h f1090b;

        b(b.b.c.f.h r1) {
                r0 = this;
                r0.f1090b = r1
                r0.<init>()
                return
        }

        public boolean a(java.util.Map.Entry<K, V> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Set, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(java.lang.Object r1) {
                r0 = this;
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                r0.a(r1)
                r0 = 0
                throw r0
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(java.util.Collection<? extends java.util.Map.Entry<K, V>> r5) {
                r4 = this;
                b.b.c.f.h r0 = r4.f1090b
                int r0 = r0.c()
                java.util.Iterator r5 = r5.iterator()
            La:
                boolean r1 = r5.hasNext()
                if (r1 == 0) goto L24
                java.lang.Object r1 = r5.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                b.b.c.f.h r2 = r4.f1090b
                java.lang.Object r3 = r1.getKey()
                java.lang.Object r1 = r1.getValue()
                r2.a(r3, r1)
                goto La
            L24:
                b.b.c.f.h r4 = r4.f1090b
                int r4 = r4.c()
                if (r0 == r4) goto L2e
                r4 = 1
                goto L2f
            L2e:
                r4 = 0
            L2f:
                return r4
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
                r0 = this;
                b.b.c.f.h r0 = r0.f1090b
                r0.a()
                return
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                b.b.c.f.h r0 = r3.f1090b
                java.lang.Object r2 = r4.getKey()
                int r0 = r0.a(r2)
                if (r0 >= 0) goto L15
                return r1
            L15:
                b.b.c.f.h r3 = r3.f1090b
                r1 = 1
                java.lang.Object r3 = r3.a(r0, r1)
                java.lang.Object r4 = r4.getValue()
                boolean r3 = b.b.c.f.c.a(r3, r4)
                return r3
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(java.util.Collection<?> r2) {
                r1 = this;
                java.util.Iterator r2 = r2.iterator()
            L4:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L16
                java.lang.Object r0 = r2.next()
                boolean r0 = r1.contains(r0)
                if (r0 != 0) goto L4
                r1 = 0
                return r1
            L16:
                r1 = 1
                return r1
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(java.lang.Object r1) {
                r0 = this;
                boolean r0 = b.b.c.f.h.a(r0, r1)
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
                r6 = this;
                b.b.c.f.h r0 = r6.f1090b
                int r0 = r0.c()
                r1 = 1
                int r0 = r0 - r1
                r2 = 0
                r3 = r2
            La:
                if (r0 < 0) goto L2d
                b.b.c.f.h r4 = r6.f1090b
                java.lang.Object r4 = r4.a(r0, r2)
                b.b.c.f.h r5 = r6.f1090b
                java.lang.Object r5 = r5.a(r0, r1)
                if (r4 != 0) goto L1c
                r4 = r2
                goto L20
            L1c:
                int r4 = r4.hashCode()
            L20:
                if (r5 != 0) goto L24
                r5 = r2
                goto L28
            L24:
                int r5 = r5.hashCode()
            L28:
                r4 = r4 ^ r5
                int r3 = r3 + r4
                int r0 = r0 + (-1)
                goto La
            L2d:
                return r3
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
                r0 = this;
                b.b.c.f.h r0 = r0.f1090b
                int r0 = r0.c()
                if (r0 != 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                return r0
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
                r1 = this;
                b.b.c.f.h$d r0 = new b.b.c.f.h$d
                b.b.c.f.h r1 = r1.f1090b
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(java.lang.Object r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(java.util.Collection<?> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(java.util.Collection<?> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
                r0 = this;
                b.b.c.f.h r0 = r0.f1090b
                int r0 = r0.c()
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public java.lang.Object[] toArray() {
                r0 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }
    }

    final class c implements java.util.Set<K> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b.b.c.f.h f1091b;

        c(b.b.c.f.h r1) {
                r0 = this;
                r0.f1091b = r1
                r0.<init>()
                return
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(java.util.Collection<? extends K> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
                r0 = this;
                b.b.c.f.h r0 = r0.f1091b
                r0.a()
                return
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(java.lang.Object r1) {
                r0 = this;
                b.b.c.f.h r0 = r0.f1091b
                int r0 = r0.a(r1)
                if (r0 < 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(java.util.Collection<?> r1) {
                r0 = this;
                b.b.c.f.h r0 = r0.f1091b
                java.util.Map r0 = r0.b()
                boolean r0 = b.b.c.f.h.a(r0, r1)
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(java.lang.Object r1) {
                r0 = this;
                boolean r0 = b.b.c.f.h.a(r0, r1)
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
                r4 = this;
                b.b.c.f.h r0 = r4.f1091b
                int r0 = r0.c()
                int r0 = r0 + (-1)
                r1 = 0
                r2 = r1
            La:
                if (r0 < 0) goto L1e
                b.b.c.f.h r3 = r4.f1091b
                java.lang.Object r3 = r3.a(r0, r1)
                if (r3 != 0) goto L16
                r3 = r1
                goto L1a
            L16:
                int r3 = r3.hashCode()
            L1a:
                int r2 = r2 + r3
                int r0 = r0 + (-1)
                goto La
            L1e:
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
                r0 = this;
                b.b.c.f.h r0 = r0.f1091b
                int r0 = r0.c()
                if (r0 != 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                return r0
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<K> iterator() {
                r2 = this;
                b.b.c.f.h$a r0 = new b.b.c.f.h$a
                b.b.c.f.h r2 = r2.f1091b
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(java.lang.Object r2) {
                r1 = this;
                b.b.c.f.h r0 = r1.f1091b
                int r2 = r0.a(r2)
                if (r2 < 0) goto Lf
                b.b.c.f.h r1 = r1.f1091b
                r1.a(r2)
                r1 = 1
                return r1
            Lf:
                r1 = 0
                return r1
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(java.util.Collection<?> r1) {
                r0 = this;
                b.b.c.f.h r0 = r0.f1091b
                java.util.Map r0 = r0.b()
                boolean r0 = b.b.c.f.h.b(r0, r1)
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(java.util.Collection<?> r1) {
                r0 = this;
                b.b.c.f.h r0 = r0.f1091b
                java.util.Map r0 = r0.b()
                boolean r0 = b.b.c.f.h.c(r0, r1)
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
                r0 = this;
                b.b.c.f.h r0 = r0.f1091b
                int r0 = r0.c()
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public java.lang.Object[] toArray() {
                r1 = this;
                b.b.c.f.h r1 = r1.f1091b
                r0 = 0
                java.lang.Object[] r1 = r1.b(r0)
                return r1
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] r2) {
                r1 = this;
                b.b.c.f.h r1 = r1.f1091b
                r0 = 0
                java.lang.Object[] r1 = r1.a(r2, r0)
                return r1
        }
    }

    final class d implements java.util.Iterator<java.util.Map.Entry<K, V>>, java.util.Map.Entry<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f1092b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f1093c;
        boolean d;
        final /* synthetic */ b.b.c.f.h e;

        d(b.b.c.f.h r2) {
                r1 = this;
                r1.e = r2
                r1.<init>()
                r0 = 0
                r1.d = r0
                int r2 = r2.c()
                int r2 = r2 + (-1)
                r1.f1092b = r2
                r2 = -1
                r1.f1093c = r2
                return
        }

        @Override // java.util.Map.Entry
        public boolean equals(java.lang.Object r5) {
                r4 = this;
                boolean r0 = r4.d
                if (r0 == 0) goto L33
                boolean r0 = r5 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto La
                return r1
            La:
                java.util.Map$Entry r5 = (java.util.Map.Entry) r5
                java.lang.Object r0 = r5.getKey()
                b.b.c.f.h r2 = r4.e
                int r3 = r4.f1093c
                java.lang.Object r2 = r2.a(r3, r1)
                boolean r0 = b.b.c.f.c.a(r0, r2)
                r2 = 1
                if (r0 == 0) goto L32
                java.lang.Object r5 = r5.getValue()
                b.b.c.f.h r0 = r4.e
                int r4 = r4.f1093c
                java.lang.Object r4 = r0.a(r4, r2)
                boolean r4 = b.b.c.f.c.a(r5, r4)
                if (r4 == 0) goto L32
                r1 = r2
            L32:
                return r1
            L33:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "This container does not support retaining Map.Entry objects"
                r4.<init>(r5)
                throw r4
        }

        @Override // java.util.Map.Entry
        public K getKey() {
                r2 = this;
                boolean r0 = r2.d
                if (r0 == 0) goto Le
                b.b.c.f.h r0 = r2.e
                int r2 = r2.f1093c
                r1 = 0
                java.lang.Object r2 = r0.a(r2, r1)
                return r2
            Le:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "This container does not support retaining Map.Entry objects"
                r2.<init>(r0)
                throw r2
        }

        @Override // java.util.Map.Entry
        public V getValue() {
                r2 = this;
                boolean r0 = r2.d
                if (r0 == 0) goto Le
                b.b.c.f.h r0 = r2.e
                int r2 = r2.f1093c
                r1 = 1
                java.lang.Object r2 = r0.a(r2, r1)
                return r2
            Le:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "This container does not support retaining Map.Entry objects"
                r2.<init>(r0)
                throw r2
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                int r0 = r1.f1093c
                int r1 = r1.f1092b
                if (r0 >= r1) goto L8
                r1 = 1
                goto L9
            L8:
                r1 = 0
            L9:
                return r1
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
                r4 = this;
                boolean r0 = r4.d
                if (r0 == 0) goto L28
                b.b.c.f.h r0 = r4.e
                int r1 = r4.f1093c
                r2 = 0
                java.lang.Object r0 = r0.a(r1, r2)
                b.b.c.f.h r1 = r4.e
                int r4 = r4.f1093c
                r3 = 1
                java.lang.Object r4 = r1.a(r4, r3)
                if (r0 != 0) goto L1a
                r0 = r2
                goto L1e
            L1a:
                int r0 = r0.hashCode()
            L1e:
                if (r4 != 0) goto L21
                goto L25
            L21:
                int r2 = r4.hashCode()
            L25:
                r4 = r0 ^ r2
                return r4
            L28:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "This container does not support retaining Map.Entry objects"
                r4.<init>(r0)
                throw r4
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
                r0 = this;
                r0.next()
                return r0
        }

        @Override // java.util.Iterator
        public java.util.Map.Entry<K, V> next() {
                r2 = this;
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto Lf
                int r0 = r2.f1093c
                r1 = 1
                int r0 = r0 + r1
                r2.f1093c = r0
                r2.d = r1
                return r2
            Lf:
                java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
                r2.<init>()
                throw r2
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                boolean r0 = r2.d
                if (r0 == 0) goto L1b
                b.b.c.f.h r0 = r2.e
                int r1 = r2.f1093c
                r0.a(r1)
                int r0 = r2.f1093c
                int r0 = r0 + (-1)
                r2.f1093c = r0
                int r0 = r2.f1092b
                int r0 = r0 + (-1)
                r2.f1092b = r0
                r0 = 0
                r2.d = r0
                return
            L1b:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                r2.<init>()
                throw r2
        }

        @Override // java.util.Map.Entry
        public V setValue(V r2) {
                r1 = this;
                boolean r0 = r1.d
                if (r0 == 0) goto Ld
                b.b.c.f.h r0 = r1.e
                int r1 = r1.f1093c
                java.lang.Object r1 = r0.a(r1, r2)
                return r1
            Ld:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "This container does not support retaining Map.Entry objects"
                r1.<init>(r2)
                throw r1
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.Object r1 = r2.getKey()
                r0.append(r1)
                java.lang.String r1 = "="
                r0.append(r1)
                java.lang.Object r2 = r2.getValue()
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                return r2
        }
    }

    final class e implements java.util.Collection<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b.b.c.f.h f1094b;

        e(b.b.c.f.h r1) {
                r0 = this;
                r0.f1094b = r1
                r0.<init>()
                return
        }

        @Override // java.util.Collection
        public boolean add(V r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Collection
        public boolean addAll(java.util.Collection<? extends V> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Collection
        public void clear() {
                r0 = this;
                b.b.c.f.h r0 = r0.f1094b
                r0.a()
                return
        }

        @Override // java.util.Collection
        public boolean contains(java.lang.Object r1) {
                r0 = this;
                b.b.c.f.h r0 = r0.f1094b
                int r0 = r0.b(r1)
                if (r0 < 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                return r0
        }

        @Override // java.util.Collection
        public boolean containsAll(java.util.Collection<?> r2) {
                r1 = this;
                java.util.Iterator r2 = r2.iterator()
            L4:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L16
                java.lang.Object r0 = r2.next()
                boolean r0 = r1.contains(r0)
                if (r0 != 0) goto L4
                r1 = 0
                return r1
            L16:
                r1 = 1
                return r1
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
                r0 = this;
                b.b.c.f.h r0 = r0.f1094b
                int r0 = r0.c()
                if (r0 != 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                return r0
        }

        @Override // java.util.Collection, java.lang.Iterable
        public java.util.Iterator<V> iterator() {
                r2 = this;
                b.b.c.f.h$a r0 = new b.b.c.f.h$a
                b.b.c.f.h r2 = r2.f1094b
                r1 = 1
                r0.<init>(r2, r1)
                return r0
        }

        @Override // java.util.Collection
        public boolean remove(java.lang.Object r2) {
                r1 = this;
                b.b.c.f.h r0 = r1.f1094b
                int r2 = r0.b(r2)
                if (r2 < 0) goto Lf
                b.b.c.f.h r1 = r1.f1094b
                r1.a(r2)
                r1 = 1
                return r1
            Lf:
                r1 = 0
                return r1
        }

        @Override // java.util.Collection
        public boolean removeAll(java.util.Collection<?> r6) {
                r5 = this;
                b.b.c.f.h r0 = r5.f1094b
                int r0 = r0.c()
                r1 = 0
                r2 = r1
            L8:
                if (r1 >= r0) goto L23
                b.b.c.f.h r3 = r5.f1094b
                r4 = 1
                java.lang.Object r3 = r3.a(r1, r4)
                boolean r3 = r6.contains(r3)
                if (r3 == 0) goto L21
                b.b.c.f.h r2 = r5.f1094b
                r2.a(r1)
                int r1 = r1 + (-1)
                int r0 = r0 + (-1)
                r2 = r4
            L21:
                int r1 = r1 + r4
                goto L8
            L23:
                return r2
        }

        @Override // java.util.Collection
        public boolean retainAll(java.util.Collection<?> r6) {
                r5 = this;
                b.b.c.f.h r0 = r5.f1094b
                int r0 = r0.c()
                r1 = 0
                r2 = r1
            L8:
                if (r1 >= r0) goto L23
                b.b.c.f.h r3 = r5.f1094b
                r4 = 1
                java.lang.Object r3 = r3.a(r1, r4)
                boolean r3 = r6.contains(r3)
                if (r3 != 0) goto L21
                b.b.c.f.h r2 = r5.f1094b
                r2.a(r1)
                int r1 = r1 + (-1)
                int r0 = r0 + (-1)
                r2 = r4
            L21:
                int r1 = r1 + r4
                goto L8
            L23:
                return r2
        }

        @Override // java.util.Collection
        public int size() {
                r0 = this;
                b.b.c.f.h r0 = r0.f1094b
                int r0 = r0.c()
                return r0
        }

        @Override // java.util.Collection
        public java.lang.Object[] toArray() {
                r1 = this;
                b.b.c.f.h r1 = r1.f1094b
                r0 = 1
                java.lang.Object[] r1 = r1.b(r0)
                return r1
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] r2) {
                r1 = this;
                b.b.c.f.h r1 = r1.f1094b
                r0 = 1
                java.lang.Object[] r1 = r1.a(r2, r0)
                return r1
        }
    }

    h() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <K, V> boolean a(java.util.Map<K, V> r1, java.util.Collection<?> r2) {
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r2.next()
            boolean r0 = r1.containsKey(r0)
            if (r0 != 0) goto L4
            r1 = 0
            return r1
        L16:
            r1 = 1
            return r1
    }

    public static <T> boolean a(java.util.Set<T> r4, java.lang.Object r5) {
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof java.util.Set
            r2 = 0
            if (r1 == 0) goto L1e
            java.util.Set r5 = (java.util.Set) r5
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L1e
            int r3 = r5.size()     // Catch: java.lang.Throwable -> L1e
            if (r1 != r3) goto L1c
            boolean r4 = r4.containsAll(r5)     // Catch: java.lang.Throwable -> L1e
            if (r4 == 0) goto L1c
            goto L1d
        L1c:
            r0 = r2
        L1d:
            return r0
        L1e:
            return r2
    }

    public static <K, V> boolean b(java.util.Map<K, V> r2, java.util.Collection<?> r3) {
            int r0 = r2.size()
            java.util.Iterator r3 = r3.iterator()
        L8:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r3.next()
            r2.remove(r1)
            goto L8
        L16:
            int r2 = r2.size()
            if (r0 == r2) goto L1e
            r2 = 1
            goto L1f
        L1e:
            r2 = 0
        L1f:
            return r2
    }

    public static <K, V> boolean c(java.util.Map<K, V> r3, java.util.Collection<?> r4) {
            int r0 = r3.size()
            java.util.Set r1 = r3.keySet()
            java.util.Iterator r1 = r1.iterator()
        Lc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L20
            java.lang.Object r2 = r1.next()
            boolean r2 = r4.contains(r2)
            if (r2 != 0) goto Lc
            r1.remove()
            goto Lc
        L20:
            int r3 = r3.size()
            if (r0 == r3) goto L28
            r3 = 1
            goto L29
        L28:
            r3 = 0
        L29:
            return r3
    }

    protected abstract int a(java.lang.Object r1);

    protected abstract java.lang.Object a(int r1, int r2);

    protected abstract V a(int r1, V r2);

    protected abstract void a();

    protected abstract void a(int r1);

    protected abstract void a(K r1, V r2);

    public <T> T[] a(T[] r4, int r5) {
            r3 = this;
            int r0 = r3.c()
            int r1 = r4.length
            if (r1 >= r0) goto L15
            java.lang.Class r4 = r4.getClass()
            java.lang.Class r4 = r4.getComponentType()
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r0)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
        L15:
            r1 = 0
        L16:
            if (r1 >= r0) goto L21
            java.lang.Object r2 = r3.a(r1, r5)
            r4[r1] = r2
            int r1 = r1 + 1
            goto L16
        L21:
            int r3 = r4.length
            if (r3 <= r0) goto L27
            r3 = 0
            r4[r0] = r3
        L27:
            return r4
    }

    protected abstract int b(java.lang.Object r1);

    protected abstract java.util.Map<K, V> b();

    public java.lang.Object[] b(int r5) {
            r4 = this;
            int r0 = r4.c()
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
        L7:
            if (r2 >= r0) goto L12
            java.lang.Object r3 = r4.a(r2, r5)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L7
        L12:
            return r1
    }

    protected abstract int c();

    public java.util.Set<java.util.Map.Entry<K, V>> d() {
            r1 = this;
            b.b.c.f.h<K, V>$b r0 = r1.f1085a
            if (r0 != 0) goto Lb
            b.b.c.f.h$b r0 = new b.b.c.f.h$b
            r0.<init>(r1)
            r1.f1085a = r0
        Lb:
            b.b.c.f.h<K, V>$b r1 = r1.f1085a
            return r1
    }

    public java.util.Set<K> e() {
            r1 = this;
            b.b.c.f.h<K, V>$c r0 = r1.f1086b
            if (r0 != 0) goto Lb
            b.b.c.f.h$c r0 = new b.b.c.f.h$c
            r0.<init>(r1)
            r1.f1086b = r0
        Lb:
            b.b.c.f.h<K, V>$c r1 = r1.f1086b
            return r1
    }

    public java.util.Collection<V> f() {
            r1 = this;
            b.b.c.f.h<K, V>$e r0 = r1.f1087c
            if (r0 != 0) goto Lb
            b.b.c.f.h$e r0 = new b.b.c.f.h$e
            r0.<init>(r1)
            r1.f1087c = r0
        Lb:
            b.b.c.f.h<K, V>$e r1 = r1.f1087c
            return r1
    }
}
