package androidx.versionedparcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    protected static <T extends androidx.versionedparcelable.c> T a(java.lang.String r5, androidx.versionedparcelable.a r6) {
            java.lang.Class<androidx.versionedparcelable.a> r0 = androidx.versionedparcelable.a.class
            java.lang.ClassLoader r1 = r0.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L22 java.lang.NoSuchMethodException -> L24 java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L28
            r2 = 1
            java.lang.Class r5 = java.lang.Class.forName(r5, r2, r1)     // Catch: java.lang.ClassNotFoundException -> L22 java.lang.NoSuchMethodException -> L24 java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L28
            java.lang.String r1 = "read"
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.ClassNotFoundException -> L22 java.lang.NoSuchMethodException -> L24 java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L28
            r4 = 0
            r3[r4] = r0     // Catch: java.lang.ClassNotFoundException -> L22 java.lang.NoSuchMethodException -> L24 java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L28
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r1, r3)     // Catch: java.lang.ClassNotFoundException -> L22 java.lang.NoSuchMethodException -> L24 java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L28
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.ClassNotFoundException -> L22 java.lang.NoSuchMethodException -> L24 java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L28
            r1[r4] = r6     // Catch: java.lang.ClassNotFoundException -> L22 java.lang.NoSuchMethodException -> L24 java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L28
            java.lang.Object r5 = r5.invoke(r0, r1)     // Catch: java.lang.ClassNotFoundException -> L22 java.lang.NoSuchMethodException -> L24 java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L28
            androidx.versionedparcelable.c r5 = (androidx.versionedparcelable.c) r5     // Catch: java.lang.ClassNotFoundException -> L22 java.lang.NoSuchMethodException -> L24 java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L28
            return r5
        L22:
            r5 = move-exception
            goto L2a
        L24:
            r5 = move-exception
            goto L32
        L26:
            r5 = move-exception
            goto L3a
        L28:
            r5 = move-exception
            goto L51
        L2a:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r0 = "VersionedParcel encountered ClassNotFoundException"
            r6.<init>(r0, r5)
            throw r6
        L32:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r0 = "VersionedParcel encountered NoSuchMethodException"
            r6.<init>(r0, r5)
            throw r6
        L3a:
            java.lang.Throwable r6 = r5.getCause()
            boolean r6 = r6 instanceof java.lang.RuntimeException
            if (r6 == 0) goto L49
            java.lang.Throwable r5 = r5.getCause()
            java.lang.RuntimeException r5 = (java.lang.RuntimeException) r5
            throw r5
        L49:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r0 = "VersionedParcel encountered InvocationTargetException"
            r6.<init>(r0, r5)
            throw r6
        L51:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r0 = "VersionedParcel encountered IllegalAccessException"
            r6.<init>(r0, r5)
            throw r6
    }

    private static java.lang.Class a(java.lang.Class<? extends androidx.versionedparcelable.c> r4) {
            java.lang.Package r0 = r4.getPackage()
            java.lang.String r0 = r0.getName()
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = r4.getSimpleName()
            r3 = 1
            r1[r3] = r0
            java.lang.String r0 = "%s.%sParcelizer"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.lang.ClassLoader r4 = r4.getClassLoader()
            java.lang.Class r4 = java.lang.Class.forName(r0, r2, r4)
            return r4
    }

    protected static <T extends androidx.versionedparcelable.c> void a(T r7, androidx.versionedparcelable.a r8) {
            java.lang.Class r0 = b(r7)     // Catch: java.lang.ClassNotFoundException -> L24 java.lang.NoSuchMethodException -> L2d java.lang.reflect.InvocationTargetException -> L36 java.lang.IllegalAccessException -> L4e
            java.lang.String r1 = "write"
            r2 = 2
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.ClassNotFoundException -> L24 java.lang.NoSuchMethodException -> L2d java.lang.reflect.InvocationTargetException -> L36 java.lang.IllegalAccessException -> L4e
            java.lang.Class r4 = r7.getClass()     // Catch: java.lang.ClassNotFoundException -> L24 java.lang.NoSuchMethodException -> L2d java.lang.reflect.InvocationTargetException -> L36 java.lang.IllegalAccessException -> L4e
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.ClassNotFoundException -> L24 java.lang.NoSuchMethodException -> L2d java.lang.reflect.InvocationTargetException -> L36 java.lang.IllegalAccessException -> L4e
            java.lang.Class<androidx.versionedparcelable.a> r4 = androidx.versionedparcelable.a.class
            r6 = 1
            r3[r6] = r4     // Catch: java.lang.ClassNotFoundException -> L24 java.lang.NoSuchMethodException -> L2d java.lang.reflect.InvocationTargetException -> L36 java.lang.IllegalAccessException -> L4e
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.ClassNotFoundException -> L24 java.lang.NoSuchMethodException -> L2d java.lang.reflect.InvocationTargetException -> L36 java.lang.IllegalAccessException -> L4e
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.ClassNotFoundException -> L24 java.lang.NoSuchMethodException -> L2d java.lang.reflect.InvocationTargetException -> L36 java.lang.IllegalAccessException -> L4e
            r2[r5] = r7     // Catch: java.lang.ClassNotFoundException -> L24 java.lang.NoSuchMethodException -> L2d java.lang.reflect.InvocationTargetException -> L36 java.lang.IllegalAccessException -> L4e
            r2[r6] = r8     // Catch: java.lang.ClassNotFoundException -> L24 java.lang.NoSuchMethodException -> L2d java.lang.reflect.InvocationTargetException -> L36 java.lang.IllegalAccessException -> L4e
            r0.invoke(r1, r2)     // Catch: java.lang.ClassNotFoundException -> L24 java.lang.NoSuchMethodException -> L2d java.lang.reflect.InvocationTargetException -> L36 java.lang.IllegalAccessException -> L4e
            return
        L24:
            r7 = move-exception
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r0 = "VersionedParcel encountered ClassNotFoundException"
            r8.<init>(r0, r7)
            throw r8
        L2d:
            r7 = move-exception
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r0 = "VersionedParcel encountered NoSuchMethodException"
            r8.<init>(r0, r7)
            throw r8
        L36:
            r7 = move-exception
            java.lang.Throwable r8 = r7.getCause()
            boolean r8 = r8 instanceof java.lang.RuntimeException
            if (r8 == 0) goto L46
            java.lang.Throwable r7 = r7.getCause()
            java.lang.RuntimeException r7 = (java.lang.RuntimeException) r7
            throw r7
        L46:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r0 = "VersionedParcel encountered InvocationTargetException"
            r8.<init>(r0, r7)
            throw r8
        L4e:
            r7 = move-exception
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r0 = "VersionedParcel encountered IllegalAccessException"
            r8.<init>(r0, r7)
            throw r8
    }

    private static <T extends androidx.versionedparcelable.c> java.lang.Class b(T r0) {
            java.lang.Class r0 = r0.getClass()
            java.lang.Class r0 = a(r0)
            return r0
    }

    private void c(androidx.versionedparcelable.c r3) {
            r2 = this;
            java.lang.Class r0 = r3.getClass()     // Catch: java.lang.ClassNotFoundException -> L10
            java.lang.Class r3 = a(r0)     // Catch: java.lang.ClassNotFoundException -> L10
            java.lang.String r3 = r3.getName()
            r2.a(r3)
            return
        L10:
            r2 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r1.append(r3)
            java.lang.String r3 = " does not have a Parcelizer"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3, r2)
            throw r0
    }

    public int a(int r1, int r2) {
            r0 = this;
            boolean r2 = r0.a(r2)
            if (r2 != 0) goto L7
            return r1
        L7:
            int r0 = r0.e()
            return r0
    }

    public <T extends android.os.Parcelable> T a(T r1, int r2) {
            r0 = this;
            boolean r2 = r0.a(r2)
            if (r2 != 0) goto L7
            return r1
        L7:
            android.os.Parcelable r0 = r0.f()
            return r0
    }

    public java.lang.String a(java.lang.String r1, int r2) {
            r0 = this;
            boolean r2 = r0.a(r2)
            if (r2 != 0) goto L7
            return r1
        L7:
            java.lang.String r0 = r0.g()
            return r0
    }

    protected abstract void a();

    protected abstract void a(android.os.Parcelable r1);

    protected void a(androidx.versionedparcelable.c r1) {
            r0 = this;
            if (r1 != 0) goto L7
            r1 = 0
            r0.a(r1)
            return
        L7:
            r0.c(r1)
            androidx.versionedparcelable.a r0 = r0.b()
            a(r1, r0)
            r0.a()
            return
    }

    protected abstract void a(java.lang.String r1);

    public void a(boolean r1, boolean r2) {
            r0 = this;
            return
    }

    protected abstract void a(byte[] r1);

    protected abstract boolean a(int r1);

    public byte[] a(byte[] r1, int r2) {
            r0 = this;
            boolean r2 = r0.a(r2)
            if (r2 != 0) goto L7
            return r1
        L7:
            byte[] r0 = r0.d()
            return r0
    }

    protected abstract androidx.versionedparcelable.a b();

    protected abstract void b(int r1);

    public void b(int r1, int r2) {
            r0 = this;
            r0.b(r2)
            r0.c(r1)
            return
    }

    public void b(android.os.Parcelable r1, int r2) {
            r0 = this;
            r0.b(r2)
            r0.a(r1)
            return
    }

    public void b(java.lang.String r1, int r2) {
            r0 = this;
            r0.b(r2)
            r0.a(r1)
            return
    }

    public void b(byte[] r1, int r2) {
            r0 = this;
            r0.b(r2)
            r0.a(r1)
            return
    }

    protected abstract void c(int r1);

    public boolean c() {
            r0 = this;
            r0 = 0
            return r0
    }

    protected abstract byte[] d();

    protected abstract int e();

    protected abstract <T extends android.os.Parcelable> T f();

    protected abstract java.lang.String g();

    protected <T extends androidx.versionedparcelable.c> T h() {
            r1 = this;
            java.lang.String r0 = r1.g()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            androidx.versionedparcelable.a r1 = r1.b()
            androidx.versionedparcelable.c r1 = a(r0, r1)
            return r1
    }
}
