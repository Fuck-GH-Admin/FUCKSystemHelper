package com.baidu.location;

/* JADX INFO: loaded from: classes.dex */
public final class k implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.baidu.location.k> CREATOR = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f1381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f1382c;
    private final java.lang.String d;

    public static class a implements android.os.Parcelable.Creator<com.baidu.location.k> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.baidu.location.k createFromParcel(android.os.Parcel r3) {
                r2 = this;
                java.lang.String r2 = r3.readString()
                java.lang.String r0 = r3.readString()
                java.lang.String r3 = r3.readString()
                com.baidu.location.k r1 = new com.baidu.location.k
                r1.<init>(r0, r2, r3)
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.baidu.location.k createFromParcel(android.os.Parcel r1) {
                r0 = this;
                com.baidu.location.k r0 = r0.createFromParcel(r1)
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.baidu.location.k[] newArray(int r1) {
                r0 = this;
                com.baidu.location.k[] r0 = new com.baidu.location.k[r1]
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.baidu.location.k[] newArray(int r1) {
                r0 = this;
                com.baidu.location.k[] r0 = r0.newArray(r1)
                return r0
        }
    }

    static {
            com.baidu.location.k$a r0 = new com.baidu.location.k$a
            r0.<init>()
            com.baidu.location.k.CREATOR = r0
            return
    }

    public k(com.baidu.location.k r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = r2.b()
            r1.f1382c = r0
            java.lang.String r0 = r2.a()
            r1.f1381b = r0
            java.lang.String r2 = r2.c()
            r1.d = r2
            return
    }

    public k(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.f1382c = r2
            r0.f1381b = r1
            r0.d = r3
            return
    }

    public java.lang.String a() {
            r0 = this;
            java.lang.String r0 = r0.f1381b
            return r0
    }

    public java.lang.String b() {
            r0 = this;
            java.lang.String r0 = r0.f1382c
            return r0
    }

    public java.lang.String c() {
            r0 = this;
            java.lang.String r0 = r0.d
            return r0
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
            java.lang.String r2 = r0.f1382c
            r1.writeString(r2)
            java.lang.String r2 = r0.f1381b
            r1.writeString(r2)
            java.lang.String r0 = r0.d
            r1.writeString(r0)
            return
    }
}
