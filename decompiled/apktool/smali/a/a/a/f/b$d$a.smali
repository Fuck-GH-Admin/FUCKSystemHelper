.class public La/a/a/f/b$d$a;
.super Ljava/lang/Thread;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/a/a/f/b$d;->a(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:La/a/a/f/b$d;


# direct methods
.method public constructor <init>(La/a/a/f/b$d;)V
    .locals 0

    iput-object p1, p0, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 30

    move-object/from16 v1, p0

    const-string v2, "DELETE FROM %s WHERE id NOT IN (SELECT id FROM %s ORDER BY timestamp DESC, frequency DESC LIMIT %d);"

    const-string v3, "bdlist"

    const-string v0, "rgc"

    const-string v4, "type"

    const-string v5, "model"

    const-string v6, "CL"

    const-string v7, "AP"

    const-string v8, "loadurl"

    invoke-super/range {p0 .. p0}, Ljava/lang/Thread;->run()V

    iget-object v9, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    iget-object v9, v9, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-static {v9}, La/a/a/f/b;->d(La/a/a/f/b;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v9

    if-eqz v9, :cond_26

    iget-object v9, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    iget-object v9, v9, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-static {v9}, La/a/a/f/b;->a(La/a/a/f/b;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v9

    if-eqz v9, :cond_26

    iget-object v9, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    iget-object v9, v9, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-static {v9}, La/a/a/f/b;->d(La/a/a/f/b;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v9

    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z

    move-result v9

    if-eqz v9, :cond_26

    iget-object v9, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    iget-object v9, v9, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-static {v9}, La/a/a/f/b;->a(La/a/a/f/b;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v9

    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z

    move-result v9

    if-nez v9, :cond_0

    goto/16 :goto_15

    :cond_0
    :try_start_0
    iget-object v11, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    iget-object v11, v11, La/a/a/i/g;->c:Ljava/lang/String;

    if-eqz v11, :cond_2

    new-instance v12, Lorg/json/JSONObject;

    invoke-direct {v12, v11}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    :try_start_1
    invoke-virtual {v12, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_1

    invoke-virtual {v12, v5}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    :goto_0
    :try_start_2
    invoke-virtual {v12, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_3

    invoke-virtual {v12, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    const/4 v5, 0x0

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    const/4 v5, 0x0

    const/4 v12, 0x0

    goto :goto_2

    :catch_2
    move-exception v0

    const/4 v5, 0x0

    const/4 v12, 0x0

    :goto_1
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_3
    const/4 v0, 0x0

    :goto_2
    :try_start_3
    iget-object v11, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    iget-object v11, v11, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-static {v11}, La/a/a/f/b;->d(La/a/a/f/b;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v11

    invoke-virtual {v11}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    iget-object v11, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    iget-object v11, v11, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-static {v11}, La/a/a/f/b;->a(La/a/a/f/b;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v11

    invoke-virtual {v11}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    if-eqz v0, :cond_4

    :try_start_4
    iget-object v11, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    iget-object v11, v11, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-static {v11}, La/a/a/f/b;->c(La/a/a/f/b;)La/a/a/f/d;

    move-result-object v11

    invoke-virtual {v11}, La/a/a/f/d;->g()La/a/a/f/g;

    move-result-object v11

    invoke-virtual {v11, v0}, La/a/a/f/g;->a(Lorg/json/JSONObject;)V

    goto :goto_3

    :catchall_0
    move-exception v0

    goto/16 :goto_14

    :cond_4
    :goto_3
    if-eqz v12, :cond_5

    invoke-virtual {v12, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v12, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v4, "0"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    invoke-static {v0, v13, v14}, La/a/a/f/b$d;->a(La/a/a/f/b$d;J)J

    :cond_5
    if-eqz v12, :cond_6

    invoke-virtual {v12, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {v12, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v3, ";"

    invoke-virtual {v0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    iget-object v3, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    invoke-static {v3}, La/a/a/f/b$d;->a(La/a/a/f/b$d;)La/a/a/f/b;

    move-result-object v3

    invoke-static {v3, v0}, La/a/a/f/b;->a(La/a/a/f/b;[Ljava/lang/String;)V

    :cond_6
    if-eqz v12, :cond_7

    invoke-virtual {v12, v8}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    invoke-static {v0}, La/a/a/f/b$d;->a(La/a/a/f/b$d;)La/a/a/f/b;

    move-result-object v0

    invoke-virtual {v12, v8}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    const-string v4, "host"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v12, v8}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    const-string v11, "module"

    invoke-virtual {v4, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v12, v8}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v8

    const-string v11, "req"

    invoke-virtual {v8, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v0, v3, v4, v8}, La/a/a/f/b;->a(La/a/a/f/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_7
    const-string v0, "cell"

    const-string v3, ","

    const/4 v4, 0x3

    if-eqz v5, :cond_12

    :try_start_5
    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_12

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v13

    invoke-virtual {v13}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v14

    new-instance v15, Ljava/lang/StringBuffer;

    invoke-direct {v15}, Ljava/lang/StringBuffer;-><init>()V

    new-instance v9, Ljava/lang/StringBuffer;

    invoke-direct {v9}, Ljava/lang/StringBuffer;-><init>()V

    new-instance v10, Ljava/lang/StringBuffer;

    invoke-direct {v10}, Ljava/lang/StringBuffer;-><init>()V

    const/16 v16, 0x0

    const/16 v17, 0x1

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x1

    const/16 v21, 0x1

    :goto_4
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v22
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    const-string v12, "DELETE FROM CL WHERE id IN (%s);"

    if-eqz v22, :cond_f

    :try_start_6
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v22

    move-object/from16 v11, v22

    check-cast v11, Ljava/lang/String;

    invoke-virtual {v13, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v23

    aget-object v23, v23, v4

    invoke-static/range {v23 .. v23}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v23

    if-eqz v17, :cond_8

    const/16 v17, 0x0

    goto :goto_5

    :cond_8
    const/16 v4, 0x2c

    invoke-virtual {v9, v4}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    :goto_5
    invoke-virtual {v9, v11}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v4, v16, 0x1

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v24

    const-wide/16 v26, 0x0

    cmpl-double v16, v24, v26

    if-lez v16, :cond_a

    if-eqz v21, :cond_9

    move-object/from16 v23, v13

    const/16 v21, 0x0

    goto :goto_6

    :cond_9
    move-object/from16 v23, v13

    const/16 v13, 0x2c

    invoke-virtual {v10, v13}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    :goto_6
    const/16 v13, 0x28

    invoke-virtual {v10, v13}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v10, v11}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const/16 v11, 0x2c

    invoke-virtual {v10, v11}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v24

    const-wide/16 v26, 0x3e8

    move-object/from16 v28, v14

    div-long v13, v24, v26

    invoke-virtual {v8, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v10, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const/16 v8, 0x29

    invoke-virtual {v10, v8}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    add-int/lit8 v18, v18, 0x1

    goto :goto_8

    :cond_a
    move-object/from16 v23, v13

    move-object/from16 v28, v14

    if-eqz v20, :cond_b

    const/16 v20, 0x0

    goto :goto_7

    :cond_b
    const/16 v8, 0x2c

    invoke-virtual {v15, v8}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    :goto_7
    invoke-virtual {v15, v11}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v19, v19, 0x1

    :goto_8
    move/from16 v8, v18

    move/from16 v11, v19

    const/16 v13, 0x64

    if-lt v4, v13, :cond_c

    iget-object v13, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    iget-object v13, v13, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-static {v13}, La/a/a/f/b;->a(La/a/a/f/b;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v13

    move-object/from16 v24, v0

    const/4 v14, 0x1

    new-array v0, v14, [Ljava/lang/Object;

    invoke-virtual {v9}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v14

    move-object/from16 v25, v6

    const/4 v6, 0x0

    aput-object v14, v0, v6

    invoke-static {v12, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    invoke-virtual {v9, v6}, Ljava/lang/StringBuffer;->setLength(I)V

    add-int/lit8 v4, v4, -0x64

    move/from16 v16, v4

    const/16 v0, 0x64

    const/16 v17, 0x1

    goto :goto_9

    :cond_c
    move-object/from16 v24, v0

    move-object/from16 v25, v6

    move/from16 v16, v4

    move v0, v13

    :goto_9
    if-lt v8, v0, :cond_d

    iget-object v0, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    iget-object v0, v0, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-static {v0}, La/a/a/f/b;->d(La/a/a/f/b;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    const-string v4, "INSERT OR REPLACE INTO CL (id,x,y,r,cl,timestamp) VALUES %s;"

    const/4 v6, 0x1

    :try_start_7
    new-array v13, v6, [Ljava/lang/Object;

    invoke-virtual {v10}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v14, 0x0

    aput-object v6, v13, v14

    invoke-static {v4, v13}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    invoke-virtual {v10, v14}, Ljava/lang/StringBuffer;->setLength(I)V

    add-int/lit8 v8, v8, -0x64

    move/from16 v18, v8

    const/16 v0, 0x64

    const/16 v21, 0x1

    goto :goto_a

    :cond_d
    move/from16 v18, v8

    :goto_a
    if-lt v11, v0, :cond_e

    iget-object v0, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    iget-object v0, v0, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-static {v0}, La/a/a/f/b;->d(La/a/a/f/b;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const/4 v4, 0x1

    new-array v6, v4, [Ljava/lang/Object;

    invoke-virtual {v15}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v8, 0x0

    aput-object v4, v6, v8

    invoke-static {v12, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    invoke-virtual {v15, v8}, Ljava/lang/StringBuffer;->setLength(I)V

    add-int/lit8 v19, v11, -0x64

    move-object/from16 v13, v23

    move-object/from16 v0, v24

    move-object/from16 v6, v25

    move-object/from16 v14, v28

    const/4 v4, 0x3

    const/16 v20, 0x1

    goto/16 :goto_4

    :cond_e
    move/from16 v19, v11

    move-object/from16 v13, v23

    move-object/from16 v0, v24

    move-object/from16 v6, v25

    move-object/from16 v14, v28

    const/4 v4, 0x3

    goto/16 :goto_4

    :cond_f
    move-object/from16 v24, v0

    move-object/from16 v25, v6

    if-lez v16, :cond_10

    iget-object v0, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    iget-object v0, v0, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-static {v0}, La/a/a/f/b;->a(La/a/a/f/b;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const/4 v4, 0x1

    new-array v6, v4, [Ljava/lang/Object;

    invoke-virtual {v9}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v8, 0x0

    aput-object v4, v6, v8

    invoke-static {v12, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    :cond_10
    if-lez v18, :cond_11

    iget-object v0, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    iget-object v0, v0, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-static {v0}, La/a/a/f/b;->d(La/a/a/f/b;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    const-string v4, "INSERT OR REPLACE INTO CL (id,x,y,r,cl,timestamp) VALUES %s;"

    const/4 v6, 0x1

    :try_start_8
    new-array v8, v6, [Ljava/lang/Object;

    invoke-virtual {v10}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v9, 0x0

    aput-object v6, v8, v9

    invoke-static {v4, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    :cond_11
    if-lez v19, :cond_13

    iget-object v0, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    iget-object v0, v0, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-static {v0}, La/a/a/f/b;->d(La/a/a/f/b;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const/4 v4, 0x1

    new-array v6, v4, [Ljava/lang/Object;

    invoke-virtual {v15}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v8, 0x0

    aput-object v4, v6, v8

    invoke-static {v12, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_4
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    goto :goto_b

    :cond_12
    move-object/from16 v24, v0

    move-object/from16 v25, v6

    :cond_13
    :goto_b
    const-string v0, "ap"

    if-eqz v5, :cond_1e

    :try_start_9
    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1e

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    invoke-virtual {v4}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v6

    new-instance v8, Ljava/lang/StringBuffer;

    invoke-direct {v8}, Ljava/lang/StringBuffer;-><init>()V

    new-instance v9, Ljava/lang/StringBuffer;

    invoke-direct {v9}, Ljava/lang/StringBuffer;-><init>()V

    new-instance v10, Ljava/lang/StringBuffer;

    invoke-direct {v10}, Ljava/lang/StringBuffer;-><init>()V

    const/4 v11, 0x0

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x1

    const/16 v16, 0x1

    :goto_c
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v17
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_4
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    move-object/from16 v18, v0

    const-string v0, "INSERT OR REPLACE INTO AP (id,x,y,r,cl,timestamp) VALUES %s;"

    move-object/from16 v19, v5

    const-string v5, "DELETE FROM AP WHERE id IN (%s);"

    if-eqz v17, :cond_1b

    :try_start_a
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v20, v6

    move-object/from16 v6, v17

    check-cast v6, Ljava/lang/String;

    move-object/from16 v17, v2

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v21

    const/16 v23, 0x3

    aget-object v21, v21, v23

    invoke-static/range {v21 .. v21}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v21

    if-eqz v12, :cond_14

    move-object/from16 v23, v4

    const/4 v12, 0x0

    goto :goto_d

    :cond_14
    move-object/from16 v23, v4

    const/16 v4, 0x2c

    invoke-virtual {v9, v4}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    :goto_d
    invoke-virtual {v9, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v11, v11, 0x1

    invoke-virtual/range {v21 .. v21}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v26

    const-wide/16 v28, 0x0

    cmpl-double v4, v26, v28

    if-lez v4, :cond_16

    if-eqz v16, :cond_15

    const/16 v16, 0x0

    goto :goto_e

    :cond_15
    const/16 v4, 0x2c

    invoke-virtual {v10, v4}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    :goto_e
    const/16 v4, 0x28

    invoke-virtual {v10, v4}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const/16 v4, 0x2c

    invoke-virtual {v10, v4}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v26

    const-wide/16 v28, 0x3e8

    move-object/from16 v21, v3

    div-long v3, v26, v28

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v10, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const/16 v2, 0x29

    invoke-virtual {v10, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    add-int/lit8 v13, v13, 0x1

    const/16 v2, 0x2c

    goto :goto_10

    :cond_16
    move-object/from16 v21, v3

    if-eqz v15, :cond_17

    const/16 v2, 0x2c

    const/4 v15, 0x0

    goto :goto_f

    :cond_17
    const/16 v2, 0x2c

    invoke-virtual {v8, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    :goto_f
    invoke-virtual {v8, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v14, v14, 0x1

    :goto_10
    const/16 v3, 0x64

    if-lt v11, v3, :cond_18

    iget-object v3, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    iget-object v3, v3, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-static {v3}, La/a/a/f/b;->a(La/a/a/f/b;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3

    const/4 v4, 0x1

    new-array v6, v4, [Ljava/lang/Object;

    invoke-virtual {v9}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v12, 0x0

    aput-object v4, v6, v12

    invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    invoke-virtual {v9, v12}, Ljava/lang/StringBuffer;->setLength(I)V

    add-int/lit8 v11, v11, -0x64

    const/16 v3, 0x64

    const/4 v12, 0x1

    :cond_18
    if-lt v13, v3, :cond_19

    iget-object v4, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    iget-object v4, v4, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-static {v4}, La/a/a/f/b;->d(La/a/a/f/b;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v4

    const/4 v6, 0x1

    new-array v2, v6, [Ljava/lang/Object;

    invoke-virtual {v10}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v3, 0x0

    aput-object v6, v2, v3

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    invoke-virtual {v10, v3}, Ljava/lang/StringBuffer;->setLength(I)V

    add-int/lit8 v13, v13, -0x64

    const/16 v16, 0x1

    :cond_19
    if-lez v14, :cond_1a

    iget-object v0, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    iget-object v0, v0, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-static {v0}, La/a/a/f/b;->d(La/a/a/f/b;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    aput-object v2, v3, v4

    invoke-static {v5, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    :cond_1a
    move-object/from16 v2, v17

    move-object/from16 v0, v18

    move-object/from16 v5, v19

    move-object/from16 v6, v20

    move-object/from16 v3, v21

    move-object/from16 v4, v23

    goto/16 :goto_c

    :cond_1b
    move-object/from16 v17, v2

    if-lez v11, :cond_1c

    iget-object v2, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    iget-object v2, v2, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-static {v2}, La/a/a/f/b;->a(La/a/a/f/b;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Object;

    invoke-virtual {v9}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x0

    aput-object v3, v4, v6

    invoke-static {v5, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    :cond_1c
    if-lez v13, :cond_1d

    iget-object v2, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    iget-object v2, v2, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-static {v2}, La/a/a/f/b;->d(La/a/a/f/b;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Object;

    invoke-virtual {v10}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x0

    aput-object v3, v4, v6

    invoke-static {v0, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    :cond_1d
    if-lez v14, :cond_1f

    iget-object v0, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    iget-object v0, v0, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-static {v0}, La/a/a/f/b;->d(La/a/a/f/b;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    aput-object v2, v3, v4

    invoke-static {v5, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    goto :goto_11

    :cond_1e
    move-object/from16 v18, v0

    move-object/from16 v17, v2

    move-object/from16 v19, v5

    :cond_1f
    :goto_11
    iget-object v0, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    iget-object v0, v0, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-static {v0}, La/a/a/f/b;->d(La/a/a/f/b;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const/4 v2, 0x3

    new-array v3, v2, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v7, v3, v2

    const/4 v2, 0x1

    aput-object v7, v3, v2

    const v2, 0x30d40

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x2

    aput-object v4, v3, v5

    move-object/from16 v4, v17

    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    iget-object v0, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    iget-object v0, v0, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-static {v0}, La/a/a/f/b;->d(La/a/a/f/b;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const/4 v3, 0x3

    new-array v6, v3, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v25, v6, v3

    const/4 v3, 0x1

    aput-object v25, v6, v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v6, v5

    invoke-static {v4, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    iget-object v0, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    iget-object v0, v0, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-static {v0}, La/a/a/f/b;->a(La/a/a/f/b;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_4
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    const-string v2, "DELETE FROM %s WHERE id NOT IN (SELECT id FROM %s ORDER BY frequency DESC LIMIT %d);"

    const/4 v3, 0x3

    :try_start_b
    new-array v4, v3, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v7, v4, v3

    const/4 v3, 0x1

    aput-object v7, v4, v3

    const/16 v3, 0x2710

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v4, v5

    invoke-static {v2, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    iget-object v0, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    iget-object v0, v0, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-static {v0}, La/a/a/f/b;->a(La/a/a/f/b;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_4
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    const-string v2, "DELETE FROM %s WHERE id NOT IN (SELECT id FROM %s ORDER BY frequency DESC LIMIT %d);"

    const/4 v3, 0x3

    :try_start_c
    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v25, v3, v4

    const/4 v4, 0x1

    aput-object v25, v3, v4

    const/16 v4, 0x2710

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    if-eqz v19, :cond_20

    move-object/from16 v0, v18

    move-object/from16 v5, v19

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_20

    move-object/from16 v0, v24

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_20

    iget-object v0, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    invoke-static {v0}, La/a/a/f/b$d;->b(La/a/a/f/b$d;)V

    :cond_20
    iget-object v0, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    iget-object v0, v0, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-static {v0}, La/a/a/f/b;->d(La/a/a/f/b;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    iget-object v0, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    iget-object v0, v0, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-static {v0}, La/a/a/f/b;->a(La/a/a/f/b;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_4
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    :try_start_d
    iget-object v0, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    iget-object v0, v0, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-static {v0}, La/a/a/f/b;->d(La/a/a/f/b;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    if-eqz v0, :cond_21

    iget-object v0, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    iget-object v0, v0, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-static {v0}, La/a/a/f/b;->d(La/a/a/f/b;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z

    move-result v0

    if-eqz v0, :cond_21

    iget-object v0, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    iget-object v0, v0, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-static {v0}, La/a/a/f/b;->d(La/a/a/f/b;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    :cond_21
    iget-object v0, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    iget-object v0, v0, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-static {v0}, La/a/a/f/b;->a(La/a/a/f/b;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    if-eqz v0, :cond_23

    iget-object v0, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    iget-object v0, v0, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-static {v0}, La/a/a/f/b;->a(La/a/a/f/b;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z

    move-result v0

    if-eqz v0, :cond_23

    iget-object v0, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    iget-object v0, v0, La/a/a/f/b$d;->s:La/a/a/f/b;

    :goto_12
    invoke-static {v0}, La/a/a/f/b;->a(La/a/a/f/b;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_5

    goto :goto_13

    :catch_4
    :try_start_e
    iget-object v0, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    invoke-static {v0}, La/a/a/f/b$d;->b(La/a/a/f/b$d;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    :try_start_f
    iget-object v0, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    iget-object v0, v0, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-static {v0}, La/a/a/f/b;->d(La/a/a/f/b;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    if-eqz v0, :cond_22

    iget-object v0, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    iget-object v0, v0, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-static {v0}, La/a/a/f/b;->d(La/a/a/f/b;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z

    move-result v0

    if-eqz v0, :cond_22

    iget-object v0, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    iget-object v0, v0, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-static {v0}, La/a/a/f/b;->d(La/a/a/f/b;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    :cond_22
    iget-object v0, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    iget-object v0, v0, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-static {v0}, La/a/a/f/b;->a(La/a/a/f/b;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    if-eqz v0, :cond_23

    iget-object v0, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    iget-object v0, v0, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-static {v0}, La/a/a/f/b;->a(La/a/a/f/b;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z

    move-result v0

    if-eqz v0, :cond_23

    iget-object v0, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    iget-object v0, v0, La/a/a/f/b$d;->s:La/a/a/f/b;
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_5

    goto :goto_12

    :catch_5
    :cond_23
    :goto_13
    iget-object v0, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    const/4 v1, 0x0

    iput-object v1, v0, La/a/a/i/g;->c:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {v0, v1}, La/a/a/f/b$d;->a(La/a/a/f/b$d;Z)Z

    return-void

    :goto_14
    :try_start_10
    iget-object v2, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    iget-object v2, v2, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-static {v2}, La/a/a/f/b;->d(La/a/a/f/b;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    if-eqz v2, :cond_24

    iget-object v2, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    iget-object v2, v2, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-static {v2}, La/a/a/f/b;->d(La/a/a/f/b;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z

    move-result v2

    if-eqz v2, :cond_24

    iget-object v2, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    iget-object v2, v2, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-static {v2}, La/a/a/f/b;->d(La/a/a/f/b;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    :cond_24
    iget-object v2, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    iget-object v2, v2, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-static {v2}, La/a/a/f/b;->a(La/a/a/f/b;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    if-eqz v2, :cond_25

    iget-object v2, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    iget-object v2, v2, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-static {v2}, La/a/a/f/b;->a(La/a/a/f/b;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z

    move-result v2

    if-eqz v2, :cond_25

    iget-object v2, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    iget-object v2, v2, La/a/a/f/b$d;->s:La/a/a/f/b;

    invoke-static {v2}, La/a/a/f/b;->a(La/a/a/f/b;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_6

    :catch_6
    :cond_25
    iget-object v1, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    const/4 v2, 0x0

    iput-object v2, v1, La/a/a/i/g;->c:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static {v1, v2}, La/a/a/f/b$d;->a(La/a/a/f/b$d;Z)Z

    throw v0

    :cond_26
    :goto_15
    const/4 v2, 0x0

    iget-object v0, v1, La/a/a/f/b$d$a;->b:La/a/a/f/b$d;

    invoke-static {v0, v2}, La/a/a/f/b$d;->a(La/a/a/f/b$d;Z)Z

    return-void
.end method
