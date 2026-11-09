package android.support.v4.app;

/* JADX INFO: loaded from: classes.dex */
public final class y implements java.lang.Iterable<android.content.Intent> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.ArrayList<android.content.Intent> f622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.content.Context f623c;

    public interface a {
        android.content.Intent c();
    }

    private y(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f622b = r0
            r1.f623c = r2
            return
    }

    public static android.support.v4.app.y a(android.content.Context r1) {
            android.support.v4.app.y r0 = new android.support.v4.app.y
            r0.<init>(r1)
            return r0
    }

    public android.support.v4.app.y a(android.app.Activity r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.support.v4.app.y.a
            if (r0 == 0) goto Lc
            r0 = r2
            android.support.v4.app.y$a r0 = (android.support.v4.app.y.a) r0
            android.content.Intent r0 = r0.c()
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 != 0) goto L13
            android.content.Intent r0 = android.support.v4.app.t.a(r2)
        L13:
            if (r0 == 0) goto L2b
            android.content.ComponentName r2 = r0.getComponent()
            if (r2 != 0) goto L25
            android.content.Context r2 = r1.f623c
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            android.content.ComponentName r2 = r0.resolveActivity(r2)
        L25:
            r1.a(r2)
            r1.a(r0)
        L2b:
            return r1
    }

    public android.support.v4.app.y a(android.content.ComponentName r3) {
            r2 = this;
            java.util.ArrayList<android.content.Intent> r0 = r2.f622b
            int r0 = r0.size()
            android.content.Context r1 = r2.f623c     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b
        L8:
            android.content.Intent r3 = android.support.v4.app.t.a(r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b
            if (r3 == 0) goto L1a
            java.util.ArrayList<android.content.Intent> r1 = r2.f622b     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b
            r1.add(r0, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b
            android.content.Context r1 = r2.f623c     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b
            android.content.ComponentName r3 = r3.getComponent()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b
            goto L8
        L1a:
            return r2
        L1b:
            r2 = move-exception
            java.lang.String r3 = "TaskStackBuilder"
            java.lang.String r0 = "Bad ComponentName while traversing activity parent metadata"
            android.util.Log.e(r3, r0)
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>(r2)
            throw r3
    }

    public android.support.v4.app.y a(android.content.Intent r2) {
            r1 = this;
            java.util.ArrayList<android.content.Intent> r0 = r1.f622b
            r0.add(r2)
            return r1
    }

    public void a() {
            r1 = this;
            r0 = 0
            r1.a(r0)
            return
    }

    public void a(android.os.Bundle r5) {
            r4 = this;
            java.util.ArrayList<android.content.Intent> r0 = r4.f622b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L44
            java.util.ArrayList<android.content.Intent> r0 = r4.f622b
            int r1 = r0.size()
            android.content.Intent[] r1 = new android.content.Intent[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            android.content.Intent[] r0 = (android.content.Intent[]) r0
            android.content.Intent r1 = new android.content.Intent
            r2 = 0
            r3 = r0[r2]
            r1.<init>(r3)
            r3 = 268484608(0x1000c000, float:2.539146E-29)
            android.content.Intent r1 = r1.addFlags(r3)
            r0[r2] = r1
            android.content.Context r1 = r4.f623c
            boolean r5 = b.b.c.a.a.a(r1, r0, r5)
            if (r5 != 0) goto L43
            android.content.Intent r5 = new android.content.Intent
            int r1 = r0.length
            int r1 = r1 + (-1)
            r0 = r0[r1]
            r5.<init>(r0)
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r5.addFlags(r0)
            android.content.Context r4 = r4.f623c
            r4.startActivity(r5)
        L43:
            return
        L44:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "No intents added to TaskStackBuilder; cannot startActivities"
            r4.<init>(r5)
            throw r4
    }

    @Override // java.lang.Iterable
    @java.lang.Deprecated
    public java.util.Iterator<android.content.Intent> iterator() {
            r0 = this;
            java.util.ArrayList<android.content.Intent> r0 = r0.f622b
            java.util.Iterator r0 = r0.iterator()
            return r0
    }
}
