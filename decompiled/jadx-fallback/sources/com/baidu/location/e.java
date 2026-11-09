package com.baidu.location;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f1357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f1358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f1359c;
    public java.lang.String d;
    public double e;
    public double f;
    public int g;
    public boolean h;
    public a.a.a.e.a i;

    public e() {
            r3 = this;
            r3.<init>()
            r0 = 1
            r3.f1357a = r0
            r3.f1358b = r0
            r2 = 0
            r3.f1359c = r2
            r2 = 0
            r3.d = r2
            r3.e = r0
            r3.f = r0
            r0 = 0
            r3.g = r0
            return
    }

    public void a(com.baidu.location.c r1, float r2) {
            r0 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "new location, not far from the destination..."
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "baidu_location_service"
            android.util.Log.d(r1, r0)
            return
    }
}
