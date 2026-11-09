package android.support.constraint;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.util.SparseArray<android.support.constraint.d.a> f423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.util.SparseArray<android.support.constraint.e> f424b;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        java.util.ArrayList<android.support.constraint.d.b> f426b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f427c;
        android.support.constraint.e d;

        public a(android.content.Context r6, org.xmlpull.v1.XmlPullParser r7) {
                r5 = this;
                r5.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r5.f426b = r0
                r0 = -1
                r5.f427c = r0
                android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r7)
                int[] r0 = android.support.constraint.k.State
                android.content.res.TypedArray r7 = r6.obtainStyledAttributes(r7, r0)
                int r0 = r7.getIndexCount()
                r1 = 0
            L1c:
                if (r1 >= r0) goto L65
                int r2 = r7.getIndex(r1)
                int r3 = android.support.constraint.k.State_android_id
                if (r2 != r3) goto L2f
                int r3 = r5.f425a
                int r2 = r7.getResourceId(r2, r3)
                r5.f425a = r2
                goto L62
            L2f:
                int r3 = android.support.constraint.k.State_constraints
                if (r2 != r3) goto L62
                int r3 = r5.f427c
                int r2 = r7.getResourceId(r2, r3)
                r5.f427c = r2
                android.content.res.Resources r2 = r6.getResources()
                int r3 = r5.f427c
                java.lang.String r2 = r2.getResourceTypeName(r3)
                android.content.res.Resources r3 = r6.getResources()
                int r4 = r5.f427c
                r3.getResourceName(r4)
                java.lang.String r3 = "layout"
                boolean r2 = r3.equals(r2)
                if (r2 == 0) goto L62
                android.support.constraint.e r2 = new android.support.constraint.e
                r2.<init>()
                r5.d = r2
                int r3 = r5.f427c
                r2.a(r6, r3)
            L62:
                int r1 = r1 + 1
                goto L1c
            L65:
                r7.recycle()
                return
        }

        void a(android.support.constraint.d.b r1) {
                r0 = this;
                java.util.ArrayList<android.support.constraint.d$b> r0 = r0.f426b
                r0.add(r1)
                return
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f428a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f429b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f430c;
        float d;
        int e;
        android.support.constraint.e f;

        public b(android.content.Context r6, org.xmlpull.v1.XmlPullParser r7) {
                r5 = this;
                r5.<init>()
                r0 = 2143289344(0x7fc00000, float:NaN)
                r5.f428a = r0
                r5.f429b = r0
                r5.f430c = r0
                r5.d = r0
                r0 = -1
                r5.e = r0
                android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r7)
                int[] r0 = android.support.constraint.k.Variant
                android.content.res.TypedArray r7 = r6.obtainStyledAttributes(r7, r0)
                int r0 = r7.getIndexCount()
                r1 = 0
            L1f:
                if (r1 >= r0) goto L97
                int r2 = r7.getIndex(r1)
                int r3 = android.support.constraint.k.Variant_constraints
                if (r2 != r3) goto L59
                int r3 = r5.e
                int r2 = r7.getResourceId(r2, r3)
                r5.e = r2
                android.content.res.Resources r2 = r6.getResources()
                int r3 = r5.e
                java.lang.String r2 = r2.getResourceTypeName(r3)
                android.content.res.Resources r3 = r6.getResources()
                int r4 = r5.e
                r3.getResourceName(r4)
                java.lang.String r3 = "layout"
                boolean r2 = r3.equals(r2)
                if (r2 == 0) goto L94
                android.support.constraint.e r2 = new android.support.constraint.e
                r2.<init>()
                r5.f = r2
                int r3 = r5.e
                r2.a(r6, r3)
                goto L94
            L59:
                int r3 = android.support.constraint.k.Variant_region_heightLessThan
                if (r2 != r3) goto L66
                float r3 = r5.d
                float r2 = r7.getDimension(r2, r3)
                r5.d = r2
                goto L94
            L66:
                int r3 = android.support.constraint.k.Variant_region_heightMoreThan
                if (r2 != r3) goto L73
                float r3 = r5.f429b
                float r2 = r7.getDimension(r2, r3)
                r5.f429b = r2
                goto L94
            L73:
                int r3 = android.support.constraint.k.Variant_region_widthLessThan
                if (r2 != r3) goto L80
                float r3 = r5.f430c
                float r2 = r7.getDimension(r2, r3)
                r5.f430c = r2
                goto L94
            L80:
                int r3 = android.support.constraint.k.Variant_region_widthMoreThan
                if (r2 != r3) goto L8d
                float r3 = r5.f428a
                float r2 = r7.getDimension(r2, r3)
                r5.f428a = r2
                goto L94
            L8d:
                java.lang.String r2 = "ConstraintLayoutStates"
                java.lang.String r3 = "Unknown tag"
                android.util.Log.v(r2, r3)
            L94:
                int r1 = r1 + 1
                goto L1f
            L97:
                r7.recycle()
                return
        }
    }

    d(android.content.Context r1, android.support.constraint.ConstraintLayout r2, int r3) {
            r0 = this;
            r0.<init>()
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.f423a = r2
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.f424b = r2
            r0.a(r1, r3)
            return
    }

    private void a(android.content.Context r9, int r10) {
            r8 = this;
            android.content.res.Resources r0 = r9.getResources()
            android.content.res.XmlResourceParser r10 = r0.getXml(r10)
            r0 = 0
            int r1 = r10.getEventType()     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La2
        Ld:
            r2 = 1
            if (r1 == r2) goto La6
            if (r1 == 0) goto L94
            r3 = 2
            if (r1 == r3) goto L17
            goto L97
        L17:
            java.lang.String r1 = r10.getName()     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La2
            r4 = -1
            int r5 = r1.hashCode()     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La2
            r6 = 4
            r7 = 3
            switch(r5) {
                case -1349929691: goto L4e;
                case 80204913: goto L44;
                case 1382829617: goto L3a;
                case 1657696882: goto L30;
                case 1901439077: goto L26;
                default: goto L25;
            }     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La2
        L25:
            goto L57
        L26:
            java.lang.String r5 = "Variant"
            boolean r5 = r1.equals(r5)     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La2
            if (r5 == 0) goto L57
            r4 = r7
            goto L57
        L30:
            java.lang.String r5 = "layoutDescription"
            boolean r5 = r1.equals(r5)     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La2
            if (r5 == 0) goto L57
            r4 = 0
            goto L57
        L3a:
            java.lang.String r5 = "StateSet"
            boolean r5 = r1.equals(r5)     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La2
            if (r5 == 0) goto L57
            r4 = r2
            goto L57
        L44:
            java.lang.String r5 = "State"
            boolean r5 = r1.equals(r5)     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La2
            if (r5 == 0) goto L57
            r4 = r3
            goto L57
        L4e:
            java.lang.String r5 = "ConstraintSet"
            boolean r5 = r1.equals(r5)     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La2
            if (r5 == 0) goto L57
            r4 = r6
        L57:
            if (r4 == 0) goto L97
            if (r4 == r2) goto L97
            if (r4 == r3) goto L87
            if (r4 == r7) goto L7c
            if (r4 == r6) goto L78
            java.lang.String r2 = "ConstraintLayoutStates"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La2
            r3.<init>()     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La2
            java.lang.String r4 = "unknown tag "
            r3.append(r4)     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La2
            r3.append(r1)     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La2
            java.lang.String r1 = r3.toString()     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La2
            android.util.Log.v(r2, r1)     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La2
            goto L97
        L78:
            r8.a(r9, r10)     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La2
            goto L97
        L7c:
            android.support.constraint.d$b r1 = new android.support.constraint.d$b     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La2
            r1.<init>(r9, r10)     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La2
            if (r0 == 0) goto L97
            r0.a(r1)     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La2
            goto L97
        L87:
            android.support.constraint.d$a r0 = new android.support.constraint.d$a     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La2
            r0.<init>(r9, r10)     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La2
            android.util.SparseArray<android.support.constraint.d$a> r1 = r8.f423a     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La2
            int r2 = r0.f425a     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La2
            r1.put(r2, r0)     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La2
            goto L97
        L94:
            r10.getName()     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La2
        L97:
            int r1 = r10.next()     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La2
            goto Ld
        L9d:
            r8 = move-exception
            r8.printStackTrace()
            goto La6
        La2:
            r8 = move-exception
            r8.printStackTrace()
        La6:
            return
    }

    private void a(android.content.Context r9, org.xmlpull.v1.XmlPullParser r10) {
            r8 = this;
            android.support.constraint.e r0 = new android.support.constraint.e
            r0.<init>()
            int r1 = r10.getAttributeCount()
            r2 = 0
        La:
            if (r2 >= r1) goto L65
            java.lang.String r3 = r10.getAttributeName(r2)
            java.lang.String r4 = "id"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L62
            java.lang.String r1 = r10.getAttributeValue(r2)
            java.lang.String r2 = "/"
            boolean r2 = r1.contains(r2)
            r3 = -1
            r5 = 1
            if (r2 == 0) goto L3e
            r2 = 47
            int r2 = r1.indexOf(r2)
            int r2 = r2 + r5
            java.lang.String r2 = r1.substring(r2)
            android.content.res.Resources r6 = r9.getResources()
            java.lang.String r7 = r9.getPackageName()
            int r2 = r6.getIdentifier(r2, r4, r7)
            goto L3f
        L3e:
            r2 = r3
        L3f:
            if (r2 != r3) goto L59
            if (r1 == 0) goto L52
            int r3 = r1.length()
            if (r3 <= r5) goto L52
            java.lang.String r1 = r1.substring(r5)
            int r2 = java.lang.Integer.parseInt(r1)
            goto L59
        L52:
            java.lang.String r1 = "ConstraintLayoutStates"
            java.lang.String r3 = "error in parsing id"
            android.util.Log.e(r1, r3)
        L59:
            r0.a(r9, r10)
            android.util.SparseArray<android.support.constraint.e> r8 = r8.f424b
            r8.put(r2, r0)
            goto L65
        L62:
            int r2 = r2 + 1
            goto La
        L65:
            return
    }

    public void a(android.support.constraint.g r1) {
            r0 = this;
            return
    }
}
