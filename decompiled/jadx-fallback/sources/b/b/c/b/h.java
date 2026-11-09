package b.b.c.b;

/* JADX INFO: loaded from: classes.dex */
class h {

    class a implements b.b.c.b.h.c<b.b.c.d.b.f> {
        a(b.b.c.b.h r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method */
        public int a2(b.b.c.d.b.f r1) {
                r0 = this;
                int r0 = r1.d()
                return r0
        }

        @Override // b.b.c.b.h.c
        public /* bridge */ /* synthetic */ int a(b.b.c.d.b.f r1) {
                r0 = this;
                b.b.c.d.b$f r1 = (b.b.c.d.b.f) r1
                int r0 = r0.a2(r1)
                return r0
        }

        /* JADX INFO: renamed from: b, reason: avoid collision after fix types in other method */
        public boolean b2(b.b.c.d.b.f r1) {
                r0 = this;
                boolean r0 = r1.e()
                return r0
        }

        @Override // b.b.c.b.h.c
        public /* bridge */ /* synthetic */ boolean b(b.b.c.d.b.f r1) {
                r0 = this;
                b.b.c.d.b$f r1 = (b.b.c.d.b.f) r1
                boolean r0 = r0.b2(r1)
                return r0
        }
    }

    class b implements b.b.c.b.h.c<b.b.c.a.d.c.C0039c> {
        b(b.b.c.b.h r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method */
        public int a2(b.b.c.a.d.c.C0039c r1) {
                r0 = this;
                int r0 = r1.e()
                return r0
        }

        @Override // b.b.c.b.h.c
        public /* bridge */ /* synthetic */ int a(b.b.c.a.d.c.C0039c r1) {
                r0 = this;
                b.b.c.a.d.c$c r1 = (b.b.c.a.d.c.C0039c) r1
                int r0 = r0.a2(r1)
                return r0
        }

        /* JADX INFO: renamed from: b, reason: avoid collision after fix types in other method */
        public boolean b2(b.b.c.a.d.c.C0039c r1) {
                r0 = this;
                boolean r0 = r1.f()
                return r0
        }

        @Override // b.b.c.b.h.c
        public /* bridge */ /* synthetic */ boolean b(b.b.c.a.d.c.C0039c r1) {
                r0 = this;
                b.b.c.a.d.c$c r1 = (b.b.c.a.d.c.C0039c) r1
                boolean r0 = r0.b2(r1)
                return r0
        }
    }

    private interface c<T> {
        int a(T r1);

        boolean b(T r1);
    }

    h() {
            r0 = this;
            r0.<init>()
            return
    }

    private b.b.c.a.d.c.C0039c a(b.b.c.a.d.c.b r2, int r3) {
            r1 = this;
            b.b.c.a.d.c$c[] r2 = r2.a()
            b.b.c.b.h$b r0 = new b.b.c.b.h$b
            r0.<init>(r1)
            java.lang.Object r1 = a(r2, r3, r0)
            b.b.c.a.d.c$c r1 = (b.b.c.a.d.c.C0039c) r1
            return r1
    }

    private static <T> T a(T[] r10, int r11, b.b.c.b.h.c<T> r12) {
            r0 = r11 & 1
            if (r0 != 0) goto L7
            r0 = 400(0x190, float:5.6E-43)
            goto L9
        L7:
            r0 = 700(0x2bc, float:9.81E-43)
        L9:
            r11 = r11 & 2
            r1 = 0
            r2 = 1
            if (r11 == 0) goto L11
            r11 = r2
            goto L12
        L11:
            r11 = r1
        L12:
            r3 = 0
            r4 = 2147483647(0x7fffffff, float:NaN)
            int r5 = r10.length
            r6 = r1
        L18:
            if (r6 >= r5) goto L3a
            r7 = r10[r6]
            int r8 = r12.a(r7)
            int r8 = r8 - r0
            int r8 = java.lang.Math.abs(r8)
            int r8 = r8 * 2
            boolean r9 = r12.b(r7)
            if (r9 != r11) goto L2f
            r9 = r1
            goto L30
        L2f:
            r9 = r2
        L30:
            int r8 = r8 + r9
            if (r3 == 0) goto L35
            if (r4 <= r8) goto L37
        L35:
            r3 = r7
            r4 = r8
        L37:
            int r6 = r6 + 1
            goto L18
        L3a:
            return r3
    }

    public android.graphics.Typeface a(android.content.Context r1, android.content.res.Resources r2, int r3, java.lang.String r4, int r5) {
            r0 = this;
            java.io.File r0 = b.b.c.b.i.a(r1)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = b.b.c.b.i.a(r0, r2, r3)     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L23
            if (r2 != 0) goto L12
            r0.delete()
            return r1
        L12:
            java.lang.String r2 = r0.getPath()     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L23
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromFile(r2)     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L23
            r0.delete()
            return r1
        L1e:
            r1 = move-exception
            r0.delete()
            throw r1
        L23:
            r0.delete()
            return r1
    }

    public android.graphics.Typeface a(android.content.Context r3, android.os.CancellationSignal r4, b.b.c.d.b.f[] r5, int r6) {
            r2 = this;
            int r4 = r5.length
            r0 = 0
            r1 = 1
            if (r4 >= r1) goto L6
            return r0
        L6:
            b.b.c.d.b$f r4 = r2.a(r5, r6)
            android.content.ContentResolver r5 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L26
            android.net.Uri r4 = r4.c()     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L26
            java.io.InputStream r4 = r5.openInputStream(r4)     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L26
            android.graphics.Typeface r2 = r2.a(r3, r4)     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L27
            b.b.c.b.i.a(r4)
            return r2
        L1e:
            r2 = move-exception
            r0 = r4
            goto L22
        L21:
            r2 = move-exception
        L22:
            b.b.c.b.i.a(r0)
            throw r2
        L26:
            r4 = r0
        L27:
            b.b.c.b.i.a(r4)
            return r0
    }

    public android.graphics.Typeface a(android.content.Context r1, b.b.c.a.d.c.b r2, android.content.res.Resources r3, int r4) {
            r0 = this;
            b.b.c.a.d.c$c r0 = r0.a(r2, r4)
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r2 = r0.b()
            java.lang.String r0 = r0.a()
            android.graphics.Typeface r0 = b.b.c.b.c.a(r1, r3, r2, r0, r4)
            return r0
    }

    protected android.graphics.Typeface a(android.content.Context r1, java.io.InputStream r2) {
            r0 = this;
            java.io.File r0 = b.b.c.b.i.a(r1)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = b.b.c.b.i.a(r0, r2)     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L23
            if (r2 != 0) goto L12
            r0.delete()
            return r1
        L12:
            java.lang.String r2 = r0.getPath()     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L23
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromFile(r2)     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L23
            r0.delete()
            return r1
        L1e:
            r1 = move-exception
            r0.delete()
            throw r1
        L23:
            r0.delete()
            return r1
    }

    protected b.b.c.d.b.f a(b.b.c.d.b.f[] r2, int r3) {
            r1 = this;
            b.b.c.b.h$a r0 = new b.b.c.b.h$a
            r0.<init>(r1)
            java.lang.Object r1 = a(r2, r3, r0)
            b.b.c.d.b$f r1 = (b.b.c.d.b.f) r1
            return r1
    }
}
