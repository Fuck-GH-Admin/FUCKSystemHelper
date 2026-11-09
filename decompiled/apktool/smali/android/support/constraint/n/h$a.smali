.class Landroid/support/constraint/n/h$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/constraint/n/h;->e(Landroid/support/constraint/n/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Landroid/support/constraint/n/i;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Landroid/support/constraint/n/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;)I
    .locals 0

    iget p0, p1, Landroid/support/constraint/n/i;->c:I

    iget p1, p2, Landroid/support/constraint/n/i;->c:I

    sub-int/2addr p0, p1

    return p0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Landroid/support/constraint/n/i;

    check-cast p2, Landroid/support/constraint/n/i;

    invoke-virtual {p0, p1, p2}, Landroid/support/constraint/n/h$a;->a(Landroid/support/constraint/n/i;Landroid/support/constraint/n/i;)I

    move-result p0

    return p0
.end method
