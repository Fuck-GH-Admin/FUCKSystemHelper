.class Lb/b/c/g/u$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/b/c/g/u;->a(Lb/b/c/g/x;)Lb/b/c/g/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb/b/c/g/x;

.field final synthetic b:Landroid/view/View;


# direct methods
.method constructor <init>(Lb/b/c/g/u;Lb/b/c/g/x;Landroid/view/View;)V
    .locals 0

    iput-object p2, p0, Lb/b/c/g/u$b;->a:Lb/b/c/g/x;

    iput-object p3, p0, Lb/b/c/g/u$b;->b:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 0

    iget-object p1, p0, Lb/b/c/g/u$b;->a:Lb/b/c/g/x;

    iget-object p0, p0, Lb/b/c/g/u$b;->b:Landroid/view/View;

    invoke-interface {p1, p0}, Lb/b/c/g/x;->a(Landroid/view/View;)V

    return-void
.end method
