.class public La/a/a/d/l$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/d/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:La/a/a/d/l;


# direct methods
.method public constructor <init>(La/a/a/d/l;)V
    .locals 0

    iput-object p1, p0, La/a/a/d/l$a;->b:La/a/a/d/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, La/a/a/d/l$a;->b:La/a/a/d/l;

    invoke-static {v0}, La/a/a/d/l;->f(La/a/a/d/l;)Lcom/baidu/location/c;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, La/a/a/d/l$a;->b:La/a/a/d/l;

    invoke-static {v0}, La/a/a/d/l;->a(La/a/a/d/l;)La/a/a/d/l$b;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/baidu/location/c;

    iget-object v1, p0, La/a/a/d/l$a;->b:La/a/a/d/l;

    invoke-static {v1}, La/a/a/d/l;->c(La/a/a/d/l;)Lcom/baidu/location/c;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/baidu/location/c;-><init>(Lcom/baidu/location/c;)V

    iget-object v1, p0, La/a/a/d/l$a;->b:La/a/a/d/l;

    invoke-static {v1}, La/a/a/d/l;->f(La/a/a/d/l;)Lcom/baidu/location/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/baidu/location/c;->q()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/baidu/location/c;->c(D)V

    iget-object v1, p0, La/a/a/d/l$a;->b:La/a/a/d/l;

    invoke-static {v1}, La/a/a/d/l;->f(La/a/a/d/l;)Lcom/baidu/location/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/baidu/location/c;->t()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/baidu/location/c;->d(D)V

    iget-object v1, p0, La/a/a/d/l$a;->b:La/a/a/d/l;

    invoke-static {v1}, La/a/a/d/l;->a(La/a/a/d/l;)La/a/a/d/l$b;

    move-result-object v1

    invoke-interface {v1, v0}, La/a/a/d/l$b;->a(Lcom/baidu/location/c;)V

    :cond_0
    iget-object v0, p0, La/a/a/d/l$a;->b:La/a/a/d/l;

    invoke-static {v0}, La/a/a/d/l;->e(La/a/a/d/l;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, La/a/a/d/l$a;->b:La/a/a/d/l;

    invoke-static {v1}, La/a/a/d/l;->d(La/a/a/d/l;)Ljava/lang/Runnable;

    move-result-object v1

    iget-object p0, p0, La/a/a/d/l$a;->b:La/a/a/d/l;

    invoke-static {p0}, La/a/a/d/l;->b(La/a/a/d/l;)J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
