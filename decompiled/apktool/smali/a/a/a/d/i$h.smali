.class public La/a/a/d/i$h;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/d/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "h"
.end annotation


# instance fields
.field public a:D

.field public b:J

.field public c:J

.field public d:J

.field public e:J

.field public f:J

.field public g:J

.field public h:J

.field public i:D

.field public j:D

.field public k:D

.field public l:D

.field public m:I

.field public n:I

.field public o:La/a/a/g/k;

.field public p:J

.field public q:I

.field public r:I

.field public final synthetic s:La/a/a/d/i;


# direct methods
.method public constructor <init>(La/a/a/d/i;)V
    .locals 4

    iput-object p1, p0, La/a/a/d/i$h;->s:La/a/a/d/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    iput-wide v0, p0, La/a/a/d/i$h;->a:D

    const-wide/16 v0, 0x0

    iput-wide v0, p0, La/a/a/d/i$h;->b:J

    iput-wide v0, p0, La/a/a/d/i$h;->c:J

    iput-wide v0, p0, La/a/a/d/i$h;->d:J

    iput-wide v0, p0, La/a/a/d/i$h;->e:J

    iput-wide v0, p0, La/a/a/d/i$h;->f:J

    iput-wide v0, p0, La/a/a/d/i$h;->g:J

    iput-wide v0, p0, La/a/a/d/i$h;->h:J

    const-wide/16 v2, 0x0

    iput-wide v2, p0, La/a/a/d/i$h;->i:D

    iput-wide v2, p0, La/a/a/d/i$h;->j:D

    iput-wide v2, p0, La/a/a/d/i$h;->k:D

    iput-wide v2, p0, La/a/a/d/i$h;->l:D

    const/4 p1, 0x0

    iput p1, p0, La/a/a/d/i$h;->m:I

    iput p1, p0, La/a/a/d/i$h;->n:I

    const/4 v2, 0x0

    iput-object v2, p0, La/a/a/d/i$h;->o:La/a/a/g/k;

    iput-wide v0, p0, La/a/a/d/i$h;->p:J

    iput p1, p0, La/a/a/d/i$h;->q:I

    iput p1, p0, La/a/a/d/i$h;->r:I

    return-void
.end method

.method public static synthetic a(La/a/a/d/i$h;DDDJ)V
    .locals 0

    invoke-virtual/range {p0 .. p8}, La/a/a/d/i$h;->a(DDDJ)V

    return-void
.end method

.method public static synthetic a(La/a/a/d/i$h;Landroid/location/Location;Z)V
    .locals 0

    invoke-virtual {p0, p1, p2}, La/a/a/d/i$h;->a(Landroid/location/Location;Z)V

    return-void
.end method

.method public static synthetic a(La/a/a/d/i$h;)Z
    .locals 0

    invoke-virtual {p0}, La/a/a/d/i$h;->a()Z

    move-result p0

    return p0
.end method

.method public static synthetic a(La/a/a/d/i$h;DDD)Z
    .locals 0

    invoke-virtual/range {p0 .. p6}, La/a/a/d/i$h;->a(DDD)Z

    move-result p0

    return p0
.end method

