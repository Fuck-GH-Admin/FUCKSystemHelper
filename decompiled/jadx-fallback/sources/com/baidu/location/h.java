package com.baidu.location;

/* JADX INFO: loaded from: classes.dex */
public final class h implements a.a.a.b.h.b {
    public static java.lang.String J = null;
    public static boolean K = false;
    public java.lang.Boolean A;
    public java.lang.Boolean B;
    public boolean C;
    public a.a.a.b.h D;
    public boolean E;
    public boolean F;
    public boolean G;
    public java.lang.String H;
    public android.content.ServiceConnection I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.String f1362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.baidu.location.i f1363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.baidu.location.i f1364c;
    public boolean d;
    public android.content.Context e;
    public android.os.Messenger f;
    public com.baidu.location.h.c g;
    public final android.os.Messenger h;
    public java.util.ArrayList<com.baidu.location.d> i;
    public java.util.ArrayList<com.baidu.location.b> j;
    public com.baidu.location.c k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public com.baidu.location.h.d p;
    public boolean q;
    public final java.lang.Object r;
    public long s;
    public long t;
    public long u;
    public a.a.a.e.a v;
    public com.baidu.location.d w;
    public boolean x;
    public boolean y;
    public java.lang.Boolean z;

    public class a implements android.content.ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.baidu.location.h f1365a;

        public a(com.baidu.location.h r1) {
                r0 = this;
                r0.f1365a = r1
                r0.<init>()
                return
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(android.content.ComponentName r2, android.os.IBinder r3) {
                r1 = this;
                com.baidu.location.h r2 = r1.f1365a
                android.os.Messenger r0 = new android.os.Messenger
                r0.<init>(r3)
                com.baidu.location.h.a(r2, r0)
                com.baidu.location.h r2 = r1.f1365a
                android.os.Messenger r2 = com.baidu.location.h.a(r2)
                if (r2 != 0) goto L13
                return
            L13:
                com.baidu.location.h r2 = r1.f1365a
                r3 = 1
                com.baidu.location.h.a(r2, r3)
                com.baidu.location.h r2 = r1.f1365a
                boolean r2 = com.baidu.location.h.i(r2)
                if (r2 == 0) goto L30
                com.baidu.location.h r1 = r1.f1365a
                com.baidu.location.h$c r1 = com.baidu.location.h.l(r1)
                r2 = 2
                android.os.Message r1 = r1.obtainMessage(r2)
                r1.sendToTarget()
                goto L75
            L30:
                r2 = 0
                r0 = 11
                android.os.Message r2 = android.os.Message.obtain(r2, r0)     // Catch: java.lang.Exception -> L75
                com.baidu.location.h r0 = r1.f1365a     // Catch: java.lang.Exception -> L75
                android.os.Messenger r0 = com.baidu.location.h.r(r0)     // Catch: java.lang.Exception -> L75
                r2.replyTo = r0     // Catch: java.lang.Exception -> L75
                com.baidu.location.h r0 = r1.f1365a     // Catch: java.lang.Exception -> L75
                android.os.Bundle r0 = com.baidu.location.h.s(r0)     // Catch: java.lang.Exception -> L75
                r2.setData(r0)     // Catch: java.lang.Exception -> L75
                com.baidu.location.h r0 = r1.f1365a     // Catch: java.lang.Exception -> L75
                android.os.Messenger r0 = com.baidu.location.h.a(r0)     // Catch: java.lang.Exception -> L75
                r0.send(r2)     // Catch: java.lang.Exception -> L75
                com.baidu.location.h r2 = r1.f1365a     // Catch: java.lang.Exception -> L75
                com.baidu.location.h.a(r2, r3)     // Catch: java.lang.Exception -> L75
                com.baidu.location.h r2 = r1.f1365a     // Catch: java.lang.Exception -> L75
                com.baidu.location.i r2 = com.baidu.location.h.t(r2)     // Catch: java.lang.Exception -> L75
                if (r2 == 0) goto L75
                com.baidu.location.h r2 = r1.f1365a     // Catch: java.lang.Exception -> L75
                java.lang.Boolean r2 = com.baidu.location.h.u(r2)     // Catch: java.lang.Exception -> L75
                r2.booleanValue()     // Catch: java.lang.Exception -> L75
                com.baidu.location.h r1 = r1.f1365a     // Catch: java.lang.Exception -> L75
                com.baidu.location.h$c r1 = com.baidu.location.h.l(r1)     // Catch: java.lang.Exception -> L75
                r2 = 4
                android.os.Message r1 = r1.obtainMessage(r2)     // Catch: java.lang.Exception -> L75
                r1.sendToTarget()     // Catch: java.lang.Exception -> L75
            L75:
                return
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(android.content.ComponentName r2) {
                r1 = this;
                com.baidu.location.h r2 = r1.f1365a
                r0 = 0
                com.baidu.location.h.a(r2, r0)
                com.baidu.location.h r1 = r1.f1365a
                r2 = 0
                com.baidu.location.h.a(r1, r2)
                return
        }
    }

    public class b extends java.lang.Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.baidu.location.h f1366b;

        public b(com.baidu.location.h r1) {
                r0 = this;
                r0.f1366b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r1 = this;
                com.baidu.location.h r0 = r1.f1366b     // Catch: java.lang.Exception -> L27
                a.a.a.b.h r0 = com.baidu.location.h.v(r0)     // Catch: java.lang.Exception -> L27
                if (r0 == 0) goto L2b
                com.baidu.location.h r0 = r1.f1366b     // Catch: java.lang.Exception -> L27
                android.content.Context r0 = com.baidu.location.h.b(r0)     // Catch: java.lang.Exception -> L27
                int r0 = a.a.a.i.i.a(r0)     // Catch: java.lang.Exception -> L27
                if (r0 <= 0) goto L1d
                com.baidu.location.h r0 = r1.f1366b     // Catch: java.lang.Exception -> L27
                a.a.a.b.h r0 = com.baidu.location.h.v(r0)     // Catch: java.lang.Exception -> L27
                r0.g()     // Catch: java.lang.Exception -> L27
            L1d:
                com.baidu.location.h r1 = r1.f1366b     // Catch: java.lang.Exception -> L27
                a.a.a.b.h r1 = com.baidu.location.h.v(r1)     // Catch: java.lang.Exception -> L27
                r1.a()     // Catch: java.lang.Exception -> L27
                goto L2b
            L27:
                r1 = move-exception
                r1.printStackTrace()
            L2b:
                return
        }
    }

    public static class c extends android.os.Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.ref.WeakReference<com.baidu.location.h> f1367a;

