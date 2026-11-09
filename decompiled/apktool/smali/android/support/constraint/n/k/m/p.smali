.class public abstract Landroid/support/constraint/n/k/m/p;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/support/constraint/n/k/m/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/constraint/n/k/m/p$b;
    }
.end annotation


# instance fields
.field public a:I

.field b:Landroid/support/constraint/n/k/e;

.field c:Landroid/support/constraint/n/k/m/m;

.field protected d:Landroid/support/constraint/n/k/e$b;

.field e:Landroid/support/constraint/n/k/m/g;

.field public f:I

.field g:Z

.field public h:Landroid/support/constraint/n/k/m/f;

.field public i:Landroid/support/constraint/n/k/m/f;

.field protected j:Landroid/support/constraint/n/k/m/p$b;


# direct methods
.method public constructor <init>(Landroid/support/constraint/n/k/e;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/support/constraint/n/k/m/g;

    invoke-direct {v0, p0}, Landroid/support/constraint/n/k/m/g;-><init>(Landroid/support/constraint/n/k/m/p;)V

    iput-object v0, p0, Landroid/support/constraint/n/k/m/p;->e:Landroid/support/constraint/n/k/m/g;

    const/4 v0, 0x0

    iput v0, p0, Landroid/support/constraint/n/k/m/p;->f:I

    iput-boolean v0, p0, Landroid/support/constraint/n/k/m/p;->g:Z

    new-instance v0, Landroid/support/constraint/n/k/m/f;

    invoke-direct {v0, p0}, Landroid/support/constraint/n/k/m/f;-><init>(Landroid/support/constraint/n/k/m/p;)V

    iput-object v0, p0, Landroid/support/constraint/n/k/m/p;->h:Landroid/support/constraint/n/k/m/f;

    new-instance v0, Landroid/support/constraint/n/k/m/f;

    invoke-direct {v0, p0}, Landroid/support/constraint/n/k/m/f;-><init>(Landroid/support/constraint/n/k/m/p;)V

    iput-object v0, p0, Landroid/support/constraint/n/k/m/p;->i:Landroid/support/constraint/n/k/m/f;

    sget-object v0, Landroid/support/constraint/n/k/m/p$b;->b:Landroid/support/constraint/n/k/m/p$b;

    iput-object v0, p0, Landroid/support/constraint/n/k/m/p;->j:Landroid/support/constraint/n/k/m/p$b;

    iput-object p1, p0, Landroid/support/constraint/n/k/m/p;->b:Landroid/support/constraint/n/k/e;

    return-void
.end method

.method private b(II)V
    .locals 6

    iget v0, p0, Landroid/support/constraint/n/k/m/p;->a:I

    if-eqz v0, :cond_8

    const/4 v1, 0x1

    if-eq v0, v1, :cond_7

    const/4 p2, 0x2

    const/high16 v2, 0x3f000000    # 0.5f

    if-eq v0, p2, :cond_4

    const/4 p2, 0x3

    if-eq v0, p2, :cond_0

    goto/16 :goto_6

    :cond_0
    iget-object v0, p0, Landroid/support/constraint/n/k/m/p;->b:Landroid/support/constraint/n/k/e;

    iget-object v3, v0, Landroid/support/constraint/n/k/e;->d:Landroid/support/constraint/n/k/m/l;

    iget-object v4, v3, Landroid/support/constraint/n/k/m/p;->d:Landroid/support/constraint/n/k/e$b;

    sget-object v5, Landroid/support/constraint/n/k/e$b;->d:Landroid/support/constraint/n/k/e$b;

    if-ne v4, v5, :cond_1

    iget v3, v3, Landroid/support/constraint/n/k/m/p;->a:I

    if-ne v3, p2, :cond_1

    iget-object v0, v0, Landroid/support/constraint/n/k/e;->e:Landroid/support/constraint/n/k/m/n;

    iget-object v3, v0, Landroid/support/constraint/n/k/m/p;->d:Landroid/support/constraint/n/k/e$b;

    if-ne v3, v5, :cond_1

    iget v0, v0, Landroid/support/constraint/n/k/m/p;->a:I

    if-ne v0, p2, :cond_1

    goto/16 :goto_6

    :cond_1
    iget-object p2, p0, Landroid/support/constraint/n/k/m/p;->b:Landroid/support/constraint/n/k/e;

    if-nez p1, :cond_2

    iget-object p2, p2, Landroid/support/constraint/n/k/e;->e:Landroid/support/constraint/n/k/m/n;

    goto :goto_0

    :cond_2
    iget-object p2, p2, Landroid/support/constraint/n/k/e;->d:Landroid/support/constraint/n/k/m/l;

    :goto_0
    iget-object v0, p2, Landroid/support/constraint/n/k/m/p;->e:Landroid/support/constraint/n/k/m/g;

    iget-boolean v0, v0, Landroid/support/constraint/n/k/m/f;->j:Z

    if-eqz v0, :cond_9

    iget-object v0, p0, Landroid/support/constraint/n/k/m/p;->b:Landroid/support/constraint/n/k/e;

    invoke-virtual {v0}, Landroid/support/constraint/n/k/e;->i()F

    move-result v0

    if-ne p1, v1, :cond_3

    iget-object p1, p2, Landroid/support/constraint/n/k/m/p;->e:Landroid/support/constraint/n/k/m/g;

    iget p1, p1, Landroid/support/constraint/n/k/m/f;->g:I

    int-to-float p1, p1

    div-float/2addr p1, v0

    add-float/2addr p1, v2

    float-to-int p1, p1

    goto :goto_1

    :cond_3
    iget-object p1, p2, Landroid/support/constraint/n/k/m/p;->e:Landroid/support/constraint/n/k/m/g;

    iget p1, p1, Landroid/support/constraint/n/k/m/f;->g:I

    int-to-float p1, p1

    mul-float/2addr v0, p1

    add-float/2addr v0, v2

    float-to-int p1, v0

    :goto_1
    iget-object p0, p0, Landroid/support/constraint/n/k/m/p;->e:Landroid/support/constraint/n/k/m/g;

    goto :goto_4

    :cond_4
    iget-object p2, p0, Landroid/support/constraint/n/k/m/p;->b:Landroid/support/constraint/n/k/e;

    invoke-virtual {p2}, Landroid/support/constraint/n/k/e;->v()Landroid/support/constraint/n/k/e;

    move-result-object p2

    if-eqz p2, :cond_9

    if-nez p1, :cond_5

    iget-object p2, p2, Landroid/support/constraint/n/k/e;->d:Landroid/support/constraint/n/k/m/l;

    goto :goto_2

    :cond_5
    iget-object p2, p2, Landroid/support/constraint/n/k/e;->e:Landroid/support/constraint/n/k/m/n;

    :goto_2
    iget-object v0, p2, Landroid/support/constraint/n/k/m/p;->e:Landroid/support/constraint/n/k/m/g;

    iget-boolean v0, v0, Landroid/support/constraint/n/k/m/f;->j:Z

    if-eqz v0, :cond_9

    iget-object v0, p0, Landroid/support/constraint/n/k/m/p;->b:Landroid/support/constraint/n/k/e;

    if-nez p1, :cond_6

    iget v0, v0, Landroid/support/constraint/n/k/e;->s:F

    goto :goto_3

    :cond_6
    iget v0, v0, Landroid/support/constraint/n/k/e;->v:F

    :goto_3
    iget-object p2, p2, Landroid/support/constraint/n/k/m/p;->e:Landroid/support/constraint/n/k/m/g;

    iget p2, p2, Landroid/support/constraint/n/k/m/f;->g:I

    int-to-float p2, p2

    mul-float/2addr p2, v0

    add-float/2addr p2, v2

    float-to-int p2, p2

    goto :goto_5

    :cond_7
    iget-object v0, p0, Landroid/support/constraint/n/k/m/p;->e:Landroid/support/constraint/n/k/m/g;

    iget v0, v0, Landroid/support/constraint/n/k/m/g;->m:I

    invoke-virtual {p0, v0, p1}, Landroid/support/constraint/n/k/m/p;->a(II)I

    move-result p1

    iget-object p0, p0, Landroid/support/constraint/n/k/m/p;->e:Landroid/support/constraint/n/k/m/g;

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    :goto_4
    invoke-virtual {p0, p1}, Landroid/support/constraint/n/k/m/g;->a(I)V

    goto :goto_6

    :cond_8
    :goto_5
    iget-object v0, p0, Landroid/support/constraint/n/k/m/p;->e:Landroid/support/constraint/n/k/m/g;

    invoke-virtual {p0, p2, p1}, Landroid/support/constraint/n/k/m/p;->a(II)I

    move-result p0

    invoke-virtual {v0, p0}, Landroid/support/constraint/n/k/m/g;->a(I)V

    :cond_9
    :goto_6
    return-void
.end method


# virtual methods
.method protected final a(II)I
    .locals 0

    iget-object p0, p0, Landroid/support/constraint/n/k/m/p;->b:Landroid/support/constraint/n/k/e;

    if-nez p2, :cond_1

    iget p2, p0, Landroid/support/constraint/n/k/e;->r:I

    iget p0, p0, Landroid/support/constraint/n/k/e;->q:I

    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    move-result p0

    if-lez p2, :cond_0

    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result p0

    :cond_0
    if-eq p0, p1, :cond_3

    goto :goto_0

    :cond_1
    iget p2, p0, Landroid/support/constraint/n/k/e;->u:I

    iget p0, p0, Landroid/support/constraint/n/k/e;->t:I

    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    move-result p0

    if-lez p2, :cond_2

    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result p0

    :cond_2
    if-eq p0, p1, :cond_3

    :goto_0
    move p1, p0

    :cond_3
    return p1
.end method

.method protected final a(Landroid/support/constraint/n/k/d;)Landroid/support/constraint/n/k/m/f;
    .locals 2

    iget-object p0, p1, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    const/4 p1, 0x0

    if-nez p0, :cond_0

    return-object p1

    :cond_0
    iget-object v0, p0, Landroid/support/constraint/n/k/d;->d:Landroid/support/constraint/n/k/e;

    iget-object p0, p0, Landroid/support/constraint/n/k/d;->e:Landroid/support/constraint/n/k/d$b;

    sget-object v1, Landroid/support/constraint/n/k/m/p$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v1, p0

    const/4 v1, 0x1

    if-eq p0, v1, :cond_5

    const/4 v1, 0x2

    if-eq p0, v1, :cond_4

    const/4 v1, 0x3

    if-eq p0, v1, :cond_3

    const/4 v1, 0x4

    if-eq p0, v1, :cond_2

    const/4 v1, 0x5

    if-eq p0, v1, :cond_1

    goto :goto_2

    :cond_1
    iget-object p0, v0, Landroid/support/constraint/n/k/e;->e:Landroid/support/constraint/n/k/m/n;

    goto :goto_0

    :cond_2
    iget-object p0, v0, Landroid/support/constraint/n/k/e;->e:Landroid/support/constraint/n/k/m/n;

    iget-object p1, p0, Landroid/support/constraint/n/k/m/n;->k:Landroid/support/constraint/n/k/m/f;

    goto :goto_2

    :cond_3
    iget-object p0, v0, Landroid/support/constraint/n/k/e;->e:Landroid/support/constraint/n/k/m/n;

    goto :goto_1

    :cond_4
    iget-object p0, v0, Landroid/support/constraint/n/k/e;->d:Landroid/support/constraint/n/k/m/l;

    :goto_0
    iget-object p1, p0, Landroid/support/constraint/n/k/m/p;->i:Landroid/support/constraint/n/k/m/f;

    goto :goto_2

    :cond_5
    iget-object p0, v0, Landroid/support/constraint/n/k/e;->d:Landroid/support/constraint/n/k/m/l;

    :goto_1
    iget-object p1, p0, Landroid/support/constraint/n/k/m/p;->h:Landroid/support/constraint/n/k/m/f;

    :goto_2
    return-object p1
.end method

.method protected final a(Landroid/support/constraint/n/k/d;I)Landroid/support/constraint/n/k/m/f;
    .locals 1

    iget-object p0, p1, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    iget-object p0, p0, Landroid/support/constraint/n/k/d;->d:Landroid/support/constraint/n/k/e;

    if-nez p2, :cond_1

    iget-object p0, p0, Landroid/support/constraint/n/k/e;->d:Landroid/support/constraint/n/k/m/l;

    goto :goto_0

    :cond_1
    iget-object p0, p0, Landroid/support/constraint/n/k/e;->e:Landroid/support/constraint/n/k/m/n;

    :goto_0
    iget-object p1, p1, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    iget-object p1, p1, Landroid/support/constraint/n/k/d;->e:Landroid/support/constraint/n/k/d$b;

    sget-object p2, Landroid/support/constraint/n/k/m/p$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p2, p1

    const/4 p2, 0x1

    if-eq p1, p2, :cond_3

    const/4 p2, 0x2

    if-eq p1, p2, :cond_2

    const/4 p2, 0x3

    if-eq p1, p2, :cond_3

    const/4 p2, 0x5

    if-eq p1, p2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, Landroid/support/constraint/n/k/m/p;->i:Landroid/support/constraint/n/k/m/f;

    goto :goto_1

    :cond_3
    iget-object v0, p0, Landroid/support/constraint/n/k/m/p;->h:Landroid/support/constraint/n/k/m/f;

    :goto_1
    return-object v0
.end method

.method abstract a()V
.end method

.method public a(Landroid/support/constraint/n/k/m/d;)V
    .locals 0

    return-void
.end method

.method protected a(Landroid/support/constraint/n/k/m/d;Landroid/support/constraint/n/k/d;Landroid/support/constraint/n/k/d;I)V
    .locals 4

    invoke-virtual {p0, p2}, Landroid/support/constraint/n/k/m/p;->a(Landroid/support/constraint/n/k/d;)Landroid/support/constraint/n/k/m/f;

    move-result-object p1

    invoke-virtual {p0, p3}, Landroid/support/constraint/n/k/m/p;->a(Landroid/support/constraint/n/k/d;)Landroid/support/constraint/n/k/m/f;

    move-result-object v0

    iget-boolean v1, p1, Landroid/support/constraint/n/k/m/f;->j:Z

    if-eqz v1, :cond_6

    iget-boolean v1, v0, Landroid/support/constraint/n/k/m/f;->j:Z

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    iget v1, p1, Landroid/support/constraint/n/k/m/f;->g:I

    invoke-virtual {p2}, Landroid/support/constraint/n/k/d;->c()I

    move-result p2

    add-int/2addr v1, p2

    iget p2, v0, Landroid/support/constraint/n/k/m/f;->g:I

    invoke-virtual {p3}, Landroid/support/constraint/n/k/d;->c()I

    move-result p3

    sub-int/2addr p2, p3

    sub-int p3, p2, v1

    iget-object v2, p0, Landroid/support/constraint/n/k/m/p;->e:Landroid/support/constraint/n/k/m/g;

    iget-boolean v2, v2, Landroid/support/constraint/n/k/m/f;->j:Z

    if-nez v2, :cond_1

    iget-object v2, p0, Landroid/support/constraint/n/k/m/p;->d:Landroid/support/constraint/n/k/e$b;

    sget-object v3, Landroid/support/constraint/n/k/e$b;->d:Landroid/support/constraint/n/k/e$b;

    if-ne v2, v3, :cond_1

    invoke-direct {p0, p4, p3}, Landroid/support/constraint/n/k/m/p;->b(II)V

    :cond_1
    iget-object v2, p0, Landroid/support/constraint/n/k/m/p;->e:Landroid/support/constraint/n/k/m/g;

    iget-boolean v3, v2, Landroid/support/constraint/n/k/m/f;->j:Z

    if-nez v3, :cond_2

    return-void

    :cond_2
    iget v2, v2, Landroid/support/constraint/n/k/m/f;->g:I

    if-ne v2, p3, :cond_3

    iget-object p1, p0, Landroid/support/constraint/n/k/m/p;->h:Landroid/support/constraint/n/k/m/f;

    invoke-virtual {p1, v1}, Landroid/support/constraint/n/k/m/f;->a(I)V

    iget-object p0, p0, Landroid/support/constraint/n/k/m/p;->i:Landroid/support/constraint/n/k/m/f;

    invoke-virtual {p0, p2}, Landroid/support/constraint/n/k/m/f;->a(I)V

    return-void

    :cond_3
    iget-object p3, p0, Landroid/support/constraint/n/k/m/p;->b:Landroid/support/constraint/n/k/e;

    if-nez p4, :cond_4

    invoke-virtual {p3}, Landroid/support/constraint/n/k/e;->l()F

    move-result p3

    goto :goto_0

    :cond_4
    invoke-virtual {p3}, Landroid/support/constraint/n/k/e;->x()F

    move-result p3

    :goto_0
    const/high16 p4, 0x3f000000    # 0.5f

    if-ne p1, v0, :cond_5

    iget v1, p1, Landroid/support/constraint/n/k/m/f;->g:I

    iget p2, v0, Landroid/support/constraint/n/k/m/f;->g:I

    move p3, p4

    :cond_5
    sub-int/2addr p2, v1

    iget-object p1, p0, Landroid/support/constraint/n/k/m/p;->e:Landroid/support/constraint/n/k/m/g;

    iget p1, p1, Landroid/support/constraint/n/k/m/f;->g:I

    sub-int/2addr p2, p1

    iget-object p1, p0, Landroid/support/constraint/n/k/m/p;->h:Landroid/support/constraint/n/k/m/f;

    int-to-float v0, v1

    add-float/2addr v0, p4

    int-to-float p2, p2

    mul-float/2addr p2, p3

    add-float/2addr v0, p2

    float-to-int p2, v0

    invoke-virtual {p1, p2}, Landroid/support/constraint/n/k/m/f;->a(I)V

    iget-object p1, p0, Landroid/support/constraint/n/k/m/p;->i:Landroid/support/constraint/n/k/m/f;

    iget-object p2, p0, Landroid/support/constraint/n/k/m/p;->h:Landroid/support/constraint/n/k/m/f;

    iget p2, p2, Landroid/support/constraint/n/k/m/f;->g:I

    iget-object p0, p0, Landroid/support/constraint/n/k/m/p;->e:Landroid/support/constraint/n/k/m/g;

    iget p0, p0, Landroid/support/constraint/n/k/m/f;->g:I

    add-int/2addr p2, p0

    invoke-virtual {p1, p2}, Landroid/support/constraint/n/k/m/f;->a(I)V

    :cond_6
    :goto_1
    return-void
.end method

.method protected final a(Landroid/support/constraint/n/k/m/f;Landroid/support/constraint/n/k/m/f;I)V
    .locals 0

    iget-object p0, p1, Landroid/support/constraint/n/k/m/f;->l:Ljava/util/List;

    invoke-interface {p0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iput p3, p1, Landroid/support/constraint/n/k/m/f;->f:I

    iget-object p0, p2, Landroid/support/constraint/n/k/m/f;->k:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method protected final a(Landroid/support/constraint/n/k/m/f;Landroid/support/constraint/n/k/m/f;ILandroid/support/constraint/n/k/m/g;)V
    .locals 1

    iget-object v0, p1, Landroid/support/constraint/n/k/m/f;->l:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p1, Landroid/support/constraint/n/k/m/f;->l:Ljava/util/List;

    iget-object p0, p0, Landroid/support/constraint/n/k/m/p;->e:Landroid/support/constraint/n/k/m/g;

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iput p3, p1, Landroid/support/constraint/n/k/m/f;->h:I

    iput-object p4, p1, Landroid/support/constraint/n/k/m/f;->i:Landroid/support/constraint/n/k/m/g;

    iget-object p0, p2, Landroid/support/constraint/n/k/m/f;->k:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p0, p4, Landroid/support/constraint/n/k/m/f;->k:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method abstract b()V
.end method

.method protected b(Landroid/support/constraint/n/k/m/d;)V
    .locals 0

    return-void
.end method

.method abstract c()V
.end method

.method protected c(Landroid/support/constraint/n/k/m/d;)V
    .locals 0

    return-void
.end method

.method public d()J
    .locals 2

    iget-object p0, p0, Landroid/support/constraint/n/k/m/p;->e:Landroid/support/constraint/n/k/m/g;

    iget-boolean v0, p0, Landroid/support/constraint/n/k/m/f;->j:Z

    if-eqz v0, :cond_0

    iget p0, p0, Landroid/support/constraint/n/k/m/f;->g:I

    int-to-long v0, p0

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public e()Z
    .locals 0

    iget-boolean p0, p0, Landroid/support/constraint/n/k/m/p;->g:Z

    return p0
.end method

.method abstract f()Z
.end method
