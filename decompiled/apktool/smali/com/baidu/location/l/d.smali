.class public final Lcom/baidu/location/l/d;
.super Lc/b/a/a/c;
.source ""


# instance fields
.field private a:Z

.field private b:I

.field private c:Z

.field private d:I

.field private e:Z

.field private f:I

.field private g:Z

.field private h:I

.field private i:Z

.field private j:I

.field private k:Z

.field private l:I

.field private m:Z

.field private n:I

.field private o:Z

.field private p:I

.field private q:Z

.field private r:I

.field private s:Z

.field private t:I

.field private u:Z

.field private v:I

.field private w:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lc/b/a/a/c;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/baidu/location/l/d;->b:I

    iput v0, p0, Lcom/baidu/location/l/d;->d:I

    iput v0, p0, Lcom/baidu/location/l/d;->f:I

    iput v0, p0, Lcom/baidu/location/l/d;->h:I

    iput v0, p0, Lcom/baidu/location/l/d;->j:I

    iput v0, p0, Lcom/baidu/location/l/d;->l:I

    iput v0, p0, Lcom/baidu/location/l/d;->n:I

    iput v0, p0, Lcom/baidu/location/l/d;->p:I

    iput v0, p0, Lcom/baidu/location/l/d;->r:I

    iput v0, p0, Lcom/baidu/location/l/d;->t:I

    iput v0, p0, Lcom/baidu/location/l/d;->v:I

    const/4 v0, -0x1

    iput v0, p0, Lcom/baidu/location/l/d;->w:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/baidu/location/l/d;->w:I

    if-gez v0, :cond_0

    invoke-virtual {p0}, Lcom/baidu/location/l/d;->b()I

    :cond_0
    iget p0, p0, Lcom/baidu/location/l/d;->w:I

    return p0
.end method

.method public a(I)Lcom/baidu/location/l/d;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/baidu/location/l/d;->i:Z

    iput p1, p0, Lcom/baidu/location/l/d;->j:I

    return-object p0
.end method

.method public a(Lc/b/a/a/b;)V
    .locals 2

    invoke-virtual {p0}, Lcom/baidu/location/l/d;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/baidu/location/l/d;->e()I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lc/b/a/a/b;->a(II)V

    :cond_0
    invoke-virtual {p0}, Lcom/baidu/location/l/d;->s()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/baidu/location/l/d;->h()I

    move-result v0

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lc/b/a/a/b;->a(II)V

    :cond_1
    invoke-virtual {p0}, Lcom/baidu/location/l/d;->x()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/baidu/location/l/d;->m()I

    move-result v0

    const/4 v1, 0x3

    invoke-virtual {p1, v1, v0}, Lc/b/a/a/b;->a(II)V

    :cond_2
    invoke-virtual {p0}, Lcom/baidu/location/l/d;->r()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/baidu/location/l/d;->g()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {p1, v1, v0}, Lc/b/a/a/b;->a(II)V

    :cond_3
    invoke-virtual {p0}, Lcom/baidu/location/l/d;->o()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lcom/baidu/location/l/d;->d()I

    move-result v0

    const/4 v1, 0x5

    invoke-virtual {p1, v1, v0}, Lc/b/a/a/b;->a(II)V

    :cond_4
    invoke-virtual {p0}, Lcom/baidu/location/l/d;->v()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lcom/baidu/location/l/d;->k()I

    move-result v0

    const/4 v1, 0x6

    invoke-virtual {p1, v1, v0}, Lc/b/a/a/b;->a(II)V

    :cond_5
    invoke-virtual {p0}, Lcom/baidu/location/l/d;->t()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lcom/baidu/location/l/d;->i()I

    move-result v0

    const/4 v1, 0x7

    invoke-virtual {p1, v1, v0}, Lc/b/a/a/b;->a(II)V

    :cond_6
    invoke-virtual {p0}, Lcom/baidu/location/l/d;->u()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Lcom/baidu/location/l/d;->j()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {p1, v1, v0}, Lc/b/a/a/b;->a(II)V

    :cond_7
    invoke-virtual {p0}, Lcom/baidu/location/l/d;->w()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p0}, Lcom/baidu/location/l/d;->l()I

    move-result v0

    const/16 v1, 0x9

    invoke-virtual {p1, v1, v0}, Lc/b/a/a/b;->a(II)V

    :cond_8
    invoke-virtual {p0}, Lcom/baidu/location/l/d;->q()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {p0}, Lcom/baidu/location/l/d;->f()I

    move-result v0

    const/16 v1, 0xa

    invoke-virtual {p1, v1, v0}, Lc/b/a/a/b;->a(II)V

    :cond_9
    invoke-virtual {p0}, Lcom/baidu/location/l/d;->y()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {p0}, Lcom/baidu/location/l/d;->n()I

    move-result p0

    const/16 v0, 0xb

    invoke-virtual {p1, v0, p0}, Lc/b/a/a/b;->a(II)V

    :cond_a
    return-void
