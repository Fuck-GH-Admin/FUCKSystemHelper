package android.support.v4.graphics.drawable;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends androidx.versionedparcelable.CustomVersionedParcelable {
    static final android.graphics.PorterDuff.Mode j = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    java.lang.Object f625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f626c;
    public android.os.Parcelable d;
    public int e;
    public int f;
    public android.content.res.ColorStateList g;
    android.graphics.PorterDuff.Mode h;
    public java.lang.String i;

    static {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            android.support.v4.graphics.drawable.IconCompat.j = r0
            return
    }

    public IconCompat() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.g = r0
            android.graphics.PorterDuff$Mode r0 = android.support.v4.graphics.drawable.IconCompat.j
            r1.h = r0
            return
    }

    private static int a(android.graphics.drawable.Icon r6) {
            java.lang.String r0 = "Unable to get icon resource"
            java.lang.String r1 = "IconCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r2 < r3) goto Lf
            int r6 = r6.getResId()
            return r6
        Lf:
            r2 = 0
            java.lang.Class r3 = r6.getClass()     // Catch: java.lang.NoSuchMethodException -> L29 java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L33
            java.lang.String r4 = "getResId"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L29 java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L33
            java.lang.reflect.Method r3 = r3.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L29 java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L33
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch: java.lang.NoSuchMethodException -> L29 java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L33
            java.lang.Object r6 = r3.invoke(r6, r4)     // Catch: java.lang.NoSuchMethodException -> L29 java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L33
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.NoSuchMethodException -> L29 java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L33
            int r6 = r6.intValue()     // Catch: java.lang.NoSuchMethodException -> L29 java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L33
            return r6
        L29:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
            return r2
        L2e:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
            return r2
        L33:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
            return r2
    }

    private static java.lang.String a(int r1) {
            r0 = 1
            if (r1 == r0) goto L1e
            r0 = 2
            if (r1 == r0) goto L1b
            r0 = 3
            if (r1 == r0) goto L18
            r0 = 4
            if (r1 == r0) goto L15
            r0 = 5
            if (r1 == r0) goto L12
            java.lang.String r1 = "UNKNOWN"
            return r1
        L12:
            java.lang.String r1 = "BITMAP_MASKABLE"
            return r1
        L15:
            java.lang.String r1 = "URI"
            return r1
        L18:
            java.lang.String r1 = "DATA"
            return r1
        L1b:
            java.lang.String r1 = "RESOURCE"
            return r1
        L1e:
            java.lang.String r1 = "BITMAP"
            return r1
    }

    private static java.lang.String b(android.graphics.drawable.Icon r7) {
            java.lang.String r0 = "Unable to get icon package"
            java.lang.String r1 = "IconCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r2 < r3) goto Lf
            java.lang.String r7 = r7.getResPackage()
            return r7
        Lf:
            r2 = 0
            java.lang.Class r3 = r7.getClass()     // Catch: java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L30
            java.lang.String r4 = "getResPackage"
            r5 = 0
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L30
            java.lang.reflect.Method r3 = r3.getMethod(r4, r6)     // Catch: java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L30
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch: java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L30
            java.lang.Object r7 = r3.invoke(r7, r4)     // Catch: java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L30
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L30
            return r7
        L26:
            r7 = move-exception
            android.util.Log.e(r1, r0, r7)
            return r2
        L2b:
            r7 = move-exception
            android.util.Log.e(r1, r0, r7)
            return r2
        L30:
            r7 = move-exception
            android.util.Log.e(r1, r0, r7)
            return r2
    }

    public int a() {
            r3 = this;
            int r0 = r3.f624a
            r1 = -1
            if (r0 != r1) goto L14
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L14
            java.lang.Object r3 = r3.f625b
            android.graphics.drawable.Icon r3 = (android.graphics.drawable.Icon) r3
            int r3 = a(r3)
            return r3
        L14:
            int r0 = r3.f624a
            r1 = 2
            if (r0 != r1) goto L1c
            int r3 = r3.e
            return r3
        L1c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "called getResId() on "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public void a(boolean r4) {
            r3 = this;
            android.graphics.PorterDuff$Mode r0 = r3.h
            java.lang.String r0 = r0.name()
            r3.i = r0
            int r0 = r3.f624a
            r1 = -1
            if (r0 == r1) goto L5f
            r1 = 1
            if (r0 == r1) goto L46
            r1 = 2
            java.lang.String r2 = "UTF-16"
            if (r0 == r1) goto L37
            r1 = 3
            if (r0 == r1) goto L30
            r1 = 4
            if (r0 == r1) goto L1f
            r1 = 5
            if (r0 == r1) goto L46
            goto L67
        L1f:
            java.lang.Object r4 = r3.f625b
            java.lang.String r4 = r4.toString()
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r2)
            byte[] r4 = r4.getBytes(r0)
            r3.f626c = r4
            goto L67
        L30:
            java.lang.Object r4 = r3.f625b
            byte[] r4 = (byte[]) r4
            r3.f626c = r4
            goto L67
        L37:
            java.lang.Object r4 = r3.f625b
            java.lang.String r4 = (java.lang.String) r4
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r2)
            byte[] r4 = r4.getBytes(r0)
            r3.f626c = r4
            goto L67
        L46:
            if (r4 == 0) goto L61
            java.lang.Object r4 = r3.f625b
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG
            r2 = 90
            r4.compress(r1, r2, r0)
            byte[] r4 = r0.toByteArray()
            r3.f626c = r4
            goto L67
        L5f:
            if (r4 != 0) goto L68
        L61:
            java.lang.Object r4 = r3.f625b
            android.os.Parcelable r4 = (android.os.Parcelable) r4
            r3.d = r4
        L67:
            return
        L68:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Can't serialize Icon created with IconCompat#createFromIcon"
            r3.<init>(r4)
            throw r3
    }

    public java.lang.String b() {
            r3 = this;
            int r0 = r3.f624a
            r1 = -1
            if (r0 != r1) goto L14
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r0 < r2) goto L14
            java.lang.Object r3 = r3.f625b
            android.graphics.drawable.Icon r3 = (android.graphics.drawable.Icon) r3
            java.lang.String r3 = b(r3)
            return r3
        L14:
            int r0 = r3.f624a
            r2 = 2
            if (r0 != r2) goto L27
            java.lang.Object r3 = r3.f625b
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r0 = ":"
            java.lang.String[] r3 = r3.split(r0, r1)
            r0 = 0
            r3 = r3[r0]
            return r3
        L27:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "called getResPackage() on "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public void c() {
            r3 = this;
            java.lang.String r0 = r3.i
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.valueOf(r0)
            r3.h = r0
            int r0 = r3.f624a
            r1 = -1
            if (r0 == r1) goto L44
            r1 = 1
            r2 = 3
            if (r0 == r1) goto L32
            r1 = 2
            if (r0 == r1) goto L22
            if (r0 == r2) goto L1d
            r1 = 4
            if (r0 == r1) goto L22
            r1 = 5
            if (r0 == r1) goto L32
            goto L4a
        L1d:
            byte[] r0 = r3.f626c
            r3.f625b = r0
            goto L4a
        L22:
            java.lang.String r0 = new java.lang.String
            byte[] r1 = r3.f626c
            java.lang.String r2 = "UTF-16"
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r2)
            r0.<init>(r1, r2)
            r3.f625b = r0
            goto L4a
        L32:
            android.os.Parcelable r0 = r3.d
            if (r0 == 0) goto L37
            goto L48
        L37:
            byte[] r0 = r3.f626c
            r3.f625b = r0
            r3.f624a = r2
            r1 = 0
            r3.e = r1
            int r0 = r0.length
            r3.f = r0
            goto L4a
        L44:
            android.os.Parcelable r0 = r3.d
            if (r0 == 0) goto L4b
        L48:
            r3.f625b = r0
        L4a:
            return
        L4b:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid icon"
            r3.<init>(r0)
            throw r3
    }

    public java.lang.String toString() {
            r4 = this;
            int r0 = r4.f624a
            r1 = -1
            if (r0 != r1) goto Lc
            java.lang.Object r4 = r4.f625b
            java.lang.String r4 = java.lang.String.valueOf(r4)
            return r4
        Lc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Icon(typ="
            r0.<init>(r1)
            int r1 = r4.f624a
            java.lang.String r1 = a(r1)
            r0.append(r1)
            int r1 = r4.f624a
            r2 = 1
            if (r1 == r2) goto L77
            r3 = 2
            if (r1 == r3) goto L4f
            r2 = 3
            if (r1 == r2) goto L39
            r2 = 4
            if (r1 == r2) goto L2e
            r2 = 5
            if (r1 == r2) goto L77
            goto L97
        L2e:
            java.lang.String r1 = " uri="
            r0.append(r1)
            java.lang.Object r1 = r4.f625b
            r0.append(r1)
            goto L97
        L39:
            java.lang.String r1 = " len="
            r0.append(r1)
            int r1 = r4.e
            r0.append(r1)
            int r1 = r4.f
            if (r1 == 0) goto L97
            java.lang.String r1 = " off="
            r0.append(r1)
            int r1 = r4.f
            goto L94
        L4f:
            java.lang.String r1 = " pkg="
            r0.append(r1)
            java.lang.String r1 = r4.b()
            r0.append(r1)
            java.lang.String r1 = " id="
            r0.append(r1)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r2 = 0
            int r3 = r4.a()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "0x%08x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.append(r1)
            goto L97
        L77:
            java.lang.String r1 = " size="
            r0.append(r1)
            java.lang.Object r1 = r4.f625b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getWidth()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            java.lang.Object r1 = r4.f625b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getHeight()
        L94:
            r0.append(r1)
        L97:
            android.content.res.ColorStateList r1 = r4.g
            if (r1 == 0) goto La5
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r4.g
            r0.append(r1)
        La5:
            android.graphics.PorterDuff$Mode r1 = r4.h
            android.graphics.PorterDuff$Mode r2 = android.support.v4.graphics.drawable.IconCompat.j
            if (r1 == r2) goto Lb5
            java.lang.String r1 = " mode="
            r0.append(r1)
            android.graphics.PorterDuff$Mode r4 = r4.h
            r0.append(r4)
        Lb5:
            java.lang.String r4 = ")"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }
}
