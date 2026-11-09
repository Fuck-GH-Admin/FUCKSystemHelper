.class public Landroid/support/constraint/e$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/constraint/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field a:I

.field public final b:Landroid/support/constraint/e$d;

.field public final c:Landroid/support/constraint/e$c;

.field public final d:Landroid/support/constraint/e$b;

.field public final e:Landroid/support/constraint/e$e;

.field public f:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Landroid/support/constraint/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/support/constraint/e$d;

    invoke-direct {v0}, Landroid/support/constraint/e$d;-><init>()V

    iput-object v0, p0, Landroid/support/constraint/e$a;->b:Landroid/support/constraint/e$d;

    new-instance v0, Landroid/support/constraint/e$c;

    invoke-direct {v0}, Landroid/support/constraint/e$c;-><init>()V

    iput-object v0, p0, Landroid/support/constraint/e$a;->c:Landroid/support/constraint/e$c;

    new-instance v0, Landroid/support/constraint/e$b;

    invoke-direct {v0}, Landroid/support/constraint/e$b;-><init>()V

    iput-object v0, p0, Landroid/support/constraint/e$a;->d:Landroid/support/constraint/e$b;

    new-instance v0, Landroid/support/constraint/e$e;

    invoke-direct {v0}, Landroid/support/constraint/e$e;-><init>()V

    iput-object v0, p0, Landroid/support/constraint/e$a;->e:Landroid/support/constraint/e$e;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroid/support/constraint/e$a;->f:Ljava/util/HashMap;

    return-void
.end method

