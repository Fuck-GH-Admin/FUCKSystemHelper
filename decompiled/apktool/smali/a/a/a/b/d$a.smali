.class public La/a/a/b/d$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/a/a/b/d;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:La/a/a/b/d;


# direct methods
.method public constructor <init>(La/a/a/b/d;)V
    .locals 0

    iput-object p1, p0, La/a/a/b/d$a;->b:La/a/a/b/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_1

    invoke-static {}, La/a/a/b/w;->d()La/a/a/b/w;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/b/w;->b()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iget-object p0, p0, La/a/a/b/d$a;->b:La/a/a/b/d;

    if-eqz v0, :cond_0

    sget-object v1, La/a/a/i/d;->c:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, La/a/a/i/g;->a(Ljava/util/concurrent/ExecutorService;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    sget-object v0, La/a/a/i/d;->c:Ljava/lang/String;

    invoke-virtual {p0, v0}, La/a/a/i/g;->a(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method
