package c.a.c.a;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f1291a = null;

    static {
            r0 = 64
            byte[] r0 = new byte[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47} // fill-array
            c.a.c.a.e.f1291a = r0
            return
    }

    public static java.lang.String a(byte[] r11, java.lang.String r12) {
            int r0 = r11.length
            int r0 = r0 * 4
            int r0 = r0 / 3
            int r1 = r0 / 76
            int r1 = r1 + 3
            int r0 = r0 + r1
            byte[] r0 = new byte[r0]
            int r1 = r11.length
            int r2 = r11.length
            int r2 = r2 % 3
            int r1 = r1 - r2
            r2 = 0
            r3 = r2
            r4 = r3
        L14:
            r5 = 2
            if (r3 >= r1) goto L5b
            int r6 = r4 + 1
            byte[] r7 = c.a.c.a.e.f1291a
            r8 = r11[r3]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 >> r5
            r8 = r7[r8]
            r0[r4] = r8
            int r4 = r6 + 1
            r8 = r11[r3]
            r8 = r8 & 3
            int r8 = r8 << 4
            int r9 = r3 + 1
            r10 = r11[r9]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 >> 4
            r8 = r8 | r10
            r8 = r7[r8]
            r0[r6] = r8
            int r6 = r4 + 1
            r8 = r11[r9]
            r8 = r8 & 15
            int r5 = r8 << 2
            int r8 = r3 + 2
            r9 = r11[r8]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 >> 6
            r5 = r5 | r9
            r5 = r7[r5]
            r0[r4] = r5
            int r4 = r6 + 1
            r5 = r11[r8]
            r5 = r5 & 63
            r5 = r7[r5]
            r0[r6] = r5
            int r3 = r3 + 3
            goto L14
        L5b:
            int r3 = r11.length
            int r3 = r3 % 3
            r6 = 61
            r7 = 1
            if (r3 == r7) goto L97
            if (r3 == r5) goto L66
            goto Lb9
        L66:
            int r3 = r4 + 1
            byte[] r8 = c.a.c.a.e.f1291a
            r9 = r11[r1]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 >> r5
            r9 = r8[r9]
            r0[r4] = r9
            int r4 = r3 + 1
            r9 = r11[r1]
            r9 = r9 & 3
            int r9 = r9 << 4
            int r1 = r1 + r7
            r7 = r11[r1]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 >> 4
            r7 = r7 | r9
            r7 = r8[r7]
            r0[r3] = r7
            int r3 = r4 + 1
            r11 = r11[r1]
            r11 = r11 & 15
            int r11 = r11 << r5
            r11 = r8[r11]
            r0[r4] = r11
            int r4 = r3 + 1
            r0[r3] = r6
            goto Lb9
        L97:
            int r3 = r4 + 1
            byte[] r7 = c.a.c.a.e.f1291a
            r8 = r11[r1]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r5 = r8 >> 2
            r5 = r7[r5]
            r0[r4] = r5
            int r4 = r3 + 1
            r11 = r11[r1]
            r11 = r11 & 3
            int r11 = r11 << 4
            r11 = r7[r11]
            r0[r3] = r11
            int r11 = r4 + 1
            r0[r4] = r6
            int r4 = r11 + 1
            r0[r11] = r6
        Lb9:
            java.lang.String r11 = new java.lang.String
            r11.<init>(r0, r2, r4, r12)
            return r11
    }

    public static byte[] a(byte[] r1) {
            int r0 = r1.length
            byte[] r1 = a(r1, r0)
            return r1
    }

    public static byte[] a(byte[] r16, int r17) {
            int r0 = r17 / 4
            r1 = 3
            int r0 = r0 * r1
            r2 = 0
            if (r0 != 0) goto La
            byte[] r0 = new byte[r2]
            return r0
        La:
            byte[] r0 = new byte[r0]
            r3 = r17
            r4 = r2
        Lf:
            int r5 = r3 + (-1)
            r5 = r16[r5]
            r6 = 10
            if (r5 == r6) goto Lbd
            r7 = 13
            if (r5 == r7) goto Lbd
            r8 = 32
            if (r5 == r8) goto Lbd
            r9 = 9
            if (r5 != r9) goto L25
            goto Lbd
        L25:
            r10 = 61
            if (r5 != r10) goto L2d
            int r4 = r4 + 1
            goto Lbd
        L2d:
            r5 = r2
            r10 = r5
            r11 = r10
            r12 = r11
        L31:
            r13 = 65280(0xff00, float:9.1477E-41)
            r14 = 16711680(0xff0000, float:2.3418052E-38)
            if (r5 >= r3) goto L9b
            r15 = r16[r5]
            if (r15 == r6) goto L96
            if (r15 == r7) goto L96
            if (r15 == r8) goto L96
            if (r15 != r9) goto L43
            goto L96
        L43:
            r6 = 65
            if (r15 < r6) goto L4e
            r6 = 90
            if (r15 > r6) goto L4e
            int r15 = r15 + (-65)
            goto L71
        L4e:
            r6 = 97
            if (r15 < r6) goto L59
            r6 = 122(0x7a, float:1.71E-43)
            if (r15 > r6) goto L59
            int r15 = r15 + (-71)
            goto L71
        L59:
            r6 = 48
            if (r15 < r6) goto L64
            r6 = 57
            if (r15 > r6) goto L64
            int r15 = r15 + 4
            goto L71
        L64:
            r6 = 43
            if (r15 != r6) goto L6b
            r15 = 62
            goto L71
        L6b:
            r6 = 47
            if (r15 != r6) goto L94
            r15 = 63
        L71:
            int r6 = r10 << 6
            byte r10 = (byte) r15
            r10 = r10 | r6
            int r6 = r12 % 4
            if (r6 != r1) goto L91
            int r6 = r11 + 1
            r14 = r14 & r10
            int r14 = r14 >> 16
            byte r14 = (byte) r14
            r0[r11] = r14
            int r11 = r6 + 1
            r13 = r13 & r10
            int r13 = r13 >> 8
            byte r13 = (byte) r13
            r0[r6] = r13
            int r6 = r11 + 1
            r13 = r10 & 255(0xff, float:3.57E-43)
            byte r13 = (byte) r13
            r0[r11] = r13
            r11 = r6
        L91:
            int r12 = r12 + 1
            goto L96
        L94:
            r0 = 0
            return r0
        L96:
            int r5 = r5 + 1
            r6 = 10
            goto L31
        L9b:
            if (r4 <= 0) goto Lb7
            int r1 = r4 * 6
            int r1 = r10 << r1
            int r3 = r11 + 1
            r5 = r1 & r14
            int r5 = r5 >> 16
            byte r5 = (byte) r5
            r0[r11] = r5
            r5 = 1
            if (r4 != r5) goto Lb6
            int r11 = r3 + 1
            r1 = r1 & r13
            int r1 = r1 >> 8
            byte r1 = (byte) r1
            r0[r3] = r1
            goto Lb7
        Lb6:
            r11 = r3
        Lb7:
            byte[] r1 = new byte[r11]
            java.lang.System.arraycopy(r0, r2, r1, r2, r11)
            return r1
        Lbd:
            int r3 = r3 + (-1)
            goto Lf
    }
}
