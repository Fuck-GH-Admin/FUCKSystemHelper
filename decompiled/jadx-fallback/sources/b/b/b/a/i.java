package b.b.b.a;

/* JADX INFO: loaded from: classes.dex */
public class i extends b.b.b.a.h {
    static final android.graphics.PorterDuff.Mode k = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b.b.b.a.i.h f992c;
    private android.graphics.PorterDuffColorFilter d;
    private android.graphics.ColorFilter e;
    private boolean f;
    private boolean g;
    private final float[] h;
    private final android.graphics.Matrix i;
    private final android.graphics.Rect j;

    static /* synthetic */ class a {
    }

    private static class b extends b.b.b.a.i.f {
        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        public b(b.b.b.a.i.b r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private void a(android.content.res.TypedArray r2) {
                r1 = this;
                r0 = 0
                java.lang.String r0 = r2.getString(r0)
                if (r0 == 0) goto L9
                r1.f997b = r0
            L9:
                r0 = 1
                java.lang.String r2 = r2.getString(r0)
                if (r2 == 0) goto L16
                b.b.c.b.b$b[] r2 = b.b.c.b.b.a(r2)
                r1.f996a = r2
            L16:
                return
        }

        public void a(android.content.res.Resources r2, android.util.AttributeSet r3, android.content.res.Resources.Theme r4, org.xmlpull.v1.XmlPullParser r5) {
                r1 = this;
                java.lang.String r0 = "pathData"
                boolean r5 = b.b.c.a.d.g.a(r5, r0)
                if (r5 != 0) goto L9
                return
            L9:
                int[] r5 = b.b.b.a.a.d
                android.content.res.TypedArray r2 = b.b.c.a.d.g.a(r2, r4, r3, r5)
                r1.a(r2)
                r2.recycle()
                return
        }

        @Override // b.b.b.a.i.f
        public boolean b() {
                r0 = this;
                r0 = 1
                return r0
        }
    }

    private static class c extends b.b.b.a.i.f {
        private int[] d;
        b.b.c.a.d.b e;
        float f;
        b.b.c.a.d.b g;
        float h;
        int i;
        float j;
        float k;
        float l;
        float m;
        android.graphics.Paint.Cap n;
        android.graphics.Paint.Join o;
        float p;

        public c() {
                r3 = this;
                r3.<init>()
                r0 = 0
                r3.f = r0
                r1 = 1065353216(0x3f800000, float:1.0)
                r3.h = r1
                r2 = 0
                r3.i = r2
                r3.j = r1
                r3.k = r0
                r3.l = r1
                r3.m = r0
                android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.BUTT
                r3.n = r0
                android.graphics.Paint$Join r0 = android.graphics.Paint.Join.MITER
                r3.o = r0
                r0 = 1082130432(0x40800000, float:4.0)
                r3.p = r0
                return
        }

        public c(b.b.b.a.i.c r4) {
                r3 = this;
                r3.<init>(r4)
                r0 = 0
                r3.f = r0
                r1 = 1065353216(0x3f800000, float:1.0)
                r3.h = r1
                r2 = 0
                r3.i = r2
                r3.j = r1
                r3.k = r0
                r3.l = r1
                r3.m = r0
                android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.BUTT
                r3.n = r0
                android.graphics.Paint$Join r0 = android.graphics.Paint.Join.MITER
                r3.o = r0
                r0 = 1082130432(0x40800000, float:4.0)
                r3.p = r0
                int[] r0 = r4.d
                r3.d = r0
                b.b.c.a.d.b r0 = r4.e
                r3.e = r0
                float r0 = r4.f
                r3.f = r0
                float r0 = r4.h
                r3.h = r0
                b.b.c.a.d.b r0 = r4.g
                r3.g = r0
                int r0 = r4.i
                r3.i = r0
                float r0 = r4.j
                r3.j = r0
                float r0 = r4.k
                r3.k = r0
                float r0 = r4.l
                r3.l = r0
                float r0 = r4.m
                r3.m = r0
                android.graphics.Paint$Cap r0 = r4.n
                r3.n = r0
                android.graphics.Paint$Join r0 = r4.o
                r3.o = r0
                float r4 = r4.p
                r3.p = r4
                return
        }

        private android.graphics.Paint.Cap a(int r1, android.graphics.Paint.Cap r2) {
                r0 = this;
                if (r1 == 0) goto Lf
                r0 = 1
                if (r1 == r0) goto Lc
                r0 = 2
                if (r1 == r0) goto L9
                return r2
            L9:
                android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.SQUARE
                return r0
            Lc:
                android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
                return r0
            Lf:
                android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.BUTT
                return r0
        }

        private android.graphics.Paint.Join a(int r1, android.graphics.Paint.Join r2) {
                r0 = this;
                if (r1 == 0) goto Lf
                r0 = 1
                if (r1 == r0) goto Lc
                r0 = 2
                if (r1 == r0) goto L9
                return r2
            L9:
                android.graphics.Paint$Join r0 = android.graphics.Paint.Join.BEVEL
                return r0
            Lc:
                android.graphics.Paint$Join r0 = android.graphics.Paint.Join.ROUND
                return r0
            Lf:
                android.graphics.Paint$Join r0 = android.graphics.Paint.Join.MITER
                return r0
        }

        private void a(android.content.res.TypedArray r8, org.xmlpull.v1.XmlPullParser r9, android.content.res.Resources.Theme r10) {
                r7 = this;
                r0 = 0
                r7.d = r0
                java.lang.String r0 = "pathData"
                boolean r0 = b.b.c.a.d.g.a(r9, r0)
                if (r0 != 0) goto Lc
                return
            Lc:
                r0 = 0
                java.lang.String r0 = r8.getString(r0)
                if (r0 == 0) goto L15
                r7.f997b = r0
            L15:
                r0 = 2
                java.lang.String r0 = r8.getString(r0)
                if (r0 == 0) goto L22
                b.b.c.b.b$b[] r0 = b.b.c.b.b.a(r0)
                r7.f996a = r0
            L22:
                r5 = 1
                r6 = 0
                java.lang.String r4 = "fillColor"
                r1 = r8
                r2 = r9
                r3 = r10
                b.b.c.a.d.b r0 = b.b.c.a.d.g.a(r1, r2, r3, r4, r5, r6)
                r7.g = r0
                r0 = 12
                float r1 = r7.j
                java.lang.String r2 = "fillAlpha"
                float r0 = b.b.c.a.d.g.a(r8, r9, r2, r0, r1)
                r7.j = r0
                r0 = 8
                r1 = -1
                java.lang.String r2 = "strokeLineCap"
                int r0 = b.b.c.a.d.g.b(r8, r9, r2, r0, r1)
                android.graphics.Paint$Cap r2 = r7.n
                android.graphics.Paint$Cap r0 = r7.a(r0, r2)
                r7.n = r0
                r0 = 9
                java.lang.String r2 = "strokeLineJoin"
                int r0 = b.b.c.a.d.g.b(r8, r9, r2, r0, r1)
                android.graphics.Paint$Join r1 = r7.o
                android.graphics.Paint$Join r0 = r7.a(r0, r1)
                r7.o = r0
                r0 = 10
                float r1 = r7.p
                java.lang.String r2 = "strokeMiterLimit"
                float r0 = b.b.c.a.d.g.a(r8, r9, r2, r0, r1)
                r7.p = r0
                r5 = 3
                java.lang.String r4 = "strokeColor"
                r1 = r8
                r2 = r9
                b.b.c.a.d.b r10 = b.b.c.a.d.g.a(r1, r2, r3, r4, r5, r6)
                r7.e = r10
                r10 = 11
                float r0 = r7.h
                java.lang.String r1 = "strokeAlpha"
                float r10 = b.b.c.a.d.g.a(r8, r9, r1, r10, r0)
                r7.h = r10
                r10 = 4
                float r0 = r7.f
                java.lang.String r1 = "strokeWidth"
                float r10 = b.b.c.a.d.g.a(r8, r9, r1, r10, r0)
                r7.f = r10
                r10 = 6
                float r0 = r7.l
                java.lang.String r1 = "trimPathEnd"
                float r10 = b.b.c.a.d.g.a(r8, r9, r1, r10, r0)
                r7.l = r10
                r10 = 7
                float r0 = r7.m
                java.lang.String r1 = "trimPathOffset"
                float r10 = b.b.c.a.d.g.a(r8, r9, r1, r10, r0)
                r7.m = r10
                r10 = 5
                float r0 = r7.k
                java.lang.String r1 = "trimPathStart"
                float r10 = b.b.c.a.d.g.a(r8, r9, r1, r10, r0)
                r7.k = r10
                r10 = 13
                int r0 = r7.i
                java.lang.String r1 = "fillType"
                int r8 = b.b.c.a.d.g.b(r8, r9, r1, r10, r0)
                r7.i = r8
                return
        }

