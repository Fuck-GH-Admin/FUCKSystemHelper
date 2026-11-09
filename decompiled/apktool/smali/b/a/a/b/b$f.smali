.class abstract Lb/a/a/b/b$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Iterator;
.implements Lb/a/a/b/b$g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/a/a/b/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;",
        "Lb/a/a/b/b$g<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field b:Lb/a/a/b/b$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/a/a/b/b$d<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field c:Lb/a/a/b/b$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/a/a/b/b$d<",
            "TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lb/a/a/b/b$d;Lb/a/a/b/b$d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/a/a/b/b$d<",
            "TK;TV;>;",
            "Lb/a/a/b/b$d<",
            "TK;TV;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lb/a/a/b/b$f;->b:Lb/a/a/b/b$d;

    iput-object p1, p0, Lb/a/a/b/b$f;->c:Lb/a/a/b/b$d;

    return-void
.end method

.method private a()Lb/a/a/b/b$d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lb/a/a/b/b$d<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lb/a/a/b/b$f;->c:Lb/a/a/b/b$d;

    iget-object v1, p0, Lb/a/a/b/b$f;->b:Lb/a/a/b/b$d;

    if-eq v0, v1, :cond_1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Lb/a/a/b/b$f;->c(Lb/a/a/b/b$d;)Lb/a/a/b/b$d;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public a(Lb/a/a/b/b$d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/a/a/b/b$d<",
            "TK;TV;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lb/a/a/b/b$f;->b:Lb/a/a/b/b$d;

    if-ne v0, p1, :cond_0

    iget-object v0, p0, Lb/a/a/b/b$f;->c:Lb/a/a/b/b$d;

    if-ne p1, v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lb/a/a/b/b$f;->c:Lb/a/a/b/b$d;

    iput-object v0, p0, Lb/a/a/b/b$f;->b:Lb/a/a/b/b$d;

    :cond_0
    iget-object v0, p0, Lb/a/a/b/b$f;->b:Lb/a/a/b/b$d;

    if-ne v0, p1, :cond_1

    invoke-virtual {p0, v0}, Lb/a/a/b/b$f;->b(Lb/a/a/b/b$d;)Lb/a/a/b/b$d;

    move-result-object v0

    iput-object v0, p0, Lb/a/a/b/b$f;->b:Lb/a/a/b/b$d;

    :cond_1
    iget-object v0, p0, Lb/a/a/b/b$f;->c:Lb/a/a/b/b$d;

    if-ne v0, p1, :cond_2

    invoke-direct {p0}, Lb/a/a/b/b$f;->a()Lb/a/a/b/b$d;

    move-result-object p1

    iput-object p1, p0, Lb/a/a/b/b$f;->c:Lb/a/a/b/b$d;

    :cond_2
    return-void
.end method

.method abstract b(Lb/a/a/b/b$d;)Lb/a/a/b/b$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/a/a/b/b$d<",
            "TK;TV;>;)",
            "Lb/a/a/b/b$d<",
            "TK;TV;>;"
        }
    .end annotation
.end method

.method abstract c(Lb/a/a/b/b$d;)Lb/a/a/b/b$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/a/a/b/b$d<",
            "TK;TV;>;)",
            "Lb/a/a/b/b$d<",
            "TK;TV;>;"
        }
    .end annotation
.end method

.method public hasNext()Z
    .locals 0

    iget-object p0, p0, Lb/a/a/b/b$f;->c:Lb/a/a/b/b$d;

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0}, Lb/a/a/b/b$f;->next()Ljava/util/Map$Entry;

    move-result-object p0

    return-object p0
.end method

.method public next()Ljava/util/Map$Entry;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lb/a/a/b/b$f;->c:Lb/a/a/b/b$d;

    invoke-direct {p0}, Lb/a/a/b/b$f;->a()Lb/a/a/b/b$d;

    move-result-object v1

    iput-object v1, p0, Lb/a/a/b/b$f;->c:Lb/a/a/b/b$d;

    return-object v0
.end method
