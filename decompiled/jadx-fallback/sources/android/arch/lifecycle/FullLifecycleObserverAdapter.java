package android.arch.lifecycle;

/* JADX INFO: loaded from: classes.dex */
class FullLifecycleObserverAdapter implements android.arch.lifecycle.GenericLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.arch.lifecycle.FullLifecycleObserver f371a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f372a = null;

        static {
                android.arch.lifecycle.c$a[] r0 = android.arch.lifecycle.c.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                android.arch.lifecycle.FullLifecycleObserverAdapter.a.f372a = r0
                android.arch.lifecycle.c$a r1 = android.arch.lifecycle.c.a.ON_CREATE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = android.arch.lifecycle.FullLifecycleObserverAdapter.a.f372a     // Catch: java.lang.NoSuchFieldError -> L1d
                android.arch.lifecycle.c$a r1 = android.arch.lifecycle.c.a.ON_START     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = android.arch.lifecycle.FullLifecycleObserverAdapter.a.f372a     // Catch: java.lang.NoSuchFieldError -> L28
                android.arch.lifecycle.c$a r1 = android.arch.lifecycle.c.a.ON_RESUME     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = android.arch.lifecycle.FullLifecycleObserverAdapter.a.f372a     // Catch: java.lang.NoSuchFieldError -> L33
                android.arch.lifecycle.c$a r1 = android.arch.lifecycle.c.a.ON_PAUSE     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = android.arch.lifecycle.FullLifecycleObserverAdapter.a.f372a     // Catch: java.lang.NoSuchFieldError -> L3e
                android.arch.lifecycle.c$a r1 = android.arch.lifecycle.c.a.ON_STOP     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = android.arch.lifecycle.FullLifecycleObserverAdapter.a.f372a     // Catch: java.lang.NoSuchFieldError -> L49
                android.arch.lifecycle.c$a r1 = android.arch.lifecycle.c.a.ON_DESTROY     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = android.arch.lifecycle.FullLifecycleObserverAdapter.a.f372a     // Catch: java.lang.NoSuchFieldError -> L54
                android.arch.lifecycle.c$a r1 = android.arch.lifecycle.c.a.ON_ANY     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                return
        }
    }

    FullLifecycleObserverAdapter(android.arch.lifecycle.FullLifecycleObserver r1) {
            r0 = this;
            r0.<init>()
            r0.f371a = r1
            return
    }

    @Override // android.arch.lifecycle.GenericLifecycleObserver
    public void a(android.arch.lifecycle.e r2, android.arch.lifecycle.c.a r3) {
            r1 = this;
            int[] r0 = android.arch.lifecycle.FullLifecycleObserverAdapter.a.f372a
            int r3 = r3.ordinal()
            r3 = r0[r3]
            switch(r3) {
                case 1: goto L32;
                case 2: goto L2c;
                case 3: goto L26;
                case 4: goto L20;
                case 5: goto L1a;
                case 6: goto L14;
                case 7: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L37
        Lc:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "ON_ANY must not been send by anybody"
            r1.<init>(r2)
            throw r1
        L14:
            android.arch.lifecycle.FullLifecycleObserver r1 = r1.f371a
            r1.a(r2)
            goto L37
        L1a:
            android.arch.lifecycle.FullLifecycleObserver r1 = r1.f371a
            r1.e(r2)
            goto L37
        L20:
            android.arch.lifecycle.FullLifecycleObserver r1 = r1.f371a
            r1.d(r2)
            goto L37
        L26:
            android.arch.lifecycle.FullLifecycleObserver r1 = r1.f371a
            r1.f(r2)
            goto L37
        L2c:
            android.arch.lifecycle.FullLifecycleObserver r1 = r1.f371a
            r1.b(r2)
            goto L37
        L32:
            android.arch.lifecycle.FullLifecycleObserver r1 = r1.f371a
            r1.c(r2)
        L37:
            return
    }
}
