.class public La/a/a/g/d$d;
.super Landroid/location/GnssStatus$Callback;
.source ""


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x18
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/g/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public final synthetic a:La/a/a/g/d;


# direct methods
.method public constructor <init>(La/a/a/g/d;)V
    .locals 0

    iput-object p1, p0, La/a/a/g/d$d;->a:La/a/a/g/d;

    invoke-direct {p0}, Landroid/location/GnssStatus$Callback;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/a/a/g/d;La/a/a/g/d$a;)V
    .locals 0

    invoke-direct {p0, p1}, La/a/a/g/d$d;-><init>(La/a/a/g/d;)V

    return-void
.end method


# virtual methods
.method public onFirstFix(I)V
    .locals 0

    return-void
.end method

.method public onSatelliteStatusChanged(Landroid/location/GnssStatus;)V
    .locals 14

    iget-object v0, p0, La/a/a/g/d$d;->a:La/a/a/g/d;

    invoke-static {v0}, La/a/a/g/d;->e(La/a/a/g/d;)Landroid/location/LocationManager;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, La/a/a/g/d$d;->a:La/a/a/g/d;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, La/a/a/g/d;->e(La/a/a/g/d;J)J

    invoke-virtual {p1}, Landroid/location/GnssStatus;->getSatelliteCount()I

    move-result v0

    iget-object v1, p0, La/a/a/g/d$d;->a:La/a/a/g/d;

    invoke-static {v1}, La/a/a/g/d;->f(La/a/a/g/d;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-object v1, p0, La/a/a/g/d$d;->a:La/a/a/g/d;

    invoke-static {v1}, La/a/a/g/d;->g(La/a/a/g/d;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-object v1, p0, La/a/a/g/d$d;->a:La/a/a/g/d;

    invoke-static {v1}, La/a/a/g/d;->h(La/a/a/g/d;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-object v1, p0, La/a/a/g/d$d;->a:La/a/a/g/d;

    invoke-static {v1}, La/a/a/g/d;->i(La/a/a/g/d;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    move v4, v3

    move v5, v4

    :goto_0
    const/4 v6, 0x1

    if-ge v2, v0, :cond_8

    add-int/lit8 v3, v3, 0x1

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1, v2}, Landroid/location/GnssStatus;->getConstellationType(I)I

    move-result v8

    invoke-virtual {p1, v2}, Landroid/location/GnssStatus;->getAzimuthDegrees(I)F

    move-result v9

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1, v2}, Landroid/location/GnssStatus;->getElevationDegrees(I)F

    move-result v9

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1, v2}, Landroid/location/GnssStatus;->getCn0DbHz(I)F

    move-result v9

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1, v2}, Landroid/location/GnssStatus;->usedInFix(I)Z

    move-result v9

    const/high16 v10, 0x3f800000    # 1.0f

    if-eqz v9, :cond_2

    add-int/lit8 v4, v4, 0x1

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-ne v8, v6, :cond_3

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    const/4 v9, 0x0

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    :goto_1
    invoke-virtual {p1, v2}, Landroid/location/GnssStatus;->getSvid(I)I

    move-result v9

    int-to-float v9, v9

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-ne v8, v6, :cond_4

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v6, p0, La/a/a/g/d$d;->a:La/a/a/g/d;

    invoke-static {v6}, La/a/a/g/d;->f(La/a/a/g/d;)Ljava/util/ArrayList;

    move-result-object v6

    :goto_2
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    const/4 v6, 0x5

    if-ne v8, v6, :cond_5

    const/high16 v6, 0x40000000    # 2.0f

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v6, p0, La/a/a/g/d$d;->a:La/a/a/g/d;

    invoke-static {v6}, La/a/a/g/d;->g(La/a/a/g/d;)Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v6, p0, La/a/a/g/d$d;->a:La/a/a/g/d;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    invoke-static {v6, v7, v8}, La/a/a/g/d;->g(La/a/a/g/d;J)J

    goto :goto_3

    :cond_5
    const/4 v6, 0x3

    if-ne v8, v6, :cond_6

    const/high16 v6, 0x40400000    # 3.0f

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v6, p0, La/a/a/g/d$d;->a:La/a/a/g/d;

    invoke-static {v6}, La/a/a/g/d;->h(La/a/a/g/d;)Ljava/util/ArrayList;

    move-result-object v6

    goto :goto_2

    :cond_6
    const/4 v6, 0x6

    if-ne v8, v6, :cond_7

    const/high16 v6, 0x40800000    # 4.0f

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v6, p0, La/a/a/g/d$d;->a:La/a/a/g/d;

    invoke-static {v6}, La/a/a/g/d;->i(La/a/a/g/d;)Ljava/util/ArrayList;

    move-result-object v6

    goto :goto_2

    :cond_7
    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_8
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, La/a/a/g/d$d;->a:La/a/a/g/d;

    invoke-static {v0}, La/a/a/g/d;->f(La/a/a/g/d;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, La/a/a/g/d$d;->a:La/a/a/g/d;

    invoke-static {v0}, La/a/a/g/d;->g(La/a/a/g/d;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, La/a/a/g/d$d;->a:La/a/a/g/d;

    invoke-static {v0}, La/a/a/g/d;->h(La/a/a/g/d;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, La/a/a/g/d$d;->a:La/a/a/g/d;

    invoke-static {v0}, La/a/a/g/d;->i(La/a/a/g/d;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, La/a/a/g/d$d;->a:La/a/a/g/d;

    invoke-static {v0, p1}, La/a/a/g/d;->a(La/a/a/g/d;Ljava/util/ArrayList;)V

    iget-object p1, p0, La/a/a/g/d$d;->a:La/a/a/g/d;

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x1

    const/high16 v13, -0x40800000    # -1.0f

    move-object v7, p1

    invoke-static/range {v7 .. v13}, La/a/a/g/d;->a(La/a/a/g/d;ZZZZZF)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {p1, v0}, La/a/a/g/d;->b(La/a/a/g/d;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    iget-object p1, p0, La/a/a/g/d$d;->a:La/a/a/g/d;

    invoke-static {p1}, La/a/a/g/d;->j(La/a/a/g/d;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {p1, v0}, La/a/a/g/d;->c(La/a/a/g/d;Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object p1

    sput-object p1, La/a/a/g/d;->k0:Ljava/lang/String;

    iget-object p1, p0, La/a/a/g/d$d;->a:La/a/a/g/d;

    const/4 v9, 0x1

    const/4 v10, 0x1

    const/4 v11, 0x1

    move-object v7, p1

    invoke-static/range {v7 .. v13}, La/a/a/g/d;->a(La/a/a/g/d;ZZZZZF)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {p1, v0}, La/a/a/g/d;->d(La/a/a/g/d;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    iget-object p1, p0, La/a/a/g/d$d;->a:La/a/a/g/d;

    const/4 v12, 0x0

    move-object v7, p1

    invoke-static/range {v7 .. v13}, La/a/a/g/d;->a(La/a/a/g/d;ZZZZZF)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {p1, v0}, La/a/a/g/d;->e(La/a/a/g/d;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    iget-object p1, p0, La/a/a/g/d$d;->a:La/a/a/g/d;

    invoke-static {p1}, La/a/a/g/d;->k(La/a/a/g/d;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {p1, v0}, La/a/a/g/d;->c(La/a/a/g/d;Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object p1

    sput-object p1, La/a/a/g/d;->l0:Ljava/lang/String;

    invoke-static {}, La/a/a/b/d;->i()La/a/a/b/d;

    move-result-object p1

    iget p1, p1, La/a/a/b/d;->F:I

    if-ne p1, v6, :cond_9

    invoke-static {}, La/a/a/b/i;->d()La/a/a/b/i;

    move-result-object p1

    iget-object v0, p0, La/a/a/g/d$d;->a:La/a/a/g/d;

    invoke-static {v0}, La/a/a/g/d;->k(La/a/a/g/d;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p1, v0}, La/a/a/b/i;->a(Ljava/util/ArrayList;)V

    :cond_9
    sput v4, La/a/a/g/d;->X:I

    invoke-static {v5}, La/a/a/g/d;->b(I)I

    invoke-static {v3}, La/a/a/g/d;->j(I)I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, La/a/a/g/d;->a(J)J

    iget-object p1, p0, La/a/a/g/d$d;->a:La/a/a/g/d;

    invoke-static {p1}, La/a/a/g/d;->h(La/a/a/g/d;)Ljava/util/ArrayList;

    move-result-object v0

    const/high16 v2, -0x40800000    # -1.0f

    invoke-static {p1, v0, v6, v2}, La/a/a/g/d;->a(La/a/a/g/d;Ljava/util/ArrayList;ZF)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    invoke-static {p1}, La/a/a/g/d;->c(I)I

    iget-object p1, p0, La/a/a/g/d$d;->a:La/a/a/g/d;

    invoke-static {p1}, La/a/a/g/d;->i(La/a/a/g/d;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {p1, v0, v6, v2}, La/a/a/g/d;->a(La/a/a/g/d;Ljava/util/ArrayList;ZF)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    invoke-static {p1}, La/a/a/g/d;->d(I)I

    iget-object p1, p0, La/a/a/g/d$d;->a:La/a/a/g/d;

    invoke-static {p1}, La/a/a/g/d;->g(La/a/a/g/d;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {p1, v0, v6, v2}, La/a/a/g/d;->a(La/a/a/g/d;Ljava/util/ArrayList;ZF)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    invoke-static {p1}, La/a/a/g/d;->e(I)I

    iget-object p1, p0, La/a/a/g/d$d;->a:La/a/a/g/d;

    invoke-static {p1}, La/a/a/g/d;->f(La/a/a/g/d;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {p1, v0, v1, v2}, La/a/a/g/d;->a(La/a/a/g/d;Ljava/util/ArrayList;ZF)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    invoke-static {p1}, La/a/a/g/d;->f(I)I

    iget-object p1, p0, La/a/a/g/d$d;->a:La/a/a/g/d;

    invoke-static {p1}, La/a/a/g/d;->h(La/a/a/g/d;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {p1, v0, v1, v2}, La/a/a/g/d;->a(La/a/a/g/d;Ljava/util/ArrayList;ZF)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    invoke-static {p1}, La/a/a/g/d;->g(I)I

    iget-object p1, p0, La/a/a/g/d$d;->a:La/a/a/g/d;

    invoke-static {p1}, La/a/a/g/d;->i(La/a/a/g/d;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {p1, v0, v1, v2}, La/a/a/g/d;->a(La/a/a/g/d;Ljava/util/ArrayList;ZF)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    invoke-static {p1}, La/a/a/g/d;->h(I)I

    iget-object p0, p0, La/a/a/g/d$d;->a:La/a/a/g/d;

    invoke-static {p0}, La/a/a/g/d;->g(La/a/a/g/d;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-static {p0, p1, v1, v2}, La/a/a/g/d;->a(La/a/a/g/d;Ljava/util/ArrayList;ZF)Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p0

    invoke-static {p0}, La/a/a/g/d;->i(I)I

    return-void
.end method

.method public onStarted()V
    .locals 0

    return-void
.end method

.method public onStopped()V
    .locals 2

    iget-object v0, p0, La/a/a/g/d$d;->a:La/a/a/g/d;

    const/4 v1, 0x0

    invoke-static {v0, v1}, La/a/a/g/d;->a(La/a/a/g/d;Landroid/location/Location;)V

    iget-object p0, p0, La/a/a/g/d$d;->a:La/a/a/g/d;

    const/4 v0, 0x0

    invoke-static {p0, v0}, La/a/a/g/d;->a(La/a/a/g/d;Z)V

    sput v0, La/a/a/g/d;->X:I

    invoke-static {v0}, La/a/a/g/d;->b(I)I

    invoke-static {v0}, La/a/a/g/d;->c(I)I

    invoke-static {v0}, La/a/a/g/d;->d(I)I

    invoke-static {v0}, La/a/a/g/d;->e(I)I

    invoke-static {v0}, La/a/a/g/d;->f(I)I

    invoke-static {v0}, La/a/a/g/d;->g(I)I

    invoke-static {v0}, La/a/a/g/d;->h(I)I

    invoke-static {v0}, La/a/a/g/d;->i(I)I

    invoke-static {v0}, La/a/a/g/d;->j(I)I

    const/4 p0, -0x1

    invoke-static {p0}, La/a/a/g/d;->k(I)I

    invoke-static {v1}, La/a/a/g/d;->c(Landroid/location/Location;)Landroid/location/Location;

    return-void
.end method
