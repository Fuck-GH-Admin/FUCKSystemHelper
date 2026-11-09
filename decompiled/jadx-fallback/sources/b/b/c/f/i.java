package b.b.c.f;

/* JADX INFO: loaded from: classes.dex */
public class i {
    public static int a(java.lang.Object... r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 < r1) goto Lb
            int r2 = java.util.Objects.hash(r2)
            return r2
        Lb:
            int r2 = java.util.Arrays.hashCode(r2)
            return r2
    }
}
