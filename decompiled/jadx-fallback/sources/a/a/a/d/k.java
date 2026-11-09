package a.a.a.d;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.util.Set<a.a.a.d.k.c> f177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public android.hardware.SensorManager f178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f179c;
    public android.hardware.Sensor d;
    public android.hardware.Sensor e;
    public boolean f;
    public float[] g;
    public float[] h;
    public float i;
    public int j;
    public java.lang.String k;
    public long l;
    public android.hardware.SensorEventListener m;

    public class a implements android.hardware.SensorEventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.a.a.d.k f180a;

        public a(a.a.a.d.k r1) {
                r0 = this;
                r0.f180a = r1
                r0.<init>()
                return
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(android.hardware.Sensor r1, int r2) {
                r0 = this;
                return
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(android.hardware.SensorEvent r15) {
                r14 = this;
                android.hardware.Sensor r0 = r15.sensor
                int r0 = r0.getType()
                r1 = 1
                if (r0 == r1) goto L96
                r2 = 11
                if (r0 == r2) goto Lf
                goto L114
            Lf:
                float[] r15 = r15.values
                java.lang.Object r15 = r15.clone()
                float[] r15 = (float[]) r15
                a.a.a.d.k r0 = r14.f180a
                float[] r0 = a.a.a.d.k.e(r0)
                android.hardware.SensorManager.getRotationMatrixFromVector(r0, r15)
                a.a.a.d.k r15 = r14.f180a
                float[] r15 = a.a.a.d.k.e(r15)
                a.a.a.d.k r0 = r14.f180a
                float[] r0 = a.a.a.d.k.f(r0)
                android.hardware.SensorManager.getOrientation(r15, r0)
                r15 = 3
                float[] r15 = new float[r15]
                a.a.a.d.k r0 = r14.f180a
                float[] r0 = a.a.a.d.k.f(r0)
                r2 = 0
                r0 = r0[r2]
                double r3 = (double) r0
                double r3 = java.lang.Math.toDegrees(r3)
                r5 = 0
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                r5 = 2
                if (r0 >= 0) goto L54
                r6 = 4645040803167600640(0x4076800000000000, double:360.0)
                double r3 = r3 + r6
                float r0 = (float) r3
                r3 = 1135869952(0x43b40000, float:360.0)
                float r0 = r0 % r3
                r15[r5] = r0
                goto L57
            L54:
                float r0 = (float) r3
                r15[r5] = r0
            L57:
                a.a.a.d.k r0 = r14.f180a
                r3 = r15[r5]
                a.a.a.d.k.a(r0, r3)
                a.a.a.d.k r0 = r14.f180a
                float[] r0 = a.a.a.d.k.f(r0)
                r0 = r0[r1]
                double r3 = (double) r0
                double r3 = java.lang.Math.toDegrees(r3)
                float r0 = (float) r3
                r15[r2] = r0
                a.a.a.d.k r0 = r14.f180a
                float[] r0 = a.a.a.d.k.f(r0)
                r0 = r0[r5]
                double r2 = (double) r0
                double r2 = java.lang.Math.toDegrees(r2)
                float r0 = (float) r2
                r15[r1] = r0
                a.a.a.d.k r14 = r14.f180a
                boolean r14 = a.a.a.d.k.a(r14)
                if (r14 == 0) goto L114
                boolean r14 = a.a.a.d.m.a.a()
                if (r14 == 0) goto L114
                long r0 = java.lang.System.currentTimeMillis()
                r14 = 5
                a.a.a.d.m.a.a(r14, r15, r0)
                goto L114
            L96:
                float[] r15 = r15.values
                java.lang.Object r15 = r15.clone()
                float[] r15 = (float[]) r15
                a.a.a.d.k r0 = r14.f180a
                long r2 = java.lang.System.currentTimeMillis()
                a.a.a.d.k.a(r0, r2)
                a.a.a.d.k r0 = r14.f180a
                boolean r0 = a.a.a.d.k.a(r0)
                if (r0 == 0) goto L114
                boolean r0 = a.a.a.d.m.a.a()
                if (r0 == 0) goto L114
                long r2 = java.lang.System.currentTimeMillis()
                java.lang.String r15 = a.a.a.d.m.a.a(r1, r15, r2)
                if (r15 == 0) goto L114
                int r0 = r15.length()
                if (r0 <= r1) goto L114
                float r0 = a.a.a.d.m.a.b()
                r1 = 1008981770(0x3c23d70a, float:0.01)
                int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r1 <= 0) goto Ld5
                a.a.a.d.k r1 = r14.f180a
                a.a.a.d.k.b(r1)
            Ld5:
                a.a.a.d.k r1 = r14.f180a     // Catch: java.lang.Throwable -> L110
                java.util.Set r1 = a.a.a.d.k.c(r1)     // Catch: java.lang.Throwable -> L110
                monitor-enter(r1)     // Catch: java.lang.Throwable -> L110
                a.a.a.d.k r2 = r14.f180a     // Catch: java.lang.Throwable -> L10d
                java.util.Set r2 = a.a.a.d.k.c(r2)     // Catch: java.lang.Throwable -> L10d
                java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L10d
            Le6:
                boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L10d
                if (r3 == 0) goto L10b
                java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L10d
                r4 = r3
                a.a.a.d.k$c r4 = (a.a.a.d.k.c) r4     // Catch: java.lang.Throwable -> L10d
                double r5 = (double) r0     // Catch: java.lang.Throwable -> L10d
                a.a.a.d.k r3 = r14.f180a     // Catch: java.lang.Throwable -> L10d
                float r3 = a.a.a.d.k.d(r3)     // Catch: java.lang.Throwable -> L10d
                double r7 = (double) r3     // Catch: java.lang.Throwable -> L10d
                a.a.a.d.k r3 = r14.f180a     // Catch: java.lang.Throwable -> L10d
                float r3 = a.a.a.d.k.d(r3)     // Catch: java.lang.Throwable -> L10d
                double r9 = (double) r3     // Catch: java.lang.Throwable -> L10d
                long r11 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L10d
                r13 = r15
                r4.a(r5, r7, r9, r11, r13)     // Catch: java.lang.Throwable -> L10d
                goto Le6
            L10b:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L10d
                goto L114
            L10d:
                r14 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L10d
                throw r14     // Catch: java.lang.Throwable -> L110
            L110:
                r14 = move-exception
                r14.printStackTrace()
            L114:
                return
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static a.a.a.d.k f181a;

        static {
                a.a.a.d.k r0 = new a.a.a.d.k
                r0.<init>()
                a.a.a.d.k.b.f181a = r0
                return
        }

        public static /* synthetic */ a.a.a.d.k a() {
                a.a.a.d.k r0 = a.a.a.d.k.b.f181a
                return r0
        }
    }

    public interface c {
        void a(double r1, double r3, double r5, long r7, java.lang.String r9);
    }

    public k() {
            r2 = this;
            r2.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Set r0 = java.util.Collections.synchronizedSet(r0)
            r2.f177a = r0
            r0 = 1
            r2.f = r0
            r1 = 3
            float[] r1 = new float[r1]
            r2.g = r1
            r1 = 9
            float[] r1 = new float[r1]
            r2.h = r1
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.i = r1
            r1 = 0
            r2.j = r1
            r1 = 0
            r2.k = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            a.a.a.d.k$a r1 = new a.a.a.d.k$a
            r1.<init>(r2)
            r2.m = r1
            android.content.Context r1 = com.baidu.location.f.c()
            r2.a(r1, r0)
            return
    }

    public static /* synthetic */ float a(a.a.a.d.k r0, float r1) {
            r0.i = r1
            return r1
    }

    public static /* synthetic */ long a(a.a.a.d.k r0, long r1) {
            r0.l = r1
            return r1
    }

    public static /* synthetic */ boolean a(a.a.a.d.k r0) {
            boolean r0 = r0.f
            return r0
    }

    public static /* synthetic */ int b(a.a.a.d.k r2) {
            int r0 = r2.j
            int r1 = r0 + 1
            r2.j = r1
            return r0
    }

    public static /* synthetic */ java.util.Set c(a.a.a.d.k r0) {
            java.util.Set<a.a.a.d.k$c> r0 = r0.f177a
            return r0
    }

    public static /* synthetic */ float d(a.a.a.d.k r0) {
            float r0 = r0.i
            return r0
    }

    public static a.a.a.d.k e() {
            a.a.a.d.k r0 = a.a.a.d.k.b.a()
            return r0
    }

    public static /* synthetic */ float[] e(a.a.a.d.k r0) {
            float[] r0 = r0.h
            return r0
    }

    public static /* synthetic */ float[] f(a.a.a.d.k r0) {
            float[] r0 = r0.g
            return r0
    }

    public double a() {
            r2 = this;
            float r2 = r2.i
            double r0 = (double) r2
            return r0
    }

    public void a(a.a.a.d.k.c r6) {
            r5 = this;
            java.util.Set<a.a.a.d.k$c> r0 = r5.f177a
            monitor-enter(r0)
            java.util.Set<a.a.a.d.k$c> r1 = r5.f177a     // Catch: java.lang.Throwable -> L45
            boolean r1 = r1.contains(r6)     // Catch: java.lang.Throwable -> L45
            if (r1 != 0) goto L10
            java.util.Set<a.a.a.d.k$c> r1 = r5.f177a     // Catch: java.lang.Throwable -> L45
            r1.add(r6)     // Catch: java.lang.Throwable -> L45
        L10:
            java.util.Set<a.a.a.d.k$c> r6 = r5.f177a     // Catch: java.lang.Throwable -> L45
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L45
            r1 = 1
            if (r6 != r1) goto L43
            android.hardware.Sensor r6 = r5.d     // Catch: java.lang.Throwable -> L45
            r1 = 0
            if (r6 == 0) goto L33
            android.hardware.SensorManager r2 = r5.f178b     // Catch: java.lang.Exception -> L28 java.lang.Throwable -> L45
            android.hardware.SensorEventListener r3 = r5.m     // Catch: java.lang.Exception -> L28 java.lang.Throwable -> L45
            int r4 = r5.f179c     // Catch: java.lang.Exception -> L28 java.lang.Throwable -> L45
            r2.registerListener(r3, r6, r4)     // Catch: java.lang.Exception -> L28 java.lang.Throwable -> L45
            goto L2a
        L28:
            r5.f = r1     // Catch: java.lang.Throwable -> L45
        L2a:
            boolean r6 = a.a.a.d.m.a.a()     // Catch: java.lang.Throwable -> L45
            if (r6 == 0) goto L33
            a.a.a.d.m.a.c()     // Catch: java.lang.Throwable -> L45
        L33:
            android.hardware.Sensor r6 = r5.e     // Catch: java.lang.Throwable -> L45
            if (r6 == 0) goto L43
            android.hardware.SensorManager r2 = r5.f178b     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L45
            android.hardware.SensorEventListener r3 = r5.m     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L45
            int r4 = r5.f179c     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L45
            r2.registerListener(r3, r6, r4)     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L45
            goto L43
        L41:
            r5.f = r1     // Catch: java.lang.Throwable -> L45
        L43:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            return
        L45:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            throw r5
    }

    public final void a(android.content.Context r2, int r3) {
            r1 = this;
            java.lang.String r0 = "sensor"
            java.lang.Object r2 = r2.getSystemService(r0)     // Catch: java.lang.Exception -> L20
            android.hardware.SensorManager r2 = (android.hardware.SensorManager) r2     // Catch: java.lang.Exception -> L20
            r1.f178b = r2     // Catch: java.lang.Exception -> L20
            r1.f179c = r3     // Catch: java.lang.Exception -> L20
            r3 = 1
            android.hardware.Sensor r2 = r2.getDefaultSensor(r3)     // Catch: java.lang.Exception -> L20
            r1.d = r2     // Catch: java.lang.Exception -> L20
            android.hardware.SensorManager r2 = r1.f178b     // Catch: java.lang.Exception -> L20
            r3 = 11
            android.hardware.Sensor r2 = r2.getDefaultSensor(r3)     // Catch: java.lang.Exception -> L20
            r1.e = r2     // Catch: java.lang.Exception -> L20
            r1.b()     // Catch: java.lang.Exception -> L20
        L20:
            return
    }

    public final void b() {
            r7 = this;
            android.hardware.SensorManager r0 = r7.f178b     // Catch: java.lang.Exception -> Ld5
            r1 = -1
            java.util.List r0 = r0.getSensorList(r1)     // Catch: java.lang.Exception -> Ld5
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Exception -> Ld5
            r1.<init>()     // Catch: java.lang.Exception -> Ld5
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> Ld5
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> Ld5
            r1.put(r3, r5)     // Catch: java.lang.Exception -> Ld5
            r3 = 10
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> Ld5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> Ld5
            r1.put(r3, r2)     // Catch: java.lang.Exception -> Ld5
            r2 = 9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> Ld5
            r3 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> Ld5
            r1.put(r2, r5)     // Catch: java.lang.Exception -> Ld5
            r2 = 4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> Ld5
            r6 = 3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> Ld5
            r1.put(r5, r6)     // Catch: java.lang.Exception -> Ld5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> Ld5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> Ld5
            r1.put(r3, r2)     // Catch: java.lang.Exception -> Ld5
            r2 = 11
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> Ld5
            r3 = 5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> Ld5
            r1.put(r2, r3)     // Catch: java.lang.Exception -> Ld5
            r2 = 6
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> Ld5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> Ld5
            r1.put(r3, r2)     // Catch: java.lang.Exception -> Ld5
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> Ld5
            r3 = 18
            if (r2 < r3) goto L89
            r2 = 14
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> Ld5
            r3 = 7
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> Ld5
            r1.put(r2, r3)     // Catch: java.lang.Exception -> Ld5
            r2 = 16
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> Ld5
            r3 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> Ld5
            r1.put(r2, r3)     // Catch: java.lang.Exception -> Ld5
        L89:
            int r2 = r1.size()     // Catch: java.lang.Exception -> Ld5
            char[] r3 = new char[r2]     // Catch: java.lang.Exception -> Ld5
        L8f:
            if (r4 >= r2) goto L98
            r5 = 48
            r3[r4] = r5     // Catch: java.lang.Exception -> Ld5
            int r4 = r4 + 1
            goto L8f
        L98:
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> Ld5
        L9c:
            boolean r4 = r0.hasNext()     // Catch: java.lang.Exception -> Ld5
            if (r4 == 0) goto Lcd
            java.lang.Object r4 = r0.next()     // Catch: java.lang.Exception -> Ld5
            android.hardware.Sensor r4 = (android.hardware.Sensor) r4     // Catch: java.lang.Exception -> Ld5
            int r4 = r4.getType()     // Catch: java.lang.Exception -> Ld5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r5 = r1.get(r5)     // Catch: java.lang.Exception -> Ld5
            if (r5 != 0) goto Lb7
            goto L9c
        Lb7:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r4 = r1.get(r4)     // Catch: java.lang.Exception -> Ld5
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Exception -> Ld5
            int r4 = r4.intValue()     // Catch: java.lang.Exception -> Ld5
            if (r4 < r2) goto Lc8
            goto L9c
        Lc8:
            r5 = 49
            r3[r4] = r5     // Catch: java.lang.Exception -> Ld5
            goto L9c
        Lcd:
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Exception -> Ld5
            r0.<init>(r3)     // Catch: java.lang.Exception -> Ld5
            r7.k = r0     // Catch: java.lang.Exception -> Ld5
            goto Ld9
        Ld5:
            r7 = move-exception
            r7.printStackTrace()
        Ld9:
            return
    }

    public void b(a.a.a.d.k.c r3) {
            r2 = this;
            java.util.Set<a.a.a.d.k$c> r0 = r2.f177a
            monitor-enter(r0)
            java.util.Set<a.a.a.d.k$c> r1 = r2.f177a     // Catch: java.lang.Throwable -> L2f
            boolean r1 = r1.contains(r3)     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L10
            java.util.Set<a.a.a.d.k$c> r1 = r2.f177a     // Catch: java.lang.Throwable -> L2f
            r1.remove(r3)     // Catch: java.lang.Throwable -> L2f
        L10:
            java.util.Set<a.a.a.d.k$c> r3 = r2.f177a     // Catch: java.lang.Throwable -> L2f
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L2f
            if (r3 != 0) goto L2d
            android.hardware.SensorManager r3 = r2.f178b     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L2f
            android.hardware.SensorEventListener r2 = r2.m     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L2f
            r3.unregisterListener(r2)     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L2f
            goto L24
        L20:
            r2 = move-exception
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L2f
        L24:
            boolean r2 = a.a.a.d.m.a.a()     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L2d
            a.a.a.d.m.a.d()     // Catch: java.lang.Throwable -> L2f
        L2d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            return
        L2f:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            throw r2
    }

    public java.lang.String c() {
            r0 = this;
            java.lang.String r0 = r0.k
            return r0
    }

    public synchronized int d() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.j     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }
}
