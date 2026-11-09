package android.support.v4.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public s() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T extends android.arch.lifecycle.e & android.arch.lifecycle.q> android.support.v4.app.s a(T r2) {
            android.support.v4.app.LoaderManagerImpl r0 = new android.support.v4.app.LoaderManagerImpl
            r1 = r2
            android.arch.lifecycle.q r1 = (android.arch.lifecycle.q) r1
            android.arch.lifecycle.p r1 = r1.b()
            r0.<init>(r2, r1)
            return r0
    }

    public abstract void a();

    @java.lang.Deprecated
    public abstract void a(java.lang.String r1, java.io.FileDescriptor r2, java.io.PrintWriter r3, java.lang.String[] r4);
}
