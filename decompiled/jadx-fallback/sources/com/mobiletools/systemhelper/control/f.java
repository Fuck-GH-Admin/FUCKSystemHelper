package com.mobiletools.systemhelper.control;

/* JADX INFO: loaded from: classes.dex */
public class f extends java.lang.Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f1420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f1421c;
    private android.content.pm.PackageManager d;
    private android.content.Context e;
    private java.util.List<c.d.a.b.b> f;
    private com.mobiletools.systemhelper.control.f.a g;
    private com.mobiletools.systemhelper.control.b h;

    public interface a {
        void a(android.content.Context r1, com.mobiletools.systemhelper.control.b r2, java.util.List<c.d.a.b.b> r3);
    }

    class b implements java.util.Comparator<android.app.usage.UsageStats> {
        b(com.mobiletools.systemhelper.control.f r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public int a(android.app.usage.UsageStats r3, android.app.usage.UsageStats r4) {
                r2 = this;
                long r0 = r4.getTotalTimeInForeground()
                long r2 = r3.getTotalTimeInForeground()
                long r0 = r0 - r2
                int r2 = (int) r0
                return r2
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(android.app.usage.UsageStats r1, android.app.usage.UsageStats r2) {
                r0 = this;
                android.app.usage.UsageStats r1 = (android.app.usage.UsageStats) r1
                android.app.usage.UsageStats r2 = (android.app.usage.UsageStats) r2
                int r0 = r0.a(r1, r2)
                return r0
        }
    }

    public f(android.content.Context r3, com.mobiletools.systemhelper.control.b r4, com.mobiletools.systemhelper.control.f.a r5) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f1420b = r0
            r2.f1421c = r0
            r0 = 0
            r2.f = r0
            r2.h = r0
            r2.e = r3
            r2.h = r4
            r2.g = r5
            return
    }

    private c.d.a.b.b a(java.util.List<android.content.pm.ApplicationInfo> r5, android.app.usage.UsageStats r6) {
            r4 = this;
            c.d.a.b.b r0 = new c.d.a.b.b
            r0.<init>()
            java.lang.String r1 = r6.getPackageName()
            r0.b(r1)
            java.util.Iterator r5 = r5.iterator()
        L10:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L38
            java.lang.Object r1 = r5.next()
            android.content.pm.ApplicationInfo r1 = (android.content.pm.ApplicationInfo) r1
            java.lang.String r2 = r1.packageName
            java.lang.String r3 = r6.getPackageName()
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L10
            int r5 = r1.uid
            r0.a(r5)
            android.content.pm.PackageManager r5 = r4.d
            java.lang.CharSequence r5 = r1.loadLabel(r5)
            java.lang.String r5 = (java.lang.String) r5
            r0.a(r5)
        L38:
            long r5 = r6.getTotalTimeInForeground()
            r1 = 60000(0xea60, double:2.9644E-319)
            long r5 = r5 / r1
            r0.a(r5)
            r4.a(r0)
            return r0
    }

    private java.util.List<android.app.usage.UsageStats> a() {
            r6 = this;
            android.content.Context r0 = r6.e
            java.lang.String r1 = "usagestats"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.usage.UsageStatsManager r0 = (android.app.usage.UsageStatsManager) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            long r2 = r6.f1421c
            long r4 = r6.f1420b
            java.util.Map r6 = r0.queryAndAggregateUsageStats(r2, r4)
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L1f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            android.app.usage.UsageStats r0 = (android.app.usage.UsageStats) r0
            r1.add(r0)
            goto L1f
        L35:
            return r1
    }

    private void a(c.d.a.b.b r15) {
            r14 = this;
            android.content.Context r0 = r14.e
            java.lang.String r1 = "netstats"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.usage.NetworkStatsManager r0 = (android.app.usage.NetworkStatsManager) r0
            com.mobiletools.systemhelper.control.b r1 = r14.h
            java.lang.String r1 = r1.i
            r8 = 1024(0x400, double:5.06E-321)
            r10 = 0
            r12 = 0
            if (r1 == 0) goto L68
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L68
            android.app.usage.NetworkStats$Bucket r13 = new android.app.usage.NetworkStats$Bucket
            r13.<init>()
            r2 = 0
            com.mobiletools.systemhelper.control.b r1 = r14.h     // Catch: android.os.RemoteException -> L50
            java.lang.String r3 = r1.i     // Catch: android.os.RemoteException -> L50
            long r4 = r14.f1421c     // Catch: android.os.RemoteException -> L50
            long r6 = r14.f1420b     // Catch: android.os.RemoteException -> L50
            r1 = r0
            android.app.usage.NetworkStats r12 = r1.querySummary(r2, r3, r4, r6)     // Catch: android.os.RemoteException -> L50
            r1 = r10
            r3 = r1
        L30:
            r12.getNextBucket(r13)     // Catch: android.os.RemoteException -> L4e
            int r5 = r13.getUid()     // Catch: android.os.RemoteException -> L4e
            int r6 = r15.b()     // Catch: android.os.RemoteException -> L4e
            if (r6 != r5) goto L47
            long r5 = r13.getRxBytes()     // Catch: android.os.RemoteException -> L4e
            long r1 = r1 + r5
            long r5 = r13.getTxBytes()     // Catch: android.os.RemoteException -> L4e
            long r3 = r3 + r5
        L47:
            boolean r5 = r12.hasNextBucket()     // Catch: android.os.RemoteException -> L4e
            if (r5 != 0) goto L30
            goto L56
        L4e:
            r5 = move-exception
            goto L53
        L50:
            r5 = move-exception
            r1 = r10
            r3 = r1
        L53:
            r5.printStackTrace()
        L56:
            r12.close()
            long r5 = r3 / r8
            r15.h(r5)
            long r5 = r1 / r8
            r15.b(r5)
            long r3 = r3 + r1
            long r3 = r3 / r8
            r15.e(r3)
        L68:
            com.mobiletools.systemhelper.control.b r1 = r14.h
            java.lang.String r1 = r1.u
            if (r1 == 0) goto Lc1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto Lc1
            android.app.usage.NetworkStats$Bucket r13 = new android.app.usage.NetworkStats$Bucket
            r13.<init>()
            r2 = 0
            com.mobiletools.systemhelper.control.b r1 = r14.h     // Catch: android.os.RemoteException -> La9
            java.lang.String r3 = r1.u     // Catch: android.os.RemoteException -> La9
            long r4 = r14.f1421c     // Catch: android.os.RemoteException -> La9
            long r6 = r14.f1420b     // Catch: android.os.RemoteException -> La9
            r1 = r0
            android.app.usage.NetworkStats r12 = r1.querySummary(r2, r3, r4, r6)     // Catch: android.os.RemoteException -> La9
            r1 = r10
            r3 = r1
        L89:
            r12.getNextBucket(r13)     // Catch: android.os.RemoteException -> La7
            int r5 = r13.getUid()     // Catch: android.os.RemoteException -> La7
            int r6 = r15.b()     // Catch: android.os.RemoteException -> La7
            if (r6 != r5) goto La0
            long r5 = r13.getRxBytes()     // Catch: android.os.RemoteException -> La7
            long r1 = r1 + r5
            long r5 = r13.getTxBytes()     // Catch: android.os.RemoteException -> La7
            long r3 = r3 + r5
        La0:
            boolean r5 = r12.hasNextBucket()     // Catch: android.os.RemoteException -> La7
            if (r5 != 0) goto L89
            goto Laf
        La7:
            r5 = move-exception
            goto Lac
        La9:
            r5 = move-exception
            r1 = r10
            r3 = r1
        Lac:
            r5.printStackTrace()
        Laf:
            r12.close()
            long r5 = r3 / r8
            r15.i(r5)
            long r5 = r1 / r8
            r15.c(r5)
            long r3 = r3 + r1
            long r3 = r3 / r8
            r15.f(r3)
        Lc1:
            android.app.usage.NetworkStats$Bucket r8 = new android.app.usage.NetworkStats$Bucket
            r8.<init>()
            r2 = 1
            r3 = 0
            long r4 = r14.f1421c     // Catch: android.os.RemoteException -> Lf2
            long r6 = r14.f1420b     // Catch: android.os.RemoteException -> Lf2
            r1 = r0
            android.app.usage.NetworkStats r12 = r1.querySummary(r2, r3, r4, r6)     // Catch: android.os.RemoteException -> Lf2
            r0 = r10
        Ld2:
            r12.getNextBucket(r8)     // Catch: android.os.RemoteException -> Lf0
            int r14 = r8.getUid()     // Catch: android.os.RemoteException -> Lf0
            int r2 = r15.b()     // Catch: android.os.RemoteException -> Lf0
            if (r2 != r14) goto Le9
            long r2 = r8.getRxBytes()     // Catch: android.os.RemoteException -> Lf0
            long r10 = r10 + r2
            long r2 = r8.getTxBytes()     // Catch: android.os.RemoteException -> Lf0
            long r0 = r0 + r2
        Le9:
            boolean r14 = r12.hasNextBucket()     // Catch: android.os.RemoteException -> Lf0
            if (r14 != 0) goto Ld2
            goto Lf7
        Lf0:
            r14 = move-exception
            goto Lf4
        Lf2:
            r14 = move-exception
            r0 = r10
        Lf4:
            r14.printStackTrace()
        Lf7:
            r12.close()
            r2 = 1048576(0x100000, double:5.180654E-318)
            long r4 = r0 / r2
            r15.j(r4)
            long r4 = r10 / r2
            r15.d(r4)
            long r0 = r0 + r10
            long r0 = r0 / r2
            r15.g(r0)
            return
    }

    private java.util.List<c.d.a.b.b> b() {
            r4 = this;
            boolean r0 = c.d.a.b.d.e
            if (r0 == 0) goto L55
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "queryAppUsageStatsDescend  isUserPermissionOpen :"
            r0.append(r1)
            boolean r1 = c.d.a.b.d.e
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "QueryAppInfoThread"
            c.d.a.b.h.a(r1, r0)
            android.content.Context r0 = r4.e
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r4.d = r0
            r1 = 0
            java.util.List r0 = r0.getInstalledApplications(r1)
            java.util.List r1 = r4.a()
            if (r1 == 0) goto L37
            com.mobiletools.systemhelper.control.f$b r2 = new com.mobiletools.systemhelper.control.f$b
            r2.<init>(r4)
            java.util.Collections.sort(r1, r2)
        L37:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L40:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L54
            java.lang.Object r3 = r1.next()
            android.app.usage.UsageStats r3 = (android.app.usage.UsageStats) r3
            c.d.a.b.b r3 = r4.a(r0, r3)
            r2.add(r3)
            goto L40
        L54:
            return r2
        L55:
            r4 = 0
            return r4
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
            r4 = this;
            long r0 = r4.f1421c
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L19
            long r0 = r4.f1420b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L19
            long r0 = java.lang.System.currentTimeMillis()
            r4.f1420b = r0
            long r2 = c.d.a.b.d.t
            long r0 = r0 - r2
            r4.f1421c = r0
        L19:
            java.util.List r0 = r4.b()
            r4.f = r0
            boolean r0 = c.d.a.b.d.e
            if (r0 == 0) goto L46
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "queryAppUsageStatsDescend  isUserPermissionOpen :"
            r0.append(r1)
            boolean r1 = c.d.a.b.d.e
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "QueryAppInfoThread"
            c.d.a.b.h.a(r1, r0)
            com.mobiletools.systemhelper.control.f$a r0 = r4.g
            android.content.Context r1 = r4.e
            com.mobiletools.systemhelper.control.b r2 = r4.h
            java.util.List<c.d.a.b.b> r4 = r4.f
            r0.a(r1, r2, r4)
        L46:
            return
    }
}
