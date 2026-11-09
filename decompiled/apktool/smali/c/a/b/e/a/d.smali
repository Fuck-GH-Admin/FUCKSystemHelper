.class Lc/a/b/e/a/d;
.super Lc/a/b/e/a/f;
.source ""


# instance fields
.field protected d:[B

.field private e:[B

.field private f:[B


# direct methods
.method constructor <init>(Lc/a/b/e/a/b;)V
    .locals 1

    invoke-direct {p0, p1}, Lc/a/b/e/a/f;-><init>(Lc/a/b/e/a/b;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lc/a/b/e/a/d;->f:[B

    iget p1, p0, Lc/a/b/e/a/f;->b:I

    new-array v0, p1, [B

    iput-object v0, p0, Lc/a/b/e/a/d;->e:[B

    new-array p1, p1, [B

    iput-object p1, p0, Lc/a/b/e/a/d;->d:[B

    return-void
.end method


# virtual methods
.method a()V
    .locals 3

    iget-object v0, p0, Lc/a/b/e/a/f;->c:[B

    iget-object v1, p0, Lc/a/b/e/a/d;->d:[B

    iget p0, p0, Lc/a/b/e/a/f;->b:I

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method a(ZLjava/lang/String;[B[B)V
    .locals 2

    if-eqz p3, :cond_0

    if-eqz p4, :cond_0

    array-length v0, p4

    iget v1, p0, Lc/a/b/e/a/f;->b:I

    if-ne v0, v1, :cond_0

    iput-object p4, p0, Lc/a/b/e/a/f;->c:[B

    invoke-virtual {p0}, Lc/a/b/e/a/d;->a()V

    iget-object p0, p0, Lc/a/b/e/a/f;->a:Lc/a/b/e/a/b;

    invoke-virtual {p0, p1, p2, p3}, Lc/a/b/e/a/b;->a(ZLjava/lang/String;[B)V

    return-void

    :cond_0
    new-instance p0, Ljava/security/InvalidKeyException;

    const-string p1, "Internal error"

    invoke-direct {p0, p1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method a([BII[BI)V
    .locals 5

    add-int/2addr p3, p2

    :goto_0
    if-ge p2, p3, :cond_1

    const/4 v0, 0x0

    move v1, v0

    :goto_1
    iget v2, p0, Lc/a/b/e/a/f;->b:I

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lc/a/b/e/a/d;->e:[B

    add-int v3, v1, p2

    aget-byte v3, p1, v3

    iget-object v4, p0, Lc/a/b/e/a/d;->d:[B

    aget-byte v4, v4, v1

    xor-int/2addr v3, v4

    int-to-byte v3, v3

    aput-byte v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lc/a/b/e/a/f;->a:Lc/a/b/e/a/b;

    iget-object v2, p0, Lc/a/b/e/a/d;->e:[B

    invoke-virtual {v1, v2, v0, p4, p5}, Lc/a/b/e/a/b;->a([BI[BI)V

    iget-object v1, p0, Lc/a/b/e/a/d;->d:[B

    iget v2, p0, Lc/a/b/e/a/f;->b:I

    invoke-static {p4, p5, v1, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v0, p0, Lc/a/b/e/a/f;->b:I

    add-int/2addr p2, v0

    add-int/2addr p5, v0

    goto :goto_0

    :cond_1
    return-void
.end method

.method b()V
    .locals 3

    iget-object v0, p0, Lc/a/b/e/a/d;->f:[B

    if-nez v0, :cond_0

    iget v0, p0, Lc/a/b/e/a/f;->b:I

    new-array v0, v0, [B

    iput-object v0, p0, Lc/a/b/e/a/d;->f:[B

    :cond_0
    iget-object v0, p0, Lc/a/b/e/a/d;->d:[B

    iget-object v1, p0, Lc/a/b/e/a/d;->f:[B

    iget p0, p0, Lc/a/b/e/a/f;->b:I

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method b([BII[BI)V
    .locals 6

    add-int/2addr p3, p2

    if-ne p1, p4, :cond_0

    if-lt p2, p5, :cond_0

    sub-int v0, p2, p5

    iget v1, p0, Lc/a/b/e/a/f;->b:I

    if-ge v0, v1, :cond_0

    invoke-virtual {p1}, [B->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-ge p2, p3, :cond_3

    iget-object v1, p0, Lc/a/b/e/a/f;->a:Lc/a/b/e/a/b;

    iget-object v2, p0, Lc/a/b/e/a/d;->e:[B

    const/4 v3, 0x0

    invoke-virtual {v1, p1, p2, v2, v3}, Lc/a/b/e/a/b;->b([BI[BI)V

    move v1, v3

    :goto_1
    iget v2, p0, Lc/a/b/e/a/f;->b:I

    if-ge v1, v2, :cond_1

    add-int v2, v1, p5

    iget-object v4, p0, Lc/a/b/e/a/d;->e:[B

    aget-byte v4, v4, v1

    iget-object v5, p0, Lc/a/b/e/a/d;->d:[B

    aget-byte v5, v5, v1

    xor-int/2addr v4, v5

    int-to-byte v4, v4

    aput-byte v4, p4, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lc/a/b/e/a/d;->d:[B

    if-nez v0, :cond_2

    invoke-static {p1, p2, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_2

    :cond_2
    invoke-static {v0, p2, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_2
    iget v1, p0, Lc/a/b/e/a/f;->b:I

    add-int/2addr p2, v1

    add-int/2addr p5, v1

    goto :goto_0

    :cond_3
    return-void
.end method

.method c()V
    .locals 3

    iget-object v0, p0, Lc/a/b/e/a/d;->f:[B

    iget-object v1, p0, Lc/a/b/e/a/d;->d:[B

    iget p0, p0, Lc/a/b/e/a/f;->b:I

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method
