.class final Lb/b/c/g/q$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnApplyWindowInsetsListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/b/c/g/q;->a(Landroid/view/View;Lb/b/c/g/o;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb/b/c/g/o;


# direct methods
.method constructor <init>(Lb/b/c/g/o;)V
    .locals 0

    iput-object p1, p0, Lb/b/c/g/q$a;->a:Lb/b/c/g/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 0

    invoke-static {p2}, Lb/b/c/g/y;->a(Ljava/lang/Object;)Lb/b/c/g/y;

    move-result-object p2

    iget-object p0, p0, Lb/b/c/g/q$a;->a:Lb/b/c/g/o;

    invoke-interface {p0, p1, p2}, Lb/b/c/g/o;->a(Landroid/view/View;Lb/b/c/g/y;)Lb/b/c/g/y;

    move-result-object p0

    invoke-static {p0}, Lb/b/c/g/y;->a(Lb/b/c/g/y;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/WindowInsets;

    return-object p0
.end method
