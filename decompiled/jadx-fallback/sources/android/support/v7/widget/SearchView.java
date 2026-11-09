package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends android.support.v7.widget.g0 implements b.b.d.d.c {
    static final android.support.v7.widget.SearchView.k r0 = null;
    private android.graphics.Rect A;
    private android.graphics.Rect B;
    private int[] C;
    private int[] D;
    private final android.widget.ImageView E;
    private final android.graphics.drawable.Drawable F;
    private final int G;
    private final int H;
    private final android.content.Intent I;
    private final android.content.Intent J;
    private final java.lang.CharSequence K;
    private android.support.v7.widget.SearchView.m L;
    private android.support.v7.widget.SearchView.l M;
    android.view.View.OnFocusChangeListener N;
    private android.support.v7.widget.SearchView.n O;
    private android.view.View.OnClickListener P;
    private boolean Q;
    private boolean R;
    android.support.v4.widget.d S;
    private boolean T;
    private java.lang.CharSequence U;
    private boolean V;
    private boolean W;
    private int a0;
    private boolean b0;
    private java.lang.CharSequence c0;
    private java.lang.CharSequence d0;
    private boolean e0;
    private int f0;
    android.app.SearchableInfo g0;
    private android.os.Bundle h0;
    private final java.lang.Runnable i0;
    private java.lang.Runnable j0;
    private final java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable.ConstantState> k0;
    private final android.view.View.OnClickListener l0;
    android.view.View.OnKeyListener m0;
    private final android.widget.TextView.OnEditorActionListener n0;
    private final android.widget.AdapterView.OnItemClickListener o0;
    private final android.widget.AdapterView.OnItemSelectedListener p0;
    final android.support.v7.widget.SearchView.SearchAutoComplete q;
    private android.text.TextWatcher q0;
    private final android.view.View r;
    private final android.view.View s;
    private final android.view.View t;
    final android.widget.ImageView u;
    final android.widget.ImageView v;
    final android.widget.ImageView w;
    final android.widget.ImageView x;
    private final android.view.View y;
    private android.support.v7.widget.SearchView.p z;

    public static class SearchAutoComplete extends android.support.v7.widget.d {
        private int e;
        private android.support.v7.widget.SearchView f;
        private boolean g;
        final java.lang.Runnable h;

        class a implements java.lang.Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.support.v7.widget.SearchView.SearchAutoComplete f802b;

            a(android.support.v7.widget.SearchView.SearchAutoComplete r1) {
                    r0 = this;
                    r0.f802b = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r0 = this;
                    android.support.v7.widget.SearchView$SearchAutoComplete r0 = r0.f802b
                    r0.b()
                    return
            }
        }

        public SearchAutoComplete(android.content.Context r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        public SearchAutoComplete(android.content.Context r2, android.util.AttributeSet r3) {
                r1 = this;
                int r0 = b.b.d.a.a.autoCompleteTextViewStyle
                r1.<init>(r2, r3, r0)
                return
        }

        public SearchAutoComplete(android.content.Context r1, android.util.AttributeSet r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                android.support.v7.widget.SearchView$SearchAutoComplete$a r1 = new android.support.v7.widget.SearchView$SearchAutoComplete$a
                r1.<init>(r0)
                r0.h = r1
                int r1 = r0.getThreshold()
                r0.e = r1
                return
        }

        private int getSearchViewTextMinWidthDp() {
                r3 = this;
                android.content.res.Resources r3 = r3.getResources()
                android.content.res.Configuration r3 = r3.getConfiguration()
                int r0 = r3.screenWidthDp
                int r1 = r3.screenHeightDp
                r2 = 960(0x3c0, float:1.345E-42)
                if (r0 < r2) goto L1c
                r2 = 720(0x2d0, float:1.009E-42)
                if (r1 < r2) goto L1c
                int r3 = r3.orientation
                r2 = 2
                if (r3 != r2) goto L1c
                r3 = 256(0x100, float:3.59E-43)
                return r3
            L1c:
                r3 = 600(0x258, float:8.41E-43)
                if (r0 >= r3) goto L2c
                r3 = 640(0x280, float:8.97E-43)
                if (r0 < r3) goto L29
                r3 = 480(0x1e0, float:6.73E-43)
                if (r1 < r3) goto L29
                goto L2c
            L29:
                r3 = 160(0xa0, float:2.24E-43)
                return r3
            L2c:
                r3 = 192(0xc0, float:2.69E-43)
                return r3
        }

        boolean a() {
                r0 = this;
                android.text.Editable r0 = r0.getText()
                int r0 = android.text.TextUtils.getTrimmedLength(r0)
                if (r0 != 0) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        void b() {
                r2 = this;
                boolean r0 = r2.g
                if (r0 == 0) goto L16
                android.content.Context r0 = r2.getContext()
                java.lang.String r1 = "input_method"
                java.lang.Object r0 = r0.getSystemService(r1)
                android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
                r1 = 0
                r0.showSoftInput(r2, r1)
                r2.g = r1
            L16:
                return
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
                r1 = this;
                int r0 = r1.e
                if (r0 <= 0) goto Ld
                boolean r1 = super.enoughToFilter()
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

        @Override // android.support.v7.widget.d, android.widget.TextView, android.view.View
        public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r2) {
                r1 = this;
                android.view.inputmethod.InputConnection r2 = super.onCreateInputConnection(r2)
                boolean r0 = r1.g
                if (r0 == 0) goto L12
                java.lang.Runnable r0 = r1.h
                r1.removeCallbacks(r0)
                java.lang.Runnable r0 = r1.h
                r1.post(r0)
            L12:
                return r2
        }

        @Override // android.view.View
        protected void onFinishInflate() {
                r3 = this;
                super.onFinishInflate()
                android.content.res.Resources r0 = r3.getResources()
                android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
                int r1 = r3.getSearchViewTextMinWidthDp()
                float r1 = (float) r1
                r2 = 1
                float r0 = android.util.TypedValue.applyDimension(r2, r1, r0)
                int r0 = (int) r0
                r3.setMinWidth(r0)
                return
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean r1, int r2, android.graphics.Rect r3) {
                r0 = this;
                super.onFocusChanged(r1, r2, r3)
                android.support.v7.widget.SearchView r0 = r0.f
                r0.i()
                return
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int r3, android.view.KeyEvent r4) {
                r2 = this;
                r0 = 4
                if (r3 != r0) goto L3f
                int r0 = r4.getAction()
                r1 = 1
                if (r0 != 0) goto L1a
                int r0 = r4.getRepeatCount()
                if (r0 != 0) goto L1a
                android.view.KeyEvent$DispatcherState r3 = r2.getKeyDispatcherState()
                if (r3 == 0) goto L19
                r3.startTracking(r4, r2)
            L19:
                return r1
            L1a:
                int r0 = r4.getAction()
                if (r0 != r1) goto L3f
                android.view.KeyEvent$DispatcherState r0 = r2.getKeyDispatcherState()
                if (r0 == 0) goto L29
                r0.handleUpEvent(r4)
            L29:
                boolean r0 = r4.isTracking()
                if (r0 == 0) goto L3f
                boolean r0 = r4.isCanceled()
                if (r0 != 0) goto L3f
                android.support.v7.widget.SearchView r3 = r2.f
                r3.clearFocus()
                r3 = 0
                r2.setImeVisibility(r3)
                return r1
            L3f:
                boolean r2 = super.onKeyPreIme(r3, r4)
                return r2
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean r2) {
                r1 = this;
                super.onWindowFocusChanged(r2)
                if (r2 == 0) goto L25
                android.support.v7.widget.SearchView r2 = r1.f
                boolean r2 = r2.hasFocus()
                if (r2 == 0) goto L25
                int r2 = r1.getVisibility()
                if (r2 != 0) goto L25
                r2 = 1
                r1.g = r2
                android.content.Context r0 = r1.getContext()
                boolean r0 = android.support.v7.widget.SearchView.a(r0)
                if (r0 == 0) goto L25
                android.support.v7.widget.SearchView$k r0 = android.support.v7.widget.SearchView.r0
                r0.a(r1, r2)
            L25:
                return
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
                r0 = this;
                return
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(java.lang.CharSequence r1) {
                r0 = this;
                return
        }

        void setImeVisibility(boolean r3) {
                r2 = this;
                android.content.Context r0 = r2.getContext()
                java.lang.String r1 = "input_method"
                java.lang.Object r0 = r0.getSystemService(r1)
                android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
                r1 = 0
                if (r3 != 0) goto L1e
                r2.g = r1
                java.lang.Runnable r3 = r2.h
                r2.removeCallbacks(r3)
                android.os.IBinder r2 = r2.getWindowToken()
                r0.hideSoftInputFromWindow(r2, r1)
                return
            L1e:
                boolean r3 = r0.isActive(r2)
                if (r3 == 0) goto L2f
                r2.g = r1
                java.lang.Runnable r3 = r2.h
                r2.removeCallbacks(r3)
                r0.showSoftInput(r2, r1)
                return
            L2f:
                r3 = 1
                r2.g = r3
                return
        }

        void setSearchView(android.support.v7.widget.SearchView r1) {
                r0 = this;
                r0.f = r1
                return
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int r1) {
                r0 = this;
                super.setThreshold(r1)
                r0.e = r1
                return
        }
    }

    class a implements android.text.TextWatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.support.v7.widget.SearchView f803b;

        a(android.support.v7.widget.SearchView r1) {
                r0 = this;
                r0.f803b = r1
                r0.<init>()
                return
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable r1) {
                r0 = this;
                return
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
                r0 = this;
                return
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
                r0 = this;
                android.support.v7.widget.SearchView r0 = r0.f803b
                r0.b(r1)
                return
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.support.v7.widget.SearchView f804b;

        b(android.support.v7.widget.SearchView r1) {
                r0 = this;
                r0.f804b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r0 = this;
                android.support.v7.widget.SearchView r0 = r0.f804b
                r0.k()
                return
        }
    }

    class c implements java.lang.Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.support.v7.widget.SearchView f805b;

        c(android.support.v7.widget.SearchView r1) {
                r0 = this;
                r0.f805b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                android.support.v7.widget.SearchView r1 = r1.f805b
                android.support.v4.widget.d r1 = r1.S
                if (r1 == 0) goto Le
                boolean r0 = r1 instanceof android.support.v7.widget.n0
                if (r0 == 0) goto Le
                r0 = 0
                r1.b(r0)
            Le:
                return
        }
    }

    class d implements android.view.View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.support.v7.widget.SearchView f806b;

        d(android.support.v7.widget.SearchView r1) {
                r0 = this;
                r0.f806b = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(android.view.View r1, boolean r2) {
                r0 = this;
                android.support.v7.widget.SearchView r0 = r0.f806b
                android.view.View$OnFocusChangeListener r1 = r0.N
                if (r1 == 0) goto L9
                r1.onFocusChange(r0, r2)
            L9:
                return
        }
    }

    class e implements android.view.View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.support.v7.widget.SearchView f807a;

        e(android.support.v7.widget.SearchView r1) {
                r0 = this;
                r0.f807a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
                r0 = this;
                android.support.v7.widget.SearchView r0 = r0.f807a
                r0.c()
                return
        }
    }

    class f implements android.view.View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.support.v7.widget.SearchView f808b;

        f(android.support.v7.widget.SearchView r1) {
                r0 = this;
                r0.f808b = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                android.support.v7.widget.SearchView r1 = r1.f808b
                android.widget.ImageView r0 = r1.u
                if (r2 != r0) goto La
                r1.g()
                goto L29
            La:
                android.widget.ImageView r0 = r1.w
                if (r2 != r0) goto L12
                r1.f()
                goto L29
            L12:
                android.widget.ImageView r0 = r1.v
                if (r2 != r0) goto L1a
                r1.h()
                goto L29
            L1a:
                android.widget.ImageView r0 = r1.x
                if (r2 != r0) goto L22
                r1.j()
                goto L29
            L22:
                android.support.v7.widget.SearchView$SearchAutoComplete r0 = r1.q
                if (r2 != r0) goto L29
                r1.d()
            L29:
                return
        }
    }

    class g implements android.view.View.OnKeyListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.support.v7.widget.SearchView f809b;

        g(android.support.v7.widget.SearchView r1) {
                r0 = this;
                r0.f809b = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(android.view.View r4, int r5, android.view.KeyEvent r6) {
                r3 = this;
                android.support.v7.widget.SearchView r0 = r3.f809b
                android.app.SearchableInfo r1 = r0.g0
                r2 = 0
                if (r1 != 0) goto L8
                return r2
            L8:
                android.support.v7.widget.SearchView$SearchAutoComplete r0 = r0.q
                boolean r0 = r0.isPopupShowing()
                if (r0 == 0) goto L22
                android.support.v7.widget.SearchView r0 = r3.f809b
                android.support.v7.widget.SearchView$SearchAutoComplete r0 = r0.q
                int r0 = r0.getListSelection()
                r1 = -1
                if (r0 == r1) goto L22
                android.support.v7.widget.SearchView r3 = r3.f809b
                boolean r3 = r3.a(r4, r5, r6)
                return r3
            L22:
                android.support.v7.widget.SearchView r0 = r3.f809b
                android.support.v7.widget.SearchView$SearchAutoComplete r0 = r0.q
                boolean r0 = r0.a()
                if (r0 != 0) goto L51
                boolean r0 = r6.hasNoModifiers()
                if (r0 == 0) goto L51
                int r6 = r6.getAction()
                r0 = 1
                if (r6 != r0) goto L51
                r6 = 66
                if (r5 != r6) goto L51
                r4.cancelLongPress()
                android.support.v7.widget.SearchView r3 = r3.f809b
                r4 = 0
                android.support.v7.widget.SearchView$SearchAutoComplete r5 = r3.q
                android.text.Editable r5 = r5.getText()
                java.lang.String r5 = r5.toString()
                r3.a(r2, r4, r5)
                return r0
            L51:
                return r2
        }
    }

    class h implements android.widget.TextView.OnEditorActionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.support.v7.widget.SearchView f810a;

        h(android.support.v7.widget.SearchView r1) {
                r0 = this;
                r0.f810a = r1
                r0.<init>()
                return
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(android.widget.TextView r1, int r2, android.view.KeyEvent r3) {
                r0 = this;
                android.support.v7.widget.SearchView r0 = r0.f810a
                r0.h()
                r0 = 1
                return r0
        }
    }

    class i implements android.widget.AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.support.v7.widget.SearchView f811b;

        i(android.support.v7.widget.SearchView r1) {
                r0 = this;
                r0.f811b = r1
                r0.<init>()
                return
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
                r0 = this;
                android.support.v7.widget.SearchView r0 = r0.f811b
                r1 = 0
                r2 = 0
                r0.a(r3, r1, r2)
                return
        }
    }

    class j implements android.widget.AdapterView.OnItemSelectedListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.support.v7.widget.SearchView f812b;

        j(android.support.v7.widget.SearchView r1) {
                r0 = this;
                r0.f812b = r1
                r0.<init>()
                return
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
                r0 = this;
                android.support.v7.widget.SearchView r0 = r0.f812b
                r0.d(r3)
                return
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(android.widget.AdapterView<?> r1) {
                r0 = this;
                return
        }
    }

    private static class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.reflect.Method f813a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.lang.reflect.Method f814b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private java.lang.reflect.Method f815c;

        k() {
                r6 = this;
                r6.<init>()
                r0 = 0
                r1 = 1
                java.lang.Class<android.widget.AutoCompleteTextView> r2 = android.widget.AutoCompleteTextView.class
                java.lang.String r3 = "doBeforeTextChanged"
                java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L14
                java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L14
                r6.f813a = r2     // Catch: java.lang.NoSuchMethodException -> L14
                r2.setAccessible(r1)     // Catch: java.lang.NoSuchMethodException -> L14
            L14:
                java.lang.Class<android.widget.AutoCompleteTextView> r2 = android.widget.AutoCompleteTextView.class
                java.lang.String r3 = "doAfterTextChanged"
                java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L23
                java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L23
                r6.f814b = r2     // Catch: java.lang.NoSuchMethodException -> L23
                r2.setAccessible(r1)     // Catch: java.lang.NoSuchMethodException -> L23
            L23:
                java.lang.Class<android.widget.AutoCompleteTextView> r2 = android.widget.AutoCompleteTextView.class
                java.lang.String r3 = "ensureImeVisible"
                java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchMethodException -> L36
                java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L36
                r4[r0] = r5     // Catch: java.lang.NoSuchMethodException -> L36
                java.lang.reflect.Method r0 = r2.getMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L36
                r6.f815c = r0     // Catch: java.lang.NoSuchMethodException -> L36
                r0.setAccessible(r1)     // Catch: java.lang.NoSuchMethodException -> L36
            L36:
                return
        }

        void a(android.widget.AutoCompleteTextView r2) {
                r1 = this;
                java.lang.reflect.Method r1 = r1.f814b
                if (r1 == 0) goto La
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> La
                r1.invoke(r2, r0)     // Catch: java.lang.Exception -> La
            La:
                return
        }

        void a(android.widget.AutoCompleteTextView r3, boolean r4) {
                r2 = this;
                java.lang.reflect.Method r2 = r2.f815c
                if (r2 == 0) goto L11
                r0 = 1
                java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L11
                r1 = 0
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Exception -> L11
                r0[r1] = r4     // Catch: java.lang.Exception -> L11
                r2.invoke(r3, r0)     // Catch: java.lang.Exception -> L11
            L11:
                return
        }

        void b(android.widget.AutoCompleteTextView r2) {
                r1 = this;
                java.lang.reflect.Method r1 = r1.f813a
                if (r1 == 0) goto La
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> La
                r1.invoke(r2, r0)     // Catch: java.lang.Exception -> La
            La:
                return
        }
    }

    public interface l {
        boolean a();
    }

    public interface m {
        boolean a(java.lang.String r1);

        boolean b(java.lang.String r1);
    }

    public interface n {
        boolean a(int r1);

        boolean b(int r1);
    }

    static class o extends b.b.c.g.a {
        public static final android.os.Parcelable.Creator<android.support.v7.widget.SearchView.o> CREATOR = null;
        boolean d;

        static class a implements android.os.Parcelable.ClassLoaderCreator<android.support.v7.widget.SearchView.o> {
            a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.os.Parcelable.Creator
            public android.support.v7.widget.SearchView.o createFromParcel(android.os.Parcel r2) {
                    r1 = this;
                    android.support.v7.widget.SearchView$o r1 = new android.support.v7.widget.SearchView$o
                    r0 = 0
                    r1.<init>(r2, r0)
                    return r1
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public android.support.v7.widget.SearchView.o createFromParcel(android.os.Parcel r1, java.lang.ClassLoader r2) {
                    r0 = this;
                    android.support.v7.widget.SearchView$o r0 = new android.support.v7.widget.SearchView$o
                    r0.<init>(r1, r2)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r1) {
                    r0 = this;
                    android.support.v7.widget.SearchView$o r0 = r0.createFromParcel(r1)
                    return r0
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* bridge */ /* synthetic */ android.support.v7.widget.SearchView.o createFromParcel(android.os.Parcel r1, java.lang.ClassLoader r2) {
                    r0 = this;
                    android.support.v7.widget.SearchView$o r0 = r0.createFromParcel(r1, r2)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public android.support.v7.widget.SearchView.o[] newArray(int r1) {
                    r0 = this;
                    android.support.v7.widget.SearchView$o[] r0 = new android.support.v7.widget.SearchView.o[r1]
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ java.lang.Object[] newArray(int r1) {
                    r0 = this;
                    android.support.v7.widget.SearchView$o[] r0 = r0.newArray(r1)
                    return r0
            }
        }

        static {
                android.support.v7.widget.SearchView$o$a r0 = new android.support.v7.widget.SearchView$o$a
                r0.<init>()
                android.support.v7.widget.SearchView.o.CREATOR = r0
                return
        }

        public o(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r2 = 0
                java.lang.Object r1 = r1.readValue(r2)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                r0.d = r1
                return
        }

        o(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "SearchView.SavedState{"
                r0.append(r1)
                int r1 = java.lang.System.identityHashCode(r2)
                java.lang.String r1 = java.lang.Integer.toHexString(r1)
                r0.append(r1)
                java.lang.String r1 = " isIconified="
                r0.append(r1)
                boolean r2 = r2.d
                r0.append(r2)
                java.lang.String r2 = "}"
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                return r2
        }

        @Override // b.b.c.g.a, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                boolean r0 = r0.d
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r1.writeValue(r0)
                return
        }
    }

    private static class p extends android.view.TouchDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.view.View f816a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final android.graphics.Rect f817b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final android.graphics.Rect f818c;
        private final android.graphics.Rect d;
        private final int e;
        private boolean f;

        public p(android.graphics.Rect r2, android.graphics.Rect r3, android.view.View r4) {
                r1 = this;
                r1.<init>(r2, r4)
                android.content.Context r0 = r4.getContext()
                android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
                int r0 = r0.getScaledTouchSlop()
                r1.e = r0
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r1.f817b = r0
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r1.d = r0
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r1.f818c = r0
                r1.a(r2, r3)
                r1.f816a = r4
                return
        }

        public void a(android.graphics.Rect r3, android.graphics.Rect r4) {
                r2 = this;
                android.graphics.Rect r0 = r2.f817b
                r0.set(r3)
                android.graphics.Rect r0 = r2.d
                r0.set(r3)
                android.graphics.Rect r3 = r2.d
                int r0 = r2.e
                int r1 = -r0
                int r0 = -r0
                r3.inset(r1, r0)
                android.graphics.Rect r2 = r2.f818c
                r2.set(r4)
                return
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(android.view.MotionEvent r9) {
                r8 = this;
                float r0 = r9.getX()
                int r0 = (int) r0
                float r1 = r9.getY()
                int r1 = (int) r1
                int r2 = r9.getAction()
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L33
                if (r2 == r4) goto L20
                if (r2 == r3) goto L20
                r6 = 3
                if (r2 == r6) goto L1b
                goto L3f
            L1b:
                boolean r2 = r8.f
                r8.f = r5
                goto L2f
            L20:
                boolean r2 = r8.f
                if (r2 == 0) goto L2f
                android.graphics.Rect r6 = r8.d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L2f
                r4 = r2
                r2 = r5
                goto L41
            L2f:
                r7 = r4
                r4 = r2
                r2 = r7
                goto L41
            L33:
                android.graphics.Rect r2 = r8.f817b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L3f
                r8.f = r4
                r2 = r4
                goto L41
            L3f:
                r2 = r4
                r4 = r5
            L41:
                if (r4 == 0) goto L70
                if (r2 == 0) goto L5d
                android.graphics.Rect r2 = r8.f818c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L5d
                android.view.View r0 = r8.f816a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r8.f816a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                goto L66
            L5d:
                android.graphics.Rect r2 = r8.f818c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
            L66:
                float r1 = (float) r1
                r9.setLocation(r0, r1)
                android.view.View r8 = r8.f816a
                boolean r5 = r8.dispatchTouchEvent(r9)
            L70:
                return r5
        }
    }

    static {
            android.support.v7.widget.SearchView$k r0 = new android.support.v7.widget.SearchView$k
            r0.<init>()
            android.support.v7.widget.SearchView.r0 = r0
            return
    }

    public SearchView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SearchView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = b.b.d.a.a.searchViewStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public SearchView(android.content.Context r4, android.util.AttributeSet r5, int r6) {
            r3 = this;
            r3.<init>(r4, r5, r6)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r3.A = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r3.B = r0
            r0 = 2
            int[] r1 = new int[r0]
            r3.C = r1
            int[] r0 = new int[r0]
            r3.D = r0
            android.support.v7.widget.SearchView$b r0 = new android.support.v7.widget.SearchView$b
            r0.<init>(r3)
            r3.i0 = r0
            android.support.v7.widget.SearchView$c r0 = new android.support.v7.widget.SearchView$c
            r0.<init>(r3)
            r3.j0 = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r3.k0 = r0
            android.support.v7.widget.SearchView$f r0 = new android.support.v7.widget.SearchView$f
            r0.<init>(r3)
            r3.l0 = r0
            android.support.v7.widget.SearchView$g r0 = new android.support.v7.widget.SearchView$g
            r0.<init>(r3)
            r3.m0 = r0
            android.support.v7.widget.SearchView$h r0 = new android.support.v7.widget.SearchView$h
            r0.<init>(r3)
            r3.n0 = r0
            android.support.v7.widget.SearchView$i r0 = new android.support.v7.widget.SearchView$i
            r0.<init>(r3)
            r3.o0 = r0
            android.support.v7.widget.SearchView$j r0 = new android.support.v7.widget.SearchView$j
            r0.<init>(r3)
            r3.p0 = r0
            android.support.v7.widget.SearchView$a r0 = new android.support.v7.widget.SearchView$a
            r0.<init>(r3)
            r3.q0 = r0
            int[] r0 = b.b.d.a.j.SearchView
            r1 = 0
            android.support.v7.widget.t0 r5 = android.support.v7.widget.t0.a(r4, r5, r0, r6, r1)
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            int r6 = b.b.d.a.j.SearchView_layout
            int r0 = b.b.d.a.g.abc_search_view
            int r6 = r5.g(r6, r0)
            r0 = 1
            r4.inflate(r6, r3, r0)
            int r4 = b.b.d.a.f.search_src_text
            android.view.View r4 = r3.findViewById(r4)
            android.support.v7.widget.SearchView$SearchAutoComplete r4 = (android.support.v7.widget.SearchView.SearchAutoComplete) r4
            r3.q = r4
            r4.setSearchView(r3)
            int r4 = b.b.d.a.f.search_edit_frame
            android.view.View r4 = r3.findViewById(r4)
            r3.r = r4
            int r4 = b.b.d.a.f.search_plate
            android.view.View r4 = r3.findViewById(r4)
            r3.s = r4
            int r4 = b.b.d.a.f.submit_area
            android.view.View r4 = r3.findViewById(r4)
            r3.t = r4
            int r4 = b.b.d.a.f.search_button
            android.view.View r4 = r3.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r3.u = r4
            int r4 = b.b.d.a.f.search_go_btn
            android.view.View r4 = r3.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r3.v = r4
            int r4 = b.b.d.a.f.search_close_btn
            android.view.View r4 = r3.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r3.w = r4
            int r4 = b.b.d.a.f.search_voice_btn
            android.view.View r4 = r3.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r3.x = r4
            int r4 = b.b.d.a.f.search_mag_icon
            android.view.View r4 = r3.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r3.E = r4
            android.view.View r4 = r3.s
            int r6 = b.b.d.a.j.SearchView_queryBackground
            android.graphics.drawable.Drawable r6 = r5.b(r6)
            b.b.c.g.q.a(r4, r6)
            android.view.View r4 = r3.t
            int r6 = b.b.d.a.j.SearchView_submitBackground
            android.graphics.drawable.Drawable r6 = r5.b(r6)
            b.b.c.g.q.a(r4, r6)
            android.widget.ImageView r4 = r3.u
            int r6 = b.b.d.a.j.SearchView_searchIcon
            android.graphics.drawable.Drawable r6 = r5.b(r6)
            r4.setImageDrawable(r6)
            android.widget.ImageView r4 = r3.v
            int r6 = b.b.d.a.j.SearchView_goIcon
            android.graphics.drawable.Drawable r6 = r5.b(r6)
            r4.setImageDrawable(r6)
            android.widget.ImageView r4 = r3.w
            int r6 = b.b.d.a.j.SearchView_closeIcon
            android.graphics.drawable.Drawable r6 = r5.b(r6)
            r4.setImageDrawable(r6)
            android.widget.ImageView r4 = r3.x
            int r6 = b.b.d.a.j.SearchView_voiceIcon
            android.graphics.drawable.Drawable r6 = r5.b(r6)
            r4.setImageDrawable(r6)
            android.widget.ImageView r4 = r3.E
            int r6 = b.b.d.a.j.SearchView_searchIcon
            android.graphics.drawable.Drawable r6 = r5.b(r6)
            r4.setImageDrawable(r6)
            int r4 = b.b.d.a.j.SearchView_searchHintIcon
            android.graphics.drawable.Drawable r4 = r5.b(r4)
            r3.F = r4
            android.widget.ImageView r4 = r3.u
            android.content.res.Resources r6 = r3.getResources()
            int r2 = b.b.d.a.h.abc_searchview_description_search
            java.lang.String r6 = r6.getString(r2)
            android.support.v7.widget.v0.a(r4, r6)
            int r4 = b.b.d.a.j.SearchView_suggestionRowLayout
            int r6 = b.b.d.a.g.abc_search_dropdown_item_icons_2line
            int r4 = r5.g(r4, r6)
            r3.G = r4
            int r4 = b.b.d.a.j.SearchView_commitIcon
            int r4 = r5.g(r4, r1)
            r3.H = r4
            android.widget.ImageView r4 = r3.u
            android.view.View$OnClickListener r6 = r3.l0
            r4.setOnClickListener(r6)
            android.widget.ImageView r4 = r3.w
            android.view.View$OnClickListener r6 = r3.l0
            r4.setOnClickListener(r6)
            android.widget.ImageView r4 = r3.v
            android.view.View$OnClickListener r6 = r3.l0
            r4.setOnClickListener(r6)
            android.widget.ImageView r4 = r3.x
            android.view.View$OnClickListener r6 = r3.l0
            r4.setOnClickListener(r6)
            android.support.v7.widget.SearchView$SearchAutoComplete r4 = r3.q
            android.view.View$OnClickListener r6 = r3.l0
            r4.setOnClickListener(r6)
            android.support.v7.widget.SearchView$SearchAutoComplete r4 = r3.q
            android.text.TextWatcher r6 = r3.q0
            r4.addTextChangedListener(r6)
            android.support.v7.widget.SearchView$SearchAutoComplete r4 = r3.q
            android.widget.TextView$OnEditorActionListener r6 = r3.n0
            r4.setOnEditorActionListener(r6)
            android.support.v7.widget.SearchView$SearchAutoComplete r4 = r3.q
            android.widget.AdapterView$OnItemClickListener r6 = r3.o0
            r4.setOnItemClickListener(r6)
            android.support.v7.widget.SearchView$SearchAutoComplete r4 = r3.q
            android.widget.AdapterView$OnItemSelectedListener r6 = r3.p0
            r4.setOnItemSelectedListener(r6)
            android.support.v7.widget.SearchView$SearchAutoComplete r4 = r3.q
            android.view.View$OnKeyListener r6 = r3.m0
            r4.setOnKeyListener(r6)
            android.support.v7.widget.SearchView$SearchAutoComplete r4 = r3.q
            android.support.v7.widget.SearchView$d r6 = new android.support.v7.widget.SearchView$d
            r6.<init>(r3)
            r4.setOnFocusChangeListener(r6)
            int r4 = b.b.d.a.j.SearchView_iconifiedByDefault
            boolean r4 = r5.a(r4, r0)
            r3.setIconifiedByDefault(r4)
            int r4 = b.b.d.a.j.SearchView_android_maxWidth
            r6 = -1
            int r4 = r5.c(r4, r6)
            if (r4 == r6) goto L1a2
            r3.setMaxWidth(r4)
        L1a2:
            int r4 = b.b.d.a.j.SearchView_defaultQueryHint
            java.lang.CharSequence r4 = r5.e(r4)
            r3.K = r4
            int r4 = b.b.d.a.j.SearchView_queryHint
            java.lang.CharSequence r4 = r5.e(r4)
            r3.U = r4
            int r4 = b.b.d.a.j.SearchView_android_imeOptions
            int r4 = r5.d(r4, r6)
            if (r4 == r6) goto L1bd
            r3.setImeOptions(r4)
        L1bd:
            int r4 = b.b.d.a.j.SearchView_android_inputType
            int r4 = r5.d(r4, r6)
            if (r4 == r6) goto L1c8
            r3.setInputType(r4)
        L1c8:
            int r4 = b.b.d.a.j.SearchView_android_focusable
            boolean r4 = r5.a(r4, r0)
            r3.setFocusable(r4)
            r5.a()
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r5 = "android.speech.action.WEB_SEARCH"
            r4.<init>(r5)
            r3.I = r4
            r5 = 268435456(0x10000000, float:2.524355E-29)
            r4.addFlags(r5)
            android.content.Intent r4 = r3.I
            java.lang.String r6 = "android.speech.extra.LANGUAGE_MODEL"
            java.lang.String r0 = "web_search"
            r4.putExtra(r6, r0)
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r6 = "android.speech.action.RECOGNIZE_SPEECH"
            r4.<init>(r6)
            r3.J = r4
            r4.addFlags(r5)
            android.support.v7.widget.SearchView$SearchAutoComplete r4 = r3.q
            int r4 = r4.getDropDownAnchor()
            android.view.View r4 = r3.findViewById(r4)
            r3.y = r4
            if (r4 == 0) goto L20d
            android.support.v7.widget.SearchView$e r5 = new android.support.v7.widget.SearchView$e
            r5.<init>(r3)
            r4.addOnLayoutChangeListener(r5)
        L20d:
            boolean r4 = r3.Q
            r3.b(r4)
            r3.q()
            return
    }

    private android.content.Intent a(android.content.Intent r9, android.app.SearchableInfo r10) {
            r8 = this;
            android.content.ComponentName r0 = r10.getSearchActivity()
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.SEARCH"
            r1.<init>(r2)
            r1.setComponent(r0)
            android.content.Context r2 = r8.getContext()
            r3 = 0
            r4 = 1073741824(0x40000000, float:2.0)
            android.app.PendingIntent r1 = android.app.PendingIntent.getActivity(r2, r3, r1, r4)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            android.os.Bundle r3 = r8.h0
            if (r3 == 0) goto L27
            java.lang.String r4 = "app_data"
            r2.putParcelable(r4, r3)
        L27:
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r9)
            r9 = 1
            android.content.res.Resources r8 = r8.getResources()
            int r4 = r10.getVoiceLanguageModeId()
            if (r4 == 0) goto L40
            int r4 = r10.getVoiceLanguageModeId()
            java.lang.String r4 = r8.getString(r4)
            goto L42
        L40:
            java.lang.String r4 = "free_form"
        L42:
            int r5 = r10.getVoicePromptTextId()
            r6 = 0
            if (r5 == 0) goto L52
            int r5 = r10.getVoicePromptTextId()
            java.lang.String r5 = r8.getString(r5)
            goto L53
        L52:
            r5 = r6
        L53:
            int r7 = r10.getVoiceLanguageId()
            if (r7 == 0) goto L62
            int r7 = r10.getVoiceLanguageId()
            java.lang.String r8 = r8.getString(r7)
            goto L63
        L62:
            r8 = r6
        L63:
            int r7 = r10.getVoiceMaxResults()
            if (r7 == 0) goto L6d
            int r9 = r10.getVoiceMaxResults()
        L6d:
            java.lang.String r10 = "android.speech.extra.LANGUAGE_MODEL"
            r3.putExtra(r10, r4)
            java.lang.String r10 = "android.speech.extra.PROMPT"
            r3.putExtra(r10, r5)
            java.lang.String r10 = "android.speech.extra.LANGUAGE"
            r3.putExtra(r10, r8)
            java.lang.String r8 = "android.speech.extra.MAX_RESULTS"
            r3.putExtra(r8, r9)
            if (r0 != 0) goto L84
            goto L88
        L84:
            java.lang.String r6 = r0.flattenToShortString()
        L88:
            java.lang.String r8 = "calling_package"
            r3.putExtra(r8, r6)
            java.lang.String r8 = "android.speech.extra.RESULTS_PENDINGINTENT"
            r3.putExtra(r8, r1)
            java.lang.String r8 = "android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE"
            r3.putExtra(r8, r2)
            return r3
    }

    private android.content.Intent a(android.database.Cursor r9, int r10, java.lang.String r11) {
            r8 = this;
            r0 = 0
            java.lang.String r1 = "suggest_intent_action"
            java.lang.String r1 = android.support.v7.widget.n0.a(r9, r1)     // Catch: java.lang.RuntimeException -> L61
            if (r1 != 0) goto Lf
            android.app.SearchableInfo r1 = r8.g0     // Catch: java.lang.RuntimeException -> L61
            java.lang.String r1 = r1.getSuggestIntentAction()     // Catch: java.lang.RuntimeException -> L61
        Lf:
            if (r1 != 0) goto L13
            java.lang.String r1 = "android.intent.action.SEARCH"
        L13:
            r2 = r1
            java.lang.String r1 = "suggest_intent_data"
            java.lang.String r1 = android.support.v7.widget.n0.a(r9, r1)     // Catch: java.lang.RuntimeException -> L61
            if (r1 != 0) goto L22
            android.app.SearchableInfo r1 = r8.g0     // Catch: java.lang.RuntimeException -> L61
            java.lang.String r1 = r1.getSuggestIntentData()     // Catch: java.lang.RuntimeException -> L61
        L22:
            if (r1 == 0) goto L44
            java.lang.String r3 = "suggest_intent_data_id"
            java.lang.String r3 = android.support.v7.widget.n0.a(r9, r3)     // Catch: java.lang.RuntimeException -> L61
            if (r3 == 0) goto L44
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L61
            r4.<init>()     // Catch: java.lang.RuntimeException -> L61
            r4.append(r1)     // Catch: java.lang.RuntimeException -> L61
            java.lang.String r1 = "/"
            r4.append(r1)     // Catch: java.lang.RuntimeException -> L61
            java.lang.String r1 = android.net.Uri.encode(r3)     // Catch: java.lang.RuntimeException -> L61
            r4.append(r1)     // Catch: java.lang.RuntimeException -> L61
            java.lang.String r1 = r4.toString()     // Catch: java.lang.RuntimeException -> L61
        L44:
            if (r1 != 0) goto L48
            r3 = r0
            goto L4d
        L48:
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch: java.lang.RuntimeException -> L61
            r3 = r1
        L4d:
            java.lang.String r1 = "suggest_intent_query"
            java.lang.String r5 = android.support.v7.widget.n0.a(r9, r1)     // Catch: java.lang.RuntimeException -> L61
            java.lang.String r1 = "suggest_intent_extra_data"
            java.lang.String r4 = android.support.v7.widget.n0.a(r9, r1)     // Catch: java.lang.RuntimeException -> L61
            r1 = r8
            r6 = r10
            r7 = r11
            android.content.Intent r8 = r1.a(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L61
            return r8
        L61:
            r8 = move-exception
            int r9 = r9.getPosition()     // Catch: java.lang.RuntimeException -> L67
            goto L68
        L67:
            r9 = -1
        L68:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Search suggestions cursor at row "
            r10.append(r11)
            r10.append(r9)
            java.lang.String r9 = " returned exception."
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            java.lang.String r10 = "SearchView"
            android.util.Log.w(r10, r9, r8)
            return r0
    }

    private android.content.Intent a(java.lang.String r2, android.net.Uri r3, java.lang.String r4, java.lang.String r5, int r6, java.lang.String r7) {
            r1 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r2)
            r2 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r2)
            if (r3 == 0) goto Lf
            r0.setData(r3)
        Lf:
            java.lang.CharSequence r2 = r1.d0
            java.lang.String r3 = "user_query"
            r0.putExtra(r3, r2)
            if (r5 == 0) goto L1d
            java.lang.String r2 = "query"
            r0.putExtra(r2, r5)
        L1d:
            if (r4 == 0) goto L24
            java.lang.String r2 = "intent_extra_data_key"
            r0.putExtra(r2, r4)
        L24:
            android.os.Bundle r2 = r1.h0
            if (r2 == 0) goto L2d
            java.lang.String r3 = "app_data"
            r0.putExtra(r3, r2)
        L2d:
            if (r6 == 0) goto L39
            java.lang.String r2 = "action_key"
            r0.putExtra(r2, r6)
            java.lang.String r2 = "action_msg"
            r0.putExtra(r2, r7)
        L39:
            android.app.SearchableInfo r1 = r1.g0
            android.content.ComponentName r1 = r1.getSearchActivity()
            r0.setComponent(r1)
            return r0
    }

    private void a(android.content.Intent r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            android.content.Context r2 = r2.getContext()     // Catch: java.lang.RuntimeException -> Lb
            r2.startActivity(r3)     // Catch: java.lang.RuntimeException -> Lb
            goto L22
        Lb:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed launch activity: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "SearchView"
            android.util.Log.e(r0, r3, r2)
        L22:
            return
    }

    private void a(android.view.View r4, android.graphics.Rect r5) {
            r3 = this;
            int[] r0 = r3.C
            r4.getLocationInWindow(r0)
            int[] r0 = r3.D
            r3.getLocationInWindow(r0)
            int[] r0 = r3.C
            r1 = 1
            r2 = r0[r1]
            int[] r3 = r3.D
            r1 = r3[r1]
            int r2 = r2 - r1
            r1 = 0
            r0 = r0[r1]
            r3 = r3[r1]
            int r0 = r0 - r3
            int r3 = r4.getWidth()
            int r3 = r3 + r0
            int r4 = r4.getHeight()
            int r4 = r4 + r2
            r5.set(r0, r2, r3, r4)
            return
    }

    private void a(boolean r2) {
            r1 = this;
            boolean r0 = r1.T
            if (r0 == 0) goto L18
            boolean r0 = r1.n()
            if (r0 == 0) goto L18
            boolean r0 = r1.hasFocus()
            if (r0 == 0) goto L18
            if (r2 != 0) goto L16
            boolean r2 = r1.b0
            if (r2 != 0) goto L18
        L16:
            r2 = 0
            goto L1a
        L18:
            r2 = 8
        L1a:
            android.widget.ImageView r1 = r1.v
            r1.setVisibility(r2)
            return
    }

    static boolean a(android.content.Context r1) {
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.orientation
            r0 = 2
            if (r1 != r0) goto Lf
            r1 = 1
            goto L10
        Lf:
            r1 = 0
        L10:
            return r1
    }

    private android.content.Intent b(android.content.Intent r1, android.app.SearchableInfo r2) {
            r0 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1)
            android.content.ComponentName r1 = r2.getSearchActivity()
            if (r1 != 0) goto Ld
            r1 = 0
            goto L11
        Ld:
            java.lang.String r1 = r1.flattenToShortString()
        L11:
            java.lang.String r2 = "calling_package"
            r0.putExtra(r2, r1)
            return r0
    }

    private void b(boolean r6) {
            r5 = this;
            r5.R = r6
            r0 = 0
            r1 = 8
            if (r6 == 0) goto L9
            r2 = r0
            goto La
        L9:
            r2 = r1
        La:
            android.support.v7.widget.SearchView$SearchAutoComplete r3 = r5.q
            android.text.Editable r3 = r3.getText()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            r3 = r3 ^ 1
            android.widget.ImageView r4 = r5.u
            r4.setVisibility(r2)
            r5.a(r3)
            android.view.View r2 = r5.r
            if (r6 == 0) goto L24
            r6 = r1
            goto L25
        L24:
            r6 = r0
        L25:
            r2.setVisibility(r6)
            android.widget.ImageView r6 = r5.E
            android.graphics.drawable.Drawable r6 = r6.getDrawable()
            if (r6 == 0) goto L34
            boolean r6 = r5.Q
            if (r6 == 0) goto L35
        L34:
            r0 = r1
        L35:
            android.widget.ImageView r6 = r5.E
            r6.setVisibility(r0)
            r5.p()
            r6 = r3 ^ 1
            r5.c(r6)
            r5.s()
            return
    }

    private boolean b(int r2, int r3, java.lang.String r4) {
            r1 = this;
            android.support.v4.widget.d r0 = r1.S
            android.database.Cursor r0 = r0.a()
            if (r0 == 0) goto L17
            boolean r2 = r0.moveToPosition(r2)
            if (r2 == 0) goto L17
            android.content.Intent r2 = r1.a(r0, r3, r4)
            r1.a(r2)
            r1 = 1
            return r1
        L17:
            r1 = 0
            return r1
    }

    private java.lang.CharSequence c(java.lang.CharSequence r5) {
            r4 = this;
            boolean r0 = r4.Q
            if (r0 == 0) goto L33
            android.graphics.drawable.Drawable r0 = r4.F
            if (r0 != 0) goto L9
            goto L33
        L9:
            android.support.v7.widget.SearchView$SearchAutoComplete r0 = r4.q
            float r0 = r0.getTextSize()
            double r0 = (double) r0
            r2 = 4608308318706860032(0x3ff4000000000000, double:1.25)
            double r0 = r0 * r2
            int r0 = (int) r0
            android.graphics.drawable.Drawable r1 = r4.F
            r2 = 0
            r1.setBounds(r2, r2, r0, r0)
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            java.lang.String r1 = "   "
            r0.<init>(r1)
            android.text.style.ImageSpan r1 = new android.text.style.ImageSpan
            android.graphics.drawable.Drawable r4 = r4.F
            r1.<init>(r4)
            r4 = 1
            r2 = 2
            r3 = 33
            r0.setSpan(r1, r4, r2, r3)
            r0.append(r5)
            return r0
        L33:
            return r5
    }

    private void c(boolean r3) {
            r2 = this;
            boolean r0 = r2.b0
            r1 = 8
            if (r0 == 0) goto L15
            boolean r0 = r2.e()
            if (r0 != 0) goto L15
            if (r3 == 0) goto L15
            r3 = 0
            android.widget.ImageView r0 = r2.v
            r0.setVisibility(r1)
            r1 = r3
        L15:
            android.widget.ImageView r2 = r2.x
            r2.setVisibility(r1)
            return
    }

    private void e(int r3) {
            r2 = this;
            android.support.v7.widget.SearchView$SearchAutoComplete r0 = r2.q
            android.text.Editable r0 = r0.getText()
            android.support.v4.widget.d r1 = r2.S
            android.database.Cursor r1 = r1.a()
            if (r1 != 0) goto Lf
            return
        Lf:
            boolean r3 = r1.moveToPosition(r3)
            if (r3 == 0) goto L21
            android.support.v4.widget.d r3 = r2.S
            java.lang.CharSequence r3 = r3.a(r1)
            if (r3 == 0) goto L21
            r2.setQuery(r3)
            goto L24
        L21:
            r2.setQuery(r0)
        L24:
            return
    }

    private int getPreferredHeight() {
            r1 = this;
            android.content.Context r1 = r1.getContext()
            android.content.res.Resources r1 = r1.getResources()
            int r0 = b.b.d.a.d.abc_search_view_preferred_height
            int r1 = r1.getDimensionPixelSize(r0)
            return r1
    }

    private int getPreferredWidth() {
            r1 = this;
            android.content.Context r1 = r1.getContext()
            android.content.res.Resources r1 = r1.getResources()
            int r0 = b.b.d.a.d.abc_search_view_preferred_width
            int r1 = r1.getDimensionPixelSize(r0)
            return r1
    }

    private void l() {
            r0 = this;
            android.support.v7.widget.SearchView$SearchAutoComplete r0 = r0.q
            r0.dismissDropDown()
            return
    }

    private boolean m() {
            r3 = this;
            android.app.SearchableInfo r0 = r3.g0
            r1 = 0
            if (r0 == 0) goto L34
            boolean r0 = r0.getVoiceSearchEnabled()
            if (r0 == 0) goto L34
            r0 = 0
            android.app.SearchableInfo r2 = r3.g0
            boolean r2 = r2.getVoiceSearchLaunchWebSearch()
            if (r2 == 0) goto L17
            android.content.Intent r0 = r3.I
            goto L21
        L17:
            android.app.SearchableInfo r2 = r3.g0
            boolean r2 = r2.getVoiceSearchLaunchRecognizer()
            if (r2 == 0) goto L21
            android.content.Intent r0 = r3.J
        L21:
            if (r0 == 0) goto L34
            android.content.Context r3 = r3.getContext()
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            r2 = 65536(0x10000, float:9.1835E-41)
            android.content.pm.ResolveInfo r3 = r3.resolveActivity(r0, r2)
            if (r3 == 0) goto L34
            r1 = 1
        L34:
            return r1
    }

    private boolean n() {
            r1 = this;
            boolean r0 = r1.T
            if (r0 != 0) goto L8
            boolean r0 = r1.b0
            if (r0 == 0) goto L10
        L8:
            boolean r1 = r1.e()
            if (r1 != 0) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
    }

    private void o() {
            r1 = this;
            java.lang.Runnable r0 = r1.i0
            r1.post(r0)
            return
    }

    private void p() {
            r4 = this;
            android.support.v7.widget.SearchView$SearchAutoComplete r0 = r4.q
            android.text.Editable r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1
            r0 = r0 ^ r1
            r2 = 0
            if (r0 != 0) goto L19
            boolean r3 = r4.Q
            if (r3 == 0) goto L18
            boolean r3 = r4.e0
            if (r3 != 0) goto L18
            goto L19
        L18:
            r1 = r2
        L19:
            android.widget.ImageView r3 = r4.w
            if (r1 == 0) goto L1e
            goto L20
        L1e:
            r2 = 8
        L20:
            r3.setVisibility(r2)
            android.widget.ImageView r4 = r4.w
            android.graphics.drawable.Drawable r4 = r4.getDrawable()
            if (r4 == 0) goto L35
            if (r0 == 0) goto L30
            int[] r0 = android.view.ViewGroup.ENABLED_STATE_SET
            goto L32
        L30:
            int[] r0 = android.view.ViewGroup.EMPTY_STATE_SET
        L32:
            r4.setState(r0)
        L35:
            return
    }

    private void q() {
            r2 = this;
            java.lang.CharSequence r0 = r2.getQueryHint()
            android.support.v7.widget.SearchView$SearchAutoComplete r1 = r2.q
            if (r0 != 0) goto La
            java.lang.String r0 = ""
        La:
            java.lang.CharSequence r2 = r2.c(r0)
            r1.setHint(r2)
            return
    }

    private void r() {
            r5 = this;
            android.support.v7.widget.SearchView$SearchAutoComplete r0 = r5.q
            android.app.SearchableInfo r1 = r5.g0
            int r1 = r1.getSuggestThreshold()
            r0.setThreshold(r1)
            android.support.v7.widget.SearchView$SearchAutoComplete r0 = r5.q
            android.app.SearchableInfo r1 = r5.g0
            int r1 = r1.getImeOptions()
            r0.setImeOptions(r1)
            android.app.SearchableInfo r0 = r5.g0
            int r0 = r0.getInputType()
            r1 = r0 & 15
            r2 = 1
            if (r1 != r2) goto L33
            r1 = -65537(0xfffffffffffeffff, float:NaN)
            r0 = r0 & r1
            android.app.SearchableInfo r1 = r5.g0
            java.lang.String r1 = r1.getSuggestAuthority()
            if (r1 == 0) goto L33
            r1 = 65536(0x10000, float:9.1835E-41)
            r0 = r0 | r1
            r1 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 | r1
        L33:
            android.support.v7.widget.SearchView$SearchAutoComplete r1 = r5.q
            r1.setInputType(r0)
            android.support.v4.widget.d r0 = r5.S
            if (r0 == 0) goto L40
            r1 = 0
            r0.b(r1)
        L40:
            android.app.SearchableInfo r0 = r5.g0
            java.lang.String r0 = r0.getSuggestAuthority()
            if (r0 == 0) goto L68
            android.support.v7.widget.n0 r0 = new android.support.v7.widget.n0
            android.content.Context r1 = r5.getContext()
            android.app.SearchableInfo r3 = r5.g0
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r4 = r5.k0
            r0.<init>(r1, r5, r3, r4)
            r5.S = r0
            android.support.v7.widget.SearchView$SearchAutoComplete r1 = r5.q
            r1.setAdapter(r0)
            android.support.v4.widget.d r0 = r5.S
            android.support.v7.widget.n0 r0 = (android.support.v7.widget.n0) r0
            boolean r5 = r5.V
            if (r5 == 0) goto L65
            r2 = 2
        L65:
            r0.a(r2)
        L68:
            return
    }

    private void s() {
            r1 = this;
            boolean r0 = r1.n()
            if (r0 == 0) goto L18
            android.widget.ImageView r0 = r1.v
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L16
            android.widget.ImageView r0 = r1.x
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L18
        L16:
            r0 = 0
            goto L1a
        L18:
            r0 = 8
        L1a:
            android.view.View r1 = r1.t
            r1.setVisibility(r0)
            return
    }

    private void setQuery(java.lang.CharSequence r2) {
            r1 = this;
            android.support.v7.widget.SearchView$SearchAutoComplete r0 = r1.q
            r0.setText(r2)
            android.support.v7.widget.SearchView$SearchAutoComplete r1 = r1.q
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Lf
            r2 = 0
            goto L13
        Lf:
            int r2 = r2.length()
        L13:
            r1.setSelection(r2)
            return
    }

    @Override // b.b.d.d.c
    public void a() {
            r3 = this;
            boolean r0 = r3.e0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r3.e0 = r0
            android.support.v7.widget.SearchView$SearchAutoComplete r0 = r3.q
            int r0 = r0.getImeOptions()
            r3.f0 = r0
            android.support.v7.widget.SearchView$SearchAutoComplete r1 = r3.q
            r2 = 33554432(0x2000000, float:9.403955E-38)
            r0 = r0 | r2
            r1.setImeOptions(r0)
            android.support.v7.widget.SearchView$SearchAutoComplete r0 = r3.q
            java.lang.String r1 = ""
            r0.setText(r1)
            r0 = 0
            r3.setIconified(r0)
            return
    }

    void a(int r8, java.lang.String r9, java.lang.String r10) {
            r7 = this;
            java.lang.String r1 = "android.intent.action.SEARCH"
            r2 = 0
            r3 = 0
            r0 = r7
            r4 = r10
            r5 = r8
            r6 = r9
            android.content.Intent r8 = r0.a(r1, r2, r3, r4, r5, r6)
            android.content.Context r7 = r7.getContext()
            r7.startActivity(r8)
            return
    }

    void a(java.lang.CharSequence r1) {
            r0 = this;
            r0.setQuery(r1)
            return
    }

    public void a(java.lang.CharSequence r3, boolean r4) {
            r2 = this;
            android.support.v7.widget.SearchView$SearchAutoComplete r0 = r2.q
            r0.setText(r3)
            if (r3 == 0) goto L12
            android.support.v7.widget.SearchView$SearchAutoComplete r0 = r2.q
            int r1 = r0.length()
            r0.setSelection(r1)
            r2.d0 = r3
        L12:
            if (r4 == 0) goto L1d
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L1d
            r2.h()
        L1d:
            return
    }

    boolean a(int r1, int r2, java.lang.String r3) {
            r0 = this;
            android.support.v7.widget.SearchView$n r2 = r0.O
            r3 = 0
            if (r2 == 0) goto Ld
            boolean r2 = r2.b(r1)
            if (r2 != 0) goto Lc
            goto Ld
        Lc:
            return r3
        Ld:
            r2 = 0
            r0.b(r1, r3, r2)
            android.support.v7.widget.SearchView$SearchAutoComplete r1 = r0.q
            r1.setImeVisibility(r3)
            r0.l()
            r0 = 1
            return r0
    }

    boolean a(android.view.View r2, int r3, android.view.KeyEvent r4) {
            r1 = this;
            android.app.SearchableInfo r2 = r1.g0
            r0 = 0
            if (r2 != 0) goto L6
            return r0
        L6:
            android.support.v4.widget.d r2 = r1.S
            if (r2 != 0) goto Lb
            return r0
        Lb:
            int r2 = r4.getAction()
            if (r2 != 0) goto L68
            boolean r2 = r4.hasNoModifiers()
            if (r2 == 0) goto L68
            r2 = 66
            if (r3 == r2) goto L5c
            r2 = 84
            if (r3 == r2) goto L5c
            r2 = 61
            if (r3 != r2) goto L24
            goto L5c
        L24:
            r2 = 21
            if (r3 == r2) goto L3a
            r4 = 22
            if (r3 != r4) goto L2d
            goto L3a
        L2d:
            r2 = 19
            if (r3 != r2) goto L68
            android.support.v7.widget.SearchView$SearchAutoComplete r1 = r1.q
            int r1 = r1.getListSelection()
            if (r1 != 0) goto L68
            return r0
        L3a:
            if (r3 != r2) goto L3e
            r2 = r0
            goto L44
        L3e:
            android.support.v7.widget.SearchView$SearchAutoComplete r2 = r1.q
            int r2 = r2.length()
        L44:
            android.support.v7.widget.SearchView$SearchAutoComplete r3 = r1.q
            r3.setSelection(r2)
            android.support.v7.widget.SearchView$SearchAutoComplete r2 = r1.q
            r2.setListSelection(r0)
            android.support.v7.widget.SearchView$SearchAutoComplete r2 = r1.q
            r2.clearListSelection()
            android.support.v7.widget.SearchView$k r2 = android.support.v7.widget.SearchView.r0
            android.support.v7.widget.SearchView$SearchAutoComplete r1 = r1.q
            r3 = 1
            r2.a(r1, r3)
            return r3
        L5c:
            android.support.v7.widget.SearchView$SearchAutoComplete r2 = r1.q
            int r2 = r2.getListSelection()
            r3 = 0
            boolean r1 = r1.a(r2, r0, r3)
            return r1
        L68:
            return r0
    }

    @Override // b.b.d.d.c
    public void b() {
            r3 = this;
            r0 = 0
            java.lang.String r1 = ""
            r3.a(r1, r0)
            r3.clearFocus()
            r1 = 1
            r3.b(r1)
            android.support.v7.widget.SearchView$SearchAutoComplete r1 = r3.q
            int r2 = r3.f0
            r1.setImeOptions(r2)
            r3.e0 = r0
            return
    }

    void b(java.lang.CharSequence r3) {
            r2 = this;
            android.support.v7.widget.SearchView$SearchAutoComplete r0 = r2.q
            android.text.Editable r0 = r0.getText()
            r2.d0 = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            r2.a(r0)
            r0 = r0 ^ 1
            r2.c(r0)
            r2.p()
            r2.s()
            android.support.v7.widget.SearchView$m r0 = r2.L
            if (r0 == 0) goto L31
            java.lang.CharSequence r0 = r2.c0
            boolean r0 = android.text.TextUtils.equals(r3, r0)
            if (r0 != 0) goto L31
            android.support.v7.widget.SearchView$m r0 = r2.L
            java.lang.String r1 = r3.toString()
            r0.b(r1)
        L31:
            java.lang.String r3 = r3.toString()
            r2.c0 = r3
            return
    }

    void c() {
            r6 = this;
            android.view.View r0 = r6.y
            int r0 = r0.getWidth()
            r1 = 1
            if (r0 <= r1) goto L5d
            android.content.Context r0 = r6.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.view.View r1 = r6.s
            int r1 = r1.getPaddingLeft()
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            boolean r3 = android.support.v7.widget.z0.a(r6)
            boolean r4 = r6.Q
            if (r4 == 0) goto L32
            int r4 = b.b.d.a.d.abc_dropdownitem_icon_width
            int r4 = r0.getDimensionPixelSize(r4)
            int r5 = b.b.d.a.d.abc_dropdownitem_text_padding_left
            int r0 = r0.getDimensionPixelSize(r5)
            int r4 = r4 + r0
            goto L33
        L32:
            r4 = 0
        L33:
            android.support.v7.widget.SearchView$SearchAutoComplete r0 = r6.q
            android.graphics.drawable.Drawable r0 = r0.getDropDownBackground()
            r0.getPadding(r2)
            int r0 = r2.left
            if (r3 == 0) goto L42
            int r0 = -r0
            goto L45
        L42:
            int r0 = r0 + r4
            int r0 = r1 - r0
        L45:
            android.support.v7.widget.SearchView$SearchAutoComplete r3 = r6.q
            r3.setDropDownHorizontalOffset(r0)
            android.view.View r0 = r6.y
            int r0 = r0.getWidth()
            int r3 = r2.left
            int r0 = r0 + r3
            int r2 = r2.right
            int r0 = r0 + r2
            int r0 = r0 + r4
            int r0 = r0 - r1
            android.support.v7.widget.SearchView$SearchAutoComplete r6 = r6.q
            r6.setDropDownWidth(r0)
        L5d:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
            r2 = this;
            r0 = 1
            r2.W = r0
            super.clearFocus()
            android.support.v7.widget.SearchView$SearchAutoComplete r0 = r2.q
            r0.clearFocus()
            android.support.v7.widget.SearchView$SearchAutoComplete r0 = r2.q
            r1 = 0
            r0.setImeVisibility(r1)
            r2.W = r1
            return
    }

    void d() {
            r2 = this;
            android.support.v7.widget.SearchView$k r0 = android.support.v7.widget.SearchView.r0
            android.support.v7.widget.SearchView$SearchAutoComplete r1 = r2.q
            r0.b(r1)
            android.support.v7.widget.SearchView$k r0 = android.support.v7.widget.SearchView.r0
            android.support.v7.widget.SearchView$SearchAutoComplete r2 = r2.q
            r0.a(r2)
            return
    }

    boolean d(int r2) {
            r1 = this;
            android.support.v7.widget.SearchView$n r0 = r1.O
            if (r0 == 0) goto Ld
            boolean r0 = r0.a(r2)
            if (r0 != 0) goto Lb
            goto Ld
        Lb:
            r1 = 0
            return r1
        Ld:
            r1.e(r2)
            r1 = 1
            return r1
    }

    public boolean e() {
            r0 = this;
            boolean r0 = r0.R
            return r0
    }

    void f() {
            r3 = this;
            android.support.v7.widget.SearchView$SearchAutoComplete r0 = r3.q
            android.text.Editable r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1
            if (r0 == 0) goto L22
            boolean r0 = r3.Q
            if (r0 == 0) goto L33
            android.support.v7.widget.SearchView$l r0 = r3.M
            if (r0 == 0) goto L1b
            boolean r0 = r0.a()
            if (r0 != 0) goto L33
        L1b:
            r3.clearFocus()
            r3.b(r1)
            goto L33
        L22:
            android.support.v7.widget.SearchView$SearchAutoComplete r0 = r3.q
            java.lang.String r2 = ""
            r0.setText(r2)
            android.support.v7.widget.SearchView$SearchAutoComplete r0 = r3.q
            r0.requestFocus()
            android.support.v7.widget.SearchView$SearchAutoComplete r3 = r3.q
            r3.setImeVisibility(r1)
        L33:
            return
    }

    void g() {
            r2 = this;
            r0 = 0
            r2.b(r0)
            android.support.v7.widget.SearchView$SearchAutoComplete r0 = r2.q
            r0.requestFocus()
            android.support.v7.widget.SearchView$SearchAutoComplete r0 = r2.q
            r1 = 1
            r0.setImeVisibility(r1)
            android.view.View$OnClickListener r0 = r2.P
            if (r0 == 0) goto L16
            r0.onClick(r2)
        L16:
            return
    }

    public int getImeOptions() {
            r0 = this;
            android.support.v7.widget.SearchView$SearchAutoComplete r0 = r0.q
            int r0 = r0.getImeOptions()
            return r0
    }

    public int getInputType() {
            r0 = this;
            android.support.v7.widget.SearchView$SearchAutoComplete r0 = r0.q
            int r0 = r0.getInputType()
            return r0
    }

    public int getMaxWidth() {
            r0 = this;
            int r0 = r0.a0
            return r0
    }

    public java.lang.CharSequence getQuery() {
            r0 = this;
            android.support.v7.widget.SearchView$SearchAutoComplete r0 = r0.q
            android.text.Editable r0 = r0.getText()
            return r0
    }

    public java.lang.CharSequence getQueryHint() {
            r1 = this;
            java.lang.CharSequence r0 = r1.U
            if (r0 == 0) goto L5
            goto L20
        L5:
            android.app.SearchableInfo r0 = r1.g0
            if (r0 == 0) goto L1e
            int r0 = r0.getHintId()
            if (r0 == 0) goto L1e
            android.content.Context r0 = r1.getContext()
            android.app.SearchableInfo r1 = r1.g0
            int r1 = r1.getHintId()
            java.lang.CharSequence r0 = r0.getText(r1)
            goto L20
        L1e:
            java.lang.CharSequence r0 = r1.K
        L20:
            return r0
    }

    int getSuggestionCommitIconResId() {
            r0 = this;
            int r0 = r0.H
            return r0
    }

    int getSuggestionRowLayout() {
            r0 = this;
            int r0 = r0.G
            return r0
    }

    public android.support.v4.widget.d getSuggestionsAdapter() {
            r0 = this;
            android.support.v4.widget.d r0 = r0.S
            return r0
    }

    void h() {
            r3 = this;
            android.support.v7.widget.SearchView$SearchAutoComplete r0 = r3.q
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L31
            int r1 = android.text.TextUtils.getTrimmedLength(r0)
            if (r1 <= 0) goto L31
            android.support.v7.widget.SearchView$m r1 = r3.L
            if (r1 == 0) goto L1c
            java.lang.String r2 = r0.toString()
            boolean r1 = r1.a(r2)
            if (r1 != 0) goto L31
        L1c:
            android.app.SearchableInfo r1 = r3.g0
            r2 = 0
            if (r1 == 0) goto L29
            r1 = 0
            java.lang.String r0 = r0.toString()
            r3.a(r2, r1, r0)
        L29:
            android.support.v7.widget.SearchView$SearchAutoComplete r0 = r3.q
            r0.setImeVisibility(r2)
            r3.l()
        L31:
            return
    }

    void i() {
            r1 = this;
            boolean r0 = r1.e()
            r1.b(r0)
            r1.o()
            android.support.v7.widget.SearchView$SearchAutoComplete r0 = r1.q
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L15
            r1.d()
        L15:
            return
    }

    void j() {
            r2 = this;
            android.app.SearchableInfo r0 = r2.g0
            if (r0 != 0) goto L5
            return
        L5:
            boolean r1 = r0.getVoiceSearchLaunchWebSearch()     // Catch: android.content.ActivityNotFoundException -> L26
            if (r1 == 0) goto L19
            android.content.Intent r1 = r2.I     // Catch: android.content.ActivityNotFoundException -> L26
            android.content.Intent r0 = r2.b(r1, r0)     // Catch: android.content.ActivityNotFoundException -> L26
        L11:
            android.content.Context r2 = r2.getContext()     // Catch: android.content.ActivityNotFoundException -> L26
            r2.startActivity(r0)     // Catch: android.content.ActivityNotFoundException -> L26
            goto L2d
        L19:
            boolean r1 = r0.getVoiceSearchLaunchRecognizer()     // Catch: android.content.ActivityNotFoundException -> L26
            if (r1 == 0) goto L2d
            android.content.Intent r1 = r2.J     // Catch: android.content.ActivityNotFoundException -> L26
            android.content.Intent r0 = r2.a(r1, r0)     // Catch: android.content.ActivityNotFoundException -> L26
            goto L11
        L26:
            java.lang.String r2 = "SearchView"
            java.lang.String r0 = "Could not find voice search activity"
            android.util.Log.w(r2, r0)
        L2d:
            return
    }

    void k() {
            r2 = this;
            android.support.v7.widget.SearchView$SearchAutoComplete r0 = r2.q
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto Lb
            int[] r0 = android.view.ViewGroup.FOCUSED_STATE_SET
            goto Ld
        Lb:
            int[] r0 = android.view.ViewGroup.EMPTY_STATE_SET
        Ld:
            android.view.View r1 = r2.s
            android.graphics.drawable.Drawable r1 = r1.getBackground()
            if (r1 == 0) goto L18
            r1.setState(r0)
        L18:
            android.view.View r1 = r2.t
            android.graphics.drawable.Drawable r1 = r1.getBackground()
            if (r1 == 0) goto L23
            r1.setState(r0)
        L23:
            r2.invalidate()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            java.lang.Runnable r0 = r1.i0
            r1.removeCallbacks(r0)
            java.lang.Runnable r0 = r1.j0
            r1.post(r0)
            super.onDetachedFromWindow()
            return
    }

    @Override // android.support.v7.widget.g0, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            super.onLayout(r2, r3, r4, r5, r6)
            if (r2 == 0) goto L35
            android.support.v7.widget.SearchView$SearchAutoComplete r2 = r1.q
            android.graphics.Rect r3 = r1.A
            r1.a(r2, r3)
            android.graphics.Rect r2 = r1.B
            android.graphics.Rect r3 = r1.A
            int r5 = r3.left
            r0 = 0
            int r3 = r3.right
            int r6 = r6 - r4
            r2.set(r5, r0, r3, r6)
            android.support.v7.widget.SearchView$p r2 = r1.z
            if (r2 != 0) goto L2e
            android.support.v7.widget.SearchView$p r2 = new android.support.v7.widget.SearchView$p
            android.graphics.Rect r3 = r1.B
            android.graphics.Rect r4 = r1.A
            android.support.v7.widget.SearchView$SearchAutoComplete r5 = r1.q
            r2.<init>(r3, r4, r5)
            r1.z = r2
            r1.setTouchDelegate(r2)
            goto L35
        L2e:
            android.graphics.Rect r3 = r1.B
            android.graphics.Rect r1 = r1.A
            r2.a(r3, r1)
        L35:
            return
    }

    @Override // android.support.v7.widget.g0, android.view.View
    protected void onMeasure(int r4, int r5) {
            r3 = this;
            boolean r0 = r3.e()
            if (r0 == 0) goto La
            super.onMeasure(r4, r5)
            return
        La:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L2c
            if (r0 == 0) goto L22
            if (r0 == r2) goto L1d
            goto L39
        L1d:
            int r0 = r3.a0
            if (r0 <= 0) goto L39
            goto L30
        L22:
            int r4 = r3.a0
            if (r4 <= 0) goto L27
            goto L39
        L27:
            int r4 = r3.getPreferredWidth()
            goto L39
        L2c:
            int r0 = r3.a0
            if (r0 <= 0) goto L31
        L30:
            goto L35
        L31:
            int r0 = r3.getPreferredWidth()
        L35:
            int r4 = java.lang.Math.min(r0, r4)
        L39:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L4b
            if (r0 == 0) goto L46
            goto L53
        L46:
            int r5 = r3.getPreferredHeight()
            goto L53
        L4b:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L53:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.support.v7.widget.SearchView.o
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            android.support.v7.widget.SearchView$o r2 = (android.support.v7.widget.SearchView.o) r2
            android.os.Parcelable r0 = r2.a()
            super.onRestoreInstanceState(r0)
            boolean r2 = r2.d
            r1.b(r2)
            r1.requestLayout()
            return
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            android.support.v7.widget.SearchView$o r1 = new android.support.v7.widget.SearchView$o
            r1.<init>(r0)
            boolean r2 = r2.e()
            r1.d = r2
            return r1
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean r1) {
            r0 = this;
            super.onWindowFocusChanged(r1)
            r0.o()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int r3, android.graphics.Rect r4) {
            r2 = this;
            boolean r0 = r2.W
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            boolean r0 = r2.isFocusable()
            if (r0 != 0) goto Ld
            return r1
        Ld:
            boolean r0 = r2.e()
            if (r0 != 0) goto L1f
            android.support.v7.widget.SearchView$SearchAutoComplete r0 = r2.q
            boolean r3 = r0.requestFocus(r3, r4)
            if (r3 == 0) goto L1e
            r2.b(r1)
        L1e:
            return r3
        L1f:
            boolean r2 = super.requestFocus(r3, r4)
            return r2
    }

    public void setAppSearchData(android.os.Bundle r1) {
            r0 = this;
            r0.h0 = r1
            return
    }

    public void setIconified(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L6
            r0.f()
            goto L9
        L6:
            r0.g()
        L9:
            return
    }

    public void setIconifiedByDefault(boolean r2) {
            r1 = this;
            boolean r0 = r1.Q
            if (r0 != r2) goto L5
            return
        L5:
            r1.Q = r2
            r1.b(r2)
            r1.q()
            return
    }

    public void setImeOptions(int r1) {
            r0 = this;
            android.support.v7.widget.SearchView$SearchAutoComplete r0 = r0.q
            r0.setImeOptions(r1)
            return
    }

    public void setInputType(int r1) {
            r0 = this;
            android.support.v7.widget.SearchView$SearchAutoComplete r0 = r0.q
            r0.setInputType(r1)
            return
    }

    public void setMaxWidth(int r1) {
            r0 = this;
            r0.a0 = r1
            r0.requestLayout()
            return
    }

    public void setOnCloseListener(android.support.v7.widget.SearchView.l r1) {
            r0 = this;
            r0.M = r1
            return
    }

    public void setOnQueryTextFocusChangeListener(android.view.View.OnFocusChangeListener r1) {
            r0 = this;
            r0.N = r1
            return
    }

    public void setOnQueryTextListener(android.support.v7.widget.SearchView.m r1) {
            r0 = this;
            r0.L = r1
            return
    }

    public void setOnSearchClickListener(android.view.View.OnClickListener r1) {
            r0 = this;
            r0.P = r1
            return
    }

    public void setOnSuggestionListener(android.support.v7.widget.SearchView.n r1) {
            r0 = this;
            r0.O = r1
            return
    }

    public void setQueryHint(java.lang.CharSequence r1) {
            r0 = this;
            r0.U = r1
            r0.q()
            return
    }

    public void setQueryRefinementEnabled(boolean r2) {
            r1 = this;
            r1.V = r2
            android.support.v4.widget.d r1 = r1.S
            boolean r0 = r1 instanceof android.support.v7.widget.n0
            if (r0 == 0) goto L12
            android.support.v7.widget.n0 r1 = (android.support.v7.widget.n0) r1
            if (r2 == 0) goto Le
            r2 = 2
            goto Lf
        Le:
            r2 = 1
        Lf:
            r1.a(r2)
        L12:
            return
    }

    public void setSearchableInfo(android.app.SearchableInfo r2) {
            r1 = this;
            r1.g0 = r2
            if (r2 == 0) goto La
            r1.r()
            r1.q()
        La:
            boolean r2 = r1.m()
            r1.b0 = r2
            if (r2 == 0) goto L19
            android.support.v7.widget.SearchView$SearchAutoComplete r2 = r1.q
            java.lang.String r0 = "nm"
            r2.setPrivateImeOptions(r0)
        L19:
            boolean r2 = r1.e()
            r1.b(r2)
            return
    }

    public void setSubmitButtonEnabled(boolean r1) {
            r0 = this;
            r0.T = r1
            boolean r1 = r0.e()
            r0.b(r1)
            return
    }

    public void setSuggestionsAdapter(android.support.v4.widget.d r1) {
            r0 = this;
            r0.S = r1
            android.support.v7.widget.SearchView$SearchAutoComplete r0 = r0.q
            r0.setAdapter(r1)
            return
    }
}
