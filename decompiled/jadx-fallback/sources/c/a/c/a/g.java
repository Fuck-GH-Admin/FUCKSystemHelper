package c.a.c.a;

/* JADX INFO: loaded from: classes.dex */
class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.content.Context f1292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.util.HashMap f1293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c.a.c.a.g.a f1294c;

    interface a {
        void a(java.lang.Object r1);
    }

    protected g(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f1293b = r0
            r1.f1294c = r0
            r1.f1292a = r2
            return
    }

    static /* synthetic */ android.content.Context a(c.a.c.a.g r0) {
            android.content.Context r0 = r0.f1292a
            return r0
    }

    private java.util.HashMap a(java.util.HashMap r4) {
            r3 = this;
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Set r0 = r4.keySet()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.toString()
            java.lang.Object r2 = r4.get(r1)
            r3.put(r1, r2)
            goto Ld
        L25:
            return r3
    }

    static /* synthetic */ void a(c.a.c.a.g r0, java.lang.String r1) {
            r0.a(r1)
            return
    }

    private void a(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "status"
            if (r4 != 0) goto L6
            java.lang.String r4 = ""
        L6:
            r1 = -1
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L16
            r2.<init>(r4)     // Catch: org.json.JSONException -> L16
            boolean r4 = r2.has(r0)     // Catch: org.json.JSONException -> L16
            if (r4 != 0) goto L23
            r2.put(r0, r1)     // Catch: org.json.JSONException -> L16
            goto L23
        L16:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            r2.put(r0, r1)     // Catch: org.json.JSONException -> L1f
            goto L23
        L1f:
            r4 = move-exception
            r4.printStackTrace()
        L23:
            c.a.c.a.g$a r3 = r3.f1294c
            if (r3 == 0) goto L2e
            java.lang.String r4 = r2.toString()
            r3.a(r4)
        L2e:
            return
    }

    static /* synthetic */ java.util.HashMap b(c.a.c.a.g r0) {
            java.util.HashMap r0 = r0.f1293b
            return r0
    }

    protected void a(java.util.HashMap r7, java.lang.String r8, int r9, java.lang.String r10, java.lang.String r11, c.a.c.a.g.a r12) {
            r6 = this;
            java.util.HashMap r7 = r6.a(r7)
            r6.f1293b = r7
            r6.f1294c = r12
            java.lang.Thread r7 = new java.lang.Thread
            c.a.c.a.h r12 = new c.a.c.a.h
            r0 = r12
            r1 = r6
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r7.<init>(r12)
            r7.start()
            return
    }
}
