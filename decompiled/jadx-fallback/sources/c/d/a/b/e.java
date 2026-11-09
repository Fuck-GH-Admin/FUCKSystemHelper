package c.d.a.b;

/* JADX INFO: loaded from: classes.dex */
public class e extends android.database.sqlite.SQLiteOpenHelper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static java.lang.Integer f1334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static java.lang.String f1335c;
    public static java.lang.String d;
    private static java.util.concurrent.atomic.AtomicInteger e;
    private static c.d.a.b.e f;

    static {
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            c.d.a.b.e.f1334b = r0
            java.lang.String r0 = "systemhelper"
            c.d.a.b.e.f1335c = r0
            java.lang.String r0 = "dmregister"
            c.d.a.b.e.d = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            c.d.a.b.e.e = r0
            r0 = 0
            c.d.a.b.e.f = r0
            return
    }

    private e(android.content.Context r2, java.lang.String r3, int r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0, r4)
            return
    }

    private e(android.content.Context r1, java.lang.String r2, android.database.sqlite.SQLiteDatabase.CursorFactory r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public static synchronized c.d.a.b.e a(android.content.Context r2, java.lang.String r3, int r4) {
            java.lang.Class<c.d.a.b.e> r0 = c.d.a.b.e.class
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicInteger r1 = c.d.a.b.e.e     // Catch: java.lang.Throwable -> L17
            r1.incrementAndGet()     // Catch: java.lang.Throwable -> L17
            c.d.a.b.e r1 = c.d.a.b.e.f     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L13
            c.d.a.b.e r1 = new c.d.a.b.e     // Catch: java.lang.Throwable -> L17
            r1.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L17
            c.d.a.b.e.f = r1     // Catch: java.lang.Throwable -> L17
        L13:
            c.d.a.b.e r2 = c.d.a.b.e.f     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)
            return r2
        L17:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    public synchronized org.json.JSONObject a() {
            r9 = this;
            monitor-enter(r9)
            android.database.sqlite.SQLiteDatabase r8 = r9.getWritableDatabase()     // Catch: java.lang.Throwable -> L81
            java.lang.String r0 = "create table if not exists dmregister (ID integer primary key autoincrement, jsonString text)"
            r8.execSQL(r0)     // Catch: java.lang.Throwable -> L81
            java.lang.String r1 = c.d.a.b.e.d     // Catch: java.lang.Throwable -> L81
            java.lang.String r0 = "ID"
            java.lang.String r2 = "jsonString"
            java.lang.String[] r2 = new java.lang.String[]{r0, r2}     // Catch: java.lang.Throwable -> L81
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = r8
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L81
            android.database.CursorWindow r1 = new android.database.CursorWindow     // Catch: java.lang.Throwable -> L81
            java.lang.String r2 = "queryWindow"
            r3 = 20971520(0x1400000, double:1.03613076E-316)
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L81
            android.database.AbstractWindowedCursor r0 = (android.database.AbstractWindowedCursor) r0     // Catch: java.lang.Throwable -> L81
            r0.setWindow(r1)     // Catch: java.lang.Throwable -> L81
            int r2 = r0.getCount()     // Catch: java.lang.Throwable -> L81
            if (r2 <= 0) goto L78
            r0.moveToLast()     // Catch: java.lang.Throwable -> L81
            java.lang.String r2 = "jsonString"
            int r2 = r0.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L81
            java.lang.String r2 = r0.getString(r2)     // Catch: java.lang.Throwable -> L81
            java.lang.String r3 = "HistoryDatabaseHelper"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L81
            r4.<init>()     // Catch: java.lang.Throwable -> L81
            java.lang.String r5 = "queryOldestRecord:"
            r4.append(r5)     // Catch: java.lang.Throwable -> L81
            r4.append(r2)     // Catch: java.lang.Throwable -> L81
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L81
            c.d.a.b.h.a(r3, r4)     // Catch: java.lang.Throwable -> L81
            java.lang.String r3 = "ID"
            int r3 = r0.getColumnIndex(r3)     // Catch: org.json.JSONException -> L74 java.lang.Throwable -> L81
            java.lang.String r3 = r0.getString(r3)     // Catch: org.json.JSONException -> L74 java.lang.Throwable -> L81
            java.lang.String r4 = "ID=?"
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: org.json.JSONException -> L74 java.lang.Throwable -> L81
            r6 = 0
            r5[r6] = r3     // Catch: org.json.JSONException -> L74 java.lang.Throwable -> L81
            java.lang.String r3 = c.d.a.b.e.d     // Catch: org.json.JSONException -> L74 java.lang.Throwable -> L81
            r8.delete(r3, r4, r5)     // Catch: org.json.JSONException -> L74 java.lang.Throwable -> L81
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L74 java.lang.Throwable -> L81
            r3.<init>(r2)     // Catch: org.json.JSONException -> L74 java.lang.Throwable -> L81
            monitor-exit(r9)
            return r3
        L74:
            r2 = move-exception
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L81
        L78:
            r0.close()     // Catch: java.lang.Throwable -> L81
            r1.close()     // Catch: java.lang.Throwable -> L81
            r0 = 0
            monitor-exit(r9)
            return r0
        L81:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
    }

    public synchronized void a(java.lang.String r13) {
            r12 = this;
            monitor-enter(r12)
            java.lang.String r0 = "HistoryDatabaseHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcb
            r1.<init>()     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r2 = "insertRecord:"
            r1.append(r2)     // Catch: java.lang.Throwable -> Lcb
            r1.append(r13)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lcb
            c.d.a.b.h.a(r0, r1)     // Catch: java.lang.Throwable -> Lcb
            android.database.sqlite.SQLiteDatabase r0 = r12.getWritableDatabase()     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r1 = "create table if not exists dmregister (ID integer primary key autoincrement, jsonString text)"
            r0.execSQL(r1)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r3 = c.d.a.b.e.d     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r1 = "COUNT(*)"
            java.lang.String[] r4 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> Lcb
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r0
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Lcb
            r1.moveToFirst()     // Catch: java.lang.Throwable -> Lcb
            r11 = 0
            int r2 = r1.getInt(r11)     // Catch: java.lang.Throwable -> Lcb
            r1.close()     // Catch: java.lang.Throwable -> Lcb
            int r1 = r2 + (-10)
            int r1 = java.lang.Math.max(r11, r1)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r3 = "HistoryDatabaseHelper"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcb
            r4.<init>()     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r5 = "row count :"
            r4.append(r5)     // Catch: java.lang.Throwable -> Lcb
            r4.append(r2)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r2 = ", deletecount: "
            r4.append(r2)     // Catch: java.lang.Throwable -> Lcb
            r4.append(r1)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> Lcb
            c.d.a.b.h.a(r3, r2)     // Catch: java.lang.Throwable -> Lcb
            if (r1 <= 0) goto Lb9
            java.lang.String r9 = "ID ASC"
            java.lang.String r2 = "ID"
            java.lang.String[] r4 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r3 = c.d.a.b.e.d     // Catch: java.lang.Throwable -> Lcb
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r10 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Lcb
            r2 = r0
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Lcb
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> Lcb
            if (r2 == 0) goto Lb6
        L80:
            java.lang.String r2 = "ID"
            int r2 = r1.getColumnIndex(r2)     // Catch: java.lang.Throwable -> Lcb
            int r2 = r1.getInt(r2)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r3 = "HistoryDatabaseHelper"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcb
            r4.<init>()     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r5 = "idToDelete : "
            r4.append(r5)     // Catch: java.lang.Throwable -> Lcb
            r4.append(r2)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Lcb
            c.d.a.b.h.a(r3, r4)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r3 = c.d.a.b.e.d     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r4 = "ID=?"
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> Lcb
            r5[r11] = r2     // Catch: java.lang.Throwable -> Lcb
            r0.delete(r3, r4, r5)     // Catch: java.lang.Throwable -> Lcb
            boolean r2 = r1.moveToNext()     // Catch: java.lang.Throwable -> Lcb
            if (r2 != 0) goto L80
        Lb6:
            r1.close()     // Catch: java.lang.Throwable -> Lcb
        Lb9:
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch: java.lang.Throwable -> Lcb
            r1.<init>()     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r2 = "jsonString"
            r1.put(r2, r13)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r13 = c.d.a.b.e.d     // Catch: java.lang.Throwable -> Lcb
            r2 = 0
            r0.insert(r13, r2, r1)     // Catch: java.lang.Throwable -> Lcb
            monitor-exit(r12)
            return
        Lcb:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public synchronized void close() {
            r1 = this;
            monitor-enter(r1)
            super.close()     // Catch: java.lang.Throwable -> L11
            java.util.concurrent.atomic.AtomicInteger r0 = c.d.a.b.e.e     // Catch: java.lang.Throwable -> L11
            int r0 = r0.decrementAndGet()     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto Lf
            r0 = 0
            c.d.a.b.e.f = r0     // Catch: java.lang.Throwable -> L11
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
            java.lang.String r0 = "HistoryDatabaseHelper"
            java.lang.String r1 = "onCreate table-->"
            c.d.a.b.h.a(r0, r1)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r0 = "create table if not exists dmregister (ID integer primary key autoincrement, jsonString text)"
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
