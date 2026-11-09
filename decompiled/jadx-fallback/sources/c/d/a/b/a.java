package c.d.a.b;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public static void a(android.content.Context r3, long r4) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.mobiletools.systemhelper.control.OnBootReceiver> r1 = com.mobiletools.systemhelper.control.OnBootReceiver.class
            r0.<init>(r3, r1)
            r1 = 0
            r2 = 201326592(0xc000000, float:9.8607613E-32)
            android.app.PendingIntent r0 = android.app.PendingIntent.getBroadcast(r3, r1, r0, r2)
            java.lang.String r1 = "alarm"
            java.lang.Object r3 = r3.getSystemService(r1)
            android.app.AlarmManager r3 = (android.app.AlarmManager) r3
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r1 = r1 + r4
            r4 = 2
            r3.setExactAndAllowWhileIdle(r4, r1, r0)
            return
    }

    public static void a(android.content.Context r7, long r8, long r10) {
            java.lang.String r0 = "AppInfoAlarmAfter--->"
            java.lang.String r1 = "AlarmHelper"
            c.d.a.b.h.a(r1, r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "GlobalSetting.count_app = "
            r2.append(r3)
            int r3 = c.d.a.b.d.q
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            c.d.a.b.h.a(r1, r2)
            int r2 = c.d.a.b.d.q
            r3 = 2
            java.lang.String r4 = "alarm"
            r5 = 201326592(0xc000000, float:9.8607613E-32)
            r6 = 0
            c.d.a.b.h.a(r1, r0)
            if (r2 != 0) goto L75
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.mobiletools.systemhelper.control.AppInfoRegisterReceiver> r2 = com.mobiletools.systemhelper.control.AppInfoRegisterReceiver.class
            r0.<init>(r7, r2)
            android.app.PendingIntent r0 = android.app.PendingIntent.getBroadcast(r7, r6, r0, r5)
            java.lang.Object r7 = r7.getSystemService(r4)
            android.app.AlarmManager r7 = (android.app.AlarmManager) r7
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r4 = r4 + r8
            long r4 = r4 + r10
            r7.setExactAndAllowWhileIdle(r3, r4, r0)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = "GlobalSetting.DEFAULT_RANDOM AppInfoAlarmAfter test: "
            r7.append(r10)
            long r10 = c.d.a.b.d.m
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            c.d.a.b.h.a(r1, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = "测试助手修改后的app info rand ： "
            r7.append(r10)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            c.d.a.b.h.a(r1, r7)
            int r7 = c.d.a.b.d.q
            int r7 = r7 + 1
            c.d.a.b.d.q = r7
            goto Lba
        L75:
            android.content.Intent r8 = new android.content.Intent
            java.lang.Class<com.mobiletools.systemhelper.control.AppInfoRegisterReceiver> r9 = com.mobiletools.systemhelper.control.AppInfoRegisterReceiver.class
            r8.<init>(r7, r9)
            android.app.PendingIntent r8 = android.app.PendingIntent.getBroadcast(r7, r6, r8, r5)
            java.lang.Object r7 = r7.getSystemService(r4)
            android.app.AlarmManager r7 = (android.app.AlarmManager) r7
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r4 = r4 + r10
            r7.setExactAndAllowWhileIdle(r3, r4, r8)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "GlobalSetting.DEFAULT_RANDOM AppInfoAlarmAfter: "
            r7.append(r8)
            long r8 = c.d.a.b.d.m
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            c.d.a.b.h.a(r1, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "AppInfoAlarmAfter  SystemClock.elapsedRealtime() + ms: "
            r7.append(r8)
            long r8 = c.d.a.b.d.m
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            c.d.a.b.h.a(r1, r7)
        Lba:
            return
    }

    public static void b(android.content.Context r4, long r5) {
            java.lang.String r0 = "AlarmHelper"
            java.lang.String r1 = "GetSignalInfoAlarmAfter====>"
            c.d.a.b.h.a(r0, r1)
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<com.mobiletools.systemhelper.control.GetSignalInfoReceiver> r2 = com.mobiletools.systemhelper.control.GetSignalInfoReceiver.class
            r1.<init>(r4, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "intent: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            c.d.a.b.h.a(r0, r2)
            r0 = 0
            r2 = 201326592(0xc000000, float:9.8607613E-32)
            android.app.PendingIntent r0 = android.app.PendingIntent.getBroadcast(r4, r0, r1, r2)
            java.lang.String r1 = "alarm"
            java.lang.Object r4 = r4.getSystemService(r1)
            android.app.AlarmManager r4 = (android.app.AlarmManager) r4
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r1 = r1 + r5
            r5 = 2
            r4.setExactAndAllowWhileIdle(r5, r1, r0)
            return
    }

    public static void b(android.content.Context r7, long r8, long r10) {
            java.lang.String r0 = "AlarmHelper"
            java.lang.String r1 = "ScheduleAlarmAfter--->"
            c.d.a.b.h.a(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "GlobalSetting.count = "
            r1.append(r2)
            int r2 = c.d.a.b.d.p
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            c.d.a.b.h.a(r0, r1)
            int r1 = c.d.a.b.d.p
            r2 = 2
            java.lang.String r3 = "alarm"
            r4 = 201326592(0xc000000, float:9.8607613E-32)
            r5 = 0
            if (r1 != 0) goto L72
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<com.mobiletools.systemhelper.control.ScheduleRegisterReceiver> r6 = com.mobiletools.systemhelper.control.ScheduleRegisterReceiver.class
            r1.<init>(r7, r6)
            android.app.PendingIntent r1 = android.app.PendingIntent.getBroadcast(r7, r5, r1, r4)
            java.lang.Object r7 = r7.getSystemService(r3)
            android.app.AlarmManager r7 = (android.app.AlarmManager) r7
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 + r8
            long r3 = r3 + r10
            r7.setExactAndAllowWhileIdle(r2, r3, r1)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = "GlobalSetting.DEFAULT_RANDOM_SCHEGULE ScheduleAlarmAfter test: "
            r7.append(r10)
            long r10 = c.d.a.b.d.n
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            c.d.a.b.h.a(r0, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = "测试助手修改后的rand ： "
            r7.append(r10)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            c.d.a.b.h.a(r0, r7)
            int r7 = c.d.a.b.d.p
            int r7 = r7 + 1
            c.d.a.b.d.p = r7
            goto La1
        L72:
            android.content.Intent r8 = new android.content.Intent
            java.lang.Class<com.mobiletools.systemhelper.control.ScheduleRegisterReceiver> r9 = com.mobiletools.systemhelper.control.ScheduleRegisterReceiver.class
            r8.<init>(r7, r9)
            android.app.PendingIntent r8 = android.app.PendingIntent.getBroadcast(r7, r5, r8, r4)
            java.lang.Object r7 = r7.getSystemService(r3)
            android.app.AlarmManager r7 = (android.app.AlarmManager) r7
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 + r10
            r7.setExactAndAllowWhileIdle(r2, r3, r8)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "GlobalSetting.DEFAULT_RANDOM_SCHEGULE ScheduleAlarmAfter: "
            r7.append(r8)
            long r8 = c.d.a.b.d.n
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            c.d.a.b.h.a(r0, r7)
        La1:
            return
    }

    public static void c(android.content.Context r3, long r4) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.mobiletools.systemhelper.control.SIMStateReceiver> r1 = com.mobiletools.systemhelper.control.SIMStateReceiver.class
            r0.<init>(r3, r1)
            r1 = 0
            r2 = 201326592(0xc000000, float:9.8607613E-32)
            android.app.PendingIntent r0 = android.app.PendingIntent.getBroadcast(r3, r1, r0, r2)
            java.lang.String r1 = "alarm"
            java.lang.Object r3 = r3.getSystemService(r1)
            android.app.AlarmManager r3 = (android.app.AlarmManager) r3
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r1 = r1 + r4
            r4 = 2
            r3.setExactAndAllowWhileIdle(r4, r1, r0)
            return
    }

    public static void c(android.content.Context r7, long r8, long r10) {
            java.lang.String r0 = "AlarmHelper"
            java.lang.String r1 = "SignalInfoAlarmAfter--->"
            c.d.a.b.h.a(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "GlobalSetting.count_sig = "
            r1.append(r2)
            int r2 = c.d.a.b.d.r
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            c.d.a.b.h.a(r0, r1)
            int r1 = c.d.a.b.d.r
            r2 = 2
            java.lang.String r3 = "alarm"
            r4 = 201326592(0xc000000, float:9.8607613E-32)
            r5 = 0
            if (r1 != 0) goto L5c
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<com.mobiletools.systemhelper.control.SignalInfoRegisterReceiver> r6 = com.mobiletools.systemhelper.control.SignalInfoRegisterReceiver.class
            r1.<init>(r7, r6)
            android.app.PendingIntent r1 = android.app.PendingIntent.getBroadcast(r7, r5, r1, r4)
            java.lang.Object r7 = r7.getSystemService(r3)
            android.app.AlarmManager r7 = (android.app.AlarmManager) r7
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 + r8
            long r3 = r3 + r10
            r7.setExactAndAllowWhileIdle(r2, r3, r1)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = "测试助手修改后的rand ： "
            r7.append(r10)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            c.d.a.b.h.a(r0, r7)
            int r7 = c.d.a.b.d.r
            int r7 = r7 + 1
            c.d.a.b.d.r = r7
            goto L7a
        L5c:
            java.lang.String r8 = "GlobalSetting.count_sig > 0"
            c.d.a.b.h.a(r0, r8)
            android.content.Intent r8 = new android.content.Intent
            java.lang.Class<com.mobiletools.systemhelper.control.SignalInfoRegisterReceiver> r9 = com.mobiletools.systemhelper.control.SignalInfoRegisterReceiver.class
            r8.<init>(r7, r9)
            android.app.PendingIntent r8 = android.app.PendingIntent.getBroadcast(r7, r5, r8, r4)
            java.lang.Object r7 = r7.getSystemService(r3)
            android.app.AlarmManager r7 = (android.app.AlarmManager) r7
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 + r10
            r7.setExactAndAllowWhileIdle(r2, r0, r8)
        L7a:
            return
    }
}
