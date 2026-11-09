package android.support.v4.app;

/* JADX INFO: loaded from: classes.dex */
public class CoreComponentFactory extends android.app.AppComponentFactory {

    public interface a {
        java.lang.Object a();
    }

    public CoreComponentFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    static <T> T a(T r1) {
            boolean r0 = r1 instanceof android.support.v4.app.CoreComponentFactory.a
            if (r0 == 0) goto Le
            r0 = r1
            android.support.v4.app.CoreComponentFactory$a r0 = (android.support.v4.app.CoreComponentFactory.a) r0
            java.lang.Object r0 = r0.a()
            if (r0 == 0) goto Le
            return r0
        Le:
            return r1
    }

    @Override // android.app.AppComponentFactory
    public android.app.Activity instantiateActivity(java.lang.ClassLoader r1, java.lang.String r2, android.content.Intent r3) {
            r0 = this;
            android.app.Activity r0 = super.instantiateActivity(r1, r2, r3)
            java.lang.Object r0 = a(r0)
            android.app.Activity r0 = (android.app.Activity) r0
            return r0
    }

    @Override // android.app.AppComponentFactory
    public android.app.Application instantiateApplication(java.lang.ClassLoader r1, java.lang.String r2) {
            r0 = this;
            android.app.Application r0 = super.instantiateApplication(r1, r2)
            java.lang.Object r0 = a(r0)
            android.app.Application r0 = (android.app.Application) r0
            return r0
    }

    @Override // android.app.AppComponentFactory
    public android.content.ContentProvider instantiateProvider(java.lang.ClassLoader r1, java.lang.String r2) {
            r0 = this;
            android.content.ContentProvider r0 = super.instantiateProvider(r1, r2)
            java.lang.Object r0 = a(r0)
            android.content.ContentProvider r0 = (android.content.ContentProvider) r0
            return r0
    }

    @Override // android.app.AppComponentFactory
    public android.content.BroadcastReceiver instantiateReceiver(java.lang.ClassLoader r1, java.lang.String r2, android.content.Intent r3) {
            r0 = this;
            android.content.BroadcastReceiver r0 = super.instantiateReceiver(r1, r2, r3)
            java.lang.Object r0 = a(r0)
            android.content.BroadcastReceiver r0 = (android.content.BroadcastReceiver) r0
            return r0
    }

    @Override // android.app.AppComponentFactory
    public android.app.Service instantiateService(java.lang.ClassLoader r1, java.lang.String r2, android.content.Intent r3) {
            r0 = this;
            android.app.Service r0 = super.instantiateService(r1, r2, r3)
            java.lang.Object r0 = a(r0)
            android.app.Service r0 = (android.app.Service) r0
            return r0
    }
}
