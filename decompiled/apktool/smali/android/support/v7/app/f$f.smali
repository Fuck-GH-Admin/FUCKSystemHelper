.class Landroid/support/v7/app/f$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v7/app/f;->b(Lb/b/d/d/b$a;)Lb/b/d/d/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/support/v7/app/f;


# direct methods
.method constructor <init>(Landroid/support/v7/app/f;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/app/f$f;->b:Landroid/support/v7/app/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Landroid/support/v7/app/f$f;->b:Landroid/support/v7/app/f;

    iget-object v1, v0, Landroid/support/v7/app/f;->p:Landroid/widget/PopupWindow;

    iget-object v0, v0, Landroid/support/v7/app/f;->o:Landroid/support/v7/widget/ActionBarContextView;

    const/4 v2, 0x0

    const/16 v3, 0x37

    invoke-virtual {v1, v0, v3, v2, v2}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    iget-object v0, p0, Landroid/support/v7/app/f$f;->b:Landroid/support/v7/app/f;

    invoke-virtual {v0}, Landroid/support/v7/app/f;->l()V

    iget-object v0, p0, Landroid/support/v7/app/f$f;->b:Landroid/support/v7/app/f;

    invoke-virtual {v0}, Landroid/support/v7/app/f;->s()Z

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/app/f$f;->b:Landroid/support/v7/app/f;

    iget-object v0, v0, Landroid/support/v7/app/f;->o:Landroid/support/v7/widget/ActionBarContextView;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setAlpha(F)V

    iget-object v0, p0, Landroid/support/v7/app/f$f;->b:Landroid/support/v7/app/f;

    iget-object v2, v0, Landroid/support/v7/app/f;->o:Landroid/support/v7/widget/ActionBarContextView;

    invoke-static {v2}, Lb/b/c/g/q;->a(Landroid/view/View;)Lb/b/c/g/u;

    move-result-object v2

    invoke-virtual {v2, v1}, Lb/b/c/g/u;->a(F)Lb/b/c/g/u;

    iput-object v2, v0, Landroid/support/v7/app/f;->r:Lb/b/c/g/u;

    iget-object v0, p0, Landroid/support/v7/app/f$f;->b:Landroid/support/v7/app/f;

    iget-object v0, v0, Landroid/support/v7/app/f;->r:Lb/b/c/g/u;

    new-instance v1, Landroid/support/v7/app/f$f$a;

    invoke-direct {v1, p0}, Landroid/support/v7/app/f$f$a;-><init>(Landroid/support/v7/app/f$f;)V

    invoke-virtual {v0, v1}, Lb/b/c/g/u;->a(Lb/b/c/g/v;)Lb/b/c/g/u;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroid/support/v7/app/f$f;->b:Landroid/support/v7/app/f;

    iget-object v0, v0, Landroid/support/v7/app/f;->o:Landroid/support/v7/widget/ActionBarContextView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setAlpha(F)V

    iget-object p0, p0, Landroid/support/v7/app/f$f;->b:Landroid/support/v7/app/f;

    iget-object p0, p0, Landroid/support/v7/app/f;->o:Landroid/support/v7/widget/ActionBarContextView;

    invoke-virtual {p0, v2}, Landroid/support/v7/widget/ActionBarContextView;->setVisibility(I)V

    :goto_0
    return-void
.end method
