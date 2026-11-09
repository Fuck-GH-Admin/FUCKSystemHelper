package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
class v extends android.support.v7.widget.r {
    private final android.widget.SeekBar d;
    private android.graphics.drawable.Drawable e;
    private android.content.res.ColorStateList f;
    private android.graphics.PorterDuff.Mode g;
    private boolean h;
    private boolean i;

    v(android.widget.SeekBar r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 0
            r1.f = r0
            r1.g = r0
            r0 = 0
            r1.h = r0
            r1.i = r0
            r1.d = r2
            return
    }

    private void d() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.e
            if (r0 == 0) goto L3f
            boolean r0 = r2.h
            if (r0 != 0) goto Lc
            boolean r0 = r2.i
            if (r0 == 0) goto L3f
        Lc:
            android.graphics.drawable.Drawable r0 = r2.e
            android.graphics.drawable.Drawable r0 = r0.mutate()
            android.graphics.drawable.Drawable r0 = android.support.v4.graphics.drawable.a.g(r0)
            r2.e = r0
            boolean r1 = r2.h
            if (r1 == 0) goto L21
            android.content.res.ColorStateList r1 = r2.f
            android.support.v4.graphics.drawable.a.a(r0, r1)
        L21:
            boolean r0 = r2.i
            if (r0 == 0) goto L2c
            android.graphics.drawable.Drawable r0 = r2.e
            android.graphics.PorterDuff$Mode r1 = r2.g
            android.support.v4.graphics.drawable.a.a(r0, r1)
        L2c:
            android.graphics.drawable.Drawable r0 = r2.e
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L3f
            android.graphics.drawable.Drawable r0 = r2.e
            android.widget.SeekBar r2 = r2.d
            int[] r2 = r2.getDrawableState()
            r0.setState(r2)
        L3f:
            return
    }

    void a(android.graphics.Canvas r7) {
            r6 = this;
            android.graphics.drawable.Drawable r0 = r6.e
            if (r0 == 0) goto L6a
            android.widget.SeekBar r0 = r6.d
            int r0 = r0.getMax()
            r1 = 1
            if (r0 <= r1) goto L6a
            android.graphics.drawable.Drawable r2 = r6.e
            int r2 = r2.getIntrinsicWidth()
            android.graphics.drawable.Drawable r3 = r6.e
            int r3 = r3.getIntrinsicHeight()
            if (r2 < 0) goto L1e
            int r2 = r2 / 2
            goto L1f
        L1e:
            r2 = r1
        L1f:
            if (r3 < 0) goto L23
            int r1 = r3 / 2
        L23:
            android.graphics.drawable.Drawable r3 = r6.e
            int r4 = -r2
            int r5 = -r1
            r3.setBounds(r4, r5, r2, r1)
            android.widget.SeekBar r1 = r6.d
            int r1 = r1.getWidth()
            android.widget.SeekBar r2 = r6.d
            int r2 = r2.getPaddingLeft()
            int r1 = r1 - r2
            android.widget.SeekBar r2 = r6.d
            int r2 = r2.getPaddingRight()
            int r1 = r1 - r2
            float r1 = (float) r1
            float r2 = (float) r0
            float r1 = r1 / r2
            int r2 = r7.save()
            android.widget.SeekBar r3 = r6.d
            int r3 = r3.getPaddingLeft()
            float r3 = (float) r3
            android.widget.SeekBar r4 = r6.d
            int r4 = r4.getHeight()
            int r4 = r4 / 2
            float r4 = (float) r4
            r7.translate(r3, r4)
            r3 = 0
        L59:
            if (r3 > r0) goto L67
            android.graphics.drawable.Drawable r4 = r6.e
            r4.draw(r7)
            r4 = 0
            r7.translate(r1, r4)
            int r3 = r3 + 1
            goto L59
        L67:
            r7.restoreToCount(r2)
        L6a:
            return
    }

    void a(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.e
            if (r0 == 0) goto L8
            r1 = 0
            r0.setCallback(r1)
        L8:
            r2.e = r3
            if (r3 == 0) goto L2c
            android.widget.SeekBar r0 = r2.d
            r3.setCallback(r0)
            android.widget.SeekBar r0 = r2.d
            int r0 = b.b.c.g.q.d(r0)
            android.support.v4.graphics.drawable.a.a(r3, r0)
            boolean r0 = r3.isStateful()
            if (r0 == 0) goto L29
            android.widget.SeekBar r0 = r2.d
            int[] r0 = r0.getDrawableState()
            r3.setState(r0)
        L29:
            r2.d()
        L2c:
            android.widget.SeekBar r2 = r2.d
            r2.invalidate()
            return
    }

    @Override // android.support.v7.widget.r
    void a(android.util.AttributeSet r4, int r5) {
            r3 = this;
            super.a(r4, r5)
            android.widget.SeekBar r0 = r3.d
            android.content.Context r0 = r0.getContext()
            int[] r1 = b.b.d.a.j.AppCompatSeekBar
            r2 = 0
            android.support.v7.widget.t0 r4 = android.support.v7.widget.t0.a(r0, r4, r1, r5, r2)
            int r5 = b.b.d.a.j.AppCompatSeekBar_android_thumb
            android.graphics.drawable.Drawable r5 = r4.c(r5)
            if (r5 == 0) goto L1d
            android.widget.SeekBar r0 = r3.d
            r0.setThumb(r5)
        L1d:
            int r5 = b.b.d.a.j.AppCompatSeekBar_tickMark
            android.graphics.drawable.Drawable r5 = r4.b(r5)
            r3.a(r5)
            int r5 = b.b.d.a.j.AppCompatSeekBar_tickMarkTintMode
            boolean r5 = r4.g(r5)
            r0 = 1
            if (r5 == 0) goto L40
            int r5 = b.b.d.a.j.AppCompatSeekBar_tickMarkTintMode
            r1 = -1
            int r5 = r4.d(r5, r1)
            android.graphics.PorterDuff$Mode r1 = r3.g
            android.graphics.PorterDuff$Mode r5 = android.support.v7.widget.c0.a(r5, r1)
            r3.g = r5
            r3.i = r0
        L40:
            int r5 = b.b.d.a.j.AppCompatSeekBar_tickMarkTint
            boolean r5 = r4.g(r5)
            if (r5 == 0) goto L52
            int r5 = b.b.d.a.j.AppCompatSeekBar_tickMarkTint
            android.content.res.ColorStateList r5 = r4.a(r5)
            r3.f = r5
            r3.h = r0
        L52:
            r4.a()
            r3.d()
            return
    }

    void b() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.e
            if (r0 == 0) goto L1b
            boolean r1 = r0.isStateful()
            if (r1 == 0) goto L1b
            android.widget.SeekBar r1 = r2.d
            int[] r1 = r1.getDrawableState()
            boolean r1 = r0.setState(r1)
            if (r1 == 0) goto L1b
            android.widget.SeekBar r2 = r2.d
            r2.invalidateDrawable(r0)
        L1b:
            return
    }

    void c() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.e
            if (r0 == 0) goto L7
            r0.jumpToCurrentState()
        L7:
            return
    }
}
