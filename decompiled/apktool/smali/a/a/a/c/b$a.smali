.class public La/a/a/c/b$a;
.super Landroid/os/Handler;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/a/a/c/b;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:La/a/a/c/b;


# direct methods
.method public constructor <init>(La/a/a/c/b;)V
    .locals 0

    iput-object p1, p0, La/a/a/c/b$a;->a:La/a/a/c/b;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    iget p1, p1, Landroid/os/Message;->what:I

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    iget-object p0, p0, La/a/a/c/b$a;->a:La/a/a/c/b;

    invoke-static {p0}, La/a/a/c/b;->b(La/a/a/c/b;)V

    goto :goto_0

    :cond_1
    iget-object p0, p0, La/a/a/c/b$a;->a:La/a/a/c/b;

    invoke-static {p0}, La/a/a/c/b;->a(La/a/a/c/b;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_0
    return-void
.end method
