package c.a.c.a;

/* JADX INFO: loaded from: classes.dex */
class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.content.Context f1297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.util.List f1298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c.a.c.a.i.a f1299c;

    interface a {
        void a(java.lang.Object r1);
    }

    protected i(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f1298b = r0
            r1.f1299c = r0
            r1.f1297a = r2
            return
    }

    static /* synthetic */ java.util.List a(c.a.c.a.i r0) {
            java.util.List r0 = r0.f1298b
            return r0
    }

    private java.util.List a(java.util.HashMap r6, java.lang.String[] r7) {
            r5 = this;
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            if (r7 == 0) goto L40
            int r0 = r7.length
            if (r0 <= 0) goto L40
            r0 = 0
        Lb:
            int r1 = r7.length
            if (r0 >= r1) goto L68
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Set r2 = r6.keySet()
            java.util.Iterator r2 = r2.iterator()
        L1b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L33
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = r3.toString()
            java.lang.Object r4 = r6.get(r3)
            r1.put(r3, r4)
            goto L1b
        L33:
            r2 = r7[r0]
            java.lang.String r3 = "mcode"
            r1.put(r3, r2)
            r5.add(r1)
            int r0 = r0 + 1
            goto Lb
        L40:
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.util.Set r0 = r6.keySet()
            java.util.Iterator r0 = r0.iterator()
        L4d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L65
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.toString()
            java.lang.Object r2 = r6.get(r1)
            r7.put(r1, r2)
            goto L4d
        L65:
            r5.add(r7)
        L68:
            return r5
    }

    static /* synthetic */ void a(c.a.c.a.i r0, java.util.List r1, java.lang.String r2, int r3, java.lang.String r4, java.lang.String r5) {
            r0.a(r1, r2, r3, r4, r5)
            return
    }

    private void a(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "status"
            if (r4 != 0) goto L6
            java.lang.String r4 = ""
        L6:
            r1 = -1
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L16
            r2.<init>(r4)     // Catch: org.json.JSONException -> L16
            boolean r4 = r2.has(r0)     // Catch: org.json.JSONException -> L16
            if (r4 != 0) goto L23
            r2.put(r0, r1)     // Catch: org.json.JSONException -> L16
            goto L23
        L16:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            r2.put(r0, r1)     // Catch: org.json.JSONException -> L1f
            goto L23
        L1f:
            r4 = move-exception
            r4.printStackTrace()
        L23:
            c.a.c.a.i$a r3 = r3.f1299c
            if (r3 == 0) goto L2e
            java.lang.String r4 = r2.toString()
            r3.a(r4)
        L2e:
            return
    }

    private void a(java.util.List r15, java.lang.String r16, int r17, java.lang.String r18, java.lang.String r19) {
            r14 = this;
            r1 = r14
            r0 = r15
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "syncConnect start Thread id = "
            r2.append(r3)
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            long r3 = r3.getId()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            c.a.c.a.d.a(r2)
            if (r0 == 0) goto L156
            int r2 = r15.size()
            if (r2 != 0) goto L2c
            goto L156
        L2c:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            r4 = r3
        L33:
            int r5 = r15.size()
            java.lang.String r6 = "status"
            if (r4 >= r5) goto Lca
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "syncConnect resuest "
            r5.append(r7)
            r5.append(r4)
            java.lang.String r8 = "  start!!!"
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            c.a.c.a.d.a(r5)
            java.lang.Object r5 = r15.get(r4)
            r9 = r5
            java.util.HashMap r9 = (java.util.HashMap) r9
            c.a.c.a.k r8 = new c.a.c.a.k
            android.content.Context r5 = r1.f1297a
            r8.<init>(r5)
            boolean r5 = r8.a()
            if (r5 == 0) goto Lb5
            r10 = r16
            r11 = r17
            r12 = r18
            r13 = r19
            java.lang.String r5 = r8.a(r9, r10, r11, r12, r13)
            if (r5 != 0) goto L78
            java.lang.String r5 = ""
        L78:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            r8.append(r4)
            java.lang.String r7 = "  result:"
            r8.append(r7)
            r8.append(r5)
            java.lang.String r7 = r8.toString()
            c.a.c.a.d.a(r7)
            r2.add(r5)
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: org.json.JSONException -> Laf
            r7.<init>(r5)     // Catch: org.json.JSONException -> Laf
            boolean r8 = r7.has(r6)     // Catch: org.json.JSONException -> Laf
            if (r8 == 0) goto Lc1
            int r6 = r7.getInt(r6)     // Catch: org.json.JSONException -> Laf
            if (r6 != 0) goto Lc1
            java.lang.String r6 = "auth end and break"
            c.a.c.a.d.a(r6)     // Catch: org.json.JSONException -> Laf
            r14.a(r5)     // Catch: org.json.JSONException -> Laf
            return
        Laf:
            java.lang.String r5 = "continue-------------------------------"
            c.a.c.a.d.a(r5)
            goto Lc1
        Lb5:
            java.lang.String r5 = "Current network is not available."
            c.a.c.a.d.a(r5)
            java.lang.String r5 = c.a.c.a.a.a(r5)
            r2.add(r5)
        Lc1:
            java.lang.String r5 = "syncConnect end"
            c.a.c.a.d.a(r5)
            int r4 = r4 + 1
            goto L33
        Lca:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "--iiiiii:"
            r5.append(r7)
            r5.append(r4)
            java.lang.String r7 = "<><>paramList.size():"
            r5.append(r7)
            int r7 = r15.size()
            r5.append(r7)
            java.lang.String r7 = "<><>authResults.size():"
            r5.append(r7)
            int r7 = r2.size()
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            c.a.c.a.d.a(r5)
            int r5 = r15.size()
            if (r5 <= 0) goto L155
            int r0 = r15.size()
            if (r4 != r0) goto L155
            int r0 = r2.size()
            if (r0 <= 0) goto L155
            int r0 = r2.size()
            if (r4 != r0) goto L155
            int r4 = r4 + (-1)
            if (r4 <= 0) goto L155
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L138
            java.lang.Object r4 = r2.get(r4)     // Catch: org.json.JSONException -> L138
            java.lang.String r4 = (java.lang.String) r4     // Catch: org.json.JSONException -> L138
            r0.<init>(r4)     // Catch: org.json.JSONException -> L138
            boolean r4 = r0.has(r6)     // Catch: org.json.JSONException -> L138
            if (r4 == 0) goto L155
            int r0 = r0.getInt(r6)     // Catch: org.json.JSONException -> L138
            if (r0 == 0) goto L155
            java.lang.String r0 = "i-1 result is not 0,return first result"
            c.a.c.a.d.a(r0)     // Catch: org.json.JSONException -> L138
            java.lang.Object r0 = r2.get(r3)     // Catch: org.json.JSONException -> L138
            java.lang.String r0 = (java.lang.String) r0     // Catch: org.json.JSONException -> L138
            r14.a(r0)     // Catch: org.json.JSONException -> L138
            return
        L138:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "JSONException:"
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = c.a.c.a.a.a(r0)
            r14.a(r0)
        L155:
            return
        L156:
            java.lang.String r0 = "syncConnect failed,params list is null or size is 0"
            c.a.c.a.d.c(r0)
            return
    }

    protected void a(java.util.HashMap r7, java.lang.String[] r8, java.lang.String r9, int r10, java.lang.String r11, java.lang.String r12, c.a.c.a.i.a r13) {
            r6 = this;
            java.util.List r7 = r6.a(r7, r8)
            r6.f1298b = r7
            r6.f1299c = r13
            java.lang.Thread r7 = new java.lang.Thread
            c.a.c.a.j r8 = new c.a.c.a.j
            r0 = r8
            r1 = r6
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r7.<init>(r8)
            r7.start()
            return
    }
}
