package b.b.c.b;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b.b.c.b.h f1028a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b.b.c.f.g<java.lang.String, android.graphics.Typeface> f1029b = null;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Le
            b.b.c.b.g r0 = new b.b.c.b.g
            r0.<init>()
        Lb:
            b.b.c.b.c.f1028a = r0
            goto L3a
        Le:
            r1 = 26
            if (r0 < r1) goto L18
            b.b.c.b.f r0 = new b.b.c.b.f
            r0.<init>()
            goto Lb
        L18:
            r1 = 24
            if (r0 < r1) goto L28
            boolean r0 = b.b.c.b.e.a()
            if (r0 == 0) goto L28
            b.b.c.b.e r0 = new b.b.c.b.e
            r0.<init>()
            goto Lb
        L28:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L34
            b.b.c.b.d r0 = new b.b.c.b.d
            r0.<init>()
            goto Lb
        L34:
            b.b.c.b.h r0 = new b.b.c.b.h
            r0.<init>()
            goto Lb
        L3a:
            b.b.c.f.g r0 = new b.b.c.f.g
            r1 = 16
            r0.<init>(r1)
            b.b.c.b.c.f1029b = r0
            return
    }

    public static android.graphics.Typeface a(android.content.Context r6, android.content.res.Resources r7, int r8, java.lang.String r9, int r10) {
            b.b.c.b.h r0 = b.b.c.b.c.f1028a
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            android.graphics.Typeface r6 = r0.a(r1, r2, r3, r4, r5)
            if (r6 == 0) goto L16
            java.lang.String r7 = a(r7, r8, r10)
            b.b.c.f.g<java.lang.String, android.graphics.Typeface> r8 = b.b.c.b.c.f1029b
            r8.a(r7, r6)
        L16:
            return r6
    }

    public static android.graphics.Typeface a(android.content.Context r1, android.os.CancellationSignal r2, b.b.c.d.b.f[] r3, int r4) {
            b.b.c.b.h r0 = b.b.c.b.c.f1028a
            android.graphics.Typeface r1 = r0.a(r1, r2, r3, r4)
            return r1
    }

    public static android.graphics.Typeface a(android.content.Context r7, b.b.c.a.d.c.a r8, android.content.res.Resources r9, int r10, int r11, b.b.c.a.d.f.a r12, android.os.Handler r13, boolean r14) {
            boolean r1 = r8 instanceof b.b.c.a.d.c.d
            if (r1 == 0) goto L2b
            r0 = r8
            b.b.c.a.d.c$d r0 = (b.b.c.a.d.c.d) r0
            r1 = 1
            r4 = 0
            if (r14 == 0) goto L12
            int r5 = r0.a()
            if (r5 != 0) goto L15
            goto L14
        L12:
            if (r12 != 0) goto L15
        L14:
            r4 = r1
        L15:
            if (r14 == 0) goto L1c
            int r1 = r0.c()
            goto L1d
        L1c:
            r1 = -1
        L1d:
            r5 = r1
            b.b.c.d.a r1 = r0.b()
            r0 = r7
            r2 = r12
            r3 = r13
            r6 = r11
            android.graphics.Typeface r0 = b.b.c.d.b.a(r0, r1, r2, r3, r4, r5, r6)
            goto L40
        L2b:
            b.b.c.b.h r1 = b.b.c.b.c.f1028a
            r0 = r8
            b.b.c.a.d.c$b r0 = (b.b.c.a.d.c.b) r0
            android.graphics.Typeface r0 = r1.a(r7, r0, r9, r11)
            if (r12 == 0) goto L40
            if (r0 == 0) goto L3c
            r12.a(r0, r13)
            goto L40
        L3c:
            r1 = -3
            r12.a(r1, r13)
        L40:
            if (r0 == 0) goto L4b
            b.b.c.f.g<java.lang.String, android.graphics.Typeface> r1 = b.b.c.b.c.f1029b
            java.lang.String r2 = a(r9, r10, r11)
            r1.a(r2, r0)
        L4b:
            return r0
    }

    private static java.lang.String a(android.content.res.Resources r1, int r2, int r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r1.getResourcePackageName(r2)
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            r0.append(r2)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static android.graphics.Typeface b(android.content.res.Resources r1, int r2, int r3) {
            b.b.c.f.g<java.lang.String, android.graphics.Typeface> r0 = b.b.c.b.c.f1029b
            java.lang.String r1 = a(r1, r2, r3)
            java.lang.Object r1 = r0.b(r1)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            return r1
    }
}