        public void a(android.content.res.Resources r2, android.util.AttributeSet r3, android.content.res.Resources.Theme r4, org.xmlpull.v1.XmlPullParser r5) {
                r1 = this;
                int[] r0 = b.b.b.a.a.f980c
                android.content.res.TypedArray r2 = b.b.c.a.d.g.a(r2, r4, r3, r0)
                r1.a(r2, r5, r4)
                r2.recycle()
                return
        }

        @Override // b.b.b.a.i.e
        public boolean a() {
                r1 = this;
                b.b.c.a.d.b r0 = r1.g
                boolean r0 = r0.d()
                if (r0 != 0) goto L13
                b.b.c.a.d.b r1 = r1.e
                boolean r1 = r1.d()
                if (r1 == 0) goto L11
                goto L13
            L11:
                r1 = 0
                goto L14
            L13:
                r1 = 1
            L14:
                return r1
        }

        @Override // b.b.b.a.i.e
        public boolean a(int[] r2) {
                r1 = this;
                b.b.c.a.d.b r0 = r1.g
                boolean r0 = r0.a(r2)
                b.b.c.a.d.b r1 = r1.e
                boolean r1 = r1.a(r2)
                r1 = r1 | r0
                return r1
        }

        float getFillAlpha() {
                r0 = this;
                float r0 = r0.j
                return r0
        }

        int getFillColor() {
                r0 = this;
                b.b.c.a.d.b r0 = r0.g
                int r0 = r0.a()
                return r0
        }

        float getStrokeAlpha() {
                r0 = this;
                float r0 = r0.h
                return r0
        }

        int getStrokeColor() {
                r0 = this;
                b.b.c.a.d.b r0 = r0.e
                int r0 = r0.a()
                return r0
        }

        float getStrokeWidth() {
                r0 = this;
                float r0 = r0.f
                return r0
        }

        float getTrimPathEnd() {
                r0 = this;
                float r0 = r0.l
                return r0
        }

        float getTrimPathOffset() {
                r0 = this;
                float r0 = r0.m
                return r0
        }

        float getTrimPathStart() {
                r0 = this;
                float r0 = r0.k
                return r0
        }

        void setFillAlpha(float r1) {
                r0 = this;
                r0.j = r1
                return
        }

        void setFillColor(int r1) {
                r0 = this;
                b.b.c.a.d.b r0 = r0.g
                r0.a(r1)
                return
        }

        void setStrokeAlpha(float r1) {
                r0 = this;
                r0.h = r1
                return
        }

        void setStrokeColor(int r1) {
                r0 = this;
                b.b.c.a.d.b r0 = r0.e
                r0.a(r1)
                return
        }

        void setStrokeWidth(float r1) {
                r0 = this;
                r0.f = r1
                return
        }

        void setTrimPathEnd(float r1) {
                r0 = this;
                r0.l = r1
                return
        }

        void setTrimPathOffset(float r1) {
                r0 = this;
                r0.m = r1
                return
        }

        void setTrimPathStart(float r1) {
                r0 = this;
                r0.k = r1
                return
        }
    }

    private static class d extends b.b.b.a.i.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final android.graphics.Matrix f993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final java.util.ArrayList<b.b.b.a.i.e> f994b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f995c;
        private float d;
        private float e;
        private float f;
        private float g;
        private float h;
        private float i;
        final android.graphics.Matrix j;
        int k;
        private int[] l;
        private java.lang.String m;

        public d() {
                r3 = this;
                r0 = 0
                r3.<init>(r0)
                android.graphics.Matrix r1 = new android.graphics.Matrix
                r1.<init>()
                r3.f993a = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r3.f994b = r1
                r1 = 0
                r3.f995c = r1
                r3.d = r1
                r3.e = r1
                r2 = 1065353216(0x3f800000, float:1.0)
                r3.f = r2
                r3.g = r2
                r3.h = r1
                r3.i = r1
                android.graphics.Matrix r1 = new android.graphics.Matrix
                r1.<init>()
                r3.j = r1
                r3.m = r0
                return
        }

        public d(b.b.b.a.i.d r5, b.b.c.f.a<java.lang.String, java.lang.Object> r6) {
                r4 = this;
                r0 = 0
                r4.<init>(r0)
                android.graphics.Matrix r1 = new android.graphics.Matrix
                r1.<init>()
                r4.f993a = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r4.f994b = r1
                r1 = 0
                r4.f995c = r1
                r4.d = r1
                r4.e = r1
                r2 = 1065353216(0x3f800000, float:1.0)
                r4.f = r2
                r4.g = r2
                r4.h = r1
                r4.i = r1
                android.graphics.Matrix r1 = new android.graphics.Matrix
                r1.<init>()
                r4.j = r1
                r4.m = r0
                float r0 = r5.f995c
                r4.f995c = r0
                float r0 = r5.d
                r4.d = r0
                float r0 = r5.e
                r4.e = r0
                float r0 = r5.f
                r4.f = r0
                float r0 = r5.g
                r4.g = r0
                float r0 = r5.h
                r4.h = r0
                float r0 = r5.i
                r4.i = r0
                int[] r0 = r5.l
                r4.l = r0
                java.lang.String r0 = r5.m
                r4.m = r0
                int r1 = r5.k
                r4.k = r1
                if (r0 == 0) goto L59
                r6.put(r0, r4)
            L59:
                android.graphics.Matrix r0 = r4.j
                android.graphics.Matrix r1 = r5.j
                r0.set(r1)
                java.util.ArrayList<b.b.b.a.i$e> r5 = r5.f994b
                r0 = 0
            L63:
                int r1 = r5.size()
                if (r0 >= r1) goto Lac
                java.lang.Object r1 = r5.get(r0)
                boolean r2 = r1 instanceof b.b.b.a.i.d
                if (r2 == 0) goto L7e
                b.b.b.a.i$d r1 = (b.b.b.a.i.d) r1
                java.util.ArrayList<b.b.b.a.i$e> r2 = r4.f994b
                b.b.b.a.i$d r3 = new b.b.b.a.i$d
                r3.<init>(r1, r6)
                r2.add(r3)
                goto La1
            L7e:
                boolean r2 = r1 instanceof b.b.b.a.i.c
                if (r2 == 0) goto L8a
                b.b.b.a.i$c r2 = new b.b.b.a.i$c
                b.b.b.a.i$c r1 = (b.b.b.a.i.c) r1
                r2.<init>(r1)
                goto L95
            L8a:
                boolean r2 = r1 instanceof b.b.b.a.i.b
                if (r2 == 0) goto La4
                b.b.b.a.i$b r2 = new b.b.b.a.i$b
                b.b.b.a.i$b r1 = (b.b.b.a.i.b) r1
                r2.<init>(r1)
            L95:
                java.util.ArrayList<b.b.b.a.i$e> r1 = r4.f994b
                r1.add(r2)
                java.lang.String r1 = r2.f997b
                if (r1 == 0) goto La1
                r6.put(r1, r2)
            La1:
                int r0 = r0 + 1
                goto L63
            La4:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "Unknown object in the tree!"
                r4.<init>(r5)
                throw r4
            Lac:
                return
        }

        private void a(android.content.res.TypedArray r4, org.xmlpull.v1.XmlPullParser r5) {
                r3 = this;
                r0 = 0
                r3.l = r0
                float r0 = r3.f995c
                java.lang.String r1 = "rotation"
                r2 = 5
                float r0 = b.b.c.a.d.g.a(r4, r5, r1, r2, r0)
                r3.f995c = r0
                float r0 = r3.d
                r1 = 1
                float r0 = r4.getFloat(r1, r0)
                r3.d = r0
                float r0 = r3.e
                r1 = 2
                float r0 = r4.getFloat(r1, r0)
                r3.e = r0
                float r0 = r3.f
                java.lang.String r1 = "scaleX"
                r2 = 3
                float r0 = b.b.c.a.d.g.a(r4, r5, r1, r2, r0)
                r3.f = r0
                float r0 = r3.g
                java.lang.String r1 = "scaleY"
                r2 = 4
                float r0 = b.b.c.a.d.g.a(r4, r5, r1, r2, r0)
                r3.g = r0
                float r0 = r3.h
                java.lang.String r1 = "translateX"
                r2 = 6
                float r0 = b.b.c.a.d.g.a(r4, r5, r1, r2, r0)
                r3.h = r0
                float r0 = r3.i
                java.lang.String r1 = "translateY"
                r2 = 7
                float r5 = b.b.c.a.d.g.a(r4, r5, r1, r2, r0)
                r3.i = r5
                r5 = 0
                java.lang.String r4 = r4.getString(r5)
                if (r4 == 0) goto L55
                r3.m = r4
            L55:
                r3.b()
                return
        }

