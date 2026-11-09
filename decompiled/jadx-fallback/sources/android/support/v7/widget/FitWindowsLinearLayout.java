package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
public class FitWindowsLinearLayout extends android.widget.LinearLayout implements android.support.v7.widget.e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.support.v7.widget.e0.a f801b;

    public FitWindowsLinearLayout(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public FitWindowsLinearLayout(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(android.graphics.Rect r2) {
            r1 = this;
            android.support.v7.widget.e0$a r0 = r1.f801b
            if (r0 == 0) goto L7
            r0.a(r2)
        L7:
            boolean r1 = super.fitSystemWindows(r2)
            return r1
    }

    @Override // android.support.v7.widget.e0
    public void setOnFitSystemWindowsListener(android.support.v7.widget.e0.a r1) {
            r0 = this;
            r0.f801b = r1
            return
    }
}
