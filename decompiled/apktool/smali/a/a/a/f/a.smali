.class public final La/a/a/f/a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/a/a/f/a$b;,
        La/a/a/f/a$c;
    }
.end annotation


# static fields
.field public static l:La/a/a/f/a;

.field public static final m:Ljava/lang/String;

.field public static final n:Ljava/lang/String;


# instance fields
.field public a:Ljava/lang/String;

.field public b:Z

.field public c:Z

.field public d:D

.field public e:D

.field public f:D

.field public g:D

.field public h:D

.field public volatile i:Z

.field public j:Landroid/os/Handler;

.field public k:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    sget-object v0, La/a/a/i/h;->a:Ljava/lang/String;

    sput-object v0, La/a/a/f/a;->m:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, La/a/a/i/h;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/ls.db"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, La/a/a/f/a;->n:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, La/a/a/f/a;->a:Ljava/lang/String;

    const/4 v1, 0x0

    iput-boolean v1, p0, La/a/a/f/a;->b:Z

    iput-boolean v1, p0, La/a/a/f/a;->c:Z

    const-wide/16 v2, 0x0

    iput-wide v2, p0, La/a/a/f/a;->d:D

    iput-wide v2, p0, La/a/a/f/a;->e:D

    iput-wide v2, p0, La/a/a/f/a;->f:D

    iput-wide v2, p0, La/a/a/f/a;->g:D

    iput-wide v2, p0, La/a/a/f/a;->h:D

    iput-boolean v1, p0, La/a/a/f/a;->i:Z

    iput-object v0, p0, La/a/a/f/a;->j:Landroid/os/Handler;

    iput-boolean v1, p0, La/a/a/f/a;->k:Z

    invoke-virtual {p0}, La/a/a/f/a;->b()V

    return-void
.end method

.method public static synthetic a(La/a/a/f/a;)V
    .locals 0

    invoke-virtual {p0}, La/a/a/f/a;->a()V

    return-void
.end method

