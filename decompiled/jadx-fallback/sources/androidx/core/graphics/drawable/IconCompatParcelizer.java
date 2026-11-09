package androidx.core.graphics.drawable;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    public IconCompatParcelizer() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.support.v4.graphics.drawable.IconCompat read(androidx.versionedparcelable.a r3) {
            android.support.v4.graphics.drawable.IconCompat r0 = new android.support.v4.graphics.drawable.IconCompat
            r0.<init>()
            int r1 = r0.f624a
            r2 = 1
            int r1 = r3.a(r1, r2)
            r0.f624a = r1
            byte[] r1 = r0.f626c
            r2 = 2
            byte[] r1 = r3.a(r1, r2)
            r0.f626c = r1
            android.os.Parcelable r1 = r0.d
            r2 = 3
            android.os.Parcelable r1 = r3.a(r1, r2)
            r0.d = r1
            int r1 = r0.e
            r2 = 4
            int r1 = r3.a(r1, r2)
            r0.e = r1
            int r1 = r0.f
            r2 = 5
            int r1 = r3.a(r1, r2)
            r0.f = r1
            android.content.res.ColorStateList r1 = r0.g
            r2 = 6
            android.os.Parcelable r1 = r3.a(r1, r2)
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            r0.g = r1
            java.lang.String r1 = r0.i
            r2 = 7
            java.lang.String r3 = r3.a(r1, r2)
            r0.i = r3
            r0.c()
            return r0
    }

    public static void write(android.support.v4.graphics.drawable.IconCompat r2, androidx.versionedparcelable.a r3) {
            r0 = 1
            r3.a(r0, r0)
            boolean r1 = r3.c()
            r2.a(r1)
            int r1 = r2.f624a
            r3.b(r1, r0)
            byte[] r0 = r2.f626c
            r1 = 2
            r3.b(r0, r1)
            android.os.Parcelable r0 = r2.d
            r1 = 3
            r3.b(r0, r1)
            int r0 = r2.e
            r1 = 4
            r3.b(r0, r1)
            int r0 = r2.f
            r1 = 5
            r3.b(r0, r1)
            android.content.res.ColorStateList r0 = r2.g
            r1 = 6
            r3.b(r0, r1)
            java.lang.String r2 = r2.i
            r0 = 7
            r3.b(r2, r0)
            return
    }
}
