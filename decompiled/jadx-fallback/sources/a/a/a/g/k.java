package a.a.a.g;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.util.List<android.net.wifi.ScanResult> f295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f297c;
    public boolean d;
    public boolean e;

    public k(java.util.List<android.net.wifi.ScanResult> r3, long r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f295a = r0
            r0 = 0
            r2.f296b = r0
            r2.f297c = r0
            r0 = 0
            r2.d = r0
            r2.f296b = r4
            r2.f295a = r3
            long r3 = java.lang.System.currentTimeMillis()
            r2.f297c = r3
            r2.d()     // Catch: java.lang.Exception -> L1d
            goto L21
        L1d:
            r2 = move-exception
            r2.printStackTrace()
        L21:
            return
    }

    public boolean a() {
            r4 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r4.f296b
            long r0 = r0 - r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L1c
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r4.f296b
            long r0 = r0 - r2
            r2 = 5000(0x1388, double:2.4703E-320)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L1c
            r4 = 1
            goto L1d
        L1c:
            r4 = 0
        L1d:
            return r4
    }

    public boolean a(a.a.a.g.k r9) {
            r8 = this;
            java.util.List<android.net.wifi.ScanResult> r0 = r8.f295a
            r1 = 0
            if (r0 == 0) goto L61
            if (r9 == 0) goto L61
            java.util.List<android.net.wifi.ScanResult> r2 = r9.f295a
            if (r2 == 0) goto L61
            int r0 = r0.size()
            java.util.List<android.net.wifi.ScanResult> r2 = r9.f295a
            int r2 = r2.size()
            int r0 = java.lang.Math.min(r0, r2)
            r2 = r1
        L1a:
            if (r2 >= r0) goto L5f
            java.util.List<android.net.wifi.ScanResult> r3 = r8.f295a
            java.lang.Object r3 = r3.get(r2)
            if (r3 != 0) goto L25
            goto L5c
        L25:
            java.util.List<android.net.wifi.ScanResult> r3 = r8.f295a
            java.lang.Object r3 = r3.get(r2)
            android.net.wifi.ScanResult r3 = (android.net.wifi.ScanResult) r3
            java.lang.String r3 = r3.BSSID
            java.util.List<android.net.wifi.ScanResult> r4 = r8.f295a
            java.lang.Object r4 = r4.get(r2)
            android.net.wifi.ScanResult r4 = (android.net.wifi.ScanResult) r4
            int r4 = r4.level
            java.util.List<android.net.wifi.ScanResult> r5 = r9.f295a
            java.lang.Object r5 = r5.get(r2)
            android.net.wifi.ScanResult r5 = (android.net.wifi.ScanResult) r5
            java.lang.String r5 = r5.BSSID
            java.util.List<android.net.wifi.ScanResult> r6 = r9.f295a
            java.lang.Object r6 = r6.get(r2)
            android.net.wifi.ScanResult r6 = (android.net.wifi.ScanResult) r6
            int r6 = r6.level
            boolean r7 = android.text.TextUtils.isEmpty(r3)
            if (r7 != 0) goto L59
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L5b
        L59:
            if (r4 == r6) goto L5c
        L5b:
            return r1
        L5c:
            int r2 = r2 + 1
            goto L1a
        L5f:
            r8 = 1
            return r8
        L61:
            return r1
    }

    public boolean a(a.a.a.g.k r1, float r2) {
            r0 = this;
            boolean r0 = a.a.a.g.l.b.a(r1, r0, r2)
            return r0
    }

    public boolean b() {
            r4 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r4.f297c
            long r0 = r0 - r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L1c
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r4.f297c
            long r0 = r0 - r2
            r2 = 5000(0x1388, double:2.4703E-320)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L1c
            r4 = 1
            goto L1d
        L1c:
            r4 = 0
        L1d:
            return r4
    }

    public int c() {
            r0 = this;
            java.util.List<android.net.wifi.ScanResult> r0 = r0.f295a
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.size()
            return r0
    }

    public final void d() {
            r7 = this;
            int r0 = r7.c()
            r1 = 1
            if (r0 >= r1) goto L8
            return
        L8:
            java.util.List<android.net.wifi.ScanResult> r0 = r7.f295a
            int r0 = r0.size()
            int r0 = r0 - r1
            r2 = r1
        L10:
            if (r0 < r1) goto L5e
            if (r2 == 0) goto L5e
            r2 = 0
            r3 = r2
        L16:
            if (r2 >= r0) goto L5a
            java.util.List<android.net.wifi.ScanResult> r4 = r7.f295a
            java.lang.Object r4 = r4.get(r2)
            if (r4 == 0) goto L57
            java.util.List<android.net.wifi.ScanResult> r4 = r7.f295a
            int r5 = r2 + 1
            java.lang.Object r4 = r4.get(r5)
            if (r4 == 0) goto L57
            java.util.List<android.net.wifi.ScanResult> r4 = r7.f295a
            java.lang.Object r4 = r4.get(r2)
            android.net.wifi.ScanResult r4 = (android.net.wifi.ScanResult) r4
            int r4 = r4.level
            java.util.List<android.net.wifi.ScanResult> r6 = r7.f295a
            java.lang.Object r6 = r6.get(r5)
            android.net.wifi.ScanResult r6 = (android.net.wifi.ScanResult) r6
            int r6 = r6.level
            if (r4 >= r6) goto L57
            java.util.List<android.net.wifi.ScanResult> r3 = r7.f295a
            java.lang.Object r3 = r3.get(r5)
            android.net.wifi.ScanResult r3 = (android.net.wifi.ScanResult) r3
            java.util.List<android.net.wifi.ScanResult> r4 = r7.f295a
            java.lang.Object r6 = r4.get(r2)
            r4.set(r5, r6)
            java.util.List<android.net.wifi.ScanResult> r4 = r7.f295a
            r4.set(r2, r3)
            r3 = r1
        L57:
            int r2 = r2 + 1
            goto L16
        L5a:
            int r0 = r0 + (-1)
            r2 = r3
            goto L10
        L5e:
            return
    }
}
