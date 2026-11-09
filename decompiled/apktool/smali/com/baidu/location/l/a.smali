.class public final Lcom/baidu/location/l/a;
.super Lc/b/a/a/c;
.source ""


# instance fields
.field private a:Z

.field private b:I

.field private c:Z

.field private d:Lc/b/a/a/a;

.field private e:Z

.field private f:Lc/b/a/a/a;

.field private g:Z

.field private h:I

.field private i:Z

.field private j:J

.field private k:Z

.field private l:I

.field private m:I


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lc/b/a/a/c;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/baidu/location/l/a;->b:I

    sget-object v1, Lc/b/a/a/a;->c:Lc/b/a/a/a;

    iput-object v1, p0, Lcom/baidu/location/l/a;->d:Lc/b/a/a/a;

    iput-object v1, p0, Lcom/baidu/location/l/a;->f:Lc/b/a/a/a;

    iput v0, p0, Lcom/baidu/location/l/a;->h:I

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lcom/baidu/location/l/a;->j:J

    iput v0, p0, Lcom/baidu/location/l/a;->l:I

    const/4 v0, -0x1

    iput v0, p0, Lcom/baidu/location/l/a;->m:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/baidu/location/l/a;->m:I

    if-gez v0, :cond_0

    invoke-virtual {p0}, Lcom/baidu/location/l/a;->b()I

    :cond_0
    iget p0, p0, Lcom/baidu/location/l/a;->m:I

    return p0
.end method

.method public a(I)Lcom/baidu/location/l/a;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/baidu/location/l/a;->a:Z

    iput p1, p0, Lcom/baidu/location/l/a;->b:I

    return-object p0
.end method

.method public a(J)Lcom/baidu/location/l/a;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/baidu/location/l/a;->i:Z

    iput-wide p1, p0, Lcom/baidu/location/l/a;->j:J

    return-object p0
.end method

.method public a(Lc/b/a/a/a;)Lcom/baidu/location/l/a;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/baidu/location/l/a;->c:Z

    iput-object p1, p0, Lcom/baidu/location/l/a;->d:Lc/b/a/a/a;

    return-object p0
.end method

.method public a(Lc/b/a/a/b;)V
    .locals 3

    invoke-virtual {p0}, Lcom/baidu/location/l/a;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/baidu/location/l/a;->d()I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lc/b/a/a/b;->a(II)V

    :cond_0
    invoke-virtual {p0}, Lcom/baidu/location/l/a;->l()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/baidu/location/l/a;->f()Lc/b/a/a/a;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lc/b/a/a/b;->a(ILc/b/a/a/a;)V

    :cond_1
    invoke-virtual {p0}, Lcom/baidu/location/l/a;->m()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/baidu/location/l/a;->g()Lc/b/a/a/a;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {p1, v1, v0}, Lc/b/a/a/b;->a(ILc/b/a/a/a;)V

    :cond_2
    invoke-virtual {p0}, Lcom/baidu/location/l/a;->n()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/baidu/location/l/a;->h()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {p1, v1, v0}, Lc/b/a/a/b;->a(II)V

    :cond_3
    invoke-virtual {p0}, Lcom/baidu/location/l/a;->o()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lcom/baidu/location/l/a;->i()J

    move-result-wide v0

    const/4 v2, 0x5

    invoke-virtual {p1, v2, v0, v1}, Lc/b/a/a/b;->a(IJ)V

    :cond_4
    invoke-virtual {p0}, Lcom/baidu/location/l/a;->k()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lcom/baidu/location/l/a;->e()I

    move-result p0

    const/4 v0, 0x6

    invoke-virtual {p1, v0, p0}, Lc/b/a/a/b;->a(II)V

    :cond_5
    return-void
.end method

