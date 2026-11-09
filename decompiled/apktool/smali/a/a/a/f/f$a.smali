.class public La/a/a/f/f$a;
.super La/a/a/i/g;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/f/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public i:I

.field public j:J

.field public k:Ljava/lang/String;

.field public l:Z

.field public m:Z

.field public n:La/a/a/f/f;


# direct methods
.method public constructor <init>(La/a/a/f/f;La/a/a/f/f;)V
    .locals 0

    invoke-direct {p0}, La/a/a/i/g;-><init>()V

    iput-object p2, p0, La/a/a/f/f$a;->n:La/a/a/f/f;

    const/4 p1, 0x0

    iput-object p1, p0, La/a/a/f/f$a;->k:Ljava/lang/String;

    const/4 p1, 0x0

    iput-boolean p1, p0, La/a/a/f/f$a;->l:Z

    iput-boolean p1, p0, La/a/a/f/f$a;->m:Z

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, La/a/a/i/g;->d:Ljava/util/Map;

    iput p1, p0, La/a/a/f/f$a;->i:I

    const-wide/16 p1, -0x1

    iput-wide p1, p0, La/a/a/f/f$a;->j:J

    return-void
.end method

.method public static synthetic a(La/a/a/f/f$a;)V
    .locals 0

    invoke-virtual {p0}, La/a/a/f/f$a;->b()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, La/a/a/i/g;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget-object v0, p0, La/a/a/i/g;->d:Ljava/util/Map;

    const-string v1, "qt"

    const-string v2, "ofbh"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, La/a/a/i/g;->d:Ljava/util/Map;

    iget-object v1, p0, La/a/a/f/f$a;->k:Ljava/lang/String;

    const-string v2, "req"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, La/a/a/f/d;->j:Ljava/lang/String;

    iput-object v0, p0, La/a/a/i/g;->a:Ljava/lang/String;

    return-void
.end method

.method public a(Z)V
    .locals 4

    const-string v0, "error"

    const/4 v1, 0x0

    iput-boolean v1, p0, La/a/a/f/f$a;->m:Z

    const/4 v2, 0x1

    if-eqz p1, :cond_0

    iget-object p1, p0, La/a/a/i/g;->c:Ljava/lang/String;

    if-eqz p1, :cond_0

    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p1

    const/16 v0, 0xa1

    if-ne p1, v0, :cond_0

    iput-boolean v2, p0, La/a/a/f/f$a;->m:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    iget-boolean p1, p0, La/a/a/f/f$a;->m:Z

    if-nez p1, :cond_1

    iget p1, p0, La/a/a/f/f$a;->i:I

    add-int/2addr p1, v2

    iput p1, p0, La/a/a/f/f$a;->i:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, p0, La/a/a/f/f$a;->j:J

    :cond_1
    iget-object p1, p0, La/a/a/f/f$a;->n:La/a/a/f/f;

    iget-boolean v0, p0, La/a/a/f/f$a;->m:Z

    invoke-static {p1, v0}, La/a/a/f/f;->a(La/a/a/f/f;Z)V

    iput-boolean v1, p0, La/a/a/f/f$a;->l:Z

    return-void
.end method

.method public final b()V
    .locals 6

    iget-boolean v0, p0, La/a/a/f/f$a;->l:Z

    if-nez v0, :cond_2

    iget-object v0, p0, La/a/a/f/f$a;->n:La/a/a/f/f;

    invoke-static {v0}, La/a/a/f/f;->a(La/a/a/f/f;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, La/a/a/f/f$a;->k:Ljava/lang/String;

    iget-wide v0, p0, La/a/a/f/f$a;->j:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const-wide/32 v4, 0x5265c00

    add-long/2addr v0, v4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    cmp-long v0, v0, v4

    if-gtz v0, :cond_0

    const/4 v0, 0x0

    iput v0, p0, La/a/a/f/f$a;->i:I

    iput-wide v2, p0, La/a/a/f/f$a;->j:J

    :cond_0
    iget-object v0, p0, La/a/a/f/f$a;->k:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget v0, p0, La/a/a/f/f$a;->i:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_2

    const/4 v0, 0x1

    iput-boolean v0, p0, La/a/a/f/f$a;->l:Z

    invoke-static {}, La/a/a/b/w;->d()La/a/a/b/w;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/b/w;->b()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    const-string v1, "https://ofloc.map.baidu.com/offline_loc"

    if-eqz v0, :cond_1

    invoke-virtual {p0, v0, v1}, La/a/a/i/g;->a(Ljava/util/concurrent/ExecutorService;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v1}, La/a/a/i/g;->a(Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-void
.end method
