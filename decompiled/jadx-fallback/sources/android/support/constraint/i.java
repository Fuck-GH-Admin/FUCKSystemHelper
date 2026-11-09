package android.support.constraint;

/* JADX INFO: loaded from: classes.dex */
public class i extends android.view.View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.view.View f451c;
    private int d;

    public void a(android.support.constraint.ConstraintLayout r3) {
            r2 = this;
            android.view.View r3 = r2.f451c
            if (r3 != 0) goto L5
            return
        L5:
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            android.support.constraint.ConstraintLayout$b r3 = (android.support.constraint.ConstraintLayout.b) r3
            android.view.View r2 = r2.f451c
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.support.constraint.ConstraintLayout$b r2 = (android.support.constraint.ConstraintLayout.b) r2
            android.support.constraint.n.k.e r0 = r2.m0
            r1 = 0
            r0.s(r1)
            android.support.constraint.n.k.e r0 = r3.m0
            android.support.constraint.n.k.e$b r0 = r0.n()
            android.support.constraint.n.k.e$b r1 = android.support.constraint.n.k.e.b.f495b
            if (r0 == r1) goto L2e
            android.support.constraint.n.k.e r0 = r3.m0
            android.support.constraint.n.k.e r1 = r2.m0
            int r1 = r1.C()
            r0.t(r1)
        L2e:
            android.support.constraint.n.k.e r0 = r3.m0
            android.support.constraint.n.k.e$b r0 = r0.z()
            android.support.constraint.n.k.e$b r1 = android.support.constraint.n.k.e.b.f495b
            if (r0 == r1) goto L43
            android.support.constraint.n.k.e r3 = r3.m0
            android.support.constraint.n.k.e r0 = r2.m0
            int r0 = r0.k()
            r3.l(r0)
        L43:
            android.support.constraint.n.k.e r2 = r2.m0
            r3 = 8
            r2.s(r3)
            return
    }

    public void b(android.support.constraint.ConstraintLayout r3) {
            r2 = this;
            int r0 = r2.f450b
            r1 = -1
            if (r0 != r1) goto L10
            boolean r0 = r2.isInEditMode()
            if (r0 != 0) goto L10
            int r0 = r2.d
            r2.setVisibility(r0)
        L10:
            int r0 = r2.f450b
            android.view.View r3 = r3.findViewById(r0)
            r2.f451c = r3
            if (r3 == 0) goto L2c
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            android.support.constraint.ConstraintLayout$b r3 = (android.support.constraint.ConstraintLayout.b) r3
            r0 = 1
            r3.a0 = r0
            android.view.View r3 = r2.f451c
            r0 = 0
            r3.setVisibility(r0)
            r2.setVisibility(r0)
        L2c:
            return
    }

    public android.view.View getContent() {
            r0 = this;
            android.view.View r0 = r0.f451c
            return r0
    }

    public int getEmptyVisibility() {
            r0 = this;
            int r0 = r0.d
            return r0
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas r7) {
            r6 = this;
            boolean r6 = r6.isInEditMode()
            if (r6 == 0) goto L68
            r6 = 223(0xdf, float:3.12E-43)
            r7.drawRGB(r6, r6, r6)
            android.graphics.Paint r6 = new android.graphics.Paint
            r6.<init>()
            r0 = 255(0xff, float:3.57E-43)
            r1 = 210(0xd2, float:2.94E-43)
            r6.setARGB(r0, r1, r1, r1)
            android.graphics.Paint$Align r0 = android.graphics.Paint.Align.CENTER
            r6.setTextAlign(r0)
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT
            r1 = 0
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r1)
            r6.setTypeface(r0)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.getClipBounds(r0)
            int r2 = r0.height()
            float r2 = (float) r2
            r6.setTextSize(r2)
            int r2 = r0.height()
            int r3 = r0.width()
            android.graphics.Paint$Align r4 = android.graphics.Paint.Align.LEFT
            r6.setTextAlign(r4)
            java.lang.String r4 = "?"
            r5 = 1
            r6.getTextBounds(r4, r1, r5, r0)
            float r1 = (float) r3
            r3 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r3
            int r5 = r0.width()
            float r5 = (float) r5
            float r5 = r5 / r3
            float r1 = r1 - r5
            int r5 = r0.left
            float r5 = (float) r5
            float r1 = r1 - r5
            float r2 = (float) r2
            float r2 = r2 / r3
            int r5 = r0.height()
            float r5 = (float) r5
            float r5 = r5 / r3
            float r2 = r2 + r5
            int r0 = r0.bottom
            float r0 = (float) r0
            float r2 = r2 - r0
            r7.drawText(r4, r1, r2, r6)
        L68:
            return
    }

    public void setContentId(int r3) {
            r2 = this;
            int r0 = r2.f450b
            if (r0 != r3) goto L5
            return
        L5:
            android.view.View r0 = r2.f451c
            if (r0 == 0) goto L1a
            r1 = 0
            r0.setVisibility(r1)
            android.view.View r0 = r2.f451c
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.support.constraint.ConstraintLayout$b r0 = (android.support.constraint.ConstraintLayout.b) r0
            r0.a0 = r1
            r0 = 0
            r2.f451c = r0
        L1a:
            r2.f450b = r3
            r0 = -1
            if (r3 == r0) goto L30
            android.view.ViewParent r2 = r2.getParent()
            android.view.View r2 = (android.view.View) r2
            android.view.View r2 = r2.findViewById(r3)
            if (r2 == 0) goto L30
            r3 = 8
            r2.setVisibility(r3)
        L30:
            return
    }

    public void setEmptyVisibility(int r1) {
            r0 = this;
            r0.d = r1
            return
    }
}
