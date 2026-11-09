package b.a.a.b;

/* JADX INFO: loaded from: classes.dex */
public class a<K, V> extends b.a.a.b.b<K, V> {
    private java.util.HashMap<K, b.a.a.b.b.d<K, V>> f;

    public a() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f = r0
            return
    }

    @Override // b.a.a.b.b
    protected b.a.a.b.b.d<K, V> a(K r1) {
            r0 = this;
            java.util.HashMap<K, b.a.a.b.b$d<K, V>> r0 = r0.f
            java.lang.Object r0 = r0.get(r1)
            b.a.a.b.b$d r0 = (b.a.a.b.b.d) r0
            return r0
    }

    @Override // b.a.a.b.b
    public V b(K r2, V r3) {
            r1 = this;
            b.a.a.b.b$d r0 = r1.a(r2)
            if (r0 == 0) goto L9
            V r1 = r0.f973c
            return r1
        L9:
            java.util.HashMap<K, b.a.a.b.b$d<K, V>> r0 = r1.f
            b.a.a.b.b$d r1 = r1.a(r2, r3)
            r0.put(r2, r1)
            r1 = 0
            return r1
    }

    public java.util.Map.Entry<K, V> b(K r2) {
            r1 = this;
            boolean r0 = r1.contains(r2)
            if (r0 == 0) goto L11
            java.util.HashMap<K, b.a.a.b.b$d<K, V>> r1 = r1.f
            java.lang.Object r1 = r1.get(r2)
            b.a.a.b.b$d r1 = (b.a.a.b.b.d) r1
            b.a.a.b.b$d<K, V> r1 = r1.e
            return r1
        L11:
            r1 = 0
            return r1
    }

    public boolean contains(K r1) {
            r0 = this;
            java.util.HashMap<K, b.a.a.b.b$d<K, V>> r0 = r0.f
            boolean r0 = r0.containsKey(r1)
            return r0
    }

    @Override // b.a.a.b.b
    public V remove(K r2) {
            r1 = this;
            java.lang.Object r0 = super.remove(r2)
            java.util.HashMap<K, b.a.a.b.b$d<K, V>> r1 = r1.f
            r1.remove(r2)
            return r0
    }
}
