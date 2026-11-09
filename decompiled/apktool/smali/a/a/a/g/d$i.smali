.class public La/a/a/g/d$i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/location/LocationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/g/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "i"
.end annotation


# instance fields
.field public a:J

.field public final synthetic b:La/a/a/g/d;


# direct methods
.method public constructor <init>(La/a/a/g/d;)V
    .locals 2

    iput-object p1, p0, La/a/a/g/d$i;->b:La/a/a/g/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, La/a/a/g/d$i;->a:J

    return-void
.end method

.method public synthetic constructor <init>(La/a/a/g/d;La/a/a/g/d$a;)V
    .locals 0

    invoke-direct {p0, p1}, La/a/a/g/d$i;-><init>(La/a/a/g/d;)V

    return-void
.end method


# virtual methods
.method public onLocationChanged(Landroid/location/Location;)V
    .locals 6

    iget-object v0, p0, La/a/a/g/d$i;->b:La/a/a/g/d;

    invoke-static {v0}, La/a/a/g/d;->a(La/a/a/g/d;)Z

    move-result v0

    const/4 v1, 0x4

    if-eqz v0, :cond_0

    sget v0, La/a/a/i/i;->e:I

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    move-result-object v0

    const-string v2, "gps"

    invoke-static {v0, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, La/a/a/g/d$i;->a:J

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x2710

    cmp-long v0, v2, v4

    if-gez v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    move-result-wide v2

    const-wide v4, 0x4076800000000000L    # 360.0

    cmpl-double v0, v2, v4

    if-gtz v0, :cond_3

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    move-result-wide v2

    cmpl-double v0, v2, v4

    if-lez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    invoke-static {p1, v0}, La/a/a/b/y;->a(Landroid/location/Location;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, p0, La/a/a/g/d$i;->a:J

    iget-object v0, p0, La/a/a/g/d$i;->b:La/a/a/g/d;

    invoke-static {v0}, La/a/a/g/d;->m(La/a/a/g/d;)La/a/a/g/d$f;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, La/a/a/g/d$i;->b:La/a/a/g/d;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, v0, La/a/a/g/d;->T:J

    iget-object v0, p0, La/a/a/g/d$i;->b:La/a/a/g/d;

    invoke-static {v0}, La/a/a/g/d;->m(La/a/a/g/d;)La/a/a/g/d$f;

    move-result-object v0

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    iget-object p0, p0, La/a/a/g/d$i;->b:La/a/a/g/d;

    invoke-static {p0}, La/a/a/g/d;->m(La/a/a/g/d;)La/a/a/g/d$f;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    nop

    :cond_3
    :goto_0
    return-void
.end method

.method public onProviderDisabled(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onProviderEnabled(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onStatusChanged(Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 0

    return-void
.end method
