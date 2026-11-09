package android.arch.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements android.arch.lifecycle.GenericLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.arch.lifecycle.b[] f370a;

    CompositeGeneratedAdaptersObserver(android.arch.lifecycle.b[] r1) {
            r0 = this;
            r0.<init>()
            r0.f370a = r1
            return
    }

    @Override // android.arch.lifecycle.GenericLifecycleObserver
    public void a(android.arch.lifecycle.e r7, android.arch.lifecycle.c.a r8) {
            r6 = this;
            android.arch.lifecycle.i r0 = new android.arch.lifecycle.i
            r0.<init>()
            android.arch.lifecycle.b[] r1 = r6.f370a
            int r2 = r1.length
            r3 = 0
            r4 = r3
        La:
            if (r4 >= r2) goto L14
            r5 = r1[r4]
            r5.a(r7, r8, r3, r0)
            int r4 = r4 + 1
            goto La
        L14:
            android.arch.lifecycle.b[] r6 = r6.f370a
            int r1 = r6.length
        L17:
            if (r3 >= r1) goto L22
            r2 = r6[r3]
            r4 = 1
            r2.a(r7, r8, r4, r0)
            int r3 = r3 + 1
            goto L17
        L22:
            return
    }
}
