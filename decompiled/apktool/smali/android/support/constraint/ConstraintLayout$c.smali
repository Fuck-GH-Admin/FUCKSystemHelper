.class Landroid/support/constraint/ConstraintLayout$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/support/constraint/n/k/m/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/constraint/ConstraintLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field a:Landroid/support/constraint/ConstraintLayout;

.field b:I

.field c:I

.field d:I

.field e:I

.field f:I

.field g:I

.field final synthetic h:Landroid/support/constraint/ConstraintLayout;


# direct methods
.method public constructor <init>(Landroid/support/constraint/ConstraintLayout;Landroid/support/constraint/ConstraintLayout;)V
    .locals 0

    iput-object p1, p0, Landroid/support/constraint/ConstraintLayout$c;->h:Landroid/support/constraint/ConstraintLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Landroid/support/constraint/ConstraintLayout$c;->a:Landroid/support/constraint/ConstraintLayout;

    return-void
.end method

.method private a(III)Z
    .locals 2

    const/4 p0, 0x1

    if-ne p1, p2, :cond_0

    return p0

    :cond_0
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p1

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    const/high16 v1, 0x40000000    # 2.0f

    if-ne p1, v1, :cond_2

    const/high16 p1, -0x80000000

    if-eq v0, p1, :cond_1

    if-nez v0, :cond_2

    :cond_1
    if-ne p3, p2, :cond_2

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-object v0, p0, Landroid/support/constraint/ConstraintLayout$c;->a:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    iget-object v3, p0, Landroid/support/constraint/ConstraintLayout$c;->a:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    instance-of v4, v3, Landroid/support/constraint/i;

    if-eqz v4, :cond_0

    check-cast v3, Landroid/support/constraint/i;

    iget-object v4, p0, Landroid/support/constraint/ConstraintLayout$c;->a:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v3, v4}, Landroid/support/constraint/i;->a(Landroid/support/constraint/ConstraintLayout;)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Landroid/support/constraint/ConstraintLayout$c;->a:Landroid/support/constraint/ConstraintLayout;

    invoke-static {v0}, Landroid/support/constraint/ConstraintLayout;->b(Landroid/support/constraint/ConstraintLayout;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    :goto_1
    if-ge v1, v0, :cond_2

    iget-object v2, p0, Landroid/support/constraint/ConstraintLayout$c;->a:Landroid/support/constraint/ConstraintLayout;

    invoke-static {v2}, Landroid/support/constraint/ConstraintLayout;->b(Landroid/support/constraint/ConstraintLayout;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/support/constraint/c;

    iget-object v3, p0, Landroid/support/constraint/ConstraintLayout$c;->a:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v2, v3}, Landroid/support/constraint/c;->c(Landroid/support/constraint/ConstraintLayout;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public a(IIIIII)V
    .locals 0

    iput p3, p0, Landroid/support/constraint/ConstraintLayout$c;->b:I

    iput p4, p0, Landroid/support/constraint/ConstraintLayout$c;->c:I

    iput p5, p0, Landroid/support/constraint/ConstraintLayout$c;->d:I

    iput p6, p0, Landroid/support/constraint/ConstraintLayout$c;->e:I

    iput p1, p0, Landroid/support/constraint/ConstraintLayout$c;->f:I

    iput p2, p0, Landroid/support/constraint/ConstraintLayout$c;->g:I

    return-void
.end method

.method public final a(Landroid/support/constraint/n/k/e;Landroid/support/constraint/n/k/m/b$a;)V
    .locals 17
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongCall"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroid/support/constraint/n/k/e;->B()I

    move-result v3

    const/16 v4, 0x8

    const/4 v5, 0x0

    if-ne v3, v4, :cond_1

    invoke-virtual/range {p1 .. p1}, Landroid/support/constraint/n/k/e;->I()Z

    move-result v3

    if-nez v3, :cond_1

    iput v5, v2, Landroid/support/constraint/n/k/m/b$a;->e:I

    iput v5, v2, Landroid/support/constraint/n/k/m/b$a;->f:I

    iput v5, v2, Landroid/support/constraint/n/k/m/b$a;->g:I

    return-void

    :cond_1
    invoke-virtual/range {p1 .. p1}, Landroid/support/constraint/n/k/e;->v()Landroid/support/constraint/n/k/e;

    move-result-object v3

    if-nez v3, :cond_2

    return-void

    :cond_2
    iget-object v3, v2, Landroid/support/constraint/n/k/m/b$a;->a:Landroid/support/constraint/n/k/e$b;

    iget-object v4, v2, Landroid/support/constraint/n/k/m/b$a;->b:Landroid/support/constraint/n/k/e$b;

    iget v6, v2, Landroid/support/constraint/n/k/m/b$a;->c:I

    iget v7, v2, Landroid/support/constraint/n/k/m/b$a;->d:I

    iget v8, v0, Landroid/support/constraint/ConstraintLayout$c;->b:I

    iget v9, v0, Landroid/support/constraint/ConstraintLayout$c;->c:I

    add-int/2addr v8, v9

    iget v9, v0, Landroid/support/constraint/ConstraintLayout$c;->d:I

    invoke-virtual/range {p1 .. p1}, Landroid/support/constraint/n/k/e;->g()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/view/View;

    sget-object v11, Landroid/support/constraint/ConstraintLayout$a;->a:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v12

    aget v11, v11, v12

    const/4 v12, 0x4

    const/4 v13, 0x3

    const/4 v14, 0x2

    const/4 v5, -0x2

    const/4 v15, 0x1

    if-eq v11, v15, :cond_c

    if-eq v11, v14, :cond_b

    if-eq v11, v13, :cond_a

    if-eq v11, v12, :cond_3

    const/4 v6, 0x0

    goto/16 :goto_5

    :cond_3
    iget v6, v0, Landroid/support/constraint/ConstraintLayout$c;->f:I

    invoke-static {v6, v9, v5}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v6

    iget v9, v1, Landroid/support/constraint/n/k/e;->n:I

    if-ne v9, v15, :cond_4

    move v9, v15

    goto :goto_0

    :cond_4
    const/4 v9, 0x0

    :goto_0
    iget v11, v2, Landroid/support/constraint/n/k/m/b$a;->j:I

    sget v12, Landroid/support/constraint/n/k/m/b$a;->l:I

    if-eq v11, v12, :cond_5

    sget v12, Landroid/support/constraint/n/k/m/b$a;->m:I

    if-ne v11, v12, :cond_d

    :cond_5
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredHeight()I

    move-result v11

    invoke-virtual/range {p1 .. p1}, Landroid/support/constraint/n/k/e;->k()I

    move-result v12

    if-ne v11, v12, :cond_6

    move v11, v15

    goto :goto_1

    :cond_6
    const/4 v11, 0x0

    :goto_1
    iget v12, v2, Landroid/support/constraint/n/k/m/b$a;->j:I

    sget v13, Landroid/support/constraint/n/k/m/b$a;->m:I

    if-eq v12, v13, :cond_9

    if-eqz v9, :cond_9

    if-eqz v9, :cond_7

    if-nez v11, :cond_9

    :cond_7
    instance-of v9, v10, Landroid/support/constraint/i;

    if-nez v9, :cond_9

    invoke-virtual/range {p1 .. p1}, Landroid/support/constraint/n/k/e;->M()Z

    move-result v9

    if-eqz v9, :cond_8

    goto :goto_2

    :cond_8
    const/4 v9, 0x0

    goto :goto_3

    :cond_9
    :goto_2
    move v9, v15

    :goto_3
    if-eqz v9, :cond_d

    invoke-virtual/range {p1 .. p1}, Landroid/support/constraint/n/k/e;->C()I

    move-result v6

    goto :goto_4

    :cond_a
    iget v6, v0, Landroid/support/constraint/ConstraintLayout$c;->f:I

    invoke-virtual/range {p1 .. p1}, Landroid/support/constraint/n/k/e;->o()I

    move-result v11

    add-int/2addr v9, v11

    const/4 v11, -0x1

    invoke-static {v6, v9, v11}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v6

    goto :goto_5

    :cond_b
    iget v6, v0, Landroid/support/constraint/ConstraintLayout$c;->f:I

    invoke-static {v6, v9, v5}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v6

    goto :goto_5

    :cond_c
    :goto_4
    const/high16 v9, 0x40000000    # 2.0f

    invoke-static {v6, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v6

    :cond_d
    :goto_5
    sget-object v9, Landroid/support/constraint/ConstraintLayout$a;->a:[I

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    aget v9, v9, v11

    if-eq v9, v15, :cond_17

    if-eq v9, v14, :cond_16

    const/4 v7, 0x3

    if-eq v9, v7, :cond_15

    const/4 v7, 0x4

    if-eq v9, v7, :cond_e

    const/4 v5, 0x0

    goto/16 :goto_a

    :cond_e
    iget v7, v0, Landroid/support/constraint/ConstraintLayout$c;->g:I

    invoke-static {v7, v8, v5}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v5

    iget v7, v1, Landroid/support/constraint/n/k/e;->o:I

    if-ne v7, v15, :cond_f

    move v7, v15

    goto :goto_6

    :cond_f
    const/4 v7, 0x0

    :goto_6
    iget v8, v2, Landroid/support/constraint/n/k/m/b$a;->j:I

    sget v9, Landroid/support/constraint/n/k/m/b$a;->l:I

    if-eq v8, v9, :cond_10

    sget v9, Landroid/support/constraint/n/k/m/b$a;->m:I

    if-ne v8, v9, :cond_18

    :cond_10
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredWidth()I

    move-result v8

    invoke-virtual/range {p1 .. p1}, Landroid/support/constraint/n/k/e;->C()I

    move-result v9

    if-ne v8, v9, :cond_11

    move v8, v15

    goto :goto_7

    :cond_11
    const/4 v8, 0x0

    :goto_7
    iget v9, v2, Landroid/support/constraint/n/k/m/b$a;->j:I

    sget v11, Landroid/support/constraint/n/k/m/b$a;->m:I

    if-eq v9, v11, :cond_14

    if-eqz v7, :cond_14

    if-eqz v7, :cond_12

    if-nez v8, :cond_14

    :cond_12
    instance-of v7, v10, Landroid/support/constraint/i;

    if-nez v7, :cond_14

    invoke-virtual/range {p1 .. p1}, Landroid/support/constraint/n/k/e;->N()Z

    move-result v7

    if-eqz v7, :cond_13

    goto :goto_8

    :cond_13
    const/4 v7, 0x0

    goto :goto_9

    :cond_14
    :goto_8
    move v7, v15

    :goto_9
    if-eqz v7, :cond_18

    invoke-virtual/range {p1 .. p1}, Landroid/support/constraint/n/k/e;->k()I

    move-result v5

    const/high16 v7, 0x40000000    # 2.0f

    invoke-static {v5, v7}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v5

    goto :goto_a

    :cond_15
    iget v5, v0, Landroid/support/constraint/ConstraintLayout$c;->g:I

    invoke-virtual/range {p1 .. p1}, Landroid/support/constraint/n/k/e;->A()I

    move-result v7

    add-int/2addr v8, v7

    const/4 v7, -0x1

    invoke-static {v5, v8, v7}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v5

    goto :goto_a

    :cond_16
    iget v7, v0, Landroid/support/constraint/ConstraintLayout$c;->g:I

    invoke-static {v7, v8, v5}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v5

    goto :goto_a

    :cond_17
    const/high16 v5, 0x40000000    # 2.0f

    invoke-static {v7, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v7

    move v5, v7

    :cond_18
    :goto_a
    invoke-virtual/range {p1 .. p1}, Landroid/support/constraint/n/k/e;->v()Landroid/support/constraint/n/k/e;

    move-result-object v7

    check-cast v7, Landroid/support/constraint/n/k/f;

    if-eqz v7, :cond_1a

    iget-object v8, v0, Landroid/support/constraint/ConstraintLayout$c;->h:Landroid/support/constraint/ConstraintLayout;

    invoke-static {v8}, Landroid/support/constraint/ConstraintLayout;->a(Landroid/support/constraint/ConstraintLayout;)I

    move-result v8

    const/16 v9, 0x100

    invoke-static {v8, v9}, Landroid/support/constraint/n/k/j;->a(II)Z

    move-result v8

    if-eqz v8, :cond_1a

    invoke-virtual {v10}, Landroid/view/View;->getMeasuredWidth()I

    move-result v8

    invoke-virtual/range {p1 .. p1}, Landroid/support/constraint/n/k/e;->C()I

    move-result v9

    if-ne v8, v9, :cond_1a

    invoke-virtual {v10}, Landroid/view/View;->getMeasuredWidth()I

    move-result v8

    invoke-virtual {v7}, Landroid/support/constraint/n/k/e;->C()I

    move-result v9

    if-ge v8, v9, :cond_1a

    invoke-virtual {v10}, Landroid/view/View;->getMeasuredHeight()I

    move-result v8

    invoke-virtual/range {p1 .. p1}, Landroid/support/constraint/n/k/e;->k()I

    move-result v9

    if-ne v8, v9, :cond_1a

    invoke-virtual {v10}, Landroid/view/View;->getMeasuredHeight()I

    move-result v8

    invoke-virtual {v7}, Landroid/support/constraint/n/k/e;->k()I

    move-result v7

    if-ge v8, v7, :cond_1a

    invoke-virtual {v10}, Landroid/view/View;->getBaseline()I

    move-result v7

    invoke-virtual/range {p1 .. p1}, Landroid/support/constraint/n/k/e;->e()I

    move-result v8

    if-ne v7, v8, :cond_1a

    invoke-virtual/range {p1 .. p1}, Landroid/support/constraint/n/k/e;->L()Z

    move-result v7

    if-nez v7, :cond_1a

    invoke-virtual/range {p1 .. p1}, Landroid/support/constraint/n/k/e;->p()I

    move-result v7

    invoke-virtual/range {p1 .. p1}, Landroid/support/constraint/n/k/e;->C()I

    move-result v8

    invoke-direct {v0, v7, v6, v8}, Landroid/support/constraint/ConstraintLayout$c;->a(III)Z

    move-result v7

    if-eqz v7, :cond_19

    invoke-virtual/range {p1 .. p1}, Landroid/support/constraint/n/k/e;->q()I

    move-result v7

    invoke-virtual/range {p1 .. p1}, Landroid/support/constraint/n/k/e;->k()I

    move-result v8

    invoke-direct {v0, v7, v5, v8}, Landroid/support/constraint/ConstraintLayout$c;->a(III)Z

    move-result v7

    if-eqz v7, :cond_19

    move v7, v15

    goto :goto_b

    :cond_19
    const/4 v7, 0x0

    :goto_b
    if-eqz v7, :cond_1a

    invoke-virtual/range {p1 .. p1}, Landroid/support/constraint/n/k/e;->C()I

    move-result v0

    iput v0, v2, Landroid/support/constraint/n/k/m/b$a;->e:I

    invoke-virtual/range {p1 .. p1}, Landroid/support/constraint/n/k/e;->k()I

    move-result v0

    iput v0, v2, Landroid/support/constraint/n/k/m/b$a;->f:I

    invoke-virtual/range {p1 .. p1}, Landroid/support/constraint/n/k/e;->e()I

    move-result v0

    iput v0, v2, Landroid/support/constraint/n/k/m/b$a;->g:I

    return-void

    :cond_1a
    sget-object v7, Landroid/support/constraint/n/k/e$b;->d:Landroid/support/constraint/n/k/e$b;

    if-ne v3, v7, :cond_1b

    move v7, v15

    goto :goto_c

    :cond_1b
    const/4 v7, 0x0

    :goto_c
    sget-object v8, Landroid/support/constraint/n/k/e$b;->d:Landroid/support/constraint/n/k/e$b;

    if-ne v4, v8, :cond_1c

    move v8, v15

    goto :goto_d

    :cond_1c
    const/4 v8, 0x0

    :goto_d
    sget-object v9, Landroid/support/constraint/n/k/e$b;->e:Landroid/support/constraint/n/k/e$b;

    if-eq v4, v9, :cond_1e

    sget-object v9, Landroid/support/constraint/n/k/e$b;->b:Landroid/support/constraint/n/k/e$b;

    if-ne v4, v9, :cond_1d

    goto :goto_e

    :cond_1d
    const/4 v4, 0x0

    goto :goto_f

    :cond_1e
    :goto_e
    move v4, v15

    :goto_f
    sget-object v9, Landroid/support/constraint/n/k/e$b;->e:Landroid/support/constraint/n/k/e$b;

    if-eq v3, v9, :cond_20

    sget-object v9, Landroid/support/constraint/n/k/e$b;->b:Landroid/support/constraint/n/k/e$b;

    if-ne v3, v9, :cond_1f

    goto :goto_10

    :cond_1f
    const/4 v3, 0x0

    goto :goto_11

    :cond_20
    :goto_10
    move v3, v15

    :goto_11
    const/4 v9, 0x0

    if-eqz v7, :cond_21

    iget v11, v1, Landroid/support/constraint/n/k/e;->U:F

    cmpl-float v11, v11, v9

    if-lez v11, :cond_21

    move v11, v15

    goto :goto_12

    :cond_21
    const/4 v11, 0x0

    :goto_12
    if-eqz v8, :cond_22

    iget v12, v1, Landroid/support/constraint/n/k/e;->U:F

    cmpl-float v9, v12, v9

    if-lez v9, :cond_22

    move v9, v15

    goto :goto_13

    :cond_22
    const/4 v9, 0x0

    :goto_13
    if-nez v10, :cond_23

    return-void

    :cond_23
    invoke-virtual {v10}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v12

    check-cast v12, Landroid/support/constraint/ConstraintLayout$b;

    iget v13, v2, Landroid/support/constraint/n/k/m/b$a;->j:I

    sget v14, Landroid/support/constraint/n/k/m/b$a;->l:I

    if-eq v13, v14, :cond_25

    sget v14, Landroid/support/constraint/n/k/m/b$a;->m:I

    if-eq v13, v14, :cond_25

    if-eqz v7, :cond_25

    iget v7, v1, Landroid/support/constraint/n/k/e;->n:I

    if-nez v7, :cond_25

    if-eqz v8, :cond_25

    iget v7, v1, Landroid/support/constraint/n/k/e;->o:I

    if-eqz v7, :cond_24

    goto :goto_14

    :cond_24
    const/4 v0, -0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    goto/16 :goto_1c

    :cond_25
    :goto_14
    instance-of v7, v10, Landroid/support/constraint/l;

    if-eqz v7, :cond_26

    instance-of v7, v1, Landroid/support/constraint/n/k/k;

    if-eqz v7, :cond_26

    move-object v7, v1

    check-cast v7, Landroid/support/constraint/n/k/k;

    move-object v8, v10

    check-cast v8, Landroid/support/constraint/l;

    invoke-virtual {v8, v7, v6, v5}, Landroid/support/constraint/l;->a(Landroid/support/constraint/n/k/k;II)V

    goto :goto_15

    :cond_26
    invoke-virtual {v10, v6, v5}, Landroid/view/View;->measure(II)V

    :goto_15
    invoke-virtual {v1, v6, v5}, Landroid/support/constraint/n/k/e;->d(II)V

    invoke-virtual {v10}, Landroid/view/View;->getMeasuredWidth()I

    move-result v7

    invoke-virtual {v10}, Landroid/view/View;->getMeasuredHeight()I

    move-result v8

    invoke-virtual {v10}, Landroid/view/View;->getBaseline()I

    move-result v13

    iget v14, v1, Landroid/support/constraint/n/k/e;->q:I

    if-lez v14, :cond_27

    invoke-static {v14, v7}, Ljava/lang/Math;->max(II)I

    move-result v14

    goto :goto_16

    :cond_27
    move v14, v7

    :goto_16
    iget v15, v1, Landroid/support/constraint/n/k/e;->r:I

    if-lez v15, :cond_28

    invoke-static {v15, v14}, Ljava/lang/Math;->min(II)I

    move-result v14

    :cond_28
    iget v15, v1, Landroid/support/constraint/n/k/e;->t:I

    if-lez v15, :cond_29

    invoke-static {v15, v8}, Ljava/lang/Math;->max(II)I

    move-result v15

    move/from16 v16, v5

    goto :goto_17

    :cond_29
    move/from16 v16, v5

    move v15, v8

    :goto_17
    iget v5, v1, Landroid/support/constraint/n/k/e;->u:I

    if-lez v5, :cond_2a

    invoke-static {v5, v15}, Ljava/lang/Math;->min(II)I

    move-result v15

    :cond_2a
    iget-object v0, v0, Landroid/support/constraint/ConstraintLayout$c;->h:Landroid/support/constraint/ConstraintLayout;

    invoke-static {v0}, Landroid/support/constraint/ConstraintLayout;->a(Landroid/support/constraint/ConstraintLayout;)I

    move-result v0

    const/4 v5, 0x1

    invoke-static {v0, v5}, Landroid/support/constraint/n/k/j;->a(II)Z

    move-result v0

    if-nez v0, :cond_2c

    const/high16 v0, 0x3f000000    # 0.5f

    if-eqz v11, :cond_2b

    if-eqz v4, :cond_2b

    iget v3, v1, Landroid/support/constraint/n/k/e;->U:F

    int-to-float v4, v15

    mul-float/2addr v4, v3

    add-float/2addr v4, v0

    float-to-int v14, v4

    goto :goto_18

    :cond_2b
    if-eqz v9, :cond_2c

    if-eqz v3, :cond_2c

    iget v3, v1, Landroid/support/constraint/n/k/e;->U:F

    int-to-float v4, v14

    div-float/2addr v4, v3

    add-float/2addr v4, v0

    float-to-int v15, v4

    :cond_2c
    :goto_18
    if-ne v7, v14, :cond_2e

    if-eq v8, v15, :cond_2d

    goto :goto_1a

    :cond_2d
    :goto_19
    const/4 v0, -0x1

    goto :goto_1c

    :cond_2e
    :goto_1a
    const/high16 v0, 0x40000000    # 2.0f

    if-eq v7, v14, :cond_2f

    invoke-static {v14, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v6

    :cond_2f
    if-eq v8, v15, :cond_30

    invoke-static {v15, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v5

    goto :goto_1b

    :cond_30
    move/from16 v5, v16

    :goto_1b
    invoke-virtual {v10, v6, v5}, Landroid/view/View;->measure(II)V

    invoke-virtual {v1, v6, v5}, Landroid/support/constraint/n/k/e;->d(II)V

    invoke-virtual {v10}, Landroid/view/View;->getMeasuredWidth()I

    move-result v14

    invoke-virtual {v10}, Landroid/view/View;->getMeasuredHeight()I

    move-result v15

    invoke-virtual {v10}, Landroid/view/View;->getBaseline()I

    move-result v13

    goto :goto_19

    :goto_1c
    if-eq v13, v0, :cond_31

    const/4 v5, 0x1

    goto :goto_1d

    :cond_31
    const/4 v5, 0x0

    :goto_1d
    iget v0, v2, Landroid/support/constraint/n/k/m/b$a;->c:I

    if-ne v14, v0, :cond_33

    iget v0, v2, Landroid/support/constraint/n/k/m/b$a;->d:I

    if-eq v15, v0, :cond_32

    goto :goto_1e

    :cond_32
    const/4 v0, 0x0

    goto :goto_1f

    :cond_33
    :goto_1e
    const/4 v0, 0x1

    :goto_1f
    iput-boolean v0, v2, Landroid/support/constraint/n/k/m/b$a;->i:Z

    iget-boolean v0, v12, Landroid/support/constraint/ConstraintLayout$b;->X:Z

    if-eqz v0, :cond_34

    const/4 v5, 0x1

    :cond_34
    if-eqz v5, :cond_35

    const/4 v0, -0x1

    if-eq v13, v0, :cond_35

    invoke-virtual/range {p1 .. p1}, Landroid/support/constraint/n/k/e;->e()I

    move-result v0

    if-eq v0, v13, :cond_35

    const/4 v0, 0x1

    iput-boolean v0, v2, Landroid/support/constraint/n/k/m/b$a;->i:Z

    :cond_35
    iput v14, v2, Landroid/support/constraint/n/k/m/b$a;->e:I

    iput v15, v2, Landroid/support/constraint/n/k/m/b$a;->f:I

    iput-boolean v5, v2, Landroid/support/constraint/n/k/m/b$a;->h:Z

    iput v13, v2, Landroid/support/constraint/n/k/m/b$a;->g:I

    return-void
.end method