.method private a(ILandroid/support/constraint/ConstraintLayout$b;)V
    .locals 2

    iput p1, p0, Landroid/support/constraint/e$a;->a:I

    iget-object p1, p0, Landroid/support/constraint/e$a;->d:Landroid/support/constraint/e$b;

    iget v0, p2, Landroid/support/constraint/ConstraintLayout$b;->d:I

    iput v0, p1, Landroid/support/constraint/e$b;->h:I

    iget v0, p2, Landroid/support/constraint/ConstraintLayout$b;->e:I

    iput v0, p1, Landroid/support/constraint/e$b;->i:I

    iget v0, p2, Landroid/support/constraint/ConstraintLayout$b;->f:I

    iput v0, p1, Landroid/support/constraint/e$b;->j:I

    iget v0, p2, Landroid/support/constraint/ConstraintLayout$b;->g:I

    iput v0, p1, Landroid/support/constraint/e$b;->k:I

    iget v0, p2, Landroid/support/constraint/ConstraintLayout$b;->h:I

    iput v0, p1, Landroid/support/constraint/e$b;->l:I

    iget v0, p2, Landroid/support/constraint/ConstraintLayout$b;->i:I

    iput v0, p1, Landroid/support/constraint/e$b;->m:I

    iget v0, p2, Landroid/support/constraint/ConstraintLayout$b;->j:I

    iput v0, p1, Landroid/support/constraint/e$b;->n:I

    iget v0, p2, Landroid/support/constraint/ConstraintLayout$b;->k:I

    iput v0, p1, Landroid/support/constraint/e$b;->o:I

    iget v0, p2, Landroid/support/constraint/ConstraintLayout$b;->l:I

    iput v0, p1, Landroid/support/constraint/e$b;->p:I

    iget v0, p2, Landroid/support/constraint/ConstraintLayout$b;->p:I

    iput v0, p1, Landroid/support/constraint/e$b;->q:I

    iget v0, p2, Landroid/support/constraint/ConstraintLayout$b;->q:I

    iput v0, p1, Landroid/support/constraint/e$b;->r:I

    iget v0, p2, Landroid/support/constraint/ConstraintLayout$b;->r:I

    iput v0, p1, Landroid/support/constraint/e$b;->s:I

    iget v0, p2, Landroid/support/constraint/ConstraintLayout$b;->s:I

    iput v0, p1, Landroid/support/constraint/e$b;->t:I

    iget v0, p2, Landroid/support/constraint/ConstraintLayout$b;->z:F

    iput v0, p1, Landroid/support/constraint/e$b;->u:F

    iget v0, p2, Landroid/support/constraint/ConstraintLayout$b;->A:F

    iput v0, p1, Landroid/support/constraint/e$b;->v:F

    iget-object v0, p2, Landroid/support/constraint/ConstraintLayout$b;->B:Ljava/lang/String;

    iput-object v0, p1, Landroid/support/constraint/e$b;->w:Ljava/lang/String;

    iget v0, p2, Landroid/support/constraint/ConstraintLayout$b;->m:I

    iput v0, p1, Landroid/support/constraint/e$b;->x:I

    iget v0, p2, Landroid/support/constraint/ConstraintLayout$b;->n:I

    iput v0, p1, Landroid/support/constraint/e$b;->y:I

    iget v0, p2, Landroid/support/constraint/ConstraintLayout$b;->o:F

    iput v0, p1, Landroid/support/constraint/e$b;->z:F

    iget v0, p2, Landroid/support/constraint/ConstraintLayout$b;->P:I

    iput v0, p1, Landroid/support/constraint/e$b;->A:I

    iget v0, p2, Landroid/support/constraint/ConstraintLayout$b;->Q:I

    iput v0, p1, Landroid/support/constraint/e$b;->B:I

    iget v0, p2, Landroid/support/constraint/ConstraintLayout$b;->R:I

    iput v0, p1, Landroid/support/constraint/e$b;->C:I

    iget v0, p2, Landroid/support/constraint/ConstraintLayout$b;->c:F

    iput v0, p1, Landroid/support/constraint/e$b;->g:F

    iget v0, p2, Landroid/support/constraint/ConstraintLayout$b;->a:I

    iput v0, p1, Landroid/support/constraint/e$b;->e:I

    iget v0, p2, Landroid/support/constraint/ConstraintLayout$b;->b:I

    iput v0, p1, Landroid/support/constraint/e$b;->f:I

    iget v0, p2, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    iput v0, p1, Landroid/support/constraint/e$b;->c:I

    iget v0, p2, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    iput v0, p1, Landroid/support/constraint/e$b;->d:I

    iget v0, p2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iput v0, p1, Landroid/support/constraint/e$b;->D:I

    iget v0, p2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iput v0, p1, Landroid/support/constraint/e$b;->E:I

    iget v0, p2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iput v0, p1, Landroid/support/constraint/e$b;->F:I

    iget v0, p2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iput v0, p1, Landroid/support/constraint/e$b;->G:I

    iget v0, p2, Landroid/support/constraint/ConstraintLayout$b;->E:F

    iput v0, p1, Landroid/support/constraint/e$b;->P:F

    iget v0, p2, Landroid/support/constraint/ConstraintLayout$b;->D:F

    iput v0, p1, Landroid/support/constraint/e$b;->Q:F

    iget v0, p2, Landroid/support/constraint/ConstraintLayout$b;->G:I

    iput v0, p1, Landroid/support/constraint/e$b;->S:I

    iget v0, p2, Landroid/support/constraint/ConstraintLayout$b;->F:I

    iput v0, p1, Landroid/support/constraint/e$b;->R:I

    iget-boolean v0, p2, Landroid/support/constraint/ConstraintLayout$b;->S:Z

    iput-boolean v0, p1, Landroid/support/constraint/e$b;->h0:Z

    iget-boolean v0, p2, Landroid/support/constraint/ConstraintLayout$b;->T:Z

    iput-boolean v0, p1, Landroid/support/constraint/e$b;->i0:Z

    iget v0, p2, Landroid/support/constraint/ConstraintLayout$b;->H:I

    iput v0, p1, Landroid/support/constraint/e$b;->T:I

    iget v0, p2, Landroid/support/constraint/ConstraintLayout$b;->I:I

    iput v0, p1, Landroid/support/constraint/e$b;->U:I

    iget v0, p2, Landroid/support/constraint/ConstraintLayout$b;->L:I

    iput v0, p1, Landroid/support/constraint/e$b;->V:I

    iget v0, p2, Landroid/support/constraint/ConstraintLayout$b;->M:I

    iput v0, p1, Landroid/support/constraint/e$b;->W:I

    iget v0, p2, Landroid/support/constraint/ConstraintLayout$b;->J:I

    iput v0, p1, Landroid/support/constraint/e$b;->X:I

    iget v0, p2, Landroid/support/constraint/ConstraintLayout$b;->K:I

    iput v0, p1, Landroid/support/constraint/e$b;->Y:I

    iget v0, p2, Landroid/support/constraint/ConstraintLayout$b;->N:F

    iput v0, p1, Landroid/support/constraint/e$b;->Z:F

    iget v0, p2, Landroid/support/constraint/ConstraintLayout$b;->O:F

    iput v0, p1, Landroid/support/constraint/e$b;->a0:F

    iget-object v0, p2, Landroid/support/constraint/ConstraintLayout$b;->U:Ljava/lang/String;

    iput-object v0, p1, Landroid/support/constraint/e$b;->g0:Ljava/lang/String;

    iget v0, p2, Landroid/support/constraint/ConstraintLayout$b;->u:I

    iput v0, p1, Landroid/support/constraint/e$b;->K:I

    iget v0, p2, Landroid/support/constraint/ConstraintLayout$b;->w:I

    iput v0, p1, Landroid/support/constraint/e$b;->M:I

    iget v0, p2, Landroid/support/constraint/ConstraintLayout$b;->t:I

    iput v0, p1, Landroid/support/constraint/e$b;->J:I

    iget v0, p2, Landroid/support/constraint/ConstraintLayout$b;->v:I

    iput v0, p1, Landroid/support/constraint/e$b;->L:I

    iget v0, p2, Landroid/support/constraint/ConstraintLayout$b;->x:I

    iput v0, p1, Landroid/support/constraint/e$b;->O:I

    iget v0, p2, Landroid/support/constraint/ConstraintLayout$b;->y:I

    iput v0, p1, Landroid/support/constraint/e$b;->N:I

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_0

    invoke-virtual {p2}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginEnd()I

    move-result v0

    iput v0, p1, Landroid/support/constraint/e$b;->H:I

    iget-object p0, p0, Landroid/support/constraint/e$a;->d:Landroid/support/constraint/e$b;

    invoke-virtual {p2}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginStart()I

    move-result p1

    iput p1, p0, Landroid/support/constraint/e$b;->I:I

    :cond_0
    return-void
