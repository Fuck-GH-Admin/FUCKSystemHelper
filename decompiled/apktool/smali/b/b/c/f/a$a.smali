.class Lb/b/c/f/a$a;
.super Lb/b/c/f/h;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/b/c/f/a;->b()Lb/b/c/f/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lb/b/c/f/h<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field final synthetic d:Lb/b/c/f/a;


# direct methods
.method constructor <init>(Lb/b/c/f/a;)V
    .locals 0

    iput-object p1, p0, Lb/b/c/f/a$a;->d:Lb/b/c/f/a;

    invoke-direct {p0}, Lb/b/c/f/h;-><init>()V

    return-void
.end method


# virtual methods
.method protected a(Ljava/lang/Object;)I
    .locals 0

    iget-object p0, p0, Lb/b/c/f/a$a;->d:Lb/b/c/f/a;

    invoke-virtual {p0, p1}, Lb/b/c/f/k;->a(Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method protected a(II)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lb/b/c/f/a$a;->d:Lb/b/c/f/a;

    iget-object p0, p0, Lb/b/c/f/k;->c:[Ljava/lang/Object;

    shl-int/lit8 p1, p1, 0x1

    add-int/2addr p1, p2

    aget-object p0, p0, p1

    return-object p0
.end method

.method protected a(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITV;)TV;"
        }
    .end annotation

    iget-object p0, p0, Lb/b/c/f/a$a;->d:Lb/b/c/f/a;

    invoke-virtual {p0, p1, p2}, Lb/b/c/f/k;->a(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method protected a()V
    .locals 0

    iget-object p0, p0, Lb/b/c/f/a$a;->d:Lb/b/c/f/a;

    invoke-virtual {p0}, Lb/b/c/f/k;->clear()V

    return-void
.end method

.method protected a(I)V
    .locals 0

    iget-object p0, p0, Lb/b/c/f/a$a;->d:Lb/b/c/f/a;

    invoke-virtual {p0, p1}, Lb/b/c/f/k;->c(I)Ljava/lang/Object;

    return-void
.end method

.method protected a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)V"
        }
    .end annotation

    iget-object p0, p0, Lb/b/c/f/a$a;->d:Lb/b/c/f/a;

    invoke-virtual {p0, p1, p2}, Lb/b/c/f/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method protected b(Ljava/lang/Object;)I
    .locals 0

    iget-object p0, p0, Lb/b/c/f/a$a;->d:Lb/b/c/f/a;

    invoke-virtual {p0, p1}, Lb/b/c/f/k;->b(Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method protected b()Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object p0, p0, Lb/b/c/f/a$a;->d:Lb/b/c/f/a;

    return-object p0
.end method

.method protected c()I
    .locals 0

    iget-object p0, p0, Lb/b/c/f/a$a;->d:Lb/b/c/f/a;

    iget p0, p0, Lb/b/c/f/k;->d:I

    return p0
.end method
