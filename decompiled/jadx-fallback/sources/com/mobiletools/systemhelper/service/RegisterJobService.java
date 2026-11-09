package com.mobiletools.systemhelper.service;

/* JADX INFO: loaded from: classes.dex */
public class RegisterJobService extends android.app.job.JobService {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.lang.String f1427b = null;

    static {
            java.lang.Class<com.mobiletools.systemhelper.service.RegisterJobService> r0 = com.mobiletools.systemhelper.service.RegisterJobService.class
            java.lang.String r0 = r0.getSimpleName()
            com.mobiletools.systemhelper.service.RegisterJobService.f1427b = r0
            return
    }

    public RegisterJobService() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.app.Service
    public void onCreate() {
            r1 = this;
            super.onCreate()
            java.lang.String r1 = com.mobiletools.systemhelper.service.RegisterJobService.f1427b
            java.lang.String r0 = "Service created"
            c.d.a.b.h.a(r1, r0)
            return
    }

    @Override // android.app.Service
    public void onDestroy() {
            r1 = this;
            super.onDestroy()
            java.lang.String r1 = com.mobiletools.systemhelper.service.RegisterJobService.f1427b
            java.lang.String r0 = "Service destroyed"
            c.d.a.b.h.a(r1, r0)
            return
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent r1, int r2, int r3) {
            r0 = this;
            java.lang.String r0 = com.mobiletools.systemhelper.service.RegisterJobService.f1427b
            java.lang.String r1 = "onStartCommand"
            c.d.a.b.h.a(r0, r1)
            r0 = 2
            return r0
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(android.app.job.JobParameters r3) {
            r2 = this;
            java.lang.String r2 = com.mobiletools.systemhelper.service.RegisterJobService.f1427b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "on start jobId: "
            r0.append(r1)
            int r3 = r3.getJobId()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            c.d.a.b.h.a(r2, r3)
            r2 = 1
            return r2
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(android.app.job.JobParameters r3) {
            r2 = this;
            java.lang.String r2 = com.mobiletools.systemhelper.service.RegisterJobService.f1427b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "on stop job: "
            r0.append(r1)
            int r3 = r3.getJobId()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            android.util.Log.i(r2, r3)
            r2 = 0
            return r2
    }
}
