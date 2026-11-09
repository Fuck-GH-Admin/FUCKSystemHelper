package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
class n0 extends android.support.v4.widget.k implements android.view.View.OnClickListener {
    private final android.support.v7.widget.SearchView m;
    private final android.app.SearchableInfo n;
    private final android.content.Context o;
    private final java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable.ConstantState> p;
    private final int q;
    private boolean r;
    private int s;
    private android.content.res.ColorStateList t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.widget.TextView f895a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final android.widget.TextView f896b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final android.widget.ImageView f897c;
        public final android.widget.ImageView d;
        public final android.widget.ImageView e;

        public a(android.view.View r2) {
                r1 = this;
                r1.<init>()
                r0 = 16908308(0x1020014, float:2.3877285E-38)
                android.view.View r0 = r2.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r1.f895a = r0
                r0 = 16908309(0x1020015, float:2.3877288E-38)
                android.view.View r0 = r2.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r1.f896b = r0
                r0 = 16908295(0x1020007, float:2.387725E-38)
                android.view.View r0 = r2.findViewById(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                r1.f897c = r0
                r0 = 16908296(0x1020008, float:2.3877251E-38)
                android.view.View r0 = r2.findViewById(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                r1.d = r0
                int r0 = b.b.d.a.f.edit_query
                android.view.View r2 = r2.findViewById(r0)
                android.widget.ImageView r2 = (android.widget.ImageView) r2
                r1.e = r2
                return
        }
    }

    public n0(android.content.Context r4, android.support.v7.widget.SearchView r5, android.app.SearchableInfo r6, java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable.ConstantState> r7) {
            r3 = this;
            int r0 = r5.getSuggestionRowLayout()
            r1 = 1
            r2 = 0
            r3.<init>(r4, r0, r2, r1)
            r0 = 0
            r3.r = r0
            r3.s = r1
            r0 = -1
            r3.u = r0
            r3.v = r0
            r3.w = r0
            r3.x = r0
            r3.y = r0
            r3.z = r0
            android.content.Context r0 = r3.e
            java.lang.String r1 = "search"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.SearchManager r0 = (android.app.SearchManager) r0
            r3.m = r5
            r3.n = r6
            int r5 = r5.getSuggestionCommitIconResId()
            r3.q = r5
            r3.o = r4
            r3.p = r7
            return
    }

    private android.graphics.drawable.Drawable a(android.content.ComponentName r6) {
            r5 = this;
            java.lang.String r0 = "SuggestionsAdapter"
            android.content.Context r5 = r5.e
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            r1 = 128(0x80, float:1.8E-43)
            r2 = 0
            android.content.pm.ActivityInfo r1 = r5.getActivityInfo(r6, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L44
            int r3 = r1.getIconResource()
            if (r3 != 0) goto L16
            return r2
        L16:
            java.lang.String r4 = r6.getPackageName()
            android.content.pm.ApplicationInfo r1 = r1.applicationInfo
            android.graphics.drawable.Drawable r5 = r5.getDrawable(r4, r3, r1)
            if (r5 != 0) goto L43
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "Invalid icon resource "
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = " for "
            r5.append(r1)
            java.lang.String r6 = r6.flattenToShortString()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
        L3f:
            android.util.Log.w(r0, r5)
            return r2
        L43:
            return r5
        L44:
            r5 = move-exception
            java.lang.String r5 = r5.toString()
            goto L3f
    }

    private android.graphics.drawable.Drawable a(java.lang.String r1) {
            r0 = this;
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r0 = r0.p
            java.lang.Object r0 = r0.get(r1)
            android.graphics.drawable.Drawable$ConstantState r0 = (android.graphics.drawable.Drawable.ConstantState) r0
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            android.graphics.drawable.Drawable r0 = r0.newDrawable()
            return r0
    }

    private static java.lang.String a(android.database.Cursor r2, int r3) {
            r0 = 0
            r1 = -1
            if (r3 != r1) goto L5
            return r0
        L5:
            java.lang.String r2 = r2.getString(r3)     // Catch: java.lang.Exception -> La
            return r2
        La:
            r2 = move-exception
            java.lang.String r3 = "SuggestionsAdapter"
            java.lang.String r1 = "unexpected error retrieving valid column from cursor, did the remote process die?"
            android.util.Log.e(r3, r1, r2)
            return r0
    }

    public static java.lang.String a(android.database.Cursor r0, java.lang.String r1) {
            int r1 = r0.getColumnIndex(r1)
            java.lang.String r0 = a(r0, r1)
            return r0
    }

    private void a(android.widget.ImageView r1, android.graphics.drawable.Drawable r2, int r3) {
            r0 = this;
            r1.setImageDrawable(r2)
            if (r2 != 0) goto L9
            r1.setVisibility(r3)
            goto L14
        L9:
            r0 = 0
            r1.setVisibility(r0)
            r2.setVisible(r0, r0)
            r1 = 1
            r2.setVisible(r1, r0)
        L14:
            return
    }

    private void a(android.widget.TextView r1, java.lang.CharSequence r2) {
            r0 = this;
            r1.setText(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Lc
            r0 = 8
            goto Ld
        Lc:
            r0 = 0
        Ld:
            r1.setVisibility(r0)
            return
    }

    private void a(java.lang.String r1, android.graphics.drawable.Drawable r2) {
            r0 = this;
            if (r2 == 0) goto Lb
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r0 = r0.p
            android.graphics.drawable.Drawable$ConstantState r2 = r2.getConstantState()
            r0.put(r1, r2)
        Lb:
            return
    }

    private android.graphics.drawable.Drawable b(android.content.ComponentName r4) {
            r3 = this;
            java.lang.String r0 = r4.flattenToShortString()
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r1 = r3.p
            boolean r1 = r1.containsKey(r0)
            r2 = 0
            if (r1 == 0) goto L23
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r4 = r3.p
            java.lang.Object r4 = r4.get(r0)
            android.graphics.drawable.Drawable$ConstantState r4 = (android.graphics.drawable.Drawable.ConstantState) r4
            if (r4 != 0) goto L18
            goto L22
        L18:
            android.content.Context r3 = r3.o
            android.content.res.Resources r3 = r3.getResources()
            android.graphics.drawable.Drawable r2 = r4.newDrawable(r3)
        L22:
            return r2
        L23:
            android.graphics.drawable.Drawable r4 = r3.a(r4)
            if (r4 != 0) goto L2a
            goto L2e
        L2a:
            android.graphics.drawable.Drawable$ConstantState r2 = r4.getConstantState()
        L2e:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r3 = r3.p
            r3.put(r0, r2)
            return r4
    }

    private android.graphics.drawable.Drawable b(android.net.Uri r6) {
            r5 = this;
            java.lang.String r0 = "Error closing icon stream for "
            java.lang.String r1 = "SuggestionsAdapter"
            r2 = 0
            java.lang.String r3 = r6.getScheme()     // Catch: java.io.FileNotFoundException -> L85
            java.lang.String r4 = "android.resource"
            boolean r3 = r4.equals(r3)     // Catch: java.io.FileNotFoundException -> L85
            if (r3 == 0) goto L2d
            android.graphics.drawable.Drawable r5 = r5.a(r6)     // Catch: android.content.res.Resources.NotFoundException -> L16 java.io.FileNotFoundException -> L85
            return r5
        L16:
            java.io.FileNotFoundException r5 = new java.io.FileNotFoundException     // Catch: java.io.FileNotFoundException -> L85
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> L85
            r0.<init>()     // Catch: java.io.FileNotFoundException -> L85
            java.lang.String r3 = "Resource does not exist: "
            r0.append(r3)     // Catch: java.io.FileNotFoundException -> L85
            r0.append(r6)     // Catch: java.io.FileNotFoundException -> L85
            java.lang.String r0 = r0.toString()     // Catch: java.io.FileNotFoundException -> L85
            r5.<init>(r0)     // Catch: java.io.FileNotFoundException -> L85
            throw r5     // Catch: java.io.FileNotFoundException -> L85
        L2d:
            android.content.Context r5 = r5.o     // Catch: java.io.FileNotFoundException -> L85
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch: java.io.FileNotFoundException -> L85
            java.io.InputStream r5 = r5.openInputStream(r6)     // Catch: java.io.FileNotFoundException -> L85
            if (r5 == 0) goto L6e
            android.graphics.drawable.Drawable r3 = android.graphics.drawable.Drawable.createFromStream(r5, r2)     // Catch: java.lang.Throwable -> L55
            r5.close()     // Catch: java.io.IOException -> L41
            goto L54
        L41:
            r5 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> L85
            r4.<init>()     // Catch: java.io.FileNotFoundException -> L85
            r4.append(r0)     // Catch: java.io.FileNotFoundException -> L85
            r4.append(r6)     // Catch: java.io.FileNotFoundException -> L85
            java.lang.String r0 = r4.toString()     // Catch: java.io.FileNotFoundException -> L85
            android.util.Log.e(r1, r0, r5)     // Catch: java.io.FileNotFoundException -> L85
        L54:
            return r3
        L55:
            r3 = move-exception
            r5.close()     // Catch: java.io.IOException -> L5a
            goto L6d
        L5a:
            r5 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> L85
            r4.<init>()     // Catch: java.io.FileNotFoundException -> L85
            r4.append(r0)     // Catch: java.io.FileNotFoundException -> L85
            r4.append(r6)     // Catch: java.io.FileNotFoundException -> L85
            java.lang.String r0 = r4.toString()     // Catch: java.io.FileNotFoundException -> L85
            android.util.Log.e(r1, r0, r5)     // Catch: java.io.FileNotFoundException -> L85
        L6d:
            throw r3     // Catch: java.io.FileNotFoundException -> L85
        L6e:
            java.io.FileNotFoundException r5 = new java.io.FileNotFoundException     // Catch: java.io.FileNotFoundException -> L85
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> L85
            r0.<init>()     // Catch: java.io.FileNotFoundException -> L85
            java.lang.String r3 = "Failed to open "
            r0.append(r3)     // Catch: java.io.FileNotFoundException -> L85
            r0.append(r6)     // Catch: java.io.FileNotFoundException -> L85
            java.lang.String r0 = r0.toString()     // Catch: java.io.FileNotFoundException -> L85
            r5.<init>(r0)     // Catch: java.io.FileNotFoundException -> L85
            throw r5     // Catch: java.io.FileNotFoundException -> L85
        L85:
            r5 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Icon not found: "
            r0.append(r3)
            r0.append(r6)
            java.lang.String r6 = ", "
            r0.append(r6)
            java.lang.String r5 = r5.getMessage()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            android.util.Log.w(r1, r5)
            return r2
    }

    private android.graphics.drawable.Drawable b(java.lang.String r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L6f
            boolean r1 = r5.isEmpty()
            if (r1 != 0) goto L6f
            java.lang.String r1 = "0"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L12
            goto L6f
        L12:
            int r1 = java.lang.Integer.parseInt(r5)     // Catch: android.content.res.Resources.NotFoundException -> L46 java.lang.NumberFormatException -> L5d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: android.content.res.Resources.NotFoundException -> L46 java.lang.NumberFormatException -> L5d
            r2.<init>()     // Catch: android.content.res.Resources.NotFoundException -> L46 java.lang.NumberFormatException -> L5d
            java.lang.String r3 = "android.resource://"
            r2.append(r3)     // Catch: android.content.res.Resources.NotFoundException -> L46 java.lang.NumberFormatException -> L5d
            android.content.Context r3 = r4.o     // Catch: android.content.res.Resources.NotFoundException -> L46 java.lang.NumberFormatException -> L5d
            java.lang.String r3 = r3.getPackageName()     // Catch: android.content.res.Resources.NotFoundException -> L46 java.lang.NumberFormatException -> L5d
            r2.append(r3)     // Catch: android.content.res.Resources.NotFoundException -> L46 java.lang.NumberFormatException -> L5d
            java.lang.String r3 = "/"
            r2.append(r3)     // Catch: android.content.res.Resources.NotFoundException -> L46 java.lang.NumberFormatException -> L5d
            r2.append(r1)     // Catch: android.content.res.Resources.NotFoundException -> L46 java.lang.NumberFormatException -> L5d
            java.lang.String r2 = r2.toString()     // Catch: android.content.res.Resources.NotFoundException -> L46 java.lang.NumberFormatException -> L5d
            android.graphics.drawable.Drawable r3 = r4.a(r2)     // Catch: android.content.res.Resources.NotFoundException -> L46 java.lang.NumberFormatException -> L5d
            if (r3 == 0) goto L3c
            return r3
        L3c:
            android.content.Context r3 = r4.o     // Catch: android.content.res.Resources.NotFoundException -> L46 java.lang.NumberFormatException -> L5d
            android.graphics.drawable.Drawable r1 = b.b.c.a.a.b(r3, r1)     // Catch: android.content.res.Resources.NotFoundException -> L46 java.lang.NumberFormatException -> L5d
            r4.a(r2, r1)     // Catch: android.content.res.Resources.NotFoundException -> L46 java.lang.NumberFormatException -> L5d
            return r1
        L46:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "Icon resource not found: "
            r4.append(r1)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "SuggestionsAdapter"
            android.util.Log.w(r5, r4)
            return r0
        L5d:
            android.graphics.drawable.Drawable r0 = r4.a(r5)
            if (r0 == 0) goto L64
            return r0
        L64:
            android.net.Uri r0 = android.net.Uri.parse(r5)
            android.graphics.drawable.Drawable r0 = r4.b(r0)
            r4.a(r5, r0)
        L6f:
            return r0
    }

    private java.lang.CharSequence b(java.lang.CharSequence r9) {
            r8 = this;
            android.content.res.ColorStateList r0 = r8.t
            if (r0 != 0) goto L23
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r1 = r8.e
            android.content.res.Resources$Theme r1 = r1.getTheme()
            int r2 = b.b.d.a.a.textColorSearchUrl
            r3 = 1
            r1.resolveAttribute(r2, r0, r3)
            android.content.Context r1 = r8.e
            android.content.res.Resources r1 = r1.getResources()
            int r0 = r0.resourceId
            android.content.res.ColorStateList r0 = r1.getColorStateList(r0)
            r8.t = r0
        L23:
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r9)
            android.text.style.TextAppearanceSpan r7 = new android.text.style.TextAppearanceSpan
            r2 = 0
            r3 = 0
            r4 = 0
            android.content.res.ColorStateList r5 = r8.t
            r6 = 0
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r8 = 0
            int r9 = r9.length()
            r1 = 33
            r0.setSpan(r7, r8, r9, r1)
            return r0
    }

    private android.graphics.drawable.Drawable d(android.database.Cursor r1) {
            r0 = this;
            android.app.SearchableInfo r1 = r0.n
            android.content.ComponentName r1 = r1.getSearchActivity()
            android.graphics.drawable.Drawable r1 = r0.b(r1)
            if (r1 == 0) goto Ld
            return r1
        Ld:
            android.content.Context r0 = r0.e
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.graphics.drawable.Drawable r0 = r0.getDefaultActivityIcon()
            return r0
    }

    private android.graphics.drawable.Drawable e(android.database.Cursor r3) {
            r2 = this;
            int r0 = r2.x
            r1 = -1
            if (r0 != r1) goto L7
            r2 = 0
            return r2
        L7:
            java.lang.String r0 = r3.getString(r0)
            android.graphics.drawable.Drawable r0 = r2.b(r0)
            if (r0 == 0) goto L12
            return r0
        L12:
            android.graphics.drawable.Drawable r2 = r2.d(r3)
            return r2
    }

    private android.graphics.drawable.Drawable f(android.database.Cursor r3) {
            r2 = this;
            int r0 = r2.y
            r1 = -1
            if (r0 != r1) goto L7
            r2 = 0
            return r2
        L7:
            java.lang.String r3 = r3.getString(r0)
            android.graphics.drawable.Drawable r2 = r2.b(r3)
            return r2
    }

    private void g(android.database.Cursor r1) {
            r0 = this;
            if (r1 == 0) goto L7
            android.os.Bundle r0 = r1.getExtras()
            goto L8
        L7:
            r0 = 0
        L8:
            if (r0 == 0) goto L12
            java.lang.String r1 = "in_progress"
            boolean r0 = r0.getBoolean(r1)
            if (r0 == 0) goto L12
        L12:
            return
    }

    android.database.Cursor a(android.app.SearchableInfo r10, java.lang.String r11, int r12) {
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r10.getSuggestAuthority()
            if (r1 != 0) goto Lb
            return r0
        Lb:
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            java.lang.String r3 = "content"
            android.net.Uri$Builder r2 = r2.scheme(r3)
            android.net.Uri$Builder r1 = r2.authority(r1)
            java.lang.String r2 = ""
            android.net.Uri$Builder r1 = r1.query(r2)
            android.net.Uri$Builder r1 = r1.fragment(r2)
            java.lang.String r2 = r10.getSuggestPath()
            if (r2 == 0) goto L2d
            r1.appendEncodedPath(r2)
        L2d:
            java.lang.String r2 = "search_suggest_query"
            r1.appendPath(r2)
            java.lang.String r6 = r10.getSuggestSelection()
            if (r6 == 0) goto L3f
            r10 = 1
            java.lang.String[] r0 = new java.lang.String[r10]
            r10 = 0
            r0[r10] = r11
            goto L42
        L3f:
            r1.appendPath(r11)
        L42:
            r7 = r0
            if (r12 <= 0) goto L4e
            java.lang.String r10 = java.lang.String.valueOf(r12)
            java.lang.String r11 = "limit"
            r1.appendQueryParameter(r11, r10)
        L4e:
            android.net.Uri r4 = r1.build()
            android.content.Context r9 = r9.e
            android.content.ContentResolver r3 = r9.getContentResolver()
            r5 = 0
            r8 = 0
            android.database.Cursor r9 = r3.query(r4, r5, r6, r7, r8)
            return r9
    }

    @Override // android.support.v4.widget.e.a
    public android.database.Cursor a(java.lang.CharSequence r4) {
            r3 = this;
            if (r4 != 0) goto L5
            java.lang.String r4 = ""
            goto L9
        L5:
            java.lang.String r4 = r4.toString()
        L9:
            android.support.v7.widget.SearchView r0 = r3.m
            int r0 = r0.getVisibility()
            r1 = 0
            if (r0 != 0) goto L31
            android.support.v7.widget.SearchView r0 = r3.m
            int r0 = r0.getWindowVisibility()
            if (r0 == 0) goto L1b
            goto L31
        L1b:
            android.app.SearchableInfo r0 = r3.n     // Catch: java.lang.RuntimeException -> L29
            r2 = 50
            android.database.Cursor r3 = r3.a(r0, r4, r2)     // Catch: java.lang.RuntimeException -> L29
            if (r3 == 0) goto L31
            r3.getCount()     // Catch: java.lang.RuntimeException -> L29
            return r3
        L29:
            r3 = move-exception
            java.lang.String r4 = "SuggestionsAdapter"
            java.lang.String r0 = "Search suggestions query threw an exception."
            android.util.Log.w(r4, r0, r3)
        L31:
            return r1
    }

    android.graphics.drawable.Drawable a(android.net.Uri r7) {
            r6 = this;
            java.lang.String r0 = r7.getAuthority()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto Lba
            android.content.Context r6 = r6.e     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La3
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La3
            android.content.res.Resources r6 = r6.getResourcesForApplication(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La3
            java.util.List r1 = r7.getPathSegments()
            if (r1 == 0) goto L8c
            int r2 = r1.size()
            r3 = 0
            r4 = 1
            if (r2 != r4) goto L44
            java.lang.Object r0 = r1.get(r3)     // Catch: java.lang.NumberFormatException -> L2d
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NumberFormatException -> L2d
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L2d
            goto L57
        L2d:
            java.io.FileNotFoundException r6 = new java.io.FileNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Single path segment is not a resource ID: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7)
            throw r6
        L44:
            r5 = 2
            if (r2 != r5) goto L75
            java.lang.Object r2 = r1.get(r4)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            int r0 = r6.getIdentifier(r2, r1, r0)
        L57:
            if (r0 == 0) goto L5e
            android.graphics.drawable.Drawable r6 = r6.getDrawable(r0)
            return r6
        L5e:
            java.io.FileNotFoundException r6 = new java.io.FileNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No resource found for: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7)
            throw r6
        L75:
            java.io.FileNotFoundException r6 = new java.io.FileNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "More than two path segments: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7)
            throw r6
        L8c:
            java.io.FileNotFoundException r6 = new java.io.FileNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No path: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7)
            throw r6
        La3:
            java.io.FileNotFoundException r6 = new java.io.FileNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No package found for authority: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7)
            throw r6
        Lba:
            java.io.FileNotFoundException r6 = new java.io.FileNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No authority: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7)
            throw r6
    }

    @Override // android.support.v4.widget.d, android.support.v4.widget.e.a
    public java.lang.CharSequence a(android.database.Cursor r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "suggest_intent_query"
            java.lang.String r1 = a(r3, r1)
            if (r1 == 0) goto Ld
            return r1
        Ld:
            android.app.SearchableInfo r1 = r2.n
            boolean r1 = r1.shouldRewriteQueryFromData()
            if (r1 == 0) goto L1e
            java.lang.String r1 = "suggest_intent_data"
            java.lang.String r1 = a(r3, r1)
            if (r1 == 0) goto L1e
            return r1
        L1e:
            android.app.SearchableInfo r2 = r2.n
            boolean r2 = r2.shouldRewriteQueryFromText()
            if (r2 == 0) goto L2f
            java.lang.String r2 = "suggest_text_1"
            java.lang.String r2 = a(r3, r2)
            if (r2 == 0) goto L2f
            return r2
        L2f:
            return r0
    }

    public void a(int r1) {
            r0 = this;
            r0.s = r1
            return
    }

    @Override // android.support.v4.widget.d
    public void a(android.view.View r7, android.content.Context r8, android.database.Cursor r9) {
            r6 = this;
            java.lang.Object r7 = r7.getTag()
            android.support.v7.widget.n0$a r7 = (android.support.v7.widget.n0.a) r7
            int r8 = r6.z
            r0 = 0
            r1 = -1
            if (r8 == r1) goto L11
            int r8 = r9.getInt(r8)
            goto L12
        L11:
            r8 = r0
        L12:
            android.widget.TextView r1 = r7.f895a
            if (r1 == 0) goto L21
            int r1 = r6.u
            java.lang.String r1 = a(r9, r1)
            android.widget.TextView r2 = r7.f895a
            r6.a(r2, r1)
        L21:
            android.widget.TextView r1 = r7.f896b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L5e
            int r1 = r6.w
            java.lang.String r1 = a(r9, r1)
            if (r1 == 0) goto L34
            java.lang.CharSequence r1 = r6.b(r1)
            goto L3a
        L34:
            int r1 = r6.v
            java.lang.String r1 = a(r9, r1)
        L3a:
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 == 0) goto L4d
            android.widget.TextView r4 = r7.f895a
            if (r4 == 0) goto L59
            r4.setSingleLine(r0)
            android.widget.TextView r4 = r7.f895a
            r4.setMaxLines(r2)
            goto L59
        L4d:
            android.widget.TextView r4 = r7.f895a
            if (r4 == 0) goto L59
            r4.setSingleLine(r3)
            android.widget.TextView r4 = r7.f895a
            r4.setMaxLines(r3)
        L59:
            android.widget.TextView r4 = r7.f896b
            r6.a(r4, r1)
        L5e:
            android.widget.ImageView r1 = r7.f897c
            if (r1 == 0) goto L6a
            android.graphics.drawable.Drawable r4 = r6.e(r9)
            r5 = 4
            r6.a(r1, r4, r5)
        L6a:
            android.widget.ImageView r1 = r7.d
            r4 = 8
            if (r1 == 0) goto L77
            android.graphics.drawable.Drawable r9 = r6.f(r9)
            r6.a(r1, r9, r4)
        L77:
            int r9 = r6.s
            if (r9 == r2) goto L87
            if (r9 != r3) goto L81
            r8 = r8 & r3
            if (r8 == 0) goto L81
            goto L87
        L81:
            android.widget.ImageView r6 = r7.e
            r6.setVisibility(r4)
            goto L9c
        L87:
            android.widget.ImageView r8 = r7.e
            r8.setVisibility(r0)
            android.widget.ImageView r8 = r7.e
            android.widget.TextView r9 = r7.f895a
            java.lang.CharSequence r9 = r9.getText()
            r8.setTag(r9)
            android.widget.ImageView r7 = r7.e
            r7.setOnClickListener(r6)
        L9c:
            return
    }

    @Override // android.support.v4.widget.k, android.support.v4.widget.d
    public android.view.View b(android.content.Context r1, android.database.Cursor r2, android.view.ViewGroup r3) {
            r0 = this;
            android.view.View r1 = super.b(r1, r2, r3)
            android.support.v7.widget.n0$a r2 = new android.support.v7.widget.n0$a
            r2.<init>(r1)
            r1.setTag(r2)
            int r2 = b.b.d.a.f.edit_query
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            int r0 = r0.q
            r2.setImageResource(r0)
            return r1
    }

    @Override // android.support.v4.widget.d, android.support.v4.widget.e.a
    public void b(android.database.Cursor r3) {
            r2 = this;
            boolean r0 = r2.r
            java.lang.String r1 = "SuggestionsAdapter"
            if (r0 == 0) goto L11
            java.lang.String r2 = "Tried to change cursor after adapter was closed."
            android.util.Log.w(r1, r2)
            if (r3 == 0) goto L10
            r3.close()
        L10:
            return
        L11:
            super.b(r3)     // Catch: java.lang.Exception -> L47
            if (r3 == 0) goto L4d
            java.lang.String r0 = "suggest_text_1"
            int r0 = r3.getColumnIndex(r0)     // Catch: java.lang.Exception -> L47
            r2.u = r0     // Catch: java.lang.Exception -> L47
            java.lang.String r0 = "suggest_text_2"
            int r0 = r3.getColumnIndex(r0)     // Catch: java.lang.Exception -> L47
            r2.v = r0     // Catch: java.lang.Exception -> L47
            java.lang.String r0 = "suggest_text_2_url"
            int r0 = r3.getColumnIndex(r0)     // Catch: java.lang.Exception -> L47
            r2.w = r0     // Catch: java.lang.Exception -> L47
            java.lang.String r0 = "suggest_icon_1"
            int r0 = r3.getColumnIndex(r0)     // Catch: java.lang.Exception -> L47
            r2.x = r0     // Catch: java.lang.Exception -> L47
            java.lang.String r0 = "suggest_icon_2"
            int r0 = r3.getColumnIndex(r0)     // Catch: java.lang.Exception -> L47
            r2.y = r0     // Catch: java.lang.Exception -> L47
            java.lang.String r0 = "suggest_flags"
            int r3 = r3.getColumnIndex(r0)     // Catch: java.lang.Exception -> L47
            r2.z = r3     // Catch: java.lang.Exception -> L47
            goto L4d
        L47:
            r2 = move-exception
            java.lang.String r3 = "error changing cursor and caching columns"
            android.util.Log.e(r1, r3, r2)
        L4d:
            return
    }

    @Override // android.support.v4.widget.d, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public android.view.View getDropDownView(int r2, android.view.View r3, android.view.ViewGroup r4) {
            r1 = this;
            android.view.View r1 = super.getDropDownView(r2, r3, r4)     // Catch: java.lang.RuntimeException -> L5
            return r1
        L5:
            r2 = move-exception
            java.lang.String r3 = "SuggestionsAdapter"
            java.lang.String r0 = "Search suggestions cursor threw exception."
            android.util.Log.w(r3, r0, r2)
            android.content.Context r3 = r1.e
            android.database.Cursor r0 = r1.d
            android.view.View r1 = r1.a(r3, r0, r4)
            if (r1 == 0) goto L26
            java.lang.Object r3 = r1.getTag()
            android.support.v7.widget.n0$a r3 = (android.support.v7.widget.n0.a) r3
            android.widget.TextView r3 = r3.f895a
            java.lang.String r2 = r2.toString()
            r3.setText(r2)
        L26:
            return r1
    }

    @Override // android.support.v4.widget.d, android.widget.Adapter
    public android.view.View getView(int r2, android.view.View r3, android.view.ViewGroup r4) {
            r1 = this;
            android.view.View r1 = super.getView(r2, r3, r4)     // Catch: java.lang.RuntimeException -> L5
            return r1
        L5:
            r2 = move-exception
            java.lang.String r3 = "SuggestionsAdapter"
            java.lang.String r0 = "Search suggestions cursor threw exception."
            android.util.Log.w(r3, r0, r2)
            android.content.Context r3 = r1.e
            android.database.Cursor r0 = r1.d
            android.view.View r1 = r1.b(r3, r0, r4)
            if (r1 == 0) goto L26
            java.lang.Object r3 = r1.getTag()
            android.support.v7.widget.n0$a r3 = (android.support.v7.widget.n0.a) r3
            android.widget.TextView r3 = r3.f895a
            java.lang.String r2 = r2.toString()
            r3.setText(r2)
        L26:
            return r1
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
            r1 = this;
            super.notifyDataSetChanged()
            android.database.Cursor r0 = r1.a()
            r1.g(r0)
            return
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
            r1 = this;
            super.notifyDataSetInvalidated()
            android.database.Cursor r0 = r1.a()
            r1.g(r0)
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r2) {
            r1 = this;
            java.lang.Object r2 = r2.getTag()
            boolean r0 = r2 instanceof java.lang.CharSequence
            if (r0 == 0) goto Lf
            android.support.v7.widget.SearchView r1 = r1.m
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.a(r2)
        Lf:
            return
    }
}
