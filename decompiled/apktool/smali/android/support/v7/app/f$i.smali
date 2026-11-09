.class Landroid/support/v7/app/f$i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb/b/d/d/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/app/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "i"
.end annotation


# instance fields
.field private a:Lb/b/d/d/b$a;

.field final synthetic b:Landroid/support/v7/app/f;


# direct methods
.method public constructor <init>(Landroid/support/v7/app/f;Lb/b/d/d/b$a;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/app/f$i;->b:Landroid/support/v7/app/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Landroid/support/v7/app/f$i;->a:Lb/b/d/d/b$a;

    return-void
.end method


# virtual methods
.method public a(Lb/b/d/d/b;)V
    .locals 2

    iget-object v0, p0, Landroid/support/v7/app/f$i;->a:Lb/b/d/d/b$a;

    invoke-interface {v0, p1}, Lb/b/d/d/b$a;->a(Lb/b/d/d/b;)V

    iget-object p1, p0, Landroid/support/v7/app/f$i;->b:Landroid/support/v7/app/f;

    iget-object v0, p1, Landroid/support/v7/app/f;->p:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    iget-object p1, p1, Landroid/support/v7/app/f;->d:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Landroid/support/v7/app/f$i;->b:Landroid/support/v7/app/f;

    iget-object v0, v0, Landroid/support/v7/app/f;->q:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_0
    iget-object p1, p0, Landroid/support/v7/app/f$i;->b:Landroid/support/v7/app/f;

    iget-object v0, p1, Landroid/support/v7/app/f;->o:Landroid/support/v7/widget/ActionBarContextView;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/support/v7/app/f;->l()V

    iget-object p1, p0, Landroid/support/v7/app/f$i;->b:Landroid/support/v7/app/f;

    iget-object v0, p1, Landroid/support/v7/app/f;->o:Landroid/support/v7/widget/ActionBarContextView;

    invoke-static {v0}, Lb/b/c/g/q;->a(Landroid/view/View;)Lb/b/c/g/u;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lb/b/c/g/u;->a(F)Lb/b/c/g/u;

    iput-object v0, p1, Landroid/support/v7/app/f;->r:Lb/b/c/g/u;

    iget-object p1, p0, Landroid/support/v7/app/f$i;->b:Landroid/support/v7/app/f;

    iget-object p1, p1, Landroid/support/v7/app/f;->r:Lb/b/c/g/u;

    new-instance v0, Landroid/support/v7/app/f$i$a;

    invoke-direct {v0, p0}, Landroid/support/v7/app/f$i$a;-><init>(Landroid/support/v7/app/f$i;)V

    invoke-virtual {p1, v0}, Lb/b/c/g/u;->a(Lb/b/c/g/v;)Lb/b/c/g/u;

    :cond_1
    iget-object p1, p0, Landroid/support/v7/app/f$i;->b:Landroid/support/v7/app/f;

    iget-object v0, p1, Landroid/support/v7/app/f;->g:Landroid/support/v7/app/d;

    if-eqz v0, :cond_2

    iget-object p1, p1, Landroid/support/v7/app/f;->n:Lb/b/d/d/b;

    invoke-interface {v0, p1}, Landroid/support/v7/app/d;->b(Lb/b/d/d/b;)V

    :cond_2
    iget-object p0, p0, Landroid/support/v7/app/f$i;->b:Landroid/support/v7/app/f;

    const/4 p1, 0x0

    iput-object p1, p0, Landroid/support/v7/app/f;->n:Lb/b/d/d/b;

    return-void
.end method

.method public a(Lb/b/d/d/b;Landroid/view/Menu;)Z
    .locals 0

    iget-object p0, p0, Landroid/support/v7/app/f$i;->a:Lb/b/d/d/b$a;

    invoke-interface {p0, p1, p2}, Lb/b/d/d/b$a;->a(Lb/b/d/d/b;Landroid/view/Menu;)Z

    move-result p0

    return p0
.end method

.method public a(Lb/b/d/d/b;Landroid/view/MenuItem;)Z
    .locals 0

    iget-object p0, p0, Landroid/support/v7/app/f$i;->a:Lb/b/d/d/b$a;

    invoke-interface {p0, p1, p2}, Lb/b/d/d/b$a;->a(Lb/b/d/d/b;Landroid/view/MenuItem;)Z

    move-result p0

    return p0
.end method

.method public b(Lb/b/d/d/b;Landroid/view/Menu;)Z
    .locals 0

    iget-object p0, p0, Landroid/support/v7/app/f$i;->a:Lb/b/d/d/b$a;

    invoke-interface {p0, p1, p2}, Lb/b/d/d/b$a;->b(Lb/b/d/d/b;Landroid/view/Menu;)Z

    move-result p0

    return p0
.end method
