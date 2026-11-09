package android.support.v4.app;

/* JADX INFO: loaded from: classes.dex */
final class n implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.app.n> CREATOR = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final java.lang.String f591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f592c;
    final boolean d;
    final int e;
    final int f;
    final java.lang.String g;
    final boolean h;
    final boolean i;
    final android.os.Bundle j;
    final boolean k;
    android.os.Bundle l;
    android.support.v4.app.e m;

    static class a implements android.os.Parcelable.Creator<android.support.v4.app.n> {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public android.support.v4.app.n createFromParcel(android.os.Parcel r1) {
                r0 = this;
                android.support.v4.app.n r0 = new android.support.v4.app.n
                r0.<init>(r1)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ android.support.v4.app.n createFromParcel(android.os.Parcel r1) {
                r0 = this;
                android.support.v4.app.n r0 = r0.createFromParcel(r1)
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public android.support.v4.app.n[] newArray(int r1) {
                r0 = this;
                android.support.v4.app.n[] r0 = new android.support.v4.app.n[r1]
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ android.support.v4.app.n[] newArray(int r1) {
                r0 = this;
                android.support.v4.app.n[] r0 = r0.newArray(r1)
                return r0
        }
    }

    static {
            android.support.v4.app.n$a r0 = new android.support.v4.app.n$a
            r0.<init>()
            android.support.v4.app.n.CREATOR = r0
            return
    }

    n(android.os.Parcel r4) {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = r4.readString()
            r3.f591b = r0
            int r0 = r4.readInt()
            r3.f592c = r0
            int r0 = r4.readInt()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L19
            r0 = r1
            goto L1a
        L19:
            r0 = r2
        L1a:
            r3.d = r0
            int r0 = r4.readInt()
            r3.e = r0
            int r0 = r4.readInt()
            r3.f = r0
            java.lang.String r0 = r4.readString()
            r3.g = r0
            int r0 = r4.readInt()
            if (r0 == 0) goto L36
            r0 = r1
            goto L37
        L36:
            r0 = r2
        L37:
            r3.h = r0
            int r0 = r4.readInt()
            if (r0 == 0) goto L41
            r0 = r1
            goto L42
        L41:
            r0 = r2
        L42:
            r3.i = r0
            android.os.Bundle r0 = r4.readBundle()
            r3.j = r0
            int r0 = r4.readInt()
            if (r0 == 0) goto L51
            goto L52
        L51:
            r1 = r2
        L52:
            r3.k = r1
            android.os.Bundle r4 = r4.readBundle()
            r3.l = r4
            return
    }

    n(android.support.v4.app.e r2) {
            r1 = this;
            r1.<init>()
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            r1.f591b = r0
            int r0 = r2.f
            r1.f592c = r0
            boolean r0 = r2.n
            r1.d = r0
            int r0 = r2.y
            r1.e = r0
            int r0 = r2.z
            r1.f = r0
            java.lang.String r0 = r2.A
            r1.g = r0
            boolean r0 = r2.D
            r1.h = r0
            boolean r0 = r2.C
            r1.i = r0
            android.os.Bundle r0 = r2.h
            r1.j = r0
            boolean r2 = r2.B
            r1.k = r2
            return
    }

    public android.support.v4.app.e a(android.support.v4.app.i r4, android.support.v4.app.g r5, android.support.v4.app.e r6, android.support.v4.app.l r7, android.arch.lifecycle.p r8) {
            r3 = this;
            android.support.v4.app.e r0 = r3.m
            if (r0 != 0) goto L81
            android.content.Context r0 = r4.c()
            android.os.Bundle r1 = r3.j
            if (r1 == 0) goto L13
            java.lang.ClassLoader r2 = r0.getClassLoader()
            r1.setClassLoader(r2)
        L13:
            if (r5 == 0) goto L1e
            java.lang.String r1 = r3.f591b
            android.os.Bundle r2 = r3.j
            android.support.v4.app.e r5 = r5.a(r0, r1, r2)
            goto L26
        L1e:
            java.lang.String r5 = r3.f591b
            android.os.Bundle r1 = r3.j
            android.support.v4.app.e r5 = android.support.v4.app.e.a(r0, r5, r1)
        L26:
            r3.m = r5
            android.os.Bundle r5 = r3.l
            if (r5 == 0) goto L39
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r5.setClassLoader(r0)
            android.support.v4.app.e r5 = r3.m
            android.os.Bundle r0 = r3.l
            r5.f545c = r0
        L39:
            android.support.v4.app.e r5 = r3.m
            int r0 = r3.f592c
            r5.a(r0, r6)
            android.support.v4.app.e r5 = r3.m
            boolean r6 = r3.d
            r5.n = r6
            r6 = 1
            r5.p = r6
            int r6 = r3.e
            r5.y = r6
            int r6 = r3.f
            r5.z = r6
            java.lang.String r6 = r3.g
            r5.A = r6
            boolean r6 = r3.h
            r5.D = r6
            boolean r6 = r3.i
            r5.C = r6
            boolean r6 = r3.k
            r5.B = r6
            android.support.v4.app.k r4 = r4.d
            r5.s = r4
            boolean r4 = android.support.v4.app.k.F
            if (r4 == 0) goto L81
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Instantiated fragment "
            r4.append(r5)
            android.support.v4.app.e r5 = r3.m
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "FragmentManager"
            android.util.Log.v(r5, r4)
        L81:
            android.support.v4.app.e r3 = r3.m
            r3.v = r7
            r3.w = r8
            return r3
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.f591b
            r1.writeString(r2)
            int r2 = r0.f592c
            r1.writeInt(r2)
            boolean r2 = r0.d
            r1.writeInt(r2)
            int r2 = r0.e
            r1.writeInt(r2)
            int r2 = r0.f
            r1.writeInt(r2)
            java.lang.String r2 = r0.g
            r1.writeString(r2)
            boolean r2 = r0.h
            r1.writeInt(r2)
            boolean r2 = r0.i
            r1.writeInt(r2)
            android.os.Bundle r2 = r0.j
            r1.writeBundle(r2)
            boolean r2 = r0.k
            r1.writeInt(r2)
            android.os.Bundle r0 = r0.l
            r1.writeBundle(r0)
            return
    }
}
