.class public La/a/a/d/i$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La/a/a/d/k$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/a/a/d/i;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:La/a/a/d/i;


# direct methods
.method public constructor <init>(La/a/a/d/i;)V
    .locals 0

    iput-object p1, p0, La/a/a/d/i$b;->a:La/a/a/d/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public declared-synchronized a(DDDJLjava/lang/String;)V
    .locals 15

    move-object v1, p0

    monitor-enter p0

    :try_start_0
    iget-object v0, v1, La/a/a/d/i$b;->a:La/a/a/d/i;

    invoke-static {v0}, La/a/a/d/i;->d(La/a/a/d/i;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, v1, La/a/a/d/i$b;->a:La/a/a/d/i;

    const-wide v2, 0x3fd999999999999aL    # 0.4

    invoke-static {v0, v2, v3}, La/a/a/d/i;->c(La/a/a/d/i;D)D

    iget-object v0, v1, La/a/a/d/i$b;->a:La/a/a/d/i;

    invoke-static {v0}, La/a/a/d/i;->p(La/a/a/d/i;)La/a/a/d/i$h;

    move-result-object v2

    move-wide/from16 v3, p1

    move-wide/from16 v5, p3

    move-wide/from16 v7, p5

    move-wide/from16 v9, p7

    invoke-static/range {v2 .. v10}, La/a/a/d/i$h;->a(La/a/a/d/i$h;DDDJ)V

    iget-object v0, v1, La/a/a/d/i$b;->a:La/a/a/d/i;

    invoke-static {v0}, La/a/a/d/i;->e(La/a/a/d/i;)Ljava/lang/String;

    move-result-object v2

    move-wide/from16 v3, p1

    move-wide/from16 v5, p3

    move-wide/from16 v7, p5

    move-object/from16 v9, p9

    invoke-static/range {v2 .. v9}, La/a/a/d/m/b/a;->a(Ljava/lang/String;DDDLjava/lang/String;)[D

    move-result-object v0

    if-nez v0, :cond_1

    goto/16 :goto_2

    :cond_1
    const/4 v2, 0x0

    aget-wide v3, v0, v2

    const-wide/high16 v5, -0x4010000000000000L    # -1.0

    cmpl-double v3, v3, v5

    if-nez v3, :cond_2

    goto/16 :goto_2

    :cond_2
    aget-wide v2, v0, v2

    const-wide/16 v4, 0x0

    cmpl-double v2, v2, v4

    if-nez v2, :cond_6

    iget-object v2, v1, La/a/a/d/i$b;->a:La/a/a/d/i;

    const/4 v3, 0x2

    aget-wide v4, v0, v3

    invoke-static {v2, v4, v5}, La/a/a/d/i;->a(La/a/a/d/i;D)D

    iget-object v2, v1, La/a/a/d/i$b;->a:La/a/a/d/i;

    const/4 v4, 0x1

    aget-wide v5, v0, v4

    invoke-static {v2, v5, v6}, La/a/a/d/i;->b(La/a/a/d/i;D)D

    iget-object v2, v1, La/a/a/d/i$b;->a:La/a/a/d/i;

    invoke-static {v2}, La/a/a/d/i;->h(La/a/a/d/i;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/16 v5, 0x32

    if-le v2, v5, :cond_3

    iget-object v2, v1, La/a/a/d/i$b;->a:La/a/a/d/i;

    invoke-static {v2}, La/a/a/d/i;->h(La/a/a/d/i;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->clear()V

    :cond_3
    iget-object v2, v1, La/a/a/d/i$b;->a:La/a/a/d/i;

    invoke-static {v2}, La/a/a/d/i;->h(La/a/a/d/i;)Ljava/util/List;

    move-result-object v2

    new-instance v14, La/a/a/d/i$l;

    iget-object v6, v1, La/a/a/d/i$b;->a:La/a/a/d/i;

    invoke-static {}, La/a/a/d/k;->e()La/a/a/d/k;

    move-result-object v5

    invoke-virtual {v5}, La/a/a/d/k;->d()I

    move-result v7

    move-object v5, v14

    move-wide/from16 v8, p1

    move-wide/from16 v10, p5

    move-wide/from16 v12, p3

    invoke-direct/range {v5 .. v13}, La/a/a/d/i$l;-><init>(La/a/a/d/i;IDDD)V

    invoke-interface {v2, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v2, v1, La/a/a/d/i$b;->a:La/a/a/d/i;

    invoke-static {v2}, La/a/a/d/i;->j(La/a/a/d/i;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    new-instance v2, Lcom/baidu/location/c;

    invoke-direct {v2}, Lcom/baidu/location/c;-><init>()V

    const/16 v5, 0xa1

    invoke-virtual {v2, v5}, Lcom/baidu/location/c;->h(I)V

    aget-wide v5, v0, v3

    invoke-virtual {v2, v5, v6}, Lcom/baidu/location/c;->c(D)V

    aget-wide v5, v0, v4

    invoke-virtual {v2, v5, v6}, Lcom/baidu/location/c;->d(D)V

    move-wide/from16 v5, p5

    double-to-float v3, v5

    invoke-virtual {v2, v3}, Lcom/baidu/location/c;->a(F)V

    new-instance v3, Ljava/util/Date;

    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    iget-object v5, v1, La/a/a/d/i$b;->a:La/a/a/d/i;

    iget-object v5, v5, La/a/a/d/i;->N:Ljava/text/SimpleDateFormat;

    invoke-virtual {v5, v3}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/baidu/location/c;->n(Ljava/lang/String;)V

    iget-object v3, v1, La/a/a/d/i$b;->a:La/a/a/d/i;

    invoke-static {v3}, La/a/a/d/i;->e(La/a/a/d/i;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/baidu/location/c;->f(Ljava/lang/String;)V

    iget-object v3, v1, La/a/a/d/i$b;->a:La/a/a/d/i;

    invoke-static {v3}, La/a/a/d/i;->k(La/a/a/d/i;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/baidu/location/c;->c(Ljava/lang/String;)V

    iget-object v3, v1, La/a/a/d/i$b;->a:La/a/a/d/i;

    invoke-static {v3}, La/a/a/d/i;->l(La/a/a/d/i;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/baidu/location/c;->d(Ljava/lang/String;)V

    iget-object v3, v1, La/a/a/d/i$b;->a:La/a/a/d/i;

    invoke-static {v3}, La/a/a/d/i;->m(La/a/a/d/i;)I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/baidu/location/c;->l(I)V

    invoke-virtual {v2, v4}, Lcom/baidu/location/c;->a(Z)V

    iget-object v3, v1, La/a/a/d/i$b;->a:La/a/a/d/i;

    invoke-static {v3}, La/a/a/d/i;->n(La/a/a/d/i;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/high16 v3, 0x41000000    # 8.0f

    invoke-virtual {v2, v3}, Lcom/baidu/location/c;->b(F)V

    goto :goto_0

    :cond_4
    const/high16 v3, 0x41700000    # 15.0f

    invoke-virtual {v2, v3}, Lcom/baidu/location/c;->b(F)V

    :goto_0
    const-string v3, "res"

    invoke-virtual {v2, v3, v0}, Lcom/baidu/location/c;->a(Ljava/lang/String;[D)V

    const/4 v3, 0x5

    aget-wide v4, v0, v3

    double-to-float v4, v4

    invoke-virtual {v2, v4}, Lcom/baidu/location/c;->b(F)V

    const/4 v4, 0x6

    aget-wide v4, v0, v4

    double-to-float v4, v4

    invoke-virtual {v2, v4}, Lcom/baidu/location/c;->a(F)V

    const/16 v4, 0x8

    aget-wide v4, v0, v4

    double-to-float v4, v4

    invoke-virtual {v2, v4}, Lcom/baidu/location/c;->c(F)V

    const-string v4, "dr"

    invoke-virtual {v2, v4}, Lcom/baidu/location/c;->l(Ljava/lang/String;)V

    new-instance v4, Lcom/baidu/location/c;

    invoke-direct {v4, v2}, Lcom/baidu/location/c;-><init>(Lcom/baidu/location/c;)V

    const-string v5, "dr2"

    invoke-virtual {v4, v5}, Lcom/baidu/location/c;->l(Ljava/lang/String;)V

    iget-object v5, v1, La/a/a/d/i$b;->a:La/a/a/d/i;

    invoke-static {v5}, La/a/a/d/i;->o(La/a/a/d/i;)La/a/a/d/l;

    move-result-object v5

    if-eqz v5, :cond_5

    iget-object v5, v1, La/a/a/d/i$b;->a:La/a/a/d/i;

    invoke-static {v5}, La/a/a/d/i;->o(La/a/a/d/i;)La/a/a/d/l;

    move-result-object v5

    invoke-virtual {v5}, La/a/a/d/l;->a()Z

    move-result v5

    if-eqz v5, :cond_5

    iget-object v5, v1, La/a/a/d/i$b;->a:La/a/a/d/i;

    invoke-static {v5}, La/a/a/d/i;->o(La/a/a/d/i;)La/a/a/d/l;

    move-result-object v5

    invoke-virtual {v5, v4}, La/a/a/d/l;->a(Lcom/baidu/location/c;)V

    goto :goto_1

    :cond_5
    iget-object v5, v1, La/a/a/d/i$b;->a:La/a/a/d/i;

    const/16 v6, 0x15

    invoke-static {v5, v4, v6}, La/a/a/d/i;->a(La/a/a/d/i;Lcom/baidu/location/c;I)V

    :goto_1
    iget-object v4, v1, La/a/a/d/i$b;->a:La/a/a/d/i;

    invoke-static {v4}, La/a/a/d/i;->p(La/a/a/d/i;)La/a/a/d/i$h;

    move-result-object v4

    aget-wide v5, v0, v3

    const-string v0, "dr"

    invoke-static {v4, v2, v5, v6, v0}, La/a/a/d/i$h;->a(La/a/a/d/i$h;Lcom/baidu/location/c;DLjava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, v1, La/a/a/d/i$b;->a:La/a/a/d/i;

    invoke-virtual {v0}, La/a/a/d/i;->l()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catch_0
    :cond_6
    :goto_2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
