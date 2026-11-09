.class public Landroid/support/constraint/n/k/g;
.super Landroid/support/constraint/n/k/e;
.source ""


# instance fields
.field protected p0:F

.field protected q0:I

.field protected r0:I

.field private s0:Landroid/support/constraint/n/k/d;

.field private t0:I

.field private u0:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Landroid/support/constraint/n/k/e;-><init>()V

    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Landroid/support/constraint/n/k/g;->p0:F

    const/4 v0, -0x1

    iput v0, p0, Landroid/support/constraint/n/k/g;->q0:I

    iput v0, p0, Landroid/support/constraint/n/k/g;->r0:I

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->G:Landroid/support/constraint/n/k/d;

    iput-object v0, p0, Landroid/support/constraint/n/k/g;->s0:Landroid/support/constraint/n/k/d;

    const/4 v0, 0x0

    iput v0, p0, Landroid/support/constraint/n/k/g;->t0:I

    iget-object v1, p0, Landroid/support/constraint/n/k/e;->O:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-object v1, p0, Landroid/support/constraint/n/k/e;->O:Ljava/util/ArrayList;

    iget-object v2, p0, Landroid/support/constraint/n/k/g;->s0:Landroid/support/constraint/n/k/d;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Landroid/support/constraint/n/k/e;->N:[Landroid/support/constraint/n/k/d;

    array-length v1, v1

    :goto_0
    if-ge v0, v1, :cond_0

    iget-object v2, p0, Landroid/support/constraint/n/k/e;->N:[Landroid/support/constraint/n/k/d;

    iget-object v3, p0, Landroid/support/constraint/n/k/g;->s0:Landroid/support/constraint/n/k/d;

    aput-object v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public M()Z
    .locals 0

    iget-boolean p0, p0, Landroid/support/constraint/n/k/g;->u0:Z

    return p0
.end method

.method public N()Z
    .locals 0

    iget-boolean p0, p0, Landroid/support/constraint/n/k/g;->u0:Z

    return p0
.end method

.method public R()Landroid/support/constraint/n/k/d;
    .locals 0

    iget-object p0, p0, Landroid/support/constraint/n/k/g;->s0:Landroid/support/constraint/n/k/d;

    return-object p0
.end method

.method public S()I
    .locals 0

    iget p0, p0, Landroid/support/constraint/n/k/g;->t0:I

    return p0
.end method

.method public T()I
    .locals 0

    iget p0, p0, Landroid/support/constraint/n/k/g;->q0:I

    return p0
.end method

.method public U()I
    .locals 0

    iget p0, p0, Landroid/support/constraint/n/k/g;->r0:I

    return p0
.end method

.method public V()F
    .locals 0

    iget p0, p0, Landroid/support/constraint/n/k/g;->p0:F

    return p0
.end method

.method public a(Landroid/support/constraint/n/k/d$b;)Landroid/support/constraint/n/k/d;
    .locals 2

    sget-object v0, Landroid/support/constraint/n/k/g$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const/4 p0, 0x0

    return-object p0

    :pswitch_1
    iget v0, p0, Landroid/support/constraint/n/k/g;->t0:I

    if-nez v0, :cond_0

    iget-object p0, p0, Landroid/support/constraint/n/k/g;->s0:Landroid/support/constraint/n/k/d;

    return-object p0

    :pswitch_2
    iget v0, p0, Landroid/support/constraint/n/k/g;->t0:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object p0, p0, Landroid/support/constraint/n/k/g;->s0:Landroid/support/constraint/n/k/d;

    return-object p0

    :cond_0
    :goto_0
    new-instance p0, Ljava/lang/AssertionError;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public a(Landroid/support/constraint/n/d;Z)V
    .locals 7

    invoke-virtual {p0}, Landroid/support/constraint/n/k/e;->v()Landroid/support/constraint/n/k/e;

    move-result-object p2

    check-cast p2, Landroid/support/constraint/n/k/f;

    if-nez p2, :cond_0

    return-void

    :cond_0
    sget-object v0, Landroid/support/constraint/n/k/d$b;->c:Landroid/support/constraint/n/k/d$b;

    invoke-virtual {p2, v0}, Landroid/support/constraint/n/k/e;->a(Landroid/support/constraint/n/k/d$b;)Landroid/support/constraint/n/k/d;

    move-result-object v0

    sget-object v1, Landroid/support/constraint/n/k/d$b;->e:Landroid/support/constraint/n/k/d$b;

    invoke-virtual {p2, v1}, Landroid/support/constraint/n/k/e;->a(Landroid/support/constraint/n/k/d$b;)Landroid/support/constraint/n/k/d;

    move-result-object v1

    iget-object v2, p0, Landroid/support/constraint/n/k/e;->R:Landroid/support/constraint/n/k/e;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    iget-object v2, v2, Landroid/support/constraint/n/k/e;->Q:[Landroid/support/constraint/n/k/e$b;

    aget-object v2, v2, v4

    sget-object v5, Landroid/support/constraint/n/k/e$b;->c:Landroid/support/constraint/n/k/e$b;

    if-ne v2, v5, :cond_1

    move v2, v3

    goto :goto_0

    :cond_1
    move v2, v4

    :goto_0
    iget v5, p0, Landroid/support/constraint/n/k/g;->t0:I

    if-nez v5, :cond_3

    sget-object v0, Landroid/support/constraint/n/k/d$b;->d:Landroid/support/constraint/n/k/d$b;

    invoke-virtual {p2, v0}, Landroid/support/constraint/n/k/e;->a(Landroid/support/constraint/n/k/d$b;)Landroid/support/constraint/n/k/d;

    move-result-object v0

    sget-object v1, Landroid/support/constraint/n/k/d$b;->f:Landroid/support/constraint/n/k/d$b;

    invoke-virtual {p2, v1}, Landroid/support/constraint/n/k/e;->a(Landroid/support/constraint/n/k/d$b;)Landroid/support/constraint/n/k/d;

    move-result-object v1

    iget-object p2, p0, Landroid/support/constraint/n/k/e;->R:Landroid/support/constraint/n/k/e;

    if-eqz p2, :cond_2

    iget-object p2, p2, Landroid/support/constraint/n/k/e;->Q:[Landroid/support/constraint/n/k/e$b;

    aget-object p2, p2, v3

    sget-object v2, Landroid/support/constraint/n/k/e$b;->c:Landroid/support/constraint/n/k/e$b;

    if-ne p2, v2, :cond_2

    goto :goto_1

    :cond_2
    move v3, v4

    :goto_1
    move v2, v3

    :cond_3
    iget-boolean p2, p0, Landroid/support/constraint/n/k/g;->u0:Z

    const/4 v3, -0x1

    const/4 v5, 0x5

    if-eqz p2, :cond_6

    iget-object p2, p0, Landroid/support/constraint/n/k/g;->s0:Landroid/support/constraint/n/k/d;

    invoke-virtual {p2}, Landroid/support/constraint/n/k/d;->k()Z

    move-result p2

    if-eqz p2, :cond_6

    iget-object p2, p0, Landroid/support/constraint/n/k/g;->s0:Landroid/support/constraint/n/k/d;

    invoke-virtual {p1, p2}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object p2

    iget-object v6, p0, Landroid/support/constraint/n/k/g;->s0:Landroid/support/constraint/n/k/d;

    invoke-virtual {v6}, Landroid/support/constraint/n/k/d;->b()I

    move-result v6

    invoke-virtual {p1, p2, v6}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/i;I)V

    iget v6, p0, Landroid/support/constraint/n/k/g;->q0:I

    if-eq v6, v3, :cond_4

    if-eqz v2, :cond_5

    invoke-virtual {p1, v1}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object v0

    invoke-virtual {p1, v0, p2, v4, v5}, Landroid/support/constraint/n/d;->b(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)V

    goto :goto_2

    :cond_4
    iget v6, p0, Landroid/support/constraint/n/k/g;->r0:I

    if-eq v6, v3, :cond_5

    if-eqz v2, :cond_5

    invoke-virtual {p1, v1}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object v1

    invoke-virtual {p1, v0}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object v0

    invoke-virtual {p1, p2, v0, v4, v5}, Landroid/support/constraint/n/d;->b(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)V

    invoke-virtual {p1, v1, p2, v4, v5}, Landroid/support/constraint/n/d;->b(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)V

    :cond_5
    :goto_2
    iput-boolean v4, p0, Landroid/support/constraint/n/k/g;->u0:Z

    return-void

    :cond_6
    iget p2, p0, Landroid/support/constraint/n/k/g;->q0:I

    const/16 v6, 0x8

    if-eq p2, v3, :cond_7

    iget-object p2, p0, Landroid/support/constraint/n/k/g;->s0:Landroid/support/constraint/n/k/d;

    invoke-virtual {p1, p2}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object p2

    invoke-virtual {p1, v0}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object v0

    iget p0, p0, Landroid/support/constraint/n/k/g;->q0:I

    invoke-virtual {p1, p2, v0, p0, v6}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)Landroid/support/constraint/n/b;

    if-eqz v2, :cond_9

    invoke-virtual {p1, v1}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object p0

    invoke-virtual {p1, p0, p2, v4, v5}, Landroid/support/constraint/n/d;->b(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)V

    goto :goto_3

    :cond_7
    iget p2, p0, Landroid/support/constraint/n/k/g;->r0:I

    if-eq p2, v3, :cond_8

    iget-object p2, p0, Landroid/support/constraint/n/k/g;->s0:Landroid/support/constraint/n/k/d;

    invoke-virtual {p1, p2}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object p2

    invoke-virtual {p1, v1}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object v1

    iget p0, p0, Landroid/support/constraint/n/k/g;->r0:I

    neg-int p0, p0

    invoke-virtual {p1, p2, v1, p0, v6}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)Landroid/support/constraint/n/b;

    if-eqz v2, :cond_9

    invoke-virtual {p1, v0}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object p0

    invoke-virtual {p1, p2, p0, v4, v5}, Landroid/support/constraint/n/d;->b(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)V

    invoke-virtual {p1, v1, p2, v4, v5}, Landroid/support/constraint/n/d;->b(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;II)V

    goto :goto_3

    :cond_8
    iget p2, p0, Landroid/support/constraint/n/k/g;->p0:F

    const/high16 v0, -0x40800000    # -1.0f

    cmpl-float p2, p2, v0

    if-eqz p2, :cond_9

    iget-object p2, p0, Landroid/support/constraint/n/k/g;->s0:Landroid/support/constraint/n/k/d;

    invoke-virtual {p1, p2}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object p2

    invoke-virtual {p1, v1}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object v0

    iget p0, p0, Landroid/support/constraint/n/k/g;->p0:F

    invoke-static {p1, p2, v0, p0}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/d;Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;F)Landroid/support/constraint/n/b;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/b;)V

    :cond_9
    :goto_3
    return-void
