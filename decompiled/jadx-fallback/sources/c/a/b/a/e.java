package c.a.b.a;

/* JADX INFO: loaded from: classes.dex */
public class e {

    public static class a extends java.lang.Exception {
        public a(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public a(java.lang.Throwable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    public static java.lang.String a(byte[] r1) {
            byte[] r0 = c.a.b.e.a.g.a()
            byte[] r1 = c.a.b.e.a.c.a(r0, r0, r1)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            return r0
    }

    public static java.lang.reflect.Method a(java.lang.Class r0, java.lang.String r1, java.lang.Class[] r2) {
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)
            r1 = 1
            r0.setAccessible(r1)
            return r0
    }
}
