.class Landroid/support/constraint/n/k/m/j;
.super Landroid/support/constraint/n/k/m/p;
.source ""


# direct methods
.method public constructor <init>(Landroid/support/constraint/n/k/e;)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/support/constraint/n/k/m/p;-><init>(Landroid/support/constraint/n/k/e;)V

    iget-object v0, p1, Landroid/support/constraint/n/k/e;->d:Landroid/support/constraint/n/k/m/l;

    invoke-virtual {v0}, Landroid/support/constraint/n/k/m/l;->c()V

    iget-object v0, p1, Landroid/support/constraint/n/k/e;->e:Landroid/support/constraint/n/k/m/n;

    invoke-virtual {v0}, Landroid/support/constraint/n/k/m/n;->c()V

    check-cast p1, Landroid/support/constraint/n/k/g;

    invoke-virtual {p1}, Landroid/support/constraint/n/k/g;->S()I

    move-result p1

    iput p1, p0, Landroid/support/constraint/n/k/m/p;->f:I

    return-void
.end method

.method private a(Landroid/support/constraint/n/k/m/f;)V
    .locals 1

    iget-object v0, p0, Landroid/support/constraint/n/k/m/p;->h:Landroid/support/constraint/n/k/m/f;

    iget-object v0, v0, Landroid/support/constraint/n/k/m/f;->k:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p1, Landroid/support/constraint/n/k/m/f;->l:Ljava/util/List;

    iget-object p0, p0, Landroid/support/constraint/n/k/m/p;->h:Landroid/support/constraint/n/k/m/f;

    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method a()V
    .locals 5

    iget-object v0, p0, Landroid/support/constraint/n/k/m/p;->b:Landroid/support/constraint/n/k/e;

    check-cast v0, Landroid/support/constraint/n/k/g;

    invoke-virtual {v0}, Landroid/support/constraint/n/k/g;->T()I

    move-result v1

    invoke-virtual {v0}, Landroid/support/constraint/n/k/g;->U()I

    move-result v2

    invoke-virtual {v0}, Landroid/support/constraint/n/k/g;->V()F

    invoke-virtual {v0}, Landroid/support/constraint/n/k/g;->S()I

    move-result v0

    const/4 v3, 0x1

    const/4 v4, -0x1

    if-ne v0, v3, :cond_2

    iget-object v0, p0, Landroid/support/constraint/n/k/m/p;->h:Landroid/support/constraint/n/k/m/f;

    if-eq v1, v4, :cond_0

    iget-object v0, v0, Landroid/support/constraint/n/k/m/f;->l:Ljava/util/List;

    iget-object v2, p0, Landroid/support/constraint/n/k/m/p;->b:Landroid/support/constraint/n/k/e;

    iget-object v2, v2, Landroid/support/constraint/n/k/e;->R:Landroid/support/constraint/n/k/e;

    iget-object v2, v2, Landroid/support/constraint/n/k/e;->d:Landroid/support/constraint/n/k/m/l;

    iget-object v2, v2, Landroid/support/constraint/n/k/m/p;->h:Landroid/support/constraint/n/k/m/f;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Landroid/support/constraint/n/k/m/p;->b:Landroid/support/constraint/n/k/e;

    iget-object v0, v0, Landroid/support/constraint/n/k/e;->R:Landroid/support/constraint/n/k/e;

    iget-object v0, v0, Landroid/support/constraint/n/k/e;->d:Landroid/support/constraint/n/k/m/l;

    iget-object v0, v0, Landroid/support/constraint/n/k/m/p;->h:Landroid/support/constraint/n/k/m/f;

    iget-object v0, v0, Landroid/support/constraint/n/k/m/f;->k:Ljava/util/List;

    iget-object v2, p0, Landroid/support/constraint/n/k/m/p;->h:Landroid/support/constraint/n/k/m/f;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Landroid/support/constraint/n/k/m/p;->h:Landroid/support/constraint/n/k/m/f;

    :goto_0
    iput v1, v0, Landroid/support/constraint/n/k/m/f;->f:I

    goto :goto_1

    :cond_0
    if-eq v2, v4, :cond_1

    iget-object v0, v0, Landroid/support/constraint/n/k/m/f;->l:Ljava/util/List;

    iget-object v1, p0, Landroid/support/constraint/n/k/m/p;->b:Landroid/support/constraint/n/k/e;

    iget-object v1, v1, Landroid/support/constraint/n/k/e;->R:Landroid/support/constraint/n/k/e;

    iget-object v1, v1, Landroid/support/constraint/n/k/e;->d:Landroid/support/constraint/n/k/m/l;

    iget-object v1, v1, Landroid/support/constraint/n/k/m/p;->i:Landroid/support/constraint/n/k/m/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Landroid/support/constraint/n/k/m/p;->b:Landroid/support/constraint/n/k/e;

    iget-object v0, v0, Landroid/support/constraint/n/k/e;->R:Landroid/support/constraint/n/k/e;

    iget-object v0, v0, Landroid/support/constraint/n/k/e;->d:Landroid/support/constraint/n/k/m/l;

    iget-object v0, v0, Landroid/support/constraint/n/k/m/p;->i:Landroid/support/constraint/n/k/m/f;

    iget-object v0, v0, Landroid/support/constraint/n/k/m/f;->k:Ljava/util/List;

    iget-object v1, p0, Landroid/support/constraint/n/k/m/p;->h:Landroid/support/constraint/n/k/m/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Landroid/support/constraint/n/k/m/p;->h:Landroid/support/constraint/n/k/m/f;

    neg-int v1, v2

    goto :goto_0

    :cond_1
    iput-boolean v3, v0, Landroid/support/constraint/n/k/m/f;->b:Z

    iget-object v0, v0, Landroid/support/constraint/n/k/m/f;->l:Ljava/util/List;

    iget-object v1, p0, Landroid/support/constraint/n/k/m/p;->b:Landroid/support/constraint/n/k/e;

    iget-object v1, v1, Landroid/support/constraint/n/k/e;->R:Landroid/support/constraint/n/k/e;

    iget-object v1, v1, Landroid/support/constraint/n/k/e;->d:Landroid/support/constraint/n/k/m/l;

    iget-object v1, v1, Landroid/support/constraint/n/k/m/p;->i:Landroid/support/constraint/n/k/m/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Landroid/support/constraint/n/k/m/p;->b:Landroid/support/constraint/n/k/e;

    iget-object v0, v0, Landroid/support/constraint/n/k/e;->R:Landroid/support/constraint/n/k/e;

    iget-object v0, v0, Landroid/support/constraint/n/k/e;->d:Landroid/support/constraint/n/k/m/l;

    iget-object v0, v0, Landroid/support/constraint/n/k/m/p;->i:Landroid/support/constraint/n/k/m/f;

    iget-object v0, v0, Landroid/support/constraint/n/k/m/f;->k:Ljava/util/List;

    iget-object v1, p0, Landroid/support/constraint/n/k/m/p;->h:Landroid/support/constraint/n/k/m/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    iget-object v0, p0, Landroid/support/constraint/n/k/m/p;->b:Landroid/support/constraint/n/k/e;

    iget-object v0, v0, Landroid/support/constraint/n/k/e;->d:Landroid/support/constraint/n/k/m/l;

    iget-object v0, v0, Landroid/support/constraint/n/k/m/p;->h:Landroid/support/constraint/n/k/m/f;

    invoke-direct {p0, v0}, Landroid/support/constraint/n/k/m/j;->a(Landroid/support/constraint/n/k/m/f;)V

    iget-object v0, p0, Landroid/support/constraint/n/k/m/p;->b:Landroid/support/constraint/n/k/e;

    iget-object v0, v0, Landroid/support/constraint/n/k/e;->d:Landroid/support/constraint/n/k/m/l;

    goto :goto_4

    :cond_2
    iget-object v0, p0, Landroid/support/constraint/n/k/m/p;->h:Landroid/support/constraint/n/k/m/f;

    if-eq v1, v4, :cond_3

    iget-object v0, v0, Landroid/support/constraint/n/k/m/f;->l:Ljava/util/List;

    iget-object v2, p0, Landroid/support/constraint/n/k/m/p;->b:Landroid/support/constraint/n/k/e;

    iget-object v2, v2, Landroid/support/constraint/n/k/e;->R:Landroid/support/constraint/n/k/e;

    iget-object v2, v2, Landroid/support/constraint/n/k/e;->e:Landroid/support/constraint/n/k/m/n;

    iget-object v2, v2, Landroid/support/constraint/n/k/m/p;->h:Landroid/support/constraint/n/k/m/f;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Landroid/support/constraint/n/k/m/p;->b:Landroid/support/constraint/n/k/e;

    iget-object v0, v0, Landroid/support/constraint/n/k/e;->R:Landroid/support/constraint/n/k/e;

    iget-object v0, v0, Landroid/support/constraint/n/k/e;->e:Landroid/support/constraint/n/k/m/n;

    iget-object v0, v0, Landroid/support/constraint/n/k/m/p;->h:Landroid/support/constraint/n/k/m/f;

    iget-object v0, v0, Landroid/support/constraint/n/k/m/f;->k:Ljava/util/List;

    iget-object v2, p0, Landroid/support/constraint/n/k/m/p;->h:Landroid/support/constraint/n/k/m/f;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Landroid/support/constraint/n/k/m/p;->h:Landroid/support/constraint/n/k/m/f;

    :goto_2
    iput v1, v0, Landroid/support/constraint/n/k/m/f;->f:I

    goto :goto_3

    :cond_3
    if-eq v2, v4, :cond_4

    iget-object v0, v0, Landroid/support/constraint/n/k/m/f;->l:Ljava/util/List;

    iget-object v1, p0, Landroid/support/constraint/n/k/m/p;->b:Landroid/support/constraint/n/k/e;

    iget-object v1, v1, Landroid/support/constraint/n/k/e;->R:Landroid/support/constraint/n/k/e;

    iget-object v1, v1, Landroid/support/constraint/n/k/e;->e:Landroid/support/constraint/n/k/m/n;

    iget-object v1, v1, Landroid/support/constraint/n/k/m/p;->i:Landroid/support/constraint/n/k/m/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Landroid/support/constraint/n/k/m/p;->b:Landroid/support/constraint/n/k/e;

    iget-object v0, v0, Landroid/support/constraint/n/k/e;->R:Landroid/support/constraint/n/k/e;

    iget-object v0, v0, Landroid/support/constraint/n/k/e;->e:Landroid/support/constraint/n/k/m/n;

    iget-object v0, v0, Landroid/support/constraint/n/k/m/p;->i:Landroid/support/constraint/n/k/m/f;

    iget-object v0, v0, Landroid/support/constraint/n/k/m/f;->k:Ljava/util/List;

    iget-object v1, p0, Landroid/support/constraint/n/k/m/p;->h:Landroid/support/constraint/n/k/m/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Landroid/support/constraint/n/k/m/p;->h:Landroid/support/constraint/n/k/m/f;

    neg-int v1, v2

    goto :goto_2

    :cond_4
    iput-boolean v3, v0, Landroid/support/constraint/n/k/m/f;->b:Z

    iget-object v0, v0, Landroid/support/constraint/n/k/m/f;->l:Ljava/util/List;

    iget-object v1, p0, Landroid/support/constraint/n/k/m/p;->b:Landroid/support/constraint/n/k/e;

    iget-object v1, v1, Landroid/support/constraint/n/k/e;->R:Landroid/support/constraint/n/k/e;

    iget-object v1, v1, Landroid/support/constraint/n/k/e;->e:Landroid/support/constraint/n/k/m/n;

    iget-object v1, v1, Landroid/support/constraint/n/k/m/p;->i:Landroid/support/constraint/n/k/m/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Landroid/support/constraint/n/k/m/p;->b:Landroid/support/constraint/n/k/e;

    iget-object v0, v0, Landroid/support/constraint/n/k/e;->R:Landroid/support/constraint/n/k/e;

    iget-object v0, v0, Landroid/support/constraint/n/k/e;->e:Landroid/support/constraint/n/k/m/n;

    iget-object v0, v0, Landroid/support/constraint/n/k/m/p;->i:Landroid/support/constraint/n/k/m/f;

    iget-object v0, v0, Landroid/support/constraint/n/k/m/f;->k:Ljava/util/List;

    iget-object v1, p0, Landroid/support/constraint/n/k/m/p;->h:Landroid/support/constraint/n/k/m/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_3
    iget-object v0, p0, Landroid/support/constraint/n/k/m/p;->b:Landroid/support/constraint/n/k/e;

    iget-object v0, v0, Landroid/support/constraint/n/k/e;->e:Landroid/support/constraint/n/k/m/n;

    iget-object v0, v0, Landroid/support/constraint/n/k/m/p;->h:Landroid/support/constraint/n/k/m/f;

    invoke-direct {p0, v0}, Landroid/support/constraint/n/k/m/j;->a(Landroid/support/constraint/n/k/m/f;)V

    iget-object v0, p0, Landroid/support/constraint/n/k/m/p;->b:Landroid/support/constraint/n/k/e;

    iget-object v0, v0, Landroid/support/constraint/n/k/e;->e:Landroid/support/constraint/n/k/m/n;

    :goto_4
    iget-object v0, v0, Landroid/support/constraint/n/k/m/p;->i:Landroid/support/constraint/n/k/m/f;

    invoke-direct {p0, v0}, Landroid/support/constraint/n/k/m/j;->a(Landroid/support/constraint/n/k/m/f;)V

    return-void