.end method

.method public b(Landroid/support/constraint/n/d;Z)V
    .locals 2

    invoke-virtual {p0}, Landroid/support/constraint/n/k/e;->v()Landroid/support/constraint/n/k/e;

    move-result-object p2

    if-nez p2, :cond_0

    return-void

    :cond_0
    iget-object p2, p0, Landroid/support/constraint/n/k/g;->s0:Landroid/support/constraint/n/k/d;

    invoke-virtual {p1, p2}, Landroid/support/constraint/n/d;->b(Ljava/lang/Object;)I

    move-result p1

    iget p2, p0, Landroid/support/constraint/n/k/g;->t0:I

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p2, v0, :cond_1

    invoke-virtual {p0, p1}, Landroid/support/constraint/n/k/e;->u(I)V

    invoke-virtual {p0, v1}, Landroid/support/constraint/n/k/e;->v(I)V

    invoke-virtual {p0}, Landroid/support/constraint/n/k/e;->v()Landroid/support/constraint/n/k/e;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/constraint/n/k/e;->k()I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/support/constraint/n/k/e;->l(I)V

    invoke-virtual {p0, v1}, Landroid/support/constraint/n/k/e;->t(I)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v1}, Landroid/support/constraint/n/k/e;->u(I)V

    invoke-virtual {p0, p1}, Landroid/support/constraint/n/k/e;->v(I)V

    invoke-virtual {p0}, Landroid/support/constraint/n/k/e;->v()Landroid/support/constraint/n/k/e;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/constraint/n/k/e;->C()I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/support/constraint/n/k/e;->t(I)V

    invoke-virtual {p0, v1}, Landroid/support/constraint/n/k/e;->l(I)V

    :goto_0
    return-void
