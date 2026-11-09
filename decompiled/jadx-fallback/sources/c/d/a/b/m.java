package c.d.a.b;

/* JADX INFO: loaded from: classes.dex */
public class m extends android.database.sqlite.SQLiteOpenHelper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static java.lang.Integer f1341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static java.lang.String f1342c;
    public static java.lang.String d;
    private static java.util.concurrent.atomic.AtomicInteger e;
    private static c.d.a.b.m f;

    static {
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            c.d.a.b.m.f1341b = r0
            java.lang.String r0 = "signalhelper"
            c.d.a.b.m.f1342c = r0
            java.lang.String r0 = "signal"
            c.d.a.b.m.d = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            c.d.a.b.m.e = r0
            r0 = 0
            c.d.a.b.m.f = r0
            return
    }

    private m(android.content.Context r2, java.lang.String r3, int r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0, r4)
            return
    }

    private m(android.content.Context r1, java.lang.String r2, android.database.sqlite.SQLiteDatabase.CursorFactory r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public static synchronized c.d.a.b.m a(android.content.Context r2, java.lang.String r3, int r4) {
            java.lang.Class<c.d.a.b.m> r0 = c.d.a.b.m.class
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicInteger r1 = c.d.a.b.m.e     // Catch: java.lang.Throwable -> L17
            r1.incrementAndGet()     // Catch: java.lang.Throwable -> L17
            c.d.a.b.m r1 = c.d.a.b.m.f     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L13
            c.d.a.b.m r1 = new c.d.a.b.m     // Catch: java.lang.Throwable -> L17
            r1.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L17
            c.d.a.b.m.f = r1     // Catch: java.lang.Throwable -> L17
        L13:
            c.d.a.b.m r2 = c.d.a.b.m.f     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)
            return r2
        L17:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    public synchronized void a() {
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "SignalDatabaseHelper"
            java.lang.String r1 = "clearSignalDB-->"
            c.d.a.b.h.a(r0, r1)     // Catch: java.lang.Throwable -> L14
            android.database.sqlite.SQLiteDatabase r0 = r3.getWritableDatabase()     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = c.d.a.b.m.d     // Catch: java.lang.Throwable -> L14
            r2 = 0
            r0.delete(r1, r2, r2)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r3)
            return
        L14:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    public synchronized void a(java.lang.String r11) {
            r10 = this;
            monitor-enter(r10)
            java.lang.String r0 = "SignalDatabaseHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r1.<init>()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r2 = "insertRecord:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L6f
            r1.append(r11)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L6f
            c.d.a.b.h.a(r0, r1)     // Catch: java.lang.Throwable -> L6f
            android.database.sqlite.SQLiteDatabase r0 = r10.getWritableDatabase()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r1 = "create table if not exists signal (ID integer primary key autoincrement, jsonString text)"
            r0.execSQL(r1)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r3 = c.d.a.b.m.d     // Catch: java.lang.Throwable -> L6f
            java.lang.String r1 = "ID"
            java.lang.String r2 = "jsonString"
            java.lang.String[] r4 = new java.lang.String[]{r1, r2}     // Catch: java.lang.Throwable -> L6f
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r0
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L6f
            int r2 = r1.getCount()     // Catch: java.lang.Throwable -> L6f
            r3 = 100
            if (r2 < r3) goto L5a
            r1.moveToFirst()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r2 = "ID"
            int r2 = r1.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L6f
            int r2 = r1.getInt(r2)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r3 = c.d.a.b.m.d     // Catch: java.lang.Throwable -> L6f
            java.lang.String r4 = "ID=?"
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L6f
            r6 = 0
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L6f
            r5[r6] = r2     // Catch: java.lang.Throwable -> L6f
            r0.delete(r3, r4, r5)     // Catch: java.lang.Throwable -> L6f
        L5a:
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L6f
            r2.<init>()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r3 = "jsonString"
            r2.put(r3, r11)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r11 = c.d.a.b.m.d     // Catch: java.lang.Throwable -> L6f
            r3 = 0
            r0.insert(r11, r3, r2)     // Catch: java.lang.Throwable -> L6f
            r1.close()     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r10)
            return
        L6f:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
    }

    public synchronized org.json.JSONArray b() {
            r8 = this;
            monitor-enter(r8)
            android.database.sqlite.SQLiteDatabase r0 = r8.getWritableDatabase()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = c.d.a.b.m.d     // Catch: java.lang.Throwable -> L5d
            java.lang.String r2 = "jsonString"
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L5d
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L5d
            android.database.CursorWindow r1 = new android.database.CursorWindow     // Catch: java.lang.Throwable -> L5d
            java.lang.String r2 = "queryWindow"
            r3 = 20971520(0x1400000, double:1.03613076E-316)
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L5d
            android.database.AbstractWindowedCursor r0 = (android.database.AbstractWindowedCursor) r0     // Catch: java.lang.Throwable -> L5d
            r0.setWindow(r1)     // Catch: java.lang.Throwable -> L5d
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L5d
            r2.<init>()     // Catch: java.lang.Throwable -> L5d
            int r3 = r0.getCount()     // Catch: java.lang.Throwable -> L5d
            if (r3 <= 0) goto L4e
        L30:
            boolean r3 = r0.moveToNext()     // Catch: java.lang.Throwable -> L5d
            if (r3 == 0) goto L55
            java.lang.String r3 = "jsonString"
            int r3 = r0.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r3 = r0.getString(r3)     // Catch: java.lang.Throwable -> L5d
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L49 java.lang.Throwable -> L5d
            r4.<init>(r3)     // Catch: org.json.JSONException -> L49 java.lang.Throwable -> L5d
            r2.put(r4)     // Catch: org.json.JSONException -> L49 java.lang.Throwable -> L5d
            goto L30
        L49:
            r3 = move-exception
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L5d
            goto L30
        L4e:
            java.lang.String r3 = "SignalDatabaseHelper"
            java.lang.String r4 = "signal database is null"
            c.d.a.b.h.a(r3, r4)     // Catch: java.lang.Throwable -> L5d
        L55:
            r0.close()     // Catch: java.lang.Throwable -> L5d
            r1.close()     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r8)
            return r2
        L5d:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public synchronized void close() {
            r1 = this;
            monitor-enter(r1)
            super.close()     // Catch: java.lang.Throwable -> L11
            java.util.concurrent.atomic.AtomicInteger r0 = c.d.a.b.m.e     // Catch: java.lang.Throwable -> L11
            int r0 = r0.decrementAndGet()     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto Lf
            r0 = 0
            c.d.a.b.m.f = r0     // Catch: java.lang.Throwable -> L11
        Lf:
            monitor-exit(r1)
            return
        L11:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public synchronized void onCreate(android.database.sqlite.SQLiteDatabase r3) {
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "SignalDatabaseHelper"
            java.lang.String r1 = "onCreate-->"
            c.d.a.b.h.a(r0, r1)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r0 = "create table if not exists signal (ID integer primary key autoincrement, jsonString text)"
            r3.execSQL(r0)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r2)
            return
        Lf:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public synchronized void onUpgrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
            r0 = this;
            monitor-enter(r0)
            monitor-exit(r0)
            return
    }
}
