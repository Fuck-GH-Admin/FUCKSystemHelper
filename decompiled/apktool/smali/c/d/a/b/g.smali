.class public Lc/d/a/b/g;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Landroid/content/Context;)J
    .locals 4

    invoke-static {}, Lc/d/a/b/g;->c()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-gez v2, :cond_0

    invoke-static {p0}, Lc/d/a/b/g;->c(Landroid/content/Context;)J

    move-result-wide v0

    :cond_0
    return-wide v0
.end method

.method public static a()Ljava/lang/String;
    .locals 6

    new-instance v0, Landroid/os/StatFs;

    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockSizeLong()J

    move-result-wide v1

    invoke-virtual {v0}, Landroid/os/StatFs;->getFreeBlocksLong()J

    move-result-wide v3

    mul-long/2addr v3, v1

    long-to-double v0, v3

    const-wide/high16 v2, 0x4090000000000000L    # 1024.0

    const-wide/high16 v4, 0x4008000000000000L    # 3.0

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    long-to-int v0, v2

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "G"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b()Ljava/lang/String;
    .locals 9

    new-instance v0, Landroid/os/StatFs;

    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockSizeLong()J

    move-result-wide v1

    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockCountLong()J

    move-result-wide v3

    mul-long/2addr v3, v1

    long-to-double v0, v3

    const-wide/high16 v2, 0x4090000000000000L    # 1024.0

    const-wide/high16 v4, 0x4008000000000000L    # 3.0

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmpl-double v2, v2, v4

    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    if-lez v2, :cond_1

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v5

    add-int/lit8 v2, v1, 0x1

    int-to-double v7, v2

    invoke-static {v3, v4, v7, v8}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v7

    cmpl-double v5, v5, v7

    if-gez v5, :cond_0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v5

    int-to-double v7, v1

    invoke-static {v3, v4, v7, v8}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v7

    cmpg-double v5, v5, v7

    if-gez v5, :cond_1

    :cond_0
    move v1, v2

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    add-int/lit8 v1, v1, 0x1

    int-to-double v1, v1

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v1

    double-to-int v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "G"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b(Landroid/content/Context;)Lorg/json/JSONObject;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Lc/d/a/b/g;->a(Landroid/content/Context;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, "G"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {}, Lc/d/a/b/g;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lc/d/a/b/g;->a()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Unknown"

    if-nez p0, :cond_0

    move-object p0, v2

    :cond_0
    if-nez v0, :cond_1

    move-object v0, v2

    :cond_1
    if-nez v1, :cond_2

    move-object v1, v2

    :cond_2
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v3, "RAM"

    invoke-virtual {v2, v3, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p0, "ROM"

    invoke-virtual {v2, p0, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p0, "FREE"

    invoke-virtual {v2, p0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object p0

    const-string v0, "MemoryUtils"

    invoke-static {v0, p0}, Lc/d/a/b/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method private static c()J
    .locals 7

    const-string v0, ""

    const-string v1, "ro.boot.dram_info"

    invoke-static {v1, v0}, Lc/d/a/b/l;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-wide/16 v2, -0x1

    const-string v4, "MemoryUtils"

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "dramInfo:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, ","

    invoke-virtual {v1, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    array-length v5, v1

    add-int/lit8 v5, v5, -0x1

    aget-object v1, v1, v5

    const-string v5, "\\D+"

    invoke-virtual {v1, v5, v0}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "parsed value : "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x1

    mul-long/2addr v0, v2

    return-wide v0

    :cond_2
    :goto_0
    return-wide v2

    :cond_3
    :goto_1
    const-string v0, "No dram_info property"

    invoke-static {v4, v0}, Lc/d/a/b/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-wide v2
.end method

.method private static c(Landroid/content/Context;)J
    .locals 8

    const-string v0, "activity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/ActivityManager;

    new-instance v0, Landroid/app/ActivityManager$MemoryInfo;

    invoke-direct {v0}, Landroid/app/ActivityManager$MemoryInfo;-><init>()V

    invoke-virtual {p0, v0}, Landroid/app/ActivityManager;->getMemoryInfo(Landroid/app/ActivityManager$MemoryInfo;)V

    iget-wide v0, v0, Landroid/app/ActivityManager$MemoryInfo;->totalMem:J

    const-wide/32 v2, 0x100000

    div-long/2addr v0, v2

    const-wide/16 v2, 0x7800

    cmp-long p0, v0, v2

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x1

    if-lez p0, :cond_0

    const-wide/16 v2, 0x20

    goto/16 :goto_1

    :cond_0
    const-wide/16 v6, 0x7000

    cmp-long p0, v0, v6

    if-lez p0, :cond_1

    const-wide/16 v2, 0x1e

    goto/16 :goto_1

    :cond_1
    const-wide/16 v6, 0x6800

    cmp-long p0, v0, v6

    if-lez p0, :cond_2

    const-wide/16 v2, 0x1c

    goto/16 :goto_1

    :cond_2
    const-wide/16 v6, 0x6000

    cmp-long p0, v0, v6

    if-lez p0, :cond_3

    const-wide/16 v2, 0x1a

    goto/16 :goto_1

    :cond_3
    const-wide/16 v6, 0x5800

    cmp-long p0, v0, v6

    if-lez p0, :cond_4

    const-wide/16 v2, 0x18

    goto/16 :goto_1

    :cond_4
    const-wide/16 v6, 0x5000

    cmp-long p0, v0, v6

    if-lez p0, :cond_5

    const-wide/16 v2, 0x16

    goto/16 :goto_1

    :cond_5
    const-wide/16 v6, 0x4800

    cmp-long p0, v0, v6

    if-lez p0, :cond_6

    const-wide/16 v2, 0x14

    goto/16 :goto_1

    :cond_6
    const-wide/16 v6, 0x4000

    cmp-long p0, v0, v6

    if-lez p0, :cond_7

    const-wide/16 v2, 0x12

    goto :goto_1

    :cond_7
    const-wide/16 v6, 0x3800

    cmp-long p0, v0, v6

    if-lez p0, :cond_8

    const-wide/16 v2, 0x10

    goto :goto_1

    :cond_8
    const-wide/16 v6, 0x3000

    cmp-long p0, v0, v6

    if-lez p0, :cond_9

    const-wide/16 v2, 0xe

    goto :goto_1

    :cond_9
    const-wide/16 v6, 0x2800

    cmp-long p0, v0, v6

    if-lez p0, :cond_a

    const-wide/16 v2, 0xc

    goto :goto_1

    :cond_a
    const-wide/16 v6, 0x1800

    cmp-long p0, v0, v6

    if-lez p0, :cond_b

    const-wide/16 v2, 0x8

    goto :goto_1

    :cond_b
    const-wide/16 v6, 0x1000

    cmp-long p0, v0, v6

    if-lez p0, :cond_c

    const-wide/16 v2, 0x6

    goto :goto_1

    :cond_c
    const-wide/16 v6, 0xc00

    cmp-long p0, v0, v6

    if-lez p0, :cond_d

    const-wide/16 v2, 0x4

    goto :goto_1

    :cond_d
    const-wide/16 v6, 0x800

    cmp-long p0, v0, v6

    if-lez p0, :cond_e

    const-wide/16 v2, 0x3

    goto :goto_1

    :cond_e
    const-wide/16 v6, 0x600

    cmp-long p0, v0, v6

    if-lez p0, :cond_f

    const-wide/16 v2, 0x2

    goto :goto_1

    :cond_f
    const-wide/16 v6, 0x400

    cmp-long p0, v0, v6

    if-lez p0, :cond_10

    :goto_0
    move-wide v2, v4

    goto :goto_1

    :cond_10
    const-wide/16 v6, 0x300

    cmp-long p0, v0, v6

    if-lez p0, :cond_11

    goto :goto_0

    :cond_11
    const-wide/16 v4, 0x200

    cmp-long p0, v0, v4

    :goto_1
    return-wide v2
.end method
