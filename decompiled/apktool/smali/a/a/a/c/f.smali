.class public La/a/a/c/f;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/a/a/c/f$c;,
        La/a/a/c/f$b;
    }
.end annotation


# static fields
.field public static f:Ljava/lang/Object;

.field public static g:La/a/a/c/f;


# instance fields
.field public a:Landroid/os/Handler;

.field public b:Ljava/lang/String;

.field public c:I

.field public d:La/a/a/c/f$b;

.field public e:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, La/a/a/c/f;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, La/a/a/c/f;->a:Landroid/os/Handler;

    iput-object v0, p0, La/a/a/c/f;->b:Ljava/lang/String;

    const/16 v1, 0x18

    iput v1, p0, La/a/a/c/f;->c:I

    iput-object v0, p0, La/a/a/c/f;->d:La/a/a/c/f$b;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, La/a/a/c/f;->e:J

    return-void
.end method

.method public static synthetic a(La/a/a/c/f;)V
    .locals 0

    invoke-virtual {p0}, La/a/a/c/f;->c()V

    return-void
.end method

.method public static synthetic b(La/a/a/c/f;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, La/a/a/c/f;->b:Ljava/lang/String;

    return-object p0
.end method

.method public static d()La/a/a/c/f;
    .locals 2

    sget-object v0, La/a/a/c/f;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, La/a/a/c/f;->g:La/a/a/c/f;

    if-nez v1, :cond_0

    new-instance v1, La/a/a/c/f;

    invoke-direct {v1}, La/a/a/c/f;-><init>()V

    sput-object v1, La/a/a/c/f;->g:La/a/a/c/f;

    :cond_0
    sget-object v1, La/a/a/c/f;->g:La/a/a/c/f;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public final a(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/net/wifi/WifiConfiguration;",
            ">;)",
            "Ljava/util/List<",
            "La/a/a/c/f$c;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/wifi/WifiConfiguration;

    iget-object v2, v1, Landroid/net/wifi/WifiConfiguration;->SSID:Ljava/lang/String;

    :try_start_0
    const-string v3, "numAssociation"

    invoke-static {v1, v3}, La/a/a/i/i;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    const/4 v1, 0x0

    :goto_1
    if-lez v1, :cond_0

    if-eqz v2, :cond_0

    new-instance v3, La/a/a/c/f$c;

    invoke-direct {v3, p0, v2, v1}, La/a/a/c/f$c;-><init>(La/a/a/c/f;Ljava/lang/String;I)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :cond_2
    return-object v0
.end method

.method public a()V
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, La/a/a/c/f;->e:J

    sub-long/2addr v0, v2

    const-wide/32 v2, 0x36ee80

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-object v0, p0, La/a/a/c/f;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, La/a/a/c/f;->e:J

    :cond_0
    return-void
.end method

.method public final a(ZLorg/json/JSONArray;Lorg/json/JSONArray;)V
    .locals 1

    iget-object v0, p0, La/a/a/c/f;->d:La/a/a/c/f$b;

    if-nez v0, :cond_0

    new-instance v0, La/a/a/c/f$b;

    invoke-direct {v0, p0}, La/a/a/c/f$b;-><init>(La/a/a/c/f;)V

    iput-object v0, p0, La/a/a/c/f;->d:La/a/a/c/f$b;

    :cond_0
    invoke-static {}, La/a/a/i/i;->l()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object p0, p0, La/a/a/c/f;->d:La/a/a/c/f$b;

    invoke-virtual {p0, p1, p2, p3}, La/a/a/c/f$b;->a(ZLorg/json/JSONArray;Lorg/json/JSONArray;)V

    :cond_1
    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, La/a/a/c/f;->a:Landroid/os/Handler;

    if-nez v0, :cond_0

    new-instance v0, La/a/a/c/f$a;

    invoke-direct {v0, p0}, La/a/a/c/f$a;-><init>(La/a/a/c/f;)V

    iput-object v0, p0, La/a/a/c/f;->a:Landroid/os/Handler;

    :cond_0
    invoke-static {}, La/a/a/i/i;->h()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, La/a/a/c/f;->b:Ljava/lang/String;

    return-void
.end method

.method public final c()V
    .locals 17

    move-object/from16 v1, p0

    const-string v0, "frq"

    const-string v2, "data"

    const-string v3, "tt"

    const-string v4, "cfg"

    const-string v5, "ison"

    iget-object v6, v1, La/a/a/c/f;->b:Ljava/lang/String;

    if-eqz v6, :cond_13

    :try_start_0
    new-instance v6, Ljava/io/File;

    iget-object v7, v1, La/a/a/c/f;->b:Ljava/lang/String;

    const-string v8, "wcnf.dat"

    invoke-direct {v6, v7, v8}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v9
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3

    const-wide/16 v10, 0x0

    const-string v14, "num"

    const/4 v15, 0x0

    const-string v12, "ssid"

    if-eqz v9, :cond_7

    :try_start_1
    new-instance v9, Ljava/io/BufferedReader;

    new-instance v13, Ljava/io/FileReader;

    invoke-direct {v13, v6}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V

    invoke-direct {v9, v13}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    :goto_0
    invoke-virtual {v9}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_0

    invoke-virtual {v6, v13}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    :cond_0
    invoke-virtual {v9}, Ljava/io/BufferedReader;->close()V

    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_5

    new-instance v9, Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->getBytes()[B

    move-result-object v6

    invoke-static {v6, v15}, Landroid/util/Base64;->decode([BI)[B

    move-result-object v6

    invoke-direct {v9, v6}, Ljava/lang/String;-><init>([B)V

    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6, v9}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-virtual {v6, v5}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    if-nez v5, :cond_1

    move v5, v15

    goto :goto_1

    :cond_1
    const/4 v5, 0x1

    :goto_1
    :try_start_2
    invoke-virtual {v6, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-virtual {v6, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, v1, La/a/a/c/f;->c:I

    :cond_2
    invoke-virtual {v6, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v6, v3}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v7

    :cond_3
    invoke-virtual {v6, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {v6, v2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :try_start_3
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v3

    move v4, v15

    :goto_2
    if-ge v4, v3, :cond_8

    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v6

    invoke-virtual {v6, v12}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-virtual {v6, v14}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_4

    new-instance v9, La/a/a/c/f$c;

    invoke-virtual {v6, v12}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v6, v14}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v15

    invoke-direct {v9, v1, v13, v15}, La/a/a/c/f$c;-><init>(La/a/a/c/f;Ljava/lang/String;I)V

    invoke-virtual {v6, v12}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v2, v6, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    :cond_4
    add-int/lit8 v4, v4, 0x1

    const/4 v15, 0x0

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_4

    :catch_1
    move-exception v0

    goto :goto_3

    :cond_5
    const/4 v5, 0x1

    :cond_6
    const/4 v2, 0x0

    goto :goto_5

    :catch_2
    move-exception v0

    const/4 v5, 0x1

    :goto_3
    const/4 v2, 0x0

    :goto_4
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_5

    :cond_7
    move-wide v7, v10

    const/4 v2, 0x0

    const/4 v5, 0x1

    :cond_8
    :goto_5
    if-nez v5, :cond_9

    iget v0, v1, La/a/a/c/f;->c:I

    mul-int/lit8 v0, v0, 0x4

    iput v0, v1, La/a/a/c/f;->c:I

    :cond_9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sub-long/2addr v3, v7

    iget v0, v1, La/a/a/c/f;->c:I

    mul-int/lit8 v0, v0, 0x3c

    mul-int/lit8 v0, v0, 0x3c

    mul-int/lit16 v0, v0, 0x3e8

    int-to-long v5, v0

    cmp-long v0, v3, v5

    if-lez v0, :cond_13

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/g/f;->i()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0}, La/a/a/c/f;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    cmp-long v3, v7, v10

    if-nez v3, :cond_b

    if-eqz v0, :cond_11

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_11

    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La/a/a/c/f$c;

    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    iget-object v6, v4, La/a/a/c/f$c;->a:Ljava/lang/String;

    invoke-virtual {v5, v12, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget v4, v4, La/a/a/c/f$c;->b:I

    invoke-virtual {v5, v14, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    invoke-virtual {v2, v5}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    invoke-virtual {v3, v5}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_6

    :cond_a
    move-object v12, v2

    const/4 v13, 0x1

    goto/16 :goto_b

    :cond_b
    if-eqz v0, :cond_11

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_11

    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    if-eqz v2, :cond_12

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v4

    if-lez v4, :cond_12

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/16 v16, 0x0

    :cond_c
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_10

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La/a/a/c/f$c;

    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    iget-object v6, v4, La/a/a/c/f$c;->a:Ljava/lang/String;

    invoke-virtual {v5, v12, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget v6, v4, La/a/a/c/f$c;->b:I

    invoke-virtual {v5, v14, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    invoke-virtual {v3, v5}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    iget-object v5, v4, La/a/a/c/f$c;->a:Ljava/lang/String;

    invoke-interface {v2, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_e

    iget v5, v4, La/a/a/c/f$c;->b:I

    iget-object v6, v4, La/a/a/c/f$c;->a:Ljava/lang/String;

    invoke-interface {v2, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, La/a/a/c/f$c;

    iget v6, v6, La/a/a/c/f$c;->b:I

    if-eq v5, v6, :cond_d

    goto :goto_8

    :cond_d
    const/4 v5, 0x0

    goto :goto_9

    :cond_e
    :goto_8
    const/4 v5, 0x1

    :goto_9
    if-eqz v5, :cond_c

    if-nez v16, :cond_f

    new-instance v16, Lorg/json/JSONArray;

    invoke-direct/range {v16 .. v16}, Lorg/json/JSONArray;-><init>()V

    :cond_f
    move-object/from16 v5, v16

    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    iget-object v7, v4, La/a/a/c/f$c;->a:Ljava/lang/String;

    invoke-virtual {v6, v12, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget v4, v4, La/a/a/c/f$c;->b:I

    invoke-virtual {v6, v14, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    invoke-virtual {v5, v6}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    move-object/from16 v16, v5

    goto :goto_7

    :cond_10
    move-object/from16 v12, v16

    goto :goto_a

    :cond_11
    const/4 v3, 0x0

    :cond_12
    const/4 v12, 0x0

    :goto_a
    const/4 v13, 0x0

    :goto_b
    if-eqz v12, :cond_13

    if-eqz v3, :cond_13

    invoke-virtual {v1, v13, v12, v3}, La/a/a/c/f;->a(ZLorg/json/JSONArray;Lorg/json/JSONArray;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_c

    :catch_3
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_13
    :goto_c
    return-void
.end method
