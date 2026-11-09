.class public La/a/a/g/a;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:I

.field public b:J

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:J

.field public h:I

.field public i:C

.field public j:I

.field public k:I

.field public l:I

.field public m:Ljava/lang/String;

.field public n:Ljava/lang/String;

.field public o:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, La/a/a/g/a;->a:I

    const-wide/16 v1, -0x1

    iput-wide v1, p0, La/a/a/g/a;->b:J

    iput v0, p0, La/a/a/g/a;->c:I

    iput v0, p0, La/a/a/g/a;->d:I

    const v1, 0x7fffffff

    iput v1, p0, La/a/a/g/a;->e:I

    iput v1, p0, La/a/a/g/a;->f:I

    const-wide/16 v2, 0x0

    iput-wide v2, p0, La/a/a/g/a;->g:J

    iput v0, p0, La/a/a/g/a;->h:I

    const/16 v0, 0x30

    iput-char v0, p0, La/a/a/g/a;->i:C

    iput v1, p0, La/a/a/g/a;->j:I

    const/4 v0, 0x0

    iput v0, p0, La/a/a/g/a;->k:I

    iput v0, p0, La/a/a/g/a;->l:I

    const/4 v0, 0x0

    iput-object v0, p0, La/a/a/g/a;->m:Ljava/lang/String;

    iput-object v0, p0, La/a/a/g/a;->n:Ljava/lang/String;

    iput-object v0, p0, La/a/a/g/a;->o:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, La/a/a/g/a;->g:J

    return-void
.end method

.method public constructor <init>(IJIIICI)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, La/a/a/g/a;->a:I

    const-wide/16 v1, -0x1

    iput-wide v1, p0, La/a/a/g/a;->b:J

    iput v0, p0, La/a/a/g/a;->c:I

    iput v0, p0, La/a/a/g/a;->d:I

    const v1, 0x7fffffff

    iput v1, p0, La/a/a/g/a;->e:I

    iput v1, p0, La/a/a/g/a;->f:I

    const-wide/16 v2, 0x0

    iput-wide v2, p0, La/a/a/g/a;->g:J

    iput v0, p0, La/a/a/g/a;->h:I

    const/16 v0, 0x30

    iput-char v0, p0, La/a/a/g/a;->i:C

    iput v1, p0, La/a/a/g/a;->j:I

    const/4 v0, 0x0

    iput v0, p0, La/a/a/g/a;->k:I

    iput v0, p0, La/a/a/g/a;->l:I

    const/4 v0, 0x0

    iput-object v0, p0, La/a/a/g/a;->m:Ljava/lang/String;

    iput-object v0, p0, La/a/a/g/a;->n:Ljava/lang/String;

    iput-object v0, p0, La/a/a/g/a;->o:Ljava/lang/String;

    iput p1, p0, La/a/a/g/a;->a:I

    iput-wide p2, p0, La/a/a/g/a;->b:J

    iput p4, p0, La/a/a/g/a;->c:I

    iput p5, p0, La/a/a/g/a;->d:I

    iput p6, p0, La/a/a/g/a;->h:I

    iput-char p7, p0, La/a/a/g/a;->i:C

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, La/a/a/g/a;->g:J

    iput p8, p0, La/a/a/g/a;->j:I

    return-void
.end method

