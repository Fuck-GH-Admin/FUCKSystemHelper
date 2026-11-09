.class Landroid/support/v7/widget/m0$b;
.super Landroid/widget/BaseAdapter;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/widget/m0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic b:Landroid/support/v7/widget/m0;


# direct methods
.method constructor <init>(Landroid/support/v7/widget/m0;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/widget/m0$b;->b:Landroid/support/v7/widget/m0;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 0

    iget-object p0, p0, Landroid/support/v7/widget/m0$b;->b:Landroid/support/v7/widget/m0;

    iget-object p0, p0, Landroid/support/v7/widget/m0;->d:Landroid/support/v7/widget/g0;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p0

    return p0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Landroid/support/v7/widget/m0$b;->b:Landroid/support/v7/widget/m0;

    iget-object p0, p0, Landroid/support/v7/widget/m0;->d:Landroid/support/v7/widget/g0;

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/support/v7/widget/m0$d;

    invoke-virtual {p0}, Landroid/support/v7/widget/m0$d;->a()Landroid/support/v7/app/a$c;

    move-result-object p0

    return-object p0
.end method

.method public getItemId(I)J
    .locals 0

    int-to-long p0, p1

    return-wide p0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 0

    if-nez p2, :cond_0

    iget-object p2, p0, Landroid/support/v7/widget/m0$b;->b:Landroid/support/v7/widget/m0;

    invoke-virtual {p0, p1}, Landroid/support/v7/widget/m0$b;->getItem(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/support/v7/app/a$c;

    const/4 p1, 0x1

    invoke-virtual {p2, p0, p1}, Landroid/support/v7/widget/m0;->a(Landroid/support/v7/app/a$c;Z)Landroid/support/v7/widget/m0$d;

    move-result-object p2

    goto :goto_0

    :cond_0
    move-object p3, p2

    check-cast p3, Landroid/support/v7/widget/m0$d;

    invoke-virtual {p0, p1}, Landroid/support/v7/widget/m0$b;->getItem(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/support/v7/app/a$c;

    invoke-virtual {p3, p0}, Landroid/support/v7/widget/m0$d;->a(Landroid/support/v7/app/a$c;)V

    :goto_0
    return-object p2
.end method