.end method

.method public b()I
    .locals 3

    invoke-virtual {p0}, Lcom/baidu/location/l/d;->p()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/baidu/location/l/d;->e()I

    move-result v0

    const/4 v2, 0x1

    invoke-static {v2, v0}, Lc/b/a/a/b;->c(II)I

    move-result v0

    add-int/2addr v1, v0

    :cond_0
    invoke-virtual {p0}, Lcom/baidu/location/l/d;->s()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/baidu/location/l/d;->h()I

    move-result v0

    const/4 v2, 0x2

    invoke-static {v2, v0}, Lc/b/a/a/b;->c(II)I

    move-result v0

    add-int/2addr v1, v0

    :cond_1
    invoke-virtual {p0}, Lcom/baidu/location/l/d;->x()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/baidu/location/l/d;->m()I

    move-result v0

    const/4 v2, 0x3

    invoke-static {v2, v0}, Lc/b/a/a/b;->c(II)I

    move-result v0

    add-int/2addr v1, v0

    :cond_2
    invoke-virtual {p0}, Lcom/baidu/location/l/d;->r()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/baidu/location/l/d;->g()I

    move-result v0

    const/4 v2, 0x4

    invoke-static {v2, v0}, Lc/b/a/a/b;->c(II)I

    move-result v0

    add-int/2addr v1, v0

    :cond_3
    invoke-virtual {p0}, Lcom/baidu/location/l/d;->o()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lcom/baidu/location/l/d;->d()I

    move-result v0

    const/4 v2, 0x5

    invoke-static {v2, v0}, Lc/b/a/a/b;->c(II)I

    move-result v0

    add-int/2addr v1, v0

    :cond_4
    invoke-virtual {p0}, Lcom/baidu/location/l/d;->v()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lcom/baidu/location/l/d;->k()I

    move-result v0

    const/4 v2, 0x6

    invoke-static {v2, v0}, Lc/b/a/a/b;->c(II)I

    move-result v0

    add-int/2addr v1, v0

    :cond_5
    invoke-virtual {p0}, Lcom/baidu/location/l/d;->t()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lcom/baidu/location/l/d;->i()I

    move-result v0

    const/4 v2, 0x7

    invoke-static {v2, v0}, Lc/b/a/a/b;->c(II)I

    move-result v0

    add-int/2addr v1, v0

    :cond_6
    invoke-virtual {p0}, Lcom/baidu/location/l/d;->u()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Lcom/baidu/location/l/d;->j()I

    move-result v0

    const/16 v2, 0x8

    invoke-static {v2, v0}, Lc/b/a/a/b;->c(II)I

    move-result v0

    add-int/2addr v1, v0

    :cond_7
    invoke-virtual {p0}, Lcom/baidu/location/l/d;->w()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p0}, Lcom/baidu/location/l/d;->l()I

    move-result v0

    const/16 v2, 0x9

    invoke-static {v2, v0}, Lc/b/a/a/b;->c(II)I

    move-result v0

    add-int/2addr v1, v0

    :cond_8
    invoke-virtual {p0}, Lcom/baidu/location/l/d;->q()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {p0}, Lcom/baidu/location/l/d;->f()I

    move-result v0

    const/16 v2, 0xa

    invoke-static {v2, v0}, Lc/b/a/a/b;->c(II)I

    move-result v0

    add-int/2addr v1, v0

    :cond_9
    invoke-virtual {p0}, Lcom/baidu/location/l/d;->y()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {p0}, Lcom/baidu/location/l/d;->n()I

    move-result v0

    const/16 v2, 0xb

    invoke-static {v2, v0}, Lc/b/a/a/b;->c(II)I

    move-result v0

    add-int/2addr v1, v0

    :cond_a
    iput v1, p0, Lcom/baidu/location/l/d;->w:I

    return v1
.end method

.method public b(I)Lcom/baidu/location/l/d;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/baidu/location/l/d;->a:Z

    iput p1, p0, Lcom/baidu/location/l/d;->b:I

    return-object p0
.end method

.method public c(I)Lcom/baidu/location/l/d;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/baidu/location/l/d;->s:Z

    iput p1, p0, Lcom/baidu/location/l/d;->t:I

    return-object p0
.end method

