.class public La/a/a/g/d$g;
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
    name = "g"
.end annotation


# instance fields
.field public final synthetic a:La/a/a/g/d;


# direct methods
.method public constructor <init>(La/a/a/g/d;)V
    .locals 0

    iput-object p1, p0, La/a/a/g/d$g;->a:La/a/a/g/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/a/a/g/d;La/a/a/g/d$a;)V
    .locals 0

    invoke-direct {p0, p1}, La/a/a/g/d$g;-><init>(La/a/a/g/d;)V

    return-void
.end method


# virtual methods
.method public onLocationChanged(Landroid/location/Location;)V
    .locals 5

    if-nez p1, :cond_0

    sget v0, La/a/a/i/i;->e:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    invoke-static {}, La/a/a/i/i;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, La/a/a/g/c;->e()La/a/a/g/c;

    move-result-object p0

    invoke-virtual {p0, p1}, La/a/a/g/c;->b(Landroid/location/Location;)V

    return-void

    :cond_1
    invoke-static {p1}, La/a/a/i/i;->a(Landroid/location/Location;)Z

    move-result v0

    if-eqz v0, :cond_2

    return-void

    :cond_2
    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    const-wide v2, 0x4076800000000000L    # 360.0

    cmpl-double v0, v0, v2

    if-gtz v0, :cond_8

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p0, La/a/a/g/d$g;->a:La/a/a/g/d;

    invoke-virtual {p1}, Landroid/location/Location;->getTime()J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    div-long/2addr v1, v3

    invoke-static {v0, v1, v2}, La/a/a/g/d;->a(La/a/a/g/d;J)J

    iget-object v0, p0, La/a/a/g/d$g;->a:La/a/a/g/d;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, La/a/a/g/d;->b(La/a/a/g/d;J)J

    iget-object v0, p0, La/a/a/g/d$g;->a:La/a/a/g/d;

    invoke-static {v0}, La/a/a/g/d;->c(La/a/a/g/d;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_4

    iget-object v0, p0, La/a/a/g/d$g;->a:La/a/a/g/d;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-object v3, p0, La/a/a/g/d$g;->a:La/a/a/g/d;

    invoke-static {v3}, La/a/a/g/d;->c(La/a/a/g/d;)J

    move-result-wide v3

    sub-long/2addr v1, v3

    invoke-static {v0, v1, v2}, La/a/a/g/d;->d(La/a/a/g/d;J)J

    :cond_4
    iget-object v0, p0, La/a/a/g/d$g;->a:La/a/a/g/d;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, La/a/a/g/d;->c(La/a/a/g/d;J)J

    sget v0, La/a/a/g/d;->X:I

    if-nez v0, :cond_5

    :try_start_0
    invoke-virtual {p1}, Landroid/location/Location;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    const-string v2, "satellites"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_5
    if-eqz v0, :cond_6

    invoke-static {}, La/a/a/b/o;->q()La/a/a/b/o;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/b/o;->k()Z

    move-result v0

    if-eqz v0, :cond_7

    :cond_6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    iget-object v0, p0, La/a/a/g/d$g;->a:La/a/a/g/d;

    invoke-static {v0}, La/a/a/g/d;->d(La/a/a/g/d;)J

    :cond_7
    iget-object v0, p0, La/a/a/g/d$g;->a:La/a/a/g/d;

    const/4 v1, 0x1

    invoke-static {v0, v1}, La/a/a/g/d;->a(La/a/a/g/d;Z)V

    iget-object v0, p0, La/a/a/g/d$g;->a:La/a/a/g/d;

    invoke-static {v0, p1}, La/a/a/g/d;->a(La/a/a/g/d;Landroid/location/Location;)V

    iget-object p0, p0, La/a/a/g/d$g;->a:La/a/a/g/d;

    const/4 p1, 0x0

    invoke-static {p0, p1}, La/a/a/g/d;->b(La/a/a/g/d;Z)Z

    :cond_8
    :goto_0
    return-void
.end method

.method public onProviderDisabled(Ljava/lang/String;)V
    .locals 1

    iget-object p1, p0, La/a/a/g/d$g;->a:La/a/a/g/d;

    const/4 v0, 0x0

    invoke-static {p1, v0}, La/a/a/g/d;->a(La/a/a/g/d;Landroid/location/Location;)V

    iget-object p0, p0, La/a/a/g/d$g;->a:La/a/a/g/d;

    const/4 p1, 0x0

    invoke-static {p0, p1}, La/a/a/g/d;->a(La/a/a/g/d;Z)V

    return-void
.end method

.method public onProviderEnabled(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onStatusChanged(Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 2

    const/4 p1, 0x0

    if-eqz p2, :cond_2

    const/4 p3, 0x1

    if-eq p2, p3, :cond_1

    const/4 p3, 0x2

    if-eq p2, p3, :cond_0

    goto :goto_1

    :cond_0
    iget-object p0, p0, La/a/a/g/d$g;->a:La/a/a/g/d;

    invoke-static {p0, p1}, La/a/a/g/d;->b(La/a/a/g/d;Z)Z

    goto :goto_1

    :cond_1
    iget-object p2, p0, La/a/a/g/d$g;->a:La/a/a/g/d;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {p2, v0, v1}, La/a/a/g/d;->f(La/a/a/g/d;J)J

    iget-object p2, p0, La/a/a/g/d$g;->a:La/a/a/g/d;

    invoke-static {p2, p3}, La/a/a/g/d;->b(La/a/a/g/d;Z)Z

    goto :goto_0

    :cond_2
    iget-object p2, p0, La/a/a/g/d$g;->a:La/a/a/g/d;

    const/4 p3, 0x0

    invoke-static {p2, p3}, La/a/a/g/d;->a(La/a/a/g/d;Landroid/location/Location;)V

    :goto_0
    iget-object p0, p0, La/a/a/g/d$g;->a:La/a/a/g/d;

    invoke-static {p0, p1}, La/a/a/g/d;->a(La/a/a/g/d;Z)V

    :goto_1
    return-void
.end method
