package android.support.v7.app;

/* JADX INFO: loaded from: classes.dex */
public class b extends android.support.v7.app.g implements android.content.DialogInterface {
    final android.support.v7.app.AlertController d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.support.v7.app.AlertController.f f690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f691b;

        public a(android.content.Context r2) {
                r1 = this;
                r0 = 0
                int r0 = android.support.v7.app.b.a(r2, r0)
                r1.<init>(r2, r0)
                return
        }

        public a(android.content.Context r4, int r5) {
                r3 = this;
                r3.<init>()
                android.support.v7.app.AlertController$f r0 = new android.support.v7.app.AlertController$f
                android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
                int r2 = android.support.v7.app.b.a(r4, r5)
                r1.<init>(r4, r2)
                r0.<init>(r1)
                r3.f690a = r0
                r3.f691b = r5
                return
        }

        public android.support.v7.app.b.a a(android.content.DialogInterface.OnKeyListener r2) {
                r1 = this;
                android.support.v7.app.AlertController$f r0 = r1.f690a
                r0.u = r2
                return r1
        }

        public android.support.v7.app.b.a a(android.graphics.drawable.Drawable r2) {
                r1 = this;
                android.support.v7.app.AlertController$f r0 = r1.f690a
                r0.d = r2
                return r1
        }

        public android.support.v7.app.b.a a(android.view.View r2) {
                r1 = this;
                android.support.v7.app.AlertController$f r0 = r1.f690a
                r0.g = r2
                return r1
        }

        public android.support.v7.app.b.a a(android.widget.ListAdapter r2, android.content.DialogInterface.OnClickListener r3) {
                r1 = this;
                android.support.v7.app.AlertController$f r0 = r1.f690a
                r0.w = r2
                r0.x = r3
                return r1
        }

        public android.support.v7.app.b.a a(java.lang.CharSequence r2) {
                r1 = this;
                android.support.v7.app.AlertController$f r0 = r1.f690a
                r0.f = r2
                return r1
        }

        public android.support.v7.app.b a() {
                r3 = this;
                android.support.v7.app.b r0 = new android.support.v7.app.b
                android.support.v7.app.AlertController$f r1 = r3.f690a
                android.content.Context r1 = r1.f672a
                int r2 = r3.f691b
                r0.<init>(r1, r2)
                android.support.v7.app.AlertController$f r1 = r3.f690a
                android.support.v7.app.AlertController r2 = r0.d
                r1.a(r2)
                android.support.v7.app.AlertController$f r1 = r3.f690a
                boolean r1 = r1.r
                r0.setCancelable(r1)
                android.support.v7.app.AlertController$f r1 = r3.f690a
                boolean r1 = r1.r
                if (r1 == 0) goto L23
                r1 = 1
                r0.setCanceledOnTouchOutside(r1)
            L23:
                android.support.v7.app.AlertController$f r1 = r3.f690a
                android.content.DialogInterface$OnCancelListener r1 = r1.s
                r0.setOnCancelListener(r1)
                android.support.v7.app.AlertController$f r1 = r3.f690a
                android.content.DialogInterface$OnDismissListener r1 = r1.t
                r0.setOnDismissListener(r1)
                android.support.v7.app.AlertController$f r3 = r3.f690a
                android.content.DialogInterface$OnKeyListener r3 = r3.u
                if (r3 == 0) goto L3a
                r0.setOnKeyListener(r3)
            L3a:
                return r0
        }

        public android.content.Context b() {
                r0 = this;
                android.support.v7.app.AlertController$f r0 = r0.f690a
                android.content.Context r0 = r0.f672a
                return r0
        }
    }

    protected b(android.content.Context r2, int r3) {
            r1 = this;
            int r3 = a(r2, r3)
            r1.<init>(r2, r3)
            android.support.v7.app.AlertController r2 = new android.support.v7.app.AlertController
            android.content.Context r3 = r1.getContext()
            android.view.Window r0 = r1.getWindow()
            r2.<init>(r3, r1, r0)
            r1.d = r2
            return
    }

    static int a(android.content.Context r2, int r3) {
            int r0 = r3 >>> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 1
            if (r0 < r1) goto L8
            return r3
        L8:
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources$Theme r2 = r2.getTheme()
            int r0 = b.b.d.a.a.alertDialogTheme
            r2.resolveAttribute(r0, r3, r1)
            int r2 = r3.resourceId
            return r2
    }

    @Override // android.support.v7.app.g, android.app.Dialog
    protected void onCreate(android.os.Bundle r1) {
            r0 = this;
            super.onCreate(r1)
            android.support.v7.app.AlertController r0 = r0.d
            r0.a()
            return
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int r2, android.view.KeyEvent r3) {
            r1 = this;
            android.support.v7.app.AlertController r0 = r1.d
            boolean r0 = r0.a(r2, r3)
            if (r0 == 0) goto La
            r1 = 1
            return r1
        La:
            boolean r1 = super.onKeyDown(r2, r3)
            return r1
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int r2, android.view.KeyEvent r3) {
            r1 = this;
            android.support.v7.app.AlertController r0 = r1.d
            boolean r0 = r0.b(r2, r3)
            if (r0 == 0) goto La
            r1 = 1
            return r1
        La:
            boolean r1 = super.onKeyUp(r2, r3)
            return r1
    }

    @Override // android.support.v7.app.g, android.app.Dialog
    public void setTitle(java.lang.CharSequence r1) {
            r0 = this;
            super.setTitle(r1)
            android.support.v7.app.AlertController r0 = r0.d
            r0.b(r1)
            return
    }
}
