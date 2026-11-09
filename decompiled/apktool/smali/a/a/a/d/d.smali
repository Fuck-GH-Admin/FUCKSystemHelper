.class public La/a/a/d/d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/a/a/d/d$a;
    }
.end annotation


# instance fields
.field public a:La/a/a/d/b;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, La/a/a/b/r;->a()La/a/a/b/r;

    move-result-object p0

    const-string v0, "mapcity"

    const-string v1, ""

    invoke-virtual {p0, v0, v1}, La/a/a/b/r;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(La/a/a/d/c;)V
    .locals 0

    invoke-direct {p0}, La/a/a/d/d;-><init>()V

    return-void
.end method

.method public static b()La/a/a/d/d;
    .locals 1

    sget-object v0, La/a/a/d/d$a;->a:La/a/a/d/d;

    return-object v0
.end method


# virtual methods
.method public declared-synchronized a()La/a/a/d/b;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, La/a/a/d/d;->a:La/a/a/d/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
