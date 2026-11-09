package a.a.a.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static int h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.String f337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.String f339c;
    public java.util.Map<java.lang.String, java.lang.Object> d;
    public byte[] e;
    public java.lang.String f;
    public long g;

    public class a implements a.a.a.b.q.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.a.a.i.g f341b;

        public a(a.a.a.i.g r1, long r2) {
                r0 = this;
                r0.f341b = r1
                r0.f340a = r2
                r0.<init>()
                return
        }

        @Override // a.a.a.b.q.a
        public void a(int r5, java.lang.String r6) {
                r4 = this;
                r0 = 200(0xc8, float:2.8E-43)
                if (r5 != r0) goto L15
                a.a.a.i.g r5 = r4.f341b
                long r0 = java.lang.System.currentTimeMillis()
                long r2 = r4.f340a
                long r0 = r0 - r2
                r5.g = r0
                a.a.a.i.g r4 = r4.f341b
                r4.f339c = r6
                r5 = 1
                goto L1b
            L15:
                a.a.a.i.g r4 = r4.f341b
                r5 = 0
                r4.f339c = r5
                r5 = 0
            L1b:
                r4.a(r5)
                return
        }

        @Override // a.a.a.b.q.a
        public void b(int r1, java.lang.String r2) {
                r0 = this;
                a.a.a.i.g r0 = r0.f341b
                r1 = 0
                r0.f339c = r1
                r1 = 0
                r0.a(r1)
                return
        }
    }

    public class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f342b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f343c;
        public final /* synthetic */ a.a.a.i.g d;

        public b(a.a.a.i.g r1, java.lang.String r2, boolean r3) {
                r0 = this;
                r0.d = r1
                r0.f342b = r2
                r0.f343c = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r16 = this;
                r0 = r16
                java.lang.String r1 = "gzip"
                java.lang.String r2 = "close baos IOException!"
                java.lang.String r3 = "close is IOException!"
                java.lang.String r4 = "close os IOException!"
                java.lang.String r5 = "baidu_location_service"
                a.a.a.i.g r6 = r0.d
                java.lang.String r7 = a.a.a.i.d.f324b
                r6.f337a = r7
                r6.a()
                a.a.a.i.g r6 = r0.d
                int r6 = r6.f338b
                r8 = 0
            L1a:
                r9 = 0
                r10 = 1
                if (r6 <= 0) goto L1ec
                java.net.URL r11 = new java.net.URL     // Catch: java.lang.Throwable -> L167 java.lang.Error -> L16f java.lang.Exception -> L193
                a.a.a.i.g r12 = r0.d     // Catch: java.lang.Throwable -> L167 java.lang.Error -> L16f java.lang.Exception -> L193
                java.lang.String r12 = r12.f337a     // Catch: java.lang.Throwable -> L167 java.lang.Error -> L16f java.lang.Exception -> L193
                r11.<init>(r12)     // Catch: java.lang.Throwable -> L167 java.lang.Error -> L16f java.lang.Exception -> L193
                java.lang.StringBuffer r12 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L167 java.lang.Error -> L16f java.lang.Exception -> L193
                r12.<init>()     // Catch: java.lang.Throwable -> L167 java.lang.Error -> L16f java.lang.Exception -> L193
                a.a.a.i.g r13 = r0.d     // Catch: java.lang.Throwable -> L167 java.lang.Error -> L16f java.lang.Exception -> L193
                java.util.Map<java.lang.String, java.lang.Object> r13 = r13.d     // Catch: java.lang.Throwable -> L167 java.lang.Error -> L16f java.lang.Exception -> L193
                java.util.Set r13 = r13.entrySet()     // Catch: java.lang.Throwable -> L167 java.lang.Error -> L16f java.lang.Exception -> L193
                java.util.Iterator r13 = r13.iterator()     // Catch: java.lang.Throwable -> L167 java.lang.Error -> L16f java.lang.Exception -> L193
            L38:
                boolean r14 = r13.hasNext()     // Catch: java.lang.Throwable -> L167 java.lang.Error -> L16f java.lang.Exception -> L193
                if (r14 == 0) goto L5f
                java.lang.Object r14 = r13.next()     // Catch: java.lang.Throwable -> L167 java.lang.Error -> L16f java.lang.Exception -> L193
                java.util.Map$Entry r14 = (java.util.Map.Entry) r14     // Catch: java.lang.Throwable -> L167 java.lang.Error -> L16f java.lang.Exception -> L193
                java.lang.Object r15 = r14.getKey()     // Catch: java.lang.Throwable -> L167 java.lang.Error -> L16f java.lang.Exception -> L193
                java.lang.String r15 = (java.lang.String) r15     // Catch: java.lang.Throwable -> L167 java.lang.Error -> L16f java.lang.Exception -> L193
                r12.append(r15)     // Catch: java.lang.Throwable -> L167 java.lang.Error -> L16f java.lang.Exception -> L193
                java.lang.String r15 = "="
                r12.append(r15)     // Catch: java.lang.Throwable -> L167 java.lang.Error -> L16f java.lang.Exception -> L193
                java.lang.Object r14 = r14.getValue()     // Catch: java.lang.Throwable -> L167 java.lang.Error -> L16f java.lang.Exception -> L193
                r12.append(r14)     // Catch: java.lang.Throwable -> L167 java.lang.Error -> L16f java.lang.Exception -> L193
                java.lang.String r14 = "&"
                r12.append(r14)     // Catch: java.lang.Throwable -> L167 java.lang.Error -> L16f java.lang.Exception -> L193
                goto L38
            L5f:
                int r13 = r12.length()     // Catch: java.lang.Throwable -> L167 java.lang.Error -> L16f java.lang.Exception -> L193
                if (r13 <= 0) goto L6d
                int r13 = r12.length()     // Catch: java.lang.Throwable -> L167 java.lang.Error -> L16f java.lang.Exception -> L193
                int r13 = r13 - r10
                r12.deleteCharAt(r13)     // Catch: java.lang.Throwable -> L167 java.lang.Error -> L16f java.lang.Exception -> L193
            L6d:
                java.net.URLConnection r11 = r11.openConnection()     // Catch: java.lang.Throwable -> L167 java.lang.Error -> L16f java.lang.Exception -> L193
                javax.net.ssl.HttpsURLConnection r11 = (javax.net.ssl.HttpsURLConnection) r11     // Catch: java.lang.Throwable -> L167 java.lang.Error -> L16f java.lang.Exception -> L193
                java.lang.String r8 = "POST"
                r11.setRequestMethod(r8)     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L163 java.lang.Exception -> L165
                r11.setDoInput(r10)     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L163 java.lang.Exception -> L165
                r11.setDoOutput(r10)     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L163 java.lang.Exception -> L165
                r11.setUseCaches(r9)     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L163 java.lang.Exception -> L165
                int r8 = a.a.a.i.a.f316a     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L163 java.lang.Exception -> L165
                r11.setConnectTimeout(r8)     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L163 java.lang.Exception -> L165
                int r8 = a.a.a.i.a.f316a     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L163 java.lang.Exception -> L165
                r11.setReadTimeout(r8)     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L163 java.lang.Exception -> L165
                java.lang.String r8 = "Content-Type"
                java.lang.String r13 = "application/x-www-form-urlencoded; charset=utf-8"
                r11.setRequestProperty(r8, r13)     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L163 java.lang.Exception -> L165
                java.lang.String r8 = "Accept-Charset"
                java.lang.String r13 = "UTF-8"
                r11.setRequestProperty(r8, r13)     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L163 java.lang.Exception -> L165
                java.lang.String r8 = "Accept-Encoding"
                r11.setRequestProperty(r8, r1)     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L163 java.lang.Exception -> L165
                java.lang.String r8 = a.a.a.i.i.o0     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L163 java.lang.Exception -> L165
                if (r8 == 0) goto La7
                java.lang.String r13 = "bd-loc-android"
                r11.setRequestProperty(r13, r8)     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L163 java.lang.Exception -> L165
            La7:
                java.lang.String r8 = r0.f342b     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L163 java.lang.Exception -> L165
                boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L163 java.lang.Exception -> L165
                if (r8 != 0) goto Lb6
                java.lang.String r8 = "Host"
                java.lang.String r13 = r0.f342b     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L163 java.lang.Exception -> L165
                r11.setRequestProperty(r8, r13)     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L163 java.lang.Exception -> L165
            Lb6:
                java.io.OutputStream r8 = r11.getOutputStream()     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L163 java.lang.Exception -> L165
                java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L156 java.lang.Error -> L15a java.lang.Exception -> L15d
                byte[] r12 = r12.getBytes()     // Catch: java.lang.Throwable -> L156 java.lang.Error -> L15a java.lang.Exception -> L15d
                r8.write(r12)     // Catch: java.lang.Throwable -> L156 java.lang.Error -> L15a java.lang.Exception -> L15d
                r8.flush()     // Catch: java.lang.Throwable -> L156 java.lang.Error -> L15a java.lang.Exception -> L15d
                int r12 = r11.getResponseCode()     // Catch: java.lang.Throwable -> L156 java.lang.Error -> L15a java.lang.Exception -> L15d
                r13 = 200(0xc8, float:2.8E-43)
                if (r12 != r13) goto L135
                java.io.InputStream r12 = r11.getInputStream()     // Catch: java.lang.Throwable -> L156 java.lang.Error -> L15a java.lang.Exception -> L15d
                java.lang.String r13 = r11.getContentEncoding()     // Catch: java.lang.Throwable -> L12a java.lang.Error -> L12e java.lang.Exception -> L131
                if (r13 == 0) goto Leb
                boolean r13 = r13.contains(r1)     // Catch: java.lang.Throwable -> L12a java.lang.Error -> L12e java.lang.Exception -> L131
                if (r13 == 0) goto Leb
                java.util.zip.GZIPInputStream r13 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L12a java.lang.Error -> L12e java.lang.Exception -> L131
                java.io.BufferedInputStream r14 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L12a java.lang.Error -> L12e java.lang.Exception -> L131
                r14.<init>(r12)     // Catch: java.lang.Throwable -> L12a java.lang.Error -> L12e java.lang.Exception -> L131
                r13.<init>(r14)     // Catch: java.lang.Throwable -> L12a java.lang.Error -> L12e java.lang.Exception -> L131
                r12 = r13
            Leb:
                java.io.ByteArrayOutputStream r13 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L121 java.lang.Error -> L124 java.lang.Exception -> L127
                r13.<init>()     // Catch: java.lang.Throwable -> L121 java.lang.Error -> L124 java.lang.Exception -> L127
                r14 = 1024(0x400, float:1.435E-42)
                byte[] r14 = new byte[r14]     // Catch: java.lang.Error -> L174 java.lang.Exception -> L198 java.lang.Throwable -> L1c9
            Lf4:
                int r15 = r12.read(r14)     // Catch: java.lang.Error -> L174 java.lang.Exception -> L198 java.lang.Throwable -> L1c9
                r7 = -1
                if (r15 == r7) goto Lff
                r13.write(r14, r9, r15)     // Catch: java.lang.Error -> L174 java.lang.Exception -> L198 java.lang.Throwable -> L1c9
                goto Lf4
            Lff:
                a.a.a.i.g r7 = r0.d     // Catch: java.lang.Error -> L174 java.lang.Exception -> L198 java.lang.Throwable -> L1c9
                java.lang.String r14 = new java.lang.String     // Catch: java.lang.Error -> L174 java.lang.Exception -> L198 java.lang.Throwable -> L1c9
                byte[] r15 = r13.toByteArray()     // Catch: java.lang.Error -> L174 java.lang.Exception -> L198 java.lang.Throwable -> L1c9
                java.lang.String r9 = "utf-8"
                r14.<init>(r15, r9)     // Catch: java.lang.Error -> L174 java.lang.Exception -> L198 java.lang.Throwable -> L1c9
                r7.f339c = r14     // Catch: java.lang.Error -> L174 java.lang.Exception -> L198 java.lang.Throwable -> L1c9
                boolean r7 = r0.f343c     // Catch: java.lang.Error -> L174 java.lang.Exception -> L198 java.lang.Throwable -> L1c9
                if (r7 == 0) goto L11a
                a.a.a.i.g r7 = r0.d     // Catch: java.lang.Error -> L174 java.lang.Exception -> L198 java.lang.Throwable -> L1c9
                byte[] r9 = r13.toByteArray()     // Catch: java.lang.Error -> L174 java.lang.Exception -> L198 java.lang.Throwable -> L1c9
                r7.e = r9     // Catch: java.lang.Error -> L174 java.lang.Exception -> L198 java.lang.Throwable -> L1c9
            L11a:
                a.a.a.i.g r7 = r0.d     // Catch: java.lang.Error -> L174 java.lang.Exception -> L198 java.lang.Throwable -> L1c9
                r7.a(r10)     // Catch: java.lang.Error -> L174 java.lang.Exception -> L198 java.lang.Throwable -> L1c9
                r7 = r10
                goto L138
            L121:
                r0 = move-exception
                goto L16c
            L124:
                r13 = 0
                goto L174
            L127:
                r13 = 0
                goto L198
            L12a:
                r0 = move-exception
                r7 = r8
                r8 = r11
                goto L16a
            L12e:
                r7 = r8
                r8 = r11
                goto L171
            L131:
                r7 = r8
                r8 = r11
                goto L195
            L135:
                r7 = 0
                r12 = 0
                r13 = 0
            L138:
                if (r11 == 0) goto L13d
                r11.disconnect()
            L13d:
                if (r8 == 0) goto L146
                r8.close()     // Catch: java.lang.Exception -> L143
                goto L146
            L143:
                android.util.Log.d(r5, r4)
            L146:
                if (r12 == 0) goto L14f
                r12.close()     // Catch: java.lang.Exception -> L14c
                goto L14f
            L14c:
                android.util.Log.d(r5, r3)
            L14f:
                if (r13 == 0) goto L1be
                r13.close()     // Catch: java.lang.Exception -> L1bb
                goto L1be
            L156:
                r0 = move-exception
                r7 = r8
                r8 = r11
                goto L169
            L15a:
                r7 = r8
                r8 = r11
                goto L170
            L15d:
                r7 = r8
                r8 = r11
                goto L194
            L160:
                r0 = move-exception
                r8 = r11
                goto L168
            L163:
                r8 = r11
                goto L16f
            L165:
                r8 = r11
                goto L193
            L167:
                r0 = move-exception
            L168:
                r7 = 0
            L169:
                r12 = 0
            L16a:
                r11 = r8
                r8 = r7
            L16c:
                r7 = 0
                goto L1cb
            L16f:
                r7 = 0
            L170:
                r12 = 0
            L171:
                r11 = r8
                r13 = 0
                r8 = r7
            L174:
                java.lang.String r7 = "NetworkCommunicationError!"
                android.util.Log.d(r5, r7)     // Catch: java.lang.Throwable -> L1c9
                if (r11 == 0) goto L17e
                r11.disconnect()
            L17e:
                if (r8 == 0) goto L187
                r8.close()     // Catch: java.lang.Exception -> L184
                goto L187
            L184:
                android.util.Log.d(r5, r4)
            L187:
                if (r12 == 0) goto L190
                r12.close()     // Catch: java.lang.Exception -> L18d
                goto L190
            L18d:
                android.util.Log.d(r5, r3)
            L190:
                if (r13 == 0) goto L1c0
                goto L1b6
            L193:
                r7 = 0
            L194:
                r12 = 0
            L195:
                r11 = r8
                r13 = 0
                r8 = r7
            L198:
                java.lang.String r7 = "NetworkCommunicationException!"
                android.util.Log.d(r5, r7)     // Catch: java.lang.Throwable -> L1c9
                if (r11 == 0) goto L1a2
                r11.disconnect()
            L1a2:
                if (r8 == 0) goto L1ab
                r8.close()     // Catch: java.lang.Exception -> L1a8
                goto L1ab
            L1a8:
                android.util.Log.d(r5, r4)
            L1ab:
                if (r12 == 0) goto L1b4
                r12.close()     // Catch: java.lang.Exception -> L1b1
                goto L1b4
            L1b1:
                android.util.Log.d(r5, r3)
            L1b4:
                if (r13 == 0) goto L1c0
            L1b6:
                r13.close()     // Catch: java.lang.Exception -> L1ba
                goto L1c0
            L1ba:
                r7 = 0
            L1bb:
                android.util.Log.d(r5, r2)
            L1be:
                r8 = r11
                goto L1c2
            L1c0:
                r8 = r11
                r7 = 0
            L1c2:
                if (r7 == 0) goto L1c5
                goto L1ec
            L1c5:
                int r6 = r6 + (-1)
                goto L1a
            L1c9:
                r0 = move-exception
                r7 = r13
            L1cb:
                if (r11 == 0) goto L1d0
                r11.disconnect()
            L1d0:
                if (r8 == 0) goto L1d9
                r8.close()     // Catch: java.lang.Exception -> L1d6
                goto L1d9
            L1d6:
                android.util.Log.d(r5, r4)
            L1d9:
                if (r12 == 0) goto L1e2
                r12.close()     // Catch: java.lang.Exception -> L1df
                goto L1e2
            L1df:
                android.util.Log.d(r5, r3)
            L1e2:
                if (r7 == 0) goto L1eb
                r7.close()     // Catch: java.lang.Exception -> L1e8
                goto L1eb
            L1e8:
                android.util.Log.d(r5, r2)
            L1eb:
                throw r0
            L1ec:
                if (r6 > 0) goto L1fd
                int r1 = a.a.a.i.g.h
                int r1 = r1 + r10
                a.a.a.i.g.h = r1
                a.a.a.i.g r0 = r0.d
                r1 = 0
                r0.f339c = r1
                r1 = 0
                r0.a(r1)
                goto L200
            L1fd:
                r1 = 0
                a.a.a.i.g.h = r1
            L200:
                return
        }
    }

    public class c extends java.lang.Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f344b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f345c;
        public final /* synthetic */ a.a.a.i.g d;

        public c(a.a.a.i.g r1, java.lang.String r2, boolean r3) {
                r0 = this;
                r0.d = r1
                r0.f344b = r2
                r0.f345c = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r16 = this;
                r0 = r16
                java.lang.String r1 = "gzip"
                java.lang.String r2 = "close baos IOException!"
                java.lang.String r3 = "close is IOException!"
                java.lang.String r4 = "close os IOException!"
                java.lang.String r5 = "baidu_location_service"
                a.a.a.i.g r6 = r0.d
                java.lang.String r7 = a.a.a.i.d.f324b
                r6.f337a = r7
                r6.a()
                a.a.a.i.g r6 = r0.d
                int r6 = r6.f338b
                r8 = 0
            L1a:
                r9 = 0
                r10 = 1
                if (r6 <= 0) goto L1fb
                javax.net.ssl.SSLSocketFactory r11 = a.a.a.i.i.g()     // Catch: java.lang.Throwable -> L176 java.lang.Error -> L17e java.lang.Exception -> L1a2
                javax.net.ssl.HttpsURLConnection.setDefaultSSLSocketFactory(r11)     // Catch: java.lang.Throwable -> L176 java.lang.Error -> L17e java.lang.Exception -> L1a2
                java.net.URL r11 = new java.net.URL     // Catch: java.lang.Throwable -> L176 java.lang.Error -> L17e java.lang.Exception -> L1a2
                a.a.a.i.g r12 = r0.d     // Catch: java.lang.Throwable -> L176 java.lang.Error -> L17e java.lang.Exception -> L1a2
                java.lang.String r12 = r12.f337a     // Catch: java.lang.Throwable -> L176 java.lang.Error -> L17e java.lang.Exception -> L1a2
                r11.<init>(r12)     // Catch: java.lang.Throwable -> L176 java.lang.Error -> L17e java.lang.Exception -> L1a2
                java.lang.StringBuffer r12 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L176 java.lang.Error -> L17e java.lang.Exception -> L1a2
                r12.<init>()     // Catch: java.lang.Throwable -> L176 java.lang.Error -> L17e java.lang.Exception -> L1a2
                a.a.a.i.g r13 = r0.d     // Catch: java.lang.Throwable -> L176 java.lang.Error -> L17e java.lang.Exception -> L1a2
                java.util.Map<java.lang.String, java.lang.Object> r13 = r13.d     // Catch: java.lang.Throwable -> L176 java.lang.Error -> L17e java.lang.Exception -> L1a2
                java.util.Set r13 = r13.entrySet()     // Catch: java.lang.Throwable -> L176 java.lang.Error -> L17e java.lang.Exception -> L1a2
                java.util.Iterator r13 = r13.iterator()     // Catch: java.lang.Throwable -> L176 java.lang.Error -> L17e java.lang.Exception -> L1a2
            L3f:
                boolean r14 = r13.hasNext()     // Catch: java.lang.Throwable -> L176 java.lang.Error -> L17e java.lang.Exception -> L1a2
                if (r14 == 0) goto L66
                java.lang.Object r14 = r13.next()     // Catch: java.lang.Throwable -> L176 java.lang.Error -> L17e java.lang.Exception -> L1a2
                java.util.Map$Entry r14 = (java.util.Map.Entry) r14     // Catch: java.lang.Throwable -> L176 java.lang.Error -> L17e java.lang.Exception -> L1a2
                java.lang.Object r15 = r14.getKey()     // Catch: java.lang.Throwable -> L176 java.lang.Error -> L17e java.lang.Exception -> L1a2
                java.lang.String r15 = (java.lang.String) r15     // Catch: java.lang.Throwable -> L176 java.lang.Error -> L17e java.lang.Exception -> L1a2
                r12.append(r15)     // Catch: java.lang.Throwable -> L176 java.lang.Error -> L17e java.lang.Exception -> L1a2
                java.lang.String r15 = "="
                r12.append(r15)     // Catch: java.lang.Throwable -> L176 java.lang.Error -> L17e java.lang.Exception -> L1a2
                java.lang.Object r14 = r14.getValue()     // Catch: java.lang.Throwable -> L176 java.lang.Error -> L17e java.lang.Exception -> L1a2
                r12.append(r14)     // Catch: java.lang.Throwable -> L176 java.lang.Error -> L17e java.lang.Exception -> L1a2
                java.lang.String r14 = "&"
                r12.append(r14)     // Catch: java.lang.Throwable -> L176 java.lang.Error -> L17e java.lang.Exception -> L1a2
                goto L3f
            L66:
                int r13 = r12.length()     // Catch: java.lang.Throwable -> L176 java.lang.Error -> L17e java.lang.Exception -> L1a2
                if (r13 <= 0) goto L74
                int r13 = r12.length()     // Catch: java.lang.Throwable -> L176 java.lang.Error -> L17e java.lang.Exception -> L1a2
                int r13 = r13 - r10
                r12.deleteCharAt(r13)     // Catch: java.lang.Throwable -> L176 java.lang.Error -> L17e java.lang.Exception -> L1a2
            L74:
                java.net.URLConnection r13 = r11.openConnection()     // Catch: java.lang.Throwable -> L176 java.lang.Error -> L17e java.lang.Exception -> L1a2
                javax.net.ssl.HttpsURLConnection r13 = (javax.net.ssl.HttpsURLConnection) r13     // Catch: java.lang.Throwable -> L176 java.lang.Error -> L17e java.lang.Exception -> L1a2
                java.lang.String r8 = "POST"
                r13.setRequestMethod(r8)     // Catch: java.lang.Throwable -> L16f java.lang.Error -> L172 java.lang.Exception -> L174
                r13.setDoInput(r10)     // Catch: java.lang.Throwable -> L16f java.lang.Error -> L172 java.lang.Exception -> L174
                r13.setDoOutput(r10)     // Catch: java.lang.Throwable -> L16f java.lang.Error -> L172 java.lang.Exception -> L174
                r13.setUseCaches(r9)     // Catch: java.lang.Throwable -> L16f java.lang.Error -> L172 java.lang.Exception -> L174
                int r8 = a.a.a.i.a.f316a     // Catch: java.lang.Throwable -> L16f java.lang.Error -> L172 java.lang.Exception -> L174
                r13.setConnectTimeout(r8)     // Catch: java.lang.Throwable -> L16f java.lang.Error -> L172 java.lang.Exception -> L174
                int r8 = a.a.a.i.a.f316a     // Catch: java.lang.Throwable -> L16f java.lang.Error -> L172 java.lang.Exception -> L174
                r13.setReadTimeout(r8)     // Catch: java.lang.Throwable -> L16f java.lang.Error -> L172 java.lang.Exception -> L174
                a.a.a.i.g$g r8 = new a.a.a.i.g$g     // Catch: java.lang.Throwable -> L16f java.lang.Error -> L172 java.lang.Exception -> L174
                r8.<init>(r11)     // Catch: java.lang.Throwable -> L16f java.lang.Error -> L172 java.lang.Exception -> L174
                r13.setHostnameVerifier(r8)     // Catch: java.lang.Throwable -> L16f java.lang.Error -> L172 java.lang.Exception -> L174
                java.lang.String r8 = "Content-Type"
                java.lang.String r11 = "application/x-www-form-urlencoded; charset=utf-8"
                r13.setRequestProperty(r8, r11)     // Catch: java.lang.Throwable -> L16f java.lang.Error -> L172 java.lang.Exception -> L174
                java.lang.String r8 = "Accept-Charset"
                java.lang.String r11 = "UTF-8"
                r13.setRequestProperty(r8, r11)     // Catch: java.lang.Throwable -> L16f java.lang.Error -> L172 java.lang.Exception -> L174
                java.lang.String r8 = "Accept-Encoding"
                r13.setRequestProperty(r8, r1)     // Catch: java.lang.Throwable -> L16f java.lang.Error -> L172 java.lang.Exception -> L174
                java.lang.String r8 = a.a.a.i.i.o0     // Catch: java.lang.Throwable -> L16f java.lang.Error -> L172 java.lang.Exception -> L174
                if (r8 == 0) goto Lb6
                java.lang.String r11 = "bd-loc-android"
                r13.setRequestProperty(r11, r8)     // Catch: java.lang.Throwable -> L16f java.lang.Error -> L172 java.lang.Exception -> L174
            Lb6:
                java.lang.String r8 = r0.f344b     // Catch: java.lang.Throwable -> L16f java.lang.Error -> L172 java.lang.Exception -> L174
                boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L16f java.lang.Error -> L172 java.lang.Exception -> L174
                if (r8 != 0) goto Lc5
                java.lang.String r8 = "Host"
                java.lang.String r11 = r0.f344b     // Catch: java.lang.Throwable -> L16f java.lang.Error -> L172 java.lang.Exception -> L174
                r13.setRequestProperty(r8, r11)     // Catch: java.lang.Throwable -> L16f java.lang.Error -> L172 java.lang.Exception -> L174
            Lc5:
                java.io.OutputStream r8 = r13.getOutputStream()     // Catch: java.lang.Throwable -> L16f java.lang.Error -> L172 java.lang.Exception -> L174
                java.lang.String r11 = r12.toString()     // Catch: java.lang.Throwable -> L165 java.lang.Error -> L169 java.lang.Exception -> L16c
                byte[] r11 = r11.getBytes()     // Catch: java.lang.Throwable -> L165 java.lang.Error -> L169 java.lang.Exception -> L16c
                r8.write(r11)     // Catch: java.lang.Throwable -> L165 java.lang.Error -> L169 java.lang.Exception -> L16c
                r8.flush()     // Catch: java.lang.Throwable -> L165 java.lang.Error -> L169 java.lang.Exception -> L16c
                int r11 = r13.getResponseCode()     // Catch: java.lang.Throwable -> L165 java.lang.Error -> L169 java.lang.Exception -> L16c
                r12 = 200(0xc8, float:2.8E-43)
                if (r11 != r12) goto L144
                java.io.InputStream r11 = r13.getInputStream()     // Catch: java.lang.Throwable -> L165 java.lang.Error -> L169 java.lang.Exception -> L16c
                java.lang.String r12 = r13.getContentEncoding()     // Catch: java.lang.Throwable -> L139 java.lang.Error -> L13d java.lang.Exception -> L140
                if (r12 == 0) goto Lfa
                boolean r12 = r12.contains(r1)     // Catch: java.lang.Throwable -> L139 java.lang.Error -> L13d java.lang.Exception -> L140
                if (r12 == 0) goto Lfa
                java.util.zip.GZIPInputStream r12 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L139 java.lang.Error -> L13d java.lang.Exception -> L140
                java.io.BufferedInputStream r14 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L139 java.lang.Error -> L13d java.lang.Exception -> L140
                r14.<init>(r11)     // Catch: java.lang.Throwable -> L139 java.lang.Error -> L13d java.lang.Exception -> L140
                r12.<init>(r14)     // Catch: java.lang.Throwable -> L139 java.lang.Error -> L13d java.lang.Exception -> L140
                r11 = r12
            Lfa:
                java.io.ByteArrayOutputStream r12 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L130 java.lang.Error -> L133 java.lang.Exception -> L136
                r12.<init>()     // Catch: java.lang.Throwable -> L130 java.lang.Error -> L133 java.lang.Exception -> L136
                r14 = 1024(0x400, float:1.435E-42)
                byte[] r14 = new byte[r14]     // Catch: java.lang.Error -> L183 java.lang.Exception -> L1a7 java.lang.Throwable -> L1d8
            L103:
                int r15 = r11.read(r14)     // Catch: java.lang.Error -> L183 java.lang.Exception -> L1a7 java.lang.Throwable -> L1d8
                r7 = -1
                if (r15 == r7) goto L10e
                r12.write(r14, r9, r15)     // Catch: java.lang.Error -> L183 java.lang.Exception -> L1a7 java.lang.Throwable -> L1d8
                goto L103
            L10e:
                a.a.a.i.g r7 = r0.d     // Catch: java.lang.Error -> L183 java.lang.Exception -> L1a7 java.lang.Throwable -> L1d8
                java.lang.String r14 = new java.lang.String     // Catch: java.lang.Error -> L183 java.lang.Exception -> L1a7 java.lang.Throwable -> L1d8
                byte[] r15 = r12.toByteArray()     // Catch: java.lang.Error -> L183 java.lang.Exception -> L1a7 java.lang.Throwable -> L1d8
                java.lang.String r9 = "utf-8"
                r14.<init>(r15, r9)     // Catch: java.lang.Error -> L183 java.lang.Exception -> L1a7 java.lang.Throwable -> L1d8
                r7.f339c = r14     // Catch: java.lang.Error -> L183 java.lang.Exception -> L1a7 java.lang.Throwable -> L1d8
                boolean r7 = r0.f345c     // Catch: java.lang.Error -> L183 java.lang.Exception -> L1a7 java.lang.Throwable -> L1d8
                if (r7 == 0) goto L129
                a.a.a.i.g r7 = r0.d     // Catch: java.lang.Error -> L183 java.lang.Exception -> L1a7 java.lang.Throwable -> L1d8
                byte[] r9 = r12.toByteArray()     // Catch: java.lang.Error -> L183 java.lang.Exception -> L1a7 java.lang.Throwable -> L1d8
                r7.e = r9     // Catch: java.lang.Error -> L183 java.lang.Exception -> L1a7 java.lang.Throwable -> L1d8
            L129:
                a.a.a.i.g r7 = r0.d     // Catch: java.lang.Error -> L183 java.lang.Exception -> L1a7 java.lang.Throwable -> L1d8
                r7.a(r10)     // Catch: java.lang.Error -> L183 java.lang.Exception -> L1a7 java.lang.Throwable -> L1d8
                r7 = r10
                goto L147
            L130:
                r0 = move-exception
                goto L17b
            L133:
                r12 = 0
                goto L183
            L136:
                r12 = 0
                goto L1a7
            L139:
                r0 = move-exception
                r7 = r8
                r8 = r13
                goto L179
            L13d:
                r7 = r8
                r8 = r13
                goto L180
            L140:
                r7 = r8
                r8 = r13
                goto L1a4
            L144:
                r7 = 0
                r11 = 0
                r12 = 0
            L147:
                if (r13 == 0) goto L14c
                r13.disconnect()
            L14c:
                if (r8 == 0) goto L155
                r8.close()     // Catch: java.lang.Exception -> L152
                goto L155
            L152:
                android.util.Log.d(r5, r4)
            L155:
                if (r11 == 0) goto L15e
                r11.close()     // Catch: java.lang.Exception -> L15b
                goto L15e
            L15b:
                android.util.Log.d(r5, r3)
            L15e:
                if (r12 == 0) goto L1cd
                r12.close()     // Catch: java.lang.Exception -> L1ca
                goto L1cd
            L165:
                r0 = move-exception
                r7 = r8
                r8 = r13
                goto L178
            L169:
                r7 = r8
                r8 = r13
                goto L17f
            L16c:
                r7 = r8
                r8 = r13
                goto L1a3
            L16f:
                r0 = move-exception
                r8 = r13
                goto L177
            L172:
                r8 = r13
                goto L17e
            L174:
                r8 = r13
                goto L1a2
            L176:
                r0 = move-exception
            L177:
                r7 = 0
            L178:
                r11 = 0
            L179:
                r13 = r8
                r8 = r7
            L17b:
                r7 = 0
                goto L1da
            L17e:
                r7 = 0
            L17f:
                r11 = 0
            L180:
                r13 = r8
                r12 = 0
                r8 = r7
            L183:
                java.lang.String r7 = "NetworkCommunicationError!"
                android.util.Log.d(r5, r7)     // Catch: java.lang.Throwable -> L1d8
                if (r13 == 0) goto L18d
                r13.disconnect()
            L18d:
                if (r8 == 0) goto L196
                r8.close()     // Catch: java.lang.Exception -> L193
                goto L196
            L193:
                android.util.Log.d(r5, r4)
            L196:
                if (r11 == 0) goto L19f
                r11.close()     // Catch: java.lang.Exception -> L19c
                goto L19f
            L19c:
                android.util.Log.d(r5, r3)
            L19f:
                if (r12 == 0) goto L1cf
                goto L1c5
            L1a2:
                r7 = 0
            L1a3:
                r11 = 0
            L1a4:
                r13 = r8
                r12 = 0
                r8 = r7
            L1a7:
                java.lang.String r7 = "NetworkCommunicationException!"
                android.util.Log.d(r5, r7)     // Catch: java.lang.Throwable -> L1d8
                if (r13 == 0) goto L1b1
                r13.disconnect()
            L1b1:
                if (r8 == 0) goto L1ba
                r8.close()     // Catch: java.lang.Exception -> L1b7
                goto L1ba
            L1b7:
                android.util.Log.d(r5, r4)
            L1ba:
                if (r11 == 0) goto L1c3
                r11.close()     // Catch: java.lang.Exception -> L1c0
                goto L1c3
            L1c0:
                android.util.Log.d(r5, r3)
            L1c3:
                if (r12 == 0) goto L1cf
            L1c5:
                r12.close()     // Catch: java.lang.Exception -> L1c9
                goto L1cf
            L1c9:
                r7 = 0
            L1ca:
                android.util.Log.d(r5, r2)
            L1cd:
                r8 = r13
                goto L1d1
            L1cf:
                r8 = r13
                r7 = 0
            L1d1:
                if (r7 == 0) goto L1d4
                goto L1fb
            L1d4:
                int r6 = r6 + (-1)
                goto L1a
            L1d8:
                r0 = move-exception
                r7 = r12
            L1da:
                if (r13 == 0) goto L1df
                r13.disconnect()
            L1df:
                if (r8 == 0) goto L1e8
                r8.close()     // Catch: java.lang.Exception -> L1e5
                goto L1e8
            L1e5:
                android.util.Log.d(r5, r4)
            L1e8:
                if (r11 == 0) goto L1f1
                r11.close()     // Catch: java.lang.Exception -> L1ee
                goto L1f1
            L1ee:
                android.util.Log.d(r5, r3)
            L1f1:
                if (r7 == 0) goto L1fa
                r7.close()     // Catch: java.lang.Exception -> L1f7
                goto L1fa
            L1f7:
                android.util.Log.d(r5, r2)
            L1fa:
                throw r0
            L1fb:
                if (r6 > 0) goto L20c
                int r1 = a.a.a.i.g.h
                int r1 = r1 + r10
                a.a.a.i.g.h = r1
                a.a.a.i.g r0 = r0.d
                r1 = 0
                r0.f339c = r1
                r1 = 0
                r0.a(r1)
                goto L20f
            L20c:
                r1 = 0
                a.a.a.i.g.h = r1
            L20f:
                return
        }
    }

    public class d implements java.lang.Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f346b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a.a.a.i.g f347c;

        public d(a.a.a.i.g r1, java.lang.String r2) {
                r0 = this;
                r0.f347c = r1
                r0.f346b = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                a.a.a.i.g r0 = r1.f347c
                java.lang.String r1 = r1.f346b
                a.a.a.i.g.a(r0, r1)
                return
        }
    }

    public class e extends java.lang.Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f348b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a.a.a.i.g f349c;

        public e(a.a.a.i.g r1, java.lang.String r2) {
                r0 = this;
                r0.f349c = r1
                r0.f348b = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r17 = this;
                r1 = r17
                java.lang.String r0 = "gzip"
                java.lang.String r2 = "close baos IOException!"
                java.lang.String r3 = "close is IOException!"
                java.lang.String r4 = "close os IOException!"
                java.lang.String r5 = "baidu_location_service"
                a.a.a.i.g r6 = r1.f349c
                r6.a()
                long r6 = java.lang.System.currentTimeMillis()
                a.a.a.i.g r8 = r1.f349c
                java.lang.String r9 = r1.f348b
                r8.f337a = r9
                r8 = 0
                r9 = 0
                javax.net.ssl.SSLSocketFactory r10 = a.a.a.i.i.g()     // Catch: java.lang.Throwable -> L17f java.lang.Error -> L185 java.lang.Exception -> L1b3
                javax.net.ssl.HttpsURLConnection.setDefaultSSLSocketFactory(r10)     // Catch: java.lang.Throwable -> L17f java.lang.Error -> L185 java.lang.Exception -> L1b3
                java.lang.StringBuffer r10 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L17f java.lang.Error -> L185 java.lang.Exception -> L1b3
                r10.<init>()     // Catch: java.lang.Throwable -> L17f java.lang.Error -> L185 java.lang.Exception -> L1b3
                java.net.URL r11 = new java.net.URL     // Catch: java.lang.Throwable -> L17f java.lang.Error -> L185 java.lang.Exception -> L1b3
                a.a.a.i.g r12 = r1.f349c     // Catch: java.lang.Throwable -> L17f java.lang.Error -> L185 java.lang.Exception -> L1b3
                java.lang.String r12 = r12.f337a     // Catch: java.lang.Throwable -> L17f java.lang.Error -> L185 java.lang.Exception -> L1b3
                r11.<init>(r12)     // Catch: java.lang.Throwable -> L17f java.lang.Error -> L185 java.lang.Exception -> L1b3
                java.net.URLConnection r12 = r11.openConnection()     // Catch: java.lang.Throwable -> L16c java.lang.Error -> L173 java.lang.Exception -> L179
                javax.net.ssl.HttpsURLConnection r12 = (javax.net.ssl.HttpsURLConnection) r12     // Catch: java.lang.Throwable -> L16c java.lang.Error -> L173 java.lang.Exception -> L179
                r12.setInstanceFollowRedirects(r8)     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L164 java.lang.Exception -> L168
                r13 = 1
                r12.setDoOutput(r13)     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L164 java.lang.Exception -> L168
                r12.setDoInput(r13)     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L164 java.lang.Exception -> L168
                int r14 = a.a.a.i.a.f316a     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L164 java.lang.Exception -> L168
                r12.setConnectTimeout(r14)     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L164 java.lang.Exception -> L168
                int r14 = a.a.a.i.a.f317b     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L164 java.lang.Exception -> L168
                r12.setReadTimeout(r14)     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L164 java.lang.Exception -> L168
                java.lang.String r14 = "POST"
                r12.setRequestMethod(r14)     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L164 java.lang.Exception -> L168
                a.a.a.i.g$g r14 = new a.a.a.i.g$g     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L164 java.lang.Exception -> L168
                r14.<init>(r11)     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L164 java.lang.Exception -> L168
                r12.setHostnameVerifier(r14)     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L164 java.lang.Exception -> L168
                java.lang.String r11 = "Content-Type"
                java.lang.String r14 = "application/x-www-form-urlencoded; charset=utf-8"
                r12.setRequestProperty(r11, r14)     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L164 java.lang.Exception -> L168
                a.a.a.i.g r11 = r1.f349c     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L164 java.lang.Exception -> L168
                java.lang.String r11 = r11.f     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L164 java.lang.Exception -> L168
                if (r11 == 0) goto L6b
                java.lang.String r14 = "alwd"
                r12.setRequestProperty(r14, r11)     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L164 java.lang.Exception -> L168
            L6b:
                java.lang.String r11 = "Accept-Encoding"
                r12.setRequestProperty(r11, r0)     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L164 java.lang.Exception -> L168
                java.lang.String r11 = a.a.a.i.i.o0     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L164 java.lang.Exception -> L168
                if (r11 == 0) goto L79
                java.lang.String r14 = "bd-loc-android"
                r12.setRequestProperty(r14, r11)     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L164 java.lang.Exception -> L168
            L79:
                a.a.a.i.g r11 = r1.f349c     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L164 java.lang.Exception -> L168
                java.util.Map<java.lang.String, java.lang.Object> r11 = r11.d     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L164 java.lang.Exception -> L168
                java.util.Set r11 = r11.entrySet()     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L164 java.lang.Exception -> L168
                java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L164 java.lang.Exception -> L168
            L85:
                boolean r14 = r11.hasNext()     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L164 java.lang.Exception -> L168
                if (r14 == 0) goto Lac
                java.lang.Object r14 = r11.next()     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L164 java.lang.Exception -> L168
                java.util.Map$Entry r14 = (java.util.Map.Entry) r14     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L164 java.lang.Exception -> L168
                java.lang.Object r15 = r14.getKey()     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L164 java.lang.Exception -> L168
                java.lang.String r15 = (java.lang.String) r15     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L164 java.lang.Exception -> L168
                r10.append(r15)     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L164 java.lang.Exception -> L168
                java.lang.String r15 = "="
                r10.append(r15)     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L164 java.lang.Exception -> L168
                java.lang.Object r14 = r14.getValue()     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L164 java.lang.Exception -> L168
                r10.append(r14)     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L164 java.lang.Exception -> L168
                java.lang.String r14 = "&"
                r10.append(r14)     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L164 java.lang.Exception -> L168
                goto L85
            Lac:
                int r11 = r10.length()     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L164 java.lang.Exception -> L168
                if (r11 <= 0) goto Lba
                int r11 = r10.length()     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L164 java.lang.Exception -> L168
                int r11 = r11 - r13
                r10.deleteCharAt(r11)     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L164 java.lang.Exception -> L168
            Lba:
                java.io.OutputStream r11 = r12.getOutputStream()     // Catch: java.lang.Throwable -> L160 java.lang.Error -> L164 java.lang.Exception -> L168
                java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L157 java.lang.Error -> L15a java.lang.Exception -> L15d
                byte[] r10 = r10.getBytes()     // Catch: java.lang.Throwable -> L157 java.lang.Error -> L15a java.lang.Exception -> L15d
                r11.write(r10)     // Catch: java.lang.Throwable -> L157 java.lang.Error -> L15a java.lang.Exception -> L15d
                r11.flush()     // Catch: java.lang.Throwable -> L157 java.lang.Error -> L15a java.lang.Exception -> L15d
                int r10 = r12.getResponseCode()     // Catch: java.lang.Throwable -> L157 java.lang.Error -> L15a java.lang.Exception -> L15d
                r14 = 200(0xc8, float:2.8E-43)
                if (r10 != r14) goto L131
                java.io.InputStream r10 = r12.getInputStream()     // Catch: java.lang.Throwable -> L157 java.lang.Error -> L15a java.lang.Exception -> L15d
                a.a.a.i.g r14 = r1.f349c     // Catch: java.lang.Throwable -> L129 java.lang.Error -> L12b java.lang.Exception -> L12e
                long r15 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L129 java.lang.Error -> L12b java.lang.Exception -> L12e
                long r6 = r15 - r6
                r14.g = r6     // Catch: java.lang.Throwable -> L129 java.lang.Error -> L12b java.lang.Exception -> L12e
                java.lang.String r6 = r12.getContentEncoding()     // Catch: java.lang.Throwable -> L129 java.lang.Error -> L12b java.lang.Exception -> L12e
                if (r6 == 0) goto Lf9
                boolean r0 = r6.contains(r0)     // Catch: java.lang.Throwable -> L129 java.lang.Error -> L12b java.lang.Exception -> L12e
                if (r0 == 0) goto Lf9
                java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L129 java.lang.Error -> L12b java.lang.Exception -> L12e
                java.io.BufferedInputStream r6 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L129 java.lang.Error -> L12b java.lang.Exception -> L12e
                r6.<init>(r10)     // Catch: java.lang.Throwable -> L129 java.lang.Error -> L12b java.lang.Exception -> L12e
                r0.<init>(r6)     // Catch: java.lang.Throwable -> L129 java.lang.Error -> L12b java.lang.Exception -> L12e
                r10 = r0
            Lf9:
                java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L129 java.lang.Error -> L12b java.lang.Exception -> L12e
                r6.<init>()     // Catch: java.lang.Throwable -> L129 java.lang.Error -> L12b java.lang.Exception -> L12e
                r0 = 1024(0x400, float:1.435E-42)
                byte[] r0 = new byte[r0]     // Catch: java.lang.Error -> L123 java.lang.Exception -> L126 java.lang.Throwable -> L1e6
            L102:
                int r7 = r10.read(r0)     // Catch: java.lang.Error -> L123 java.lang.Exception -> L126 java.lang.Throwable -> L1e6
                r14 = -1
                if (r7 == r14) goto L10d
                r6.write(r0, r8, r7)     // Catch: java.lang.Error -> L123 java.lang.Exception -> L126 java.lang.Throwable -> L1e6
                goto L102
            L10d:
                a.a.a.i.g r0 = r1.f349c     // Catch: java.lang.Error -> L123 java.lang.Exception -> L126 java.lang.Throwable -> L1e6
                java.lang.String r7 = new java.lang.String     // Catch: java.lang.Error -> L123 java.lang.Exception -> L126 java.lang.Throwable -> L1e6
                byte[] r14 = r6.toByteArray()     // Catch: java.lang.Error -> L123 java.lang.Exception -> L126 java.lang.Throwable -> L1e6
                java.lang.String r15 = "utf-8"
                r7.<init>(r14, r15)     // Catch: java.lang.Error -> L123 java.lang.Exception -> L126 java.lang.Throwable -> L1e6
                r0.f339c = r7     // Catch: java.lang.Error -> L123 java.lang.Exception -> L126 java.lang.Throwable -> L1e6
                a.a.a.i.g r0 = r1.f349c     // Catch: java.lang.Error -> L123 java.lang.Exception -> L126 java.lang.Throwable -> L1e6
                r0.a(r13)     // Catch: java.lang.Error -> L123 java.lang.Exception -> L126 java.lang.Throwable -> L1e6
                r9 = r10
                goto L139
            L123:
                r0 = move-exception
                goto L18a
            L126:
                r0 = move-exception
                goto L1b8
            L129:
                r0 = move-exception
                goto L170
            L12b:
                r0 = move-exception
                goto L177
            L12e:
                r0 = move-exception
                goto L17d
            L131:
                a.a.a.i.g r0 = r1.f349c     // Catch: java.lang.Throwable -> L157 java.lang.Error -> L15a java.lang.Exception -> L15d
                r0.f339c = r9     // Catch: java.lang.Throwable -> L157 java.lang.Error -> L15a java.lang.Exception -> L15d
                r0.a(r8)     // Catch: java.lang.Throwable -> L157 java.lang.Error -> L15a java.lang.Exception -> L15d
                r6 = r9
            L139:
                if (r12 == 0) goto L13e
                r12.disconnect()
            L13e:
                if (r11 == 0) goto L147
                r11.close()     // Catch: java.lang.Exception -> L144
                goto L147
            L144:
                android.util.Log.d(r5, r4)
            L147:
                if (r9 == 0) goto L150
                r9.close()     // Catch: java.lang.Exception -> L14d
                goto L150
            L14d:
                android.util.Log.d(r5, r3)
            L150:
                if (r6 == 0) goto L1e5
            L152:
                r6.close()     // Catch: java.lang.Exception -> L1e2
                goto L1e5
            L157:
                r0 = move-exception
                r10 = r9
                goto L170
            L15a:
                r0 = move-exception
                r10 = r9
                goto L177
            L15d:
                r0 = move-exception
                r10 = r9
                goto L17d
            L160:
                r0 = move-exception
                r10 = r9
                r11 = r10
                goto L170
            L164:
                r0 = move-exception
                r10 = r9
                r11 = r10
                goto L177
            L168:
                r0 = move-exception
                r10 = r9
                r11 = r10
                goto L17d
            L16c:
                r0 = move-exception
                r10 = r9
                r11 = r10
                r12 = r11
            L170:
                r6 = r9
                goto L1e9
            L173:
                r0 = move-exception
                r10 = r9
                r11 = r10
                r12 = r11
            L177:
                r6 = r9
                goto L18a
            L179:
                r0 = move-exception
                r10 = r9
                r11 = r10
                r12 = r11
            L17d:
                r6 = r9
                goto L1b8
            L17f:
                r0 = move-exception
                r6 = r9
                r10 = r6
                r11 = r10
                goto L1ea
            L185:
                r0 = move-exception
                r6 = r9
                r10 = r6
                r11 = r10
                r12 = r11
            L18a:
                r0.printStackTrace()     // Catch: java.lang.Throwable -> L1e6
                java.lang.String r0 = "https NetworkCommunicationError!"
                android.util.Log.i(r5, r0)     // Catch: java.lang.Throwable -> L1e6
                a.a.a.i.g r0 = r1.f349c     // Catch: java.lang.Throwable -> L1e6
                r0.f339c = r9     // Catch: java.lang.Throwable -> L1e6
                r0.a(r8)     // Catch: java.lang.Throwable -> L1e6
                if (r12 == 0) goto L19e
                r12.disconnect()
            L19e:
                if (r11 == 0) goto L1a7
                r11.close()     // Catch: java.lang.Exception -> L1a4
                goto L1a7
            L1a4:
                android.util.Log.d(r5, r4)
            L1a7:
                if (r10 == 0) goto L1b0
                r10.close()     // Catch: java.lang.Exception -> L1ad
                goto L1b0
            L1ad:
                android.util.Log.d(r5, r3)
            L1b0:
                if (r6 == 0) goto L1e5
                goto L152
            L1b3:
                r0 = move-exception
                r6 = r9
                r10 = r6
                r11 = r10
                r12 = r11
            L1b8:
                r0.printStackTrace()     // Catch: java.lang.Throwable -> L1e6
                java.lang.String r0 = "https NetworkCommunicationException!"
                android.util.Log.i(r5, r0)     // Catch: java.lang.Throwable -> L1e6
                a.a.a.i.g r0 = r1.f349c     // Catch: java.lang.Throwable -> L1e6
                r0.f339c = r9     // Catch: java.lang.Throwable -> L1e6
                r0.a(r8)     // Catch: java.lang.Throwable -> L1e6
                if (r12 == 0) goto L1cc
                r12.disconnect()
            L1cc:
                if (r11 == 0) goto L1d5
                r11.close()     // Catch: java.lang.Exception -> L1d2
                goto L1d5
            L1d2:
                android.util.Log.d(r5, r4)
            L1d5:
                if (r10 == 0) goto L1de
                r10.close()     // Catch: java.lang.Exception -> L1db
                goto L1de
            L1db:
                android.util.Log.d(r5, r3)
            L1de:
                if (r6 == 0) goto L1e5
                goto L152
            L1e2:
                android.util.Log.d(r5, r2)
            L1e5:
                return
            L1e6:
                r0 = move-exception
                r9 = r10
                r10 = r9
            L1e9:
                r9 = r12
            L1ea:
                if (r9 == 0) goto L1ef
                r9.disconnect()
            L1ef:
                if (r11 == 0) goto L1f8
                r11.close()     // Catch: java.lang.Exception -> L1f5
                goto L1f8
            L1f5:
                android.util.Log.d(r5, r4)
            L1f8:
                if (r10 == 0) goto L201
                r10.close()     // Catch: java.lang.Exception -> L1fe
                goto L201
            L1fe:
                android.util.Log.d(r5, r3)
            L201:
                if (r6 == 0) goto L20a
                r6.close()     // Catch: java.lang.Exception -> L207
                goto L20a
            L207:
                android.util.Log.d(r5, r2)
            L20a:
                throw r0
        }
    }

    public class f implements java.lang.Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f350b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a.a.a.i.g f351c;

        public f(a.a.a.i.g r1, java.lang.String r2) {
                r0 = this;
                r0.f351c = r1
                r0.f350b = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r15 = this;
                java.lang.String r0 = "gzip"
                java.lang.String r1 = "close baos IOException!"
                java.lang.String r2 = "close is IOException!"
                java.lang.String r3 = "close os IOException!"
                java.lang.String r4 = "baidu_location_service"
                a.a.a.i.g r5 = r15.f351c
                r5.a()
                a.a.a.i.g r5 = r15.f351c
                java.lang.String r6 = r15.f350b
                r5.f337a = r6
                r5 = 0
                r6 = 0
                java.lang.StringBuffer r7 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L15e java.lang.Error -> L164 java.lang.Exception -> L193
                r7.<init>()     // Catch: java.lang.Throwable -> L15e java.lang.Error -> L164 java.lang.Exception -> L193
                java.net.URL r8 = new java.net.URL     // Catch: java.lang.Throwable -> L15e java.lang.Error -> L164 java.lang.Exception -> L193
                a.a.a.i.g r9 = r15.f351c     // Catch: java.lang.Throwable -> L15e java.lang.Error -> L164 java.lang.Exception -> L193
                java.lang.String r9 = r9.f337a     // Catch: java.lang.Throwable -> L15e java.lang.Error -> L164 java.lang.Exception -> L193
                r8.<init>(r9)     // Catch: java.lang.Throwable -> L15e java.lang.Error -> L164 java.lang.Exception -> L193
                java.net.URLConnection r8 = r8.openConnection()     // Catch: java.lang.Throwable -> L148 java.lang.Error -> L150 java.lang.Exception -> L157
                javax.net.ssl.HttpsURLConnection r8 = (javax.net.ssl.HttpsURLConnection) r8     // Catch: java.lang.Throwable -> L148 java.lang.Error -> L150 java.lang.Exception -> L157
                r8.setInstanceFollowRedirects(r5)     // Catch: java.lang.Throwable -> L13c java.lang.Error -> L140 java.lang.Exception -> L144
                r9 = 1
                r8.setDoOutput(r9)     // Catch: java.lang.Throwable -> L13c java.lang.Error -> L140 java.lang.Exception -> L144
                r8.setDoInput(r9)     // Catch: java.lang.Throwable -> L13c java.lang.Error -> L140 java.lang.Exception -> L144
                int r10 = a.a.a.i.a.f316a     // Catch: java.lang.Throwable -> L13c java.lang.Error -> L140 java.lang.Exception -> L144
                r8.setConnectTimeout(r10)     // Catch: java.lang.Throwable -> L13c java.lang.Error -> L140 java.lang.Exception -> L144
                int r10 = a.a.a.i.a.f317b     // Catch: java.lang.Throwable -> L13c java.lang.Error -> L140 java.lang.Exception -> L144
                r8.setReadTimeout(r10)     // Catch: java.lang.Throwable -> L13c java.lang.Error -> L140 java.lang.Exception -> L144
                java.lang.String r10 = "POST"
                r8.setRequestMethod(r10)     // Catch: java.lang.Throwable -> L13c java.lang.Error -> L140 java.lang.Exception -> L144
                java.lang.String r10 = "Content-Type"
                java.lang.String r11 = "application/x-www-form-urlencoded; charset=utf-8"
                r8.setRequestProperty(r10, r11)     // Catch: java.lang.Throwable -> L13c java.lang.Error -> L140 java.lang.Exception -> L144
                java.lang.String r10 = "Accept-Encoding"
                r8.setRequestProperty(r10, r0)     // Catch: java.lang.Throwable -> L13c java.lang.Error -> L140 java.lang.Exception -> L144
                java.lang.String r10 = a.a.a.i.i.o0     // Catch: java.lang.Throwable -> L13c java.lang.Error -> L140 java.lang.Exception -> L144
                if (r10 == 0) goto L59
                java.lang.String r11 = "bd-loc-android"
                r8.setRequestProperty(r11, r10)     // Catch: java.lang.Throwable -> L13c java.lang.Error -> L140 java.lang.Exception -> L144
            L59:
                a.a.a.i.g r10 = r15.f351c     // Catch: java.lang.Throwable -> L13c java.lang.Error -> L140 java.lang.Exception -> L144
                java.util.Map<java.lang.String, java.lang.Object> r10 = r10.d     // Catch: java.lang.Throwable -> L13c java.lang.Error -> L140 java.lang.Exception -> L144
                java.util.Set r10 = r10.entrySet()     // Catch: java.lang.Throwable -> L13c java.lang.Error -> L140 java.lang.Exception -> L144
                java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L13c java.lang.Error -> L140 java.lang.Exception -> L144
            L65:
                boolean r11 = r10.hasNext()     // Catch: java.lang.Throwable -> L13c java.lang.Error -> L140 java.lang.Exception -> L144
                if (r11 == 0) goto L8c
                java.lang.Object r11 = r10.next()     // Catch: java.lang.Throwable -> L13c java.lang.Error -> L140 java.lang.Exception -> L144
                java.util.Map$Entry r11 = (java.util.Map.Entry) r11     // Catch: java.lang.Throwable -> L13c java.lang.Error -> L140 java.lang.Exception -> L144
                java.lang.Object r12 = r11.getKey()     // Catch: java.lang.Throwable -> L13c java.lang.Error -> L140 java.lang.Exception -> L144
                java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Throwable -> L13c java.lang.Error -> L140 java.lang.Exception -> L144
                r7.append(r12)     // Catch: java.lang.Throwable -> L13c java.lang.Error -> L140 java.lang.Exception -> L144
                java.lang.String r12 = "="
                r7.append(r12)     // Catch: java.lang.Throwable -> L13c java.lang.Error -> L140 java.lang.Exception -> L144
                java.lang.Object r11 = r11.getValue()     // Catch: java.lang.Throwable -> L13c java.lang.Error -> L140 java.lang.Exception -> L144
                r7.append(r11)     // Catch: java.lang.Throwable -> L13c java.lang.Error -> L140 java.lang.Exception -> L144
                java.lang.String r11 = "&"
                r7.append(r11)     // Catch: java.lang.Throwable -> L13c java.lang.Error -> L140 java.lang.Exception -> L144
                goto L65
            L8c:
                int r10 = r7.length()     // Catch: java.lang.Throwable -> L13c java.lang.Error -> L140 java.lang.Exception -> L144
                if (r10 <= 0) goto L9a
                int r10 = r7.length()     // Catch: java.lang.Throwable -> L13c java.lang.Error -> L140 java.lang.Exception -> L144
                int r10 = r10 - r9
                r7.deleteCharAt(r10)     // Catch: java.lang.Throwable -> L13c java.lang.Error -> L140 java.lang.Exception -> L144
            L9a:
                java.io.OutputStream r10 = r8.getOutputStream()     // Catch: java.lang.Throwable -> L13c java.lang.Error -> L140 java.lang.Exception -> L144
                java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L133 java.lang.Error -> L136 java.lang.Exception -> L139
                byte[] r7 = r7.getBytes()     // Catch: java.lang.Throwable -> L133 java.lang.Error -> L136 java.lang.Exception -> L139
                r10.write(r7)     // Catch: java.lang.Throwable -> L133 java.lang.Error -> L136 java.lang.Exception -> L139
                r10.flush()     // Catch: java.lang.Throwable -> L133 java.lang.Error -> L136 java.lang.Exception -> L139
                int r7 = r8.getResponseCode()     // Catch: java.lang.Throwable -> L133 java.lang.Error -> L136 java.lang.Exception -> L139
                r11 = 200(0xc8, float:2.8E-43)
                if (r7 != r11) goto L10d
                java.io.InputStream r7 = r8.getInputStream()     // Catch: java.lang.Throwable -> L133 java.lang.Error -> L136 java.lang.Exception -> L139
                java.lang.String r11 = r8.getContentEncoding()     // Catch: java.lang.Throwable -> L105 java.lang.Error -> L107 java.lang.Exception -> L10a
                if (r11 == 0) goto Lcf
                boolean r0 = r11.contains(r0)     // Catch: java.lang.Throwable -> L105 java.lang.Error -> L107 java.lang.Exception -> L10a
                if (r0 == 0) goto Lcf
                java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L105 java.lang.Error -> L107 java.lang.Exception -> L10a
                java.io.BufferedInputStream r11 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L105 java.lang.Error -> L107 java.lang.Exception -> L10a
                r11.<init>(r7)     // Catch: java.lang.Throwable -> L105 java.lang.Error -> L107 java.lang.Exception -> L10a
                r0.<init>(r11)     // Catch: java.lang.Throwable -> L105 java.lang.Error -> L107 java.lang.Exception -> L10a
                r7 = r0
            Lcf:
                java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Error -> Lff java.lang.Exception -> L102 java.lang.Throwable -> L105
                r0.<init>()     // Catch: java.lang.Error -> Lff java.lang.Exception -> L102 java.lang.Throwable -> L105
                r11 = 1024(0x400, float:1.435E-42)
                byte[] r11 = new byte[r11]     // Catch: java.lang.Error -> Lf9 java.lang.Exception -> Lfc java.lang.Throwable -> L1c7
            Ld8:
                int r12 = r7.read(r11)     // Catch: java.lang.Error -> Lf9 java.lang.Exception -> Lfc java.lang.Throwable -> L1c7
                r13 = -1
                if (r12 == r13) goto Le3
                r0.write(r11, r5, r12)     // Catch: java.lang.Error -> Lf9 java.lang.Exception -> Lfc java.lang.Throwable -> L1c7
                goto Ld8
            Le3:
                a.a.a.i.g r11 = r15.f351c     // Catch: java.lang.Error -> Lf9 java.lang.Exception -> Lfc java.lang.Throwable -> L1c7
                java.lang.String r12 = new java.lang.String     // Catch: java.lang.Error -> Lf9 java.lang.Exception -> Lfc java.lang.Throwable -> L1c7
                byte[] r13 = r0.toByteArray()     // Catch: java.lang.Error -> Lf9 java.lang.Exception -> Lfc java.lang.Throwable -> L1c7
                java.lang.String r14 = "utf-8"
                r12.<init>(r13, r14)     // Catch: java.lang.Error -> Lf9 java.lang.Exception -> Lfc java.lang.Throwable -> L1c7
                r11.f339c = r12     // Catch: java.lang.Error -> Lf9 java.lang.Exception -> Lfc java.lang.Throwable -> L1c7
                a.a.a.i.g r11 = r15.f351c     // Catch: java.lang.Error -> Lf9 java.lang.Exception -> Lfc java.lang.Throwable -> L1c7
                r11.a(r9)     // Catch: java.lang.Error -> Lf9 java.lang.Exception -> Lfc java.lang.Throwable -> L1c7
                r6 = r7
                goto L115
            Lf9:
                r9 = move-exception
                goto L16a
            Lfc:
                r9 = move-exception
                goto L199
            Lff:
                r0 = move-exception
                goto L154
            L102:
                r0 = move-exception
                goto L15b
            L105:
                r15 = move-exception
                goto L14c
            L107:
                r0 = move-exception
                goto L154
            L10a:
                r0 = move-exception
                goto L15b
            L10d:
                a.a.a.i.g r0 = r15.f351c     // Catch: java.lang.Throwable -> L133 java.lang.Error -> L136 java.lang.Exception -> L139
                r0.f339c = r6     // Catch: java.lang.Throwable -> L133 java.lang.Error -> L136 java.lang.Exception -> L139
                r0.a(r5)     // Catch: java.lang.Throwable -> L133 java.lang.Error -> L136 java.lang.Exception -> L139
                r0 = r6
            L115:
                if (r8 == 0) goto L11a
                r8.disconnect()
            L11a:
                if (r10 == 0) goto L123
                r10.close()     // Catch: java.lang.Exception -> L120
                goto L123
            L120:
                android.util.Log.d(r4, r3)
            L123:
                if (r6 == 0) goto L12c
                r6.close()     // Catch: java.lang.Exception -> L129
                goto L12c
            L129:
                android.util.Log.d(r4, r2)
            L12c:
                if (r0 == 0) goto L1c6
            L12e:
                r0.close()     // Catch: java.lang.Exception -> L1c3
                goto L1c6
            L133:
                r15 = move-exception
                r7 = r6
                goto L14c
            L136:
                r0 = move-exception
                r7 = r6
                goto L154
            L139:
                r0 = move-exception
                r7 = r6
                goto L15b
            L13c:
                r15 = move-exception
                r7 = r6
                r10 = r7
                goto L14c
            L140:
                r0 = move-exception
                r7 = r6
                r10 = r7
                goto L154
            L144:
                r0 = move-exception
                r7 = r6
                r10 = r7
                goto L15b
            L148:
                r15 = move-exception
                r7 = r6
                r8 = r7
                r10 = r8
            L14c:
                r0 = r6
            L14d:
                r6 = r8
                goto L1c9
            L150:
                r0 = move-exception
                r7 = r6
                r8 = r7
                r10 = r8
            L154:
                r9 = r0
                r0 = r6
                goto L16a
            L157:
                r0 = move-exception
                r7 = r6
                r8 = r7
                r10 = r8
            L15b:
                r9 = r0
                r0 = r6
                goto L199
            L15e:
                r15 = move-exception
                r0 = r6
                r7 = r0
                r10 = r7
                goto L1c9
            L164:
                r0 = move-exception
                r9 = r0
                r0 = r6
                r7 = r0
                r8 = r7
                r10 = r8
            L16a:
                r9.printStackTrace()     // Catch: java.lang.Throwable -> L1c7
                java.lang.String r9 = "https NetworkCommunicationError!"
                android.util.Log.i(r4, r9)     // Catch: java.lang.Throwable -> L1c7
                a.a.a.i.g r15 = r15.f351c     // Catch: java.lang.Throwable -> L1c7
                r15.f339c = r6     // Catch: java.lang.Throwable -> L1c7
                r15.a(r5)     // Catch: java.lang.Throwable -> L1c7
                if (r8 == 0) goto L17e
                r8.disconnect()
            L17e:
                if (r10 == 0) goto L187
                r10.close()     // Catch: java.lang.Exception -> L184
                goto L187
            L184:
                android.util.Log.d(r4, r3)
            L187:
                if (r7 == 0) goto L190
                r7.close()     // Catch: java.lang.Exception -> L18d
                goto L190
            L18d:
                android.util.Log.d(r4, r2)
            L190:
                if (r0 == 0) goto L1c6
                goto L12e
            L193:
                r0 = move-exception
                r9 = r0
                r0 = r6
                r7 = r0
                r8 = r7
                r10 = r8
            L199:
                r9.printStackTrace()     // Catch: java.lang.Throwable -> L1c7
                java.lang.String r9 = "https NetworkCommunicationException!"
                android.util.Log.i(r4, r9)     // Catch: java.lang.Throwable -> L1c7
                a.a.a.i.g r15 = r15.f351c     // Catch: java.lang.Throwable -> L1c7
                r15.f339c = r6     // Catch: java.lang.Throwable -> L1c7
                r15.a(r5)     // Catch: java.lang.Throwable -> L1c7
                if (r8 == 0) goto L1ad
                r8.disconnect()
            L1ad:
                if (r10 == 0) goto L1b6
                r10.close()     // Catch: java.lang.Exception -> L1b3
                goto L1b6
            L1b3:
                android.util.Log.d(r4, r3)
            L1b6:
                if (r7 == 0) goto L1bf
                r7.close()     // Catch: java.lang.Exception -> L1bc
                goto L1bf
            L1bc:
                android.util.Log.d(r4, r2)
            L1bf:
                if (r0 == 0) goto L1c6
                goto L12e
            L1c3:
                android.util.Log.d(r4, r1)
            L1c6:
                return
            L1c7:
                r15 = move-exception
                goto L14d
            L1c9:
                if (r6 == 0) goto L1ce
                r6.disconnect()
            L1ce:
                if (r10 == 0) goto L1d7
                r10.close()     // Catch: java.lang.Exception -> L1d4
                goto L1d7
            L1d4:
                android.util.Log.d(r4, r3)
            L1d7:
                if (r7 == 0) goto L1e0
                r7.close()     // Catch: java.lang.Exception -> L1dd
                goto L1e0
            L1dd:
                android.util.Log.d(r4, r2)
            L1e0:
                if (r0 == 0) goto L1e9
                r0.close()     // Catch: java.lang.Exception -> L1e6
                goto L1e9
            L1e6:
                android.util.Log.d(r4, r1)
            L1e9:
                throw r15
        }
    }

    /* JADX INFO: renamed from: a.a.a.i.g$g, reason: collision with other inner class name */
    public static class C0021g implements javax.net.ssl.HostnameVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public java.net.URL f352a;

        public C0021g(java.net.URL r1) {
                r0 = this;
                r0.<init>()
                r0.f352a = r1
                return
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(java.lang.String r1, javax.net.ssl.SSLSession r2) {
                r0 = this;
                java.net.URL r0 = r0.f352a
                java.lang.String r0 = r0.getHost()
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto Le
                r0 = 1
                return r0
            Le:
                r0 = 0
                return r0
        }
    }

    static {
            int r0 = a.a.a.i.a.f318c
            r0 = 0
            a.a.a.i.g.h = r0
            return
    }

    public g() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f337a = r0
            r1 = 1
            r2.f338b = r1
            r2.f339c = r0
            r2.d = r0
            r2.e = r0
            r2.f = r0
            return
    }

    public static /* synthetic */ void a(a.a.a.i.g r0, java.lang.String r1) {
            r0.b(r1)
            return
    }

    public abstract void a();

    public void a(java.lang.String r3) {
            r2 = this;
            a.a.a.b.d r0 = a.a.a.b.d.i()
            int r0 = r0.N
            r1 = 1
            if (r0 != r1) goto L29
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 != r1) goto L25
            java.lang.Thread r0 = new java.lang.Thread
            a.a.a.i.g$d r1 = new a.a.a.i.g$d
            r1.<init>(r2, r3)
            r0.<init>(r1)
            r0.start()
            goto L36
        L25:
            r2.b(r3)
            goto L36
        L29:
            a.a.a.i.g$e r0 = new a.a.a.i.g$e     // Catch: java.lang.Throwable -> L32
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> L32
            r0.start()     // Catch: java.lang.Throwable -> L32
            goto L36
        L32:
            r3 = 0
            r2.a(r3)
        L36:
            return
    }

    public void a(java.util.concurrent.ExecutorService r2, java.lang.String r3) {
            r1 = this;
            a.a.a.i.g$f r0 = new a.a.a.i.g$f     // Catch: java.lang.Throwable -> L9
            r0.<init>(r1, r3)     // Catch: java.lang.Throwable -> L9
            r2.execute(r0)     // Catch: java.lang.Throwable -> L9
            goto Ld
        L9:
            r2 = 0
            r1.a(r2)
        Ld:
            return
    }

    public void a(java.util.concurrent.ExecutorService r2, boolean r3, java.lang.String r4) {
            r1 = this;
            a.a.a.i.g$b r0 = new a.a.a.i.g$b     // Catch: java.lang.Throwable -> L9
            r0.<init>(r1, r4, r3)     // Catch: java.lang.Throwable -> L9
            r2.execute(r0)     // Catch: java.lang.Throwable -> L9
            goto Ld
        L9:
            r2 = 0
            r1.a(r2)
        Ld:
            return
    }

    public abstract void a(boolean r1);

    public void a(boolean r2, java.lang.String r3) {
            r1 = this;
            a.a.a.i.g$c r0 = new a.a.a.i.g$c     // Catch: java.lang.Throwable -> L9
            r0.<init>(r1, r3, r2)     // Catch: java.lang.Throwable -> L9
            r0.start()     // Catch: java.lang.Throwable -> L9
            goto Ld
        L9:
            r2 = 0
            r1.a(r2)
        Ld:
            return
    }

    public final void b(java.lang.String r6) {
            r5 = this;
            r5.a()
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = r5.f
            if (r2 == 0) goto L12
            a.a.a.b.q r2 = a.a.a.b.q.c()
            java.lang.String r3 = r5.f
            goto L17
        L12:
            a.a.a.b.q r2 = a.a.a.b.q.c()
            r3 = 0
        L17:
            r2.a(r3)
            a.a.a.b.q r2 = a.a.a.b.q.c()
            java.util.Map<java.lang.String, java.lang.Object> r3 = r5.d
            a.a.a.i.g$a r4 = new a.a.a.i.g$a
            r4.<init>(r5, r0)
            r2.a(r3, r6, r4)
            return
    }
}
