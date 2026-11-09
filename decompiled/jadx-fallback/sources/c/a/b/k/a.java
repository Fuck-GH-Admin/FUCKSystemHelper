package c.a.b.k;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f1272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f1273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1274c;

    public a(java.lang.String r1, boolean r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.f1272a = r1
            r0.f1273b = r2
            r0.f1274c = r3
            return
    }

    private static int a(int r3) {
            r0 = 1
            if (r3 == r0) goto L16
            r1 = 2
            r2 = 4
            if (r3 == r1) goto L15
            r1 = 3
            if (r3 == r1) goto L14
            if (r3 == r2) goto L13
            r0 = 5
            if (r3 == r0) goto L11
            r3 = -1
            return r3
        L11:
            r3 = 0
            return r3
        L13:
            return r0
        L14:
            return r1
        L15:
            return r2
        L16:
            r3 = 6
            return r3
    }

    public java.lang.String a(byte[] r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>()
            r3 = 0
            r4 = r3
        Lb:
            int r5 = r1.length
            r6 = 4
            int r5 = r5 + r6
            r7 = 5
            int r5 = r5 / r7
            if (r4 >= r5) goto Lc1
            short[] r5 = new short[r7]
            r8 = 8
            int[] r9 = new int[r8]
            r10 = r3
            r11 = r7
        L1a:
            if (r10 >= r7) goto L31
            int r12 = r4 * 5
            int r12 = r12 + r10
            int r13 = r1.length
            if (r12 >= r13) goto L2a
            r12 = r1[r12]
            r12 = r12 & 255(0xff, float:3.57E-43)
            short r12 = (short) r12
            r5[r10] = r12
            goto L2e
        L2a:
            r5[r10] = r3
            int r11 = r11 + (-1)
        L2e:
            int r10 = r10 + 1
            goto L1a
        L31:
            int r10 = a(r11)
            short r11 = r5[r3]
            r12 = 3
            int r11 = r11 >> r12
            r11 = r11 & 31
            byte r11 = (byte) r11
            r9[r3] = r11
            short r11 = r5[r3]
            r13 = 7
            r11 = r11 & r13
            r14 = 2
            int r11 = r11 << r14
            r15 = 1
            short r16 = r5[r15]
            r17 = 6
            int r16 = r16 >> 6
            r16 = r16 & 3
            r11 = r11 | r16
            byte r11 = (byte) r11
            r9[r15] = r11
            short r11 = r5[r15]
            int r11 = r11 >> r15
            r11 = r11 & 31
            byte r11 = (byte) r11
            r9[r14] = r11
            short r11 = r5[r15]
            r11 = r11 & r15
            int r11 = r11 << r6
            short r16 = r5[r14]
            int r16 = r16 >> 4
            r16 = r16 & 15
            r11 = r11 | r16
            byte r11 = (byte) r11
            r9[r12] = r11
            short r11 = r5[r14]
            r11 = r11 & 15
            int r11 = r11 << r15
            short r16 = r5[r12]
            int r16 = r16 >> 7
            r15 = r16 & 1
            r11 = r11 | r15
            byte r11 = (byte) r11
            r9[r6] = r11
            short r11 = r5[r12]
            int r11 = r11 >> r14
            r11 = r11 & 31
            byte r11 = (byte) r11
            r9[r7] = r11
            short r11 = r5[r12]
            r11 = r11 & r12
            int r11 = r11 << r12
            short r12 = r5[r6]
            int r7 = r12 >> 5
            r7 = r7 & r13
            r7 = r7 | r11
            byte r7 = (byte) r7
            r9[r17] = r7
            short r5 = r5[r6]
            r5 = r5 & 31
            byte r5 = (byte) r5
            r9[r13] = r5
            r5 = r3
        L95:
            int r6 = 8 - r10
            if (r5 >= r6) goto Laf
            java.lang.String r6 = r0.f1272a
            r7 = r9[r5]
            char r6 = r6.charAt(r7)
            boolean r7 = r0.f1274c
            if (r7 == 0) goto La9
            char r6 = java.lang.Character.toLowerCase(r6)
        La9:
            r2.write(r6)
            int r5 = r5 + 1
            goto L95
        Laf:
            boolean r5 = r0.f1273b
            if (r5 == 0) goto Lbd
        Lb3:
            if (r6 >= r8) goto Lbd
            r5 = 61
            r2.write(r5)
            int r6 = r6 + 1
            goto Lb3
        Lbd:
            int r4 = r4 + 1
            goto Lb
        Lc1:
            java.lang.String r0 = new java.lang.String
            byte[] r1 = r2.toByteArray()
            r0.<init>(r1)
            return r0
    }
}
