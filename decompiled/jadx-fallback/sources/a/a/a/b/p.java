package a.a.a.b;

/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.util.List<a.a.a.b.p.d> f58a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public android.location.LocationManager f59b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a.a.a.b.p.c f60c;
    public boolean d;

    public static /* synthetic */ class a {
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static a.a.a.b.p f61a;

        static {
                a.a.a.b.p r0 = new a.a.a.b.p
                r0.<init>()
                a.a.a.b.p.b.f61a = r0
                return
        }

        public static /* synthetic */ a.a.a.b.p a() {
                a.a.a.b.p r0 = a.a.a.b.p.b.f61a
                return r0
        }
    }

    public class c implements android.location.LocationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.a.a.b.p f62a;

        public c(a.a.a.b.p r1) {
                r0 = this;
                r0.f62a = r1
                r0.<init>()
                return
        }

        public /* synthetic */ c(a.a.a.b.p r1, a.a.a.b.p.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(android.location.Location r2) {
                r1 = this;
                if (r2 != 0) goto L3
                return
            L3:
                a.a.a.b.p r1 = r1.f62a
                java.util.List<a.a.a.b.p$d> r1 = r1.f58a
                java.util.Iterator r1 = r1.iterator()
            Lb:
                boolean r0 = r1.hasNext()
                if (r0 == 0) goto L1b
                java.lang.Object r0 = r1.next()
                a.a.a.b.p$d r0 = (a.a.a.b.p.d) r0
                r0.a(r2)
                goto Lb
            L1b:
                return
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(java.lang.String r1) {
                r0 = this;
                return
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(java.lang.String r1) {
                r0 = this;
                return
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(java.lang.String r1, int r2, android.os.Bundle r3) {
                r0 = this;
                return
        }
    }

    public interface d {
        void a(android.location.Location r1);
    }

    public p() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f58a = r0
            r0 = 0
            r1.f59b = r0
            r1.f60c = r0
            r0 = 0
            r1.d = r0
            return
    }

    public static a.a.a.b.p c() {
            a.a.a.b.p r0 = a.a.a.b.p.b.a()
            return r0
    }

    public void a() {
            r2 = this;
            a.a.a.b.p$c r0 = r2.f60c
            if (r0 == 0) goto Le
            android.location.LocationManager r1 = r2.f59b
            if (r1 == 0) goto Le
            r1.removeUpdates(r0)
            r0 = 0
            r2.f60c = r0
        Le:
            return
    }

    public void a(a.a.a.b.p.d r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            java.util.List<a.a.a.b.p$d> r0 = r1.f58a
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L10
            java.util.List<a.a.a.b.p$d> r0 = r1.f58a
            r0.add(r2)
        L10:
            java.util.List<a.a.a.b.p$d> r2 = r1.f58a
            int r2 = r2.size()
            r0 = 1
            if (r2 != r0) goto L22
            boolean r2 = r1.d
            if (r2 != 0) goto L22
            r1.b()
            r1.d = r0
        L22:
            return
    }

    public void b() {
            r7 = this;
            android.location.LocationManager r0 = r7.f59b     // Catch: java.lang.Exception -> L36
            if (r0 != 0) goto L12
            android.content.Context r0 = com.baidu.location.f.c()     // Catch: java.lang.Exception -> L36
            java.lang.String r1 = "location"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Exception -> L36
            android.location.LocationManager r0 = (android.location.LocationManager) r0     // Catch: java.lang.Exception -> L36
            r7.f59b = r0     // Catch: java.lang.Exception -> L36
        L12:
            a.a.a.b.p$c r0 = r7.f60c     // Catch: java.lang.Exception -> L36
            if (r0 != 0) goto L1e
            a.a.a.b.p$c r0 = new a.a.a.b.p$c     // Catch: java.lang.Exception -> L36
            r1 = 0
            r0.<init>(r7, r1)     // Catch: java.lang.Exception -> L36
            r7.f60c = r0     // Catch: java.lang.Exception -> L36
        L1e:
            android.location.LocationManager r0 = r7.f59b     // Catch: java.lang.Exception -> L36
            if (r0 == 0) goto L36
            java.lang.String r1 = "network"
            boolean r0 = r0.isProviderEnabled(r1)     // Catch: java.lang.Exception -> L36
            if (r0 == 0) goto L36
            android.location.LocationManager r1 = r7.f59b     // Catch: java.lang.Exception -> L36
            java.lang.String r2 = "network"
            r3 = 1000(0x3e8, double:4.94E-321)
            r5 = 0
            a.a.a.b.p$c r6 = r7.f60c     // Catch: java.lang.Exception -> L36
            r1.requestLocationUpdates(r2, r3, r5, r6)     // Catch: java.lang.Exception -> L36
        L36:
            return
    }

    public void b(a.a.a.b.p.d r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            java.util.List<a.a.a.b.p$d> r0 = r1.f58a
            r0.remove(r2)
            java.util.List<a.a.a.b.p$d> r2 = r1.f58a
            int r2 = r2.size()
            if (r2 != 0) goto L1a
            boolean r2 = r1.d
            if (r2 == 0) goto L1a
            r1.a()
            r2 = 0
            r1.d = r2
        L1a:
            return
    }
}
