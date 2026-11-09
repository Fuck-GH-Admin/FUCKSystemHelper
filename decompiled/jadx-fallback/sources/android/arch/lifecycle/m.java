package android.arch.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public class m extends android.app.Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.arch.lifecycle.m.a f401b;

    interface a {
        void a();

        void b();

        void c();
    }

    public m() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(android.app.Activity r3) {
            android.app.FragmentManager r3 = r3.getFragmentManager()
            java.lang.String r0 = "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag"
            android.app.Fragment r1 = r3.findFragmentByTag(r0)
            if (r1 != 0) goto L1f
            android.app.FragmentTransaction r1 = r3.beginTransaction()
            android.arch.lifecycle.m r2 = new android.arch.lifecycle.m
            r2.<init>()
            android.app.FragmentTransaction r0 = r1.add(r2, r0)
            r0.commit()
            r3.executePendingTransactions()
        L1f:
            return
    }

    private void a(android.arch.lifecycle.c.a r2) {
            r1 = this;
            android.app.Activity r1 = r1.getActivity()
            boolean r0 = r1 instanceof android.arch.lifecycle.g
            if (r0 == 0) goto L12
            android.arch.lifecycle.g r1 = (android.arch.lifecycle.g) r1
            android.arch.lifecycle.f r1 = r1.a()
            r1.a(r2)
            return
        L12:
            boolean r0 = r1 instanceof android.arch.lifecycle.e
            if (r0 == 0) goto L25
            android.arch.lifecycle.e r1 = (android.arch.lifecycle.e) r1
            android.arch.lifecycle.c r1 = r1.a()
            boolean r0 = r1 instanceof android.arch.lifecycle.f
            if (r0 == 0) goto L25
            android.arch.lifecycle.f r1 = (android.arch.lifecycle.f) r1
            r1.a(r2)
        L25:
            return
    }

    private void a(android.arch.lifecycle.m.a r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r1.a()
        L5:
            return
    }

    private void b(android.arch.lifecycle.m.a r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r1.b()
        L5:
            return
    }

    private void c(android.arch.lifecycle.m.a r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r1.c()
        L5:
            return
    }

    @Override // android.app.Fragment
    public void onActivityCreated(android.os.Bundle r1) {
            r0 = this;
            super.onActivityCreated(r1)
            android.arch.lifecycle.m$a r1 = r0.f401b
            r0.a(r1)
            android.arch.lifecycle.c$a r1 = android.arch.lifecycle.c.a.ON_CREATE
            r0.a(r1)
            return
    }

    @Override // android.app.Fragment
    public void onDestroy() {
            r1 = this;
            super.onDestroy()
            android.arch.lifecycle.c$a r0 = android.arch.lifecycle.c.a.ON_DESTROY
            r1.a(r0)
            r0 = 0
            r1.f401b = r0
            return
    }

    @Override // android.app.Fragment
    public void onPause() {
            r1 = this;
            super.onPause()
            android.arch.lifecycle.c$a r0 = android.arch.lifecycle.c.a.ON_PAUSE
            r1.a(r0)
            return
    }

    @Override // android.app.Fragment
    public void onResume() {
            r1 = this;
            super.onResume()
            android.arch.lifecycle.m$a r0 = r1.f401b
            r1.b(r0)
            android.arch.lifecycle.c$a r0 = android.arch.lifecycle.c.a.ON_RESUME
            r1.a(r0)
            return
    }

    @Override // android.app.Fragment
    public void onStart() {
            r1 = this;
            super.onStart()
            android.arch.lifecycle.m$a r0 = r1.f401b
            r1.c(r0)
            android.arch.lifecycle.c$a r0 = android.arch.lifecycle.c.a.ON_START
            r1.a(r0)
            return
    }

    @Override // android.app.Fragment
    public void onStop() {
            r1 = this;
            super.onStop()
            android.arch.lifecycle.c$a r0 = android.arch.lifecycle.c.a.ON_STOP
            r1.a(r0)
            return
    }
}
