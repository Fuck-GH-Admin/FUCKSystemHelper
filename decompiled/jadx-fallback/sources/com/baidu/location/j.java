package com.baidu.location;

/* JADX INFO: loaded from: classes.dex */
public final class j implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.baidu.location.j> CREATOR = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f1379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f1380c;
    private final java.lang.String d;
    private final java.lang.String e;
    private final java.lang.String f;

    public static class a implements android.os.Parcelable.Creator<com.baidu.location.j> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.baidu.location.j createFromParcel(android.os.Parcel r8) {
                r7 = this;
                java.lang.String r1 = r8.readString()
                java.lang.String r2 = r8.readString()
                double r3 = r8.readDouble()
                java.lang.String r5 = r8.readString()
                java.lang.String r6 = r8.readString()
                com.baidu.location.j r7 = new com.baidu.location.j
                r0 = r7
                r0.<init>(r1, r2, r3, r5, r6)
                return r7
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.baidu.location.j createFromParcel(android.os.Parcel r1) {
                r0 = this;
                com.baidu.location.j r0 = r0.createFromParcel(r1)
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.baidu.location.j[] newArray(int r1) {
                r0 = this;
                com.baidu.location.j[] r0 = new com.baidu.location.j[r1]
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.baidu.location.j[] newArray(int r1) {
                r0 = this;
                com.baidu.location.j[] r0 = r0.newArray(r1)
                return r0
        }
    }

    static {
            com.baidu.location.j$a r0 = new com.baidu.location.j$a
            r0.<init>()
            com.baidu.location.j.CREATOR = r0
            return
    }

    public j(java.lang.String r1, java.lang.String r2, double r3, java.lang.String r5, java.lang.String r6) {
            r0 = this;
            r0.<init>()
            r0.f1380c = r1
            r0.d = r2
            r0.f1379b = r3
            r0.e = r5
            r0.f = r6
            return
    }

    public java.lang.String a() {
            r0 = this;
            java.lang.String r0 = r0.f
            return r0
    }

    public java.lang.String b() {
            r0 = this;
            java.lang.String r0 = r0.f1380c
            return r0
    }

    public java.lang.String c() {
            r0 = this;
            java.lang.String r0 = r0.d
            return r0
    }

    public double d() {
            r2 = this;
            double r0 = r2.f1379b
            return r0
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r0 = this;
            r0 = 0
            return r0
    }

    public java.lang.String e() {
            r0 = this;
            java.lang.String r0 = r0.e
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            java.lang.String r4 = r2.f1380c
            r3.writeString(r4)
            java.lang.String r4 = r2.d
            r3.writeString(r4)
            double r0 = r2.f1379b
            r3.writeDouble(r0)
            java.lang.String r4 = r2.e
            r3.writeString(r4)
            java.lang.String r2 = r2.f
            r3.writeString(r2)
            return
    }
}
