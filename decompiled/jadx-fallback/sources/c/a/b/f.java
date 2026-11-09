package c.a.b;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c.a.b.e.d.d f1265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.util.List f1266b;

    public f() {
            r0 = this;
            r0.<init>()
            r0.a()
            return
    }

    private static java.lang.String a(byte[] r5) {
            if (r5 == 0) goto L39
            r0 = 0
            java.lang.String r1 = ""
        L5:
            int r2 = r5.length
            if (r0 >= r2) goto L34
            r2 = r5[r0]
            r2 = r2 & 255(0xff, float:3.57E-43)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            int r3 = r2.length()
            r4 = 1
            if (r3 != r4) goto L22
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = "0"
            goto L27
        L22:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
        L27:
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            int r0 = r0 + 1
            goto L5
        L34:
            java.lang.String r5 = r1.toLowerCase()
            return r5
        L39:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Argument b ( byte array ) is null! "
            r5.<init>(r0)
            throw r5
    }

    private void a() {
            r3 = this;
            c.a.b.e.d.e r0 = new c.a.b.e.d.e
            byte[] r1 = c.a.b.j.a()
            byte[] r2 = c.a.b.j.b()
            r0.<init>(r1, r2)
            r3.f1265a = r0
            return
    }

    private boolean a(java.lang.String[] r5, java.lang.String[] r6) {
            r4 = this;
            r4 = 0
            if (r5 == 0) goto L2f
            if (r6 == 0) goto L2f
            int r0 = r5.length
            int r1 = r6.length
            if (r0 == r1) goto La
            goto L2f
        La:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            int r1 = r5.length
            r2 = r4
        L11:
            if (r2 >= r1) goto L1b
            r3 = r5[r2]
            r0.add(r3)
            int r2 = r2 + 1
            goto L11
        L1b:
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            int r1 = r6.length
        L21:
            if (r4 >= r1) goto L2b
            r2 = r6[r4]
            r5.add(r2)
            int r4 = r4 + 1
            goto L21
        L2b:
            boolean r4 = r0.equals(r5)
        L2f:
            return r4
    }

    private static byte[] a(byte[] r2, c.a.b.e.d.d r3) {
            c.a.b.e.d.a r0 = c.a.b.e.d.a.a()
            r1 = 2
            r0.a(r1, r3)
            byte[] r2 = r0.a(r2)
            return r2
    }

    private java.lang.String[] a(android.content.pm.Signature[] r4) {
            r3 = this;
            int r3 = r4.length
            java.lang.String[] r0 = new java.lang.String[r3]
            r1 = 0
        L4:
            if (r1 >= r3) goto L19
            r2 = r4[r1]
            byte[] r2 = r2.toByteArray()
            byte[] r2 = c.a.b.g.c.a(r2)
            java.lang.String r2 = a(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L19:
            return r0
    }

    java.util.List a(android.content.Context r16, android.content.Intent r17, boolean r18) {
            r15 = this;
            r0 = r15
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.content.pm.PackageManager r2 = r16.getPackageManager()
            r3 = 0
            r4 = r17
            java.util.List r4 = r2.queryBroadcastReceivers(r4, r3)
            if (r4 == 0) goto Lee
            java.util.Iterator r4 = r4.iterator()
        L17:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lee
            java.lang.Object r5 = r4.next()
            android.content.pm.ResolveInfo r5 = (android.content.pm.ResolveInfo) r5
            android.content.pm.ActivityInfo r6 = r5.activityInfo
            if (r6 == 0) goto L17
            android.content.pm.ApplicationInfo r6 = r6.applicationInfo
            if (r6 == 0) goto L17
            android.content.ComponentName r6 = new android.content.ComponentName     // Catch: java.lang.Exception -> L17
            android.content.pm.ActivityInfo r7 = r5.activityInfo     // Catch: java.lang.Exception -> L17
            java.lang.String r7 = r7.packageName     // Catch: java.lang.Exception -> L17
            android.content.pm.ActivityInfo r8 = r5.activityInfo     // Catch: java.lang.Exception -> L17
            java.lang.String r8 = r8.name     // Catch: java.lang.Exception -> L17
            r6.<init>(r7, r8)     // Catch: java.lang.Exception -> L17
            r7 = 128(0x80, float:1.8E-43)
            android.content.pm.ActivityInfo r6 = r2.getReceiverInfo(r6, r7)     // Catch: java.lang.Exception -> L17
            android.os.Bundle r6 = r6.metaData     // Catch: java.lang.Exception -> L17
            if (r6 != 0) goto L43
            goto L17
        L43:
            java.lang.String r7 = "galaxy_data"
            java.lang.String r7 = r6.getString(r7)     // Catch: java.lang.Exception -> L17
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Exception -> L17
            if (r8 == 0) goto L50
            goto L17
        L50:
            java.lang.String r8 = "utf-8"
            byte[] r7 = r7.getBytes(r8)     // Catch: java.lang.Exception -> L17
            byte[] r7 = c.a.b.g.a.a(r7)     // Catch: java.lang.Exception -> L17
            java.lang.String r8 = new java.lang.String     // Catch: java.lang.Exception -> L17
            r8.<init>(r7)     // Catch: java.lang.Exception -> L17
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: java.lang.Exception -> L17
            r9.<init>(r8)     // Catch: java.lang.Exception -> L17
            c.a.b.d r8 = new c.a.b.d     // Catch: java.lang.Exception -> L17
            r8.<init>()     // Catch: java.lang.Exception -> L17
            java.lang.String r10 = "priority"
            int r10 = r9.getInt(r10)     // Catch: java.lang.Exception -> L17
            r8.f1232b = r10     // Catch: java.lang.Exception -> L17
            android.content.pm.ActivityInfo r10 = r5.activityInfo     // Catch: java.lang.Exception -> L17
            android.content.pm.ApplicationInfo r10 = r10.applicationInfo     // Catch: java.lang.Exception -> L17
            r8.f1231a = r10     // Catch: java.lang.Exception -> L17
            java.lang.String r10 = r16.getPackageName()     // Catch: java.lang.Exception -> L17
            android.content.pm.ActivityInfo r11 = r5.activityInfo     // Catch: java.lang.Exception -> L17
            android.content.pm.ApplicationInfo r11 = r11.applicationInfo     // Catch: java.lang.Exception -> L17
            java.lang.String r11 = r11.packageName     // Catch: java.lang.Exception -> L17
            boolean r10 = r10.equals(r11)     // Catch: java.lang.Exception -> L17
            r11 = 1
            if (r10 == 0) goto L8a
            r8.d = r11     // Catch: java.lang.Exception -> L17
        L8a:
            if (r18 == 0) goto Le9
            java.lang.String r10 = "galaxy_sf"
            java.lang.String r6 = r6.getString(r10)     // Catch: java.lang.Exception -> L17
            boolean r10 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> L17
            if (r10 != 0) goto Le9
            android.content.pm.ActivityInfo r5 = r5.activityInfo     // Catch: java.lang.Exception -> L17
            android.content.pm.ApplicationInfo r5 = r5.applicationInfo     // Catch: java.lang.Exception -> L17
            java.lang.String r5 = r5.packageName     // Catch: java.lang.Exception -> L17
            r10 = 64
            android.content.pm.PackageInfo r5 = r2.getPackageInfo(r5, r10)     // Catch: java.lang.Exception -> L17
            java.lang.String r10 = "sigs"
            org.json.JSONArray r9 = r9.getJSONArray(r10)     // Catch: java.lang.Exception -> L17
            int r10 = r9.length()     // Catch: java.lang.Exception -> L17
            java.lang.String[] r12 = new java.lang.String[r10]     // Catch: java.lang.Exception -> L17
            r13 = r3
        Lb1:
            if (r13 >= r10) goto Lbc
            java.lang.String r14 = r9.getString(r13)     // Catch: java.lang.Exception -> L17
            r12[r13] = r14     // Catch: java.lang.Exception -> L17
            int r13 = r13 + 1
            goto Lb1
        Lbc:
            android.content.pm.Signature[] r5 = r5.signatures     // Catch: java.lang.Exception -> L17
            java.lang.String[] r5 = r15.a(r5)     // Catch: java.lang.Exception -> L17
            boolean r5 = r15.a(r12, r5)     // Catch: java.lang.Exception -> L17
            if (r5 == 0) goto Le9
            byte[] r5 = r6.getBytes()     // Catch: java.lang.Exception -> L17
            byte[] r5 = c.a.b.g.a.a(r5)     // Catch: java.lang.Exception -> L17
            c.a.b.e.d.d r6 = r0.f1265a     // Catch: java.lang.Exception -> L17
            byte[] r5 = a(r5, r6)     // Catch: java.lang.Exception -> L17
            byte[] r6 = c.a.b.g.c.a(r7)     // Catch: java.lang.Exception -> L17
            if (r5 == 0) goto Le4
            boolean r5 = java.util.Arrays.equals(r5, r6)     // Catch: java.lang.Exception -> L17
            if (r5 == 0) goto Le4
            r5 = r11
            goto Le5
        Le4:
            r5 = r3
        Le5:
            if (r5 == 0) goto Le9
            r8.f1233c = r11     // Catch: java.lang.Exception -> L17
        Le9:
            r1.add(r8)     // Catch: java.lang.Exception -> L17
            goto L17
        Lee:
            c.a.b.h r2 = new c.a.b.h
            r2.<init>(r15)
            java.util.Collections.sort(r1, r2)
            return r1
    }

    public boolean a(android.content.Context r4) {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.baidu.intent.action.GALAXY"
            r0.<init>(r1)
            java.lang.String r1 = r4.getPackageName()
            android.content.Intent r0 = r0.setPackage(r1)
            r1 = 1
            java.util.List r3 = r3.a(r4, r0, r1)
            java.lang.String r4 = "CuidBuddyInfoManager"
            r0 = 3
            r1 = 0
            if (r3 == 0) goto L37
            int r2 = r3.size()
            if (r2 != 0) goto L21
            goto L37
        L21:
            java.lang.Object r3 = r3.get(r1)
            c.a.b.d r3 = (c.a.b.d) r3
            boolean r3 = r3.f1233c
            if (r3 != 0) goto L35
        L2b:
            if (r1 >= r0) goto L35
            java.lang.String r2 = "galaxy config err, In the release version of the signature should be matched"
            android.util.Log.w(r4, r2)
            int r1 = r1 + 1
            goto L2b
        L35:
            r1 = r3
            goto L42
        L37:
            r3 = r1
        L38:
            if (r3 >= r0) goto L42
            java.lang.String r2 = "galaxy lib host missing meta-data,make sure you know the right way to integrate galaxy"
            android.util.Log.w(r4, r2)
            int r3 = r3 + 1
            goto L38
        L42:
            return r1
    }

    java.util.List b(android.content.Context r3) {
            r2 = this;
            java.util.List r0 = r2.f1266b
            if (r0 == 0) goto L5
            return r0
        L5:
            r2.a(r3)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.baidu.intent.action.GALAXY"
            r0.<init>(r1)
            r1 = 1
            java.util.List r3 = r2.a(r3, r0, r1)
            r2.f1266b = r3
            return r3
    }
}
