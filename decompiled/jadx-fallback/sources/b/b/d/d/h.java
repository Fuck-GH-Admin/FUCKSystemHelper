package b.b.d.d;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final java.util.ArrayList<b.b.c.g.u> f1178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f1179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.view.animation.Interpolator f1180c;
    b.b.c.g.v d;
    private boolean e;
    private final b.b.c.g.w f;

    class a extends b.b.c.g.w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f1181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f1182b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b.b.d.d.h f1183c;

        a(b.b.d.d.h r1) {
                r0 = this;
                r0.f1183c = r1
                r0.<init>()
                r1 = 0
                r0.f1181a = r1
                r0.f1182b = r1
                return
        }

        void a() {
                r1 = this;
                r0 = 0
                r1.f1182b = r0
                r1.f1181a = r0
                b.b.d.d.h r1 = r1.f1183c
                r1.b()
                return
        }

        @Override // b.b.c.g.v
        public void a(android.view.View r2) {
                r1 = this;
                int r2 = r1.f1182b
                int r2 = r2 + 1
                r1.f1182b = r2
                b.b.d.d.h r0 = r1.f1183c
                java.util.ArrayList<b.b.c.g.u> r0 = r0.f1178a
                int r0 = r0.size()
                if (r2 != r0) goto L1d
                b.b.d.d.h r2 = r1.f1183c
                b.b.c.g.v r2 = r2.d
                if (r2 == 0) goto L1a
                r0 = 0
                r2.a(r0)
            L1a:
                r1.a()
            L1d:
                return
        }

        @Override // b.b.c.g.w, b.b.c.g.v
        public void b(android.view.View r1) {
                r0 = this;
                boolean r1 = r0.f1181a
                if (r1 == 0) goto L5
                return
            L5:
                r1 = 1
                r0.f1181a = r1
                b.b.d.d.h r0 = r0.f1183c
                b.b.c.g.v r0 = r0.d
                if (r0 == 0) goto L12
                r1 = 0
                r0.b(r1)
            L12:
                return
        }
    }

    public h() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.f1179b = r0
            b.b.d.d.h$a r0 = new b.b.d.d.h$a
            r0.<init>(r2)
            r2.f = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f1178a = r0
            return
    }

    public b.b.d.d.h a(long r2) {
            r1 = this;
            boolean r0 = r1.e
            if (r0 != 0) goto L6
            r1.f1179b = r2
        L6:
            return r1
    }

    public b.b.d.d.h a(android.view.animation.Interpolator r2) {
            r1 = this;
            boolean r0 = r1.e
            if (r0 != 0) goto L6
            r1.f1180c = r2
        L6:
            return r1
    }

    public b.b.d.d.h a(b.b.c.g.u r2) {
            r1 = this;
            boolean r0 = r1.e
            if (r0 != 0) goto L9
            java.util.ArrayList<b.b.c.g.u> r0 = r1.f1178a
            r0.add(r2)
        L9:
            return r1
    }

    public b.b.d.d.h a(b.b.c.g.u r3, b.b.c.g.u r4) {
            r2 = this;
            java.util.ArrayList<b.b.c.g.u> r0 = r2.f1178a
            r0.add(r3)
            long r0 = r3.b()
            r4.b(r0)
            java.util.ArrayList<b.b.c.g.u> r3 = r2.f1178a
            r3.add(r4)
            return r2
    }

    public b.b.d.d.h a(b.b.c.g.v r2) {
            r1 = this;
            boolean r0 = r1.e
            if (r0 != 0) goto L6
            r1.d = r2
        L6:
            return r1
    }

    public void a() {
            r2 = this;
            boolean r0 = r2.e
            if (r0 != 0) goto L5
            return
        L5:
            java.util.ArrayList<b.b.c.g.u> r0 = r2.f1178a
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r0.next()
            b.b.c.g.u r1 = (b.b.c.g.u) r1
            r1.a()
            goto Lb
        L1b:
            r0 = 0
            r2.e = r0
            return
    }

    void b() {
            r1 = this;
            r0 = 0
            r1.e = r0
            return
    }

    public void c() {
            r6 = this;
            boolean r0 = r6.e
            if (r0 == 0) goto L5
            return
        L5:
            java.util.ArrayList<b.b.c.g.u> r0 = r6.f1178a
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r0.next()
            b.b.c.g.u r1 = (b.b.c.g.u) r1
            long r2 = r6.f1179b
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L22
            r1.a(r2)
        L22:
            android.view.animation.Interpolator r2 = r6.f1180c
            if (r2 == 0) goto L29
            r1.a(r2)
        L29:
            b.b.c.g.v r2 = r6.d
            if (r2 == 0) goto L32
            b.b.c.g.w r2 = r6.f
            r1.a(r2)
        L32:
            r1.c()
            goto Lb
        L36:
            r0 = 1
            r6.e = r0
            return
    }
}
