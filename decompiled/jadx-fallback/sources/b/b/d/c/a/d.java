package b.b.d.c.a;

/* JADX INFO: loaded from: classes.dex */
class d extends b.b.d.c.a.b {
    private b.b.d.c.a.d.a n;
    private boolean o;

    static class a extends b.b.d.c.a.b.c {
        int[][] J;

        a(b.b.d.c.a.d.a r1, b.b.d.c.a.d r2, android.content.res.Resources r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                if (r1 == 0) goto La
                int[][] r1 = r1.J
                r0.J = r1
                goto L12
            La:
                int r1 = r0.c()
                int[][] r1 = new int[r1][]
                r0.J = r1
            L12:
                return
        }

        int a(int[] r4) {
                r3 = this;
                int[][] r0 = r3.J
                int r3 = r3.d()
                r1 = 0
            L7:
                if (r1 >= r3) goto L15
                r2 = r0[r1]
                boolean r2 = android.util.StateSet.stateSetMatches(r2, r4)
                if (r2 == 0) goto L12
                return r1
            L12:
                int r1 = r1 + 1
                goto L7
            L15:
                r3 = -1
                return r3
        }

        int a(int[] r1, android.graphics.drawable.Drawable r2) {
                r0 = this;
                int r2 = r0.a(r2)
                int[][] r0 = r0.J
                r0[r2] = r1
                return r2
        }

        @Override // b.b.d.c.a.b.c
        public void a(int r3, int r4) {
                r2 = this;
                super.a(r3, r4)
                int[][] r4 = new int[r4][]
                int[][] r0 = r2.J
                r1 = 0
                java.lang.System.arraycopy(r0, r1, r4, r1, r3)
                r2.J = r4
                return
        }

        @Override // b.b.d.c.a.b.c
        void m() {
                r4 = this;
                int[][] r0 = r4.J
                int r1 = r0.length
                int[][] r1 = new int[r1][]
                int r0 = r0.length
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L1f
                int[][] r2 = r4.J
                r3 = r2[r0]
                if (r3 == 0) goto L19
                r2 = r2[r0]
                java.lang.Object r2 = r2.clone()
                int[] r2 = (int[]) r2
                goto L1a
            L19:
                r2 = 0
            L1a:
                r1[r0] = r2
                int r0 = r0 + (-1)
                goto L8
            L1f:
                r4.J = r1
                return
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
                r2 = this;
                b.b.d.c.a.d r0 = new b.b.d.c.a.d
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r2) {
                r1 = this;
                b.b.d.c.a.d r0 = new b.b.d.c.a.d
                r0.<init>(r1, r2)
                return r0
        }
    }

    d(b.b.d.c.a.d.a r1) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L8
            r0.a(r1)
        L8:
            return
    }

    d(b.b.d.c.a.d.a r2, android.content.res.Resources r3) {
            r1 = this;
            r1.<init>()
            b.b.d.c.a.d$a r0 = new b.b.d.c.a.d$a
            r0.<init>(r2, r1, r3)
            r1.a(r0)
            int[] r2 = r1.getState()
            r1.onStateChange(r2)
            return
    }

    @Override // b.b.d.c.a.b
    /* bridge */ /* synthetic */ b.b.d.c.a.b.c a() {
            r0 = this;
            b.b.d.c.a.d$a r0 = r0.a()
            return r0
    }

    @Override // b.b.d.c.a.b
    b.b.d.c.a.d.a a() {
            r3 = this;
            b.b.d.c.a.d$a r0 = new b.b.d.c.a.d$a
            b.b.d.c.a.d$a r1 = r3.n
            r2 = 0
            r0.<init>(r1, r3, r2)
            return r0
    }

    @Override // b.b.d.c.a.b
    protected void a(b.b.d.c.a.b.c r2) {
            r1 = this;
            super.a(r2)
            boolean r0 = r2 instanceof b.b.d.c.a.d.a
            if (r0 == 0) goto Lb
            b.b.d.c.a.d$a r2 = (b.b.d.c.a.d.a) r2
            r1.n = r2
        Lb:
            return
    }

    int[] a(android.util.AttributeSet r8) {
            r7 = this;
            int r7 = r8.getAttributeCount()
            int[] r0 = new int[r7]
            r1 = 0
            r2 = r1
            r3 = r2
        L9:
            if (r2 >= r7) goto L2b
            int r4 = r8.getAttributeNameResource(r2)
            if (r4 == 0) goto L28
            r5 = 16842960(0x10100d0, float:2.369414E-38)
            if (r4 == r5) goto L28
            r5 = 16843161(0x1010199, float:2.3694704E-38)
            if (r4 == r5) goto L28
            int r5 = r3 + 1
            boolean r6 = r8.getAttributeBooleanValue(r2, r1)
            if (r6 == 0) goto L24
            goto L25
        L24:
            int r4 = -r4
        L25:
            r0[r3] = r4
            r3 = r5
        L28:
            int r2 = r2 + 1
            goto L9
        L2b:
            int[] r7 = android.util.StateSet.trimStateSet(r0, r3)
            return r7
    }

    @Override // b.b.d.c.a.b, android.graphics.drawable.Drawable
    public void applyTheme(android.content.res.Resources.Theme r1) {
            r0 = this;
            super.applyTheme(r1)
            int[] r1 = r0.getState()
            r0.onStateChange(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // b.b.d.c.a.b, android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
            r1 = this;
            boolean r0 = r1.o
            if (r0 != 0) goto L11
            super.mutate()
            if (r1 != r1) goto L11
            b.b.d.c.a.d$a r0 = r1.n
            r0.m()
            r0 = 1
            r1.o = r0
        L11:
            return r1
    }

    @Override // b.b.d.c.a.b, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] r3) {
            r2 = this;
            boolean r0 = super.onStateChange(r3)
            b.b.d.c.a.d$a r1 = r2.n
            int r3 = r1.a(r3)
            if (r3 >= 0) goto L14
            b.b.d.c.a.d$a r3 = r2.n
            int[] r1 = android.util.StateSet.WILD_CARD
            int r3 = r3.a(r1)
        L14:
            boolean r2 = r2.a(r3)
            if (r2 != 0) goto L1f
            if (r0 == 0) goto L1d
            goto L1f
        L1d:
            r2 = 0
            goto L20
        L1f:
            r2 = 1
        L20:
            return r2
    }
}
