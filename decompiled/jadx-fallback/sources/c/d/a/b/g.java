package c.d.a.b;

/* JADX INFO: loaded from: classes.dex */
public class g {
    public static long a(android.content.Context r4) {
            long r0 = c()
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto Le
            long r0 = c(r4)
        Le:
            return r0
    }

    public static java.lang.String a() {
            android.os.StatFs r0 = new android.os.StatFs
            java.io.File r1 = android.os.Environment.getDataDirectory()
            java.lang.String r1 = r1.getPath()
            r0.<init>(r1)
            long r1 = r0.getBlockSizeLong()
            long r3 = r0.getFreeBlocksLong()
            long r3 = r3 * r1
            double r0 = (double) r3
            r2 = 4652218415073722368(0x4090000000000000, double:1024.0)
            r4 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r2 = java.lang.Math.pow(r2, r4)
            double r0 = r0 / r2
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            double r2 = r0.doubleValue()
            long r2 = java.lang.Math.round(r2)
            int r0 = (int) r2
            r1.append(r0)
            java.lang.String r0 = "G"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    public static java.lang.String b() {
            android.os.StatFs r0 = new android.os.StatFs
            java.io.File r1 = android.os.Environment.getDataDirectory()
            java.lang.String r1 = r1.getPath()
            r0.<init>(r1)
            long r1 = r0.getBlockSizeLong()
            long r3 = r0.getBlockCountLong()
            long r3 = r3 * r1
            double r0 = (double) r3
            r2 = 4652218415073722368(0x4090000000000000, double:1024.0)
            r4 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r2 = java.lang.Math.pow(r2, r4)
            double r0 = r0 / r2
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r1 = 0
        L25:
            double r2 = r0.doubleValue()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            if (r2 <= 0) goto L4f
            double r5 = r0.doubleValue()
            int r2 = r1 + 1
            double r7 = (double) r2
            double r7 = java.lang.Math.pow(r3, r7)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 >= 0) goto L4d
            double r5 = r0.doubleValue()
            double r7 = (double) r1
            double r7 = java.lang.Math.pow(r3, r7)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 >= 0) goto L4f
        L4d:
            r1 = r2
            goto L25
        L4f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r1 + 1
            double r1 = (double) r1
            double r1 = java.lang.Math.pow(r3, r1)
            int r1 = (int) r1
            r0.append(r1)
            java.lang.String r1 = "G"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static org.json.JSONObject b(android.content.Context r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = a(r4)
            r0.append(r1)
            java.lang.String r4 = "G"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = b()
            java.lang.String r1 = a()
            java.lang.String r2 = "Unknown"
            if (r4 != 0) goto L22
            r4 = r2
        L22:
            if (r0 != 0) goto L25
            r0 = r2
        L25:
            if (r1 != 0) goto L28
            r1 = r2
        L28:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "RAM"
            r2.put(r3, r4)     // Catch: org.json.JSONException -> L3d
            java.lang.String r4 = "ROM"
            r2.put(r4, r0)     // Catch: org.json.JSONException -> L3d
            java.lang.String r4 = "FREE"
            r2.put(r4, r1)     // Catch: org.json.JSONException -> L3d
            return r2
        L3d:
            r4 = move-exception
            java.lang.String r4 = r4.getMessage()
            java.lang.String r0 = "MemoryUtils"
            c.d.a.b.h.b(r0, r4)
            r4 = 0
            return r4
    }

