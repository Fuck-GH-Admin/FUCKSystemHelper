.class final Lb/b/c/d/b$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb/b/c/d/c$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/b/c/d/b;->a(Landroid/content/Context;Lb/b/c/d/a;Lb/b/c/a/d/f$a;Landroid/os/Handler;ZII)Landroid/graphics/Typeface;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lb/b/c/d/c$d<",
        "Lb/b/c/d/b$g;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lb/b/c/a/d/f$a;

.field final synthetic b:Landroid/os/Handler;


# direct methods
.method constructor <init>(Lb/b/c/a/d/f$a;Landroid/os/Handler;)V
    .locals 0

    iput-object p1, p0, Lb/b/c/d/b$b;->a:Lb/b/c/a/d/f$a;

    iput-object p2, p0, Lb/b/c/d/b$b;->b:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lb/b/c/d/b$g;)V
    .locals 1

    if-nez p1, :cond_0

    iget-object p1, p0, Lb/b/c/d/b$b;->a:Lb/b/c/a/d/f$a;

    const/4 v0, 0x1

    :goto_0
    iget-object p0, p0, Lb/b/c/d/b$b;->b:Landroid/os/Handler;

    invoke-virtual {p1, v0, p0}, Lb/b/c/a/d/f$a;->a(ILandroid/os/Handler;)V

    goto :goto_1

    :cond_0
    iget v0, p1, Lb/b/c/d/b$g;->b:I

    if-nez v0, :cond_1

    iget-object v0, p0, Lb/b/c/d/b$b;->a:Lb/b/c/a/d/f$a;

    iget-object p1, p1, Lb/b/c/d/b$g;->a:Landroid/graphics/Typeface;

    iget-object p0, p0, Lb/b/c/d/b$b;->b:Landroid/os/Handler;

    invoke-virtual {v0, p1, p0}, Lb/b/c/a/d/f$a;->a(Landroid/graphics/Typeface;Landroid/os/Handler;)V

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lb/b/c/d/b$b;->a:Lb/b/c/a/d/f$a;

    goto :goto_0

    :goto_1
    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lb/b/c/d/b$g;

    invoke-virtual {p0, p1}, Lb/b/c/d/b$b;->a(Lb/b/c/d/b$g;)V

    return-void
.end method
