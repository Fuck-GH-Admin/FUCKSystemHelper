package a.a.a.b;

/* JADX INFO: loaded from: classes.dex */
public class b {

    public static /* synthetic */ class a {
    }

    /* JADX INFO: renamed from: a.a.a.b.b$b, reason: collision with other inner class name */
    public static class C0001b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a.a.a.b.b f7a = null;

        static {
                a.a.a.b.b r0 = new a.a.a.b.b
                r1 = 0
                r0.<init>(r1)
                a.a.a.b.b.C0001b.f7a = r0
                return
        }
    }

    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    public /* synthetic */ b(a.a.a.b.b.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static a.a.a.b.b a() {
            a.a.a.b.b r0 = a.a.a.b.b.C0001b.f7a
            return r0
    }

    public void a(android.content.Context r6) {
            r5 = this;
            java.lang.String r0 = "UrlConfigManger"
            java.lang.String r1 = "updateUrl"
            android.util.Log.d(r0, r1)
            if (r6 != 0) goto La
            return
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L74
            r0.<init>()     // Catch: java.lang.Exception -> L74
            java.lang.String r1 = android.os.Environment.DIRECTORY_MOVIES     // Catch: java.lang.Exception -> L74
            java.io.File r6 = r6.getExternalFilesDir(r1)     // Catch: java.lang.Exception -> L74
            r0.append(r6)     // Catch: java.lang.Exception -> L74
            java.lang.String r6 = java.io.File.separator     // Catch: java.lang.Exception -> L74
            r0.append(r6)     // Catch: java.lang.Exception -> L74
            java.lang.String r1 = "baiduLocDev"
            r0.append(r1)     // Catch: java.lang.Exception -> L74
            r0.append(r6)     // Catch: java.lang.Exception -> L74
            java.lang.String r6 = "loc_local_config"
            r0.append(r6)     // Catch: java.lang.Exception -> L74
            java.lang.String r6 = r0.toString()     // Catch: java.lang.Exception -> L74
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r1 = new java.io.File     // Catch: java.io.IOException -> L6a java.io.FileNotFoundException -> L6f
            r1.<init>(r6)     // Catch: java.io.IOException -> L6a java.io.FileNotFoundException -> L6f
            boolean r1 = r1.exists()     // Catch: java.io.IOException -> L6a java.io.FileNotFoundException -> L6f
            if (r1 != 0) goto L46
            java.lang.String r5 = "baidu_location_dev"
            java.lang.String r6 = "loc_local_config not exit..."
            android.util.Log.d(r5, r6)     // Catch: java.io.IOException -> L6a java.io.FileNotFoundException -> L6f
            return
        L46:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.io.IOException -> L6a java.io.FileNotFoundException -> L6f
            r1.<init>(r6)     // Catch: java.io.IOException -> L6a java.io.FileNotFoundException -> L6f
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch: java.io.IOException -> L6a java.io.FileNotFoundException -> L6f
        L4f:
            int r2 = r1.read(r6)     // Catch: java.io.IOException -> L6a java.io.FileNotFoundException -> L6f
            if (r2 <= 0) goto L5f
            java.lang.String r3 = new java.lang.String     // Catch: java.io.IOException -> L6a java.io.FileNotFoundException -> L6f
            r4 = 0
            r3.<init>(r6, r4, r2)     // Catch: java.io.IOException -> L6a java.io.FileNotFoundException -> L6f
            r0.append(r3)     // Catch: java.io.IOException -> L6a java.io.FileNotFoundException -> L6f
            goto L4f
        L5f:
            r1.close()     // Catch: java.io.IOException -> L6a java.io.FileNotFoundException -> L6f
            java.lang.String r6 = r0.toString()     // Catch: java.io.IOException -> L6a java.io.FileNotFoundException -> L6f
            r5.a(r6)     // Catch: java.io.IOException -> L6a java.io.FileNotFoundException -> L6f
            goto L73
        L6a:
            r5 = move-exception
            r5.printStackTrace()
            goto L73
        L6f:
            r5 = move-exception
            r5.printStackTrace()
        L73:
            return
        L74:
            r5 = move-exception
            r5.printStackTrace()
            return
    }

    public final void a(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            java.lang.String r1 = "UrlConfigManger"
            java.lang.String r0 = "setConfig"
            android.util.Log.d(r1, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "type:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", owner: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " ,url: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "baidu_location_dev"
            android.util.Log.d(r0, r1)
            java.lang.String r1 = "default_owner"
            boolean r1 = r3.contains(r1)
            if (r1 != 0) goto Lc7
            java.lang.String r1 = "default_url"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto Lc7
            java.lang.String r1 = "https"
            boolean r1 = r4.contains(r1)
            if (r1 != 0) goto L47
            goto Lc7
        L47:
            r2.hashCode()
            r1 = -1
            int r3 = r2.hashCode()
            switch(r3) {
                case -2127949679: goto La1;
                case -1995140673: goto L96;
                case -1085732228: goto L8b;
                case -821738631: goto L80;
                case -508470037: goto L75;
                case 107328: goto L6a;
                case 3050639: goto L5f;
                case 439947811: goto L54;
                default: goto L52;
            }
        L52:
            goto Lab
        L54:
            java.lang.String r3 = "indoor_rects"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L5d
            goto Lab
        L5d:
            r1 = 7
            goto Lab
        L5f:
            java.lang.String r3 = "cfgs"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L68
            goto Lab
        L68:
            r1 = 6
            goto Lab
        L6a:
            java.lang.String r3 = "loc"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L73
            goto Lab
        L73:
            r1 = 5
            goto Lab
        L75:
            java.lang.String r3 = "indoor_poi_data"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L7e
            goto Lab
        L7e:
            r1 = 4
            goto Lab
        L80:
            java.lang.String r3 = "basement_inout"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L89
            goto Lab
        L89:
            r1 = 3
            goto Lab
        L8b:
            java.lang.String r3 = "hdyawupdate"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L94
            goto Lab
        L94:
            r1 = 2
            goto Lab
        L96:
            java.lang.String r3 = "vdr_log_update"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L9f
            goto Lab
        L9f:
            r1 = 1
            goto Lab
        La1:
            java.lang.String r3 = "indoor_roadnet"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Laa
            goto Lab
        Laa:
            r1 = 0
        Lab:
            switch(r1) {
                case 0: goto Lc4;
                case 1: goto Lc1;
                case 2: goto Lbe;
                case 3: goto Lbb;
                case 4: goto Lb8;
                case 5: goto Lb5;
                case 6: goto Lb2;
                case 7: goto Laf;
                default: goto Lae;
            }
        Lae:
            goto Lc6
        Laf:
            a.a.a.i.d.e = r4
            goto Lc6
        Lb2:
            a.a.a.i.d.f325c = r4
            goto Lc6
        Lb5:
            a.a.a.i.d.f324b = r4
            goto Lc6
        Lb8:
            a.a.a.i.d.f = r4
            goto Lc6
        Lbb:
            a.a.a.i.d.i = r4
            goto Lc6
        Lbe:
            a.a.a.i.d.h = r4
            goto Lc6
        Lc1:
            a.a.a.i.d.g = r4
            goto Lc6
        Lc4:
            a.a.a.i.d.d = r4
        Lc6:
            return
        Lc7:
            java.lang.String r1 = "url 不合法"
            android.util.Log.d(r0, r1)
            return
    }

    public final boolean a(java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = "url_config"
            java.lang.String r1 = "UrlConfigManger"
            java.lang.String r2 = "parseConfig"
            android.util.Log.d(r1, r2)
            r1 = 0
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L40
            r2.<init>(r7)     // Catch: org.json.JSONException -> L40
            boolean r7 = r2.has(r0)     // Catch: org.json.JSONException -> L40
            if (r7 == 0) goto L3e
            org.json.JSONArray r7 = r2.optJSONArray(r0)     // Catch: org.json.JSONException -> L40
            if (r7 == 0) goto L3e
            r0 = r1
        L1c:
            int r2 = r7.length()     // Catch: org.json.JSONException -> L40
            if (r0 >= r2) goto L3e
            org.json.JSONObject r2 = r7.optJSONObject(r0)     // Catch: org.json.JSONException -> L40
            java.lang.String r3 = "type"
            java.lang.String r3 = r2.optString(r3)     // Catch: org.json.JSONException -> L40
            java.lang.String r4 = "owner"
            java.lang.String r4 = r2.optString(r4)     // Catch: org.json.JSONException -> L40
            java.lang.String r5 = "url"
            java.lang.String r2 = r2.optString(r5)     // Catch: org.json.JSONException -> L40
            r6.a(r3, r4, r2)     // Catch: org.json.JSONException -> L40
            int r0 = r0 + 1
            goto L1c
        L3e:
            r6 = 1
            return r6
        L40:
            r6 = move-exception
            r6.printStackTrace()
            return r1
    }
}
