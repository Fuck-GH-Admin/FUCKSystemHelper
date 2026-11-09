.class public La/a/a/c/f$a;
.super Landroid/os/Handler;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/a/a/c/f;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:La/a/a/c/f;


# direct methods
.method public constructor <init>(La/a/a/c/f;)V
    .locals 0

    iput-object p1, p0, La/a/a/c/f$a;->a:La/a/a/c/f;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    iget p1, p1, Landroid/os/Message;->what:I

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p0, p0, La/a/a/c/f$a;->a:La/a/a/c/f;

    invoke-static {p0}, La/a/a/c/f;->a(La/a/a/c/f;)V

    :goto_0
    return-void
.end method
