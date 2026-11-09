.class public final Lc/b/a/a/b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/b/a/a/b$a;
    }
.end annotation


# instance fields
.field private final a:[B

.field private final b:I

.field private c:I

.field private final d:Ljava/io/OutputStream;


# direct methods
.method private constructor <init>([BII)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lc/b/a/a/b;->d:Ljava/io/OutputStream;

    iput-object p1, p0, Lc/b/a/a/b;->a:[B

    iput p2, p0, Lc/b/a/a/b;->c:I

    add-int/2addr p2, p3

    iput p2, p0, Lc/b/a/a/b;->b:I

    return-void
.end method

.method public static b(IJ)I
    .locals 0

    invoke-static {p0}, Lc/b/a/a/b;->f(I)I

    move-result p0

    invoke-static {p1, p2}, Lc/b/a/a/b;->d(J)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static b(ILc/b/a/a/a;)I
    .locals 0

    invoke-static {p0}, Lc/b/a/a/b;->f(I)I

    move-result p0

    invoke-static {p1}, Lc/b/a/a/b;->b(Lc/b/a/a/a;)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static b(ILc/b/a/a/c;)I
    .locals 0

    invoke-static {p0}, Lc/b/a/a/b;->f(I)I

    move-result p0

    invoke-static {p1}, Lc/b/a/a/b;->b(Lc/b/a/a/c;)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static b(Lc/b/a/a/a;)I
    .locals 1

    invoke-virtual {p0}, Lc/b/a/a/a;->a()I

    move-result v0

    invoke-static {v0}, Lc/b/a/a/b;->e(I)I

    move-result v0

    invoke-virtual {p0}, Lc/b/a/a/a;->a()I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public static b(Lc/b/a/a/c;)I
    .locals 1

    invoke-virtual {p0}, Lc/b/a/a/c;->b()I

    move-result p0

    invoke-static {p0}, Lc/b/a/a/b;->e(I)I

    move-result v0

    add-int/2addr v0, p0

    return v0
.end method

.method public static b([BII)Lc/b/a/a/b;
    .locals 1

    new-instance v0, Lc/b/a/a/b;

    invoke-direct {v0, p0, p1, p2}, Lc/b/a/a/b;-><init>([BII)V

    return-object v0
.end method

.method public static c(II)I
    .locals 0

    invoke-static {p0}, Lc/b/a/a/b;->f(I)I

    move-result p0

    invoke-static {p1}, Lc/b/a/a/b;->d(I)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static c(J)I
    .locals 4

    const-wide/16 v0, -0x80

    and-long/2addr v0, p0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const-wide/16 v0, -0x4000

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    const/4 p0, 0x2

    return p0

    :cond_1
    const-wide/32 v0, -0x200000

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    const/4 p0, 0x3

    return p0

    :cond_2
    const-wide/32 v0, -0x10000000

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_3

    const/4 p0, 0x4

    return p0

    :cond_3
    const-wide v0, -0x800000000L

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_4

    const/4 p0, 0x5

    return p0

    :cond_4
    const-wide v0, -0x40000000000L

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_5

    const/4 p0, 0x6

    return p0

    :cond_5
    const-wide/high16 v0, -0x2000000000000L

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_6

    const/4 p0, 0x7

    return p0

    :cond_6
    const-wide/high16 v0, -0x100000000000000L

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_7

    const/16 p0, 0x8

    return p0

    :cond_7
    const-wide/high16 v0, -0x8000000000000000L

    and-long/2addr p0, v0

    cmp-long p0, p0, v2

    if-nez p0, :cond_8

    const/16 p0, 0x9

    return p0

    :cond_8
    const/16 p0, 0xa

    return p0
.end method

.method private c()V
    .locals 4

    iget-object v0, p0, Lc/b/a/a/b;->d:Ljava/io/OutputStream;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lc/b/a/a/b;->a:[B

    iget v2, p0, Lc/b/a/a/b;->c:I

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Ljava/io/OutputStream;->write([BII)V

    iput v3, p0, Lc/b/a/a/b;->c:I

    return-void

    :cond_0
    new-instance p0, Lc/b/a/a/b$a;

    invoke-direct {p0}, Lc/b/a/a/b$a;-><init>()V

    throw p0
.end method

.method public static d(I)I
    .locals 0

    if-ltz p0, :cond_0

    invoke-static {p0}, Lc/b/a/a/b;->e(I)I

    move-result p0

    return p0

    :cond_0
    const/16 p0, 0xa

    return p0
.end method

.method public static d(J)I
    .locals 0

    invoke-static {p0, p1}, Lc/b/a/a/b;->c(J)I

    move-result p0

    return p0
.end method

.method public static e(I)I
    .locals 1

    and-int/lit8 v0, p0, -0x80

    if-nez v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    and-int/lit16 v0, p0, -0x4000

    if-nez v0, :cond_1

    const/4 p0, 0x2

    return p0

    :cond_1
    const/high16 v0, -0x200000

    and-int/2addr v0, p0

    if-nez v0, :cond_2

    const/4 p0, 0x3

    return p0

    :cond_2
    const/high16 v0, -0x10000000

    and-int/2addr p0, v0

    if-nez p0, :cond_3

    const/4 p0, 0x4

    return p0

    :cond_3
    const/4 p0, 0x5

    return p0
.end method

.method public static f(I)I
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lc/b/a/a/d;->a(II)I

    move-result p0

    invoke-static {p0}, Lc/b/a/a/b;->e(I)I

    move-result p0

    return p0
.end method


# virtual methods
.method public a()V
    .locals 1

    invoke-virtual {p0}, Lc/b/a/a/b;->b()I

    move-result p0

    if-nez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Did not write as much data as expected."

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public a(B)V
    .locals 3

    iget v0, p0, Lc/b/a/a/b;->c:I

    iget v1, p0, Lc/b/a/a/b;->b:I

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, Lc/b/a/a/b;->c()V

    :cond_0
    iget-object v0, p0, Lc/b/a/a/b;->a:[B

    iget v1, p0, Lc/b/a/a/b;->c:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lc/b/a/a/b;->c:I

    aput-byte p1, v0, v1

    return-void
.end method

.method public a(I)V
    .locals 2

    if-ltz p1, :cond_0

    invoke-virtual {p0, p1}, Lc/b/a/a/b;->c(I)V

    goto :goto_0

    :cond_0
    int-to-long v0, p1

    invoke-virtual {p0, v0, v1}, Lc/b/a/a/b;->a(J)V

    :goto_0
    return-void
.end method

.method public a(II)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lc/b/a/a/b;->b(II)V

    invoke-virtual {p0, p2}, Lc/b/a/a/b;->a(I)V

    return-void
.end method

.method public a(IJ)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lc/b/a/a/b;->b(II)V

    invoke-virtual {p0, p2, p3}, Lc/b/a/a/b;->b(J)V

    return-void
.end method

.method public a(ILc/b/a/a/a;)V
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Lc/b/a/a/b;->b(II)V

    invoke-virtual {p0, p2}, Lc/b/a/a/b;->a(Lc/b/a/a/a;)V

    return-void
.end method

.method public a(ILc/b/a/a/c;)V
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Lc/b/a/a/b;->b(II)V

    invoke-virtual {p0, p2}, Lc/b/a/a/b;->a(Lc/b/a/a/c;)V

    return-void
.end method

.method public a(J)V
    .locals 4

    :goto_0
    const-wide/16 v0, -0x80

    and-long/2addr v0, p1

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    long-to-int p1, p1

    invoke-virtual {p0, p1}, Lc/b/a/a/b;->b(I)V

    return-void

    :cond_0
    long-to-int v0, p1

    and-int/lit8 v0, v0, 0x7f

    or-int/lit16 v0, v0, 0x80

    invoke-virtual {p0, v0}, Lc/b/a/a/b;->b(I)V

    const/4 v0, 0x7

    ushr-long/2addr p1, v0

    goto :goto_0
.end method

.method public a(Lc/b/a/a/a;)V
    .locals 1

    invoke-virtual {p1}, Lc/b/a/a/a;->b()[B

    move-result-object p1

    array-length v0, p1

    invoke-virtual {p0, v0}, Lc/b/a/a/b;->c(I)V

    invoke-virtual {p0, p1}, Lc/b/a/a/b;->a([B)V

    return-void
.end method

.method public a(Lc/b/a/a/c;)V
    .locals 1

    invoke-virtual {p1}, Lc/b/a/a/c;->a()I

    move-result v0

    invoke-virtual {p0, v0}, Lc/b/a/a/b;->c(I)V

    invoke-virtual {p1, p0}, Lc/b/a/a/c;->a(Lc/b/a/a/b;)V

    return-void
.end method

.method public a([B)V
    .locals 2

    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lc/b/a/a/b;->a([BII)V

    return-void
.end method

.method public a([BII)V
    .locals 3

    iget v0, p0, Lc/b/a/a/b;->b:I

    iget v1, p0, Lc/b/a/a/b;->c:I

    sub-int v2, v0, v1

    if-lt v2, p3, :cond_0

    iget-object v0, p0, Lc/b/a/a/b;->a:[B

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lc/b/a/a/b;->c:I

    add-int/2addr p1, p3

    iput p1, p0, Lc/b/a/a/b;->c:I

    goto :goto_0

    :cond_0
    sub-int/2addr v0, v1

    iget-object v2, p0, Lc/b/a/a/b;->a:[B

    invoke-static {p1, p2, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr p2, v0

    sub-int/2addr p3, v0

    iget v0, p0, Lc/b/a/a/b;->b:I

    iput v0, p0, Lc/b/a/a/b;->c:I

    invoke-direct {p0}, Lc/b/a/a/b;->c()V

    iget v0, p0, Lc/b/a/a/b;->b:I

    if-gt p3, v0, :cond_1

    iget-object v0, p0, Lc/b/a/a/b;->a:[B

    const/4 v1, 0x0

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput p3, p0, Lc/b/a/a/b;->c:I

    goto :goto_0

    :cond_1
    iget-object p0, p0, Lc/b/a/a/b;->d:Ljava/io/OutputStream;

    invoke-virtual {p0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    :goto_0
    return-void
.end method

.method public b()I
    .locals 1

    iget-object v0, p0, Lc/b/a/a/b;->d:Ljava/io/OutputStream;

    if-nez v0, :cond_0

    iget v0, p0, Lc/b/a/a/b;->b:I

    iget p0, p0, Lc/b/a/a/b;->c:I

    sub-int/2addr v0, p0

    return v0

    :cond_0
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string v0, "spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array."

    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public b(I)V
    .locals 0

    int-to-byte p1, p1

    invoke-virtual {p0, p1}, Lc/b/a/a/b;->a(B)V

    return-void
.end method

.method public b(II)V
    .locals 0

    invoke-static {p1, p2}, Lc/b/a/a/d;->a(II)I

    move-result p1

    invoke-virtual {p0, p1}, Lc/b/a/a/b;->c(I)V

    return-void
.end method

.method public b(J)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lc/b/a/a/b;->a(J)V

    return-void
.end method

.method public c(I)V
    .locals 1

    :goto_0
    and-int/lit8 v0, p1, -0x80

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lc/b/a/a/b;->b(I)V

    return-void

    :cond_0
    and-int/lit8 v0, p1, 0x7f

    or-int/lit16 v0, v0, 0x80

    invoke-virtual {p0, v0}, Lc/b/a/a/b;->b(I)V

    ushr-int/lit8 p1, p1, 0x7

    goto :goto_0
.end method
