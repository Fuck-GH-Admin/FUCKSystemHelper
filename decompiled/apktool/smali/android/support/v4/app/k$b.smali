.class Landroid/support/v4/app/k$b;
.super Landroid/support/v4/app/k$f;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v4/app/k;->a(Landroid/support/v4/app/e;Landroid/support/v4/app/k$g;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/view/ViewGroup;

.field final synthetic c:Landroid/support/v4/app/e;

.field final synthetic d:Landroid/support/v4/app/k;


# direct methods
.method constructor <init>(Landroid/support/v4/app/k;Landroid/view/animation/Animation$AnimationListener;Landroid/view/ViewGroup;Landroid/support/v4/app/e;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v4/app/k$b;->d:Landroid/support/v4/app/k;

    iput-object p3, p0, Landroid/support/v4/app/k$b;->b:Landroid/view/ViewGroup;

    iput-object p4, p0, Landroid/support/v4/app/k$b;->c:Landroid/support/v4/app/e;

    invoke-direct {p0, p2}, Landroid/support/v4/app/k$f;-><init>(Landroid/view/animation/Animation$AnimationListener;)V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/support/v4/app/k$f;->onAnimationEnd(Landroid/view/animation/Animation;)V

    iget-object p1, p0, Landroid/support/v4/app/k$b;->b:Landroid/view/ViewGroup;

    new-instance v0, Landroid/support/v4/app/k$b$a;

    invoke-direct {v0, p0}, Landroid/support/v4/app/k$b$a;-><init>(Landroid/support/v4/app/k$b;)V

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
