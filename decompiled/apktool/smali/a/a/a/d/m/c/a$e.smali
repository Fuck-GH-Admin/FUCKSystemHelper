.class public La/a/a/d/m/c/a$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/d/m/c/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:La/a/a/d/m/c/a$b;

.field public e:La/a/a/d/m/c/a$b;

.field public f:La/a/a/d/m/c/a$b;

.field public g:La/a/a/d/m/c/a$b;

.field public h:[[S

.field public i:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p1, "0|3"

    iput-object p1, p0, La/a/a/d/m/c/a$e;->c:Ljava/lang/String;

    iget-object p1, p0, La/a/a/d/m/c/a$e;->e:La/a/a/d/m/c/a$b;

    iput-object p1, p0, La/a/a/d/m/c/a$e;->g:La/a/a/d/m/c/a$b;

    const-string p1, "gcj02"

    iput-object p1, p0, La/a/a/d/m/c/a$e;->i:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(D)D
    .locals 2

    iget-object p0, p0, La/a/a/d/m/c/a$e;->g:La/a/a/d/m/c/a$b;

    iget-wide v0, p0, La/a/a/d/m/c/a$b;->f:D

    add-double/2addr p1, v0

    iget-wide v0, p0, La/a/a/d/m/c/a$b;->e:D

    mul-double/2addr p1, v0

    return-wide p1
.end method

.method public a()La/a/a/d/m/c/a$b;
    .locals 0

    iget-object p0, p0, La/a/a/d/m/c/a$e;->g:La/a/a/d/m/c/a$b;

    return-object p0
.end method

.method public a(Ljava/lang/String;)V
    .locals 7

    const-string v0, "\\t"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    aget-object v1, p1, v0

    iput-object v1, p0, La/a/a/d/m/c/a$e;->b:Ljava/lang/String;

    new-instance v1, La/a/a/d/m/c/a$b;

    const/4 v2, 0x2

    aget-object v3, p1, v2

    invoke-direct {v1, v3}, La/a/a/d/m/c/a$b;-><init>(Ljava/lang/String;)V

    iput-object v1, p0, La/a/a/d/m/c/a$e;->d:La/a/a/d/m/c/a$b;

    new-instance v1, La/a/a/d/m/c/a$b;

    const/4 v3, 0x3

    aget-object v3, p1, v3

    invoke-direct {v1, v3}, La/a/a/d/m/c/a$b;-><init>(Ljava/lang/String;)V

    iput-object v1, p0, La/a/a/d/m/c/a$e;->f:La/a/a/d/m/c/a$b;

    new-instance v1, La/a/a/d/m/c/a$b;

    const/4 v3, 0x4

    aget-object v3, p1, v3

    invoke-direct {v1, v3}, La/a/a/d/m/c/a$b;-><init>(Ljava/lang/String;)V

    iput-object v1, p0, La/a/a/d/m/c/a$e;->e:La/a/a/d/m/c/a$b;

    iput-object v1, p0, La/a/a/d/m/c/a$e;->g:La/a/a/d/m/c/a$b;

    iget-wide v3, v1, La/a/a/d/m/c/a$b;->g:D

    double-to-int v3, v3

    iget-wide v4, v1, La/a/a/d/m/c/a$b;->h:D

    double-to-int v1, v4

    new-array v2, v2, [I

    aput v1, v2, v0

    const/4 v0, 0x0

    aput v3, v2, v0

    const-class v1, S

    invoke-static {v1, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [[S

    iput-object v1, p0, La/a/a/d/m/c/a$e;->h:[[S

    move v1, v0

    :goto_0
    int-to-double v2, v1

    iget-object v4, p0, La/a/a/d/m/c/a$e;->g:La/a/a/d/m/c/a$b;

    iget-wide v4, v4, La/a/a/d/m/c/a$b;->g:D

    cmpg-double v2, v2, v4

    if-gez v2, :cond_1

    move v2, v0

    :goto_1
    int-to-double v3, v2

    iget-object v5, p0, La/a/a/d/m/c/a$e;->g:La/a/a/d/m/c/a$b;

    iget-wide v5, v5, La/a/a/d/m/c/a$b;->h:D

    cmpg-double v3, v3, v5

    if-gez v3, :cond_0

    double-to-int v3, v5

    mul-int/2addr v3, v1

    add-int/2addr v3, v2

    iget-object v4, p0, La/a/a/d/m/c/a$e;->h:[[S

    aget-object v4, v4, v1

    const/4 v5, 0x5

    aget-object v5, p1, v5

    invoke-virtual {v5, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    add-int/lit8 v3, v3, -0x30

    int-to-short v3, v3

    aput-short v3, v4, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    array-length v0, p1

    const/4 v1, 0x7

    if-lt v0, v1, :cond_2

    const/4 v0, 0x6

    aget-object p1, p1, v0

    iput-object p1, p0, La/a/a/d/m/c/a$e;->c:Ljava/lang/String;

    :cond_2
    return-void
.end method

.method public b(D)D
    .locals 2

    iget-object p0, p0, La/a/a/d/m/c/a$e;->g:La/a/a/d/m/c/a$b;

    iget-wide v0, p0, La/a/a/d/m/c/a$b;->d:D

    add-double/2addr p1, v0

    iget-wide v0, p0, La/a/a/d/m/c/a$b;->c:D

    mul-double/2addr p1, v0

    return-wide p1
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, La/a/a/d/m/c/a$e;->i:Ljava/lang/String;

    const-string v0, "wgs84"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, La/a/a/d/m/c/a$e;->d:La/a/a/d/m/c/a$b;

    :goto_0
    iput-object p1, p0, La/a/a/d/m/c/a$e;->g:La/a/a/d/m/c/a$b;

    goto :goto_1

    :cond_0
    iget-object p1, p0, La/a/a/d/m/c/a$e;->i:Ljava/lang/String;

    const-string v0, "bd09"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, La/a/a/d/m/c/a$e;->f:La/a/a/d/m/c/a$b;

    goto :goto_0

    :cond_1
    iget-object p1, p0, La/a/a/d/m/c/a$e;->i:Ljava/lang/String;

    const-string v0, "gcj02"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, La/a/a/d/m/c/a$e;->e:La/a/a/d/m/c/a$b;

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public c(D)D
    .locals 2

    iget-object p0, p0, La/a/a/d/m/c/a$e;->g:La/a/a/d/m/c/a$b;

    iget-wide v0, p0, La/a/a/d/m/c/a$b;->c:D

    div-double/2addr p1, v0

    iget-wide v0, p0, La/a/a/d/m/c/a$b;->d:D

    sub-double/2addr p1, v0

    return-wide p1
.end method

.method public d(D)D
    .locals 2

    iget-object p0, p0, La/a/a/d/m/c/a$e;->g:La/a/a/d/m/c/a$b;

    iget-wide v0, p0, La/a/a/d/m/c/a$b;->e:D

    div-double/2addr p1, v0

    iget-wide v0, p0, La/a/a/d/m/c/a$b;->f:D

    sub-double/2addr p1, v0

    return-wide p1
.end method
