.class public La/a/a/g/c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/a/a/g/c$c;,
        La/a/a/g/c$b;
    }
.end annotation


# instance fields
.field public a:La/a/a/g/c$c;

.field public b:Landroid/location/Location;

.field public c:Landroid/location/Location;

.field public d:J

.field public e:J

.field public f:Ljava/util/Timer;

.field public g:Ljava/util/TimerTask;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, La/a/a/g/c;->a:La/a/a/g/c$c;

    iput-object v0, p0, La/a/a/g/c;->b:Landroid/location/Location;

    iput-object v0, p0, La/a/a/g/c;->c:Landroid/location/Location;

    const-wide/16 v1, 0x0

    iput-wide v1, p0, La/a/a/g/c;->d:J

    iput-wide v1, p0, La/a/a/g/c;->e:J

    iput-object v0, p0, La/a/a/g/c;->f:Ljava/util/Timer;

    iput-object v0, p0, La/a/a/g/c;->g:Ljava/util/TimerTask;

    return-void
.end method

.method public static e()La/a/a/g/c;
    .locals 1

    invoke-static {}, La/a/a/g/c$b;->a()La/a/a/g/c;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()Landroid/location/Location;
    .locals 8

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, La/a/a/g/c;->e:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x7530

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    iget-object v0, p0, La/a/a/g/c;->b:Landroid/location/Location;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-wide v6, p0, La/a/a/g/c;->d:J

    sub-long/2addr v4, v6

    cmp-long v1, v4, v2

    if-gez v1, :cond_1

    iget-object v0, p0, La/a/a/g/c;->c:Landroid/location/Location;

    :cond_1
    return-object v0
.end method

.method public a(Landroid/location/Location;)Ljava/lang/String;
    .locals 8

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/location/Location;->hasAccuracy()Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-virtual {p1}, Landroid/location/Location;->getAccuracy()F

    move-result p0

    goto :goto_0

    :cond_0
    const/high16 p0, -0x40800000    # -1.0f

    :goto_0
    float-to-int p0, p0

    sget-object v0, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    const/4 v1, 0x7

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v4, 0x1

    aput-object v2, v1, v4

    invoke-virtual {p1}, Landroid/location/Location;->getSpeed()F

    move-result v2

    float-to-double v4, v2

    const-wide v6, 0x400ccccccccccccdL    # 3.6

    mul-double/2addr v4, v6

    double-to-float v2, v4

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v4, 0x2

    aput-object v2, v1, v4

    invoke-virtual {p1}, Landroid/location/Location;->getBearing()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v4, 0x3

    aput-object v2, v1, v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-virtual {p1}, Landroid/location/Location;->getTime()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const/4 v2, 0x5

    aput-object p1, v1, v2

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/4 p1, 0x6

    aput-object p0, v1, p1

    const-string p0, "&ll=%.5f|%.5f&s=%.1f&d=%.1f&ll_n=%d&ll_t=%d&ll_r=%d"

    invoke-static {v0, p0, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    goto :goto_1

    :cond_1
    const/4 p0, 0x0

    :goto_1
    return-object p0
.end method

.method public a(Landroid/location/Location;Landroid/location/Location;)Z
    .locals 11

    const/4 p0, 0x0

    if-nez p2, :cond_0

    return p0

    :cond_0
    const/4 v0, 0x1

    if-nez p1, :cond_1

    return v0

    :cond_1
    const/4 v1, 0x2

    :try_start_0
    new-array v1, v1, [F

    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v2

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v4

    invoke-virtual {p2}, Landroid/location/Location;->getLatitude()D

    move-result-wide v6

    invoke-virtual {p2}, Landroid/location/Location;->getLongitude()D

    move-result-wide v8

    move-object v10, v1

    invoke-static/range {v2 .. v10}, Landroid/location/Location;->distanceBetween(DDDD[F)V

    aget p1, v1, p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/high16 p2, 0x42c80000    # 100.0f

    cmpg-float p1, p1, p2

    if-gez p1, :cond_2

    return p0

    :catch_0
    :cond_2
    return v0
.end method

.method public b()V
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-ge v0, v1, :cond_0

    return-void

    :cond_0
    sget v0, La/a/a/i/i;->x0:I

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-static {}, La/a/a/i/i;->k()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, La/a/a/g/c;->d()V

    iget-object v0, p0, La/a/a/g/c;->f:Ljava/util/Timer;

    if-nez v0, :cond_2

    iget-object v0, p0, La/a/a/g/c;->g:Ljava/util/TimerTask;

    if-nez v0, :cond_2

    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, La/a/a/g/c;->f:Ljava/util/Timer;

    new-instance v0, La/a/a/g/c$a;

    invoke-direct {v0, p0}, La/a/a/g/c$a;-><init>(La/a/a/g/c;)V

    iput-object v0, p0, La/a/a/g/c;->g:Ljava/util/TimerTask;

    iget-object v1, p0, La/a/a/g/c;->f:Ljava/util/Timer;

    const-wide/32 v2, 0xea60

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_2
    iget-object v0, p0, La/a/a/g/c;->a:La/a/a/g/c$c;

    if-nez v0, :cond_4

    new-instance v0, La/a/a/g/c$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, La/a/a/g/c$c;-><init>(La/a/a/g/c;La/a/a/g/c$a;)V

    iput-object v0, p0, La/a/a/g/c;->a:La/a/a/g/c$c;

    invoke-static {}, La/a/a/b/p;->c()La/a/a/b/p;

    move-result-object v0

    iget-object p0, p0, La/a/a/g/c;->a:La/a/a/g/c$c;

    invoke-virtual {v0, p0}, La/a/a/b/p;->a(La/a/a/b/p$d;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, La/a/a/g/c;->c()V

    :cond_4
    :goto_0
    return-void
.end method

.method public b(Landroid/location/Location;)V
    .locals 2

    iput-object p1, p0, La/a/a/g/c;->c:Landroid/location/Location;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, La/a/a/g/c;->d:J

    return-void
.end method

.method public declared-synchronized c()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, La/a/a/g/c;->a:La/a/a/g/c$c;

    if-eqz v0, :cond_0

    invoke-static {}, La/a/a/b/p;->c()La/a/a/b/p;

    move-result-object v0

    iget-object v1, p0, La/a/a/g/c;->a:La/a/a/g/c$c;

    invoke-virtual {v0, v1}, La/a/a/b/p;->b(La/a/a/b/p$d;)V

    const/4 v0, 0x0

    iput-object v0, p0, La/a/a/g/c;->a:La/a/a/g/c$c;

    :cond_0
    invoke-virtual {p0}, La/a/a/g/c;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized d()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, La/a/a/g/c;->g:Ljava/util/TimerTask;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/TimerTask;->cancel()Z

    iput-object v1, p0, La/a/a/g/c;->g:Ljava/util/TimerTask;

    :cond_0
    iget-object v0, p0, La/a/a/g/c;->f:Ljava/util/Timer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    iget-object v0, p0, La/a/a/g/c;->f:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->purge()I

    iput-object v1, p0, La/a/a/g/c;->f:Ljava/util/Timer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
