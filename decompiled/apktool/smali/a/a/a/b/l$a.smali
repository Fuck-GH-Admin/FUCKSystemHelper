.class public La/a/a/b/l$a;
.super La/a/a/i/g;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/b/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;

.field public k:Z

.field public final synthetic l:La/a/a/b/l;


# direct methods
.method public constructor <init>(La/a/a/b/l;)V
    .locals 0

    iput-object p1, p0, La/a/a/b/l$a;->l:La/a/a/b/l;

    invoke-direct {p0}, La/a/a/i/g;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, La/a/a/b/l$a;->i:Ljava/lang/String;

    iput-object p1, p0, La/a/a/b/l$a;->j:Ljava/lang/String;

    const/4 p1, 0x1

    iput-boolean p1, p0, La/a/a/b/l$a;->k:Z

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, La/a/a/i/g;->d:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, La/a/a/i/g;->b:I

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/g/f;->k()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/baidu/location/Jni;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, La/a/a/i/g;->f:Ljava/lang/String;

    :cond_0
    iget-object v0, p0, La/a/a/b/l$a;->j:Ljava/lang/String;

    invoke-static {v0}, Lcom/baidu/location/Jni;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    iput-object v1, p0, La/a/a/b/l$a;->j:Ljava/lang/String;

    iget-object p0, p0, La/a/a/i/g;->d:Ljava/util/Map;

    const-string v1, "bloc"

    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, La/a/a/b/l$a;->l:La/a/a/b/l;

    invoke-static {v0}, La/a/a/b/l;->c(La/a/a/b/l;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, La/a/a/b/l$a;->l:La/a/a/b/l;

    const/4 v1, 0x1

    invoke-static {v0, v1}, La/a/a/b/l;->a(La/a/a/b/l;Z)Z

    iput-object p1, p0, La/a/a/b/l$a;->i:Ljava/lang/String;

    invoke-static {}, La/a/a/b/n;->b()La/a/a/b/n;

    move-result-object p1

    invoke-virtual {p1}, La/a/a/b/n;->a()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "&enc=2"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, La/a/a/b/l$a;->j:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object p2, p0, La/a/a/b/l$a;->j:Ljava/lang/String;

    :goto_0
    invoke-static {}, La/a/a/b/w;->d()La/a/a/b/w;

    move-result-object p1

    invoke-virtual {p1}, La/a/a/b/w;->b()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    if-eqz p1, :cond_1

    sget-object p2, La/a/a/i/d;->b:Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, La/a/a/i/g;->a(Ljava/util/concurrent/ExecutorService;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    sget-object p1, La/a/a/i/d;->b:Ljava/lang/String;

    invoke-virtual {p0, p1}, La/a/a/i/g;->a(Ljava/lang/String;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public a(Z)V
    .locals 10

    const-string v0, "hstdata"

    const-string v1, "mac"

    const-string v2, "content"

    const-string v3, "imo"

    const-string v4, "enc"

    if-eqz p1, :cond_3

    iget-object p1, p0, La/a/a/i/g;->c:Ljava/lang/String;

    if-eqz p1, :cond_3

    :try_start_0
    invoke-virtual {p1, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-static {}, La/a/a/b/n;->b()La/a/a/b/n;

    move-result-object v5

    invoke-virtual {v5}, La/a/a/b/n;->a()Z

    move-result v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    if-eqz v5, :cond_0

    :try_start_1
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-virtual {v5, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {}, La/a/a/b/n;->b()La/a/a/b/n;

    move-result-object v5

    invoke-virtual {v5, v4}, La/a/a/b/n;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v4

    :try_start_2
    invoke-virtual {v4}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    iget-boolean v4, p0, La/a/a/b/l$a;->k:Z

    if-eqz v4, :cond_4

    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    const/4 v5, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    goto :goto_1

    :cond_1
    move-object p1, v5

    :goto_1
    if-eqz p1, :cond_4

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string v3, "mv"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p1

    iget-object v3, p0, La/a/a/b/l$a;->i:Ljava/lang/String;

    invoke-static {v3}, Lcom/baidu/location/Jni;->d(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    cmp-long v3, v3, v6

    if-nez v3, :cond_4

    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    const-string v4, "tt"

    :try_start_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    const-wide/16 v8, 0x3e8

    div-long/2addr v6, v8

    long-to-int v6, v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v3, v4, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    const-string v4, "hst"

    :try_start_4
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v3, v4, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    :try_start_5
    iget-object v4, p0, La/a/a/b/l$a;->l:La/a/a/b/l;

    invoke-static {v4}, La/a/a/b/l;->a(La/a/a/b/l;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v4

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "id = \""

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, "\""

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v0, v3, v6, v5}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v4

    if-gtz v4, :cond_2

    const-string v4, "id"

    invoke-virtual {v3, v4, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    iget-object v2, p0, La/a/a/b/l$a;->l:La/a/a/b/l;

    invoke-static {v2}, La/a/a/b/l;->a(La/a/a/b/l;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    invoke-virtual {v2, v0, v5, v3}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    :catch_1
    :cond_2
    :try_start_6
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v2, p0, La/a/a/b/l$a;->i:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    const-string v1, "hotspot"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object p1, p0, La/a/a/b/l$a;->l:La/a/a/b/l;

    invoke-static {p1, v0}, La/a/a/b/l;->a(La/a/a/b/l;Landroid/os/Bundle;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    goto :goto_2

    :cond_3
    iget-boolean p1, p0, La/a/a/b/l$a;->k:Z

    if-eqz p1, :cond_4

    iget-object p1, p0, La/a/a/b/l$a;->l:La/a/a/b/l;

    invoke-static {p1}, La/a/a/b/l;->b(La/a/a/b/l;)V

    :catch_2
    :cond_4
    :goto_2
    iget-object p1, p0, La/a/a/i/g;->d:Ljava/util/Map;

    if-eqz p1, :cond_5

    invoke-interface {p1}, Ljava/util/Map;->clear()V

    :cond_5
    iget-object p0, p0, La/a/a/b/l$a;->l:La/a/a/b/l;

    const/4 p1, 0x0

    invoke-static {p0, p1}, La/a/a/b/l;->a(La/a/a/b/l;Z)Z

    return-void
.end method
