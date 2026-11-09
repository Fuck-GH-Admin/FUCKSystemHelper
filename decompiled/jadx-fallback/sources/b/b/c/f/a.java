package b.b.c.f;

/* JADX INFO: loaded from: classes.dex */
public class a<K, V> extends b.b.c.f.k<K, V> implements java.util.Map<K, V> {
    b.b.c.f.h<K, V> i;

    /* JADX INFO: renamed from: b.b.c.f.a$a, reason: collision with other inner class name */
    class C0046a extends b.b.c.f.h<K, V> {
        final /* synthetic */ b.b.c.f.a d;

        C0046a(b.b.c.f.a r1) {
                r0 = this;
                r0.d = r1
                r0.<init>()
                return
        }

        @Override // b.b.c.f.h
        protected int a(java.lang.Object r1) {
                r0 = this;
                b.b.c.f.a r0 = r0.d
                int r0 = r0.a(r1)
                return r0
        }

        @Override // b.b.c.f.h
        protected java.lang.Object a(int r1, int r2) {
                r0 = this;
                b.b.c.f.a r0 = r0.d
                java.lang.Object[] r0 = r0.f1096c
                int r1 = r1 << 1
                int r1 = r1 + r2
                r0 = r0[r1]
                return r0
        }

        @Override // b.b.c.f.h
        protected V a(int r1, V r2) {
                r0 = this;
                b.b.c.f.a r0 = r0.d
                java.lang.Object r0 = r0.a(r1, r2)
                return r0
        }

        @Override // b.b.c.f.h
        protected void a() {
                r0 = this;
                b.b.c.f.a r0 = r0.d
                r0.clear()
                return
        }

        @Override // b.b.c.f.h
        protected void a(int r1) {
                r0 = this;
                b.b.c.f.a r0 = r0.d
                r0.c(r1)
                return
        }

        @Override // b.b.c.f.h
        protected void a(K r1, V r2) {
                r0 = this;
                b.b.c.f.a r0 = r0.d
                r0.put(r1, r2)
                return
        }

        @Override // b.b.c.f.h
        protected int b(java.lang.Object r1) {
                r0 = this;
                b.b.c.f.a r0 = r0.d
                int r0 = r0.b(r1)
                return r0
        }

        @Override // b.b.c.f.h
        protected java.util.Map<K, V> b() {
                r0 = this;
                b.b.c.f.a r0 = r0.d
                return r0
        }

        @Override // b.b.c.f.h
        protected int c() {
                r0 = this;
                b.b.c.f.a r0 = r0.d
                int r0 = r0.d
                return r0
        }
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public a(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private b.b.c.f.h<K, V> b() {
            r1 = this;
            b.b.c.f.h<K, V> r0 = r1.i
            if (r0 != 0) goto Lb
            b.b.c.f.a$a r0 = new b.b.c.f.a$a
            r0.<init>(r1)
            r1.i = r0
        Lb:
            b.b.c.f.h<K, V> r1 = r1.i
            return r1
    }

    public boolean a(java.util.Collection<?> r1) {
            r0 = this;
            boolean r0 = b.b.c.f.h.c(r0, r1)
            return r0
    }

    @Override // java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r0 = this;
            b.b.c.f.h r0 = r0.b()
            java.util.Set r0 = r0.d()
            return r0
    }

    @Override // java.util.Map
    public java.util.Set<K> keySet() {
            r0 = this;
            b.b.c.f.h r0 = r0.b()
            java.util.Set r0 = r0.e()
            return r0
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> r3) {
            r2 = this;
            int r0 = r2.d
            int r1 = r3.size()
            int r0 = r0 + r1
            r2.a(r0)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L12:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r2.put(r1, r0)
            goto L12
        L2a:
            return
    }

    @Override // java.util.Map
    public java.util.Collection<V> values() {
            r0 = this;
            b.b.c.f.h r0 = r0.b()
            java.util.Collection r0 = r0.f()
            return r0
    }
}
