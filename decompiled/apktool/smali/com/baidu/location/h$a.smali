.class public Lcom/baidu/location/h$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/baidu/location/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/baidu/location/h;


# direct methods
.method public constructor <init>(Lcom/baidu/location/h;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/location/h$a;->a:Lcom/baidu/location/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 1

    iget-object p1, p0, Lcom/baidu/location/h$a;->a:Lcom/baidu/location/h;

    new-instance v0, Landroid/os/Messenger;

    invoke-direct {v0, p2}, Landroid/os/Messenger;-><init>(Landroid/os/IBinder;)V

    invoke-static {p1, v0}, Lcom/baidu/location/h;->a(Lcom/baidu/location/h;Landroid/os/Messenger;)Landroid/os/Messenger;

    iget-object p1, p0, Lcom/baidu/location/h$a;->a:Lcom/baidu/location/h;

    invoke-static {p1}, Lcom/baidu/location/h;->a(Lcom/baidu/location/h;)Landroid/os/Messenger;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lcom/baidu/location/h$a;->a:Lcom/baidu/location/h;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lcom/baidu/location/h;->a(Lcom/baidu/location/h;Z)Z

    iget-object p1, p0, Lcom/baidu/location/h$a;->a:Lcom/baidu/location/h;

    invoke-static {p1}, Lcom/baidu/location/h;->i(Lcom/baidu/location/h;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p0, p0, Lcom/baidu/location/h$a;->a:Lcom/baidu/location/h;

    invoke-static {p0}, Lcom/baidu/location/h;->l(Lcom/baidu/location/h;)Lcom/baidu/location/h$c;

    move-result-object p0

    const/4 p1, 0x2

    invoke-virtual {p0, p1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object p0

    invoke-virtual {p0}, Landroid/os/Message;->sendToTarget()V

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    const/16 v0, 0xb

    :try_start_0
    invoke-static {p1, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object p1

    iget-object v0, p0, Lcom/baidu/location/h$a;->a:Lcom/baidu/location/h;

    invoke-static {v0}, Lcom/baidu/location/h;->r(Lcom/baidu/location/h;)Landroid/os/Messenger;

    move-result-object v0

    iput-object v0, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    iget-object v0, p0, Lcom/baidu/location/h$a;->a:Lcom/baidu/location/h;

    invoke-static {v0}, Lcom/baidu/location/h;->s(Lcom/baidu/location/h;)Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    iget-object v0, p0, Lcom/baidu/location/h$a;->a:Lcom/baidu/location/h;

    invoke-static {v0}, Lcom/baidu/location/h;->a(Lcom/baidu/location/h;)Landroid/os/Messenger;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Messenger;->send(Landroid/os/Message;)V

    iget-object p1, p0, Lcom/baidu/location/h$a;->a:Lcom/baidu/location/h;

    invoke-static {p1, p2}, Lcom/baidu/location/h;->a(Lcom/baidu/location/h;Z)Z

    iget-object p1, p0, Lcom/baidu/location/h$a;->a:Lcom/baidu/location/h;

    invoke-static {p1}, Lcom/baidu/location/h;->t(Lcom/baidu/location/h;)Lcom/baidu/location/i;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/baidu/location/h$a;->a:Lcom/baidu/location/h;

    invoke-static {p1}, Lcom/baidu/location/h;->u(Lcom/baidu/location/h;)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    iget-object p0, p0, Lcom/baidu/location/h$a;->a:Lcom/baidu/location/h;

    invoke-static {p0}, Lcom/baidu/location/h;->l(Lcom/baidu/location/h;)Lcom/baidu/location/h$c;

    move-result-object p0

    const/4 p1, 0x4

    invoke-virtual {p0, p1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object p0

    invoke-virtual {p0}, Landroid/os/Message;->sendToTarget()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_2
    :goto_0
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    iget-object p1, p0, Lcom/baidu/location/h$a;->a:Lcom/baidu/location/h;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/baidu/location/h;->a(Lcom/baidu/location/h;Landroid/os/Messenger;)Landroid/os/Messenger;

    iget-object p0, p0, Lcom/baidu/location/h$a;->a:Lcom/baidu/location/h;

    const/4 p1, 0x0

    invoke-static {p0, p1}, Lcom/baidu/location/h;->a(Lcom/baidu/location/h;Z)Z

    return-void
.end method
