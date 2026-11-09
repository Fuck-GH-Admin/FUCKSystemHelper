.class public La/a/a/d/i$m;
.super La/a/a/i/g;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/d/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "m"
.end annotation


# instance fields
.field public i:Z

.field public j:Z

.field public k:Ljava/lang/String;

.field public l:Ljava/lang/String;

.field public m:J

.field public n:J

.field public final synthetic o:La/a/a/d/i;


# direct methods
.method public constructor <init>(La/a/a/d/i;)V
    .locals 2

    iput-object p1, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    invoke-direct {p0}, La/a/a/i/g;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, La/a/a/d/i$m;->i:Z

    iput-boolean p1, p0, La/a/a/d/i$m;->j:Z

    const/4 p1, 0x0

    iput-object p1, p0, La/a/a/d/i$m;->k:Ljava/lang/String;

    iput-object p1, p0, La/a/a/d/i$m;->l:Ljava/lang/String;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, La/a/a/d/i$m;->m:J

    iput-wide v0, p0, La/a/a/d/i$m;->n:J

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, La/a/a/i/g;->d:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    invoke-static {v0}, La/a/a/d/i;->k(La/a/a/d/i;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    invoke-static {v0}, La/a/a/d/i;->v(La/a/a/d/i;)La/a/a/d/j;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    invoke-static {v0}, La/a/a/d/i;->k(La/a/a/d/i;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    invoke-static {v1}, La/a/a/d/i;->v(La/a/a/d/i;)La/a/a/d/j;

    move-result-object v1

    invoke-virtual {v1}, La/a/a/d/j;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&nd_idf=1&indoor_polygon=1"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, La/a/a/d/i$m;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, La/a/a/d/i$m;->k:Ljava/lang/String;

    :cond_1
    const/4 v0, 0x1

    iput v0, p0, La/a/a/i/g;->b:I

    invoke-static {}, La/a/a/b/n;->b()La/a/a/b/n;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/b/n;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, La/a/a/d/i$m;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&enc=2"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, La/a/a/d/i$m;->k:Ljava/lang/String;

    :cond_2
    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/g/f;->k()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {v0}, Lcom/baidu/location/Jni;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, La/a/a/i/g;->f:Ljava/lang/String;

    :cond_3
    iget-object v0, p0, La/a/a/d/i$m;->k:Ljava/lang/String;

    invoke-static {v0}, Lcom/baidu/location/Jni;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    iput-object v1, p0, La/a/a/d/i$m;->k:Ljava/lang/String;

    iget-object v1, p0, La/a/a/i/g;->d:Ljava/util/Map;

    const-string v2, "bloc"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, La/a/a/d/i$m;->n:J

    return-void
.end method

.method public a(Z)V
    .locals 7

    const-string v0, "enc"

    const/4 v1, 0x0

    if-eqz p1, :cond_a

    iget-object p1, p0, La/a/a/i/g;->c:Ljava/lang/String;

    if-eqz p1, :cond_a

    :try_start_0
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {}, La/a/a/b/n;->b()La/a/a/b/n;

    move-result-object v2

    invoke-virtual {v2}, La/a/a/b/n;->a()Z

    move-result v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz v2, :cond_0

    :try_start_1
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, La/a/a/b/n;->b()La/a/a/b/n;

    move-result-object v2

    invoke-virtual {v2, v0}, La/a/a/b/n;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    iget-object v0, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    invoke-static {v0}, La/a/a/d/i;->d(La/a/a/d/i;)Z

    move-result v0

    if-nez v0, :cond_1

    iput-boolean v1, p0, La/a/a/d/i$m;->i:Z

    return-void

    :cond_1
    new-instance v0, Lcom/baidu/location/c;

    invoke-direct {v0, p1}, Lcom/baidu/location/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/baidu/location/c;->r()I

    move-result p1

    const/16 v2, 0xa1

    if-ne p1, v2, :cond_2

    invoke-virtual {v0}, Lcom/baidu/location/c;->e()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object p1, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    new-instance v2, Lcom/baidu/location/c;

    invoke-direct {v2, v0}, Lcom/baidu/location/c;-><init>(Lcom/baidu/location/c;)V

    invoke-static {p1, v2}, La/a/a/d/i;->b(La/a/a/d/i;Lcom/baidu/location/c;)Lcom/baidu/location/c;

    :cond_2
    invoke-virtual {v0}, Lcom/baidu/location/c;->o()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v2, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    invoke-static {v2}, La/a/a/d/i;->w(La/a/a/d/i;)La/a/a/d/a;

    move-result-object v2

    invoke-virtual {v2, p1}, La/a/a/d/a;->c(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_3

    iget-object v2, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    invoke-static {v2}, La/a/a/d/i;->w(La/a/a/d/i;)La/a/a/d/a;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, p1, v3}, La/a/a/d/a;->a(Ljava/lang/String;La/a/a/d/a$b;)Z

    :cond_3
    iget-object p1, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    invoke-static {p1}, La/a/a/d/i;->x(La/a/a/d/i;)La/a/a/d/g;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object p1, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    invoke-static {p1}, La/a/a/d/i;->x(La/a/a/d/i;)La/a/a/d/g;

    move-result-object p1

    new-instance v2, La/a/a/d/i$m$a;

    invoke-direct {v2, p0}, La/a/a/d/i$m$a;-><init>(La/a/a/d/i$m;)V

    invoke-virtual {p1, v2}, La/a/a/d/g;->a(La/a/a/d/g$c;)Z

    :cond_4
    invoke-static {}, La/a/a/b/t;->e()La/a/a/b/t;

    move-result-object p1

    const/4 v2, 0x1

    invoke-virtual {p1, v2}, La/a/a/b/t;->a(Z)V

    invoke-virtual {v0}, Lcom/baidu/location/c;->f()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_5

    iget-object p1, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    invoke-virtual {v0}, Lcom/baidu/location/c;->f()Ljava/lang/String;

    move-result-object v3

    invoke-static {p1, v3}, La/a/a/d/i;->b(La/a/a/d/i;Ljava/lang/String;)Ljava/lang/String;

    :cond_5
    invoke-virtual {v0}, Lcom/baidu/location/c;->k()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_9

    iget-object p1, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {p1, v3, v4}, La/a/a/d/i;->b(La/a/a/d/i;J)J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-wide v5, p0, La/a/a/d/i$m;->n:J

    sub-long/2addr v3, v5

    long-to-int p1, v3

    const/16 v3, 0x2710

    if-le p1, v3, :cond_6

    iget-object p1, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    invoke-static {p1, v1}, La/a/a/d/i;->b(La/a/a/d/i;I)I

    goto :goto_1

    :cond_6
    const/16 v3, 0xbb8

    if-ge p1, v3, :cond_7

    iget-object p1, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    const/4 v3, 0x2

    invoke-static {p1, v3}, La/a/a/d/i;->b(La/a/a/d/i;I)I

    goto :goto_1

    :cond_7
    iget-object p1, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    invoke-static {p1, v2}, La/a/a/d/i;->b(La/a/a/d/i;I)I

    :goto_1
    invoke-virtual {v0}, Lcom/baidu/location/c;->k()Ljava/lang/String;

    move-result-object p1

    const-string v3, "-a"

    invoke-virtual {p1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_8

    iget-object p1, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    invoke-static {p1, v2}, La/a/a/d/i;->e(La/a/a/d/i;Z)Z

    invoke-virtual {v0}, Lcom/baidu/location/c;->k()Ljava/lang/String;

    move-result-object p1

    const-string v2, "-"

    invoke-virtual {p1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    aget-object p1, p1, v1

    invoke-virtual {v0, p1}, Lcom/baidu/location/c;->f(Ljava/lang/String;)V

    goto :goto_2

    :cond_8
    iget-object p1, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    invoke-static {p1, v1}, La/a/a/d/i;->e(La/a/a/d/i;Z)Z

    :goto_2
    iget-object p1, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    invoke-static {p1}, La/a/a/d/i;->z(La/a/a/d/i;)La/a/a/d/f;

    move-result-object p1

    invoke-virtual {v0}, Lcom/baidu/location/c;->k()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, La/a/a/d/f;->add(Ljava/lang/Object;)Z

    :cond_9
    iget-object p1, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    iget-object p1, p1, La/a/a/d/i;->f:La/a/a/d/i$g;

    const/16 v2, 0x15

    invoke-virtual {p1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object p1

    iput-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_3

    :cond_a
    iget-object p1, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    invoke-static {p1}, La/a/a/d/i;->B(La/a/a/d/i;)I

    iget-object p1, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    invoke-static {p1, v1}, La/a/a/d/i;->b(La/a/a/d/i;I)I

    iput-boolean v1, p0, La/a/a/d/i$m;->i:Z

    iget-object p1, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    invoke-static {p1}, La/a/a/d/i;->A(La/a/a/d/i;)I

    move-result p1

    const/16 v0, 0x28

    if-le p1, v0, :cond_c

    iget-object p1, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    invoke-virtual {p1}, La/a/a/d/i;->l()V

    :catch_1
    :goto_3
    iget-object p1, p0, La/a/a/i/g;->d:Ljava/util/Map;

    if-eqz p1, :cond_b

    invoke-interface {p1}, Ljava/util/Map;->clear()V

    :cond_b
    iput-boolean v1, p0, La/a/a/d/i$m;->i:Z

    :cond_c
    return-void
.end method

.method public declared-synchronized b()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, La/a/a/d/i$m;->i:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-boolean v0, p0, La/a/a/d/i$m;->j:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, La/a/a/d/i$m;->j:Z

    invoke-virtual {p0}, La/a/a/d/i$m;->c()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public c()V
    .locals 10

    iget-boolean v0, p0, La/a/a/d/i$m;->i:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iput-boolean v1, p0, La/a/a/d/i$m;->j:Z

    return-void

    :cond_0
    iget-object v0, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    invoke-static {v0}, La/a/a/d/i;->r(La/a/a/d/i;)I

    move-result v0

    if-ne v0, v1, :cond_1

    iget-object v0, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    invoke-static {v0}, La/a/a/d/i;->s(La/a/a/d/i;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, La/a/a/d/i$m;->m:J

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x7530

    cmp-long v0, v2, v4

    if-gez v0, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-object v0, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    invoke-static {v0}, La/a/a/d/i;->p(La/a/a/d/i;)La/a/a/d/i$h;

    move-result-object v0

    invoke-static {v0}, La/a/a/d/i$h;->e(La/a/a/d/i$h;)J

    move-result-wide v6

    sub-long/2addr v2, v6

    cmp-long v0, v2, v4

    if-lez v0, :cond_1

    return-void

    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, La/a/a/d/i$m;->n:J

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x3e8

    cmp-long v0, v2, v4

    if-gez v0, :cond_2

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-lez v0, :cond_2

    return-void

    :cond_2
    new-instance v0, Ljava/lang/StringBuffer;

    const/16 v2, 0x400

    invoke-direct {v0, v2}, Ljava/lang/StringBuffer;-><init>(I)V

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v2

    invoke-virtual {v2}, La/a/a/g/f;->a()La/a/a/g/a;

    move-result-object v2

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v3

    invoke-virtual {v3, v2}, La/a/a/g/f;->a(La/a/a/g/a;)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, La/a/a/g/d;->n()La/a/a/g/d;

    move-result-object v3

    invoke-virtual {v3}, La/a/a/g/d;->f()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, La/a/a/g/d;->n()La/a/a/g/d;

    move-result-object v4

    invoke-virtual {v4}, La/a/a/g/d;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v4, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    const-wide/high16 v5, 0x3fe0000000000000L    # 0.5

    invoke-static {v4, v5, v6}, La/a/a/d/i;->c(La/a/a/d/i;D)D

    iget-object v4, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    invoke-static {v4}, La/a/a/d/i;->x(La/a/a/d/i;)La/a/a/d/g;

    move-result-object v4

    const/4 v5, 0x0

    if-eqz v4, :cond_3

    iget-object v4, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    invoke-static {v4}, La/a/a/d/i;->x(La/a/a/d/i;)La/a/a/d/g;

    move-result-object v4

    invoke-virtual {v4}, La/a/a/d/g;->d()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_3

    iget-object v4, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    invoke-static {v4}, La/a/a/d/i;->x(La/a/a/d/i;)La/a/a/d/g;

    move-result-object v4

    invoke-virtual {v4}, La/a/a/d/g;->g()Z

    move-result v4

    if-eqz v4, :cond_3

    const-string v4, "&bleand="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v4, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    invoke-static {v4}, La/a/a/d/i;->x(La/a/a/d/i;)La/a/a/d/g;

    move-result-object v4

    invoke-virtual {v4}, La/a/a/d/g;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v4, "&bleand_et="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v4, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    invoke-static {v4}, La/a/a/d/i;->x(La/a/a/d/i;)La/a/a/d/g;

    move-result-object v4

    invoke-virtual {v4}, La/a/a/d/g;->e()J

    move-result-wide v6

    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    move v4, v1

    goto :goto_0

    :cond_3
    move v4, v5

    :goto_0
    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v6

    invoke-virtual {v6}, La/a/a/g/f;->j()La/a/a/g/k;

    move-result-object v6

    iget-object v7, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    invoke-static {v7, v6}, La/a/a/d/i;->a(La/a/a/d/i;La/a/a/g/k;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_4

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v7

    iget-object v8, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    invoke-static {v8}, La/a/a/d/i;->C(La/a/a/d/i;)I

    move-result v8

    sget v9, La/a/a/i/i;->q0:I

    invoke-virtual {v7, v8, v1, v6, v9}, La/a/a/g/f;->a(IZLa/a/a/g/k;I)Ljava/lang/String;

    move-result-object v7

    :cond_4
    if-nez v4, :cond_7

    if-eqz v7, :cond_6

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v4

    const/16 v6, 0xa

    if-ge v4, v6, :cond_5

    goto :goto_1

    :cond_5
    iget-object v4, p0, La/a/a/d/i$m;->l:Ljava/lang/String;

    if-eqz v4, :cond_7

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    :cond_6
    :goto_1
    return-void

    :cond_7
    iput-object v7, p0, La/a/a/d/i$m;->l:Ljava/lang/String;

    iput-boolean v1, p0, La/a/a/d/i$m;->i:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    if-eqz v3, :cond_8

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_8
    const-string v2, "&coor=gcj02"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v2, "&lt=1"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    if-eqz v7, :cond_9

    const-string v2, "null"

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    const-string v2, ""

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    invoke-virtual {v0, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_9
    invoke-static {}, La/a/a/d/k;->e()La/a/a/d/k;

    move-result-object v2

    invoke-virtual {v2}, La/a/a/d/k;->c()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    invoke-static {v3}, La/a/a/d/i;->D(La/a/a/d/i;)I

    move-result v3

    const/4 v4, 0x2

    if-gt v3, v4, :cond_a

    if-eqz v2, :cond_a

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "&idsl="

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_a
    iget-object v2, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    invoke-static {v2}, La/a/a/d/i;->h(La/a/a/d/i;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    iget-object v3, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    invoke-static {v3, v2}, La/a/a/d/i;->c(La/a/a/d/i;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v3, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    invoke-static {v3, v2}, La/a/a/d/i;->d(La/a/a/d/i;I)I

    iget-object v2, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    invoke-static {v2}, La/a/a/d/i;->a(La/a/a/d/i;)I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "&drsi="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    invoke-static {v3}, La/a/a/d/i;->D(La/a/a/d/i;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "&drc="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    invoke-static {v3}, La/a/a/d/i;->i(La/a/a/d/i;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v2, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    invoke-static {v2}, La/a/a/d/i;->g(La/a/a/d/i;)D

    move-result-wide v2

    const-wide/16 v6, 0x0

    cmpl-double v2, v2, v6

    if-eqz v2, :cond_b

    iget-object v2, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    invoke-static {v2}, La/a/a/d/i;->f(La/a/a/d/i;)D

    move-result-wide v2

    cmpl-double v2, v2, v6

    if-eqz v2, :cond_b

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "&lst_idl="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    new-array v6, v4, [Ljava/lang/Object;

    iget-object v7, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    invoke-static {v7}, La/a/a/d/i;->g(La/a/a/d/i;)D

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v7

    aput-object v7, v6, v5

    iget-object v7, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    invoke-static {v7}, La/a/a/d/i;->f(La/a/a/d/i;)D

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v7

    aput-object v7, v6, v1

    const-string v7, "%.5f:%.5f"

    invoke-static {v3, v7, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_b
    iget-object v2, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    invoke-static {v2, v5}, La/a/a/d/i;->a(La/a/a/d/i;I)I

    const-string v2, "&idpfv=1"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "&iflxy="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    invoke-static {v3}, La/a/a/d/i;->c(La/a/a/d/i;)La/a/a/d/i$j;

    move-result-object v3

    invoke-virtual {v3}, La/a/a/d/i$j;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v2, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    invoke-static {v2}, La/a/a/d/i;->c(La/a/a/d/i;)La/a/a/d/i$j;

    move-result-object v2

    invoke-static {v2}, La/a/a/d/i$j;->a(La/a/a/d/i$j;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->clear()V

    iget-object v2, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    invoke-static {v2}, La/a/a/d/i;->b(La/a/a/d/i;)I

    iget-object v2, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    invoke-static {v2}, La/a/a/d/i;->y(La/a/a/d/i;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_c

    iget-object v2, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    invoke-static {v2}, La/a/a/d/i;->y(La/a/a/d/i;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v2, p0, La/a/a/d/i$m;->o:La/a/a/d/i;

    const/4 v3, 0x0

    invoke-static {v2, v3}, La/a/a/d/i;->a(La/a/a/d/i;Ljava/lang/String;)Ljava/lang/String;

    :cond_c
    invoke-static {}, La/a/a/b/c;->h()La/a/a/b/c;

    move-result-object v2

    invoke-virtual {v2}, La/a/a/b/c;->d()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_d

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_d
    invoke-static {}, La/a/a/i/b;->e()La/a/a/i/b;

    move-result-object v2

    invoke-virtual {v2, v1}, La/a/a/i/b;->a(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-static {}, La/a/a/b/f;->c()La/a/a/b/f;

    move-result-object v2

    invoke-virtual {v2}, La/a/a/b/f;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-static {}, Lcom/baidu/location/f;->c()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, La/a/a/i/i;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-static {}, Lcom/baidu/location/f;->c()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, La/a/a/i/i;->c(Landroid/content/Context;)I

    move-result v2

    if-ltz v2, :cond_e

    const-string v3, "&lmd="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    :cond_e
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, La/a/a/d/i$m;->k:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    sget v2, La/a/a/i/i;->F0:I

    if-le v0, v2, :cond_10

    iget-object v0, p0, La/a/a/d/i$m;->k:Ljava/lang/String;

    const-string v2, "&cl_list="

    invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    array-length v2, v0

    if-ne v2, v4, :cond_10

    aget-object v2, v0, v1

    const-string v3, "&"

    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v2

    array-length v3, v2

    if-ne v3, v4, :cond_f

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v0, v0, v5

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "&cl_list=null&"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v0, v2, v1

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_f
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v0, v0, v5

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "&cl_list=null"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_2
    iput-object v0, p0, La/a/a/d/i$m;->k:Ljava/lang/String;

    :cond_10
    invoke-static {}, La/a/a/b/w;->d()La/a/a/b/w;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/b/w;->a()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    if-eqz v0, :cond_11

    sget-object v1, La/a/a/i/d;->b:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, La/a/a/i/g;->a(Ljava/util/concurrent/ExecutorService;Ljava/lang/String;)V

    goto :goto_3

    :cond_11
    sget-object v0, La/a/a/i/d;->b:Ljava/lang/String;

    invoke-virtual {p0, v0}, La/a/a/i/g;->a(Ljava/lang/String;)V

    :goto_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, La/a/a/d/i$m;->m:J

    return-void
.end method