.method public b()I
    .locals 4

    invoke-virtual {p0}, Lcom/baidu/location/l/a;->j()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/baidu/location/l/a;->d()I

    move-result v0

    const/4 v2, 0x1

    invoke-static {v2, v0}, Lc/b/a/a/b;->c(II)I

    move-result v0

    add-int/2addr v1, v0

    :cond_0
    invoke-virtual {p0}, Lcom/baidu/location/l/a;->l()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/baidu/location/l/a;->f()Lc/b/a/a/a;

    move-result-object v0

    const/4 v2, 0x2

    invoke-static {v2, v0}, Lc/b/a/a/b;->b(ILc/b/a/a/a;)I

    move-result v0

    add-int/2addr v1, v0

    :cond_1
    invoke-virtual {p0}, Lcom/baidu/location/l/a;->m()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/baidu/location/l/a;->g()Lc/b/a/a/a;

    move-result-object v0

    const/4 v2, 0x3

    invoke-static {v2, v0}, Lc/b/a/a/b;->b(ILc/b/a/a/a;)I

    move-result v0

    add-int/2addr v1, v0

    :cond_2
    invoke-virtual {p0}, Lcom/baidu/location/l/a;->n()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/baidu/location/l/a;->h()I

    move-result v0

    const/4 v2, 0x4

    invoke-static {v2, v0}, Lc/b/a/a/b;->c(II)I

    move-result v0

    add-int/2addr v1, v0

    :cond_3
    invoke-virtual {p0}, Lcom/baidu/location/l/a;->o()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lcom/baidu/location/l/a;->i()J

    move-result-wide v2

    const/4 v0, 0x5

    invoke-static {v0, v2, v3}, Lc/b/a/a/b;->b(IJ)I

    move-result v0

    add-int/2addr v1, v0

    :cond_4
    invoke-virtual {p0}, Lcom/baidu/location/l/a;->k()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lcom/baidu/location/l/a;->e()I

    move-result v0

    const/4 v2, 0x6

    invoke-static {v2, v0}, Lc/b/a/a/b;->c(II)I

    move-result v0

    add-int/2addr v1, v0

    :cond_5
    iput v1, p0, Lcom/baidu/location/l/a;->m:I

    return v1
.end method

.method public b(I)Lcom/baidu/location/l/a;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/baidu/location/l/a;->k:Z

    iput p1, p0, Lcom/baidu/location/l/a;->l:I

    return-object p0
.end method

.method public b(Lc/b/a/a/a;)Lcom/baidu/location/l/a;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/baidu/location/l/a;->e:Z

    iput-object p1, p0, Lcom/baidu/location/l/a;->f:Lc/b/a/a/a;

    return-object p0
.end method

.method public c(I)Lcom/baidu/location/l/a;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/baidu/location/l/a;->g:Z

    iput p1, p0, Lcom/baidu/location/l/a;->h:I

    return-object p0
.end method

.method public d()I
    .locals 0

    iget p0, p0, Lcom/baidu/location/l/a;->b:I

    return p0
.end method

.method public e()I
    .locals 0

    iget p0, p0, Lcom/baidu/location/l/a;->l:I

    return p0
.end method

.method public f()Lc/b/a/a/a;
    .locals 0

    iget-object p0, p0, Lcom/baidu/location/l/a;->d:Lc/b/a/a/a;

    return-object p0
.end method

.method public g()Lc/b/a/a/a;
    .locals 0

    iget-object p0, p0, Lcom/baidu/location/l/a;->f:Lc/b/a/a/a;

    return-object p0
.end method

.method public h()I
    .locals 0

    iget p0, p0, Lcom/baidu/location/l/a;->h:I

    return p0
.end method

.method public i()J
    .locals 2

    iget-wide v0, p0, Lcom/baidu/location/l/a;->j:J

    return-wide v0
.end method

.method public j()Z
    .locals 0

    iget-boolean p0, p0, Lcom/baidu/location/l/a;->a:Z

    return p0
.end method

.method public k()Z
    .locals 0

    iget-boolean p0, p0, Lcom/baidu/location/l/a;->k:Z

    return p0
.end method

.method public l()Z
    .locals 0

    iget-boolean p0, p0, Lcom/baidu/location/l/a;->c:Z

    return p0
.end method

.method public m()Z
    .locals 0

    iget-boolean p0, p0, Lcom/baidu/location/l/a;->e:Z

    return p0
.end method

.method public n()Z
    .locals 0

    iget-boolean p0, p0, Lcom/baidu/location/l/a;->g:Z

    return p0
.end method

.method public o()Z
    .locals 0

    iget-boolean p0, p0, Lcom/baidu/location/l/a;->i:Z

    return p0
.end method
