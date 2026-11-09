.class public La/a/a/d/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/a/a/d/a;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:La/a/a/d/a;


# direct methods
.method public constructor <init>(La/a/a/d/a;)V
    .locals 0

    iput-object p1, p0, La/a/a/d/a$a;->b:La/a/a/d/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, La/a/a/d/a$a;->b:La/a/a/d/a;

    invoke-static {v0}, La/a/a/d/a;->a(La/a/a/d/a;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, La/a/a/d/a$a;->b:La/a/a/d/a;

    invoke-static {v0}, La/a/a/d/a;->a(La/a/a/d/a;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, La/a/a/d/a;->a(La/a/a/d/a;Ljava/lang/String;)Ljava/lang/String;

    invoke-static {}, La/a/a/b/w;->d()La/a/a/b/w;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/b/w;->b()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iget-object p0, p0, La/a/a/d/a$a;->b:La/a/a/d/a;

    if-eqz v0, :cond_0

    invoke-static {p0}, La/a/a/d/a;->b(La/a/a/d/a;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, La/a/a/i/g;->a(Ljava/util/concurrent/ExecutorService;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-static {p0}, La/a/a/d/a;->b(La/a/a/d/a;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, La/a/a/i/g;->a(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method
