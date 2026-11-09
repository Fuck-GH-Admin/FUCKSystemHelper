.class public Landroid/support/constraint/n/d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/constraint/n/d$a;,
        Landroid/support/constraint/n/d$b;
    }
.end annotation


# static fields
.field public static r:Z = false

.field public static s:Z = true

.field public static t:Z = true

.field public static u:Z = true

.field public static v:Z = false

.field private static w:I = 0x3e8

.field public static x:Landroid/support/constraint/n/e;

.field public static y:J

.field public static z:J


# instance fields
.field public a:Z

.field b:I

.field private c:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Landroid/support/constraint/n/i;",
            ">;"
        }
    .end annotation
.end field

.field private d:Landroid/support/constraint/n/d$a;

.field private e:I

.field private f:I

.field g:[Landroid/support/constraint/n/b;

.field public h:Z

.field public i:Z

.field private j:[Z

.field k:I

.field l:I

.field private m:I

.field final n:Landroid/support/constraint/n/c;

.field private o:[Landroid/support/constraint/n/i;

.field private p:I

.field private q:Landroid/support/constraint/n/d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/constraint/n/d;->a:Z

    iput v0, p0, Landroid/support/constraint/n/d;->b:I

    const/4 v1, 0x0

    iput-object v1, p0, Landroid/support/constraint/n/d;->c:Ljava/util/HashMap;

    const/16 v2, 0x20

    iput v2, p0, Landroid/support/constraint/n/d;->e:I

    iput v2, p0, Landroid/support/constraint/n/d;->f:I

    iput-object v1, p0, Landroid/support/constraint/n/d;->g:[Landroid/support/constraint/n/b;

    iput-boolean v0, p0, Landroid/support/constraint/n/d;->h:Z

    iput-boolean v0, p0, Landroid/support/constraint/n/d;->i:Z

    new-array v1, v2, [Z

    iput-object v1, p0, Landroid/support/constraint/n/d;->j:[Z

    const/4 v1, 0x1

    iput v1, p0, Landroid/support/constraint/n/d;->k:I

    iput v0, p0, Landroid/support/constraint/n/d;->l:I

    iput v2, p0, Landroid/support/constraint/n/d;->m:I

    sget v1, Landroid/support/constraint/n/d;->w:I

    new-array v1, v1, [Landroid/support/constraint/n/i;

    iput-object v1, p0, Landroid/support/constraint/n/d;->o:[Landroid/support/constraint/n/i;

    iput v0, p0, Landroid/support/constraint/n/d;->p:I

    new-array v0, v2, [Landroid/support/constraint/n/b;

    iput-object v0, p0, Landroid/support/constraint/n/d;->g:[Landroid/support/constraint/n/b;

    invoke-direct {p0}, Landroid/support/constraint/n/d;->j()V

    new-instance v0, Landroid/support/constraint/n/c;

    invoke-direct {v0}, Landroid/support/constraint/n/c;-><init>()V

    iput-object v0, p0, Landroid/support/constraint/n/d;->n:Landroid/support/constraint/n/c;

    new-instance v1, Landroid/support/constraint/n/h;

    invoke-direct {v1, v0}, Landroid/support/constraint/n/h;-><init>(Landroid/support/constraint/n/c;)V

    iput-object v1, p0, Landroid/support/constraint/n/d;->d:Landroid/support/constraint/n/d$a;

    sget-boolean v0, Landroid/support/constraint/n/d;->v:Z

    if-eqz v0, :cond_0

    new-instance v0, Landroid/support/constraint/n/d$b;

    iget-object v1, p0, Landroid/support/constraint/n/d;->n:Landroid/support/constraint/n/c;

    invoke-direct {v0, p0, v1}, Landroid/support/constraint/n/d$b;-><init>(Landroid/support/constraint/n/d;Landroid/support/constraint/n/c;)V

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/support/constraint/n/b;

    iget-object v1, p0, Landroid/support/constraint/n/d;->n:Landroid/support/constraint/n/c;

    invoke-direct {v0, v1}, Landroid/support/constraint/n/b;-><init>(Landroid/support/constraint/n/c;)V

    :goto_0
    iput-object v0, p0, Landroid/support/constraint/n/d;->q:Landroid/support/constraint/n/d$a;

    return-void
.end method

.method private final a(Landroid/support/constraint/n/d$a;Z)I
    .locals 12

    sget-object p2, Landroid/support/constraint/n/d;->x:Landroid/support/constraint/n/e;

    const-wide/16 v0, 0x1

    if-eqz p2, :cond_0

    iget-wide v2, p2, Landroid/support/constraint/n/e;->h:J

    add-long/2addr v2, v0

    iput-wide v2, p2, Landroid/support/constraint/n/e;->h:J

    :cond_0
    const/4 p2, 0x0

    move v2, p2

    :goto_0
    iget v3, p0, Landroid/support/constraint/n/d;->k:I

    if-ge v2, v3, :cond_1

    iget-object v3, p0, Landroid/support/constraint/n/d;->j:[Z

    aput-boolean p2, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    move v2, p2

    move v3, v2

    :cond_2
    :goto_1
    if-nez v2, :cond_e

    sget-object v4, Landroid/support/constraint/n/d;->x:Landroid/support/constraint/n/e;

    if-eqz v4, :cond_3

    iget-wide v5, v4, Landroid/support/constraint/n/e;->i:J

    add-long/2addr v5, v0

    iput-wide v5, v4, Landroid/support/constraint/n/e;->i:J

    :cond_3
    add-int/lit8 v3, v3, 0x1

    iget v4, p0, Landroid/support/constraint/n/d;->k:I

    mul-int/lit8 v4, v4, 0x2

    if-lt v3, v4, :cond_4

    return v3

    :cond_4
    invoke-interface {p1}, Landroid/support/constraint/n/d$a;->getKey()Landroid/support/constraint/n/i;

    move-result-object v4

    const/4 v5, 0x1

    if-eqz v4, :cond_5

    iget-object v4, p0, Landroid/support/constraint/n/d;->j:[Z

    invoke-interface {p1}, Landroid/support/constraint/n/d$a;->getKey()Landroid/support/constraint/n/i;

    move-result-object v6

    iget v6, v6, Landroid/support/constraint/n/i;->c:I

    aput-boolean v5, v4, v6

    :cond_5
    iget-object v4, p0, Landroid/support/constraint/n/d;->j:[Z

    invoke-interface {p1, p0, v4}, Landroid/support/constraint/n/d$a;->a(Landroid/support/constraint/n/d;[Z)Landroid/support/constraint/n/i;

    move-result-object v4

    if-eqz v4, :cond_7

    iget-object v6, p0, Landroid/support/constraint/n/d;->j:[Z

    iget v7, v4, Landroid/support/constraint/n/i;->c:I

    aget-boolean v8, v6, v7

    if-eqz v8, :cond_6

    return v3

    :cond_6
    aput-boolean v5, v6, v7

    :cond_7
    if-eqz v4, :cond_d

    const v5, 0x7f7fffff    # Float.MAX_VALUE

    const/4 v6, -0x1

    move v7, p2

    move v8, v6

    :goto_2
    iget v9, p0, Landroid/support/constraint/n/d;->l:I

    if-ge v7, v9, :cond_b

    iget-object v9, p0, Landroid/support/constraint/n/d;->g:[Landroid/support/constraint/n/b;

    aget-object v9, v9, v7

    iget-object v10, v9, Landroid/support/constraint/n/b;->a:Landroid/support/constraint/n/i;

    iget-object v10, v10, Landroid/support/constraint/n/i;->j:Landroid/support/constraint/n/i$a;

    sget-object v11, Landroid/support/constraint/n/i$a;->b:Landroid/support/constraint/n/i$a;

    if-ne v10, v11, :cond_8

    goto :goto_3

    :cond_8
    iget-boolean v10, v9, Landroid/support/constraint/n/b;->f:Z

    if-eqz v10, :cond_9

    goto :goto_3

    :cond_9
    invoke-virtual {v9, v4}, Landroid/support/constraint/n/b;->b(Landroid/support/constraint/n/i;)Z

    move-result v10

    if-eqz v10, :cond_a

    iget-object v10, v9, Landroid/support/constraint/n/b;->e:Landroid/support/constraint/n/b$a;

    invoke-interface {v10, v4}, Landroid/support/constraint/n/b$a;->a(Landroid/support/constraint/n/i;)F

    move-result v10

    const/4 v11, 0x0

    cmpg-float v11, v10, v11

    if-gez v11, :cond_a

    iget v9, v9, Landroid/support/constraint/n/b;->b:F

    neg-float v9, v9

    div-float/2addr v9, v10

    cmpg-float v10, v9, v5

    if-gez v10, :cond_a

    move v8, v7

    move v5, v9

    :cond_a
    :goto_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_b
    if-le v8, v6, :cond_2

    iget-object v5, p0, Landroid/support/constraint/n/d;->g:[Landroid/support/constraint/n/b;

    aget-object v5, v5, v8

    iget-object v7, v5, Landroid/support/constraint/n/b;->a:Landroid/support/constraint/n/i;

    iput v6, v7, Landroid/support/constraint/n/i;->d:I

    sget-object v6, Landroid/support/constraint/n/d;->x:Landroid/support/constraint/n/e;

    if-eqz v6, :cond_c

    iget-wide v9, v6, Landroid/support/constraint/n/e;->j:J

    add-long/2addr v9, v0

    iput-wide v9, v6, Landroid/support/constraint/n/e;->j:J

    :cond_c
    invoke-virtual {v5, v4}, Landroid/support/constraint/n/b;->d(Landroid/support/constraint/n/i;)V

    iget-object v4, v5, Landroid/support/constraint/n/b;->a:Landroid/support/constraint/n/i;

    iput v8, v4, Landroid/support/constraint/n/i;->d:I

    invoke-virtual {v4, p0, v5}, Landroid/support/constraint/n/i;->a(Landroid/support/constraint/n/d;Landroid/support/constraint/n/b;)V

    goto/16 :goto_1

    :cond_d
    move v2, v5

    goto/16 :goto_1

    :cond_e
    return v3
.end method

.method public static a(Landroid/support/constraint/n/d;Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;F)Landroid/support/constraint/n/b;
    .locals 0

    invoke-virtual {p0}, Landroid/support/constraint/n/d;->b()Landroid/support/constraint/n/b;

    move-result-object p0

    invoke-virtual {p0, p1, p2, p3}, Landroid/support/constraint/n/b;->a(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;F)Landroid/support/constraint/n/b;

    return-object p0
.end method

.method private a(Landroid/support/constraint/n/i$a;Ljava/lang/String;)Landroid/support/constraint/n/i;
    .locals 2

    iget-object v0, p0, Landroid/support/constraint/n/d;->n:Landroid/support/constraint/n/c;

    iget-object v0, v0, Landroid/support/constraint/n/c;->c:Landroid/support/constraint/n/f;

    invoke-interface {v0}, Landroid/support/constraint/n/f;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/constraint/n/i;

    if-nez v0, :cond_0

    new-instance v0, Landroid/support/constraint/n/i;

    invoke-direct {v0, p1, p2}, Landroid/support/constraint/n/i;-><init>(Landroid/support/constraint/n/i$a;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/support/constraint/n/i;->a()V

    :goto_0
    invoke-virtual {v0, p1, p2}, Landroid/support/constraint/n/i;->a(Landroid/support/constraint/n/i$a;Ljava/lang/String;)V

    iget p1, p0, Landroid/support/constraint/n/d;->p:I

    sget p2, Landroid/support/constraint/n/d;->w:I

    if-lt p1, p2, :cond_1

    mul-int/lit8 p2, p2, 0x2

    sput p2, Landroid/support/constraint/n/d;->w:I

    iget-object p1, p0, Landroid/support/constraint/n/d;->o:[Landroid/support/constraint/n/i;

    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Landroid/support/constraint/n/i;

    iput-object p1, p0, Landroid/support/constraint/n/d;->o:[Landroid/support/constraint/n/i;

    :cond_1
    iget-object p1, p0, Landroid/support/constraint/n/d;->o:[Landroid/support/constraint/n/i;

    iget p2, p0, Landroid/support/constraint/n/d;->p:I

    add-int/lit8 v1, p2, 0x1

    iput v1, p0, Landroid/support/constraint/n/d;->p:I

    aput-object v0, p1, p2

    return-object v0
.end method

.method private b(Landroid/support/constraint/n/d$a;)I
    .locals 19

    move-object/from16 v0, p0

    const/4 v2, 0x0

    :goto_0
    iget v3, v0, Landroid/support/constraint/n/d;->l:I

    const/4 v4, 0x0

    if-ge v2, v3, :cond_2

    iget-object v3, v0, Landroid/support/constraint/n/d;->g:[Landroid/support/constraint/n/b;

    aget-object v6, v3, v2

    iget-object v6, v6, Landroid/support/constraint/n/b;->a:Landroid/support/constraint/n/i;

    iget-object v6, v6, Landroid/support/constraint/n/i;->j:Landroid/support/constraint/n/i$a;

    sget-object v7, Landroid/support/constraint/n/i$a;->b:Landroid/support/constraint/n/i$a;

    if-ne v6, v7, :cond_0

    goto :goto_1

    :cond_0
    aget-object v3, v3, v2

    iget v3, v3, Landroid/support/constraint/n/b;->b:F

    cmpg-float v3, v3, v4

    if-gez v3, :cond_1

    const/4 v2, 0x1

    goto :goto_2

    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_2
    if-eqz v2, :cond_17

    const/4 v2, 0x0

    const/4 v3, 0x0

    :cond_3
    :goto_3
    if-nez v2, :cond_16

    sget-object v6, Landroid/support/constraint/n/d;->x:Landroid/support/constraint/n/e;

    const-wide/16 v7, 0x1

    if-eqz v6, :cond_4

    iget-wide v9, v6, Landroid/support/constraint/n/e;->k:J

    add-long/2addr v9, v7

    iput-wide v9, v6, Landroid/support/constraint/n/e;->k:J

    :cond_4
    add-int/lit8 v3, v3, 0x1

    const v6, 0x7f7fffff    # Float.MAX_VALUE

    const/4 v10, 0x0

    const/4 v11, -0x1

    const/4 v12, -0x1

    const/4 v13, 0x0

    :goto_4
    iget v14, v0, Landroid/support/constraint/n/d;->l:I

    if-ge v10, v14, :cond_13

    iget-object v14, v0, Landroid/support/constraint/n/d;->g:[Landroid/support/constraint/n/b;

    aget-object v14, v14, v10

    iget-object v15, v14, Landroid/support/constraint/n/b;->a:Landroid/support/constraint/n/i;

    iget-object v15, v15, Landroid/support/constraint/n/i;->j:Landroid/support/constraint/n/i$a;

    sget-object v1, Landroid/support/constraint/n/i$a;->b:Landroid/support/constraint/n/i$a;

    if-ne v15, v1, :cond_5

    goto/16 :goto_b

    :cond_5
    iget-boolean v1, v14, Landroid/support/constraint/n/b;->f:Z

    if-eqz v1, :cond_6

    goto/16 :goto_b

    :cond_6
    iget v1, v14, Landroid/support/constraint/n/b;->b:F

    cmpg-float v1, v1, v4

    if-gez v1, :cond_12

    sget-boolean v1, Landroid/support/constraint/n/d;->u:Z

    const/16 v15, 0x9

    if-eqz v1, :cond_c

    iget-object v1, v14, Landroid/support/constraint/n/b;->e:Landroid/support/constraint/n/b$a;

    invoke-interface {v1}, Landroid/support/constraint/n/b$a;->b()I

    move-result v1

    const/4 v5, 0x0

    :goto_5
    if-ge v5, v1, :cond_12

    iget-object v7, v14, Landroid/support/constraint/n/b;->e:Landroid/support/constraint/n/b$a;

    invoke-interface {v7, v5}, Landroid/support/constraint/n/b$a;->b(I)Landroid/support/constraint/n/i;

    move-result-object v7

    iget-object v8, v14, Landroid/support/constraint/n/b;->e:Landroid/support/constraint/n/b$a;

    invoke-interface {v8, v7}, Landroid/support/constraint/n/b$a;->a(Landroid/support/constraint/n/i;)F

    move-result v8

    cmpg-float v16, v8, v4

    if-gtz v16, :cond_7

    goto :goto_7

    :cond_7
    const/4 v9, 0x0

    :goto_6
    if-ge v9, v15, :cond_b

    iget-object v15, v7, Landroid/support/constraint/n/i;->h:[F

    aget v15, v15, v9

    div-float/2addr v15, v8

    cmpg-float v18, v15, v6

    if-gez v18, :cond_8

    if-eq v9, v13, :cond_9

    :cond_8
    if-le v9, v13, :cond_a

    :cond_9
    iget v12, v7, Landroid/support/constraint/n/i;->c:I

    move v13, v9

    move v11, v10

    move v6, v15

    :cond_a
    add-int/lit8 v9, v9, 0x1

    const/16 v15, 0x9

    goto :goto_6

    :cond_b
    :goto_7
    add-int/lit8 v5, v5, 0x1

    const-wide/16 v7, 0x1

    const/16 v15, 0x9

    goto :goto_5

    :cond_c
    const/4 v1, 0x1

    :goto_8
    iget v5, v0, Landroid/support/constraint/n/d;->k:I

    if-ge v1, v5, :cond_12

    iget-object v5, v0, Landroid/support/constraint/n/d;->n:Landroid/support/constraint/n/c;

    iget-object v5, v5, Landroid/support/constraint/n/c;->d:[Landroid/support/constraint/n/i;

    aget-object v5, v5, v1

    iget-object v7, v14, Landroid/support/constraint/n/b;->e:Landroid/support/constraint/n/b$a;

    invoke-interface {v7, v5}, Landroid/support/constraint/n/b$a;->a(Landroid/support/constraint/n/i;)F

    move-result v7

    cmpg-float v8, v7, v4

    if-gtz v8, :cond_d

    const/16 v9, 0x9

    goto :goto_a

    :cond_d
    const/4 v8, 0x0

    const/16 v9, 0x9

    :goto_9
    if-ge v8, v9, :cond_11

    iget-object v15, v5, Landroid/support/constraint/n/i;->h:[F

    aget v15, v15, v8

    div-float/2addr v15, v7

    cmpg-float v17, v15, v6

    if-gez v17, :cond_e

    if-eq v8, v13, :cond_f

    :cond_e
    if-le v8, v13, :cond_10

    :cond_f
    move v12, v1

    move v13, v8

    move v11, v10

    move v6, v15

    :cond_10
    add-int/lit8 v8, v8, 0x1

    goto :goto_9

    :cond_11
    :goto_a
    add-int/lit8 v1, v1, 0x1

    goto :goto_8

    :cond_12
    :goto_b
    add-int/lit8 v10, v10, 0x1

    const-wide/16 v7, 0x1

    goto/16 :goto_4

    :cond_13
    const/4 v1, -0x1

    if-eq v11, v1, :cond_15

    iget-object v5, v0, Landroid/support/constraint/n/d;->g:[Landroid/support/constraint/n/b;

    aget-object v5, v5, v11

    iget-object v6, v5, Landroid/support/constraint/n/b;->a:Landroid/support/constraint/n/i;

    iput v1, v6, Landroid/support/constraint/n/i;->d:I

    sget-object v1, Landroid/support/constraint/n/d;->x:Landroid/support/constraint/n/e;

    if-eqz v1, :cond_14

    iget-wide v6, v1, Landroid/support/constraint/n/e;->j:J

    const-wide/16 v8, 0x1

    add-long/2addr v6, v8

    iput-wide v6, v1, Landroid/support/constraint/n/e;->j:J

    :cond_14
    iget-object v1, v0, Landroid/support/constraint/n/d;->n:Landroid/support/constraint/n/c;

    iget-object v1, v1, Landroid/support/constraint/n/c;->d:[Landroid/support/constraint/n/i;

    aget-object v1, v1, v12

    invoke-virtual {v5, v1}, Landroid/support/constraint/n/b;->d(Landroid/support/constraint/n/i;)V

    iget-object v1, v5, Landroid/support/constraint/n/b;->a:Landroid/support/constraint/n/i;

    iput v11, v1, Landroid/support/constraint/n/i;->d:I

    invoke-virtual {v1, v0, v5}, Landroid/support/constraint/n/i;->a(Landroid/support/constraint/n/d;Landroid/support/constraint/n/b;)V

    goto :goto_c

    :cond_15
    const/4 v2, 0x1

    :goto_c
    iget v1, v0, Landroid/support/constraint/n/d;->k:I

    div-int/lit8 v1, v1, 0x2

    if-le v3, v1, :cond_3

    const/4 v2, 0x1

    goto/16 :goto_3

    :cond_16
    move v1, v3

    goto :goto_d

    :cond_17
    const/4 v1, 0x0

    :goto_d
    return v1
.end method

.method private final b(Landroid/support/constraint/n/b;)V
    .locals 7

    sget-boolean v0, Landroid/support/constraint/n/d;->t:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p1, Landroid/support/constraint/n/b;->f:Z

    if-eqz v0, :cond_0

    iget-object v0, p1, Landroid/support/constraint/n/b;->a:Landroid/support/constraint/n/i;

    iget p1, p1, Landroid/support/constraint/n/b;->b:F

    invoke-virtual {v0, p0, p1}, Landroid/support/constraint/n/i;->a(Landroid/support/constraint/n/d;F)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroid/support/constraint/n/d;->g:[Landroid/support/constraint/n/b;

    iget v1, p0, Landroid/support/constraint/n/d;->l:I

    aput-object p1, v0, v1

    iget-object v0, p1, Landroid/support/constraint/n/b;->a:Landroid/support/constraint/n/i;

    iput v1, v0, Landroid/support/constraint/n/i;->d:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Landroid/support/constraint/n/d;->l:I

    invoke-virtual {v0, p0, p1}, Landroid/support/constraint/n/i;->a(Landroid/support/constraint/n/d;Landroid/support/constraint/n/b;)V

    :goto_0
    sget-boolean p1, Landroid/support/constraint/n/d;->t:Z

    if-eqz p1, :cond_8

    iget-boolean p1, p0, Landroid/support/constraint/n/d;->a:Z

    if-eqz p1, :cond_8

    const/4 p1, 0x0

    move v0, p1

    :goto_1
    iget v1, p0, Landroid/support/constraint/n/d;->l:I

    if-ge v0, v1, :cond_7

    iget-object v1, p0, Landroid/support/constraint/n/d;->g:[Landroid/support/constraint/n/b;

    aget-object v1, v1, v0

    if-nez v1, :cond_1

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v2, "WTF"

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_1
    iget-object v1, p0, Landroid/support/constraint/n/d;->g:[Landroid/support/constraint/n/b;

    aget-object v2, v1, v0

    if-eqz v2, :cond_6

    aget-object v2, v1, v0

    iget-boolean v2, v2, Landroid/support/constraint/n/b;->f:Z

    if-eqz v2, :cond_6

    aget-object v1, v1, v0

    iget-object v2, v1, Landroid/support/constraint/n/b;->a:Landroid/support/constraint/n/i;

    iget v3, v1, Landroid/support/constraint/n/b;->b:F

    invoke-virtual {v2, p0, v3}, Landroid/support/constraint/n/i;->a(Landroid/support/constraint/n/d;F)V

    sget-boolean v2, Landroid/support/constraint/n/d;->v:Z

    if-eqz v2, :cond_2

    iget-object v2, p0, Landroid/support/constraint/n/d;->n:Landroid/support/constraint/n/c;

    iget-object v2, v2, Landroid/support/constraint/n/c;->a:Landroid/support/constraint/n/f;

    goto :goto_2

    :cond_2
    iget-object v2, p0, Landroid/support/constraint/n/d;->n:Landroid/support/constraint/n/c;

    iget-object v2, v2, Landroid/support/constraint/n/c;->b:Landroid/support/constraint/n/f;

    :goto_2
    invoke-interface {v2, v1}, Landroid/support/constraint/n/f;->a(Ljava/lang/Object;)Z

    iget-object v1, p0, Landroid/support/constraint/n/d;->g:[Landroid/support/constraint/n/b;

    const/4 v2, 0x0

    aput-object v2, v1, v0

    add-int/lit8 v1, v0, 0x1

    move v3, v1

    :goto_3
    iget v4, p0, Landroid/support/constraint/n/d;->l:I

    if-ge v1, v4, :cond_4

    iget-object v3, p0, Landroid/support/constraint/n/d;->g:[Landroid/support/constraint/n/b;

    add-int/lit8 v4, v1, -0x1

    aget-object v5, v3, v1

    aput-object v5, v3, v4

    aget-object v5, v3, v4

    iget-object v5, v5, Landroid/support/constraint/n/b;->a:Landroid/support/constraint/n/i;

    iget v5, v5, Landroid/support/constraint/n/i;->d:I

    if-ne v5, v1, :cond_3

    aget-object v3, v3, v4

    iget-object v3, v3, Landroid/support/constraint/n/b;->a:Landroid/support/constraint/n/i;

    iput v4, v3, Landroid/support/constraint/n/i;->d:I

    :cond_3
    add-int/lit8 v3, v1, 0x1

    move v6, v3

    move v3, v1

    move v1, v6

    goto :goto_3

    :cond_4
    if-ge v3, v4, :cond_5

    iget-object v1, p0, Landroid/support/constraint/n/d;->g:[Landroid/support/constraint/n/b;

    aput-object v2, v1, v3

    :cond_5
    iget v1, p0, Landroid/support/constraint/n/d;->l:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Landroid/support/constraint/n/d;->l:I

    add-int/lit8 v0, v0, -0x1

    :cond_6
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_7
    iput-boolean p1, p0, Landroid/support/constraint/n/d;->a:Z

    :cond_8
    return-void
.end method

.method private g()V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Landroid/support/constraint/n/d;->l:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Landroid/support/constraint/n/d;->g:[Landroid/support/constraint/n/b;

    aget-object v1, v1, v0

    iget-object v2, v1, Landroid/support/constraint/n/b;->a:Landroid/support/constraint/n/i;

    iget v1, v1, Landroid/support/constraint/n/b;->b:F

    iput v1, v2, Landroid/support/constraint/n/i;->f:F

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static h()Landroid/support/constraint/n/e;
    .locals 1

    sget-object v0, Landroid/support/constraint/n/d;->x:Landroid/support/constraint/n/e;

    return-object v0
.end method

.method private i()V
    .locals 5

    iget v0, p0, Landroid/support/constraint/n/d;->e:I

    mul-int/lit8 v0, v0, 0x2

    iput v0, p0, Landroid/support/constraint/n/d;->e:I

    iget-object v1, p0, Landroid/support/constraint/n/d;->g:[Landroid/support/constraint/n/b;

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/support/constraint/n/b;

    iput-object v0, p0, Landroid/support/constraint/n/d;->g:[Landroid/support/constraint/n/b;

    iget-object v0, p0, Landroid/support/constraint/n/d;->n:Landroid/support/constraint/n/c;

    iget-object v1, v0, Landroid/support/constraint/n/c;->d:[Landroid/support/constraint/n/i;

    iget v2, p0, Landroid/support/constraint/n/d;->e:I

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Landroid/support/constraint/n/i;

    iput-object v1, v0, Landroid/support/constraint/n/c;->d:[Landroid/support/constraint/n/i;

    iget v0, p0, Landroid/support/constraint/n/d;->e:I

    new-array v1, v0, [Z

    iput-object v1, p0, Landroid/support/constraint/n/d;->j:[Z

    iput v0, p0, Landroid/support/constraint/n/d;->f:I

    iput v0, p0, Landroid/support/constraint/n/d;->m:I

    sget-object p0, Landroid/support/constraint/n/d;->x:Landroid/support/constraint/n/e;

    if-eqz p0, :cond_0

    iget-wide v1, p0, Landroid/support/constraint/n/e;->d:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, p0, Landroid/support/constraint/n/e;->d:J

    iget-wide v1, p0, Landroid/support/constraint/n/e;->o:J

    int-to-long v3, v0

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    iput-wide v0, p0, Landroid/support/constraint/n/e;->o:J

    sget-object p0, Landroid/support/constraint/n/d;->x:Landroid/support/constraint/n/e;

    iget-wide v0, p0, Landroid/support/constraint/n/e;->o:J

    iput-wide v0, p0, Landroid/support/constraint/n/e;->x:J

    :cond_0
    return-void
.end method

.method private j()V
    .locals 4

    sget-boolean v0, Landroid/support/constraint/n/d;->v:Z

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    :goto_0
    iget v0, p0, Landroid/support/constraint/n/d;->l:I

    if-ge v2, v0, :cond_3

    iget-object v0, p0, Landroid/support/constraint/n/d;->g:[Landroid/support/constraint/n/b;

    aget-object v0, v0, v2

    if-eqz v0, :cond_0

    iget-object v3, p0, Landroid/support/constraint/n/d;->n:Landroid/support/constraint/n/c;

    iget-object v3, v3, Landroid/support/constraint/n/c;->a:Landroid/support/constraint/n/f;

    invoke-interface {v3, v0}, Landroid/support/constraint/n/f;->a(Ljava/lang/Object;)Z

    :cond_0
    iget-object v0, p0, Landroid/support/constraint/n/d;->g:[Landroid/support/constraint/n/b;

    aput-object v1, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    iget v0, p0, Landroid/support/constraint/n/d;->l:I

    if-ge v2, v0, :cond_3

    iget-object v0, p0, Landroid/support/constraint/n/d;->g:[Landroid/support/constraint/n/b;

    aget-object v0, v0, v2

    if-eqz v0, :cond_2

    iget-object v3, p0, Landroid/support/constraint/n/d;->n:Landroid/support/constraint/n/c;

    iget-object v3, v3, Landroid/support/constraint/n/c;->b:Landroid/support/constraint/n/f;

    invoke-interface {v3, v0}, Landroid/support/constraint/n/f;->a(Ljava/lang/Object;)Z

    :cond_2
    iget-object v0, p0, Landroid/support/constraint/n/d;->g:[Landroid/support/constraint/n/b;

    aput-object v1, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method


# virtual methods
.method public a(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)Landroid/support/constraint/n/b;
    .locals 3

    sget-boolean v0, Landroid/support/constraint/n/d;->s:Z

    const/16 v1, 0x8

    if-eqz v0, :cond_0

    if-ne p4, v1, :cond_0

    iget-boolean v0, p2, Landroid/support/constraint/n/i;->g:Z

    if-eqz v0, :cond_0

    iget v0, p1, Landroid/support/constraint/n/i;->d:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    iget p2, p2, Landroid/support/constraint/n/i;->f:F

    int-to-float p3, p3

    add-float/2addr p2, p3

    invoke-virtual {p1, p0, p2}, Landroid/support/constraint/n/i;->a(Landroid/support/constraint/n/d;F)V

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Landroid/support/constraint/n/d;->b()Landroid/support/constraint/n/b;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Landroid/support/constraint/n/b;->a(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;I)Landroid/support/constraint/n/b;

    if-eq p4, v1, :cond_1

    invoke-virtual {v0, p0, p4}, Landroid/support/constraint/n/b;->a(Landroid/support/constraint/n/d;I)Landroid/support/constraint/n/b;

    :cond_1
    invoke-virtual {p0, v0}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/b;)V

    return-object v0
.end method

.method public a()Landroid/support/constraint/n/i;
    .locals 5

    sget-object v0, Landroid/support/constraint/n/d;->x:Landroid/support/constraint/n/e;

    if-eqz v0, :cond_0

    iget-wide v1, v0, Landroid/support/constraint/n/e;->n:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, v0, Landroid/support/constraint/n/e;->n:J

    :cond_0
    iget v0, p0, Landroid/support/constraint/n/d;->k:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, Landroid/support/constraint/n/d;->f:I

    if-lt v0, v1, :cond_1

    invoke-direct {p0}, Landroid/support/constraint/n/d;->i()V

    :cond_1
    sget-object v0, Landroid/support/constraint/n/i$a;->d:Landroid/support/constraint/n/i$a;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/i$a;Ljava/lang/String;)Landroid/support/constraint/n/i;

    move-result-object v0

    iget v1, p0, Landroid/support/constraint/n/d;->b:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Landroid/support/constraint/n/d;->b:I

    iget v2, p0, Landroid/support/constraint/n/d;->k:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Landroid/support/constraint/n/d;->k:I

    iput v1, v0, Landroid/support/constraint/n/i;->c:I

    iget-object p0, p0, Landroid/support/constraint/n/d;->n:Landroid/support/constraint/n/c;

    iget-object p0, p0, Landroid/support/constraint/n/c;->d:[Landroid/support/constraint/n/i;

    aput-object v0, p0, v1

    return-object v0
.end method

.method public a(ILjava/lang/String;)Landroid/support/constraint/n/i;
    .locals 5

    sget-object v0, Landroid/support/constraint/n/d;->x:Landroid/support/constraint/n/e;

    if-eqz v0, :cond_0

    iget-wide v1, v0, Landroid/support/constraint/n/e;->l:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, v0, Landroid/support/constraint/n/e;->l:J

    :cond_0
    iget v0, p0, Landroid/support/constraint/n/d;->k:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, Landroid/support/constraint/n/d;->f:I

    if-lt v0, v1, :cond_1

    invoke-direct {p0}, Landroid/support/constraint/n/d;->i()V

    :cond_1
    sget-object v0, Landroid/support/constraint/n/i$a;->e:Landroid/support/constraint/n/i$a;

    invoke-direct {p0, v0, p2}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/i$a;Ljava/lang/String;)Landroid/support/constraint/n/i;

    move-result-object p2

    iget v0, p0, Landroid/support/constraint/n/d;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Landroid/support/constraint/n/d;->b:I

    iget v1, p0, Landroid/support/constraint/n/d;->k:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Landroid/support/constraint/n/d;->k:I

    iput v0, p2, Landroid/support/constraint/n/i;->c:I

    iput p1, p2, Landroid/support/constraint/n/i;->e:I

    iget-object p1, p0, Landroid/support/constraint/n/d;->n:Landroid/support/constraint/n/c;

    iget-object p1, p1, Landroid/support/constraint/n/c;->d:[Landroid/support/constraint/n/i;

    aput-object p2, p1, v0

    iget-object p0, p0, Landroid/support/constraint/n/d;->d:Landroid/support/constraint/n/d$a;

    invoke-interface {p0, p2}, Landroid/support/constraint/n/d$a;->a(Landroid/support/constraint/n/i;)V

    return-object p2
.end method

.method public a(Ljava/lang/Object;)Landroid/support/constraint/n/i;
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget v1, p0, Landroid/support/constraint/n/d;->k:I

    add-int/lit8 v1, v1, 0x1

    iget v2, p0, Landroid/support/constraint/n/d;->f:I

    if-lt v1, v2, :cond_1

    invoke-direct {p0}, Landroid/support/constraint/n/d;->i()V

    :cond_1
    instance-of v1, p1, Landroid/support/constraint/n/k/d;

    if-eqz v1, :cond_5

    check-cast p1, Landroid/support/constraint/n/k/d;

    invoke-virtual {p1}, Landroid/support/constraint/n/k/d;->f()Landroid/support/constraint/n/i;

    move-result-object v0

    if-nez v0, :cond_2

    iget-object v0, p0, Landroid/support/constraint/n/d;->n:Landroid/support/constraint/n/c;

    invoke-virtual {p1, v0}, Landroid/support/constraint/n/k/d;->a(Landroid/support/constraint/n/c;)V

    invoke-virtual {p1}, Landroid/support/constraint/n/k/d;->f()Landroid/support/constraint/n/i;

    move-result-object p1

    move-object v0, p1

    :cond_2
    iget p1, v0, Landroid/support/constraint/n/i;->c:I

    const/4 v1, -0x1

    if-eq p1, v1, :cond_3

    iget v2, p0, Landroid/support/constraint/n/d;->b:I

    if-gt p1, v2, :cond_3

    iget-object v2, p0, Landroid/support/constraint/n/d;->n:Landroid/support/constraint/n/c;

    iget-object v2, v2, Landroid/support/constraint/n/c;->d:[Landroid/support/constraint/n/i;

    aget-object p1, v2, p1

    if-nez p1, :cond_5

    :cond_3
    iget p1, v0, Landroid/support/constraint/n/i;->c:I

    if-eq p1, v1, :cond_4

    invoke-virtual {v0}, Landroid/support/constraint/n/i;->a()V

    :cond_4
    iget p1, p0, Landroid/support/constraint/n/d;->b:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Landroid/support/constraint/n/d;->b:I

    iget v1, p0, Landroid/support/constraint/n/d;->k:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Landroid/support/constraint/n/d;->k:I

    iput p1, v0, Landroid/support/constraint/n/i;->c:I

    sget-object v1, Landroid/support/constraint/n/i$a;->b:Landroid/support/constraint/n/i$a;

    iput-object v1, v0, Landroid/support/constraint/n/i;->j:Landroid/support/constraint/n/i$a;

    iget-object p0, p0, Landroid/support/constraint/n/d;->n:Landroid/support/constraint/n/c;

    iget-object p0, p0, Landroid/support/constraint/n/c;->d:[Landroid/support/constraint/n/i;

    aput-object v0, p0, p1

    :cond_5
    return-object v0
.end method

.method public a(Landroid/support/constraint/n/b;)V
    .locals 7

    if-nez p1, :cond_0

    return-void

    :cond_0
    sget-object v0, Landroid/support/constraint/n/d;->x:Landroid/support/constraint/n/e;

    const-wide/16 v1, 0x1

    if-eqz v0, :cond_1

    iget-wide v3, v0, Landroid/support/constraint/n/e;->f:J

    add-long/2addr v3, v1

    iput-wide v3, v0, Landroid/support/constraint/n/e;->f:J

    iget-boolean v3, p1, Landroid/support/constraint/n/b;->f:Z

    if-eqz v3, :cond_1

    iget-wide v3, v0, Landroid/support/constraint/n/e;->g:J

    add-long/2addr v3, v1

    iput-wide v3, v0, Landroid/support/constraint/n/e;->g:J

    :cond_1
    iget v0, p0, Landroid/support/constraint/n/d;->l:I

    const/4 v3, 0x1

    add-int/2addr v0, v3

    iget v4, p0, Landroid/support/constraint/n/d;->m:I

    if-ge v0, v4, :cond_2

    iget v0, p0, Landroid/support/constraint/n/d;->k:I

    add-int/2addr v0, v3

    iget v4, p0, Landroid/support/constraint/n/d;->f:I

    if-lt v0, v4, :cond_3

    :cond_2
    invoke-direct {p0}, Landroid/support/constraint/n/d;->i()V

    :cond_3
    const/4 v0, 0x0

    iget-boolean v4, p1, Landroid/support/constraint/n/b;->f:Z

    if-nez v4, :cond_c

    invoke-virtual {p1, p0}, Landroid/support/constraint/n/b;->c(Landroid/support/constraint/n/d;)V

    invoke-virtual {p1}, Landroid/support/constraint/n/b;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_4

    return-void

    :cond_4
    invoke-virtual {p1}, Landroid/support/constraint/n/b;->a()V

    invoke-virtual {p1, p0}, Landroid/support/constraint/n/b;->a(Landroid/support/constraint/n/d;)Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-virtual {p0}, Landroid/support/constraint/n/d;->a()Landroid/support/constraint/n/i;

    move-result-object v4

    iput-object v4, p1, Landroid/support/constraint/n/b;->a:Landroid/support/constraint/n/i;

    iget v5, p0, Landroid/support/constraint/n/d;->l:I

    invoke-direct {p0, p1}, Landroid/support/constraint/n/d;->b(Landroid/support/constraint/n/b;)V

    iget v6, p0, Landroid/support/constraint/n/d;->l:I

    add-int/2addr v5, v3

    if-ne v6, v5, :cond_9

    iget-object v0, p0, Landroid/support/constraint/n/d;->q:Landroid/support/constraint/n/d$a;

    invoke-interface {v0, p1}, Landroid/support/constraint/n/d$a;->a(Landroid/support/constraint/n/d$a;)V

    iget-object v0, p0, Landroid/support/constraint/n/d;->q:Landroid/support/constraint/n/d$a;

    invoke-direct {p0, v0, v3}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/d$a;Z)I

    iget v0, v4, Landroid/support/constraint/n/i;->d:I

    const/4 v5, -0x1

    if-ne v0, v5, :cond_a

    iget-object v0, p1, Landroid/support/constraint/n/b;->a:Landroid/support/constraint/n/i;

    if-ne v0, v4, :cond_6

    invoke-virtual {p1, v4}, Landroid/support/constraint/n/b;->c(Landroid/support/constraint/n/i;)Landroid/support/constraint/n/i;

    move-result-object v0

    if-eqz v0, :cond_6

    sget-object v4, Landroid/support/constraint/n/d;->x:Landroid/support/constraint/n/e;

    if-eqz v4, :cond_5

    iget-wide v5, v4, Landroid/support/constraint/n/e;->j:J

    add-long/2addr v5, v1

    iput-wide v5, v4, Landroid/support/constraint/n/e;->j:J

    :cond_5
    invoke-virtual {p1, v0}, Landroid/support/constraint/n/b;->d(Landroid/support/constraint/n/i;)V

    :cond_6
    iget-boolean v0, p1, Landroid/support/constraint/n/b;->f:Z

    if-nez v0, :cond_7

    iget-object v0, p1, Landroid/support/constraint/n/b;->a:Landroid/support/constraint/n/i;

    invoke-virtual {v0, p0, p1}, Landroid/support/constraint/n/i;->a(Landroid/support/constraint/n/d;Landroid/support/constraint/n/b;)V

    :cond_7
    sget-boolean v0, Landroid/support/constraint/n/d;->v:Z

    if-eqz v0, :cond_8

    iget-object v0, p0, Landroid/support/constraint/n/d;->n:Landroid/support/constraint/n/c;

    iget-object v0, v0, Landroid/support/constraint/n/c;->a:Landroid/support/constraint/n/f;

    goto :goto_0

    :cond_8
    iget-object v0, p0, Landroid/support/constraint/n/d;->n:Landroid/support/constraint/n/c;

    iget-object v0, v0, Landroid/support/constraint/n/c;->b:Landroid/support/constraint/n/f;

    :goto_0
    invoke-interface {v0, p1}, Landroid/support/constraint/n/f;->a(Ljava/lang/Object;)Z

    iget v0, p0, Landroid/support/constraint/n/d;->l:I

    sub-int/2addr v0, v3

    iput v0, p0, Landroid/support/constraint/n/d;->l:I

    goto :goto_1

    :cond_9
    move v3, v0

    :cond_a
    :goto_1
    invoke-virtual {p1}, Landroid/support/constraint/n/b;->b()Z

    move-result v0

    if-nez v0, :cond_b

    return-void

    :cond_b
    move v0, v3

    :cond_c
    if-nez v0, :cond_d

    invoke-direct {p0, p1}, Landroid/support/constraint/n/d;->b(Landroid/support/constraint/n/b;)V

    :cond_d
    return-void
.end method

.method a(Landroid/support/constraint/n/b;II)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p3, v0}, Landroid/support/constraint/n/d;->a(ILjava/lang/String;)Landroid/support/constraint/n/i;

    move-result-object p0

    invoke-virtual {p1, p0, p2}, Landroid/support/constraint/n/b;->a(Landroid/support/constraint/n/i;I)Landroid/support/constraint/n/b;

    return-void
.end method

.method a(Landroid/support/constraint/n/d$a;)V
    .locals 5

    sget-object v0, Landroid/support/constraint/n/d;->x:Landroid/support/constraint/n/e;

    if-eqz v0, :cond_0

    iget-wide v1, v0, Landroid/support/constraint/n/e;->t:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, v0, Landroid/support/constraint/n/e;->t:J

    iget-wide v1, v0, Landroid/support/constraint/n/e;->u:J

    iget v3, p0, Landroid/support/constraint/n/d;->k:I

    int-to-long v3, v3

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    iput-wide v1, v0, Landroid/support/constraint/n/e;->u:J

    sget-object v0, Landroid/support/constraint/n/d;->x:Landroid/support/constraint/n/e;

    iget-wide v1, v0, Landroid/support/constraint/n/e;->v:J

    iget v3, p0, Landroid/support/constraint/n/d;->l:I

    int-to-long v3, v3

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    iput-wide v1, v0, Landroid/support/constraint/n/e;->v:J

    :cond_0
    invoke-direct {p0, p1}, Landroid/support/constraint/n/d;->b(Landroid/support/constraint/n/d$a;)I

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/d$a;Z)I

    invoke-direct {p0}, Landroid/support/constraint/n/d;->g()V

    return-void
.end method

.method public a(Landroid/support/constraint/n/i;I)V
    .locals 5

    sget-boolean v0, Landroid/support/constraint/n/d;->s:Z

    const/4 v1, -0x1

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    iget v0, p1, Landroid/support/constraint/n/i;->d:I

    if-ne v0, v1, :cond_2

    int-to-float p2, p2

    invoke-virtual {p1, p0, p2}, Landroid/support/constraint/n/i;->a(Landroid/support/constraint/n/d;F)V

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Landroid/support/constraint/n/d;->b:I

    add-int/2addr v1, v2

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Landroid/support/constraint/n/d;->n:Landroid/support/constraint/n/c;

    iget-object v1, v1, Landroid/support/constraint/n/c;->d:[Landroid/support/constraint/n/i;

    aget-object v1, v1, v0

    if-eqz v1, :cond_0

    iget-boolean v3, v1, Landroid/support/constraint/n/i;->n:Z

    if-eqz v3, :cond_0

    iget v3, v1, Landroid/support/constraint/n/i;->o:I

    iget v4, p1, Landroid/support/constraint/n/i;->c:I

    if-ne v3, v4, :cond_0

    iget v3, v1, Landroid/support/constraint/n/i;->p:F

    add-float/2addr v3, p2

    invoke-virtual {v1, p0, v3}, Landroid/support/constraint/n/i;->a(Landroid/support/constraint/n/d;F)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    iget v0, p1, Landroid/support/constraint/n/i;->d:I

    if-eq v0, v1, :cond_5

    iget-object v1, p0, Landroid/support/constraint/n/d;->g:[Landroid/support/constraint/n/b;

    aget-object v0, v1, v0

    iget-boolean v1, v0, Landroid/support/constraint/n/b;->f:Z

    if-eqz v1, :cond_3

    :goto_1
    int-to-float p0, p2

    iput p0, v0, Landroid/support/constraint/n/b;->b:F

    goto :goto_3

    :cond_3
    iget-object v1, v0, Landroid/support/constraint/n/b;->e:Landroid/support/constraint/n/b$a;

    invoke-interface {v1}, Landroid/support/constraint/n/b$a;->b()I

    move-result v1

    if-nez v1, :cond_4

    iput-boolean v2, v0, Landroid/support/constraint/n/b;->f:Z

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, Landroid/support/constraint/n/d;->b()Landroid/support/constraint/n/b;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroid/support/constraint/n/b;->c(Landroid/support/constraint/n/i;I)Landroid/support/constraint/n/b;

    goto :goto_2

    :cond_5
    invoke-virtual {p0}, Landroid/support/constraint/n/d;->b()Landroid/support/constraint/n/b;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroid/support/constraint/n/b;->b(Landroid/support/constraint/n/i;I)Landroid/support/constraint/n/b;

    :goto_2
    invoke-virtual {p0, v0}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/b;)V

    :goto_3
    return-void
.end method

.method public a(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;IFLandroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)V
    .locals 11

    move-object v0, p0

    move/from16 v1, p8

    invoke-virtual {p0}, Landroid/support/constraint/n/d;->b()Landroid/support/constraint/n/b;

    move-result-object v10

    move-object v2, v10

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move/from16 v9, p7

    invoke-virtual/range {v2 .. v9}, Landroid/support/constraint/n/b;->a(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;IFLandroid/support/constraint/n/i;Landroid/support/constraint/n/i;I)Landroid/support/constraint/n/b;

    const/16 v2, 0x8

    if-eq v1, v2, :cond_0

    invoke-virtual {v10, p0, v1}, Landroid/support/constraint/n/b;->a(Landroid/support/constraint/n/d;I)Landroid/support/constraint/n/b;

    :cond_0
    invoke-virtual {p0, v10}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/b;)V

    return-void
.end method

.method public a(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;IZ)V
    .locals 2

    invoke-virtual {p0}, Landroid/support/constraint/n/d;->b()Landroid/support/constraint/n/b;

    move-result-object p4

    invoke-virtual {p0}, Landroid/support/constraint/n/d;->c()Landroid/support/constraint/n/i;

    move-result-object v0

    const/4 v1, 0x0

    iput v1, v0, Landroid/support/constraint/n/i;->e:I

    invoke-virtual {p4, p1, p2, v0, p3}, Landroid/support/constraint/n/b;->a(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;I)Landroid/support/constraint/n/b;

    invoke-virtual {p0, p4}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/b;)V

    return-void
.end method

.method public a(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;FI)V
    .locals 7

    invoke-virtual {p0}, Landroid/support/constraint/n/d;->b()Landroid/support/constraint/n/b;

    move-result-object v6

    move-object v0, v6

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Landroid/support/constraint/n/b;->a(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;F)Landroid/support/constraint/n/b;

    const/16 p1, 0x8

    if-eq p6, p1, :cond_0

    invoke-virtual {v6, p0, p6}, Landroid/support/constraint/n/b;->a(Landroid/support/constraint/n/d;I)Landroid/support/constraint/n/b;

    :cond_0
    invoke-virtual {p0, v6}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/b;)V

    return-void
.end method

.method public a(Landroid/support/constraint/n/k/e;Landroid/support/constraint/n/k/e;FI)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    sget-object v3, Landroid/support/constraint/n/k/d$b;->c:Landroid/support/constraint/n/k/d$b;

    invoke-virtual {v1, v3}, Landroid/support/constraint/n/k/e;->a(Landroid/support/constraint/n/k/d$b;)Landroid/support/constraint/n/k/d;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object v5

    sget-object v3, Landroid/support/constraint/n/k/d$b;->d:Landroid/support/constraint/n/k/d$b;

    invoke-virtual {v1, v3}, Landroid/support/constraint/n/k/e;->a(Landroid/support/constraint/n/k/d$b;)Landroid/support/constraint/n/k/d;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object v7

    sget-object v3, Landroid/support/constraint/n/k/d$b;->e:Landroid/support/constraint/n/k/d$b;

    invoke-virtual {v1, v3}, Landroid/support/constraint/n/k/e;->a(Landroid/support/constraint/n/k/d$b;)Landroid/support/constraint/n/k/d;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object v3

    sget-object v4, Landroid/support/constraint/n/k/d$b;->f:Landroid/support/constraint/n/k/d$b;

    invoke-virtual {v1, v4}, Landroid/support/constraint/n/k/e;->a(Landroid/support/constraint/n/k/d$b;)Landroid/support/constraint/n/k/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object v8

    sget-object v1, Landroid/support/constraint/n/k/d$b;->c:Landroid/support/constraint/n/k/d$b;

    invoke-virtual {v2, v1}, Landroid/support/constraint/n/k/e;->a(Landroid/support/constraint/n/k/d$b;)Landroid/support/constraint/n/k/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object v1

    sget-object v4, Landroid/support/constraint/n/k/d$b;->d:Landroid/support/constraint/n/k/d$b;

    invoke-virtual {v2, v4}, Landroid/support/constraint/n/k/e;->a(Landroid/support/constraint/n/k/d$b;)Landroid/support/constraint/n/k/d;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object v9

    sget-object v4, Landroid/support/constraint/n/k/d$b;->e:Landroid/support/constraint/n/k/d$b;

    invoke-virtual {v2, v4}, Landroid/support/constraint/n/k/e;->a(Landroid/support/constraint/n/k/d$b;)Landroid/support/constraint/n/k/d;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object v12

    sget-object v4, Landroid/support/constraint/n/k/d$b;->f:Landroid/support/constraint/n/k/d$b;

    invoke-virtual {v2, v4}, Landroid/support/constraint/n/k/e;->a(Landroid/support/constraint/n/k/d$b;)Landroid/support/constraint/n/k/d;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object v10

    invoke-virtual/range {p0 .. p0}, Landroid/support/constraint/n/d;->b()Landroid/support/constraint/n/b;

    move-result-object v2

    move/from16 v4, p3

    float-to-double v13, v4

    invoke-static {v13, v14}, Ljava/lang/Math;->sin(D)D

    move-result-wide v15

    move/from16 v4, p4

    move-object/from16 v17, v3

    int-to-double v3, v4

    move-object/from16 p1, v12

    mul-double v11, v15, v3

    double-to-float v11, v11

    move-object v6, v2

    invoke-virtual/range {v6 .. v11}, Landroid/support/constraint/n/b;->b(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;F)Landroid/support/constraint/n/b;

    invoke-virtual {v0, v2}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/b;)V

    invoke-virtual/range {p0 .. p0}, Landroid/support/constraint/n/d;->b()Landroid/support/constraint/n/b;

    move-result-object v2

    invoke-static {v13, v14}, Ljava/lang/Math;->cos(D)D

    move-result-wide v6

    mul-double/2addr v6, v3

    double-to-float v9, v6

    move-object v4, v2

    move-object/from16 v6, v17

    move-object v7, v1

    move-object/from16 v8, p1

    invoke-virtual/range {v4 .. v9}, Landroid/support/constraint/n/b;->b(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;F)Landroid/support/constraint/n/b;

    invoke-virtual {v0, v2}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/b;)V

    return-void
.end method

.method public b(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Landroid/support/constraint/n/k/d;

    invoke-virtual {p1}, Landroid/support/constraint/n/k/d;->f()Landroid/support/constraint/n/i;

    move-result-object p0

    if-eqz p0, :cond_0

    iget p0, p0, Landroid/support/constraint/n/i;->f:F

    const/high16 p1, 0x3f000000    # 0.5f

    add-float/2addr p0, p1

    float-to-int p0, p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public b()Landroid/support/constraint/n/b;
    .locals 5

    sget-boolean v0, Landroid/support/constraint/n/d;->v:Z

    const-wide/16 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/constraint/n/d;->n:Landroid/support/constraint/n/c;

    iget-object v0, v0, Landroid/support/constraint/n/c;->a:Landroid/support/constraint/n/f;

    invoke-interface {v0}, Landroid/support/constraint/n/f;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/constraint/n/b;

    if-nez v0, :cond_1

    new-instance v0, Landroid/support/constraint/n/d$b;

    iget-object v3, p0, Landroid/support/constraint/n/d;->n:Landroid/support/constraint/n/c;

    invoke-direct {v0, p0, v3}, Landroid/support/constraint/n/d$b;-><init>(Landroid/support/constraint/n/d;Landroid/support/constraint/n/c;)V

    sget-wide v3, Landroid/support/constraint/n/d;->z:J

    add-long/2addr v3, v1

    sput-wide v3, Landroid/support/constraint/n/d;->z:J

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroid/support/constraint/n/d;->n:Landroid/support/constraint/n/c;

    iget-object v0, v0, Landroid/support/constraint/n/c;->b:Landroid/support/constraint/n/f;

    invoke-interface {v0}, Landroid/support/constraint/n/f;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/constraint/n/b;

    if-nez v0, :cond_1

    new-instance v0, Landroid/support/constraint/n/b;

    iget-object p0, p0, Landroid/support/constraint/n/d;->n:Landroid/support/constraint/n/c;

    invoke-direct {v0, p0}, Landroid/support/constraint/n/b;-><init>(Landroid/support/constraint/n/c;)V

    sget-wide v3, Landroid/support/constraint/n/d;->y:J

    add-long/2addr v3, v1

    sput-wide v3, Landroid/support/constraint/n/d;->y:J

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Landroid/support/constraint/n/b;->c()V

    :goto_0
    invoke-static {}, Landroid/support/constraint/n/i;->b()V

    return-object v0
.end method

.method public b(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)V
    .locals 3

    invoke-virtual {p0}, Landroid/support/constraint/n/d;->b()Landroid/support/constraint/n/b;

    move-result-object v0

    invoke-virtual {p0}, Landroid/support/constraint/n/d;->c()Landroid/support/constraint/n/i;

    move-result-object v1

    const/4 v2, 0x0

    iput v2, v1, Landroid/support/constraint/n/i;->e:I

    invoke-virtual {v0, p1, p2, v1, p3}, Landroid/support/constraint/n/b;->a(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;I)Landroid/support/constraint/n/b;

    const/16 p1, 0x8

    if-eq p4, p1, :cond_0

    iget-object p1, v0, Landroid/support/constraint/n/b;->e:Landroid/support/constraint/n/b$a;

    invoke-interface {p1, v1}, Landroid/support/constraint/n/b$a;->a(Landroid/support/constraint/n/i;)F

    move-result p1

    const/high16 p2, -0x40800000    # -1.0f

    mul-float/2addr p1, p2

    float-to-int p1, p1

    invoke-virtual {p0, v0, p1, p4}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/b;II)V

    :cond_0
    invoke-virtual {p0, v0}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/b;)V

    return-void
.end method

.method public b(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;IZ)V
    .locals 2

    invoke-virtual {p0}, Landroid/support/constraint/n/d;->b()Landroid/support/constraint/n/b;

    move-result-object p4

    invoke-virtual {p0}, Landroid/support/constraint/n/d;->c()Landroid/support/constraint/n/i;

    move-result-object v0

    const/4 v1, 0x0

    iput v1, v0, Landroid/support/constraint/n/i;->e:I

    invoke-virtual {p4, p1, p2, v0, p3}, Landroid/support/constraint/n/b;->b(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;I)Landroid/support/constraint/n/b;

    invoke-virtual {p0, p4}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/b;)V

    return-void
.end method

.method public c()Landroid/support/constraint/n/i;
    .locals 5

    sget-object v0, Landroid/support/constraint/n/d;->x:Landroid/support/constraint/n/e;

    if-eqz v0, :cond_0

    iget-wide v1, v0, Landroid/support/constraint/n/e;->m:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, v0, Landroid/support/constraint/n/e;->m:J

    :cond_0
    iget v0, p0, Landroid/support/constraint/n/d;->k:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, Landroid/support/constraint/n/d;->f:I

    if-lt v0, v1, :cond_1

    invoke-direct {p0}, Landroid/support/constraint/n/d;->i()V

    :cond_1
    sget-object v0, Landroid/support/constraint/n/i$a;->d:Landroid/support/constraint/n/i$a;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/i$a;Ljava/lang/String;)Landroid/support/constraint/n/i;

    move-result-object v0

    iget v1, p0, Landroid/support/constraint/n/d;->b:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Landroid/support/constraint/n/d;->b:I

    iget v2, p0, Landroid/support/constraint/n/d;->k:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Landroid/support/constraint/n/d;->k:I

    iput v1, v0, Landroid/support/constraint/n/i;->c:I

    iget-object p0, p0, Landroid/support/constraint/n/d;->n:Landroid/support/constraint/n/c;

    iget-object p0, p0, Landroid/support/constraint/n/c;->d:[Landroid/support/constraint/n/i;

    aput-object v0, p0, v1

    return-object v0
.end method

.method public c(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)V
    .locals 3

    invoke-virtual {p0}, Landroid/support/constraint/n/d;->b()Landroid/support/constraint/n/b;

    move-result-object v0

    invoke-virtual {p0}, Landroid/support/constraint/n/d;->c()Landroid/support/constraint/n/i;

    move-result-object v1

    const/4 v2, 0x0

    iput v2, v1, Landroid/support/constraint/n/i;->e:I

    invoke-virtual {v0, p1, p2, v1, p3}, Landroid/support/constraint/n/b;->b(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;I)Landroid/support/constraint/n/b;

    const/16 p1, 0x8

    if-eq p4, p1, :cond_0

    iget-object p1, v0, Landroid/support/constraint/n/b;->e:Landroid/support/constraint/n/b$a;

    invoke-interface {p1, v1}, Landroid/support/constraint/n/b$a;->a(Landroid/support/constraint/n/i;)F

    move-result p1

    const/high16 p2, -0x40800000    # -1.0f

    mul-float/2addr p1, p2

    float-to-int p1, p1

    invoke-virtual {p0, v0, p1, p4}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/b;II)V

    :cond_0
    invoke-virtual {p0, v0}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/b;)V

    return-void
.end method

.method public d()Landroid/support/constraint/n/c;
    .locals 0

    iget-object p0, p0, Landroid/support/constraint/n/d;->n:Landroid/support/constraint/n/c;

    return-object p0
.end method

.method public e()V
    .locals 5

    sget-object v0, Landroid/support/constraint/n/d;->x:Landroid/support/constraint/n/e;

    const-wide/16 v1, 0x1

    if-eqz v0, :cond_0

    iget-wide v3, v0, Landroid/support/constraint/n/e;->e:J

    add-long/2addr v3, v1

    iput-wide v3, v0, Landroid/support/constraint/n/e;->e:J

    :cond_0
    iget-object v0, p0, Landroid/support/constraint/n/d;->d:Landroid/support/constraint/n/d$a;

    invoke-interface {v0}, Landroid/support/constraint/n/d$a;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Landroid/support/constraint/n/d;->g()V

    return-void

    :cond_1
    iget-boolean v0, p0, Landroid/support/constraint/n/d;->h:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Landroid/support/constraint/n/d;->i:Z

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    iget-object v0, p0, Landroid/support/constraint/n/d;->d:Landroid/support/constraint/n/d$a;

    invoke-virtual {p0, v0}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/d$a;)V

    goto :goto_4

    :cond_3
    :goto_1
    sget-object v0, Landroid/support/constraint/n/d;->x:Landroid/support/constraint/n/e;

    if-eqz v0, :cond_4

    iget-wide v3, v0, Landroid/support/constraint/n/e;->q:J

    add-long/2addr v3, v1

    iput-wide v3, v0, Landroid/support/constraint/n/e;->q:J

    :cond_4
    const/4 v0, 0x0

    move v3, v0

    :goto_2
    iget v4, p0, Landroid/support/constraint/n/d;->l:I

    if-ge v3, v4, :cond_6

    iget-object v4, p0, Landroid/support/constraint/n/d;->g:[Landroid/support/constraint/n/b;

    aget-object v4, v4, v3

    iget-boolean v4, v4, Landroid/support/constraint/n/b;->f:Z

    if-nez v4, :cond_5

    goto :goto_3

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_6
    const/4 v0, 0x1

    :goto_3
    if-nez v0, :cond_7

    goto :goto_0

    :cond_7
    sget-object v0, Landroid/support/constraint/n/d;->x:Landroid/support/constraint/n/e;

    if-eqz v0, :cond_8

    iget-wide v3, v0, Landroid/support/constraint/n/e;->p:J

    add-long/2addr v3, v1

    iput-wide v3, v0, Landroid/support/constraint/n/e;->p:J

    :cond_8
    invoke-direct {p0}, Landroid/support/constraint/n/d;->g()V

    :goto_4
    return-void
.end method

.method public f()V
    .locals 5

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Landroid/support/constraint/n/d;->n:Landroid/support/constraint/n/c;

    iget-object v3, v2, Landroid/support/constraint/n/c;->d:[Landroid/support/constraint/n/i;

    array-length v4, v3

    if-ge v1, v4, :cond_1

    aget-object v2, v3, v1

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/support/constraint/n/i;->a()V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object v1, v2, Landroid/support/constraint/n/c;->c:Landroid/support/constraint/n/f;

    iget-object v2, p0, Landroid/support/constraint/n/d;->o:[Landroid/support/constraint/n/i;

    iget v3, p0, Landroid/support/constraint/n/d;->p:I

    invoke-interface {v1, v2, v3}, Landroid/support/constraint/n/f;->a([Ljava/lang/Object;I)V

    iput v0, p0, Landroid/support/constraint/n/d;->p:I

    iget-object v1, p0, Landroid/support/constraint/n/d;->n:Landroid/support/constraint/n/c;

    iget-object v1, v1, Landroid/support/constraint/n/c;->d:[Landroid/support/constraint/n/i;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, p0, Landroid/support/constraint/n/d;->c:Ljava/util/HashMap;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    :cond_2
    iput v0, p0, Landroid/support/constraint/n/d;->b:I

    iget-object v1, p0, Landroid/support/constraint/n/d;->d:Landroid/support/constraint/n/d$a;

    invoke-interface {v1}, Landroid/support/constraint/n/d$a;->clear()V

    const/4 v1, 0x1

    iput v1, p0, Landroid/support/constraint/n/d;->k:I

    move v1, v0

    :goto_1
    iget v2, p0, Landroid/support/constraint/n/d;->l:I

    if-ge v1, v2, :cond_4

    iget-object v2, p0, Landroid/support/constraint/n/d;->g:[Landroid/support/constraint/n/b;

    aget-object v3, v2, v1

    if-eqz v3, :cond_3

    aget-object v2, v2, v1

    iput-boolean v0, v2, Landroid/support/constraint/n/b;->c:Z

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    invoke-direct {p0}, Landroid/support/constraint/n/d;->j()V

    iput v0, p0, Landroid/support/constraint/n/d;->l:I

    sget-boolean v0, Landroid/support/constraint/n/d;->v:Z

    if-eqz v0, :cond_5

    new-instance v0, Landroid/support/constraint/n/d$b;

    iget-object v1, p0, Landroid/support/constraint/n/d;->n:Landroid/support/constraint/n/c;

    invoke-direct {v0, p0, v1}, Landroid/support/constraint/n/d$b;-><init>(Landroid/support/constraint/n/d;Landroid/support/constraint/n/c;)V

    goto :goto_2

    :cond_5
    new-instance v0, Landroid/support/constraint/n/b;

    iget-object v1, p0, Landroid/support/constraint/n/d;->n:Landroid/support/constraint/n/c;

    invoke-direct {v0, v1}, Landroid/support/constraint/n/b;-><init>(Landroid/support/constraint/n/c;)V

    :goto_2
    iput-object v0, p0, Landroid/support/constraint/n/d;->q:Landroid/support/constraint/n/d$a;

    return-void
.end method
