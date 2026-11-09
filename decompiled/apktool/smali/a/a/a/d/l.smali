.class public La/a/a/d/l;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/a/a/d/l$c;,
        La/a/a/d/l$b;
    }
.end annotation


# instance fields
.field public a:La/a/a/d/l$b;

.field public b:J

.field public c:Lcom/baidu/location/c;

.field public d:La/a/a/d/l$c;

.field public e:Lcom/baidu/location/c;

.field public f:Z

.field public g:Landroid/os/Handler;

.field public h:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x1c2

    iput-wide v0, p0, La/a/a/d/l;->b:J

    const/4 v0, 0x0

    iput-object v0, p0, La/a/a/d/l;->d:La/a/a/d/l$c;

    new-instance v1, La/a/a/d/l$c;

    invoke-direct {v1, p0}, La/a/a/d/l$c;-><init>(La/a/a/d/l;)V

    new-instance v1, La/a/a/d/l$c;

    invoke-direct {v1, p0}, La/a/a/d/l$c;-><init>(La/a/a/d/l;)V

    new-instance v1, La/a/a/d/l$c;

    invoke-direct {v1, p0}, La/a/a/d/l$c;-><init>(La/a/a/d/l;)V

    iput-object v0, p0, La/a/a/d/l;->e:Lcom/baidu/location/c;

    const/4 v0, 0x0

    iput-boolean v0, p0, La/a/a/d/l;->f:Z

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, La/a/a/d/l;->g:Landroid/os/Handler;

    new-instance v0, La/a/a/d/l$a;

    invoke-direct {v0, p0}, La/a/a/d/l$a;-><init>(La/a/a/d/l;)V

    iput-object v0, p0, La/a/a/d/l;->h:Ljava/lang/Runnable;

    return-void
.end method

.method public static synthetic a(La/a/a/d/l;)La/a/a/d/l$b;
    .locals 0

    iget-object p0, p0, La/a/a/d/l;->a:La/a/a/d/l$b;

    return-object p0
.end method

.method public static synthetic b(La/a/a/d/l;)J
    .locals 2

    iget-wide v0, p0, La/a/a/d/l;->b:J

    return-wide v0
.end method

.method public static synthetic c(La/a/a/d/l;)Lcom/baidu/location/c;
    .locals 0

    iget-object p0, p0, La/a/a/d/l;->c:Lcom/baidu/location/c;

    return-object p0
.end method

.method public static synthetic d(La/a/a/d/l;)Ljava/lang/Runnable;
    .locals 0

    iget-object p0, p0, La/a/a/d/l;->h:Ljava/lang/Runnable;

    return-object p0
.end method