        private void b() {
                r3 = this;
                android.graphics.Matrix r0 = r3.j
                r0.reset()
                android.graphics.Matrix r0 = r3.j
                float r1 = r3.d
                float r1 = -r1
                float r2 = r3.e
                float r2 = -r2
                r0.postTranslate(r1, r2)
                android.graphics.Matrix r0 = r3.j
                float r1 = r3.f
                float r2 = r3.g
                r0.postScale(r1, r2)
                android.graphics.Matrix r0 = r3.j
                float r1 = r3.f995c
                r2 = 0
                r0.postRotate(r1, r2, r2)
                android.graphics.Matrix r0 = r3.j
                float r1 = r3.h
                float r2 = r3.d
                float r1 = r1 + r2
                float r2 = r3.i
                float r3 = r3.e
                float r2 = r2 + r3
                r0.postTranslate(r1, r2)
                return
        }

        public void a(android.content.res.Resources r2, android.util.AttributeSet r3, android.content.res.Resources.Theme r4, org.xmlpull.v1.XmlPullParser r5) {
                r1 = this;
                int[] r0 = b.b.b.a.a.f979b
                android.content.res.TypedArray r2 = b.b.c.a.d.g.a(r2, r4, r3, r0)
                r1.a(r2, r5)
                r2.recycle()
                return
        }

        @Override // b.b.b.a.i.e
        public boolean a() {
                r3 = this;
                r0 = 0
                r1 = r0
            L2:
                java.util.ArrayList<b.b.b.a.i$e> r2 = r3.f994b
                int r2 = r2.size()
                if (r1 >= r2) goto L1d
                java.util.ArrayList<b.b.b.a.i$e> r2 = r3.f994b
                java.lang.Object r2 = r2.get(r1)
                b.b.b.a.i$e r2 = (b.b.b.a.i.e) r2
                boolean r2 = r2.a()
                if (r2 == 0) goto L1a
                r3 = 1
                return r3
            L1a:
                int r1 = r1 + 1
                goto L2
            L1d:
                return r0
        }

        @Override // b.b.b.a.i.e
        public boolean a(int[] r4) {
                r3 = this;
                r0 = 0
                r1 = r0
            L2:
                java.util.ArrayList<b.b.b.a.i$e> r2 = r3.f994b
                int r2 = r2.size()
                if (r0 >= r2) goto L1a
                java.util.ArrayList<b.b.b.a.i$e> r2 = r3.f994b
                java.lang.Object r2 = r2.get(r0)
                b.b.b.a.i$e r2 = (b.b.b.a.i.e) r2
                boolean r2 = r2.a(r4)
                r1 = r1 | r2
                int r0 = r0 + 1
                goto L2
            L1a:
                return r1
        }

        public java.lang.String getGroupName() {
                r0 = this;
                java.lang.String r0 = r0.m
                return r0
        }

        public android.graphics.Matrix getLocalMatrix() {
                r0 = this;
                android.graphics.Matrix r0 = r0.j
                return r0
        }

        public float getPivotX() {
                r0 = this;
                float r0 = r0.d
                return r0
        }

        public float getPivotY() {
                r0 = this;
                float r0 = r0.e
                return r0
        }

        public float getRotation() {
                r0 = this;
                float r0 = r0.f995c
                return r0
        }

        public float getScaleX() {
                r0 = this;
                float r0 = r0.f
                return r0
        }

        public float getScaleY() {
                r0 = this;
                float r0 = r0.g
                return r0
        }

        public float getTranslateX() {
                r0 = this;
                float r0 = r0.h
                return r0
        }

        public float getTranslateY() {
                r0 = this;
                float r0 = r0.i
                return r0
        }

        public void setPivotX(float r2) {
                r1 = this;
                float r0 = r1.d
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lb
                r1.d = r2
                r1.b()
            Lb:
                return
        }

        public void setPivotY(float r2) {
                r1 = this;
                float r0 = r1.e
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lb
                r1.e = r2
                r1.b()
            Lb:
                return
        }

        public void setRotation(float r2) {
                r1 = this;
                float r0 = r1.f995c
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lb
                r1.f995c = r2
                r1.b()
            Lb:
                return
        }

        public void setScaleX(float r2) {
                r1 = this;
                float r0 = r1.f
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lb
                r1.f = r2
                r1.b()
            Lb:
                return
        }

        public void setScaleY(float r2) {
                r1 = this;
                float r0 = r1.g
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lb
                r1.g = r2
                r1.b()
            Lb:
                return
        }

        public void setTranslateX(float r2) {
                r1 = this;
                float r0 = r1.h
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lb
                r1.h = r2
                r1.b()
            Lb:
                return
        }

        public void setTranslateY(float r2) {
                r1 = this;
                float r0 = r1.i
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lb
                r1.i = r2
                r1.b()
            Lb:
                return
        }
    }

    private static abstract class e {
        private e() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ e(b.b.b.a.i.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public boolean a() {
                r0 = this;
                r0 = 0
                return r0
        }

        public boolean a(int[] r1) {
                r0 = this;
                r0 = 0
                return r0
        }
    }

    private static abstract class f extends b.b.b.a.i.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected b.b.c.b.b.C0041b[] f996a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        java.lang.String f997b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f998c;

        public f() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.f996a = r0
                return
        }

        public f(b.b.b.a.i.f r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.f996a = r0
                java.lang.String r0 = r2.f997b
                r1.f997b = r0
                int r0 = r2.f998c
                r1.f998c = r0
                b.b.c.b.b$b[] r2 = r2.f996a
                b.b.c.b.b$b[] r2 = b.b.c.b.b.a(r2)
                r1.f996a = r2
                return
        }

        public void a(android.graphics.Path r1) {
                r0 = this;
                r1.reset()
                b.b.c.b.b$b[] r0 = r0.f996a
                if (r0 == 0) goto La
                b.b.c.b.b.C0041b.a(r0, r1)
            La:
                return
        }

        public boolean b() {
                r0 = this;
                r0 = 0
                return r0
        }

        public b.b.c.b.b.C0041b[] getPathData() {
                r0 = this;
                b.b.c.b.b$b[] r0 = r0.f996a
                return r0
        }

        public java.lang.String getPathName() {
                r0 = this;
                java.lang.String r0 = r0.f997b
                return r0
        }

