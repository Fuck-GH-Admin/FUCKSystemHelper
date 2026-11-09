package b.b.c.a.d;

/* JADX INFO: loaded from: classes.dex */
public class c {

    public interface a {
    }

    public static final class b implements b.b.c.a.d.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b.b.c.a.d.c.C0039c[] f1011a;

        public b(b.b.c.a.d.c.C0039c[] r1) {
                r0 = this;
                r0.<init>()
                r0.f1011a = r1
                return
        }

        public b.b.c.a.d.c.C0039c[] a() {
                r0 = this;
                b.b.c.a.d.c$c[] r0 = r0.f1011a
                return r0
        }
    }

    /* JADX INFO: renamed from: b.b.c.a.d.c$c, reason: collision with other inner class name */
    public static final class C0039c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.String f1012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f1013b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f1014c;
        private java.lang.String d;
        private int e;
        private int f;

        public C0039c(java.lang.String r1, int r2, boolean r3, java.lang.String r4, int r5, int r6) {
                r0 = this;
                r0.<init>()
                r0.f1012a = r1
                r0.f1013b = r2
                r0.f1014c = r3
                r0.d = r4
                r0.e = r5
                r0.f = r6
                return
        }

        public java.lang.String a() {
                r0 = this;
                java.lang.String r0 = r0.f1012a
                return r0
        }

        public int b() {
                r0 = this;
                int r0 = r0.f
                return r0
        }

        public int c() {
                r0 = this;
                int r0 = r0.e
                return r0
        }

        public java.lang.String d() {
                r0 = this;
                java.lang.String r0 = r0.d
                return r0
        }

        public int e() {
                r0 = this;
                int r0 = r0.f1013b
                return r0
        }

        public boolean f() {
                r0 = this;
                boolean r0 = r0.f1014c
                return r0
        }
    }

    public static final class d implements b.b.c.a.d.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b.b.c.d.a f1015a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f1016b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f1017c;

        public d(b.b.c.d.a r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.f1015a = r1
                r0.f1017c = r2
                r0.f1016b = r3
                return
        }

        public int a() {
                r0 = this;
                int r0 = r0.f1017c
                return r0
        }

        public b.b.c.d.a b() {
                r0 = this;
                b.b.c.d.a r0 = r0.f1015a
                return r0
        }

        public int c() {
                r0 = this;
                int r0 = r0.f1016b
                return r0
        }
    }

    private static int a(android.content.res.TypedArray r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto Lb
            int r2 = r2.getType(r3)
            return r2
        Lb:
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r2.getValue(r3, r0)
            int r2 = r0.type
            return r2
    }

    public static b.b.c.a.d.c.a a(org.xmlpull.v1.XmlPullParser r3, android.content.res.Resources r4) {
        L0:
            int r0 = r3.next()
            r1 = 2
            if (r0 == r1) goto Lb
            r2 = 1
            if (r0 == r2) goto Lb
            goto L0
        Lb:
            if (r0 != r1) goto L12
            b.b.c.a.d.c$a r3 = b(r3, r4)
            return r3
        L12:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r4 = "No start tag found"
            r3.<init>(r4)
            throw r3
    }

    public static java.util.List<java.util.List<byte[]>> a(android.content.res.Resources r5, int r6) {
            if (r6 != 0) goto L7
            java.util.List r5 = java.util.Collections.emptyList()
            return r5
        L7:
            android.content.res.TypedArray r0 = r5.obtainTypedArray(r6)
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L50
            if (r1 != 0) goto L19
            java.util.List r5 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L50
            r0.recycle()
            return r5
        L19:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L50
            r1.<init>()     // Catch: java.lang.Throwable -> L50
            r2 = 0
            int r3 = a(r0, r2)     // Catch: java.lang.Throwable -> L50
            r4 = 1
            if (r3 != r4) goto L41
            r6 = r2
        L27:
            int r3 = r0.length()     // Catch: java.lang.Throwable -> L50
            if (r6 >= r3) goto L4c
            int r3 = r0.getResourceId(r6, r2)     // Catch: java.lang.Throwable -> L50
            if (r3 == 0) goto L3e
            java.lang.String[] r3 = r5.getStringArray(r3)     // Catch: java.lang.Throwable -> L50
            java.util.List r3 = a(r3)     // Catch: java.lang.Throwable -> L50
            r1.add(r3)     // Catch: java.lang.Throwable -> L50
        L3e:
            int r6 = r6 + 1
            goto L27
        L41:
            java.lang.String[] r5 = r5.getStringArray(r6)     // Catch: java.lang.Throwable -> L50
            java.util.List r5 = a(r5)     // Catch: java.lang.Throwable -> L50
            r1.add(r5)     // Catch: java.lang.Throwable -> L50
        L4c:
            r0.recycle()
            return r1
        L50:
            r5 = move-exception
            r0.recycle()
            throw r5
    }

    private static java.util.List<byte[]> a(java.lang.String[] r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r5.length
            r2 = 0
            r3 = r2
        L8:
            if (r3 >= r1) goto L16
            r4 = r5[r3]
            byte[] r4 = android.util.Base64.decode(r4, r2)
            r0.add(r4)
            int r3 = r3 + 1
            goto L8
        L16:
            return r0
    }

    private static void a(org.xmlpull.v1.XmlPullParser r3) {
            r0 = 1
        L1:
            if (r0 <= 0) goto L14
            int r1 = r3.next()
            r2 = 2
            if (r1 == r2) goto L11
            r2 = 3
            if (r1 == r2) goto Le
            goto L1
        Le:
            int r0 = r0 + (-1)
            goto L1
        L11:
            int r0 = r0 + 1
            goto L1
        L14:
            return
    }

    private static b.b.c.a.d.c.a b(org.xmlpull.v1.XmlPullParser r3, android.content.res.Resources r4) {
            java.lang.String r0 = "font-family"
            r1 = 0
            r2 = 2
            r3.require(r2, r1, r0)
            java.lang.String r2 = r3.getName()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L16
            b.b.c.a.d.c$a r3 = c(r3, r4)
            return r3
        L16:
            a(r3)
            return r1
    }

    private static b.b.c.a.d.c.a c(org.xmlpull.v1.XmlPullParser r8, android.content.res.Resources r9) {
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r8)
            int[] r1 = b.b.a.c.FontFamily
            android.content.res.TypedArray r0 = r9.obtainAttributes(r0, r1)
            int r1 = b.b.a.c.FontFamily_fontProviderAuthority
            java.lang.String r1 = r0.getString(r1)
            int r2 = b.b.a.c.FontFamily_fontProviderPackage
            java.lang.String r2 = r0.getString(r2)
            int r3 = b.b.a.c.FontFamily_fontProviderQuery
            java.lang.String r3 = r0.getString(r3)
            int r4 = b.b.a.c.FontFamily_fontProviderCerts
            r5 = 0
            int r4 = r0.getResourceId(r4, r5)
            int r5 = b.b.a.c.FontFamily_fontProviderFetchStrategy
            r6 = 1
            int r5 = r0.getInteger(r5, r6)
            int r6 = b.b.a.c.FontFamily_fontProviderFetchTimeout
            r7 = 500(0x1f4, float:7.0E-43)
            int r6 = r0.getInteger(r6, r7)
            r0.recycle()
            r0 = 3
            if (r1 == 0) goto L55
            if (r2 == 0) goto L55
            if (r3 == 0) goto L55
        L3c:
            int r7 = r8.next()
            if (r7 == r0) goto L46
            a(r8)
            goto L3c
        L46:
            java.util.List r8 = a(r9, r4)
            b.b.c.a.d.c$d r9 = new b.b.c.a.d.c$d
            b.b.c.d.a r0 = new b.b.c.d.a
            r0.<init>(r1, r2, r3, r8)
            r9.<init>(r0, r5, r6)
            return r9
        L55:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L5a:
            int r2 = r8.next()
            if (r2 == r0) goto L80
            int r2 = r8.getEventType()
            r3 = 2
            if (r2 == r3) goto L68
            goto L5a
        L68:
            java.lang.String r2 = r8.getName()
            java.lang.String r3 = "font"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L7c
            b.b.c.a.d.c$c r2 = d(r8, r9)
            r1.add(r2)
            goto L5a
        L7c:
            a(r8)
            goto L5a
        L80:
            boolean r8 = r1.isEmpty()
            if (r8 == 0) goto L88
            r8 = 0
            return r8
        L88:
            b.b.c.a.d.c$b r8 = new b.b.c.a.d.c$b
            int r9 = r1.size()
            b.b.c.a.d.c$c[] r9 = new b.b.c.a.d.c.C0039c[r9]
            java.lang.Object[] r9 = r1.toArray(r9)
            b.b.c.a.d.c$c[] r9 = (b.b.c.a.d.c.C0039c[]) r9
            r8.<init>(r9)
            return r8
    }

    private static b.b.c.a.d.c.C0039c d(org.xmlpull.v1.XmlPullParser r9, android.content.res.Resources r10) {
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r9)
            int[] r1 = b.b.a.c.FontFamilyFont
            android.content.res.TypedArray r10 = r10.obtainAttributes(r0, r1)
            int r0 = b.b.a.c.FontFamilyFont_fontWeight
            boolean r0 = r10.hasValue(r0)
            if (r0 == 0) goto L15
            int r0 = b.b.a.c.FontFamilyFont_fontWeight
            goto L17
        L15:
            int r0 = b.b.a.c.FontFamilyFont_android_fontWeight
        L17:
            r1 = 400(0x190, float:5.6E-43)
            int r4 = r10.getInt(r0, r1)
            int r0 = b.b.a.c.FontFamilyFont_fontStyle
            boolean r0 = r10.hasValue(r0)
            if (r0 == 0) goto L28
            int r0 = b.b.a.c.FontFamilyFont_fontStyle
            goto L2a
        L28:
            int r0 = b.b.a.c.FontFamilyFont_android_fontStyle
        L2a:
            r1 = 0
            int r0 = r10.getInt(r0, r1)
            r2 = 1
            if (r2 != r0) goto L34
            r5 = r2
            goto L35
        L34:
            r5 = r1
        L35:
            int r0 = b.b.a.c.FontFamilyFont_ttcIndex
            boolean r0 = r10.hasValue(r0)
            if (r0 == 0) goto L40
            int r0 = b.b.a.c.FontFamilyFont_ttcIndex
            goto L42
        L40:
            int r0 = b.b.a.c.FontFamilyFont_android_ttcIndex
        L42:
            int r2 = b.b.a.c.FontFamilyFont_fontVariationSettings
            boolean r2 = r10.hasValue(r2)
            if (r2 == 0) goto L4d
            int r2 = b.b.a.c.FontFamilyFont_fontVariationSettings
            goto L4f
        L4d:
            int r2 = b.b.a.c.FontFamilyFont_android_fontVariationSettings
        L4f:
            java.lang.String r6 = r10.getString(r2)
            int r7 = r10.getInt(r0, r1)
            int r0 = b.b.a.c.FontFamilyFont_font
            boolean r0 = r10.hasValue(r0)
            if (r0 == 0) goto L62
            int r0 = b.b.a.c.FontFamilyFont_font
            goto L64
        L62:
            int r0 = b.b.a.c.FontFamilyFont_android_font
        L64:
            int r8 = r10.getResourceId(r0, r1)
            java.lang.String r3 = r10.getString(r0)
            r10.recycle()
        L6f:
            int r10 = r9.next()
            r0 = 3
            if (r10 == r0) goto L7a
            a(r9)
            goto L6f
        L7a:
            b.b.c.a.d.c$c r9 = new b.b.c.a.d.c$c
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r9
    }
}
