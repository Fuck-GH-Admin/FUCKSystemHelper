.class public La/a/a/g/f;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/a/a/g/f$e;,
        La/a/a/g/f$c;,
        La/a/a/g/f$d;,
        La/a/a/g/f$b;
    }
.end annotation


# instance fields
.field public a:La/a/a/g/g;

.field public b:Landroid/telephony/TelephonyManager;

.field public c:Landroid/net/ConnectivityManager;

.field public d:Landroid/net/wifi/WifiManager;

.field public e:Landroid/os/Handler;

.field public f:Ljava/lang/String;

.field public g:Z

.field public h:J

.field public i:J

.field public j:J

.field public k:J


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, La/a/a/g/f;->c:Landroid/net/ConnectivityManager;

    iput-object v0, p0, La/a/a/g/f;->d:Landroid/net/wifi/WifiManager;

    iput-object v0, p0, La/a/a/g/f;->e:Landroid/os/Handler;

    iput-object v0, p0, La/a/a/g/f;->f:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, La/a/a/g/f;->g:Z

    const-wide/16 v0, 0x0

    iput-wide v0, p0, La/a/a/g/f;->h:J

    iput-wide v0, p0, La/a/a/g/f;->i:J

    iput-wide v0, p0, La/a/a/g/f;->j:J

    iput-wide v0, p0, La/a/a/g/f;->k:J

    return-void
.end method

.method public static synthetic a(La/a/a/g/f;J)J
    .locals 0

    iput-wide p1, p0, La/a/a/g/f;->i:J

    return-wide p1
.end method

