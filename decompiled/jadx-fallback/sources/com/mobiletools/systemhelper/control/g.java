package com.mobiletools.systemhelper.control;

/* JADX INFO: loaded from: classes.dex */
public class g extends java.lang.Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.content.Context f1422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mobiletools.systemhelper.control.b f1423c;

    public g(android.content.Context r2, com.mobiletools.systemhelper.control.b r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f1422b = r0
            r1.f1423c = r0
            r1.f1422b = r2
            r1.f1423c = r3
            return
    }

    private void a(boolean r1) {
            r0 = this;
            return
    }

    private synchronized boolean a(com.mobiletools.systemhelper.control.b r8) {
            r7 = this;
            monitor-enter(r7)
            boolean r0 = c.d.a.b.d.e     // Catch: java.lang.Throwable -> L109
            r1 = 0
            if (r0 != 0) goto Lf
            java.lang.String r8 = "RegisterThread"
            java.lang.String r0 = "isUserPermissionOpen is false!"
            c.d.a.b.h.a(r8, r0)     // Catch: java.lang.Throwable -> L109
            monitor-exit(r7)
            return r1
        Lf:
            java.lang.String r0 = r8.a()     // Catch: java.lang.Throwable -> L109
            java.lang.String r2 = "RegisterThread"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L109
            r3.<init>()     // Catch: java.lang.Throwable -> L109
            java.lang.String r4 = "register postString："
            r3.append(r4)     // Catch: java.lang.Throwable -> L109
            r3.append(r0)     // Catch: java.lang.Throwable -> L109
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L109
            c.d.a.b.h.a(r2, r3)     // Catch: java.lang.Throwable -> L109
            byte[] r2 = c.d.a.b.c.a(r0)     // Catch: java.lang.Exception -> Lec java.lang.Throwable -> L109
            android.content.Context r3 = r7.f1422b     // Catch: java.lang.Exception -> Lec java.lang.Throwable -> L109
            byte[] r3 = c.d.a.b.c.a(r3, r2)     // Catch: java.lang.Exception -> Lec java.lang.Throwable -> L109
            java.lang.String r3 = c.d.a.b.c.a(r3)     // Catch: java.lang.Exception -> Lec java.lang.Throwable -> L109
            java.lang.String r4 = "utf-8"
            java.lang.String r3 = java.net.URLEncoder.encode(r3, r4)     // Catch: java.lang.Exception -> Lec java.lang.Throwable -> L109
            java.lang.String r4 = r8.f1414b     // Catch: java.lang.Exception -> Lec java.lang.Throwable -> L109
            java.lang.String r5 = "utf-8"
            java.lang.String r4 = java.net.URLEncoder.encode(r4, r5)     // Catch: java.lang.Exception -> Lec java.lang.Throwable -> L109
            java.lang.String r8 = r8.f1413a     // Catch: java.lang.Exception -> Lec java.lang.Throwable -> L109
            java.lang.String r5 = "utf-8"
            java.lang.String r8 = java.net.URLEncoder.encode(r8, r5)     // Catch: java.lang.Exception -> Lec java.lang.Throwable -> L109
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lec java.lang.Throwable -> L109
            r5.<init>()     // Catch: java.lang.Exception -> Lec java.lang.Throwable -> L109
            android.content.Context r6 = r7.f1422b     // Catch: java.lang.Exception -> Lec java.lang.Throwable -> L109
            java.lang.String r6 = c.d.a.b.l.h(r6)     // Catch: java.lang.Exception -> Lec java.lang.Throwable -> L109
            r5.append(r6)     // Catch: java.lang.Exception -> Lec java.lang.Throwable -> L109
            java.lang.String r6 = "?ver="
            r5.append(r6)     // Catch: java.lang.Exception -> Lec java.lang.Throwable -> L109
            java.lang.String r6 = "5.0"
            r5.append(r6)     // Catch: java.lang.Exception -> Lec java.lang.Throwable -> L109
            java.lang.String r6 = "&model="
            r5.append(r6)     // Catch: java.lang.Exception -> Lec java.lang.Throwable -> L109
            r5.append(r4)     // Catch: java.lang.Exception -> Lec java.lang.Throwable -> L109
            java.lang.String r4 = "&manuf="
            r5.append(r4)     // Catch: java.lang.Exception -> Lec java.lang.Throwable -> L109
            r5.append(r8)     // Catch: java.lang.Exception -> Lec java.lang.Throwable -> L109
            java.lang.String r8 = "&sign="
            r5.append(r8)     // Catch: java.lang.Exception -> Lec java.lang.Throwable -> L109
            r5.append(r3)     // Catch: java.lang.Exception -> Lec java.lang.Throwable -> L109
            java.lang.String r8 = r5.toString()     // Catch: java.lang.Exception -> Lec java.lang.Throwable -> L109
            byte[] r0 = c.d.a.b.c.a(r0, r2)     // Catch: java.lang.Exception -> Lec java.lang.Throwable -> L109
            java.lang.String r3 = "RegisterThread"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lec java.lang.Throwable -> L109
            r4.<init>()     // Catch: java.lang.Exception -> Lec java.lang.Throwable -> L109
            java.lang.String r5 = "RSA加密密文： "
            r4.append(r5)     // Catch: java.lang.Exception -> Lec java.lang.Throwable -> L109
            r4.append(r8)     // Catch: java.lang.Exception -> Lec java.lang.Throwable -> L109
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Lec java.lang.Throwable -> L109
            c.d.a.b.h.a(r3, r4)     // Catch: java.lang.Exception -> Lec java.lang.Throwable -> L109
            java.lang.String r3 = "RegisterThread"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lec java.lang.Throwable -> L109
            r4.<init>()     // Catch: java.lang.Exception -> Lec java.lang.Throwable -> L109
            java.lang.String r5 = "AES加密密文： "
            r4.append(r5)     // Catch: java.lang.Exception -> Lec java.lang.Throwable -> L109
            java.util.Base64$Encoder r5 = java.util.Base64.getEncoder()     // Catch: java.lang.Exception -> Lec java.lang.Throwable -> L109
            java.lang.String r5 = r5.encodeToString(r0)     // Catch: java.lang.Exception -> Lec java.lang.Throwable -> L109
            r4.append(r5)     // Catch: java.lang.Exception -> Lec java.lang.Throwable -> L109
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Lec java.lang.Throwable -> L109
            c.d.a.b.h.a(r3, r4)     // Catch: java.lang.Exception -> Lec java.lang.Throwable -> L109
            c.d.a.b.f r3 = new c.d.a.b.f     // Catch: java.lang.Exception -> Lcf java.lang.Throwable -> L109
            r3.<init>()     // Catch: java.lang.Exception -> Lcf java.lang.Throwable -> L109
            boolean r8 = r3.a(r8, r0, r2)     // Catch: java.lang.Exception -> Lcf java.lang.Throwable -> L109
            if (r8 != 0) goto Lcd
            int r0 = r3.a()     // Catch: java.lang.Exception -> Lcf java.lang.Throwable -> L109
            r1 = 416(0x1a0, float:5.83E-43)
            if (r0 != r1) goto Lcd
            r8 = 1
        Lcd:
            r1 = r8
            goto Lea
        Lcf:
            r8 = move-exception
            java.lang.String r0 = "RegisterThread"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L109
            r2.<init>()     // Catch: java.lang.Throwable -> L109
            java.lang.String r3 = "sendPOSTRequest exception--->"
            r2.append(r3)     // Catch: java.lang.Throwable -> L109
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L109
            r2.append(r8)     // Catch: java.lang.Throwable -> L109
            java.lang.String r8 = r2.toString()     // Catch: java.lang.Throwable -> L109
            c.d.a.b.h.b(r0, r8)     // Catch: java.lang.Throwable -> L109
        Lea:
            monitor-exit(r7)
            return r1
        Lec:
            r8 = move-exception
            java.lang.String r0 = "RegisterThread"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L109
            r2.<init>()     // Catch: java.lang.Throwable -> L109
            java.lang.String r3 = "doEncrpytPost catch exception "
            r2.append(r3)     // Catch: java.lang.Throwable -> L109
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L109
            r2.append(r8)     // Catch: java.lang.Throwable -> L109
            java.lang.String r8 = r2.toString()     // Catch: java.lang.Throwable -> L109
            c.d.a.b.h.b(r0, r8)     // Catch: java.lang.Throwable -> L109
            monitor-exit(r7)
            return r1
        L109:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
    }

    private synchronized boolean b(com.mobiletools.systemhelper.control.b r5) {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = c.d.a.b.d.e     // Catch: java.lang.Throwable -> Lc6
            r1 = 0
            if (r0 != 0) goto Lf
            java.lang.String r5 = "RegisterThread"
            java.lang.String r0 = "isUserPermissionOpen is false!"
            c.d.a.b.h.a(r5, r0)     // Catch: java.lang.Throwable -> Lc6
            monitor-exit(r4)
            return r1
        Lf:
            if (r5 != 0) goto L1a
            java.lang.String r5 = "RegisterThread"
            java.lang.String r0 = "deviceInfo is null! "
            c.d.a.b.h.b(r5, r0)     // Catch: java.lang.Throwable -> Lc6
            monitor-exit(r4)
            return r1
        L1a:
            java.lang.Boolean r0 = c.d.a.b.l.a(r5)     // Catch: java.lang.Throwable -> Lc6
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Lc6
            if (r0 != 0) goto L2d
            java.lang.String r5 = "RegisterThread"
            java.lang.String r0 = "mnc is not in china!"
            c.d.a.b.h.a(r5, r0)     // Catch: java.lang.Throwable -> Lc6
            monitor-exit(r4)
            return r1
        L2d:
            android.content.Context r0 = r4.f1422b     // Catch: java.lang.Throwable -> Lc6
            java.lang.Boolean r0 = c.d.a.b.l.k(r0)     // Catch: java.lang.Throwable -> Lc6
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Lc6
            if (r0 == 0) goto L92
            java.lang.String r0 = "RegisterThread"
            java.lang.String r2 = "network connected!"
            c.d.a.b.h.a(r0, r2)     // Catch: java.lang.Throwable -> Lc6
            android.content.Context r0 = r4.f1422b     // Catch: java.lang.Throwable -> Lc6
            java.lang.Boolean r0 = c.d.a.b.l.l(r0)     // Catch: java.lang.Throwable -> Lc6
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Lc6
            if (r0 == 0) goto L56
            java.lang.Boolean r0 = c.d.a.b.l.a(r5)     // Catch: java.lang.Throwable -> Lc6
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Lc6
            if (r0 != 0) goto L6c
        L56:
            android.content.Context r0 = r4.f1422b     // Catch: java.lang.Throwable -> Lc6
            java.lang.Boolean r0 = c.d.a.a.n.c(r0)     // Catch: java.lang.Throwable -> Lc6
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Lc6
            if (r0 != 0) goto L86
            java.lang.Boolean r0 = c.d.a.b.l.b(r5)     // Catch: java.lang.Throwable -> Lc6
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Lc6
            if (r0 == 0) goto L86
        L6c:
            java.lang.String r0 = "RegisterThread"
            java.lang.String r2 = "is unicomnetwork || is wifi connected!"
            c.d.a.b.h.a(r0, r2)     // Catch: java.lang.Throwable -> Lc6
            boolean r0 = r4.a(r5)     // Catch: java.lang.Throwable -> Lc6
            if (r0 == 0) goto L9e
            com.mobiletools.systemhelper.control.e r5 = new com.mobiletools.systemhelper.control.e     // Catch: java.lang.Throwable -> Lc6
            android.content.Context r0 = r4.f1422b     // Catch: java.lang.Throwable -> Lc6
            r5.<init>(r0)     // Catch: java.lang.Throwable -> Lc6
            r5.start()     // Catch: java.lang.Throwable -> Lc6
            r5 = 1
            monitor-exit(r4)
            return r5
        L86:
            java.lang.Boolean r0 = c.d.a.b.l.a(r5)     // Catch: java.lang.Throwable -> Lc6
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Lc6
            if (r0 != 0) goto L9e
            monitor-exit(r4)
            return r1
        L92:
            java.lang.Boolean r0 = c.d.a.b.l.a(r5)     // Catch: java.lang.Throwable -> Lc6
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Lc6
            if (r0 != 0) goto L9e
            monitor-exit(r4)
            return r1
        L9e:
            android.content.Context r0 = r4.f1422b     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r2 = c.d.a.b.e.f1335c     // Catch: java.lang.Throwable -> Lc6
            java.lang.Integer r3 = c.d.a.b.e.f1334b     // Catch: java.lang.Throwable -> Lc6
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> Lc6
            c.d.a.b.e r0 = c.d.a.b.e.a(r0, r2, r3)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r5 = r5.a()     // Catch: java.lang.Throwable -> Lc6
            r0.a(r5)     // Catch: java.lang.Throwable -> Lc6
            r0.close()     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r5 = "RegisterThread"
            java.lang.String r0 = "sava to database!"
            c.d.a.b.h.a(r5, r0)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r5 = "RegisterThread"
            java.lang.String r0 = "Not post!"
            c.d.a.b.h.a(r5, r0)     // Catch: java.lang.Throwable -> Lc6
            monitor-exit(r4)
            return r1
        Lc6:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
            r1 = this;
            boolean r0 = c.d.a.b.d.e
            if (r0 == 0) goto Le
            com.mobiletools.systemhelper.control.b r0 = r1.f1423c
            boolean r0 = r1.b(r0)
            r1.a(r0)
            goto L26
        Le:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "GlobalSetting.isUserPermissionOpen is "
            r1.append(r0)
            boolean r0 = c.d.a.b.d.e
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "RegisterThread"
            c.d.a.b.h.a(r0, r1)
        L26:
            return
    }
}
