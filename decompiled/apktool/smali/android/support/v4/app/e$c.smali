.class Landroid/support/v4/app/e$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/arch/lifecycle/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v4/app/e;->b(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/support/v4/app/e;


# direct methods
.method constructor <init>(Landroid/support/v4/app/e;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v4/app/e$c;->b:Landroid/support/v4/app/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroid/arch/lifecycle/c;
    .locals 3

    iget-object v0, p0, Landroid/support/v4/app/e$c;->b:Landroid/support/v4/app/e;

    iget-object v1, v0, Landroid/support/v4/app/e;->U:Landroid/arch/lifecycle/f;

    if-nez v1, :cond_0

    new-instance v1, Landroid/arch/lifecycle/f;

    iget-object v2, v0, Landroid/support/v4/app/e;->V:Landroid/arch/lifecycle/e;

    invoke-direct {v1, v2}, Landroid/arch/lifecycle/f;-><init>(Landroid/arch/lifecycle/e;)V

    iput-object v1, v0, Landroid/support/v4/app/e;->U:Landroid/arch/lifecycle/f;

    :cond_0
    iget-object p0, p0, Landroid/support/v4/app/e$c;->b:Landroid/support/v4/app/e;

    iget-object p0, p0, Landroid/support/v4/app/e;->U:Landroid/arch/lifecycle/f;

    return-object p0
.end method
