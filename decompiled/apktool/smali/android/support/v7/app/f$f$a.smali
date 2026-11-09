.class Landroid/support/v7/app/f$f$a;
.super Lb/b/c/g/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v7/app/f$f;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v7/app/f$f;


# direct methods
.method constructor <init>(Landroid/support/v7/app/f$f;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/app/f$f$a;->a:Landroid/support/v7/app/f$f;

    invoke-direct {p0}, Lb/b/c/g/w;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Landroid/support/v7/app/f$f$a;->a:Landroid/support/v7/app/f$f;

    iget-object p1, p1, Landroid/support/v7/app/f$f;->b:Landroid/support/v7/app/f;

    iget-object p1, p1, Landroid/support/v7/app/f;->o:Landroid/support/v7/widget/ActionBarContextView;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setAlpha(F)V

    iget-object p1, p0, Landroid/support/v7/app/f$f$a;->a:Landroid/support/v7/app/f$f;

    iget-object p1, p1, Landroid/support/v7/app/f$f;->b:Landroid/support/v7/app/f;

    iget-object p1, p1, Landroid/support/v7/app/f;->r:Lb/b/c/g/u;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lb/b/c/g/u;->a(Lb/b/c/g/v;)Lb/b/c/g/u;

    iget-object p0, p0, Landroid/support/v7/app/f$f$a;->a:Landroid/support/v7/app/f$f;

    iget-object p0, p0, Landroid/support/v7/app/f$f;->b:Landroid/support/v7/app/f;

    iput-object v0, p0, Landroid/support/v7/app/f;->r:Lb/b/c/g/u;

    return-void
.end method

.method public b(Landroid/view/View;)V
    .locals 0

    iget-object p0, p0, Landroid/support/v7/app/f$f$a;->a:Landroid/support/v7/app/f$f;

    iget-object p0, p0, Landroid/support/v7/app/f$f;->b:Landroid/support/v7/app/f;

    iget-object p0, p0, Landroid/support/v7/app/f;->o:Landroid/support/v7/widget/ActionBarContextView;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/support/v7/widget/ActionBarContextView;->setVisibility(I)V

    return-void
.end method
