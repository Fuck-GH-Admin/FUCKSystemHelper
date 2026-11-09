.class public final Lcom/baidu/location/l/e;
.super Lc/b/a/a/c;
.source ""


# instance fields
.field private a:Z

.field private b:J

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

.field private u:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lc/b/a/a/c;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/baidu/location/l/e;->b:J

    const/4 v0, 0x0

    iput v0, p0, Lcom/baidu/location/l/e;->d:I

    iput v0, p0, Lcom/baidu/location/l/e;->f:I

    iput v0, p0, Lcom/baidu/location/l/e;->h:I

    iput v0, p0, Lcom/baidu/location/l/e;->j:I

    iput v0, p0, Lcom/baidu/location/l/e;->l:I

    iput v0, p0, Lcom/baidu/location/l/e;->n:I

    iput v0, p0, Lcom/baidu/location/l/e;->p:I

    iput v0, p0, Lcom/baidu/location/l/e;->r:I

    iput v0, p0, Lcom/baidu/location/l/e;->t:I

    const/4 v0, -0x1

    iput v0, p0, Lcom/baidu/location/l/e;->u:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/baidu/location/l/e;->u:I

    if-gez v0, :cond_0

    invoke-virtual {p0}, Lcom/baidu/location/l/e;->b()I

    :cond_0
    iget p0, p0, Lcom/baidu/location/l/e;->u:I

    return p0
.end method

.method public a(I)Lcom/baidu/location/l/e;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/baidu/location/l/e;->o:Z

    iput p1, p0, Lcom/baidu/location/l/e;->p:I

    return-object p0
.end method

.method public a(J)Lcom/baidu/location/l/e;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/baidu/location/l/e;->a:Z

    iput-wide p1, p0, Lcom/baidu/location/l/e;->b:J

    return-object p0
.end method

.method public a(Lc/b/a/a/b;)V
    .locals 3

    invoke-virtual {p0}, Lcom/baidu/location/l/e;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/baidu/location/l/e;->d()J

    move-result-wide v0

    const/4 v2, 0x1

    invoke-virtual {p1, v2, v0, v1}, Lc/b/a/a/b;->a(IJ)V

    :cond_0
    invoke-virtual {p0}, Lcom/baidu/location/l/e;->s()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/baidu/location/l/e;->i()I

    move-result v0

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lc/b/a/a/b;->a(II)V

    :cond_1
    invoke-virtual {p0}, Lcom/baidu/location/l/e;->w()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/baidu/location/l/e;->m()I

    move-result v0

    const/4 v1, 0x3

    invoke-virtual {p1, v1, v0}, Lc/b/a/a/b;->a(II)V

    :cond_2
    invoke-virtual {p0}, Lcom/baidu/location/l/e;->r()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/baidu/location/l/e;->h()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {p1, v1, v0}, Lc/b/a/a/b;->a(II)V

    :cond_3
    invoke-virtual {p0}, Lcom/baidu/location/l/e;->t()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lcom/baidu/location/l/e;->j()I

    move-result v0

    const/4 v1, 0x5

    invoke-virtual {p1, v1, v0}, Lc/b/a/a/b;->a(II)V

    :cond_4
    invoke-virtual {p0}, Lcom/baidu/location/l/e;->u()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lcom/baidu/location/l/e;->k()I

    move-result v0

    const/4 v1, 0x6

    invoke-virtual {p1, v1, v0}, Lc/b/a/a/b;->a(II)V

    :cond_5
    invoke-virtual {p0}, Lcom/baidu/location/l/e;->v()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lcom/baidu/location/l/e;->l()I

    move-result v0

    const/4 v1, 0x7

    invoke-virtual {p1, v1, v0}, Lc/b/a/a/b;->a(II)V

    :cond_6
    invoke-virtual {p0}, Lcom/baidu/location/l/e;->o()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Lcom/baidu/location/l/e;->e()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {p1, v1, v0}, Lc/b/a/a/b;->a(II)V

    :cond_7
    invoke-virtual {p0}, Lcom/baidu/location/l/e;->p()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p0}, Lcom/baidu/location/l/e;->f()I

    move-result v0

    const/16 v1, 0x9

    invoke-virtual {p1, v1, v0}, Lc/b/a/a/b;->a(II)V

    :cond_8
    invoke-virtual {p0}, Lcom/baidu/location/l/e;->q()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {p0}, Lcom/baidu/location/l/e;->g()I

    move-result p0

    const/16 v0, 0xa

    invoke-virtual {p1, v0, p0}, Lc/b/a/a/b;->a(II)V

    :cond_9
    return-void
