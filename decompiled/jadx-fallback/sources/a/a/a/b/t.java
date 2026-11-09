package a.a.a.b;

/* JADX INFO: loaded from: classes.dex */
public class t implements android.hardware.SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public android.hardware.SensorManager f78a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f79b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f80c;
    public boolean d;

    public static /* synthetic */ class a {
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a.a.a.b.t f81a = null;

        static {
                a.a.a.b.t r0 = new a.a.a.b.t
                r1 = 0
                r0.<init>(r1)
                a.a.a.b.t.b.f81a = r0
                return
        }

        public static /* synthetic */ a.a.a.b.t a() {
                a.a.a.b.t r0 = a.a.a.b.t.b.f81a
                return r0
        }
    }

    public t() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f80c = r0
            r1.d = r0
            return
    }

    public /* synthetic */ t(a.a.a.b.t.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static a.a.a.b.t e() {
            a.a.a.b.t r0 = a.a.a.b.t.b.a()
            return r0
    }

    public float a() {
            r0 = this;
            float r0 = r0.f79b
            return r0
    }

    public void a(boolean r1) {
            r0 = this;
            return
    }

    public void b(boolean r1) {
            r0 = this;
            r0.f80c = r1
            return
    }

    public boolean b() {
            r0 = this;
            boolean r0 = r0.f80c
            return r0
    }

    public synchronized void c() {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.d     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L7
            monitor-exit(r3)
            return
        L7:
            boolean r0 = r3.f80c     // Catch: java.lang.Throwable -> L3a
            if (r0 != 0) goto Ld
            monitor-exit(r3)
            return
        Ld:
            android.hardware.SensorManager r0 = r3.f78a     // Catch: java.lang.Throwable -> L3a
            if (r0 != 0) goto L1f
            android.content.Context r0 = com.baidu.location.f.c()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r1 = "sensor"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> L3a
            android.hardware.SensorManager r0 = (android.hardware.SensorManager) r0     // Catch: java.lang.Throwable -> L3a
            r3.f78a = r0     // Catch: java.lang.Throwable -> L3a
        L1f:
            android.hardware.SensorManager r0 = r3.f78a     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L35
            r1 = 11
            android.hardware.Sensor r0 = r0.getDefaultSensor(r1)     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L35
            boolean r1 = r3.f80c     // Catch: java.lang.Throwable -> L3a
            if (r1 == 0) goto L35
            android.hardware.SensorManager r1 = r3.f78a     // Catch: java.lang.Throwable -> L3a
            r2 = 3
            r1.registerListener(r3, r0, r2)     // Catch: java.lang.Throwable -> L3a
        L35:
            r0 = 1
            r3.d = r0     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r3)
            return
        L3a:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    public synchronized void d() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.d     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L7
            monitor-exit(r1)
            return
        L7:
            android.hardware.SensorManager r0 = r1.f78a     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L11
            r0.unregisterListener(r1)     // Catch: java.lang.Throwable -> L16
            r0 = 0
            r1.f78a = r0     // Catch: java.lang.Throwable -> L16
        L11:
            r0 = 0
            r1.d = r0     // Catch: java.lang.Throwable -> L16
            monitor-exit(r1)
            return
        L16:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor r1, int r2) {
            r0 = this;
            return
    }

    @Override // android.hardware.SensorEventListener
    @android.annotation.SuppressLint({"NewApi"})
    public void onSensorChanged(android.hardware.SensorEvent r5) {
            r4 = this;
            android.hardware.Sensor r0 = r5.sensor
            int r0 = r0.getType()
            r1 = 11
            if (r0 == r1) goto Lb
            goto L41
        Lb:
            float[] r5 = r5.values
            java.lang.Object r5 = r5.clone()
            float[] r5 = (float[]) r5
            if (r5 == 0) goto L41
            r0 = 9
            float[] r0 = new float[r0]
            r1 = 0
            android.hardware.SensorManager.getRotationMatrixFromVector(r0, r5)     // Catch: java.lang.Exception -> L3f
            r5 = 3
            float[] r5 = new float[r5]     // Catch: java.lang.Exception -> L3f
            android.hardware.SensorManager.getOrientation(r0, r5)     // Catch: java.lang.Exception -> L3f
            r0 = 0
            r5 = r5[r0]     // Catch: java.lang.Exception -> L3f
            double r2 = (double) r5     // Catch: java.lang.Exception -> L3f
            double r2 = java.lang.Math.toDegrees(r2)     // Catch: java.lang.Exception -> L3f
            float r5 = (float) r2     // Catch: java.lang.Exception -> L3f
            r4.f79b = r5     // Catch: java.lang.Exception -> L3f
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L36
        L33:
            r0 = 1135869952(0x43b40000, float:360.0)
            float r5 = r5 + r0
        L36:
            double r2 = (double) r5     // Catch: java.lang.Exception -> L3f
            double r2 = java.lang.Math.floor(r2)     // Catch: java.lang.Exception -> L3f
            float r5 = (float) r2     // Catch: java.lang.Exception -> L3f
            r4.f79b = r5     // Catch: java.lang.Exception -> L3f
            goto L41
        L3f:
            r4.f79b = r1
        L41:
            return
    }
}
