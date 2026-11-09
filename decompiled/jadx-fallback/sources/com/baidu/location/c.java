package com.baidu.location;

/* JADX INFO: loaded from: classes.dex */
public final class c implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.baidu.location.c> CREATOR = null;
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String C;
    public double D;
    public boolean E;
    public int F;
    public int G;
    public java.lang.String H;
    public int I;
    public java.lang.String J;
    public int K;
    public int L;
    public int M;
    public int N;
    public java.lang.String O;
    public java.lang.String P;
    public java.lang.String Q;
    public int R;
    public java.util.List<com.baidu.location.j> S;
    public java.lang.String T;
    public java.lang.String U;
    public java.lang.String V;
    public android.os.Bundle W;
    public int X;
    public int Y;
    public long Z;
    public java.lang.String a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1355b;
    public java.lang.String b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.String f1356c;
    public double c0;
    public double d;
    public double d0;
    public double e;
    public boolean e0;
    public boolean f;
    public com.baidu.location.k f0;
    public double g;
    public float g0;
    public boolean h;
    public double h0;
    public float i;
    public int i0;
    public boolean j;
    public int j0;
    public float k;
    public com.baidu.location.c k0;
    public java.lang.String l;
    public android.os.Bundle l0;
    public float m;
    public java.lang.String m0;
    public int n;
    public long n0;
    public float o;
    public boolean p;
    public int q;
    public float r;
    public java.lang.String s;
    public boolean t;
    public java.lang.String u;
    public java.lang.String v;
    public java.lang.String w;
    public java.lang.String x;
    public boolean y;
    public com.baidu.location.a z;

    public static class a implements android.os.Parcelable.Creator<com.baidu.location.c> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.baidu.location.c createFromParcel(android.os.Parcel r2) {
                r1 = this;
                com.baidu.location.c r1 = new com.baidu.location.c
                r0 = 0
                r1.<init>(r2, r0)
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.baidu.location.c createFromParcel(android.os.Parcel r1) {
                r0 = this;
                com.baidu.location.c r0 = r0.createFromParcel(r1)
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.baidu.location.c[] newArray(int r1) {
                r0 = this;
                com.baidu.location.c[] r0 = new com.baidu.location.c[r1]
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.baidu.location.c[] newArray(int r1) {
                r0 = this;
                com.baidu.location.c[] r0 = r0.newArray(r1)
                return r0
        }
    }

    static {
            com.baidu.location.c$a r0 = new com.baidu.location.c$a
            r0.<init>()
            com.baidu.location.c.CREATOR = r0
            return
    }

    public c() {
            r8 = this;
            r8.<init>()
            r0 = 0
            r8.f1355b = r0
            r1 = 0
            r8.f1356c = r1
            r2 = 1
            r8.d = r2
            r8.e = r2
            r8.f = r0
            r8.g = r2
            r8.h = r0
            r4 = 0
            r8.i = r4
            r8.j = r0
            r8.k = r4
            r8.m = r4
            r5 = -1
            r8.n = r5
            r8.o = r4
            r8.p = r0
            r8.q = r5
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r8.r = r4
            r8.s = r1
            r8.t = r0
            r8.u = r1
            r8.v = r1
            r8.w = r1
            r8.x = r1
            r8.y = r0
            com.baidu.location.a$a r6 = new com.baidu.location.a$a
            r6.<init>()
            com.baidu.location.a r6 = r6.a()
            r8.z = r6
            r8.A = r1
            r8.B = r1
            r8.C = r1
            r8.E = r0
            r8.F = r0
            r6 = 1
            r8.G = r6
            r8.H = r1
            java.lang.String r6 = ""
            r8.J = r6
            r8.K = r5
            r8.L = r0
            r6 = 2
            r8.M = r6
            r8.N = r0
            r8.O = r1
            r8.P = r1
            r8.Q = r1
            r8.R = r5
            r8.S = r1
            r8.T = r1
            r8.U = r1
            r8.V = r1
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r8.W = r6
            r8.X = r0
            r8.Y = r0
            r6 = 0
            r8.Z = r6
            r8.a0 = r1
            r8.b0 = r1
            r8.c0 = r2
            r8.d0 = r2
            r8.e0 = r0
            r8.f0 = r1
            r8.g0 = r4
            r2 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r8.h0 = r2
            r8.i0 = r0
            r8.j0 = r5
            r8.l0 = r1
            r8.m0 = r1
            r0 = -1
            r8.n0 = r0
            return
    }

    public c(android.os.Parcel r17) {
            r16 = this;
            r1 = r16
            r2 = r17
            r16.<init>()
            r3 = 0
            r1.f1355b = r3
            r4 = 0
            r1.f1356c = r4
            r5 = 1
            r1.d = r5
            r1.e = r5
            r1.f = r3
            r1.g = r5
            r1.h = r3
            r0 = 0
            r1.i = r0
            r1.j = r3
            r1.k = r0
            r1.m = r0
            r7 = -1
            r1.n = r7
            r1.o = r0
            r1.p = r3
            r1.q = r7
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.r = r0
            r1.s = r4
            r1.t = r3
            r1.u = r4
            r1.v = r4
            r1.w = r4
            r1.x = r4
            r1.y = r3
            com.baidu.location.a$a r8 = new com.baidu.location.a$a
            r8.<init>()
            com.baidu.location.a r8 = r8.a()
            r1.z = r8
            r1.A = r4
            r1.B = r4
            r1.C = r4
            r1.E = r3
            r1.F = r3
            r8 = 1
            r1.G = r8
            r1.H = r4
            java.lang.String r9 = ""
            r1.J = r9
            r1.K = r7
            r1.L = r3
            r9 = 2
            r1.M = r9
            r1.N = r3
            r1.O = r4
            r1.P = r4
            r1.Q = r4
            r1.R = r7
            r1.S = r4
            r1.T = r4
            r1.U = r4
            r1.V = r4
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>()
            r1.W = r10
            r1.X = r3
            r1.Y = r3
            r10 = 0
            r1.Z = r10
            r1.a0 = r4
            r1.b0 = r4
            r1.c0 = r5
            r1.d0 = r5
            r1.e0 = r3
            r1.f0 = r4
            r1.g0 = r0
            r5 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r1.h0 = r5
            r1.i0 = r3
            r1.j0 = r7
            r1.l0 = r4
            r1.m0 = r4
            r5 = -1
            r1.n0 = r5
            int r0 = r17.readInt()
            r1.f1355b = r0
            java.lang.String r0 = r17.readString()
            r1.f1356c = r0
            long r5 = r17.readLong()
            r1.n0 = r5
            double r5 = r17.readDouble()
            r1.d = r5
            double r5 = r17.readDouble()
            r1.e = r5
            double r5 = r17.readDouble()
            r1.g = r5
            float r0 = r17.readFloat()
            r1.i = r0
            float r0 = r17.readFloat()
            r1.k = r0
            java.lang.String r0 = r17.readString()
            r1.l = r0
            float r0 = r17.readFloat()
            r1.m = r0
            int r0 = r17.readInt()
            r1.n = r0
            float r0 = r17.readFloat()
            r1.o = r0
            int r0 = r17.readInt()
            r1.q = r0
            float r0 = r17.readFloat()
            r1.r = r0
            java.lang.String r0 = r17.readString()
            r1.A = r0
            int r0 = r17.readInt()
            r1.F = r0
            java.lang.String r0 = r17.readString()
            r1.B = r0
            java.lang.String r0 = r17.readString()
            r1.C = r0
            double r5 = r17.readDouble()
            r1.D = r5
            java.lang.String r0 = r17.readString()
            r1.H = r0
            java.lang.String r0 = r17.readString()
            java.lang.String r5 = r17.readString()
            java.lang.String r6 = r17.readString()
            java.lang.String r7 = r17.readString()
            java.lang.String r10 = r17.readString()
            java.lang.String r11 = r17.readString()
            r17.readString()
            java.lang.String r12 = r17.readString()
            java.lang.String r13 = r17.readString()
            java.lang.String r14 = r17.readString()
            java.lang.String r15 = r17.readString()
            com.baidu.location.a$a r9 = new com.baidu.location.a$a
            r9.<init>()
            r9.d(r12)
            r9.e(r13)
            r9.g(r0)
            r9.b(r5)
            r9.c(r11)
            r9.f(r6)
            r9.h(r7)
            r9.i(r10)
            r9.a(r14)
            r9.j(r15)
            com.baidu.location.a r0 = r9.a()
            r1.z = r0
            r0 = 8
            boolean[] r5 = new boolean[r0]
            int r0 = r17.readInt()
            r1.I = r0
            java.lang.String r0 = r17.readString()
            r1.J = r0
            java.lang.String r0 = r17.readString()
            r1.v = r0
            java.lang.String r0 = r17.readString()
            r1.w = r0
            java.lang.String r0 = r17.readString()
            r1.x = r0
            int r0 = r17.readInt()
            r1.G = r0
            java.lang.String r0 = r17.readString()
            r1.T = r0
            int r0 = r17.readInt()
            r1.K = r0
            int r0 = r17.readInt()
            r1.L = r0
            int r0 = r17.readInt()
            r1.M = r0
            int r0 = r17.readInt()
            r1.N = r0
            java.lang.String r0 = r17.readString()
            r1.O = r0
            java.lang.String r0 = r17.readString()
            r1.P = r0
            java.lang.String r0 = r17.readString()
            r1.Q = r0
            int r0 = r17.readInt()
            r1.R = r0
            int r0 = r17.readInt()
            r1.X = r0
            java.lang.String r0 = r17.readString()
            r1.U = r0
            int r0 = r17.readInt()
            r1.Y = r0
            java.lang.String r0 = r17.readString()
            r1.V = r0
            java.lang.String r0 = r17.readString()
            r1.a0 = r0
            java.lang.String r0 = r17.readString()
            r1.b0 = r0
            long r6 = r17.readLong()
            r1.Z = r6
            double r6 = r17.readDouble()
            r1.c0 = r6
            double r6 = r17.readDouble()
            r1.d0 = r6
            float r0 = r17.readFloat()
            r1.g0 = r0
            double r6 = r17.readDouble()
            r1.h0 = r6
            int r0 = r17.readInt()
            r1.i0 = r0
            int r0 = r17.readInt()
            r1.j0 = r0
            java.lang.String r0 = r17.readString()
            r1.s = r0
            java.lang.String r0 = r17.readString()
            r1.m0 = r0
            java.lang.Class<com.baidu.location.c> r0 = com.baidu.location.c.class
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Exception -> L234
            android.os.Parcelable r0 = r2.readParcelable(r0)     // Catch: java.lang.Exception -> L234
            com.baidu.location.c r0 = (com.baidu.location.c) r0     // Catch: java.lang.Exception -> L234
            r1.k0 = r0     // Catch: java.lang.Exception -> L234
            goto L23a
        L234:
            r0 = move-exception
            r1.k0 = r4
            r0.printStackTrace()
        L23a:
            r2.readBooleanArray(r5)     // Catch: java.lang.Exception -> L263
            boolean r0 = r5[r3]     // Catch: java.lang.Exception -> L263
            r1.f = r0     // Catch: java.lang.Exception -> L263
            boolean r0 = r5[r8]     // Catch: java.lang.Exception -> L263
            r1.h = r0     // Catch: java.lang.Exception -> L263
            r3 = 2
            boolean r0 = r5[r3]     // Catch: java.lang.Exception -> L263
            r1.j = r0     // Catch: java.lang.Exception -> L263
            r0 = 3
            boolean r0 = r5[r0]     // Catch: java.lang.Exception -> L263
            r1.p = r0     // Catch: java.lang.Exception -> L263
            r0 = 4
            boolean r0 = r5[r0]     // Catch: java.lang.Exception -> L263
            r1.t = r0     // Catch: java.lang.Exception -> L263
            r0 = 5
            boolean r0 = r5[r0]     // Catch: java.lang.Exception -> L263
            r1.y = r0     // Catch: java.lang.Exception -> L263
            r0 = 6
            boolean r0 = r5[r0]     // Catch: java.lang.Exception -> L263
            r1.E = r0     // Catch: java.lang.Exception -> L263
            r0 = 7
            boolean r0 = r5[r0]     // Catch: java.lang.Exception -> L263
            r1.e0 = r0     // Catch: java.lang.Exception -> L263
        L263:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.Class<com.baidu.location.j> r0 = com.baidu.location.j.class
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Exception -> L272
            r2.readList(r3, r0)     // Catch: java.lang.Exception -> L272
            goto L276
        L272:
            r0 = move-exception
            r0.printStackTrace()
        L276:
            int r0 = r3.size()
            if (r0 != 0) goto L27f
            r1.S = r4
            goto L281
        L27f:
            r1.S = r3
        L281:
            android.os.Bundle r0 = r17.readBundle()     // Catch: java.lang.Exception -> L288
            r1.W = r0     // Catch: java.lang.Exception -> L288
            goto L293
        L288:
            r0 = move-exception
            r0.printStackTrace()
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.W = r0
        L293:
            android.os.Bundle r0 = r17.readBundle()     // Catch: java.lang.Exception -> L29a
            r1.l0 = r0     // Catch: java.lang.Exception -> L29a
            goto L2a5
        L29a:
            r0 = move-exception
            r0.printStackTrace()
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.l0 = r0
        L2a5:
            java.lang.Class<com.baidu.location.k> r0 = com.baidu.location.k.class
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Exception -> L2b4
            android.os.Parcelable r0 = r2.readParcelable(r0)     // Catch: java.lang.Exception -> L2b4
            com.baidu.location.k r0 = (com.baidu.location.k) r0     // Catch: java.lang.Exception -> L2b4
            r1.f0 = r0     // Catch: java.lang.Exception -> L2b4
            goto L2ba
        L2b4:
            r0 = move-exception
            r1.f0 = r4
            r0.printStackTrace()
        L2ba:
            return
    }

    public /* synthetic */ c(android.os.Parcel r1, com.baidu.location.c.a r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public c(com.baidu.location.c r12) {
            r11 = this;
            r11.<init>()
            r0 = 0
            r11.f1355b = r0
            r1 = 0
            r11.f1356c = r1
            r2 = 1
            r11.d = r2
            r11.e = r2
            r11.f = r0
            r11.g = r2
            r11.h = r0
            r4 = 0
            r11.i = r4
            r11.j = r0
            r11.k = r4
            r11.m = r4
            r5 = -1
            r11.n = r5
            r11.o = r4
            r11.p = r0
            r11.q = r5
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r11.r = r4
            r11.s = r1
            r11.t = r0
            r11.u = r1
            r11.v = r1
            r11.w = r1
            r11.x = r1
            r11.y = r0
            com.baidu.location.a$a r6 = new com.baidu.location.a$a
            r6.<init>()
            com.baidu.location.a r6 = r6.a()
            r11.z = r6
            r11.A = r1
            r11.B = r1
            r11.C = r1
            r11.E = r0
            r11.F = r0
            r6 = 1
            r11.G = r6
            r11.H = r1
            java.lang.String r6 = ""
            r11.J = r6
            r11.K = r5
            r11.L = r0
            r6 = 2
            r11.M = r6
            r11.N = r0
            r11.O = r1
            r11.P = r1
            r11.Q = r1
            r11.R = r5
            r11.S = r1
            r11.T = r1
            r11.U = r1
            r11.V = r1
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r11.W = r6
            r11.X = r0
            r11.Y = r0
            r6 = 0
            r11.Z = r6
            r11.a0 = r1
            r11.b0 = r1
            r11.c0 = r2
            r11.d0 = r2
            r11.e0 = r0
            r11.f0 = r1
            r11.g0 = r4
            r2 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r11.h0 = r2
            r11.i0 = r0
            r11.j0 = r5
            r11.l0 = r1
            r11.m0 = r1
            r2 = -1
            r11.n0 = r2
            int r2 = r12.f1355b
            r11.f1355b = r2
            java.lang.String r2 = r12.f1356c
            r11.f1356c = r2
            long r2 = r12.n0
            r11.n0 = r2
            double r2 = r12.d
            r11.d = r2
            double r2 = r12.e
            r11.e = r2
            boolean r2 = r12.f
            r11.f = r2
            double r2 = r12.g
            r11.g = r2
            boolean r2 = r12.h
            r11.h = r2
            float r2 = r12.i
            r11.i = r2
            boolean r2 = r12.j
            r11.j = r2
            float r2 = r12.k
            r11.k = r2
            java.lang.String r2 = r12.l
            r11.l = r2
            float r2 = r12.m
            r11.m = r2
            int r2 = r12.n
            r11.n = r2
            float r2 = r12.o
            r11.o = r2
            boolean r2 = r12.p
            r11.p = r2
            int r2 = r12.q
            r11.q = r2
            float r2 = r12.r
            r11.r = r2
            java.lang.String r2 = r12.s
            r11.s = r2
            boolean r2 = r12.t
            r11.t = r2
            java.lang.String r2 = r12.u
            r11.u = r2
            boolean r2 = r12.y
            r11.y = r2
            com.baidu.location.a$a r2 = new com.baidu.location.a$a
            r2.<init>()
            com.baidu.location.a r3 = r12.z
            java.lang.String r3 = r3.f1349a
            r2.d(r3)
            com.baidu.location.a r3 = r12.z
            java.lang.String r3 = r3.f1350b
            r2.e(r3)
            com.baidu.location.a r3 = r12.z
            java.lang.String r3 = r3.f1351c
            r2.g(r3)
            com.baidu.location.a r3 = r12.z
            java.lang.String r3 = r3.d
            r2.b(r3)
            com.baidu.location.a r3 = r12.z
            java.lang.String r3 = r3.e
            r2.c(r3)
            com.baidu.location.a r3 = r12.z
            java.lang.String r3 = r3.f
            r2.f(r3)
            com.baidu.location.a r3 = r12.z
            java.lang.String r3 = r3.g
            r2.h(r3)
            com.baidu.location.a r3 = r12.z
            java.lang.String r3 = r3.h
            r2.i(r3)
            com.baidu.location.a r3 = r12.z
            java.lang.String r3 = r3.j
            r2.a(r3)
            com.baidu.location.a r3 = r12.z
            java.lang.String r3 = r3.k
            r2.j(r3)
            com.baidu.location.a r2 = r2.a()
            r11.z = r2
            java.lang.String r2 = r12.A
            r11.A = r2
            java.lang.String r2 = r12.B
            r11.B = r2
            java.lang.String r2 = r12.C
            r11.C = r2
            double r2 = r12.D
            r11.D = r2
            int r2 = r12.G
            r11.G = r2
            int r2 = r12.F
            r11.F = r2
            boolean r2 = r12.E
            r11.E = r2
            java.lang.String r2 = r12.H
            r11.H = r2
            int r2 = r12.I
            r11.I = r2
            java.lang.String r2 = r12.J
            r11.J = r2
            java.lang.String r2 = r12.v
            r11.v = r2
            java.lang.String r2 = r12.w
            r11.w = r2
            java.lang.String r2 = r12.x
            r11.x = r2
            int r2 = r12.K
            r11.K = r2
            int r2 = r12.L
            r11.L = r2
            int r2 = r12.L
            r11.M = r2
            int r2 = r12.N
            r11.N = r2
            java.lang.String r2 = r12.O
            r11.O = r2
            java.lang.String r2 = r12.P
            r11.P = r2
            java.lang.String r2 = r12.Q
            r11.Q = r2
            int r2 = r12.R
            r11.R = r2
            int r2 = r12.X
            r11.X = r2
            java.lang.String r2 = r12.V
            r11.V = r2
            java.lang.String r2 = r12.a0
            r11.a0 = r2
            java.lang.String r2 = r12.b0
            r11.b0 = r2
            double r2 = r12.c0
            r11.c0 = r2
            double r2 = r12.d0
            r11.d0 = r2
            long r2 = r12.Z
            r11.Z = r2
            double r2 = r12.h0
            r11.h0 = r2
            int r2 = r12.i0
            r11.i0 = r2
            int r2 = r12.j0
            r11.j0 = r2
            com.baidu.location.c r2 = r12.k0
            r11.k0 = r2
            java.lang.String r2 = r12.U
            r11.U = r2
            java.util.List<com.baidu.location.j> r2 = r12.S
            if (r2 != 0) goto L1d1
        L1ce:
            r11.S = r1
            goto L206
        L1d1:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L1d6:
            java.util.List<com.baidu.location.j> r2 = r12.S
            int r2 = r2.size()
            if (r0 >= r2) goto L1ce
            java.util.List<com.baidu.location.j> r2 = r12.S
            java.lang.Object r2 = r2.get(r0)
            com.baidu.location.j r2 = (com.baidu.location.j) r2
            com.baidu.location.j r10 = new com.baidu.location.j
            java.lang.String r4 = r2.b()
            java.lang.String r5 = r2.c()
            double r6 = r2.d()
            java.lang.String r8 = r2.e()
            java.lang.String r9 = r2.a()
            r3 = r10
            r3.<init>(r4, r5, r6, r8, r9)
            r1.add(r10)
            int r0 = r0 + 1
            goto L1d6
        L206:
            java.lang.String r0 = r12.T
            r11.T = r0
            android.os.Bundle r0 = r12.W
            r11.W = r0
            int r0 = r12.Y
            r11.Y = r0
            boolean r0 = r12.e0
            r11.e0 = r0
            com.baidu.location.k r0 = r12.f0
            r11.f0 = r0
            float r0 = r12.g0
            r11.g0 = r0
            android.os.Bundle r0 = r12.l0
            r11.l0 = r0
            java.lang.String r12 = r12.m0
            r11.m0 = r12
            return
    }

    public c(java.lang.String r26) {
            r25 = this;
            r1 = r25
            r2 = r26
            java.lang.String r3 = "traffic_skip_prop"
            java.lang.String r4 = "is_station"
            java.lang.String r5 = "traffic_prop"
            java.lang.String r6 = "traffic"
            r25.<init>()
            r7 = 0
            r1.f1355b = r7
            r8 = 0
            r1.f1356c = r8
            r9 = 1
            r1.d = r9
            r1.e = r9
            r1.f = r7
            r1.g = r9
            r1.h = r7
            r11 = 0
            r1.i = r11
            r1.j = r7
            r1.k = r11
            r1.m = r11
            r12 = -1
            r1.n = r12
            r1.o = r11
            r1.p = r7
            r1.q = r12
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.r = r11
            r1.s = r8
            r1.t = r7
            r1.u = r8
            r1.v = r8
            r1.w = r8
            r1.x = r8
            r1.y = r7
            com.baidu.location.a$a r13 = new com.baidu.location.a$a
            r13.<init>()
            com.baidu.location.a r13 = r13.a()
            r1.z = r13
            r1.A = r8
            r1.B = r8
            r1.C = r8
            r1.E = r7
            r1.F = r7
            r13 = 1
            r1.G = r13
            r1.H = r8
            java.lang.String r14 = ""
            r1.J = r14
            r1.K = r12
            r1.L = r7
            r15 = 2
            r1.M = r15
            r1.N = r7
            r1.O = r8
            r1.P = r8
            r1.Q = r8
            r1.R = r12
            r1.S = r8
            r1.T = r8
            r1.U = r8
            r1.V = r8
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>()
            r1.W = r15
            r1.X = r7
            r1.Y = r7
            r16 = r14
            r13 = 0
            r1.Z = r13
            r1.a0 = r8
            r1.b0 = r8
            r1.c0 = r9
            r1.d0 = r9
            r1.e0 = r7
            r1.f0 = r8
            r1.g0 = r11
            r13 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r1.h0 = r13
            r1.i0 = r7
            r1.j0 = r12
            r1.l0 = r8
            r1.m0 = r8
            r13 = -1
            r1.n0 = r13
            if (r2 == 0) goto L78a
            r11 = r16
            boolean r13 = r2.equals(r11)
            if (r13 == 0) goto Lb7
            goto L78a
        Lb7:
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch: java.lang.Error -> L779 java.lang.Exception -> L780
            r13.<init>(r2)     // Catch: java.lang.Exception -> L775 java.lang.Error -> L779
            java.lang.String r2 = "result"
            org.json.JSONObject r2 = r13.getJSONObject(r2)     // Catch: java.lang.Exception -> L775 java.lang.Error -> L779
            java.lang.String r14 = "error"
            java.lang.String r14 = r2.getString(r14)     // Catch: java.lang.Exception -> L775 java.lang.Error -> L779
            int r14 = java.lang.Integer.parseInt(r14)     // Catch: java.lang.Exception -> L775 java.lang.Error -> L779
            r1.h(r14)     // Catch: java.lang.Exception -> L775 java.lang.Error -> L779
            java.lang.String r15 = "time"
            java.lang.String r2 = r2.getString(r15)     // Catch: java.lang.Exception -> L775 java.lang.Error -> L779
            r1.n(r2)     // Catch: java.lang.Exception -> L775 java.lang.Error -> L779
            r2 = 61
            java.lang.String r15 = "gcj02"
            java.lang.String r9 = "radius"
            java.lang.String r10 = "point"
            java.lang.String r12 = "content"
            java.lang.String r8 = "in_cn"
            java.lang.String r7 = "x"
            r17 = r11
            java.lang.String r11 = "y"
            if (r14 != r2) goto L189
            org.json.JSONObject r2 = r13.getJSONObject(r12)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            org.json.JSONObject r3 = r2.getJSONObject(r10)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            java.lang.String r4 = r3.getString(r11)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            double r4 = java.lang.Double.parseDouble(r4)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r1.c(r4)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            java.lang.String r3 = r3.getString(r7)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            double r3 = java.lang.Double.parseDouble(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r1.d(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            java.lang.String r3 = r2.getString(r9)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            float r3 = java.lang.Float.parseFloat(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r1.b(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            java.lang.String r3 = "s"
            java.lang.String r3 = r2.getString(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            float r3 = java.lang.Float.parseFloat(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r1.c(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            java.lang.String r3 = "d"
            java.lang.String r3 = r2.getString(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            float r3 = java.lang.Float.parseFloat(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r1.a(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            java.lang.String r3 = "n"
            java.lang.String r3 = r2.getString(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r1.m(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            java.lang.String r3 = "is_mock"
            boolean r3 = r2.has(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r3 == 0) goto L14d
            java.lang.String r3 = "is_mock"
            int r3 = r2.getInt(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r1.k(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
        L14d:
            java.lang.String r3 = "h"
            boolean r3 = r2.has(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r3 == 0) goto L15e
            java.lang.String r3 = "h"
            double r3 = r2.getDouble(r3)     // Catch: java.lang.Exception -> L15e java.lang.Error -> L779
            r1.a(r3)     // Catch: java.lang.Exception -> L15e java.lang.Error -> L779
        L15e:
            boolean r3 = r2.has(r8)     // Catch: java.lang.Exception -> L174 java.lang.Error -> L779
            if (r3 == 0) goto L170
            java.lang.String r2 = r2.getString(r8)     // Catch: java.lang.Exception -> L174 java.lang.Error -> L779
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Exception -> L174 java.lang.Error -> L779
            r1.i(r2)     // Catch: java.lang.Exception -> L174 java.lang.Error -> L779
            goto L174
        L170:
            r2 = 1
            r1.i(r2)     // Catch: java.lang.Exception -> L174 java.lang.Error -> L779
        L174:
            int r2 = r1.G     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r2 != 0) goto L17f
            java.lang.String r2 = "wgs84"
        L17a:
            r1.e(r2)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            goto L78a
        L17f:
            r1.e(r15)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            goto L78a
        L184:
            r0 = move-exception
            r3 = r0
            r2 = 0
            goto L783
        L189:
            r2 = r15
            r15 = 161(0xa1, float:2.26E-43)
            if (r14 != r15) goto L725
            org.json.JSONObject r12 = r13.getJSONObject(r12)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            org.json.JSONObject r10 = r12.getJSONObject(r10)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            java.lang.String r13 = r10.getString(r11)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            double r13 = java.lang.Double.parseDouble(r13)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r1.c(r13)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            java.lang.String r10 = r10.getString(r7)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            double r13 = java.lang.Double.parseDouble(r10)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r1.d(r13)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            java.lang.String r9 = r12.getString(r9)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            float r9 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r1.b(r9)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            boolean r9 = r12.has(r6)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r9 == 0) goto L1c4
            java.lang.String r6 = r12.getString(r6)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r1.o(r6)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
        L1c4:
            boolean r6 = r12.has(r5)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r6 == 0) goto L1d5
            java.lang.String r5 = r12.optString(r5)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            float r5 = java.lang.Float.parseFloat(r5)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r1.d(r5)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
        L1d5:
            boolean r5 = r12.has(r4)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r5 == 0) goto L1e2
            int r4 = r12.optInt(r4)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r1.g(r4)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
        L1e2:
            boolean r4 = r12.has(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r4 == 0) goto L1f3
            java.lang.String r3 = r12.optString(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            float r3 = java.lang.Float.parseFloat(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r1.e(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
        L1f3:
            java.lang.String r3 = "sema"
            boolean r3 = r12.has(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            java.lang.String r4 = "addr"
            if (r3 == 0) goto L2fa
            java.lang.String r3 = "sema"
            org.json.JSONObject r3 = r12.getJSONObject(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            java.lang.String r5 = "aptag"
            boolean r5 = r3.has(r5)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r5 == 0) goto L21f
            java.lang.String r5 = "aptag"
            java.lang.String r5 = r3.getString(r5)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r6 != 0) goto L21a
            r1.v = r5     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            goto L21f
        L21a:
            r5 = r17
            r1.v = r5     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            goto L221
        L21f:
            r5 = r17
        L221:
            java.lang.String r6 = "aptagd"
            boolean r6 = r3.has(r6)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r6 == 0) goto L288
            java.lang.String r6 = "aptagd"
            org.json.JSONObject r6 = r3.getJSONObject(r6)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            java.lang.String r9 = "pois"
            org.json.JSONArray r6 = r6.getJSONArray(r9)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r9.<init>()     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r10 = 0
        L23b:
            int r13 = r6.length()     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r10 >= r13) goto L286
            org.json.JSONObject r13 = r6.getJSONObject(r10)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            java.lang.String r14 = "pname"
            java.lang.String r19 = r13.getString(r14)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            java.lang.String r14 = "pid"
            java.lang.String r18 = r13.getString(r14)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            java.lang.String r14 = "pr"
            double r20 = r13.getDouble(r14)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            java.lang.String r14 = "tags"
            boolean r14 = r13.has(r14)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r14 == 0) goto L268
            java.lang.String r14 = "tags"
            java.lang.String r14 = r13.getString(r14)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r22 = r14
            goto L26a
        L268:
            r22 = r5
        L26a:
            boolean r14 = r13.has(r4)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r14 == 0) goto L277
            java.lang.String r13 = r13.getString(r4)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r23 = r13
            goto L279
        L277:
            r23 = r5
        L279:
            com.baidu.location.j r13 = new com.baidu.location.j     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r17 = r13
            r17.<init>(r18, r19, r20, r22, r23)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r9.add(r13)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            int r10 = r10 + 1
            goto L23b
        L286:
            r1.S = r9     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
        L288:
            java.lang.String r6 = "poiregion"
            boolean r6 = r3.has(r6)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r6 == 0) goto L29e
            java.lang.String r6 = "poiregion"
            java.lang.String r6 = r3.getString(r6)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            boolean r9 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r9 != 0) goto L29e
            r1.w = r6     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
        L29e:
            java.lang.String r6 = "poi_regions"
            boolean r6 = r3.has(r6)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r6 == 0) goto L2e3
            java.lang.String r6 = "poi_regions"
            org.json.JSONObject r6 = r3.getJSONObject(r6)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            java.lang.String r9 = "direction_desc"
            boolean r9 = r6.has(r9)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r9 == 0) goto L2bb
            java.lang.String r9 = "direction_desc"
            java.lang.String r9 = r6.getString(r9)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            goto L2bc
        L2bb:
            r9 = r5
        L2bc:
            java.lang.String r10 = "name"
            boolean r10 = r6.has(r10)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r10 == 0) goto L2cb
            java.lang.String r10 = "name"
            java.lang.String r10 = r6.getString(r10)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            goto L2cc
        L2cb:
            r10 = r5
        L2cc:
            java.lang.String r13 = "tag"
            boolean r13 = r6.has(r13)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r13 == 0) goto L2db
            java.lang.String r13 = "tag"
            java.lang.String r6 = r6.getString(r13)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            goto L2dc
        L2db:
            r6 = r5
        L2dc:
            com.baidu.location.k r13 = new com.baidu.location.k     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r13.<init>(r9, r10, r6)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r1.f0 = r13     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
        L2e3:
            java.lang.String r6 = "regular"
            boolean r6 = r3.has(r6)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r6 == 0) goto L2fc
            java.lang.String r6 = "regular"
            java.lang.String r3 = r3.getString(r6)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            boolean r6 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r6 != 0) goto L2fc
            r1.x = r3     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            goto L2fc
        L2fa:
            r5 = r17
        L2fc:
            boolean r3 = r12.has(r4)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            java.lang.String r6 = ","
            if (r3 == 0) goto L4be
            org.json.JSONObject r3 = r12.getJSONObject(r4)     // Catch: java.lang.Exception -> L30a java.lang.Error -> L779
            r15 = 1
            goto L30c
        L30a:
            r3 = 0
            r15 = 0
        L30c:
            if (r3 == 0) goto L3db
            java.lang.String r4 = "city"
            boolean r4 = r3.has(r4)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r4 == 0) goto L31d
            java.lang.String r4 = "city"
            java.lang.String r4 = r3.getString(r4)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            goto L31e
        L31d:
            r4 = r5
        L31e:
            java.lang.String r9 = "city_code"
            boolean r9 = r3.has(r9)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r9 == 0) goto L32d
            java.lang.String r9 = "city_code"
            java.lang.String r9 = r3.getString(r9)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            goto L32e
        L32d:
            r9 = r5
        L32e:
            java.lang.String r10 = "country"
            boolean r10 = r3.has(r10)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r10 == 0) goto L33d
            java.lang.String r10 = "country"
            java.lang.String r10 = r3.getString(r10)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            goto L33e
        L33d:
            r10 = r5
        L33e:
            java.lang.String r13 = "country_code"
            boolean r13 = r3.has(r13)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r13 == 0) goto L34d
            java.lang.String r13 = "country_code"
            java.lang.String r13 = r3.getString(r13)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            goto L34e
        L34d:
            r13 = r5
        L34e:
            java.lang.String r14 = "province"
            boolean r14 = r3.has(r14)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r14 == 0) goto L35f
            java.lang.String r14 = "province"
            java.lang.String r14 = r3.getString(r14)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r26 = r4
            goto L362
        L35f:
            r26 = r4
            r14 = r5
        L362:
            java.lang.String r4 = "district"
            boolean r4 = r3.has(r4)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r4 == 0) goto L373
            java.lang.String r4 = "district"
            java.lang.String r4 = r3.getString(r4)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r17 = r4
            goto L375
        L373:
            r17 = r5
        L375:
            java.lang.String r4 = "street"
            boolean r4 = r3.has(r4)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r4 == 0) goto L386
            java.lang.String r4 = "street"
            java.lang.String r4 = r3.getString(r4)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r18 = r4
            goto L388
        L386:
            r18 = r5
        L388:
            java.lang.String r4 = "street_number"
            boolean r4 = r3.has(r4)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r4 == 0) goto L399
            java.lang.String r4 = "street_number"
            java.lang.String r4 = r3.getString(r4)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r19 = r4
            goto L39b
        L399:
            r19 = r5
        L39b:
            java.lang.String r4 = "adcode"
            boolean r4 = r3.has(r4)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r4 == 0) goto L3aa
            java.lang.String r4 = "adcode"
            java.lang.String r4 = r3.getString(r4)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            goto L3ab
        L3aa:
            r4 = r5
        L3ab:
            java.lang.String r5 = "town"
            boolean r5 = r3.has(r5)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r5 == 0) goto L3c4
            java.lang.String r5 = "town"
            java.lang.String r3 = r3.getString(r5)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r5 = r18
            r18 = r7
            r7 = r3
            r3 = r13
            r13 = r17
            r17 = r15
            goto L3ce
        L3c4:
            r3 = r13
            r13 = r17
            r5 = r18
            r18 = r7
            r17 = r15
            r7 = 0
        L3ce:
            r15 = r14
            r14 = r19
            r24 = r4
            r4 = r26
            r26 = r11
            r11 = r24
            goto L48a
        L3db:
            java.lang.String r3 = r12.getString(r4)     // Catch: java.lang.Exception -> L469 java.lang.Error -> L779
            java.lang.String[] r3 = r3.split(r6)     // Catch: java.lang.Exception -> L469 java.lang.Error -> L779
            int r4 = r3.length     // Catch: java.lang.Exception -> L469 java.lang.Error -> L779
            if (r4 <= 0) goto L3eb
            r5 = 0
            r9 = r3[r5]     // Catch: java.lang.Exception -> L469 java.lang.Error -> L779
            r5 = 1
            goto L3ed
        L3eb:
            r5 = 1
            r9 = 0
        L3ed:
            if (r4 <= r5) goto L3f8
            r10 = r3[r5]     // Catch: java.lang.Exception -> L3f3 java.lang.Error -> L779
            r5 = 2
            goto L3fa
        L3f3:
            r0 = move-exception
            r3 = r0
            r5 = 0
            goto L46d
        L3f8:
            r5 = 2
            r10 = 0
        L3fa:
            if (r4 <= r5) goto L404
            r13 = r3[r5]     // Catch: java.lang.Exception -> L3ff java.lang.Error -> L779
            goto L405
        L3ff:
            r0 = move-exception
            r3 = r0
            r5 = 0
            goto L46e
        L404:
            r13 = 0
        L405:
            r5 = 3
            if (r4 <= r5) goto L411
            r5 = 3
            r5 = r3[r5]     // Catch: java.lang.Exception -> L40c java.lang.Error -> L779
            goto L412
        L40c:
            r0 = move-exception
            r3 = r0
            r5 = 0
            goto L46f
        L411:
            r5 = 0
        L412:
            r14 = 4
            if (r4 <= r14) goto L41d
            r14 = 4
            r14 = r3[r14]     // Catch: java.lang.Exception -> L419 java.lang.Error -> L779
            goto L41e
        L419:
            r0 = move-exception
            r3 = r0
            goto L46f
        L41d:
            r14 = 0
        L41e:
            r15 = 5
            if (r4 <= r15) goto L42a
            r15 = 5
            r15 = r3[r15]     // Catch: java.lang.Exception -> L427 java.lang.Error -> L779
            r26 = r5
            goto L42d
        L427:
            r0 = move-exception
            r3 = r0
            goto L470
        L42a:
            r26 = r5
            r15 = 0
        L42d:
            r5 = 6
            if (r4 <= r5) goto L43b
            r5 = 6
            r5 = r3[r5]     // Catch: java.lang.Exception -> L436 java.lang.Error -> L779
            r17 = r5
            goto L43d
        L436:
            r0 = move-exception
            r5 = r26
            r3 = r0
            goto L471
        L43b:
            r17 = 0
        L43d:
            r5 = 7
            if (r4 <= r5) goto L44b
            r5 = 7
            r5 = r3[r5]     // Catch: java.lang.Exception -> L446 java.lang.Error -> L779
            r18 = r5
            goto L44d
        L446:
            r0 = move-exception
            r5 = r26
            r3 = r0
            goto L473
        L44b:
            r18 = 0
        L44d:
            r5 = 8
            if (r4 <= r5) goto L45b
            r4 = 8
            r3 = r3[r4]     // Catch: java.lang.Exception -> L456 java.lang.Error -> L779
            goto L45c
        L456:
            r0 = move-exception
            r5 = r26
            r3 = r0
            goto L475
        L45b:
            r3 = 0
        L45c:
            r5 = r26
            r4 = r10
            r26 = r11
            r10 = r17
            r17 = 1
            r11 = r3
            r3 = r18
            goto L482
        L469:
            r0 = move-exception
            r3 = r0
            r5 = 0
            r9 = 0
        L46d:
            r10 = 0
        L46e:
            r13 = 0
        L46f:
            r14 = 0
        L470:
            r15 = 0
        L471:
            r17 = 0
        L473:
            r18 = 0
        L475:
            r3.printStackTrace()     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r4 = r10
            r26 = r11
            r10 = r17
            r3 = r18
            r11 = 0
            r17 = 0
        L482:
            r18 = r7
            r7 = 0
            r24 = r15
            r15 = r9
            r9 = r24
        L48a:
            if (r17 == 0) goto L4bb
            r17 = r6
            com.baidu.location.a$a r6 = new com.baidu.location.a$a     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r6.<init>()     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r6.d(r10)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r6.e(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r6.g(r15)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r6.b(r4)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r6.c(r9)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r6.f(r13)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r6.h(r5)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r6.i(r14)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r6.a(r11)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r6.j(r7)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            com.baidu.location.a r3 = r6.a()     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r1.z = r3     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r3 = 1
            r1.t = r3     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            goto L4cb
        L4bb:
            r17 = r6
            goto L4cb
        L4be:
            r17 = r6
            r18 = r7
            r26 = r11
            r3 = 0
            r1.t = r3     // Catch: java.lang.Exception -> L722 java.lang.Error -> L779
            r3 = 0
            r1.b(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
        L4cb:
            java.lang.String r3 = "floor"
            boolean r3 = r12.has(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r3 == 0) goto L4e4
            java.lang.String r3 = "floor"
            java.lang.String r3 = r12.getString(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r1.A = r3     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r3 == 0) goto L4e4
            r3 = 0
            r1.A = r3     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
        L4e4:
            java.lang.String r3 = "indoor"
            boolean r3 = r12.has(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r3 == 0) goto L503
            java.lang.String r3 = "indoor"
            java.lang.String r3 = r12.getString(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r4 != 0) goto L503
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            int r3 = r3.intValue()     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r1.n(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
        L503:
            java.lang.String r3 = "loctp"
            boolean r3 = r12.has(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r3 == 0) goto L51c
            java.lang.String r3 = "loctp"
            java.lang.String r3 = r12.getString(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r1.H = r3     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r3 == 0) goto L51c
            r3 = 0
            r1.H = r3     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
        L51c:
            java.lang.String r3 = "bldgid"
            boolean r3 = r12.has(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r3 == 0) goto L535
            java.lang.String r3 = "bldgid"
            java.lang.String r3 = r12.getString(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r1.B = r3     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r3 == 0) goto L535
            r3 = 0
            r1.B = r3     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
        L535:
            java.lang.String r3 = "bldg"
            boolean r3 = r12.has(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r3 == 0) goto L54e
            java.lang.String r3 = "bldg"
            java.lang.String r3 = r12.getString(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r1.C = r3     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r3 == 0) goto L54e
            r3 = 0
            r1.C = r3     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
        L54e:
            java.lang.String r3 = "acc"
            boolean r3 = r12.has(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r3 == 0) goto L55e
            java.lang.String r3 = "acc"
            double r3 = r12.getDouble(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r1.D = r3     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
        L55e:
            java.lang.String r3 = "ibav"
            boolean r3 = r12.has(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r3 == 0) goto L58a
            java.lang.String r3 = "ibav"
            java.lang.String r3 = r12.getString(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r4 == 0) goto L574
        L572:
            r3 = 0
            goto L57d
        L574:
            java.lang.String r4 = "0"
            boolean r4 = r3.equals(r4)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r4 == 0) goto L580
            goto L572
        L57d:
            r1.F = r3     // Catch: java.lang.Exception -> L722 java.lang.Error -> L779
            goto L58a
        L580:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            int r3 = r3.intValue()     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r1.F = r3     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
        L58a:
            java.lang.String r3 = "indoorflags"
            boolean r3 = r12.has(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r3 == 0) goto L660
            java.lang.String r3 = "indoorflags"
            org.json.JSONObject r3 = r12.getJSONObject(r3)     // Catch: java.lang.Exception -> L65b java.lang.Error -> L779
            java.lang.String r4 = "area"
            boolean r4 = r3.has(r4)     // Catch: java.lang.Exception -> L65b java.lang.Error -> L779
            if (r4 == 0) goto L5bb
            java.lang.String r4 = "area"
            java.lang.String r4 = r3.getString(r4)     // Catch: java.lang.Exception -> L65b java.lang.Error -> L779
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L65b java.lang.Error -> L779
            int r4 = r4.intValue()     // Catch: java.lang.Exception -> L65b java.lang.Error -> L779
            if (r4 != 0) goto L5b5
            r5 = 2
            r1.e(r5)     // Catch: java.lang.Exception -> L65b java.lang.Error -> L779
            goto L5bb
        L5b5:
            r5 = 1
            if (r4 != r5) goto L5bb
            r1.e(r5)     // Catch: java.lang.Exception -> L65b java.lang.Error -> L779
        L5bb:
            java.lang.String r4 = "support"
            boolean r4 = r3.has(r4)     // Catch: java.lang.Exception -> L65b java.lang.Error -> L779
            if (r4 == 0) goto L5d4
            java.lang.String r4 = "support"
            java.lang.String r4 = r3.getString(r4)     // Catch: java.lang.Exception -> L65b java.lang.Error -> L779
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L65b java.lang.Error -> L779
            int r4 = r4.intValue()     // Catch: java.lang.Exception -> L65b java.lang.Error -> L779
            r1.d(r4)     // Catch: java.lang.Exception -> L65b java.lang.Error -> L779
        L5d4:
            java.lang.String r4 = "inbldg"
            boolean r4 = r3.has(r4)     // Catch: java.lang.Exception -> L65b java.lang.Error -> L779
            if (r4 == 0) goto L5e4
            java.lang.String r4 = "inbldg"
            java.lang.String r4 = r3.getString(r4)     // Catch: java.lang.Exception -> L65b java.lang.Error -> L779
            r1.O = r4     // Catch: java.lang.Exception -> L65b java.lang.Error -> L779
        L5e4:
            java.lang.String r4 = "inbldgid"
            boolean r4 = r3.has(r4)     // Catch: java.lang.Exception -> L65b java.lang.Error -> L779
            if (r4 == 0) goto L5f4
            java.lang.String r4 = "inbldgid"
            java.lang.String r4 = r3.getString(r4)     // Catch: java.lang.Exception -> L65b java.lang.Error -> L779
            r1.P = r4     // Catch: java.lang.Exception -> L65b java.lang.Error -> L779
        L5f4:
            java.lang.String r4 = "polygon"
            boolean r4 = r3.has(r4)     // Catch: java.lang.Exception -> L65b java.lang.Error -> L779
            if (r4 == 0) goto L605
            java.lang.String r4 = "polygon"
            java.lang.String r4 = r3.getString(r4)     // Catch: java.lang.Exception -> L65b java.lang.Error -> L779
            r1.h(r4)     // Catch: java.lang.Exception -> L65b java.lang.Error -> L779
        L605:
            java.lang.String r4 = "ret_fields"
            boolean r4 = r3.has(r4)     // Catch: java.lang.Exception -> L65b java.lang.Error -> L779
            if (r4 == 0) goto L639
            java.lang.String r4 = "ret_fields"
            java.lang.String r4 = r3.getString(r4)     // Catch: java.lang.Exception -> L639 java.lang.Error -> L779
            java.lang.String r5 = "\\|"
            java.lang.String[] r4 = r4.split(r5)     // Catch: java.lang.Exception -> L639 java.lang.Error -> L779
            int r5 = r4.length     // Catch: java.lang.Exception -> L639 java.lang.Error -> L779
            r6 = 0
        L61b:
            if (r6 >= r5) goto L639
            r7 = r4[r6]     // Catch: java.lang.Exception -> L639 java.lang.Error -> L779
            java.lang.String r9 = "="
            java.lang.String[] r7 = r7.split(r9)     // Catch: java.lang.Exception -> L639 java.lang.Error -> L779
            if (r7 == 0) goto L636
            int r9 = r7.length     // Catch: java.lang.Exception -> L639 java.lang.Error -> L779
            r10 = 2
            if (r9 < r10) goto L636
            r9 = 0
            r10 = r7[r9]     // Catch: java.lang.Exception -> L639 java.lang.Error -> L779
            r9 = 1
            r7 = r7[r9]     // Catch: java.lang.Exception -> L639 java.lang.Error -> L779
            android.os.Bundle r9 = r1.W     // Catch: java.lang.Exception -> L639 java.lang.Error -> L779
            r9.putString(r10, r7)     // Catch: java.lang.Exception -> L639 java.lang.Error -> L779
        L636:
            int r6 = r6 + 1
            goto L61b
        L639:
            java.lang.String r4 = "inout_ble"
            boolean r4 = r3.has(r4)     // Catch: java.lang.Exception -> L65b java.lang.Error -> L779
            if (r4 == 0) goto L656
            java.lang.String r4 = "inout_ble"
            int r3 = r3.optInt(r4)     // Catch: java.lang.Exception -> L65b java.lang.Error -> L779
            r1.c(r3)     // Catch: java.lang.Exception -> L65b java.lang.Error -> L779
            r4 = 1
            if (r3 != r4) goto L651
            r1.b(r4)     // Catch: java.lang.Exception -> L65b java.lang.Error -> L779
            goto L660
        L651:
            r3 = 0
            r1.b(r3)     // Catch: java.lang.Exception -> L65b java.lang.Error -> L779
            goto L660
        L656:
            r3 = -1
            r1.c(r3)     // Catch: java.lang.Exception -> L65b java.lang.Error -> L779
            goto L660
        L65b:
            r0 = move-exception
            r3 = r0
            r3.printStackTrace()     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
        L660:
            java.lang.String r3 = "gpscs"
            boolean r3 = r12.has(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r3 == 0) goto L672
            java.lang.String r3 = "gpscs"
            int r3 = r12.getInt(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r1.b(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            goto L676
        L672:
            r3 = 0
            r1.b(r3)     // Catch: java.lang.Exception -> L722 java.lang.Error -> L779
        L676:
            boolean r3 = r12.has(r8)     // Catch: java.lang.Exception -> L68c java.lang.Error -> L779
            if (r3 == 0) goto L688
            java.lang.String r3 = r12.getString(r8)     // Catch: java.lang.Exception -> L68c java.lang.Error -> L779
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Exception -> L68c java.lang.Error -> L779
            r1.i(r3)     // Catch: java.lang.Exception -> L68c java.lang.Error -> L779
            goto L68c
        L688:
            r3 = 1
            r1.i(r3)     // Catch: java.lang.Exception -> L68c java.lang.Error -> L779
        L68c:
            int r3 = r1.G     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r3 != 0) goto L692
            java.lang.String r2 = "wgs84"
        L692:
            r1.e(r2)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            java.lang.String r2 = "navi"
            boolean r2 = r12.has(r2)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r2 == 0) goto L6a5
            java.lang.String r2 = "navi"
            java.lang.String r2 = r12.getString(r2)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r1.a0 = r2     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
        L6a5:
            java.lang.String r2 = "navi_client"
            boolean r2 = r12.has(r2)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r2 == 0) goto L6e6
            java.lang.String r2 = "navi_client"
            java.lang.String r2 = r12.getString(r2)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r2 == 0) goto L6e6
            r3 = r17
            boolean r4 = r2.contains(r3)     // Catch: java.lang.Throwable -> L6e1
            if (r4 == 0) goto L6e6
            java.lang.String[] r2 = r2.split(r3)     // Catch: java.lang.Throwable -> L6e1
            if (r2 == 0) goto L6e6
            int r3 = r2.length     // Catch: java.lang.Throwable -> L6e1
            r4 = 2
            if (r3 < r4) goto L6e6
            r3 = 0
            r4 = r2[r3]     // Catch: java.lang.Throwable -> L6e1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L6e1
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L6e1
            r4 = 1
            r2 = r2[r4]     // Catch: java.lang.Throwable -> L6e1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L6e1
            r2.intValue()     // Catch: java.lang.Throwable -> L6e1
            if (r3 <= 0) goto L6e6
            r1.e0 = r4     // Catch: java.lang.Throwable -> L6e1
            goto L6e6
        L6e1:
            r0 = move-exception
            r2 = r0
            r2.printStackTrace()     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
        L6e6:
            java.lang.String r2 = "nrl_point"
            boolean r2 = r12.has(r2)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            if (r2 == 0) goto L78a
            java.lang.String r2 = "nrl_point"
            org.json.JSONObject r2 = r12.getJSONObject(r2)     // Catch: java.lang.Throwable -> L71a
            r3 = r18
            boolean r4 = r2.has(r3)     // Catch: java.lang.Throwable -> L71a
            if (r4 == 0) goto L78a
            r4 = r26
            boolean r5 = r2.has(r4)     // Catch: java.lang.Throwable -> L71a
            if (r5 == 0) goto L78a
            java.lang.String r4 = r2.getString(r4)     // Catch: java.lang.Throwable -> L71a
            double r4 = java.lang.Double.parseDouble(r4)     // Catch: java.lang.Throwable -> L71a
            r1.c0 = r4     // Catch: java.lang.Throwable -> L71a
            java.lang.String r2 = r2.getString(r3)     // Catch: java.lang.Throwable -> L71a
            double r2 = java.lang.Double.parseDouble(r2)     // Catch: java.lang.Throwable -> L71a
            r1.d0 = r2     // Catch: java.lang.Throwable -> L71a
            goto L78a
        L71a:
            r2 = 1
            r1.c0 = r2     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r1.d0 = r2     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            goto L78a
        L722:
            r0 = move-exception
            r2 = r3
            goto L782
        L725:
            r3 = r7
            r4 = r11
            r5 = 66
            if (r14 == r5) goto L739
            r5 = 68
            if (r14 != r5) goto L730
            goto L739
        L730:
            r2 = 167(0xa7, float:2.34E-43)
            if (r14 != r2) goto L78a
            r2 = 2
            r1.i(r2)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            goto L78a
        L739:
            org.json.JSONObject r5 = r13.getJSONObject(r12)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            org.json.JSONObject r6 = r5.getJSONObject(r10)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            java.lang.String r4 = r6.getString(r4)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            double r7 = java.lang.Double.parseDouble(r4)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r1.c(r7)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            java.lang.String r3 = r6.getString(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            double r3 = java.lang.Double.parseDouble(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r1.d(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            java.lang.String r3 = r5.getString(r9)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            float r3 = java.lang.Float.parseFloat(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r1.b(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            java.lang.String r3 = "isCellChanged"
            java.lang.String r3 = r5.getString(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            boolean r3 = java.lang.Boolean.parseBoolean(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            r1.a(r3)     // Catch: java.lang.Exception -> L184 java.lang.Error -> L779
            goto L17a
        L775:
            r0 = move-exception
            r3 = r0
            r2 = r7
            goto L783
        L779:
            r0 = move-exception
            r2 = r0
            r2.printStackTrace()
            r2 = 0
            goto L786
        L780:
            r0 = move-exception
            r2 = r7
        L782:
            r3 = r0
        L783:
            r3.printStackTrace()
        L786:
            r1.f1355b = r2
            r1.t = r2
        L78a:
            return
    }

    public int A() {
            r1 = this;
            r0 = 1
            r1.p = r0
            int r1 = r1.q
            return r1
    }

    public float B() {
            r0 = this;
            float r0 = r0.i
            return r0
    }

    public java.lang.String C() {
            r0 = this;
            java.lang.String r0 = r0.f1356c
            return r0
    }

    public long D() {
            r2 = this;
            long r0 = r2.n0
            return r0
    }

    public java.lang.String E() {
            r0 = this;
            java.lang.String r0 = r0.l
            return r0
    }

    public int F() {
            r0 = this;
            int r0 = r0.K
            return r0
    }

    public boolean G() {
            r0 = this;
            boolean r0 = r0.t
            return r0
    }

    public boolean H() {
            r0 = this;
            boolean r0 = r0.f
            return r0
    }

    public boolean I() {
            r0 = this;
            boolean r0 = r0.e0
            return r0
    }

    public int J() {
            r0 = this;
            int r0 = r0.F
            return r0
    }

    public double a() {
            r2 = this;
            double r0 = r2.D
            return r0
    }

    public java.lang.String a(java.lang.String r1) {
            r0 = this;
            android.os.Bundle r0 = r0.W
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    public void a(double r3) {
            r2 = this;
            r0 = 4666722622711529472(0x40c3878000000000, double:9999.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto Le
            r2.g = r3
            r3 = 1
            r2.f = r3
        Le:
            return
    }

    public void a(float r1) {
            r0 = this;
            r0.r = r1
            return
    }

    public void a(float r10, float r11, java.lang.String r12, java.lang.String r13) {
            r9 = this;
            double r0 = (double) r10
            r2 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            java.lang.String r1 = "%.2f"
            java.lang.String r4 = ""
            r5 = 0
            r6 = 1
            if (r0 <= 0) goto L1d
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.Float r10 = java.lang.Float.valueOf(r10)
            r0[r5] = r10
            java.lang.String r10 = java.lang.String.format(r1, r0)
            goto L1e
        L1d:
            r10 = r4
        L1e:
            double r7 = (double) r11
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 <= 0) goto L2f
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            r0[r5] = r11
            java.lang.String r4 = java.lang.String.format(r1, r0)
        L2f:
            r11 = 0
            java.lang.String r0 = r9.a0
            java.lang.String r1 = "%s|%s"
            r2 = 2
            if (r0 == 0) goto L58
            java.util.Locale r11 = java.util.Locale.US
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r5] = r0
            r3[r6] = r10
            r3[r2] = r4
            java.lang.String r10 = "%s|%s,%s"
            java.lang.String r10 = java.lang.String.format(r11, r10, r3)
            java.lang.String r0 = r9.b0
            if (r0 == 0) goto L57
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r5] = r10
            r3[r6] = r0
            java.lang.String r11 = java.lang.String.format(r11, r1, r3)
            goto L58
        L57:
            r11 = r10
        L58:
            if (r12 == 0) goto L6a
            if (r11 != 0) goto L5d
            goto L6b
        L5d:
            java.util.Locale r10 = java.util.Locale.US
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r5] = r11
            r0[r6] = r12
            java.lang.String r12 = java.lang.String.format(r10, r1, r0)
            goto L6b
        L6a:
            r12 = r11
        L6b:
            if (r13 == 0) goto L7d
            if (r12 != 0) goto L70
            goto L7e
        L70:
            java.util.Locale r10 = java.util.Locale.US
            java.lang.Object[] r11 = new java.lang.Object[r2]
            r11[r5] = r12
            r11[r6] = r13
            java.lang.String r13 = java.lang.String.format(r10, r1, r11)
            goto L7e
        L7d:
            r13 = r12
        L7e:
            r9.V = r13
            return
    }

    @java.lang.Deprecated
    public void a(int r1) {
            r0 = this;
            r0.X = r1
            return
    }

    public void a(long r1) {
            r0 = this;
            r0.Z = r1
            return
    }

    public void a(android.os.Bundle r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            goto La
        L4:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>(r2)
            r2 = r0
        La:
            r1.l0 = r2
            return
    }

    public void a(com.baidu.location.a r1) {
            r0 = this;
            if (r1 == 0) goto L7
            r0.z = r1
            r1 = 1
            r0.t = r1
        L7:
            return
    }

    public void a(com.baidu.location.c r2) {
            r1 = this;
            int r0 = r1.u()
            if (r0 <= 0) goto L8
            r1.k0 = r2
        L8:
            return
    }

    public void a(com.baidu.location.k r1) {
            r0 = this;
            r0.f0 = r1
            return
    }

    public final void a(java.lang.Boolean r1) {
            r0 = this;
            boolean r1 = r1.booleanValue()
            r0.y = r1
            return
    }

    public void a(java.lang.String r2, double[] r3) {
            r1 = this;
            android.os.Bundle r0 = r1.W
            if (r0 != 0) goto Lb
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.W = r0
        Lb:
            android.os.Bundle r1 = r1.W
            r1.putDoubleArray(r2, r3)
            return
    }

    public void a(java.util.List<com.baidu.location.j> r1) {
            r0 = this;
            r0.S = r1
            return
    }

    public void a(boolean r1) {
            r0 = this;
            r0.E = r1
            return
    }

    public java.lang.String b() {
            r0 = this;
            com.baidu.location.a r0 = r0.z
            java.lang.String r0 = r0.i
            return r0
    }

    public void b(double r1) {
            r0 = this;
            r0.h0 = r1
            return
    }

    public void b(float r1) {
            r0 = this;
            r0.k = r1
            r1 = 1
            r0.j = r1
            return
    }

    @java.lang.Deprecated
    public void b(int r1) {
            r0 = this;
            r0.Y = r1
            return
    }

    public void b(java.lang.String r1) {
            r0 = this;
            r0.u = r1
            if (r1 != 0) goto L6
            r1 = 0
            goto L7
        L6:
            r1 = 1
        L7:
            r0.t = r1
            return
    }

    public void b(boolean r1) {
            r0 = this;
            r0.e0 = r1
            return
    }

    public com.baidu.location.a c() {
            r0 = this;
            com.baidu.location.a r0 = r0.z
            return r0
    }

    public void c(double r1) {
            r0 = this;
            r0.d = r1
            return
    }

    public void c(float r1) {
            r0 = this;
            r0.i = r1
            r1 = 1
            r0.h = r1
            return
    }

    public void c(int r1) {
            r0 = this;
            r0.R = r1
            return
    }

    public void c(java.lang.String r1) {
            r0 = this;
            r0.B = r1
            return
    }

    public double d() {
            r2 = this;
            double r0 = r2.g
            return r0
    }

    public void d(double r1) {
            r0 = this;
            r0.e = r1
            return
    }

    public void d(float r1) {
            r0 = this;
            r0.m = r1
            return
    }

    public void d(int r1) {
            r0 = this;
            r0.N = r1
            return
    }

    public void d(java.lang.String r1) {
            r0 = this;
            r0.C = r1
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r0 = this;
            r0 = 0
            return r0
    }

    public java.lang.String e() {
            r0 = this;
            java.lang.String r0 = r0.B
            return r0
    }

    public void e(float r1) {
            r0 = this;
            r0.o = r1
            return
    }

    public void e(int r1) {
            r0 = this;
            r0.L = r1
            return
    }

    public void e(java.lang.String r1) {
            r0 = this;
            r0.s = r1
            return
    }

    public java.lang.String f() {
            r0 = this;
            java.lang.String r0 = r0.C
            return r0
    }

    public void f(int r1) {
            r0 = this;
            r0.M = r1
            return
    }

    public void f(java.lang.String r1) {
            r0 = this;
            r0.A = r1
            return
    }

    public java.lang.String g() {
            r0 = this;
            com.baidu.location.a r0 = r0.z
            java.lang.String r0 = r0.e
            return r0
    }

    public void g(int r1) {
            r0 = this;
            r0.n = r1
            return
    }

    public void g(java.lang.String r1) {
            r0 = this;
            r0.m0 = r1
            return
    }

    public java.lang.String h() {
            r0 = this;
            java.lang.String r0 = r0.s
            return r0
    }

    public void h(int r2) {
            r1 = this;
            r1.f1355b = r2
            r0 = 66
            if (r2 == r0) goto L4e
            r0 = 67
            if (r2 == r0) goto L4b
            r0 = 167(0xa7, float:2.34E-43)
            if (r2 == r0) goto L48
            r0 = 505(0x1f9, float:7.08E-43)
            if (r2 == r0) goto L45
            switch(r2) {
                case 61: goto L36;
                case 62: goto L30;
                case 63: goto L4b;
                default: goto L15;
            }
        L15:
            switch(r2) {
                case 69: goto L2d;
                case 70: goto L2a;
                case 71: goto L27;
                default: goto L18;
            }
        L18:
            switch(r2) {
                case 160: goto L24;
                case 161: goto L21;
                case 162: goto L1e;
                default: goto L1b;
            }
        L1b:
            java.lang.String r2 = "UnKnown!"
            goto L32
        L1e:
            java.lang.String r2 = "NetWork location failed because baidu location service can not decrypt the request query, please check the so file !"
            goto L32
        L21:
            java.lang.String r2 = "NetWork location successful!"
            goto L32
        L24:
            java.lang.String r2 = "Coarse location successful"
            goto L32
        L27:
            java.lang.String r2 = "Location failed because the location service switch is not on and the location permission is not enabled"
            goto L32
        L2a:
            java.lang.String r2 = "Location failed because the location permission is not enabled"
            goto L32
        L2d:
            java.lang.String r2 = "Location failed because the location service switch is not on"
            goto L32
        L30:
            java.lang.String r2 = "Location failed beacuse we can not get any loc information!"
        L32:
            r1.i(r2)
            goto L51
        L36:
            java.lang.String r2 = "GPS location successful!"
            r1.i(r2)
            r2 = 0
            r1.n(r2)
            java.lang.String r2 = "system"
            r1.g(r2)
            goto L51
        L45:
            java.lang.String r2 = "NetWork location failed because baidu location service check the key is unlegal, please check the key in AndroidManifest.xml !"
            goto L32
        L48:
            java.lang.String r2 = "NetWork location failed because baidu location service can not caculate the location!"
            goto L32
        L4b:
            java.lang.String r2 = "Offline location failed, please check the net (wifi/cell)!"
            goto L32
        L4e:
            java.lang.String r2 = "Offline location successful!"
            goto L32
        L51:
            return
    }

    public void h(java.lang.String r1) {
            r0 = this;
            r0.Q = r1
            return
    }

    public float i() {
            r0 = this;
            float r0 = r0.r
            return r0
    }

    public void i(int r1) {
            r0 = this;
            r0.G = r1
            return
    }

    public void i(java.lang.String r1) {
            r0 = this;
            r0.T = r1
            return
    }

    public android.os.Bundle j() {
            r0 = this;
            android.os.Bundle r0 = r0.l0
            return r0
    }

    @java.lang.Deprecated
    public void j(int r1) {
            r0 = this;
            r0.j0 = r1
            return
    }

    public void j(java.lang.String r1) {
            r0 = this;
            r0.v = r1
            return
    }

    public java.lang.String k() {
            r0 = this;
            java.lang.String r0 = r0.A
            return r0
    }

    @java.lang.Deprecated
    public void k(int r1) {
            r0 = this;
            r0.i0 = r1
            return
    }

    public void k(java.lang.String r1) {
            r0 = this;
            r0.U = r1
            return
    }

    @java.lang.Deprecated
    public float l() {
            r0 = this;
            float r0 = r0.g0
            return r0
    }

    public void l(int r1) {
            r0 = this;
            r0.F = r1
            return
    }

    public void l(java.lang.String r1) {
            r0 = this;
            r0.H = r1
            return
    }

    public int m() {
            r0 = this;
            int r0 = r0.R
            return r0
    }

    public void m(int r1) {
            r0 = this;
            r0.q = r1
            return
    }

    public void m(java.lang.String r1) {
            r0 = this;
            r0.a0 = r1
            return
    }

    public java.lang.String n() {
            r0 = this;
            java.lang.String r0 = r0.P
            return r0
    }

    public void n(int r1) {
            r0 = this;
            r0.K = r1
            return
    }

    public void n(java.lang.String r1) {
            r0 = this;
            r0.f1356c = r1
            java.lang.String r1 = a.a.a.i.i.b(r1)
            r0.k(r1)
            return
    }

    public java.lang.String o() {
            r0 = this;
            java.lang.String r0 = r0.O
            return r0
    }

    public void o(java.lang.String r1) {
            r0 = this;
            r0.l = r1
            return
    }

    public java.lang.String p() {
            r0 = this;
            java.lang.String r0 = r0.Q
            return r0
    }

    public double q() {
            r2 = this;
            double r0 = r2.d
            return r0
    }

    public int r() {
            r0 = this;
            int r0 = r0.f1355b
            return r0
    }

    public java.lang.String s() {
            r0 = this;
            java.lang.String r0 = r0.v
            return r0
    }

    public double t() {
            r2 = this;
            double r0 = r2.e
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "&loctype="
            r0.append(r1)
            int r1 = r3.r()
            r0.append(r1)
            java.lang.String r1 = "&lat="
            r0.append(r1)
            double r1 = r3.q()
            r0.append(r1)
            java.lang.String r1 = "&lon="
            r0.append(r1)
            double r1 = r3.t()
            r0.append(r1)
            java.lang.String r1 = "&radius="
            r0.append(r1)
            float r1 = r3.z()
            r0.append(r1)
            java.lang.String r1 = "&biasprob="
            r0.append(r1)
            float r1 = r3.l()
            r0.append(r1)
            java.lang.String r1 = "&altitude="
            r0.append(r1)
            double r1 = r3.d()
            r0.append(r1)
            java.lang.String r1 = "&speed="
            r0.append(r1)
            float r1 = r3.B()
            r0.append(r1)
            java.lang.String r1 = "&time="
            r0.append(r1)
            long r1 = r3.D()
            r0.append(r1)
            java.lang.String r1 = "&extrainfo="
            r0.append(r1)
            android.os.Bundle r3 = r3.j()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    @java.lang.Deprecated
    public int u() {
            r0 = this;
            int r0 = r0.i0
            return r0
    }

    public java.lang.String v() {
            r0 = this;
            java.lang.String r0 = r0.H
            return r0
    }

    public java.lang.String w() {
            r0 = this;
            java.lang.String r0 = r0.a0
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r0 = r3.f1355b
            r4.writeInt(r0)
            java.lang.String r0 = r3.f1356c
            r4.writeString(r0)
            long r0 = r3.n0
            r4.writeLong(r0)
            double r0 = r3.d
            r4.writeDouble(r0)
            double r0 = r3.e
            r4.writeDouble(r0)
            double r0 = r3.g
            r4.writeDouble(r0)
            float r0 = r3.i
            r4.writeFloat(r0)
            float r0 = r3.k
            r4.writeFloat(r0)
            java.lang.String r0 = r3.l
            r4.writeString(r0)
            float r0 = r3.m
            r4.writeFloat(r0)
            int r0 = r3.n
            r4.writeInt(r0)
            float r0 = r3.o
            r4.writeFloat(r0)
            int r0 = r3.q
            r4.writeInt(r0)
            float r0 = r3.r
            r4.writeFloat(r0)
            java.lang.String r0 = r3.A
            r4.writeString(r0)
            int r0 = r3.F
            r4.writeInt(r0)
            java.lang.String r0 = r3.B
            r4.writeString(r0)
            java.lang.String r0 = r3.C
            r4.writeString(r0)
            double r0 = r3.D
            r4.writeDouble(r0)
            java.lang.String r0 = r3.H
            r4.writeString(r0)
            com.baidu.location.a r0 = r3.z
            java.lang.String r0 = r0.f1351c
            r4.writeString(r0)
            com.baidu.location.a r0 = r3.z
            java.lang.String r0 = r0.d
            r4.writeString(r0)
            com.baidu.location.a r0 = r3.z
            java.lang.String r0 = r0.f
            r4.writeString(r0)
            com.baidu.location.a r0 = r3.z
            java.lang.String r0 = r0.g
            r4.writeString(r0)
            com.baidu.location.a r0 = r3.z
            java.lang.String r0 = r0.h
            r4.writeString(r0)
            com.baidu.location.a r0 = r3.z
            java.lang.String r0 = r0.e
            r4.writeString(r0)
            com.baidu.location.a r0 = r3.z
            java.lang.String r0 = r0.i
            r4.writeString(r0)
            com.baidu.location.a r0 = r3.z
            java.lang.String r0 = r0.f1349a
            r4.writeString(r0)
            com.baidu.location.a r0 = r3.z
            java.lang.String r0 = r0.f1350b
            r4.writeString(r0)
            com.baidu.location.a r0 = r3.z
            java.lang.String r0 = r0.j
            r4.writeString(r0)
            com.baidu.location.a r0 = r3.z
            java.lang.String r0 = r0.k
            r4.writeString(r0)
            int r0 = r3.I
            r4.writeInt(r0)
            java.lang.String r0 = r3.J
            r4.writeString(r0)
            java.lang.String r0 = r3.v
            r4.writeString(r0)
            java.lang.String r0 = r3.w
            r4.writeString(r0)
            java.lang.String r0 = r3.x
            r4.writeString(r0)
            int r0 = r3.G
            r4.writeInt(r0)
            java.lang.String r0 = r3.T
            r4.writeString(r0)
            int r0 = r3.K
            r4.writeInt(r0)
            int r0 = r3.L
            r4.writeInt(r0)
            int r0 = r3.M
            r4.writeInt(r0)
            int r0 = r3.N
            r4.writeInt(r0)
            java.lang.String r0 = r3.O
            r4.writeString(r0)
            java.lang.String r0 = r3.P
            r4.writeString(r0)
            java.lang.String r0 = r3.Q
            r4.writeString(r0)
            int r0 = r3.R
            r4.writeInt(r0)
            int r0 = r3.X
            r4.writeInt(r0)
            java.lang.String r0 = r3.U
            r4.writeString(r0)
            int r0 = r3.Y
            r4.writeInt(r0)
            java.lang.String r0 = r3.V
            r4.writeString(r0)
            java.lang.String r0 = r3.a0
            r4.writeString(r0)
            java.lang.String r0 = r3.b0
            r4.writeString(r0)
            long r0 = r3.Z
            r4.writeLong(r0)
            double r0 = r3.c0
            r4.writeDouble(r0)
            double r0 = r3.d0
            r4.writeDouble(r0)
            float r0 = r3.g0
            r4.writeFloat(r0)
            double r0 = r3.h0
            r4.writeDouble(r0)
            int r0 = r3.i0
            r4.writeInt(r0)
            int r0 = r3.j0
            r4.writeInt(r0)
            java.lang.String r0 = r3.s
            r4.writeString(r0)
            java.lang.String r0 = r3.m0
            r4.writeString(r0)
            com.baidu.location.c r0 = r3.k0
            r4.writeParcelable(r0, r5)
            r0 = 8
            boolean[] r0 = new boolean[r0]
            boolean r1 = r3.f
            r2 = 0
            r0[r2] = r1
            boolean r1 = r3.h
            r2 = 1
            r0[r2] = r1
            boolean r1 = r3.j
            r2 = 2
            r0[r2] = r1
            boolean r1 = r3.p
            r2 = 3
            r0[r2] = r1
            boolean r1 = r3.t
            r2 = 4
            r0[r2] = r1
            boolean r1 = r3.y
            r2 = 5
            r0[r2] = r1
            boolean r1 = r3.E
            r2 = 6
            r0[r2] = r1
            boolean r1 = r3.e0
            r2 = 7
            r0[r2] = r1
            r4.writeBooleanArray(r0)
            java.util.List<com.baidu.location.j> r0 = r3.S
            r4.writeList(r0)
            android.os.Bundle r0 = r3.W
            r4.writeBundle(r0)
            android.os.Bundle r0 = r3.l0
            r4.writeBundle(r0)
            com.baidu.location.k r3 = r3.f0
            r4.writeParcelable(r3, r5)
            return
    }

    public java.util.List<com.baidu.location.j> x() {
            r0 = this;
            java.util.List<com.baidu.location.j> r0 = r0.S
            return r0
    }

    public com.baidu.location.k y() {
            r0 = this;
            com.baidu.location.k r0 = r0.f0
            return r0
    }

    public float z() {
            r0 = this;
            float r0 = r0.k
            return r0
    }
}
