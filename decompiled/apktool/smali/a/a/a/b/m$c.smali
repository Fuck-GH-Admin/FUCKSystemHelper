.class public La/a/a/b/m$c;
.super La/a/a/i/g;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/b/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;

.field public k:J

.field public l:J

.field public final synthetic m:La/a/a/b/m;


# direct methods
.method public constructor <init>(La/a/a/b/m;)V
    .locals 2

    iput-object p1, p0, La/a/a/b/m$c;->m:La/a/a/b/m;

    invoke-direct {p0}, La/a/a/i/g;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, La/a/a/b/m$c;->i:Ljava/lang/String;

    iput-object p1, p0, La/a/a/b/m$c;->j:Ljava/lang/String;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, La/a/a/b/m$c;->k:J

    iput-wide v0, p0, La/a/a/b/m$c;->l:J

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, La/a/a/i/g;->d:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 6

    sget-boolean v0, La/a/a/i/i;->f:Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    sget-boolean v0, La/a/a/i/i;->h:Z

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, La/a/a/b/m$c;->m:La/a/a/b/m;

    invoke-static {v0}, La/a/a/b/m;->a(La/a/a/b/m;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, La/a/a/b/m$c;->m:La/a/a/b/m;

    invoke-static {v0}, La/a/a/b/m;->b(La/a/a/b/m;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, La/a/a/b/m$c;->j:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    iget-object v5, p0, La/a/a/b/m$c;->m:La/a/a/b/m;

    invoke-static {v5}, La/a/a/b/m;->a(La/a/a/b/m;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v2

    iget-object v5, p0, La/a/a/b/m$c;->m:La/a/a/b/m;

    invoke-static {v5}, La/a/a/b/m;->b(La/a/a/b/m;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v1

    const-string v5, "&ki=%s&sn=%s"

    invoke-static {v3, v5, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, La/a/a/b/m$c;->j:Ljava/lang/String;

    :cond_1
    invoke-static {}, La/a/a/b/n;->b()La/a/a/b/n;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/b/n;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, La/a/a/b/m$c;->j:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "&enc=2"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, La/a/a/b/m$c;->j:Ljava/lang/String;

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
    iget-object v0, p0, La/a/a/b/m$c;->j:Ljava/lang/String;

    invoke-static {v0}, Lcom/baidu/location/Jni;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    iput-object v3, p0, La/a/a/b/m$c;->j:Ljava/lang/String;

    iget-object v3, p0, La/a/a/b/m$c;->i:Ljava/lang/String;

    if-nez v3, :cond_4

    invoke-static {}, La/a/a/b/y;->f()Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, La/a/a/b/m$c;->i:Ljava/lang/String;

    :cond_4
    iget-object v3, p0, La/a/a/i/g;->d:Ljava/util/Map;

    const-string v4, "bloc"

    invoke-interface {v3, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, La/a/a/b/m$c;->i:Ljava/lang/String;

    if-eqz v0, :cond_5

    iget-object v3, p0, La/a/a/i/g;->d:Ljava/util/Map;

    const-string v4, "up"

    invoke-interface {v3, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    sget-object v0, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v1, v2

    const-string v2, "%d"

    invoke-static {v0, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object p0, p0, La/a/a/i/g;->d:Ljava/util/Map;

    const-string v1, "trtm"

    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public a(Ljava/lang/String;J)V
    .locals 2

    iput-object p1, p0, La/a/a/b/m$c;->j:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, La/a/a/b/m$c;->l:J

    iput-wide p2, p0, La/a/a/b/m$c;->k:J

    invoke-static {}, La/a/a/b/w;->d()La/a/a/b/w;

    move-result-object p1

    invoke-virtual {p1}, La/a/a/b/w;->a()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    invoke-static {}, La/a/a/i/i;->l()Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x0

    const/4 p3, 0x0

    invoke-virtual {p0, p1, p2, p3}, La/a/a/i/g;->a(Ljava/util/concurrent/ExecutorService;ZLjava/lang/String;)V

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    sget-object p2, La/a/a/i/d;->b:Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, La/a/a/i/g;->a(Ljava/util/concurrent/ExecutorService;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    sget-object p1, La/a/a/i/d;->b:Ljava/lang/String;

    invoke-virtual {p0, p1}, La/a/a/i/g;->a(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public a(Z)V
    .locals 11

    const-string v0, "content"

    const-string v1, "net_loc_save"

    const-string v2, "enc"

    const-string v3, "HttpStatus error"

    const/16 v4, 0x3f

    if-eqz p1, :cond_9

    iget-object p1, p0, La/a/a/i/g;->c:Ljava/lang/String;

    if-eqz p1, :cond_9

    :try_start_0
    sput-object p1, La/a/a/b/m;->l:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-static {}, La/a/a/b/n;->b()La/a/a/b/n;

    move-result-object v5

    invoke-virtual {v5}, La/a/a/b/n;->a()Z

    move-result v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3

    if-eqz v5, :cond_0

    :try_start_1
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-virtual {v5, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, La/a/a/b/n;->b()La/a/a/b/n;

    move-result-object v5

    invoke-virtual {v5, v2}, La/a/a/b/n;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    :try_start_2
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    invoke-virtual {p1, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v2, :cond_2

    :try_start_3
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, v5

    :goto_1
    if-eqz v0, :cond_2

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v0, v1, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v6
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    :catch_1
    :cond_2
    :try_start_4
    new-instance v0, Lcom/baidu/location/c;

    invoke-direct {v0, p1}, Lcom/baidu/location/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/baidu/location/c;->r()I

    invoke-static {}, La/a/a/i/i;->k()Z

    move-result v1

    const/16 v2, 0xa1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Lcom/baidu/location/c;->r()I

    move-result v1

    if-ne v1, v2, :cond_3

    const/16 v1, 0xa0

    invoke-virtual {v0, v1}, Lcom/baidu/location/c;->h(I)V

    const/high16 v1, 0x44fa0000    # 2000.0f

    invoke-virtual {v0, v1}, Lcom/baidu/location/c;->b(F)V

    :cond_3
    invoke-virtual {v0}, Lcom/baidu/location/c;->r()I

    move-result v1

    if-ne v1, v2, :cond_4

    invoke-static {}, La/a/a/b/l;->f()La/a/a/b/l;

    move-result-object v1

    invoke-virtual {v1, p1}, La/a/a/b/l;->a(Ljava/lang/String;)V

    :cond_4
    invoke-static {}, La/a/a/b/t;->e()La/a/a/b/t;

    move-result-object p1

    invoke-virtual {p1}, La/a/a/b/t;->b()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, La/a/a/b/t;->e()La/a/a/b/t;

    move-result-object p1

    invoke-virtual {p1}, La/a/a/b/t;->a()F

    move-result p1

    invoke-virtual {v0, p1}, Lcom/baidu/location/c;->a(F)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_2

    :catch_2
    move-exception p1

    :try_start_5
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    new-instance v0, Lcom/baidu/location/c;

    invoke-direct {v0}, Lcom/baidu/location/c;-><init>()V

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lcom/baidu/location/c;->h(I)V

    :cond_5
    :goto_2
    iput-object v5, p0, La/a/a/b/m$c;->i:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/baidu/location/c;->r()I

    move-result p1

    if-nez p1, :cond_6

    invoke-virtual {v0}, Lcom/baidu/location/c;->q()D

    move-result-wide v1

    const-wide/16 v7, 0x1

    cmpl-double p1, v1, v7

    if-nez p1, :cond_6

    invoke-virtual {v0}, Lcom/baidu/location/c;->t()D

    move-result-wide v1

    cmpl-double p1, v1, v7

    if-nez p1, :cond_6

    iget-object p1, p0, La/a/a/b/m$c;->m:La/a/a/b/m;

    iget-object p1, p1, La/a/a/b/m;->g:Landroid/os/Handler;

    invoke-virtual {p1, v4}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object p1

    iput-object v3, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    goto :goto_3

    :cond_6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-wide v7, p0, La/a/a/b/m$c;->l:J

    sub-long/2addr v1, v7

    const-wide/16 v7, 0x3e8

    div-long/2addr v1, v7

    const-wide/16 v7, 0x0

    cmp-long p1, v1, v7

    if-gez p1, :cond_7

    move-wide v1, v7

    :cond_7
    iget-wide v9, p0, La/a/a/b/m$c;->k:J

    cmp-long p1, v9, v7

    if-gez p1, :cond_8

    iput-wide v7, p0, La/a/a/b/m$c;->k:J

    :cond_8
    iget-wide v7, p0, La/a/a/b/m$c;->k:J

    add-long/2addr v7, v1

    invoke-virtual {v0, v7, v8}, Lcom/baidu/location/c;->a(J)V

    iget-object p1, p0, La/a/a/b/m$c;->m:La/a/a/b/m;

    iget-object p1, p1, La/a/a/b/m;->g:Landroid/os/Handler;

    const/16 v1, 0x15

    invoke-virtual {p1, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object p1

    iput-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    iput v6, p1, Landroid/os/Message;->arg1:I

    :goto_3
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    goto :goto_4

    :catch_3
    :cond_9
    iget-object p1, p0, La/a/a/b/m$c;->m:La/a/a/b/m;

    iget-object p1, p1, La/a/a/b/m;->g:Landroid/os/Handler;

    invoke-virtual {p1, v4}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object p1

    iput-object v3, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    :goto_4
    iget-object p0, p0, La/a/a/i/g;->d:Ljava/util/Map;

    if-eqz p0, :cond_a

    invoke-interface {p0}, Ljava/util/Map;->clear()V

    :cond_a
    return-void
.end method
