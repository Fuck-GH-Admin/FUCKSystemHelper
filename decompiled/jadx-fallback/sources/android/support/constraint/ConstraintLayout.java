package android.support.constraint;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends android.view.ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    android.util.SparseArray<android.view.View> f405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.util.ArrayList<android.support.constraint.c> f406c;
    protected android.support.constraint.n.k.f d;
    private int e;
    private int f;
    private int g;
    private int h;
    protected boolean i;
    private int j;
    private android.support.constraint.e k;
    protected android.support.constraint.d l;
    private int m;
    private java.util.HashMap<java.lang.String, java.lang.Integer> n;
    private int o;
    private int p;
    private android.util.SparseArray<android.support.constraint.n.k.e> q;
    android.support.constraint.ConstraintLayout.c r;
    private int s;
    private int t;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f407a = null;

        static {
                android.support.constraint.n.k.e$b[] r0 = android.support.constraint.n.k.e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                android.support.constraint.ConstraintLayout.a.f407a = r0
                android.support.constraint.n.k.e$b r1 = android.support.constraint.n.k.e.b.f495b     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = android.support.constraint.ConstraintLayout.a.f407a     // Catch: java.lang.NoSuchFieldError -> L1d
                android.support.constraint.n.k.e$b r1 = android.support.constraint.n.k.e.b.f496c     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = android.support.constraint.ConstraintLayout.a.f407a     // Catch: java.lang.NoSuchFieldError -> L28
                android.support.constraint.n.k.e$b r1 = android.support.constraint.n.k.e.b.e     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = android.support.constraint.ConstraintLayout.a.f407a     // Catch: java.lang.NoSuchFieldError -> L33
                android.support.constraint.n.k.e$b r1 = android.support.constraint.n.k.e.b.d     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    public static class b extends android.view.ViewGroup.MarginLayoutParams {
        public float A;
        public java.lang.String B;
        int C;
        public float D;
        public float E;
        public int F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public float N;
        public float O;
        public int P;
        public int Q;
        public int R;
        public boolean S;
        public boolean T;
        public java.lang.String U;
        boolean V;
        boolean W;
        boolean X;
        boolean Y;
        boolean Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f408a;
        boolean a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f409b;
        boolean b0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f410c;
        int c0;
        public int d;
        int d0;
        public int e;
        int e0;
        public int f;
        int f0;
        public int g;
        int g0;
        public int h;
        int h0;
        public int i;
        float i0;
        public int j;
        int j0;
        public int k;
        int k0;
        public int l;
        float l0;
        public int m;
        android.support.constraint.n.k.e m0;
        public int n;
        public boolean n0;
        public float o;
        public int p;
        public int q;
        public int r;
        public int s;
        public int t;
        public int u;
        public int v;
        public int w;
        public int x;
        public int y;
        public float z;

        private static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final android.util.SparseIntArray f411a = null;

            static {
                    android.util.SparseIntArray r0 = new android.util.SparseIntArray
                    r0.<init>()
                    android.support.constraint.ConstraintLayout.b.a.f411a = r0
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf
                    r2 = 8
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_constraintLeft_toRightOf
                    r2 = 9
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_constraintRight_toLeftOf
                    r2 = 10
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_constraintRight_toRightOf
                    r2 = 11
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_constraintTop_toTopOf
                    r2 = 12
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_constraintTop_toBottomOf
                    r2 = 13
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_constraintBottom_toTopOf
                    r2 = 14
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf
                    r2 = 15
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf
                    r2 = 16
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_constraintCircle
                    r2 = 2
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_constraintCircleRadius
                    r2 = 3
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_constraintCircleAngle
                    r2 = 4
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_editor_absoluteX
                    r2 = 49
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_editor_absoluteY
                    r2 = 50
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_constraintGuide_begin
                    r2 = 5
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_constraintGuide_end
                    r2 = 6
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_constraintGuide_percent
                    r2 = 7
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_android_orientation
                    r2 = 1
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_constraintStart_toEndOf
                    r2 = 17
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_constraintStart_toStartOf
                    r2 = 18
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_constraintEnd_toStartOf
                    r2 = 19
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_constraintEnd_toEndOf
                    r2 = 20
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_goneMarginLeft
                    r2 = 21
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_goneMarginTop
                    r2 = 22
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_goneMarginRight
                    r2 = 23
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_goneMarginBottom
                    r2 = 24
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_goneMarginStart
                    r2 = 25
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_goneMarginEnd
                    r2 = 26
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_constraintHorizontal_bias
                    r2 = 29
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_constraintVertical_bias
                    r2 = 30
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_constraintDimensionRatio
                    r2 = 44
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_constraintHorizontal_weight
                    r2 = 45
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_constraintVertical_weight
                    r2 = 46
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle
                    r2 = 47
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_constraintVertical_chainStyle
                    r2 = 48
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_constrainedWidth
                    r2 = 27
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_constrainedHeight
                    r2 = 28
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_constraintWidth_default
                    r2 = 31
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_constraintHeight_default
                    r2 = 32
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_constraintWidth_min
                    r2 = 33
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_constraintWidth_max
                    r2 = 34
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_constraintWidth_percent
                    r2 = 35
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_constraintHeight_min
                    r2 = 36
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_constraintHeight_max
                    r2 = 37
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_constraintHeight_percent
                    r2 = 38
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_constraintLeft_creator
                    r2 = 39
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_constraintTop_creator
                    r2 = 40
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_constraintRight_creator
                    r2 = 41
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_constraintBottom_creator
                    r2 = 42
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_constraintBaseline_creator
                    r2 = 43
                    r0.append(r1, r2)
                    android.util.SparseIntArray r0 = android.support.constraint.ConstraintLayout.b.a.f411a
                    int r1 = android.support.constraint.k.ConstraintLayout_Layout_layout_constraintTag
                    r2 = 51
                    r0.append(r1, r2)
                    return
            }
        }

        public b(int r5, int r6) {
                r4 = this;
                r4.<init>(r5, r6)
                r5 = -1
                r4.f408a = r5
                r4.f409b = r5
                r6 = -1082130432(0xffffffffbf800000, float:-1.0)
                r4.f410c = r6
                r4.d = r5
                r4.e = r5
                r4.f = r5
                r4.g = r5
                r4.h = r5
                r4.i = r5
                r4.j = r5
                r4.k = r5
                r4.l = r5
                r4.m = r5
                r0 = 0
                r4.n = r0
                r1 = 0
                r4.o = r1
                r4.p = r5
                r4.q = r5
                r4.r = r5
                r4.s = r5
                r4.t = r5
                r4.u = r5
                r4.v = r5
                r4.w = r5
                r4.x = r5
                r4.y = r5
                r1 = 1056964608(0x3f000000, float:0.5)
                r4.z = r1
                r4.A = r1
                r2 = 0
                r4.B = r2
                r3 = 1
                r4.C = r3
                r4.D = r6
                r4.E = r6
                r4.F = r0
                r4.G = r0
                r4.H = r0
                r4.I = r0
                r4.J = r0
                r4.K = r0
                r4.L = r0
                r4.M = r0
                r6 = 1065353216(0x3f800000, float:1.0)
                r4.N = r6
                r4.O = r6
                r4.P = r5
                r4.Q = r5
                r4.R = r5
                r4.S = r0
                r4.T = r0
                r4.U = r2
                r4.V = r3
                r4.W = r3
                r4.X = r0
                r4.Y = r0
                r4.Z = r0
                r4.a0 = r0
                r4.b0 = r0
                r4.c0 = r5
                r4.d0 = r5
                r4.e0 = r5
                r4.f0 = r5
                r4.g0 = r5
                r4.h0 = r5
                r4.i0 = r1
                android.support.constraint.n.k.e r5 = new android.support.constraint.n.k.e
                r5.<init>()
                r4.m0 = r5
                return
        }

        public b(android.content.Context r11, android.util.AttributeSet r12) {
                r10 = this;
                r10.<init>(r11, r12)
                r0 = -1
                r10.f408a = r0
                r10.f409b = r0
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
                r10.f410c = r1
                r10.d = r0
                r10.e = r0
                r10.f = r0
                r10.g = r0
                r10.h = r0
                r10.i = r0
                r10.j = r0
                r10.k = r0
                r10.l = r0
                r10.m = r0
                r2 = 0
                r10.n = r2
                r3 = 0
                r10.o = r3
                r10.p = r0
                r10.q = r0
                r10.r = r0
                r10.s = r0
                r10.t = r0
                r10.u = r0
                r10.v = r0
                r10.w = r0
                r10.x = r0
                r10.y = r0
                r4 = 1056964608(0x3f000000, float:0.5)
                r10.z = r4
                r10.A = r4
                r5 = 0
                r10.B = r5
                r6 = 1
                r10.C = r6
                r10.D = r1
                r10.E = r1
                r10.F = r2
                r10.G = r2
                r10.H = r2
                r10.I = r2
                r10.J = r2
                r10.K = r2
                r10.L = r2
                r10.M = r2
                r1 = 1065353216(0x3f800000, float:1.0)
                r10.N = r1
                r10.O = r1
                r10.P = r0
                r10.Q = r0
                r10.R = r0
                r10.S = r2
                r10.T = r2
                r10.U = r5
                r10.V = r6
                r10.W = r6
                r10.X = r2
                r10.Y = r2
                r10.Z = r2
                r10.a0 = r2
                r10.b0 = r2
                r10.c0 = r0
                r10.d0 = r0
                r10.e0 = r0
                r10.f0 = r0
                r10.g0 = r0
                r10.h0 = r0
                r10.i0 = r4
                android.support.constraint.n.k.e r1 = new android.support.constraint.n.k.e
                r1.<init>()
                r10.m0 = r1
                int[] r1 = android.support.constraint.k.ConstraintLayout_Layout
                android.content.res.TypedArray r11 = r11.obtainStyledAttributes(r12, r1)
                int r12 = r11.getIndexCount()
                r1 = r2
            L9a:
                if (r1 >= r12) goto L3ba
                int r4 = r11.getIndex(r1)
                android.util.SparseIntArray r5 = android.support.constraint.ConstraintLayout.b.a.f411a
                int r5 = r5.get(r4)
                java.lang.String r7 = "ConstraintLayout"
                r8 = 2
                r9 = -2
                switch(r5) {
                    case 1: goto L3ae;
                    case 2: goto L39d;
                    case 3: goto L394;
                    case 4: goto L37f;
                    case 5: goto L376;
                    case 6: goto L36d;
                    case 7: goto L364;
                    case 8: goto L353;
                    case 9: goto L342;
                    case 10: goto L330;
                    case 11: goto L31e;
                    case 12: goto L30c;
                    case 13: goto L2fa;
                    case 14: goto L2e8;
                    case 15: goto L2d6;
                    case 16: goto L2c4;
                    case 17: goto L2b2;
                    case 18: goto L2a0;
                    case 19: goto L28e;
                    case 20: goto L27c;
                    case 21: goto L272;
                    case 22: goto L268;
                    case 23: goto L25e;
                    case 24: goto L254;
                    case 25: goto L24a;
                    case 26: goto L240;
                    case 27: goto L236;
                    case 28: goto L22c;
                    case 29: goto L222;
                    case 30: goto L218;
                    case 31: goto L209;
                    case 32: goto L1fe;
                    case 33: goto L1e8;
                    case 34: goto L1d2;
                    case 35: goto L1c2;
                    case 36: goto L1ac;
                    case 37: goto L196;
                    case 38: goto L186;
                    default: goto Lad;
                }
            Lad:
                switch(r5) {
                    case 44: goto Lf2;
                    case 45: goto Le8;
                    case 46: goto Lde;
                    case 47: goto Ld6;
                    case 48: goto Lce;
                    case 49: goto Lc4;
                    case 50: goto Lba;
                    case 51: goto Lb2;
                    default: goto Lb0;
                }
            Lb0:
                goto L3b6
            Lb2:
                java.lang.String r4 = r11.getString(r4)
                r10.U = r4
                goto L3b6
            Lba:
                int r5 = r10.Q
                int r4 = r11.getDimensionPixelOffset(r4, r5)
                r10.Q = r4
                goto L3b6
            Lc4:
                int r5 = r10.P
                int r4 = r11.getDimensionPixelOffset(r4, r5)
                r10.P = r4
                goto L3b6
            Lce:
                int r4 = r11.getInt(r4, r2)
                r10.G = r4
                goto L3b6
            Ld6:
                int r4 = r11.getInt(r4, r2)
                r10.F = r4
                goto L3b6
            Lde:
                float r5 = r10.E
                float r4 = r11.getFloat(r4, r5)
                r10.E = r4
                goto L3b6
            Le8:
                float r5 = r10.D
                float r4 = r11.getFloat(r4, r5)
                r10.D = r4
                goto L3b6
            Lf2:
                java.lang.String r4 = r11.getString(r4)
                r10.B = r4
                r10.C = r0
                if (r4 == 0) goto L3b6
                int r4 = r4.length()
                java.lang.String r5 = r10.B
                r7 = 44
                int r5 = r5.indexOf(r7)
                if (r5 <= 0) goto L12c
                int r7 = r4 + (-1)
                if (r5 >= r7) goto L12c
                java.lang.String r7 = r10.B
                java.lang.String r7 = r7.substring(r2, r5)
                java.lang.String r8 = "W"
                boolean r8 = r7.equalsIgnoreCase(r8)
                if (r8 == 0) goto L11f
                r10.C = r2
                goto L129
            L11f:
                java.lang.String r8 = "H"
                boolean r7 = r7.equalsIgnoreCase(r8)
                if (r7 == 0) goto L129
                r10.C = r6
            L129:
                int r5 = r5 + 1
                goto L12d
            L12c:
                r5 = r2
            L12d:
                java.lang.String r7 = r10.B
                r8 = 58
                int r7 = r7.indexOf(r8)
                if (r7 < 0) goto L175
                int r4 = r4 + (-1)
                if (r7 >= r4) goto L175
                java.lang.String r4 = r10.B
                java.lang.String r4 = r4.substring(r5, r7)
                java.lang.String r5 = r10.B
                int r7 = r7 + 1
                java.lang.String r5 = r5.substring(r7)
                int r7 = r4.length()
                if (r7 <= 0) goto L3b6
                int r7 = r5.length()
                if (r7 <= 0) goto L3b6
                float r4 = java.lang.Float.parseFloat(r4)     // Catch: java.lang.NumberFormatException -> L3b6
                float r5 = java.lang.Float.parseFloat(r5)     // Catch: java.lang.NumberFormatException -> L3b6
                int r7 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r7 <= 0) goto L3b6
                int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r7 <= 0) goto L3b6
                int r7 = r10.C     // Catch: java.lang.NumberFormatException -> L3b6
                if (r7 != r6) goto L16f
                float r5 = r5 / r4
                java.lang.Math.abs(r5)     // Catch: java.lang.NumberFormatException -> L3b6
                goto L3b6
            L16f:
                float r4 = r4 / r5
                java.lang.Math.abs(r4)     // Catch: java.lang.NumberFormatException -> L3b6
                goto L3b6
            L175:
                java.lang.String r4 = r10.B
                java.lang.String r4 = r4.substring(r5)
                int r5 = r4.length()
                if (r5 <= 0) goto L3b6
                java.lang.Float.parseFloat(r4)     // Catch: java.lang.NumberFormatException -> L3b6
                goto L3b6
            L186:
                float r5 = r10.O
                float r4 = r11.getFloat(r4, r5)
                float r4 = java.lang.Math.max(r3, r4)
                r10.O = r4
                r10.I = r8
                goto L3b6
            L196:
                int r5 = r10.M     // Catch: java.lang.Exception -> L1a0
                int r5 = r11.getDimensionPixelSize(r4, r5)     // Catch: java.lang.Exception -> L1a0
                r10.M = r5     // Catch: java.lang.Exception -> L1a0
                goto L3b6
            L1a0:
                int r5 = r10.M
                int r4 = r11.getInt(r4, r5)
                if (r4 != r9) goto L3b6
                r10.M = r9
                goto L3b6
            L1ac:
                int r5 = r10.K     // Catch: java.lang.Exception -> L1b6
                int r5 = r11.getDimensionPixelSize(r4, r5)     // Catch: java.lang.Exception -> L1b6
                r10.K = r5     // Catch: java.lang.Exception -> L1b6
                goto L3b6
            L1b6:
                int r5 = r10.K
                int r4 = r11.getInt(r4, r5)
                if (r4 != r9) goto L3b6
                r10.K = r9
                goto L3b6
            L1c2:
                float r5 = r10.N
                float r4 = r11.getFloat(r4, r5)
                float r4 = java.lang.Math.max(r3, r4)
                r10.N = r4
                r10.H = r8
                goto L3b6
            L1d2:
                int r5 = r10.L     // Catch: java.lang.Exception -> L1dc
                int r5 = r11.getDimensionPixelSize(r4, r5)     // Catch: java.lang.Exception -> L1dc
                r10.L = r5     // Catch: java.lang.Exception -> L1dc
                goto L3b6
            L1dc:
                int r5 = r10.L
                int r4 = r11.getInt(r4, r5)
                if (r4 != r9) goto L3b6
                r10.L = r9
                goto L3b6
            L1e8:
                int r5 = r10.J     // Catch: java.lang.Exception -> L1f2
                int r5 = r11.getDimensionPixelSize(r4, r5)     // Catch: java.lang.Exception -> L1f2
                r10.J = r5     // Catch: java.lang.Exception -> L1f2
                goto L3b6
            L1f2:
                int r5 = r10.J
                int r4 = r11.getInt(r4, r5)
                if (r4 != r9) goto L3b6
                r10.J = r9
                goto L3b6
            L1fe:
                int r4 = r11.getInt(r4, r2)
                r10.I = r4
                if (r4 != r6) goto L3b6
                java.lang.String r4 = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead."
                goto L213
            L209:
                int r4 = r11.getInt(r4, r2)
                r10.H = r4
                if (r4 != r6) goto L3b6
                java.lang.String r4 = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead."
            L213:
                android.util.Log.e(r7, r4)
                goto L3b6
            L218:
                float r5 = r10.A
                float r4 = r11.getFloat(r4, r5)
                r10.A = r4
                goto L3b6
            L222:
                float r5 = r10.z
                float r4 = r11.getFloat(r4, r5)
                r10.z = r4
                goto L3b6
            L22c:
                boolean r5 = r10.T
                boolean r4 = r11.getBoolean(r4, r5)
                r10.T = r4
                goto L3b6
            L236:
                boolean r5 = r10.S
                boolean r4 = r11.getBoolean(r4, r5)
                r10.S = r4
                goto L3b6
            L240:
                int r5 = r10.y
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.y = r4
                goto L3b6
            L24a:
                int r5 = r10.x
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.x = r4
                goto L3b6
            L254:
                int r5 = r10.w
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.w = r4
                goto L3b6
            L25e:
                int r5 = r10.v
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.v = r4
                goto L3b6
            L268:
                int r5 = r10.u
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.u = r4
                goto L3b6
            L272:
                int r5 = r10.t
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.t = r4
                goto L3b6
            L27c:
                int r5 = r10.s
                int r5 = r11.getResourceId(r4, r5)
                r10.s = r5
                if (r5 != r0) goto L3b6
                int r4 = r11.getInt(r4, r0)
                r10.s = r4
                goto L3b6
            L28e:
                int r5 = r10.r
                int r5 = r11.getResourceId(r4, r5)
                r10.r = r5
                if (r5 != r0) goto L3b6
                int r4 = r11.getInt(r4, r0)
                r10.r = r4
                goto L3b6
            L2a0:
                int r5 = r10.q
                int r5 = r11.getResourceId(r4, r5)
                r10.q = r5
                if (r5 != r0) goto L3b6
                int r4 = r11.getInt(r4, r0)
                r10.q = r4
                goto L3b6
            L2b2:
                int r5 = r10.p
                int r5 = r11.getResourceId(r4, r5)
                r10.p = r5
                if (r5 != r0) goto L3b6
                int r4 = r11.getInt(r4, r0)
                r10.p = r4
                goto L3b6
            L2c4:
                int r5 = r10.l
                int r5 = r11.getResourceId(r4, r5)
                r10.l = r5
                if (r5 != r0) goto L3b6
                int r4 = r11.getInt(r4, r0)
                r10.l = r4
                goto L3b6
            L2d6:
                int r5 = r10.k
                int r5 = r11.getResourceId(r4, r5)
                r10.k = r5
                if (r5 != r0) goto L3b6
                int r4 = r11.getInt(r4, r0)
                r10.k = r4
                goto L3b6
            L2e8:
                int r5 = r10.j
                int r5 = r11.getResourceId(r4, r5)
                r10.j = r5
                if (r5 != r0) goto L3b6
                int r4 = r11.getInt(r4, r0)
                r10.j = r4
                goto L3b6
            L2fa:
                int r5 = r10.i
                int r5 = r11.getResourceId(r4, r5)
                r10.i = r5
                if (r5 != r0) goto L3b6
                int r4 = r11.getInt(r4, r0)
                r10.i = r4
                goto L3b6
            L30c:
                int r5 = r10.h
                int r5 = r11.getResourceId(r4, r5)
                r10.h = r5
                if (r5 != r0) goto L3b6
                int r4 = r11.getInt(r4, r0)
                r10.h = r4
                goto L3b6
            L31e:
                int r5 = r10.g
                int r5 = r11.getResourceId(r4, r5)
                r10.g = r5
                if (r5 != r0) goto L3b6
                int r4 = r11.getInt(r4, r0)
                r10.g = r4
                goto L3b6
            L330:
                int r5 = r10.f
                int r5 = r11.getResourceId(r4, r5)
                r10.f = r5
                if (r5 != r0) goto L3b6
                int r4 = r11.getInt(r4, r0)
                r10.f = r4
                goto L3b6
            L342:
                int r5 = r10.e
                int r5 = r11.getResourceId(r4, r5)
                r10.e = r5
                if (r5 != r0) goto L3b6
                int r4 = r11.getInt(r4, r0)
                r10.e = r4
                goto L3b6
            L353:
                int r5 = r10.d
                int r5 = r11.getResourceId(r4, r5)
                r10.d = r5
                if (r5 != r0) goto L3b6
                int r4 = r11.getInt(r4, r0)
                r10.d = r4
                goto L3b6
            L364:
                float r5 = r10.f410c
                float r4 = r11.getFloat(r4, r5)
                r10.f410c = r4
                goto L3b6
            L36d:
                int r5 = r10.f409b
                int r4 = r11.getDimensionPixelOffset(r4, r5)
                r10.f409b = r4
                goto L3b6
            L376:
                int r5 = r10.f408a
                int r4 = r11.getDimensionPixelOffset(r4, r5)
                r10.f408a = r4
                goto L3b6
            L37f:
                float r5 = r10.o
                float r4 = r11.getFloat(r4, r5)
                r5 = 1135869952(0x43b40000, float:360.0)
                float r4 = r4 % r5
                r10.o = r4
                int r7 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r7 >= 0) goto L3b6
                float r4 = r5 - r4
                float r4 = r4 % r5
                r10.o = r4
                goto L3b6
            L394:
                int r5 = r10.n
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.n = r4
                goto L3b6
            L39d:
                int r5 = r10.m
                int r5 = r11.getResourceId(r4, r5)
                r10.m = r5
                if (r5 != r0) goto L3b6
                int r4 = r11.getInt(r4, r0)
                r10.m = r4
                goto L3b6
            L3ae:
                int r5 = r10.R
                int r4 = r11.getInt(r4, r5)
                r10.R = r4
            L3b6:
                int r1 = r1 + 1
                goto L9a
            L3ba:
                r11.recycle()
                r10.a()
                return
        }

        public b(android.view.ViewGroup.LayoutParams r6) {
                r5 = this;
                r5.<init>(r6)
                r6 = -1
                r5.f408a = r6
                r5.f409b = r6
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                r5.f410c = r0
                r5.d = r6
                r5.e = r6
                r5.f = r6
                r5.g = r6
                r5.h = r6
                r5.i = r6
                r5.j = r6
                r5.k = r6
                r5.l = r6
                r5.m = r6
                r1 = 0
                r5.n = r1
                r2 = 0
                r5.o = r2
                r5.p = r6
                r5.q = r6
                r5.r = r6
                r5.s = r6
                r5.t = r6
                r5.u = r6
                r5.v = r6
                r5.w = r6
                r5.x = r6
                r5.y = r6
                r2 = 1056964608(0x3f000000, float:0.5)
                r5.z = r2
                r5.A = r2
                r3 = 0
                r5.B = r3
                r4 = 1
                r5.C = r4
                r5.D = r0
                r5.E = r0
                r5.F = r1
                r5.G = r1
                r5.H = r1
                r5.I = r1
                r5.J = r1
                r5.K = r1
                r5.L = r1
                r5.M = r1
                r0 = 1065353216(0x3f800000, float:1.0)
                r5.N = r0
                r5.O = r0
                r5.P = r6
                r5.Q = r6
                r5.R = r6
                r5.S = r1
                r5.T = r1
                r5.U = r3
                r5.V = r4
                r5.W = r4
                r5.X = r1
                r5.Y = r1
                r5.Z = r1
                r5.a0 = r1
                r5.b0 = r1
                r5.c0 = r6
                r5.d0 = r6
                r5.e0 = r6
                r5.f0 = r6
                r5.g0 = r6
                r5.h0 = r6
                r5.i0 = r2
                android.support.constraint.n.k.e r6 = new android.support.constraint.n.k.e
                r6.<init>()
                r5.m0 = r6
                return
        }

        public void a() {
                r5 = this;
                r0 = 0
                r5.Y = r0
                r1 = 1
                r5.V = r1
                r5.W = r1
                int r2 = r5.width
                r3 = -2
                if (r2 != r3) goto L19
                boolean r2 = r5.S
                if (r2 == 0) goto L19
                r5.V = r0
                int r2 = r5.H
                if (r2 != 0) goto L19
                r5.H = r1
            L19:
                int r2 = r5.height
                if (r2 != r3) goto L29
                boolean r2 = r5.T
                if (r2 == 0) goto L29
                r5.W = r0
                int r2 = r5.I
                if (r2 != 0) goto L29
                r5.I = r1
            L29:
                int r2 = r5.width
                r4 = -1
                if (r2 == 0) goto L30
                if (r2 != r4) goto L3e
            L30:
                r5.V = r0
                int r2 = r5.width
                if (r2 != 0) goto L3e
                int r2 = r5.H
                if (r2 != r1) goto L3e
                r5.width = r3
                r5.S = r1
            L3e:
                int r2 = r5.height
                if (r2 == 0) goto L44
                if (r2 != r4) goto L52
            L44:
                r5.W = r0
                int r0 = r5.height
                if (r0 != 0) goto L52
                int r0 = r5.I
                if (r0 != r1) goto L52
                r5.height = r3
                r5.T = r1
            L52:
                float r0 = r5.f410c
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L62
                int r0 = r5.f408a
                if (r0 != r4) goto L62
                int r0 = r5.f409b
                if (r0 == r4) goto L7e
            L62:
                r5.Y = r1
                r5.V = r1
                r5.W = r1
                android.support.constraint.n.k.e r0 = r5.m0
                boolean r0 = r0 instanceof android.support.constraint.n.k.g
                if (r0 != 0) goto L75
                android.support.constraint.n.k.g r0 = new android.support.constraint.n.k.g
                r0.<init>()
                r5.m0 = r0
            L75:
                android.support.constraint.n.k.e r0 = r5.m0
                android.support.constraint.n.k.g r0 = (android.support.constraint.n.k.g) r0
                int r5 = r5.R
                r0.z(r5)
            L7e:
                return
        }

        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        public void resolveLayoutDirection(int r7) {
                r6 = this;
                int r0 = r6.leftMargin
                int r1 = r6.rightMargin
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 0
                r4 = 1
                r5 = 17
                if (r2 < r5) goto L17
                super.resolveLayoutDirection(r7)
                int r7 = r6.getLayoutDirection()
                if (r4 != r7) goto L17
                r7 = r4
                goto L18
            L17:
                r7 = r3
            L18:
                r2 = -1
                r6.e0 = r2
                r6.f0 = r2
                r6.c0 = r2
                r6.d0 = r2
                r6.g0 = r2
                r6.h0 = r2
                int r5 = r6.t
                r6.g0 = r5
                int r5 = r6.v
                r6.h0 = r5
                float r5 = r6.z
                r6.i0 = r5
                int r5 = r6.f408a
                r6.j0 = r5
                int r5 = r6.f409b
                r6.k0 = r5
                float r5 = r6.f410c
                r6.l0 = r5
                if (r7 == 0) goto L9e
                int r7 = r6.p
                if (r7 == r2) goto L47
                r6.e0 = r7
            L45:
                r3 = r4
                goto L4e
            L47:
                int r7 = r6.q
                if (r7 == r2) goto L4e
                r6.f0 = r7
                goto L45
            L4e:
                int r7 = r6.r
                if (r7 == r2) goto L55
                r6.d0 = r7
                r3 = r4
            L55:
                int r7 = r6.s
                if (r7 == r2) goto L5c
                r6.c0 = r7
                r3 = r4
            L5c:
                int r7 = r6.x
                if (r7 == r2) goto L62
                r6.h0 = r7
            L62:
                int r7 = r6.y
                if (r7 == r2) goto L68
                r6.g0 = r7
            L68:
                r7 = 1065353216(0x3f800000, float:1.0)
                if (r3 == 0) goto L72
                float r3 = r6.z
                float r3 = r7 - r3
                r6.i0 = r3
            L72:
                boolean r3 = r6.Y
                if (r3 == 0) goto Lc2
                int r3 = r6.R
                if (r3 != r4) goto Lc2
                float r3 = r6.f410c
                r4 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r5 == 0) goto L8a
                float r7 = r7 - r3
                r6.l0 = r7
                r6.j0 = r2
                r6.k0 = r2
                goto Lc2
            L8a:
                int r7 = r6.f408a
                if (r7 == r2) goto L95
                r6.k0 = r7
                r6.j0 = r2
            L92:
                r6.l0 = r4
                goto Lc2
            L95:
                int r7 = r6.f409b
                if (r7 == r2) goto Lc2
                r6.j0 = r7
                r6.k0 = r2
                goto L92
            L9e:
                int r7 = r6.p
                if (r7 == r2) goto La4
                r6.d0 = r7
            La4:
                int r7 = r6.q
                if (r7 == r2) goto Laa
                r6.c0 = r7
            Laa:
                int r7 = r6.r
                if (r7 == r2) goto Lb0
                r6.e0 = r7
            Lb0:
                int r7 = r6.s
                if (r7 == r2) goto Lb6
                r6.f0 = r7
            Lb6:
                int r7 = r6.x
                if (r7 == r2) goto Lbc
                r6.g0 = r7
            Lbc:
                int r7 = r6.y
                if (r7 == r2) goto Lc2
                r6.h0 = r7
            Lc2:
                int r7 = r6.r
                if (r7 != r2) goto L10a
                int r7 = r6.s
                if (r7 != r2) goto L10a
                int r7 = r6.q
                if (r7 != r2) goto L10a
                int r7 = r6.p
                if (r7 != r2) goto L10a
                int r7 = r6.f
                if (r7 == r2) goto Le1
                r6.e0 = r7
                int r7 = r6.rightMargin
                if (r7 > 0) goto Lee
                if (r1 <= 0) goto Lee
            Lde:
                r6.rightMargin = r1
                goto Lee
            Le1:
                int r7 = r6.g
                if (r7 == r2) goto Lee
                r6.f0 = r7
                int r7 = r6.rightMargin
                if (r7 > 0) goto Lee
                if (r1 <= 0) goto Lee
                goto Lde
            Lee:
                int r7 = r6.d
                if (r7 == r2) goto Lfd
                r6.c0 = r7
                int r7 = r6.leftMargin
                if (r7 > 0) goto L10a
                if (r0 <= 0) goto L10a
            Lfa:
                r6.leftMargin = r0
                goto L10a
            Lfd:
                int r7 = r6.e
                if (r7 == r2) goto L10a
                r6.d0 = r7
                int r7 = r6.leftMargin
                if (r7 > 0) goto L10a
                if (r0 <= 0) goto L10a
                goto Lfa
            L10a:
                return
        }
    }

    class c implements android.support.constraint.n.k.m.b.InterfaceC0025b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        android.support.constraint.ConstraintLayout f412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f413b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f414c;
        int d;
        int e;
        int f;
        int g;
        final /* synthetic */ android.support.constraint.ConstraintLayout h;

        public c(android.support.constraint.ConstraintLayout r1, android.support.constraint.ConstraintLayout r2) {
                r0 = this;
                r0.h = r1
                r0.<init>()
                r0.f412a = r2
                return
        }

        private boolean a(int r3, int r4, int r5) {
                r2 = this;
                r2 = 1
                if (r3 != r4) goto L4
                return r2
            L4:
                int r0 = android.view.View.MeasureSpec.getMode(r3)
                android.view.View.MeasureSpec.getSize(r3)
                int r3 = android.view.View.MeasureSpec.getMode(r4)
                int r4 = android.view.View.MeasureSpec.getSize(r4)
                r1 = 1073741824(0x40000000, float:2.0)
                if (r3 != r1) goto L20
                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r0 == r3) goto L1d
                if (r0 != 0) goto L20
            L1d:
                if (r5 != r4) goto L20
                return r2
            L20:
                r2 = 0
                return r2
        }

        @Override // android.support.constraint.n.k.m.b.InterfaceC0025b
        public final void a() {
                r5 = this;
                android.support.constraint.ConstraintLayout r0 = r5.f412a
                int r0 = r0.getChildCount()
                r1 = 0
                r2 = r1
            L8:
                if (r2 >= r0) goto L1e
                android.support.constraint.ConstraintLayout r3 = r5.f412a
                android.view.View r3 = r3.getChildAt(r2)
                boolean r4 = r3 instanceof android.support.constraint.i
                if (r4 == 0) goto L1b
                android.support.constraint.i r3 = (android.support.constraint.i) r3
                android.support.constraint.ConstraintLayout r4 = r5.f412a
                r3.a(r4)
            L1b:
                int r2 = r2 + 1
                goto L8
            L1e:
                android.support.constraint.ConstraintLayout r0 = r5.f412a
                java.util.ArrayList r0 = android.support.constraint.ConstraintLayout.b(r0)
                int r0 = r0.size()
                if (r0 <= 0) goto L40
            L2a:
                if (r1 >= r0) goto L40
                android.support.constraint.ConstraintLayout r2 = r5.f412a
                java.util.ArrayList r2 = android.support.constraint.ConstraintLayout.b(r2)
                java.lang.Object r2 = r2.get(r1)
                android.support.constraint.c r2 = (android.support.constraint.c) r2
                android.support.constraint.ConstraintLayout r3 = r5.f412a
                r2.c(r3)
                int r1 = r1 + 1
                goto L2a
            L40:
                return
        }

        public void a(int r1, int r2, int r3, int r4, int r5, int r6) {
                r0 = this;
                r0.f413b = r3
                r0.f414c = r4
                r0.d = r5
                r0.e = r6
                r0.f = r1
                r0.g = r2
                return
        }

        @Override // android.support.constraint.n.k.m.b.InterfaceC0025b
        @android.annotation.SuppressLint({"WrongCall"})
        public final void a(android.support.constraint.n.k.e r18, android.support.constraint.n.k.m.b.a r19) {
                r17 = this;
                r0 = r17
                r1 = r18
                r2 = r19
                if (r1 != 0) goto L9
                return
            L9:
                int r3 = r18.B()
                r4 = 8
                r5 = 0
                if (r3 != r4) goto L1f
                boolean r3 = r18.I()
                if (r3 != 0) goto L1f
                r2.e = r5
                r2.f = r5
                r2.g = r5
                return
            L1f:
                android.support.constraint.n.k.e r3 = r18.v()
                if (r3 != 0) goto L26
                return
            L26:
                android.support.constraint.n.k.e$b r3 = r2.f502a
                android.support.constraint.n.k.e$b r4 = r2.f503b
                int r6 = r2.f504c
                int r7 = r2.d
                int r8 = r0.f413b
                int r9 = r0.f414c
                int r8 = r8 + r9
                int r9 = r0.d
                java.lang.Object r10 = r18.g()
                android.view.View r10 = (android.view.View) r10
                int[] r11 = android.support.constraint.ConstraintLayout.a.f407a
                int r12 = r3.ordinal()
                r11 = r11[r12]
                r12 = 4
                r13 = 3
                r14 = 2
                r5 = -2
                r15 = 1
                if (r11 == r15) goto Lac
                if (r11 == r14) goto La5
                if (r11 == r13) goto L98
                if (r11 == r12) goto L53
                r6 = 0
                goto Lb2
            L53:
                int r6 = r0.f
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r5)
                int r9 = r1.n
                if (r9 != r15) goto L5f
                r9 = r15
                goto L60
            L5f:
                r9 = 0
            L60:
                int r11 = r2.j
                int r12 = android.support.constraint.n.k.m.b.a.l
                if (r11 == r12) goto L6a
                int r12 = android.support.constraint.n.k.m.b.a.m
                if (r11 != r12) goto Lb2
            L6a:
                int r11 = r10.getMeasuredHeight()
                int r12 = r18.k()
                if (r11 != r12) goto L76
                r11 = r15
                goto L77
            L76:
                r11 = 0
            L77:
                int r12 = r2.j
                int r13 = android.support.constraint.n.k.m.b.a.m
                if (r12 == r13) goto L90
                if (r9 == 0) goto L90
                if (r9 == 0) goto L83
                if (r11 != 0) goto L90
            L83:
                boolean r9 = r10 instanceof android.support.constraint.i
                if (r9 != 0) goto L90
                boolean r9 = r18.M()
                if (r9 == 0) goto L8e
                goto L90
            L8e:
                r9 = 0
                goto L91
            L90:
                r9 = r15
            L91:
                if (r9 == 0) goto Lb2
                int r6 = r18.C()
                goto Lac
            L98:
                int r6 = r0.f
                int r11 = r18.o()
                int r9 = r9 + r11
                r11 = -1
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r11)
                goto Lb2
            La5:
                int r6 = r0.f
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r5)
                goto Lb2
            Lac:
                r9 = 1073741824(0x40000000, float:2.0)
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9)
            Lb2:
                int[] r9 = android.support.constraint.ConstraintLayout.a.f407a
                int r11 = r4.ordinal()
                r9 = r9[r11]
                if (r9 == r15) goto L126
                if (r9 == r14) goto L11f
                r7 = 3
                if (r9 == r7) goto L112
                r7 = 4
                if (r9 == r7) goto Lc7
                r5 = 0
                goto L12d
            Lc7:
                int r7 = r0.g
                int r5 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r5)
                int r7 = r1.o
                if (r7 != r15) goto Ld3
                r7 = r15
                goto Ld4
            Ld3:
                r7 = 0
            Ld4:
                int r8 = r2.j
                int r9 = android.support.constraint.n.k.m.b.a.l
                if (r8 == r9) goto Lde
                int r9 = android.support.constraint.n.k.m.b.a.m
                if (r8 != r9) goto L12d
            Lde:
                int r8 = r10.getMeasuredWidth()
                int r9 = r18.C()
                if (r8 != r9) goto Lea
                r8 = r15
                goto Leb
            Lea:
                r8 = 0
            Leb:
                int r9 = r2.j
                int r11 = android.support.constraint.n.k.m.b.a.m
                if (r9 == r11) goto L104
                if (r7 == 0) goto L104
                if (r7 == 0) goto Lf7
                if (r8 != 0) goto L104
            Lf7:
                boolean r7 = r10 instanceof android.support.constraint.i
                if (r7 != 0) goto L104
                boolean r7 = r18.N()
                if (r7 == 0) goto L102
                goto L104
            L102:
                r7 = 0
                goto L105
            L104:
                r7 = r15
            L105:
                if (r7 == 0) goto L12d
                int r5 = r18.k()
                r7 = 1073741824(0x40000000, float:2.0)
                int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r7)
                goto L12d
            L112:
                int r5 = r0.g
                int r7 = r18.A()
                int r8 = r8 + r7
                r7 = -1
                int r5 = android.view.ViewGroup.getChildMeasureSpec(r5, r8, r7)
                goto L12d
            L11f:
                int r7 = r0.g
                int r5 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r5)
                goto L12d
            L126:
                r5 = 1073741824(0x40000000, float:2.0)
                int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                r5 = r7
            L12d:
                android.support.constraint.n.k.e r7 = r18.v()
                android.support.constraint.n.k.f r7 = (android.support.constraint.n.k.f) r7
                if (r7 == 0) goto L1af
                android.support.constraint.ConstraintLayout r8 = r0.h
                int r8 = android.support.constraint.ConstraintLayout.a(r8)
                r9 = 256(0x100, float:3.59E-43)
                boolean r8 = android.support.constraint.n.k.j.a(r8, r9)
                if (r8 == 0) goto L1af
                int r8 = r10.getMeasuredWidth()
                int r9 = r18.C()
                if (r8 != r9) goto L1af
                int r8 = r10.getMeasuredWidth()
                int r9 = r7.C()
                if (r8 >= r9) goto L1af
                int r8 = r10.getMeasuredHeight()
                int r9 = r18.k()
                if (r8 != r9) goto L1af
                int r8 = r10.getMeasuredHeight()
                int r7 = r7.k()
                if (r8 >= r7) goto L1af
                int r7 = r10.getBaseline()
                int r8 = r18.e()
                if (r7 != r8) goto L1af
                boolean r7 = r18.L()
                if (r7 != 0) goto L1af
                int r7 = r18.p()
                int r8 = r18.C()
                boolean r7 = r0.a(r7, r6, r8)
                if (r7 == 0) goto L199
                int r7 = r18.q()
                int r8 = r18.k()
                boolean r7 = r0.a(r7, r5, r8)
                if (r7 == 0) goto L199
                r7 = r15
                goto L19a
            L199:
                r7 = 0
            L19a:
                if (r7 == 0) goto L1af
                int r0 = r18.C()
                r2.e = r0
                int r0 = r18.k()
                r2.f = r0
                int r0 = r18.e()
                r2.g = r0
                return
            L1af:
                android.support.constraint.n.k.e$b r7 = android.support.constraint.n.k.e.b.d
                if (r3 != r7) goto L1b5
                r7 = r15
                goto L1b6
            L1b5:
                r7 = 0
            L1b6:
                android.support.constraint.n.k.e$b r8 = android.support.constraint.n.k.e.b.d
                if (r4 != r8) goto L1bc
                r8 = r15
                goto L1bd
            L1bc:
                r8 = 0
            L1bd:
                android.support.constraint.n.k.e$b r9 = android.support.constraint.n.k.e.b.e
                if (r4 == r9) goto L1c8
                android.support.constraint.n.k.e$b r9 = android.support.constraint.n.k.e.b.f495b
                if (r4 != r9) goto L1c6
                goto L1c8
            L1c6:
                r4 = 0
                goto L1c9
            L1c8:
                r4 = r15
            L1c9:
                android.support.constraint.n.k.e$b r9 = android.support.constraint.n.k.e.b.e
                if (r3 == r9) goto L1d4
                android.support.constraint.n.k.e$b r9 = android.support.constraint.n.k.e.b.f495b
                if (r3 != r9) goto L1d2
                goto L1d4
            L1d2:
                r3 = 0
                goto L1d5
            L1d4:
                r3 = r15
            L1d5:
                r9 = 0
                if (r7 == 0) goto L1e0
                float r11 = r1.U
                int r11 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                if (r11 <= 0) goto L1e0
                r11 = r15
                goto L1e1
            L1e0:
                r11 = 0
            L1e1:
                if (r8 == 0) goto L1eb
                float r12 = r1.U
                int r9 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
                if (r9 <= 0) goto L1eb
                r9 = r15
                goto L1ec
            L1eb:
                r9 = 0
            L1ec:
                if (r10 != 0) goto L1ef
                return
            L1ef:
                android.view.ViewGroup$LayoutParams r12 = r10.getLayoutParams()
                android.support.constraint.ConstraintLayout$b r12 = (android.support.constraint.ConstraintLayout.b) r12
                int r13 = r2.j
                int r14 = android.support.constraint.n.k.m.b.a.l
                if (r13 == r14) goto L212
                int r14 = android.support.constraint.n.k.m.b.a.m
                if (r13 == r14) goto L212
                if (r7 == 0) goto L212
                int r7 = r1.n
                if (r7 != 0) goto L212
                if (r8 == 0) goto L212
                int r7 = r1.o
                if (r7 == 0) goto L20c
                goto L212
            L20c:
                r0 = -1
                r13 = 0
                r14 = 0
                r15 = 0
                goto L2ad
            L212:
                boolean r7 = r10 instanceof android.support.constraint.l
                if (r7 == 0) goto L224
                boolean r7 = r1 instanceof android.support.constraint.n.k.k
                if (r7 == 0) goto L224
                r7 = r1
                android.support.constraint.n.k.k r7 = (android.support.constraint.n.k.k) r7
                r8 = r10
                android.support.constraint.l r8 = (android.support.constraint.l) r8
                r8.a(r7, r6, r5)
                goto L227
            L224:
                r10.measure(r6, r5)
            L227:
                r1.d(r6, r5)
                int r7 = r10.getMeasuredWidth()
                int r8 = r10.getMeasuredHeight()
                int r13 = r10.getBaseline()
                int r14 = r1.q
                if (r14 <= 0) goto L23f
                int r14 = java.lang.Math.max(r14, r7)
                goto L240
            L23f:
                r14 = r7
            L240:
                int r15 = r1.r
                if (r15 <= 0) goto L248
                int r14 = java.lang.Math.min(r15, r14)
            L248:
                int r15 = r1.t
                if (r15 <= 0) goto L253
                int r15 = java.lang.Math.max(r15, r8)
                r16 = r5
                goto L256
            L253:
                r16 = r5
                r15 = r8
            L256:
                int r5 = r1.u
                if (r5 <= 0) goto L25e
                int r15 = java.lang.Math.min(r5, r15)
            L25e:
                android.support.constraint.ConstraintLayout r0 = r0.h
                int r0 = android.support.constraint.ConstraintLayout.a(r0)
                r5 = 1
                boolean r0 = android.support.constraint.n.k.j.a(r0, r5)
                if (r0 != 0) goto L282
                r0 = 1056964608(0x3f000000, float:0.5)
                if (r11 == 0) goto L278
                if (r4 == 0) goto L278
                float r3 = r1.U
                float r4 = (float) r15
                float r4 = r4 * r3
                float r4 = r4 + r0
                int r14 = (int) r4
                goto L282
            L278:
                if (r9 == 0) goto L282
                if (r3 == 0) goto L282
                float r3 = r1.U
                float r4 = (float) r14
                float r4 = r4 / r3
                float r4 = r4 + r0
                int r15 = (int) r4
            L282:
                if (r7 != r14) goto L289
                if (r8 == r15) goto L287
                goto L289
            L287:
                r0 = -1
                goto L2ad
            L289:
                r0 = 1073741824(0x40000000, float:2.0)
                if (r7 == r14) goto L291
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r0)
            L291:
                if (r8 == r15) goto L298
                int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r0)
                goto L29a
            L298:
                r5 = r16
            L29a:
                r10.measure(r6, r5)
                r1.d(r6, r5)
                int r14 = r10.getMeasuredWidth()
                int r15 = r10.getMeasuredHeight()
                int r13 = r10.getBaseline()
                goto L287
            L2ad:
                if (r13 == r0) goto L2b1
                r5 = 1
                goto L2b2
            L2b1:
                r5 = 0
            L2b2:
                int r0 = r2.f504c
                if (r14 != r0) goto L2bd
                int r0 = r2.d
                if (r15 == r0) goto L2bb
                goto L2bd
            L2bb:
                r0 = 0
                goto L2be
            L2bd:
                r0 = 1
            L2be:
                r2.i = r0
                boolean r0 = r12.X
                if (r0 == 0) goto L2c5
                r5 = 1
            L2c5:
                if (r5 == 0) goto L2d3
                r0 = -1
                if (r13 == r0) goto L2d3
                int r0 = r18.e()
                if (r0 == r13) goto L2d3
                r0 = 1
                r2.i = r0
            L2d3:
                r2.e = r14
                r2.f = r15
                r2.h = r5
                r2.g = r13
                return
        }
    }

    public ConstraintLayout(android.content.Context r4) {
            r3 = this;
            r3.<init>(r4)
            android.util.SparseArray r4 = new android.util.SparseArray
            r4.<init>()
            r3.f405b = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = 4
            r4.<init>(r0)
            r3.f406c = r4
            android.support.constraint.n.k.f r4 = new android.support.constraint.n.k.f
            r4.<init>()
            r3.d = r4
            r4 = 0
            r3.e = r4
            r3.f = r4
            r0 = 2147483647(0x7fffffff, float:NaN)
            r3.g = r0
            r3.h = r0
            r0 = 1
            r3.i = r0
            r0 = 257(0x101, float:3.6E-43)
            r3.j = r0
            r0 = 0
            r3.k = r0
            r3.l = r0
            r1 = -1
            r3.m = r1
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3.n = r2
            r3.o = r1
            r3.p = r1
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r3.q = r1
            android.support.constraint.ConstraintLayout$c r1 = new android.support.constraint.ConstraintLayout$c
            r1.<init>(r3, r3)
            r3.r = r1
            r3.s = r4
            r3.t = r4
            r3.a(r0, r4, r4)
            return
    }

    public ConstraintLayout(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            r2.f405b = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 4
            r3.<init>(r0)
            r2.f406c = r3
            android.support.constraint.n.k.f r3 = new android.support.constraint.n.k.f
            r3.<init>()
            r2.d = r3
            r3 = 0
            r2.e = r3
            r2.f = r3
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2.g = r0
            r2.h = r0
            r0 = 1
            r2.i = r0
            r0 = 257(0x101, float:3.6E-43)
            r2.j = r0
            r0 = 0
            r2.k = r0
            r2.l = r0
            r0 = -1
            r2.m = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2.n = r1
            r2.o = r0
            r2.p = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r2.q = r0
            android.support.constraint.ConstraintLayout$c r0 = new android.support.constraint.ConstraintLayout$c
            r0.<init>(r2, r2)
            r2.r = r0
            r2.s = r3
            r2.t = r3
            r2.a(r4, r3, r3)
            return
    }

    public ConstraintLayout(android.content.Context r3, android.util.AttributeSet r4, int r5) {
            r2 = this;
            r2.<init>(r3, r4, r5)
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            r2.f405b = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 4
            r3.<init>(r0)
            r2.f406c = r3
            android.support.constraint.n.k.f r3 = new android.support.constraint.n.k.f
            r3.<init>()
            r2.d = r3
            r3 = 0
            r2.e = r3
            r2.f = r3
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2.g = r0
            r2.h = r0
            r0 = 1
            r2.i = r0
            r0 = 257(0x101, float:3.6E-43)
            r2.j = r0
            r0 = 0
            r2.k = r0
            r2.l = r0
            r0 = -1
            r2.m = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2.n = r1
            r2.o = r0
            r2.p = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r2.q = r0
            android.support.constraint.ConstraintLayout$c r0 = new android.support.constraint.ConstraintLayout$c
            r0.<init>(r2, r2)
            r2.r = r0
            r2.s = r3
            r2.t = r3
            r2.a(r4, r5, r3)
            return
    }

    @android.annotation.TargetApi(21)
    public ConstraintLayout(android.content.Context r3, android.util.AttributeSet r4, int r5, int r6) {
            r2 = this;
            r2.<init>(r3, r4, r5, r6)
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            r2.f405b = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 4
            r3.<init>(r0)
            r2.f406c = r3
            android.support.constraint.n.k.f r3 = new android.support.constraint.n.k.f
            r3.<init>()
            r2.d = r3
            r3 = 0
            r2.e = r3
            r2.f = r3
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2.g = r0
            r2.h = r0
            r0 = 1
            r2.i = r0
            r0 = 257(0x101, float:3.6E-43)
            r2.j = r0
            r0 = 0
            r2.k = r0
            r2.l = r0
            r0 = -1
            r2.m = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2.n = r1
            r2.o = r0
            r2.p = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r2.q = r0
            android.support.constraint.ConstraintLayout$c r0 = new android.support.constraint.ConstraintLayout$c
            r0.<init>(r2, r2)
            r2.r = r0
            r2.s = r3
            r2.t = r3
            r2.a(r4, r5, r6)
            return
    }

    static /* synthetic */ int a(android.support.constraint.ConstraintLayout r0) {
            int r0 = r0.j
            return r0
    }

    private void a(android.util.AttributeSet r6, int r7, int r8) {
            r5 = this;
            android.support.constraint.n.k.f r0 = r5.d
            r0.a(r5)
            android.support.constraint.n.k.f r0 = r5.d
            android.support.constraint.ConstraintLayout$c r1 = r5.r
            r0.a(r1)
            android.util.SparseArray<android.view.View> r0 = r5.f405b
            int r1 = r5.getId()
            r0.put(r1, r5)
            r0 = 0
            r5.k = r0
            if (r6 == 0) goto La3
            android.content.Context r1 = r5.getContext()
            int[] r2 = android.support.constraint.k.ConstraintLayout_Layout
            android.content.res.TypedArray r6 = r1.obtainStyledAttributes(r6, r2, r7, r8)
            int r7 = r6.getIndexCount()
            r8 = 0
            r1 = r8
        L2a:
            if (r1 >= r7) goto La0
            int r2 = r6.getIndex(r1)
            int r3 = android.support.constraint.k.ConstraintLayout_Layout_android_minWidth
            if (r2 != r3) goto L3d
            int r3 = r5.e
            int r2 = r6.getDimensionPixelOffset(r2, r3)
            r5.e = r2
            goto L9d
        L3d:
            int r3 = android.support.constraint.k.ConstraintLayout_Layout_android_minHeight
            if (r2 != r3) goto L4a
            int r3 = r5.f
            int r2 = r6.getDimensionPixelOffset(r2, r3)
            r5.f = r2
            goto L9d
        L4a:
            int r3 = android.support.constraint.k.ConstraintLayout_Layout_android_maxWidth
            if (r2 != r3) goto L57
            int r3 = r5.g
            int r2 = r6.getDimensionPixelOffset(r2, r3)
            r5.g = r2
            goto L9d
        L57:
            int r3 = android.support.constraint.k.ConstraintLayout_Layout_android_maxHeight
            if (r2 != r3) goto L64
            int r3 = r5.h
            int r2 = r6.getDimensionPixelOffset(r2, r3)
            r5.h = r2
            goto L9d
        L64:
            int r3 = android.support.constraint.k.ConstraintLayout_Layout_layout_optimizationLevel
            if (r2 != r3) goto L71
            int r3 = r5.j
            int r2 = r6.getInt(r2, r3)
            r5.j = r2
            goto L9d
        L71:
            int r3 = android.support.constraint.k.ConstraintLayout_Layout_layoutDescription
            if (r2 != r3) goto L82
            int r2 = r6.getResourceId(r2, r8)
            if (r2 == 0) goto L9d
            r5.b(r2)     // Catch: android.content.res.Resources.NotFoundException -> L7f
            goto L9d
        L7f:
            r5.l = r0
            goto L9d
        L82:
            int r3 = android.support.constraint.k.ConstraintLayout_Layout_constraintSet
            if (r2 != r3) goto L9d
            int r2 = r6.getResourceId(r2, r8)
            android.support.constraint.e r3 = new android.support.constraint.e     // Catch: android.content.res.Resources.NotFoundException -> L99
            r3.<init>()     // Catch: android.content.res.Resources.NotFoundException -> L99
            r5.k = r3     // Catch: android.content.res.Resources.NotFoundException -> L99
            android.content.Context r4 = r5.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L99
            r3.b(r4, r2)     // Catch: android.content.res.Resources.NotFoundException -> L99
            goto L9b
        L99:
            r5.k = r0
        L9b:
            r5.m = r2
        L9d:
            int r1 = r1 + 1
            goto L2a
        La0:
            r6.recycle()
        La3:
            android.support.constraint.n.k.f r6 = r5.d
            int r5 = r5.j
            r6.x(r5)
            return
    }

    static /* synthetic */ java.util.ArrayList b(android.support.constraint.ConstraintLayout r0) {
            java.util.ArrayList<android.support.constraint.c> r0 = r0.f406c
            return r0
    }

    private void b() {
            r1 = this;
            r0 = 1
            r1.i = r0
            r0 = -1
            r1.o = r0
            r1.p = r0
            return
    }

    private final android.support.constraint.n.k.e c(int r2) {
            r1 = this;
            if (r2 != 0) goto L5
            android.support.constraint.n.k.f r1 = r1.d
            return r1
        L5:
            android.util.SparseArray<android.view.View> r0 = r1.f405b
            java.lang.Object r0 = r0.get(r2)
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto L20
            android.view.View r0 = r1.findViewById(r2)
            if (r0 == 0) goto L20
            if (r0 == r1) goto L20
            android.view.ViewParent r2 = r0.getParent()
            if (r2 != r1) goto L20
            r1.onViewAdded(r0)
        L20:
            if (r0 != r1) goto L25
            android.support.constraint.n.k.f r1 = r1.d
            return r1
        L25:
            if (r0 != 0) goto L29
            r1 = 0
            goto L31
        L29:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.support.constraint.ConstraintLayout$b r1 = (android.support.constraint.ConstraintLayout.b) r1
            android.support.constraint.n.k.e r1 = r1.m0
        L31:
            return r1
    }

    private void c() {
            r9 = this;
            boolean r6 = r9.isInEditMode()
            int r7 = r9.getChildCount()
            r0 = 0
            r1 = r0
        La:
            if (r1 >= r7) goto L1d
            android.view.View r2 = r9.getChildAt(r1)
            android.support.constraint.n.k.e r2 = r9.a(r2)
            if (r2 != 0) goto L17
            goto L1a
        L17:
            r2.P()
        L1a:
            int r1 = r1 + 1
            goto La
        L1d:
            r1 = -1
            if (r6 == 0) goto L5a
            r2 = r0
        L21:
            if (r2 >= r7) goto L5a
            android.view.View r3 = r9.getChildAt(r2)
            android.content.res.Resources r4 = r9.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L57
            int r5 = r3.getId()     // Catch: android.content.res.Resources.NotFoundException -> L57
            java.lang.String r4 = r4.getResourceName(r5)     // Catch: android.content.res.Resources.NotFoundException -> L57
            int r5 = r3.getId()     // Catch: android.content.res.Resources.NotFoundException -> L57
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: android.content.res.Resources.NotFoundException -> L57
            r9.a(r0, r4, r5)     // Catch: android.content.res.Resources.NotFoundException -> L57
            r5 = 47
            int r5 = r4.indexOf(r5)     // Catch: android.content.res.Resources.NotFoundException -> L57
            if (r5 == r1) goto L4c
            int r5 = r5 + 1
            java.lang.String r4 = r4.substring(r5)     // Catch: android.content.res.Resources.NotFoundException -> L57
        L4c:
            int r3 = r3.getId()     // Catch: android.content.res.Resources.NotFoundException -> L57
            android.support.constraint.n.k.e r3 = r9.c(r3)     // Catch: android.content.res.Resources.NotFoundException -> L57
            r3.a(r4)     // Catch: android.content.res.Resources.NotFoundException -> L57
        L57:
            int r2 = r2 + 1
            goto L21
        L5a:
            int r2 = r9.m
            if (r2 == r1) goto L7c
            r1 = r0
        L5f:
            if (r1 >= r7) goto L7c
            android.view.View r2 = r9.getChildAt(r1)
            int r3 = r2.getId()
            int r4 = r9.m
            if (r3 != r4) goto L79
            boolean r3 = r2 instanceof android.support.constraint.f
            if (r3 == 0) goto L79
            android.support.constraint.f r2 = (android.support.constraint.f) r2
            android.support.constraint.e r2 = r2.getConstraintSet()
            r9.k = r2
        L79:
            int r1 = r1 + 1
            goto L5f
        L7c:
            android.support.constraint.e r1 = r9.k
            if (r1 == 0) goto L84
            r2 = 1
            r1.a(r9, r2)
        L84:
            android.support.constraint.n.k.f r1 = r9.d
            r1.T()
            java.util.ArrayList<android.support.constraint.c> r1 = r9.f406c
            int r1 = r1.size()
            if (r1 <= 0) goto La2
            r2 = r0
        L92:
            if (r2 >= r1) goto La2
            java.util.ArrayList<android.support.constraint.c> r3 = r9.f406c
            java.lang.Object r3 = r3.get(r2)
            android.support.constraint.c r3 = (android.support.constraint.c) r3
            r3.e(r9)
            int r2 = r2 + 1
            goto L92
        La2:
            r1 = r0
        La3:
            if (r1 >= r7) goto Lb5
            android.view.View r2 = r9.getChildAt(r1)
            boolean r3 = r2 instanceof android.support.constraint.i
            if (r3 == 0) goto Lb2
            android.support.constraint.i r2 = (android.support.constraint.i) r2
            r2.b(r9)
        Lb2:
            int r1 = r1 + 1
            goto La3
        Lb5:
            android.util.SparseArray<android.support.constraint.n.k.e> r1 = r9.q
            r1.clear()
            android.util.SparseArray<android.support.constraint.n.k.e> r1 = r9.q
            android.support.constraint.n.k.f r2 = r9.d
            r1.put(r0, r2)
            android.util.SparseArray<android.support.constraint.n.k.e> r1 = r9.q
            int r2 = r9.getId()
            android.support.constraint.n.k.f r3 = r9.d
            r1.put(r2, r3)
            r1 = r0
        Lcd:
            if (r1 >= r7) goto Le3
            android.view.View r2 = r9.getChildAt(r1)
            android.support.constraint.n.k.e r3 = r9.a(r2)
            android.util.SparseArray<android.support.constraint.n.k.e> r4 = r9.q
            int r2 = r2.getId()
            r4.put(r2, r3)
            int r1 = r1 + 1
            goto Lcd
        Le3:
            r8 = r0
        Le4:
            if (r8 >= r7) goto L107
            android.view.View r2 = r9.getChildAt(r8)
            android.support.constraint.n.k.e r3 = r9.a(r2)
            if (r3 != 0) goto Lf1
            goto L104
        Lf1:
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            r4 = r0
            android.support.constraint.ConstraintLayout$b r4 = (android.support.constraint.ConstraintLayout.b) r4
            android.support.constraint.n.k.f r0 = r9.d
            r0.a(r3)
            android.util.SparseArray<android.support.constraint.n.k.e> r5 = r9.q
            r0 = r9
            r1 = r6
            r0.a(r1, r2, r3, r4, r5)
        L104:
            int r8 = r8 + 1
            goto Le4
        L107:
            return
    }

    private boolean d() {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L17
            android.view.View r3 = r4.getChildAt(r2)
            boolean r3 = r3.isLayoutRequested()
            if (r3 == 0) goto L14
            r1 = 1
            goto L17
        L14:
            int r2 = r2 + 1
            goto L6
        L17:
            if (r1 == 0) goto L1c
            r4.c()
        L1c:
            return r1
    }

    private int getPaddingWidth() {
            r4 = this;
            int r0 = r4.getPaddingLeft()
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            int r2 = r4.getPaddingRight()
            int r2 = java.lang.Math.max(r1, r2)
            int r0 = r0 + r2
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 17
            if (r2 < r3) goto L2a
            int r2 = r4.getPaddingStart()
            int r2 = java.lang.Math.max(r1, r2)
            int r4 = r4.getPaddingEnd()
            int r4 = java.lang.Math.max(r1, r4)
            int r1 = r2 + r4
        L2a:
            if (r1 <= 0) goto L2d
            r0 = r1
        L2d:
            return r0
    }

    public final android.support.constraint.n.k.e a(android.view.View r1) {
            r0 = this;
            if (r1 != r0) goto L5
            android.support.constraint.n.k.f r0 = r0.d
            return r0
        L5:
            if (r1 != 0) goto L9
            r0 = 0
            goto L11
        L9:
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            android.support.constraint.ConstraintLayout$b r0 = (android.support.constraint.ConstraintLayout.b) r0
            android.support.constraint.n.k.e r0 = r0.m0
        L11:
            return r0
    }

    public android.view.View a(int r1) {
            r0 = this;
            android.util.SparseArray<android.view.View> r0 = r0.f405b
            java.lang.Object r0 = r0.get(r1)
            android.view.View r0 = (android.view.View) r0
            return r0
    }

    public java.lang.Object a(int r1, java.lang.Object r2) {
            r0 = this;
            if (r1 != 0) goto L19
            boolean r1 = r2 instanceof java.lang.String
            if (r1 == 0) goto L19
            java.lang.String r2 = (java.lang.String) r2
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r0.n
            if (r1 == 0) goto L19
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L19
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r0.n
            java.lang.Object r0 = r0.get(r2)
            return r0
        L19:
            r0 = 0
            return r0
    }

    protected void a(int r3, int r4, int r5, int r6, boolean r7, boolean r8) {
            r2 = this;
            android.support.constraint.ConstraintLayout$c r0 = r2.r
            int r1 = r0.e
            int r0 = r0.d
            int r5 = r5 + r0
            int r6 = r6 + r1
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 11
            if (r0 < r1) goto L38
            r0 = 0
            int r3 = android.view.ViewGroup.resolveSizeAndState(r5, r3, r0)
            int r4 = android.view.ViewGroup.resolveSizeAndState(r6, r4, r0)
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = r3 & r5
            r4 = r4 & r5
            int r5 = r2.g
            int r3 = java.lang.Math.min(r5, r3)
            int r5 = r2.h
            int r4 = java.lang.Math.min(r5, r4)
            r5 = 16777216(0x1000000, float:2.3509887E-38)
            if (r7 == 0) goto L2d
            r3 = r3 | r5
        L2d:
            if (r8 == 0) goto L30
            r4 = r4 | r5
        L30:
            r2.setMeasuredDimension(r3, r4)
            r2.o = r3
            r2.p = r4
            goto L3f
        L38:
            r2.setMeasuredDimension(r5, r6)
            r2.o = r5
            r2.p = r6
        L3f:
            return
    }

    public void a(int r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            if (r2 != 0) goto L35
            boolean r2 = r3 instanceof java.lang.String
            if (r2 == 0) goto L35
            boolean r2 = r4 instanceof java.lang.Integer
            if (r2 == 0) goto L35
            java.util.HashMap<java.lang.String, java.lang.Integer> r2 = r1.n
            if (r2 != 0) goto L15
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.n = r2
        L15:
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r2 = "/"
            int r2 = r3.indexOf(r2)
            r0 = -1
            if (r2 == r0) goto L26
            int r2 = r2 + 1
            java.lang.String r3 = r3.substring(r2)
        L26:
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r2 = r4.intValue()
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r1.n
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.put(r3, r2)
        L35:
            return
    }

    protected void a(android.support.constraint.n.k.f r18, int r19, int r20, int r21) {
            r17 = this;
            r6 = r17
            int r7 = android.view.View.MeasureSpec.getMode(r20)
            int r0 = android.view.View.MeasureSpec.getSize(r20)
            int r8 = android.view.View.MeasureSpec.getMode(r21)
            int r1 = android.view.View.MeasureSpec.getSize(r21)
            int r2 = r17.getPaddingTop()
            r3 = 0
            int r16 = java.lang.Math.max(r3, r2)
            int r2 = r17.getPaddingBottom()
            int r13 = java.lang.Math.max(r3, r2)
            int r2 = r16 + r13
            int r4 = r17.getPaddingWidth()
            android.support.constraint.ConstraintLayout$c r9 = r6.r
            r10 = r20
            r11 = r21
            r12 = r16
            r14 = r4
            r15 = r2
            r9.a(r10, r11, r12, r13, r14, r15)
            int r5 = android.os.Build.VERSION.SDK_INT
            r9 = 17
            if (r5 < r9) goto L63
            int r5 = r17.getPaddingStart()
            int r5 = java.lang.Math.max(r3, r5)
            int r9 = r17.getPaddingEnd()
            int r9 = java.lang.Math.max(r3, r9)
            if (r5 > 0) goto L5a
            if (r9 <= 0) goto L51
            goto L5a
        L51:
            int r5 = r17.getPaddingLeft()
            int r5 = java.lang.Math.max(r3, r5)
            goto L61
        L5a:
            boolean r3 = r17.a()
            if (r3 == 0) goto L61
            r5 = r9
        L61:
            r9 = r5
            goto L6c
        L63:
            int r5 = r17.getPaddingLeft()
            int r3 = java.lang.Math.max(r3, r5)
            r9 = r3
        L6c:
            int r10 = r0 - r4
            int r11 = r1 - r2
            r0 = r17
            r1 = r18
            r2 = r7
            r3 = r10
            r4 = r8
            r5 = r11
            r0.a(r1, r2, r3, r4, r5)
            int r12 = r6.o
            int r13 = r6.p
            r0 = r18
            r1 = r19
            r6 = r12
            r7 = r13
            r8 = r9
            r9 = r16
            r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    protected void a(android.support.constraint.n.k.f r8, int r9, int r10, int r11, int r12) {
            r7 = this;
            android.support.constraint.ConstraintLayout$c r0 = r7.r
            int r1 = r0.e
            int r0 = r0.d
            android.support.constraint.n.k.e$b r2 = android.support.constraint.n.k.e.b.f495b
            int r3 = r7.getChildCount()
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 0
            if (r9 == r5) goto L28
            if (r9 == 0) goto L23
            if (r9 == r4) goto L1a
            r9 = r2
        L18:
            r10 = r6
            goto L32
        L1a:
            int r9 = r7.g
            int r9 = r9 - r0
            int r10 = java.lang.Math.min(r9, r10)
            r9 = r2
            goto L32
        L23:
            android.support.constraint.n.k.e$b r9 = android.support.constraint.n.k.e.b.f496c
            if (r3 != 0) goto L18
            goto L2c
        L28:
            android.support.constraint.n.k.e$b r9 = android.support.constraint.n.k.e.b.f496c
            if (r3 != 0) goto L32
        L2c:
            int r10 = r7.e
            int r10 = java.lang.Math.max(r6, r10)
        L32:
            if (r11 == r5) goto L47
            if (r11 == 0) goto L42
            if (r11 == r4) goto L3a
        L38:
            r12 = r6
            goto L51
        L3a:
            int r11 = r7.h
            int r11 = r11 - r1
            int r12 = java.lang.Math.min(r11, r12)
            goto L51
        L42:
            android.support.constraint.n.k.e$b r2 = android.support.constraint.n.k.e.b.f496c
            if (r3 != 0) goto L38
            goto L4b
        L47:
            android.support.constraint.n.k.e$b r2 = android.support.constraint.n.k.e.b.f496c
            if (r3 != 0) goto L51
        L4b:
            int r11 = r7.f
            int r12 = java.lang.Math.max(r6, r11)
        L51:
            int r11 = r8.C()
            if (r10 != r11) goto L5d
            int r11 = r8.k()
            if (r12 == r11) goto L60
        L5d:
            r8.Y()
        L60:
            r8.u(r6)
            r8.v(r6)
            int r11 = r7.g
            int r11 = r11 - r0
            r8.o(r11)
            int r11 = r7.h
            int r11 = r11 - r1
            r8.n(r11)
            r8.q(r6)
            r8.p(r6)
            r8.a(r9)
            r8.t(r10)
            r8.b(r2)
            r8.l(r12)
            int r9 = r7.e
            int r9 = r9 - r0
            r8.q(r9)
            int r7 = r7.f
            int r7 = r7 - r1
            r8.p(r7)
            return
    }

    protected void a(boolean r20, android.view.View r21, android.support.constraint.n.k.e r22, android.support.constraint.ConstraintLayout.b r23, android.util.SparseArray<android.support.constraint.n.k.e> r24) {
            r19 = this;
            r0 = r19
            r1 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r23.a()
            r10 = 0
            r8.n0 = r10
            int r2 = r21.getVisibility()
            r7.s(r2)
            boolean r2 = r8.a0
            r11 = 1
            if (r2 == 0) goto L24
            r7.b(r11)
            r2 = 8
            r7.s(r2)
        L24:
            r7.a(r1)
            boolean r2 = r1 instanceof android.support.constraint.c
            if (r2 == 0) goto L36
            android.support.constraint.c r1 = (android.support.constraint.c) r1
            android.support.constraint.n.k.f r2 = r0.d
            boolean r2 = r2.a0()
            r1.a(r7, r2)
        L36:
            boolean r1 = r8.Y
            r2 = 17
            r12 = -1
            if (r1 == 0) goto L69
            r0 = r7
            android.support.constraint.n.k.g r0 = (android.support.constraint.n.k.g) r0
            int r1 = r8.j0
            int r3 = r8.k0
            float r4 = r8.l0
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 >= r2) goto L50
            int r1 = r8.f408a
            int r3 = r8.f409b
            float r4 = r8.f410c
        L50:
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 == 0) goto L5b
            r0.e(r4)
            goto L2be
        L5b:
            if (r1 == r12) goto L62
            r0.x(r1)
            goto L2be
        L62:
            if (r3 == r12) goto L2be
            r0.y(r3)
            goto L2be
        L69:
            int r1 = r8.c0
            int r3 = r8.d0
            int r4 = r8.e0
            int r5 = r8.f0
            int r6 = r8.g0
            int r13 = r8.h0
            float r14 = r8.i0
            int r15 = android.os.Build.VERSION.SDK_INT
            if (r15 >= r2) goto Lb1
            int r1 = r8.d
            int r2 = r8.e
            int r4 = r8.f
            int r5 = r8.g
            int r3 = r8.t
            int r6 = r8.v
            float r14 = r8.z
            if (r1 != r12) goto L98
            if (r2 != r12) goto L98
            int r13 = r8.q
            if (r13 == r12) goto L93
            r1 = r13
            goto L98
        L93:
            int r13 = r8.p
            if (r13 == r12) goto L98
            r2 = r13
        L98:
            if (r4 != r12) goto Lac
            if (r5 != r12) goto Lac
            int r13 = r8.r
            if (r13 == r12) goto La1
            goto Lad
        La1:
            int r13 = r8.s
            if (r13 == r12) goto Lac
            r15 = r6
            r5 = r14
            r6 = r3
            r14 = r13
            r3 = r2
            r13 = r4
            goto Lb8
        Lac:
            r13 = r4
        Lad:
            r15 = r6
            r6 = r3
            r3 = r2
            goto Lb3
        Lb1:
            r15 = r13
            r13 = r4
        Lb3:
            r18 = r14
            r14 = r5
            r5 = r18
        Lb8:
            int r2 = r8.m
            if (r2 == r12) goto Lcd
            java.lang.Object r0 = r9.get(r2)
            android.support.constraint.n.k.e r0 = (android.support.constraint.n.k.e) r0
            if (r0 == 0) goto L1f3
            float r1 = r8.o
            int r2 = r8.n
            r7.a(r0, r1, r2)
            goto L1f3
        Lcd:
            if (r1 == r12) goto Le9
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            android.support.constraint.n.k.e r3 = (android.support.constraint.n.k.e) r3
            if (r3 == 0) goto Le6
            android.support.constraint.n.k.d$b r4 = android.support.constraint.n.k.d.b.f489c
            int r2 = r8.leftMargin
            r1 = r22
            r16 = r2
            r2 = r4
            r17 = r5
            r5 = r16
            goto Lfe
        Le6:
            r17 = r5
            goto L101
        Le9:
            r17 = r5
            if (r3 == r12) goto L101
            java.lang.Object r1 = r9.get(r3)
            r3 = r1
            android.support.constraint.n.k.e r3 = (android.support.constraint.n.k.e) r3
            if (r3 == 0) goto L101
            android.support.constraint.n.k.d$b r2 = android.support.constraint.n.k.d.b.f489c
            android.support.constraint.n.k.d$b r4 = android.support.constraint.n.k.d.b.e
            int r5 = r8.leftMargin
            r1 = r22
        Lfe:
            r1.a(r2, r3, r4, r5, r6)
        L101:
            if (r13 == r12) goto L115
            java.lang.Object r1 = r9.get(r13)
            r3 = r1
            android.support.constraint.n.k.e r3 = (android.support.constraint.n.k.e) r3
            if (r3 == 0) goto L12b
            android.support.constraint.n.k.d$b r2 = android.support.constraint.n.k.d.b.e
            android.support.constraint.n.k.d$b r4 = android.support.constraint.n.k.d.b.f489c
            int r5 = r8.rightMargin
            r1 = r22
            goto L127
        L115:
            if (r14 == r12) goto L12b
            java.lang.Object r1 = r9.get(r14)
            r3 = r1
            android.support.constraint.n.k.e r3 = (android.support.constraint.n.k.e) r3
            if (r3 == 0) goto L12b
            android.support.constraint.n.k.d$b r4 = android.support.constraint.n.k.d.b.e
            int r5 = r8.rightMargin
            r1 = r22
            r2 = r4
        L127:
            r6 = r15
            r1.a(r2, r3, r4, r5, r6)
        L12b:
            int r1 = r8.h
            if (r1 == r12) goto L142
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            android.support.constraint.n.k.e r3 = (android.support.constraint.n.k.e) r3
            if (r3 == 0) goto L15c
            android.support.constraint.n.k.d$b r4 = android.support.constraint.n.k.d.b.d
            int r5 = r8.topMargin
            int r6 = r8.u
            r1 = r22
            r2 = r4
            goto L159
        L142:
            int r1 = r8.i
            if (r1 == r12) goto L15c
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            android.support.constraint.n.k.e r3 = (android.support.constraint.n.k.e) r3
            if (r3 == 0) goto L15c
            android.support.constraint.n.k.d$b r2 = android.support.constraint.n.k.d.b.d
            android.support.constraint.n.k.d$b r4 = android.support.constraint.n.k.d.b.f
            int r5 = r8.topMargin
            int r6 = r8.u
            r1 = r22
        L159:
            r1.a(r2, r3, r4, r5, r6)
        L15c:
            int r1 = r8.j
            if (r1 == r12) goto L174
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            android.support.constraint.n.k.e r3 = (android.support.constraint.n.k.e) r3
            if (r3 == 0) goto L18d
            android.support.constraint.n.k.d$b r2 = android.support.constraint.n.k.d.b.f
            android.support.constraint.n.k.d$b r4 = android.support.constraint.n.k.d.b.d
            int r5 = r8.bottomMargin
            int r6 = r8.w
            r1 = r22
            goto L18a
        L174:
            int r1 = r8.k
            if (r1 == r12) goto L18d
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            android.support.constraint.n.k.e r3 = (android.support.constraint.n.k.e) r3
            if (r3 == 0) goto L18d
            android.support.constraint.n.k.d$b r4 = android.support.constraint.n.k.d.b.f
            int r5 = r8.bottomMargin
            int r6 = r8.w
            r1 = r22
            r2 = r4
        L18a:
            r1.a(r2, r3, r4, r5, r6)
        L18d:
            int r1 = r8.l
            if (r1 == r12) goto L1e0
            android.util.SparseArray<android.view.View> r0 = r0.f405b
            java.lang.Object r0 = r0.get(r1)
            android.view.View r0 = (android.view.View) r0
            int r1 = r8.l
            java.lang.Object r1 = r9.get(r1)
            android.support.constraint.n.k.e r1 = (android.support.constraint.n.k.e) r1
            if (r1 == 0) goto L1e0
            if (r0 == 0) goto L1e0
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            boolean r2 = r2 instanceof android.support.constraint.ConstraintLayout.b
            if (r2 == 0) goto L1e0
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.support.constraint.ConstraintLayout$b r0 = (android.support.constraint.ConstraintLayout.b) r0
            r8.X = r11
            r0.X = r11
            android.support.constraint.n.k.d$b r2 = android.support.constraint.n.k.d.b.g
            android.support.constraint.n.k.d r2 = r7.a(r2)
            android.support.constraint.n.k.d$b r3 = android.support.constraint.n.k.d.b.g
            android.support.constraint.n.k.d r1 = r1.a(r3)
            r2.a(r1, r10, r12, r11)
            r7.a(r11)
            android.support.constraint.n.k.e r0 = r0.m0
            r0.a(r11)
            android.support.constraint.n.k.d$b r0 = android.support.constraint.n.k.d.b.d
            android.support.constraint.n.k.d r0 = r7.a(r0)
            r0.m()
            android.support.constraint.n.k.d$b r0 = android.support.constraint.n.k.d.b.f
            android.support.constraint.n.k.d r0 = r7.a(r0)
            r0.m()
        L1e0:
            r0 = 0
            r14 = r17
            int r1 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r1 < 0) goto L1ea
            r7.a(r14)
        L1ea:
            float r1 = r8.A
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L1f3
            r7.c(r1)
        L1f3:
            if (r20 == 0) goto L204
            int r0 = r8.P
            if (r0 != r12) goto L1fd
            int r0 = r8.Q
            if (r0 == r12) goto L204
        L1fd:
            int r0 = r8.P
            int r1 = r8.Q
            r7.e(r0, r1)
        L204:
            boolean r0 = r8.V
            r1 = -2
            if (r0 != 0) goto L237
            int r0 = r8.width
            if (r0 != r12) goto L22e
            boolean r0 = r8.S
            if (r0 == 0) goto L214
            android.support.constraint.n.k.e$b r0 = android.support.constraint.n.k.e.b.d
            goto L216
        L214:
            android.support.constraint.n.k.e$b r0 = android.support.constraint.n.k.e.b.e
        L216:
            r7.a(r0)
            android.support.constraint.n.k.d$b r0 = android.support.constraint.n.k.d.b.f489c
            android.support.constraint.n.k.d r0 = r7.a(r0)
            int r2 = r8.leftMargin
            r0.g = r2
            android.support.constraint.n.k.d$b r0 = android.support.constraint.n.k.d.b.e
            android.support.constraint.n.k.d r0 = r7.a(r0)
            int r2 = r8.rightMargin
            r0.g = r2
            goto L24a
        L22e:
            android.support.constraint.n.k.e$b r0 = android.support.constraint.n.k.e.b.d
            r7.a(r0)
            r7.t(r10)
            goto L24a
        L237:
            android.support.constraint.n.k.e$b r0 = android.support.constraint.n.k.e.b.f495b
            r7.a(r0)
            int r0 = r8.width
            r7.t(r0)
            int r0 = r8.width
            if (r0 != r1) goto L24a
            android.support.constraint.n.k.e$b r0 = android.support.constraint.n.k.e.b.f496c
            r7.a(r0)
        L24a:
            boolean r0 = r8.W
            if (r0 != 0) goto L27c
            int r0 = r8.height
            if (r0 != r12) goto L273
            boolean r0 = r8.T
            if (r0 == 0) goto L259
            android.support.constraint.n.k.e$b r0 = android.support.constraint.n.k.e.b.d
            goto L25b
        L259:
            android.support.constraint.n.k.e$b r0 = android.support.constraint.n.k.e.b.e
        L25b:
            r7.b(r0)
            android.support.constraint.n.k.d$b r0 = android.support.constraint.n.k.d.b.d
            android.support.constraint.n.k.d r0 = r7.a(r0)
            int r1 = r8.topMargin
            r0.g = r1
            android.support.constraint.n.k.d$b r0 = android.support.constraint.n.k.d.b.f
            android.support.constraint.n.k.d r0 = r7.a(r0)
            int r1 = r8.bottomMargin
            r0.g = r1
            goto L28f
        L273:
            android.support.constraint.n.k.e$b r0 = android.support.constraint.n.k.e.b.d
            r7.b(r0)
            r7.l(r10)
            goto L28f
        L27c:
            android.support.constraint.n.k.e$b r0 = android.support.constraint.n.k.e.b.f495b
            r7.b(r0)
            int r0 = r8.height
            r7.l(r0)
            int r0 = r8.height
            if (r0 != r1) goto L28f
            android.support.constraint.n.k.e$b r0 = android.support.constraint.n.k.e.b.f496c
            r7.b(r0)
        L28f:
            java.lang.String r0 = r8.B
            r7.b(r0)
            float r0 = r8.D
            r7.b(r0)
            float r0 = r8.E
            r7.d(r0)
            int r0 = r8.F
            r7.m(r0)
            int r0 = r8.G
            r7.r(r0)
            int r0 = r8.H
            int r1 = r8.J
            int r2 = r8.L
            float r3 = r8.N
            r7.a(r0, r1, r2, r3)
            int r0 = r8.I
            int r1 = r8.K
            int r2 = r8.M
            float r3 = r8.O
            r7.b(r0, r1, r2, r3)
        L2be:
            return
    }

    protected boolean a() {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 17
            if (r0 < r2) goto L23
            android.content.Context r0 = r3.getContext()
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r0 = r0.flags
            r2 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r2
            r2 = 1
            if (r0 == 0) goto L19
            r0 = r2
            goto L1a
        L19:
            r0 = r1
        L1a:
            if (r0 == 0) goto L23
            int r3 = r3.getLayoutDirection()
            if (r2 != r3) goto L23
            r1 = r2
        L23:
            return r1
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r1, int r2, android.view.ViewGroup.LayoutParams r3) {
            r0 = this;
            super.addView(r1, r2, r3)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 14
            if (r2 >= r3) goto Lc
            r0.onViewAdded(r1)
        Lc:
            return
    }

    protected void b(int r3) {
            r2 = this;
            android.support.constraint.d r0 = new android.support.constraint.d
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r2, r3)
            r2.l = r0
            return
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r0 = r1 instanceof android.support.constraint.ConstraintLayout.b
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas r21) {
            r20 = this;
            r0 = r20
            java.util.ArrayList<android.support.constraint.c> r1 = r0.f406c
            r2 = 0
            if (r1 == 0) goto L1e
            int r1 = r1.size()
            if (r1 <= 0) goto L1e
            r3 = r2
        Le:
            if (r3 >= r1) goto L1e
            java.util.ArrayList<android.support.constraint.c> r4 = r0.f406c
            java.lang.Object r4 = r4.get(r3)
            android.support.constraint.c r4 = (android.support.constraint.c) r4
            r4.d(r0)
            int r3 = r3 + 1
            goto Le
        L1e:
            super.dispatchDraw(r21)
            boolean r1 = r20.isInEditMode()
            if (r1 == 0) goto Ldb
            int r1 = r20.getChildCount()
            int r3 = r20.getWidth()
            float r3 = (float) r3
            int r4 = r20.getHeight()
            float r4 = (float) r4
            r5 = 1149698048(0x44870000, float:1080.0)
            r6 = 1156579328(0x44f00000, float:1920.0)
            r7 = r2
        L3a:
            if (r7 >= r1) goto Ldb
            android.view.View r8 = r0.getChildAt(r7)
            int r9 = r8.getVisibility()
            r10 = 8
            if (r9 != r10) goto L4a
            goto Ld7
        L4a:
            java.lang.Object r8 = r8.getTag()
            if (r8 == 0) goto Ld7
            boolean r9 = r8 instanceof java.lang.String
            if (r9 == 0) goto Ld7
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = ","
            java.lang.String[] r8 = r8.split(r9)
            int r9 = r8.length
            r10 = 4
            if (r9 != r10) goto Ld7
            r9 = r8[r2]
            int r9 = java.lang.Integer.parseInt(r9)
            r10 = 1
            r10 = r8[r10]
            int r10 = java.lang.Integer.parseInt(r10)
            r11 = 2
            r11 = r8[r11]
            int r11 = java.lang.Integer.parseInt(r11)
            r12 = 3
            r8 = r8[r12]
            int r8 = java.lang.Integer.parseInt(r8)
            float r9 = (float) r9
            float r9 = r9 / r5
            float r9 = r9 * r3
            int r9 = (int) r9
            float r10 = (float) r10
            float r10 = r10 / r6
            float r10 = r10 * r4
            int r10 = (int) r10
            float r11 = (float) r11
            float r11 = r11 / r5
            float r11 = r11 * r3
            int r11 = (int) r11
            float r8 = (float) r8
            float r8 = r8 / r6
            float r8 = r8 * r4
            int r8 = (int) r8
            android.graphics.Paint r15 = new android.graphics.Paint
            r15.<init>()
            r12 = -65536(0xffffffffffff0000, float:NaN)
            r15.setColor(r12)
            float r14 = (float) r9
            float r13 = (float) r10
            int r9 = r9 + r11
            float r9 = (float) r9
            r12 = r21
            r11 = r13
            r13 = r14
            r18 = r14
            r14 = r11
            r19 = r15
            r15 = r9
            r16 = r11
            r17 = r19
            r12.drawLine(r13, r14, r15, r16, r17)
            int r10 = r10 + r8
            float r8 = (float) r10
            r13 = r9
            r16 = r8
            r12.drawLine(r13, r14, r15, r16, r17)
            r14 = r8
            r15 = r18
            r12.drawLine(r13, r14, r15, r16, r17)
            r13 = r18
            r16 = r11
            r12.drawLine(r13, r14, r15, r16, r17)
            r10 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            r15 = r19
            r15.setColor(r10)
            r14 = r11
            r10 = r15
            r15 = r9
            r16 = r8
            r17 = r10
            r12.drawLine(r13, r14, r15, r16, r17)
            r14 = r8
            r16 = r11
            r12.drawLine(r13, r14, r15, r16, r17)
        Ld7:
            int r7 = r7 + 1
            goto L3a
        Ldb:
            return
    }

    @Override // android.view.View
    public void forceLayout() {
            r0 = this;
            r0.b()
            super.forceLayout()
            return
    }

    @Override // android.view.ViewGroup
    protected android.support.constraint.ConstraintLayout.b generateDefaultLayoutParams() {
            r1 = this;
            android.support.constraint.ConstraintLayout$b r1 = new android.support.constraint.ConstraintLayout$b
            r0 = -2
            r1.<init>(r0, r0)
            return r1
    }

    @Override // android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r0 = this;
            android.support.constraint.ConstraintLayout$b r0 = r0.generateDefaultLayoutParams()
            return r0
    }

    @Override // android.view.ViewGroup
    public android.support.constraint.ConstraintLayout.b generateLayoutParams(android.util.AttributeSet r2) {
            r1 = this;
            android.support.constraint.ConstraintLayout$b r0 = new android.support.constraint.ConstraintLayout$b
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1, r2)
            return r0
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            android.support.constraint.ConstraintLayout$b r0 = r0.generateLayoutParams(r1)
            return r0
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            android.support.constraint.ConstraintLayout$b r0 = new android.support.constraint.ConstraintLayout$b
            r0.<init>(r1)
            return r0
    }

    public int getMaxHeight() {
            r0 = this;
            int r0 = r0.h
            return r0
    }

    public int getMaxWidth() {
            r0 = this;
            int r0 = r0.g
            return r0
    }

    public int getMinHeight() {
            r0 = this;
            int r0 = r0.f
            return r0
    }

    public int getMinWidth() {
            r0 = this;
            int r0 = r0.e
            return r0
    }

    public int getOptimizationLevel() {
            r0 = this;
            android.support.constraint.n.k.f r0 = r0.d
            int r0 = r0.V()
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r6, int r7, int r8, int r9, int r10) {
            r5 = this;
            int r6 = r5.getChildCount()
            boolean r7 = r5.isInEditMode()
            r8 = 0
            r9 = r8
        La:
            if (r9 >= r6) goto L5e
            android.view.View r10 = r5.getChildAt(r9)
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            android.support.constraint.ConstraintLayout$b r0 = (android.support.constraint.ConstraintLayout.b) r0
            android.support.constraint.n.k.e r1 = r0.m0
            int r2 = r10.getVisibility()
            r3 = 8
            if (r2 != r3) goto L2f
            boolean r2 = r0.Y
            if (r2 != 0) goto L2f
            boolean r2 = r0.Z
            if (r2 != 0) goto L2f
            boolean r2 = r0.b0
            if (r2 != 0) goto L2f
            if (r7 != 0) goto L2f
            goto L5b
        L2f:
            boolean r0 = r0.a0
            if (r0 == 0) goto L34
            goto L5b
        L34:
            int r0 = r1.D()
            int r2 = r1.E()
            int r3 = r1.C()
            int r3 = r3 + r0
            int r1 = r1.k()
            int r1 = r1 + r2
            r10.layout(r0, r2, r3, r1)
            boolean r4 = r10 instanceof android.support.constraint.i
            if (r4 == 0) goto L5b
            android.support.constraint.i r10 = (android.support.constraint.i) r10
            android.view.View r10 = r10.getContent()
            if (r10 == 0) goto L5b
            r10.setVisibility(r8)
            r10.layout(r0, r2, r3, r1)
        L5b:
            int r9 = r9 + 1
            goto La
        L5e:
            java.util.ArrayList<android.support.constraint.c> r6 = r5.f406c
            int r6 = r6.size()
            if (r6 <= 0) goto L76
        L66:
            if (r8 >= r6) goto L76
            java.util.ArrayList<android.support.constraint.c> r7 = r5.f406c
            java.lang.Object r7 = r7.get(r8)
            android.support.constraint.c r7 = (android.support.constraint.c) r7
            r7.b(r5)
            int r8 = r8 + 1
            goto L66
        L76:
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r9, int r10) {
            r8 = this;
            boolean r0 = r8.i
            r1 = 0
            if (r0 != 0) goto L1d
            int r0 = r8.getChildCount()
            r2 = r1
        La:
            if (r2 >= r0) goto L1d
            android.view.View r3 = r8.getChildAt(r2)
            boolean r3 = r3.isLayoutRequested()
            if (r3 == 0) goto L1a
            r0 = 1
            r8.i = r0
            goto L1d
        L1a:
            int r2 = r2 + 1
            goto La
        L1d:
            boolean r0 = r8.i
            if (r0 != 0) goto L75
            int r0 = r8.s
            if (r0 != r9) goto L48
            int r0 = r8.t
            if (r0 != r10) goto L48
        L29:
            android.support.constraint.n.k.f r0 = r8.d
            int r4 = r0.C()
            android.support.constraint.n.k.f r0 = r8.d
            int r5 = r0.k()
            android.support.constraint.n.k.f r0 = r8.d
            boolean r6 = r0.b0()
            android.support.constraint.n.k.f r0 = r8.d
            boolean r7 = r0.Z()
            r1 = r8
            r2 = r9
            r3 = r10
            r1.a(r2, r3, r4, r5, r6, r7)
            return
        L48:
            int r0 = r8.s
            if (r0 != r9) goto L75
            int r0 = android.view.View.MeasureSpec.getMode(r9)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L75
            int r0 = android.view.View.MeasureSpec.getMode(r10)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L75
            int r0 = r8.t
            int r0 = android.view.View.MeasureSpec.getMode(r0)
            if (r0 != r2) goto L75
            int r0 = android.view.View.MeasureSpec.getSize(r10)
            android.support.constraint.n.k.f r2 = r8.d
            int r2 = r2.k()
            if (r0 < r2) goto L75
            r8.s = r9
            r8.t = r10
            goto L29
        L75:
            r8.s = r9
            r8.t = r10
            android.support.constraint.n.k.f r0 = r8.d
            boolean r2 = r8.a()
            r0.g(r2)
            boolean r0 = r8.i
            if (r0 == 0) goto L93
            r8.i = r1
            boolean r0 = r8.d()
            if (r0 == 0) goto L93
            android.support.constraint.n.k.f r0 = r8.d
            r0.c0()
        L93:
            android.support.constraint.n.k.f r0 = r8.d
            int r1 = r8.j
            r8.a(r0, r1, r9, r10)
            goto L29
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(android.view.View r4) {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 14
            if (r0 < r1) goto L9
            super.onViewAdded(r4)
        L9:
            android.support.constraint.n.k.e r0 = r3.a(r4)
            boolean r1 = r4 instanceof android.support.constraint.h
            r2 = 1
            if (r1 == 0) goto L2c
            boolean r0 = r0 instanceof android.support.constraint.n.k.g
            if (r0 != 0) goto L2c
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            android.support.constraint.ConstraintLayout$b r0 = (android.support.constraint.ConstraintLayout.b) r0
            android.support.constraint.n.k.g r1 = new android.support.constraint.n.k.g
            r1.<init>()
            r0.m0 = r1
            r0.Y = r2
            android.support.constraint.n.k.g r1 = (android.support.constraint.n.k.g) r1
            int r0 = r0.R
            r1.z(r0)
        L2c:
            boolean r0 = r4 instanceof android.support.constraint.c
            if (r0 == 0) goto L4b
            r0 = r4
            android.support.constraint.c r0 = (android.support.constraint.c) r0
            r0.b()
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            android.support.constraint.ConstraintLayout$b r1 = (android.support.constraint.ConstraintLayout.b) r1
            r1.Z = r2
            java.util.ArrayList<android.support.constraint.c> r1 = r3.f406c
            boolean r1 = r1.contains(r0)
            if (r1 != 0) goto L4b
            java.util.ArrayList<android.support.constraint.c> r1 = r3.f406c
            r1.add(r0)
        L4b:
            android.util.SparseArray<android.view.View> r0 = r3.f405b
            int r1 = r4.getId()
            r0.put(r1, r4)
            r3.i = r2
            return
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 14
            if (r0 < r1) goto L9
            super.onViewRemoved(r3)
        L9:
            android.util.SparseArray<android.view.View> r0 = r2.f405b
            int r1 = r3.getId()
            r0.remove(r1)
            android.support.constraint.n.k.e r0 = r2.a(r3)
            android.support.constraint.n.k.f r1 = r2.d
            r1.c(r0)
            java.util.ArrayList<android.support.constraint.c> r0 = r2.f406c
            r0.remove(r3)
            r3 = 1
            r2.i = r3
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(android.view.View r3) {
            r2 = this;
            super.removeView(r3)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 14
            if (r0 >= r1) goto Lc
            r2.onViewRemoved(r3)
        Lc:
            return
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
            r0 = this;
            r0.b()
            super.requestLayout()
            return
    }

    public void setConstraintSet(android.support.constraint.e r1) {
            r0 = this;
            r0.k = r1
            return
    }

    @Override // android.view.View
    public void setId(int r3) {
            r2 = this;
            android.util.SparseArray<android.view.View> r0 = r2.f405b
            int r1 = r2.getId()
            r0.remove(r1)
            super.setId(r3)
            android.util.SparseArray<android.view.View> r3 = r2.f405b
            int r0 = r2.getId()
            r3.put(r0, r2)
            return
    }

    public void setMaxHeight(int r2) {
            r1 = this;
            int r0 = r1.h
            if (r2 != r0) goto L5
            return
        L5:
            r1.h = r2
            r1.requestLayout()
            return
    }

    public void setMaxWidth(int r2) {
            r1 = this;
            int r0 = r1.g
            if (r2 != r0) goto L5
            return
        L5:
            r1.g = r2
            r1.requestLayout()
            return
    }

    public void setMinHeight(int r2) {
            r1 = this;
            int r0 = r1.f
            if (r2 != r0) goto L5
            return
        L5:
            r1.f = r2
            r1.requestLayout()
            return
    }

    public void setMinWidth(int r2) {
            r1 = this;
            int r0 = r1.e
            if (r2 != r0) goto L5
            return
        L5:
            r1.e = r2
            r1.requestLayout()
            return
    }

    public void setOnConstraintsChanged(android.support.constraint.g r1) {
            r0 = this;
            android.support.constraint.d r0 = r0.l
            if (r0 == 0) goto L7
            r0.a(r1)
        L7:
            return
    }

    public void setOptimizationLevel(int r1) {
            r0 = this;
            r0.j = r1
            android.support.constraint.n.k.f r0 = r0.d
            r0.x(r1)
            return
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
            r0 = this;
            r0 = 0
            return r0
    }
}
