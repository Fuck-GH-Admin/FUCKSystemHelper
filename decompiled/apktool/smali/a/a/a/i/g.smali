.class public abstract La/a/a/i/g;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/a/a/i/g$g;
    }
.end annotation


# static fields
.field public static h:I


# instance fields
.field public a:Ljava/lang/String;

.field public b:I

.field public c:Ljava/lang/String;

.field public d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public e:[B

.field public f:Ljava/lang/String;

.field public g:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget v0, La/a/a/i/a;->c:I

    const/4 v0, 0x0

    sput v0, La/a/a/i/g;->h:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, La/a/a/i/g;->a:Ljava/lang/String;

    const/4 v1, 0x1

    iput v1, p0, La/a/a/i/g;->b:I

    iput-object v0, p0, La/a/a/i/g;->c:Ljava/lang/String;

    iput-object v0, p0, La/a/a/i/g;->d:Ljava/util/Map;

    iput-object v0, p0, La/a/a/i/g;->e:[B

    iput-object v0, p0, La/a/a/i/g;->f:Ljava/lang/String;

    return-void
.end method

.method public static synthetic a(La/a/a/i/g;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, La/a/a/i/g;->b(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public abstract a()V
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    invoke-static {}, La/a/a/b/d;->i()La/a/a/b/d;

    move-result-object v0

    iget v0, v0, La/a/a/b/d;->N:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_0

    new-instance v0, Ljava/lang/Thread;

    new-instance v1, La/a/a/i/g$d;

    invoke-direct {v1, p0, p1}, La/a/a/i/g$d;-><init>(La/a/a/i/g;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, La/a/a/i/g;->b(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    :try_start_0
    new-instance v0, La/a/a/i/g$e;

    invoke-direct {v0, p0, p1}, La/a/a/i/g$e;-><init>(La/a/a/i/g;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, La/a/a/i/g;->a(Z)V

    :goto_0
    return-void
.end method

.method public a(Ljava/util/concurrent/ExecutorService;Ljava/lang/String;)V
    .locals 1

    :try_start_0
    new-instance v0, La/a/a/i/g$f;

    invoke-direct {v0, p0, p2}, La/a/a/i/g$f;-><init>(La/a/a/i/g;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, La/a/a/i/g;->a(Z)V

    :goto_0
    return-void
.end method

.method public a(Ljava/util/concurrent/ExecutorService;ZLjava/lang/String;)V
    .locals 1

    :try_start_0
    new-instance v0, La/a/a/i/g$b;

    invoke-direct {v0, p0, p3, p2}, La/a/a/i/g$b;-><init>(La/a/a/i/g;Ljava/lang/String;Z)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, La/a/a/i/g;->a(Z)V

    :goto_0
    return-void
.end method

.method public abstract a(Z)V
.end method

.method public a(ZLjava/lang/String;)V
    .locals 1

    :try_start_0
    new-instance v0, La/a/a/i/g$c;

    invoke-direct {v0, p0, p2, p1}, La/a/a/i/g$c;-><init>(La/a/a/i/g;Ljava/lang/String;Z)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, La/a/a/i/g;->a(Z)V

    :goto_0
    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 5

    invoke-virtual {p0}, La/a/a/i/g;->a()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, La/a/a/i/g;->f:Ljava/lang/String;

    if-eqz v2, :cond_0

    invoke-static {}, La/a/a/b/q;->c()La/a/a/b/q;

    move-result-object v2

    iget-object v3, p0, La/a/a/i/g;->f:Ljava/lang/String;

    goto :goto_0

    :cond_0
    invoke-static {}, La/a/a/b/q;->c()La/a/a/b/q;

    move-result-object v2

    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v2, v3}, La/a/a/b/q;->a(Ljava/lang/String;)V

    invoke-static {}, La/a/a/b/q;->c()La/a/a/b/q;

    move-result-object v2

    iget-object v3, p0, La/a/a/i/g;->d:Ljava/util/Map;

    new-instance v4, La/a/a/i/g$a;

    invoke-direct {v4, p0, v0, v1}, La/a/a/i/g$a;-><init>(La/a/a/i/g;J)V

    invoke-virtual {v2, v3, p1, v4}, La/a/a/b/q;->a(Ljava/util/Map;Ljava/lang/String;La/a/a/b/q$a;)V

    return-void
.end method
