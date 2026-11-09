.class final Lb/b/c/d/b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


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
        "Ljava/util/concurrent/Callable<",
        "Lb/b/c/d/b$g;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lb/b/c/d/a;

.field final synthetic c:I

.field final synthetic d:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/content/Context;Lb/b/c/d/a;ILjava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lb/b/c/d/b$a;->a:Landroid/content/Context;

    iput-object p2, p0, Lb/b/c/d/b$a;->b:Lb/b/c/d/a;

    iput p3, p0, Lb/b/c/d/b$a;->c:I

    iput-object p4, p0, Lb/b/c/d/b$a;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public call()Lb/b/c/d/b$g;
    .locals 3

    iget-object v0, p0, Lb/b/c/d/b$a;->a:Landroid/content/Context;

    iget-object v1, p0, Lb/b/c/d/b$a;->b:Lb/b/c/d/a;

    iget v2, p0, Lb/b/c/d/b$a;->c:I

    invoke-static {v0, v1, v2}, Lb/b/c/d/b;->a(Landroid/content/Context;Lb/b/c/d/a;I)Lb/b/c/d/b$g;

    move-result-object v0

    iget-object v1, v0, Lb/b/c/d/b$g;->a:Landroid/graphics/Typeface;

    if-eqz v1, :cond_0

    sget-object v2, Lb/b/c/d/b;->a:Lb/b/c/f/g;

    iget-object p0, p0, Lb/b/c/d/b$a;->d:Ljava/lang/String;

    invoke-virtual {v2, p0, v1}, Lb/b/c/f/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0}, Lb/b/c/d/b$a;->call()Lb/b/c/d/b$g;

    move-result-object p0

    return-object p0
.end method
