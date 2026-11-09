.class public final Lcom/baidu/location/l/c;
.super Lc/b/a/a/c;
.source ""


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/baidu/location/l/b;",
            ">;"
        }
    .end annotation
.end field

.field private b:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lc/b/a/a/c;-><init>()V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/baidu/location/l/c;->a:Ljava/util/List;

    const/4 v0, -0x1

    iput v0, p0, Lcom/baidu/location/l/c;->b:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/baidu/location/l/c;->b:I

    if-gez v0, :cond_0

    invoke-virtual {p0}, Lcom/baidu/location/l/c;->b()I

    :cond_0
    iget p0, p0, Lcom/baidu/location/l/c;->b:I

    return p0
.end method

.method public a(Lcom/baidu/location/l/b;)Lcom/baidu/location/l/c;
    .locals 1

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    iget-object v0, p0, Lcom/baidu/location/l/c;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/baidu/location/l/c;->a:Ljava/util/List;

    :cond_1
    iget-object v0, p0, Lcom/baidu/location/l/c;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public a(Lc/b/a/a/b;)V
    .locals 2

    invoke-virtual {p0}, Lcom/baidu/location/l/c;->d()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/location/l/b;

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lc/b/a/a/b;->a(ILc/b/a/a/c;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public b()I
    .locals 4

    invoke-virtual {p0}, Lcom/baidu/location/l/c;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/baidu/location/l/b;

    const/4 v3, 0x1

    invoke-static {v3, v2}, Lc/b/a/a/b;->b(ILc/b/a/a/c;)I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_0

    :cond_0
    iput v1, p0, Lcom/baidu/location/l/c;->b:I

    return v1
.end method

.method public d()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/baidu/location/l/b;",
            ">;"
        }
    .end annotation

    iget-object p0, p0, Lcom/baidu/location/l/c;->a:Ljava/util/List;

    return-object p0
.end method
