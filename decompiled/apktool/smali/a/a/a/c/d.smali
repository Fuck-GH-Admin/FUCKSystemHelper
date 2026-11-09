.class public La/a/a/c/d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/a/a/c/d$b;
    }
.end annotation


# static fields
.field public static d:La/a/a/c/d;

.field public static final e:Ljava/lang/String;

.field public static f:I

.field public static g:I

.field public static h:I


# instance fields
.field public a:La/a/a/c/d$b;

.field public b:J

.field public c:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, La/a/a/i/h;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/conlts.dat"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, La/a/a/c/d;->e:Ljava/lang/String;

    const/4 v0, -0x1

    sput v0, La/a/a/c/d;->f:I

    sput v0, La/a/a/c/d;->g:I

    const/4 v0, 0x0

    sput v0, La/a/a/c/d;->h:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, La/a/a/c/d;->a:La/a/a/c/d$b;

    const-wide/32 v0, 0x93a80

    iput-wide v0, p0, La/a/a/c/d;->b:J

    const/4 v0, 0x1

    iput-boolean v0, p0, La/a/a/c/d;->c:Z

    return-void
.end method

.method public static synthetic a(La/a/a/c/d;)V
    .locals 0

    invoke-virtual {p0}, La/a/a/c/d;->a()V

    return-void
.end method