.end method

.method public b()I
    .locals 4

    invoke-virtual {p0}, Lcom/baidu/location/l/e;->n()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/baidu/location/l/e;->d()J

    move-result-wide v2

    const/4 v0, 0x1

    invoke-static {v0, v2, v3}, Lc/b/a/a/b;->b(IJ)I

    move-result v0

    add-int/2addr v1, v0

    :cond_0
    invoke-virtual {p0}, Lcom/baidu/location/l/e;->s()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/baidu/location/l/e;->i()I

    move-result v0

    const/4 v2, 0x2

    invoke-static {v2, v0}, Lc/b/a/a/b;->c(II)I

    move-result v0

    add-int/2addr v1, v0

    :cond_1
    invoke-virtual {p0}, Lcom/baidu/location/l/e;->w()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/baidu/location/l/e;->m()I

    move-result v0

    const/4 v2, 0x3

    invoke-static {v2, v0}, Lc/b/a/a/b;->c(II)I

    move-result v0

    add-int/2addr v1, v0

    :cond_2
    invoke-virtual {p0}, Lcom/baidu/location/l/e;->r()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/baidu/location/l/e;->h()I

    move-result v0

    const/4 v2, 0x4

    invoke-static {v2, v0}, Lc/b/a/a/b;->c(II)I

    move-result v0

    add-int/2addr v1, v0

    :cond_3
    invoke-virtual {p0}, Lcom/baidu/location/l/e;->t()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lcom/baidu/location/l/e;->j()I

    move-result v0

    const/4 v2, 0x5

    invoke-static {v2, v0}, Lc/b/a/a/b;->c(II)I

    move-result v0

    add-int/2addr v1, v0

    :cond_4
    invoke-virtual {p0}, Lcom/baidu/location/l/e;->u()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lcom/baidu/location/l/e;->k()I

    move-result v0

    const/4 v2, 0x6

    invoke-static {v2, v0}, Lc/b/a/a/b;->c(II)I

    move-result v0

    add-int/2addr v1, v0

    :cond_5
    invoke-virtual {p0}, Lcom/baidu/location/l/e;->v()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lcom/baidu/location/l/e;->l()I

    move-result v0

    const/4 v2, 0x7

    invoke-static {v2, v0}, Lc/b/a/a/b;->c(II)I

    move-result v0

    add-int/2addr v1, v0

    :cond_6
    invoke-virtual {p0}, Lcom/baidu/location/l/e;->o()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Lcom/baidu/location/l/e;->e()I

    move-result v0

    const/16 v2, 0x8

    invoke-static {v2, v0}, Lc/b/a/a/b;->c(II)I

    move-result v0

    add-int/2addr v1, v0

    :cond_7
    invoke-virtual {p0}, Lcom/baidu/location/l/e;->p()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p0}, Lcom/baidu/location/l/e;->f()I

    move-result v0

    const/16 v2, 0x9

    invoke-static {v2, v0}, Lc/b/a/a/b;->c(II)I

    move-result v0

    add-int/2addr v1, v0

    :cond_8
    invoke-virtual {p0}, Lcom/baidu/location/l/e;->q()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {p0}, Lcom/baidu/location/l/e;->g()I

    move-result v0

    const/16 v2, 0xa

    invoke-static {v2, v0}, Lc/b/a/a/b;->c(II)I

    move-result v0

    add-int/2addr v1, v0

    :cond_9
    iput v1, p0, Lcom/baidu/location/l/e;->u:I

    return v1
.end method

.method public b(I)Lcom/baidu/location/l/e;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/baidu/location/l/e;->q:Z

    iput p1, p0, Lcom/baidu/location/l/e;->r:I

    return-object p0
.end method

