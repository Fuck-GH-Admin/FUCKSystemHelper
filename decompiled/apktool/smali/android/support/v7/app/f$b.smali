.class Landroid/support/v7/app/f$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/app/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/support/v7/app/f;


# direct methods
.method constructor <init>(Landroid/support/v7/app/f;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/app/f$b;->b:Landroid/support/v7/app/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Landroid/support/v7/app/f$b;->b:Landroid/support/v7/app/f;

    iget v1, v0, Landroid/support/v7/app/f;->N:I

    and-int/lit8 v1, v1, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v0, v2}, Landroid/support/v7/app/f;->e(I)V

    :cond_0
    iget-object v0, p0, Landroid/support/v7/app/f$b;->b:Landroid/support/v7/app/f;

    iget v1, v0, Landroid/support/v7/app/f;->N:I

    and-int/lit16 v1, v1, 0x1000

    if-eqz v1, :cond_1

    const/16 v1, 0x6c

    invoke-virtual {v0, v1}, Landroid/support/v7/app/f;->e(I)V

    :cond_1
    iget-object p0, p0, Landroid/support/v7/app/f$b;->b:Landroid/support/v7/app/f;

    iput-boolean v2, p0, Landroid/support/v7/app/f;->M:Z

    iput v2, p0, Landroid/support/v7/app/f;->N:I

    return-void
.end method
