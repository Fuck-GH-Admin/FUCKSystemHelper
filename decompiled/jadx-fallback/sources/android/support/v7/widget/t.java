package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
public class t extends android.widget.RatingBar {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.support.v7.widget.r f919b;

    public t(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = b.b.d.a.a.ratingBarStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public t(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            android.support.v7.widget.r r1 = new android.support.v7.widget.r
            r1.<init>(r0)
            r0.f919b = r1
            r1.a(r2, r3)
            return
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int r2, int r3) {
            r1 = this;
            monitor-enter(r1)
            super.onMeasure(r2, r3)     // Catch: java.lang.Throwable -> L23
            android.support.v7.widget.r r3 = r1.f919b     // Catch: java.lang.Throwable -> L23
            android.graphics.Bitmap r3 = r3.a()     // Catch: java.lang.Throwable -> L23
            if (r3 == 0) goto L21
            int r3 = r3.getWidth()     // Catch: java.lang.Throwable -> L23
            int r0 = r1.getNumStars()     // Catch: java.lang.Throwable -> L23
            int r3 = r3 * r0
            r0 = 0
            int r2 = android.view.View.resolveSizeAndState(r3, r2, r0)     // Catch: java.lang.Throwable -> L23
            int r3 = r1.getMeasuredHeight()     // Catch: java.lang.Throwable -> L23
            r1.setMeasuredDimension(r2, r3)     // Catch: java.lang.Throwable -> L23
        L21:
            monitor-exit(r1)
            return
        L23:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
