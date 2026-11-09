package android.support.constraint;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends android.view.View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int[] f421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f422c;
    protected android.content.Context d;
    protected android.support.constraint.n.k.h e;
    protected boolean f;
    protected java.lang.String g;
    protected java.lang.String h;
    private java.util.HashMap<java.lang.Integer, java.lang.String> i;

    public c(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 32
            int[] r0 = new int[r0]
            r1.f421b = r0
            r0 = 0
            r1.f = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.i = r0
            r1.d = r2
            r2 = 0
            r1.a(r2)
            return
    }

    private int a(android.support.constraint.ConstraintLayout r7, java.lang.String r8) {
            r6 = this;
            r0 = 0
            if (r8 == 0) goto L38
            if (r7 != 0) goto L6
            goto L38
        L6:
            android.content.Context r6 = r6.d
            android.content.res.Resources r6 = r6.getResources()
            if (r6 != 0) goto Lf
            return r0
        Lf:
            int r1 = r7.getChildCount()
            r2 = r0
        L14:
            if (r2 >= r1) goto L38
            android.view.View r3 = r7.getChildAt(r2)
            int r4 = r3.getId()
            r5 = -1
            if (r4 == r5) goto L35
            r4 = 0
            int r5 = r3.getId()     // Catch: android.content.res.Resources.NotFoundException -> L2a
            java.lang.String r4 = r6.getResourceEntryName(r5)     // Catch: android.content.res.Resources.NotFoundException -> L2a
        L2a:
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L35
            int r6 = r3.getId()
            return r6
        L35:
            int r2 = r2 + 1
            goto L14
        L38:
            return r0
    }

    private void a(int r4) {
            r3 = this;
            int r0 = r3.getId()
            if (r4 != r0) goto L7
            return
        L7:
            int r0 = r3.f422c
            int r0 = r0 + 1
            int[] r1 = r3.f421b
            int r2 = r1.length
            if (r0 <= r2) goto L19
            int r0 = r1.length
            int r0 = r0 * 2
            int[] r0 = java.util.Arrays.copyOf(r1, r0)
            r3.f421b = r0
        L19:
            int[] r0 = r3.f421b
            int r1 = r3.f422c
            r0[r1] = r4
            int r1 = r1 + 1
            r3.f422c = r1
            return
    }

    private void a(java.lang.String r4) {
            r3 = this;
            if (r4 == 0) goto L4e
            int r0 = r4.length()
            if (r0 != 0) goto L9
            goto L4e
        L9:
            android.content.Context r0 = r3.d
            if (r0 != 0) goto Le
            return
        Le:
            java.lang.String r4 = r4.trim()
            android.view.ViewParent r0 = r3.getParent()
            boolean r0 = r0 instanceof android.support.constraint.ConstraintLayout
            if (r0 == 0) goto L20
            android.view.ViewParent r0 = r3.getParent()
            android.support.constraint.ConstraintLayout r0 = (android.support.constraint.ConstraintLayout) r0
        L20:
            int r0 = r3.c(r4)
            if (r0 == 0) goto L33
            java.util.HashMap<java.lang.Integer, java.lang.String> r1 = r3.i
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1.put(r2, r4)
            r3.a(r0)
            goto L4e
        L33:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Could not find id of \""
            r3.append(r0)
            r3.append(r4)
            java.lang.String r4 = "\""
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "ConstraintHelper"
            android.util.Log.w(r4, r3)
        L4e:
            return
    }

    private void b(java.lang.String r8) {
            r7 = this;
            if (r8 == 0) goto L7c
            int r0 = r8.length()
            if (r0 != 0) goto La
            goto L7c
        La:
            android.content.Context r0 = r7.d
            if (r0 != 0) goto Lf
            return
        Lf:
            java.lang.String r8 = r8.trim()
            r0 = 0
            android.view.ViewParent r1 = r7.getParent()
            boolean r1 = r1 instanceof android.support.constraint.ConstraintLayout
            if (r1 == 0) goto L22
            android.view.ViewParent r0 = r7.getParent()
            android.support.constraint.ConstraintLayout r0 = (android.support.constraint.ConstraintLayout) r0
        L22:
            java.lang.String r1 = "ConstraintHelper"
            if (r0 != 0) goto L2c
            java.lang.String r7 = "Parent not a ConstraintLayout"
            android.util.Log.w(r1, r7)
            return
        L2c:
            int r2 = r0.getChildCount()
            r3 = 0
        L31:
            if (r3 >= r2) goto L7c
            android.view.View r4 = r0.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            boolean r6 = r5 instanceof android.support.constraint.ConstraintLayout.b
            if (r6 == 0) goto L79
            android.support.constraint.ConstraintLayout$b r5 = (android.support.constraint.ConstraintLayout.b) r5
            java.lang.String r5 = r5.U
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L79
            int r5 = r4.getId()
            r6 = -1
            if (r5 != r6) goto L72
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "to use ConstraintTag view "
            r5.append(r6)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r5.append(r4)
            java.lang.String r4 = " must have an ID"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            android.util.Log.w(r1, r4)
            goto L79
        L72:
            int r4 = r4.getId()
            r7.a(r4)
        L79:
            int r3 = r3 + 1
            goto L31
        L7c:
            return
    }

    private int c(java.lang.String r6) {
            r5 = this;
            android.view.ViewParent r0 = r5.getParent()
            boolean r0 = r0 instanceof android.support.constraint.ConstraintLayout
            r1 = 0
            if (r0 == 0) goto L10
            android.view.ViewParent r0 = r5.getParent()
            android.support.constraint.ConstraintLayout r0 = (android.support.constraint.ConstraintLayout) r0
            goto L11
        L10:
            r0 = r1
        L11:
            boolean r2 = r5.isInEditMode()
            r3 = 0
            if (r2 == 0) goto L28
            if (r0 == 0) goto L28
            java.lang.Object r2 = r0.a(r3, r6)
            boolean r4 = r2 instanceof java.lang.Integer
            if (r4 == 0) goto L28
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r3 = r2.intValue()
        L28:
            if (r3 != 0) goto L30
            if (r0 == 0) goto L30
            int r3 = r5.a(r0, r6)
        L30:
            if (r3 != 0) goto L3c
            java.lang.Class<android.support.constraint.j> r0 = android.support.constraint.j.class
            java.lang.reflect.Field r0 = r0.getField(r6)     // Catch: java.lang.Exception -> L3c
            int r3 = r0.getInt(r1)     // Catch: java.lang.Exception -> L3c
        L3c:
            if (r3 != 0) goto L50
            android.content.Context r0 = r5.d
            android.content.res.Resources r0 = r0.getResources()
            android.content.Context r5 = r5.d
            java.lang.String r5 = r5.getPackageName()
            java.lang.String r1 = "id"
            int r3 = r0.getIdentifier(r6, r1, r5)
        L50:
            return r3
    }

    protected void a() {
            r2 = this;
            android.view.ViewParent r0 = r2.getParent()
            if (r0 == 0) goto Lf
            boolean r1 = r0 instanceof android.support.constraint.ConstraintLayout
            if (r1 == 0) goto Lf
            android.support.constraint.ConstraintLayout r0 = (android.support.constraint.ConstraintLayout) r0
            r2.a(r0)
        Lf:
            return
    }

    protected void a(android.support.constraint.ConstraintLayout r8) {
            r7 = this;
            int r0 = r7.getVisibility()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            r3 = 0
            if (r1 < r2) goto L10
            float r1 = r7.getElevation()
            goto L11
        L10:
            r1 = r3
        L11:
            r4 = 0
        L12:
            int r5 = r7.f422c
            if (r4 >= r5) goto L36
            int[] r5 = r7.f421b
            r5 = r5[r4]
            android.view.View r5 = r8.a(r5)
            if (r5 == 0) goto L33
            r5.setVisibility(r0)
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 <= 0) goto L33
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r2) goto L33
            float r6 = r5.getTranslationZ()
            float r6 = r6 + r1
            r5.setTranslationZ(r6)
        L33:
            int r4 = r4 + 1
            goto L12
        L36:
            return
    }

    public void a(android.support.constraint.n.k.e r1, boolean r2) {
            r0 = this;
            return
    }

    protected void a(android.util.AttributeSet r5) {
            r4 = this;
            if (r5 == 0) goto L38
            android.content.Context r0 = r4.getContext()
            int[] r1 = android.support.constraint.k.ConstraintLayout_Layout
            android.content.res.TypedArray r5 = r0.obtainStyledAttributes(r5, r1)
            int r0 = r5.getIndexCount()
            r1 = 0
        L11:
            if (r1 >= r0) goto L35
            int r2 = r5.getIndex(r1)
            int r3 = android.support.constraint.k.ConstraintLayout_Layout_constraint_referenced_ids
            if (r2 != r3) goto L25
            java.lang.String r2 = r5.getString(r2)
            r4.g = r2
            r4.setIds(r2)
            goto L32
        L25:
            int r3 = android.support.constraint.k.ConstraintLayout_Layout_constraint_referenced_tags
            if (r2 != r3) goto L32
            java.lang.String r2 = r5.getString(r2)
            r4.h = r2
            r4.setReferenceTags(r2)
        L32:
            int r1 = r1 + 1
            goto L11
        L35:
            r5.recycle()
        L38:
            return
    }

    public void b() {
            r2 = this;
            android.support.constraint.n.k.h r0 = r2.e
            if (r0 != 0) goto L5
            return
        L5:
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            boolean r1 = r0 instanceof android.support.constraint.ConstraintLayout.b
            if (r1 == 0) goto L15
            android.support.constraint.ConstraintLayout$b r0 = (android.support.constraint.ConstraintLayout.b) r0
            android.support.constraint.n.k.h r2 = r2.e
            android.support.constraint.n.k.e r2 = (android.support.constraint.n.k.e) r2
            r0.m0 = r2
        L15:
            return
    }

    public void b(android.support.constraint.ConstraintLayout r1) {
            r0 = this;
            return
    }

    public void c(android.support.constraint.ConstraintLayout r1) {
            r0 = this;
            return
    }

    public void d(android.support.constraint.ConstraintLayout r1) {
            r0 = this;
            return
    }

    public void e(android.support.constraint.ConstraintLayout r6) {
            r5 = this;
            boolean r0 = r5.isInEditMode()
            if (r0 == 0) goto Lb
            java.lang.String r0 = r5.g
            r5.setIds(r0)
        Lb:
            android.support.constraint.n.k.h r0 = r5.e
            if (r0 != 0) goto L10
            return
        L10:
            r0.a()
            r0 = 0
        L14:
            int r1 = r5.f422c
            if (r0 >= r1) goto L53
            int[] r1 = r5.f421b
            r1 = r1[r0]
            android.view.View r2 = r6.a(r1)
            if (r2 != 0) goto L45
            java.util.HashMap<java.lang.Integer, java.lang.String> r3 = r5.i
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r3 = r5.a(r6, r1)
            if (r3 == 0) goto L45
            int[] r2 = r5.f421b
            r2[r0] = r3
            java.util.HashMap<java.lang.Integer, java.lang.String> r2 = r5.i
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.put(r4, r1)
            android.view.View r2 = r6.a(r3)
        L45:
            if (r2 == 0) goto L50
            android.support.constraint.n.k.h r1 = r5.e
            android.support.constraint.n.k.e r2 = r6.a(r2)
            r1.a(r2)
        L50:
            int r0 = r0 + 1
            goto L14
        L53:
            android.support.constraint.n.k.h r5 = r5.e
            android.support.constraint.n.k.f r6 = r6.d
            r5.a(r6)
            return
    }

    public int[] getReferencedIds() {
            r1 = this;
            int[] r0 = r1.f421b
            int r1 = r1.f422c
            int[] r1 = java.util.Arrays.copyOf(r0, r1)
            return r1
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            java.lang.String r0 = r1.g
            if (r0 == 0) goto La
            r1.setIds(r0)
        La:
            java.lang.String r0 = r1.h
            if (r0 == 0) goto L11
            r1.setReferenceTags(r0)
        L11:
            return
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas r1) {
            r0 = this;
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r2, int r3) {
            r1 = this;
            boolean r0 = r1.f
            if (r0 == 0) goto L8
            super.onMeasure(r2, r3)
            goto Lc
        L8:
            r2 = 0
            r1.setMeasuredDimension(r2, r2)
        Lc:
            return
    }

    protected void setIds(java.lang.String r4) {
            r3 = this;
            r3.g = r4
            if (r4 != 0) goto L5
            return
        L5:
            r0 = 0
            r3.f422c = r0
        L8:
            r1 = 44
            int r1 = r4.indexOf(r1, r0)
            r2 = -1
            if (r1 != r2) goto L19
            java.lang.String r4 = r4.substring(r0)
            r3.a(r4)
            return
        L19:
            java.lang.String r0 = r4.substring(r0, r1)
            r3.a(r0)
            int r0 = r1 + 1
            goto L8
    }

    protected void setReferenceTags(java.lang.String r4) {
            r3 = this;
            r3.h = r4
            if (r4 != 0) goto L5
            return
        L5:
            r0 = 0
            r3.f422c = r0
        L8:
            r1 = 44
            int r1 = r4.indexOf(r1, r0)
            r2 = -1
            if (r1 != r2) goto L19
            java.lang.String r4 = r4.substring(r0)
            r3.b(r4)
            return
        L19:
            java.lang.String r0 = r4.substring(r0, r1)
            r3.b(r0)
            int r0 = r1 + 1
            goto L8
    }

    public void setReferencedIds(int[] r3) {
            r2 = this;
            r0 = 0
            r2.g = r0
            r0 = 0
            r2.f422c = r0
        L6:
            int r1 = r3.length
            if (r0 >= r1) goto L11
            r1 = r3[r0]
            r2.a(r1)
            int r0 = r0 + 1
            goto L6
        L11:
            return
    }

    @Override // android.view.View
    public void setTag(int r1, java.lang.Object r2) {
            r0 = this;
            super.setTag(r1, r2)
            if (r2 != 0) goto Lc
            java.lang.String r2 = r0.g
            if (r2 != 0) goto Lc
            r0.a(r1)
        Lc:
            return
    }
}
