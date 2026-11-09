package android.arch.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.arch.lifecycle.o.a f402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.arch.lifecycle.p f403b;

    public interface a {
        <T extends android.arch.lifecycle.n> T a(java.lang.Class<T> r1);
    }

    public o(android.arch.lifecycle.p r1, android.arch.lifecycle.o.a r2) {
            r0 = this;
            r0.<init>()
            r0.f402a = r2
            r0.f403b = r1
            return
    }

    public <T extends android.arch.lifecycle.n> T a(java.lang.Class<T> r4) {
            r3 = this;
            java.lang.String r0 = r4.getCanonicalName()
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "android.arch.lifecycle.ViewModelProvider.DefaultKey:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.arch.lifecycle.n r3 = r3.a(r0, r4)
            return r3
        L1c:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Local and anonymous classes can not be ViewModels"
            r3.<init>(r4)
            throw r3
    }

    public <T extends android.arch.lifecycle.n> T a(java.lang.String r3, java.lang.Class<T> r4) {
            r2 = this;
            android.arch.lifecycle.p r0 = r2.f403b
            android.arch.lifecycle.n r0 = r0.a(r3)
            boolean r1 = r4.isInstance(r0)
            if (r1 == 0) goto Ld
            return r0
        Ld:
            android.arch.lifecycle.o$a r0 = r2.f402a
            android.arch.lifecycle.n r4 = r0.a(r4)
            android.arch.lifecycle.p r2 = r2.f403b
            r2.a(r3, r4)
            return r4
    }
}
