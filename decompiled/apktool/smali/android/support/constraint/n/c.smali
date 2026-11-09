.class public Landroid/support/constraint/n/c;
.super Ljava/lang/Object;
.source ""


# instance fields
.field a:Landroid/support/constraint/n/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/constraint/n/f<",
            "Landroid/support/constraint/n/b;",
            ">;"
        }
    .end annotation
.end field

.field b:Landroid/support/constraint/n/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/constraint/n/f<",
            "Landroid/support/constraint/n/b;",
            ">;"
        }
    .end annotation
.end field

.field c:Landroid/support/constraint/n/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/constraint/n/f<",
            "Landroid/support/constraint/n/i;",
            ">;"
        }
    .end annotation
.end field

.field d:[Landroid/support/constraint/n/i;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/support/constraint/n/g;

    const/16 v1, 0x100

    invoke-direct {v0, v1}, Landroid/support/constraint/n/g;-><init>(I)V

    iput-object v0, p0, Landroid/support/constraint/n/c;->a:Landroid/support/constraint/n/f;

    new-instance v0, Landroid/support/constraint/n/g;

    invoke-direct {v0, v1}, Landroid/support/constraint/n/g;-><init>(I)V

    iput-object v0, p0, Landroid/support/constraint/n/c;->b:Landroid/support/constraint/n/f;

    new-instance v0, Landroid/support/constraint/n/g;

    invoke-direct {v0, v1}, Landroid/support/constraint/n/g;-><init>(I)V

    iput-object v0, p0, Landroid/support/constraint/n/c;->c:Landroid/support/constraint/n/f;

    const/16 v0, 0x20

    new-array v0, v0, [Landroid/support/constraint/n/i;

    iput-object v0, p0, Landroid/support/constraint/n/c;->d:[Landroid/support/constraint/n/i;

    return-void
.end method
