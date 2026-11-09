package com.mobiletools.systemhelper.service;

/* JADX INFO: loaded from: classes.dex */
public interface a extends android.os.IInterface {

    /* JADX INFO: renamed from: com.mobiletools.systemhelper.service.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0057a extends android.os.Binder implements com.mobiletools.systemhelper.service.a {
        public AbstractBinderC0057a() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "com.mobiletools.systemhelper.service.IRegisterHelperService"
                r1.attachInterface(r1, r0)
                return
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
                r0 = this;
                return r0
        }

        @Override // android.os.Binder
        public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) {
                r3 = this;
                r0 = 1
                java.lang.String r1 = "com.mobiletools.systemhelper.service.IRegisterHelperService"
                if (r4 == r0) goto L52
                r2 = 2
                if (r4 == r2) goto L47
                r2 = 3
                if (r4 == r2) goto L40
                r2 = 4
                if (r4 == r2) goto L2d
                r2 = 5
                if (r4 == r2) goto L1f
                r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r4 == r2) goto L1b
                boolean r3 = super.onTransact(r4, r5, r6, r7)
                return r3
            L1b:
                r6.writeString(r1)
                return r0
            L1f:
                r5.enforceInterface(r1)
                boolean r3 = r3.a()
                r6.writeNoException()
                r6.writeInt(r3)
                return r0
            L2d:
                r5.enforceInterface(r1)
                int r4 = r5.readInt()
                if (r4 == 0) goto L38
                r4 = r0
                goto L39
            L38:
                r4 = 0
            L39:
                r3.a(r4)
            L3c:
                r6.writeNoException()
                return r0
            L40:
                r5.enforceInterface(r1)
                r3.b()
                goto L3c
            L47:
                r5.enforceInterface(r1)
                int r4 = r5.readInt()
                r3.a(r4)
                goto L3c
            L52:
                r5.enforceInterface(r1)
                java.lang.String r4 = r5.readString()
                r3.a(r4)
                goto L3c
        }
    }

    void a(int r1);

    void a(java.lang.String r1);

    void a(boolean r1);

    boolean a();

    void b();
}
