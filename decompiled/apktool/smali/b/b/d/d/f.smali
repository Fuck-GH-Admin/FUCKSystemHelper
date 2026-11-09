.class public Lb/b/d/d/f;
.super Landroid/view/ActionMode;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb/b/d/d/f$a;
    }
.end annotation


# instance fields
.field final a:Landroid/content/Context;

.field final b:Lb/b/d/d/b;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lb/b/d/d/b;)V
    .locals 0

    invoke-direct {p0}, Landroid/view/ActionMode;-><init>()V

    iput-object p1, p0, Lb/b/d/d/f;->a:Landroid/content/Context;

    iput-object p2, p0, Lb/b/d/d/f;->b:Lb/b/d/d/b;

    return-void
.end method


# virtual methods
.method public finish()V
    .locals 0

    iget-object p0, p0, Lb/b/d/d/f;->b:Lb/b/d/d/b;

    invoke-virtual {p0}, Lb/b/d/d/b;->a()V

    return-void
.end method

.method public getCustomView()Landroid/view/View;
    .locals 0

    iget-object p0, p0, Lb/b/d/d/f;->b:Lb/b/d/d/b;

    invoke-virtual {p0}, Lb/b/d/d/b;->b()Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public getMenu()Landroid/view/Menu;
    .locals 1

    iget-object v0, p0, Lb/b/d/d/f;->a:Landroid/content/Context;

    iget-object p0, p0, Lb/b/d/d/f;->b:Lb/b/d/d/b;

    invoke-virtual {p0}, Lb/b/d/d/b;->c()Landroid/view/Menu;

    move-result-object p0

    check-cast p0, Lb/b/c/c/a/a;

    invoke-static {v0, p0}, Landroid/support/v7/view/menu/q;->a(Landroid/content/Context;Lb/b/c/c/a/a;)Landroid/view/Menu;

    move-result-object p0

    return-object p0
.end method

.method public getMenuInflater()Landroid/view/MenuInflater;
    .locals 0

    iget-object p0, p0, Lb/b/d/d/f;->b:Lb/b/d/d/b;

    invoke-virtual {p0}, Lb/b/d/d/b;->d()Landroid/view/MenuInflater;

    move-result-object p0

    return-object p0
.end method

.method public getSubtitle()Ljava/lang/CharSequence;
    .locals 0

    iget-object p0, p0, Lb/b/d/d/f;->b:Lb/b/d/d/b;

    invoke-virtual {p0}, Lb/b/d/d/b;->e()Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public getTag()Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lb/b/d/d/f;->b:Lb/b/d/d/b;

    invoke-virtual {p0}, Lb/b/d/d/b;->f()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public getTitle()Ljava/lang/CharSequence;
    .locals 0

    iget-object p0, p0, Lb/b/d/d/f;->b:Lb/b/d/d/b;

    invoke-virtual {p0}, Lb/b/d/d/b;->g()Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public getTitleOptionalHint()Z
    .locals 0

    iget-object p0, p0, Lb/b/d/d/f;->b:Lb/b/d/d/b;

    invoke-virtual {p0}, Lb/b/d/d/b;->h()Z

    move-result p0

    return p0
.end method

.method public invalidate()V
    .locals 0

    iget-object p0, p0, Lb/b/d/d/f;->b:Lb/b/d/d/b;

    invoke-virtual {p0}, Lb/b/d/d/b;->i()V

    return-void
.end method

.method public isTitleOptional()Z
    .locals 0

    iget-object p0, p0, Lb/b/d/d/f;->b:Lb/b/d/d/b;

    invoke-virtual {p0}, Lb/b/d/d/b;->j()Z

    move-result p0

    return p0
.end method

.method public setCustomView(Landroid/view/View;)V
    .locals 0

    iget-object p0, p0, Lb/b/d/d/f;->b:Lb/b/d/d/b;

    invoke-virtual {p0, p1}, Lb/b/d/d/b;->a(Landroid/view/View;)V

    return-void
.end method

.method public setSubtitle(I)V
    .locals 0

    iget-object p0, p0, Lb/b/d/d/f;->b:Lb/b/d/d/b;

    invoke-virtual {p0, p1}, Lb/b/d/d/b;->a(I)V

    return-void
.end method

.method public setSubtitle(Ljava/lang/CharSequence;)V
    .locals 0

    iget-object p0, p0, Lb/b/d/d/f;->b:Lb/b/d/d/b;

    invoke-virtual {p0, p1}, Lb/b/d/d/b;->a(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setTag(Ljava/lang/Object;)V
    .locals 0

    iget-object p0, p0, Lb/b/d/d/f;->b:Lb/b/d/d/b;

    invoke-virtual {p0, p1}, Lb/b/d/d/b;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public setTitle(I)V
    .locals 0

    iget-object p0, p0, Lb/b/d/d/f;->b:Lb/b/d/d/b;

    invoke-virtual {p0, p1}, Lb/b/d/d/b;->b(I)V

    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 0

    iget-object p0, p0, Lb/b/d/d/f;->b:Lb/b/d/d/b;

    invoke-virtual {p0, p1}, Lb/b/d/d/b;->b(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setTitleOptionalHint(Z)V
    .locals 0

    iget-object p0, p0, Lb/b/d/d/f;->b:Lb/b/d/d/b;

    invoke-virtual {p0, p1}, Lb/b/d/d/b;->a(Z)V

    return-void
.end method
