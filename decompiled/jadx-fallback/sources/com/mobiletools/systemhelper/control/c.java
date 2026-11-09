package com.mobiletools.systemhelper.control;

/* JADX INFO: loaded from: classes.dex */
public class c extends java.lang.Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.content.Context f1416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mobiletools.systemhelper.control.b f1417c;
    private com.mobiletools.systemhelper.control.c.a d;
    private java.lang.String e;
    private java.lang.String f;

    public interface a {
        void a(android.content.Context r1, com.mobiletools.systemhelper.control.b r2, java.lang.String r3, java.lang.String r4);
    }

    public c(android.content.Context r2, com.mobiletools.systemhelper.control.b r3, com.mobiletools.systemhelper.control.c.a r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f1416b = r0
            r1.f1417c = r0
            java.lang.String r0 = ""
            r1.e = r0
            r1.f = r0
            r1.f1416b = r2
            r1.f1417c = r3
            r1.d = r4
            return
    }

    private java.lang.String a() {
            r5 = this;
            java.lang.String r5 = ""
            java.util.Enumeration r0 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.net.SocketException -> L4a
        L6:
            boolean r1 = r0.hasMoreElements()     // Catch: java.net.SocketException -> L4a
            if (r1 == 0) goto L4e
            java.lang.Object r1 = r0.nextElement()     // Catch: java.net.SocketException -> L4a
            java.net.NetworkInterface r1 = (java.net.NetworkInterface) r1     // Catch: java.net.SocketException -> L4a
            java.util.Enumeration r1 = r1.getInetAddresses()     // Catch: java.net.SocketException -> L4a
        L16:
            boolean r2 = r1.hasMoreElements()     // Catch: java.net.SocketException -> L4a
            if (r2 == 0) goto L6
            java.lang.Object r2 = r1.nextElement()     // Catch: java.net.SocketException -> L4a
            java.net.InetAddress r2 = (java.net.InetAddress) r2     // Catch: java.net.SocketException -> L4a
            java.lang.String r3 = r2.getHostAddress()     // Catch: java.net.SocketException -> L4a
            boolean r4 = r2.isLoopbackAddress()     // Catch: java.net.SocketException -> L4a
            if (r4 != 0) goto L16
            boolean r4 = r2.isLinkLocalAddress()     // Catch: java.net.SocketException -> L4a
            if (r4 != 0) goto L16
            boolean r2 = r2 instanceof java.net.Inet6Address     // Catch: java.net.SocketException -> L4a
            if (r2 == 0) goto L16
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.net.SocketException -> L4a
            r0.<init>()     // Catch: java.net.SocketException -> L4a
            r0.append(r5)     // Catch: java.net.SocketException -> L4a
            java.lang.String r1 = "address"
            r0.append(r1)     // Catch: java.net.SocketException -> L4a
            r0.append(r3)     // Catch: java.net.SocketException -> L4a
            r0.toString()     // Catch: java.net.SocketException -> L4a
            return r3
        L4a:
            r0 = move-exception
            r0.printStackTrace()
        L4e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getIPv6Address:"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "GetIPAddressThread"
            c.d.a.b.h.a(r1, r0)
            return r5
    }

    private java.lang.String b() {
            r0 = this;
            java.lang.String r0 = ""
            return r0
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
            r4 = this;
            java.lang.String r0 = r4.b()
            r4.e = r0
            java.lang.String r0 = r4.a()
            r4.f = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "IPv4:"
            r0.append(r1)
            java.lang.String r1 = r4.e
            r0.append(r1)
            java.lang.String r1 = ", IPv6:"
            r0.append(r1)
            java.lang.String r1 = r4.f
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "GetIPAddressThread"
            c.d.a.b.h.a(r1, r0)
            com.mobiletools.systemhelper.control.c$a r0 = r4.d
            android.content.Context r1 = r4.f1416b
            com.mobiletools.systemhelper.control.b r2 = r4.f1417c
            java.lang.String r3 = r4.e
            java.lang.String r4 = r4.f
            r0.a(r1, r2, r3, r4)
            return
    }
}
