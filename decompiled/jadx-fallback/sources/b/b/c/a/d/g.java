package b.b.c.a.d;

/* JADX INFO: loaded from: classes.dex */
public class g {
    public static float a(android.content.res.TypedArray r0, org.xmlpull.v1.XmlPullParser r1, java.lang.String r2, int r3, float r4) {
            boolean r1 = a(r1, r2)
            if (r1 != 0) goto L7
            return r4
        L7:
            float r0 = r0.getFloat(r3, r4)
            return r0
    }

    public static int a(android.content.res.TypedArray r0, org.xmlpull.v1.XmlPullParser r1, java.lang.String r2, int r3, int r4) {
            boolean r1 = a(r1, r2)
            if (r1 != 0) goto L7
            return r4
        L7:
            int r0 = r0.getColor(r3, r4)
            return r0
    }

    public static android.content.res.TypedArray a(android.content.res.Resources r0, android.content.res.Resources.Theme r1, android.util.AttributeSet r2, int[] r3) {
            if (r1 != 0) goto L7
            android.content.res.TypedArray r0 = r0.obtainAttributes(r2, r3)
            return r0
        L7:
            r0 = 0
            android.content.res.TypedArray r0 = r1.obtainStyledAttributes(r2, r3, r0, r0)
            return r0
    }

    public static b.b.c.a.d.b a(android.content.res.TypedArray r1, org.xmlpull.v1.XmlPullParser r2, android.content.res.Resources.Theme r3, java.lang.String r4, int r5, int r6) {
            boolean r2 = a(r2, r4)
            if (r2 == 0) goto L2f
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r1.getValue(r5, r2)
            int r4 = r2.type
            r0 = 28
            if (r4 < r0) goto L1f
            r0 = 31
            if (r4 > r0) goto L1f
            int r1 = r2.data
            b.b.c.a.d.b r1 = b.b.c.a.d.b.b(r1)
            return r1
        L1f:
            android.content.res.Resources r2 = r1.getResources()
            r4 = 0
            int r1 = r1.getResourceId(r5, r4)
            b.b.c.a.d.b r1 = b.b.c.a.d.b.b(r2, r1, r3)
            if (r1 == 0) goto L2f
            return r1
        L2f:
            b.b.c.a.d.b r1 = b.b.c.a.d.b.b(r6)
            return r1
    }

    public static java.lang.String a(android.content.res.TypedArray r0, org.xmlpull.v1.XmlPullParser r1, java.lang.String r2, int r3) {
            boolean r1 = a(r1, r2)
            if (r1 != 0) goto L8
            r0 = 0
            return r0
        L8:
            java.lang.String r0 = r0.getString(r3)
            return r0
    }

    public static boolean a(android.content.res.TypedArray r0, org.xmlpull.v1.XmlPullParser r1, java.lang.String r2, int r3, boolean r4) {
            boolean r1 = a(r1, r2)
            if (r1 != 0) goto L7
            return r4
        L7:
            boolean r0 = r0.getBoolean(r3, r4)
            return r0
    }

    public static boolean a(org.xmlpull.v1.XmlPullParser r1, java.lang.String r2) {
            java.lang.String r0 = "http://schemas.android.com/apk/res/android"
            java.lang.String r1 = r1.getAttributeValue(r0, r2)
            if (r1 == 0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    public static int b(android.content.res.TypedArray r0, org.xmlpull.v1.XmlPullParser r1, java.lang.String r2, int r3, int r4) {
            boolean r1 = a(r1, r2)
            if (r1 != 0) goto L7
            return r4
        L7:
            int r0 = r0.getInt(r3, r4)
            return r0
    }

    public static android.util.TypedValue b(android.content.res.TypedArray r0, org.xmlpull.v1.XmlPullParser r1, java.lang.String r2, int r3) {
            boolean r1 = a(r1, r2)
            if (r1 != 0) goto L8
            r0 = 0
            return r0
        L8:
            android.util.TypedValue r0 = r0.peekValue(r3)
            return r0
    }

    public static int c(android.content.res.TypedArray r0, org.xmlpull.v1.XmlPullParser r1, java.lang.String r2, int r3, int r4) {
            boolean r1 = a(r1, r2)
            if (r1 != 0) goto L7
            return r4
        L7:
            int r0 = r0.getResourceId(r3, r4)
            return r0
    }
}
