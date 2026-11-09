.class public La/a/a/c/b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/a/a/c/b$b;
    }
.end annotation


# static fields
.field public static g:La/a/a/c/b;


# instance fields
.field public a:Z

.field public b:Landroid/os/Handler;

.field public c:Landroid/app/AlarmManager;

.field public d:La/a/a/c/b$b;

.field public e:Landroid/app/PendingIntent;

.field public f:J


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, La/a/a/c/b;->a:Z

    const/4 v0, 0x0

    iput-object v0, p0, La/a/a/c/b;->b:Landroid/os/Handler;

    iput-object v0, p0, La/a/a/c/b;->c:Landroid/app/AlarmManager;

    iput-object v0, p0, La/a/a/c/b;->d:La/a/a/c/b$b;

    iput-object v0, p0, La/a/a/c/b;->e:Landroid/app/PendingIntent;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, La/a/a/c/b;->f:J

    return-void
.end method

.method public static synthetic a(La/a/a/c/b;Landroid/app/PendingIntent;)Landroid/app/PendingIntent;
    .locals 0

    iput-object p1, p0, La/a/a/c/b;->e:Landroid/app/PendingIntent;

    return-object p1
.end method

.method public static synthetic a(La/a/a/c/b;)V
    .locals 0

    invoke-virtual {p0}, La/a/a/c/b;->d()V

    return-void
.end method

.method public static synthetic b(La/a/a/c/b;)V
    .locals 0

    invoke-virtual {p0}, La/a/a/c/b;->a()V

    return-void
.end method

.method public static synthetic c(La/a/a/c/b;)Z
    .locals 0

    iget-boolean p0, p0, La/a/a/c/b;->a:Z

    return p0
.end method

