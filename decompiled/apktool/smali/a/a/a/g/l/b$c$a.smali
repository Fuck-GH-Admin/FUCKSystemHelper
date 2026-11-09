.class public La/a/a/g/l/b$c$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/a/a/g/l/b$c;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:La/a/a/g/l/b$c;


# direct methods
.method public constructor <init>(La/a/a/g/l/b$c;)V
    .locals 0

    iput-object p1, p0, La/a/a/g/l/b$c$a;->b:La/a/a/g/l/b$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, La/a/a/g/l/b$c$a;->b:La/a/a/g/l/b$c;

    iget-object v0, v0, La/a/a/g/l/b$c;->a:La/a/a/g/l/b;

    invoke-static {v0}, La/a/a/g/l/b;->a(La/a/a/g/l/b;)V

    iget-object v0, p0, La/a/a/g/l/b$c$a;->b:La/a/a/g/l/b$c;

    iget-object v0, v0, La/a/a/g/l/b$c;->a:La/a/a/g/l/b;

    invoke-static {v0}, La/a/a/g/l/b;->b(La/a/a/g/l/b;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object p0, p0, La/a/a/g/l/b$c$a;->b:La/a/a/g/l/b$c;

    iget-object p0, p0, La/a/a/g/l/b$c;->a:La/a/a/g/l/b;

    invoke-static {p0}, La/a/a/g/l/b;->b(La/a/a/g/l/b;)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    sget-boolean p0, La/a/a/g/m/a;->a:Z

    if-eqz p0, :cond_0

    sget-boolean p0, La/a/a/g/m/a;->b:Z

    if-eqz p0, :cond_0

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object p0

    const-string v1, "WifiScan finished, in callback."

    invoke-virtual {p0, v1}, La/a/a/g/e;->a(Ljava/lang/String;)V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method
