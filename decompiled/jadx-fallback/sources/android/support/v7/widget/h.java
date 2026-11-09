package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
public class h extends android.widget.CheckedTextView {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f859c = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.support.v7.widget.x f860b;

    static {
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16843016(0x1010108, float:2.3694298E-38)
            r0[r1] = r2
            android.support.v7.widget.h.f859c = r0
            return
    }

    public h(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 16843720(0x10103c8, float:2.369627E-38)
            r1.<init>(r2, r3, r0)
            return
    }

    public h(android.content.Context r3, android.util.AttributeSet r4, int r5) {
            r2 = this;
            android.content.Context r3 = android.support.v7.widget.q0.b(r3)
            r2.<init>(r3, r4, r5)
            android.support.v7.widget.x r3 = new android.support.v7.widget.x
            r3.<init>(r2)
            r2.f860b = r3
            r3.a(r4, r5)
            android.support.v7.widget.x r3 = r2.f860b
            r3.a()
            android.content.Context r3 = r2.getContext()
            int[] r0 = android.support.v7.widget.h.f859c
            r1 = 0
            android.support.v7.widget.t0 r3 = android.support.v7.widget.t0.a(r3, r4, r0, r5, r1)
            android.graphics.drawable.Drawable r4 = r3.b(r1)
            r2.setCheckMarkDrawable(r4)
            r3.a()
            return
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
            r0 = this;
            super.drawableStateChanged()
            android.support.v7.widget.x r0 = r0.f860b
            if (r0 == 0) goto La
            r0.a()
        La:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r2) {
            r1 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r2)
            android.support.v7.widget.l.a(r0, r2, r1)
            return r0
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = b.b.d.b.a.a.c(r0, r2)
            r1.setCheckMarkDrawable(r2)
            return
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback r1) {
            r0 = this;
            android.view.ActionMode$Callback r1 = android.support.v4.widget.l.a(r0, r1)
            super.setCustomSelectionActionModeCallback(r1)
            return
    }

    @Override // android.widget.TextView
    public void setTextAppearance(android.content.Context r1, int r2) {
            r0 = this;
            super.setTextAppearance(r1, r2)
            android.support.v7.widget.x r0 = r0.f860b
            if (r0 == 0) goto La
            r0.a(r1, r2)
        La:
            return
    }
}
