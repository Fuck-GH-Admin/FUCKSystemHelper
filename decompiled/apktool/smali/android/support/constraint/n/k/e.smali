.class public Landroid/support/constraint/n/k/e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/constraint/n/k/e$b;
    }
.end annotation


# static fields
.field public static o0:F = 0.5f


# instance fields
.field private A:Z

.field private B:Z

.field private C:Z

.field private D:I

.field private E:I

.field public F:Landroid/support/constraint/n/k/d;

.field public G:Landroid/support/constraint/n/k/d;

.field public H:Landroid/support/constraint/n/k/d;

.field public I:Landroid/support/constraint/n/k/d;

.field public J:Landroid/support/constraint/n/k/d;

.field K:Landroid/support/constraint/n/k/d;

.field L:Landroid/support/constraint/n/k/d;

.field public M:Landroid/support/constraint/n/k/d;

.field public N:[Landroid/support/constraint/n/k/d;

.field protected O:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/support/constraint/n/k/d;",
            ">;"
        }
    .end annotation
.end field

.field private P:[Z

.field public Q:[Landroid/support/constraint/n/k/e$b;

.field public R:Landroid/support/constraint/n/k/e;

.field S:I

.field T:I

.field public U:F

.field protected V:I

.field protected W:I

.field protected X:I

.field Y:I

.field protected Z:I

.field public a:Z

.field protected a0:I

.field public b:Landroid/support/constraint/n/k/m/c;

.field b0:F

.field public c:Landroid/support/constraint/n/k/m/c;

.field c0:F

.field public d:Landroid/support/constraint/n/k/m/l;

.field private d0:Ljava/lang/Object;

.field public e:Landroid/support/constraint/n/k/m/n;

.field private e0:I

.field public f:[Z

.field private f0:Ljava/lang/String;

.field private g:Z

.field private g0:Ljava/lang/String;

.field private h:Z

.field h0:I

.field private i:Z

.field i0:I

.field private j:Z

.field public j0:[F

.field private k:Z

.field protected k0:[Landroid/support/constraint/n/k/e;

.field public l:I

.field protected l0:[Landroid/support/constraint/n/k/e;

.field public m:I

.field public m0:I

.field public n:I

.field public n0:I

.field public o:I

.field public p:[I

.field public q:I

.field public r:I

.field public s:F

.field public t:I

.field public u:I

.field public v:F

.field w:I

.field x:F

.field private y:[I

.field private z:F


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 10

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/constraint/n/k/e;->a:Z

    const/4 v1, 0x0

    iput-object v1, p0, Landroid/support/constraint/n/k/e;->d:Landroid/support/constraint/n/k/m/l;

    iput-object v1, p0, Landroid/support/constraint/n/k/e;->e:Landroid/support/constraint/n/k/m/n;

    const/4 v2, 0x2

    new-array v3, v2, [Z

    fill-array-data v3, :array_0

    iput-object v3, p0, Landroid/support/constraint/n/k/e;->f:[Z

    const/4 v3, 0x1

    iput-boolean v3, p0, Landroid/support/constraint/n/k/e;->g:Z

    iput-boolean v0, p0, Landroid/support/constraint/n/k/e;->h:Z

    iput-boolean v3, p0, Landroid/support/constraint/n/k/e;->i:Z

    iput-boolean v0, p0, Landroid/support/constraint/n/k/e;->j:Z

    iput-boolean v0, p0, Landroid/support/constraint/n/k/e;->k:Z

    const/4 v4, -0x1

    iput v4, p0, Landroid/support/constraint/n/k/e;->l:I

    iput v4, p0, Landroid/support/constraint/n/k/e;->m:I

    iput v0, p0, Landroid/support/constraint/n/k/e;->n:I

    iput v0, p0, Landroid/support/constraint/n/k/e;->o:I

    new-array v5, v2, [I

    iput-object v5, p0, Landroid/support/constraint/n/k/e;->p:[I

    iput v0, p0, Landroid/support/constraint/n/k/e;->q:I

    iput v0, p0, Landroid/support/constraint/n/k/e;->r:I

    const/high16 v5, 0x3f800000    # 1.0f

    iput v5, p0, Landroid/support/constraint/n/k/e;->s:F

    iput v0, p0, Landroid/support/constraint/n/k/e;->t:I

    iput v0, p0, Landroid/support/constraint/n/k/e;->u:I

    iput v5, p0, Landroid/support/constraint/n/k/e;->v:F

    iput v4, p0, Landroid/support/constraint/n/k/e;->w:I

    iput v5, p0, Landroid/support/constraint/n/k/e;->x:F

    new-array v5, v2, [I

    fill-array-data v5, :array_1

    iput-object v5, p0, Landroid/support/constraint/n/k/e;->y:[I

    const/4 v5, 0x0

    iput v5, p0, Landroid/support/constraint/n/k/e;->z:F

    iput-boolean v0, p0, Landroid/support/constraint/n/k/e;->A:Z

    iput-boolean v0, p0, Landroid/support/constraint/n/k/e;->C:Z

    iput v0, p0, Landroid/support/constraint/n/k/e;->D:I

    iput v0, p0, Landroid/support/constraint/n/k/e;->E:I

    new-instance v6, Landroid/support/constraint/n/k/d;

    sget-object v7, Landroid/support/constraint/n/k/d$b;->c:Landroid/support/constraint/n/k/d$b;

    invoke-direct {v6, p0, v7}, Landroid/support/constraint/n/k/d;-><init>(Landroid/support/constraint/n/k/e;Landroid/support/constraint/n/k/d$b;)V

    iput-object v6, p0, Landroid/support/constraint/n/k/e;->F:Landroid/support/constraint/n/k/d;

    new-instance v6, Landroid/support/constraint/n/k/d;

    sget-object v7, Landroid/support/constraint/n/k/d$b;->d:Landroid/support/constraint/n/k/d$b;

    invoke-direct {v6, p0, v7}, Landroid/support/constraint/n/k/d;-><init>(Landroid/support/constraint/n/k/e;Landroid/support/constraint/n/k/d$b;)V

    iput-object v6, p0, Landroid/support/constraint/n/k/e;->G:Landroid/support/constraint/n/k/d;

    new-instance v6, Landroid/support/constraint/n/k/d;

    sget-object v7, Landroid/support/constraint/n/k/d$b;->e:Landroid/support/constraint/n/k/d$b;

    invoke-direct {v6, p0, v7}, Landroid/support/constraint/n/k/d;-><init>(Landroid/support/constraint/n/k/e;Landroid/support/constraint/n/k/d$b;)V

    iput-object v6, p0, Landroid/support/constraint/n/k/e;->H:Landroid/support/constraint/n/k/d;

    new-instance v6, Landroid/support/constraint/n/k/d;

    sget-object v7, Landroid/support/constraint/n/k/d$b;->f:Landroid/support/constraint/n/k/d$b;

    invoke-direct {v6, p0, v7}, Landroid/support/constraint/n/k/d;-><init>(Landroid/support/constraint/n/k/e;Landroid/support/constraint/n/k/d$b;)V

    iput-object v6, p0, Landroid/support/constraint/n/k/e;->I:Landroid/support/constraint/n/k/d;

    new-instance v6, Landroid/support/constraint/n/k/d;

    sget-object v7, Landroid/support/constraint/n/k/d$b;->g:Landroid/support/constraint/n/k/d$b;

    invoke-direct {v6, p0, v7}, Landroid/support/constraint/n/k/d;-><init>(Landroid/support/constraint/n/k/e;Landroid/support/constraint/n/k/d$b;)V

    iput-object v6, p0, Landroid/support/constraint/n/k/e;->J:Landroid/support/constraint/n/k/d;

    new-instance v6, Landroid/support/constraint/n/k/d;

    sget-object v7, Landroid/support/constraint/n/k/d$b;->i:Landroid/support/constraint/n/k/d$b;

    invoke-direct {v6, p0, v7}, Landroid/support/constraint/n/k/d;-><init>(Landroid/support/constraint/n/k/e;Landroid/support/constraint/n/k/d$b;)V

    iput-object v6, p0, Landroid/support/constraint/n/k/e;->K:Landroid/support/constraint/n/k/d;

    new-instance v6, Landroid/support/constraint/n/k/d;

    sget-object v7, Landroid/support/constraint/n/k/d$b;->j:Landroid/support/constraint/n/k/d$b;

    invoke-direct {v6, p0, v7}, Landroid/support/constraint/n/k/d;-><init>(Landroid/support/constraint/n/k/e;Landroid/support/constraint/n/k/d$b;)V

    iput-object v6, p0, Landroid/support/constraint/n/k/e;->L:Landroid/support/constraint/n/k/d;

    new-instance v6, Landroid/support/constraint/n/k/d;

    sget-object v7, Landroid/support/constraint/n/k/d$b;->h:Landroid/support/constraint/n/k/d$b;

    invoke-direct {v6, p0, v7}, Landroid/support/constraint/n/k/d;-><init>(Landroid/support/constraint/n/k/e;Landroid/support/constraint/n/k/d$b;)V

    iput-object v6, p0, Landroid/support/constraint/n/k/e;->M:Landroid/support/constraint/n/k/d;

    const/4 v7, 0x6

    new-array v7, v7, [Landroid/support/constraint/n/k/d;

    iget-object v8, p0, Landroid/support/constraint/n/k/e;->F:Landroid/support/constraint/n/k/d;

    aput-object v8, v7, v0

    iget-object v8, p0, Landroid/support/constraint/n/k/e;->H:Landroid/support/constraint/n/k/d;

    aput-object v8, v7, v3

    iget-object v8, p0, Landroid/support/constraint/n/k/e;->G:Landroid/support/constraint/n/k/d;

    aput-object v8, v7, v2

    iget-object v8, p0, Landroid/support/constraint/n/k/e;->I:Landroid/support/constraint/n/k/d;

    const/4 v9, 0x3

    aput-object v8, v7, v9

    iget-object v8, p0, Landroid/support/constraint/n/k/e;->J:Landroid/support/constraint/n/k/d;

    const/4 v9, 0x4

    aput-object v8, v7, v9

    const/4 v8, 0x5

    aput-object v6, v7, v8

    iput-object v7, p0, Landroid/support/constraint/n/k/e;->N:[Landroid/support/constraint/n/k/d;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, p0, Landroid/support/constraint/n/k/e;->O:Ljava/util/ArrayList;

    new-array v6, v2, [Z

    iput-object v6, p0, Landroid/support/constraint/n/k/e;->P:[Z

    new-array v6, v2, [Landroid/support/constraint/n/k/e$b;

    sget-object v7, Landroid/support/constraint/n/k/e$b;->b:Landroid/support/constraint/n/k/e$b;

    aput-object v7, v6, v0

    aput-object v7, v6, v3

    iput-object v6, p0, Landroid/support/constraint/n/k/e;->Q:[Landroid/support/constraint/n/k/e$b;

    iput-object v1, p0, Landroid/support/constraint/n/k/e;->R:Landroid/support/constraint/n/k/e;

    iput v0, p0, Landroid/support/constraint/n/k/e;->S:I

    iput v0, p0, Landroid/support/constraint/n/k/e;->T:I

    iput v5, p0, Landroid/support/constraint/n/k/e;->U:F

    iput v4, p0, Landroid/support/constraint/n/k/e;->V:I

    iput v0, p0, Landroid/support/constraint/n/k/e;->W:I

    iput v0, p0, Landroid/support/constraint/n/k/e;->X:I

    iput v0, p0, Landroid/support/constraint/n/k/e;->Y:I

    sget v5, Landroid/support/constraint/n/k/e;->o0:F

    iput v5, p0, Landroid/support/constraint/n/k/e;->b0:F

    iput v5, p0, Landroid/support/constraint/n/k/e;->c0:F

    iput v0, p0, Landroid/support/constraint/n/k/e;->e0:I

    iput-object v1, p0, Landroid/support/constraint/n/k/e;->f0:Ljava/lang/String;

    iput-object v1, p0, Landroid/support/constraint/n/k/e;->g0:Ljava/lang/String;

    iput v0, p0, Landroid/support/constraint/n/k/e;->h0:I

    iput v0, p0, Landroid/support/constraint/n/k/e;->i0:I

    new-array v5, v2, [F

    fill-array-data v5, :array_2

    iput-object v5, p0, Landroid/support/constraint/n/k/e;->j0:[F

    new-array v5, v2, [Landroid/support/constraint/n/k/e;

    aput-object v1, v5, v0

    aput-object v1, v5, v3

    iput-object v5, p0, Landroid/support/constraint/n/k/e;->k0:[Landroid/support/constraint/n/k/e;

    new-array v2, v2, [Landroid/support/constraint/n/k/e;

    aput-object v1, v2, v0

    aput-object v1, v2, v3

    iput-object v2, p0, Landroid/support/constraint/n/k/e;->l0:[Landroid/support/constraint/n/k/e;

    iput v4, p0, Landroid/support/constraint/n/k/e;->m0:I

    iput v4, p0, Landroid/support/constraint/n/k/e;->n0:I

    invoke-direct {p0}, Landroid/support/constraint/n/k/e;->R()V

    return-void

    nop

    :array_0
    .array-data 1
        0x1t
        0x1t
    .end array-data

    nop

    :array_1
    .array-data 4
        0x7fffffff
        0x7fffffff
    .end array-data

    :array_2
    .array-data 4
        -0x40800000    # -1.0f
        -0x40800000    # -1.0f
    .end array-data
.end method

.method private R()V
    .locals 2

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->O:Ljava/util/ArrayList;

    iget-object v1, p0, Landroid/support/constraint/n/k/e;->F:Landroid/support/constraint/n/k/d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->O:Ljava/util/ArrayList;

    iget-object v1, p0, Landroid/support/constraint/n/k/e;->G:Landroid/support/constraint/n/k/d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->O:Ljava/util/ArrayList;

    iget-object v1, p0, Landroid/support/constraint/n/k/e;->H:Landroid/support/constraint/n/k/d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->O:Ljava/util/ArrayList;

    iget-object v1, p0, Landroid/support/constraint/n/k/e;->I:Landroid/support/constraint/n/k/d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->O:Ljava/util/ArrayList;

    iget-object v1, p0, Landroid/support/constraint/n/k/e;->K:Landroid/support/constraint/n/k/d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->O:Ljava/util/ArrayList;

    iget-object v1, p0, Landroid/support/constraint/n/k/e;->L:Landroid/support/constraint/n/k/d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->O:Ljava/util/ArrayList;

    iget-object v1, p0, Landroid/support/constraint/n/k/e;->M:Landroid/support/constraint/n/k/d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->O:Ljava/util/ArrayList;

    iget-object p0, p0, Landroid/support/constraint/n/k/e;->J:Landroid/support/constraint/n/k/d;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private a(Landroid/support/constraint/n/d;ZZZZLandroid/support/constraint/n/i;Landroid/support/constraint/n/i;Landroid/support/constraint/n/k/e$b;ZLandroid/support/constraint/n/k/d;Landroid/support/constraint/n/k/d;IIIIFZZZZZIIIIFZ)V
    .locals 34

    move-object/from16 v0, p0

    move-object/from16 v10, p1

    move-object/from16 v11, p6

    move-object/from16 v12, p7

    move-object/from16 v13, p10

    move-object/from16 v14, p11

    move/from16 v15, p14

    move/from16 v1, p15

    move/from16 v2, p23

    move/from16 v3, p24

    move/from16 v4, p25

    invoke-virtual {v10, v13}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object v9

    invoke-virtual {v10, v14}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object v8

    invoke-virtual/range {p10 .. p10}, Landroid/support/constraint/n/k/d;->g()Landroid/support/constraint/n/k/d;

    move-result-object v5

    invoke-virtual {v10, v5}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object v7

    invoke-virtual/range {p11 .. p11}, Landroid/support/constraint/n/k/d;->g()Landroid/support/constraint/n/k/d;

    move-result-object v5

    invoke-virtual {v10, v5}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object v6

    invoke-static {}, Landroid/support/constraint/n/d;->h()Landroid/support/constraint/n/e;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-static {}, Landroid/support/constraint/n/d;->h()Landroid/support/constraint/n/e;

    move-result-object v5

    iget-wide v11, v5, Landroid/support/constraint/n/e;->w:J

    const-wide/16 v16, 0x1

    add-long v11, v11, v16

    iput-wide v11, v5, Landroid/support/constraint/n/e;->w:J

    :cond_0
    invoke-virtual/range {p10 .. p10}, Landroid/support/constraint/n/k/d;->l()Z

    move-result v11

    invoke-virtual/range {p11 .. p11}, Landroid/support/constraint/n/k/d;->l()Z

    move-result v12

    iget-object v5, v0, Landroid/support/constraint/n/k/e;->M:Landroid/support/constraint/n/k/d;

    invoke-virtual {v5}, Landroid/support/constraint/n/k/d;->l()Z

    move-result v16

    if-eqz v11, :cond_1

    const/16 v18, 0x1

    goto :goto_0

    :cond_1
    const/16 v18, 0x0

    :goto_0
    if-eqz v12, :cond_2

    add-int/lit8 v18, v18, 0x1

    :cond_2
    if-eqz v16, :cond_3

    add-int/lit8 v18, v18, 0x1

    :cond_3
    move/from16 v19, v18

    if-eqz p17, :cond_4

    const/16 v20, 0x3

    goto :goto_1

    :cond_4
    move/from16 v20, p22

    :goto_1
    sget-object v21, Landroid/support/constraint/n/k/e$a;->b:[I

    invoke-virtual/range {p8 .. p8}, Ljava/lang/Enum;->ordinal()I

    move-result v22

    aget v5, v21, v22

    const/4 v2, 0x2

    const/4 v14, 0x1

    if-eq v5, v14, :cond_5

    if-eq v5, v2, :cond_5

    const/4 v14, 0x3

    if-eq v5, v14, :cond_5

    const/4 v14, 0x4

    if-eq v5, v14, :cond_7

    :cond_5
    move/from16 v5, v20

    :cond_6
    const/16 v20, 0x0

    goto :goto_2

    :cond_7
    move/from16 v5, v20

    if-eq v5, v14, :cond_6

    const/16 v20, 0x1

    :goto_2
    iget v14, v0, Landroid/support/constraint/n/k/e;->e0:I

    const/16 v2, 0x8

    if-ne v14, v2, :cond_8

    const/4 v14, 0x0

    const/16 v20, 0x0

    goto :goto_3

    :cond_8
    move/from16 v14, p13

    :goto_3
    if-eqz p27, :cond_b

    if-nez v11, :cond_9

    if-nez v12, :cond_9

    if-nez v16, :cond_9

    move/from16 v2, p12

    invoke-virtual {v10, v9, v2}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/i;I)V

    goto :goto_4

    :cond_9
    if-eqz v11, :cond_a

    if-nez v12, :cond_a

    invoke-virtual/range {p10 .. p10}, Landroid/support/constraint/n/k/d;->c()I

    move-result v2

    move-object/from16 v22, v6

    const/16 v6, 0x8

    invoke-virtual {v10, v9, v7, v2, v6}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)Landroid/support/constraint/n/b;

    goto :goto_5

    :cond_a
    :goto_4
    move-object/from16 v22, v6

    const/16 v6, 0x8

    goto :goto_5

    :cond_b
    move-object/from16 v22, v6

    move v6, v2

    :goto_5
    if-nez v20, :cond_f

    if-eqz p9, :cond_d

    const/4 v2, 0x0

    const/4 v6, 0x3

    invoke-virtual {v10, v8, v9, v2, v6}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)Landroid/support/constraint/n/b;

    const/16 v14, 0x8

    if-lez v15, :cond_c

    invoke-virtual {v10, v8, v9, v15, v14}, Landroid/support/constraint/n/d;->b(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)V

    :cond_c
    const v2, 0x7fffffff

    if-ge v1, v2, :cond_e

    invoke-virtual {v10, v8, v9, v1, v14}, Landroid/support/constraint/n/d;->c(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)V

    goto :goto_6

    :cond_d
    move v1, v6

    const/4 v6, 0x3

    invoke-virtual {v10, v8, v9, v14, v1}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)Landroid/support/constraint/n/b;

    :cond_e
    :goto_6
    move/from16 v24, v5

    move-object v1, v7

    move-object v14, v8

    move/from16 v23, v20

    move-object/from16 v15, v22

    move/from16 v20, v3

    move/from16 v22, v19

    :goto_7
    move/from16 v19, p5

    goto/16 :goto_10

    :cond_f
    move/from16 v1, v19

    const/4 v2, 0x2

    const/4 v6, 0x3

    if-eq v1, v2, :cond_12

    if-nez p17, :cond_12

    const/4 v2, 0x1

    if-eq v5, v2, :cond_10

    if-nez v5, :cond_12

    :cond_10
    invoke-static {v3, v14}, Ljava/lang/Math;->max(II)I

    move-result v2

    if-lez v4, :cond_11

    invoke-static {v4, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    :cond_11
    const/16 v14, 0x8

    invoke-virtual {v10, v8, v9, v2, v14}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)Landroid/support/constraint/n/b;

    move/from16 v19, p5

    move/from16 v20, v3

    move/from16 v24, v5

    move-object v14, v8

    move-object/from16 v15, v22

    const/16 v23, 0x0

    move/from16 v22, v1

    :goto_8
    move-object v1, v7

    goto/16 :goto_10

    :cond_12
    const/4 v2, -0x2

    if-ne v3, v2, :cond_13

    move v3, v14

    :cond_13
    if-ne v4, v2, :cond_14

    move v2, v14

    goto :goto_9

    :cond_14
    move v2, v4

    :goto_9
    if-lez v14, :cond_15

    const/4 v4, 0x1

    if-eq v5, v4, :cond_15

    const/4 v14, 0x0

    :cond_15
    if-lez v3, :cond_16

    const/16 v4, 0x8

    invoke-virtual {v10, v8, v9, v3, v4}, Landroid/support/constraint/n/d;->b(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)V

    invoke-static {v14, v3}, Ljava/lang/Math;->max(II)I

    move-result v14

    :cond_16
    if-lez v2, :cond_19

    if-eqz p3, :cond_17

    const/4 v4, 0x1

    if-ne v5, v4, :cond_17

    const/4 v4, 0x0

    goto :goto_a

    :cond_17
    const/4 v4, 0x1

    :goto_a
    if-eqz v4, :cond_18

    const/16 v4, 0x8

    invoke-virtual {v10, v8, v9, v2, v4}, Landroid/support/constraint/n/d;->c(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)V

    goto :goto_b

    :cond_18
    const/16 v4, 0x8

    :goto_b
    invoke-static {v14, v2}, Ljava/lang/Math;->min(II)I

    move-result v14

    goto :goto_c

    :cond_19
    const/16 v4, 0x8

    :goto_c
    const/4 v6, 0x1

    if-ne v5, v6, :cond_1b

    if-eqz p3, :cond_1a

    invoke-virtual {v10, v8, v9, v14, v4}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)Landroid/support/constraint/n/b;

    goto :goto_d

    :cond_1a
    const/4 v6, 0x5

    invoke-virtual {v10, v8, v9, v14, v6}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)Landroid/support/constraint/n/b;

    invoke-virtual {v10, v8, v9, v14, v4}, Landroid/support/constraint/n/d;->c(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)V

    :goto_d
    move/from16 v19, p5

    move v4, v2

    move/from16 v24, v5

    move-object v14, v8

    move/from16 v23, v20

    move-object/from16 v15, v22

    move/from16 v22, v1

    move/from16 v20, v3

    goto :goto_8

    :cond_1b
    const/4 v14, 0x2

    if-ne v5, v14, :cond_1e

    invoke-virtual/range {p10 .. p10}, Landroid/support/constraint/n/k/d;->h()Landroid/support/constraint/n/k/d$b;

    move-result-object v4

    sget-object v6, Landroid/support/constraint/n/k/d$b;->d:Landroid/support/constraint/n/k/d$b;

    if-eq v4, v6, :cond_1d

    invoke-virtual/range {p10 .. p10}, Landroid/support/constraint/n/k/d;->h()Landroid/support/constraint/n/k/d$b;

    move-result-object v4

    sget-object v6, Landroid/support/constraint/n/k/d$b;->f:Landroid/support/constraint/n/k/d$b;

    if-ne v4, v6, :cond_1c

    goto :goto_e

    :cond_1c
    iget-object v4, v0, Landroid/support/constraint/n/k/e;->R:Landroid/support/constraint/n/k/e;

    sget-object v6, Landroid/support/constraint/n/k/d$b;->c:Landroid/support/constraint/n/k/d$b;

    invoke-virtual {v4, v6}, Landroid/support/constraint/n/k/e;->a(Landroid/support/constraint/n/k/d$b;)Landroid/support/constraint/n/k/d;

    move-result-object v4

    invoke-virtual {v10, v4}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object v4

    iget-object v6, v0, Landroid/support/constraint/n/k/e;->R:Landroid/support/constraint/n/k/e;

    sget-object v14, Landroid/support/constraint/n/k/d$b;->e:Landroid/support/constraint/n/k/d$b;

    goto :goto_f

    :cond_1d
    :goto_e
    iget-object v4, v0, Landroid/support/constraint/n/k/e;->R:Landroid/support/constraint/n/k/e;

    sget-object v6, Landroid/support/constraint/n/k/d$b;->d:Landroid/support/constraint/n/k/d$b;

    invoke-virtual {v4, v6}, Landroid/support/constraint/n/k/e;->a(Landroid/support/constraint/n/k/d$b;)Landroid/support/constraint/n/k/d;

    move-result-object v4

    invoke-virtual {v10, v4}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object v4

    iget-object v6, v0, Landroid/support/constraint/n/k/e;->R:Landroid/support/constraint/n/k/e;

    sget-object v14, Landroid/support/constraint/n/k/d$b;->f:Landroid/support/constraint/n/k/d$b;

    :goto_f
    invoke-virtual {v6, v14}, Landroid/support/constraint/n/k/e;->a(Landroid/support/constraint/n/k/d$b;)Landroid/support/constraint/n/k/d;

    move-result-object v6

    invoke-virtual {v10, v6}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object v6

    move-object v14, v4

    invoke-virtual/range {p1 .. p1}, Landroid/support/constraint/n/d;->b()Landroid/support/constraint/n/b;

    move-result-object v4

    move/from16 v19, v3

    move-object v3, v4

    move/from16 p9, v2

    move-object v2, v4

    move-object v4, v8

    move/from16 v24, v5

    const/4 v15, 0x0

    move-object v5, v9

    move-object/from16 v15, v22

    move/from16 v22, v1

    move-object v1, v7

    move-object v7, v14

    move-object v14, v8

    move/from16 v8, p26

    invoke-virtual/range {v3 .. v8}, Landroid/support/constraint/n/b;->a(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;F)Landroid/support/constraint/n/b;

    invoke-virtual {v10, v2}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/b;)V

    move/from16 v4, p9

    move/from16 v20, v19

    const/16 v23, 0x0

    goto/16 :goto_7

    :cond_1e
    move/from16 p9, v2

    move/from16 v19, v3

    move/from16 v24, v5

    move-object v14, v8

    move-object/from16 v15, v22

    move/from16 v22, v1

    move-object v1, v7

    move/from16 v4, p9

    move/from16 v23, v20

    move/from16 v20, v19

    const/16 v19, 0x1

    :goto_10
    if-eqz p27, :cond_5a

    if-eqz p19, :cond_1f

    move-object/from16 v2, p6

    move-object/from16 v3, p7

    move-object v6, v9

    move/from16 v5, v22

    const/4 v1, 0x2

    const/4 v4, 0x1

    const/16 v12, 0x8

    goto/16 :goto_2e

    :cond_1f
    if-nez v11, :cond_20

    if-nez v12, :cond_20

    if-nez v16, :cond_20

    goto/16 :goto_2a

    :cond_20
    if-eqz v11, :cond_21

    if-nez v12, :cond_21

    goto/16 :goto_2a

    :cond_21
    if-nez v11, :cond_24

    if-eqz v12, :cond_24

    invoke-virtual/range {p11 .. p11}, Landroid/support/constraint/n/k/d;->c()I

    move-result v1

    neg-int v1, v1

    const/16 v2, 0x8

    invoke-virtual {v10, v14, v15, v1, v2}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)Landroid/support/constraint/n/b;

    if-eqz p3, :cond_54

    iget-boolean v1, v0, Landroid/support/constraint/n/k/e;->h:Z

    if-eqz v1, :cond_23

    iget-boolean v1, v9, Landroid/support/constraint/n/i;->g:Z

    if-eqz v1, :cond_23

    iget-object v1, v0, Landroid/support/constraint/n/k/e;->R:Landroid/support/constraint/n/k/e;

    if-eqz v1, :cond_23

    check-cast v1, Landroid/support/constraint/n/k/f;

    if-eqz p2, :cond_22

    invoke-virtual {v1, v13}, Landroid/support/constraint/n/k/f;->b(Landroid/support/constraint/n/k/d;)V

    goto/16 :goto_2a

    :cond_22
    invoke-virtual {v1, v13}, Landroid/support/constraint/n/k/f;->d(Landroid/support/constraint/n/k/d;)V

    goto/16 :goto_2a

    :cond_23
    move-object/from16 v8, p6

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-virtual {v10, v9, v8, v2, v1}, Landroid/support/constraint/n/d;->b(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)V

    goto/16 :goto_2a

    :cond_24
    move-object/from16 v8, p6

    if-eqz v11, :cond_54

    if-eqz v12, :cond_54

    iget-object v2, v13, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    iget-object v11, v2, Landroid/support/constraint/n/k/d;->d:Landroid/support/constraint/n/k/e;

    move-object/from16 v7, p11

    const/4 v12, 0x4

    iget-object v2, v7, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    iget-object v6, v2, Landroid/support/constraint/n/k/d;->d:Landroid/support/constraint/n/k/e;

    invoke-virtual/range {p0 .. p0}, Landroid/support/constraint/n/k/e;->v()Landroid/support/constraint/n/k/e;

    move-result-object v5

    const/16 v16, 0x6

    move/from16 v3, v24

    if-eqz v23, :cond_37

    if-nez v3, :cond_29

    if-nez v4, :cond_26

    if-nez v20, :cond_26

    iget-boolean v2, v1, Landroid/support/constraint/n/i;->g:Z

    if-eqz v2, :cond_25

    iget-boolean v2, v15, Landroid/support/constraint/n/i;->g:Z

    if-eqz v2, :cond_25

    invoke-virtual/range {p10 .. p10}, Landroid/support/constraint/n/k/d;->c()I

    move-result v0

    const/16 v2, 0x8

    invoke-virtual {v10, v9, v1, v0, v2}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)Landroid/support/constraint/n/b;

    invoke-virtual/range {p11 .. p11}, Landroid/support/constraint/n/k/d;->c()I

    move-result v0

    neg-int v0, v0

    invoke-virtual {v10, v14, v15, v0, v2}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)Landroid/support/constraint/n/b;

    return-void

    :cond_25
    const/16 v2, 0x8

    move/from16 v24, v2

    move/from16 v25, v24

    const/4 v4, 0x0

    const/16 v21, 0x1

    const/16 v22, 0x0

    goto :goto_11

    :cond_26
    const/16 v2, 0x8

    const/4 v4, 0x1

    const/16 v21, 0x0

    const/16 v22, 0x1

    const/16 v24, 0x5

    const/16 v25, 0x5

    :goto_11
    instance-of v2, v11, Landroid/support/constraint/n/k/a;

    if-nez v2, :cond_28

    instance-of v2, v6, Landroid/support/constraint/n/k/a;

    if-eqz v2, :cond_27

    goto :goto_12

    :cond_27
    move/from16 v17, v22

    move/from16 v26, v25

    const/4 v2, 0x5

    const/4 v12, 0x1

    move/from16 v25, v16

    goto :goto_13

    :cond_28
    :goto_12
    move/from16 v26, v12

    move/from16 v25, v16

    move/from16 v17, v22

    const/4 v2, 0x5

    const/4 v12, 0x1

    :goto_13
    move/from16 v22, v21

    move/from16 v21, v4

    :goto_14
    move-object/from16 v4, p7

    goto/16 :goto_1d

    :cond_29
    const/4 v2, 0x1

    if-ne v3, v2, :cond_2a

    move-object/from16 v4, p7

    move/from16 v26, v12

    move/from16 v25, v16

    const/4 v2, 0x5

    const/4 v12, 0x1

    const/16 v17, 0x1

    const/16 v21, 0x1

    const/16 v22, 0x0

    const/16 v24, 0x8

    goto/16 :goto_1d

    :cond_2a
    const/4 v2, 0x3

    if-ne v3, v2, :cond_36

    iget v2, v0, Landroid/support/constraint/n/k/e;->w:I

    const/4 v12, -0x1

    if-ne v2, v12, :cond_2d

    move-object/from16 v4, p7

    const/4 v2, 0x5

    const/4 v12, 0x1

    const/16 v17, 0x1

    const/16 v21, 0x1

    const/16 v22, 0x1

    const/16 v24, 0x8

    if-eqz p20, :cond_2c

    if-eqz p3, :cond_2b

    const/16 v25, 0x5

    goto :goto_15

    :cond_2b
    const/16 v25, 0x4

    goto :goto_15

    :cond_2c
    const/16 v25, 0x8

    :goto_15
    const/16 v26, 0x5

    goto/16 :goto_1d

    :cond_2d
    if-eqz p17, :cond_31

    move/from16 v2, p23

    const/4 v12, 0x2

    if-eq v2, v12, :cond_2f

    const/4 v12, 0x1

    if-ne v2, v12, :cond_2e

    goto :goto_16

    :cond_2e
    const/4 v2, 0x0

    goto :goto_17

    :cond_2f
    const/4 v12, 0x1

    :goto_16
    move v2, v12

    :goto_17
    if-nez v2, :cond_30

    const/16 v2, 0x8

    const/4 v4, 0x5

    goto :goto_18

    :cond_30
    const/4 v2, 0x5

    const/4 v4, 0x4

    :goto_18
    move/from16 v24, v2

    move/from16 v26, v4

    move/from16 v17, v12

    move/from16 v21, v17

    move/from16 v22, v21

    move/from16 v25, v16

    const/4 v2, 0x5

    goto :goto_14

    :cond_31
    const/4 v12, 0x1

    if-lez v4, :cond_32

    move-object/from16 v4, p7

    move/from16 v17, v12

    move/from16 v21, v17

    move/from16 v22, v21

    move/from16 v25, v16

    const/4 v2, 0x5

    const/16 v24, 0x5

    goto :goto_15

    :cond_32
    if-nez v4, :cond_35

    if-nez v20, :cond_35

    if-nez p20, :cond_33

    move-object/from16 v4, p7

    move/from16 v17, v12

    move/from16 v21, v17

    move/from16 v22, v21

    move/from16 v25, v16

    const/4 v2, 0x5

    const/16 v24, 0x5

    const/16 v26, 0x8

    goto/16 :goto_1d

    :cond_33
    if-eq v11, v5, :cond_34

    if-eq v6, v5, :cond_34

    const/4 v2, 0x4

    goto :goto_19

    :cond_34
    const/4 v2, 0x5

    :goto_19
    move-object/from16 v4, p7

    move/from16 v24, v2

    move/from16 v17, v12

    move/from16 v21, v17

    move/from16 v22, v21

    move/from16 v25, v16

    const/4 v2, 0x5

    goto/16 :goto_1c

    :cond_35
    move-object/from16 v4, p7

    move/from16 v17, v12

    move/from16 v21, v17

    move/from16 v22, v21

    move/from16 v25, v16

    const/4 v2, 0x5

    goto :goto_1a

    :cond_36
    const/4 v12, 0x1

    move-object/from16 v4, p7

    move/from16 v25, v16

    const/4 v2, 0x5

    const/16 v17, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    :goto_1a
    const/16 v24, 0x5

    goto :goto_1c

    :cond_37
    const/4 v12, 0x1

    iget-boolean v2, v1, Landroid/support/constraint/n/i;->g:Z

    if-eqz v2, :cond_3a

    iget-boolean v2, v15, Landroid/support/constraint/n/i;->g:Z

    if-eqz v2, :cond_3a

    invoke-virtual/range {p10 .. p10}, Landroid/support/constraint/n/k/d;->c()I

    move-result v0

    invoke-virtual/range {p11 .. p11}, Landroid/support/constraint/n/k/d;->c()I

    move-result v2

    const/16 v3, 0x8

    move-object/from16 p17, p1

    move-object/from16 p18, v9

    move-object/from16 p19, v1

    move/from16 p20, v0

    move/from16 p21, p16

    move-object/from16 p22, v15

    move-object/from16 p23, v14

    move/from16 p24, v2

    move/from16 p25, v3

    invoke-virtual/range {p17 .. p25}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;IFLandroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)V

    if-eqz p3, :cond_39

    if-eqz v19, :cond_39

    iget-object v0, v7, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    if-eqz v0, :cond_38

    invoke-virtual/range {p11 .. p11}, Landroid/support/constraint/n/k/d;->c()I

    move-result v5

    move-object/from16 v4, p7

    goto :goto_1b

    :cond_38
    move-object/from16 v4, p7

    const/4 v5, 0x0

    :goto_1b
    if-eq v15, v4, :cond_39

    const/4 v2, 0x5

    invoke-virtual {v10, v4, v14, v5, v2}, Landroid/support/constraint/n/d;->b(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)V

    :cond_39
    return-void

    :cond_3a
    move-object/from16 v4, p7

    const/4 v2, 0x5

    move/from16 v24, v2

    move/from16 v17, v12

    move/from16 v21, v17

    move/from16 v25, v16

    const/16 v22, 0x0

    :goto_1c
    const/16 v26, 0x4

    :goto_1d
    if-eqz v17, :cond_3b

    if-ne v1, v15, :cond_3b

    if-eq v11, v5, :cond_3b

    const/16 v17, 0x0

    const/16 v27, 0x0

    goto :goto_1e

    :cond_3b
    move/from16 v27, v12

    :goto_1e
    if-eqz v21, :cond_3d

    if-nez v23, :cond_3c

    if-nez p18, :cond_3c

    if-nez p20, :cond_3c

    if-ne v1, v8, :cond_3c

    if-ne v15, v4, :cond_3c

    const/16 v21, 0x0

    const/16 v24, 0x8

    const/16 v25, 0x8

    const/16 v27, 0x0

    goto :goto_1f

    :cond_3c
    move/from16 v21, p3

    :goto_1f
    invoke-virtual/range {p10 .. p10}, Landroid/support/constraint/n/k/d;->c()I

    move-result v28

    invoke-virtual/range {p11 .. p11}, Landroid/support/constraint/n/k/d;->c()I

    move-result v29

    move-object/from16 p9, v1

    move-object/from16 v1, p1

    const/16 v12, 0x8

    move-object v2, v9

    move/from16 v30, v3

    move-object/from16 v3, p9

    move/from16 v4, v28

    move-object/from16 v31, v5

    move/from16 v5, p16

    move-object/from16 v32, v6

    move-object v6, v15

    move-object v7, v14

    move/from16 v8, v29

    move-object/from16 v33, v9

    move/from16 v9, v25

    invoke-virtual/range {v1 .. v9}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;IFLandroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)V

    goto :goto_20

    :cond_3d
    move-object/from16 p9, v1

    move/from16 v30, v3

    move-object/from16 v31, v5

    move-object/from16 v32, v6

    move-object/from16 v33, v9

    const/16 v12, 0x8

    move/from16 v21, p3

    :goto_20
    move/from16 v5, v27

    iget v1, v0, Landroid/support/constraint/n/k/e;->e0:I

    if-ne v1, v12, :cond_3e

    invoke-virtual/range {p11 .. p11}, Landroid/support/constraint/n/k/d;->j()Z

    move-result v1

    if-nez v1, :cond_3e

    return-void

    :cond_3e
    move-object/from16 v1, p9

    if-eqz v17, :cond_42

    if-eqz v21, :cond_40

    if-eq v1, v15, :cond_40

    if-nez v23, :cond_40

    instance-of v2, v11, Landroid/support/constraint/n/k/a;

    if-nez v2, :cond_3f

    move-object/from16 v2, v32

    instance-of v3, v2, Landroid/support/constraint/n/k/a;

    if-eqz v3, :cond_41

    goto :goto_21

    :cond_3f
    move-object/from16 v2, v32

    :goto_21
    move/from16 v3, v16

    goto :goto_22

    :cond_40
    move-object/from16 v2, v32

    :cond_41
    move/from16 v3, v24

    :goto_22
    invoke-virtual/range {p10 .. p10}, Landroid/support/constraint/n/k/d;->c()I

    move-result v4

    move-object/from16 v6, v33

    invoke-virtual {v10, v6, v1, v4, v3}, Landroid/support/constraint/n/d;->b(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)V

    invoke-virtual/range {p11 .. p11}, Landroid/support/constraint/n/k/d;->c()I

    move-result v4

    neg-int v4, v4

    invoke-virtual {v10, v14, v15, v4, v3}, Landroid/support/constraint/n/d;->c(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)V

    move/from16 v24, v3

    goto :goto_23

    :cond_42
    move-object/from16 v2, v32

    move-object/from16 v6, v33

    :goto_23
    if-eqz v21, :cond_43

    if-eqz p21, :cond_43

    instance-of v3, v11, Landroid/support/constraint/n/k/a;

    if-nez v3, :cond_43

    instance-of v3, v2, Landroid/support/constraint/n/k/a;

    if-nez v3, :cond_43

    move/from16 v3, v16

    move v4, v3

    const/4 v5, 0x1

    goto :goto_24

    :cond_43
    move/from16 v3, v24

    move/from16 v4, v26

    :goto_24
    if-eqz v5, :cond_50

    if-eqz v22, :cond_4c

    if-eqz p20, :cond_44

    if-eqz p4, :cond_4c

    :cond_44
    move-object/from16 v5, v31

    if-eq v11, v5, :cond_46

    if-ne v2, v5, :cond_45

    goto :goto_25

    :cond_45
    move/from16 v16, v4

    :cond_46
    :goto_25
    instance-of v7, v11, Landroid/support/constraint/n/k/g;

    if-nez v7, :cond_47

    instance-of v7, v2, Landroid/support/constraint/n/k/g;

    if-eqz v7, :cond_48

    :cond_47
    const/16 v16, 0x5

    :cond_48
    instance-of v7, v11, Landroid/support/constraint/n/k/a;

    if-nez v7, :cond_49

    instance-of v7, v2, Landroid/support/constraint/n/k/a;

    if-eqz v7, :cond_4a

    :cond_49
    const/16 v16, 0x5

    :cond_4a
    if-eqz p20, :cond_4b

    const/4 v7, 0x5

    goto :goto_26

    :cond_4b
    move/from16 v7, v16

    :goto_26
    invoke-static {v7, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    goto :goto_27

    :cond_4c
    move-object/from16 v5, v31

    :goto_27
    if-eqz v21, :cond_4f

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    if-eqz p17, :cond_4e

    if-nez p20, :cond_4e

    if-eq v11, v5, :cond_4d

    if-ne v2, v5, :cond_4e

    :cond_4d
    const/4 v4, 0x4

    goto :goto_28

    :cond_4e
    move v4, v3

    :cond_4f
    :goto_28
    invoke-virtual/range {p10 .. p10}, Landroid/support/constraint/n/k/d;->c()I

    move-result v2

    invoke-virtual {v10, v6, v1, v2, v4}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)Landroid/support/constraint/n/b;

    invoke-virtual/range {p11 .. p11}, Landroid/support/constraint/n/k/d;->c()I

    move-result v2

    neg-int v2, v2

    invoke-virtual {v10, v14, v15, v2, v4}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)Landroid/support/constraint/n/b;

    :cond_50
    if-eqz v21, :cond_52

    move-object/from16 v2, p6

    if-ne v2, v1, :cond_51

    invoke-virtual/range {p10 .. p10}, Landroid/support/constraint/n/k/d;->c()I

    move-result v5

    goto :goto_29

    :cond_51
    const/4 v5, 0x0

    :goto_29
    if-eq v1, v2, :cond_52

    const/4 v1, 0x5

    invoke-virtual {v10, v6, v2, v5, v1}, Landroid/support/constraint/n/d;->b(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)V

    :cond_52
    if-eqz v21, :cond_55

    if-eqz v23, :cond_55

    if-nez p14, :cond_55

    if-nez v20, :cond_55

    if-eqz v23, :cond_53

    move/from16 v5, v30

    const/4 v1, 0x3

    if-ne v5, v1, :cond_53

    const/4 v1, 0x0

    invoke-virtual {v10, v14, v6, v1, v12}, Landroid/support/constraint/n/d;->b(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)V

    goto :goto_2b

    :cond_53
    const/4 v1, 0x0

    const/4 v2, 0x5

    invoke-virtual {v10, v14, v6, v1, v2}, Landroid/support/constraint/n/d;->b(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)V

    goto :goto_2b

    :cond_54
    :goto_2a
    move/from16 v21, p3

    :cond_55
    :goto_2b
    if-eqz v21, :cond_59

    if-eqz v19, :cond_59

    move-object/from16 v1, p11

    iget-object v2, v1, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    if-eqz v2, :cond_56

    invoke-virtual/range {p11 .. p11}, Landroid/support/constraint/n/k/d;->c()I

    move-result v5

    move-object/from16 v3, p7

    goto :goto_2c

    :cond_56
    move-object/from16 v3, p7

    const/4 v5, 0x0

    :goto_2c
    if-eq v15, v3, :cond_59

    iget-boolean v2, v0, Landroid/support/constraint/n/k/e;->h:Z

    if-eqz v2, :cond_58

    iget-boolean v2, v14, Landroid/support/constraint/n/i;->g:Z

    if-eqz v2, :cond_58

    iget-object v0, v0, Landroid/support/constraint/n/k/e;->R:Landroid/support/constraint/n/k/e;

    if-eqz v0, :cond_58

    check-cast v0, Landroid/support/constraint/n/k/f;

    if-eqz p2, :cond_57

    invoke-virtual {v0, v1}, Landroid/support/constraint/n/k/f;->a(Landroid/support/constraint/n/k/d;)V

    goto :goto_2d

    :cond_57
    invoke-virtual {v0, v1}, Landroid/support/constraint/n/k/f;->c(Landroid/support/constraint/n/k/d;)V

    :goto_2d
    return-void

    :cond_58
    const/4 v0, 0x5

    invoke-virtual {v10, v3, v14, v5, v0}, Landroid/support/constraint/n/d;->b(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)V

    :cond_59
    return-void

    :cond_5a
    move-object/from16 v2, p6

    move-object/from16 v3, p7

    move-object v6, v9

    const/4 v1, 0x2

    const/4 v4, 0x1

    const/16 v12, 0x8

    move/from16 v5, v22

    :goto_2e
    if-ge v5, v1, :cond_5f

    if-eqz p3, :cond_5f

    if-eqz v19, :cond_5f

    const/4 v1, 0x0

    invoke-virtual {v10, v6, v2, v1, v12}, Landroid/support/constraint/n/d;->b(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)V

    if-nez p2, :cond_5c

    iget-object v1, v0, Landroid/support/constraint/n/k/e;->J:Landroid/support/constraint/n/k/d;

    iget-object v1, v1, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    if-nez v1, :cond_5b

    goto :goto_2f

    :cond_5b
    const/4 v5, 0x0

    goto :goto_30

    :cond_5c
    :goto_2f
    move v5, v4

    :goto_30
    if-nez p2, :cond_5e

    iget-object v0, v0, Landroid/support/constraint/n/k/e;->J:Landroid/support/constraint/n/k/d;

    iget-object v0, v0, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    if-eqz v0, :cond_5e

    iget-object v0, v0, Landroid/support/constraint/n/k/d;->d:Landroid/support/constraint/n/k/e;

    iget v1, v0, Landroid/support/constraint/n/k/e;->U:F

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-eqz v1, :cond_5d

    iget-object v0, v0, Landroid/support/constraint/n/k/e;->Q:[Landroid/support/constraint/n/k/e$b;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    sget-object v1, Landroid/support/constraint/n/k/e$b;->d:Landroid/support/constraint/n/k/e$b;

    if-ne v2, v1, :cond_5d

    aget-object v0, v0, v4

    if-ne v0, v1, :cond_5d

    move v5, v4

    goto :goto_31

    :cond_5d
    const/4 v5, 0x0

    :cond_5e
    :goto_31
    if-eqz v5, :cond_5f

    const/4 v0, 0x0

    invoke-virtual {v10, v3, v14, v0, v12}, Landroid/support/constraint/n/d;->b(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)V

    :cond_5f
    return-void
.end method

.method private w(I)Z
    .locals 3

    mul-int/lit8 p1, p1, 0x2

    iget-object p0, p0, Landroid/support/constraint/n/k/e;->N:[Landroid/support/constraint/n/k/d;

    aget-object v0, p0, p1

    iget-object v0, v0, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    aget-object v0, p0, p1

    iget-object v0, v0, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    iget-object v0, v0, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    aget-object v2, p0, p1

    if-eq v0, v2, :cond_0

    add-int/2addr p1, v1

    aget-object v0, p0, p1

    iget-object v0, v0, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    if-eqz v0, :cond_0

    aget-object v0, p0, p1

    iget-object v0, v0, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    iget-object v0, v0, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    aget-object p0, p0, p1

    if-ne v0, p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method


# virtual methods
.method public A()I
    .locals 2

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->F:Landroid/support/constraint/n/k/d;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->G:Landroid/support/constraint/n/k/d;

    iget v0, v0, Landroid/support/constraint/n/k/d;->g:I

    add-int/2addr v1, v0

    :cond_0
    iget-object v0, p0, Landroid/support/constraint/n/k/e;->H:Landroid/support/constraint/n/k/d;

    if-eqz v0, :cond_1

    iget-object p0, p0, Landroid/support/constraint/n/k/e;->I:Landroid/support/constraint/n/k/d;

    iget p0, p0, Landroid/support/constraint/n/k/d;->g:I

    add-int/2addr v1, p0

    :cond_1
    return v1
.end method

.method public B()I
    .locals 0

    iget p0, p0, Landroid/support/constraint/n/k/e;->e0:I

    return p0
.end method

.method public C()I
    .locals 2

    iget v0, p0, Landroid/support/constraint/n/k/e;->e0:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    iget p0, p0, Landroid/support/constraint/n/k/e;->S:I

    return p0
.end method

.method public D()I
    .locals 2

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->R:Landroid/support/constraint/n/k/e;

    if-eqz v0, :cond_0

    instance-of v1, v0, Landroid/support/constraint/n/k/f;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/support/constraint/n/k/f;

    iget v0, v0, Landroid/support/constraint/n/k/f;->w0:I

    iget p0, p0, Landroid/support/constraint/n/k/e;->W:I

    add-int/2addr v0, p0

    return v0

    :cond_0
    iget p0, p0, Landroid/support/constraint/n/k/e;->W:I

    return p0
.end method

.method public E()I
    .locals 2

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->R:Landroid/support/constraint/n/k/e;

    if-eqz v0, :cond_0

    instance-of v1, v0, Landroid/support/constraint/n/k/f;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/support/constraint/n/k/f;

    iget v0, v0, Landroid/support/constraint/n/k/f;->x0:I

    iget p0, p0, Landroid/support/constraint/n/k/e;->X:I

    add-int/2addr v0, p0

    return v0

    :cond_0
    iget p0, p0, Landroid/support/constraint/n/k/e;->X:I

    return p0
.end method

.method public F()Z
    .locals 0

    iget-boolean p0, p0, Landroid/support/constraint/n/k/e;->A:Z

    return p0
.end method

.method public G()Z
    .locals 4

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->O:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    iget-object v3, p0, Landroid/support/constraint/n/k/e;->O:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/support/constraint/n/k/d;

    invoke-virtual {v3}, Landroid/support/constraint/n/k/d;->j()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public H()Z
    .locals 2

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->F:Landroid/support/constraint/n/k/d;

    iget-object v1, v0, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    if-eqz v1, :cond_0

    iget-object v1, v1, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    if-eq v1, v0, :cond_1

    :cond_0
    iget-object p0, p0, Landroid/support/constraint/n/k/e;->H:Landroid/support/constraint/n/k/d;

    iget-object v0, p0, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    if-eqz v0, :cond_2

    iget-object v0, v0, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    if-ne v0, p0, :cond_2

    :cond_1
    const/4 p0, 0x1

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public I()Z
    .locals 0

    iget-boolean p0, p0, Landroid/support/constraint/n/k/e;->B:Z

    return p0
.end method

.method public J()Z
    .locals 2

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->G:Landroid/support/constraint/n/k/d;

    iget-object v1, v0, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    if-eqz v1, :cond_0

    iget-object v1, v1, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    if-eq v1, v0, :cond_1

    :cond_0
    iget-object p0, p0, Landroid/support/constraint/n/k/e;->I:Landroid/support/constraint/n/k/d;

    iget-object v0, p0, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    if-eqz v0, :cond_2

    iget-object v0, v0, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    if-ne v0, p0, :cond_2

    :cond_1
    const/4 p0, 0x1

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public K()Z
    .locals 0

    iget-boolean p0, p0, Landroid/support/constraint/n/k/e;->C:Z

    return p0
.end method

.method public L()Z
    .locals 1

    iget-boolean v0, p0, Landroid/support/constraint/n/k/e;->g:Z

    if-eqz v0, :cond_0

    iget p0, p0, Landroid/support/constraint/n/k/e;->e0:I

    const/16 v0, 0x8

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public M()Z
    .locals 1

    iget-boolean v0, p0, Landroid/support/constraint/n/k/e;->j:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->F:Landroid/support/constraint/n/k/d;

    invoke-virtual {v0}, Landroid/support/constraint/n/k/d;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Landroid/support/constraint/n/k/e;->H:Landroid/support/constraint/n/k/d;

    invoke-virtual {p0}, Landroid/support/constraint/n/k/d;->k()Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public N()Z
    .locals 1

    iget-boolean v0, p0, Landroid/support/constraint/n/k/e;->k:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->G:Landroid/support/constraint/n/k/d;

    invoke-virtual {v0}, Landroid/support/constraint/n/k/d;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Landroid/support/constraint/n/k/e;->I:Landroid/support/constraint/n/k/d;

    invoke-virtual {p0}, Landroid/support/constraint/n/k/d;->k()Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public O()Z
    .locals 4

    iget-object p0, p0, Landroid/support/constraint/n/k/e;->Q:[Landroid/support/constraint/n/k/e$b;

    const/4 v0, 0x0

    aget-object v1, p0, v0

    sget-object v2, Landroid/support/constraint/n/k/e$b;->d:Landroid/support/constraint/n/k/e$b;

    const/4 v3, 0x1

    if-ne v1, v2, :cond_0

    aget-object p0, p0, v3

    if-ne p0, v2, :cond_0

    move v0, v3

    :cond_0
    return v0
.end method

.method public P()V
    .locals 6

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->F:Landroid/support/constraint/n/k/d;

    invoke-virtual {v0}, Landroid/support/constraint/n/k/d;->m()V

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->G:Landroid/support/constraint/n/k/d;

    invoke-virtual {v0}, Landroid/support/constraint/n/k/d;->m()V

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->H:Landroid/support/constraint/n/k/d;

    invoke-virtual {v0}, Landroid/support/constraint/n/k/d;->m()V

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->I:Landroid/support/constraint/n/k/d;

    invoke-virtual {v0}, Landroid/support/constraint/n/k/d;->m()V

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->J:Landroid/support/constraint/n/k/d;

    invoke-virtual {v0}, Landroid/support/constraint/n/k/d;->m()V

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->K:Landroid/support/constraint/n/k/d;

    invoke-virtual {v0}, Landroid/support/constraint/n/k/d;->m()V

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->L:Landroid/support/constraint/n/k/d;

    invoke-virtual {v0}, Landroid/support/constraint/n/k/d;->m()V

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->M:Landroid/support/constraint/n/k/d;

    invoke-virtual {v0}, Landroid/support/constraint/n/k/d;->m()V

    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/constraint/n/k/e;->R:Landroid/support/constraint/n/k/e;

    const/4 v1, 0x0

    iput v1, p0, Landroid/support/constraint/n/k/e;->z:F

    const/4 v2, 0x0

    iput v2, p0, Landroid/support/constraint/n/k/e;->S:I

    iput v2, p0, Landroid/support/constraint/n/k/e;->T:I

    iput v1, p0, Landroid/support/constraint/n/k/e;->U:F

    const/4 v1, -0x1

    iput v1, p0, Landroid/support/constraint/n/k/e;->V:I

    iput v2, p0, Landroid/support/constraint/n/k/e;->W:I

    iput v2, p0, Landroid/support/constraint/n/k/e;->X:I

    iput v2, p0, Landroid/support/constraint/n/k/e;->Y:I

    iput v2, p0, Landroid/support/constraint/n/k/e;->Z:I

    iput v2, p0, Landroid/support/constraint/n/k/e;->a0:I

    sget v3, Landroid/support/constraint/n/k/e;->o0:F

    iput v3, p0, Landroid/support/constraint/n/k/e;->b0:F

    iput v3, p0, Landroid/support/constraint/n/k/e;->c0:F

    iget-object v3, p0, Landroid/support/constraint/n/k/e;->Q:[Landroid/support/constraint/n/k/e$b;

    sget-object v4, Landroid/support/constraint/n/k/e$b;->b:Landroid/support/constraint/n/k/e$b;

    aput-object v4, v3, v2

    const/4 v5, 0x1

    aput-object v4, v3, v5

    iput-object v0, p0, Landroid/support/constraint/n/k/e;->d0:Ljava/lang/Object;

    iput v2, p0, Landroid/support/constraint/n/k/e;->e0:I

    iput-object v0, p0, Landroid/support/constraint/n/k/e;->g0:Ljava/lang/String;

    iput v2, p0, Landroid/support/constraint/n/k/e;->h0:I

    iput v2, p0, Landroid/support/constraint/n/k/e;->i0:I

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->j0:[F

    const/high16 v3, -0x40800000    # -1.0f

    aput v3, v0, v2

    aput v3, v0, v5

    iput v1, p0, Landroid/support/constraint/n/k/e;->l:I

    iput v1, p0, Landroid/support/constraint/n/k/e;->m:I

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->y:[I

    const v3, 0x7fffffff

    aput v3, v0, v2

    aput v3, v0, v5

    iput v2, p0, Landroid/support/constraint/n/k/e;->n:I

    iput v2, p0, Landroid/support/constraint/n/k/e;->o:I

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Landroid/support/constraint/n/k/e;->s:F

    iput v0, p0, Landroid/support/constraint/n/k/e;->v:F

    iput v3, p0, Landroid/support/constraint/n/k/e;->r:I

    iput v3, p0, Landroid/support/constraint/n/k/e;->u:I

    iput v2, p0, Landroid/support/constraint/n/k/e;->q:I

    iput v2, p0, Landroid/support/constraint/n/k/e;->t:I

    iput v1, p0, Landroid/support/constraint/n/k/e;->w:I

    iput v0, p0, Landroid/support/constraint/n/k/e;->x:F

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->f:[Z

    aput-boolean v5, v0, v2

    aput-boolean v5, v0, v5

    iput-boolean v2, p0, Landroid/support/constraint/n/k/e;->C:Z

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->P:[Z

    aput-boolean v2, v0, v2

    aput-boolean v2, v0, v5

    iput-boolean v5, p0, Landroid/support/constraint/n/k/e;->g:Z

    return-void
.end method

.method public Q()V
    .locals 3

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/constraint/n/k/e;->j:Z

    iput-boolean v0, p0, Landroid/support/constraint/n/k/e;->k:Z

    iget-object v1, p0, Landroid/support/constraint/n/k/e;->O:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    :goto_0
    if-ge v0, v1, :cond_0

    iget-object v2, p0, Landroid/support/constraint/n/k/e;->O:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/support/constraint/n/k/d;

    invoke-virtual {v2}, Landroid/support/constraint/n/k/d;->n()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public a(I)F
    .locals 1

    if-nez p1, :cond_0

    iget p0, p0, Landroid/support/constraint/n/k/e;->b0:F

    return p0

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    iget p0, p0, Landroid/support/constraint/n/k/e;->c0:F

    return p0

    :cond_1
    const/high16 p0, -0x40800000    # -1.0f

    return p0
.end method

.method public a(Landroid/support/constraint/n/k/d$b;)Landroid/support/constraint/n/k/d;
    .locals 2

    sget-object v0, Landroid/support/constraint/n/k/e$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance p0, Ljava/lang/AssertionError;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p0

    :pswitch_0
    const/4 p0, 0x0

    return-object p0

    :pswitch_1
    iget-object p0, p0, Landroid/support/constraint/n/k/e;->L:Landroid/support/constraint/n/k/d;

    return-object p0

    :pswitch_2
    iget-object p0, p0, Landroid/support/constraint/n/k/e;->K:Landroid/support/constraint/n/k/d;

    return-object p0

    :pswitch_3
    iget-object p0, p0, Landroid/support/constraint/n/k/e;->M:Landroid/support/constraint/n/k/d;

    return-object p0

    :pswitch_4
    iget-object p0, p0, Landroid/support/constraint/n/k/e;->J:Landroid/support/constraint/n/k/d;

    return-object p0

    :pswitch_5
    iget-object p0, p0, Landroid/support/constraint/n/k/e;->I:Landroid/support/constraint/n/k/d;

    return-object p0

    :pswitch_6
    iget-object p0, p0, Landroid/support/constraint/n/k/e;->H:Landroid/support/constraint/n/k/d;

    return-object p0

    :pswitch_7
    iget-object p0, p0, Landroid/support/constraint/n/k/e;->G:Landroid/support/constraint/n/k/d;

    return-object p0

    :pswitch_8
    iget-object p0, p0, Landroid/support/constraint/n/k/e;->F:Landroid/support/constraint/n/k/d;

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public a(F)V
    .locals 0

    iput p1, p0, Landroid/support/constraint/n/k/e;->b0:F

    return-void
.end method

.method public a(II)V
    .locals 1

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->F:Landroid/support/constraint/n/k/d;

    invoke-virtual {v0, p1}, Landroid/support/constraint/n/k/d;->a(I)V

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->H:Landroid/support/constraint/n/k/d;

    invoke-virtual {v0, p2}, Landroid/support/constraint/n/k/d;->a(I)V

    iput p1, p0, Landroid/support/constraint/n/k/e;->W:I

    sub-int/2addr p2, p1

    iput p2, p0, Landroid/support/constraint/n/k/e;->S:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroid/support/constraint/n/k/e;->j:Z

    return-void
.end method

.method public a(IIIF)V
    .locals 0

    iput p1, p0, Landroid/support/constraint/n/k/e;->n:I

    iput p2, p0, Landroid/support/constraint/n/k/e;->q:I

    const p1, 0x7fffffff

    if-ne p3, p1, :cond_0

    const/4 p3, 0x0

    :cond_0
    iput p3, p0, Landroid/support/constraint/n/k/e;->r:I

    iput p4, p0, Landroid/support/constraint/n/k/e;->s:F

    const/4 p1, 0x0

    cmpl-float p1, p4, p1

    if-lez p1, :cond_1

    const/high16 p1, 0x3f800000    # 1.0f

    cmpg-float p1, p4, p1

    if-gez p1, :cond_1

    iget p1, p0, Landroid/support/constraint/n/k/e;->n:I

    if-nez p1, :cond_1

    const/4 p1, 0x2

    iput p1, p0, Landroid/support/constraint/n/k/e;->n:I

    :cond_1
    return-void
.end method

.method public a(IIII)V
    .locals 1

    sub-int/2addr p3, p1

    sub-int/2addr p4, p2

    iput p1, p0, Landroid/support/constraint/n/k/e;->W:I

    iput p2, p0, Landroid/support/constraint/n/k/e;->X:I

    iget p1, p0, Landroid/support/constraint/n/k/e;->e0:I

    const/4 p2, 0x0

    const/16 v0, 0x8

    if-ne p1, v0, :cond_0

    iput p2, p0, Landroid/support/constraint/n/k/e;->S:I

    iput p2, p0, Landroid/support/constraint/n/k/e;->T:I

    return-void

    :cond_0
    iget-object p1, p0, Landroid/support/constraint/n/k/e;->Q:[Landroid/support/constraint/n/k/e$b;

    aget-object p1, p1, p2

    sget-object p2, Landroid/support/constraint/n/k/e$b;->b:Landroid/support/constraint/n/k/e$b;

    if-ne p1, p2, :cond_1

    iget p1, p0, Landroid/support/constraint/n/k/e;->S:I

    if-ge p3, p1, :cond_1

    move p3, p1

    :cond_1
    iget-object p1, p0, Landroid/support/constraint/n/k/e;->Q:[Landroid/support/constraint/n/k/e$b;

    const/4 p2, 0x1

    aget-object p1, p1, p2

    sget-object p2, Landroid/support/constraint/n/k/e$b;->b:Landroid/support/constraint/n/k/e$b;

    if-ne p1, p2, :cond_2

    iget p1, p0, Landroid/support/constraint/n/k/e;->T:I

    if-ge p4, p1, :cond_2

    move p4, p1

    :cond_2
    iput p3, p0, Landroid/support/constraint/n/k/e;->S:I

    iput p4, p0, Landroid/support/constraint/n/k/e;->T:I

    iget p1, p0, Landroid/support/constraint/n/k/e;->a0:I

    if-ge p4, p1, :cond_3

    iput p1, p0, Landroid/support/constraint/n/k/e;->T:I

    :cond_3
    iget p1, p0, Landroid/support/constraint/n/k/e;->S:I

    iget p2, p0, Landroid/support/constraint/n/k/e;->Z:I

    if-ge p1, p2, :cond_4

    iput p2, p0, Landroid/support/constraint/n/k/e;->S:I

    :cond_4
    return-void
.end method

.method protected a(IZ)V
    .locals 0

    iget-object p0, p0, Landroid/support/constraint/n/k/e;->P:[Z

    aput-boolean p2, p0, p1

    return-void
.end method

.method public a(Landroid/support/constraint/n/c;)V
    .locals 1

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->F:Landroid/support/constraint/n/k/d;

    invoke-virtual {v0, p1}, Landroid/support/constraint/n/k/d;->a(Landroid/support/constraint/n/c;)V

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->G:Landroid/support/constraint/n/k/d;

    invoke-virtual {v0, p1}, Landroid/support/constraint/n/k/d;->a(Landroid/support/constraint/n/c;)V

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->H:Landroid/support/constraint/n/k/d;

    invoke-virtual {v0, p1}, Landroid/support/constraint/n/k/d;->a(Landroid/support/constraint/n/c;)V

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->I:Landroid/support/constraint/n/k/d;

    invoke-virtual {v0, p1}, Landroid/support/constraint/n/k/d;->a(Landroid/support/constraint/n/c;)V

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->J:Landroid/support/constraint/n/k/d;

    invoke-virtual {v0, p1}, Landroid/support/constraint/n/k/d;->a(Landroid/support/constraint/n/c;)V

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->M:Landroid/support/constraint/n/k/d;

    invoke-virtual {v0, p1}, Landroid/support/constraint/n/k/d;->a(Landroid/support/constraint/n/c;)V

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->K:Landroid/support/constraint/n/k/d;

    invoke-virtual {v0, p1}, Landroid/support/constraint/n/k/d;->a(Landroid/support/constraint/n/c;)V

    iget-object p0, p0, Landroid/support/constraint/n/k/e;->L:Landroid/support/constraint/n/k/d;

    invoke-virtual {p0, p1}, Landroid/support/constraint/n/k/d;->a(Landroid/support/constraint/n/c;)V

    return-void
.end method

.method public a(Landroid/support/constraint/n/d;)V
    .locals 1

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->F:Landroid/support/constraint/n/k/d;

    invoke-virtual {p1, v0}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->G:Landroid/support/constraint/n/k/d;

    invoke-virtual {p1, v0}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->H:Landroid/support/constraint/n/k/d;

    invoke-virtual {p1, v0}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->I:Landroid/support/constraint/n/k/d;

    invoke-virtual {p1, v0}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    iget v0, p0, Landroid/support/constraint/n/k/e;->Y:I

    if-lez v0, :cond_0

    iget-object p0, p0, Landroid/support/constraint/n/k/e;->J:Landroid/support/constraint/n/k/d;

    invoke-virtual {p1, p0}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    :cond_0
    return-void
.end method

.method public a(Landroid/support/constraint/n/d;Z)V
    .locals 50

    move-object/from16 v15, p0

    move-object/from16 v14, p1

    iget-object v0, v15, Landroid/support/constraint/n/k/e;->F:Landroid/support/constraint/n/k/d;

    invoke-virtual {v14, v0}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object v13

    iget-object v0, v15, Landroid/support/constraint/n/k/e;->H:Landroid/support/constraint/n/k/d;

    invoke-virtual {v14, v0}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object v12

    iget-object v0, v15, Landroid/support/constraint/n/k/e;->G:Landroid/support/constraint/n/k/d;

    invoke-virtual {v14, v0}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object v11

    iget-object v0, v15, Landroid/support/constraint/n/k/e;->I:Landroid/support/constraint/n/k/d;

    invoke-virtual {v14, v0}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object v10

    iget-object v0, v15, Landroid/support/constraint/n/k/e;->J:Landroid/support/constraint/n/k/d;

    invoke-virtual {v14, v0}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object v9

    iget-object v0, v15, Landroid/support/constraint/n/k/e;->R:Landroid/support/constraint/n/k/e;

    const/4 v8, 0x1

    const/4 v7, 0x0

    if-eqz v0, :cond_2

    if-eqz v0, :cond_0

    iget-object v0, v0, Landroid/support/constraint/n/k/e;->Q:[Landroid/support/constraint/n/k/e$b;

    aget-object v0, v0, v7

    sget-object v1, Landroid/support/constraint/n/k/e$b;->c:Landroid/support/constraint/n/k/e$b;

    if-ne v0, v1, :cond_0

    move v0, v8

    goto :goto_0

    :cond_0
    move v0, v7

    :goto_0
    iget-object v1, v15, Landroid/support/constraint/n/k/e;->R:Landroid/support/constraint/n/k/e;

    if-eqz v1, :cond_1

    iget-object v1, v1, Landroid/support/constraint/n/k/e;->Q:[Landroid/support/constraint/n/k/e$b;

    aget-object v1, v1, v8

    sget-object v2, Landroid/support/constraint/n/k/e$b;->c:Landroid/support/constraint/n/k/e$b;

    if-ne v1, v2, :cond_1

    move v1, v8

    goto :goto_1

    :cond_1
    move v1, v7

    :goto_1
    move v5, v0

    move v6, v1

    goto :goto_2

    :cond_2
    move v5, v7

    move v6, v5

    :goto_2
    iget v0, v15, Landroid/support/constraint/n/k/e;->e0:I

    const/16 v4, 0x8

    if-ne v0, v4, :cond_3

    invoke-virtual/range {p0 .. p0}, Landroid/support/constraint/n/k/e;->G()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, v15, Landroid/support/constraint/n/k/e;->P:[Z

    aget-boolean v1, v0, v7

    if-nez v1, :cond_3

    aget-boolean v0, v0, v8

    if-nez v0, :cond_3

    return-void

    :cond_3
    iget-boolean v0, v15, Landroid/support/constraint/n/k/e;->j:Z

    const/4 v3, 0x5

    if-nez v0, :cond_4

    iget-boolean v0, v15, Landroid/support/constraint/n/k/e;->k:Z

    if-eqz v0, :cond_a

    :cond_4
    iget-boolean v0, v15, Landroid/support/constraint/n/k/e;->j:Z

    if-eqz v0, :cond_6

    iget v0, v15, Landroid/support/constraint/n/k/e;->W:I

    invoke-virtual {v14, v13, v0}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/i;I)V

    iget v0, v15, Landroid/support/constraint/n/k/e;->W:I

    iget v1, v15, Landroid/support/constraint/n/k/e;->S:I

    add-int/2addr v0, v1

    invoke-virtual {v14, v12, v0}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/i;I)V

    if-eqz v5, :cond_6

    iget-object v0, v15, Landroid/support/constraint/n/k/e;->R:Landroid/support/constraint/n/k/e;

    if-eqz v0, :cond_6

    iget-boolean v1, v15, Landroid/support/constraint/n/k/e;->i:Z

    if-eqz v1, :cond_5

    check-cast v0, Landroid/support/constraint/n/k/f;

    iget-object v1, v15, Landroid/support/constraint/n/k/e;->F:Landroid/support/constraint/n/k/d;

    invoke-virtual {v0, v1}, Landroid/support/constraint/n/k/f;->d(Landroid/support/constraint/n/k/d;)V

    iget-object v1, v15, Landroid/support/constraint/n/k/e;->H:Landroid/support/constraint/n/k/d;

    invoke-virtual {v0, v1}, Landroid/support/constraint/n/k/f;->a(Landroid/support/constraint/n/k/d;)V

    goto :goto_3

    :cond_5
    iget-object v0, v0, Landroid/support/constraint/n/k/e;->H:Landroid/support/constraint/n/k/d;

    invoke-virtual {v14, v0}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object v0

    invoke-virtual {v14, v0, v12, v7, v3}, Landroid/support/constraint/n/d;->b(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)V

    :cond_6
    :goto_3
    iget-boolean v0, v15, Landroid/support/constraint/n/k/e;->k:Z

    if-eqz v0, :cond_9

    iget v0, v15, Landroid/support/constraint/n/k/e;->X:I

    invoke-virtual {v14, v11, v0}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/i;I)V

    iget v0, v15, Landroid/support/constraint/n/k/e;->X:I

    iget v1, v15, Landroid/support/constraint/n/k/e;->T:I

    add-int/2addr v0, v1

    invoke-virtual {v14, v10, v0}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/i;I)V

    iget-object v0, v15, Landroid/support/constraint/n/k/e;->J:Landroid/support/constraint/n/k/d;

    invoke-virtual {v0}, Landroid/support/constraint/n/k/d;->j()Z

    move-result v0

    if-eqz v0, :cond_7

    iget v0, v15, Landroid/support/constraint/n/k/e;->X:I

    iget v1, v15, Landroid/support/constraint/n/k/e;->Y:I

    add-int/2addr v0, v1

    invoke-virtual {v14, v9, v0}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/i;I)V

    :cond_7
    if-eqz v6, :cond_9

    iget-object v0, v15, Landroid/support/constraint/n/k/e;->R:Landroid/support/constraint/n/k/e;

    if-eqz v0, :cond_9

    iget-boolean v1, v15, Landroid/support/constraint/n/k/e;->i:Z

    if-eqz v1, :cond_8

    check-cast v0, Landroid/support/constraint/n/k/f;

    iget-object v1, v15, Landroid/support/constraint/n/k/e;->G:Landroid/support/constraint/n/k/d;

    invoke-virtual {v0, v1}, Landroid/support/constraint/n/k/f;->d(Landroid/support/constraint/n/k/d;)V

    iget-object v1, v15, Landroid/support/constraint/n/k/e;->I:Landroid/support/constraint/n/k/d;

    invoke-virtual {v0, v1}, Landroid/support/constraint/n/k/f;->c(Landroid/support/constraint/n/k/d;)V

    goto :goto_4

    :cond_8
    iget-object v0, v0, Landroid/support/constraint/n/k/e;->I:Landroid/support/constraint/n/k/d;

    invoke-virtual {v14, v0}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object v0

    invoke-virtual {v14, v0, v10, v7, v3}, Landroid/support/constraint/n/d;->b(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)V

    :cond_9
    :goto_4
    iget-boolean v0, v15, Landroid/support/constraint/n/k/e;->j:Z

    if-eqz v0, :cond_a

    iget-boolean v0, v15, Landroid/support/constraint/n/k/e;->k:Z

    if-eqz v0, :cond_a

    iput-boolean v7, v15, Landroid/support/constraint/n/k/e;->j:Z

    iput-boolean v7, v15, Landroid/support/constraint/n/k/e;->k:Z

    return-void

    :cond_a
    sget-object v0, Landroid/support/constraint/n/d;->x:Landroid/support/constraint/n/e;

    const-wide/16 v1, 0x1

    if-eqz v0, :cond_b

    iget-wide v3, v0, Landroid/support/constraint/n/e;->y:J

    add-long/2addr v3, v1

    iput-wide v3, v0, Landroid/support/constraint/n/e;->y:J

    :cond_b
    if-eqz p2, :cond_f

    iget-object v0, v15, Landroid/support/constraint/n/k/e;->d:Landroid/support/constraint/n/k/m/l;

    if-eqz v0, :cond_f

    iget-object v3, v15, Landroid/support/constraint/n/k/e;->e:Landroid/support/constraint/n/k/m/n;

    if-eqz v3, :cond_f

    iget-object v4, v0, Landroid/support/constraint/n/k/m/p;->h:Landroid/support/constraint/n/k/m/f;

    iget-boolean v4, v4, Landroid/support/constraint/n/k/m/f;->j:Z

    if-eqz v4, :cond_f

    iget-object v0, v0, Landroid/support/constraint/n/k/m/p;->i:Landroid/support/constraint/n/k/m/f;

    iget-boolean v0, v0, Landroid/support/constraint/n/k/m/f;->j:Z

    if-eqz v0, :cond_f

    iget-object v0, v3, Landroid/support/constraint/n/k/m/p;->h:Landroid/support/constraint/n/k/m/f;

    iget-boolean v0, v0, Landroid/support/constraint/n/k/m/f;->j:Z

    if-eqz v0, :cond_f

    iget-object v0, v3, Landroid/support/constraint/n/k/m/p;->i:Landroid/support/constraint/n/k/m/f;

    iget-boolean v0, v0, Landroid/support/constraint/n/k/m/f;->j:Z

    if-eqz v0, :cond_f

    sget-object v0, Landroid/support/constraint/n/d;->x:Landroid/support/constraint/n/e;

    if-eqz v0, :cond_c

    iget-wide v3, v0, Landroid/support/constraint/n/e;->r:J

    add-long/2addr v3, v1

    iput-wide v3, v0, Landroid/support/constraint/n/e;->r:J

    :cond_c
    iget-object v0, v15, Landroid/support/constraint/n/k/e;->d:Landroid/support/constraint/n/k/m/l;

    iget-object v0, v0, Landroid/support/constraint/n/k/m/p;->h:Landroid/support/constraint/n/k/m/f;

    iget v0, v0, Landroid/support/constraint/n/k/m/f;->g:I

    invoke-virtual {v14, v13, v0}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/i;I)V

    iget-object v0, v15, Landroid/support/constraint/n/k/e;->d:Landroid/support/constraint/n/k/m/l;

    iget-object v0, v0, Landroid/support/constraint/n/k/m/p;->i:Landroid/support/constraint/n/k/m/f;

    iget v0, v0, Landroid/support/constraint/n/k/m/f;->g:I

    invoke-virtual {v14, v12, v0}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/i;I)V

    iget-object v0, v15, Landroid/support/constraint/n/k/e;->e:Landroid/support/constraint/n/k/m/n;

    iget-object v0, v0, Landroid/support/constraint/n/k/m/p;->h:Landroid/support/constraint/n/k/m/f;

    iget v0, v0, Landroid/support/constraint/n/k/m/f;->g:I

    invoke-virtual {v14, v11, v0}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/i;I)V

    iget-object v0, v15, Landroid/support/constraint/n/k/e;->e:Landroid/support/constraint/n/k/m/n;

    iget-object v0, v0, Landroid/support/constraint/n/k/m/p;->i:Landroid/support/constraint/n/k/m/f;

    iget v0, v0, Landroid/support/constraint/n/k/m/f;->g:I

    invoke-virtual {v14, v10, v0}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/i;I)V

    iget-object v0, v15, Landroid/support/constraint/n/k/e;->e:Landroid/support/constraint/n/k/m/n;

    iget-object v0, v0, Landroid/support/constraint/n/k/m/n;->k:Landroid/support/constraint/n/k/m/f;

    iget v0, v0, Landroid/support/constraint/n/k/m/f;->g:I

    invoke-virtual {v14, v9, v0}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/i;I)V

    iget-object v0, v15, Landroid/support/constraint/n/k/e;->R:Landroid/support/constraint/n/k/e;

    if-eqz v0, :cond_e

    if-eqz v5, :cond_d

    iget-object v0, v15, Landroid/support/constraint/n/k/e;->f:[Z

    aget-boolean v0, v0, v7

    if-eqz v0, :cond_d

    invoke-virtual/range {p0 .. p0}, Landroid/support/constraint/n/k/e;->H()Z

    move-result v0

    if-nez v0, :cond_d

    iget-object v0, v15, Landroid/support/constraint/n/k/e;->R:Landroid/support/constraint/n/k/e;

    iget-object v0, v0, Landroid/support/constraint/n/k/e;->H:Landroid/support/constraint/n/k/d;

    invoke-virtual {v14, v0}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v14, v0, v12, v7, v1}, Landroid/support/constraint/n/d;->b(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)V

    :cond_d
    if-eqz v6, :cond_e

    iget-object v0, v15, Landroid/support/constraint/n/k/e;->f:[Z

    aget-boolean v0, v0, v8

    if-eqz v0, :cond_e

    invoke-virtual/range {p0 .. p0}, Landroid/support/constraint/n/k/e;->J()Z

    move-result v0

    if-nez v0, :cond_e

    iget-object v0, v15, Landroid/support/constraint/n/k/e;->R:Landroid/support/constraint/n/k/e;

    iget-object v0, v0, Landroid/support/constraint/n/k/e;->I:Landroid/support/constraint/n/k/d;

    invoke-virtual {v14, v0}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v14, v0, v10, v7, v1}, Landroid/support/constraint/n/d;->b(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)V

    :cond_e
    iput-boolean v7, v15, Landroid/support/constraint/n/k/e;->j:Z

    iput-boolean v7, v15, Landroid/support/constraint/n/k/e;->k:Z

    return-void

    :cond_f
    sget-object v0, Landroid/support/constraint/n/d;->x:Landroid/support/constraint/n/e;

    if-eqz v0, :cond_10

    iget-wide v3, v0, Landroid/support/constraint/n/e;->s:J

    add-long/2addr v3, v1

    iput-wide v3, v0, Landroid/support/constraint/n/e;->s:J

    :cond_10
    iget-object v0, v15, Landroid/support/constraint/n/k/e;->R:Landroid/support/constraint/n/k/e;

    if-eqz v0, :cond_15

    invoke-direct {v15, v7}, Landroid/support/constraint/n/k/e;->w(I)Z

    move-result v0

    if-eqz v0, :cond_11

    iget-object v0, v15, Landroid/support/constraint/n/k/e;->R:Landroid/support/constraint/n/k/e;

    check-cast v0, Landroid/support/constraint/n/k/f;

    invoke-virtual {v0, v15, v7}, Landroid/support/constraint/n/k/f;->a(Landroid/support/constraint/n/k/e;I)V

    move v0, v8

    goto :goto_5

    :cond_11
    invoke-virtual/range {p0 .. p0}, Landroid/support/constraint/n/k/e;->H()Z

    move-result v0

    :goto_5
    invoke-direct {v15, v8}, Landroid/support/constraint/n/k/e;->w(I)Z

    move-result v1

    if-eqz v1, :cond_12

    iget-object v1, v15, Landroid/support/constraint/n/k/e;->R:Landroid/support/constraint/n/k/e;

    check-cast v1, Landroid/support/constraint/n/k/f;

    invoke-virtual {v1, v15, v8}, Landroid/support/constraint/n/k/f;->a(Landroid/support/constraint/n/k/e;I)V

    move v1, v8

    goto :goto_6

    :cond_12
    invoke-virtual/range {p0 .. p0}, Landroid/support/constraint/n/k/e;->J()Z

    move-result v1

    :goto_6
    if-nez v0, :cond_13

    if-eqz v5, :cond_13

    iget v2, v15, Landroid/support/constraint/n/k/e;->e0:I

    const/16 v3, 0x8

    if-eq v2, v3, :cond_13

    iget-object v2, v15, Landroid/support/constraint/n/k/e;->F:Landroid/support/constraint/n/k/d;

    iget-object v2, v2, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    if-nez v2, :cond_13

    iget-object v2, v15, Landroid/support/constraint/n/k/e;->H:Landroid/support/constraint/n/k/d;

    iget-object v2, v2, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    if-nez v2, :cond_13

    iget-object v2, v15, Landroid/support/constraint/n/k/e;->R:Landroid/support/constraint/n/k/e;

    iget-object v2, v2, Landroid/support/constraint/n/k/e;->H:Landroid/support/constraint/n/k/d;

    invoke-virtual {v14, v2}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object v2

    invoke-virtual {v14, v2, v12, v7, v8}, Landroid/support/constraint/n/d;->b(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)V

    :cond_13
    if-nez v1, :cond_14

    if-eqz v6, :cond_14

    iget v2, v15, Landroid/support/constraint/n/k/e;->e0:I

    const/16 v3, 0x8

    if-eq v2, v3, :cond_14

    iget-object v2, v15, Landroid/support/constraint/n/k/e;->G:Landroid/support/constraint/n/k/d;

    iget-object v2, v2, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    if-nez v2, :cond_14

    iget-object v2, v15, Landroid/support/constraint/n/k/e;->I:Landroid/support/constraint/n/k/d;

    iget-object v2, v2, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    if-nez v2, :cond_14

    iget-object v2, v15, Landroid/support/constraint/n/k/e;->J:Landroid/support/constraint/n/k/d;

    if-nez v2, :cond_14

    iget-object v2, v15, Landroid/support/constraint/n/k/e;->R:Landroid/support/constraint/n/k/e;

    iget-object v2, v2, Landroid/support/constraint/n/k/e;->I:Landroid/support/constraint/n/k/d;

    invoke-virtual {v14, v2}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object v2

    invoke-virtual {v14, v2, v10, v7, v8}, Landroid/support/constraint/n/d;->b(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)V

    :cond_14
    move/from16 v29, v0

    move/from16 v28, v1

    goto :goto_7

    :cond_15
    move/from16 v28, v7

    move/from16 v29, v28

    :goto_7
    iget v0, v15, Landroid/support/constraint/n/k/e;->S:I

    iget v1, v15, Landroid/support/constraint/n/k/e;->Z:I

    if-ge v0, v1, :cond_16

    move v0, v1

    :cond_16
    iget v1, v15, Landroid/support/constraint/n/k/e;->T:I

    iget v2, v15, Landroid/support/constraint/n/k/e;->a0:I

    if-ge v1, v2, :cond_17

    move v1, v2

    :cond_17
    iget-object v2, v15, Landroid/support/constraint/n/k/e;->Q:[Landroid/support/constraint/n/k/e$b;

    aget-object v2, v2, v7

    sget-object v3, Landroid/support/constraint/n/k/e$b;->d:Landroid/support/constraint/n/k/e$b;

    if-eq v2, v3, :cond_18

    move v2, v8

    goto :goto_8

    :cond_18
    move v2, v7

    :goto_8
    iget-object v3, v15, Landroid/support/constraint/n/k/e;->Q:[Landroid/support/constraint/n/k/e$b;

    aget-object v3, v3, v8

    sget-object v4, Landroid/support/constraint/n/k/e$b;->d:Landroid/support/constraint/n/k/e$b;

    if-eq v3, v4, :cond_19

    move v3, v8

    goto :goto_9

    :cond_19
    move v3, v7

    :goto_9
    iget v4, v15, Landroid/support/constraint/n/k/e;->V:I

    iput v4, v15, Landroid/support/constraint/n/k/e;->w:I

    iget v4, v15, Landroid/support/constraint/n/k/e;->U:F

    iput v4, v15, Landroid/support/constraint/n/k/e;->x:F

    iget v8, v15, Landroid/support/constraint/n/k/e;->n:I

    iget v7, v15, Landroid/support/constraint/n/k/e;->o:I

    const/16 v20, 0x0

    cmpl-float v4, v4, v20

    const/16 v20, 0x4

    move/from16 v21, v0

    if-lez v4, :cond_23

    iget v4, v15, Landroid/support/constraint/n/k/e;->e0:I

    const/16 v0, 0x8

    if-eq v4, v0, :cond_23

    iget-object v0, v15, Landroid/support/constraint/n/k/e;->Q:[Landroid/support/constraint/n/k/e$b;

    const/4 v4, 0x0

    aget-object v0, v0, v4

    sget-object v4, Landroid/support/constraint/n/k/e$b;->d:Landroid/support/constraint/n/k/e$b;

    move/from16 v23, v1

    if-ne v0, v4, :cond_1a

    if-nez v8, :cond_1a

    const/4 v8, 0x3

    :cond_1a
    iget-object v0, v15, Landroid/support/constraint/n/k/e;->Q:[Landroid/support/constraint/n/k/e$b;

    const/4 v4, 0x1

    aget-object v0, v0, v4

    sget-object v4, Landroid/support/constraint/n/k/e$b;->d:Landroid/support/constraint/n/k/e$b;

    if-ne v0, v4, :cond_1b

    if-nez v7, :cond_1b

    const/4 v7, 0x3

    :cond_1b
    iget-object v0, v15, Landroid/support/constraint/n/k/e;->Q:[Landroid/support/constraint/n/k/e$b;

    const/4 v4, 0x0

    aget-object v1, v0, v4

    sget-object v4, Landroid/support/constraint/n/k/e$b;->d:Landroid/support/constraint/n/k/e$b;

    if-ne v1, v4, :cond_1c

    const/4 v1, 0x1

    aget-object v0, v0, v1

    if-ne v0, v4, :cond_1c

    const/4 v0, 0x3

    if-ne v8, v0, :cond_1d

    if-ne v7, v0, :cond_1d

    invoke-virtual {v15, v5, v6, v2, v3}, Landroid/support/constraint/n/k/e;->a(ZZZZ)V

    goto/16 :goto_a

    :cond_1c
    const/4 v0, 0x3

    :cond_1d
    iget-object v1, v15, Landroid/support/constraint/n/k/e;->Q:[Landroid/support/constraint/n/k/e$b;

    const/4 v2, 0x0

    aget-object v3, v1, v2

    sget-object v4, Landroid/support/constraint/n/k/e$b;->d:Landroid/support/constraint/n/k/e$b;

    if-ne v3, v4, :cond_1f

    if-ne v8, v0, :cond_1f

    iput v2, v15, Landroid/support/constraint/n/k/e;->w:I

    iget v0, v15, Landroid/support/constraint/n/k/e;->x:F

    iget v2, v15, Landroid/support/constraint/n/k/e;->T:I

    int-to-float v2, v2

    mul-float/2addr v0, v2

    float-to-int v0, v0

    const/4 v2, 0x1

    aget-object v1, v1, v2

    if-eq v1, v4, :cond_1e

    move/from16 v32, v7

    move/from16 v33, v20

    goto :goto_c

    :cond_1e
    move/from16 v31, v2

    move/from16 v32, v7

    move/from16 v33, v8

    move/from16 v30, v23

    goto :goto_e

    :cond_1f
    const/4 v2, 0x1

    iget-object v0, v15, Landroid/support/constraint/n/k/e;->Q:[Landroid/support/constraint/n/k/e$b;

    aget-object v0, v0, v2

    sget-object v1, Landroid/support/constraint/n/k/e$b;->d:Landroid/support/constraint/n/k/e$b;

    if-ne v0, v1, :cond_22

    const/4 v0, 0x3

    if-ne v7, v0, :cond_22

    iput v2, v15, Landroid/support/constraint/n/k/e;->w:I

    iget v0, v15, Landroid/support/constraint/n/k/e;->V:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_20

    const/high16 v0, 0x3f800000    # 1.0f

    iget v1, v15, Landroid/support/constraint/n/k/e;->x:F

    div-float/2addr v0, v1

    iput v0, v15, Landroid/support/constraint/n/k/e;->x:F

    :cond_20
    iget v0, v15, Landroid/support/constraint/n/k/e;->x:F

    iget v1, v15, Landroid/support/constraint/n/k/e;->S:I

    int-to-float v1, v1

    mul-float/2addr v0, v1

    float-to-int v1, v0

    iget-object v0, v15, Landroid/support/constraint/n/k/e;->Q:[Landroid/support/constraint/n/k/e$b;

    const/4 v2, 0x0

    aget-object v0, v0, v2

    sget-object v2, Landroid/support/constraint/n/k/e$b;->d:Landroid/support/constraint/n/k/e$b;

    move/from16 v30, v1

    if-eq v0, v2, :cond_21

    move/from16 v33, v8

    move/from16 v32, v20

    move/from16 v0, v21

    goto :goto_d

    :cond_21
    move/from16 v32, v7

    move/from16 v33, v8

    move/from16 v0, v21

    goto :goto_b

    :cond_22
    :goto_a
    move/from16 v32, v7

    move/from16 v33, v8

    move/from16 v0, v21

    move/from16 v30, v23

    :goto_b
    const/16 v31, 0x1

    goto :goto_e

    :cond_23
    move/from16 v23, v1

    move/from16 v32, v7

    move/from16 v33, v8

    move/from16 v0, v21

    :goto_c
    move/from16 v30, v23

    :goto_d
    const/16 v31, 0x0

    :goto_e
    iget-object v1, v15, Landroid/support/constraint/n/k/e;->p:[I

    const/4 v2, 0x0

    aput v33, v1, v2

    const/4 v2, 0x1

    aput v32, v1, v2

    if-eqz v31, :cond_25

    iget v1, v15, Landroid/support/constraint/n/k/e;->w:I

    const/4 v2, -0x1

    if-eqz v1, :cond_24

    if-ne v1, v2, :cond_26

    :cond_24
    const/16 v20, 0x1

    goto :goto_f

    :cond_25
    const/4 v2, -0x1

    :cond_26
    const/16 v20, 0x0

    :goto_f
    if-eqz v31, :cond_28

    iget v1, v15, Landroid/support/constraint/n/k/e;->w:I

    const/4 v3, 0x1

    if-eq v1, v3, :cond_27

    if-ne v1, v2, :cond_28

    :cond_27
    const/16 v34, 0x1

    goto :goto_10

    :cond_28
    const/16 v34, 0x0

    :goto_10
    iget-object v1, v15, Landroid/support/constraint/n/k/e;->Q:[Landroid/support/constraint/n/k/e$b;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    sget-object v2, Landroid/support/constraint/n/k/e$b;->c:Landroid/support/constraint/n/k/e$b;

    if-ne v1, v2, :cond_29

    instance-of v1, v15, Landroid/support/constraint/n/k/f;

    if-eqz v1, :cond_29

    const/16 v21, 0x1

    goto :goto_11

    :cond_29
    const/16 v21, 0x0

    :goto_11
    if-eqz v21, :cond_2a

    const/16 v22, 0x0

    goto :goto_12

    :cond_2a
    move/from16 v22, v0

    :goto_12
    iget-object v0, v15, Landroid/support/constraint/n/k/e;->M:Landroid/support/constraint/n/k/d;

    invoke-virtual {v0}, Landroid/support/constraint/n/k/d;->l()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/lit8 v35, v0, 0x1

    iget-object v0, v15, Landroid/support/constraint/n/k/e;->P:[Z

    const/4 v2, 0x0

    aget-boolean v23, v0, v2

    aget-boolean v36, v0, v1

    iget v0, v15, Landroid/support/constraint/n/k/e;->l:I

    const/4 v8, 0x2

    const/16 v37, 0x0

    if-eq v0, v8, :cond_30

    iget-boolean v0, v15, Landroid/support/constraint/n/k/e;->j:Z

    if-nez v0, :cond_30

    if-eqz p2, :cond_2c

    iget-object v0, v15, Landroid/support/constraint/n/k/e;->d:Landroid/support/constraint/n/k/m/l;

    if-eqz v0, :cond_2c

    iget-object v1, v0, Landroid/support/constraint/n/k/m/p;->h:Landroid/support/constraint/n/k/m/f;

    iget-boolean v2, v1, Landroid/support/constraint/n/k/m/f;->j:Z

    if-eqz v2, :cond_2c

    iget-object v0, v0, Landroid/support/constraint/n/k/m/p;->i:Landroid/support/constraint/n/k/m/f;

    iget-boolean v0, v0, Landroid/support/constraint/n/k/m/f;->j:Z

    if-nez v0, :cond_2b

    goto :goto_13

    :cond_2b
    if-eqz p2, :cond_30

    iget v0, v1, Landroid/support/constraint/n/k/m/f;->g:I

    invoke-virtual {v14, v13, v0}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/i;I)V

    iget-object v0, v15, Landroid/support/constraint/n/k/e;->d:Landroid/support/constraint/n/k/m/l;

    iget-object v0, v0, Landroid/support/constraint/n/k/m/p;->i:Landroid/support/constraint/n/k/m/f;

    iget v0, v0, Landroid/support/constraint/n/k/m/f;->g:I

    invoke-virtual {v14, v12, v0}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/i;I)V

    iget-object v0, v15, Landroid/support/constraint/n/k/e;->R:Landroid/support/constraint/n/k/e;

    if-eqz v0, :cond_30

    if-eqz v5, :cond_30

    iget-object v0, v15, Landroid/support/constraint/n/k/e;->f:[Z

    const/4 v1, 0x0

    aget-boolean v0, v0, v1

    if-eqz v0, :cond_30

    invoke-virtual/range {p0 .. p0}, Landroid/support/constraint/n/k/e;->H()Z

    move-result v0

    if-nez v0, :cond_30

    iget-object v0, v15, Landroid/support/constraint/n/k/e;->R:Landroid/support/constraint/n/k/e;

    iget-object v0, v0, Landroid/support/constraint/n/k/e;->H:Landroid/support/constraint/n/k/d;

    invoke-virtual {v14, v0}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object v0

    const/16 v4, 0x8

    invoke-virtual {v14, v0, v12, v1, v4}, Landroid/support/constraint/n/d;->b(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)V

    goto/16 :goto_17

    :cond_2c
    :goto_13
    const/16 v4, 0x8

    iget-object v0, v15, Landroid/support/constraint/n/k/e;->R:Landroid/support/constraint/n/k/e;

    if-eqz v0, :cond_2d

    iget-object v0, v0, Landroid/support/constraint/n/k/e;->H:Landroid/support/constraint/n/k/d;

    invoke-virtual {v14, v0}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object v0

    move-object v7, v0

    goto :goto_14

    :cond_2d
    move-object/from16 v7, v37

    :goto_14
    iget-object v0, v15, Landroid/support/constraint/n/k/e;->R:Landroid/support/constraint/n/k/e;

    if-eqz v0, :cond_2e

    iget-object v0, v0, Landroid/support/constraint/n/k/e;->F:Landroid/support/constraint/n/k/d;

    invoke-virtual {v14, v0}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object v0

    move-object/from16 v16, v0

    goto :goto_15

    :cond_2e
    move-object/from16 v16, v37

    :goto_15
    iget-object v0, v15, Landroid/support/constraint/n/k/e;->f:[Z

    const/16 v19, 0x0

    aget-boolean v27, v0, v19

    iget-object v0, v15, Landroid/support/constraint/n/k/e;->Q:[Landroid/support/constraint/n/k/e$b;

    aget-object v38, v0, v19

    iget-object v3, v15, Landroid/support/constraint/n/k/e;->F:Landroid/support/constraint/n/k/d;

    iget-object v1, v15, Landroid/support/constraint/n/k/e;->H:Landroid/support/constraint/n/k/d;

    iget v2, v15, Landroid/support/constraint/n/k/e;->W:I

    move/from16 v40, v2

    iget v2, v15, Landroid/support/constraint/n/k/e;->Z:I

    iget-object v4, v15, Landroid/support/constraint/n/k/e;->y:[I

    aget v42, v4, v19

    iget v4, v15, Landroid/support/constraint/n/k/e;->b0:F

    const/16 v18, 0x1

    aget-object v0, v0, v18

    sget-object v8, Landroid/support/constraint/n/k/e$b;->d:Landroid/support/constraint/n/k/e$b;

    if-ne v0, v8, :cond_2f

    move/from16 v43, v18

    goto :goto_16

    :cond_2f
    move/from16 v43, v19

    :goto_16
    iget v0, v15, Landroid/support/constraint/n/k/e;->q:I

    move/from16 v24, v0

    iget v0, v15, Landroid/support/constraint/n/k/e;->r:I

    move/from16 v25, v0

    iget v0, v15, Landroid/support/constraint/n/k/e;->s:F

    move/from16 v26, v0

    move-object/from16 v0, p0

    move-object/from16 v44, v1

    move-object/from16 v1, p1

    move/from16 v39, v40

    move/from16 v40, v2

    const/4 v2, 0x1

    move-object/from16 v17, v3

    const/4 v8, 0x5

    move v3, v5

    move/from16 v41, v4

    move v4, v6

    move/from16 v45, v5

    move/from16 v5, v27

    move/from16 v46, v6

    move-object/from16 v6, v16

    move-object/from16 v8, v38

    move-object/from16 v47, v9

    move/from16 v9, v21

    move-object/from16 v48, v10

    move-object/from16 v10, v17

    move-object/from16 v49, v11

    move-object/from16 v11, v44

    move-object/from16 v38, v12

    move/from16 v12, v39

    move-object/from16 v39, v13

    move/from16 v13, v22

    move/from16 v14, v40

    move/from16 v15, v42

    move/from16 v16, v41

    move/from16 v17, v20

    move/from16 v18, v43

    move/from16 v19, v29

    move/from16 v20, v28

    move/from16 v21, v23

    move/from16 v22, v33

    move/from16 v23, v32

    move/from16 v27, v35

    invoke-direct/range {v0 .. v27}, Landroid/support/constraint/n/k/e;->a(Landroid/support/constraint/n/d;ZZZZLandroid/support/constraint/n/i;Landroid/support/constraint/n/i;Landroid/support/constraint/n/k/e$b;ZLandroid/support/constraint/n/k/d;Landroid/support/constraint/n/k/d;IIIIFZZZZZIIIIFZ)V

    goto :goto_18

    :cond_30
    :goto_17
    move/from16 v45, v5

    move/from16 v46, v6

    move-object/from16 v47, v9

    move-object/from16 v48, v10

    move-object/from16 v49, v11

    move-object/from16 v38, v12

    move-object/from16 v39, v13

    :goto_18
    if-eqz p2, :cond_34

    move-object/from16 v15, p0

    iget-object v0, v15, Landroid/support/constraint/n/k/e;->e:Landroid/support/constraint/n/k/m/n;

    if-eqz v0, :cond_33

    iget-object v1, v0, Landroid/support/constraint/n/k/m/p;->h:Landroid/support/constraint/n/k/m/f;

    iget-boolean v2, v1, Landroid/support/constraint/n/k/m/f;->j:Z

    if-eqz v2, :cond_33

    iget-object v0, v0, Landroid/support/constraint/n/k/m/p;->i:Landroid/support/constraint/n/k/m/f;

    iget-boolean v0, v0, Landroid/support/constraint/n/k/m/f;->j:Z

    if-eqz v0, :cond_33

    iget v0, v1, Landroid/support/constraint/n/k/m/f;->g:I

    move-object/from16 v14, p1

    move-object/from16 v13, v49

    invoke-virtual {v14, v13, v0}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/i;I)V

    iget-object v0, v15, Landroid/support/constraint/n/k/e;->e:Landroid/support/constraint/n/k/m/n;

    iget-object v0, v0, Landroid/support/constraint/n/k/m/p;->i:Landroid/support/constraint/n/k/m/f;

    iget v0, v0, Landroid/support/constraint/n/k/m/f;->g:I

    move-object/from16 v12, v48

    invoke-virtual {v14, v12, v0}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/i;I)V

    iget-object v0, v15, Landroid/support/constraint/n/k/e;->e:Landroid/support/constraint/n/k/m/n;

    iget-object v0, v0, Landroid/support/constraint/n/k/m/n;->k:Landroid/support/constraint/n/k/m/f;

    iget v0, v0, Landroid/support/constraint/n/k/m/f;->g:I

    move-object/from16 v1, v47

    invoke-virtual {v14, v1, v0}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/i;I)V

    iget-object v0, v15, Landroid/support/constraint/n/k/e;->R:Landroid/support/constraint/n/k/e;

    if-eqz v0, :cond_32

    if-nez v28, :cond_32

    if-eqz v46, :cond_32

    iget-object v2, v15, Landroid/support/constraint/n/k/e;->f:[Z

    const/4 v11, 0x1

    aget-boolean v2, v2, v11

    if-eqz v2, :cond_31

    iget-object v0, v0, Landroid/support/constraint/n/k/e;->I:Landroid/support/constraint/n/k/d;

    invoke-virtual {v14, v0}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object v0

    const/16 v2, 0x8

    const/4 v10, 0x0

    invoke-virtual {v14, v0, v12, v10, v2}, Landroid/support/constraint/n/d;->b(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)V

    goto :goto_19

    :cond_31
    const/16 v2, 0x8

    const/4 v10, 0x0

    goto :goto_19

    :cond_32
    const/16 v2, 0x8

    const/4 v10, 0x0

    const/4 v11, 0x1

    :goto_19
    move v8, v10

    goto :goto_1b

    :cond_33
    move-object/from16 v14, p1

    move-object/from16 v1, v47

    move-object/from16 v12, v48

    move-object/from16 v13, v49

    const/16 v2, 0x8

    const/4 v10, 0x0

    const/4 v11, 0x1

    goto :goto_1a

    :cond_34
    const/16 v2, 0x8

    const/4 v10, 0x0

    const/4 v11, 0x1

    move-object/from16 v15, p0

    move-object/from16 v14, p1

    move-object/from16 v1, v47

    move-object/from16 v12, v48

    move-object/from16 v13, v49

    :goto_1a
    move v8, v11

    :goto_1b
    iget v0, v15, Landroid/support/constraint/n/k/e;->m:I

    const/4 v3, 0x2

    if-ne v0, v3, :cond_35

    move v7, v10

    goto :goto_1c

    :cond_35
    move v7, v8

    :goto_1c
    if-eqz v7, :cond_40

    iget-boolean v0, v15, Landroid/support/constraint/n/k/e;->k:Z

    if-nez v0, :cond_40

    iget-object v0, v15, Landroid/support/constraint/n/k/e;->Q:[Landroid/support/constraint/n/k/e$b;

    aget-object v0, v0, v11

    sget-object v3, Landroid/support/constraint/n/k/e$b;->c:Landroid/support/constraint/n/k/e$b;

    if-ne v0, v3, :cond_36

    instance-of v0, v15, Landroid/support/constraint/n/k/f;

    if-eqz v0, :cond_36

    move v9, v11

    goto :goto_1d

    :cond_36
    move v9, v10

    :goto_1d
    if-eqz v9, :cond_37

    move/from16 v30, v10

    :cond_37
    iget-object v0, v15, Landroid/support/constraint/n/k/e;->R:Landroid/support/constraint/n/k/e;

    if-eqz v0, :cond_38

    iget-object v0, v0, Landroid/support/constraint/n/k/e;->I:Landroid/support/constraint/n/k/d;

    invoke-virtual {v14, v0}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object v0

    move-object v7, v0

    goto :goto_1e

    :cond_38
    move-object/from16 v7, v37

    :goto_1e
    iget-object v0, v15, Landroid/support/constraint/n/k/e;->R:Landroid/support/constraint/n/k/e;

    if-eqz v0, :cond_39

    iget-object v0, v0, Landroid/support/constraint/n/k/e;->G:Landroid/support/constraint/n/k/d;

    invoke-virtual {v14, v0}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object v0

    move-object v6, v0

    goto :goto_1f

    :cond_39
    move-object/from16 v6, v37

    :goto_1f
    iget v0, v15, Landroid/support/constraint/n/k/e;->Y:I

    if-gtz v0, :cond_3a

    iget v0, v15, Landroid/support/constraint/n/k/e;->e0:I

    if-ne v0, v2, :cond_3e

    :cond_3a
    iget-object v0, v15, Landroid/support/constraint/n/k/e;->J:Landroid/support/constraint/n/k/d;

    iget-object v0, v0, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    if-eqz v0, :cond_3c

    invoke-virtual/range {p0 .. p0}, Landroid/support/constraint/n/k/e;->e()I

    move-result v0

    invoke-virtual {v14, v1, v13, v0, v2}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)Landroid/support/constraint/n/b;

    iget-object v0, v15, Landroid/support/constraint/n/k/e;->J:Landroid/support/constraint/n/k/d;

    iget-object v0, v0, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    invoke-virtual {v14, v0}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object v0

    invoke-virtual {v14, v1, v0, v10, v2}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)Landroid/support/constraint/n/b;

    if-eqz v46, :cond_3b

    iget-object v0, v15, Landroid/support/constraint/n/k/e;->I:Landroid/support/constraint/n/k/d;

    invoke-virtual {v14, v0}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v14, v7, v0, v10, v1}, Landroid/support/constraint/n/d;->b(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)V

    :cond_3b
    move/from16 v27, v10

    goto :goto_21

    :cond_3c
    iget v0, v15, Landroid/support/constraint/n/k/e;->e0:I

    if-ne v0, v2, :cond_3d

    invoke-virtual {v14, v1, v13, v10, v2}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)Landroid/support/constraint/n/b;

    goto :goto_20

    :cond_3d
    invoke-virtual/range {p0 .. p0}, Landroid/support/constraint/n/k/e;->e()I

    move-result v0

    invoke-virtual {v14, v1, v13, v0, v2}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)Landroid/support/constraint/n/b;

    :cond_3e
    :goto_20
    move/from16 v27, v35

    :goto_21
    iget-object v0, v15, Landroid/support/constraint/n/k/e;->f:[Z

    aget-boolean v5, v0, v11

    iget-object v0, v15, Landroid/support/constraint/n/k/e;->Q:[Landroid/support/constraint/n/k/e$b;

    aget-object v8, v0, v11

    iget-object v4, v15, Landroid/support/constraint/n/k/e;->G:Landroid/support/constraint/n/k/d;

    iget-object v3, v15, Landroid/support/constraint/n/k/e;->I:Landroid/support/constraint/n/k/d;

    iget v1, v15, Landroid/support/constraint/n/k/e;->X:I

    iget v2, v15, Landroid/support/constraint/n/k/e;->a0:I

    iget-object v10, v15, Landroid/support/constraint/n/k/e;->y:[I

    aget v16, v10, v11

    iget v10, v15, Landroid/support/constraint/n/k/e;->c0:F

    const/16 v17, 0x0

    aget-object v0, v0, v17

    sget-object v11, Landroid/support/constraint/n/k/e$b;->d:Landroid/support/constraint/n/k/e$b;

    if-ne v0, v11, :cond_3f

    const/16 v18, 0x1

    goto :goto_22

    :cond_3f
    move/from16 v18, v17

    :goto_22
    iget v0, v15, Landroid/support/constraint/n/k/e;->t:I

    move/from16 v24, v0

    iget v0, v15, Landroid/support/constraint/n/k/e;->u:I

    move/from16 v25, v0

    iget v0, v15, Landroid/support/constraint/n/k/e;->v:F

    move/from16 v26, v0

    move-object/from16 v0, p0

    move/from16 v19, v1

    move-object/from16 v1, p1

    move/from16 v20, v2

    const/4 v2, 0x0

    move-object v11, v3

    move/from16 v3, v46

    move-object/from16 v21, v4

    move/from16 v4, v45

    move/from16 v17, v10

    move-object/from16 v10, v21

    move-object/from16 v35, v12

    move/from16 v12, v19

    move-object/from16 v37, v13

    move/from16 v13, v30

    move/from16 v14, v20

    move/from16 v15, v16

    move/from16 v16, v17

    move/from16 v17, v34

    move/from16 v19, v28

    move/from16 v20, v29

    move/from16 v21, v36

    move/from16 v22, v32

    move/from16 v23, v33

    invoke-direct/range {v0 .. v27}, Landroid/support/constraint/n/k/e;->a(Landroid/support/constraint/n/d;ZZZZLandroid/support/constraint/n/i;Landroid/support/constraint/n/i;Landroid/support/constraint/n/k/e$b;ZLandroid/support/constraint/n/k/d;Landroid/support/constraint/n/k/d;IIIIFZZZZZIIIIFZ)V

    goto :goto_23

    :cond_40
    move-object/from16 v35, v12

    move-object/from16 v37, v13

    :goto_23
    if-eqz v31, :cond_42

    const/16 v6, 0x8

    move-object/from16 v7, p0

    iget v0, v7, Landroid/support/constraint/n/k/e;->w:I

    const/4 v1, 0x1

    iget v5, v7, Landroid/support/constraint/n/k/e;->x:F

    if-ne v0, v1, :cond_41

    move-object/from16 v0, p1

    move-object/from16 v1, v35

    move-object/from16 v2, v37

    move-object/from16 v3, v38

    move-object/from16 v4, v39

    goto :goto_24

    :cond_41
    const/16 v6, 0x8

    move-object/from16 v0, p1

    move-object/from16 v1, v38

    move-object/from16 v2, v39

    move-object/from16 v3, v35

    move-object/from16 v4, v37

    :goto_24
    invoke-virtual/range {v0 .. v6}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;FI)V

    goto :goto_25

    :cond_42
    move-object/from16 v7, p0

    :goto_25
    iget-object v0, v7, Landroid/support/constraint/n/k/e;->M:Landroid/support/constraint/n/k/d;

    invoke-virtual {v0}, Landroid/support/constraint/n/k/d;->l()Z

    move-result v0

    if-eqz v0, :cond_43

    iget-object v0, v7, Landroid/support/constraint/n/k/e;->M:Landroid/support/constraint/n/k/d;

    invoke-virtual {v0}, Landroid/support/constraint/n/k/d;->g()Landroid/support/constraint/n/k/d;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/constraint/n/k/d;->e()Landroid/support/constraint/n/k/e;

    move-result-object v0

    iget v1, v7, Landroid/support/constraint/n/k/e;->z:F

    const/high16 v2, 0x42b40000    # 90.0f

    add-float/2addr v1, v2

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v1

    double-to-float v1, v1

    iget-object v2, v7, Landroid/support/constraint/n/k/e;->M:Landroid/support/constraint/n/k/d;

    invoke-virtual {v2}, Landroid/support/constraint/n/k/d;->c()I

    move-result v2

    move-object/from16 v3, p1

    invoke-virtual {v3, v7, v0, v1, v2}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/k/e;Landroid/support/constraint/n/k/e;FI)V

    :cond_43
    const/4 v0, 0x0

    iput-boolean v0, v7, Landroid/support/constraint/n/k/e;->j:Z

    iput-boolean v0, v7, Landroid/support/constraint/n/k/e;->k:Z

    return-void
.end method

.method public a(Landroid/support/constraint/n/k/d$b;Landroid/support/constraint/n/k/e;Landroid/support/constraint/n/k/d$b;II)V
    .locals 0

    invoke-virtual {p0, p1}, Landroid/support/constraint/n/k/e;->a(Landroid/support/constraint/n/k/d$b;)Landroid/support/constraint/n/k/d;

    move-result-object p0

    invoke-virtual {p2, p3}, Landroid/support/constraint/n/k/e;->a(Landroid/support/constraint/n/k/d$b;)Landroid/support/constraint/n/k/d;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p0, p1, p4, p5, p2}, Landroid/support/constraint/n/k/d;->a(Landroid/support/constraint/n/k/d;IIZ)Z

    return-void
.end method

.method public a(Landroid/support/constraint/n/k/e$b;)V
    .locals 1

    iget-object p0, p0, Landroid/support/constraint/n/k/e;->Q:[Landroid/support/constraint/n/k/e$b;

    const/4 v0, 0x0

    aput-object p1, p0, v0

    return-void
.end method

.method public a(Landroid/support/constraint/n/k/e;FI)V
    .locals 6

    sget-object v3, Landroid/support/constraint/n/k/d$b;->h:Landroid/support/constraint/n/k/d$b;

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, v3

    move-object v2, p1

    move v4, p3

    invoke-virtual/range {v0 .. v5}, Landroid/support/constraint/n/k/e;->a(Landroid/support/constraint/n/k/d$b;Landroid/support/constraint/n/k/e;Landroid/support/constraint/n/k/d$b;II)V

    iput p2, p0, Landroid/support/constraint/n/k/e;->z:F

    return-void
.end method

.method public a(Landroid/support/constraint/n/k/f;Landroid/support/constraint/n/d;Ljava/util/HashSet;IZ)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/constraint/n/k/f;",
            "Landroid/support/constraint/n/d;",
            "Ljava/util/HashSet<",
            "Landroid/support/constraint/n/k/e;",
            ">;IZ)V"
        }
    .end annotation

    if-eqz p5, :cond_1

    invoke-virtual {p3, p0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p5

    if-nez p5, :cond_0

    return-void

    :cond_0
    invoke-static {p1, p2, p0}, Landroid/support/constraint/n/k/j;->a(Landroid/support/constraint/n/k/f;Landroid/support/constraint/n/d;Landroid/support/constraint/n/k/e;)V

    invoke-virtual {p3, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    const/16 p5, 0x40

    invoke-virtual {p1, p5}, Landroid/support/constraint/n/k/f;->w(I)Z

    move-result p5

    invoke-virtual {p0, p2, p5}, Landroid/support/constraint/n/k/e;->a(Landroid/support/constraint/n/d;Z)V

    :cond_1
    if-nez p4, :cond_3

    iget-object p5, p0, Landroid/support/constraint/n/k/e;->F:Landroid/support/constraint/n/k/d;

    invoke-virtual {p5}, Landroid/support/constraint/n/k/d;->a()Ljava/util/HashSet;

    move-result-object p5

    if-eqz p5, :cond_2

    invoke-virtual {p5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p5

    :goto_0
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/constraint/n/k/d;

    iget-object v1, v0, Landroid/support/constraint/n/k/d;->d:Landroid/support/constraint/n/k/e;

    const/4 v6, 0x1

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-virtual/range {v1 .. v6}, Landroid/support/constraint/n/k/e;->a(Landroid/support/constraint/n/k/f;Landroid/support/constraint/n/d;Ljava/util/HashSet;IZ)V

    goto :goto_0

    :cond_2
    iget-object p0, p0, Landroid/support/constraint/n/k/e;->H:Landroid/support/constraint/n/k/d;

    invoke-virtual {p0}, Landroid/support/constraint/n/k/d;->a()Ljava/util/HashSet;

    move-result-object p0

    if-eqz p0, :cond_6

    invoke-virtual {p0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p5

    if-eqz p5, :cond_6

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Landroid/support/constraint/n/k/d;

    iget-object v0, p5, Landroid/support/constraint/n/k/d;->d:Landroid/support/constraint/n/k/e;

    const/4 v5, 0x1

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    invoke-virtual/range {v0 .. v5}, Landroid/support/constraint/n/k/e;->a(Landroid/support/constraint/n/k/f;Landroid/support/constraint/n/d;Ljava/util/HashSet;IZ)V

    goto :goto_1

    :cond_3
    iget-object p5, p0, Landroid/support/constraint/n/k/e;->G:Landroid/support/constraint/n/k/d;

    invoke-virtual {p5}, Landroid/support/constraint/n/k/d;->a()Ljava/util/HashSet;

    move-result-object p5

    if-eqz p5, :cond_4

    invoke-virtual {p5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p5

    :goto_2
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/constraint/n/k/d;

    iget-object v1, v0, Landroid/support/constraint/n/k/d;->d:Landroid/support/constraint/n/k/e;

    const/4 v6, 0x1

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-virtual/range {v1 .. v6}, Landroid/support/constraint/n/k/e;->a(Landroid/support/constraint/n/k/f;Landroid/support/constraint/n/d;Ljava/util/HashSet;IZ)V

    goto :goto_2

    :cond_4
    iget-object p5, p0, Landroid/support/constraint/n/k/e;->I:Landroid/support/constraint/n/k/d;

    invoke-virtual {p5}, Landroid/support/constraint/n/k/d;->a()Ljava/util/HashSet;

    move-result-object p5

    if-eqz p5, :cond_5

    invoke-virtual {p5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p5

    :goto_3
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/constraint/n/k/d;

    iget-object v1, v0, Landroid/support/constraint/n/k/d;->d:Landroid/support/constraint/n/k/e;

    const/4 v6, 0x1

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-virtual/range {v1 .. v6}, Landroid/support/constraint/n/k/e;->a(Landroid/support/constraint/n/k/f;Landroid/support/constraint/n/d;Ljava/util/HashSet;IZ)V

    goto :goto_3

    :cond_5
    iget-object p0, p0, Landroid/support/constraint/n/k/e;->J:Landroid/support/constraint/n/k/d;

    invoke-virtual {p0}, Landroid/support/constraint/n/k/d;->a()Ljava/util/HashSet;

    move-result-object p0

    if-eqz p0, :cond_6

    invoke-virtual {p0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p5

    if-eqz p5, :cond_6

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Landroid/support/constraint/n/k/d;

    iget-object v0, p5, Landroid/support/constraint/n/k/d;->d:Landroid/support/constraint/n/k/e;

    const/4 v5, 0x1

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    invoke-virtual/range {v0 .. v5}, Landroid/support/constraint/n/k/e;->a(Landroid/support/constraint/n/k/f;Landroid/support/constraint/n/d;Ljava/util/HashSet;IZ)V

    goto :goto_4

    :cond_6
    return-void
.end method

.method public a(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Landroid/support/constraint/n/k/e;->d0:Ljava/lang/Object;

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Landroid/support/constraint/n/k/e;->f0:Ljava/lang/String;

    return-void
.end method

.method public a(Z)V
    .locals 0

    iput-boolean p1, p0, Landroid/support/constraint/n/k/e;->A:Z

    return-void
.end method

.method public a(ZZ)V
    .locals 7

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->d:Landroid/support/constraint/n/k/m/l;

    invoke-virtual {v0}, Landroid/support/constraint/n/k/m/p;->e()Z

    move-result v0

    and-int/2addr p1, v0

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->e:Landroid/support/constraint/n/k/m/n;

    invoke-virtual {v0}, Landroid/support/constraint/n/k/m/p;->e()Z

    move-result v0

    and-int/2addr p2, v0

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->d:Landroid/support/constraint/n/k/m/l;

    iget-object v1, v0, Landroid/support/constraint/n/k/m/p;->h:Landroid/support/constraint/n/k/m/f;

    iget v1, v1, Landroid/support/constraint/n/k/m/f;->g:I

    iget-object v2, p0, Landroid/support/constraint/n/k/e;->e:Landroid/support/constraint/n/k/m/n;

    iget-object v3, v2, Landroid/support/constraint/n/k/m/p;->h:Landroid/support/constraint/n/k/m/f;

    iget v3, v3, Landroid/support/constraint/n/k/m/f;->g:I

    iget-object v0, v0, Landroid/support/constraint/n/k/m/p;->i:Landroid/support/constraint/n/k/m/f;

    iget v0, v0, Landroid/support/constraint/n/k/m/f;->g:I

    iget-object v2, v2, Landroid/support/constraint/n/k/m/p;->i:Landroid/support/constraint/n/k/m/f;

    iget v2, v2, Landroid/support/constraint/n/k/m/f;->g:I

    sub-int v4, v0, v1

    sub-int v5, v2, v3

    const/4 v6, 0x0

    if-ltz v4, :cond_0

    if-ltz v5, :cond_0

    const/high16 v4, -0x80000000

    if-eq v1, v4, :cond_0

    const v5, 0x7fffffff

    if-eq v1, v5, :cond_0

    if-eq v3, v4, :cond_0

    if-eq v3, v5, :cond_0

    if-eq v0, v4, :cond_0

    if-eq v0, v5, :cond_0

    if-eq v2, v4, :cond_0

    if-ne v2, v5, :cond_1

    :cond_0
    move v0, v6

    move v1, v0

    move v2, v1

    move v3, v2

    :cond_1
    sub-int/2addr v0, v1

    sub-int/2addr v2, v3

    if-eqz p1, :cond_2

    iput v1, p0, Landroid/support/constraint/n/k/e;->W:I

    :cond_2
    if-eqz p2, :cond_3

    iput v3, p0, Landroid/support/constraint/n/k/e;->X:I

    :cond_3
    iget v1, p0, Landroid/support/constraint/n/k/e;->e0:I

    const/16 v3, 0x8

    if-ne v1, v3, :cond_4

    iput v6, p0, Landroid/support/constraint/n/k/e;->S:I

    iput v6, p0, Landroid/support/constraint/n/k/e;->T:I

    return-void

    :cond_4
    if-eqz p1, :cond_6

    iget-object p1, p0, Landroid/support/constraint/n/k/e;->Q:[Landroid/support/constraint/n/k/e$b;

    aget-object p1, p1, v6

    sget-object v1, Landroid/support/constraint/n/k/e$b;->b:Landroid/support/constraint/n/k/e$b;

    if-ne p1, v1, :cond_5

    iget p1, p0, Landroid/support/constraint/n/k/e;->S:I

    if-ge v0, p1, :cond_5

    move v0, p1

    :cond_5
    iput v0, p0, Landroid/support/constraint/n/k/e;->S:I

    iget p1, p0, Landroid/support/constraint/n/k/e;->Z:I

    if-ge v0, p1, :cond_6

    iput p1, p0, Landroid/support/constraint/n/k/e;->S:I

    :cond_6
    if-eqz p2, :cond_8

    iget-object p1, p0, Landroid/support/constraint/n/k/e;->Q:[Landroid/support/constraint/n/k/e$b;

    const/4 p2, 0x1

    aget-object p1, p1, p2

    sget-object p2, Landroid/support/constraint/n/k/e$b;->b:Landroid/support/constraint/n/k/e$b;

    if-ne p1, p2, :cond_7

    iget p1, p0, Landroid/support/constraint/n/k/e;->T:I

    if-ge v2, p1, :cond_7

    move v2, p1

    :cond_7
    iput v2, p0, Landroid/support/constraint/n/k/e;->T:I

    iget p1, p0, Landroid/support/constraint/n/k/e;->a0:I

    if-ge v2, p1, :cond_8

    iput p1, p0, Landroid/support/constraint/n/k/e;->T:I

    :cond_8
    return-void
.end method

.method public a(ZZZZ)V
    .locals 3

    iget p1, p0, Landroid/support/constraint/n/k/e;->w:I

    const/high16 p2, 0x3f800000    # 1.0f

    const/4 v0, 0x0

    const/4 v1, -0x1

    const/4 v2, 0x1

    if-ne p1, v1, :cond_1

    if-eqz p3, :cond_0

    if-nez p4, :cond_0

    iput v0, p0, Landroid/support/constraint/n/k/e;->w:I

    goto :goto_0

    :cond_0
    if-nez p3, :cond_1

    if-eqz p4, :cond_1

    iput v2, p0, Landroid/support/constraint/n/k/e;->w:I

    iget p1, p0, Landroid/support/constraint/n/k/e;->V:I

    if-ne p1, v1, :cond_1

    iget p1, p0, Landroid/support/constraint/n/k/e;->x:F

    div-float p1, p2, p1

    iput p1, p0, Landroid/support/constraint/n/k/e;->x:F

    :cond_1
    :goto_0
    iget p1, p0, Landroid/support/constraint/n/k/e;->w:I

    if-nez p1, :cond_3

    iget-object p1, p0, Landroid/support/constraint/n/k/e;->G:Landroid/support/constraint/n/k/d;

    invoke-virtual {p1}, Landroid/support/constraint/n/k/d;->l()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Landroid/support/constraint/n/k/e;->I:Landroid/support/constraint/n/k/d;

    invoke-virtual {p1}, Landroid/support/constraint/n/k/d;->l()Z

    move-result p1

    if-nez p1, :cond_3

    :cond_2
    iput v2, p0, Landroid/support/constraint/n/k/e;->w:I

    goto :goto_1

    :cond_3
    iget p1, p0, Landroid/support/constraint/n/k/e;->w:I

    if-ne p1, v2, :cond_5

    iget-object p1, p0, Landroid/support/constraint/n/k/e;->F:Landroid/support/constraint/n/k/d;

    invoke-virtual {p1}, Landroid/support/constraint/n/k/d;->l()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Landroid/support/constraint/n/k/e;->H:Landroid/support/constraint/n/k/d;

    invoke-virtual {p1}, Landroid/support/constraint/n/k/d;->l()Z

    move-result p1

    if-nez p1, :cond_5

    :cond_4
    iput v0, p0, Landroid/support/constraint/n/k/e;->w:I

    :cond_5
    :goto_1
    iget p1, p0, Landroid/support/constraint/n/k/e;->w:I

    if-ne p1, v1, :cond_8

    iget-object p1, p0, Landroid/support/constraint/n/k/e;->G:Landroid/support/constraint/n/k/d;

    invoke-virtual {p1}, Landroid/support/constraint/n/k/d;->l()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Landroid/support/constraint/n/k/e;->I:Landroid/support/constraint/n/k/d;

    invoke-virtual {p1}, Landroid/support/constraint/n/k/d;->l()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Landroid/support/constraint/n/k/e;->F:Landroid/support/constraint/n/k/d;

    invoke-virtual {p1}, Landroid/support/constraint/n/k/d;->l()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Landroid/support/constraint/n/k/e;->H:Landroid/support/constraint/n/k/d;

    invoke-virtual {p1}, Landroid/support/constraint/n/k/d;->l()Z

    move-result p1

    if-nez p1, :cond_8

    :cond_6
    iget-object p1, p0, Landroid/support/constraint/n/k/e;->G:Landroid/support/constraint/n/k/d;

    invoke-virtual {p1}, Landroid/support/constraint/n/k/d;->l()Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Landroid/support/constraint/n/k/e;->I:Landroid/support/constraint/n/k/d;

    invoke-virtual {p1}, Landroid/support/constraint/n/k/d;->l()Z

    move-result p1

    if-eqz p1, :cond_7

    iput v0, p0, Landroid/support/constraint/n/k/e;->w:I

    goto :goto_2

    :cond_7
    iget-object p1, p0, Landroid/support/constraint/n/k/e;->F:Landroid/support/constraint/n/k/d;

    invoke-virtual {p1}, Landroid/support/constraint/n/k/d;->l()Z

    move-result p1

    if-eqz p1, :cond_8

    iget-object p1, p0, Landroid/support/constraint/n/k/e;->H:Landroid/support/constraint/n/k/d;

    invoke-virtual {p1}, Landroid/support/constraint/n/k/d;->l()Z

    move-result p1

    if-eqz p1, :cond_8

    iget p1, p0, Landroid/support/constraint/n/k/e;->x:F

    div-float p1, p2, p1

    iput p1, p0, Landroid/support/constraint/n/k/e;->x:F

    iput v2, p0, Landroid/support/constraint/n/k/e;->w:I

    :cond_8
    :goto_2
    iget p1, p0, Landroid/support/constraint/n/k/e;->w:I

    if-ne p1, v1, :cond_a

    iget p1, p0, Landroid/support/constraint/n/k/e;->q:I

    if-lez p1, :cond_9

    iget p1, p0, Landroid/support/constraint/n/k/e;->t:I

    if-nez p1, :cond_9

    iput v0, p0, Landroid/support/constraint/n/k/e;->w:I

    goto :goto_3

    :cond_9
    iget p1, p0, Landroid/support/constraint/n/k/e;->q:I

    if-nez p1, :cond_a

    iget p1, p0, Landroid/support/constraint/n/k/e;->t:I

    if-lez p1, :cond_a

    iget p1, p0, Landroid/support/constraint/n/k/e;->x:F

    div-float/2addr p2, p1

    iput p2, p0, Landroid/support/constraint/n/k/e;->x:F

    iput v2, p0, Landroid/support/constraint/n/k/e;->w:I

    :cond_a
    :goto_3
    return-void
.end method

.method public b(I)Landroid/support/constraint/n/k/e$b;
    .locals 1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroid/support/constraint/n/k/e;->n()Landroid/support/constraint/n/k/e$b;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    invoke-virtual {p0}, Landroid/support/constraint/n/k/e;->z()Landroid/support/constraint/n/k/e$b;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public b(F)V
    .locals 1

    iget-object p0, p0, Landroid/support/constraint/n/k/e;->j0:[F

    const/4 v0, 0x0

    aput p1, p0, v0

    return-void
.end method

.method public b(II)V
    .locals 1

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->G:Landroid/support/constraint/n/k/d;

    invoke-virtual {v0, p1}, Landroid/support/constraint/n/k/d;->a(I)V

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->I:Landroid/support/constraint/n/k/d;

    invoke-virtual {v0, p2}, Landroid/support/constraint/n/k/d;->a(I)V

    iput p1, p0, Landroid/support/constraint/n/k/e;->X:I

    sub-int/2addr p2, p1

    iput p2, p0, Landroid/support/constraint/n/k/e;->T:I

    iget-boolean p2, p0, Landroid/support/constraint/n/k/e;->A:Z

    if-eqz p2, :cond_0

    iget-object p2, p0, Landroid/support/constraint/n/k/e;->J:Landroid/support/constraint/n/k/d;

    iget v0, p0, Landroid/support/constraint/n/k/e;->Y:I

    add-int/2addr p1, v0

    invoke-virtual {p2, p1}, Landroid/support/constraint/n/k/d;->a(I)V

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Landroid/support/constraint/n/k/e;->k:Z

    return-void
.end method

.method public b(IIIF)V
    .locals 0

    iput p1, p0, Landroid/support/constraint/n/k/e;->o:I

    iput p2, p0, Landroid/support/constraint/n/k/e;->t:I

    const p1, 0x7fffffff

    if-ne p3, p1, :cond_0

    const/4 p3, 0x0

    :cond_0
    iput p3, p0, Landroid/support/constraint/n/k/e;->u:I

    iput p4, p0, Landroid/support/constraint/n/k/e;->v:F

    const/4 p1, 0x0

    cmpl-float p1, p4, p1

    if-lez p1, :cond_1

    const/high16 p1, 0x3f800000    # 1.0f

    cmpg-float p1, p4, p1

    if-gez p1, :cond_1

    iget p1, p0, Landroid/support/constraint/n/k/e;->o:I

    if-nez p1, :cond_1

    const/4 p1, 0x2

    iput p1, p0, Landroid/support/constraint/n/k/e;->o:I

    :cond_1
    return-void
.end method

.method public b(Landroid/support/constraint/n/d;Z)V
    .locals 6

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->F:Landroid/support/constraint/n/k/d;

    invoke-virtual {p1, v0}, Landroid/support/constraint/n/d;->b(Ljava/lang/Object;)I

    move-result v0

    iget-object v1, p0, Landroid/support/constraint/n/k/e;->G:Landroid/support/constraint/n/k/d;

    invoke-virtual {p1, v1}, Landroid/support/constraint/n/d;->b(Ljava/lang/Object;)I

    move-result v1

    iget-object v2, p0, Landroid/support/constraint/n/k/e;->H:Landroid/support/constraint/n/k/d;

    invoke-virtual {p1, v2}, Landroid/support/constraint/n/d;->b(Ljava/lang/Object;)I

    move-result v2

    iget-object v3, p0, Landroid/support/constraint/n/k/e;->I:Landroid/support/constraint/n/k/d;

    invoke-virtual {p1, v3}, Landroid/support/constraint/n/d;->b(Ljava/lang/Object;)I

    move-result p1

    if-eqz p2, :cond_0

    iget-object v3, p0, Landroid/support/constraint/n/k/e;->d:Landroid/support/constraint/n/k/m/l;

    if-eqz v3, :cond_0

    iget-object v4, v3, Landroid/support/constraint/n/k/m/p;->h:Landroid/support/constraint/n/k/m/f;

    iget-boolean v5, v4, Landroid/support/constraint/n/k/m/f;->j:Z

    if-eqz v5, :cond_0

    iget-object v3, v3, Landroid/support/constraint/n/k/m/p;->i:Landroid/support/constraint/n/k/m/f;

    iget-boolean v5, v3, Landroid/support/constraint/n/k/m/f;->j:Z

    if-eqz v5, :cond_0

    iget v0, v4, Landroid/support/constraint/n/k/m/f;->g:I

    iget v2, v3, Landroid/support/constraint/n/k/m/f;->g:I

    :cond_0
    if-eqz p2, :cond_1

    iget-object p2, p0, Landroid/support/constraint/n/k/e;->e:Landroid/support/constraint/n/k/m/n;

    if-eqz p2, :cond_1

    iget-object v3, p2, Landroid/support/constraint/n/k/m/p;->h:Landroid/support/constraint/n/k/m/f;

    iget-boolean v4, v3, Landroid/support/constraint/n/k/m/f;->j:Z

    if-eqz v4, :cond_1

    iget-object p2, p2, Landroid/support/constraint/n/k/m/p;->i:Landroid/support/constraint/n/k/m/f;

    iget-boolean v4, p2, Landroid/support/constraint/n/k/m/f;->j:Z

    if-eqz v4, :cond_1

    iget v1, v3, Landroid/support/constraint/n/k/m/f;->g:I

    iget p1, p2, Landroid/support/constraint/n/k/m/f;->g:I

    :cond_1
    sub-int p2, v2, v0

    sub-int v3, p1, v1

    const/4 v4, 0x0

    if-ltz p2, :cond_2

    if-ltz v3, :cond_2

    const/high16 p2, -0x80000000

    if-eq v0, p2, :cond_2

    const v3, 0x7fffffff

    if-eq v0, v3, :cond_2

    if-eq v1, p2, :cond_2

    if-eq v1, v3, :cond_2

    if-eq v2, p2, :cond_2

    if-eq v2, v3, :cond_2

    if-eq p1, p2, :cond_2

    if-ne p1, v3, :cond_3

    :cond_2
    move p1, v4

    move v0, p1

    move v1, v0

    move v2, v1

    :cond_3
    invoke-virtual {p0, v0, v1, v2, p1}, Landroid/support/constraint/n/k/e;->a(IIII)V

    return-void
.end method

.method public b(Landroid/support/constraint/n/k/e$b;)V
    .locals 1

    iget-object p0, p0, Landroid/support/constraint/n/k/e;->Q:[Landroid/support/constraint/n/k/e$b;

    const/4 v0, 0x1

    aput-object p1, p0, v0

    return-void
.end method

.method public b(Landroid/support/constraint/n/k/e;)V
    .locals 0

    iput-object p1, p0, Landroid/support/constraint/n/k/e;->R:Landroid/support/constraint/n/k/e;

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 8

    const/4 v0, 0x0

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_2

    :cond_0
    const/4 v1, -0x1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0x2c

    invoke-virtual {p1, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-lez v3, :cond_3

    add-int/lit8 v6, v2, -0x1

    if-ge v3, v6, :cond_3

    invoke-virtual {p1, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    const-string v7, "W"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1

    move v1, v4

    goto :goto_0

    :cond_1
    const-string v4, "H"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    move v1, v5

    :cond_2
    :goto_0
    add-int/lit8 v4, v3, 0x1

    :cond_3
    const/16 v3, 0x3a

    invoke-virtual {p1, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    if-ltz v3, :cond_5

    sub-int/2addr v2, v5

    if-ge v3, v2, :cond_5

    invoke-virtual {p1, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    add-int/2addr v3, v5

    invoke-virtual {p1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_6

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_6

    :try_start_0
    invoke-static {v2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v2

    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p1

    cmpl-float v3, v2, v0

    if-lez v3, :cond_6

    cmpl-float v3, p1, v0

    if-lez v3, :cond_6

    if-ne v1, v5, :cond_4

    div-float/2addr p1, v2

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    goto :goto_1

    :cond_4
    div-float/2addr v2, p1

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_5
    invoke-virtual {p1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_6

    :try_start_1
    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p1
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    :cond_6
    move p1, v0

    :goto_1
    cmpl-float v0, p1, v0

    if-lez v0, :cond_7

    iput p1, p0, Landroid/support/constraint/n/k/e;->U:F

    iput v1, p0, Landroid/support/constraint/n/k/e;->V:I

    :cond_7
    return-void

    :cond_8
    :goto_2
    iput v0, p0, Landroid/support/constraint/n/k/e;->U:F

    return-void
.end method

.method public b(Z)V
    .locals 0

    iput-boolean p1, p0, Landroid/support/constraint/n/k/e;->B:Z

    return-void
.end method

.method b()Z
    .locals 1

    instance-of v0, p0, Landroid/support/constraint/n/k/k;

    if-nez v0, :cond_1

    instance-of p0, p0, Landroid/support/constraint/n/k/g;

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public c(I)I
    .locals 1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroid/support/constraint/n/k/e;->C()I

    move-result p0

    return p0

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    invoke-virtual {p0}, Landroid/support/constraint/n/k/e;->k()I

    move-result p0

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public c(F)V
    .locals 0

    iput p1, p0, Landroid/support/constraint/n/k/e;->c0:F

    return-void
.end method

.method public c(II)V
    .locals 0

    iput p1, p0, Landroid/support/constraint/n/k/e;->W:I

    sub-int/2addr p2, p1

    iput p2, p0, Landroid/support/constraint/n/k/e;->S:I

    iget p1, p0, Landroid/support/constraint/n/k/e;->Z:I

    if-ge p2, p1, :cond_0

    iput p1, p0, Landroid/support/constraint/n/k/e;->S:I

    :cond_0
    return-void
.end method

.method public c(Z)V
    .locals 0

    iput-boolean p1, p0, Landroid/support/constraint/n/k/e;->C:Z

    return-void
.end method

.method public c()Z
    .locals 1

    iget p0, p0, Landroid/support/constraint/n/k/e;->e0:I

    const/16 v0, 0x8

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public d(I)Landroid/support/constraint/n/k/e;
    .locals 1

    if-nez p1, :cond_0

    iget-object p0, p0, Landroid/support/constraint/n/k/e;->H:Landroid/support/constraint/n/k/d;

    iget-object p1, p0, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    if-eqz p1, :cond_1

    iget-object v0, p1, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    if-ne v0, p0, :cond_1

    iget-object p0, p1, Landroid/support/constraint/n/k/d;->d:Landroid/support/constraint/n/k/e;

    return-object p0

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    iget-object p0, p0, Landroid/support/constraint/n/k/e;->I:Landroid/support/constraint/n/k/d;

    iget-object p1, p0, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    if-eqz p1, :cond_1

    iget-object v0, p1, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    if-ne v0, p0, :cond_1

    iget-object p0, p1, Landroid/support/constraint/n/k/d;->d:Landroid/support/constraint/n/k/e;

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->d:Landroid/support/constraint/n/k/m/l;

    if-nez v0, :cond_0

    new-instance v0, Landroid/support/constraint/n/k/m/l;

    invoke-direct {v0, p0}, Landroid/support/constraint/n/k/m/l;-><init>(Landroid/support/constraint/n/k/e;)V

    iput-object v0, p0, Landroid/support/constraint/n/k/e;->d:Landroid/support/constraint/n/k/m/l;

    :cond_0
    iget-object v0, p0, Landroid/support/constraint/n/k/e;->e:Landroid/support/constraint/n/k/m/n;

    if-nez v0, :cond_1

    new-instance v0, Landroid/support/constraint/n/k/m/n;

    invoke-direct {v0, p0}, Landroid/support/constraint/n/k/m/n;-><init>(Landroid/support/constraint/n/k/e;)V

    iput-object v0, p0, Landroid/support/constraint/n/k/e;->e:Landroid/support/constraint/n/k/m/n;

    :cond_1
    return-void
.end method

.method public d(F)V
    .locals 1

    iget-object p0, p0, Landroid/support/constraint/n/k/e;->j0:[F

    const/4 v0, 0x1

    aput p1, p0, v0

    return-void
.end method

.method public d(II)V
    .locals 0

    iput p1, p0, Landroid/support/constraint/n/k/e;->D:I

    iput p2, p0, Landroid/support/constraint/n/k/e;->E:I

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/support/constraint/n/k/e;->d(Z)V

    return-void
.end method

.method public d(Z)V
    .locals 0

    iput-boolean p1, p0, Landroid/support/constraint/n/k/e;->g:Z

    return-void
.end method

.method public e()I
    .locals 0

    iget p0, p0, Landroid/support/constraint/n/k/e;->Y:I

    return p0
.end method

.method public e(I)Landroid/support/constraint/n/k/e;
    .locals 1

    if-nez p1, :cond_0

    iget-object p0, p0, Landroid/support/constraint/n/k/e;->F:Landroid/support/constraint/n/k/d;

    iget-object p1, p0, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    if-eqz p1, :cond_1

    iget-object v0, p1, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    if-ne v0, p0, :cond_1

    iget-object p0, p1, Landroid/support/constraint/n/k/d;->d:Landroid/support/constraint/n/k/e;

    return-object p0

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    iget-object p0, p0, Landroid/support/constraint/n/k/e;->G:Landroid/support/constraint/n/k/d;

    iget-object p1, p0, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    if-eqz p1, :cond_1

    iget-object v0, p1, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    if-ne v0, p0, :cond_1

    iget-object p0, p1, Landroid/support/constraint/n/k/d;->d:Landroid/support/constraint/n/k/e;

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public e(II)V
    .locals 0

    iput p1, p0, Landroid/support/constraint/n/k/e;->W:I

    iput p2, p0, Landroid/support/constraint/n/k/e;->X:I

    return-void
.end method

.method public f()I
    .locals 1

    invoke-virtual {p0}, Landroid/support/constraint/n/k/e;->E()I

    move-result v0

    iget p0, p0, Landroid/support/constraint/n/k/e;->T:I

    add-int/2addr v0, p0

    return v0
.end method

.method public f(I)Landroid/support/constraint/n/k/m/p;
    .locals 1

    if-nez p1, :cond_0

    iget-object p0, p0, Landroid/support/constraint/n/k/e;->d:Landroid/support/constraint/n/k/m/l;

    return-object p0

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    iget-object p0, p0, Landroid/support/constraint/n/k/e;->e:Landroid/support/constraint/n/k/m/n;

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public f(II)V
    .locals 0

    iput p1, p0, Landroid/support/constraint/n/k/e;->X:I

    sub-int/2addr p2, p1

    iput p2, p0, Landroid/support/constraint/n/k/e;->T:I

    iget p1, p0, Landroid/support/constraint/n/k/e;->a0:I

    if-ge p2, p1, :cond_0

    iput p1, p0, Landroid/support/constraint/n/k/e;->T:I

    :cond_0
    return-void
.end method

.method public g()Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Landroid/support/constraint/n/k/e;->d0:Ljava/lang/Object;

    return-object p0
.end method

.method public g(I)Z
    .locals 4

    const/4 v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez p1, :cond_3

    iget-object p1, p0, Landroid/support/constraint/n/k/e;->F:Landroid/support/constraint/n/k/d;

    iget-object p1, p1, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    if-eqz p1, :cond_0

    move p1, v1

    goto :goto_0

    :cond_0
    move p1, v2

    :goto_0
    iget-object p0, p0, Landroid/support/constraint/n/k/e;->H:Landroid/support/constraint/n/k/d;

    iget-object p0, p0, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    if-eqz p0, :cond_1

    move p0, v1

    goto :goto_1

    :cond_1
    move p0, v2

    :goto_1
    add-int/2addr p1, p0

    if-ge p1, v0, :cond_2

    goto :goto_2

    :cond_2
    move v1, v2

    :goto_2
    return v1

    :cond_3
    iget-object p1, p0, Landroid/support/constraint/n/k/e;->G:Landroid/support/constraint/n/k/d;

    iget-object p1, p1, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    if-eqz p1, :cond_4

    move p1, v1

    goto :goto_3

    :cond_4
    move p1, v2

    :goto_3
    iget-object v3, p0, Landroid/support/constraint/n/k/e;->I:Landroid/support/constraint/n/k/d;

    iget-object v3, v3, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    if-eqz v3, :cond_5

    move v3, v1

    goto :goto_4

    :cond_5
    move v3, v2

    :goto_4
    add-int/2addr p1, v3

    iget-object p0, p0, Landroid/support/constraint/n/k/e;->J:Landroid/support/constraint/n/k/d;

    iget-object p0, p0, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    if-eqz p0, :cond_6

    move p0, v1

    goto :goto_5

    :cond_6
    move p0, v2

    :goto_5
    add-int/2addr p1, p0

    if-ge p1, v0, :cond_7

    goto :goto_6

    :cond_7
    move v1, v2

    :goto_6
    return v1
.end method

.method public h()Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Landroid/support/constraint/n/k/e;->f0:Ljava/lang/String;

    return-object p0
.end method

.method public h(I)V
    .locals 0

    iput p1, p0, Landroid/support/constraint/n/k/e;->Y:I

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Landroid/support/constraint/n/k/e;->A:Z

    return-void
.end method

.method public i()F
    .locals 0

    iget p0, p0, Landroid/support/constraint/n/k/e;->U:F

    return p0
.end method

.method public i(I)V
    .locals 3

    iget-boolean v0, p0, Landroid/support/constraint/n/k/e;->A:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Landroid/support/constraint/n/k/e;->Y:I

    sub-int v0, p1, v0

    iget v1, p0, Landroid/support/constraint/n/k/e;->T:I

    add-int/2addr v1, v0

    iput v0, p0, Landroid/support/constraint/n/k/e;->X:I

    iget-object v2, p0, Landroid/support/constraint/n/k/e;->G:Landroid/support/constraint/n/k/d;

    invoke-virtual {v2, v0}, Landroid/support/constraint/n/k/d;->a(I)V

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->I:Landroid/support/constraint/n/k/d;

    invoke-virtual {v0, v1}, Landroid/support/constraint/n/k/d;->a(I)V

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->J:Landroid/support/constraint/n/k/d;

    invoke-virtual {v0, p1}, Landroid/support/constraint/n/k/d;->a(I)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroid/support/constraint/n/k/e;->k:Z

    return-void
.end method

.method public j()I
    .locals 0

    iget p0, p0, Landroid/support/constraint/n/k/e;->V:I

    return p0
.end method

.method public j(I)V
    .locals 1

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->F:Landroid/support/constraint/n/k/d;

    invoke-virtual {v0, p1}, Landroid/support/constraint/n/k/d;->a(I)V

    iput p1, p0, Landroid/support/constraint/n/k/e;->W:I

    return-void
.end method

.method public k()I
    .locals 2

    iget v0, p0, Landroid/support/constraint/n/k/e;->e0:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    iget p0, p0, Landroid/support/constraint/n/k/e;->T:I

    return p0
.end method

.method public k(I)V
    .locals 1

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->G:Landroid/support/constraint/n/k/d;

    invoke-virtual {v0, p1}, Landroid/support/constraint/n/k/d;->a(I)V

    iput p1, p0, Landroid/support/constraint/n/k/e;->X:I

    return-void
.end method

.method public l()F
    .locals 0

    iget p0, p0, Landroid/support/constraint/n/k/e;->b0:F

    return p0
.end method

.method public l(I)V
    .locals 1

    iput p1, p0, Landroid/support/constraint/n/k/e;->T:I

    iget v0, p0, Landroid/support/constraint/n/k/e;->a0:I

    if-ge p1, v0, :cond_0

    iput v0, p0, Landroid/support/constraint/n/k/e;->T:I

    :cond_0
    return-void
.end method

.method public m()I
    .locals 0

    iget p0, p0, Landroid/support/constraint/n/k/e;->h0:I

    return p0
.end method

.method public m(I)V
    .locals 0

    iput p1, p0, Landroid/support/constraint/n/k/e;->h0:I

    return-void
.end method

.method public n()Landroid/support/constraint/n/k/e$b;
    .locals 1

    iget-object p0, p0, Landroid/support/constraint/n/k/e;->Q:[Landroid/support/constraint/n/k/e$b;

    const/4 v0, 0x0

    aget-object p0, p0, v0

    return-object p0
.end method

.method public n(I)V
    .locals 1

    iget-object p0, p0, Landroid/support/constraint/n/k/e;->y:[I

    const/4 v0, 0x1

    aput p1, p0, v0

    return-void
.end method

.method public o()I
    .locals 2

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->F:Landroid/support/constraint/n/k/d;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget v0, v0, Landroid/support/constraint/n/k/d;->g:I

    add-int/2addr v1, v0

    :cond_0
    iget-object p0, p0, Landroid/support/constraint/n/k/e;->H:Landroid/support/constraint/n/k/d;

    if-eqz p0, :cond_1

    iget p0, p0, Landroid/support/constraint/n/k/d;->g:I

    add-int/2addr v1, p0

    :cond_1
    return v1
.end method

.method public o(I)V
    .locals 1

    iget-object p0, p0, Landroid/support/constraint/n/k/e;->y:[I

    const/4 v0, 0x0

    aput p1, p0, v0

    return-void
.end method

.method public p()I
    .locals 0

    iget p0, p0, Landroid/support/constraint/n/k/e;->D:I

    return p0
.end method

.method public p(I)V
    .locals 0

    if-gez p1, :cond_0

    const/4 p1, 0x0

    :cond_0
    iput p1, p0, Landroid/support/constraint/n/k/e;->a0:I

    return-void
.end method

.method public q()I
    .locals 0

    iget p0, p0, Landroid/support/constraint/n/k/e;->E:I

    return p0
.end method

.method public q(I)V
    .locals 0

    if-gez p1, :cond_0

    const/4 p1, 0x0

    :cond_0
    iput p1, p0, Landroid/support/constraint/n/k/e;->Z:I

    return-void
.end method

.method public r()I
    .locals 1

    iget-object p0, p0, Landroid/support/constraint/n/k/e;->y:[I

    const/4 v0, 0x1

    aget p0, p0, v0

    return p0
.end method

.method public r(I)V
    .locals 0

    iput p1, p0, Landroid/support/constraint/n/k/e;->i0:I

    return-void
.end method

.method public s()I
    .locals 1

    iget-object p0, p0, Landroid/support/constraint/n/k/e;->y:[I

    const/4 v0, 0x0

    aget p0, p0, v0

    return p0
.end method

.method public s(I)V
    .locals 0

    iput p1, p0, Landroid/support/constraint/n/k/e;->e0:I

    return-void
.end method

.method public t()I
    .locals 0

    iget p0, p0, Landroid/support/constraint/n/k/e;->a0:I

    return p0
.end method

.method public t(I)V
    .locals 1

    iput p1, p0, Landroid/support/constraint/n/k/e;->S:I

    iget v0, p0, Landroid/support/constraint/n/k/e;->Z:I

    if-ge p1, v0, :cond_0

    iput v0, p0, Landroid/support/constraint/n/k/e;->S:I

    :cond_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Landroid/support/constraint/n/k/e;->g0:Ljava/lang/String;

    const-string v2, " "

    const-string v3, ""

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "type: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Landroid/support/constraint/n/k/e;->g0:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroid/support/constraint/n/k/e;->f0:Ljava/lang/String;

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "id: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Landroid/support/constraint/n/k/e;->f0:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :cond_1
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroid/support/constraint/n/k/e;->W:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroid/support/constraint/n/k/e;->X:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ") - ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroid/support/constraint/n/k/e;->S:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " x "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, Landroid/support/constraint/n/k/e;->T:I

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public u()I
    .locals 0

    iget p0, p0, Landroid/support/constraint/n/k/e;->Z:I

    return p0
.end method

.method public u(I)V
    .locals 0

    iput p1, p0, Landroid/support/constraint/n/k/e;->W:I

    return-void
.end method

.method public v()Landroid/support/constraint/n/k/e;
    .locals 0

    iget-object p0, p0, Landroid/support/constraint/n/k/e;->R:Landroid/support/constraint/n/k/e;

    return-object p0
.end method

.method public v(I)V
    .locals 0

    iput p1, p0, Landroid/support/constraint/n/k/e;->X:I

    return-void
.end method

.method public w()I
    .locals 1

    invoke-virtual {p0}, Landroid/support/constraint/n/k/e;->D()I

    move-result v0

    iget p0, p0, Landroid/support/constraint/n/k/e;->S:I

    add-int/2addr v0, p0

    return v0
.end method

.method public x()F
    .locals 0

    iget p0, p0, Landroid/support/constraint/n/k/e;->c0:F

    return p0
.end method

.method public y()I
    .locals 0

    iget p0, p0, Landroid/support/constraint/n/k/e;->i0:I

    return p0
.end method

.method public z()Landroid/support/constraint/n/k/e$b;
    .locals 1

    iget-object p0, p0, Landroid/support/constraint/n/k/e;->Q:[Landroid/support/constraint/n/k/e$b;

    const/4 v0, 0x1

    aget-object p0, p0, v0

    return-object p0
.end method
