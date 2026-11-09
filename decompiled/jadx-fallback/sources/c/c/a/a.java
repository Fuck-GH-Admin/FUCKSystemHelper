package c.c.a;

/* JADX INFO: loaded from: classes.dex */
public interface a extends android.os.IInterface {

    /* JADX INFO: renamed from: c.c.a.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0054a extends android.os.Binder implements c.c.a.a {

        /* JADX INFO: renamed from: c.c.a.a$a$a, reason: collision with other inner class name */
        private static class C0055a implements c.c.a.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private android.os.IBinder f1322a;

            C0055a(android.os.IBinder r1) {
                    r0 = this;
                    r0.<init>()
                    r0.f1322a = r1
                    return
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                    r0 = this;
                    android.os.IBinder r0 = r0.f1322a
                    return r0
            }
        }

        public static c.c.a.a a(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.gree.telephonymanager.IGreeTelephonyManager"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof c.c.a.a
                if (r1 == 0) goto L13
                c.c.a.a r0 = (c.c.a.a) r0
                return r0
            L13:
                c.c.a.a$a$a r0 = new c.c.a.a$a$a
                r0.<init>(r2)
                return r0
        }
    }
}
