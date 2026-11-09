.class public La/a/a/d/i$f;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/d/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "f"
.end annotation


# direct methods
.method public constructor <init>(La/a/a/d/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(DDDD)D
    .locals 0

    invoke-virtual {p0, p3, p4, p5, p6}, La/a/a/d/i$f;->a(DD)[D

    move-result-object p0

    const/4 p3, 0x0

    aget-wide p3, p0, p3

    sub-double/2addr p7, p3

    invoke-static {p7, p8}, Ljava/lang/Math;->abs(D)D

    move-result-wide p3

    const/4 p5, 0x1

    aget-wide p5, p0, p5

    const-wide/high16 p7, 0x4000000000000000L    # 2.0

    mul-double/2addr p5, p7

    cmpl-double p0, p3, p5

    if-lez p0, :cond_0

    add-double/2addr p1, p3

    :cond_0
    return-wide p1
.end method

.method public a(DD)[D
    .locals 0

    invoke-static {}, La/a/a/c/a;->d()La/a/a/c/a;

    move-result-object p0

    invoke-virtual {p0, p1, p2, p3, p4}, La/a/a/c/a;->a(DD)[D

    move-result-object p0

    return-object p0
.end method