.end method

.method public c()Z
    .locals 0

    const/4 p0, 0x1

    return p0
.end method

.method public e(F)V
    .locals 1

    const/high16 v0, -0x40800000    # -1.0f

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    iput p1, p0, Landroid/support/constraint/n/k/g;->p0:F

    const/4 p1, -0x1

    iput p1, p0, Landroid/support/constraint/n/k/g;->q0:I

    iput p1, p0, Landroid/support/constraint/n/k/g;->r0:I

    :cond_0
    return-void
.end method

.method public w(I)V
    .locals 1

    iget-object v0, p0, Landroid/support/constraint/n/k/g;->s0:Landroid/support/constraint/n/k/d;

    invoke-virtual {v0, p1}, Landroid/support/constraint/n/k/d;->a(I)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroid/support/constraint/n/k/g;->u0:Z

    return-void
.end method

.method public x(I)V
    .locals 2

    const/4 v0, -0x1

    if-le p1, v0, :cond_0

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, p0, Landroid/support/constraint/n/k/g;->p0:F

    iput p1, p0, Landroid/support/constraint/n/k/g;->q0:I

    iput v0, p0, Landroid/support/constraint/n/k/g;->r0:I

    :cond_0
    return-void
.end method

.method public y(I)V
    .locals 2

    const/4 v0, -0x1

    if-le p1, v0, :cond_0

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, p0, Landroid/support/constraint/n/k/g;->p0:F

    iput v0, p0, Landroid/support/constraint/n/k/g;->q0:I

    iput p1, p0, Landroid/support/constraint/n/k/g;->r0:I

    :cond_0
    return-void
