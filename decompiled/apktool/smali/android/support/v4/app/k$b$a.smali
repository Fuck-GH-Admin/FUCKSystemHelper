.class Landroid/support/v4/app/k$b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v4/app/k$b;->onAnimationEnd(Landroid/view/animation/Animation;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/support/v4/app/k$b;


# direct methods
.method constructor <init>(Landroid/support/v4/app/k$b;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v4/app/k$b$a;->b:Landroid/support/v4/app/k$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    iget-object v0, p0, Landroid/support/v4/app/k$b$a;->b:Landroid/support/v4/app/k$b;

    iget-object v0, v0, Landroid/support/v4/app/k$b;->c:Landroid/support/v4/app/e;

    invoke-virtual {v0}, Landroid/support/v4/app/e;->g()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/app/k$b$a;->b:Landroid/support/v4/app/k$b;

    iget-object v0, v0, Landroid/support/v4/app/k$b;->c:Landroid/support/v4/app/e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v4/app/e;->a(Landroid/view/View;)V

    iget-object p0, p0, Landroid/support/v4/app/k$b$a;->b:Landroid/support/v4/app/k$b;

    iget-object v0, p0, Landroid/support/v4/app/k$b;->d:Landroid/support/v4/app/k;

    iget-object v1, p0, Landroid/support/v4/app/k$b;->c:Landroid/support/v4/app/e;

    invoke-virtual {v1}, Landroid/support/v4/app/e;->x()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/support/v4/app/k;->a(Landroid/support/v4/app/e;IIIZ)V

    :cond_0
    return-void
.end method