.method public static synthetic a(La/a/a/d/i$h;Lcom/baidu/location/c;DLjava/lang/String;)Z
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, La/a/a/d/i$h;->a(Lcom/baidu/location/c;DLjava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(La/a/a/d/i$h;)V
    .locals 0

    invoke-virtual {p0}, La/a/a/d/i$h;->d()V

    return-void
.end method

.method public static synthetic c(La/a/a/d/i$h;)Z
    .locals 0

    invoke-virtual {p0}, La/a/a/d/i$h;->b()Z

    move-result p0

    return p0
.end method

.method public static synthetic d(La/a/a/d/i$h;)V
    .locals 0

    invoke-virtual {p0}, La/a/a/d/i$h;->e()V

    return-void
.end method

.method public static synthetic e(La/a/a/d/i$h;)J
    .locals 2

    iget-wide v0, p0, La/a/a/d/i$h;->b:J

    return-wide v0
.end method

.method public static synthetic f(La/a/a/d/i$h;)J
    .locals 2

    iget-wide v0, p0, La/a/a/d/i$h;->c:J

    return-wide v0
.end method


# virtual methods
.method public final a(DDDJ)V
    .locals 0

    iput-wide p7, p0, La/a/a/d/i$h;->g:J

    const/4 p1, 0x0

    iput p1, p0, La/a/a/d/i$h;->r:I

    return-void
.end method

.method public final a(Landroid/location/Location;Z)V
    .locals 16

    move-object/from16 v0, p0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, v0, La/a/a/d/i$h;->h:J

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v1

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v12

    iget-wide v5, v0, La/a/a/d/i$h;->i:D

    const-wide/16 v3, 0x0

    cmpl-double v3, v5, v3

    const/4 v14, 0x0

    if-eqz v3, :cond_2

    const/4 v3, 0x2

    new-array v15, v3, [F

    iget-wide v3, v0, La/a/a/d/i$h;->j:D

    move-wide v7, v12

    move-wide v9, v1

    move-object v11, v15

    invoke-static/range {v3 .. v11}, Landroid/location/Location;->distanceBetween(DDDD[F)V

    aget v3, v15, v14

    const/high16 v4, 0x41a00000    # 20.0f

    cmpg-float v3, v3, v4

    if-gez v3, :cond_0

    iget v3, v0, La/a/a/d/i$h;->m:I

    add-int/lit8 v3, v3, 0x1

    iput v3, v0, La/a/a/d/i$h;->m:I

    goto :goto_0

    :cond_0
    iput v14, v0, La/a/a/d/i$h;->m:I

    :goto_0
    aget v3, v15, v14

    const/high16 v4, 0x40a00000    # 5.0f

    cmpg-float v3, v3, v4

    if-gez v3, :cond_1

    iget v3, v0, La/a/a/d/i$h;->n:I

    add-int/lit8 v3, v3, 0x1

    iput v3, v0, La/a/a/d/i$h;->n:I

    goto :goto_1

    :cond_1
    iput v14, v0, La/a/a/d/i$h;->n:I

    :cond_2
    :goto_1
    iput-wide v1, v0, La/a/a/d/i$h;->i:D

    iput-wide v12, v0, La/a/a/d/i$h;->j:D

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->hasSpeed()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getSpeed()F

    move-result v1

    const/high16 v2, 0x40400000    # 3.0f

    cmpl-float v1, v1, v2

    if-lez v1, :cond_3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, v0, La/a/a/d/i$h;->e:J

    :cond_3
    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getAccuracy()F

    move-result v1

    const/high16 v2, 0x42480000    # 50.0f

    cmpg-float v1, v1, v2

    if-gez v1, :cond_4

    if-nez p2, :cond_4

    iget v1, v0, La/a/a/d/i$h;->q:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, La/a/a/d/i$h;->q:I

    goto :goto_2

    :cond_4
    iput v14, v0, La/a/a/d/i$h;->q:I

    :goto_2
    iget v1, v0, La/a/a/d/i$h;->q:I

    const/16 v2, 0xa

    if-le v1, v2, :cond_5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-wide v3, v0, La/a/a/d/i$h;->b:J

    sub-long/2addr v1, v3

    const-wide/16 v3, 0x7530

    cmp-long v1, v1, v3

    if-lez v1, :cond_5

    iget-object v0, v0, La/a/a/d/i$h;->s:La/a/a/d/i;

    invoke-virtual {v0}, La/a/a/d/i;->l()V

    :cond_5
    return-void
.end method

.method public final a()Z
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    iget-object v0, p0, La/a/a/d/i$h;->s:La/a/a/d/i;

    invoke-static {v0}, La/a/a/d/i;->d(La/a/a/d/i;)Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, La/a/a/d/i$h;->m:I

    const/4 v1, 0x3

    if-lt v0, v1, :cond_1

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/g/f;->l()Ljava/lang/String;

    move-result-object v0

    const-string v1, "&wifio"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iget-object v0, p0, La/a/a/d/i$h;->s:La/a/a/d/i;

    invoke-static {v0}, La/a/a/d/i;->r(La/a/a/d/i;)I

    move-result v0

    if-ne v0, v1, :cond_1

    :cond_0
    iput v1, p0, La/a/a/d/i$h;->r:I

    return v1

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public final a(DDD)Z
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, La/a/a/d/i$h;->s:La/a/a/d/i;

    invoke-static {v1}, La/a/a/d/i;->p(La/a/a/d/i;)La/a/a/d/i$h;

    move-result-object v1

    invoke-virtual {v1}, La/a/a/d/i$h;->c()Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_0

    return v2

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-wide v5, v0, La/a/a/d/i$h;->c:J

    const-wide/16 v7, 0x0

    cmp-long v1, v5, v7

    if-eqz v1, :cond_1

    sub-long v5, v3, v5

    const-wide/16 v7, 0x2710

    cmp-long v1, v5, v7

    if-lez v1, :cond_1

    return v2

    :cond_1
    iget v1, v0, La/a/a/d/i$h;->n:I

    const/4 v5, 0x5

    const/4 v6, 0x0

    if-lt v1, v5, :cond_2

    const-wide/high16 v7, 0x402e000000000000L    # 15.0

    cmpg-double v1, p5, v7

    if-gez v1, :cond_2

    iget-wide v7, v0, La/a/a/d/i$h;->b:J

    sub-long/2addr v3, v7

    const-wide/16 v7, 0x4e20

    cmp-long v1, v3, v7

    if-lez v1, :cond_2

    const/4 v1, 0x2

    new-array v1, v1, [F

    iget-wide v7, v0, La/a/a/d/i$h;->l:D

    iget-wide v9, v0, La/a/a/d/i$h;->k:D

    move-wide/from16 v11, p3

    move-wide/from16 v13, p1

    move-object v15, v1

    invoke-static/range {v7 .. v15}, Landroid/location/Location;->distanceBetween(DDDD[F)V

    aget v0, v1, v6

    const/high16 v1, 0x41f00000    # 30.0f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    return v2

    :cond_2
    return v6
.end method

.method public final a(Lcom/baidu/location/c;DLjava/lang/String;)Z
    .locals 9

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, La/a/a/d/i$h;->f:J

    iput-wide p2, p0, La/a/a/d/i$h;->a:D

    invoke-virtual {p1}, Lcom/baidu/location/c;->t()D

    move-result-wide p2

    iput-wide p2, p0, La/a/a/d/i$h;->k:D

    invoke-virtual {p1}, Lcom/baidu/location/c;->q()D

    move-result-wide p2

    iput-wide p2, p0, La/a/a/d/i$h;->l:D

    const-string p2, "wifi"

    invoke-virtual {p4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    iput-wide v0, p0, La/a/a/d/i$h;->b:J

    :cond_0
    const-string p2, "gps"

    invoke-virtual {p4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {p0}, La/a/a/d/i$h;->b()Z

    move-result p2

    if-eqz p2, :cond_1

    iput-wide v0, p0, La/a/a/d/i$h;->c:J

    :cond_1
    iget-object p2, p0, La/a/a/d/i$h;->s:La/a/a/d/i;

    invoke-virtual {p1}, Lcom/baidu/location/c;->t()D

    move-result-wide p3

    invoke-virtual {p1}, Lcom/baidu/location/c;->q()D

    move-result-wide v2

    invoke-virtual {p2, p3, p4, v2, v3}, La/a/a/d/i;->a(DD)Z

    move-result p1

    invoke-static {p2, p1}, La/a/a/d/i;->c(La/a/a/d/i;Z)Z

    iget-object p1, p0, La/a/a/d/i$h;->s:La/a/a/d/i;

    invoke-static {p1}, La/a/a/d/i;->s(La/a/a/d/i;)Z

    move-result p1

    const/4 p2, 0x1

    if-nez p1, :cond_2

    iget-object p1, p0, La/a/a/d/i$h;->s:La/a/a/d/i;

    invoke-static {p1}, La/a/a/d/i;->r(La/a/a/d/i;)I

    move-result p1

    if-ne p1, p2, :cond_3

    :cond_2
    iput-wide v0, p0, La/a/a/d/i$h;->d:J

    :cond_3
    iget-wide p3, p0, La/a/a/d/i$h;->p:J

    const-wide/16 v2, 0x0

    cmp-long p1, p3, v2

    const-wide/16 v4, 0x2710

    const-wide/16 v6, 0x7530

    const/4 v8, 0x0

    if-eqz p1, :cond_4

    sub-long p3, v0, p3

    cmp-long p1, p3, v6

    if-lez p1, :cond_4

    iget-wide p3, p0, La/a/a/d/i$h;->g:J

    sub-long p3, v0, p3

    cmp-long p1, p3, v4

    if-gez p1, :cond_4

    iget-wide p3, p0, La/a/a/d/i$h;->h:J

    sub-long p3, v0, p3

    cmp-long p1, p3, v4

    if-gez p1, :cond_4

    return v8

    :cond_4
    iget p1, p0, La/a/a/d/i$h;->q:I

    const/16 p3, 0xa

    if-le p1, p3, :cond_5

    iget-wide p3, p0, La/a/a/d/i$h;->b:J

    sub-long p3, v0, p3

    cmp-long p1, p3, v6

    if-lez p1, :cond_5

    return v8

    :cond_5
    iget-wide p3, p0, La/a/a/d/i$h;->d:J

    sub-long p3, v0, p3

    cmp-long p1, p3, v4

    if-lez p1, :cond_6

    iget-wide p3, p0, La/a/a/d/i$h;->b:J

    sub-long p3, v0, p3

    cmp-long p1, p3, v6

    if-lez p1, :cond_6

    return v8

    :cond_6
    iget-wide p0, p0, La/a/a/d/i$h;->c:J

    cmp-long p3, p0, v2

    if-eqz p3, :cond_7

    sub-long/2addr v0, p0

    const-wide/32 p0, 0xea60

    cmp-long p0, v0, p0

    if-lez p0, :cond_7

    return v8

    :cond_7
    return p2
.end method

.method public final b()Z
    .locals 7

    iget v0, p0, La/a/a/d/i$h;->r:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    return v2

    :cond_0
    invoke-virtual {p0}, La/a/a/d/i$h;->c()Z

    move-result v0

    if-nez v0, :cond_1

    return v2

    :cond_1
    iget-wide v3, p0, La/a/a/d/i$h;->a:D

    const-wide/high16 v5, 0x4039000000000000L    # 25.0

    cmpl-double v0, v3, v5

    if-lez v0, :cond_2

    return v2

    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-wide v5, p0, La/a/a/d/i$h;->f:J

    sub-long/2addr v3, v5

    const-wide/16 v5, 0x7530

    cmp-long v0, v3, v5

    if-lez v0, :cond_3

    return v2

    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, p0, La/a/a/d/i$h;->c:J

    return v1
.end method

.method public final c()Z
    .locals 10

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, La/a/a/d/i$h;->e:J

    sub-long v2, v0, v2

    const-wide/16 v4, 0x2710

    cmp-long v2, v2, v4

    const/4 v3, 0x0

    const-wide/16 v6, 0x7530

    if-gez v2, :cond_0

    iget-wide v8, p0, La/a/a/d/i$h;->b:J

    sub-long v8, v0, v8

    cmp-long v2, v8, v6

    if-lez v2, :cond_0

    return v3

    :cond_0
    iget-wide v8, p0, La/a/a/d/i$h;->h:J

    sub-long v8, v0, v8

    cmp-long v2, v8, v4

    if-gez v2, :cond_1

    iget-wide v4, p0, La/a/a/d/i$h;->g:J

    const-wide/16 v8, 0x0

    cmp-long v2, v4, v8

    if-eqz v2, :cond_1

    sub-long v4, v0, v4

    const-wide/16 v8, 0x3e80

    cmp-long v2, v4, v8

    if-lez v2, :cond_1

    iget-wide v4, p0, La/a/a/d/i$h;->b:J

    sub-long/2addr v0, v4

    cmp-long p0, v0, v6

    if-lez p0, :cond_1

    return v3

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public final d()V
    .locals 4

    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    iput-wide v0, p0, La/a/a/d/i$h;->a:D

    const-wide/16 v0, 0x0

    iput-wide v0, p0, La/a/a/d/i$h;->b:J

    iput-wide v0, p0, La/a/a/d/i$h;->c:J

    iput-wide v0, p0, La/a/a/d/i$h;->d:J

    iput-wide v0, p0, La/a/a/d/i$h;->e:J

    iput-wide v0, p0, La/a/a/d/i$h;->f:J

    iput-wide v0, p0, La/a/a/d/i$h;->g:J

    iput-wide v0, p0, La/a/a/d/i$h;->h:J

    const-wide/16 v2, 0x0

    iput-wide v2, p0, La/a/a/d/i$h;->i:D

    iput-wide v2, p0, La/a/a/d/i$h;->j:D

    const/4 v2, 0x0

    iput v2, p0, La/a/a/d/i$h;->m:I

    iput v2, p0, La/a/a/d/i$h;->n:I

    const/4 v3, 0x0

    iput-object v3, p0, La/a/a/d/i$h;->o:La/a/a/g/k;

    iput-wide v0, p0, La/a/a/d/i$h;->p:J

    iput v2, p0, La/a/a/d/i$h;->q:I

    iput v2, p0, La/a/a/d/i$h;->r:I

    return-void
.end method

.method public final e()V
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v2

    invoke-virtual {v2}, La/a/a/g/f;->j()La/a/a/g/k;

    move-result-object v2

    iget-object v3, v2, La/a/a/g/k;->a:Ljava/util/List;

    if-nez v3, :cond_0

    return-void

    :cond_0
    iget-object v3, p0, La/a/a/d/i$h;->o:La/a/a/g/k;

    if-eqz v3, :cond_1

    invoke-virtual {v2, v3}, La/a/a/g/k;->a(La/a/a/g/k;)Z

    move-result v3

    if-nez v3, :cond_2

    :cond_1
    iput-wide v0, p0, La/a/a/d/i$h;->p:J

    iput-object v2, p0, La/a/a/d/i$h;->o:La/a/a/g/k;

    :cond_2
    return-void
.end method
