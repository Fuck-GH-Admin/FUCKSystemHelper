.class Landroid/support/constraint/n/k/m/g;
.super Landroid/support/constraint/n/k/m/f;
.source ""


# instance fields
.field public m:I


# direct methods
.method public constructor <init>(Landroid/support/constraint/n/k/m/p;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/support/constraint/n/k/m/f;-><init>(Landroid/support/constraint/n/k/m/p;)V

    instance-of p1, p1, Landroid/support/constraint/n/k/m/l;

    if-eqz p1, :cond_0

    sget-object p1, Landroid/support/constraint/n/k/m/f$a;->c:Landroid/support/constraint/n/k/m/f$a;

    goto :goto_0

    :cond_0
    sget-object p1, Landroid/support/constraint/n/k/m/f$a;->d:Landroid/support/constraint/n/k/m/f$a;

    :goto_0
    iput-object p1, p0, Landroid/support/constraint/n/k/m/f;->e:Landroid/support/constraint/n/k/m/f$a;

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    iget-boolean v0, p0, Landroid/support/constraint/n/k/m/f;->j:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/constraint/n/k/m/f;->j:Z

    iput p1, p0, Landroid/support/constraint/n/k/m/f;->g:I

    iget-object p0, p0, Landroid/support/constraint/n/k/m/f;->k:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/support/constraint/n/k/m/d;

    invoke-interface {p1, p1}, Landroid/support/constraint/n/k/m/d;->a(Landroid/support/constraint/n/k/m/d;)V

    goto :goto_0

    :cond_1
    return-void
.end method
