.class abstract Lc/a/b/a/g;
.super Ljava/lang/Object;
.source ""


# instance fields
.field protected a:I

.field protected b:I

.field protected c:I


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 0

    iget p0, p0, Lc/a/b/a/g;->b:I

    return p0
.end method

.method public abstract a([BII)Lc/a/b/a/b;
.end method

.method public b()I
    .locals 0

    iget p0, p0, Lc/a/b/a/g;->a:I

    return p0
.end method

.method public c()I
    .locals 0

    iget p0, p0, Lc/a/b/a/g;->c:I

    return p0
.end method