.end method

.method private a(ILandroid/support/constraint/f$a;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Landroid/support/constraint/e$a;->a(ILandroid/support/constraint/ConstraintLayout$b;)V

    iget-object p1, p0, Landroid/support/constraint/e$a;->b:Landroid/support/constraint/e$d;

    iget v0, p2, Landroid/support/constraint/f$a;->o0:F

    iput v0, p1, Landroid/support/constraint/e$d;->d:F

    iget-object p0, p0, Landroid/support/constraint/e$a;->e:Landroid/support/constraint/e$e;

    iget p1, p2, Landroid/support/constraint/f$a;->r0:F

    iput p1, p0, Landroid/support/constraint/e$e;->b:F

    iget p1, p2, Landroid/support/constraint/f$a;->s0:F

    iput p1, p0, Landroid/support/constraint/e$e;->c:F

    iget p1, p2, Landroid/support/constraint/f$a;->t0:F

    iput p1, p0, Landroid/support/constraint/e$e;->d:F

    iget p1, p2, Landroid/support/constraint/f$a;->u0:F

    iput p1, p0, Landroid/support/constraint/e$e;->e:F

    iget p1, p2, Landroid/support/constraint/f$a;->v0:F

    iput p1, p0, Landroid/support/constraint/e$e;->f:F

    iget p1, p2, Landroid/support/constraint/f$a;->w0:F

    iput p1, p0, Landroid/support/constraint/e$e;->g:F

    iget p1, p2, Landroid/support/constraint/f$a;->x0:F

    iput p1, p0, Landroid/support/constraint/e$e;->h:F

    iget p1, p2, Landroid/support/constraint/f$a;->y0:F

    iput p1, p0, Landroid/support/constraint/e$e;->i:F

    iget p1, p2, Landroid/support/constraint/f$a;->z0:F

    iput p1, p0, Landroid/support/constraint/e$e;->j:F

    iget p1, p2, Landroid/support/constraint/f$a;->A0:F

    iput p1, p0, Landroid/support/constraint/e$e;->k:F

    iget p1, p2, Landroid/support/constraint/f$a;->q0:F

    iput p1, p0, Landroid/support/constraint/e$e;->m:F

    iget-boolean p1, p2, Landroid/support/constraint/f$a;->p0:Z

    iput-boolean p1, p0, Landroid/support/constraint/e$e;->l:Z

    return-void
.end method

.method private a(Landroid/support/constraint/c;ILandroid/support/constraint/f$a;)V
    .locals 0

    invoke-direct {p0, p2, p3}, Landroid/support/constraint/e$a;->a(ILandroid/support/constraint/f$a;)V

    instance-of p2, p1, Landroid/support/constraint/a;

    if-eqz p2, :cond_0

    iget-object p2, p0, Landroid/support/constraint/e$a;->d:Landroid/support/constraint/e$b;

    const/4 p3, 0x1

    iput p3, p2, Landroid/support/constraint/e$b;->d0:I

    check-cast p1, Landroid/support/constraint/a;

    invoke-virtual {p1}, Landroid/support/constraint/a;->getType()I

    move-result p3

    iput p3, p2, Landroid/support/constraint/e$b;->b0:I

    iget-object p2, p0, Landroid/support/constraint/e$a;->d:Landroid/support/constraint/e$b;

    invoke-virtual {p1}, Landroid/support/constraint/c;->getReferencedIds()[I

    move-result-object p3

    iput-object p3, p2, Landroid/support/constraint/e$b;->e0:[I

    iget-object p0, p0, Landroid/support/constraint/e$a;->d:Landroid/support/constraint/e$b;

    invoke-virtual {p1}, Landroid/support/constraint/a;->getMargin()I

    move-result p1

    iput p1, p0, Landroid/support/constraint/e$b;->c0:I

    :cond_0
    return-void
.end method

.method static synthetic a(Landroid/support/constraint/e$a;ILandroid/support/constraint/ConstraintLayout$b;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroid/support/constraint/e$a;->a(ILandroid/support/constraint/ConstraintLayout$b;)V

    return-void
.end method

.method static synthetic a(Landroid/support/constraint/e$a;ILandroid/support/constraint/f$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroid/support/constraint/e$a;->a(ILandroid/support/constraint/f$a;)V

    return-void
.end method

.method static synthetic a(Landroid/support/constraint/e$a;Landroid/support/constraint/c;ILandroid/support/constraint/f$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroid/support/constraint/e$a;->a(Landroid/support/constraint/c;ILandroid/support/constraint/f$a;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/support/constraint/ConstraintLayout$b;)V
    .locals 2

    iget-object v0, p0, Landroid/support/constraint/e$a;->d:Landroid/support/constraint/e$b;

    iget v1, v0, Landroid/support/constraint/e$b;->h:I

    iput v1, p1, Landroid/support/constraint/ConstraintLayout$b;->d:I

    iget v1, v0, Landroid/support/constraint/e$b;->i:I

    iput v1, p1, Landroid/support/constraint/ConstraintLayout$b;->e:I

    iget v1, v0, Landroid/support/constraint/e$b;->j:I

    iput v1, p1, Landroid/support/constraint/ConstraintLayout$b;->f:I

    iget v1, v0, Landroid/support/constraint/e$b;->k:I

    iput v1, p1, Landroid/support/constraint/ConstraintLayout$b;->g:I

    iget v1, v0, Landroid/support/constraint/e$b;->l:I

    iput v1, p1, Landroid/support/constraint/ConstraintLayout$b;->h:I

    iget v1, v0, Landroid/support/constraint/e$b;->m:I

    iput v1, p1, Landroid/support/constraint/ConstraintLayout$b;->i:I

    iget v1, v0, Landroid/support/constraint/e$b;->n:I

    iput v1, p1, Landroid/support/constraint/ConstraintLayout$b;->j:I

    iget v1, v0, Landroid/support/constraint/e$b;->o:I

    iput v1, p1, Landroid/support/constraint/ConstraintLayout$b;->k:I

    iget v1, v0, Landroid/support/constraint/e$b;->p:I

    iput v1, p1, Landroid/support/constraint/ConstraintLayout$b;->l:I

    iget v1, v0, Landroid/support/constraint/e$b;->q:I

    iput v1, p1, Landroid/support/constraint/ConstraintLayout$b;->p:I

    iget v1, v0, Landroid/support/constraint/e$b;->r:I

    iput v1, p1, Landroid/support/constraint/ConstraintLayout$b;->q:I

    iget v1, v0, Landroid/support/constraint/e$b;->s:I

    iput v1, p1, Landroid/support/constraint/ConstraintLayout$b;->r:I

    iget v1, v0, Landroid/support/constraint/e$b;->t:I

    iput v1, p1, Landroid/support/constraint/ConstraintLayout$b;->s:I

    iget v1, v0, Landroid/support/constraint/e$b;->D:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v1, v0, Landroid/support/constraint/e$b;->E:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iget v1, v0, Landroid/support/constraint/e$b;->F:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v1, v0, Landroid/support/constraint/e$b;->G:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget v1, v0, Landroid/support/constraint/e$b;->O:I

    iput v1, p1, Landroid/support/constraint/ConstraintLayout$b;->x:I

    iget v1, v0, Landroid/support/constraint/e$b;->N:I

    iput v1, p1, Landroid/support/constraint/ConstraintLayout$b;->y:I

    iget v1, v0, Landroid/support/constraint/e$b;->K:I

    iput v1, p1, Landroid/support/constraint/ConstraintLayout$b;->u:I

    iget v1, v0, Landroid/support/constraint/e$b;->M:I

    iput v1, p1, Landroid/support/constraint/ConstraintLayout$b;->w:I

    iget v1, v0, Landroid/support/constraint/e$b;->u:F

    iput v1, p1, Landroid/support/constraint/ConstraintLayout$b;->z:F

    iget v1, v0, Landroid/support/constraint/e$b;->v:F

    iput v1, p1, Landroid/support/constraint/ConstraintLayout$b;->A:F

    iget v1, v0, Landroid/support/constraint/e$b;->x:I

    iput v1, p1, Landroid/support/constraint/ConstraintLayout$b;->m:I

    iget v1, v0, Landroid/support/constraint/e$b;->y:I

    iput v1, p1, Landroid/support/constraint/ConstraintLayout$b;->n:I

    iget v1, v0, Landroid/support/constraint/e$b;->z:F

    iput v1, p1, Landroid/support/constraint/ConstraintLayout$b;->o:F

    iget-object v1, v0, Landroid/support/constraint/e$b;->w:Ljava/lang/String;

    iput-object v1, p1, Landroid/support/constraint/ConstraintLayout$b;->B:Ljava/lang/String;

    iget v1, v0, Landroid/support/constraint/e$b;->A:I

    iput v1, p1, Landroid/support/constraint/ConstraintLayout$b;->P:I

    iget v1, v0, Landroid/support/constraint/e$b;->B:I

    iput v1, p1, Landroid/support/constraint/ConstraintLayout$b;->Q:I

    iget v1, v0, Landroid/support/constraint/e$b;->P:F

    iput v1, p1, Landroid/support/constraint/ConstraintLayout$b;->E:F

    iget v1, v0, Landroid/support/constraint/e$b;->Q:F

    iput v1, p1, Landroid/support/constraint/ConstraintLayout$b;->D:F

    iget v1, v0, Landroid/support/constraint/e$b;->S:I

    iput v1, p1, Landroid/support/constraint/ConstraintLayout$b;->G:I

    iget v1, v0, Landroid/support/constraint/e$b;->R:I

    iput v1, p1, Landroid/support/constraint/ConstraintLayout$b;->F:I

    iget-boolean v1, v0, Landroid/support/constraint/e$b;->h0:Z

    iput-boolean v1, p1, Landroid/support/constraint/ConstraintLayout$b;->S:Z

    iget-boolean v1, v0, Landroid/support/constraint/e$b;->i0:Z

    iput-boolean v1, p1, Landroid/support/constraint/ConstraintLayout$b;->T:Z

    iget v1, v0, Landroid/support/constraint/e$b;->T:I

    iput v1, p1, Landroid/support/constraint/ConstraintLayout$b;->H:I

    iget v1, v0, Landroid/support/constraint/e$b;->U:I

    iput v1, p1, Landroid/support/constraint/ConstraintLayout$b;->I:I

    iget v1, v0, Landroid/support/constraint/e$b;->V:I

    iput v1, p1, Landroid/support/constraint/ConstraintLayout$b;->L:I

    iget v1, v0, Landroid/support/constraint/e$b;->W:I

    iput v1, p1, Landroid/support/constraint/ConstraintLayout$b;->M:I

    iget v1, v0, Landroid/support/constraint/e$b;->X:I

    iput v1, p1, Landroid/support/constraint/ConstraintLayout$b;->J:I

    iget v1, v0, Landroid/support/constraint/e$b;->Y:I

    iput v1, p1, Landroid/support/constraint/ConstraintLayout$b;->K:I

    iget v1, v0, Landroid/support/constraint/e$b;->Z:F

    iput v1, p1, Landroid/support/constraint/ConstraintLayout$b;->N:F

    iget v1, v0, Landroid/support/constraint/e$b;->a0:F

    iput v1, p1, Landroid/support/constraint/ConstraintLayout$b;->O:F

    iget v1, v0, Landroid/support/constraint/e$b;->C:I

    iput v1, p1, Landroid/support/constraint/ConstraintLayout$b;->R:I

    iget v1, v0, Landroid/support/constraint/e$b;->g:F

    iput v1, p1, Landroid/support/constraint/ConstraintLayout$b;->c:F

    iget v1, v0, Landroid/support/constraint/e$b;->e:I

    iput v1, p1, Landroid/support/constraint/ConstraintLayout$b;->a:I

    iget v1, v0, Landroid/support/constraint/e$b;->f:I

    iput v1, p1, Landroid/support/constraint/ConstraintLayout$b;->b:I

    iget v1, v0, Landroid/support/constraint/e$b;->c:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    iget v1, v0, Landroid/support/constraint/e$b;->d:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    iget-object v0, v0, Landroid/support/constraint/e$b;->g0:Ljava/lang/String;

    if-eqz v0, :cond_0

    iput-object v0, p1, Landroid/support/constraint/ConstraintLayout$b;->U:Ljava/lang/String;

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Landroid/support/constraint/e$a;->d:Landroid/support/constraint/e$b;

    iget v0, v0, Landroid/support/constraint/e$b;->I:I

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    iget-object p0, p0, Landroid/support/constraint/e$a;->d:Landroid/support/constraint/e$b;

    iget p0, p0, Landroid/support/constraint/e$b;->H:I

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    :cond_1
    invoke-virtual {p1}, Landroid/support/constraint/ConstraintLayout$b;->a()V

    return-void
.end method

.method public clone()Landroid/support/constraint/e$a;
    .locals 3

    new-instance v0, Landroid/support/constraint/e$a;

    invoke-direct {v0}, Landroid/support/constraint/e$a;-><init>()V

    iget-object v1, v0, Landroid/support/constraint/e$a;->d:Landroid/support/constraint/e$b;

    iget-object v2, p0, Landroid/support/constraint/e$a;->d:Landroid/support/constraint/e$b;

    invoke-virtual {v1, v2}, Landroid/support/constraint/e$b;->a(Landroid/support/constraint/e$b;)V

    iget-object v1, v0, Landroid/support/constraint/e$a;->c:Landroid/support/constraint/e$c;

    iget-object v2, p0, Landroid/support/constraint/e$a;->c:Landroid/support/constraint/e$c;

    invoke-virtual {v1, v2}, Landroid/support/constraint/e$c;->a(Landroid/support/constraint/e$c;)V

    iget-object v1, v0, Landroid/support/constraint/e$a;->b:Landroid/support/constraint/e$d;

    iget-object v2, p0, Landroid/support/constraint/e$a;->b:Landroid/support/constraint/e$d;

    invoke-virtual {v1, v2}, Landroid/support/constraint/e$d;->a(Landroid/support/constraint/e$d;)V

    iget-object v1, v0, Landroid/support/constraint/e$a;->e:Landroid/support/constraint/e$e;

    iget-object v2, p0, Landroid/support/constraint/e$a;->e:Landroid/support/constraint/e$e;

    invoke-virtual {v1, v2}, Landroid/support/constraint/e$e;->a(Landroid/support/constraint/e$e;)V

    iget p0, p0, Landroid/support/constraint/e$a;->a:I

    iput p0, v0, Landroid/support/constraint/e$a;->a:I

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0}, Landroid/support/constraint/e$a;->clone()Landroid/support/constraint/e$a;

    move-result-object p0

    return-object p0
.end method
