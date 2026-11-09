.class Lb/b/c/g/u$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/b/c/g/u;->a(Landroid/view/View;Lb/b/c/g/v;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb/b/c/g/v;

.field final synthetic b:Landroid/view/View;


# direct methods
.method constructor <init>(Lb/b/c/g/u;Lb/b/c/g/v;Landroid/view/View;)V
    .locals 0

    iput-object p2, p0, Lb/b/c/g/u$a;->a:Lb/b/c/g/v;

    iput-object p3, p0, Lb/b/c/g/u$a;->b:Landroid/view/View;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    iget-object p1, p0, Lb/b/c/g/u$a;->a:Lb/b/c/g/v;

    iget-object p0, p0, Lb/b/c/g/u$a;->b:Landroid/view/View;

    invoke-interface {p1, p0}, Lb/b/c/g/v;->c(Landroid/view/View;)V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    iget-object p1, p0, Lb/b/c/g/u$a;->a:Lb/b/c/g/v;

    iget-object p0, p0, Lb/b/c/g/u$a;->b:Landroid/view/View;

    invoke-interface {p1, p0}, Lb/b/c/g/v;->a(Landroid/view/View;)V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    iget-object p1, p0, Lb/b/c/g/u$a;->a:Lb/b/c/g/v;

    iget-object p0, p0, Lb/b/c/g/u$a;->b:Landroid/view/View;

    invoke-interface {p1, p0}, Lb/b/c/g/v;->b(Landroid/view/View;)V

    return-void
.end method