.method public d()I
    .locals 0

    iget p0, p0, Lcom/baidu/location/l/d;->j:I

    return p0
.end method

.method public d(I)Lcom/baidu/location/l/d;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/baidu/location/l/d;->g:Z

    iput p1, p0, Lcom/baidu/location/l/d;->h:I

    return-object p0
.end method

.method public e()I
    .locals 0

    iget p0, p0, Lcom/baidu/location/l/d;->b:I

    return p0
.end method

.method public e(I)Lcom/baidu/location/l/d;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/baidu/location/l/d;->c:Z

    iput p1, p0, Lcom/baidu/location/l/d;->d:I

    return-object p0
.end method

.method public f()I
    .locals 0

    iget p0, p0, Lcom/baidu/location/l/d;->t:I

    return p0
.end method

.method public f(I)Lcom/baidu/location/l/d;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/baidu/location/l/d;->m:Z

    iput p1, p0, Lcom/baidu/location/l/d;->n:I

    return-object p0
.end method

.method public g()I
    .locals 0

    iget p0, p0, Lcom/baidu/location/l/d;->h:I

    return p0
.end method

.method public g(I)Lcom/baidu/location/l/d;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/baidu/location/l/d;->o:Z

    iput p1, p0, Lcom/baidu/location/l/d;->p:I

    return-object p0
.end method

.method public h()I
    .locals 0

    iget p0, p0, Lcom/baidu/location/l/d;->d:I

    return p0
.end method

.method public h(I)Lcom/baidu/location/l/d;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/baidu/location/l/d;->k:Z

    iput p1, p0, Lcom/baidu/location/l/d;->l:I

    return-object p0
.end method

.method public i()I
    .locals 0

    iget p0, p0, Lcom/baidu/location/l/d;->n:I

    return p0
.end method

.method public i(I)Lcom/baidu/location/l/d;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/baidu/location/l/d;->q:Z

    iput p1, p0, Lcom/baidu/location/l/d;->r:I

    return-object p0
.end method

.method public j()I
    .locals 0

    iget p0, p0, Lcom/baidu/location/l/d;->p:I

    return p0
.end method

.method public j(I)Lcom/baidu/location/l/d;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/baidu/location/l/d;->e:Z

    iput p1, p0, Lcom/baidu/location/l/d;->f:I

    return-object p0
.end method

.method public k()I
    .locals 0

    iget p0, p0, Lcom/baidu/location/l/d;->l:I

    return p0
.end method

.method public k(I)Lcom/baidu/location/l/d;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/baidu/location/l/d;->u:Z

    iput p1, p0, Lcom/baidu/location/l/d;->v:I

    return-object p0
.end method

.method public l()I
    .locals 0

    iget p0, p0, Lcom/baidu/location/l/d;->r:I

    return p0
.end method

.method public m()I
    .locals 0

    iget p0, p0, Lcom/baidu/location/l/d;->f:I

    return p0
.end method

.method public n()I
    .locals 0

    iget p0, p0, Lcom/baidu/location/l/d;->v:I

    return p0
.end method

.method public o()Z
    .locals 0

    iget-boolean p0, p0, Lcom/baidu/location/l/d;->i:Z

    return p0
.end method

.method public p()Z
    .locals 0

    iget-boolean p0, p0, Lcom/baidu/location/l/d;->a:Z

    return p0
.end method

.method public q()Z
    .locals 0

    iget-boolean p0, p0, Lcom/baidu/location/l/d;->s:Z

    return p0
.end method

.method public r()Z
    .locals 0

    iget-boolean p0, p0, Lcom/baidu/location/l/d;->g:Z

    return p0
.end method

.method public s()Z
    .locals 0

    iget-boolean p0, p0, Lcom/baidu/location/l/d;->c:Z

    return p0
.end method

.method public t()Z
    .locals 0

    iget-boolean p0, p0, Lcom/baidu/location/l/d;->m:Z

    return p0
.end method

.method public u()Z
    .locals 0

    iget-boolean p0, p0, Lcom/baidu/location/l/d;->o:Z

    return p0
.end method

.method public v()Z
    .locals 0

    iget-boolean p0, p0, Lcom/baidu/location/l/d;->k:Z

    return p0
.end method

.method public w()Z
    .locals 0

    iget-boolean p0, p0, Lcom/baidu/location/l/d;->q:Z

    return p0
.end method

.method public x()Z
    .locals 0

    iget-boolean p0, p0, Lcom/baidu/location/l/d;->e:Z

    return p0
.end method

.method public y()Z
    .locals 0

    iget-boolean p0, p0, Lcom/baidu/location/l/d;->u:Z

    return p0
.end method
