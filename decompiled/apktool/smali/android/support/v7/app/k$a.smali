.class Landroid/support/v7/app/k$a;
.super Lb/b/c/g/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/app/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v7/app/k;


# direct methods
.method constructor <init>(Landroid/support/v7/app/k;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/app/k$a;->a:Landroid/support/v7/app/k;

    invoke-direct {p0}, Lb/b/c/g/w;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Landroid/support/v7/app/k$a;->a:Landroid/support/v7/app/k;

    iget-boolean v0, p1, Landroid/support/v7/app/k;->q:Z

    if-eqz v0, :cond_0

    iget-object p1, p1, Landroid/support/v7/app/k;->g:Landroid/view/View;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    iget-object p1, p0, Landroid/support/v7/app/k$a;->a:Landroid/support/v7/app/k;

    iget-object p1, p1, Landroid/support/v7/app/k;->d:Landroid/support/v7/widget/ActionBarContainer;

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setTranslationY(F)V

    :cond_0
    iget-object p1, p0, Landroid/support/v7/app/k$a;->a:Landroid/support/v7/app/k;

    iget-object p1, p1, Landroid/support/v7/app/k;->d:Landroid/support/v7/widget/ActionBarContainer;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/ActionBarContainer;->setVisibility(I)V

    iget-object p1, p0, Landroid/support/v7/app/k$a;->a:Landroid/support/v7/app/k;

    iget-object p1, p1, Landroid/support/v7/app/k;->d:Landroid/support/v7/widget/ActionBarContainer;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/ActionBarContainer;->setTransitioning(Z)V

    iget-object p1, p0, Landroid/support/v7/app/k$a;->a:Landroid/support/v7/app/k;

    const/4 v0, 0x0

    iput-object v0, p1, Landroid/support/v7/app/k;->v:Lb/b/d/d/h;

    invoke-virtual {p1}, Landroid/support/v7/app/k;->l()V

    iget-object p0, p0, Landroid/support/v7/app/k$a;->a:Landroid/support/v7/app/k;

    iget-object p0, p0, Landroid/support/v7/app/k;->c:Landroid/support/v7/widget/ActionBarOverlayLayout;

    if-eqz p0, :cond_1

    invoke-static {p0}, Lb/b/c/g/q;->m(Landroid/view/View;)V

    :cond_1
    return-void
.end method
