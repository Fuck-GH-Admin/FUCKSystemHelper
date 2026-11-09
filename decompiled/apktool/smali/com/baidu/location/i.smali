.class public final Lcom/baidu/location/i;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/baidu/location/i$a;,
        Lcom/baidu/location/i$b;
    }
.end annotation


# instance fields
.field public A:I

.field public B:I

.field public C:Z

.field public D:Lcom/baidu/location/i$a;

.field public E:Ljava/lang/String;

.field public F:I

.field public G:Ljava/lang/String;

.field public H:Ljava/lang/String;

.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Z

.field public d:I

.field public e:I

.field public f:Ljava/lang/String;

.field public g:I

.field public h:Z

.field public i:Z

.field public j:Z

.field public k:Ljava/lang/String;

.field public l:Z

.field public m:Z

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:Z

.field public r:Z

.field public s:Z

.field public t:Z

.field public u:Z

.field public v:Lcom/baidu/location/i$b;

.field public w:I

.field public x:F

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "gcj02"

    iput-object v0, p0, Lcom/baidu/location/i;->a:Ljava/lang/String;

    const-string v0, "noaddr"

    iput-object v0, p0, Lcom/baidu/location/i;->b:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/baidu/location/i;->c:Z

    iput v0, p0, Lcom/baidu/location/i;->d:I

    const/16 v1, 0x2ee0

    iput v1, p0, Lcom/baidu/location/i;->e:I

    const-string v1, "SDK6.0"

    iput-object v1, p0, Lcom/baidu/location/i;->f:Ljava/lang/String;

    const/4 v1, 0x1

    iput v1, p0, Lcom/baidu/location/i;->g:I

    iput-boolean v0, p0, Lcom/baidu/location/i;->h:Z

    iput-boolean v1, p0, Lcom/baidu/location/i;->i:Z

    iput-boolean v0, p0, Lcom/baidu/location/i;->j:Z

    const-string v2, "com.baidu.location.service_v2.9"

    iput-object v2, p0, Lcom/baidu/location/i;->k:Ljava/lang/String;

    iput-boolean v1, p0, Lcom/baidu/location/i;->l:Z

    iput-boolean v1, p0, Lcom/baidu/location/i;->m:Z

    iput-boolean v0, p0, Lcom/baidu/location/i;->n:Z

    iput-boolean v0, p0, Lcom/baidu/location/i;->o:Z

    iput-boolean v0, p0, Lcom/baidu/location/i;->p:Z

    iput-boolean v0, p0, Lcom/baidu/location/i;->q:Z

    iput-boolean v0, p0, Lcom/baidu/location/i;->r:Z

    iput-boolean v0, p0, Lcom/baidu/location/i;->s:Z

    iput-boolean v1, p0, Lcom/baidu/location/i;->t:Z

    iput-boolean v0, p0, Lcom/baidu/location/i;->u:Z

    iput v0, p0, Lcom/baidu/location/i;->w:I

    const/high16 v2, 0x3f000000    # 0.5f

    iput v2, p0, Lcom/baidu/location/i;->x:F

    iput v0, p0, Lcom/baidu/location/i;->y:I

    iput v0, p0, Lcom/baidu/location/i;->z:I

    const v2, 0x7fffffff

    iput v2, p0, Lcom/baidu/location/i;->A:I

    iput v1, p0, Lcom/baidu/location/i;->B:I

    iput-boolean v0, p0, Lcom/baidu/location/i;->C:Z

    sget-object v0, Lcom/baidu/location/i$a;->b:Lcom/baidu/location/i$a;

    iput-object v0, p0, Lcom/baidu/location/i;->D:Lcom/baidu/location/i$a;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/baidu/location/i;->E:Ljava/lang/String;

    const/4 v1, -0x1

    iput v1, p0, Lcom/baidu/location/i;->F:I

    iput-object v0, p0, Lcom/baidu/location/i;->G:Ljava/lang/String;

    iput-object v0, p0, Lcom/baidu/location/i;->H:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/baidu/location/i;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "gcj02"

    iput-object v0, p0, Lcom/baidu/location/i;->a:Ljava/lang/String;

    const-string v0, "noaddr"

    iput-object v0, p0, Lcom/baidu/location/i;->b:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/baidu/location/i;->c:Z

    iput v0, p0, Lcom/baidu/location/i;->d:I

    const/16 v1, 0x2ee0

    iput v1, p0, Lcom/baidu/location/i;->e:I

    const-string v1, "SDK6.0"

    iput-object v1, p0, Lcom/baidu/location/i;->f:Ljava/lang/String;

    const/4 v1, 0x1

    iput v1, p0, Lcom/baidu/location/i;->g:I

    iput-boolean v0, p0, Lcom/baidu/location/i;->h:Z

    iput-boolean v1, p0, Lcom/baidu/location/i;->i:Z

    iput-boolean v0, p0, Lcom/baidu/location/i;->j:Z

    const-string v2, "com.baidu.location.service_v2.9"

    iput-object v2, p0, Lcom/baidu/location/i;->k:Ljava/lang/String;

    iput-boolean v1, p0, Lcom/baidu/location/i;->l:Z

    iput-boolean v1, p0, Lcom/baidu/location/i;->m:Z

    iput-boolean v0, p0, Lcom/baidu/location/i;->n:Z

    iput-boolean v0, p0, Lcom/baidu/location/i;->o:Z

    iput-boolean v0, p0, Lcom/baidu/location/i;->p:Z

    iput-boolean v0, p0, Lcom/baidu/location/i;->q:Z

    iput-boolean v0, p0, Lcom/baidu/location/i;->r:Z

    iput-boolean v0, p0, Lcom/baidu/location/i;->s:Z

    iput-boolean v1, p0, Lcom/baidu/location/i;->t:Z

    iput-boolean v0, p0, Lcom/baidu/location/i;->u:Z

    iput v0, p0, Lcom/baidu/location/i;->w:I

    const/high16 v2, 0x3f000000    # 0.5f

    iput v2, p0, Lcom/baidu/location/i;->x:F

    iput v0, p0, Lcom/baidu/location/i;->y:I

    iput v0, p0, Lcom/baidu/location/i;->z:I

    const v2, 0x7fffffff

    iput v2, p0, Lcom/baidu/location/i;->A:I

    iput v1, p0, Lcom/baidu/location/i;->B:I

    iput-boolean v0, p0, Lcom/baidu/location/i;->C:Z

    sget-object v0, Lcom/baidu/location/i$a;->b:Lcom/baidu/location/i$a;

    iput-object v0, p0, Lcom/baidu/location/i;->D:Lcom/baidu/location/i$a;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/baidu/location/i;->E:Ljava/lang/String;

    const/4 v1, -0x1

    iput v1, p0, Lcom/baidu/location/i;->F:I

    iput-object v0, p0, Lcom/baidu/location/i;->G:Ljava/lang/String;

    iput-object v0, p0, Lcom/baidu/location/i;->H:Ljava/lang/String;

    iget-object v0, p1, Lcom/baidu/location/i;->a:Ljava/lang/String;

    iput-object v0, p0, Lcom/baidu/location/i;->a:Ljava/lang/String;

    iget-object v0, p1, Lcom/baidu/location/i;->b:Ljava/lang/String;

    iput-object v0, p0, Lcom/baidu/location/i;->b:Ljava/lang/String;

    iget-boolean v0, p1, Lcom/baidu/location/i;->c:Z

    iput-boolean v0, p0, Lcom/baidu/location/i;->c:Z

    iget v0, p1, Lcom/baidu/location/i;->d:I

    iput v0, p0, Lcom/baidu/location/i;->d:I

    iget v0, p1, Lcom/baidu/location/i;->e:I

    iput v0, p0, Lcom/baidu/location/i;->e:I

    iget-object v0, p1, Lcom/baidu/location/i;->f:Ljava/lang/String;

    iput-object v0, p0, Lcom/baidu/location/i;->f:Ljava/lang/String;

    iget v0, p1, Lcom/baidu/location/i;->g:I

    iput v0, p0, Lcom/baidu/location/i;->g:I

    iget-boolean v0, p1, Lcom/baidu/location/i;->h:Z

    iput-boolean v0, p0, Lcom/baidu/location/i;->h:Z

    iget-object v0, p1, Lcom/baidu/location/i;->k:Ljava/lang/String;

    iput-object v0, p0, Lcom/baidu/location/i;->k:Ljava/lang/String;

    iget-boolean v0, p1, Lcom/baidu/location/i;->i:Z

    iput-boolean v0, p0, Lcom/baidu/location/i;->i:Z

    iget-boolean v0, p1, Lcom/baidu/location/i;->l:Z

    iput-boolean v0, p0, Lcom/baidu/location/i;->l:Z

    iget-boolean v0, p1, Lcom/baidu/location/i;->m:Z

    iput-boolean v0, p0, Lcom/baidu/location/i;->m:Z

    iget-boolean v0, p1, Lcom/baidu/location/i;->j:Z

    iput-boolean v0, p0, Lcom/baidu/location/i;->j:Z

    iget-object v0, p1, Lcom/baidu/location/i;->v:Lcom/baidu/location/i$b;

    iput-object v0, p0, Lcom/baidu/location/i;->v:Lcom/baidu/location/i$b;

    iget-boolean v0, p1, Lcom/baidu/location/i;->o:Z

    iput-boolean v0, p0, Lcom/baidu/location/i;->o:Z

    iget-boolean v0, p1, Lcom/baidu/location/i;->p:Z

    iput-boolean v0, p0, Lcom/baidu/location/i;->p:Z

    iget-boolean v0, p1, Lcom/baidu/location/i;->q:Z

    iput-boolean v0, p0, Lcom/baidu/location/i;->q:Z

    iget-boolean v0, p1, Lcom/baidu/location/i;->r:Z

    iput-boolean v0, p0, Lcom/baidu/location/i;->r:Z

    iget-boolean v0, p1, Lcom/baidu/location/i;->n:Z

    iput-boolean v0, p0, Lcom/baidu/location/i;->n:Z

    iget-boolean v0, p1, Lcom/baidu/location/i;->s:Z

    iput-boolean v0, p0, Lcom/baidu/location/i;->s:Z

    iget v0, p1, Lcom/baidu/location/i;->w:I

    iput v0, p0, Lcom/baidu/location/i;->w:I

    iget v0, p1, Lcom/baidu/location/i;->x:F

    iput v0, p0, Lcom/baidu/location/i;->x:F

    iget v0, p1, Lcom/baidu/location/i;->y:I

    iput v0, p0, Lcom/baidu/location/i;->y:I

    iget v0, p1, Lcom/baidu/location/i;->z:I

    iput v0, p0, Lcom/baidu/location/i;->z:I

    iget v0, p1, Lcom/baidu/location/i;->A:I

    iput v0, p0, Lcom/baidu/location/i;->A:I

    iget-boolean v0, p1, Lcom/baidu/location/i;->t:Z

    iput-boolean v0, p0, Lcom/baidu/location/i;->t:Z

    iget-boolean v0, p1, Lcom/baidu/location/i;->u:Z

    iput-boolean v0, p0, Lcom/baidu/location/i;->u:Z

    iget v0, p1, Lcom/baidu/location/i;->B:I

    iput v0, p0, Lcom/baidu/location/i;->B:I

    iget-boolean v0, p1, Lcom/baidu/location/i;->C:Z

    iput-boolean v0, p0, Lcom/baidu/location/i;->C:Z

    iget-object v0, p1, Lcom/baidu/location/i;->D:Lcom/baidu/location/i$a;

    iput-object v0, p0, Lcom/baidu/location/i;->D:Lcom/baidu/location/i$a;

    iget-object v0, p1, Lcom/baidu/location/i;->E:Ljava/lang/String;

    iput-object v0, p0, Lcom/baidu/location/i;->E:Ljava/lang/String;

    iget v0, p1, Lcom/baidu/location/i;->F:I

    iput v0, p0, Lcom/baidu/location/i;->F:I

    iget-object v0, p1, Lcom/baidu/location/i;->G:Ljava/lang/String;

    iput-object v0, p0, Lcom/baidu/location/i;->G:Ljava/lang/String;

    iget-object p1, p1, Lcom/baidu/location/i;->H:Ljava/lang/String;

    iput-object p1, p0, Lcom/baidu/location/i;->H:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()F
    .locals 0

    iget p0, p0, Lcom/baidu/location/i;->x:F

    return p0