        public void setPathData(b.b.c.b.b.C0041b[] r2) {
                r1 = this;
                b.b.c.b.b$b[] r0 = r1.f996a
                boolean r0 = b.b.c.b.b.a(r0, r2)
                if (r0 != 0) goto Lf
                b.b.c.b.b$b[] r2 = b.b.c.b.b.a(r2)
                r1.f996a = r2
                goto L14
            Lf:
                b.b.c.b.b$b[] r1 = r1.f996a
                b.b.c.b.b.b(r1, r2)
            L14:
                return
        }
    }

    private static class g {
        private static final android.graphics.Matrix q = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.graphics.Path f999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final android.graphics.Path f1000b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final android.graphics.Matrix f1001c;
        android.graphics.Paint d;
        android.graphics.Paint e;
        private android.graphics.PathMeasure f;
        private int g;
        final b.b.b.a.i.d h;
        float i;
        float j;
        float k;
        float l;
        int m;
        java.lang.String n;
        java.lang.Boolean o;
        final b.b.c.f.a<java.lang.String, java.lang.Object> p;

        static {
                android.graphics.Matrix r0 = new android.graphics.Matrix
                r0.<init>()
                b.b.b.a.i.g.q = r0
                return
        }

        public g() {
                r1 = this;
                r1.<init>()
                android.graphics.Matrix r0 = new android.graphics.Matrix
                r0.<init>()
                r1.f1001c = r0
                r0 = 0
                r1.i = r0
                r1.j = r0
                r1.k = r0
                r1.l = r0
                r0 = 255(0xff, float:3.57E-43)
                r1.m = r0
                r0 = 0
                r1.n = r0
                r1.o = r0
                b.b.c.f.a r0 = new b.b.c.f.a
                r0.<init>()
                r1.p = r0
                b.b.b.a.i$d r0 = new b.b.b.a.i$d
                r0.<init>()
                r1.h = r0
                android.graphics.Path r0 = new android.graphics.Path
                r0.<init>()
                r1.f999a = r0
                android.graphics.Path r0 = new android.graphics.Path
                r0.<init>()
                r1.f1000b = r0
                return
        }

        public g(b.b.b.a.i.g r4) {
                r3 = this;
                r3.<init>()
                android.graphics.Matrix r0 = new android.graphics.Matrix
                r0.<init>()
                r3.f1001c = r0
                r0 = 0
                r3.i = r0
                r3.j = r0
                r3.k = r0
                r3.l = r0
                r0 = 255(0xff, float:3.57E-43)
                r3.m = r0
                r0 = 0
                r3.n = r0
                r3.o = r0
                b.b.c.f.a r0 = new b.b.c.f.a
                r0.<init>()
                r3.p = r0
                b.b.b.a.i$d r1 = new b.b.b.a.i$d
                b.b.b.a.i$d r2 = r4.h
                r1.<init>(r2, r0)
                r3.h = r1
                android.graphics.Path r0 = new android.graphics.Path
                android.graphics.Path r1 = r4.f999a
                r0.<init>(r1)
                r3.f999a = r0
                android.graphics.Path r0 = new android.graphics.Path
                android.graphics.Path r1 = r4.f1000b
                r0.<init>(r1)
                r3.f1000b = r0
                float r0 = r4.i
                r3.i = r0
                float r0 = r4.j
                r3.j = r0
                float r0 = r4.k
                r3.k = r0
                float r0 = r4.l
                r3.l = r0
                int r0 = r4.g
                r3.g = r0
                int r0 = r4.m
                r3.m = r0
                java.lang.String r0 = r4.n
                r3.n = r0
                java.lang.String r0 = r4.n
                if (r0 == 0) goto L63
                b.b.c.f.a<java.lang.String, java.lang.Object> r1 = r3.p
                r1.put(r0, r3)
            L63:
                java.lang.Boolean r4 = r4.o
                r3.o = r4
                return
        }

        private static float a(float r0, float r1, float r2, float r3) {
                float r0 = r0 * r3
                float r1 = r1 * r2
                float r0 = r0 - r1
                return r0
        }

        private float a(android.graphics.Matrix r9) {
                r8 = this;
                r8 = 4
                float[] r8 = new float[r8]
                r8 = {x0040: FILL_ARRAY_DATA , data: [0, 1065353216, 1065353216, 0} // fill-array
                r9.mapVectors(r8)
                r9 = 0
                r0 = r8[r9]
                double r0 = (double) r0
                r2 = 1
                r3 = r8[r2]
                double r3 = (double) r3
                double r0 = java.lang.Math.hypot(r0, r3)
                float r0 = (float) r0
                r1 = 2
                r3 = r8[r1]
                double r3 = (double) r3
                r5 = 3
                r6 = r8[r5]
                double r6 = (double) r6
                double r3 = java.lang.Math.hypot(r3, r6)
                float r3 = (float) r3
                r9 = r8[r9]
                r2 = r8[r2]
                r1 = r8[r1]
                r8 = r8[r5]
                float r8 = a(r9, r2, r1, r8)
                float r9 = java.lang.Math.max(r0, r3)
                r0 = 0
                int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r1 <= 0) goto L3e
                float r8 = java.lang.Math.abs(r8)
                float r0 = r8 / r9
            L3e:
                return r0
        }

        private void a(b.b.b.a.i.d r10, android.graphics.Matrix r11, android.graphics.Canvas r12, int r13, int r14, android.graphics.ColorFilter r15) {
                r9 = this;
                android.graphics.Matrix r0 = r10.f993a
                r0.set(r11)
                android.graphics.Matrix r11 = r10.f993a
                android.graphics.Matrix r0 = r10.j
                r11.preConcat(r0)
                r12.save()
                r11 = 0
            L10:
                java.util.ArrayList<b.b.b.a.i$e> r0 = r10.f994b
                int r0 = r0.size()
                if (r11 >= r0) goto L45
                java.util.ArrayList<b.b.b.a.i$e> r0 = r10.f994b
                java.lang.Object r0 = r0.get(r11)
                b.b.b.a.i$e r0 = (b.b.b.a.i.e) r0
                boolean r1 = r0 instanceof b.b.b.a.i.d
                if (r1 == 0) goto L32
                r3 = r0
                b.b.b.a.i$d r3 = (b.b.b.a.i.d) r3
                android.graphics.Matrix r4 = r10.f993a
                r2 = r9
                r5 = r12
                r6 = r13
                r7 = r14
                r8 = r15
                r2.a(r3, r4, r5, r6, r7, r8)
                goto L42
            L32:
                boolean r1 = r0 instanceof b.b.b.a.i.f
                if (r1 == 0) goto L42
                r4 = r0
                b.b.b.a.i$f r4 = (b.b.b.a.i.f) r4
                r2 = r9
                r3 = r10
                r5 = r12
                r6 = r13
                r7 = r14
                r8 = r15
                r2.a(r3, r4, r5, r6, r7, r8)
            L42:
                int r11 = r11 + 1
                goto L10
            L45:
                r12.restore()
                return
        }

        private void a(b.b.b.a.i.d r8, b.b.b.a.i.f r9, android.graphics.Canvas r10, int r11, int r12, android.graphics.ColorFilter r13) {
                r7 = this;
                float r11 = (float) r11
                float r0 = r7.k
                float r11 = r11 / r0
                float r12 = (float) r12
                float r0 = r7.l
                float r12 = r12 / r0
                float r0 = java.lang.Math.min(r11, r12)
                android.graphics.Matrix r8 = r8.f993a
                android.graphics.Matrix r1 = r7.f1001c
                r1.set(r8)
                android.graphics.Matrix r1 = r7.f1001c
                r1.postScale(r11, r12)
                float r8 = r7.a(r8)
                r11 = 0
                int r12 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
                if (r12 != 0) goto L22
                return
            L22:
                android.graphics.Path r12 = r7.f999a
                r9.a(r12)
                android.graphics.Path r12 = r7.f999a
                android.graphics.Path r1 = r7.f1000b
                r1.reset()
                boolean r1 = r9.b()
                if (r1 == 0) goto L42
                android.graphics.Path r8 = r7.f1000b
                android.graphics.Matrix r9 = r7.f1001c
                r8.addPath(r12, r9)
                android.graphics.Path r7 = r7.f1000b
                r10.clipPath(r7)
                goto L15f
            L42:
                b.b.b.a.i$c r9 = (b.b.b.a.i.c) r9
                float r1 = r9.k
                int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
                r2 = 1065353216(0x3f800000, float:1.0)
                r3 = 1
                if (r1 != 0) goto L53
                float r1 = r9.l
                int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r1 == 0) goto L92
            L53:
                float r1 = r9.k
                float r4 = r9.m
                float r1 = r1 + r4
                float r1 = r1 % r2
                float r5 = r9.l
                float r5 = r5 + r4
                float r5 = r5 % r2
                android.graphics.PathMeasure r2 = r7.f
                if (r2 != 0) goto L68
                android.graphics.PathMeasure r2 = new android.graphics.PathMeasure
                r2.<init>()
                r7.f = r2
            L68:
                android.graphics.PathMeasure r2 = r7.f
                android.graphics.Path r4 = r7.f999a
                r6 = 0
                r2.setPath(r4, r6)
                android.graphics.PathMeasure r2 = r7.f
                float r2 = r2.getLength()
                float r1 = r1 * r2
                float r5 = r5 * r2
                r12.reset()
                int r4 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r4 <= 0) goto L8a
                android.graphics.PathMeasure r4 = r7.f
                r4.getSegment(r1, r2, r12, r3)
                android.graphics.PathMeasure r1 = r7.f
                r1.getSegment(r11, r5, r12, r3)
                goto L8f
            L8a:
                android.graphics.PathMeasure r2 = r7.f
                r2.getSegment(r1, r5, r12, r3)
            L8f:
                r12.rLineTo(r11, r11)
            L92:
                android.graphics.Path r11 = r7.f1000b
                android.graphics.Matrix r1 = r7.f1001c
                r11.addPath(r12, r1)
                b.b.c.a.d.b r11 = r9.g
                boolean r11 = r11.e()
                r12 = 1132396544(0x437f0000, float:255.0)
                if (r11 == 0) goto Lf7
                b.b.c.a.d.b r11 = r9.g
                android.graphics.Paint r1 = r7.e
                if (r1 != 0) goto Lb5
                android.graphics.Paint r1 = new android.graphics.Paint
                r1.<init>(r3)
                r7.e = r1
                android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
                r1.setStyle(r2)
            Lb5:
                android.graphics.Paint r1 = r7.e
                boolean r2 = r11.c()
                if (r2 == 0) goto Ld4
                android.graphics.Shader r11 = r11.b()
                android.graphics.Matrix r2 = r7.f1001c
                r11.setLocalMatrix(r2)
                r1.setShader(r11)
                float r11 = r9.j
                float r11 = r11 * r12
                int r11 = java.lang.Math.round(r11)
                r1.setAlpha(r11)
                goto Le1
            Ld4:
                int r11 = r11.a()
                float r2 = r9.j
                int r11 = b.b.b.a.i.a(r11, r2)
                r1.setColor(r11)
            Le1:
                r1.setColorFilter(r13)
                android.graphics.Path r11 = r7.f1000b
                int r2 = r9.i
                if (r2 != 0) goto Led
                android.graphics.Path$FillType r2 = android.graphics.Path.FillType.WINDING
                goto Lef
            Led:
                android.graphics.Path$FillType r2 = android.graphics.Path.FillType.EVEN_ODD
            Lef:
                r11.setFillType(r2)
                android.graphics.Path r11 = r7.f1000b
                r10.drawPath(r11, r1)
            Lf7:
                b.b.c.a.d.b r11 = r9.e
                boolean r11 = r11.e()
                if (r11 == 0) goto L15f
                b.b.c.a.d.b r11 = r9.e
                android.graphics.Paint r1 = r7.d
                if (r1 != 0) goto L111
                android.graphics.Paint r1 = new android.graphics.Paint
                r1.<init>(r3)
                r7.d = r1
                android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
                r1.setStyle(r2)
            L111:
                android.graphics.Paint r1 = r7.d
                android.graphics.Paint$Join r2 = r9.o
                if (r2 == 0) goto L11a
                r1.setStrokeJoin(r2)
            L11a:
                android.graphics.Paint$Cap r2 = r9.n
                if (r2 == 0) goto L121
                r1.setStrokeCap(r2)
            L121:
                float r2 = r9.p
                r1.setStrokeMiter(r2)
                boolean r2 = r11.c()
                if (r2 == 0) goto L143
                android.graphics.Shader r11 = r11.b()
                android.graphics.Matrix r2 = r7.f1001c
                r11.setLocalMatrix(r2)
                r1.setShader(r11)
                float r11 = r9.h
                float r11 = r11 * r12
                int r11 = java.lang.Math.round(r11)
                r1.setAlpha(r11)
                goto L150
            L143:
                int r11 = r11.a()
                float r12 = r9.h
                int r11 = b.b.b.a.i.a(r11, r12)
                r1.setColor(r11)
            L150:
                r1.setColorFilter(r13)
                float r0 = r0 * r8
                float r8 = r9.f
                float r8 = r8 * r0
                r1.setStrokeWidth(r8)
                android.graphics.Path r7 = r7.f1000b
                r10.drawPath(r7, r1)
            L15f:
                return
        }

        public void a(android.graphics.Canvas r8, int r9, int r10, android.graphics.ColorFilter r11) {
                r7 = this;
                b.b.b.a.i$d r1 = r7.h
                android.graphics.Matrix r2 = b.b.b.a.i.g.q
                r0 = r7
                r3 = r8
                r4 = r9
                r5 = r10
                r6 = r11
                r0.a(r1, r2, r3, r4, r5, r6)
                return
        }

        public boolean a() {
                r1 = this;
                java.lang.Boolean r0 = r1.o
                if (r0 != 0) goto L10
                b.b.b.a.i$d r0 = r1.h
                boolean r0 = r0.a()
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r1.o = r0
            L10:
                java.lang.Boolean r1 = r1.o
                boolean r1 = r1.booleanValue()
                return r1
        }

        public boolean a(int[] r1) {
                r0 = this;
                b.b.b.a.i$d r0 = r0.h
                boolean r0 = r0.a(r1)
                return r0
        }

        public float getAlpha() {
                r1 = this;
                int r1 = r1.getRootAlpha()
                float r1 = (float) r1
                r0 = 1132396544(0x437f0000, float:255.0)
                float r1 = r1 / r0
                return r1
        }

        public int getRootAlpha() {
                r0 = this;
                int r0 = r0.m
                return r0
        }

        public void setAlpha(float r2) {
                r1 = this;
                r0 = 1132396544(0x437f0000, float:255.0)
                float r2 = r2 * r0
                int r2 = (int) r2
                r1.setRootAlpha(r2)
                return
        }

        public void setRootAlpha(int r1) {
                r0 = this;
                r0.m = r1
                return
        }
    }

    private static class h extends android.graphics.drawable.Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f1002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        b.b.b.a.i.g f1003b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        android.content.res.ColorStateList f1004c;
        android.graphics.PorterDuff.Mode d;
        boolean e;
        android.graphics.Bitmap f;
        android.content.res.ColorStateList g;
        android.graphics.PorterDuff.Mode h;
        int i;
        boolean j;
        boolean k;
        android.graphics.Paint l;

        public h() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f1004c = r0
                android.graphics.PorterDuff$Mode r0 = b.b.b.a.i.k
                r1.d = r0
                b.b.b.a.i$g r0 = new b.b.b.a.i$g
                r0.<init>()
                r1.f1003b = r0
                return
        }

        public h(b.b.b.a.i.h r4) {
                r3 = this;
                r3.<init>()
                r0 = 0
                r3.f1004c = r0
                android.graphics.PorterDuff$Mode r0 = b.b.b.a.i.k
                r3.d = r0
                if (r4 == 0) goto L49
                int r0 = r4.f1002a
                r3.f1002a = r0
                b.b.b.a.i$g r0 = new b.b.b.a.i$g
                b.b.b.a.i$g r1 = r4.f1003b
                r0.<init>(r1)
                r3.f1003b = r0
                b.b.b.a.i$g r1 = r4.f1003b
                android.graphics.Paint r1 = r1.e
                if (r1 == 0) goto L2a
                android.graphics.Paint r1 = new android.graphics.Paint
                b.b.b.a.i$g r2 = r4.f1003b
                android.graphics.Paint r2 = r2.e
                r1.<init>(r2)
                r0.e = r1
            L2a:
                b.b.b.a.i$g r0 = r4.f1003b
                android.graphics.Paint r0 = r0.d
                if (r0 == 0) goto L3d
                b.b.b.a.i$g r0 = r3.f1003b
                android.graphics.Paint r1 = new android.graphics.Paint
                b.b.b.a.i$g r2 = r4.f1003b
                android.graphics.Paint r2 = r2.d
                r1.<init>(r2)
                r0.d = r1
            L3d:
                android.content.res.ColorStateList r0 = r4.f1004c
                r3.f1004c = r0
                android.graphics.PorterDuff$Mode r0 = r4.d
                r3.d = r0
                boolean r4 = r4.e
                r3.e = r4
            L49:
                return
        }

        public android.graphics.Paint a(android.graphics.ColorFilter r3) {
                r2 = this;
                boolean r0 = r2.b()
                if (r0 != 0) goto La
                if (r3 != 0) goto La
                r2 = 0
                return r2
            La:
                android.graphics.Paint r0 = r2.l
                if (r0 != 0) goto L19
                android.graphics.Paint r0 = new android.graphics.Paint
                r0.<init>()
                r2.l = r0
                r1 = 1
                r0.setFilterBitmap(r1)
            L19:
                android.graphics.Paint r0 = r2.l
                b.b.b.a.i$g r1 = r2.f1003b
                int r1 = r1.getRootAlpha()
                r0.setAlpha(r1)
                android.graphics.Paint r0 = r2.l
                r0.setColorFilter(r3)
                android.graphics.Paint r2 = r2.l
                return r2
        }

        public void a(android.graphics.Canvas r2, android.graphics.ColorFilter r3, android.graphics.Rect r4) {
                r1 = this;
                android.graphics.Paint r3 = r1.a(r3)
                android.graphics.Bitmap r1 = r1.f
                r0 = 0
                r2.drawBitmap(r1, r0, r4, r3)
                return
        }

        public boolean a() {
                r2 = this;
                boolean r0 = r2.k
                if (r0 != 0) goto L22
                android.content.res.ColorStateList r0 = r2.g
                android.content.res.ColorStateList r1 = r2.f1004c
                if (r0 != r1) goto L22
                android.graphics.PorterDuff$Mode r0 = r2.h
                android.graphics.PorterDuff$Mode r1 = r2.d
                if (r0 != r1) goto L22
                boolean r0 = r2.j
                boolean r1 = r2.e
                if (r0 != r1) goto L22
                int r0 = r2.i
                b.b.b.a.i$g r2 = r2.f1003b
                int r2 = r2.getRootAlpha()
                if (r0 != r2) goto L22
                r2 = 1
                return r2
            L22:
                r2 = 0
                return r2
        }

        public boolean a(int r2, int r3) {
                r1 = this;
                android.graphics.Bitmap r0 = r1.f
                int r0 = r0.getWidth()
                if (r2 != r0) goto L12
                android.graphics.Bitmap r1 = r1.f
                int r1 = r1.getHeight()
                if (r3 != r1) goto L12
                r1 = 1
                return r1
            L12:
                r1 = 0
                return r1
        }

        public boolean a(int[] r2) {
                r1 = this;
                b.b.b.a.i$g r0 = r1.f1003b
                boolean r2 = r0.a(r2)
                boolean r0 = r1.k
                r0 = r0 | r2
                r1.k = r0
                return r2
        }

        public void b(int r2, int r3) {
                r1 = this;
                android.graphics.Bitmap r0 = r1.f
                if (r0 == 0) goto La
                boolean r0 = r1.a(r2, r3)
                if (r0 != 0) goto L15
            La:
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
                android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r3, r0)
                r1.f = r2
                r2 = 1
                r1.k = r2
            L15:
                return
        }

        public boolean b() {
                r1 = this;
                b.b.b.a.i$g r1 = r1.f1003b
                int r1 = r1.getRootAlpha()
                r0 = 255(0xff, float:3.57E-43)
                if (r1 >= r0) goto Lc
                r1 = 1
                goto Ld
            Lc:
                r1 = 0
            Ld:
                return r1
        }

        public void c(int r3, int r4) {
                r2 = this;
                android.graphics.Bitmap r0 = r2.f
                r1 = 0
                r0.eraseColor(r1)
                android.graphics.Canvas r0 = new android.graphics.Canvas
                android.graphics.Bitmap r1 = r2.f
                r0.<init>(r1)
                b.b.b.a.i$g r2 = r2.f1003b
                r1 = 0
                r2.a(r0, r3, r4, r1)
                return
        }

        public boolean c() {
                r0 = this;
                b.b.b.a.i$g r0 = r0.f1003b
                boolean r0 = r0.a()
                return r0
        }

        public void d() {
                r1 = this;
                android.content.res.ColorStateList r0 = r1.f1004c
                r1.g = r0
                android.graphics.PorterDuff$Mode r0 = r1.d
                r1.h = r0
                b.b.b.a.i$g r0 = r1.f1003b
                int r0 = r0.getRootAlpha()
                r1.i = r0
                boolean r0 = r1.e
                r1.j = r0
                r0 = 0
                r1.k = r0
                return
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
                r0 = this;
                int r0 = r0.f1002a
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
                r1 = this;
                b.b.b.a.i r0 = new b.b.b.a.i
                r0.<init>(r1)
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r1) {
                r0 = this;
                b.b.b.a.i r1 = new b.b.b.a.i
                r1.<init>(r0)
                return r1
        }
    }

    /* JADX INFO: renamed from: b.b.b.a.i$i, reason: collision with other inner class name */
    private static class C0038i extends android.graphics.drawable.Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.graphics.drawable.Drawable.ConstantState f1005a;

        public C0038i(android.graphics.drawable.Drawable.ConstantState r1) {
                r0 = this;
                r0.<init>()
                r0.f1005a = r1
                return
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
                r0 = this;
                android.graphics.drawable.Drawable$ConstantState r0 = r0.f1005a
                boolean r0 = r0.canApplyTheme()
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
                r0 = this;
                android.graphics.drawable.Drawable$ConstantState r0 = r0.f1005a
                int r0 = r0.getChangingConfigurations()
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
                r1 = this;
                b.b.b.a.i r0 = new b.b.b.a.i
                r0.<init>()
                android.graphics.drawable.Drawable$ConstantState r1 = r1.f1005a
                android.graphics.drawable.Drawable r1 = r1.newDrawable()
                android.graphics.drawable.VectorDrawable r1 = (android.graphics.drawable.VectorDrawable) r1
                r0.f991b = r1
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r2) {
                r1 = this;
                b.b.b.a.i r0 = new b.b.b.a.i
                r0.<init>()
                android.graphics.drawable.Drawable$ConstantState r1 = r1.f1005a
                android.graphics.drawable.Drawable r1 = r1.newDrawable(r2)
                android.graphics.drawable.VectorDrawable r1 = (android.graphics.drawable.VectorDrawable) r1
                r0.f991b = r1
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r2, android.content.res.Resources.Theme r3) {
                r1 = this;
                b.b.b.a.i r0 = new b.b.b.a.i
                r0.<init>()
                android.graphics.drawable.Drawable$ConstantState r1 = r1.f1005a
                android.graphics.drawable.Drawable r1 = r1.newDrawable(r2, r3)
                android.graphics.drawable.VectorDrawable r1 = (android.graphics.drawable.VectorDrawable) r1
                r0.f991b = r1
                return r0
        }
    }

    static {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            b.b.b.a.i.k = r0
            return
    }

    i() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.g = r0
            r0 = 9
            float[] r0 = new float[r0]
            r1.h = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1.i = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.j = r0
            b.b.b.a.i$h r0 = new b.b.b.a.i$h
            r0.<init>()
            r1.f992c = r0
            return
    }

    i(b.b.b.a.i.h r3) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.g = r0
            r0 = 9
            float[] r0 = new float[r0]
            r2.h = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r2.i = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.j = r0
            r2.f992c = r3
            android.graphics.PorterDuffColorFilter r0 = r2.d
            android.content.res.ColorStateList r1 = r3.f1004c
            android.graphics.PorterDuff$Mode r3 = r3.d
            android.graphics.PorterDuffColorFilter r3 = r2.a(r0, r1, r3)
            r2.d = r3
            return
    }

    static int a(int r2, float r3) {
            int r0 = android.graphics.Color.alpha(r2)
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r1
            float r0 = (float) r0
            float r0 = r0 * r3
            int r3 = (int) r0
            int r3 = r3 << 24
            r2 = r2 | r3
            return r2
    }

    private static android.graphics.PorterDuff.Mode a(int r1, android.graphics.PorterDuff.Mode r2) {
            r0 = 3
            if (r1 == r0) goto L1d
            r0 = 5
            if (r1 == r0) goto L1a
            r0 = 9
            if (r1 == r0) goto L17
            switch(r1) {
                case 14: goto L14;
                case 15: goto L11;
                case 16: goto Le;
                default: goto Ld;
            }
        Ld:
            return r2
        Le:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.ADD
            return r1
        L11:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SCREEN
            return r1
        L14:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
            return r1
        L17:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_ATOP
            return r1
        L1a:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            return r1
        L1d:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_OVER
            return r1
    }

    public static b.b.b.a.i a(android.content.res.Resources r6, int r7, android.content.res.Resources.Theme r8) {
            java.lang.String r0 = "parser error"
            java.lang.String r1 = "VectorDrawableCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L21
            b.b.b.a.i r0 = new b.b.b.a.i
            r0.<init>()
            android.graphics.drawable.Drawable r6 = b.b.c.a.d.f.a(r6, r7, r8)
            r0.f991b = r6
            b.b.b.a.i$i r6 = new b.b.b.a.i$i
            android.graphics.drawable.Drawable r7 = r0.f991b
            android.graphics.drawable.Drawable$ConstantState r7 = r7.getConstantState()
            r6.<init>(r7)
            return r0
        L21:
            android.content.res.XmlResourceParser r7 = r6.getXml(r7)     // Catch: java.lang.Throwable -> L43
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r7)     // Catch: java.lang.Throwable -> L43
        L29:
            int r3 = r7.next()     // Catch: java.lang.Throwable -> L43
            r4 = 2
            if (r3 == r4) goto L34
            r5 = 1
            if (r3 == r5) goto L34
            goto L29
        L34:
            if (r3 != r4) goto L3b
            b.b.b.a.i r6 = createFromXmlInner(r6, r7, r2, r8)     // Catch: java.lang.Throwable -> L43
            return r6
        L3b:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.lang.Throwable -> L43
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L43
            throw r6     // Catch: java.lang.Throwable -> L43
        L43:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
            r6 = 0
            return r6
    }

    private void a(android.content.res.Resources r10, org.xmlpull.v1.XmlPullParser r11, android.util.AttributeSet r12, android.content.res.Resources.Theme r13) {
            r9 = this;
            b.b.b.a.i$h r9 = r9.f992c
            b.b.b.a.i$g r0 = r9.f1003b
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            b.b.b.a.i$d r2 = r0.h
            r1.push(r2)
            int r2 = r11.getEventType()
            int r3 = r11.getDepth()
            r4 = 1
            int r3 = r3 + r4
            r5 = r4
        L19:
            if (r2 == r4) goto Lc4
            int r6 = r11.getDepth()
            r7 = 3
            if (r6 >= r3) goto L24
            if (r2 == r7) goto Lc4
        L24:
            r6 = 2
            java.lang.String r8 = "group"
            if (r2 != r6) goto Laf
            java.lang.String r2 = r11.getName()
            java.lang.Object r6 = r1.peek()
            b.b.b.a.i$d r6 = (b.b.b.a.i.d) r6
            java.lang.String r7 = "path"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L59
            b.b.b.a.i$c r2 = new b.b.b.a.i$c
            r2.<init>()
            r2.a(r10, r12, r13, r11)
            java.util.ArrayList<b.b.b.a.i$e> r5 = r6.f994b
            r5.add(r2)
            java.lang.String r5 = r2.getPathName()
            if (r5 == 0) goto L57
            b.b.c.f.a<java.lang.String, java.lang.Object> r5 = r0.p
            java.lang.String r6 = r2.getPathName()
            r5.put(r6, r2)
        L57:
            r5 = 0
            goto L7d
        L59:
            java.lang.String r7 = "clip-path"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L85
            b.b.b.a.i$b r2 = new b.b.b.a.i$b
            r2.<init>()
            r2.a(r10, r12, r13, r11)
            java.util.ArrayList<b.b.b.a.i$e> r6 = r6.f994b
            r6.add(r2)
            java.lang.String r6 = r2.getPathName()
            if (r6 == 0) goto L7d
            b.b.c.f.a<java.lang.String, java.lang.Object> r6 = r0.p
            java.lang.String r7 = r2.getPathName()
            r6.put(r7, r2)
        L7d:
            int r6 = r9.f1002a
            int r2 = r2.f998c
        L81:
            r2 = r2 | r6
            r9.f1002a = r2
            goto Lbe
        L85:
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto Lbe
            b.b.b.a.i$d r2 = new b.b.b.a.i$d
            r2.<init>()
            r2.a(r10, r12, r13, r11)
            java.util.ArrayList<b.b.b.a.i$e> r6 = r6.f994b
            r6.add(r2)
            r1.push(r2)
            java.lang.String r6 = r2.getGroupName()
            if (r6 == 0) goto Laa
            b.b.c.f.a<java.lang.String, java.lang.Object> r6 = r0.p
            java.lang.String r7 = r2.getGroupName()
            r6.put(r7, r2)
        Laa:
            int r6 = r9.f1002a
            int r2 = r2.k
            goto L81
        Laf:
            if (r2 != r7) goto Lbe
            java.lang.String r2 = r11.getName()
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto Lbe
            r1.pop()
        Lbe:
            int r2 = r11.next()
            goto L19
        Lc4:
            if (r5 != 0) goto Lc7
            return
        Lc7:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r10 = "no path defined"
            r9.<init>(r10)
            throw r9
    }

    private void a(android.content.res.TypedArray r5, org.xmlpull.v1.XmlPullParser r6) {
            r4 = this;
            b.b.b.a.i$h r4 = r4.f992c
            b.b.b.a.i$g r0 = r4.f1003b
            java.lang.String r1 = "tintMode"
            r2 = 6
            r3 = -1
            int r1 = b.b.c.a.d.g.b(r5, r6, r1, r2, r3)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = a(r1, r2)
            r4.d = r1
            r1 = 1
            android.content.res.ColorStateList r1 = r5.getColorStateList(r1)
            if (r1 == 0) goto L1d
            r4.f1004c = r1
        L1d:
            r1 = 5
            boolean r2 = r4.e
            java.lang.String r3 = "autoMirrored"
            boolean r1 = b.b.c.a.d.g.a(r5, r6, r3, r1, r2)
            r4.e = r1
            r4 = 7
            float r1 = r0.k
            java.lang.String r2 = "viewportWidth"
            float r4 = b.b.c.a.d.g.a(r5, r6, r2, r4, r1)
            r0.k = r4
            r4 = 8
            float r1 = r0.l
            java.lang.String r2 = "viewportHeight"
            float r4 = b.b.c.a.d.g.a(r5, r6, r2, r4, r1)
            r0.l = r4
            float r1 = r0.k
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto Ld4
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 <= 0) goto Lb9
            r4 = 3
            float r1 = r0.i
            float r4 = r5.getDimension(r4, r1)
            r0.i = r4
            r4 = 2
            float r1 = r0.j
            float r4 = r5.getDimension(r4, r1)
            r0.j = r4
            float r1 = r0.i
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L9e
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 <= 0) goto L83
            r4 = 4
            float r1 = r0.getAlpha()
            java.lang.String r2 = "alpha"
            float r4 = b.b.c.a.d.g.a(r5, r6, r2, r4, r1)
            r0.setAlpha(r4)
            r4 = 0
            java.lang.String r4 = r5.getString(r4)
            if (r4 == 0) goto L82
            r0.n = r4
            b.b.c.f.a<java.lang.String, java.lang.Object> r5 = r0.p
            r5.put(r4, r0)
        L82:
            return
        L83:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r5 = r5.getPositionDescription()
            r6.append(r5)
            java.lang.String r5 = "<vector> tag requires height > 0"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
        L9e:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r5 = r5.getPositionDescription()
            r6.append(r5)
            java.lang.String r5 = "<vector> tag requires width > 0"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
        Lb9:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r5 = r5.getPositionDescription()
            r6.append(r5)
            java.lang.String r5 = "<vector> tag requires viewportHeight > 0"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
        Ld4:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r5 = r5.getPositionDescription()
            r6.append(r5)
            java.lang.String r5 = "<vector> tag requires viewportWidth > 0"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
    }

    private boolean a() {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 17
            if (r0 < r2) goto L15
            boolean r0 = r3.isAutoMirrored()
            r2 = 1
            if (r0 == 0) goto L15
            int r3 = android.support.v4.graphics.drawable.a.d(r3)
            if (r3 != r2) goto L15
            r1 = r2
        L15:
            return r1
    }

    public static b.b.b.a.i createFromXmlInner(android.content.res.Resources r1, org.xmlpull.v1.XmlPullParser r2, android.util.AttributeSet r3, android.content.res.Resources.Theme r4) {
            b.b.b.a.i r0 = new b.b.b.a.i
            r0.<init>()
            r0.inflate(r1, r2, r3, r4)
            return r0
    }

    android.graphics.PorterDuffColorFilter a(android.graphics.PorterDuffColorFilter r1, android.content.res.ColorStateList r2, android.graphics.PorterDuff.Mode r3) {
            r0 = this;
            if (r2 == 0) goto L14
            if (r3 != 0) goto L5
            goto L14
        L5:
            int[] r0 = r0.getState()
            r1 = 0
            int r0 = r2.getColorForState(r0, r1)
            android.graphics.PorterDuffColorFilter r1 = new android.graphics.PorterDuffColorFilter
            r1.<init>(r0, r3)
            return r1
        L14:
            r0 = 0
            return r0
    }

    java.lang.Object a(java.lang.String r1) {
            r0 = this;
            b.b.b.a.i$h r0 = r0.f992c
            b.b.b.a.i$g r0 = r0.f1003b
            b.b.c.f.a<java.lang.String, java.lang.Object> r0 = r0.p
            java.lang.Object r0 = r0.get(r1)
            return r0
    }

    void a(boolean r1) {
            r0 = this;
            r0.g = r1
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f991b
            if (r0 == 0) goto L7
            android.support.v4.graphics.drawable.a.a(r0)
        L7:
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r10) {
            r9 = this;
            android.graphics.drawable.Drawable r0 = r9.f991b
            if (r0 == 0) goto L8
            r0.draw(r10)
            return
        L8:
            android.graphics.Rect r0 = r9.j
            r9.copyBounds(r0)
            android.graphics.Rect r0 = r9.j
            int r0 = r0.width()
            if (r0 <= 0) goto Ld7
            android.graphics.Rect r0 = r9.j
            int r0 = r0.height()
            if (r0 > 0) goto L1f
            goto Ld7
        L1f:
            android.graphics.ColorFilter r0 = r9.e
            if (r0 != 0) goto L25
            android.graphics.PorterDuffColorFilter r0 = r9.d
        L25:
            android.graphics.Matrix r1 = r9.i
            r10.getMatrix(r1)
            android.graphics.Matrix r1 = r9.i
            float[] r2 = r9.h
            r1.getValues(r2)
            float[] r1 = r9.h
            r2 = 0
            r1 = r1[r2]
            float r1 = java.lang.Math.abs(r1)
            float[] r3 = r9.h
            r4 = 4
            r3 = r3[r4]
            float r3 = java.lang.Math.abs(r3)
            float[] r4 = r9.h
            r5 = 1
            r4 = r4[r5]
            float r4 = java.lang.Math.abs(r4)
            float[] r5 = r9.h
            r6 = 3
            r5 = r5[r6]
            float r5 = java.lang.Math.abs(r5)
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r4 != 0) goto L60
            int r4 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r4 == 0) goto L62
        L60:
            r1 = r7
            r3 = r1
        L62:
            android.graphics.Rect r4 = r9.j
            int r4 = r4.width()
            float r4 = (float) r4
            float r4 = r4 * r1
            int r1 = (int) r4
            android.graphics.Rect r4 = r9.j
            int r4 = r4.height()
            float r4 = (float) r4
            float r4 = r4 * r3
            int r3 = (int) r4
            r4 = 2048(0x800, float:2.87E-42)
            int r1 = java.lang.Math.min(r4, r1)
            int r3 = java.lang.Math.min(r4, r3)
            if (r1 <= 0) goto Ld7
            if (r3 > 0) goto L83
            goto Ld7
        L83:
            int r4 = r10.save()
            android.graphics.Rect r5 = r9.j
            int r8 = r5.left
            float r8 = (float) r8
            int r5 = r5.top
            float r5 = (float) r5
            r10.translate(r8, r5)
            boolean r5 = r9.a()
            if (r5 == 0) goto La7
            android.graphics.Rect r5 = r9.j
            int r5 = r5.width()
            float r5 = (float) r5
            r10.translate(r5, r6)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r10.scale(r5, r7)
        La7:
            android.graphics.Rect r5 = r9.j
            r5.offsetTo(r2, r2)
            b.b.b.a.i$h r2 = r9.f992c
            r2.b(r1, r3)
            boolean r2 = r9.g
            if (r2 != 0) goto Lbb
            b.b.b.a.i$h r2 = r9.f992c
            r2.c(r1, r3)
            goto Lcd
        Lbb:
            b.b.b.a.i$h r2 = r9.f992c
            boolean r2 = r2.a()
            if (r2 != 0) goto Lcd
            b.b.b.a.i$h r2 = r9.f992c
            r2.c(r1, r3)
            b.b.b.a.i$h r1 = r9.f992c
            r1.d()
        Lcd:
            b.b.b.a.i$h r1 = r9.f992c
            android.graphics.Rect r9 = r9.j
            r1.a(r10, r0, r9)
            r10.restoreToCount(r4)
        Ld7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f991b
            if (r0 == 0) goto L9
            int r1 = android.support.v4.graphics.drawable.a.b(r0)
            return r1
        L9:
            b.b.b.a.i$h r1 = r1.f992c
            b.b.b.a.i$g r1 = r1.f1003b
            int r1 = r1.getRootAlpha()
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f991b
            if (r0 == 0) goto L9
            int r1 = r0.getChangingConfigurations()
            return r1
        L9:
            int r0 = super.getChangingConfigurations()
            b.b.b.a.i$h r1 = r1.f992c
            int r1 = r1.getChangingConfigurations()
            r1 = r1 | r0
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable.ConstantState getConstantState() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f991b
            if (r0 == 0) goto L16
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L16
            b.b.b.a.i$i r0 = new b.b.b.a.i$i
            android.graphics.drawable.Drawable r2 = r2.f991b
            android.graphics.drawable.Drawable$ConstantState r2 = r2.getConstantState()
            r0.<init>(r2)
            return r0
        L16:
            b.b.b.a.i$h r0 = r2.f992c
            int r1 = r2.getChangingConfigurations()
            r0.f1002a = r1
            b.b.b.a.i$h r2 = r2.f992c
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f991b
            if (r0 == 0) goto L9
            int r1 = r0.getIntrinsicHeight()
            return r1
        L9:
            b.b.b.a.i$h r1 = r1.f992c
            b.b.b.a.i$g r1 = r1.f1003b
            float r1 = r1.j
            int r1 = (int) r1
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f991b
            if (r0 == 0) goto L9
            int r1 = r0.getIntrinsicWidth()
            return r1
        L9:
            b.b.b.a.i$h r1 = r1.f992c
            b.b.b.a.i$g r1 = r1.f1003b
            float r1 = r1.i
            int r1 = (int) r1
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f991b
            if (r0 == 0) goto L9
            int r0 = r0.getOpacity()
            return r0
        L9:
            r0 = -3
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(android.content.res.Resources r2, org.xmlpull.v1.XmlPullParser r3, android.util.AttributeSet r4) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f991b
            if (r0 == 0) goto L8
            r0.inflate(r2, r3, r4)
            return
        L8:
            r0 = 0
            r1.inflate(r2, r3, r4, r0)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(android.content.res.Resources r3, org.xmlpull.v1.XmlPullParser r4, android.util.AttributeSet r5, android.content.res.Resources.Theme r6) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f991b
            if (r0 == 0) goto L8
            android.support.v4.graphics.drawable.a.a(r0, r3, r4, r5, r6)
            return
        L8:
            b.b.b.a.i$h r0 = r2.f992c
            b.b.b.a.i$g r1 = new b.b.b.a.i$g
            r1.<init>()
            r0.f1003b = r1
            int[] r1 = b.b.b.a.a.f978a
            android.content.res.TypedArray r1 = b.b.c.a.d.g.a(r3, r6, r5, r1)
            r2.a(r1, r4)
            r1.recycle()
            int r1 = r2.getChangingConfigurations()
            r0.f1002a = r1
            r1 = 1
            r0.k = r1
            r2.a(r3, r4, r5, r6)
            android.graphics.PorterDuffColorFilter r3 = r2.d
            android.content.res.ColorStateList r4 = r0.f1004c
            android.graphics.PorterDuff$Mode r5 = r0.d
            android.graphics.PorterDuffColorFilter r3 = r2.a(r3, r4, r5)
            r2.d = r3
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f991b
            if (r0 == 0) goto L8
            r0.invalidateSelf()
            return
        L8:
            super.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f991b
            if (r0 == 0) goto L9
            boolean r1 = android.support.v4.graphics.drawable.a.e(r0)
            return r1
        L9:
            b.b.b.a.i$h r1 = r1.f992c
            boolean r1 = r1.e
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f991b
            if (r0 == 0) goto L9
            boolean r1 = r0.isStateful()
            return r1
        L9:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L28
            b.b.b.a.i$h r0 = r1.f992c
            if (r0 == 0) goto L26
            boolean r0 = r0.c()
            if (r0 != 0) goto L28
            b.b.b.a.i$h r1 = r1.f992c
            android.content.res.ColorStateList r1 = r1.f1004c
            if (r1 == 0) goto L26
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L26
            goto L28
        L26:
            r1 = 0
            goto L29
        L28:
            r1 = 1
        L29:
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f991b
            if (r0 == 0) goto L8
            r0.mutate()
            return r2
        L8:
            boolean r0 = r2.f
            if (r0 != 0) goto L1e
            android.graphics.drawable.Drawable r0 = super.mutate()
            if (r0 != r2) goto L1e
            b.b.b.a.i$h r0 = new b.b.b.a.i$h
            b.b.b.a.i$h r1 = r2.f992c
            r0.<init>(r1)
            r2.f992c = r0
            r0 = 1
            r2.f = r0
        L1e:
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f991b
            if (r0 == 0) goto L7
            r0.setBounds(r1)
        L7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] r6) {
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.f991b
            if (r0 == 0) goto L9
            boolean r5 = r0.setState(r6)
            return r5
        L9:
            r0 = 0
            b.b.b.a.i$h r1 = r5.f992c
            android.content.res.ColorStateList r2 = r1.f1004c
            r3 = 1
            if (r2 == 0) goto L21
            android.graphics.PorterDuff$Mode r4 = r1.d
            if (r4 == 0) goto L21
            android.graphics.PorterDuffColorFilter r0 = r5.d
            android.graphics.PorterDuffColorFilter r0 = r5.a(r0, r2, r4)
            r5.d = r0
            r5.invalidateSelf()
            r0 = r3
        L21:
            boolean r2 = r1.c()
            if (r2 == 0) goto L31
            boolean r6 = r1.a(r6)
            if (r6 == 0) goto L31
            r5.invalidateSelf()
            goto L32
        L31:
            r3 = r0
        L32:
            return r3
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(java.lang.Runnable r2, long r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f991b
            if (r0 == 0) goto L8
            r0.scheduleSelf(r2, r3)
            return
        L8:
            super.scheduleSelf(r2, r3)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f991b
            if (r0 == 0) goto L8
            r0.setAlpha(r2)
            return
        L8:
            b.b.b.a.i$h r0 = r1.f992c
            b.b.b.a.i$g r0 = r0.f1003b
            int r0 = r0.getRootAlpha()
            if (r0 == r2) goto L1c
            b.b.b.a.i$h r0 = r1.f992c
            b.b.b.a.i$g r0 = r0.f1003b
            r0.setRootAlpha(r2)
            r1.invalidateSelf()
        L1c:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f991b
            if (r0 == 0) goto L8
            android.support.v4.graphics.drawable.a.a(r0, r2)
            return
        L8:
            b.b.b.a.i$h r1 = r1.f992c
            r1.e = r2
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f991b
            if (r0 == 0) goto L8
            r0.setColorFilter(r2)
            return
        L8:
            r1.e = r2
            r1.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.b
    public void setTint(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f991b
            if (r0 == 0) goto L8
            android.support.v4.graphics.drawable.a.b(r0, r2)
            return
        L8:
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r1.setTintList(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.b
    public void setTintList(android.content.res.ColorStateList r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f991b
            if (r0 == 0) goto L8
            android.support.v4.graphics.drawable.a.a(r0, r3)
            return
        L8:
            b.b.b.a.i$h r0 = r2.f992c
            android.content.res.ColorStateList r1 = r0.f1004c
            if (r1 == r3) goto L1d
            r0.f1004c = r3
            android.graphics.PorterDuffColorFilter r1 = r2.d
            android.graphics.PorterDuff$Mode r0 = r0.d
            android.graphics.PorterDuffColorFilter r3 = r2.a(r1, r3, r0)
            r2.d = r3
            r2.invalidateSelf()
        L1d:
            return
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.b
    public void setTintMode(android.graphics.PorterDuff.Mode r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f991b
            if (r0 == 0) goto L8
            android.support.v4.graphics.drawable.a.a(r0, r3)
            return
        L8:
            b.b.b.a.i$h r0 = r2.f992c
            android.graphics.PorterDuff$Mode r1 = r0.d
            if (r1 == r3) goto L1d
            r0.d = r3
            android.graphics.PorterDuffColorFilter r1 = r2.d
            android.content.res.ColorStateList r0 = r0.f1004c
            android.graphics.PorterDuffColorFilter r3 = r2.a(r1, r0, r3)
            r2.d = r3
            r2.invalidateSelf()
        L1d:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean r2, boolean r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f991b
            if (r0 == 0) goto L9
            boolean r1 = r0.setVisible(r2, r3)
            return r1
        L9:
            boolean r1 = super.setVisible(r2, r3)
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(java.lang.Runnable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f991b
            if (r0 == 0) goto L8
            r0.unscheduleSelf(r2)
            return
        L8:
            super.unscheduleSelf(r2)
            return
    }
}
