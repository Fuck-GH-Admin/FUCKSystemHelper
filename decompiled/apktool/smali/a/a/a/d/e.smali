.class public La/a/a/d/e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/a/a/d/e$f;,
        La/a/a/d/e$e;
    }
.end annotation


# static fields
.field public static final m:[C

.field public static n:La/a/a/d/e;


# instance fields
.field public a:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Ljava/lang/String;",
            "Landroid/bluetooth/le/ScanResult;",
            ">;"
        }
    .end annotation
.end field

.field public b:Landroid/content/Context;

.field public c:Landroid/bluetooth/BluetoothAdapter;

.field public volatile d:Z

.field public e:J

.field public f:Ljava/lang/Object;

.field public g:J

.field public h:I

.field public i:Ljava/lang/String;

.field public j:J

.field public k:J

.field public l:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x10

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, La/a/a/d/e;->m:[C

    return-void

    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x41s
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
    .end array-data
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, La/a/a/d/e;->a:Ljava/util/concurrent/ConcurrentMap;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, La/a/a/d/e;->d:Z

    const-wide/16 v0, -0x1

    iput-wide v0, p0, La/a/a/d/e;->e:J

    const/4 v2, 0x0

    iput-object v2, p0, La/a/a/d/e;->f:Ljava/lang/Object;

    iput-wide v0, p0, La/a/a/d/e;->g:J

    const-wide/16 v2, 0x0

    iput-wide v2, p0, La/a/a/d/e;->j:J

    iput-wide v0, p0, La/a/a/d/e;->k:J

    iput-wide v2, p0, La/a/a/d/e;->l:J

    return-void
.end method

.method public static synthetic a(La/a/a/d/e;J)J
    .locals 0

    iput-wide p1, p0, La/a/a/d/e;->j:J

    return-wide p1
.end method

.method public static a([B)Ljava/lang/String;
    .locals 6

    array-length v0, p0

    mul-int/lit8 v0, v0, 0x2

    new-array v0, v0, [C

    const/4 v1, 0x0

    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_0

    aget-byte v2, p0, v1

    and-int/lit16 v2, v2, 0xff

    mul-int/lit8 v3, v1, 0x2

    sget-object v4, La/a/a/d/e;->m:[C

    ushr-int/lit8 v5, v2, 0x4

    aget-char v5, v4, v5

    aput-char v5, v0, v3

    add-int/lit8 v3, v3, 0x1

    and-int/lit8 v2, v2, 0xf

    aget-char v2, v4, v2

    aput-char v2, v0, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v0}, Ljava/lang/String;-><init>([C)V

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object p0
.end method

.method public static synthetic a(La/a/a/d/e;)Ljava/util/concurrent/ConcurrentMap;
    .locals 0

    iget-object p0, p0, La/a/a/d/e;->a:Ljava/util/concurrent/ConcurrentMap;

    return-object p0
.end method

.method public static synthetic b(La/a/a/d/e;)J
    .locals 2

    iget-wide v0, p0, La/a/a/d/e;->j:J

    return-wide v0
.end method

.method public static synthetic c(La/a/a/d/e;)V
    .locals 0

    invoke-virtual {p0}, La/a/a/d/e;->b()V

    return-void
.end method

.method public static declared-synchronized k()La/a/a/d/e;
    .locals 2

    const-class v0, La/a/a/d/e;

    monitor-enter v0

    :try_start_0
    sget-object v1, La/a/a/d/e;->n:La/a/a/d/e;

    if-nez v1, :cond_0

    new-instance v1, La/a/a/d/e;

    invoke-direct {v1}, La/a/a/d/e;-><init>()V

    sput-object v1, La/a/a/d/e;->n:La/a/a/d/e;

    :cond_0
    sget-object v1, La/a/a/d/e;->n:La/a/a/d/e;
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
.method public final a(La/a/a/d/e$e;Ljava/lang/String;IILjava/lang/String;)La/a/a/d/e$e;
    .locals 2

    invoke-static {}, La/a/a/d/d;->b()La/a/a/d/d;

    move-result-object p0

    invoke-virtual {p0}, La/a/a/d/d;->a()La/a/a/d/b;

    move-result-object p0

    invoke-static {}, La/a/a/b/d;->i()La/a/a/b/d;

    move-result-object v0

    iget v0, v0, La/a/a/b/d;->M:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, La/a/a/d/b;->c()[Ljava/lang/String;

    const/4 p0, 0x0

    throw p0

    :cond_1
    :goto_0
    invoke-virtual {p1, p2}, La/a/a/d/e$e;->b(Ljava/lang/String;)V

    invoke-virtual {p1, p3}, La/a/a/d/e$e;->a(I)V

    invoke-virtual {p1, p4}, La/a/a/d/e$e;->b(I)V

    invoke-virtual {p1, p5}, La/a/a/d/e$e;->a(Ljava/lang/String;)V

    return-object p1
.end method

.method public final a(Landroid/bluetooth/le/ScanResult;)La/a/a/d/e$e;
    .locals 11
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->getRssi()I

    move-result v0

    if-lez v0, :cond_0

    goto/16 :goto_3

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    const-string v2, ":"

    const-string v3, ""

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    invoke-virtual {v2}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v7

    new-instance v2, La/a/a/d/e$e;

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->getRssi()I

    move-result v8

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->getTimestampNanos()J

    move-result-wide v9

    move-object v4, v2

    move-object v5, p0

    move-object v6, v1

    invoke-direct/range {v4 .. v10}, La/a/a/d/e$e;-><init>(La/a/a/d/e;Ljava/lang/String;Ljava/lang/String;IJ)V

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->getScanRecord()Landroid/bluetooth/le/ScanRecord;

    move-result-object v3

    if-eqz v3, :cond_6

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->getScanRecord()Landroid/bluetooth/le/ScanRecord;

    move-result-object p1

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanRecord;->getBytes()[B

    move-result-object p1

    const/4 v3, 0x2

    move v4, v3

    :goto_0
    const/4 v5, 0x5

    if-gt v4, v5, :cond_4

    add-int/lit8 v5, v4, 0x2

    aget-byte v6, p1, v5

    and-int/lit16 v6, v6, 0xff

    if-ne v6, v3, :cond_1

    add-int/lit8 v6, v4, 0x3

    aget-byte v6, p1, v6

    and-int/lit16 v6, v6, 0xff

    const/16 v7, 0x15

    if-ne v6, v7, :cond_1

    const/4 v0, 0x1

    goto :goto_2

    :cond_1
    aget-byte v6, p1, v4

    and-int/lit16 v6, v6, 0xff

    const/16 v7, 0x2d

    if-ne v6, v7, :cond_2

    add-int/lit8 v6, v4, 0x1

    aget-byte v6, p1, v6

    and-int/lit16 v6, v6, 0xff

    const/16 v7, 0x24

    if-ne v6, v7, :cond_2

    aget-byte v6, p1, v5

    and-int/lit16 v6, v6, 0xff

    const/16 v7, 0xbf

    if-ne v6, v7, :cond_2

    add-int/lit8 v6, v4, 0x3

    aget-byte v6, p1, v6

    and-int/lit16 v6, v6, 0xff

    const/16 v7, 0x16

    if-ne v6, v7, :cond_2

    goto :goto_1

    :cond_2
    aget-byte v6, p1, v4

    and-int/lit16 v6, v6, 0xff

    const/16 v7, 0xad

    if-ne v6, v7, :cond_3

    add-int/lit8 v6, v4, 0x1

    aget-byte v6, p1, v6

    and-int/lit16 v6, v6, 0xff

    const/16 v7, 0x77

    if-ne v6, v7, :cond_3

    aget-byte v5, p1, v5

    and-int/lit16 v5, v5, 0xff

    if-nez v5, :cond_3

    add-int/lit8 v5, v4, 0x3

    aget-byte v5, p1, v5

    :cond_3
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    :goto_2
    if-nez v0, :cond_5

    return-object v2

    :cond_5
    add-int/lit8 v0, v4, 0x14

    aget-byte v0, p1, v0

    and-int/lit16 v0, v0, 0xff

    mul-int/lit16 v0, v0, 0x100

    add-int/lit8 v3, v4, 0x15

    aget-byte v3, p1, v3

    and-int/lit16 v3, v3, 0xff

    add-int v7, v0, v3

    add-int/lit8 v0, v4, 0x16

    aget-byte v0, p1, v0

    and-int/lit16 v0, v0, 0xff

    mul-int/lit16 v0, v0, 0x100

    add-int/lit8 v4, v4, 0x17

    aget-byte v3, p1, v4

    and-int/lit16 v3, v3, 0xff

    add-int v8, v0, v3

    array-length v0, p1

    const/16 v3, 0x1a

    if-le v0, v3, :cond_6

    const/16 v0, 0x9

    const/16 v3, 0x19

    invoke-static {p1, v0, v3}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    invoke-static {p1}, La/a/a/d/e;->a([B)Ljava/lang/String;

    move-result-object v6

    move-object v4, p0

    move-object v5, v2

    move-object v9, v1

    invoke-virtual/range {v4 .. v9}, La/a/a/d/e;->a(La/a/a/d/e$e;Ljava/lang/String;IILjava/lang/String;)La/a/a/d/e$e;

    :cond_6
    return-object v2

    :cond_7
    :goto_3
    const/4 p0, 0x0

    return-object p0
.end method

.method public final a()V
    .locals 2

    iget-object v0, p0, La/a/a/d/e;->a:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->clear()V

    const/4 v0, -0x1

    iput v0, p0, La/a/a/d/e;->h:I

    const-string v0, ""

    iput-object v0, p0, La/a/a/d/e;->i:Ljava/lang/String;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, La/a/a/d/e;->g:J

    return-void
.end method

.method public final b()V
    .locals 7

    iget-object v0, p0, La/a/a/d/e;->a:Ljava/util/concurrent/ConcurrentMap;

    if-eqz v0, :cond_8

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    if-gtz v0, :cond_0

    goto/16 :goto_5

    :cond_0
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, La/a/a/d/e;->a:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v1}, Ljava/util/concurrent/ConcurrentMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, La/a/a/d/d;->b()La/a/a/d/d;

    move-result-object v4

    invoke-virtual {v4}, La/a/a/d/d;->a()La/a/a/d/b;

    move-result-object v4

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/bluetooth/le/ScanResult;

    invoke-virtual {p0, v6}, La/a/a/d/e;->a(Landroid/bluetooth/le/ScanResult;)La/a/a/d/e$e;

    move-result-object v6

    if-eqz v6, :cond_1

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_5

    new-instance v0, La/a/a/d/e$f;

    invoke-direct {v0, p0}, La/a/a/d/e$f;-><init>(La/a/a/d/e;)V

    invoke-static {v5, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    const/4 v0, 0x0

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/a/a/d/e$e;

    invoke-virtual {v0}, La/a/a/d/e$e;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x1

    :goto_1
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    if-ge v0, v6, :cond_3

    const-string v6, "|"

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, La/a/a/d/e$e;

    invoke-virtual {v6}, La/a/a/d/e$e;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    if-nez v4, :cond_4

    goto :goto_2

    :cond_4
    invoke-interface {v5}, Ljava/util/List;->size()I

    invoke-virtual {v4}, La/a/a/d/b;->b()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p0, 0x0

    throw p0

    :cond_5
    :goto_2
    :try_start_1
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    :cond_6
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_3
    iput-object v0, p0, La/a/a/d/e;->i:Ljava/lang/String;

    goto :goto_4

    :cond_7
    const-string v0, ""

    goto :goto_3

    :goto_4
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, La/a/a/d/e;->e:J
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :cond_8
    :goto_5
    return-void
.end method

.method public declared-synchronized c()Ljava/lang/String;
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, La/a/a/d/e;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, La/a/a/d/e;->i:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, La/a/a/d/e;->i:Ljava/lang/String;
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

.method public d()I
    .locals 0

    iget p0, p0, La/a/a/d/e;->h:I

    return p0
.end method

.method public final e()Z
    .locals 8

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, La/a/a/d/e;->g:J

    sub-long v4, v0, v2

    const-wide/16 v6, 0x2710

    cmp-long v6, v4, v6

    if-lez v6, :cond_0

    const-wide/32 v6, 0x186a0

    cmp-long v2, v2, v6

    if-lez v2, :cond_0

    iget-boolean v2, p0, La/a/a/d/e;->d:Z

    if-eqz v2, :cond_0

    invoke-virtual {p0}, La/a/a/d/e;->g()V

    :cond_0
    iget-wide v2, p0, La/a/a/d/e;->e:J

    sub-long/2addr v0, v2

    invoke-static {v4, v5}, Ljava/lang/Math;->abs(J)J

    move-result-wide v2

    const-wide/16 v4, 0x1388

    cmp-long p0, v2, v4

    if-gtz p0, :cond_1

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    cmp-long p0, v0, v4

    if-gtz p0, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public final f()Z
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, La/a/a/d/e;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const-string v2, "android.hardware.bluetooth_le"

    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, La/a/a/d/e;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const-string v2, "android.hardware.bluetooth"

    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_1

    :cond_0
    const/4 v1, 0x1

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    move v1, v0

    :goto_0
    iget-object p0, p0, La/a/a/d/e;->c:Landroid/bluetooth/BluetoothAdapter;

    if-eqz p0, :cond_3

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    :try_start_1
    invoke-virtual {p0}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return p0

    :catch_1
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_3
    :goto_1
    return v0
.end method

.method public final g()V
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, La/a/a/d/e;->l:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x2710

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    invoke-static {}, La/a/a/d/d;->b()La/a/a/d/d;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/d/d;->a()La/a/a/d/b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, La/a/a/d/e;->l:J

    invoke-static {}, La/a/a/h/a;->e()Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, La/a/a/d/e$c;

    invoke-direct {v1, p0}, La/a/a/d/e$c;-><init>(La/a/a/d/e;)V

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    new-instance v1, La/a/a/d/e$d;

    invoke-direct {v1, p0}, La/a/a/d/e$d;-><init>(La/a/a/d/e;)V

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method public final h()V
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    iget-object v0, p0, La/a/a/d/e;->c:Landroid/bluetooth/BluetoothAdapter;

    if-nez v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_1

    new-instance v0, La/a/a/d/e$a;

    invoke-direct {v0, p0}, La/a/a/d/e$a;-><init>(La/a/a/d/e;)V

    iput-object v0, p0, La/a/a/d/e;->f:Ljava/lang/Object;

    new-instance v0, Landroid/bluetooth/le/ScanSettings$Builder;

    invoke-direct {v0}, Landroid/bluetooth/le/ScanSettings$Builder;-><init>()V

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/bluetooth/le/ScanSettings$Builder;->setScanMode(I)Landroid/bluetooth/le/ScanSettings$Builder;

    move-result-object v0

    iget-object v1, p0, La/a/a/d/e;->c:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothAdapter;->getBluetoothLeScanner()Landroid/bluetooth/le/BluetoothLeScanner;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0}, Landroid/bluetooth/le/ScanSettings$Builder;->build()Landroid/bluetooth/le/ScanSettings;

    move-result-object v0

    iget-object v3, p0, La/a/a/d/e;->f:Ljava/lang/Object;

    check-cast v3, Landroid/bluetooth/le/ScanCallback;

    invoke-virtual {v1, v2, v0, v3}, Landroid/bluetooth/le/BluetoothLeScanner;->startScan(Ljava/util/List;Landroid/bluetooth/le/ScanSettings;Landroid/bluetooth/le/ScanCallback;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, La/a/a/d/e;->d:Z

    invoke-static {}, La/a/a/d/d;->b()La/a/a/d/d;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/d/d;->a()La/a/a/d/b;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {}, La/a/a/h/a;->e()Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {}, La/a/a/h/a;->e()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, La/a/a/d/e$b;

    invoke-direct {v1, p0}, La/a/a/d/e$b;-><init>(La/a/a/d/e;)V

    sget p0, La/a/a/i/i;->H0:I

    mul-int/lit16 p0, p0, 0x3e8

    int-to-long v2, p0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    return-void
.end method

.method public declared-synchronized i()V
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, La/a/a/d/e;->f()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-boolean v0, p0, La/a/a/d/e;->d:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, La/a/a/d/e;->h()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized j()V
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, La/a/a/d/e;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, La/a/a/d/e;->c:Landroid/bluetooth/BluetoothAdapter;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->getBluetoothLeScanner()Landroid/bluetooth/le/BluetoothLeScanner;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, La/a/a/d/e;->c:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->getBluetoothLeScanner()Landroid/bluetooth/le/BluetoothLeScanner;

    move-result-object v0

    iget-object v1, p0, La/a/a/d/e;->f:Ljava/lang/Object;

    check-cast v1, Landroid/bluetooth/le/ScanCallback;

    invoke-virtual {v0, v1}, Landroid/bluetooth/le/BluetoothLeScanner;->stopScan(Landroid/bluetooth/le/ScanCallback;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, La/a/a/d/e;->d:Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, p0, La/a/a/d/e;->k:J

    iget-object v1, p0, La/a/a/d/e;->b:Landroid/content/Context;

    if-eqz v1, :cond_2

    const-string v2, "BluetoothManager"

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-wide v1, p0, La/a/a/d/e;->k:J

    const-string v3, "lastStopScanBluetoothTime"

    invoke-interface {v0, v3, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_2
    invoke-virtual {p0}, La/a/a/d/e;->a()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
