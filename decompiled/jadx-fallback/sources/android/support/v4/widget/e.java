package android.support.v4.widget;

/* JADX INFO: loaded from: classes.dex */
class e extends android.widget.Filter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    android.support.v4.widget.e.a f651a;

    interface a {
        android.database.Cursor a();

        android.database.Cursor a(java.lang.CharSequence r1);

        java.lang.CharSequence a(android.database.Cursor r1);

        void b(android.database.Cursor r1);
    }

    e(android.support.v4.widget.e.a r1) {
            r0 = this;
            r0.<init>()
            r0.f651a = r1
            return
    }

    @Override // android.widget.Filter
    public java.lang.CharSequence convertResultToString(java.lang.Object r1) {
            r0 = this;
            android.support.v4.widget.e$a r0 = r0.f651a
            android.database.Cursor r1 = (android.database.Cursor) r1
            java.lang.CharSequence r0 = r0.a(r1)
            return r0
    }

    @Override // android.widget.Filter
    protected android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r2) {
            r1 = this;
            android.support.v4.widget.e$a r1 = r1.f651a
            android.database.Cursor r1 = r1.a(r2)
            android.widget.Filter$FilterResults r2 = new android.widget.Filter$FilterResults
            r2.<init>()
            if (r1 == 0) goto L14
            int r0 = r1.getCount()
            r2.count = r0
            goto L18
        L14:
            r1 = 0
            r2.count = r1
            r1 = 0
        L18:
            r2.values = r1
            return r2
    }

    @Override // android.widget.Filter
    protected void publishResults(java.lang.CharSequence r1, android.widget.Filter.FilterResults r2) {
            r0 = this;
            android.support.v4.widget.e$a r1 = r0.f651a
            android.database.Cursor r1 = r1.a()
            java.lang.Object r2 = r2.values
            if (r2 == 0) goto L13
            if (r2 == r1) goto L13
            android.support.v4.widget.e$a r0 = r0.f651a
            android.database.Cursor r2 = (android.database.Cursor) r2
            r0.b(r2)
        L13:
            return
    }
}
