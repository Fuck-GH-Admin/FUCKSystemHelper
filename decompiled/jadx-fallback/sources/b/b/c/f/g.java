package b.b.c.f;

/* JADX INFO: loaded from: classes.dex */
public class g<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.LinkedHashMap<K, V> f1082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1084c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;

    public g(int r4) {
            r3 = this;
            r3.<init>()
            if (r4 <= 0) goto L13
            r3.f1084c = r4
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r0 = 0
            r1 = 1061158912(0x3f400000, float:0.75)
            r2 = 1
            r4.<init>(r0, r1, r2)
            r3.f1082a = r4
            return
        L13:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "maxSize <= 0"
            r3.<init>(r4)
            throw r3
    }

    private int c(K r3, V r4) {
            r2 = this;
            int r2 = r2.b(r3, r4)
            if (r2 < 0) goto L7
            return r2
        L7:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Negative size: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "="
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    protected V a(K r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    public final V a(K r4, V r5) {
            r3 = this;
            if (r4 == 0) goto L35
            if (r5 == 0) goto L35
            monitor-enter(r3)
            int r0 = r3.d     // Catch: java.lang.Throwable -> L32
            int r0 = r0 + 1
            r3.d = r0     // Catch: java.lang.Throwable -> L32
            int r0 = r3.f1083b     // Catch: java.lang.Throwable -> L32
            int r1 = r3.c(r4, r5)     // Catch: java.lang.Throwable -> L32
            int r0 = r0 + r1
            r3.f1083b = r0     // Catch: java.lang.Throwable -> L32
            java.util.LinkedHashMap<K, V> r0 = r3.f1082a     // Catch: java.lang.Throwable -> L32
            java.lang.Object r0 = r0.put(r4, r5)     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L25
            int r1 = r3.f1083b     // Catch: java.lang.Throwable -> L32
            int r2 = r3.c(r4, r0)     // Catch: java.lang.Throwable -> L32
            int r1 = r1 - r2
            r3.f1083b = r1     // Catch: java.lang.Throwable -> L32
        L25:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L2c
            r1 = 0
            r3.a(r1, r4, r0, r5)
        L2c:
            int r4 = r3.f1084c
            r3.a(r4)
            return r0
        L32:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L32
            throw r4
        L35:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "key == null || value == null"
            r3.<init>(r4)
            throw r3
    }

    public void a(int r5) {
            r4 = this;
        L0:
            monitor-enter(r4)
            int r0 = r4.f1083b     // Catch: java.lang.Throwable -> L71
            if (r0 < 0) goto L52
            java.util.LinkedHashMap<K, V> r0 = r4.f1082a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L11
            int r0 = r4.f1083b     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L52
        L11:
            int r0 = r4.f1083b     // Catch: java.lang.Throwable -> L71
            if (r0 <= r5) goto L50
            java.util.LinkedHashMap<K, V> r0 = r4.f1082a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L1e
            goto L50
        L1e:
            java.util.LinkedHashMap<K, V> r0 = r4.f1082a     // Catch: java.lang.Throwable -> L71
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L71
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L71
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L71
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L71
            java.util.LinkedHashMap<K, V> r2 = r4.f1082a     // Catch: java.lang.Throwable -> L71
            r2.remove(r1)     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f1083b     // Catch: java.lang.Throwable -> L71
            int r3 = r4.c(r1, r0)     // Catch: java.lang.Throwable -> L71
            int r2 = r2 - r3
            r4.f1083b = r2     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f     // Catch: java.lang.Throwable -> L71
            r3 = 1
            int r2 = r2 + r3
            r4.f = r2     // Catch: java.lang.Throwable -> L71
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            r2 = 0
            r4.a(r3, r1, r0, r2)
            goto L0
        L50:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            return
        L52:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r0.<init>()     // Catch: java.lang.Throwable -> L71
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L71
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L71
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L71
            throw r5     // Catch: java.lang.Throwable -> L71
        L71:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            throw r5
    }

    protected void a(boolean r1, K r2, V r3, V r4) {
            r0 = this;
            return
    }

    protected int b(K r1, V r2) {
            r0 = this;
            r0 = 1
            return r0
    }

    public final V b(K r5) {
            r4 = this;
            if (r5 == 0) goto L54
            monitor-enter(r4)
            java.util.LinkedHashMap<K, V> r0 = r4.f1082a     // Catch: java.lang.Throwable -> L51
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L13
            int r5 = r4.g     // Catch: java.lang.Throwable -> L51
            int r5 = r5 + 1
            r4.g = r5     // Catch: java.lang.Throwable -> L51
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L51
            return r0
        L13:
            int r0 = r4.h     // Catch: java.lang.Throwable -> L51
            int r0 = r0 + 1
            r4.h = r0     // Catch: java.lang.Throwable -> L51
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L51
            java.lang.Object r0 = r4.a(r5)
            if (r0 != 0) goto L22
            r4 = 0
            return r4
        L22:
            monitor-enter(r4)
            int r1 = r4.e     // Catch: java.lang.Throwable -> L4e
            int r1 = r1 + 1
            r4.e = r1     // Catch: java.lang.Throwable -> L4e
            java.util.LinkedHashMap<K, V> r1 = r4.f1082a     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r1 = r1.put(r5, r0)     // Catch: java.lang.Throwable -> L4e
            if (r1 == 0) goto L37
            java.util.LinkedHashMap<K, V> r2 = r4.f1082a     // Catch: java.lang.Throwable -> L4e
            r2.put(r5, r1)     // Catch: java.lang.Throwable -> L4e
            goto L40
        L37:
            int r2 = r4.f1083b     // Catch: java.lang.Throwable -> L4e
            int r3 = r4.c(r5, r0)     // Catch: java.lang.Throwable -> L4e
            int r2 = r2 + r3
            r4.f1083b = r2     // Catch: java.lang.Throwable -> L4e
        L40:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L4e
            if (r1 == 0) goto L48
            r2 = 0
            r4.a(r2, r5, r0, r1)
            return r1
        L48:
            int r5 = r4.f1084c
            r4.a(r5)
            return r0
        L4e:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L4e
            throw r5
        L51:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L51
            throw r5
        L54:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "key == null"
            r4.<init>(r5)
            throw r4
    }

    public final synchronized java.lang.String toString() {
            r6 = this;
            monitor-enter(r6)
            int r0 = r6.g     // Catch: java.lang.Throwable -> L3e
            int r1 = r6.h     // Catch: java.lang.Throwable -> L3e
            int r0 = r0 + r1
            r1 = 0
            if (r0 == 0) goto Lf
            int r2 = r6.g     // Catch: java.lang.Throwable -> L3e
            int r2 = r2 * 100
            int r2 = r2 / r0
            goto L10
        Lf:
            r2 = r1
        L10:
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]"
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L3e
            int r5 = r6.f1084c     // Catch: java.lang.Throwable -> L3e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L3e
            r4[r1] = r5     // Catch: java.lang.Throwable -> L3e
            r1 = 1
            int r5 = r6.g     // Catch: java.lang.Throwable -> L3e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L3e
            r4[r1] = r5     // Catch: java.lang.Throwable -> L3e
            r1 = 2
            int r5 = r6.h     // Catch: java.lang.Throwable -> L3e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L3e
            r4[r1] = r5     // Catch: java.lang.Throwable -> L3e
            r1 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L3e
            r4[r1] = r2     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = java.lang.String.format(r0, r3, r4)     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r6)
            return r0
        L3e:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
    }
}
