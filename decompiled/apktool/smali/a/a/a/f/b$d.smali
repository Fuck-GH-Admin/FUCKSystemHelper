.class public final La/a/a/f/b$d;
.super La/a/a/i/g;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/f/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "d"
.end annotation


# instance fields
.field public i:Ljava/lang/String;

.field public final j:Ljava/lang/String;

.field public k:Ljava/lang/String;

.field public l:La/a/a/f/b;

.field public m:Z

.field public n:I

.field public o:J

.field public p:J

.field public q:J

.field public r:J

.field public final synthetic s:La/a/a/f/b;


# direct methods
.method public constructor <init>(La/a/a/f/b;La/a/a/f/b;Z)V
    .locals 2

    iput-object p1, p0, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-direct {p0}, La/a/a/i/g;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, La/a/a/f/b$d;->m:Z

    iput p1, p0, La/a/a/f/b$d;->n:I

    const-wide/16 v0, -0x1

    iput-wide v0, p0, La/a/a/f/b$d;->o:J

    iput-wide v0, p0, La/a/a/f/b$d;->p:J

    iput-wide v0, p0, La/a/a/f/b$d;->q:J

    iput-wide v0, p0, La/a/a/f/b$d;->r:J

    iput-object p2, p0, La/a/a/f/b$d;->l:La/a/a/f/b;

    if-eqz p3, :cond_0

    const-string p1, "load"

    goto :goto_0

    :cond_0
    const-string p1, "update"

    :goto_0
    iput-object p1, p0, La/a/a/f/b$d;->j:Ljava/lang/String;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, La/a/a/i/g;->d:Ljava/util/Map;

    sget-object p1, La/a/a/f/d;->j:Ljava/lang/String;

    iput-object p1, p0, La/a/a/f/b$d;->i:Ljava/lang/String;

    return-void
.end method

.method public static synthetic a(La/a/a/f/b$d;J)J
    .locals 0

    iput-wide p1, p0, La/a/a/f/b$d;->p:J

    return-wide p1
.end method

.method public static synthetic a(La/a/a/f/b$d;)La/a/a/f/b;
    .locals 0

    iget-object p0, p0, La/a/a/f/b$d;->l:La/a/a/f/b;

    return-object p0
.end method