        public c(android.os.Looper r1, com.baidu.location.h r2) {
                r0 = this;
                r0.<init>(r1)
                java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
                r1.<init>(r2)
                r0.f1367a = r1
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r6) {
                r5 = this;
                java.lang.ref.WeakReference<com.baidu.location.h> r0 = r5.f1367a
                java.lang.Object r0 = r0.get()
                com.baidu.location.h r0 = (com.baidu.location.h) r0
                if (r0 != 0) goto Lb
                return
            Lb:
                int r1 = r6.what
                r2 = 26
                if (r1 == r2) goto L1d4
                r2 = 27
                if (r1 == r2) goto L1d0
                r2 = 54
                r3 = 1
                if (r1 == r2) goto L1c4
                r2 = 55
                r4 = 0
                if (r1 == r2) goto L1b8
                r2 = 703(0x2bf, float:9.85E-43)
                if (r1 == r2) goto L1a0
                r2 = 704(0x2c0, float:9.87E-43)
                if (r1 == r2) goto L192
                switch(r1) {
                    case 1: goto L5d;
                    case 2: goto L58;
                    case 3: goto L53;
                    case 4: goto L4e;
                    case 5: goto L49;
                    case 6: goto L44;
                    case 7: goto L1d7;
                    case 8: goto L3f;
                    case 9: goto L3a;
                    case 10: goto L35;
                    case 11: goto L30;
                    case 12: goto L2b;
                    default: goto L2a;
                }
            L2a:
                goto L62
            L2b:
                com.baidu.location.h.o(r0)
                goto L1d7
            L30:
                com.baidu.location.h.m(r0)
                goto L1d7
            L35:
                com.baidu.location.h.h(r0, r6)
                goto L1d7
            L3a:
                com.baidu.location.h.g(r0, r6)
                goto L1d7
            L3f:
                com.baidu.location.h.b(r0, r6)
                goto L1d7
            L44:
                com.baidu.location.h.d(r0, r6)
                goto L1d7
            L49:
                com.baidu.location.h.c(r0, r6)
                goto L1d7
            L4e:
                com.baidu.location.h.n(r0)
                goto L1d7
            L53:
                com.baidu.location.h.a(r0, r6)
                goto L1d7
            L58:
                com.baidu.location.h.k(r0)
                goto L1d7
            L5d:
                com.baidu.location.h.j(r0)
                goto L1d7
            L62:
                r2 = 21
                if (r1 == r2) goto L14e
                r2 = 303(0x12f, float:4.25E-43)
                java.lang.String r3 = "UTF-8"
                if (r1 == r2) goto L10f
                r2 = 406(0x196, float:5.69E-43)
                if (r1 == r2) goto Ld8
                r2 = 701(0x2bd, float:9.82E-43)
                if (r1 == r2) goto Lcf
                r2 = 708(0x2c4, float:9.92E-43)
                if (r1 == r2) goto Lc6
                r2 = 804(0x324, float:1.127E-42)
                if (r1 == r2) goto L93
                r2 = 1300(0x514, float:1.822E-42)
                if (r1 == r2) goto L8e
                r2 = 1400(0x578, float:1.962E-42)
                if (r1 == r2) goto L89
                super.handleMessage(r6)
                goto L1d7
            L89:
                com.baidu.location.h.f(r0, r6)
                goto L1d7
            L8e:
                com.baidu.location.h.e(r0, r6)
                goto L1d7
            L93:
                android.os.Bundle r5 = r6.getData()     // Catch: java.lang.Exception -> L1d7
                java.lang.Class<com.baidu.location.c> r6 = com.baidu.location.c.class
                java.lang.ClassLoader r6 = r6.getClassLoader()     // Catch: java.lang.Exception -> L1d7
                r5.setClassLoader(r6)     // Catch: java.lang.Exception -> L1d7
                java.lang.String r6 = "vdr_location"
                android.os.Parcelable r5 = r5.getParcelable(r6)     // Catch: java.lang.Exception -> L1d7
                com.baidu.location.c r5 = (com.baidu.location.c) r5     // Catch: java.lang.Exception -> L1d7
                java.util.ArrayList r6 = com.baidu.location.h.f(r0)     // Catch: java.lang.Exception -> L1d7
                if (r6 == 0) goto L1d7
                java.util.ArrayList r6 = com.baidu.location.h.f(r0)     // Catch: java.lang.Exception -> L1d7
                java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Exception -> L1d7
            Lb6:
                boolean r0 = r6.hasNext()     // Catch: java.lang.Exception -> L1d7
                if (r0 == 0) goto L1d7
                java.lang.Object r0 = r6.next()     // Catch: java.lang.Exception -> L1d7
                com.baidu.location.b r0 = (com.baidu.location.b) r0     // Catch: java.lang.Exception -> L1d7
                r0.b(r5)     // Catch: java.lang.Exception -> L1d7
                goto Lb6
            Lc6:
                java.lang.Object r5 = r6.obj
                java.lang.String r5 = (java.lang.String) r5
                com.baidu.location.h.b(r0, r5)
                goto L1d7
            Lcf:
                java.lang.Object r5 = r6.obj
                com.baidu.location.c r5 = (com.baidu.location.c) r5
                com.baidu.location.h.a(r0, r5)
                goto L1d7
            Ld8:
                android.os.Bundle r5 = r6.getData()     // Catch: java.lang.Exception -> L1d7
                java.lang.String r6 = "mac"
                byte[] r6 = r5.getByteArray(r6)     // Catch: java.lang.Exception -> L1d7
                r1 = 0
                if (r6 == 0) goto Lea
                java.lang.String r1 = new java.lang.String     // Catch: java.lang.Exception -> L1d7
                r1.<init>(r6, r3)     // Catch: java.lang.Exception -> L1d7
            Lea:
                java.lang.String r6 = "hotspot"
                r2 = -1
                int r5 = r5.getInt(r6, r2)     // Catch: java.lang.Exception -> L1d7
                java.util.ArrayList r6 = com.baidu.location.h.f(r0)     // Catch: java.lang.Exception -> L1d7
                if (r6 == 0) goto L1d7
                java.util.ArrayList r6 = com.baidu.location.h.f(r0)     // Catch: java.lang.Exception -> L1d7
                java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Exception -> L1d7
            Lff:
                boolean r0 = r6.hasNext()     // Catch: java.lang.Exception -> L1d7
                if (r0 == 0) goto L1d7
                java.lang.Object r0 = r6.next()     // Catch: java.lang.Exception -> L1d7
                com.baidu.location.b r0 = (com.baidu.location.b) r0     // Catch: java.lang.Exception -> L1d7
                r0.a(r1, r5)     // Catch: java.lang.Exception -> L1d7
                goto Lff
            L10f:
                android.os.Bundle r5 = r6.getData()     // Catch: java.lang.Exception -> L1d7
                java.lang.String r6 = "loctype"
                int r6 = r5.getInt(r6)     // Catch: java.lang.Exception -> L1d7
                java.lang.String r1 = "diagtype"
                int r1 = r5.getInt(r1)     // Catch: java.lang.Exception -> L1d7
                java.lang.String r2 = "diagmessage"
                byte[] r5 = r5.getByteArray(r2)     // Catch: java.lang.Exception -> L1d7
                if (r6 <= 0) goto L1d7
                if (r1 <= 0) goto L1d7
                if (r5 == 0) goto L1d7
                java.util.ArrayList r2 = com.baidu.location.h.f(r0)     // Catch: java.lang.Exception -> L1d7
                if (r2 == 0) goto L1d7
                java.util.ArrayList r0 = com.baidu.location.h.f(r0)     // Catch: java.lang.Exception -> L1d7
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L1d7
            L139:
                boolean r2 = r0.hasNext()     // Catch: java.lang.Exception -> L1d7
                if (r2 == 0) goto L1d7
                java.lang.Object r2 = r0.next()     // Catch: java.lang.Exception -> L1d7
                com.baidu.location.b r2 = (com.baidu.location.b) r2     // Catch: java.lang.Exception -> L1d7
                java.lang.String r4 = new java.lang.String     // Catch: java.lang.Exception -> L1d7
                r4.<init>(r5, r3)     // Catch: java.lang.Exception -> L1d7
                r2.a(r6, r1, r4)     // Catch: java.lang.Exception -> L1d7
                goto L139
            L14e:
                android.os.Bundle r5 = r6.getData()
                java.lang.Class<com.baidu.location.c> r1 = com.baidu.location.c.class
                java.lang.ClassLoader r1 = r1.getClassLoader()
                r5.setClassLoader(r1)
                java.lang.String r1 = "locStr"
                android.os.Parcelable r5 = r5.getParcelable(r1)
                com.baidu.location.c r5 = (com.baidu.location.c) r5
                boolean r1 = com.baidu.location.h.p(r0)
                if (r1 != 0) goto L178
                boolean r1 = com.baidu.location.h.q(r0)
                if (r1 != r3) goto L178
                int r5 = r5.r()
                r1 = 66
                if (r5 != r1) goto L178
                goto L1d7
            L178:
                boolean r5 = com.baidu.location.h.p(r0)
                if (r5 != 0) goto L188
                boolean r5 = com.baidu.location.h.q(r0)
                if (r5 != r3) goto L188
                com.baidu.location.h.d(r0, r3)
                goto L1d7
            L188:
                boolean r5 = com.baidu.location.h.p(r0)
                if (r5 != 0) goto L1d4
                com.baidu.location.h.d(r0, r3)
                goto L1d4
            L192:
                android.os.Bundle r5 = r6.getData()     // Catch: java.lang.Exception -> L1d7
                java.lang.String r6 = "removenotify"
                boolean r5 = r5.getBoolean(r6)     // Catch: java.lang.Exception -> L1d7
                com.baidu.location.h.e(r0, r5)     // Catch: java.lang.Exception -> L1d7
                goto L1d7
            L1a0:
                android.os.Bundle r5 = r6.getData()     // Catch: java.lang.Exception -> L1d7
                java.lang.String r6 = "id"
                int r6 = r5.getInt(r6, r4)     // Catch: java.lang.Exception -> L1d7
                if (r6 <= 0) goto L1d7
                java.lang.String r1 = "notification"
                android.os.Parcelable r5 = r5.getParcelable(r1)     // Catch: java.lang.Exception -> L1d7
                android.app.Notification r5 = (android.app.Notification) r5     // Catch: java.lang.Exception -> L1d7
                com.baidu.location.h.a(r0, r6, r5)     // Catch: java.lang.Exception -> L1d7
                goto L1d7
            L1b8:
                com.baidu.location.i r5 = com.baidu.location.h.t(r0)
                boolean r5 = r5.h
                if (r5 == 0) goto L1d7
                com.baidu.location.h.c(r0, r4)
                goto L1d7
            L1c4:
                com.baidu.location.i r5 = com.baidu.location.h.t(r0)
                boolean r5 = r5.h
                if (r5 == 0) goto L1d7
                com.baidu.location.h.c(r0, r3)
                goto L1d7
            L1d0:
                com.baidu.location.h.i(r0, r6)
                goto L1d7
            L1d4:
                com.baidu.location.h.a(r0, r6, r2)
            L1d7:
                return
        }
    }

    public class d implements java.lang.Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.baidu.location.h f1368b;

        public d(com.baidu.location.h r1) {
                r0 = this;
                r0.f1368b = r1
                r0.<init>()
                return
        }

        public /* synthetic */ d(com.baidu.location.h r1, com.baidu.location.h.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r5 = this;
                com.baidu.location.h r0 = r5.f1368b
                java.lang.Object r0 = com.baidu.location.h.d(r0)
                monitor-enter(r0)
                com.baidu.location.h r1 = r5.f1368b     // Catch: java.lang.Throwable -> L90
                r2 = 0
                com.baidu.location.h.b(r1, r2)     // Catch: java.lang.Throwable -> L90
                com.baidu.location.h r1 = r5.f1368b     // Catch: java.lang.Throwable -> L90
                android.os.Messenger r1 = com.baidu.location.h.a(r1)     // Catch: java.lang.Throwable -> L90
                if (r1 == 0) goto L8e
                com.baidu.location.h r1 = r5.f1368b     // Catch: java.lang.Throwable -> L90
                android.os.Messenger r1 = com.baidu.location.h.r(r1)     // Catch: java.lang.Throwable -> L90
                if (r1 != 0) goto L1e
                goto L8e
            L1e:
                com.baidu.location.h r1 = r5.f1368b     // Catch: java.lang.Throwable -> L90
                java.util.ArrayList r1 = com.baidu.location.h.e(r1)     // Catch: java.lang.Throwable -> L90
                r2 = 1
                if (r1 == 0) goto L33
                com.baidu.location.h r1 = r5.f1368b     // Catch: java.lang.Throwable -> L90
                java.util.ArrayList r1 = com.baidu.location.h.e(r1)     // Catch: java.lang.Throwable -> L90
                int r1 = r1.size()     // Catch: java.lang.Throwable -> L90
                if (r1 >= r2) goto L48
            L33:
                com.baidu.location.h r1 = r5.f1368b     // Catch: java.lang.Throwable -> L90
                java.util.ArrayList r1 = com.baidu.location.h.f(r1)     // Catch: java.lang.Throwable -> L90
                if (r1 == 0) goto L8c
                com.baidu.location.h r1 = r5.f1368b     // Catch: java.lang.Throwable -> L90
                java.util.ArrayList r1 = com.baidu.location.h.f(r1)     // Catch: java.lang.Throwable -> L90
                int r1 = r1.size()     // Catch: java.lang.Throwable -> L90
                if (r1 >= r2) goto L48
                goto L8c
            L48:
                com.baidu.location.h r1 = r5.f1368b     // Catch: java.lang.Throwable -> L90
                boolean r1 = com.baidu.location.h.g(r1)     // Catch: java.lang.Throwable -> L90
                if (r1 == 0) goto L7c
                com.baidu.location.h r1 = r5.f1368b     // Catch: java.lang.Throwable -> L90
                com.baidu.location.h$d r1 = com.baidu.location.h.h(r1)     // Catch: java.lang.Throwable -> L90
                if (r1 != 0) goto L62
                com.baidu.location.h r1 = r5.f1368b     // Catch: java.lang.Throwable -> L90
                com.baidu.location.h$d r2 = new com.baidu.location.h$d     // Catch: java.lang.Throwable -> L90
                r2.<init>(r1)     // Catch: java.lang.Throwable -> L90
                com.baidu.location.h.a(r1, r2)     // Catch: java.lang.Throwable -> L90
            L62:
                com.baidu.location.h r1 = r5.f1368b     // Catch: java.lang.Throwable -> L90
                com.baidu.location.h$c r1 = com.baidu.location.h.l(r1)     // Catch: java.lang.Throwable -> L90
                com.baidu.location.h r2 = r5.f1368b     // Catch: java.lang.Throwable -> L90
                com.baidu.location.h$d r2 = com.baidu.location.h.h(r2)     // Catch: java.lang.Throwable -> L90
                com.baidu.location.h r5 = r5.f1368b     // Catch: java.lang.Throwable -> L90
                com.baidu.location.i r5 = com.baidu.location.h.t(r5)     // Catch: java.lang.Throwable -> L90
                int r5 = r5.d     // Catch: java.lang.Throwable -> L90
                long r3 = (long) r5     // Catch: java.lang.Throwable -> L90
                r1.postDelayed(r2, r3)     // Catch: java.lang.Throwable -> L90
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L90
                return
            L7c:
                com.baidu.location.h r5 = r5.f1368b     // Catch: java.lang.Throwable -> L90
                com.baidu.location.h$c r5 = com.baidu.location.h.l(r5)     // Catch: java.lang.Throwable -> L90
                r1 = 4
                android.os.Message r5 = r5.obtainMessage(r1)     // Catch: java.lang.Throwable -> L90
                r5.sendToTarget()     // Catch: java.lang.Throwable -> L90
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L90
                return
            L8c:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L90
                return
            L8e:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L90
                return
            L90:
                r5 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L90
                throw r5
        }
    }

    public class e extends java.lang.Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.baidu.location.h f1369b;

        public e(com.baidu.location.h r1) {
                r0 = this;
                r0.f1369b = r1
                r0.<init>()
                return
        }

        public /* synthetic */ e(com.baidu.location.h r1, com.baidu.location.h.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r8 = this;
                com.baidu.location.h r0 = r8.f1369b     // Catch: java.lang.Exception -> L70
                java.lang.Boolean r0 = com.baidu.location.h.u(r0)     // Catch: java.lang.Exception -> L70
                boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L70
                if (r0 == 0) goto L61
                com.baidu.location.h r0 = r8.f1369b     // Catch: java.lang.Exception -> L70
                a.a.a.b.h r0 = com.baidu.location.h.v(r0)     // Catch: java.lang.Exception -> L70
                if (r0 != 0) goto L36
                a.a.a.g.f r0 = a.a.a.g.f.w()     // Catch: java.lang.Exception -> L70
                r0.m()     // Catch: java.lang.Exception -> L70
                com.baidu.location.h r0 = r8.f1369b     // Catch: java.lang.Exception -> L70
                a.a.a.b.h r7 = new a.a.a.b.h     // Catch: java.lang.Exception -> L70
                com.baidu.location.h r1 = r8.f1369b     // Catch: java.lang.Exception -> L70
                android.content.Context r2 = com.baidu.location.h.b(r1)     // Catch: java.lang.Exception -> L70
                com.baidu.location.h r1 = r8.f1369b     // Catch: java.lang.Exception -> L70
                com.baidu.location.i r3 = com.baidu.location.h.c(r1)     // Catch: java.lang.Exception -> L70
                com.baidu.location.h r4 = r8.f1369b     // Catch: java.lang.Exception -> L70
                r5 = 0
                r6 = 0
                r1 = r7
                r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L70
                com.baidu.location.h.a(r0, r7)     // Catch: java.lang.Exception -> L70
            L36:
                com.baidu.location.h r0 = r8.f1369b     // Catch: java.lang.Exception -> L70
                a.a.a.b.h r1 = com.baidu.location.h.v(r0)     // Catch: java.lang.Exception -> L70
                java.lang.String r1 = r1.b()     // Catch: java.lang.Exception -> L70
                com.baidu.location.h.a(r0, r1)     // Catch: java.lang.Exception -> L70
                com.baidu.location.h r0 = r8.f1369b     // Catch: java.lang.Exception -> L70
                com.baidu.location.i r0 = com.baidu.location.h.c(r0)     // Catch: java.lang.Exception -> L70
                com.baidu.location.i$a r0 = r0.D     // Catch: java.lang.Exception -> L70
                com.baidu.location.i$a r1 = com.baidu.location.i.a.f1374c     // Catch: java.lang.Exception -> L70
                if (r0 != r1) goto L61
                com.baidu.location.h r0 = r8.f1369b     // Catch: java.lang.Exception -> L70
                a.a.a.b.h r0 = com.baidu.location.h.v(r0)     // Catch: java.lang.Exception -> L70
                r0.i()     // Catch: java.lang.Exception -> L70
                com.baidu.location.h r0 = r8.f1369b     // Catch: java.lang.Exception -> L70
                a.a.a.b.h r0 = com.baidu.location.h.v(r0)     // Catch: java.lang.Exception -> L70
                r0.j()     // Catch: java.lang.Exception -> L70
            L61:
                com.baidu.location.h r8 = r8.f1369b     // Catch: java.lang.Exception -> L70
                com.baidu.location.h$c r8 = com.baidu.location.h.l(r8)     // Catch: java.lang.Exception -> L70
                r0 = 1
                android.os.Message r8 = r8.obtainMessage(r0)     // Catch: java.lang.Exception -> L70
                r8.sendToTarget()     // Catch: java.lang.Exception -> L70
                goto L74
            L70:
                r8 = move-exception
                r8.printStackTrace()
            L74:
                return
        }
    }

    static {
            return
    }

    public h(android.content.Context r5) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.f1362a = r0
            com.baidu.location.i r1 = new com.baidu.location.i
            r1.<init>()
            r4.f1363b = r1
            com.baidu.location.i r1 = new com.baidu.location.i
            r1.<init>()
            r4.f1364c = r1
            r1 = 0
            r4.d = r1
            r4.e = r0
            r4.f = r0
            r4.i = r0
            r4.j = r0
            r4.k = r0
            r4.l = r1
            r4.m = r1
            r4.n = r1
            r4.o = r1
            r4.p = r0
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r4.r = r2
            r2 = 0
            r4.s = r2
            r4.t = r2
            r2 = -1
            r4.u = r2
            r4.v = r0
            r4.w = r0
            r4.x = r1
            r2 = 1
            r4.y = r2
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r4.z = r2
            r4.A = r2
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r4.B = r2
            r4.D = r0
            r4.E = r1
            r4.F = r1
            r4.G = r1
            r4.H = r0
            com.baidu.location.h$a r0 = new com.baidu.location.h$a
            r0.<init>(r4)
            r4.I = r0
            r4.a()
            r4.e = r5
            com.baidu.location.i r5 = new com.baidu.location.i
            r5.<init>()
            r4.f1363b = r5
            com.baidu.location.h$c r5 = new com.baidu.location.h$c
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r5.<init>(r0, r4)
            r4.g = r5
            android.os.Messenger r5 = new android.os.Messenger
            com.baidu.location.h$c r0 = r4.g
            r5.<init>(r0)
            r4.h = r5
            return
    }

    public static /* synthetic */ a.a.a.b.h a(com.baidu.location.h r0, a.a.a.b.h r1) {
            r0.D = r1
            return r1
    }

    public static /* synthetic */ android.os.Messenger a(com.baidu.location.h r0) {
            android.os.Messenger r0 = r0.f
            return r0
    }

    public static /* synthetic */ android.os.Messenger a(com.baidu.location.h r0, android.os.Messenger r1) {
            r0.f = r1
            return r1
    }

    public static /* synthetic */ com.baidu.location.h.d a(com.baidu.location.h r0, com.baidu.location.h.d r1) {
            r0.p = r1
            return r1
    }

    public static /* synthetic */ java.lang.String a(com.baidu.location.h r0, java.lang.String r1) {
            r0.H = r1
            return r1
    }

    public static /* synthetic */ void a(com.baidu.location.h r0, int r1, android.app.Notification r2) {
            r0.a(r1, r2)
            return
    }

    public static /* synthetic */ void a(com.baidu.location.h r0, android.os.Message r1) {
            r0.g(r1)
            return
    }

    public static /* synthetic */ void a(com.baidu.location.h r0, android.os.Message r1, int r2) {
            r0.a(r1, r2)
            return
    }

    public static /* synthetic */ void a(com.baidu.location.h r0, com.baidu.location.c r1) {
            r0.b(r1)
            return
    }

    public static /* synthetic */ boolean a(com.baidu.location.h r0, boolean r1) {
            r0.d = r1
            return r1
    }

    public static /* synthetic */ android.content.Context b(com.baidu.location.h r0) {
            android.content.Context r0 = r0.e
            return r0
    }

    public static /* synthetic */ void b(com.baidu.location.h r0, android.os.Message r1) {
            r0.e(r1)
            return
    }

    public static /* synthetic */ void b(com.baidu.location.h r0, java.lang.String r1) {
            r0.a(r1)
            return
    }

    public static void b(boolean r0) {
            com.baidu.location.h.K = r0
            return
    }

    public static /* synthetic */ boolean b(com.baidu.location.h r0, boolean r1) {
            r0.o = r1
            return r1
    }

    public static /* synthetic */ com.baidu.location.i c(com.baidu.location.h r0) {
            com.baidu.location.i r0 = r0.f1364c
            return r0
    }

    public static /* synthetic */ void c(com.baidu.location.h r0, android.os.Message r1) {
            r0.b(r1)
            return
    }

    public static /* synthetic */ boolean c(com.baidu.location.h r0, boolean r1) {
            r0.q = r1
            return r1
    }

    public static /* synthetic */ java.lang.Object d(com.baidu.location.h r0) {
            java.lang.Object r0 = r0.r
            return r0
    }

    public static /* synthetic */ void d(com.baidu.location.h r0, android.os.Message r1) {
            r0.h(r1)
            return
    }

    public static /* synthetic */ boolean d(com.baidu.location.h r0, boolean r1) {
            r0.F = r1
            return r1
    }

    public static /* synthetic */ java.util.ArrayList e(com.baidu.location.h r0) {
            java.util.ArrayList<com.baidu.location.d> r0 = r0.i
            return r0
    }

    public static /* synthetic */ void e(com.baidu.location.h r0, android.os.Message r1) {
            r0.c(r1)
            return
    }

    public static /* synthetic */ void e(com.baidu.location.h r0, boolean r1) {
            r0.a(r1)
            return
    }

    public static /* synthetic */ java.util.ArrayList f(com.baidu.location.h r0) {
            java.util.ArrayList<com.baidu.location.b> r0 = r0.j
            return r0
    }

    public static /* synthetic */ void f(com.baidu.location.h r0, android.os.Message r1) {
            r0.i(r1)
            return
    }

    public static /* synthetic */ void g(com.baidu.location.h r0, android.os.Message r1) {
            r0.d(r1)
            return
    }

    public static /* synthetic */ boolean g(com.baidu.location.h r0) {
            boolean r0 = r0.m
            return r0
    }

    public static /* synthetic */ com.baidu.location.h.d h(com.baidu.location.h r0) {
            com.baidu.location.h$d r0 = r0.p
            return r0
    }

    public static /* synthetic */ void h(com.baidu.location.h r0, android.os.Message r1) {
            r0.f(r1)
            return
    }

    public static /* synthetic */ void i(com.baidu.location.h r0, android.os.Message r1) {
            r0.a(r1)
            return
    }

    public static /* synthetic */ boolean i(com.baidu.location.h r0) {
            boolean r0 = r0.y
            return r0
    }

    public static /* synthetic */ void j(com.baidu.location.h r0) {
            r0.f()
            return
    }

    public static /* synthetic */ void k(com.baidu.location.h r0) {
            r0.g()
            return
    }

    public static /* synthetic */ com.baidu.location.h.c l(com.baidu.location.h r0) {
            com.baidu.location.h$c r0 = r0.g
            return r0
    }

    public static /* synthetic */ void m(com.baidu.location.h r0) {
            r0.d()
            return
    }

    public static /* synthetic */ void n(com.baidu.location.h r0) {
            r0.c()
            return
    }

    public static /* synthetic */ void o(com.baidu.location.h r0) {
            r0.e()
            return
    }

    public static /* synthetic */ boolean p(com.baidu.location.h r0) {
            boolean r0 = r0.F
            return r0
    }

    public static /* synthetic */ boolean q(com.baidu.location.h r0) {
            boolean r0 = r0.E
            return r0
    }

    public static /* synthetic */ android.os.Messenger r(com.baidu.location.h r0) {
            android.os.Messenger r0 = r0.h
            return r0
    }

    public static /* synthetic */ android.os.Bundle s(com.baidu.location.h r0) {
            android.os.Bundle r0 = r0.b()
            return r0
    }

    public static /* synthetic */ com.baidu.location.i t(com.baidu.location.h r0) {
            com.baidu.location.i r0 = r0.f1363b
            return r0
    }

    public static /* synthetic */ java.lang.Boolean u(com.baidu.location.h r0) {
            java.lang.Boolean r0 = r0.B
            return r0
    }

    public static /* synthetic */ a.a.a.b.h v(com.baidu.location.h r0) {
            a.a.a.b.h r0 = r0.D
            return r0
    }

    public final void a() {
            r1 = this;
            boolean r1 = com.baidu.location.h.K
            if (r1 == 0) goto L5
            return
        L5:
            java.lang.String r1 = "The location function has been stopped because you do not agree with the privacy compliance policy. Please recheck the setAgreePrivacy interface"
            java.lang.String r0 = "baidu_location_Client"
            android.util.Log.e(r0, r1)
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            throw r0
    }

    public final void a(int r8) {
            r7 = this;
            com.baidu.location.c r8 = r7.k
            java.lang.String r8 = r8.h()
            if (r8 != 0) goto L11
            com.baidu.location.c r8 = r7.k
            com.baidu.location.i r0 = r7.f1363b
            java.lang.String r0 = r0.f1370a
            r8.e(r0)
        L11:
            boolean r8 = r7.l
            r0 = 67
            r1 = 66
            r2 = 1
            if (r8 == r2) goto L48
            com.baidu.location.i r8 = r7.f1363b
            boolean r8 = r8.h
            if (r8 != r2) goto L2a
            com.baidu.location.c r8 = r7.k
            int r8 = r8.r()
            r2 = 61
            if (r8 == r2) goto L48
        L2a:
            com.baidu.location.c r8 = r7.k
            int r8 = r8.r()
            if (r8 == r1) goto L48
            com.baidu.location.c r8 = r7.k
            int r8 = r8.r()
            if (r8 == r0) goto L48
            boolean r8 = r7.x
            if (r8 != 0) goto L48
            com.baidu.location.c r8 = r7.k
            int r8 = r8.r()
            r2 = 161(0xa1, float:2.26E-43)
            if (r8 != r2) goto Lc4
        L48:
            boolean r8 = r7.n
            r2 = 0
            if (r8 != 0) goto L6b
            long r3 = r7.u
            r5 = -1
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L6b
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r7.u
            long r3 = r3 - r5
            com.baidu.location.i r8 = r7.h()
            int r8 = r8.g()
            int r8 = r8 + (-300)
            long r5 = (long) r8
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 < 0) goto Lab
        L6b:
            java.util.ArrayList<com.baidu.location.d> r8 = r7.i
            if (r8 == 0) goto L85
            java.util.Iterator r8 = r8.iterator()
        L73:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L85
            java.lang.Object r3 = r8.next()
            com.baidu.location.d r3 = (com.baidu.location.d) r3
            com.baidu.location.c r4 = r7.k
            r3.a(r4)
            goto L73
        L85:
            java.util.ArrayList<com.baidu.location.b> r8 = r7.j
            if (r8 == 0) goto L9f
            java.util.Iterator r8 = r8.iterator()
        L8d:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L9f
            java.lang.Object r3 = r8.next()
            com.baidu.location.b r3 = (com.baidu.location.b) r3
            com.baidu.location.c r4 = r7.k
            r3.a(r4)
            goto L8d
        L9f:
            long r3 = java.lang.System.currentTimeMillis()
            r7.u = r3
            boolean r8 = r7.n
            if (r8 == 0) goto Lab
            r7.n = r2
        Lab:
            com.baidu.location.c r8 = r7.k
            int r8 = r8.r()
            if (r8 == r1) goto Lc4
            com.baidu.location.c r8 = r7.k
            int r8 = r8.r()
            if (r8 != r0) goto Lbc
            goto Lc4
        Lbc:
            r7.l = r2
            long r0 = java.lang.System.currentTimeMillis()
            r7.t = r0
        Lc4:
            return
    }

    public final void a(int r4, android.app.Notification r5) {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Exception -> L2c
            android.content.Context r1 = r3.e     // Catch: java.lang.Exception -> L2c
            java.lang.Class<com.baidu.location.f> r2 = com.baidu.location.f.class
            r0.<init>(r1, r2)     // Catch: java.lang.Exception -> L2c
            java.lang.String r1 = "notification"
            r0.putExtra(r1, r5)     // Catch: java.lang.Exception -> L2c
            java.lang.String r5 = "id"
            r0.putExtra(r5, r4)     // Catch: java.lang.Exception -> L2c
            java.lang.String r4 = "command"
            r5 = 1
            r0.putExtra(r4, r5)     // Catch: java.lang.Exception -> L2c
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L2c
            r1 = 26
            if (r4 < r1) goto L25
            android.content.Context r4 = r3.e     // Catch: java.lang.Exception -> L2c
            r4.startForegroundService(r0)     // Catch: java.lang.Exception -> L2c
            goto L2a
        L25:
            android.content.Context r4 = r3.e     // Catch: java.lang.Exception -> L2c
            r4.startService(r0)     // Catch: java.lang.Exception -> L2c
        L2a:
            r3.G = r5     // Catch: java.lang.Exception -> L2c
        L2c:
            return
    }

    public final void a(android.os.Message r3) {
            r2 = this;
            android.os.Bundle r3 = r3.getData()     // Catch: java.lang.Exception -> L31
            java.lang.Class<com.baidu.location.c> r0 = com.baidu.location.c.class
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Exception -> L31
            r3.setClassLoader(r0)     // Catch: java.lang.Exception -> L31
            java.lang.String r0 = "locStr"
            android.os.Parcelable r3 = r3.getParcelable(r0)     // Catch: java.lang.Exception -> L31
            com.baidu.location.c r3 = (com.baidu.location.c) r3     // Catch: java.lang.Exception -> L31
            com.baidu.location.d r0 = r2.w     // Catch: java.lang.Exception -> L31
            if (r0 == 0) goto L31
            com.baidu.location.i r0 = r2.f1363b     // Catch: java.lang.Exception -> L31
            if (r0 == 0) goto L2c
            boolean r0 = r0.h()     // Catch: java.lang.Exception -> L31
            if (r0 == 0) goto L2c
            int r0 = r3.r()     // Catch: java.lang.Exception -> L31
            r1 = 65
            if (r0 != r1) goto L2c
            return
        L2c:
            com.baidu.location.d r2 = r2.w     // Catch: java.lang.Exception -> L31
            r2.a(r3)     // Catch: java.lang.Exception -> L31
        L31:
            return
    }

    public final void a(android.os.Message r8, int r9) {
            r7 = this;
            boolean r0 = r7.d
            if (r0 != 0) goto L5
            return
        L5:
            android.os.Bundle r8 = r8.getData()     // Catch: java.lang.Exception -> L58
            java.lang.Class<com.baidu.location.c> r0 = com.baidu.location.c.class
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Exception -> L58
            r8.setClassLoader(r0)     // Catch: java.lang.Exception -> L58
            java.lang.String r0 = "locStr"
            android.os.Parcelable r8 = r8.getParcelable(r0)     // Catch: java.lang.Exception -> L58
            com.baidu.location.c r8 = (com.baidu.location.c) r8     // Catch: java.lang.Exception -> L58
            r7.k = r8     // Catch: java.lang.Exception -> L58
            int r8 = r8.r()     // Catch: java.lang.Exception -> L58
            r0 = 61
            if (r8 != r0) goto L2a
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L58
            r7.s = r1     // Catch: java.lang.Exception -> L58
        L2a:
            com.baidu.location.c r8 = r7.k     // Catch: java.lang.Exception -> L58
            int r8 = r8.r()     // Catch: java.lang.Exception -> L58
            if (r8 == r0) goto L3c
            com.baidu.location.c r8 = r7.k     // Catch: java.lang.Exception -> L58
            int r8 = r8.r()     // Catch: java.lang.Exception -> L58
            r0 = 161(0xa1, float:2.26E-43)
            if (r8 != r0) goto L55
        L3c:
            a.a.a.b.a r1 = a.a.a.b.a.c()     // Catch: java.lang.Exception -> L58
            com.baidu.location.c r8 = r7.k     // Catch: java.lang.Exception -> L58
            double r2 = r8.q()     // Catch: java.lang.Exception -> L58
            com.baidu.location.c r8 = r7.k     // Catch: java.lang.Exception -> L58
            double r4 = r8.t()     // Catch: java.lang.Exception -> L58
            com.baidu.location.c r8 = r7.k     // Catch: java.lang.Exception -> L58
            java.lang.String r6 = r8.h()     // Catch: java.lang.Exception -> L58
            r1.a(r2, r4, r6)     // Catch: java.lang.Exception -> L58
        L55:
            r7.a(r9)     // Catch: java.lang.Exception -> L58
        L58:
            return
    }

    public void a(com.baidu.location.b r2) {
            r1 = this;
            if (r2 == 0) goto L10
            com.baidu.location.h$c r1 = r1.g
            r0 = 1300(0x514, float:1.822E-42)
            android.os.Message r1 = r1.obtainMessage(r0)
            r1.obj = r2
            r1.sendToTarget()
            return
        L10:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "please set a non-null listener"
            r1.<init>(r2)
            throw r1
    }

    @Override // a.a.a.b.h.b
    public void a(com.baidu.location.c r3) {
            r2 = this;
            boolean r0 = r2.F
            r1 = 1
            if (r0 != r1) goto La
            boolean r0 = r2.E
            if (r0 != 0) goto La
            return
        La:
            if (r3 != 0) goto Ld
            return
        Ld:
            com.baidu.location.h$c r2 = r2.g
            r0 = 701(0x2bd, float:9.82E-43)
            android.os.Message r2 = r2.obtainMessage(r0)
            r2.obj = r3
            r2.sendToTarget()
            return
    }

    public void a(com.baidu.location.d r2) {
            r1 = this;
            com.baidu.location.h$c r1 = r1.g
            r0 = 8
            android.os.Message r1 = r1.obtainMessage(r0)
            r1.obj = r2
            r1.sendToTarget()
            return
    }

    public void a(com.baidu.location.i r2) {
            r1 = this;
            if (r2 != 0) goto L7
            com.baidu.location.i r2 = new com.baidu.location.i
            r2.<init>()
        L7:
            int r0 = r2.b()
            if (r0 <= 0) goto L15
            r0 = 0
            r2.a(r0)
            r0 = 1
            r2.b(r0)
        L15:
            com.baidu.location.i r0 = new com.baidu.location.i
            r0.<init>(r2)
            r1.f1364c = r0
            com.baidu.location.h$c r1 = r1.g
            r0 = 3
            android.os.Message r1 = r1.obtainMessage(r0)
            r1.obj = r2
            r1.sendToTarget()
            return
    }

    public final void a(java.lang.String r2) {
            r1 = this;
            java.util.ArrayList<com.baidu.location.b> r1 = r1.j
            if (r1 == 0) goto L18
            java.util.Iterator r1 = r1.iterator()
        L8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r1.next()
            com.baidu.location.b r0 = (com.baidu.location.b) r0
            r0.a(r2)
            goto L8
        L18:
            return
    }

    public final void a(boolean r4) {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Exception -> L1c
            android.content.Context r1 = r3.e     // Catch: java.lang.Exception -> L1c
            java.lang.Class<com.baidu.location.f> r2 = com.baidu.location.f.class
            r0.<init>(r1, r2)     // Catch: java.lang.Exception -> L1c
            java.lang.String r1 = "removenotify"
            r0.putExtra(r1, r4)     // Catch: java.lang.Exception -> L1c
            java.lang.String r4 = "command"
            r1 = 2
            r0.putExtra(r4, r1)     // Catch: java.lang.Exception -> L1c
            android.content.Context r4 = r3.e     // Catch: java.lang.Exception -> L1c
            r4.startService(r0)     // Catch: java.lang.Exception -> L1c
            r4 = 1
            r3.G = r4     // Catch: java.lang.Exception -> L1c
        L1c:
            return
    }

    public final android.os.Bundle b() {
            r4 = this;
            com.baidu.location.i r0 = r4.f1363b
            if (r0 != 0) goto L6
            r4 = 0
            return r4
        L6:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = r4.f1362a
            java.lang.String r2 = "packName"
            r0.putString(r2, r1)
            com.baidu.location.i r1 = r4.f1363b
            java.lang.String r1 = r1.f
            java.lang.String r2 = "prodName"
            r0.putString(r2, r1)
            com.baidu.location.i r1 = r4.f1363b
            java.lang.String r1 = r1.f1370a
            java.lang.String r2 = "coorType"
            r0.putString(r2, r1)
            com.baidu.location.i r1 = r4.f1363b
            java.lang.String r1 = r1.f1371b
            java.lang.String r2 = "addrType"
            r0.putString(r2, r1)
            com.baidu.location.i r1 = r4.f1363b
            boolean r1 = r1.f1372c
            java.lang.String r2 = "openGPS"
            r0.putBoolean(r2, r1)
            com.baidu.location.i r1 = r4.f1363b
            boolean r1 = r1.h
            java.lang.String r2 = "location_change_notify"
            r0.putBoolean(r2, r1)
            com.baidu.location.i r1 = r4.f1363b
            int r1 = r1.d
            java.lang.String r2 = "scanSpan"
            r0.putInt(r2, r1)
            com.baidu.location.i r1 = r4.f1363b
            boolean r1 = r1.j
            java.lang.String r2 = "enableSimulateGps"
            r0.putBoolean(r2, r1)
            com.baidu.location.i r1 = r4.f1363b
            int r1 = r1.e
            java.lang.String r2 = "timeOut"
            r0.putInt(r2, r1)
            com.baidu.location.i r1 = r4.f1363b
            int r1 = r1.g
            java.lang.String r2 = "priority"
            r0.putInt(r2, r1)
            java.lang.Boolean r1 = r4.z
            boolean r1 = r1.booleanValue()
            java.lang.String r2 = "map"
            r0.putBoolean(r2, r1)
            java.lang.Boolean r1 = r4.A
            boolean r1 = r1.booleanValue()
            java.lang.String r2 = "import"
            r0.putBoolean(r2, r1)
            com.baidu.location.i r1 = r4.f1363b
            boolean r1 = r1.n
            java.lang.String r2 = "needDirect"
            r0.putBoolean(r2, r1)
            com.baidu.location.i r1 = r4.f1363b
            boolean r1 = r1.o
            java.lang.String r2 = "isneedaptag"
            r0.putBoolean(r2, r1)
            com.baidu.location.i r1 = r4.f1363b
            boolean r1 = r1.q
            java.lang.String r2 = "isneedpoiregion"
            r0.putBoolean(r2, r1)
            com.baidu.location.i r1 = r4.f1363b
            boolean r1 = r1.r
            java.lang.String r2 = "isneedregular"
            r0.putBoolean(r2, r1)
            com.baidu.location.i r1 = r4.f1363b
            boolean r1 = r1.p
            java.lang.String r2 = "isneedaptagd"
            r0.putBoolean(r2, r1)
            com.baidu.location.i r1 = r4.f1363b
            boolean r1 = r1.s
            java.lang.String r2 = "isneedaltitude"
            r0.putBoolean(r2, r1)
            com.baidu.location.i r1 = r4.f1363b
            boolean r1 = r1.t
            java.lang.String r2 = "isneednewrgc"
            r0.putBoolean(r2, r1)
            com.baidu.location.i r1 = r4.f1363b
            int r1 = r1.b()
            java.lang.String r2 = "autoNotifyMaxInterval"
            r0.putInt(r2, r1)
            com.baidu.location.i r1 = r4.f1363b
            int r1 = r1.e()
            java.lang.String r2 = "autoNotifyMinTimeInterval"
            r0.putInt(r2, r1)
            com.baidu.location.i r1 = r4.f1363b
            int r1 = r1.d()
            java.lang.String r2 = "autoNotifyMinDistance"
            r0.putInt(r2, r1)
            com.baidu.location.i r1 = r4.f1363b
            float r1 = r1.a()
            java.lang.String r2 = "autoNotifyLocSensitivity"
            r0.putFloat(r2, r1)
            com.baidu.location.i r1 = r4.f1363b
            int r1 = r1.A
            java.lang.String r2 = "wifitimeout"
            r0.putInt(r2, r1)
            a.a.a.b.a r1 = a.a.a.b.a.c()
            int r1 = r1.f5c
            java.lang.String r2 = "wfnum"
            r0.putInt(r2, r1)
            a.a.a.b.a r1 = a.a.a.b.a.c()
            boolean r1 = r1.f4b
            java.lang.String r2 = "ischeckper"
            r0.putBoolean(r2, r1)
            a.a.a.b.a r1 = a.a.a.b.a.c()
            double r1 = r1.e
            float r1 = (float) r1
            java.lang.String r2 = "wfsm"
            r0.putFloat(r2, r1)
            a.a.a.b.a r1 = a.a.a.b.a.c()
            double r1 = r1.h
            java.lang.String r3 = "gnmcrm"
            r0.putDouble(r3, r1)
            a.a.a.b.a r1 = a.a.a.b.a.c()
            int r1 = r1.i
            java.lang.String r2 = "gnmcon"
            r0.putInt(r2, r1)
            a.a.a.b.a r1 = a.a.a.b.a.c()
            int r1 = r1.j
            java.lang.String r2 = "iupl"
            r0.putInt(r2, r1)
            a.a.a.b.a r1 = a.a.a.b.a.c()
            int r1 = r1.g
            java.lang.String r2 = "lpcs"
            r0.putInt(r2, r1)
            a.a.a.b.a r1 = a.a.a.b.a.c()
            int r1 = r1.l
            java.lang.String r2 = "hpdts"
            r0.putInt(r2, r1)
            a.a.a.b.a r1 = a.a.a.b.a.c()
            int r1 = r1.m
            java.lang.String r2 = "oldts"
            r0.putInt(r2, r1)
            com.baidu.location.i r1 = r4.f1363b
            boolean r1 = r1.C
            java.lang.String r2 = "isEnableBeidouMode"
            r0.putBoolean(r2, r1)
            a.a.a.b.a r1 = a.a.a.b.a.c()
            int r1 = r1.n
            java.lang.String r2 = "onic"
            r0.putInt(r2, r1)
            a.a.a.b.a r1 = a.a.a.b.a.c()
            int r1 = r1.o
            java.lang.String r2 = "nlcs"
            r0.putInt(r2, r1)
            a.a.a.b.a r1 = a.a.a.b.a.c()
            float r1 = r1.p
            java.lang.String r2 = "ncsr"
            r0.putFloat(r2, r1)
            a.a.a.b.a r1 = a.a.a.b.a.c()
            float r1 = r1.q
            java.lang.String r2 = "cscr"
            r0.putFloat(r2, r1)
            java.lang.String r4 = r4.H
            java.lang.String r1 = "connectBssid"
            r0.putString(r1, r4)
            a.a.a.b.a r4 = a.a.a.b.a.c()
            int r4 = r4.r
            java.lang.String r1 = "cls"
            r0.putInt(r1, r4)
            a.a.a.b.a r4 = a.a.a.b.a.c()
            int[] r4 = r4.s
            java.lang.String r1 = "ocs"
            r0.putIntArray(r1, r4)
            a.a.a.b.a r4 = a.a.a.b.a.c()
            int r4 = r4.t
            java.lang.String r1 = "topCellNumber"
            r0.putInt(r1, r4)
            a.a.a.b.a r4 = a.a.a.b.a.c()
            int r4 = r4.u
            java.lang.String r1 = "locStrLength"
            r0.putInt(r1, r4)
            return r0
    }

    public final void b(android.os.Message r2) {
            r1 = this;
            if (r2 == 0) goto L21
            java.lang.Object r2 = r2.obj
            if (r2 != 0) goto L7
            goto L21
        L7:
            com.baidu.location.d r2 = (com.baidu.location.d) r2
            java.util.ArrayList<com.baidu.location.d> r0 = r1.i
            if (r0 != 0) goto L14
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.i = r0
        L14:
            java.util.ArrayList<com.baidu.location.d> r0 = r1.i
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L21
            java.util.ArrayList<com.baidu.location.d> r1 = r1.i
            r1.add(r2)
        L21:
            return
    }

    public final void b(com.baidu.location.c r8) {
            r7 = this;
            boolean r0 = r7.y
            if (r0 == 0) goto L5
            return
        L5:
            r7.k = r8
            boolean r0 = r7.F
            if (r0 != 0) goto L29
            int r0 = r8.r()
            r1 = 161(0xa1, float:2.26E-43)
            if (r0 != r1) goto L29
            r0 = 1
            r7.E = r0
            a.a.a.b.a r1 = a.a.a.b.a.c()
            double r2 = r8.q()
            double r4 = r8.t()
            java.lang.String r6 = r8.h()
            r1.a(r2, r4, r6)
        L29:
            java.util.ArrayList<com.baidu.location.d> r0 = r7.i
            if (r0 == 0) goto L41
            java.util.Iterator r0 = r0.iterator()
        L31:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L41
            java.lang.Object r1 = r0.next()
            com.baidu.location.d r1 = (com.baidu.location.d) r1
            r1.a(r8)
            goto L31
        L41:
            java.util.ArrayList<com.baidu.location.b> r7 = r7.j
            if (r7 == 0) goto L59
            java.util.Iterator r7 = r7.iterator()
        L49:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L59
            java.lang.Object r0 = r7.next()
            com.baidu.location.b r0 = (com.baidu.location.b) r0
            r0.a(r8)
            goto L49
        L59:
            return
    }

    public final void c() {
            r7 = this;
            android.os.Messenger r0 = r7.f
            if (r0 != 0) goto L5
            return
        L5:
            android.content.Context r0 = r7.e
            int r0 = a.a.a.i.i.a(r0)
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r7.s
            long r1 = r1 - r3
            r3 = 3000(0xbb8, double:1.482E-320)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            r3 = 1
            if (r1 > 0) goto L26
            com.baidu.location.i r1 = r7.f1363b
            if (r1 == 0) goto L22
            boolean r1 = r1.h
            if (r1 == 0) goto L26
        L22:
            boolean r1 = r7.m
            if (r1 == 0) goto L6d
        L26:
            if (r0 != r3) goto L6d
            boolean r0 = r7.x
            if (r0 == 0) goto L3d
            long r0 = java.lang.System.currentTimeMillis()
            long r4 = r7.t
            long r0 = r0 - r4
            r4 = 20000(0x4e20, double:9.8813E-320)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L3d
            boolean r0 = r7.m
            if (r0 == 0) goto L8b
        L3d:
            r0 = 22
            android.os.Message r0 = android.os.Message.obtain(r2, r0)
            boolean r1 = r7.m
            if (r1 == 0) goto L59
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            boolean r4 = r7.m
            java.lang.String r5 = "isWaitingLocTag"
            r1.putBoolean(r5, r4)
            r4 = 0
            r7.m = r4
            r0.setData(r1)
        L59:
            android.os.Messenger r1 = r7.h     // Catch: java.lang.Exception -> L68
            r0.replyTo = r1     // Catch: java.lang.Exception -> L68
            android.os.Messenger r1 = r7.f     // Catch: java.lang.Exception -> L68
            r1.send(r0)     // Catch: java.lang.Exception -> L68
            java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L68
            r7.l = r3     // Catch: java.lang.Exception -> L68
            goto L8b
        L68:
            r0 = move-exception
            r0.printStackTrace()
            goto L8b
        L6d:
            if (r0 >= r3) goto L8b
            com.baidu.location.c r1 = new com.baidu.location.c
            r1.<init>()
            r4 = -1
            if (r0 != r4) goto L7d
            r0 = 69
        L79:
            r1.h(r0)
            goto L88
        L7d:
            r4 = -2
            if (r0 != r4) goto L83
            r0 = 70
            goto L79
        L83:
            if (r0 != 0) goto L88
            r0 = 71
            goto L79
        L88:
            r7.c(r1)
        L8b:
            java.lang.Object r0 = r7.r
            monitor-enter(r0)
            com.baidu.location.i r1 = r7.f1363b     // Catch: java.lang.Throwable -> Lb3
            if (r1 == 0) goto Lb1
            int r1 = r1.d     // Catch: java.lang.Throwable -> Lb3
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r1 < r4) goto Lb1
            boolean r4 = r7.o     // Catch: java.lang.Throwable -> Lb3
            if (r4 != 0) goto Lb1
            com.baidu.location.h$d r4 = r7.p     // Catch: java.lang.Throwable -> Lb3
            if (r4 != 0) goto La7
            com.baidu.location.h$d r4 = new com.baidu.location.h$d     // Catch: java.lang.Throwable -> Lb3
            r4.<init>(r7, r2)     // Catch: java.lang.Throwable -> Lb3
            r7.p = r4     // Catch: java.lang.Throwable -> Lb3
        La7:
            com.baidu.location.h$c r2 = r7.g     // Catch: java.lang.Throwable -> Lb3
            com.baidu.location.h$d r4 = r7.p     // Catch: java.lang.Throwable -> Lb3
            long r5 = (long) r1     // Catch: java.lang.Throwable -> Lb3
            r2.postDelayed(r4, r5)     // Catch: java.lang.Throwable -> Lb3
            r7.o = r3     // Catch: java.lang.Throwable -> Lb3
        Lb1:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb3
            return
        Lb3:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb3
            throw r7
    }

    public final void c(android.os.Message r2) {
            r1 = this;
            if (r2 == 0) goto L21
            java.lang.Object r2 = r2.obj
            if (r2 != 0) goto L7
            goto L21
        L7:
            com.baidu.location.b r2 = (com.baidu.location.b) r2
            java.util.ArrayList<com.baidu.location.b> r0 = r1.j
            if (r0 != 0) goto L14
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.j = r0
        L14:
            java.util.ArrayList<com.baidu.location.b> r0 = r1.j
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L21
            java.util.ArrayList<com.baidu.location.b> r1 = r1.j
            r1.add(r2)
        L21:
            return
    }

    public final void c(com.baidu.location.c r3) {
            r2 = this;
            java.util.ArrayList<com.baidu.location.d> r0 = r2.i
            if (r0 == 0) goto L18
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            com.baidu.location.d r1 = (com.baidu.location.d) r1
            r1.a(r3)
            goto L8
        L18:
            java.util.ArrayList<com.baidu.location.b> r2 = r2.j
            if (r2 == 0) goto L30
            java.util.Iterator r2 = r2.iterator()
        L20:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L30
            java.lang.Object r0 = r2.next()
            com.baidu.location.b r0 = (com.baidu.location.b) r0
            r0.a(r3)
            goto L20
        L30:
            return
    }

    public final void d() {
            r2 = this;
            android.os.Messenger r0 = r2.f
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            r1 = 22
            android.os.Message r0 = android.os.Message.obtain(r0, r1)
            android.os.Messenger r1 = r2.h     // Catch: java.lang.Exception -> L16
            r0.replyTo = r1     // Catch: java.lang.Exception -> L16
            android.os.Messenger r2 = r2.f     // Catch: java.lang.Exception -> L16
            r2.send(r0)     // Catch: java.lang.Exception -> L16
            goto L1a
        L16:
            r2 = move-exception
            r2.printStackTrace()
        L1a:
            return
    }

    public final void d(android.os.Message r3) {
            r2 = this;
            if (r3 == 0) goto L1b
            java.lang.Object r3 = r3.obj
            if (r3 != 0) goto L7
            goto L1b
        L7:
            com.baidu.location.e r3 = (com.baidu.location.e) r3
            a.a.a.e.a r0 = r2.v
            if (r0 != 0) goto L16
            a.a.a.e.a r0 = new a.a.a.e.a
            android.content.Context r1 = r2.e
            r0.<init>(r1, r2)
            r2.v = r0
        L16:
            a.a.a.e.a r2 = r2.v
            r2.a(r3)
        L1b:
            return
    }

    public final void e() {
            r2 = this;
            r0 = 0
            r1 = 28
            android.os.Message r0 = android.os.Message.obtain(r0, r1)
            android.os.Messenger r1 = r2.h     // Catch: java.lang.Exception -> L11
            r0.replyTo = r1     // Catch: java.lang.Exception -> L11
            android.os.Messenger r2 = r2.f     // Catch: java.lang.Exception -> L11
            r2.send(r0)     // Catch: java.lang.Exception -> L11
            goto L15
        L11:
            r2 = move-exception
            r2.printStackTrace()
        L15:
            return
    }

    public final void e(android.os.Message r1) {
            r0 = this;
            if (r1 == 0) goto Lb
            java.lang.Object r1 = r1.obj
            if (r1 != 0) goto L7
            goto Lb
        L7:
            com.baidu.location.d r1 = (com.baidu.location.d) r1
            r0.w = r1
        Lb:
            return
    }

    public final void f() {
            r4 = this;
            boolean r0 = r4.d
            r1 = 1
            if (r0 != r1) goto L6
            return
        L6:
            java.lang.Boolean r0 = r4.B
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L27
            android.content.Context r0 = r4.e
            boolean r0 = a.a.a.i.i.g(r0)
            com.baidu.location.i r2 = r4.f1364c
            boolean r2 = r2.i()
            if (r2 == 0) goto L1d
            r0 = r1
        L1d:
            if (r0 == 0) goto L27
            com.baidu.location.h$b r0 = new com.baidu.location.h$b     // Catch: java.lang.Throwable -> L27
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L27
            r0.start()     // Catch: java.lang.Throwable -> L27
        L27:
            com.baidu.location.i r0 = r4.f1364c
            boolean r0 = r0.i()
            if (r0 == 0) goto L30
            return
        L30:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r4.B = r0
            android.content.Context r0 = r4.e
            java.lang.String r0 = r0.getPackageName()
            r4.f1362a = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r4.f1362a
            r0.append(r2)
            java.lang.String r2 = "_bdls_v2.9"
            r0.append(r2)
            r0.toString()
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r2 = r4.e
            java.lang.Class<com.baidu.location.f> r3 = com.baidu.location.f.class
            r0.<init>(r2, r3)
            java.lang.String r2 = "debug_dev"
            boolean r3 = r4.C     // Catch: java.lang.Exception -> L5e
            r0.putExtra(r2, r3)     // Catch: java.lang.Exception -> L5e
        L5e:
            com.baidu.location.i r2 = r4.f1363b
            if (r2 != 0) goto L69
            com.baidu.location.i r2 = new com.baidu.location.i
            r2.<init>()
            r4.f1363b = r2
        L69:
            com.baidu.location.i r2 = r4.f1363b
            boolean r2 = r2.l
            java.lang.String r3 = "cache_exception"
            r0.putExtra(r3, r2)
            com.baidu.location.i r2 = r4.f1363b
            boolean r2 = r2.m
            java.lang.String r3 = "kill_process"
            r0.putExtra(r3, r2)
            java.lang.String r2 = com.baidu.location.h.J
            java.lang.String r3 = "auth_key"
            r0.putExtra(r3, r2)
            android.content.Context r2 = r4.e     // Catch: java.lang.Exception -> L8a
            android.content.ServiceConnection r3 = r4.I     // Catch: java.lang.Exception -> L8a
            r2.bindService(r0, r3, r1)     // Catch: java.lang.Exception -> L8a
            goto L91
        L8a:
            r0 = move-exception
            r0.printStackTrace()
            r0 = 0
            r4.d = r0
        L91:
            return
    }

    public final void f(android.os.Message r1) {
            r0 = this;
            if (r1 == 0) goto L10
            java.lang.Object r1 = r1.obj
            if (r1 != 0) goto L7
            goto L10
        L7:
            com.baidu.location.e r1 = (com.baidu.location.e) r1
            a.a.a.e.a r0 = r0.v
            if (r0 == 0) goto L10
            r0.b(r1)
        L10:
            return
    }

    public final void g() {
            r5 = this;
            boolean r0 = r5.d
            if (r0 == 0) goto L6f
            android.os.Messenger r0 = r5.f
            if (r0 != 0) goto L9
            goto L6f
        L9:
            r0 = 12
            r1 = 0
            android.os.Message r0 = android.os.Message.obtain(r1, r0)
            android.os.Messenger r2 = r5.h
            r0.replyTo = r2
            android.os.Messenger r2 = r5.f     // Catch: java.lang.Exception -> L1a
            r2.send(r0)     // Catch: java.lang.Exception -> L1a
            goto L1e
        L1a:
            r0 = move-exception
            r0.printStackTrace()
        L1e:
            r0 = 0
            android.content.Context r2 = r5.e     // Catch: java.lang.Exception -> L3a
            android.content.ServiceConnection r3 = r5.I     // Catch: java.lang.Exception -> L3a
            r2.unbindService(r3)     // Catch: java.lang.Exception -> L3a
            boolean r2 = r5.G     // Catch: java.lang.Exception -> L3a
            if (r2 == 0) goto L3a
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Exception -> L38
            android.content.Context r3 = r5.e     // Catch: java.lang.Exception -> L38
            java.lang.Class<com.baidu.location.f> r4 = com.baidu.location.f.class
            r2.<init>(r3, r4)     // Catch: java.lang.Exception -> L38
            android.content.Context r3 = r5.e     // Catch: java.lang.Exception -> L38
            r3.stopService(r2)     // Catch: java.lang.Exception -> L38
        L38:
            r5.G = r0     // Catch: java.lang.Exception -> L3a
        L3a:
            java.lang.Object r2 = r5.r
            monitor-enter(r2)
            boolean r3 = r5.o     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            r4 = 1
            if (r3 != r4) goto L4e
            com.baidu.location.h$c r3 = r5.g     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            com.baidu.location.h$d r4 = r5.p     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            r3.removeCallbacks(r4)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            r5.o = r0     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            goto L4e
        L4c:
            r5 = move-exception
            goto L6d
        L4e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4c
            a.a.a.e.a r2 = r5.v
            if (r2 == 0) goto L56
            r2.c()
        L56:
            r5.f = r1
            r5.m = r0
            r5.x = r0
            r5.d = r0
            r5.E = r0
            r5.F = r0
            r1 = -1
            r5.u = r1
            r5.n = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r5.B = r0
            return
        L6d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4c
            throw r5
        L6f:
            return
    }

    public final void g(android.os.Message r9) {
            r8 = this;
            r0 = 0
            r8.m = r0
            if (r9 == 0) goto L83
            java.lang.Object r9 = r9.obj
            if (r9 != 0) goto Lb
            goto L83
        Lb:
            com.baidu.location.i r9 = (com.baidu.location.i) r9
            com.baidu.location.i r1 = r8.f1363b
            boolean r1 = r1.a(r9)
            if (r1 != 0) goto L83
            com.baidu.location.i r1 = r8.f1363b
            int r1 = r1.d
            int r2 = r9.d
            r3 = 0
            r4 = 1
            if (r1 == r2) goto L53
            java.lang.Object r1 = r8.r     // Catch: java.lang.Exception -> L53
            monitor-enter(r1)     // Catch: java.lang.Exception -> L53
            boolean r2 = r8.o     // Catch: java.lang.Throwable -> L50
            if (r2 != r4) goto L2f
            com.baidu.location.h$c r2 = r8.g     // Catch: java.lang.Throwable -> L50
            com.baidu.location.h$d r5 = r8.p     // Catch: java.lang.Throwable -> L50
            r2.removeCallbacks(r5)     // Catch: java.lang.Throwable -> L50
            r8.o = r0     // Catch: java.lang.Throwable -> L50
        L2f:
            int r0 = r9.d     // Catch: java.lang.Throwable -> L50
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r0 < r2) goto L4e
            boolean r2 = r8.o     // Catch: java.lang.Throwable -> L50
            if (r2 != 0) goto L4e
            com.baidu.location.h$d r2 = r8.p     // Catch: java.lang.Throwable -> L50
            if (r2 != 0) goto L44
            com.baidu.location.h$d r2 = new com.baidu.location.h$d     // Catch: java.lang.Throwable -> L50
            r2.<init>(r8, r3)     // Catch: java.lang.Throwable -> L50
            r8.p = r2     // Catch: java.lang.Throwable -> L50
        L44:
            com.baidu.location.h$c r2 = r8.g     // Catch: java.lang.Throwable -> L50
            com.baidu.location.h$d r5 = r8.p     // Catch: java.lang.Throwable -> L50
            long r6 = (long) r0     // Catch: java.lang.Throwable -> L50
            r2.postDelayed(r5, r6)     // Catch: java.lang.Throwable -> L50
            r8.o = r4     // Catch: java.lang.Throwable -> L50
        L4e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L50
            goto L53
        L50:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L50
            throw r0     // Catch: java.lang.Exception -> L53
        L53:
            com.baidu.location.i r0 = new com.baidu.location.i
            r0.<init>(r9)
            r8.f1363b = r0
            android.os.Messenger r9 = r8.f
            if (r9 != 0) goto L5f
            return
        L5f:
            android.content.Context r9 = r8.e
            int r9 = a.a.a.i.i.a(r9)
            if (r9 >= r4) goto L68
            return
        L68:
            r9 = 15
            android.os.Message r9 = android.os.Message.obtain(r3, r9)     // Catch: java.lang.Exception -> L7f
            android.os.Messenger r0 = r8.h     // Catch: java.lang.Exception -> L7f
            r9.replyTo = r0     // Catch: java.lang.Exception -> L7f
            android.os.Bundle r0 = r8.b()     // Catch: java.lang.Exception -> L7f
            r9.setData(r0)     // Catch: java.lang.Exception -> L7f
            android.os.Messenger r8 = r8.f     // Catch: java.lang.Exception -> L7f
            r8.send(r9)     // Catch: java.lang.Exception -> L7f
            goto L83
        L7f:
            r8 = move-exception
            r8.printStackTrace()
        L83:
            return
    }

    public com.baidu.location.i h() {
            r0 = this;
            com.baidu.location.i r0 = r0.f1363b
            return r0
    }

    public final void h(android.os.Message r2) {
            r1 = this;
            if (r2 == 0) goto L18
            java.lang.Object r2 = r2.obj
            if (r2 != 0) goto L7
            goto L18
        L7:
            com.baidu.location.d r2 = (com.baidu.location.d) r2
            java.util.ArrayList<com.baidu.location.d> r0 = r1.i
            if (r0 == 0) goto L18
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L18
            java.util.ArrayList<com.baidu.location.d> r1 = r1.i
            r1.remove(r2)
        L18:
            return
    }

    public void i() {
            r1 = this;
            com.baidu.location.h$c r1 = r1.g
            r0 = 11
            android.os.Message r1 = r1.obtainMessage(r0)
            r1.sendToTarget()
            return
    }

    public final void i(android.os.Message r2) {
            r1 = this;
            if (r2 == 0) goto L18
            java.lang.Object r2 = r2.obj
            if (r2 != 0) goto L7
            goto L18
        L7:
            com.baidu.location.b r2 = (com.baidu.location.b) r2
            java.util.ArrayList<com.baidu.location.b> r0 = r1.j
            if (r0 == 0) goto L18
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L18
            java.util.ArrayList<com.baidu.location.b> r1 = r1.j
            r1.remove(r2)
        L18:
            return
    }

    public void j() {
            r4 = this;
            r0 = 0
            r4.y = r0
            boolean r0 = a.a.a.i.i.l()
            if (r0 == 0) goto La
            return
        La:
            android.content.Context r0 = r4.e
            android.content.Context r0 = r0.getApplicationContext()
            c.a.c.a.b r0 = c.a.c.a.b.c(r0)
            boolean r1 = com.baidu.location.h.K
            r0.a(r1)
            a.a.a.b.a r0 = a.a.a.b.a.c()
            android.content.Context r1 = r4.e
            com.baidu.location.i r2 = r4.f1364c
            r3 = 0
            r0.a(r1, r2, r3)
            com.baidu.location.h$e r0 = new com.baidu.location.h$e
            r0.<init>(r4, r3)
            r0.start()
            return
    }
}
