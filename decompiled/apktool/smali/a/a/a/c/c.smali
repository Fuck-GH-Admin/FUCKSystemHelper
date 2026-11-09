.class public La/a/a/c/c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/a/a/c/c$b;,
        La/a/a/c/c$a;
    }
.end annotation


# static fields
.field public static f:La/a/a/c/c;


# instance fields
.field public a:Z

.field public b:Ljava/lang/String;

.field public c:La/a/a/c/c$b;

.field public d:I

.field public e:La/a/a/c/c$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, La/a/a/c/c;->a:Z

    const/4 v0, 0x0

    iput-object v0, p0, La/a/a/c/c;->b:Ljava/lang/String;

    iput-object v0, p0, La/a/a/c/c;->c:La/a/a/c/c$b;

    const/4 v0, -0x1

    iput v0, p0, La/a/a/c/c;->d:I

    return-void
.end method

.method public static synthetic a(La/a/a/c/c;I)I
    .locals 0

    iput p1, p0, La/a/a/c/c;->d:I

    return p1
.end method

.method public static synthetic a(La/a/a/c/c;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, La/a/a/c/c;->b:Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic a(La/a/a/c/c;)Z
    .locals 0

    iget-boolean p0, p0, La/a/a/c/c;->a:Z

    return p0
.end method

.method public static synthetic a(La/a/a/c/c;Z)Z
    .locals 0

    iput-boolean p1, p0, La/a/a/c/c;->a:Z

    return p1
.end method

.method public static synthetic b(La/a/a/c/c;)La/a/a/c/c$a;
    .locals 0

    iget-object p0, p0, La/a/a/c/c;->e:La/a/a/c/c$a;

    return-object p0
.end method

.method public static declared-synchronized f()La/a/a/c/c;
    .locals 2

    const-class v0, La/a/a/c/c;

    monitor-enter v0

    :try_start_0
    sget-object v1, La/a/a/c/c;->f:La/a/a/c/c;

    if-nez v1, :cond_0

    new-instance v1, La/a/a/c/c;

    invoke-direct {v1}, La/a/a/c/c;-><init>()V

    sput-object v1, La/a/a/c/c;->f:La/a/a/c/c;

    :cond_0
    sget-object v1, La/a/a/c/c;->f:La/a/a/c/c;
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
.method public a()I
    .locals 0

    iget p0, p0, La/a/a/c/c;->d:I

    return p0
.end method

.method public b()Ljava/lang/String;
    .locals 0

    iget-object p0, p0, La/a/a/c/c;->b:Ljava/lang/String;

    return-object p0
.end method

.method public c()Z
    .locals 0

    iget-boolean p0, p0, La/a/a/c/c;->a:Z

    return p0
.end method

.method public d()V
    .locals 3

    new-instance v0, La/a/a/c/c$b;

    invoke-direct {v0, p0}, La/a/a/c/c$b;-><init>(La/a/a/c/c;)V

    iput-object v0, p0, La/a/a/c/c;->c:La/a/a/c/c$b;

    :try_start_0
    invoke-static {}, Lcom/baidu/location/f;->c()Landroid/content/Context;

    move-result-object v0

    iget-object p0, p0, La/a/a/c/c;->c:La/a/a/c/c$b;

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "android.intent.action.BATTERY_CHANGED"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, La/a/a/c/c;->c:La/a/a/c/c$b;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {}, Lcom/baidu/location/f;->c()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, La/a/a/c/c;->c:La/a/a/c/c$b;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, La/a/a/c/c;->c:La/a/a/c/c$b;

    iput-object v0, p0, La/a/a/c/c;->e:La/a/a/c/c$a;

    return-void
.end method
