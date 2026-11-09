package b.b.c.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<b.b.c.g.a> CREATOR = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b.b.c.g.a f1099c = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.os.Parcelable f1100b;

    /* JADX INFO: renamed from: b.b.c.g.a$a, reason: collision with other inner class name */
    static class C0047a extends b.b.c.g.a {
        C0047a() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }
    }

    static class b implements android.os.Parcelable.ClassLoaderCreator<b.b.c.g.a> {
        b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public b.b.c.g.a createFromParcel(android.os.Parcel r2) {
                r1 = this;
                r0 = 0
                b.b.c.g.a r1 = r1.createFromParcel(r2, r0)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public b.b.c.g.a createFromParcel(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                android.os.Parcelable r0 = r1.readParcelable(r2)
                if (r0 != 0) goto L9
                b.b.c.g.a r0 = b.b.c.g.a.f1099c
                return r0
            L9:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "superState must be null"
                r0.<init>(r1)
                throw r0
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r1) {
                r0 = this;
                b.b.c.g.a r0 = r0.createFromParcel(r1)
                return r0
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public /* bridge */ /* synthetic */ b.b.c.g.a createFromParcel(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                b.b.c.g.a r0 = r0.createFromParcel(r1, r2)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public b.b.c.g.a[] newArray(int r1) {
                r0 = this;
                b.b.c.g.a[] r0 = new b.b.c.g.a[r1]
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ java.lang.Object[] newArray(int r1) {
                r0 = this;
                b.b.c.g.a[] r0 = r0.newArray(r1)
                return r0
        }
    }

    static {
            b.b.c.g.a$a r0 = new b.b.c.g.a$a
            r0.<init>()
            b.b.c.g.a.f1099c = r0
            b.b.c.g.a$b r0 = new b.b.c.g.a$b
            r0.<init>()
            b.b.c.g.a.CREATOR = r0
            return
    }

    private a() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f1100b = r0
            return
    }

    protected a(android.os.Parcel r1, java.lang.ClassLoader r2) {
            r0 = this;
            r0.<init>()
            android.os.Parcelable r1 = r1.readParcelable(r2)
            if (r1 == 0) goto La
            goto Lc
        La:
            b.b.c.g.a r1 = b.b.c.g.a.f1099c
        Lc:
            r0.f1100b = r1
            return
    }

    protected a(android.os.Parcelable r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto Le
            b.b.c.g.a r0 = b.b.c.g.a.f1099c
            if (r2 == r0) goto La
            goto Lb
        La:
            r2 = 0
        Lb:
            r1.f1100b = r2
            return
        Le:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "superState must not be null"
            r1.<init>(r2)
            throw r1
    }

    /* synthetic */ a(b.b.c.g.a.C0047a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public final android.os.Parcelable a() {
            r0 = this;
            android.os.Parcelable r0 = r0.f1100b
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
            android.os.Parcelable r0 = r0.f1100b
            r1.writeParcelable(r0, r2)
            return
    }
}
