package c.a.b.a;

/* JADX INFO: loaded from: classes.dex */
final class h extends c.a.b.a.g {
    private c.a.b.a.h.a d;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.Class f1197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.lang.reflect.Method f1198b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private java.lang.reflect.Method f1199c;

        private a() {
                r0 = this;
                r0.<init>()
                r0.a()
                return
        }

        /* synthetic */ a(c.a.b.a.i r1) {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ long a(c.a.b.a.h.a r0, java.lang.Object r1) {
                long r0 = r0.a(r1)
                return r0
        }

        private long a(java.lang.Object r2) {
                r1 = this;
                java.lang.reflect.Method r1 = r1.f1199c     // Catch: java.lang.Exception -> L10
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L10
                java.lang.Object r1 = r1.invoke(r2, r0)     // Catch: java.lang.Exception -> L10
                java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.Exception -> L10
                long r1 = r1.longValue()     // Catch: java.lang.Exception -> L10
                return r1
            L10:
                c.a.b.a.e$a r1 = new c.a.b.a.e$a
                java.lang.String r2 = ""
                r1.<init>(r2)
                throw r1
        }

        static /* synthetic */ java.lang.Object a(c.a.b.a.h.a r0) {
                java.lang.Object r0 = r0.b()
                return r0
        }

        private void a() {
                r6 = this;
                byte[] r0 = c.a.b.a.d.a()     // Catch: java.lang.Exception -> L48
                java.lang.String r0 = c.a.b.a.e.a(r0)     // Catch: java.lang.Exception -> L48
                java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
                java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Exception -> L48
                r2 = 1
                java.lang.Class r0 = java.lang.Class.forName(r0, r2, r1)     // Catch: java.lang.Exception -> L48
                r6.f1197a = r0     // Catch: java.lang.Exception -> L48
                byte[] r0 = c.a.b.a.d.b()     // Catch: java.lang.Exception -> L48
                java.lang.String r0 = c.a.b.a.e.a(r0)     // Catch: java.lang.Exception -> L48
                java.lang.Class r1 = r6.f1197a     // Catch: java.lang.Exception -> L48
                r3 = 3
                java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L48
                r4 = 0
                java.lang.Class<byte[]> r5 = byte[].class
                r3[r4] = r5     // Catch: java.lang.Exception -> L48
                java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L48
                r3[r2] = r4     // Catch: java.lang.Exception -> L48
                r2 = 2
                java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L48
                r3[r2] = r4     // Catch: java.lang.Exception -> L48
                java.lang.reflect.Method r0 = c.a.b.a.e.a(r1, r0, r3)     // Catch: java.lang.Exception -> L48
                r6.f1198b = r0     // Catch: java.lang.Exception -> L48
                byte[] r0 = c.a.b.a.d.c()     // Catch: java.lang.Exception -> L48
                java.lang.String r0 = c.a.b.a.e.a(r0)     // Catch: java.lang.Exception -> L48
                java.lang.Class r1 = r6.f1197a     // Catch: java.lang.Exception -> L48
                r2 = 0
                java.lang.reflect.Method r0 = c.a.b.a.e.a(r1, r0, r2)     // Catch: java.lang.Exception -> L48
                r6.f1199c = r0     // Catch: java.lang.Exception -> L48
                goto L4c
            L48:
                r6 = move-exception
                r6.printStackTrace()
            L4c:
                return
        }

        static /* synthetic */ void a(c.a.b.a.h.a r0, java.lang.Object r1, byte[] r2, int r3, int r4) {
                r0.a(r1, r2, r3, r4)
                return
        }

        private void a(java.lang.Object r3, byte[] r4, int r5, int r6) {
                r2 = this;
                java.lang.reflect.Method r2 = r2.f1198b     // Catch: java.lang.Exception -> L1a
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L1a
                r1 = 0
                r0[r1] = r4     // Catch: java.lang.Exception -> L1a
                r4 = 1
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L1a
                r0[r4] = r5     // Catch: java.lang.Exception -> L1a
                r4 = 2
                java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L1a
                r0[r4] = r5     // Catch: java.lang.Exception -> L1a
                r2.invoke(r3, r0)     // Catch: java.lang.Exception -> L1a
                return
            L1a:
                c.a.b.a.e$a r2 = new c.a.b.a.e$a
                java.lang.String r3 = ""
                r2.<init>(r3)
                throw r2
        }

        private java.lang.Object b() {
                r0 = this;
                java.lang.Class r0 = r0.f1197a
                java.lang.Object r0 = r0.newInstance()
                return r0
        }
    }

    public h(int r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 32
            r1.f1194a = r0
            r1.f1195b = r2
            r1.f1196c = r3
            c.a.b.a.h$a r2 = new c.a.b.a.h$a
            r3 = 0
            r2.<init>(r3)
            r1.d = r2
            return
    }

    @Override // c.a.b.a.g
    public c.a.b.a.b a(byte[] r3, int r4, int r5) {
            r2 = this;
            c.a.b.a.h$a r0 = r2.d     // Catch: java.lang.Exception -> L12
            java.lang.Object r0 = c.a.b.a.h.a.a(r0)     // Catch: java.lang.Exception -> L12
            c.a.b.a.h$a r1 = r2.d     // Catch: java.lang.Exception -> L12
            c.a.b.a.h.a.a(r1, r0, r3, r4, r5)     // Catch: java.lang.Exception -> L12
            c.a.b.a.h$a r2 = r2.d     // Catch: java.lang.Exception -> L12
            long r2 = c.a.b.a.h.a.a(r2, r0)     // Catch: java.lang.Exception -> L12
            goto L17
        L12:
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
        L17:
            r4 = 1
            long[] r4 = new long[r4]
            r5 = 0
            r4[r5] = r2
            c.a.b.a.b r2 = c.a.b.a.b.a(r4)
            return r2
    }
}
