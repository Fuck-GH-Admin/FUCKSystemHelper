package a.a.a.b;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static java.lang.String f33b = "NULL";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f34a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a.a.a.b.i f35a = null;

        static {
                a.a.a.b.i r0 = new a.a.a.b.i
                r0.<init>()
                a.a.a.b.i.a.f35a = r0
                return
        }

        public static /* synthetic */ a.a.a.b.i a() {
                a.a.a.b.i r0 = a.a.a.b.i.a.f35a
                return r0
        }
    }

    static {
            return
    }

    public i() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f34a = r0
            return
    }

    public static a.a.a.b.i d() {
            a.a.a.b.i r0 = a.a.a.b.i.a.a()
            return r0
    }

    public final int a(java.lang.String r1) {
            r0 = this;
            int r0 = a.a.a.b.e.a(r1)
            return r0
    }

    public final java.lang.String a(android.location.Location r5) {
            r4 = this;
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            float r0 = r5.getAccuracy()
            r4.append(r0)
            java.lang.String r0 = "|"
            r4.append(r0)
            int r1 = a.a.a.g.d.X
            r4.append(r1)
            r4.append(r0)
            android.os.Bundle r5 = r5.getExtras()
            r1 = -1
            if (r5 == 0) goto L30
            java.lang.String r2 = "meanCn0"
            boolean r3 = r5.containsKey(r2)
            if (r3 == 0) goto L30
            java.lang.Object r2 = r5.get(r2)
            r4.append(r2)
            goto L33
        L30:
            r4.append(r1)
        L33:
            r4.append(r0)
            if (r5 == 0) goto L48
            java.lang.String r2 = "SourceType"
            boolean r3 = r5.containsKey(r2)
            if (r3 == 0) goto L48
            java.lang.Object r5 = r5.get(r2)
            r4.append(r5)
            goto L4b
        L48:
            r4.append(r1)
        L4b:
            r4.append(r0)
            java.lang.String r5 = a.a.a.b.i.f33b
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            return r4
    }

    public void a() {
            r1 = this;
            a.a.a.b.e.b()
            r0 = 0
            r1.f34a = r0
            java.lang.String r1 = ""
            a.a.a.b.i.f33b = r1
            return
    }

    public void a(java.util.ArrayList<java.util.ArrayList<java.lang.Float>> r7) {
            r6 = this;
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            int r0 = r7.size()
            if (r0 != 0) goto L10
            java.lang.String r6 = "NULL"
        Ld:
            a.a.a.b.i.f33b = r6
            return
        L10:
            java.util.Iterator r7 = r7.iterator()
            r0 = 1
            r1 = r0
        L16:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L59
            java.lang.Object r2 = r7.next()
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r3 = r2.size()
            r4 = 6
            if (r3 == r4) goto L2a
            goto L16
        L2a:
            r3 = 0
            if (r1 == 0) goto L2f
            r1 = r3
            goto L34
        L2f:
            java.lang.String r4 = ";"
            r6.append(r4)
        L34:
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r5 = 2
            java.lang.Object r5 = r2.get(r5)
            r4[r3] = r5
            java.lang.String r5 = "%.1f,"
            java.lang.String r4 = java.lang.String.format(r5, r4)
            r6.append(r4)
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r5 = 3
            java.lang.Object r2 = r2.get(r5)
            r4[r3] = r2
            java.lang.String r2 = "%.0f"
            java.lang.String r2 = java.lang.String.format(r2, r4)
            r6.append(r2)
            goto L16
        L59:
            java.lang.String r6 = r6.toString()
            goto Ld
    }

    public int b(android.location.Location r6) {
            r5 = this;
            r0 = -1
            if (r6 != 0) goto L4
            return r0
        L4:
            long r1 = java.lang.System.currentTimeMillis()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            boolean r1 = r5.c()
            if (r1 != 0) goto L14
            r5.b()
        L14:
            boolean r1 = r5.c()
            if (r1 == 0) goto L22
            java.lang.String r6 = r5.a(r6)
            int r0 = r5.a(r6)
        L22:
            return r0
    }

    public final void b() {
            r2 = this;
            a.a.a.i.j.h r0 = a.a.a.i.j.h.a()
            a.a.a.i.j.h$c r1 = a.a.a.i.j.h.c.g
            java.lang.String r0 = r0.a(r1)
            if (r0 != 0) goto Ld
            return
        Ld:
            a.a.a.b.d r1 = a.a.a.b.d.i()
            java.lang.String r1 = r1.G
            int r0 = a.a.a.b.e.a(r0, r1)
            if (r0 != 0) goto L1c
            r0 = 1
            r2.f34a = r0
        L1c:
            return
    }

    public boolean c() {
            r0 = this;
            boolean r0 = r0.f34a
            return r0
    }
}
