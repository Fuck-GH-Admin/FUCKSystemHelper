package c.a.b.e.a;

/* JADX INFO: loaded from: classes.dex */
class d extends c.a.b.e.a.f {
    protected byte[] d;
    private byte[] e;
    private byte[] f;

    d(c.a.b.e.a.b r2) {
            r1 = this;
            r1.<init>(r2)
            r2 = 0
            r1.f = r2
            int r2 = r1.f1243b
            byte[] r0 = new byte[r2]
            r1.e = r0
            byte[] r2 = new byte[r2]
            r1.d = r2
            return
    }

    @Override // c.a.b.e.a.f
    void a() {
            r3 = this;
            byte[] r0 = r3.f1244c
            byte[] r1 = r3.d
            int r3 = r3.f1243b
            r2 = 0
            java.lang.System.arraycopy(r0, r2, r1, r2, r3)
            return
    }

    @Override // c.a.b.e.a.f
    void a(boolean r3, java.lang.String r4, byte[] r5, byte[] r6) {
            r2 = this;
            if (r5 == 0) goto L14
            if (r6 == 0) goto L14
            int r0 = r6.length
            int r1 = r2.f1243b
            if (r0 != r1) goto L14
            r2.f1244c = r6
            r2.a()
            c.a.b.e.a.b r2 = r2.f1242a
            r2.a(r3, r4, r5)
            return
        L14:
            java.security.InvalidKeyException r2 = new java.security.InvalidKeyException
            java.lang.String r3 = "Internal error"
            r2.<init>(r3)
            throw r2
    }

    @Override // c.a.b.e.a.f
    void a(byte[] r6, int r7, int r8, byte[] r9, int r10) {
            r5 = this;
            int r8 = r8 + r7
        L1:
            if (r7 >= r8) goto L2d
            r0 = 0
            r1 = r0
        L5:
            int r2 = r5.f1243b
            if (r1 >= r2) goto L1a
            byte[] r2 = r5.e
            int r3 = r1 + r7
            r3 = r6[r3]
            byte[] r4 = r5.d
            r4 = r4[r1]
            r3 = r3 ^ r4
            byte r3 = (byte) r3
            r2[r1] = r3
            int r1 = r1 + 1
            goto L5
        L1a:
            c.a.b.e.a.b r1 = r5.f1242a
            byte[] r2 = r5.e
            r1.a(r2, r0, r9, r10)
            byte[] r1 = r5.d
            int r2 = r5.f1243b
            java.lang.System.arraycopy(r9, r10, r1, r0, r2)
            int r0 = r5.f1243b
            int r7 = r7 + r0
            int r10 = r10 + r0
            goto L1
        L2d:
            return
    }

    @Override // c.a.b.e.a.f
    void b() {
            r3 = this;
            byte[] r0 = r3.f
            if (r0 != 0) goto La
            int r0 = r3.f1243b
            byte[] r0 = new byte[r0]
            r3.f = r0
        La:
            byte[] r0 = r3.d
            byte[] r1 = r3.f
            int r3 = r3.f1243b
            r2 = 0
            java.lang.System.arraycopy(r0, r2, r1, r2, r3)
            return
    }

    @Override // c.a.b.e.a.f
    void b(byte[] r7, int r8, int r9, byte[] r10, int r11) {
            r6 = this;
            int r9 = r9 + r8
            if (r7 != r10) goto L12
            if (r8 < r11) goto L12
            int r0 = r8 - r11
            int r1 = r6.f1243b
            if (r0 >= r1) goto L12
            java.lang.Object r0 = r7.clone()
            byte[] r0 = (byte[]) r0
            goto L13
        L12:
            r0 = 0
        L13:
            if (r8 >= r9) goto L43
            c.a.b.e.a.b r1 = r6.f1242a
            byte[] r2 = r6.e
            r3 = 0
            r1.b(r7, r8, r2, r3)
            r1 = r3
        L1e:
            int r2 = r6.f1243b
            if (r1 >= r2) goto L33
            int r2 = r1 + r11
            byte[] r4 = r6.e
            r4 = r4[r1]
            byte[] r5 = r6.d
            r5 = r5[r1]
            r4 = r4 ^ r5
            byte r4 = (byte) r4
            r10[r2] = r4
            int r1 = r1 + 1
            goto L1e
        L33:
            byte[] r1 = r6.d
            if (r0 != 0) goto L3b
            java.lang.System.arraycopy(r7, r8, r1, r3, r2)
            goto L3e
        L3b:
            java.lang.System.arraycopy(r0, r8, r1, r3, r2)
        L3e:
            int r1 = r6.f1243b
            int r8 = r8 + r1
            int r11 = r11 + r1
            goto L13
        L43:
            return
    }

    @Override // c.a.b.e.a.f
    void c() {
            r3 = this;
            byte[] r0 = r3.f
            byte[] r1 = r3.d
            int r3 = r3.f1243b
            r2 = 0
            java.lang.System.arraycopy(r0, r2, r1, r2, r3)
            return
    }
}
