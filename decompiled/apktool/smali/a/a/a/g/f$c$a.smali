.class public La/a/a/g/f$c$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/a/a/g/f$c;->a(Landroid/content/Intent;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Z

.field public final synthetic c:La/a/a/g/f$c;


# direct methods
.method public constructor <init>(La/a/a/g/f$c;Z)V
    .locals 0

    iput-object p1, p0, La/a/a/g/f$c$a;->c:La/a/a/g/f$c;

    iput-boolean p2, p0, La/a/a/g/f$c$a;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, La/a/a/g/f$c$a;->c:La/a/a/g/f$c;

    iget-object v0, v0, La/a/a/g/f$c;->c:La/a/a/g/f;

    invoke-static {v0}, La/a/a/g/f;->b(La/a/a/g/f;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, La/a/a/g/f$c$a;->c:La/a/a/g/f$c;

    iget-object v0, v0, La/a/a/g/f$c;->c:La/a/a/g/f;

    iget-boolean p0, p0, La/a/a/g/f$c$a;->b:Z

    invoke-static {v0, p0}, La/a/a/g/f;->a(La/a/a/g/f;Z)Z

    :cond_0
    invoke-static {}, La/a/a/b/o;->q()La/a/a/b/o;

    move-result-object p0

    invoke-virtual {p0}, La/a/a/b/o;->m()V

    invoke-static {}, La/a/a/d/i;->m()La/a/a/d/i;

    move-result-object p0

    invoke-virtual {p0}, La/a/a/d/i;->f()Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-static {}, La/a/a/d/i;->m()La/a/a/d/i;

    move-result-object p0

    iget-object p0, p0, La/a/a/d/i;->f:La/a/a/d/i$g;

    const/16 v0, 0x29

    invoke-virtual {p0, v0}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object p0

    invoke-virtual {p0}, Landroid/os/Message;->sendToTarget()V

    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {}, La/a/a/b/u;->e()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x1388

    cmp-long p0, v0, v2

    if-gtz p0, :cond_2

    invoke-static {}, La/a/a/b/z;->f()La/a/a/b/z;

    move-result-object p0

    invoke-virtual {p0}, La/a/a/b/z;->e()V

    :cond_2
    return-void
.end method
