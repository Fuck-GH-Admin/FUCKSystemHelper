package c.d.a.b;

/* JADX INFO: loaded from: classes.dex */
public class k {
    public static java.lang.Class<?> a(java.lang.String r0) {
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L5
            goto La
        L5:
            r0 = move-exception
            r0.printStackTrace()
            r0 = 0
        La:
            return r0
    }

    public static java.lang.Object a(java.lang.reflect.Method r1, java.lang.Object r2, java.lang.Object... r3) {
            r0 = 1
            r1.setAccessible(r0)     // Catch: java.lang.Exception -> L9
            java.lang.Object r1 = r1.invoke(r2, r3)     // Catch: java.lang.Exception -> L9
            goto Le
        L9:
            r1 = move-exception
            r1.printStackTrace()
            r1 = 0
        Le:
            return r1
    }

    public static java.lang.reflect.Method a(java.lang.Class<?> r0, java.lang.String r1, java.lang.Class<?>... r2) {
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Exception -> L5
            goto La
        L5:
            r0 = move-exception
            r0.printStackTrace()
            r0 = 0
        La:
            return r0
    }
}
