.class public La/a/a/d/m/c/b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/a/a/d/m/c/b$a;
    }
.end annotation


# static fields
.field public static e:La/a/a/d/m/c/b;


# instance fields
.field public a:Z

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "La/a/a/d/m/c/b$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, La/a/a/d/m/c/b;->a:Z

    const-string v0, "slr"

    iput-object v0, p0, La/a/a/d/m/c/b;->b:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, La/a/a/d/m/c/b;->c:Ljava/lang/String;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, La/a/a/d/m/c/b;->d:Ljava/util/Map;

    new-instance v0, Ljava/io/File;

    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p1

    iget-object v1, p0, La/a/a/d/m/c/b;->b:Ljava/lang/String;

    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, La/a/a/d/m/c/b;->b:Ljava/lang/String;

    return-void
.end method

.method public static a(Landroid/content/Context;)La/a/a/d/m/c/b;
    .locals 1

    sget-object v0, La/a/a/d/m/c/b;->e:La/a/a/d/m/c/b;

    if-nez v0, :cond_0

    new-instance v0, La/a/a/d/m/c/b;

    invoke-direct {v0, p0}, La/a/a/d/m/c/b;-><init>(Landroid/content/Context;)V

    sput-object v0, La/a/a/d/m/c/b;->e:La/a/a/d/m/c/b;

    :cond_0
    sget-object p0, La/a/a/d/m/c/b;->e:La/a/a/d/m/c/b;

    return-object p0
.end method

.method public static declared-synchronized d()La/a/a/d/m/c/b;
    .locals 2

    const-class v0, La/a/a/d/m/c/b;

    monitor-enter v0

    :try_start_0
    sget-object v1, La/a/a/d/m/c/b;->e:La/a/a/d/m/c/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "La/a/a/d/m/c/b$a;",
            ">;"
        }
    .end annotation

    iget-object p0, p0, La/a/a/d/m/c/b;->d:Ljava/util/Map;

    return-object p0
.end method

.method public b()Z
    .locals 0

    iget-boolean p0, p0, La/a/a/d/m/c/b;->a:Z

    return p0
.end method

.method public c()Z
    .locals 1

    iget-object p0, p0, La/a/a/d/m/c/b;->c:Ljava/lang/String;

    const-string v0, "on"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method
