package a.a.a.d;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.util.List<android.location.Location> f174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.String f175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public android.location.Location f176c;

    public j(java.lang.String r2, android.location.Location[] r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f176c = r0
            if (r3 == 0) goto L10
            int r0 = r3.length
            if (r0 <= 0) goto L10
            r1.a(r3)
            r1.f175b = r2
        L10:
            return
    }

    public java.lang.String a() {
            r0 = this;
            java.lang.String r0 = r0.f175b
            return r0
    }

    public final void a(android.location.Location[] r8) {
            r7 = this;
            if (r8 == 0) goto L4a
            int r0 = r8.length
            if (r0 <= 0) goto L4a
            java.util.List<android.location.Location> r0 = r7.f174a
            if (r0 != 0) goto L10
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7.f174a = r0
        L10:
            r0 = 0
            r1 = 0
            r3 = r1
        L14:
            int r5 = r8.length
            if (r0 >= r5) goto L2f
            r5 = r8[r0]
            double r5 = r5.getLatitude()
            double r3 = r3 + r5
            r5 = r8[r0]
            double r5 = r5.getLongitude()
            double r1 = r1 + r5
            java.util.List<android.location.Location> r5 = r7.f174a
            r6 = r8[r0]
            r5.add(r6)
            int r0 = r0 + 1
            goto L14
        L2f:
            android.location.Location r0 = r7.f176c
            if (r0 != 0) goto L4a
            android.location.Location r0 = new android.location.Location
            java.lang.String r5 = "gps"
            r0.<init>(r5)
            r7.f176c = r0
            int r5 = r8.length
            double r5 = (double) r5
            double r3 = r3 / r5
            r0.setLatitude(r3)
            android.location.Location r7 = r7.f176c
            int r8 = r8.length
            double r3 = (double) r8
            double r1 = r1 / r3
            r7.setLongitude(r1)
        L4a:
            return
    }
}
