package com.baidu.location;

/* JADX INFO: loaded from: classes.dex */
public interface g {
    double a();

    void a(android.content.Context r1);

    android.os.IBinder onBind(android.content.Intent r1);

    void onDestroy();

    int onStartCommand(android.content.Intent r1, int r2, int r3);

    void onTaskRemoved(android.content.Intent r1);
}
