package android.arch.lifecycle;

/* JADX INFO: loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements android.arch.lifecycle.GenericLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.arch.lifecycle.a.C0022a f381b;

    ReflectiveGenericLifecycleObserver(java.lang.Object r2) {
            r1 = this;
            r1.<init>()
            r1.f380a = r2
            android.arch.lifecycle.a r0 = android.arch.lifecycle.a.f383c
            java.lang.Class r2 = r2.getClass()
            android.arch.lifecycle.a$a r2 = r0.a(r2)
            r1.f381b = r2
            return
    }

    @Override // android.arch.lifecycle.GenericLifecycleObserver
    public void a(android.arch.lifecycle.e r2, android.arch.lifecycle.c.a r3) {
            r1 = this;
            android.arch.lifecycle.a$a r0 = r1.f381b
            java.lang.Object r1 = r1.f380a
            r0.a(r2, r3, r1)
            return
    }
}
