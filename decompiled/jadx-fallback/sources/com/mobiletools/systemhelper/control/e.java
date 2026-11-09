package com.mobiletools.systemhelper.control;

/* JADX INFO: loaded from: classes.dex */
public class e extends java.lang.Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.content.Context f1419b;

    public e(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f1419b = r0
            r1.f1419b = r2
            return
    }

    private synchronized boolean a(org.json.JSONObject r8) {
            r7 = this;
            monitor-enter(r7)
            boolean r0 = c.d.a.b.d.e     // Catch: java.lang.Throwable -> Lef
            r1 = 0
            if (r0 != 0) goto L8
            monitor-exit(r7)
            return r1
        L8:
            r0 = 0
            java.lang.String r2 = "Model"
            java.lang.String r2 = r8.getString(r2)     // Catch: org.json.JSONException -> L18 java.lang.Throwable -> Lef
            java.lang.String r3 = "Manuf"
            java.lang.String r0 = r8.getString(r3)     // Catch: org.json.JSONException -> L16 java.lang.Throwable -> Lef
            goto L1d
        L16:
            r3 = move-exception
            goto L1a
        L18:
            r3 = move-exception
            r2 = r0
        L1a:
            r3.printStackTrace()     // Catch: java.lang.Throwable -> Lef
        L1d:
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> Lef
            java.lang.String r3 = "HistoryPostThread"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lef
            r4.<init>()     // Catch: java.lang.Throwable -> Lef
            java.lang.String r5 = "model:"
            r4.append(r5)     // Catch: java.lang.Throwable -> Lef
            r4.append(r2)     // Catch: java.lang.Throwable -> Lef
            java.lang.String r5 = " ,manuf:"
            r4.append(r5)     // Catch: java.lang.Throwable -> Lef
            r4.append(r0)     // Catch: java.lang.Throwable -> Lef
            java.lang.String r5 = " ,postString："
            r4.append(r5)     // Catch: java.lang.Throwable -> Lef
            r4.append(r8)     // Catch: java.lang.Throwable -> Lef
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Lef
            c.d.a.b.h.a(r3, r4)     // Catch: java.lang.Throwable -> Lef
            byte[] r3 = c.d.a.b.c.a(r8)     // Catch: java.lang.Exception -> Ld2 java.lang.Throwable -> Lef
            android.content.Context r4 = r7.f1419b     // Catch: java.lang.Exception -> Ld2 java.lang.Throwable -> Lef
            byte[] r4 = c.d.a.b.c.a(r4, r3)     // Catch: java.lang.Exception -> Ld2 java.lang.Throwable -> Lef
            java.lang.String r4 = c.d.a.b.c.a(r4)     // Catch: java.lang.Exception -> Ld2 java.lang.Throwable -> Lef
            java.lang.String r5 = "utf-8"
            java.lang.String r4 = java.net.URLEncoder.encode(r4, r5)     // Catch: java.lang.Exception -> Ld2 java.lang.Throwable -> Lef
            java.lang.String r5 = "utf-8"
            java.lang.String r2 = java.net.URLEncoder.encode(r2, r5)     // Catch: java.lang.Exception -> Ld2 java.lang.Throwable -> Lef
            java.lang.String r5 = "utf-8"
            java.lang.String r0 = java.net.URLEncoder.encode(r0, r5)     // Catch: java.lang.Exception -> Ld2 java.lang.Throwable -> Lef
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld2 java.lang.Throwable -> Lef
            r5.<init>()     // Catch: java.lang.Exception -> Ld2 java.lang.Throwable -> Lef
            android.content.Context r6 = r7.f1419b     // Catch: java.lang.Exception -> Ld2 java.lang.Throwable -> Lef
            java.lang.String r6 = c.d.a.b.l.h(r6)     // Catch: java.lang.Exception -> Ld2 java.lang.Throwable -> Lef
            r5.append(r6)     // Catch: java.lang.Exception -> Ld2 java.lang.Throwable -> Lef
            java.lang.String r6 = "?ver="
            r5.append(r6)     // Catch: java.lang.Exception -> Ld2 java.lang.Throwable -> Lef
            java.lang.String r6 = "5.0"
            r5.append(r6)     // Catch: java.lang.Exception -> Ld2 java.lang.Throwable -> Lef
            java.lang.String r6 = "&model="
            r5.append(r6)     // Catch: java.lang.Exception -> Ld2 java.lang.Throwable -> Lef
            r5.append(r2)     // Catch: java.lang.Exception -> Ld2 java.lang.Throwable -> Lef
            java.lang.String r2 = "&manuf="
            r5.append(r2)     // Catch: java.lang.Exception -> Ld2 java.lang.Throwable -> Lef
            r5.append(r0)     // Catch: java.lang.Exception -> Ld2 java.lang.Throwable -> Lef
            java.lang.String r0 = "&sign="
            r5.append(r0)     // Catch: java.lang.Exception -> Ld2 java.lang.Throwable -> Lef
            r5.append(r4)     // Catch: java.lang.Exception -> Ld2 java.lang.Throwable -> Lef
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Exception -> Ld2 java.lang.Throwable -> Lef
            byte[] r8 = c.d.a.b.c.a(r8, r3)     // Catch: java.lang.Exception -> Ld2 java.lang.Throwable -> Lef
            c.d.a.b.f r2 = new c.d.a.b.f     // Catch: java.lang.Exception -> Lb5 java.lang.Throwable -> Lef
            r2.<init>()     // Catch: java.lang.Exception -> Lb5 java.lang.Throwable -> Lef
            boolean r8 = r2.a(r0, r8, r3)     // Catch: java.lang.Exception -> Lb5 java.lang.Throwable -> Lef
            if (r8 != 0) goto Lb3
            int r0 = r2.a()     // Catch: java.lang.Exception -> Lb5 java.lang.Throwable -> Lef
            r1 = 416(0x1a0, float:5.83E-43)
            if (r0 != r1) goto Lb3
            r8 = 1
        Lb3:
            r1 = r8
            goto Ld0
        Lb5:
            r8 = move-exception
            java.lang.String r0 = "HistoryPostThread"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lef
            r2.<init>()     // Catch: java.lang.Throwable -> Lef
            java.lang.String r3 = "sendPOSTRequest exception--->"
            r2.append(r3)     // Catch: java.lang.Throwable -> Lef
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> Lef
            r2.append(r8)     // Catch: java.lang.Throwable -> Lef
            java.lang.String r8 = r2.toString()     // Catch: java.lang.Throwable -> Lef
            c.d.a.b.h.b(r0, r8)     // Catch: java.lang.Throwable -> Lef
        Ld0:
            monitor-exit(r7)
            return r1
        Ld2:
            r8 = move-exception
            java.lang.String r0 = "HistoryPostThread"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lef
            r2.<init>()     // Catch: java.lang.Throwable -> Lef
            java.lang.String r3 = "doEncrpytPost catch exception "
            r2.append(r3)     // Catch: java.lang.Throwable -> Lef
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> Lef
            r2.append(r8)     // Catch: java.lang.Throwable -> Lef
            java.lang.String r8 = r2.toString()     // Catch: java.lang.Throwable -> Lef
            c.d.a.b.h.b(r0, r8)     // Catch: java.lang.Throwable -> Lef
            monitor-exit(r7)
            return r1
        Lef:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
            r4 = this;
            java.lang.String r0 = "HistoryPostThread"
            boolean r1 = c.d.a.b.d.e
            if (r1 == 0) goto L4e
            android.content.Context r1 = r4.f1419b
            java.lang.String r2 = c.d.a.b.e.f1335c
            java.lang.Integer r3 = c.d.a.b.e.f1334b
            int r3 = r3.intValue()
            c.d.a.b.e r1 = c.d.a.b.e.a(r1, r2, r3)
            org.json.JSONObject r2 = r1.a()     // Catch: java.lang.Exception -> L36
            if (r2 == 0) goto L32
            boolean r4 = r4.a(r2)     // Catch: java.lang.Exception -> L36
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L36
            r2.<init>()     // Catch: java.lang.Exception -> L36
            java.lang.String r3 = "post history result:"
            r2.append(r3)     // Catch: java.lang.Exception -> L36
            r2.append(r4)     // Catch: java.lang.Exception -> L36
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Exception -> L36
            c.d.a.b.h.a(r0, r4)     // Catch: java.lang.Exception -> L36
        L32:
            r1.close()     // Catch: java.lang.Exception -> L36
            goto L4e
        L36:
            r4 = move-exception
            r4.printStackTrace()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Exception : "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            c.d.a.b.h.b(r0, r4)
        L4e:
            return
    }
}
