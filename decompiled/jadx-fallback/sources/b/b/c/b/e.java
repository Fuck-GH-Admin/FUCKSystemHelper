package b.b.c.b;

/* JADX INFO: loaded from: classes.dex */
class e extends b.b.c.b.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.Class f1030a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.lang.reflect.Constructor f1031b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.lang.reflect.Method f1032c = null;
    private static final java.lang.reflect.Method d = null;

    static {
            r0 = 0
            java.lang.String r1 = "android.graphics.FontFamily"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L46
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L46
            java.lang.reflect.Constructor r3 = r1.getConstructor(r3)     // Catch: java.lang.Throwable -> L46
            java.lang.String r4 = "addFontWeightStyle"
            r5 = 5
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L46
            java.lang.Class<java.nio.ByteBuffer> r6 = java.nio.ByteBuffer.class
            r5[r2] = r6     // Catch: java.lang.Throwable -> L46
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L46
            r7 = 1
            r5[r7] = r6     // Catch: java.lang.Throwable -> L46
            r6 = 2
            java.lang.Class<java.util.List> r8 = java.util.List.class
            r5[r6] = r8     // Catch: java.lang.Throwable -> L46
            r6 = 3
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L46
            r5[r6] = r8     // Catch: java.lang.Throwable -> L46
            r6 = 4
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L46
            r5[r6] = r8     // Catch: java.lang.Throwable -> L46
            java.lang.reflect.Method r4 = r1.getMethod(r4, r5)     // Catch: java.lang.Throwable -> L46
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r1, r7)     // Catch: java.lang.Throwable -> L46
            java.lang.Class<android.graphics.Typeface> r6 = android.graphics.Typeface.class
            java.lang.String r8 = "createFromFamiliesWithDefault"
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> L46
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L46
            r7[r2] = r5     // Catch: java.lang.Throwable -> L46
            java.lang.reflect.Method r0 = r6.getMethod(r8, r7)     // Catch: java.lang.Throwable -> L46
            r2 = r0
            r0 = r3
            goto L57
        L46:
            r1 = move-exception
            java.lang.Class r2 = r1.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "TypefaceCompatApi24Impl"
            android.util.Log.e(r3, r2, r1)
            r1 = r0
            r2 = r1
            r4 = r2
        L57:
            b.b.c.b.e.f1031b = r0
            b.b.c.b.e.f1030a = r1
            b.b.c.b.e.f1032c = r4
            b.b.c.b.e.d = r2
            return
    }

    e() {
            r0 = this;
            r0.<init>()
            return
    }

    private static android.graphics.Typeface a(java.lang.Object r4) {
            java.lang.Class r0 = b.b.c.b.e.f1030a     // Catch: java.lang.Throwable -> L19
            r1 = 1
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)     // Catch: java.lang.Throwable -> L19
            r2 = 0
            java.lang.reflect.Array.set(r0, r2, r4)     // Catch: java.lang.Throwable -> L19
            java.lang.reflect.Method r4 = b.b.c.b.e.d     // Catch: java.lang.Throwable -> L19
            r3 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L19
            r1[r2] = r0     // Catch: java.lang.Throwable -> L19
            java.lang.Object r4 = r4.invoke(r3, r1)     // Catch: java.lang.Throwable -> L19
            android.graphics.Typeface r4 = (android.graphics.Typeface) r4     // Catch: java.lang.Throwable -> L19
            return r4
        L19:
            r4 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r4)
            throw r0
    }

    public static boolean a() {
            java.lang.reflect.Method r0 = b.b.c.b.e.f1032c
            if (r0 != 0) goto Lb
            java.lang.String r0 = "TypefaceCompatApi24Impl"
            java.lang.String r1 = "Unable to collect necessary private methods.Fallback to legacy implementation."
            android.util.Log.w(r0, r1)
        Lb:
            java.lang.reflect.Method r0 = b.b.c.b.e.f1032c
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    private static boolean a(java.lang.Object r3, java.nio.ByteBuffer r4, int r5, int r6, boolean r7) {
            java.lang.reflect.Method r0 = b.b.c.b.e.f1032c     // Catch: java.lang.Throwable -> L2c
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L2c
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.Throwable -> L2c
            r4 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L2c
            r1[r4] = r5     // Catch: java.lang.Throwable -> L2c
            r4 = 2
            r5 = 0
            r1[r4] = r5     // Catch: java.lang.Throwable -> L2c
            r4 = 3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L2c
            r1[r4] = r5     // Catch: java.lang.Throwable -> L2c
            r4 = 4
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> L2c
            r1[r4] = r5     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r3 = r0.invoke(r3, r1)     // Catch: java.lang.Throwable -> L2c
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L2c
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L2c
            return r3
        L2c:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>(r3)
            throw r4
    }

    private static java.lang.Object b() {
            java.lang.reflect.Constructor r0 = b.b.c.b.e.f1031b     // Catch: java.lang.Throwable -> La
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> La
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Throwable -> La
            return r0
        La:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    @Override // b.b.c.b.h
    public android.graphics.Typeface a(android.content.Context r8, android.os.CancellationSignal r9, b.b.c.d.b.f[] r10, int r11) {
            r7 = this;
            java.lang.Object r7 = b()
            b.b.c.f.k r0 = new b.b.c.f.k
            r0.<init>()
            int r1 = r10.length
            r2 = 0
        Lb:
            if (r2 >= r1) goto L39
            r3 = r10[r2]
            android.net.Uri r4 = r3.c()
            java.lang.Object r5 = r0.get(r4)
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            if (r5 != 0) goto L22
            java.nio.ByteBuffer r5 = b.b.c.b.i.a(r8, r9, r4)
            r0.put(r4, r5)
        L22:
            int r4 = r3.b()
            int r6 = r3.d()
            boolean r3 = r3.e()
            boolean r3 = a(r7, r5, r4, r6, r3)
            if (r3 != 0) goto L36
            r7 = 0
            return r7
        L36:
            int r2 = r2 + 1
            goto Lb
        L39:
            android.graphics.Typeface r7 = a(r7)
            android.graphics.Typeface r7 = android.graphics.Typeface.create(r7, r11)
            return r7
    }

    @Override // b.b.c.b.h
    public android.graphics.Typeface a(android.content.Context r7, b.b.c.a.d.c.b r8, android.content.res.Resources r9, int r10) {
            r6 = this;
            java.lang.Object r6 = b()
            b.b.c.a.d.c$c[] r8 = r8.a()
            int r10 = r8.length
            r0 = 0
        La:
            if (r0 >= r10) goto L30
            r1 = r8[r0]
            int r2 = r1.b()
            java.nio.ByteBuffer r2 = b.b.c.b.i.a(r7, r9, r2)
            r3 = 0
            if (r2 != 0) goto L1a
            return r3
        L1a:
            int r4 = r1.c()
            int r5 = r1.e()
            boolean r1 = r1.f()
            boolean r1 = a(r6, r2, r4, r5, r1)
            if (r1 != 0) goto L2d
            return r3
        L2d:
            int r0 = r0 + 1
            goto La
        L30:
            android.graphics.Typeface r6 = a(r6)
            return r6
    }
}
