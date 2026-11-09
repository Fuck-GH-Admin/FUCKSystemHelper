.class Landroid/support/v7/app/k$b;
.super Lb/b/c/g/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/app/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v7/app/k;


# direct methods
.method constructor <init>(Landroid/support/v7/app/k;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/app/k$b;->a:Landroid/support/v7/app/k;

    invoke-direct {p0}, Lb/b/c/g/w;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 0

    iget-object p0, p0, Landroid/support/v7/app/k$b;->a:Landroid/support/v7/app/k;

    const/4 p1, 0x0

    iput-object p1, p0, Landroid/support/v7/app/k;->v:Lb/b/d/d/h;

    iget-object p0, p0, Landroid/support/v7/app/k;->d:Landroid/support/v7/widget/ActionBarContainer;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->requestLayout()V

    return-void
.end method
