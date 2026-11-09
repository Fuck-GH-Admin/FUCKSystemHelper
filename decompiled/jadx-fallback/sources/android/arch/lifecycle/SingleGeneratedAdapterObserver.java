package android.arch.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public class SingleGeneratedAdapterObserver implements android.arch.lifecycle.GenericLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.arch.lifecycle.b f382a;

    SingleGeneratedAdapterObserver(android.arch.lifecycle.b r1) {
            r0 = this;
            r0.<init>()
            r0.f382a = r1
            return
    }

    @Override // android.arch.lifecycle.GenericLifecycleObserver
    public void a(android.arch.lifecycle.e r4, android.arch.lifecycle.c.a r5) {
            r3 = this;
            android.arch.lifecycle.b r0 = r3.f382a
            r1 = 0
            r2 = 0
            r0.a(r4, r5, r2, r1)
            android.arch.lifecycle.b r3 = r3.f382a
            r0 = 1
            r3.a(r4, r5, r0, r1)
            return
    }
}
