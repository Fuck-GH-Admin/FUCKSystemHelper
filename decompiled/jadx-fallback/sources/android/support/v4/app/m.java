package android.support.v4.app;

/* JADX INFO: loaded from: classes.dex */
final class m implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.app.m> CREATOR = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    android.support.v4.app.n[] f589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int[] f590c;
    android.support.v4.app.d[] d;
    int e;
    int f;

    static class a implements android.os.Parcelable.Creator<android.support.v4.app.m> {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public android.support.v4.app.m createFromParcel(android.os.Parcel r1) {
                r0 = this;
                android.support.v4.app.m r0 = new android.support.v4.app.m
                r0.<init>(r1)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ android.support.v4.app.m createFromParcel(android.os.Parcel r1) {
                r0 = this;
                android.support.v4.app.m r0 = r0.createFromParcel(r1)
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public android.support.v4.app.m[] newArray(int r1) {
                r0 = this;
                android.support.v4.app.m[] r0 = new android.support.v4.app.m[r1]
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ android.support.v4.app.m[] newArray(int r1) {
                r0 = this;
                android.support.v4.app.m[] r0 = r0.newArray(r1)
                return r0
        }
    }

    static {
            android.support.v4.app.m$a r0 = new android.support.v4.app.m$a
            r0.<init>()
            android.support.v4.app.m.CREATOR = r0
            return
    }

    public m() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.e = r0
            return
    }

    public m(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.e = r0
            android.os.Parcelable$Creator<android.support.v4.app.n> r0 = android.support.v4.app.n.CREATOR
            java.lang.Object[] r0 = r2.createTypedArray(r0)
            android.support.v4.app.n[] r0 = (android.support.v4.app.n[]) r0
            r1.f589b = r0
            int[] r0 = r2.createIntArray()
            r1.f590c = r0
            android.os.Parcelable$Creator<android.support.v4.app.d> r0 = android.support.v4.app.d.CREATOR
            java.lang.Object[] r0 = r2.createTypedArray(r0)
            android.support.v4.app.d[] r0 = (android.support.v4.app.d[]) r0
            r1.d = r0
            int r0 = r2.readInt()
            r1.e = r0
            int r2 = r2.readInt()
            r1.f = r2
            return
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
            android.support.v4.app.n[] r0 = r1.f589b
            r2.writeTypedArray(r0, r3)
            int[] r0 = r1.f590c
            r2.writeIntArray(r0)
            android.support.v4.app.d[] r0 = r1.d
            r2.writeTypedArray(r0, r3)
            int r3 = r1.e
            r2.writeInt(r3)
            int r1 = r1.f
            r2.writeInt(r1)
            return
    }
}
