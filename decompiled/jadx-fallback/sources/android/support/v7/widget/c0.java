package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
public class c0 {
    static {
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 18
            if (r0 < r1) goto L10
            java.lang.String r0 = "android.graphics.Insets"
            java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L10
        L10:
            return
    }

    public static android.graphics.PorterDuff.Mode a(int r1, android.graphics.PorterDuff.Mode r2) {
            r0 = 3
            if (r1 == r0) goto L1d
            r0 = 5
            if (r1 == r0) goto L1a
            r0 = 9
            if (r1 == r0) goto L17
            switch(r1) {
                case 14: goto L14;
                case 15: goto L11;
                case 16: goto Le;
                default: goto Ld;
            }
        Ld:
            return r2
        Le:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.ADD
            return r1
        L11:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SCREEN
            return r1
        L14:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
            return r1
        L17:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_ATOP
            return r1
        L1a:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            return r1
        L1d:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_OVER
            return r1
    }

    public static boolean a(android.graphics.drawable.Drawable r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 15
            r2 = 0
            if (r0 >= r1) goto Lc
            boolean r0 = r4 instanceof android.graphics.drawable.InsetDrawable
            if (r0 == 0) goto Lc
            return r2
        Lc:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 >= r1) goto L15
            boolean r0 = r4 instanceof android.graphics.drawable.GradientDrawable
            if (r0 == 0) goto L15
            return r2
        L15:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r0 >= r1) goto L20
            boolean r0 = r4 instanceof android.graphics.drawable.LayerDrawable
            if (r0 == 0) goto L20
            return r2
        L20:
            boolean r0 = r4 instanceof android.graphics.drawable.DrawableContainer
            if (r0 == 0) goto L42
            android.graphics.drawable.Drawable$ConstantState r4 = r4.getConstantState()
            boolean r0 = r4 instanceof android.graphics.drawable.DrawableContainer.DrawableContainerState
            if (r0 == 0) goto L67
            android.graphics.drawable.DrawableContainer$DrawableContainerState r4 = (android.graphics.drawable.DrawableContainer.DrawableContainerState) r4
            android.graphics.drawable.Drawable[] r4 = r4.getChildren()
            int r0 = r4.length
            r1 = r2
        L34:
            if (r1 >= r0) goto L67
            r3 = r4[r1]
            boolean r3 = a(r3)
            if (r3 != 0) goto L3f
            return r2
        L3f:
            int r1 = r1 + 1
            goto L34
        L42:
            boolean r0 = r4 instanceof android.support.v4.graphics.drawable.c
            if (r0 == 0) goto L51
            android.support.v4.graphics.drawable.c r4 = (android.support.v4.graphics.drawable.c) r4
            android.graphics.drawable.Drawable r4 = r4.a()
        L4c:
            boolean r4 = a(r4)
            return r4
        L51:
            boolean r0 = r4 instanceof b.b.d.c.a.c
            if (r0 == 0) goto L5c
            b.b.d.c.a.c r4 = (b.b.d.c.a.c) r4
            android.graphics.drawable.Drawable r4 = r4.a()
            goto L4c
        L5c:
            boolean r0 = r4 instanceof android.graphics.drawable.ScaleDrawable
            if (r0 == 0) goto L67
            android.graphics.drawable.ScaleDrawable r4 = (android.graphics.drawable.ScaleDrawable) r4
            android.graphics.drawable.Drawable r4 = r4.getDrawable()
            goto L4c
        L67:
            r4 = 1
            return r4
    }

    static void b(android.graphics.drawable.Drawable r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 != r1) goto L19
            java.lang.String r0 = "android.graphics.drawable.VectorDrawable"
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L19
            c(r2)
        L19:
            return
    }

    private static void c(android.graphics.drawable.Drawable r2) {
            int[] r0 = r2.getState()
            if (r0 == 0) goto L10
            int r1 = r0.length
            if (r1 != 0) goto La
            goto L10
        La:
            int[] r1 = android.support.v7.widget.o0.f
            r2.setState(r1)
            goto L15
        L10:
            int[] r1 = android.support.v7.widget.o0.e
            r2.setState(r1)
        L15:
            r2.setState(r0)
            return
    }
}
