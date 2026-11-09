package a.a.a.i;

/* JADX INFO: loaded from: classes.dex */
public class b {
    public static java.lang.String f;
    public static java.lang.String g;
    public static java.lang.String h;
    public static java.lang.String i;
    public static java.lang.String j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.String f319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.String f320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.String f321c;
    public java.lang.String d;
    public boolean e;

    public static /* synthetic */ class a {
    }

    /* JADX INFO: renamed from: a.a.a.i.b$b, reason: collision with other inner class name */
    public static class C0020b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a.a.a.i.b f322a = null;

        static {
                a.a.a.i.b r0 = new a.a.a.i.b
                r1 = 0
                r0.<init>(r1)
                a.a.a.i.b.C0020b.f322a = r0
                return
        }
    }

    static {
            return
    }

    public b() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f319a = r0
            r1.f320b = r0
            r1.f321c = r0
            r1.d = r0
            r0 = 0
            r1.e = r0
            android.content.Context r0 = com.baidu.location.f.c()
            if (r0 == 0) goto L1c
            android.content.Context r0 = com.baidu.location.f.c()
            r1.a(r0)
        L1c:
            return
    }

    public /* synthetic */ b(a.a.a.i.b.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static a.a.a.i.b e() {
            a.a.a.i.b r0 = a.a.a.i.b.C0020b.f322a
            return r0
    }

    public java.lang.String a() {
            r2 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r1 = 200(0xc8, float:2.8E-43)
            r0.<init>(r1)
            java.lang.String r1 = r2.f321c
            if (r1 == 0) goto L13
            java.lang.String r1 = "&cu="
            r0.append(r1)
            java.lang.String r2 = r2.f321c
            goto L1a
        L13:
            java.lang.String r1 = "&im="
            r0.append(r1)
            java.lang.String r2 = r2.f319a
        L1a:
            r0.append(r2)
            java.lang.String r2 = "&mb="
            r0.append(r2)     // Catch: java.lang.Exception -> L27
            java.lang.String r2 = android.os.Build.MODEL     // Catch: java.lang.Exception -> L27
            r0.append(r2)     // Catch: java.lang.Exception -> L27
        L27:
            java.lang.String r2 = "&pack="
            r0.append(r2)
            java.lang.String r2 = a.a.a.i.b.f     // Catch: java.lang.Exception -> L31
            r0.append(r2)     // Catch: java.lang.Exception -> L31
        L31:
            java.lang.String r2 = "&sdk="
            r0.append(r2)
            r2 = 1092113924(0x41185604, float:9.521)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public java.lang.String a(boolean r2) {
            r1 = this;
            r0 = 0
            java.lang.String r1 = r1.a(r2, r0)
            return r1
    }

    public java.lang.String a(boolean r4, java.lang.String r5) {
            r3 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r1 = 256(0x100, float:3.59E-43)
            r0.<init>(r1)
            java.lang.String r1 = "&sdk="
            r0.append(r1)
            r1 = 1092113924(0x41185604, float:9.521)
            r0.append(r1)
            if (r4 == 0) goto L66
            java.lang.String r1 = a.a.a.i.i.d
            java.lang.String r2 = "all"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L23
            java.lang.String r1 = "&addr=allj2"
            r0.append(r1)
        L23:
            boolean r1 = a.a.a.i.i.g
            if (r1 != 0) goto L28
            goto L2d
        L28:
            java.lang.String r1 = "&adtp=n2"
            r0.append(r1)
        L2d:
            boolean r1 = a.a.a.i.i.f
            if (r1 != 0) goto L3d
            boolean r1 = a.a.a.i.i.i
            if (r1 != 0) goto L3d
            boolean r1 = a.a.a.i.i.j
            if (r1 != 0) goto L3d
            boolean r1 = a.a.a.i.i.h
            if (r1 == 0) goto L66
        L3d:
            java.lang.String r1 = "&sema="
            r0.append(r1)
            boolean r1 = a.a.a.i.i.f
            if (r1 == 0) goto L4b
            java.lang.String r1 = "aptag|"
            r0.append(r1)
        L4b:
            boolean r1 = a.a.a.i.i.h
            if (r1 == 0) goto L54
            java.lang.String r1 = "aptagd2|"
            r0.append(r1)
        L54:
            boolean r1 = a.a.a.i.i.i
            if (r1 == 0) goto L5d
            java.lang.String r1 = "poiregion|"
            r0.append(r1)
        L5d:
            boolean r1 = a.a.a.i.i.j
            if (r1 == 0) goto L66
            java.lang.String r1 = "regular"
            r0.append(r1)
        L66:
            if (r4 == 0) goto L7e
            if (r5 != 0) goto L6d
            java.lang.String r5 = "&coor=gcj02"
            goto L72
        L6d:
            java.lang.String r1 = "&coor="
            r0.append(r1)
        L72:
            r0.append(r5)
            java.lang.String r5 = a.a.a.g.d.m()
            if (r5 == 0) goto L7e
            r0.append(r5)
        L7e:
            java.lang.String r5 = r3.f321c
            if (r5 != 0) goto L8d
            java.lang.String r5 = "&im="
        L84:
            r0.append(r5)
            java.lang.String r5 = r3.f319a
            r0.append(r5)
            goto Lbd
        L8d:
            java.lang.String r5 = "&cu="
            r0.append(r5)
            java.lang.String r5 = r3.f321c
            r0.append(r5)
            java.lang.String r5 = r3.f319a
            if (r5 == 0) goto Lbd
            java.lang.String r1 = "NULL"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto Lbd
            java.lang.String r5 = r3.f321c
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            java.lang.String r2 = r3.f319a
            r1.<init>(r2)
            java.lang.StringBuffer r1 = r1.reverse()
            java.lang.String r1 = r1.toString()
            boolean r5 = r5.contains(r1)
            if (r5 != 0) goto Lbd
            java.lang.String r5 = "&Aim="
            goto L84
        Lbd:
            java.lang.String r5 = r3.f320b
            if (r5 == 0) goto Lcb
            java.lang.String r5 = "&snd="
            r0.append(r5)
            java.lang.String r5 = r3.f320b
            r0.append(r5)
        Lcb:
            java.lang.String r5 = r3.d
            if (r5 == 0) goto Ld9
            java.lang.String r5 = "&Aid="
            r0.append(r5)
            java.lang.String r3 = r3.d
            r0.append(r3)
        Ld9:
            java.lang.String r3 = "&fw="
            r0.append(r3)
            float r3 = com.baidu.location.f.a()
            r0.append(r3)
            java.lang.String r3 = "&lt=1"
            r0.append(r3)
            java.lang.String r3 = "&mb="
            r0.append(r3)
            java.lang.String r3 = android.os.Build.MODEL
            r0.append(r3)
            java.lang.String r3 = "&resid="
            r0.append(r3)
            java.lang.String r3 = "12"
            r0.append(r3)
            java.lang.String r3 = "&os=A"
            r0.append(r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            r0.append(r3)
            if (r4 == 0) goto L122
            java.lang.String r3 = "&sv="
            r0.append(r3)
            java.lang.String r3 = android.os.Build.VERSION.RELEASE
            if (r3 == 0) goto L11f
            int r4 = r3.length()
            r5 = 6
            if (r4 <= r5) goto L11f
            r4 = 0
            java.lang.String r3 = r3.substring(r4, r5)
        L11f:
            r0.append(r3)
        L122:
            java.lang.String r3 = r0.toString()
            return r3
    }

    public void a(android.content.Context r3) {
            r2 = this;
            if (r3 == 0) goto L3f
            boolean r0 = r2.e
            if (r0 == 0) goto L7
            goto L3f
        L7:
            r0 = 0
            c.a.c.a.b r1 = c.a.c.a.b.c(r3)     // Catch: java.lang.Exception -> L13
            java.lang.String r1 = r1.a()     // Catch: java.lang.Exception -> L13
            r2.f321c = r1     // Catch: java.lang.Exception -> L13
            goto L15
        L13:
            r2.f321c = r0
        L15:
            java.lang.String r1 = r3.getPackageName()     // Catch: java.lang.Exception -> L1c
            a.a.a.i.b.f = r1     // Catch: java.lang.Exception -> L1c
            goto L1e
        L1c:
            a.a.a.i.b.f = r0
        L1e:
            java.lang.String r3 = a.a.a.i.i.f(r3)     // Catch: java.lang.Exception -> L25
            a.a.a.i.b.j = r3     // Catch: java.lang.Exception -> L25
            goto L27
        L25:
            a.a.a.i.b.j = r0
        L27:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = ""
            r3.append(r0)
            java.lang.String r0 = r2.f321c
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            a.a.a.i.i.l = r3
            r3 = 1
            r2.e = r3
        L3f:
            return
    }

    public void a(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            a.a.a.i.b.g = r1
            a.a.a.i.b.f = r2
            return
    }

    public java.lang.String b() {
            r0 = this;
            java.lang.String r0 = r0.f321c
            return r0
    }

    public java.lang.String c() {
            r2 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = r2.f321c
            if (r1 != 0) goto L11
            java.lang.String r1 = "&im="
            r0.append(r1)
            java.lang.String r2 = r2.f319a
            goto L18
        L11:
            java.lang.String r1 = "&cu="
            r0.append(r1)
            java.lang.String r2 = r2.f321c
        L18:
            r0.append(r2)
            java.lang.String r2 = "&sdk="
            r0.append(r2)
            r2 = 1092113924(0x41185604, float:9.521)
            r0.append(r2)
            java.lang.String r2 = "&mb="
            r0.append(r2)
            java.lang.String r2 = android.os.Build.MODEL
            r0.append(r2)
            java.lang.String r2 = "&stp=1"
            r0.append(r2)
            java.lang.String r2 = "&os=A"
            r0.append(r2)
            java.lang.String r2 = android.os.Build.VERSION.SDK
            r0.append(r2)
            java.lang.String r2 = "&prod="
            r0.append(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = a.a.a.i.b.g
            r2.append(r1)
            java.lang.String r1 = ":"
            r2.append(r1)
            java.lang.String r1 = a.a.a.i.b.f
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            android.content.Context r2 = com.baidu.location.f.c()
            java.lang.String r2 = a.a.a.i.i.d(r2)
            r0.append(r2)
            java.lang.String r2 = "&resid="
            r0.append(r2)
            java.lang.String r2 = "12"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public java.lang.String d() {
            r3 = this;
            java.lang.String r0 = r3.f321c
            java.lang.String r1 = "|"
            java.lang.String r2 = "v9.521|"
            if (r0 == 0) goto L13
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r3 = r3.f321c
            goto L1d
        L13:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r3 = r3.f319a
        L1d:
            r0.append(r3)
            r0.append(r1)
            java.lang.String r3 = android.os.Build.MODEL
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
