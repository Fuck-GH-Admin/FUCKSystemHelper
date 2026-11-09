.class public La/a/a/c/d$b;
.super La/a/a/i/g;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/c/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public i:Ljava/lang/String;

.field public j:Z

.field public k:Z

.field public final synthetic l:La/a/a/c/d;


# direct methods
.method public constructor <init>(La/a/a/c/d;)V
    .locals 0

    iput-object p1, p0, La/a/a/c/d$b;->l:La/a/a/c/d;

    invoke-direct {p0}, La/a/a/i/g;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, La/a/a/c/d$b;->i:Ljava/lang/String;

    const/4 p1, 0x0

    iput-boolean p1, p0, La/a/a/c/d$b;->j:Z

    iput-boolean p1, p0, La/a/a/c/d$b;->k:Z

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, La/a/a/i/g;->d:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    const/4 v0, 0x2

    iput v0, p0, La/a/a/i/g;->b:I

    iget-object v0, p0, La/a/a/c/d$b;->i:Ljava/lang/String;

    invoke-static {v0}, Lcom/baidu/location/Jni;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    iput-object v1, p0, La/a/a/c/d$b;->i:Ljava/lang/String;

    iget-boolean v1, p0, La/a/a/c/d$b;->j:Z

    const-string v2, "qt"

    if-eqz v1, :cond_0

    iget-object v1, p0, La/a/a/i/g;->d:Ljava/util/Map;

    const-string v3, "grid"

    goto :goto_0

    :cond_0
    iget-object v1, p0, La/a/a/i/g;->d:Ljava/util/Map;

    const-string v3, "conf"

    :goto_0
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p0, p0, La/a/a/i/g;->d:Ljava/util/Map;

    const-string v1, "req"

    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public a(Ljava/lang/String;Z)V
    .locals 1

    iget-boolean v0, p0, La/a/a/c/d$b;->k:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, La/a/a/c/d$b;->k:Z

    iput-object p1, p0, La/a/a/c/d$b;->i:Ljava/lang/String;

    iput-boolean p2, p0, La/a/a/c/d$b;->j:Z

    invoke-static {}, La/a/a/b/w;->d()La/a/a/b/w;

    move-result-object p1

    invoke-virtual {p1}, La/a/a/b/w;->b()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    if-eqz p2, :cond_1

    const-string p2, "loc.map.baidu.com"

    invoke-virtual {p0, p1, v0, p2}, La/a/a/i/g;->a(Ljava/util/concurrent/ExecutorService;ZLjava/lang/String;)V

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_2

    sget-object p2, La/a/a/i/d;->c:Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, La/a/a/i/g;->a(Ljava/util/concurrent/ExecutorService;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    sget-object p1, La/a/a/i/d;->c:Ljava/lang/String;

    invoke-virtual {p0, p1}, La/a/a/i/g;->a(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public a(Z)V
    .locals 1

    if-eqz p1, :cond_1

    iget-object p1, p0, La/a/a/i/g;->c:Ljava/lang/String;

    if-eqz p1, :cond_1

    iget-boolean v0, p0, La/a/a/c/d$b;->j:Z

    if-eqz v0, :cond_0

    iget-object p1, p0, La/a/a/c/d$b;->l:La/a/a/c/d;

    iget-object v0, p0, La/a/a/i/g;->e:[B

    invoke-static {p1, v0}, La/a/a/c/d;->a(La/a/a/c/d;[B)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, La/a/a/c/d$b;->l:La/a/a/c/d;

    invoke-static {v0, p1}, La/a/a/c/d;->a(La/a/a/c/d;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, La/a/a/c/d$b;->l:La/a/a/c/d;

    const/4 v0, 0x0

    invoke-static {p1, v0}, La/a/a/c/d;->a(La/a/a/c/d;Ljava/lang/String;)V

    :goto_0
    iget-object p1, p0, La/a/a/i/g;->d:Ljava/util/Map;

    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/util/Map;->clear()V

    :cond_2
    const/4 p1, 0x0

    iput-boolean p1, p0, La/a/a/c/d$b;->k:Z

    return-void
.end method
