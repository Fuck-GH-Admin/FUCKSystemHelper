package android.support.v7.app;

/* JADX INFO: loaded from: classes.dex */
class AlertController {
    android.support.v4.widget.NestedScrollView A;
    private int B;
    private android.graphics.drawable.Drawable C;
    private android.widget.ImageView D;
    private android.widget.TextView E;
    private android.widget.TextView F;
    private android.view.View G;
    android.widget.ListAdapter H;
    int I;
    private int J;
    private int K;
    int L;
    int M;
    int N;
    int O;
    private boolean P;
    private int Q;
    android.os.Handler R;
    private final android.view.View.OnClickListener S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final android.support.v7.app.g f659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.view.Window f660c;
    private final int d;
    private java.lang.CharSequence e;
    private java.lang.CharSequence f;
    android.widget.ListView g;
    private android.view.View h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private boolean n;
    android.widget.Button o;
    private java.lang.CharSequence p;
    android.os.Message q;
    private android.graphics.drawable.Drawable r;
    android.widget.Button s;
    private java.lang.CharSequence t;
    android.os.Message u;
    private android.graphics.drawable.Drawable v;
    android.widget.Button w;
    private java.lang.CharSequence x;
    android.os.Message y;
    private android.graphics.drawable.Drawable z;

    public static class RecycleListView extends android.widget.ListView {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f661b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f662c;

        public RecycleListView(android.content.Context r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        public RecycleListView(android.content.Context r2, android.util.AttributeSet r3) {
                r1 = this;
                r1.<init>(r2, r3)
                int[] r0 = b.b.d.a.j.RecycleListView
                android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
                int r3 = b.b.d.a.j.RecycleListView_paddingBottomNoButtons
                r0 = -1
                int r3 = r2.getDimensionPixelOffset(r3, r0)
                r1.f662c = r3
                int r3 = b.b.d.a.j.RecycleListView_paddingTopNoTitle
                int r2 = r2.getDimensionPixelOffset(r3, r0)
                r1.f661b = r2
                return
        }

        public void a(boolean r3, boolean r4) {
                r2 = this;
                if (r4 == 0) goto L4
                if (r3 != 0) goto L21
            L4:
                int r0 = r2.getPaddingLeft()
                if (r3 == 0) goto Lf
                int r3 = r2.getPaddingTop()
                goto L11
            Lf:
                int r3 = r2.f661b
            L11:
                int r1 = r2.getPaddingRight()
                if (r4 == 0) goto L1c
                int r4 = r2.getPaddingBottom()
                goto L1e
            L1c:
                int r4 = r2.f662c
            L1e:
                r2.setPadding(r0, r3, r1, r4)
            L21:
                return
        }
    }

    class a implements android.view.View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.support.v7.app.AlertController f663b;

        a(android.support.v7.app.AlertController r1) {
                r0 = this;
                r0.f663b = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r3) {
                r2 = this;
                android.support.v7.app.AlertController r0 = r2.f663b
                android.widget.Button r1 = r0.o
                if (r3 != r1) goto Lf
                android.os.Message r0 = r0.q
                if (r0 == 0) goto Lf
            La:
                android.os.Message r3 = android.os.Message.obtain(r0)
                goto L2a
            Lf:
                android.support.v7.app.AlertController r0 = r2.f663b
                android.widget.Button r1 = r0.s
                if (r3 != r1) goto L1a
                android.os.Message r0 = r0.u
                if (r0 == 0) goto L1a
                goto La
            L1a:
                android.support.v7.app.AlertController r0 = r2.f663b
                android.widget.Button r1 = r0.w
                if (r3 != r1) goto L29
                android.os.Message r3 = r0.y
                if (r3 == 0) goto L29
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L2a
            L29:
                r3 = 0
            L2a:
                if (r3 == 0) goto L2f
                r3.sendToTarget()
            L2f:
                android.support.v7.app.AlertController r2 = r2.f663b
                android.os.Handler r3 = r2.R
                r0 = 1
                android.support.v7.app.g r2 = r2.f659b
                android.os.Message r2 = r3.obtainMessage(r0, r2)
                r2.sendToTarget()
                return
        }
    }

    class b implements android.support.v4.widget.NestedScrollView.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.view.View f664a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.view.View f665b;

        b(android.support.v7.app.AlertController r1, android.view.View r2, android.view.View r3) {
                r0 = this;
                r0.f664a = r2
                r0.f665b = r3
                r0.<init>()
                return
        }

