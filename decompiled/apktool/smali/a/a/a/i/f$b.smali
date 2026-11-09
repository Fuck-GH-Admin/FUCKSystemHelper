.class public La/a/a/i/f$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/i/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public a:La/a/a/i/f$a;

.field public b:La/a/a/i/f$a;

.field public final synthetic c:La/a/a/i/f;


# direct methods
.method public constructor <init>(La/a/a/i/f;La/a/a/i/f$a;La/a/a/i/f$a;)V
    .locals 0

    iput-object p1, p0, La/a/a/i/f$b;->c:La/a/a/i/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/a/a/i/f$b;->a:La/a/a/i/f$a;

    iput-object p3, p0, La/a/a/i/f$b;->b:La/a/a/i/f$a;

    return-void
.end method


# virtual methods
.method public a(La/a/a/i/f$a;)Z
    .locals 8

    iget-object v0, p0, La/a/a/i/f$b;->c:La/a/a/i/f;

    invoke-virtual {p0, p1}, La/a/a/i/f$b;->b(La/a/a/i/f$a;)D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, La/a/a/i/f;->a(D)I

    move-result v0

    if-nez v0, :cond_0

    iget-wide v0, p1, La/a/a/i/f$a;->a:D

    iget-object v2, p0, La/a/a/i/f$b;->a:La/a/a/i/f$a;

    iget-wide v2, v2, La/a/a/i/f$a;->a:D

    iget-object v4, p0, La/a/a/i/f$b;->b:La/a/a/i/f$a;

    iget-wide v4, v4, La/a/a/i/f$a;->a:D

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(DD)D

    move-result-wide v2

    const-wide v4, 0x3e45798ee2308c3aL    # 1.0E-8

    add-double/2addr v2, v4

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    iget-wide v0, p1, La/a/a/i/f$a;->a:D

    iget-object v2, p0, La/a/a/i/f$b;->a:La/a/a/i/f$a;

    iget-wide v2, v2, La/a/a/i/f$a;->a:D

    iget-object v6, p0, La/a/a/i/f$b;->b:La/a/a/i/f$a;

    iget-wide v6, v6, La/a/a/i/f$a;->a:D

    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->min(DD)D

    move-result-wide v2

    sub-double/2addr v2, v4

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    iget-wide v0, p1, La/a/a/i/f$a;->b:D

    iget-object v2, p0, La/a/a/i/f$b;->a:La/a/a/i/f$a;

    iget-wide v2, v2, La/a/a/i/f$a;->b:D

    iget-object v6, p0, La/a/a/i/f$b;->b:La/a/a/i/f$a;

    iget-wide v6, v6, La/a/a/i/f$a;->b:D

    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->max(DD)D

    move-result-wide v2

    add-double/2addr v2, v4

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    iget-wide v0, p1, La/a/a/i/f$a;->b:D

    iget-object p1, p0, La/a/a/i/f$b;->a:La/a/a/i/f$a;

    iget-wide v2, p1, La/a/a/i/f$a;->b:D

    iget-object p0, p0, La/a/a/i/f$b;->b:La/a/a/i/f$a;

    iget-wide p0, p0, La/a/a/i/f$a;->b:D

    invoke-static {v2, v3, p0, p1}, Ljava/lang/Math;->min(DD)D

    move-result-wide p0

    sub-double/2addr p0, v4

    cmpl-double p0, v0, p0

    if-lez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public b(La/a/a/i/f$a;)D
    .locals 12

    new-instance v6, La/a/a/i/f$a;

    iget-object v7, p0, La/a/a/i/f$b;->c:La/a/a/i/f;

    iget-object v0, p0, La/a/a/i/f$b;->b:La/a/a/i/f$a;

    iget-wide v1, v0, La/a/a/i/f$a;->a:D

    iget-object p0, p0, La/a/a/i/f$b;->a:La/a/a/i/f$a;

    iget-wide v8, p0, La/a/a/i/f$a;->a:D

    sub-double v2, v1, v8

    iget-wide v0, v0, La/a/a/i/f$a;->b:D

    iget-wide v10, p0, La/a/a/i/f$a;->b:D

    sub-double v4, v0, v10

    move-object v0, v6

    move-object v1, v7

    invoke-direct/range {v0 .. v5}, La/a/a/i/f$a;-><init>(La/a/a/i/f;DD)V

    new-instance p0, La/a/a/i/f$a;

    iget-wide v0, p1, La/a/a/i/f$a;->a:D

    sub-double v2, v0, v8

    iget-wide v0, p1, La/a/a/i/f$a;->b:D

    sub-double v4, v0, v10

    move-object v0, p0

    move-object v1, v7

    invoke-direct/range {v0 .. v5}, La/a/a/i/f$a;-><init>(La/a/a/i/f;DD)V

    iget-wide v0, v6, La/a/a/i/f$a;->a:D

    iget-wide v2, p0, La/a/a/i/f$a;->b:D

    mul-double/2addr v0, v2

    iget-wide v2, v6, La/a/a/i/f$a;->b:D

    iget-wide p0, p0, La/a/a/i/f$a;->a:D

    mul-double/2addr v2, p0

    sub-double/2addr v0, v2

    return-wide v0
.end method
