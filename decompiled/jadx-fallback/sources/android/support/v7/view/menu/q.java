package android.support.v7.view.menu;

/* JADX INFO: loaded from: classes.dex */
public final class q {
    public static android.view.Menu a(android.content.Context r1, b.b.c.c.a.a r2) {
            android.support.v7.view.menu.r r0 = new android.support.v7.view.menu.r
            r0.<init>(r1, r2)
            return r0
    }

    public static android.view.MenuItem a(android.content.Context r2, b.b.c.c.a.b r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto Lc
            android.support.v7.view.menu.l r0 = new android.support.v7.view.menu.l
            r0.<init>(r2, r3)
            return r0
        Lc:
            android.support.v7.view.menu.k r0 = new android.support.v7.view.menu.k
            r0.<init>(r2, r3)
            return r0
    }

    public static android.view.SubMenu a(android.content.Context r1, b.b.c.c.a.c r2) {
            android.support.v7.view.menu.v r0 = new android.support.v7.view.menu.v
            r0.<init>(r1, r2)
            return r0
    }
}
