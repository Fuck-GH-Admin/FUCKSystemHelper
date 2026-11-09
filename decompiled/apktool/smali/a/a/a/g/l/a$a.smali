.class public La/a/a/g/l/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/a/a/g/l/a;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:La/a/a/g/l/a;


# direct methods
.method public constructor <init>(La/a/a/g/l/a;)V
    .locals 0

    iput-object p1, p0, La/a/a/g/l/a$a;->b:La/a/a/g/l/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    :try_start_0
    iget-object v0, p0, La/a/a/g/l/a$a;->b:La/a/a/g/l/a;

    invoke-static {v0}, La/a/a/g/l/a;->e(La/a/a/g/l/a;)V

    iget-object v0, p0, La/a/a/g/l/a$a;->b:La/a/a/g/l/a;

    invoke-static {v0}, La/a/a/g/l/a;->f(La/a/a/g/l/a;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object p0, p0, La/a/a/g/l/a$a;->b:La/a/a/g/l/a;

    invoke-static {p0}, La/a/a/g/l/a;->f(La/a/a/g/l/a;)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    sget-boolean p0, La/a/a/g/m/a;->a:Z

    if-eqz p0, :cond_0

    sget-boolean p0, La/a/a/g/m/a;->b:Z

    if-eqz p0, :cond_0

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object p0

    const-string v1, "update mCellInfo completed"

    invoke-virtual {p0, v1}, La/a/a/g/e;->a(Ljava/lang/String;)V

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception p0

    sget-boolean v0, La/a/a/g/m/a;->a:Z

    if-eqz v0, :cond_1

    sget-boolean v0, La/a/a/g/m/a;->b:Z

    if-eqz v0, :cond_1

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "handleCellInfo error = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, La/a/a/g/e;->a(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method
