package android.support.v4.widget;

/* JADX INFO: loaded from: classes.dex */
public class h extends android.support.v4.widget.a {
    private final android.widget.ListView t;

    public h(android.widget.ListView r1) {
            r0 = this;
            r0.<init>(r1)
            r0.t = r1
            return
    }

    @Override // android.support.v4.widget.a
    public void a(int r1, int r2) {
            r0 = this;
            android.widget.ListView r0 = r0.t
            android.support.v4.widget.i.a(r0, r2)
            return
    }

    @Override // android.support.v4.widget.a
    public boolean a(int r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.support.v4.widget.a
    public boolean b(int r7) {
            r6 = this;
            android.widget.ListView r6 = r6.t
            int r0 = r6.getCount()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            int r2 = r6.getChildCount()
            int r3 = r6.getFirstVisiblePosition()
            int r4 = r3 + r2
            r5 = 1
            if (r7 <= 0) goto L29
            if (r4 < r0) goto L38
            int r2 = r2 - r5
            android.view.View r7 = r6.getChildAt(r2)
            int r7 = r7.getBottom()
            int r6 = r6.getHeight()
            if (r7 > r6) goto L38
            return r1
        L29:
            if (r7 >= 0) goto L39
            if (r3 > 0) goto L38
            android.view.View r6 = r6.getChildAt(r1)
            int r6 = r6.getTop()
            if (r6 < 0) goto L38
            return r1
        L38:
            return r5
        L39:
            return r1
    }
}
