package android.support.v4.app;

/* JADX INFO: loaded from: classes.dex */
public class a extends b.b.c.a.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static android.support.v4.app.a.c f533c;

    /* JADX INFO: renamed from: android.support.v4.app.a$a, reason: collision with other inner class name */
    static class RunnableC0026a implements java.lang.Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.lang.String[] f534b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.app.Activity f535c;
        final /* synthetic */ int d;

        RunnableC0026a(java.lang.String[] r1, android.app.Activity r2, int r3) {
                r0 = this;
                r0.f534b = r1
                r0.f535c = r2
                r0.d = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r6 = this;
                java.lang.String[] r0 = r6.f534b
                int r0 = r0.length
                int[] r0 = new int[r0]
                android.app.Activity r1 = r6.f535c
                android.content.pm.PackageManager r1 = r1.getPackageManager()
                android.app.Activity r2 = r6.f535c
                java.lang.String r2 = r2.getPackageName()
                java.lang.String[] r3 = r6.f534b
                int r3 = r3.length
                r4 = 0
            L15:
                if (r4 >= r3) goto L24
                java.lang.String[] r5 = r6.f534b
                r5 = r5[r4]
                int r5 = r1.checkPermission(r5, r2)
                r0[r4] = r5
                int r4 = r4 + 1
                goto L15
            L24:
                android.app.Activity r1 = r6.f535c
                android.support.v4.app.a$b r1 = (android.support.v4.app.a.b) r1
                int r2 = r6.d
                java.lang.String[] r6 = r6.f534b
                r1.onRequestPermissionsResult(r2, r6, r0)
                return
        }
    }

    public interface b {
        void onRequestPermissionsResult(int r1, java.lang.String[] r2, int[] r3);
    }

    public interface c {
        boolean a(android.app.Activity r1, int r2, int r3, android.content.Intent r4);

        boolean a(android.app.Activity r1, java.lang.String[] r2, int r3);
    }

    public interface d {
        void a(int r1);
    }

    public static android.support.v4.app.a.c a() {
            android.support.v4.app.a$c r0 = android.support.v4.app.a.f533c
            return r0
    }

    public static void a(android.app.Activity r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto La
            r2.finishAffinity()
            goto Ld
        La:
            r2.finish()
        Ld:
            return
    }

    public static void a(android.app.Activity r2, java.lang.String[] r3, int r4) {
            android.support.v4.app.a$c r0 = android.support.v4.app.a.f533c
            if (r0 == 0) goto Lb
            boolean r0 = r0.a(r2, r3, r4)
            if (r0 == 0) goto Lb
            return
        Lb:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L1f
            boolean r0 = r2 instanceof android.support.v4.app.a.d
            if (r0 == 0) goto L1b
            r0 = r2
            android.support.v4.app.a$d r0 = (android.support.v4.app.a.d) r0
            r0.a(r4)
        L1b:
            r2.requestPermissions(r3, r4)
            goto L34
        L1f:
            boolean r0 = r2 instanceof android.support.v4.app.a.b
            if (r0 == 0) goto L34
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            android.support.v4.app.a$a r1 = new android.support.v4.app.a$a
            r1.<init>(r3, r2, r4)
            r0.post(r1)
        L34:
            return
    }
}
