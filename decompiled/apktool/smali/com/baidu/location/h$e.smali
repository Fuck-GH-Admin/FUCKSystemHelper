.class public Lcom/baidu/location/h$e;
.super Ljava/lang/Thread;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/baidu/location/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "e"
.end annotation


# instance fields
.field public final synthetic b:Lcom/baidu/location/h;


# direct methods
.method public constructor <init>(Lcom/baidu/location/h;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/location/h$e;->b:Lcom/baidu/location/h;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/baidu/location/h;Lcom/baidu/location/h$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/baidu/location/h$e;-><init>(Lcom/baidu/location/h;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    :try_start_0
    iget-object v0, p0, Lcom/baidu/location/h$e;->b:Lcom/baidu/location/h;

    invoke-static {v0}, Lcom/baidu/location/h;->u(Lcom/baidu/location/h;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/baidu/location/h$e;->b:Lcom/baidu/location/h;

    invoke-static {v0}, Lcom/baidu/location/h;->v(Lcom/baidu/location/h;)La/a/a/b/h;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/g/f;->m()V

    iget-object v0, p0, Lcom/baidu/location/h$e;->b:Lcom/baidu/location/h;

    new-instance v7, La/a/a/b/h;

    iget-object v1, p0, Lcom/baidu/location/h$e;->b:Lcom/baidu/location/h;

    invoke-static {v1}, Lcom/baidu/location/h;->b(Lcom/baidu/location/h;)Landroid/content/Context;

    move-result-object v2

    iget-object v1, p0, Lcom/baidu/location/h$e;->b:Lcom/baidu/location/h;

    invoke-static {v1}, Lcom/baidu/location/h;->c(Lcom/baidu/location/h;)Lcom/baidu/location/i;

    move-result-object v3

    iget-object v4, p0, Lcom/baidu/location/h$e;->b:Lcom/baidu/location/h;

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, La/a/a/b/h;-><init>(Landroid/content/Context;Lcom/baidu/location/i;La/a/a/b/h$b;Ljava/lang/String;Z)V

    invoke-static {v0, v7}, Lcom/baidu/location/h;->a(Lcom/baidu/location/h;La/a/a/b/h;)La/a/a/b/h;

    :cond_0
    iget-object v0, p0, Lcom/baidu/location/h$e;->b:Lcom/baidu/location/h;

    invoke-static {v0}, Lcom/baidu/location/h;->v(Lcom/baidu/location/h;)La/a/a/b/h;

    move-result-object v1

    invoke-virtual {v1}, La/a/a/b/h;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/baidu/location/h;->a(Lcom/baidu/location/h;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/baidu/location/h$e;->b:Lcom/baidu/location/h;

    invoke-static {v0}, Lcom/baidu/location/h;->c(Lcom/baidu/location/h;)Lcom/baidu/location/i;

    move-result-object v0

    iget-object v0, v0, Lcom/baidu/location/i;->D:Lcom/baidu/location/i$a;

    sget-object v1, Lcom/baidu/location/i$a;->c:Lcom/baidu/location/i$a;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/baidu/location/h$e;->b:Lcom/baidu/location/h;

    invoke-static {v0}, Lcom/baidu/location/h;->v(Lcom/baidu/location/h;)La/a/a/b/h;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/b/h;->i()V

    iget-object v0, p0, Lcom/baidu/location/h$e;->b:Lcom/baidu/location/h;

    invoke-static {v0}, Lcom/baidu/location/h;->v(Lcom/baidu/location/h;)La/a/a/b/h;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/b/h;->j()V

    :cond_1
    iget-object p0, p0, Lcom/baidu/location/h$e;->b:Lcom/baidu/location/h;

    invoke-static {p0}, Lcom/baidu/location/h;->l(Lcom/baidu/location/h;)Lcom/baidu/location/h$c;

    move-result-object p0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object p0

    invoke-virtual {p0}, Landroid/os/Message;->sendToTarget()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method
