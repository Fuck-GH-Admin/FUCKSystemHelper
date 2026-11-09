package android.arch.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.HashMap<java.lang.String, android.arch.lifecycle.n> f404a;

    public p() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f404a = r0
            return
    }

    final android.arch.lifecycle.n a(java.lang.String r1) {
            r0 = this;
            java.util.HashMap<java.lang.String, android.arch.lifecycle.n> r0 = r0.f404a
            java.lang.Object r0 = r0.get(r1)
            android.arch.lifecycle.n r0 = (android.arch.lifecycle.n) r0
            return r0
    }

    public final void a() {
            r2 = this;
            java.util.HashMap<java.lang.String, android.arch.lifecycle.n> r0 = r2.f404a
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            android.arch.lifecycle.n r1 = (android.arch.lifecycle.n) r1
            r1.a()
            goto La
        L1a:
            java.util.HashMap<java.lang.String, android.arch.lifecycle.n> r2 = r2.f404a
            r2.clear()
            return
    }

    final void a(java.lang.String r1, android.arch.lifecycle.n r2) {
            r0 = this;
            java.util.HashMap<java.lang.String, android.arch.lifecycle.n> r0 = r0.f404a
            java.lang.Object r0 = r0.put(r1, r2)
            android.arch.lifecycle.n r0 = (android.arch.lifecycle.n) r0
            if (r0 == 0) goto Ld
            r0.a()
        Ld:
            return
    }
}
