.class public Landroid/support/constraint/a;
.super Landroid/support/constraint/c;
.source ""


# instance fields
.field private j:I

.field private k:I

.field private l:Landroid/support/constraint/n/k/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/support/constraint/c;-><init>(Landroid/content/Context;)V

    const/16 p1, 0x8

    invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private a(Landroid/support/constraint/n/k/e;IZ)V
    .locals 5

    iput p2, p0, Landroid/support/constraint/a;->k:I

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x6

    const/4 v3, 0x5

    const/16 v4, 0x11

    if-ge p2, v4, :cond_1

    iget p2, p0, Landroid/support/constraint/a;->j:I

    if-ne p2, v3, :cond_0

    :goto_0
    iput v1, p0, Landroid/support/constraint/a;->k:I

    goto :goto_3

    :cond_0
    if-ne p2, v2, :cond_5

    :goto_1
    goto :goto_2

    :cond_1
    iget p2, p0, Landroid/support/constraint/a;->j:I

    if-eqz p3, :cond_3

    if-ne p2, v3, :cond_2

    :goto_2
    iput v0, p0, Landroid/support/constraint/a;->k:I

    goto :goto_3

    :cond_2
    if-ne p2, v2, :cond_5

    goto :goto_0

    :cond_3
    if-ne p2, v3, :cond_4

    goto :goto_0

    :cond_4
    if-ne p2, v2, :cond_5

    goto :goto_1

    :cond_5
    :goto_3
    instance-of p2, p1, Landroid/support/constraint/n/k/a;

    if-eqz p2, :cond_6

    check-cast p1, Landroid/support/constraint/n/k/a;

    iget p0, p0, Landroid/support/constraint/a;->k:I

    invoke-virtual {p1, p0}, Landroid/support/constraint/n/k/a;->x(I)V

    :cond_6
    return-void
.end method


# virtual methods
.method public a(Landroid/support/constraint/n/k/e;Z)V
    .locals 1

    iget v0, p0, Landroid/support/constraint/a;->j:I

    invoke-direct {p0, p1, v0, p2}, Landroid/support/constraint/a;->a(Landroid/support/constraint/n/k/e;IZ)V

    return-void
.end method

.method protected a(Landroid/util/AttributeSet;)V
    .locals 6

    invoke-super {p0, p1}, Landroid/support/constraint/c;->a(Landroid/util/AttributeSet;)V

    new-instance v0, Landroid/support/constraint/n/k/a;

    invoke-direct {v0}, Landroid/support/constraint/n/k/a;-><init>()V

    iput-object v0, p0, Landroid/support/constraint/a;->l:Landroid/support/constraint/n/k/a;

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Landroid/support/constraint/k;->ConstraintLayout_Layout:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_3

    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v3

    sget v4, Landroid/support/constraint/k;->ConstraintLayout_Layout_barrierDirection:I

    if-ne v3, v4, :cond_0

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    invoke-virtual {p0, v3}, Landroid/support/constraint/a;->setType(I)V

    goto :goto_1

    :cond_0
    sget v4, Landroid/support/constraint/k;->ConstraintLayout_Layout_barrierAllowsGoneWidgets:I

    if-ne v3, v4, :cond_1

    iget-object v4, p0, Landroid/support/constraint/a;->l:Landroid/support/constraint/n/k/a;

    const/4 v5, 0x1

    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    invoke-virtual {v4, v3}, Landroid/support/constraint/n/k/a;->e(Z)V

    goto :goto_1

    :cond_1
    sget v4, Landroid/support/constraint/k;->ConstraintLayout_Layout_barrierMargin:I

    if-ne v3, v4, :cond_2

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iget-object v4, p0, Landroid/support/constraint/a;->l:Landroid/support/constraint/n/k/a;

    invoke-virtual {v4, v3}, Landroid/support/constraint/n/k/a;->y(I)V

    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_4
    iget-object p1, p0, Landroid/support/constraint/a;->l:Landroid/support/constraint/n/k/a;

    iput-object p1, p0, Landroid/support/constraint/c;->e:Landroid/support/constraint/n/k/h;

    invoke-virtual {p0}, Landroid/support/constraint/c;->b()V

    return-void
.end method

.method public c()Z
    .locals 0

    iget-object p0, p0, Landroid/support/constraint/a;->l:Landroid/support/constraint/n/k/a;

    invoke-virtual {p0}, Landroid/support/constraint/n/k/a;->S()Z

    move-result p0

    return p0
.end method

.method public getMargin()I
    .locals 0

    iget-object p0, p0, Landroid/support/constraint/a;->l:Landroid/support/constraint/n/k/a;

    invoke-virtual {p0}, Landroid/support/constraint/n/k/a;->U()I

    move-result p0

    return p0
.end method

.method public getType()I
    .locals 0

    iget p0, p0, Landroid/support/constraint/a;->j:I

    return p0
.end method

.method public setAllowsGoneWidget(Z)V
    .locals 0

    iget-object p0, p0, Landroid/support/constraint/a;->l:Landroid/support/constraint/n/k/a;

    invoke-virtual {p0, p1}, Landroid/support/constraint/n/k/a;->e(Z)V

    return-void
.end method

.method public setDpMargin(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    int-to-float p1, p1

    mul-float/2addr p1, v0

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p1, v0

    float-to-int p1, p1

    iget-object p0, p0, Landroid/support/constraint/a;->l:Landroid/support/constraint/n/k/a;

    invoke-virtual {p0, p1}, Landroid/support/constraint/n/k/a;->y(I)V

    return-void
.end method

.method public setMargin(I)V
    .locals 0

    iget-object p0, p0, Landroid/support/constraint/a;->l:Landroid/support/constraint/n/k/a;

    invoke-virtual {p0, p1}, Landroid/support/constraint/n/k/a;->y(I)V

    return-void
.end method

.method public setType(I)V
    .locals 0

    iput p1, p0, Landroid/support/constraint/a;->j:I

    return-void
.end method
