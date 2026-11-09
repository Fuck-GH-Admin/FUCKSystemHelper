.class Landroid/support/v7/view/menu/e$d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/view/menu/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation


# instance fields
.field public final a:Landroid/support/v7/widget/j0;

.field public final b:Landroid/support/v7/view/menu/h;

.field public final c:I


# direct methods
.method public constructor <init>(Landroid/support/v7/widget/j0;Landroid/support/v7/view/menu/h;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroid/support/v7/view/menu/e$d;->a:Landroid/support/v7/widget/j0;

    iput-object p2, p0, Landroid/support/v7/view/menu/e$d;->b:Landroid/support/v7/view/menu/h;

    iput p3, p0, Landroid/support/v7/view/menu/e$d;->c:I

    return-void
.end method


# virtual methods
.method public a()Landroid/widget/ListView;
    .locals 0

    iget-object p0, p0, Landroid/support/v7/view/menu/e$d;->a:Landroid/support/v7/widget/j0;

    invoke-virtual {p0}, Landroid/support/v7/widget/h0;->b()Landroid/widget/ListView;

    move-result-object p0

    return-object p0
.end method