.end method

.method public a(Landroid/support/constraint/n/k/m/d;)V
    .locals 2

    iget-object p1, p0, Landroid/support/constraint/n/k/m/p;->h:Landroid/support/constraint/n/k/m/f;

    iget-boolean v0, p1, Landroid/support/constraint/n/k/m/f;->c:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p1, Landroid/support/constraint/n/k/m/f;->j:Z

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object p1, p1, Landroid/support/constraint/n/k/m/f;->l:Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/support/constraint/n/k/m/f;

    iget-object v0, p0, Landroid/support/constraint/n/k/m/p;->b:Landroid/support/constraint/n/k/e;

    check-cast v0, Landroid/support/constraint/n/k/g;

    const/high16 v1, 0x3f000000    # 0.5f

    iget p1, p1, Landroid/support/constraint/n/k/m/f;->g:I

    int-to-float p1, p1

    invoke-virtual {v0}, Landroid/support/constraint/n/k/g;->V()F

    move-result v0

    mul-float/2addr p1, v0

    add-float/2addr p1, v1

    float-to-int p1, p1

    iget-object p0, p0, Landroid/support/constraint/n/k/m/p;->h:Landroid/support/constraint/n/k/m/f;

    invoke-virtual {p0, p1}, Landroid/support/constraint/n/k/m/f;->a(I)V

    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Landroid/support/constraint/n/k/m/p;->b:Landroid/support/constraint/n/k/e;

    check-cast v0, Landroid/support/constraint/n/k/g;

    invoke-virtual {v0}, Landroid/support/constraint/n/k/g;->S()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Landroid/support/constraint/n/k/m/p;->b:Landroid/support/constraint/n/k/e;

    iget-object p0, p0, Landroid/support/constraint/n/k/m/p;->h:Landroid/support/constraint/n/k/m/f;

    iget p0, p0, Landroid/support/constraint/n/k/m/f;->g:I

    invoke-virtual {v0, p0}, Landroid/support/constraint/n/k/e;->u(I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroid/support/constraint/n/k/m/p;->b:Landroid/support/constraint/n/k/e;

    iget-object p0, p0, Landroid/support/constraint/n/k/m/p;->h:Landroid/support/constraint/n/k/m/f;

    iget p0, p0, Landroid/support/constraint/n/k/m/f;->g:I

    invoke-virtual {v0, p0}, Landroid/support/constraint/n/k/e;->v(I)V

    :goto_0
    return-void
.end method

.method c()V
    .locals 0

    iget-object p0, p0, Landroid/support/constraint/n/k/m/p;->h:Landroid/support/constraint/n/k/m/f;

    invoke-virtual {p0}, Landroid/support/constraint/n/k/m/f;->a()V

    return-void
.end method

.method f()Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method
