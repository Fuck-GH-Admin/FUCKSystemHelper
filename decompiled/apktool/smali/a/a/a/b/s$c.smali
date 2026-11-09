.class public La/a/a/b/s$c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/b/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public a:Z

.field public b:Z

.field public c:J

.field public d:I

.field public e:I

.field public f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public h:I

.field public i:D

.field public j:D

.field public k:D

.field public l:I

.field public m:La/a/a/b/s$b;

.field public final synthetic n:La/a/a/b/s;


# direct methods
.method public constructor <init>(La/a/a/b/s;II)V
    .locals 2

    iput-object p1, p0, La/a/a/b/s$c;->n:La/a/a/b/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p2, p3}, La/a/a/b/s$c;->a(II)V

    const/4 p2, 0x0

    iput p2, p0, La/a/a/b/s$c;->h:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, La/a/a/b/s$c;->i:D

    iput-wide v0, p0, La/a/a/b/s$c;->j:D

    iput-wide v0, p0, La/a/a/b/s$c;->k:D

    iput p2, p0, La/a/a/b/s$c;->l:I

    new-instance p2, La/a/a/b/s$b;

    invoke-direct {p2, p1}, La/a/a/b/s$b;-><init>(La/a/a/b/s;)V

    iput-object p2, p0, La/a/a/b/s$c;->m:La/a/a/b/s$b;

    return-void
.end method

