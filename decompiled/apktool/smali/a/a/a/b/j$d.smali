.class public La/a/a/b/j$d;
.super La/a/a/i/g;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/b/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public i:Ljava/lang/String;

.field public final synthetic j:La/a/a/b/j;


# direct methods
.method public constructor <init>(La/a/a/b/j;)V
    .locals 0

    iput-object p1, p0, La/a/a/b/j$d;->j:La/a/a/b/j;

    invoke-direct {p0}, La/a/a/i/g;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, La/a/a/b/j$d;->i:Ljava/lang/String;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, La/a/a/i/g;->d:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    const-string v0, "https://loc.map.baidu.com/cc.php"

    iput-object v0, p0, La/a/a/i/g;->a:Ljava/lang/String;

    iget-object v0, p0, La/a/a/b/j$d;->i:Ljava/lang/String;

    invoke-static {v0}, Lcom/baidu/location/Jni;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    iput-object v1, p0, La/a/a/b/j$d;->i:Ljava/lang/String;

    iget-object p0, p0, La/a/a/i/g;->d:Ljava/util/Map;

    const-string v1, "q"

    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public a(Z)V
    .locals 3

    if-eqz p1, :cond_0

    iget-object p1, p0, La/a/a/i/g;->c:Ljava/lang/String;

    if-eqz p1, :cond_0

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string p1, "prod"

    :try_start_1
    sget-object v1, La/a/a/i/b;->f:Ljava/lang/String;

    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    const-string p1, "uptime"

    :try_start_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    iget-object p1, p0, La/a/a/b/j$d;->j:La/a/a/b/j;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, La/a/a/b/j;->a(La/a/a/b/j;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    :cond_0
    iget-object p0, p0, La/a/a/i/g;->d:Ljava/util/Map;

    if-eqz p0, :cond_1

    invoke-interface {p0}, Ljava/util/Map;->clear()V

    :cond_1
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, La/a/a/b/j$d;->i:Ljava/lang/String;

    const-string p1, "https://loc.map.baidu.com/cc.php"

    invoke-virtual {p0, p1}, La/a/a/i/g;->a(Ljava/lang/String;)V

    return-void
.end method