.method public static synthetic a(La/a/a/c/d;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, La/a/a/c/d;->b(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic a(La/a/a/c/d;[B)V
    .locals 0

    invoke-virtual {p0, p1}, La/a/a/c/d;->a([B)V

    return-void
.end method

.method public static j()La/a/a/c/d;
    .locals 1

    sget-object v0, La/a/a/c/d;->d:La/a/a/c/d;

    if-nez v0, :cond_0

    new-instance v0, La/a/a/c/d;

    invoke-direct {v0}, La/a/a/c/d;-><init>()V

    sput-object v0, La/a/a/c/d;->d:La/a/a/c/d;

    :cond_0
    sget-object v0, La/a/a/c/d;->d:La/a/a/c/d;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&ver="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v1, La/a/a/i/i;->v:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "&usr="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, La/a/a/i/b;->e()La/a/a/i/b;

    move-result-object v1

    invoke-virtual {v1}, La/a/a/i/b;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&app="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, La/a/a/i/b;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&prod="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, La/a/a/i/b;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, La/a/a/c/d;->a:La/a/a/c/d$b;

    if-nez v1, :cond_0

    new-instance v1, La/a/a/c/d$b;

    invoke-direct {v1, p0}, La/a/a/c/d$b;-><init>(La/a/a/c/d;)V

    iput-object v1, p0, La/a/a/c/d;->a:La/a/a/c/d$b;

    :cond_0
    invoke-static {}, La/a/a/i/i;->l()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object p0, p0, La/a/a/c/d;->a:La/a/a/c/d$b;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, La/a/a/c/d$b;->a(Ljava/lang/String;Z)V

    :cond_1
    return-void
.end method

.method public final a(I)V
    .locals 1

    const/4 v0, 0x1

    and-int/2addr p1, v0

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, La/a/a/c/d;->c:Z

    return-void
.end method

.method public final a(Lorg/json/JSONObject;)V
    .locals 7

    const-string p0, "ipvn"

    const-string v0, "ipvt"

    const-string v1, "ipen"

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 v2, 0x1

    const v3, 0xdbba00

    const/16 v4, 0xa

    :try_start_0
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_1

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_1

    move v2, v6

    :cond_1
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    :cond_2
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v4

    :cond_3
    invoke-static {}, Lcom/baidu/location/f;->c()Landroid/content/Context;

    move-result-object p0

    const-string p1, "MapCoreServicePre"

    invoke-virtual {p0, p1, v6}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    const-string p1, "ipLocInfoUpload"

    invoke-interface {p0, p1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    const-string p1, "ipValidTime"

    invoke-interface {p0, p1, v3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    const-string p1, "ipLocInfoUploadTimesPerDay"

    invoke-interface {p0, p1, v4}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public final a([B)V
    .locals 16

    move-object/from16 v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    goto/16 :goto_2

    :cond_0
    :try_start_0
    array-length v3, v0

    const/16 v4, 0x280

    if-ge v3, v4, :cond_1

    sput-boolean v1, La/a/a/i/i;->u:Z

    sget-wide v0, La/a/a/i/i;->p:D

    const-wide v3, 0x3f9999999999999aL    # 0.025

    add-double/2addr v0, v3

    sput-wide v0, La/a/a/i/i;->r:D

    sget-wide v0, La/a/a/i/i;->o:D

    sub-double/2addr v0, v3

    sput-wide v0, La/a/a/i/i;->q:D

    goto/16 :goto_1

    :cond_1
    sput-boolean v2, La/a/a/i/i;->u:Z

    const/4 v3, 0x7

    aget-byte v3, v0, v3

    int-to-long v3, v3

    const-wide/16 v5, 0xff

    and-long/2addr v3, v5

    const/16 v7, 0x38

    shl-long/2addr v3, v7

    const/4 v8, 0x6

    aget-byte v8, v0, v8

    int-to-long v8, v8

    and-long/2addr v8, v5

    const/16 v10, 0x30

    shl-long/2addr v8, v10

    or-long/2addr v3, v8

    const/4 v8, 0x5

    aget-byte v8, v0, v8

    int-to-long v8, v8

    and-long/2addr v8, v5

    const/16 v11, 0x28

    shl-long/2addr v8, v11

    or-long/2addr v3, v8

    const/4 v8, 0x4

    aget-byte v8, v0, v8

    int-to-long v8, v8

    and-long/2addr v8, v5

    const/16 v12, 0x20

    shl-long/2addr v8, v12

    or-long/2addr v3, v8

    const/4 v8, 0x3

    aget-byte v8, v0, v8

    int-to-long v8, v8

    and-long/2addr v8, v5

    const/16 v13, 0x18

    shl-long/2addr v8, v13

    or-long/2addr v3, v8

    const/4 v8, 0x2

    aget-byte v8, v0, v8

    int-to-long v8, v8

    and-long/2addr v8, v5

    const/16 v14, 0x10

    shl-long/2addr v8, v14

    or-long/2addr v3, v8

    aget-byte v8, v0, v2

    int-to-long v8, v8

    and-long/2addr v8, v5

    const/16 v15, 0x8

    shl-long/2addr v8, v15

    or-long/2addr v3, v8

    aget-byte v8, v0, v1

    int-to-long v8, v8

    and-long/2addr v8, v5

    or-long/2addr v3, v8

    invoke-static {v3, v4}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v3

    sput-wide v3, La/a/a/i/i;->q:D

    const/16 v3, 0xf

    aget-byte v3, v0, v3

    int-to-long v3, v3

    and-long/2addr v3, v5

    shl-long/2addr v3, v7

    const/16 v7, 0xe

    aget-byte v7, v0, v7

    int-to-long v7, v7

    and-long/2addr v7, v5

    shl-long/2addr v7, v10

    or-long/2addr v3, v7

    const/16 v7, 0xd

    aget-byte v7, v0, v7

    int-to-long v7, v7

    and-long/2addr v7, v5

    shl-long/2addr v7, v11

    or-long/2addr v3, v7

    const/16 v7, 0xc

    aget-byte v7, v0, v7

    int-to-long v7, v7

    and-long/2addr v7, v5

    shl-long/2addr v7, v12

    or-long/2addr v3, v7

    const/16 v7, 0xb

    aget-byte v7, v0, v7

    int-to-long v7, v7

    and-long/2addr v7, v5

    shl-long/2addr v7, v13

    or-long/2addr v3, v7

    const/16 v7, 0xa

    aget-byte v7, v0, v7

    int-to-long v7, v7

    and-long/2addr v7, v5

    shl-long/2addr v7, v14

    or-long/2addr v3, v7

    const/16 v7, 0x9

    aget-byte v7, v0, v7

    int-to-long v7, v7

    and-long/2addr v7, v5

    shl-long/2addr v7, v15

    or-long/2addr v3, v7

    aget-byte v7, v0, v15

    int-to-long v7, v7

    and-long/2addr v5, v7

    or-long/2addr v3, v5

    invoke-static {v3, v4}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v3

    sput-wide v3, La/a/a/i/i;->r:D

    const/16 v3, 0x271

    new-array v4, v3, [B

    sput-object v4, La/a/a/i/i;->t:[B

    :goto_0
    if-ge v1, v3, :cond_2

    sget-object v4, La/a/a/i/i;->t:[B

    add-int/lit8 v5, v1, 0x10

    aget-byte v5, v0, v5

    aput-byte v5, v4, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    move v1, v2

    :goto_2
    if-eqz v1, :cond_3

    invoke-virtual/range {p0 .. p0}, La/a/a/c/d;->g()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_3
    return-void
.end method

.method public final a(Ljava/lang/String;)Z
    .locals 17

    move-object/from16 v0, p1

    const-string v1, "shak"

    const-string v2, "gpc"

    const-string v3, "zxd"

    const-string v4, "ab"

    const-string v5, "wf"

    const-string v6, "up"

    const-string v7, "gps"

    const-string v8, "is_check_Per"

    const-string v9, "ipconf"

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-eqz v0, :cond_2a

    :try_start_0
    new-instance v12, Lorg/json/JSONObject;

    invoke-direct {v12, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v9}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    if-eqz v0, :cond_0

    :try_start_1
    invoke-virtual {v12, v9}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    move-object/from16 v9, p0

    invoke-virtual {v9, v0}, La/a/a/c/d;->a(Lorg/json/JSONObject;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :cond_0
    :try_start_2
    invoke-virtual {v12, v8}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    if-eqz v0, :cond_1

    :try_start_3
    invoke-virtual {v12, v8}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_1

    sput-boolean v10, La/a/a/i/i;->p0:Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    :catch_1
    :cond_1
    :try_start_4
    const-string v0, "ver"

    invoke-virtual {v12, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget v8, La/a/a/i/i;->v:I

    if-le v0, v8, :cond_2a

    sput v0, La/a/a/i/i;->v:I

    invoke-virtual {v12, v7}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    const-string v9, "\\|"

    const/4 v14, 0x3

    const/4 v15, 0x2

    const-string v8, ""

    if-eqz v0, :cond_c

    :try_start_5
    invoke-virtual {v12, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    array-length v7, v0

    const/16 v13, 0xa

    if-le v7, v13, :cond_c

    aget-object v7, v0, v11

    if-eqz v7, :cond_2

    aget-object v7, v0, v11

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2

    aget-object v7, v0, v11

    invoke-static {v7}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v7

    sput v7, La/a/a/i/i;->w:F

    :cond_2
    aget-object v7, v0, v10

    if-eqz v7, :cond_3

    aget-object v7, v0, v10

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    aget-object v7, v0, v10

    invoke-static {v7}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v7

    sput v7, La/a/a/i/i;->x:F

    :cond_3
    aget-object v7, v0, v15

    if-eqz v7, :cond_4

    aget-object v7, v0, v15

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_4

    aget-object v7, v0, v15

    invoke-static {v7}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v7

    sput v7, La/a/a/i/i;->y:F

    :cond_4
    aget-object v7, v0, v14

    if-eqz v7, :cond_5

    aget-object v7, v0, v14

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_5

    aget-object v7, v0, v14

    invoke-static {v7}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v7

    sput v7, La/a/a/i/i;->z:F

    :cond_5
    const/4 v7, 0x4

    aget-object v16, v0, v7

    if-eqz v16, :cond_6

    aget-object v15, v0, v7

    invoke-virtual {v15, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_6

    aget-object v15, v0, v7

    invoke-static {v15}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    sput v7, La/a/a/i/i;->A:I

    :cond_6
    const/4 v7, 0x5

    aget-object v15, v0, v7

    if-eqz v15, :cond_7

    aget-object v15, v0, v7

    invoke-virtual {v15, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_7

    aget-object v15, v0, v7

    invoke-static {v15}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    sput v7, La/a/a/i/i;->B:I

    :cond_7
    const/4 v7, 0x6

    aget-object v15, v0, v7

    if-eqz v15, :cond_8

    aget-object v15, v0, v7

    invoke-virtual {v15, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_8

    aget-object v7, v0, v7

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    sput v7, La/a/a/i/i;->C:I

    :cond_8
    const/4 v7, 0x7

    aget-object v15, v0, v7

    if-eqz v15, :cond_9

    aget-object v15, v0, v7

    invoke-virtual {v15, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_9

    aget-object v7, v0, v7

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    sput v7, La/a/a/i/i;->D:I

    :cond_9
    const/16 v7, 0x8

    aget-object v15, v0, v7

    if-eqz v15, :cond_a

    aget-object v15, v0, v7

    invoke-virtual {v15, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_a

    aget-object v7, v0, v7

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    sput v7, La/a/a/i/i;->E:I

    :cond_a
    const/16 v7, 0x9

    aget-object v15, v0, v7

    if-eqz v15, :cond_b

    aget-object v15, v0, v7

    invoke-virtual {v15, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_b

    aget-object v7, v0, v7

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    sput v7, La/a/a/i/i;->F:I

    :cond_b
    aget-object v7, v0, v13

    if-eqz v7, :cond_c

    aget-object v7, v0, v13

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_c

    aget-object v0, v0, v13

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sput v0, La/a/a/i/i;->G:I

    :cond_c
    invoke-virtual {v12, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-virtual {v12, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    array-length v6, v0

    if-le v6, v14, :cond_10

    aget-object v6, v0, v11

    if-eqz v6, :cond_d

    aget-object v6, v0, v11

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_d

    aget-object v6, v0, v11

    invoke-static {v6}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v6

    sput v6, La/a/a/i/i;->H:F

    :cond_d
    aget-object v6, v0, v10

    if-eqz v6, :cond_e

    aget-object v6, v0, v10

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_e

    aget-object v6, v0, v10

    invoke-static {v6}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v6

    sput v6, La/a/a/i/i;->I:F

    :cond_e
    const/4 v6, 0x2

    aget-object v7, v0, v6

    if-eqz v7, :cond_f

    aget-object v7, v0, v6

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_f

    aget-object v7, v0, v6

    invoke-static {v7}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v6

    sput v6, La/a/a/i/i;->J:F

    :cond_f
    aget-object v6, v0, v14

    if-eqz v6, :cond_10

    aget-object v6, v0, v14

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_10

    aget-object v0, v0, v14

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sput v0, La/a/a/i/i;->K:F

    :cond_10
    invoke-virtual {v12, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-virtual {v12, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    array-length v5, v0

    if-le v5, v14, :cond_14

    aget-object v5, v0, v11

    if-eqz v5, :cond_11

    aget-object v5, v0, v11

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_11

    aget-object v5, v0, v11

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    sput v5, La/a/a/i/i;->L:I

    :cond_11
    aget-object v5, v0, v10

    if-eqz v5, :cond_12

    aget-object v5, v0, v10

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_12

    aget-object v5, v0, v10

    invoke-static {v5}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v5

    sput v5, La/a/a/i/i;->M:F

    :cond_12
    const/4 v5, 0x2

    aget-object v6, v0, v5

    if-eqz v6, :cond_13

    aget-object v6, v0, v5

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_13

    aget-object v6, v0, v5

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    sput v5, La/a/a/i/i;->N:I

    :cond_13
    aget-object v5, v0, v14

    if-eqz v5, :cond_14

    aget-object v5, v0, v14

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_14

    aget-object v0, v0, v14

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sput v0, La/a/a/i/i;->O:F

    :cond_14
    invoke-virtual {v12, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-virtual {v12, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    array-length v4, v0

    if-le v4, v14, :cond_18

    aget-object v4, v0, v11

    if-eqz v4, :cond_15

    aget-object v4, v0, v11

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_15

    aget-object v4, v0, v11

    invoke-static {v4}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v4

    sput v4, La/a/a/i/i;->P:F

    :cond_15
    aget-object v4, v0, v10

    if-eqz v4, :cond_16

    aget-object v4, v0, v10

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_16

    aget-object v4, v0, v10

    invoke-static {v4}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v4

    sput v4, La/a/a/i/i;->Q:F

    :cond_16
    const/4 v4, 0x2

    aget-object v5, v0, v4

    if-eqz v5, :cond_17

    aget-object v5, v0, v4

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_17

    aget-object v5, v0, v4

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    sput v4, La/a/a/i/i;->R:I

    :cond_17
    aget-object v4, v0, v14

    if-eqz v4, :cond_18

    aget-object v4, v0, v14

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_18

    aget-object v0, v0, v14

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sput v0, La/a/a/i/i;->S:I

    :cond_18
    invoke-virtual {v12, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1d

    invoke-virtual {v12, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    array-length v3, v0

    const/4 v4, 0x4

    if-le v3, v4, :cond_1d

    aget-object v3, v0, v11

    if-eqz v3, :cond_19

    aget-object v3, v0, v11

    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_19

    aget-object v3, v0, v11

    invoke-static {v3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v3

    sput v3, La/a/a/i/i;->j0:F

    :cond_19
    aget-object v3, v0, v10

    if-eqz v3, :cond_1a

    aget-object v3, v0, v10

    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1a

    aget-object v3, v0, v10

    invoke-static {v3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v3

    sput v3, La/a/a/i/i;->k0:F

    :cond_1a
    const/4 v3, 0x2

    aget-object v4, v0, v3

    if-eqz v4, :cond_1b

    aget-object v4, v0, v3

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1b

    aget-object v4, v0, v3

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    sput v3, La/a/a/i/i;->l0:I

    :cond_1b
    aget-object v3, v0, v14

    if-eqz v3, :cond_1c

    aget-object v3, v0, v14

    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1c

    aget-object v3, v0, v14

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    sput v3, La/a/a/i/i;->m0:I

    :cond_1c
    const/4 v3, 0x4

    aget-object v4, v0, v3

    if-eqz v4, :cond_1d

    aget-object v4, v0, v3

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1d

    aget-object v0, v0, v3

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sput v0, La/a/a/i/i;->n0:I

    :cond_1d
    invoke-virtual {v12, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_26

    invoke-virtual {v12, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    array-length v2, v0

    const/4 v3, 0x5

    if-le v2, v3, :cond_26

    aget-object v2, v0, v11

    if-eqz v2, :cond_1f

    aget-object v2, v0, v11

    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1f

    aget-object v2, v0, v11

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    if-lez v2, :cond_1e

    sput-boolean v10, La/a/a/i/i;->W:Z

    goto :goto_0

    :cond_1e
    sput-boolean v11, La/a/a/i/i;->W:Z

    :cond_1f
    :goto_0
    aget-object v2, v0, v10

    if-eqz v2, :cond_21

    aget-object v2, v0, v10

    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_21

    aget-object v2, v0, v10

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    if-lez v2, :cond_20

    sput-boolean v10, La/a/a/i/i;->X:Z

    goto :goto_1

    :cond_20
    sput-boolean v11, La/a/a/i/i;->X:Z

    :cond_21
    :goto_1
    const/4 v2, 0x2

    aget-object v3, v0, v2

    if-eqz v3, :cond_22

    aget-object v3, v0, v2

    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_22

    aget-object v3, v0, v2

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    sput v2, La/a/a/i/i;->Y:I

    :cond_22
    aget-object v2, v0, v14

    if-eqz v2, :cond_23

    aget-object v2, v0, v14

    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_23

    aget-object v2, v0, v14

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    sput v2, La/a/a/i/i;->Z:I

    :cond_23
    const/4 v2, 0x4

    aget-object v3, v0, v2

    if-eqz v3, :cond_25

    aget-object v3, v0, v2

    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_25

    aget-object v2, v0, v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    if-lez v2, :cond_24

    int-to-long v2, v2

    sput-wide v2, La/a/a/i/i;->c0:J

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    const-wide/16 v4, 0x3c

    mul-long/2addr v2, v4

    sput-wide v2, La/a/a/i/i;->b0:J

    const/4 v4, 0x2

    shr-long/2addr v2, v4

    sput-wide v2, La/a/a/i/i;->d0:J

    goto :goto_2

    :cond_24
    sput-boolean v11, La/a/a/i/i;->m:Z

    :cond_25
    :goto_2
    const/4 v2, 0x5

    aget-object v3, v0, v2

    if-eqz v3, :cond_26

    aget-object v3, v0, v2

    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_26

    aget-object v0, v0, v2

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sput v0, La/a/a/i/i;->f0:I

    :cond_26
    invoke-virtual {v12, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_29

    invoke-virtual {v12, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x2

    if-le v1, v2, :cond_29

    aget-object v1, v0, v11

    if-eqz v1, :cond_27

    aget-object v1, v0, v11

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_27

    aget-object v1, v0, v11

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    sput v1, La/a/a/i/i;->g0:I

    :cond_27
    aget-object v1, v0, v10

    if-eqz v1, :cond_28

    aget-object v1, v0, v10

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_28

    aget-object v1, v0, v10

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    sput v1, La/a/a/i/i;->h0:I

    :cond_28
    const/4 v1, 0x2

    aget-object v2, v0, v1

    if-eqz v2, :cond_29

    aget-object v2, v0, v1

    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_29

    aget-object v0, v0, v1

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sput v0, La/a/a/i/i;->i0:F

    :cond_29
    const-string v0, "dmx"

    invoke-virtual {v12, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2b

    const-string v0, "dmx"

    invoke-virtual {v12, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    sput v0, La/a/a/i/i;->e0:I
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    goto :goto_3

    :catch_2
    :cond_2a
    move v10, v11

    :cond_2b
    :goto_3
    return v10
.end method

.method public final b()V
    .locals 3

    :try_start_0
    new-instance p0, Ljava/io/File;

    sget-object v0, La/a/a/c/d;->e:Ljava/lang/String;

    invoke-direct {p0, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Ljava/io/File;

    sget-object v1, La/a/a/i/h;->a:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->createNewFile()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 p0, 0x0

    :cond_1
    new-instance v0, Ljava/io/RandomAccessFile;

    const-string v1, "rw"

    invoke-direct {v0, p0, v1}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V

    const/4 p0, 0x0

    invoke-virtual {v0, p0}, Ljava/io/RandomAccessFile;->writeInt(I)V

    const/16 v1, 0x80

    invoke-virtual {v0, v1}, Ljava/io/RandomAccessFile;->writeInt(I)V

    invoke-virtual {v0, p0}, Ljava/io/RandomAccessFile;->writeInt(I)V

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_2
    return-void
.end method

.method public final b(I)V
    .locals 4

    new-instance v0, Ljava/io/File;

    sget-object v1, La/a/a/c/d;->e:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, La/a/a/c/d;->b()V

    :cond_0
    :try_start_0
    new-instance p0, Ljava/io/RandomAccessFile;

    const-string v1, "rw"

    invoke-direct {p0, v0, v1}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const-wide/16 v0, 0x4

    invoke-virtual {p0, v0, v1}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v0

    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v1

    sget v2, La/a/a/c/d;->h:I

    mul-int/2addr v0, v2

    add-int/lit16 v0, v0, 0x80

    int-to-long v2, v0

    invoke-virtual {p0, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, La/a/a/i/b;->f:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    array-length v3, v0

    invoke-virtual {p0, v3}, Ljava/io/RandomAccessFile;->writeInt(I)V

    array-length v3, v0

    invoke-virtual {p0, v0, v2, v3}, Ljava/io/RandomAccessFile;->write([BII)V

    invoke-virtual {p0, p1}, Ljava/io/RandomAccessFile;->writeInt(I)V

    sget p1, La/a/a/c/d;->h:I

    if-ne v1, p1, :cond_1

    const-wide/16 v2, 0x8

    invoke-virtual {p0, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {p0, v1}, Ljava/io/RandomAccessFile;->writeInt(I)V

    :cond_1
    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 3

    const-string v0, "ctr"

    const/4 v1, -0x1

    sput v1, La/a/a/c/d;->g:I

    if-eqz p1, :cond_4

    :try_start_0
    invoke-virtual {p0, p1}, La/a/a/c/d;->a(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, La/a/a/c/d;->f()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    :try_start_1
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    sput p1, La/a/a/c/d;->g:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_1
    :try_start_2
    invoke-virtual {p0}, La/a/a/c/d;->e()V

    sget p1, La/a/a/c/d;->g:I

    if-eq p1, v1, :cond_2

    invoke-virtual {p0, p1}, La/a/a/c/d;->b(I)V

    goto :goto_0

    :cond_2
    sget p1, La/a/a/c/d;->f:I

    if-eq p1, v1, :cond_3

    goto :goto_0

    :cond_3
    move p1, v1

    :goto_0
    if-eq p1, v1, :cond_4

    invoke-virtual {p0, p1}, La/a/a/c/d;->a(I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :cond_4
    return-void
.end method

.method public c()V
    .locals 6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {}, La/a/a/i/e;->c()La/a/a/i/e;

    move-result-object v2

    invoke-virtual {v2}, La/a/a/i/e;->b()J

    move-result-wide v2

    sub-long/2addr v0, v2

    iget-wide v2, p0, La/a/a/c/d;->b:J

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    invoke-static {}, La/a/a/i/e;->c()La/a/a/i/e;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, La/a/a/i/e;->b(J)V

    invoke-static {}, La/a/a/h/a;->e()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, La/a/a/c/d$a;

    invoke-direct {v1, p0}, La/a/a/c/d$a;-><init>(La/a/a/c/d;)V

    invoke-virtual {v0, v1, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method public final d()V
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, La/a/a/i/h;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/config.dat"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :try_start_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Ljava/io/RandomAccessFile;

    const-string v2, "rw"

    invoke-direct {v0, v1, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readBoolean()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    const-wide/16 v3, 0x2

    invoke-virtual {v0, v3, v4}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v1

    new-array v3, v1, [B

    invoke-virtual {v0, v3, v2, v1}, Ljava/io/RandomAccessFile;->read([BII)I

    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v3}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {p0, v1}, La/a/a/c/d;->a(Ljava/lang/String;)Z

    :cond_0
    const-wide/16 v3, 0x1

    invoke-virtual {v0, v3, v4}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readBoolean()Z

    move-result p0

    if-eqz p0, :cond_1

    const-wide/16 v3, 0x400

    invoke-virtual {v0, v3, v4}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readDouble()D

    move-result-wide v3

    sput-wide v3, La/a/a/i/i;->q:D

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readDouble()D

    move-result-wide v3

    sput-wide v3, La/a/a/i/i;->r:D

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readBoolean()Z

    move-result p0

    sput-boolean p0, La/a/a/i/i;->u:Z

    if-eqz p0, :cond_1

    const/16 p0, 0x271

    new-array v1, p0, [B

    sput-object v1, La/a/a/i/i;->t:[B

    invoke-virtual {v0, v1, v2, p0}, Ljava/io/RandomAccessFile;->read([BII)I

    :cond_1
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_2
    sget-boolean p0, La/a/a/i/i;->m:Z

    if-eqz p0, :cond_3

    sget-boolean p0, Lcom/baidu/location/f;->f:Z

    :cond_3
    return-void
.end method

.method public final e()V
    .locals 7

    :try_start_0
    new-instance v0, Ljava/io/File;

    sget-object v1, La/a/a/c/d;->e:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_4

    new-instance v1, Ljava/io/RandomAccessFile;

    const-string v2, "rw"

    invoke-direct {v1, v0, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const-wide/16 v2, 0x4

    invoke-virtual {v1, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v0

    const/16 v2, 0xbb8

    const/4 v3, 0x0

    if-le v0, v2, :cond_0

    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V

    sput v3, La/a/a/c/d;->h:I

    invoke-virtual {p0}, La/a/a/c/d;->b()V

    return-void

    :cond_0
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->readInt()I

    move-result p0

    const-wide/16 v4, 0x80

    invoke-virtual {v1, v4, v5}, Ljava/io/RandomAccessFile;->seek(J)V

    new-array v2, v0, [B

    move v4, v3

    :goto_0
    if-ge v4, p0, :cond_2

    mul-int v5, v0, v4

    add-int/lit16 v5, v5, 0x80

    int-to-long v5, v5

    invoke-virtual {v1, v5, v6}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v5

    if-lez v5, :cond_1

    if-ge v5, v0, :cond_1

    invoke-virtual {v1, v2, v3, v5}, Ljava/io/RandomAccessFile;->read([BII)I

    add-int/lit8 v5, v5, -0x1

    aget-byte v6, v2, v5

    if-nez v6, :cond_1

    new-instance v6, Ljava/lang/String;

    invoke-direct {v6, v2, v3, v5}, Ljava/lang/String;-><init>([BII)V

    invoke-static {}, La/a/a/i/b;->e()La/a/a/i/b;

    sget-object v5, La/a/a/i/b;->f:Ljava/lang/String;

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v0

    sput v0, La/a/a/c/d;->f:I

    sput v4, La/a/a/c/d;->h:I

    goto :goto_1

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    if-ne v4, p0, :cond_3

    sput p0, La/a/a/c/d;->h:I

    :cond_3
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_4
    return-void
.end method

.method public final f()V
    .locals 8

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v0, La/a/a/i/h;->a:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/config.dat"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    sget-boolean v0, La/a/a/i/i;->W:Z

    sget-boolean v1, La/a/a/i/i;->X:Z

    sget-object v2, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    const/16 v3, 0x27

    new-array v3, v3, [Ljava/lang/Object;

    sget v4, La/a/a/i/i;->v:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    sget v4, La/a/a/i/i;->w:F

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    const/4 v6, 0x1

    aput-object v4, v3, v6

    sget v4, La/a/a/i/i;->x:F

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    const/4 v7, 0x2

    aput-object v4, v3, v7

    sget v4, La/a/a/i/i;->y:F

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    const/4 v7, 0x3

    aput-object v4, v3, v7

    sget v4, La/a/a/i/i;->z:F

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    const/4 v7, 0x4

    aput-object v4, v3, v7

    sget v4, La/a/a/i/i;->A:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v7, 0x5

    aput-object v4, v3, v7

    sget v4, La/a/a/i/i;->B:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v7, 0x6

    aput-object v4, v3, v7

    sget v4, La/a/a/i/i;->C:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v7, 0x7

    aput-object v4, v3, v7

    sget v4, La/a/a/i/i;->D:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v7, 0x8

    aput-object v4, v3, v7

    sget v4, La/a/a/i/i;->E:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v7, 0x9

    aput-object v4, v3, v7

    sget v4, La/a/a/i/i;->F:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v7, 0xa

    aput-object v4, v3, v7

    sget v4, La/a/a/i/i;->G:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v7, 0xb

    aput-object v4, v3, v7

    sget v4, La/a/a/i/i;->H:F

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    const/16 v7, 0xc

    aput-object v4, v3, v7

    sget v4, La/a/a/i/i;->I:F

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    const/16 v7, 0xd

    aput-object v4, v3, v7

    sget v4, La/a/a/i/i;->J:F

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    const/16 v7, 0xe

    aput-object v4, v3, v7

    sget v4, La/a/a/i/i;->K:F

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    const/16 v7, 0xf

    aput-object v4, v3, v7

    sget v4, La/a/a/i/i;->L:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v7, 0x10

    aput-object v4, v3, v7

    sget v4, La/a/a/i/i;->M:F

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    const/16 v7, 0x11

    aput-object v4, v3, v7

    sget v4, La/a/a/i/i;->N:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v7, 0x12

    aput-object v4, v3, v7

    sget v4, La/a/a/i/i;->O:F

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    const/16 v7, 0x13

    aput-object v4, v3, v7

    sget v4, La/a/a/i/i;->P:F

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    const/16 v7, 0x14

    aput-object v4, v3, v7

    sget v4, La/a/a/i/i;->Q:F

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    const/16 v7, 0x15

    aput-object v4, v3, v7

    sget v4, La/a/a/i/i;->R:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v7, 0x16

    aput-object v4, v3, v7

    sget v4, La/a/a/i/i;->S:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v7, 0x17

    aput-object v4, v3, v7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v4, 0x18

    aput-object v0, v3, v4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x19

    aput-object v0, v3, v1

    sget v0, La/a/a/i/i;->Y:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x1a

    aput-object v0, v3, v1

    sget v0, La/a/a/i/i;->Z:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x1b

    aput-object v0, v3, v1

    sget-wide v0, La/a/a/i/i;->c0:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const/16 v1, 0x1c

    aput-object v0, v3, v1

    sget v0, La/a/a/i/i;->f0:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x1d

    aput-object v0, v3, v1

    sget v0, La/a/a/i/i;->j0:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const/16 v1, 0x1e

    aput-object v0, v3, v1

    sget v0, La/a/a/i/i;->k0:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const/16 v1, 0x1f

    aput-object v0, v3, v1

    sget v0, La/a/a/i/i;->l0:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x20

    aput-object v0, v3, v1

    sget v0, La/a/a/i/i;->m0:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x21

    aput-object v0, v3, v1

    sget v0, La/a/a/i/i;->n0:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x22

    aput-object v0, v3, v1

    sget v0, La/a/a/i/i;->g0:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x23

    aput-object v0, v3, v1

    sget v0, La/a/a/i/i;->h0:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x24

    aput-object v0, v3, v1

    sget v0, La/a/a/i/i;->i0:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const/16 v1, 0x25

    aput-object v0, v3, v1

    sget v0, La/a/a/i/i;->e0:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x26

    aput-object v0, v3, v1

    const-string v0, "{\"ver\":\"%d\",\"gps\":\"%.1f|%.1f|%.1f|%.1f|%d|%d|%d|%d|%d|%d|%d\",\"up\":\"%.1f|%.1f|%.1f|%.1f\",\"wf\":\"%d|%.1f|%d|%.1f\",\"ab\":\"%.2f|%.2f|%d|%d\",\"gpc\":\"%d|%d|%d|%d|%d|%d\",\"zxd\":\"%.1f|%.1f|%d|%d|%d\",\"shak\":\"%d|%d|%.1f\",\"dmx\":%d}"

    invoke-static {v2, v0, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    :try_start_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-wide/16 v2, 0x0

    const-string v4, "rw"

    if-nez p0, :cond_2

    :try_start_1
    new-instance p0, Ljava/io/File;

    sget-object v7, La/a/a/i/h;->a:Ljava/lang/String;

    invoke-direct {p0, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v7

    if-nez v7, :cond_0

    invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z

    :cond_0
    invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z

    move-result p0

    if-eqz p0, :cond_1

    new-instance p0, Ljava/io/RandomAccessFile;

    invoke-direct {p0, v1, v4}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {p0, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {p0, v5}, Ljava/io/RandomAccessFile;->writeBoolean(Z)V

    invoke-virtual {p0, v5}, Ljava/io/RandomAccessFile;->writeBoolean(Z)V

    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->close()V

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    :goto_0
    new-instance p0, Ljava/io/RandomAccessFile;

    invoke-direct {p0, v1, v4}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {p0, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {p0, v6}, Ljava/io/RandomAccessFile;->writeBoolean(Z)V

    const-wide/16 v1, 0x2

    invoke-virtual {p0, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V

    array-length v1, v0

    invoke-virtual {p0, v1}, Ljava/io/RandomAccessFile;->writeInt(I)V

    invoke-virtual {p0, v0}, Ljava/io/RandomAccessFile;->write([B)V

    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    return-void
.end method

.method public final g()V
    .locals 4

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v0, La/a/a/i/h;->a:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/config.dat"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :try_start_0
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v1, "rw"

    if-nez p0, :cond_2

    :try_start_1
    new-instance p0, Ljava/io/File;

    sget-object v2, La/a/a/i/h;->a:Ljava/lang/String;

    invoke-direct {p0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z

    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z

    move-result p0

    if-eqz p0, :cond_1

    new-instance p0, Ljava/io/RandomAccessFile;

    invoke-direct {p0, v0, v1}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const-wide/16 v2, 0x0

    invoke-virtual {p0, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    const/4 v2, 0x0

    invoke-virtual {p0, v2}, Ljava/io/RandomAccessFile;->writeBoolean(Z)V

    invoke-virtual {p0, v2}, Ljava/io/RandomAccessFile;->writeBoolean(Z)V

    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->close()V

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    :goto_0
    new-instance p0, Ljava/io/RandomAccessFile;

    invoke-direct {p0, v0, v1}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const-wide/16 v0, 0x1

    invoke-virtual {p0, v0, v1}, Ljava/io/RandomAccessFile;->seek(J)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ljava/io/RandomAccessFile;->writeBoolean(Z)V

    const-wide/16 v0, 0x400

    invoke-virtual {p0, v0, v1}, Ljava/io/RandomAccessFile;->seek(J)V

    sget-wide v0, La/a/a/i/i;->q:D

    invoke-virtual {p0, v0, v1}, Ljava/io/RandomAccessFile;->writeDouble(D)V

    sget-wide v0, La/a/a/i/i;->r:D

    invoke-virtual {p0, v0, v1}, Ljava/io/RandomAccessFile;->writeDouble(D)V

    sget-boolean v0, La/a/a/i/i;->u:Z

    invoke-virtual {p0, v0}, Ljava/io/RandomAccessFile;->writeBoolean(Z)V

    sget-boolean v0, La/a/a/i/i;->u:Z

    if-eqz v0, :cond_3

    sget-object v0, La/a/a/i/i;->t:[B

    if-eqz v0, :cond_3

    invoke-virtual {p0, v0}, Ljava/io/RandomAccessFile;->write([B)V

    :cond_3
    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    return-void
.end method

.method public h()V
    .locals 0

    invoke-virtual {p0}, La/a/a/c/d;->d()V

    return-void
.end method

.method public i()V
    .locals 0

    return-void
.end method
