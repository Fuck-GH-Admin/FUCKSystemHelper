package android.support.v4.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends android.support.v4.widget.d {
    private int j;
    private int k;
    private android.view.LayoutInflater l;

    @java.lang.Deprecated
    public k(android.content.Context r1, int r2, android.database.Cursor r3, boolean r4) {
            r0 = this;
            r0.<init>(r1, r3, r4)
            r0.k = r2
            r0.j = r2
            java.lang.String r2 = "layout_inflater"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.LayoutInflater r1 = (android.view.LayoutInflater) r1
            r0.l = r1
            return
    }

    @Override // android.support.v4.widget.d
    public android.view.View a(android.content.Context r1, android.database.Cursor r2, android.view.ViewGroup r3) {
            r0 = this;
            android.view.LayoutInflater r1 = r0.l
            int r0 = r0.k
            r2 = 0
            android.view.View r0 = r1.inflate(r0, r3, r2)
            return r0
    }

    @Override // android.support.v4.widget.d
    public android.view.View b(android.content.Context r1, android.database.Cursor r2, android.view.ViewGroup r3) {
            r0 = this;
            android.view.LayoutInflater r1 = r0.l
            int r0 = r0.j
            r2 = 0
            android.view.View r0 = r1.inflate(r0, r3, r2)
            return r0
    }
}
