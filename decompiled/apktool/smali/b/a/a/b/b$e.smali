.class Lb/a/a/b/b$e;
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
    accessFlags = 0x2
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;",
        "Lb/a/a/b/b$g<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field private b:Lb/a/a/b/b$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/a/a/b/b$d<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field private c:Z

.field final synthetic d:Lb/a/a/b/b;


# direct methods
.method private constructor <init>(Lb/a/a/b/b;)V
    .locals 0

    iput-object p1, p0, Lb/a/a/b/b$e;->d:Lb/a/a/b/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lb/a/a/b/b$e;->c:Z

    return-void
.end method

.method synthetic constructor <init>(Lb/a/a/b/b;Lb/a/a/b/b$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lb/a/a/b/b$e;-><init>(Lb/a/a/b/b;)V

    return-void
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

    iget-object v0, p0, Lb/a/a/b/b$e;->b:Lb/a/a/b/b$d;

    if-ne p1, v0, :cond_1

    iget-object p1, v0, Lb/a/a/b/b$d;->e:Lb/a/a/b/b$d;

    iput-object p1, p0, Lb/a/a/b/b$e;->b:Lb/a/a/b/b$d;

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lb/a/a/b/b$e;->c:Z

    :cond_1
    return-void
.end method

.method public hasNext()Z
    .locals 3

    iget-boolean v0, p0, Lb/a/a/b/b$e;->c:Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    iget-object p0, p0, Lb/a/a/b/b$e;->d:Lb/a/a/b/b;

    invoke-static {p0}, Lb/a/a/b/b;->a(Lb/a/a/b/b;)Lb/a/a/b/b$d;

    move-result-object p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    return v1

    :cond_1
    iget-object p0, p0, Lb/a/a/b/b$e;->b:Lb/a/a/b/b$d;

    if-eqz p0, :cond_2

    iget-object p0, p0, Lb/a/a/b/b$d;->d:Lb/a/a/b/b$d;

    if-eqz p0, :cond_2

    goto :goto_1

    :cond_2
    move v1, v2

    :goto_1
    return v1
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0}, Lb/a/a/b/b$e;->next()Ljava/util/Map$Entry;

    move-result-object p0

    return-object p0
.end method

.method public next()Ljava/util/Map$Entry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;"
        }
    .end annotation

    iget-boolean v0, p0, Lb/a/a/b/b$e;->c:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lb/a/a/b/b$e;->c:Z

    iget-object v0, p0, Lb/a/a/b/b$e;->d:Lb/a/a/b/b;

    invoke-static {v0}, Lb/a/a/b/b;->a(Lb/a/a/b/b;)Lb/a/a/b/b$d;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lb/a/a/b/b$e;->b:Lb/a/a/b/b$d;

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lb/a/a/b/b$e;->b:Lb/a/a/b/b$d;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lb/a/a/b/b$d;->d:Lb/a/a/b/b$d;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    iget-object p0, p0, Lb/a/a/b/b$e;->b:Lb/a/a/b/b$d;

    return-object p0
.end method
