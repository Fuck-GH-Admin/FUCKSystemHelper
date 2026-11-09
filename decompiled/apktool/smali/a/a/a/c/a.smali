.class public La/a/a/c/a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/a/a/c/a$a;
    }
.end annotation


# static fields
.field public static g:Ljava/lang/Object;

.field public static h:La/a/a/c/a;

.field public static final i:Ljava/lang/String;

.field public static j:Ljava/util/concurrent/locks/Lock;


# instance fields
.field public a:Landroid/database/sqlite/SQLiteDatabase;

.field public b:Z

.field public c:La/a/a/c/a$a;

.field public d:Ljava/lang/String;

.field public e:D

.field public f:D


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, La/a/a/c/a;->g:Ljava/lang/Object;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, La/a/a/i/i;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/gal.db"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, La/a/a/c/a;->i:Ljava/lang/String;

    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    sput-object v0, La/a/a/c/a;->j:Ljava/util/concurrent/locks/Lock;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, La/a/a/c/a;->a:Landroid/database/sqlite/SQLiteDatabase;

    const/4 v1, 0x0

    iput-boolean v1, p0, La/a/a/c/a;->b:Z

    iput-object v0, p0, La/a/a/c/a;->c:La/a/a/c/a$a;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, La/a/a/c/a;->d:Ljava/lang/String;

    const-wide v0, 0x7fefffffffffffffL    # Double.MAX_VALUE

    iput-wide v0, p0, La/a/a/c/a;->e:D

    iput-wide v0, p0, La/a/a/c/a;->f:D

    return-void
.end method

.method public static synthetic a(La/a/a/c/a;)Landroid/database/sqlite/SQLiteDatabase;
    .locals 0

    iget-object p0, p0, La/a/a/c/a;->a:Landroid/database/sqlite/SQLiteDatabase;

    return-object p0
.end method

.method public static synthetic a(La/a/a/c/a;Z)Z
    .locals 0

    iput-boolean p1, p0, La/a/a/c/a;->b:Z

    return p1
.end method

.method public static synthetic b(La/a/a/c/a;)Z
    .locals 0

    iget-boolean p0, p0, La/a/a/c/a;->b:Z

    return p0
.end method

.method public static synthetic c()Ljava/util/concurrent/locks/Lock;
    .locals 1

    sget-object v0, La/a/a/c/a;->j:Ljava/util/concurrent/locks/Lock;

    return-object v0
.end method

