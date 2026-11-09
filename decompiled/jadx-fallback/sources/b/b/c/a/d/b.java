package b.b.c.a.d;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.graphics.Shader f1008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.res.ColorStateList f1009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1010c;

    private b(android.graphics.Shader r1, android.content.res.ColorStateList r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f1008a = r1
            r0.f1009b = r2
            r0.f1010c = r3
            return
    }

    static b.b.c.a.d.b a(android.content.res.ColorStateList r3) {
            b.b.c.a.d.b r0 = new b.b.c.a.d.b
            int r1 = r3.getDefaultColor()
            r2 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    private static b.b.c.a.d.b a(android.content.res.Resources r6, int r7, android.content.res.Resources.Theme r8) {
            android.content.res.XmlResourceParser r7 = r6.getXml(r7)
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r7)
        L8:
            int r1 = r7.next()
            r2 = 2
            r3 = 1
            if (r1 == r2) goto L13
            if (r1 == r3) goto L13
            goto L8
        L13:
            if (r1 != r2) goto L70
            java.lang.String r1 = r7.getName()
            r2 = -1
            int r4 = r1.hashCode()
            r5 = 89650992(0x557f730, float:1.01546526E-35)
            if (r4 == r5) goto L33
            r5 = 1191572447(0x4705f3df, float:34291.87)
            if (r4 == r5) goto L29
            goto L3c
        L29:
            java.lang.String r4 = "selector"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L3c
            r2 = 0
            goto L3c
        L33:
            java.lang.String r4 = "gradient"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L3c
            r2 = r3
        L3c:
            if (r2 == 0) goto L67
            if (r2 != r3) goto L49
            android.graphics.Shader r6 = b.b.c.a.d.d.a(r6, r7, r0, r8)
            b.b.c.a.d.b r6 = a(r6)
            return r6
        L49:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r7 = r7.getPositionDescription()
            r8.append(r7)
            java.lang.String r7 = ": unsupported complex color tag "
            r8.append(r7)
            r8.append(r1)
            java.lang.String r7 = r8.toString()
            r6.<init>(r7)
            throw r6
        L67:
            android.content.res.ColorStateList r6 = b.b.c.a.d.a.a(r6, r7, r0, r8)
            b.b.c.a.d.b r6 = a(r6)
            return r6
        L70:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)
            throw r6
    }

    static b.b.c.a.d.b a(android.graphics.Shader r3) {
            b.b.c.a.d.b r0 = new b.b.c.a.d.b
            r1 = 0
            r2 = 0
            r0.<init>(r3, r1, r2)
            return r0
    }

    static b.b.c.a.d.b b(int r2) {
            b.b.c.a.d.b r0 = new b.b.c.a.d.b
            r1 = 0
            r0.<init>(r1, r1, r2)
            return r0
    }

    public static b.b.c.a.d.b b(android.content.res.Resources r0, int r1, android.content.res.Resources.Theme r2) {
            b.b.c.a.d.b r0 = a(r0, r1, r2)     // Catch: java.lang.Exception -> L5
            return r0
        L5:
            r0 = move-exception
            java.lang.String r1 = "ComplexColorCompat"
            java.lang.String r2 = "Failed to inflate ComplexColor."
            android.util.Log.e(r1, r2, r0)
            r0 = 0
            return r0
    }

    public int a() {
            r0 = this;
            int r0 = r0.f1010c
            return r0
    }

    public void a(int r1) {
            r0 = this;
            r0.f1010c = r1
            return
    }

    public boolean a(int[] r3) {
            r2 = this;
            boolean r0 = r2.d()
            if (r0 == 0) goto L18
            android.content.res.ColorStateList r0 = r2.f1009b
            int r1 = r0.getDefaultColor()
            int r3 = r0.getColorForState(r3, r1)
            int r0 = r2.f1010c
            if (r3 == r0) goto L18
            r0 = 1
            r2.f1010c = r3
            goto L19
        L18:
            r0 = 0
        L19:
            return r0
    }

    public android.graphics.Shader b() {
            r0 = this;
            android.graphics.Shader r0 = r0.f1008a
            return r0
    }

    public boolean c() {
            r0 = this;
            android.graphics.Shader r0 = r0.f1008a
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean d() {
            r1 = this;
            android.graphics.Shader r0 = r1.f1008a
            if (r0 != 0) goto L10
            android.content.res.ColorStateList r1 = r1.f1009b
            if (r1 == 0) goto L10
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
    }

    public boolean e() {
            r1 = this;
            boolean r0 = r1.c()
            if (r0 != 0) goto Ld
            int r1 = r1.f1010c
            if (r1 == 0) goto Lb
            goto Ld
        Lb:
            r1 = 0
            goto Le
        Ld:
            r1 = 1
        Le:
            return r1
    }
}