    private static long c() {
            java.lang.String r0 = ""
            java.lang.String r1 = "ro.boot.dram_info"
            java.lang.String r1 = c.d.a.b.l.b(r1, r0)
            r2 = -1
            java.lang.String r4 = "MemoryUtils"
            if (r1 == 0) goto L64
            boolean r5 = r1.isEmpty()
            if (r5 == 0) goto L15
            goto L64
        L15:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "dramInfo:"
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            c.d.a.b.h.a(r4, r5)
            java.lang.String r5 = ","
            java.lang.String[] r1 = r1.split(r5)
            int r5 = r1.length
            int r5 = r5 + (-1)
            r1 = r1[r5]
            java.lang.String r5 = "\\D+"
            java.lang.String r0 = r1.replaceAll(r5, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "parsed value : "
            r1.append(r5)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            c.d.a.b.h.a(r4, r1)
            if (r0 == 0) goto L63
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L57
            goto L63
        L57:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r0 = r0.longValue()
            r2 = 1
            long r0 = r0 * r2
            return r0
        L63:
            return r2
        L64:
            java.lang.String r0 = "No dram_info property"
            c.d.a.b.h.b(r4, r0)
            return r2
    }

    private static long c(android.content.Context r8) {
            java.lang.String r0 = "activity"
            java.lang.Object r8 = r8.getSystemService(r0)
            android.app.ActivityManager r8 = (android.app.ActivityManager) r8
            android.app.ActivityManager$MemoryInfo r0 = new android.app.ActivityManager$MemoryInfo
            r0.<init>()
            r8.getMemoryInfo(r0)
            long r0 = r0.totalMem
            r2 = 1048576(0x100000, double:5.180654E-318)
            long r0 = r0 / r2
            r2 = 30720(0x7800, double:1.51777E-319)
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r2 = 0
            r4 = 1
            if (r8 <= 0) goto L24
            r2 = 32
            goto Lc4
        L24:
            r6 = 28672(0x7000, double:1.4166E-319)
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 <= 0) goto L2e
            r2 = 30
            goto Lc4
        L2e:
            r6 = 26624(0x6800, double:1.3154E-319)
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 <= 0) goto L38
            r2 = 28
            goto Lc4
        L38:
            r6 = 24576(0x6000, double:1.2142E-319)
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 <= 0) goto L42
            r2 = 26
            goto Lc4
        L42:
            r6 = 22528(0x5800, double:1.11303E-319)
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 <= 0) goto L4c
            r2 = 24
            goto Lc4
        L4c:
            r6 = 20480(0x5000, double:1.01185E-319)
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 <= 0) goto L56
            r2 = 22
            goto Lc4
        L56:
            r6 = 18432(0x4800, double:9.1066E-320)
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 <= 0) goto L60
            r2 = 20
            goto Lc4
        L60:
            r6 = 16384(0x4000, double:8.095E-320)
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 <= 0) goto L69
            r2 = 18
            goto Lc4
        L69:
            r6 = 14336(0x3800, double:7.083E-320)
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 <= 0) goto L72
            r2 = 16
            goto Lc4
        L72:
            r6 = 12288(0x3000, double:6.071E-320)
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 <= 0) goto L7b
            r2 = 14
            goto Lc4
        L7b:
            r6 = 10240(0x2800, double:5.059E-320)
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 <= 0) goto L84
            r2 = 12
            goto Lc4
        L84:
            r6 = 6144(0x1800, double:3.0355E-320)
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 <= 0) goto L8d
            r2 = 8
            goto Lc4
        L8d:
            r6 = 4096(0x1000, double:2.0237E-320)
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 <= 0) goto L96
            r2 = 6
            goto Lc4
        L96:
            r6 = 3072(0xc00, double:1.518E-320)
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 <= 0) goto L9f
            r2 = 4
            goto Lc4
        L9f:
            r6 = 2048(0x800, double:1.012E-320)
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 <= 0) goto La8
            r2 = 3
            goto Lc4
        La8:
            r6 = 1536(0x600, double:7.59E-321)
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 <= 0) goto Lb1
            r2 = 2
            goto Lc4
        Lb1:
            r6 = 1024(0x400, double:5.06E-321)
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 <= 0) goto Lb9
        Lb7:
            r2 = r4
            goto Lc4
        Lb9:
            r6 = 768(0x300, double:3.794E-321)
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 <= 0) goto Lc0
            goto Lb7
        Lc0:
            r4 = 512(0x200, double:2.53E-321)
            int r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
        Lc4:
            return r2
    }
}
