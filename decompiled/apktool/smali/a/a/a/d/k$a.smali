.class public La/a/a/d/k$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/hardware/SensorEventListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/d/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:La/a/a/d/k;


# direct methods
.method public constructor <init>(La/a/a/d/k;)V
    .locals 0

    iput-object p1, p0, La/a/a/d/k$a;->a:La/a/a/d/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    return-void
.end method

.method public onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 14

    iget-object v0, p1, Landroid/hardware/SensorEvent;->sensor:Landroid/hardware/Sensor;

    invoke-virtual {v0}, Landroid/hardware/Sensor;->getType()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/16 v2, 0xb

    if-eq v0, v2, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-object p1, p1, Landroid/hardware/SensorEvent;->values:[F

    invoke-virtual {p1}, [F->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [F

    iget-object v0, p0, La/a/a/d/k$a;->a:La/a/a/d/k;

    invoke-static {v0}, La/a/a/d/k;->e(La/a/a/d/k;)[F

    move-result-object v0

    invoke-static {v0, p1}, Landroid/hardware/SensorManager;->getRotationMatrixFromVector([F[F)V

    iget-object p1, p0, La/a/a/d/k$a;->a:La/a/a/d/k;

    invoke-static {p1}, La/a/a/d/k;->e(La/a/a/d/k;)[F

    move-result-object p1

    iget-object v0, p0, La/a/a/d/k$a;->a:La/a/a/d/k;

    invoke-static {v0}, La/a/a/d/k;->f(La/a/a/d/k;)[F

    move-result-object v0

    invoke-static {p1, v0}, Landroid/hardware/SensorManager;->getOrientation([F[F)[F

    const/4 p1, 0x3

    new-array p1, p1, [F

    iget-object v0, p0, La/a/a/d/k$a;->a:La/a/a/d/k;

    invoke-static {v0}, La/a/a/d/k;->f(La/a/a/d/k;)[F

    move-result-object v0

    const/4 v2, 0x0

    aget v0, v0, v2

    float-to-double v3, v0

    invoke-static {v3, v4}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmpg-double v0, v3, v5

    const/4 v5, 0x2

    if-gez v0, :cond_1

    const-wide v6, 0x4076800000000000L    # 360.0

    add-double/2addr v3, v6

    double-to-float v0, v3

    const/high16 v3, 0x43b40000    # 360.0f

    rem-float/2addr v0, v3

    aput v0, p1, v5

    goto :goto_0

    :cond_1
    double-to-float v0, v3

    aput v0, p1, v5

    :goto_0
    iget-object v0, p0, La/a/a/d/k$a;->a:La/a/a/d/k;

    aget v3, p1, v5

    invoke-static {v0, v3}, La/a/a/d/k;->a(La/a/a/d/k;F)F

    iget-object v0, p0, La/a/a/d/k$a;->a:La/a/a/d/k;

    invoke-static {v0}, La/a/a/d/k;->f(La/a/a/d/k;)[F

    move-result-object v0

    aget v0, v0, v1

    float-to-double v3, v0

    invoke-static {v3, v4}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v3

    double-to-float v0, v3

    aput v0, p1, v2

    iget-object v0, p0, La/a/a/d/k$a;->a:La/a/a/d/k;

    invoke-static {v0}, La/a/a/d/k;->f(La/a/a/d/k;)[F

    move-result-object v0

    aget v0, v0, v5

    float-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v2

    double-to-float v0, v2

    aput v0, p1, v1

    iget-object p0, p0, La/a/a/d/k$a;->a:La/a/a/d/k;

    invoke-static {p0}, La/a/a/d/k;->a(La/a/a/d/k;)Z

    move-result p0

    if-eqz p0, :cond_5

    invoke-static {}, La/a/a/d/m/a;->a()Z

    move-result p0

    if-eqz p0, :cond_5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const/4 p0, 0x5

    invoke-static {p0, p1, v0, v1}, La/a/a/d/m/a;->a(I[FJ)Ljava/lang/String;

    goto/16 :goto_2

    :cond_2
    iget-object p1, p1, Landroid/hardware/SensorEvent;->values:[F

    invoke-virtual {p1}, [F->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [F

    iget-object v0, p0, La/a/a/d/k$a;->a:La/a/a/d/k;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v0, v2, v3}, La/a/a/d/k;->a(La/a/a/d/k;J)J

    iget-object v0, p0, La/a/a/d/k$a;->a:La/a/a/d/k;

    invoke-static {v0}, La/a/a/d/k;->a(La/a/a/d/k;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, La/a/a/d/m/a;->a()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v1, p1, v2, v3}, La/a/a/d/m/a;->a(I[FJ)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, v1, :cond_5

    invoke-static {}, La/a/a/d/m/a;->b()F

    move-result v0

    const v1, 0x3c23d70a    # 0.01f

    cmpl-float v1, v0, v1

    if-lez v1, :cond_3

    iget-object v1, p0, La/a/a/d/k$a;->a:La/a/a/d/k;

    invoke-static {v1}, La/a/a/d/k;->b(La/a/a/d/k;)I

    :cond_3
    :try_start_0
    iget-object v1, p0, La/a/a/d/k$a;->a:La/a/a/d/k;

    invoke-static {v1}, La/a/a/d/k;->c(La/a/a/d/k;)Ljava/util/Set;

    move-result-object v1

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v2, p0, La/a/a/d/k$a;->a:La/a/a/d/k;

    invoke-static {v2}, La/a/a/d/k;->c(La/a/a/d/k;)Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, La/a/a/d/k$c;

    float-to-double v5, v0

    iget-object v3, p0, La/a/a/d/k$a;->a:La/a/a/d/k;

    invoke-static {v3}, La/a/a/d/k;->d(La/a/a/d/k;)F

    move-result v3

    float-to-double v7, v3

    iget-object v3, p0, La/a/a/d/k$a;->a:La/a/a/d/k;

    invoke-static {v3}, La/a/a/d/k;->d(La/a/a/d/k;)F

    move-result v3

    float-to-double v9, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    move-object v13, p1

    invoke-interface/range {v4 .. v13}, La/a/a/d/k$c;->a(DDDJLjava/lang/String;)V

    goto :goto_1

    :cond_4
    monitor-exit v1

    goto :goto_2

    :catchall_0
    move-exception p0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_5
    :goto_2
    return-void
.end method