.end method

.method public a(I)V
    .locals 0

    if-ltz p1, :cond_0

    iput p1, p0, Lcom/baidu/location/i;->d:I

    :cond_0
    return-void
.end method

.method public a(Lcom/baidu/location/i$b;)V
    .locals 5

    sget-object v0, Lcom/baidu/location/i$c;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v2, 0x0

    const/4 v3, 0x3

    const/4 v4, 0x2

    if-eq v0, v4, :cond_2

    if-eq v0, v3, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    iput v1, p0, Lcom/baidu/location/i;->g:I

    iput-boolean v2, p0, Lcom/baidu/location/i;->c:Z

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Illegal this mode : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    iput v4, p0, Lcom/baidu/location/i;->g:I

    iput-boolean v1, p0, Lcom/baidu/location/i;->c:Z

    goto :goto_0

    :cond_2
    iput-boolean v2, p0, Lcom/baidu/location/i;->c:Z

    iput v3, p0, Lcom/baidu/location/i;->g:I

    goto :goto_0

    :cond_3
    iput-boolean v1, p0, Lcom/baidu/location/i;->c:Z

    iput v1, p0, Lcom/baidu/location/i;->g:I

    :goto_0
    iput-object p1, p0, Lcom/baidu/location/i;->v:Lcom/baidu/location/i$b;

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    const-string v0, "gcj02"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "bd09"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "bd09ll"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iput-object p1, p0, Lcom/baidu/location/i;->a:Ljava/lang/String;

    :cond_1
    return-void
