.class public Landroid/support/constraint/ConstraintLayout;
.super Landroid/view/ViewGroup;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/constraint/ConstraintLayout$b;,
        Landroid/support/constraint/ConstraintLayout$c;
    }
.end annotation


# instance fields
.field b:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/support/constraint/c;",
            ">;"
        }
    .end annotation
.end field

.field protected d:Landroid/support/constraint/n/k/f;

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field protected i:Z

.field private j:I

.field private k:Landroid/support/constraint/e;

.field protected l:Landroid/support/constraint/d;

.field private m:I

.field private n:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private o:I

.field private p:I

.field private q:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroid/support/constraint/n/k/e;",
            ">;"
        }
    .end annotation
.end field

.field r:Landroid/support/constraint/ConstraintLayout$c;

.field private s:I

.field private t:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Landroid/support/constraint/ConstraintLayout;->b:Landroid/util/SparseArray;

    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Landroid/support/constraint/ConstraintLayout;->c:Ljava/util/ArrayList;

    new-instance p1, Landroid/support/constraint/n/k/f;

    invoke-direct {p1}, Landroid/support/constraint/n/k/f;-><init>()V

    iput-object p1, p0, Landroid/support/constraint/ConstraintLayout;->d:Landroid/support/constraint/n/k/f;

    const/4 p1, 0x0

    iput p1, p0, Landroid/support/constraint/ConstraintLayout;->e:I

    iput p1, p0, Landroid/support/constraint/ConstraintLayout;->f:I

    const v0, 0x7fffffff

    iput v0, p0, Landroid/support/constraint/ConstraintLayout;->g:I

    iput v0, p0, Landroid/support/constraint/ConstraintLayout;->h:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/constraint/ConstraintLayout;->i:Z

    const/16 v0, 0x101

    iput v0, p0, Landroid/support/constraint/ConstraintLayout;->j:I

    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/constraint/ConstraintLayout;->k:Landroid/support/constraint/e;

    iput-object v0, p0, Landroid/support/constraint/ConstraintLayout;->l:Landroid/support/constraint/d;

    const/4 v1, -0x1

    iput v1, p0, Landroid/support/constraint/ConstraintLayout;->m:I

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, p0, Landroid/support/constraint/ConstraintLayout;->n:Ljava/util/HashMap;

    iput v1, p0, Landroid/support/constraint/ConstraintLayout;->o:I

    iput v1, p0, Landroid/support/constraint/ConstraintLayout;->p:I

    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    iput-object v1, p0, Landroid/support/constraint/ConstraintLayout;->q:Landroid/util/SparseArray;

    new-instance v1, Landroid/support/constraint/ConstraintLayout$c;

    invoke-direct {v1, p0, p0}, Landroid/support/constraint/ConstraintLayout$c;-><init>(Landroid/support/constraint/ConstraintLayout;Landroid/support/constraint/ConstraintLayout;)V

    iput-object v1, p0, Landroid/support/constraint/ConstraintLayout;->r:Landroid/support/constraint/ConstraintLayout$c;

    iput p1, p0, Landroid/support/constraint/ConstraintLayout;->s:I

    iput p1, p0, Landroid/support/constraint/ConstraintLayout;->t:I

    invoke-direct {p0, v0, p1, p1}, Landroid/support/constraint/ConstraintLayout;->a(Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Landroid/support/constraint/ConstraintLayout;->b:Landroid/util/SparseArray;

    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Landroid/support/constraint/ConstraintLayout;->c:Ljava/util/ArrayList;

    new-instance p1, Landroid/support/constraint/n/k/f;

    invoke-direct {p1}, Landroid/support/constraint/n/k/f;-><init>()V

    iput-object p1, p0, Landroid/support/constraint/ConstraintLayout;->d:Landroid/support/constraint/n/k/f;

    const/4 p1, 0x0

    iput p1, p0, Landroid/support/constraint/ConstraintLayout;->e:I

    iput p1, p0, Landroid/support/constraint/ConstraintLayout;->f:I

    const v0, 0x7fffffff

    iput v0, p0, Landroid/support/constraint/ConstraintLayout;->g:I

    iput v0, p0, Landroid/support/constraint/ConstraintLayout;->h:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/constraint/ConstraintLayout;->i:Z

    const/16 v0, 0x101

    iput v0, p0, Landroid/support/constraint/ConstraintLayout;->j:I

    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/constraint/ConstraintLayout;->k:Landroid/support/constraint/e;

    iput-object v0, p0, Landroid/support/constraint/ConstraintLayout;->l:Landroid/support/constraint/d;

    const/4 v0, -0x1

    iput v0, p0, Landroid/support/constraint/ConstraintLayout;->m:I

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Landroid/support/constraint/ConstraintLayout;->n:Ljava/util/HashMap;

    iput v0, p0, Landroid/support/constraint/ConstraintLayout;->o:I

    iput v0, p0, Landroid/support/constraint/ConstraintLayout;->p:I

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Landroid/support/constraint/ConstraintLayout;->q:Landroid/util/SparseArray;

    new-instance v0, Landroid/support/constraint/ConstraintLayout$c;

    invoke-direct {v0, p0, p0}, Landroid/support/constraint/ConstraintLayout$c;-><init>(Landroid/support/constraint/ConstraintLayout;Landroid/support/constraint/ConstraintLayout;)V

    iput-object v0, p0, Landroid/support/constraint/ConstraintLayout;->r:Landroid/support/constraint/ConstraintLayout$c;

    iput p1, p0, Landroid/support/constraint/ConstraintLayout;->s:I

    iput p1, p0, Landroid/support/constraint/ConstraintLayout;->t:I

    invoke-direct {p0, p2, p1, p1}, Landroid/support/constraint/ConstraintLayout;->a(Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Landroid/support/constraint/ConstraintLayout;->b:Landroid/util/SparseArray;

    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Landroid/support/constraint/ConstraintLayout;->c:Ljava/util/ArrayList;

    new-instance p1, Landroid/support/constraint/n/k/f;

    invoke-direct {p1}, Landroid/support/constraint/n/k/f;-><init>()V

    iput-object p1, p0, Landroid/support/constraint/ConstraintLayout;->d:Landroid/support/constraint/n/k/f;

    const/4 p1, 0x0

    iput p1, p0, Landroid/support/constraint/ConstraintLayout;->e:I

    iput p1, p0, Landroid/support/constraint/ConstraintLayout;->f:I

    const v0, 0x7fffffff

    iput v0, p0, Landroid/support/constraint/ConstraintLayout;->g:I

    iput v0, p0, Landroid/support/constraint/ConstraintLayout;->h:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/constraint/ConstraintLayout;->i:Z

    const/16 v0, 0x101

    iput v0, p0, Landroid/support/constraint/ConstraintLayout;->j:I

    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/constraint/ConstraintLayout;->k:Landroid/support/constraint/e;

    iput-object v0, p0, Landroid/support/constraint/ConstraintLayout;->l:Landroid/support/constraint/d;

    const/4 v0, -0x1

    iput v0, p0, Landroid/support/constraint/ConstraintLayout;->m:I

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Landroid/support/constraint/ConstraintLayout;->n:Ljava/util/HashMap;

    iput v0, p0, Landroid/support/constraint/ConstraintLayout;->o:I

    iput v0, p0, Landroid/support/constraint/ConstraintLayout;->p:I

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Landroid/support/constraint/ConstraintLayout;->q:Landroid/util/SparseArray;

    new-instance v0, Landroid/support/constraint/ConstraintLayout$c;

    invoke-direct {v0, p0, p0}, Landroid/support/constraint/ConstraintLayout$c;-><init>(Landroid/support/constraint/ConstraintLayout;Landroid/support/constraint/ConstraintLayout;)V

    iput-object v0, p0, Landroid/support/constraint/ConstraintLayout;->r:Landroid/support/constraint/ConstraintLayout$c;

    iput p1, p0, Landroid/support/constraint/ConstraintLayout;->s:I

    iput p1, p0, Landroid/support/constraint/ConstraintLayout;->t:I

    invoke-direct {p0, p2, p3, p1}, Landroid/support/constraint/ConstraintLayout;->a(Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    invoke-direct {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Landroid/support/constraint/ConstraintLayout;->b:Landroid/util/SparseArray;

    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Landroid/support/constraint/ConstraintLayout;->c:Ljava/util/ArrayList;

    new-instance p1, Landroid/support/constraint/n/k/f;

    invoke-direct {p1}, Landroid/support/constraint/n/k/f;-><init>()V

    iput-object p1, p0, Landroid/support/constraint/ConstraintLayout;->d:Landroid/support/constraint/n/k/f;

    const/4 p1, 0x0

    iput p1, p0, Landroid/support/constraint/ConstraintLayout;->e:I

    iput p1, p0, Landroid/support/constraint/ConstraintLayout;->f:I

    const v0, 0x7fffffff

    iput v0, p0, Landroid/support/constraint/ConstraintLayout;->g:I

    iput v0, p0, Landroid/support/constraint/ConstraintLayout;->h:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/constraint/ConstraintLayout;->i:Z

    const/16 v0, 0x101

    iput v0, p0, Landroid/support/constraint/ConstraintLayout;->j:I

    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/constraint/ConstraintLayout;->k:Landroid/support/constraint/e;

    iput-object v0, p0, Landroid/support/constraint/ConstraintLayout;->l:Landroid/support/constraint/d;

    const/4 v0, -0x1

    iput v0, p0, Landroid/support/constraint/ConstraintLayout;->m:I

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Landroid/support/constraint/ConstraintLayout;->n:Ljava/util/HashMap;

    iput v0, p0, Landroid/support/constraint/ConstraintLayout;->o:I

    iput v0, p0, Landroid/support/constraint/ConstraintLayout;->p:I

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Landroid/support/constraint/ConstraintLayout;->q:Landroid/util/SparseArray;

    new-instance v0, Landroid/support/constraint/ConstraintLayout$c;

    invoke-direct {v0, p0, p0}, Landroid/support/constraint/ConstraintLayout$c;-><init>(Landroid/support/constraint/ConstraintLayout;Landroid/support/constraint/ConstraintLayout;)V

    iput-object v0, p0, Landroid/support/constraint/ConstraintLayout;->r:Landroid/support/constraint/ConstraintLayout$c;

    iput p1, p0, Landroid/support/constraint/ConstraintLayout;->s:I

    iput p1, p0, Landroid/support/constraint/ConstraintLayout;->t:I

    invoke-direct {p0, p2, p3, p4}, Landroid/support/constraint/ConstraintLayout;->a(Landroid/util/AttributeSet;II)V

    return-void
.end method

.method static synthetic a(Landroid/support/constraint/ConstraintLayout;)I
    .locals 0

    iget p0, p0, Landroid/support/constraint/ConstraintLayout;->j:I

    return p0
.end method

.method private a(Landroid/util/AttributeSet;II)V
    .locals 5

    iget-object v0, p0, Landroid/support/constraint/ConstraintLayout;->d:Landroid/support/constraint/n/k/f;

    invoke-virtual {v0, p0}, Landroid/support/constraint/n/k/e;->a(Ljava/lang/Object;)V

    iget-object v0, p0, Landroid/support/constraint/ConstraintLayout;->d:Landroid/support/constraint/n/k/f;

    iget-object v1, p0, Landroid/support/constraint/ConstraintLayout;->r:Landroid/support/constraint/ConstraintLayout$c;

    invoke-virtual {v0, v1}, Landroid/support/constraint/n/k/f;->a(Landroid/support/constraint/n/k/m/b$b;)V

    iget-object v0, p0, Landroid/support/constraint/ConstraintLayout;->b:Landroid/util/SparseArray;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getId()I

    move-result v1

    invoke-virtual {v0, v1, p0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/constraint/ConstraintLayout;->k:Landroid/support/constraint/e;

    if-eqz p1, :cond_8

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Landroid/support/constraint/k;->ConstraintLayout_Layout:[I

    invoke-virtual {v1, p1, v2, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result p2

    const/4 p3, 0x0

    move v1, p3

    :goto_0
    if-ge v1, p2, :cond_7

    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v2

    sget v3, Landroid/support/constraint/k;->ConstraintLayout_Layout_android_minWidth:I

    if-ne v2, v3, :cond_0

    iget v3, p0, Landroid/support/constraint/ConstraintLayout;->e:I

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v2

    iput v2, p0, Landroid/support/constraint/ConstraintLayout;->e:I

    goto :goto_2

    :cond_0
    sget v3, Landroid/support/constraint/k;->ConstraintLayout_Layout_android_minHeight:I

    if-ne v2, v3, :cond_1

    iget v3, p0, Landroid/support/constraint/ConstraintLayout;->f:I

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v2

    iput v2, p0, Landroid/support/constraint/ConstraintLayout;->f:I

    goto :goto_2

    :cond_1
    sget v3, Landroid/support/constraint/k;->ConstraintLayout_Layout_android_maxWidth:I

    if-ne v2, v3, :cond_2

    iget v3, p0, Landroid/support/constraint/ConstraintLayout;->g:I

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v2

    iput v2, p0, Landroid/support/constraint/ConstraintLayout;->g:I

    goto :goto_2

    :cond_2
    sget v3, Landroid/support/constraint/k;->ConstraintLayout_Layout_android_maxHeight:I

    if-ne v2, v3, :cond_3

    iget v3, p0, Landroid/support/constraint/ConstraintLayout;->h:I

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v2

    iput v2, p0, Landroid/support/constraint/ConstraintLayout;->h:I

    goto :goto_2

    :cond_3
    sget v3, Landroid/support/constraint/k;->ConstraintLayout_Layout_layout_optimizationLevel:I

    if-ne v2, v3, :cond_4

    iget v3, p0, Landroid/support/constraint/ConstraintLayout;->j:I

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, p0, Landroid/support/constraint/ConstraintLayout;->j:I

    goto :goto_2

    :cond_4
    sget v3, Landroid/support/constraint/k;->ConstraintLayout_Layout_layoutDescription:I

    if-ne v2, v3, :cond_5

    invoke-virtual {p1, v2, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    if-eqz v2, :cond_6

    :try_start_0
    invoke-virtual {p0, v2}, Landroid/support/constraint/ConstraintLayout;->b(I)V
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    iput-object v0, p0, Landroid/support/constraint/ConstraintLayout;->l:Landroid/support/constraint/d;

    goto :goto_2

    :cond_5
    sget v3, Landroid/support/constraint/k;->ConstraintLayout_Layout_constraintSet:I

    if-ne v2, v3, :cond_6

    invoke-virtual {p1, v2, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    :try_start_1
    new-instance v3, Landroid/support/constraint/e;

    invoke-direct {v3}, Landroid/support/constraint/e;-><init>()V

    iput-object v3, p0, Landroid/support/constraint/ConstraintLayout;->k:Landroid/support/constraint/e;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v3, v4, v2}, Landroid/support/constraint/e;->b(Landroid/content/Context;I)V
    :try_end_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    iput-object v0, p0, Landroid/support/constraint/ConstraintLayout;->k:Landroid/support/constraint/e;

    :goto_1
    iput v2, p0, Landroid/support/constraint/ConstraintLayout;->m:I

    :cond_6
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_7
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_8
    iget-object p1, p0, Landroid/support/constraint/ConstraintLayout;->d:Landroid/support/constraint/n/k/f;

    iget p0, p0, Landroid/support/constraint/ConstraintLayout;->j:I

    invoke-virtual {p1, p0}, Landroid/support/constraint/n/k/f;->x(I)V

    return-void
.end method

.method static synthetic b(Landroid/support/constraint/ConstraintLayout;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Landroid/support/constraint/ConstraintLayout;->c:Ljava/util/ArrayList;

    return-object p0
.end method

.method private b()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/constraint/ConstraintLayout;->i:Z

    const/4 v0, -0x1

    iput v0, p0, Landroid/support/constraint/ConstraintLayout;->o:I

    iput v0, p0, Landroid/support/constraint/ConstraintLayout;->p:I

    return-void
.end method

.method private final c(I)Landroid/support/constraint/n/k/e;
    .locals 1

    if-nez p1, :cond_0

    iget-object p0, p0, Landroid/support/constraint/ConstraintLayout;->d:Landroid/support/constraint/n/k/f;

    return-object p0

    :cond_0
    iget-object v0, p0, Landroid/support/constraint/ConstraintLayout;->b:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    if-eq v0, p0, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-ne p1, p0, :cond_1

    invoke-virtual {p0, v0}, Landroid/support/constraint/ConstraintLayout;->onViewAdded(Landroid/view/View;)V

    :cond_1
    if-ne v0, p0, :cond_2

    iget-object p0, p0, Landroid/support/constraint/ConstraintLayout;->d:Landroid/support/constraint/n/k/f;

    return-object p0

    :cond_2
    if-nez v0, :cond_3

    const/4 p0, 0x0

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    check-cast p0, Landroid/support/constraint/ConstraintLayout$b;

    iget-object p0, p0, Landroid/support/constraint/ConstraintLayout$b;->m0:Landroid/support/constraint/n/k/e;

    :goto_0
    return-object p0
.end method

.method private c()V
    .locals 9

    invoke-virtual {p0}, Landroid/view/ViewGroup;->isInEditMode()Z

    move-result v6

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v7

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v7, :cond_1

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/support/constraint/ConstraintLayout;->a(Landroid/view/View;)Landroid/support/constraint/n/k/e;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v2}, Landroid/support/constraint/n/k/e;->P()V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, -0x1

    if-eqz v6, :cond_3

    move v2, v0

    :goto_2
    if-ge v2, v7, :cond_3

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    :try_start_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v3}, Landroid/view/View;->getId()I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Landroid/view/View;->getId()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {p0, v0, v4, v5}, Landroid/support/constraint/ConstraintLayout;->a(ILjava/lang/Object;Ljava/lang/Object;)V

    const/16 v5, 0x2f

    invoke-virtual {v4, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    if-eq v5, v1, :cond_2

    add-int/lit8 v5, v5, 0x1

    invoke-virtual {v4, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    :cond_2
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    move-result v3

    invoke-direct {p0, v3}, Landroid/support/constraint/ConstraintLayout;->c(I)Landroid/support/constraint/n/k/e;

    move-result-object v3

    invoke-virtual {v3, v4}, Landroid/support/constraint/n/k/e;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    iget v2, p0, Landroid/support/constraint/ConstraintLayout;->m:I

    if-eq v2, v1, :cond_5

    move v1, v0

    :goto_3
    if-ge v1, v7, :cond_5

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v3

    iget v4, p0, Landroid/support/constraint/ConstraintLayout;->m:I

    if-ne v3, v4, :cond_4

    instance-of v3, v2, Landroid/support/constraint/f;

    if-eqz v3, :cond_4

    check-cast v2, Landroid/support/constraint/f;

    invoke-virtual {v2}, Landroid/support/constraint/f;->getConstraintSet()Landroid/support/constraint/e;

    move-result-object v2

    iput-object v2, p0, Landroid/support/constraint/ConstraintLayout;->k:Landroid/support/constraint/e;

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_5
    iget-object v1, p0, Landroid/support/constraint/ConstraintLayout;->k:Landroid/support/constraint/e;

    if-eqz v1, :cond_6

    const/4 v2, 0x1

    invoke-virtual {v1, p0, v2}, Landroid/support/constraint/e;->a(Landroid/support/constraint/ConstraintLayout;Z)V

    :cond_6
    iget-object v1, p0, Landroid/support/constraint/ConstraintLayout;->d:Landroid/support/constraint/n/k/f;

    invoke-virtual {v1}, Landroid/support/constraint/n/k/l;->T()V

    iget-object v1, p0, Landroid/support/constraint/ConstraintLayout;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_7

    move v2, v0

    :goto_4
    if-ge v2, v1, :cond_7

    iget-object v3, p0, Landroid/support/constraint/ConstraintLayout;->c:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/support/constraint/c;

    invoke-virtual {v3, p0}, Landroid/support/constraint/c;->e(Landroid/support/constraint/ConstraintLayout;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_7
    move v1, v0

    :goto_5
    if-ge v1, v7, :cond_9

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    instance-of v3, v2, Landroid/support/constraint/i;

    if-eqz v3, :cond_8

    check-cast v2, Landroid/support/constraint/i;

    invoke-virtual {v2, p0}, Landroid/support/constraint/i;->b(Landroid/support/constraint/ConstraintLayout;)V

    :cond_8
    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_9
    iget-object v1, p0, Landroid/support/constraint/ConstraintLayout;->q:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->clear()V

    iget-object v1, p0, Landroid/support/constraint/ConstraintLayout;->q:Landroid/util/SparseArray;

    iget-object v2, p0, Landroid/support/constraint/ConstraintLayout;->d:Landroid/support/constraint/n/k/f;

    invoke-virtual {v1, v0, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iget-object v1, p0, Landroid/support/constraint/ConstraintLayout;->q:Landroid/util/SparseArray;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getId()I

    move-result v2

    iget-object v3, p0, Landroid/support/constraint/ConstraintLayout;->d:Landroid/support/constraint/n/k/f;

    invoke-virtual {v1, v2, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move v1, v0

    :goto_6
    if-ge v1, v7, :cond_a

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/support/constraint/ConstraintLayout;->a(Landroid/view/View;)Landroid/support/constraint/n/k/e;

    move-result-object v3

    iget-object v4, p0, Landroid/support/constraint/ConstraintLayout;->q:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v2

    invoke-virtual {v4, v2, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_a
    move v8, v0

    :goto_7
    if-ge v8, v7, :cond_c

    invoke-virtual {p0, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/support/constraint/ConstraintLayout;->a(Landroid/view/View;)Landroid/support/constraint/n/k/e;

    move-result-object v3

    if-nez v3, :cond_b

    goto :goto_8

    :cond_b
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/support/constraint/ConstraintLayout$b;

    iget-object v0, p0, Landroid/support/constraint/ConstraintLayout;->d:Landroid/support/constraint/n/k/f;

    invoke-virtual {v0, v3}, Landroid/support/constraint/n/k/l;->a(Landroid/support/constraint/n/k/e;)V

    iget-object v5, p0, Landroid/support/constraint/ConstraintLayout;->q:Landroid/util/SparseArray;

    move-object v0, p0

    move v1, v6

    invoke-virtual/range {v0 .. v5}, Landroid/support/constraint/ConstraintLayout;->a(ZLandroid/view/View;Landroid/support/constraint/n/k/e;Landroid/support/constraint/ConstraintLayout$b;Landroid/util/SparseArray;)V

    :goto_8
    add-int/lit8 v8, v8, 0x1

    goto :goto_7

    :cond_c
    return-void
.end method

.method private d()Z
    .locals 4

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->isLayoutRequested()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v1, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    if-eqz v1, :cond_2

    invoke-direct {p0}, Landroid/support/constraint/ConstraintLayout;->c()V

    :cond_2
    return v1
.end method

.method private getPaddingWidth()I
    .locals 4

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    add-int/2addr v0, v2

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x11

    if-lt v2, v3, :cond_0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingStart()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingEnd()I

    move-result p0

    invoke-static {v1, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    add-int v1, v2, p0

    :cond_0
    if-lez v1, :cond_1

    move v0, v1

    :cond_1
    return v0
.end method


# virtual methods
.method public final a(Landroid/view/View;)Landroid/support/constraint/n/k/e;
    .locals 0

    if-ne p1, p0, :cond_0

    iget-object p0, p0, Landroid/support/constraint/ConstraintLayout;->d:Landroid/support/constraint/n/k/f;

    return-object p0

    :cond_0
    if-nez p1, :cond_1

    const/4 p0, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    check-cast p0, Landroid/support/constraint/ConstraintLayout$b;

    iget-object p0, p0, Landroid/support/constraint/ConstraintLayout$b;->m0:Landroid/support/constraint/n/k/e;

    :goto_0
    return-object p0
.end method

.method public a(I)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Landroid/support/constraint/ConstraintLayout;->b:Landroid/util/SparseArray;

    invoke-virtual {p0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/View;

    return-object p0
.end method

.method public a(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-nez p1, :cond_0

    instance-of p1, p2, Ljava/lang/String;

    if-eqz p1, :cond_0

    check-cast p2, Ljava/lang/String;

    iget-object p1, p0, Landroid/support/constraint/ConstraintLayout;->n:Ljava/util/HashMap;

    if-eqz p1, :cond_0

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p0, p0, Landroid/support/constraint/ConstraintLayout;->n:Ljava/util/HashMap;

    invoke-virtual {p0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method protected a(IIIIZZ)V
    .locals 2

    iget-object v0, p0, Landroid/support/constraint/ConstraintLayout;->r:Landroid/support/constraint/ConstraintLayout$c;

    iget v1, v0, Landroid/support/constraint/ConstraintLayout$c;->e:I

    iget v0, v0, Landroid/support/constraint/ConstraintLayout$c;->d:I

    add-int/2addr p3, v0

    add-int/2addr p4, v1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_2

    const/4 v0, 0x0

    invoke-static {p3, p1, v0}, Landroid/view/ViewGroup;->resolveSizeAndState(III)I

    move-result p1

    invoke-static {p4, p2, v0}, Landroid/view/ViewGroup;->resolveSizeAndState(III)I

    move-result p2

    const p3, 0xffffff

    and-int/2addr p1, p3

    and-int/2addr p2, p3

    iget p3, p0, Landroid/support/constraint/ConstraintLayout;->g:I

    invoke-static {p3, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    iget p3, p0, Landroid/support/constraint/ConstraintLayout;->h:I

    invoke-static {p3, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    const/high16 p3, 0x1000000

    if-eqz p5, :cond_0

    or-int/2addr p1, p3

    :cond_0
    if-eqz p6, :cond_1

    or-int/2addr p2, p3

    :cond_1
    invoke-virtual {p0, p1, p2}, Landroid/view/ViewGroup;->setMeasuredDimension(II)V

    iput p1, p0, Landroid/support/constraint/ConstraintLayout;->o:I

    iput p2, p0, Landroid/support/constraint/ConstraintLayout;->p:I

    goto :goto_0

    :cond_2
    invoke-virtual {p0, p3, p4}, Landroid/view/ViewGroup;->setMeasuredDimension(II)V

    iput p3, p0, Landroid/support/constraint/ConstraintLayout;->o:I

    iput p4, p0, Landroid/support/constraint/ConstraintLayout;->p:I

    :goto_0
    return-void
.end method

.method public a(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    if-nez p1, :cond_2

    instance-of p1, p2, Ljava/lang/String;

    if-eqz p1, :cond_2

    instance-of p1, p3, Ljava/lang/Integer;

    if-eqz p1, :cond_2

    iget-object p1, p0, Landroid/support/constraint/ConstraintLayout;->n:Ljava/util/HashMap;

    if-nez p1, :cond_0

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Landroid/support/constraint/ConstraintLayout;->n:Ljava/util/HashMap;

    :cond_0
    check-cast p2, Ljava/lang/String;

    const-string p1, "/"

    invoke-virtual {p2, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_1

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p2, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p2

    :cond_1
    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object p0, p0, Landroid/support/constraint/ConstraintLayout;->n:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method

.method protected a(Landroid/support/constraint/n/k/f;III)V
    .locals 17

    move-object/from16 v6, p0

    invoke-static/range {p3 .. p3}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v7

    invoke-static/range {p3 .. p3}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    invoke-static/range {p4 .. p4}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v8

    invoke-static/range {p4 .. p4}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v2

    const/4 v3, 0x0

    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v16

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v2

    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v13

    add-int v2, v16, v13

    invoke-direct/range {p0 .. p0}, Landroid/support/constraint/ConstraintLayout;->getPaddingWidth()I

    move-result v4

    iget-object v9, v6, Landroid/support/constraint/ConstraintLayout;->r:Landroid/support/constraint/ConstraintLayout$c;

    move/from16 v10, p3

    move/from16 v11, p4

    move/from16 v12, v16

    move v14, v4

    move v15, v2

    invoke-virtual/range {v9 .. v15}, Landroid/support/constraint/ConstraintLayout$c;->a(IIIIII)V

    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v9, 0x11

    if-lt v5, v9, :cond_3

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingStart()I

    move-result v5

    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingEnd()I

    move-result v9

    invoke-static {v3, v9}, Ljava/lang/Math;->max(II)I

    move-result v9

    if-gtz v5, :cond_1

    if-lez v9, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v5

    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual/range {p0 .. p0}, Landroid/support/constraint/ConstraintLayout;->a()Z

    move-result v3

    if-eqz v3, :cond_2

    move v5, v9

    :cond_2
    :goto_1
    move v9, v5

    goto :goto_2

    :cond_3
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v5

    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    move-result v3

    move v9, v3

    :goto_2
    sub-int v10, v0, v4

    sub-int v11, v1, v2

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v7

    move v3, v10

    move v4, v8

    move v5, v11

    invoke-virtual/range {v0 .. v5}, Landroid/support/constraint/ConstraintLayout;->a(Landroid/support/constraint/n/k/f;IIII)V

    iget v12, v6, Landroid/support/constraint/ConstraintLayout;->o:I

    iget v13, v6, Landroid/support/constraint/ConstraintLayout;->p:I

    move-object/from16 v0, p1

    move/from16 v1, p2

    move v6, v12

    move v7, v13

    move v8, v9

    move/from16 v9, v16

    invoke-virtual/range {v0 .. v9}, Landroid/support/constraint/n/k/f;->a(IIIIIIIII)J

    return-void
.end method

.method protected a(Landroid/support/constraint/n/k/f;IIII)V
    .locals 7

    iget-object v0, p0, Landroid/support/constraint/ConstraintLayout;->r:Landroid/support/constraint/ConstraintLayout$c;

    iget v1, v0, Landroid/support/constraint/ConstraintLayout$c;->e:I

    iget v0, v0, Landroid/support/constraint/ConstraintLayout$c;->d:I

    sget-object v2, Landroid/support/constraint/n/k/e$b;->b:Landroid/support/constraint/n/k/e$b;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    const/high16 v4, 0x40000000    # 2.0f

    const/high16 v5, -0x80000000

    const/4 v6, 0x0

    if-eq p2, v5, :cond_3

    if-eqz p2, :cond_2

    if-eq p2, v4, :cond_1

    move-object p2, v2

    :cond_0
    move p3, v6

    goto :goto_1

    :cond_1
    iget p2, p0, Landroid/support/constraint/ConstraintLayout;->g:I

    sub-int/2addr p2, v0

    invoke-static {p2, p3}, Ljava/lang/Math;->min(II)I

    move-result p3

    move-object p2, v2

    goto :goto_1

    :cond_2
    sget-object p2, Landroid/support/constraint/n/k/e$b;->c:Landroid/support/constraint/n/k/e$b;

    if-nez v3, :cond_0

    goto :goto_0

    :cond_3
    sget-object p2, Landroid/support/constraint/n/k/e$b;->c:Landroid/support/constraint/n/k/e$b;

    if-nez v3, :cond_4

    :goto_0
    iget p3, p0, Landroid/support/constraint/ConstraintLayout;->e:I

    invoke-static {v6, p3}, Ljava/lang/Math;->max(II)I

    move-result p3

    :cond_4
    :goto_1
    if-eq p4, v5, :cond_8

    if-eqz p4, :cond_7

    if-eq p4, v4, :cond_6

    :cond_5
    move p5, v6

    goto :goto_3

    :cond_6
    iget p4, p0, Landroid/support/constraint/ConstraintLayout;->h:I

    sub-int/2addr p4, v1

    invoke-static {p4, p5}, Ljava/lang/Math;->min(II)I

    move-result p5

    goto :goto_3

    :cond_7
    sget-object v2, Landroid/support/constraint/n/k/e$b;->c:Landroid/support/constraint/n/k/e$b;

    if-nez v3, :cond_5

    goto :goto_2

    :cond_8
    sget-object v2, Landroid/support/constraint/n/k/e$b;->c:Landroid/support/constraint/n/k/e$b;

    if-nez v3, :cond_9

    :goto_2
    iget p4, p0, Landroid/support/constraint/ConstraintLayout;->f:I

    invoke-static {v6, p4}, Ljava/lang/Math;->max(II)I

    move-result p5

    :cond_9
    :goto_3
    invoke-virtual {p1}, Landroid/support/constraint/n/k/e;->C()I

    move-result p4

    if-ne p3, p4, :cond_a

    invoke-virtual {p1}, Landroid/support/constraint/n/k/e;->k()I

    move-result p4

    if-eq p5, p4, :cond_b

    :cond_a
    invoke-virtual {p1}, Landroid/support/constraint/n/k/f;->Y()V

    :cond_b
    invoke-virtual {p1, v6}, Landroid/support/constraint/n/k/e;->u(I)V

    invoke-virtual {p1, v6}, Landroid/support/constraint/n/k/e;->v(I)V

    iget p4, p0, Landroid/support/constraint/ConstraintLayout;->g:I

    sub-int/2addr p4, v0

    invoke-virtual {p1, p4}, Landroid/support/constraint/n/k/e;->o(I)V

    iget p4, p0, Landroid/support/constraint/ConstraintLayout;->h:I

    sub-int/2addr p4, v1

    invoke-virtual {p1, p4}, Landroid/support/constraint/n/k/e;->n(I)V

    invoke-virtual {p1, v6}, Landroid/support/constraint/n/k/e;->q(I)V

    invoke-virtual {p1, v6}, Landroid/support/constraint/n/k/e;->p(I)V

    invoke-virtual {p1, p2}, Landroid/support/constraint/n/k/e;->a(Landroid/support/constraint/n/k/e$b;)V

    invoke-virtual {p1, p3}, Landroid/support/constraint/n/k/e;->t(I)V

    invoke-virtual {p1, v2}, Landroid/support/constraint/n/k/e;->b(Landroid/support/constraint/n/k/e$b;)V

    invoke-virtual {p1, p5}, Landroid/support/constraint/n/k/e;->l(I)V

    iget p2, p0, Landroid/support/constraint/ConstraintLayout;->e:I

    sub-int/2addr p2, v0

    invoke-virtual {p1, p2}, Landroid/support/constraint/n/k/e;->q(I)V

    iget p0, p0, Landroid/support/constraint/ConstraintLayout;->f:I

    sub-int/2addr p0, v1

    invoke-virtual {p1, p0}, Landroid/support/constraint/n/k/e;->p(I)V

    return-void
.end method

.method protected a(ZLandroid/view/View;Landroid/support/constraint/n/k/e;Landroid/support/constraint/ConstraintLayout$b;Landroid/util/SparseArray;)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Landroid/view/View;",
            "Landroid/support/constraint/n/k/e;",
            "Landroid/support/constraint/ConstraintLayout$b;",
            "Landroid/util/SparseArray<",
            "Landroid/support/constraint/n/k/e;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v7, p3

    move-object/from16 v8, p4

    move-object/from16 v9, p5

    invoke-virtual/range {p4 .. p4}, Landroid/support/constraint/ConstraintLayout$b;->a()V

    const/4 v10, 0x0

    iput-boolean v10, v8, Landroid/support/constraint/ConstraintLayout$b;->n0:Z

    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getVisibility()I

    move-result v2

    invoke-virtual {v7, v2}, Landroid/support/constraint/n/k/e;->s(I)V

    iget-boolean v2, v8, Landroid/support/constraint/ConstraintLayout$b;->a0:Z

    const/4 v11, 0x1

    if-eqz v2, :cond_0

    invoke-virtual {v7, v11}, Landroid/support/constraint/n/k/e;->b(Z)V

    const/16 v2, 0x8

    invoke-virtual {v7, v2}, Landroid/support/constraint/n/k/e;->s(I)V

    :cond_0
    invoke-virtual {v7, v1}, Landroid/support/constraint/n/k/e;->a(Ljava/lang/Object;)V

    instance-of v2, v1, Landroid/support/constraint/c;

    if-eqz v2, :cond_1

    check-cast v1, Landroid/support/constraint/c;

    iget-object v2, v0, Landroid/support/constraint/ConstraintLayout;->d:Landroid/support/constraint/n/k/f;

    invoke-virtual {v2}, Landroid/support/constraint/n/k/f;->a0()Z

    move-result v2

    invoke-virtual {v1, v7, v2}, Landroid/support/constraint/c;->a(Landroid/support/constraint/n/k/e;Z)V

    :cond_1
    iget-boolean v1, v8, Landroid/support/constraint/ConstraintLayout$b;->Y:Z

    const/16 v2, 0x11

    const/4 v12, -0x1

    if-eqz v1, :cond_5

    move-object v0, v7

    check-cast v0, Landroid/support/constraint/n/k/g;

    iget v1, v8, Landroid/support/constraint/ConstraintLayout$b;->j0:I

    iget v3, v8, Landroid/support/constraint/ConstraintLayout$b;->k0:I

    iget v4, v8, Landroid/support/constraint/ConstraintLayout$b;->l0:F

    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v5, v2, :cond_2

    iget v1, v8, Landroid/support/constraint/ConstraintLayout$b;->a:I

    iget v3, v8, Landroid/support/constraint/ConstraintLayout$b;->b:I

    iget v4, v8, Landroid/support/constraint/ConstraintLayout$b;->c:F

    :cond_2
    const/high16 v2, -0x40800000    # -1.0f

    cmpl-float v2, v4, v2

    if-eqz v2, :cond_3

    invoke-virtual {v0, v4}, Landroid/support/constraint/n/k/g;->e(F)V

    goto/16 :goto_e

    :cond_3
    if-eq v1, v12, :cond_4

    invoke-virtual {v0, v1}, Landroid/support/constraint/n/k/g;->x(I)V

    goto/16 :goto_e

    :cond_4
    if-eq v3, v12, :cond_22

    invoke-virtual {v0, v3}, Landroid/support/constraint/n/k/g;->y(I)V

    goto/16 :goto_e

    :cond_5
    iget v1, v8, Landroid/support/constraint/ConstraintLayout$b;->c0:I

    iget v3, v8, Landroid/support/constraint/ConstraintLayout$b;->d0:I

    iget v4, v8, Landroid/support/constraint/ConstraintLayout$b;->e0:I

    iget v5, v8, Landroid/support/constraint/ConstraintLayout$b;->f0:I

    iget v6, v8, Landroid/support/constraint/ConstraintLayout$b;->g0:I

    iget v13, v8, Landroid/support/constraint/ConstraintLayout$b;->h0:I

    iget v14, v8, Landroid/support/constraint/ConstraintLayout$b;->i0:F

    sget v15, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v15, v2, :cond_a

    iget v1, v8, Landroid/support/constraint/ConstraintLayout$b;->d:I

    iget v2, v8, Landroid/support/constraint/ConstraintLayout$b;->e:I

    iget v4, v8, Landroid/support/constraint/ConstraintLayout$b;->f:I

    iget v5, v8, Landroid/support/constraint/ConstraintLayout$b;->g:I

    iget v3, v8, Landroid/support/constraint/ConstraintLayout$b;->t:I

    iget v6, v8, Landroid/support/constraint/ConstraintLayout$b;->v:I

    iget v14, v8, Landroid/support/constraint/ConstraintLayout$b;->z:F

    if-ne v1, v12, :cond_7

    if-ne v2, v12, :cond_7

    iget v13, v8, Landroid/support/constraint/ConstraintLayout$b;->q:I

    if-eq v13, v12, :cond_6

    move v1, v13

    goto :goto_0

    :cond_6
    iget v13, v8, Landroid/support/constraint/ConstraintLayout$b;->p:I

    if-eq v13, v12, :cond_7

    move v2, v13

    :cond_7
    :goto_0
    if-ne v4, v12, :cond_9

    if-ne v5, v12, :cond_9

    iget v13, v8, Landroid/support/constraint/ConstraintLayout$b;->r:I

    if-eq v13, v12, :cond_8

    goto :goto_1

    :cond_8
    iget v13, v8, Landroid/support/constraint/ConstraintLayout$b;->s:I

    if-eq v13, v12, :cond_9

    move v15, v6

    move v5, v14

    move v6, v3

    move v14, v13

    move v3, v2

    move v13, v4

    goto :goto_3

    :cond_9
    move v13, v4

    :goto_1
    move v15, v6

    move v6, v3

    move v3, v2

    goto :goto_2

    :cond_a
    move v15, v13

    move v13, v4

    :goto_2
    move/from16 v18, v14

    move v14, v5

    move/from16 v5, v18

    :goto_3
    iget v2, v8, Landroid/support/constraint/ConstraintLayout$b;->m:I

    if-eq v2, v12, :cond_b

    invoke-virtual {v9, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/constraint/n/k/e;

    if-eqz v0, :cond_17

    iget v1, v8, Landroid/support/constraint/ConstraintLayout$b;->o:F

    iget v2, v8, Landroid/support/constraint/ConstraintLayout$b;->n:I

    invoke-virtual {v7, v0, v1, v2}, Landroid/support/constraint/n/k/e;->a(Landroid/support/constraint/n/k/e;FI)V

    goto/16 :goto_9

    :cond_b
    if-eq v1, v12, :cond_d

    invoke-virtual {v9, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Landroid/support/constraint/n/k/e;

    if-eqz v3, :cond_c

    sget-object v4, Landroid/support/constraint/n/k/d$b;->c:Landroid/support/constraint/n/k/d$b;

    iget v2, v8, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    move-object/from16 v1, p3

    move/from16 v16, v2

    move-object v2, v4

    move/from16 v17, v5

    move/from16 v5, v16

    goto :goto_4

    :cond_c
    move/from16 v17, v5

    goto :goto_5

    :cond_d
    move/from16 v17, v5

    if-eq v3, v12, :cond_e

    invoke-virtual {v9, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Landroid/support/constraint/n/k/e;

    if-eqz v3, :cond_e

    sget-object v2, Landroid/support/constraint/n/k/d$b;->c:Landroid/support/constraint/n/k/d$b;

    sget-object v4, Landroid/support/constraint/n/k/d$b;->e:Landroid/support/constraint/n/k/d$b;

    iget v5, v8, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    move-object/from16 v1, p3

    :goto_4
    invoke-virtual/range {v1 .. v6}, Landroid/support/constraint/n/k/e;->a(Landroid/support/constraint/n/k/d$b;Landroid/support/constraint/n/k/e;Landroid/support/constraint/n/k/d$b;II)V

    :cond_e
    :goto_5
    if-eq v13, v12, :cond_f

    invoke-virtual {v9, v13}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Landroid/support/constraint/n/k/e;

    if-eqz v3, :cond_10

    sget-object v2, Landroid/support/constraint/n/k/d$b;->e:Landroid/support/constraint/n/k/d$b;

    sget-object v4, Landroid/support/constraint/n/k/d$b;->c:Landroid/support/constraint/n/k/d$b;

    iget v5, v8, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    move-object/from16 v1, p3

    goto :goto_6

    :cond_f
    if-eq v14, v12, :cond_10

    invoke-virtual {v9, v14}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Landroid/support/constraint/n/k/e;

    if-eqz v3, :cond_10

    sget-object v4, Landroid/support/constraint/n/k/d$b;->e:Landroid/support/constraint/n/k/d$b;

    iget v5, v8, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    move-object/from16 v1, p3

    move-object v2, v4

    :goto_6
    move v6, v15

    invoke-virtual/range {v1 .. v6}, Landroid/support/constraint/n/k/e;->a(Landroid/support/constraint/n/k/d$b;Landroid/support/constraint/n/k/e;Landroid/support/constraint/n/k/d$b;II)V

    :cond_10
    iget v1, v8, Landroid/support/constraint/ConstraintLayout$b;->h:I

    if-eq v1, v12, :cond_11

    invoke-virtual {v9, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Landroid/support/constraint/n/k/e;

    if-eqz v3, :cond_12

    sget-object v4, Landroid/support/constraint/n/k/d$b;->d:Landroid/support/constraint/n/k/d$b;

    iget v5, v8, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v6, v8, Landroid/support/constraint/ConstraintLayout$b;->u:I

    move-object/from16 v1, p3

    move-object v2, v4

    goto :goto_7

    :cond_11
    iget v1, v8, Landroid/support/constraint/ConstraintLayout$b;->i:I

    if-eq v1, v12, :cond_12

    invoke-virtual {v9, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Landroid/support/constraint/n/k/e;

    if-eqz v3, :cond_12

    sget-object v2, Landroid/support/constraint/n/k/d$b;->d:Landroid/support/constraint/n/k/d$b;

    sget-object v4, Landroid/support/constraint/n/k/d$b;->f:Landroid/support/constraint/n/k/d$b;

    iget v5, v8, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v6, v8, Landroid/support/constraint/ConstraintLayout$b;->u:I

    move-object/from16 v1, p3

    :goto_7
    invoke-virtual/range {v1 .. v6}, Landroid/support/constraint/n/k/e;->a(Landroid/support/constraint/n/k/d$b;Landroid/support/constraint/n/k/e;Landroid/support/constraint/n/k/d$b;II)V

    :cond_12
    iget v1, v8, Landroid/support/constraint/ConstraintLayout$b;->j:I

    if-eq v1, v12, :cond_13

    invoke-virtual {v9, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Landroid/support/constraint/n/k/e;

    if-eqz v3, :cond_14

    sget-object v2, Landroid/support/constraint/n/k/d$b;->f:Landroid/support/constraint/n/k/d$b;

    sget-object v4, Landroid/support/constraint/n/k/d$b;->d:Landroid/support/constraint/n/k/d$b;

    iget v5, v8, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget v6, v8, Landroid/support/constraint/ConstraintLayout$b;->w:I

    move-object/from16 v1, p3

    goto :goto_8

    :cond_13
    iget v1, v8, Landroid/support/constraint/ConstraintLayout$b;->k:I

    if-eq v1, v12, :cond_14

    invoke-virtual {v9, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Landroid/support/constraint/n/k/e;

    if-eqz v3, :cond_14

    sget-object v4, Landroid/support/constraint/n/k/d$b;->f:Landroid/support/constraint/n/k/d$b;

    iget v5, v8, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget v6, v8, Landroid/support/constraint/ConstraintLayout$b;->w:I

    move-object/from16 v1, p3

    move-object v2, v4

    :goto_8
    invoke-virtual/range {v1 .. v6}, Landroid/support/constraint/n/k/e;->a(Landroid/support/constraint/n/k/d$b;Landroid/support/constraint/n/k/e;Landroid/support/constraint/n/k/d$b;II)V

    :cond_14
    iget v1, v8, Landroid/support/constraint/ConstraintLayout$b;->l:I

    if-eq v1, v12, :cond_15

    iget-object v0, v0, Landroid/support/constraint/ConstraintLayout;->b:Landroid/util/SparseArray;

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    iget v1, v8, Landroid/support/constraint/ConstraintLayout$b;->l:I

    invoke-virtual {v9, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/constraint/n/k/e;

    if-eqz v1, :cond_15

    if-eqz v0, :cond_15

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    instance-of v2, v2, Landroid/support/constraint/ConstraintLayout$b;

    if-eqz v2, :cond_15

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/constraint/ConstraintLayout$b;

    iput-boolean v11, v8, Landroid/support/constraint/ConstraintLayout$b;->X:Z

    iput-boolean v11, v0, Landroid/support/constraint/ConstraintLayout$b;->X:Z

    sget-object v2, Landroid/support/constraint/n/k/d$b;->g:Landroid/support/constraint/n/k/d$b;

    invoke-virtual {v7, v2}, Landroid/support/constraint/n/k/e;->a(Landroid/support/constraint/n/k/d$b;)Landroid/support/constraint/n/k/d;

    move-result-object v2

    sget-object v3, Landroid/support/constraint/n/k/d$b;->g:Landroid/support/constraint/n/k/d$b;

    invoke-virtual {v1, v3}, Landroid/support/constraint/n/k/e;->a(Landroid/support/constraint/n/k/d$b;)Landroid/support/constraint/n/k/d;

    move-result-object v1

    invoke-virtual {v2, v1, v10, v12, v11}, Landroid/support/constraint/n/k/d;->a(Landroid/support/constraint/n/k/d;IIZ)Z

    invoke-virtual {v7, v11}, Landroid/support/constraint/n/k/e;->a(Z)V

    iget-object v0, v0, Landroid/support/constraint/ConstraintLayout$b;->m0:Landroid/support/constraint/n/k/e;

    invoke-virtual {v0, v11}, Landroid/support/constraint/n/k/e;->a(Z)V

    sget-object v0, Landroid/support/constraint/n/k/d$b;->d:Landroid/support/constraint/n/k/d$b;

    invoke-virtual {v7, v0}, Landroid/support/constraint/n/k/e;->a(Landroid/support/constraint/n/k/d$b;)Landroid/support/constraint/n/k/d;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/constraint/n/k/d;->m()V

    sget-object v0, Landroid/support/constraint/n/k/d$b;->f:Landroid/support/constraint/n/k/d$b;

    invoke-virtual {v7, v0}, Landroid/support/constraint/n/k/e;->a(Landroid/support/constraint/n/k/d$b;)Landroid/support/constraint/n/k/d;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/constraint/n/k/d;->m()V

    :cond_15
    const/4 v0, 0x0

    move/from16 v14, v17

    cmpl-float v1, v14, v0

    if-ltz v1, :cond_16

    invoke-virtual {v7, v14}, Landroid/support/constraint/n/k/e;->a(F)V

    :cond_16
    iget v1, v8, Landroid/support/constraint/ConstraintLayout$b;->A:F

    cmpl-float v0, v1, v0

    if-ltz v0, :cond_17

    invoke-virtual {v7, v1}, Landroid/support/constraint/n/k/e;->c(F)V

    :cond_17
    :goto_9
    if-eqz p1, :cond_19

    iget v0, v8, Landroid/support/constraint/ConstraintLayout$b;->P:I

    if-ne v0, v12, :cond_18

    iget v0, v8, Landroid/support/constraint/ConstraintLayout$b;->Q:I

    if-eq v0, v12, :cond_19

    :cond_18
    iget v0, v8, Landroid/support/constraint/ConstraintLayout$b;->P:I

    iget v1, v8, Landroid/support/constraint/ConstraintLayout$b;->Q:I

    invoke-virtual {v7, v0, v1}, Landroid/support/constraint/n/k/e;->e(II)V

    :cond_19
    iget-boolean v0, v8, Landroid/support/constraint/ConstraintLayout$b;->V:Z

    const/4 v1, -0x2

    if-nez v0, :cond_1c

    iget v0, v8, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    if-ne v0, v12, :cond_1b

    iget-boolean v0, v8, Landroid/support/constraint/ConstraintLayout$b;->S:Z

    if-eqz v0, :cond_1a

    sget-object v0, Landroid/support/constraint/n/k/e$b;->d:Landroid/support/constraint/n/k/e$b;

    goto :goto_a

    :cond_1a
    sget-object v0, Landroid/support/constraint/n/k/e$b;->e:Landroid/support/constraint/n/k/e$b;

    :goto_a
    invoke-virtual {v7, v0}, Landroid/support/constraint/n/k/e;->a(Landroid/support/constraint/n/k/e$b;)V

    sget-object v0, Landroid/support/constraint/n/k/d$b;->c:Landroid/support/constraint/n/k/d$b;

    invoke-virtual {v7, v0}, Landroid/support/constraint/n/k/e;->a(Landroid/support/constraint/n/k/d$b;)Landroid/support/constraint/n/k/d;

    move-result-object v0

    iget v2, v8, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iput v2, v0, Landroid/support/constraint/n/k/d;->g:I

    sget-object v0, Landroid/support/constraint/n/k/d$b;->e:Landroid/support/constraint/n/k/d$b;

    invoke-virtual {v7, v0}, Landroid/support/constraint/n/k/e;->a(Landroid/support/constraint/n/k/d$b;)Landroid/support/constraint/n/k/d;

    move-result-object v0

    iget v2, v8, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iput v2, v0, Landroid/support/constraint/n/k/d;->g:I

    goto :goto_b

    :cond_1b
    sget-object v0, Landroid/support/constraint/n/k/e$b;->d:Landroid/support/constraint/n/k/e$b;

    invoke-virtual {v7, v0}, Landroid/support/constraint/n/k/e;->a(Landroid/support/constraint/n/k/e$b;)V

    invoke-virtual {v7, v10}, Landroid/support/constraint/n/k/e;->t(I)V

    goto :goto_b

    :cond_1c
    sget-object v0, Landroid/support/constraint/n/k/e$b;->b:Landroid/support/constraint/n/k/e$b;

    invoke-virtual {v7, v0}, Landroid/support/constraint/n/k/e;->a(Landroid/support/constraint/n/k/e$b;)V

    iget v0, v8, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-virtual {v7, v0}, Landroid/support/constraint/n/k/e;->t(I)V

    iget v0, v8, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    if-ne v0, v1, :cond_1d

    sget-object v0, Landroid/support/constraint/n/k/e$b;->c:Landroid/support/constraint/n/k/e$b;

    invoke-virtual {v7, v0}, Landroid/support/constraint/n/k/e;->a(Landroid/support/constraint/n/k/e$b;)V

    :cond_1d
    :goto_b
    iget-boolean v0, v8, Landroid/support/constraint/ConstraintLayout$b;->W:Z

    if-nez v0, :cond_20

    iget v0, v8, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    if-ne v0, v12, :cond_1f

    iget-boolean v0, v8, Landroid/support/constraint/ConstraintLayout$b;->T:Z

    if-eqz v0, :cond_1e

    sget-object v0, Landroid/support/constraint/n/k/e$b;->d:Landroid/support/constraint/n/k/e$b;

    goto :goto_c

    :cond_1e
    sget-object v0, Landroid/support/constraint/n/k/e$b;->e:Landroid/support/constraint/n/k/e$b;

    :goto_c
    invoke-virtual {v7, v0}, Landroid/support/constraint/n/k/e;->b(Landroid/support/constraint/n/k/e$b;)V

    sget-object v0, Landroid/support/constraint/n/k/d$b;->d:Landroid/support/constraint/n/k/d$b;

    invoke-virtual {v7, v0}, Landroid/support/constraint/n/k/e;->a(Landroid/support/constraint/n/k/d$b;)Landroid/support/constraint/n/k/d;

    move-result-object v0

    iget v1, v8, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iput v1, v0, Landroid/support/constraint/n/k/d;->g:I

    sget-object v0, Landroid/support/constraint/n/k/d$b;->f:Landroid/support/constraint/n/k/d$b;

    invoke-virtual {v7, v0}, Landroid/support/constraint/n/k/e;->a(Landroid/support/constraint/n/k/d$b;)Landroid/support/constraint/n/k/d;

    move-result-object v0

    iget v1, v8, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iput v1, v0, Landroid/support/constraint/n/k/d;->g:I

    goto :goto_d

    :cond_1f
    sget-object v0, Landroid/support/constraint/n/k/e$b;->d:Landroid/support/constraint/n/k/e$b;

    invoke-virtual {v7, v0}, Landroid/support/constraint/n/k/e;->b(Landroid/support/constraint/n/k/e$b;)V

    invoke-virtual {v7, v10}, Landroid/support/constraint/n/k/e;->l(I)V

    goto :goto_d

    :cond_20
    sget-object v0, Landroid/support/constraint/n/k/e$b;->b:Landroid/support/constraint/n/k/e$b;

    invoke-virtual {v7, v0}, Landroid/support/constraint/n/k/e;->b(Landroid/support/constraint/n/k/e$b;)V

    iget v0, v8, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-virtual {v7, v0}, Landroid/support/constraint/n/k/e;->l(I)V

    iget v0, v8, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    if-ne v0, v1, :cond_21

    sget-object v0, Landroid/support/constraint/n/k/e$b;->c:Landroid/support/constraint/n/k/e$b;

    invoke-virtual {v7, v0}, Landroid/support/constraint/n/k/e;->b(Landroid/support/constraint/n/k/e$b;)V

    :cond_21
    :goto_d
    iget-object v0, v8, Landroid/support/constraint/ConstraintLayout$b;->B:Ljava/lang/String;

    invoke-virtual {v7, v0}, Landroid/support/constraint/n/k/e;->b(Ljava/lang/String;)V

    iget v0, v8, Landroid/support/constraint/ConstraintLayout$b;->D:F

    invoke-virtual {v7, v0}, Landroid/support/constraint/n/k/e;->b(F)V

    iget v0, v8, Landroid/support/constraint/ConstraintLayout$b;->E:F

    invoke-virtual {v7, v0}, Landroid/support/constraint/n/k/e;->d(F)V

    iget v0, v8, Landroid/support/constraint/ConstraintLayout$b;->F:I

    invoke-virtual {v7, v0}, Landroid/support/constraint/n/k/e;->m(I)V

    iget v0, v8, Landroid/support/constraint/ConstraintLayout$b;->G:I

    invoke-virtual {v7, v0}, Landroid/support/constraint/n/k/e;->r(I)V

    iget v0, v8, Landroid/support/constraint/ConstraintLayout$b;->H:I

    iget v1, v8, Landroid/support/constraint/ConstraintLayout$b;->J:I

    iget v2, v8, Landroid/support/constraint/ConstraintLayout$b;->L:I

    iget v3, v8, Landroid/support/constraint/ConstraintLayout$b;->N:F

    invoke-virtual {v7, v0, v1, v2, v3}, Landroid/support/constraint/n/k/e;->a(IIIF)V

    iget v0, v8, Landroid/support/constraint/ConstraintLayout$b;->I:I

    iget v1, v8, Landroid/support/constraint/ConstraintLayout$b;->K:I

    iget v2, v8, Landroid/support/constraint/ConstraintLayout$b;->M:I

    iget v3, v8, Landroid/support/constraint/ConstraintLayout$b;->O:F

    invoke-virtual {v7, v0, v1, v2, v3}, Landroid/support/constraint/n/k/e;->b(IIIF)V

    :cond_22
    :goto_e
    return-void
.end method

.method protected a()Z
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x11

    if-lt v0, v2, :cond_1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    const/high16 v2, 0x400000

    and-int/2addr v0, v2

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getLayoutDirection()I

    move-result p0

    if-ne v2, p0, :cond_1

    move v1, v2

    :cond_1
    return v1
.end method

.method public addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0xe

    if-ge p2, p3, :cond_0

    invoke-virtual {p0, p1}, Landroid/support/constraint/ConstraintLayout;->onViewAdded(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method protected b(I)V
    .locals 2

    new-instance v0, Landroid/support/constraint/d;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p0, p1}, Landroid/support/constraint/d;-><init>(Landroid/content/Context;Landroid/support/constraint/ConstraintLayout;I)V

    iput-object v0, p0, Landroid/support/constraint/ConstraintLayout;->l:Landroid/support/constraint/d;

    return-void
.end method

.method protected checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 0

    instance-of p0, p1, Landroid/support/constraint/ConstraintLayout$b;

    return p0
.end method

.method protected dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 20

    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/constraint/ConstraintLayout;->c:Ljava/util/ArrayList;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    iget-object v4, v0, Landroid/support/constraint/ConstraintLayout;->c:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/support/constraint/c;

    invoke-virtual {v4, v0}, Landroid/support/constraint/c;->d(Landroid/support/constraint/ConstraintLayout;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-super/range {p0 .. p1}, Landroid/view/ViewGroup;->dispatchDraw(Landroid/graphics/Canvas;)V

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->isInEditMode()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getWidth()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v4

    int-to-float v4, v4

    const/high16 v5, 0x44870000    # 1080.0f

    const/high16 v6, 0x44f00000    # 1920.0f

    move v7, v2

    :goto_1
    if-ge v7, v1, :cond_3

    invoke-virtual {v0, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    move-result v9

    const/16 v10, 0x8

    if-ne v9, v10, :cond_1

    goto/16 :goto_2

    :cond_1
    invoke-virtual {v8}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_2

    instance-of v9, v8, Ljava/lang/String;

    if-eqz v9, :cond_2

    check-cast v8, Ljava/lang/String;

    const-string v9, ","

    invoke-virtual {v8, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v8

    array-length v9, v8

    const/4 v10, 0x4

    if-ne v9, v10, :cond_2

    aget-object v9, v8, v2

    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v9

    const/4 v10, 0x1

    aget-object v10, v8, v10

    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v10

    const/4 v11, 0x2

    aget-object v11, v8, v11

    invoke-static {v11}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v11

    const/4 v12, 0x3

    aget-object v8, v8, v12

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    int-to-float v9, v9

    div-float/2addr v9, v5

    mul-float/2addr v9, v3

    float-to-int v9, v9

    int-to-float v10, v10

    div-float/2addr v10, v6

    mul-float/2addr v10, v4

    float-to-int v10, v10

    int-to-float v11, v11

    div-float/2addr v11, v5

    mul-float/2addr v11, v3

    float-to-int v11, v11

    int-to-float v8, v8

    div-float/2addr v8, v6

    mul-float/2addr v8, v4

    float-to-int v8, v8

    new-instance v15, Landroid/graphics/Paint;

    invoke-direct {v15}, Landroid/graphics/Paint;-><init>()V

    const/high16 v12, -0x10000

    invoke-virtual {v15, v12}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v14, v9

    int-to-float v13, v10

    add-int/2addr v9, v11

    int-to-float v9, v9

    move-object/from16 v12, p1

    move v11, v13

    move v13, v14

    move/from16 v18, v14

    move v14, v11

    move-object/from16 v19, v15

    move v15, v9

    move/from16 v16, v11

    move-object/from16 v17, v19

    invoke-virtual/range {v12 .. v17}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    add-int/2addr v10, v8

    int-to-float v8, v10

    move v13, v9

    move/from16 v16, v8

    invoke-virtual/range {v12 .. v17}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move v14, v8

    move/from16 v15, v18

    invoke-virtual/range {v12 .. v17}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move/from16 v13, v18

    move/from16 v16, v11

    invoke-virtual/range {v12 .. v17}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    const v10, -0xff0100

    move-object/from16 v15, v19

    invoke-virtual {v15, v10}, Landroid/graphics/Paint;->setColor(I)V

    move v14, v11

    move-object v10, v15

    move v15, v9

    move/from16 v16, v8

    move-object/from16 v17, v10

    invoke-virtual/range {v12 .. v17}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move v14, v8

    move/from16 v16, v11

    invoke-virtual/range {v12 .. v17}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    :cond_2
    :goto_2
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_1

    :cond_3
    return-void
.end method

.method public forceLayout()V
    .locals 0

    invoke-direct {p0}, Landroid/support/constraint/ConstraintLayout;->b()V

    invoke-super {p0}, Landroid/view/ViewGroup;->forceLayout()V

    return-void
.end method

.method protected generateDefaultLayoutParams()Landroid/support/constraint/ConstraintLayout$b;
    .locals 1

    new-instance p0, Landroid/support/constraint/ConstraintLayout$b;

    const/4 v0, -0x2

    invoke-direct {p0, v0, v0}, Landroid/support/constraint/ConstraintLayout$b;-><init>(II)V

    return-object p0
.end method

.method protected bridge synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    invoke-virtual {p0}, Landroid/support/constraint/ConstraintLayout;->generateDefaultLayoutParams()Landroid/support/constraint/ConstraintLayout$b;

    move-result-object p0

    return-object p0
.end method

.method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/support/constraint/ConstraintLayout$b;
    .locals 1

    new-instance v0, Landroid/support/constraint/ConstraintLayout$b;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-direct {v0, p0, p1}, Landroid/support/constraint/ConstraintLayout$b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public bridge synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    invoke-virtual {p0, p1}, Landroid/support/constraint/ConstraintLayout;->generateLayoutParams(Landroid/util/AttributeSet;)Landroid/support/constraint/ConstraintLayout$b;

    move-result-object p0

    return-object p0
.end method

.method protected generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    new-instance p0, Landroid/support/constraint/ConstraintLayout$b;

    invoke-direct {p0, p1}, Landroid/support/constraint/ConstraintLayout$b;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object p0
.end method

.method public getMaxHeight()I
    .locals 0

    iget p0, p0, Landroid/support/constraint/ConstraintLayout;->h:I

    return p0
.end method

.method public getMaxWidth()I
    .locals 0

    iget p0, p0, Landroid/support/constraint/ConstraintLayout;->g:I

    return p0
.end method

.method public getMinHeight()I
    .locals 0

    iget p0, p0, Landroid/support/constraint/ConstraintLayout;->f:I

    return p0
.end method

.method public getMinWidth()I
    .locals 0

    iget p0, p0, Landroid/support/constraint/ConstraintLayout;->e:I

    return p0
.end method

.method public getOptimizationLevel()I
    .locals 0

    iget-object p0, p0, Landroid/support/constraint/ConstraintLayout;->d:Landroid/support/constraint/n/k/f;

    invoke-virtual {p0}, Landroid/support/constraint/n/k/f;->V()I

    move-result p0

    return p0
.end method

.method protected onLayout(ZIIII)V
    .locals 5

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->isInEditMode()Z

    move-result p2

    const/4 p3, 0x0

    move p4, p3

    :goto_0
    if-ge p4, p1, :cond_3

    invoke-virtual {p0, p4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p5

    invoke-virtual {p5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/constraint/ConstraintLayout$b;

    iget-object v1, v0, Landroid/support/constraint/ConstraintLayout$b;->m0:Landroid/support/constraint/n/k/e;

    invoke-virtual {p5}, Landroid/view/View;->getVisibility()I

    move-result v2

    const/16 v3, 0x8

    if-ne v2, v3, :cond_0

    iget-boolean v2, v0, Landroid/support/constraint/ConstraintLayout$b;->Y:Z

    if-nez v2, :cond_0

    iget-boolean v2, v0, Landroid/support/constraint/ConstraintLayout$b;->Z:Z

    if-nez v2, :cond_0

    iget-boolean v2, v0, Landroid/support/constraint/ConstraintLayout$b;->b0:Z

    if-nez v2, :cond_0

    if-nez p2, :cond_0

    goto :goto_1

    :cond_0
    iget-boolean v0, v0, Landroid/support/constraint/ConstraintLayout$b;->a0:Z

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Landroid/support/constraint/n/k/e;->D()I

    move-result v0

    invoke-virtual {v1}, Landroid/support/constraint/n/k/e;->E()I

    move-result v2

    invoke-virtual {v1}, Landroid/support/constraint/n/k/e;->C()I

    move-result v3

    add-int/2addr v3, v0

    invoke-virtual {v1}, Landroid/support/constraint/n/k/e;->k()I

    move-result v1

    add-int/2addr v1, v2

    invoke-virtual {p5, v0, v2, v3, v1}, Landroid/view/View;->layout(IIII)V

    instance-of v4, p5, Landroid/support/constraint/i;

    if-eqz v4, :cond_2

    check-cast p5, Landroid/support/constraint/i;

    invoke-virtual {p5}, Landroid/support/constraint/i;->getContent()Landroid/view/View;

    move-result-object p5

    if-eqz p5, :cond_2

    invoke-virtual {p5, p3}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p5, v0, v2, v3, v1}, Landroid/view/View;->layout(IIII)V

    :cond_2
    :goto_1
    add-int/lit8 p4, p4, 0x1

    goto :goto_0

    :cond_3
    iget-object p1, p0, Landroid/support/constraint/ConstraintLayout;->c:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_4

    :goto_2
    if-ge p3, p1, :cond_4

    iget-object p2, p0, Landroid/support/constraint/ConstraintLayout;->c:Ljava/util/ArrayList;

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/support/constraint/c;

    invoke-virtual {p2, p0}, Landroid/support/constraint/c;->b(Landroid/support/constraint/ConstraintLayout;)V

    add-int/lit8 p3, p3, 0x1

    goto :goto_2

    :cond_4
    return-void
.end method

.method protected onMeasure(II)V
    .locals 8

    iget-boolean v0, p0, Landroid/support/constraint/ConstraintLayout;->i:Z

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->isLayoutRequested()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/constraint/ConstraintLayout;->i:Z

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    iget-boolean v0, p0, Landroid/support/constraint/ConstraintLayout;->i:Z

    if-nez v0, :cond_3

    iget v0, p0, Landroid/support/constraint/ConstraintLayout;->s:I

    if-ne v0, p1, :cond_2

    iget v0, p0, Landroid/support/constraint/ConstraintLayout;->t:I

    if-ne v0, p2, :cond_2

    :goto_2
    iget-object v0, p0, Landroid/support/constraint/ConstraintLayout;->d:Landroid/support/constraint/n/k/f;

    invoke-virtual {v0}, Landroid/support/constraint/n/k/e;->C()I

    move-result v4

    iget-object v0, p0, Landroid/support/constraint/ConstraintLayout;->d:Landroid/support/constraint/n/k/f;

    invoke-virtual {v0}, Landroid/support/constraint/n/k/e;->k()I

    move-result v5

    iget-object v0, p0, Landroid/support/constraint/ConstraintLayout;->d:Landroid/support/constraint/n/k/f;

    invoke-virtual {v0}, Landroid/support/constraint/n/k/f;->b0()Z

    move-result v6

    iget-object v0, p0, Landroid/support/constraint/ConstraintLayout;->d:Landroid/support/constraint/n/k/f;

    invoke-virtual {v0}, Landroid/support/constraint/n/k/f;->Z()Z

    move-result v7

    move-object v1, p0

    move v2, p1

    move v3, p2

    invoke-virtual/range {v1 .. v7}, Landroid/support/constraint/ConstraintLayout;->a(IIIIZZ)V

    return-void

    :cond_2
    iget v0, p0, Landroid/support/constraint/ConstraintLayout;->s:I

    if-ne v0, p1, :cond_3

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    const/high16 v2, 0x40000000    # 2.0f

    if-ne v0, v2, :cond_3

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    const/high16 v2, -0x80000000

    if-ne v0, v2, :cond_3

    iget v0, p0, Landroid/support/constraint/ConstraintLayout;->t:I

    invoke-static {v0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    if-ne v0, v2, :cond_3

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    iget-object v2, p0, Landroid/support/constraint/ConstraintLayout;->d:Landroid/support/constraint/n/k/f;

    invoke-virtual {v2}, Landroid/support/constraint/n/k/e;->k()I

    move-result v2

    if-lt v0, v2, :cond_3

    iput p1, p0, Landroid/support/constraint/ConstraintLayout;->s:I

    iput p2, p0, Landroid/support/constraint/ConstraintLayout;->t:I

    goto :goto_2

    :cond_3
    iput p1, p0, Landroid/support/constraint/ConstraintLayout;->s:I

    iput p2, p0, Landroid/support/constraint/ConstraintLayout;->t:I

    iget-object v0, p0, Landroid/support/constraint/ConstraintLayout;->d:Landroid/support/constraint/n/k/f;

    invoke-virtual {p0}, Landroid/support/constraint/ConstraintLayout;->a()Z

    move-result v2

    invoke-virtual {v0, v2}, Landroid/support/constraint/n/k/f;->g(Z)V

    iget-boolean v0, p0, Landroid/support/constraint/ConstraintLayout;->i:Z

    if-eqz v0, :cond_4

    iput-boolean v1, p0, Landroid/support/constraint/ConstraintLayout;->i:Z

    invoke-direct {p0}, Landroid/support/constraint/ConstraintLayout;->d()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Landroid/support/constraint/ConstraintLayout;->d:Landroid/support/constraint/n/k/f;

    invoke-virtual {v0}, Landroid/support/constraint/n/k/f;->c0()V

    :cond_4
    iget-object v0, p0, Landroid/support/constraint/ConstraintLayout;->d:Landroid/support/constraint/n/k/f;

    iget v1, p0, Landroid/support/constraint/ConstraintLayout;->j:I

    invoke-virtual {p0, v0, v1, p1, p2}, Landroid/support/constraint/ConstraintLayout;->a(Landroid/support/constraint/n/k/f;III)V

    goto :goto_2
.end method

.method public onViewAdded(Landroid/view/View;)V
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onViewAdded(Landroid/view/View;)V

    :cond_0
    invoke-virtual {p0, p1}, Landroid/support/constraint/ConstraintLayout;->a(Landroid/view/View;)Landroid/support/constraint/n/k/e;

    move-result-object v0

    instance-of v1, p1, Landroid/support/constraint/h;

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    instance-of v0, v0, Landroid/support/constraint/n/k/g;

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/constraint/ConstraintLayout$b;

    new-instance v1, Landroid/support/constraint/n/k/g;

    invoke-direct {v1}, Landroid/support/constraint/n/k/g;-><init>()V

    iput-object v1, v0, Landroid/support/constraint/ConstraintLayout$b;->m0:Landroid/support/constraint/n/k/e;

    iput-boolean v2, v0, Landroid/support/constraint/ConstraintLayout$b;->Y:Z

    check-cast v1, Landroid/support/constraint/n/k/g;

    iget v0, v0, Landroid/support/constraint/ConstraintLayout$b;->R:I

    invoke-virtual {v1, v0}, Landroid/support/constraint/n/k/g;->z(I)V

    :cond_1
    instance-of v0, p1, Landroid/support/constraint/c;

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Landroid/support/constraint/c;

    invoke-virtual {v0}, Landroid/support/constraint/c;->b()V

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/support/constraint/ConstraintLayout$b;

    iput-boolean v2, v1, Landroid/support/constraint/ConstraintLayout$b;->Z:Z

    iget-object v1, p0, Landroid/support/constraint/ConstraintLayout;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Landroid/support/constraint/ConstraintLayout;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    iget-object v0, p0, Landroid/support/constraint/ConstraintLayout;->b:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    invoke-virtual {v0, v1, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iput-boolean v2, p0, Landroid/support/constraint/ConstraintLayout;->i:Z

    return-void
.end method

.method public onViewRemoved(Landroid/view/View;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onViewRemoved(Landroid/view/View;)V

    :cond_0
    iget-object v0, p0, Landroid/support/constraint/ConstraintLayout;->b:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->remove(I)V

    invoke-virtual {p0, p1}, Landroid/support/constraint/ConstraintLayout;->a(Landroid/view/View;)Landroid/support/constraint/n/k/e;

    move-result-object v0

    iget-object v1, p0, Landroid/support/constraint/ConstraintLayout;->d:Landroid/support/constraint/n/k/f;

    invoke-virtual {v1, v0}, Landroid/support/constraint/n/k/l;->c(Landroid/support/constraint/n/k/e;)V

    iget-object v0, p0, Landroid/support/constraint/ConstraintLayout;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroid/support/constraint/ConstraintLayout;->i:Z

    return-void
.end method

.method public removeView(Landroid/view/View;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-ge v0, v1, :cond_0

    invoke-virtual {p0, p1}, Landroid/support/constraint/ConstraintLayout;->onViewRemoved(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public requestLayout()V
    .locals 0

    invoke-direct {p0}, Landroid/support/constraint/ConstraintLayout;->b()V

    invoke-super {p0}, Landroid/view/ViewGroup;->requestLayout()V

    return-void
.end method

.method public setConstraintSet(Landroid/support/constraint/e;)V
    .locals 0

    iput-object p1, p0, Landroid/support/constraint/ConstraintLayout;->k:Landroid/support/constraint/e;

    return-void
.end method

.method public setId(I)V
    .locals 2

    iget-object v0, p0, Landroid/support/constraint/ConstraintLayout;->b:Landroid/util/SparseArray;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->remove(I)V

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setId(I)V

    iget-object p1, p0, Landroid/support/constraint/ConstraintLayout;->b:Landroid/util/SparseArray;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getId()I

    move-result v0

    invoke-virtual {p1, v0, p0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-void
.end method

.method public setMaxHeight(I)V
    .locals 1

    iget v0, p0, Landroid/support/constraint/ConstraintLayout;->h:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroid/support/constraint/ConstraintLayout;->h:I

    invoke-virtual {p0}, Landroid/support/constraint/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setMaxWidth(I)V
    .locals 1

    iget v0, p0, Landroid/support/constraint/ConstraintLayout;->g:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroid/support/constraint/ConstraintLayout;->g:I

    invoke-virtual {p0}, Landroid/support/constraint/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setMinHeight(I)V
    .locals 1

    iget v0, p0, Landroid/support/constraint/ConstraintLayout;->f:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroid/support/constraint/ConstraintLayout;->f:I

    invoke-virtual {p0}, Landroid/support/constraint/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setMinWidth(I)V
    .locals 1

    iget v0, p0, Landroid/support/constraint/ConstraintLayout;->e:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroid/support/constraint/ConstraintLayout;->e:I

    invoke-virtual {p0}, Landroid/support/constraint/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setOnConstraintsChanged(Landroid/support/constraint/g;)V
    .locals 0

    iget-object p0, p0, Landroid/support/constraint/ConstraintLayout;->l:Landroid/support/constraint/d;

    if-eqz p0, :cond_0

    invoke-virtual {p0, p1}, Landroid/support/constraint/d;->a(Landroid/support/constraint/g;)V

    :cond_0
    return-void
.end method

.method public setOptimizationLevel(I)V
    .locals 0

    iput p1, p0, Landroid/support/constraint/ConstraintLayout;->j:I

    iget-object p0, p0, Landroid/support/constraint/ConstraintLayout;->d:Landroid/support/constraint/n/k/f;

    invoke-virtual {p0, p1}, Landroid/support/constraint/n/k/f;->x(I)V

    return-void
.end method

.method public shouldDelayChildPressedState()Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method
