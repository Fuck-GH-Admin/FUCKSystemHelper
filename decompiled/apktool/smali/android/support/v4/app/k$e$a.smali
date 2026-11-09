.class Landroid/support/v4/app/k$e$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v4/app/k$e;->onAnimationEnd(Landroid/view/animation/Animation;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/support/v4/app/k$e;


# direct methods
.method constructor <init>(Landroid/support/v4/app/k$e;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v4/app/k$e$a;->b:Landroid/support/v4/app/k$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object p0, p0, Landroid/support/v4/app/k$e$a;->b:Landroid/support/v4/app/k$e;

    iget-object p0, p0, Landroid/support/v4/app/k$e;->b:Landroid/view/View;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    return-void
.end method
