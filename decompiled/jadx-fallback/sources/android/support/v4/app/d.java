package android.support.v4.app;

/* JADX INFO: loaded from: classes.dex */
final class d implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.app.d> CREATOR = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int[] f542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f543c;
    final int d;
    final java.lang.String e;
    final int f;
    final int g;
    final java.lang.CharSequence h;
    final int i;
    final java.lang.CharSequence j;
    final java.util.ArrayList<java.lang.String> k;
    final java.util.ArrayList<java.lang.String> l;
    final boolean m;

    static class a implements android.os.Parcelable.Creator<android.support.v4.app.d> {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public android.support.v4.app.d createFromParcel(android.os.Parcel r1) {
                r0 = this;
                android.support.v4.app.d r0 = new android.support.v4.app.d
                r0.<init>(r1)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ android.support.v4.app.d createFromParcel(android.os.Parcel r1) {
                r0 = this;
                android.support.v4.app.d r0 = r0.createFromParcel(r1)
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public android.support.v4.app.d[] newArray(int r1) {
                r0 = this;
                android.support.v4.app.d[] r0 = new android.support.v4.app.d[r1]
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ android.support.v4.app.d[] newArray(int r1) {
                r0 = this;
                android.support.v4.app.d[] r0 = r0.newArray(r1)
                return r0
        }
    }

    static {
            android.support.v4.app.d$a r0 = new android.support.v4.app.d$a
            r0.<init>()
            android.support.v4.app.d.CREATOR = r0
            return
    }

    public d(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            int[] r0 = r2.createIntArray()
            r1.f542b = r0
            int r0 = r2.readInt()
            r1.f543c = r0
            int r0 = r2.readInt()
            r1.d = r0
            java.lang.String r0 = r2.readString()
            r1.e = r0
            int r0 = r2.readInt()
            r1.f = r0
            int r0 = r2.readInt()
            r1.g = r0
            android.os.Parcelable$Creator r0 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
            java.lang.Object r0 = r0.createFromParcel(r2)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.h = r0
            int r0 = r2.readInt()
            r1.i = r0
            android.os.Parcelable$Creator r0 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
            java.lang.Object r0 = r0.createFromParcel(r2)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.j = r0
            java.util.ArrayList r0 = r2.createStringArrayList()
            r1.k = r0
            java.util.ArrayList r0 = r2.createStringArrayList()
            r1.l = r0
            int r2 = r2.readInt()
            if (r2 == 0) goto L55
            r2 = 1
            goto L56
        L55:
            r2 = 0
        L56:
            r1.m = r2
            return
    }

    public d(android.support.v4.app.c r8) {
            r7 = this;
            r7.<init>()
            java.util.ArrayList<android.support.v4.app.c$a> r0 = r8.f537b
            int r0 = r0.size()
            int r1 = r0 * 6
            int[] r1 = new int[r1]
            r7.f542b = r1
            boolean r1 = r8.i
            if (r1 == 0) goto L7d
            r1 = 0
            r2 = r1
        L15:
            if (r1 >= r0) goto L50
            java.util.ArrayList<android.support.v4.app.c$a> r3 = r8.f537b
            java.lang.Object r3 = r3.get(r1)
            android.support.v4.app.c$a r3 = (android.support.v4.app.c.a) r3
            int[] r4 = r7.f542b
            int r5 = r2 + 1
            int r6 = r3.f539a
            r4[r2] = r6
            int r2 = r5 + 1
            android.support.v4.app.e r6 = r3.f540b
            if (r6 == 0) goto L30
            int r6 = r6.f
            goto L31
        L30:
            r6 = -1
        L31:
            r4[r5] = r6
            int[] r4 = r7.f542b
            int r5 = r2 + 1
            int r6 = r3.f541c
            r4[r2] = r6
            int r2 = r5 + 1
            int r6 = r3.d
            r4[r5] = r6
            int r5 = r2 + 1
            int r6 = r3.e
            r4[r2] = r6
            int r2 = r5 + 1
            int r3 = r3.f
            r4[r5] = r3
            int r1 = r1 + 1
            goto L15
        L50:
            int r0 = r8.g
            r7.f543c = r0
            int r0 = r8.h
            r7.d = r0
            java.lang.String r0 = r8.j
            r7.e = r0
            int r0 = r8.l
            r7.f = r0
            int r0 = r8.m
            r7.g = r0
            java.lang.CharSequence r0 = r8.n
            r7.h = r0
            int r0 = r8.o
            r7.i = r0
            java.lang.CharSequence r0 = r8.p
            r7.j = r0
            java.util.ArrayList<java.lang.String> r0 = r8.q
            r7.k = r0
            java.util.ArrayList<java.lang.String> r0 = r8.r
            r7.l = r0
            boolean r8 = r8.s
            r7.m = r8
            return
        L7d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Not on back stack"
            r7.<init>(r8)
            throw r7
    }

    public android.support.v4.app.c a(android.support.v4.app.k r10) {
            r9 = this;
            android.support.v4.app.c r0 = new android.support.v4.app.c
            r0.<init>(r10)
            r1 = 0
            r2 = r1
        L7:
            int[] r3 = r9.f542b
            int r3 = r3.length
            if (r1 >= r3) goto L84
            android.support.v4.app.c$a r3 = new android.support.v4.app.c$a
            r3.<init>()
            int[] r4 = r9.f542b
            int r5 = r1 + 1
            r1 = r4[r1]
            r3.f539a = r1
            boolean r1 = android.support.v4.app.k.F
            if (r1 == 0) goto L47
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "Instantiate "
            r1.append(r4)
            r1.append(r0)
            java.lang.String r4 = " op #"
            r1.append(r4)
            r1.append(r2)
            java.lang.String r4 = " base fragment #"
            r1.append(r4)
            int[] r4 = r9.f542b
            r4 = r4[r5]
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r4 = "FragmentManager"
            android.util.Log.v(r4, r1)
        L47:
            int[] r1 = r9.f542b
            int r4 = r5 + 1
            r1 = r1[r5]
            if (r1 < 0) goto L58
            android.util.SparseArray<android.support.v4.app.e> r5 = r10.f
            java.lang.Object r1 = r5.get(r1)
            android.support.v4.app.e r1 = (android.support.v4.app.e) r1
            goto L59
        L58:
            r1 = 0
        L59:
            r3.f540b = r1
            int[] r1 = r9.f542b
            int r5 = r4 + 1
            r4 = r1[r4]
            r3.f541c = r4
            int r6 = r5 + 1
            r5 = r1[r5]
            r3.d = r5
            int r7 = r6 + 1
            r6 = r1[r6]
            r3.e = r6
            int r8 = r7 + 1
            r1 = r1[r7]
            r3.f = r1
            r0.f538c = r4
            r0.d = r5
            r0.e = r6
            r0.f = r1
            r0.a(r3)
            int r2 = r2 + 1
            r1 = r8
            goto L7
        L84:
            int r10 = r9.f543c
            r0.g = r10
            int r10 = r9.d
            r0.h = r10
            java.lang.String r10 = r9.e
            r0.j = r10
            int r10 = r9.f
            r0.l = r10
            r10 = 1
            r0.i = r10
            int r1 = r9.g
            r0.m = r1
            java.lang.CharSequence r1 = r9.h
            r0.n = r1
            int r1 = r9.i
            r0.o = r1
            java.lang.CharSequence r1 = r9.j
            r0.p = r1
            java.util.ArrayList<java.lang.String> r1 = r9.k
            r0.q = r1
            java.util.ArrayList<java.lang.String> r1 = r9.l
            r0.r = r1
            boolean r9 = r9.m
            r0.s = r9
            r0.a(r10)
            return r0
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            int[] r3 = r1.f542b
            r2.writeIntArray(r3)
            int r3 = r1.f543c
            r2.writeInt(r3)
            int r3 = r1.d
            r2.writeInt(r3)
            java.lang.String r3 = r1.e
            r2.writeString(r3)
            int r3 = r1.f
            r2.writeInt(r3)
            int r3 = r1.g
            r2.writeInt(r3)
            java.lang.CharSequence r3 = r1.h
            r0 = 0
            android.text.TextUtils.writeToParcel(r3, r2, r0)
            int r3 = r1.i
            r2.writeInt(r3)
            java.lang.CharSequence r3 = r1.j
            android.text.TextUtils.writeToParcel(r3, r2, r0)
            java.util.ArrayList<java.lang.String> r3 = r1.k
            r2.writeStringList(r3)
            java.util.ArrayList<java.lang.String> r3 = r1.l
            r2.writeStringList(r3)
            boolean r1 = r1.m
            r2.writeInt(r1)
            return
    }
}
