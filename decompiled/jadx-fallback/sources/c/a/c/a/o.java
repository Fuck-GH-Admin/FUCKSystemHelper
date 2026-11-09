package c.a.c.a;

/* JADX INFO: loaded from: classes.dex */
class o implements java.lang.Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f1307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f1308c;
    final /* synthetic */ java.lang.String d;
    final /* synthetic */ java.lang.String e;
    final /* synthetic */ java.util.Hashtable f;
    final /* synthetic */ c.a.c.a.b g;

    o(c.a.c.a.b r1, int r2, boolean r3, java.lang.String r4, java.lang.String r5, java.util.Hashtable r6) {
            r0 = this;
            r0.g = r1
            r0.f1307b = r2
            r0.f1308c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r21 = this;
            r0 = r21
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "status = "
            r1.append(r2)
            int r2 = r0.f1307b
            r1.append(r2)
            java.lang.String r2 = "; forced = "
            r1.append(r2)
            boolean r2 = r0.f1308c
            r1.append(r2)
            java.lang.String r2 = "checkAK = "
            r1.append(r2)
            c.a.c.a.b r2 = r0.g
            java.lang.String r3 = r0.d
            boolean r2 = c.a.c.a.b.a(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            c.a.c.a.d.a(r1)
            int r1 = r0.f1307b
            r2 = 601(0x259, float:8.42E-43)
            if (r1 == r2) goto L71
            boolean r2 = r0.f1308c
            if (r2 != 0) goto L71
            r2 = -1
            if (r1 == r2) goto L71
            c.a.c.a.b r1 = r0.g
            java.lang.String r2 = r0.d
            boolean r1 = c.a.c.a.b.a(r1, r2)
            if (r1 == 0) goto L4a
            goto L71
        L4a:
            r1 = 602(0x25a, float:8.44E-43)
            int r2 = r0.f1307b
            r3 = 0
            if (r1 != r2) goto L64
            java.lang.String r1 = "authenticate wait "
            c.a.c.a.d.a(r1)
            c.a.c.a.r r1 = c.a.c.a.b.i()
            if (r1 == 0) goto L69
            c.a.c.a.r r1 = c.a.c.a.b.i()
            r1.b()
            goto L69
        L64:
            java.lang.String r1 = "authenticate else"
            c.a.c.a.d.a(r1)
        L69:
            c.a.c.a.b r1 = r0.g
            java.lang.String r0 = r0.d
            c.a.c.a.b.a(r1, r3, r0)
            goto Ldb
        L71:
            java.lang.String r1 = "authenticate sendAuthRequest"
            c.a.c.a.d.a(r1)
            android.content.Context r1 = c.a.c.a.b.d()
            java.lang.String[] r6 = c.a.c.a.f.b(r1)
            if (r6 == 0) goto Lbc
            int r1 = r6.length
            r2 = 1
            if (r1 <= r2) goto Lbc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "authStrings.length:"
            r1.append(r2)
            int r2 = r6.length
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            c.a.c.a.d.a(r1)
            java.lang.String r1 = "more sha1 auth"
            c.a.c.a.d.a(r1)
            c.a.c.a.b r2 = r0.g
            boolean r3 = r0.f1308c
            java.lang.String r4 = r0.e
            java.util.Hashtable r5 = r0.f
            java.lang.String r7 = r0.d
            java.lang.String r8 = c.a.c.a.b.e()
            int r9 = c.a.c.a.b.f()
            java.lang.String r10 = c.a.c.a.b.g()
            java.lang.String r11 = c.a.c.a.b.h()
            c.a.c.a.b.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto Ldb
        Lbc:
            c.a.c.a.b r12 = r0.g
            boolean r13 = r0.f1308c
            java.lang.String r14 = r0.e
            java.util.Hashtable r15 = r0.f
            java.lang.String r0 = r0.d
            java.lang.String r17 = c.a.c.a.b.e()
            int r18 = c.a.c.a.b.f()
            java.lang.String r19 = c.a.c.a.b.g()
            java.lang.String r20 = c.a.c.a.b.h()
            r16 = r0
            c.a.c.a.b.a(r12, r13, r14, r15, r16, r17, r18, r19, r20)
        Ldb:
            return
    }
}