.method public constructor <init>(La/a/a/g/a;)V
    .locals 9

    iget v1, p1, La/a/a/g/a;->a:I

    iget-wide v2, p1, La/a/a/g/a;->b:J

    iget v4, p1, La/a/a/g/a;->c:I

    iget v5, p1, La/a/a/g/a;->d:I

    iget v6, p1, La/a/a/g/a;->h:I

    iget-char v7, p1, La/a/a/g/a;->i:C

    iget v8, p1, La/a/a/g/a;->j:I

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, La/a/a/g/a;-><init>(IJIIICI)V

    iget-wide v0, p1, La/a/a/g/a;->g:J

    iput-wide v0, p0, La/a/a/g/a;->g:J

    iget-object v0, p1, La/a/a/g/a;->m:Ljava/lang/String;

    iput-object v0, p0, La/a/a/g/a;->m:Ljava/lang/String;

    iget v0, p1, La/a/a/g/a;->k:I

    iput v0, p0, La/a/a/g/a;->k:I

    iget-object v0, p1, La/a/a/g/a;->o:Ljava/lang/String;

    iput-object v0, p0, La/a/a/g/a;->o:Ljava/lang/String;

    iget v0, p1, La/a/a/g/a;->l:I

    iput v0, p0, La/a/a/g/a;->l:I

    iget-object p1, p1, La/a/a/g/a;->n:Ljava/lang/String;

    iput-object p1, p0, La/a/a/g/a;->n:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, La/a/a/g/a;->g:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long p0, v0, v2

    if-lez p0, :cond_0

    const-wide/16 v2, 0xbb8

    cmp-long p0, v0, v2

    if-gez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public a(La/a/a/g/a;)Z
    .locals 4

    iget v0, p0, La/a/a/g/a;->a:I

    iget v1, p1, La/a/a/g/a;->a:I

    if-ne v0, v1, :cond_2

    iget-wide v0, p0, La/a/a/g/a;->b:J

    iget-wide v2, p1, La/a/a/g/a;->b:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    iget v0, p0, La/a/a/g/a;->d:I

    iget v1, p1, La/a/a/g/a;->d:I

    if-ne v0, v1, :cond_2

    iget v0, p0, La/a/a/g/a;->c:I

    iget v1, p1, La/a/a/g/a;->c:I

    if-ne v0, v1, :cond_2

    iget-object v0, p0, La/a/a/g/a;->n:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v1, p1, La/a/a/g/a;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iget-object p0, p0, La/a/a/g/a;->n:Ljava/lang/String;

    if-nez p0, :cond_2

    iget-object p0, p1, La/a/a/g/a;->n:Ljava/lang/String;

    if-nez p0, :cond_2

    :cond_1
    const/4 p0, 0x1

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public b()Z
    .locals 6

    iget v0, p0, La/a/a/g/a;->a:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget-wide v2, p0, La/a/a/g/a;->b:J

    const-wide/16 v4, -0x1

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    iget v0, p0, La/a/a/g/a;->d:I

    if-ne v0, v1, :cond_0

    iget p0, p0, La/a/a/g/a;->c:I

    if-ne p0, v1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public c()Z
    .locals 6

    iget v0, p0, La/a/a/g/a;->a:I

    const/4 v1, -0x1

    if-le v0, v1, :cond_0

    iget-wide v2, p0, La/a/a/g/a;->b:J

    const-wide/16 v4, -0x1

    cmp-long v0, v2, v4

    if-lez v0, :cond_0

    iget v0, p0, La/a/a/g/a;->d:I

    if-ne v0, v1, :cond_0

    iget p0, p0, La/a/a/g/a;->c:I

    if-ne p0, v1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public d()Z
    .locals 6

    iget v0, p0, La/a/a/g/a;->a:I

    const/4 v1, -0x1

    if-le v0, v1, :cond_0

    iget-wide v2, p0, La/a/a/g/a;->b:J

    const-wide/16 v4, -0x1

    cmp-long v0, v2, v4

    if-lez v0, :cond_0

    iget v0, p0, La/a/a/g/a;->d:I

    if-le v0, v1, :cond_0

    iget p0, p0, La/a/a/g/a;->c:I

    if-le p0, v1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public e()Z
    .locals 4

    iget v0, p0, La/a/a/g/a;->a:I

    const/4 v1, -0x1

    if-le v0, v1, :cond_0

    iget-wide v0, p0, La/a/a/g/a;->b:J

    const-wide/16 v2, 0x0

    cmp-long p0, v0, v2

    if-lez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