.method public static synthetic e(La/a/a/d/l;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, La/a/a/d/l;->g:Landroid/os/Handler;

    return-object p0
.end method

.method public static synthetic f(La/a/a/d/l;)Lcom/baidu/location/c;
    .locals 0

    iget-object p0, p0, La/a/a/d/l;->e:Lcom/baidu/location/c;

    return-object p0
.end method


# virtual methods
.method public a(J)V
    .locals 0

    iput-wide p1, p0, La/a/a/d/l;->b:J

    return-void
.end method

.method public declared-synchronized a(Lcom/baidu/location/c;)V
    .locals 19

    move-object/from16 v7, p0

    move-object/from16 v0, p1

    monitor-enter p0

    :try_start_0
    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/c;->q()D

    move-result-wide v8

    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/c;->t()D

    move-result-wide v10

    iput-object v0, v7, La/a/a/d/l;->c:Lcom/baidu/location/c;

    new-instance v1, La/a/a/d/l$c;

    move-object/from16 v2, p0

    move-wide v3, v8

    move-wide v5, v10

    invoke-direct/range {v1 .. v6}, La/a/a/d/l$c;-><init>(La/a/a/d/l;DD)V

    iget-object v1, v7, La/a/a/d/l;->d:La/a/a/d/l$c;

    if-nez v1, :cond_0

    new-instance v12, La/a/a/d/l$c;

    move-object v1, v12

    move-object/from16 v2, p0

    move-wide v3, v8

    move-wide v5, v10

    invoke-direct/range {v1 .. v6}, La/a/a/d/l$c;-><init>(La/a/a/d/l;DD)V

    iput-object v12, v7, La/a/a/d/l;->d:La/a/a/d/l$c;

    :cond_0
    iget-object v1, v7, La/a/a/d/l;->e:Lcom/baidu/location/c;

    if-nez v1, :cond_1

    new-instance v1, Lcom/baidu/location/c;

    invoke-direct {v1, v0}, Lcom/baidu/location/c;-><init>(Lcom/baidu/location/c;)V

    iput-object v1, v7, La/a/a/d/l;->e:Lcom/baidu/location/c;

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lcom/baidu/location/c;->q()D

    move-result-wide v1

    iget-object v3, v7, La/a/a/d/l;->e:Lcom/baidu/location/c;

    invoke-virtual {v3}, Lcom/baidu/location/c;->t()D

    move-result-wide v3

    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/c;->q()D

    move-result-wide v5

    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/c;->t()D

    move-result-wide v14

    const/4 v0, 0x2

    new-array v0, v0, [F

    move-wide v8, v1

    move-wide v10, v3

    move-wide v12, v5

    move-wide/from16 v17, v14

    move-object/from16 v16, v0

    invoke-static/range {v8 .. v16}, Landroid/location/Location;->distanceBetween(DDDD[F)V

    const/4 v8, 0x0

    aget v0, v0, v8

    const/high16 v8, 0x41200000    # 10.0f

    cmpl-float v0, v0, v8

    if-lez v0, :cond_2

    iget-object v0, v7, La/a/a/d/l;->e:Lcom/baidu/location/c;

    invoke-virtual {v0, v5, v6}, Lcom/baidu/location/c;->c(D)V

    iget-object v0, v7, La/a/a/d/l;->e:Lcom/baidu/location/c;

    move-wide/from16 v8, v17

    invoke-virtual {v0, v8, v9}, Lcom/baidu/location/c;->d(D)V

    goto :goto_0

    :cond_2
    move-wide/from16 v8, v17

    iget-object v0, v7, La/a/a/d/l;->e:Lcom/baidu/location/c;

    add-double/2addr v1, v5

    const-wide/high16 v5, 0x4000000000000000L    # 2.0

    div-double/2addr v1, v5

    invoke-virtual {v0, v1, v2}, Lcom/baidu/location/c;->c(D)V

    iget-object v0, v7, La/a/a/d/l;->e:Lcom/baidu/location/c;

    add-double/2addr v3, v8

    div-double/2addr v3, v5

    invoke-virtual {v0, v3, v4}, Lcom/baidu/location/c;->d(D)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public a()Z
    .locals 0

    iget-boolean p0, p0, La/a/a/d/l;->f:Z

    return p0
.end method

.method public b()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, La/a/a/d/l;->d:La/a/a/d/l$c;

    new-instance v0, La/a/a/d/l$c;

    invoke-direct {v0, p0}, La/a/a/d/l$c;-><init>(La/a/a/d/l;)V

    new-instance v0, La/a/a/d/l$c;

    invoke-direct {v0, p0}, La/a/a/d/l$c;-><init>(La/a/a/d/l;)V

    new-instance v0, La/a/a/d/l$c;

    invoke-direct {v0, p0}, La/a/a/d/l$c;-><init>(La/a/a/d/l;)V

    return-void
.end method

.method public c()V
    .locals 2

    iget-boolean v0, p0, La/a/a/d/l;->f:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, La/a/a/d/l;->f:Z

    iget-object v0, p0, La/a/a/d/l;->g:Landroid/os/Handler;

    iget-object v1, p0, La/a/a/d/l;->h:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    invoke-virtual {p0}, La/a/a/d/l;->b()V

    return-void
.end method
