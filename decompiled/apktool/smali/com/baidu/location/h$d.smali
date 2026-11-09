.class public Lcom/baidu/location/h$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/baidu/location/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public final synthetic b:Lcom/baidu/location/h;


# direct methods
.method public constructor <init>(Lcom/baidu/location/h;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/location/h$d;->b:Lcom/baidu/location/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/baidu/location/h;Lcom/baidu/location/h$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/baidu/location/h$d;-><init>(Lcom/baidu/location/h;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lcom/baidu/location/h$d;->b:Lcom/baidu/location/h;

    invoke-static {v0}, Lcom/baidu/location/h;->d(Lcom/baidu/location/h;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/baidu/location/h$d;->b:Lcom/baidu/location/h;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/baidu/location/h;->b(Lcom/baidu/location/h;Z)Z

    iget-object v1, p0, Lcom/baidu/location/h$d;->b:Lcom/baidu/location/h;

    invoke-static {v1}, Lcom/baidu/location/h;->a(Lcom/baidu/location/h;)Landroid/os/Messenger;

    move-result-object v1

    if-eqz v1, :cond_6

    iget-object v1, p0, Lcom/baidu/location/h$d;->b:Lcom/baidu/location/h;

    invoke-static {v1}, Lcom/baidu/location/h;->r(Lcom/baidu/location/h;)Landroid/os/Messenger;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lcom/baidu/location/h$d;->b:Lcom/baidu/location/h;

    invoke-static {v1}, Lcom/baidu/location/h;->e(Lcom/baidu/location/h;)Ljava/util/ArrayList;

    move-result-object v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/baidu/location/h$d;->b:Lcom/baidu/location/h;

    invoke-static {v1}, Lcom/baidu/location/h;->e(Lcom/baidu/location/h;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v1, v2, :cond_2

    :cond_1
    iget-object v1, p0, Lcom/baidu/location/h$d;->b:Lcom/baidu/location/h;

    invoke-static {v1}, Lcom/baidu/location/h;->f(Lcom/baidu/location/h;)Ljava/util/ArrayList;

    move-result-object v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/baidu/location/h$d;->b:Lcom/baidu/location/h;

    invoke-static {v1}, Lcom/baidu/location/h;->f(Lcom/baidu/location/h;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v1, v2, :cond_2

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/baidu/location/h$d;->b:Lcom/baidu/location/h;

    invoke-static {v1}, Lcom/baidu/location/h;->g(Lcom/baidu/location/h;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/baidu/location/h$d;->b:Lcom/baidu/location/h;

    invoke-static {v1}, Lcom/baidu/location/h;->h(Lcom/baidu/location/h;)Lcom/baidu/location/h$d;

    move-result-object v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/baidu/location/h$d;->b:Lcom/baidu/location/h;

    new-instance v2, Lcom/baidu/location/h$d;

    invoke-direct {v2, v1}, Lcom/baidu/location/h$d;-><init>(Lcom/baidu/location/h;)V

    invoke-static {v1, v2}, Lcom/baidu/location/h;->a(Lcom/baidu/location/h;Lcom/baidu/location/h$d;)Lcom/baidu/location/h$d;

    :cond_3
    iget-object v1, p0, Lcom/baidu/location/h$d;->b:Lcom/baidu/location/h;

    invoke-static {v1}, Lcom/baidu/location/h;->l(Lcom/baidu/location/h;)Lcom/baidu/location/h$c;

    move-result-object v1

    iget-object v2, p0, Lcom/baidu/location/h$d;->b:Lcom/baidu/location/h;

    invoke-static {v2}, Lcom/baidu/location/h;->h(Lcom/baidu/location/h;)Lcom/baidu/location/h$d;

    move-result-object v2

    iget-object p0, p0, Lcom/baidu/location/h$d;->b:Lcom/baidu/location/h;

    invoke-static {p0}, Lcom/baidu/location/h;->t(Lcom/baidu/location/h;)Lcom/baidu/location/i;

    move-result-object p0

    iget p0, p0, Lcom/baidu/location/i;->d:I

    int-to-long v3, p0

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    monitor-exit v0

    return-void

    :cond_4
    iget-object p0, p0, Lcom/baidu/location/h$d;->b:Lcom/baidu/location/h;

    invoke-static {p0}, Lcom/baidu/location/h;->l(Lcom/baidu/location/h;)Lcom/baidu/location/h$c;

    move-result-object p0

    const/4 v1, 0x4

    invoke-virtual {p0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object p0

    invoke-virtual {p0}, Landroid/os/Message;->sendToTarget()V

    monitor-exit v0

    return-void

    :cond_5
    :goto_0
    monitor-exit v0

    return-void

    :cond_6
    :goto_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method
