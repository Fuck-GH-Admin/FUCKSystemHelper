package androidx.versionedparcelable;

/* JADX INFO: loaded from: classes.dex */
class b extends androidx.versionedparcelable.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.util.SparseIntArray f961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.os.Parcel f962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f963c;
    private final int d;
    private final java.lang.String e;
    private int f;
    private int g;

    b(android.os.Parcel r4) {
            r3 = this;
            int r0 = r4.dataPosition()
            int r1 = r4.dataSize()
            java.lang.String r2 = ""
            r3.<init>(r4, r0, r1, r2)
            return
    }

    b(android.os.Parcel r2, int r3, int r4, java.lang.String r5) {
            r1 = this;
            r1.<init>()
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            r1.f961a = r0
            r0 = -1
            r1.f = r0
            r0 = 0
            r1.g = r0
            r1.f962b = r2
            r1.f963c = r3
            r1.d = r4
            r1.g = r3
            r1.e = r5
            return
    }

    private int d(int r4) {
            r3 = this;
        L0:
            int r0 = r3.g
            int r1 = r3.d
            if (r0 >= r1) goto L25
            android.os.Parcel r1 = r3.f962b
            r1.setDataPosition(r0)
            android.os.Parcel r0 = r3.f962b
            int r0 = r0.readInt()
            android.os.Parcel r1 = r3.f962b
            int r1 = r1.readInt()
            int r2 = r3.g
            int r2 = r2 + r0
            r3.g = r2
            if (r1 != r4) goto L0
            android.os.Parcel r3 = r3.f962b
            int r3 = r3.dataPosition()
            return r3
        L25:
            r3 = -1
            return r3
    }

    @Override // androidx.versionedparcelable.a
    public void a() {
            r4 = this;
            int r0 = r4.f
            if (r0 < 0) goto L21
            android.util.SparseIntArray r1 = r4.f961a
            int r0 = r1.get(r0)
            android.os.Parcel r1 = r4.f962b
            int r1 = r1.dataPosition()
            int r2 = r1 - r0
            android.os.Parcel r3 = r4.f962b
            r3.setDataPosition(r0)
            android.os.Parcel r0 = r4.f962b
            r0.writeInt(r2)
            android.os.Parcel r4 = r4.f962b
            r4.setDataPosition(r1)
        L21:
            return
    }

    @Override // androidx.versionedparcelable.a
    public void a(android.os.Parcelable r2) {
            r1 = this;
            android.os.Parcel r1 = r1.f962b
            r0 = 0
            r1.writeParcelable(r2, r0)
            return
    }

    @Override // androidx.versionedparcelable.a
    public void a(java.lang.String r1) {
            r0 = this;
            android.os.Parcel r0 = r0.f962b
            r0.writeString(r1)
            return
    }

    @Override // androidx.versionedparcelable.a
    public void a(byte[] r3) {
            r2 = this;
            if (r3 == 0) goto Le
            android.os.Parcel r0 = r2.f962b
            int r1 = r3.length
            r0.writeInt(r1)
            android.os.Parcel r2 = r2.f962b
            r2.writeByteArray(r3)
            goto L14
        Le:
            android.os.Parcel r2 = r2.f962b
            r3 = -1
            r2.writeInt(r3)
        L14:
            return
    }

    @Override // androidx.versionedparcelable.a
    public boolean a(int r2) {
            r1 = this;
            int r2 = r1.d(r2)
            r0 = -1
            if (r2 != r0) goto L9
            r1 = 0
            return r1
        L9:
            android.os.Parcel r1 = r1.f962b
            r1.setDataPosition(r2)
            r1 = 1
            return r1
    }

    @Override // androidx.versionedparcelable.a
    protected androidx.versionedparcelable.a b() {
            r5 = this;
            androidx.versionedparcelable.b r0 = new androidx.versionedparcelable.b
            android.os.Parcel r1 = r5.f962b
            int r2 = r1.dataPosition()
            int r3 = r5.g
            int r4 = r5.f963c
            if (r3 != r4) goto L10
            int r3 = r5.d
        L10:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r5.e
            r4.append(r5)
            java.lang.String r5 = "  "
            r4.append(r5)
            java.lang.String r5 = r4.toString()
            r0.<init>(r1, r2, r3, r5)
            return r0
    }

    @Override // androidx.versionedparcelable.a
    public void b(int r3) {
            r2 = this;
            r2.a()
            r2.f = r3
            android.util.SparseIntArray r0 = r2.f961a
            android.os.Parcel r1 = r2.f962b
            int r1 = r1.dataPosition()
            r0.put(r3, r1)
            r0 = 0
            r2.c(r0)
            r2.c(r3)
            return
    }

    @Override // androidx.versionedparcelable.a
    public void c(int r1) {
            r0 = this;
            android.os.Parcel r0 = r0.f962b
            r0.writeInt(r1)
            return
    }

    @Override // androidx.versionedparcelable.a
    public byte[] d() {
            r1 = this;
            android.os.Parcel r0 = r1.f962b
            int r0 = r0.readInt()
            if (r0 >= 0) goto La
            r1 = 0
            return r1
        La:
            byte[] r0 = new byte[r0]
            android.os.Parcel r1 = r1.f962b
            r1.readByteArray(r0)
            return r0
    }

    @Override // androidx.versionedparcelable.a
    public int e() {
            r0 = this;
            android.os.Parcel r0 = r0.f962b
            int r0 = r0.readInt()
            return r0
    }

    @Override // androidx.versionedparcelable.a
    public <T extends android.os.Parcelable> T f() {
            r1 = this;
            android.os.Parcel r1 = r1.f962b
            java.lang.Class<androidx.versionedparcelable.b> r0 = androidx.versionedparcelable.b.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r1 = r1.readParcelable(r0)
            return r1
    }

    @Override // androidx.versionedparcelable.a
    public java.lang.String g() {
            r0 = this;
            android.os.Parcel r0 = r0.f962b
            java.lang.String r0 = r0.readString()
            return r0
    }
}
