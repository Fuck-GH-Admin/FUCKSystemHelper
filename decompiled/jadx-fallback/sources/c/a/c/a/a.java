package c.a.c.a;

/* JADX INFO: loaded from: classes.dex */
class a {
    static java.lang.String a(int r2, java.lang.String r3) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "status"
            r0.put(r1, r2)     // Catch: org.json.JSONException -> Lf
            java.lang.String r2 = "message"
            r0.put(r2, r3)     // Catch: org.json.JSONException -> Lf
        Lf:
            java.lang.String r2 = r0.toString()
            return r2
    }

    static java.lang.String a(java.lang.String r3) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "status"
            r2 = -1
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L10
            java.lang.String r1 = "message"
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L10
        L10:
            java.lang.String r3 = r0.toString()
            return r3
    }
}
