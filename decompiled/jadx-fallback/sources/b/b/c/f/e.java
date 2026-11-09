package b.b.c.f;

/* JADX INFO: loaded from: classes.dex */
public class e extends java.io.Writer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f1078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.StringBuilder f1079c;

    public e(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            r2.f1079c = r0
            r2.f1078b = r3
            return
    }

    private void a() {
            r2 = this;
            java.lang.StringBuilder r0 = r2.f1079c
            int r0 = r0.length()
            if (r0 <= 0) goto L1d
            java.lang.String r0 = r2.f1078b
            java.lang.StringBuilder r1 = r2.f1079c
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
            java.lang.StringBuilder r2 = r2.f1079c
            r0 = 0
            int r1 = r2.length()
            r2.delete(r0, r1)
        L1d:
            return
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r0 = this;
            r0.a()
            return
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
            r0 = this;
            r0.a()
            return
    }

    @Override // java.io.Writer
    public void write(char[] r4, int r5, int r6) {
            r3 = this;
            r0 = 0
        L1:
            if (r0 >= r6) goto L17
            int r1 = r5 + r0
            char r1 = r4[r1]
            r2 = 10
            if (r1 != r2) goto Lf
            r3.a()
            goto L14
        Lf:
            java.lang.StringBuilder r2 = r3.f1079c
            r2.append(r1)
        L14:
            int r0 = r0 + 1
            goto L1
        L17:
            return
    }
}
