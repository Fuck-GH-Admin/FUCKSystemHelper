.class public La/a/a/d/k;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/a/a/d/k$b;,
        La/a/a/d/k$c;
    }
.end annotation


# instance fields
.field public a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "La/a/a/d/k$c;",
            ">;"
        }
    .end annotation
.end field

.field public b:Landroid/hardware/SensorManager;

.field public c:I

.field public d:Landroid/hardware/Sensor;

.field public e:Landroid/hardware/Sensor;

.field public f:Z

.field public g:[F

.field public h:[F

.field public i:F

.field public j:I

.field public k:Ljava/lang/String;

.field public l:J

.field public m:Landroid/hardware/SensorEventListener;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, La/a/a/d/k;->a:Ljava/util/Set;

    const/4 v0, 0x1

    iput-boolean v0, p0, La/a/a/d/k;->f:Z

    const/4 v1, 0x3

    new-array v1, v1, [F

    iput-object v1, p0, La/a/a/d/k;->g:[F

    const/16 v1, 0x9

    new-array v1, v1, [F

    iput-object v1, p0, La/a/a/d/k;->h:[F

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, p0, La/a/a/d/k;->i:F

    const/4 v1, 0x0

    iput v1, p0, La/a/a/d/k;->j:I

    const/4 v1, 0x0

    iput-object v1, p0, La/a/a/d/k;->k:Ljava/lang/String;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, La/a/a/d/k$a;

    invoke-direct {v1, p0}, La/a/a/d/k$a;-><init>(La/a/a/d/k;)V

    iput-object v1, p0, La/a/a/d/k;->m:Landroid/hardware/SensorEventListener;

    invoke-static {}, Lcom/baidu/location/f;->c()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p0, v1, v0}, La/a/a/d/k;->a(Landroid/content/Context;I)V

    return-void
.end method

.method public static synthetic a(La/a/a/d/k;F)F
    .locals 0

    iput p1, p0, La/a/a/d/k;->i:F

    return p1
.end method

.method public static synthetic a(La/a/a/d/k;J)J
    .locals 0

    iput-wide p1, p0, La/a/a/d/k;->l:J

    return-wide p1
.end method

.method public static synthetic a(La/a/a/d/k;)Z
    .locals 0

    iget-boolean p0, p0, La/a/a/d/k;->f:Z

    return p0
.end method

.method public static synthetic b(La/a/a/d/k;)I
    .locals 2

    iget v0, p0, La/a/a/d/k;->j:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, La/a/a/d/k;->j:I

    return v0
.end method

.method public static synthetic c(La/a/a/d/k;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, La/a/a/d/k;->a:Ljava/util/Set;

    return-object p0
.end method

.method public static synthetic d(La/a/a/d/k;)F
    .locals 0

    iget p0, p0, La/a/a/d/k;->i:F

    return p0
.end method

.method public static e()La/a/a/d/k;
    .locals 1

    invoke-static {}, La/a/a/d/k$b;->a()La/a/a/d/k;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e(La/a/a/d/k;)[F
    .locals 0

    iget-object p0, p0, La/a/a/d/k;->h:[F

    return-object p0
.end method

.method public static synthetic f(La/a/a/d/k;)[F
    .locals 0

    iget-object p0, p0, La/a/a/d/k;->g:[F

    return-object p0
.end method


# virtual methods
.method public a()D
    .locals 2

    iget p0, p0, La/a/a/d/k;->i:F

    float-to-double v0, p0

    return-wide v0
.end method

.method public a(La/a/a/d/k$c;)V
    .locals 5

    iget-object v0, p0, La/a/a/d/k;->a:Ljava/util/Set;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, La/a/a/d/k;->a:Ljava/util/Set;

    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, La/a/a/d/k;->a:Ljava/util/Set;

    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object p1, p0, La/a/a/d/k;->a:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result p1

    const/4 v1, 0x1

    if-ne p1, v1, :cond_2

    iget-object p1, p0, La/a/a/d/k;->d:Landroid/hardware/Sensor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    :try_start_1
    iget-object v2, p0, La/a/a/d/k;->b:Landroid/hardware/SensorManager;

    iget-object v3, p0, La/a/a/d/k;->m:Landroid/hardware/SensorEventListener;

    iget v4, p0, La/a/a/d/k;->c:I

    invoke-virtual {v2, v3, p1, v4}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    :try_start_2
    iput-boolean v1, p0, La/a/a/d/k;->f:Z

    :goto_0
    invoke-static {}, La/a/a/d/m/a;->a()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, La/a/a/d/m/a;->c()V

    :cond_1
    iget-object p1, p0, La/a/a/d/k;->e:Landroid/hardware/Sensor;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz p1, :cond_2

    :try_start_3
    iget-object v2, p0, La/a/a/d/k;->b:Landroid/hardware/SensorManager;

    iget-object v3, p0, La/a/a/d/k;->m:Landroid/hardware/SensorEventListener;

    iget v4, p0, La/a/a/d/k;->c:I

    invoke-virtual {v2, v3, p1, v4}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    :catch_1
    :try_start_4
    iput-boolean v1, p0, La/a/a/d/k;->f:Z

    :cond_2
    :goto_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p0
.end method

.method public final a(Landroid/content/Context;I)V
    .locals 1

    :try_start_0
    const-string v0, "sensor"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/hardware/SensorManager;

    iput-object p1, p0, La/a/a/d/k;->b:Landroid/hardware/SensorManager;

    iput p2, p0, La/a/a/d/k;->c:I

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object p1

    iput-object p1, p0, La/a/a/d/k;->d:Landroid/hardware/Sensor;

    iget-object p1, p0, La/a/a/d/k;->b:Landroid/hardware/SensorManager;

    const/16 p2, 0xb

    invoke-virtual {p1, p2}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object p1

    iput-object p1, p0, La/a/a/d/k;->e:Landroid/hardware/Sensor;

    invoke-virtual {p0}, La/a/a/d/k;->b()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public final b()V
    .locals 7

    :try_start_0
    iget-object v0, p0, La/a/a/d/k;->b:Landroid/hardware/SensorManager;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/hardware/SensorManager;->getSensorList(I)Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v1, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v3, 0xa

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v2, 0x9

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v1, v2, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v2, 0xb

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v2, 0x6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x12

    if-lt v2, v3, :cond_0

    const/16 v2, 0xe

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v2, 0x10

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x8

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    move-result v2

    new-array v3, v2, [C

    :goto_0
    if-ge v4, v2, :cond_1

    const/16 v5, 0x30

    aput-char v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/hardware/Sensor;

    invoke-virtual {v4}, Landroid/hardware/Sensor;->getType()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-lt v4, v2, :cond_3

    goto :goto_1

    :cond_3
    const/16 v5, 0x31

    aput-char v5, v3, v4

    goto :goto_1

    :cond_4
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>([C)V

    iput-object v0, p0, La/a/a/d/k;->k:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_2
    return-void
.end method

.method public b(La/a/a/d/k$c;)V
    .locals 2

    iget-object v0, p0, La/a/a/d/k;->a:Ljava/util/Set;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, La/a/a/d/k;->a:Ljava/util/Set;

    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, La/a/a/d/k;->a:Ljava/util/Set;

    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    :cond_0
    iget-object p1, p0, La/a/a/d/k;->a:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_1

    :try_start_1
    iget-object p1, p0, La/a/a/d/k;->b:Landroid/hardware/SensorManager;

    iget-object p0, p0, La/a/a/d/k;->m:Landroid/hardware/SensorEventListener;

    invoke-virtual {p1, p0}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception p0

    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    invoke-static {}, La/a/a/d/m/a;->a()Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-static {}, La/a/a/d/m/a;->d()V

    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0
.end method

.method public c()Ljava/lang/String;
    .locals 0

    iget-object p0, p0, La/a/a/d/k;->k:Ljava/lang/String;

    return-object p0
.end method

.method public declared-synchronized d()I
    .locals 1

    monitor-enter p0

    :try_start_0
    iget v0, p0, La/a/a/d/k;->j:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
