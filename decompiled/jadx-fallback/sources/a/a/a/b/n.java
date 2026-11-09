package a.a.a.b;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f52a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.String[] f53b;

    public static /* synthetic */ class a {
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static a.a.a.b.n f54a;

        static {
                a.a.a.b.n r0 = new a.a.a.b.n
                r1 = 0
                r0.<init>(r1)
                a.a.a.b.n.b.f54a = r0
                return
        }

        public static /* synthetic */ a.a.a.b.n a() {
                a.a.a.b.n r0 = a.a.a.b.n.b.f54a
                return r0
        }
    }

    public n() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f52a = r0
            r0 = 0
            r2.f53b = r0
            java.lang.String r0 = com.baidu.location.Jni.a()     // Catch: java.lang.Exception -> L29
            if (r0 == 0) goto L2d
            java.lang.String r1 = "|"
            boolean r1 = r0.contains(r1)     // Catch: java.lang.Exception -> L29
            if (r1 == 0) goto L2d
            java.lang.String r1 = "\\|"
            java.lang.String[] r0 = r0.split(r1)     // Catch: java.lang.Exception -> L29
            r2.f53b = r0     // Catch: java.lang.Exception -> L29
            if (r0 == 0) goto L2d
            int r0 = r0.length     // Catch: java.lang.Exception -> L29
            r1 = 2
            if (r0 != r1) goto L2d
            r0 = 1
            r2.f52a = r0     // Catch: java.lang.Exception -> L29
            goto L2d
        L29:
            r2 = move-exception
            r2.printStackTrace()
        L2d:
            return
    }

    public /* synthetic */ n(a.a.a.b.n.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static a.a.a.b.n b() {
            a.a.a.b.n r0 = a.a.a.b.n.b.a()
            return r0
    }

    public synchronized java.lang.String a(java.lang.String r7) {
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f52a     // Catch: java.lang.Throwable -> L4b
            r1 = 0
            if (r0 != 0) goto L8
            monitor-exit(r6)
            return r1
        L8:
            javax.crypto.spec.IvParameterSpec r0 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L4b
            java.lang.String[] r2 = r6.f53b     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L4b
            r3 = 1
            r2 = r2[r3]     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L4b
            java.lang.String r3 = "UTF-8"
            byte[] r2 = r2.getBytes(r3)     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L4b
            r0.<init>(r2)     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L4b
            javax.crypto.spec.SecretKeySpec r2 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L4b
            java.lang.String[] r3 = r6.f53b     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L4b
            r4 = 0
            r3 = r3[r4]     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L4b
            java.lang.String r5 = "UTF-8"
            byte[] r3 = r3.getBytes(r5)     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L4b
            java.lang.String r5 = "AES"
            r2.<init>(r3, r5)     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L4b
            java.lang.String r3 = "AES/CBC/PKCS5PADDING"
            javax.crypto.Cipher r3 = javax.crypto.Cipher.getInstance(r3)     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L4b
            r5 = 2
            r3.init(r5, r2, r0)     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L4b
            byte[] r7 = android.util.Base64.decode(r7, r4)     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L4b
            byte[] r7 = r3.doFinal(r7)     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L4b
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L4b
            java.lang.String r2 = "UTF-8"
            r0.<init>(r7, r2)     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L4b
            monitor-exit(r6)
            return r0
        L45:
            r7 = move-exception
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r6)
            return r1
        L4b:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }

    public boolean a() {
            r0 = this;
            boolean r0 = r0.f52a
            return r0
    }

    public synchronized java.lang.String b(java.lang.String r7) {
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f52a     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L42
            javax.crypto.spec.IvParameterSpec r0 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L45
            java.lang.String[] r1 = r6.f53b     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L45
            r2 = 1
            r1 = r1[r2]     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L45
            java.lang.String r3 = "UTF-8"
            byte[] r1 = r1.getBytes(r3)     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L45
            r0.<init>(r1)     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L45
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L45
            java.lang.String[] r3 = r6.f53b     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L45
            r4 = 0
            r3 = r3[r4]     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L45
            java.lang.String r5 = "UTF-8"
            byte[] r3 = r3.getBytes(r5)     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L45
            java.lang.String r5 = "AES"
            r1.<init>(r3, r5)     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L45
            java.lang.String r3 = "AES/CBC/PKCS5PADDING"
            javax.crypto.Cipher r3 = javax.crypto.Cipher.getInstance(r3)     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L45
            r3.init(r2, r1, r0)     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L45
            byte[] r7 = r7.getBytes()     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L45
            byte[] r7 = r3.doFinal(r7)     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L45
            java.lang.String r7 = android.util.Base64.encodeToString(r7, r4)     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L45
            monitor-exit(r6)
            return r7
        L3e:
            r7 = move-exception
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L45
        L42:
            r7 = 0
            monitor-exit(r6)
            return r7
        L45:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }
}
