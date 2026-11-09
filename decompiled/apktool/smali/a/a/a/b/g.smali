.class public La/a/a/b/g;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static b:Ljava/lang/Object;

.field public static c:La/a/a/b/g;


# instance fields
.field public a:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, La/a/a/b/g;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, La/a/a/b/g;->a:I

    return-void
.end method

.method public static b()La/a/a/b/g;
    .locals 2

    sget-object v0, La/a/a/b/g;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, La/a/a/b/g;->c:La/a/a/b/g;

    if-nez v1, :cond_0

    new-instance v1, La/a/a/b/g;

    invoke-direct {v1}, La/a/a/b/g;-><init>()V

    sput-object v1, La/a/a/b/g;->c:La/a/a/b/g;

    :cond_0
    sget-object v1, La/a/a/b/g;->c:La/a/a/b/g;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, -0x1

    iput v0, p0, La/a/a/b/g;->a:I

    return-void
.end method

.method public a(IILjava/lang/String;)V
    .locals 1

    iget v0, p0, La/a/a/b/g;->a:I

    if-eq p2, v0, :cond_0

    iput p2, p0, La/a/a/b/g;->a:I

    new-instance p0, Landroid/os/Bundle;

    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    const-string v0, "loctype"

    invoke-virtual {p0, v0, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string p1, "diagtype"

    invoke-virtual {p0, p1, p2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {p3}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    const-string p2, "diagmessage"

    invoke-virtual {p0, p2, p1}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    invoke-static {}, La/a/a/b/c;->h()La/a/a/b/c;

    move-result-object p1

    const/16 p2, 0x12f

    invoke-virtual {p1, p0, p2}, La/a/a/b/c;->a(Landroid/os/Bundle;I)V

    :cond_0
    return-void
.end method
