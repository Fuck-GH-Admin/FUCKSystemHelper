.class public La/a/a/d/g$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/d/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "La/a/a/d/g$a;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(La/a/a/d/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La/a/a/d/g$a;La/a/a/d/g$a;)I
    .locals 0

    iget p0, p2, La/a/a/d/g$a;->b:I

    iget p1, p1, La/a/a/d/g$a;->b:I

    sub-int/2addr p0, p1

    return p0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, La/a/a/d/g$a;

    check-cast p2, La/a/a/d/g$a;

    invoke-virtual {p0, p1, p2}, La/a/a/d/g$e;->a(La/a/a/d/g$a;La/a/a/d/g$a;)I

    move-result p0

    return p0
.end method
