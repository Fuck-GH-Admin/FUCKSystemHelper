.class public La/a/a/b/m$b;
.super Landroid/os/Handler;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/b/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:La/a/a/b/m;


# direct methods
.method public constructor <init>(La/a/a/b/m;)V
    .locals 0

    iput-object p1, p0, La/a/a/b/m$b;->a:La/a/a/b/m;

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

    if-eq v0, v1, :cond_2

    const/16 p1, 0x3e

    if-eq v0, p1, :cond_1

    const/16 p1, 0x3f

    if-eq v0, p1, :cond_1

    goto :goto_0

    :cond_1
    iget-object p0, p0, La/a/a/b/m$b;->a:La/a/a/b/m;

    invoke-virtual {p0}, La/a/a/b/m;->b()V

    goto :goto_0

    :cond_2
    iget-object p0, p0, La/a/a/b/m$b;->a:La/a/a/b/m;

    invoke-virtual {p0, p1}, La/a/a/b/m;->a(Landroid/os/Message;)V

    :goto_0
    return-void
.end method
