.class public La/a/a/g/f$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/g/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "La/a/a/g/h;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/a/a/g/f$a;)V
    .locals 0

    invoke-direct {p0}, La/a/a/g/f$e;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La/a/a/g/h;La/a/a/g/h;)I
    .locals 0

    iget p0, p1, La/a/a/g/h;->g:I

    iget p1, p2, La/a/a/g/h;->g:I

    sub-int/2addr p0, p1

    return p0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, La/a/a/g/h;

    check-cast p2, La/a/a/g/h;

    invoke-virtual {p0, p1, p2}, La/a/a/g/f$e;->a(La/a/a/g/h;La/a/a/g/h;)I

    move-result p0

    return p0
.end method