.method public static synthetic a(La/a/a/g/f;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, La/a/a/g/f;->e:Landroid/os/Handler;

    return-object p0
.end method

.method public static a(Ljava/util/List;I)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "La/a/a/g/h;",
            ">;I)",
            "Ljava/util/List<",
            "La/a/a/g/h;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    return-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p0, v2, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    new-instance v2, La/a/a/g/f$e;

    invoke-direct {v2, v1}, La/a/a/g/f$e;-><init>(La/a/a/g/f$a;)V

    invoke-static {v0, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-interface {p0}, Ljava/util/List;->size()I

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    const/4 v0, 0x0

    invoke-interface {p0, v0, p1}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(La/a/a/g/f;Z)Z
    .locals 0

    iput-boolean p1, p0, La/a/a/g/f;->g:Z

    return p1
.end method

.method public static synthetic b(La/a/a/g/f;)Z
    .locals 0

    iget-boolean p0, p0, La/a/a/g/f;->g:Z

    return p0
.end method

.method public static w()La/a/a/g/f;
    .locals 1

    invoke-static {}, La/a/a/g/f$b;->a()La/a/a/g/f;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Landroid/telephony/CellIdentityNr;)I
    .locals 0

    :try_start_0
    const-string p0, "getHwTac"

    invoke-static {p1, p0}, La/a/a/i/i;->b(Ljava/lang/Object;Ljava/lang/String;)I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const/4 p0, -0x1

    :goto_0
    return p0
.end method

.method public a(La/a/a/g/k;)J
    .locals 12
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    iget-object p0, p1, La/a/a/g/k;->a:Ljava/util/List;

    const-wide/16 v0, 0x0

    if-eqz p0, :cond_8

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    if-nez p0, :cond_0

    goto :goto_5

    :cond_0
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x11

    const/4 v3, 0x0

    if-lt p0, v2, :cond_1

    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v4

    const-wide/16 v6, 0x3e8

    div-long/2addr v4, v6
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-wide v4, v0

    :goto_0
    cmp-long p0, v4, v0

    if-lez p0, :cond_2

    const/4 p0, 0x1

    goto :goto_1

    :cond_1
    move-wide v4, v0

    :cond_2
    move p0, v3

    :goto_1
    if-nez p0, :cond_3

    return-wide v0

    :cond_3
    iget-object v2, p1, La/a/a/g/k;->a:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/16 v6, 0x10

    if-le v2, v6, :cond_4

    move v2, v6

    :cond_4
    move-wide v6, v0

    :goto_2
    if-ge v3, v2, :cond_7

    iget-object v8, p1, La/a/a/g/k;->a:Ljava/util/List;

    invoke-interface {v8, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_6

    iget-object v8, p1, La/a/a/g/k;->a:Ljava/util/List;

    invoke-interface {v8, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/net/wifi/ScanResult;

    iget v8, v8, Landroid/net/wifi/ScanResult;->level:I

    if-nez v8, :cond_5

    goto :goto_4

    :cond_5
    if-eqz p0, :cond_6

    :try_start_1
    iget-object v8, p1, La/a/a/g/k;->a:Ljava/util/List;

    invoke-interface {v8, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/net/wifi/ScanResult;

    iget-wide v8, v8, Landroid/net/wifi/ScanResult;->timestamp:J

    sub-long v8, v4, v8

    const-wide/32 v10, 0xf4240

    div-long/2addr v8, v10
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    move-wide v8, v0

    :goto_3
    cmp-long v10, v8, v6

    if-lez v10, :cond_6

    move-wide v6, v8

    :cond_6
    :goto_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_7
    return-wide v6

    :cond_8
    :goto_5
    return-wide v0
.end method

.method public declared-synchronized a()La/a/a/g/a;
    .locals 8

    monitor-enter p0

    const/16 v0, 0x7530

    :try_start_0
    iget-object v1, p0, La/a/a/g/f;->a:La/a/a/g/g;

    if-eqz v1, :cond_0

    iget-object v3, p0, La/a/a/g/f;->b:Landroid/telephony/TelephonyManager;

    sget v4, La/a/a/i/i;->B0:I

    sget-object v5, La/a/a/i/i;->C0:[I

    sget-boolean v6, La/a/a/i/i;->D0:Z

    sget v7, La/a/a/i/i;->E0:I

    move-object v2, p0

    invoke-virtual/range {v2 .. v7}, La/a/a/g/f;->a(Landroid/telephony/TelephonyManager;I[IZI)V

    iget-object v1, p0, La/a/a/g/f;->a:La/a/a/g/g;

    invoke-virtual {v1, v0}, La/a/a/g/g;->a(I)La/a/a/g/a;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public a(La/a/a/g/a;Landroid/telephony/TelephonyManager;)La/a/a/g/a;
    .locals 0

    iget-object p0, p0, La/a/a/g/f;->a:La/a/a/g/g;

    if-eqz p0, :cond_0

    invoke-virtual {p0, p1, p2}, La/a/a/g/g;->a(La/a/a/g/a;Landroid/telephony/TelephonyManager;)La/a/a/g/a;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public final a(Landroid/telephony/CellInfo;Landroid/telephony/TelephonyManager;)La/a/a/g/h;
    .locals 11

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x11

    if-ge v0, v2, :cond_0

    return-object v1

    :cond_0
    instance-of v2, p1, Landroid/telephony/CellInfoGsm;

    const/16 v3, 0x1c

    const-wide/32 v4, 0xf4240

    const/16 v6, 0x1e

    const/4 v7, 0x1

    const v8, 0x7fffffff

    if-eqz v2, :cond_6

    new-instance p0, La/a/a/g/h;

    invoke-direct {p0}, La/a/a/g/h;-><init>()V

    move-object p2, p1

    check-cast p2, Landroid/telephony/CellInfoGsm;

    invoke-virtual {p2}, Landroid/telephony/CellInfoGsm;->getCellIdentity()Landroid/telephony/CellIdentityGsm;

    move-result-object p2

    iput v7, p0, La/a/a/g/h;->a:I

    invoke-virtual {p1}, Landroid/telephony/CellInfo;->isRegistered()Z

    move-result v2

    if-eqz v2, :cond_1

    iput v7, p0, La/a/a/g/h;->d:I

    :cond_1
    if-lt v0, v3, :cond_2

    invoke-virtual {p2}, Landroid/telephony/CellIdentityGsm;->getMccString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, La/a/a/g/h;->b:Ljava/lang/String;

    invoke-virtual {p2}, Landroid/telephony/CellIdentityGsm;->getMncString()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, La/a/a/g/h;->c:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/telephony/CellInfo;->getCellConnectionStatus()I

    move-result p2

    iput p2, p0, La/a/a/g/h;->f:I

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Landroid/telephony/CellIdentityGsm;->getMcc()I

    move-result v2

    if-ne v2, v8, :cond_3

    move-object v2, v1

    goto :goto_0

    :cond_3
    invoke-virtual {p2}, Landroid/telephony/CellIdentityGsm;->getMcc()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    :goto_0
    iput-object v2, p0, La/a/a/g/h;->b:Ljava/lang/String;

    invoke-virtual {p2}, Landroid/telephony/CellIdentityGsm;->getMnc()I

    move-result v2

    if-ne v2, v8, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {p2}, Landroid/telephony/CellIdentityGsm;->getMnc()I

    move-result p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    :goto_1
    iput-object v1, p0, La/a/a/g/h;->c:Ljava/lang/String;

    :goto_2
    if-lt v0, v6, :cond_5

    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    invoke-virtual {p1}, Landroid/telephony/CellInfo;->getTimestampMillis()J

    move-result-wide p1

    sub-long/2addr v0, p1

    :goto_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    sub-long/2addr p1, v0

    goto :goto_4

    :cond_5
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v0

    invoke-virtual {p1}, Landroid/telephony/CellInfo;->getTimeStamp()J

    move-result-wide p1

    sub-long/2addr v0, p1

    div-long/2addr v0, v4

    goto :goto_3

    :goto_4
    iput-wide p1, p0, La/a/a/g/h;->e:J
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, p0

    goto/16 :goto_14

    :catch_0
    move-object v1, p0

    goto/16 :goto_13

    :cond_6
    instance-of v2, p1, Landroid/telephony/CellInfoCdma;

    const/4 v9, 0x3

    if-eqz v2, :cond_c

    new-instance p0, La/a/a/g/h;

    invoke-direct {p0}, La/a/a/g/h;-><init>()V

    move-object v2, p1

    check-cast v2, Landroid/telephony/CellInfoCdma;

    invoke-virtual {v2}, Landroid/telephony/CellInfoCdma;->getCellIdentity()Landroid/telephony/CellIdentityCdma;

    move-result-object v2

    const/4 v10, 0x2

    iput v10, p0, La/a/a/g/h;->a:I

    invoke-virtual {v2}, Landroid/telephony/CellIdentityCdma;->getSystemId()I

    move-result v10

    if-ne v10, v8, :cond_7

    goto :goto_5

    :cond_7
    invoke-virtual {v2}, Landroid/telephony/CellIdentityCdma;->getSystemId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    :goto_5
    iput-object v1, p0, La/a/a/g/h;->c:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/telephony/CellInfo;->isRegistered()Z

    move-result v1

    if-eqz v1, :cond_8

    iput v7, p0, La/a/a/g/h;->d:I

    :cond_8
    if-lt v0, v3, :cond_9

    invoke-virtual {p1}, Landroid/telephony/CellInfo;->getCellConnectionStatus()I

    move-result v1

    iput v1, p0, La/a/a/g/h;->f:I

    :cond_9
    :try_start_1
    invoke-virtual {p2}, Landroid/telephony/TelephonyManager;->getNetworkOperator()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_a

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    if-lt v1, v9, :cond_a

    const/4 v1, 0x0

    invoke-virtual {p2, v1, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, La/a/a/g/h;->b:Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_a
    if-lt v0, v6, :cond_b

    :try_start_2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    invoke-virtual {p1}, Landroid/telephony/CellInfo;->getTimestampMillis()J

    move-result-wide p1

    sub-long/2addr v0, p1

    :goto_6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    sub-long/2addr p1, v0

    goto :goto_4

    :cond_b
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v0

    invoke-virtual {p1}, Landroid/telephony/CellInfo;->getTimeStamp()J

    move-result-wide p1

    sub-long/2addr v0, p1

    div-long/2addr v0, v4
    :try_end_2
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_6

    :cond_c
    instance-of p2, p1, Landroid/telephony/CellInfoWcdma;

    if-eqz p2, :cond_12

    new-instance p0, La/a/a/g/h;

    invoke-direct {p0}, La/a/a/g/h;-><init>()V

    move-object p2, p1

    check-cast p2, Landroid/telephony/CellInfoWcdma;

    invoke-virtual {p2}, Landroid/telephony/CellInfoWcdma;->getCellIdentity()Landroid/telephony/CellIdentityWcdma;

    move-result-object p2

    const/4 v2, 0x4

    iput v2, p0, La/a/a/g/h;->a:I

    invoke-virtual {p1}, Landroid/telephony/CellInfo;->isRegistered()Z

    move-result v2

    if-eqz v2, :cond_d

    iput v7, p0, La/a/a/g/h;->d:I

    :cond_d
    if-lt v0, v3, :cond_e

    invoke-virtual {p2}, Landroid/telephony/CellIdentityWcdma;->getMccString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, La/a/a/g/h;->b:Ljava/lang/String;

    invoke-virtual {p2}, Landroid/telephony/CellIdentityWcdma;->getMncString()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, La/a/a/g/h;->c:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/telephony/CellInfo;->getCellConnectionStatus()I

    move-result p2

    iput p2, p0, La/a/a/g/h;->f:I

    goto :goto_9

    :cond_e
    invoke-virtual {p2}, Landroid/telephony/CellIdentityWcdma;->getMcc()I

    move-result v2

    if-ne v2, v8, :cond_f

    move-object v2, v1

    goto :goto_7

    :cond_f
    invoke-virtual {p2}, Landroid/telephony/CellIdentityWcdma;->getMcc()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    :goto_7
    iput-object v2, p0, La/a/a/g/h;->b:Ljava/lang/String;

    invoke-virtual {p2}, Landroid/telephony/CellIdentityWcdma;->getMnc()I

    move-result v2

    if-ne v2, v8, :cond_10

    goto :goto_8

    :cond_10
    invoke-virtual {p2}, Landroid/telephony/CellIdentityWcdma;->getMnc()I

    move-result p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    :goto_8
    iput-object v1, p0, La/a/a/g/h;->c:Ljava/lang/String;

    :goto_9
    if-lt v0, v6, :cond_11

    :try_start_3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    invoke-virtual {p1}, Landroid/telephony/CellInfo;->getTimestampMillis()J

    move-result-wide p1

    sub-long/2addr v0, p1

    :goto_a
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    sub-long/2addr p1, v0

    goto/16 :goto_4

    :cond_11
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v0

    invoke-virtual {p1}, Landroid/telephony/CellInfo;->getTimeStamp()J

    move-result-wide p1

    sub-long/2addr v0, p1

    div-long/2addr v0, v4
    :try_end_3
    .catch Ljava/lang/Error; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_a

    :cond_12
    const/16 p2, 0x1d

    if-lt v0, p2, :cond_15

    instance-of v2, p1, Landroid/telephony/CellInfoTdscdma;

    if-eqz v2, :cond_15

    new-instance v1, La/a/a/g/h;

    invoke-direct {v1}, La/a/a/g/h;-><init>()V

    move-object p0, p1

    check-cast p0, Landroid/telephony/CellInfoTdscdma;

    invoke-virtual {p0}, Landroid/telephony/CellInfoTdscdma;->getCellIdentity()Landroid/telephony/CellIdentityTdscdma;

    move-result-object p0

    const/4 p2, 0x5

    iput p2, v1, La/a/a/g/h;->a:I

    invoke-virtual {p1}, Landroid/telephony/CellInfo;->isRegistered()Z

    move-result p2

    if-eqz p2, :cond_13

    iput v7, v1, La/a/a/g/h;->d:I

    :cond_13
    invoke-virtual {p0}, Landroid/telephony/CellIdentityTdscdma;->getMccString()Ljava/lang/String;

    move-result-object p2

    iput-object p2, v1, La/a/a/g/h;->b:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/telephony/CellIdentityTdscdma;->getMncString()Ljava/lang/String;

    move-result-object p0

    iput-object p0, v1, La/a/a/g/h;->c:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/telephony/CellInfo;->getCellConnectionStatus()I

    move-result p0

    iput p0, v1, La/a/a/g/h;->f:I

    if-lt v0, v6, :cond_14

    :try_start_4
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    invoke-virtual {p1}, Landroid/telephony/CellInfo;->getTimestampMillis()J

    move-result-wide p0

    sub-long/2addr v2, p0

    :goto_b
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p0

    :goto_c
    sub-long/2addr p0, v2

    goto :goto_d

    :cond_14
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v2

    invoke-virtual {p1}, Landroid/telephony/CellInfo;->getTimeStamp()J

    move-result-wide p0

    sub-long/2addr v2, p0

    div-long/2addr v2, v4

    goto :goto_b

    :goto_d
    iput-wide p0, v1, La/a/a/g/h;->e:J
    :try_end_4
    .catch Ljava/lang/Error; {:try_start_4 .. :try_end_4} :catch_3

    goto/16 :goto_14

    :cond_15
    instance-of v2, p1, Landroid/telephony/CellInfoLte;

    if-eqz v2, :cond_1f

    new-instance v1, La/a/a/g/i;

    invoke-direct {v1}, La/a/a/g/i;-><init>()V

    move-object v2, p1

    check-cast v2, Landroid/telephony/CellInfoLte;

    invoke-virtual {v2}, Landroid/telephony/CellInfoLte;->getCellIdentity()Landroid/telephony/CellIdentityLte;

    move-result-object v10

    invoke-virtual {v2}, Landroid/telephony/CellInfoLte;->getCellSignalStrength()Landroid/telephony/CellSignalStrengthLte;

    move-result-object v2

    iput v9, v1, La/a/a/g/h;->a:I

    invoke-virtual {p1}, Landroid/telephony/CellInfo;->isRegistered()Z

    move-result v9

    if-eqz v9, :cond_16

    iput v7, v1, La/a/a/g/h;->d:I

    :cond_16
    invoke-virtual {v10}, Landroid/telephony/CellIdentityLte;->getCi()I

    move-result v7

    iput v7, v1, La/a/a/g/i;->h:I

    invoke-virtual {v10}, Landroid/telephony/CellIdentityLte;->getPci()I

    move-result v7

    iput v7, v1, La/a/a/g/i;->i:I

    invoke-virtual {v10}, Landroid/telephony/CellIdentityLte;->getTac()I

    move-result v7

    iput v7, v1, La/a/a/g/i;->j:I

    invoke-virtual {v2}, Landroid/telephony/CellSignalStrengthLte;->getTimingAdvance()I

    move-result v7

    iput v7, v1, La/a/a/g/i;->r:I

    if-lt v0, v3, :cond_17

    invoke-virtual {v10}, Landroid/telephony/CellIdentityLte;->getMccString()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, La/a/a/g/h;->b:Ljava/lang/String;

    invoke-virtual {v10}, Landroid/telephony/CellIdentityLte;->getMncString()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, La/a/a/g/h;->c:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/telephony/CellInfo;->getCellConnectionStatus()I

    move-result v3

    iput v3, v1, La/a/a/g/h;->f:I

    invoke-virtual {v10}, Landroid/telephony/CellIdentityLte;->getBandwidth()I

    move-result v3

    iput v3, v1, La/a/a/g/i;->l:I

    goto :goto_e

    :cond_17
    invoke-virtual {v10}, Landroid/telephony/CellIdentityLte;->getMcc()I

    move-result v3

    if-eq v3, v8, :cond_18

    invoke-virtual {v10}, Landroid/telephony/CellIdentityLte;->getMcc()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, La/a/a/g/h;->b:Ljava/lang/String;

    :cond_18
    invoke-virtual {v10}, Landroid/telephony/CellIdentityLte;->getMnc()I

    move-result v3

    if-eq v3, v8, :cond_19

    invoke-virtual {v10}, Landroid/telephony/CellIdentityLte;->getMnc()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, La/a/a/g/h;->c:Ljava/lang/String;

    :cond_19
    :goto_e
    const/16 v3, 0x18

    if-lt v0, v3, :cond_1a

    invoke-virtual {v10}, Landroid/telephony/CellIdentityLte;->getEarfcn()I

    move-result v3

    iput v3, v1, La/a/a/g/i;->k:I

    :cond_1a
    if-lt v0, p2, :cond_1b

    invoke-virtual {v2}, Landroid/telephony/CellSignalStrengthLte;->getRssi()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result p2

    iput p2, v1, La/a/a/g/i;->m:I

    :cond_1b
    const/16 p2, 0x1a

    if-lt v0, p2, :cond_1d

    invoke-virtual {v2}, Landroid/telephony/CellSignalStrengthLte;->getRsrp()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result p2

    iput p2, v1, La/a/a/g/i;->n:I

    invoke-virtual {v2}, Landroid/telephony/CellSignalStrengthLte;->getRsrp()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result p2

    iput p2, v1, La/a/a/g/h;->g:I

    invoke-virtual {v2}, Landroid/telephony/CellSignalStrengthLte;->getRsrq()I

    move-result p2

    iput p2, v1, La/a/a/g/i;->o:I

    invoke-virtual {v2}, Landroid/telephony/CellSignalStrengthLte;->getRssnr()I

    move-result p2

    if-ne p2, v8, :cond_1c

    invoke-virtual {p1}, Landroid/telephony/CellInfo;->isRegistered()Z

    move-result v3

    if-eqz v3, :cond_1c

    invoke-virtual {p0}, La/a/a/g/f;->e()I

    move-result p2

    :cond_1c
    iput p2, v1, La/a/a/g/i;->p:I

    invoke-virtual {v2}, Landroid/telephony/CellSignalStrengthLte;->getCqi()I

    move-result p0

    iput p0, v1, La/a/a/g/i;->q:I

    :cond_1d
    if-lt v0, v6, :cond_1e

    :try_start_5
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    invoke-virtual {p1}, Landroid/telephony/CellInfo;->getTimestampMillis()J

    move-result-wide p0

    sub-long/2addr v2, p0

    :goto_f
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p0

    goto/16 :goto_c

    :cond_1e
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v2

    invoke-virtual {p1}, Landroid/telephony/CellInfo;->getTimeStamp()J

    move-result-wide p0

    sub-long/2addr v2, p0

    div-long/2addr v2, v4
    :try_end_5
    .catch Ljava/lang/Error; {:try_start_5 .. :try_end_5} :catch_3

    goto :goto_f

    :cond_1f
    if-lt v0, p2, :cond_25

    instance-of p2, p1, Landroid/telephony/CellInfoNr;

    if-eqz p2, :cond_25

    new-instance p2, La/a/a/g/j;

    invoke-direct {p2}, La/a/a/g/j;-><init>()V

    :try_start_6
    move-object v2, p1

    check-cast v2, Landroid/telephony/CellInfoNr;

    invoke-virtual {v2}, Landroid/telephony/CellInfoNr;->getCellIdentity()Landroid/telephony/CellIdentity;

    move-result-object v2

    check-cast v2, Landroid/telephony/CellIdentityNr;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    move-object v1, v2

    goto :goto_10

    :catchall_0
    move-exception v2

    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_10
    move-object v2, p1

    check-cast v2, Landroid/telephony/CellInfoNr;

    invoke-virtual {v2}, Landroid/telephony/CellInfoNr;->getCellSignalStrength()Landroid/telephony/CellSignalStrength;

    move-result-object v2

    check-cast v2, Landroid/telephony/CellSignalStrengthNr;

    if-eqz v1, :cond_22

    const/4 v3, 0x6

    iput v3, p2, La/a/a/g/h;->a:I

    invoke-virtual {v1}, Landroid/telephony/CellIdentityNr;->getMccString()Ljava/lang/String;

    move-result-object v3

    iput-object v3, p2, La/a/a/g/h;->b:Ljava/lang/String;

    invoke-virtual {v1}, Landroid/telephony/CellIdentityNr;->getMncString()Ljava/lang/String;

    move-result-object v3

    iput-object v3, p2, La/a/a/g/h;->c:Ljava/lang/String;

    invoke-virtual {v1}, Landroid/telephony/CellIdentityNr;->getNci()J

    move-result-wide v9

    iput-wide v9, p2, La/a/a/g/j;->h:J

    invoke-virtual {v1}, Landroid/telephony/CellIdentityNr;->getPci()I

    move-result v3

    iput v3, p2, La/a/a/g/j;->i:I

    invoke-virtual {v1}, Landroid/telephony/CellIdentityNr;->getTac()I

    move-result v3

    iput v3, p2, La/a/a/g/j;->j:I

    if-ne v3, v8, :cond_20

    :try_start_7
    invoke-virtual {p0, v1}, La/a/a/g/f;->a(Landroid/telephony/CellIdentityNr;)I

    move-result v3

    iput v3, p2, La/a/a/g/j;->j:I
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :catchall_1
    :cond_20
    iget v3, p2, La/a/a/g/j;->j:I

    if-ne v3, v8, :cond_21

    :try_start_8
    invoke-virtual {v1}, Landroid/telephony/CellIdentityNr;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3}, La/a/a/g/f;->b(Ljava/lang/String;)I

    move-result p0

    iput p0, p2, La/a/a/g/j;->j:I
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :catchall_2
    :cond_21
    invoke-virtual {v1}, Landroid/telephony/CellIdentityNr;->getNrarfcn()I

    move-result p0

    iput p0, p2, La/a/a/g/j;->k:I

    :cond_22
    invoke-virtual {p1}, Landroid/telephony/CellInfo;->isRegistered()Z

    move-result p0

    if-eqz p0, :cond_23

    iput v7, p2, La/a/a/g/h;->d:I

    :cond_23
    invoke-virtual {p1}, Landroid/telephony/CellInfo;->getCellConnectionStatus()I

    move-result p0

    iput p0, p2, La/a/a/g/h;->f:I

    invoke-virtual {v2}, Landroid/telephony/CellSignalStrengthNr;->getSsRsrp()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Math;->abs(I)I

    move-result p0

    iput p0, p2, La/a/a/g/j;->l:I

    invoke-virtual {v2}, Landroid/telephony/CellSignalStrengthNr;->getSsRsrp()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Math;->abs(I)I

    move-result p0

    iput p0, p2, La/a/a/g/h;->g:I

    invoke-virtual {v2}, Landroid/telephony/CellSignalStrengthNr;->getSsRsrq()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Math;->abs(I)I

    move-result p0

    iput p0, p2, La/a/a/g/j;->m:I

    invoke-virtual {v2}, Landroid/telephony/CellSignalStrengthNr;->getSsSinr()I

    move-result p0

    iput p0, p2, La/a/a/g/j;->n:I

    invoke-virtual {v2}, Landroid/telephony/CellSignalStrengthNr;->getCsiRsrp()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Math;->abs(I)I

    move-result p0

    iput p0, p2, La/a/a/g/j;->o:I

    invoke-virtual {v2}, Landroid/telephony/CellSignalStrengthNr;->getCsiRsrq()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Math;->abs(I)I

    move-result p0

    iput p0, p2, La/a/a/g/j;->p:I

    invoke-virtual {v2}, Landroid/telephony/CellSignalStrengthNr;->getCsiSinr()I

    move-result p0

    iput p0, p2, La/a/a/g/j;->q:I

    if-lt v0, v6, :cond_24

    :try_start_9
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    invoke-virtual {p1}, Landroid/telephony/CellInfo;->getTimestampMillis()J

    move-result-wide p0

    sub-long/2addr v0, p0

    :goto_11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p0

    sub-long/2addr p0, v0

    goto :goto_12

    :cond_24
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v0

    invoke-virtual {p1}, Landroid/telephony/CellInfo;->getTimeStamp()J

    move-result-wide p0

    sub-long/2addr v0, p0

    div-long/2addr v0, v4

    goto :goto_11

    :goto_12
    iput-wide p0, p2, La/a/a/g/h;->e:J
    :try_end_9
    .catch Ljava/lang/Error; {:try_start_9 .. :try_end_9} :catch_2

    move-object v1, p2

    goto :goto_14

    :catch_2
    move-object v1, p2

    :catch_3
    :goto_13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p0

    iput-wide p0, v1, La/a/a/g/h;->e:J

    :cond_25
    :goto_14
    return-object v1
.end method

.method public a(I)La/a/a/g/k;
    .locals 0

    iget-object p0, p0, La/a/a/g/f;->a:La/a/a/g/g;

    if-eqz p0, :cond_0

    invoke-virtual {p0, p1}, La/a/a/g/g;->b(I)La/a/a/g/k;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public a(ILa/a/a/g/k;)Ljava/lang/String;
    .locals 8

    if-eqz p1, :cond_6

    invoke-virtual {p2}, La/a/a/g/k;->c()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    goto/16 :goto_3

    :cond_0
    new-instance v0, Ljava/lang/StringBuffer;

    const/16 v2, 0x100

    invoke-direct {v0, v2}, Ljava/lang/StringBuffer;-><init>(I)V

    iget-object v2, p2, La/a/a/g/k;->a:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    sget v3, La/a/a/i/i;->L:I

    if-le v2, v3, :cond_1

    move v2, v3

    :cond_1
    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v3, v2, :cond_5

    iget-object v5, p2, La/a/a/g/k;->a:Ljava/util/List;

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_2

    goto :goto_2

    :cond_2
    and-int v5, v1, p1

    if-eqz v5, :cond_4

    iget-object v5, p2, La/a/a/g/k;->a:Ljava/util/List;

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/net/wifi/ScanResult;

    iget-object v5, v5, Landroid/net/wifi/ScanResult;->BSSID:Ljava/lang/String;

    if-eqz v5, :cond_4

    if-nez v4, :cond_3

    const-string v5, "&ssid="

    goto :goto_1

    :cond_3
    const-string v5, "|"

    :goto_1
    invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v5, p2, La/a/a/g/k;->a:Ljava/util/List;

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/net/wifi/ScanResult;

    iget-object v5, v5, Landroid/net/wifi/ScanResult;->BSSID:Ljava/lang/String;

    const-string v6, ":"

    const-string v7, ""

    invoke-virtual {v5, v6, v7}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v5, ";"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v5, p2, La/a/a/g/k;->a:Ljava/util/List;

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/net/wifi/ScanResult;

    iget-object v5, v5, Landroid/net/wifi/ScanResult;->SSID:Ljava/lang/String;

    invoke-virtual {p0, v5}, La/a/a/g/f;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v4, v4, 0x1

    :cond_4
    shl-int/lit8 v1, v1, 0x1

    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_6
    :goto_3
    const/4 p0, 0x0

    return-object p0
.end method

.method public a(IZLa/a/a/g/k;I)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, La/a/a/g/f;->a:La/a/a/g/g;

    if-eqz p0, :cond_0

    invoke-virtual {p0, p1, p2, p3, p4}, La/a/a/g/g;->a(IZLa/a/a/g/k;I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public a(La/a/a/g/a;)Ljava/lang/String;
    .locals 2

    iget-object v0, p0, La/a/a/g/f;->a:La/a/a/g/g;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, La/a/a/g/f;->a:La/a/a/g/g;

    invoke-virtual {v1, p1}, La/a/a/g/g;->a(La/a/a/g/a;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "&cl_list="

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, La/a/a/g/f;->b()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public a(La/a/a/g/k;ILjava/lang/String;ZI)Ljava/lang/String;
    .locals 6

    iget-object v0, p0, La/a/a/g/f;->a:La/a/a/g/g;

    if-eqz v0, :cond_0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, La/a/a/g/g;->a(La/a/a/g/k;ILjava/lang/String;ZI)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public a(Landroid/net/wifi/WifiInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, La/a/a/g/f;->a:La/a/a/g/g;

    if-eqz p0, :cond_0

    invoke-virtual {p0, p1, p2}, La/a/a/g/g;->a(Landroid/net/wifi/WifiInfo;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p0

    invoke-static {}, La/a/a/b/d;->i()La/a/a/b/d;

    move-result-object v0

    iget v0, v0, La/a/a/b/d;->K:I

    if-le p0, v0, :cond_0

    invoke-static {}, La/a/a/b/d;->i()La/a/a/b/d;

    move-result-object p0

    iget p0, p0, La/a/a/b/d;->K:I

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    :cond_0
    if-eqz p1, :cond_2

    const-string p0, "&"

    invoke-virtual {p1, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, ";"

    if-nez v0, :cond_1

    invoke-virtual {p1, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const-string v0, "_"

    invoke-virtual {p1, p0, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    :cond_2
    return-object p1
.end method

.method public final a(Ljava/util/List;Landroid/telephony/TelephonyManager;I[IZI)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/telephony/CellInfo;",
            ">;",
            "Landroid/telephony/TelephonyManager;",
            "I[IZI)",
            "Ljava/lang/String;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x1

    if-eq p3, v1, :cond_1

    invoke-static {}, La/a/a/b/d;->i()La/a/a/b/d;

    move-result-object p3

    iget p3, p3, La/a/a/b/d;->H:I

    if-ne p3, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return-object p0

    :cond_1
    :goto_0
    invoke-static {}, La/a/a/b/d;->i()La/a/a/b/d;

    move-result-object p3

    iget p3, p3, La/a/a/b/d;->H:I

    if-eq p3, v1, :cond_2

    if-eqz p5, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/telephony/CellInfo;

    invoke-virtual {p0, p3, p2}, La/a/a/g/f;->a(Landroid/telephony/CellInfo;Landroid/telephony/TelephonyManager;)La/a/a/g/h;

    move-result-object p3

    invoke-interface {v0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    invoke-static {v0, p6}, La/a/a/g/f;->a(Ljava/util/List;I)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1, p4, v1}, La/a/a/g/f;->a(Ljava/util/List;[IZ)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final a(Ljava/util/List;[IZ)Ljava/lang/String;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "La/a/a/g/h;",
            ">;[IZ)",
            "Ljava/lang/String;"
        }
    .end annotation

    if-eqz p1, :cond_32

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p0

    if-nez p0, :cond_0

    goto/16 :goto_2

    :cond_0
    new-instance p0, Lcom/baidu/location/l/c;

    invoke-direct {p0}, Lcom/baidu/location/l/c;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_31

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/a/a/g/h;

    new-instance v2, Lcom/baidu/location/l/b;

    invoke-direct {v2}, Lcom/baidu/location/l/b;-><init>()V

    new-instance v3, Lcom/baidu/location/l/a;

    invoke-direct {v3}, Lcom/baidu/location/l/a;-><init>()V

    iget v4, v0, La/a/a/g/h;->a:I

    invoke-virtual {v3, v4}, Lcom/baidu/location/l/a;->a(I)Lcom/baidu/location/l/a;

    iget-object v4, v0, La/a/a/g/h;->b:Ljava/lang/String;

    if-eqz v4, :cond_1

    invoke-static {v4}, Lc/b/a/a/a;->a(Ljava/lang/String;)Lc/b/a/a/a;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/baidu/location/l/a;->a(Lc/b/a/a/a;)Lcom/baidu/location/l/a;

    :cond_1
    iget-object v4, v0, La/a/a/g/h;->c:Ljava/lang/String;

    if-eqz v4, :cond_2

    invoke-static {v4}, Lc/b/a/a/a;->a(Ljava/lang/String;)Lc/b/a/a/a;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/baidu/location/l/a;->b(Lc/b/a/a/a;)Lcom/baidu/location/l/a;

    :cond_2
    iget v4, v0, La/a/a/g/h;->d:I

    invoke-virtual {v3, v4}, Lcom/baidu/location/l/a;->c(I)Lcom/baidu/location/l/a;

    iget-wide v4, v0, La/a/a/g/h;->e:J

    invoke-virtual {v3, v4, v5}, Lcom/baidu/location/l/a;->a(J)Lcom/baidu/location/l/a;

    iget v4, v0, La/a/a/g/h;->f:I

    const v5, 0x7fffffff

    if-eq v4, v5, :cond_3

    invoke-virtual {v3, v4}, Lcom/baidu/location/l/a;->b(I)Lcom/baidu/location/l/a;

    :cond_3
    if-nez p3, :cond_4

    invoke-virtual {v2, v3}, Lcom/baidu/location/l/b;->a(Lcom/baidu/location/l/a;)Lcom/baidu/location/l/b;

    :cond_4
    instance-of v3, v0, La/a/a/g/i;

    const/4 v4, 0x2

    const/4 v6, 0x1

    if-eqz v3, :cond_1b

    new-instance v3, Lcom/baidu/location/l/d;

    invoke-direct {v3}, Lcom/baidu/location/l/d;-><init>()V

    check-cast v0, La/a/a/g/i;

    iget v7, v0, La/a/a/g/i;->h:I

    if-eq v7, v5, :cond_6

    if-eqz p3, :cond_5

    aget v1, p2, v1

    if-ne v1, v6, :cond_6

    :cond_5
    invoke-virtual {v3, v7}, Lcom/baidu/location/l/d;->b(I)Lcom/baidu/location/l/d;

    :cond_6
    iget v1, v0, La/a/a/g/i;->i:I

    if-eq v1, v5, :cond_8

    if-eqz p3, :cond_7

    aget v7, p2, v6

    if-ne v7, v6, :cond_8

    :cond_7
    invoke-virtual {v3, v1}, Lcom/baidu/location/l/d;->e(I)Lcom/baidu/location/l/d;

    :cond_8
    iget v1, v0, La/a/a/g/i;->j:I

    if-eq v1, v5, :cond_a

    if-eqz p3, :cond_9

    aget v4, p2, v4

    if-ne v4, v6, :cond_a

    :cond_9
    invoke-virtual {v3, v1}, Lcom/baidu/location/l/d;->j(I)Lcom/baidu/location/l/d;

    :cond_a
    iget v1, v0, La/a/a/g/i;->k:I

    if-eq v1, v5, :cond_c

    if-eqz p3, :cond_b

    const/4 v4, 0x3

    aget v4, p2, v4

    if-ne v4, v6, :cond_c

    :cond_b
    invoke-virtual {v3, v1}, Lcom/baidu/location/l/d;->d(I)Lcom/baidu/location/l/d;

    :cond_c
    iget v1, v0, La/a/a/g/i;->l:I

    if-eq v1, v5, :cond_e

    if-eqz p3, :cond_d

    const/4 v4, 0x4

    aget v4, p2, v4

    if-ne v4, v6, :cond_e

    :cond_d
    invoke-virtual {v3, v1}, Lcom/baidu/location/l/d;->a(I)Lcom/baidu/location/l/d;

    :cond_e
    iget v1, v0, La/a/a/g/i;->m:I

    if-eq v1, v5, :cond_10

    if-eqz p3, :cond_f

    const/4 v4, 0x5

    aget v4, p2, v4

    if-ne v4, v6, :cond_10

    :cond_f
    invoke-virtual {v3, v1}, Lcom/baidu/location/l/d;->h(I)Lcom/baidu/location/l/d;

    :cond_10
    iget v1, v0, La/a/a/g/i;->n:I

    if-eq v1, v5, :cond_12

    if-eqz p3, :cond_11

    const/4 v4, 0x6

    aget v4, p2, v4

    if-ne v4, v6, :cond_12

    :cond_11
    invoke-virtual {v3, v1}, Lcom/baidu/location/l/d;->f(I)Lcom/baidu/location/l/d;

    :cond_12
    iget v1, v0, La/a/a/g/i;->o:I

    if-eq v1, v5, :cond_14

    if-eqz p3, :cond_13

    const/4 v4, 0x7

    aget v4, p2, v4

    if-ne v4, v6, :cond_14

    :cond_13
    invoke-virtual {v3, v1}, Lcom/baidu/location/l/d;->g(I)Lcom/baidu/location/l/d;

    :cond_14
    iget v1, v0, La/a/a/g/i;->p:I

    if-eq v1, v5, :cond_16

    if-eqz p3, :cond_15

    const/16 v4, 0x8

    aget v4, p2, v4

    if-ne v4, v6, :cond_16

    :cond_15
    invoke-virtual {v3, v1}, Lcom/baidu/location/l/d;->i(I)Lcom/baidu/location/l/d;

    :cond_16
    iget v1, v0, La/a/a/g/i;->q:I

    if-eq v1, v5, :cond_18

    if-eqz p3, :cond_17

    const/16 v4, 0x9

    aget v4, p2, v4

    if-ne v4, v6, :cond_18

    :cond_17
    invoke-virtual {v3, v1}, Lcom/baidu/location/l/d;->c(I)Lcom/baidu/location/l/d;

    :cond_18
    iget v0, v0, La/a/a/g/i;->r:I

    if-eq v0, v5, :cond_1a

    if-eqz p3, :cond_19

    const/16 v1, 0xa

    aget v1, p2, v1

    if-ne v1, v6, :cond_1a

    :cond_19
    invoke-virtual {v3, v0}, Lcom/baidu/location/l/d;->k(I)Lcom/baidu/location/l/d;

    :cond_1a
    invoke-virtual {v2, v3}, Lcom/baidu/location/l/b;->a(Lcom/baidu/location/l/d;)Lcom/baidu/location/l/b;

    goto/16 :goto_1

    :cond_1b
    instance-of v3, v0, La/a/a/g/j;

    if-eqz v3, :cond_30

    new-instance v3, Lcom/baidu/location/l/e;

    invoke-direct {v3}, Lcom/baidu/location/l/e;-><init>()V

    check-cast v0, La/a/a/g/j;

    iget-wide v7, v0, La/a/a/g/j;->h:J

    const-wide v9, 0x7fffffffffffffffL

    cmp-long v9, v7, v9

    if-eqz v9, :cond_1d

    if-eqz p3, :cond_1c

    aget v1, p2, v1

    if-ne v1, v6, :cond_1d

    :cond_1c
    invoke-virtual {v3, v7, v8}, Lcom/baidu/location/l/e;->a(J)Lcom/baidu/location/l/e;

    :cond_1d
    iget v1, v0, La/a/a/g/j;->i:I

    if-eq v1, v5, :cond_1f

    if-eqz p3, :cond_1e

    aget v7, p2, v6

    if-ne v7, v6, :cond_1f

    :cond_1e
    invoke-virtual {v3, v1}, Lcom/baidu/location/l/e;->e(I)Lcom/baidu/location/l/e;

    :cond_1f
    iget v1, v0, La/a/a/g/j;->j:I

    if-eq v1, v5, :cond_21

    if-eqz p3, :cond_20

    aget v4, p2, v4

    if-ne v4, v6, :cond_21

    :cond_20
    invoke-virtual {v3, v1}, Lcom/baidu/location/l/e;->i(I)Lcom/baidu/location/l/e;

    :cond_21
    iget v1, v0, La/a/a/g/j;->k:I

    if-eq v1, v5, :cond_23

    if-eqz p3, :cond_22

    const/16 v4, 0xb

    aget v4, p2, v4

    if-ne v4, v6, :cond_23

    :cond_22
    invoke-virtual {v3, v1}, Lcom/baidu/location/l/e;->d(I)Lcom/baidu/location/l/e;

    :cond_23
    iget v1, v0, La/a/a/g/j;->l:I

    if-eq v1, v5, :cond_25

    if-eqz p3, :cond_24

    const/16 v4, 0xc

    aget v4, p2, v4

    if-ne v4, v6, :cond_25

    :cond_24
    invoke-virtual {v3, v1}, Lcom/baidu/location/l/e;->f(I)Lcom/baidu/location/l/e;

    :cond_25
    iget v1, v0, La/a/a/g/j;->m:I

    if-eq v1, v5, :cond_27

    if-eqz p3, :cond_26

    const/16 v4, 0xd

    aget v4, p2, v4

    if-ne v4, v6, :cond_27

    :cond_26
    invoke-virtual {v3, v1}, Lcom/baidu/location/l/e;->g(I)Lcom/baidu/location/l/e;

    :cond_27
    iget v1, v0, La/a/a/g/j;->n:I

    if-eq v1, v5, :cond_29

    if-eqz p3, :cond_28

    const/16 v4, 0xe

    aget v4, p2, v4

    if-ne v4, v6, :cond_29

    :cond_28
    invoke-virtual {v3, v1}, Lcom/baidu/location/l/e;->h(I)Lcom/baidu/location/l/e;

    :cond_29
    iget v1, v0, La/a/a/g/j;->o:I

    if-eq v1, v5, :cond_2b

    if-eqz p3, :cond_2a

    const/16 v4, 0xf

    aget v4, p2, v4

    if-ne v4, v6, :cond_2b

    :cond_2a
    invoke-virtual {v3, v1}, Lcom/baidu/location/l/e;->a(I)Lcom/baidu/location/l/e;

    :cond_2b
    iget v1, v0, La/a/a/g/j;->p:I

    if-eq v1, v5, :cond_2d

    if-eqz p3, :cond_2c

    const/16 v4, 0x10

    aget v4, p2, v4

    if-ne v4, v6, :cond_2d

    :cond_2c
    invoke-virtual {v3, v1}, Lcom/baidu/location/l/e;->b(I)Lcom/baidu/location/l/e;

    :cond_2d
    iget v0, v0, La/a/a/g/j;->q:I

    if-eq v0, v5, :cond_2f

    if-eqz p3, :cond_2e

    const/16 v1, 0x11

    aget v1, p2, v1

    if-ne v1, v6, :cond_2f

    :cond_2e
    invoke-virtual {v3, v0}, Lcom/baidu/location/l/e;->c(I)Lcom/baidu/location/l/e;

    :cond_2f
    invoke-virtual {v2, v3}, Lcom/baidu/location/l/b;->a(Lcom/baidu/location/l/e;)Lcom/baidu/location/l/b;

    :cond_30
    :goto_1
    invoke-virtual {p0, v2}, Lcom/baidu/location/l/c;->a(Lcom/baidu/location/l/b;)Lcom/baidu/location/l/c;

    goto/16 :goto_0

    :cond_31
    invoke-virtual {p0}, Lc/b/a/a/c;->c()[B

    move-result-object p0

    invoke-static {p0, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_32
    :goto_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public declared-synchronized a(Landroid/content/Context;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, La/a/a/g/f;->a:La/a/a/g/g;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    const-string v0, "phone"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    iput-object v0, p0, La/a/a/g/f;->b:Landroid/telephony/TelephonyManager;

    const-string v0, "wifi"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/WifiManager;

    iput-object v0, p0, La/a/a/g/f;->d:Landroid/net/wifi/WifiManager;

    const-string v0, "connectivity"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    iput-object v0, p0, La/a/a/g/f;->c:Landroid/net/ConnectivityManager;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, La/a/a/g/f;->e:Landroid/os/Handler;

    :cond_1
    iget-object v0, p0, La/a/a/g/f;->a:La/a/a/g/g;

    sget-object v1, La/a/a/g/g$b;->d:La/a/a/g/g$b;

    invoke-virtual {v0, v1}, La/a/a/g/g;->a(La/a/a/g/g$b;)V

    const/16 v0, 0x64

    iget-object v1, p0, La/a/a/g/f;->a:La/a/a/g/g;

    invoke-virtual {v1, v0}, La/a/a/g/g;->d(I)V

    iget-object v0, p0, La/a/a/g/f;->a:La/a/a/g/g;

    const/16 v1, 0x7d0

    invoke-virtual {v0, v1}, La/a/a/g/g;->e(I)V

    iget-object v0, p0, La/a/a/g/f;->a:La/a/a/g/g;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, La/a/a/g/g;->b(Z)V

    const/16 v0, 0x1e

    iget-object v1, p0, La/a/a/g/f;->a:La/a/a/g/g;

    invoke-virtual {v1, v0}, La/a/a/g/g;->c(I)V

    const/4 v0, 0x0

    iget-object v1, p0, La/a/a/g/f;->a:La/a/a/g/g;

    invoke-virtual {v1, v0}, La/a/a/g/g;->a(Z)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, La/a/a/g/f;->a:La/a/a/g/g;

    invoke-virtual {v1, p1, v0}, La/a/a/g/g;->a(Landroid/content/Context;Ljava/util/List;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catch_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final a(Landroid/telephony/TelephonyManager;I[IZI)V
    .locals 7

    if-eqz p1, :cond_0

    :try_start_0
    invoke-virtual {p1}, Landroid/telephony/TelephonyManager;->getAllCellInfo()Ljava/util/List;

    move-result-object v1

    move-object v0, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    invoke-virtual/range {v0 .. v6}, La/a/a/g/f;->a(Ljava/util/List;Landroid/telephony/TelephonyManager;I[IZI)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, La/a/a/g/f;->f:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-void
.end method

.method public a(J)Z
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, La/a/a/g/f;->d:Landroid/net/wifi/WifiManager;

    invoke-virtual {v1}, Landroid/net/wifi/WifiManager;->isWifiEnabled()Z

    move-result v1

    if-nez v1, :cond_0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x11

    if-le v1, v2, :cond_2

    iget-object v1, p0, La/a/a/g/f;->d:Landroid/net/wifi/WifiManager;

    invoke-virtual {v1}, Landroid/net/wifi/WifiManager;->isScanAlwaysAvailable()Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_0
    invoke-virtual {p0}, La/a/a/g/f;->p()Z

    move-result v1

    if-eqz v1, :cond_1

    return v0

    :cond_1
    invoke-virtual {p0}, La/a/a/g/f;->j()La/a/a/g/k;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {p0, v1, p1, p2}, La/a/a/g/f;->a(La/a/a/g/k;J)Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p0, :cond_2

    const/4 v0, 0x1

    :catch_0
    :cond_2
    return v0
.end method

.method public a(La/a/a/g/a;La/a/a/g/a;)Z
    .locals 0

    iget-object p0, p0, La/a/a/g/f;->a:La/a/a/g/g;

    if-eqz p0, :cond_0

    invoke-virtual {p0, p1, p2}, La/a/a/g/g;->a(La/a/a/g/a;La/a/a/g/a;)Z

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public final a(La/a/a/g/k;J)Z
    .locals 18

    move-object/from16 v0, p1

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const-wide/16 v3, 0x3e8

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/16 v8, 0x11

    if-lt v1, v8, :cond_1

    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v8

    div-long/2addr v8, v3
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-wide v8, v6

    :goto_0
    cmp-long v1, v8, v6

    if-lez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_1

    :cond_0
    move v1, v5

    goto :goto_1

    :cond_1
    move v1, v5

    move-wide v8, v6

    :goto_1
    if-nez v1, :cond_2

    return v5

    :cond_2
    iget-object v10, v0, La/a/a/g/k;->a:Ljava/util/List;

    if-eqz v10, :cond_a

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v10

    if-nez v10, :cond_3

    goto :goto_7

    :cond_3
    iget-object v10, v0, La/a/a/g/k;->a:Ljava/util/List;

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v10

    const/16 v11, 0x10

    if-le v10, v11, :cond_4

    move v10, v11

    :cond_4
    move v11, v5

    move-wide v12, v6

    move-wide v14, v12

    :goto_2
    if-ge v11, v10, :cond_7

    iget-object v2, v0, La/a/a/g/k;->a:Ljava/util/List;

    invoke-interface {v2, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_6

    iget-object v2, v0, La/a/a/g/k;->a:Ljava/util/List;

    invoke-interface {v2, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/net/wifi/ScanResult;

    iget v2, v2, Landroid/net/wifi/ScanResult;->level:I

    if-nez v2, :cond_5

    goto :goto_4

    :cond_5
    if-eqz v1, :cond_6

    :try_start_1
    iget-object v2, v0, La/a/a/g/k;->a:Ljava/util/List;

    invoke-interface {v2, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/net/wifi/ScanResult;

    iget-wide v6, v2, Landroid/net/wifi/ScanResult;->timestamp:J

    sub-long v6, v8, v6

    const-wide/32 v16, 0xf4240

    div-long v6, v6, v16
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    const-wide/16 v6, 0x0

    :goto_3
    add-long/2addr v14, v6

    cmp-long v2, v6, v12

    if-lez v2, :cond_6

    move-wide v12, v6

    :cond_6
    :goto_4
    add-int/lit8 v11, v11, 0x1

    const-wide/16 v6, 0x0

    goto :goto_2

    :cond_7
    int-to-long v0, v10

    div-long/2addr v14, v0

    mul-long/2addr v12, v3

    cmp-long v0, v12, p2

    if-gtz v0, :cond_9

    mul-long/2addr v14, v3

    cmp-long v0, v14, p2

    if-lez v0, :cond_8

    goto :goto_5

    :cond_8
    move v2, v5

    goto :goto_6

    :cond_9
    :goto_5
    const/4 v2, 0x1

    :goto_6
    return v2

    :cond_a
    :goto_7
    return v5
.end method

.method public a(La/a/a/g/k;La/a/a/g/k;F)Z
    .locals 4

    invoke-virtual {p2, p1, p3}, La/a/a/g/k;->a(La/a/a/g/k;F)Z

    move-result p3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sget-wide v2, La/a/a/b/c;->i:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-lez v2, :cond_0

    const-wide/16 v2, 0x7530

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    if-eqz p3, :cond_0

    invoke-virtual {p0, p2}, La/a/a/g/f;->b(La/a/a/g/k;)J

    move-result-wide v0

    invoke-virtual {p0, p1}, La/a/a/g/f;->b(La/a/a/g/k;)J

    move-result-wide p0

    sub-long/2addr v0, p0

    const-wide/16 p0, 0x1e

    cmp-long p0, v0, p0

    if-lez p0, :cond_0

    const/4 p3, 0x0

    :cond_0
    return p3
.end method

.method public b(Ljava/lang/String;)I
    .locals 3

    const/4 p0, -0x1

    if-eqz p1, :cond_2

    const-string v0, "mNrTac"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, " "

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "mNrTac=(.+?)\\}"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    :catchall_0
    move v0, p0

    :cond_0
    :goto_0
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->groupCount()I

    move-result v1

    const/4 v2, 0x1

    if-lt v1, v2, :cond_0

    invoke-virtual {p1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    :try_start_0
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_1
    move p0, v0

    :cond_2
    return p0
.end method

.method public b(La/a/a/g/k;)J
    .locals 18

    move-object/from16 v0, p1

    invoke-virtual/range {p1 .. p1}, La/a/a/g/k;->c()I

    move-result v1

    const-wide/16 v2, 0x0

    if-nez v1, :cond_0

    return-wide v2

    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x11

    const/4 v5, 0x0

    if-lt v1, v4, :cond_1

    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v6

    const-wide/16 v8, 0x3e8

    div-long/2addr v6, v8
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-wide v6, v2

    :goto_0
    cmp-long v1, v6, v2

    if-lez v1, :cond_2

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    move-wide v6, v2

    :cond_2
    move v1, v5

    :goto_1
    if-nez v1, :cond_3

    return-wide v2

    :cond_3
    iget-object v4, v0, La/a/a/g/k;->a:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    const/16 v8, 0x10

    if-le v4, v8, :cond_4

    move v4, v8

    :cond_4
    move-wide v8, v2

    move-wide v10, v8

    move-wide v12, v10

    :goto_2
    const-wide/16 v14, 0x1

    if-ge v5, v4, :cond_7

    iget-object v2, v0, La/a/a/g/k;->a:Ljava/util/List;

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_6

    iget-object v2, v0, La/a/a/g/k;->a:Ljava/util/List;

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/net/wifi/ScanResult;

    iget v2, v2, Landroid/net/wifi/ScanResult;->level:I

    if-nez v2, :cond_5

    goto :goto_4

    :cond_5
    if-eqz v1, :cond_6

    :try_start_1
    iget-object v2, v0, La/a/a/g/k;->a:Ljava/util/List;

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/net/wifi/ScanResult;

    iget-wide v2, v2, Landroid/net/wifi/ScanResult;->timestamp:J

    sub-long v2, v6, v2

    const-wide/32 v16, 0xf4240

    div-long v2, v2, v16
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    const-wide/16 v2, 0x0

    :goto_3
    add-long/2addr v10, v2

    add-long/2addr v8, v14

    cmp-long v14, v2, v12

    if-lez v14, :cond_6

    move-wide v12, v2

    :cond_6
    :goto_4
    add-int/lit8 v5, v5, 0x1

    const-wide/16 v2, 0x0

    goto :goto_2

    :cond_7
    cmp-long v0, v8, v14

    if-lez v0, :cond_8

    sub-long/2addr v10, v12

    sub-long/2addr v8, v14

    div-long v12, v10, v8

    :cond_8
    return-wide v12
.end method

.method public final declared-synchronized b()Ljava/lang/String;
    .locals 3

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, La/a/a/g/f;->f:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, La/a/a/g/f;->f:Ljava/lang/String;

    const-string v1, "\n"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public b(ILa/a/a/g/k;)Ljava/lang/String;
    .locals 8

    invoke-virtual {p2}, La/a/a/g/k;->c()I

    move-result p0

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ge p0, v1, :cond_0

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/StringBuffer;

    const/16 v2, 0x200

    invoke-direct {p0, v2}, Ljava/lang/StringBuffer;-><init>(I)V

    iget-object v2, p2, La/a/a/g/k;->a:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-le v2, p1, :cond_1

    goto :goto_0

    :cond_1
    move p1, v2

    :goto_0
    const/4 v2, 0x0

    move v4, v1

    move v3, v2

    :goto_1
    if-ge v3, p1, :cond_6

    iget-object v5, p2, La/a/a/g/k;->a:Ljava/util/List;

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_5

    iget-object v5, p2, La/a/a/g/k;->a:Ljava/util/List;

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/net/wifi/ScanResult;

    iget v5, v5, Landroid/net/wifi/ScanResult;->level:I

    if-eqz v5, :cond_5

    iget-object v5, p2, La/a/a/g/k;->a:Ljava/util/List;

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/net/wifi/ScanResult;

    iget-object v5, v5, Landroid/net/wifi/ScanResult;->BSSID:Ljava/lang/String;

    if-nez v5, :cond_2

    goto :goto_3

    :cond_2
    if-eqz v4, :cond_3

    move v4, v2

    goto :goto_2

    :cond_3
    const-string v5, "|"

    invoke-virtual {p0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :goto_2
    iget-object v5, p2, La/a/a/g/k;->a:Ljava/util/List;

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/net/wifi/ScanResult;

    iget-object v5, v5, Landroid/net/wifi/ScanResult;->BSSID:Ljava/lang/String;

    const-string v6, ":"

    const-string v7, ""

    invoke-virtual {v5, v6, v7}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v5, p2, La/a/a/g/k;->a:Ljava/util/List;

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/net/wifi/ScanResult;

    iget v5, v5, Landroid/net/wifi/ScanResult;->level:I

    if-gez v5, :cond_4

    neg-int v5, v5

    :cond_4
    sget-object v6, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    new-array v7, v1, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v7, v2

    const-string v5, ";%d;"

    invoke-static {v6, v5, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_5
    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_6
    if-nez v4, :cond_7

    invoke-virtual {p0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_7
    return-object v0
.end method

.method public b(La/a/a/g/a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, La/a/a/g/f;->a:La/a/a/g/g;

    if-eqz p0, :cond_0

    invoke-virtual {p0, p1}, La/a/a/g/g;->b(La/a/a/g/a;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public b(J)Z
    .locals 8

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, La/a/a/g/f;->j:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    const/4 v5, 0x0

    if-ltz v4, :cond_0

    const-wide/16 v6, 0x7d0

    cmp-long v0, v0, v6

    if-gtz v0, :cond_0

    return v5

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, La/a/a/g/f;->j:J

    sget v0, La/a/a/i/i;->e:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    invoke-virtual {p0, v5}, La/a/a/g/f;->a(I)La/a/a/g/k;

    :cond_1
    iget-object p0, p0, La/a/a/g/f;->a:La/a/a/g/g;

    if-eqz p0, :cond_2

    invoke-virtual {p0}, La/a/a/g/g;->d()J

    move-result-wide v0

    sub-long/2addr v0, p1

    cmp-long p0, v0, v2

    if-lez p0, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_2
    return v5
.end method

.method public c(La/a/a/g/k;)J
    .locals 12
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    iget-object p0, p1, La/a/a/g/k;->a:Ljava/util/List;

    const-wide/16 v0, 0x0

    if-eqz p0, :cond_a

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    if-nez p0, :cond_0

    goto/16 :goto_6

    :cond_0
    const-wide/32 v2, 0x7fffffff

    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x11

    const/4 v5, 0x0

    if-lt p0, v4, :cond_1

    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v6

    const-wide/16 v8, 0x3e8

    div-long/2addr v6, v8
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-wide v6, v0

    :goto_0
    cmp-long p0, v6, v0

    if-lez p0, :cond_2

    const/4 p0, 0x1

    goto :goto_1

    :cond_1
    move-wide v6, v0

    :cond_2
    move p0, v5

    :goto_1
    if-nez p0, :cond_3

    return-wide v0

    :cond_3
    iget-object v4, p1, La/a/a/g/k;->a:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    const/16 v8, 0x10

    if-le v4, v8, :cond_4

    move v4, v8

    :cond_4
    :goto_2
    if-ge v5, v4, :cond_7

    iget-object v8, p1, La/a/a/g/k;->a:Ljava/util/List;

    invoke-interface {v8, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_6

    iget-object v8, p1, La/a/a/g/k;->a:Ljava/util/List;

    invoke-interface {v8, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/net/wifi/ScanResult;

    iget v8, v8, Landroid/net/wifi/ScanResult;->level:I

    if-nez v8, :cond_5

    goto :goto_4

    :cond_5
    if-eqz p0, :cond_6

    :try_start_1
    iget-object v8, p1, La/a/a/g/k;->a:Ljava/util/List;

    invoke-interface {v8, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/net/wifi/ScanResult;

    iget-wide v8, v8, Landroid/net/wifi/ScanResult;->timestamp:J

    sub-long v8, v6, v8

    const-wide/32 v10, 0xf4240

    div-long/2addr v8, v10
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    move-wide v8, v0

    :goto_3
    cmp-long v10, v8, v2

    if-gez v10, :cond_6

    move-wide v2, v8

    :cond_6
    :goto_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_7
    if-eqz p0, :cond_8

    goto :goto_5

    :cond_8
    move-wide v2, v0

    :goto_5
    cmp-long p0, v2, v0

    if-gez p0, :cond_9

    goto :goto_6

    :cond_9
    move-wide v0, v2

    :cond_a
    :goto_6
    return-wide v0
.end method

.method public c()Landroid/net/wifi/WifiInfo;
    .locals 2

    sget v0, La/a/a/i/i;->e:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    iget-object p0, p0, La/a/a/g/f;->a:La/a/a/g/g;

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, La/a/a/g/g;->a()Landroid/net/wifi/WifiInfo;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public final c(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    if-eqz p1, :cond_1

    const-string p0, "&"

    invoke-virtual {p1, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, ";"

    if-nez v0, :cond_0

    invoke-virtual {p1, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const-string v0, "_"

    invoke-virtual {p1, p0, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method public c(La/a/a/g/a;)Ljava/util/HashSet;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/a/a/g/a;",
            ")",
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object p0, p0, La/a/a/g/f;->a:La/a/a/g/g;

    if-eqz p0, :cond_0

    invoke-virtual {p0, p1}, La/a/a/g/g;->c(La/a/a/g/a;)Ljava/util/HashSet;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public d(La/a/a/g/k;)I
    .locals 2

    const/4 p0, 0x0

    move v0, p0

    :goto_0
    invoke-virtual {p1}, La/a/a/g/k;->c()I

    move-result v1

    if-ge v0, v1, :cond_2

    iget-object v1, p1, La/a/a/g/k;->a:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v1, p1, La/a/a/g/k;->a:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/wifi/ScanResult;

    iget v1, v1, Landroid/net/wifi/ScanResult;->level:I

    neg-int v1, v1

    if-lez v1, :cond_1

    return v1

    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return p0
.end method

.method public d()Ljava/lang/String;
    .locals 2

    iget-object p0, p0, La/a/a/g/f;->a:La/a/a/g/g;

    if-eqz p0, :cond_0

    sget v0, La/a/a/i/i;->e:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, La/a/a/g/g;->b()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public d(La/a/a/g/a;)Ljava/lang/String;
    .locals 4

    new-instance p0, Ljava/lang/StringBuffer;

    const/16 v0, 0x80

    invoke-direct {p0, v0}, Ljava/lang/StringBuffer;-><init>(I)V

    iget-wide v0, p1, La/a/a/g/a;->b:J

    const-wide/16 v2, 0x17

    add-long/2addr v0, v2

    invoke-virtual {p0, v0, v1}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    const-string v0, "H"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget v0, p1, La/a/a/g/a;->a:I

    add-int/lit8 v0, v0, 0x2d

    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    const-string v0, "K"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget v0, p1, La/a/a/g/a;->d:I

    add-int/lit8 v0, v0, 0x36

    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    const-string v0, "Q"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget p1, p1, La/a/a/g/a;->c:I

    add-int/lit16 p1, p1, 0xcb

    invoke-virtual {p0, p1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {p0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final e()I
    .locals 1

    :try_start_0
    iget-object p0, p0, La/a/a/g/f;->b:Landroid/telephony/TelephonyManager;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getSignalStrength()Landroid/telephony/SignalStrength;

    move-result-object p0

    const-string v0, "getLteRssnr"

    invoke-static {p0, v0}, La/a/a/i/i;->b(Ljava/lang/Object;Ljava/lang/String;)I

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_0
    const p0, 0x7fffffff

    :goto_0
    return p0
.end method

.method public f()I
    .locals 1

    const/4 v0, 0x0

    :try_start_0
    iget-object p0, p0, La/a/a/g/f;->c:Landroid/net/ConnectivityManager;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/net/NetworkInfo;->getSubtype()I

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return v0
.end method

.method public g()J
    .locals 2

    iget-object p0, p0, La/a/a/g/f;->a:La/a/a/g/g;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, La/a/a/g/g;->d()J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public h()Ljava/lang/String;
    .locals 2

    const/4 v0, -0x1

    :try_start_0
    iget-object p0, p0, La/a/a/g/f;->b:Landroid/telephony/TelephonyManager;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getSimState()I

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&sim="

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public i()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/net/wifi/WifiConfiguration;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    iget-object p0, p0, La/a/a/g/f;->d:Landroid/net/wifi/WifiManager;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/net/wifi/WifiManager;->getConfiguredNetworks()Ljava/util/List;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :cond_0
    return-object v0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    return-object v0
.end method

.method public j()La/a/a/g/k;
    .locals 3

    iget-object p0, p0, La/a/a/g/f;->a:La/a/a/g/g;

    if-eqz p0, :cond_0

    sget v0, La/a/a/i/i;->e:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, La/a/a/g/g;->c()La/a/a/g/k;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, La/a/a/g/k;

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    invoke-direct {p0, v0, v1, v2}, La/a/a/g/k;-><init>(Ljava/util/List;J)V

    return-object p0
.end method

.method public k()Ljava/lang/String;
    .locals 7

    invoke-static {}, La/a/a/b/d;->i()La/a/a/b/d;

    move-result-object v0

    iget v0, v0, La/a/a/b/d;->J:I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p0}, La/a/a/g/f;->j()La/a/a/g/k;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, La/a/a/g/k;->c()I

    move-result v2

    const/4 v3, 0x1

    if-ge v2, v3, :cond_1

    goto/16 :goto_2

    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, v0, La/a/a/g/k;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/net/wifi/ScanResult;

    if-eqz v2, :cond_2

    iget v3, v2, Landroid/net/wifi/ScanResult;->level:I

    if-eqz v3, :cond_2

    iget-object v3, v2, Landroid/net/wifi/ScanResult;->BSSID:Ljava/lang/String;

    if-nez v3, :cond_3

    goto :goto_0

    :cond_3
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    new-instance v0, La/a/a/g/f$d;

    invoke-direct {v0}, La/a/a/g/f$d;-><init>()V

    invoke-static {v1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {}, La/a/a/b/d;->i()La/a/a/b/d;

    move-result-object v2

    iget v2, v2, La/a/a/b/d;->L:I

    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v0, :cond_5

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/net/wifi/ScanResult;

    iget-object v4, v4, Landroid/net/wifi/ScanResult;->BSSID:Ljava/lang/String;

    const-string v5, ":"

    const-string v6, ""

    invoke-virtual {v4, v5, v6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/net/wifi/ScanResult;

    iget-object v5, v5, Landroid/net/wifi/ScanResult;->SSID:Ljava/lang/String;

    invoke-virtual {p0, v5}, La/a/a/g/f;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ","

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ";"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_5
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_6
    :goto_2
    return-object v1
.end method

.method public l()Ljava/lang/String;
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    iget-object v0, p0, La/a/a/g/f;->d:Landroid/net/wifi/WifiManager;

    const-string v1, ""

    if-eqz v0, :cond_1

    :try_start_0
    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->isWifiEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x11

    if-le v0, v2, :cond_1

    iget-object p0, p0, La/a/a/g/f;->d:Landroid/net/wifi/WifiManager;

    invoke-virtual {p0}, Landroid/net/wifi/WifiManager;->isScanAlwaysAvailable()Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p0, :cond_1

    :cond_0
    const-string v1, "&wifio=1"

    nop

    :catch_0
    :cond_1
    return-object v1
.end method

.method public m()V
    .locals 1

    iget-object v0, p0, La/a/a/g/f;->a:La/a/a/g/g;

    if-nez v0, :cond_0

    new-instance v0, La/a/a/g/g;

    invoke-direct {v0}, La/a/a/g/g;-><init>()V

    iput-object v0, p0, La/a/a/g/f;->a:La/a/a/g/g;

    :cond_0
    new-instance v0, La/a/a/g/f$c;

    invoke-direct {v0, p0}, La/a/a/g/f$c;-><init>(La/a/a/g/f;)V

    iget-object p0, p0, La/a/a/g/f;->a:La/a/a/g/g;

    invoke-virtual {p0, v0}, La/a/a/g/g;->a(La/a/a/g/e;)V

    return-void
.end method

.method public n()Z
    .locals 0

    iget-object p0, p0, La/a/a/g/f;->a:La/a/a/g/g;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, La/a/a/g/g;->e()Z

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public o()Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public p()Z
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    iget-object p0, p0, La/a/a/g/f;->c:Landroid/net/ConnectivityManager;

    if-eqz p0, :cond_0

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    move-result-object p0

    invoke-virtual {p0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    :cond_0
    return v0
.end method

.method public q()Z
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, La/a/a/g/f;->d:Landroid/net/wifi/WifiManager;

    invoke-virtual {v1}, Landroid/net/wifi/WifiManager;->isWifiEnabled()Z

    move-result v1

    if-nez v1, :cond_1

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x11

    if-le v1, v2, :cond_0

    iget-object p0, p0, La/a/a/g/f;->d:Landroid/net/wifi/WifiManager;

    invoke-virtual {p0}, Landroid/net/wifi/WifiManager;->isScanAlwaysAvailable()Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    return v0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0

    :catch_0
    return v0
.end method

.method public r()V
    .locals 2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, La/a/a/g/f;->k:J

    return-void
.end method

.method public s()Z
    .locals 14

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, La/a/a/g/f;->a:La/a/a/g/g;

    const-wide/16 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, La/a/a/g/g;->d()J

    move-result-wide v5

    goto :goto_0

    :cond_0
    move-wide v5, v3

    :goto_0
    sub-long v7, v0, v5

    cmp-long v2, v7, v3

    if-lez v2, :cond_4

    iget-wide v2, p0, La/a/a/g/f;->k:J

    const-wide/16 v9, 0x1388

    add-long/2addr v2, v9

    cmp-long v4, v7, v2

    const/4 v9, 0x0

    if-gtz v4, :cond_1

    return v9

    :cond_1
    iget-wide v10, p0, La/a/a/g/f;->i:J

    const-wide/16 v12, 0x3e8

    mul-long/2addr v10, v12

    sub-long/2addr v0, v10

    cmp-long v0, v0, v2

    if-gtz v0, :cond_2

    return v9

    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_3

    const-wide/16 v0, 0x61a8

    cmp-long v0, v7, v0

    if-gez v0, :cond_3

    return v9

    :cond_3
    invoke-virtual {p0}, La/a/a/g/f;->p()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, La/a/a/g/f;->o()Z

    move-result v0

    if-nez v0, :cond_4

    iget-wide v0, p0, La/a/a/g/f;->k:J

    const-wide/16 v2, 0x2710

    add-long/2addr v0, v2

    cmp-long v0, v7, v0

    if-gtz v0, :cond_4

    return v9

    :cond_4
    invoke-virtual {p0, v5, v6}, La/a/a/g/f;->b(J)Z

    move-result p0

    return p0
.end method

.method public t()Z
    .locals 6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, La/a/a/g/f;->h:J

    sub-long v2, v0, v2

    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-lez v4, :cond_0

    const-wide/16 v4, 0x1388

    cmp-long v2, v2, v4

    if-gtz v2, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    iput-wide v0, p0, La/a/a/g/f;->h:J

    invoke-virtual {p0}, La/a/a/g/f;->r()V

    invoke-virtual {p0}, La/a/a/g/f;->s()Z

    move-result p0

    return p0
.end method

.method public declared-synchronized u()V
    .locals 2

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, La/a/a/g/f;->v()V

    iget-object v0, p0, La/a/a/g/f;->a:La/a/a/g/g;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iput-object v1, p0, La/a/a/g/f;->a:La/a/a/g/g;

    :cond_0
    iput-object v1, p0, La/a/a/g/f;->b:Landroid/telephony/TelephonyManager;

    iput-object v1, p0, La/a/a/g/f;->d:Landroid/net/wifi/WifiManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public v()V
    .locals 0

    iget-object p0, p0, La/a/a/g/f;->a:La/a/a/g/g;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, La/a/a/g/g;->f()V

    :cond_0
    return-void
.end method