.end method

.method public a(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/location/i;->s:Z

    return-void
.end method

.method public a(Lcom/baidu/location/i;)Z
    .locals 2

    iget-object v0, p0, Lcom/baidu/location/i;->a:Ljava/lang/String;

    iget-object v1, p1, Lcom/baidu/location/i;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/location/i;->b:Ljava/lang/String;

    iget-object v1, p1, Lcom/baidu/location/i;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/baidu/location/i;->c:Z

    iget-boolean v1, p1, Lcom/baidu/location/i;->c:Z

    if-ne v0, v1, :cond_0

    iget v0, p0, Lcom/baidu/location/i;->d:I

    iget v1, p1, Lcom/baidu/location/i;->d:I

    if-ne v0, v1, :cond_0

    iget v0, p0, Lcom/baidu/location/i;->e:I

    iget v1, p1, Lcom/baidu/location/i;->e:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/baidu/location/i;->f:Ljava/lang/String;

    iget-object v1, p1, Lcom/baidu/location/i;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/baidu/location/i;->h:Z

    iget-boolean v1, p1, Lcom/baidu/location/i;->h:Z

    if-ne v0, v1, :cond_0

    iget v0, p0, Lcom/baidu/location/i;->g:I

    iget v1, p1, Lcom/baidu/location/i;->g:I

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/baidu/location/i;->i:Z

    iget-boolean v1, p1, Lcom/baidu/location/i;->i:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/baidu/location/i;->l:Z

    iget-boolean v1, p1, Lcom/baidu/location/i;->l:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/baidu/location/i;->t:Z

    iget-boolean v1, p1, Lcom/baidu/location/i;->t:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/baidu/location/i;->m:Z

    iget-boolean v1, p1, Lcom/baidu/location/i;->m:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/baidu/location/i;->o:Z

    iget-boolean v1, p1, Lcom/baidu/location/i;->o:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/baidu/location/i;->p:Z

    iget-boolean v1, p1, Lcom/baidu/location/i;->p:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/baidu/location/i;->q:Z

    iget-boolean v1, p1, Lcom/baidu/location/i;->q:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/baidu/location/i;->r:Z

    iget-boolean v1, p1, Lcom/baidu/location/i;->r:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/baidu/location/i;->n:Z

    iget-boolean v1, p1, Lcom/baidu/location/i;->n:Z

    if-ne v0, v1, :cond_0

    iget v0, p0, Lcom/baidu/location/i;->w:I

    iget v1, p1, Lcom/baidu/location/i;->w:I

    if-ne v0, v1, :cond_0

    iget v0, p0, Lcom/baidu/location/i;->x:F

    iget v1, p1, Lcom/baidu/location/i;->x:F

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    iget v0, p0, Lcom/baidu/location/i;->y:I

    iget v1, p1, Lcom/baidu/location/i;->y:I

    if-ne v0, v1, :cond_0

    iget v0, p0, Lcom/baidu/location/i;->z:I

    iget v1, p1, Lcom/baidu/location/i;->z:I

    if-ne v0, v1, :cond_0

    iget v0, p0, Lcom/baidu/location/i;->A:I

    iget v1, p1, Lcom/baidu/location/i;->A:I

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/baidu/location/i;->u:Z

    iget-boolean v1, p1, Lcom/baidu/location/i;->u:Z

    if-ne v0, v1, :cond_0

    iget v0, p0, Lcom/baidu/location/i;->B:I

    iget v1, p1, Lcom/baidu/location/i;->B:I

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/baidu/location/i;->C:Z

    iget-boolean v1, p1, Lcom/baidu/location/i;->C:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/baidu/location/i;->s:Z

    iget-boolean v1, p1, Lcom/baidu/location/i;->s:Z

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/baidu/location/i;->v:Lcom/baidu/location/i$b;

    iget-object v1, p1, Lcom/baidu/location/i;->v:Lcom/baidu/location/i$b;

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/baidu/location/i;->j:Z

    iget-boolean v1, p1, Lcom/baidu/location/i;->j:Z

    if-ne v0, v1, :cond_0

    iget-object p0, p0, Lcom/baidu/location/i;->D:Lcom/baidu/location/i$a;

    iget-object p1, p1, Lcom/baidu/location/i;->D:Lcom/baidu/location/i$a;

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public b()I
    .locals 0

    iget p0, p0, Lcom/baidu/location/i;->w:I

    return p0
.end method

.method public b(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/location/i;->h:Z

    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/baidu/location/i;->b:Ljava/lang/String;

    return-object p0
.end method

.method public c(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/location/i;->c:Z

    return-void
.end method

.method public d()I
    .locals 0

    iget p0, p0, Lcom/baidu/location/i;->z:I

    return p0
.end method

.method public e()I
    .locals 0

    iget p0, p0, Lcom/baidu/location/i;->y:I

    return p0
.end method

.method public f()Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/baidu/location/i;->a:Ljava/lang/String;

    return-object p0
.end method

.method public g()I
    .locals 0

    iget p0, p0, Lcom/baidu/location/i;->d:I

    return p0
.end method

.method public h()Z
    .locals 0

    iget-boolean p0, p0, Lcom/baidu/location/i;->i:Z

    return p0
.end method

.method public i()Z
    .locals 0

    iget-boolean p0, p0, Lcom/baidu/location/i;->u:Z

    return p0
.end method
