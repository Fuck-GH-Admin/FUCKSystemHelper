package android.support.v4.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends android.widget.BaseAdapter implements android.widget.Filterable, android.support.v4.widget.e.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f648c;
    protected android.database.Cursor d;
    protected android.content.Context e;
    protected int f;
    protected android.support.v4.widget.d.a g;
    protected android.database.DataSetObserver h;
    protected android.support.v4.widget.e i;

    private class a extends android.database.ContentObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.support.v4.widget.d f649a;

        a(android.support.v4.widget.d r1) {
                r0 = this;
                r0.f649a = r1
                android.os.Handler r1 = new android.os.Handler
                r1.<init>()
                r0.<init>(r1)
                return
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
                r0 = this;
                r0 = 1
                return r0
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean r1) {
                r0 = this;
                android.support.v4.widget.d r0 = r0.f649a
                r0.b()
                return
        }
    }

    private class b extends android.database.DataSetObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.support.v4.widget.d f650a;

        b(android.support.v4.widget.d r1) {
                r0 = this;
                r0.f650a = r1
                r0.<init>()
                return
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
                r1 = this;
                android.support.v4.widget.d r1 = r1.f650a
                r0 = 1
                r1.f647b = r0
                r1.notifyDataSetChanged()
                return
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
                r1 = this;
                android.support.v4.widget.d r1 = r1.f650a
                r0 = 0
                r1.f647b = r0
                r1.notifyDataSetInvalidated()
                return
        }
    }

    public d(android.content.Context r1, android.database.Cursor r2, boolean r3) {
            r0 = this;
            r0.<init>()
            if (r3 == 0) goto L7
            r3 = 1
            goto L8
        L7:
            r3 = 2
        L8:
            r0.a(r1, r2, r3)
            return
    }

    @Override // android.support.v4.widget.e.a
    public android.database.Cursor a() {
            r0 = this;
            android.database.Cursor r0 = r0.d
            return r0
    }

    public abstract android.view.View a(android.content.Context r1, android.database.Cursor r2, android.view.ViewGroup r3);

    @Override // android.support.v4.widget.e.a
    public abstract java.lang.CharSequence a(android.database.Cursor r1);

    void a(android.content.Context r4, android.database.Cursor r5, int r6) {
            r3 = this;
            r0 = r6 & 1
            r1 = 0
            r2 = 1
            if (r0 != r2) goto Lb
            r6 = r6 | 2
            r3.f648c = r2
            goto Ld
        Lb:
            r3.f648c = r1
        Ld:
            if (r5 == 0) goto L10
            r1 = r2
        L10:
            r3.d = r5
            r3.f647b = r1
            r3.e = r4
            if (r1 == 0) goto L1f
            java.lang.String r4 = "_id"
            int r4 = r5.getColumnIndexOrThrow(r4)
            goto L20
        L1f:
            r4 = -1
        L20:
            r3.f = r4
            r4 = 2
            r6 = r6 & r4
            if (r6 != r4) goto L33
            android.support.v4.widget.d$a r4 = new android.support.v4.widget.d$a
            r4.<init>(r3)
            r3.g = r4
            android.support.v4.widget.d$b r4 = new android.support.v4.widget.d$b
            r4.<init>(r3)
            goto L36
        L33:
            r4 = 0
            r3.g = r4
        L36:
            r3.h = r4
            if (r1 == 0) goto L48
            android.support.v4.widget.d$a r4 = r3.g
            if (r4 == 0) goto L41
            r5.registerContentObserver(r4)
        L41:
            android.database.DataSetObserver r3 = r3.h
            if (r3 == 0) goto L48
            r5.registerDataSetObserver(r3)
        L48:
            return
    }

    public abstract void a(android.view.View r1, android.content.Context r2, android.database.Cursor r3);

    public abstract android.view.View b(android.content.Context r1, android.database.Cursor r2, android.view.ViewGroup r3);

    protected void b() {
            r1 = this;
            boolean r0 = r1.f648c
            if (r0 == 0) goto L16
            android.database.Cursor r0 = r1.d
            if (r0 == 0) goto L16
            boolean r0 = r0.isClosed()
            if (r0 != 0) goto L16
            android.database.Cursor r0 = r1.d
            boolean r0 = r0.requery()
            r1.f647b = r0
        L16:
            return
    }

    @Override // android.support.v4.widget.e.a
    public void b(android.database.Cursor r1) {
            r0 = this;
            android.database.Cursor r0 = r0.c(r1)
            if (r0 == 0) goto L9
            r0.close()
        L9:
            return
    }

    public android.database.Cursor c(android.database.Cursor r3) {
            r2 = this;
            android.database.Cursor r0 = r2.d
            if (r3 != r0) goto L6
            r2 = 0
            return r2
        L6:
            if (r0 == 0) goto L16
            android.support.v4.widget.d$a r1 = r2.g
            if (r1 == 0) goto Lf
            r0.unregisterContentObserver(r1)
        Lf:
            android.database.DataSetObserver r1 = r2.h
            if (r1 == 0) goto L16
            r0.unregisterDataSetObserver(r1)
        L16:
            r2.d = r3
            if (r3 == 0) goto L37
            android.support.v4.widget.d$a r1 = r2.g
            if (r1 == 0) goto L21
            r3.registerContentObserver(r1)
        L21:
            android.database.DataSetObserver r1 = r2.h
            if (r1 == 0) goto L28
            r3.registerDataSetObserver(r1)
        L28:
            java.lang.String r1 = "_id"
            int r3 = r3.getColumnIndexOrThrow(r1)
            r2.f = r3
            r3 = 1
            r2.f647b = r3
            r2.notifyDataSetChanged()
            goto L40
        L37:
            r3 = -1
            r2.f = r3
            r3 = 0
            r2.f647b = r3
            r2.notifyDataSetInvalidated()
        L40:
            return r0
    }

    @Override // android.widget.Adapter
    public int getCount() {
            r1 = this;
            boolean r0 = r1.f647b
            if (r0 == 0) goto Ld
            android.database.Cursor r1 = r1.d
            if (r1 == 0) goto Ld
            int r1 = r1.getCount()
            return r1
        Ld:
            r1 = 0
            return r1
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public android.view.View getDropDownView(int r2, android.view.View r3, android.view.ViewGroup r4) {
            r1 = this;
            boolean r0 = r1.f647b
            if (r0 == 0) goto L1b
            android.database.Cursor r0 = r1.d
            r0.moveToPosition(r2)
            if (r3 != 0) goto L13
            android.content.Context r2 = r1.e
            android.database.Cursor r3 = r1.d
            android.view.View r3 = r1.a(r2, r3, r4)
        L13:
            android.content.Context r2 = r1.e
            android.database.Cursor r4 = r1.d
            r1.a(r3, r2, r4)
            return r3
        L1b:
            r1 = 0
            return r1
    }

    @Override // android.widget.Filterable
    public android.widget.Filter getFilter() {
            r1 = this;
            android.support.v4.widget.e r0 = r1.i
            if (r0 != 0) goto Lb
            android.support.v4.widget.e r0 = new android.support.v4.widget.e
            r0.<init>(r1)
            r1.i = r0
        Lb:
            android.support.v4.widget.e r1 = r1.i
            return r1
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int r2) {
            r1 = this;
            boolean r0 = r1.f647b
            if (r0 == 0) goto Le
            android.database.Cursor r0 = r1.d
            if (r0 == 0) goto Le
            r0.moveToPosition(r2)
            android.database.Cursor r1 = r1.d
            return r1
        Le:
            r1 = 0
            return r1
    }

    @Override // android.widget.Adapter
    public long getItemId(int r4) {
            r3 = this;
            boolean r0 = r3.f647b
            r1 = 0
            if (r0 == 0) goto L19
            android.database.Cursor r0 = r3.d
            if (r0 == 0) goto L19
            boolean r4 = r0.moveToPosition(r4)
            if (r4 == 0) goto L19
            android.database.Cursor r4 = r3.d
            int r3 = r3.f
            long r3 = r4.getLong(r3)
            return r3
        L19:
            return r1
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int r2, android.view.View r3, android.view.ViewGroup r4) {
            r1 = this;
            boolean r0 = r1.f647b
            if (r0 == 0) goto L35
            android.database.Cursor r0 = r1.d
            boolean r0 = r0.moveToPosition(r2)
            if (r0 == 0) goto L1e
            if (r3 != 0) goto L16
            android.content.Context r2 = r1.e
            android.database.Cursor r3 = r1.d
            android.view.View r3 = r1.b(r2, r3, r4)
        L16:
            android.content.Context r2 = r1.e
            android.database.Cursor r4 = r1.d
            r1.a(r3, r2, r4)
            return r3
        L1e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "couldn't move cursor to position "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L35:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "this should only be called when the cursor is valid"
            r1.<init>(r2)
            throw r1
    }
}
