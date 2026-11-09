package c.a.c.a;

/* JADX INFO: loaded from: classes.dex */
class l extends java.net.Authenticator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ c.a.c.a.k f1305a;

    l(c.a.c.a.k r1) {
            r0 = this;
            r0.f1305a = r1
            r0.<init>()
            return
    }

    @Override // java.net.Authenticator
    protected java.net.PasswordAuthentication getPasswordAuthentication() {
            r2 = this;
            c.a.c.a.k r0 = r2.f1305a
            java.lang.String r0 = c.a.c.a.k.a(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2f
            c.a.c.a.k r0 = r2.f1305a
            java.lang.String r0 = c.a.c.a.k.b(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L19
            goto L2f
        L19:
            java.net.PasswordAuthentication r0 = new java.net.PasswordAuthentication
            c.a.c.a.k r1 = r2.f1305a
            java.lang.String r1 = c.a.c.a.k.a(r1)
            c.a.c.a.k r2 = r2.f1305a
            java.lang.String r2 = c.a.c.a.k.b(r2)
            char[] r2 = r2.toCharArray()
            r0.<init>(r1, r2)
            return r0
        L2f:
            java.lang.String r2 = "Proxy Username or Password is null"
            c.a.c.a.d.a(r2)
            r2 = 0
            return r2
    }
}
