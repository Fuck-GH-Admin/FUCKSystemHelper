package android.support.v7.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: android.support.v7.app.a$a, reason: collision with other inner class name */
    public static class C0030a extends android.view.ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f689a;

        public C0030a(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.f689a = r1
                r1 = 8388627(0x800013, float:1.175497E-38)
                r0.f689a = r1
                return
        }

        public C0030a(android.content.Context r3, android.util.AttributeSet r4) {
                r2 = this;
                r2.<init>(r3, r4)
                r0 = 0
                r2.f689a = r0
                int[] r1 = b.b.d.a.j.ActionBarLayout
                android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r1)
                int r4 = b.b.d.a.j.ActionBarLayout_android_layout_gravity
                int r4 = r3.getInt(r4, r0)
                r2.f689a = r4
                r3.recycle()
                return
        }

        public C0030a(android.support.v7.app.a.C0030a r2) {
                r1 = this;
                r1.<init>(r2)
                r0 = 0
                r1.f689a = r0
                int r2 = r2.f689a
                r1.f689a = r2
                return
        }

        public C0030a(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = 0
                r0.f689a = r1
                return
        }
    }

    public interface b {
        void a(boolean r1);
    }

    @java.lang.Deprecated
    public static abstract class c {
        public c() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract java.lang.CharSequence a();

        public abstract android.view.View b();

        public abstract android.graphics.drawable.Drawable c();

        public abstract java.lang.CharSequence d();

        public abstract void e();
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract b.b.d.d.b a(b.b.d.d.b.a r1);

    public abstract void a(android.content.res.Configuration r1);

    public abstract void a(java.lang.CharSequence r1);

    public abstract boolean a(int r1, android.view.KeyEvent r2);

    public boolean a(android.view.KeyEvent r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    public abstract void b(boolean r1);

    public abstract void c(boolean r1);

    public abstract void d(boolean r1);

    public boolean e() {
            r0 = this;
            r0 = 0
            return r0
    }

    public abstract boolean f();

    public abstract int g();

    public abstract android.content.Context h();

    public boolean i() {
            r0 = this;
            r0 = 0
            return r0
    }

    void j() {
            r0 = this;
            return
    }

    public boolean k() {
            r0 = this;
            r0 = 0
            return r0
    }
}
