package b.b.c.a.d;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    public static abstract class a {

        /* JADX INFO: renamed from: b.b.c.a.d.f$a$a, reason: collision with other inner class name */
        class RunnableC0040a implements java.lang.Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.graphics.Typeface f1020b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b.b.c.a.d.f.a f1021c;

            RunnableC0040a(b.b.c.a.d.f.a r1, android.graphics.Typeface r2) {
                    r0 = this;
                    r0.f1021c = r1
                    r0.f1020b = r2
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r1 = this;
                    b.b.c.a.d.f$a r0 = r1.f1021c
                    android.graphics.Typeface r1 = r1.f1020b
                    r0.a(r1)
                    return
            }
        }

        class b implements java.lang.Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f1022b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b.b.c.a.d.f.a f1023c;

            b(b.b.c.a.d.f.a r1, int r2) {
                    r0 = this;
                    r0.f1023c = r1
                    r0.f1022b = r2
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r1 = this;
                    b.b.c.a.d.f$a r0 = r1.f1023c
                    int r1 = r1.f1022b
                    r0.a(r1)
                    return
            }
        }

        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract void a(int r1);

        public final void a(int r2, android.os.Handler r3) {
                r1 = this;
                if (r3 != 0) goto Lb
                android.os.Handler r3 = new android.os.Handler
                android.os.Looper r0 = android.os.Looper.getMainLooper()
                r3.<init>(r0)
            Lb:
                b.b.c.a.d.f$a$b r0 = new b.b.c.a.d.f$a$b
                r0.<init>(r1, r2)
                r3.post(r0)
                return
        }

        public abstract void a(android.graphics.Typeface r1);

        public final void a(android.graphics.Typeface r2, android.os.Handler r3) {
                r1 = this;
                if (r3 != 0) goto Lb
                android.os.Handler r3 = new android.os.Handler
                android.os.Looper r0 = android.os.Looper.getMainLooper()
                r3.<init>(r0)
            Lb:
                b.b.c.a.d.f$a$a r0 = new b.b.c.a.d.f$a$a
                r0.<init>(r1, r2)
                r3.post(r0)
                return
        }
    }

    public static android.graphics.Typeface a(android.content.Context r7, int r8, android.util.TypedValue r9, int r10, b.b.c.a.d.f.a r11) {
            boolean r0 = r7.isRestricted()
            if (r0 == 0) goto L8
            r7 = 0
            return r7
        L8:
            r5 = 0
            r6 = 1
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            android.graphics.Typeface r7 = a(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    private static android.graphics.Typeface a(android.content.Context r8, int r9, android.util.TypedValue r10, int r11, b.b.c.a.d.f.a r12, android.os.Handler r13, boolean r14) {
            android.content.res.Resources r1 = r8.getResources()
            r0 = 1
            r1.getValue(r9, r10, r0)
            r0 = r8
            r2 = r10
            r3 = r9
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            android.graphics.Typeface r8 = a(r0, r1, r2, r3, r4, r5, r6, r7)
            if (r8 != 0) goto L38
            if (r12 == 0) goto L18
            goto L38
        L18:
            android.content.res.Resources$NotFoundException r8 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Font resource ID #0x"
            r10.append(r11)
            java.lang.String r9 = java.lang.Integer.toHexString(r9)
            r10.append(r9)
            java.lang.String r9 = " could not be retrieved."
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L38:
            return r8
    }

    private static android.graphics.Typeface a(android.content.Context r15, android.content.res.Resources r16, android.util.TypedValue r17, int r18, int r19, b.b.c.a.d.f.a r20, android.os.Handler r21, boolean r22) {
            r0 = r16
            r1 = r17
            r4 = r18
            r5 = r19
            r9 = r20
            r10 = r21
            java.lang.String r11 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto L9a
            java.lang.String r12 = r2.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r12.startsWith(r1)
            r13 = 0
            r14 = -3
            if (r1 != 0) goto L26
            if (r9 == 0) goto L25
            r9.a(r14, r10)
        L25:
            return r13
        L26:
            android.graphics.Typeface r1 = b.b.c.b.c.b(r0, r4, r5)
            if (r1 == 0) goto L32
            if (r9 == 0) goto L31
            r9.a(r1, r10)
        L31:
            return r1
        L32:
            java.lang.String r1 = r12.toLowerCase()     // Catch: java.io.IOException -> L76 org.xmlpull.v1.XmlPullParserException -> L7f
            java.lang.String r2 = ".xml"
            boolean r1 = r1.endsWith(r2)     // Catch: java.io.IOException -> L76 org.xmlpull.v1.XmlPullParserException -> L7f
            if (r1 == 0) goto L65
            android.content.res.XmlResourceParser r1 = r0.getXml(r4)     // Catch: java.io.IOException -> L76 org.xmlpull.v1.XmlPullParserException -> L7f
            b.b.c.a.d.c$a r2 = b.b.c.a.d.c.a(r1, r0)     // Catch: java.io.IOException -> L76 org.xmlpull.v1.XmlPullParserException -> L7f
            if (r2 != 0) goto L53
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r11, r0)     // Catch: java.io.IOException -> L76 org.xmlpull.v1.XmlPullParserException -> L7f
            if (r9 == 0) goto L52
            r9.a(r14, r10)     // Catch: java.io.IOException -> L76 org.xmlpull.v1.XmlPullParserException -> L7f
        L52:
            return r13
        L53:
            r1 = r15
            r3 = r16
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            android.graphics.Typeface r0 = b.b.c.b.c.a(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.io.IOException -> L76 org.xmlpull.v1.XmlPullParserException -> L7f
            return r0
        L65:
            r1 = r15
            android.graphics.Typeface r0 = b.b.c.b.c.a(r15, r0, r4, r12, r5)     // Catch: java.io.IOException -> L76 org.xmlpull.v1.XmlPullParserException -> L7f
            if (r9 == 0) goto L75
            if (r0 == 0) goto L72
            r9.a(r0, r10)     // Catch: java.io.IOException -> L76 org.xmlpull.v1.XmlPullParserException -> L7f
            goto L75
        L72:
            r9.a(r14, r10)     // Catch: java.io.IOException -> L76 org.xmlpull.v1.XmlPullParserException -> L7f
        L75:
            return r0
        L76:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            goto L87
        L7f:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
        L87:
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
            if (r9 == 0) goto L99
            r9.a(r14, r10)
        L99:
            return r13
        L9a:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r18)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
    }

    public static android.graphics.drawable.Drawable a(android.content.res.Resources r2, int r3, android.content.res.Resources.Theme r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto Lb
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3, r4)
            return r2
        Lb:
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3)
            return r2
    }
}