.method public static synthetic d(La/a/a/c/b;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, La/a/a/c/b;->b:Landroid/os/Handler;

    return-object p0
.end method

.method public static declared-synchronized g()La/a/a/c/b;
    .locals 2

    const-class v0, La/a/a/c/b;

    monitor-enter v0

    :try_start_0
    sget-object v1, La/a/a/c/b;->g:La/a/a/c/b;

    if-nez v1, :cond_0

    new-instance v1, La/a/a/c/b;

    invoke-direct {v1}, La/a/a/c/b;-><init>()V

    sput-object v1, La/a/a/c/b;->g:La/a/a/c/b;

    :cond_0
    sget-object v1, La/a/a/c/b;->g:La/a/a/c/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-boolean v0, p0, La/a/a/c/b;->a:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, La/a/a/c/b;->e:Landroid/app/PendingIntent;

    if-eqz v1, :cond_1

    iget-object v2, p0, La/a/a/c/b;->c:Landroid/app/AlarmManager;

    invoke-virtual {v2, v1}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    iput-object v0, p0, La/a/a/c/b;->e:Landroid/app/PendingIntent;

    :cond_1
    invoke-static {}, Lcom/baidu/location/f;->c()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, La/a/a/c/b;->d:La/a/a/c/b$b;

    invoke-virtual {v1, v2}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    iput-object v0, p0, La/a/a/c/b;->c:Landroid/app/AlarmManager;

    iput-object v0, p0, La/a/a/c/b;->d:La/a/a/c/b$b;

    iput-object v0, p0, La/a/a/c/b;->b:Landroid/os/Handler;

    const/4 v0, 0x0

    iput-boolean v0, p0, La/a/a/c/b;->a:Z

    return-void
.end method

.method public b()V
    .locals 1

    iget-boolean v0, p0, La/a/a/c/b;->a:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object p0, p0, La/a/a/c/b;->b:Landroid/os/Handler;

    if-eqz p0, :cond_1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    :cond_1
    return-void
.end method

.method public c()V
    .locals 1

    iget-boolean v0, p0, La/a/a/c/b;->a:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object p0, p0, La/a/a/c/b;->b:Landroid/os/Handler;

    if-eqz p0, :cond_1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    :cond_1
    return-void
.end method

.method public final d()V
    .locals 6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, La/a/a/c/b;->f:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, La/a/a/c/b;->e:Landroid/app/PendingIntent;

    if-eqz v0, :cond_1

    iget-object v1, p0, La/a/a/c/b;->c:Landroid/app/AlarmManager;

    invoke-virtual {v1, v0}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    const/4 v0, 0x0

    iput-object v0, p0, La/a/a/c/b;->e:Landroid/app/PendingIntent;

    :cond_1
    iget-object v0, p0, La/a/a/c/b;->e:Landroid/app/PendingIntent;

    if-nez v0, :cond_2

    invoke-static {}, Lcom/baidu/location/f;->c()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.baidu.location.autonotifyloc_9.5.2.1"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/high16 v2, 0xc000000

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    iput-object v0, p0, La/a/a/c/b;->e:Landroid/app/PendingIntent;

    iget-object v0, p0, La/a/a/c/b;->c:Landroid/app/AlarmManager;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sget v4, La/a/a/i/i;->T:I

    int-to-long v4, v4

    add-long/2addr v1, v4

    iget-object v4, p0, La/a/a/c/b;->e:Landroid/app/PendingIntent;

    invoke-virtual {v0, v3, v1, v2, v4}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V

    :cond_2
    new-instance v0, Landroid/os/Message;

    invoke-direct {v0}, Landroid/os/Message;-><init>()V

    const/16 v1, 0x16

    iput v1, v0, Landroid/os/Message;->what:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-wide v3, p0, La/a/a/c/b;->f:J

    sub-long/2addr v1, v3

    sget v3, La/a/a/i/i;->U:I

    int-to-long v3, v3

    cmp-long v1, v1, v3

    if-gez v1, :cond_3

    return-void

    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, p0, La/a/a/c/b;->f:J

    invoke-static {}, La/a/a/g/d;->n()La/a/a/g/d;

    move-result-object p0

    invoke-virtual {p0}, La/a/a/g/d;->j()Z

    move-result p0

    if-nez p0, :cond_4

    invoke-static {}, La/a/a/b/o;->q()La/a/a/b/o;

    move-result-object p0

    invoke-virtual {p0, v0}, La/a/a/b/o;->f(Landroid/os/Message;)V

    :cond_4
    return-void
.end method

.method public e()V
    .locals 6

    iget-boolean v0, p0, La/a/a/c/b;->a:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget v0, La/a/a/i/i;->T:I

    const/16 v1, 0x2710

    if-lt v0, v1, :cond_2

    iget-object v0, p0, La/a/a/c/b;->b:Landroid/os/Handler;

    if-nez v0, :cond_1

    new-instance v0, La/a/a/c/b$a;

    invoke-direct {v0, p0}, La/a/a/c/b$a;-><init>(La/a/a/c/b;)V

    iput-object v0, p0, La/a/a/c/b;->b:Landroid/os/Handler;

    :cond_1
    invoke-static {}, Lcom/baidu/location/f;->c()Landroid/content/Context;

    move-result-object v0

    const-string v1, "alarm"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AlarmManager;

    iput-object v0, p0, La/a/a/c/b;->c:Landroid/app/AlarmManager;

    new-instance v0, La/a/a/c/b$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, La/a/a/c/b$b;-><init>(La/a/a/c/b;La/a/a/c/b$a;)V

    iput-object v0, p0, La/a/a/c/b;->d:La/a/a/c/b$b;

    invoke-static {}, Lcom/baidu/location/f;->c()Landroid/content/Context;

    move-result-object v0

    iget-object v2, p0, La/a/a/c/b;->d:La/a/a/c/b$b;

    new-instance v3, Landroid/content/IntentFilter;

    const-string v4, "com.baidu.location.autonotifyloc_9.5.2.1"

    invoke-direct {v3, v4}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const-string v5, "android.permission.ACCESS_FINE_LOCATION"

    invoke-virtual {v0, v2, v3, v5, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    invoke-static {}, Lcom/baidu/location/f;->c()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/high16 v2, 0xc000000

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    iput-object v0, p0, La/a/a/c/b;->e:Landroid/app/PendingIntent;

    iget-object v0, p0, La/a/a/c/b;->c:Landroid/app/AlarmManager;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sget v4, La/a/a/i/i;->T:I

    int-to-long v4, v4

    add-long/2addr v1, v4

    iget-object v4, p0, La/a/a/c/b;->e:Landroid/app/PendingIntent;

    invoke-virtual {v0, v3, v1, v2, v4}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, La/a/a/c/b;->a:Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, La/a/a/c/b;->f:J

    :cond_2
    return-void
.end method

.method public f()V
    .locals 1

    iget-boolean v0, p0, La/a/a/c/b;->a:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object p0, p0, La/a/a/c/b;->b:Landroid/os/Handler;

    if-eqz p0, :cond_1

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    :cond_1
    return-void
.end method
