.class public Landroid/support/v7/app/k$d;
.super Lb/b/d/d/b;
.source ""

# interfaces
.implements Landroid/support/v7/view/menu/h$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/app/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field private final d:Landroid/content/Context;

.field private final e:Landroid/support/v7/view/menu/h;

.field private f:Lb/b/d/d/b$a;

.field private g:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic h:Landroid/support/v7/app/k;


# direct methods
.method public constructor <init>(Landroid/support/v7/app/k;Landroid/content/Context;Lb/b/d/d/b$a;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/app/k$d;->h:Landroid/support/v7/app/k;

    invoke-direct {p0}, Lb/b/d/d/b;-><init>()V

    iput-object p2, p0, Landroid/support/v7/app/k$d;->d:Landroid/content/Context;

    iput-object p3, p0, Landroid/support/v7/app/k$d;->f:Lb/b/d/d/b$a;

    new-instance p1, Landroid/support/v7/view/menu/h;

    invoke-direct {p1, p2}, Landroid/support/v7/view/menu/h;-><init>(Landroid/content/Context;)V

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/support/v7/view/menu/h;->c(I)Landroid/support/v7/view/menu/h;

    iput-object p1, p0, Landroid/support/v7/app/k$d;->e:Landroid/support/v7/view/menu/h;

    invoke-virtual {p1, p0}, Landroid/support/v7/view/menu/h;->a(Landroid/support/v7/view/menu/h$a;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Landroid/support/v7/app/k$d;->h:Landroid/support/v7/app/k;

    iget-object v1, v0, Landroid/support/v7/app/k;->j:Landroid/support/v7/app/k$d;

    if-eq v1, p0, :cond_0

    return-void

    :cond_0
    iget-boolean v1, v0, Landroid/support/v7/app/k;->r:Z

    iget-boolean v0, v0, Landroid/support/v7/app/k;->s:Z

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Landroid/support/v7/app/k;->a(ZZZ)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroid/support/v7/app/k$d;->h:Landroid/support/v7/app/k;

    iput-object p0, v0, Landroid/support/v7/app/k;->k:Lb/b/d/d/b;

    iget-object v1, p0, Landroid/support/v7/app/k$d;->f:Lb/b/d/d/b$a;

    iput-object v1, v0, Landroid/support/v7/app/k;->l:Lb/b/d/d/b$a;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Landroid/support/v7/app/k$d;->f:Lb/b/d/d/b$a;

    invoke-interface {v0, p0}, Lb/b/d/d/b$a;->a(Lb/b/d/d/b;)V

    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/app/k$d;->f:Lb/b/d/d/b$a;

    iget-object v1, p0, Landroid/support/v7/app/k$d;->h:Landroid/support/v7/app/k;

    invoke-virtual {v1, v2}, Landroid/support/v7/app/k;->e(Z)V

    iget-object v1, p0, Landroid/support/v7/app/k$d;->h:Landroid/support/v7/app/k;

    iget-object v1, v1, Landroid/support/v7/app/k;->f:Landroid/support/v7/widget/ActionBarContextView;

    invoke-virtual {v1}, Landroid/support/v7/widget/ActionBarContextView;->a()V

    iget-object v1, p0, Landroid/support/v7/app/k$d;->h:Landroid/support/v7/app/k;

    iget-object v1, v1, Landroid/support/v7/app/k;->e:Landroid/support/v7/widget/b0;

    invoke-interface {v1}, Landroid/support/v7/widget/b0;->k()Landroid/view/ViewGroup;

    move-result-object v1

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->sendAccessibilityEvent(I)V

    iget-object v1, p0, Landroid/support/v7/app/k$d;->h:Landroid/support/v7/app/k;

    iget-object v2, v1, Landroid/support/v7/app/k;->c:Landroid/support/v7/widget/ActionBarOverlayLayout;

    iget-boolean v1, v1, Landroid/support/v7/app/k;->x:Z

    invoke-virtual {v2, v1}, Landroid/support/v7/widget/ActionBarOverlayLayout;->setHideOnContentScrollEnabled(Z)V

    iget-object p0, p0, Landroid/support/v7/app/k$d;->h:Landroid/support/v7/app/k;

    iput-object v0, p0, Landroid/support/v7/app/k;->j:Landroid/support/v7/app/k$d;

    return-void
.end method

.method public a(I)V
    .locals 1

    iget-object v0, p0, Landroid/support/v7/app/k$d;->h:Landroid/support/v7/app/k;

    iget-object v0, v0, Landroid/support/v7/app/k;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/support/v7/app/k$d;->a(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public a(Landroid/support/v7/view/menu/h;)V
    .locals 0

    iget-object p1, p0, Landroid/support/v7/app/k$d;->f:Lb/b/d/d/b$a;

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/app/k$d;->i()V

    iget-object p0, p0, Landroid/support/v7/app/k$d;->h:Landroid/support/v7/app/k;

    iget-object p0, p0, Landroid/support/v7/app/k;->f:Landroid/support/v7/widget/ActionBarContextView;

    invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarContextView;->d()Z

    return-void
.end method

.method public a(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Landroid/support/v7/app/k$d;->h:Landroid/support/v7/app/k;

    iget-object v0, v0, Landroid/support/v7/app/k;->f:Landroid/support/v7/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/ActionBarContextView;->setCustomView(Landroid/view/View;)V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Landroid/support/v7/app/k$d;->g:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public a(Ljava/lang/CharSequence;)V
    .locals 0

    iget-object p0, p0, Landroid/support/v7/app/k$d;->h:Landroid/support/v7/app/k;

    iget-object p0, p0, Landroid/support/v7/app/k;->f:Landroid/support/v7/widget/ActionBarContextView;

    invoke-virtual {p0, p1}, Landroid/support/v7/widget/ActionBarContextView;->setSubtitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public a(Z)V
    .locals 0

    invoke-super {p0, p1}, Lb/b/d/d/b;->a(Z)V

    iget-object p0, p0, Landroid/support/v7/app/k$d;->h:Landroid/support/v7/app/k;

    iget-object p0, p0, Landroid/support/v7/app/k;->f:Landroid/support/v7/widget/ActionBarContextView;

    invoke-virtual {p0, p1}, Landroid/support/v7/widget/ActionBarContextView;->setTitleOptional(Z)V

    return-void
.end method

.method public a(Landroid/support/v7/view/menu/h;Landroid/view/MenuItem;)Z
    .locals 0

    iget-object p1, p0, Landroid/support/v7/app/k$d;->f:Lb/b/d/d/b$a;

    if-eqz p1, :cond_0

    invoke-interface {p1, p0, p2}, Lb/b/d/d/b$a;->a(Lb/b/d/d/b;Landroid/view/MenuItem;)Z

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public b()Landroid/view/View;
    .locals 0

    iget-object p0, p0, Landroid/support/v7/app/k$d;->g:Ljava/lang/ref/WeakReference;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/View;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public b(I)V
    .locals 1

    iget-object v0, p0, Landroid/support/v7/app/k$d;->h:Landroid/support/v7/app/k;

    iget-object v0, v0, Landroid/support/v7/app/k;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/support/v7/app/k$d;->b(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public b(Ljava/lang/CharSequence;)V
    .locals 0

    iget-object p0, p0, Landroid/support/v7/app/k$d;->h:Landroid/support/v7/app/k;

    iget-object p0, p0, Landroid/support/v7/app/k;->f:Landroid/support/v7/widget/ActionBarContextView;

    invoke-virtual {p0, p1}, Landroid/support/v7/widget/ActionBarContextView;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public c()Landroid/view/Menu;
    .locals 0

    iget-object p0, p0, Landroid/support/v7/app/k$d;->e:Landroid/support/v7/view/menu/h;

    return-object p0
.end method

.method public d()Landroid/view/MenuInflater;
    .locals 1

    new-instance v0, Lb/b/d/d/g;

    iget-object p0, p0, Landroid/support/v7/app/k$d;->d:Landroid/content/Context;

    invoke-direct {v0, p0}, Lb/b/d/d/g;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public e()Ljava/lang/CharSequence;
    .locals 0

    iget-object p0, p0, Landroid/support/v7/app/k$d;->h:Landroid/support/v7/app/k;

    iget-object p0, p0, Landroid/support/v7/app/k;->f:Landroid/support/v7/widget/ActionBarContextView;

    invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarContextView;->getSubtitle()Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public g()Ljava/lang/CharSequence;
    .locals 0

    iget-object p0, p0, Landroid/support/v7/app/k$d;->h:Landroid/support/v7/app/k;

    iget-object p0, p0, Landroid/support/v7/app/k;->f:Landroid/support/v7/widget/ActionBarContextView;

    invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarContextView;->getTitle()Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public i()V
    .locals 2

    iget-object v0, p0, Landroid/support/v7/app/k$d;->h:Landroid/support/v7/app/k;

    iget-object v0, v0, Landroid/support/v7/app/k;->j:Landroid/support/v7/app/k$d;

    if-eq v0, p0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroid/support/v7/app/k$d;->e:Landroid/support/v7/view/menu/h;

    invoke-virtual {v0}, Landroid/support/v7/view/menu/h;->s()V

    :try_start_0
    iget-object v0, p0, Landroid/support/v7/app/k$d;->f:Lb/b/d/d/b$a;

    iget-object v1, p0, Landroid/support/v7/app/k$d;->e:Landroid/support/v7/view/menu/h;

    invoke-interface {v0, p0, v1}, Lb/b/d/d/b$a;->a(Lb/b/d/d/b;Landroid/view/Menu;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p0, p0, Landroid/support/v7/app/k$d;->e:Landroid/support/v7/view/menu/h;

    invoke-virtual {p0}, Landroid/support/v7/view/menu/h;->r()V

    return-void

    :catchall_0
    move-exception v0

    iget-object p0, p0, Landroid/support/v7/app/k$d;->e:Landroid/support/v7/view/menu/h;

    invoke-virtual {p0}, Landroid/support/v7/view/menu/h;->r()V

    throw v0
.end method

.method public j()Z
    .locals 0

    iget-object p0, p0, Landroid/support/v7/app/k$d;->h:Landroid/support/v7/app/k;

    iget-object p0, p0, Landroid/support/v7/app/k;->f:Landroid/support/v7/widget/ActionBarContextView;

    invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarContextView;->b()Z

    move-result p0

    return p0
.end method

.method public k()Z
    .locals 2

    iget-object v0, p0, Landroid/support/v7/app/k$d;->e:Landroid/support/v7/view/menu/h;

    invoke-virtual {v0}, Landroid/support/v7/view/menu/h;->s()V

    :try_start_0
    iget-object v0, p0, Landroid/support/v7/app/k$d;->f:Lb/b/d/d/b$a;

    iget-object v1, p0, Landroid/support/v7/app/k$d;->e:Landroid/support/v7/view/menu/h;

    invoke-interface {v0, p0, v1}, Lb/b/d/d/b$a;->b(Lb/b/d/d/b;Landroid/view/Menu;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p0, p0, Landroid/support/v7/app/k$d;->e:Landroid/support/v7/view/menu/h;

    invoke-virtual {p0}, Landroid/support/v7/view/menu/h;->r()V

    return v0

    :catchall_0
    move-exception v0

    iget-object p0, p0, Landroid/support/v7/app/k$d;->e:Landroid/support/v7/view/menu/h;

    invoke-virtual {p0}, Landroid/support/v7/view/menu/h;->r()V

    throw v0
.end method
