package a.a.a.b;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static java.lang.Object f66c;
    public static a.a.a.b.r d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public android.content.SharedPreferences f67a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public android.content.SharedPreferences f68b;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            a.a.a.b.r.f66c = r0
            return
    }

    public r() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f67a = r0
            r1.f68b = r0
            android.content.Context r0 = com.baidu.location.f.c()
            if (r0 == 0) goto L18
            android.content.Context r0 = com.baidu.location.f.c()
            android.content.SharedPreferences r0 = b(r0)
            r1.f67a = r0
        L18:
            return
    }

    public static a.a.a.b.r a() {
            java.lang.Object r0 = a.a.a.b.r.f66c
            monitor-enter(r0)
            a.a.a.b.r r1 = a.a.a.b.r.d     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto Le
            a.a.a.b.r r1 = new a.a.a.b.r     // Catch: java.lang.Throwable -> L12
            r1.<init>()     // Catch: java.lang.Throwable -> L12
            a.a.a.b.r.d = r1     // Catch: java.lang.Throwable -> L12
        Le:
            a.a.a.b.r r1 = a.a.a.b.r.d     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return r1
        L12:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1
    }

    public static android.content.SharedPreferences b(android.content.Context r3) {
            r0 = 0
            if (r3 == 0) goto Lf
            java.lang.String r1 = "MapCoreServicePreIA"
            r2 = 0
            android.content.SharedPreferences r0 = r3.getSharedPreferences(r1, r2)     // Catch: java.lang.Exception -> Lb
            goto Lf
        Lb:
            r3 = move-exception
            r3.printStackTrace()
        Lf:
            return r0
    }

    public synchronized long a(java.lang.String r2, long r3) {
            r1 = this;
            monitor-enter(r1)
            android.content.SharedPreferences r0 = r1.f67a     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto L9
            long r3 = r0.getLong(r2, r3)     // Catch: java.lang.Exception -> L9 java.lang.Throwable -> Lb
        L9:
            monitor-exit(r1)
            return r3
        Lb:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public android.content.SharedPreferences a(android.content.Context r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.f68b
            if (r0 != 0) goto L17
            if (r3 == 0) goto L17
            java.lang.String r0 = "MapCoreServicePregck"
            r1 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r0, r1)     // Catch: java.lang.Exception -> L10
            r2.f68b = r3     // Catch: java.lang.Exception -> L10
            goto L17
        L10:
            r3 = move-exception
            r3.printStackTrace()
            r3 = 0
            r2.f68b = r3
        L17:
            android.content.SharedPreferences r2 = r2.f68b
            return r2
    }

    public synchronized java.lang.String a(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            monitor-enter(r1)
            android.content.SharedPreferences r0 = r1.f67a     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto L9
            java.lang.String r3 = r0.getString(r2, r3)     // Catch: java.lang.Exception -> L9 java.lang.Throwable -> Lb
        L9:
            monitor-exit(r1)
            return r3
        Lb:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public synchronized void b(java.lang.String r2, long r3) {
            r1 = this;
            monitor-enter(r1)
            android.content.SharedPreferences r0 = r1.f67a     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto Lf
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L11
            r0.putLong(r2, r3)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L11
            r0.commit()     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L11
        Lf:
            monitor-exit(r1)
            return
        L11:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public synchronized void b(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            monitor-enter(r1)
            android.content.SharedPreferences r0 = r1.f67a     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto Lf
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L11
            r0.putString(r2, r3)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L11
            r0.commit()     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L11
        Lf:
            monitor-exit(r1)
            return
        L11:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