.method public static synthetic a(La/a/a/f/b$d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, La/a/a/f/b$d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic a(La/a/a/f/b$d;Z)Z
    .locals 0

    iput-boolean p1, p0, La/a/a/f/b$d;->m:Z

    return p1
.end method

.method public static synthetic b(La/a/a/f/b$d;)V
    .locals 0

    invoke-virtual {p0}, La/a/a/f/b$d;->b()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, La/a/a/f/b$d;->m:Z

    iget-object v0, p0, La/a/a/f/b$d;->i:Ljava/lang/String;

    iput-object v0, p0, La/a/a/i/g;->a:Ljava/lang/String;

    iget-object v0, p0, La/a/a/i/g;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget-object v0, p0, La/a/a/i/g;->d:Ljava/util/Map;

    iget-object v1, p0, La/a/a/f/b$d;->j:Ljava/lang/String;

    const-string v2, "qt"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, La/a/a/i/g;->d:Ljava/util/Map;

    iget-object p0, p0, La/a/a/f/b$d;->k:Ljava/lang/String;

    const-string v1, "req"

    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iput-object p3, p0, La/a/a/f/b$d;->k:Ljava/lang/String;

    const/4 p3, 0x2

    new-array p3, p3, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p1, p3, v0

    const/4 p1, 0x1

    aput-object p2, p3, p1

    const-string p1, "http://%s/%s"

    invoke-static {p1, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, La/a/a/f/b$d;->i:Ljava/lang/String;

    const-string p1, "ofloc.map.baidu.com"

    invoke-virtual {p0, v0, p1}, La/a/a/i/g;->a(ZLjava/lang/String;)V

    return-void
.end method

.method public a(Z)V
    .locals 0

    if-eqz p1, :cond_0

    iget-object p1, p0, La/a/a/i/g;->c:Ljava/lang/String;

    if-eqz p1, :cond_0

    new-instance p1, La/a/a/f/b$d$a;

    invoke-direct {p1, p0}, La/a/a/f/b$d$a;-><init>(La/a/a/f/b$d;)V

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    iput-boolean p1, p0, La/a/a/f/b$d;->m:Z

    invoke-virtual {p0}, La/a/a/f/b$d;->b()V

    :goto_0
    return-void
.end method

.method public final b()V
    .locals 2

    iget v0, p0, La/a/a/f/b$d;->n:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, La/a/a/f/b$d;->n:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, La/a/a/f/b$d;->o:J

    return-void
.end method

.method public final c()Ljava/lang/String;
    .locals 4

    const/4 p0, 0x0

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "type"

    const-string v2, "0"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v1, "cuid"

    :try_start_1
    invoke-static {}, La/a/a/i/b;->e()La/a/a/i/b;

    move-result-object v2

    iget-object v2, v2, La/a/a/i/b;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "ver"

    const-string v2, "1"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    const-string v1, "prod"

    :try_start_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, La/a/a/i/b;->g:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ":"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, La/a/a/i/b;->f:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    :catch_0
    move-object v0, p0

    :goto_0
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/baidu/location/Jni;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public final d()Ljava/lang/String;
    .locals 17

    move-object/from16 v0, p0

    const-string v1, "1"

    const-string v2, "SELECT * FROM %s WHERE frequency>%d ORDER BY frequency DESC LIMIT %d;"

    const-string v3, "model"

    const/4 v4, 0x0

    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_7
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    :try_start_1
    iget-object v7, v0, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-static {v7}, La/a/a/f/b;->a(La/a/a/f/b;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v7

    const/4 v8, 0x3

    new-array v9, v8, [Ljava/lang/Object;

    const-string v10, "CL"

    const/4 v11, 0x0

    aput-object v10, v9, v11

    const/4 v10, 0x5

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    const/4 v13, 0x1

    aput-object v12, v9, v13

    const/16 v12, 0x32

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    const/4 v15, 0x2

    aput-object v14, v9, v15

    invoke-static {v2, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v9, v4}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v7
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    if-eqz v7, :cond_1

    :try_start_2
    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-interface {v7}, Landroid/database/Cursor;->getCount()I

    move-result v9

    new-instance v14, Lorg/json/JSONArray;

    invoke-direct {v14}, Lorg/json/JSONArray;-><init>()V

    :goto_0
    invoke-interface {v7}, Landroid/database/Cursor;->isAfterLast()Z

    move-result v16
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v16, :cond_0

    :try_start_3
    invoke-interface {v7, v13}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v14, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    invoke-interface {v7}, Landroid/database/Cursor;->moveToNext()Z

    const/4 v4, 0x0

    goto :goto_0

    :cond_0
    const-string v4, "cell"

    invoke-virtual {v5, v4, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    const/4 v4, 0x0

    goto/16 :goto_5

    :catch_0
    move-object v8, v4

    goto/16 :goto_4

    :cond_1
    move v9, v11

    :goto_1
    :try_start_4
    iget-object v4, v0, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-static {v4}, La/a/a/f/b;->a(La/a/a/f/b;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v4

    new-array v8, v8, [Ljava/lang/Object;

    const-string v14, "AP"

    aput-object v14, v8, v11

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v8, v13

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v8, v15

    invoke-static {v2, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    const/4 v8, 0x0

    :try_start_5
    invoke-virtual {v4, v2, v8}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    if-eqz v2, :cond_3

    :try_start_6
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    move-result v11

    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    :goto_2
    invoke-interface {v2}, Landroid/database/Cursor;->isAfterLast()Z

    move-result v10

    if-nez v10, :cond_2

    invoke-interface {v2, v13}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4, v10}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    goto :goto_2

    :cond_2
    const-string v10, "ap"

    invoke-virtual {v5, v10, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_3
    const-string v4, "type"

    invoke-virtual {v6, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_8
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    const-string v4, "cuid"

    :try_start_7
    invoke-static {}, La/a/a/i/b;->e()La/a/a/i/b;

    move-result-object v10

    iget-object v10, v10, La/a/a/i/b;->c:Ljava/lang/String;

    invoke-virtual {v6, v4, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v4, "ver"

    invoke-virtual {v6, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_8
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    const-string v1, "prod"

    :try_start_8
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v10, La/a/a/i/b;->g:Ljava/lang/String;

    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, ":"

    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v10, La/a/a/i/b;->f:Ljava/lang/String;

    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    if-nez v9, :cond_4

    if-eqz v11, :cond_5

    :cond_4
    invoke-virtual {v6, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :cond_5
    if-eqz v2, :cond_6

    :try_start_9
    invoke-interface {v2}, Landroid/database/Cursor;->close()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_1

    :catch_1
    :cond_6
    if-eqz v7, :cond_a

    goto :goto_7

    :catchall_1
    move-exception v0

    move-object v4, v2

    goto :goto_5

    :catchall_2
    move-exception v0

    goto :goto_3

    :catchall_3
    move-exception v0

    const/4 v8, 0x0

    :goto_3
    move-object v4, v8

    goto :goto_5

    :catch_2
    const/4 v8, 0x0

    :catch_3
    :goto_4
    move-object v2, v8

    goto :goto_6

    :catch_4
    move-object v8, v4

    move-object v2, v8

    move-object v7, v2

    goto :goto_6

    :catchall_4
    move-exception v0

    move-object v8, v4

    move-object v7, v4

    :goto_5
    if-eqz v4, :cond_7

    :try_start_a
    invoke-interface {v4}, Landroid/database/Cursor;->close()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_5

    :catch_5
    :cond_7
    if-eqz v7, :cond_8

    :try_start_b
    invoke-interface {v7}, Landroid/database/Cursor;->close()V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_6

    :catch_6
    :cond_8
    throw v0

    :catch_7
    move-object v8, v4

    move-object v2, v8

    move-object v6, v2

    move-object v7, v6

    :catch_8
    :goto_6
    if-eqz v2, :cond_9

    :try_start_c
    invoke-interface {v2}, Landroid/database/Cursor;->close()V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_9

    :catch_9
    :cond_9
    if-eqz v7, :cond_a

    :goto_7
    :try_start_d
    invoke-interface {v7}, Landroid/database/Cursor;->close()V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_a

    :catch_a
    :cond_a
    if-eqz v6, :cond_c

    invoke-virtual {v6, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_c

    iget-wide v1, v0, La/a/a/f/b$d;->r:J

    const-wide/16 v4, -0x1

    cmp-long v4, v1, v4

    if-eqz v4, :cond_b

    const-wide/32 v4, 0x5265c00

    add-long/2addr v1, v4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    cmp-long v1, v1, v4

    if-gez v1, :cond_c

    :cond_b
    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/baidu/location/Jni;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, v0, La/a/a/f/b$d;->r:J

    goto :goto_8

    :cond_c
    move-object v4, v8

    :goto_8
    if-eqz v6, :cond_d

    invoke-virtual {v6, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/baidu/location/Jni;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    :cond_d
    return-object v4
.end method

.method public final e()Ljava/lang/String;
    .locals 5

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    const-string v2, "type"

    const-string v3, "2"

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "ver"

    const-string v3, "1"

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    const-string v2, "cuid"

    :try_start_2
    invoke-static {}, La/a/a/i/b;->e()La/a/a/i/b;

    move-result-object v3

    iget-object v3, v3, La/a/a/i/b;->c:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    const-string v2, "prod"

    :try_start_3
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, La/a/a/i/b;->g:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ":"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v4, La/a/a/i/b;->f:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, p0, La/a/a/f/b$d;->q:J
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_0

    :catch_0
    move-object v1, v0

    :catch_1
    :goto_0
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/baidu/location/Jni;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final f()Ljava/lang/String;
    .locals 6

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-static {v1}, La/a/a/f/b;->c(La/a/a/f/b;)La/a/a/f/d;

    move-result-object v1

    invoke-virtual {v1}, La/a/a/f/d;->g()La/a/a/f/g;

    move-result-object v1

    invoke-virtual {v1}, La/a/a/f/g;->a()Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    const-string v3, "type"

    const-string v4, "3"

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v3, "ver"

    const-string v4, "1"

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    const-string v3, "cuid"

    :try_start_2
    invoke-static {}, La/a/a/i/b;->e()La/a/a/i/b;

    move-result-object v4

    iget-object v4, v4, La/a/a/i/b;->c:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    const-string v3, "prod"

    :try_start_3
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v5, La/a/a/i/b;->g:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ":"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v5, La/a/a/i/b;->f:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v3, "rgc"

    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iput-wide v3, p0, La/a/a/f/b$d;->q:J
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_0

    :catch_0
    :cond_0
    move-object v2, v0

    :catch_1
    :goto_0
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/baidu/location/Jni;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public final g()Z
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x1

    :try_start_0
    iget-object v2, p0, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-static {v2}, La/a/a/f/b;->d(La/a/a/f/b;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    const-string v3, "SELECT COUNT(*) FROM AP;"

    invoke-virtual {v2, v3, v0}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object p0, p0, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-static {p0}, La/a/a/f/b;->d(La/a/a/f/b;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p0

    const-string v3, "SELECT COUNT(*) FROM CL"

    invoke-virtual {p0, v3, v0}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    const/4 p0, 0x0

    if-eqz v2, :cond_1

    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v3

    if-eqz v3, :cond_1

    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2, p0}, Landroid/database/Cursor;->getInt(I)I

    move-result v3

    if-nez v3, :cond_0

    invoke-interface {v0, p0}, Landroid/database/Cursor;->getInt(I)I

    move-result v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v3, :cond_1

    :cond_0
    move v1, p0

    :cond_1
    if-eqz v2, :cond_2

    :try_start_2
    invoke-interface {v2}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    :cond_2
    if-eqz v0, :cond_6

    goto :goto_2

    :catchall_0
    move-exception p0

    move-object v1, v0

    move-object v0, v2

    goto :goto_0

    :catch_1
    move-object p0, v0

    move-object v0, v2

    goto :goto_1

    :catchall_1
    move-exception p0

    move-object v1, v0

    :goto_0
    if-eqz v0, :cond_3

    :try_start_3
    invoke-interface {v0}, Landroid/database/Cursor;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    :catch_2
    :cond_3
    if-eqz v1, :cond_4

    :try_start_4
    invoke-interface {v1}, Landroid/database/Cursor;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    :catch_3
    :cond_4
    throw p0

    :catch_4
    move-object p0, v0

    :goto_1
    if-eqz v0, :cond_5

    :try_start_5
    invoke-interface {v0}, Landroid/database/Cursor;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    :catch_5
    :cond_5
    if-eqz p0, :cond_6

    move-object v0, p0

    :goto_2
    :try_start_6
    invoke-interface {v0}, Landroid/database/Cursor;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6

    :catch_6
    :cond_6
    return v1
.end method

.method public final h()Z
    .locals 7

    iget v0, p0, La/a/a/f/b$d;->n:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-ge v0, v3, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v3, p0, La/a/a/f/b$d;->o:J

    const-wide/32 v5, 0x2932e00

    add-long/2addr v3, v5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    cmp-long v0, v3, v5

    if-gez v0, :cond_1

    iput v2, p0, La/a/a/f/b$d;->n:I

    const-wide/16 v2, -0x1

    iput-wide v2, p0, La/a/a/f/b$d;->o:J

    goto :goto_0

    :cond_1
    move v1, v2

    :goto_0
    return v1
.end method

.method public i()V
    .locals 1

    invoke-virtual {p0}, La/a/a/f/b$d;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, La/a/a/f/b$d;->m:Z

    if-nez v0, :cond_0

    iget-object p0, p0, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-static {p0}, La/a/a/f/b;->b(La/a/a/f/b;)La/a/a/f/b$d;

    move-result-object p0

    invoke-virtual {p0}, La/a/a/f/b$d;->j()V

    :cond_0
    return-void
.end method

.method public final j()V
    .locals 9

    const/4 v0, 0x0

    iput-object v0, p0, La/a/a/f/b$d;->k:Ljava/lang/String;

    invoke-virtual {p0}, La/a/a/f/b$d;->g()Z

    move-result v0

    const-wide/32 v1, 0x5265c00

    const-wide/16 v3, -0x1

    if-eqz v0, :cond_1

    iget-wide v5, p0, La/a/a/f/b$d;->p:J

    cmp-long v0, v5, v3

    if-eqz v0, :cond_0

    add-long/2addr v5, v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    cmp-long v0, v5, v7

    if-gtz v0, :cond_2

    :cond_0
    invoke-virtual {p0}, La/a/a/f/b$d;->c()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, La/a/a/f/b$d;->d()Ljava/lang/String;

    move-result-object v0

    :goto_0
    iput-object v0, p0, La/a/a/f/b$d;->k:Ljava/lang/String;

    :cond_2
    iget-object v0, p0, La/a/a/f/b$d;->k:Ljava/lang/String;

    if-nez v0, :cond_5

    iget-wide v5, p0, La/a/a/f/b$d;->q:J

    cmp-long v0, v5, v3

    if-eqz v0, :cond_3

    add-long/2addr v5, v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    cmp-long v0, v5, v0

    if-gtz v0, :cond_5

    :cond_3
    iget-object v0, p0, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-static {v0}, La/a/a/f/b;->c(La/a/a/f/b;)La/a/a/f/d;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/f/d;->g()La/a/a/f/g;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/f/g;->b()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, La/a/a/f/b$d;->e()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, La/a/a/f/b$d;->f()Ljava/lang/String;

    move-result-object v0

    :goto_1
    iput-object v0, p0, La/a/a/f/b$d;->k:Ljava/lang/String;

    :cond_5
    iget-object v0, p0, La/a/a/f/b$d;->k:Ljava/lang/String;

    if-eqz v0, :cond_7

    invoke-static {}, La/a/a/b/w;->d()La/a/a/b/w;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/b/w;->b()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    const-string v1, "https://ofloc.map.baidu.com/offline_loc"

    if-eqz v0, :cond_6

    invoke-virtual {p0, v0, v1}, La/a/a/i/g;->a(Ljava/util/concurrent/ExecutorService;Ljava/lang/String;)V

    goto :goto_2

    :cond_6
    invoke-virtual {p0, v1}, La/a/a/i/g;->a(Ljava/lang/String;)V

    :cond_7
    :goto_2
    return-void
.end method
