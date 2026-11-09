package androidx.versionedparcelable;

/* JADX INFO: loaded from: classes.dex */
public class ParcelImpl implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.versionedparcelable.ParcelImpl> CREATOR = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.versionedparcelable.c f960b;

    static class a implements android.os.Parcelable.Creator<androidx.versionedparcelable.ParcelImpl> {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.versionedparcelable.ParcelImpl createFromParcel(android.os.Parcel r1) {
                r0 = this;
                androidx.versionedparcelable.ParcelImpl r0 = new androidx.versionedparcelable.ParcelImpl
                r0.<init>(r1)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ androidx.versionedparcelable.ParcelImpl createFromParcel(android.os.Parcel r1) {
                r0 = this;
                androidx.versionedparcelable.ParcelImpl r0 = r0.createFromParcel(r1)
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.versionedparcelable.ParcelImpl[] newArray(int r1) {
                r0 = this;
                androidx.versionedparcelable.ParcelImpl[] r0 = new androidx.versionedparcelable.ParcelImpl[r1]
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ androidx.versionedparcelable.ParcelImpl[] newArray(int r1) {
                r0 = this;
                androidx.versionedparcelable.ParcelImpl[] r0 = r0.newArray(r1)
                return r0
        }
    }

    static {
            androidx.versionedparcelable.ParcelImpl$a r0 = new androidx.versionedparcelable.ParcelImpl$a
            r0.<init>()
            androidx.versionedparcelable.ParcelImpl.CREATOR = r0
            return
    }

    protected ParcelImpl(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            androidx.versionedparcelable.b r0 = new androidx.versionedparcelable.b
            r0.<init>(r2)
            androidx.versionedparcelable.c r2 = r0.h()
            r1.f960b = r2
            return
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
            androidx.versionedparcelable.b r2 = new androidx.versionedparcelable.b
            r2.<init>(r1)
            androidx.versionedparcelable.c r0 = r0.f960b
            r2.a(r0)
            return
    }
}
