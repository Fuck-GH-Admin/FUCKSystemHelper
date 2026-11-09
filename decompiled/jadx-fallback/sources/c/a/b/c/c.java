package c.a.b.c;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.util.Map f1214a;

    public interface a {
        java.util.List a();
    }

    public c(c.a.b.c.c.a r4) {
            r3 = this;
            r3.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.f1214a = r0
            java.util.List r4 = r4.a()
            java.util.Iterator r4 = r4.iterator()
        L12:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L28
            java.lang.Object r0 = r4.next()
            c.a.b.c.a r0 = (c.a.b.c.a) r0
            java.util.Map r1 = r3.f1214a
            java.lang.String r2 = r0.a()
            r1.put(r2, r0)
            goto L12
        L28:
            return
    }

    public java.util.List a() {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Map r1 = r1.f1214a
            java.util.Collection r1 = r1.values()
            r0.<init>(r1)
            return r0
    }
}
