package a.a.a.i;

/* JADX INFO: loaded from: classes.dex */
public class c {
    public static int a(java.util.ArrayList<java.util.ArrayList<java.lang.Float>> r1) {
            int r0 = c(r1)
            int r1 = b(r1)
            float r1 = (float) r1
            float r0 = (float) r0
            float r1 = r1 / r0
            int r1 = java.lang.Math.round(r1)
            return r1
    }

    public static int b(java.util.ArrayList<java.util.ArrayList<java.lang.Float>> r6) {
            r0 = 0
            r1 = 0
            r2 = r0
        L3:
            int r3 = r6.size()
            if (r1 >= r3) goto L40
            java.lang.Object r3 = r6.get(r1)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            if (r3 == 0) goto L3d
            int r4 = r3.size()
            r5 = 2
            if (r4 <= r5) goto L3d
            java.lang.Object r4 = r3.get(r5)
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 <= 0) goto L3d
            java.lang.Object r4 = r3.get(r5)
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            r5 = 1
            java.lang.Object r3 = r3.get(r5)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            float r4 = r4 * r3
            float r2 = r2 + r4
        L3d:
            int r1 = r1 + 1
            goto L3
        L40:
            int r6 = java.lang.Math.round(r2)
            return r6
    }

    public static int c(java.util.ArrayList<java.util.ArrayList<java.lang.Float>> r5) {
            r0 = 0
            r1 = r0
        L2:
            int r2 = r5.size()
            if (r0 >= r2) goto L2b
            java.lang.Object r2 = r5.get(r0)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            if (r2 == 0) goto L28
            int r3 = r2.size()
            r4 = 2
            if (r3 <= r4) goto L28
            java.lang.Object r2 = r2.get(r4)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L28
            int r1 = r1 + 1
        L28:
            int r0 = r0 + 1
            goto L2
        L2b:
            return r1
    }

    public static int d(java.util.ArrayList<java.util.ArrayList<java.lang.Float>> r5) {
            r0 = 0
            r1 = r0
        L2:
            int r2 = r5.size()
            if (r0 >= r2) goto L2c
            java.lang.Object r2 = r5.get(r0)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            if (r2 == 0) goto L29
            int r3 = r2.size()
            r4 = 2
            if (r3 <= r4) goto L29
            java.lang.Object r2 = r2.get(r4)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r3 = 1097859072(0x41700000, float:15.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L29
            int r1 = r1 + 1
        L29:
            int r0 = r0 + 1
            goto L2
        L2c:
            return r1
    }

    public static int e(java.util.ArrayList<java.util.ArrayList<java.lang.Float>> r5) {
            r0 = 0
            r1 = r0
        L2:
            int r2 = r5.size()
            if (r0 >= r2) goto L2c
            java.lang.Object r2 = r5.get(r0)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            if (r2 == 0) goto L29
            int r3 = r2.size()
            r4 = 2
            if (r3 <= r4) goto L29
            java.lang.Object r2 = r2.get(r4)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r3 = 1101004800(0x41a00000, float:20.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L29
            int r1 = r1 + 1
        L29:
            int r0 = r0 + 1
            goto L2
        L2c:
            return r1
    }

    public static int f(java.util.ArrayList<java.util.ArrayList<java.lang.Float>> r1) {
            int r0 = g(r1)
            float r0 = (float) r0
            int r1 = c(r1)
            float r1 = (float) r1
            float r0 = r0 / r1
            int r1 = java.lang.Math.round(r0)
            return r1
    }

    public static int g(java.util.ArrayList<java.util.ArrayList<java.lang.Float>> r6) {
            r0 = 0
            r1 = 0
            r2 = r0
        L3:
            int r3 = r6.size()
            if (r1 >= r3) goto L34
            java.lang.Object r3 = r6.get(r1)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            if (r3 == 0) goto L31
            int r4 = r3.size()
            r5 = 2
            if (r4 <= r5) goto L31
            java.lang.Object r4 = r3.get(r5)
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 <= 0) goto L31
            java.lang.Object r3 = r3.get(r5)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            float r2 = r2 + r3
        L31:
            int r1 = r1 + 1
            goto L3
        L34:
            int r6 = java.lang.Math.round(r2)
            return r6
    }

    public static int h(java.util.ArrayList<java.util.ArrayList<java.lang.Float>> r9) {
            r0 = 37
            int[] r0 = new int[r0]
            r1 = 0
            r2 = r1
        L6:
            int r3 = r9.size()     // Catch: java.lang.Exception -> L63
            r4 = 1
            if (r2 >= r3) goto L4a
            java.lang.Object r3 = r9.get(r2)     // Catch: java.lang.Exception -> L63
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch: java.lang.Exception -> L63
            if (r3 == 0) goto L47
            int r5 = r3.size()     // Catch: java.lang.Exception -> L63
            if (r5 <= 0) goto L47
            java.lang.Object r5 = r3.get(r1)     // Catch: java.lang.Exception -> L63
            java.lang.Float r5 = (java.lang.Float) r5     // Catch: java.lang.Exception -> L63
            float r5 = r5.floatValue()     // Catch: java.lang.Exception -> L63
            double r5 = (double) r5     // Catch: java.lang.Exception -> L63
            r7 = 4645040803167600640(0x4076800000000000, double:360.0)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 >= 0) goto L47
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Exception -> L63
            java.lang.Float r3 = (java.lang.Float) r3     // Catch: java.lang.Exception -> L63
            float r3 = r3.floatValue()     // Catch: java.lang.Exception -> L63
            r5 = 1092616192(0x41200000, float:10.0)
            float r3 = r3 / r5
            double r5 = (double) r3     // Catch: java.lang.Exception -> L63
            double r5 = java.lang.Math.ceil(r5)     // Catch: java.lang.Exception -> L63
            int r3 = (int) r5     // Catch: java.lang.Exception -> L63
            r5 = r0[r3]     // Catch: java.lang.Exception -> L63
            int r5 = r5 + r4
            r0[r3] = r5     // Catch: java.lang.Exception -> L63
        L47:
            int r2 = r2 + 1
            goto L6
        L4a:
            r9 = 36
            if (r4 > r9) goto L57
            r9 = r0[r4]
            if (r9 <= 0) goto L54
            int r1 = r1 + 1
        L54:
            int r4 = r4 + 1
            goto L4a
        L57:
            float r9 = (float) r1
            r0 = 1108344832(0x42100000, float:36.0)
            float r9 = r9 / r0
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r9 = r9 * r0
            int r9 = java.lang.Math.round(r9)
            return r9
        L63:
            return r1
    }
}
