.class final Landroid/support/v7/app/f$n;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/support/v7/view/menu/o$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/app/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "n"
.end annotation


# instance fields
.field final synthetic b:Landroid/support/v7/app/f;


# direct methods
.method constructor <init>(Landroid/support/v7/app/f;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/app/f$n;->b:Landroid/support/v7/app/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/support/v7/view/menu/h;Z)V
    .locals 4

    invoke-virtual {p1}, Landroid/support/v7/view/menu/h;->m()Landroid/support/v7/view/menu/h;

    move-result-object v0

    const/4 v1, 0x1

    if-eq v0, p1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Landroid/support/v7/app/f$n;->b:Landroid/support/v7/app/f;

    if-eqz v2, :cond_1

    move-object p1, v0

    :cond_1
    invoke-virtual {v3, p1}, Landroid/support/v7/app/f;->a(Landroid/view/Menu;)Landroid/support/v7/app/f$m;

    move-result-object p1

    if-eqz p1, :cond_3

    if-eqz v2, :cond_2

    iget-object p2, p0, Landroid/support/v7/app/f$n;->b:Landroid/support/v7/app/f;

    iget v2, p1, Landroid/support/v7/app/f$m;->a:I

    invoke-virtual {p2, v2, p1, v0}, Landroid/support/v7/app/f;->a(ILandroid/support/v7/app/f$m;Landroid/view/Menu;)V

    iget-object p0, p0, Landroid/support/v7/app/f$n;->b:Landroid/support/v7/app/f;

    invoke-virtual {p0, p1, v1}, Landroid/support/v7/app/f;->a(Landroid/support/v7/app/f$m;Z)V

    goto :goto_1

    :cond_2
    iget-object p0, p0, Landroid/support/v7/app/f$n;->b:Landroid/support/v7/app/f;

    invoke-virtual {p0, p1, p2}, Landroid/support/v7/app/f;->a(Landroid/support/v7/app/f$m;Z)V

    :cond_3
    :goto_1
    return-void
.end method

.method public a(Landroid/support/v7/view/menu/h;)Z
    .locals 2

    if-nez p1, :cond_0

    iget-object v0, p0, Landroid/support/v7/app/f$n;->b:Landroid/support/v7/app/f;

    iget-boolean v1, v0, Landroid/support/v7/app/f;->z:Z

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/support/v7/app/f;->o()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Landroid/support/v7/app/f$n;->b:Landroid/support/v7/app/f;

    iget-boolean p0, p0, Landroid/support/v7/app/f;->I:Z

    if-nez p0, :cond_0

    const/16 p0, 0x6c

    invoke-interface {v0, p0, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    :cond_0
    const/4 p0, 0x1

    return p0
.end method
