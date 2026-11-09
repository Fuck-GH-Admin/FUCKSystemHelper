.class public La/a/a/d/e$a;
.super Landroid/bluetooth/le/ScanCallback;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/a/a/d/e;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:La/a/a/d/e;


# direct methods
.method public constructor <init>(La/a/a/d/e;)V
    .locals 0

    iput-object p1, p0, La/a/a/d/e$a;->a:La/a/a/d/e;

    invoke-direct {p0}, Landroid/bluetooth/le/ScanCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onScanResult(ILandroid/bluetooth/le/ScanResult;)V
    .locals 13

    iget-object p1, p0, La/a/a/d/e$a;->a:La/a/a/d/e;

    invoke-static {p1}, La/a/a/d/e;->a(La/a/a/d/e;)Ljava/util/concurrent/ConcurrentMap;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {p2}, Landroid/bluetooth/le/ScanResult;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {p2}, Landroid/bluetooth/le/ScanResult;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_7

    iget-object p1, p0, La/a/a/d/e$a;->a:La/a/a/d/e;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p1, La/a/a/d/e;->g:J

    iget-object p1, p0, La/a/a/d/e$a;->a:La/a/a/d/e;

    invoke-static {p1}, La/a/a/d/e;->a(La/a/a/d/e;)Ljava/util/concurrent/ConcurrentMap;

    move-result-object p1

    invoke-virtual {p2}, Landroid/bluetooth/le/ScanResult;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0, p2}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object p1, p0, La/a/a/d/e$a;->a:La/a/a/d/e;

    invoke-static {p1}, La/a/a/d/e;->b(La/a/a/d/e;)J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x320

    cmp-long p1, v0, v2

    if-gtz p1, :cond_0

    const-wide/16 v2, -0x64

    cmp-long p1, v0, v2

    if-gez p1, :cond_5

    :cond_0
    iget-object p1, p0, La/a/a/d/e$a;->a:La/a/a/d/e;

    invoke-static {p1}, La/a/a/d/e;->a(La/a/a/d/e;)Ljava/util/concurrent/ConcurrentMap;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/ConcurrentMap;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    iget-object p1, p0, La/a/a/d/e$a;->a:La/a/a/d/e;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {p1, v0, v1}, La/a/a/d/e;->a(La/a/a/d/e;J)J

    invoke-virtual {p2}, Landroid/bluetooth/le/ScanResult;->getTimestampNanos()J

    move-result-wide p1

    const-wide/32 v0, 0xf4240

    div-long/2addr p1, v0

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x11

    const-wide/16 v4, 0x0

    if-lt v2, v3, :cond_1

    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v2

    div-long/2addr v2, v0
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_1
    move-wide v2, v4

    :goto_0
    iget-object v6, p0, La/a/a/d/e$a;->a:La/a/a/d/e;

    invoke-static {v6}, La/a/a/d/e;->a(La/a/a/d/e;)Ljava/util/concurrent/ConcurrentMap;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/concurrent/ConcurrentMap;->entrySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_2
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/bluetooth/le/ScanResult;

    invoke-virtual {v7}, Landroid/bluetooth/le/ScanResult;->getTimestampNanos()J

    move-result-wide v8

    div-long/2addr v8, v0

    sub-long v8, p1, v8

    const/4 v10, 0x0

    const-wide/16 v11, 0x9c4

    cmp-long v8, v8, v11

    if-lez v8, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->remove()V

    const/4 v10, 0x1

    :cond_3
    cmp-long v8, v2, v4

    if-eqz v8, :cond_2

    if-nez v10, :cond_2

    invoke-virtual {v7}, Landroid/bluetooth/le/ScanResult;->getTimestampNanos()J

    move-result-wide v7

    div-long/2addr v7, v0

    sub-long v7, v2, v7

    cmp-long v7, v7, v11

    if-lez v7, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    :cond_4
    iget-object p1, p0, La/a/a/d/e$a;->a:La/a/a/d/e;

    invoke-static {p1}, La/a/a/d/e;->a(La/a/a/d/e;)Ljava/util/concurrent/ConcurrentMap;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/ConcurrentMap;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    iget-object p0, p0, La/a/a/d/e$a;->a:La/a/a/d/e;

    invoke-static {p0}, La/a/a/d/e;->c(La/a/a/d/e;)V

    :cond_5
    invoke-static {}, La/a/a/d/d;->b()La/a/a/d/d;

    move-result-object p0

    invoke-virtual {p0}, La/a/a/d/d;->a()La/a/a/d/b;

    move-result-object p0

    if-nez p0, :cond_6

    goto :goto_2

    :cond_6
    invoke-virtual {p0}, La/a/a/d/b;->d()I

    const/4 p0, 0x0

    throw p0

    :cond_7
    :goto_2
    return-void
.end method
