.class final Lb/b/c/d/b$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb/b/c/d/c$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/b/c/d/b;->a(Landroid/content/Context;Lb/b/c/d/a;Lb/b/c/a/d/f$a;Landroid/os/Handler;ZII)Landroid/graphics/Typeface;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lb/b/c/d/c$d<",
        "Lb/b/c/d/b$g;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lb/b/c/d/b$c;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lb/b/c/d/b$g;)V
    .locals 3

    sget-object v0, Lb/b/c/d/b;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lb/b/c/d/b;->d:Lb/b/c/f/k;

    iget-object v2, p0, Lb/b/c/d/b$c;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lb/b/c/f/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    sget-object v2, Lb/b/c/d/b;->d:Lb/b/c/f/k;

    iget-object p0, p0, Lb/b/c/d/b$c;->a:Ljava/lang/String;

    invoke-virtual {v2, p0}, Lb/b/c/f/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p0, 0x0

    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p0, v0, :cond_1

    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb/b/c/d/c$d;

    invoke-interface {v0, p1}, Lb/b/c/d/c$d;->a(Ljava/lang/Object;)V

    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_1
    return-void

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lb/b/c/d/b$g;

    invoke-virtual {p0, p1}, Lb/b/c/d/b$c;->a(Lb/b/c/d/b$g;)V

    return-void
.end method