.end method

.method public z(I)V
    .locals 3

    iget v0, p0, Landroid/support/constraint/n/k/g;->t0:I

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroid/support/constraint/n/k/g;->t0:I

    iget-object p1, p0, Landroid/support/constraint/n/k/e;->O:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    iget p1, p0, Landroid/support/constraint/n/k/g;->t0:I

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Landroid/support/constraint/n/k/e;->F:Landroid/support/constraint/n/k/d;

    goto :goto_0

    :cond_1
    iget-object p1, p0, Landroid/support/constraint/n/k/e;->G:Landroid/support/constraint/n/k/d;

    :goto_0
    iput-object p1, p0, Landroid/support/constraint/n/k/g;->s0:Landroid/support/constraint/n/k/d;

    iget-object p1, p0, Landroid/support/constraint/n/k/e;->O:Ljava/util/ArrayList;

    iget-object v0, p0, Landroid/support/constraint/n/k/g;->s0:Landroid/support/constraint/n/k/d;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Landroid/support/constraint/n/k/e;->N:[Landroid/support/constraint/n/k/d;

    array-length p1, p1

    const/4 v0, 0x0

    :goto_1
    if-ge v0, p1, :cond_2

    iget-object v1, p0, Landroid/support/constraint/n/k/e;->N:[Landroid/support/constraint/n/k/d;

    iget-object v2, p0, Landroid/support/constraint/n/k/g;->s0:Landroid/support/constraint/n/k/d;

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method
