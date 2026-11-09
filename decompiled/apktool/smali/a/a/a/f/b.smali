.class public final La/a/a/f/b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/a/a/f/b$d;,
        La/a/a/f/b$c;,
        La/a/a/f/b$b;
    }
.end annotation


# instance fields
.field public final a:La/a/a/f/d;

.field public b:I

.field public c:D

.field public d:D

.field public e:Ljava/lang/Long;

.field public final f:La/a/a/f/b$d;

.field public final g:La/a/a/f/b$d;

.field public final h:Landroid/database/sqlite/SQLiteDatabase;

.field public final i:Landroid/database/sqlite/SQLiteDatabase;

.field public j:Ljava/lang/StringBuffer;

.field public k:Ljava/lang/StringBuffer;

.field public l:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public m:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Ljava/lang/Long;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public n:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public o:Ljava/lang/StringBuffer;

.field public p:Z


# direct methods
.method public constructor <init>(La/a/a/f/d;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/a/a/f/b;->a:La/a/a/f/d;

    const/4 v0, 0x0

    iput-boolean v0, p0, La/a/a/f/b;->p:Z

    new-instance v1, La/a/a/f/b$d;

    const/4 v2, 0x1

    invoke-direct {v1, p0, p0, v2}, La/a/a/f/b$d;-><init>(La/a/a/f/b;La/a/a/f/b;Z)V

    iput-object v1, p0, La/a/a/f/b;->f:La/a/a/f/b$d;

    new-instance v1, La/a/a/f/b$d;

    invoke-direct {v1, p0, p0, v0}, La/a/a/f/b$d;-><init>(La/a/a/f/b;La/a/a/f/b;Z)V

    iput-object v1, p0, La/a/a/f/b;->g:La/a/a/f/b$d;

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    iput-object v0, p0, La/a/a/f/b;->o:Ljava/lang/StringBuffer;

    const/4 v0, 0x0

    iput-object v0, p0, La/a/a/f/b;->j:Ljava/lang/StringBuffer;

    iput-object v0, p0, La/a/a/f/b;->k:Ljava/lang/StringBuffer;

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, p0, La/a/a/f/b;->l:Ljava/util/HashSet;

    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v1, p0, La/a/a/f/b;->m:Ljava/util/concurrent/ConcurrentMap;

    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v1, p0, La/a/a/f/b;->n:Ljava/util/concurrent/ConcurrentMap;

    :try_start_0
    new-instance v1, Ljava/io/File;

    invoke-virtual {p1}, La/a/a/f/d;->h()Ljava/io/File;

    move-result-object p1

    const-string v2, "ofl_location.db"

    invoke-direct {v1, p1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z

    :cond_0
    invoke-static {v1, v0}, Landroid/database/sqlite/SQLiteDatabase;->openOrCreateDatabase(Ljava/io/File;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object p1, v0

    :goto_0
    iput-object p1, p0, La/a/a/f/b;->h:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz p1, :cond_1

    :try_start_1
    const-string v1, "CREATE TABLE IF NOT EXISTS AP (id LONG PRIMARY KEY,x DOUBLE,y DOUBLE,r INTEGER,cl DOUBLE,timestamp INTEGER, frequency INTEGER DEFAULT 0);"

    invoke-virtual {p1, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v1, "CREATE TABLE IF NOT EXISTS CL (id LONG PRIMARY KEY,x DOUBLE,y DOUBLE,r INTEGER,cl DOUBLE,timestamp INTEGER, frequency INTEGER DEFAULT 0);"

    invoke-virtual {p1, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_1
    :try_start_2
    new-instance p1, Ljava/io/File;

    iget-object v1, p0, La/a/a/f/b;->a:La/a/a/f/d;

    invoke-virtual {v1}, La/a/a/f/d;->h()Ljava/io/File;

    move-result-object v1

    const-string v2, "ofl_statistics.db"

    invoke-direct {p1, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p1}, Ljava/io/File;->createNewFile()Z

    :cond_2
    invoke-static {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->openOrCreateDatabase(Ljava/io/File;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    iput-object v0, p0, La/a/a/f/b;->i:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz v0, :cond_3

    :try_start_3
    const-string p0, "CREATE TABLE IF NOT EXISTS AP (id LONG PRIMARY KEY, originid VARCHAR(15), frequency INTEGER DEFAULT 0);"

    invoke-virtual {v0, p0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string p0, "CREATE TABLE IF NOT EXISTS CL (id LONG PRIMARY KEY, originid VARCHAR(40), frequency INTEGER DEFAULT 0);"

    invoke-virtual {v0, p0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    :cond_3
    return-void
.end method

.method public static synthetic a(La/a/a/f/b;)Landroid/database/sqlite/SQLiteDatabase;
    .locals 0

    iget-object p0, p0, La/a/a/f/b;->i:Landroid/database/sqlite/SQLiteDatabase;

    return-object p0
.end method

.method public static synthetic a(La/a/a/f/b;Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;
    .locals 0

    iput-object p1, p0, La/a/a/f/b;->j:Ljava/lang/StringBuffer;

    return-object p1
.end method

.method public static synthetic a(La/a/a/f/b;Lcom/baidu/location/c;Lcom/baidu/location/c;Lcom/baidu/location/c;Ljava/lang/String;Ljava/lang/Long;)V
    .locals 0

    invoke-virtual/range {p0 .. p5}, La/a/a/f/b;->a(Lcom/baidu/location/c;Lcom/baidu/location/c;Lcom/baidu/location/c;Ljava/lang/String;Ljava/lang/Long;)V

    return-void
.end method

.method public static synthetic a(La/a/a/f/b;Ljava/lang/String;Ljava/lang/Long;Lcom/baidu/location/c;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, La/a/a/f/b;->a(Ljava/lang/String;Ljava/lang/Long;Lcom/baidu/location/c;)V

    return-void
.end method

.method public static synthetic a(La/a/a/f/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, La/a/a/f/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic a(La/a/a/f/b;Ljava/util/LinkedHashMap;)V
    .locals 0

    invoke-virtual {p0, p1}, La/a/a/f/b;->a(Ljava/util/LinkedHashMap;)V

    return-void
.end method

.method public static synthetic a(La/a/a/f/b;[Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, La/a/a/f/b;->a([Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic b(La/a/a/f/b;)La/a/a/f/b$d;
    .locals 0

    iget-object p0, p0, La/a/a/f/b;->g:La/a/a/f/b$d;

    return-object p0
.end method

.method public static synthetic b(La/a/a/f/b;Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;
    .locals 0

    iput-object p1, p0, La/a/a/f/b;->k:Ljava/lang/StringBuffer;

    return-object p1
.end method

.method public static synthetic c(La/a/a/f/b;)La/a/a/f/d;
    .locals 0

    iget-object p0, p0, La/a/a/f/b;->a:La/a/a/f/d;

    return-object p0
.end method

.method public static synthetic d(La/a/a/f/b;)Landroid/database/sqlite/SQLiteDatabase;
    .locals 0

    iget-object p0, p0, La/a/a/f/b;->h:Landroid/database/sqlite/SQLiteDatabase;

    return-object p0
.end method


# virtual methods
.method public final a(DDDD)D
    .locals 4

    sub-double v0, p7, p3

    sub-double v2, p5, p1

    invoke-static {p1, p2}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide p0

    invoke-static {p3, p4}, Ljava/lang/Math;->toRadians(D)D

    invoke-static {p5, p6}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide p2

    invoke-static {p7, p8}, Ljava/lang/Math;->toRadians(D)D

    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide p4

    invoke-static {v2, v3}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide p6

    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    div-double/2addr p6, v0

    invoke-static {p6, p7}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    invoke-static {p6, p7}, Ljava/lang/Math;->sin(D)D

    move-result-wide p6

    mul-double/2addr v2, p6

    invoke-static {p0, p1}, Ljava/lang/Math;->cos(D)D

    move-result-wide p0

    invoke-static {p2, p3}, Ljava/lang/Math;->cos(D)D

    move-result-wide p2

    mul-double/2addr p0, p2

    div-double/2addr p4, v0

    invoke-static {p4, p5}, Ljava/lang/Math;->sin(D)D

    move-result-wide p2

    mul-double/2addr p0, p2

    invoke-static {p4, p5}, Ljava/lang/Math;->sin(D)D

    move-result-wide p2

    mul-double/2addr p0, p2

    add-double/2addr v2, p0

    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p0

    const-wide/high16 p2, 0x3ff0000000000000L    # 1.0

    sub-double/2addr p2, v2

    invoke-static {p2, p3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p2

    invoke-static {p0, p1, p2, p3}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide p0

    mul-double/2addr p0, v0

    const-wide p2, 0x415854a640000000L    # 6378137.0

    mul-double/2addr p0, p2

    return-wide p0
.end method

.method public final a(Ljava/util/ArrayList;D)I
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "La/a/a/f/b$b;",
            ">;D)I"
        }
    .end annotation

    move-object/from16 v0, p1

    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    move v1, v2

    :goto_0
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x3

    if-lt v3, v4, :cond_4

    const-wide/16 v3, 0x0

    move v8, v2

    move-wide v6, v3

    :goto_1
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-ge v8, v9, :cond_1

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, La/a/a/f/b$b;

    iget-wide v9, v9, La/a/a/f/b$b;->a:D

    add-double/2addr v6, v9

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, La/a/a/f/b$b;

    iget-wide v9, v9, La/a/a/f/b$b;->b:D

    add-double/2addr v3, v9

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->size()I

    move-result v8

    int-to-double v8, v8

    div-double/2addr v6, v8

    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->size()I

    move-result v8

    int-to-double v8, v8

    div-double/2addr v3, v8

    const-wide/high16 v8, -0x4010000000000000L    # -1.0

    const/4 v10, -0x1

    move v13, v2

    move v15, v10

    :goto_2
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->size()I

    move-result v10

    if-ge v13, v10, :cond_3

    invoke-virtual {v0, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, La/a/a/f/b$b;

    iget-wide v11, v10, La/a/a/f/b$b;->b:D

    invoke-virtual {v0, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, La/a/a/f/b$b;

    move-wide/from16 v19, v6

    iget-wide v5, v10, La/a/a/f/b$b;->a:D

    move-object/from16 v10, p0

    move-wide/from16 v16, v11

    move-wide v11, v3

    move v7, v13

    move-wide/from16 v13, v19

    move v2, v15

    move-wide/from16 v15, v16

    move-wide/from16 v17, v5

    invoke-virtual/range {v10 .. v18}, La/a/a/f/b;->a(DDDD)D

    move-result-wide v5

    cmpl-double v10, v5, v8

    if-lez v10, :cond_2

    move-wide v8, v5

    move v15, v7

    goto :goto_3

    :cond_2
    move v15, v2

    :goto_3
    add-int/lit8 v13, v7, 0x1

    move-wide/from16 v6, v19

    const/4 v2, 0x0

    goto :goto_2

    :cond_3
    move v2, v15

    cmpl-double v3, v8, p2

    if-lez v3, :cond_4

    if-ltz v2, :cond_4

    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_4

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    const/4 v2, 0x1

    goto :goto_4

    :cond_4
    const/4 v2, 0x0

    :goto_4
    const/4 v3, 0x1

    if-eq v2, v3, :cond_5

    return v1

    :cond_5
    const/4 v2, 0x0

    goto/16 :goto_0
.end method

.method public a(La/a/a/f/e$a;)Landroid/database/Cursor;
    .locals 20

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    new-instance v2, Lcom/baidu/location/c;

    invoke-direct {v2}, Lcom/baidu/location/c;-><init>()V

    const/16 v3, 0x43

    invoke-virtual {v2, v3}, Lcom/baidu/location/c;->h(I)V

    iget-boolean v3, v0, La/a/a/f/e$a;->c:Z

    if-eqz v3, :cond_18

    iget-object v3, v0, La/a/a/f/e$a;->b:Ljava/lang/String;

    iget-object v8, v0, La/a/a/f/e$a;->i:Ljava/util/LinkedHashMap;

    iget v4, v0, La/a/a/f/e$a;->f:I

    iget-object v6, v0, La/a/a/f/e$a;->g:Lcom/baidu/location/c;

    const-wide/high16 v9, -0x8000000000000000L

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    if-eqz v3, :cond_0

    iget-object v9, v1, La/a/a/f/b;->h:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz v9, :cond_0

    invoke-static {v3}, Lcom/baidu/location/Jni;->d(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-virtual {v1, v5}, La/a/a/f/b;->a(Ljava/lang/Long;)Lcom/baidu/location/c;

    move-result-object v9

    goto :goto_0

    :cond_0
    const/4 v9, 0x0

    :goto_0
    if-eqz v8, :cond_1

    invoke-virtual {v8}, Ljava/util/LinkedHashMap;->size()I

    move-result v10

    if-lez v10, :cond_1

    iget-object v10, v1, La/a/a/f/b;->h:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz v10, :cond_1

    iget-object v10, v1, La/a/a/f/b;->m:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v10}, Ljava/util/concurrent/ConcurrentMap;->clear()V

    iget-object v10, v1, La/a/a/f/b;->l:Ljava/util/HashSet;

    invoke-virtual {v10}, Ljava/util/HashSet;->clear()V

    iget-object v10, v1, La/a/a/f/b;->n:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v10}, Ljava/util/concurrent/ConcurrentMap;->clear()V

    invoke-virtual {v1, v8, v9, v4}, La/a/a/f/b;->a(Ljava/util/LinkedHashMap;Lcom/baidu/location/c;I)Lcom/baidu/location/c;

    move-result-object v4

    move-object v10, v4

    goto :goto_1

    :cond_1
    const/4 v10, 0x0

    :goto_1
    const-string v4, "gcj02"

    const-string v11, "bd09ll2gcj"

    const/4 v12, 0x1

    if-eqz v9, :cond_2

    invoke-virtual {v9}, Lcom/baidu/location/c;->t()D

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v14

    invoke-virtual {v9}, Lcom/baidu/location/c;->q()D

    move-result-wide v15

    invoke-static/range {v15 .. v16}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v15

    move-object/from16 v16, v8

    invoke-virtual {v9}, Lcom/baidu/location/c;->t()D

    move-result-wide v7

    move-object/from16 v17, v14

    invoke-virtual {v9}, Lcom/baidu/location/c;->q()D

    move-result-wide v13

    invoke-static {v7, v8, v13, v14, v11}, Lcom/baidu/location/Jni;->a(DDLjava/lang/String;)[D

    move-result-object v7

    invoke-virtual {v9, v4}, Lcom/baidu/location/c;->e(Ljava/lang/String;)V

    aget-wide v13, v7, v12

    invoke-virtual {v9, v13, v14}, Lcom/baidu/location/c;->c(D)V

    const/4 v8, 0x0

    aget-wide v13, v7, v8

    invoke-virtual {v9, v13, v14}, Lcom/baidu/location/c;->d(D)V

    const-string v7, "cl"

    invoke-virtual {v9, v7}, Lcom/baidu/location/c;->l(Ljava/lang/String;)V

    move-object/from16 v14, v17

    goto :goto_2

    :cond_2
    move-object/from16 v16, v8

    const/4 v14, 0x0

    const/4 v15, 0x0

    :goto_2
    if-eqz v10, :cond_3

    invoke-virtual {v10}, Lcom/baidu/location/c;->t()D

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v7

    invoke-virtual {v10}, Lcom/baidu/location/c;->q()D

    move-result-wide v17

    invoke-static/range {v17 .. v18}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v8

    invoke-virtual {v10}, Lcom/baidu/location/c;->t()D

    move-result-wide v12

    move-object/from16 v18, v7

    move-object/from16 v19, v8

    invoke-virtual {v10}, Lcom/baidu/location/c;->q()D

    move-result-wide v7

    invoke-static {v12, v13, v7, v8, v11}, Lcom/baidu/location/Jni;->a(DDLjava/lang/String;)[D

    move-result-object v7

    invoke-virtual {v10, v4}, Lcom/baidu/location/c;->e(Ljava/lang/String;)V

    const/4 v4, 0x1

    aget-wide v11, v7, v4

    invoke-virtual {v10, v11, v12}, Lcom/baidu/location/c;->c(D)V

    const/4 v4, 0x0

    aget-wide v7, v7, v4

    invoke-virtual {v10, v7, v8}, Lcom/baidu/location/c;->d(D)V

    const-string v4, "wf"

    invoke-virtual {v10, v4}, Lcom/baidu/location/c;->l(Ljava/lang/String;)V

    move-object/from16 v7, v18

    move-object/from16 v8, v19

    goto :goto_3

    :cond_3
    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_3
    if-eqz v9, :cond_4

    if-nez v10, :cond_4

    const/4 v4, 0x1

    goto :goto_4

    :cond_4
    if-nez v9, :cond_5

    if-eqz v10, :cond_5

    const/4 v4, 0x2

    goto :goto_4

    :cond_5
    if-eqz v9, :cond_6

    if-eqz v10, :cond_6

    const/4 v4, 0x4

    goto :goto_4

    :cond_6
    const/4 v4, 0x0

    :goto_4
    iget v11, v0, La/a/a/f/e$a;->f:I

    if-lez v11, :cond_7

    const/4 v11, 0x1

    goto :goto_5

    :cond_7
    const/4 v11, 0x0

    :goto_5
    if-eqz v16, :cond_9

    invoke-virtual/range {v16 .. v16}, Ljava/util/LinkedHashMap;->size()I

    move-result v12

    if-gtz v12, :cond_8

    goto :goto_6

    :cond_8
    const/4 v12, 0x0

    goto :goto_7

    :cond_9
    :goto_6
    const/4 v12, 0x1

    :goto_7
    if-eqz v11, :cond_b

    if-eqz v10, :cond_a

    goto :goto_8

    :cond_a
    if-eqz v12, :cond_d

    if-eqz v9, :cond_d

    goto :goto_9

    :cond_b
    if-eqz v10, :cond_c

    :goto_8
    move-object v14, v7

    move-object v15, v8

    move-object v7, v10

    goto :goto_a

    :cond_c
    if-eqz v9, :cond_d

    :goto_9
    move-object v7, v9

    goto :goto_a

    :cond_d
    move-object v7, v2

    const/4 v14, 0x0

    const/4 v15, 0x0

    :goto_a
    iget-boolean v8, v0, La/a/a/f/e$a;->e:Z

    if-eqz v8, :cond_e

    iget-object v8, v1, La/a/a/f/b;->a:La/a/a/f/d;

    invoke-virtual {v8}, La/a/a/f/d;->c()La/a/a/f/c;

    move-result-object v8

    invoke-virtual {v8}, La/a/a/f/c;->n()Z

    move-result v8

    if-eqz v8, :cond_e

    if-eqz v15, :cond_e

    if-eqz v14, :cond_e

    iget-object v8, v1, La/a/a/f/b;->a:La/a/a/f/d;

    invoke-virtual {v8}, La/a/a/f/d;->g()La/a/a/f/g;

    move-result-object v8

    invoke-virtual {v14}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v12

    move/from16 v19, v4

    move-object/from16 v18, v5

    invoke-virtual {v15}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    invoke-virtual {v8, v12, v13, v4, v5}, La/a/a/f/g;->a(DD)Lcom/baidu/location/a;

    move-result-object v4

    invoke-virtual {v7, v4}, Lcom/baidu/location/c;->a(Lcom/baidu/location/a;)V

    goto :goto_b

    :cond_e
    move/from16 v19, v4

    move-object/from16 v18, v5

    :goto_b
    if-eqz v11, :cond_f

    iget-boolean v4, v0, La/a/a/f/e$a;->e:Z

    if-eqz v4, :cond_f

    invoke-virtual {v7}, Lcom/baidu/location/c;->b()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_f

    move-object v7, v2

    const/4 v8, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    goto :goto_c

    :cond_f
    move/from16 v8, v19

    :goto_c
    iget-boolean v4, v0, La/a/a/f/e$a;->d:Z

    if-nez v4, :cond_10

    iget-boolean v4, v0, La/a/a/f/e$a;->h:Z

    if-eqz v4, :cond_11

    :cond_10
    if-eqz v15, :cond_11

    if-eqz v14, :cond_11

    iget-object v4, v1, La/a/a/f/b;->a:La/a/a/f/d;

    invoke-virtual {v4}, La/a/a/f/d;->g()La/a/a/f/g;

    move-result-object v4

    invoke-virtual {v14}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v12

    invoke-virtual {v15}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v14

    invoke-virtual {v4, v12, v13, v14, v15}, La/a/a/f/g;->b(DD)Ljava/util/List;

    move-result-object v4

    iget-boolean v5, v0, La/a/a/f/e$a;->d:Z

    if-eqz v5, :cond_12

    invoke-virtual {v7, v4}, Lcom/baidu/location/c;->a(Ljava/util/List;)V

    goto :goto_d

    :cond_11
    const/4 v4, 0x0

    :cond_12
    :goto_d
    if-eqz v11, :cond_14

    iget-boolean v5, v0, La/a/a/f/e$a;->d:Z

    if-eqz v5, :cond_14

    if-eqz v4, :cond_13

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    if-gtz v5, :cond_14

    :cond_13
    move-object v7, v2

    const/4 v8, 0x0

    :cond_14
    iget-boolean v5, v0, La/a/a/f/e$a;->h:Z

    if-eqz v5, :cond_15

    if-eqz v4, :cond_15

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    if-lez v5, :cond_15

    sget-object v5, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    const/4 v12, 0x1

    new-array v12, v12, [Ljava/lang/Object;

    const/4 v13, 0x0

    invoke-interface {v4, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/baidu/location/j;

    invoke-virtual {v4}, Lcom/baidu/location/j;->c()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v12, v13

    const-string v4, "\u5728%s\u9644\u8fd1"

    invoke-static {v5, v4, v12}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7, v4}, Lcom/baidu/location/c;->j(Ljava/lang/String;)V

    goto :goto_e

    :cond_15
    const/4 v13, 0x0

    const/4 v4, 0x0

    :goto_e
    if-eqz v11, :cond_16

    iget-boolean v5, v0, La/a/a/f/e$a;->h:Z

    if-eqz v5, :cond_16

    if-nez v4, :cond_16

    move-object v11, v2

    goto :goto_f

    :cond_16
    move-object v11, v7

    move v13, v8

    :goto_f
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    iget-object v4, v0, La/a/a/f/e$a;->a:Ljava/lang/String;

    if-eqz v4, :cond_17

    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-static {v10, v9, v0}, La/a/a/f/e;->a(Lcom/baidu/location/c;Lcom/baidu/location/c;La/a/a/f/e$a;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-static {v11, v13}, La/a/a/f/e;->a(Lcom/baidu/location/c;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v7, v0

    goto :goto_10

    :cond_17
    const/4 v7, 0x0

    :goto_10
    new-instance v12, La/a/a/f/b$a;

    move-object v0, v12

    move-object/from16 v1, p0

    move-object v2, v3

    move-object/from16 v3, v18

    move-object v4, v9

    move-object v5, v10

    move-object/from16 v8, v16

    invoke-direct/range {v0 .. v8}, La/a/a/f/b$a;-><init>(La/a/a/f/b;Ljava/lang/String;Ljava/lang/Long;Lcom/baidu/location/c;Lcom/baidu/location/c;Lcom/baidu/location/c;Ljava/lang/String;Ljava/util/LinkedHashMap;)V

    invoke-virtual {v12}, Ljava/lang/Thread;->start()V

    move-object v2, v11

    :cond_18
    invoke-static {v2}, La/a/a/f/e;->a(Lcom/baidu/location/c;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public a()Landroid/database/sqlite/SQLiteDatabase;
    .locals 0

    iget-object p0, p0, La/a/a/f/b;->i:Landroid/database/sqlite/SQLiteDatabase;

    return-object p0
.end method

.method public final a(Ljava/lang/Long;)Lcom/baidu/location/c;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    iput-boolean v2, v0, La/a/a/f/b;->p:Z

    iget-object v3, v0, La/a/a/f/b;->e:Ljava/lang/Long;

    const-string v4, "cl"

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v3, :cond_0

    invoke-virtual {v3, v1}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-wide v1, v0, La/a/a/f/b;->c:D

    iget-wide v7, v0, La/a/a/f/b;->d:D

    iget v0, v0, La/a/a/f/b;->b:I

    goto/16 :goto_6

    :cond_0
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v7, 0x3

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v1, v7, v2

    const v8, 0xed4e00

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v7, v6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    const-wide/16 v10, 0x3e8

    div-long/2addr v8, v10

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    const/4 v9, 0x2

    aput-object v8, v7, v9

    const-string v8, "SELECT * FROM CL WHERE id = %d AND timestamp + %d > %d;"

    invoke-static {v3, v8, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const-wide/16 v7, 0x0

    :try_start_0
    iget-object v9, v0, La/a/a/f/b;->h:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v9, v3, v5}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v3, :cond_4

    :try_start_1
    invoke-interface {v3}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-interface {v3, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v9

    invoke-interface {v3, v9}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v12
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    cmpl-double v9, v12, v7

    if-lez v9, :cond_4

    :try_start_2
    const-string v9, "x"

    invoke-interface {v3, v9}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v9

    invoke-interface {v3, v9}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v12
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    const-string v9, "y"

    invoke-interface {v3, v9}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v9

    invoke-interface {v3, v9}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v7

    const-string v9, "r"

    invoke-interface {v3, v9}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v9

    invoke-interface {v3, v9}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    const-string v9, "timestamp"

    invoke-interface {v3, v9}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v9

    invoke-interface {v3, v9}, Landroid/database/Cursor;->getInt(I)I

    move-result v9

    const v14, 0x93a80

    add-int/2addr v9, v14

    int-to-long v14, v9

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v16

    div-long v16, v16, v10

    cmp-long v9, v14, v16

    if-gez v9, :cond_1

    iput-boolean v6, v0, La/a/a/f/b;->p:Z

    :cond_1
    const/16 v9, 0x7d0

    const/16 v10, 0x12c

    if-ge v2, v10, :cond_2

    move v2, v10

    goto :goto_0

    :cond_2
    if-ge v9, v2, :cond_3

    move v2, v9

    :cond_3
    :goto_0
    iput-wide v12, v0, La/a/a/f/b;->c:D

    iput-wide v7, v0, La/a/a/f/b;->d:D

    iput v2, v0, La/a/a/f/b;->b:I

    iput-object v1, v0, La/a/a/f/b;->e:Ljava/lang/Long;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move v0, v2

    move-wide v1, v12

    goto :goto_1

    :catch_0
    move v0, v2

    move-wide v1, v12

    goto :goto_4

    :catch_1
    move v0, v2

    goto :goto_3

    :catchall_0
    move-exception v0

    move-object v5, v3

    goto :goto_2

    :catch_2
    move v0, v2

    move v6, v0

    goto :goto_3

    :cond_4
    move v0, v2

    move v6, v0

    move-wide v1, v7

    :goto_1
    if-eqz v3, :cond_6

    goto :goto_5

    :catchall_1
    move-exception v0

    :goto_2
    if-eqz v5, :cond_5

    :try_start_4
    invoke-interface {v5}, Landroid/database/Cursor;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    :catch_3
    :cond_5
    throw v0

    :catch_4
    move v0, v2

    move v6, v0

    move-object v3, v5

    :goto_3
    move-wide v1, v7

    :goto_4
    if-eqz v3, :cond_6

    :goto_5
    :try_start_5
    invoke-interface {v3}, Landroid/database/Cursor;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    :catch_5
    :cond_6
    :goto_6
    if-eqz v6, :cond_7

    new-instance v5, Lcom/baidu/location/c;

    invoke-direct {v5}, Lcom/baidu/location/c;-><init>()V

    int-to-float v0, v0

    invoke-virtual {v5, v0}, Lcom/baidu/location/c;->b(F)V

    invoke-virtual {v5, v7, v8}, Lcom/baidu/location/c;->c(D)V

    invoke-virtual {v5, v1, v2}, Lcom/baidu/location/c;->d(D)V

    invoke-virtual {v5, v4}, Lcom/baidu/location/c;->l(Ljava/lang/String;)V

    const/16 v0, 0x42

    invoke-virtual {v5, v0}, Lcom/baidu/location/c;->h(I)V

    :cond_7
    return-object v5
.end method

.method public final a(Ljava/util/LinkedHashMap;Lcom/baidu/location/c;I)Lcom/baidu/location/c;
    .locals 38
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/baidu/location/c;",
            "I)",
            "Lcom/baidu/location/c;"
        }
    .end annotation

    move-object/from16 v0, p0

    iget-object v1, v0, La/a/a/f/b;->o:Ljava/lang/StringBuffer;

    const/4 v10, 0x0

    invoke-virtual {v1, v10}, Ljava/lang/StringBuffer;->setLength(I)V

    const/4 v11, 0x1

    if-eqz p2, :cond_0

    invoke-virtual/range {p2 .. p2}, Lcom/baidu/location/c;->q()D

    move-result-wide v1

    invoke-virtual/range {p2 .. p2}, Lcom/baidu/location/c;->t()D

    move-result-wide v3

    move-wide v14, v1

    move-wide/from16 v16, v3

    move v8, v11

    goto :goto_0

    :cond_0
    move v8, v10

    const-wide/16 v14, 0x0

    const-wide/16 v16, 0x0

    :goto_0
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual/range {p1 .. p1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v3, v10

    move v4, v11

    :goto_1
    invoke-virtual/range {p1 .. p1}, Ljava/util/LinkedHashMap;->size()I

    move-result v5

    const/16 v9, 0x1e

    invoke-static {v5, v9}, Ljava/lang/Math;->min(II)I

    move-result v5

    if-ge v3, v5, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-gez v7, :cond_1

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    neg-int v5, v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    :cond_1
    invoke-static {v6}, Lcom/baidu/location/Jni;->d(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v7

    if-nez v7, :cond_2

    goto :goto_3

    :cond_2
    iget-object v9, v0, La/a/a/f/b;->n:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v9, v7, v6}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v4, :cond_3

    move v4, v10

    goto :goto_2

    :cond_3
    const/16 v6, 0x2c

    invoke-virtual {v1, v6}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    :goto_2
    iget-object v6, v0, La/a/a/f/b;->m:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v6, v7, v5}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_4
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v6, 0x3

    new-array v3, v6, [Ljava/lang/Object;

    aput-object v1, v3, v10

    const v1, 0x76a700

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v3, v11

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const-wide/16 v18, 0x3e8

    div-long v4, v4, v18

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v7, 0x2

    aput-object v1, v3, v7

    const-string v1, "SELECT * FROM AP WHERE id IN (%s) AND timestamp+%d>%d;"

    invoke-static {v2, v1, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    :try_start_0
    iget-object v2, v0, La/a/a/f/b;->h:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v2, v1, v4}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_8
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    if-eqz v5, :cond_18

    :try_start_1
    invoke-interface {v5}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-eqz v1, :cond_18

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    :goto_4
    invoke-interface {v5}, Landroid/database/Cursor;->isAfterLast()Z

    move-result v1

    const-wide v20, 0x40c3880000000000L    # 10000.0

    const-wide/high16 v22, 0x3ff0000000000000L    # 1.0

    if-nez v1, :cond_d

    invoke-interface {v5, v10}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v24

    invoke-static/range {v24 .. v25}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v5, v11}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v25

    invoke-interface {v5, v7}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v27

    invoke-interface {v5, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v12

    const/4 v13, 0x4

    invoke-interface {v5, v13}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v29

    const/4 v13, 0x5

    invoke-interface {v5, v13}, Landroid/database/Cursor;->getInt(I)I

    move-result v13

    iget-object v3, v0, La/a/a/f/b;->l:Ljava/util/HashSet;

    invoke-virtual {v3, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_5
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    const v3, 0x93a80

    add-int/2addr v13, v3

    move-object/from16 v31, v5

    int-to-long v4, v13

    :try_start_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v32

    div-long v32, v32, v18
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    cmp-long v3, v4, v32

    if-gez v3, :cond_6

    :try_start_3
    iget-object v3, v0, La/a/a/f/b;->o:Ljava/lang/StringBuffer;

    invoke-virtual {v3}, Ljava/lang/StringBuffer;->length()I

    move-result v3

    if-lez v3, :cond_5

    iget-object v3, v0, La/a/a/f/b;->o:Ljava/lang/StringBuffer;

    const-string v4, ","

    invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_5
    iget-object v3, v0, La/a/a/f/b;->o:Ljava/lang/StringBuffer;

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const-string v5, "(%d,\"%s\",%d)"

    :try_start_4
    new-array v13, v6, [Ljava/lang/Object;

    aput-object v1, v13, v10

    iget-object v6, v0, La/a/a/f/b;->n:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v6, v1}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    aput-object v6, v13, v11

    const v6, 0x186a0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v13, v7

    invoke-static {v4, v5, v13}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_5

    :catchall_0
    move-exception v0

    move-object/from16 v4, v31

    goto/16 :goto_15

    :catch_0
    move-object/from16 v34, v31

    const-wide/16 v7, 0x0

    const/16 v33, 0x0

    goto/16 :goto_12

    :cond_6
    :goto_5
    const-wide/16 v3, 0x0

    cmpg-double v5, v29, v3

    if-gtz v5, :cond_8

    :cond_7
    :goto_6
    move-object v11, v2

    move/from16 v32, v7

    move/from16 v37, v8

    move v10, v9

    move-object/from16 v34, v31

    const/16 v33, 0x0

    const/16 v36, 0x3

    goto/16 :goto_8

    :cond_8
    cmpg-double v5, v25, v3

    if-lez v5, :cond_7

    cmpg-double v5, v27, v3

    if-lez v5, :cond_7

    if-lez v12, :cond_7

    const/16 v3, 0x3e8

    if-lt v12, v3, :cond_9

    goto :goto_6

    :cond_9
    if-ne v8, v11, :cond_a

    move-object v13, v1

    move-object/from16 v1, p0

    move-object v6, v2

    const/16 v4, 0x64

    move-wide v2, v14

    move v10, v4

    move-object/from16 v34, v31

    const/16 v33, 0x0

    move-wide/from16 v4, v16

    move-object v11, v6

    move/from16 v32, v7

    const/16 v36, 0x3

    move-wide/from16 v6, v27

    move/from16 v37, v8

    move v10, v9

    move-wide/from16 v8, v25

    :try_start_5
    invoke-virtual/range {v1 .. v9}, La/a/a/f/b;->a(DDDD)D

    move-result-wide v1

    cmpl-double v1, v1, v20

    if-lez v1, :cond_b

    goto :goto_8

    :cond_a
    move-object v13, v1

    move-object v11, v2

    move/from16 v32, v7

    move/from16 v37, v8

    move v10, v9

    move-object/from16 v34, v31

    const/16 v33, 0x0

    const/16 v36, 0x3

    :cond_b
    iget-object v1, v0, La/a/a/f/b;->m:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v1, v13}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v10, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    const/16 v2, 0x64

    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    const-wide/high16 v2, 0x4049000000000000L    # 50.0

    const/16 v4, 0x46

    if-le v1, v4, :cond_c

    add-int/lit8 v1, v1, -0x46

    int-to-double v4, v1

    const-wide/high16 v6, 0x403e000000000000L    # 30.0

    div-double/2addr v4, v6

    goto :goto_7

    :cond_c
    add-int/lit8 v1, v1, -0x46

    int-to-double v4, v1

    div-double/2addr v4, v2

    :goto_7
    add-double v4, v4, v22

    int-to-double v6, v12

    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->max(DD)D

    move-result-wide v1

    const-wide v6, 0x3fe3333333333333L    # 0.6

    invoke-static {v1, v2, v6, v7}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v1

    const-wide v6, -0x404f5c28f5c28f5cL    # -0.065

    mul-double/2addr v1, v6

    mul-double/2addr v1, v4

    invoke-static {v1, v2}, Ljava/lang/Math;->exp(D)D

    move-result-wide v29

    new-instance v1, La/a/a/f/b$b;

    const/16 v31, 0x0

    move-object/from16 v24, v1

    invoke-direct/range {v24 .. v31}, La/a/a/f/b$b;-><init>(DDDLa/a/a/f/b$a;)V

    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_8
    invoke-interface/range {v34 .. v34}, Landroid/database/Cursor;->moveToNext()Z

    move v9, v10

    move-object v2, v11

    move/from16 v7, v32

    move-object/from16 v4, v33

    move-object/from16 v5, v34

    move/from16 v6, v36

    move/from16 v8, v37

    const/4 v10, 0x0

    const/4 v11, 0x1

    goto/16 :goto_4

    :catchall_1
    move-exception v0

    move-object/from16 v34, v31

    goto/16 :goto_10

    :catch_1
    move-object/from16 v34, v31

    const/16 v33, 0x0

    goto/16 :goto_11

    :cond_d
    move-object v11, v2

    move-object/from16 v33, v4

    move-object/from16 v34, v5

    move/from16 v37, v8

    move v10, v9

    const-wide v1, 0x408f400000000000L    # 1000.0

    invoke-virtual {v0, v11, v1, v2}, La/a/a/f/b;->a(Ljava/util/ArrayList;D)I

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    :goto_9
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v8

    if-ge v7, v8, :cond_f

    invoke-virtual {v11, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, La/a/a/f/b$b;

    iget-wide v12, v8, La/a/a/f/b$b;->c:D

    const-wide/16 v18, 0x0

    cmpg-double v9, v12, v18

    if-gtz v9, :cond_e

    move-object/from16 v18, v11

    goto :goto_a

    :cond_e
    move-object/from16 v18, v11

    iget-wide v10, v8, La/a/a/f/b$b;->a:D

    mul-double/2addr v10, v12

    add-double/2addr v1, v10

    iget-wide v8, v8, La/a/a/f/b$b;->b:D
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_6
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    mul-double/2addr v8, v12

    add-double/2addr v5, v8

    add-double/2addr v3, v12

    :goto_a
    add-int/lit8 v7, v7, 0x1

    move-object/from16 v11, v18

    const/16 v10, 0x1e

    goto :goto_9

    :cond_f
    move-object/from16 v18, v11

    const-wide/16 v7, 0x0

    cmpl-double v9, v3, v7

    if-lez v9, :cond_13

    cmpl-double v9, v1, v7

    if-lez v9, :cond_13

    cmpl-double v9, v5, v7

    if-lez v9, :cond_13

    div-double v12, v1, v3

    div-double v10, v5, v3

    const/4 v1, 0x0

    const/4 v8, 0x0

    :goto_b
    :try_start_6
    invoke-virtual/range {v18 .. v18}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v8, v2, :cond_10

    float-to-double v6, v1

    move-object/from16 v9, v18

    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/a/a/f/b$b;

    iget-wide v4, v1, La/a/a/f/b$b;->a:D

    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/a/a/f/b$b;

    iget-wide v2, v1, La/a/a/f/b$b;->b:D

    move-object/from16 v1, p0

    move-wide/from16 v24, v2

    move-wide v2, v12

    move-wide/from16 v26, v4

    move-wide v4, v10

    move-wide/from16 v28, v6

    move-wide/from16 v6, v26

    move/from16 v26, v8

    move-object/from16 v18, v9

    move-wide/from16 v8, v24

    invoke-virtual/range {v1 .. v9}, La/a/a/f/b;->a(DDDD)D

    move-result-wide v1

    add-double v6, v28, v1

    double-to-float v1, v6

    add-int/lit8 v8, v26, 0x1

    goto :goto_b

    :cond_10
    invoke-virtual/range {v18 .. v18}, Ljava/util/ArrayList;->size()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v9
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    const/16 v1, 0x1e

    if-ge v9, v1, :cond_11

    :goto_c
    move-wide/from16 v24, v10

    move/from16 v11, v37

    move v10, v1

    const/4 v1, 0x1

    goto :goto_d

    :cond_11
    const/16 v1, 0x64

    if-ge v1, v9, :cond_12

    goto :goto_c

    :cond_12
    move-wide/from16 v24, v10

    move/from16 v11, v37

    const/4 v1, 0x1

    move v10, v9

    goto :goto_d

    :catch_2
    move-wide/from16 v24, v10

    move-object/from16 v4, v34

    const/4 v1, 0x1

    goto/16 :goto_17

    :cond_13
    move-wide v12, v7

    move-wide/from16 v24, v12

    move/from16 v11, v37

    const/4 v1, 0x0

    const/4 v10, 0x0

    :goto_d
    if-nez v11, :cond_14

    :try_start_7
    invoke-virtual/range {v18 .. v18}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x1

    if-gt v2, v3, :cond_14

    const/4 v1, 0x0

    :cond_14
    invoke-virtual/range {v18 .. v18}, Ljava/util/ArrayList;->size()I

    move-result v2

    move/from16 v3, p3

    if-ge v2, v3, :cond_15

    invoke-virtual/range {v18 .. v18}, Ljava/util/ArrayList;->size()I

    move-result v2

    int-to-double v2, v2

    mul-double v2, v2, v22

    invoke-virtual/range {p1 .. p1}, Ljava/util/LinkedHashMap;->size()I

    move-result v4
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    int-to-double v4, v4

    div-double/2addr v2, v4

    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    cmpg-double v2, v2, v4

    if-gez v2, :cond_15

    const/4 v1, 0x1

    const/4 v8, 0x0

    goto :goto_e

    :cond_15
    move v8, v1

    const/4 v1, 0x1

    :goto_e
    if-ne v11, v1, :cond_16

    if-ne v8, v1, :cond_16

    move-object/from16 v1, p0

    move-wide v2, v14

    move-wide/from16 v4, v16

    move-wide/from16 v6, v24

    move v0, v8

    move-wide v8, v12

    :try_start_8
    invoke-virtual/range {v1 .. v9}, La/a/a/f/b;->a(DDDD)D

    move-result-wide v1
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_3
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    cmpl-double v1, v1, v20

    if-lez v1, :cond_17

    goto :goto_13

    :catch_3
    move v1, v0

    goto :goto_f

    :cond_16
    move v0, v8

    :cond_17
    move/from16 v35, v0

    goto :goto_14

    :catch_4
    :goto_f
    move-object/from16 v4, v34

    goto :goto_18

    :catchall_2
    move-exception v0

    goto :goto_10

    :catchall_3
    move-exception v0

    move-object/from16 v34, v5

    :goto_10
    move-object/from16 v4, v34

    goto :goto_15

    :catch_5
    move-object/from16 v33, v4

    move-object/from16 v34, v5

    :catch_6
    :goto_11
    const-wide/16 v7, 0x0

    :goto_12
    move-wide v12, v7

    move-wide/from16 v24, v12

    move-object/from16 v4, v34

    goto :goto_16

    :cond_18
    move-object/from16 v33, v4

    move-object/from16 v34, v5

    const-wide/16 v7, 0x0

    move-wide v12, v7

    move-wide/from16 v24, v12

    const/4 v10, 0x0

    :goto_13
    const/16 v35, 0x0

    :goto_14
    if-eqz v34, :cond_1a

    move-object/from16 v5, v34

    goto :goto_19

    :catchall_4
    move-exception v0

    move-object/from16 v33, v4

    :goto_15
    if-eqz v4, :cond_19

    :try_start_9
    invoke-interface {v4}, Landroid/database/Cursor;->close()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_7

    :catch_7
    :cond_19
    throw v0

    :catch_8
    move-object/from16 v33, v4

    const-wide/16 v7, 0x0

    move-wide v12, v7

    move-wide/from16 v24, v12

    move-object/from16 v4, v33

    :goto_16
    const/4 v1, 0x0

    :goto_17
    const/4 v10, 0x0

    :goto_18
    move/from16 v35, v1

    if-eqz v4, :cond_1a

    move-object v5, v4

    :goto_19
    :try_start_a
    invoke-interface {v5}, Landroid/database/Cursor;->close()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_9

    :catch_9
    :cond_1a
    move-wide/from16 v0, v24

    if-eqz v35, :cond_1b

    new-instance v4, Lcom/baidu/location/c;

    invoke-direct {v4}, Lcom/baidu/location/c;-><init>()V

    int-to-float v2, v10

    invoke-virtual {v4, v2}, Lcom/baidu/location/c;->b(F)V

    invoke-virtual {v4, v0, v1}, Lcom/baidu/location/c;->c(D)V

    invoke-virtual {v4, v12, v13}, Lcom/baidu/location/c;->d(D)V

    const-string v0, "wf"

    invoke-virtual {v4, v0}, Lcom/baidu/location/c;->l(Ljava/lang/String;)V

    const/16 v0, 0x42

    invoke-virtual {v4, v0}, Lcom/baidu/location/c;->h(I)V

    goto :goto_1a

    :cond_1b
    move-object/from16 v4, v33

    :goto_1a
    return-object v4
.end method

.method public final a(Lcom/baidu/location/c;Lcom/baidu/location/c;Lcom/baidu/location/c;Ljava/lang/String;Ljava/lang/Long;)V
    .locals 12

    move-object v9, p0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/baidu/location/c;->r()I

    move-result v0

    const/16 v1, 0xa1

    if-ne v0, v1, :cond_1

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lcom/baidu/location/c;->v()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/baidu/location/c;->v()Ljava/lang/String;

    move-result-object v0

    const-string v1, "cl"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/baidu/location/c;->q()D

    move-result-wide v1

    invoke-virtual {p2}, Lcom/baidu/location/c;->t()D

    move-result-wide v3

    invoke-virtual {p1}, Lcom/baidu/location/c;->q()D

    move-result-wide v5

    invoke-virtual {p1}, Lcom/baidu/location/c;->t()D

    move-result-wide v7

    move-object v0, p0

    invoke-virtual/range {v0 .. v8}, La/a/a/f/b;->a(DDDD)D

    move-result-wide v0

    const-wide v2, 0x4072c00000000000L    # 300.0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v1, v11, [Ljava/lang/Object;

    aput-object p5, v1, v10

    const-string v2, "UPDATE CL SET cl = 0 WHERE id = %d;"

    invoke-static {v0, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p5, v2, v10

    aput-object p4, v2, v11

    const v3, 0x186a0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    const-string v3, "INSERT OR REPLACE INTO CL VALUES (%d,\"%s\",%d);"

    invoke-static {v0, v3, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :try_start_0
    iget-object v2, v9, La/a/a/f/b;->h:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v2, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    iget-object v1, v9, La/a/a/f/b;->i:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    if-eqz p3, :cond_1

    invoke-virtual {p1}, Lcom/baidu/location/c;->v()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/baidu/location/c;->v()Ljava/lang/String;

    move-result-object v0

    const-string v1, "wf"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p3}, Lcom/baidu/location/c;->q()D

    move-result-wide v1

    invoke-virtual {p3}, Lcom/baidu/location/c;->t()D

    move-result-wide v3

    invoke-virtual {p1}, Lcom/baidu/location/c;->q()D

    move-result-wide v5

    invoke-virtual {p1}, Lcom/baidu/location/c;->t()D

    move-result-wide v7

    move-object v0, p0

    invoke-virtual/range {v0 .. v8}, La/a/a/f/b;->a(DDDD)D

    move-result-wide v0

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_1

    const-string v0, "UPDATE AP SET cl = 0 WHERE id In (%s);"

    :try_start_1
    new-array v1, v11, [Ljava/lang/Object;

    iget-object v2, v9, La/a/a/f/b;->j:Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v10

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    const-string v1, "INSERT OR REPLACE INTO AP VALUES %s;"

    :try_start_2
    new-array v2, v11, [Ljava/lang/Object;

    iget-object v3, v9, La/a/a/f/b;->k:Ljava/lang/StringBuffer;

    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v10

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, v9, La/a/a/f/b;->h:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v2, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    iget-object v0, v9, La/a/a/f/b;->i:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    :cond_1
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/Long;Lcom/baidu/location/c;)V
    .locals 6

    if-eqz p1, :cond_1

    const-string v0, "UPDATE CL SET frequency=frequency+1 WHERE id = %d;"

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz p3, :cond_0

    sget-object p3, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v4, v2, [Ljava/lang/Object;

    aput-object p2, v4, v3

    invoke-static {p3, v0, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    :try_start_0
    iget-object v0, p0, La/a/a/f/b;->h:Landroid/database/sqlite/SQLiteDatabase;

    :goto_0
    invoke-virtual {v0, p3}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_0
    sget-object p3, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v4, v1, [Ljava/lang/Object;

    aput-object p2, v4, v3

    aput-object p1, v4, v2

    const-string v5, "INSERT OR IGNORE INTO CL VALUES (%d,\"%s\",0);"

    invoke-static {p3, v5, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    new-array v5, v2, [Ljava/lang/Object;

    aput-object p2, v5, v3

    invoke-static {p3, v0, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    :try_start_1
    iget-object v0, p0, La/a/a/f/b;->i:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    iget-object v0, p0, La/a/a/f/b;->i:Landroid/database/sqlite/SQLiteDatabase;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    :goto_1
    iget-boolean p3, p0, La/a/a/f/b;->p:Z

    if-eqz p3, :cond_1

    sget-object p3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p2, v0, v3

    aput-object p1, v0, v2

    const p1, 0x186a0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v0, v1

    const-string p1, "INSERT OR IGNORE INTO CL VALUES (%d,\"%s\",%d);"

    invoke-static {p3, p1, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :try_start_2
    iget-object p0, p0, La/a/a/f/b;->i:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {p0, p1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    :cond_1
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iget-object p0, p0, La/a/a/f/b;->f:La/a/a/f/b$d;

    invoke-static {p0, p1, p2, p3}, La/a/a/f/b$d;->a(La/a/a/f/b$d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final a(Ljava/util/LinkedHashMap;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->size()I

    move-result p1

    if-lez p1, :cond_7

    new-instance p1, Ljava/lang/StringBuffer;

    invoke-direct {p1}, Ljava/lang/StringBuffer;-><init>()V

    iput-object p1, p0, La/a/a/f/b;->j:Ljava/lang/StringBuffer;

    new-instance p1, Ljava/lang/StringBuffer;

    invoke-direct {p1}, Ljava/lang/StringBuffer;-><init>()V

    iput-object p1, p0, La/a/a/f/b;->k:Ljava/lang/StringBuffer;

    new-instance p1, Ljava/lang/StringBuffer;

    invoke-direct {p1}, Ljava/lang/StringBuffer;-><init>()V

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    iget-object v1, p0, La/a/a/f/b;->m:Ljava/util/concurrent/ConcurrentMap;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    invoke-interface {v1}, Ljava/util/concurrent/ConcurrentMap;->keySet()Ljava/util/Set;

    move-result-object v1

    if-eqz v1, :cond_3

    iget-object v1, p0, La/a/a/f/b;->m:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v1}, Ljava/util/concurrent/ConcurrentMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move v4, v3

    move v5, v4

    :catch_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    :try_start_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Long;

    iget-object v7, p0, La/a/a/f/b;->l:Ljava/util/HashSet;

    invoke-virtual {v7, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v7

    const/16 v8, 0x28

    const/16 v9, 0x22

    const/16 v10, 0x2c

    if-eqz v7, :cond_1

    if-eqz v5, :cond_0

    move v5, v2

    goto :goto_1

    :cond_0
    iget-object v7, p0, La/a/a/f/b;->j:Ljava/lang/StringBuffer;

    invoke-virtual {v7, v10}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    iget-object v7, p0, La/a/a/f/b;->k:Ljava/lang/StringBuffer;

    invoke-virtual {v7, v10}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    :goto_1
    iget-object v7, p0, La/a/a/f/b;->j:Ljava/lang/StringBuffer;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    iget-object v7, p0, La/a/a/f/b;->n:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v7, v6}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    iget-object v11, p0, La/a/a/f/b;->k:Ljava/lang/StringBuffer;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v11, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    const v6, 0x186a0

    invoke-virtual {v11, v6}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    const/16 v6, 0x29

    invoke-virtual {v11, v6}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto :goto_0

    :cond_1
    iget-object v7, p0, La/a/a/f/b;->n:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v7, v6}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    if-eqz v4, :cond_2

    move v4, v2

    goto :goto_2

    :cond_2
    invoke-virtual {p1, v10}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    :goto_2
    invoke-virtual {p1, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    const-string v6, ",0)"

    invoke-virtual {v0, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :cond_3
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v4, v3, [Ljava/lang/Object;

    iget-object v5, p0, La/a/a/f/b;->j:Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v2

    const-string v5, "UPDATE AP SET frequency=frequency+1 WHERE id IN(%s)"

    invoke-static {v1, v5, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    :try_start_1
    iget-object v4, p0, La/a/a/f/b;->h:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v4, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    iget-object v1, p0, La/a/a/f/b;->o:Ljava/lang/StringBuffer;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->length()I

    move-result v1

    if-lez v1, :cond_5

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->length()I

    move-result v1

    if-lez v1, :cond_4

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_4
    iget-object v1, p0, La/a/a/f/b;->o:Ljava/lang/StringBuffer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;

    :cond_5
    const-string v1, "INSERT OR IGNORE INTO AP VALUES %s;"

    :try_start_2
    new-array v4, v3, [Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-static {v1, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    const-string v4, "UPDATE AP SET frequency=frequency+1 WHERE id in (%s);"

    :try_start_3
    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v2

    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->length()I

    move-result v0

    if-lez v0, :cond_6

    iget-object v0, p0, La/a/a/f/b;->i:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    :cond_6
    invoke-virtual {p1}, Ljava/lang/StringBuffer;->length()I

    move-result p1

    if-lez p1, :cond_7

    iget-object p0, p0, La/a/a/f/b;->i:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {p0, v2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    :catch_2
    :cond_7
    return-void
.end method

.method public final a([Ljava/lang/String;)V
    .locals 0

    iget-object p0, p0, La/a/a/f/b;->a:La/a/a/f/d;

    invoke-virtual {p0}, La/a/a/f/d;->c()La/a/a/f/c;

    move-result-object p0

    invoke-virtual {p0, p1}, La/a/a/f/c;->a([Ljava/lang/String;)V

    return-void
.end method

.method public b()V
    .locals 0

    iget-object p0, p0, La/a/a/f/b;->g:La/a/a/f/b$d;

    invoke-virtual {p0}, La/a/a/f/b$d;->i()V

    return-void
.end method
