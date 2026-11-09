package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
public class u extends android.widget.SeekBar {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.support.v7.widget.v f923b;

    public u(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = b.b.d.a.a.seekBarStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public u(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            android.support.v7.widget.v r1 = new android.support.v7.widget.v
            r1.<init>(r0)
            r0.f923b = r1
            r1.a(r2, r3)
            return
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
            r0 = this;
            super.drawableStateChanged()
            android.support.v7.widget.v r0 = r0.f923b
            r0.b()
            return
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
            r0 = this;
            super.jumpDrawablesToCurrentState()
            android.support.v7.widget.v r0 = r0.f923b
            r0.c()
            return
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(android.graphics.Canvas r2) {
            r1 = this;
            monitor-enter(r1)
            super.onDraw(r2)     // Catch: java.lang.Throwable -> Lb
            android.support.v7.widget.v r0 = r1.f923b     // Catch: java.lang.Throwable -> Lb
            r0.a(r2)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
