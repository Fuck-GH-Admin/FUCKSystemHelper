.class public Landroid/support/constraint/f;
.super Landroid/view/ViewGroup;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/constraint/f$a;
    }
.end annotation


# instance fields
.field b:Landroid/support/constraint/e;


# virtual methods
.method protected generateDefaultLayoutParams()Landroid/support/constraint/f$a;
    .locals 1

    new-instance p0, Landroid/support/constraint/f$a;

    const/4 v0, -0x2

    invoke-direct {p0, v0, v0}, Landroid/support/constraint/f$a;-><init>(II)V

    return-object p0
.end method

.method protected bridge synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    invoke-virtual {p0}, Landroid/support/constraint/f;->generateDefaultLayoutParams()Landroid/support/constraint/f$a;

    move-result-object p0

    return-object p0
.end method

.method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/support/constraint/f$a;
    .locals 1

    new-instance v0, Landroid/support/constraint/f$a;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-direct {v0, p0, p1}, Landroid/support/constraint/f$a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public bridge synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    invoke-virtual {p0, p1}, Landroid/support/constraint/f;->generateLayoutParams(Landroid/util/AttributeSet;)Landroid/support/constraint/f$a;

    move-result-object p0

    return-object p0
.end method

.method protected generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    new-instance p0, Landroid/support/constraint/ConstraintLayout$b;

    invoke-direct {p0, p1}, Landroid/support/constraint/ConstraintLayout$b;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object p0
.end method

.method public getConstraintSet()Landroid/support/constraint/e;
    .locals 1

    iget-object v0, p0, Landroid/support/constraint/f;->b:Landroid/support/constraint/e;

    if-nez v0, :cond_0

    new-instance v0, Landroid/support/constraint/e;

    invoke-direct {v0}, Landroid/support/constraint/e;-><init>()V

    iput-object v0, p0, Landroid/support/constraint/f;->b:Landroid/support/constraint/e;

    :cond_0
    iget-object v0, p0, Landroid/support/constraint/f;->b:Landroid/support/constraint/e;

    invoke-virtual {v0, p0}, Landroid/support/constraint/e;->a(Landroid/support/constraint/f;)V

    iget-object p0, p0, Landroid/support/constraint/f;->b:Landroid/support/constraint/e;

    return-object p0
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    return-void
.end method
