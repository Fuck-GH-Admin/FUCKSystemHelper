.class Landroid/support/v7/app/f$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb/b/c/g/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v7/app/f;->u()Landroid/view/ViewGroup;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v7/app/f;


# direct methods
.method constructor <init>(Landroid/support/v7/app/f;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/app/f$c;->a:Landroid/support/v7/app/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;Lb/b/c/g/y;)Lb/b/c/g/y;
    .locals 3

    invoke-virtual {p2}, Lb/b/c/g/y;->d()I

    move-result v0

    iget-object p0, p0, Landroid/support/v7/app/f$c;->a:Landroid/support/v7/app/f;

    invoke-virtual {p0, v0}, Landroid/support/v7/app/f;->i(I)I

    move-result p0

    if-eq v0, p0, :cond_0

    invoke-virtual {p2}, Lb/b/c/g/y;->b()I

    move-result v0

    invoke-virtual {p2}, Lb/b/c/g/y;->c()I

    move-result v1

    invoke-virtual {p2}, Lb/b/c/g/y;->a()I

    move-result v2

    invoke-virtual {p2, v0, p0, v1, v2}, Lb/b/c/g/y;->a(IIII)Lb/b/c/g/y;

    move-result-object p2

    :cond_0
    invoke-static {p1, p2}, Lb/b/c/g/q;->a(Landroid/view/View;Lb/b/c/g/y;)Lb/b/c/g/y;

    move-result-object p0

    return-object p0
.end method