.method public static d()La/a/a/c/a;
    .locals 2

    sget-object v0, La/a/a/c/a;->g:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, La/a/a/c/a;->h:La/a/a/c/a;

    if-nez v1, :cond_0

    new-instance v1, La/a/a/c/a;

    invoke-direct {v1}, La/a/a/c/a;-><init>()V

    sput-object v1, La/a/a/c/a;->h:La/a/a/c/a;

    :cond_0
    sget-object v1, La/a/a/c/a;->h:La/a/a/c/a;

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
.method public a(Lcom/baidu/location/c;)I
    .locals 10

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/baidu/location/c;->z()F

    move-result v3

    invoke-virtual {p1}, Lcom/baidu/location/c;->d()D

    move-result-wide v4

    goto :goto_0

    :cond_0
    move-wide v4, v0

    move v3, v2

    :goto_0
    iget-object v6, p0, La/a/a/c/a;->a:Landroid/database/sqlite/SQLiteDatabase;

    const/4 v7, 0x0

    if-eqz v6, :cond_3

    cmpl-float v2, v3, v2

    if-lez v2, :cond_3

    cmpl-double v0, v4, v0

    if-lez v0, :cond_3

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/baidu/location/c;->t()D

    move-result-wide v0

    invoke-virtual {p1}, Lcom/baidu/location/c;->q()D

    move-result-wide v8

    invoke-virtual {p0, v0, v1, v8, v9}, La/a/a/c/a;->a(DD)[D

    move-result-object p0

    aget-wide p0, p0, v7

    const-wide v0, 0x7fefffffffffffffL    # Double.MAX_VALUE

    cmpl-double v0, p0, v0

    if-eqz v0, :cond_3

    invoke-static {v3, v4, v5, p0, p1}, Lcom/baidu/location/Jni;->a(FDD)D

    move-result-wide p0

    const-wide/high16 v0, 0x4049000000000000L    # 50.0

    cmpl-double v0, p0, v0

    if-lez v0, :cond_1

    const/4 v7, 0x3

    goto :goto_1

    :cond_1
    const-wide/high16 v0, 0x4034000000000000L    # 20.0

    cmpl-double p0, p0, v0

    if-lez p0, :cond_2

    const/4 v7, 0x2

    goto :goto_1

    :cond_2
    const/4 v7, 0x1

    :cond_3
    :goto_1
    return v7
.end method

.method public a()V
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Ljava/io/File;

    sget-object v2, La/a/a/c/a;->i:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z

    :cond_0
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {v1, v0}, Landroid/database/sqlite/SQLiteDatabase;->openOrCreateDatabase(Ljava/io/File;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    iput-object v1, p0, La/a/a/c/a;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v2, "SELECT count(*) FROM sqlite_master WHERE type=\'table\' AND name=\'galdata\'"

    invoke-virtual {v1, v2, v0}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, La/a/a/c/a;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v3, "CREATE TABLE IF NOT EXISTS galdata_new(id CHAR(40) PRIMARY KEY,aldata DOUBLE, sigma DOUBLE,tt INT);"

    :goto_0
    invoke-virtual {v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    iget-object v2, p0, La/a/a/c/a;->a:Landroid/database/sqlite/SQLiteDatabase;

    goto :goto_1

    :cond_1
    iget-object v2, p0, La/a/a/c/a;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v3, "DROP TABLE galdata"

    invoke-virtual {v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    iget-object v2, p0, La/a/a/c/a;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v3, "CREATE TABLE galdata_new(id CHAR(40) PRIMARY KEY,aldata DOUBLE, sigma DOUBLE,tt INT);"

    goto :goto_0

    :goto_1
    const-string v3, "CREATE TABLE IF NOT EXISTS locStateData(id CHAR(40) PRIMARY KEY,state INT);"

    invoke-virtual {v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    :cond_2
    iget-object v2, p0, La/a/a/c/a;->a:Landroid/database/sqlite/SQLiteDatabase;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->setVersion(I)V

    invoke-interface {v1}, Landroid/database/Cursor;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    iput-object v0, p0, La/a/a/c/a;->a:Landroid/database/sqlite/SQLiteDatabase;

    :cond_3
    :goto_2
    return-void
.end method

.method public final a(DDD)V
    .locals 8

    iget-object v0, p0, La/a/a/c/a;->c:La/a/a/c/a$a;

    if-nez v0, :cond_0

    new-instance v0, La/a/a/c/a$a;

    invoke-direct {v0, p0}, La/a/a/c/a$a;-><init>(La/a/a/c/a;)V

    iput-object v0, p0, La/a/a/c/a;->c:La/a/a/c/a$a;

    :cond_0
    iget-object v1, p0, La/a/a/c/a;->c:La/a/a/c/a$a;

    move-wide v2, p1

    move-wide v4, p3

    move-wide v6, p5

    invoke-virtual/range {v1 .. v7}, La/a/a/c/a$a;->a(DDD)V

    return-void
.end method

.method public a(DD)[D
    .locals 19

    move-object/from16 v0, p0

    const/4 v1, 0x2

    new-array v8, v1, [D

    iget-object v2, v0, La/a/a/c/a;->a:Landroid/database/sqlite/SQLiteDatabase;

    const/4 v9, 0x0

    const/4 v10, 0x1

    const-wide v11, 0x7fefffffffffffffL    # Double.MAX_VALUE

    const-wide v13, 0x40c3880000000000L    # 10000.0

    if-eqz v2, :cond_9

    const-wide v2, 0x3fb999999999999aL    # 0.1

    cmpl-double v4, p1, v2

    if-lez v4, :cond_9

    cmpl-double v2, p3, v2

    if-lez v2, :cond_9

    sget-object v2, Ljava/util/Locale;->CHINESE:Ljava/util/Locale;

    new-array v3, v1, [Ljava/lang/Object;

    const-wide/high16 v4, 0x4059000000000000L    # 100.0

    mul-double v6, p1, v4

    invoke-static {v6, v7}, Ljava/lang/Math;->floor(D)D

    move-result-wide v6

    double-to-int v6, v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v3, v9

    mul-double v4, v4, p3

    invoke-static {v4, v5}, Ljava/lang/Math;->floor(D)D

    move-result-wide v4

    double-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v10

    const-string v4, "%d,%d"

    invoke-static {v2, v4, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    iget-object v2, v0, La/a/a/c/a;->d:Ljava/lang/String;

    if-eqz v2, :cond_0

    invoke-virtual {v2, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-wide v11, v0, La/a/a/c/a;->e:D

    iget-wide v0, v0, La/a/a/c/a;->f:D

    move-wide v2, v13

    goto/16 :goto_c

    :cond_0
    sget-object v2, La/a/a/c/a;->j:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->lock()V

    const/4 v2, 0x0

    :try_start_0
    iget-object v3, v0, La/a/a/c/a;->a:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "select * from galdata_new where id = \""

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "\";"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_7
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-eqz v6, :cond_4

    :try_start_1
    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v6, v10}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-interface {v6, v1}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v4
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 v1, 0x3

    :try_start_3
    invoke-interface {v6, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    cmpl-double v7, v2, v13

    if-nez v7, :cond_1

    move-wide v2, v11

    :cond_1
    const-wide/16 v16, 0x0

    cmpg-double v7, v4, v16

    if-gtz v7, :cond_2

    goto :goto_0

    :cond_2
    move-wide v11, v4

    :goto_0
    :try_start_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const-wide/16 v16, 0x3e8

    div-long v4, v4, v16

    int-to-long v9, v1

    sub-long/2addr v4, v9

    iget-boolean v1, v0, La/a/a/c/a;->b:Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-nez v1, :cond_3

    const-wide/32 v9, 0x93a80

    cmp-long v1, v4, v9

    if-lez v1, :cond_3

    const-wide v9, 0x40230ac080000000L    # 9.520999908447266

    move-object/from16 v1, p0

    move-wide v4, v2

    move-wide/from16 v2, p1

    move-wide v13, v4

    move-wide/from16 v4, p3

    move-object/from16 v18, v6

    move-wide v6, v9

    :try_start_5
    invoke-virtual/range {v1 .. v7}, La/a/a/c/a;->a(DDD)V

    goto :goto_1

    :cond_3
    move-wide v13, v2

    move-object/from16 v18, v6

    :goto_1
    iput-object v15, v0, La/a/a/c/a;->d:Ljava/lang/String;

    iput-wide v13, v0, La/a/a/c/a;->e:D

    iput-wide v11, v0, La/a/a/c/a;->f:D
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    move-wide v0, v11

    move-wide v11, v13

    goto :goto_3

    :catch_0
    move-wide v13, v2

    move-object/from16 v18, v6

    :catch_1
    move-wide v4, v11

    move-wide v11, v13

    goto :goto_6

    :catch_2
    move-object/from16 v18, v6

    goto :goto_2

    :catch_3
    move-object/from16 v18, v6

    move-wide v4, v11

    :goto_2
    move-wide v11, v2

    goto :goto_6

    :catchall_0
    move-exception v0

    move-object/from16 v18, v6

    goto :goto_4

    :catch_4
    move-object/from16 v18, v6

    goto :goto_5

    :cond_4
    move-object/from16 v18, v6

    :try_start_6
    iget-boolean v1, v0, La/a/a/c/a;->b:Z

    if-nez v1, :cond_5

    const-wide v6, 0x40230ac080000000L    # 9.520999908447266

    move-object/from16 v1, p0

    move-wide/from16 v2, p1

    move-wide/from16 v4, p3

    invoke-virtual/range {v1 .. v7}, La/a/a/c/a;->a(DDD)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :cond_5
    move-wide v0, v11

    :goto_3
    if-eqz v18, :cond_8

    move-object/from16 v6, v18

    goto :goto_9

    :catchall_1
    move-exception v0

    :goto_4
    move-object/from16 v2, v18

    goto :goto_7

    :catch_5
    :goto_5
    move-wide v4, v11

    :goto_6
    move-object/from16 v2, v18

    goto :goto_8

    :catchall_2
    move-exception v0

    :goto_7
    if-eqz v2, :cond_6

    :try_start_7
    invoke-interface {v2}, Landroid/database/Cursor;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_6

    :catch_6
    :cond_6
    throw v0

    :catch_7
    move-wide v4, v11

    :goto_8
    if-eqz v2, :cond_7

    move-object v6, v2

    move-wide v0, v4

    :goto_9
    :try_start_8
    invoke-interface {v6}, Landroid/database/Cursor;->close()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_8

    goto :goto_a

    :cond_7
    move-wide v0, v4

    :catch_8
    :cond_8
    :goto_a
    sget-object v2, La/a/a/c/a;->j:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_b

    :cond_9
    move-wide v0, v11

    :goto_b
    const-wide v2, 0x40c3880000000000L    # 10000.0

    :goto_c
    cmpl-double v4, v11, v2

    if-lez v4, :cond_a

    const/4 v4, 0x0

    aput-wide v2, v8, v4

    goto :goto_d

    :cond_a
    const/4 v4, 0x0

    aput-wide v11, v8, v4

    :goto_d
    cmpl-double v4, v0, v2

    if-lez v4, :cond_b

    const/4 v4, 0x1

    aput-wide v2, v8, v4

    goto :goto_e

    :cond_b
    const/4 v4, 0x1

    aput-wide v0, v8, v4

    :goto_e
    return-object v8
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, La/a/a/c/a;->a:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catch_0
    iput-object v1, p0, La/a/a/c/a;->a:Landroid/database/sqlite/SQLiteDatabase;

    goto :goto_0

    :catchall_0
    move-exception v0

    iput-object v1, p0, La/a/a/c/a;->a:Landroid/database/sqlite/SQLiteDatabase;

    throw v0

    :cond_0
    :goto_0
    return-void
.end method