.method public static synthetic a(La/a/a/b/s$c;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, La/a/a/b/s$c;->c()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(La/a/a/b/s$c;Landroid/location/GnssNavigationMessage;J)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, La/a/a/b/s$c;->a(Landroid/location/GnssNavigationMessage;J)V

    return-void
.end method


# virtual methods
.method public final a(ID)La/a/a/b/s$b;
    .locals 2

    invoke-static {}, La/a/a/b/s;->b()[D

    move-result-object v0

    invoke-virtual {p0, v0}, La/a/a/b/s$c;->a([D)La/a/a/b/s$b;

    move-result-object p0

    const-wide v0, -0x3e32329b00000000L    # -1.0E9

    cmpg-double v0, p2, v0

    if-ltz v0, :cond_0

    const-wide v0, 0x41cdcd6500000000L    # 1.0E9

    cmpg-double v0, v0, p2

    if-gez v0, :cond_1

    :cond_0
    const-wide/16 p2, 0x0

    :cond_1
    iget v0, p0, La/a/a/b/s$b;->a:I

    const v1, 0x93a80

    mul-int/2addr p1, v1

    double-to-int v1, p2

    add-int/2addr p1, v1

    add-int/2addr v0, p1

    iput v0, p0, La/a/a/b/s$b;->a:I

    int-to-double v0, v1

    sub-double/2addr p2, v0

    iput-wide p2, p0, La/a/a/b/s$b;->b:D

    return-object p0
.end method

.method public final a([D)La/a/a/b/s$b;
    .locals 10

    const/16 v0, 0xc

    new-array v1, v0, [I

    fill-array-data v1, :array_0

    new-instance v2, La/a/a/b/s$b;

    iget-object p0, p0, La/a/a/b/s$c;->n:La/a/a/b/s;

    invoke-direct {v2, p0}, La/a/a/b/s$b;-><init>(La/a/a/b/s;)V

    const/4 p0, 0x0

    aget-wide v3, p1, p0

    double-to-int v3, v3

    const/4 v4, 0x1

    aget-wide v5, p1, v4

    double-to-int v5, v5

    const/4 v6, 0x2

    aget-wide v7, p1, v6

    double-to-int v7, v7

    const/16 v8, 0x7b2

    if-lt v3, v8, :cond_2

    const/16 v8, 0x833

    if-lt v8, v3, :cond_2

    if-lt v5, v4, :cond_2

    if-ge v0, v5, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit16 v0, v3, -0x7b2

    mul-int/lit16 v0, v0, 0x16d

    add-int/lit16 v8, v3, -0x7b1

    const/4 v9, 0x4

    div-int/2addr v8, v9

    add-int/2addr v0, v8

    add-int/lit8 v8, v5, -0x1

    aget v1, v1, v8

    add-int/2addr v0, v1

    add-int/2addr v0, v7

    sub-int/2addr v0, v6

    rem-int/2addr v3, v9

    const/4 v1, 0x3

    if-nez v3, :cond_1

    if-lt v5, v1, :cond_1

    move p0, v4

    :cond_1
    add-int/2addr v0, p0

    const/4 p0, 0x5

    aget-wide v3, p1, p0

    invoke-static {v3, v4}, Ljava/lang/Math;->floor(D)D

    move-result-wide v3

    double-to-int v3, v3

    const v4, 0x15180

    mul-int/2addr v0, v4

    aget-wide v4, p1, v1

    double-to-int v1, v4

    mul-int/lit16 v1, v1, 0xe10

    add-int/2addr v0, v1

    aget-wide v4, p1, v9

    double-to-int v1, v4

    mul-int/lit8 v1, v1, 0x3c

    add-int/2addr v0, v1

    add-int/2addr v0, v3

    iput v0, v2, La/a/a/b/s$b;->a:I

    aget-wide p0, p1, p0

    int-to-double v0, v3

    sub-double/2addr p0, v0

    iput-wide p0, v2, La/a/a/b/s$b;->b:D

    :cond_2
    :goto_0
    return-object v2

    nop

    :array_0
    .array-data 4
        0x1
        0x20
        0x3c
        0x5b
        0x79
        0x98
        0xb6
        0xd5
        0xf4
        0x112
        0x131
        0x14f
    .end array-data
.end method

.method public final a(Landroid/location/GnssNavigationMessage;)Ljava/lang/String;
    .locals 6
    .annotation build Landroid/annotation/TargetApi;
        value = 0x18
    .end annotation

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/location/GnssNavigationMessage;->getData()[B

    move-result-object p1

    array-length v0, p1

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_0

    aget-byte v3, p1, v2

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    and-int/lit16 v3, v3, 0xff

    invoke-static {v3}, Ljava/lang/Integer;->toBinaryString(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v4, v1

    const-string v3, "%8s"

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x20

    const/16 v5, 0x30

    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final a()V
    .locals 5

    iget-object v0, p0, La/a/a/b/s$c;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    move v0, v1

    :goto_0
    iget-object v3, p0, La/a/a/b/s$c;->f:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v0, v3, :cond_1

    iget-object v3, p0, La/a/a/b/s$c;->f:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v4, "None"

    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    move v0, v2

    goto :goto_2

    :cond_2
    :goto_1
    move v0, v1

    :goto_2
    if-eqz v0, :cond_3

    iput-boolean v2, p0, La/a/a/b/s$c;->b:Z

    goto :goto_3

    :cond_3
    iput-boolean v1, p0, La/a/a/b/s$c;->b:Z

    :goto_3
    return-void
.end method

.method public final a(II)V
    .locals 5

    iget v0, p0, La/a/a/b/s$c;->e:I

    const/16 v1, 0x101

    const/4 v2, 0x0

    if-eq v0, v1, :cond_3

    const/16 v1, 0x301

    if-eq v0, v1, :cond_3

    const/16 v1, 0x601

    if-eq v0, v1, :cond_2

    const/16 v1, 0x501

    if-eq v0, v1, :cond_1

    const/16 v1, 0x502

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/16 v0, 0xa

    goto :goto_0

    :cond_1
    const/4 v0, 0x3

    goto :goto_0

    :cond_2
    const/4 v0, 0x6

    goto :goto_0

    :cond_3
    const/4 v0, 0x5

    :goto_0
    iget-object v1, p0, La/a/a/b/s$c;->f:Ljava/util/ArrayList;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    goto :goto_1

    :cond_4
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, La/a/a/b/s$c;->f:Ljava/util/ArrayList;

    :goto_1
    iget-object v1, p0, La/a/a/b/s$c;->g:Ljava/util/ArrayList;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    goto :goto_2

    :cond_5
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, La/a/a/b/s$c;->g:Ljava/util/ArrayList;

    :goto_2
    move v1, v2

    :goto_3
    if-ge v1, v0, :cond_6

    iget-object v3, p0, La/a/a/b/s$c;->f:Ljava/util/ArrayList;

    const-string v4, "None"

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_6
    iput p1, p0, La/a/a/b/s$c;->d:I

    iput p2, p0, La/a/a/b/s$c;->e:I

    iput-boolean v2, p0, La/a/a/b/s$c;->a:Z

    iput-boolean v2, p0, La/a/a/b/s$c;->b:Z

    const-wide/16 p1, 0x0

    iput-wide p1, p0, La/a/a/b/s$c;->c:J

    return-void
.end method

.method public final a(Landroid/location/GnssNavigationMessage;J)V
    .locals 16
    .annotation build Landroid/annotation/TargetApi;
        value = 0x18
    .end annotation

    move-object/from16 v0, p0

    move-wide/from16 v1, p2

    invoke-virtual/range {p1 .. p1}, Landroid/location/GnssNavigationMessage;->getType()I

    move-result v3

    invoke-virtual/range {p1 .. p1}, Landroid/location/GnssNavigationMessage;->getSvid()I

    move-result v4

    invoke-virtual/range {p1 .. p1}, Landroid/location/GnssNavigationMessage;->getSubmessageId()I

    move-result v5

    invoke-virtual/range {p1 .. p1}, Landroid/location/GnssNavigationMessage;->getData()[B

    move-result-object v6

    iget-wide v7, v0, La/a/a/b/s$c;->c:J

    sub-long v7, v1, v7

    const-wide/16 v9, 0x4b0

    cmp-long v7, v7, v9

    if-gtz v7, :cond_0

    iget-boolean v7, v0, La/a/a/b/s$c;->a:Z

    if-nez v7, :cond_0

    iget-object v7, v0, La/a/a/b/s$c;->f:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-eqz v7, :cond_0

    iget v7, v0, La/a/a/b/s$c;->e:I

    if-ne v3, v7, :cond_0

    iget v7, v0, La/a/a/b/s$c;->d:I

    if-eq v4, v7, :cond_1

    :cond_0
    invoke-virtual {v0, v4, v3}, La/a/a/b/s$c;->a(II)V

    :cond_1
    const/16 v7, 0x501

    const/16 v8, 0x502

    if-eq v3, v8, :cond_2

    if-ne v3, v7, :cond_3

    :cond_2
    invoke-virtual/range {p0 .. p0}, La/a/a/b/s$c;->b()Z

    move-result v9

    if-nez v9, :cond_3

    invoke-virtual {v0, v4, v3}, La/a/a/b/s$c;->a(II)V

    :cond_3
    iget-object v4, v0, La/a/a/b/s$c;->f:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-nez v4, :cond_4

    return-void

    :cond_4
    iget v4, v0, La/a/a/b/s$c;->e:I

    const/16 v9, 0x601

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-ne v4, v9, :cond_5

    move v12, v10

    goto :goto_0

    :cond_5
    move v12, v11

    :goto_0
    if-ne v4, v8, :cond_7

    if-ne v5, v11, :cond_6

    invoke-virtual/range {p0 .. p1}, La/a/a/b/s$c;->b(Landroid/location/GnssNavigationMessage;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, La/a/a/b/s$c;->a(Ljava/lang/String;)V

    iget v5, v0, La/a/a/b/s$c;->l:I

    goto :goto_1

    :cond_6
    return-void

    :cond_7
    :goto_1
    sub-int/2addr v5, v12

    iget-object v4, v0, La/a/a/b/s$c;->f:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-lt v5, v4, :cond_8

    return-void

    :cond_8
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    array-length v12, v6

    move v13, v10

    :goto_2
    if-ge v13, v12, :cond_a

    aget-byte v14, v6, v13

    if-eqz v11, :cond_9

    move v11, v10

    goto :goto_3

    :cond_9
    const/16 v15, 0x2c

    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_3
    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    add-int/lit8 v13, v13, 0x1

    goto :goto_2

    :cond_a
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object v6, v0, La/a/a/b/s$c;->f:Ljava/util/ArrayList;

    invoke-virtual {v6, v5, v4}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    if-eq v3, v7, :cond_b

    if-ne v3, v8, :cond_c

    :cond_b
    iget-object v3, v0, La/a/a/b/s$c;->g:Ljava/util/ArrayList;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_c
    iget v3, v0, La/a/a/b/s$c;->e:I

    if-ne v3, v9, :cond_d

    invoke-virtual/range {p0 .. p1}, La/a/a/b/s$c;->a(Landroid/location/GnssNavigationMessage;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, La/a/a/b/s$c;->b(Ljava/lang/String;)V

    :cond_d
    invoke-virtual/range {p0 .. p0}, La/a/a/b/s$c;->a()V

    iput-wide v1, v0, La/a/a/b/s$c;->c:J

    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 2

    const/16 v0, 0x2a

    const/16 v1, 0x2e

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x2

    invoke-static {p1, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, La/a/a/b/s$c;->l:I

    return-void
.end method

.method public final b(Landroid/location/GnssNavigationMessage;)Ljava/lang/String;
    .locals 6
    .annotation build Landroid/annotation/TargetApi;
        value = 0x18
    .end annotation

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/location/GnssNavigationMessage;->getData()[B

    move-result-object p1

    array-length v0, p1

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    aget-byte v3, p1, v2

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    and-int/lit16 v3, v3, 0xff

    invoke-static {v3}, Ljava/lang/Integer;->toBinaryString(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v4, v1

    const-string v3, "%8s"

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x20

    const/16 v5, 0x30

    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v3

    rem-int/lit8 v4, v2, 0x4

    if-nez v4, :cond_0

    const/4 v4, 0x2

    const/16 v5, 0x8

    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    :cond_0
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final b(Ljava/lang/String;)V
    .locals 7

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x78

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x7a

    const/16 v4, 0x30

    const/16 v5, 0x31

    const/4 v6, 0x2

    if-ne v1, v5, :cond_0

    if-ne v2, v4, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v2, 0x12

    invoke-virtual {p1, v6, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0xea

    :goto_0
    invoke-virtual {p1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_0
    if-ne v1, v4, :cond_3

    if-ne v2, v5, :cond_3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v2, 0x72

    invoke-virtual {p1, v6, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x8a

    goto :goto_0

    :goto_1
    const/4 v1, 0x6

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, La/a/a/b/s$c;->e(Ljava/lang/String;)V

    goto :goto_2

    :cond_1
    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    invoke-virtual {p0, p1}, La/a/a/b/s$c;->d(Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    const/4 v1, 0x4

    if-ne v0, v1, :cond_3

    invoke-virtual {p0, p1}, La/a/a/b/s$c;->c(Ljava/lang/String;)V

    :cond_3
    :goto_2
    return-void
.end method

.method public final b()Z
    .locals 3

    iget-object v0, p0, La/a/a/b/s$c;->g:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    move v0, v1

    :goto_0
    iget-object v2, p0, La/a/a/b/s$c;->g:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_2

    iget-object v2, p0, La/a/a/b/s$c;->g:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-eq v2, v0, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v1, 0x1

    :goto_1
    return v1
.end method

.method public final c()Ljava/lang/String;
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-boolean v1, p0, La/a/a/b/s$c;->b:Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    iget v1, p0, La/a/a/b/s$c;->e:I

    const/16 v2, 0x601

    if-ne v1, v2, :cond_1

    invoke-virtual {p0}, La/a/a/b/s$c;->d()V

    :cond_1
    iget-object v1, p0, La/a/a/b/s$c;->m:La/a/a/b/s$b;

    iget v1, v1, La/a/a/b/s$b;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7c

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    const/4 v2, 0x1

    move v3, v1

    move v4, v2

    :goto_0
    iget-object v5, p0, La/a/a/b/s$c;->f:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v3, v5, :cond_3

    if-eqz v4, :cond_2

    move v4, v1

    goto :goto_1

    :cond_2
    const/16 v5, 0x2c

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_1
    iget-object v5, p0, La/a/a/b/s$c;->f:Ljava/util/ArrayList;

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    iput-boolean v2, p0, La/a/a/b/s$c;->a:Z

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final c(Ljava/lang/String;)V
    .locals 4

    const/16 v0, 0x36

    const/16 v1, 0x44

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x2

    invoke-static {p1, v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    long-to-double v0, v0

    iput-wide v0, p0, La/a/a/b/s$c;->k:D

    return-void
.end method

.method public final d()V
    .locals 6

    iget v0, p0, La/a/a/b/s$c;->h:I

    iget-wide v1, p0, La/a/a/b/s$c;->i:D

    invoke-virtual {p0, v0, v1, v2}, La/a/a/b/s$c;->a(ID)La/a/a/b/s$b;

    move-result-object v0

    iget v1, p0, La/a/a/b/s$c;->h:I

    iget-wide v2, p0, La/a/a/b/s$c;->j:D

    invoke-virtual {p0, v1, v2, v3}, La/a/a/b/s$c;->a(ID)La/a/a/b/s$b;

    move-result-object v1

    iget v2, v1, La/a/a/b/s$b;->a:I

    iget v3, v0, La/a/a/b/s$b;->a:I

    sub-int/2addr v2, v3

    int-to-double v2, v2

    iget-wide v4, v1, La/a/a/b/s$b;->b:D

    add-double/2addr v2, v4

    iget-wide v0, v0, La/a/a/b/s$b;->b:D

    sub-double/2addr v2, v0

    const-wide v0, 0x4112750000000000L    # 302400.0

    cmpl-double v0, v2, v0

    if-lez v0, :cond_0

    iget v0, p0, La/a/a/b/s$c;->h:I

    add-int/lit8 v0, v0, -0x1

    :goto_0
    iput v0, p0, La/a/a/b/s$c;->h:I

    goto :goto_1

    :cond_0
    const-wide v0, -0x3eed8b0000000000L    # -302400.0

    cmpg-double v0, v2, v0

    if-gez v0, :cond_1

    iget v0, p0, La/a/a/b/s$c;->h:I

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    iget v0, p0, La/a/a/b/s$c;->h:I

    iget-wide v1, p0, La/a/a/b/s$c;->k:D

    invoke-virtual {p0, v0, v1, v2}, La/a/a/b/s$c;->a(ID)La/a/a/b/s$b;

    move-result-object v0

    iput-object v0, p0, La/a/a/b/s$c;->m:La/a/a/b/s$b;

    return-void
.end method

.method public final d(Ljava/lang/String;)V
    .locals 4

    const/16 v0, 0x10

    const/16 v1, 0x1e

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x2

    invoke-static {p1, v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    long-to-double v0, v0

    const-wide/high16 v2, 0x404e000000000000L    # 60.0

    mul-double/2addr v0, v2

    iput-wide v0, p0, La/a/a/b/s$c;->j:D

    return-void
.end method

.method public final e(Ljava/lang/String;)V
    .locals 3

    const/16 v0, 0x6c

    const/16 v1, 0x60

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    iput v1, p0, La/a/a/b/s$c;->h:I

    const/16 v1, 0x80

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    long-to-double v0, v0

    iput-wide v0, p0, La/a/a/b/s$c;->i:D

    return-void
.end method