        @Override // android.support.v4.widget.NestedScrollView.b
        public void a(android.support.v4.widget.NestedScrollView r1, int r2, int r3, int r4, int r5) {
                r0 = this;
                android.view.View r2 = r0.f664a
                android.view.View r0 = r0.f665b
                android.support.v7.app.AlertController.a(r1, r2, r0)
                return
        }
    }

    class c implements java.lang.Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.view.View f666b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.view.View f667c;
        final /* synthetic */ android.support.v7.app.AlertController d;

        c(android.support.v7.app.AlertController r1, android.view.View r2, android.view.View r3) {
                r0 = this;
                r0.d = r1
                r0.f666b = r2
                r0.f667c = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                android.support.v7.app.AlertController r0 = r2.d
                android.support.v4.widget.NestedScrollView r0 = r0.A
                android.view.View r1 = r2.f666b
                android.view.View r2 = r2.f667c
                android.support.v7.app.AlertController.a(r0, r1, r2)
                return
        }
    }

    class d implements android.widget.AbsListView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.view.View f668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.view.View f669b;

        d(android.support.v7.app.AlertController r1, android.view.View r2, android.view.View r3) {
                r0 = this;
                r0.f668a = r2
                r0.f669b = r3
                r0.<init>()
                return
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(android.widget.AbsListView r1, int r2, int r3, int r4) {
                r0 = this;
                android.view.View r2 = r0.f668a
                android.view.View r0 = r0.f669b
                android.support.v7.app.AlertController.a(r1, r2, r0)
                return
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(android.widget.AbsListView r1, int r2) {
                r0 = this;
                return
        }
    }

    class e implements java.lang.Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.view.View f670b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.view.View f671c;
        final /* synthetic */ android.support.v7.app.AlertController d;

        e(android.support.v7.app.AlertController r1, android.view.View r2, android.view.View r3) {
                r0 = this;
                r0.d = r1
                r0.f670b = r2
                r0.f671c = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                android.support.v7.app.AlertController r0 = r2.d
                android.widget.ListView r0 = r0.g
                android.view.View r1 = r2.f670b
                android.view.View r2 = r2.f671c
                android.support.v7.app.AlertController.a(r0, r1, r2)
                return
        }
    }

    public static class f {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean E;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public int I;
        public android.content.DialogInterface.OnMultiChoiceClickListener J;
        public android.database.Cursor K;
        public java.lang.String L;
        public java.lang.String M;
        public android.widget.AdapterView.OnItemSelectedListener N;
        public android.support.v7.app.AlertController.f.e O;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.content.Context f672a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final android.view.LayoutInflater f673b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f674c;
        public android.graphics.drawable.Drawable d;
        public int e;
        public java.lang.CharSequence f;
        public android.view.View g;
        public java.lang.CharSequence h;
        public java.lang.CharSequence i;
        public android.graphics.drawable.Drawable j;
        public android.content.DialogInterface.OnClickListener k;
        public java.lang.CharSequence l;
        public android.graphics.drawable.Drawable m;
        public android.content.DialogInterface.OnClickListener n;
        public java.lang.CharSequence o;
        public android.graphics.drawable.Drawable p;
        public android.content.DialogInterface.OnClickListener q;
        public boolean r;
        public android.content.DialogInterface.OnCancelListener s;
        public android.content.DialogInterface.OnDismissListener t;
        public android.content.DialogInterface.OnKeyListener u;
        public java.lang.CharSequence[] v;
        public android.widget.ListAdapter w;
        public android.content.DialogInterface.OnClickListener x;
        public int y;
        public android.view.View z;

        class a extends android.widget.ArrayAdapter<java.lang.CharSequence> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.support.v7.app.AlertController.RecycleListView f675b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ android.support.v7.app.AlertController.f f676c;

            a(android.support.v7.app.AlertController.f r1, android.content.Context r2, int r3, int r4, java.lang.CharSequence[] r5, android.support.v7.app.AlertController.RecycleListView r6) {
                    r0 = this;
                    r0.f676c = r1
                    r0.f675b = r6
                    r0.<init>(r2, r3, r4, r5)
                    return
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public android.view.View getView(int r1, android.view.View r2, android.view.ViewGroup r3) {
                    r0 = this;
                    android.view.View r2 = super.getView(r1, r2, r3)
                    android.support.v7.app.AlertController$f r3 = r0.f676c
                    boolean[] r3 = r3.F
                    if (r3 == 0) goto L14
                    boolean r3 = r3[r1]
                    if (r3 == 0) goto L14
                    android.support.v7.app.AlertController$RecycleListView r0 = r0.f675b
                    r3 = 1
                    r0.setItemChecked(r1, r3)
                L14:
                    return r2
            }
        }

        class b extends android.widget.CursorAdapter {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f677b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final int f678c;
            final /* synthetic */ android.support.v7.app.AlertController.RecycleListView d;
            final /* synthetic */ android.support.v7.app.AlertController e;
            final /* synthetic */ android.support.v7.app.AlertController.f f;

            b(android.support.v7.app.AlertController.f r1, android.content.Context r2, android.database.Cursor r3, boolean r4, android.support.v7.app.AlertController.RecycleListView r5, android.support.v7.app.AlertController r6) {
                    r0 = this;
                    r0.f = r1
                    r0.d = r5
                    r0.e = r6
                    r0.<init>(r2, r3, r4)
                    android.database.Cursor r1 = r0.getCursor()
                    android.support.v7.app.AlertController$f r2 = r0.f
                    java.lang.String r2 = r2.L
                    int r2 = r1.getColumnIndexOrThrow(r2)
                    r0.f677b = r2
                    android.support.v7.app.AlertController$f r2 = r0.f
                    java.lang.String r2 = r2.M
                    int r1 = r1.getColumnIndexOrThrow(r2)
                    r0.f678c = r1
                    return
            }

            @Override // android.widget.CursorAdapter
            public void bindView(android.view.View r1, android.content.Context r2, android.database.Cursor r3) {
                    r0 = this;
                    r2 = 16908308(0x1020014, float:2.3877285E-38)
                    android.view.View r1 = r1.findViewById(r2)
                    android.widget.CheckedTextView r1 = (android.widget.CheckedTextView) r1
                    int r2 = r0.f677b
                    java.lang.String r2 = r3.getString(r2)
                    r1.setText(r2)
                    android.support.v7.app.AlertController$RecycleListView r1 = r0.d
                    int r2 = r3.getPosition()
                    int r0 = r0.f678c
                    int r0 = r3.getInt(r0)
                    r3 = 1
                    if (r0 != r3) goto L22
                    goto L23
                L22:
                    r3 = 0
                L23:
                    r1.setItemChecked(r2, r3)
                    return
            }

            @Override // android.widget.CursorAdapter
            public android.view.View newView(android.content.Context r1, android.database.Cursor r2, android.view.ViewGroup r3) {
                    r0 = this;
                    android.support.v7.app.AlertController$f r1 = r0.f
                    android.view.LayoutInflater r1 = r1.f673b
                    android.support.v7.app.AlertController r0 = r0.e
                    int r0 = r0.M
                    r2 = 0
                    android.view.View r0 = r1.inflate(r0, r3, r2)
                    return r0
            }
        }

        class c implements android.widget.AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.support.v7.app.AlertController f679b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ android.support.v7.app.AlertController.f f680c;

            c(android.support.v7.app.AlertController.f r1, android.support.v7.app.AlertController r2) {
                    r0 = this;
                    r0.f680c = r1
                    r0.f679b = r2
                    r0.<init>()
                    return
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
                    r0 = this;
                    android.support.v7.app.AlertController$f r1 = r0.f680c
                    android.content.DialogInterface$OnClickListener r1 = r1.x
                    android.support.v7.app.AlertController r2 = r0.f679b
                    android.support.v7.app.g r2 = r2.f659b
                    r1.onClick(r2, r3)
                    android.support.v7.app.AlertController$f r1 = r0.f680c
                    boolean r1 = r1.H
                    if (r1 != 0) goto L18
                    android.support.v7.app.AlertController r0 = r0.f679b
                    android.support.v7.app.g r0 = r0.f659b
                    r0.dismiss()
                L18:
                    return
            }
        }

        class d implements android.widget.AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.support.v7.app.AlertController.RecycleListView f681b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ android.support.v7.app.AlertController f682c;
            final /* synthetic */ android.support.v7.app.AlertController.f d;

            d(android.support.v7.app.AlertController.f r1, android.support.v7.app.AlertController.RecycleListView r2, android.support.v7.app.AlertController r3) {
                    r0 = this;
                    r0.d = r1
                    r0.f681b = r2
                    r0.f682c = r3
                    r0.<init>()
                    return
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
                    r0 = this;
                    android.support.v7.app.AlertController$f r1 = r0.d
                    boolean[] r1 = r1.F
                    if (r1 == 0) goto Le
                    android.support.v7.app.AlertController$RecycleListView r2 = r0.f681b
                    boolean r2 = r2.isItemChecked(r3)
                    r1[r3] = r2
                Le:
                    android.support.v7.app.AlertController$f r1 = r0.d
                    android.content.DialogInterface$OnMultiChoiceClickListener r1 = r1.J
                    android.support.v7.app.AlertController r2 = r0.f682c
                    android.support.v7.app.g r2 = r2.f659b
                    android.support.v7.app.AlertController$RecycleListView r0 = r0.f681b
                    boolean r0 = r0.isItemChecked(r3)
                    r1.onClick(r2, r3, r0)
                    return
            }
        }

        public interface e {
            void a(android.widget.ListView r1);
        }

        public f(android.content.Context r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f674c = r0
                r1.e = r0
                r1.E = r0
                r0 = -1
                r1.I = r0
                r1.f672a = r2
                r0 = 1
                r1.r = r0
                java.lang.String r0 = "layout_inflater"
                java.lang.Object r2 = r2.getSystemService(r0)
                android.view.LayoutInflater r2 = (android.view.LayoutInflater) r2
                r1.f673b = r2
                return
        }

        private void b(android.support.v7.app.AlertController r11) {
                r10 = this;
                android.view.LayoutInflater r0 = r10.f673b
                int r1 = r11.L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                android.support.v7.app.AlertController$RecycleListView r0 = (android.support.v7.app.AlertController.RecycleListView) r0
                boolean r1 = r10.G
                r8 = 1
                if (r1 == 0) goto L35
                android.database.Cursor r1 = r10.K
                if (r1 != 0) goto L26
                android.support.v7.app.AlertController$f$a r9 = new android.support.v7.app.AlertController$f$a
                android.content.Context r3 = r10.f672a
                int r4 = r11.M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r10.v
                r1 = r9
                r2 = r10
                r7 = r0
                r1.<init>(r2, r3, r4, r5, r6, r7)
                goto L6b
            L26:
                android.support.v7.app.AlertController$f$b r9 = new android.support.v7.app.AlertController$f$b
                android.content.Context r3 = r10.f672a
                android.database.Cursor r4 = r10.K
                r5 = 0
                r1 = r9
                r2 = r10
                r6 = r0
                r7 = r11
                r1.<init>(r2, r3, r4, r5, r6, r7)
                goto L6b
            L35:
                boolean r1 = r10.H
                if (r1 == 0) goto L3c
                int r1 = r11.N
                goto L3e
            L3c:
                int r1 = r11.O
            L3e:
                r4 = r1
                android.database.Cursor r1 = r10.K
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L5d
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r10.f672a
                android.database.Cursor r5 = r10.K
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r1 = r10.L
                r7 = 0
                r6[r7] = r1
                int[] r1 = new int[r8]
                r1[r7] = r2
                r2 = r9
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L5d:
                android.widget.ListAdapter r9 = r10.w
                if (r9 == 0) goto L62
                goto L6b
            L62:
                android.support.v7.app.AlertController$h r9 = new android.support.v7.app.AlertController$h
                android.content.Context r1 = r10.f672a
                java.lang.CharSequence[] r3 = r10.v
                r9.<init>(r1, r4, r2, r3)
            L6b:
                android.support.v7.app.AlertController$f$e r1 = r10.O
                if (r1 == 0) goto L72
                r1.a(r0)
            L72:
                r11.H = r9
                int r1 = r10.I
                r11.I = r1
                android.content.DialogInterface$OnClickListener r1 = r10.x
                if (r1 == 0) goto L85
                android.support.v7.app.AlertController$f$c r1 = new android.support.v7.app.AlertController$f$c
                r1.<init>(r10, r11)
            L81:
                r0.setOnItemClickListener(r1)
                goto L8f
            L85:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r10.J
                if (r1 == 0) goto L8f
                android.support.v7.app.AlertController$f$d r1 = new android.support.v7.app.AlertController$f$d
                r1.<init>(r10, r0, r11)
                goto L81
            L8f:
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.N
                if (r1 == 0) goto L96
                r0.setOnItemSelectedListener(r1)
            L96:
                boolean r1 = r10.H
                if (r1 == 0) goto L9e
                r0.setChoiceMode(r8)
                goto La6
            L9e:
                boolean r10 = r10.G
                if (r10 == 0) goto La6
                r10 = 2
                r0.setChoiceMode(r10)
            La6:
                r11.g = r0
                return
        }

        public void a(android.support.v7.app.AlertController r8) {
                r7 = this;
                android.view.View r0 = r7.g
                if (r0 == 0) goto L8
                r8.a(r0)
                goto L28
            L8:
                java.lang.CharSequence r0 = r7.f
                if (r0 == 0) goto Lf
                r8.b(r0)
            Lf:
                android.graphics.drawable.Drawable r0 = r7.d
                if (r0 == 0) goto L16
                r8.a(r0)
            L16:
                int r0 = r7.f674c
                if (r0 == 0) goto L1d
                r8.b(r0)
            L1d:
                int r0 = r7.e
                if (r0 == 0) goto L28
                int r0 = r8.a(r0)
                r8.b(r0)
            L28:
                java.lang.CharSequence r0 = r7.h
                if (r0 == 0) goto L2f
                r8.a(r0)
            L2f:
                java.lang.CharSequence r0 = r7.i
                if (r0 != 0) goto L37
                android.graphics.drawable.Drawable r0 = r7.j
                if (r0 == 0) goto L43
            L37:
                r2 = -1
                java.lang.CharSequence r3 = r7.i
                android.content.DialogInterface$OnClickListener r4 = r7.k
                r5 = 0
                android.graphics.drawable.Drawable r6 = r7.j
                r1 = r8
                r1.a(r2, r3, r4, r5, r6)
            L43:
                java.lang.CharSequence r0 = r7.l
                if (r0 != 0) goto L4b
                android.graphics.drawable.Drawable r0 = r7.m
                if (r0 == 0) goto L57
            L4b:
                r2 = -2
                java.lang.CharSequence r3 = r7.l
                android.content.DialogInterface$OnClickListener r4 = r7.n
                r5 = 0
                android.graphics.drawable.Drawable r6 = r7.m
                r1 = r8
                r1.a(r2, r3, r4, r5, r6)
            L57:
                java.lang.CharSequence r0 = r7.o
                if (r0 != 0) goto L5f
                android.graphics.drawable.Drawable r0 = r7.p
                if (r0 == 0) goto L6b
            L5f:
                r2 = -3
                java.lang.CharSequence r3 = r7.o
                android.content.DialogInterface$OnClickListener r4 = r7.q
                r5 = 0
                android.graphics.drawable.Drawable r6 = r7.p
                r1 = r8
                r1.a(r2, r3, r4, r5, r6)
            L6b:
                java.lang.CharSequence[] r0 = r7.v
                if (r0 != 0) goto L77
                android.database.Cursor r0 = r7.K
                if (r0 != 0) goto L77
                android.widget.ListAdapter r0 = r7.w
                if (r0 == 0) goto L7a
            L77:
                r7.b(r8)
            L7a:
                android.view.View r2 = r7.z
                if (r2 == 0) goto L93
                boolean r0 = r7.E
                if (r0 == 0) goto L8f
                int r3 = r7.A
                int r4 = r7.B
                int r5 = r7.C
                int r6 = r7.D
                r1 = r8
                r1.a(r2, r3, r4, r5, r6)
                goto L9a
            L8f:
                r8.b(r2)
                goto L9a
            L93:
                int r7 = r7.y
                if (r7 == 0) goto L9a
                r8.c(r7)
            L9a:
                return
        }
    }

    private static final class g extends android.os.Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.ref.WeakReference<android.content.DialogInterface> f683a;

        public g(android.content.DialogInterface r2) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.f683a = r0
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r3) {
                r2 = this;
                int r0 = r3.what
                r1 = -3
                if (r0 == r1) goto L17
                r1 = -2
                if (r0 == r1) goto L17
                r1 = -1
                if (r0 == r1) goto L17
                r2 = 1
                if (r0 == r2) goto Lf
                goto L28
            Lf:
                java.lang.Object r2 = r3.obj
                android.content.DialogInterface r2 = (android.content.DialogInterface) r2
                r2.dismiss()
                goto L28
            L17:
                java.lang.Object r0 = r3.obj
                android.content.DialogInterface$OnClickListener r0 = (android.content.DialogInterface.OnClickListener) r0
                java.lang.ref.WeakReference<android.content.DialogInterface> r2 = r2.f683a
                java.lang.Object r2 = r2.get()
                android.content.DialogInterface r2 = (android.content.DialogInterface) r2
                int r3 = r3.what
                r0.onClick(r2, r3)
            L28:
                return
        }
    }

    private static class h extends android.widget.ArrayAdapter<java.lang.CharSequence> {
        public h(android.content.Context r1, int r2, int r3, java.lang.CharSequence[] r4) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int r1) {
                r0 = this;
                long r0 = (long) r1
                return r0
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
                r0 = this;
                r0 = 1
                return r0
        }
    }

    public AlertController(android.content.Context r4, android.support.v7.app.g r5, android.view.Window r6) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.n = r0
            r3.B = r0
            r1 = -1
            r3.I = r1
            r3.Q = r0
            android.support.v7.app.AlertController$a r1 = new android.support.v7.app.AlertController$a
            r1.<init>(r3)
            r3.S = r1
            r3.f658a = r4
            r3.f659b = r5
            r3.f660c = r6
            android.support.v7.app.AlertController$g r6 = new android.support.v7.app.AlertController$g
            r6.<init>(r5)
            r3.R = r6
            int[] r6 = b.b.d.a.j.AlertDialog
            int r1 = b.b.d.a.a.alertDialogStyle
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r2, r6, r1, r0)
            int r6 = b.b.d.a.j.AlertDialog_android_layout
            int r6 = r4.getResourceId(r6, r0)
            r3.J = r6
            int r6 = b.b.d.a.j.AlertDialog_buttonPanelSideLayout
            int r6 = r4.getResourceId(r6, r0)
            r3.K = r6
            int r6 = b.b.d.a.j.AlertDialog_listLayout
            int r6 = r4.getResourceId(r6, r0)
            r3.L = r6
            int r6 = b.b.d.a.j.AlertDialog_multiChoiceItemLayout
            int r6 = r4.getResourceId(r6, r0)
            r3.M = r6
            int r6 = b.b.d.a.j.AlertDialog_singleChoiceItemLayout
            int r6 = r4.getResourceId(r6, r0)
            r3.N = r6
            int r6 = b.b.d.a.j.AlertDialog_listItemLayout
            int r6 = r4.getResourceId(r6, r0)
            r3.O = r6
            int r6 = b.b.d.a.j.AlertDialog_showTitle
            r1 = 1
            boolean r6 = r4.getBoolean(r6, r1)
            r3.P = r6
            int r6 = b.b.d.a.j.AlertDialog_buttonIconDimen
            int r6 = r4.getDimensionPixelSize(r6, r0)
            r3.d = r6
            r4.recycle()
            r5.a(r1)
            return
    }

    private android.view.ViewGroup a(android.view.View r2, android.view.View r3) {
            r1 = this;
            if (r2 != 0) goto Lf
            boolean r1 = r3 instanceof android.view.ViewStub
            if (r1 == 0) goto Lc
            android.view.ViewStub r3 = (android.view.ViewStub) r3
            android.view.View r3 = r3.inflate()
        Lc:
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            return r3
        Lf:
            if (r3 == 0) goto L1e
            android.view.ViewParent r1 = r3.getParent()
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L1e
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r1.removeView(r3)
        L1e:
            boolean r1 = r2 instanceof android.view.ViewStub
            if (r1 == 0) goto L28
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            android.view.View r2 = r2.inflate()
        L28:
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            return r2
    }

    static void a(android.view.View r3, android.view.View r4, android.view.View r5) {
            r0 = 0
            r1 = 4
            if (r4 == 0) goto L11
            r2 = -1
            boolean r2 = r3.canScrollVertically(r2)
            if (r2 == 0) goto Ld
            r2 = r0
            goto Le
        Ld:
            r2 = r1
        Le:
            r4.setVisibility(r2)
        L11:
            if (r5 == 0) goto L1f
            r4 = 1
            boolean r3 = r3.canScrollVertically(r4)
            if (r3 == 0) goto L1b
            goto L1c
        L1b:
            r0 = r1
        L1c:
            r5.setVisibility(r0)
        L1f:
            return
    }

    private void a(android.view.ViewGroup r8) {
            r7 = this;
            r0 = 16908313(0x1020019, float:2.38773E-38)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r7.o = r0
            android.view.View$OnClickListener r1 = r7.S
            r0.setOnClickListener(r1)
            java.lang.CharSequence r0 = r7.p
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1
            r2 = 8
            r3 = 0
            r4 = 0
            if (r0 == 0) goto L28
            android.graphics.drawable.Drawable r0 = r7.r
            if (r0 != 0) goto L28
            android.widget.Button r0 = r7.o
            r0.setVisibility(r2)
            r0 = r4
            goto L45
        L28:
            android.widget.Button r0 = r7.o
            java.lang.CharSequence r5 = r7.p
            r0.setText(r5)
            android.graphics.drawable.Drawable r0 = r7.r
            if (r0 == 0) goto L3f
            int r5 = r7.d
            r0.setBounds(r4, r4, r5, r5)
            android.widget.Button r0 = r7.o
            android.graphics.drawable.Drawable r5 = r7.r
            r0.setCompoundDrawables(r5, r3, r3, r3)
        L3f:
            android.widget.Button r0 = r7.o
            r0.setVisibility(r4)
            r0 = r1
        L45:
            r5 = 16908314(0x102001a, float:2.3877302E-38)
            android.view.View r5 = r8.findViewById(r5)
            android.widget.Button r5 = (android.widget.Button) r5
            r7.s = r5
            android.view.View$OnClickListener r6 = r7.S
            r5.setOnClickListener(r6)
            java.lang.CharSequence r5 = r7.t
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L67
            android.graphics.drawable.Drawable r5 = r7.v
            if (r5 != 0) goto L67
            android.widget.Button r5 = r7.s
            r5.setVisibility(r2)
            goto L85
        L67:
            android.widget.Button r5 = r7.s
            java.lang.CharSequence r6 = r7.t
            r5.setText(r6)
            android.graphics.drawable.Drawable r5 = r7.v
            if (r5 == 0) goto L7e
            int r6 = r7.d
            r5.setBounds(r4, r4, r6, r6)
            android.widget.Button r5 = r7.s
            android.graphics.drawable.Drawable r6 = r7.v
            r5.setCompoundDrawables(r6, r3, r3, r3)
        L7e:
            android.widget.Button r5 = r7.s
            r5.setVisibility(r4)
            r0 = r0 | 2
        L85:
            r5 = 16908315(0x102001b, float:2.3877305E-38)
            android.view.View r5 = r8.findViewById(r5)
            android.widget.Button r5 = (android.widget.Button) r5
            r7.w = r5
            android.view.View$OnClickListener r6 = r7.S
            r5.setOnClickListener(r6)
            java.lang.CharSequence r5 = r7.x
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto La7
            android.graphics.drawable.Drawable r5 = r7.z
            if (r5 != 0) goto La7
            android.widget.Button r3 = r7.w
            r3.setVisibility(r2)
            goto Lc5
        La7:
            android.widget.Button r5 = r7.w
            java.lang.CharSequence r6 = r7.x
            r5.setText(r6)
            android.graphics.drawable.Drawable r5 = r7.r
            if (r5 == 0) goto Lbe
            int r6 = r7.d
            r5.setBounds(r4, r4, r6, r6)
            android.widget.Button r5 = r7.o
            android.graphics.drawable.Drawable r6 = r7.r
            r5.setCompoundDrawables(r6, r3, r3, r3)
        Lbe:
            android.widget.Button r3 = r7.w
            r3.setVisibility(r4)
            r0 = r0 | 4
        Lc5:
            android.content.Context r3 = r7.f658a
            boolean r3 = a(r3)
            if (r3 == 0) goto Le1
            if (r0 != r1) goto Ld5
            android.widget.Button r3 = r7.o
        Ld1:
            r7.a(r3)
            goto Le1
        Ld5:
            r3 = 2
            if (r0 != r3) goto Ldb
            android.widget.Button r3 = r7.s
            goto Ld1
        Ldb:
            r3 = 4
            if (r0 != r3) goto Le1
            android.widget.Button r3 = r7.w
            goto Ld1
        Le1:
            if (r0 == 0) goto Le4
            goto Le5
        Le4:
            r1 = r4
        Le5:
            if (r1 != 0) goto Lea
            r8.setVisibility(r2)
        Lea:
            return
    }

    private void a(android.view.ViewGroup r5, android.view.View r6, int r7, int r8) {
            r4 = this;
            android.view.Window r0 = r4.f660c
            int r1 = b.b.d.a.f.scrollIndicatorUp
            android.view.View r0 = r0.findViewById(r1)
            android.view.Window r1 = r4.f660c
            int r2 = b.b.d.a.f.scrollIndicatorDown
            android.view.View r1 = r1.findViewById(r2)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r2 < r3) goto L24
            b.b.c.g.q.a(r6, r7, r8)
            if (r0 == 0) goto L1e
            r5.removeView(r0)
        L1e:
            if (r1 == 0) goto L75
        L20:
            r5.removeView(r1)
            goto L75
        L24:
            r6 = 0
            if (r0 == 0) goto L2f
            r8 = r7 & 1
            if (r8 != 0) goto L2f
            r5.removeView(r0)
            r0 = r6
        L2f:
            if (r1 == 0) goto L39
            r7 = r7 & 2
            if (r7 != 0) goto L39
            r5.removeView(r1)
            r1 = r6
        L39:
            if (r0 != 0) goto L3d
            if (r1 == 0) goto L75
        L3d:
            java.lang.CharSequence r6 = r4.f
            if (r6 == 0) goto L56
            android.support.v4.widget.NestedScrollView r5 = r4.A
            android.support.v7.app.AlertController$b r6 = new android.support.v7.app.AlertController$b
            r6.<init>(r4, r0, r1)
            r5.setOnScrollChangeListener(r6)
            android.support.v4.widget.NestedScrollView r5 = r4.A
            android.support.v7.app.AlertController$c r6 = new android.support.v7.app.AlertController$c
            r6.<init>(r4, r0, r1)
            r5.post(r6)
            goto L75
        L56:
            android.widget.ListView r6 = r4.g
            if (r6 == 0) goto L6d
            android.support.v7.app.AlertController$d r5 = new android.support.v7.app.AlertController$d
            r5.<init>(r4, r0, r1)
            r6.setOnScrollListener(r5)
            android.widget.ListView r5 = r4.g
            android.support.v7.app.AlertController$e r6 = new android.support.v7.app.AlertController$e
            r6.<init>(r4, r0, r1)
            r5.post(r6)
            goto L75
        L6d:
            if (r0 == 0) goto L72
            r5.removeView(r0)
        L72:
            if (r1 == 0) goto L75
            goto L20
        L75:
            return
    }

    private void a(android.widget.Button r2) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            r0 = 1
            r1.gravity = r0
            r0 = 1056964608(0x3f000000, float:0.5)
            r1.weight = r0
            r2.setLayoutParams(r1)
            return
    }

    private static boolean a(android.content.Context r3) {
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.res.Resources$Theme r3 = r3.getTheme()
            int r1 = b.b.d.a.a.alertDialogCenterButtons
            r2 = 1
            r3.resolveAttribute(r1, r0, r2)
            int r3 = r0.data
            if (r3 == 0) goto L14
            goto L15
        L14:
            r2 = 0
        L15:
            return r2
    }

    private int b() {
            r3 = this;
            int r0 = r3.K
            if (r0 != 0) goto L7
            int r3 = r3.J
            return r3
        L7:
            int r1 = r3.Q
            r2 = 1
            if (r1 != r2) goto Ld
            return r0
        Ld:
            int r3 = r3.J
            return r3
    }

    private void b(android.view.ViewGroup r4) {
            r3 = this;
            android.view.Window r0 = r3.f660c
            int r1 = b.b.d.a.f.scrollView
            android.view.View r0 = r0.findViewById(r1)
            android.support.v4.widget.NestedScrollView r0 = (android.support.v4.widget.NestedScrollView) r0
            r3.A = r0
            r1 = 0
            r0.setFocusable(r1)
            android.support.v4.widget.NestedScrollView r0 = r3.A
            r0.setNestedScrollingEnabled(r1)
            r0 = 16908299(0x102000b, float:2.387726E-38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.F = r0
            if (r0 != 0) goto L23
            return
        L23:
            java.lang.CharSequence r1 = r3.f
            if (r1 == 0) goto L2b
            r0.setText(r1)
            goto L5b
        L2b:
            r1 = 8
            r0.setVisibility(r1)
            android.support.v4.widget.NestedScrollView r0 = r3.A
            android.widget.TextView r2 = r3.F
            r0.removeView(r2)
            android.widget.ListView r0 = r3.g
            if (r0 == 0) goto L58
            android.support.v4.widget.NestedScrollView r4 = r3.A
            android.view.ViewParent r4 = r4.getParent()
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            android.support.v4.widget.NestedScrollView r0 = r3.A
            int r0 = r4.indexOfChild(r0)
            r4.removeViewAt(r0)
            android.widget.ListView r3 = r3.g
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r2 = -1
            r1.<init>(r2, r2)
            r4.addView(r3, r0, r1)
            goto L5b
        L58:
            r4.setVisibility(r1)
        L5b:
            return
    }

    private void c() {
            r9 = this;
            android.view.Window r0 = r9.f660c
            int r1 = b.b.d.a.f.parentPanel
            android.view.View r0 = r0.findViewById(r1)
            int r1 = b.b.d.a.f.topPanel
            android.view.View r1 = r0.findViewById(r1)
            int r2 = b.b.d.a.f.contentPanel
            android.view.View r2 = r0.findViewById(r2)
            int r3 = b.b.d.a.f.buttonPanel
            android.view.View r3 = r0.findViewById(r3)
            int r4 = b.b.d.a.f.customPanel
            android.view.View r0 = r0.findViewById(r4)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r9.c(r0)
            int r4 = b.b.d.a.f.topPanel
            android.view.View r4 = r0.findViewById(r4)
            int r5 = b.b.d.a.f.contentPanel
            android.view.View r5 = r0.findViewById(r5)
            int r6 = b.b.d.a.f.buttonPanel
            android.view.View r6 = r0.findViewById(r6)
            android.view.ViewGroup r1 = r9.a(r4, r1)
            android.view.ViewGroup r2 = r9.a(r5, r2)
            android.view.ViewGroup r3 = r9.a(r6, r3)
            r9.b(r2)
            r9.a(r3)
            r9.d(r1)
            r4 = 8
            r5 = 1
            r6 = 0
            if (r0 == 0) goto L5a
            int r0 = r0.getVisibility()
            if (r0 == r4) goto L5a
            r0 = r5
            goto L5b
        L5a:
            r0 = r6
        L5b:
            if (r1 == 0) goto L65
            int r7 = r1.getVisibility()
            if (r7 == r4) goto L65
            r7 = r5
            goto L66
        L65:
            r7 = r6
        L66:
            if (r3 == 0) goto L70
            int r3 = r3.getVisibility()
            if (r3 == r4) goto L70
            r3 = r5
            goto L71
        L70:
            r3 = r6
        L71:
            if (r3 != 0) goto L80
            if (r2 == 0) goto L80
            int r4 = b.b.d.a.f.textSpacerNoButtons
            android.view.View r4 = r2.findViewById(r4)
            if (r4 == 0) goto L80
            r4.setVisibility(r6)
        L80:
            if (r7 == 0) goto L9e
            android.support.v4.widget.NestedScrollView r4 = r9.A
            if (r4 == 0) goto L89
            r4.setClipToPadding(r5)
        L89:
            r4 = 0
            java.lang.CharSequence r8 = r9.f
            if (r8 != 0) goto L92
            android.widget.ListView r8 = r9.g
            if (r8 == 0) goto L98
        L92:
            int r4 = b.b.d.a.f.titleDividerNoCustom
            android.view.View r4 = r1.findViewById(r4)
        L98:
            if (r4 == 0) goto Lab
            r4.setVisibility(r6)
            goto Lab
        L9e:
            if (r2 == 0) goto Lab
            int r1 = b.b.d.a.f.textSpacerNoTitle
            android.view.View r1 = r2.findViewById(r1)
            if (r1 == 0) goto Lab
            r1.setVisibility(r6)
        Lab:
            android.widget.ListView r1 = r9.g
            boolean r4 = r1 instanceof android.support.v7.app.AlertController.RecycleListView
            if (r4 == 0) goto Lb6
            android.support.v7.app.AlertController$RecycleListView r1 = (android.support.v7.app.AlertController.RecycleListView) r1
            r1.a(r7, r3)
        Lb6:
            if (r0 != 0) goto Lca
            android.widget.ListView r0 = r9.g
            if (r0 == 0) goto Lbd
            goto Lbf
        Lbd:
            android.support.v4.widget.NestedScrollView r0 = r9.A
        Lbf:
            if (r0 == 0) goto Lca
            if (r3 == 0) goto Lc4
            r6 = 2
        Lc4:
            r1 = r7 | r6
            r3 = 3
            r9.a(r2, r0, r1, r3)
        Lca:
            android.widget.ListView r0 = r9.g
            if (r0 == 0) goto Le0
            android.widget.ListAdapter r1 = r9.H
            if (r1 == 0) goto Le0
            r0.setAdapter(r1)
            int r9 = r9.I
            r1 = -1
            if (r9 <= r1) goto Le0
            r0.setItemChecked(r9, r5)
            r0.setSelection(r9)
        Le0:
            return
    }

    private void c(android.view.ViewGroup r6) {
            r5 = this;
            android.view.View r0 = r5.h
            r1 = 0
            if (r0 == 0) goto L6
            goto L18
        L6:
            int r0 = r5.i
            if (r0 == 0) goto L17
            android.content.Context r0 = r5.f658a
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r2 = r5.i
            android.view.View r0 = r0.inflate(r2, r6, r1)
            goto L18
        L17:
            r0 = 0
        L18:
            if (r0 == 0) goto L1b
            r1 = 1
        L1b:
            if (r1 == 0) goto L23
            boolean r2 = c(r0)
            if (r2 != 0) goto L2a
        L23:
            android.view.Window r2 = r5.f660c
            r3 = 131072(0x20000, float:1.83671E-40)
            r2.setFlags(r3, r3)
        L2a:
            if (r1 == 0) goto L5c
            android.view.Window r1 = r5.f660c
            int r2 = b.b.d.a.f.custom
            android.view.View r1 = r1.findViewById(r2)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r3 = -1
            r2.<init>(r3, r3)
            r1.addView(r0, r2)
            boolean r0 = r5.n
            if (r0 == 0) goto L4e
            int r0 = r5.j
            int r2 = r5.k
            int r3 = r5.l
            int r4 = r5.m
            r1.setPadding(r0, r2, r3, r4)
        L4e:
            android.widget.ListView r5 = r5.g
            if (r5 == 0) goto L61
            android.view.ViewGroup$LayoutParams r5 = r6.getLayoutParams()
            android.support.v7.widget.g0$a r5 = (android.support.v7.widget.g0.a) r5
            r6 = 0
            r5.f857a = r6
            goto L61
        L5c:
            r5 = 8
            r6.setVisibility(r5)
        L61:
            return
    }

    static boolean c(android.view.View r4) {
            boolean r0 = r4.onCheckIsTextEditor()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r4 instanceof android.view.ViewGroup
            r2 = 0
            if (r0 != 0) goto Le
            return r2
        Le:
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r0 = r4.getChildCount()
        L14:
            if (r0 <= 0) goto L23
            int r0 = r0 + (-1)
            android.view.View r3 = r4.getChildAt(r0)
            boolean r3 = c(r3)
            if (r3 == 0) goto L14
            return r1
        L23:
            return r2
    }

    private void d(android.view.ViewGroup r6) {
            r5 = this;
            android.view.View r0 = r5.G
            r1 = 8
            if (r0 == 0) goto L20
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r2 = -1
            r3 = -2
            r0.<init>(r2, r3)
            android.view.View r2 = r5.G
            r3 = 0
            r6.addView(r2, r3, r0)
            android.view.Window r5 = r5.f660c
            int r6 = b.b.d.a.f.title_template
            android.view.View r5 = r5.findViewById(r6)
            r5.setVisibility(r1)
            goto L96
        L20:
            android.view.Window r0 = r5.f660c
            r2 = 16908294(0x1020006, float:2.3877246E-38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r5.D = r0
            java.lang.CharSequence r0 = r5.e
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L83
            boolean r0 = r5.P
            if (r0 == 0) goto L83
            android.view.Window r6 = r5.f660c
            int r0 = b.b.d.a.f.alertTitle
            android.view.View r6 = r6.findViewById(r0)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r5.E = r6
            java.lang.CharSequence r0 = r5.e
            r6.setText(r0)
            int r6 = r5.B
            if (r6 == 0) goto L56
            android.widget.ImageView r5 = r5.D
            r5.setImageResource(r6)
            goto L96
        L56:
            android.graphics.drawable.Drawable r6 = r5.C
            if (r6 == 0) goto L60
            android.widget.ImageView r5 = r5.D
            r5.setImageDrawable(r6)
            goto L96
        L60:
            android.widget.TextView r6 = r5.E
            android.widget.ImageView r0 = r5.D
            int r0 = r0.getPaddingLeft()
            android.widget.ImageView r2 = r5.D
            int r2 = r2.getPaddingTop()
            android.widget.ImageView r3 = r5.D
            int r3 = r3.getPaddingRight()
            android.widget.ImageView r4 = r5.D
            int r4 = r4.getPaddingBottom()
            r6.setPadding(r0, r2, r3, r4)
            android.widget.ImageView r5 = r5.D
            r5.setVisibility(r1)
            goto L96
        L83:
            android.view.Window r0 = r5.f660c
            int r2 = b.b.d.a.f.title_template
            android.view.View r0 = r0.findViewById(r2)
            r0.setVisibility(r1)
            android.widget.ImageView r5 = r5.D
            r5.setVisibility(r1)
            r6.setVisibility(r1)
        L96:
            return
    }

    public int a(int r3) {
            r2 = this;
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r2 = r2.f658a
            android.content.res.Resources$Theme r2 = r2.getTheme()
            r1 = 1
            r2.resolveAttribute(r3, r0, r1)
            int r2 = r0.resourceId
            return r2
    }

    public void a() {
            r2 = this;
            int r0 = r2.b()
            android.support.v7.app.g r1 = r2.f659b
            r1.setContentView(r0)
            r2.c()
            return
    }

    public void a(int r1, java.lang.CharSequence r2, android.content.DialogInterface.OnClickListener r3, android.os.Message r4, android.graphics.drawable.Drawable r5) {
            r0 = this;
            if (r4 != 0) goto La
            if (r3 == 0) goto La
            android.os.Handler r4 = r0.R
            android.os.Message r4 = r4.obtainMessage(r1, r3)
        La:
            r3 = -3
            if (r1 == r3) goto L29
            r3 = -2
            if (r1 == r3) goto L22
            r3 = -1
            if (r1 != r3) goto L1a
            r0.p = r2
            r0.q = r4
            r0.r = r5
            goto L2f
        L1a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Button does not exist"
            r0.<init>(r1)
            throw r0
        L22:
            r0.t = r2
            r0.u = r4
            r0.v = r5
            goto L2f
        L29:
            r0.x = r2
            r0.y = r4
            r0.z = r5
        L2f:
            return
    }

    public void a(android.graphics.drawable.Drawable r3) {
            r2 = this;
            r2.C = r3
            r0 = 0
            r2.B = r0
            android.widget.ImageView r1 = r2.D
            if (r1 == 0) goto L19
            if (r3 == 0) goto L14
            r1.setVisibility(r0)
            android.widget.ImageView r2 = r2.D
            r2.setImageDrawable(r3)
            goto L19
        L14:
            r2 = 8
            r1.setVisibility(r2)
        L19:
            return
    }

    public void a(android.view.View r1) {
            r0 = this;
            r0.G = r1
            return
    }

    public void a(android.view.View r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            r0.h = r1
            r1 = 0
            r0.i = r1
            r1 = 1
            r0.n = r1
            r0.j = r2
            r0.k = r3
            r0.l = r4
            r0.m = r5
            return
    }

    public void a(java.lang.CharSequence r1) {
            r0 = this;
            r0.f = r1
            android.widget.TextView r0 = r0.F
            if (r0 == 0) goto L9
            r0.setText(r1)
        L9:
            return
    }

    public boolean a(int r1, android.view.KeyEvent r2) {
            r0 = this;
            android.support.v4.widget.NestedScrollView r0 = r0.A
            if (r0 == 0) goto Lc
            boolean r0 = r0.a(r2)
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public void b(int r2) {
            r1 = this;
            r0 = 0
            r1.C = r0
            r1.B = r2
            android.widget.ImageView r0 = r1.D
            if (r0 == 0) goto L1c
            if (r2 == 0) goto L17
            r2 = 0
            r0.setVisibility(r2)
            android.widget.ImageView r2 = r1.D
            int r1 = r1.B
            r2.setImageResource(r1)
            goto L1c
        L17:
            r1 = 8
            r0.setVisibility(r1)
        L1c:
            return
    }

    public void b(android.view.View r1) {
            r0 = this;
            r0.h = r1
            r1 = 0
            r0.i = r1
            r0.n = r1
            return
    }

    public void b(java.lang.CharSequence r1) {
            r0 = this;
            r0.e = r1
            android.widget.TextView r0 = r0.E
            if (r0 == 0) goto L9
            r0.setText(r1)
        L9:
            return
    }

    public boolean b(int r1, android.view.KeyEvent r2) {
            r0 = this;
            android.support.v4.widget.NestedScrollView r0 = r0.A
            if (r0 == 0) goto Lc
            boolean r0 = r0.a(r2)
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public void c(int r2) {
            r1 = this;
            r0 = 0
            r1.h = r0
            r1.i = r2
            r2 = 0
            r1.n = r2
            return
    }
}