.method public static synthetic a(La/a/a/f/a;La/a/a/g/k;Lcom/baidu/location/c;Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, La/a/a/f/a;->a(La/a/a/g/k;Lcom/baidu/location/c;Landroid/database/sqlite/SQLiteDatabase;)V

    return-void
.end method

.method public static synthetic a(La/a/a/f/a;Ljava/lang/String;La/a/a/g/a;Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, La/a/a/f/a;->a(Ljava/lang/String;La/a/a/g/a;Landroid/database/sqlite/SQLiteDatabase;)V

    return-void
.end method

.method public static synthetic a(La/a/a/f/a;Z)Z
    .locals 0

    iput-boolean p1, p0, La/a/a/f/a;->i:Z

    return p1
.end method

.method public static synthetic d()Ljava/lang/String;
    .locals 1

    sget-object v0, La/a/a/f/a;->n:Ljava/lang/String;

    return-object v0
.end method

.method public static declared-synchronized e()La/a/a/f/a;
    .locals 2

    const-class v0, La/a/a/f/a;

    monitor-enter v0

    :try_start_0
    sget-object v1, La/a/a/f/a;->l:La/a/a/f/a;

    if-nez v1, :cond_0

    new-instance v1, La/a/a/f/a;

    invoke-direct {v1}, La/a/a/f/a;-><init>()V

    sput-object v1, La/a/a/f/a;->l:La/a/a/f/a;

    :cond_0
    sget-object v1, La/a/a/f/a;->l:La/a/a/f/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/util/List;Z)Lcom/baidu/location/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroid/net/wifi/ScanResult;",
            ">;Z)",
            "Lcom/baidu/location/c;"
        }
    .end annotation

    iget-boolean p3, p0, La/a/a/f/a;->k:Z

    const-string v0, "\",\"error\":\"67\"}}"

    const-string v1, "{\"result\":{\"time\":\""

    if-nez p3, :cond_0

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, La/a/a/i/i;->i()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Lcom/baidu/location/c;

    invoke-direct {p1, p0}, Lcom/baidu/location/c;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_0
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, La/a/a/i/i;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    :try_start_0
    invoke-virtual {p0, p1, p2}, La/a/a/f/a;->a(Ljava/lang/String;Ljava/util/List;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, La/a/a/f/a;->a(Z)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_1

    move-object p3, p0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    :goto_0
    new-instance p0, Lcom/baidu/location/c;

    invoke-direct {p0, p3}, Lcom/baidu/location/c;-><init>(Ljava/lang/String;)V

    return-object p0
.end method

.method public final a(Z)Ljava/lang/String;
    .locals 17

    move-object/from16 v0, p0

    iget-boolean v1, v0, La/a/a/f/a;->c:Z

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v1, :cond_0

    iget-wide v2, v0, La/a/a/f/a;->g:D

    iget-wide v0, v0, La/a/a/f/a;->h:D

    const-wide v6, 0x406ecccccccccccdL    # 246.4

    move v8, v5

    move v9, v8

    move-wide v15, v2

    move-wide v2, v6

    move-wide v6, v15

    goto :goto_0

    :cond_0
    iget-boolean v1, v0, La/a/a/f/a;->b:Z

    if-eqz v1, :cond_1

    iget-wide v2, v0, La/a/a/f/a;->e:D

    iget-wide v6, v0, La/a/a/f/a;->f:D

    iget-wide v0, v0, La/a/a/f/a;->d:D

    move v8, v5

    move v9, v8

    move-wide v15, v0

    move-wide v0, v6

    move-wide v6, v2

    move-wide v2, v15

    goto :goto_0

    :cond_1
    move-wide v0, v2

    move-wide v6, v0

    move v8, v4

    move v9, v8

    :goto_0
    const-string v10, "{\"result\":{\"time\":\""

    if-eqz v8, :cond_3

    const/4 v8, 0x3

    const/4 v11, 0x2

    const/4 v12, 0x4

    const-string v13, "\",\"error\":\"66\"},\"content\":{\"point\":{\"x\":\"%f\",\"y\":\"%f\"},\"radius\":\"%f\",\"isCellChanged\":\"%b\"}}"

    if-eqz p1, :cond_2

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, La/a/a/i/i;->i()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    sget-object v10, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    new-array v12, v12, [Ljava/lang/Object;

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    aput-object v6, v12, v4

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    aput-object v0, v12, v5

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    aput-object v0, v12, v11

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    aput-object v0, v12, v8

    invoke-static {v10, v9, v12}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_2
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, La/a/a/i/i;->i()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    sget-object v13, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    new-array v12, v12, [Ljava/lang/Object;

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    aput-object v6, v12, v4

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    aput-object v0, v12, v5

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    aput-object v0, v12, v11

    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    aput-object v0, v12, v8

    invoke-static {v13, v10, v12}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    if-eqz p1, :cond_4

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, La/a/a/i/i;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\",\"error\":\"67\"}}"

    goto :goto_1

    :cond_4
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, La/a/a/i/i;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\",\"error\":\"63\"}}"

    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_2
    return-object v0
.end method

.method public final a()V
    .locals 9

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, La/a/a/f/a;->n:Ljava/lang/String;

    invoke-static {v1, v0}, Landroid/database/sqlite/SQLiteDatabase;->openOrCreateDatabase(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v1, v0

    :goto_0
    if-nez v1, :cond_0

    return-void

    :cond_0
    :try_start_1
    const-string v2, "wof"

    invoke-static {v1, v2}, Landroid/database/DatabaseUtils;->queryNumEntries(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)J

    move-result-wide v2

    const-string v4, "bdcltb09"

    invoke-static {v1, v4}, Landroid/database/DatabaseUtils;->queryNumEntries(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)J

    move-result-wide v4

    const-wide/16 v6, 0x2710

    cmp-long v2, v2, v6

    const/4 v3, 0x1

    const/4 v8, 0x0

    if-lez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    move v2, v8

    :goto_1
    cmp-long v4, v4, v6

    if-lez v4, :cond_2

    move v4, v3

    goto :goto_2

    :cond_2
    move v4, v8

    :goto_2
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    if-nez v2, :cond_3

    if-eqz v4, :cond_4

    :cond_3
    new-instance v1, La/a/a/f/a$b;

    invoke-direct {v1, p0, v0}, La/a/a/f/a$b;-><init>(La/a/a/f/a;La/a/a/f/a$a;)V

    const/4 p0, 0x2

    new-array p0, p0, [Ljava/lang/Boolean;

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    aput-object v0, p0, v8

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    aput-object v0, p0, v3

    invoke-virtual {v1, p0}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_4
    return-void
.end method

.method public final a(La/a/a/g/k;Lcom/baidu/location/c;Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 28

    move-object/from16 v0, p1

    move-object/from16 v1, p3

    if-eqz p2, :cond_a

    invoke-virtual/range {p2 .. p2}, Lcom/baidu/location/c;->r()I

    move-result v2

    const/16 v3, 0xa1

    if-ne v2, v3, :cond_a

    invoke-virtual/range {p2 .. p2}, Lcom/baidu/location/c;->v()Ljava/lang/String;

    move-result-object v2

    const-string v3, "wf"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual/range {p2 .. p2}, Lcom/baidu/location/c;->z()F

    move-result v2

    const/high16 v3, 0x43960000    # 300.0f

    cmpg-float v2, v2, v3

    if-ltz v2, :cond_0

    goto/16 :goto_5

    :cond_0
    iget-object v2, v0, La/a/a/g/k;->a:Ljava/util/List;

    if-nez v2, :cond_1

    return-void

    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const/16 v4, 0x1c

    shr-long/2addr v2, v4

    long-to-int v2, v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    iget-object v0, v0, La/a/a/g/k;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/net/wifi/ScanResult;

    iget v6, v5, Landroid/net/wifi/ScanResult;->level:I

    if-nez v6, :cond_2

    goto :goto_0

    :cond_2
    add-int/lit8 v4, v4, 0x1

    const/4 v6, 0x6

    if-le v4, v6, :cond_3

    goto/16 :goto_5

    :cond_3
    new-instance v6, Landroid/content/ContentValues;

    invoke-direct {v6}, Landroid/content/ContentValues;-><init>()V

    iget-object v5, v5, Landroid/net/wifi/ScanResult;->BSSID:Ljava/lang/String;

    const-string v7, ":"

    const-string v8, ""

    invoke-virtual {v5, v7, v8}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/baidu/location/Jni;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v7, "select * from wof where id = ?"

    const/4 v8, 0x1

    :try_start_0
    new-array v9, v8, [Ljava/lang/String;

    aput-object v5, v9, v3

    invoke-virtual {v1, v7, v9}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v7

    const-wide/16 v9, 0x0

    const-wide v11, 0x407b01fb15b573ebL    # 432.1238

    const-wide v13, 0x405c4f089a027525L    # 113.2349

    if-eqz v7, :cond_4

    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v15

    if-eqz v15, :cond_4

    invoke-interface {v7, v8}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v9

    sub-double/2addr v9, v13

    const/4 v15, 0x2

    invoke-interface {v7, v15}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v15

    sub-double/2addr v15, v11

    const/4 v3, 0x4

    invoke-interface {v7, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v3

    const/4 v8, 0x5

    invoke-interface {v7, v8}, Landroid/database/Cursor;->getInt(I)I

    move-result v8

    move-wide/from16 v26, v9

    move-wide/from16 v24, v15

    move v9, v8

    move v8, v3

    const/4 v3, 0x1

    goto :goto_1

    :cond_4
    move-wide/from16 v24, v9

    move-wide/from16 v26, v24

    const/4 v3, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_1
    if-eqz v7, :cond_5

    invoke-interface {v7}, Landroid/database/Cursor;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_5
    const-string v10, "wof"

    const-string v15, "ac"

    const-string v7, "cc"

    const-string v11, "bc"

    const-string v12, "time"

    const-string v13, "mktime"

    if-nez v3, :cond_6

    :try_start_1
    invoke-virtual/range {p2 .. p2}, Lcom/baidu/location/c;->t()D

    move-result-wide v8

    const-wide v16, 0x405c4f089a027525L    # 113.2349

    add-double v8, v8, v16

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {v6, v13, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    invoke-virtual/range {p2 .. p2}, Lcom/baidu/location/c;->q()D

    move-result-wide v8

    const-wide v13, 0x407b01fb15b573ebL    # 432.1238

    add-double/2addr v8, v13

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {v6, v12, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v6, v11, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v6, v7, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v6, v15, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v3, "id"

    invoke-virtual {v6, v3, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, 0x0

    invoke-virtual {v1, v10, v3, v6}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    goto :goto_2

    :cond_6
    if-nez v9, :cond_7

    :catch_0
    :goto_2
    move/from16 p0, v4

    goto/16 :goto_4

    :cond_7
    const/4 v3, 0x1

    new-array v14, v3, [F

    invoke-virtual/range {p2 .. p2}, Lcom/baidu/location/c;->q()D

    move-result-wide v19

    invoke-virtual/range {p2 .. p2}, Lcom/baidu/location/c;->t()D

    move-result-wide v21

    move-object v3, v15

    move-wide/from16 v15, v24

    move-wide/from16 v17, v26

    move-object/from16 v23, v14

    invoke-static/range {v15 .. v23}, Landroid/location/Location;->distanceBetween(DDDD[F)V

    const/4 v15, 0x0

    aget v14, v14, v15

    const v16, 0x44bb8000    # 1500.0f

    cmpl-float v14, v14, v16

    if-lez v14, :cond_9

    add-int/lit8 v9, v9, 0x1

    const/16 v14, 0xa

    if-le v9, v14, :cond_8

    mul-int/lit8 v8, v8, 0x3

    if-le v9, v8, :cond_8

    invoke-virtual/range {p2 .. p2}, Lcom/baidu/location/c;->t()D

    move-result-wide v8

    const-wide v16, 0x405c4f089a027525L    # 113.2349

    add-double v8, v8, v16

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v8

    invoke-virtual {v6, v13, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    invoke-virtual/range {p2 .. p2}, Lcom/baidu/location/c;->q()D

    move-result-wide v8

    const-wide v13, 0x407b01fb15b573ebL    # 432.1238

    add-double/2addr v8, v13

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v8

    invoke-virtual {v6, v12, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    const/4 v8, 0x1

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v6, v11, v9}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    move-object v15, v3

    move/from16 p0, v4

    move-object v3, v7

    goto :goto_3

    :cond_8
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move/from16 p0, v4

    move-object v15, v7

    goto :goto_3

    :cond_9
    move-object/from16 p1, v3

    move/from16 p0, v4

    int-to-double v3, v8

    mul-double v26, v26, v3

    :try_start_2
    invoke-virtual/range {p2 .. p2}, Lcom/baidu/location/c;->t()D

    move-result-wide v16

    add-double v26, v26, v16

    add-int/lit8 v8, v8, 0x1

    int-to-double v14, v8

    div-double v26, v26, v14

    mul-double v24, v24, v3

    invoke-virtual/range {p2 .. p2}, Lcom/baidu/location/c;->q()D

    move-result-wide v3

    add-double v24, v24, v3

    div-double v24, v24, v14

    const-wide v3, 0x405c4f089a027525L    # 113.2349

    add-double v26, v26, v3

    invoke-static/range {v26 .. v27}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {v6, v13, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    const-wide v3, 0x407b01fb15b573ebL    # 432.1238

    add-double v24, v24, v3

    invoke-static/range {v24 .. v25}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {v6, v12, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v6, v11, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    move-object/from16 v15, p1

    :goto_3
    invoke-virtual {v6, v15, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "id = \""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v1, v10, v6, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    :goto_4
    move/from16 v4, p0

    const/4 v3, 0x0

    goto/16 :goto_0

    :cond_a
    :goto_5
    return-void
.end method

.method public a(Ljava/lang/String;La/a/a/g/a;La/a/a/g/k;Lcom/baidu/location/c;)V
    .locals 5

    iget-boolean v0, p0, La/a/a/f/a;->k:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p2}, La/a/a/g/a;->e()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    invoke-static {}, La/a/a/b/o;->q()La/a/a/b/o;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/b/o;->e()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    move v0, v1

    goto :goto_1

    :cond_2
    :goto_0
    move v0, v2

    :goto_1
    if-eqz p4, :cond_4

    invoke-virtual {p4}, Lcom/baidu/location/c;->r()I

    move-result v3

    const/16 v4, 0xa1

    if-ne v3, v4, :cond_4

    invoke-virtual {p4}, Lcom/baidu/location/c;->v()Ljava/lang/String;

    move-result-object v3

    const-string v4, "wf"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual {p4}, Lcom/baidu/location/c;->z()F

    move-result v3

    const/high16 v4, 0x43960000    # 300.0f

    cmpg-float v3, v3, v4

    if-ltz v3, :cond_3

    goto :goto_2

    :cond_3
    move v3, v1

    goto :goto_3

    :cond_4
    :goto_2
    move v3, v2

    :goto_3
    iget-object v4, p3, La/a/a/g/k;->a:Ljava/util/List;

    if-nez v4, :cond_5

    move v3, v2

    :cond_5
    if-eqz v0, :cond_6

    if-eqz v3, :cond_6

    return-void

    :cond_6
    iget-boolean v0, p0, La/a/a/f/a;->i:Z

    if-eqz v0, :cond_7

    return-void

    :cond_7
    iput-boolean v2, p0, La/a/a/f/a;->i:Z

    new-instance v0, La/a/a/f/a$c;

    const/4 v3, 0x0

    invoke-direct {v0, p0, v3}, La/a/a/f/a$c;-><init>(La/a/a/f/a;La/a/a/f/a$a;)V

    const/4 p0, 0x4

    new-array p0, p0, [Ljava/lang/Object;

    aput-object p1, p0, v1

    aput-object p2, p0, v2

    const/4 p1, 0x2

    aput-object p3, p0, p1

    const/4 p1, 0x3

    aput-object p4, p0, p1

    invoke-virtual {v0, p0}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method public final a(Ljava/lang/String;La/a/a/g/a;Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 20

    move-object/from16 v0, p3

    const-string v1, "clf"

    invoke-virtual/range {p2 .. p2}, La/a/a/g/a;->e()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-static {}, La/a/a/b/o;->q()La/a/a/b/o;

    move-result-object v2

    invoke-virtual {v2}, La/a/a/b/o;->e()Z

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    const/4 v2, 0x0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    const/16 v5, 0x1c

    shr-long/2addr v3, v5

    long-to-int v3, v3

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v4

    move-object/from16 v5, p2

    invoke-virtual {v4, v5}, La/a/a/g/f;->d(La/a/a/g/a;)Ljava/lang/String;

    move-result-object v4

    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    move-object/from16 v6, p1

    invoke-direct {v5, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v6, "result"

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    const-string v7, "error"

    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v7, 0xa1

    const-string v8, "\""

    const/4 v9, 0x0

    const-string v10, "id = \""

    const/4 v11, 0x1

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const-string v15, "bdcltb09"

    if-ne v6, v7, :cond_2

    :try_start_1
    const-string v6, "content"

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    invoke-virtual {v5, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-virtual {v5, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "0"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v1, "point"

    invoke-virtual {v5, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "x"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v6

    const-string v2, "y"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v1

    const-string v11, "radius"

    invoke-virtual {v5, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    move-wide v12, v6

    goto :goto_0

    :cond_1
    const-string v2, "\\|"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    aget-object v2, v1, v9

    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v5

    aget-object v2, v1, v11

    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v11

    const/4 v2, 0x2

    aget-object v1, v1, v2

    move-wide/from16 v18, v5

    move-object v5, v1

    move-wide v1, v11

    move-wide/from16 v12, v18

    :goto_0
    invoke-static {v5}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v5

    move-wide/from16 v18, v1

    move v2, v5

    move-wide v5, v12

    move-wide/from16 v12, v18

    goto :goto_1

    :cond_2
    const/16 v1, 0xa7

    if-ne v6, v1, :cond_3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v15, v1, v14}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :cond_3
    move v9, v11

    move-wide v5, v12

    :goto_1
    if-eqz v9, :cond_4

    return-void

    :cond_4
    const-wide v16, 0x40934dbaacd9e83eL    # 1235.4323

    add-double v5, v5, v16

    const-wide v16, 0x40a27ea4b5dcc63fL    # 2367.3217

    add-double v12, v12, v16

    const v1, 0x45873000    # 4326.0f

    add-float/2addr v2, v1

    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    const-string v6, "time"

    invoke-virtual {v1, v6, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const-string v5, "tag"

    invoke-virtual {v1, v5, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Float;)V

    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const-string v5, "type"

    invoke-virtual {v1, v5, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "ac"

    invoke-virtual {v1, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    :try_start_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v15, v1, v2, v14}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v2

    if-gtz v2, :cond_5

    const-string v2, "id"

    invoke-virtual {v1, v2, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v15, v14, v1}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    :cond_5
    :goto_2
    return-void
.end method

.method public final a(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 6

    if-eqz p1, :cond_3

    iget-object v0, p0, La/a/a/f/a;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, La/a/a/f/a;->b:Z

    const/4 v1, 0x0

    const-string v2, "select * from bdcltb09 where id = ?"

    const/4 v3, 0x1

    :try_start_0
    new-array v4, v3, [Ljava/lang/String;

    aput-object p1, v4, v0

    invoke-virtual {p2, v2, v4}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    iput-object p1, p0, La/a/a/f/a;->a:Ljava/lang/String;

    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-interface {v1, v3}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide p1

    const-wide v4, 0x40934dbaacd9e83eL    # 1235.4323

    sub-double/2addr p1, v4

    iput-wide p1, p0, La/a/a/f/a;->e:D

    const/4 p1, 0x2

    invoke-interface {v1, p1}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide p1

    const-wide v4, 0x40b0e60000000000L    # 4326.0

    sub-double/2addr p1, v4

    iput-wide p1, p0, La/a/a/f/a;->d:D

    const/4 p1, 0x3

    invoke-interface {v1, p1}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide p1

    const-wide v4, 0x40a27ea4b5dcc63fL    # 2367.3217

    sub-double/2addr p1, v4

    iput-wide p1, p0, La/a/a/f/a;->f:D

    iput-boolean v3, p0, La/a/a/f/a;->b:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    if-eqz v1, :cond_3

    goto :goto_0

    :catchall_0
    move-exception p0

    if-eqz v1, :cond_2

    :try_start_1
    invoke-interface {v1}, Landroid/database/Cursor;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :cond_2
    throw p0

    :catch_1
    if-eqz v1, :cond_3

    :goto_0
    :try_start_2
    invoke-interface {v1}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :cond_3
    :goto_1
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroid/net/wifi/ScanResult;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    iput-boolean v0, p0, La/a/a/f/a;->b:Z

    iput-boolean v0, p0, La/a/a/f/a;->c:Z

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, La/a/a/f/a;->n:Ljava/lang/String;

    invoke-static {v1, v0}, Landroid/database/sqlite/SQLiteDatabase;->openOrCreateDatabase(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    if-eqz p1, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, v0}, La/a/a/f/a;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase;)V

    :cond_0
    if-eqz p2, :cond_1

    if-eqz v0, :cond_1

    invoke-virtual {p0, p2, v0}, La/a/a/f/a;->a(Ljava/util/List;Landroid/database/sqlite/SQLiteDatabase;)V

    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z

    move-result p0

    if-eqz p0, :cond_2

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_2
    return-void
.end method

.method public final a(Ljava/util/List;Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/net/wifi/ScanResult;",
            ">;",
            "Landroid/database/sqlite/SQLiteDatabase;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    const/4 v2, 0x0

    iput-boolean v2, v0, La/a/a/f/a;->c:Z

    if-eqz p1, :cond_12

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v3

    if-nez v3, :cond_0

    goto/16 :goto_c

    :cond_0
    if-eqz v1, :cond_12

    if-nez p1, :cond_1

    goto/16 :goto_c

    :cond_1
    const/16 v3, 0x8

    new-array v4, v3, [D

    new-instance v5, Ljava/lang/StringBuffer;

    invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move v7, v2

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/net/wifi/ScanResult;

    const/16 v9, 0xa

    if-le v7, v9, :cond_2

    goto :goto_1

    :cond_2
    if-lez v7, :cond_3

    const-string v9, ","

    invoke-virtual {v5, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_3
    add-int/lit8 v7, v7, 0x1

    iget-object v8, v8, Landroid/net/wifi/ScanResult;->BSSID:Ljava/lang/String;

    const-string v9, ":"

    const-string v10, ""

    invoke-virtual {v8, v9, v10}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/baidu/location/Jni;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "\""

    invoke-virtual {v5, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v5, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v5, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    :cond_4
    :goto_1
    const/4 v6, 0x0

    :try_start_0
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "select * from wof where id in ("

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ");"

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5, v6}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-eqz v1, :cond_10

    const-wide/16 v7, 0x0

    move v1, v2

    move v5, v1

    move v11, v5

    move v12, v11

    move-wide v9, v7

    :goto_2
    invoke-interface {v6}, Landroid/database/Cursor;->isAfterLast()Z

    move-result v13

    const/4 v14, 0x1

    if-nez v13, :cond_f

    invoke-interface {v6, v14}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v15

    const-wide v17, 0x405c4f089a027525L    # 113.2349

    sub-double v15, v15, v17

    const/4 v13, 0x2

    invoke-interface {v6, v13}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v17

    const-wide v19, 0x407b01fb15b573ebL    # 432.1238

    sub-double v17, v17, v19

    const/4 v13, 0x4

    invoke-interface {v6, v13}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    const/4 v13, 0x5

    invoke-interface {v6, v13}, Landroid/database/Cursor;->getInt(I)I

    move-result v13

    if-le v13, v3, :cond_5

    if-le v13, v2, :cond_5

    move-object/from16 v28, v4

    goto :goto_3

    :cond_5
    iget-boolean v2, v0, La/a/a/f/a;->b:Z

    if-eqz v2, :cond_7

    new-array v2, v14, [F

    move-object/from16 v28, v4

    iget-wide v3, v0, La/a/a/f/a;->f:D

    iget-wide v13, v0, La/a/a/f/a;->e:D

    move-wide/from16 v19, v17

    move-wide/from16 v21, v15

    move-wide/from16 v23, v3

    move-wide/from16 v25, v13

    move-object/from16 v27, v2

    invoke-static/range {v19 .. v27}, Landroid/location/Location;->distanceBetween(DDDD[F)V

    const/4 v3, 0x0

    aget v2, v2, v3

    float-to-double v2, v2

    iget-wide v13, v0, La/a/a/f/a;->d:D

    const-wide v19, 0x409f400000000000L    # 2000.0

    add-double v13, v13, v19

    cmpl-double v2, v2, v13

    if-lez v2, :cond_6

    goto :goto_3

    :cond_6
    add-double/2addr v7, v15

    add-double v9, v9, v17

    add-int/lit8 v12, v12, 0x1

    const/4 v1, 0x1

    goto :goto_4

    :cond_7
    move-object/from16 v28, v4

    const/high16 v2, 0x447a0000    # 1000.0f

    if-eqz v1, :cond_9

    const/4 v3, 0x1

    new-array v4, v3, [F

    int-to-double v13, v12

    div-double v23, v9, v13

    div-double v25, v7, v13

    move-wide/from16 v19, v17

    move-wide/from16 v21, v15

    move-object/from16 v27, v4

    invoke-static/range {v19 .. v27}, Landroid/location/Location;->distanceBetween(DDDD[F)V

    const/4 v3, 0x0

    aget v4, v4, v3

    cmpl-float v2, v4, v2

    if-lez v2, :cond_8

    :goto_3
    const/16 v2, 0x8

    const/4 v14, 0x0

    goto :goto_9

    :cond_8
    :goto_4
    const/16 v2, 0x8

    const/4 v3, 0x4

    :goto_5
    const/4 v14, 0x0

    goto :goto_8

    :cond_9
    if-nez v5, :cond_a

    add-int/lit8 v2, v11, 0x1

    aput-wide v15, v28, v11

    add-int/lit8 v11, v2, 0x1

    aput-wide v17, v28, v2

    const/16 v2, 0x8

    const/4 v3, 0x4

    const/4 v5, 0x1

    goto :goto_5

    :cond_a
    const/4 v3, 0x0

    :goto_6
    if-ge v3, v11, :cond_c

    const/4 v4, 0x1

    new-array v13, v4, [F

    add-int/lit8 v4, v3, 0x1

    aget-wide v23, v28, v4

    aget-wide v25, v28, v3

    move-wide/from16 v19, v17

    move-wide/from16 v21, v15

    move-object/from16 v27, v13

    invoke-static/range {v19 .. v27}, Landroid/location/Location;->distanceBetween(DDDD[F)V

    const/4 v14, 0x0

    aget v13, v13, v14

    cmpg-float v13, v13, v2

    if-gez v13, :cond_b

    aget-wide v19, v28, v3

    add-double v7, v7, v19

    aget-wide v19, v28, v4

    add-double v9, v9, v19

    add-int/lit8 v12, v12, 0x1

    const/4 v1, 0x1

    :cond_b
    add-int/lit8 v3, v3, 0x2

    goto :goto_6

    :cond_c
    const/4 v14, 0x0

    if-eqz v1, :cond_d

    add-double/2addr v7, v15

    add-double v9, v9, v17

    add-int/lit8 v12, v12, 0x1

    const/16 v2, 0x8

    :goto_7
    const/4 v3, 0x4

    goto :goto_8

    :cond_d
    const/16 v2, 0x8

    if-ge v11, v2, :cond_f

    add-int/lit8 v3, v11, 0x1

    aput-wide v15, v28, v11

    add-int/lit8 v11, v3, 0x1

    aput-wide v17, v28, v3

    goto :goto_7

    :goto_8
    if-le v12, v3, :cond_e

    goto :goto_a

    :cond_e
    :goto_9
    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z

    move v3, v2

    move v2, v14

    move-object/from16 v4, v28

    goto/16 :goto_2

    :cond_f
    :goto_a
    if-lez v12, :cond_10

    const/4 v1, 0x1

    iput-boolean v1, v0, La/a/a/f/a;->c:Z

    int-to-double v1, v12

    div-double/2addr v7, v1

    iput-wide v7, v0, La/a/a/f/a;->g:D

    div-double/2addr v9, v1

    iput-wide v9, v0, La/a/a/f/a;->h:D
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_10
    if-eqz v6, :cond_12

    goto :goto_b

    :catchall_0
    move-exception v0

    if-eqz v6, :cond_11

    :try_start_1
    invoke-interface {v6}, Landroid/database/Cursor;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :cond_11
    throw v0

    :catch_1
    if-eqz v6, :cond_12

    :goto_b
    :try_start_2
    invoke-interface {v6}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :cond_12
    :goto_c
    return-void
.end method

.method public b(Z)Lcom/baidu/location/c;
    .locals 9

    iget-boolean p1, p0, La/a/a/f/a;->k:Z

    if-nez p1, :cond_0

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "{\"result\":{\"time\":\""

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, La/a/a/i/i;->i()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\",\"error\":\"67\"}}"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Lcom/baidu/location/c;

    invoke-direct {p1, p0}, Lcom/baidu/location/c;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_0
    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object p1

    invoke-virtual {p1}, La/a/a/g/f;->a()La/a/a/g/a;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, La/a/a/g/a;->d()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v1

    invoke-virtual {v1, p1}, La/a/a/g/f;->d(La/a/a/g/a;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v2

    invoke-virtual {v2}, La/a/a/g/f;->j()La/a/a/g/k;

    move-result-object v2

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    iget-object v0, v2, La/a/a/g/k;->a:Ljava/util/List;

    invoke-virtual {p0, v1, v0, v3}, La/a/a/f/a;->a(Ljava/lang/String;Ljava/util/List;Z)Lcom/baidu/location/c;

    move-result-object v0

    :cond_2
    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/baidu/location/c;->r()I

    move-result p0

    const/16 v1, 0x42

    if-ne p0, v1, :cond_5

    new-instance p0, Ljava/lang/StringBuffer;

    const/16 v1, 0x400

    invoke-direct {p0, v1}, Ljava/lang/StringBuffer;-><init>(I)V

    sget-object v1, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/baidu/location/c;->q()D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-virtual {v0}, Lcom/baidu/location/c;->t()D

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    aput-object v5, v4, v3

    invoke-virtual {v0}, Lcom/baidu/location/c;->z()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const/4 v5, 0x2

    aput-object v3, v4, v5

    const-string v3, "&ofl=%f|%f|%f"

    invoke-static {v1, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, La/a/a/g/k;->c()I

    move-result v1

    if-lez v1, :cond_3

    const-string v1, "&wf="

    invoke-virtual {p0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v1

    const/16 v3, 0xf

    invoke-virtual {v1, v3, v2}, La/a/a/g/f;->b(ILa/a/a/g/k;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_3
    if-eqz p1, :cond_4

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v1

    invoke-virtual {v1, p1}, La/a/a/g/f;->a(La/a/a/g/a;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_4
    const-string p1, "&uptype=oldoff"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-static {}, Lcom/baidu/location/f;->c()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, La/a/a/i/i;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-static {}, La/a/a/i/b;->e()La/a/a/i/b;

    move-result-object p1

    invoke-virtual {p1, v6}, La/a/a/i/b;->a(Z)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-static {}, La/a/a/b/c;->h()La/a/a/b/c;

    move-result-object p1

    invoke-virtual {p1}, La/a/a/b/c;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    :cond_5
    return-object v0
.end method

.method public b()V
    .locals 3

    :try_start_0
    new-instance v0, Ljava/io/File;

    sget-object v1, La/a/a/f/a;->m:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v1, Ljava/io/File;

    sget-object v2, La/a/a/f/a;->n:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    :cond_0
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z

    :cond_1
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    invoke-static {v1, v0}, Landroid/database/sqlite/SQLiteDatabase;->openOrCreateDatabase(Ljava/io/File;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "CREATE TABLE IF NOT EXISTS bdcltb09(id CHAR(40) PRIMARY KEY,time DOUBLE,tag DOUBLE, type DOUBLE , ac INT);"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v1, "CREATE TABLE IF NOT EXISTS wof(id CHAR(15) PRIMARY KEY,mktime DOUBLE,time DOUBLE, ac INT, bc INT, cc INT);"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Landroid/database/sqlite/SQLiteDatabase;->setVersion(I)V

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_2
    iput-boolean v2, p0, La/a/a/f/a;->k:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const/4 v0, 0x0

    iput-boolean v0, p0, La/a/a/f/a;->k:Z

    :goto_0
    return-void
.end method

.method public c()V
    .locals 4

    iget-object v0, p0, La/a/a/f/a;->j:Landroid/os/Handler;

    if-nez v0, :cond_0

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, La/a/a/f/a;->j:Landroid/os/Handler;

    :cond_0
    iget-object v0, p0, La/a/a/f/a;->j:Landroid/os/Handler;

    new-instance v1, La/a/a/f/a$a;

    invoke-direct {v1, p0}, La/a/a/f/a$a;-><init>(La/a/a/f/a;)V

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
