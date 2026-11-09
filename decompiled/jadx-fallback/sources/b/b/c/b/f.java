package b.b.c.b;

/* JADX INFO: loaded from: classes.dex */
public class f extends b.b.c.b.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final java.lang.Class f1033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final java.lang.reflect.Constructor f1034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final java.lang.reflect.Method f1035c;
    protected final java.lang.reflect.Method d;
    protected final java.lang.reflect.Method e;
    protected final java.lang.reflect.Method f;
    protected final java.lang.reflect.Method g;

    public f() {
            r8 = this;
            r8.<init>()
            r0 = 0
            java.lang.Class r1 = r8.a()     // Catch: java.lang.Throwable -> L24
            java.lang.reflect.Constructor r2 = r8.e(r1)     // Catch: java.lang.Throwable -> L24
            java.lang.reflect.Method r3 = r8.b(r1)     // Catch: java.lang.Throwable -> L24
            java.lang.reflect.Method r4 = r8.c(r1)     // Catch: java.lang.Throwable -> L24
            java.lang.reflect.Method r5 = r8.f(r1)     // Catch: java.lang.Throwable -> L24
            java.lang.reflect.Method r6 = r8.a(r1)     // Catch: java.lang.Throwable -> L24
            java.lang.reflect.Method r0 = r8.d(r1)     // Catch: java.lang.Throwable -> L24
            r7 = r1
            r1 = r0
            r0 = r7
            goto L49
        L24:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unable to collect necessary methods for class "
            r2.append(r3)
            java.lang.Class r3 = r1.getClass()
            java.lang.String r3 = r3.getName()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "TypefaceCompatApi26Impl"
            android.util.Log.e(r3, r2, r1)
            r1 = r0
            r2 = r1
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
        L49:
            r8.f1033a = r0
            r8.f1034b = r2
            r8.f1035c = r3
            r8.d = r4
            r8.e = r5
            r8.f = r6
            r8.g = r1
            return
    }

    private boolean a(android.content.Context r3, java.lang.Object r4, java.lang.String r5, int r6, int r7, int r8, android.graphics.fonts.FontVariationAxis[] r9) {
            r2 = this;
            java.lang.reflect.Method r2 = r2.f1035c     // Catch: java.lang.Throwable -> L41
            r0 = 8
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L41
            android.content.res.AssetManager r3 = r3.getAssets()     // Catch: java.lang.Throwable -> L41
            r1 = 0
            r0[r1] = r3     // Catch: java.lang.Throwable -> L41
            r3 = 1
            r0[r3] = r5     // Catch: java.lang.Throwable -> L41
            r3 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L41
            r0[r3] = r5     // Catch: java.lang.Throwable -> L41
            r3 = 3
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L41
            r0[r3] = r5     // Catch: java.lang.Throwable -> L41
            r3 = 4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L41
            r0[r3] = r5     // Catch: java.lang.Throwable -> L41
            r3 = 5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L41
            r0[r3] = r5     // Catch: java.lang.Throwable -> L41
            r3 = 6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L41
            r0[r3] = r5     // Catch: java.lang.Throwable -> L41
            r3 = 7
            r0[r3] = r9     // Catch: java.lang.Throwable -> L41
            java.lang.Object r2 = r2.invoke(r4, r0)     // Catch: java.lang.Throwable -> L41
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L41
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L41
            return r2
        L41:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            throw r3
    }

    private boolean a(java.lang.Object r3, java.nio.ByteBuffer r4, int r5, int r6, int r7) {
            r2 = this;
            java.lang.reflect.Method r2 = r2.d     // Catch: java.lang.Throwable -> L2c
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L2c
            r1 = 0
            r0[r1] = r4     // Catch: java.lang.Throwable -> L2c
            r4 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L2c
            r0[r4] = r5     // Catch: java.lang.Throwable -> L2c
            r4 = 2
            r5 = 0
            r0[r4] = r5     // Catch: java.lang.Throwable -> L2c
            r4 = 3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L2c
            r0[r4] = r5     // Catch: java.lang.Throwable -> L2c
            r4 = 4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L2c
            r0[r4] = r5     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r2 = r2.invoke(r3, r0)     // Catch: java.lang.Throwable -> L2c
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L2c
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L2c
            return r2
        L2c:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            throw r3
    }

    private void b(java.lang.Object r2) {
            r1 = this;
            java.lang.reflect.Method r1 = r1.f     // Catch: java.lang.Throwable -> L9
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L9
            r1.invoke(r2, r0)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r1)
            throw r2
    }

    private boolean b() {
            r2 = this;
            java.lang.reflect.Method r0 = r2.f1035c
            if (r0 != 0) goto Lb
            java.lang.String r0 = "TypefaceCompatApi26Impl"
            java.lang.String r1 = "Unable to collect necessary private methods. Fallback to legacy implementation."
            android.util.Log.w(r0, r1)
        Lb:
            java.lang.reflect.Method r2 = r2.f1035c
            if (r2 == 0) goto L11
            r2 = 1
            goto L12
        L11:
            r2 = 0
        L12:
            return r2
    }

    private java.lang.Object c() {
            r1 = this;
            java.lang.reflect.Constructor r1 = r1.f1034b     // Catch: java.lang.Throwable -> La
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> La
            java.lang.Object r1 = r1.newInstance(r0)     // Catch: java.lang.Throwable -> La
            return r1
        La:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
    }

    private boolean c(java.lang.Object r2) {
            r1 = this;
            java.lang.reflect.Method r1 = r1.e     // Catch: java.lang.Throwable -> L10
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L10
            java.lang.Object r1 = r1.invoke(r2, r0)     // Catch: java.lang.Throwable -> L10
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L10
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L10
            return r1
        L10:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r1)
            throw r2
    }

    @Override // b.b.c.b.h
    public android.graphics.Typeface a(android.content.Context r9, android.content.res.Resources r10, int r11, java.lang.String r12, int r13) {
            r8 = this;
            boolean r0 = r8.b()
            if (r0 != 0) goto Lb
            android.graphics.Typeface r8 = super.a(r9, r10, r11, r12, r13)
            return r8
        Lb:
            java.lang.Object r10 = r8.c()
            r4 = 0
            r5 = -1
            r6 = -1
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r12
            boolean r9 = r0.a(r1, r2, r3, r4, r5, r6, r7)
            r11 = 0
            if (r9 != 0) goto L22
            r8.b(r10)
            return r11
        L22:
            boolean r9 = r8.c(r10)
            if (r9 != 0) goto L29
            return r11
        L29:
            android.graphics.Typeface r8 = r8.a(r10)
            return r8
    }

    @Override // b.b.c.b.d, b.b.c.b.h
    public android.graphics.Typeface a(android.content.Context r11, android.os.CancellationSignal r12, b.b.c.d.b.f[] r13, int r14) {
            r10 = this;
            int r0 = r13.length
            r1 = 1
            r2 = 0
            if (r0 >= r1) goto L6
            return r2
        L6:
            boolean r0 = r10.b()
            if (r0 != 0) goto L58
            b.b.c.d.b$f r10 = r10.a(r13, r14)
            android.content.ContentResolver r11 = r11.getContentResolver()
            android.net.Uri r13 = r10.c()     // Catch: java.io.IOException -> L57
            java.lang.String r14 = "r"
            android.os.ParcelFileDescriptor r11 = r11.openFileDescriptor(r13, r14, r12)     // Catch: java.io.IOException -> L57
            if (r11 != 0) goto L26
            if (r11 == 0) goto L25
            r11.close()     // Catch: java.io.IOException -> L57
        L25:
            return r2
        L26:
            android.graphics.Typeface$Builder r12 = new android.graphics.Typeface$Builder     // Catch: java.lang.Throwable -> L49
            java.io.FileDescriptor r13 = r11.getFileDescriptor()     // Catch: java.lang.Throwable -> L49
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L49
            int r13 = r10.d()     // Catch: java.lang.Throwable -> L49
            android.graphics.Typeface$Builder r12 = r12.setWeight(r13)     // Catch: java.lang.Throwable -> L49
            boolean r10 = r10.e()     // Catch: java.lang.Throwable -> L49
            android.graphics.Typeface$Builder r10 = r12.setItalic(r10)     // Catch: java.lang.Throwable -> L49
            android.graphics.Typeface r10 = r10.build()     // Catch: java.lang.Throwable -> L49
            if (r11 == 0) goto L48
            r11.close()     // Catch: java.io.IOException -> L57
        L48:
            return r10
        L49:
            r10 = move-exception
            throw r10     // Catch: java.lang.Throwable -> L4b
        L4b:
            r12 = move-exception
            if (r11 == 0) goto L56
            r11.close()     // Catch: java.lang.Throwable -> L52
            goto L56
        L52:
            r11 = move-exception
            r10.addSuppressed(r11)     // Catch: java.io.IOException -> L57
        L56:
            throw r12     // Catch: java.io.IOException -> L57
        L57:
            return r2
        L58:
            java.util.Map r11 = b.b.c.d.b.a(r11, r13, r12)
            java.lang.Object r12 = r10.c()
            int r0 = r13.length
            r3 = 0
            r9 = r3
        L63:
            if (r9 >= r0) goto L90
            r4 = r13[r9]
            android.net.Uri r5 = r4.c()
            java.lang.Object r5 = r11.get(r5)
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            if (r5 != 0) goto L74
            goto L8d
        L74:
            int r6 = r4.b()
            int r7 = r4.d()
            boolean r8 = r4.e()
            r3 = r10
            r4 = r12
            boolean r3 = r3.a(r4, r5, r6, r7, r8)
            if (r3 != 0) goto L8c
            r10.b(r12)
            return r2
        L8c:
            r3 = r1
        L8d:
            int r9 = r9 + 1
            goto L63
        L90:
            if (r3 != 0) goto L96
            r10.b(r12)
            return r2
        L96:
            boolean r11 = r10.c(r12)
            if (r11 != 0) goto L9d
            return r2
        L9d:
            android.graphics.Typeface r10 = r10.a(r12)
            android.graphics.Typeface r10 = android.graphics.Typeface.create(r10, r14)
            return r10
    }

    @Override // b.b.c.b.h
    public android.graphics.Typeface a(android.content.Context r11, b.b.c.a.d.c.b r12, android.content.res.Resources r13, int r14) {
            r10 = this;
            boolean r0 = r10.b()
            if (r0 != 0) goto Lb
            android.graphics.Typeface r10 = super.a(r11, r12, r13, r14)
            return r10
        Lb:
            java.lang.Object r13 = r10.c()
            b.b.c.a.d.c$c[] r12 = r12.a()
            int r14 = r12.length
            r0 = 0
            r8 = r0
        L16:
            r9 = 0
            if (r8 >= r14) goto L43
            r0 = r12[r8]
            java.lang.String r3 = r0.a()
            int r4 = r0.c()
            int r5 = r0.e()
            boolean r6 = r0.f()
            java.lang.String r0 = r0.d()
            android.graphics.fonts.FontVariationAxis[] r7 = android.graphics.fonts.FontVariationAxis.fromFontVariationSettings(r0)
            r0 = r10
            r1 = r11
            r2 = r13
            boolean r0 = r0.a(r1, r2, r3, r4, r5, r6, r7)
            if (r0 != 0) goto L40
            r10.b(r13)
            return r9
        L40:
            int r8 = r8 + 1
            goto L16
        L43:
            boolean r11 = r10.c(r13)
            if (r11 != 0) goto L4a
            return r9
        L4a:
            android.graphics.Typeface r10 = r10.a(r13)
            return r10
    }

    protected android.graphics.Typeface a(java.lang.Object r5) {
            r4 = this;
            java.lang.Class r0 = r4.f1033a     // Catch: java.lang.Throwable -> L28
            r1 = 1
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)     // Catch: java.lang.Throwable -> L28
            r2 = 0
            java.lang.reflect.Array.set(r0, r2, r5)     // Catch: java.lang.Throwable -> L28
            java.lang.reflect.Method r4 = r4.g     // Catch: java.lang.Throwable -> L28
            r5 = 0
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L28
            r3[r2] = r0     // Catch: java.lang.Throwable -> L28
            r0 = -1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L28
            r3[r1] = r2     // Catch: java.lang.Throwable -> L28
            r1 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L28
            r3[r1] = r0     // Catch: java.lang.Throwable -> L28
            java.lang.Object r4 = r4.invoke(r5, r3)     // Catch: java.lang.Throwable -> L28
            android.graphics.Typeface r4 = (android.graphics.Typeface) r4     // Catch: java.lang.Throwable -> L28
            return r4
        L28:
            r4 = move-exception
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            r5.<init>(r4)
            throw r5
    }

    protected java.lang.Class a() {
            r0 = this;
            java.lang.String r0 = "android.graphics.FontFamily"
            java.lang.Class r0 = java.lang.Class.forName(r0)
            return r0
    }

    protected java.lang.reflect.Method a(java.lang.Class r2) {
            r1 = this;
            r1 = 0
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.String r0 = "abortCreation"
            java.lang.reflect.Method r1 = r2.getMethod(r0, r1)
            return r1
    }

    protected java.lang.reflect.Method b(java.lang.Class r3) {
            r2 = this;
            r2 = 8
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r0 = 0
            java.lang.Class<android.content.res.AssetManager> r1 = android.content.res.AssetManager.class
            r2[r0] = r1
            r0 = 1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r2[r0] = r1
            java.lang.Class r0 = java.lang.Integer.TYPE
            r1 = 2
            r2[r1] = r0
            java.lang.Class r0 = java.lang.Boolean.TYPE
            r1 = 3
            r2[r1] = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            r1 = 4
            r2[r1] = r0
            r1 = 5
            r2[r1] = r0
            r1 = 6
            r2[r1] = r0
            r0 = 7
            java.lang.Class<android.graphics.fonts.FontVariationAxis[]> r1 = android.graphics.fonts.FontVariationAxis[].class
            r2[r0] = r1
            java.lang.String r0 = "addFontFromAssetManager"
            java.lang.reflect.Method r2 = r3.getMethod(r0, r2)
            return r2
    }

    protected java.lang.reflect.Method c(java.lang.Class r4) {
            r3 = this;
            r3 = 5
            java.lang.Class[] r3 = new java.lang.Class[r3]
            r0 = 0
            java.lang.Class<java.nio.ByteBuffer> r1 = java.nio.ByteBuffer.class
            r3[r0] = r1
            java.lang.Class r0 = java.lang.Integer.TYPE
            r1 = 1
            r3[r1] = r0
            r1 = 2
            java.lang.Class<android.graphics.fonts.FontVariationAxis[]> r2 = android.graphics.fonts.FontVariationAxis[].class
            r3[r1] = r2
            r1 = 3
            r3[r1] = r0
            r1 = 4
            r3[r1] = r0
            java.lang.String r0 = "addFontFromBuffer"
            java.lang.reflect.Method r3 = r4.getMethod(r0, r3)
            return r3
    }

    protected java.lang.reflect.Method d(java.lang.Class r4) {
            r3 = this;
            r3 = 1
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r3)
            java.lang.Class<android.graphics.Typeface> r0 = android.graphics.Typeface.class
            r1 = 3
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class r4 = r4.getClass()
            r2 = 0
            r1[r2] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r1[r3] = r4
            r2 = 2
            r1[r2] = r4
            java.lang.String r4 = "createFromFamiliesWithDefault"
            java.lang.reflect.Method r4 = r0.getDeclaredMethod(r4, r1)
            r4.setAccessible(r3)
            return r4
    }

    protected java.lang.reflect.Constructor e(java.lang.Class r1) {
            r0 = this;
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.reflect.Constructor r0 = r1.getConstructor(r0)
            return r0
    }

    protected java.lang.reflect.Method f(java.lang.Class r2) {
            r1 = this;
            r1 = 0
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.String r0 = "freeze"
            java.lang.reflect.Method r1 = r2.getMethod(r0, r1)
            return r1
    }
}
