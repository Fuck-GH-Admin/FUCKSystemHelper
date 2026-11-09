.class public La/a/a/b/h$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/a/a/b/h;->a(Ljava/util/List;)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "La/a/a/b/h$d;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(La/a/a/b/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La/a/a/b/h$d;La/a/a/b/h$d;)I
    .locals 0

    iget p0, p1, La/a/a/b/h$d;->b:I

    iget p1, p2, La/a/a/b/h$d;->b:I

    if-le p0, p1, :cond_0

    const/4 p0, -0x1

    return p0

    :cond_0
    if-ne p0, p1, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, La/a/a/b/h$d;

    check-cast p2, La/a/a/b/h$d;

    invoke-virtual {p0, p1, p2}, La/a/a/b/h$a;->a(La/a/a/b/h$d;La/a/a/b/h$d;)I

    move-result p0

    return p0
.end method
