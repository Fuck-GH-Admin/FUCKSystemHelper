.class Landroid/support/v7/widget/u0$b;
.super Lb/b/c/g/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v7/widget/u0;->a(IJ)Lb/b/c/g/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private a:Z

.field final synthetic b:I

.field final synthetic c:Landroid/support/v7/widget/u0;


# direct methods
.method constructor <init>(Landroid/support/v7/widget/u0;I)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/widget/u0$b;->c:Landroid/support/v7/widget/u0;

    iput p2, p0, Landroid/support/v7/widget/u0$b;->b:I

    invoke-direct {p0}, Lb/b/c/g/w;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroid/support/v7/widget/u0$b;->a:Z

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 0

    iget-boolean p1, p0, Landroid/support/v7/widget/u0$b;->a:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Landroid/support/v7/widget/u0$b;->c:Landroid/support/v7/widget/u0;

    iget-object p1, p1, Landroid/support/v7/widget/u0;->a:Landroid/support/v7/widget/Toolbar;

    iget p0, p0, Landroid/support/v7/widget/u0$b;->b:I

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public b(Landroid/view/View;)V
    .locals 0

    iget-object p0, p0, Landroid/support/v7/widget/u0$b;->c:Landroid/support/v7/widget/u0;

    iget-object p0, p0, Landroid/support/v7/widget/u0;->a:Landroid/support/v7/widget/Toolbar;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setVisibility(I)V

    return-void
.end method

.method public c(Landroid/view/View;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroid/support/v7/widget/u0$b;->a:Z

    return-void
.end method
