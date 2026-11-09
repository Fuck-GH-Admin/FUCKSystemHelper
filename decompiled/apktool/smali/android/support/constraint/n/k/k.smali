.class public Landroid/support/constraint/n/k/k;
.super Landroid/support/constraint/n/k/i;
.source ""


# instance fields
.field private r0:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/support/constraint/n/k/i;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/constraint/n/k/k;->r0:Z

    new-instance p0, Landroid/support/constraint/n/k/m/b$a;

    invoke-direct {p0}, Landroid/support/constraint/n/k/m/b$a;-><init>()V

    return-void
.end method


# virtual methods
.method public R()V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Landroid/support/constraint/n/k/i;->q0:I

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Landroid/support/constraint/n/k/i;->p0:[Landroid/support/constraint/n/k/e;

    aget-object v1, v1, v0

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/support/constraint/n/k/e;->c(Z)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public S()Z
    .locals 0

    iget-boolean p0, p0, Landroid/support/constraint/n/k/k;->r0:Z

    return p0
.end method

.method public a(Landroid/support/constraint/n/k/f;)V
    .locals 0

    invoke-virtual {p0}, Landroid/support/constraint/n/k/k;->R()V

    return-void
.end method
