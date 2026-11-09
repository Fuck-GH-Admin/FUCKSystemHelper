.class Landroid/support/v7/app/f$i$a;
.super Lb/b/c/g/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v7/app/f$i;->a(Lb/b/d/d/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v7/app/f$i;


# direct methods
.method constructor <init>(Landroid/support/v7/app/f$i;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/app/f$i$a;->a:Landroid/support/v7/app/f$i;

    invoke-direct {p0}, Lb/b/c/g/w;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Landroid/support/v7/app/f$i$a;->a:Landroid/support/v7/app/f$i;

    iget-object p1, p1, Landroid/support/v7/app/f$i;->b:Landroid/support/v7/app/f;

    iget-object p1, p1, Landroid/support/v7/app/f;->o:Landroid/support/v7/widget/ActionBarContextView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/ActionBarContextView;->setVisibility(I)V

    iget-object p1, p0, Landroid/support/v7/app/f$i$a;->a:Landroid/support/v7/app/f$i;

    iget-object p1, p1, Landroid/support/v7/app/f$i;->b:Landroid/support/v7/app/f;

    iget-object v0, p1, Landroid/support/v7/app/f;->p:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    goto :goto_0

    :cond_0
    iget-object p1, p1, Landroid/support/v7/app/f;->o:Landroid/support/v7/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of p1, p1, Landroid/view/View;

    if-eqz p1, :cond_1

    iget-object p1, p0, Landroid/support/v7/app/f$i$a;->a:Landroid/support/v7/app/f$i;

    iget-object p1, p1, Landroid/support/v7/app/f$i;->b:Landroid/support/v7/app/f;

    iget-object p1, p1, Landroid/support/v7/app/f;->o:Landroid/support/v7/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-static {p1}, Lb/b/c/g/q;->m(Landroid/view/View;)V

    :cond_1
    :goto_0
    iget-object p1, p0, Landroid/support/v7/app/f$i$a;->a:Landroid/support/v7/app/f$i;

    iget-object p1, p1, Landroid/support/v7/app/f$i;->b:Landroid/support/v7/app/f;

    iget-object p1, p1, Landroid/support/v7/app/f;->o:Landroid/support/v7/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->removeAllViews()V

    iget-object p1, p0, Landroid/support/v7/app/f$i$a;->a:Landroid/support/v7/app/f$i;

    iget-object p1, p1, Landroid/support/v7/app/f$i;->b:Landroid/support/v7/app/f;

    iget-object p1, p1, Landroid/support/v7/app/f;->r:Lb/b/c/g/u;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lb/b/c/g/u;->a(Lb/b/c/g/v;)Lb/b/c/g/u;

    iget-object p0, p0, Landroid/support/v7/app/f$i$a;->a:Landroid/support/v7/app/f$i;

    iget-object p0, p0, Landroid/support/v7/app/f$i;->b:Landroid/support/v7/app/f;

    iput-object v0, p0, Landroid/support/v7/app/f;->r:Lb/b/c/g/u;

    return-void
.end method
