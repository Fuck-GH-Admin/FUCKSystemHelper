package c.a.c.a;

/* JADX INFO: loaded from: classes.dex */
class n extends android.os.Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ c.a.c.a.b f1306a;

    n(c.a.c.a.b r1, android.os.Looper r2) {
            r0 = this;
            r0.f1306a = r1
            r0.<init>(r2)
            return
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message r3) {
            r2 = this;
            java.lang.String r0 = "handleMessage !!"
            c.a.c.a.d.a(r0)
            int r0 = r3.what
            if (r0 != 0) goto L12
            c.a.c.a.b r2 = r2.f1306a
            java.lang.Object r0 = r3.obj
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            c.a.c.a.b.a(r2, r0)
        L12:
            android.os.Bundle r2 = r3.getData()
            java.lang.String r0 = "listenerKey"
            java.lang.String r2 = r2.getString(r0)
            java.util.Hashtable r0 = c.a.c.a.b.c()
            java.lang.Object r2 = r0.get(r2)
            c.a.c.a.c r2 = (c.a.c.a.c) r2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "handleMessage listener = "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            c.a.c.a.d.a(r0)
            if (r2 == 0) goto L47
            int r0 = r3.what
            java.lang.Object r3 = r3.obj
            java.lang.String r3 = r3.toString()
            r2.a(r0, r3)
        L47:
            return
    }
}
