.class Landroid/support/constraint/n/d$b;
.super Landroid/support/constraint/n/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/constraint/n/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# direct methods
.method public constructor <init>(Landroid/support/constraint/n/d;Landroid/support/constraint/n/c;)V
    .locals 0

    invoke-direct {p0}, Landroid/support/constraint/n/b;-><init>()V

    new-instance p1, Landroid/support/constraint/n/j;

    invoke-direct {p1, p0, p2}, Landroid/support/constraint/n/j;-><init>(Landroid/support/constraint/n/b;Landroid/support/constraint/n/c;)V

    iput-object p1, p0, Landroid/support/constraint/n/b;->e:Landroid/support/constraint/n/b$a;

    return-void
.end method
