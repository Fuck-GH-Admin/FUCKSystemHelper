.class public La/a/a/b/o$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/b/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public final synthetic b:La/a/a/b/o;


# direct methods
.method public constructor <init>(La/a/a/b/o;)V
    .locals 0

    iput-object p1, p0, La/a/a/b/o$c;->b:La/a/a/b/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/a/a/b/o;La/a/a/b/o$a;)V
    .locals 0

    invoke-direct {p0, p1}, La/a/a/b/o$c;-><init>(La/a/a/b/o;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, La/a/a/b/o$c;->b:La/a/a/b/o;

    invoke-static {v0}, La/a/a/b/o;->a(La/a/a/b/o;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, La/a/a/b/o$c;->b:La/a/a/b/o;

    invoke-static {v0, v1}, La/a/a/b/o;->a(La/a/a/b/o;Z)Z

    :cond_0
    iget-object v0, p0, La/a/a/b/o$c;->b:La/a/a/b/o;

    invoke-static {v0}, La/a/a/b/o;->b(La/a/a/b/o;)Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    iget-object v0, p0, La/a/a/b/o$c;->b:La/a/a/b/o;

    invoke-static {v0, v1}, La/a/a/b/o;->b(La/a/a/b/o;Z)Z

    iget-object p0, p0, La/a/a/b/o$c;->b:La/a/a/b/o;

    const/4 v0, 0x0

    invoke-static {p0, v0}, La/a/a/b/o;->b(La/a/a/b/o;Landroid/os/Message;)V

    :cond_1
    return-void
.end method
