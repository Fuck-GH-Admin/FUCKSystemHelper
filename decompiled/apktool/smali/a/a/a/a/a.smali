.class public La/a/a/a/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/a/c/a/c;


# static fields
.field public static d:Ljava/lang/Object;

.field public static e:La/a/a/a/a;


# instance fields
.field public a:I

.field public b:Landroid/content/Context;

.field public c:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, La/a/a/a/a;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, La/a/a/a/a;->a:I

    const/4 v0, 0x0

    iput-object v0, p0, La/a/a/a/a;->b:Landroid/content/Context;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, La/a/a/a/a;->c:J

    return-void
.end method

.method public static b()La/a/a/a/a;
    .locals 2

    sget-object v0, La/a/a/a/a;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, La/a/a/a/a;->e:La/a/a/a/a;

    if-nez v1, :cond_0

    new-instance v1, La/a/a/a/a;

    invoke-direct {v1}, La/a/a/a/a;-><init>()V

    sput-object v1, La/a/a/a/a;->e:La/a/a/a/a;

    :cond_0
    sget-object v1, La/a/a/a/a;->e:La/a/a/a/a;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static b(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    :try_start_0
    invoke-static {p0}, Lc/a/c/a/b;->c(Landroid/content/Context;)Lc/a/c/a/b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lc/a/c/a/b;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static c(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    :try_start_0
    invoke-static {p0}, Lc/a/c/a/b;->c(Landroid/content/Context;)Lc/a/c/a/b;

    move-result-object p0

    invoke-virtual {p0}, Lc/a/c/a/b;->b()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method


# virtual methods
.method public a(ILjava/lang/String;)V
    .locals 2

    const-string v0, "ak_permission"

    const-string v1, "token"

    iput p1, p0, La/a/a/a/a;->a:I

    if-eqz p2, :cond_1

    :try_start_0
    new-instance p0, Lorg/json/JSONObject;

    invoke-direct {p0, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    :cond_0
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    :goto_0
    return-void
.end method

.method public a(Landroid/content/Context;)V
    .locals 3

    iput-object p1, p0, La/a/a/a/a;->b:Landroid/content/Context;

    invoke-static {p1}, Lc/a/c/a/b;->c(Landroid/content/Context;)Lc/a/c/a/b;

    move-result-object p1

    const/4 v0, 0x0

    const-string v1, "lbs_locsdk"

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2, p0}, Lc/a/c/a/b;->a(ZLjava/lang/String;Ljava/util/Hashtable;Lc/a/c/a/c;)I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, La/a/a/a/a;->c:J

    return-void
.end method

.method public a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    invoke-static {p1}, Lc/a/c/a/b;->c(Landroid/content/Context;)Lc/a/c/a/b;

    move-result-object p0

    invoke-virtual {p0, p2}, Lc/a/c/a/b;->a(Ljava/lang/String;)V

    return-void
.end method

.method public a()Z
    .locals 6

    iget v0, p0, La/a/a/a/a;->a:I

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/16 v2, 0x25a

    if-eq v0, v2, :cond_0

    const/16 v2, 0x259

    if-eq v0, v2, :cond_0

    const/16 v2, -0xa

    if-eq v0, v2, :cond_0

    const/16 v2, -0xb

    if-eq v0, v2, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    iget-object v2, p0, La/a/a/a/a;->b:Landroid/content/Context;

    if-eqz v2, :cond_3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, La/a/a/a/a;->c:J

    sub-long/2addr v2, v4

    if-eqz v0, :cond_1

    const-wide/32 v4, 0x5265c00

    cmp-long v2, v2, v4

    if-lez v2, :cond_3

    goto :goto_1

    :cond_1
    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-ltz v4, :cond_2

    const-wide/16 v4, 0x2710

    cmp-long v2, v2, v4

    if-lez v2, :cond_3

    :cond_2
    :goto_1
    iget-object v2, p0, La/a/a/a/a;->b:Landroid/content/Context;

    invoke-static {v2}, Lc/a/c/a/b;->c(Landroid/content/Context;)Lc/a/c/a/b;

    move-result-object v2

    const/4 v3, 0x0

    const-string v4, "lbs_locsdk"

    invoke-virtual {v2, v1, v4, v3, p0}, Lc/a/c/a/b;->a(ZLjava/lang/String;Ljava/util/Hashtable;Lc/a/c/a/c;)I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, p0, La/a/a/a/a;->c:J

    :cond_3
    return v0
.end method
