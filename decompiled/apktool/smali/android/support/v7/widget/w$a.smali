.class Landroid/support/v7/widget/w$a;
.super Landroid/support/v7/widget/f0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v7/widget/w;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILandroid/content/res/Resources$Theme;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Landroid/support/v7/widget/w$c;

.field final synthetic l:Landroid/support/v7/widget/w;


# direct methods
.method constructor <init>(Landroid/support/v7/widget/w;Landroid/view/View;Landroid/support/v7/widget/w$c;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/widget/w$a;->l:Landroid/support/v7/widget/w;

    iput-object p3, p0, Landroid/support/v7/widget/w$a;->k:Landroid/support/v7/widget/w$c;

    invoke-direct {p0, p2}, Landroid/support/v7/widget/f0;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public a()Landroid/support/v7/view/menu/s;
    .locals 0

    iget-object p0, p0, Landroid/support/v7/widget/w$a;->k:Landroid/support/v7/widget/w$c;

    return-object p0
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/w$a;->l:Landroid/support/v7/widget/w;

    iget-object v0, v0, Landroid/support/v7/widget/w;->g:Landroid/support/v7/widget/w$c;

    invoke-virtual {v0}, Landroid/support/v7/widget/h0;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object p0, p0, Landroid/support/v7/widget/w$a;->l:Landroid/support/v7/widget/w;

    iget-object p0, p0, Landroid/support/v7/widget/w;->g:Landroid/support/v7/widget/w$c;

    invoke-virtual {p0}, Landroid/support/v7/widget/w$c;->c()V

    :cond_0
    const/4 p0, 0x1

    return p0
.end method
