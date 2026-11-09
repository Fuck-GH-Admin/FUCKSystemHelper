.class public La/a/a/d/i$g;
.super Landroid/os/Handler;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/d/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "g"
.end annotation


# instance fields
.field public final synthetic a:La/a/a/d/i;


# direct methods
.method public constructor <init>(La/a/a/d/i;)V
    .locals 0

    iput-object p1, p0, La/a/a/d/i$g;->a:La/a/a/d/i;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    sget-boolean v0, Lcom/baidu/location/f;->f:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x15

    if-eq v0, v1, :cond_3

    const/16 v1, 0x29

    if-eq v0, v1, :cond_2

    const/16 v1, 0x321

    if-eq v0, v1, :cond_1

    invoke-super {p0, p1}, Landroid/os/Handler;->dispatchMessage(Landroid/os/Message;)V

    goto :goto_0

    :cond_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/baidu/location/c;

    iget-object p0, p0, La/a/a/d/i$g;->a:La/a/a/d/i;

    invoke-static {p0, p1}, La/a/a/d/i;->a(La/a/a/d/i;Lcom/baidu/location/c;)V

    goto :goto_0

    :cond_2
    iget-object p0, p0, La/a/a/d/i$g;->a:La/a/a/d/i;

    invoke-static {p0}, La/a/a/d/i;->q(La/a/a/d/i;)V

    goto :goto_0

    :cond_3
    iget-object p0, p0, La/a/a/d/i$g;->a:La/a/a/d/i;

    invoke-static {p0, p1}, La/a/a/d/i;->a(La/a/a/d/i;Landroid/os/Message;)V

    :goto_0
    return-void
.end method