.method public c(I)Lcom/baidu/location/l/e;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/baidu/location/l/e;->s:Z

    iput p1, p0, Lcom/baidu/location/l/e;->t:I

    return-object p0
.end method

.method public d()J
    .locals 2

    iget-wide v0, p0, Lcom/baidu/location/l/e;->b:J

    return-wide v0
.end method

.method public d(I)Lcom/baidu/location/l/e;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/baidu/location/l/e;->g:Z

    iput p1, p0, Lcom/baidu/location/l/e;->h:I

    return-object p0
.end method

.method public e()I
    .locals 0

    iget p0, p0, Lcom/baidu/location/l/e;->p:I

    return p0
.end method

.method public e(I)Lcom/baidu/location/l/e;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/baidu/location/l/e;->c:Z

    iput p1, p0, Lcom/baidu/location/l/e;->d:I

    return-object p0
.end method

.method public f()I
    .locals 0

    iget p0, p0, Lcom/baidu/location/l/e;->r:I

    return p0
.end method

.method public f(I)Lcom/baidu/location/l/e;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/baidu/location/l/e;->i:Z

    iput p1, p0, Lcom/baidu/location/l/e;->j:I

    return-object p0
.end method

.method public g()I
    .locals 0

    iget p0, p0, Lcom/baidu/location/l/e;->t:I

    return p0
.end method

.method public g(I)Lcom/baidu/location/l/e;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/baidu/location/l/e;->k:Z

    iput p1, p0, Lcom/baidu/location/l/e;->l:I

    return-object p0
.end method

.method public h()I
    .locals 0

    iget p0, p0, Lcom/baidu/location/l/e;->h:I

    return p0
.end method

.method public h(I)Lcom/baidu/location/l/e;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/baidu/location/l/e;->m:Z

    iput p1, p0, Lcom/baidu/location/l/e;->n:I

    return-object p0
.end method

.method public i()I
    .locals 0

    iget p0, p0, Lcom/baidu/location/l/e;->d:I

    return p0
.end method

.method public i(I)Lcom/baidu/location/l/e;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/baidu/location/l/e;->e:Z

    iput p1, p0, Lcom/baidu/location/l/e;->f:I

    return-object p0
.end method

.method public j()I
    .locals 0

    iget p0, p0, Lcom/baidu/location/l/e;->j:I

    return p0
.end method

.method public k()I
    .locals 0

    iget p0, p0, Lcom/baidu/location/l/e;->l:I

    return p0
.end method

.method public l()I
    .locals 0

    iget p0, p0, Lcom/baidu/location/l/e;->n:I

    return p0
.end method

.method public m()I
    .locals 0

    iget p0, p0, Lcom/baidu/location/l/e;->f:I

    return p0
.end method

.method public n()Z
    .locals 0

    iget-boolean p0, p0, Lcom/baidu/location/l/e;->a:Z

    return p0
.end method

.method public o()Z
    .locals 0

    iget-boolean p0, p0, Lcom/baidu/location/l/e;->o:Z

    return p0
.end method

.method public p()Z
    .locals 0

    iget-boolean p0, p0, Lcom/baidu/location/l/e;->q:Z

    return p0
.end method

.method public q()Z
    .locals 0

    iget-boolean p0, p0, Lcom/baidu/location/l/e;->s:Z

    return p0
.end method

.method public r()Z
    .locals 0

    iget-boolean p0, p0, Lcom/baidu/location/l/e;->g:Z

    return p0
.end method

.method public s()Z
    .locals 0

    iget-boolean p0, p0, Lcom/baidu/location/l/e;->c:Z

    return p0
.end method

.method public t()Z
    .locals 0

    iget-boolean p0, p0, Lcom/baidu/location/l/e;->i:Z

    return p0
.end method

.method public u()Z
    .locals 0

    iget-boolean p0, p0, Lcom/baidu/location/l/e;->k:Z

    return p0
.end method

.method public v()Z
    .locals 0

    iget-boolean p0, p0, Lcom/baidu/location/l/e;->m:Z

    return p0
.end method

.method public w()Z
    .locals 0

    iget-boolean p0, p0, Lcom/baidu/location/l/e;->e:Z

    return p0
.end method
