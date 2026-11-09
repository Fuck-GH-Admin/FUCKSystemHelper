.class public final Lcom/baidu/location/l/b;
.super Lc/b/a/a/c;
.source ""


# instance fields
.field private a:Z

.field private b:Lcom/baidu/location/l/a;

.field private c:Z

.field private d:Lcom/baidu/location/l/d;

.field private e:Z

.field private f:Lcom/baidu/location/l/e;

.field private g:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lc/b/a/a/c;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/baidu/location/l/b;->b:Lcom/baidu/location/l/a;

    iput-object v0, p0, Lcom/baidu/location/l/b;->d:Lcom/baidu/location/l/d;

    iput-object v0, p0, Lcom/baidu/location/l/b;->f:Lcom/baidu/location/l/e;

    const/4 v0, -0x1

    iput v0, p0, Lcom/baidu/location/l/b;->g:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/baidu/location/l/b;->g:I

    if-gez v0, :cond_0

    invoke-virtual {p0}, Lcom/baidu/location/l/b;->b()I

    :cond_0
    iget p0, p0, Lcom/baidu/location/l/b;->g:I

    return p0
.end method

.method public a(Lcom/baidu/location/l/a;)Lcom/baidu/location/l/b;
    .locals 1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/baidu/location/l/b;->d()Lcom/baidu/location/l/b;

    return-object p0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/baidu/location/l/b;->a:Z

    iput-object p1, p0, Lcom/baidu/location/l/b;->b:Lcom/baidu/location/l/a;

    return-object p0
.end method

.method public a(Lcom/baidu/location/l/d;)Lcom/baidu/location/l/b;
    .locals 1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/baidu/location/l/b;->e()Lcom/baidu/location/l/b;

    return-object p0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/baidu/location/l/b;->c:Z

    iput-object p1, p0, Lcom/baidu/location/l/b;->d:Lcom/baidu/location/l/d;

    return-object p0
.end method

.method public a(Lcom/baidu/location/l/e;)Lcom/baidu/location/l/b;
    .locals 1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/baidu/location/l/b;->f()Lcom/baidu/location/l/b;

    return-object p0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/baidu/location/l/b;->e:Z

    iput-object p1, p0, Lcom/baidu/location/l/b;->f:Lcom/baidu/location/l/e;

    return-object p0
.end method

.method public a(Lc/b/a/a/b;)V
    .locals 2

    invoke-virtual {p0}, Lcom/baidu/location/l/b;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/baidu/location/l/b;->g()Lcom/baidu/location/l/a;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lc/b/a/a/b;->a(ILc/b/a/a/c;)V

    :cond_0
    invoke-virtual {p0}, Lcom/baidu/location/l/b;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/baidu/location/l/b;->h()Lcom/baidu/location/l/d;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lc/b/a/a/b;->a(ILc/b/a/a/c;)V

    :cond_1
    invoke-virtual {p0}, Lcom/baidu/location/l/b;->l()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/baidu/location/l/b;->i()Lcom/baidu/location/l/e;

    move-result-object p0

    const/4 v0, 0x3

    invoke-virtual {p1, v0, p0}, Lc/b/a/a/b;->a(ILc/b/a/a/c;)V

    :cond_2
    return-void
.end method

.method public b()I
    .locals 3

    invoke-virtual {p0}, Lcom/baidu/location/l/b;->j()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/baidu/location/l/b;->g()Lcom/baidu/location/l/a;

    move-result-object v0

    const/4 v2, 0x1

    invoke-static {v2, v0}, Lc/b/a/a/b;->b(ILc/b/a/a/c;)I

    move-result v0

    add-int/2addr v1, v0

    :cond_0
    invoke-virtual {p0}, Lcom/baidu/location/l/b;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/baidu/location/l/b;->h()Lcom/baidu/location/l/d;

    move-result-object v0

    const/4 v2, 0x2

    invoke-static {v2, v0}, Lc/b/a/a/b;->b(ILc/b/a/a/c;)I

    move-result v0

    add-int/2addr v1, v0

    :cond_1
    invoke-virtual {p0}, Lcom/baidu/location/l/b;->l()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/baidu/location/l/b;->i()Lcom/baidu/location/l/e;

    move-result-object v0

    const/4 v2, 0x3

    invoke-static {v2, v0}, Lc/b/a/a/b;->b(ILc/b/a/a/c;)I

    move-result v0

    add-int/2addr v1, v0

    :cond_2
    iput v1, p0, Lcom/baidu/location/l/b;->g:I

    return v1
.end method

.method public d()Lcom/baidu/location/l/b;
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/baidu/location/l/b;->a:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/baidu/location/l/b;->b:Lcom/baidu/location/l/a;

    return-object p0
.end method

.method public e()Lcom/baidu/location/l/b;
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/baidu/location/l/b;->c:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/baidu/location/l/b;->d:Lcom/baidu/location/l/d;

    return-object p0
.end method

.method public f()Lcom/baidu/location/l/b;
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/baidu/location/l/b;->e:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/baidu/location/l/b;->f:Lcom/baidu/location/l/e;

    return-object p0
.end method

.method public g()Lcom/baidu/location/l/a;
    .locals 0

    iget-object p0, p0, Lcom/baidu/location/l/b;->b:Lcom/baidu/location/l/a;

    return-object p0
.end method

.method public h()Lcom/baidu/location/l/d;
    .locals 0

    iget-object p0, p0, Lcom/baidu/location/l/b;->d:Lcom/baidu/location/l/d;

    return-object p0
.end method

.method public i()Lcom/baidu/location/l/e;
    .locals 0

    iget-object p0, p0, Lcom/baidu/location/l/b;->f:Lcom/baidu/location/l/e;

    return-object p0
.end method

.method public j()Z
    .locals 0

    iget-boolean p0, p0, Lcom/baidu/location/l/b;->a:Z

    return p0
.end method

.method public k()Z
    .locals 0

    iget-boolean p0, p0, Lcom/baidu/location/l/b;->c:Z

    return p0
.end method

.method public l()Z
    .locals 0

    iget-boolean p0, p0, Lcom/baidu/location/l/b;->e:Z

    return p0
.end method
